package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
public final class ju extends PopupWindow {
    public static Field f27491f;
    public static final org.telegram.ui.ActionBar.c1 f27492g = new org.telegram.ui.ActionBar.c1(1);
    public ViewTreeObserver.OnScrollChangedListener f27493a;
    public ViewTreeObserver f27494b;
    public final iu f27495c;
    public boolean d;
    public final int e;

    public ju(iu iuVar) {
        super(iuVar);
        float f7;
        if (org.telegram.messenger.i0.Q1()) {
            f7 = 40.0f;
        } else {
            f7 = 32.0f;
        }
        this.e = org.telegram.messenger.i0.L(f7);
        this.f27495c = iuVar;
        setOutsideTouchable(true);
        setClippingEnabled(true);
        setInputMethodMode(2);
        setSoftInputMode(0);
        iuVar.setFocusableInTouchMode(true);
        iuVar.setOnKeyListener(new dn(this, 1));
    }

    public final void a(View view) {
        ViewTreeObserver viewTreeObserver;
        if (this.f27493a != null) {
            if (view.getWindowToken() != null) {
                viewTreeObserver = view.getViewTreeObserver();
            } else {
                viewTreeObserver = null;
            }
            ViewTreeObserver viewTreeObserver2 = this.f27494b;
            if (viewTreeObserver != viewTreeObserver2) {
                if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                    this.f27494b.removeOnScrollChangedListener(this.f27493a);
                }
                this.f27494b = viewTreeObserver;
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnScrollChangedListener(this.f27493a);
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
        if (this.f27493a != null && (viewTreeObserver = this.f27494b) != null) {
            if (viewTreeObserver.isAlive()) {
                this.f27494b.removeOnScrollChangedListener(this.f27493a);
            }
            this.f27494b = null;
        }
    }

    @Override
    public final void showAsDropDown(View view, int i10, int i11) {
        try {
            super.showAsDropDown(view, i10, i11);
            a(view);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void showAtLocation(View view, int i10, int i11, int i12) {
        ViewTreeObserver viewTreeObserver;
        super.showAtLocation(view, i10, i11, i12);
        if (this.f27493a != null && (viewTreeObserver = this.f27494b) != null) {
            if (viewTreeObserver.isAlive()) {
                this.f27494b.removeOnScrollChangedListener(this.f27493a);
            }
            this.f27494b = null;
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
