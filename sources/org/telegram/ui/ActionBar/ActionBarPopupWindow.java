package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.ScrollView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.PopupSwipeBackLayout;

public class ActionBarPopupWindow extends PopupWindow {
    private static final ViewTreeObserver.OnScrollChangedListener NOP;
    private static DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
    private static Method layoutInScreenMethod;
    private static final Field superListenerField;
    private boolean animationEnabled;
    private int currentAccount;
    private int dismissAnimationDuration;
    private boolean isClosingAnimated;
    private ViewTreeObserver.OnScrollChangedListener mSuperScrollListener;
    private ViewTreeObserver mViewTreeObserver;
    private AnimationNotificationsLocker notificationsLocker;
    private long outEmptyTime;
    private boolean pauseNotifications;
    private boolean scaleOut;
    private AnimatorSet windowAnimatorSet;

    public interface OnDispatchKeyEventListener {
        void onDispatchKeyEvent(KeyEvent keyEvent);
    }

    public interface onSizeChangedListener {
        void onSizeChanged();
    }

    public static void lambda$static$0() {
    }

    static {
        Field declaredField;
        try {
            declaredField = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
            try {
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
        } catch (NoSuchFieldException unused2) {
            declaredField = null;
        }
        superListenerField = declaredField;
        NOP = new ViewTreeObserver.OnScrollChangedListener() {
            @Override
            public final void onScrollChanged() {
                ActionBarPopupWindow.lambda$static$0();
            }
        };
    }

    public void setScaleOut(boolean z) {
        this.scaleOut = z;
    }

    public static class ActionBarPopupWindowLayout extends FrameLayout {
        private boolean animationEnabled;
        private int backAlpha;
        private float backScaleX;
        private float backScaleY;
        private int backgroundColor;
        protected Drawable backgroundDrawable;
        private final Rect bgPaddings;
        public boolean clipChildren;
        private boolean fitItems;
        private int gapEndY;
        private int gapStartY;
        private ArrayList itemAnimators;
        private int lastStartedChild;
        protected LinearLayout linearLayout;
        private OnDispatchKeyEventListener mOnDispatchKeyEventListener;
        private onSizeChangedListener onSizeChangedListener;
        Path path;
        private HashMap positions;
        private float reactionsEnterProgress;
        Rect rect;
        private final Theme.ResourcesProvider resourcesProvider;
        private ScrollView scrollView;
        public boolean shownFromBottom;
        private boolean startAnimationPending;
        public int subtractBackgroundHeight;
        public boolean swipeBackGravityBottom;
        public boolean swipeBackGravityRight;
        private PopupSwipeBackLayout swipeBackLayout;
        private View topView;
        public boolean updateAnimation;
        protected ActionBarPopupWindow window;

        public Rect getPadding() {
            return this.bgPaddings;
        }

        public ActionBarPopupWindowLayout(Context context) {
            this(context, null);
        }

        public ActionBarPopupWindowLayout(Context context, Theme.ResourcesProvider resourcesProvider) {
            this(context, R.drawable.popup_fixed_alert2, resourcesProvider);
        }

        public ActionBarPopupWindowLayout(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
            this(context, i, resourcesProvider, 0);
        }

        public ActionBarPopupWindowLayout(Context context, int i, Theme.ResourcesProvider resourcesProvider, int i2) {
            super(context);
            this.backScaleX = 1.0f;
            this.backScaleY = 1.0f;
            this.startAnimationPending = false;
            this.backAlpha = 255;
            this.lastStartedChild = 0;
            this.animationEnabled = true;
            this.positions = new HashMap();
            this.gapStartY = -1000000;
            this.gapEndY = -1000000;
            Rect rect = new Rect();
            this.bgPaddings = rect;
            this.reactionsEnterProgress = 1.0f;
            this.backgroundColor = -1;
            this.resourcesProvider = resourcesProvider;
            if (i != 0) {
                this.backgroundDrawable = getResources().getDrawable(i).mutate();
                setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            }
            Drawable drawable = this.backgroundDrawable;
            if (drawable != null) {
                drawable.getPadding(rect);
                setBackgroundColor(getThemedColor(Theme.key_actionBarDefaultSubmenuBackground));
            }
            setWillNotDraw(false);
            if ((i2 & 2) > 0) {
                this.shownFromBottom = true;
            }
            if ((i2 & 1) > 0) {
                PopupSwipeBackLayout popupSwipeBackLayout = new PopupSwipeBackLayout(context, resourcesProvider);
                this.swipeBackLayout = popupSwipeBackLayout;
                addView(popupSwipeBackLayout, LayoutHelper.createFrame(-2, -2.0f));
            }
            if ((i2 & 4) == 0) {
                try {
                    ScrollView scrollView = new ScrollView(context);
                    this.scrollView = scrollView;
                    scrollView.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() {
                        @Override
                        public void onScrollChanged() {
                            ActionBarPopupWindowLayout.this.invalidate();
                        }
                    });
                    this.scrollView.setVerticalScrollBarEnabled(false);
                    PopupSwipeBackLayout popupSwipeBackLayout2 = this.swipeBackLayout;
                    if (popupSwipeBackLayout2 != null) {
                        popupSwipeBackLayout2.addView(this.scrollView, LayoutHelper.createFrame(-2, -2, this.shownFromBottom ? 80 : 48));
                    } else {
                        addView(this.scrollView, LayoutHelper.createFrame(-2, -2.0f));
                    }
                } catch (Throwable th) {
                    FileLog.e(th);
                }
            }
            LinearLayout linearLayout = new LinearLayout(context) {
                @Override
                protected void onMeasure(int i3, int i4) {
                    if (ActionBarPopupWindowLayout.this.fitItems) {
                        ActionBarPopupWindowLayout.this.gapStartY = -1000000;
                        ActionBarPopupWindowLayout.this.gapEndY = -1000000;
                        int childCount = getChildCount();
                        ArrayList arrayList = null;
                        int iMax = 0;
                        int iMax2 = 0;
                        for (int i5 = 0; i5 < childCount; i5++) {
                            View childAt = getChildAt(i5);
                            if (childAt.getVisibility() != 8) {
                                Object tag = childAt.getTag(R.id.width_tag);
                                Object tag2 = childAt.getTag(R.id.object_tag);
                                Object tag3 = childAt.getTag(R.id.fit_width_tag);
                                if (tag != null) {
                                    childAt.getLayoutParams().width = -2;
                                }
                                measureChildWithMargins(childAt, i3, 0, i4, 0);
                                if (tag3 == null) {
                                    boolean z = tag instanceof Integer;
                                    if (!z && tag2 == null) {
                                        iMax = Math.max(iMax, childAt.getMeasuredWidth());
                                    } else {
                                        if (z) {
                                            iMax2 = Math.max(((Integer) tag).intValue(), childAt.getMeasuredWidth());
                                            ActionBarPopupWindowLayout.this.gapStartY = childAt.getMeasuredHeight();
                                            ActionBarPopupWindowLayout actionBarPopupWindowLayout = ActionBarPopupWindowLayout.this;
                                            actionBarPopupWindowLayout.gapEndY = actionBarPopupWindowLayout.gapStartY + AndroidUtilities.dp(6.0f);
                                        }
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(childAt);
                                    }
                                } else {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(childAt);
                                }
                            }
                        }
                        if (arrayList != null) {
                            int size = arrayList.size();
                            for (int i6 = 0; i6 < size; i6++) {
                                ((View) arrayList.get(i6)).getLayoutParams().width = Math.max(iMax, iMax2);
                            }
                        }
                    }
                    super.onMeasure(i3, i4);
                }

                @Override
                protected boolean drawChild(Canvas canvas, View view, long j) {
                    if (!(view instanceof GapView) || ActionBarPopupWindowLayout.this.backgroundDrawable == null) {
                        return super.drawChild(canvas, view, j);
                    }
                    return false;
                }
            };
            this.linearLayout = linearLayout;
            linearLayout.setOrientation(1);
            ScrollView scrollView2 = this.scrollView;
            if (scrollView2 != null) {
                scrollView2.addView(this.linearLayout, new FrameLayout.LayoutParams(-2, -2));
                return;
            }
            PopupSwipeBackLayout popupSwipeBackLayout3 = this.swipeBackLayout;
            if (popupSwipeBackLayout3 != null) {
                popupSwipeBackLayout3.addView(this.linearLayout, LayoutHelper.createFrame(-2, -2, this.shownFromBottom ? 80 : 48));
            } else {
                addView(this.linearLayout, LayoutHelper.createFrame(-2, -2.0f));
            }
        }

        public PopupSwipeBackLayout getSwipeBack() {
            return this.swipeBackLayout;
        }

        public int addViewToSwipeBack(View view) {
            this.swipeBackLayout.addView(view, LayoutHelper.createFrame(-2, -2, this.shownFromBottom ? 80 : 48));
            return this.swipeBackLayout.getChildCount() - 1;
        }

        public void setFitItems(boolean z) {
            this.fitItems = z;
        }

        public void setShownFromBottom(boolean z) {
            this.shownFromBottom = z;
        }

        public void setDispatchKeyEventListener(OnDispatchKeyEventListener onDispatchKeyEventListener) {
            this.mOnDispatchKeyEventListener = onDispatchKeyEventListener;
        }

        public int getBackgroundColor() {
            return this.backgroundColor;
        }

        @Override
        public void setBackgroundColor(int i) {
            Drawable drawable;
            if (this.backgroundColor == i || (drawable = this.backgroundDrawable) == null) {
                return;
            }
            this.backgroundColor = i;
            drawable.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
        }

        public void setBackAlpha(int i) {
            if (this.backAlpha != i) {
                invalidate();
            }
            this.backAlpha = i;
        }

        public int getBackAlpha() {
            return this.backAlpha;
        }

        public void setBackScaleX(float f) {
            if (this.backScaleX != f) {
                this.backScaleX = f;
                invalidate();
                onSizeChangedListener onsizechangedlistener = this.onSizeChangedListener;
                if (onsizechangedlistener != null) {
                    onsizechangedlistener.onSizeChanged();
                }
            }
        }

        public void setBackScaleY(float f) {
            if (this.backScaleY != f) {
                this.backScaleY = f;
                if (this.animationEnabled && this.updateAnimation) {
                    int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(16.0f);
                    if (this.shownFromBottom) {
                        for (int i = this.lastStartedChild; i >= 0; i--) {
                            View itemAt = getItemAt(i);
                            if (itemAt != null && itemAt.getVisibility() == 0 && !(itemAt instanceof GapView)) {
                                Integer num = (Integer) this.positions.get(itemAt);
                                if (num != null && measuredHeight - ((num.intValue() * AndroidUtilities.dp(48.0f)) + AndroidUtilities.dp(32.0f)) > measuredHeight * f) {
                                    break;
                                }
                                this.lastStartedChild = i - 1;
                                startChildAnimation(itemAt);
                            }
                        }
                    } else {
                        int itemsCount = getItemsCount();
                        int measuredHeight2 = 0;
                        for (int i2 = 0; i2 < itemsCount; i2++) {
                            View itemAt2 = getItemAt(i2);
                            if (itemAt2.getVisibility() == 0) {
                                measuredHeight2 += itemAt2.getMeasuredHeight();
                                if (i2 < this.lastStartedChild) {
                                    continue;
                                } else {
                                    if (((Integer) this.positions.get(itemAt2)) != null && measuredHeight2 - AndroidUtilities.dp(24.0f) > measuredHeight * f) {
                                        break;
                                    }
                                    this.lastStartedChild = i2 + 1;
                                    startChildAnimation(itemAt2);
                                }
                            }
                        }
                    }
                }
                invalidate();
                onSizeChangedListener onsizechangedlistener = this.onSizeChangedListener;
                if (onsizechangedlistener != null) {
                    onsizechangedlistener.onSizeChanged();
                }
            }
        }

        @Override
        public void setBackgroundDrawable(Drawable drawable) {
            this.backgroundColor = -1;
            this.backgroundDrawable = drawable;
            if (drawable != null) {
                drawable.getPadding(this.bgPaddings);
            }
        }

        private void startChildAnimation(final View view) {
            if (this.animationEnabled) {
                final AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, view.isEnabled() ? 1.0f : 0.5f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, AndroidUtilities.dp(this.shownFromBottom ? 6.0f : -6.0f), 0.0f));
                animatorSet.setDuration(180L);
                animatorSet.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        ActionBarPopupWindowLayout.this.itemAnimators.remove(animatorSet);
                        View view2 = view;
                        if (view2 instanceof ActionBarMenuSubItem) {
                            ((ActionBarMenuSubItem) view2).onItemShown();
                        }
                    }
                });
                animatorSet.setInterpolator(ActionBarPopupWindow.decelerateInterpolator);
                animatorSet.start();
                if (this.itemAnimators == null) {
                    this.itemAnimators = new ArrayList();
                }
                this.itemAnimators.add(animatorSet);
            }
        }

        public void setAnimationEnabled(boolean z) {
            this.animationEnabled = z;
        }

        @Override
        public void addView(View view) {
            this.linearLayout.addView(view);
        }

        public void addView(View view, LinearLayout.LayoutParams layoutParams) {
            this.linearLayout.addView(view, layoutParams);
        }

        public int getViewsCount() {
            return this.linearLayout.getChildCount();
        }

        public int precalculateHeight() {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE);
            this.linearLayout.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            return this.linearLayout.getMeasuredHeight();
        }

        public void removeInnerViews() {
            this.linearLayout.removeAllViews();
        }

        public float getBackScaleX() {
            return this.backScaleX;
        }

        public float getBackScaleY() {
            return this.backScaleY;
        }

        @Override
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            OnDispatchKeyEventListener onDispatchKeyEventListener = this.mOnDispatchKeyEventListener;
            if (onDispatchKeyEventListener != null) {
                onDispatchKeyEventListener.onDispatchKeyEvent(keyEvent);
            }
            return super.dispatchKeyEvent(keyEvent);
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            int i;
            boolean z;
            int i2;
            boolean z2;
            Rect rect;
            Path path;
            int i3;
            float f = 16.0f;
            if (this.swipeBackGravityRight) {
                setTranslationX(getMeasuredWidth() * (1.0f - this.backScaleX));
                View view = this.topView;
                if (view != null) {
                    view.setTranslationX(getMeasuredWidth() * (1.0f - this.backScaleX));
                    this.topView.setAlpha(1.0f - this.swipeBackLayout.transitionProgress);
                    float f2 = (-(this.topView.getMeasuredHeight() - AndroidUtilities.dp(16.0f))) * this.swipeBackLayout.transitionProgress;
                    this.topView.setTranslationY(f2);
                    setTranslationY(f2);
                }
            }
            if (this.swipeBackGravityBottom) {
                setTranslationY(getMeasuredHeight() * (1.0f - this.backScaleY));
            }
            if (this.backgroundDrawable != null) {
                int i4 = this.gapStartY;
                ScrollView scrollView = this.scrollView;
                int scrollY = i4 - (scrollView == null ? 0 : scrollView.getScrollY());
                int i5 = this.gapEndY;
                ScrollView scrollView2 = this.scrollView;
                int scrollY2 = i5 - (scrollView2 == null ? 0 : scrollView2.getScrollY());
                int i6 = 0;
                while (true) {
                    if (i6 >= this.linearLayout.getChildCount()) {
                        z = false;
                        break;
                    } else {
                        if ((this.linearLayout.getChildAt(i6) instanceof GapView) && this.linearLayout.getChildAt(i6).getVisibility() == 0) {
                            z = true;
                            break;
                        }
                        i6++;
                    }
                }
                int i7 = 0;
                for (i = 1; i7 < 2 && (i7 != i || scrollY >= (-AndroidUtilities.dp(f))); i = 1) {
                    int saveCount = canvas.getSaveCount();
                    if (z && this.backAlpha != 255) {
                        i2 = -1000000;
                        canvas.saveLayerAlpha(0.0f, this.bgPaddings.top, getMeasuredWidth(), getMeasuredHeight(), this.backAlpha, 31);
                        z2 = false;
                    } else {
                        i2 = -1000000;
                        if (this.gapStartY != -1000000) {
                            canvas.save();
                            canvas.clipRect(0, this.bgPaddings.top, getMeasuredWidth(), getMeasuredHeight());
                        }
                        z2 = true;
                    }
                    this.backgroundDrawable.setAlpha(z2 ? this.backAlpha : 255);
                    if (this.shownFromBottom) {
                        int measuredHeight = getMeasuredHeight();
                        AndroidUtilities.rectTmp2.set(0, (int) (measuredHeight * (1.0f - this.backScaleY)), (int) (getMeasuredWidth() * this.backScaleX), measuredHeight);
                    } else if (scrollY > (-AndroidUtilities.dp(16.0f))) {
                        int measuredHeight2 = (int) (getMeasuredHeight() * this.backScaleY);
                        if (i7 == 0) {
                            PopupSwipeBackLayout popupSwipeBackLayout = this.swipeBackLayout;
                            if (popupSwipeBackLayout != null && popupSwipeBackLayout.stickToRight) {
                                Rect rect2 = AndroidUtilities.rectTmp2;
                                int measuredWidth = getMeasuredWidth() - ((int) (getMeasuredWidth() * this.backScaleX));
                                ScrollView scrollView3 = this.scrollView;
                                int iDp = (scrollView3 == null ? 0 : -scrollView3.getScrollY()) + (this.gapStartY != i2 ? AndroidUtilities.dp(1.0f) : 0);
                                int measuredWidth2 = getMeasuredWidth();
                                if (this.gapStartY != i2) {
                                    measuredHeight2 = Math.min(measuredHeight2, AndroidUtilities.dp(16.0f) + scrollY);
                                }
                                rect2.set(measuredWidth, iDp, measuredWidth2, measuredHeight2 - this.subtractBackgroundHeight);
                            } else {
                                Rect rect3 = AndroidUtilities.rectTmp2;
                                ScrollView scrollView4 = this.scrollView;
                                int iDp2 = (scrollView4 == null ? 0 : -scrollView4.getScrollY()) + (this.gapStartY != i2 ? AndroidUtilities.dp(1.0f) : 0);
                                int measuredWidth3 = (int) (getMeasuredWidth() * this.backScaleX);
                                if (this.gapStartY != i2) {
                                    measuredHeight2 = Math.min(measuredHeight2, AndroidUtilities.dp(16.0f) + scrollY);
                                }
                                rect3.set(0, iDp2, measuredWidth3, measuredHeight2 - this.subtractBackgroundHeight);
                            }
                        } else {
                            if (measuredHeight2 < scrollY2) {
                                if (this.gapStartY != i2) {
                                    canvas.restore();
                                }
                            } else {
                                PopupSwipeBackLayout popupSwipeBackLayout2 = this.swipeBackLayout;
                                if (popupSwipeBackLayout2 != null && popupSwipeBackLayout2.stickToRight) {
                                    AndroidUtilities.rectTmp2.set(getMeasuredWidth() - ((int) (getMeasuredWidth() * this.backScaleX)), scrollY2, getMeasuredWidth(), measuredHeight2 - this.subtractBackgroundHeight);
                                } else {
                                    AndroidUtilities.rectTmp2.set(0, scrollY2, (int) (getMeasuredWidth() * this.backScaleX), measuredHeight2 - this.subtractBackgroundHeight);
                                }
                            }
                            i7++;
                            f = 16.0f;
                        }
                    } else {
                        PopupSwipeBackLayout popupSwipeBackLayout3 = this.swipeBackLayout;
                        if (popupSwipeBackLayout3 != null && popupSwipeBackLayout3.stickToRight) {
                            AndroidUtilities.rectTmp2.set(getMeasuredWidth() - ((int) (getMeasuredWidth() * this.backScaleX)), this.gapStartY < 0 ? 0 : -AndroidUtilities.dp(16.0f), getMeasuredWidth(), ((int) (getMeasuredHeight() * this.backScaleY)) - this.subtractBackgroundHeight);
                        } else {
                            AndroidUtilities.rectTmp2.set(0, this.gapStartY < 0 ? 0 : -AndroidUtilities.dp(16.0f), (int) (getMeasuredWidth() * this.backScaleX), ((int) (getMeasuredHeight() * this.backScaleY)) - this.subtractBackgroundHeight);
                        }
                        if (this.reactionsEnterProgress != 1.0f) {
                            if (this.rect == null) {
                                this.rect = new Rect();
                            }
                            Rect rect4 = this.rect;
                            Rect rect5 = AndroidUtilities.rectTmp2;
                            int i8 = rect5.right;
                            int i9 = rect5.top;
                            rect4.set(i8, i9, i8, i9);
                            AndroidUtilities.lerp(this.rect, rect5, this.reactionsEnterProgress, rect5);
                        }
                        Drawable drawable = this.backgroundDrawable;
                        rect = AndroidUtilities.rectTmp2;
                        drawable.setBounds(rect);
                        this.backgroundDrawable.draw(canvas);
                        if (this.clipChildren) {
                            int i10 = rect.left;
                            Rect rect6 = this.bgPaddings;
                            rect.left = i10 + rect6.left;
                            rect.top += rect6.top;
                            rect.right -= rect6.right;
                            rect.bottom -= rect6.bottom;
                            canvas.clipRect(rect);
                        }
                        if (z) {
                            canvas.save();
                            RectF rectF = AndroidUtilities.rectTmp;
                            rectF.set(this.backgroundDrawable.getBounds());
                            rectF.inset(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                            path = this.path;
                            if (path == null) {
                                this.path = new Path();
                            } else {
                                path.rewind();
                            }
                            this.path.addRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Path.Direction.CW);
                            canvas.clipPath(this.path);
                            for (i3 = 0; i3 < this.linearLayout.getChildCount(); i3++) {
                                if (!(this.linearLayout.getChildAt(i3) instanceof GapView) && this.linearLayout.getChildAt(i3).getVisibility() == 0) {
                                    canvas.save();
                                    GapView gapView = (GapView) this.linearLayout.getChildAt(i3);
                                    float y = 0.0f;
                                    View view2 = gapView;
                                    float x = 0.0f;
                                    while (view2 != this) {
                                        x += view2.getX();
                                        y += view2.getY();
                                        view2 = (View) view2.getParent();
                                        if (view2 == null) {
                                            break;
                                        }
                                    }
                                    ScrollView scrollView5 = this.scrollView;
                                    float scaleY = y * (scrollView5 == null ? 1.0f : scrollView5.getScaleY());
                                    ScrollView scrollView6 = this.scrollView;
                                    canvas.translate(x, scaleY - (scrollView6 == null ? 0 : scrollView6.getScrollY()));
                                    gapView.draw(canvas);
                                    canvas.restore();
                                }
                            }
                            canvas.restore();
                        }
                        canvas.restoreToCount(saveCount);
                        i7++;
                        f = 16.0f;
                    }
                    if (this.reactionsEnterProgress != 1.0f) {
                        if (this.rect == null) {
                            this.rect = new Rect();
                        }
                        Rect rect7 = this.rect;
                        Rect rect8 = AndroidUtilities.rectTmp2;
                        int i11 = rect8.right;
                        int i12 = rect8.top;
                        rect7.set(i11, i12, i11, i12);
                        AndroidUtilities.lerp(this.rect, rect8, this.reactionsEnterProgress, rect8);
                    }
                    Drawable drawable2 = this.backgroundDrawable;
                    rect = AndroidUtilities.rectTmp2;
                    drawable2.setBounds(rect);
                    this.backgroundDrawable.draw(canvas);
                    if (this.clipChildren) {
                        int i13 = rect.left;
                        Rect rect9 = this.bgPaddings;
                        rect.left = i13 + rect9.left;
                        rect.top += rect9.top;
                        rect.right -= rect9.right;
                        rect.bottom -= rect9.bottom;
                        canvas.clipRect(rect);
                    }
                    if (z) {
                        canvas.save();
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        rectF2.set(this.backgroundDrawable.getBounds());
                        rectF2.inset(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                        path = this.path;
                        if (path == null) {
                            this.path = new Path();
                        } else {
                            path.rewind();
                        }
                        this.path.addRoundRect(rectF2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Path.Direction.CW);
                        canvas.clipPath(this.path);
                        while (i3 < this.linearLayout.getChildCount()) {
                            if (!(this.linearLayout.getChildAt(i3) instanceof GapView)) {
                            }
                        }
                        canvas.restore();
                    }
                    canvas.restoreToCount(saveCount);
                    i7++;
                    f = 16.0f;
                }
            }
            float f3 = this.reactionsEnterProgress;
            if (f3 != 1.0f) {
                Rect rect10 = AndroidUtilities.rectTmp2;
                canvas.saveLayerAlpha(rect10.left, rect10.top, rect10.right, rect10.bottom, (int) (f3 * 255.0f), 31);
                float f4 = (this.reactionsEnterProgress * 0.5f) + 0.5f;
                canvas.scale(f4, f4, rect10.right, rect10.top);
                super.dispatchDraw(canvas);
                canvas.restore();
                return;
            }
            super.dispatchDraw(canvas);
        }

        public Drawable getBackgroundDrawable() {
            return this.backgroundDrawable;
        }

        public int getItemsCount() {
            return this.linearLayout.getChildCount();
        }

        public View getItemAt(int i) {
            return this.linearLayout.getChildAt(i);
        }

        public void scrollToTop() {
            ScrollView scrollView = this.scrollView;
            if (scrollView != null) {
                scrollView.scrollTo(0, 0);
            }
        }

        public void setupRadialSelectors(int i) {
            int childCount = this.linearLayout.getChildCount();
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = this.linearLayout.getChildAt(i2);
                int i3 = 6;
                int i4 = i2 == 0 ? 6 : 0;
                if (i2 != childCount - 1) {
                    i3 = 0;
                }
                childAt.setBackground(Theme.createRadSelectorDrawable(i, i4, i3));
                i2++;
            }
        }

        public void updateRadialSelectors() {
            int childCount = this.linearLayout.getChildCount();
            View view = null;
            View view2 = null;
            for (int i = 0; i < childCount; i++) {
                View childAt = this.linearLayout.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    if (view == null) {
                        view = childAt;
                    }
                    view2 = childAt;
                }
            }
            boolean z = false;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt2 = this.linearLayout.getChildAt(i2);
                if (childAt2.getVisibility() == 0) {
                    Object tag = childAt2.getTag(R.id.object_tag);
                    if (childAt2 instanceof ActionBarMenuSubItem) {
                        ((ActionBarMenuSubItem) childAt2).updateSelectorBackground(childAt2 == view || z, childAt2 == view2);
                    }
                    z = tag != null;
                }
            }
        }

        protected int getThemedColor(int i) {
            return Theme.getColor(i, this.resourcesProvider);
        }

        public void setOnSizeChangedListener(onSizeChangedListener onsizechangedlistener) {
            this.onSizeChangedListener = onsizechangedlistener;
        }

        public int getVisibleHeight() {
            return (int) (getMeasuredHeight() * this.backScaleY);
        }

        public void setTopView(View view) {
            this.topView = view;
        }

        public void setSwipeBackForegroundColor(int i) {
            getSwipeBack().setForegroundColor(i);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            PopupSwipeBackLayout popupSwipeBackLayout = this.swipeBackLayout;
            if (popupSwipeBackLayout != null) {
                popupSwipeBackLayout.invalidateTransforms(!this.startAnimationPending);
            }
        }

        public void setParentWindow(ActionBarPopupWindow actionBarPopupWindow) {
            this.window = actionBarPopupWindow;
        }

        public void setReactionsTransitionProgress(float f) {
            this.reactionsEnterProgress = f;
            invalidate();
        }
    }

    public ActionBarPopupWindow(Context context) {
        super(context);
        this.animationEnabled = true;
        this.dismissAnimationDuration = 150;
        this.currentAccount = UserConfig.selectedAccount;
        this.outEmptyTime = -1L;
        this.notificationsLocker = new AnimationNotificationsLocker();
        init();
    }

    public ActionBarPopupWindow(View view, int i, int i2) {
        super(view, i, i2);
        this.animationEnabled = true;
        this.dismissAnimationDuration = 150;
        this.currentAccount = UserConfig.selectedAccount;
        this.outEmptyTime = -1L;
        this.notificationsLocker = new AnimationNotificationsLocker();
        init();
    }

    public void setAnimationEnabled(boolean z) {
        this.animationEnabled = z;
    }

    public void setLayoutInScreen(boolean z) {
        try {
            if (layoutInScreenMethod == null) {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setLayoutInScreenEnabled", Boolean.TYPE);
                layoutInScreenMethod = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            layoutInScreenMethod.invoke(this, Boolean.TRUE);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    private void init() {
        final View contentView = getContentView();
        if ((contentView instanceof ActionBarPopupWindowLayout) && ((ActionBarPopupWindowLayout) contentView).getSwipeBack() != null) {
            setTouchInterceptor(new View.OnTouchListener() {
                @Override
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return this.f$0.lambda$init$1(contentView, view, motionEvent);
                }
            });
        }
        Field field = superListenerField;
        if (field != null) {
            try {
                this.mSuperScrollListener = (ViewTreeObserver.OnScrollChangedListener) field.get(this);
                field.set(this, NOP);
            } catch (Exception unused) {
                this.mSuperScrollListener = null;
            }
        }
    }

    public boolean lambda$init$1(View view, View view2, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        Drawable backgroundDrawable = ((ActionBarPopupWindowLayout) view).getBackgroundDrawable();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(backgroundDrawable.getBounds());
        rectF.offset(view.getX(), view.getY());
        if (rectF.contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        dismiss();
        return true;
    }

    public void setDismissAnimationDuration(int i) {
        this.dismissAnimationDuration = i;
    }

    public void unregisterListener() {
        ViewTreeObserver viewTreeObserver;
        if (this.mSuperScrollListener == null || (viewTreeObserver = this.mViewTreeObserver) == null) {
            return;
        }
        if (viewTreeObserver.isAlive()) {
            this.mViewTreeObserver.removeOnScrollChangedListener(this.mSuperScrollListener);
        }
        this.mViewTreeObserver = null;
    }

    private void registerListener(View view) {
        if (this.mSuperScrollListener != null) {
            ViewTreeObserver viewTreeObserver = view.getWindowToken() != null ? view.getViewTreeObserver() : null;
            ViewTreeObserver viewTreeObserver2 = this.mViewTreeObserver;
            if (viewTreeObserver != viewTreeObserver2) {
                if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                    this.mViewTreeObserver.removeOnScrollChangedListener(this.mSuperScrollListener);
                }
                this.mViewTreeObserver = viewTreeObserver;
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnScrollChangedListener(this.mSuperScrollListener);
                }
            }
        }
    }

    public void dimBehind() {
        dimBehind(0.2f);
    }

    public void dimBehind(float f) {
        View rootView = getContentView().getRootView();
        WindowManager windowManager = (WindowManager) getContentView().getContext().getSystemService("window");
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) rootView.getLayoutParams();
        layoutParams.flags |= 2;
        layoutParams.dimAmount = f;
        windowManager.updateViewLayout(rootView, layoutParams);
    }

    private void dismissDim() {
        View rootView = getContentView().getRootView();
        WindowManager windowManager = (WindowManager) getContentView().getContext().getSystemService("window");
        if (rootView.getLayoutParams() == null || !(rootView.getLayoutParams() instanceof WindowManager.LayoutParams)) {
            return;
        }
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) rootView.getLayoutParams();
        try {
            int i = layoutParams.flags;
            if ((i & 2) != 0) {
                layoutParams.flags = i & (-3);
                layoutParams.dimAmount = 0.0f;
                windowManager.updateViewLayout(rootView, layoutParams);
            }
        } catch (Exception unused) {
        }
    }

    @Override
    public void showAsDropDown(View view, int i, int i2) {
        try {
            super.showAsDropDown(view, i, i2);
            registerListener(view);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static AnimatorSet startAnimation(final ActionBarPopupWindowLayout actionBarPopupWindowLayout) {
        actionBarPopupWindowLayout.startAnimationPending = true;
        actionBarPopupWindowLayout.setTranslationY(0.0f);
        float f = 1.0f;
        actionBarPopupWindowLayout.setAlpha(1.0f);
        actionBarPopupWindowLayout.setPivotX(actionBarPopupWindowLayout.getMeasuredWidth());
        actionBarPopupWindowLayout.setPivotY(0.0f);
        int itemsCount = actionBarPopupWindowLayout.getItemsCount();
        actionBarPopupWindowLayout.positions.clear();
        int i = 0;
        for (int i2 = 0; i2 < itemsCount; i2++) {
            View itemAt = actionBarPopupWindowLayout.getItemAt(i2);
            if (!(itemAt instanceof GapView)) {
                itemAt.setAlpha(0.0f);
                if (itemAt.getVisibility() == 0) {
                    actionBarPopupWindowLayout.positions.put(itemAt, Integer.valueOf(i));
                    i++;
                }
            }
        }
        if (actionBarPopupWindowLayout.shownFromBottom) {
            actionBarPopupWindowLayout.lastStartedChild = itemsCount - 1;
        } else {
            actionBarPopupWindowLayout.lastStartedChild = 0;
        }
        if (actionBarPopupWindowLayout.getSwipeBack() != null) {
            actionBarPopupWindowLayout.getSwipeBack().invalidateTransforms();
            f = actionBarPopupWindowLayout.backScaleY;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ActionBarPopupWindow.lambda$startAnimation$2(actionBarPopupWindowLayout, valueAnimator);
            }
        });
        actionBarPopupWindowLayout.updateAnimation = false;
        actionBarPopupWindowLayout.clipChildren = true;
        animatorSet.playTogether(ObjectAnimator.ofFloat(actionBarPopupWindowLayout, "backScaleY", 0.0f, f), ObjectAnimator.ofInt(actionBarPopupWindowLayout, "backAlpha", 0, 255), valueAnimatorOfFloat);
        animatorSet.setDuration((i * 16) + 150);
        animatorSet.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                actionBarPopupWindowLayout.startAnimationPending = false;
                int itemsCount2 = actionBarPopupWindowLayout.getItemsCount();
                for (int i3 = 0; i3 < itemsCount2; i3++) {
                    View itemAt2 = actionBarPopupWindowLayout.getItemAt(i3);
                    if (!(itemAt2 instanceof GapView)) {
                        itemAt2.setTranslationY(0.0f);
                        itemAt2.setAlpha(itemAt2.isEnabled() ? 1.0f : 0.5f);
                    }
                }
            }
        });
        animatorSet.start();
        return animatorSet;
    }

    public static void lambda$startAnimation$2(ActionBarPopupWindowLayout actionBarPopupWindowLayout, ValueAnimator valueAnimator) {
        int itemsCount = actionBarPopupWindowLayout.getItemsCount();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        for (int i = 0; i < itemsCount; i++) {
            View itemAt = actionBarPopupWindowLayout.getItemAt(i);
            if (!(itemAt instanceof GapView)) {
                float fCascade = AndroidUtilities.cascade(fFloatValue, actionBarPopupWindowLayout.shownFromBottom ? (itemsCount - 1) - i : i, itemsCount, 4.0f);
                itemAt.setTranslationY((1.0f - fCascade) * AndroidUtilities.dp(-6.0f));
                itemAt.setAlpha(fCascade * (itemAt.isEnabled() ? 1.0f : 0.5f));
            }
        }
    }

    public void startAnimation() {
        ActionBarPopupWindowLayout actionBarPopupWindowLayout;
        if (this.animationEnabled && this.windowAnimatorSet == null) {
            ViewGroup viewGroup = (ViewGroup) getContentView();
            if (viewGroup instanceof ActionBarPopupWindowLayout) {
                actionBarPopupWindowLayout = (ActionBarPopupWindowLayout) viewGroup;
                actionBarPopupWindowLayout.startAnimationPending = true;
            } else {
                ActionBarPopupWindowLayout actionBarPopupWindowLayout2 = null;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    if (viewGroup.getChildAt(i) instanceof ActionBarPopupWindowLayout) {
                        actionBarPopupWindowLayout2 = (ActionBarPopupWindowLayout) viewGroup.getChildAt(i);
                        actionBarPopupWindowLayout2.startAnimationPending = true;
                    }
                }
                actionBarPopupWindowLayout = actionBarPopupWindowLayout2;
            }
            actionBarPopupWindowLayout.setTranslationY(0.0f);
            float f = 1.0f;
            actionBarPopupWindowLayout.setAlpha(1.0f);
            actionBarPopupWindowLayout.setPivotX(actionBarPopupWindowLayout.getMeasuredWidth());
            actionBarPopupWindowLayout.setPivotY(0.0f);
            int itemsCount = actionBarPopupWindowLayout.getItemsCount();
            actionBarPopupWindowLayout.positions.clear();
            int i2 = 0;
            for (int i3 = 0; i3 < itemsCount; i3++) {
                View itemAt = actionBarPopupWindowLayout.getItemAt(i3);
                itemAt.setAlpha(0.0f);
                if (itemAt.getVisibility() == 0) {
                    actionBarPopupWindowLayout.positions.put(itemAt, Integer.valueOf(i2));
                    i2++;
                }
            }
            if (actionBarPopupWindowLayout.shownFromBottom) {
                actionBarPopupWindowLayout.lastStartedChild = itemsCount - 1;
            } else {
                actionBarPopupWindowLayout.lastStartedChild = 0;
            }
            if (actionBarPopupWindowLayout.getSwipeBack() != null) {
                actionBarPopupWindowLayout.getSwipeBack().invalidateTransforms();
                f = actionBarPopupWindowLayout.backScaleY;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            this.windowAnimatorSet = animatorSet;
            animatorSet.playTogether(ObjectAnimator.ofFloat(actionBarPopupWindowLayout, "backScaleY", 0.0f, f), ObjectAnimator.ofInt(actionBarPopupWindowLayout, "backAlpha", 0, 255));
            this.windowAnimatorSet.setDuration((i2 * 16) + 150);
            this.windowAnimatorSet.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    ActionBarPopupWindowLayout actionBarPopupWindowLayout3;
                    ActionBarPopupWindowLayout actionBarPopupWindowLayout4 = null;
                    ActionBarPopupWindow.this.windowAnimatorSet = null;
                    ViewGroup viewGroup2 = (ViewGroup) ActionBarPopupWindow.this.getContentView();
                    if (viewGroup2 instanceof ActionBarPopupWindowLayout) {
                        actionBarPopupWindowLayout3 = (ActionBarPopupWindowLayout) viewGroup2;
                        actionBarPopupWindowLayout3.startAnimationPending = false;
                    } else {
                        for (int i4 = 0; i4 < viewGroup2.getChildCount(); i4++) {
                            if (viewGroup2.getChildAt(i4) instanceof ActionBarPopupWindowLayout) {
                                actionBarPopupWindowLayout4 = (ActionBarPopupWindowLayout) viewGroup2.getChildAt(i4);
                                actionBarPopupWindowLayout4.startAnimationPending = false;
                            }
                        }
                        actionBarPopupWindowLayout3 = actionBarPopupWindowLayout4;
                    }
                    int itemsCount2 = actionBarPopupWindowLayout3.getItemsCount();
                    for (int i5 = 0; i5 < itemsCount2; i5++) {
                        View itemAt2 = actionBarPopupWindowLayout3.getItemAt(i5);
                        if (!(itemAt2 instanceof GapView)) {
                            itemAt2.setAlpha(itemAt2.isEnabled() ? 1.0f : 0.5f);
                        }
                    }
                }
            });
            this.windowAnimatorSet.start();
        }
    }

    @Override
    public void update(View view, int i, int i2, int i3, int i4) {
        super.update(view, i, i2, i3, i4);
        registerListener(view);
    }

    @Override
    public void update(View view, int i, int i2) {
        super.update(view, i, i2);
        registerListener(view);
    }

    @Override
    public void showAtLocation(View view, int i, int i2, int i3) {
        super.showAtLocation(view, i, i2, i3);
        unregisterListener();
    }

    @Override
    public void dismiss() {
        dismiss(true);
    }

    public void setPauseNotifications(boolean z) {
        this.pauseNotifications = z;
    }

    public void dismiss(boolean z) {
        setFocusable(false);
        dismissDim();
        AnimatorSet animatorSet = this.windowAnimatorSet;
        ActionBarPopupWindowLayout actionBarPopupWindowLayout = null;
        if (animatorSet != null) {
            if (z && this.isClosingAnimated) {
                return;
            }
            animatorSet.cancel();
            this.windowAnimatorSet = null;
        }
        this.isClosingAnimated = false;
        if (this.animationEnabled && z) {
            this.isClosingAnimated = true;
            ViewGroup viewGroup = (ViewGroup) getContentView();
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                if (viewGroup.getChildAt(i) instanceof ActionBarPopupWindowLayout) {
                    actionBarPopupWindowLayout = (ActionBarPopupWindowLayout) viewGroup.getChildAt(i);
                }
            }
            if (actionBarPopupWindowLayout != null && actionBarPopupWindowLayout.itemAnimators != null && !actionBarPopupWindowLayout.itemAnimators.isEmpty()) {
                int size = actionBarPopupWindowLayout.itemAnimators.size();
                for (int i2 = 0; i2 < size; i2++) {
                    AnimatorSet animatorSet2 = (AnimatorSet) actionBarPopupWindowLayout.itemAnimators.get(i2);
                    animatorSet2.removeAllListeners();
                    animatorSet2.cancel();
                }
                actionBarPopupWindowLayout.itemAnimators.clear();
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.windowAnimatorSet = animatorSet3;
            if (this.outEmptyTime > 0) {
                animatorSet3.playTogether(ValueAnimator.ofFloat(0.0f, 1.0f));
                this.windowAnimatorSet.setDuration(this.outEmptyTime);
            } else if (this.scaleOut) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.SCALE_Y, 0.8f), ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.SCALE_X, 0.8f), ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.ALPHA, 0.0f));
                this.windowAnimatorSet.setDuration(this.dismissAnimationDuration);
            } else {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.TRANSLATION_Y, AndroidUtilities.dp((actionBarPopupWindowLayout == null || !actionBarPopupWindowLayout.shownFromBottom) ? -5.0f : 5.0f)), ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.ALPHA, 0.0f));
                this.windowAnimatorSet.setDuration(this.dismissAnimationDuration);
            }
            this.windowAnimatorSet.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    ActionBarPopupWindow.this.windowAnimatorSet = null;
                    ActionBarPopupWindow.this.isClosingAnimated = false;
                    ActionBarPopupWindow.this.setFocusable(false);
                    try {
                        ActionBarPopupWindow.super.dismiss();
                    } catch (Exception unused) {
                    }
                    ActionBarPopupWindow.this.unregisterListener();
                    if (ActionBarPopupWindow.this.pauseNotifications) {
                        ActionBarPopupWindow.this.notificationsLocker.unlock();
                    }
                }
            });
            if (this.pauseNotifications) {
                this.notificationsLocker.lock();
            }
            this.windowAnimatorSet.start();
            return;
        }
        try {
            super.dismiss();
        } catch (Exception unused) {
        }
        unregisterListener();
    }

    public static class GapView extends FrameLayout {
        Drawable shadowDrawable;

        public GapView(Context context, Theme.ResourcesProvider resourcesProvider) {
            this(context, resourcesProvider, Theme.key_actionBarDefaultSubmenuSeparator);
        }

        public GapView(Context context, int i, int i2) {
            super(context);
            this.shadowDrawable = Theme.getThemedDrawable(getContext(), R.drawable.greydivider, i2);
            setBackgroundColor(i);
        }

        public GapView(Context context, Theme.ResourcesProvider resourcesProvider, int i) {
            this(context, Theme.getColor(i, resourcesProvider), Theme.getColor(Theme.key_windowBackgroundGrayShadow, resourcesProvider));
        }

        public void setColor(int i) {
            setBackgroundColor(i);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            Drawable drawable = this.shadowDrawable;
            if (drawable != null) {
                drawable.setBounds(0, 0, getWidth(), getHeight());
                this.shadowDrawable.draw(canvas);
            }
        }
    }
}
