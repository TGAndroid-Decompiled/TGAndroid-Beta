package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import org.telegram.messenger.AndroidUtilities;
public abstract class i61 extends PopupWindow {
    public static final Field f37760c;
    public static final org.telegram.ui.ActionBar.h1 d = new org.telegram.ui.ActionBar.h1(2);
    public final ViewTreeObserver.OnScrollChangedListener f37761a;
    public ViewTreeObserver f37762b;

    static {
        Field field = null;
        try {
            field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
            field.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
        f37760c = field;
    }

    public i61(r61 r61Var) {
        super(r61Var, -2, -2);
        setFocusable(true);
        setAnimationStyle(0);
        setOutsideTouchable(true);
        setClippingEnabled(true);
        setInputMethodMode(0);
        setSoftInputMode(4);
        Field field = f37760c;
        if (field != null) {
            try {
                this.f37761a = (ViewTreeObserver.OnScrollChangedListener) field.get(this);
                field.set(this, d);
            } catch (Exception unused) {
                this.f37761a = null;
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
        if (getContentView() instanceof r61) {
            ((r61) getContentView()).s(new h61(this, 1));
        }
        if (this.f37761a != null) {
            if (view.getWindowToken() != null) {
                viewTreeObserver = view.getViewTreeObserver();
            } else {
                viewTreeObserver = null;
            }
            ViewTreeObserver viewTreeObserver2 = this.f37762b;
            if (viewTreeObserver != viewTreeObserver2) {
                if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                    this.f37762b.removeOnScrollChangedListener(this.f37761a);
                }
                this.f37762b = viewTreeObserver;
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnScrollChangedListener(this.f37761a);
                }
            }
        }
    }

    @Override
    public void dismiss() {
        if (getContentView() instanceof r61) {
            r61 r61Var = (r61) getContentView();
            h61 h61Var = new h61(this, 0);
            Integer num = r61Var.V1;
            if (num != null) {
                r61.Z1.put(num, r61Var.f40811o0.e0());
            }
            ValueAnimator valueAnimator = r61Var.S1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                r61Var.S1 = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            r61Var.S1 = ofFloat;
            ofFloat.addUpdateListener(new s41(r61Var, 3));
            r61Var.S1.addListener(new org.telegram.ui.Components.fx0(12, r61Var, h61Var));
            r61Var.S1.setDuration(200L);
            r61Var.S1.setInterpolator(org.telegram.ui.Components.pr.h);
            r61Var.S1.start();
            i51 i51Var = r61Var.f40786c0;
            if (i51Var != null) {
                AndroidUtilities.hideKeyboard(i51Var.h);
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
        if (this.f37761a != null && (viewTreeObserver = this.f37762b) != null) {
            if (viewTreeObserver.isAlive()) {
                this.f37762b.removeOnScrollChangedListener(this.f37761a);
            }
            this.f37762b = null;
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
