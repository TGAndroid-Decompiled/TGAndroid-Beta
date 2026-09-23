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
public final class m0 implements TextWatcher {
    public final int f35115a;
    public final Object f35116b;

    public m0(Object obj, int i10) {
        this.f35115a = i10;
        this.f35116b = obj;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.web.k kVar;
        String obj;
        String str;
        boolean z10;
        String str2;
        int i10;
        st stVar;
        String str3;
        Object obj2;
        String str4;
        String str5;
        boolean z11;
        st stVar2;
        String str6;
        switch (this.f35115a) {
            case 0:
                i4 i4Var = (i4) this.f35116b;
                if (i4Var.f34009h0.W && (kVar = i4Var.f34010i0) != null) {
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
                so soVar = (so) this.f35116b;
                soVar.f37364r.n(5L, soVar.v.getText().toString(), null);
                ai.y5 y5Var = soVar.e;
                if (y5Var != null) {
                    y5Var.invalidate();
                    return;
                }
                return;
            case 3:
                ((gp) this.f35116b).V();
                return;
            case 4:
                kq kqVar = (kq) this.f35116b;
                lq lqVar = kqVar.e;
                if (!kqVar.d) {
                    lqVar.S = editable.toString();
                    s4.c1 K = lqVar.f35043b.K(lqVar.f35069u0);
                    if (K != null) {
                        lq.f0(lqVar, K.f42627a);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                return;
            case 6:
                b70 b70Var = (b70) this.f35116b;
                if (b70Var.f31991f.f22890r.length() != 0) {
                    z60 z60Var = b70Var.v;
                    boolean z12 = z60Var.f39995n;
                    if (!z12) {
                        b70Var.T = true;
                        b70Var.S = true;
                        if (!z12) {
                            z60Var.f39995n = true;
                            z60Var.l();
                        }
                        b70Var.f31999n.setFastScrollVisible(false);
                        b70Var.f31999n.setVerticalScrollBarEnabled(true);
                    }
                    b70Var.v.L(b70Var.f31991f.f22890r.getText().toString());
                    b70Var.f32006s.e(true, false);
                    return;
                }
                b70Var.T = false;
                b70Var.S = false;
                z60 z60Var2 = b70Var.v;
                if (z60Var2.f39995n) {
                    z60Var2.f39995n = false;
                    z60Var2.l();
                }
                b70Var.v.L(null);
                b70Var.f31999n.setFastScrollVisible(true);
                b70Var.f31999n.setVerticalScrollBarEnabled(false);
                b70Var.q0(0);
                return;
            case 7:
            case 8:
            case 9:
                return;
            case 10:
                qg0 qg0Var = (qg0) this.f35116b;
                HashMap hashMap = qg0Var.F;
                ArrayList arrayList = qg0Var.E;
                uj0 uj0Var = qg0Var.f36422a;
                ng0 ng0Var = qg0Var.f36423b;
                if (!qg0Var.I) {
                    int i11 = 1;
                    qg0Var.I = true;
                    int i12 = 0;
                    String d = gf.b.d(uj0Var.getText().toString(), false);
                    uj0Var.setText(d);
                    String str7 = null;
                    if (d.length() == 0) {
                        qg0Var.setCountryButtonText(null);
                        ng0Var.setHintText((String) null);
                        qg0Var.f36430x = 1;
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
                                        Object obj3 = (st) org.telegram.ui.Cells.q3.g(i11, list);
                                        if (string != null) {
                                            int size = arrayList.size();
                                            int i14 = 0;
                                            while (true) {
                                                if (i14 < size) {
                                                    Object obj4 = arrayList.get(i14);
                                                    i14++;
                                                    st stVar3 = (st) obj4;
                                                    if (Objects.equals(stVar3.d, string)) {
                                                        obj3 = stVar3;
                                                    }
                                                }
                                            }
                                        }
                                        obj2 = obj3;
                                    } else {
                                        obj2 = (st) list.get(0);
                                    }
                                    if (obj2 != null) {
                                        str = d.substring(i13) + ng0Var.getText().toString();
                                        uj0Var.setText(substring);
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
                                str = d.substring(1) + ng0Var.getText().toString();
                                d = d.substring(0, 1);
                                uj0Var.setText(d);
                            }
                        } else {
                            str = null;
                            z10 = false;
                        }
                        int size2 = arrayList.size();
                        st stVar4 = null;
                        int i15 = 0;
                        int i16 = 0;
                        while (i16 < size2) {
                            Object obj5 = arrayList.get(i16);
                            i16++;
                            st stVar5 = (st) obj5;
                            if (stVar5.f37417c.startsWith(d)) {
                                int i17 = i15 + 1;
                                str3 = str;
                                if (stVar5.f37417c.equals(d)) {
                                    if (stVar4 == null || !stVar4.f37417c.equals(stVar5.f37417c)) {
                                        i15 = i17;
                                    }
                                    stVar4 = stVar5;
                                } else {
                                    i15 = i17;
                                }
                            } else {
                                str3 = str;
                            }
                            str = str3;
                        }
                        String str8 = str;
                        if (i15 == 1 && stVar4 != null && str8 == null) {
                            str2 = d.substring(stVar4.f37417c.length()) + ng0Var.getText().toString();
                            d = stVar4.f37417c;
                            uj0Var.setText(d);
                        } else {
                            str2 = str8;
                        }
                        List list2 = (List) hashMap.get(d);
                        if (list2 == null) {
                            i10 = 0;
                            stVar = null;
                        } else if (list2.size() > 1) {
                            String string2 = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + d, null);
                            st stVar6 = (st) org.telegram.ui.Cells.q3.g(1, list2);
                            if (string2 != null) {
                                int size3 = arrayList.size();
                                int i18 = 0;
                                while (i18 < size3) {
                                    Object obj6 = arrayList.get(i18);
                                    i18++;
                                    stVar = (st) obj6;
                                    if (Objects.equals(stVar.d, string2)) {
                                        i10 = 0;
                                    }
                                }
                            }
                            stVar = stVar6;
                            i10 = 0;
                        } else {
                            i10 = 0;
                            stVar = (st) list2.get(0);
                        }
                        if (stVar == null) {
                            qg0Var.setCountryButtonText(null);
                            ng0Var.setHintText((String) null);
                            qg0Var.f36430x = 2;
                        } else {
                            qg0Var.H = true;
                            qg0Var.f36431y = stVar;
                            qg0Var.v(d, stVar);
                            qg0Var.f36430x = i10;
                        }
                        if (!z10) {
                            uj0Var.setSelection(uj0Var.getText().length());
                        }
                        if (str2 != null) {
                            ng0Var.requestFocus();
                            ng0Var.setText(str2);
                            ng0Var.setSelection(ng0Var.length());
                        }
                    }
                    qg0Var.I = false;
                    return;
                }
                return;
            case 11:
                wj0 wj0Var = (wj0) this.f35116b;
                HashMap hashMap2 = wj0Var.f39043x;
                ArrayList arrayList2 = wj0Var.f39042w;
                if (!wj0Var.E) {
                    wj0Var.E = true;
                    String d10 = gf.b.d(wj0Var.O.getText().toString(), false);
                    wj0Var.O.setText(d10);
                    String str9 = null;
                    if (d10.length() == 0) {
                        wj0Var.t(null);
                        wj0Var.Q.setHintText((String) null);
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
                                            Object obj8 = (st) org.telegram.ui.Cells.q3.g(1, list3);
                                            if (string3 != null) {
                                                int size4 = arrayList2.size();
                                                int i20 = 0;
                                                while (true) {
                                                    if (i20 < size4) {
                                                        Object obj9 = arrayList2.get(i20);
                                                        i20++;
                                                        st stVar7 = (st) obj9;
                                                        if (Objects.equals(stVar7.d, string3)) {
                                                            obj8 = stVar7;
                                                        }
                                                    }
                                                }
                                            }
                                            obj7 = obj8;
                                        } else {
                                            obj7 = (st) list3.get(0);
                                        }
                                    }
                                    if (obj7 != null) {
                                        str5 = d10.substring(i19) + wj0Var.Q.getText().toString();
                                        wj0Var.O.setText(str4);
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
                                str5 = str4.substring(1) + wj0Var.Q.getText().toString();
                                uj0 uj0Var2 = wj0Var.O;
                                str4 = str4.substring(0, 1);
                                uj0Var2.setText(str4);
                            }
                        } else {
                            str4 = d10;
                            str5 = null;
                            z11 = false;
                        }
                        int size5 = arrayList2.size();
                        st stVar8 = null;
                        int i21 = 0;
                        int i22 = 0;
                        while (i22 < size5) {
                            Object obj10 = arrayList2.get(i22);
                            i22++;
                            st stVar9 = (st) obj10;
                            if (stVar9.f37417c.startsWith(str4)) {
                                i21++;
                                if (stVar9.f37417c.equals(str4)) {
                                    stVar8 = stVar9;
                                }
                            }
                        }
                        if (i21 == 1 && stVar8 != null && str5 == null) {
                            str5 = str4.substring(stVar8.f37417c.length()) + wj0Var.Q.getText().toString();
                            uj0 uj0Var3 = wj0Var.O;
                            String str10 = stVar8.f37417c;
                            uj0Var3.setText(str10);
                            str4 = str10;
                        }
                        List list4 = (List) hashMap2.get(str4);
                        if (list4 == null) {
                            stVar2 = null;
                        } else if (list4.size() > 1) {
                            String string4 = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + str4, null);
                            st stVar10 = (st) org.telegram.ui.Cells.q3.g(1, list4);
                            if (string4 != null) {
                                int size6 = arrayList2.size();
                                int i23 = 0;
                                while (i23 < size6) {
                                    Object obj11 = arrayList2.get(i23);
                                    i23++;
                                    st stVar11 = (st) obj11;
                                    if (Objects.equals(stVar11.d, string4)) {
                                        stVar2 = stVar11;
                                    }
                                }
                            }
                            stVar2 = stVar10;
                        } else {
                            stVar2 = (st) list4.get(0);
                        }
                        if (stVar2 != null) {
                            wj0Var.G = true;
                            wj0Var.u(str4, stVar2);
                        } else {
                            wj0Var.t(null);
                            wj0Var.Q.setHintText((String) null);
                        }
                        if (!z11) {
                            uj0 uj0Var4 = wj0Var.O;
                            uj0Var4.setSelection(uj0Var4.getText().length());
                        }
                        if (str5 != null && str5.length() != 0) {
                            wj0Var.Q.requestFocus();
                            wj0Var.Q.setText(str5);
                            uj0 uj0Var5 = wj0Var.Q;
                            uj0Var5.setSelection(uj0Var5.length());
                        }
                    }
                    wj0Var.E = false;
                    wj0.q(wj0Var);
                    return;
                }
                return;
            case 12:
                in0 in0Var = (in0) this.f35116b;
                if (!in0Var.Z0 && in0Var.T0 != 0 && in0Var.Y[0].length() == in0Var.T0) {
                    in0Var.L.callOnClick();
                    return;
                }
                return;
            case 13:
                qo0 qo0Var = (qo0) this.f35116b;
                if (qo0Var.f36490c0 != 0 && editable.length() == qo0Var.f36490c0) {
                    qo0Var.A0(false);
                    return;
                }
                return;
            case 14:
                tq0 tq0Var = ((uq0) this.f35116b).f38191s0;
                if (tq0Var != null) {
                    tq0Var.b(editable);
                    return;
                }
                return;
            case 15:
                q51 q51Var = (q51) this.f35116b;
                org.telegram.ui.Cells.c6 c6Var = q51Var.h;
                if (c6Var.getText() != null && AndroidUtilities.trim(c6Var.getText(), null).length() != 0) {
                    str6 = c6Var.getText().toString();
                } else {
                    str6 = null;
                }
                q51Var.f35698y.v(str6, true, true);
                n61 n61Var = q51Var.f35693n;
                if (n61Var != null) {
                    n61Var.F1(null);
                    q51Var.f35693n.G1(TextUtils.isEmpty(str6), true);
                }
                if (c6Var != null) {
                    c6Var.clearAnimation();
                    c6Var.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.rr.h).start();
                }
                q51Var.c(false);
                return;
            case 16:
                String trim = editable.toString().trim();
                se1 se1Var = (se1) this.f35116b;
                String str11 = se1Var.f37267n;
                if (trim.length() > 0) {
                    se1Var.f37267n = trim.substring(0, 1).toUpperCase();
                } else {
                    se1Var.f37267n = "";
                }
                if (!str11.equals(se1Var.f37267n)) {
                    org.telegram.ui.Components.m80 m80Var = new org.telegram.ui.Components.m80(1, null);
                    m80Var.a(se1Var.f37267n);
                    org.telegram.ui.Components.rl0 rl0Var = se1Var.v;
                    if (rl0Var != null) {
                        rl0Var.b(m80Var, true);
                        return;
                    }
                    return;
                }
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f35116b;
                fg1 fg1Var = twoStepVerificationActivity.V;
                if (twoStepVerificationActivity.U) {
                    AndroidUtilities.cancelRunOnUIThread(fg1Var);
                    fg1Var.run();
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z10;
        int i13 = this.f35115a;
        Object obj = this.f35116b;
        switch (i13) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                return;
            case 5:
                xr xrVar = (xr) obj;
                if (charSequence.length() != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                xrVar.f32173x = z10;
                xrVar.v = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                xrVar.F = ofFloat;
                ofFloat.addUpdateListener(new c3(xrVar, 9));
                if (!xrVar.f32173x) {
                    xrVar.F.setInterpolator(new OvershootInterpolator(1.5f));
                    xrVar.F.setDuration(350L);
                } else {
                    xrVar.F.setDuration(220L);
                }
                xrVar.F.start();
                xrVar.hideActionMode();
                return;
            case 6:
                return;
            case 7:
                be0 be0Var = (be0) obj;
                ud0 ud0Var = be0Var.S;
                if (be0Var.R) {
                    be0Var.removeCallbacks(ud0Var);
                    ud0Var.run();
                    return;
                }
                return;
            case 8:
                ve0 ve0Var = (ve0) obj;
                te0 te0Var = ve0Var.f38375x;
                if (ve0Var.f38374w) {
                    ve0Var.removeCallbacks(te0Var);
                    te0Var.run();
                    return;
                }
                return;
            case 9:
                uf0 uf0Var = (uf0) obj;
                hf0 hf0Var = uf0Var.f38091r0;
                if (uf0Var.f38089q0) {
                    uf0Var.removeCallbacks(hf0Var);
                    hf0Var.run();
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
        switch (this.f35115a) {
            case 0:
                return;
            case 1:
                ld ldVar = (ld) this.f35116b;
                ldVar.d0(ldVar.f34943w.getText().toString());
                return;
            case 2:
                return;
            case 3:
                gp gpVar = (gp) this.f35116b;
                if (!gpVar.m0) {
                    String obj = gpVar.f33603a.getText().toString();
                    na naVar = gpVar.O;
                    if (naVar != null) {
                        naVar.b(obj);
                    }
                    gpVar.W(obj);
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
