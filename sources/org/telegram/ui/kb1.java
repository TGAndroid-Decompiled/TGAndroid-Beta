package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class kb1 extends org.telegram.ui.Components.vi0 {
    public final Context f47159c;
    public final jg.z1 f47161f;
    public Runnable h;
    public boolean f47162n;
    public final int f47164s;
    public final UsersSelectActivity f47165w;
    public ArrayList d = new ArrayList();
    public ArrayList f47160e = new ArrayList();
    public final ArrayList f47163r = new ArrayList();

    public kb1(UsersSelectActivity usersSelectActivity, Context context) {
        boolean z9;
        boolean z10;
        this.f47165w = usersSelectActivity;
        this.f47159c = context;
        if (usersSelectActivity.F) {
            this.f47164s = 0;
        } else {
            int i7 = usersSelectActivity.f42084y;
            if (i7 == 2) {
                this.f47164s = (!usersSelectActivity.I ? 1 : 0) + 5;
            } else if (i7 == 0) {
                if (usersSelectActivity.J) {
                    this.f47164s = 7;
                } else {
                    this.f47164s = 5;
                }
            } else {
                this.f47164s = 0;
            }
        }
        int i10 = usersSelectActivity.f42084y;
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
        ArrayList arrayList = usersSelectActivity.getMessagesController().f24944y;
        int size = arrayList.size();
        int i11 = 0;
        boolean z11 = false;
        while (i11 < size) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i11);
            if (!org.telegram.messenger.m5.C(dialog.f26960id)) {
                if (org.telegram.messenger.m5.E(dialog.f26960id)) {
                    TLRPC.User a22 = usersSelectActivity.getMessagesController().a2(Long.valueOf(dialog.f26960id));
                    if (a22 != null && ((usersSelectActivity.G || !org.telegram.messenger.t10.B(a22)) && (!a22.bot || z9))) {
                        this.f47163r.add(a22);
                        if (org.telegram.messenger.t10.B(a22)) {
                            z11 = true;
                        }
                    }
                } else {
                    TLRPC.Chat M0 = usersSelectActivity.getMessagesController().M0(Long.valueOf(-dialog.f26960id));
                    if (z10 && M0 != null) {
                        this.f47163r.add(M0);
                    }
                }
            }
            i11++;
            z11 = z11;
        }
        if (!z11 && usersSelectActivity.G) {
            this.f47163r.add(0, usersSelectActivity.getMessagesController().a2(Long.valueOf(usersSelectActivity.getUserConfig().f24489n)));
        }
        jg.z1 z1Var = new jg.z1(false);
        this.f47161f = z1Var;
        z1Var.f17005p = false;
        z1Var.f16992a = new li0(this, 23);
    }

    @Override
    public final void A(v4.d1 d1Var) {
        View view = d1Var.f57043a;
        if (view instanceof org.telegram.ui.Cells.h4) {
            ((org.telegram.ui.Cells.h4) view).f29262a.getImageReceiver().c();
        }
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        if (d1Var.f57047f == 1) {
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
            Utilities.f21338g.a(this.h);
            this.h = null;
        }
        UsersSelectActivity usersSelectActivity = this.f47165w;
        int i7 = usersSelectActivity.f42084y;
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
            this.f47160e.clear();
            this.f47161f.f(null, null);
            this.f47161f.g(null, true, false, false, false, 0L, false, 0, 0);
            f();
            return;
        }
        org.telegram.messenger.p5 p5Var = Utilities.f21338g;
        jb1 jb1Var = new jb1(this, str, z10, z9, 0);
        this.h = jb1Var;
        p5Var.d(jb1Var, 300L);
    }

    @Override
    public final int b() {
        if (this.f47162n) {
            int size = this.d.size();
            jg.z1 z1Var = this.f47161f;
            return z1Var.f16995e.size() + z1Var.d.size() + size;
        }
        UsersSelectActivity usersSelectActivity = this.f47165w;
        int i7 = 0;
        if (!usersSelectActivity.F) {
            int i10 = usersSelectActivity.f42084y;
            if (i10 == 2) {
                i7 = (!usersSelectActivity.I ? 1 : 0) + 3;
            } else if (i10 == 0) {
                i7 = usersSelectActivity.J ? 7 : 5;
            }
        }
        return this.f47163r.size() + i7;
    }

    @Override
    public final int d(int i7) {
        int i10;
        if (!this.f47162n) {
            UsersSelectActivity usersSelectActivity = this.f47165w;
            if (!usersSelectActivity.F ? !((i10 = usersSelectActivity.f42084y) != 2 ? i10 != 0 || (!usersSelectActivity.J ? !(i7 == 0 || i7 == 4) : !(i7 == 0 || i7 == 6)) : i7 != 0 && i7 != (!usersSelectActivity.I ? 1 : 0) + 4) : i7 == 0) {
                return 2;
            }
        }
        return 1;
    }

    @Override
    public final void t(v4.d1 r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kb1.t(v4.d1, int):void");
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View h4Var;
        Context context = this.f47159c;
        if (i7 != 1) {
            h4Var = new org.telegram.ui.Cells.x3(context, null);
        } else {
            h4Var = new org.telegram.ui.Cells.h4(context, 1, 0, true);
        }
        return new v4.d1(h4Var);
    }
}
