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
    public final int f35387a;
    public final Object f35388b;

    public l0(Object obj, int i10) {
        this.f35387a = i10;
        this.f35388b = obj;
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
        String str3;
        Object obj2;
        String str4;
        String str5;
        boolean z11;
        xt xtVar2;
        String str6;
        switch (this.f35387a) {
            case 0:
                h4 h4Var = (h4) this.f35388b;
                if (h4Var.f34156h0.W && (kVar = h4Var.f34157i0) != null) {
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
                wo woVar = (wo) this.f35388b;
                woVar.f39103r.n(5L, woVar.v.getText().toString(), null);
                ai.z5 z5Var = woVar.e;
                if (z5Var != null) {
                    z5Var.invalidate();
                    return;
                }
                return;
            case 3:
                ((kp) this.f35388b).V();
                return;
            case 4:
                oq oqVar = (oq) this.f35388b;
                pq pqVar = oqVar.e;
                if (!oqVar.d) {
                    pqVar.S = editable.toString();
                    s4.c1 L = pqVar.f36678b.L(pqVar.f36704u0);
                    if (L != null) {
                        pq.f0(pqVar, L.f42697a);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                return;
            case 6:
                g70 g70Var = (g70) this.f35388b;
                if (g70Var.f33875f.f22543r.length() != 0) {
                    e70 e70Var = g70Var.v;
                    boolean z12 = e70Var.f33305n;
                    if (!z12) {
                        g70Var.T = true;
                        g70Var.S = true;
                        if (!z12) {
                            e70Var.f33305n = true;
                            e70Var.l();
                        }
                        g70Var.f33883n.setFastScrollVisible(false);
                        g70Var.f33883n.setVerticalScrollBarEnabled(true);
                    }
                    g70Var.v.L(g70Var.f33875f.f22543r.getText().toString());
                    g70Var.f33890s.e(true, false);
                    return;
                }
                g70Var.T = false;
                g70Var.S = false;
                e70 e70Var2 = g70Var.v;
                if (e70Var2.f33305n) {
                    e70Var2.f33305n = false;
                    e70Var2.l();
                }
                g70Var.v.L(null);
                g70Var.f33883n.setFastScrollVisible(true);
                g70Var.f33883n.setVerticalScrollBarEnabled(false);
                g70Var.q0(0);
                return;
            case 7:
            case 8:
            case 9:
                return;
            case 10:
                xg0 xg0Var = (xg0) this.f35388b;
                HashMap hashMap = xg0Var.F;
                ArrayList arrayList = xg0Var.E;
                ck0 ck0Var = xg0Var.f39614a;
                ug0 ug0Var = xg0Var.f39615b;
                if (!xg0Var.I) {
                    int i11 = 1;
                    xg0Var.I = true;
                    int i12 = 0;
                    String d = gf.b.d(ck0Var.getText().toString(), false);
                    ck0Var.setText(d);
                    String str7 = null;
                    if (d.length() == 0) {
                        xg0Var.setCountryButtonText(null);
                        ug0Var.setHintText((String) null);
                        xg0Var.f39622x = 1;
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
                                        Object obj3 = (xt) org.telegram.ui.Cells.p6.g(i11, list);
                                        if (string != null) {
                                            int size = arrayList.size();
                                            int i14 = 0;
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
                                        obj2 = (xt) list.get(0);
                                    }
                                    if (obj2 != null) {
                                        str = d.substring(i13) + ug0Var.getText().toString();
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
                                str = d.substring(1) + ug0Var.getText().toString();
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
                            if (xtVar5.f39697c.startsWith(d)) {
                                int i17 = i15 + 1;
                                str3 = str;
                                if (xtVar5.f39697c.equals(d)) {
                                    if (xtVar4 == null || !xtVar4.f39697c.equals(xtVar5.f39697c)) {
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
                            str2 = d.substring(xtVar4.f39697c.length()) + ug0Var.getText().toString();
                            d = xtVar4.f39697c;
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
                            xt xtVar6 = (xt) org.telegram.ui.Cells.p6.g(1, list2);
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
                            xg0Var.setCountryButtonText(null);
                            ug0Var.setHintText((String) null);
                            xg0Var.f39622x = 2;
                        } else {
                            xg0Var.H = true;
                            xg0Var.f39623y = xtVar;
                            xg0Var.v(d, xtVar);
                            xg0Var.f39622x = i10;
                        }
                        if (!z10) {
                            ck0Var.setSelection(ck0Var.getText().length());
                        }
                        if (str2 != null) {
                            ug0Var.requestFocus();
                            ug0Var.setText(str2);
                            ug0Var.setSelection(ug0Var.length());
                        }
                    }
                    xg0Var.I = false;
                    return;
                }
                return;
            case 11:
                ek0 ek0Var = (ek0) this.f35388b;
                HashMap hashMap2 = ek0Var.f33433x;
                ArrayList arrayList2 = ek0Var.f33432w;
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
                                            Object obj8 = (xt) org.telegram.ui.Cells.p6.g(1, list3);
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
                        xt xtVar8 = null;
                        int i21 = 0;
                        int i22 = 0;
                        while (i22 < size5) {
                            Object obj10 = arrayList2.get(i22);
                            i22++;
                            xt xtVar9 = (xt) obj10;
                            if (xtVar9.f39697c.startsWith(str4)) {
                                i21++;
                                if (xtVar9.f39697c.equals(str4)) {
                                    xtVar8 = xtVar9;
                                }
                            }
                        }
                        if (i21 == 1 && xtVar8 != null && str5 == null) {
                            str5 = str4.substring(xtVar8.f39697c.length()) + ek0Var.Q.getText().toString();
                            ck0 ck0Var3 = ek0Var.O;
                            String str10 = xtVar8.f39697c;
                            ck0Var3.setText(str10);
                            str4 = str10;
                        }
                        List list4 = (List) hashMap2.get(str4);
                        if (list4 == null) {
                            xtVar2 = null;
                        } else if (list4.size() > 1) {
                            String string4 = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + str4, null);
                            xt xtVar10 = (xt) org.telegram.ui.Cells.p6.g(1, list4);
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
                            ek0Var.u(str4, xtVar2);
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
                qn0 qn0Var = (qn0) this.f35388b;
                if (!qn0Var.Z0 && qn0Var.T0 != 0 && qn0Var.Y[0].length() == qn0Var.T0) {
                    qn0Var.L.callOnClick();
                    return;
                }
                return;
            case 13:
                yo0 yo0Var = (yo0) this.f35388b;
                if (yo0Var.f39951c0 != 0 && editable.length() == yo0Var.f39951c0) {
                    yo0Var.A0(false);
                    return;
                }
                return;
            case 14:
                br0 br0Var = ((cr0) this.f35388b).f32895s0;
                if (br0Var != null) {
                    br0Var.b(editable);
                    return;
                }
                return;
            case 15:
                z51 z51Var = (z51) this.f35388b;
                org.telegram.ui.Cells.b6 b6Var = z51Var.h;
                if (b6Var.getText() != null && AndroidUtilities.trim(b6Var.getText(), null).length() != 0) {
                    str6 = b6Var.getText().toString();
                } else {
                    str6 = null;
                }
                z51Var.f39399y.v(str6, true, true);
                w61 w61Var = z51Var.f39394n;
                if (w61Var != null) {
                    w61Var.G1(null);
                    z51Var.f39394n.H1(TextUtils.isEmpty(str6), true);
                }
                if (b6Var != null) {
                    b6Var.clearAnimation();
                    b6Var.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.qr.h).start();
                }
                z51Var.c(false);
                return;
            case 16:
                String trim = editable.toString().trim();
                bf1 bf1Var = (bf1) this.f35388b;
                String str11 = bf1Var.f32119n;
                if (trim.length() > 0) {
                    bf1Var.f32119n = trim.substring(0, 1).toUpperCase();
                } else {
                    bf1Var.f32119n = "";
                }
                if (!str11.equals(bf1Var.f32119n)) {
                    org.telegram.ui.Components.l80 l80Var = new org.telegram.ui.Components.l80(1, null);
                    l80Var.a(bf1Var.f32119n);
                    org.telegram.ui.Components.rl0 rl0Var = bf1Var.v;
                    if (rl0Var != null) {
                        rl0Var.b(l80Var, true);
                        return;
                    }
                    return;
                }
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f35388b;
                og1 og1Var = twoStepVerificationActivity.V;
                if (twoStepVerificationActivity.U) {
                    AndroidUtilities.cancelRunOnUIThread(og1Var);
                    og1Var.run();
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z10;
        int i13 = this.f35387a;
        Object obj = this.f35388b;
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
                dsVar.f34673x = z10;
                dsVar.v = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                dsVar.F = ofFloat;
                ofFloat.addUpdateListener(new b3(dsVar, 8));
                if (!dsVar.f34673x) {
                    dsVar.F.setInterpolator(new OvershootInterpolator(1.5f));
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
                ie0 ie0Var = (ie0) obj;
                be0 be0Var = ie0Var.S;
                if (ie0Var.R) {
                    ie0Var.removeCallbacks(be0Var);
                    be0Var.run();
                    return;
                }
                return;
            case 8:
                cf0 cf0Var = (cf0) obj;
                af0 af0Var = cf0Var.f32784x;
                if (cf0Var.f32783w) {
                    cf0Var.removeCallbacks(af0Var);
                    af0Var.run();
                    return;
                }
                return;
            case 9:
                bg0 bg0Var = (bg0) obj;
                of0 of0Var = bg0Var.f32151r0;
                if (bg0Var.f32149q0) {
                    bg0Var.removeCallbacks(of0Var);
                    of0Var.run();
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
        switch (this.f35387a) {
            case 0:
                return;
            case 1:
                nd ndVar = (nd) this.f35388b;
                ndVar.d0(ndVar.f36065w.getText().toString());
                return;
            case 2:
                return;
            case 3:
                kp kpVar = (kp) this.f35388b;
                if (!kpVar.m0) {
                    String obj = kpVar.f35317a.getText().toString();
                    pa paVar = kpVar.O;
                    if (paVar != null) {
                        paVar.b(obj);
                    }
                    kpVar.W(obj);
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
