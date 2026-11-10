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
import org.telegram.ui.x81;
public final class kk implements View.OnClickListener {
    public final int f35361a;
    public final Object f35362b;
    public final Object f35363c;

    public kk(int i7, Object obj, Object obj2) {
        this.f35361a = i7;
        this.f35362b = obj;
        this.f35363c = obj2;
    }

    @Override
    public final void onClick(View view) {
        int b10;
        int i7;
        int i10;
        String G;
        int length;
        View view2;
        kr krVar;
        v4.d1 T;
        long j3;
        StringBuilder sb2;
        long j10;
        int i11 = this.f35361a;
        v4.d1 d1Var = null;
        boolean z9 = false;
        boolean z10 = true;
        Object obj = this.f35363c;
        Object obj2 = this.f35362b;
        switch (i11) {
            case 0:
                vk.O((vk) obj2, (org.telegram.ui.ActionBar.h6) obj);
                return;
            case 1:
                an anVar = (an) ((org.telegram.ui.l4) obj2).f47512e;
                org.telegram.ui.g61 g61Var = anVar.f31922s;
                View F = g61Var.F((ym) obj);
                if (F != null) {
                    d1Var = g61Var.T(F);
                }
                if (d1Var != null && (b10 = d1Var.b() - anVar.f31924t0) >= 0 && b10 < anVar.K.length) {
                    an.S(anVar, b10);
                    return;
                }
                return;
            case 2:
                jn jnVar = (jn) obj2;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj;
                org.telegram.ui.cn cnVar = jnVar.G;
                if (jnVar.T) {
                    cnVar.showDialog(u4.S(jnVar.getContext(), cnVar.h, h6Var).f27300a);
                    return;
                }
                fn fnVar = jnVar.f34997e;
                if (cnVar.getParentActivity() != null) {
                    TLRPC.Chat chat = cnVar.f44473e;
                    if (chat != null && !org.telegram.messenger.t3.y(13, chat)) {
                        if (jnVar.f34990a.f55499f && cnVar.getParentActivity() != null && cnVar.fragmentView != null && cnVar.f44620p8 != null) {
                            if (cnVar.C2 == null) {
                                i10 = 0;
                                fi.m3 E6 = cnVar.E6(310.0f, 1, -1, false);
                                cnVar.C2 = E6;
                                E6.d = 4000L;
                            } else {
                                i10 = 0;
                            }
                            int i12 = cnVar.f44620p8.ttl_period;
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
                            cnVar.C2.y(cnVar.f44601o1.getTimeItem(), true);
                            return;
                        }
                        return;
                    }
                    TLRPC.ChatFull chatFull = cnVar.f44620p8;
                    TLRPC.UserFull userFull = cnVar.f44633q8;
                    if (userFull != null) {
                        i7 = userFull.ttl_period;
                    } else if (chatFull != null) {
                        i7 = chatFull.ttl_period;
                    } else {
                        i7 = 0;
                    }
                    org.telegram.messenger.re reVar = new org.telegram.messenger.re(jnVar.getContext(), null, new gn(jnVar, r4), true, 0, jnVar.f34996d0);
                    reVar.u(i7);
                    hn hnVar = new hn(jnVar, (ActionBarPopupWindow$ActionBarPopupWindowLayout) reVar.f25287b);
                    org.telegram.ui.ActionBar.g1[] g1VarArr = {hnVar};
                    hnVar.f27493e = true;
                    hnVar.f27492c = 220;
                    hnVar.setOutsideTouchable(true);
                    g1VarArr[0].setClippingEnabled(true);
                    g1VarArr[0].setAnimationStyle(2131755192);
                    g1VarArr[0].setFocusable(true);
                    ((ActionBarPopupWindow$ActionBarPopupWindowLayout) reVar.f25287b).measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE));
                    g1VarArr[0].setInputMethodMode(2);
                    g1VarArr[0].getContentView().setFocusableInTouchMode(true);
                    g1VarArr[0].showAtLocation(fnVar, 0, (int) (jnVar.getX() + fnVar.getX()), (int) fnVar.getY());
                    cnVar.w8(false, true, 0.2f);
                    return;
                }
                return;
            case 3:
                vo voVar = (vo) obj2;
                org.telegram.ui.cn cnVar2 = (org.telegram.ui.cn) obj;
                if (voVar.f39066p1 != null) {
                    voVar.f39066p1 = null;
                    voVar.dismiss();
                    org.telegram.messenger.d4.f(voVar.f28669a).a(cnVar2.a(), true, false);
                    return;
                }
                voVar.dismiss();
                return;
            case 4:
                sq sqVar = (sq) obj2;
                sqVar.U1 = org.telegram.messenger.qp.s1(sqVar.f28669a).j1(org.telegram.messenger.ij.B1((TLRPC.Peer) obj));
                sqVar.dismiss();
                return;
            case 5:
                ar arVar = (ar) obj2;
                String str = (String) obj;
                if (arVar.f31970b == null && (view2 = arVar.d) != null) {
                    View findFocus = view2.findFocus();
                    if (findFocus instanceof EditText) {
                        arVar.f31970b = (EditText) findFocus;
                    }
                }
                if (arVar.f31970b != null) {
                    try {
                        arVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    EditText editText = arVar.f31970b;
                    if (editText instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText).v(true, false);
                    }
                    Editable text = arVar.f31970b.getText();
                    if (arVar.f31970b.getSelectionEnd() == arVar.f31970b.length()) {
                        length = -1;
                    } else {
                        length = str.length() + arVar.f31970b.getSelectionStart();
                    }
                    if (arVar.f31970b.getSelectionStart() != -1 && arVar.f31970b.getSelectionEnd() != -1) {
                        EditText editText2 = arVar.f31970b;
                        editText2.setText(text.replace(editText2.getSelectionStart(), arVar.f31970b.getSelectionEnd(), str));
                        EditText editText3 = arVar.f31970b;
                        if (length == -1) {
                            length = editText3.length();
                        }
                        editText3.setSelection(length);
                    } else {
                        arVar.f31970b.setText(str);
                        EditText editText4 = arVar.f31970b;
                        editText4.setSelection(editText4.length());
                    }
                    EditText editText5 = arVar.f31970b;
                    if (editText5 instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText5).v(false, true);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                kr krVar2 = (kr) obj2;
                jr jrVar = (jr) obj;
                krVar2.X0();
                jrVar.f35051f = !jrVar.f35051f;
                jrVar.f35054j.S1.O(true);
                krVar2.I0();
                return;
            case 7:
                ((kr) obj2).f35415w2 = !krVar.f35415w2;
                ((m41) obj).O(true);
                return;
            case 8:
                ((org.telegram.ui.p6) obj2).dismiss();
                ((org.telegram.ui.ActionBar.f2) obj).presentFragment(new org.telegram.ui.y6());
                return;
            case 9:
                qu quVar = (qu) obj2;
                q5 q5Var = (q5) obj;
                org.telegram.ui.ActionBar.g1 g1Var = quVar.A1;
                if (g1Var != null) {
                    g1Var.d(true);
                    quVar.A1 = null;
                    SpannableString spannableString = new SpannableString(org.telegram.messenger.ij.U(h5.e(quVar.f28669a, q5Var.getDocumentId())));
                    spannableString.setSpan(q5Var, 0, spannableString.length(), 33);
                    if (org.telegram.messenger.g0.g(spannableString)) {
                        org.telegram.messenger.camera.q.r(null, 2131751184, new gc((FrameLayout) quVar.f28672b, quVar.I0));
                        return;
                    }
                    return;
                }
                return;
            case 10:
                xx xxVar = (xx) obj2;
                org.telegram.ui.Cells.j8 j8Var = (org.telegram.ui.Cells.j8) obj;
                gy gyVar = xxVar.f40431w;
                pv pvVar = gyVar.D0;
                if (pvVar.indexOfChild(j8Var) != -1 && (T = pvVar.T(j8Var)) != null) {
                    if (T.b() == gyVar.f34026f1) {
                        if (gyVar.f34032h1 != null) {
                            hx hxVar = gyVar.f34068t1;
                            if (hxVar != null) {
                                hxVar.y(gyVar.J1.f26961id);
                                return;
                            }
                            return;
                        }
                        SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(gyVar.f34016c1).f24788f7.edit();
                        String str2 = "group_hide_stickers_" + gyVar.J1.f26961id;
                        TLRPC.StickerSet stickerSet = gyVar.J1.stickerset;
                        if (stickerSet != null) {
                            j3 = stickerSet.f26987id;
                        } else {
                            j3 = 0;
                        }
                        edit.putLong(str2, j3).apply();
                        gyVar.X(false);
                        xx xxVar2 = gyVar.f34085y0;
                        if (xxVar2 != null) {
                            xxVar2.f();
                            return;
                        }
                        return;
                    } else if (xxVar.h.get(T.b()) == gyVar.f34038j1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xxVar.f40425c);
                        String M0 = org.telegram.messenger.id.M0(2131752063, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
                        u1Var.R = M0;
                        u1Var.T = org.telegram.messenger.id.M0(2131752064, null);
                        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131752099, null), new ax(xxVar, 1));
                        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                        u1Var.show();
                        TextView textView = (TextView) u1Var.d(-1);
                        if (textView != null) {
                            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f28131q7, null);
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
                    z20 z20Var = z20.f40837w;
                    if (z20Var.c()) {
                        z20Var.b();
                        org.telegram.ui.ActionBar.f2 f2Var = fragmentContextView.h;
                        if (f2Var != null && fragmentContextView.C0 != null) {
                            fi.m3 m3Var2 = new fi.m3(fragmentContextView.getContext(), 1);
                            m3Var2.r(true);
                            m3Var2.d = 2300L;
                            m3Var2.T = true;
                            m3Var2.f12424e = true;
                            m3Var2.n(11.0f, 6.0f, 11.0f, 7.0f);
                            m3Var2.f12444u0 = -org.telegram.messenger.g0.L(6.0f);
                            fragmentContextView.B0 = m3Var2;
                            m3Var2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            if (f2Var instanceof org.telegram.ui.cn) {
                                m3Var2.l(((org.telegram.ui.cn) f2Var).K);
                            }
                            m3Var2.u(org.telegram.messenger.id.M0(2131745269, null));
                            m3Var2.f12438q0 = new a3(m3Var2, 1);
                            fragmentContextView.C0.addView(m3Var2, c8.ha.e(-1, 150, 55));
                            m3Var2.y(fragmentContextView.G, true);
                        }
                    }
                }
                fragmentContextView.D0 = currentTimeMillis;
                return;
            case 12:
                r00 r00Var = (r00) obj2;
                org.telegram.ui.ActionBar.q0 q0Var = (org.telegram.ui.ActionBar.q0) obj;
                int indexOf = r00Var.F.indexOf(q0Var.getFilter());
                if (r00Var.I != indexOf) {
                    r00Var.I = indexOf;
                    r00Var.e();
                    return;
                } else if (q0Var.getFilter().h) {
                    if (!q0Var.f28395a.f55499f) {
                        q0Var.setSelectedForDelete(true);
                        return;
                    }
                    jg.o0 filter = q0Var.getFilter();
                    r00Var.f(filter);
                    q00 q00Var = r00Var.H;
                    if (q00Var != null) {
                        ((org.telegram.ui.gv) q00Var).h(filter);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 13:
                ((r2) obj).a(Long.valueOf(((w00) obj2).d));
                return;
            case 14:
                ((org.telegram.ui.dp) obj).run();
                ((m20) obj2).dismiss();
                return;
            case 15:
                ((k60) obj2).u();
                ((org.telegram.ui.ha0) obj).run();
                return;
            case 16:
                k60 k60Var = (k60) obj2;
                ((org.telegram.ui.gu) obj).run();
                if (k60Var.J) {
                    k60Var.u();
                    return;
                }
                return;
            case 17:
                t60 t60Var = (t60) obj2;
                r60 r60Var = (r60) obj;
                TLRPC.InputPeer j12 = org.telegram.messenger.qp.s1(t60Var.f28669a).j1(org.telegram.messenger.ij.B1(t60Var.f38225w1));
                if (t60Var.f38224v1 == 2) {
                    if (t60Var.f38225w1 != t60Var.f38226x1) {
                        if (t60Var.f38221s1.size() <= 1) {
                            z10 = false;
                        }
                        r60Var.a(j12, z10, false, false);
                    }
                } else {
                    t60Var.f38227y1 = j12;
                }
                t60Var.dismiss();
                return;
            case 18:
                ad0 ad0Var = (ad0) obj2;
                org.telegram.ui.ActionBar.h6 h6Var2 = (org.telegram.ui.ActionBar.h6) obj;
                ArrayList arrayList = ad0Var.F1;
                ArrayList arrayList2 = ad0Var.G1;
                org.telegram.ui.ActionBar.f2 f2Var2 = ad0Var.f31831s1;
                TLRPC.TL_userContact_old2 tL_userContact_old2 = ad0Var.H1;
                if (ad0Var.D1) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ad0Var.getContext());
                    alertDialog$Builder2.f27300a.R = org.telegram.messenger.id.M0(2131754444, null);
                    alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131752589, null), null);
                    alertDialog$Builder2.f(new CharSequence[]{org.telegram.messenger.id.M0(2131751717, null), org.telegram.messenger.id.M0(2131754375, null)}, new wc0(ad0Var));
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
                        ?? r62 = f0Var.f22339a;
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
                        ArrayList arrayList3 = f0Var2.f22339a;
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
                        u4.J(ad0Var.getContext(), cnVar3.a(), new qc0(ad0Var), h6Var2);
                        return;
                    }
                }
                if (z13) {
                    j10 = ((org.telegram.ui.cn) f2Var2).a();
                } else {
                    j10 = 0;
                }
                u4.X(ad0Var.f28669a, 1, j10, new r2(ad0Var, 9));
                return;
            case 19:
                hg0 hg0Var = (hg0) obj2;
                org.telegram.ui.su suVar = (org.telegram.ui.su) obj;
                if (hg0Var.J.getTag() == null) {
                    int max = (int) Math.max(1.0f, hg0Var.getValue());
                    org.telegram.ui.sa0 sa0Var = (org.telegram.ui.sa0) suVar.f49958b;
                    TLRPC.User user = (TLRPC.User) suVar.f49959c;
                    if (sa0Var.getLocationController().h(sa0Var.f49783l0) == null) {
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(sa0Var.getParentActivity());
                        String M02 = org.telegram.messenger.id.M0(2131745453, null);
                        org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder3.f27300a;
                        u1Var2.R = M02;
                        u1Var2.T = org.telegram.messenger.id.M0(2131745454, null);
                        alertDialog$Builder3.k(org.telegram.messenger.id.M0(2131745455, null), new jg.a2(sa0Var, user, max, 11));
                        alertDialog$Builder3.h(org.telegram.messenger.id.M0(2131752589, null), null);
                        sa0Var.showDialog(u1Var2);
                    } else {
                        sa0Var.N.L = true;
                        sa0Var.f49771c.setImageResource(2131232211);
                        sa0Var.w0().k(0L, 24, Integer.valueOf(max), user, null, null);
                        sa0Var.getLocationController().o(max, sa0Var.f49783l0, true);
                        z9 = true;
                    }
                    if (z9) {
                        hg0Var.a();
                        return;
                    }
                    return;
                }
                return;
            case 20:
                lg0 lg0Var = (lg0) obj2;
                Context context = (Context) obj;
                Uri C0 = org.telegram.messenger.g0.C0(lg0Var.l1, "qr_tmp.png", Bitmap.CompressFormat.PNG);
                if (C0 != null) {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("image/*");
                    intent.putExtra("android.intent.extra.STREAM", C0);
                    try {
                        org.telegram.messenger.g0.W(context).startActivityForResult(Intent.createChooser(intent, lg0Var.f28695l0.getText()), 500);
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
                org.telegram.ui.ns.p().u(((uv0) obj2).f38757r.f40741g2);
                org.telegram.ui.ns.p().x((org.telegram.ui.Cells.z7) obj);
                return;
            case 23:
                org.telegram.messenger.g0.g((CharSequence) obj2);
                ((Runnable) obj).run();
                return;
            case 24:
                boolean[] zArr = (boolean[]) obj;
                ((org.telegram.ui.ActionBar.w2) obj2).dismiss();
                if (!zArr[0]) {
                    org.telegram.messenger.qp.e1().edit().putInt("showchattagsinfo", 0).apply();
                    zArr[0] = true;
                    return;
                }
                return;
            case 25:
                ((s01) obj2).d();
                org.telegram.ui.cn cnVar4 = ((org.telegram.ui.fk) obj).f45787a;
                x81 f02 = x81.f0(-cnVar4.f44545j6, 0L);
                f02.D = cnVar4;
                cnVar4.presentFragment(f02);
                return;
            case 26:
                v21 v21Var = (v21) obj2;
                v21Var.f38825f2 = false;
                v21Var.X0();
                ((m41) obj).O(true);
                v21Var.I0();
                return;
            case 27:
                View.OnClickListener onClickListener = (View.OnClickListener) obj;
                ImageView imageView = ((q21) obj2).f37144s;
                imageView.animate().rotation(imageView.getRotation() + 180.0f).setDuration(380L).setInterpolator(wq.h).start();
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            case 28:
                org.telegram.ui.dk dkVar = (org.telegram.ui.dk) obj2;
                ((org.telegram.ui.ActionBar.g1) obj).d(true);
                a31.a(dkVar.getContext(), dkVar.d);
                return;
            default:
                UndoView undoView = (UndoView) obj2;
                TLRPC.Message message = (TLRPC.Message) obj;
                int i16 = UndoView.f31609i0;
                undoView.d(1, true);
                TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
                tL_payments_getPaymentReceipt.msg_id = message.f26981id;
                org.telegram.ui.ActionBar.f2 f2Var3 = undoView.f31625s;
                tL_payments_getPaymentReceipt.peer = f2Var3.getMessagesController().m1(message.peer_id);
                f2Var3.getConnectionsManager().sendRequest(tL_payments_getPaymentReceipt, new w1(undoView, 17), 2);
                return;
        }
    }
}
