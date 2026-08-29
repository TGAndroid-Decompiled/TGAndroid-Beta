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
public final class vt extends st {
    public Drawable f34179c;
    public final int d;
    public final au f34180e;

    public vt(au auVar, Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, c6Var);
        this.f34180e = auVar;
        this.d = i10;
        this.f34179c = null;
    }

    @Override
    public final int emojiCacheType() {
        return this.f34180e.h();
    }

    @Override
    public final void extendActionMode(ActionMode actionMode, Menu menu) {
        boolean z10;
        au auVar = this.f34180e;
        if (auVar.a()) {
            if (auVar.H == 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.tn.k8(menu, null, z10, true, true, true);
            return;
        }
        auVar.i(menu);
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
        this.f34180e.q(i10, i11);
    }

    @Override
    public final void onSelectionChanged(int i10, int i11) {
        boolean z10;
        super.onSelectionChanged(i10, i11);
        au auVar = this.f34180e;
        ol0 ol0Var = auVar.f26884c;
        if (ol0Var != null) {
            boolean z11 = false;
            if (i11 != i10) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (auVar.a() && z10) {
                XiaomiUtilities.isMIUI();
                z11 = true;
            }
            if (auVar.f26887n != z11) {
                auVar.f26887n = z11;
                if (z11) {
                    this.f34179c = ol0Var.d;
                    ol0Var.a(R.drawable.msg_edit, true);
                    return;
                }
                ol0Var.b(this.f34179c, true);
                this.f34179c = null;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        wt wtVar;
        au auVar = this.f34180e;
        if (auVar.f26885e && motionEvent.getAction() == 0) {
            auVar.u();
            if (auVar.f26891x && (wtVar = auVar.d) != null) {
                wtVar.t(false);
                auVar.f26891x = false;
                auVar.k(true);
                AndroidUtilities.showKeyboard(this);
            } else {
                if (AndroidUtilities.usingHardwareInput) {
                    i10 = 0;
                } else {
                    i10 = 2;
                }
                auVar.x(i10);
            }
            auVar.v();
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
    public final void scrollTo(int i10, int i11) {
        if (this.f34180e.t(i11)) {
            super.scrollTo(i10, i11);
        }
    }
}
