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
    public final int f39148a;
    public final Object f39149b;

    public n0(Object obj, int i10) {
        this.f39148a = i10;
        this.f39149b = obj;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.web.k kVar;
        String obj;
        String str;
        boolean z4;
        String str2;
        int i10;
        tt ttVar;
        String str3;
        Object obj2;
        String str4;
        String str5;
        boolean z10;
        tt ttVar2;
        String str6;
        switch (this.f39148a) {
            case 0:
                l4 l4Var = (l4) this.f39149b;
                if (l4Var.f38512e0.T && (kVar = l4Var.f38513f0) != null) {
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
                po poVar = (po) this.f39149b;
                poVar.f40078r.n(5L, poVar.v.getText().toString(), null);
                oh.a4 a4Var = poVar.f40063e;
                if (a4Var != null) {
                    a4Var.invalidate();
                    return;
                }
                return;
            case 3:
                ((ep) this.f39149b).V();
                return;
            case 4:
                jq jqVar = (jq) this.f39149b;
                kq kqVar = jqVar.f38110e;
                if (!jqVar.d) {
                    kqVar.P = editable.toString();
                    f2.m1 K = kqVar.f38367b.K(kqVar.f38388r0);
                    if (K != null) {
                        kq.f0(kqVar, K.f5875a);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                return;
            case 6:
                z60 z60Var = (z60) this.f39149b;
                if (z60Var.f43820f.f26132r.length() != 0) {
                    x60 x60Var = z60Var.v;
                    boolean z11 = x60Var.f42940n;
                    if (!z11) {
                        z60Var.Q = true;
                        z60Var.P = true;
                        if (!z11) {
                            x60Var.f42940n = true;
                            x60Var.l();
                        }
                        z60Var.f43828n.setFastScrollVisible(false);
                        z60Var.f43828n.setVerticalScrollBarEnabled(true);
                    }
                    z60Var.v.L(z60Var.f43820f.f26132r.getText().toString());
                    z60Var.f43835s.e(true, false);
                    return;
                }
                z60Var.Q = false;
                z60Var.P = false;
                x60 x60Var2 = z60Var.v;
                if (x60Var2.f42940n) {
                    x60Var2.f42940n = false;
                    x60Var2.l();
                }
                z60Var.v.L(null);
                z60Var.f43828n.setFastScrollVisible(true);
                z60Var.f43828n.setVerticalScrollBarEnabled(false);
                z60Var.q0(0);
                return;
            case 7:
            case 8:
            case 9:
                return;
            case 10:
                ng0 ng0Var = (ng0) this.f39149b;
                HashMap hashMap = ng0Var.C;
                ArrayList arrayList = ng0Var.B;
                rj0 rj0Var = ng0Var.f39343a;
                kg0 kg0Var = ng0Var.f39344b;
                if (!ng0Var.F) {
                    int i11 = 1;
                    ng0Var.F = true;
                    int i12 = 0;
                    String d = se.b.d(rj0Var.getText().toString(), false);
                    rj0Var.setText(d);
                    String str7 = null;
                    if (d.length() == 0) {
                        ng0Var.setCountryButtonText(null);
                        kg0Var.setHintText((String) null);
                        ng0Var.f39352x = 1;
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
                                        Object obj3 = (tt) yh.j(i11, list);
                                        if (string != null) {
                                            int size = arrayList.size();
                                            int i14 = 0;
                                            while (true) {
                                                if (i14 < size) {
                                                    Object obj4 = arrayList.get(i14);
                                                    i14++;
                                                    tt ttVar3 = (tt) obj4;
                                                    if (Objects.equals(ttVar3.d, string)) {
                                                        obj3 = ttVar3;
                                                    }
                                                }
                                            }
                                        }
                                        obj2 = obj3;
                                    } else {
                                        obj2 = (tt) list.get(0);
                                    }
                                    if (obj2 != null) {
                                        str = d.substring(i13) + kg0Var.getText().toString();
                                        rj0Var.setText(substring);
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
                                str = d.substring(1) + kg0Var.getText().toString();
                                d = d.substring(0, 1);
                                rj0Var.setText(d);
                            }
                        } else {
                            str = null;
                            z4 = false;
                        }
                        int size2 = arrayList.size();
                        tt ttVar4 = null;
                        int i15 = 0;
                        int i16 = 0;
                        while (i16 < size2) {
                            Object obj5 = arrayList.get(i16);
                            i16++;
                            tt ttVar5 = (tt) obj5;
                            if (ttVar5.f41633c.startsWith(d)) {
                                int i17 = i15 + 1;
                                str3 = str;
                                if (ttVar5.f41633c.equals(d)) {
                                    if (ttVar4 == null || !ttVar4.f41633c.equals(ttVar5.f41633c)) {
                                        i15 = i17;
                                    }
                                    ttVar4 = ttVar5;
                                } else {
                                    i15 = i17;
                                }
                            } else {
                                str3 = str;
                            }
                            str = str3;
                        }
                        String str8 = str;
                        if (i15 == 1 && ttVar4 != null && str8 == null) {
                            str2 = d.substring(ttVar4.f41633c.length()) + kg0Var.getText().toString();
                            d = ttVar4.f41633c;
                            rj0Var.setText(d);
                        } else {
                            str2 = str8;
                        }
                        List list2 = (List) hashMap.get(d);
                        if (list2 == null) {
                            i10 = 0;
                            ttVar = null;
                        } else if (list2.size() > 1) {
                            String string2 = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + d, null);
                            tt ttVar6 = (tt) yh.j(1, list2);
                            if (string2 != null) {
                                int size3 = arrayList.size();
                                int i18 = 0;
                                while (i18 < size3) {
                                    Object obj6 = arrayList.get(i18);
                                    i18++;
                                    ttVar = (tt) obj6;
                                    if (Objects.equals(ttVar.d, string2)) {
                                        i10 = 0;
                                    }
                                }
                            }
                            ttVar = ttVar6;
                            i10 = 0;
                        } else {
                            i10 = 0;
                            ttVar = (tt) list2.get(0);
                        }
                        if (ttVar == null) {
                            ng0Var.setCountryButtonText(null);
                            kg0Var.setHintText((String) null);
                            ng0Var.f39352x = 2;
                        } else {
                            ng0Var.E = true;
                            ng0Var.f39353y = ttVar;
                            ng0Var.v(d, ttVar);
                            ng0Var.f39352x = i10;
                        }
                        if (!z4) {
                            rj0Var.setSelection(rj0Var.getText().length());
                        }
                        if (str2 != null) {
                            kg0Var.requestFocus();
                            kg0Var.setText(str2);
                            kg0Var.setSelection(kg0Var.length());
                        }
                    }
                    ng0Var.F = false;
                    return;
                }
                return;
            case 11:
                uj0 uj0Var = (uj0) this.f39149b;
                HashMap hashMap2 = uj0Var.f41861x;
                ArrayList arrayList2 = uj0Var.f41860w;
                if (!uj0Var.B) {
                    uj0Var.B = true;
                    String d10 = se.b.d(uj0Var.L.getText().toString(), false);
                    uj0Var.L.setText(d10);
                    String str9 = null;
                    if (d10.length() == 0) {
                        uj0Var.t(null);
                        uj0Var.N.setHintText((String) null);
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
                                            Object obj8 = (tt) yh.j(1, list3);
                                            if (string3 != null) {
                                                int size4 = arrayList2.size();
                                                int i20 = 0;
                                                while (true) {
                                                    if (i20 < size4) {
                                                        Object obj9 = arrayList2.get(i20);
                                                        i20++;
                                                        tt ttVar7 = (tt) obj9;
                                                        if (Objects.equals(ttVar7.d, string3)) {
                                                            obj8 = ttVar7;
                                                        }
                                                    }
                                                }
                                            }
                                            obj7 = obj8;
                                        } else {
                                            obj7 = (tt) list3.get(0);
                                        }
                                    }
                                    if (obj7 != null) {
                                        str5 = d10.substring(i19) + uj0Var.N.getText().toString();
                                        uj0Var.L.setText(str4);
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
                                str5 = str4.substring(1) + uj0Var.N.getText().toString();
                                rj0 rj0Var2 = uj0Var.L;
                                str4 = str4.substring(0, 1);
                                rj0Var2.setText(str4);
                            }
                        } else {
                            str4 = d10;
                            str5 = null;
                            z10 = false;
                        }
                        int size5 = arrayList2.size();
                        tt ttVar8 = null;
                        int i21 = 0;
                        int i22 = 0;
                        while (i22 < size5) {
                            Object obj10 = arrayList2.get(i22);
                            i22++;
                            tt ttVar9 = (tt) obj10;
                            if (ttVar9.f41633c.startsWith(str4)) {
                                i21++;
                                if (ttVar9.f41633c.equals(str4)) {
                                    ttVar8 = ttVar9;
                                }
                            }
                        }
                        if (i21 == 1 && ttVar8 != null && str5 == null) {
                            str5 = str4.substring(ttVar8.f41633c.length()) + uj0Var.N.getText().toString();
                            rj0 rj0Var3 = uj0Var.L;
                            String str10 = ttVar8.f41633c;
                            rj0Var3.setText(str10);
                            str4 = str10;
                        }
                        List list4 = (List) hashMap2.get(str4);
                        if (list4 == null) {
                            ttVar2 = null;
                        } else if (list4.size() > 1) {
                            String string4 = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + str4, null);
                            tt ttVar10 = (tt) yh.j(1, list4);
                            if (string4 != null) {
                                int size6 = arrayList2.size();
                                int i23 = 0;
                                while (i23 < size6) {
                                    Object obj11 = arrayList2.get(i23);
                                    i23++;
                                    tt ttVar11 = (tt) obj11;
                                    if (Objects.equals(ttVar11.d, string4)) {
                                        ttVar2 = ttVar11;
                                    }
                                }
                            }
                            ttVar2 = ttVar10;
                        } else {
                            ttVar2 = (tt) list4.get(0);
                        }
                        if (ttVar2 != null) {
                            uj0Var.D = true;
                            uj0Var.u(str4, ttVar2);
                        } else {
                            uj0Var.t(null);
                            uj0Var.N.setHintText((String) null);
                        }
                        if (!z10) {
                            rj0 rj0Var4 = uj0Var.L;
                            rj0Var4.setSelection(rj0Var4.getText().length());
                        }
                        if (str5 != null && str5.length() != 0) {
                            uj0Var.N.requestFocus();
                            uj0Var.N.setText(str5);
                            rj0 rj0Var5 = uj0Var.N;
                            rj0Var5.setSelection(rj0Var5.length());
                        }
                    }
                    uj0Var.B = false;
                    uj0.q(uj0Var);
                    return;
                }
                return;
            case 12:
                fn0 fn0Var = (fn0) this.f39149b;
                if (!fn0Var.W0 && fn0Var.Q0 != 0 && fn0Var.V[0].length() == fn0Var.Q0) {
                    fn0Var.I.callOnClick();
                    return;
                }
                return;
            case 13:
                lo0 lo0Var = (lo0) this.f39149b;
                if (lo0Var.Z != 0 && editable.length() == lo0Var.Z) {
                    lo0Var.A0(false);
                    return;
                }
                return;
            case 14:
                lq0 lq0Var = ((mq0) this.f39149b).f39051p0;
                if (lq0Var != null) {
                    lq0Var.c(editable);
                    return;
                }
                return;
            case 15:
                n51 n51Var = (n51) this.f39149b;
                eh.b bVar = n51Var.h;
                if (bVar.getText() != null && AndroidUtilities.trim(bVar.getText(), null).length() != 0) {
                    str6 = bVar.getText().toString();
                } else {
                    str6 = null;
                }
                n51Var.f38561y.v(str6, true, true);
                k61 k61Var = n51Var.f38556n;
                if (k61Var != null) {
                    k61Var.E1(null);
                    n51Var.f38556n.F1(TextUtils.isEmpty(str6), true);
                }
                if (bVar != null) {
                    bVar.clearAnimation();
                    bVar.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.pr.h).start();
                }
                n51Var.c(false);
                return;
            case 16:
                String trim = editable.toString().trim();
                oe1 oe1Var = (oe1) this.f39149b;
                String str11 = oe1Var.f39681n;
                if (trim.length() > 0) {
                    oe1Var.f39681n = trim.substring(0, 1).toUpperCase();
                } else {
                    oe1Var.f39681n = "";
                }
                if (!str11.equals(oe1Var.f39681n)) {
                    org.telegram.ui.Components.o80 o80Var = new org.telegram.ui.Components.o80(1, null);
                    o80Var.a(oe1Var.f39681n);
                    org.telegram.ui.Components.yl0 yl0Var = oe1Var.v;
                    if (yl0Var != null) {
                        yl0Var.b(o80Var, true);
                        return;
                    }
                    return;
                }
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f39149b;
                bg1 bg1Var = twoStepVerificationActivity.S;
                if (twoStepVerificationActivity.R) {
                    AndroidUtilities.cancelRunOnUIThread(bg1Var);
                    bg1Var.run();
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z4;
        int i13 = this.f39148a;
        Object obj = this.f39149b;
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
                    z4 = true;
                } else {
                    z4 = false;
                }
                xrVar.f35854x = z4;
                xrVar.v = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                xrVar.C = ofFloat;
                ofFloat.addUpdateListener(new e3(xrVar, 9));
                if (!xrVar.f35854x) {
                    xrVar.C.setInterpolator(new OvershootInterpolator(1.5f));
                    xrVar.C.setDuration(350L);
                } else {
                    xrVar.C.setDuration(220L);
                }
                xrVar.C.start();
                xrVar.hideActionMode();
                return;
            case 6:
                return;
            case 7:
                zd0 zd0Var = (zd0) obj;
                sd0 sd0Var = zd0Var.P;
                if (zd0Var.O) {
                    zd0Var.removeCallbacks(sd0Var);
                    sd0Var.run();
                    return;
                }
                return;
            case 8:
                se0 se0Var = (se0) obj;
                qe0 qe0Var = se0Var.f41148x;
                if (se0Var.f41147w) {
                    se0Var.removeCallbacks(qe0Var);
                    qe0Var.run();
                    return;
                }
                return;
            case 9:
                sf0 sf0Var = (sf0) obj;
                ff0 ff0Var = sf0Var.f41180o0;
                if (sf0Var.f41179n0) {
                    sf0Var.removeCallbacks(ff0Var);
                    ff0Var.run();
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
        switch (this.f39148a) {
            case 0:
                return;
            case 1:
                nd ndVar = (nd) this.f39149b;
                ndVar.d0(ndVar.f39324w.getText().toString());
                return;
            case 2:
                return;
            case 3:
                ep epVar = (ep) this.f39149b;
                if (!epVar.f36550j0) {
                    String obj = epVar.f36536a.getText().toString();
                    ma maVar = epVar.L;
                    if (maVar != null) {
                        maVar.b(obj);
                    }
                    epVar.W(obj);
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
