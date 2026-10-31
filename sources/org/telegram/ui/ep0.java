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
public final class ep0 implements org.telegram.ui.ActionBar.u1, org.telegram.ui.Components.q4, org.telegram.messenger.l9, org.telegram.messenger.ri, org.telegram.ui.Components.hk0, org.telegram.ui.Components.ik0, zs0, org.telegram.messenger.zr, ty0, OnSuccessListener {
    public final int f37095a;
    public final Object f37096b;
    public final Object f37097c;

    public ep0(int i10, Object obj, Object obj2) {
        this.f37095a = i10;
        this.f37096b = obj;
        this.f37097c = obj2;
    }

    @Override
    public void K(int i10, int i11, boolean z10) {
        switch (this.f37095a) {
            case 4:
                at0 at0Var = ((ss0) this.f37096b).f41641a;
                at0Var.f35716e0.a((TLRPC.TL_messageMediaToDo) this.f37097c);
                at0Var.finishFragment();
                return;
            default:
                at0 at0Var2 = ((ss0) this.f37096b).f41641a;
                at0Var2.f35716e0.a((TLRPC.TL_messageMediaPoll) this.f37097c);
                at0Var2.finishFragment();
                return;
        }
    }

    @Override
    public void a(TLRPC.MessageMedia messageMedia) {
        x91 x91Var = (x91) this.f37096b;
        un unVar = (un) this.f37097c;
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.MessageMedia messageMedia2 = x91Var.G.f16337k.media;
            if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                ((TLRPC.TL_messageMediaToDo) messageMedia).completions = ((TLRPC.TL_messageMediaToDo) messageMedia2).completions;
            }
        }
        x91Var.G.f16337k.media = messageMedia;
        unVar.getSendMessagesHelper().t(x91Var.G, null, null, null, null, null, null, null, false, false, null);
    }

    @Override
    public void b(float f7, float f10, int i10, View view) {
        ThemeActivity.a0((ThemeActivity) this.f37096b, (Context) this.f37097c, view, i10, f7);
    }

    @Override
    public void c(String str, ArrayList arrayList) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.f37096b;
        Runnable runnable = (Runnable) this.f37097c;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            try {
                if (!((org.telegram.messenger.qi) arrayList.get(i10)).f17590a.startsWith("animated_")) {
                    String c10 = org.telegram.messenger.k6.c(((org.telegram.messenger.qi) arrayList.get(i10)).f17590a);
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
        switch (this.f37095a) {
            case 0:
                org.telegram.messenger.b8.G(((PhotoViewer) this.f37096b).T);
                return org.telegram.messenger.b8.K((TLObject) this.f37097c, null, true, true);
            default:
                org.telegram.messenger.b8.G(((PhotoViewer) this.f37096b).T);
                return org.telegram.messenger.b8.N((TLRPC.Message) this.f37097c, false, true);
        }
    }

    @Override
    public boolean f(int i10, View view) {
        String str;
        final x71 x71Var = (x71) this.f37096b;
        final z71 z71Var = (z71) this.f37097c;
        ThemeActivity themeActivity = x71Var.e;
        if (i10 >= 0 && i10 < z71Var.e.size()) {
            final org.telegram.ui.ActionBar.r6 r6Var = (org.telegram.ui.ActionBar.r6) z71Var.e.get(i10);
            if (r6Var.f20730a >= 100 && !r6Var.f20751z) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                String L0 = org.telegram.messenger.cd.L0(2131747813, "OpenInEditor");
                String L02 = org.telegram.messenger.cd.L0(2131745444, "ShareTheme");
                TLRPC.TL_theme tL_theme = r6Var.f20744r;
                if (tL_theme != null && tL_theme.creator) {
                    str = org.telegram.messenger.cd.L0(2131744170, "ThemeSetUrl");
                } else {
                    str = null;
                }
                CharSequence[] charSequenceArr = {L0, L02, str, org.telegram.messenger.cd.L0(2131751487, "DeleteTheme")};
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i11) {
                        x71 x71Var2 = x71.this;
                        ThemeActivity themeActivity2 = x71Var2.e;
                        if (themeActivity2.getParentActivity() != null) {
                            org.telegram.ui.ActionBar.r6 r6Var2 = r6Var;
                            int i12 = 2;
                            if (i11 == 0) {
                                if (i11 != 1) {
                                    i12 = 1;
                                }
                                org.telegram.ui.Components.s4.V(themeActivity2, i12, r6Var2.f20731b, r6Var2);
                            } else if (i11 == 1) {
                                if (r6Var2.f20744r == null) {
                                    themeActivity2.getMessagesController().v4(r6Var2.f20731b, r6Var2);
                                    org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.f19688s4, r6Var2.f20731b, r6Var2);
                                    return;
                                }
                                String str2 = "https://" + themeActivity2.getMessagesController().U2 + "/addtheme/" + r6Var2.f20744r.slug;
                                themeActivity2.showDialog(new org.telegram.ui.Components.op0(themeActivity2.getParentActivity(), null, str2, false, str2, false, null));
                            } else if (i11 == 2) {
                                themeActivity2.presentFragment(new p91(r6Var2.f20731b, r6Var2, false));
                            } else if (i11 == 3 && themeActivity2.getParentActivity() != null) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(themeActivity2.getParentActivity());
                                String L03 = org.telegram.messenger.cd.L0(2131751485, "DeleteThemeTitle");
                                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder2.f20134a;
                                x1Var.R = L03;
                                x1Var.T = org.telegram.messenger.cd.L0(2131751486, "DeleteThemeAlert");
                                alertDialog$Builder2.k(org.telegram.messenger.cd.L0(2131751599, "Delete"), new a7(x71Var2, z71Var, r6Var2, 22));
                                alertDialog$Builder2.h(org.telegram.messenger.cd.L0(2131752589, "Cancel"), null);
                                themeActivity2.showDialog(x1Var);
                                TextView textView = (TextView) x1Var.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21170q7, null);
                                }
                            }
                        }
                    }
                };
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                x1Var.P = charSequenceArr;
                x1Var.Q = new int[]{2131232115, 2131232362, 2131232202, 2131232107};
                x1Var.M = onClickListener;
                themeActivity.showDialog(x1Var);
                x1Var.m(x1Var.P0.size() - 1, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21170q7, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21153p7, false));
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
        int i12 = this.f37095a;
        int i13 = 0;
        Object obj = this.f37097c;
        Object obj2 = this.f37096b;
        switch (i12) {
            case 2:
                PhotoViewer.D(((aq0) obj2).f35697b, (ArrayList) obj);
                return;
            case 3:
                boolean[] zArr = (boolean[]) obj;
                PhotoViewer photoViewer = ((aq0) obj2).f35697b;
                es0 es0Var = photoViewer.d;
                ArrayList arrayList2 = photoViewer.f33439a7;
                ArrayList arrayList3 = photoViewer.f33468d7;
                ArrayList arrayList4 = photoViewer.Y6;
                ArrayList arrayList5 = photoViewer.e7;
                ArrayList arrayList6 = photoViewer.f7;
                if (!es0Var.N()) {
                    photoViewer.H0(false, false);
                    return;
                } else if (!arrayList4.isEmpty()) {
                    int i14 = photoViewer.P4;
                    if (i14 >= 0 && i14 < arrayList4.size()) {
                        org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) arrayList4.get(photoViewer.P4);
                        if (jjVar.q4()) {
                            photoViewer.H0(false, false);
                            ArrayList arrayList7 = new ArrayList();
                            int i15 = photoViewer.f33629w;
                            if (i15 != 0) {
                                arrayList7.add(Integer.valueOf(i15));
                            } else {
                                arrayList7.add(Integer.valueOf(jjVar.f1()));
                            }
                            if (org.telegram.messenger.o5.C(org.telegram.messenger.jj.B0(jjVar.f16337k)) && jjVar.f16337k.random_id != 0) {
                                ArrayList arrayList8 = new ArrayList();
                                arrayList8.add(Long.valueOf(jjVar.f16337k.random_id));
                                encryptedChat = org.telegram.messenger.vp.r1(photoViewer.T).Z0(Integer.valueOf((int) (org.telegram.messenger.jj.B0(jjVar.f16337k) & 4294967295L)));
                                arrayList = arrayList8;
                            } else {
                                arrayList = null;
                                encryptedChat = null;
                            }
                            org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(photoViewer.T);
                            long B0 = org.telegram.messenger.jj.B0(jjVar.f16337k);
                            int J1 = org.telegram.messenger.jj.J1(jjVar.f16337k);
                            boolean z12 = zArr[0];
                            if (jjVar.f16357p1) {
                                i11 = 1;
                            } else {
                                if (org.telegram.messenger.jj.d5(jjVar.f16337k)) {
                                    i13 = 9;
                                } else if (org.telegram.messenger.jj.b4(jjVar.f16337k)) {
                                    i13 = 5;
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
                            arrayList9.add(Integer.valueOf(message.f19814id));
                            org.telegram.messenger.vp.r1(photoViewer.T).Z(arrayList9, null, null, org.telegram.messenger.jj.B0(message), message.quick_reply_shortcut_id, true, 0);
                            org.telegram.messenger.zs.f(photoViewer.T).k(39, new Object[0]);
                        }
                        if (photoViewer.L1()) {
                            if (photoViewer.f33663z5 > 0) {
                                org.telegram.messenger.vp.r1(photoViewer.T).l0(null);
                            } else {
                                org.telegram.messenger.vp.r1(photoViewer.T).B(-photoViewer.f33663z5, null, null, null, null, 0.0d, null, null, null, null);
                            }
                            photoViewer.H0(false, false);
                            return;
                        }
                        TLRPC.Photo photo = (TLRPC.Photo) arrayList6.get(photoViewer.P4);
                        if (photo != null) {
                            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                            tL_inputPhoto.f19812id = photo.f19817id;
                            tL_inputPhoto.access_hash = photo.access_hash;
                            byte[] bArr = photo.file_reference;
                            tL_inputPhoto.file_reference = bArr;
                            if (bArr == null) {
                                tL_inputPhoto.file_reference = new byte[0];
                            }
                            if (photoViewer.f33663z5 > 0) {
                                org.telegram.messenger.vp.r1(photoViewer.T).l0(tL_inputPhoto);
                            }
                            org.telegram.messenger.hs a02 = org.telegram.messenger.hs.a0(photoViewer.T);
                            a02.f15938a.c(new org.telegram.messenger.aq(4, photoViewer.f33663z5, photo.f19817id, a02));
                            arrayList2.remove(photoViewer.P4);
                            photoViewer.f33459c7.remove(photoViewer.P4);
                            photoViewer.f33449b7.remove(photoViewer.P4);
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
                                org.telegram.messenger.zs.f(photoViewer.T).k(39, new Object[0]);
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
                allowsendmessage.bot = org.telegram.messenger.vp.r1(z0Var.M).p1(z0Var.U);
                ConnectionsManager.getInstance(z0Var.M).sendRequest(allowsendmessage, new ag.p0(z0Var, (String[]) obj, x1Var, 16));
                return;
            case 7:
                ((PrivacyControlActivity) obj2).x0();
                ((SharedPreferences) obj).edit().putBoolean("privacyAlertShowed", true).commit();
                return;
            case 8:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
                boolean[] zArr2 = privacySettingsActivity.Z;
                tL_payments_clearSavedInfo.credentials = zArr2[1];
                tL_payments_clearSavedInfo.info = zArr2[0];
                privacySettingsActivity.getUserConfig().f15175y = null;
                privacySettingsActivity.getUserConfig().v(false);
                privacySettingsActivity.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new ul0(4, privacySettingsActivity, (org.telegram.ui.Cells.t8) obj));
                return;
            case 9:
                ProfileActivity.o0((ProfileActivity) obj2, (org.telegram.ui.Cells.c2[]) obj);
                return;
            case 10:
                dx0 dx0Var = (dx0) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                dx0Var.getClass();
                ArrayList arrayList10 = new ArrayList();
                arrayList10.add(user);
                ProfileActivity profileActivity = dx0Var.f36859b;
                RectF rectF = ProfileActivity.R6;
                profileActivity.getContactsController().i(arrayList10, true);
                if (user != null) {
                    user.contact = false;
                    profileActivity.C5(false, false);
                    return;
                }
                return;
            case 13:
                s31 s31Var = (s31) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                if (T != null) {
                    s31Var.dismiss();
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    a7 a7Var = new a7(s31Var, user2, twoStepVerificationActivity, 20);
                    twoStepVerificationActivity.Z = 0;
                    twoStepVerificationActivity.f34129b0 = a7Var;
                    T.presentFragment(twoStepVerificationActivity);
                    return;
                }
                return;
            case 14:
                ThemeActivity.b0((ThemeActivity) obj2, (t11) obj);
                return;
            case 17:
                x71 x71Var = (x71) obj2;
                org.telegram.ui.ActionBar.s6 s6Var = (org.telegram.ui.ActionBar.s6) obj;
                x71Var.getClass();
                org.telegram.messenger.vp r13 = org.telegram.messenger.vp.r1(s6Var.E);
                if (s6Var == org.telegram.ui.ActionBar.t6.J) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                r13.u4(s6Var, null, z10, true);
                HashMap hashMap = org.telegram.ui.ActionBar.t6.H;
                if (s6Var.f20803b == null) {
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
                    hashMap.remove(s6Var.f20801a);
                    org.telegram.ui.ActionBar.m6 m6Var = s6Var.f20813i0;
                    if (m6Var != null) {
                        org.telegram.ui.ActionBar.m6.a(m6Var);
                    }
                    org.telegram.ui.ActionBar.t6.F.remove(s6Var);
                    new File(s6Var.f20803b).delete();
                    org.telegram.ui.ActionBar.t6.y1(true, false);
                }
                if (z11) {
                    z4Var = ((org.telegram.ui.ActionBar.k2) x71Var.e).parentLayout;
                    ((ActionBarLayout) z4Var).W(true, true);
                }
                org.telegram.messenger.zs.e().k(265, new Object[0]);
                return;
            case 21:
                tc1.a0((tc1) obj2, (byte[]) obj);
                return;
            case 22:
                be1 be1Var = (be1) obj2;
                ((boolean[]) obj)[0] = true;
                be1Var.f36227p0 = 17;
                Intent intent = new Intent(be1Var.f36199b, VoIPService.class);
                intent.putExtra("user_id", be1Var.d.f19942id);
                intent.putExtra("is_outgoing", true);
                intent.putExtra("start_incall_activity", false);
                intent.putExtra("video_call", false);
                intent.putExtra("can_video_call", false);
                intent.putExtra("account", be1Var.f36196a);
                try {
                    be1Var.f36199b.startService(intent);
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
                k8Var.f34821r = !((Boolean) obj).booleanValue();
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
                k0Var.m0(new e2.n0((Object) k0Var, (Object) new f11(4, k0Var, p8Var), true, false, 4));
                return;
            case 28:
                org.telegram.ui.web.m.c0((org.telegram.ui.web.m) obj2, (HashSet) obj);
                return;
        }
    }

    @Override
    public boolean h1(View view) {
        return false;
    }

    @Override
    public void i(boolean z10) {
        TLRPC.Chat chat = (TLRPC.Chat) this.f37097c;
        pb1 pb1Var = ((bb1) this.f37096b).f36164b;
        org.telegram.messenger.zs notificationCenter = pb1Var.getNotificationCenter();
        int i10 = org.telegram.messenger.zs.f19690t;
        notificationCenter.n(pb1Var, i10);
        pb1Var.getNotificationCenter().k(i10, new Object[0]);
        pb1Var.finishFragment();
        pb1Var.getNotificationCenter().k(org.telegram.messenger.zs.K2, Long.valueOf(-chat.f19793id), null, chat, Boolean.valueOf(z10));
    }

    @Override
    public Object l(Object obj) {
        bu0 bu0Var = (bu0) this.f37097c;
        Void r10 = (Void) obj;
        PremiumPreviewFragment premiumPreviewFragment = ((cu0) this.f37096b).d.f36836n;
        premiumPreviewFragment.f33706n0.d(0, 0.0f, 0, bu0Var.getMeasuredWidth(), -bu0Var.getTier().h, premiumPreviewFragment.O);
        return premiumPreviewFragment.f33706n0.f11142f;
    }

    @Override
    public void onSuccess(Object obj) {
        Integer num = (Integer) obj;
        org.telegram.messenger.f8.b("wear-auth: /token delivered to " + ((String) ((bh.d) this.f37096b).f2779c));
        ((vh.d) this.f37097c).setLoading(false);
        se1.d = null;
        org.telegram.ui.ActionBar.z2 z2Var = se1.f41494c;
        if (z2Var != null) {
            z2Var.dismiss();
            se1.f41494c = null;
        }
    }

    @Override
    public void w(ui0 ui0Var) {
        vb1 vb1Var = ((sb1) this.f37096b).f41465a;
        vb1Var.e.add(Integer.valueOf(((TLRPC.TL_forumTopic) this.f37097c).f19845id));
        vb1Var.Z();
    }

    public ep0(ss0 ss0Var, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, ArrayList arrayList) {
        this.f37095a = 5;
        this.f37096b = ss0Var;
        this.f37097c = tL_messageMediaPoll;
    }

    @Override
    public void b0() {
    }

    @Override
    public void q0(View view, float f7, float f10) {
    }
}
