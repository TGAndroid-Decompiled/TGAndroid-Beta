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
    public final int f38388a;
    public final Object f38389b;

    public n0(Object obj, int i10) {
        this.f38388a = i10;
        this.f38389b = obj;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.web.k kVar;
        String obj;
        String str;
        boolean z10;
        String str2;
        int i10;
        au auVar;
        boolean z11;
        String str3;
        Object obj2;
        String str4;
        boolean z12;
        String str5;
        au auVar2;
        String str6;
        switch (this.f38388a) {
            case 0:
                k4 k4Var = (k4) this.f38389b;
                if (k4Var.f37545h0.W && (kVar = k4Var.f37546i0) != null) {
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
                zo zoVar = (zo) this.f38389b;
                zoVar.f42675r.n(5L, zoVar.v.getText().toString(), null);
                bi.k5 k5Var = zoVar.e;
                if (k5Var != null) {
                    k5Var.invalidate();
                    return;
                }
                return;
            case 3:
                ((np) this.f38389b).V();
                return;
            case 4:
                sq sqVar = (sq) this.f38389b;
                tq tqVar = sqVar.e;
                if (!sqVar.d) {
                    tqVar.S = editable.toString();
                    s4.b1 K = tqVar.f40436b.K(tqVar.f40462u0);
                    if (K != null) {
                        tq.f0(tqVar, K.f44838a);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                return;
            case 6:
                j70 j70Var = (j70) this.f38389b;
                if (j70Var.f37277f.f27815r.length() != 0) {
                    h70 h70Var = j70Var.v;
                    boolean z13 = h70Var.f36635n;
                    if (!z13) {
                        j70Var.T = true;
                        j70Var.S = true;
                        if (!z13) {
                            h70Var.f36635n = true;
                            h70Var.l();
                        }
                        j70Var.f37285n.setFastScrollVisible(false);
                        j70Var.f37285n.setVerticalScrollBarEnabled(true);
                    }
                    j70Var.v.L(j70Var.f37277f.f27815r.getText().toString());
                    j70Var.f37292s.e(true, false);
                    return;
                }
                j70Var.T = false;
                j70Var.S = false;
                h70 h70Var2 = j70Var.v;
                if (h70Var2.f36635n) {
                    h70Var2.f36635n = false;
                    h70Var2.l();
                }
                j70Var.v.L(null);
                j70Var.f37285n.setFastScrollVisible(true);
                j70Var.f37285n.setVerticalScrollBarEnabled(false);
                j70Var.q0(0);
                return;
            case 7:
            case 8:
            case 9:
                return;
            case 10:
                ah0 ah0Var = (ah0) this.f38389b;
                HashMap hashMap = ah0Var.F;
                ArrayList arrayList = ah0Var.E;
                gk0 gk0Var = ah0Var.f34215a;
                xg0 xg0Var = ah0Var.f34216b;
                if (!ah0Var.I) {
                    int i11 = 1;
                    ah0Var.I = true;
                    int i12 = 0;
                    String d = jf.b.d(gk0Var.getText().toString(), false);
                    gk0Var.setText(d);
                    String str7 = null;
                    if (d.length() == 0) {
                        ah0Var.setCountryButtonText(null);
                        xg0Var.setHintText((String) null);
                        ah0Var.f34223x = 1;
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
                                        Object obj3 = (au) t8.b.g(i11, list);
                                        if (string != null) {
                                            int size = arrayList.size();
                                            int i14 = i12;
                                            while (true) {
                                                if (i14 < size) {
                                                    Object obj4 = arrayList.get(i14);
                                                    i14++;
                                                    au auVar3 = (au) obj4;
                                                    if (Objects.equals(auVar3.d, string)) {
                                                        obj3 = auVar3;
                                                    }
                                                }
                                            }
                                        }
                                        obj2 = obj3;
                                    } else {
                                        obj2 = (au) list.get(i12);
                                    }
                                    if (obj2 != null) {
                                        str = d.substring(i13) + xg0Var.getText().toString();
                                        gk0Var.setText(substring);
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
                                str = d.substring(1) + xg0Var.getText().toString();
                                d = d.substring(0, 1);
                                gk0Var.setText(d);
                            }
                        } else {
                            str = null;
                            z10 = false;
                        }
                        int size2 = arrayList.size();
                        au auVar4 = null;
                        int i15 = 0;
                        int i16 = 0;
                        while (i16 < size2) {
                            Object obj5 = arrayList.get(i16);
                            i16++;
                            au auVar5 = (au) obj5;
                            if (auVar5.f34341c.startsWith(d)) {
                                int i17 = i15 + 1;
                                str3 = str;
                                if (auVar5.f34341c.equals(d)) {
                                    if (auVar4 == null || !auVar4.f34341c.equals(auVar5.f34341c)) {
                                        i15 = i17;
                                    }
                                    auVar4 = auVar5;
                                } else {
                                    i15 = i17;
                                }
                            } else {
                                str3 = str;
                            }
                            str = str3;
                        }
                        String str8 = str;
                        if (i15 == 1 && auVar4 != null && str8 == null) {
                            str2 = d.substring(auVar4.f34341c.length()) + xg0Var.getText().toString();
                            d = auVar4.f34341c;
                            gk0Var.setText(d);
                        } else {
                            str2 = str8;
                        }
                        List list2 = (List) hashMap.get(d);
                        if (list2 == null) {
                            i10 = 0;
                            auVar = null;
                        } else if (list2.size() > 1) {
                            String string2 = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + d, null);
                            au auVar6 = (au) t8.b.g(1, list2);
                            if (string2 != null) {
                                int size3 = arrayList.size();
                                int i18 = 0;
                                while (i18 < size3) {
                                    Object obj6 = arrayList.get(i18);
                                    i18++;
                                    auVar = (au) obj6;
                                    if (Objects.equals(auVar.d, string2)) {
                                        i10 = 0;
                                    }
                                }
                            }
                            auVar = auVar6;
                            i10 = 0;
                        } else {
                            i10 = 0;
                            auVar = (au) list2.get(0);
                        }
                        if (auVar == null) {
                            ah0Var.setCountryButtonText(null);
                            xg0Var.setHintText((String) null);
                            ah0Var.f34223x = 2;
                        } else {
                            ah0Var.H = true;
                            ah0Var.f34224y = auVar;
                            ah0Var.t(d, auVar);
                            ah0Var.f34223x = i10;
                        }
                        if (!z10) {
                            gk0Var.setSelection(gk0Var.getText().length());
                        }
                        if (str2 != null) {
                            xg0Var.requestFocus();
                            xg0Var.setText(str2);
                            xg0Var.setSelection(xg0Var.length());
                        }
                        z11 = false;
                    }
                    ah0Var.I = z11;
                    return;
                }
                return;
            case 11:
                ik0 ik0Var = (ik0) this.f38389b;
                HashMap hashMap2 = ik0Var.f37162x;
                ArrayList arrayList2 = ik0Var.f37161w;
                if (!ik0Var.E) {
                    ik0Var.E = true;
                    String d10 = jf.b.d(ik0Var.O.getText().toString(), false);
                    ik0Var.O.setText(d10);
                    String str9 = null;
                    if (d10.length() == 0) {
                        ik0Var.v(null);
                        ik0Var.Q.setHintText((String) null);
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
                                            Object obj8 = (au) t8.b.g(1, list3);
                                            if (string3 != null) {
                                                int size4 = arrayList2.size();
                                                int i20 = 0;
                                                while (true) {
                                                    if (i20 < size4) {
                                                        Object obj9 = arrayList2.get(i20);
                                                        i20++;
                                                        au auVar7 = (au) obj9;
                                                        if (Objects.equals(auVar7.d, string3)) {
                                                            obj8 = auVar7;
                                                        }
                                                    }
                                                }
                                            }
                                            obj7 = obj8;
                                        } else {
                                            obj7 = (au) list3.get(0);
                                        }
                                    }
                                    if (obj7 != null) {
                                        str5 = d10.substring(i19) + ik0Var.Q.getText().toString();
                                        ik0Var.O.setText(str4);
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
                                str5 = str4.substring(1) + ik0Var.Q.getText().toString();
                                gk0 gk0Var2 = ik0Var.O;
                                str4 = str4.substring(0, 1);
                                gk0Var2.setText(str4);
                            }
                        } else {
                            str4 = d10;
                            z12 = false;
                            str5 = null;
                        }
                        int size5 = arrayList2.size();
                        int i21 = 0;
                        int i22 = 0;
                        au auVar8 = null;
                        while (i22 < size5) {
                            Object obj10 = arrayList2.get(i22);
                            i22++;
                            au auVar9 = (au) obj10;
                            if (auVar9.f34341c.startsWith(str4)) {
                                i21++;
                                if (auVar9.f34341c.equals(str4)) {
                                    auVar8 = auVar9;
                                }
                            }
                        }
                        if (i21 == 1 && auVar8 != null && str5 == null) {
                            str5 = str4.substring(auVar8.f34341c.length()) + ik0Var.Q.getText().toString();
                            gk0 gk0Var3 = ik0Var.O;
                            String str10 = auVar8.f34341c;
                            gk0Var3.setText(str10);
                            str4 = str10;
                        }
                        List list4 = (List) hashMap2.get(str4);
                        if (list4 == null) {
                            auVar2 = null;
                        } else if (list4.size() > 1) {
                            String string4 = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + str4, null);
                            au auVar10 = (au) t8.b.g(1, list4);
                            if (string4 != null) {
                                int size6 = arrayList2.size();
                                int i23 = 0;
                                while (i23 < size6) {
                                    Object obj11 = arrayList2.get(i23);
                                    i23++;
                                    au auVar11 = (au) obj11;
                                    if (Objects.equals(auVar11.d, string4)) {
                                        auVar2 = auVar11;
                                    }
                                }
                            }
                            auVar2 = auVar10;
                        } else {
                            auVar2 = (au) list4.get(0);
                        }
                        if (auVar2 != null) {
                            ik0Var.G = true;
                            ik0Var.w(str4, auVar2);
                        } else {
                            ik0Var.v(null);
                            ik0Var.Q.setHintText((String) null);
                        }
                        if (!z12) {
                            gk0 gk0Var4 = ik0Var.O;
                            gk0Var4.setSelection(gk0Var4.getText().length());
                        }
                        if (str5 != null && str5.length() != 0) {
                            ik0Var.Q.requestFocus();
                            ik0Var.Q.setText(str5);
                            gk0 gk0Var5 = ik0Var.Q;
                            gk0Var5.setSelection(gk0Var5.length());
                        }
                    }
                    ik0Var.E = false;
                    ik0.s(ik0Var);
                    return;
                }
                return;
            case 12:
                un0 un0Var = (un0) this.f38389b;
                if (!un0Var.Z0 && un0Var.T0 != 0 && un0Var.Y[0].length() == un0Var.T0) {
                    un0Var.L.callOnClick();
                    return;
                }
                return;
            case 13:
                cp0 cp0Var = (cp0) this.f38389b;
                if (cp0Var.f35002c0 != 0 && editable.length() == cp0Var.f35002c0) {
                    cp0Var.A0(false);
                    return;
                }
                return;
            case 14:
                gr0 gr0Var = ((hr0) this.f38389b).f36937s0;
                if (gr0Var != null) {
                    gr0Var.b(editable);
                    return;
                }
                return;
            case 15:
                i61 i61Var = (i61) this.f38389b;
                org.telegram.ui.Cells.c6 c6Var = i61Var.h;
                if (c6Var.getText() != null && AndroidUtilities.trim(c6Var.getText(), null).length() != 0) {
                    str6 = c6Var.getText().toString();
                } else {
                    str6 = null;
                }
                i61Var.f36336y.v(str6, true, true);
                f71 f71Var = i61Var.f36331n;
                if (f71Var != null) {
                    f71Var.G1(null);
                    i61Var.f36331n.H1(TextUtils.isEmpty(str6), true);
                }
                if (c6Var != null) {
                    c6Var.clearAnimation();
                    c6Var.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.es.h).start();
                }
                i61Var.c(false);
                return;
            case 16:
                String trim = editable.toString().trim();
                hf1 hf1Var = (hf1) this.f38389b;
                String str11 = hf1Var.f36784n;
                if (trim.length() > 0) {
                    hf1Var.f36784n = trim.substring(0, 1).toUpperCase();
                } else {
                    hf1Var.f36784n = "";
                }
                if (!str11.equals(hf1Var.f36784n)) {
                    org.telegram.ui.Components.m90 m90Var = new org.telegram.ui.Components.m90(1, null);
                    m90Var.a(hf1Var.f36784n);
                    org.telegram.ui.Components.rm0 rm0Var = hf1Var.v;
                    if (rm0Var != null) {
                        rm0Var.b(m90Var, true);
                        return;
                    }
                    return;
                }
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f38389b;
                ug1 ug1Var = twoStepVerificationActivity.V;
                if (twoStepVerificationActivity.U) {
                    AndroidUtilities.cancelRunOnUIThread(ug1Var);
                    ug1Var.run();
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z10;
        int i13 = this.f38388a;
        Object obj = this.f38389b;
        switch (i13) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                return;
            case 5:
                fs fsVar = (fs) obj;
                if (charSequence.length() != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                fsVar.f37723x = z10;
                fsVar.v = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                fsVar.F = ofFloat;
                ofFloat.addUpdateListener(new e3(fsVar, 9));
                if (!fsVar.f37723x) {
                    org.telegram.ui.Cells.d0.l(1.5f, fsVar.F);
                    fsVar.F.setDuration(350L);
                } else {
                    fsVar.F.setDuration(220L);
                }
                fsVar.F.start();
                fsVar.hideActionMode();
                return;
            case 6:
                return;
            case 7:
                le0 le0Var = (le0) obj;
                ee0 ee0Var = le0Var.S;
                if (le0Var.R) {
                    le0Var.removeCallbacks(ee0Var);
                    ee0Var.run();
                    return;
                }
                return;
            case 8:
                ff0 ff0Var = (ff0) obj;
                df0 df0Var = ff0Var.f35821x;
                if (ff0Var.f35820w) {
                    ff0Var.removeCallbacks(df0Var);
                    df0Var.run();
                    return;
                }
                return;
            case 9:
                eg0 eg0Var = (eg0) obj;
                rf0 rf0Var = eg0Var.f35564r0;
                if (eg0Var.f35562q0) {
                    eg0Var.removeCallbacks(rf0Var);
                    rf0Var.run();
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
        switch (this.f38388a) {
            case 0:
                return;
            case 1:
                sd sdVar = (sd) this.f38389b;
                sdVar.d0(sdVar.f40091w.getText().toString());
                return;
            case 2:
                return;
            case 3:
                np npVar = (np) this.f38389b;
                if (!npVar.m0) {
                    String obj = npVar.f38752a.getText().toString();
                    sa saVar = npVar.O;
                    if (saVar != null) {
                        saVar.b(obj);
                    }
                    npVar.W(obj);
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
