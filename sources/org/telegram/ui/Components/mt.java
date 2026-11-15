package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;
public final class mt extends ft {
    public Drawable f37373e2;
    public final int f37374f2;
    public final rt f37375g2;

    public mt(rt rtVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i7) {
        super(context, e6Var);
        this.f37375g2 = rtVar;
        this.f37374f2 = i7;
        this.f37373e2 = null;
    }

    @Override
    public final void G(int i7, int i10) {
        this.f37375g2.q(i7, i10);
    }

    @Override
    public final int e() {
        return this.f37375g2.h();
    }

    @Override
    public final int getActionModeStyle() {
        int i7 = this.f37374f2;
        if (i7 == 2 || i7 == 3) {
            return 2;
        }
        return super.getActionModeStyle();
    }

    @Override
    public final void o(ActionMode actionMode, Menu menu) {
        boolean z10;
        rt rtVar = this.f37375g2;
        if (rtVar.a()) {
            if (rtVar.M == 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.an.C8(menu, null, z10, true, true, true);
            return;
        }
        rtVar.i(actionMode, menu);
    }

    @Override
    public final void onSelectionChanged(int i7, int i10) {
        boolean z10;
        super.onSelectionChanged(i7, i10);
        rt rtVar = this.f37375g2;
        ck0 ck0Var = rtVar.f39058c;
        if (ck0Var != null) {
            boolean z11 = false;
            if (i10 != i7) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (rtVar.a() && z10) {
                org.telegram.messenger.b6.i();
                z11 = true;
            }
            if (rtVar.f39061n != z11) {
                rtVar.f39061n = z11;
                if (z11) {
                    this.f37373e2 = ck0Var.d;
                    ck0Var.a(2131232117, true);
                    return;
                }
                ck0Var.b(this.f37373e2, true);
                this.f37373e2 = null;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i7;
        nt ntVar;
        rt rtVar = this.f37375g2;
        if (rtVar.f39059e && motionEvent.getAction() == 0) {
            rtVar.u();
            if (rtVar.f39066y && (ntVar = rtVar.d) != null) {
                ntVar.t(false);
                rtVar.f39066y = false;
                rtVar.k(true);
                org.telegram.messenger.g0.J3(this);
            } else {
                if (org.telegram.messenger.g0.D) {
                    i7 = 0;
                } else {
                    i7 = 2;
                }
                rtVar.x(i7);
            }
            rtVar.v();
        }
        if (motionEvent.getAction() == 0) {
            boolean isFocused = isFocused();
            requestFocus();
            if (!org.telegram.messenger.g0.J3(this)) {
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
        if (this.f37375g2.t(i10)) {
            super.scrollTo(i7, i10);
        }
    }
}
