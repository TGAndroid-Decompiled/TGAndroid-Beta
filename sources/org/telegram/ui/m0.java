package org.telegram.ui;

import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class m0 implements TextWatcher {
    public final int f39876a;
    public final Object f39877b;

    public m0(Object obj, int i10) {
        this.f39876a = i10;
        this.f39877b = obj;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.web.k kVar;
        String obj;
        String str;
        boolean z10;
        String str2;
        int i10;
        xt xtVar;
        boolean z11;
        String str3;
        Object obj2;
        String str4;
        boolean z12;
        String str5;
        xt xtVar2;
        String str6;
        switch (this.f39876a) {
            case 0:
                i4 i4Var = (i4) this.f39877b;
                if (i4Var.f38652h0.W && (kVar = i4Var.f38653i0) != null) {
                    if (editable == null) {
                        obj = null;
                    } else {
                        obj = editable.toString();
                    }
                    kVar.setInput(obj);
                    return;
                }
                return;
            case 1:
                return;
            case 2:
                xo xoVar = (xo) this.f39877b;
                xoVar.f44074r.n(5L, xoVar.v.getText().toString(), null);
                ai.z5 z5Var = xoVar.f44059e;
                if (z5Var != null) {
                    z5Var.invalidate();
                    return;
                }
                return;
            case 3:
                ((lp) this.f39877b).V();
                return;
            case 4:
                pq pqVar = (pq) this.f39877b;
                qq qqVar = pqVar.f41069e;
                if (!pqVar.d) {
                    qqVar.S = editable.toString();
                    s4.d1 K = qqVar.f41390b.K(qqVar.f41417u0);
                    if (K != null) {
                        qq.f0(qqVar, K.f47897a);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                return;
            case 6:
                e70 e70Var = (e70) this.f39877b;
                if (e70Var.f37004f.f31362r.length() != 0) {
                    c70 c70Var = e70Var.v;
                    boolean z13 = c70Var.f36349n;
                    if (!z13) {
                        e70Var.T = true;
                        e70Var.S = true;
                        if (!z13) {
                            c70Var.f36349n = true;
                            c70Var.l();
                        }
                        e70Var.f37012n.setFastScrollVisible(false);
                        e70Var.f37012n.setVerticalScrollBarEnabled(true);
                    }
                    e70Var.v.L(e70Var.f37004f.f31362r.getText().toString());
                    e70Var.f37019s.e(true, false);
                    return;
                }
                e70Var.T = false;
                e70Var.S = false;
                c70 c70Var2 = e70Var.v;
                if (c70Var2.f36349n) {
                    c70Var2.f36349n = false;
                    c70Var2.l();
                }
                e70Var.v.L(null);
                e70Var.f37012n.setFastScrollVisible(true);
                e70Var.f37012n.setVerticalScrollBarEnabled(false);
                e70Var.q0(0);
                return;
            case 7:
            case 8:
            case 9:
                return;
            case 10:
                wg0 wg0Var = (wg0) this.f39877b;
                HashMap hashMap = wg0Var.F;
                ArrayList arrayList = wg0Var.E;
                ck0 ck0Var = wg0Var.f43517a;
                tg0 tg0Var = wg0Var.f43518b;
                if (!wg0Var.I) {
                    int i11 = 1;
                    wg0Var.I = true;
                    int i12 = 0;
                    String d = hf.b.d(ck0Var.getText().toString(), false);
                    ck0Var.setText(d);
                    String str7 = null;
                    if (d.length() == 0) {
                        wg0Var.setCountryButtonText(null);
                        tg0Var.setHintText((String) null);
                        wg0Var.f43526x = 1;
                        z11 = false;
                    } else {
                        int i13 = 4;
                        if (d.length() > 4) {
                            while (true) {
                                if (i13 >= i11) {
                                    String substring = d.substring(i12, i13);
                                    List list = (List) hashMap.get(substring);
                                    if (list == null) {
                                        obj2 = str7;
                                    } else if (list.size() > i11) {
                                        String string = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + substring, str7);
                                        Object obj3 = (xt) sc.v.h(i11, list);
                                        if (string != null) {
                                            int size = arrayList.size();
                                            int i14 = i12;
                                            while (true) {
                                                if (i14 < size) {
                                                    Object obj4 = arrayList.get(i14);
                                                    i14++;
                                                    xt xtVar3 = (xt) obj4;
                                                    if (Objects.equals(xtVar3.d, string)) {
                                                        obj3 = xtVar3;
                                                    }
                                                }
                                            }
                                        }
                                        obj2 = obj3;
                                    } else {
                                        obj2 = (xt) list.get(i12);
                                    }
                                    if (obj2 != null) {
                                        str = d.substring(i13) + tg0Var.getText().toString();
                                        ck0Var.setText(substring);
                                        d = substring;
                                        z10 = true;
                                    } else {
                                        i13--;
                                        i11 = 1;
                                        i12 = 0;
                                        str7 = null;
                                    }
                                } else {
                                    str = null;
                                    z10 = false;
                                }
                            }
                            if (!z10) {
                                str = d.substring(1) + tg0Var.getText().toString();
                                d = d.substring(0, 1);
                                ck0Var.setText(d);
                            }
                        } else {
                            str = null;
                            z10 = false;
                        }
                        int size2 = arrayList.size();
                        xt xtVar4 = null;
                        int i15 = 0;
                        int i16 = 0;
                        while (i16 < size2) {
                            Object obj5 = arrayList.get(i16);
                            i16++;
                            xt xtVar5 = (xt) obj5;
                            if (xtVar5.f44163c.startsWith(d)) {
                                int i17 = i15 + 1;
                                str3 = str;
                                if (xtVar5.f44163c.equals(d)) {
                                    if (xtVar4 == null || !xtVar4.f44163c.equals(xtVar5.f44163c)) {
                                        i15 = i17;
                                    }
                                    xtVar4 = xtVar5;
                                } else {
                                    i15 = i17;
                                }
                            } else {
                                str3 = str;
                            }
                            str = str3;
                        }
                        String str8 = str;
                        if (i15 == 1 && xtVar4 != null && str8 == null) {
                            str2 = d.substring(xtVar4.f44163c.length()) + tg0Var.getText().toString();
                            d = xtVar4.f44163c;
                            ck0Var.setText(d);
                        } else {
                            str2 = str8;
                        }
                        List list2 = (List) hashMap.get(d);
                        if (list2 == null) {
                            i10 = 0;
                            xtVar = null;
                        } else if (list2.size() > 1) {
                            String string2 = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + d, null);
                            xt xtVar6 = (xt) sc.v.h(1, list2);
                            if (string2 != null) {
                                int size3 = arrayList.size();
                                int i18 = 0;
                                while (i18 < size3) {
                                    Object obj6 = arrayList.get(i18);
                                    i18++;
                                    xtVar = (xt) obj6;
                                    if (Objects.equals(xtVar.d, string2)) {
                                        i10 = 0;
                                    }
                                }
                            }
                            xtVar = xtVar6;
                            i10 = 0;
                        } else {
                            i10 = 0;
                            xtVar = (xt) list2.get(0);
                        }
                        if (xtVar == null) {
                            wg0Var.setCountryButtonText(null);
                            tg0Var.setHintText((String) null);
                            wg0Var.f43526x = 2;
                        } else {
                            wg0Var.H = true;
                            wg0Var.f43527y = xtVar;
                            wg0Var.t(d, xtVar);
                            wg0Var.f43526x = i10;
                        }
                        if (!z10) {
                            ck0Var.setSelection(ck0Var.getText().length());
                        }
                        if (str2 != null) {
                            tg0Var.requestFocus();
                            tg0Var.setText(str2);
                            tg0Var.setSelection(tg0Var.length());
                        }
                        z11 = false;
                    }
                    wg0Var.I = z11;
                    return;
                }
                return;
            case 11:
                ek0 ek0Var = (ek0) this.f39877b;
                HashMap hashMap2 = ek0Var.f37180x;
                ArrayList arrayList2 = ek0Var.f37179w;
                if (!ek0Var.E) {
                    ek0Var.E = true;
                    String d10 = hf.b.d(ek0Var.O.getText().toString(), false);
                    ek0Var.O.setText(d10);
                    String str9 = null;
                    if (d10.length() == 0) {
                        ek0Var.v(null);
                        ek0Var.Q.setHintText((String) null);
                    } else {
                        int i19 = 4;
                        if (d10.length() > 4) {
                            while (true) {
                                if (i19 >= 1) {
                                    str4 = d10.substring(0, i19);
                                    List list3 = (List) hashMap2.get(str4);
                                    Object obj7 = str9;
                                    if (list3 != null) {
                                        if (list3.size() > 1) {
                                            String string3 = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + str4, str9);
                                            Object obj8 = (xt) sc.v.h(1, list3);
                                            if (string3 != null) {
                                                int size4 = arrayList2.size();
                                                int i20 = 0;
                                                while (true) {
                                                    if (i20 < size4) {
                                                        Object obj9 = arrayList2.get(i20);
                                                        i20++;
                                                        xt xtVar7 = (xt) obj9;
                                                        if (Objects.equals(xtVar7.d, string3)) {
                                                            obj8 = xtVar7;
                                                        }
                                                    }
                                                }
                                            }
                                            obj7 = obj8;
                                        } else {
                                            obj7 = (xt) list3.get(0);
                                        }
                                    }
                                    if (obj7 != null) {
                                        str5 = d10.substring(i19) + ek0Var.Q.getText().toString();
                                        ek0Var.O.setText(str4);
                                        z12 = true;
                                    } else {
                                        i19--;
                                        str9 = null;
                                    }
                                } else {
                                    str4 = d10;
                                    z12 = false;
                                    str5 = null;
                                }
                            }
                            if (!z12) {
                                str5 = str4.substring(1) + ek0Var.Q.getText().toString();
                                ck0 ck0Var2 = ek0Var.O;
                                str4 = str4.substring(0, 1);
                                ck0Var2.setText(str4);
                            }
                        } else {
                            str4 = d10;
                            z12 = false;
                            str5 = null;
                        }
                        int size5 = arrayList2.size();
                        int i21 = 0;
                        int i22 = 0;
                        xt xtVar8 = null;
                        while (i22 < size5) {
                            Object obj10 = arrayList2.get(i22);
                            i22++;
                            xt xtVar9 = (xt) obj10;
                            if (xtVar9.f44163c.startsWith(str4)) {
                                i21++;
                                if (xtVar9.f44163c.equals(str4)) {
                                    xtVar8 = xtVar9;
                                }
                            }
                        }
                        if (i21 == 1 && xtVar8 != null && str5 == null) {
                            str5 = str4.substring(xtVar8.f44163c.length()) + ek0Var.Q.getText().toString();
                            ck0 ck0Var3 = ek0Var.O;
                            String str10 = xtVar8.f44163c;
                            ck0Var3.setText(str10);
                            str4 = str10;
                        }
                        List list4 = (List) hashMap2.get(str4);
                        if (list4 == null) {
                            xtVar2 = null;
                        } else if (list4.size() > 1) {
                            String string4 = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + str4, null);
                            xt xtVar10 = (xt) sc.v.h(1, list4);
                            if (string4 != null) {
                                int size6 = arrayList2.size();
                                int i23 = 0;
                                while (i23 < size6) {
                                    Object obj11 = arrayList2.get(i23);
                                    i23++;
                                    xt xtVar11 = (xt) obj11;
                                    if (Objects.equals(xtVar11.d, string4)) {
                                        xtVar2 = xtVar11;
                                    }
                                }
                            }
                            xtVar2 = xtVar10;
                        } else {
                            xtVar2 = (xt) list4.get(0);
                        }
                        if (xtVar2 != null) {
                            ek0Var.G = true;
                            ek0Var.w(str4, xtVar2);
                        } else {
                            ek0Var.v(null);
                            ek0Var.Q.setHintText((String) null);
                        }
                        if (!z12) {
                            ck0 ck0Var4 = ek0Var.O;
                            ck0Var4.setSelection(ck0Var4.getText().length());
                        }
                        if (str5 != null && str5.length() != 0) {
                            ek0Var.Q.requestFocus();
                            ek0Var.Q.setText(str5);
                            ck0 ck0Var5 = ek0Var.Q;
                            ck0Var5.setSelection(ck0Var5.length());
                        }
                    }
                    ek0Var.E = false;
                    ek0.s(ek0Var);
                    return;
                }
                return;
            case 12:
                pn0 pn0Var = (pn0) this.f39877b;
                if (!pn0Var.Z0 && pn0Var.T0 != 0 && pn0Var.Y[0].length() == pn0Var.T0) {
                    pn0Var.L.callOnClick();
                    return;
                }
                return;
            case 13:
                xo0 xo0Var = (xo0) this.f39877b;
                if (xo0Var.f44097c0 != 0 && editable.length() == xo0Var.f44097c0) {
                    xo0Var.A0(false);
                    return;
                }
                return;
            case 14:
                cr0 cr0Var = ((dr0) this.f39877b).f36894s0;
                if (cr0Var != null) {
                    cr0Var.b(editable);
                    return;
                }
                return;
            case 15:
                e61 e61Var = (e61) this.f39877b;
                org.telegram.ui.Cells.c6 c6Var = e61Var.h;
                if (c6Var.getText() != null && AndroidUtilities.trim(c6Var.getText(), null).length() != 0) {
                    str6 = c6Var.getText().toString();
                } else {
                    str6 = null;
                }
                e61Var.f36365y.v(str6, true, true);
                b71 b71Var = e61Var.f36360n;
                if (b71Var != null) {
                    b71Var.G1(null);
                    e61Var.f36360n.H1(TextUtils.isEmpty(str6), true);
                }
                if (c6Var != null) {
                    c6Var.clearAnimation();
                    c6Var.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.js.h).start();
                }
                e61Var.c(false);
                return;
            case 16:
                String trim = editable.toString().trim();
                df1 df1Var = (df1) this.f39877b;
                String str11 = df1Var.f36792n;
                if (trim.length() > 0) {
                    df1Var.f36792n = trim.substring(0, 1).toUpperCase();
                } else {
                    df1Var.f36792n = "";
                }
                if (!str11.equals(df1Var.f36792n)) {
                    org.telegram.ui.Components.r90 r90Var = new org.telegram.ui.Components.r90(1, null);
                    r90Var.a(df1Var.f36792n);
                    org.telegram.ui.Components.bn0 bn0Var = df1Var.v;
                    if (bn0Var != null) {
                        bn0Var.b(r90Var, true);
                        return;
                    }
                    return;
                }
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f39877b;
                qg1 qg1Var = twoStepVerificationActivity.V;
                if (twoStepVerificationActivity.U) {
                    AndroidUtilities.cancelRunOnUIThread(qg1Var);
                    qg1Var.run();
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z10;
        int i13 = this.f39876a;
        Object obj = this.f39877b;
        switch (i13) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                return;
            case 5:
                ds dsVar = (ds) obj;
                if (charSequence.length() != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                dsVar.f38510x = z10;
                dsVar.v = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                dsVar.F = ofFloat;
                ofFloat.addUpdateListener(new c3(dsVar, 9));
                if (!dsVar.f38510x) {
                    org.telegram.messenger.am.l(1.5f, dsVar.F);
                    dsVar.F.setDuration(350L);
                } else {
                    dsVar.F.setDuration(220L);
                }
                dsVar.F.start();
                dsVar.hideActionMode();
                return;
            case 6:
                return;
            case 7:
                ge0 ge0Var = (ge0) obj;
                zd0 zd0Var = ge0Var.S;
                if (ge0Var.R) {
                    ge0Var.removeCallbacks(zd0Var);
                    zd0Var.run();
                    return;
                }
                return;
            case 8:
                af0 af0Var = (af0) obj;
                ye0 ye0Var = af0Var.f35791x;
                if (af0Var.f35790w) {
                    af0Var.removeCallbacks(ye0Var);
                    ye0Var.run();
                    return;
                }
                return;
            case 9:
                zf0 zf0Var = (zf0) obj;
                mf0 mf0Var = zf0Var.f44836r0;
                if (zf0Var.f44834q0) {
                    zf0Var.removeCallbacks(mf0Var);
                    mf0Var.run();
                    return;
                }
                return;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            default:
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f39876a) {
            case 0:
                return;
            case 1:
                qd qdVar = (qd) this.f39877b;
                qdVar.d0(qdVar.f41303w.getText().toString());
                return;
            case 2:
                return;
            case 3:
                lp lpVar = (lp) this.f39877b;
                if (!lpVar.m0) {
                    String obj = lpVar.f39800a.getText().toString();
                    ra raVar = lpVar.O;
                    if (raVar != null) {
                        raVar.b(obj);
                    }
                    lpVar.W(obj);
                    return;
                }
                return;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            default:
                return;
        }
    }

    private final void a(Editable editable) {
    }

    private final void b(Editable editable) {
    }

    private final void c(Editable editable) {
    }

    private final void d(Editable editable) {
    }

    private final void e(Editable editable) {
    }

    private final void A(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void B(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void C(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void D(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void E(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void F(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void G(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void H(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void I(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void f(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void g(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void h(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void i(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void j(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void k(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void l(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void m(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void n(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void o(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void p(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void q(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void r(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void s(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void t(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void u(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void v(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void w(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void x(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void y(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void z(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
