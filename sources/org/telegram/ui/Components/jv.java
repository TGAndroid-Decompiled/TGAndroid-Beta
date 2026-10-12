package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class jv extends PopupWindow {
    public static Field f26498f;
    public static final org.telegram.ui.ActionBar.f1 f26499g = new org.telegram.ui.ActionBar.f1(1);
    public ViewTreeObserver.OnScrollChangedListener f26500a;
    public ViewTreeObserver f26501b;
    public final iv f26502c;
    public boolean d;
    public final int e;

    public jv(iv ivVar) {
        super(ivVar);
        float f7;
        if (AndroidUtilities.isTablet()) {
            f7 = 40.0f;
        } else {
            f7 = 32.0f;
        }
        this.e = AndroidUtilities.dp(f7);
        this.f26502c = ivVar;
        setOutsideTouchable(true);
        setClippingEnabled(true);
        setInputMethodMode(2);
        setSoftInputMode(0);
        ivVar.setFocusableInTouchMode(true);
        ivVar.setOnKeyListener(new zn(this, 1));
    }

    public final void a(View view) {
        ViewTreeObserver viewTreeObserver;
        if (this.f26500a != null) {
            if (view.getWindowToken() != null) {
                viewTreeObserver = view.getViewTreeObserver();
            } else {
                viewTreeObserver = null;
            }
            ViewTreeObserver viewTreeObserver2 = this.f26501b;
            if (viewTreeObserver != viewTreeObserver2) {
                if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                    this.f26501b.removeOnScrollChangedListener(this.f26500a);
                }
                this.f26501b = viewTreeObserver;
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnScrollChangedListener(this.f26500a);
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
        if (this.f26500a != null && (viewTreeObserver = this.f26501b) != null) {
            if (viewTreeObserver.isAlive()) {
                this.f26501b.removeOnScrollChangedListener(this.f26500a);
            }
            this.f26501b = null;
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
        if (this.f26500a != null && (viewTreeObserver = this.f26501b) != null) {
            if (viewTreeObserver.isAlive()) {
                this.f26501b.removeOnScrollChangedListener(this.f26500a);
            }
            this.f26501b = null;
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
