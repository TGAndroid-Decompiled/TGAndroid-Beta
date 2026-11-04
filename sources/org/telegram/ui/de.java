package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.UndoView;
public final class de implements org.telegram.ui.Components.l40, org.telegram.ui.Components.o40, org.telegram.ui.ActionBar.p1, org.telegram.ui.Components.nn, org.telegram.messenger.ir, org.telegram.ui.Components.rh0, ResultCallback, pi.m, zh.c, mh.a, m40, kr, mh.b, org.telegram.ui.Components.hj0, mh.d {
    public final int f44667a;
    public final wm f44668b;

    public de(wm wmVar, int i3) {
        this.f44667a = i3;
        this.f44668b = wmVar;
    }

    @Override
    public void a() {
        wm wmVar = this.f44668b;
        if (wmVar.N3 == null && wmVar.getParentActivity() != null) {
            wmVar.f8();
            wmVar.N3.m(wmVar.f51376k6, wmVar.f51306f, 8);
        }
    }

    @Override
    public void b(TLRPC.Document document) {
        switch (this.f44667a) {
            case 4:
                wm.n0(this.f44668b, document);
                return;
            default:
                wm.v0(this.f44668b, document);
                return;
        }
    }

    @Override
    public void c(boolean z10, boolean z11) {
        wm wmVar = this.f44668b;
        wmVar.f51252b1.i(wmVar.f51569za.b(), z10, z11);
    }

    @Override
    public void d(int i3) {
        wm wmVar = this.f44668b;
        if (i3 == 1) {
            wmVar.ua();
        } else if (i3 == 2) {
            wmVar.ha();
        } else if (i3 == 3) {
            wmVar.Q4 = true;
            wmVar.getMessagesController().w1(wmVar.f51376k6, wmVar.b(), wmVar.A1, true, new pf(wmVar, 0));
        } else if (i3 == 4) {
            wmVar.Q4 = true;
            wmVar.getMessagesController().w1(wmVar.f51376k6, wmVar.b(), wmVar.B1, false, new pf(wmVar, 1));
        } else if (i3 == 6) {
            wmVar.v9(true);
        } else if (i3 == 5) {
            wmVar.v9(false);
        } else if (i3 == 0) {
            ei.x2 x2Var = wmVar.Y1;
            if (x2Var != null) {
                x2Var.w1(0, null);
            }
            wmVar.xa();
        }
    }

    @Override
    public boolean f(int i3, View view) {
        wm wmVar = this.f44668b;
        boolean z10 = false;
        if (wmVar.getParentActivity() != null) {
            kg.e1 adapter = wmVar.X1.getAdapter();
            if ((adapter.J != null || adapter.K != null) && i3 != 0) {
                kg.e1 adapter2 = wmVar.X1.getAdapter();
                if (adapter2.f17020x0 != null && !adapter2.f17001i0) {
                    return false;
                }
                Object J = wmVar.X1.getAdapter().J(i3 - 1);
                if (J instanceof kg.b1) {
                    kg.b1 b1Var = (kg.b1) J;
                    if (wmVar.X1.getAdapter().K != null && org.telegram.ui.Components.s31.h) {
                        wmVar.f51237a0.setFieldText("");
                        mj mjVar = wmVar.f51237a0;
                        String str = b1Var.f16930a;
                        TLRPC.Chat chat = wmVar.f51292e;
                        if (chat != null && chat.megagroup) {
                            z10 = true;
                        }
                        mjVar.Z0(null, str, true, z10);
                        return true;
                    }
                } else if (J instanceof String) {
                    if (wmVar.X1.getAdapter().K != null) {
                        if (org.telegram.ui.Components.s31.h) {
                            wmVar.f51237a0.setFieldText("");
                            mj mjVar2 = wmVar.f51237a0;
                            String str2 = (String) J;
                            TLRPC.Chat chat2 = wmVar.f51292e;
                            if (chat2 != null && chat2.megagroup) {
                                z10 = true;
                            }
                            mjVar2.Z0(null, str2, true, z10);
                            return true;
                        }
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wmVar.getParentActivity(), wmVar.f51557ya);
                        String M0 = org.telegram.messenger.bd.M0(2131689472, null);
                        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                        s1Var.S = M0;
                        s1Var.U = org.telegram.messenger.bd.M0(2131752062, null);
                        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131752099, null), new de(wmVar, 12));
                        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                        wmVar.showDialog(s1Var);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.f44667a) {
            case 2:
                rj rjVar = this.f44668b.E0;
                if (rjVar != null) {
                    rjVar.callOnClick();
                    return;
                }
                return;
            case 3:
                this.f44668b.finishFragment();
                return;
            case 4:
            case 5:
            case 9:
            case 11:
            case 13:
            case 14:
            case 17:
            default:
                wm wmVar = this.f44668b;
                org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) wmVar.W4.get(Integer.valueOf(wmVar.Y4));
                if (ziVar == null) {
                    ziVar = (org.telegram.messenger.zi) wmVar.F6[0].get(wmVar.Y4);
                }
                wmVar.Gc(ziVar);
                return;
            case 6:
                wm wmVar2 = this.f44668b;
                org.telegram.messenger.dj djVar = wmVar2.f51526w5;
                if (djVar != null) {
                    djVar.d(null, wmVar2.f51376k6);
                }
                wmVar2.z8();
                return;
            case 7:
                this.f44668b.Ca(1);
                return;
            case 8:
                wm wmVar3 = this.f44668b;
                wmVar3.getMessagesController().f5(null, wmVar3.f51306f.f27150id);
                return;
            case 10:
                this.f44668b.finishFragment();
                return;
            case 12:
                kg.e1 adapter = this.f44668b.X1.getAdapter();
                adapter.f17019x.c();
                adapter.J.clear();
                adapter.f();
                org.telegram.ui.Components.x80 x80Var = adapter.W;
                if (x80Var != null) {
                    x80Var.a(false);
                    return;
                }
                return;
            case 15:
                wm wmVar4 = this.f44668b;
                wmVar4.showDialog(new uk(wmVar4, wmVar4.getParentActivity(), wmVar4));
                return;
            case 16:
                wm wmVar5 = this.f44668b;
                wmVar5.f8();
                UndoView undoView = wmVar5.N3;
                if (undoView != null) {
                    undoView.j(75, 0L, null);
                    return;
                }
                return;
            case 18:
                wm wmVar6 = this.f44668b;
                org.telegram.messenger.dj djVar2 = wmVar6.f51526w5;
                if (djVar2 != null && djVar2.d != null) {
                    wmVar6.Ca(0);
                    return;
                }
                return;
            case 19:
                this.f44668b.B9(true);
                return;
        }
    }

    @Override
    public void h(int i3, ArrayList arrayList) {
        wm wmVar = this.f44668b;
        wmVar.getMessagesController().o(wmVar.f51292e, wmVar, arrayList, i3, null, null, null);
        wmVar.getMessagesController().i2(wmVar.f51376k6, wmVar.f51306f, wmVar.f51292e);
        wmVar.vd(true);
        wmVar.Sc(true);
    }

    @Override
    public void k(ArrayList arrayList) {
        switch (this.f44667a) {
            case 11:
                wm wmVar = this.f44668b;
                if (wmVar.getParentActivity() != null && wmVar.getParentActivity() != null) {
                    mh mhVar = new mh(wmVar, wmVar, wmVar.getParentActivity(), wmVar.f51557ya, arrayList);
                    boolean T9 = wmVar.T9();
                    mhVar.f28604i0 = T9;
                    mhVar.f28608n = T9;
                    mhVar.f28611p0 = false;
                    wmVar.O7(false);
                    wmVar.showDialog(mhVar);
                    return;
                }
                return;
            default:
                wm wmVar2 = this.f44668b;
                if (wmVar2.getParentActivity() != null && wmVar2.getParentActivity() != null) {
                    hi hiVar = new hi(wmVar2, wmVar2, wmVar2.getParentActivity(), wmVar2.f51557ya, arrayList);
                    boolean T92 = wmVar2.T9();
                    hiVar.f28604i0 = T92;
                    hiVar.f28608n = T92;
                    hiVar.f28611p0 = false;
                    wmVar2.O7(false);
                    wmVar2.showDialog(hiVar);
                    return;
                }
                return;
        }
    }

    @Override
    public void l(int i3) {
        wm.b1(this.f44668b, i3);
    }

    @Override
    public void o(boolean z10) {
        wm wmVar = this.f44668b;
        org.telegram.messenger.hs notificationCenter = wmVar.getNotificationCenter();
        int i3 = org.telegram.messenger.hs.f23305t;
        notificationCenter.n(wmVar, i3);
        wmVar.getNotificationCenter().k(i3, new Object[0]);
        wmVar.finishFragment();
        wmVar.getNotificationCenter().k(org.telegram.messenger.hs.K2, Long.valueOf(wmVar.f51376k6), wmVar.f51306f, wmVar.f51292e, Boolean.valueOf(z10));
    }

    @Override
    public void onComplete(Object obj) {
        boolean z10;
        org.telegram.ui.ActionBar.p3 p3Var = (org.telegram.ui.ActionBar.p3) obj;
        wm wmVar = this.f44668b;
        um umVar = wmVar.f51557ya;
        TLRPC.WallPaper wallPaper = umVar.f50125g;
        if (wmVar.f51327g6 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        umVar.r(p3Var, wallPaper, z10, null, false);
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }

    @Override
    public void e(TLRPC.User user) {
    }
}
