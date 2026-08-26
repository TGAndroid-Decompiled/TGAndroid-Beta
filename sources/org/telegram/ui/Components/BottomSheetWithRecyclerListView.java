package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.CallLogActivity;
import org.telegram.ui.Cells.EditEmojiTextCell;
import org.telegram.ui.Cells.WallpaperCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.Premium.boosts.BoostViaGiftsBottomSheet;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.WallpapersListActivity;

public abstract class BottomSheetWithRecyclerListView extends BottomSheet {
    public final AnonymousClass4 actionBar;
    public boolean actionBarIgnoreTouchEvents;
    public AnimatedFloat actionBarSlideProgress;
    public int actionBarType;
    public final BaseFragment baseFragment;
    public boolean centerTitle;
    public int contentHeight;
    public EditEmojiTextCell.AnonymousClass2 editTextEmoji;
    public boolean handleOffset;
    public final RectF handleRect;
    public final boolean hasFixedSize;
    public int headerHeight;
    public int headerMoveTop;
    public int headerPaddingBottom;
    public int headerPaddingTop;
    public final Drawable headerShadowDrawable;
    public int headerTotalHeight;
    public boolean ignoreTouchActionBar;
    public float lastTop;
    public final PhotoViewer.AnonymousClass36 layoutManager;
    public final AnonymousClass1 nestedSizeNotifierLayout;
    public final RecyclerListView recyclerListView;
    public boolean restore;
    public boolean reverseLayout;
    public int savedScrollOffset;
    public int savedScrollPosition;
    public float shadowAlpha;
    public boolean showHandle;
    public boolean showShadow;
    public boolean takeTranslationIntoAccount;
    public float topPadding;
    public boolean wasDrawn;

    public final class AnonymousClass4 extends ActionBar {
        public final SizeNotifierFrameLayout val$containerView;

        public AnonymousClass4(Context context, SizeNotifierFrameLayout sizeNotifierFrameLayout) {
            super(context, null);
            this.val$containerView = sizeNotifierFrameLayout;
        }

        @Override
        public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
            BottomSheetWithRecyclerListView bottomSheetWithRecyclerListView = BottomSheetWithRecyclerListView.this;
            if (bottomSheetWithRecyclerListView.ignoreTouchActionBar && bottomSheetWithRecyclerListView.actionBarIgnoreTouchEvents) {
                return false;
            }
            return super.dispatchTouchEvent(motionEvent);
        }

        @Override
        public final void setAlpha(float f) {
            if (getAlpha() != f) {
                super.setAlpha(f);
                this.val$containerView.invalidate();
            }
        }

        @Override
        public final void setTag(Object obj) {
            super.setTag(obj);
            BottomSheetWithRecyclerListView.this.updateStatusBar$1();
        }
    }

    public final class PaddingView extends View {
        public PaddingView(Context context) {
            super(context);
            setTag(-33024);
        }

        @Override
        public final void onMeasure(int i, int i2) {
            BottomSheetWithRecyclerListView bottomSheetWithRecyclerListView = BottomSheetWithRecyclerListView.this;
            int i3 = bottomSheetWithRecyclerListView.contentHeight;
            int iDp = (i3 == 0 ? AndroidUtilities.dp(300.0f) : (int) (i3 * bottomSheetWithRecyclerListView.topPadding)) - (((bottomSheetWithRecyclerListView.headerTotalHeight - bottomSheetWithRecyclerListView.headerHeight) - bottomSheetWithRecyclerListView.headerPaddingTop) - bottomSheetWithRecyclerListView.headerPaddingBottom);
            if (iDp < 1) {
                iDp = 1;
            }
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(iDp, 1073741824));
        }

        @Override
        public final void setTranslationY(float f) {
            super.setTranslationY(f);
            ((BottomSheet) BottomSheetWithRecyclerListView.this).containerView.invalidate();
        }
    }

    public BottomSheetWithRecyclerListView(BaseFragment baseFragment, boolean z) {
        this(baseFragment.getParentActivity(), baseFragment, false, z, false, baseFragment == null ? null : baseFragment.getResourceProvider());
    }

    public final void applyScrolledPosition$1() {
        RecyclerListView recyclerListView = this.recyclerListView;
        if (recyclerListView == null || recyclerListView.getLayoutManager() == null || this.savedScrollPosition < 0) {
            return;
        }
        int top = (this.savedScrollOffset - this.containerView.getTop()) - recyclerListView.getPaddingTop();
        if (recyclerListView.getLayoutManager() instanceof LinearLayoutManager) {
            ((LinearLayoutManager) recyclerListView.getLayoutManager()).scrollToPositionWithOffset(this.savedScrollPosition, top);
        }
        this.savedScrollPosition = -1;
    }

    @Override
    public boolean canDismissWithSwipe() {
        return false;
    }

    public boolean canHighlightChildAt(View view, float f, float f2) {
        return true;
    }

    public final void checkBackDrawableInsets() {
        if (this.backDrawable == null || this.containerView == null || this.shadowDrawable == null || !shouldDrawBackground() || this.hasFixedSize) {
            return;
        }
        Rect bounds = this.shadowDrawable.getBounds();
        if (this.containerView.getMeasuredWidth() < this.container.getMeasuredWidth()) {
            BottomSheet.SheetBackDrawable sheetBackDrawable = this.backDrawable;
            Rect rect = sheetBackDrawable.insets;
            if (rect.left == 0 && rect.top == 0 && rect.right == 0 && rect.bottom == 0) {
                return;
            }
            rect.set(0, 0, 0, 0);
            sheetBackDrawable.onBoundsChange(sheetBackDrawable.getBounds());
            sheetBackDrawable.invalidateSelf();
            return;
        }
        BottomSheet.SheetBackDrawable sheetBackDrawable2 = this.backDrawable;
        int measuredHeight = ((this.containerView.getMeasuredHeight() - bounds.top) - AndroidUtilities.dp(30.0f)) - ((int) this.containerView.getTranslationY());
        Rect rect2 = sheetBackDrawable2.insets;
        if (rect2.left == 0 && rect2.top == 0 && rect2.right == 0 && rect2.bottom == measuredHeight) {
            return;
        }
        rect2.set(0, 0, 0, measuredHeight);
        sheetBackDrawable2.onBoundsChange(sheetBackDrawable2.getBounds());
        sheetBackDrawable2.invalidateSelf();
    }

    public abstract RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView);

    public RecyclerListView createRecyclerView(Context context) {
        return new ChatActivity.AnonymousClass34(this, context, this.resourcesProvider, 7);
    }

    public int getActionBarProgressHeight() {
        return AndroidUtilities.dp(56.0f);
    }

    public abstract CharSequence getTitle();

    @Override
    public final boolean isAttachedLightStatusBar() {
        AnonymousClass4 anonymousClass4 = this.actionBar;
        if (anonymousClass4 != null && anonymousClass4.getTag() != null) {
            return ColorUtils.calculateLuminance(Theme.getColor(Theme.key_dialogBackground, this.resourcesProvider)) > 0.699999988079071d;
        }
        BaseFragment baseFragment = this.baseFragment;
        if (baseFragment != null) {
            return baseFragment.isLightStatusBar();
        }
        return ColorUtils.calculateLuminance(Theme.getColor(Theme.key_dialogBackground, this.resourcesProvider)) > 0.699999988079071d;
    }

    public void onActionBarAlpha(float f) {
    }

    @Override
    public void onContainerViewTranslation() {
        onSheetTop(this.lastTop);
        checkBackDrawableInsets();
    }

    public void onPreDraw(Canvas canvas, int i) {
    }

    public void onPreMeasure(int i, int i2) {
    }

    public void onSheetTop(float f) {
    }

    public void onViewCreated(SizeNotifierFrameLayout sizeNotifierFrameLayout) {
    }

    public final void postDrawInternal(Canvas canvas, FrameLayout frameLayout) {
        float f;
        int i = this.actionBarType;
        Drawable drawable = this.headerShadowDrawable;
        AnonymousClass4 anonymousClass4 = this.actionBar;
        if (i == 1) {
            boolean z = this.showShadow;
            if (z) {
                float f2 = this.shadowAlpha;
                if (f2 != 1.0f) {
                    this.shadowAlpha = f2 + 0.10666667f;
                    frameLayout.invalidate();
                } else if (!z) {
                    f = this.shadowAlpha;
                    if (f != 0.0f) {
                        this.shadowAlpha = f - 0.10666667f;
                        frameLayout.invalidate();
                    }
                }
            } else if (!z) {
                f = this.shadowAlpha;
                if (f != 0.0f) {
                    this.shadowAlpha = f - 0.10666667f;
                    frameLayout.invalidate();
                }
            }
            this.shadowAlpha = Utilities.clamp(this.shadowAlpha, 1.0f, 0.0f);
            if (anonymousClass4 != null && anonymousClass4.getVisibility() == 0 && anonymousClass4.getAlpha() != 0.0f && this.shadowAlpha != 0.0f) {
                drawable.setBounds(this.backgroundPaddingLeft, anonymousClass4.getBottom(), frameLayout.getMeasuredWidth() - this.backgroundPaddingLeft, drawable.getIntrinsicHeight() + anonymousClass4.getBottom());
                drawable.setAlpha((int) (anonymousClass4.getAlpha() * 255.0f * this.shadowAlpha));
                drawable.draw(canvas);
                if (drawable.getAlpha() < 255) {
                    frameLayout.invalidate();
                }
            }
            this.wasDrawn = true;
        } else if (i == 2 && ((int) (this.shadowAlpha * 255.0f)) != 0 && this.showShadow) {
            drawable.setBounds(this.backgroundPaddingLeft, anonymousClass4.getBottom() + ((int) anonymousClass4.getTranslationY()), frameLayout.getMeasuredWidth() - this.backgroundPaddingLeft, drawable.getIntrinsicHeight() + anonymousClass4.getBottom() + ((int) anonymousClass4.getTranslationY()));
            drawable.setAlpha((int) (this.shadowAlpha * 255.0f));
            drawable.draw(canvas);
        }
        if (this.restore) {
            canvas.restore();
            this.restore = false;
        }
    }

    public void preDrawInternal(Canvas canvas, View view) {
        int translationY;
        this.restore = false;
        if (this.hasFixedSize) {
            return;
        }
        boolean z = this.reverseLayout;
        RecyclerListView recyclerListView = this.recyclerListView;
        if (z) {
            int height = recyclerListView.getHeight();
            for (int i = 0; i < recyclerListView.getChildCount(); i++) {
                View childAt = recyclerListView.getChildAt(i);
                int childAdapterPosition = RecyclerView.getChildAdapterPosition(childAt);
                if (childAdapterPosition != -1 && childAdapterPosition != recyclerListView.getAdapter().getItemCount() - 1) {
                    height = Math.min(height, childAt.getTop() + (this.takeTranslationIntoAccount ? (int) childAt.getTranslationY() : 0));
                }
            }
            translationY = height - AndroidUtilities.dp(16.0f);
        } else {
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerListView.findViewHolderForAdapterPosition(0);
            int bottom = -AndroidUtilities.dp(16.0f);
            if (viewHolderFindViewHolderForAdapterPosition != null) {
                View view2 = viewHolderFindViewHolderForAdapterPosition.itemView;
                bottom = view2.getBottom() - AndroidUtilities.dp(16.0f);
                if (this.takeTranslationIntoAccount) {
                    translationY = ((int) view2.getTranslationY()) + bottom;
                } else {
                    translationY = bottom;
                }
            } else {
                translationY = bottom;
            }
        }
        int iLerp = (translationY - ((this.headerHeight + this.headerPaddingTop) + this.headerPaddingBottom)) + this.headerMoveTop;
        if (this.showHandle && this.handleOffset) {
            iLerp -= AndroidUtilities.dp(this.actionBarType == 2 ? 8.0f : 16.0f);
        }
        float f = iLerp;
        this.lastTop = f;
        onSheetTop(f);
        int i2 = this.actionBarType;
        float fLerp = 1.0f;
        AnonymousClass4 anonymousClass4 = this.actionBar;
        if (i2 == 1) {
            float fDp = 1.0f - ((AndroidUtilities.dp(16.0f) + iLerp) / getActionBarProgressHeight());
            if (fDp < 0.0f) {
                fDp = 0.0f;
            }
            AndroidUtilities.updateViewVisibilityAnimated(anonymousClass4, fDp != 0.0f, 1.0f, this.wasDrawn);
        } else if (i2 == 2) {
            float fMax = Math.max(((AndroidUtilities.dp(8.0f) + (iLerp - this.headerMoveTop)) + this.headerPaddingTop) - AndroidUtilities.statusBarHeight, 0.0f);
            float f2 = this.actionBarSlideProgress.set(fMax == 0.0f ? 1.0f : 0.0f, false);
            if (f2 != 0.0f && f2 != 1.0f) {
                canvas.save();
                canvas.clipRect(0.0f, fMax, this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
                this.restore = true;
            }
            this.shadowAlpha = f2;
            fLerp = AndroidUtilities.lerp(1.0f, 0.5f, f2);
            anonymousClass4.backButtonImageView.setAlpha(f2);
            onActionBarAlpha(f2);
            anonymousClass4.backButtonImageView.setScaleX(f2);
            ImageView imageView = anonymousClass4.backButtonImageView;
            imageView.setPivotY(imageView.getMeasuredHeight() / 2.0f);
            anonymousClass4.backButtonImageView.setScaleY(f2);
            SimpleTextView titleTextView = anonymousClass4.getTitleTextView();
            titleTextView.setTranslationX(AndroidUtilities.lerp(AndroidUtilities.dp(21.0f) - titleTextView.getLeft(), 0.0f, f2) + 0);
            if (this.centerTitle) {
                titleTextView.setTranslationX(((anonymousClass4.getMeasuredWidth() - titleTextView.getTextWidth()) / 2.0f) - titleTextView.getLeft());
            }
            anonymousClass4.setTranslationY(fMax);
            iLerp -= AndroidUtilities.lerp(0, AndroidUtilities.dp(13.0f) + (((this.headerTotalHeight - this.headerHeight) - this.headerPaddingTop) - this.headerPaddingBottom), f2);
            anonymousClass4.getBackground().setBounds(0, AndroidUtilities.lerp(anonymousClass4.getHeight(), 0, f2), anonymousClass4.getWidth(), anonymousClass4.getHeight());
            if (f2 > 0.5f) {
                if (this.actionBarIgnoreTouchEvents) {
                    this.actionBarIgnoreTouchEvents = false;
                    anonymousClass4.setTag(1);
                }
            } else if (!this.actionBarIgnoreTouchEvents) {
                this.actionBarIgnoreTouchEvents = true;
                anonymousClass4.setTag(null);
            }
        }
        if (shouldDrawBackground()) {
            if (this instanceof BoostViaGiftsBottomSheet) {
                this.shadowDrawable.setBounds(-AndroidUtilities.dp(6.0f), iLerp, AndroidUtilities.dp(6.0f) + view.getMeasuredWidth(), view.getMeasuredHeight());
            } else {
                this.shadowDrawable.setBounds(0, iLerp, view.getMeasuredWidth(), view.getMeasuredHeight());
            }
            checkBackDrawableInsets();
            this.shadowDrawable.draw(canvas);
            if (this.showHandle && fLerp > 0.0f) {
                int iDp = AndroidUtilities.dp(36.0f);
                int iDp2 = AndroidUtilities.dp(20.0f) + iLerp;
                RectF rectF = this.handleRect;
                rectF.set((view.getMeasuredWidth() - iDp) / 2.0f, iDp2, (view.getMeasuredWidth() + iDp) / 2.0f, AndroidUtilities.dp(4.0f) + iDp2);
                Theme.dialogs_onlineCirclePaint.setColor(getThemedColor(Theme.key_sheet_scrollUp));
                Paint paint = Theme.dialogs_onlineCirclePaint;
                paint.setAlpha((int) (paint.getAlpha() * fLerp));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), Theme.dialogs_onlineCirclePaint);
            }
        }
        onPreDraw(canvas, iLerp);
    }

    public final void saveScrollPosition$2() {
        RecyclerListView recyclerListView = this.recyclerListView;
        if (recyclerListView == null || this.layoutManager == null || recyclerListView.getChildCount() <= 0) {
            return;
        }
        View view = null;
        int i = -1;
        int top = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < recyclerListView.getChildCount(); i2++) {
            View childAt = recyclerListView.getChildAt(i2);
            int childAdapterPosition = RecyclerView.getChildAdapterPosition(childAt);
            if (childAdapterPosition >= 0 && childAt.getTop() < top) {
                top = childAt.getTop();
                view = childAt;
                i = childAdapterPosition;
            }
        }
        if (view != null) {
            this.savedScrollPosition = i;
            this.savedScrollOffset = this.containerView.getTop() + view.getTop();
            smoothContainerViewLayout();
        }
    }

    public final void setSlidingActionBar() {
        if (this.hasFixedSize) {
            return;
        }
        this.actionBarType = 2;
        int currentActionBarHeight = ActionBar.getCurrentActionBarHeight();
        this.headerHeight = currentActionBarHeight;
        this.headerTotalHeight = currentActionBarHeight + AndroidUtilities.statusBarHeight;
        this.headerPaddingTop = AndroidUtilities.dp(16.0f);
        this.headerPaddingBottom = AndroidUtilities.dp(-20.0f);
        this.actionBarSlideProgress = new AnimatedFloat(this.containerView, 0L, 350L, CubicBezierInterpolator.EASE_OUT_QUINT);
        this.actionBar.backButtonImageView.setPivotX(0.0f);
        this.recyclerListView.setClipToPadding(true);
    }

    public boolean shouldDrawBackground() {
        return true;
    }

    public final void updateStatusBar$1() {
        if (this.attachedFragment != null) {
            LaunchActivity.instance.checkSystemBarColors(true, true, true);
            return;
        }
        AnonymousClass4 anonymousClass4 = this.actionBar;
        if (anonymousClass4 != null && anonymousClass4.getTag() != null) {
            AndroidUtilities.setLightStatusBar(this, ColorUtils.calculateLuminance(Theme.getColor(Theme.key_dialogBackground, this.resourcesProvider)) > 0.699999988079071d);
            return;
        }
        BaseFragment baseFragment = this.baseFragment;
        if (baseFragment != null) {
            AndroidUtilities.setLightStatusBar(this, baseFragment.isLightStatusBar());
        }
    }

    public final void updateTitle$1() {
        AnonymousClass4 anonymousClass4 = this.actionBar;
        if (anonymousClass4 != null) {
            anonymousClass4.setTitle(getTitle());
        }
    }

    public final void updateTitleAnimated() {
        AnonymousClass4 anonymousClass4 = this.actionBar;
        if (anonymousClass4 == null || TextUtils.equals(getTitle(), anonymousClass4.getTitle())) {
            return;
        }
        this.actionBar.setTitleAnimated(getTitle(), false, 350L, CubicBezierInterpolator.EASE_OUT_QUINT);
    }

    public final class AnonymousClass8 extends RecyclerListView.SelectionAdapter {
        public final int $r8$classId;
        public final KeyEvent.Callback this$0;
        public final Object val$adapter;
        public final Context val$context;

        public AnonymousClass8(BottomSheetWithRecyclerListView bottomSheetWithRecyclerListView, RecyclerListView.SelectionAdapter selectionAdapter, Context context) {
            this.$r8$classId = 0;
            this.this$0 = bottomSheetWithRecyclerListView;
            this.val$adapter = selectionAdapter;
            this.val$context = context;
        }

        @Override
        public final int getItemCount() {
            switch (this.$r8$classId) {
                case 0:
                    return ((RecyclerListView.SelectionAdapter) this.val$adapter).getItemCount() + 1;
                default:
                    return ((ArrayList) this.val$adapter).size();
            }
        }

        @Override
        public final int getItemViewType(int i) {
            switch (this.$r8$classId) {
                case 0:
                    BottomSheetWithRecyclerListView bottomSheetWithRecyclerListView = (BottomSheetWithRecyclerListView) this.this$0;
                    boolean z = bottomSheetWithRecyclerListView.reverseLayout;
                    RecyclerListView.SelectionAdapter selectionAdapter = (RecyclerListView.SelectionAdapter) this.val$adapter;
                    if (i == (z ? selectionAdapter.getItemCount() : 0)) {
                        return -1000;
                    }
                    return selectionAdapter.getItemViewType(i - (!bottomSheetWithRecyclerListView.reverseLayout ? 1 : 0));
                default:
                    return 0;
            }
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            switch (this.$r8$classId) {
                case 0:
                    return ((RecyclerListView.SelectionAdapter) this.val$adapter).isEnabled(viewHolder);
                default:
                    return viewHolder.mItemViewType == 0;
            }
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            switch (this.$r8$classId) {
                case 0:
                    BottomSheetWithRecyclerListView bottomSheetWithRecyclerListView = (BottomSheetWithRecyclerListView) this.this$0;
                    boolean z = bottomSheetWithRecyclerListView.reverseLayout;
                    RecyclerListView.SelectionAdapter selectionAdapter = (RecyclerListView.SelectionAdapter) this.val$adapter;
                    if (i != (z ? selectionAdapter.getItemCount() : 0)) {
                        selectionAdapter.onBindViewHolder(viewHolder, i - (!bottomSheetWithRecyclerListView.reverseLayout ? 1 : 0));
                    }
                    break;
                default:
                    WallpaperCell wallpaperCell = (WallpaperCell) viewHolder.itemView;
                    wallpaperCell.setParams(1, false, false);
                    wallpaperCell.setSize(((ChatAttachAlertColorsLayout) this.this$0).itemSize);
                    wallpaperCell.setWallpaper(1, ((ArrayList) this.val$adapter).get(i), null, 0);
                    break;
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            switch (this.$r8$classId) {
                case 0:
                    return i == -1000 ? new RecyclerListView.Holder(((BottomSheetWithRecyclerListView) this.this$0).new PaddingView(this.val$context)) : ((RecyclerListView.SelectionAdapter) this.val$adapter).onCreateViewHolder(viewGroup, i);
                default:
                    WallpapersListActivity.ListAdapter.AnonymousClass1 anonymousClass1 = new WallpapersListActivity.ListAdapter.AnonymousClass1(this, this.val$context);
                    anonymousClass1.drawStubBackground = false;
                    return new RecyclerListView.Holder(anonymousClass1);
            }
        }

        @Override
        public void registerAdapterDataObserver(final RecyclerView.AdapterDataObserver adapterDataObserver) {
            switch (this.$r8$classId) {
                case 0:
                    ((RecyclerListView.SelectionAdapter) this.val$adapter).registerAdapterDataObserver(new RecyclerView.AdapterDataObserver() {
                        @Override
                        public final void onChanged() {
                            adapterDataObserver.onChanged();
                        }

                        @Override
                        public final void onItemRangeChanged(int i, int i2) {
                            adapterDataObserver.onItemRangeChanged(i + (!((BottomSheetWithRecyclerListView) AnonymousClass8.this.this$0).reverseLayout ? 1 : 0), i2);
                        }

                        @Override
                        public final void onItemRangeInserted(int i, int i2) {
                            adapterDataObserver.onItemRangeInserted(i + (!((BottomSheetWithRecyclerListView) AnonymousClass8.this.this$0).reverseLayout ? 1 : 0), i2);
                        }

                        @Override
                        public final void onItemRangeMoved(int i, int i2) {
                            int i3 = !((BottomSheetWithRecyclerListView) AnonymousClass8.this.this$0).reverseLayout ? 1 : 0;
                            adapterDataObserver.onItemRangeMoved(i + i3, i2 + i3);
                        }

                        @Override
                        public final void onItemRangeRemoved(int i, int i2) {
                            adapterDataObserver.onItemRangeRemoved(i + (!((BottomSheetWithRecyclerListView) AnonymousClass8.this.this$0).reverseLayout ? 1 : 0), i2);
                        }

                        @Override
                        public final void onItemRangeChanged(int i, int i2, Object obj) {
                            adapterDataObserver.onItemRangeChanged(i + (!((BottomSheetWithRecyclerListView) AnonymousClass8.this.this$0).reverseLayout ? 1 : 0), i2, obj);
                        }
                    });
                    break;
                default:
                    super.registerAdapterDataObserver(adapterDataObserver);
                    break;
            }
        }

        public AnonymousClass8(ChatAttachAlertColorsLayout chatAttachAlertColorsLayout, Context context) {
            this.$r8$classId = 1;
            this.this$0 = chatAttachAlertColorsLayout;
            this.val$adapter = new ArrayList();
            this.val$context = context;
        }
    }

    public BottomSheetWithRecyclerListView(BaseFragment baseFragment) {
        this(baseFragment.getParentActivity(), baseFragment, false, false, false, false, false, 2, baseFragment.getResourceProvider());
    }

    public BottomSheetWithRecyclerListView(Context context, BaseFragment baseFragment, boolean z, boolean z2, boolean z3, Theme.ResourcesProvider resourcesProvider) {
        this(context, baseFragment, z, false, z2, z3, false, 1, resourcesProvider);
    }

    public BottomSheetWithRecyclerListView(Context context, BaseFragment baseFragment, boolean z, boolean z2, final boolean z3, boolean z4, final boolean z5, int i, Theme.ResourcesProvider resourcesProvider) {
        ?? r8;
        super(context, resourcesProvider, z, z2);
        this.topPadding = 0.4f;
        boolean z6 = true;
        this.showShadow = true;
        this.shadowAlpha = 1.0f;
        boolean z7 = false;
        this.showHandle = false;
        this.handleRect = new RectF();
        this.actionBarType = 1;
        this.headerTotalHeight = 0;
        this.headerHeight = 0;
        this.headerPaddingTop = 0;
        this.headerPaddingBottom = 0;
        this.headerMoveTop = 0;
        this.ignoreTouchActionBar = true;
        this.actionBarIgnoreTouchEvents = false;
        this.takeTranslationIntoAccount = false;
        this.savedScrollPosition = -1;
        this.baseFragment = baseFragment;
        this.hasFixedSize = z3;
        this.headerShadowDrawable = context.getDrawable(R.drawable.header_shadow).mutate();
        if (z4) {
            ?? r9 = new NestedSizeNotifierLayout(context) {
                @Override
                public final void dispatchDraw(Canvas canvas) {
                    BottomSheetWithRecyclerListView bottomSheetWithRecyclerListView = BottomSheetWithRecyclerListView.this;
                    bottomSheetWithRecyclerListView.preDrawInternal(canvas, this);
                    super.dispatchDraw(canvas);
                    bottomSheetWithRecyclerListView.postDrawInternal(canvas, this);
                }

                @Override
                public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 0) {
                        float y = motionEvent.getY();
                        BottomSheetWithRecyclerListView bottomSheetWithRecyclerListView = BottomSheetWithRecyclerListView.this;
                        if (y < ((BottomSheet) bottomSheetWithRecyclerListView).shadowDrawable.getBounds().top) {
                            bottomSheetWithRecyclerListView.lambda$showGiftOfferSheet$15();
                        }
                    }
                    return super.dispatchTouchEvent(motionEvent);
                }

                @Override
                public final boolean drawChild(Canvas canvas, View view, long j) {
                    if (!z3) {
                        BottomSheetWithRecyclerListView.this.getClass();
                    }
                    return super.drawChild(canvas, view, j);
                }

                @Override
                public final void onMeasure(int i2, int i3) {
                    int size = View.MeasureSpec.getSize(i3);
                    BottomSheetWithRecyclerListView bottomSheetWithRecyclerListView = BottomSheetWithRecyclerListView.this;
                    bottomSheetWithRecyclerListView.contentHeight = size;
                    bottomSheetWithRecyclerListView.onPreMeasure(i2, i3);
                    if (z5) {
                        i3 = View.MeasureSpec.makeMeasureSpec(bottomSheetWithRecyclerListView.contentHeight, 1073741824);
                    }
                    super.onMeasure(i2, i3);
                }
            };
            this.nestedSizeNotifierLayout = r9;
            r8 = r9;
        } else {
            r8 = new SizeNotifierFrameLayout(context) {
                @Override
                public final void dispatchDraw(Canvas canvas) {
                    BottomSheetWithRecyclerListView bottomSheetWithRecyclerListView = BottomSheetWithRecyclerListView.this;
                    bottomSheetWithRecyclerListView.preDrawInternal(canvas, this);
                    super.dispatchDraw(canvas);
                    bottomSheetWithRecyclerListView.postDrawInternal(canvas, this);
                }

                @Override
                public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 0) {
                        float y = motionEvent.getY();
                        BottomSheetWithRecyclerListView bottomSheetWithRecyclerListView = BottomSheetWithRecyclerListView.this;
                        if (y < ((BottomSheet) bottomSheetWithRecyclerListView).shadowDrawable.getBounds().top) {
                            bottomSheetWithRecyclerListView.lambda$showGiftOfferSheet$15();
                        }
                    }
                    return super.dispatchTouchEvent(motionEvent);
                }

                @Override
                public final boolean drawChild(Canvas canvas, View view, long j) {
                    if (!z3) {
                        BottomSheetWithRecyclerListView.this.getClass();
                    }
                    return super.drawChild(canvas, view, j);
                }

                @Override
                public final void onLayout(boolean z8, int i2, int i3, int i4, int i5) {
                    int paddingRight;
                    int i6;
                    int paddingLeft;
                    int i7;
                    int i8;
                    int paddingTop;
                    int measuredHeight;
                    int measuredHeight2;
                    BottomSheetWithRecyclerListView bottomSheetWithRecyclerListView = BottomSheetWithRecyclerListView.this;
                    if (bottomSheetWithRecyclerListView.editTextEmoji == null) {
                        super.onLayout(z8, i2, i3, i4, i5);
                        return;
                    }
                    int childCount = getChildCount();
                    int iMeasureKeyboardHeight = measureKeyboardHeight();
                    int paddingBottom = getPaddingBottom();
                    if (!((BottomSheet) bottomSheetWithRecyclerListView).keyboardVisible && bottomSheetWithRecyclerListView.editTextEmoji != null && iMeasureKeyboardHeight <= AndroidUtilities.dp(20.0f) && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                        paddingBottom += bottomSheetWithRecyclerListView.editTextEmoji.getEmojiPadding();
                    }
                    setBottomClip(paddingBottom);
                    for (int i9 = 0; i9 < childCount; i9++) {
                        View childAt = getChildAt(i9);
                        if (childAt.getVisibility() != 8) {
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                            int measuredWidth = childAt.getMeasuredWidth();
                            int measuredHeight3 = childAt.getMeasuredHeight();
                            int i10 = layoutParams.gravity;
                            if (i10 == -1) {
                                i10 = 51;
                            }
                            int i11 = i10 & 112;
                            int i12 = i10 & 7;
                            if (i12 != 1) {
                                if (i12 != 5) {
                                    paddingLeft = getPaddingLeft() + layoutParams.leftMargin;
                                } else {
                                    paddingRight = (((i4 - i2) - measuredWidth) - layoutParams.rightMargin) - getPaddingRight();
                                    i6 = ((BottomSheet) bottomSheetWithRecyclerListView).backgroundPaddingLeft;
                                }
                                if (i11 != 16) {
                                    if (i11 != 48) {
                                        paddingTop = layoutParams.topMargin + getPaddingTop();
                                    } else if (i11 != 80) {
                                        paddingTop = layoutParams.topMargin;
                                    } else {
                                        i7 = ((i5 - paddingBottom) - i3) - measuredHeight3;
                                        i8 = layoutParams.bottomMargin;
                                    }
                                    if (childAt instanceof EmojiView) {
                                        if (AndroidUtilities.isTablet()) {
                                            measuredHeight = getMeasuredHeight();
                                            measuredHeight2 = childAt.getMeasuredHeight();
                                        } else {
                                            measuredHeight = getMeasuredHeight() + iMeasureKeyboardHeight;
                                            measuredHeight2 = childAt.getMeasuredHeight();
                                        }
                                        paddingTop = measuredHeight - measuredHeight2;
                                    }
                                    childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight3 + paddingTop);
                                } else {
                                    i7 = ((((i5 - paddingBottom) - i3) - measuredHeight3) / 2) + layoutParams.topMargin;
                                    i8 = layoutParams.bottomMargin;
                                }
                                paddingTop = i7 - i8;
                                if (childAt instanceof EmojiView) {
                                    if (AndroidUtilities.isTablet()) {
                                        measuredHeight = getMeasuredHeight();
                                        measuredHeight2 = childAt.getMeasuredHeight();
                                    } else {
                                        measuredHeight = getMeasuredHeight() + iMeasureKeyboardHeight;
                                        measuredHeight2 = childAt.getMeasuredHeight();
                                    }
                                    paddingTop = measuredHeight - measuredHeight2;
                                }
                                childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight3 + paddingTop);
                            } else {
                                paddingRight = (((i4 - i2) - measuredWidth) / 2) + layoutParams.leftMargin;
                                i6 = layoutParams.rightMargin;
                            }
                            paddingLeft = paddingRight - i6;
                            if (i11 != 16) {
                                if (i11 != 48) {
                                    paddingTop = layoutParams.topMargin + getPaddingTop();
                                } else if (i11 != 80) {
                                    paddingTop = layoutParams.topMargin;
                                } else {
                                    i7 = ((i5 - paddingBottom) - i3) - measuredHeight3;
                                    i8 = layoutParams.bottomMargin;
                                }
                                if (childAt instanceof EmojiView) {
                                    if (AndroidUtilities.isTablet()) {
                                        measuredHeight = getMeasuredHeight();
                                        measuredHeight2 = childAt.getMeasuredHeight();
                                    } else {
                                        measuredHeight = getMeasuredHeight() + iMeasureKeyboardHeight;
                                        measuredHeight2 = childAt.getMeasuredHeight();
                                    }
                                    paddingTop = measuredHeight - measuredHeight2;
                                }
                                childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight3 + paddingTop);
                            } else {
                                i7 = ((((i5 - paddingBottom) - i3) - measuredHeight3) / 2) + layoutParams.topMargin;
                                i8 = layoutParams.bottomMargin;
                            }
                            paddingTop = i7 - i8;
                            if (childAt instanceof EmojiView) {
                                if (AndroidUtilities.isTablet()) {
                                    measuredHeight = getMeasuredHeight();
                                    measuredHeight2 = childAt.getMeasuredHeight();
                                } else {
                                    measuredHeight = getMeasuredHeight() + iMeasureKeyboardHeight;
                                    measuredHeight2 = childAt.getMeasuredHeight();
                                }
                                paddingTop = measuredHeight - measuredHeight2;
                            }
                            childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight3 + paddingTop);
                        }
                    }
                    notifyHeightChanged();
                }

                @Override
                public final void onMeasure(int i2, int i3) {
                    int i4;
                    EditEmojiTextCell.AnonymousClass2 anonymousClass2;
                    int size = View.MeasureSpec.getSize(i3);
                    BottomSheetWithRecyclerListView bottomSheetWithRecyclerListView = BottomSheetWithRecyclerListView.this;
                    bottomSheetWithRecyclerListView.contentHeight = size;
                    bottomSheetWithRecyclerListView.onPreMeasure(i2, i3);
                    if (z5) {
                        i3 = View.MeasureSpec.makeMeasureSpec(bottomSheetWithRecyclerListView.contentHeight, 1073741824);
                    }
                    if (bottomSheetWithRecyclerListView.editTextEmoji == null) {
                        super.onMeasure(i2, i3);
                        return;
                    }
                    int size2 = View.MeasureSpec.getSize(i2);
                    int size3 = View.MeasureSpec.getSize(i3);
                    setMeasuredDimension(size2, size3);
                    EditEmojiTextCell.AnonymousClass2 anonymousClass3 = bottomSheetWithRecyclerListView.editTextEmoji;
                    if (anonymousClass3 != null && !anonymousClass3.waitingForKeyboardOpen && AndroidUtilities.dp(20.0f) >= 0) {
                        EditEmojiTextCell.AnonymousClass2 anonymousClass4 = bottomSheetWithRecyclerListView.editTextEmoji;
                        if (!anonymousClass4.emojiViewVisible && !anonymousClass4.isAnimatePopupClosing) {
                            anonymousClass4.hideEmojiView();
                        }
                    }
                    int i5 = 0;
                    if (AndroidUtilities.dp(20.0f) >= 0) {
                        int emojiPadding = (((BottomSheet) bottomSheetWithRecyclerListView).keyboardVisible || (anonymousClass2 = bottomSheetWithRecyclerListView.editTextEmoji) == null) ? 0 : anonymousClass2.getEmojiPadding();
                        if (!AndroidUtilities.isInMultiwindow) {
                            size3 -= emojiPadding;
                            i3 = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
                        }
                    }
                    int i6 = i3;
                    int childCount = getChildCount();
                    while (i5 < childCount) {
                        View childAt = getChildAt(i5);
                        if (childAt == null || childAt.getVisibility() == 8) {
                            i4 = i2;
                        } else {
                            EditEmojiTextCell.AnonymousClass2 anonymousClass5 = bottomSheetWithRecyclerListView.editTextEmoji;
                            if (anonymousClass5 == null || !anonymousClass5.isPopupView(childAt)) {
                                i4 = i2;
                                measureChildWithMargins(childAt, i4, 0, i6, 0);
                            } else {
                                if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size2, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                                } else if (AndroidUtilities.isTablet()) {
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size2, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(AndroidUtilities.isTablet() ? 200.0f : 320.0f), getPaddingTop() + (size3 - AndroidUtilities.statusBarHeight)), 1073741824));
                                } else {
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size2, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size3 - AndroidUtilities.statusBarHeight), 1073741824));
                                }
                                i4 = i2;
                            }
                        }
                        i5++;
                        i2 = i4;
                    }
                }
            };
        }
        RecyclerListView recyclerListViewCreateRecyclerView = createRecyclerView(context);
        this.recyclerListView = recyclerListViewCreateRecyclerView;
        PhotoViewer.AnonymousClass36 anonymousClass36 = new PhotoViewer.AnonymousClass36(z6 ? 1 : 0, 5, z7);
        this.layoutManager = anonymousClass36;
        if (z5) {
            anonymousClass36.assertNotInLayoutOrScroll(null);
            if (!anonymousClass36.mStackFromEnd) {
                anonymousClass36.mStackFromEnd = true;
                RecyclerView recyclerView = anonymousClass36.mRecyclerView;
                if (recyclerView != null) {
                    recyclerView.requestLayout();
                }
            }
        }
        recyclerListViewCreateRecyclerView.setLayoutManager(anonymousClass36);
        AnonymousClass1 anonymousClass1 = this.nestedSizeNotifierLayout;
        if (anonymousClass1 != null) {
            anonymousClass1.setBottomSheetContainerView(getContainer());
            setTargetListView(recyclerListViewCreateRecyclerView);
        }
        if (z3) {
            recyclerListViewCreateRecyclerView.setHasFixedSize(true);
            recyclerListViewCreateRecyclerView.setAdapter(createAdapter(recyclerListViewCreateRecyclerView));
            setCustomView(r8);
            r8.addView(recyclerListViewCreateRecyclerView, LayoutHelper.createFrame(-2.0f, -1));
        } else {
            recyclerListViewCreateRecyclerView.setAdapter(new AnonymousClass8(this, createAdapter(recyclerListViewCreateRecyclerView), context));
            this.containerView = r8;
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(context, r8);
            this.actionBar = anonymousClass4;
            anonymousClass4.setBackgroundColor(getThemedColor(Theme.key_dialogBackground));
            anonymousClass4.setTitleColor(getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
            anonymousClass4.setItemsBackgroundColor(getThemedColor(Theme.key_actionBarActionModeDefaultSelector), false);
            anonymousClass4.setBackButtonImage(R.drawable.ic_ab_back);
            anonymousClass4.setItemsColor(getThemedColor(Theme.key_actionBarActionModeDefaultIcon), false);
            anonymousClass4.setCastShadows(true);
            anonymousClass4.setTitle(getTitle());
            anonymousClass4.setActionBarMenuOnItemClick(new CallLogActivity.AnonymousClass1(this, 28));
            r8.addView(recyclerListViewCreateRecyclerView);
            r8.addView(anonymousClass4, LayoutHelper.createFrame(-1, -2.0f, 0, 6.0f, 0.0f, 6.0f, 0.0f));
            recyclerListViewCreateRecyclerView.addOnScrollListener(new ChatActivity.AnonymousClass53(r8, 14));
        }
        if (i == 2) {
            setSlidingActionBar();
        }
        onViewCreated(r8);
        if (this.attachedFragment != null) {
            LaunchActivity.instance.checkSystemBarColors(true, true, true);
            return;
        }
        AnonymousClass4 anonymousClass5 = this.actionBar;
        if (anonymousClass5 != null && anonymousClass5.getTag() != null) {
            AndroidUtilities.setLightStatusBar((Dialog) this, ColorUtils.calculateLuminance(Theme.getColor(Theme.key_dialogBackground, this.resourcesProvider)) > 0.699999988079071d);
        } else if (baseFragment != null) {
            AndroidUtilities.setLightStatusBar((Dialog) this, baseFragment.isLightStatusBar());
        }
    }
}
