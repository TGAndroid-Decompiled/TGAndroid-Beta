package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.UndoView;
public final class ee implements org.telegram.ui.Components.a50, org.telegram.ui.Components.d50, org.telegram.ui.ActionBar.r1, org.telegram.ui.Components.fo, org.telegram.messenger.lr, org.telegram.ui.Components.bi0, ResultCallback, ri.m, zh.c, lh.a, u40, pr, lh.b, org.telegram.ui.Components.qj0 {
    public final int f47209a;
    public final bn f47210b;

    public ee(bn bnVar, int i7) {
        this.f47209a = i7;
        this.f47210b = bnVar;
    }

    @Override
    public void a() {
        bn bnVar = this.f47210b;
        if (bnVar.N3 == null && bnVar.getParentActivity() != null) {
            bnVar.h8();
            bnVar.N3.m(bnVar.f46085l6, bnVar.f46001f, 8);
        }
    }

    @Override
    public void b(TLRPC.Document document) {
        switch (this.f47209a) {
            case 4:
                bn.K0(this.f47210b, document);
                return;
            default:
                bn.H1(this.f47210b, document);
                return;
        }
    }

    @Override
    public boolean c(int i7, View view) {
        bn bnVar = this.f47210b;
        boolean z10 = false;
        if (bnVar.getParentActivity() != null) {
            jg.h1 adapter = bnVar.X1.getAdapter();
            if ((adapter.J != null || adapter.K != null) && i7 != 0) {
                jg.h1 adapter2 = bnVar.X1.getAdapter();
                if (adapter2.f17533x0 != null && !adapter2.f17514i0) {
                    return false;
                }
                Object J = bnVar.X1.getAdapter().J(i7 - 1);
                if (J instanceof jg.e1) {
                    jg.e1 e1Var = (jg.e1) J;
                    if (bnVar.X1.getAdapter().K != null && org.telegram.ui.Components.m41.h) {
                        bnVar.f45932a0.setFieldText("");
                        rj rjVar = bnVar.f45932a0;
                        String str = e1Var.f17452a;
                        TLRPC.Chat chat = bnVar.f45987e;
                        if (chat != null && chat.megagroup) {
                            z10 = true;
                        }
                        rjVar.y1(null, str, true, z10);
                        return true;
                    }
                } else if (J instanceof String) {
                    if (bnVar.X1.getAdapter().K != null) {
                        if (org.telegram.ui.Components.m41.h) {
                            bnVar.f45932a0.setFieldText("");
                            rj rjVar2 = bnVar.f45932a0;
                            String str2 = (String) J;
                            TLRPC.Chat chat2 = bnVar.f45987e;
                            if (chat2 != null && chat2.megagroup) {
                                z10 = true;
                            }
                            rjVar2.y1(null, str2, true, z10);
                            return true;
                        }
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, bnVar.getParentActivity(), bnVar.Ba);
                        String M0 = org.telegram.messenger.gd.M0(2131689472, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
                        u1Var.S = M0;
                        u1Var.U = org.telegram.messenger.gd.M0(2131752051, null);
                        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131752088, null), new ee(bnVar, 12));
                        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                        bnVar.showDialog(u1Var);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public void d(boolean z10) {
        bn bnVar = this.f47210b;
        org.telegram.messenger.ks notificationCenter = bnVar.getNotificationCenter();
        int i7 = org.telegram.messenger.ks.f25192t;
        notificationCenter.n(bnVar, i7);
        bnVar.getNotificationCenter().k(i7, new Object[0]);
        bnVar.finishFragment();
        bnVar.getNotificationCenter().k(org.telegram.messenger.ks.K2, Long.valueOf(bnVar.f46085l6), bnVar.f46001f, bnVar.f45987e, Boolean.valueOf(z10));
    }

    @Override
    public void e(ArrayList arrayList) {
        switch (this.f47209a) {
            case 11:
                bn bnVar = this.f47210b;
                if (bnVar.getParentActivity() != null && bnVar.getParentActivity() != null) {
                    ph phVar = new ph(bnVar, bnVar, bnVar.getParentActivity(), bnVar.Ba, arrayList);
                    boolean V9 = bnVar.V9();
                    phVar.f30210i0 = V9;
                    phVar.f30217n = V9;
                    phVar.f30220p0 = false;
                    bnVar.P7(false);
                    bnVar.showDialog(phVar);
                    return;
                }
                return;
            default:
                bn bnVar2 = this.f47210b;
                if (bnVar2.getParentActivity() != null && bnVar2.getParentActivity() != null) {
                    mi miVar = new mi(bnVar2, bnVar2, bnVar2.getParentActivity(), bnVar2.Ba, arrayList);
                    boolean V92 = bnVar2.V9();
                    miVar.f30210i0 = V92;
                    miVar.f30217n = V92;
                    miVar.f30220p0 = false;
                    bnVar2.P7(false);
                    bnVar2.showDialog(miVar);
                    return;
                }
                return;
        }
    }

    @Override
    public void g(boolean z10, boolean z11) {
        bn bnVar = this.f47210b;
        bnVar.f45948b1.j(bnVar.Ca.b(), z10, z11);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f47209a) {
            case 2:
                wj wjVar = this.f47210b.E0;
                if (wjVar != null) {
                    wjVar.callOnClick();
                    return;
                }
                return;
            case 3:
                this.f47210b.finishFragment();
                return;
            case 4:
            case 5:
            case 9:
            case 11:
            case 13:
            case 14:
            case 18:
            default:
                bn bnVar = this.f47210b;
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) bnVar.X4.get(Integer.valueOf(bnVar.Z4));
                if (fjVar == null) {
                    fjVar = (org.telegram.messenger.fj) bnVar.G6[0].get(bnVar.Z4);
                }
                bnVar.Kc(fjVar);
                return;
            case 6:
                bn bnVar2 = this.f47210b;
                org.telegram.messenger.jj jjVar = bnVar2.f46237x5;
                if (jjVar != null) {
                    jjVar.d(null, bnVar2.f46085l6);
                }
                bnVar2.B8();
                return;
            case 7:
                this.f47210b.Fa(1);
                return;
            case 8:
                bn bnVar3 = this.f47210b;
                bnVar3.getMessagesController().r5(null, bnVar3.f46001f.f28554id);
                return;
            case 10:
                this.f47210b.finishFragment();
                return;
            case 12:
                jg.h1 adapter = this.f47210b.X1.getAdapter();
                adapter.f17532x.c();
                adapter.J.clear();
                adapter.f();
                org.telegram.ui.Components.o90 o90Var = adapter.W;
                if (o90Var != null) {
                    o90Var.a(false);
                    return;
                }
                return;
            case 15:
                bn bnVar4 = this.f47210b;
                bnVar4.showDialog(new zk(bnVar4, bnVar4.getParentActivity(), bnVar4));
                return;
            case 16:
                bn bnVar5 = this.f47210b;
                bnVar5.h8();
                UndoView undoView = bnVar5.N3;
                if (undoView != null) {
                    undoView.j(75, 0L, null);
                    return;
                }
                return;
            case 17:
                bn bnVar6 = this.f47210b;
                bnVar6.getLocationController().k(bnVar6.f46085l6);
                return;
            case 19:
                bn bnVar7 = this.f47210b;
                org.telegram.messenger.jj jjVar2 = bnVar7.f46237x5;
                if (jjVar2 != null && jjVar2.d != null) {
                    bnVar7.Fa(0);
                    return;
                }
                return;
            case 20:
                this.f47210b.D9(true);
                return;
        }
    }

    @Override
    public void i(int i7, ArrayList arrayList) {
        bn bnVar = this.f47210b;
        bnVar.getMessagesController().o(bnVar.f45987e, bnVar, arrayList, i7, null, null, null);
        bnVar.getMessagesController().k2(bnVar.f46085l6, bnVar.f46001f, bnVar.f45987e);
        bnVar.zd(true);
        bnVar.Wc(true);
    }

    @Override
    public void j(int i7) {
        bn bnVar = this.f47210b;
        if (i7 == 1) {
            bnVar.xa();
        } else if (i7 == 2) {
            bnVar.ka();
        } else if (i7 == 3) {
            bnVar.R4 = true;
            bnVar.getMessagesController().y1(bnVar.f46085l6, bnVar.d(), bnVar.A1, true, new sf(bnVar, 0));
        } else if (i7 == 4) {
            bnVar.R4 = true;
            bnVar.getMessagesController().y1(bnVar.f46085l6, bnVar.d(), bnVar.B1, false, new sf(bnVar, 1));
        } else if (i7 == 6) {
            bnVar.x9(true);
        } else if (i7 == 5) {
            bnVar.x9(false);
        } else if (i7 == 0) {
            fi.n2 n2Var = bnVar.Y1;
            if (n2Var != null) {
                n2Var.x1(0, null);
            }
            bnVar.Aa();
        }
    }

    @Override
    public void l(int i7) {
        bn.i1(this.f47210b, i7);
    }

    @Override
    public void onComplete(Object obj) {
        boolean z10;
        org.telegram.ui.ActionBar.t3 t3Var = (org.telegram.ui.ActionBar.t3) obj;
        bn bnVar = this.f47210b;
        zm zmVar = bnVar.Ba;
        TLRPC.WallPaper wallPaper = zmVar.f54538g;
        if (bnVar.f46034h6 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zmVar.r(t3Var, wallPaper, z10, null, false);
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
    public void f(TLRPC.User user) {
    }
}
