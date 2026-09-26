package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.messenger.XiaomiUtilities;
public final class gu extends du {
    public Drawable f24586c;
    public final int d;
    public final lu e;

    public gu(lu luVar, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, d6Var);
        this.e = luVar;
        this.d = i10;
        this.f24586c = null;
    }

    @Override
    public final int emojiCacheType() {
        return this.e.h();
    }

    @Override
    public final void extendActionMode(ActionMode actionMode, Menu menu) {
        boolean z10;
        lu luVar = this.e;
        if (luVar.a()) {
            if (luVar.L == 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.wn.k8(menu, null, z10, true, true, true);
            return;
        }
        luVar.i(menu);
    }

    @Override
    public final int getActionModeStyle() {
        int i10 = this.d;
        if (i10 == 2 || i10 == 3) {
            return 2;
        }
        return super.getActionModeStyle();
    }

    @Override
    public final void onLineCountChanged(int i10, int i11) {
        this.e.q(i10, i11);
    }

    @Override
    public final void onSelectionChanged(int i10, int i11) {
        boolean z10;
        super.onSelectionChanged(i10, i11);
        lu luVar = this.e;
        cm0 cm0Var = luVar.f26174c;
        if (cm0Var != null) {
            boolean z11 = false;
            if (i11 != i10) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (luVar.a() && z10) {
                XiaomiUtilities.isMIUI();
                z11 = true;
            }
            if (luVar.f26176n != z11) {
                luVar.f26176n = z11;
                if (z11) {
                    this.f24586c = cm0Var.d;
                    cm0Var.a(R.drawable.msg_edit, true);
                    return;
                }
                cm0Var.b(this.f24586c, true);
                this.f24586c = null;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        hu huVar;
        lu luVar = this.e;
        if (luVar.e && motionEvent.getAction() == 0) {
            luVar.u();
            if (luVar.f26180x && (huVar = luVar.d) != null) {
                huVar.t(false);
                luVar.f26180x = false;
                luVar.k(true);
                AndroidUtilities.showKeyboard(this);
            } else {
                if (AndroidUtilities.usingHardwareInput) {
                    i10 = 0;
                } else {
                    i10 = 2;
                }
                luVar.x(i10);
            }
            luVar.v();
        }
        if (motionEvent.getAction() == 0) {
            boolean isFocused = isFocused();
            requestFocus();
            if (!AndroidUtilities.showKeyboard(this)) {
                clearFocus();
                requestFocus();
            }
            if (!isFocused) {
                setSelection(getText().length());
            }
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Exception e) {
            FileLog.e(e);
            return false;
        }
    }

    @Override
    public final void scrollTo(int i10, int i11) {
        if (this.e.t(i11)) {
            super.scrollTo(i10, i11);
        }
    }
}
