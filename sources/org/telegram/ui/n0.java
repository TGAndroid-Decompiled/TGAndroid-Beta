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
    public final int f35783a;
    public final Object f35784b;

    public n0(Object obj, int i10) {
        this.f35783a = i10;
        this.f35784b = obj;
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
        String str3;
        Object obj2;
        String str4;
        String str5;
        boolean z11;
        tt ttVar2;
        String str6;
        switch (this.f35783a) {
            case 0:
                j4 j4Var = (j4) this.f35784b;
                if (j4Var.f34615h0.W && (kVar = j4Var.f34616i0) != null) {
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
                so soVar = (so) this.f35784b;
                soVar.f37524r.n(5L, soVar.v.getText().toString(), null);
                ai.y5 y5Var = soVar.e;
                if (y5Var != null) {
                    y5Var.invalidate();
                    return;
                }
                return;
            case 3:
                ((gp) this.f35784b).V();
                return;
            case 4:
                kq kqVar = (kq) this.f35784b;
                lq lqVar = kqVar.e;
                if (!kqVar.d) {
                    lqVar.S = editable.toString();
                    s4.c1 L = lqVar.f35405b.L(lqVar.f35431u0);
                    if (L != null) {
                        lq.f0(lqVar, L.f43005a);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                return;
            case 6:
                c70 c70Var = (c70) this.f35784b;
                if (c70Var.f32543f.f23850r.length() != 0) {
                    a70 a70Var = c70Var.v;
                    boolean z12 = a70Var.f31987n;
                    if (!z12) {
                        c70Var.T = true;
                        c70Var.S = true;
                        if (!z12) {
                            a70Var.f31987n = true;
                            a70Var.l();
                        }
                        c70Var.f32551n.setFastScrollVisible(false);
                        c70Var.f32551n.setVerticalScrollBarEnabled(true);
                    }
                    c70Var.v.L(c70Var.f32543f.f23850r.getText().toString());
                    c70Var.f32558s.e(true, false);
                    return;
                }
                c70Var.T = false;
                c70Var.S = false;
                a70 a70Var2 = c70Var.v;
                if (a70Var2.f31987n) {
                    a70Var2.f31987n = false;
                    a70Var2.l();
                }
                c70Var.v.L(null);
                c70Var.f32551n.setFastScrollVisible(true);
                c70Var.f32551n.setVerticalScrollBarEnabled(false);
                c70Var.q0(0);
                return;
            case 7:
            case 8:
            case 9:
                return;
            case 10:
                sg0 sg0Var = (sg0) this.f35784b;
                HashMap hashMap = sg0Var.F;
                ArrayList arrayList = sg0Var.E;
                wj0 wj0Var = sg0Var.f37448a;
                pg0 pg0Var = sg0Var.f37449b;
                if (!sg0Var.I) {
                    int i11 = 1;
                    sg0Var.I = true;
                    int i12 = 0;
                    String d = gf.b.d(wj0Var.getText().toString(), false);
                    wj0Var.setText(d);
                    String str7 = null;
                    if (d.length() == 0) {
                        sg0Var.setCountryButtonText(null);
                        pg0Var.setHintText((String) null);
                        sg0Var.f37456x = 1;
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
                                        Object obj3 = (tt) org.telegram.ui.Cells.c1.i(i11, list);
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
                                        str = d.substring(i13) + pg0Var.getText().toString();
                                        wj0Var.setText(substring);
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
                                str = d.substring(1) + pg0Var.getText().toString();
                                d = d.substring(0, 1);
                                wj0Var.setText(d);
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
                            if (ttVar5.f37910c.startsWith(d)) {
                                int i17 = i15 + 1;
                                str3 = str;
                                if (ttVar5.f37910c.equals(d)) {
                                    if (ttVar4 == null || !ttVar4.f37910c.equals(ttVar5.f37910c)) {
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
                            str2 = d.substring(ttVar4.f37910c.length()) + pg0Var.getText().toString();
                            d = ttVar4.f37910c;
                            wj0Var.setText(d);
                        } else {
                            str2 = str8;
                        }
                        List list2 = (List) hashMap.get(d);
                        if (list2 == null) {
                            i10 = 0;
                            ttVar = null;
                        } else if (list2.size() > 1) {
                            String string2 = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + d, null);
                            tt ttVar6 = (tt) org.telegram.ui.Cells.c1.i(1, list2);
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
                            sg0Var.setCountryButtonText(null);
                            pg0Var.setHintText((String) null);
                            sg0Var.f37456x = 2;
                        } else {
                            sg0Var.H = true;
                            sg0Var.f37457y = ttVar;
                            sg0Var.v(d, ttVar);
                            sg0Var.f37456x = i10;
                        }
                        if (!z10) {
                            wj0Var.setSelection(wj0Var.getText().length());
                        }
                        if (str2 != null) {
                            pg0Var.requestFocus();
                            pg0Var.setText(str2);
                            pg0Var.setSelection(pg0Var.length());
                        }
                    }
                    sg0Var.I = false;
                    return;
                }
                return;
            case 11:
                yj0 yj0Var = (yj0) this.f35784b;
                HashMap hashMap2 = yj0Var.f40268x;
                ArrayList arrayList2 = yj0Var.f40267w;
                if (!yj0Var.E) {
                    yj0Var.E = true;
                    String d10 = gf.b.d(yj0Var.O.getText().toString(), false);
                    yj0Var.O.setText(d10);
                    String str9 = null;
                    if (d10.length() == 0) {
                        yj0Var.t(null);
                        yj0Var.Q.setHintText((String) null);
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
                                            Object obj8 = (tt) org.telegram.ui.Cells.c1.i(1, list3);
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
                                        str5 = d10.substring(i19) + yj0Var.Q.getText().toString();
                                        yj0Var.O.setText(str4);
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
                                str5 = str4.substring(1) + yj0Var.Q.getText().toString();
                                wj0 wj0Var2 = yj0Var.O;
                                str4 = str4.substring(0, 1);
                                wj0Var2.setText(str4);
                            }
                        } else {
                            str4 = d10;
                            str5 = null;
                            z11 = false;
                        }
                        int size5 = arrayList2.size();
                        tt ttVar8 = null;
                        int i21 = 0;
                        int i22 = 0;
                        while (i22 < size5) {
                            Object obj10 = arrayList2.get(i22);
                            i22++;
                            tt ttVar9 = (tt) obj10;
                            if (ttVar9.f37910c.startsWith(str4)) {
                                i21++;
                                if (ttVar9.f37910c.equals(str4)) {
                                    ttVar8 = ttVar9;
                                }
                            }
                        }
                        if (i21 == 1 && ttVar8 != null && str5 == null) {
                            str5 = str4.substring(ttVar8.f37910c.length()) + yj0Var.Q.getText().toString();
                            wj0 wj0Var3 = yj0Var.O;
                            String str10 = ttVar8.f37910c;
                            wj0Var3.setText(str10);
                            str4 = str10;
                        }
                        List list4 = (List) hashMap2.get(str4);
                        if (list4 == null) {
                            ttVar2 = null;
                        } else if (list4.size() > 1) {
                            String string4 = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + str4, null);
                            tt ttVar10 = (tt) org.telegram.ui.Cells.c1.i(1, list4);
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
                            yj0Var.G = true;
                            yj0Var.u(str4, ttVar2);
                        } else {
                            yj0Var.t(null);
                            yj0Var.Q.setHintText((String) null);
                        }
                        if (!z11) {
                            wj0 wj0Var4 = yj0Var.O;
                            wj0Var4.setSelection(wj0Var4.getText().length());
                        }
                        if (str5 != null && str5.length() != 0) {
                            yj0Var.Q.requestFocus();
                            yj0Var.Q.setText(str5);
                            wj0 wj0Var5 = yj0Var.Q;
                            wj0Var5.setSelection(wj0Var5.length());
                        }
                    }
                    yj0Var.E = false;
                    yj0.q(yj0Var);
                    return;
                }
                return;
            case 12:
                jn0 jn0Var = (jn0) this.f35784b;
                if (!jn0Var.Z0 && jn0Var.T0 != 0 && jn0Var.Y[0].length() == jn0Var.T0) {
                    jn0Var.L.callOnClick();
                    return;
                }
                return;
            case 13:
                ro0 ro0Var = (ro0) this.f35784b;
                if (ro0Var.f37174c0 != 0 && editable.length() == ro0Var.f37174c0) {
                    ro0Var.A0(false);
                    return;
                }
                return;
            case 14:
                vq0 vq0Var = ((wq0) this.f35784b).f39435s0;
                if (vq0Var != null) {
                    vq0Var.b(editable);
                    return;
                }
                return;
            case 15:
                t51 t51Var = (t51) this.f35784b;
                org.telegram.ui.Cells.c6 c6Var = t51Var.h;
                if (c6Var.getText() != null && AndroidUtilities.trim(c6Var.getText(), null).length() != 0) {
                    str6 = c6Var.getText().toString();
                } else {
                    str6 = null;
                }
                t51Var.f37015y.v(str6, true, true);
                q61 q61Var = t51Var.f37010n;
                if (q61Var != null) {
                    q61Var.G1(null);
                    t51Var.f37010n.H1(TextUtils.isEmpty(str6), true);
                }
                if (c6Var != null) {
                    c6Var.clearAnimation();
                    c6Var.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.sr.h).start();
                }
                t51Var.c(false);
                return;
            case 16:
                String trim = editable.toString().trim();
                se1 se1Var = (se1) this.f35784b;
                String str11 = se1Var.f37414n;
                if (trim.length() > 0) {
                    se1Var.f37414n = trim.substring(0, 1).toUpperCase();
                } else {
                    se1Var.f37414n = "";
                }
                if (!str11.equals(se1Var.f37414n)) {
                    org.telegram.ui.Components.y80 y80Var = new org.telegram.ui.Components.y80(1, null);
                    y80Var.a(se1Var.f37414n);
                    org.telegram.ui.Components.dm0 dm0Var = se1Var.v;
                    if (dm0Var != null) {
                        dm0Var.b(y80Var, true);
                        return;
                    }
                    return;
                }
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f35784b;
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
        int i13 = this.f35783a;
        Object obj = this.f35784b;
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
                zrVar.f33026x = z10;
                zrVar.v = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                zrVar.F = ofFloat;
                ofFloat.addUpdateListener(new d3(zrVar, 8));
                if (!zrVar.f33026x) {
                    zrVar.F.setInterpolator(new OvershootInterpolator(1.5f));
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
                de0 de0Var = (de0) obj;
                wd0 wd0Var = de0Var.S;
                if (de0Var.R) {
                    de0Var.removeCallbacks(wd0Var);
                    wd0Var.run();
                    return;
                }
                return;
            case 8:
                xe0 xe0Var = (xe0) obj;
                ve0 ve0Var = xe0Var.f39626x;
                if (xe0Var.f39625w) {
                    xe0Var.removeCallbacks(ve0Var);
                    ve0Var.run();
                    return;
                }
                return;
            case 9:
                wf0 wf0Var = (wf0) obj;
                jf0 jf0Var = wf0Var.f39280r0;
                if (wf0Var.f39278q0) {
                    wf0Var.removeCallbacks(jf0Var);
                    jf0Var.run();
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
        switch (this.f35783a) {
            case 0:
                return;
            case 1:
                nd ndVar = (nd) this.f35784b;
                ndVar.d0(ndVar.f35962w.getText().toString());
                return;
            case 2:
                return;
            case 3:
                gp gpVar = (gp) this.f35784b;
                if (!gpVar.m0) {
                    String obj = gpVar.f33985a.getText().toString();
                    qa qaVar = gpVar.O;
                    if (qaVar != null) {
                        qaVar.b(obj);
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
