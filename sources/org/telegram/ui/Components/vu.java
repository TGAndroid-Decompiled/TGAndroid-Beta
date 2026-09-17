package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class vu extends PopupWindow {
    public static Field f31982f;
    public static final org.telegram.ui.ActionBar.g1 f31983g = new org.telegram.ui.ActionBar.g1(1);
    public ViewTreeObserver.OnScrollChangedListener f31984a;
    public ViewTreeObserver f31985b;
    public final uu f31986c;
    public boolean d;
    public final int f31987e;

    public vu(uu uuVar) {
        super(uuVar);
        float f7;
        if (AndroidUtilities.isTablet()) {
            f7 = 40.0f;
        } else {
            f7 = 32.0f;
        }
        this.f31987e = AndroidUtilities.dp(f7);
        this.f31986c = uuVar;
        setOutsideTouchable(true);
        setClippingEnabled(true);
        setInputMethodMode(2);
        setSoftInputMode(0);
        uuVar.setFocusableInTouchMode(true);
        uuVar.setOnKeyListener(new ln(this, 1));
    }

    public final void a(View view) {
        ViewTreeObserver viewTreeObserver;
        if (this.f31984a != null) {
            if (view.getWindowToken() != null) {
                viewTreeObserver = view.getViewTreeObserver();
            } else {
                viewTreeObserver = null;
            }
            ViewTreeObserver viewTreeObserver2 = this.f31985b;
            if (viewTreeObserver != viewTreeObserver2) {
                if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                    this.f31985b.removeOnScrollChangedListener(this.f31984a);
                }
                this.f31985b = viewTreeObserver;
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnScrollChangedListener(this.f31984a);
                }
            }
        }
    }

    @Override
    public final void dismiss() {
        ViewTreeObserver viewTreeObserver;
        setFocusable(false);
        try {
            super.dismiss();
        } catch (Exception unused) {
        }
        if (this.f31984a != null && (viewTreeObserver = this.f31985b) != null) {
            if (viewTreeObserver.isAlive()) {
                this.f31985b.removeOnScrollChangedListener(this.f31984a);
            }
            this.f31985b = null;
        }
    }

    @Override
    public final void showAsDropDown(View view, int i10, int i11) {
        try {
            super.showAsDropDown(view, i10, i11);
            a(view);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public final void showAtLocation(View view, int i10, int i11, int i12) {
        ViewTreeObserver viewTreeObserver;
        super.showAtLocation(view, i10, i11, i12);
        if (this.f31984a != null && (viewTreeObserver = this.f31985b) != null) {
            if (viewTreeObserver.isAlive()) {
                this.f31985b.removeOnScrollChangedListener(this.f31984a);
            }
            this.f31985b = null;
        }
    }

    @Override
    public final void update(View view, int i10, int i11, int i12, int i13) {
        super.update(view, i10, i11, i12, i13);
        a(view);
    }

    @Override
    public final void update(View view, int i10, int i11) {
        super.update(view, i10, i11);
        a(view);
    }
}
