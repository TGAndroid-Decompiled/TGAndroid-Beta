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
public final class pt extends mt {
    public Drawable f31750c;
    public final int d;
    public final ut f31751e;

    public pt(ut utVar, Context context, org.telegram.ui.ActionBar.b6 b6Var, int i9) {
        super(context, b6Var);
        this.f31751e = utVar;
        this.d = i9;
        this.f31750c = null;
    }

    @Override
    public final int emojiCacheType() {
        return this.f31751e.h();
    }

    @Override
    public final void extendActionMode(ActionMode actionMode, Menu menu) {
        boolean z10;
        ut utVar = this.f31751e;
        if (utVar.a()) {
            if (utVar.H == 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.qn.k8(menu, null, z10, true, true, true);
            return;
        }
        utVar.i(menu);
    }

    @Override
    public final int getActionModeStyle() {
        int i9 = this.d;
        if (i9 == 2 || i9 == 3) {
            return 2;
        }
        return super.getActionModeStyle();
    }

    @Override
    public final void onLineCountChanged(int i9, int i10) {
        this.f31751e.q(i9, i10);
    }

    @Override
    public final void onSelectionChanged(int i9, int i10) {
        boolean z10;
        super.onSelectionChanged(i9, i10);
        ut utVar = this.f31751e;
        bl0 bl0Var = utVar.f33123c;
        if (bl0Var != null) {
            boolean z11 = false;
            if (i10 != i9) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (utVar.a() && z10) {
                XiaomiUtilities.isMIUI();
                z11 = true;
            }
            if (utVar.f33126n != z11) {
                utVar.f33126n = z11;
                if (z11) {
                    this.f31750c = bl0Var.d;
                    bl0Var.a(R.drawable.msg_edit, true);
                    return;
                }
                bl0Var.b(this.f31750c, true);
                this.f31750c = null;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i9;
        qt qtVar;
        ut utVar = this.f31751e;
        if (utVar.f33124e && motionEvent.getAction() == 0) {
            utVar.u();
            if (utVar.f33130x && (qtVar = utVar.d) != null) {
                qtVar.t(false);
                utVar.f33130x = false;
                utVar.k(true);
                AndroidUtilities.showKeyboard(this);
            } else {
                if (AndroidUtilities.usingHardwareInput) {
                    i9 = 0;
                } else {
                    i9 = 2;
                }
                utVar.x(i9);
            }
            utVar.v();
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
        } catch (Exception e10) {
            FileLog.e(e10);
            return false;
        }
    }

    @Override
    public final void scrollTo(int i9, int i10) {
        if (this.f31751e.t(i10)) {
            super.scrollTo(i9, i10);
        }
    }
}
