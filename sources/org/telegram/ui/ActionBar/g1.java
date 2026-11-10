package org.telegram.ui.ActionBar;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
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
public class g1 extends PopupWindow {
    public static Method f27486k;
    public static final Field f27487l;
    public static final DecelerateInterpolator f27488m = new DecelerateInterpolator();
    public static final a1 f27489n;
    public AnimatorSet f27490a;
    public boolean f27491b;
    public int f27492c;
    public boolean d;
    public boolean f27493e;
    public long f27494f;
    public boolean f27495g;
    public ViewTreeObserver.OnScrollChangedListener h;
    public ViewTreeObserver f27496i;
    public h2.f f27497j;

    static {
        Field field = null;
        try {
            field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
            field.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
        f27487l = field;
        f27489n = new a1(0);
    }

    public g1(View view, int i7, int i10) {
        super(view, i7, i10);
        this.f27491b = true;
        this.f27492c = 150;
        this.f27494f = -1L;
        this.f27497j = new h2.f((int[]) null);
        e();
    }

    public static void i(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        actionBarPopupWindow$ActionBarPopupWindowLayout.f27294n = true;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY(0.0f);
        float f10 = 1.0f;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(1.0f);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setPivotX(actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth());
        actionBarPopupWindow$ActionBarPopupWindowLayout.setPivotY(0.0f);
        int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
        HashMap hashMap = actionBarPopupWindow$ActionBarPopupWindowLayout.D;
        hashMap.clear();
        int i7 = 0;
        for (int i10 = 0; i10 < itemsCount; i10++) {
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10);
            if (!(childAt instanceof d1)) {
                childAt.setAlpha(0.0f);
                if (childAt.getVisibility() == 0) {
                    hashMap.put(childAt, Integer.valueOf(i7));
                    i7++;
                }
            }
        }
        if (actionBarPopupWindow$ActionBarPopupWindowLayout.f27297w) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.f27296s = itemsCount - 1;
        } else {
            actionBarPopupWindow$ActionBarPopupWindowLayout.f27296s = 0;
        }
        if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().c(true);
            f10 = actionBarPopupWindow$ActionBarPopupWindowLayout.h;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new fi.v3(actionBarPopupWindow$ActionBarPopupWindowLayout, 12));
        actionBarPopupWindow$ActionBarPopupWindowLayout.f27289a = false;
        actionBarPopupWindow$ActionBarPopupWindowLayout.f27290b = true;
        animatorSet.playTogether(ObjectAnimator.ofFloat(actionBarPopupWindow$ActionBarPopupWindowLayout, "backScaleY", 0.0f, f10), ObjectAnimator.ofInt(actionBarPopupWindow$ActionBarPopupWindowLayout, "backAlpha", 0, 255), ofFloat);
        animatorSet.setDuration((i7 * 16) + 150);
        animatorSet.addListener(new m.a(actionBarPopupWindow$ActionBarPopupWindowLayout, 8));
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

    public void d(boolean z9) {
        float f10;
        ArrayList arrayList;
        long j3 = this.f27494f;
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
        AnimatorSet animatorSet = this.f27490a;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = null;
        if (animatorSet != null) {
            if (!z9 || !this.d) {
                animatorSet.cancel();
                this.f27490a = null;
            } else {
                return;
            }
        }
        this.d = false;
        if (this.f27491b && z9) {
            this.d = true;
            ViewGroup viewGroup = (ViewGroup) getContentView();
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                if (viewGroup.getChildAt(i10) instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup.getChildAt(i10);
                }
            }
            if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (arrayList = actionBarPopupWindow$ActionBarPopupWindowLayout.f27299y) != null && !arrayList.isEmpty()) {
                int size = actionBarPopupWindow$ActionBarPopupWindowLayout.f27299y.size();
                for (int i11 = 0; i11 < size; i11++) {
                    AnimatorSet animatorSet2 = (AnimatorSet) actionBarPopupWindow$ActionBarPopupWindowLayout.f27299y.get(i11);
                    animatorSet2.removeAllListeners();
                    animatorSet2.cancel();
                }
                actionBarPopupWindow$ActionBarPopupWindowLayout.f27299y.clear();
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.f27490a = animatorSet3;
            if (j3 > 0) {
                animatorSet3.playTogether(ValueAnimator.ofFloat(0.0f, 1.0f));
                this.f27490a.setDuration(j3);
            } else if (this.f27495g) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(viewGroup, View.SCALE_Y, 0.8f), ObjectAnimator.ofFloat(viewGroup, View.SCALE_X, 0.8f), ObjectAnimator.ofFloat(viewGroup, View.ALPHA, 0.0f));
                this.f27490a.setDuration(this.f27492c);
            } else {
                Property property = View.TRANSLATION_Y;
                float translationY = viewGroup.getTranslationY();
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && actionBarPopupWindow$ActionBarPopupWindowLayout.f27297w) {
                    f10 = 5.0f;
                } else {
                    f10 = -5.0f;
                }
                animatorSet3.playTogether(ObjectAnimator.ofFloat(viewGroup, property, translationY + org.telegram.messenger.g0.L(f10)), ObjectAnimator.ofFloat(viewGroup, View.ALPHA, 0.0f));
                this.f27490a.setDuration(this.f27492c);
            }
            this.f27490a.addListener(new b1(this, 1));
            if (this.f27493e) {
                this.f27497j.d();
            }
            this.f27490a.start();
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
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) contentView;
            if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
                setTouchInterceptor(new fi.n1(1, this, actionBarPopupWindow$ActionBarPopupWindowLayout));
            }
        }
        Field field = f27487l;
        if (field != null) {
            try {
                this.h = (ViewTreeObserver.OnScrollChangedListener) field.get(this);
                field.set(this, f27489n);
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
            ViewTreeObserver viewTreeObserver2 = this.f27496i;
            if (viewTreeObserver != viewTreeObserver2) {
                if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                    this.f27496i.removeOnScrollChangedListener(this.h);
                }
                this.f27496i = viewTreeObserver;
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnScrollChangedListener(this.h);
                }
            }
        }
    }

    public final void g() {
        try {
            if (f27486k == null) {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setLayoutInScreenEnabled", Boolean.TYPE);
                f27486k = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            f27486k.invoke(this, Boolean.TRUE);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public final void h() {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        if (this.f27491b && this.f27490a == null) {
            ViewGroup viewGroup = (ViewGroup) getContentView();
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup;
                actionBarPopupWindow$ActionBarPopupWindowLayout.f27294n = true;
            } else {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = null;
                for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                    if (viewGroup.getChildAt(i7) instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout2 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup.getChildAt(i7);
                        actionBarPopupWindow$ActionBarPopupWindowLayout2.f27294n = true;
                    }
                }
                actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY(0.0f);
            HashMap hashMap = actionBarPopupWindow$ActionBarPopupWindowLayout.D;
            float f10 = 1.0f;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(1.0f);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setPivotX(actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth());
            actionBarPopupWindow$ActionBarPopupWindowLayout.setPivotY(0.0f);
            int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
            hashMap.clear();
            int i10 = 0;
            for (int i11 = 0; i11 < itemsCount; i11++) {
                View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i11);
                childAt.setAlpha(0.0f);
                if (childAt.getVisibility() == 0) {
                    hashMap.put(childAt, Integer.valueOf(i10));
                    i10++;
                }
            }
            if (actionBarPopupWindow$ActionBarPopupWindowLayout.f27297w) {
                actionBarPopupWindow$ActionBarPopupWindowLayout.f27296s = itemsCount - 1;
            } else {
                actionBarPopupWindow$ActionBarPopupWindowLayout.f27296s = 0;
            }
            if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
                actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().c(true);
                f10 = actionBarPopupWindow$ActionBarPopupWindowLayout.h;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            this.f27490a = animatorSet;
            animatorSet.playTogether(ObjectAnimator.ofFloat(actionBarPopupWindow$ActionBarPopupWindowLayout, "backScaleY", 0.0f, f10), ObjectAnimator.ofInt(actionBarPopupWindow$ActionBarPopupWindowLayout, "backAlpha", 0, 255));
            this.f27490a.setDuration((i10 * 16) + 150);
            this.f27490a.addListener(new b1(this, 0));
            this.f27490a.start();
        }
    }

    public final void j() {
        ViewTreeObserver viewTreeObserver;
        if (this.h != null && (viewTreeObserver = this.f27496i) != null) {
            if (viewTreeObserver.isAlive()) {
                this.f27496i.removeOnScrollChangedListener(this.h);
            }
            this.f27496i = null;
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
