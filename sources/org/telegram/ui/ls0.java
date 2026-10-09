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
public final class ls0 implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.f5, GenericProvider, MediaDataController.KeywordResultCallback, org.telegram.ui.Components.fm0, org.telegram.ui.Components.gm0, zv0, MessagesStorage.BooleanCallback, u11, OnSuccessListener, pa.a {
    public final int f39670a;
    public final Object f39671b;
    public final Object f39672c;

    public ls0(int i10, Object obj, Object obj2) {
        this.f39670a = i10;
        this.f39671b = obj;
        this.f39672c = obj2;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        switch (this.f39670a) {
            case 1:
                aw0 aw0Var = ((sv0) this.f39671b).f41778a;
                aw0Var.f36042e0.a((TLRPC.TL_messageMediaToDo) this.f39672c);
                aw0Var.finishFragment();
                return;
            default:
                aw0 aw0Var2 = ((sv0) this.f39671b).f41778a;
                aw0Var2.f36042e0.a((TLRPC.TL_messageMediaPoll) this.f39672c);
                aw0Var2.finishFragment();
                return;
        }
    }

    @Override
    public boolean Y0(View view) {
        return false;
    }

    @Override
    public void a(TLRPC.MessageMedia messageMedia) {
        me1 me1Var = (me1) this.f39671b;
        zn znVar = (zn) this.f39672c;
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.MessageMedia messageMedia2 = me1Var.G.messageOwner.media;
            if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                ((TLRPC.TL_messageMediaToDo) messageMedia).completions = ((TLRPC.TL_messageMediaToDo) messageMedia2).completions;
            }
        }
        me1Var.G.messageOwner.media = messageMedia;
        znVar.getSendMessagesHelper().editMessage(me1Var.G, null, null, null, null, null, null, false, false, null);
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        ThemeActivity.W((ThemeActivity) this.f39671b, (Context) this.f39672c, view, i10, f7);
    }

    @Override
    public boolean d(int i10, View view) {
        String str;
        final hc1 hc1Var = (hc1) this.f39671b;
        final jc1 jc1Var = (jc1) this.f39672c;
        ThemeActivity themeActivity = hc1Var.f38253e;
        if (i10 >= 0 && i10 < jc1Var.f38912e.size()) {
            final org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) jc1Var.f38912e.get(i10);
            if (g6Var.f20653a >= 100 && !g6Var.f20675z) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                String string = LocaleController.getString("OpenInEditor", R.string.OpenInEditor);
                String string2 = LocaleController.getString("ShareTheme", R.string.ShareTheme);
                TLRPC.TL_theme tL_theme = g6Var.f20668r;
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
                        hc1 hc1Var2 = hc1.this;
                        ThemeActivity themeActivity2 = hc1Var2.f38253e;
                        if (themeActivity2.getParentActivity() != null) {
                            org.telegram.ui.ActionBar.g6 g6Var2 = g6Var;
                            int i12 = 2;
                            if (i11 == 0) {
                                if (i11 != 1) {
                                    i12 = 1;
                                }
                                org.telegram.ui.Components.g5.V(themeActivity2, i12, g6Var2.f20654b, g6Var2);
                            } else if (i11 == 1) {
                                if (g6Var2.f20668r == null) {
                                    themeActivity2.getMessagesController().saveThemeToServer(g6Var2.f20654b, g6Var2);
                                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, g6Var2.f20654b, g6Var2);
                                    return;
                                }
                                String str2 = "https://" + themeActivity2.getMessagesController().linkPrefix + "/addtheme/" + g6Var2.f20668r.slug;
                                themeActivity2.showDialog(new org.telegram.ui.Components.mr0(themeActivity2.getParentActivity(), null, str2, false, str2, false, null));
                            } else if (i11 == 2) {
                                themeActivity2.presentFragment(new ce1(g6Var2.f20654b, g6Var2, false));
                            } else if (i11 == 3 && themeActivity2.getParentActivity() != null) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(themeActivity2.getParentActivity());
                                String string3 = LocaleController.getString("DeleteThemeTitle", R.string.DeleteThemeTitle);
                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder2.f20374a;
                                b2Var.R = string3;
                                b2Var.T = LocaleController.getString("DeleteThemeAlert", R.string.DeleteThemeAlert);
                                alertDialog$Builder2.k(LocaleController.getString("Delete", R.string.Delete), new a7(hc1Var2, jc1Var, g6Var2, 22));
                                alertDialog$Builder2.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                                themeActivity2.showDialog(b2Var);
                                TextView textView = (TextView) b2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21037q7, false));
                                }
                            }
                        }
                    }
                };
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20374a;
                b2Var.P = charSequenceArr;
                b2Var.Q = iArr;
                b2Var.M = onClickListener;
                themeActivity.showDialog(b2Var);
                b2Var.l(b2Var.N0.size() - 1, org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21037q7, false), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21018p7, false));
                return true;
            }
        }
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        ArrayList arrayList;
        TLRPC.EncryptedChat encryptedChat;
        boolean z10;
        boolean z11;
        switch (this.f39670a) {
            case 0:
                boolean[] zArr = (boolean[]) this.f39672c;
                PhotoViewer photoViewer = ((ss0) this.f39671b).f41767b;
                cv0 cv0Var = photoViewer.d;
                ArrayList arrayList2 = photoViewer.f33872a7;
                ArrayList arrayList3 = photoViewer.f33901d7;
                ArrayList arrayList4 = photoViewer.Y6;
                ArrayList arrayList5 = photoViewer.e7;
                ArrayList arrayList6 = photoViewer.f7;
                if (!cv0Var.M()) {
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
                            arrayList9.add(Integer.valueOf(message.f20059id));
                            MessagesController.getInstance(photoViewer.T).deleteMessages(arrayList9, null, null, MessageObject.getDialogId(message), message.quick_reply_shortcut_id, true, 0);
                            NotificationCenter.getInstance(photoViewer.T).lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
                        }
                        if (photoViewer.J1()) {
                            if (photoViewer.f34096z5 > 0) {
                                MessagesController.getInstance(photoViewer.T).deleteUserPhoto(null);
                            } else {
                                MessagesController.getInstance(photoViewer.T).changeChatAvatar(-photoViewer.f34096z5, null, null, null, null, 0.0d, null, null, null, null);
                            }
                            photoViewer.G0(false, false);
                            return;
                        }
                        TLRPC.Photo photo = (TLRPC.Photo) arrayList6.get(photoViewer.P4);
                        if (photo != null) {
                            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                            tL_inputPhoto.f20057id = photo.f20062id;
                            tL_inputPhoto.access_hash = photo.access_hash;
                            byte[] bArr = photo.file_reference;
                            tL_inputPhoto.file_reference = bArr;
                            if (bArr == null) {
                                tL_inputPhoto.file_reference = new byte[0];
                            }
                            if (photoViewer.f34096z5 > 0) {
                                MessagesController.getInstance(photoViewer.T).deleteUserPhoto(tL_inputPhoto);
                            }
                            MessagesStorage.getInstance(photoViewer.T).clearUserPhoto(photoViewer.f34096z5, photo.f20062id);
                            arrayList2.remove(photoViewer.P4);
                            photoViewer.f33892c7.remove(photoViewer.P4);
                            photoViewer.f33882b7.remove(photoViewer.P4);
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
            case 1:
            case 2:
            case 3:
            case 8:
            case 9:
            case 13:
            case 14:
            case 16:
            case 17:
            case 18:
            case 21:
            case 25:
            default:
                boolean[] zArr2 = (boolean[]) this.f39672c;
                JsPromptResult jsPromptResult = (JsPromptResult) this.f39671b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    jsPromptResult.cancel();
                    return;
                }
                return;
            case 4:
                ((PrivacyControlActivity) this.f39671b).t0();
                ((SharedPreferences) this.f39672c).edit().putBoolean("privacyAlertShowed", true).commit();
                return;
            case 5:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f39671b;
                TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
                boolean[] zArr3 = privacySettingsActivity.Z;
                tL_payments_clearSavedInfo.credentials = zArr3[1];
                tL_payments_clearSavedInfo.info = zArr3[0];
                privacySettingsActivity.getUserConfig().tmpPassword = null;
                privacySettingsActivity.getUserConfig().saveConfig(false);
                privacySettingsActivity.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new ac0(14, privacySettingsActivity, (org.telegram.ui.Cells.w8) this.f39672c));
                return;
            case 6:
                ProfileActivity.c0((ProfileActivity) this.f39671b, (org.telegram.ui.Cells.a2[]) this.f39672c);
                return;
            case 7:
                g01 g01Var = (g01) this.f39671b;
                TLRPC.User user = (TLRPC.User) this.f39672c;
                g01Var.getClass();
                ArrayList<TLRPC.User> arrayList10 = new ArrayList<>();
                arrayList10.add(user);
                ProfileActivity profileActivity = g01Var.f37738b;
                profileActivity.getContactsController().deleteContact(arrayList10, true);
                if (user != null) {
                    user.contact = false;
                    profileActivity.e5(false, false);
                    return;
                }
                return;
            case 10:
                u71 u71Var = (u71) this.f39671b;
                TLRPC.User user2 = (TLRPC.User) this.f39672c;
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    u71Var.dismiss();
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    a7 a7Var = new a7(u71Var, user2, twoStepVerificationActivity, 20);
                    twoStepVerificationActivity.Z = 0;
                    twoStepVerificationActivity.f34573b0 = a7Var;
                    U.presentFragment(twoStepVerificationActivity);
                    return;
                }
                return;
            case 11:
                jb1.o((jb1) this.f39671b, (ty) this.f39672c);
                return;
            case 12:
                ThemeActivity.X((ThemeActivity) this.f39671b, (n31) this.f39672c);
                return;
            case 15:
                hc1 hc1Var = (hc1) this.f39671b;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) this.f39672c;
                hc1Var.getClass();
                MessagesController messagesController = MessagesController.getInstance(h6Var.E);
                if (h6Var == org.telegram.ui.ActionBar.i6.J) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                messagesController.saveTheme(h6Var, null, z10, true);
                HashMap hashMap = org.telegram.ui.ActionBar.i6.H;
                if (h6Var.f20705b == null) {
                    z11 = false;
                } else {
                    if (org.telegram.ui.ActionBar.i6.I == h6Var) {
                        org.telegram.ui.ActionBar.i6.t(org.telegram.ui.ActionBar.i6.L, true, false);
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (h6Var == org.telegram.ui.ActionBar.i6.J) {
                        org.telegram.ui.ActionBar.i6.J = (org.telegram.ui.ActionBar.h6) hashMap.get("Dark Blue");
                    }
                    h6Var.t();
                    org.telegram.ui.ActionBar.i6.G.remove(h6Var);
                    hashMap.remove(h6Var.f20703a);
                    org.telegram.ui.ActionBar.b6 b6Var = h6Var.f20716i0;
                    if (b6Var != null) {
                        org.telegram.ui.ActionBar.b6.a(b6Var);
                    }
                    org.telegram.ui.ActionBar.i6.F.remove(h6Var);
                    new File(h6Var.f20705b).delete();
                    org.telegram.ui.ActionBar.i6.t1(true, false);
                }
                if (z11) {
                    ((ActionBarLayout) ThemeActivity.c0(hc1Var.f38253e)).U(true, true);
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeListUpdated, new Object[0]);
                return;
            case 19:
                ih1.W((ih1) this.f39671b, (byte[]) this.f39672c);
                return;
            case 20:
                wi1 wi1Var = (wi1) this.f39671b;
                wi1Var.getClass();
                ((boolean[]) this.f39672c)[0] = true;
                wi1Var.f43658p0 = 17;
                Intent intent = new Intent(wi1Var.f43629b, VoIPService.class);
                intent.putExtra("user_id", wi1Var.d.f20185id);
                intent.putExtra("is_outgoing", true);
                intent.putExtra("start_incall_activity", false);
                intent.putExtra("video_call", false);
                intent.putExtra("can_video_call", false);
                intent.putExtra("account", wi1Var.f43626a);
                try {
                    wi1Var.f43629b.startService(intent);
                    return;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    return;
                }
            case 22:
                org.telegram.ui.Wallet.l7 l7Var = (org.telegram.ui.Wallet.l7) this.f39671b;
                l7Var.getClass();
                b2Var.dismiss();
                org.telegram.ui.Wallet.a7 a7Var2 = new org.telegram.ui.Wallet.a7();
                a7Var2.f34657r = !((Boolean) this.f39672c).booleanValue();
                l7Var.presentFragment(a7Var2);
                return;
            case 23:
                ((Runnable) this.f39671b).run();
                ((org.telegram.ui.ActionBar.f3) this.f39672c).dismiss();
                return;
            case 24:
                org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) this.f39672c;
                of.e g10 = b2Var.g(i10, true, true);
                g10.d();
                org.telegram.ui.Wallet.h7 h7Var = new org.telegram.ui.Wallet.h7((org.telegram.ui.Wallet.l7) this.f39671b, g10, 1);
                org.telegram.ui.Wallet.k0.E("disableBackupWithoutUpdatingPhrase");
                k0Var.h0(new org.telegram.messenger.camera.i((Object) k0Var, (Object) new ft(20, k0Var, h7Var), true, false, 2));
                return;
            case 26:
                org.telegram.ui.web.o.Y((org.telegram.ui.web.o) this.f39671b, (HashSet) this.f39672c);
                return;
            case 27:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) this.f39671b;
                TL_bots.allowSendMessage allowsendmessage = new TL_bots.allowSendMessage();
                allowsendmessage.bot = MessagesController.getInstance(b1Var.M).getInputUser(b1Var.U);
                ConnectionsManager.getInstance(b1Var.M).sendRequest(allowsendmessage, new ai.t5(b1Var, (String[]) this.f39672c, b2Var, 15));
                return;
        }
    }

    @Override
    public void g(pa.b bVar) {
        ((pa.a) this.f39671b).g(bVar);
        ((pa.a) this.f39672c).g(bVar);
    }

    @Override
    public void onSuccess(Object obj) {
        Integer num = (Integer) obj;
        FileLog.d("wear-auth: /token delivered to " + ((String) ((ci.u5) this.f39671b).f6067c));
        ((ci.d) this.f39672c).setLoading(false);
        nj1.d = null;
        org.telegram.ui.ActionBar.f3 f3Var = nj1.f40229c;
        if (f3Var != null) {
            f3Var.dismiss();
            nj1.f40229c = null;
        }
    }

    @Override
    public Object provide(Object obj) {
        hx0 hx0Var = (hx0) this.f39672c;
        Void r10 = (Void) obj;
        PremiumPreviewFragment premiumPreviewFragment = ((ix0) this.f39671b).d.f39042n;
        premiumPreviewFragment.f34143n0.d(0, 0.0f, 0, hx0Var.getMeasuredWidth(), -hx0Var.getTier().h, premiumPreviewFragment.O);
        return premiumPreviewFragment.f34143n0.f47179f;
    }

    @Override
    public void run(boolean z10) {
        TLRPC.Chat chat = (TLRPC.Chat) this.f39672c;
        fg1 fg1Var = ((pf1) this.f39671b).f40793b;
        NotificationCenter notificationCenter = fg1Var.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(fg1Var, i10);
        fg1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        fg1Var.finishFragment();
        fg1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-chat.f20038id), null, chat, Boolean.valueOf(z10));
    }

    @Override
    public void v(vk0 vk0Var) {
        lg1 lg1Var = ((ig1) this.f39671b).f38636a;
        lg1Var.f39577e.add(Integer.valueOf(((TLRPC.TL_forumTopic) this.f39672c).f20090id));
        lg1Var.V();
    }

    public ls0(sv0 sv0Var, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, ArrayList arrayList) {
        this.f39670a = 2;
        this.f39671b = sv0Var;
        this.f39672c = tL_messageMediaPoll;
    }

    public ls0(boolean[] zArr, JsPromptResult jsPromptResult) {
        this.f39670a = 28;
        this.f39672c = zArr;
        this.f39671b = jsPromptResult;
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.f39671b;
        Runnable runnable = (Runnable) this.f39672c;
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
