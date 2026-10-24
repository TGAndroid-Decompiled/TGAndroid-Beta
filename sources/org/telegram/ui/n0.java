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
public final class n0 implements TextWatcher {
    public final int f39681a;
    public final Object f39682b;

    public n0(Object obj, int i10) {
        this.f39681a = i10;
        this.f39682b = obj;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.web.l lVar;
        String obj;
        String str;
        boolean z10;
        String str2;
        int i10;
        lt ltVar;
        boolean z11;
        String str3;
        Object obj2;
        String str4;
        boolean z12;
        String str5;
        lt ltVar2;
        String str6;
        switch (this.f39681a) {
            case 0:
                k4 k4Var = (k4) this.f39682b;
                if (k4Var.f38762h0.W && (lVar = k4Var.f38763i0) != null) {
                    if (editable == null) {
                        obj = null;
                    } else {
                        obj = editable.toString();
                    }
                    lVar.setInput(obj);
                    return;
                }
                return;
            case 1:
                return;
            case 2:
                ko koVar = (ko) this.f39682b;
                koVar.f38972r.n(5L, koVar.v.getText().toString(), null);
                ci.j4 j4Var = koVar.e;
                if (j4Var != null) {
                    j4Var.invalidate();
                    return;
                }
                return;
            case 3:
                ((yo) this.f39682b).W();
                return;
            case 4:
                cq cqVar = (cq) this.f39682b;
                dq dqVar = cqVar.e;
                if (!cqVar.d) {
                    dqVar.T = editable.toString();
                    s4.b1 K = dqVar.f36666b.K(dqVar.f36694v0);
                    if (K != null) {
                        dq.f0(dqVar, K.f46342a);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                return;
            case 6:
                p60 p60Var = (p60) this.f39682b;
                if (p60Var.f40356f.f27258r.length() != 0) {
                    n60 n60Var = p60Var.v;
                    boolean z13 = n60Var.f39739n;
                    if (!z13) {
                        p60Var.T = true;
                        p60Var.S = true;
                        if (!z13) {
                            n60Var.f39739n = true;
                            n60Var.l();
                        }
                        p60Var.f40364n.setFastScrollVisible(false);
                        p60Var.f40364n.setVerticalScrollBarEnabled(true);
                    }
                    p60Var.v.L(p60Var.f40356f.f27258r.getText().toString());
                    p60Var.f40371s.e(true, false);
                    return;
                }
                p60Var.T = false;
                p60Var.S = false;
                n60 n60Var2 = p60Var.v;
                if (n60Var2.f39739n) {
                    n60Var2.f39739n = false;
                    n60Var2.l();
                }
                p60Var.v.L(null);
                p60Var.f40364n.setFastScrollVisible(true);
                p60Var.f40364n.setVerticalScrollBarEnabled(false);
                p60Var.q0(0);
                return;
            case 7:
            case 8:
            case 9:
                return;
            case 10:
                gg0 gg0Var = (gg0) this.f39682b;
                HashMap hashMap = gg0Var.H;
                ArrayList arrayList = gg0Var.G;
                oj0 oj0Var = gg0Var.f37561a;
                dg0 dg0Var = gg0Var.f37563b;
                if (!gg0Var.K) {
                    int i11 = 1;
                    gg0Var.K = true;
                    int i12 = 0;
                    String d = jf.b.d(oj0Var.getText().toString(), false);
                    oj0Var.setText(d);
                    String str7 = null;
                    if (d.length() == 0) {
                        gg0Var.setCountryButtonText(null);
                        dg0Var.setHintText((String) null);
                        gg0Var.E = 1;
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
                                        Object obj3 = (lt) si.o0.g(i11, list);
                                        if (string != null) {
                                            int size = arrayList.size();
                                            int i14 = i12;
                                            while (true) {
                                                if (i14 < size) {
                                                    Object obj4 = arrayList.get(i14);
                                                    i14++;
                                                    lt ltVar3 = (lt) obj4;
                                                    if (Objects.equals(ltVar3.d, string)) {
                                                        obj3 = ltVar3;
                                                    }
                                                }
                                            }
                                        }
                                        obj2 = obj3;
                                    } else {
                                        obj2 = (lt) list.get(i12);
                                    }
                                    if (obj2 != null) {
                                        str = d.substring(i13) + dg0Var.getText().toString();
                                        oj0Var.setText(substring);
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
                                str = d.substring(1) + dg0Var.getText().toString();
                                d = d.substring(0, 1);
                                oj0Var.setText(d);
                            }
                        } else {
                            str = null;
                            z10 = false;
                        }
                        int size2 = arrayList.size();
                        lt ltVar4 = null;
                        int i15 = 0;
                        int i16 = 0;
                        while (i16 < size2) {
                            Object obj5 = arrayList.get(i16);
                            i16++;
                            lt ltVar5 = (lt) obj5;
                            if (ltVar5.f39377c.startsWith(d)) {
                                int i17 = i15 + 1;
                                str3 = str;
                                if (ltVar5.f39377c.equals(d)) {
                                    if (ltVar4 == null || !ltVar4.f39377c.equals(ltVar5.f39377c)) {
                                        i15 = i17;
                                    }
                                    ltVar4 = ltVar5;
                                } else {
                                    i15 = i17;
                                }
                            } else {
                                str3 = str;
                            }
                            str = str3;
                        }
                        String str8 = str;
                        if (i15 == 1 && ltVar4 != null && str8 == null) {
                            str2 = d.substring(ltVar4.f39377c.length()) + dg0Var.getText().toString();
                            d = ltVar4.f39377c;
                            oj0Var.setText(d);
                        } else {
                            str2 = str8;
                        }
                        List list2 = (List) hashMap.get(d);
                        if (list2 == null) {
                            i10 = 0;
                            ltVar = null;
                        } else if (list2.size() > 1) {
                            String string2 = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + d, null);
                            lt ltVar6 = (lt) si.o0.g(1, list2);
                            if (string2 != null) {
                                int size3 = arrayList.size();
                                int i18 = 0;
                                while (i18 < size3) {
                                    Object obj6 = arrayList.get(i18);
                                    i18++;
                                    ltVar = (lt) obj6;
                                    if (Objects.equals(ltVar.d, string2)) {
                                        i10 = 0;
                                    }
                                }
                            }
                            ltVar = ltVar6;
                            i10 = 0;
                        } else {
                            i10 = 0;
                            ltVar = (lt) list2.get(0);
                        }
                        if (ltVar == null) {
                            gg0Var.setCountryButtonText(null);
                            dg0Var.setHintText((String) null);
                            gg0Var.E = 2;
                        } else {
                            gg0Var.J = true;
                            gg0Var.F = ltVar;
                            gg0Var.s(d, ltVar);
                            gg0Var.E = i10;
                        }
                        if (!z10) {
                            oj0Var.setSelection(oj0Var.getText().length());
                        }
                        if (str2 != null) {
                            dg0Var.requestFocus();
                            dg0Var.setText(str2);
                            dg0Var.setSelection(dg0Var.length());
                        }
                        z11 = false;
                    }
                    gg0Var.K = z11;
                    return;
                }
                return;
            case 11:
                qj0 qj0Var = (qj0) this.f39682b;
                HashMap hashMap2 = qj0Var.f40857w;
                ArrayList arrayList2 = qj0Var.v;
                if (!qj0Var.f40859y) {
                    qj0Var.f40859y = true;
                    String d10 = jf.b.d(qj0Var.N.getText().toString(), false);
                    qj0Var.N.setText(d10);
                    String str9 = null;
                    if (d10.length() == 0) {
                        qj0Var.v(null);
                        qj0Var.P.setHintText((String) null);
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
                                            Object obj8 = (lt) si.o0.g(1, list3);
                                            if (string3 != null) {
                                                int size4 = arrayList2.size();
                                                int i20 = 0;
                                                while (true) {
                                                    if (i20 < size4) {
                                                        Object obj9 = arrayList2.get(i20);
                                                        i20++;
                                                        lt ltVar7 = (lt) obj9;
                                                        if (Objects.equals(ltVar7.d, string3)) {
                                                            obj8 = ltVar7;
                                                        }
                                                    }
                                                }
                                            }
                                            obj7 = obj8;
                                        } else {
                                            obj7 = (lt) list3.get(0);
                                        }
                                    }
                                    if (obj7 != null) {
                                        str5 = d10.substring(i19) + qj0Var.P.getText().toString();
                                        qj0Var.N.setText(str4);
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
                                str5 = str4.substring(1) + qj0Var.P.getText().toString();
                                oj0 oj0Var2 = qj0Var.N;
                                str4 = str4.substring(0, 1);
                                oj0Var2.setText(str4);
                            }
                        } else {
                            str4 = d10;
                            z12 = false;
                            str5 = null;
                        }
                        int size5 = arrayList2.size();
                        int i21 = 0;
                        int i22 = 0;
                        lt ltVar8 = null;
                        while (i22 < size5) {
                            Object obj10 = arrayList2.get(i22);
                            i22++;
                            lt ltVar9 = (lt) obj10;
                            if (ltVar9.f39377c.startsWith(str4)) {
                                i21++;
                                if (ltVar9.f39377c.equals(str4)) {
                                    ltVar8 = ltVar9;
                                }
                            }
                        }
                        if (i21 == 1 && ltVar8 != null && str5 == null) {
                            str5 = str4.substring(ltVar8.f39377c.length()) + qj0Var.P.getText().toString();
                            oj0 oj0Var3 = qj0Var.N;
                            String str10 = ltVar8.f39377c;
                            oj0Var3.setText(str10);
                            str4 = str10;
                        }
                        List list4 = (List) hashMap2.get(str4);
                        if (list4 == null) {
                            ltVar2 = null;
                        } else if (list4.size() > 1) {
                            String string4 = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + str4, null);
                            lt ltVar10 = (lt) si.o0.g(1, list4);
                            if (string4 != null) {
                                int size6 = arrayList2.size();
                                int i23 = 0;
                                while (i23 < size6) {
                                    Object obj11 = arrayList2.get(i23);
                                    i23++;
                                    lt ltVar11 = (lt) obj11;
                                    if (Objects.equals(ltVar11.d, string4)) {
                                        ltVar2 = ltVar11;
                                    }
                                }
                            }
                            ltVar2 = ltVar10;
                        } else {
                            ltVar2 = (lt) list4.get(0);
                        }
                        if (ltVar2 != null) {
                            qj0Var.F = true;
                            qj0Var.w(str4, ltVar2);
                        } else {
                            qj0Var.v(null);
                            qj0Var.P.setHintText((String) null);
                        }
                        if (!z12) {
                            oj0 oj0Var4 = qj0Var.N;
                            oj0Var4.setSelection(oj0Var4.getText().length());
                        }
                        if (str5 != null && str5.length() != 0) {
                            qj0Var.P.requestFocus();
                            qj0Var.P.setText(str5);
                            oj0 oj0Var5 = qj0Var.P;
                            oj0Var5.setSelection(oj0Var5.length());
                        }
                    }
                    qj0Var.f40859y = false;
                    qj0.s(qj0Var);
                    return;
                }
                return;
            case 12:
                zm0 zm0Var = (zm0) this.f39682b;
                if (!zm0Var.Z0 && zm0Var.T0 != 0 && zm0Var.Y[0].length() == zm0Var.T0) {
                    zm0Var.L.callOnClick();
                    return;
                }
                return;
            case 13:
                ho0 ho0Var = (ho0) this.f39682b;
                if (ho0Var.f37921c0 != 0 && editable.length() == ho0Var.f37921c0) {
                    ho0Var.A0(false);
                    return;
                }
                return;
            case 14:
                kq0 kq0Var = ((lq0) this.f39682b).f39357s0;
                if (kq0Var != null) {
                    kq0Var.b(editable);
                    return;
                }
                return;
            case 15:
                r41 r41Var = (r41) this.f39682b;
                org.telegram.ui.Cells.c6 c6Var = r41Var.h;
                if (c6Var.getText() != null && AndroidUtilities.trim(c6Var.getText(), null).length() != 0) {
                    str6 = c6Var.getText().toString();
                } else {
                    str6 = null;
                }
                r41Var.F.v(str6, true, true);
                o51 o51Var = r41Var.f40339n;
                if (o51Var != null) {
                    o51Var.L1(null);
                    r41Var.f40339n.M1(TextUtils.isEmpty(str6), true);
                }
                if (c6Var != null) {
                    c6Var.clearAnimation();
                    c6Var.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.zr.h).start();
                }
                r41Var.c(false);
                return;
            case 16:
                String trim = editable.toString().trim();
                sd1 sd1Var = (sd1) this.f39682b;
                String str11 = sd1Var.f41354n;
                if (trim.length() > 0) {
                    sd1Var.f41354n = trim.substring(0, 1).toUpperCase();
                } else {
                    sd1Var.f41354n = "";
                }
                if (!str11.equals(sd1Var.f41354n)) {
                    org.telegram.ui.Components.e90 e90Var = new org.telegram.ui.Components.e90(1, null);
                    e90Var.a(sd1Var.f41354n);
                    org.telegram.ui.Components.qm0 qm0Var = sd1Var.v;
                    if (qm0Var != null) {
                        qm0Var.b(e90Var, true);
                        return;
                    }
                    return;
                }
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f39682b;
                gf1 gf1Var = twoStepVerificationActivity.V;
                if (twoStepVerificationActivity.U) {
                    AndroidUtilities.cancelRunOnUIThread(gf1Var);
                    gf1Var.run();
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z10;
        int i13 = this.f39681a;
        Object obj = this.f39682b;
        switch (i13) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                return;
            case 5:
                qr qrVar = (qr) obj;
                if (charSequence.length() != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                qrVar.f42806x = z10;
                qrVar.v = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                qrVar.F = ofFloat;
                ofFloat.addUpdateListener(new d3(qrVar, 9));
                if (!qrVar.f42806x) {
                    org.telegram.messenger.tl.l(1.5f, qrVar.F);
                    qrVar.F.setDuration(350L);
                } else {
                    qrVar.F.setDuration(220L);
                }
                qrVar.F.start();
                qrVar.hideActionMode();
                return;
            case 6:
                return;
            case 7:
                qd0 qd0Var = (qd0) obj;
                jd0 jd0Var = qd0Var.S;
                if (qd0Var.R) {
                    qd0Var.removeCallbacks(jd0Var);
                    jd0Var.run();
                    return;
                }
                return;
            case 8:
                le0 le0Var = (le0) obj;
                je0 je0Var = le0Var.f39223x;
                if (le0Var.f39222w) {
                    le0Var.removeCallbacks(je0Var);
                    je0Var.run();
                    return;
                }
                return;
            case 9:
                lf0 lf0Var = (lf0) obj;
                ye0 ye0Var = lf0Var.f39254t0;
                if (lf0Var.f39253s0) {
                    lf0Var.removeCallbacks(ye0Var);
                    ye0Var.run();
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
        switch (this.f39681a) {
            case 0:
                return;
            case 1:
                md mdVar = (md) this.f39682b;
                mdVar.e0(mdVar.f39564x.getText().toString());
                return;
            case 2:
                return;
            case 3:
                yo yoVar = (yo) this.f39682b;
                if (!yoVar.f43916n0) {
                    String obj = yoVar.f43899a.getText().toString();
                    pa paVar = yoVar.P;
                    if (paVar != null) {
                        paVar.b(obj);
                    }
                    yoVar.X(obj);
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
