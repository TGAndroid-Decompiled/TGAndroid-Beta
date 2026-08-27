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

public final class ot extends lt {

    public Drawable f31407c;
    public final int d;

    public final tt f31408e;

    public ot(tt ttVar, Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, c6Var);
        this.f31408e = ttVar;
        this.d = i10;
        this.f31407c = null;
    }

    @Override
    public final int emojiCacheType() {
        return this.f31408e.h();
    }

    @Override
    public final void extendActionMode(ActionMode actionMode, Menu menu) {
        tt ttVar = this.f31408e;
        if (ttVar.a()) {
            org.telegram.ui.rn.k8(menu, null, ttVar.H == 3, true, true, true);
        } else {
            ttVar.i(menu);
        }
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
        this.f31408e.q(i10, i11);
    }

    @Override
    public final void onSelectionChanged(int i10, int i11) {
        super.onSelectionChanged(i10, i11);
        tt ttVar = this.f31408e;
        el0 el0Var = ttVar.f32877c;
        if (el0Var != null) {
            boolean z10 = false;
            boolean z11 = i11 != i10;
            if (ttVar.a() && z11) {
                XiaomiUtilities.isMIUI();
                z10 = true;
            }
            if (ttVar.f32880n != z10) {
                ttVar.f32880n = z10;
                if (z10) {
                    this.f31407c = el0Var.d;
                    el0Var.a(R.drawable.msg_edit, true);
                } else {
                    el0Var.b(this.f31407c, true);
                    this.f31407c = null;
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        pt ptVar;
        tt ttVar = this.f31408e;
        if (ttVar.f32878e && motionEvent.getAction() == 0) {
            ttVar.u();
            if (!ttVar.f32884x || (ptVar = ttVar.d) == null) {
                ttVar.x(AndroidUtilities.usingHardwareInput ? 0 : 2);
            } else {
                ptVar.u(false);
                ttVar.f32884x = false;
                ttVar.k(true);
                AndroidUtilities.showKeyboard(this);
            }
            ttVar.v();
        }
        if (motionEvent.getAction() == 0) {
            boolean zIsFocused = isFocused();
            requestFocus();
            if (!AndroidUtilities.showKeyboard(this)) {
                clearFocus();
                requestFocus();
            }
            if (!zIsFocused) {
                setSelection(getText().length());
            }
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Exception e9) {
            FileLog.e(e9);
            return false;
        }
    }

    @Override
    public final void scrollTo(int i10, int i11) {
        if (this.f31408e.t(i11)) {
            super.scrollTo(i10, i11);
        }
    }
}
