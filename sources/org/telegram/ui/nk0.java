package org.telegram.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.RectF;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.tasks.OnSuccessListener;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class nk0 implements org.telegram.ui.ActionBar.r1, org.telegram.ui.Components.t4, org.telegram.messenger.k9, org.telegram.messenger.ri, org.telegram.ui.Components.dj0, org.telegram.ui.Components.ej0, qr0, org.telegram.messenger.qr, jx0, OnSuccessListener {
    public final int f48200a;
    public final Object f48201b;
    public final Object f48202c;

    public nk0(int i7, Object obj, Object obj2) {
        this.f48200a = i7;
        this.f48201b = obj;
        this.f48202c = obj2;
    }

    @Override
    public void L(int i7, int i10, boolean z9) {
        switch (this.f48200a) {
            case 5:
                rr0 rr0Var = ((jr0) this.f48201b).f47068a;
                rr0Var.f49573e0.a((TLRPC.TL_messageMediaToDo) this.f48202c);
                rr0Var.finishFragment();
                return;
            default:
                rr0 rr0Var2 = ((jr0) this.f48201b).f47068a;
                rr0Var2.f49573e0.a((TLRPC.TL_messageMediaPoll) this.f48202c);
                rr0Var2.finishFragment();
                return;
        }
    }

    @Override
    public void a(TLRPC.MessageMedia messageMedia) {
        h81 h81Var = (h81) this.f48201b;
        cn cnVar = (cn) this.f48202c;
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.MessageMedia messageMedia2 = h81Var.G.f23262k.media;
            if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                ((TLRPC.TL_messageMediaToDo) messageMedia).completions = ((TLRPC.TL_messageMediaToDo) messageMedia2).completions;
            }
        }
        h81Var.G.f23262k.media = messageMedia;
        cnVar.getSendMessagesHelper().t(h81Var.G, null, null, null, null, null, null, null, false, false, null);
    }

    public File b() {
        switch (this.f48200a) {
            case 1:
                org.telegram.messenger.w7.G(((PhotoViewer) this.f48201b).T);
                return org.telegram.messenger.w7.J((TLObject) this.f48202c, null, true, true);
            default:
                org.telegram.messenger.w7.G(((PhotoViewer) this.f48201b).T);
                return org.telegram.messenger.w7.M((TLRPC.Message) this.f48202c, false, true);
        }
    }

    @Override
    public boolean c(int i7, View view) {
        String str;
        final g61 g61Var = (g61) this.f48201b;
        final i61 i61Var = (i61) this.f48202c;
        ThemeActivity themeActivity = g61Var.f45922e;
        if (i7 >= 0 && i7 < i61Var.f46477e.size()) {
            final org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) i61Var.f46477e.get(i7);
            if (i6Var.f27571a >= 100 && !i6Var.f27593z) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                String M0 = org.telegram.messenger.id.M0(2131747797, "OpenInEditor");
                String M02 = org.telegram.messenger.id.M0(2131745426, "ShareTheme");
                TLRPC.TL_theme tL_theme = i6Var.f27586r;
                if (tL_theme != null && tL_theme.creator) {
                    str = org.telegram.messenger.id.M0(2131744145, "ThemeSetUrl");
                } else {
                    str = null;
                }
                CharSequence[] charSequenceArr = {M0, M02, str, org.telegram.messenger.id.M0(2131751486, "DeleteTheme")};
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        g61 g61Var2 = g61.this;
                        ThemeActivity themeActivity2 = g61Var2.f45922e;
                        if (themeActivity2.getParentActivity() != null) {
                            org.telegram.ui.ActionBar.i6 i6Var2 = i6Var;
                            int i11 = 2;
                            if (i10 == 0) {
                                if (i10 != 1) {
                                    i11 = 1;
                                }
                                org.telegram.ui.Components.v4.T(themeActivity2, i11, i6Var2.f27572b, i6Var2);
                            } else if (i10 == 1) {
                                if (i6Var2.f27586r == null) {
                                    themeActivity2.getMessagesController().y4(i6Var2.f27572b, i6Var2);
                                    org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25075s4, i6Var2.f27572b, i6Var2);
                                    return;
                                }
                                String str2 = "https://" + themeActivity2.getMessagesController().U2 + "/addtheme/" + i6Var2.f27586r.slug;
                                themeActivity2.showDialog(new org.telegram.ui.Components.no0(themeActivity2.getParentActivity(), null, str2, false, str2, false, null));
                            } else if (i10 == 2) {
                                themeActivity2.presentFragment(new z71(i6Var2.f27572b, i6Var2, false));
                            } else if (i10 == 3 && themeActivity2.getParentActivity() != null) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(themeActivity2.getParentActivity());
                                String M03 = org.telegram.messenger.id.M0(2131751484, "DeleteThemeTitle");
                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder2.f27296a;
                                u1Var.R = M03;
                                u1Var.T = org.telegram.messenger.id.M0(2131751485, "DeleteThemeAlert");
                                alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131751598, "Delete"), new a7(g61Var2, i61Var, i6Var2, 22));
                                alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131752589, "Cancel"), null);
                                themeActivity2.showDialog(u1Var);
                                TextView textView = (TextView) u1Var.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.f28106q7, null);
                                }
                            }
                        }
                    }
                };
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                u1Var.P = charSequenceArr;
                u1Var.Q = new int[]{2131232116, 2131232363, 2131232203, 2131232108};
                u1Var.M = onClickListener;
                themeActivity.showDialog(u1Var);
                u1Var.m(u1Var.N0.size() - 1, org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f28106q7, false), org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f28086p7, false));
                return true;
            }
        }
        return false;
    }

    @Override
    public void e(String str, ArrayList arrayList) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.f48201b;
        Runnable runnable = (Runnable) this.f48202c;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            try {
                if (!((org.telegram.messenger.qi) arrayList.get(i7)).f24701a.startsWith("animated_")) {
                    String c10 = org.telegram.messenger.i6.c(((org.telegram.messenger.qi) arrayList.get(i7)).f24701a);
                    if (org.telegram.messenger.i6.g(c10) != null) {
                        linkedHashSet.add(c10);
                    }
                }
            } catch (Exception unused) {
            }
        }
        runnable.run();
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        ThemeActivity.b0((ThemeActivity) this.f48201b, (Context) this.f48202c, view, i7, f10);
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        ArrayList arrayList;
        TLRPC.EncryptedChat encryptedChat;
        int i10;
        boolean z9;
        boolean z10;
        org.telegram.ui.ActionBar.q4 q4Var;
        int i11 = this.f48200a;
        int i12 = 0;
        Object obj = this.f48202c;
        Object obj2 = this.f48201b;
        switch (i11) {
            case 0:
                jl0 jl0Var = (jl0) obj2;
                jl0Var.f46997b0 = true;
                jl0Var.f46994a0.email_unconfirmed_pattern = (String) obj;
                jl0Var.P0();
                return;
            case 1:
            case 2:
            case 5:
            case 6:
            case 7:
            case 12:
            case 13:
            case 16:
            case 17:
            case 19:
            case 20:
            case 21:
            case 24:
            default:
                org.telegram.ui.web.l.d0((org.telegram.ui.web.l) obj2, (HashSet) obj);
                return;
            case 3:
                PhotoViewer.u(((so0) obj2).f49967b, (ArrayList) obj);
                return;
            case 4:
                boolean[] zArr = (boolean[]) obj;
                PhotoViewer photoViewer = ((so0) obj2).f49967b;
                wq0 wq0Var = photoViewer.d;
                ArrayList arrayList2 = photoViewer.Z6;
                ArrayList arrayList3 = photoViewer.f41380c7;
                ArrayList arrayList4 = photoViewer.X6;
                ArrayList arrayList5 = photoViewer.f41388d7;
                ArrayList arrayList6 = photoViewer.f41398e7;
                if (!wq0Var.N()) {
                    photoViewer.z0(false, false);
                    return;
                } else if (!arrayList4.isEmpty()) {
                    int i13 = photoViewer.O4;
                    if (i13 >= 0 && i13 < arrayList4.size()) {
                        org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList4.get(photoViewer.O4);
                        if (ijVar.q4()) {
                            photoViewer.z0(false, false);
                            ArrayList arrayList7 = new ArrayList();
                            int i14 = photoViewer.f41548w;
                            if (i14 != 0) {
                                arrayList7.add(Integer.valueOf(i14));
                            } else {
                                arrayList7.add(Integer.valueOf(ijVar.e1()));
                            }
                            if (org.telegram.messenger.m5.C(org.telegram.messenger.ij.B0(ijVar.f23262k)) && ijVar.f23262k.random_id != 0) {
                                ArrayList arrayList8 = new ArrayList();
                                arrayList8.add(Long.valueOf(ijVar.f23262k.random_id));
                                arrayList = arrayList8;
                                encryptedChat = org.telegram.messenger.qp.s1(photoViewer.T).a1(Integer.valueOf((int) (org.telegram.messenger.ij.B0(ijVar.f23262k) & 4294967295L)));
                            } else {
                                arrayList = null;
                                encryptedChat = null;
                            }
                            org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(photoViewer.T);
                            long B0 = org.telegram.messenger.ij.B0(ijVar.f23262k);
                            int I1 = org.telegram.messenger.ij.I1(ijVar.f23262k);
                            boolean z11 = zArr[0];
                            if (ijVar.f23281p1) {
                                i10 = 1;
                            } else {
                                if (org.telegram.messenger.ij.d5(ijVar.f23262k)) {
                                    i12 = 9;
                                } else if (org.telegram.messenger.ij.b4(ijVar.f23262k)) {
                                    i12 = 5;
                                }
                                i10 = i12;
                            }
                            s12.Z(arrayList7, arrayList, encryptedChat, B0, I1, z11, i10);
                            return;
                        }
                        return;
                    }
                    return;
                } else if (!arrayList6.isEmpty()) {
                    int i15 = photoViewer.O4;
                    if (i15 >= 0 && i15 < arrayList6.size()) {
                        TLRPC.Message message = (TLRPC.Message) arrayList3.get(photoViewer.O4);
                        if (message != null) {
                            ArrayList arrayList9 = new ArrayList();
                            arrayList9.add(Integer.valueOf(message.f26977id));
                            org.telegram.messenger.qp.s1(photoViewer.T).Z(arrayList9, null, null, org.telegram.messenger.ij.B0(message), message.quick_reply_shortcut_id, true, 0);
                            org.telegram.messenger.qs.f(photoViewer.T).k(39, new Object[0]);
                        }
                        if (photoViewer.G1()) {
                            if (photoViewer.f41574y5 > 0) {
                                org.telegram.messenger.qp.s1(photoViewer.T).l0(null);
                            } else {
                                org.telegram.messenger.qp.s1(photoViewer.T).B(-photoViewer.f41574y5, null, null, null, null, 0.0d, null, null, null, null);
                            }
                            photoViewer.z0(false, false);
                            return;
                        }
                        TLRPC.Photo photo = (TLRPC.Photo) arrayList6.get(photoViewer.O4);
                        if (photo != null) {
                            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                            tL_inputPhoto.f26975id = photo.f26980id;
                            tL_inputPhoto.access_hash = photo.access_hash;
                            byte[] bArr = photo.file_reference;
                            tL_inputPhoto.file_reference = bArr;
                            if (bArr == null) {
                                tL_inputPhoto.file_reference = new byte[0];
                            }
                            if (photoViewer.f41574y5 > 0) {
                                org.telegram.messenger.qp.s1(photoViewer.T).l0(tL_inputPhoto);
                            }
                            org.telegram.messenger.yr a02 = org.telegram.messenger.yr.a0(photoViewer.T);
                            a02.f26719a.c(new org.telegram.messenger.vp(4, photoViewer.f41574y5, photo.f26980id, a02));
                            arrayList2.remove(photoViewer.O4);
                            photoViewer.f41370b7.remove(photoViewer.O4);
                            photoViewer.f41360a7.remove(photoViewer.O4);
                            arrayList3.remove(photoViewer.O4);
                            arrayList6.remove(photoViewer.O4);
                            if (arrayList2.isEmpty()) {
                                photoViewer.z0(false, false);
                            } else {
                                int i16 = photoViewer.O4;
                                if (i16 >= arrayList6.size()) {
                                    i16 = arrayList6.size() - 1;
                                }
                                photoViewer.O4 = -1;
                                photoViewer.y2(i16);
                            }
                            if (message == null) {
                                org.telegram.messenger.qs.f(photoViewer.T).k(39, new Object[0]);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                } else if (!arrayList5.isEmpty() && photoViewer.d != null) {
                    arrayList5.remove(photoViewer.O4);
                    photoViewer.d.B(photoViewer.O4);
                    if (arrayList5.isEmpty()) {
                        photoViewer.z0(false, false);
                        return;
                    }
                    int i17 = photoViewer.O4;
                    if (i17 >= arrayList5.size()) {
                        i17 = arrayList5.size() - 1;
                    }
                    photoViewer.O4 = -1;
                    photoViewer.y2(i17);
                    return;
                } else {
                    return;
                }
            case 8:
                ((PrivacyControlActivity) obj2).E0();
                ((SharedPreferences) obj).edit().putBoolean("privacyAlertShowed", true).commit();
                return;
            case 9:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
                boolean[] zArr2 = privacySettingsActivity.Z;
                tL_payments_clearSavedInfo.credentials = zArr2[1];
                tL_payments_clearSavedInfo.info = zArr2[0];
                privacySettingsActivity.getUserConfig().f24499y = null;
                privacySettingsActivity.getUserConfig().v(false);
                privacySettingsActivity.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new j50(20, privacySettingsActivity, (org.telegram.ui.Cells.r8) obj));
                return;
            case 10:
                ProfileActivity.p0((ProfileActivity) obj2, (org.telegram.ui.Cells.c2[]) obj);
                return;
            case 11:
                tv0 tv0Var = (tv0) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                tv0Var.getClass();
                ArrayList arrayList10 = new ArrayList();
                arrayList10.add(user);
                ProfileActivity profileActivity = tv0Var.f50246b;
                RectF rectF = ProfileActivity.V6;
                profileActivity.getContactsController().i(arrayList10, true);
                if (user != null) {
                    user.contact = false;
                    profileActivity.G5(false, false);
                    return;
                }
                return;
            case 14:
                c21 c21Var = (c21) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null) {
                    c21Var.dismiss();
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    a7 a7Var = new a7(c21Var, user2, twoStepVerificationActivity, 20);
                    twoStepVerificationActivity.Z = 0;
                    twoStepVerificationActivity.f42062b0 = a7Var;
                    T.presentFragment(twoStepVerificationActivity);
                    return;
                }
                return;
            case 15:
                ThemeActivity.c0((ThemeActivity) obj2, (ax0) obj);
                return;
            case 18:
                g61 g61Var = (g61) obj2;
                org.telegram.ui.ActionBar.k6 k6Var = (org.telegram.ui.ActionBar.k6) obj;
                g61Var.getClass();
                org.telegram.messenger.qp s13 = org.telegram.messenger.qp.s1(k6Var.E);
                if (k6Var == org.telegram.ui.ActionBar.l6.J) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                s13.x4(k6Var, null, z9, true);
                HashMap hashMap = org.telegram.ui.ActionBar.l6.H;
                if (k6Var.f27738b == null) {
                    z10 = false;
                } else {
                    if (org.telegram.ui.ActionBar.l6.I == k6Var) {
                        org.telegram.ui.ActionBar.l6.u(org.telegram.ui.ActionBar.l6.L, true, false);
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (k6Var == org.telegram.ui.ActionBar.l6.J) {
                        org.telegram.ui.ActionBar.l6.J = (org.telegram.ui.ActionBar.k6) hashMap.get("Dark Blue");
                    }
                    k6Var.t();
                    org.telegram.ui.ActionBar.l6.G.remove(k6Var);
                    hashMap.remove(k6Var.f27736a);
                    org.telegram.ui.ActionBar.d6 d6Var = k6Var.f27749i0;
                    if (d6Var != null) {
                        org.telegram.ui.ActionBar.d6.a(d6Var);
                    }
                    org.telegram.ui.ActionBar.l6.F.remove(k6Var);
                    new File(k6Var.f27738b).delete();
                    org.telegram.ui.ActionBar.l6.y1(true, false);
                }
                if (z10) {
                    q4Var = ((org.telegram.ui.ActionBar.f2) g61Var.f45922e).parentLayout;
                    ((ActionBarLayout) q4Var).X(true, true);
                }
                org.telegram.messenger.qs.e().k(265, new Object[0]);
                return;
            case 22:
                bb1.b0((bb1) obj2, (byte[]) obj);
                return;
            case 23:
                ic1 ic1Var = (ic1) obj2;
                ((boolean[]) obj)[0] = true;
                ic1Var.f46601o0 = 17;
                Intent intent = new Intent(ic1Var.f46574b, VoIPService.class);
                intent.putExtra("user_id", ic1Var.d.f27105id);
                intent.putExtra("is_outgoing", true);
                intent.putExtra("start_incall_activity", false);
                intent.putExtra("video_call", false);
                intent.putExtra("can_video_call", false);
                intent.putExtra("account", ic1Var.f46571a);
                try {
                    ic1Var.f46574b.startService(intent);
                    return;
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                    return;
                }
            case 25:
                org.telegram.ui.Wallet.m8 m8Var = (org.telegram.ui.Wallet.m8) obj2;
                m8Var.getClass();
                u1Var.dismiss();
                org.telegram.ui.Wallet.d8 d8Var = new org.telegram.ui.Wallet.d8();
                d8Var.f42380r = !((Boolean) obj).booleanValue();
                m8Var.presentFragment(d8Var);
                return;
            case 26:
                ((Runnable) obj2).run();
                ((org.telegram.ui.ActionBar.v2) obj).dismiss();
                return;
            case 27:
                org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) obj;
                vf.b h = u1Var.h(i7, true, true);
                h.d();
                org.telegram.ui.Wallet.i8 i8Var = new org.telegram.ui.Wallet.i8((org.telegram.ui.Wallet.m8) obj2, h, 1);
                org.telegram.ui.Wallet.l0.H("disableBackupWithoutUpdatingPhrase");
                l0Var.m0(new h2.o0((Object) l0Var, (Object) new org.telegram.ui.Components.fx(28, l0Var, i8Var), true, false, 4));
                return;
        }
    }

    @Override
    public Object j(Object obj) {
        us0 us0Var = (us0) this.f48202c;
        Void r10 = (Void) obj;
        PremiumPreviewFragment premiumPreviewFragment = ((vs0) this.f48201b).d.f51471n;
        premiumPreviewFragment.f41630n0.d(0, 0.0f, 0, us0Var.getMeasuredWidth(), -us0Var.getTier().h, premiumPreviewFragment.O);
        return premiumPreviewFragment.f41630n0.f56881f;
    }

    @Override
    public void k(boolean z9) {
        TLRPC.Chat chat = (TLRPC.Chat) this.f48202c;
        y91 y91Var = ((j91) this.f48201b).f46898b;
        org.telegram.messenger.qs notificationCenter = y91Var.getNotificationCenter();
        int i7 = org.telegram.messenger.qs.f25076t;
        notificationCenter.n(y91Var, i7);
        y91Var.getNotificationCenter().k(i7, new Object[0]);
        y91Var.finishFragment();
        y91Var.getNotificationCenter().k(org.telegram.messenger.qs.K2, Long.valueOf(-chat.f26956id), null, chat, Boolean.valueOf(z9));
    }

    @Override
    public void onSuccess(Object obj) {
        Integer num = (Integer) obj;
        org.telegram.messenger.a8.b("wear-auth: /token delivered to " + ((String) ((a8.r7) this.f48201b).d));
        ((fi.d) this.f48202c).setLoading(false);
        yc1.d = null;
        org.telegram.ui.ActionBar.v2 v2Var = yc1.f52085c;
        if (v2Var != null) {
            v2Var.dismiss();
            yc1.f52085c = null;
        }
    }

    @Override
    public void t(qh0 qh0Var) {
        ea1 ea1Var = ((ba1) this.f48201b).f43946a;
        ea1Var.f45350e.add(Integer.valueOf(((TLRPC.TL_forumTopic) this.f48202c).f27008id));
        ea1Var.a0();
    }

    public nk0(jr0 jr0Var, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, ArrayList arrayList) {
        this.f48200a = 6;
        this.f48201b = jr0Var;
        this.f48202c = tL_messageMediaPoll;
    }

    @Override
    public void c0() {
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
