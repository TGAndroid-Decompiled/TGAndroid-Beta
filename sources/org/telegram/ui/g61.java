package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import org.telegram.messenger.AndroidUtilities;
public abstract class g61 extends PopupWindow {
    public static final Field f34454c;
    public static final org.telegram.ui.ActionBar.h1 d = new org.telegram.ui.ActionBar.h1(2);
    public final ViewTreeObserver.OnScrollChangedListener f34455a;
    public ViewTreeObserver f34456b;

    static {
        Field field = null;
        try {
            field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
            field.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
        f34454c = field;
    }

    public g61(q61 q61Var) {
        super(q61Var, -2, -2);
        setFocusable(true);
        setAnimationStyle(0);
        setOutsideTouchable(true);
        setClippingEnabled(true);
        setInputMethodMode(0);
        setSoftInputMode(4);
        Field field = f34454c;
        if (field != null) {
            try {
                this.f34455a = (ViewTreeObserver.OnScrollChangedListener) field.get(this);
                field.set(this, d);
            } catch (Exception unused) {
                this.f34455a = null;
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
        if (getContentView() instanceof q61) {
            ((q61) getContentView()).s(new f61(this, 1));
        }
        if (this.f34455a != null) {
            if (view.getWindowToken() != null) {
                viewTreeObserver = view.getViewTreeObserver();
            } else {
                viewTreeObserver = null;
            }
            ViewTreeObserver viewTreeObserver2 = this.f34456b;
            if (viewTreeObserver != viewTreeObserver2) {
                if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                    this.f34456b.removeOnScrollChangedListener(this.f34455a);
                }
                this.f34456b = viewTreeObserver;
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnScrollChangedListener(this.f34455a);
                }
            }
        }
    }

    @Override
    public void dismiss() {
        if (getContentView() instanceof q61) {
            q61 q61Var = (q61) getContentView();
            f61 f61Var = new f61(this, 0);
            Integer num = q61Var.V1;
            if (num != null) {
                q61.Z1.put(num, q61Var.f37625o0.e0());
            }
            ValueAnimator valueAnimator = q61Var.S1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                q61Var.S1 = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            q61Var.S1 = ofFloat;
            ofFloat.addUpdateListener(new q41(q61Var, 3));
            q61Var.S1.addListener(new org.telegram.ui.Components.ex0(12, q61Var, f61Var));
            q61Var.S1.setDuration(200L);
            q61Var.S1.setInterpolator(org.telegram.ui.Components.nr.h);
            q61Var.S1.start();
            g51 g51Var = q61Var.f37601c0;
            if (g51Var != null) {
                AndroidUtilities.hideKeyboard(g51Var.h);
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
        if (this.f34455a != null && (viewTreeObserver = this.f34456b) != null) {
            if (viewTreeObserver.isAlive()) {
                this.f34456b.removeOnScrollChangedListener(this.f34455a);
            }
            this.f34456b = null;
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
