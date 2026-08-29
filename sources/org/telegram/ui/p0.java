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
public final class p0 implements TextWatcher {
    public final int f41258a;
    public final Object f41259b;

    public p0(Object obj, int i10) {
        this.f41258a = i10;
        this.f41259b = obj;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.web.l lVar;
        String obj;
        String str;
        boolean z10;
        String str2;
        int i10;
        lt ltVar;
        String str3;
        Object obj2;
        String str4;
        String str5;
        boolean z11;
        lt ltVar2;
        String str6;
        switch (this.f41258a) {
            case 0:
                m4 m4Var = (m4) this.f41259b;
                if (m4Var.f40392d0.S && (lVar = m4Var.f40393e0) != null) {
                    if (editable == null) {
                        obj = null;
                    } else {
                        obj = editable.toString();
                    }
                    lVar.setInput(obj);
                    return;
                }
                return;
            case 1:
                return;
            case 2:
                ko koVar = (ko) this.f41259b;
                koVar.f39960r.n(5L, koVar.v.getText().toString(), null);
                lh.y3 y3Var = koVar.f39945e;
                if (y3Var != null) {
                    y3Var.invalidate();
                    return;
                }
                return;
            case 3:
                ((yo) this.f41259b).V();
                return;
            case 4:
                cq cqVar = (cq) this.f41259b;
                dq dqVar = cqVar.f37192e;
                if (!cqVar.d) {
                    dqVar.O = editable.toString();
                    f2.n1 K = dqVar.f37575b.K(dqVar.f37594q0);
                    if (K != null) {
                        dq.f0(dqVar, K.f6432a);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                return;
            case 6:
                m60 m60Var = (m60) this.f41259b;
                if (m60Var.f40450f.f34546r.length() != 0) {
                    k60 k60Var = m60Var.v;
                    boolean z12 = k60Var.f39764n;
                    if (!z12) {
                        m60Var.P = true;
                        m60Var.O = true;
                        if (!z12) {
                            k60Var.f39764n = true;
                            k60Var.l();
                        }
                        m60Var.f40458n.setFastScrollVisible(false);
                        m60Var.f40458n.setVerticalScrollBarEnabled(true);
                    }
                    m60Var.v.L(m60Var.f40450f.f34546r.getText().toString());
                    m60Var.f40464s.e(true, false);
                    return;
                }
                m60Var.P = false;
                m60Var.O = false;
                k60 k60Var2 = m60Var.v;
                if (k60Var2.f39764n) {
                    k60Var2.f39764n = false;
                    k60Var2.l();
                }
                m60Var.v.L(null);
                m60Var.f40458n.setFastScrollVisible(true);
                m60Var.f40458n.setVerticalScrollBarEnabled(false);
                m60Var.q0(0);
                return;
            case 7:
            case 8:
            case 9:
                return;
            case 10:
                eg0 eg0Var = (eg0) this.f41259b;
                HashMap hashMap = eg0Var.B;
                ArrayList arrayList = eg0Var.A;
                ij0 ij0Var = eg0Var.f37810a;
                bg0 bg0Var = eg0Var.f37811b;
                if (!eg0Var.E) {
                    int i11 = 1;
                    eg0Var.E = true;
                    int i12 = 0;
                    String d = qe.b.d(ij0Var.getText().toString(), false);
                    ij0Var.setText(d);
                    String str7 = null;
                    if (d.length() == 0) {
                        eg0Var.setCountryButtonText(null);
                        bg0Var.setHintText((String) null);
                        eg0Var.f37819x = 1;
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
                                        Object obj3 = (lt) j7.l1.j(i11, list);
                                        if (string != null) {
                                            int size = arrayList.size();
                                            int i14 = 0;
                                            while (true) {
                                                if (i14 < size) {
                                                    Object obj4 = arrayList.get(i14);
                                                    i14++;
                                                    lt ltVar3 = (lt) obj4;
                                                    if (Objects.equals(ltVar3.d, string)) {
                                                        obj3 = ltVar3;
                                                    }
                                                }
                                            }
                                        }
                                        obj2 = obj3;
                                    } else {
                                        obj2 = (lt) list.get(0);
                                    }
                                    if (obj2 != null) {
                                        str = d.substring(i13) + bg0Var.getText().toString();
                                        ij0Var.setText(substring);
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
                                ij0Var.setText(d);
                            }
                        } else {
                            str = null;
                            z10 = false;
                        }
                        int size2 = arrayList.size();
                        lt ltVar4 = null;
                        int i15 = 0;
                        int i16 = 0;
                        while (i16 < size2) {
                            Object obj5 = arrayList.get(i16);
                            i16++;
                            lt ltVar5 = (lt) obj5;
                            if (ltVar5.f40274c.startsWith(d)) {
                                int i17 = i15 + 1;
                                str3 = str;
                                if (ltVar5.f40274c.equals(d)) {
                                    if (ltVar4 == null || !ltVar4.f40274c.equals(ltVar5.f40274c)) {
                                        i15 = i17;
                                    }
                                    ltVar4 = ltVar5;
                                } else {
                                    i15 = i17;
                                }
                            } else {
                                str3 = str;
                            }
                            str = str3;
                        }
                        String str8 = str;
                        if (i15 == 1 && ltVar4 != null && str8 == null) {
                            str2 = d.substring(ltVar4.f40274c.length()) + bg0Var.getText().toString();
                            d = ltVar4.f40274c;
                            ij0Var.setText(d);
                        } else {
                            str2 = str8;
                        }
                        List list2 = (List) hashMap.get(d);
                        if (list2 == null) {
                            i10 = 0;
                            ltVar = null;
                        } else if (list2.size() > 1) {
                            String string2 = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + d, null);
                            lt ltVar6 = (lt) j7.l1.j(1, list2);
                            if (string2 != null) {
                                int size3 = arrayList.size();
                                int i18 = 0;
                                while (i18 < size3) {
                                    Object obj6 = arrayList.get(i18);
                                    i18++;
                                    ltVar = (lt) obj6;
                                    if (Objects.equals(ltVar.d, string2)) {
                                        i10 = 0;
                                    }
                                }
                            }
                            ltVar = ltVar6;
                            i10 = 0;
                        } else {
                            i10 = 0;
                            ltVar = (lt) list2.get(0);
                        }
                        if (ltVar == null) {
                            eg0Var.setCountryButtonText(null);
                            bg0Var.setHintText((String) null);
                            eg0Var.f37819x = 2;
                        } else {
                            eg0Var.D = true;
                            eg0Var.f37820y = ltVar;
                            eg0Var.v(d, ltVar);
                            eg0Var.f37819x = i10;
                        }
                        if (!z10) {
                            ij0Var.setSelection(ij0Var.getText().length());
                        }
                        if (str2 != null) {
                            bg0Var.requestFocus();
                            bg0Var.setText(str2);
                            bg0Var.setSelection(bg0Var.length());
                        }
                    }
                    eg0Var.E = false;
                    return;
                }
                return;
            case 11:
                kj0 kj0Var = (kj0) this.f41259b;
                HashMap hashMap2 = kj0Var.f39914x;
                ArrayList arrayList2 = kj0Var.f39913w;
                if (!kj0Var.A) {
                    kj0Var.A = true;
                    String d10 = qe.b.d(kj0Var.K.getText().toString(), false);
                    kj0Var.K.setText(d10);
                    String str9 = null;
                    if (d10.length() == 0) {
                        kj0Var.t(null);
                        kj0Var.M.setHintText((String) null);
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
                                            Object obj8 = (lt) j7.l1.j(1, list3);
                                            if (string3 != null) {
                                                int size4 = arrayList2.size();
                                                int i20 = 0;
                                                while (true) {
                                                    if (i20 < size4) {
                                                        Object obj9 = arrayList2.get(i20);
                                                        i20++;
                                                        lt ltVar7 = (lt) obj9;
                                                        if (Objects.equals(ltVar7.d, string3)) {
                                                            obj8 = ltVar7;
                                                        }
                                                    }
                                                }
                                            }
                                            obj7 = obj8;
                                        } else {
                                            obj7 = (lt) list3.get(0);
                                        }
                                    }
                                    if (obj7 != null) {
                                        str5 = d10.substring(i19) + kj0Var.M.getText().toString();
                                        kj0Var.K.setText(str4);
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
                                str5 = str4.substring(1) + kj0Var.M.getText().toString();
                                ij0 ij0Var2 = kj0Var.K;
                                str4 = str4.substring(0, 1);
                                ij0Var2.setText(str4);
                            }
                        } else {
                            str4 = d10;
                            str5 = null;
                            z11 = false;
                        }
                        int size5 = arrayList2.size();
                        lt ltVar8 = null;
                        int i21 = 0;
                        int i22 = 0;
                        while (i22 < size5) {
                            Object obj10 = arrayList2.get(i22);
                            i22++;
                            lt ltVar9 = (lt) obj10;
                            if (ltVar9.f40274c.startsWith(str4)) {
                                i21++;
                                if (ltVar9.f40274c.equals(str4)) {
                                    ltVar8 = ltVar9;
                                }
                            }
                        }
                        if (i21 == 1 && ltVar8 != null && str5 == null) {
                            str5 = str4.substring(ltVar8.f40274c.length()) + kj0Var.M.getText().toString();
                            ij0 ij0Var3 = kj0Var.K;
                            String str10 = ltVar8.f40274c;
                            ij0Var3.setText(str10);
                            str4 = str10;
                        }
                        List list4 = (List) hashMap2.get(str4);
                        if (list4 == null) {
                            ltVar2 = null;
                        } else if (list4.size() > 1) {
                            String string4 = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + str4, null);
                            lt ltVar10 = (lt) j7.l1.j(1, list4);
                            if (string4 != null) {
                                int size6 = arrayList2.size();
                                int i23 = 0;
                                while (i23 < size6) {
                                    Object obj11 = arrayList2.get(i23);
                                    i23++;
                                    lt ltVar11 = (lt) obj11;
                                    if (Objects.equals(ltVar11.d, string4)) {
                                        ltVar2 = ltVar11;
                                    }
                                }
                            }
                            ltVar2 = ltVar10;
                        } else {
                            ltVar2 = (lt) list4.get(0);
                        }
                        if (ltVar2 != null) {
                            kj0Var.C = true;
                            kj0Var.u(str4, ltVar2);
                        } else {
                            kj0Var.t(null);
                            kj0Var.M.setHintText((String) null);
                        }
                        if (!z11) {
                            ij0 ij0Var4 = kj0Var.K;
                            ij0Var4.setSelection(ij0Var4.getText().length());
                        }
                        if (str5 != null && str5.length() != 0) {
                            kj0Var.M.requestFocus();
                            kj0Var.M.setText(str5);
                            ij0 ij0Var5 = kj0Var.M;
                            ij0Var5.setSelection(ij0Var5.length());
                        }
                    }
                    kj0Var.A = false;
                    kj0.q(kj0Var);
                    return;
                }
                return;
            case 12:
                vm0 vm0Var = (vm0) this.f41259b;
                if (!vm0Var.V0 && vm0Var.P0 != 0 && vm0Var.U[0].length() == vm0Var.P0) {
                    vm0Var.H.callOnClick();
                    return;
                }
                return;
            case 13:
                bo0 bo0Var = (bo0) this.f41259b;
                if (bo0Var.Y != 0 && editable.length() == bo0Var.Y) {
                    bo0Var.A0(false);
                    return;
                }
                return;
            case 14:
                yp0 yp0Var = ((zp0) this.f41259b).f45290o0;
                if (yp0Var != null) {
                    yp0Var.b(editable);
                    return;
                }
                return;
            case 15:
                u41 u41Var = (u41) this.f41259b;
                bh.b bVar = u41Var.h;
                if (bVar.getText() != null && AndroidUtilities.trim(bVar.getText(), null).length() != 0) {
                    str6 = bVar.getText().toString();
                } else {
                    str6 = null;
                }
                u41Var.f42281y.v(str6, true, true);
                r51 r51Var = u41Var.f42276n;
                if (r51Var != null) {
                    r51Var.F1(null);
                    u41Var.f42276n.G1(TextUtils.isEmpty(str6), true);
                }
                if (bVar != null) {
                    bVar.clearAnimation();
                    bVar.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.jr.h).start();
                }
                u41Var.c(false);
                return;
            case 16:
                String trim = editable.toString().trim();
                td1 td1Var = (td1) this.f41259b;
                String str11 = td1Var.f42665n;
                if (trim.length() > 0) {
                    td1Var.f42665n = trim.substring(0, 1).toUpperCase();
                } else {
                    td1Var.f42665n = "";
                }
                if (!str11.equals(td1Var.f42665n)) {
                    org.telegram.ui.Components.h80 h80Var = new org.telegram.ui.Components.h80(1, null);
                    h80Var.a(td1Var.f42665n);
                    org.telegram.ui.Components.ol0 ol0Var = td1Var.v;
                    if (ol0Var != null) {
                        ol0Var.b(h80Var, true);
                        return;
                    }
                    return;
                }
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f41259b;
                if1 if1Var = twoStepVerificationActivity.R;
                if (twoStepVerificationActivity.Q) {
                    AndroidUtilities.cancelRunOnUIThread(if1Var);
                    if1Var.run();
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z10;
        int i13 = this.f41258a;
        Object obj = this.f41259b;
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
                qrVar.f43325x = z10;
                qrVar.v = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                qrVar.B = ofFloat;
                ofFloat.addUpdateListener(new g3(qrVar, 9));
                if (!qrVar.f43325x) {
                    qrVar.B.setInterpolator(new OvershootInterpolator(1.5f));
                    qrVar.B.setDuration(350L);
                } else {
                    qrVar.B.setDuration(220L);
                }
                qrVar.B.start();
                qrVar.hideActionMode();
                return;
            case 6:
                return;
            case 7:
                pd0 pd0Var = (pd0) obj;
                id0 id0Var = pd0Var.O;
                if (pd0Var.N) {
                    pd0Var.removeCallbacks(id0Var);
                    id0Var.run();
                    return;
                }
                return;
            case 8:
                ie0 ie0Var = (ie0) obj;
                ge0 ge0Var = ie0Var.f39225x;
                if (ie0Var.f39224w) {
                    ie0Var.removeCallbacks(ge0Var);
                    ge0Var.run();
                    return;
                }
                return;
            case 9:
                if0 if0Var = (if0) obj;
                ue0 ue0Var = if0Var.f39248n0;
                if (if0Var.m0) {
                    if0Var.removeCallbacks(ue0Var);
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
        switch (this.f41258a) {
            case 0:
                return;
            case 1:
                hd hdVar = (hd) this.f41259b;
                hdVar.d0(hdVar.f38875w.getText().toString());
                return;
            case 2:
                return;
            case 3:
                yo yoVar = (yo) this.f41259b;
                if (!yoVar.f44928i0) {
                    String obj = yoVar.f44915a.getText().toString();
                    ia iaVar = yoVar.K;
                    if (iaVar != null) {
                        iaVar.b(obj);
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
