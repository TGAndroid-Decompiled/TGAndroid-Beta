package org.telegram.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.tasks.OnSuccessListener;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class gn0 implements org.telegram.ui.ActionBar.a2, FileLoader.FileResolver, org.telegram.ui.Components.e5, GenericProvider, MediaDataController.KeywordResultCallback, org.telegram.ui.Components.xl0, org.telegram.ui.Components.yl0, gv0, MessagesStorage.BooleanCallback, a11, OnSuccessListener {
    public final int f37245a;
    public final Object f37246b;
    public final Object f37247c;

    public gn0(int i10, Object obj, Object obj2) {
        this.f37245a = i10;
        this.f37246b = obj;
        this.f37247c = obj2;
    }

    @Override
    public void C(int i10, int i11, boolean z10) {
        switch (this.f37245a) {
            case 5:
                hv0 hv0Var = ((zu0) this.f37246b).f43830a;
                hv0Var.f37669e0.b((TLRPC.TL_messageMediaToDo) this.f37247c);
                hv0Var.finishFragment();
                return;
            default:
                hv0 hv0Var2 = ((zu0) this.f37246b).f43830a;
                hv0Var2.f37669e0.b((TLRPC.TL_messageMediaPoll) this.f37247c);
                hv0Var2.finishFragment();
                return;
        }
    }

    @Override
    public boolean P0(View view) {
        return false;
    }

    @Override
    public boolean a(int i10, View view) {
        String str;
        final wa1 wa1Var = (wa1) this.f37246b;
        final ya1 ya1Var = (ya1) this.f37247c;
        ThemeActivity themeActivity = wa1Var.e;
        if (i10 >= 0 && i10 < ya1Var.e.size()) {
            final org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) ya1Var.e.get(i10);
            if (f6Var.f20835a >= 100 && !f6Var.f20856z) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                String string = LocaleController.getString("OpenInEditor", R.string.OpenInEditor);
                String string2 = LocaleController.getString("ShareTheme", R.string.ShareTheme);
                TLRPC.TL_theme tL_theme = f6Var.f20849r;
                if (tL_theme != null && tL_theme.creator) {
                    str = LocaleController.getString("ThemeSetUrl", R.string.ThemeSetUrl);
                } else {
                    str = null;
                }
                CharSequence[] charSequenceArr = {string, string2, str, LocaleController.getString("DeleteTheme", R.string.DeleteTheme)};
                int[] iArr = {R.drawable.msg_edit, R.drawable.msg_share, R.drawable.msg_link, R.drawable.msg_delete};
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i11) {
                        wa1 wa1Var2 = wa1.this;
                        ThemeActivity themeActivity2 = wa1Var2.e;
                        if (themeActivity2.getParentActivity() != null) {
                            org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                            int i12 = 2;
                            if (i11 == 0) {
                                if (i11 != 1) {
                                    i12 = 1;
                                }
                                org.telegram.ui.Components.f5.V(themeActivity2, i12, f6Var2.f20836b, f6Var2);
                            } else if (i11 == 1) {
                                if (f6Var2.f20849r == null) {
                                    themeActivity2.getMessagesController().saveThemeToServer(f6Var2.f20836b, f6Var2);
                                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, f6Var2.f20836b, f6Var2);
                                    return;
                                }
                                String str2 = "https://" + themeActivity2.getMessagesController().linkPrefix + "/addtheme/" + f6Var2.f20849r.slug;
                                themeActivity2.showDialog(new org.telegram.ui.Components.dr0(themeActivity2.getParentActivity(), null, str2, false, str2, false, null));
                            } else if (i11 == 2) {
                                themeActivity2.presentFragment(new qc1(f6Var2.f20836b, f6Var2, false));
                            } else if (i11 == 3 && themeActivity2.getParentActivity() != null) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(themeActivity2.getParentActivity());
                                String string3 = LocaleController.getString("DeleteThemeTitle", R.string.DeleteThemeTitle);
                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder2.f20608a;
                                b2Var.R = string3;
                                b2Var.T = LocaleController.getString("DeleteThemeAlert", R.string.DeleteThemeAlert);
                                alertDialog$Builder2.k(LocaleController.getString("Delete", R.string.Delete), new e7(wa1Var2, ya1Var, f6Var2, 22));
                                alertDialog$Builder2.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                                themeActivity2.showDialog(b2Var);
                                TextView textView = (TextView) b2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21231q7, false));
                                }
                            }
                        }
                    }
                };
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20608a;
                b2Var.P = charSequenceArr;
                b2Var.Q = iArr;
                b2Var.M = onClickListener;
                themeActivity.showDialog(b2Var);
                b2Var.l(b2Var.N0.size() - 1, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21231q7, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21214p7, false));
                return true;
            }
        }
        return false;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia) {
        ad1 ad1Var = (ad1) this.f37246b;
        sn snVar = (sn) this.f37247c;
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.MessageMedia messageMedia2 = ad1Var.G.messageOwner.media;
            if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                ((TLRPC.TL_messageMediaToDo) messageMedia).completions = ((TLRPC.TL_messageMediaToDo) messageMedia2).completions;
            }
        }
        ad1Var.G.messageOwner.media = messageMedia;
        snVar.getSendMessagesHelper().editMessage(ad1Var.G, null, null, null, null, null, null, false, false, null);
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        ThemeActivity.W((ThemeActivity) this.f37246b, (Context) this.f37247c, view, i10, f7);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        ArrayList arrayList;
        TLRPC.EncryptedChat encryptedChat;
        boolean z10;
        boolean z11;
        org.telegram.ui.ActionBar.d5 d5Var;
        switch (this.f37245a) {
            case 0:
                go0 go0Var = (go0) this.f37246b;
                go0Var.f37257b0 = true;
                go0Var.f37254a0.email_unconfirmed_pattern = (String) this.f37247c;
                go0Var.J0();
                return;
            case 1:
            case 2:
            case 5:
            case 6:
            case 7:
            case 12:
            case 13:
            case 17:
            case 18:
            case 20:
            case 21:
            case 22:
            case 25:
            default:
                org.telegram.ui.Wallet.m0 m0Var = (org.telegram.ui.Wallet.m0) this.f37247c;
                pf.c g10 = b2Var.g(i10, true, true);
                g10.d();
                org.telegram.ui.Wallet.j8 j8Var = new org.telegram.ui.Wallet.j8((org.telegram.ui.Wallet.n8) this.f37246b, g10, 1);
                org.telegram.ui.Wallet.m0.F("disableBackupWithoutUpdatingPhrase");
                m0Var.j0(new e2.o0((Object) m0Var, (Object) new org.telegram.ui.Components.qy(26, m0Var, j8Var), true, false, 3));
                return;
            case 3:
                PhotoViewer.C(((as0) this.f37246b).f35512b, (ArrayList) this.f37247c);
                return;
            case 4:
                boolean[] zArr = (boolean[]) this.f37247c;
                PhotoViewer photoViewer = ((as0) this.f37246b).f35512b;
                ju0 ju0Var = photoViewer.d;
                ArrayList arrayList2 = photoViewer.f33242a7;
                ArrayList arrayList3 = photoViewer.f33271d7;
                ArrayList arrayList4 = photoViewer.Y6;
                ArrayList arrayList5 = photoViewer.e7;
                ArrayList arrayList6 = photoViewer.f7;
                if (!ju0Var.N()) {
                    photoViewer.G0(false, false);
                    return;
                } else if (!arrayList4.isEmpty()) {
                    int i11 = photoViewer.P4;
                    if (i11 >= 0 && i11 < arrayList4.size()) {
                        MessageObject messageObject = (MessageObject) arrayList4.get(photoViewer.P4);
                        if (messageObject.isSent()) {
                            photoViewer.G0(false, false);
                            ArrayList arrayList7 = new ArrayList();
                            int i12 = photoViewer.v;
                            if (i12 != 0) {
                                arrayList7.add(Integer.valueOf(i12));
                            } else {
                                arrayList7.add(Integer.valueOf(messageObject.getId()));
                            }
                            if (DialogObject.isEncryptedDialog(messageObject.getDialogId()) && messageObject.messageOwner.random_id != 0) {
                                ArrayList arrayList8 = new ArrayList();
                                arrayList8.add(Long.valueOf(messageObject.messageOwner.random_id));
                                encryptedChat = MessagesController.getInstance(photoViewer.T).getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(messageObject.getDialogId())));
                                arrayList = arrayList8;
                            } else {
                                arrayList = null;
                                encryptedChat = null;
                            }
                            MessagesController.getInstance(photoViewer.T).deleteMessages(arrayList7, arrayList, encryptedChat, messageObject.getDialogId(), messageObject.getQuickReplyId(), zArr[0], messageObject.getChatMode());
                            return;
                        }
                        return;
                    }
                    return;
                } else if (!arrayList6.isEmpty()) {
                    int i13 = photoViewer.P4;
                    if (i13 >= 0 && i13 < arrayList6.size()) {
                        TLRPC.Message message = (TLRPC.Message) arrayList3.get(photoViewer.P4);
                        if (message != null) {
                            ArrayList<Integer> arrayList9 = new ArrayList<>();
                            arrayList9.add(Integer.valueOf(message.f20300id));
                            MessagesController.getInstance(photoViewer.T).deleteMessages(arrayList9, null, null, MessageObject.getDialogId(message), message.quick_reply_shortcut_id, true, 0);
                            NotificationCenter.getInstance(photoViewer.T).lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
                        }
                        if (photoViewer.J1()) {
                            if (photoViewer.f33466z5 > 0) {
                                MessagesController.getInstance(photoViewer.T).deleteUserPhoto(null);
                            } else {
                                MessagesController.getInstance(photoViewer.T).changeChatAvatar(-photoViewer.f33466z5, null, null, null, null, 0.0d, null, null, null, null);
                            }
                            photoViewer.G0(false, false);
                            return;
                        }
                        TLRPC.Photo photo = (TLRPC.Photo) arrayList6.get(photoViewer.P4);
                        if (photo != null) {
                            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                            tL_inputPhoto.f20298id = photo.f20303id;
                            tL_inputPhoto.access_hash = photo.access_hash;
                            byte[] bArr = photo.file_reference;
                            tL_inputPhoto.file_reference = bArr;
                            if (bArr == null) {
                                tL_inputPhoto.file_reference = new byte[0];
                            }
                            if (photoViewer.f33466z5 > 0) {
                                MessagesController.getInstance(photoViewer.T).deleteUserPhoto(tL_inputPhoto);
                            }
                            MessagesStorage.getInstance(photoViewer.T).clearUserPhoto(photoViewer.f33466z5, photo.f20303id);
                            arrayList2.remove(photoViewer.P4);
                            photoViewer.f33262c7.remove(photoViewer.P4);
                            photoViewer.f33252b7.remove(photoViewer.P4);
                            arrayList3.remove(photoViewer.P4);
                            arrayList6.remove(photoViewer.P4);
                            if (arrayList2.isEmpty()) {
                                photoViewer.G0(false, false);
                            } else {
                                int i14 = photoViewer.P4;
                                if (i14 >= arrayList6.size()) {
                                    i14 = arrayList6.size() - 1;
                                }
                                photoViewer.P4 = -1;
                                photoViewer.B2(i14);
                            }
                            if (message == null) {
                                NotificationCenter.getInstance(photoViewer.T).lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
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
                        photoViewer.G0(false, false);
                        return;
                    }
                    int i15 = photoViewer.P4;
                    if (i15 >= arrayList5.size()) {
                        i15 = arrayList5.size() - 1;
                    }
                    photoViewer.P4 = -1;
                    photoViewer.B2(i15);
                    return;
                } else {
                    return;
                }
            case 8:
                ((PrivacyControlActivity) this.f37246b).t0();
                ((SharedPreferences) this.f37247c).edit().putBoolean("privacyAlertShowed", true).commit();
                return;
            case 9:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f37246b;
                TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
                boolean[] zArr2 = privacySettingsActivity.Z;
                tL_payments_clearSavedInfo.credentials = zArr2[1];
                tL_payments_clearSavedInfo.info = zArr2[0];
                privacySettingsActivity.getUserConfig().tmpPassword = null;
                privacySettingsActivity.getUserConfig().saveConfig(false);
                privacySettingsActivity.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new z40(21, privacySettingsActivity, (org.telegram.ui.Cells.v8) this.f37247c));
                return;
            case 10:
                ProfileActivity.l0((ProfileActivity) this.f37246b, (org.telegram.ui.Cells.a2[]) this.f37247c);
                return;
            case 11:
                lz0 lz0Var = (lz0) this.f37246b;
                TLRPC.User user = (TLRPC.User) this.f37247c;
                lz0Var.getClass();
                ArrayList<TLRPC.User> arrayList10 = new ArrayList<>();
                arrayList10.add(user);
                ProfileActivity profileActivity = lz0Var.f38990b;
                profileActivity.getContactsController().deleteContact(arrayList10, true);
                if (user != null) {
                    user.contact = false;
                    profileActivity.e5(false, false);
                    return;
                }
                return;
            case 14:
                j61 j61Var = (j61) this.f37246b;
                TLRPC.User user2 = (TLRPC.User) this.f37247c;
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    j61Var.dismiss();
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    e7 e7Var = new e7(j61Var, user2, twoStepVerificationActivity, 20);
                    twoStepVerificationActivity.Z = 0;
                    twoStepVerificationActivity.f33931b0 = e7Var;
                    U.presentFragment(twoStepVerificationActivity);
                    return;
                }
                return;
            case 15:
                z91.n((z91) this.f37246b, (ey) this.f37247c);
                return;
            case 16:
                ThemeActivity.X((ThemeActivity) this.f37246b, (m71) this.f37247c);
                return;
            case 19:
                wa1 wa1Var = (wa1) this.f37246b;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.f37247c;
                wa1Var.getClass();
                MessagesController messagesController = MessagesController.getInstance(g6Var.E);
                if (g6Var == org.telegram.ui.ActionBar.h6.J) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                messagesController.saveTheme(g6Var, null, z10, true);
                HashMap hashMap = org.telegram.ui.ActionBar.h6.H;
                if (g6Var.f20886b == null) {
                    z11 = false;
                } else {
                    if (org.telegram.ui.ActionBar.h6.I == g6Var) {
                        org.telegram.ui.ActionBar.h6.t(org.telegram.ui.ActionBar.h6.L, true, false);
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (g6Var == org.telegram.ui.ActionBar.h6.J) {
                        org.telegram.ui.ActionBar.h6.J = (org.telegram.ui.ActionBar.g6) hashMap.get("Dark Blue");
                    }
                    g6Var.t();
                    org.telegram.ui.ActionBar.h6.G.remove(g6Var);
                    hashMap.remove(g6Var.f20884a);
                    org.telegram.ui.ActionBar.a6 a6Var = g6Var.f20896i0;
                    if (a6Var != null) {
                        org.telegram.ui.ActionBar.a6.a(a6Var);
                    }
                    org.telegram.ui.ActionBar.h6.F.remove(g6Var);
                    new File(g6Var.f20886b).delete();
                    org.telegram.ui.ActionBar.h6.t1(true, false);
                }
                if (z11) {
                    d5Var = ((org.telegram.ui.ActionBar.n2) wa1Var.e).parentLayout;
                    ((ActionBarLayout) d5Var).U(true, true);
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeListUpdated, new Object[0]);
                return;
            case 23:
                xf1.W((xf1) this.f37246b, (byte[]) this.f37247c);
                return;
            case 24:
                jh1 jh1Var = (jh1) this.f37246b;
                jh1Var.getClass();
                ((boolean[]) this.f37247c)[0] = true;
                jh1Var.f38219p0 = 17;
                Intent intent = new Intent(jh1Var.f38191b, VoIPService.class);
                intent.putExtra("user_id", jh1Var.d.f20426id);
                intent.putExtra("is_outgoing", true);
                intent.putExtra("start_incall_activity", false);
                intent.putExtra("video_call", false);
                intent.putExtra("can_video_call", false);
                intent.putExtra("account", jh1Var.f38188a);
                try {
                    jh1Var.f38191b.startService(intent);
                    return;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    return;
                }
            case 26:
                org.telegram.ui.Wallet.n8 n8Var = (org.telegram.ui.Wallet.n8) this.f37246b;
                n8Var.getClass();
                b2Var.dismiss();
                org.telegram.ui.Wallet.c8 c8Var = new org.telegram.ui.Wallet.c8();
                c8Var.f34105r = !((Boolean) this.f37247c).booleanValue();
                n8Var.presentFragment(c8Var);
                return;
            case 27:
                ((Runnable) this.f37246b).run();
                ((org.telegram.ui.ActionBar.f3) this.f37247c).dismiss();
                return;
        }
    }

    @Override
    public File getFile() {
        switch (this.f37245a) {
            case 1:
                return FileLoader.getInstance(((PhotoViewer) this.f37246b).T).getPathToAttach((TLObject) this.f37247c, true);
            default:
                return FileLoader.getInstance(((PhotoViewer) this.f37246b).T).getPathToMessage((TLRPC.Message) this.f37247c);
        }
    }

    @Override
    public void onSuccess(Object obj) {
        Integer num = (Integer) obj;
        FileLog.d("wear-auth: /token delivered to " + ((String) ((com.google.android.gms.internal.cast.z5) this.f37246b).f6883a));
        ((ei.d) this.f37247c).setLoading(false);
        ai1.d = null;
        org.telegram.ui.ActionBar.f3 f3Var = ai1.f35471c;
        if (f3Var != null) {
            f3Var.dismiss();
            ai1.f35471c = null;
        }
    }

    @Override
    public Object provide(Object obj) {
        nw0 nw0Var = (nw0) this.f37247c;
        Void r10 = (Void) obj;
        PremiumPreviewFragment premiumPreviewFragment = ((ow0) this.f37246b).d.f40258n;
        premiumPreviewFragment.f33509n0.d(0, 0.0f, 0, nw0Var.getMeasuredWidth(), -nw0Var.getTier().h, premiumPreviewFragment.O);
        return premiumPreviewFragment.f33509n0.f46544f;
    }

    @Override
    public void r(gk0 gk0Var) {
        ze1 ze1Var = ((we1) this.f37246b).f42526a;
        ze1Var.e.add(Integer.valueOf(((TLRPC.TL_forumTopic) this.f37247c).f20331id));
        ze1Var.V();
    }

    @Override
    public void run(boolean z10) {
        TLRPC.Chat chat = (TLRPC.Chat) this.f37247c;
        te1 te1Var = ((de1) this.f37246b).f36203b;
        NotificationCenter notificationCenter = te1Var.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(te1Var, i10);
        te1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        te1Var.finishFragment();
        te1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-chat.f20279id), null, chat, Boolean.valueOf(z10));
    }

    public gn0(zu0 zu0Var, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, ArrayList arrayList) {
        this.f37245a = 6;
        this.f37246b = zu0Var;
        this.f37247c = tL_messageMediaPoll;
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.f37246b;
        Runnable runnable = (Runnable) this.f37247c;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            try {
                if (!((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.startsWith("animated_")) {
                    String fixEmoji = Emoji.fixEmoji(((MediaDataController.KeywordResult) arrayList.get(i10)).emoji);
                    if (Emoji.getEmojiDrawable(fixEmoji) != null) {
                        linkedHashSet.add(fixEmoji);
                    }
                }
            } catch (Exception unused) {
            }
        }
        runnable.run();
    }

    @Override
    public void O() {
    }

    @Override
    public void a0(View view, float f7, float f10) {
    }
}
