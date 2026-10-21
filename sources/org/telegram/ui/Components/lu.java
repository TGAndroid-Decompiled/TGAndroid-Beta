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
public final class lu extends iu {
    public Drawable f28276c;
    public final int d;
    public final qu e;

    public lu(qu quVar, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, d6Var);
        this.e = quVar;
        this.d = i10;
        this.f28276c = null;
    }

    @Override
    public final int emojiCacheType() {
        return this.e.h();
    }

    @Override
    public final void extendActionMode(ActionMode actionMode, Menu menu) {
        boolean z10;
        qu quVar = this.e;
        if (quVar.a()) {
            if (quVar.L == 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.qn.n8(menu, null, z10, true, true, true);
            return;
        }
        quVar.i(menu);
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
        qu quVar = this.e;
        om0 om0Var = quVar.f29712c;
        if (om0Var != null) {
            boolean z11 = false;
            if (i11 != i10) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (quVar.a() && z10) {
                XiaomiUtilities.isMIUI();
                z11 = true;
            }
            if (quVar.f29714n != z11) {
                quVar.f29714n = z11;
                if (z11) {
                    this.f28276c = om0Var.d;
                    om0Var.a(R.drawable.msg_edit, true);
                    return;
                }
                om0Var.b(this.f28276c, true);
                this.f28276c = null;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        mu muVar;
        qu quVar = this.e;
        if (quVar.e && motionEvent.getAction() == 0) {
            quVar.u();
            if (quVar.f29718x && (muVar = quVar.d) != null) {
                muVar.u(false);
                quVar.f29718x = false;
                quVar.k(true);
                AndroidUtilities.showKeyboard(this);
            } else {
                if (AndroidUtilities.usingHardwareInput) {
                    i10 = 0;
                } else {
                    i10 = 2;
                }
                quVar.x(i10);
            }
            quVar.v();
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
