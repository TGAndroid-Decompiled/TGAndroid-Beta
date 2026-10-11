package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class ov extends PopupWindow {
    public static Field f29526f;
    public static final org.telegram.ui.ActionBar.f1 f29527g = new org.telegram.ui.ActionBar.f1(1);
    public ViewTreeObserver.OnScrollChangedListener f29528a;
    public ViewTreeObserver f29529b;
    public final nv f29530c;
    public boolean d;
    public final int f29531e;

    public ov(nv nvVar) {
        super(nvVar);
        float f7;
        if (AndroidUtilities.isTablet()) {
            f7 = 40.0f;
        } else {
            f7 = 32.0f;
        }
        this.f29531e = AndroidUtilities.dp(f7);
        this.f29530c = nvVar;
        setOutsideTouchable(true);
        setClippingEnabled(true);
        setInputMethodMode(2);
        setSoftInputMode(0);
        nvVar.setFocusableInTouchMode(true);
        nvVar.setOnKeyListener(new co(this, 1));
    }

    public final void a(View view) {
        ViewTreeObserver viewTreeObserver;
        if (this.f29528a != null) {
            if (view.getWindowToken() != null) {
                viewTreeObserver = view.getViewTreeObserver();
            } else {
                viewTreeObserver = null;
            }
            ViewTreeObserver viewTreeObserver2 = this.f29529b;
            if (viewTreeObserver != viewTreeObserver2) {
                if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                    this.f29529b.removeOnScrollChangedListener(this.f29528a);
                }
                this.f29529b = viewTreeObserver;
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnScrollChangedListener(this.f29528a);
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
        if (this.f29528a != null && (viewTreeObserver = this.f29529b) != null) {
            if (viewTreeObserver.isAlive()) {
                this.f29529b.removeOnScrollChangedListener(this.f29528a);
            }
            this.f29529b = null;
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
        if (this.f29528a != null && (viewTreeObserver = this.f29529b) != null) {
            if (viewTreeObserver.isAlive()) {
                this.f29529b.removeOnScrollChangedListener(this.f29528a);
            }
            this.f29529b = null;
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
