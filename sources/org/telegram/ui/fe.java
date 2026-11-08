package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.UndoView;
public final class fe implements org.telegram.ui.Components.p40, org.telegram.ui.Components.s40, org.telegram.ui.ActionBar.r1, org.telegram.ui.Components.on, org.telegram.messenger.qr, org.telegram.ui.Components.oh0, ResultCallback, oi.m, yh.c, lh.a, r40, mr, lh.b, org.telegram.ui.Components.dj0, lh.d {
    public final int f45590a;
    public final an f45591b;

    public fe(an anVar, int i7) {
        this.f45590a = i7;
        this.f45591b = anVar;
    }

    @Override
    public void a() {
        an anVar = this.f45591b;
        if (anVar.M3 == null && anVar.getParentActivity() != null) {
            anVar.f8();
            anVar.M3.m(anVar.f43848j6, anVar.f43791f, 8);
        }
    }

    @Override
    public void b(TLRPC.Document document) {
        switch (this.f45590a) {
            case 4:
                an.n0(this.f45591b, document);
                return;
            default:
                an.v0(this.f45591b, document);
                return;
        }
    }

    @Override
    public boolean c(int i7, View view) {
        an anVar = this.f45591b;
        boolean z9 = false;
        if (anVar.getParentActivity() != null) {
            jg.i1 adapter = anVar.W1.getAdapter();
            if ((adapter.I != null || adapter.J != null) && i7 != 0) {
                jg.i1 adapter2 = anVar.W1.getAdapter();
                if (adapter2.f16802w0 != null && !adapter2.f16784h0) {
                    return false;
                }
                Object J = anVar.W1.getAdapter().J(i7 - 1);
                if (J instanceof jg.f1) {
                    jg.f1 f1Var = (jg.f1) J;
                    if (anVar.W1.getAdapter().J != null && org.telegram.ui.Components.y31.h) {
                        anVar.Z.setFieldText("");
                        qj qjVar = anVar.Z;
                        String str = f1Var.f16725a;
                        TLRPC.Chat chat = anVar.f43777e;
                        if (chat != null && chat.megagroup) {
                            z9 = true;
                        }
                        qjVar.Z0(null, str, true, z9);
                        return true;
                    }
                } else if (J instanceof String) {
                    if (anVar.W1.getAdapter().J != null) {
                        if (org.telegram.ui.Components.y31.h) {
                            anVar.Z.setFieldText("");
                            qj qjVar2 = anVar.Z;
                            String str2 = (String) J;
                            TLRPC.Chat chat2 = anVar.f43777e;
                            if (chat2 != null && chat2.megagroup) {
                                z9 = true;
                            }
                            qjVar2.Z0(null, str2, true, z9);
                            return true;
                        }
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, anVar.getParentActivity(), anVar.f44028xa);
                        String M0 = org.telegram.messenger.id.M0(2131689472, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                        u1Var.R = M0;
                        u1Var.T = org.telegram.messenger.id.M0(2131752062, null);
                        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131752099, null), new fe(anVar, 12));
                        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                        anVar.showDialog(u1Var);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public void d(boolean z9, boolean z10) {
        an anVar = this.f45591b;
        anVar.f43723a1.i(anVar.ya.b(), z9, z10);
    }

    @Override
    public void f(int i7, ArrayList arrayList) {
        an anVar = this.f45591b;
        anVar.getMessagesController().o(anVar.f43777e, anVar, arrayList, i7, null, null, null);
        anVar.getMessagesController().i2(anVar.f43848j6, anVar.f43791f, anVar.f43777e);
        anVar.vd(true);
        anVar.Sc(true);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f45590a) {
            case 2:
                vj vjVar = this.f45591b.D0;
                if (vjVar != null) {
                    vjVar.callOnClick();
                    return;
                }
                return;
            case 3:
                this.f45591b.finishFragment();
                return;
            case 4:
            case 5:
            case 9:
            case 11:
            case 13:
            case 14:
            case 17:
            default:
                an anVar = this.f45591b;
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) anVar.V4.get(Integer.valueOf(anVar.X4));
                if (ijVar == null) {
                    ijVar = (org.telegram.messenger.ij) anVar.E6[0].get(anVar.X4);
                }
                anVar.Gc(ijVar);
                return;
            case 6:
                an anVar2 = this.f45591b;
                org.telegram.messenger.mj mjVar = anVar2.f43996v5;
                if (mjVar != null) {
                    mjVar.d(null, anVar2.f43848j6);
                }
                anVar2.z8();
                return;
            case 7:
                this.f45591b.Ca(1);
                return;
            case 8:
                an anVar3 = this.f45591b;
                anVar3.getMessagesController().f5(null, anVar3.f43791f.f27105id);
                return;
            case 10:
                this.f45591b.finishFragment();
                return;
            case 12:
                jg.i1 adapter = this.f45591b.W1.getAdapter();
                adapter.f16803x.c();
                adapter.I.clear();
                adapter.f();
                org.telegram.ui.Components.b90 b90Var = adapter.V;
                if (b90Var != null) {
                    b90Var.a(false);
                    return;
                }
                return;
            case 15:
                an anVar4 = this.f45591b;
                anVar4.showDialog(new yk(anVar4, anVar4.getParentActivity(), anVar4));
                return;
            case 16:
                an anVar5 = this.f45591b;
                anVar5.f8();
                UndoView undoView = anVar5.M3;
                if (undoView != null) {
                    undoView.j(75, 0L, null);
                    return;
                }
                return;
            case 18:
                an anVar6 = this.f45591b;
                org.telegram.messenger.mj mjVar2 = anVar6.f43996v5;
                if (mjVar2 != null && mjVar2.d != null) {
                    anVar6.Ca(0);
                    return;
                }
                return;
            case 19:
                this.f45591b.B9(true);
                return;
        }
    }

    @Override
    public void h(int i7) {
        an anVar = this.f45591b;
        if (i7 == 1) {
            anVar.ua();
        } else if (i7 == 2) {
            anVar.ha();
        } else if (i7 == 3) {
            anVar.P4 = true;
            anVar.getMessagesController().w1(anVar.f43848j6, anVar.b(), anVar.f44044z1, true, new tf(anVar, 0));
        } else if (i7 == 4) {
            anVar.P4 = true;
            anVar.getMessagesController().w1(anVar.f43848j6, anVar.b(), anVar.A1, false, new tf(anVar, 1));
        } else if (i7 == 6) {
            anVar.v9(true);
        } else if (i7 == 5) {
            anVar.v9(false);
        } else if (i7 == 0) {
            di.u2 u2Var = anVar.X1;
            if (u2Var != null) {
                u2Var.w1(0, null);
            }
            anVar.xa();
        }
    }

    @Override
    public void j(ArrayList arrayList) {
        switch (this.f45590a) {
            case 11:
                an anVar = this.f45591b;
                if (anVar.getParentActivity() != null && anVar.getParentActivity() != null) {
                    qh qhVar = new qh(anVar, anVar, anVar.getParentActivity(), anVar.f44028xa, arrayList);
                    boolean T9 = anVar.T9();
                    qhVar.f28635h0 = T9;
                    qhVar.f28640n = T9;
                    qhVar.f28642o0 = false;
                    anVar.O7(false);
                    anVar.showDialog(qhVar);
                    return;
                }
                return;
            default:
                an anVar2 = this.f45591b;
                if (anVar2.getParentActivity() != null && anVar2.getParentActivity() != null) {
                    li liVar = new li(anVar2, anVar2, anVar2.getParentActivity(), anVar2.f44028xa, arrayList);
                    boolean T92 = anVar2.T9();
                    liVar.f28635h0 = T92;
                    liVar.f28640n = T92;
                    liVar.f28642o0 = false;
                    anVar2.O7(false);
                    anVar2.showDialog(liVar);
                    return;
                }
                return;
        }
    }

    @Override
    public void k(boolean z9) {
        an anVar = this.f45591b;
        org.telegram.messenger.qs notificationCenter = anVar.getNotificationCenter();
        int i7 = org.telegram.messenger.qs.f25076t;
        notificationCenter.n(anVar, i7);
        anVar.getNotificationCenter().k(i7, new Object[0]);
        anVar.finishFragment();
        anVar.getNotificationCenter().k(org.telegram.messenger.qs.K2, Long.valueOf(anVar.f43848j6), anVar.f43791f, anVar.f43777e, Boolean.valueOf(z9));
    }

    @Override
    public void l(int i7) {
        an.b1(this.f45591b, i7);
    }

    @Override
    public void onComplete(Object obj) {
        boolean z9;
        org.telegram.ui.ActionBar.r3 r3Var = (org.telegram.ui.ActionBar.r3) obj;
        an anVar = this.f45591b;
        ym ymVar = anVar.f44028xa;
        TLRPC.WallPaper wallPaper = ymVar.f52251g;
        if (anVar.f43798f6 != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        ymVar.r(r3Var, wallPaper, z9, null, false);
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
