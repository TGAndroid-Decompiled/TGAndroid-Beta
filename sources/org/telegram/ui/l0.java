package org.telegram.ui;

import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.animation.OvershootInterpolator;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class l0 implements TextWatcher {
    public final int f38161a;
    public final Object f38162b;

    public l0(Object obj, int i10) {
        this.f38161a = i10;
        this.f38162b = obj;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.web.l lVar;
        String obj;
        String str;
        boolean z10;
        String str2;
        int i10;
        vt vtVar;
        String str3;
        Object obj2;
        String str4;
        String str5;
        boolean z11;
        vt vtVar2;
        String str6;
        switch (this.f38161a) {
            case 0:
                i4 i4Var = (i4) this.f38162b;
                if (i4Var.f37220h0.W && (lVar = i4Var.f37221i0) != null) {
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
                xo xoVar = (xo) this.f38162b;
                xoVar.f42789r.n(5L, xoVar.v.getText().toString(), null);
                bi.i5 i5Var = xoVar.f42774e;
                if (i5Var != null) {
                    i5Var.invalidate();
                    return;
                }
                return;
            case 3:
                ((lp) this.f38162b).V();
                return;
            case 4:
                pq pqVar = (pq) this.f38162b;
                qq qqVar = pqVar.f39616e;
                if (!pqVar.d) {
                    qqVar.S = editable.toString();
                    s4.c1 K = qqVar.f39936b.K(qqVar.f39963u0);
                    if (K != null) {
                        qq.f0(qqVar, K.f45738a);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                return;
            case 6:
                f70 f70Var = (f70) this.f38162b;
                if (f70Var.f36287f.f24522r.length() != 0) {
                    d70 d70Var = f70Var.v;
                    boolean z12 = d70Var.f35696n;
                    if (!z12) {
                        f70Var.T = true;
                        f70Var.S = true;
                        if (!z12) {
                            d70Var.f35696n = true;
                            d70Var.l();
                        }
                        f70Var.f36295n.setFastScrollVisible(false);
                        f70Var.f36295n.setVerticalScrollBarEnabled(true);
                    }
                    f70Var.v.L(f70Var.f36287f.f24522r.getText().toString());
                    f70Var.f36302s.e(true, false);
                    return;
                }
                f70Var.T = false;
                f70Var.S = false;
                d70 d70Var2 = f70Var.v;
                if (d70Var2.f35696n) {
                    d70Var2.f35696n = false;
                    d70Var2.l();
                }
                f70Var.v.L(null);
                f70Var.f36295n.setFastScrollVisible(true);
                f70Var.f36295n.setVerticalScrollBarEnabled(false);
                f70Var.q0(0);
                return;
            case 7:
            case 8:
            case 9:
                return;
            case 10:
                vg0 vg0Var = (vg0) this.f38162b;
                HashMap hashMap = vg0Var.F;
                ArrayList arrayList = vg0Var.E;
                ck0 ck0Var = vg0Var.f41536a;
                sg0 sg0Var = vg0Var.f41537b;
                if (!vg0Var.I) {
                    int i11 = 1;
                    vg0Var.I = true;
                    int i12 = 0;
                    String d = gf.b.d(ck0Var.getText().toString(), false);
                    ck0Var.setText(d);
                    String str7 = null;
                    if (d.length() == 0) {
                        vg0Var.setCountryButtonText(null);
                        sg0Var.setHintText((String) null);
                        vg0Var.f41545x = 1;
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
                                        Object obj3 = (vt) org.telegram.ui.Cells.p6.g(i11, list);
                                        if (string != null) {
                                            int size = arrayList.size();
                                            int i14 = 0;
                                            while (true) {
                                                if (i14 < size) {
                                                    Object obj4 = arrayList.get(i14);
                                                    i14++;
                                                    vt vtVar3 = (vt) obj4;
                                                    if (Objects.equals(vtVar3.d, string)) {
                                                        obj3 = vtVar3;
                                                    }
                                                }
                                            }
                                        }
                                        obj2 = obj3;
                                    } else {
                                        obj2 = (vt) list.get(0);
                                    }
                                    if (obj2 != null) {
                                        str = d.substring(i13) + sg0Var.getText().toString();
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
                                str = d.substring(1) + sg0Var.getText().toString();
                                d = d.substring(0, 1);
                                ck0Var.setText(d);
                            }
                        } else {
                            str = null;
                            z10 = false;
                        }
                        int size2 = arrayList.size();
                        vt vtVar4 = null;
                        int i15 = 0;
                        int i16 = 0;
                        while (i16 < size2) {
                            Object obj5 = arrayList.get(i16);
                            i16++;
                            vt vtVar5 = (vt) obj5;
                            if (vtVar5.f41695c.startsWith(d)) {
                                int i17 = i15 + 1;
                                str3 = str;
                                if (vtVar5.f41695c.equals(d)) {
                                    if (vtVar4 == null || !vtVar4.f41695c.equals(vtVar5.f41695c)) {
                                        i15 = i17;
                                    }
                                    vtVar4 = vtVar5;
                                } else {
                                    i15 = i17;
                                }
                            } else {
                                str3 = str;
                            }
                            str = str3;
                        }
                        String str8 = str;
                        if (i15 == 1 && vtVar4 != null && str8 == null) {
                            str2 = d.substring(vtVar4.f41695c.length()) + sg0Var.getText().toString();
                            d = vtVar4.f41695c;
                            ck0Var.setText(d);
                        } else {
                            str2 = str8;
                        }
                        List list2 = (List) hashMap.get(d);
                        if (list2 == null) {
                            i10 = 0;
                            vtVar = null;
                        } else if (list2.size() > 1) {
                            String string2 = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + d, null);
                            vt vtVar6 = (vt) org.telegram.ui.Cells.p6.g(1, list2);
                            if (string2 != null) {
                                int size3 = arrayList.size();
                                int i18 = 0;
                                while (i18 < size3) {
                                    Object obj6 = arrayList.get(i18);
                                    i18++;
                                    vtVar = (vt) obj6;
                                    if (Objects.equals(vtVar.d, string2)) {
                                        i10 = 0;
                                    }
                                }
                            }
                            vtVar = vtVar6;
                            i10 = 0;
                        } else {
                            i10 = 0;
                            vtVar = (vt) list2.get(0);
                        }
                        if (vtVar == null) {
                            vg0Var.setCountryButtonText(null);
                            sg0Var.setHintText((String) null);
                            vg0Var.f41545x = 2;
                        } else {
                            vg0Var.H = true;
                            vg0Var.f41546y = vtVar;
                            vg0Var.v(d, vtVar);
                            vg0Var.f41545x = i10;
                        }
                        if (!z10) {
                            ck0Var.setSelection(ck0Var.getText().length());
                        }
                        if (str2 != null) {
                            sg0Var.requestFocus();
                            sg0Var.setText(str2);
                            sg0Var.setSelection(sg0Var.length());
                        }
                    }
                    vg0Var.I = false;
                    return;
                }
                return;
            case 11:
                ek0 ek0Var = (ek0) this.f38162b;
                HashMap hashMap2 = ek0Var.f36115x;
                ArrayList arrayList2 = ek0Var.f36114w;
                if (!ek0Var.E) {
                    ek0Var.E = true;
                    String d10 = gf.b.d(ek0Var.O.getText().toString(), false);
                    ek0Var.O.setText(d10);
                    String str9 = null;
                    if (d10.length() == 0) {
                        ek0Var.t(null);
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
                                            Object obj8 = (vt) org.telegram.ui.Cells.p6.g(1, list3);
                                            if (string3 != null) {
                                                int size4 = arrayList2.size();
                                                int i20 = 0;
                                                while (true) {
                                                    if (i20 < size4) {
                                                        Object obj9 = arrayList2.get(i20);
                                                        i20++;
                                                        vt vtVar7 = (vt) obj9;
                                                        if (Objects.equals(vtVar7.d, string3)) {
                                                            obj8 = vtVar7;
                                                        }
                                                    }
                                                }
                                            }
                                            obj7 = obj8;
                                        } else {
                                            obj7 = (vt) list3.get(0);
                                        }
                                    }
                                    if (obj7 != null) {
                                        str5 = d10.substring(i19) + ek0Var.Q.getText().toString();
                                        ek0Var.O.setText(str4);
                                        z11 = true;
                                    } else {
                                        i19--;
                                        str9 = null;
                                    }
                                } else {
                                    str4 = d10;
                                    str5 = null;
                                    z11 = false;
                                }
                            }
                            if (!z11) {
                                str5 = str4.substring(1) + ek0Var.Q.getText().toString();
                                ck0 ck0Var2 = ek0Var.O;
                                str4 = str4.substring(0, 1);
                                ck0Var2.setText(str4);
                            }
                        } else {
                            str4 = d10;
                            str5 = null;
                            z11 = false;
                        }
                        int size5 = arrayList2.size();
                        vt vtVar8 = null;
                        int i21 = 0;
                        int i22 = 0;
                        while (i22 < size5) {
                            Object obj10 = arrayList2.get(i22);
                            i22++;
                            vt vtVar9 = (vt) obj10;
                            if (vtVar9.f41695c.startsWith(str4)) {
                                i21++;
                                if (vtVar9.f41695c.equals(str4)) {
                                    vtVar8 = vtVar9;
                                }
                            }
                        }
                        if (i21 == 1 && vtVar8 != null && str5 == null) {
                            str5 = str4.substring(vtVar8.f41695c.length()) + ek0Var.Q.getText().toString();
                            ck0 ck0Var3 = ek0Var.O;
                            String str10 = vtVar8.f41695c;
                            ck0Var3.setText(str10);
                            str4 = str10;
                        }
                        List list4 = (List) hashMap2.get(str4);
                        if (list4 == null) {
                            vtVar2 = null;
                        } else if (list4.size() > 1) {
                            String string4 = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + str4, null);
                            vt vtVar10 = (vt) org.telegram.ui.Cells.p6.g(1, list4);
                            if (string4 != null) {
                                int size6 = arrayList2.size();
                                int i23 = 0;
                                while (i23 < size6) {
                                    Object obj11 = arrayList2.get(i23);
                                    i23++;
                                    vt vtVar11 = (vt) obj11;
                                    if (Objects.equals(vtVar11.d, string4)) {
                                        vtVar2 = vtVar11;
                                    }
                                }
                            }
                            vtVar2 = vtVar10;
                        } else {
                            vtVar2 = (vt) list4.get(0);
                        }
                        if (vtVar2 != null) {
                            ek0Var.G = true;
                            ek0Var.u(str4, vtVar2);
                        } else {
                            ek0Var.t(null);
                            ek0Var.Q.setHintText((String) null);
                        }
                        if (!z11) {
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
                    ek0.q(ek0Var);
                    return;
                }
                return;
            case 12:
                pn0 pn0Var = (pn0) this.f38162b;
                if (!pn0Var.Z0 && pn0Var.T0 != 0 && pn0Var.Y[0].length() == pn0Var.T0) {
                    pn0Var.L.callOnClick();
                    return;
                }
                return;
            case 13:
                xo0 xo0Var = (xo0) this.f38162b;
                if (xo0Var.f42812c0 != 0 && editable.length() == xo0Var.f42812c0) {
                    xo0Var.A0(false);
                    return;
                }
                return;
            case 14:
                ar0 ar0Var = ((br0) this.f38162b).f34906s0;
                if (ar0Var != null) {
                    ar0Var.b(editable);
                    return;
                }
                return;
            case 15:
                a61 a61Var = (a61) this.f38162b;
                org.telegram.ui.Cells.b6 b6Var = a61Var.h;
                if (b6Var.getText() != null && AndroidUtilities.trim(b6Var.getText(), null).length() != 0) {
                    str6 = b6Var.getText().toString();
                } else {
                    str6 = null;
                }
                a61Var.f43010y.v(str6, true, true);
                x61 x61Var = a61Var.f43005n;
                if (x61Var != null) {
                    x61Var.E1(null);
                    a61Var.f43005n.F1(TextUtils.isEmpty(str6), true);
                }
                if (b6Var != null) {
                    b6Var.clearAnimation();
                    b6Var.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.pr.h).start();
                }
                a61Var.c(false);
                return;
            case 16:
                String trim = editable.toString().trim();
                af1 af1Var = (af1) this.f38162b;
                String str11 = af1Var.f34415n;
                if (trim.length() > 0) {
                    af1Var.f34415n = trim.substring(0, 1).toUpperCase();
                } else {
                    af1Var.f34415n = "";
                }
                if (!str11.equals(af1Var.f34415n)) {
                    org.telegram.ui.Components.l80 l80Var = new org.telegram.ui.Components.l80(1, null);
                    l80Var.a(af1Var.f34415n);
                    org.telegram.ui.Components.ql0 ql0Var = af1Var.v;
                    if (ql0Var != null) {
                        ql0Var.b(l80Var, true);
                        return;
                    }
                    return;
                }
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f38162b;
                ng1 ng1Var = twoStepVerificationActivity.V;
                if (twoStepVerificationActivity.U) {
                    AndroidUtilities.cancelRunOnUIThread(ng1Var);
                    ng1Var.run();
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z10;
        int i13 = this.f38161a;
        Object obj = this.f38162b;
        switch (i13) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                return;
            case 5:
                cs csVar = (cs) obj;
                if (charSequence.length() != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                csVar.f36770x = z10;
                csVar.v = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                csVar.F = ofFloat;
                ofFloat.addUpdateListener(new c3(csVar, 9));
                if (!csVar.f36770x) {
                    csVar.F.setInterpolator(new OvershootInterpolator(1.5f));
                    csVar.F.setDuration(350L);
                } else {
                    csVar.F.setDuration(220L);
                }
                csVar.F.start();
                csVar.hideActionMode();
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
                ye0 ye0Var = af0Var.f34408x;
                if (af0Var.f34407w) {
                    af0Var.removeCallbacks(ye0Var);
                    ye0Var.run();
                    return;
                }
                return;
            case 9:
                zf0 zf0Var = (zf0) obj;
                mf0 mf0Var = zf0Var.f43419r0;
                if (zf0Var.f43417q0) {
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
        switch (this.f38161a) {
            case 0:
                return;
            case 1:
                md mdVar = (md) this.f38162b;
                mdVar.d0(mdVar.f38662w.getText().toString());
                return;
            case 2:
                return;
            case 3:
                lp lpVar = (lp) this.f38162b;
                if (!lpVar.m0) {
                    String obj = lpVar.f38423a.getText().toString();
                    na naVar = lpVar.O;
                    if (naVar != null) {
                        naVar.b(obj);
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
