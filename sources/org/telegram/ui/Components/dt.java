package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;
public final class dt extends xs {
    public Drawable Z1;
    public final int f33190a2;
    public final jt f33191b2;

    public dt(jt jtVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i3) {
        super(context, e6Var);
        this.f33191b2 = jtVar;
        this.f33190a2 = i3;
        this.Z1 = null;
    }

    @Override
    public final void F(int i3, int i10) {
        this.f33191b2.q(i3, i10);
    }

    @Override
    public final int e() {
        return this.f33191b2.h();
    }

    @Override
    public final int getActionModeStyle() {
        int i3 = this.f33190a2;
        if (i3 == 2 || i3 == 3) {
            return 2;
        }
        return super.getActionModeStyle();
    }

    @Override
    public final void o(ActionMode actionMode, Menu menu) {
        boolean z10;
        jt jtVar = this.f33191b2;
        if (jtVar.a()) {
            if (jtVar.M == 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.wm.A8(menu, null, z10, true, true, true);
            return;
        }
        jtVar.i(actionMode, menu);
    }

    @Override
    public final void onSelectionChanged(int i3, int i10) {
        boolean z10;
        super.onSelectionChanged(i3, i10);
        jt jtVar = this.f33191b2;
        bk0 bk0Var = jtVar.f35190c;
        if (bk0Var != null) {
            boolean z11 = false;
            if (i10 != i3) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (jtVar.a() && z10) {
                org.telegram.messenger.sr.i();
                z11 = true;
            }
            if (jtVar.f35193n != z11) {
                jtVar.f35193n = z11;
                if (z11) {
                    this.Z1 = bk0Var.d;
                    bk0Var.a(2131232116, true);
                    return;
                }
                bk0Var.b(this.Z1, true);
                this.Z1 = null;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i3;
        et etVar;
        jt jtVar = this.f33191b2;
        if (jtVar.f35191e && motionEvent.getAction() == 0) {
            jtVar.u();
            if (jtVar.f35198y && (etVar = jtVar.d) != null) {
                etVar.t(false);
                jtVar.f35198y = false;
                jtVar.k(true);
                org.telegram.messenger.g0.K3(this);
            } else {
                if (org.telegram.messenger.g0.D) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                jtVar.x(i3);
            }
            jtVar.v();
        }
        if (motionEvent.getAction() == 0) {
            boolean isFocused = isFocused();
            requestFocus();
            if (!org.telegram.messenger.g0.K3(this)) {
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
    public final void scrollTo(int i3, int i10) {
        if (this.f33191b2.t(i10)) {
            super.scrollTo(i3, i10);
        }
    }
}
