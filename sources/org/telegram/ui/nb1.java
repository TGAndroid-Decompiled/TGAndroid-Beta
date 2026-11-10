package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class nb1 extends org.telegram.ui.Components.vi0 {
    public final Context f48176c;
    public final jg.z1 f48178f;
    public Runnable h;
    public boolean f48179n;
    public final int f48181s;
    public final UsersSelectActivity f48182w;
    public ArrayList d = new ArrayList();
    public ArrayList f48177e = new ArrayList();
    public final ArrayList f48180r = new ArrayList();

    public nb1(UsersSelectActivity usersSelectActivity, Context context) {
        boolean z9;
        boolean z10;
        this.f48182w = usersSelectActivity;
        this.f48176c = context;
        if (usersSelectActivity.F) {
            this.f48181s = 0;
        } else {
            int i7 = usersSelectActivity.f42082y;
            if (i7 == 2) {
                this.f48181s = (!usersSelectActivity.I ? 1 : 0) + 5;
            } else if (i7 == 0) {
                if (usersSelectActivity.J) {
                    this.f48181s = 7;
                } else {
                    this.f48181s = 5;
                }
            } else {
                this.f48181s = 0;
            }
        }
        int i10 = usersSelectActivity.f42082y;
        if (i10 == 2 && !usersSelectActivity.H) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (i10 != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        ArrayList arrayList = usersSelectActivity.getMessagesController().f24948y;
        int size = arrayList.size();
        int i11 = 0;
        boolean z11 = false;
        while (i11 < size) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i11);
            if (!org.telegram.messenger.m5.C(dialog.f26964id)) {
                if (org.telegram.messenger.m5.E(dialog.f26964id)) {
                    TLRPC.User a22 = usersSelectActivity.getMessagesController().a2(Long.valueOf(dialog.f26964id));
                    if (a22 != null && ((usersSelectActivity.G || !org.telegram.messenger.t10.B(a22)) && (!a22.bot || z9))) {
                        this.f48180r.add(a22);
                        if (org.telegram.messenger.t10.B(a22)) {
                            z11 = true;
                        }
                    }
                } else {
                    TLRPC.Chat M0 = usersSelectActivity.getMessagesController().M0(Long.valueOf(-dialog.f26964id));
                    if (z10 && M0 != null) {
                        this.f48180r.add(M0);
                    }
                }
            }
            i11++;
            z11 = z11;
        }
        if (!z11 && usersSelectActivity.G) {
            this.f48180r.add(0, usersSelectActivity.getMessagesController().a2(Long.valueOf(usersSelectActivity.getUserConfig().f24493n)));
        }
        jg.z1 z1Var = new jg.z1(false);
        this.f48178f = z1Var;
        z1Var.f17005p = false;
        z1Var.f16992a = new oi0(this, 23);
    }

    @Override
    public final void A(v4.d1 d1Var) {
        View view = d1Var.f57052a;
        if (view instanceof org.telegram.ui.Cells.h4) {
            ((org.telegram.ui.Cells.h4) view).f29277a.getImageReceiver().c();
        }
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        if (d1Var.f57056f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final String F(int i7) {
        return null;
    }

    @Override
    public final void G(org.telegram.ui.Components.pj0 pj0Var, float f10, int[] iArr) {
        iArr[0] = (int) (b() * f10);
        iArr[1] = 0;
    }

    public final void L(String str) {
        boolean z9;
        boolean z10;
        if (this.h != null) {
            Utilities.f21343g.a(this.h);
            this.h = null;
        }
        UsersSelectActivity usersSelectActivity = this.f48182w;
        int i7 = usersSelectActivity.f42082y;
        if (i7 == 2 && !usersSelectActivity.H) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (i7 != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (str == null) {
            this.d.clear();
            this.f48177e.clear();
            this.f48178f.f(null, null);
            this.f48178f.g(null, true, false, false, false, 0L, false, 0, 0);
            f();
            return;
        }
        org.telegram.messenger.p5 p5Var = Utilities.f21343g;
        mb1 mb1Var = new mb1(this, str, z10, z9, 0);
        this.h = mb1Var;
        p5Var.d(mb1Var, 300L);
    }

    @Override
    public final int b() {
        if (this.f48179n) {
            int size = this.d.size();
            jg.z1 z1Var = this.f48178f;
            return z1Var.f16995e.size() + z1Var.d.size() + size;
        }
        UsersSelectActivity usersSelectActivity = this.f48182w;
        int i7 = 0;
        if (!usersSelectActivity.F) {
            int i10 = usersSelectActivity.f42082y;
            if (i10 == 2) {
                i7 = (!usersSelectActivity.I ? 1 : 0) + 3;
            } else if (i10 == 0) {
                i7 = usersSelectActivity.J ? 7 : 5;
            }
        }
        return this.f48180r.size() + i7;
    }

    @Override
    public final int d(int i7) {
        int i10;
        if (!this.f48179n) {
            UsersSelectActivity usersSelectActivity = this.f48182w;
            if (!usersSelectActivity.F ? !((i10 = usersSelectActivity.f42082y) != 2 ? i10 != 0 || (!usersSelectActivity.J ? !(i7 == 0 || i7 == 4) : !(i7 == 0 || i7 == 6)) : i7 != 0 && i7 != (!usersSelectActivity.I ? 1 : 0) + 4) : i7 == 0) {
                return 2;
            }
        }
        return 1;
    }

    @Override
    public final void t(v4.d1 r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nb1.t(v4.d1, int):void");
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View h4Var;
        Context context = this.f48176c;
        if (i7 != 1) {
            h4Var = new org.telegram.ui.Cells.x3(context, null);
        } else {
            h4Var = new org.telegram.ui.Cells.h4(context, 1, 0, true);
        }
        return new v4.d1(h4Var);
    }
}
