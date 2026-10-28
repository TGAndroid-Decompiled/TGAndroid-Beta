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
    public final int f41286a;
    public final Object f41287b;

    public m0(Object obj, int i10) {
        this.f41286a = i10;
        this.f41287b = obj;
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
        switch (this.f41286a) {
            case 0:
                j4 j4Var = (j4) this.f41287b;
                if (j4Var.f40402h0.W && (lVar = j4Var.f40403i0) != null) {
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
                oo ooVar = (oo) this.f41287b;
                ooVar.f42150r.n(5L, ooVar.v.getText().toString(), null);
                di.k4 k4Var = ooVar.e;
                if (k4Var != null) {
                    k4Var.invalidate();
                    return;
                }
                return;
            case 3:
                ((cp) this.f41287b).X();
                return;
            case 4:
                hq hqVar = (hq) this.f41287b;
                iq iqVar = hqVar.e;
                if (!hqVar.d) {
                    iqVar.S = editable.toString();
                    s4.e1 K = iqVar.f40228b.K(iqVar.f40253u0);
                    if (K != null) {
                        iq.g0(iqVar, K.f47773a);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                return;
            case 6:
                t60 t60Var = (t60) this.f41287b;
                if (t60Var.f43505f.f30347r.length() != 0) {
                    r60 r60Var = t60Var.v;
                    boolean z13 = r60Var.f42863n;
                    if (!z13) {
                        t60Var.T = true;
                        t60Var.S = true;
                        if (!z13) {
                            r60Var.f42863n = true;
                            r60Var.l();
                        }
                        t60Var.f43513n.setFastScrollVisible(false);
                        t60Var.f43513n.setVerticalScrollBarEnabled(true);
                    }
                    t60Var.v.L(t60Var.f43505f.f30347r.getText().toString());
                    t60Var.f43520s.e(true, false);
                    return;
                }
                t60Var.T = false;
                t60Var.S = false;
                r60 r60Var2 = t60Var.v;
                if (r60Var2.f42863n) {
                    r60Var2.f42863n = false;
                    r60Var2.l();
                }
                t60Var.v.L(null);
                t60Var.f43513n.setFastScrollVisible(true);
                t60Var.f43513n.setVerticalScrollBarEnabled(false);
                t60Var.r0(0);
                return;
            case 7:
            case 8:
            case 9:
                return;
            case 10:
                hg0 hg0Var = (hg0) this.f41287b;
                HashMap hashMap = hg0Var.H;
                ArrayList arrayList = hg0Var.G;
                oj0 oj0Var = hg0Var.f39881a;
                eg0 eg0Var = hg0Var.f39883b;
                if (!hg0Var.K) {
                    int i11 = 1;
                    hg0Var.K = true;
                    int i12 = 0;
                    String d = kf.b.d(oj0Var.getText().toString(), false);
                    oj0Var.setText(d);
                    String str7 = null;
                    if (d.length() == 0) {
                        hg0Var.setCountryButtonText(null);
                        eg0Var.setHintText((String) null);
                        hg0Var.E = 1;
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
                                        Object obj3 = (lt) org.telegram.ui.Components.b10.h(i11, list);
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
                                        str = d.substring(i13) + eg0Var.getText().toString();
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
                                str = d.substring(1) + eg0Var.getText().toString();
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
                            if (ltVar5.f41260c.startsWith(d)) {
                                int i17 = i15 + 1;
                                str3 = str;
                                if (ltVar5.f41260c.equals(d)) {
                                    if (ltVar4 == null || !ltVar4.f41260c.equals(ltVar5.f41260c)) {
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
                            str2 = d.substring(ltVar4.f41260c.length()) + eg0Var.getText().toString();
                            d = ltVar4.f41260c;
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
                            lt ltVar6 = (lt) org.telegram.ui.Components.b10.h(1, list2);
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
                            hg0Var.setCountryButtonText(null);
                            eg0Var.setHintText((String) null);
                            hg0Var.E = 2;
                        } else {
                            hg0Var.J = true;
                            hg0Var.F = ltVar;
                            hg0Var.s(d, ltVar);
                            hg0Var.E = i10;
                        }
                        if (!z10) {
                            oj0Var.setSelection(oj0Var.getText().length());
                        }
                        if (str2 != null) {
                            eg0Var.requestFocus();
                            eg0Var.setText(str2);
                            eg0Var.setSelection(eg0Var.length());
                        }
                        z11 = false;
                    }
                    hg0Var.K = z11;
                    return;
                }
                return;
            case 11:
                qj0 qj0Var = (qj0) this.f41287b;
                HashMap hashMap2 = qj0Var.f42735w;
                ArrayList arrayList2 = qj0Var.v;
                if (!qj0Var.f42737y) {
                    qj0Var.f42737y = true;
                    String d10 = kf.b.d(qj0Var.N.getText().toString(), false);
                    qj0Var.N.setText(d10);
                    String str9 = null;
                    if (d10.length() == 0) {
                        qj0Var.u(null);
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
                                            Object obj8 = (lt) org.telegram.ui.Components.b10.h(1, list3);
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
                            if (ltVar9.f41260c.startsWith(str4)) {
                                i21++;
                                if (ltVar9.f41260c.equals(str4)) {
                                    ltVar8 = ltVar9;
                                }
                            }
                        }
                        if (i21 == 1 && ltVar8 != null && str5 == null) {
                            str5 = str4.substring(ltVar8.f41260c.length()) + qj0Var.P.getText().toString();
                            oj0 oj0Var3 = qj0Var.N;
                            String str10 = ltVar8.f41260c;
                            oj0Var3.setText(str10);
                            str4 = str10;
                        }
                        List list4 = (List) hashMap2.get(str4);
                        if (list4 == null) {
                            ltVar2 = null;
                        } else if (list4.size() > 1) {
                            String string4 = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + str4, null);
                            lt ltVar10 = (lt) org.telegram.ui.Components.b10.h(1, list4);
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
                            qj0Var.v(str4, ltVar2);
                        } else {
                            qj0Var.u(null);
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
                    qj0Var.f42737y = false;
                    qj0.r(qj0Var);
                    return;
                }
                return;
            case 12:
                kn0 kn0Var = (kn0) this.f41287b;
                if (!kn0Var.Z0 && kn0Var.T0 != 0 && kn0Var.Y[0].length() == kn0Var.T0) {
                    kn0Var.L.callOnClick();
                    return;
                }
                return;
            case 13:
                ro0 ro0Var = (ro0) this.f41287b;
                if (ro0Var.f43104c0 != 0 && editable.length() == ro0Var.f43104c0) {
                    ro0Var.B0(false);
                    return;
                }
                return;
            case 14:
                sq0 sq0Var = ((tq0) this.f41287b).f43752s0;
                if (sq0Var != null) {
                    sq0Var.b(editable);
                    return;
                }
                return;
            case 15:
                w41 w41Var = (w41) this.f41287b;
                org.telegram.ui.Cells.g6 g6Var = w41Var.h;
                if (g6Var.getText() != null && AndroidUtilities.trim(g6Var.getText(), null).length() != 0) {
                    str6 = g6Var.getText().toString();
                } else {
                    str6 = null;
                }
                w41Var.F.v(str6, true, true);
                t51 t51Var = w41Var.f43883n;
                if (t51Var != null) {
                    t51Var.L1(null);
                    w41Var.f43883n.M1(TextUtils.isEmpty(str6), true);
                }
                if (g6Var != null) {
                    g6Var.clearAnimation();
                    g6Var.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.ds.h).start();
                }
                w41Var.c(false);
                return;
            case 16:
                String trim = editable.toString().trim();
                yd1 yd1Var = (yd1) this.f41287b;
                String str11 = yd1Var.f45973n;
                if (trim.length() > 0) {
                    yd1Var.f45973n = trim.substring(0, 1).toUpperCase();
                } else {
                    yd1Var.f45973n = "";
                }
                if (!str11.equals(yd1Var.f45973n)) {
                    org.telegram.ui.Components.i90 i90Var = new org.telegram.ui.Components.i90(1, null);
                    i90Var.a(yd1Var.f45973n);
                    org.telegram.ui.Components.vm0 vm0Var = yd1Var.v;
                    if (vm0Var != null) {
                        vm0Var.b(i90Var, true);
                        return;
                    }
                    return;
                }
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f41287b;
                lf1 lf1Var = twoStepVerificationActivity.V;
                if (twoStepVerificationActivity.U) {
                    AndroidUtilities.cancelRunOnUIThread(lf1Var);
                    lf1Var.run();
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z10;
        int i13 = this.f41286a;
        Object obj = this.f41287b;
        switch (i13) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                return;
            case 5:
                vr vrVar = (vr) obj;
                if (charSequence.length() != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                vrVar.f46348x = z10;
                vrVar.v = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                vrVar.F = ofFloat;
                ofFloat.addUpdateListener(new b3(vrVar, 8));
                if (!vrVar.f46348x) {
                    d3.m(1.5f, vrVar.F);
                    vrVar.F.setDuration(350L);
                } else {
                    vrVar.F.setDuration(220L);
                }
                vrVar.F.start();
                vrVar.hideActionMode();
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
                je0 je0Var = le0Var.f41100x;
                if (le0Var.f41099w) {
                    le0Var.removeCallbacks(je0Var);
                    je0Var.run();
                    return;
                }
                return;
            case 9:
                lf0 lf0Var = (lf0) obj;
                ye0 ye0Var = lf0Var.f41133t0;
                if (lf0Var.f41132s0) {
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
        switch (this.f41286a) {
            case 0:
                return;
            case 1:
                nd ndVar = (nd) this.f41287b;
                ndVar.f0(ndVar.f41773x.getText().toString());
                return;
            case 2:
                return;
            case 3:
                cp cpVar = (cp) this.f41287b;
                if (!cpVar.m0) {
                    String obj = cpVar.f38403b.getText().toString();
                    qa qaVar = cpVar.O;
                    if (qaVar != null) {
                        qaVar.b(obj);
                    }
                    cpVar.Y(obj);
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
