package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.TextWatcher;
import android.transition.ChangeBounds;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import me.vkryl.android.AnimatorUtils;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.FiltersView;

public class FragmentSearchField extends FrameLayout implements FactorAnimator.Target {
    private final BoolAnimator animatorCloseIconVisible;
    private final FactorAnimator animatorSearchFiltersWidth;
    private final BoolAnimator animatorSearchIconVisible;
    private Drawable bg;
    private float clipHeight;
    private boolean closeButtonForcedVisible;
    private final ImageView closeIcon;
    private final ArrayList currentSearchFilters;
    public final EditTextBoldCursor editText;
    private final AnimationNotificationsLocker notificationsLocker;
    private Runnable onCloseSearch;
    private final Theme.ResourcesProvider resourcesProvider;
    private final LinearLayout searchFilterLayout;
    private SearchFiltersListener searchFiltersListener;
    private final ImageView searchIcon;
    private int selectedFilterIndex;

    public interface SearchFiltersListener {
        void hideActionMode();

        void onSearchFilterCleared(FiltersView.MediaFilterData mediaFilterData);
    }

    @Override
    public void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
        FactorAnimator.Target.CC.$default$onFactorChangeFinished(this, i, f, factorAnimator);
    }

    public FragmentSearchField(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.animatorCloseIconVisible = new BoolAnimator(0, this, cubicBezierInterpolator, 380L, false);
        this.animatorSearchIconVisible = new BoolAnimator(1, this, cubicBezierInterpolator, 380L, true);
        this.animatorSearchFiltersWidth = new FactorAnimator(2, this, AnimatorUtils.DECELERATE_INTERPOLATOR, 280L);
        this.clipHeight = 1.0f;
        this.notificationsLocker = new AnimationNotificationsLocker();
        this.currentSearchFilters = new ArrayList();
        this.resourcesProvider = resourcesProvider;
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context) {
            @Override
            protected void onMeasure(int i, int i2) {
                super.onMeasure(i, i2);
                setPivotX(getPaddingLeft());
                setPivotY(getMeasuredHeight() / 2.0f);
            }

            @Override
            public boolean onKeyDown(int i, KeyEvent keyEvent) {
                if (i == 67 && FragmentSearchField.this.editText.length() == 0 && FragmentSearchField.this.hasRemovableFilters()) {
                    if (FragmentSearchField.this.hasRemovableFilters()) {
                        FiltersView.MediaFilterData mediaFilterData = (FiltersView.MediaFilterData) FragmentSearchField.this.currentSearchFilters.get(FragmentSearchField.this.currentSearchFilters.size() - 1);
                        if (FragmentSearchField.this.searchFiltersListener != null) {
                            FragmentSearchField.this.searchFiltersListener.onSearchFilterCleared(mediaFilterData);
                        }
                        FragmentSearchField.this.removeSearchFilter(mediaFilterData);
                    }
                    return true;
                }
                return super.onKeyDown(i, keyEvent);
            }
        };
        this.editText = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 15.0f);
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setInputType(655536);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setVerticalScrollBarEnabled(false);
        editTextBoldCursor.setHorizontalScrollBarEnabled(false);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f), 0);
        editTextBoldCursor.setClipToPadding(true);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        editTextBoldCursor.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (!FragmentSearchField.this.currentSearchFilters.isEmpty() && editable.length() > 0 && FragmentSearchField.this.selectedFilterIndex >= 0) {
                    FragmentSearchField.this.selectedFilterIndex = -1;
                    FragmentSearchField.this.onFiltersChanged();
                }
                FragmentSearchField.this.checkCloseButtonVisible();
            }
        });
        if (Build.VERSION.SDK_INT >= 35) {
            editTextBoldCursor.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        addView(editTextBoldCursor, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.searchIcon = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.outline_search_1_24);
        addView(imageView, LayoutHelper.createFrame(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.closeIcon = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.miniplayer_close);
        imageView2.setVisibility(8);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$new$0(view);
            }
        });
        addView(imageView2, LayoutHelper.createFrame(24, 24.0f, (LocaleController.isRTL ? 3 : 5) | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(getContext()) {
            @Override
            protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
                FragmentSearchField.this.animatorSearchFiltersWidth.animateTo(getMeasuredWidth());
                super.onLayout(z, i, i2, i3, i4);
            }
        };
        this.searchFilterLayout = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setVisibility(0);
        addView(linearLayout, LayoutHelper.createFrame(-2, 32.0f, (LocaleController.isRTL ? 5 : 3) | 16, 4.0f, 0.0f, 4.0f, 0.0f));
        setWillNotDraw(false);
        checkUi_editTextPaddings();
        updateColors();
    }

    public void lambda$new$0(View view) {
        if (hasRemovableFilters()) {
            SearchFiltersListener searchFiltersListener = this.searchFiltersListener;
            if (searchFiltersListener != null) {
                searchFiltersListener.hideActionMode();
            }
            for (int i = 0; i < this.currentSearchFilters.size(); i++) {
                if (this.searchFiltersListener != null && ((FiltersView.MediaFilterData) this.currentSearchFilters.get(i)).removable) {
                    this.searchFiltersListener.onSearchFilterCleared((FiltersView.MediaFilterData) this.currentSearchFilters.get(i));
                }
            }
            clearSearchFilters();
            return;
        }
        Runnable runnable = this.onCloseSearch;
        if (runnable != null) {
            runnable.run();
        } else {
            this.editText.getText().clear();
        }
    }

    public void setClipHeight(float f) {
        if (Math.abs(this.clipHeight - f) < 0.01f) {
            return;
        }
        this.clipHeight = f;
        invalidate();
        float fLerp = AndroidUtilities.lerp(0.75f, 1.0f, this.clipHeight);
        this.editText.setScaleX(fLerp);
        this.editText.setScaleY(fLerp);
        this.searchIcon.setScaleX(fLerp);
        this.searchIcon.setScaleY(fLerp);
        this.closeIcon.setScaleX(fLerp);
        this.closeIcon.setScaleY(fLerp);
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        canvas.save();
        Drawable drawable = this.bg;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), (int) (getHeight() * this.clipHeight));
            this.bg.draw(canvas);
        }
        if (this.clipHeight < 1.0f) {
            canvas.clipRect(0.0f, 0.0f, getWidth(), getHeight() * this.clipHeight);
            canvas.translate(0.0f, ((-getHeight()) * (1.0f - this.clipHeight)) / 2.0f);
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        checkUi_editTextPaddings();
    }

    private void checkUi_editTextPaddings() {
        int factor = ((int) this.animatorSearchFiltersWidth.getFactor()) + AndroidUtilities.dp(6.0f);
        int iDp = LocaleController.isRTL ? AndroidUtilities.dp(48.0f) : Math.max(factor, AndroidUtilities.dp(48.0f));
        int iMax = LocaleController.isRTL ? Math.max(factor, AndroidUtilities.dp(48.0f)) : AndroidUtilities.dp(48.0f);
        android.graphics.Rect rect = AndroidUtilities.rectTmp2;
        rect.set(iDp, 0, this.editText.getMeasuredWidth() - iMax, this.editText.getMeasuredHeight());
        this.editText.setClipBounds(rect);
        this.editText.setPadding(iDp, 0, iMax, 0);
    }

    public void updateColors() {
        int iDp = AndroidUtilities.dp(20.0f);
        int i = Theme.key_windowBackgroundWhiteBlackText;
        this.bg = Theme.createRoundRectDrawable(iDp, getThemedColor(i, 0.05f));
        ImageView imageView = this.searchIcon;
        int themedColor = getThemedColor(i, 0.6f);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(themedColor, mode);
        this.closeIcon.setColorFilter(getThemedColor(i, 0.6f), mode);
        this.closeIcon.setBackground(Theme.createSelectorDrawable(getThemedColor(Theme.key_listSelector), 5, AndroidUtilities.dp(12.0f)));
        this.editText.setHintTextColor(getThemedColor(i, 0.5f));
        this.editText.setTextColor(getThemedColor(i));
        this.editText.setCursorColor(getThemedColor(Theme.key_groupcreate_cursor));
        for (int i2 = 0; i2 < this.searchFilterLayout.getChildCount(); i2++) {
            if (this.searchFilterLayout.getChildAt(i2) instanceof ActionBarMenuItem.SearchFilterView) {
                ((ActionBarMenuItem.SearchFilterView) this.searchFilterLayout.getChildAt(i2)).updateColors();
            }
        }
        invalidate();
    }

    private int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }

    private int getThemedColor(int i, float f) {
        return Theme.multAlpha(getThemedColor(i), f);
    }

    public void setCloseButtonOnClickListener(Runnable runnable) {
        this.onCloseSearch = runnable;
    }

    public void setCloseButtonVisible(boolean z) {
        this.closeButtonForcedVisible = z;
        checkCloseButtonVisible();
    }

    public void checkCloseButtonVisible() {
        this.animatorCloseIconVisible.setValue(this.closeButtonForcedVisible || this.editText.length() > 0, true);
    }

    @Override
    public void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        if (i == 0) {
            FragmentFloatingButton.setAnimatedVisibility(this.closeIcon, f);
            this.closeIcon.setRotation((1.0f - f) * 90.0f);
        } else if (i == 1) {
            FragmentFloatingButton.setAnimatedVisibility(this.searchIcon, f);
        } else if (i == 2) {
            checkUi_editTextPaddings();
        }
    }

    public boolean hasRemovableFilters() {
        if (this.currentSearchFilters.isEmpty()) {
            return false;
        }
        for (int i = 0; i < this.currentSearchFilters.size(); i++) {
            if (((FiltersView.MediaFilterData) this.currentSearchFilters.get(i)).removable) {
                return true;
            }
        }
        return false;
    }

    public void setSearchFiltersListener(SearchFiltersListener searchFiltersListener) {
        this.searchFiltersListener = searchFiltersListener;
    }

    public void addSearchFilter(FiltersView.MediaFilterData mediaFilterData) {
        this.currentSearchFilters.add(mediaFilterData);
        this.selectedFilterIndex = this.currentSearchFilters.size() - 1;
        onFiltersChanged();
    }

    public void removeSearchFilter(FiltersView.MediaFilterData mediaFilterData) {
        if (mediaFilterData.removable) {
            this.currentSearchFilters.remove(mediaFilterData);
            int i = this.selectedFilterIndex;
            if (i < 0 || i > this.currentSearchFilters.size() - 1) {
                this.selectedFilterIndex = this.currentSearchFilters.size() - 1;
            }
            onFiltersChanged();
            SearchFiltersListener searchFiltersListener = this.searchFiltersListener;
            if (searchFiltersListener != null) {
                searchFiltersListener.hideActionMode();
            }
        }
    }

    public void clearSearchFiltersWithCallback() {
        if (this.currentSearchFilters.isEmpty() || this.searchFiltersListener == null) {
            return;
        }
        for (int i = 0; i < this.currentSearchFilters.size(); i++) {
            if (((FiltersView.MediaFilterData) this.currentSearchFilters.get(i)).removable) {
                this.searchFiltersListener.onSearchFilterCleared((FiltersView.MediaFilterData) this.currentSearchFilters.get(i));
            }
        }
    }

    public void clearSearchFilters() {
        int i = 0;
        while (i < this.currentSearchFilters.size()) {
            if (((FiltersView.MediaFilterData) this.currentSearchFilters.get(i)).removable) {
                this.currentSearchFilters.remove(i);
                i--;
            }
            i++;
        }
        onFiltersChanged();
    }

    public void onFiltersChanged() {
        final ActionBarMenuItem.SearchFilterView searchFilterView;
        boolean zIsEmpty = this.currentSearchFilters.isEmpty();
        this.animatorSearchIconVisible.setValue(zIsEmpty, true);
        ArrayList arrayList = new ArrayList(this.currentSearchFilters);
        TransitionSet transitionSet = new TransitionSet();
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setDuration(150L);
        transitionSet.addTransition(new Visibility() {
            @Override
            public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
                if (view instanceof ActionBarMenuItem.SearchFilterView) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 0.5f, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 0.5f, 1.0f));
                    animatorSet.setInterpolator(CubicBezierInterpolator.DEFAULT);
                    return animatorSet;
                }
                return ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
            }

            @Override
            public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
                if (view instanceof ActionBarMenuItem.SearchFilterView) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, view.getScaleX(), 0.5f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, view.getScaleX(), 0.5f));
                    animatorSet.setInterpolator(CubicBezierInterpolator.DEFAULT);
                    return animatorSet;
                }
                return ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
            }
        }.setDuration(150L)).addTransition(changeBounds);
        transitionSet.setOrdering(0);
        transitionSet.setInterpolator((TimeInterpolator) CubicBezierInterpolator.EASE_OUT);
        transitionSet.addListener(new Transition.TransitionListener() {
            @Override
            public void onTransitionPause(Transition transition) {
            }

            @Override
            public void onTransitionResume(Transition transition) {
            }

            @Override
            public void onTransitionStart(Transition transition) {
                FragmentSearchField.this.notificationsLocker.lock();
            }

            @Override
            public void onTransitionEnd(Transition transition) {
                FragmentSearchField.this.notificationsLocker.unlock();
            }

            @Override
            public void onTransitionCancel(Transition transition) {
                FragmentSearchField.this.notificationsLocker.unlock();
            }
        });
        TransitionManager.beginDelayedTransition(this.searchFilterLayout, transitionSet);
        int i = 0;
        while (i < this.searchFilterLayout.getChildCount()) {
            if (!arrayList.remove(((ActionBarMenuItem.SearchFilterView) this.searchFilterLayout.getChildAt(i)).getFilter())) {
                this.searchFilterLayout.removeViewAt(i);
                i--;
            }
            i++;
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            FiltersView.MediaFilterData mediaFilterData = (FiltersView.MediaFilterData) arrayList.get(i2);
            if (mediaFilterData.reaction != null) {
                searchFilterView = new ActionBarMenuItem.ReactionFilterView(getContext(), this.resourcesProvider, true);
            } else {
                searchFilterView = new ActionBarMenuItem.SearchFilterView(getContext(), this.resourcesProvider, true);
            }
            searchFilterView.setData(mediaFilterData);
            searchFilterView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$onFiltersChanged$1(searchFilterView, view);
                }
            });
            LinearLayout linearLayout = this.searchFilterLayout;
            boolean z = LocaleController.isRTL;
            linearLayout.addView(searchFilterView, LayoutHelper.createLinear(-2, -1, 0, z ? 6 : 0, 0, z ? 0 : 6, 0));
        }
        int i3 = 0;
        while (i3 < this.searchFilterLayout.getChildCount()) {
            ((ActionBarMenuItem.SearchFilterView) this.searchFilterLayout.getChildAt(i3)).setExpanded(i3 == this.selectedFilterIndex);
            i3++;
        }
        this.searchFilterLayout.setTag(!zIsEmpty ? 1 : null);
    }

    public void lambda$onFiltersChanged$1(ActionBarMenuItem.SearchFilterView searchFilterView, View view) {
        int iIndexOf = this.currentSearchFilters.indexOf(searchFilterView.getFilter());
        if (this.selectedFilterIndex != iIndexOf) {
            this.selectedFilterIndex = iIndexOf;
            onFiltersChanged();
            return;
        }
        if (searchFilterView.getFilter().removable) {
            if (!searchFilterView.isSelectedForDelete()) {
                searchFilterView.setSelectedForDelete(true);
                return;
            }
            FiltersView.MediaFilterData filter = searchFilterView.getFilter();
            removeSearchFilter(filter);
            SearchFiltersListener searchFiltersListener = this.searchFiltersListener;
            if (searchFiltersListener != null) {
                searchFiltersListener.onSearchFilterCleared(filter);
            }
        }
    }
}
