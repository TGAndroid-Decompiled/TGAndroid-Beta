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
public final class iu extends fu {
    public Drawable f24077c;
    public final int d;
    public final nu e;

    public iu(nu nuVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, f6Var);
        this.e = nuVar;
        this.d = i10;
        this.f24077c = null;
    }

    @Override
    public final int emojiCacheType() {
        return this.e.h();
    }

    @Override
    public final void extendActionMode(ActionMode actionMode, Menu menu) {
        boolean z10;
        nu nuVar = this.e;
        if (nuVar.a()) {
            if (nuVar.L == 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.eo.k8(menu, null, z10, true, true, true);
            return;
        }
        nuVar.i(menu);
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
        nu nuVar = this.e;
        am0 am0Var = nuVar.f25597c;
        if (am0Var != null) {
            boolean z11 = false;
            if (i11 != i10) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (nuVar.a() && z10) {
                XiaomiUtilities.isMIUI();
                z11 = true;
            }
            if (nuVar.f25599n != z11) {
                nuVar.f25599n = z11;
                if (z11) {
                    this.f24077c = am0Var.d;
                    am0Var.a(R.drawable.msg_edit, true);
                    return;
                }
                am0Var.b(this.f24077c, true);
                this.f24077c = null;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        ju juVar;
        nu nuVar = this.e;
        if (nuVar.e && motionEvent.getAction() == 0) {
            nuVar.u();
            if (nuVar.f25603x && (juVar = nuVar.d) != null) {
                juVar.t(false);
                nuVar.f25603x = false;
                nuVar.k(true);
                AndroidUtilities.showKeyboard(this);
            } else {
                if (AndroidUtilities.usingHardwareInput) {
                    i10 = 0;
                } else {
                    i10 = 2;
                }
                nuVar.x(i10);
            }
            nuVar.v();
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
