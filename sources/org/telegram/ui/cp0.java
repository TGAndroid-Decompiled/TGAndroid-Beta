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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class cp0 implements org.telegram.ui.ActionBar.u1, org.telegram.ui.Components.q4, org.telegram.messenger.m9, org.telegram.messenger.si, org.telegram.ui.Components.ik0, org.telegram.ui.Components.jk0, ys0, org.telegram.messenger.as, sy0, OnSuccessListener {
    public final int f36385a;
    public final Object f36386b;
    public final Object f36387c;

    public cp0(int i10, Object obj, Object obj2) {
        this.f36385a = i10;
        this.f36386b = obj;
        this.f36387c = obj2;
    }

    @Override
    public void K(int i10, int i11, boolean z10) {
        switch (this.f36385a) {
            case 4:
                zs0 zs0Var = ((rs0) this.f36386b).f41146a;
                zs0Var.f44059e0.a((TLRPC.TL_messageMediaToDo) this.f36387c);
                zs0Var.finishFragment();
                return;
            default:
                zs0 zs0Var2 = ((rs0) this.f36386b).f41146a;
                zs0Var2.f44059e0.a((TLRPC.TL_messageMediaPoll) this.f36387c);
                zs0Var2.finishFragment();
                return;
        }
    }

    @Override
    public void a(TLRPC.MessageMedia messageMedia) {
        v91 v91Var = (v91) this.f36386b;
        un unVar = (un) this.f36387c;
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.MessageMedia messageMedia2 = v91Var.G.f16690k.media;
            if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                ((TLRPC.TL_messageMediaToDo) messageMedia).completions = ((TLRPC.TL_messageMediaToDo) messageMedia2).completions;
            }
        }
        v91Var.G.f16690k.media = messageMedia;
        unVar.getSendMessagesHelper().t(v91Var.G, null, null, null, null, null, null, null, false, false, null);
    }

    @Override
    public void b(float f7, float f10, int i10, View view) {
        ThemeActivity.b0((ThemeActivity) this.f36386b, (Context) this.f36387c, view, i10, f7);
    }

    @Override
    public void c(String str, ArrayList arrayList) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.f36386b;
        Runnable runnable = (Runnable) this.f36387c;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            try {
                if (!((org.telegram.messenger.ri) arrayList.get(i10)).f17936a.startsWith("animated_")) {
                    String c10 = org.telegram.messenger.k6.c(((org.telegram.messenger.ri) arrayList.get(i10)).f17936a);
                    if (org.telegram.messenger.k6.g(c10) != null) {
                        linkedHashSet.add(c10);
                    }
                }
            } catch (Exception unused) {
            }
        }
        runnable.run();
    }

    public File d() {
        switch (this.f36385a) {
            case 0:
                org.telegram.messenger.b8.G(((PhotoViewer) this.f36386b).T);
                return org.telegram.messenger.b8.K((TLObject) this.f36387c, null, true, true);
            default:
                org.telegram.messenger.b8.G(((PhotoViewer) this.f36386b).T);
                return org.telegram.messenger.b8.N((TLRPC.Message) this.f36387c, false, true);
        }
    }

    @Override
    public boolean f(int i10, View view) {
        String str;
        final v71 v71Var = (v71) this.f36386b;
        final x71 x71Var = (x71) this.f36387c;
        ThemeActivity themeActivity = v71Var.e;
        if (i10 >= 0 && i10 < x71Var.e.size()) {
            final org.telegram.ui.ActionBar.r6 r6Var = (org.telegram.ui.ActionBar.r6) x71Var.e.get(i10);
            if (r6Var.f20731a >= 100 && !r6Var.f20752z) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                String L0 = org.telegram.messenger.dd.L0(2131747813, "OpenInEditor");
                String L02 = org.telegram.messenger.dd.L0(2131745444, "ShareTheme");
                TLRPC.TL_theme tL_theme = r6Var.f20745r;
                if (tL_theme != null && tL_theme.creator) {
                    str = org.telegram.messenger.dd.L0(2131744170, "ThemeSetUrl");
                } else {
                    str = null;
                }
                CharSequence[] charSequenceArr = {L0, L02, str, org.telegram.messenger.dd.L0(2131751487, "DeleteTheme")};
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i11) {
                        v71 v71Var2 = v71.this;
                        ThemeActivity themeActivity2 = v71Var2.e;
                        if (themeActivity2.getParentActivity() != null) {
                            org.telegram.ui.ActionBar.r6 r6Var2 = r6Var;
                            int i12 = 2;
                            if (i11 == 0) {
                                if (i11 != 1) {
                                    i12 = 1;
                                }
                                org.telegram.ui.Components.s4.V(themeActivity2, i12, r6Var2.f20732b, r6Var2);
                            } else if (i11 == 1) {
                                if (r6Var2.f20745r == null) {
                                    themeActivity2.getMessagesController().v4(r6Var2.f20732b, r6Var2);
                                    org.telegram.messenger.at.e().k(org.telegram.messenger.at.f14784s4, r6Var2.f20732b, r6Var2);
                                    return;
                                }
                                String str2 = "https://" + themeActivity2.getMessagesController().U2 + "/addtheme/" + r6Var2.f20745r.slug;
                                themeActivity2.showDialog(new org.telegram.ui.Components.pp0(themeActivity2.getParentActivity(), null, str2, false, str2, false, null));
                            } else if (i11 == 2) {
                                themeActivity2.presentFragment(new n91(r6Var2.f20732b, r6Var2, false));
                            } else if (i11 == 3 && themeActivity2.getParentActivity() != null) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(themeActivity2.getParentActivity());
                                String L03 = org.telegram.messenger.dd.L0(2131751485, "DeleteThemeTitle");
                                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder2.f20135a;
                                x1Var.R = L03;
                                x1Var.T = org.telegram.messenger.dd.L0(2131751486, "DeleteThemeAlert");
                                alertDialog$Builder2.k(org.telegram.messenger.dd.L0(2131751599, "Delete"), new a7(v71Var2, x71Var, r6Var2, 22));
                                alertDialog$Builder2.h(org.telegram.messenger.dd.L0(2131752589, "Cancel"), null);
                                themeActivity2.showDialog(x1Var);
                                TextView textView = (TextView) x1Var.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21171q7, null);
                                }
                            }
                        }
                    }
                };
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                x1Var.P = charSequenceArr;
                x1Var.Q = new int[]{2131232115, 2131232362, 2131232202, 2131232107};
                x1Var.M = onClickListener;
                themeActivity.showDialog(x1Var);
                x1Var.m(x1Var.P0.size() - 1, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21171q7, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21154p7, false));
                return true;
            }
        }
        return false;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        ArrayList arrayList;
        TLRPC.EncryptedChat encryptedChat;
        int i11;
        boolean z10;
        boolean z11;
        org.telegram.ui.ActionBar.z4 z4Var;
        int i12 = this.f36385a;
        int i13 = 5;
        Object obj = this.f36387c;
        Object obj2 = this.f36386b;
        switch (i12) {
            case 2:
                PhotoViewer.D(((yp0) obj2).f43706b, (ArrayList) obj);
                return;
            case 3:
                boolean[] zArr = (boolean[]) obj;
                PhotoViewer photoViewer = ((yp0) obj2).f43706b;
                ds0 ds0Var = photoViewer.d;
                ArrayList arrayList2 = photoViewer.f33446a7;
                ArrayList arrayList3 = photoViewer.f33475d7;
                ArrayList arrayList4 = photoViewer.Y6;
                ArrayList arrayList5 = photoViewer.e7;
                ArrayList arrayList6 = photoViewer.f7;
                if (!ds0Var.N()) {
                    photoViewer.H0(false, false);
                    return;
                } else if (!arrayList4.isEmpty()) {
                    int i14 = photoViewer.P4;
                    if (i14 >= 0 && i14 < arrayList4.size()) {
                        org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) arrayList4.get(photoViewer.P4);
                        if (kjVar.q4()) {
                            photoViewer.H0(false, false);
                            ArrayList arrayList7 = new ArrayList();
                            int i15 = photoViewer.f33636w;
                            if (i15 != 0) {
                                arrayList7.add(Integer.valueOf(i15));
                            } else {
                                arrayList7.add(Integer.valueOf(kjVar.f1()));
                            }
                            if (org.telegram.messenger.o5.C(org.telegram.messenger.kj.B0(kjVar.f16690k)) && kjVar.f16690k.random_id != 0) {
                                ArrayList arrayList8 = new ArrayList();
                                arrayList8.add(Long.valueOf(kjVar.f16690k.random_id));
                                arrayList = arrayList8;
                                encryptedChat = org.telegram.messenger.wp.r1(photoViewer.T).Z0(Integer.valueOf((int) (org.telegram.messenger.kj.B0(kjVar.f16690k) & 4294967295L)));
                            } else {
                                arrayList = null;
                                encryptedChat = null;
                            }
                            org.telegram.messenger.wp r12 = org.telegram.messenger.wp.r1(photoViewer.T);
                            long B0 = org.telegram.messenger.kj.B0(kjVar.f16690k);
                            int J1 = org.telegram.messenger.kj.J1(kjVar.f16690k);
                            boolean z12 = zArr[0];
                            if (kjVar.f16710p1) {
                                i11 = 1;
                            } else {
                                if (org.telegram.messenger.kj.d5(kjVar.f16690k)) {
                                    i13 = 9;
                                } else if (!org.telegram.messenger.kj.b4(kjVar.f16690k)) {
                                    i11 = 0;
                                }
                                i11 = i13;
                            }
                            r12.Z(arrayList7, arrayList, encryptedChat, B0, J1, z12, i11);
                            return;
                        }
                        return;
                    }
                    return;
                } else if (!arrayList6.isEmpty()) {
                    int i16 = photoViewer.P4;
                    if (i16 >= 0 && i16 < arrayList6.size()) {
                        TLRPC.Message message = (TLRPC.Message) arrayList3.get(photoViewer.P4);
                        if (message != null) {
                            ArrayList arrayList9 = new ArrayList();
                            arrayList9.add(Integer.valueOf(message.f19815id));
                            org.telegram.messenger.wp.r1(photoViewer.T).Z(arrayList9, null, null, org.telegram.messenger.kj.B0(message), message.quick_reply_shortcut_id, true, 0);
                            org.telegram.messenger.at.f(photoViewer.T).k(39, new Object[0]);
                        }
                        if (photoViewer.L1()) {
                            if (photoViewer.f33670z5 > 0) {
                                org.telegram.messenger.wp.r1(photoViewer.T).l0(null);
                            } else {
                                org.telegram.messenger.wp.r1(photoViewer.T).B(-photoViewer.f33670z5, null, null, null, null, 0.0d, null, null, null, null);
                            }
                            photoViewer.H0(false, false);
                            return;
                        }
                        TLRPC.Photo photo = (TLRPC.Photo) arrayList6.get(photoViewer.P4);
                        if (photo != null) {
                            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                            tL_inputPhoto.f19813id = photo.f19818id;
                            tL_inputPhoto.access_hash = photo.access_hash;
                            byte[] bArr = photo.file_reference;
                            tL_inputPhoto.file_reference = bArr;
                            if (bArr == null) {
                                tL_inputPhoto.file_reference = new byte[0];
                            }
                            if (photoViewer.f33670z5 > 0) {
                                org.telegram.messenger.wp.r1(photoViewer.T).l0(tL_inputPhoto);
                            }
                            org.telegram.messenger.is a02 = org.telegram.messenger.is.a0(photoViewer.T);
                            a02.f16331a.c(new org.telegram.messenger.bq(4, photoViewer.f33670z5, photo.f19818id, a02));
                            arrayList2.remove(photoViewer.P4);
                            photoViewer.f33466c7.remove(photoViewer.P4);
                            photoViewer.f33456b7.remove(photoViewer.P4);
                            arrayList3.remove(photoViewer.P4);
                            arrayList6.remove(photoViewer.P4);
                            if (arrayList2.isEmpty()) {
                                photoViewer.H0(false, false);
                            } else {
                                int i17 = photoViewer.P4;
                                if (i17 >= arrayList6.size()) {
                                    i17 = arrayList6.size() - 1;
                                }
                                photoViewer.P4 = -1;
                                photoViewer.E2(i17);
                            }
                            if (message == null) {
                                org.telegram.messenger.at.f(photoViewer.T).k(39, new Object[0]);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                } else if (!arrayList5.isEmpty() && photoViewer.d != null) {
                    arrayList5.remove(photoViewer.P4);
                    photoViewer.d.B(photoViewer.P4);
                    if (arrayList5.isEmpty()) {
                        photoViewer.H0(false, false);
                        return;
                    }
                    int i18 = photoViewer.P4;
                    if (i18 >= arrayList5.size()) {
                        i18 = arrayList5.size() - 1;
                    }
                    photoViewer.P4 = -1;
                    photoViewer.E2(i18);
                    return;
                } else {
                    return;
                }
            case 4:
            case 5:
            case 6:
            case 11:
            case 12:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 23:
            case 27:
            default:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) obj2;
                TL_bots.allowSendMessage allowsendmessage = new TL_bots.allowSendMessage();
                allowsendmessage.bot = org.telegram.messenger.wp.r1(z0Var.M).p1(z0Var.U);
                ConnectionsManager.getInstance(z0Var.M).sendRequest(allowsendmessage, new ag.p0(z0Var, (String[]) obj, x1Var, 16));
                return;
            case 7:
                ((PrivacyControlActivity) obj2).y0();
                ((SharedPreferences) obj).edit().putBoolean("privacyAlertShowed", true).commit();
                return;
            case 8:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
                boolean[] zArr2 = privacySettingsActivity.Z;
                tL_payments_clearSavedInfo.credentials = zArr2[1];
                tL_payments_clearSavedInfo.info = zArr2[0];
                privacySettingsActivity.getUserConfig().f15534y = null;
                privacySettingsActivity.getUserConfig().v(false);
                privacySettingsActivity.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new sl0(4, privacySettingsActivity, (org.telegram.ui.Cells.t8) obj));
                return;
            case 9:
                ProfileActivity.p0((ProfileActivity) obj2, (org.telegram.ui.Cells.c2[]) obj);
                return;
            case 10:
                cx0 cx0Var = (cx0) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                cx0Var.getClass();
                ArrayList arrayList10 = new ArrayList();
                arrayList10.add(user);
                ProfileActivity profileActivity = cx0Var.f36436b;
                RectF rectF = ProfileActivity.S6;
                profileActivity.getContactsController().i(arrayList10, true);
                if (user != null) {
                    user.contact = false;
                    profileActivity.D5(false, false);
                    return;
                }
                return;
            case 13:
                q31 q31Var = (q31) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                if (T != null) {
                    q31Var.dismiss();
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    a7 a7Var = new a7(q31Var, user2, twoStepVerificationActivity, 20);
                    twoStepVerificationActivity.Z = 0;
                    twoStepVerificationActivity.f34136b0 = a7Var;
                    T.presentFragment(twoStepVerificationActivity);
                    return;
                }
                return;
            case 14:
                ThemeActivity.c0((ThemeActivity) obj2, (y01) obj);
                return;
            case 17:
                v71 v71Var = (v71) obj2;
                org.telegram.ui.ActionBar.s6 s6Var = (org.telegram.ui.ActionBar.s6) obj;
                v71Var.getClass();
                org.telegram.messenger.wp r13 = org.telegram.messenger.wp.r1(s6Var.E);
                if (s6Var == org.telegram.ui.ActionBar.t6.J) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                r13.u4(s6Var, null, z10, true);
                HashMap hashMap = org.telegram.ui.ActionBar.t6.H;
                if (s6Var.f20804b == null) {
                    z11 = false;
                } else {
                    if (org.telegram.ui.ActionBar.t6.I == s6Var) {
                        org.telegram.ui.ActionBar.t6.u(org.telegram.ui.ActionBar.t6.L, true, false);
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (s6Var == org.telegram.ui.ActionBar.t6.J) {
                        org.telegram.ui.ActionBar.t6.J = (org.telegram.ui.ActionBar.s6) hashMap.get("Dark Blue");
                    }
                    s6Var.t();
                    org.telegram.ui.ActionBar.t6.G.remove(s6Var);
                    hashMap.remove(s6Var.f20802a);
                    org.telegram.ui.ActionBar.m6 m6Var = s6Var.f20814i0;
                    if (m6Var != null) {
                        org.telegram.ui.ActionBar.m6.a(m6Var);
                    }
                    org.telegram.ui.ActionBar.t6.F.remove(s6Var);
                    new File(s6Var.f20804b).delete();
                    org.telegram.ui.ActionBar.t6.y1(true, false);
                }
                if (z11) {
                    z4Var = ((org.telegram.ui.ActionBar.k2) v71Var.e).parentLayout;
                    ((ActionBarLayout) z4Var).W(true, true);
                }
                org.telegram.messenger.at.e().k(265, new Object[0]);
                return;
            case 21:
                rc1.b0((rc1) obj2, (byte[]) obj);
                return;
            case 22:
                zd1 zd1Var = (zd1) obj2;
                ((boolean[]) obj)[0] = true;
                zd1Var.f43966p0 = 17;
                Intent intent = new Intent(zd1Var.f43938b, VoIPService.class);
                intent.putExtra("user_id", zd1Var.d.f19943id);
                intent.putExtra("is_outgoing", true);
                intent.putExtra("start_incall_activity", false);
                intent.putExtra("video_call", false);
                intent.putExtra("can_video_call", false);
                intent.putExtra("account", zd1Var.f43935a);
                try {
                    zd1Var.f43938b.startService(intent);
                    return;
                } catch (Throwable th2) {
                    org.telegram.messenger.f8.g(th2, true);
                    return;
                }
            case 24:
                org.telegram.ui.Wallet.t8 t8Var = (org.telegram.ui.Wallet.t8) obj2;
                t8Var.getClass();
                x1Var.dismiss();
                org.telegram.ui.Wallet.k8 k8Var = new org.telegram.ui.Wallet.k8();
                k8Var.f34825r = !((Boolean) obj).booleanValue();
                t8Var.presentFragment(k8Var);
                return;
            case 25:
                ((Runnable) obj2).run();
                ((org.telegram.ui.ActionBar.z2) obj).dismiss();
                return;
            case 26:
                org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) obj;
                gf.e h = x1Var.h(i10, true, true);
                h.d();
                org.telegram.ui.Wallet.p8 p8Var = new org.telegram.ui.Wallet.p8((org.telegram.ui.Wallet.t8) obj2, h, 1);
                org.telegram.ui.Wallet.k0.H("disableBackupWithoutUpdatingPhrase");
                k0Var.m0(new e2.n0((Object) k0Var, (Object) new d01(5, k0Var, p8Var), true, false, 4));
                return;
            case 28:
                org.telegram.ui.web.m.d0((org.telegram.ui.web.m) obj2, (HashSet) obj);
                return;
        }
    }

    @Override
    public boolean h1(View view) {
        return false;
    }

    @Override
    public void i(boolean z10) {
        TLRPC.Chat chat = (TLRPC.Chat) this.f36387c;
        nb1 nb1Var = ((za1) this.f36386b).f43873b;
        org.telegram.messenger.at notificationCenter = nb1Var.getNotificationCenter();
        int i10 = org.telegram.messenger.at.f14786t;
        notificationCenter.n(nb1Var, i10);
        nb1Var.getNotificationCenter().k(i10, new Object[0]);
        nb1Var.finishFragment();
        nb1Var.getNotificationCenter().k(org.telegram.messenger.at.K2, Long.valueOf(-chat.f19794id), null, chat, Boolean.valueOf(z10));
    }

    @Override
    public Object l(Object obj) {
        au0 au0Var = (au0) this.f36387c;
        Void r10 = (Void) obj;
        PremiumPreviewFragment premiumPreviewFragment = ((bu0) this.f36386b).d.f36413n;
        premiumPreviewFragment.f33713n0.d(0, 0.0f, 0, au0Var.getMeasuredWidth(), -au0Var.getTier().h, premiumPreviewFragment.O);
        return premiumPreviewFragment.f33713n0.f11143f;
    }

    @Override
    public void onSuccess(Object obj) {
        Integer num = (Integer) obj;
        org.telegram.messenger.f8.b("wear-auth: /token delivered to " + ((String) ((bh.d) this.f36386b).f2779c));
        ((vh.d) this.f36387c).setLoading(false);
        qe1.d = null;
        org.telegram.ui.ActionBar.z2 z2Var = qe1.f40764c;
        if (z2Var != null) {
            z2Var.dismiss();
            qe1.f40764c = null;
        }
    }

    @Override
    public void w(si0 si0Var) {
        tb1 tb1Var = ((qb1) this.f36386b).f40741a;
        tb1Var.e.add(Integer.valueOf(((TLRPC.TL_forumTopic) this.f36387c).f19846id));
        tb1Var.a0();
    }

    public cp0(rs0 rs0Var, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, ArrayList arrayList) {
        this.f36385a = 5;
        this.f36386b = rs0Var;
        this.f36387c = tL_messageMediaPoll;
    }

    @Override
    public void b0() {
    }

    @Override
    public void q0(View view, float f7, float f10) {
    }
}
