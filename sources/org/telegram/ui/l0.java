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
public final class l0 implements TextWatcher {
    public final int f39462a;
    public final Object f39463b;

    public l0(Object obj, int i10) {
        this.f39462a = i10;
        this.f39463b = obj;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.web.k kVar;
        String obj;
        String str;
        boolean z10;
        String str2;
        int i10;
        tt ttVar;
        boolean z11;
        String str3;
        Object obj2;
        String str4;
        boolean z12;
        String str5;
        tt ttVar2;
        String str6;
        switch (this.f39462a) {
            case 0:
                h4 h4Var = (h4) this.f39463b;
                if (h4Var.f38273h0.W && (kVar = h4Var.f38274i0) != null) {
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
                uo uoVar = (uo) this.f39463b;
                uoVar.f42676r.n(5L, uoVar.v.getText().toString(), null);
                ai.z5 z5Var = uoVar.f42661e;
                if (z5Var != null) {
                    z5Var.invalidate();
                    return;
                }
                return;
            case 3:
                ((ip) this.f39463b).V();
                return;
            case 4:
                mq mqVar = (mq) this.f39463b;
                nq nqVar = mqVar.f40050e;
                if (!mqVar.d) {
                    nqVar.S = editable.toString();
                    s4.d1 K = nqVar.f40309b.K(nqVar.f40336u0);
                    if (K != null) {
                        nq.f0(nqVar, K.f47748a);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                return;
            case 6:
                c70 c70Var = (c70) this.f39463b;
                if (c70Var.f36593f.f30964r.length() != 0) {
                    a70 a70Var = c70Var.v;
                    boolean z13 = a70Var.f35906n;
                    if (!z13) {
                        c70Var.T = true;
                        c70Var.S = true;
                        if (!z13) {
                            a70Var.f35906n = true;
                            a70Var.l();
                        }
                        c70Var.f36601n.setFastScrollVisible(false);
                        c70Var.f36601n.setVerticalScrollBarEnabled(true);
                    }
                    c70Var.v.L(c70Var.f36593f.f30964r.getText().toString());
                    c70Var.f36608s.e(true, false);
                    return;
                }
                c70Var.T = false;
                c70Var.S = false;
                a70 a70Var2 = c70Var.v;
                if (a70Var2.f35906n) {
                    a70Var2.f35906n = false;
                    a70Var2.l();
                }
                c70Var.v.L(null);
                c70Var.f36601n.setFastScrollVisible(true);
                c70Var.f36601n.setVerticalScrollBarEnabled(false);
                c70Var.q0(0);
                return;
            case 7:
            case 8:
            case 9:
                return;
            case 10:
                ug0 ug0Var = (ug0) this.f39463b;
                HashMap hashMap = ug0Var.F;
                ArrayList arrayList = ug0Var.E;
                ak0 ak0Var = ug0Var.f42552a;
                rg0 rg0Var = ug0Var.f42553b;
                if (!ug0Var.I) {
                    int i11 = 1;
                    ug0Var.I = true;
                    int i12 = 0;
                    String d = hf.b.d(ak0Var.getText().toString(), false);
                    ak0Var.setText(d);
                    String str7 = null;
                    if (d.length() == 0) {
                        ug0Var.setCountryButtonText(null);
                        rg0Var.setHintText((String) null);
                        ug0Var.f42561x = 1;
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
                                        Object obj3 = (tt) sc.v.h(i11, list);
                                        if (string != null) {
                                            int size = arrayList.size();
                                            int i14 = i12;
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
                                        obj2 = (tt) list.get(i12);
                                    }
                                    if (obj2 != null) {
                                        str = d.substring(i13) + rg0Var.getText().toString();
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
                                str = d.substring(1) + rg0Var.getText().toString();
                                d = d.substring(0, 1);
                                ak0Var.setText(d);
                            }
                        } else {
                            str = null;
                            z10 = false;
                        }
                        int size2 = arrayList.size();
                        tt ttVar4 = null;
                        int i15 = 0;
                        int i16 = 0;
                        while (i16 < size2) {
                            Object obj5 = arrayList.get(i16);
                            i16++;
                            tt ttVar5 = (tt) obj5;
                            if (ttVar5.f42261c.startsWith(d)) {
                                int i17 = i15 + 1;
                                str3 = str;
                                if (ttVar5.f42261c.equals(d)) {
                                    if (ttVar4 == null || !ttVar4.f42261c.equals(ttVar5.f42261c)) {
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
                            str2 = d.substring(ttVar4.f42261c.length()) + rg0Var.getText().toString();
                            d = ttVar4.f42261c;
                            ak0Var.setText(d);
                        } else {
                            str2 = str8;
                        }
                        List list2 = (List) hashMap.get(d);
                        if (list2 == null) {
                            i10 = 0;
                            ttVar = null;
                        } else if (list2.size() > 1) {
                            String string2 = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + d, null);
                            tt ttVar6 = (tt) sc.v.h(1, list2);
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
                            ug0Var.setCountryButtonText(null);
                            rg0Var.setHintText((String) null);
                            ug0Var.f42561x = 2;
                        } else {
                            ug0Var.H = true;
                            ug0Var.f42562y = ttVar;
                            ug0Var.t(d, ttVar);
                            ug0Var.f42561x = i10;
                        }
                        if (!z10) {
                            ak0Var.setSelection(ak0Var.getText().length());
                        }
                        if (str2 != null) {
                            rg0Var.requestFocus();
                            rg0Var.setText(str2);
                            rg0Var.setSelection(rg0Var.length());
                        }
                        z11 = false;
                    }
                    ug0Var.I = z11;
                    return;
                }
                return;
            case 11:
                ck0 ck0Var = (ck0) this.f39463b;
                HashMap hashMap2 = ck0Var.f36776x;
                ArrayList arrayList2 = ck0Var.f36775w;
                if (!ck0Var.E) {
                    ck0Var.E = true;
                    String d10 = hf.b.d(ck0Var.O.getText().toString(), false);
                    ck0Var.O.setText(d10);
                    String str9 = null;
                    if (d10.length() == 0) {
                        ck0Var.v(null);
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
                                            Object obj8 = (tt) sc.v.h(1, list3);
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
                                        str5 = d10.substring(i19) + ck0Var.Q.getText().toString();
                                        ck0Var.O.setText(str4);
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
                                str5 = str4.substring(1) + ck0Var.Q.getText().toString();
                                ak0 ak0Var2 = ck0Var.O;
                                str4 = str4.substring(0, 1);
                                ak0Var2.setText(str4);
                            }
                        } else {
                            str4 = d10;
                            z12 = false;
                            str5 = null;
                        }
                        int size5 = arrayList2.size();
                        int i21 = 0;
                        int i22 = 0;
                        tt ttVar8 = null;
                        while (i22 < size5) {
                            Object obj10 = arrayList2.get(i22);
                            i22++;
                            tt ttVar9 = (tt) obj10;
                            if (ttVar9.f42261c.startsWith(str4)) {
                                i21++;
                                if (ttVar9.f42261c.equals(str4)) {
                                    ttVar8 = ttVar9;
                                }
                            }
                        }
                        if (i21 == 1 && ttVar8 != null && str5 == null) {
                            str5 = str4.substring(ttVar8.f42261c.length()) + ck0Var.Q.getText().toString();
                            ak0 ak0Var3 = ck0Var.O;
                            String str10 = ttVar8.f42261c;
                            ak0Var3.setText(str10);
                            str4 = str10;
                        }
                        List list4 = (List) hashMap2.get(str4);
                        if (list4 == null) {
                            ttVar2 = null;
                        } else if (list4.size() > 1) {
                            String string4 = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + str4, null);
                            tt ttVar10 = (tt) sc.v.h(1, list4);
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
                            ck0Var.G = true;
                            ck0Var.w(str4, ttVar2);
                        } else {
                            ck0Var.v(null);
                            ck0Var.Q.setHintText((String) null);
                        }
                        if (!z12) {
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
                    ck0.s(ck0Var);
                    return;
                }
                return;
            case 12:
                mn0 mn0Var = (mn0) this.f39463b;
                if (!mn0Var.Z0 && mn0Var.T0 != 0 && mn0Var.Y[0].length() == mn0Var.T0) {
                    mn0Var.L.callOnClick();
                    return;
                }
                return;
            case 13:
                uo0 uo0Var = (uo0) this.f39463b;
                if (uo0Var.f42699c0 != 0 && editable.length() == uo0Var.f42699c0) {
                    uo0Var.A0(false);
                    return;
                }
                return;
            case 14:
                zq0 zq0Var = ((ar0) this.f39463b).f36158s0;
                if (zq0Var != null) {
                    zq0Var.b(editable);
                    return;
                }
                return;
            case 15:
                a61 a61Var = (a61) this.f39463b;
                org.telegram.ui.Cells.c6 c6Var = a61Var.h;
                if (c6Var.getText() != null && AndroidUtilities.trim(c6Var.getText(), null).length() != 0) {
                    str6 = c6Var.getText().toString();
                } else {
                    str6 = null;
                }
                a61Var.f44272y.v(str6, true, true);
                x61 x61Var = a61Var.f44267n;
                if (x61Var != null) {
                    x61Var.G1(null);
                    a61Var.f44267n.H1(TextUtils.isEmpty(str6), true);
                }
                if (c6Var != null) {
                    c6Var.clearAnimation();
                    c6Var.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.is.h).start();
                }
                a61Var.c(false);
                return;
            case 16:
                String trim = editable.toString().trim();
                af1 af1Var = (af1) this.f39463b;
                String str11 = af1Var.f36059n;
                if (trim.length() > 0) {
                    af1Var.f36059n = trim.substring(0, 1).toUpperCase();
                } else {
                    af1Var.f36059n = "";
                }
                if (!str11.equals(af1Var.f36059n)) {
                    org.telegram.ui.Components.o90 o90Var = new org.telegram.ui.Components.o90(1, null);
                    o90Var.a(af1Var.f36059n);
                    org.telegram.ui.Components.xm0 xm0Var = af1Var.v;
                    if (xm0Var != null) {
                        xm0Var.b(o90Var, true);
                        return;
                    }
                    return;
                }
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f39463b;
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
        int i13 = this.f39462a;
        Object obj = this.f39463b;
        switch (i13) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                return;
            case 5:
                zr zrVar = (zr) obj;
                if (charSequence.length() != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zrVar.f37085x = z10;
                zrVar.v = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                zrVar.F = ofFloat;
                ofFloat.addUpdateListener(new b3(zrVar, 9));
                if (!zrVar.f37085x) {
                    org.telegram.messenger.ai.l(1.5f, zrVar.F);
                    zrVar.F.setDuration(350L);
                } else {
                    zrVar.F.setDuration(220L);
                }
                zrVar.F.start();
                zrVar.hideActionMode();
                return;
            case 6:
                return;
            case 7:
                ee0 ee0Var = (ee0) obj;
                xd0 xd0Var = ee0Var.S;
                if (ee0Var.R) {
                    ee0Var.removeCallbacks(xd0Var);
                    xd0Var.run();
                    return;
                }
                return;
            case 8:
                ye0 ye0Var = (ye0) obj;
                we0 we0Var = ye0Var.f44344x;
                if (ye0Var.f44343w) {
                    ye0Var.removeCallbacks(we0Var);
                    we0Var.run();
                    return;
                }
                return;
            case 9:
                yf0 yf0Var = (yf0) obj;
                kf0 kf0Var = yf0Var.f44380r0;
                if (yf0Var.f44378q0) {
                    yf0Var.removeCallbacks(kf0Var);
                    kf0Var.run();
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
        switch (this.f39462a) {
            case 0:
                return;
            case 1:
                ld ldVar = (ld) this.f39463b;
                ldVar.d0(ldVar.f39621w.getText().toString());
                return;
            case 2:
                return;
            case 3:
                ip ipVar = (ip) this.f39463b;
                if (!ipVar.m0) {
                    String obj = ipVar.f38735a.getText().toString();
                    na naVar = ipVar.O;
                    if (naVar != null) {
                        naVar.b(obj);
                    }
                    ipVar.W(obj);
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
