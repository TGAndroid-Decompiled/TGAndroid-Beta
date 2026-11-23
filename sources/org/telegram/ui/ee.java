package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.UndoView;
public final class ee implements org.telegram.ui.Components.d50, org.telegram.ui.Components.g50, org.telegram.ui.ActionBar.q1, org.telegram.ui.Components.ho, org.telegram.messenger.mr, org.telegram.ui.Components.di0, ResultCallback, ri.m, zh.c, lh.a, u40, pr, lh.b, org.telegram.ui.Components.sj0 {
    public final int f47249a;
    public final bn f47250b;

    public ee(bn bnVar, int i7) {
        this.f47249a = i7;
        this.f47250b = bnVar;
    }

    @Override
    public void a() {
        bn bnVar = this.f47250b;
        if (bnVar.N3 == null && bnVar.getParentActivity() != null) {
            bnVar.h8();
            bnVar.N3.m(bnVar.f46103l6, bnVar.f46019f, 8);
        }
    }

    @Override
    public void b(TLRPC.Document document) {
        switch (this.f47249a) {
            case 4:
                bn.K0(this.f47250b, document);
                return;
            default:
                bn.H1(this.f47250b, document);
                return;
        }
    }

    @Override
    public boolean c(int i7, View view) {
        bn bnVar = this.f47250b;
        boolean z10 = false;
        if (bnVar.getParentActivity() != null) {
            jg.h1 adapter = bnVar.X1.getAdapter();
            if ((adapter.J != null || adapter.K != null) && i7 != 0) {
                jg.h1 adapter2 = bnVar.X1.getAdapter();
                if (adapter2.f17558x0 != null && !adapter2.f17539i0) {
                    return false;
                }
                Object J = bnVar.X1.getAdapter().J(i7 - 1);
                if (J instanceof jg.e1) {
                    jg.e1 e1Var = (jg.e1) J;
                    if (bnVar.X1.getAdapter().K != null && org.telegram.ui.Components.p41.h) {
                        bnVar.f45950a0.setFieldText("");
                        rj rjVar = bnVar.f45950a0;
                        String str = e1Var.f17477a;
                        TLRPC.Chat chat = bnVar.f46005e;
                        if (chat != null && chat.megagroup) {
                            z10 = true;
                        }
                        rjVar.C1(null, str, true, z10);
                        return true;
                    }
                } else if (J instanceof String) {
                    if (bnVar.X1.getAdapter().K != null) {
                        if (org.telegram.ui.Components.p41.h) {
                            bnVar.f45950a0.setFieldText("");
                            rj rjVar2 = bnVar.f45950a0;
                            String str2 = (String) J;
                            TLRPC.Chat chat2 = bnVar.f46005e;
                            if (chat2 != null && chat2.megagroup) {
                                z10 = true;
                            }
                            rjVar2.C1(null, str2, true, z10);
                            return true;
                        }
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, bnVar.getParentActivity(), bnVar.Ba);
                        String N0 = org.telegram.messenger.hd.N0(2131689472, null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
                        t1Var.S = N0;
                        t1Var.U = org.telegram.messenger.hd.N0(2131752050, null);
                        alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131752087, null), new ee(bnVar, 12));
                        alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                        bnVar.showDialog(t1Var);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public void d(boolean z10) {
        bn bnVar = this.f47250b;
        org.telegram.messenger.ls notificationCenter = bnVar.getNotificationCenter();
        int i7 = org.telegram.messenger.ls.f25384t;
        notificationCenter.n(bnVar, i7);
        bnVar.getNotificationCenter().k(i7, new Object[0]);
        bnVar.finishFragment();
        bnVar.getNotificationCenter().k(org.telegram.messenger.ls.K2, Long.valueOf(bnVar.f46103l6), bnVar.f46019f, bnVar.f46005e, Boolean.valueOf(z10));
    }

    @Override
    public void e(ArrayList arrayList) {
        switch (this.f47249a) {
            case 11:
                bn bnVar = this.f47250b;
                if (bnVar.getParentActivity() != null && bnVar.getParentActivity() != null) {
                    qh qhVar = new qh(bnVar, bnVar, bnVar.getParentActivity(), bnVar.Ba, arrayList);
                    boolean V9 = bnVar.V9();
                    qhVar.f30194i0 = V9;
                    qhVar.f30201n = V9;
                    qhVar.f30204p0 = false;
                    bnVar.P7(false);
                    bnVar.showDialog(qhVar);
                    return;
                }
                return;
            default:
                bn bnVar2 = this.f47250b;
                if (bnVar2.getParentActivity() != null && bnVar2.getParentActivity() != null) {
                    mi miVar = new mi(bnVar2, bnVar2, bnVar2.getParentActivity(), bnVar2.Ba, arrayList);
                    boolean V92 = bnVar2.V9();
                    miVar.f30194i0 = V92;
                    miVar.f30201n = V92;
                    miVar.f30204p0 = false;
                    bnVar2.P7(false);
                    bnVar2.showDialog(miVar);
                    return;
                }
                return;
        }
    }

    @Override
    public void g(boolean z10, boolean z11) {
        bn bnVar = this.f47250b;
        bnVar.f45966b1.j(bnVar.Ca.b(), z10, z11);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f47249a) {
            case 2:
                wj wjVar = this.f47250b.E0;
                if (wjVar != null) {
                    wjVar.callOnClick();
                    return;
                }
                return;
            case 3:
                this.f47250b.finishFragment();
                return;
            case 4:
            case 5:
            case 9:
            case 11:
            case 13:
            case 14:
            case 18:
            default:
                bn bnVar = this.f47250b;
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) bnVar.X4.get(Integer.valueOf(bnVar.Z4));
                if (gjVar == null) {
                    gjVar = (org.telegram.messenger.gj) bnVar.G6[0].get(bnVar.Z4);
                }
                bnVar.Kc(gjVar);
                return;
            case 6:
                bn bnVar2 = this.f47250b;
                org.telegram.messenger.kj kjVar = bnVar2.f46255x5;
                if (kjVar != null) {
                    kjVar.d(null, bnVar2.f46103l6);
                }
                bnVar2.B8();
                return;
            case 7:
                this.f47250b.Fa(1);
                return;
            case 8:
                bn bnVar3 = this.f47250b;
                bnVar3.getMessagesController().r5(null, bnVar3.f46019f.f28583id);
                return;
            case 10:
                this.f47250b.finishFragment();
                return;
            case 12:
                jg.h1 adapter = this.f47250b.X1.getAdapter();
                adapter.f17557x.c();
                adapter.J.clear();
                adapter.f();
                org.telegram.ui.Components.q90 q90Var = adapter.W;
                if (q90Var != null) {
                    q90Var.a(false);
                    return;
                }
                return;
            case 15:
                bn bnVar4 = this.f47250b;
                bnVar4.showDialog(new zk(bnVar4, bnVar4.getParentActivity(), bnVar4));
                return;
            case 16:
                bn bnVar5 = this.f47250b;
                bnVar5.h8();
                UndoView undoView = bnVar5.N3;
                if (undoView != null) {
                    undoView.j(75, 0L, null);
                    return;
                }
                return;
            case 17:
                bn bnVar6 = this.f47250b;
                bnVar6.getLocationController().k(bnVar6.f46103l6);
                return;
            case 19:
                bn bnVar7 = this.f47250b;
                org.telegram.messenger.kj kjVar2 = bnVar7.f46255x5;
                if (kjVar2 != null && kjVar2.d != null) {
                    bnVar7.Fa(0);
                    return;
                }
                return;
            case 20:
                this.f47250b.D9(true);
                return;
        }
    }

    @Override
    public void i(int i7, ArrayList arrayList) {
        bn bnVar = this.f47250b;
        bnVar.getMessagesController().o(bnVar.f46005e, bnVar, arrayList, i7, null, null, null);
        bnVar.getMessagesController().k2(bnVar.f46103l6, bnVar.f46019f, bnVar.f46005e);
        bnVar.zd(true);
        bnVar.Wc(true);
    }

    @Override
    public void j(int i7) {
        bn bnVar = this.f47250b;
        if (i7 == 1) {
            bnVar.xa();
        } else if (i7 == 2) {
            bnVar.ka();
        } else if (i7 == 3) {
            bnVar.R4 = true;
            bnVar.getMessagesController().y1(bnVar.f46103l6, bnVar.d(), bnVar.A1, true, new sf(bnVar, 0));
        } else if (i7 == 4) {
            bnVar.R4 = true;
            bnVar.getMessagesController().y1(bnVar.f46103l6, bnVar.d(), bnVar.B1, false, new sf(bnVar, 1));
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
        bn.i1(this.f47250b, i7);
    }

    @Override
    public void onComplete(Object obj) {
        boolean z10;
        org.telegram.ui.ActionBar.s3 s3Var = (org.telegram.ui.ActionBar.s3) obj;
        bn bnVar = this.f47250b;
        zm zmVar = bnVar.Ba;
        TLRPC.WallPaper wallPaper = zmVar.f54590g;
        if (bnVar.f46052h6 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zmVar.r(s3Var, wallPaper, z10, null, false);
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
