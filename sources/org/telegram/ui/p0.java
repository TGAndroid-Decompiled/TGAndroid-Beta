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

    public final int f41231a;

    public final Object f41232b;

    public p0(Object obj, int i10) {
        this.f41231a = i10;
        this.f41232b = obj;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.web.l lVar;
        String str;
        boolean z10;
        String str2;
        int i10;
        nt ntVar;
        String str3;
        Object obj;
        String strSubstring;
        String str4;
        boolean z11;
        nt ntVar2;
        Object obj2;
        switch (this.f41231a) {
            case 0:
                m4 m4Var = (m4) this.f41232b;
                if (m4Var.f40335d0.S && (lVar = m4Var.f40336e0) != null) {
                    lVar.setInput(editable == null ? null : editable.toString());
                }
                break;
            case 1:
                break;
            case 2:
                jo joVar = (jo) this.f41232b;
                joVar.f39425r.n(5L, joVar.v.getText().toString(), null);
                jh.z3 z3Var = joVar.f39410e;
                if (z3Var != null) {
                    z3Var.invalidate();
                }
                break;
            case 3:
                ((xo) this.f41232b).V();
                break;
            case 4:
                cq cqVar = (cq) this.f41232b;
                dq dqVar = cqVar.f37130e;
                if (!cqVar.d) {
                    dqVar.O = editable.toString();
                    f2.o1 o1VarK = dqVar.f37492b.K(dqVar.f37511q0);
                    if (o1VarK != null) {
                        dq.f0(dqVar, o1VarK.f5789a);
                    }
                    break;
                }
                break;
            case 5:
                break;
            case 6:
                o60 o60Var = (o60) this.f41232b;
                if (o60Var.f41002f.f31468r.length() == 0) {
                    o60Var.P = false;
                    o60Var.O = false;
                    m60 m60Var = o60Var.v;
                    if (m60Var.f40377n) {
                        m60Var.f40377n = false;
                        m60Var.l();
                    }
                    o60Var.v.L(null);
                    o60Var.f41010n.setFastScrollVisible(true);
                    o60Var.f41010n.setVerticalScrollBarEnabled(false);
                    o60Var.q0(0);
                } else {
                    m60 m60Var2 = o60Var.v;
                    boolean z12 = m60Var2.f40377n;
                    if (!z12) {
                        o60Var.P = true;
                        o60Var.O = true;
                        if (!z12) {
                            m60Var2.f40377n = true;
                            m60Var2.l();
                        }
                        o60Var.f41010n.setFastScrollVisible(false);
                        o60Var.f41010n.setVerticalScrollBarEnabled(true);
                    }
                    o60Var.v.L(o60Var.f41002f.f31468r.getText().toString());
                    o60Var.f41016s.e(true, false);
                }
                break;
            case 7:
            case 8:
            case 9:
                break;
            case 10:
                hg0 hg0Var = (hg0) this.f41232b;
                HashMap map = hg0Var.B;
                ArrayList arrayList = hg0Var.A;
                mj0 mj0Var = hg0Var.f38804a;
                eg0 eg0Var = hg0Var.f38805b;
                if (!hg0Var.E) {
                    int i11 = 1;
                    hg0Var.E = true;
                    int i12 = 0;
                    String strD = oe.b.d(mj0Var.getText().toString(), false);
                    mj0Var.setText(strD);
                    String str5 = null;
                    if (strD.length() == 0) {
                        hg0Var.setCountryButtonText(null);
                        eg0Var.setHintText((String) null);
                        hg0Var.f38813x = 1;
                    } else {
                        int i13 = 4;
                        if (strD.length() > 4) {
                            while (true) {
                                if (i13 >= i11) {
                                    String strSubstring2 = strD.substring(i12, i13);
                                    List list = (List) map.get(strSubstring2);
                                    if (list == null) {
                                        obj = str5;
                                    } else if (list.size() > i11) {
                                        String string = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + strSubstring2, str5);
                                        Object obj3 = (nt) i0.a.j(i11, list);
                                        if (string != null) {
                                            int size = arrayList.size();
                                            int i14 = 0;
                                            while (i14 < size) {
                                                Object obj4 = arrayList.get(i14);
                                                i14++;
                                                nt ntVar3 = (nt) obj4;
                                                if (Objects.equals(ntVar3.d, string)) {
                                                    obj3 = ntVar3;
                                                }
                                            }
                                        }
                                        obj = obj3;
                                    } else {
                                        obj = (nt) list.get(0);
                                    }
                                    if (obj != null) {
                                        str = strD.substring(i13) + eg0Var.getText().toString();
                                        mj0Var.setText(strSubstring2);
                                        strD = strSubstring2;
                                        z10 = true;
                                    } else {
                                        i13--;
                                        i11 = 1;
                                        i12 = 0;
                                        str5 = null;
                                    }
                                } else {
                                    str = null;
                                    z10 = false;
                                }
                            }
                            if (!z10) {
                                str = strD.substring(1) + eg0Var.getText().toString();
                                strD = strD.substring(0, 1);
                                mj0Var.setText(strD);
                            }
                        } else {
                            str = null;
                            z10 = false;
                        }
                        int size2 = arrayList.size();
                        nt ntVar4 = null;
                        int i15 = 0;
                        int i16 = 0;
                        while (i16 < size2) {
                            Object obj5 = arrayList.get(i16);
                            i16++;
                            nt ntVar5 = (nt) obj5;
                            if (ntVar5.f40917c.startsWith(strD)) {
                                int i17 = i15 + 1;
                                str3 = str;
                                if (ntVar5.f40917c.equals(strD)) {
                                    if (ntVar4 == null || !ntVar4.f40917c.equals(ntVar5.f40917c)) {
                                        i15 = i17;
                                    }
                                    ntVar4 = ntVar5;
                                } else {
                                    i15 = i17;
                                }
                            } else {
                                str3 = str;
                            }
                            str = str3;
                        }
                        String str6 = str;
                        if (i15 == 1 && ntVar4 != null && str6 == null) {
                            str2 = strD.substring(ntVar4.f40917c.length()) + eg0Var.getText().toString();
                            strD = ntVar4.f40917c;
                            mj0Var.setText(strD);
                        } else {
                            str2 = str6;
                        }
                        List list2 = (List) map.get(strD);
                        if (list2 == null) {
                            i10 = 0;
                            ntVar = null;
                        } else if (list2.size() > 1) {
                            String string2 = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + strD, null);
                            nt ntVar6 = (nt) i0.a.j(1, list2);
                            if (string2 != null) {
                                int size3 = arrayList.size();
                                int i18 = 0;
                                do {
                                    if (i18 < size3) {
                                        Object obj6 = arrayList.get(i18);
                                        i18++;
                                        ntVar = (nt) obj6;
                                    } else {
                                        ntVar = ntVar6;
                                    }
                                } while (!Objects.equals(ntVar.d, string2));
                            } else {
                                ntVar = ntVar6;
                            }
                            i10 = 0;
                        } else {
                            i10 = 0;
                            ntVar = (nt) list2.get(0);
                        }
                        if (ntVar != null) {
                            hg0Var.D = true;
                            hg0Var.f38814y = ntVar;
                            hg0Var.u(strD, ntVar);
                            hg0Var.f38813x = i10;
                        } else {
                            hg0Var.setCountryButtonText(null);
                            eg0Var.setHintText((String) null);
                            hg0Var.f38813x = 2;
                        }
                        if (!z10) {
                            mj0Var.setSelection(mj0Var.getText().length());
                        }
                        if (str2 != null) {
                            eg0Var.requestFocus();
                            eg0Var.setText(str2);
                            eg0Var.setSelection(eg0Var.length());
                        }
                    }
                    hg0Var.E = false;
                    break;
                }
                break;
            case 11:
                oj0 oj0Var = (oj0) this.f41232b;
                HashMap map2 = oj0Var.f41128x;
                ArrayList arrayList2 = oj0Var.f41127w;
                if (!oj0Var.A) {
                    oj0Var.A = true;
                    String strD2 = oe.b.d(oj0Var.K.getText().toString(), false);
                    oj0Var.K.setText(strD2);
                    String str7 = null;
                    if (strD2.length() == 0) {
                        oj0Var.u(null);
                        oj0Var.M.setHintText((String) null);
                    } else {
                        int i19 = 4;
                        if (strD2.length() > 4) {
                            while (true) {
                                if (i19 >= 1) {
                                    strSubstring = strD2.substring(0, i19);
                                    List list3 = (List) map2.get(strSubstring);
                                    if (list3 != null) {
                                        if (list3.size() > 1) {
                                            String string3 = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + strSubstring, str7);
                                            nt ntVar7 = (nt) i0.a.j(1, list3);
                                            if (string3 != null) {
                                                int size4 = arrayList2.size();
                                                int i20 = 0;
                                                while (true) {
                                                    if (i20 < size4) {
                                                        Object obj7 = arrayList2.get(i20);
                                                        i20++;
                                                        nt ntVar8 = (nt) obj7;
                                                        if (Objects.equals(ntVar8.d, string3)) {
                                                            obj2 = str7;
                                                            ntVar7 = ntVar8;
                                                        } else {
                                                            obj2 = str7;
                                                        }
                                                    } else {
                                                        obj2 = str7;
                                                    }
                                                }
                                            }
                                            obj2 = str7;
                                            obj2 = ntVar7;
                                        } else {
                                            obj2 = str7;
                                            obj2 = (nt) list3.get(0);
                                        }
                                    }
                                    if (obj2 != null) {
                                        str4 = strD2.substring(i19) + oj0Var.M.getText().toString();
                                        oj0Var.K.setText(strSubstring);
                                        z11 = true;
                                    } else {
                                        i19--;
                                        str7 = null;
                                    }
                                } else {
                                    strSubstring = strD2;
                                    str4 = null;
                                    z11 = false;
                                }
                            }
                            if (!z11) {
                                str4 = strSubstring.substring(1) + oj0Var.M.getText().toString();
                                mj0 mj0Var2 = oj0Var.K;
                                strSubstring = strSubstring.substring(0, 1);
                                mj0Var2.setText(strSubstring);
                            }
                        } else {
                            strSubstring = strD2;
                            str4 = null;
                            z11 = false;
                        }
                        int size5 = arrayList2.size();
                        nt ntVar9 = null;
                        int i21 = 0;
                        int i22 = 0;
                        while (i22 < size5) {
                            Object obj8 = arrayList2.get(i22);
                            i22++;
                            nt ntVar10 = (nt) obj8;
                            if (ntVar10.f40917c.startsWith(strSubstring)) {
                                i21++;
                                if (ntVar10.f40917c.equals(strSubstring)) {
                                    ntVar9 = ntVar10;
                                }
                            }
                        }
                        if (i21 == 1 && ntVar9 != null && str4 == null) {
                            str4 = strSubstring.substring(ntVar9.f40917c.length()) + oj0Var.M.getText().toString();
                            mj0 mj0Var3 = oj0Var.K;
                            String str8 = ntVar9.f40917c;
                            mj0Var3.setText(str8);
                            strSubstring = str8;
                        }
                        List list4 = (List) map2.get(strSubstring);
                        if (list4 == null) {
                            ntVar2 = null;
                        } else if (list4.size() > 1) {
                            String string4 = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + strSubstring, null);
                            nt ntVar11 = (nt) i0.a.j(1, list4);
                            if (string4 != null) {
                                int size6 = arrayList2.size();
                                int i23 = 0;
                                while (true) {
                                    if (i23 < size6) {
                                        Object obj9 = arrayList2.get(i23);
                                        i23++;
                                        nt ntVar12 = (nt) obj9;
                                        if (Objects.equals(ntVar12.d, string4)) {
                                            ntVar2 = ntVar12;
                                        }
                                    } else {
                                        ntVar2 = ntVar11;
                                    }
                                }
                            } else {
                                ntVar2 = ntVar11;
                            }
                        } else {
                            ntVar2 = (nt) list4.get(0);
                        }
                        if (ntVar2 != null) {
                            oj0Var.C = true;
                            oj0Var.v(strSubstring, ntVar2);
                        } else {
                            oj0Var.u(null);
                            oj0Var.M.setHintText((String) null);
                        }
                        if (!z11) {
                            mj0 mj0Var4 = oj0Var.K;
                            mj0Var4.setSelection(mj0Var4.getText().length());
                        }
                        if (str4 != null && str4.length() != 0) {
                            oj0Var.M.requestFocus();
                            oj0Var.M.setText(str4);
                            mj0 mj0Var5 = oj0Var.M;
                            mj0Var5.setSelection(mj0Var5.length());
                        }
                    }
                    oj0Var.A = false;
                    oj0.r(oj0Var);
                    break;
                }
                break;
            case 12:
                xm0 xm0Var = (xm0) this.f41232b;
                if (!xm0Var.V0 && xm0Var.P0 != 0 && xm0Var.U[0].length() == xm0Var.P0) {
                    xm0Var.H.callOnClick();
                }
                break;
            case 13:
                do0 do0Var = (do0) this.f41232b;
                if (do0Var.Y != 0 && editable.length() == do0Var.Y) {
                    do0Var.A0(false);
                    break;
                }
                break;
            case 14:
                zp0 zp0Var = ((aq0) this.f41232b).f36615o0;
                if (zp0Var != null) {
                    zp0Var.b(editable);
                }
                break;
            case 15:
                r41 r41Var = (r41) this.f41232b;
                gh.r rVar = r41Var.h;
                String string5 = (rVar.getText() == null || AndroidUtilities.trim(rVar.getText(), null).length() == 0) ? null : rVar.getText().toString();
                r41Var.f41282y.v(string5, true, true);
                o51 o51Var = r41Var.f41277n;
                if (o51Var != null) {
                    o51Var.F1(null);
                    r41Var.f41277n.G1(TextUtils.isEmpty(string5), true);
                }
                if (rVar != null) {
                    rVar.clearAnimation();
                    rVar.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.er.h).start();
                }
                r41Var.c(false);
                break;
            case 16:
                String strTrim = editable.toString().trim();
                sd1 sd1Var = (sd1) this.f41232b;
                String str9 = sd1Var.f42596n;
                if (strTrim.length() > 0) {
                    sd1Var.f42596n = strTrim.substring(0, 1).toUpperCase();
                } else {
                    sd1Var.f42596n = "";
                }
                if (!str9.equals(sd1Var.f42596n)) {
                    org.telegram.ui.Components.y70 y70Var = new org.telegram.ui.Components.y70(1, null);
                    y70Var.a(sd1Var.f42596n);
                    org.telegram.ui.Components.el0 el0Var = sd1Var.v;
                    if (el0Var != null) {
                        el0Var.b(y70Var, true);
                    }
                }
                break;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f41232b;
                ff1 ff1Var = twoStepVerificationActivity.R;
                if (twoStepVerificationActivity.Q) {
                    AndroidUtilities.cancelRunOnUIThread(ff1Var);
                    ff1Var.run();
                }
                break;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f41231a;
        Object obj = this.f41232b;
        switch (i13) {
            case 5:
                sr srVar = (sr) obj;
                srVar.f44180x = charSequence.length() != 0;
                srVar.v = 0.0f;
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                srVar.B = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new g3(srVar, 9));
                if (srVar.f44180x) {
                    srVar.B.setDuration(220L);
                } else {
                    srVar.B.setInterpolator(new OvershootInterpolator(1.5f));
                    srVar.B.setDuration(350L);
                }
                srVar.B.start();
                srVar.hideActionMode();
                break;
            case 7:
                sd0 sd0Var = (sd0) obj;
                kd0 kd0Var = sd0Var.O;
                if (sd0Var.N) {
                    sd0Var.removeCallbacks(kd0Var);
                    kd0Var.run();
                }
                break;
            case 8:
                me0 me0Var = (me0) obj;
                ke0 ke0Var = me0Var.f40463x;
                if (me0Var.f40462w) {
                    me0Var.removeCallbacks(ke0Var);
                    ke0Var.run();
                }
                break;
            case 9:
                mf0 mf0Var = (mf0) obj;
                ye0 ye0Var = mf0Var.f40496n0;
                if (mf0Var.m0) {
                    mf0Var.removeCallbacks(ye0Var);
                    ye0Var.run();
                }
                break;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f41231a) {
            case 1:
                id idVar = (id) this.f41232b;
                idVar.d0(idVar.f39055w.getText().toString());
                break;
            case 3:
                xo xoVar = (xo) this.f41232b;
                if (!xoVar.f44561i0) {
                    String string = xoVar.f44548a.getText().toString();
                    ka kaVar = xoVar.K;
                    if (kaVar != null) {
                        kaVar.b(string);
                    }
                    xoVar.W(string);
                    break;
                }
                break;
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
