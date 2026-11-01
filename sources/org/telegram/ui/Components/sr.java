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
import org.telegram.ui.ja1;
import org.telegram.ui.zd1;
public final class sr implements View.OnClickListener {
    public final int f30430a;
    public final Object f30431b;
    public final Object f30432c;

    public sr(int i10, Object obj, Object obj2) {
        this.f30430a = i10;
        this.f30431b = obj;
        this.f30432c = obj2;
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
        switch (this.f30430a) {
            case 0:
                ((vr) this.f30431b).f31889t2 = !vrVar.f31889t2;
                ((q51) this.f30432c).O(true);
                return;
            case 1:
                ((org.telegram.ui.p6) this.f30431b).dismiss();
                ((org.telegram.ui.ActionBar.k2) this.f30432c).presentFragment(new org.telegram.ui.y6());
                return;
            case 2:
                cv cvVar = (cv) this.f30431b;
                o5 o5Var = (o5) this.f30432c;
                org.telegram.ui.ActionBar.k1 k1Var = cvVar.f25256x1;
                if (k1Var != null) {
                    k1Var.d(true);
                    cvVar.f25256x1 = null;
                    SpannableString spannableString = new SpannableString(org.telegram.messenger.kj.U(f5.e(cvVar.f21584a, o5Var.getDocumentId())));
                    spannableString.setSpan(o5Var, 0, spannableString.length(), 33);
                    if (org.telegram.messenger.i0.g(spannableString)) {
                        org.telegram.messenger.a30.r(null, 2131751185, new cc((FrameLayout) cvVar.f21587b, cvVar.I0));
                        return;
                    }
                    return;
                }
                return;
            case 3:
                ny nyVar = (ny) this.f30431b;
                org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) this.f30432c;
                vy vyVar = nyVar.f28985w;
                bw bwVar = vyVar.D0;
                if (bwVar.indexOfChild(n8Var) != -1 && (T = bwVar.T(n8Var)) != null) {
                    if (T.b() == vyVar.f31953f1) {
                        if (vyVar.f31959h1 != null) {
                            vx vxVar = vyVar.f31996t1;
                            if (vxVar != null) {
                                vxVar.y(vyVar.J1.f19795id);
                                return;
                            }
                            return;
                        }
                        SharedPreferences.Editor edit = org.telegram.messenger.wp.r1(vyVar.f31943c1).f19138g7.edit();
                        String str = "group_hide_stickers_" + vyVar.J1.f19795id;
                        TLRPC.StickerSet stickerSet = vyVar.J1.stickerset;
                        if (stickerSet != null) {
                            j10 = stickerSet.f19821id;
                        } else {
                            j10 = 0;
                        }
                        edit.putLong(str, j10).apply();
                        vyVar.Y(false);
                        ny nyVar2 = vyVar.f32013y0;
                        if (nyVar2 != null) {
                            nyVar2.f();
                            return;
                        }
                        return;
                    } else if (nyVar.h.get(T.b()) == vyVar.f31965j1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(nyVar.f28980c);
                        alertDialog$Builder.f20135a.R = org.telegram.messenger.dd.L0(2131752063, null);
                        alertDialog$Builder.f20135a.T = org.telegram.messenger.dd.L0(2131752064, null);
                        alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131752099, null), new px(nyVar, 1));
                        alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                        x1Var.show();
                        TextView textView = (TextView) x1Var.d(-1);
                        if (textView != null) {
                            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21171q7, null);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 4:
                FragmentContextView fragmentContextView = (FragmentContextView) this.f30431b;
                float[] fArr = (float[]) this.f30432c;
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
                    r30 r30Var = r30.f29872w;
                    if (r30Var.c()) {
                        r30Var.b();
                        if (fragmentContextView.h != null && fragmentContextView.C0 != null) {
                            z00 z00Var = new z00(fragmentContextView, fragmentContextView.getContext());
                            fragmentContextView.B0 = z00Var;
                            z00Var.setExtraTranslationY(org.telegram.messenger.i0.L(-12.0f));
                            fragmentContextView.B0.setText(org.telegram.messenger.dd.L0(2131745287, null));
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
                h10 h10Var = (h10) this.f30431b;
                org.telegram.ui.ActionBar.s0 s0Var = (org.telegram.ui.ActionBar.s0) this.f30432c;
                int indexOf = h10Var.F.indexOf(s0Var.getFilter());
                if (h10Var.I != indexOf) {
                    h10Var.I = indexOf;
                    h10Var.e();
                    return;
                } else if (s0Var.getFilter().h) {
                    if (!s0Var.f20754a.f7022f) {
                        s0Var.setSelectedForDelete(true);
                        return;
                    }
                    zf.e0 filter = s0Var.getFilter();
                    h10Var.f(filter);
                    g10 g10Var = h10Var.H;
                    if (g10Var != null) {
                        ((org.telegram.ui.hw) g10Var).h(filter);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 6:
                ((r2) this.f30432c).a(Long.valueOf(((m10) this.f30431b).d));
                return;
            case 7:
                ((org.telegram.ui.zp) this.f30432c).run();
                ((e30) this.f30431b).dismiss();
                return;
            case 8:
                ((z60) this.f30431b).u();
                ((a3.i0) this.f30432c).run();
                return;
            case 9:
                z60 z60Var = (z60) this.f30431b;
                ((org.telegram.ui.fv) this.f30432c).run();
                if (z60Var.J) {
                    z60Var.u();
                    return;
                }
                return;
            case 10:
                k70 k70Var = (k70) this.f30431b;
                i70 i70Var = (i70) this.f30432c;
                TLRPC.InputPeer i14 = org.telegram.messenger.wp.r1(k70Var.f21584a).i1(org.telegram.messenger.kj.C1(k70Var.f27752t1));
                if (k70Var.f27751s1 == 2) {
                    if (k70Var.f27752t1 != k70Var.f27753u1) {
                        if (k70Var.f27748p1.size() <= 1) {
                            z11 = false;
                        }
                        i70Var.a(i14, z11, false, false);
                    }
                } else {
                    k70Var.f27754v1 = i14;
                }
                k70Var.dismiss();
                return;
            case 11:
                vd0 vd0Var = (vd0) this.f30431b;
                org.telegram.ui.ActionBar.p6 p6Var = (org.telegram.ui.ActionBar.p6) this.f30432c;
                ArrayList arrayList = vd0Var.C1;
                ArrayList arrayList2 = vd0Var.D1;
                org.telegram.ui.ActionBar.k2 k2Var = vd0Var.f31257p1;
                TLRPC.TL_userContact_old2 tL_userContact_old2 = vd0Var.E1;
                if (vd0Var.A1) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(vd0Var.getContext());
                    alertDialog$Builder2.f20135a.R = org.telegram.messenger.dd.L0(2131754444, null);
                    alertDialog$Builder2.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                    alertDialog$Builder2.f(new CharSequence[]{org.telegram.messenger.dd.L0(2131751718, null), org.telegram.messenger.dd.L0(2131754375, null)}, new rd0(vd0Var));
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
                        ?? r62 = h0Var.f15991a;
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
                        ArrayList arrayList3 = h0Var2.f15991a;
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
                s4.Z(vd0Var.f21584a, 1, j11, new r2(vd0Var, 9));
                return;
            case 12:
                kh0 kh0Var = (kh0) this.f30431b;
                org.telegram.ui.qv qvVar = (org.telegram.ui.qv) this.f30432c;
                if (kh0Var.J.getTag() == null) {
                    int max = (int) Math.max(1.0f, kh0Var.getValue());
                    org.telegram.ui.xb0 xb0Var = (org.telegram.ui.xb0) qvVar.f40910b;
                    TLRPC.User user = (TLRPC.User) qvVar.f40911c;
                    if (xb0Var.getLocationController().h(xb0Var.f43317n0) == null) {
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(xb0Var.getParentActivity());
                        alertDialog$Builder3.f20135a.R = org.telegram.messenger.dd.L0(2131745471, null);
                        alertDialog$Builder3.f20135a.T = org.telegram.messenger.dd.L0(2131745472, null);
                        alertDialog$Builder3.k(org.telegram.messenger.dd.L0(2131745473, null), new ag.b0(xb0Var, user, max, 12));
                        alertDialog$Builder3.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                        xb0Var.showDialog(alertDialog$Builder3.f20135a);
                    } else {
                        xb0Var.P.L = true;
                        xb0Var.f43304c.setImageResource(2131232210);
                        xb0Var.y0().k(0L, 24, Integer.valueOf(max), user, null, null);
                        xb0Var.getLocationController().o(max, xb0Var.f43317n0, true);
                        z10 = true;
                    }
                    if (z10) {
                        kh0Var.a();
                        return;
                    }
                    return;
                }
                return;
            case 13:
                oh0 oh0Var = (oh0) this.f30431b;
                Context context = (Context) this.f30432c;
                Uri C0 = org.telegram.messenger.i0.C0(oh0Var.f29138i1, "qr_tmp.png", Bitmap.CompressFormat.PNG);
                if (C0 != null) {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("image/*");
                    intent.putExtra("android.intent.extra.STREAM", C0);
                    try {
                        org.telegram.messenger.i0.W(context).startActivityForResult(Intent.createChooser(intent, oh0Var.f21606l0.getText()), 500);
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
                intent2.putExtra("android.intent.extra.TEXT", (String) this.f30431b);
                Intent createChooser = Intent.createChooser(intent2, org.telegram.messenger.dd.L0(2131745476, null));
                createChooser.setFlags(268435456);
                ((Context) this.f30432c).startActivity(createChooser);
                return;
            case 15:
                org.telegram.ui.kt.p().u(((zw0) this.f30431b).f33245r.f25612d2);
                org.telegram.ui.kt.p().x((org.telegram.ui.Cells.d8) this.f30432c);
                return;
            case 16:
                org.telegram.messenger.i0.g((CharSequence) this.f30431b);
                ((Runnable) this.f30432c).run();
                return;
            case 17:
                boolean[] zArr = (boolean[]) this.f30432c;
                ((org.telegram.ui.ActionBar.z2) this.f30431b).dismiss();
                if (!zArr[0]) {
                    org.telegram.messenger.wp.d1().edit().putInt("showchattagsinfo", 0).apply();
                    zArr[0] = true;
                    return;
                }
                return;
            case 18:
                ((u11) this.f30431b).c();
                org.telegram.ui.un unVar2 = ((org.telegram.ui.al) this.f30432c).f35802a;
                ja1 f02 = ja1.f0(-unVar2.f42108j6, 0L);
                f02.D = unVar2;
                unVar2.presentFragment(f02);
                return;
            case 19:
                y31 y31Var = (y31) this.f30431b;
                y31Var.f32711c2 = false;
                y31Var.X0();
                ((q51) this.f30432c).O(true);
                y31Var.I0();
                return;
            case 20:
                View.OnClickListener onClickListener = (View.OnClickListener) this.f30432c;
                ImageView imageView = ((t31) this.f30431b).f30521s;
                imageView.animate().rotation(imageView.getRotation() + 180.0f).setDuration(380L).setInterpolator(gr.h).start();
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            case 21:
                org.telegram.ui.xk xkVar = (org.telegram.ui.xk) this.f30431b;
                ((org.telegram.ui.ActionBar.k1) this.f30432c).d(true);
                e41.a(xkVar.getContext(), xkVar.d);
                return;
            case 22:
                UndoView undoView = (UndoView) this.f30431b;
                TLRPC.Message message = (TLRPC.Message) this.f30432c;
                int i16 = UndoView.f24238i0;
                undoView.d(1, true);
                TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
                tL_payments_getPaymentReceipt.msg_id = message.f19815id;
                org.telegram.ui.ActionBar.k2 k2Var2 = undoView.f24253s;
                tL_payments_getPaymentReceipt.peer = k2Var2.getMessagesController().l1(message.peer_id);
                k2Var2.getConnectionsManager().sendRequest(tL_payments_getPaymentReceipt, new x1(undoView, 17), 2);
                return;
            case 23:
                b61 b61Var = (b61) this.f30431b;
                File file = (File) this.f30432c;
                if (file == null) {
                    b61Var.getClass();
                    return;
                }
                Activity W = org.telegram.messenger.i0.W(b61Var.getContext());
                if (W != null) {
                    org.telegram.messenger.i0.t2(file, "Telegram.apk", "application/vnd.android.package-archive", W, null, false);
                    b61Var.dismiss();
                    return;
                }
                return;
            case 24:
                org.telegram.ui.x20 x20Var = (org.telegram.ui.x20) this.f30431b;
                org.telegram.ui.a50 a50Var = (org.telegram.ui.a50) this.f30432c;
                if (x20Var.h()) {
                    if (mf.b.a(a50Var.Z1) > 0) {
                        org.telegram.ui.Components.voip.t0.h(a50Var.Z1);
                        a50Var.dismiss();
                        return;
                    }
                    s4.A(a50Var.Z1, null, true).p();
                    return;
                }
                LaunchActivity launchActivity = a50Var.Z1;
                Typeface typeface = org.telegram.messenger.i0.f16145a;
                if (Settings.canDrawOverlays(launchActivity)) {
                    g20.f26297e0 = false;
                    a50Var.dismiss();
                    return;
                }
                s4.z(x20Var.getContext()).p();
                return;
            case 25:
                org.telegram.ui.Components.voip.f0 f0Var = (org.telegram.ui.Components.voip.f0) this.f30431b;
                ci0 ci0Var = (ci0) this.f30432c;
                boolean z15 = f0Var.f31480w;
                f0Var.f31480w = !z15;
                if (!z15) {
                    ci0Var.M(36);
                    ci0Var.P(69);
                } else {
                    ci0Var.M(69);
                    ci0Var.P(99);
                }
                ci0Var.start();
                return;
            case 26:
                boolean[] zArr2 = (boolean[]) this.f30431b;
                boolean z16 = !zArr2[0];
                zArr2[0] = z16;
                ((org.telegram.ui.Cells.c2) this.f30432c).c(z16, true);
                return;
            case 27:
                org.telegram.ui.Components.voip.u1 u1Var = (org.telegram.ui.Components.voip.u1) this.f30431b;
                Context context2 = (Context) this.f30432c;
                u1Var.getClass();
                boolean z17 = context2 instanceof LaunchActivity;
                if (z17 && !org.telegram.messenger.w0.f18952x) {
                    zd1.v((Activity) context2, u1Var.M);
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
                org.telegram.ui.ns nsVar = (org.telegram.ui.ns) this.f30431b;
                nsVar.showDialog((org.telegram.ui.ActionBar.z2) s4.l(nsVar.getParentActivity(), org.telegram.messenger.dd.a0(null, null, 2131743702, org.telegram.messenger.i20.k((TLRPC.User) this.f30432c)), org.telegram.messenger.dd.L0(2131743703, null), null, new org.telegram.ui.s3(nsVar, 5), null, false, false, nsVar.f39967r).f11588b);
                return;
            default:
                ArrayList arrayList4 = (ArrayList) this.f30432c;
                org.telegram.ui.kt ktVar = ((org.telegram.ui.ft) this.f30431b).f37231a;
                if (ktVar.f38996w != null) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    if (((Integer) arrayList4.get(intValue)).intValue() == 0) {
                        org.telegram.ui.ht htVar = ktVar.f38986l;
                        TLObject tLObject = ktVar.W;
                        if (tLObject == null) {
                            tLObject = ktVar.Z;
                        }
                        htVar.r(0, 0, ktVar.f38976b0, tLObject, true);
                    } else if (((Integer) arrayList4.get(intValue)).intValue() == 4) {
                        org.telegram.ui.ht htVar2 = ktVar.f38986l;
                        TLObject tLObject2 = ktVar.W;
                        if (tLObject2 == null) {
                            tLObject2 = ktVar.Z;
                        }
                        htVar2.r(0, 0, ktVar.f38976b0, tLObject2, false);
                    } else if (((Integer) arrayList4.get(intValue)).intValue() == 1) {
                        org.telegram.messenger.vi b02 = org.telegram.messenger.vi.b0(ktVar.f38992r);
                        TLRPC.Document document = ktVar.W;
                        int size4 = b02.f18653i0.size();
                        int i17 = 0;
                        while (true) {
                            if (i17 < size4) {
                                if (((TLRPC.Document) b02.f18653i0.get(i17)).f19800id == document.f19800id) {
                                    b02.f18653i0.remove(i17);
                                } else {
                                    i17++;
                                }
                            }
                        }
                        TLRPC.TL_messages_saveGif tL_messages_saveGif = new TLRPC.TL_messages_saveGif();
                        TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                        tL_messages_saveGif.f19903id = tL_inputDocument;
                        tL_inputDocument.f19806id = document.f19800id;
                        tL_inputDocument.access_hash = document.access_hash;
                        byte[] bArr = document.file_reference;
                        tL_inputDocument.file_reference = bArr;
                        if (bArr == null) {
                            tL_inputDocument.file_reference = new byte[0];
                        }
                        tL_messages_saveGif.unsave = true;
                        b02.getConnectionsManager().sendRequest(tL_messages_saveGif, new org.telegram.messenger.v4(3, b02, tL_messages_saveGif));
                        b02.getMessagesStorage().f16331a.c(new org.telegram.messenger.mf(b02, document, 1));
                        ktVar.f38986l.K();
                    } else if (((Integer) arrayList4.get(intValue)).intValue() == 2) {
                        org.telegram.messenger.vi.b0(ktVar.f38992r).c(ktVar.W, (int) (System.currentTimeMillis() / 1000), true);
                        org.telegram.messenger.wp.r1(ktVar.f38992r).q4("gif", ktVar.W);
                        ktVar.f38986l.K();
                    } else if (((Integer) arrayList4.get(intValue)).intValue() == 3) {
                        TLRPC.Document document2 = ktVar.W;
                        TLRPC.BotInlineResult botInlineResult = ktVar.Z;
                        Object obj = ktVar.f38976b0;
                        org.telegram.ui.ht htVar3 = ktVar.f38986l;
                        s4.L(ktVar.f38996w, htVar3.a(), new a1.d(htVar3, document2, botInlineResult, obj, 8), ktVar.f38978c0);
                    } else if (((Integer) arrayList4.get(intValue)).intValue() == 11) {
                        org.telegram.ui.ht htVar4 = ktVar.f38986l;
                        TLObject tLObject3 = ktVar.W;
                        if (tLObject3 == null) {
                            tLObject3 = ktVar.Z;
                        }
                        htVar4.v(tLObject3, ktVar.f38976b0);
                    }
                    ktVar.o();
                    return;
                }
                return;
        }
    }
}
