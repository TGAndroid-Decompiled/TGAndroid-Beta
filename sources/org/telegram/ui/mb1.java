package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class mb1 extends org.telegram.ui.Components.ij0 {
    public final Context f49794c;
    public final jg.z1 f49796f;
    public Runnable h;
    public boolean f49797n;
    public final int f49799s;
    public final UsersSelectActivity f49800w;
    public ArrayList d = new ArrayList();
    public ArrayList f49795e = new ArrayList();
    public final ArrayList f49798r = new ArrayList();

    public mb1(UsersSelectActivity usersSelectActivity, Context context) {
        boolean z10;
        boolean z11;
        this.f49800w = usersSelectActivity;
        this.f49794c = context;
        if (usersSelectActivity.G) {
            this.f49799s = 0;
        } else {
            int i7 = usersSelectActivity.f43904y;
            if (i7 == 2) {
                this.f49799s = (!usersSelectActivity.J ? 1 : 0) + 5;
            } else if (i7 == 0) {
                if (usersSelectActivity.K) {
                    this.f49799s = 7;
                } else {
                    this.f49799s = 5;
                }
            } else {
                this.f49799s = 0;
            }
        }
        int i10 = usersSelectActivity.f43904y;
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
        ArrayList arrayList = usersSelectActivity.getMessagesController().f25809y;
        int size = arrayList.size();
        int i11 = 0;
        boolean z12 = false;
        while (i11 < size) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i11);
            if (!org.telegram.messenger.n5.C(dialog.f28407id)) {
                if (org.telegram.messenger.n5.E(dialog.f28407id)) {
                    TLRPC.User c22 = usersSelectActivity.getMessagesController().c2(Long.valueOf(dialog.f28407id));
                    if (c22 != null && ((usersSelectActivity.H || !org.telegram.messenger.o10.C(c22)) && (!c22.bot || z10))) {
                        this.f49798r.add(c22);
                        if (org.telegram.messenger.o10.C(c22)) {
                            z12 = true;
                        }
                    }
                } else {
                    TLRPC.Chat O0 = usersSelectActivity.getMessagesController().O0(Long.valueOf(-dialog.f28407id));
                    if (z11 && O0 != null) {
                        this.f49798r.add(O0);
                    }
                }
            }
            i11++;
            z12 = z12;
        }
        if (!z12 && usersSelectActivity.H) {
            this.f49798r.add(0, usersSelectActivity.getMessagesController().c2(Long.valueOf(usersSelectActivity.getUserConfig().f24789n)));
        }
        jg.z1 z1Var = new jg.z1(false);
        this.f49796f = z1Var;
        z1Var.f17740p = false;
        z1Var.f17727a = new qi0(this, 23);
    }

    @Override
    public final void A(v4.f1 f1Var) {
        View view = f1Var.f59123a;
        if (view instanceof org.telegram.ui.Cells.i4) {
            ((org.telegram.ui.Cells.i4) view).f30810a.getImageReceiver().c();
        }
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        if (f1Var.f59127f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final String F(int i7) {
        return null;
    }

    @Override
    public final void G(org.telegram.ui.Components.ck0 ck0Var, float f10, int[] iArr) {
        iArr[0] = (int) (b() * f10);
        iArr[1] = 0;
    }

    public final void L(String str) {
        boolean z10;
        boolean z11;
        if (this.h != null) {
            Utilities.f22781g.a(this.h);
            this.h = null;
        }
        UsersSelectActivity usersSelectActivity = this.f49800w;
        int i7 = usersSelectActivity.f43904y;
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
            this.f49795e.clear();
            this.f49796f.f(null, null);
            this.f49796f.g(null, true, false, false, false, 0L, false, 0, 0);
            f();
            return;
        }
        org.telegram.messenger.q5 q5Var = Utilities.f22781g;
        lb1 lb1Var = new lb1(this, str, z11, z10, 0);
        this.h = lb1Var;
        q5Var.d(lb1Var, 300L);
    }

    @Override
    public final int b() {
        if (this.f49797n) {
            int size = this.d.size();
            jg.z1 z1Var = this.f49796f;
            return z1Var.f17730e.size() + z1Var.d.size() + size;
        }
        UsersSelectActivity usersSelectActivity = this.f49800w;
        int i7 = 0;
        if (!usersSelectActivity.G) {
            int i10 = usersSelectActivity.f43904y;
            if (i10 == 2) {
                i7 = (!usersSelectActivity.J ? 1 : 0) + 3;
            } else if (i10 == 0) {
                i7 = usersSelectActivity.K ? 7 : 5;
            }
        }
        return this.f49798r.size() + i7;
    }

    @Override
    public final int d(int i7) {
        int i10;
        if (!this.f49797n) {
            UsersSelectActivity usersSelectActivity = this.f49800w;
            if (!usersSelectActivity.G ? !((i10 = usersSelectActivity.f43904y) != 2 ? i10 != 0 || (!usersSelectActivity.K ? !(i7 == 0 || i7 == 4) : !(i7 == 0 || i7 == 6)) : i7 != 0 && i7 != (!usersSelectActivity.J ? 1 : 0) + 4) : i7 == 0) {
                return 2;
            }
        }
        return 1;
    }

    @Override
    public final void t(v4.f1 r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mb1.t(v4.f1, int):void");
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View i4Var;
        Context context = this.f49794c;
        if (i7 != 1) {
            i4Var = new org.telegram.ui.Cells.y3(context, null);
        } else {
            i4Var = new org.telegram.ui.Cells.i4(context, 1, 0, true);
        }
        return new v4.f1(i4Var);
    }
}
