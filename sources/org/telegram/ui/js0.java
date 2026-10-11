package org.telegram.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.webkit.JsPromptResult;
import android.widget.TextView;
import com.google.android.gms.tasks.OnSuccessListener;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class js0 implements org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.f5, GenericProvider, MediaDataController.KeywordResultCallback, org.telegram.ui.Components.gm0, org.telegram.ui.Components.hm0, yv0, MessagesStorage.BooleanCallback, t11, OnSuccessListener {
    public final int f39151a;
    public final Object f39152b;
    public final Object f39153c;

    public js0(int i10, Object obj, Object obj2) {
        this.f39151a = i10;
        this.f39152b = obj;
        this.f39153c = obj2;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        switch (this.f39151a) {
            case 2:
                zv0 zv0Var = ((rv0) this.f39152b).f41552a;
                zv0Var.f45130e0.a((TLRPC.TL_messageMediaToDo) this.f39153c);
                zv0Var.finishFragment();
                return;
            default:
                zv0 zv0Var2 = ((rv0) this.f39152b).f41552a;
                zv0Var2.f45130e0.a((TLRPC.TL_messageMediaPoll) this.f39153c);
                zv0Var2.finishFragment();
                return;
        }
    }

    @Override
    public boolean Y0(View view) {
        return false;
    }

    @Override
    public void a(TLRPC.MessageMedia messageMedia) {
        le1 le1Var = (le1) this.f39152b;
        zn znVar = (zn) this.f39153c;
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.MessageMedia messageMedia2 = le1Var.G.messageOwner.media;
            if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                ((TLRPC.TL_messageMediaToDo) messageMedia).completions = ((TLRPC.TL_messageMediaToDo) messageMedia2).completions;
            }
        }
        le1Var.G.messageOwner.media = messageMedia;
        znVar.getSendMessagesHelper().editMessage(le1Var.G, null, null, null, null, null, null, false, false, null);
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        ThemeActivity.W((ThemeActivity) this.f39152b, (Context) this.f39153c, view, i10, f7);
    }

    @Override
    public boolean d(int i10, View view) {
        String str;
        final gc1 gc1Var = (gc1) this.f39152b;
        final ic1 ic1Var = (ic1) this.f39153c;
        ThemeActivity themeActivity = gc1Var.f38045e;
        if (i10 >= 0 && i10 < ic1Var.f38692e.size()) {
            final org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) ic1Var.f38692e.get(i10);
            if (f6Var.f20642a >= 100 && !f6Var.f20664z) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                String string = LocaleController.getString("OpenInEditor", R.string.OpenInEditor);
                String string2 = LocaleController.getString("ShareTheme", R.string.ShareTheme);
                TLRPC.TL_theme tL_theme = f6Var.f20657r;
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
                        gc1 gc1Var2 = gc1.this;
                        ThemeActivity themeActivity2 = gc1Var2.f38045e;
                        if (themeActivity2.getParentActivity() != null) {
                            org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                            int i12 = 2;
                            if (i11 == 0) {
                                if (i11 != 1) {
                                    i12 = 1;
                                }
                                org.telegram.ui.Components.g5.V(themeActivity2, i12, f6Var2.f20643b, f6Var2);
                            } else if (i11 == 1) {
                                if (f6Var2.f20657r == null) {
                                    themeActivity2.getMessagesController().saveThemeToServer(f6Var2.f20643b, f6Var2);
                                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, f6Var2.f20643b, f6Var2);
                                    return;
                                }
                                String str2 = "https://" + themeActivity2.getMessagesController().linkPrefix + "/addtheme/" + f6Var2.f20657r.slug;
                                themeActivity2.showDialog(new org.telegram.ui.Components.nr0(themeActivity2.getParentActivity(), null, str2, false, str2, false, null));
                            } else if (i11 == 2) {
                                themeActivity2.presentFragment(new be1(f6Var2.f20643b, f6Var2, false));
                            } else if (i11 == 3 && themeActivity2.getParentActivity() != null) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(themeActivity2.getParentActivity());
                                String string3 = LocaleController.getString("DeleteThemeTitle", R.string.DeleteThemeTitle);
                                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder2.f20404a;
                                a2Var.R = string3;
                                a2Var.T = LocaleController.getString("DeleteThemeAlert", R.string.DeleteThemeAlert);
                                alertDialog$Builder2.k(LocaleController.getString("Delete", R.string.Delete), new z6(gc1Var2, ic1Var, f6Var2, 22));
                                alertDialog$Builder2.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                                themeActivity2.showDialog(a2Var);
                                TextView textView = (TextView) a2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21062q7, false));
                                }
                            }
                        }
                    }
                };
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20404a;
                a2Var.P = charSequenceArr;
                a2Var.Q = iArr;
                a2Var.M = onClickListener;
                themeActivity.showDialog(a2Var);
                a2Var.l(a2Var.N0.size() - 1, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21062q7, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21043p7, false));
                return true;
            }
        }
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        ArrayList arrayList;
        TLRPC.EncryptedChat encryptedChat;
        boolean z10;
        boolean z11;
        org.telegram.ui.ActionBar.b5 b5Var;
        switch (this.f39151a) {
            case 0:
                PhotoViewer.D(((rs0) this.f39152b).f41542b, (ArrayList) this.f39153c);
                return;
            case 1:
                boolean[] zArr = (boolean[]) this.f39153c;
                PhotoViewer photoViewer = ((rs0) this.f39152b).f41542b;
                bv0 bv0Var = photoViewer.d;
                ArrayList arrayList2 = photoViewer.f33934a7;
                ArrayList arrayList3 = photoViewer.f33963d7;
                ArrayList arrayList4 = photoViewer.Y6;
                ArrayList arrayList5 = photoViewer.e7;
                ArrayList arrayList6 = photoViewer.f7;
                if (!bv0Var.M()) {
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
                            arrayList9.add(Integer.valueOf(message.f20089id));
                            MessagesController.getInstance(photoViewer.T).deleteMessages(arrayList9, null, null, MessageObject.getDialogId(message), message.quick_reply_shortcut_id, true, 0);
                            NotificationCenter.getInstance(photoViewer.T).lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
                        }
                        if (photoViewer.J1()) {
                            if (photoViewer.f34158z5 > 0) {
                                MessagesController.getInstance(photoViewer.T).deleteUserPhoto(null);
                            } else {
                                MessagesController.getInstance(photoViewer.T).changeChatAvatar(-photoViewer.f34158z5, null, null, null, null, 0.0d, null, null, null, null);
                            }
                            photoViewer.G0(false, false);
                            return;
                        }
                        TLRPC.Photo photo = (TLRPC.Photo) arrayList6.get(photoViewer.P4);
                        if (photo != null) {
                            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                            tL_inputPhoto.f20087id = photo.f20092id;
                            tL_inputPhoto.access_hash = photo.access_hash;
                            byte[] bArr = photo.file_reference;
                            tL_inputPhoto.file_reference = bArr;
                            if (bArr == null) {
                                tL_inputPhoto.file_reference = new byte[0];
                            }
                            if (photoViewer.f34158z5 > 0) {
                                MessagesController.getInstance(photoViewer.T).deleteUserPhoto(tL_inputPhoto);
                            }
                            MessagesStorage.getInstance(photoViewer.T).clearUserPhoto(photoViewer.f34158z5, photo.f20092id);
                            arrayList2.remove(photoViewer.P4);
                            photoViewer.f33954c7.remove(photoViewer.P4);
                            photoViewer.f33944b7.remove(photoViewer.P4);
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
            case 2:
            case 3:
            case 4:
            case 9:
            case 10:
            case 14:
            case 15:
            case 17:
            case 18:
            case 19:
            case 22:
            case 26:
            default:
                boolean[] zArr2 = (boolean[]) this.f39152b;
                JsPromptResult jsPromptResult = (JsPromptResult) this.f39153c;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    jsPromptResult.cancel();
                    return;
                }
                return;
            case 5:
                ((PrivacyControlActivity) this.f39152b).t0();
                ((SharedPreferences) this.f39153c).edit().putBoolean("privacyAlertShowed", true).commit();
                return;
            case 6:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f39152b;
                TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
                boolean[] zArr3 = privacySettingsActivity.Z;
                tL_payments_clearSavedInfo.credentials = zArr3[1];
                tL_payments_clearSavedInfo.info = zArr3[0];
                privacySettingsActivity.getUserConfig().tmpPassword = null;
                privacySettingsActivity.getUserConfig().saveConfig(false);
                privacySettingsActivity.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new zb0(14, privacySettingsActivity, (org.telegram.ui.Cells.w8) this.f39153c));
                return;
            case 7:
                ProfileActivity.c0((ProfileActivity) this.f39152b, (org.telegram.ui.Cells.a2[]) this.f39153c);
                return;
            case 8:
                f01 f01Var = (f01) this.f39152b;
                TLRPC.User user = (TLRPC.User) this.f39153c;
                f01Var.getClass();
                ArrayList<TLRPC.User> arrayList10 = new ArrayList<>();
                arrayList10.add(user);
                ProfileActivity profileActivity = f01Var.f37533b;
                profileActivity.getContactsController().deleteContact(arrayList10, true);
                if (user != null) {
                    user.contact = false;
                    profileActivity.e5(false, false);
                    return;
                }
                return;
            case 11:
                t71 t71Var = (t71) this.f39152b;
                TLRPC.User user2 = (TLRPC.User) this.f39153c;
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    t71Var.dismiss();
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    z6 z6Var = new z6(t71Var, user2, twoStepVerificationActivity, 20);
                    twoStepVerificationActivity.Z = 0;
                    twoStepVerificationActivity.f34635b0 = z6Var;
                    U.presentFragment(twoStepVerificationActivity);
                    return;
                }
                return;
            case 12:
                ib1.o((ib1) this.f39152b, (sy) this.f39153c);
                return;
            case 13:
                ThemeActivity.X((ThemeActivity) this.f39152b, (m31) this.f39153c);
                return;
            case 16:
                gc1 gc1Var = (gc1) this.f39152b;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.f39153c;
                gc1Var.getClass();
                MessagesController messagesController = MessagesController.getInstance(g6Var.E);
                if (g6Var == org.telegram.ui.ActionBar.h6.J) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                messagesController.saveTheme(g6Var, null, z10, true);
                HashMap hashMap = org.telegram.ui.ActionBar.h6.H;
                if (g6Var.f20693b == null) {
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
                    hashMap.remove(g6Var.f20691a);
                    org.telegram.ui.ActionBar.z5 z5Var = g6Var.f20704i0;
                    if (z5Var != null) {
                        org.telegram.ui.ActionBar.z5.a(z5Var);
                    }
                    org.telegram.ui.ActionBar.h6.F.remove(g6Var);
                    new File(g6Var.f20693b).delete();
                    org.telegram.ui.ActionBar.h6.t1(true, false);
                }
                if (z11) {
                    b5Var = ((org.telegram.ui.ActionBar.m2) gc1Var.f38045e).parentLayout;
                    ((ActionBarLayout) b5Var).U(true, true);
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeListUpdated, new Object[0]);
                return;
            case 20:
                hh1.W((hh1) this.f39152b, (byte[]) this.f39153c);
                return;
            case 21:
                ui1 ui1Var = (ui1) this.f39152b;
                ui1Var.getClass();
                ((boolean[]) this.f39153c)[0] = true;
                ui1Var.f42643p0 = 17;
                Intent intent = new Intent(ui1Var.f42614b, VoIPService.class);
                intent.putExtra("user_id", ui1Var.d.f20215id);
                intent.putExtra("is_outgoing", true);
                intent.putExtra("start_incall_activity", false);
                intent.putExtra("video_call", false);
                intent.putExtra("can_video_call", false);
                intent.putExtra("account", ui1Var.f42611a);
                try {
                    ui1Var.f42614b.startService(intent);
                    return;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    return;
                }
            case 23:
                org.telegram.ui.Wallet.n7 n7Var = (org.telegram.ui.Wallet.n7) this.f39152b;
                n7Var.getClass();
                a2Var.dismiss();
                org.telegram.ui.Wallet.c7 c7Var = new org.telegram.ui.Wallet.c7();
                c7Var.f34813r = !((Boolean) this.f39153c).booleanValue();
                n7Var.presentFragment(c7Var);
                return;
            case 24:
                ((Runnable) this.f39152b).run();
                ((org.telegram.ui.ActionBar.e3) this.f39153c).dismiss();
                return;
            case 25:
                org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) this.f39153c;
                of.e g10 = a2Var.g(i10, true, true);
                g10.d();
                org.telegram.ui.Wallet.j7 j7Var = new org.telegram.ui.Wallet.j7((org.telegram.ui.Wallet.n7) this.f39152b, g10, 1);
                org.telegram.ui.Wallet.l0.E("disableBackupWithoutUpdatingPhrase");
                l0Var.h0(new org.telegram.messenger.camera.i((Object) l0Var, (Object) new et(20, l0Var, j7Var), true, false, 2));
                return;
            case 27:
                org.telegram.ui.web.o.Y((org.telegram.ui.web.o) this.f39152b, (HashSet) this.f39153c);
                return;
            case 28:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) this.f39152b;
                TL_bots.allowSendMessage allowsendmessage = new TL_bots.allowSendMessage();
                allowsendmessage.bot = MessagesController.getInstance(b1Var.M).getInputUser(b1Var.U);
                ConnectionsManager.getInstance(b1Var.M).sendRequest(allowsendmessage, new ai.t5(b1Var, (String[]) this.f39153c, a2Var, 15));
                return;
        }
    }

    @Override
    public void onSuccess(Object obj) {
        Integer num = (Integer) obj;
        FileLog.d("wear-auth: /token delivered to " + ((String) ((ci.u5) this.f39152b).f6066c));
        ((ci.d) this.f39153c).setLoading(false);
        lj1.d = null;
        org.telegram.ui.ActionBar.e3 e3Var = lj1.f39726c;
        if (e3Var != null) {
            e3Var.dismiss();
            lj1.f39726c = null;
        }
    }

    @Override
    public Object provide(Object obj) {
        gx0 gx0Var = (gx0) this.f39153c;
        Void r10 = (Void) obj;
        PremiumPreviewFragment premiumPreviewFragment = ((hx0) this.f39152b).d.f38833n;
        premiumPreviewFragment.f34205n0.d(0, 0.0f, 0, gx0Var.getMeasuredWidth(), -gx0Var.getTier().h, premiumPreviewFragment.O);
        return premiumPreviewFragment.f34205n0.f47303f;
    }

    @Override
    public void run(boolean z10) {
        TLRPC.Chat chat = (TLRPC.Chat) this.f39153c;
        eg1 eg1Var = ((of1) this.f39152b).f40569b;
        NotificationCenter notificationCenter = eg1Var.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(eg1Var, i10);
        eg1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        eg1Var.finishFragment();
        eg1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-chat.f20068id), null, chat, Boolean.valueOf(z10));
    }

    @Override
    public void v(uk0 uk0Var) {
        kg1 kg1Var = ((hg1) this.f39152b).f38442a;
        kg1Var.f39371e.add(Integer.valueOf(((TLRPC.TL_forumTopic) this.f39153c).f20120id));
        kg1Var.V();
    }

    public js0(rv0 rv0Var, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, ArrayList arrayList) {
        this.f39151a = 3;
        this.f39152b = rv0Var;
        this.f39153c = tL_messageMediaPoll;
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.f39152b;
        Runnable runnable = (Runnable) this.f39153c;
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
    public void a0() {
    }

    @Override
    public void n0(View view, float f7, float f10) {
    }
}
