package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.UndoView;
public final class fe implements org.telegram.ui.Components.q40, org.telegram.ui.Components.t40, org.telegram.ui.ActionBar.r1, org.telegram.ui.Components.on, org.telegram.messenger.qr, org.telegram.ui.Components.ph0, ResultCallback, oi.m, yh.c, lh.a, lh.b, t40, or, org.telegram.ui.Components.ej0 {
    public final int f45691a;
    public final cn f45692b;

    public fe(cn cnVar, int i7) {
        this.f45691a = i7;
        this.f45692b = cnVar;
    }

    @Override
    public void a() {
        cn cnVar = this.f45692b;
        if (cnVar.M3 == null && cnVar.getParentActivity() != null) {
            cnVar.g8();
            cnVar.M3.m(cnVar.f44504j6, cnVar.f44446f, 8);
        }
    }

    @Override
    public void b(TLRPC.Document document) {
        switch (this.f45691a) {
            case 4:
                cn.K0(this.f45692b, document);
                return;
            default:
                cn.H1(this.f45692b, document);
                return;
        }
    }

    @Override
    public boolean c(int i7, View view) {
        cn cnVar = this.f45692b;
        boolean z9 = false;
        if (cnVar.getParentActivity() != null) {
            jg.i1 adapter = cnVar.W1.getAdapter();
            if ((adapter.I != null || adapter.J != null) && i7 != 0) {
                jg.i1 adapter2 = cnVar.W1.getAdapter();
                if (adapter2.f16802w0 != null && !adapter2.f16784h0) {
                    return false;
                }
                Object J = cnVar.W1.getAdapter().J(i7 - 1);
                if (J instanceof jg.f1) {
                    jg.f1 f1Var = (jg.f1) J;
                    if (cnVar.W1.getAdapter().J != null && org.telegram.ui.Components.z31.h) {
                        cnVar.Z.setFieldText("");
                        sj sjVar = cnVar.Z;
                        String str = f1Var.f16725a;
                        TLRPC.Chat chat = cnVar.f44432e;
                        if (chat != null && chat.megagroup) {
                            z9 = true;
                        }
                        sjVar.a1(null, str, true, z9);
                        return true;
                    }
                } else if (J instanceof String) {
                    if (cnVar.W1.getAdapter().J != null) {
                        if (org.telegram.ui.Components.z31.h) {
                            cnVar.Z.setFieldText("");
                            sj sjVar2 = cnVar.Z;
                            String str2 = (String) J;
                            TLRPC.Chat chat2 = cnVar.f44432e;
                            if (chat2 != null && chat2.megagroup) {
                                z9 = true;
                            }
                            sjVar2.a1(null, str2, true, z9);
                            return true;
                        }
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, cnVar.getParentActivity(), cnVar.f44709za);
                        String M0 = org.telegram.messenger.id.M0(2131689472, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                        u1Var.R = M0;
                        u1Var.T = org.telegram.messenger.id.M0(2131752062, null);
                        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131752099, null), new fe(cnVar, 12));
                        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                        cnVar.showDialog(u1Var);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public void d(boolean z9, boolean z10) {
        cn cnVar = this.f45692b;
        cnVar.f44378a1.i(cnVar.Aa.b(), z9, z10);
    }

    @Override
    public void f(int i7, ArrayList arrayList) {
        cn cnVar = this.f45692b;
        cnVar.getMessagesController().o(cnVar.f44432e, cnVar, arrayList, i7, null, null, null);
        cnVar.getMessagesController().i2(cnVar.f44504j6, cnVar.f44446f, cnVar.f44432e);
        cnVar.yd(true);
        cnVar.Vc(true);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f45691a) {
            case 2:
                xj xjVar = this.f45692b.D0;
                if (xjVar != null) {
                    xjVar.callOnClick();
                    return;
                }
                return;
            case 3:
                this.f45692b.finishFragment();
                return;
            case 4:
            case 5:
            case 9:
            case 11:
            case 13:
            case 14:
            case 18:
            default:
                cn cnVar = this.f45692b;
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) cnVar.V4.get(Integer.valueOf(cnVar.X4));
                if (ijVar == null) {
                    ijVar = (org.telegram.messenger.ij) cnVar.E6[0].get(cnVar.X4);
                }
                cnVar.Jc(ijVar);
                return;
            case 6:
                cn cnVar2 = this.f45692b;
                org.telegram.messenger.mj mjVar = cnVar2.f44653v5;
                if (mjVar != null) {
                    mjVar.d(null, cnVar2.f44504j6);
                }
                cnVar2.A8();
                return;
            case 7:
                this.f45692b.Ea(1);
                return;
            case 8:
                cn cnVar3 = this.f45692b;
                cnVar3.getMessagesController().f5(null, cnVar3.f44446f.f27105id);
                return;
            case 10:
                this.f45692b.finishFragment();
                return;
            case 12:
                jg.i1 adapter = this.f45692b.W1.getAdapter();
                adapter.f16803x.c();
                adapter.I.clear();
                adapter.f();
                org.telegram.ui.Components.c90 c90Var = adapter.V;
                if (c90Var != null) {
                    c90Var.a(false);
                    return;
                }
                return;
            case 15:
                cn cnVar4 = this.f45692b;
                cnVar4.showDialog(new al(cnVar4, cnVar4.getParentActivity(), cnVar4));
                return;
            case 16:
                cn cnVar5 = this.f45692b;
                cnVar5.g8();
                UndoView undoView = cnVar5.M3;
                if (undoView != null) {
                    undoView.j(75, 0L, null);
                    return;
                }
                return;
            case 17:
                cn cnVar6 = this.f45692b;
                cnVar6.getLocationController().k(cnVar6.f44504j6);
                return;
            case 19:
                cn cnVar7 = this.f45692b;
                org.telegram.messenger.mj mjVar2 = cnVar7.f44653v5;
                if (mjVar2 != null && mjVar2.d != null) {
                    cnVar7.Ea(0);
                    return;
                }
                return;
            case 20:
                this.f45692b.C9(true);
                return;
        }
    }

    @Override
    public void h(int i7) {
        cn cnVar = this.f45692b;
        if (i7 == 1) {
            cnVar.wa();
        } else if (i7 == 2) {
            cnVar.ja();
        } else if (i7 == 3) {
            cnVar.P4 = true;
            cnVar.getMessagesController().w1(cnVar.f44504j6, cnVar.b(), cnVar.f44701z1, true, new tf(cnVar, 0));
        } else if (i7 == 4) {
            cnVar.P4 = true;
            cnVar.getMessagesController().w1(cnVar.f44504j6, cnVar.b(), cnVar.A1, false, new tf(cnVar, 1));
        } else if (i7 == 6) {
            cnVar.w9(true);
        } else if (i7 == 5) {
            cnVar.w9(false);
        } else if (i7 == 0) {
            di.u2 u2Var = cnVar.X1;
            if (u2Var != null) {
                u2Var.w1(0, null);
            }
            cnVar.za();
        }
    }

    @Override
    public void j(ArrayList arrayList) {
        switch (this.f45691a) {
            case 11:
                cn cnVar = this.f45692b;
                if (cnVar.getParentActivity() != null && cnVar.getParentActivity() != null) {
                    sh shVar = new sh(cnVar, cnVar, cnVar.getParentActivity(), cnVar.f44709za, arrayList);
                    boolean U9 = cnVar.U9();
                    shVar.f28640h0 = U9;
                    shVar.f28645n = U9;
                    shVar.f28647o0 = false;
                    cnVar.P7(false);
                    cnVar.showDialog(shVar);
                    return;
                }
                return;
            default:
                cn cnVar2 = this.f45692b;
                if (cnVar2.getParentActivity() != null && cnVar2.getParentActivity() != null) {
                    ni niVar = new ni(cnVar2, cnVar2, cnVar2.getParentActivity(), cnVar2.f44709za, arrayList);
                    boolean U92 = cnVar2.U9();
                    niVar.f28640h0 = U92;
                    niVar.f28645n = U92;
                    niVar.f28647o0 = false;
                    cnVar2.P7(false);
                    cnVar2.showDialog(niVar);
                    return;
                }
                return;
        }
    }

    @Override
    public void k(boolean z9) {
        cn cnVar = this.f45692b;
        org.telegram.messenger.qs notificationCenter = cnVar.getNotificationCenter();
        int i7 = org.telegram.messenger.qs.f25076t;
        notificationCenter.n(cnVar, i7);
        cnVar.getNotificationCenter().k(i7, new Object[0]);
        cnVar.finishFragment();
        cnVar.getNotificationCenter().k(org.telegram.messenger.qs.K2, Long.valueOf(cnVar.f44504j6), cnVar.f44446f, cnVar.f44432e, Boolean.valueOf(z9));
    }

    @Override
    public void l(int i7) {
        cn.i1(this.f45692b, i7);
    }

    @Override
    public void onComplete(Object obj) {
        boolean z9;
        org.telegram.ui.ActionBar.r3 r3Var = (org.telegram.ui.ActionBar.r3) obj;
        cn cnVar = this.f45692b;
        an anVar = cnVar.f44709za;
        TLRPC.WallPaper wallPaper = anVar.f43730g;
        if (cnVar.f44453f6 != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        anVar.r(r3Var, wallPaper, z9, null, false);
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
