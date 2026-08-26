package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Display;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.PopupMenu;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;

public final class FloatingActionMode extends ActionMode {
    public final int mBottomAllowance;
    public final ActionMode.Callback2 mCallback;
    public final Rect mContentRect;
    public final Rect mContentRectOnScreen;
    public final Context mContext;
    public final Point mDisplaySize;
    public final FloatingToolbar mFloatingToolbar;
    public final FloatingToolbarVisibilityHelper mFloatingToolbarVisibilityHelper;
    public final Menu mMenu;
    public final View mOriginatingView;
    public final Rect mPreviousContentRectOnScreen;
    public final int[] mPreviousViewPositionOnScreen;
    public final Rect mPreviousViewRectOnScreen;
    public final int[] mRootViewPositionOnScreen;
    public final Rect mScreenRect;
    public final int[] mViewPositionOnScreen;
    public final Rect mViewRectOnScreen;
    public final AnonymousClass1 mMovingOff = new AnonymousClass1(this, 0);
    public final AnonymousClass1 mHideOff = new AnonymousClass1(this, 1);

    public final class AnonymousClass1 implements Runnable {
        public final int $r8$classId;
        public final FloatingActionMode this$0;

        public AnonymousClass1(FloatingActionMode floatingActionMode, int i) {
            this.$r8$classId = i;
            this.this$0 = floatingActionMode;
        }

        @Override
        public final void run() {
            switch (this.$r8$classId) {
                case 0:
                    FloatingActionMode floatingActionMode = this.this$0;
                    if (floatingActionMode.mOriginatingView.getWindowVisibility() == 0 && floatingActionMode.mOriginatingView.isShown()) {
                        FloatingToolbarVisibilityHelper floatingToolbarVisibilityHelper = floatingActionMode.mFloatingToolbarVisibilityHelper;
                        floatingToolbarVisibilityHelper.getClass();
                        System.currentTimeMillis();
                        floatingToolbarVisibilityHelper.mMoving = false;
                        floatingActionMode.mFloatingToolbarVisibilityHelper.updateToolbarVisibility();
                        break;
                    }
                    break;
                default:
                    FloatingActionMode floatingActionMode2 = this.this$0;
                    if (floatingActionMode2.mOriginatingView.getWindowVisibility() == 0 && floatingActionMode2.mOriginatingView.isShown()) {
                        FloatingToolbarVisibilityHelper floatingToolbarVisibilityHelper2 = floatingActionMode2.mFloatingToolbarVisibilityHelper;
                        floatingToolbarVisibilityHelper2.mHideRequested = false;
                        floatingToolbarVisibilityHelper2.updateToolbarVisibility();
                        break;
                    }
                    break;
            }
        }
    }

    public final class FloatingToolbarVisibilityHelper {
        public boolean mActive;
        public boolean mHideRequested;
        public long mLastShowTime;
        public boolean mMoving;
        public boolean mOutOfBounds;
        public final FloatingToolbar mToolbar;
        public boolean mWindowFocused = true;

        public FloatingToolbarVisibilityHelper(FloatingToolbar floatingToolbar) {
            this.mToolbar = floatingToolbar;
        }

        public final void updateToolbarVisibility() {
            if (this.mActive) {
                boolean z = this.mHideRequested;
                FloatingToolbar floatingToolbar = this.mToolbar;
                if (z || this.mMoving || this.mOutOfBounds || !this.mWindowFocused) {
                    FloatingToolbar.FloatingToolbarPopup floatingToolbarPopup = floatingToolbar.mPopup;
                    if (floatingToolbarPopup.isShowing()) {
                        floatingToolbarPopup.mHidden = true;
                        floatingToolbarPopup.mHideAnimation.start();
                        floatingToolbarPopup.mTouchableRegion.setEmpty();
                        return;
                    }
                    return;
                }
                View view = floatingToolbar.mWindowView;
                FloatingToolbar.AnonymousClass1 anonymousClass1 = floatingToolbar.mOrientationChangeHandler;
                view.removeOnLayoutChangeListener(anonymousClass1);
                view.addOnLayoutChangeListener(anonymousClass1);
                floatingToolbar.doShow();
                this.mLastShowTime = System.currentTimeMillis();
            }
        }
    }

    public FloatingActionMode(Context context, ActionMode.Callback2 callback2, View view, FloatingToolbar floatingToolbar) {
        this.mContext = context;
        this.mCallback = callback2;
        PopupMenu popupMenu = new PopupMenu(context, null);
        Menu menu = popupMenu.getMenu();
        this.mMenu = menu;
        setType(1);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return this.f$0.lambda$new$0(menuItem);
            }
        });
        this.mContentRect = new Rect();
        this.mContentRectOnScreen = new Rect();
        this.mPreviousContentRectOnScreen = new Rect();
        int[] iArr = new int[2];
        this.mViewPositionOnScreen = iArr;
        this.mPreviousViewPositionOnScreen = new int[2];
        this.mRootViewPositionOnScreen = new int[2];
        this.mViewRectOnScreen = new Rect();
        this.mPreviousViewRectOnScreen = new Rect();
        this.mScreenRect = new Rect();
        this.mOriginatingView = view;
        view.getLocationOnScreen(iArr);
        this.mBottomAllowance = AndroidUtilities.dp(20.0f);
        this.mDisplaySize = new Point();
        floatingToolbar.mMenu = menu;
        floatingToolbar.mMenuItemClickListener = new MenuItem.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return this.f$0.lambda$setFloatingToolbar$1(menuItem);
            }
        };
        this.mFloatingToolbar = floatingToolbar;
        FloatingToolbarVisibilityHelper floatingToolbarVisibilityHelper = new FloatingToolbarVisibilityHelper(floatingToolbar);
        this.mFloatingToolbarVisibilityHelper = floatingToolbarVisibilityHelper;
        floatingToolbarVisibilityHelper.mHideRequested = false;
        floatingToolbarVisibilityHelper.mMoving = false;
        floatingToolbarVisibilityHelper.mOutOfBounds = false;
        floatingToolbarVisibilityHelper.mWindowFocused = true;
        floatingToolbarVisibilityHelper.mActive = true;
    }

    @Override
    public final void finish() {
        this.mFloatingToolbar.dismiss();
        FloatingToolbarVisibilityHelper floatingToolbarVisibilityHelper = this.mFloatingToolbarVisibilityHelper;
        floatingToolbarVisibilityHelper.mActive = false;
        floatingToolbarVisibilityHelper.mToolbar.dismiss();
        AnonymousClass1 anonymousClass1 = this.mMovingOff;
        View view = this.mOriginatingView;
        view.removeCallbacks(anonymousClass1);
        view.removeCallbacks(this.mHideOff);
        this.mCallback.onDestroyActionMode(this);
    }

    @Override
    public final View getCustomView() {
        return null;
    }

    @Override
    public final Menu getMenu() {
        return this.mMenu;
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return new MenuInflater(this.mContext);
    }

    @Override
    public final CharSequence getSubtitle() {
        return null;
    }

    @Override
    public final CharSequence getTitle() {
        return null;
    }

    @Override
    public final void hide(long j) {
        if (j == -1) {
            j = ViewConfiguration.getDefaultActionModeHideDuration();
        }
        long jMin = Math.min(3000L, j);
        View view = this.mOriginatingView;
        AnonymousClass1 anonymousClass1 = this.mHideOff;
        view.removeCallbacks(anonymousClass1);
        if (jMin <= 0) {
            anonymousClass1.run();
            return;
        }
        FloatingToolbarVisibilityHelper floatingToolbarVisibilityHelper = this.mFloatingToolbarVisibilityHelper;
        floatingToolbarVisibilityHelper.mHideRequested = true;
        floatingToolbarVisibilityHelper.updateToolbarVisibility();
        view.postDelayed(anonymousClass1, jMin);
    }

    @Override
    public final void invalidate() {
        this.mCallback.onPrepareActionMode(this, this.mMenu);
        invalidateContentRect();
    }

    @Override
    public final void invalidateContentRect() {
        ActionMode.Callback2 callback2 = this.mCallback;
        View view = this.mOriginatingView;
        Rect rect = this.mContentRect;
        callback2.onGetContentRect(this, view, rect);
        if (rect.left == 0 && rect.right == 0) {
            rect.left = 1;
            rect.right = 1;
        }
        repositionToolbar();
    }

    public final boolean lambda$new$0(MenuItem menuItem) {
        return this.mCallback.onActionItemClicked(this, menuItem);
    }

    public final boolean lambda$setFloatingToolbar$1(MenuItem menuItem) {
        return this.mCallback.onActionItemClicked(this, menuItem);
    }

    @Override
    public final void onWindowFocusChanged(boolean z) {
        FloatingToolbarVisibilityHelper floatingToolbarVisibilityHelper = this.mFloatingToolbarVisibilityHelper;
        floatingToolbarVisibilityHelper.mWindowFocused = z;
        floatingToolbarVisibilityHelper.updateToolbarVisibility();
    }

    public final void repositionToolbar() {
        int i;
        int i2;
        Rect rect = this.mContentRectOnScreen;
        rect.set(this.mContentRect);
        View view = this.mOriginatingView;
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            parent.getChildVisibleRect(view, rect, null);
            int[] iArr = this.mRootViewPositionOnScreen;
            rect.offset(iArr[0], iArr[1]);
        } else {
            int[] iArr2 = this.mViewPositionOnScreen;
            rect.offset(iArr2[0], iArr2[1]);
        }
        Display defaultDisplay = ((WindowManager) this.mContext.getSystemService(WindowManager.class)).getDefaultDisplay();
        Point point = this.mDisplaySize;
        defaultDisplay.getRealSize(point);
        int i3 = point.x;
        int i4 = point.y;
        Rect rect2 = this.mScreenRect;
        rect2.set(0, 0, i3, i4);
        int i5 = rect.left;
        int i6 = rect2.right;
        Rect rect3 = this.mPreviousContentRectOnScreen;
        if (i5 <= i6) {
            int i7 = rect2.left;
            int i8 = rect.right;
            if (i7 > i8 || (i = rect.top) > rect2.bottom) {
                this.mFloatingToolbarVisibilityHelper.mOutOfBounds = true;
                rect.setEmpty();
            } else {
                int i9 = rect2.top;
                int i10 = rect.bottom;
                if (i9 <= i10) {
                    Rect rect4 = this.mViewRectOnScreen;
                    if (i5 > rect4.right || (i2 = rect4.left) > i8 || i > rect4.bottom || rect4.top > i10) {
                        this.mFloatingToolbarVisibilityHelper.mOutOfBounds = true;
                        rect.setEmpty();
                    } else {
                        this.mFloatingToolbarVisibilityHelper.mOutOfBounds = false;
                        rect.set(Math.max(i5, i2), Math.max(rect.top, rect4.top), Math.min(rect.right, rect4.right), Math.min(rect.bottom, rect4.bottom + this.mBottomAllowance));
                        if (!rect.equals(rect3)) {
                            Runnable runnable = this.mMovingOff;
                            view.removeCallbacks(runnable);
                            FloatingToolbarVisibilityHelper floatingToolbarVisibilityHelper = this.mFloatingToolbarVisibilityHelper;
                            floatingToolbarVisibilityHelper.getClass();
                            if (System.currentTimeMillis() - floatingToolbarVisibilityHelper.mLastShowTime > 500) {
                                floatingToolbarVisibilityHelper.mMoving = true;
                            }
                            view.postDelayed(runnable, 50L);
                            this.mFloatingToolbar.mContentRect.set(rect);
                            FloatingToolbar floatingToolbar = this.mFloatingToolbar;
                            if (floatingToolbar.mPopup.isShowing()) {
                                floatingToolbar.doShow();
                            }
                        }
                    }
                } else {
                    this.mFloatingToolbarVisibilityHelper.mOutOfBounds = true;
                    rect.setEmpty();
                }
            }
        } else {
            this.mFloatingToolbarVisibilityHelper.mOutOfBounds = true;
            rect.setEmpty();
        }
        this.mFloatingToolbarVisibilityHelper.updateToolbarVisibility();
        rect3.set(rect);
    }

    @Override
    public final void setCustomView(View view) {
    }

    @Override
    public final void setSubtitle(int i) {
    }

    @Override
    public final void setTitle(int i) {
    }

    public final void updateViewLocationInWindow() {
        View view = this.mOriginatingView;
        int[] iArr = this.mViewPositionOnScreen;
        view.getLocationOnScreen(iArr);
        View rootView = view.getRootView();
        int[] iArr2 = this.mRootViewPositionOnScreen;
        rootView.getLocationOnScreen(iArr2);
        Rect rect = this.mViewRectOnScreen;
        view.getGlobalVisibleRect(rect);
        rect.offset(iArr2[0], iArr2[1]);
        int[] iArr3 = this.mPreviousViewPositionOnScreen;
        boolean zEquals = Arrays.equals(iArr, iArr3);
        Rect rect2 = this.mPreviousViewRectOnScreen;
        if (zEquals && rect.equals(rect2)) {
            return;
        }
        repositionToolbar();
        iArr3[0] = iArr[0];
        iArr3[1] = iArr[1];
        rect2.set(rect);
    }

    @Override
    public final void setSubtitle(CharSequence charSequence) {
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
    }
}
