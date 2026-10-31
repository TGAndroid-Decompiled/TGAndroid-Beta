package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class fd1 extends org.telegram.ui.Components.ak0 {
    public final Context f37234c;
    public final zf.m1 f37235f;
    public Runnable h;
    public boolean f37236n;
    public final int f37238s;
    public final UsersSelectActivity f37239w;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public final ArrayList f37237r = new ArrayList();

    public fd1(UsersSelectActivity usersSelectActivity, Context context) {
        boolean z10;
        boolean z11;
        this.f37239w = usersSelectActivity;
        this.f37234c = context;
        if (usersSelectActivity.F) {
            this.f37238s = 0;
        } else {
            int i10 = usersSelectActivity.f34155y;
            if (i10 == 2) {
                this.f37238s = (!usersSelectActivity.H ? 1 : 0) + 5;
            } else if (i10 == 0) {
                if (usersSelectActivity.I) {
                    this.f37238s = 7;
                } else {
                    this.f37238s = 5;
                }
            } else {
                this.f37238s = 0;
            }
        }
        int i11 = usersSelectActivity.f34155y;
        if (i11 != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i11 != 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        ArrayList arrayList = usersSelectActivity.getMessagesController().f18950y;
        int size = arrayList.size();
        int i12 = 0;
        boolean z12 = false;
        while (i12 < size) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i12);
            if (!org.telegram.messenger.o5.C(dialog.f19797id)) {
                if (org.telegram.messenger.o5.E(dialog.f19797id)) {
                    TLRPC.User Z1 = usersSelectActivity.getMessagesController().Z1(Long.valueOf(dialog.f19797id));
                    if (Z1 != null && ((usersSelectActivity.G || !org.telegram.messenger.h20.B(Z1)) && (!Z1.bot || z10))) {
                        this.f37237r.add(Z1);
                        if (org.telegram.messenger.h20.B(Z1)) {
                            z12 = true;
                        }
                    }
                } else {
                    TLRPC.Chat L0 = usersSelectActivity.getMessagesController().L0(Long.valueOf(-dialog.f19797id));
                    if (z11 && L0 != null) {
                        this.f37237r.add(L0);
                    }
                }
            }
            i12++;
            z12 = z12;
        }
        if (!z12 && usersSelectActivity.G) {
            this.f37237r.add(0, usersSelectActivity.getMessagesController().Z1(Long.valueOf(usersSelectActivity.getUserConfig().f15165n)));
        }
        zf.m1 m1Var = new zf.m1(false);
        this.f37235f = m1Var;
        m1Var.f55587p = false;
        m1Var.f55575a = new tj0(this, 24);
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f47898a;
        if (view instanceof org.telegram.ui.Cells.j4) {
            ((org.telegram.ui.Cells.j4) view).f22074a.getImageReceiver().c();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f47901f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(org.telegram.ui.Components.tk0 tk0Var, float f7, int[] iArr) {
        iArr[0] = (int) (b() * f7);
        iArr[1] = 0;
    }

    public final void L(String str) {
        boolean z10;
        boolean z11;
        if (this.h != null) {
            Utilities.f14522g.a(this.h);
            this.h = null;
        }
        int i10 = this.f37239w.f34155y;
        if (i10 != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 != 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (str == null) {
            this.d.clear();
            this.e.clear();
            this.f37235f.f(null, null);
            this.f37235f.g(null, true, false, false, false, 0L, false, 0, 0);
            f();
            return;
        }
        org.telegram.messenger.r5 r5Var = Utilities.f14522g;
        ed1 ed1Var = new ed1(this, str, z11, z10, 0);
        this.h = ed1Var;
        r5Var.d(ed1Var, 300L);
    }

    @Override
    public final int b() {
        if (this.f37236n) {
            int size = this.d.size();
            zf.m1 m1Var = this.f37235f;
            return m1Var.e.size() + m1Var.d.size() + size;
        }
        UsersSelectActivity usersSelectActivity = this.f37239w;
        int i10 = 0;
        if (!usersSelectActivity.F) {
            int i11 = usersSelectActivity.f34155y;
            if (i11 == 2) {
                i10 = (!usersSelectActivity.H ? 1 : 0) + 3;
            } else if (i11 == 0) {
                i10 = usersSelectActivity.I ? 7 : 5;
            }
        }
        return this.f37237r.size() + i10;
    }

    @Override
    public final int d(int i10) {
        int i11;
        if (!this.f37236n) {
            UsersSelectActivity usersSelectActivity = this.f37239w;
            if (!usersSelectActivity.F ? !((i11 = usersSelectActivity.f34155y) != 2 ? i11 != 0 || (!usersSelectActivity.I ? !(i10 == 0 || i10 == 4) : !(i10 == 0 || i10 == 6)) : i10 != 0 && i10 != (!usersSelectActivity.H ? 1 : 0) + 4) : i10 == 0) {
                return 2;
            }
        }
        return 1;
    }

    @Override
    public final void t(s4.c1 r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fd1.t(s4.c1, int):void");
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View j4Var;
        Context context = this.f37234c;
        if (i10 != 1) {
            j4Var = new org.telegram.ui.Cells.z3(context, null);
        } else {
            j4Var = new org.telegram.ui.Cells.j4(context, 1, 0, true);
        }
        return new s4.c1(j4Var);
    }
}
