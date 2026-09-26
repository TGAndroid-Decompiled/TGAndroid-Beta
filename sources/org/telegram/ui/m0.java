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
    public final int f35436a;
    public final Object f35437b;

    public m0(Object obj, int i10) {
        this.f35436a = i10;
        this.f35437b = obj;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.web.k kVar;
        String obj;
        String str;
        boolean z10;
        String str2;
        int i10;
        qt qtVar;
        String str3;
        Object obj2;
        String str4;
        String str5;
        boolean z11;
        qt qtVar2;
        String str6;
        switch (this.f35436a) {
            case 0:
                i4 i4Var = (i4) this.f35437b;
                if (i4Var.f34394h0.W && (kVar = i4Var.f34395i0) != null) {
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
                ro roVar = (ro) this.f35437b;
                roVar.f37409r.n(5L, roVar.v.getText().toString(), null);
                ai.y5 y5Var = roVar.e;
                if (y5Var != null) {
                    y5Var.invalidate();
                    return;
                }
                return;
            case 3:
                ((fp) this.f35437b).V();
                return;
            case 4:
                jq jqVar = (jq) this.f35437b;
                kq kqVar = jqVar.e;
                if (!jqVar.d) {
                    kqVar.S = editable.toString();
                    s4.c1 K = kqVar.f35124b.K(kqVar.f35150u0);
                    if (K != null) {
                        kq.f0(kqVar, K.f42959a);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                return;
            case 6:
                z60 z60Var = (z60) this.f35437b;
                if (z60Var.f40373f.f23475r.length() != 0) {
                    x60 x60Var = z60Var.v;
                    boolean z12 = x60Var.f39842n;
                    if (!z12) {
                        z60Var.T = true;
                        z60Var.S = true;
                        if (!z12) {
                            x60Var.f39842n = true;
                            x60Var.l();
                        }
                        z60Var.f40381n.setFastScrollVisible(false);
                        z60Var.f40381n.setVerticalScrollBarEnabled(true);
                    }
                    z60Var.v.L(z60Var.f40373f.f23475r.getText().toString());
                    z60Var.f40388s.e(true, false);
                    return;
                }
                z60Var.T = false;
                z60Var.S = false;
                x60 x60Var2 = z60Var.v;
                if (x60Var2.f39842n) {
                    x60Var2.f39842n = false;
                    x60Var2.l();
                }
                z60Var.v.L(null);
                z60Var.f40381n.setFastScrollVisible(true);
                z60Var.f40381n.setVerticalScrollBarEnabled(false);
                z60Var.q0(0);
                return;
            case 7:
            case 8:
            case 9:
                return;
            case 10:
                pg0 pg0Var = (pg0) this.f35437b;
                HashMap hashMap = pg0Var.F;
                ArrayList arrayList = pg0Var.E;
                uj0 uj0Var = pg0Var.f36519a;
                mg0 mg0Var = pg0Var.f36520b;
                if (!pg0Var.I) {
                    int i11 = 1;
                    pg0Var.I = true;
                    int i12 = 0;
                    String d = gf.b.d(uj0Var.getText().toString(), false);
                    uj0Var.setText(d);
                    String str7 = null;
                    if (d.length() == 0) {
                        pg0Var.setCountryButtonText(null);
                        mg0Var.setHintText((String) null);
                        pg0Var.f36527x = 1;
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
                                        Object obj3 = (qt) org.telegram.ui.Cells.c1.i(i11, list);
                                        if (string != null) {
                                            int size = arrayList.size();
                                            int i14 = 0;
                                            while (true) {
                                                if (i14 < size) {
                                                    Object obj4 = arrayList.get(i14);
                                                    i14++;
                                                    qt qtVar3 = (qt) obj4;
                                                    if (Objects.equals(qtVar3.d, string)) {
                                                        obj3 = qtVar3;
                                                    }
                                                }
                                            }
                                        }
                                        obj2 = obj3;
                                    } else {
                                        obj2 = (qt) list.get(0);
                                    }
                                    if (obj2 != null) {
                                        str = d.substring(i13) + mg0Var.getText().toString();
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
                                str = d.substring(1) + mg0Var.getText().toString();
                                d = d.substring(0, 1);
                                uj0Var.setText(d);
                            }
                        } else {
                            str = null;
                            z10 = false;
                        }
                        int size2 = arrayList.size();
                        qt qtVar4 = null;
                        int i15 = 0;
                        int i16 = 0;
                        while (i16 < size2) {
                            Object obj5 = arrayList.get(i16);
                            i16++;
                            qt qtVar5 = (qt) obj5;
                            if (qtVar5.f36982c.startsWith(d)) {
                                int i17 = i15 + 1;
                                str3 = str;
                                if (qtVar5.f36982c.equals(d)) {
                                    if (qtVar4 == null || !qtVar4.f36982c.equals(qtVar5.f36982c)) {
                                        i15 = i17;
                                    }
                                    qtVar4 = qtVar5;
                                } else {
                                    i15 = i17;
                                }
                            } else {
                                str3 = str;
                            }
                            str = str3;
                        }
                        String str8 = str;
                        if (i15 == 1 && qtVar4 != null && str8 == null) {
                            str2 = d.substring(qtVar4.f36982c.length()) + mg0Var.getText().toString();
                            d = qtVar4.f36982c;
                            uj0Var.setText(d);
                        } else {
                            str2 = str8;
                        }
                        List list2 = (List) hashMap.get(d);
                        if (list2 == null) {
                            i10 = 0;
                            qtVar = null;
                        } else if (list2.size() > 1) {
                            String string2 = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + d, null);
                            qt qtVar6 = (qt) org.telegram.ui.Cells.c1.i(1, list2);
                            if (string2 != null) {
                                int size3 = arrayList.size();
                                int i18 = 0;
                                while (i18 < size3) {
                                    Object obj6 = arrayList.get(i18);
                                    i18++;
                                    qtVar = (qt) obj6;
                                    if (Objects.equals(qtVar.d, string2)) {
                                        i10 = 0;
                                    }
                                }
                            }
                            qtVar = qtVar6;
                            i10 = 0;
                        } else {
                            i10 = 0;
                            qtVar = (qt) list2.get(0);
                        }
                        if (qtVar == null) {
                            pg0Var.setCountryButtonText(null);
                            mg0Var.setHintText((String) null);
                            pg0Var.f36527x = 2;
                        } else {
                            pg0Var.H = true;
                            pg0Var.f36528y = qtVar;
                            pg0Var.v(d, qtVar);
                            pg0Var.f36527x = i10;
                        }
                        if (!z10) {
                            uj0Var.setSelection(uj0Var.getText().length());
                        }
                        if (str2 != null) {
                            mg0Var.requestFocus();
                            mg0Var.setText(str2);
                            mg0Var.setSelection(mg0Var.length());
                        }
                    }
                    pg0Var.I = false;
                    return;
                }
                return;
            case 11:
                wj0 wj0Var = (wj0) this.f35437b;
                HashMap hashMap2 = wj0Var.f39387x;
                ArrayList arrayList2 = wj0Var.f39386w;
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
                                            Object obj8 = (qt) org.telegram.ui.Cells.c1.i(1, list3);
                                            if (string3 != null) {
                                                int size4 = arrayList2.size();
                                                int i20 = 0;
                                                while (true) {
                                                    if (i20 < size4) {
                                                        Object obj9 = arrayList2.get(i20);
                                                        i20++;
                                                        qt qtVar7 = (qt) obj9;
                                                        if (Objects.equals(qtVar7.d, string3)) {
                                                            obj8 = qtVar7;
                                                        }
                                                    }
                                                }
                                            }
                                            obj7 = obj8;
                                        } else {
                                            obj7 = (qt) list3.get(0);
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
                        qt qtVar8 = null;
                        int i21 = 0;
                        int i22 = 0;
                        while (i22 < size5) {
                            Object obj10 = arrayList2.get(i22);
                            i22++;
                            qt qtVar9 = (qt) obj10;
                            if (qtVar9.f36982c.startsWith(str4)) {
                                i21++;
                                if (qtVar9.f36982c.equals(str4)) {
                                    qtVar8 = qtVar9;
                                }
                            }
                        }
                        if (i21 == 1 && qtVar8 != null && str5 == null) {
                            str5 = str4.substring(qtVar8.f36982c.length()) + wj0Var.Q.getText().toString();
                            uj0 uj0Var3 = wj0Var.O;
                            String str10 = qtVar8.f36982c;
                            uj0Var3.setText(str10);
                            str4 = str10;
                        }
                        List list4 = (List) hashMap2.get(str4);
                        if (list4 == null) {
                            qtVar2 = null;
                        } else if (list4.size() > 1) {
                            String string4 = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + str4, null);
                            qt qtVar10 = (qt) org.telegram.ui.Cells.c1.i(1, list4);
                            if (string4 != null) {
                                int size6 = arrayList2.size();
                                int i23 = 0;
                                while (i23 < size6) {
                                    Object obj11 = arrayList2.get(i23);
                                    i23++;
                                    qt qtVar11 = (qt) obj11;
                                    if (Objects.equals(qtVar11.d, string4)) {
                                        qtVar2 = qtVar11;
                                    }
                                }
                            }
                            qtVar2 = qtVar10;
                        } else {
                            qtVar2 = (qt) list4.get(0);
                        }
                        if (qtVar2 != null) {
                            wj0Var.G = true;
                            wj0Var.u(str4, qtVar2);
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
                gn0 gn0Var = (gn0) this.f35437b;
                if (!gn0Var.Z0 && gn0Var.T0 != 0 && gn0Var.Y[0].length() == gn0Var.T0) {
                    gn0Var.L.callOnClick();
                    return;
                }
                return;
            case 13:
                oo0 oo0Var = (oo0) this.f35437b;
                if (oo0Var.f36283c0 != 0 && editable.length() == oo0Var.f36283c0) {
                    oo0Var.A0(false);
                    return;
                }
                return;
            case 14:
                sq0 sq0Var = ((tq0) this.f35437b).f38211s0;
                if (sq0Var != null) {
                    sq0Var.b(editable);
                    return;
                }
                return;
            case 15:
                r51 r51Var = (r51) this.f35437b;
                org.telegram.ui.Cells.c6 c6Var = r51Var.h;
                if (c6Var.getText() != null && AndroidUtilities.trim(c6Var.getText(), null).length() != 0) {
                    str6 = c6Var.getText().toString();
                } else {
                    str6 = null;
                }
                r51Var.f36416y.v(str6, true, true);
                o61 o61Var = r51Var.f36411n;
                if (o61Var != null) {
                    o61Var.F1(null);
                    r51Var.f36411n.G1(TextUtils.isEmpty(str6), true);
                }
                if (c6Var != null) {
                    c6Var.clearAnimation();
                    c6Var.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.sr.h).start();
                }
                r51Var.c(false);
                return;
            case 16:
                String trim = editable.toString().trim();
                se1 se1Var = (se1) this.f35437b;
                String str11 = se1Var.f37725n;
                if (trim.length() > 0) {
                    se1Var.f37725n = trim.substring(0, 1).toUpperCase();
                } else {
                    se1Var.f37725n = "";
                }
                if (!str11.equals(se1Var.f37725n)) {
                    org.telegram.ui.Components.x80 x80Var = new org.telegram.ui.Components.x80(1, null);
                    x80Var.a(se1Var.f37725n);
                    org.telegram.ui.Components.cm0 cm0Var = se1Var.v;
                    if (cm0Var != null) {
                        cm0Var.b(x80Var, true);
                        return;
                    }
                    return;
                }
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f35437b;
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
        int i13 = this.f35436a;
        Object obj = this.f35437b;
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
                    z10 = true;
                } else {
                    z10 = false;
                }
                wrVar.f32225x = z10;
                wrVar.v = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                wrVar.F = ofFloat;
                ofFloat.addUpdateListener(new c3(wrVar, 9));
                if (!wrVar.f32225x) {
                    wrVar.F.setInterpolator(new OvershootInterpolator(1.5f));
                    wrVar.F.setDuration(350L);
                } else {
                    wrVar.F.setDuration(220L);
                }
                wrVar.F.start();
                wrVar.hideActionMode();
                return;
            case 6:
                return;
            case 7:
                ae0 ae0Var = (ae0) obj;
                td0 td0Var = ae0Var.S;
                if (ae0Var.R) {
                    ae0Var.removeCallbacks(td0Var);
                    td0Var.run();
                    return;
                }
                return;
            case 8:
                ue0 ue0Var = (ue0) obj;
                se0 se0Var = ue0Var.f38450x;
                if (ue0Var.f38449w) {
                    ue0Var.removeCallbacks(se0Var);
                    se0Var.run();
                    return;
                }
                return;
            case 9:
                tf0 tf0Var = (tf0) obj;
                gf0 gf0Var = tf0Var.f38095r0;
                if (tf0Var.f38093q0) {
                    tf0Var.removeCallbacks(gf0Var);
                    gf0Var.run();
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
        switch (this.f35436a) {
            case 0:
                return;
            case 1:
                ld ldVar = (ld) this.f35437b;
                ldVar.d0(ldVar.f35326w.getText().toString());
                return;
            case 2:
                return;
            case 3:
                fp fpVar = (fp) this.f35437b;
                if (!fpVar.m0) {
                    String obj = fpVar.f33708a.getText().toString();
                    na naVar = fpVar.O;
                    if (naVar != null) {
                        naVar.b(obj);
                    }
                    fpVar.W(obj);
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
