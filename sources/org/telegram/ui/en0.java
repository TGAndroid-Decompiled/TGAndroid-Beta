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
public final class en0 implements org.telegram.ui.ActionBar.a2, FileLoader.FileResolver, org.telegram.ui.Components.e5, GenericProvider, MediaDataController.KeywordResultCallback, org.telegram.ui.Components.yl0, org.telegram.ui.Components.zl0, ev0, MessagesStorage.BooleanCallback, y01, OnSuccessListener {
    public final int f36691a;
    public final Object f36692b;
    public final Object f36693c;

    public en0(int i10, Object obj, Object obj2) {
        this.f36691a = i10;
        this.f36692b = obj;
        this.f36693c = obj2;
    }

    @Override
    public void C(int i10, int i11, boolean z10) {
        switch (this.f36691a) {
            case 5:
                fv0 fv0Var = ((xu0) this.f36692b).f43275a;
                fv0Var.f37105e0.b((TLRPC.TL_messageMediaToDo) this.f36693c);
                fv0Var.finishFragment();
                return;
            default:
                fv0 fv0Var2 = ((xu0) this.f36692b).f43275a;
                fv0Var2.f37105e0.b((TLRPC.TL_messageMediaPoll) this.f36693c);
                fv0Var2.finishFragment();
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
        final ua1 ua1Var = (ua1) this.f36692b;
        final wa1 wa1Var = (wa1) this.f36693c;
        ThemeActivity themeActivity = ua1Var.e;
        if (i10 >= 0 && i10 < wa1Var.e.size()) {
            final org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) wa1Var.e.get(i10);
            if (f6Var.f20832a >= 100 && !f6Var.f20853z) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                String string = LocaleController.getString("OpenInEditor", R.string.OpenInEditor);
                String string2 = LocaleController.getString("ShareTheme", R.string.ShareTheme);
                TLRPC.TL_theme tL_theme = f6Var.f20846r;
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
                        ua1 ua1Var2 = ua1.this;
                        ThemeActivity themeActivity2 = ua1Var2.e;
                        if (themeActivity2.getParentActivity() != null) {
                            org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                            int i12 = 2;
                            if (i11 == 0) {
                                if (i11 != 1) {
                                    i12 = 1;
                                }
                                org.telegram.ui.Components.f5.V(themeActivity2, i12, f6Var2.f20833b, f6Var2);
                            } else if (i11 == 1) {
                                if (f6Var2.f20846r == null) {
                                    themeActivity2.getMessagesController().saveThemeToServer(f6Var2.f20833b, f6Var2);
                                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, f6Var2.f20833b, f6Var2);
                                    return;
                                }
                                String str2 = "https://" + themeActivity2.getMessagesController().linkPrefix + "/addtheme/" + f6Var2.f20846r.slug;
                                themeActivity2.showDialog(new org.telegram.ui.Components.fr0(themeActivity2.getParentActivity(), null, str2, false, str2, false, null));
                            } else if (i11 == 2) {
                                themeActivity2.presentFragment(new oc1(f6Var2.f20833b, f6Var2, false));
                            } else if (i11 == 3 && themeActivity2.getParentActivity() != null) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(themeActivity2.getParentActivity());
                                String string3 = LocaleController.getString("DeleteThemeTitle", R.string.DeleteThemeTitle);
                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder2.f20605a;
                                b2Var.R = string3;
                                b2Var.T = LocaleController.getString("DeleteThemeAlert", R.string.DeleteThemeAlert);
                                alertDialog$Builder2.k(LocaleController.getString("Delete", R.string.Delete), new e7(ua1Var2, wa1Var, f6Var2, 22));
                                alertDialog$Builder2.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                                themeActivity2.showDialog(b2Var);
                                TextView textView = (TextView) b2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21228q7, false));
                                }
                            }
                        }
                    }
                };
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20605a;
                b2Var.P = charSequenceArr;
                b2Var.Q = iArr;
                b2Var.M = onClickListener;
                themeActivity.showDialog(b2Var);
                b2Var.m(b2Var.N0.size() - 1, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21228q7, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21211p7, false));
                return true;
            }
        }
        return false;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia) {
        yc1 yc1Var = (yc1) this.f36692b;
        qn qnVar = (qn) this.f36693c;
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.MessageMedia messageMedia2 = yc1Var.G.messageOwner.media;
            if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                ((TLRPC.TL_messageMediaToDo) messageMedia).completions = ((TLRPC.TL_messageMediaToDo) messageMedia2).completions;
            }
        }
        yc1Var.G.messageOwner.media = messageMedia;
        qnVar.getSendMessagesHelper().editMessage(yc1Var.G, null, null, null, null, null, null, false, false, null);
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        ThemeActivity.W((ThemeActivity) this.f36692b, (Context) this.f36693c, view, i10, f7);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        ArrayList arrayList;
        TLRPC.EncryptedChat encryptedChat;
        boolean z10;
        boolean z11;
        org.telegram.ui.ActionBar.d5 d5Var;
        switch (this.f36691a) {
            case 0:
                eo0 eo0Var = (eo0) this.f36692b;
                eo0Var.f36703b0 = true;
                eo0Var.f36700a0.email_unconfirmed_pattern = (String) this.f36693c;
                eo0Var.J0();
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
                org.telegram.ui.Wallet.m0 m0Var = (org.telegram.ui.Wallet.m0) this.f36693c;
                pf.c h = b2Var.h(i10, true, true);
                h.d();
                org.telegram.ui.Wallet.d8 d8Var = new org.telegram.ui.Wallet.d8((org.telegram.ui.Wallet.h8) this.f36692b, h, 1);
                org.telegram.ui.Wallet.m0.F("disableBackupWithoutUpdatingPhrase");
                m0Var.j0(new e2.o0((Object) m0Var, (Object) new org.telegram.ui.Components.qy(26, m0Var, d8Var), true, false, 3));
                return;
            case 3:
                PhotoViewer.D(((yr0) this.f36692b).f43544b, (ArrayList) this.f36693c);
                return;
            case 4:
                boolean[] zArr = (boolean[]) this.f36693c;
                PhotoViewer photoViewer = ((yr0) this.f36692b).f43544b;
                hu0 hu0Var = photoViewer.d;
                ArrayList arrayList2 = photoViewer.f33248a7;
                ArrayList arrayList3 = photoViewer.f33277d7;
                ArrayList arrayList4 = photoViewer.Y6;
                ArrayList arrayList5 = photoViewer.e7;
                ArrayList arrayList6 = photoViewer.f7;
                if (!hu0Var.N()) {
                    photoViewer.H0(false, false);
                    return;
                } else if (!arrayList4.isEmpty()) {
                    int i11 = photoViewer.P4;
                    if (i11 >= 0 && i11 < arrayList4.size()) {
                        MessageObject messageObject = (MessageObject) arrayList4.get(photoViewer.P4);
                        if (messageObject.isSent()) {
                            photoViewer.H0(false, false);
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
                            arrayList9.add(Integer.valueOf(message.f20297id));
                            MessagesController.getInstance(photoViewer.T).deleteMessages(arrayList9, null, null, MessageObject.getDialogId(message), message.quick_reply_shortcut_id, true, 0);
                            NotificationCenter.getInstance(photoViewer.T).lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
                        }
                        if (photoViewer.K1()) {
                            if (photoViewer.f33472z5 > 0) {
                                MessagesController.getInstance(photoViewer.T).deleteUserPhoto(null);
                            } else {
                                MessagesController.getInstance(photoViewer.T).changeChatAvatar(-photoViewer.f33472z5, null, null, null, null, 0.0d, null, null, null, null);
                            }
                            photoViewer.H0(false, false);
                            return;
                        }
                        TLRPC.Photo photo = (TLRPC.Photo) arrayList6.get(photoViewer.P4);
                        if (photo != null) {
                            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                            tL_inputPhoto.f20295id = photo.f20300id;
                            tL_inputPhoto.access_hash = photo.access_hash;
                            byte[] bArr = photo.file_reference;
                            tL_inputPhoto.file_reference = bArr;
                            if (bArr == null) {
                                tL_inputPhoto.file_reference = new byte[0];
                            }
                            if (photoViewer.f33472z5 > 0) {
                                MessagesController.getInstance(photoViewer.T).deleteUserPhoto(tL_inputPhoto);
                            }
                            MessagesStorage.getInstance(photoViewer.T).clearUserPhoto(photoViewer.f33472z5, photo.f20300id);
                            arrayList2.remove(photoViewer.P4);
                            photoViewer.f33268c7.remove(photoViewer.P4);
                            photoViewer.f33258b7.remove(photoViewer.P4);
                            arrayList3.remove(photoViewer.P4);
                            arrayList6.remove(photoViewer.P4);
                            if (arrayList2.isEmpty()) {
                                photoViewer.H0(false, false);
                            } else {
                                int i14 = photoViewer.P4;
                                if (i14 >= arrayList6.size()) {
                                    i14 = arrayList6.size() - 1;
                                }
                                photoViewer.P4 = -1;
                                photoViewer.D2(i14);
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
                        photoViewer.H0(false, false);
                        return;
                    }
                    int i15 = photoViewer.P4;
                    if (i15 >= arrayList5.size()) {
                        i15 = arrayList5.size() - 1;
                    }
                    photoViewer.P4 = -1;
                    photoViewer.D2(i15);
                    return;
                } else {
                    return;
                }
            case 8:
                ((PrivacyControlActivity) this.f36692b).t0();
                ((SharedPreferences) this.f36693c).edit().putBoolean("privacyAlertShowed", true).commit();
                return;
            case 9:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f36692b;
                TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
                boolean[] zArr2 = privacySettingsActivity.Z;
                tL_payments_clearSavedInfo.credentials = zArr2[1];
                tL_payments_clearSavedInfo.info = zArr2[0];
                privacySettingsActivity.getUserConfig().tmpPassword = null;
                privacySettingsActivity.getUserConfig().saveConfig(false);
                privacySettingsActivity.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new x40(21, privacySettingsActivity, (org.telegram.ui.Cells.v8) this.f36693c));
                return;
            case 10:
                ProfileActivity.l0((ProfileActivity) this.f36692b, (org.telegram.ui.Cells.a2[]) this.f36693c);
                return;
            case 11:
                jz0 jz0Var = (jz0) this.f36692b;
                TLRPC.User user = (TLRPC.User) this.f36693c;
                jz0Var.getClass();
                ArrayList<TLRPC.User> arrayList10 = new ArrayList<>();
                arrayList10.add(user);
                ProfileActivity profileActivity = jz0Var.f38380b;
                profileActivity.getContactsController().deleteContact(arrayList10, true);
                if (user != null) {
                    user.contact = false;
                    profileActivity.e5(false, false);
                    return;
                }
                return;
            case 14:
                h61 h61Var = (h61) this.f36692b;
                TLRPC.User user2 = (TLRPC.User) this.f36693c;
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    h61Var.dismiss();
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    e7 e7Var = new e7(h61Var, user2, twoStepVerificationActivity, 20);
                    twoStepVerificationActivity.Z = 0;
                    twoStepVerificationActivity.f33939b0 = e7Var;
                    U.presentFragment(twoStepVerificationActivity);
                    return;
                }
                return;
            case 15:
                x91.n((x91) this.f36692b, (cy) this.f36693c);
                return;
            case 16:
                ThemeActivity.X((ThemeActivity) this.f36692b, (k71) this.f36693c);
                return;
            case 19:
                ua1 ua1Var = (ua1) this.f36692b;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.f36693c;
                ua1Var.getClass();
                MessagesController messagesController = MessagesController.getInstance(g6Var.E);
                if (g6Var == org.telegram.ui.ActionBar.h6.J) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                messagesController.saveTheme(g6Var, null, z10, true);
                HashMap hashMap = org.telegram.ui.ActionBar.h6.H;
                if (g6Var.f20883b == null) {
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
                    hashMap.remove(g6Var.f20881a);
                    org.telegram.ui.ActionBar.a6 a6Var = g6Var.f20893i0;
                    if (a6Var != null) {
                        org.telegram.ui.ActionBar.a6.a(a6Var);
                    }
                    org.telegram.ui.ActionBar.h6.F.remove(g6Var);
                    new File(g6Var.f20883b).delete();
                    org.telegram.ui.ActionBar.h6.t1(true, false);
                }
                if (z11) {
                    d5Var = ((org.telegram.ui.ActionBar.n2) ua1Var.e).parentLayout;
                    ((ActionBarLayout) d5Var).U(true, true);
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeListUpdated, new Object[0]);
                return;
            case 23:
                vf1.W((vf1) this.f36692b, (byte[]) this.f36693c);
                return;
            case 24:
                hh1 hh1Var = (hh1) this.f36692b;
                hh1Var.getClass();
                ((boolean[]) this.f36693c)[0] = true;
                hh1Var.f37662p0 = 17;
                Intent intent = new Intent(hh1Var.f37634b, VoIPService.class);
                intent.putExtra("user_id", hh1Var.d.f20423id);
                intent.putExtra("is_outgoing", true);
                intent.putExtra("start_incall_activity", false);
                intent.putExtra("video_call", false);
                intent.putExtra("can_video_call", false);
                intent.putExtra("account", hh1Var.f37631a);
                try {
                    hh1Var.f37634b.startService(intent);
                    return;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    return;
                }
            case 26:
                org.telegram.ui.Wallet.h8 h8Var = (org.telegram.ui.Wallet.h8) this.f36692b;
                h8Var.getClass();
                b2Var.dismiss();
                org.telegram.ui.Wallet.w7 w7Var = new org.telegram.ui.Wallet.w7();
                w7Var.f35075r = !((Boolean) this.f36693c).booleanValue();
                h8Var.presentFragment(w7Var);
                return;
            case 27:
                ((Runnable) this.f36692b).run();
                ((org.telegram.ui.ActionBar.f3) this.f36693c).dismiss();
                return;
        }
    }

    @Override
    public File getFile() {
        switch (this.f36691a) {
            case 1:
                return FileLoader.getInstance(((PhotoViewer) this.f36692b).T).getPathToAttach((TLObject) this.f36693c, true);
            default:
                return FileLoader.getInstance(((PhotoViewer) this.f36692b).T).getPathToMessage((TLRPC.Message) this.f36693c);
        }
    }

    @Override
    public void onSuccess(Object obj) {
        Integer num = (Integer) obj;
        FileLog.d("wear-auth: /token delivered to " + ((String) ((com.google.android.gms.internal.cast.z5) this.f36692b).f6880a));
        ((ei.d) this.f36693c).setLoading(false);
        yh1.d = null;
        org.telegram.ui.ActionBar.f3 f3Var = yh1.f43503c;
        if (f3Var != null) {
            f3Var.dismiss();
            yh1.f43503c = null;
        }
    }

    @Override
    public Object provide(Object obj) {
        lw0 lw0Var = (lw0) this.f36693c;
        Void r10 = (Void) obj;
        PremiumPreviewFragment premiumPreviewFragment = ((mw0) this.f36692b).d.f39700n;
        premiumPreviewFragment.f33515n0.d(0, 0.0f, 0, lw0Var.getMeasuredWidth(), -lw0Var.getTier().h, premiumPreviewFragment.O);
        return premiumPreviewFragment.f33515n0.f46191f;
    }

    @Override
    public void r(ek0 ek0Var) {
        xe1 xe1Var = ((ue1) this.f36692b).f41946a;
        xe1Var.e.add(Integer.valueOf(((TLRPC.TL_forumTopic) this.f36693c).f20328id));
        xe1Var.V();
    }

    @Override
    public void run(boolean z10) {
        TLRPC.Chat chat = (TLRPC.Chat) this.f36693c;
        re1 re1Var = ((be1) this.f36692b).f35619b;
        NotificationCenter notificationCenter = re1Var.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(re1Var, i10);
        re1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        re1Var.finishFragment();
        re1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-chat.f20276id), null, chat, Boolean.valueOf(z10));
    }

    public en0(xu0 xu0Var, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, ArrayList arrayList) {
        this.f36691a = 6;
        this.f36692b = xu0Var;
        this.f36693c = tL_messageMediaPoll;
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.f36692b;
        Runnable runnable = (Runnable) this.f36693c;
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
