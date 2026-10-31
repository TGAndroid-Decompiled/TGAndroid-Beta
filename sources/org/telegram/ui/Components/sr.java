package org.telegram.ui.Components;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.net.Uri;
import android.provider.Settings;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.be1;
import org.telegram.ui.la1;
public final class sr implements View.OnClickListener {
    public final int f30342a;
    public final Object f30343b;
    public final Object f30344c;

    public sr(int i10, Object obj, Object obj2) {
        this.f30342a = i10;
        this.f30343b = obj;
        this.f30344c = obj2;
    }

    @Override
    public final void onClick(View view) {
        vr vrVar;
        s4.c1 T;
        long j10;
        int i10;
        StringBuilder sb2;
        long j11;
        int i11 = -1;
        boolean z10 = false;
        boolean z11 = true;
        switch (this.f30342a) {
            case 0:
                ((vr) this.f30343b).f31829t2 = !vrVar.f31829t2;
                ((p51) this.f30344c).O(true);
                return;
            case 1:
                ((org.telegram.ui.p6) this.f30343b).dismiss();
                ((org.telegram.ui.ActionBar.k2) this.f30344c).presentFragment(new org.telegram.ui.y6());
                return;
            case 2:
                cv cvVar = (cv) this.f30343b;
                o5 o5Var = (o5) this.f30344c;
                org.telegram.ui.ActionBar.k1 k1Var = cvVar.f25175x1;
                if (k1Var != null) {
                    k1Var.d(true);
                    cvVar.f25175x1 = null;
                    SpannableString spannableString = new SpannableString(org.telegram.messenger.jj.U(f5.e(cvVar.f21583a, o5Var.getDocumentId())));
                    spannableString.setSpan(o5Var, 0, spannableString.length(), 33);
                    if (org.telegram.messenger.i0.g(spannableString)) {
                        org.telegram.messenger.z20.r(null, 2131751185, new cc((FrameLayout) cvVar.f21586b, cvVar.I0));
                        return;
                    }
                    return;
                }
                return;
            case 3:
                ny nyVar = (ny) this.f30343b;
                org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) this.f30344c;
                vy vyVar = nyVar.f28919w;
                bw bwVar = vyVar.D0;
                if (bwVar.indexOfChild(n8Var) != -1 && (T = bwVar.T(n8Var)) != null) {
                    if (T.b() == vyVar.f31875f1) {
                        if (vyVar.f31881h1 != null) {
                            vx vxVar = vyVar.f31918t1;
                            if (vxVar != null) {
                                vxVar.y(vyVar.J1.f19794id);
                                return;
                            }
                            return;
                        }
                        SharedPreferences.Editor edit = org.telegram.messenger.vp.r1(vyVar.f31865c1).f18795g7.edit();
                        String str = "group_hide_stickers_" + vyVar.J1.f19794id;
                        TLRPC.StickerSet stickerSet = vyVar.J1.stickerset;
                        if (stickerSet != null) {
                            j10 = stickerSet.f19820id;
                        } else {
                            j10 = 0;
                        }
                        edit.putLong(str, j10).apply();
                        vyVar.Y(false);
                        ny nyVar2 = vyVar.f31935y0;
                        if (nyVar2 != null) {
                            nyVar2.f();
                            return;
                        }
                        return;
                    } else if (nyVar.h.get(T.b()) == vyVar.f31887j1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(nyVar.f28914c);
                        alertDialog$Builder.f20134a.R = org.telegram.messenger.cd.L0(2131752063, null);
                        alertDialog$Builder.f20134a.T = org.telegram.messenger.cd.L0(2131752064, null);
                        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131752099, null), new px(nyVar, 1));
                        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                        x1Var.show();
                        TextView textView = (TextView) x1Var.d(-1);
                        if (textView != null) {
                            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21170q7, null);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 4:
                FragmentContextView fragmentContextView = (FragmentContextView) this.f30343b;
                float[] fArr = (float[]) this.f30344c;
                float[] fArr2 = FragmentContextView.W0;
                float C = MediaController.B().C(fragmentContextView.W);
                int i12 = 0;
                while (true) {
                    if (i12 < 3) {
                        if (C - 0.1f <= fArr[i12]) {
                            i11 = i12;
                        } else {
                            i12++;
                        }
                    }
                }
                int i13 = i11 + 1;
                if (i13 >= 3) {
                    i10 = 0;
                } else {
                    i10 = i13;
                }
                float f7 = fArr[i10];
                MediaController.B().m0(fragmentContextView.W, f7);
                fragmentContextView.l(C, f7, true);
                long currentTimeMillis = System.currentTimeMillis();
                if (fragmentContextView.B0 == null && currentTimeMillis - fragmentContextView.D0 > 300) {
                    r30 r30Var = r30.f29814w;
                    if (r30Var.c()) {
                        r30Var.b();
                        if (fragmentContextView.h != null && fragmentContextView.C0 != null) {
                            z00 z00Var = new z00(fragmentContextView, fragmentContextView.getContext());
                            fragmentContextView.B0 = z00Var;
                            z00Var.setExtraTranslationY(org.telegram.messenger.i0.L(-12.0f));
                            fragmentContextView.B0.setText(org.telegram.messenger.cd.L0(2131745287, null));
                            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                            marginLayoutParams.rightMargin = org.telegram.messenger.i0.L(3.0f);
                            fragmentContextView.C0.addView(fragmentContextView.B0, marginLayoutParams);
                            fragmentContextView.B0.f(fragmentContextView.G, true);
                        }
                    }
                }
                fragmentContextView.D0 = currentTimeMillis;
                return;
            case 5:
                h10 h10Var = (h10) this.f30343b;
                org.telegram.ui.ActionBar.s0 s0Var = (org.telegram.ui.ActionBar.s0) this.f30344c;
                int indexOf = h10Var.F.indexOf(s0Var.getFilter());
                if (h10Var.I != indexOf) {
                    h10Var.I = indexOf;
                    h10Var.e();
                    return;
                } else if (s0Var.getFilter().h) {
                    if (!s0Var.f20753a.f7021f) {
                        s0Var.setSelectedForDelete(true);
                        return;
                    }
                    zf.e0 filter = s0Var.getFilter();
                    h10Var.f(filter);
                    g10 g10Var = h10Var.H;
                    if (g10Var != null) {
                        ((org.telegram.ui.iw) g10Var).h(filter);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 6:
                ((r2) this.f30344c).a(Long.valueOf(((m10) this.f30343b).d));
                return;
            case 7:
                ((org.telegram.ui.zp) this.f30344c).run();
                ((e30) this.f30343b).dismiss();
                return;
            case 8:
                ((z60) this.f30343b).u();
                ((a3.i0) this.f30344c).run();
                return;
            case 9:
                z60 z60Var = (z60) this.f30343b;
                ((org.telegram.ui.gv) this.f30344c).run();
                if (z60Var.J) {
                    z60Var.u();
                    return;
                }
                return;
            case 10:
                k70 k70Var = (k70) this.f30343b;
                i70 i70Var = (i70) this.f30344c;
                TLRPC.InputPeer i14 = org.telegram.messenger.vp.r1(k70Var.f21583a).i1(org.telegram.messenger.jj.C1(k70Var.f27666t1));
                if (k70Var.f27665s1 == 2) {
                    if (k70Var.f27666t1 != k70Var.f27667u1) {
                        if (k70Var.f27662p1.size() <= 1) {
                            z11 = false;
                        }
                        i70Var.a(i14, z11, false, false);
                    }
                } else {
                    k70Var.f27668v1 = i14;
                }
                k70Var.dismiss();
                return;
            case 11:
                vd0 vd0Var = (vd0) this.f30343b;
                org.telegram.ui.ActionBar.p6 p6Var = (org.telegram.ui.ActionBar.p6) this.f30344c;
                ArrayList arrayList = vd0Var.C1;
                ArrayList arrayList2 = vd0Var.D1;
                org.telegram.ui.ActionBar.k2 k2Var = vd0Var.f31222p1;
                TLRPC.TL_userContact_old2 tL_userContact_old2 = vd0Var.E1;
                if (vd0Var.A1) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(vd0Var.getContext());
                    alertDialog$Builder2.f20134a.R = org.telegram.messenger.cd.L0(2131754444, null);
                    alertDialog$Builder2.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                    alertDialog$Builder2.f(new CharSequence[]{org.telegram.messenger.cd.L0(2131751718, null), org.telegram.messenger.cd.L0(2131754375, null)}, new rd0(vd0Var));
                    alertDialog$Builder2.p();
                    return;
                }
                if (!tL_userContact_old2.restriction_reason.isEmpty()) {
                    sb2 = new StringBuilder(tL_userContact_old2.restriction_reason.get(0).text);
                } else {
                    sb2 = new StringBuilder(String.format(Locale.US, "BEGIN:VCARD\nVERSION:3.0\nFN:%1$s\nEND:VCARD", org.telegram.messenger.i5.m(0, tL_userContact_old2.first_name, tL_userContact_old2.last_name)));
                }
                int lastIndexOf = sb2.lastIndexOf("END:VCARD");
                if (lastIndexOf >= 0) {
                    tL_userContact_old2.phone = null;
                    int size = arrayList2.size() - 1;
                    while (size >= 0) {
                        org.telegram.messenger.h0 h0Var = (org.telegram.messenger.h0) arrayList2.get(size);
                        boolean z12 = h0Var.d;
                        ?? r62 = h0Var.f15796a;
                        if (z12) {
                            if (tL_userContact_old2.phone == null) {
                                tL_userContact_old2.phone = h0Var.c(z10);
                            }
                            for (int i15 = z10; i15 < r62.size(); i15++) {
                                sb2.insert(lastIndexOf, ((String) r62.get(i15)) + "\n");
                            }
                        }
                        size--;
                        z10 = false;
                    }
                    for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                        org.telegram.messenger.h0 h0Var2 = (org.telegram.messenger.h0) arrayList.get(size2);
                        boolean z13 = h0Var2.d;
                        ArrayList arrayList3 = h0Var2.f15796a;
                        if (z13) {
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
                boolean z14 = k2Var instanceof org.telegram.ui.un;
                if (z14) {
                    org.telegram.ui.un unVar = (org.telegram.ui.un) k2Var;
                    if (unVar.c()) {
                        s4.L(vd0Var.getContext(), unVar.a(), new ld0(vd0Var), p6Var);
                        return;
                    }
                }
                if (z14) {
                    j11 = ((org.telegram.ui.un) k2Var).a();
                } else {
                    j11 = 0;
                }
                s4.Z(vd0Var.f21583a, 1, j11, new r2(vd0Var, 9));
                return;
            case 12:
                jh0 jh0Var = (jh0) this.f30343b;
                org.telegram.ui.rv rvVar = (org.telegram.ui.rv) this.f30344c;
                if (jh0Var.J.getTag() == null) {
                    int max = (int) Math.max(1.0f, jh0Var.getValue());
                    org.telegram.ui.yb0 yb0Var = (org.telegram.ui.yb0) rvVar.f41298b;
                    TLRPC.User user = (TLRPC.User) rvVar.f41299c;
                    if (yb0Var.getLocationController().h(yb0Var.f43797n0) == null) {
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(yb0Var.getParentActivity());
                        alertDialog$Builder3.f20134a.R = org.telegram.messenger.cd.L0(2131745471, null);
                        alertDialog$Builder3.f20134a.T = org.telegram.messenger.cd.L0(2131745472, null);
                        alertDialog$Builder3.k(org.telegram.messenger.cd.L0(2131745473, null), new ag.b0(yb0Var, user, max, 12));
                        alertDialog$Builder3.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                        yb0Var.showDialog(alertDialog$Builder3.f20134a);
                    } else {
                        yb0Var.P.L = true;
                        yb0Var.f43784c.setImageResource(2131232210);
                        yb0Var.x0().k(0L, 24, Integer.valueOf(max), user, null, null);
                        yb0Var.getLocationController().o(max, yb0Var.f43797n0, true);
                        z10 = true;
                    }
                    if (z10) {
                        jh0Var.a();
                        return;
                    }
                    return;
                }
                return;
            case 13:
                nh0 nh0Var = (nh0) this.f30343b;
                Context context = (Context) this.f30344c;
                Uri C0 = org.telegram.messenger.i0.C0(nh0Var.f28792i1, "qr_tmp.png", Bitmap.CompressFormat.PNG);
                if (C0 != null) {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("image/*");
                    intent.putExtra("android.intent.extra.STREAM", C0);
                    try {
                        org.telegram.messenger.i0.W(context).startActivityForResult(Intent.createChooser(intent, nh0Var.f21605l0.getText()), 500);
                        return;
                    } catch (ActivityNotFoundException e) {
                        e.printStackTrace();
                        return;
                    }
                }
                return;
            case 14:
                Intent intent2 = new Intent("android.intent.action.SEND");
                intent2.setType("text/plain");
                intent2.putExtra("android.intent.extra.TEXT", (String) this.f30343b);
                Intent createChooser = Intent.createChooser(intent2, org.telegram.messenger.cd.L0(2131745476, null));
                createChooser.setFlags(268435456);
                ((Context) this.f30344c).startActivity(createChooser);
                return;
            case 15:
                org.telegram.ui.lt.p().u(((yw0) this.f30343b).f32816r.f25199d2);
                org.telegram.ui.lt.p().x((org.telegram.ui.Cells.d8) this.f30344c);
                return;
            case 16:
                org.telegram.messenger.i0.g((CharSequence) this.f30343b);
                ((Runnable) this.f30344c).run();
                return;
            case 17:
                boolean[] zArr = (boolean[]) this.f30344c;
                ((org.telegram.ui.ActionBar.z2) this.f30343b).dismiss();
                if (!zArr[0]) {
                    org.telegram.messenger.vp.d1().edit().putInt("showchattagsinfo", 0).apply();
                    zArr[0] = true;
                    return;
                }
                return;
            case 18:
                ((t11) this.f30343b).b();
                org.telegram.ui.un unVar2 = ((org.telegram.ui.al) this.f30344c).f35669a;
                la1 e02 = la1.e0(-unVar2.f42297j6, 0L);
                e02.D = unVar2;
                unVar2.presentFragment(e02);
                return;
            case 19:
                x31 x31Var = (x31) this.f30343b;
                x31Var.f32307c2 = false;
                x31Var.X0();
                ((p51) this.f30344c).O(true);
                x31Var.I0();
                return;
            case 20:
                View.OnClickListener onClickListener = (View.OnClickListener) this.f30344c;
                ImageView imageView = ((s31) this.f30343b).f30121s;
                imageView.animate().rotation(imageView.getRotation() + 180.0f).setDuration(380L).setInterpolator(gr.h).start();
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            case 21:
                org.telegram.ui.xk xkVar = (org.telegram.ui.xk) this.f30343b;
                ((org.telegram.ui.ActionBar.k1) this.f30344c).d(true);
                d41.a(xkVar.getContext(), xkVar.d);
                return;
            case 22:
                UndoView undoView = (UndoView) this.f30343b;
                TLRPC.Message message = (TLRPC.Message) this.f30344c;
                int i16 = UndoView.f24237i0;
                undoView.d(1, true);
                TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
                tL_payments_getPaymentReceipt.msg_id = message.f19814id;
                org.telegram.ui.ActionBar.k2 k2Var2 = undoView.f24252s;
                tL_payments_getPaymentReceipt.peer = k2Var2.getMessagesController().l1(message.peer_id);
                k2Var2.getConnectionsManager().sendRequest(tL_payments_getPaymentReceipt, new x1(undoView, 17), 2);
                return;
            case 23:
                a61 a61Var = (a61) this.f30343b;
                File file = (File) this.f30344c;
                if (file == null) {
                    a61Var.getClass();
                    return;
                }
                Activity W = org.telegram.messenger.i0.W(a61Var.getContext());
                if (W != null) {
                    org.telegram.messenger.i0.t2(file, "Telegram.apk", "application/vnd.android.package-archive", W, null, false);
                    a61Var.dismiss();
                    return;
                }
                return;
            case 24:
                org.telegram.ui.y20 y20Var = (org.telegram.ui.y20) this.f30343b;
                org.telegram.ui.b50 b50Var = (org.telegram.ui.b50) this.f30344c;
                if (y20Var.h()) {
                    if (mf.b.a(b50Var.Z1) > 0) {
                        org.telegram.ui.Components.voip.s0.h(b50Var.Z1);
                        b50Var.dismiss();
                        return;
                    }
                    s4.A(b50Var.Z1, null, true).p();
                    return;
                }
                LaunchActivity launchActivity = b50Var.Z1;
                Typeface typeface = org.telegram.messenger.i0.f15999a;
                if (Settings.canDrawOverlays(launchActivity)) {
                    g20.f26225e0 = false;
                    b50Var.dismiss();
                    return;
                }
                s4.z(y20Var.getContext()).p();
                return;
            case 25:
                org.telegram.ui.Components.voip.e0 e0Var = (org.telegram.ui.Components.voip.e0) this.f30343b;
                bi0 bi0Var = (bi0) this.f30344c;
                boolean z15 = e0Var.f31402w;
                e0Var.f31402w = !z15;
                if (!z15) {
                    bi0Var.M(36);
                    bi0Var.P(69);
                } else {
                    bi0Var.M(69);
                    bi0Var.P(99);
                }
                bi0Var.start();
                return;
            case 26:
                boolean[] zArr2 = (boolean[]) this.f30343b;
                boolean z16 = !zArr2[0];
                zArr2[0] = z16;
                ((org.telegram.ui.Cells.c2) this.f30344c).c(z16, true);
                return;
            case 27:
                org.telegram.ui.Components.voip.t1 t1Var = (org.telegram.ui.Components.voip.t1) this.f30343b;
                Context context2 = (Context) this.f30344c;
                t1Var.getClass();
                boolean z17 = context2 instanceof LaunchActivity;
                if (z17 && !org.telegram.messenger.w0.f19032x) {
                    be1.v((Activity) context2, t1Var.M);
                    return;
                } else if (z17) {
                    Intent intent3 = new Intent(context2, LaunchActivity.class);
                    intent3.setAction("voip");
                    context2.startActivity(intent3);
                    return;
                } else {
                    return;
                }
            case 28:
                org.telegram.ui.ns nsVar = (org.telegram.ui.ns) this.f30343b;
                nsVar.showDialog((org.telegram.ui.ActionBar.z2) s4.l(nsVar.getParentActivity(), org.telegram.messenger.cd.a0(null, null, 2131743702, org.telegram.messenger.h20.k((TLRPC.User) this.f30344c)), org.telegram.messenger.cd.L0(2131743703, null), null, new org.telegram.ui.s3(nsVar, 5), null, false, false, nsVar.f40040r).f11587b);
                return;
            default:
                ArrayList arrayList4 = (ArrayList) this.f30344c;
                org.telegram.ui.lt ltVar = ((org.telegram.ui.gt) this.f30343b).f37643a;
                if (ltVar.f39406w != null) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    if (((Integer) arrayList4.get(intValue)).intValue() == 0) {
                        org.telegram.ui.jt jtVar = ltVar.f39396l;
                        TLObject tLObject = ltVar.W;
                        if (tLObject == null) {
                            tLObject = ltVar.Z;
                        }
                        jtVar.r(0, 0, ltVar.f39386b0, tLObject, true);
                    } else if (((Integer) arrayList4.get(intValue)).intValue() == 4) {
                        org.telegram.ui.jt jtVar2 = ltVar.f39396l;
                        TLObject tLObject2 = ltVar.W;
                        if (tLObject2 == null) {
                            tLObject2 = ltVar.Z;
                        }
                        jtVar2.r(0, 0, ltVar.f39386b0, tLObject2, false);
                    } else if (((Integer) arrayList4.get(intValue)).intValue() == 1) {
                        org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(ltVar.f39402r);
                        TLRPC.Document document = ltVar.W;
                        int size4 = b02.f18324i0.size();
                        int i17 = 0;
                        while (true) {
                            if (i17 < size4) {
                                if (((TLRPC.Document) b02.f18324i0.get(i17)).f19799id == document.f19799id) {
                                    b02.f18324i0.remove(i17);
                                } else {
                                    i17++;
                                }
                            }
                        }
                        TLRPC.TL_messages_saveGif tL_messages_saveGif = new TLRPC.TL_messages_saveGif();
                        TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                        tL_messages_saveGif.f19902id = tL_inputDocument;
                        tL_inputDocument.f19805id = document.f19799id;
                        tL_inputDocument.access_hash = document.access_hash;
                        byte[] bArr = document.file_reference;
                        tL_inputDocument.file_reference = bArr;
                        if (bArr == null) {
                            tL_inputDocument.file_reference = new byte[0];
                        }
                        tL_messages_saveGif.unsave = true;
                        b02.getConnectionsManager().sendRequest(tL_messages_saveGif, new org.telegram.messenger.v4(3, b02, tL_messages_saveGif));
                        b02.getMessagesStorage().f15938a.c(new org.telegram.messenger.lf(b02, document, 1));
                        ltVar.f39396l.K();
                    } else if (((Integer) arrayList4.get(intValue)).intValue() == 2) {
                        org.telegram.messenger.ui.b0(ltVar.f39402r).c(ltVar.W, (int) (System.currentTimeMillis() / 1000), true);
                        org.telegram.messenger.vp.r1(ltVar.f39402r).q4("gif", ltVar.W);
                        ltVar.f39396l.K();
                    } else if (((Integer) arrayList4.get(intValue)).intValue() == 3) {
                        TLRPC.Document document2 = ltVar.W;
                        TLRPC.BotInlineResult botInlineResult = ltVar.Z;
                        Object obj = ltVar.f39386b0;
                        org.telegram.ui.jt jtVar3 = ltVar.f39396l;
                        s4.L(ltVar.f39406w, jtVar3.a(), new a1.d(jtVar3, document2, botInlineResult, obj, 8), ltVar.f39388c0);
                    } else if (((Integer) arrayList4.get(intValue)).intValue() == 11) {
                        org.telegram.ui.jt jtVar4 = ltVar.f39396l;
                        TLObject tLObject3 = ltVar.W;
                        if (tLObject3 == null) {
                            tLObject3 = ltVar.Z;
                        }
                        jtVar4.v(tLObject3, ltVar.f39386b0);
                    }
                    ltVar.o();
                    return;
                }
                return;
        }
    }
}
