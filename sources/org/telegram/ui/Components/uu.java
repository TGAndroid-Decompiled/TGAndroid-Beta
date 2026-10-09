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
public final class uu extends ru {
    public Drawable f31617c;
    public final int d;
    public final zu f31618e;

    public uu(zu zuVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        super(context, e6Var);
        this.f31618e = zuVar;
        this.d = i10;
        this.f31617c = null;
    }

    @Override
    public final int emojiCacheType() {
        return this.f31618e.h();
    }

    @Override
    public final void extendActionMode(ActionMode actionMode, Menu menu) {
        boolean z10;
        zu zuVar = this.f31618e;
        if (zuVar.a()) {
            if (zuVar.L == 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.zn.n8(menu, null, z10, true, true, true);
            return;
        }
        zuVar.i(menu);
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
        this.f31618e.q(i10, i11);
    }

    @Override
    public final void onSelectionChanged(int i10, int i11) {
        boolean z10;
        super.onSelectionChanged(i10, i11);
        zu zuVar = this.f31618e;
        vm0 vm0Var = zuVar.f33651c;
        if (vm0Var != null) {
            boolean z11 = false;
            if (i11 != i10) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (zuVar.a() && z10) {
                XiaomiUtilities.isMIUI();
                z11 = true;
            }
            if (zuVar.f33654n != z11) {
                zuVar.f33654n = z11;
                if (z11) {
                    this.f31617c = vm0Var.d;
                    vm0Var.a(R.drawable.msg_edit, true);
                    return;
                }
                vm0Var.b(this.f31617c, true);
                this.f31617c = null;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        vu vuVar;
        zu zuVar = this.f31618e;
        if (zuVar.f33652e && motionEvent.getAction() == 0) {
            zuVar.u();
            if (zuVar.f33658x && (vuVar = zuVar.d) != null) {
                vuVar.u(false);
                zuVar.f33658x = false;
                zuVar.k(true);
                AndroidUtilities.showKeyboard(this);
            } else {
                if (AndroidUtilities.usingHardwareInput) {
                    i10 = 0;
                } else {
                    i10 = 2;
                }
                zuVar.x(i10);
            }
            zuVar.v();
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
        } catch (Exception e7) {
            FileLog.e(e7);
            return false;
        }
    }

    @Override
    public final void scrollTo(int i10, int i11) {
        if (this.f31618e.t(i11)) {
            super.scrollTo(i10, i11);
        }
    }
}
