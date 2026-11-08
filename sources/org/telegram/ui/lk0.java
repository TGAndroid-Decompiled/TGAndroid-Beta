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
public final class lk0 implements org.telegram.ui.ActionBar.r1, org.telegram.ui.Components.t4, org.telegram.messenger.k9, org.telegram.messenger.ri, org.telegram.ui.Components.cj0, org.telegram.ui.Components.dj0, or0, org.telegram.messenger.qr, fx0, OnSuccessListener {
    public final int f47550a;
    public final Object f47551b;
    public final Object f47552c;

    public lk0(int i7, Object obj, Object obj2) {
        this.f47550a = i7;
        this.f47551b = obj;
        this.f47552c = obj2;
    }

    @Override
    public void L(int i7, int i10, boolean z9) {
        switch (this.f47550a) {
            case 5:
                pr0 pr0Var = ((hr0) this.f47551b).f46480a;
                pr0Var.f48923e0.a((TLRPC.TL_messageMediaToDo) this.f47552c);
                pr0Var.finishFragment();
                return;
            default:
                pr0 pr0Var2 = ((hr0) this.f47551b).f46480a;
                pr0Var2.f48923e0.a((TLRPC.TL_messageMediaPoll) this.f47552c);
                pr0Var2.finishFragment();
                return;
        }
    }

    @Override
    public void a(TLRPC.MessageMedia messageMedia) {
        g81 g81Var = (g81) this.f47551b;
        an anVar = (an) this.f47552c;
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.MessageMedia messageMedia2 = g81Var.G.f23262k.media;
            if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                ((TLRPC.TL_messageMediaToDo) messageMedia).completions = ((TLRPC.TL_messageMediaToDo) messageMedia2).completions;
            }
        }
        g81Var.G.f23262k.media = messageMedia;
        anVar.getSendMessagesHelper().t(g81Var.G, null, null, null, null, null, null, null, false, false, null);
    }

    public File b() {
        switch (this.f47550a) {
            case 1:
                org.telegram.messenger.w7.G(((PhotoViewer) this.f47551b).T);
                return org.telegram.messenger.w7.J((TLObject) this.f47552c, null, true, true);
            default:
                org.telegram.messenger.w7.G(((PhotoViewer) this.f47551b).T);
                return org.telegram.messenger.w7.M((TLRPC.Message) this.f47552c, false, true);
        }
    }

    @Override
    public boolean c(int i7, View view) {
        String str;
        final f61 f61Var = (f61) this.f47551b;
        final h61 h61Var = (h61) this.f47552c;
        ThemeActivity themeActivity = f61Var.f45466e;
        if (i7 >= 0 && i7 < h61Var.f46229e.size()) {
            final org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) h61Var.f46229e.get(i7);
            if (h6Var.f27519a >= 100 && !h6Var.f27541z) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                String M0 = org.telegram.messenger.id.M0(2131747798, "OpenInEditor");
                String M02 = org.telegram.messenger.id.M0(2131745429, "ShareTheme");
                TLRPC.TL_theme tL_theme = h6Var.f27534r;
                if (tL_theme != null && tL_theme.creator) {
                    str = org.telegram.messenger.id.M0(2131744148, "ThemeSetUrl");
                } else {
                    str = null;
                }
                CharSequence[] charSequenceArr = {M0, M02, str, org.telegram.messenger.id.M0(2131751487, "DeleteTheme")};
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        f61 f61Var2 = f61.this;
                        ThemeActivity themeActivity2 = f61Var2.f45466e;
                        if (themeActivity2.getParentActivity() != null) {
                            org.telegram.ui.ActionBar.h6 h6Var2 = h6Var;
                            int i11 = 2;
                            if (i10 == 0) {
                                if (i10 != 1) {
                                    i11 = 1;
                                }
                                org.telegram.ui.Components.v4.T(themeActivity2, i11, h6Var2.f27520b, h6Var2);
                            } else if (i10 == 1) {
                                if (h6Var2.f27534r == null) {
                                    themeActivity2.getMessagesController().y4(h6Var2.f27520b, h6Var2);
                                    org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25075s4, h6Var2.f27520b, h6Var2);
                                    return;
                                }
                                String str2 = "https://" + themeActivity2.getMessagesController().U2 + "/addtheme/" + h6Var2.f27534r.slug;
                                themeActivity2.showDialog(new org.telegram.ui.Components.mo0(themeActivity2.getParentActivity(), null, str2, false, str2, false, null));
                            } else if (i10 == 2) {
                                themeActivity2.presentFragment(new y71(h6Var2.f27520b, h6Var2, false));
                            } else if (i10 == 3 && themeActivity2.getParentActivity() != null) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(themeActivity2.getParentActivity());
                                String M03 = org.telegram.messenger.id.M0(2131751485, "DeleteThemeTitle");
                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder2.f27296a;
                                u1Var.R = M03;
                                u1Var.T = org.telegram.messenger.id.M0(2131751486, "DeleteThemeAlert");
                                alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131751599, "Delete"), new a7(f61Var2, h61Var, h6Var2, 22));
                                alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131752589, "Cancel"), null);
                                themeActivity2.showDialog(u1Var);
                                TextView textView = (TextView) u1Var.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28093q7, null);
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
                u1Var.m(u1Var.N0.size() - 1, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28093q7, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28073p7, false));
                return true;
            }
        }
        return false;
    }

    @Override
    public void e(String str, ArrayList arrayList) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.f47551b;
        Runnable runnable = (Runnable) this.f47552c;
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
        ThemeActivity.b0((ThemeActivity) this.f47551b, (Context) this.f47552c, view, i7, f10);
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
        int i11 = this.f47550a;
        int i12 = 0;
        Object obj = this.f47552c;
        Object obj2 = this.f47551b;
        switch (i11) {
            case 0:
                hl0 hl0Var = (hl0) obj2;
                hl0Var.f46409b0 = true;
                hl0Var.f46406a0.email_unconfirmed_pattern = (String) obj;
                hl0Var.P0();
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
                PhotoViewer.u(((qo0) obj2).f49289b, (ArrayList) obj);
                return;
            case 4:
                boolean[] zArr = (boolean[]) obj;
                PhotoViewer photoViewer = ((qo0) obj2).f49289b;
                uq0 uq0Var = photoViewer.d;
                ArrayList arrayList2 = photoViewer.Z6;
                ArrayList arrayList3 = photoViewer.f41373c7;
                ArrayList arrayList4 = photoViewer.X6;
                ArrayList arrayList5 = photoViewer.f41381d7;
                ArrayList arrayList6 = photoViewer.f41391e7;
                if (!uq0Var.N()) {
                    photoViewer.z0(false, false);
                    return;
                } else if (!arrayList4.isEmpty()) {
                    int i13 = photoViewer.O4;
                    if (i13 >= 0 && i13 < arrayList4.size()) {
                        org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList4.get(photoViewer.O4);
                        if (ijVar.r4()) {
                            photoViewer.z0(false, false);
                            ArrayList arrayList7 = new ArrayList();
                            int i14 = photoViewer.f41541w;
                            if (i14 != 0) {
                                arrayList7.add(Integer.valueOf(i14));
                            } else {
                                arrayList7.add(Integer.valueOf(ijVar.f1()));
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
                            int J1 = org.telegram.messenger.ij.J1(ijVar.f23262k);
                            boolean z11 = zArr[0];
                            if (ijVar.f23281p1) {
                                i10 = 1;
                            } else {
                                if (org.telegram.messenger.ij.e5(ijVar.f23262k)) {
                                    i12 = 9;
                                } else if (org.telegram.messenger.ij.c4(ijVar.f23262k)) {
                                    i12 = 5;
                                }
                                i10 = i12;
                            }
                            s12.Z(arrayList7, arrayList, encryptedChat, B0, J1, z11, i10);
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
                            if (photoViewer.f41567y5 > 0) {
                                org.telegram.messenger.qp.s1(photoViewer.T).l0(null);
                            } else {
                                org.telegram.messenger.qp.s1(photoViewer.T).B(-photoViewer.f41567y5, null, null, null, null, 0.0d, null, null, null, null);
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
                            if (photoViewer.f41567y5 > 0) {
                                org.telegram.messenger.qp.s1(photoViewer.T).l0(tL_inputPhoto);
                            }
                            org.telegram.messenger.yr a02 = org.telegram.messenger.yr.a0(photoViewer.T);
                            a02.f26719a.c(new org.telegram.messenger.vp(4, photoViewer.f41567y5, photo.f26980id, a02));
                            arrayList2.remove(photoViewer.O4);
                            photoViewer.f41363b7.remove(photoViewer.O4);
                            photoViewer.f41353a7.remove(photoViewer.O4);
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
                privacySettingsActivity.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new h50(20, privacySettingsActivity, (org.telegram.ui.Cells.r8) obj));
                return;
            case 10:
                ProfileActivity.p0((ProfileActivity) obj2, (org.telegram.ui.Cells.c2[]) obj);
                return;
            case 11:
                rv0 rv0Var = (rv0) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                rv0Var.getClass();
                ArrayList arrayList10 = new ArrayList();
                arrayList10.add(user);
                ProfileActivity profileActivity = rv0Var.f49556b;
                RectF rectF = ProfileActivity.S6;
                profileActivity.getContactsController().i(arrayList10, true);
                if (user != null) {
                    user.contact = false;
                    profileActivity.D5(false, false);
                    return;
                }
                return;
            case 14:
                a21 a21Var = (a21) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null) {
                    a21Var.dismiss();
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    a7 a7Var = new a7(a21Var, user2, twoStepVerificationActivity, 20);
                    twoStepVerificationActivity.Z = 0;
                    twoStepVerificationActivity.f42055b0 = a7Var;
                    T.presentFragment(twoStepVerificationActivity);
                    return;
                }
                return;
            case 15:
                ThemeActivity.c0((ThemeActivity) obj2, (by0) obj);
                return;
            case 18:
                f61 f61Var = (f61) obj2;
                org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) obj;
                f61Var.getClass();
                org.telegram.messenger.qp s13 = org.telegram.messenger.qp.s1(j6Var.E);
                if (j6Var == org.telegram.ui.ActionBar.k6.J) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                s13.x4(j6Var, null, z9, true);
                HashMap hashMap = org.telegram.ui.ActionBar.k6.H;
                if (j6Var.f27631b == null) {
                    z10 = false;
                } else {
                    if (org.telegram.ui.ActionBar.k6.I == j6Var) {
                        org.telegram.ui.ActionBar.k6.u(org.telegram.ui.ActionBar.k6.L, true, false);
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (j6Var == org.telegram.ui.ActionBar.k6.J) {
                        org.telegram.ui.ActionBar.k6.J = (org.telegram.ui.ActionBar.j6) hashMap.get("Dark Blue");
                    }
                    j6Var.t();
                    org.telegram.ui.ActionBar.k6.G.remove(j6Var);
                    hashMap.remove(j6Var.f27629a);
                    org.telegram.ui.ActionBar.c6 c6Var = j6Var.f27642i0;
                    if (c6Var != null) {
                        org.telegram.ui.ActionBar.c6.a(c6Var);
                    }
                    org.telegram.ui.ActionBar.k6.F.remove(j6Var);
                    new File(j6Var.f27631b).delete();
                    org.telegram.ui.ActionBar.k6.y1(true, false);
                }
                if (z10) {
                    q4Var = ((org.telegram.ui.ActionBar.f2) f61Var.f45466e).parentLayout;
                    ((ActionBarLayout) q4Var).X(true, true);
                }
                org.telegram.messenger.qs.e().k(265, new Object[0]);
                return;
            case 22:
                za1.b0((za1) obj2, (byte[]) obj);
                return;
            case 23:
                fc1 fc1Var = (fc1) obj2;
                ((boolean[]) obj)[0] = true;
                fc1Var.f45569o0 = 17;
                Intent intent = new Intent(fc1Var.f45542b, VoIPService.class);
                intent.putExtra("user_id", fc1Var.d.f27105id);
                intent.putExtra("is_outgoing", true);
                intent.putExtra("start_incall_activity", false);
                intent.putExtra("video_call", false);
                intent.putExtra("can_video_call", false);
                intent.putExtra("account", fc1Var.f45539a);
                try {
                    fc1Var.f45542b.startService(intent);
                    return;
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                    return;
                }
            case 25:
                org.telegram.ui.Wallet.n8 n8Var = (org.telegram.ui.Wallet.n8) obj2;
                n8Var.getClass();
                u1Var.dismiss();
                org.telegram.ui.Wallet.e8 e8Var = new org.telegram.ui.Wallet.e8();
                e8Var.f42462r = !((Boolean) obj).booleanValue();
                n8Var.presentFragment(e8Var);
                return;
            case 26:
                ((Runnable) obj2).run();
                ((org.telegram.ui.ActionBar.v2) obj).dismiss();
                return;
            case 27:
                org.telegram.ui.Wallet.m0 m0Var = (org.telegram.ui.Wallet.m0) obj;
                vf.b h = u1Var.h(i7, true, true);
                h.d();
                org.telegram.ui.Wallet.j8 j8Var = new org.telegram.ui.Wallet.j8((org.telegram.ui.Wallet.n8) obj2, h, 1);
                org.telegram.ui.Wallet.m0.H("disableBackupWithoutUpdatingPhrase");
                m0Var.m0(new h2.o0((Object) m0Var, (Object) new org.telegram.ui.Components.fx(28, m0Var, j8Var), true, false, 4));
                return;
        }
    }

    @Override
    public Object j(Object obj) {
        ss0 ss0Var = (ss0) this.f47552c;
        Void r10 = (Void) obj;
        PremiumPreviewFragment premiumPreviewFragment = ((ts0) this.f47551b).d.f50415n;
        premiumPreviewFragment.f41623n0.d(0, 0.0f, 0, ss0Var.getMeasuredWidth(), -ss0Var.getTier().h, premiumPreviewFragment.O);
        return premiumPreviewFragment.f41623n0.f56869f;
    }

    @Override
    public void k(boolean z9) {
        TLRPC.Chat chat = (TLRPC.Chat) this.f47552c;
        w91 w91Var = ((i91) this.f47551b).f46613b;
        org.telegram.messenger.qs notificationCenter = w91Var.getNotificationCenter();
        int i7 = org.telegram.messenger.qs.f25076t;
        notificationCenter.n(w91Var, i7);
        w91Var.getNotificationCenter().k(i7, new Object[0]);
        w91Var.finishFragment();
        w91Var.getNotificationCenter().k(org.telegram.messenger.qs.K2, Long.valueOf(-chat.f26956id), null, chat, Boolean.valueOf(z9));
    }

    @Override
    public void onSuccess(Object obj) {
        Integer num = (Integer) obj;
        org.telegram.messenger.a8.b("wear-auth: /token delivered to " + ((String) ((a8.r7) this.f47551b).d));
        ((fi.d) this.f47552c).setLoading(false);
        vc1.d = null;
        org.telegram.ui.ActionBar.v2 v2Var = vc1.f50641c;
        if (v2Var != null) {
            v2Var.dismiss();
            vc1.f50641c = null;
        }
    }

    @Override
    public void t(oh0 oh0Var) {
        ca1 ca1Var = ((z91) this.f47551b).f52493a;
        ca1Var.f44737e.add(Integer.valueOf(((TLRPC.TL_forumTopic) this.f47552c).f27008id));
        ca1Var.a0();
    }

    public lk0(hr0 hr0Var, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, ArrayList arrayList) {
        this.f47550a = 6;
        this.f47551b = hr0Var;
        this.f47552c = tL_messageMediaPoll;
    }

    @Override
    public void c0() {
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
