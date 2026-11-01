package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class dd1 extends org.telegram.ui.Components.bk0 {
    public final Context f36571c;
    public final zf.m1 f36572f;
    public Runnable h;
    public boolean f36573n;
    public final int f36575s;
    public final UsersSelectActivity f36576w;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public final ArrayList f36574r = new ArrayList();

    public dd1(UsersSelectActivity usersSelectActivity, Context context) {
        boolean z10;
        boolean z11;
        this.f36576w = usersSelectActivity;
        this.f36571c = context;
        if (usersSelectActivity.F) {
            this.f36575s = 0;
        } else {
            int i10 = usersSelectActivity.f34162y;
            if (i10 == 2) {
                this.f36575s = (!usersSelectActivity.H ? 1 : 0) + 5;
            } else if (i10 == 0) {
                if (usersSelectActivity.I) {
                    this.f36575s = 7;
                } else {
                    this.f36575s = 5;
                }
            } else {
                this.f36575s = 0;
            }
        }
        int i11 = usersSelectActivity.f34162y;
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
        ArrayList arrayList = usersSelectActivity.getMessagesController().f19293y;
        int size = arrayList.size();
        int i12 = 0;
        boolean z12 = false;
        while (i12 < size) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i12);
            if (!org.telegram.messenger.o5.C(dialog.f19798id)) {
                if (org.telegram.messenger.o5.E(dialog.f19798id)) {
                    TLRPC.User Z1 = usersSelectActivity.getMessagesController().Z1(Long.valueOf(dialog.f19798id));
                    if (Z1 != null && ((usersSelectActivity.G || !org.telegram.messenger.i20.B(Z1)) && (!Z1.bot || z10))) {
                        this.f36574r.add(Z1);
                        if (org.telegram.messenger.i20.B(Z1)) {
                            z12 = true;
                        }
                    }
                } else {
                    TLRPC.Chat L0 = usersSelectActivity.getMessagesController().L0(Long.valueOf(-dialog.f19798id));
                    if (z11 && L0 != null) {
                        this.f36574r.add(L0);
                    }
                }
            }
            i12++;
            z12 = z12;
        }
        if (!z12 && usersSelectActivity.G) {
            this.f36574r.add(0, usersSelectActivity.getMessagesController().Z1(Long.valueOf(usersSelectActivity.getUserConfig().f15524n)));
        }
        zf.m1 m1Var = new zf.m1(false);
        this.f36572f = m1Var;
        m1Var.f55605p = false;
        m1Var.f55593a = new rj0(this, 24);
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f47909a;
        if (view instanceof org.telegram.ui.Cells.j4) {
            ((org.telegram.ui.Cells.j4) view).f22075a.getImageReceiver().c();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f47912f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(org.telegram.ui.Components.uk0 uk0Var, float f7, int[] iArr) {
        iArr[0] = (int) (b() * f7);
        iArr[1] = 0;
    }

    public final void L(String str) {
        boolean z10;
        boolean z11;
        if (this.h != null) {
            Utilities.f14523g.a(this.h);
            this.h = null;
        }
        int i10 = this.f36576w.f34162y;
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
            this.f36572f.f(null, null);
            this.f36572f.g(null, true, false, false, false, 0L, false, 0, 0);
            f();
            return;
        }
        org.telegram.messenger.r5 r5Var = Utilities.f14523g;
        cd1 cd1Var = new cd1(this, str, z11, z10, 0);
        this.h = cd1Var;
        r5Var.d(cd1Var, 300L);
    }

    @Override
    public final int b() {
        if (this.f36573n) {
            int size = this.d.size();
            zf.m1 m1Var = this.f36572f;
            return m1Var.e.size() + m1Var.d.size() + size;
        }
        UsersSelectActivity usersSelectActivity = this.f36576w;
        int i10 = 0;
        if (!usersSelectActivity.F) {
            int i11 = usersSelectActivity.f34162y;
            if (i11 == 2) {
                i10 = (!usersSelectActivity.H ? 1 : 0) + 3;
            } else if (i11 == 0) {
                i10 = usersSelectActivity.I ? 7 : 5;
            }
        }
        return this.f36574r.size() + i10;
    }

    @Override
    public final int d(int i10) {
        int i11;
        if (!this.f36573n) {
            UsersSelectActivity usersSelectActivity = this.f36576w;
            if (!usersSelectActivity.F ? !((i11 = usersSelectActivity.f34162y) != 2 ? i11 != 0 || (!usersSelectActivity.I ? !(i10 == 0 || i10 == 4) : !(i10 == 0 || i10 == 6)) : i10 != 0 && i10 != (!usersSelectActivity.H ? 1 : 0) + 4) : i10 == 0) {
                return 2;
            }
        }
        return 1;
    }

    @Override
    public final void t(s4.c1 r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dd1.t(s4.c1, int):void");
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View j4Var;
        Context context = this.f36571c;
        if (i10 != 1) {
            j4Var = new org.telegram.ui.Cells.z3(context, null);
        } else {
            j4Var = new org.telegram.ui.Cells.j4(context, 1, 0, true);
        }
        return new s4.c1(j4Var);
    }
}
