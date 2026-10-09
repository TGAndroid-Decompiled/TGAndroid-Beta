package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class nv extends PopupWindow {
    public static Field f29284f;
    public static final org.telegram.ui.ActionBar.g1 f29285g = new org.telegram.ui.ActionBar.g1(1);
    public ViewTreeObserver.OnScrollChangedListener f29286a;
    public ViewTreeObserver f29287b;
    public final mv f29288c;
    public boolean d;
    public final int f29289e;

    public nv(mv mvVar) {
        super(mvVar);
        float f7;
        if (AndroidUtilities.isTablet()) {
            f7 = 40.0f;
        } else {
            f7 = 32.0f;
        }
        this.f29289e = AndroidUtilities.dp(f7);
        this.f29288c = mvVar;
        setOutsideTouchable(true);
        setClippingEnabled(true);
        setInputMethodMode(2);
        setSoftInputMode(0);
        mvVar.setFocusableInTouchMode(true);
        mvVar.setOnKeyListener(new co(this, 1));
    }

    public final void a(View view) {
        ViewTreeObserver viewTreeObserver;
        if (this.f29286a != null) {
            if (view.getWindowToken() != null) {
                viewTreeObserver = view.getViewTreeObserver();
            } else {
                viewTreeObserver = null;
            }
            ViewTreeObserver viewTreeObserver2 = this.f29287b;
            if (viewTreeObserver != viewTreeObserver2) {
                if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                    this.f29287b.removeOnScrollChangedListener(this.f29286a);
                }
                this.f29287b = viewTreeObserver;
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnScrollChangedListener(this.f29286a);
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
        if (this.f29286a != null && (viewTreeObserver = this.f29287b) != null) {
            if (viewTreeObserver.isAlive()) {
                this.f29287b.removeOnScrollChangedListener(this.f29286a);
            }
            this.f29287b = null;
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
        if (this.f29286a != null && (viewTreeObserver = this.f29287b) != null) {
            if (viewTreeObserver.isAlive()) {
                this.f29287b.removeOnScrollChangedListener(this.f29286a);
            }
            this.f29287b = null;
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
