package org.telegram.ui.ActionBar;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.a8;
public class h1 extends PopupWindow {
    public static Method f28984k;
    public static final Field f28985l;
    public static final DecelerateInterpolator f28986m = new DecelerateInterpolator();
    public static final a1 f28987n;
    public AnimatorSet f28988a;
    public boolean f28989b;
    public int f28990c;
    public boolean d;
    public boolean f28991e;
    public long f28992f;
    public boolean f28993g;
    public ViewTreeObserver.OnScrollChangedListener h;
    public ViewTreeObserver f28994i;
    public h2.f f28995j;

    static {
        Field field = null;
        try {
            field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
            field.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
        f28985l = field;
        f28987n = new a1(0);
    }

    public h1(View view, int i7, int i10) {
        super(view, i7, i10);
        this.f28989b = true;
        this.f28990c = 150;
        this.f28992f = -1L;
        this.f28995j = new h2.f((int[]) null);
        e();
    }

    public static void i(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        actionBarPopupWindow$ActionBarPopupWindowLayout.f28738n = true;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY(0.0f);
        float f10 = 1.0f;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(1.0f);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setPivotX(actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth());
        actionBarPopupWindow$ActionBarPopupWindowLayout.setPivotY(0.0f);
        int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
        HashMap hashMap = actionBarPopupWindow$ActionBarPopupWindowLayout.E;
        hashMap.clear();
        int i7 = 0;
        for (int i10 = 0; i10 < itemsCount; i10++) {
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i10);
            if (!(childAt instanceof e1)) {
                childAt.setAlpha(0.0f);
                if (childAt.getVisibility() == 0) {
                    hashMap.put(childAt, Integer.valueOf(i7));
                    i7++;
                }
            }
        }
        if (actionBarPopupWindow$ActionBarPopupWindowLayout.f28741w) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.f28740s = itemsCount - 1;
        } else {
            actionBarPopupWindow$ActionBarPopupWindowLayout.f28740s = 0;
        }
        if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().c(true);
            f10 = actionBarPopupWindow$ActionBarPopupWindowLayout.h;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new hi.k3(actionBarPopupWindow$ActionBarPopupWindowLayout, 12));
        actionBarPopupWindow$ActionBarPopupWindowLayout.f28733a = false;
        actionBarPopupWindow$ActionBarPopupWindowLayout.f28734b = true;
        animatorSet.playTogether(ObjectAnimator.ofFloat(actionBarPopupWindow$ActionBarPopupWindowLayout, "backScaleY", 0.0f, f10), ObjectAnimator.ofInt(actionBarPopupWindow$ActionBarPopupWindowLayout, "backAlpha", 0, 255), ofFloat);
        animatorSet.setDuration((i7 * 16) + 150);
        animatorSet.addListener(new ki.n3(actionBarPopupWindow$ActionBarPopupWindowLayout, 9));
        animatorSet.start();
    }

    public final void b() {
        c(0.2f);
    }

    public final void c(float f10) {
        View rootView = getContentView().getRootView();
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) rootView.getLayoutParams();
        layoutParams.flags |= 2;
        layoutParams.dimAmount = f10;
        ((WindowManager) getContentView().getContext().getSystemService("window")).updateViewLayout(rootView, layoutParams);
    }

    public void d(boolean z10) {
        float f10;
        ArrayList arrayList;
        long j3 = this.f28992f;
        setFocusable(false);
        View rootView = getContentView().getRootView();
        WindowManager windowManager = (WindowManager) getContentView().getContext().getSystemService("window");
        if (rootView.getLayoutParams() != null && (rootView.getLayoutParams() instanceof WindowManager.LayoutParams)) {
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) rootView.getLayoutParams();
            try {
                int i7 = layoutParams.flags;
                if ((i7 & 2) != 0) {
                    layoutParams.flags = i7 & (-3);
                    layoutParams.dimAmount = 0.0f;
                    windowManager.updateViewLayout(rootView, layoutParams);
                }
            } catch (Exception unused) {
            }
        }
        AnimatorSet animatorSet = this.f28988a;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = null;
        if (animatorSet != null) {
            if (!z10 || !this.d) {
                animatorSet.cancel();
                this.f28988a = null;
            } else {
                return;
            }
        }
        this.d = false;
        if (this.f28989b && z10) {
            this.d = true;
            ViewGroup viewGroup = (ViewGroup) getContentView();
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                if (viewGroup.getChildAt(i10) instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup.getChildAt(i10);
                }
            }
            if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (arrayList = actionBarPopupWindow$ActionBarPopupWindowLayout.f28743y) != null && !arrayList.isEmpty()) {
                int size = actionBarPopupWindow$ActionBarPopupWindowLayout.f28743y.size();
                for (int i11 = 0; i11 < size; i11++) {
                    AnimatorSet animatorSet2 = (AnimatorSet) actionBarPopupWindow$ActionBarPopupWindowLayout.f28743y.get(i11);
                    animatorSet2.removeAllListeners();
                    animatorSet2.cancel();
                }
                actionBarPopupWindow$ActionBarPopupWindowLayout.f28743y.clear();
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.f28988a = animatorSet3;
            if (j3 > 0) {
                animatorSet3.playTogether(ValueAnimator.ofFloat(0.0f, 1.0f));
                this.f28988a.setDuration(j3);
            } else if (this.f28993g) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(viewGroup, View.SCALE_Y, 0.8f), ObjectAnimator.ofFloat(viewGroup, View.SCALE_X, 0.8f), ObjectAnimator.ofFloat(viewGroup, View.ALPHA, 0.0f));
                this.f28988a.setDuration(this.f28990c);
            } else {
                Property property = View.TRANSLATION_Y;
                float translationY = viewGroup.getTranslationY();
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && actionBarPopupWindow$ActionBarPopupWindowLayout.f28741w) {
                    f10 = 5.0f;
                } else {
                    f10 = -5.0f;
                }
                animatorSet3.playTogether(ObjectAnimator.ofFloat(viewGroup, property, translationY + org.telegram.messenger.g0.L(f10)), ObjectAnimator.ofFloat(viewGroup, View.ALPHA, 0.0f));
                this.f28988a.setDuration(this.f28990c);
            }
            this.f28988a.addListener(new c1(this, 1));
            if (this.f28991e) {
                this.f28995j.d();
            }
            this.f28988a.start();
            return;
        }
        try {
            super.dismiss();
        } catch (Exception unused2) {
        }
        j();
    }

    @Override
    public void dismiss() {
        d(true);
    }

    public final void e() {
        View contentView = getContentView();
        if (contentView instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
            final ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) contentView;
            if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
                setTouchInterceptor(new View.OnTouchListener() {
                    @Override
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        if (motionEvent.getAction() == 0) {
                            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            Drawable backgroundDrawable = actionBarPopupWindow$ActionBarPopupWindowLayout2.getBackgroundDrawable();
                            RectF rectF = org.telegram.messenger.g0.P;
                            rectF.set(backgroundDrawable.getBounds());
                            rectF.offset(actionBarPopupWindow$ActionBarPopupWindowLayout2.getX(), actionBarPopupWindow$ActionBarPopupWindowLayout2.getY());
                            if (!rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                                h1.this.dismiss();
                                return true;
                            }
                            return false;
                        }
                        return false;
                    }
                });
            }
        }
        Field field = f28985l;
        if (field != null) {
            try {
                this.h = (ViewTreeObserver.OnScrollChangedListener) field.get(this);
                field.set(this, f28987n);
            } catch (Exception unused) {
                this.h = null;
            }
        }
    }

    public final void f(View view) {
        ViewTreeObserver viewTreeObserver;
        if (this.h != null) {
            if (view.getWindowToken() != null) {
                viewTreeObserver = view.getViewTreeObserver();
            } else {
                viewTreeObserver = null;
            }
            ViewTreeObserver viewTreeObserver2 = this.f28994i;
            if (viewTreeObserver != viewTreeObserver2) {
                if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                    this.f28994i.removeOnScrollChangedListener(this.h);
                }
                this.f28994i = viewTreeObserver;
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnScrollChangedListener(this.h);
                }
            }
        }
    }

    public final void g() {
        try {
            if (f28984k == null) {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setLayoutInScreenEnabled", Boolean.TYPE);
                f28984k = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            f28984k.invoke(this, Boolean.TRUE);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public final void h() {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        if (this.f28989b && this.f28988a == null) {
            ViewGroup viewGroup = (ViewGroup) getContentView();
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup;
                actionBarPopupWindow$ActionBarPopupWindowLayout.f28738n = true;
            } else {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = null;
                for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                    if (viewGroup.getChildAt(i7) instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout2 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup.getChildAt(i7);
                        actionBarPopupWindow$ActionBarPopupWindowLayout2.f28738n = true;
                    }
                }
                actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY(0.0f);
            HashMap hashMap = actionBarPopupWindow$ActionBarPopupWindowLayout.E;
            float f10 = 1.0f;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(1.0f);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setPivotX(actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth());
            actionBarPopupWindow$ActionBarPopupWindowLayout.setPivotY(0.0f);
            int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
            hashMap.clear();
            int i10 = 0;
            for (int i11 = 0; i11 < itemsCount; i11++) {
                View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i11);
                childAt.setAlpha(0.0f);
                if (childAt.getVisibility() == 0) {
                    hashMap.put(childAt, Integer.valueOf(i10));
                    i10++;
                }
            }
            if (actionBarPopupWindow$ActionBarPopupWindowLayout.f28741w) {
                actionBarPopupWindow$ActionBarPopupWindowLayout.f28740s = itemsCount - 1;
            } else {
                actionBarPopupWindow$ActionBarPopupWindowLayout.f28740s = 0;
            }
            if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
                actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().c(true);
                f10 = actionBarPopupWindow$ActionBarPopupWindowLayout.h;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            this.f28988a = animatorSet;
            animatorSet.playTogether(ObjectAnimator.ofFloat(actionBarPopupWindow$ActionBarPopupWindowLayout, "backScaleY", 0.0f, f10), ObjectAnimator.ofInt(actionBarPopupWindow$ActionBarPopupWindowLayout, "backAlpha", 0, 255));
            this.f28988a.setDuration((i10 * 16) + 150);
            this.f28988a.addListener(new c1(this, 0));
            this.f28988a.start();
        }
    }

    public final void j() {
        ViewTreeObserver viewTreeObserver;
        if (this.h != null && (viewTreeObserver = this.f28994i) != null) {
            if (viewTreeObserver.isAlive()) {
                this.f28994i.removeOnScrollChangedListener(this.h);
            }
            this.f28994i = null;
        }
    }

    @Override
    public final void showAsDropDown(View view, int i7, int i10) {
        try {
            super.showAsDropDown(view, i7, i10);
            f(view);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public void showAtLocation(View view, int i7, int i10, int i11) {
        super.showAtLocation(view, i7, i10, i11);
        j();
    }

    @Override
    public final void update(View view, int i7, int i10, int i11, int i12) {
        super.update(view, i7, i10, i11, i12);
        f(view);
    }

    @Override
    public final void update(View view, int i7, int i10) {
        super.update(view, i7, i10);
        f(view);
    }
}
