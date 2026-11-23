package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;
public final class tt extends ot {
    public Drawable f40034e2;
    public final int f40035f2;
    public final yt f40036g2;

    public tt(yt ytVar, Context context, org.telegram.ui.ActionBar.h6 h6Var, int i7) {
        super(context, h6Var);
        this.f40036g2 = ytVar;
        this.f40035f2 = i7;
        this.f40034e2 = null;
    }

    @Override
    public final void G(int i7, int i10) {
        this.f40036g2.q(i7, i10);
    }

    @Override
    public final int e() {
        return this.f40036g2.h();
    }

    @Override
    public final int getActionModeStyle() {
        int i7 = this.f40035f2;
        if (i7 == 2 || i7 == 3) {
            return 2;
        }
        return super.getActionModeStyle();
    }

    @Override
    public final void o(ActionMode actionMode, Menu menu) {
        boolean z10;
        yt ytVar = this.f40036g2;
        if (ytVar.a()) {
            if (ytVar.M == 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.bn.C8(menu, null, z10, true, true, true);
            return;
        }
        ytVar.i(actionMode, menu);
    }

    @Override
    public final void onSelectionChanged(int i7, int i10) {
        boolean z10;
        super.onSelectionChanged(i7, i10);
        yt ytVar = this.f40036g2;
        mk0 mk0Var = ytVar.f42536c;
        if (mk0Var != null) {
            boolean z11 = false;
            if (i10 != i7) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (ytVar.a() && z10) {
                org.telegram.messenger.c6.i();
                z11 = true;
            }
            if (ytVar.f42539n != z11) {
                ytVar.f42539n = z11;
                if (z11) {
                    this.f40034e2 = mk0Var.d;
                    mk0Var.a(2131232118, true);
                    return;
                }
                mk0Var.b(this.f40034e2, true);
                this.f40034e2 = null;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i7;
        ut utVar;
        yt ytVar = this.f40036g2;
        if (ytVar.f42537e && motionEvent.getAction() == 0) {
            ytVar.u();
            if (ytVar.f42544y && (utVar = ytVar.d) != null) {
                utVar.t(false);
                ytVar.f42544y = false;
                ytVar.k(true);
                org.telegram.messenger.g0.I3(this);
            } else {
                if (org.telegram.messenger.g0.D) {
                    i7 = 0;
                } else {
                    i7 = 2;
                }
                ytVar.x(i7);
            }
            ytVar.v();
        }
        if (motionEvent.getAction() == 0) {
            boolean isFocused = isFocused();
            requestFocus();
            if (!org.telegram.messenger.g0.I3(this)) {
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
            org.telegram.messenger.a8.g(e10, true);
            return false;
        }
    }

    @Override
    public final void scrollTo(int i7, int i10) {
        if (this.f40036g2.t(i10)) {
            super.scrollTo(i7, i10);
        }
    }
}
