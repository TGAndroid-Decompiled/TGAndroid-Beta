package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import org.telegram.messenger.AndroidUtilities;
public abstract class n61 extends PopupWindow {
    public static final Field f36394c;
    public static final org.telegram.ui.ActionBar.h1 d = new org.telegram.ui.ActionBar.h1(2);
    public final ViewTreeObserver.OnScrollChangedListener f36395a;
    public ViewTreeObserver f36396b;

    static {
        Field field = null;
        try {
            field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
            field.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
        f36394c = field;
    }

    public n61(x61 x61Var) {
        super(x61Var, -2, -2);
        setFocusable(true);
        setAnimationStyle(0);
        setOutsideTouchable(true);
        setClippingEnabled(true);
        setInputMethodMode(0);
        setSoftInputMode(4);
        Field field = f36394c;
        if (field != null) {
            try {
                this.f36395a = (ViewTreeObserver.OnScrollChangedListener) field.get(this);
                field.set(this, d);
            } catch (Exception unused) {
                this.f36395a = null;
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
        if (getContentView() instanceof x61) {
            ((x61) getContentView()).s(new m61(this, 1));
        }
        if (this.f36395a != null) {
            if (view.getWindowToken() != null) {
                viewTreeObserver = view.getViewTreeObserver();
            } else {
                viewTreeObserver = null;
            }
            ViewTreeObserver viewTreeObserver2 = this.f36396b;
            if (viewTreeObserver != viewTreeObserver2) {
                if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                    this.f36396b.removeOnScrollChangedListener(this.f36395a);
                }
                this.f36396b = viewTreeObserver;
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnScrollChangedListener(this.f36395a);
                }
            }
        }
    }

    @Override
    public void dismiss() {
        if (getContentView() instanceof x61) {
            x61 x61Var = (x61) getContentView();
            m61 m61Var = new m61(this, 0);
            Integer num = x61Var.V1;
            if (num != null) {
                x61.Z1.put(num, x61Var.f39882o0.e0());
            }
            ValueAnimator valueAnimator = x61Var.S1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                x61Var.S1 = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            x61Var.S1 = ofFloat;
            ofFloat.addUpdateListener(new x41(x61Var, 3));
            x61Var.S1.addListener(new org.telegram.ui.Components.ex0(12, x61Var, m61Var));
            x61Var.S1.setDuration(200L);
            x61Var.S1.setInterpolator(org.telegram.ui.Components.mr.h);
            x61Var.S1.start();
            n51 n51Var = x61Var.f39858c0;
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
        if (this.f36395a != null && (viewTreeObserver = this.f36396b) != null) {
            if (viewTreeObserver.isAlive()) {
                this.f36396b.removeOnScrollChangedListener(this.f36395a);
            }
            this.f36396b = null;
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
