package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
public final class o50 implements View.OnKeyListener {
    public final int f40141a;
    public boolean f40142b;
    public final org.telegram.ui.ActionBar.k2 f40143c;

    public o50(int i10, org.telegram.ui.ActionBar.k2 k2Var) {
        this.f40141a = i10;
        this.f40143c = k2Var;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        int i11 = this.f40141a;
        org.telegram.ui.ActionBar.k2 k2Var = this.f40143c;
        boolean z10 = true;
        switch (i11) {
            case 0:
                v50 v50Var = (v50) k2Var;
                if (i10 == 67) {
                    if (keyEvent.getAction() == 0) {
                        if (v50Var.f42613f.f26588r.length() != 0) {
                            z10 = false;
                        }
                        this.f40142b = z10;
                    } else if (keyEvent.getAction() == 1 && this.f40142b && !v50Var.f42606a0.isEmpty()) {
                        v50Var.h.c((org.telegram.ui.Components.s20) i0.a.g(1, v50Var.f42606a0));
                        v50Var.w0();
                        v50Var.o0();
                        return true;
                    }
                }
                return false;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) k2Var;
                ArrayList arrayList = usersSelectActivity.O;
                if (i10 == 67) {
                    if (keyEvent.getAction() == 0) {
                        if (usersSelectActivity.f34148c.length() != 0) {
                            z10 = false;
                        }
                        this.f40142b = z10;
                    } else if (keyEvent.getAction() == 1 && this.f40142b && !arrayList.isEmpty()) {
                        org.telegram.ui.Components.s20 s20Var = (org.telegram.ui.Components.s20) i0.a.g(1, arrayList);
                        usersSelectActivity.f34147b.b(s20Var);
                        if (usersSelectActivity.f34155y == 2) {
                            if (s20Var.getUid() == -9223372036854775800L) {
                                usersSelectActivity.J &= -2;
                            } else if (s20Var.getUid() == -9223372036854775799L) {
                                usersSelectActivity.J &= -3;
                            } else if (s20Var.getUid() == Long.MIN_VALUE) {
                                usersSelectActivity.J &= -5;
                            } else if (s20Var.getUid() == -9223372036854775807L) {
                                usersSelectActivity.J &= -9;
                            }
                        } else if (s20Var.getUid() == Long.MIN_VALUE) {
                            int i12 = org.telegram.messenger.vp.D8;
                            usersSelectActivity.J &= -2;
                        } else if (s20Var.getUid() == -9223372036854775807L) {
                            int i13 = org.telegram.messenger.vp.D8;
                            usersSelectActivity.J &= -3;
                        } else if (s20Var.getUid() == -9223372036854775806L) {
                            int i14 = org.telegram.messenger.vp.D8;
                            usersSelectActivity.J &= -5;
                        } else if (s20Var.getUid() == -9223372036854775805L) {
                            int i15 = org.telegram.messenger.vp.D8;
                            usersSelectActivity.J &= -9;
                        } else if (s20Var.getUid() == -9223372036854775804L) {
                            int i16 = org.telegram.messenger.vp.D8;
                            usersSelectActivity.J &= -17;
                        } else if (s20Var.getUid() == -9223372036854775803L) {
                            int i17 = org.telegram.messenger.vp.D8;
                            usersSelectActivity.J &= -33;
                        } else if (s20Var.getUid() == -9223372036854775802L) {
                            int i18 = org.telegram.messenger.vp.D8;
                            usersSelectActivity.J &= -65;
                        } else if (s20Var.getUid() == -9223372036854775801L) {
                            int i19 = org.telegram.messenger.vp.D8;
                            usersSelectActivity.J &= -129;
                        }
                        usersSelectActivity.c0();
                        usersSelectActivity.a0();
                        return true;
                    }
                }
                return false;
        }
    }
}
