package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class ib1 extends org.telegram.ui.Components.aj0 {
    public final Context f48009c;
    public final jg.z1 f48011f;
    public Runnable h;
    public boolean f48012n;
    public final int f48014s;
    public final UsersSelectActivity f48015w;
    public ArrayList d = new ArrayList();
    public ArrayList f48010e = new ArrayList();
    public final ArrayList f48013r = new ArrayList();

    public ib1(UsersSelectActivity usersSelectActivity, Context context) {
        boolean z10;
        boolean z11;
        this.f48015w = usersSelectActivity;
        this.f48009c = context;
        if (usersSelectActivity.G) {
            this.f48014s = 0;
        } else {
            int i7 = usersSelectActivity.f43458y;
            if (i7 == 2) {
                this.f48014s = (!usersSelectActivity.J ? 1 : 0) + 5;
            } else if (i7 == 0) {
                if (usersSelectActivity.K) {
                    this.f48014s = 7;
                } else {
                    this.f48014s = 5;
                }
            } else {
                this.f48014s = 0;
            }
        }
        int i10 = usersSelectActivity.f43458y;
        if (i10 == 2 && !usersSelectActivity.I) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (i10 != 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        ArrayList arrayList = usersSelectActivity.getMessagesController().f25443y;
        int size = arrayList.size();
        int i11 = 0;
        boolean z12 = false;
        while (i11 < size) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i11);
            if (!org.telegram.messenger.m5.C(dialog.f28055id)) {
                if (org.telegram.messenger.m5.E(dialog.f28055id)) {
                    TLRPC.User a22 = usersSelectActivity.getMessagesController().a2(Long.valueOf(dialog.f28055id));
                    if (a22 != null && ((usersSelectActivity.H || !org.telegram.messenger.q10.B(a22)) && (!a22.bot || z10))) {
                        this.f48013r.add(a22);
                        if (org.telegram.messenger.q10.B(a22)) {
                            z12 = true;
                        }
                    }
                } else {
                    TLRPC.Chat M0 = usersSelectActivity.getMessagesController().M0(Long.valueOf(-dialog.f28055id));
                    if (z11 && M0 != null) {
                        this.f48013r.add(M0);
                    }
                }
            }
            i11++;
            z12 = z12;
        }
        if (!z12 && usersSelectActivity.H) {
            this.f48013r.add(0, usersSelectActivity.getMessagesController().a2(Long.valueOf(usersSelectActivity.getUserConfig().f24959n)));
        }
        jg.z1 z1Var = new jg.z1(false);
        this.f48011f = z1Var;
        z1Var.f17357p = false;
        z1Var.f17344a = new ni0(this, 23);
    }

    @Override
    public final void A(v4.e1 e1Var) {
        View view = e1Var.f58535a;
        if (view instanceof org.telegram.ui.Cells.h4) {
            ((org.telegram.ui.Cells.h4) view).f30385a.getImageReceiver().c();
        }
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        if (e1Var.f58539f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final String F(int i7) {
        return null;
    }

    @Override
    public final void G(org.telegram.ui.Components.uj0 uj0Var, float f10, int[] iArr) {
        iArr[0] = (int) (b() * f10);
        iArr[1] = 0;
    }

    public final void L(String str) {
        boolean z10;
        boolean z11;
        if (this.h != null) {
            Utilities.f22418g.a(this.h);
            this.h = null;
        }
        UsersSelectActivity usersSelectActivity = this.f48015w;
        int i7 = usersSelectActivity.f43458y;
        if (i7 == 2 && !usersSelectActivity.I) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (i7 != 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (str == null) {
            this.d.clear();
            this.f48010e.clear();
            this.f48011f.f(null, null);
            this.f48011f.g(null, true, false, false, false, 0L, false, 0, 0);
            f();
            return;
        }
        org.telegram.messenger.p5 p5Var = Utilities.f22418g;
        hb1 hb1Var = new hb1(this, str, z11, z10, 0);
        this.h = hb1Var;
        p5Var.d(hb1Var, 300L);
    }

    @Override
    public final int b() {
        if (this.f48012n) {
            int size = this.d.size();
            jg.z1 z1Var = this.f48011f;
            return z1Var.f17347e.size() + z1Var.d.size() + size;
        }
        UsersSelectActivity usersSelectActivity = this.f48015w;
        int i7 = 0;
        if (!usersSelectActivity.G) {
            int i10 = usersSelectActivity.f43458y;
            if (i10 == 2) {
                i7 = (!usersSelectActivity.J ? 1 : 0) + 3;
            } else if (i10 == 0) {
                i7 = usersSelectActivity.K ? 7 : 5;
            }
        }
        return this.f48013r.size() + i7;
    }

    @Override
    public final int d(int i7) {
        int i10;
        if (!this.f48012n) {
            UsersSelectActivity usersSelectActivity = this.f48015w;
            if (!usersSelectActivity.G ? !((i10 = usersSelectActivity.f43458y) != 2 ? i10 != 0 || (!usersSelectActivity.K ? !(i7 == 0 || i7 == 4) : !(i7 == 0 || i7 == 6)) : i7 != 0 && i7 != (!usersSelectActivity.J ? 1 : 0) + 4) : i7 == 0) {
                return 2;
            }
        }
        return 1;
    }

    @Override
    public final void t(v4.e1 r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ib1.t(v4.e1, int):void");
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View h4Var;
        Context context = this.f48009c;
        if (i7 != 1) {
            h4Var = new org.telegram.ui.Cells.x3(context, null);
        } else {
            h4Var = new org.telegram.ui.Cells.h4(context, 1, 0, true);
        }
        return new v4.e1(h4Var);
    }
}
