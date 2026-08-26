package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.ChangeBounds;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
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
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.ChatActivity$16$$ExternalSyntheticLambda4;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProxySettingsActivity;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.VoIPFragment;

public class FragmentSearchField extends FrameLayout implements FactorAnimator.Target, Theme.Colorable {
    public final LinearLayout additionalIconsLayout;
    public final BoolAnimator animatorCloseIconVisible;
    public final FactorAnimator animatorSearchFiltersWidth;
    public final BoolAnimator animatorSearchIconVisible;
    public Drawable bg;
    public BlurredBackgroundDrawable blurredBackgroundDrawable;
    public boolean closeButtonForcedVisible;
    public final ImageView closeIcon;
    public final ArrayList currentSearchFilters;
    public final UsersSelectActivity.AnonymousClass4 editText;
    public boolean isSectionBackground;
    public boolean isWhiteBackground;
    public final AnimationNotificationsLocker notificationsLocker;
    public Runnable onCloseSearch;
    public final Theme.ResourcesProvider resourcesProvider;
    public final PhotoViewer.AnonymousClass35 searchFilterLayout;
    public SearchFiltersListener searchFiltersListener;
    public final ImageView searchIcon;
    public int selectedFilterIndex;

    public interface SearchFiltersListener {
    }

    public FragmentSearchField(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.animatorCloseIconVisible = new BoolAnimator(0, this, cubicBezierInterpolator, 380L, false);
        this.animatorSearchIconVisible = new BoolAnimator(1, this, cubicBezierInterpolator, 380L, true);
        this.animatorSearchFiltersWidth = new FactorAnimator(2, this, AnimatorUtils.DECELERATE_INTERPOLATOR, 280L);
        this.notificationsLocker = new AnimationNotificationsLocker();
        this.currentSearchFilters = new ArrayList();
        this.resourcesProvider = resourcesProvider;
        UsersSelectActivity.AnonymousClass4 anonymousClass4 = new UsersSelectActivity.AnonymousClass4(this, context, 3);
        this.editText = anonymousClass4;
        anonymousClass4.setTextSize(1, 15.0f);
        anonymousClass4.setCursorWidth(1.5f);
        anonymousClass4.setInputType(anonymousClass4.getInputType() | 176);
        anonymousClass4.setSingleLine(true);
        anonymousClass4.setBackground(null);
        anonymousClass4.setVerticalScrollBarEnabled(false);
        anonymousClass4.setHorizontalScrollBarEnabled(false);
        anonymousClass4.setPadding(AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f), 0);
        anonymousClass4.setClipToPadding(true);
        anonymousClass4.setImeOptions(268435459);
        anonymousClass4.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        anonymousClass4.addTextChangedListener(new ArticleViewer.AnonymousClass16(this, 13));
        if (Build.VERSION.SDK_INT >= 35) {
            anonymousClass4.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        addView(anonymousClass4, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.searchIcon = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.outline_search_1_24);
        addView(imageView, LayoutHelper.createFrame(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.additionalIconsLayout = linearLayout;
        linearLayout.setOrientation(0);
        addView(linearLayout, LayoutHelper.createFrame(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 16, 32.0f, 0.0f, 32.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.closeIcon = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.miniplayer_close);
        imageView2.setVisibility(8);
        imageView2.setOnClickListener(new ChatActivity$16$$ExternalSyntheticLambda4(this, 20));
        addView(imageView2, LayoutHelper.createFrame(24, 24.0f, (LocaleController.isRTL ? 3 : 5) | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        PhotoViewer.AnonymousClass35 anonymousClass35 = new PhotoViewer.AnonymousClass35(this, getContext(), 5);
        this.searchFilterLayout = anonymousClass35;
        anonymousClass35.setOrientation(0);
        anonymousClass35.setVisibility(0);
        addView(anonymousClass35, LayoutHelper.createFrame(-2, 32.0f, (LocaleController.isRTL ? 5 : 3) | 16, 4.0f, 0.0f, 4.0f, 0.0f));
        setWillNotDraw(false);
        checkUi_editTextPaddings();
        updateColors$1();
    }

    public final void addAdditionalIcon(ActionBarMenuItem actionBarMenuItem) {
        this.additionalIconsLayout.addView(actionBarMenuItem);
    }

    public final void checkUi_editTextPaddings() {
        int iMax = Math.max(AndroidUtilities.dp(6.0f) + ((int) this.animatorSearchFiltersWidth.factor), AndroidUtilities.dp(48.0f));
        int measuredWidth = this.additionalIconsLayout.getMeasuredWidth() + AndroidUtilities.dp(48.0f);
        boolean z = LocaleController.isRTL;
        int i = z ? measuredWidth : iMax;
        if (!z) {
            iMax = measuredWidth;
        }
        Rect rect = AndroidUtilities.rectTmp2;
        UsersSelectActivity.AnonymousClass4 anonymousClass4 = this.editText;
        rect.set(i, 0, anonymousClass4.getMeasuredWidth() - iMax, anonymousClass4.getMeasuredHeight());
        anonymousClass4.setClipBounds(rect);
        anonymousClass4.setPadding(i, 0, iMax, 0);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        Drawable drawable = this.bg;
        if (drawable != null) {
            drawable.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            this.bg.draw(canvas);
        }
        BlurredBackgroundDrawable blurredBackgroundDrawable = this.blurredBackgroundDrawable;
        if (blurredBackgroundDrawable != null) {
            blurredBackgroundDrawable.setBounds(getPaddingLeft() - AndroidUtilities.dp(4.0f), getPaddingTop() - AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + (getWidth() - getPaddingRight()), AndroidUtilities.dp(4.0f) + (getHeight() - getPaddingBottom()));
            this.blurredBackgroundDrawable.draw(canvas);
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public int[] getColorKeys() {
        return null;
    }

    public final boolean hasRemovableFilters() {
        ArrayList arrayList = this.currentSearchFilters;
        if (!arrayList.isEmpty()) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (((FiltersView.MediaFilterData) arrayList.get(i)).removable) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void onFactorChangeFinished(float f, int i) {
    }

    @Override
    public final void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        if (i == 0) {
            ImageView imageView = this.closeIcon;
            FragmentFloatingButton.setAnimatedVisibility(imageView, f);
            imageView.setRotation((1.0f - f) * 90.0f);
        } else if (i == 1) {
            FragmentFloatingButton.setAnimatedVisibility(this.searchIcon, f);
        } else if (i == 2) {
            checkUi_editTextPaddings();
        }
    }

    public final void onFiltersChanged() {
        ArrayList arrayList = this.currentSearchFilters;
        boolean zIsEmpty = arrayList.isEmpty();
        this.animatorSearchIconVisible.setValue(zIsEmpty, true);
        ArrayList arrayList2 = new ArrayList(arrayList);
        TransitionSet transitionSet = new TransitionSet();
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setDuration(150L);
        transitionSet.addTransition(new VoIPFragment.AnonymousClass23(2).setDuration(150L)).addTransition(changeBounds);
        transitionSet.setOrdering(0);
        transitionSet.setInterpolator((TimeInterpolator) CubicBezierInterpolator.EASE_OUT);
        transitionSet.addListener((Transition.TransitionListener) new ProxySettingsActivity.AnonymousClass4(this, 1));
        PhotoViewer.AnonymousClass35 anonymousClass35 = this.searchFilterLayout;
        TransitionManager.beginDelayedTransition(anonymousClass35, transitionSet);
        int i = 0;
        while (i < anonymousClass35.getChildCount()) {
            if (!arrayList2.remove(((ActionBarMenuItem.SearchFilterView) anonymousClass35.getChildAt(i)).getFilter())) {
                anonymousClass35.removeViewAt(i);
                i--;
            }
            i++;
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            FiltersView.MediaFilterData mediaFilterData = (FiltersView.MediaFilterData) arrayList2.get(i2);
            mediaFilterData.getClass();
            ActionBarMenuItem.SearchFilterView searchFilterView = new ActionBarMenuItem.SearchFilterView(getContext(), this.resourcesProvider);
            searchFilterView.glass = true;
            searchFilterView.updateColors$1();
            searchFilterView.setData(mediaFilterData);
            searchFilterView.setOnClickListener(new ItemOptions$$ExternalSyntheticLambda7(26, this, searchFilterView));
            boolean z = LocaleController.isRTL;
            anonymousClass35.addView(searchFilterView, LayoutHelper.createLinear(-2, -1, 0, z ? 6 : 0, 0, z ? 0 : 6, 0));
        }
        int i3 = 0;
        while (i3 < anonymousClass35.getChildCount()) {
            ((ActionBarMenuItem.SearchFilterView) anonymousClass35.getChildAt(i3)).setExpanded(i3 == this.selectedFilterIndex);
            i3++;
        }
        anonymousClass35.setTag(!zIsEmpty ? 1 : null);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        checkUi_editTextPaddings();
    }

    public final void removeSearchFilter(FiltersView.MediaFilterData mediaFilterData) {
        DialogsActivity.AnonymousClass47 anonymousClass47;
        if (mediaFilterData.removable) {
            ArrayList arrayList = this.currentSearchFilters;
            arrayList.remove(mediaFilterData);
            int i = this.selectedFilterIndex;
            if (i < 0 || i > arrayList.size() - 1) {
                this.selectedFilterIndex = arrayList.size() - 1;
            }
            onFiltersChanged();
            SearchFiltersListener searchFiltersListener = this.searchFiltersListener;
            if (searchFiltersListener == null || (anonymousClass47 = DialogsActivity.this.searchViewPager) == null) {
                return;
            }
            anonymousClass47.showActionMode(false);
        }
    }

    public void setBlurredBackgroundVisibility(float f) {
        boolean z;
        int i;
        int i2 = (int) (f * 255.0f);
        BlurredBackgroundDrawable blurredBackgroundDrawable = this.blurredBackgroundDrawable;
        boolean z2 = true;
        if (blurredBackgroundDrawable == null || blurredBackgroundDrawable.alpha == i2) {
            z = false;
        } else {
            blurredBackgroundDrawable.setAlpha(i2);
            z = true;
        }
        Drawable drawable = this.bg;
        if (drawable == null || drawable.getAlpha() == (i = 255 - i2)) {
            z2 = z;
        } else {
            this.bg.setAlpha(i);
        }
        if (z2) {
            invalidate();
        }
    }

    public void setCloseButtonOnClickListener(Runnable runnable) {
        this.onCloseSearch = runnable;
    }

    public void setCloseButtonVisible(boolean z) {
        this.closeButtonForcedVisible = z;
        this.animatorCloseIconVisible.setValue(z || this.editText.length() > 0, true);
    }

    public void setSearchFiltersListener(SearchFiltersListener searchFiltersListener) {
        this.searchFiltersListener = searchFiltersListener;
    }

    public void setupBlurredBackground(BlurredBackgroundDrawable blurredBackgroundDrawable) {
        blurredBackgroundDrawable.setRadius(AndroidUtilities.dp(20.0f));
        blurredBackgroundDrawable.setPadding(AndroidUtilities.dp(4.0f));
        this.blurredBackgroundDrawable = blurredBackgroundDrawable;
    }

    @Override
    public final void updateColors$1() {
        int iMultAlpha;
        Drawable drawableCreateRoundRectDrawable;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        boolean zIsDark = resourcesProvider != null ? resourcesProvider.isDark() : Theme.currentTheme.isDark();
        if (this.isSectionBackground) {
            drawableCreateRoundRectDrawable = Theme.createRoundRectDrawableShadowed(AndroidUtilities.dp(20.0f), Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider));
        } else {
            int iDp = AndroidUtilities.dp(20.0f);
            if (this.isWhiteBackground) {
                iMultAlpha = Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider);
            } else {
                iMultAlpha = Theme.multAlpha(zIsDark ? 0.07f : 0.05f, Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
            }
            drawableCreateRoundRectDrawable = Theme.createRoundRectDrawable(iDp, iMultAlpha);
        }
        this.bg = drawableCreateRoundRectDrawable;
        int i = Theme.key_windowBackgroundWhiteBlackText;
        int iMultAlpha2 = Theme.multAlpha(0.6f, Theme.getColor(i, resourcesProvider));
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.searchIcon.setColorFilter(iMultAlpha2, mode);
        int iMultAlpha3 = Theme.multAlpha(0.6f, Theme.getColor(i, resourcesProvider));
        ImageView imageView = this.closeIcon;
        imageView.setColorFilter(iMultAlpha3, mode);
        imageView.setBackground(Theme.createSelectorDrawable(Theme.getColor(Theme.key_listSelector, resourcesProvider), 1, AndroidUtilities.dp(17.0f)));
        int iMultAlpha4 = Theme.multAlpha(0.5f, Theme.getColor(i, resourcesProvider));
        UsersSelectActivity.AnonymousClass4 anonymousClass4 = this.editText;
        anonymousClass4.setHintTextColor(iMultAlpha4);
        anonymousClass4.setTextColor(Theme.getColor(i, resourcesProvider));
        anonymousClass4.setCursorColor(Theme.getColor(Theme.key_groupcreate_cursor, resourcesProvider));
        BlurredBackgroundDrawable blurredBackgroundDrawable = this.blurredBackgroundDrawable;
        if (blurredBackgroundDrawable != null) {
            blurredBackgroundDrawable.updateColors();
        }
        LinearLayout linearLayout = this.additionalIconsLayout;
        int childCount = linearLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = linearLayout.getChildAt(i2);
            if (childAt instanceof ActionBarMenuItem) {
                ActionBarMenuItem actionBarMenuItem = (ActionBarMenuItem) childAt;
                if (actionBarMenuItem.getIconView() != null) {
                    actionBarMenuItem.getIconView().setColorFilter(Theme.multAlpha(0.6f, Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider)), PorterDuff.Mode.MULTIPLY);
                }
                childAt.setBackground(Theme.createSelectorDrawable(Theme.getColor(Theme.key_listSelector, resourcesProvider), 1, AndroidUtilities.dp(17.0f)));
            }
        }
        PhotoViewer.AnonymousClass35 anonymousClass35 = this.searchFilterLayout;
        int childCount2 = anonymousClass35.getChildCount();
        for (int i3 = 0; i3 < childCount2; i3++) {
            if (anonymousClass35.getChildAt(i3) instanceof ActionBarMenuItem.SearchFilterView) {
                ((ActionBarMenuItem.SearchFilterView) anonymousClass35.getChildAt(i3)).updateColors$1();
            }
        }
        invalidate();
    }
}
