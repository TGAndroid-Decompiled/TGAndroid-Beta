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
public final class o0 implements TextWatcher {
    public final int f39624a;
    public final Object f39625b;

    public o0(Object obj, int i10) {
        this.f39624a = i10;
        this.f39625b = obj;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.web.k kVar;
        String obj;
        String str;
        boolean z10;
        String str2;
        int i10;
        kt ktVar;
        boolean z11;
        String str3;
        Object obj2;
        String str4;
        boolean z12;
        String str5;
        kt ktVar2;
        String str6;
        switch (this.f39624a) {
            case 0:
                l4 l4Var = (l4) this.f39625b;
                if (l4Var.f38758h0.W && (kVar = l4Var.f38759i0) != null) {
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
                ko koVar = (ko) this.f39625b;
                koVar.f38612r.n(5L, koVar.v.getText().toString(), null);
                ci.k4 k4Var = koVar.e;
                if (k4Var != null) {
                    k4Var.invalidate();
                    return;
                }
                return;
            case 3:
                ((yo) this.f39625b).V();
                return;
            case 4:
                cq cqVar = (cq) this.f39625b;
                dq dqVar = cqVar.e;
                if (!cqVar.d) {
                    dqVar.S = editable.toString();
                    s4.b1 K = dqVar.f36269b.K(dqVar.f36295u0);
                    if (K != null) {
                        dq.f0(dqVar, K.f45958a);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                return;
            case 6:
                n60 n60Var = (n60) this.f39625b;
                if (n60Var.f39362f.f27719r.length() != 0) {
                    l60 l60Var = n60Var.v;
                    boolean z13 = l60Var.f38790n;
                    if (!z13) {
                        n60Var.T = true;
                        n60Var.S = true;
                        if (!z13) {
                            l60Var.f38790n = true;
                            l60Var.l();
                        }
                        n60Var.f39370n.setFastScrollVisible(false);
                        n60Var.f39370n.setVerticalScrollBarEnabled(true);
                    }
                    n60Var.v.L(n60Var.f39362f.f27719r.getText().toString());
                    n60Var.f39377s.e(true, false);
                    return;
                }
                n60Var.T = false;
                n60Var.S = false;
                l60 l60Var2 = n60Var.v;
                if (l60Var2.f38790n) {
                    l60Var2.f38790n = false;
                    l60Var2.l();
                }
                n60Var.v.L(null);
                n60Var.f39370n.setFastScrollVisible(true);
                n60Var.f39370n.setVerticalScrollBarEnabled(false);
                n60Var.q0(0);
                return;
            case 7:
            case 8:
            case 9:
                return;
            case 10:
                eg0 eg0Var = (eg0) this.f39625b;
                HashMap hashMap = eg0Var.F;
                ArrayList arrayList = eg0Var.E;
                mj0 mj0Var = eg0Var.f36525a;
                bg0 bg0Var = eg0Var.f36526b;
                if (!eg0Var.I) {
                    int i11 = 1;
                    eg0Var.I = true;
                    int i12 = 0;
                    String d = jf.b.d(mj0Var.getText().toString(), false);
                    mj0Var.setText(d);
                    String str7 = null;
                    if (d.length() == 0) {
                        eg0Var.setCountryButtonText(null);
                        bg0Var.setHintText((String) null);
                        eg0Var.f36533x = 1;
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
                                        Object obj3 = (kt) r4.c.f(i11, list);
                                        if (string != null) {
                                            int size = arrayList.size();
                                            int i14 = i12;
                                            while (true) {
                                                if (i14 < size) {
                                                    Object obj4 = arrayList.get(i14);
                                                    i14++;
                                                    kt ktVar3 = (kt) obj4;
                                                    if (Objects.equals(ktVar3.d, string)) {
                                                        obj3 = ktVar3;
                                                    }
                                                }
                                            }
                                        }
                                        obj2 = obj3;
                                    } else {
                                        obj2 = (kt) list.get(i12);
                                    }
                                    if (obj2 != null) {
                                        str = d.substring(i13) + bg0Var.getText().toString();
                                        mj0Var.setText(substring);
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
                                str = d.substring(1) + bg0Var.getText().toString();
                                d = d.substring(0, 1);
                                mj0Var.setText(d);
                            }
                        } else {
                            str = null;
                            z10 = false;
                        }
                        int size2 = arrayList.size();
                        kt ktVar4 = null;
                        int i15 = 0;
                        int i16 = 0;
                        while (i16 < size2) {
                            Object obj5 = arrayList.get(i16);
                            i16++;
                            kt ktVar5 = (kt) obj5;
                            if (ktVar5.f38671c.startsWith(d)) {
                                int i17 = i15 + 1;
                                str3 = str;
                                if (ktVar5.f38671c.equals(d)) {
                                    if (ktVar4 == null || !ktVar4.f38671c.equals(ktVar5.f38671c)) {
                                        i15 = i17;
                                    }
                                    ktVar4 = ktVar5;
                                } else {
                                    i15 = i17;
                                }
                            } else {
                                str3 = str;
                            }
                            str = str3;
                        }
                        String str8 = str;
                        if (i15 == 1 && ktVar4 != null && str8 == null) {
                            str2 = d.substring(ktVar4.f38671c.length()) + bg0Var.getText().toString();
                            d = ktVar4.f38671c;
                            mj0Var.setText(d);
                        } else {
                            str2 = str8;
                        }
                        List list2 = (List) hashMap.get(d);
                        if (list2 == null) {
                            i10 = 0;
                            ktVar = null;
                        } else if (list2.size() > 1) {
                            String string2 = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + d, null);
                            kt ktVar6 = (kt) r4.c.f(1, list2);
                            if (string2 != null) {
                                int size3 = arrayList.size();
                                int i18 = 0;
                                while (i18 < size3) {
                                    Object obj6 = arrayList.get(i18);
                                    i18++;
                                    ktVar = (kt) obj6;
                                    if (Objects.equals(ktVar.d, string2)) {
                                        i10 = 0;
                                    }
                                }
                            }
                            ktVar = ktVar6;
                            i10 = 0;
                        } else {
                            i10 = 0;
                            ktVar = (kt) list2.get(0);
                        }
                        if (ktVar == null) {
                            eg0Var.setCountryButtonText(null);
                            bg0Var.setHintText((String) null);
                            eg0Var.f36533x = 2;
                        } else {
                            eg0Var.H = true;
                            eg0Var.f36534y = ktVar;
                            eg0Var.t(d, ktVar);
                            eg0Var.f36533x = i10;
                        }
                        if (!z10) {
                            mj0Var.setSelection(mj0Var.getText().length());
                        }
                        if (str2 != null) {
                            bg0Var.requestFocus();
                            bg0Var.setText(str2);
                            bg0Var.setSelection(bg0Var.length());
                        }
                        z11 = false;
                    }
                    eg0Var.I = z11;
                    return;
                }
                return;
            case 11:
                oj0 oj0Var = (oj0) this.f39625b;
                HashMap hashMap2 = oj0Var.f39856x;
                ArrayList arrayList2 = oj0Var.f39855w;
                if (!oj0Var.E) {
                    oj0Var.E = true;
                    String d10 = jf.b.d(oj0Var.O.getText().toString(), false);
                    oj0Var.O.setText(d10);
                    String str9 = null;
                    if (d10.length() == 0) {
                        oj0Var.v(null);
                        oj0Var.Q.setHintText((String) null);
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
                                            Object obj8 = (kt) r4.c.f(1, list3);
                                            if (string3 != null) {
                                                int size4 = arrayList2.size();
                                                int i20 = 0;
                                                while (true) {
                                                    if (i20 < size4) {
                                                        Object obj9 = arrayList2.get(i20);
                                                        i20++;
                                                        kt ktVar7 = (kt) obj9;
                                                        if (Objects.equals(ktVar7.d, string3)) {
                                                            obj8 = ktVar7;
                                                        }
                                                    }
                                                }
                                            }
                                            obj7 = obj8;
                                        } else {
                                            obj7 = (kt) list3.get(0);
                                        }
                                    }
                                    if (obj7 != null) {
                                        str5 = d10.substring(i19) + oj0Var.Q.getText().toString();
                                        oj0Var.O.setText(str4);
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
                                str5 = str4.substring(1) + oj0Var.Q.getText().toString();
                                mj0 mj0Var2 = oj0Var.O;
                                str4 = str4.substring(0, 1);
                                mj0Var2.setText(str4);
                            }
                        } else {
                            str4 = d10;
                            z12 = false;
                            str5 = null;
                        }
                        int size5 = arrayList2.size();
                        int i21 = 0;
                        int i22 = 0;
                        kt ktVar8 = null;
                        while (i22 < size5) {
                            Object obj10 = arrayList2.get(i22);
                            i22++;
                            kt ktVar9 = (kt) obj10;
                            if (ktVar9.f38671c.startsWith(str4)) {
                                i21++;
                                if (ktVar9.f38671c.equals(str4)) {
                                    ktVar8 = ktVar9;
                                }
                            }
                        }
                        if (i21 == 1 && ktVar8 != null && str5 == null) {
                            str5 = str4.substring(ktVar8.f38671c.length()) + oj0Var.Q.getText().toString();
                            mj0 mj0Var3 = oj0Var.O;
                            String str10 = ktVar8.f38671c;
                            mj0Var3.setText(str10);
                            str4 = str10;
                        }
                        List list4 = (List) hashMap2.get(str4);
                        if (list4 == null) {
                            ktVar2 = null;
                        } else if (list4.size() > 1) {
                            String string4 = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + str4, null);
                            kt ktVar10 = (kt) r4.c.f(1, list4);
                            if (string4 != null) {
                                int size6 = arrayList2.size();
                                int i23 = 0;
                                while (i23 < size6) {
                                    Object obj11 = arrayList2.get(i23);
                                    i23++;
                                    kt ktVar11 = (kt) obj11;
                                    if (Objects.equals(ktVar11.d, string4)) {
                                        ktVar2 = ktVar11;
                                    }
                                }
                            }
                            ktVar2 = ktVar10;
                        } else {
                            ktVar2 = (kt) list4.get(0);
                        }
                        if (ktVar2 != null) {
                            oj0Var.G = true;
                            oj0Var.w(str4, ktVar2);
                        } else {
                            oj0Var.v(null);
                            oj0Var.Q.setHintText((String) null);
                        }
                        if (!z12) {
                            mj0 mj0Var4 = oj0Var.O;
                            mj0Var4.setSelection(mj0Var4.getText().length());
                        }
                        if (str5 != null && str5.length() != 0) {
                            oj0Var.Q.requestFocus();
                            oj0Var.Q.setText(str5);
                            mj0 mj0Var5 = oj0Var.Q;
                            mj0Var5.setSelection(mj0Var5.length());
                        }
                    }
                    oj0Var.E = false;
                    oj0.r(oj0Var);
                    return;
                }
                return;
            case 12:
                xm0 xm0Var = (xm0) this.f39625b;
                if (!xm0Var.Z0 && xm0Var.T0 != 0 && xm0Var.Y[0].length() == xm0Var.T0) {
                    xm0Var.L.callOnClick();
                    return;
                }
                return;
            case 13:
                go0 go0Var = (go0) this.f39625b;
                if (go0Var.f37260c0 != 0 && editable.length() == go0Var.f37260c0) {
                    go0Var.A0(false);
                    return;
                }
                return;
            case 14:
                kq0 kq0Var = ((lq0) this.f39625b).f38935s0;
                if (kq0Var != null) {
                    kq0Var.b(editable);
                    return;
                }
                return;
            case 15:
                q41 q41Var = (q41) this.f39625b;
                org.telegram.ui.Cells.b6 b6Var = q41Var.h;
                if (b6Var.getText() != null && AndroidUtilities.trim(b6Var.getText(), null).length() != 0) {
                    str6 = b6Var.getText().toString();
                } else {
                    str6 = null;
                }
                q41Var.f39688y.v(str6, true, true);
                n51 n51Var = q41Var.f39683n;
                if (n51Var != null) {
                    n51Var.G1(null);
                    q41Var.f39683n.H1(TextUtils.isEmpty(str6), true);
                }
                if (b6Var != null) {
                    b6Var.clearAnimation();
                    b6Var.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.bs.h).start();
                }
                q41Var.c(false);
                return;
            case 16:
                String trim = editable.toString().trim();
                pd1 pd1Var = (pd1) this.f39625b;
                String str11 = pd1Var.f40103n;
                if (trim.length() > 0) {
                    pd1Var.f40103n = trim.substring(0, 1).toUpperCase();
                } else {
                    pd1Var.f40103n = "";
                }
                if (!str11.equals(pd1Var.f40103n)) {
                    org.telegram.ui.Components.f90 f90Var = new org.telegram.ui.Components.f90(1, null);
                    f90Var.a(pd1Var.f40103n);
                    org.telegram.ui.Components.nm0 nm0Var = pd1Var.v;
                    if (nm0Var != null) {
                        nm0Var.b(f90Var, true);
                        return;
                    }
                    return;
                }
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f39625b;
                cf1 cf1Var = twoStepVerificationActivity.V;
                if (twoStepVerificationActivity.U) {
                    AndroidUtilities.cancelRunOnUIThread(cf1Var);
                    cf1Var.run();
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z10;
        int i13 = this.f39624a;
        Object obj = this.f39625b;
        switch (i13) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                return;
            case 5:
                qr qrVar = (qr) obj;
                if (charSequence.length() != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                qrVar.f42287x = z10;
                qrVar.v = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                qrVar.F = ofFloat;
                ofFloat.addUpdateListener(new e3(qrVar, 9));
                if (!qrVar.f42287x) {
                    org.telegram.messenger.kk.l(1.5f, qrVar.F);
                    qrVar.F.setDuration(350L);
                } else {
                    qrVar.F.setDuration(220L);
                }
                qrVar.F.start();
                qrVar.hideActionMode();
                return;
            case 6:
                return;
            case 7:
                od0 od0Var = (od0) obj;
                gd0 gd0Var = od0Var.S;
                if (od0Var.R) {
                    od0Var.removeCallbacks(gd0Var);
                    gd0Var.run();
                    return;
                }
                return;
            case 8:
                ie0 ie0Var = (ie0) obj;
                ge0 ge0Var = ie0Var.f37888x;
                if (ie0Var.f37887w) {
                    ie0Var.removeCallbacks(ge0Var);
                    ge0Var.run();
                    return;
                }
                return;
            case 9:
                jf0 jf0Var = (jf0) obj;
                ue0 ue0Var = jf0Var.f38172r0;
                if (jf0Var.f38170q0) {
                    jf0Var.removeCallbacks(ue0Var);
                    ue0Var.run();
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
        switch (this.f39624a) {
            case 0:
                return;
            case 1:
                od odVar = (od) this.f39625b;
                odVar.d0(odVar.f39759w.getText().toString());
                return;
            case 2:
                return;
            case 3:
                yo yoVar = (yo) this.f39625b;
                if (!yoVar.m0) {
                    String obj = yoVar.f43458a.getText().toString();
                    ra raVar = yoVar.O;
                    if (raVar != null) {
                        raVar.b(obj);
                    }
                    yoVar.W(obj);
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
