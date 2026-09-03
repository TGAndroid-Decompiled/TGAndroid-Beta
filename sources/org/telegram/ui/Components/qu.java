package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class qu extends PopupWindow {
    public static Field f28266f;
    public static final org.telegram.ui.ActionBar.h1 f28267g = new org.telegram.ui.ActionBar.h1(1);
    public ViewTreeObserver.OnScrollChangedListener f28268a;
    public ViewTreeObserver f28269b;
    public final pu f28270c;
    public boolean d;
    public final int e;

    public qu(pu puVar) {
        super(puVar);
        float f10;
        if (AndroidUtilities.isTablet()) {
            f10 = 40.0f;
        } else {
            f10 = 32.0f;
        }
        this.e = AndroidUtilities.dp(f10);
        this.f28270c = puVar;
        setOutsideTouchable(true);
        setClippingEnabled(true);
        setInputMethodMode(2);
        setSoftInputMode(0);
        puVar.setFocusableInTouchMode(true);
        puVar.setOnKeyListener(new in(this, 1));
    }

    public final void a(View view) {
        ViewTreeObserver viewTreeObserver;
        if (this.f28268a != null) {
            if (view.getWindowToken() != null) {
                viewTreeObserver = view.getViewTreeObserver();
            } else {
                viewTreeObserver = null;
            }
            ViewTreeObserver viewTreeObserver2 = this.f28269b;
            if (viewTreeObserver != viewTreeObserver2) {
                if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                    this.f28269b.removeOnScrollChangedListener(this.f28268a);
                }
                this.f28269b = viewTreeObserver;
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnScrollChangedListener(this.f28268a);
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
        if (this.f28268a != null && (viewTreeObserver = this.f28269b) != null) {
            if (viewTreeObserver.isAlive()) {
                this.f28269b.removeOnScrollChangedListener(this.f28268a);
            }
            this.f28269b = null;
        }
    }

    @Override
    public final void showAsDropDown(View view, int i10, int i11) {
        try {
            super.showAsDropDown(view, i10, i11);
            a(view);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void showAtLocation(View view, int i10, int i11, int i12) {
        ViewTreeObserver viewTreeObserver;
        super.showAtLocation(view, i10, i11, i12);
        if (this.f28268a != null && (viewTreeObserver = this.f28269b) != null) {
            if (viewTreeObserver.isAlive()) {
                this.f28269b.removeOnScrollChangedListener(this.f28268a);
            }
            this.f28269b = null;
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
