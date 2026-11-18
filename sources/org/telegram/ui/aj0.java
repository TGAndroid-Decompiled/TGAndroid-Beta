package org.telegram.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.RectF;
import android.view.View;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class aj0 implements org.telegram.ui.ActionBar.r1, ss, org.telegram.ui.Components.z4, org.telegram.messenger.i9, org.telegram.messenger.oi, org.telegram.ui.Components.pj0, org.telegram.ui.Components.qj0, or0, org.telegram.messenger.lr, ix0 {
    public final int f45612a;
    public final Object f45613b;
    public final Object f45614c;

    public aj0(int i7, Object obj, Object obj2) {
        this.f45612a = i7;
        this.f45613b = obj;
        this.f45614c = obj2;
    }

    @Override
    public void O(int i7, int i10, boolean z10) {
        switch (this.f45612a) {
            case 8:
                pr0 pr0Var = ((hr0) this.f45613b).f48515a;
                pr0Var.f50973f0.a((TLRPC.TL_messageMediaToDo) this.f45614c);
                pr0Var.finishFragment();
                return;
            default:
                pr0 pr0Var2 = ((hr0) this.f45613b).f48515a;
                pr0Var2.f50973f0.a((TLRPC.TL_messageMediaPoll) this.f45614c);
                pr0Var2.finishFragment();
                return;
        }
    }

    @Override
    public void a(TLRPC.MessageMedia messageMedia) {
        i81 i81Var = (i81) this.f45613b;
        bn bnVar = (bn) this.f45614c;
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.MessageMedia messageMedia2 = i81Var.H.f23968k.media;
            if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                ((TLRPC.TL_messageMediaToDo) messageMedia).completions = ((TLRPC.TL_messageMediaToDo) messageMedia2).completions;
            }
        }
        i81Var.H.f23968k.media = messageMedia;
        bnVar.getSendMessagesHelper().t(i81Var.H, null, null, null, null, null, null, null, false, false, null);
    }

    @Override
    public void b(ps psVar) {
        hk0 hk0Var = (hk0) this.f45613b;
        int intValue = ((Integer) ((View) this.f45614c).getTag()).intValue();
        EditTextBoldCursor editTextBoldCursor = hk0Var.Z[intValue];
        if (intValue == 5) {
            hk0Var.f48453s = psVar.d;
        } else {
            hk0Var.f48462w = psVar.d;
        }
        editTextBoldCursor.setText(psVar.f50999a);
    }

    @Override
    public boolean b1(View view) {
        return false;
    }

    @Override
    public boolean c(int i7, View view) {
        String str;
        final g61 g61Var = (g61) this.f45613b;
        final i61 i61Var = (i61) this.f45614c;
        ThemeActivity themeActivity = g61Var.f47948e;
        if (i7 >= 0 && i7 < i61Var.f48591e.size()) {
            final org.telegram.ui.ActionBar.k6 k6Var = (org.telegram.ui.ActionBar.k6) i61Var.f48591e.get(i7);
            if (k6Var.f29170a >= 100 && !k6Var.f29192z) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                String M0 = org.telegram.messenger.gd.M0(2131747604, "OpenInEditor");
                String M02 = org.telegram.messenger.gd.M0(2131745231, "ShareTheme");
                TLRPC.TL_theme tL_theme = k6Var.f29185r;
                if (tL_theme != null && tL_theme.creator) {
                    str = org.telegram.messenger.gd.M0(2131743910, "ThemeSetUrl");
                } else {
                    str = null;
                }
                CharSequence[] charSequenceArr = {M0, M02, str, org.telegram.messenger.gd.M0(2131751475, "DeleteTheme")};
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        g61 g61Var2 = g61.this;
                        ThemeActivity themeActivity2 = g61Var2.f47948e;
                        if (themeActivity2.getParentActivity() != null) {
                            org.telegram.ui.ActionBar.k6 k6Var2 = k6Var;
                            int i11 = 2;
                            if (i10 == 0) {
                                if (i10 != 1) {
                                    i11 = 1;
                                }
                                org.telegram.ui.Components.b5.T(themeActivity2, i11, k6Var2.f29171b, k6Var2);
                            } else if (i10 == 1) {
                                if (k6Var2.f29185r == null) {
                                    themeActivity2.getMessagesController().H4(k6Var2.f29171b, k6Var2);
                                    org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.f25204u4, k6Var2.f29171b, k6Var2);
                                    return;
                                }
                                String str2 = "https://" + themeActivity2.getMessagesController().X2 + "/addtheme/" + k6Var2.f29185r.slug;
                                themeActivity2.showDialog(new org.telegram.ui.Components.yo0(themeActivity2.getParentActivity(), null, str2, false, str2, false, null));
                            } else if (i10 == 2) {
                                themeActivity2.presentFragment(new a81(k6Var2.f29171b, k6Var2, false));
                            } else if (i10 == 3 && themeActivity2.getParentActivity() != null) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(themeActivity2.getParentActivity());
                                String M03 = org.telegram.messenger.gd.M0(2131751473, "DeleteThemeTitle");
                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder2.f28746a;
                                u1Var.S = M03;
                                u1Var.U = org.telegram.messenger.gd.M0(2131751474, "DeleteThemeAlert");
                                alertDialog$Builder2.k(org.telegram.messenger.gd.M0(2131751587, "Delete"), new z6(g61Var2, i61Var, k6Var2, 22));
                                alertDialog$Builder2.h(org.telegram.messenger.gd.M0(2131752578, "Cancel"), null);
                                themeActivity2.showDialog(u1Var);
                                TextView textView = (TextView) u1Var.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29637q7, null);
                                }
                            }
                        }
                    }
                };
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
                u1Var.Q = charSequenceArr;
                u1Var.R = new int[]{2131232118, 2131232365, 2131232205, 2131232110};
                u1Var.N = onClickListener;
                themeActivity.showDialog(u1Var);
                u1Var.m(u1Var.O0.size() - 1, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29637q7, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29617p7, false));
                return true;
            }
        }
        return false;
    }

    @Override
    public void d(boolean z10) {
        TLRPC.Chat chat = (TLRPC.Chat) this.f45614c;
        y91 y91Var = ((j91) this.f45613b).f48928b;
        org.telegram.messenger.ks notificationCenter = y91Var.getNotificationCenter();
        int i7 = org.telegram.messenger.ks.f25192t;
        notificationCenter.n(y91Var, i7);
        y91Var.getNotificationCenter().k(i7, new Object[0]);
        y91Var.finishFragment();
        y91Var.getNotificationCenter().k(org.telegram.messenger.ks.K2, Long.valueOf(-chat.f28405id), null, chat, Boolean.valueOf(z10));
    }

    @Override
    public void e(String str, ArrayList arrayList) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.f45613b;
        Runnable runnable = (Runnable) this.f45614c;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            try {
                if (!((org.telegram.messenger.ni) arrayList.get(i7)).f25929a.startsWith("animated_")) {
                    String c10 = org.telegram.messenger.j6.c(((org.telegram.messenger.ni) arrayList.get(i7)).f25929a);
                    if (org.telegram.messenger.j6.g(c10) != null) {
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
        ThemeActivity.b0((ThemeActivity) this.f45613b, (Context) this.f45614c, view, i7, f10);
    }

    public File g() {
        switch (this.f45612a) {
            case 4:
                org.telegram.messenger.w7.G(((PhotoViewer) this.f45613b).U);
                return org.telegram.messenger.w7.J((TLObject) this.f45614c, null, true, true);
            default:
                org.telegram.messenger.w7.G(((PhotoViewer) this.f45613b).U);
                return org.telegram.messenger.w7.M((TLRPC.Message) this.f45614c, false, true);
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        ArrayList arrayList;
        TLRPC.EncryptedChat encryptedChat;
        int i10;
        boolean z10;
        boolean z11;
        org.telegram.ui.ActionBar.s4 s4Var;
        int i11 = this.f45612a;
        int i12 = 0;
        Object obj = this.f45614c;
        Object obj2 = this.f45613b;
        switch (i11) {
            case 0:
                int[] iArr = ((hk0) obj2).f48468y;
                iArr[2] = 0;
                iArr[1] = 0;
                iArr[0] = 0;
                ((EditTextBoldCursor) obj).setText(org.telegram.messenger.gd.M0(2131747301, null));
                return;
            case 1:
            case 4:
            case 5:
            case 8:
            case 9:
            case 10:
            case 15:
            case 16:
            case 19:
            case 20:
            case 22:
            case 23:
            case 24:
            default:
                org.telegram.ui.Wallet.u0 u0Var = (org.telegram.ui.Wallet.u0) obj;
                vf.b h = u1Var.h(i7, true, true);
                h.d();
                org.telegram.ui.Wallet.z8 z8Var = new org.telegram.ui.Wallet.z8((org.telegram.ui.Wallet.d9) obj2, h, 1);
                org.telegram.ui.Wallet.u0.P("disableBackupWithoutUpdatingPhrase");
                u0Var.x0(new h2.n0((Object) u0Var, (Object) new p51(6, u0Var, z8Var), true, false, 4));
                return;
            case 2:
                hk0.Z((hk0) obj2, (TLRPC.TL_auth_passwordRecovery) obj);
                return;
            case 3:
                ml0 ml0Var = (ml0) obj2;
                ml0Var.f49886c0 = true;
                ml0Var.f49883b0.email_unconfirmed_pattern = (String) obj;
                ml0Var.P0();
                return;
            case 6:
                PhotoViewer.u(((ro0) obj2).f51721b, (ArrayList) obj);
                return;
            case 7:
                boolean[] zArr = (boolean[]) obj;
                PhotoViewer photoViewer = ((ro0) obj2).f51721b;
                uq0 uq0Var = photoViewer.d;
                ArrayList arrayList2 = photoViewer.f43167a7;
                ArrayList arrayList3 = photoViewer.f43195d7;
                ArrayList arrayList4 = photoViewer.Y6;
                ArrayList arrayList5 = photoViewer.f43205e7;
                ArrayList arrayList6 = photoViewer.f43215f7;
                if (!uq0Var.N()) {
                    photoViewer.z0(false, false);
                    return;
                } else if (!arrayList4.isEmpty()) {
                    int i13 = photoViewer.P4;
                    if (i13 >= 0 && i13 < arrayList4.size()) {
                        org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) arrayList4.get(photoViewer.P4);
                        if (fjVar.q4()) {
                            photoViewer.z0(false, false);
                            ArrayList arrayList7 = new ArrayList();
                            int i14 = photoViewer.f43355w;
                            if (i14 != 0) {
                                arrayList7.add(Integer.valueOf(i14));
                            } else {
                                arrayList7.add(Integer.valueOf(fjVar.e1()));
                            }
                            if (org.telegram.messenger.n5.C(org.telegram.messenger.fj.B0(fjVar.f23968k)) && fjVar.f23968k.random_id != 0) {
                                ArrayList arrayList8 = new ArrayList();
                                arrayList8.add(Long.valueOf(fjVar.f23968k.random_id));
                                arrayList = arrayList8;
                                encryptedChat = org.telegram.messenger.mp.u1(photoViewer.U).c1(Integer.valueOf((int) (org.telegram.messenger.fj.B0(fjVar.f23968k) & 4294967295L)));
                            } else {
                                arrayList = null;
                                encryptedChat = null;
                            }
                            org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(photoViewer.U);
                            long B0 = org.telegram.messenger.fj.B0(fjVar.f23968k);
                            int I1 = org.telegram.messenger.fj.I1(fjVar.f23968k);
                            boolean z12 = zArr[0];
                            if (fjVar.f23997r1) {
                                i10 = 1;
                            } else {
                                if (org.telegram.messenger.fj.d5(fjVar.f23968k)) {
                                    i12 = 9;
                                } else if (org.telegram.messenger.fj.b4(fjVar.f23968k)) {
                                    i12 = 5;
                                }
                                i10 = i12;
                            }
                            u12.Z(arrayList7, arrayList, encryptedChat, B0, I1, z12, i10);
                            return;
                        }
                        return;
                    }
                    return;
                } else if (!arrayList6.isEmpty()) {
                    int i15 = photoViewer.P4;
                    if (i15 >= 0 && i15 < arrayList6.size()) {
                        TLRPC.Message message = (TLRPC.Message) arrayList3.get(photoViewer.P4);
                        if (message != null) {
                            ArrayList arrayList9 = new ArrayList();
                            arrayList9.add(Integer.valueOf(message.f28426id));
                            org.telegram.messenger.mp.u1(photoViewer.U).Z(arrayList9, null, null, org.telegram.messenger.fj.B0(message), message.quick_reply_shortcut_id, true, 0);
                            org.telegram.messenger.ks.f(photoViewer.U).k(39, new Object[0]);
                        }
                        if (photoViewer.G1()) {
                            if (photoViewer.f43390z5 > 0) {
                                org.telegram.messenger.mp.u1(photoViewer.U).l0(null);
                            } else {
                                org.telegram.messenger.mp.u1(photoViewer.U).B(-photoViewer.f43390z5, null, null, null, null, 0.0d, null, null, null, null);
                            }
                            photoViewer.z0(false, false);
                            return;
                        }
                        TLRPC.Photo photo = (TLRPC.Photo) arrayList6.get(photoViewer.P4);
                        if (photo != null) {
                            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                            tL_inputPhoto.f28424id = photo.f28429id;
                            tL_inputPhoto.access_hash = photo.access_hash;
                            byte[] bArr = photo.file_reference;
                            tL_inputPhoto.file_reference = bArr;
                            if (bArr == null) {
                                tL_inputPhoto.file_reference = new byte[0];
                            }
                            if (photoViewer.f43390z5 > 0) {
                                org.telegram.messenger.mp.u1(photoViewer.U).l0(tL_inputPhoto);
                            }
                            org.telegram.messenger.tr a02 = org.telegram.messenger.tr.a0(photoViewer.U);
                            a02.f27054a.c(new org.telegram.messenger.np(4, photoViewer.f43390z5, photo.f28429id, a02));
                            arrayList2.remove(photoViewer.P4);
                            photoViewer.f43187c7.remove(photoViewer.P4);
                            photoViewer.f43177b7.remove(photoViewer.P4);
                            arrayList3.remove(photoViewer.P4);
                            arrayList6.remove(photoViewer.P4);
                            if (arrayList2.isEmpty()) {
                                photoViewer.z0(false, false);
                            } else {
                                int i16 = photoViewer.P4;
                                if (i16 >= arrayList6.size()) {
                                    i16 = arrayList6.size() - 1;
                                }
                                photoViewer.P4 = -1;
                                photoViewer.z2(i16);
                            }
                            if (message == null) {
                                org.telegram.messenger.ks.f(photoViewer.U).k(39, new Object[0]);
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
                        photoViewer.z0(false, false);
                        return;
                    }
                    int i17 = photoViewer.P4;
                    if (i17 >= arrayList5.size()) {
                        i17 = arrayList5.size() - 1;
                    }
                    photoViewer.P4 = -1;
                    photoViewer.z2(i17);
                    return;
                } else {
                    return;
                }
            case 11:
                ((PrivacyControlActivity) obj2).E0();
                ((SharedPreferences) obj).edit().putBoolean("privacyAlertShowed", true).commit();
                return;
            case 12:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
                boolean[] zArr2 = privacySettingsActivity.f43493a0;
                tL_payments_clearSavedInfo.credentials = zArr2[1];
                tL_payments_clearSavedInfo.info = zArr2[0];
                privacySettingsActivity.getUserConfig().f24803y = null;
                privacySettingsActivity.getUserConfig().v(false);
                privacySettingsActivity.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new e00(22, privacySettingsActivity, (org.telegram.ui.Cells.r8) obj));
                return;
            case 13:
                ProfileActivity.p0((ProfileActivity) obj2, (org.telegram.ui.Cells.c2[]) obj);
                return;
            case 14:
                rv0 rv0Var = (rv0) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                rv0Var.getClass();
                ArrayList arrayList10 = new ArrayList();
                arrayList10.add(user);
                ProfileActivity profileActivity = rv0Var.f51808b;
                RectF rectF = ProfileActivity.Z6;
                profileActivity.getContactsController().i(arrayList10, true);
                if (user != null) {
                    user.contact = false;
                    profileActivity.H5(false, false);
                    return;
                }
                return;
            case 17:
                b21 b21Var = (b21) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                if (T != null) {
                    b21Var.dismiss();
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    z6 z6Var = new z6(b21Var, user2, twoStepVerificationActivity, 20);
                    twoStepVerificationActivity.f43872a0 = 0;
                    twoStepVerificationActivity.f43876c0 = z6Var;
                    T.presentFragment(twoStepVerificationActivity);
                    return;
                }
                return;
            case 18:
                ThemeActivity.c0((ThemeActivity) obj2, (b31) obj);
                return;
            case 21:
                g61 g61Var = (g61) obj2;
                org.telegram.ui.ActionBar.m6 m6Var = (org.telegram.ui.ActionBar.m6) obj;
                g61Var.getClass();
                org.telegram.messenger.mp u13 = org.telegram.messenger.mp.u1(m6Var.F);
                if (m6Var == org.telegram.ui.ActionBar.n6.J) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                u13.G4(m6Var, null, z10, true);
                HashMap hashMap = org.telegram.ui.ActionBar.n6.H;
                if (m6Var.f29251b == null) {
                    z11 = false;
                } else {
                    if (org.telegram.ui.ActionBar.n6.I == m6Var) {
                        org.telegram.ui.ActionBar.n6.u(org.telegram.ui.ActionBar.n6.L, true, false);
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (m6Var == org.telegram.ui.ActionBar.n6.J) {
                        org.telegram.ui.ActionBar.n6.J = (org.telegram.ui.ActionBar.m6) hashMap.get("Dark Blue");
                    }
                    m6Var.t();
                    org.telegram.ui.ActionBar.n6.G.remove(m6Var);
                    hashMap.remove(m6Var.f29249a);
                    org.telegram.ui.ActionBar.e6 e6Var = m6Var.f29263j0;
                    if (e6Var != null) {
                        org.telegram.ui.ActionBar.e6.a(e6Var);
                    }
                    org.telegram.ui.ActionBar.n6.F.remove(m6Var);
                    new File(m6Var.f29251b).delete();
                    org.telegram.ui.ActionBar.n6.y1(true, false);
                }
                if (z11) {
                    s4Var = ((org.telegram.ui.ActionBar.h2) g61Var.f47948e).parentLayout;
                    ((ActionBarLayout) s4Var).X(true, true);
                }
                org.telegram.messenger.ks.e().k(267, new Object[0]);
                return;
            case 25:
                bb1.b0((bb1) obj2, (byte[]) obj);
                return;
            case 26:
                hc1 hc1Var = (hc1) obj2;
                ((boolean[]) obj)[0] = true;
                hc1Var.f48363p0 = 17;
                Intent intent = new Intent(hc1Var.f48335b, VoIPService.class);
                intent.putExtra("user_id", hc1Var.d.f28554id);
                intent.putExtra("is_outgoing", true);
                intent.putExtra("start_incall_activity", false);
                intent.putExtra("video_call", false);
                intent.putExtra("can_video_call", false);
                intent.putExtra("account", hc1Var.f48332a);
                try {
                    hc1Var.f48335b.startService(intent);
                    return;
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                    return;
                }
            case 27:
                org.telegram.ui.Wallet.d9 d9Var = (org.telegram.ui.Wallet.d9) obj2;
                d9Var.getClass();
                u1Var.dismiss();
                org.telegram.ui.Wallet.u8 u8Var = new org.telegram.ui.Wallet.u8();
                u8Var.f45143r = !((Boolean) obj).booleanValue();
                d9Var.presentFragment(u8Var);
                return;
            case 28:
                ((Runnable) obj2).run();
                ((org.telegram.ui.ActionBar.x2) obj).dismiss();
                return;
        }
    }

    @Override
    public void k(th0 th0Var) {
        ea1 ea1Var = ((ba1) this.f45613b).f45807a;
        ea1Var.f47192e.add(Integer.valueOf(((TLRPC.TL_forumTopic) this.f45614c).f28457id));
        ea1Var.a0();
    }

    @Override
    public Object m(Object obj) {
        ts0 ts0Var = (ts0) this.f45614c;
        Void r10 = (Void) obj;
        PremiumPreviewFragment premiumPreviewFragment = ((us0) this.f45613b).d.f52855n;
        premiumPreviewFragment.f43439o0.d(0, 0.0f, 0, ts0Var.getMeasuredWidth(), -ts0Var.getTier().h, premiumPreviewFragment.P);
        return premiumPreviewFragment.f43439o0.f58606f;
    }

    public aj0(hr0 hr0Var, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, ArrayList arrayList) {
        this.f45612a = 9;
        this.f45613b = hr0Var;
        this.f45614c = tL_messageMediaPoll;
    }

    @Override
    public void a0() {
    }

    @Override
    public void s0(View view, float f10, float f11) {
    }
}
