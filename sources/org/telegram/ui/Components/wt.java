package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
public final class wt extends PopupWindow {
    public static Field f40145f;
    public static final org.telegram.ui.ActionBar.z0 f40146g = new org.telegram.ui.ActionBar.z0(1);
    public ViewTreeObserver.OnScrollChangedListener f40147a;
    public ViewTreeObserver f40148b;
    public final vt f40149c;
    public boolean d;
    public final int f40150e;

    public wt(vt vtVar) {
        super(vtVar);
        float f10;
        if (org.telegram.messenger.g0.Q1()) {
            f10 = 40.0f;
        } else {
            f10 = 32.0f;
        }
        this.f40150e = org.telegram.messenger.g0.L(f10);
        this.f40149c = vtVar;
        setOutsideTouchable(true);
        setClippingEnabled(true);
        setInputMethodMode(2);
        setSoftInputMode(0);
        vtVar.setFocusableInTouchMode(true);
        vtVar.setOnKeyListener(new um(this, 1));
    }

    public final void a(View view) {
        ViewTreeObserver viewTreeObserver;
        if (this.f40147a != null) {
            if (view.getWindowToken() != null) {
                viewTreeObserver = view.getViewTreeObserver();
            } else {
                viewTreeObserver = null;
            }
            ViewTreeObserver viewTreeObserver2 = this.f40148b;
            if (viewTreeObserver != viewTreeObserver2) {
                if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                    this.f40148b.removeOnScrollChangedListener(this.f40147a);
                }
                this.f40148b = viewTreeObserver;
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnScrollChangedListener(this.f40147a);
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
        if (this.f40147a != null && (viewTreeObserver = this.f40148b) != null) {
            if (viewTreeObserver.isAlive()) {
                this.f40148b.removeOnScrollChangedListener(this.f40147a);
            }
            this.f40148b = null;
        }
    }

    @Override
    public final void showAsDropDown(View view, int i3, int i10) {
        try {
            super.showAsDropDown(view, i3, i10);
            a(view);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void showAtLocation(View view, int i3, int i10, int i11) {
        ViewTreeObserver viewTreeObserver;
        super.showAtLocation(view, i3, i10, i11);
        if (this.f40147a != null && (viewTreeObserver = this.f40148b) != null) {
            if (viewTreeObserver.isAlive()) {
                this.f40148b.removeOnScrollChangedListener(this.f40147a);
            }
            this.f40148b = null;
        }
    }

    @Override
    public final void update(View view, int i3, int i10, int i11, int i12) {
        super.update(view, i3, i10, i11, i12);
        a(view);
    }

    @Override
    public final void update(View view, int i3, int i10) {
        super.update(view, i3, i10);
        a(view);
    }
}
