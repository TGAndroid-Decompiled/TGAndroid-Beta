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
public final class ju extends gu {
    public Drawable f27798c;
    public final int d;
    public final ou e;

    public ju(ou ouVar, Context context, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        super(context, g6Var);
        this.e = ouVar;
        this.d = i10;
        this.f27798c = null;
    }

    @Override
    public final int emojiCacheType() {
        return this.e.h();
    }

    @Override
    public final void extendActionMode(ActionMode actionMode, Menu menu) {
        boolean z10;
        ou ouVar = this.e;
        if (ouVar.a()) {
            if (ouVar.L == 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.sn.n8(menu, null, z10, true, true, true);
            return;
        }
        ouVar.i(actionMode, menu);
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
        ou ouVar = this.e;
        qm0 qm0Var = ouVar.f29383c;
        if (qm0Var != null) {
            boolean z11 = false;
            if (i11 != i10) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (ouVar.a() && z10) {
                XiaomiUtilities.isMIUI();
                z11 = true;
            }
            if (ouVar.f29385n != z11) {
                ouVar.f29385n = z11;
                if (z11) {
                    this.f27798c = qm0Var.d;
                    qm0Var.a(R.drawable.msg_edit, true);
                    return;
                }
                qm0Var.b(this.f27798c, true);
                this.f27798c = null;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        ku kuVar;
        ou ouVar = this.e;
        if (ouVar.e && motionEvent.getAction() == 0) {
            ouVar.u();
            if (ouVar.f29389x && (kuVar = ouVar.d) != null) {
                kuVar.u(false);
                ouVar.f29389x = false;
                ouVar.k(true);
                AndroidUtilities.showKeyboard(this);
            } else {
                if (AndroidUtilities.usingHardwareInput) {
                    i10 = 0;
                } else {
                    i10 = 2;
                }
                ouVar.x(i10);
            }
            ouVar.v();
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
