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
    public final int f39716a;
    public final Object f39717b;

    public m0(Object obj, int i10) {
        this.f39716a = i10;
        this.f39717b = obj;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.web.k kVar;
        String obj;
        String str;
        boolean z10;
        String str2;
        int i10;
        ut utVar;
        boolean z11;
        String str3;
        Object obj2;
        String str4;
        boolean z12;
        String str5;
        ut utVar2;
        String str6;
        switch (this.f39716a) {
            case 0:
                i4 i4Var = (i4) this.f39717b;
                if (i4Var.f38501h0.W && (kVar = i4Var.f38502i0) != null) {
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
                uo uoVar = (uo) this.f39717b;
                uoVar.f42484r.n(5L, uoVar.v.getText().toString(), null);
                ai.z5 z5Var = uoVar.f42469e;
                if (z5Var != null) {
                    z5Var.invalidate();
                    return;
                }
                return;
            case 3:
                ((ip) this.f39717b).V();
                return;
            case 4:
                mq mqVar = (mq) this.f39717b;
                nq nqVar = mqVar.f39962e;
                if (!mqVar.d) {
                    nqVar.S = editable.toString();
                    s4.d1 K = nqVar.f40312b.K(nqVar.f40339u0);
                    if (K != null) {
                        nq.f0(nqVar, K.f47656a);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                return;
            case 6:
                c70 c70Var = (c70) this.f39717b;
                if (c70Var.f36549f.f30614r.length() != 0) {
                    a70 a70Var = c70Var.v;
                    boolean z13 = a70Var.f35860n;
                    if (!z13) {
                        c70Var.T = true;
                        c70Var.S = true;
                        if (!z13) {
                            a70Var.f35860n = true;
                            a70Var.l();
                        }
                        c70Var.f36557n.setFastScrollVisible(false);
                        c70Var.f36557n.setVerticalScrollBarEnabled(true);
                    }
                    c70Var.v.L(c70Var.f36549f.f30614r.getText().toString());
                    c70Var.f36564s.e(true, false);
                    return;
                }
                c70Var.T = false;
                c70Var.S = false;
                a70 a70Var2 = c70Var.v;
                if (a70Var2.f35860n) {
                    a70Var2.f35860n = false;
                    a70Var2.l();
                }
                c70Var.v.L(null);
                c70Var.f36557n.setFastScrollVisible(true);
                c70Var.f36557n.setVerticalScrollBarEnabled(false);
                c70Var.q0(0);
                return;
            case 7:
            case 8:
            case 9:
                return;
            case 10:
                vg0 vg0Var = (vg0) this.f39717b;
                HashMap hashMap = vg0Var.F;
                ArrayList arrayList = vg0Var.E;
                bk0 bk0Var = vg0Var.f42849a;
                sg0 sg0Var = vg0Var.f42850b;
                if (!vg0Var.I) {
                    int i11 = 1;
                    vg0Var.I = true;
                    int i12 = 0;
                    String d = hf.b.d(bk0Var.getText().toString(), false);
                    bk0Var.setText(d);
                    String str7 = null;
                    if (d.length() == 0) {
                        vg0Var.setCountryButtonText(null);
                        sg0Var.setHintText((String) null);
                        vg0Var.f42858x = 1;
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
                                        Object obj3 = (ut) sc.v.h(i11, list);
                                        if (string != null) {
                                            int size = arrayList.size();
                                            int i14 = i12;
                                            while (true) {
                                                if (i14 < size) {
                                                    Object obj4 = arrayList.get(i14);
                                                    i14++;
                                                    ut utVar3 = (ut) obj4;
                                                    if (Objects.equals(utVar3.d, string)) {
                                                        obj3 = utVar3;
                                                    }
                                                }
                                            }
                                        }
                                        obj2 = obj3;
                                    } else {
                                        obj2 = (ut) list.get(i12);
                                    }
                                    if (obj2 != null) {
                                        str = d.substring(i13) + sg0Var.getText().toString();
                                        bk0Var.setText(substring);
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
                                bk0Var.setText(d);
                            }
                        } else {
                            str = null;
                            z10 = false;
                        }
                        int size2 = arrayList.size();
                        ut utVar4 = null;
                        int i15 = 0;
                        int i16 = 0;
                        while (i16 < size2) {
                            Object obj5 = arrayList.get(i16);
                            i16++;
                            ut utVar5 = (ut) obj5;
                            if (utVar5.f42549c.startsWith(d)) {
                                int i17 = i15 + 1;
                                str3 = str;
                                if (utVar5.f42549c.equals(d)) {
                                    if (utVar4 == null || !utVar4.f42549c.equals(utVar5.f42549c)) {
                                        i15 = i17;
                                    }
                                    utVar4 = utVar5;
                                } else {
                                    i15 = i17;
                                }
                            } else {
                                str3 = str;
                            }
                            str = str3;
                        }
                        String str8 = str;
                        if (i15 == 1 && utVar4 != null && str8 == null) {
                            str2 = d.substring(utVar4.f42549c.length()) + sg0Var.getText().toString();
                            d = utVar4.f42549c;
                            bk0Var.setText(d);
                        } else {
                            str2 = str8;
                        }
                        List list2 = (List) hashMap.get(d);
                        if (list2 == null) {
                            i10 = 0;
                            utVar = null;
                        } else if (list2.size() > 1) {
                            String string2 = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + d, null);
                            ut utVar6 = (ut) sc.v.h(1, list2);
                            if (string2 != null) {
                                int size3 = arrayList.size();
                                int i18 = 0;
                                while (i18 < size3) {
                                    Object obj6 = arrayList.get(i18);
                                    i18++;
                                    utVar = (ut) obj6;
                                    if (Objects.equals(utVar.d, string2)) {
                                        i10 = 0;
                                    }
                                }
                            }
                            utVar = utVar6;
                            i10 = 0;
                        } else {
                            i10 = 0;
                            utVar = (ut) list2.get(0);
                        }
                        if (utVar == null) {
                            vg0Var.setCountryButtonText(null);
                            sg0Var.setHintText((String) null);
                            vg0Var.f42858x = 2;
                        } else {
                            vg0Var.H = true;
                            vg0Var.f42859y = utVar;
                            vg0Var.t(d, utVar);
                            vg0Var.f42858x = i10;
                        }
                        if (!z10) {
                            bk0Var.setSelection(bk0Var.getText().length());
                        }
                        if (str2 != null) {
                            sg0Var.requestFocus();
                            sg0Var.setText(str2);
                            sg0Var.setSelection(sg0Var.length());
                        }
                        z11 = false;
                    }
                    vg0Var.I = z11;
                    return;
                }
                return;
            case 11:
                dk0 dk0Var = (dk0) this.f39717b;
                HashMap hashMap2 = dk0Var.f37040x;
                ArrayList arrayList2 = dk0Var.f37039w;
                if (!dk0Var.E) {
                    dk0Var.E = true;
                    String d10 = hf.b.d(dk0Var.O.getText().toString(), false);
                    dk0Var.O.setText(d10);
                    String str9 = null;
                    if (d10.length() == 0) {
                        dk0Var.v(null);
                        dk0Var.Q.setHintText((String) null);
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
                                            Object obj8 = (ut) sc.v.h(1, list3);
                                            if (string3 != null) {
                                                int size4 = arrayList2.size();
                                                int i20 = 0;
                                                while (true) {
                                                    if (i20 < size4) {
                                                        Object obj9 = arrayList2.get(i20);
                                                        i20++;
                                                        ut utVar7 = (ut) obj9;
                                                        if (Objects.equals(utVar7.d, string3)) {
                                                            obj8 = utVar7;
                                                        }
                                                    }
                                                }
                                            }
                                            obj7 = obj8;
                                        } else {
                                            obj7 = (ut) list3.get(0);
                                        }
                                    }
                                    if (obj7 != null) {
                                        str5 = d10.substring(i19) + dk0Var.Q.getText().toString();
                                        dk0Var.O.setText(str4);
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
                                str5 = str4.substring(1) + dk0Var.Q.getText().toString();
                                bk0 bk0Var2 = dk0Var.O;
                                str4 = str4.substring(0, 1);
                                bk0Var2.setText(str4);
                            }
                        } else {
                            str4 = d10;
                            z12 = false;
                            str5 = null;
                        }
                        int size5 = arrayList2.size();
                        int i21 = 0;
                        int i22 = 0;
                        ut utVar8 = null;
                        while (i22 < size5) {
                            Object obj10 = arrayList2.get(i22);
                            i22++;
                            ut utVar9 = (ut) obj10;
                            if (utVar9.f42549c.startsWith(str4)) {
                                i21++;
                                if (utVar9.f42549c.equals(str4)) {
                                    utVar8 = utVar9;
                                }
                            }
                        }
                        if (i21 == 1 && utVar8 != null && str5 == null) {
                            str5 = str4.substring(utVar8.f42549c.length()) + dk0Var.Q.getText().toString();
                            bk0 bk0Var3 = dk0Var.O;
                            String str10 = utVar8.f42549c;
                            bk0Var3.setText(str10);
                            str4 = str10;
                        }
                        List list4 = (List) hashMap2.get(str4);
                        if (list4 == null) {
                            utVar2 = null;
                        } else if (list4.size() > 1) {
                            String string4 = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + str4, null);
                            ut utVar10 = (ut) sc.v.h(1, list4);
                            if (string4 != null) {
                                int size6 = arrayList2.size();
                                int i23 = 0;
                                while (i23 < size6) {
                                    Object obj11 = arrayList2.get(i23);
                                    i23++;
                                    ut utVar11 = (ut) obj11;
                                    if (Objects.equals(utVar11.d, string4)) {
                                        utVar2 = utVar11;
                                    }
                                }
                            }
                            utVar2 = utVar10;
                        } else {
                            utVar2 = (ut) list4.get(0);
                        }
                        if (utVar2 != null) {
                            dk0Var.G = true;
                            dk0Var.w(str4, utVar2);
                        } else {
                            dk0Var.v(null);
                            dk0Var.Q.setHintText((String) null);
                        }
                        if (!z12) {
                            bk0 bk0Var4 = dk0Var.O;
                            bk0Var4.setSelection(bk0Var4.getText().length());
                        }
                        if (str5 != null && str5.length() != 0) {
                            dk0Var.Q.requestFocus();
                            dk0Var.Q.setText(str5);
                            bk0 bk0Var5 = dk0Var.Q;
                            bk0Var5.setSelection(bk0Var5.length());
                        }
                    }
                    dk0Var.E = false;
                    dk0.s(dk0Var);
                    return;
                }
                return;
            case 12:
                nn0 nn0Var = (nn0) this.f39717b;
                if (!nn0Var.Z0 && nn0Var.T0 != 0 && nn0Var.Y[0].length() == nn0Var.T0) {
                    nn0Var.L.callOnClick();
                    return;
                }
                return;
            case 13:
                vo0 vo0Var = (vo0) this.f39717b;
                if (vo0Var.f42918c0 != 0 && editable.length() == vo0Var.f42918c0) {
                    vo0Var.A0(false);
                    return;
                }
                return;
            case 14:
                ar0 ar0Var = ((br0) this.f39717b).f36412s0;
                if (ar0Var != null) {
                    ar0Var.b(editable);
                    return;
                }
                return;
            case 15:
                b61 b61Var = (b61) this.f39717b;
                org.telegram.ui.Cells.c6 c6Var = b61Var.h;
                if (c6Var.getText() != null && AndroidUtilities.trim(c6Var.getText(), null).length() != 0) {
                    str6 = c6Var.getText().toString();
                } else {
                    str6 = null;
                }
                b61Var.f44500y.v(str6, true, true);
                y61 y61Var = b61Var.f44495n;
                if (y61Var != null) {
                    y61Var.G1(null);
                    b61Var.f44495n.H1(TextUtils.isEmpty(str6), true);
                }
                if (c6Var != null) {
                    c6Var.clearAnimation();
                    c6Var.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.hs.h).start();
                }
                b61Var.c(false);
                return;
            case 16:
                String trim = editable.toString().trim();
                bf1 bf1Var = (bf1) this.f39717b;
                String str11 = bf1Var.f36300n;
                if (trim.length() > 0) {
                    bf1Var.f36300n = trim.substring(0, 1).toUpperCase();
                } else {
                    bf1Var.f36300n = "";
                }
                if (!str11.equals(bf1Var.f36300n)) {
                    org.telegram.ui.Components.n90 n90Var = new org.telegram.ui.Components.n90(1, null);
                    n90Var.a(bf1Var.f36300n);
                    org.telegram.ui.Components.vm0 vm0Var = bf1Var.v;
                    if (vm0Var != null) {
                        vm0Var.b(n90Var, true);
                        return;
                    }
                    return;
                }
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f39717b;
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
        int i13 = this.f39716a;
        Object obj = this.f39717b;
        switch (i13) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                return;
            case 5:
                as asVar = (as) obj;
                if (charSequence.length() != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                asVar.f37325x = z10;
                asVar.v = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                asVar.F = ofFloat;
                ofFloat.addUpdateListener(new c3(asVar, 9));
                if (!asVar.f37325x) {
                    org.telegram.messenger.bi.l(1.5f, asVar.F);
                    asVar.F.setDuration(350L);
                } else {
                    asVar.F.setDuration(220L);
                }
                asVar.F.start();
                asVar.hideActionMode();
                return;
            case 6:
                return;
            case 7:
                fe0 fe0Var = (fe0) obj;
                yd0 yd0Var = fe0Var.S;
                if (fe0Var.R) {
                    fe0Var.removeCallbacks(yd0Var);
                    yd0Var.run();
                    return;
                }
                return;
            case 8:
                ze0 ze0Var = (ze0) obj;
                xe0 xe0Var = ze0Var.f44572x;
                if (ze0Var.f44571w) {
                    ze0Var.removeCallbacks(xe0Var);
                    xe0Var.run();
                    return;
                }
                return;
            case 9:
                zf0 zf0Var = (zf0) obj;
                lf0 lf0Var = zf0Var.f44608r0;
                if (zf0Var.f44606q0) {
                    zf0Var.removeCallbacks(lf0Var);
                    lf0Var.run();
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
        switch (this.f39716a) {
            case 0:
                return;
            case 1:
                md mdVar = (md) this.f39717b;
                mdVar.d0(mdVar.f39865w.getText().toString());
                return;
            case 2:
                return;
            case 3:
                ip ipVar = (ip) this.f39717b;
                if (!ipVar.m0) {
                    String obj = ipVar.f38706a.getText().toString();
                    oa oaVar = ipVar.O;
                    if (oaVar != null) {
                        oaVar.b(obj);
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
