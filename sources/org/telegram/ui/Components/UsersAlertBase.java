package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AdjustPanLayoutHelper;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.Cells.GraySectionCell;
import org.telegram.ui.Cells.GroupCallTextCell;
import org.telegram.ui.Cells.GroupCallUserCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda380;
import org.telegram.ui.Components.spoilers.SpoilersTextView;
import org.telegram.ui.LocationActivity;
import org.telegram.ui.LoginActivity;
import org.telegram.ui.PhotoViewer$73$$ExternalSyntheticLambda0;
import org.telegram.ui.UsersSelectActivity;

public abstract class UsersAlertBase extends BottomSheet {
    public int backgroundColor;
    public float colorProgress;
    public final boolean drawTitle;
    public final StickerEmptyView emptyView;
    public final FlickerLoadingView flickerLoadingView;
    public final FrameLayout frameLayout;
    public boolean isEmptyViewVisible;
    public int keyInviteMembersBackground;
    public int keyLastSeenText;
    public int keyLastSeenTextUnscrolled;
    public int keyListSelector;
    public int keyListViewBackground;
    public int keyNameText;
    public int keyScrollUp;
    public int keySearchIcon;
    public int keySearchIconUnscrolled;
    public final FillLastLinearLayoutManager layoutManager;
    public final AnonymousClass1 listView;
    public RecyclerListView.SelectionAdapter listViewAdapter;
    public boolean needSnapToTop;
    public final RectF rect;
    public int scrollOffsetY;
    public RecyclerListView.SelectionAdapter searchListViewAdapter;
    public final SearchField searchView;
    public final View shadow;
    public AnimatorSet shadowAnimation;
    public final Drawable shadowDrawable;
    public TextView titleView;

    public final class AnonymousClass1 extends RecyclerListView {
        public AnonymousClass1(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context, resourcesProvider);
        }

        @Override
        public final boolean emptyViewIsVisible() {
            return getAdapter() != null && UsersAlertBase.this.isEmptyViewVisible && getAdapter().getItemCount() <= 2;
        }

        @Override
        public final void setTranslationY(float f) {
            super.setTranslationY(f);
            getLocationInWindow(new int[2]);
        }
    }

    public final class AnonymousClass5 implements ViewTreeObserver.OnPreDrawListener {
        public final int $r8$classId;
        public final KeyEvent.Callback this$0;
        public final int val$from;

        public AnonymousClass5(KeyEvent.Callback callback, int i, int i2) {
            this.$r8$classId = i2;
            this.this$0 = callback;
            this.val$from = i;
        }

        @Override
        public final boolean onPreDraw() {
            int i = this.val$from;
            KeyEvent.Callback callback = this.this$0;
            switch (this.$r8$classId) {
                case 0:
                    UsersAlertBase usersAlertBase = (UsersAlertBase) callback;
                    usersAlertBase.listView.getViewTreeObserver().removeOnPreDrawListener(this);
                    int childCount = usersAlertBase.listView.getChildCount();
                    AnimatorSet animatorSet = new AnimatorSet();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = usersAlertBase.listView.getChildAt(i2);
                        usersAlertBase.listView.getClass();
                        int childAdapterPosition = RecyclerView.getChildAdapterPosition(childAt);
                        if (childAdapterPosition >= i) {
                            if (childAdapterPosition == 1 && usersAlertBase.listView.getAdapter() == usersAlertBase.searchListViewAdapter && (childAt instanceof GraySectionCell)) {
                                childAt = ((GraySectionCell) childAt).getTextView();
                            }
                            childAt.setAlpha(0.0f);
                            int iMin = (int) ((Math.min(usersAlertBase.listView.getMeasuredHeight(), Math.max(0, childAt.getTop())) / usersAlertBase.listView.getMeasuredHeight()) * 100.0f);
                            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                            objectAnimatorOfFloat.setStartDelay(iMin);
                            objectAnimatorOfFloat.setDuration(200L);
                            animatorSet.playTogether(objectAnimatorOfFloat);
                        }
                    }
                    animatorSet.start();
                    break;
                default:
                    SharedMediaLayout sharedMediaLayout = (SharedMediaLayout) callback;
                    sharedMediaLayout.mediaPages[i].getViewTreeObserver().removeOnPreDrawListener(this);
                    sharedMediaLayout.fixLayoutInternal(i);
                    break;
            }
            return true;
        }
    }

    public class ContainerView extends FrameLayout {
        public boolean ignoreLayout;
        public float snapToTopOffset;
        public Boolean statusBarOpen;
        public ValueAnimator valueAnimator;

        public ContainerView(Context context) {
            super(context);
            this.ignoreLayout = false;
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            canvas.save();
            canvas.clipRect(0, getPaddingTop(), getMeasuredWidth(), getMeasuredHeight());
            super.dispatchDraw(canvas);
            canvas.restore();
        }

        @Override
        public final void onDraw(Canvas canvas) {
            float fMin;
            canvas.save();
            UsersAlertBase usersAlertBase = UsersAlertBase.this;
            int iDp = AndroidUtilities.dp(6.0f) + (usersAlertBase.scrollOffsetY - ((BottomSheet) usersAlertBase).backgroundPaddingTop);
            int iDp2 = (usersAlertBase.scrollOffsetY - ((BottomSheet) usersAlertBase).backgroundPaddingTop) - AndroidUtilities.dp(13.0f);
            int iDp3 = ((BottomSheet) usersAlertBase).backgroundPaddingTop + AndroidUtilities.dp(50.0f) + getMeasuredHeight();
            int i = AndroidUtilities.statusBarHeight;
            int i2 = iDp2 + i;
            int i3 = iDp + i;
            int i4 = iDp3 - i;
            float translationY = getTranslationY() + ((BottomSheet) usersAlertBase).backgroundPaddingTop + i2;
            int i5 = AndroidUtilities.statusBarHeight;
            int i6 = i5 * 2;
            if (translationY < i6) {
                int iMin = (int) Math.min(i5, ((i6 - i2) - ((BottomSheet) usersAlertBase).backgroundPaddingTop) - getTranslationY());
                i2 -= iMin;
                i4 += iMin;
                fMin = 1.0f - Math.min(1.0f, (iMin * 2) / AndroidUtilities.statusBarHeight);
            } else {
                fMin = 1.0f;
            }
            float translationY2 = getTranslationY() + ((BottomSheet) usersAlertBase).backgroundPaddingTop + i2;
            int i7 = AndroidUtilities.statusBarHeight;
            float f = i7;
            int iMin2 = translationY2 < f ? (int) Math.min(f, ((i7 - i2) - ((BottomSheet) usersAlertBase).backgroundPaddingTop) - getTranslationY()) : 0;
            int measuredWidth = getMeasuredWidth();
            Drawable drawable = usersAlertBase.shadowDrawable;
            drawable.setBounds(0, i2, measuredWidth, i4);
            drawable.draw(canvas);
            if (!usersAlertBase.drawTitle) {
                RectF rectF = usersAlertBase.rect;
                if (fMin != 1.0f) {
                    Theme.dialogs_onlineCirclePaint.setColor(usersAlertBase.backgroundColor);
                    rectF.set(((BottomSheet) usersAlertBase).backgroundPaddingLeft, ((BottomSheet) usersAlertBase).backgroundPaddingTop + i2, getMeasuredWidth() - ((BottomSheet) usersAlertBase).backgroundPaddingLeft, AndroidUtilities.dp(24.0f) + ((BottomSheet) usersAlertBase).backgroundPaddingTop + i2);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * fMin, AndroidUtilities.dp(12.0f) * fMin, Theme.dialogs_onlineCirclePaint);
                }
                int iDp4 = AndroidUtilities.dp(36.0f);
                rectF.set((getMeasuredWidth() - iDp4) / 2, i3, (getMeasuredWidth() + iDp4) / 2, AndroidUtilities.dp(4.0f) + i3);
                Theme.dialogs_onlineCirclePaint.setColor(Theme.getColor(null, usersAlertBase.keyScrollUp, false));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), Theme.dialogs_onlineCirclePaint);
            }
            if (iMin2 > 0) {
                Theme.dialogs_onlineCirclePaint.setColor(usersAlertBase.backgroundColor);
            }
            boolean z = iMin2 > AndroidUtilities.statusBarHeight / 2;
            Boolean bool = this.statusBarOpen;
            if (bool == null || bool.booleanValue() != z) {
                boolean z2 = AndroidUtilities.computePerceivedBrightness(usersAlertBase.getThemedColor(Theme.key_dialogBackground)) > 0.721f;
                boolean z3 = AndroidUtilities.computePerceivedBrightness(Theme.blendOver(usersAlertBase.getThemedColor(Theme.key_actionBarDefault), 855638016)) > 0.721f;
                this.statusBarOpen = Boolean.valueOf(z);
                if (!z) {
                    z2 = z3;
                }
                AndroidUtilities.setLightStatusBar(usersAlertBase.getWindow(), z2);
            }
            canvas.restore();
        }

        @Override
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                float y = motionEvent.getY();
                UsersAlertBase usersAlertBase = UsersAlertBase.this;
                if (y < usersAlertBase.scrollOffsetY) {
                    usersAlertBase.lambda$showGiftOfferSheet$15();
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            UsersAlertBase.this.updateLayout$5();
        }

        @Override
        public final void onMeasure(int i, int i2) {
            int iDp;
            int i3 = 1;
            int size = View.MeasureSpec.getSize(i2);
            this.ignoreLayout = true;
            UsersAlertBase usersAlertBase = UsersAlertBase.this;
            setPadding(((BottomSheet) usersAlertBase).backgroundPaddingLeft, AndroidUtilities.statusBarHeight, ((BottomSheet) usersAlertBase).backgroundPaddingLeft, 0);
            this.ignoreLayout = false;
            int paddingTop = size - getPaddingTop();
            if (((BottomSheet) usersAlertBase).keyboardVisible) {
                iDp = AndroidUtilities.dp(8.0f);
                usersAlertBase.setAllowNestedScroll(false);
                int i4 = usersAlertBase.scrollOffsetY;
                if (i4 != 0) {
                    float f = i4;
                    this.snapToTopOffset = f;
                    setTranslationY(f);
                    ValueAnimator valueAnimator = this.valueAnimator;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        this.valueAnimator.cancel();
                    }
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.snapToTopOffset, 0.0f);
                    this.valueAnimator = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.addUpdateListener(new PhotoViewer$73$$ExternalSyntheticLambda0(this, i3));
                    this.valueAnimator.setDuration(250L);
                    this.valueAnimator.setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator);
                    this.valueAnimator.addListener(new Tooltip.AnonymousClass1(this, 18));
                    this.valueAnimator.start();
                } else if (this.valueAnimator != null) {
                    setTranslationY(this.snapToTopOffset);
                }
            } else {
                iDp = (paddingTop - ((paddingTop / 5) * 3)) + AndroidUtilities.dp(8.0f);
                usersAlertBase.setAllowNestedScroll(true);
            }
            AnonymousClass1 anonymousClass1 = usersAlertBase.listView;
            if (anonymousClass1.getPaddingTop() != iDp) {
                this.ignoreLayout = true;
                anonymousClass1.setPadding(0, iDp, 0, 0);
                this.ignoreLayout = false;
            }
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            return !UsersAlertBase.this.isDismissed() && super.onTouchEvent(motionEvent);
        }

        @Override
        public final void requestLayout() {
            if (this.ignoreLayout) {
                return;
            }
            super.requestLayout();
        }

        @Override
        public void setTranslationY(float f) {
            super.setTranslationY(f);
            invalidate();
        }
    }

    public final class SearchField extends FragmentSearchField {
        public final UsersSelectActivity.AnonymousClass4 searchEditText;

        public SearchField(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context, resourcesProvider);
            UsersSelectActivity.AnonymousClass4 anonymousClass4 = this.editText;
            this.searchEditText = anonymousClass4;
            anonymousClass4.setImeOptions(268435459);
            anonymousClass4.setHint(LocaleController.getString(R.string.VoipGroupSearchMembers));
            anonymousClass4.addTextChangedListener(new ArticleViewer.AnonymousClass16(this, 19));
            anonymousClass4.setOnEditorActionListener(new ChatActivity$$ExternalSyntheticLambda380(this, 14));
        }

        @Override
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            UsersAlertBase.this.onSearchViewTouched(motionEvent, this.searchEditText);
            return super.onInterceptTouchEvent(motionEvent);
        }
    }

    static {
        new ChatActivity.AnonymousClass5("colorProgress", 13);
    }

    public UsersAlertBase(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
        super(context, resourcesProvider, false, false);
        this.rect = new RectF();
        this.needSnapToTop = true;
        this.isEmptyViewVisible = true;
        this.keyScrollUp = Theme.key_sheet_scrollUp;
        this.keyListSelector = Theme.key_listSelector;
        int i2 = Theme.key_windowBackgroundWhite;
        this.keyInviteMembersBackground = i2;
        this.keyListViewBackground = i2;
        this.keyNameText = Theme.key_windowBackgroundWhiteBlackText;
        int i3 = Theme.key_windowBackgroundWhiteGrayText;
        this.keyLastSeenText = i3;
        this.keyLastSeenTextUnscrolled = i3;
        int i4 = Theme.key_dialogSearchIcon;
        this.keySearchIcon = i4;
        this.keySearchIconUnscrolled = i4;
        this.drawTitle = true;
        this.resourcesProvider = resourcesProvider;
        updateColorKeys();
        setDimBehindAlpha(75);
        this.currentAccount = i;
        this.shadowDrawable = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        ContainerView containerViewCreateContainerView = createContainerView(context);
        this.containerView = containerViewCreateContainerView;
        containerViewCreateContainerView.setWillNotDraw(false);
        this.containerView.setClipChildren(false);
        ViewGroup viewGroup = this.containerView;
        int i5 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i5, 0, i5, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.frameLayout = frameLayout;
        SearchField searchField = new SearchField(context, resourcesProvider);
        this.searchView = searchField;
        searchField.isWhiteBackground = true;
        searchField.updateColors$1();
        searchField.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        frameLayout.addView(searchField, LayoutHelper.createFrame(-1, 48.0f, 51, 7.0f, 7.0f, 7.0f, 7.0f));
        FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context, null);
        this.flickerLoadingView = flickerLoadingView;
        flickerLoadingView.setViewType(6);
        flickerLoadingView.showDate = false;
        flickerLoadingView.setUseHeaderOffset(true);
        StickerEmptyView stickerEmptyView = new StickerEmptyView(1, null, context, flickerLoadingView);
        this.emptyView = stickerEmptyView;
        stickerEmptyView.addView(flickerLoadingView, 0, LayoutHelper.createFrame(-1, -1.0f, 0, 0.0f, 2.0f, 0.0f, 0.0f));
        SpoilersTextView spoilersTextView = stickerEmptyView.title;
        spoilersTextView.setText(LocaleController.getString(R.string.NoResult));
        LinkSpanDrawable.LinksTextView linksTextView = stickerEmptyView.subtitle;
        linksTextView.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
        stickerEmptyView.setVisibility(8);
        stickerEmptyView.setAnimateLayoutChange(true);
        stickerEmptyView.showProgress(true, false);
        int i6 = this.keyNameText;
        int i7 = this.keyLastSeenText;
        int i8 = this.keyInviteMembersBackground;
        spoilersTextView.setTag(Integer.valueOf(i6));
        Theme.ResourcesProvider resourcesProvider2 = stickerEmptyView.resourcesProvider;
        spoilersTextView.setTextColor(Theme.getColor(i6, resourcesProvider2));
        linksTextView.setTag(Integer.valueOf(i7));
        linksTextView.setTextColor(Theme.getColor(i7, resourcesProvider2));
        stickerEmptyView.colorKey1 = i8;
        this.containerView.addView(stickerEmptyView, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 62.0f, 0.0f, 0.0f));
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(context, resourcesProvider);
        this.listView = anonymousClass1;
        anonymousClass1.setOverScrollMode(2);
        anonymousClass1.setTag(13);
        anonymousClass1.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        anonymousClass1.setClipToPadding(false);
        anonymousClass1.setHideIfEmpty(false);
        anonymousClass1.setSelectorDrawableColor(Theme.getColor(this.keyListSelector, resourcesProvider));
        getContext();
        FillLastLinearLayoutManager fillLastLinearLayoutManager = new FillLastLinearLayoutManager(AndroidUtilities.dp(8.0f), 0, anonymousClass1);
        this.layoutManager = fillLastLinearLayoutManager;
        fillLastLinearLayoutManager.bind = false;
        anonymousClass1.setLayoutManager(fillLastLinearLayoutManager);
        anonymousClass1.setHorizontalScrollBarEnabled(false);
        anonymousClass1.setVerticalScrollBarEnabled(false);
        this.containerView.addView(anonymousClass1, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        anonymousClass1.setOnScrollListener(new LocationActivity.AnonymousClass10(this, 11));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(58.0f);
        View view = new View(context);
        this.shadow = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        this.containerView.addView(view, layoutParams);
        this.containerView.addView(frameLayout, LayoutHelper.createFrame(-1, 58, 51));
        setColorProgress$1(0.0f);
        anonymousClass1.setEmptyView(stickerEmptyView);
        anonymousClass1.animateEmptyView = true;
        anonymousClass1.emptyViewAnimationType = 0;
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    public ContainerView createContainerView(Context context) {
        return new ContainerView(context);
    }

    @Override
    public void lambda$showGiftOfferSheet$15() {
        AndroidUtilities.hideKeyboard(this.searchView.searchEditText);
        super.lambda$showGiftOfferSheet$15();
    }

    public abstract void onSearchViewTouched(MotionEvent motionEvent, UsersSelectActivity.AnonymousClass4 anonymousClass4);

    public final void runShadowAnimation$2$1(boolean z) {
        View view = this.shadow;
        if ((!z || view.getTag() == null) && (z || view.getTag() != null)) {
            return;
        }
        view.setTag(z ? null : 1);
        if (z) {
            view.setVisibility(0);
        }
        AnimatorSet animatorSet = this.shadowAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.shadowAnimation = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, z ? 1.0f : 0.0f));
        this.shadowAnimation.setDuration(150L);
        this.shadowAnimation.addListener(new LoginActivity.AnonymousClass9(14, this, z));
        this.shadowAnimation.start();
    }

    public abstract void search(String str);

    public final void setColorProgress$1(float f) {
        this.colorProgress = f;
        this.backgroundColor = AndroidUtilities.getOffsetColor(Theme.getColor(this.keyInviteMembersBackground, this.resourcesProvider), Theme.getColor(this.keyListViewBackground, this.resourcesProvider), f, 1.0f);
        this.shadowDrawable.setColorFilter(new PorterDuffColorFilter(this.backgroundColor, PorterDuff.Mode.MULTIPLY));
        fixNavigationBar(this.backgroundColor);
        int i = this.backgroundColor;
        this.navBarColor = i;
        AnonymousClass1 anonymousClass1 = this.listView;
        anonymousClass1.setGlowColor(i);
        int offsetColor = AndroidUtilities.getOffsetColor(Theme.getColor(null, this.keyLastSeenTextUnscrolled, false), Theme.getColor(null, this.keyLastSeenText, false), f, 1.0f);
        int offsetColor2 = AndroidUtilities.getOffsetColor(Theme.getColor(null, this.keySearchIconUnscrolled, false), Theme.getColor(null, this.keySearchIcon, false), f, 1.0f);
        int childCount = anonymousClass1.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = anonymousClass1.getChildAt(i2);
            if (childAt instanceof GroupCallTextCell) {
                ((GroupCallTextCell) childAt).setColors(offsetColor, offsetColor);
            } else if (childAt instanceof GroupCallUserCell) {
                ((GroupCallUserCell) childAt).setGrayIconColor(this.shadow.getTag() != null ? this.keySearchIcon : this.keySearchIconUnscrolled, offsetColor2);
            }
        }
        this.containerView.invalidate();
        anonymousClass1.invalidate();
        this.container.invalidate();
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        if (this.titleView == null) {
            TextView textView = new TextView(getContext());
            this.titleView = textView;
            textView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, this.resourcesProvider));
            this.titleView.setTextSize(1, 20.0f);
            this.titleView.setTypeface(AndroidUtilities.bold());
            this.titleView.setLines(1);
            this.titleView.setMaxLines(1);
            this.titleView.setSingleLine(true);
            this.titleView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            this.titleView.setEllipsize(TextUtils.TruncateAt.END);
            FrameLayout frameLayout = this.frameLayout;
            frameLayout.addView(this.titleView, LayoutHelper.createFrame(-1, 36.0f, 51, 16.0f, 0.0f, 0.0f, 0.0f));
            ((FrameLayout.LayoutParams) this.searchView.getLayoutParams()).topMargin = AndroidUtilities.dp(30.0f);
            frameLayout.getLayoutParams().height = AndroidUtilities.dp(94.0f);
        }
        this.titleView.setText(charSequence);
    }

    public void setTranslationY(int i) {
        this.listView.setTopGlowOffset(i);
        float f = i;
        this.frameLayout.setTranslationY(f);
        this.emptyView.setTranslationY(f);
        this.containerView.invalidate();
    }

    public final void showItemsAnimated$2(int i) {
        if (isShowing()) {
            this.listView.getViewTreeObserver().addOnPreDrawListener(new AnonymousClass5(this, i, 0));
        }
    }

    public void updateColorKeys() {
    }

    public void updateLayout$5() {
        AnonymousClass1 anonymousClass1 = this.listView;
        if (anonymousClass1.getChildCount() <= 0) {
            return;
        }
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = anonymousClass1.findViewHolderForAdapterPosition(0);
        int top = viewHolderFindViewHolderForAdapterPosition != null ? viewHolderFindViewHolderForAdapterPosition.itemView.getTop() - AndroidUtilities.dp(8.0f) : 0;
        int i = (top <= 0 || viewHolderFindViewHolderForAdapterPosition == null || viewHolderFindViewHolderForAdapterPosition.getAdapterPosition() != 0) ? 0 : top;
        if (top < 0 || viewHolderFindViewHolderForAdapterPosition == null || viewHolderFindViewHolderForAdapterPosition.getAdapterPosition() != 0) {
            runShadowAnimation$2$1(true);
            top = i;
        } else {
            runShadowAnimation$2$1(false);
        }
        if (this.scrollOffsetY != top) {
            this.scrollOffsetY = top;
            setTranslationY(top);
        }
    }
}
