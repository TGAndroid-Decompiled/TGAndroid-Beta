package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import org.telegram.messenger.AndroidUtilities;
public abstract class n61 extends PopupWindow {
    public static final Field f39204c;
    public static final org.telegram.ui.ActionBar.h1 d = new org.telegram.ui.ActionBar.h1(2);
    public final ViewTreeObserver.OnScrollChangedListener f39205a;
    public ViewTreeObserver f39206b;

    static {
        Field field = null;
        try {
            field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
            field.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
        f39204c = field;
    }

    public n61(w61 w61Var) {
        super(w61Var, -2, -2);
        setFocusable(true);
        setAnimationStyle(0);
        setOutsideTouchable(true);
        setClippingEnabled(true);
        setInputMethodMode(0);
        setSoftInputMode(4);
        Field field = f39204c;
        if (field != null) {
            try {
                this.f39205a = (ViewTreeObserver.OnScrollChangedListener) field.get(this);
                field.set(this, d);
            } catch (Exception unused) {
                this.f39205a = null;
            }
        }
    }

    public final void b() {
        View rootView = getContentView().getRootView();
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) rootView.getLayoutParams();
        layoutParams.flags |= 2;
        layoutParams.dimAmount = 0.2f;
        ((WindowManager) getContentView().getContext().getSystemService("window")).updateViewLayout(rootView, layoutParams);
    }

    public final void c(View view) {
        ViewTreeObserver viewTreeObserver;
        if (getContentView() instanceof w61) {
            ((w61) getContentView()).s(new m61(this, 1));
        }
        if (this.f39205a != null) {
            if (view.getWindowToken() != null) {
                viewTreeObserver = view.getViewTreeObserver();
            } else {
                viewTreeObserver = null;
            }
            ViewTreeObserver viewTreeObserver2 = this.f39206b;
            if (viewTreeObserver != viewTreeObserver2) {
                if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                    this.f39206b.removeOnScrollChangedListener(this.f39205a);
                }
                this.f39206b = viewTreeObserver;
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnScrollChangedListener(this.f39205a);
                }
            }
        }
    }

    @Override
    public void dismiss() {
        if (getContentView() instanceof w61) {
            w61 w61Var = (w61) getContentView();
            m61 m61Var = new m61(this, 0);
            Integer num = w61Var.V1;
            if (num != null) {
                w61.Z1.put(num, w61Var.f42334o0.e0());
            }
            ValueAnimator valueAnimator = w61Var.S1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                w61Var.S1 = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            w61Var.S1 = ofFloat;
            ofFloat.addUpdateListener(new x41(w61Var, 3));
            w61Var.S1.addListener(new org.telegram.ui.Components.ex0(12, w61Var, m61Var));
            w61Var.S1.setDuration(200L);
            w61Var.S1.setInterpolator(org.telegram.ui.Components.pr.h);
            w61Var.S1.start();
            n51 n51Var = w61Var.f42309c0;
            if (n51Var != null) {
                AndroidUtilities.hideKeyboard(n51Var.h);
            }
            View rootView = getContentView().getRootView();
            WindowManager windowManager = (WindowManager) getContentView().getContext().getSystemService("window");
            if (rootView.getLayoutParams() != null && (rootView.getLayoutParams() instanceof WindowManager.LayoutParams)) {
                WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) rootView.getLayoutParams();
                try {
                    int i10 = layoutParams.flags;
                    if ((i10 & 2) != 0) {
                        layoutParams.flags = i10 & (-3);
                        layoutParams.dimAmount = 0.0f;
                        windowManager.updateViewLayout(rootView, layoutParams);
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            return;
        }
        super.dismiss();
    }

    @Override
    public final void showAsDropDown(View view) {
        super.showAsDropDown(view);
        c(view);
    }

    @Override
    public final void showAtLocation(View view, int i10, int i11, int i12) {
        ViewTreeObserver viewTreeObserver;
        super.showAtLocation(view, i10, i11, i12);
        if (this.f39205a != null && (viewTreeObserver = this.f39206b) != null) {
            if (viewTreeObserver.isAlive()) {
                this.f39206b.removeOnScrollChangedListener(this.f39205a);
            }
            this.f39206b = null;
        }
    }

    @Override
    public final void showAsDropDown(View view, int i10, int i11) {
        super.showAsDropDown(view, i10, i11);
        c(view);
    }

    @Override
    public final void showAsDropDown(View view, int i10, int i11, int i12) {
        super.showAsDropDown(view, i10, i11, i12);
        c(view);
    }
}
