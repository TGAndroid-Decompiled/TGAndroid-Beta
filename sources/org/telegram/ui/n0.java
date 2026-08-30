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
public final class n0 implements TextWatcher {
    public final int f36420a;
    public final Object f36421b;

    public n0(Object obj, int i10) {
        this.f36420a = i10;
        this.f36421b = obj;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.web.k kVar;
        String obj;
        String str;
        boolean z4;
        String str2;
        int i10;
        st stVar;
        String str3;
        Object obj2;
        String str4;
        String str5;
        boolean z10;
        st stVar2;
        String str6;
        switch (this.f36420a) {
            case 0:
                l4 l4Var = (l4) this.f36421b;
                if (l4Var.f35933e0.T && (kVar = l4Var.f35934f0) != null) {
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
                po poVar = (po) this.f36421b;
                poVar.f37401r.n(5L, poVar.v.getText().toString(), null);
                nh.y3 y3Var = poVar.e;
                if (y3Var != null) {
                    y3Var.invalidate();
                    return;
                }
                return;
            case 3:
                ((dp) this.f36421b).V();
                return;
            case 4:
                iq iqVar = (iq) this.f36421b;
                jq jqVar = iqVar.e;
                if (!iqVar.d) {
                    jqVar.P = editable.toString();
                    f2.l1 K = jqVar.f35432b.K(jqVar.f35452r0);
                    if (K != null) {
                        jq.f0(jqVar, K.f5785a);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                return;
            case 6:
                y60 y60Var = (y60) this.f36421b;
                if (y60Var.f40419f.f23815r.length() != 0) {
                    w60 w60Var = y60Var.v;
                    boolean z11 = w60Var.f39348n;
                    if (!z11) {
                        y60Var.Q = true;
                        y60Var.P = true;
                        if (!z11) {
                            w60Var.f39348n = true;
                            w60Var.l();
                        }
                        y60Var.f40427n.setFastScrollVisible(false);
                        y60Var.f40427n.setVerticalScrollBarEnabled(true);
                    }
                    y60Var.v.L(y60Var.f40419f.f23815r.getText().toString());
                    y60Var.f40434s.e(true, false);
                    return;
                }
                y60Var.Q = false;
                y60Var.P = false;
                w60 w60Var2 = y60Var.v;
                if (w60Var2.f39348n) {
                    w60Var2.f39348n = false;
                    w60Var2.l();
                }
                y60Var.v.L(null);
                y60Var.f40427n.setFastScrollVisible(true);
                y60Var.f40427n.setVerticalScrollBarEnabled(false);
                y60Var.q0(0);
                return;
            case 7:
            case 8:
            case 9:
                return;
            case 10:
                mg0 mg0Var = (mg0) this.f36421b;
                HashMap hashMap = mg0Var.C;
                ArrayList arrayList = mg0Var.B;
                qj0 qj0Var = mg0Var.f36293a;
                jg0 jg0Var = mg0Var.f36294b;
                if (!mg0Var.F) {
                    int i11 = 1;
                    mg0Var.F = true;
                    int i12 = 0;
                    String d = se.b.d(qj0Var.getText().toString(), false);
                    qj0Var.setText(d);
                    String str7 = null;
                    if (d.length() == 0) {
                        mg0Var.setCountryButtonText(null);
                        jg0Var.setHintText((String) null);
                        mg0Var.f36301x = 1;
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
                                        Object obj3 = (st) yh.k(i11, list);
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
                                        str = d.substring(i13) + jg0Var.getText().toString();
                                        qj0Var.setText(substring);
                                        d = substring;
                                        z4 = true;
                                    } else {
                                        i13--;
                                        i11 = 1;
                                        i12 = 0;
                                        str7 = null;
                                    }
                                } else {
                                    str = null;
                                    z4 = false;
                                }
                            }
                            if (!z4) {
                                str = d.substring(1) + jg0Var.getText().toString();
                                d = d.substring(0, 1);
                                qj0Var.setText(d);
                            }
                        } else {
                            str = null;
                            z4 = false;
                        }
                        int size2 = arrayList.size();
                        st stVar4 = null;
                        int i15 = 0;
                        int i16 = 0;
                        while (i16 < size2) {
                            Object obj5 = arrayList.get(i16);
                            i16++;
                            st stVar5 = (st) obj5;
                            if (stVar5.f38437c.startsWith(d)) {
                                int i17 = i15 + 1;
                                str3 = str;
                                if (stVar5.f38437c.equals(d)) {
                                    if (stVar4 == null || !stVar4.f38437c.equals(stVar5.f38437c)) {
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
                            str2 = d.substring(stVar4.f38437c.length()) + jg0Var.getText().toString();
                            d = stVar4.f38437c;
                            qj0Var.setText(d);
                        } else {
                            str2 = str8;
                        }
                        List list2 = (List) hashMap.get(d);
                        if (list2 == null) {
                            i10 = 0;
                            stVar = null;
                        } else if (list2.size() > 1) {
                            String string2 = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + d, null);
                            st stVar6 = (st) yh.k(1, list2);
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
                            mg0Var.setCountryButtonText(null);
                            jg0Var.setHintText((String) null);
                            mg0Var.f36301x = 2;
                        } else {
                            mg0Var.E = true;
                            mg0Var.f36302y = stVar;
                            mg0Var.v(d, stVar);
                            mg0Var.f36301x = i10;
                        }
                        if (!z4) {
                            qj0Var.setSelection(qj0Var.getText().length());
                        }
                        if (str2 != null) {
                            jg0Var.requestFocus();
                            jg0Var.setText(str2);
                            jg0Var.setSelection(jg0Var.length());
                        }
                    }
                    mg0Var.F = false;
                    return;
                }
                return;
            case 11:
                sj0 sj0Var = (sj0) this.f36421b;
                HashMap hashMap2 = sj0Var.f38393x;
                ArrayList arrayList2 = sj0Var.f38392w;
                if (!sj0Var.B) {
                    sj0Var.B = true;
                    String d10 = se.b.d(sj0Var.L.getText().toString(), false);
                    sj0Var.L.setText(d10);
                    String str9 = null;
                    if (d10.length() == 0) {
                        sj0Var.t(null);
                        sj0Var.N.setHintText((String) null);
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
                                            Object obj8 = (st) yh.k(1, list3);
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
                                        str5 = d10.substring(i19) + sj0Var.N.getText().toString();
                                        sj0Var.L.setText(str4);
                                        z10 = true;
                                    } else {
                                        i19--;
                                        str9 = null;
                                    }
                                } else {
                                    str4 = d10;
                                    str5 = null;
                                    z10 = false;
                                }
                            }
                            if (!z10) {
                                str5 = str4.substring(1) + sj0Var.N.getText().toString();
                                qj0 qj0Var2 = sj0Var.L;
                                str4 = str4.substring(0, 1);
                                qj0Var2.setText(str4);
                            }
                        } else {
                            str4 = d10;
                            str5 = null;
                            z10 = false;
                        }
                        int size5 = arrayList2.size();
                        st stVar8 = null;
                        int i21 = 0;
                        int i22 = 0;
                        while (i22 < size5) {
                            Object obj10 = arrayList2.get(i22);
                            i22++;
                            st stVar9 = (st) obj10;
                            if (stVar9.f38437c.startsWith(str4)) {
                                i21++;
                                if (stVar9.f38437c.equals(str4)) {
                                    stVar8 = stVar9;
                                }
                            }
                        }
                        if (i21 == 1 && stVar8 != null && str5 == null) {
                            str5 = str4.substring(stVar8.f38437c.length()) + sj0Var.N.getText().toString();
                            qj0 qj0Var3 = sj0Var.L;
                            String str10 = stVar8.f38437c;
                            qj0Var3.setText(str10);
                            str4 = str10;
                        }
                        List list4 = (List) hashMap2.get(str4);
                        if (list4 == null) {
                            stVar2 = null;
                        } else if (list4.size() > 1) {
                            String string4 = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + str4, null);
                            st stVar10 = (st) yh.k(1, list4);
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
                            sj0Var.D = true;
                            sj0Var.u(str4, stVar2);
                        } else {
                            sj0Var.t(null);
                            sj0Var.N.setHintText((String) null);
                        }
                        if (!z10) {
                            qj0 qj0Var4 = sj0Var.L;
                            qj0Var4.setSelection(qj0Var4.getText().length());
                        }
                        if (str5 != null && str5.length() != 0) {
                            sj0Var.N.requestFocus();
                            sj0Var.N.setText(str5);
                            qj0 qj0Var5 = sj0Var.N;
                            qj0Var5.setSelection(qj0Var5.length());
                        }
                    }
                    sj0Var.B = false;
                    sj0.q(sj0Var);
                    return;
                }
                return;
            case 12:
                dn0 dn0Var = (dn0) this.f36421b;
                if (!dn0Var.W0 && dn0Var.Q0 != 0 && dn0Var.V[0].length() == dn0Var.Q0) {
                    dn0Var.I.callOnClick();
                    return;
                }
                return;
            case 13:
                jo0 jo0Var = (jo0) this.f36421b;
                if (jo0Var.Z != 0 && editable.length() == jo0Var.Z) {
                    jo0Var.A0(false);
                    return;
                }
                return;
            case 14:
                eq0 eq0Var = ((fq0) this.f36421b).f34332p0;
                if (eq0Var != null) {
                    eq0Var.b(editable);
                    return;
                }
                return;
            case 15:
                g51 g51Var = (g51) this.f36421b;
                dh.b bVar = g51Var.h;
                if (bVar.getText() != null && AndroidUtilities.trim(bVar.getText(), null).length() != 0) {
                    str6 = bVar.getText().toString();
                } else {
                    str6 = null;
                }
                g51Var.f33911y.v(str6, true, true);
                d61 d61Var = g51Var.f33906n;
                if (d61Var != null) {
                    d61Var.F1(null);
                    g51Var.f33906n.G1(TextUtils.isEmpty(str6), true);
                }
                if (bVar != null) {
                    bVar.clearAnimation();
                    bVar.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.nr.h).start();
                }
                g51Var.c(false);
                return;
            case 16:
                String trim = editable.toString().trim();
                fe1 fe1Var = (fe1) this.f36421b;
                String str11 = fe1Var.f34234n;
                if (trim.length() > 0) {
                    fe1Var.f34234n = trim.substring(0, 1).toUpperCase();
                } else {
                    fe1Var.f34234n = "";
                }
                if (!str11.equals(fe1Var.f34234n)) {
                    org.telegram.ui.Components.n80 n80Var = new org.telegram.ui.Components.n80(1, null);
                    n80Var.a(fe1Var.f34234n);
                    org.telegram.ui.Components.yl0 yl0Var = fe1Var.v;
                    if (yl0Var != null) {
                        yl0Var.b(n80Var, true);
                        return;
                    }
                    return;
                }
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f36421b;
                tf1 tf1Var = twoStepVerificationActivity.S;
                if (twoStepVerificationActivity.R) {
                    AndroidUtilities.cancelRunOnUIThread(tf1Var);
                    tf1Var.run();
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z4;
        int i13 = this.f36420a;
        Object obj = this.f36421b;
        switch (i13) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                return;
            case 5:
                wr wrVar = (wr) obj;
                if (charSequence.length() != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                wrVar.f33025x = z4;
                wrVar.v = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                wrVar.C = ofFloat;
                ofFloat.addUpdateListener(new e3(wrVar, 9));
                if (!wrVar.f33025x) {
                    wrVar.C.setInterpolator(new OvershootInterpolator(1.5f));
                    wrVar.C.setDuration(350L);
                } else {
                    wrVar.C.setDuration(220L);
                }
                wrVar.C.start();
                wrVar.hideActionMode();
                return;
            case 6:
                return;
            case 7:
                yd0 yd0Var = (yd0) obj;
                rd0 rd0Var = yd0Var.P;
                if (yd0Var.O) {
                    yd0Var.removeCallbacks(rd0Var);
                    rd0Var.run();
                    return;
                }
                return;
            case 8:
                se0 se0Var = (se0) obj;
                qe0 qe0Var = se0Var.f38320x;
                if (se0Var.f38319w) {
                    se0Var.removeCallbacks(qe0Var);
                    qe0Var.run();
                    return;
                }
                return;
            case 9:
                rf0 rf0Var = (rf0) obj;
                ef0 ef0Var = rf0Var.f38033o0;
                if (rf0Var.f38032n0) {
                    rf0Var.removeCallbacks(ef0Var);
                    ef0Var.run();
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
        switch (this.f36420a) {
            case 0:
                return;
            case 1:
                nd ndVar = (nd) this.f36421b;
                ndVar.d0(ndVar.f36602w.getText().toString());
                return;
            case 2:
                return;
            case 3:
                dp dpVar = (dp) this.f36421b;
                if (!dpVar.f33759j0) {
                    String obj = dpVar.f33746a.getText().toString();
                    ma maVar = dpVar.L;
                    if (maVar != null) {
                        maVar.b(obj);
                    }
                    dpVar.W(obj);
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
