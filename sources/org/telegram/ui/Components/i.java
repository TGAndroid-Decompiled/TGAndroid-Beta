package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseIntArray;
import android.view.View;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class i implements org.telegram.messenger.r20 {
    public final int f26851a;
    public final Object f26852b;
    public final Object f26853c;
    public final Object d;

    public i(Object obj, Object obj2, Object obj3, int i10) {
        this.f26851a = i10;
        this.f26852b = obj;
        this.f26853c = obj2;
        this.d = obj3;
    }

    @Override
    public final Object a(Object obj) {
        int i10 = this.f26851a;
        Object obj2 = this.d;
        Object obj3 = this.f26853c;
        Object obj4 = this.f26852b;
        switch (i10) {
            case 0:
                final g0 g0Var = (g0) obj4;
                final org.telegram.ui.ActionBar.p6 p6Var = (org.telegram.ui.ActionBar.p6) obj3;
                Context context = (Context) obj2;
                e0 e0Var = (e0) obj;
                TL_aicompose.AiComposeTone aiComposeTone = e0Var.e;
                if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
                    final TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
                    z60 F = z60.F(g0Var.f21589c, p6Var, e0Var);
                    F.W(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(12.0f), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20929d6, p6Var)));
                    F.l(2131232115, org.telegram.messenger.cd.L0(2131754996, null), new Runnable() {
                        @Override
                        public final void run() {
                            boolean z10;
                            int i11 = r4;
                            TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = tL_aiComposeTone;
                            org.telegram.ui.ActionBar.p6 p6Var2 = p6Var;
                            g0 g0Var2 = g0Var;
                            switch (i11) {
                                case 0:
                                    z zVar = new z(g0Var2.getContext(), p6Var2);
                                    zVar.f32853b2 = tL_aiComposeTone2;
                                    zVar.Z1 = Long.valueOf(tL_aiComposeTone2.emoji_id);
                                    zVar.f1();
                                    zVar.S1.setText(zVar.f32853b2.title);
                                    zVar.T1.setText(zVar.f32853b2.prompt);
                                    if (zVar.f32853b2.author_id != 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    zVar.V1.a(z10, false);
                                    zVar.l1.setTitle(org.telegram.messenger.cd.L0(2131754996, null));
                                    zVar.Y1.setText(org.telegram.messenger.cd.L0(2131754979, null));
                                    zVar.e1();
                                    zVar.f32857f2.O(false);
                                    zVar.f32855d2 = new f(g0Var2, 2);
                                    zVar.show();
                                    return;
                                default:
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, g0Var2.getContext(), p6Var2);
                                    String L0 = org.telegram.messenger.cd.L0(2131754998, null);
                                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                                    x1Var.R = L0;
                                    x1Var.T = org.telegram.messenger.cd.L0(2131754997, null);
                                    alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751599, null), new ng.d(22, g0Var2, tL_aiComposeTone2));
                                    alertDialog$Builder.d(-1);
                                    alertDialog$Builder.p();
                                    return;
                            }
                        }
                    }, tL_aiComposeTone.creator);
                    F.c(2131232362, org.telegram.messenger.cd.L0(2131754983, null), new org.telegram.ui.fp((Object) g0Var, (Object) tL_aiComposeTone, (Object) context, (Object) p6Var, 4), false);
                    F.m(2131232107, new org.telegram.ui.zg(24, g0Var, tL_aiComposeTone), org.telegram.messenger.cd.L0(2131754985, null), !tL_aiComposeTone.creator, true);
                    F.m(2131232107, new Runnable() {
                        @Override
                        public final void run() {
                            boolean z10;
                            int i11 = r4;
                            TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = tL_aiComposeTone;
                            org.telegram.ui.ActionBar.p6 p6Var2 = p6Var;
                            g0 g0Var2 = g0Var;
                            switch (i11) {
                                case 0:
                                    z zVar = new z(g0Var2.getContext(), p6Var2);
                                    zVar.f32853b2 = tL_aiComposeTone2;
                                    zVar.Z1 = Long.valueOf(tL_aiComposeTone2.emoji_id);
                                    zVar.f1();
                                    zVar.S1.setText(zVar.f32853b2.title);
                                    zVar.T1.setText(zVar.f32853b2.prompt);
                                    if (zVar.f32853b2.author_id != 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    zVar.V1.a(z10, false);
                                    zVar.l1.setTitle(org.telegram.messenger.cd.L0(2131754996, null));
                                    zVar.Y1.setText(org.telegram.messenger.cd.L0(2131754979, null));
                                    zVar.e1();
                                    zVar.f32857f2.O(false);
                                    zVar.f32855d2 = new f(g0Var2, 2);
                                    zVar.show();
                                    return;
                                default:
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, g0Var2.getContext(), p6Var2);
                                    String L0 = org.telegram.messenger.cd.L0(2131754998, null);
                                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                                    x1Var.R = L0;
                                    x1Var.T = org.telegram.messenger.cd.L0(2131754997, null);
                                    alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751599, null), new ng.d(22, g0Var2, tL_aiComposeTone2));
                                    alertDialog$Builder.d(-1);
                                    alertDialog$Builder.p();
                                    return;
                            }
                        }
                    }, org.telegram.messenger.cd.L0(2131754998, null), tL_aiComposeTone.creator, true);
                    F.Z();
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            case 1:
                View view = (View) obj;
                org.telegram.messenger.jj jjVar = ((jh.i) obj2).f10417b;
                return jh.c.d(view, (String) obj4, (String) obj3, jjVar.F0(), jjVar);
            case 2:
                tk0 tk0Var = (tk0) obj4;
                org.telegram.messenger.r20 r20Var = (org.telegram.messenger.r20) obj3;
                SparseIntArray sparseIntArray = (SparseIntArray) obj2;
                View view2 = (View) obj;
                try {
                    if (view2.getParent() != tk0Var) {
                        return Boolean.FALSE;
                    }
                    Boolean bool = (Boolean) r20Var.a(view2);
                    boolean booleanValue = bool.booleanValue();
                    s4.c1 T = tk0Var.T(view2);
                    if (T != null) {
                        sparseIntArray.put(T.f47901f, booleanValue ? 1 : 0);
                    }
                    return bool;
                } catch (Exception unused) {
                    return Boolean.FALSE;
                }
            default:
                vh.b4 b4Var = (vh.b4) obj4;
                boolean[] zArr = (boolean[]) obj3;
                vh.q3 q3Var = (vh.q3) obj2;
                org.telegram.ui.ActionBar.p2 p2Var = q3Var.f21589c;
                Integer num = (Integer) obj;
                vh.x3 x3Var = b4Var.A0;
                org.telegram.ui.ActionBar.x4 x4Var = b4Var.f50981p1;
                if (num.intValue() == 0) {
                    zArr[0] = false;
                    b4Var.I0(null, new qh.d(b4Var, 19));
                    return Boolean.TRUE;
                } else if (num.intValue() == 5) {
                    zArr[0] = false;
                    w7.c6.c(2131624117, 2131747318, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new String[]{"android.permission.ACCESS_COARSE_LOCATION"}, new org.telegram.ui.nc(10, new org.telegram.ui.nc(9, new rh.e3(5, b4Var, q3Var), true), true));
                    return Boolean.FALSE;
                } else if (num.intValue() == 2) {
                    q3Var.dismiss();
                    vh.o8 o8Var = ((vh.s7) b4Var).f51935j2;
                    o8Var.f51613c1.L.b(true);
                    o8Var.v();
                    o8Var.s(true);
                    o8Var.e(true);
                    return Boolean.TRUE;
                } else if (num.intValue() == 1) {
                    zArr[0] = false;
                    vh.f5 f5Var = new vh.f5(b4Var.getContext(), false, null, new ph.h1(b4Var, 26), new th.b());
                    f5Var.o(new vh.h3(b4Var, 2));
                    f5Var.show();
                    return Boolean.TRUE;
                } else if (num.intValue() == 3) {
                    b4Var.U1 = true;
                    b4Var.b0(b4Var.i0(true));
                    return Boolean.TRUE;
                } else if (num.intValue() == 4) {
                    if (!org.telegram.messenger.d20.i(b4Var.f50979o1).q()) {
                        try {
                            p2Var.performHapticFeedback(3);
                        } catch (Exception unused2) {
                        }
                        new cc(p2Var, x4Var).Q(2131624214, 36, org.telegram.messenger.i0.x2(org.telegram.messenger.cd.L0(2131744654, null), new vh.h3(b4Var, 1))).k(true);
                        return Boolean.FALSE;
                    }
                    int i11 = 0;
                    for (int i12 = 0; i12 < x3Var.getChildCount(); i12++) {
                        if (x3Var.getChildAt(i12) instanceof jg.v0) {
                            i11++;
                        }
                    }
                    if (i11 >= 3) {
                        new cc(p2Var, x4Var).I(2131624078, org.telegram.messenger.cd.L0(2131744657, null), org.telegram.messenger.cd.G(3, "StoryLinkLimitMessage", new Object[0])).k(true);
                        return Boolean.FALSE;
                    }
                    zArr[0] = false;
                    b4Var.H0(null);
                    q3Var.dismiss();
                    return Boolean.TRUE;
                } else {
                    return Boolean.FALSE;
                }
        }
    }
}
