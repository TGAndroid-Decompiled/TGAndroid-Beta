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
public class f1 extends PopupWindow {
    public static Method f27488k;
    public static final Field f27489l;
    public static final DecelerateInterpolator f27490m = new DecelerateInterpolator();
    public static final z0 f27491n;
    public AnimatorSet f27492a;
    public boolean f27493b;
    public int f27494c;
    public boolean d;
    public boolean f27495e;
    public long f27496f;
    public boolean f27497g;
    public ViewTreeObserver.OnScrollChangedListener h;
    public ViewTreeObserver f27498i;
    public g2.g f27499j;

    static {
        Field field = null;
        try {
            field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
            field.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
        f27489l = field;
        f27491n = new z0(0);
    }

    public f1(View view, int i3, int i10) {
        super(view, i3, i10);
        this.f27493b = true;
        this.f27494c = 150;
        this.f27496f = -1L;
        this.f27499j = new g2.g((int[]) null);
        e();
    }

    public static void i(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        actionBarPopupWindow$ActionBarPopupWindowLayout.f27337n = true;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY(0.0f);
        float f10 = 1.0f;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(1.0f);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setPivotX(actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth());
        actionBarPopupWindow$ActionBarPopupWindowLayout.setPivotY(0.0f);
        int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
        HashMap hashMap = actionBarPopupWindow$ActionBarPopupWindowLayout.E;
        hashMap.clear();
        int i3 = 0;
        for (int i10 = 0; i10 < itemsCount; i10++) {
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i10);
            if (!(childAt instanceof c1)) {
                childAt.setAlpha(0.0f);
                if (childAt.getVisibility() == 0) {
                    hashMap.put(childAt, Integer.valueOf(i3));
                    i3++;
                }
            }
        }
        if (actionBarPopupWindow$ActionBarPopupWindowLayout.f27340w) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.f27339s = itemsCount - 1;
        } else {
            actionBarPopupWindow$ActionBarPopupWindowLayout.f27339s = 0;
        }
        if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().c(true);
            f10 = actionBarPopupWindow$ActionBarPopupWindowLayout.h;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new gi.j3(actionBarPopupWindow$ActionBarPopupWindowLayout, 13));
        actionBarPopupWindow$ActionBarPopupWindowLayout.f27332a = false;
        actionBarPopupWindow$ActionBarPopupWindowLayout.f27333b = true;
        animatorSet.playTogether(ObjectAnimator.ofFloat(actionBarPopupWindow$ActionBarPopupWindowLayout, "backScaleY", 0.0f, f10), ObjectAnimator.ofInt(actionBarPopupWindow$ActionBarPopupWindowLayout, "backAlpha", 0, 255), ofFloat);
        animatorSet.setDuration((i3 * 16) + 150);
        animatorSet.addListener(new ii.v3(actionBarPopupWindow$ActionBarPopupWindowLayout, 9));
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
        long j10 = this.f27496f;
        setFocusable(false);
        View rootView = getContentView().getRootView();
        WindowManager windowManager = (WindowManager) getContentView().getContext().getSystemService("window");
        if (rootView.getLayoutParams() != null && (rootView.getLayoutParams() instanceof WindowManager.LayoutParams)) {
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) rootView.getLayoutParams();
            try {
                int i3 = layoutParams.flags;
                if ((i3 & 2) != 0) {
                    layoutParams.flags = i3 & (-3);
                    layoutParams.dimAmount = 0.0f;
                    windowManager.updateViewLayout(rootView, layoutParams);
                }
            } catch (Exception unused) {
            }
        }
        AnimatorSet animatorSet = this.f27492a;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = null;
        if (animatorSet != null) {
            if (!z10 || !this.d) {
                animatorSet.cancel();
                this.f27492a = null;
            } else {
                return;
            }
        }
        this.d = false;
        if (this.f27493b && z10) {
            this.d = true;
            ViewGroup viewGroup = (ViewGroup) getContentView();
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                if (viewGroup.getChildAt(i10) instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup.getChildAt(i10);
                }
            }
            if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (arrayList = actionBarPopupWindow$ActionBarPopupWindowLayout.f27342y) != null && !arrayList.isEmpty()) {
                int size = actionBarPopupWindow$ActionBarPopupWindowLayout.f27342y.size();
                for (int i11 = 0; i11 < size; i11++) {
                    AnimatorSet animatorSet2 = (AnimatorSet) actionBarPopupWindow$ActionBarPopupWindowLayout.f27342y.get(i11);
                    animatorSet2.removeAllListeners();
                    animatorSet2.cancel();
                }
                actionBarPopupWindow$ActionBarPopupWindowLayout.f27342y.clear();
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.f27492a = animatorSet3;
            if (j10 > 0) {
                animatorSet3.playTogether(ValueAnimator.ofFloat(0.0f, 1.0f));
                this.f27492a.setDuration(j10);
            } else if (this.f27497g) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(viewGroup, View.SCALE_Y, 0.8f), ObjectAnimator.ofFloat(viewGroup, View.SCALE_X, 0.8f), ObjectAnimator.ofFloat(viewGroup, View.ALPHA, 0.0f));
                this.f27492a.setDuration(this.f27494c);
            } else {
                Property property = View.TRANSLATION_Y;
                float translationY = viewGroup.getTranslationY();
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && actionBarPopupWindow$ActionBarPopupWindowLayout.f27340w) {
                    f10 = 5.0f;
                } else {
                    f10 = -5.0f;
                }
                animatorSet3.playTogether(ObjectAnimator.ofFloat(viewGroup, property, translationY + org.telegram.messenger.g0.L(f10)), ObjectAnimator.ofFloat(viewGroup, View.ALPHA, 0.0f));
                this.f27492a.setDuration(this.f27494c);
            }
            this.f27492a.addListener(new a1(this, 1));
            if (this.f27495e) {
                this.f27499j.d();
            }
            this.f27492a.start();
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
                setTouchInterceptor(new gi.n1(1, this, actionBarPopupWindow$ActionBarPopupWindowLayout));
            }
        }
        Field field = f27489l;
        if (field != null) {
            try {
                this.h = (ViewTreeObserver.OnScrollChangedListener) field.get(this);
                field.set(this, f27491n);
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
            ViewTreeObserver viewTreeObserver2 = this.f27498i;
            if (viewTreeObserver != viewTreeObserver2) {
                if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                    this.f27498i.removeOnScrollChangedListener(this.h);
                }
                this.f27498i = viewTreeObserver;
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnScrollChangedListener(this.h);
                }
            }
        }
    }

    public final void g() {
        try {
            if (f27488k == null) {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setLayoutInScreenEnabled", Boolean.TYPE);
                f27488k = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            f27488k.invoke(this, Boolean.TRUE);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public final void h() {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        if (this.f27493b && this.f27492a == null) {
            ViewGroup viewGroup = (ViewGroup) getContentView();
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup;
                actionBarPopupWindow$ActionBarPopupWindowLayout.f27337n = true;
            } else {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = null;
                for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                    if (viewGroup.getChildAt(i3) instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout2 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup.getChildAt(i3);
                        actionBarPopupWindow$ActionBarPopupWindowLayout2.f27337n = true;
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
            if (actionBarPopupWindow$ActionBarPopupWindowLayout.f27340w) {
                actionBarPopupWindow$ActionBarPopupWindowLayout.f27339s = itemsCount - 1;
            } else {
                actionBarPopupWindow$ActionBarPopupWindowLayout.f27339s = 0;
            }
            if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
                actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().c(true);
                f10 = actionBarPopupWindow$ActionBarPopupWindowLayout.h;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            this.f27492a = animatorSet;
            animatorSet.playTogether(ObjectAnimator.ofFloat(actionBarPopupWindow$ActionBarPopupWindowLayout, "backScaleY", 0.0f, f10), ObjectAnimator.ofInt(actionBarPopupWindow$ActionBarPopupWindowLayout, "backAlpha", 0, 255));
            this.f27492a.setDuration((i10 * 16) + 150);
            this.f27492a.addListener(new a1(this, 0));
            this.f27492a.start();
        }
    }

    public final void j() {
        ViewTreeObserver viewTreeObserver;
        if (this.h != null && (viewTreeObserver = this.f27498i) != null) {
            if (viewTreeObserver.isAlive()) {
                this.f27498i.removeOnScrollChangedListener(this.h);
            }
            this.f27498i = null;
        }
    }

    @Override
    public final void showAsDropDown(View view, int i3, int i10) {
        try {
            super.showAsDropDown(view, i3, i10);
            f(view);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public void showAtLocation(View view, int i3, int i10, int i11) {
        super.showAtLocation(view, i3, i10, i11);
        j();
    }

    @Override
    public final void update(View view, int i3, int i10, int i11, int i12) {
        super.update(view, i3, i10, i11, i12);
        f(view);
    }

    @Override
    public final void update(View view, int i3, int i10) {
        super.update(view, i3, i10);
        f(view);
    }
}
