package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class cb1 extends org.telegram.ui.Components.zi0 {
    public final Context f44287c;
    public final kg.v1 f44289f;
    public Runnable h;
    public boolean f44290n;
    public final int f44292s;
    public final UsersSelectActivity f44293w;
    public ArrayList d = new ArrayList();
    public ArrayList f44288e = new ArrayList();
    public final ArrayList f44291r = new ArrayList();

    public cb1(UsersSelectActivity usersSelectActivity, Context context) {
        boolean z10;
        boolean z11;
        this.f44293w = usersSelectActivity;
        this.f44287c = context;
        if (usersSelectActivity.G) {
            this.f44292s = 0;
        } else {
            int i3 = usersSelectActivity.f42115y;
            if (i3 == 2) {
                this.f44292s = (!usersSelectActivity.J ? 1 : 0) + 5;
            } else if (i3 == 0) {
                if (usersSelectActivity.K) {
                    this.f44292s = 7;
                } else {
                    this.f44292s = 5;
                }
            } else {
                this.f44292s = 0;
            }
        }
        int i10 = usersSelectActivity.f42115y;
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
        ArrayList arrayList = usersSelectActivity.getMessagesController().f23169y;
        int size = arrayList.size();
        int i11 = 0;
        boolean z12 = false;
        while (i11 < size) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i11);
            if (!org.telegram.messenger.m5.C(dialog.f27005id)) {
                if (org.telegram.messenger.m5.E(dialog.f27005id)) {
                    TLRPC.User a22 = usersSelectActivity.getMessagesController().a2(Long.valueOf(dialog.f27005id));
                    if (a22 != null && ((usersSelectActivity.H || !org.telegram.messenger.l10.B(a22)) && (!a22.bot || z10))) {
                        this.f44291r.add(a22);
                        if (org.telegram.messenger.l10.B(a22)) {
                            z12 = true;
                        }
                    }
                } else {
                    TLRPC.Chat M0 = usersSelectActivity.getMessagesController().M0(Long.valueOf(-dialog.f27005id));
                    if (z11 && M0 != null) {
                        this.f44291r.add(M0);
                    }
                }
            }
            i11++;
            z12 = z12;
        }
        if (!z12 && usersSelectActivity.H) {
            this.f44291r.add(0, usersSelectActivity.getMessagesController().a2(Long.valueOf(usersSelectActivity.getUserConfig().f22848n)));
        }
        kg.v1 v1Var = new kg.v1(false);
        this.f44289f = v1Var;
        v1Var.f17219p = false;
        v1Var.f17206a = new ci0(this, 24);
    }

    @Override
    public final void A(u4.d1 d1Var) {
        View view = d1Var.f55540a;
        if (view instanceof org.telegram.ui.Cells.h4) {
            ((org.telegram.ui.Cells.h4) view).f29326a.getImageReceiver().c();
        }
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        if (d1Var.f55544f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final String F(int i3) {
        return null;
    }

    @Override
    public final void G(org.telegram.ui.Components.tj0 tj0Var, float f10, int[] iArr) {
        iArr[0] = (int) (b() * f10);
        iArr[1] = 0;
    }

    public final void L(String str) {
        boolean z10;
        boolean z11;
        if (this.h != null) {
            Utilities.f21389g.a(this.h);
            this.h = null;
        }
        UsersSelectActivity usersSelectActivity = this.f44293w;
        int i3 = usersSelectActivity.f42115y;
        if (i3 == 2 && !usersSelectActivity.I) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (i3 != 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (str == null) {
            this.d.clear();
            this.f44288e.clear();
            this.f44289f.f(null, null);
            this.f44289f.g(null, true, false, false, false, 0L, false, 0, 0);
            f();
            return;
        }
        org.telegram.messenger.p5 p5Var = Utilities.f21389g;
        bb1 bb1Var = new bb1(this, str, z11, z10, 0);
        this.h = bb1Var;
        p5Var.e(bb1Var, 300L);
    }

    @Override
    public final int b() {
        if (this.f44290n) {
            int size = this.d.size();
            kg.v1 v1Var = this.f44289f;
            return v1Var.f17209e.size() + v1Var.d.size() + size;
        }
        UsersSelectActivity usersSelectActivity = this.f44293w;
        int i3 = 0;
        if (!usersSelectActivity.G) {
            int i10 = usersSelectActivity.f42115y;
            if (i10 == 2) {
                i3 = (!usersSelectActivity.J ? 1 : 0) + 3;
            } else if (i10 == 0) {
                i3 = usersSelectActivity.K ? 7 : 5;
            }
        }
        return this.f44291r.size() + i3;
    }

    @Override
    public final int d(int i3) {
        int i10;
        if (!this.f44290n) {
            UsersSelectActivity usersSelectActivity = this.f44293w;
            if (!usersSelectActivity.G ? !((i10 = usersSelectActivity.f42115y) != 2 ? i10 != 0 || (!usersSelectActivity.K ? !(i3 == 0 || i3 == 4) : !(i3 == 0 || i3 == 6)) : i3 != 0 && i3 != (!usersSelectActivity.J ? 1 : 0) + 4) : i3 == 0) {
                return 2;
            }
        }
        return 1;
    }

    @Override
    public final void t(u4.d1 r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cb1.t(u4.d1, int):void");
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View h4Var;
        Context context = this.f44287c;
        if (i3 != 1) {
            h4Var = new org.telegram.ui.Cells.x3(context, null);
        } else {
            h4Var = new org.telegram.ui.Cells.h4(context, 1, 0, true);
        }
        return new u4.d1(h4Var);
    }
}
