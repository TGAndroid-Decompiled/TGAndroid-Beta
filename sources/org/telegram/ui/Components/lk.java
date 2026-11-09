package org.telegram.ui.Components;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.Editable;
import android.text.SpannableString;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.w81;
public final class lk implements View.OnClickListener {
    public final int f35759a;
    public final Object f35760b;
    public final Object f35761c;

    public lk(int i7, Object obj, Object obj2) {
        this.f35759a = i7;
        this.f35760b = obj;
        this.f35761c = obj2;
    }

    @Override
    public final void onClick(View view) {
        int b10;
        int i7;
        int i10;
        String G;
        int length;
        View view2;
        lr lrVar;
        v4.d1 T;
        long j3;
        StringBuilder sb2;
        long j10;
        int i11 = this.f35759a;
        v4.d1 d1Var = null;
        boolean z9 = false;
        boolean z10 = true;
        Object obj = this.f35761c;
        Object obj2 = this.f35760b;
        switch (i11) {
            case 0:
                wk.O((wk) obj2, (org.telegram.ui.ActionBar.g6) obj);
                return;
            case 1:
                bn bnVar = (bn) ((org.telegram.ui.l4) obj2).f47458e;
                org.telegram.ui.f61 f61Var = bnVar.f32319s;
                View F = f61Var.F((zm) obj);
                if (F != null) {
                    d1Var = f61Var.T(F);
                }
                if (d1Var != null && (b10 = d1Var.b() - bnVar.f32321t0) >= 0 && b10 < bnVar.K.length) {
                    bn.S(bnVar, b10);
                    return;
                }
                return;
            case 2:
                kn knVar = (kn) obj2;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) obj;
                org.telegram.ui.cn cnVar = knVar.G;
                if (knVar.T) {
                    cnVar.showDialog(v4.S(knVar.getContext(), cnVar.h, g6Var).f27296a);
                    return;
                }
                gn gnVar = knVar.f35406e;
                if (cnVar.getParentActivity() != null) {
                    TLRPC.Chat chat = cnVar.f44432e;
                    if (chat != null && !org.telegram.messenger.t3.y(13, chat)) {
                        if (knVar.f35399a.f55500f && cnVar.getParentActivity() != null && cnVar.fragmentView != null && cnVar.f44579p8 != null) {
                            if (cnVar.C2 == null) {
                                i10 = 0;
                                fi.m3 E6 = cnVar.E6(310.0f, 1, -1, false);
                                cnVar.C2 = E6;
                                E6.d = 4000L;
                            } else {
                                i10 = 0;
                            }
                            int i12 = cnVar.f44579p8.ttl_period;
                            if (i12 > 86400) {
                                G = org.telegram.messenger.id.G(i12 / 86400, "Days", new Object[i10]);
                            } else if (i12 >= 3600) {
                                G = org.telegram.messenger.id.G(i12 / 3600, "Hours", new Object[i10]);
                            } else if (i12 >= 60) {
                                G = org.telegram.messenger.id.G(i12 / 60, "Minutes", new Object[i10]);
                            } else {
                                G = org.telegram.messenger.id.G(i12, "Seconds", new Object[i10]);
                            }
                            fi.m3 m3Var = cnVar.C2;
                            Object[] objArr = new Object[1];
                            objArr[i10] = G;
                            m3Var.u(org.telegram.messenger.id.a0("AutoDeleteSetInfo", null, 2131753844, objArr));
                            cnVar.C2.y(cnVar.f44560o1.getTimeItem(), true);
                            return;
                        }
                        return;
                    }
                    TLRPC.ChatFull chatFull = cnVar.f44579p8;
                    TLRPC.UserFull userFull = cnVar.f44592q8;
                    if (userFull != null) {
                        i7 = userFull.ttl_period;
                    } else if (chatFull != null) {
                        i7 = chatFull.ttl_period;
                    } else {
                        i7 = 0;
                    }
                    org.telegram.messenger.re reVar = new org.telegram.messenger.re(knVar.getContext(), null, new hn(knVar, r4), true, 0, knVar.f35405d0);
                    reVar.u(i7);
                    in inVar = new in(knVar, (ActionBarPopupWindow$ActionBarPopupWindowLayout) reVar.f25283b);
                    org.telegram.ui.ActionBar.g1[] g1VarArr = {inVar};
                    inVar.f27487e = true;
                    inVar.f27486c = 220;
                    inVar.setOutsideTouchable(true);
                    g1VarArr[0].setClippingEnabled(true);
                    g1VarArr[0].setAnimationStyle(2131755192);
                    g1VarArr[0].setFocusable(true);
                    ((ActionBarPopupWindow$ActionBarPopupWindowLayout) reVar.f25283b).measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE));
                    g1VarArr[0].setInputMethodMode(2);
                    g1VarArr[0].getContentView().setFocusableInTouchMode(true);
                    g1VarArr[0].showAtLocation(gnVar, 0, (int) (knVar.getX() + gnVar.getX()), (int) gnVar.getY());
                    cnVar.w8(false, true, 0.2f);
                    return;
                }
                return;
            case 3:
                vo voVar = (vo) obj2;
                org.telegram.ui.cn cnVar2 = (org.telegram.ui.cn) obj;
                if (voVar.f39146m1 != null) {
                    voVar.f39146m1 = null;
                    voVar.dismiss();
                    org.telegram.messenger.d4.f(voVar.f28621a).a(cnVar2.a(), true, false);
                    return;
                }
                voVar.dismiss();
                return;
            case 4:
                tq tqVar = (tq) obj2;
                tqVar.R1 = org.telegram.messenger.qp.s1(tqVar.f28621a).j1(org.telegram.messenger.ij.B1((TLRPC.Peer) obj));
                tqVar.dismiss();
                return;
            case 5:
                br brVar = (br) obj2;
                String str = (String) obj;
                if (brVar.f32387b == null && (view2 = brVar.d) != null) {
                    View findFocus = view2.findFocus();
                    if (findFocus instanceof EditText) {
                        brVar.f32387b = (EditText) findFocus;
                    }
                }
                if (brVar.f32387b != null) {
                    try {
                        brVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    EditText editText = brVar.f32387b;
                    if (editText instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText).v(true, false);
                    }
                    Editable text = brVar.f32387b.getText();
                    if (brVar.f32387b.getSelectionEnd() == brVar.f32387b.length()) {
                        length = -1;
                    } else {
                        length = str.length() + brVar.f32387b.getSelectionStart();
                    }
                    if (brVar.f32387b.getSelectionStart() != -1 && brVar.f32387b.getSelectionEnd() != -1) {
                        EditText editText2 = brVar.f32387b;
                        editText2.setText(text.replace(editText2.getSelectionStart(), brVar.f32387b.getSelectionEnd(), str));
                        EditText editText3 = brVar.f32387b;
                        if (length == -1) {
                            length = editText3.length();
                        }
                        editText3.setSelection(length);
                    } else {
                        brVar.f32387b.setText(str);
                        EditText editText4 = brVar.f32387b;
                        editText4.setSelection(editText4.length());
                    }
                    EditText editText5 = brVar.f32387b;
                    if (editText5 instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText5).v(false, true);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                lr lrVar2 = (lr) obj2;
                kr krVar = (kr) obj;
                lrVar2.X0();
                krVar.f35460f = !krVar.f35460f;
                krVar.f35463j.P1.O(true);
                lrVar2.I0();
                return;
            case 7:
                ((lr) obj2).f35821t2 = !lrVar.f35821t2;
                ((m41) obj).O(true);
                return;
            case 8:
                ((org.telegram.ui.p6) obj2).dismiss();
                ((org.telegram.ui.ActionBar.f2) obj).presentFragment(new org.telegram.ui.y6());
                return;
            case 9:
                ru ruVar = (ru) obj2;
                r5 r5Var = (r5) obj;
                org.telegram.ui.ActionBar.g1 g1Var = ruVar.f37819x1;
                if (g1Var != null) {
                    g1Var.d(true);
                    ruVar.f37819x1 = null;
                    SpannableString spannableString = new SpannableString(org.telegram.messenger.ij.U(i5.e(ruVar.f28621a, r5Var.getDocumentId())));
                    spannableString.setSpan(r5Var, 0, spannableString.length(), 33);
                    if (org.telegram.messenger.g0.g(spannableString)) {
                        org.telegram.messenger.camera.q.r(null, 2131751184, new hc((FrameLayout) ruVar.f28624b, ruVar.I0));
                        return;
                    }
                    return;
                }
                return;
            case 10:
                yx yxVar = (yx) obj2;
                org.telegram.ui.Cells.j8 j8Var = (org.telegram.ui.Cells.j8) obj;
                hy hyVar = yxVar.f40836w;
                qv qvVar = hyVar.D0;
                if (qvVar.indexOfChild(j8Var) != -1 && (T = qvVar.T(j8Var)) != null) {
                    if (T.b() == hyVar.f34425f1) {
                        if (hyVar.f34431h1 != null) {
                            ix ixVar = hyVar.f34467t1;
                            if (ixVar != null) {
                                ixVar.y(hyVar.J1.f26957id);
                                return;
                            }
                            return;
                        }
                        SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(hyVar.f34415c1).f24784f7.edit();
                        String str2 = "group_hide_stickers_" + hyVar.J1.f26957id;
                        TLRPC.StickerSet stickerSet = hyVar.J1.stickerset;
                        if (stickerSet != null) {
                            j3 = stickerSet.f26983id;
                        } else {
                            j3 = 0;
                        }
                        edit.putLong(str2, j3).apply();
                        hyVar.X(false);
                        yx yxVar2 = hyVar.f34484y0;
                        if (yxVar2 != null) {
                            yxVar2.f();
                            return;
                        }
                        return;
                    } else if (yxVar.h.get(T.b()) == hyVar.f34437j1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yxVar.f40830c);
                        String M0 = org.telegram.messenger.id.M0(2131752063, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                        u1Var.R = M0;
                        u1Var.T = org.telegram.messenger.id.M0(2131752064, null);
                        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131752099, null), new bx(yxVar, 1));
                        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                        u1Var.show();
                        TextView textView = (TextView) u1Var.d(-1);
                        if (textView != null) {
                            org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.f28106q7, null);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 11:
                FragmentContextView fragmentContextView = (FragmentContextView) obj2;
                float[] fArr = (float[]) obj;
                float[] fArr2 = FragmentContextView.W0;
                float C = MediaController.B().C(fragmentContextView.W);
                int i13 = 0;
                while (true) {
                    if (i13 < 3) {
                        if (C - 0.1f > fArr[i13]) {
                            i13++;
                        }
                    } else {
                        i13 = -1;
                    }
                }
                int i14 = i13 + 1;
                if (i14 >= 3) {
                    i14 = 0;
                }
                float f10 = fArr[i14];
                MediaController.B().m0(fragmentContextView.W, f10);
                fragmentContextView.l(C, f10, true);
                long currentTimeMillis = System.currentTimeMillis();
                if (fragmentContextView.B0 == null && currentTimeMillis - fragmentContextView.D0 > 300) {
                    a30 a30Var = a30.f31695w;
                    if (a30Var.c()) {
                        a30Var.b();
                        org.telegram.ui.ActionBar.f2 f2Var = fragmentContextView.h;
                        if (f2Var != null && fragmentContextView.C0 != null) {
                            fi.m3 m3Var2 = new fi.m3(fragmentContextView.getContext(), 1);
                            m3Var2.r(true);
                            m3Var2.d = 2300L;
                            m3Var2.T = true;
                            m3Var2.f12423e = true;
                            m3Var2.n(11.0f, 6.0f, 11.0f, 7.0f);
                            m3Var2.f12443u0 = -org.telegram.messenger.g0.L(6.0f);
                            fragmentContextView.B0 = m3Var2;
                            m3Var2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            if (f2Var instanceof org.telegram.ui.cn) {
                                m3Var2.l(((org.telegram.ui.cn) f2Var).K);
                            }
                            m3Var2.u(org.telegram.messenger.id.M0(2131745269, null));
                            m3Var2.f12437q0 = new b3(m3Var2, 1);
                            fragmentContextView.C0.addView(m3Var2, c8.ha.e(-1, 150, 55));
                            m3Var2.y(fragmentContextView.G, true);
                        }
                    }
                }
                fragmentContextView.D0 = currentTimeMillis;
                return;
            case 12:
                s00 s00Var = (s00) obj2;
                org.telegram.ui.ActionBar.q0 q0Var = (org.telegram.ui.ActionBar.q0) obj;
                int indexOf = s00Var.F.indexOf(q0Var.getFilter());
                if (s00Var.I != indexOf) {
                    s00Var.I = indexOf;
                    s00Var.e();
                    return;
                } else if (q0Var.getFilter().h) {
                    if (!q0Var.f28392a.f55500f) {
                        q0Var.setSelectedForDelete(true);
                        return;
                    }
                    jg.o0 filter = q0Var.getFilter();
                    s00Var.f(filter);
                    r00 r00Var = s00Var.H;
                    if (r00Var != null) {
                        ((org.telegram.ui.fv) r00Var).h(filter);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 13:
                ((s2) obj).a(Long.valueOf(((x00) obj2).d));
                return;
            case 14:
                ((org.telegram.ui.dp) obj).run();
                ((n20) obj2).dismiss();
                return;
            case 15:
                ((l60) obj2).u();
                ((org.telegram.ui.ga0) obj).run();
                return;
            case 16:
                l60 l60Var = (l60) obj2;
                ((org.telegram.ui.fu) obj).run();
                if (l60Var.J) {
                    l60Var.u();
                    return;
                }
                return;
            case 17:
                u60 u60Var = (u60) obj2;
                s60 s60Var = (s60) obj;
                TLRPC.InputPeer j12 = org.telegram.messenger.qp.s1(u60Var.f28621a).j1(org.telegram.messenger.ij.B1(u60Var.f38635t1));
                if (u60Var.f38634s1 == 2) {
                    if (u60Var.f38635t1 != u60Var.f38636u1) {
                        if (u60Var.f38631p1.size() <= 1) {
                            z10 = false;
                        }
                        s60Var.a(j12, z10, false, false);
                    }
                } else {
                    u60Var.f38637v1 = j12;
                }
                u60Var.dismiss();
                return;
            case 18:
                bd0 bd0Var = (bd0) obj2;
                org.telegram.ui.ActionBar.g6 g6Var2 = (org.telegram.ui.ActionBar.g6) obj;
                ArrayList arrayList = bd0Var.C1;
                ArrayList arrayList2 = bd0Var.D1;
                org.telegram.ui.ActionBar.f2 f2Var2 = bd0Var.f32225p1;
                TLRPC.TL_userContact_old2 tL_userContact_old2 = bd0Var.E1;
                if (bd0Var.A1) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(bd0Var.getContext());
                    alertDialog$Builder2.f27296a.R = org.telegram.messenger.id.M0(2131754444, null);
                    alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131752589, null), null);
                    alertDialog$Builder2.f(new CharSequence[]{org.telegram.messenger.id.M0(2131751717, null), org.telegram.messenger.id.M0(2131754375, null)}, new xc0(bd0Var));
                    alertDialog$Builder2.p();
                    return;
                }
                if (!tL_userContact_old2.restriction_reason.isEmpty()) {
                    sb2 = new StringBuilder(tL_userContact_old2.restriction_reason.get(0).text);
                } else {
                    sb2 = new StringBuilder(String.format(Locale.US, "BEGIN:VCARD\nVERSION:3.0\nFN:%1$s\nEND:VCARD", org.telegram.messenger.g5.m(0, tL_userContact_old2.first_name, tL_userContact_old2.last_name)));
                }
                int lastIndexOf = sb2.lastIndexOf("END:VCARD");
                if (lastIndexOf >= 0) {
                    tL_userContact_old2.phone = null;
                    int size = arrayList2.size() - 1;
                    while (size >= 0) {
                        org.telegram.messenger.f0 f0Var = (org.telegram.messenger.f0) arrayList2.get(size);
                        boolean z11 = f0Var.d;
                        ?? r62 = f0Var.f22335a;
                        if (z11) {
                            if (tL_userContact_old2.phone == null) {
                                tL_userContact_old2.phone = f0Var.c(z9);
                            }
                            for (int i15 = z9; i15 < r62.size(); i15++) {
                                sb2.insert(lastIndexOf, ((String) r62.get(i15)) + "\n");
                            }
                        }
                        size--;
                        z9 = false;
                    }
                    for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                        org.telegram.messenger.f0 f0Var2 = (org.telegram.messenger.f0) arrayList.get(size2);
                        boolean z12 = f0Var2.d;
                        ArrayList arrayList3 = f0Var2.f22335a;
                        if (z12) {
                            for (int size3 = arrayList3.size() - 1; size3 >= 0; size3 += -1) {
                                sb2.insert(lastIndexOf, ((String) arrayList3.get(size3)) + "\n");
                            }
                        }
                    }
                    tL_userContact_old2.restriction_reason.clear();
                    TLRPC.RestrictionReason restrictionReason = new TLRPC.RestrictionReason();
                    restrictionReason.text = sb2.toString();
                    restrictionReason.reason = "";
                    restrictionReason.platform = "";
                    tL_userContact_old2.restriction_reason.add(restrictionReason);
                }
                boolean z13 = f2Var2 instanceof org.telegram.ui.cn;
                if (z13) {
                    org.telegram.ui.cn cnVar3 = (org.telegram.ui.cn) f2Var2;
                    if (cnVar3.c()) {
                        v4.J(bd0Var.getContext(), cnVar3.a(), new rc0(bd0Var), g6Var2);
                        return;
                    }
                }
                if (z13) {
                    j10 = ((org.telegram.ui.cn) f2Var2).a();
                } else {
                    j10 = 0;
                }
                v4.X(bd0Var.f28621a, 1, j10, new s2(bd0Var, 9));
                return;
            case 19:
                ig0 ig0Var = (ig0) obj2;
                org.telegram.ui.ru ruVar2 = (org.telegram.ui.ru) obj;
                if (ig0Var.J.getTag() == null) {
                    int max = (int) Math.max(1.0f, ig0Var.getValue());
                    org.telegram.ui.ra0 ra0Var = (org.telegram.ui.ra0) ruVar2.f49604b;
                    TLRPC.User user = (TLRPC.User) ruVar2.f49605c;
                    if (ra0Var.getLocationController().h(ra0Var.f49374l0) == null) {
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(ra0Var.getParentActivity());
                        String M02 = org.telegram.messenger.id.M0(2131745453, null);
                        org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder3.f27296a;
                        u1Var2.R = M02;
                        u1Var2.T = org.telegram.messenger.id.M0(2131745454, null);
                        alertDialog$Builder3.k(org.telegram.messenger.id.M0(2131745455, null), new jg.a2(ra0Var, user, max, 11));
                        alertDialog$Builder3.h(org.telegram.messenger.id.M0(2131752589, null), null);
                        ra0Var.showDialog(u1Var2);
                    } else {
                        ra0Var.N.L = true;
                        ra0Var.f49362c.setImageResource(2131232211);
                        ra0Var.w0().k(0L, 24, Integer.valueOf(max), user, null, null);
                        ra0Var.getLocationController().o(max, ra0Var.f49374l0, true);
                        z9 = true;
                    }
                    if (z9) {
                        ig0Var.a();
                        return;
                    }
                    return;
                }
                return;
            case 20:
                mg0 mg0Var = (mg0) obj2;
                Context context = (Context) obj;
                Uri C0 = org.telegram.messenger.g0.C0(mg0Var.f36085i1, "qr_tmp.png", Bitmap.CompressFormat.PNG);
                if (C0 != null) {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("image/*");
                    intent.putExtra("android.intent.extra.STREAM", C0);
                    try {
                        org.telegram.messenger.g0.W(context).startActivityForResult(Intent.createChooser(intent, mg0Var.f28644l0.getText()), 500);
                        return;
                    } catch (ActivityNotFoundException e10) {
                        e10.printStackTrace();
                        return;
                    }
                }
                return;
            case 21:
                Intent intent2 = new Intent("android.intent.action.SEND");
                intent2.setType("text/plain");
                intent2.putExtra("android.intent.extra.TEXT", (String) obj2);
                Intent createChooser = Intent.createChooser(intent2, org.telegram.messenger.id.M0(2131745458, null));
                createChooser.setFlags(268435456);
                ((Context) obj).startActivity(createChooser);
                return;
            case 22:
                org.telegram.ui.ms.p().u(((vv0) obj2).f39816r.d2);
                org.telegram.ui.ms.p().x((org.telegram.ui.Cells.z7) obj);
                return;
            case 23:
                org.telegram.messenger.g0.g((CharSequence) obj2);
                ((Runnable) obj).run();
                return;
            case 24:
                boolean[] zArr = (boolean[]) obj;
                ((org.telegram.ui.ActionBar.v2) obj2).dismiss();
                if (!zArr[0]) {
                    org.telegram.messenger.qp.e1().edit().putInt("showchattagsinfo", 0).apply();
                    zArr[0] = true;
                    return;
                }
                return;
            case 25:
                ((t01) obj2).d();
                org.telegram.ui.cn cnVar4 = ((org.telegram.ui.fk) obj).f45734a;
                w81 f02 = w81.f0(-cnVar4.f44504j6, 0L);
                f02.D = cnVar4;
                cnVar4.presentFragment(f02);
                return;
            case 26:
                w21 w21Var = (w21) obj2;
                w21Var.f39882c2 = false;
                w21Var.X0();
                ((m41) obj).O(true);
                w21Var.I0();
                return;
            case 27:
                View.OnClickListener onClickListener = (View.OnClickListener) obj;
                ImageView imageView = ((r21) obj2).f37546s;
                imageView.animate().rotation(imageView.getRotation() + 180.0f).setDuration(380L).setInterpolator(xq.h).start();
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            case 28:
                org.telegram.ui.dk dkVar = (org.telegram.ui.dk) obj2;
                ((org.telegram.ui.ActionBar.g1) obj).d(true);
                b31.a(dkVar.getContext(), dkVar.d);
                return;
            default:
                UndoView undoView = (UndoView) obj2;
                TLRPC.Message message = (TLRPC.Message) obj;
                int i16 = UndoView.f31601i0;
                undoView.d(1, true);
                TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
                tL_payments_getPaymentReceipt.msg_id = message.f26977id;
                org.telegram.ui.ActionBar.f2 f2Var3 = undoView.f31617s;
                tL_payments_getPaymentReceipt.peer = f2Var3.getMessagesController().m1(message.peer_id);
                f2Var3.getConnectionsManager().sendRequest(tL_payments_getPaymentReceipt, new x1(undoView, 17), 2);
                return;
        }
    }
}
