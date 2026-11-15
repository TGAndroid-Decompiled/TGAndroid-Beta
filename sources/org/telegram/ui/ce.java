package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.UndoView;
public final class ce implements org.telegram.ui.Components.s40, org.telegram.ui.Components.v40, org.telegram.ui.ActionBar.q1, org.telegram.ui.Components.wn, org.telegram.messenger.nr, org.telegram.ui.Components.sh0, ResultCallback, ri.m, zh.c, lh.a, lh.b, r40, or, org.telegram.ui.Components.ij0 {
    public final int f46083a;
    public final an f46084b;

    public ce(an anVar, int i7) {
        this.f46083a = i7;
        this.f46084b = anVar;
    }

    @Override
    public void a() {
        an anVar = this.f46084b;
        if (anVar.N3 == null && anVar.getParentActivity() != null) {
            anVar.h8();
            anVar.N3.m(anVar.f45259k6, anVar.f45187f, 8);
        }
    }

    @Override
    public boolean b(int i7, View view) {
        an anVar = this.f46084b;
        boolean z10 = false;
        if (anVar.getParentActivity() != null) {
            jg.h1 adapter = anVar.X1.getAdapter();
            if ((adapter.J != null || adapter.K != null) && i7 != 0) {
                jg.h1 adapter2 = anVar.X1.getAdapter();
                if (adapter2.f17147x0 != null && !adapter2.f17128i0) {
                    return false;
                }
                Object J = anVar.X1.getAdapter().J(i7 - 1);
                if (J instanceof jg.e1) {
                    jg.e1 e1Var = (jg.e1) J;
                    if (anVar.X1.getAdapter().K != null && org.telegram.ui.Components.c41.h) {
                        anVar.f45118a0.setFieldText("");
                        qj qjVar = anVar.f45118a0;
                        String str = e1Var.f17066a;
                        TLRPC.Chat chat = anVar.f45173e;
                        if (chat != null && chat.megagroup) {
                            z10 = true;
                        }
                        qjVar.q1(null, str, true, z10);
                        return true;
                    }
                } else if (J instanceof String) {
                    if (anVar.X1.getAdapter().K != null) {
                        if (org.telegram.ui.Components.c41.h) {
                            anVar.f45118a0.setFieldText("");
                            qj qjVar2 = anVar.f45118a0;
                            String str2 = (String) J;
                            TLRPC.Chat chat2 = anVar.f45173e;
                            if (chat2 != null && chat2.megagroup) {
                                z10 = true;
                            }
                            qjVar2.q1(null, str2, true, z10);
                            return true;
                        }
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, anVar.getParentActivity(), anVar.Aa);
                        String M0 = org.telegram.messenger.hd.M0(2131689472, null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                        t1Var.S = M0;
                        t1Var.U = org.telegram.messenger.hd.M0(2131752062, null);
                        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752099, null), new ce(anVar, 12));
                        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                        anVar.showDialog(t1Var);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public void c(TLRPC.Document document) {
        switch (this.f46083a) {
            case 4:
                an.K0(this.f46084b, document);
                return;
            default:
                an.H1(this.f46084b, document);
                return;
        }
    }

    @Override
    public void d(ArrayList arrayList) {
        switch (this.f46083a) {
            case 11:
                an anVar = this.f46084b;
                if (anVar.getParentActivity() != null && anVar.getParentActivity() != null) {
                    qh qhVar = new qh(anVar, anVar, anVar.getParentActivity(), anVar.Aa, arrayList);
                    boolean V9 = anVar.V9();
                    qhVar.f29700i0 = V9;
                    qhVar.f29707n = V9;
                    qhVar.f29710p0 = false;
                    anVar.P7(false);
                    anVar.showDialog(qhVar);
                    return;
                }
                return;
            default:
                an anVar2 = this.f46084b;
                if (anVar2.getParentActivity() != null && anVar2.getParentActivity() != null) {
                    li liVar = new li(anVar2, anVar2, anVar2.getParentActivity(), anVar2.Aa, arrayList);
                    boolean V92 = anVar2.V9();
                    liVar.f29700i0 = V92;
                    liVar.f29707n = V92;
                    liVar.f29710p0 = false;
                    anVar2.P7(false);
                    anVar2.showDialog(liVar);
                    return;
                }
                return;
        }
    }

    @Override
    public void e(boolean z10, boolean z11) {
        an anVar = this.f46084b;
        anVar.f45134b1.i(anVar.Ba.b(), z10, z11);
    }

    @Override
    public void g(int i7) {
        an anVar = this.f46084b;
        if (i7 == 1) {
            anVar.xa();
        } else if (i7 == 2) {
            anVar.ka();
        } else if (i7 == 3) {
            anVar.Q4 = true;
            anVar.getMessagesController().w1(anVar.f45259k6, anVar.b(), anVar.A1, true, new qf(anVar, 0));
        } else if (i7 == 4) {
            anVar.Q4 = true;
            anVar.getMessagesController().w1(anVar.f45259k6, anVar.b(), anVar.B1, false, new qf(anVar, 1));
        } else if (i7 == 6) {
            anVar.x9(true);
        } else if (i7 == 5) {
            anVar.x9(false);
        } else if (i7 == 0) {
            fi.p2 p2Var = anVar.Y1;
            if (p2Var != null) {
                p2Var.w1(0, null);
            }
            anVar.Aa();
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f46083a) {
            case 2:
                vj vjVar = this.f46084b.E0;
                if (vjVar != null) {
                    vjVar.callOnClick();
                    return;
                }
                return;
            case 3:
                this.f46084b.finishFragment();
                return;
            case 4:
            case 5:
            case 9:
            case 11:
            case 13:
            case 14:
            case 18:
            default:
                an anVar = this.f46084b;
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) anVar.W4.get(Integer.valueOf(anVar.Y4));
                if (gjVar == null) {
                    gjVar = (org.telegram.messenger.gj) anVar.F6[0].get(anVar.Y4);
                }
                anVar.Kc(gjVar);
                return;
            case 6:
                an anVar2 = this.f46084b;
                org.telegram.messenger.kj kjVar = anVar2.f45409w5;
                if (kjVar != null) {
                    kjVar.d(null, anVar2.f45259k6);
                }
                anVar2.B8();
                return;
            case 7:
                this.f46084b.Fa(1);
                return;
            case 8:
                an anVar3 = this.f46084b;
                anVar3.getMessagesController().g5(null, anVar3.f45187f.f28200id);
                return;
            case 10:
                this.f46084b.finishFragment();
                return;
            case 12:
                jg.h1 adapter = this.f46084b.X1.getAdapter();
                adapter.f17146x.c();
                adapter.J.clear();
                adapter.f();
                org.telegram.ui.Components.d90 d90Var = adapter.W;
                if (d90Var != null) {
                    d90Var.a(false);
                    return;
                }
                return;
            case 15:
                an anVar4 = this.f46084b;
                anVar4.showDialog(new yk(anVar4, anVar4.getParentActivity(), anVar4));
                return;
            case 16:
                an anVar5 = this.f46084b;
                anVar5.h8();
                UndoView undoView = anVar5.N3;
                if (undoView != null) {
                    undoView.j(75, 0L, null);
                    return;
                }
                return;
            case 17:
                an anVar6 = this.f46084b;
                anVar6.getLocationController().k(anVar6.f45259k6);
                return;
            case 19:
                an anVar7 = this.f46084b;
                org.telegram.messenger.kj kjVar2 = anVar7.f45409w5;
                if (kjVar2 != null && kjVar2.d != null) {
                    anVar7.Fa(0);
                    return;
                }
                return;
            case 20:
                this.f46084b.D9(true);
                return;
        }
    }

    @Override
    public void i(int i7, ArrayList arrayList) {
        an anVar = this.f46084b;
        anVar.getMessagesController().o(anVar.f45173e, anVar, arrayList, i7, null, null, null);
        anVar.getMessagesController().i2(anVar.f45259k6, anVar.f45187f, anVar.f45173e);
        anVar.zd(true);
        anVar.Wc(true);
    }

    @Override
    public void j(boolean z10) {
        an anVar = this.f46084b;
        org.telegram.messenger.ns notificationCenter = anVar.getNotificationCenter();
        int i7 = org.telegram.messenger.ns.f25572t;
        notificationCenter.n(anVar, i7);
        anVar.getNotificationCenter().k(i7, new Object[0]);
        anVar.finishFragment();
        anVar.getNotificationCenter().k(org.telegram.messenger.ns.K2, Long.valueOf(anVar.f45259k6), anVar.f45187f, anVar.f45173e, Boolean.valueOf(z10));
    }

    @Override
    public void l(int i7) {
        an.i1(this.f46084b, i7);
    }

    @Override
    public void onComplete(Object obj) {
        boolean z10;
        org.telegram.ui.ActionBar.p3 p3Var = (org.telegram.ui.ActionBar.p3) obj;
        an anVar = this.f46084b;
        ym ymVar = anVar.Aa;
        TLRPC.WallPaper wallPaper = ymVar.f53546g;
        if (anVar.f45206g6 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ymVar.r(p3Var, wallPaper, z10, null, false);
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
