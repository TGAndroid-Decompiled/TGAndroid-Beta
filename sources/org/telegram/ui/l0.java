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
    public final int f35289a;
    public final Object f35290b;

    public l0(Object obj, int i10) {
        this.f35289a = i10;
        this.f35290b = obj;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.web.k kVar;
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
        switch (this.f35289a) {
            case 0:
                h4 h4Var = (h4) this.f35290b;
                if (h4Var.f34078h0.W && (kVar = h4Var.f34079i0) != null) {
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
                wo woVar = (wo) this.f35290b;
                woVar.f39286r.n(5L, woVar.v.getText().toString(), null);
                ai.z5 z5Var = woVar.e;
                if (z5Var != null) {
                    z5Var.invalidate();
                    return;
                }
                return;
            case 3:
                ((kp) this.f35290b).V();
                return;
            case 4:
                oq oqVar = (oq) this.f35290b;
                pq pqVar = oqVar.e;
                if (!oqVar.d) {
                    pqVar.S = editable.toString();
                    s4.c1 K = pqVar.f36634b.K(pqVar.f36660u0);
                    if (K != null) {
                        pq.f0(pqVar, K.f42671a);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                return;
            case 6:
                e70 e70Var = (e70) this.f35290b;
                if (e70Var.f33192f.f22569r.length() != 0) {
                    c70 c70Var = e70Var.v;
                    boolean z12 = c70Var.f32694n;
                    if (!z12) {
                        e70Var.T = true;
                        e70Var.S = true;
                        if (!z12) {
                            c70Var.f32694n = true;
                            c70Var.l();
                        }
                        e70Var.f33200n.setFastScrollVisible(false);
                        e70Var.f33200n.setVerticalScrollBarEnabled(true);
                    }
                    e70Var.v.L(e70Var.f33192f.f22569r.getText().toString());
                    e70Var.f33207s.e(true, false);
                    return;
                }
                e70Var.T = false;
                e70Var.S = false;
                c70 c70Var2 = e70Var.v;
                if (c70Var2.f32694n) {
                    c70Var2.f32694n = false;
                    c70Var2.l();
                }
                e70Var.v.L(null);
                e70Var.f33200n.setFastScrollVisible(true);
                e70Var.f33200n.setVerticalScrollBarEnabled(false);
                e70Var.q0(0);
                return;
            case 7:
            case 8:
            case 9:
                return;
            case 10:
                vg0 vg0Var = (vg0) this.f35290b;
                HashMap hashMap = vg0Var.F;
                ArrayList arrayList = vg0Var.E;
                ak0 ak0Var = vg0Var.f38531a;
                sg0 sg0Var = vg0Var.f38532b;
                if (!vg0Var.I) {
                    int i11 = 1;
                    vg0Var.I = true;
                    int i12 = 0;
                    String d = gf.b.d(ak0Var.getText().toString(), false);
                    ak0Var.setText(d);
                    String str7 = null;
                    if (d.length() == 0) {
                        vg0Var.setCountryButtonText(null);
                        sg0Var.setHintText((String) null);
                        vg0Var.f38539x = 1;
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
                                        Object obj3 = (vt) org.telegram.ui.Cells.q3.g(i11, list);
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
                                        ak0Var.setText(substring);
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
                                ak0Var.setText(d);
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
                            if (vtVar5.f38618c.startsWith(d)) {
                                int i17 = i15 + 1;
                                str3 = str;
                                if (vtVar5.f38618c.equals(d)) {
                                    if (vtVar4 == null || !vtVar4.f38618c.equals(vtVar5.f38618c)) {
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
                            str2 = d.substring(vtVar4.f38618c.length()) + sg0Var.getText().toString();
                            d = vtVar4.f38618c;
                            ak0Var.setText(d);
                        } else {
                            str2 = str8;
                        }
                        List list2 = (List) hashMap.get(d);
                        if (list2 == null) {
                            i10 = 0;
                            vtVar = null;
                        } else if (list2.size() > 1) {
                            String string2 = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + d, null);
                            vt vtVar6 = (vt) org.telegram.ui.Cells.q3.g(1, list2);
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
                            vg0Var.f38539x = 2;
                        } else {
                            vg0Var.H = true;
                            vg0Var.f38540y = vtVar;
                            vg0Var.v(d, vtVar);
                            vg0Var.f38539x = i10;
                        }
                        if (!z10) {
                            ak0Var.setSelection(ak0Var.getText().length());
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
                ck0 ck0Var = (ck0) this.f35290b;
                HashMap hashMap2 = ck0Var.f32826x;
                ArrayList arrayList2 = ck0Var.f32825w;
                if (!ck0Var.E) {
                    ck0Var.E = true;
                    String d10 = gf.b.d(ck0Var.O.getText().toString(), false);
                    ck0Var.O.setText(d10);
                    String str9 = null;
                    if (d10.length() == 0) {
                        ck0Var.t(null);
                        ck0Var.Q.setHintText((String) null);
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
                                            Object obj8 = (vt) org.telegram.ui.Cells.q3.g(1, list3);
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
                                        str5 = d10.substring(i19) + ck0Var.Q.getText().toString();
                                        ck0Var.O.setText(str4);
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
                                str5 = str4.substring(1) + ck0Var.Q.getText().toString();
                                ak0 ak0Var2 = ck0Var.O;
                                str4 = str4.substring(0, 1);
                                ak0Var2.setText(str4);
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
                            if (vtVar9.f38618c.startsWith(str4)) {
                                i21++;
                                if (vtVar9.f38618c.equals(str4)) {
                                    vtVar8 = vtVar9;
                                }
                            }
                        }
                        if (i21 == 1 && vtVar8 != null && str5 == null) {
                            str5 = str4.substring(vtVar8.f38618c.length()) + ck0Var.Q.getText().toString();
                            ak0 ak0Var3 = ck0Var.O;
                            String str10 = vtVar8.f38618c;
                            ak0Var3.setText(str10);
                            str4 = str10;
                        }
                        List list4 = (List) hashMap2.get(str4);
                        if (list4 == null) {
                            vtVar2 = null;
                        } else if (list4.size() > 1) {
                            String string4 = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + str4, null);
                            vt vtVar10 = (vt) org.telegram.ui.Cells.q3.g(1, list4);
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
                            ck0Var.G = true;
                            ck0Var.u(str4, vtVar2);
                        } else {
                            ck0Var.t(null);
                            ck0Var.Q.setHintText((String) null);
                        }
                        if (!z11) {
                            ak0 ak0Var4 = ck0Var.O;
                            ak0Var4.setSelection(ak0Var4.getText().length());
                        }
                        if (str5 != null && str5.length() != 0) {
                            ck0Var.Q.requestFocus();
                            ck0Var.Q.setText(str5);
                            ak0 ak0Var5 = ck0Var.Q;
                            ak0Var5.setSelection(ak0Var5.length());
                        }
                    }
                    ck0Var.E = false;
                    ck0.q(ck0Var);
                    return;
                }
                return;
            case 12:
                on0 on0Var = (on0) this.f35290b;
                if (!on0Var.Z0 && on0Var.T0 != 0 && on0Var.Y[0].length() == on0Var.T0) {
                    on0Var.L.callOnClick();
                    return;
                }
                return;
            case 13:
                wo0 wo0Var = (wo0) this.f35290b;
                if (wo0Var.f39309c0 != 0 && editable.length() == wo0Var.f39309c0) {
                    wo0Var.A0(false);
                    return;
                }
                return;
            case 14:
                zq0 zq0Var = ((ar0) this.f35290b).f31917s0;
                if (zq0Var != null) {
                    zq0Var.b(editable);
                    return;
                }
                return;
            case 15:
                y51 y51Var = (y51) this.f35290b;
                org.telegram.ui.Cells.c6 c6Var = y51Var.h;
                if (c6Var.getText() != null && AndroidUtilities.trim(c6Var.getText(), null).length() != 0) {
                    str6 = c6Var.getText().toString();
                } else {
                    str6 = null;
                }
                y51Var.f38711y.v(str6, true, true);
                v61 v61Var = y51Var.f38706n;
                if (v61Var != null) {
                    v61Var.F1(null);
                    y51Var.f38706n.G1(TextUtils.isEmpty(str6), true);
                }
                if (c6Var != null) {
                    c6Var.clearAnimation();
                    c6Var.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.qr.h).start();
                }
                y51Var.c(false);
                return;
            case 16:
                String trim = editable.toString().trim();
                af1 af1Var = (af1) this.f35290b;
                String str11 = af1Var.f31793n;
                if (trim.length() > 0) {
                    af1Var.f31793n = trim.substring(0, 1).toUpperCase();
                } else {
                    af1Var.f31793n = "";
                }
                if (!str11.equals(af1Var.f31793n)) {
                    org.telegram.ui.Components.l80 l80Var = new org.telegram.ui.Components.l80(1, null);
                    l80Var.a(af1Var.f31793n);
                    org.telegram.ui.Components.ql0 ql0Var = af1Var.v;
                    if (ql0Var != null) {
                        ql0Var.b(l80Var, true);
                        return;
                    }
                    return;
                }
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f35290b;
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
        int i13 = this.f35289a;
        Object obj = this.f35290b;
        switch (i13) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                return;
            case 5:
                bs bsVar = (bs) obj;
                if (charSequence.length() != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                bsVar.f33939x = z10;
                bsVar.v = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                bsVar.F = ofFloat;
                ofFloat.addUpdateListener(new b3(bsVar, 9));
                if (!bsVar.f33939x) {
                    bsVar.F.setInterpolator(new OvershootInterpolator(1.5f));
                    bsVar.F.setDuration(350L);
                } else {
                    bsVar.F.setDuration(220L);
                }
                bsVar.F.start();
                bsVar.hideActionMode();
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
                ye0 ye0Var = af0Var.f31787x;
                if (af0Var.f31786w) {
                    af0Var.removeCallbacks(ye0Var);
                    ye0Var.run();
                    return;
                }
                return;
            case 9:
                zf0 zf0Var = (zf0) obj;
                mf0 mf0Var = zf0Var.f40189r0;
                if (zf0Var.f40187q0) {
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
        switch (this.f35289a) {
            case 0:
                return;
            case 1:
                ld ldVar = (ld) this.f35290b;
                ldVar.d0(ldVar.f35435w.getText().toString());
                return;
            case 2:
                return;
            case 3:
                kp kpVar = (kp) this.f35290b;
                if (!kpVar.m0) {
                    String obj = kpVar.f35203a.getText().toString();
                    na naVar = kpVar.O;
                    if (naVar != null) {
                        naVar.b(obj);
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
