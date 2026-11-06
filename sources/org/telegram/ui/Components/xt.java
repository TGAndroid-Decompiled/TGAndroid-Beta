package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
public final class xt extends PopupWindow {
    public static Field f40411f;
    public static final org.telegram.ui.ActionBar.a1 f40412g = new org.telegram.ui.ActionBar.a1(1);
    public ViewTreeObserver.OnScrollChangedListener f40413a;
    public ViewTreeObserver f40414b;
    public final wt f40415c;
    public boolean d;
    public final int f40416e;

    public xt(wt wtVar) {
        super(wtVar);
        float f10;
        if (org.telegram.messenger.g0.Q1()) {
            f10 = 40.0f;
        } else {
            f10 = 32.0f;
        }
        this.f40416e = org.telegram.messenger.g0.L(f10);
        this.f40415c = wtVar;
        setOutsideTouchable(true);
        setClippingEnabled(true);
        setInputMethodMode(2);
        setSoftInputMode(0);
        wtVar.setFocusableInTouchMode(true);
        wtVar.setOnKeyListener(new vm(this, 1));
    }

    public final void a(View view) {
        ViewTreeObserver viewTreeObserver;
        if (this.f40413a != null) {
            if (view.getWindowToken() != null) {
                viewTreeObserver = view.getViewTreeObserver();
            } else {
                viewTreeObserver = null;
            }
            ViewTreeObserver viewTreeObserver2 = this.f40414b;
            if (viewTreeObserver != viewTreeObserver2) {
                if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                    this.f40414b.removeOnScrollChangedListener(this.f40413a);
                }
                this.f40414b = viewTreeObserver;
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnScrollChangedListener(this.f40413a);
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
        if (this.f40413a != null && (viewTreeObserver = this.f40414b) != null) {
            if (viewTreeObserver.isAlive()) {
                this.f40414b.removeOnScrollChangedListener(this.f40413a);
            }
            this.f40414b = null;
        }
    }

    @Override
    public final void showAsDropDown(View view, int i7, int i10) {
        try {
            super.showAsDropDown(view, i7, i10);
            a(view);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void showAtLocation(View view, int i7, int i10, int i11) {
        ViewTreeObserver viewTreeObserver;
        super.showAtLocation(view, i7, i10, i11);
        if (this.f40413a != null && (viewTreeObserver = this.f40414b) != null) {
            if (viewTreeObserver.isAlive()) {
                this.f40414b.removeOnScrollChangedListener(this.f40413a);
            }
            this.f40414b = null;
        }
    }

    @Override
    public final void update(View view, int i7, int i10, int i11, int i12) {
        super.update(view, i7, i10, i11, i12);
        a(view);
    }

    @Override
    public final void update(View view, int i7, int i10) {
        super.update(view, i7, i10);
        a(view);
    }
}
