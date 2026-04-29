package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.LaunchActivity;

public abstract class BottomSheetWithRecyclerListView extends BottomSheet {
    protected ActionBar actionBar;
    protected boolean actionBarIgnoreTouchEvents;
    protected AnimatedFloat actionBarSlideProgress;
    private ActionBarType actionBarType;
    private BaseFragment baseFragment;
    protected boolean centerTitle;
    protected boolean clipToActionBar;
    protected int contentHeight;
    EditTextEmoji editTextEmoji;
    protected boolean handleOffset;
    private RectF handleRect;
    public final boolean hasFixedSize;
    protected int headerHeight;
    protected int headerMoveTop;
    protected int headerPaddingBottom;
    protected int headerPaddingTop;
    private final Drawable headerShadowDrawable;
    protected int headerTotalHeight;
    protected boolean ignoreTouchActionBar;
    private float lastTop;
    protected LinearLayoutManager layoutManager;
    public NestedSizeNotifierLayout nestedSizeNotifierLayout;
    protected RecyclerListView recyclerListView;
    private boolean restore;
    public boolean reverseLayout;
    private int savedScrollOffset;
    private int savedScrollPosition;
    private float shadowAlpha;
    private boolean showHandle;
    protected boolean showShadow;
    public final boolean stackFromEnd;
    protected boolean takeTranslationIntoAccount;
    public float topPadding;
    boolean wasDrawn;

    public enum ActionBarType {
        FADING,
        SLIDING
    }

    @Override
    protected boolean canDismissWithSwipe() {
        return false;
    }

    public boolean canHighlightChildAt(View view, float f, float f2) {
        return true;
    }

    protected abstract RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView);

    protected abstract CharSequence getTitle();

    protected boolean needPaddingShadow() {
        return true;
    }

    protected void onActionBarAlpha(float f) {
    }

    protected void onPreDraw(Canvas canvas, int i, float f) {
    }

    protected void onPreMeasure(int i, int i2) {
    }

    public void onSheetTop(float f) {
    }

    public void onViewCreated(FrameLayout frameLayout) {
    }

    protected boolean shouldDrawBackground() {
        return true;
    }

    public BottomSheetWithRecyclerListView(BaseFragment baseFragment, boolean z, boolean z2) {
        this(baseFragment, z, z2, false, baseFragment == null ? null : baseFragment.getResourceProvider());
    }

    public BottomSheetWithRecyclerListView(BaseFragment baseFragment, boolean z, boolean z2, boolean z3, Theme.ResourcesProvider resourcesProvider) {
        this(baseFragment.getParentActivity(), baseFragment, z, z2, z3, resourcesProvider);
    }

    public BottomSheetWithRecyclerListView(BaseFragment baseFragment, boolean z, boolean z2, ActionBarType actionBarType) {
        this(baseFragment.getParentActivity(), baseFragment, z, z2, false, actionBarType, baseFragment.getResourceProvider());
    }

    public BottomSheetWithRecyclerListView(Context context, BaseFragment baseFragment, boolean z, boolean z2, boolean z3, Theme.ResourcesProvider resourcesProvider) {
        this(context, baseFragment, z, z2, z3, ActionBarType.FADING, resourcesProvider);
    }

    public BottomSheetWithRecyclerListView(Context context, BaseFragment baseFragment, boolean z, boolean z2, boolean z3, ActionBarType actionBarType, Theme.ResourcesProvider resourcesProvider) {
        this(context, baseFragment, z, z2, z3, false, actionBarType, resourcesProvider);
    }

    public void setEditTextEmoji(EditTextEmoji editTextEmoji) {
        this.editTextEmoji = editTextEmoji;
    }

    public BottomSheetWithRecyclerListView(Context context, BaseFragment baseFragment, boolean z, boolean z2, boolean z3, boolean z4, ActionBarType actionBarType, Theme.ResourcesProvider resourcesProvider) {
        this(context, baseFragment, z, false, z2, z3, z4, actionBarType, resourcesProvider);
    }

    public BottomSheetWithRecyclerListView(Context context, BaseFragment baseFragment, boolean z, boolean z2, final boolean z3, boolean z4, final boolean z5, ActionBarType actionBarType, Theme.ResourcesProvider resourcesProvider) {
        final SizeNotifierFrameLayout sizeNotifierFrameLayout;
        super(context, z, z2, resourcesProvider);
        this.topPadding = 0.4f;
        this.showShadow = true;
        this.shadowAlpha = 1.0f;
        this.showHandle = false;
        this.handleRect = new RectF();
        this.actionBarType = ActionBarType.FADING;
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
        this.stackFromEnd = z5;
        this.headerShadowDrawable = ContextCompat.getDrawable(context, R.drawable.header_shadow).mutate();
        if (z4) {
            NestedSizeNotifierLayout nestedSizeNotifierLayout = new NestedSizeNotifierLayout(context) {
                @Override
                protected void onMeasure(int i, int i2) {
                    BottomSheetWithRecyclerListView.this.contentHeight = View.MeasureSpec.getSize(i2);
                    BottomSheetWithRecyclerListView.this.onPreMeasure(i, i2);
                    if (z5) {
                        i2 = View.MeasureSpec.makeMeasureSpec(BottomSheetWithRecyclerListView.this.contentHeight, 1073741824);
                    }
                    super.onMeasure(i, i2);
                }

                @Override
                protected void dispatchDraw(Canvas canvas) {
                    BottomSheetWithRecyclerListView.this.preDrawInternal(canvas, this);
                    super.dispatchDraw(canvas);
                    BottomSheetWithRecyclerListView.this.postDrawInternal(canvas, this);
                }

                @Override
                protected boolean drawChild(Canvas canvas, View view, long j) {
                    if (!z3) {
                        BottomSheetWithRecyclerListView bottomSheetWithRecyclerListView = BottomSheetWithRecyclerListView.this;
                        if (bottomSheetWithRecyclerListView.clipToActionBar && view == bottomSheetWithRecyclerListView.recyclerListView) {
                            canvas.save();
                            canvas.clipRect(0, BottomSheetWithRecyclerListView.this.actionBar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
                            super.drawChild(canvas, view, j);
                            canvas.restore();
                            return true;
                        }
                    }
                    return super.drawChild(canvas, view, j);
                }

                @Override
                public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 0 && motionEvent.getY() < ((BottomSheet) BottomSheetWithRecyclerListView.this).shadowDrawable.getBounds().top) {
                        BottomSheetWithRecyclerListView.this.dismiss();
                    }
                    return super.dispatchTouchEvent(motionEvent);
                }
            };
            this.nestedSizeNotifierLayout = nestedSizeNotifierLayout;
            sizeNotifierFrameLayout = nestedSizeNotifierLayout;
        } else {
            sizeNotifierFrameLayout = new SizeNotifierFrameLayout(context) {
                private boolean ignoreLayout = false;

                @Override
                protected void onMeasure(int i, int i2) {
                    BottomSheetWithRecyclerListView.this.contentHeight = View.MeasureSpec.getSize(i2);
                    BottomSheetWithRecyclerListView.this.onPreMeasure(i, i2);
                    if (z5) {
                        i2 = View.MeasureSpec.makeMeasureSpec(BottomSheetWithRecyclerListView.this.contentHeight, 1073741824);
                    }
                    if (BottomSheetWithRecyclerListView.this.editTextEmoji != null) {
                        onMeasureInternal(i, i2);
                    } else {
                        super.onMeasure(i, i2);
                    }
                }

                private void onMeasureInternal(int i, int i2) {
                    EditTextEmoji editTextEmoji;
                    int size = View.MeasureSpec.getSize(i);
                    int size2 = View.MeasureSpec.getSize(i2);
                    setMeasuredDimension(size, size2);
                    EditTextEmoji editTextEmoji2 = BottomSheetWithRecyclerListView.this.editTextEmoji;
                    if (editTextEmoji2 != null && !editTextEmoji2.isWaitingForKeyboardOpen() && AndroidUtilities.dp(20.0f) >= 0 && !BottomSheetWithRecyclerListView.this.editTextEmoji.isPopupShowing() && !BottomSheetWithRecyclerListView.this.editTextEmoji.isAnimatePopupClosing()) {
                        this.ignoreLayout = true;
                        BottomSheetWithRecyclerListView.this.editTextEmoji.hideEmojiView();
                        this.ignoreLayout = false;
                    }
                    if (AndroidUtilities.dp(20.0f) >= 0) {
                        int emojiPadding = (((BottomSheet) BottomSheetWithRecyclerListView.this).keyboardVisible || (editTextEmoji = BottomSheetWithRecyclerListView.this.editTextEmoji) == null) ? 0 : editTextEmoji.getEmojiPadding();
                        if (!AndroidUtilities.isInMultiwindow) {
                            size2 -= emojiPadding;
                            i2 = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
                        }
                    }
                    int childCount = getChildCount();
                    for (int i3 = 0; i3 < childCount; i3++) {
                        View childAt = getChildAt(i3);
                        if (childAt != null && childAt.getVisibility() != 8) {
                            EditTextEmoji editTextEmoji3 = BottomSheetWithRecyclerListView.this.editTextEmoji;
                            if (editTextEmoji3 != null && editTextEmoji3.isPopupView(childAt)) {
                                if (AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) {
                                    if (AndroidUtilities.isTablet()) {
                                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(AndroidUtilities.isTablet() ? 200.0f : 320.0f), (size2 - AndroidUtilities.statusBarHeight) + getPaddingTop()), 1073741824));
                                    } else {
                                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - AndroidUtilities.statusBarHeight) + getPaddingTop(), 1073741824));
                                    }
                                } else {
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                                }
                            } else {
                                measureChildWithMargins(childAt, i, 0, i2, 0);
                            }
                        }
                    }
                }

                @Override
                protected void dispatchDraw(Canvas canvas) {
                    BottomSheetWithRecyclerListView.this.preDrawInternal(canvas, this);
                    super.dispatchDraw(canvas);
                    BottomSheetWithRecyclerListView.this.postDrawInternal(canvas, this);
                }

                @Override
                protected boolean drawChild(Canvas canvas, View view, long j) {
                    if (!z3) {
                        BottomSheetWithRecyclerListView bottomSheetWithRecyclerListView = BottomSheetWithRecyclerListView.this;
                        if (bottomSheetWithRecyclerListView.clipToActionBar && view == bottomSheetWithRecyclerListView.recyclerListView) {
                            canvas.save();
                            canvas.clipRect(0, BottomSheetWithRecyclerListView.this.actionBar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
                            super.drawChild(canvas, view, j);
                            canvas.restore();
                            return true;
                        }
                    }
                    return super.drawChild(canvas, view, j);
                }

                @Override
                public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 0 && motionEvent.getY() < ((BottomSheet) BottomSheetWithRecyclerListView.this).shadowDrawable.getBounds().top) {
                        BottomSheetWithRecyclerListView.this.dismiss();
                    }
                    return super.dispatchTouchEvent(motionEvent);
                }

                @Override
                protected void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.BottomSheetWithRecyclerListView.AnonymousClass2.onLayout(boolean, int, int, int, int):void");
                }
            };
        }
        this.recyclerListView = createRecyclerView(context);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context) {
            @Override
            public void scrollToPositionWithOffset(int i, int i2) {
                super.scrollToPositionWithOffset(i, i2);
            }

            @Override
            public void scrollToPosition(int i) {
                super.scrollToPosition(i);
            }

            @Override
            public void scrollToPositionWithOffset(int i, int i2, boolean z6) {
                super.scrollToPositionWithOffset(i, i2, z6);
            }

            @Override
            public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
                super.smoothScrollToPosition(recyclerView, state, i);
            }
        };
        this.layoutManager = linearLayoutManager;
        if (z5) {
            linearLayoutManager.setStackFromEnd(true);
        }
        this.recyclerListView.setLayoutManager(this.layoutManager);
        NestedSizeNotifierLayout nestedSizeNotifierLayout2 = this.nestedSizeNotifierLayout;
        if (nestedSizeNotifierLayout2 != null) {
            nestedSizeNotifierLayout2.setBottomSheetContainerView(getContainer());
            this.nestedSizeNotifierLayout.setTargetListView(this.recyclerListView);
        }
        if (z3) {
            this.recyclerListView.setHasFixedSize(true);
            RecyclerListView recyclerListView = this.recyclerListView;
            recyclerListView.setAdapter(createAdapter(recyclerListView));
            setCustomView(sizeNotifierFrameLayout);
            sizeNotifierFrameLayout.addView(this.recyclerListView, LayoutHelper.createFrame(-1, -2.0f));
        } else {
            resetAdapter(context);
            this.containerView = sizeNotifierFrameLayout;
            ActionBar actionBar = new ActionBar(context) {
                @Override
                public void setAlpha(float f) {
                    if (getAlpha() != f) {
                        super.setAlpha(f);
                        sizeNotifierFrameLayout.invalidate();
                    }
                }

                @Override
                public void setTag(Object obj) {
                    super.setTag(obj);
                    BottomSheetWithRecyclerListView.this.updateStatusBar();
                }

                @Override
                public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                    BottomSheetWithRecyclerListView bottomSheetWithRecyclerListView = BottomSheetWithRecyclerListView.this;
                    if (bottomSheetWithRecyclerListView.ignoreTouchActionBar && bottomSheetWithRecyclerListView.actionBarIgnoreTouchEvents) {
                        return false;
                    }
                    return super.dispatchTouchEvent(motionEvent);
                }
            };
            this.actionBar = actionBar;
            actionBar.setBackgroundColor(getThemedColor(Theme.key_dialogBackground));
            this.actionBar.setTitleColor(getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
            this.actionBar.setItemsBackgroundColor(getThemedColor(Theme.key_actionBarActionModeDefaultSelector), false);
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
            this.actionBar.setItemsColor(getThemedColor(Theme.key_actionBarActionModeDefaultIcon), false);
            this.actionBar.setCastShadows(true);
            this.actionBar.setTitle(getTitle());
            this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
                @Override
                public void onItemClick(int i) {
                    if (i == -1) {
                        BottomSheetWithRecyclerListView.this.dismiss();
                    }
                }
            });
            sizeNotifierFrameLayout.addView(this.recyclerListView);
            sizeNotifierFrameLayout.addView(this.actionBar, LayoutHelper.createFrame(-1, -2.0f, 0, 6.0f, 0.0f, 6.0f, 0.0f));
            this.recyclerListView.addOnScrollListener(new RecyclerView.OnScrollListener() {
                @Override
                public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    super.onScrolled(recyclerView, i, i2);
                    sizeNotifierFrameLayout.invalidate();
                }
            });
        }
        if (actionBarType == ActionBarType.SLIDING) {
            setSlidingActionBar();
        }
        onViewCreated(sizeNotifierFrameLayout);
        updateStatusBar();
    }

    public void setSlidingActionBar() {
        if (this.hasFixedSize) {
            return;
        }
        this.actionBarType = ActionBarType.SLIDING;
        int currentActionBarHeight = ActionBar.getCurrentActionBarHeight();
        this.headerHeight = currentActionBarHeight;
        this.headerTotalHeight = currentActionBarHeight + AndroidUtilities.statusBarHeight;
        this.headerPaddingTop = AndroidUtilities.dp(16.0f);
        this.headerPaddingBottom = AndroidUtilities.dp(-20.0f);
        this.actionBarSlideProgress = new AnimatedFloat(this.containerView, 0L, 350L, CubicBezierInterpolator.EASE_OUT_QUINT);
        this.actionBar.backButtonImageView.setPivotX(0.0f);
        this.recyclerListView.setClipToPadding(true);
    }

    protected RecyclerListView createRecyclerView(Context context) {
        return new RecyclerListView(context, this.resourcesProvider) {
            @Override
            protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
                BottomSheetWithRecyclerListView.this.applyScrolledPosition();
                super.onLayout(z, i, i2, i3, i4);
            }

            @Override
            protected boolean canHighlightChildAt(View view, float f, float f2) {
                return BottomSheetWithRecyclerListView.this.canHighlightChildAt(view, f, f2);
            }
        };
    }

    private class PaddingView extends View {
        public PaddingView(Context context) {
            super(context);
            setTag(-33024);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int iDp;
            BottomSheetWithRecyclerListView bottomSheetWithRecyclerListView = BottomSheetWithRecyclerListView.this;
            int i3 = bottomSheetWithRecyclerListView.contentHeight;
            if (i3 == 0) {
                iDp = AndroidUtilities.dp(300.0f);
            } else {
                iDp = (int) (i3 * bottomSheetWithRecyclerListView.topPadding);
            }
            BottomSheetWithRecyclerListView bottomSheetWithRecyclerListView2 = BottomSheetWithRecyclerListView.this;
            int i4 = iDp - (((bottomSheetWithRecyclerListView2.headerTotalHeight - bottomSheetWithRecyclerListView2.headerHeight) - bottomSheetWithRecyclerListView2.headerPaddingTop) - bottomSheetWithRecyclerListView2.headerPaddingBottom);
            if (i4 < 1) {
                i4 = 1;
            }
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
        }

        @Override
        public void setTranslationY(float f) {
            super.setTranslationY(f);
            ((BottomSheet) BottomSheetWithRecyclerListView.this).containerView.invalidate();
        }
    }

    protected void resetAdapter(final Context context) {
        final RecyclerListView.SelectionAdapter selectionAdapterCreateAdapter = createAdapter(this.recyclerListView);
        this.recyclerListView.setAdapter(new RecyclerListView.SelectionAdapter() {
            @Override
            public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
                return selectionAdapterCreateAdapter.isEnabled(viewHolder);
            }

            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                if (i == -1000) {
                    return new RecyclerListView.Holder(BottomSheetWithRecyclerListView.this.new PaddingView(context));
                }
                return selectionAdapterCreateAdapter.onCreateViewHolder(viewGroup, i);
            }

            @Override
            public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                if (i != (BottomSheetWithRecyclerListView.this.reverseLayout ? getItemCount() - 1 : 0)) {
                    selectionAdapterCreateAdapter.onBindViewHolder(viewHolder, i - (!BottomSheetWithRecyclerListView.this.reverseLayout ? 1 : 0));
                }
            }

            @Override
            public int getItemViewType(int i) {
                if (i == (BottomSheetWithRecyclerListView.this.reverseLayout ? getItemCount() - 1 : 0)) {
                    return -1000;
                }
                return selectionAdapterCreateAdapter.getItemViewType(i - (!BottomSheetWithRecyclerListView.this.reverseLayout ? 1 : 0));
            }

            @Override
            public int getItemCount() {
                return selectionAdapterCreateAdapter.getItemCount() + 1;
            }

            @Override
            public void registerAdapterDataObserver(final RecyclerView.AdapterDataObserver adapterDataObserver) {
                selectionAdapterCreateAdapter.registerAdapterDataObserver(new RecyclerView.AdapterDataObserver() {
                    @Override
                    public void onChanged() {
                        adapterDataObserver.onChanged();
                    }

                    @Override
                    public void onItemRangeChanged(int i, int i2) {
                        adapterDataObserver.onItemRangeChanged(i + (!BottomSheetWithRecyclerListView.this.reverseLayout ? 1 : 0), i2);
                    }

                    @Override
                    public void onItemRangeChanged(int i, int i2, Object obj) {
                        adapterDataObserver.onItemRangeChanged(i + (!BottomSheetWithRecyclerListView.this.reverseLayout ? 1 : 0), i2, obj);
                    }

                    @Override
                    public void onItemRangeInserted(int i, int i2) {
                        adapterDataObserver.onItemRangeInserted(i + (!BottomSheetWithRecyclerListView.this.reverseLayout ? 1 : 0), i2);
                    }

                    @Override
                    public void onItemRangeRemoved(int i, int i2) {
                        adapterDataObserver.onItemRangeRemoved(i + (!BottomSheetWithRecyclerListView.this.reverseLayout ? 1 : 0), i2);
                    }

                    @Override
                    public void onItemRangeMoved(int i, int i2, int i3) {
                        RecyclerView.AdapterDataObserver adapterDataObserver2 = adapterDataObserver;
                        int i4 = !BottomSheetWithRecyclerListView.this.reverseLayout ? 1 : 0;
                        adapterDataObserver2.onItemRangeMoved(i + i4, i2 + i4, i3);
                    }
                });
            }
        });
    }

    public void postDrawInternal(android.graphics.Canvas r8, android.view.View r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.BottomSheetWithRecyclerListView.postDrawInternal(android.graphics.Canvas, android.view.View):void");
    }

    protected int getActionBarProgressHeight() {
        return AndroidUtilities.dp(56.0f);
    }

    public void preDrawInternal(android.graphics.Canvas r13, android.view.View r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.BottomSheetWithRecyclerListView.preDrawInternal(android.graphics.Canvas, android.view.View):void");
    }

    private void checkBackDrawableInsets() {
        if (this.backDrawable == null || this.containerView == null || this.shadowDrawable == null || !shouldDrawBackground() || this.hasFixedSize) {
            return;
        }
        Rect bounds = this.shadowDrawable.getBounds();
        if (this.containerView.getMeasuredWidth() >= this.container.getMeasuredWidth()) {
            this.backDrawable.setBackgroundInsets(0, 0, 0, ((this.containerView.getMeasuredHeight() - bounds.top) - AndroidUtilities.dp(30.0f)) - ((int) this.containerView.getTranslationY()));
        } else {
            this.backDrawable.setBackgroundInsets(0, 0, 0, 0);
        }
    }

    @Override
    protected void onContainerViewTranslation() {
        onSheetTop(this.lastTop);
        checkBackDrawableInsets();
    }

    @Override
    public boolean isAttachedLightStatusBar() {
        ActionBar actionBar = this.actionBar;
        if (actionBar != null && actionBar.getTag() != null) {
            return isLightStatusBar();
        }
        BaseFragment baseFragment = this.baseFragment;
        if (baseFragment != null) {
            return baseFragment.isLightStatusBar();
        }
        return isLightStatusBar();
    }

    private boolean isLightStatusBar() {
        return ColorUtils.calculateLuminance(Theme.getColor(Theme.key_dialogBackground, this.resourcesProvider)) > 0.699999988079071d;
    }

    public void notifyDataSetChanged() {
        this.recyclerListView.getAdapter().notifyDataSetChanged();
    }

    public BaseFragment getBaseFragment() {
        return this.baseFragment;
    }

    public void updateStatusBar() {
        if (this.attachedFragment != null) {
            LaunchActivity.instance.checkSystemBarColors(true, true, true);
            return;
        }
        ActionBar actionBar = this.actionBar;
        if (actionBar != null && actionBar.getTag() != null) {
            AndroidUtilities.setLightStatusBar(getWindow(), isLightStatusBar());
        } else if (this.baseFragment != null) {
            AndroidUtilities.setLightStatusBar(getWindow(), this.baseFragment.isLightStatusBar());
        }
    }

    public void updateTitle() {
        ActionBar actionBar = this.actionBar;
        if (actionBar != null) {
            actionBar.setTitle(getTitle());
        }
    }

    public void updateTitleAnimated() {
        updateTitleAnimated(true);
    }

    public void updateTitleAnimated(boolean z) {
        if (this.actionBar != null) {
            CharSequence title = getTitle();
            if (z && TextUtils.equals(title, this.actionBar.getTitle())) {
                return;
            }
            this.actionBar.setTitleAnimated(getTitle(), false, 350L, CubicBezierInterpolator.EASE_OUT_QUINT);
        }
    }

    public void setShowShadow(boolean z) {
        this.showShadow = z;
        this.nestedSizeNotifierLayout.invalidate();
    }

    public void setShowHandle(boolean z) {
        this.showHandle = z;
    }

    public void saveScrollPosition() {
        RecyclerListView recyclerListView = this.recyclerListView;
        if (recyclerListView == null || this.layoutManager == null || recyclerListView.getChildCount() <= 0) {
            return;
        }
        View view = null;
        int i = -1;
        int top = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < this.recyclerListView.getChildCount(); i2++) {
            View childAt = this.recyclerListView.getChildAt(i2);
            int childAdapterPosition = this.recyclerListView.getChildAdapterPosition(childAt);
            if (childAdapterPosition >= 0 && childAt.getTop() < top) {
                top = childAt.getTop();
                view = childAt;
                i = childAdapterPosition;
            }
        }
        if (view != null) {
            this.savedScrollPosition = i;
            this.savedScrollOffset = view.getTop() + this.containerView.getTop();
            smoothContainerViewLayout();
        }
    }

    public void applyScrolledPosition() {
        applyScrolledPosition(false);
    }

    public void applyScrolledPosition(boolean z) {
        RecyclerListView recyclerListView = this.recyclerListView;
        if (recyclerListView == null || recyclerListView.getLayoutManager() == null || this.savedScrollPosition < 0) {
            return;
        }
        int top = (this.savedScrollOffset - this.containerView.getTop()) - this.recyclerListView.getPaddingTop();
        if (this.recyclerListView.getLayoutManager() instanceof LinearLayoutManager) {
            ((LinearLayoutManager) this.recyclerListView.getLayoutManager()).scrollToPositionWithOffset(this.savedScrollPosition, top);
        }
        this.savedScrollPosition = -1;
    }
}
