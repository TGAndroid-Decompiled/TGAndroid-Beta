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
    public final int f39728a;
    public final Object f39729b;

    public o0(Object obj, int i10) {
        this.f39728a = i10;
        this.f39729b = obj;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.web.k kVar;
        String obj;
        String str;
        boolean z10;
        String str2;
        int i10;
        ht htVar;
        boolean z11;
        String str3;
        Object obj2;
        String str4;
        boolean z12;
        String str5;
        ht htVar2;
        String str6;
        switch (this.f39728a) {
            case 0:
                l4 l4Var = (l4) this.f39729b;
                if (l4Var.f38766h0.W && (kVar = l4Var.f38767i0) != null) {
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
                io ioVar = (io) this.f39729b;
                ioVar.f38053r.n(5L, ioVar.v.getText().toString(), null);
                ci.k4 k4Var = ioVar.e;
                if (k4Var != null) {
                    k4Var.invalidate();
                    return;
                }
                return;
            case 3:
                ((wo) this.f39729b).V();
                return;
            case 4:
                aq aqVar = (aq) this.f39729b;
                bq bqVar = aqVar.e;
                if (!aqVar.d) {
                    bqVar.S = editable.toString();
                    s4.b1 K = bqVar.f35686b.K(bqVar.f35712u0);
                    if (K != null) {
                        bq.f0(bqVar, K.f45917a);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                return;
            case 6:
                l60 l60Var = (l60) this.f39729b;
                if (l60Var.f38808f.f27726r.length() != 0) {
                    j60 j60Var = l60Var.v;
                    boolean z13 = j60Var.f38178n;
                    if (!z13) {
                        l60Var.T = true;
                        l60Var.S = true;
                        if (!z13) {
                            j60Var.f38178n = true;
                            j60Var.l();
                        }
                        l60Var.f38816n.setFastScrollVisible(false);
                        l60Var.f38816n.setVerticalScrollBarEnabled(true);
                    }
                    l60Var.v.L(l60Var.f38808f.f27726r.getText().toString());
                    l60Var.f38823s.e(true, false);
                    return;
                }
                l60Var.T = false;
                l60Var.S = false;
                j60 j60Var2 = l60Var.v;
                if (j60Var2.f38178n) {
                    j60Var2.f38178n = false;
                    j60Var2.l();
                }
                l60Var.v.L(null);
                l60Var.f38816n.setFastScrollVisible(true);
                l60Var.f38816n.setVerticalScrollBarEnabled(false);
                l60Var.q0(0);
                return;
            case 7:
            case 8:
            case 9:
                return;
            case 10:
                cg0 cg0Var = (cg0) this.f39729b;
                HashMap hashMap = cg0Var.F;
                ArrayList arrayList = cg0Var.E;
                kj0 kj0Var = cg0Var.f35962a;
                zf0 zf0Var = cg0Var.f35963b;
                if (!cg0Var.I) {
                    int i11 = 1;
                    cg0Var.I = true;
                    int i12 = 0;
                    String d = jf.b.d(kj0Var.getText().toString(), false);
                    kj0Var.setText(d);
                    String str7 = null;
                    if (d.length() == 0) {
                        cg0Var.setCountryButtonText(null);
                        zf0Var.setHintText((String) null);
                        cg0Var.f35970x = 1;
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
                                        Object obj3 = (ht) r4.c.f(i11, list);
                                        if (string != null) {
                                            int size = arrayList.size();
                                            int i14 = i12;
                                            while (true) {
                                                if (i14 < size) {
                                                    Object obj4 = arrayList.get(i14);
                                                    i14++;
                                                    ht htVar3 = (ht) obj4;
                                                    if (Objects.equals(htVar3.d, string)) {
                                                        obj3 = htVar3;
                                                    }
                                                }
                                            }
                                        }
                                        obj2 = obj3;
                                    } else {
                                        obj2 = (ht) list.get(i12);
                                    }
                                    if (obj2 != null) {
                                        str = d.substring(i13) + zf0Var.getText().toString();
                                        kj0Var.setText(substring);
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
                                str = d.substring(1) + zf0Var.getText().toString();
                                d = d.substring(0, 1);
                                kj0Var.setText(d);
                            }
                        } else {
                            str = null;
                            z10 = false;
                        }
                        int size2 = arrayList.size();
                        ht htVar4 = null;
                        int i15 = 0;
                        int i16 = 0;
                        while (i16 < size2) {
                            Object obj5 = arrayList.get(i16);
                            i16++;
                            ht htVar5 = (ht) obj5;
                            if (htVar5.f37785c.startsWith(d)) {
                                int i17 = i15 + 1;
                                str3 = str;
                                if (htVar5.f37785c.equals(d)) {
                                    if (htVar4 == null || !htVar4.f37785c.equals(htVar5.f37785c)) {
                                        i15 = i17;
                                    }
                                    htVar4 = htVar5;
                                } else {
                                    i15 = i17;
                                }
                            } else {
                                str3 = str;
                            }
                            str = str3;
                        }
                        String str8 = str;
                        if (i15 == 1 && htVar4 != null && str8 == null) {
                            str2 = d.substring(htVar4.f37785c.length()) + zf0Var.getText().toString();
                            d = htVar4.f37785c;
                            kj0Var.setText(d);
                        } else {
                            str2 = str8;
                        }
                        List list2 = (List) hashMap.get(d);
                        if (list2 == null) {
                            i10 = 0;
                            htVar = null;
                        } else if (list2.size() > 1) {
                            String string2 = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + d, null);
                            ht htVar6 = (ht) r4.c.f(1, list2);
                            if (string2 != null) {
                                int size3 = arrayList.size();
                                int i18 = 0;
                                while (i18 < size3) {
                                    Object obj6 = arrayList.get(i18);
                                    i18++;
                                    htVar = (ht) obj6;
                                    if (Objects.equals(htVar.d, string2)) {
                                        i10 = 0;
                                    }
                                }
                            }
                            htVar = htVar6;
                            i10 = 0;
                        } else {
                            i10 = 0;
                            htVar = (ht) list2.get(0);
                        }
                        if (htVar == null) {
                            cg0Var.setCountryButtonText(null);
                            zf0Var.setHintText((String) null);
                            cg0Var.f35970x = 2;
                        } else {
                            cg0Var.H = true;
                            cg0Var.f35971y = htVar;
                            cg0Var.t(d, htVar);
                            cg0Var.f35970x = i10;
                        }
                        if (!z10) {
                            kj0Var.setSelection(kj0Var.getText().length());
                        }
                        if (str2 != null) {
                            zf0Var.requestFocus();
                            zf0Var.setText(str2);
                            zf0Var.setSelection(zf0Var.length());
                        }
                        z11 = false;
                    }
                    cg0Var.I = z11;
                    return;
                }
                return;
            case 11:
                mj0 mj0Var = (mj0) this.f39729b;
                HashMap hashMap2 = mj0Var.f39302x;
                ArrayList arrayList2 = mj0Var.f39301w;
                if (!mj0Var.E) {
                    mj0Var.E = true;
                    String d10 = jf.b.d(mj0Var.O.getText().toString(), false);
                    mj0Var.O.setText(d10);
                    String str9 = null;
                    if (d10.length() == 0) {
                        mj0Var.v(null);
                        mj0Var.Q.setHintText((String) null);
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
                                            Object obj8 = (ht) r4.c.f(1, list3);
                                            if (string3 != null) {
                                                int size4 = arrayList2.size();
                                                int i20 = 0;
                                                while (true) {
                                                    if (i20 < size4) {
                                                        Object obj9 = arrayList2.get(i20);
                                                        i20++;
                                                        ht htVar7 = (ht) obj9;
                                                        if (Objects.equals(htVar7.d, string3)) {
                                                            obj8 = htVar7;
                                                        }
                                                    }
                                                }
                                            }
                                            obj7 = obj8;
                                        } else {
                                            obj7 = (ht) list3.get(0);
                                        }
                                    }
                                    if (obj7 != null) {
                                        str5 = d10.substring(i19) + mj0Var.Q.getText().toString();
                                        mj0Var.O.setText(str4);
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
                                str5 = str4.substring(1) + mj0Var.Q.getText().toString();
                                kj0 kj0Var2 = mj0Var.O;
                                str4 = str4.substring(0, 1);
                                kj0Var2.setText(str4);
                            }
                        } else {
                            str4 = d10;
                            z12 = false;
                            str5 = null;
                        }
                        int size5 = arrayList2.size();
                        int i21 = 0;
                        int i22 = 0;
                        ht htVar8 = null;
                        while (i22 < size5) {
                            Object obj10 = arrayList2.get(i22);
                            i22++;
                            ht htVar9 = (ht) obj10;
                            if (htVar9.f37785c.startsWith(str4)) {
                                i21++;
                                if (htVar9.f37785c.equals(str4)) {
                                    htVar8 = htVar9;
                                }
                            }
                        }
                        if (i21 == 1 && htVar8 != null && str5 == null) {
                            str5 = str4.substring(htVar8.f37785c.length()) + mj0Var.Q.getText().toString();
                            kj0 kj0Var3 = mj0Var.O;
                            String str10 = htVar8.f37785c;
                            kj0Var3.setText(str10);
                            str4 = str10;
                        }
                        List list4 = (List) hashMap2.get(str4);
                        if (list4 == null) {
                            htVar2 = null;
                        } else if (list4.size() > 1) {
                            String string4 = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + str4, null);
                            ht htVar10 = (ht) r4.c.f(1, list4);
                            if (string4 != null) {
                                int size6 = arrayList2.size();
                                int i23 = 0;
                                while (i23 < size6) {
                                    Object obj11 = arrayList2.get(i23);
                                    i23++;
                                    ht htVar11 = (ht) obj11;
                                    if (Objects.equals(htVar11.d, string4)) {
                                        htVar2 = htVar11;
                                    }
                                }
                            }
                            htVar2 = htVar10;
                        } else {
                            htVar2 = (ht) list4.get(0);
                        }
                        if (htVar2 != null) {
                            mj0Var.G = true;
                            mj0Var.w(str4, htVar2);
                        } else {
                            mj0Var.v(null);
                            mj0Var.Q.setHintText((String) null);
                        }
                        if (!z12) {
                            kj0 kj0Var4 = mj0Var.O;
                            kj0Var4.setSelection(kj0Var4.getText().length());
                        }
                        if (str5 != null && str5.length() != 0) {
                            mj0Var.Q.requestFocus();
                            mj0Var.Q.setText(str5);
                            kj0 kj0Var5 = mj0Var.Q;
                            kj0Var5.setSelection(kj0Var5.length());
                        }
                    }
                    mj0Var.E = false;
                    mj0.s(mj0Var);
                    return;
                }
                return;
            case 12:
                vm0 vm0Var = (vm0) this.f39729b;
                if (!vm0Var.Z0 && vm0Var.T0 != 0 && vm0Var.Y[0].length() == vm0Var.T0) {
                    vm0Var.L.callOnClick();
                    return;
                }
                return;
            case 13:
                eo0 eo0Var = (eo0) this.f39729b;
                if (eo0Var.f36705c0 != 0 && editable.length() == eo0Var.f36705c0) {
                    eo0Var.A0(false);
                    return;
                }
                return;
            case 14:
                iq0 iq0Var = ((jq0) this.f39729b).f38324s0;
                if (iq0Var != null) {
                    iq0Var.b(editable);
                    return;
                }
                return;
            case 15:
                o41 o41Var = (o41) this.f39729b;
                org.telegram.ui.Cells.b6 b6Var = o41Var.h;
                if (b6Var.getText() != null && AndroidUtilities.trim(b6Var.getText(), null).length() != 0) {
                    str6 = b6Var.getText().toString();
                } else {
                    str6 = null;
                }
                o41Var.f39122y.v(str6, true, true);
                l51 l51Var = o41Var.f39117n;
                if (l51Var != null) {
                    l51Var.G1(null);
                    o41Var.f39117n.H1(TextUtils.isEmpty(str6), true);
                }
                if (b6Var != null) {
                    b6Var.clearAnimation();
                    b6Var.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.bs.h).start();
                }
                o41Var.c(false);
                return;
            case 16:
                String trim = editable.toString().trim();
                nd1 nd1Var = (nd1) this.f39729b;
                String str11 = nd1Var.f39545n;
                if (trim.length() > 0) {
                    nd1Var.f39545n = trim.substring(0, 1).toUpperCase();
                } else {
                    nd1Var.f39545n = "";
                }
                if (!str11.equals(nd1Var.f39545n)) {
                    org.telegram.ui.Components.f90 f90Var = new org.telegram.ui.Components.f90(1, null);
                    f90Var.a(nd1Var.f39545n);
                    org.telegram.ui.Components.om0 om0Var = nd1Var.v;
                    if (om0Var != null) {
                        om0Var.b(f90Var, true);
                        return;
                    }
                    return;
                }
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f39729b;
                af1 af1Var = twoStepVerificationActivity.V;
                if (twoStepVerificationActivity.U) {
                    AndroidUtilities.cancelRunOnUIThread(af1Var);
                    af1Var.run();
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z10;
        int i13 = this.f39728a;
        Object obj = this.f39729b;
        switch (i13) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                return;
            case 5:
                or orVar = (or) obj;
                if (charSequence.length() != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                orVar.f41737x = z10;
                orVar.v = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                orVar.F = ofFloat;
                ofFloat.addUpdateListener(new e3(orVar, 9));
                if (!orVar.f41737x) {
                    org.telegram.messenger.mk.l(1.5f, orVar.F);
                    orVar.F.setDuration(350L);
                } else {
                    orVar.F.setDuration(220L);
                }
                orVar.F.start();
                orVar.hideActionMode();
                return;
            case 6:
                return;
            case 7:
                md0 md0Var = (md0) obj;
                ed0 ed0Var = md0Var.S;
                if (md0Var.R) {
                    md0Var.removeCallbacks(ed0Var);
                    ed0Var.run();
                    return;
                }
                return;
            case 8:
                ge0 ge0Var = (ge0) obj;
                ee0 ee0Var = ge0Var.f37306x;
                if (ge0Var.f37305w) {
                    ge0Var.removeCallbacks(ee0Var);
                    ee0Var.run();
                    return;
                }
                return;
            case 9:
                hf0 hf0Var = (hf0) obj;
                se0 se0Var = hf0Var.f37614r0;
                if (hf0Var.f37612q0) {
                    hf0Var.removeCallbacks(se0Var);
                    se0Var.run();
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
        switch (this.f39728a) {
            case 0:
                return;
            case 1:
                md mdVar = (md) this.f39729b;
                mdVar.d0(mdVar.f39205w.getText().toString());
                return;
            case 2:
                return;
            case 3:
                wo woVar = (wo) this.f39729b;
                if (!woVar.m0) {
                    String obj = woVar.f42906a.getText().toString();
                    pa paVar = woVar.O;
                    if (paVar != null) {
                        paVar.b(obj);
                    }
                    woVar.W(obj);
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
