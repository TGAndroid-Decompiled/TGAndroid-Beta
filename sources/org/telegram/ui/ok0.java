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
public final class ok0 implements org.telegram.ui.ActionBar.r1, org.telegram.ui.Components.s4, org.telegram.messenger.k9, org.telegram.messenger.ri, org.telegram.ui.Components.cj0, org.telegram.ui.Components.dj0, rr0, org.telegram.messenger.qr, kx0, OnSuccessListener {
    public final int f48539a;
    public final Object f48540b;
    public final Object f48541c;

    public ok0(int i7, Object obj, Object obj2) {
        this.f48539a = i7;
        this.f48540b = obj;
        this.f48541c = obj2;
    }

    @Override
    public void L(int i7, int i10, boolean z9) {
        switch (this.f48539a) {
            case 5:
                sr0 sr0Var = ((kr0) this.f48540b).f47402a;
                sr0Var.f49927e0.a((TLRPC.TL_messageMediaToDo) this.f48541c);
                sr0Var.finishFragment();
                return;
            default:
                sr0 sr0Var2 = ((kr0) this.f48540b).f47402a;
                sr0Var2.f49927e0.a((TLRPC.TL_messageMediaPoll) this.f48541c);
                sr0Var2.finishFragment();
                return;
        }
    }

    @Override
    public void a(TLRPC.MessageMedia messageMedia) {
        i81 i81Var = (i81) this.f48540b;
        cn cnVar = (cn) this.f48541c;
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.MessageMedia messageMedia2 = i81Var.G.f23266k.media;
            if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                ((TLRPC.TL_messageMediaToDo) messageMedia).completions = ((TLRPC.TL_messageMediaToDo) messageMedia2).completions;
            }
        }
        i81Var.G.f23266k.media = messageMedia;
        cnVar.getSendMessagesHelper().t(i81Var.G, null, null, null, null, null, null, null, false, false, null);
    }

    public File b() {
        switch (this.f48539a) {
            case 1:
                org.telegram.messenger.w7.G(((PhotoViewer) this.f48540b).T);
                return org.telegram.messenger.w7.J((TLObject) this.f48541c, null, true, true);
            default:
                org.telegram.messenger.w7.G(((PhotoViewer) this.f48540b).T);
                return org.telegram.messenger.w7.M((TLRPC.Message) this.f48541c, false, true);
        }
    }

    @Override
    public boolean c(int i7, View view) {
        String str;
        final h61 h61Var = (h61) this.f48540b;
        final j61 j61Var = (j61) this.f48541c;
        ThemeActivity themeActivity = h61Var.f46233e;
        if (i7 >= 0 && i7 < j61Var.f46832e.size()) {
            final org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) j61Var.f46832e.get(i7);
            if (j6Var.f27609a >= 100 && !j6Var.f27631z) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                String M0 = org.telegram.messenger.id.M0(2131747797, "OpenInEditor");
                String M02 = org.telegram.messenger.id.M0(2131745426, "ShareTheme");
                TLRPC.TL_theme tL_theme = j6Var.f27624r;
                if (tL_theme != null && tL_theme.creator) {
                    str = org.telegram.messenger.id.M0(2131744145, "ThemeSetUrl");
                } else {
                    str = null;
                }
                CharSequence[] charSequenceArr = {M0, M02, str, org.telegram.messenger.id.M0(2131751486, "DeleteTheme")};
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        h61 h61Var2 = h61.this;
                        ThemeActivity themeActivity2 = h61Var2.f46233e;
                        if (themeActivity2.getParentActivity() != null) {
                            org.telegram.ui.ActionBar.j6 j6Var2 = j6Var;
                            int i11 = 2;
                            if (i10 == 0) {
                                if (i10 != 1) {
                                    i11 = 1;
                                }
                                org.telegram.ui.Components.u4.T(themeActivity2, i11, j6Var2.f27610b, j6Var2);
                            } else if (i10 == 1) {
                                if (j6Var2.f27624r == null) {
                                    themeActivity2.getMessagesController().y4(j6Var2.f27610b, j6Var2);
                                    org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25079s4, j6Var2.f27610b, j6Var2);
                                    return;
                                }
                                String str2 = "https://" + themeActivity2.getMessagesController().U2 + "/addtheme/" + j6Var2.f27624r.slug;
                                themeActivity2.showDialog(new org.telegram.ui.Components.mo0(themeActivity2.getParentActivity(), null, str2, false, str2, false, null));
                            } else if (i10 == 2) {
                                themeActivity2.presentFragment(new a81(j6Var2.f27610b, j6Var2, false));
                            } else if (i10 == 3 && themeActivity2.getParentActivity() != null) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(themeActivity2.getParentActivity());
                                String M03 = org.telegram.messenger.id.M0(2131751484, "DeleteThemeTitle");
                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder2.f27300a;
                                u1Var.R = M03;
                                u1Var.T = org.telegram.messenger.id.M0(2131751485, "DeleteThemeAlert");
                                alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131751598, "Delete"), new a7(h61Var2, j61Var, j6Var2, 22));
                                alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131752589, "Cancel"), null);
                                themeActivity2.showDialog(u1Var);
                                TextView textView = (TextView) u1Var.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f28131q7, null);
                                }
                            }
                        }
                    }
                };
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
                u1Var.P = charSequenceArr;
                u1Var.Q = new int[]{2131232116, 2131232363, 2131232203, 2131232108};
                u1Var.M = onClickListener;
                themeActivity.showDialog(u1Var);
                u1Var.m(u1Var.N0.size() - 1, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28131q7, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28111p7, false));
                return true;
            }
        }
        return false;
    }

    @Override
    public void e(String str, ArrayList arrayList) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.f48540b;
        Runnable runnable = (Runnable) this.f48541c;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            try {
                if (!((org.telegram.messenger.qi) arrayList.get(i7)).f24705a.startsWith("animated_")) {
                    String c10 = org.telegram.messenger.i6.c(((org.telegram.messenger.qi) arrayList.get(i7)).f24705a);
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
        ThemeActivity.b0((ThemeActivity) this.f48540b, (Context) this.f48541c, view, i7, f10);
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
        org.telegram.ui.ActionBar.r4 r4Var;
        int i11 = this.f48539a;
        int i12 = 0;
        Object obj = this.f48541c;
        Object obj2 = this.f48540b;
        switch (i11) {
            case 0:
                kl0 kl0Var = (kl0) obj2;
                kl0Var.f47329b0 = true;
                kl0Var.f47326a0.email_unconfirmed_pattern = (String) obj;
                kl0Var.P0();
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
                PhotoViewer.u(((to0) obj2).f50316b, (ArrayList) obj);
                return;
            case 4:
                boolean[] zArr = (boolean[]) obj;
                PhotoViewer photoViewer = ((to0) obj2).f50316b;
                xq0 xq0Var = photoViewer.d;
                ArrayList arrayList2 = photoViewer.Z6;
                ArrayList arrayList3 = photoViewer.f41371c7;
                ArrayList arrayList4 = photoViewer.X6;
                ArrayList arrayList5 = photoViewer.f41379d7;
                ArrayList arrayList6 = photoViewer.f41389e7;
                if (!xq0Var.N()) {
                    photoViewer.z0(false, false);
                    return;
                } else if (!arrayList4.isEmpty()) {
                    int i13 = photoViewer.O4;
                    if (i13 >= 0 && i13 < arrayList4.size()) {
                        org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList4.get(photoViewer.O4);
                        if (ijVar.q4()) {
                            photoViewer.z0(false, false);
                            ArrayList arrayList7 = new ArrayList();
                            int i14 = photoViewer.f41539w;
                            if (i14 != 0) {
                                arrayList7.add(Integer.valueOf(i14));
                            } else {
                                arrayList7.add(Integer.valueOf(ijVar.e1()));
                            }
                            if (org.telegram.messenger.m5.C(org.telegram.messenger.ij.B0(ijVar.f23266k)) && ijVar.f23266k.random_id != 0) {
                                ArrayList arrayList8 = new ArrayList();
                                arrayList8.add(Long.valueOf(ijVar.f23266k.random_id));
                                arrayList = arrayList8;
                                encryptedChat = org.telegram.messenger.qp.s1(photoViewer.T).a1(Integer.valueOf((int) (org.telegram.messenger.ij.B0(ijVar.f23266k) & 4294967295L)));
                            } else {
                                arrayList = null;
                                encryptedChat = null;
                            }
                            org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(photoViewer.T);
                            long B0 = org.telegram.messenger.ij.B0(ijVar.f23266k);
                            int I1 = org.telegram.messenger.ij.I1(ijVar.f23266k);
                            boolean z11 = zArr[0];
                            if (ijVar.f23285p1) {
                                i10 = 1;
                            } else {
                                if (org.telegram.messenger.ij.d5(ijVar.f23266k)) {
                                    i12 = 9;
                                } else if (org.telegram.messenger.ij.b4(ijVar.f23266k)) {
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
                            arrayList9.add(Integer.valueOf(message.f26981id));
                            org.telegram.messenger.qp.s1(photoViewer.T).Z(arrayList9, null, null, org.telegram.messenger.ij.B0(message), message.quick_reply_shortcut_id, true, 0);
                            org.telegram.messenger.qs.f(photoViewer.T).k(39, new Object[0]);
                        }
                        if (photoViewer.G1()) {
                            if (photoViewer.f41565y5 > 0) {
                                org.telegram.messenger.qp.s1(photoViewer.T).l0(null);
                            } else {
                                org.telegram.messenger.qp.s1(photoViewer.T).B(-photoViewer.f41565y5, null, null, null, null, 0.0d, null, null, null, null);
                            }
                            photoViewer.z0(false, false);
                            return;
                        }
                        TLRPC.Photo photo = (TLRPC.Photo) arrayList6.get(photoViewer.O4);
                        if (photo != null) {
                            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                            tL_inputPhoto.f26979id = photo.f26984id;
                            tL_inputPhoto.access_hash = photo.access_hash;
                            byte[] bArr = photo.file_reference;
                            tL_inputPhoto.file_reference = bArr;
                            if (bArr == null) {
                                tL_inputPhoto.file_reference = new byte[0];
                            }
                            if (photoViewer.f41565y5 > 0) {
                                org.telegram.messenger.qp.s1(photoViewer.T).l0(tL_inputPhoto);
                            }
                            org.telegram.messenger.yr a02 = org.telegram.messenger.yr.a0(photoViewer.T);
                            a02.f26723a.c(new org.telegram.messenger.vp(4, photoViewer.f41565y5, photo.f26984id, a02));
                            arrayList2.remove(photoViewer.O4);
                            photoViewer.f41361b7.remove(photoViewer.O4);
                            photoViewer.f41351a7.remove(photoViewer.O4);
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
                privacySettingsActivity.getUserConfig().f24503y = null;
                privacySettingsActivity.getUserConfig().v(false);
                privacySettingsActivity.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new k50(20, privacySettingsActivity, (org.telegram.ui.Cells.r8) obj));
                return;
            case 10:
                ProfileActivity.p0((ProfileActivity) obj2, (org.telegram.ui.Cells.c2[]) obj);
                return;
            case 11:
                uv0 uv0Var = (uv0) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                uv0Var.getClass();
                ArrayList arrayList10 = new ArrayList();
                arrayList10.add(user);
                ProfileActivity profileActivity = uv0Var.f50573b;
                RectF rectF = ProfileActivity.V6;
                profileActivity.getContactsController().i(arrayList10, true);
                if (user != null) {
                    user.contact = false;
                    profileActivity.G5(false, false);
                    return;
                }
                return;
            case 14:
                d21 d21Var = (d21) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null) {
                    d21Var.dismiss();
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    a7 a7Var = new a7(d21Var, user2, twoStepVerificationActivity, 20);
                    twoStepVerificationActivity.Z = 0;
                    twoStepVerificationActivity.f42053b0 = a7Var;
                    T.presentFragment(twoStepVerificationActivity);
                    return;
                }
                return;
            case 15:
                ThemeActivity.c0((ThemeActivity) obj2, (rw0) obj);
                return;
            case 18:
                h61 h61Var = (h61) obj2;
                org.telegram.ui.ActionBar.l6 l6Var = (org.telegram.ui.ActionBar.l6) obj;
                h61Var.getClass();
                org.telegram.messenger.qp s13 = org.telegram.messenger.qp.s1(l6Var.E);
                if (l6Var == org.telegram.ui.ActionBar.m6.J) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                s13.x4(l6Var, null, z9, true);
                HashMap hashMap = org.telegram.ui.ActionBar.m6.H;
                if (l6Var.f27767b == null) {
                    z10 = false;
                } else {
                    if (org.telegram.ui.ActionBar.m6.I == l6Var) {
                        org.telegram.ui.ActionBar.m6.u(org.telegram.ui.ActionBar.m6.L, true, false);
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (l6Var == org.telegram.ui.ActionBar.m6.J) {
                        org.telegram.ui.ActionBar.m6.J = (org.telegram.ui.ActionBar.l6) hashMap.get("Dark Blue");
                    }
                    l6Var.t();
                    org.telegram.ui.ActionBar.m6.G.remove(l6Var);
                    hashMap.remove(l6Var.f27765a);
                    org.telegram.ui.ActionBar.e6 e6Var = l6Var.f27778i0;
                    if (e6Var != null) {
                        org.telegram.ui.ActionBar.e6.a(e6Var);
                    }
                    org.telegram.ui.ActionBar.m6.F.remove(l6Var);
                    new File(l6Var.f27767b).delete();
                    org.telegram.ui.ActionBar.m6.y1(true, false);
                }
                if (z10) {
                    r4Var = ((org.telegram.ui.ActionBar.f2) h61Var.f46233e).parentLayout;
                    ((ActionBarLayout) r4Var).X(true, true);
                }
                org.telegram.messenger.qs.e().k(265, new Object[0]);
                return;
            case 22:
                cb1.b0((cb1) obj2, (byte[]) obj);
                return;
            case 23:
                jc1 jc1Var = (jc1) obj2;
                ((boolean[]) obj)[0] = true;
                jc1Var.f46937o0 = 17;
                Intent intent = new Intent(jc1Var.f46910b, VoIPService.class);
                intent.putExtra("user_id", jc1Var.d.f27109id);
                intent.putExtra("is_outgoing", true);
                intent.putExtra("start_incall_activity", false);
                intent.putExtra("video_call", false);
                intent.putExtra("can_video_call", false);
                intent.putExtra("account", jc1Var.f46907a);
                try {
                    jc1Var.f46910b.startService(intent);
                    return;
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                    return;
                }
            case 25:
                org.telegram.ui.Wallet.p8 p8Var = (org.telegram.ui.Wallet.p8) obj2;
                p8Var.getClass();
                u1Var.dismiss();
                org.telegram.ui.Wallet.g8 g8Var = new org.telegram.ui.Wallet.g8();
                g8Var.f42543r = !((Boolean) obj).booleanValue();
                p8Var.presentFragment(g8Var);
                return;
            case 26:
                ((Runnable) obj2).run();
                ((org.telegram.ui.ActionBar.w2) obj).dismiss();
                return;
            case 27:
                org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) obj;
                vf.b h = u1Var.h(i7, true, true);
                h.d();
                org.telegram.ui.Wallet.l8 l8Var = new org.telegram.ui.Wallet.l8((org.telegram.ui.Wallet.p8) obj2, h, 1);
                org.telegram.ui.Wallet.l0.H("disableBackupWithoutUpdatingPhrase");
                l0Var.m0(new h2.o0((Object) l0Var, (Object) new org.telegram.ui.Components.ex(28, l0Var, l8Var), true, false, 4));
                return;
        }
    }

    @Override
    public Object j(Object obj) {
        vs0 vs0Var = (vs0) this.f48541c;
        Void r10 = (Void) obj;
        PremiumPreviewFragment premiumPreviewFragment = ((ws0) this.f48540b).d.f51812n;
        premiumPreviewFragment.f41621n0.d(0, 0.0f, 0, vs0Var.getMeasuredWidth(), -vs0Var.getTier().h, premiumPreviewFragment.O);
        return premiumPreviewFragment.f41621n0.f56877f;
    }

    @Override
    public void k(boolean z9) {
        TLRPC.Chat chat = (TLRPC.Chat) this.f48541c;
        z91 z91Var = ((k91) this.f48540b).f47236b;
        org.telegram.messenger.qs notificationCenter = z91Var.getNotificationCenter();
        int i7 = org.telegram.messenger.qs.f25080t;
        notificationCenter.n(z91Var, i7);
        z91Var.getNotificationCenter().k(i7, new Object[0]);
        z91Var.finishFragment();
        z91Var.getNotificationCenter().k(org.telegram.messenger.qs.K2, Long.valueOf(-chat.f26960id), null, chat, Boolean.valueOf(z9));
    }

    @Override
    public void onSuccess(Object obj) {
        Integer num = (Integer) obj;
        org.telegram.messenger.a8.b("wear-auth: /token delivered to " + ((String) ((a8.r7) this.f48540b).d));
        ((fi.d) this.f48541c).setLoading(false);
        zc1.d = null;
        org.telegram.ui.ActionBar.w2 w2Var = zc1.f52408c;
        if (w2Var != null) {
            w2Var.dismiss();
            zc1.f52408c = null;
        }
    }

    @Override
    public void t(rh0 rh0Var) {
        fa1 fa1Var = ((ca1) this.f48540b).f44287a;
        fa1Var.f45672e.add(Integer.valueOf(((TLRPC.TL_forumTopic) this.f48541c).f27012id));
        fa1Var.a0();
    }

    public ok0(kr0 kr0Var, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, ArrayList arrayList) {
        this.f48539a = 6;
        this.f48540b = kr0Var;
        this.f48541c = tL_messageMediaPoll;
    }

    @Override
    public void c0() {
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
