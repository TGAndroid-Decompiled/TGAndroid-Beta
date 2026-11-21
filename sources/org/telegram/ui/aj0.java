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
public final class aj0 implements org.telegram.ui.ActionBar.q1, ts, org.telegram.ui.Components.a5, org.telegram.messenger.i9, org.telegram.messenger.oi, org.telegram.ui.Components.rj0, org.telegram.ui.Components.sj0, or0, org.telegram.messenger.lr, ix0 {
    public final int f45638a;
    public final Object f45639b;
    public final Object f45640c;

    public aj0(int i7, Object obj, Object obj2) {
        this.f45638a = i7;
        this.f45639b = obj;
        this.f45640c = obj2;
    }

    @Override
    public void O(int i7, int i10, boolean z10) {
        switch (this.f45638a) {
            case 8:
                pr0 pr0Var = ((hr0) this.f45639b).f48514a;
                pr0Var.f50939f0.a((TLRPC.TL_messageMediaToDo) this.f45640c);
                pr0Var.finishFragment();
                return;
            default:
                pr0 pr0Var2 = ((hr0) this.f45639b).f48514a;
                pr0Var2.f50939f0.a((TLRPC.TL_messageMediaPoll) this.f45640c);
                pr0Var2.finishFragment();
                return;
        }
    }

    @Override
    public void a(TLRPC.MessageMedia messageMedia) {
        i81 i81Var = (i81) this.f45639b;
        bn bnVar = (bn) this.f45640c;
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.MessageMedia messageMedia2 = i81Var.H.f23993k.media;
            if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                ((TLRPC.TL_messageMediaToDo) messageMedia).completions = ((TLRPC.TL_messageMediaToDo) messageMedia2).completions;
            }
        }
        i81Var.H.f23993k.media = messageMedia;
        bnVar.getSendMessagesHelper().t(i81Var.H, null, null, null, null, null, null, null, false, false, null);
    }

    @Override
    public void b(ps psVar) {
        hk0 hk0Var = (hk0) this.f45639b;
        int intValue = ((Integer) ((View) this.f45640c).getTag()).intValue();
        EditTextBoldCursor editTextBoldCursor = hk0Var.Z[intValue];
        if (intValue == 5) {
            hk0Var.f48452s = psVar.d;
        } else {
            hk0Var.f48461w = psVar.d;
        }
        editTextBoldCursor.setText(psVar.f50965a);
    }

    @Override
    public boolean b1(View view) {
        return false;
    }

    @Override
    public boolean c(int i7, View view) {
        String str;
        final g61 g61Var = (g61) this.f45639b;
        final i61 i61Var = (i61) this.f45640c;
        ThemeActivity themeActivity = g61Var.f47982e;
        if (i7 >= 0 && i7 < i61Var.f48585e.size()) {
            final org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) i61Var.f48585e.get(i7);
            if (j6Var.f29093a >= 100 && !j6Var.f29115z) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                String N0 = org.telegram.messenger.gd.N0(2131747603, "OpenInEditor");
                String N02 = org.telegram.messenger.gd.N0(2131745230, "ShareTheme");
                TLRPC.TL_theme tL_theme = j6Var.f29108r;
                if (tL_theme != null && tL_theme.creator) {
                    str = org.telegram.messenger.gd.N0(2131743904, "ThemeSetUrl");
                } else {
                    str = null;
                }
                CharSequence[] charSequenceArr = {N0, N02, str, org.telegram.messenger.gd.N0(2131751474, "DeleteTheme")};
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        g61 g61Var2 = g61.this;
                        ThemeActivity themeActivity2 = g61Var2.f47982e;
                        if (themeActivity2.getParentActivity() != null) {
                            org.telegram.ui.ActionBar.j6 j6Var2 = j6Var;
                            int i11 = 2;
                            if (i10 == 0) {
                                if (i10 != 1) {
                                    i11 = 1;
                                }
                                org.telegram.ui.Components.c5.T(themeActivity2, i11, j6Var2.f29094b, j6Var2);
                            } else if (i10 == 1) {
                                if (j6Var2.f29108r == null) {
                                    themeActivity2.getMessagesController().H4(j6Var2.f29094b, j6Var2);
                                    org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.f25236v4, j6Var2.f29094b, j6Var2);
                                    return;
                                }
                                String str2 = "https://" + themeActivity2.getMessagesController().X2 + "/addtheme/" + j6Var2.f29108r.slug;
                                themeActivity2.showDialog(new org.telegram.ui.Components.ap0(themeActivity2.getParentActivity(), null, str2, false, str2, false, null));
                            } else if (i10 == 2) {
                                themeActivity2.presentFragment(new a81(j6Var2.f29094b, j6Var2, false));
                            } else if (i10 == 3 && themeActivity2.getParentActivity() != null) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(themeActivity2.getParentActivity());
                                String N03 = org.telegram.messenger.gd.N0(2131751472, "DeleteThemeTitle");
                                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder2.f28774a;
                                t1Var.S = N03;
                                t1Var.U = org.telegram.messenger.gd.N0(2131751473, "DeleteThemeAlert");
                                alertDialog$Builder2.k(org.telegram.messenger.gd.N0(2131751586, "Delete"), new z6(g61Var2, i61Var, j6Var2, 22));
                                alertDialog$Builder2.h(org.telegram.messenger.gd.N0(2131752577, "Cancel"), null);
                                themeActivity2.showDialog(t1Var);
                                TextView textView = (TextView) t1Var.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29619q7, null);
                                }
                            }
                        }
                    }
                };
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28774a;
                t1Var.Q = charSequenceArr;
                t1Var.R = new int[]{2131232118, 2131232365, 2131232205, 2131232110};
                t1Var.N = onClickListener;
                themeActivity.showDialog(t1Var);
                t1Var.m(t1Var.O0.size() - 1, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29619q7, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29599p7, false));
                return true;
            }
        }
        return false;
    }

    @Override
    public void d(boolean z10) {
        TLRPC.Chat chat = (TLRPC.Chat) this.f45640c;
        y91 y91Var = ((j91) this.f45639b).f48941b;
        org.telegram.messenger.ks notificationCenter = y91Var.getNotificationCenter();
        int i7 = org.telegram.messenger.ks.f25218t;
        notificationCenter.n(y91Var, i7);
        y91Var.getNotificationCenter().k(i7, new Object[0]);
        y91Var.finishFragment();
        y91Var.getNotificationCenter().k(org.telegram.messenger.ks.K2, Long.valueOf(-chat.f28431id), null, chat, Boolean.valueOf(z10));
    }

    @Override
    public void e(String str, ArrayList arrayList) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.f45639b;
        Runnable runnable = (Runnable) this.f45640c;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            try {
                if (!((org.telegram.messenger.ni) arrayList.get(i7)).f25955a.startsWith("animated_")) {
                    String c10 = org.telegram.messenger.j6.c(((org.telegram.messenger.ni) arrayList.get(i7)).f25955a);
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
        ThemeActivity.b0((ThemeActivity) this.f45639b, (Context) this.f45640c, view, i7, f10);
    }

    public File g() {
        switch (this.f45638a) {
            case 4:
                org.telegram.messenger.w7.G(((PhotoViewer) this.f45639b).U);
                return org.telegram.messenger.w7.J((TLObject) this.f45640c, null, true, true);
            default:
                org.telegram.messenger.w7.G(((PhotoViewer) this.f45639b).U);
                return org.telegram.messenger.w7.M((TLRPC.Message) this.f45640c, false, true);
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        ArrayList arrayList;
        TLRPC.EncryptedChat encryptedChat;
        int i10;
        boolean z10;
        boolean z11;
        org.telegram.ui.ActionBar.r4 r4Var;
        int i11 = this.f45638a;
        int i12 = 0;
        Object obj = this.f45640c;
        Object obj2 = this.f45639b;
        switch (i11) {
            case 0:
                int[] iArr = ((hk0) obj2).f48467y;
                iArr[2] = 0;
                iArr[1] = 0;
                iArr[0] = 0;
                ((EditTextBoldCursor) obj).setText(org.telegram.messenger.gd.N0(2131747300, null));
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
                vf.b h = t1Var.h(i7, true, true);
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
                ml0Var.f49901c0 = true;
                ml0Var.f49898b0.email_unconfirmed_pattern = (String) obj;
                ml0Var.P0();
                return;
            case 6:
                PhotoViewer.u(((ro0) obj2).f51685b, (ArrayList) obj);
                return;
            case 7:
                boolean[] zArr = (boolean[]) obj;
                PhotoViewer photoViewer = ((ro0) obj2).f51685b;
                uq0 uq0Var = photoViewer.d;
                ArrayList arrayList2 = photoViewer.f43208a7;
                ArrayList arrayList3 = photoViewer.f43236d7;
                ArrayList arrayList4 = photoViewer.Y6;
                ArrayList arrayList5 = photoViewer.f43246e7;
                ArrayList arrayList6 = photoViewer.f43256f7;
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
                            int i14 = photoViewer.f43396w;
                            if (i14 != 0) {
                                arrayList7.add(Integer.valueOf(i14));
                            } else {
                                arrayList7.add(Integer.valueOf(fjVar.e1()));
                            }
                            if (org.telegram.messenger.n5.C(org.telegram.messenger.fj.B0(fjVar.f23993k)) && fjVar.f23993k.random_id != 0) {
                                ArrayList arrayList8 = new ArrayList();
                                arrayList8.add(Long.valueOf(fjVar.f23993k.random_id));
                                arrayList = arrayList8;
                                encryptedChat = org.telegram.messenger.mp.u1(photoViewer.U).c1(Integer.valueOf((int) (org.telegram.messenger.fj.B0(fjVar.f23993k) & 4294967295L)));
                            } else {
                                arrayList = null;
                                encryptedChat = null;
                            }
                            org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(photoViewer.U);
                            long B0 = org.telegram.messenger.fj.B0(fjVar.f23993k);
                            int I1 = org.telegram.messenger.fj.I1(fjVar.f23993k);
                            boolean z12 = zArr[0];
                            if (fjVar.f24022r1) {
                                i10 = 1;
                            } else {
                                if (org.telegram.messenger.fj.d5(fjVar.f23993k)) {
                                    i12 = 9;
                                } else if (org.telegram.messenger.fj.b4(fjVar.f23993k)) {
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
                            arrayList9.add(Integer.valueOf(message.f28452id));
                            org.telegram.messenger.mp.u1(photoViewer.U).Z(arrayList9, null, null, org.telegram.messenger.fj.B0(message), message.quick_reply_shortcut_id, true, 0);
                            org.telegram.messenger.ks.f(photoViewer.U).k(39, new Object[0]);
                        }
                        if (photoViewer.G1()) {
                            if (photoViewer.f43431z5 > 0) {
                                org.telegram.messenger.mp.u1(photoViewer.U).l0(null);
                            } else {
                                org.telegram.messenger.mp.u1(photoViewer.U).B(-photoViewer.f43431z5, null, null, null, null, 0.0d, null, null, null, null);
                            }
                            photoViewer.z0(false, false);
                            return;
                        }
                        TLRPC.Photo photo = (TLRPC.Photo) arrayList6.get(photoViewer.P4);
                        if (photo != null) {
                            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                            tL_inputPhoto.f28450id = photo.f28455id;
                            tL_inputPhoto.access_hash = photo.access_hash;
                            byte[] bArr = photo.file_reference;
                            tL_inputPhoto.file_reference = bArr;
                            if (bArr == null) {
                                tL_inputPhoto.file_reference = new byte[0];
                            }
                            if (photoViewer.f43431z5 > 0) {
                                org.telegram.messenger.mp.u1(photoViewer.U).l0(tL_inputPhoto);
                            }
                            org.telegram.messenger.tr a02 = org.telegram.messenger.tr.a0(photoViewer.U);
                            a02.f27080a.c(new org.telegram.messenger.np(4, photoViewer.f43431z5, photo.f28455id, a02));
                            arrayList2.remove(photoViewer.P4);
                            photoViewer.f43228c7.remove(photoViewer.P4);
                            photoViewer.f43218b7.remove(photoViewer.P4);
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
                boolean[] zArr2 = privacySettingsActivity.f43534a0;
                tL_payments_clearSavedInfo.credentials = zArr2[1];
                tL_payments_clearSavedInfo.info = zArr2[0];
                privacySettingsActivity.getUserConfig().f24828y = null;
                privacySettingsActivity.getUserConfig().v(false);
                privacySettingsActivity.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new e00(22, privacySettingsActivity, (org.telegram.ui.Cells.s8) obj));
                return;
            case 13:
                ProfileActivity.p0((ProfileActivity) obj2, (org.telegram.ui.Cells.d2[]) obj);
                return;
            case 14:
                rv0 rv0Var = (rv0) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                rv0Var.getClass();
                ArrayList arrayList10 = new ArrayList();
                arrayList10.add(user);
                ProfileActivity profileActivity = rv0Var.f51772b;
                RectF rectF = ProfileActivity.Z6;
                profileActivity.getContactsController().i(arrayList10, true);
                if (user != null) {
                    user.contact = false;
                    profileActivity.H5(false, false);
                    return;
                }
                return;
            case 17:
                c21 c21Var = (c21) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (T != null) {
                    c21Var.dismiss();
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    z6 z6Var = new z6(c21Var, user2, twoStepVerificationActivity, 20);
                    twoStepVerificationActivity.f43913a0 = 0;
                    twoStepVerificationActivity.f43917c0 = z6Var;
                    T.presentFragment(twoStepVerificationActivity);
                    return;
                }
                return;
            case 18:
                ThemeActivity.c0((ThemeActivity) obj2, (mz0) obj);
                return;
            case 21:
                g61 g61Var = (g61) obj2;
                org.telegram.ui.ActionBar.l6 l6Var = (org.telegram.ui.ActionBar.l6) obj;
                g61Var.getClass();
                org.telegram.messenger.mp u13 = org.telegram.messenger.mp.u1(l6Var.F);
                if (l6Var == org.telegram.ui.ActionBar.m6.J) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                u13.G4(l6Var, null, z10, true);
                HashMap hashMap = org.telegram.ui.ActionBar.m6.H;
                if (l6Var.f29231b == null) {
                    z11 = false;
                } else {
                    if (org.telegram.ui.ActionBar.m6.I == l6Var) {
                        org.telegram.ui.ActionBar.m6.u(org.telegram.ui.ActionBar.m6.L, true, false);
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (l6Var == org.telegram.ui.ActionBar.m6.J) {
                        org.telegram.ui.ActionBar.m6.J = (org.telegram.ui.ActionBar.l6) hashMap.get("Dark Blue");
                    }
                    l6Var.t();
                    org.telegram.ui.ActionBar.m6.G.remove(l6Var);
                    hashMap.remove(l6Var.f29229a);
                    org.telegram.ui.ActionBar.d6 d6Var = l6Var.f29243j0;
                    if (d6Var != null) {
                        org.telegram.ui.ActionBar.d6.a(d6Var);
                    }
                    org.telegram.ui.ActionBar.m6.F.remove(l6Var);
                    new File(l6Var.f29231b).delete();
                    org.telegram.ui.ActionBar.m6.y1(true, false);
                }
                if (z11) {
                    r4Var = ((org.telegram.ui.ActionBar.g2) g61Var.f47982e).parentLayout;
                    ((ActionBarLayout) r4Var).X(true, true);
                }
                org.telegram.messenger.ks.e().k(268, new Object[0]);
                return;
            case 25:
                bb1.b0((bb1) obj2, (byte[]) obj);
                return;
            case 26:
                hc1 hc1Var = (hc1) obj2;
                ((boolean[]) obj)[0] = true;
                hc1Var.f48357p0 = 17;
                Intent intent = new Intent(hc1Var.f48329b, VoIPService.class);
                intent.putExtra("user_id", hc1Var.d.f28580id);
                intent.putExtra("is_outgoing", true);
                intent.putExtra("start_incall_activity", false);
                intent.putExtra("video_call", false);
                intent.putExtra("can_video_call", false);
                intent.putExtra("account", hc1Var.f48326a);
                try {
                    hc1Var.f48329b.startService(intent);
                    return;
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                    return;
                }
            case 27:
                org.telegram.ui.Wallet.d9 d9Var = (org.telegram.ui.Wallet.d9) obj2;
                d9Var.getClass();
                t1Var.dismiss();
                org.telegram.ui.Wallet.u8 u8Var = new org.telegram.ui.Wallet.u8();
                u8Var.f45184r = !((Boolean) obj).booleanValue();
                d9Var.presentFragment(u8Var);
                return;
            case 28:
                ((Runnable) obj2).run();
                ((org.telegram.ui.ActionBar.w2) obj).dismiss();
                return;
        }
    }

    @Override
    public void k(uh0 uh0Var) {
        ea1 ea1Var = ((ba1) this.f45639b).f45826a;
        ea1Var.f47217e.add(Integer.valueOf(((TLRPC.TL_forumTopic) this.f45640c).f28483id));
        ea1Var.a0();
    }

    @Override
    public Object m(Object obj) {
        ts0 ts0Var = (ts0) this.f45640c;
        Void r10 = (Void) obj;
        PremiumPreviewFragment premiumPreviewFragment = ((us0) this.f45639b).d.f52886n;
        premiumPreviewFragment.f43480o0.d(0, 0.0f, 0, ts0Var.getMeasuredWidth(), -ts0Var.getTier().h, premiumPreviewFragment.P);
        return premiumPreviewFragment.f43480o0.f58643f;
    }

    public aj0(hr0 hr0Var, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, ArrayList arrayList) {
        this.f45638a = 9;
        this.f45639b = hr0Var;
        this.f45640c = tL_messageMediaPoll;
    }

    @Override
    public void a0() {
    }

    @Override
    public void s0(View view, float f10, float f11) {
    }
}
