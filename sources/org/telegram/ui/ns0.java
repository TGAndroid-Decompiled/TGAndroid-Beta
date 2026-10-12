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
public final class ns0 implements org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.f5, GenericProvider, MediaDataController.KeywordResultCallback, org.telegram.ui.Components.lm0, org.telegram.ui.Components.mm0, bw0, MessagesStorage.BooleanCallback, w11, OnSuccessListener, pa.a {
    public final int f40471a;
    public final Object f40472b;
    public final Object f40473c;

    public ns0(int i10, Object obj, Object obj2) {
        this.f40471a = i10;
        this.f40472b = obj;
        this.f40473c = obj2;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        switch (this.f40471a) {
            case 1:
                cw0 cw0Var = ((uv0) this.f40472b).f42601a;
                cw0Var.f36548e0.a((TLRPC.TL_messageMediaToDo) this.f40473c);
                cw0Var.finishFragment();
                return;
            default:
                cw0 cw0Var2 = ((uv0) this.f40472b).f42601a;
                cw0Var2.f36548e0.a((TLRPC.TL_messageMediaPoll) this.f40473c);
                cw0Var2.finishFragment();
                return;
        }
    }

    @Override
    public boolean Y0(View view) {
        return false;
    }

    @Override
    public void a(TLRPC.MessageMedia messageMedia) {
        oe1 oe1Var = (oe1) this.f40472b;
        eo eoVar = (eo) this.f40473c;
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.MessageMedia messageMedia2 = oe1Var.G.messageOwner.media;
            if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                ((TLRPC.TL_messageMediaToDo) messageMedia).completions = ((TLRPC.TL_messageMediaToDo) messageMedia2).completions;
            }
        }
        oe1Var.G.messageOwner.media = messageMedia;
        eoVar.getSendMessagesHelper().editMessage(oe1Var.G, null, null, null, null, null, null, false, false, null);
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        ThemeActivity.W((ThemeActivity) this.f40472b, (Context) this.f40473c, view, i10, f7);
    }

    @Override
    public boolean d(int i10, View view) {
        String str;
        final jc1 jc1Var = (jc1) this.f40472b;
        final lc1 lc1Var = (lc1) this.f40473c;
        ThemeActivity themeActivity = jc1Var.f39180e;
        if (i10 >= 0 && i10 < lc1Var.f39699e.size()) {
            final org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) lc1Var.f39699e.get(i10);
            if (e6Var.f20350a >= 100 && !e6Var.f20372z) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                String string = LocaleController.getString("OpenInEditor", R.string.OpenInEditor);
                String string2 = LocaleController.getString("ShareTheme", R.string.ShareTheme);
                TLRPC.TL_theme tL_theme = e6Var.f20365r;
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
                        jc1 jc1Var2 = jc1.this;
                        ThemeActivity themeActivity2 = jc1Var2.f39180e;
                        if (themeActivity2.getParentActivity() != null) {
                            org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                            int i12 = 2;
                            if (i11 == 0) {
                                if (i11 != 1) {
                                    i12 = 1;
                                }
                                org.telegram.ui.Components.g5.V(themeActivity2, i12, e6Var2.f20351b, e6Var2);
                            } else if (i11 == 1) {
                                if (e6Var2.f20365r == null) {
                                    themeActivity2.getMessagesController().saveThemeToServer(e6Var2.f20351b, e6Var2);
                                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, e6Var2.f20351b, e6Var2);
                                    return;
                                }
                                String str2 = "https://" + themeActivity2.getMessagesController().linkPrefix + "/addtheme/" + e6Var2.f20365r.slug;
                                themeActivity2.showDialog(new org.telegram.ui.Components.sr0(themeActivity2.getParentActivity(), null, str2, false, str2, false, null));
                            } else if (i11 == 2) {
                                themeActivity2.presentFragment(new ee1(e6Var2.f20351b, e6Var2, false));
                            } else if (i11 == 3 && themeActivity2.getParentActivity() != null) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(themeActivity2.getParentActivity());
                                String string3 = LocaleController.getString("DeleteThemeTitle", R.string.DeleteThemeTitle);
                                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder2.f20142a;
                                a2Var.R = string3;
                                a2Var.T = LocaleController.getString("DeleteThemeAlert", R.string.DeleteThemeAlert);
                                alertDialog$Builder2.k(LocaleController.getString("Delete", R.string.Delete), new d7(jc1Var2, lc1Var, e6Var2, 22));
                                alertDialog$Builder2.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                                themeActivity2.showDialog(a2Var);
                                TextView textView = (TextView) a2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20800q7, false));
                                }
                            }
                        }
                    }
                };
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20142a;
                a2Var.P = charSequenceArr;
                a2Var.Q = iArr;
                a2Var.M = onClickListener;
                themeActivity.showDialog(a2Var);
                a2Var.l(a2Var.N0.size() - 1, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20800q7, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20781p7, false));
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
        switch (this.f40471a) {
            case 0:
                boolean[] zArr = (boolean[]) this.f40473c;
                PhotoViewer photoViewer = ((us0) this.f40472b).f42563b;
                ev0 ev0Var = photoViewer.d;
                ArrayList arrayList2 = photoViewer.f33711a7;
                ArrayList arrayList3 = photoViewer.f33740d7;
                ArrayList arrayList4 = photoViewer.Y6;
                ArrayList arrayList5 = photoViewer.e7;
                ArrayList arrayList6 = photoViewer.f7;
                if (!ev0Var.M()) {
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
                            arrayList9.add(Integer.valueOf(message.f19824id));
                            MessagesController.getInstance(photoViewer.T).deleteMessages(arrayList9, null, null, MessageObject.getDialogId(message), message.quick_reply_shortcut_id, true, 0);
                            NotificationCenter.getInstance(photoViewer.T).lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
                        }
                        if (photoViewer.J1()) {
                            if (photoViewer.f33935z5 > 0) {
                                MessagesController.getInstance(photoViewer.T).deleteUserPhoto(null);
                            } else {
                                MessagesController.getInstance(photoViewer.T).changeChatAvatar(-photoViewer.f33935z5, null, null, null, null, 0.0d, null, null, null, null);
                            }
                            photoViewer.G0(false, false);
                            return;
                        }
                        TLRPC.Photo photo = (TLRPC.Photo) arrayList6.get(photoViewer.P4);
                        if (photo != null) {
                            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                            tL_inputPhoto.f19822id = photo.f19827id;
                            tL_inputPhoto.access_hash = photo.access_hash;
                            byte[] bArr = photo.file_reference;
                            tL_inputPhoto.file_reference = bArr;
                            if (bArr == null) {
                                tL_inputPhoto.file_reference = new byte[0];
                            }
                            if (photoViewer.f33935z5 > 0) {
                                MessagesController.getInstance(photoViewer.T).deleteUserPhoto(tL_inputPhoto);
                            }
                            MessagesStorage.getInstance(photoViewer.T).clearUserPhoto(photoViewer.f33935z5, photo.f19827id);
                            arrayList2.remove(photoViewer.P4);
                            photoViewer.f33731c7.remove(photoViewer.P4);
                            photoViewer.f33721b7.remove(photoViewer.P4);
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
                boolean[] zArr2 = (boolean[]) this.f40473c;
                JsPromptResult jsPromptResult = (JsPromptResult) this.f40472b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    jsPromptResult.cancel();
                    return;
                }
                return;
            case 4:
                ((PrivacyControlActivity) this.f40472b).t0();
                ((SharedPreferences) this.f40473c).edit().putBoolean("privacyAlertShowed", true).commit();
                return;
            case 5:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f40472b;
                TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
                boolean[] zArr3 = privacySettingsActivity.Z;
                tL_payments_clearSavedInfo.credentials = zArr3[1];
                tL_payments_clearSavedInfo.info = zArr3[0];
                privacySettingsActivity.getUserConfig().tmpPassword = null;
                privacySettingsActivity.getUserConfig().saveConfig(false);
                privacySettingsActivity.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new bc0(14, privacySettingsActivity, (org.telegram.ui.Cells.w8) this.f40473c));
                return;
            case 6:
                ProfileActivity.c0((ProfileActivity) this.f40472b, (org.telegram.ui.Cells.a2[]) this.f40473c);
                return;
            case 7:
                i01 i01Var = (i01) this.f40472b;
                TLRPC.User user = (TLRPC.User) this.f40473c;
                i01Var.getClass();
                ArrayList<TLRPC.User> arrayList10 = new ArrayList<>();
                arrayList10.add(user);
                ProfileActivity profileActivity = i01Var.f38580b;
                profileActivity.getContactsController().deleteContact(arrayList10, true);
                if (user != null) {
                    user.contact = false;
                    profileActivity.e5(false, false);
                    return;
                }
                return;
            case 10:
                x71 x71Var = (x71) this.f40472b;
                TLRPC.User user2 = (TLRPC.User) this.f40473c;
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    x71Var.dismiss();
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    d7 d7Var = new d7(x71Var, user2, twoStepVerificationActivity, 20);
                    twoStepVerificationActivity.Z = 0;
                    twoStepVerificationActivity.f34412b0 = d7Var;
                    U.presentFragment(twoStepVerificationActivity);
                    return;
                }
                return;
            case 11:
                lb1.o((lb1) this.f40472b, (vy) this.f40473c);
                return;
            case 12:
                ThemeActivity.X((ThemeActivity) this.f40472b, (u31) this.f40473c);
                return;
            case 15:
                jc1 jc1Var = (jc1) this.f40472b;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.f40473c;
                jc1Var.getClass();
                MessagesController messagesController = MessagesController.getInstance(g6Var.E);
                if (g6Var == org.telegram.ui.ActionBar.h6.J) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                messagesController.saveTheme(g6Var, null, z10, true);
                HashMap hashMap = org.telegram.ui.ActionBar.h6.H;
                if (g6Var.f20431b == null) {
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
                    hashMap.remove(g6Var.f20429a);
                    org.telegram.ui.ActionBar.z5 z5Var = g6Var.f20442i0;
                    if (z5Var != null) {
                        org.telegram.ui.ActionBar.z5.a(z5Var);
                    }
                    org.telegram.ui.ActionBar.h6.F.remove(g6Var);
                    new File(g6Var.f20431b).delete();
                    org.telegram.ui.ActionBar.h6.t1(true, false);
                }
                if (z11) {
                    ((ActionBarLayout) ThemeActivity.c0(jc1Var.f39180e)).U(true, true);
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeListUpdated, new Object[0]);
                return;
            case 19:
                kh1.W((kh1) this.f40472b, (byte[]) this.f40473c);
                return;
            case 20:
                xi1 xi1Var = (xi1) this.f40472b;
                xi1Var.getClass();
                ((boolean[]) this.f40473c)[0] = true;
                xi1Var.f44015p0 = 17;
                Intent intent = new Intent(xi1Var.f43986b, VoIPService.class);
                intent.putExtra("user_id", xi1Var.d.f19950id);
                intent.putExtra("is_outgoing", true);
                intent.putExtra("start_incall_activity", false);
                intent.putExtra("video_call", false);
                intent.putExtra("can_video_call", false);
                intent.putExtra("account", xi1Var.f43983a);
                try {
                    xi1Var.f43986b.startService(intent);
                    return;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    return;
                }
            case 22:
                org.telegram.ui.Wallet.n7 n7Var = (org.telegram.ui.Wallet.n7) this.f40472b;
                n7Var.getClass();
                a2Var.dismiss();
                org.telegram.ui.Wallet.c7 c7Var = new org.telegram.ui.Wallet.c7();
                c7Var.f34590r = !((Boolean) this.f40473c).booleanValue();
                n7Var.presentFragment(c7Var);
                return;
            case 23:
                ((Runnable) this.f40472b).run();
                ((org.telegram.ui.ActionBar.e3) this.f40473c).dismiss();
                return;
            case 24:
                org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) this.f40473c;
                of.e g10 = a2Var.g(i10, true, true);
                g10.d();
                org.telegram.ui.Wallet.j7 j7Var = new org.telegram.ui.Wallet.j7((org.telegram.ui.Wallet.n7) this.f40472b, g10, 1);
                org.telegram.ui.Wallet.l0.E("disableBackupWithoutUpdatingPhrase");
                l0Var.h0(new org.telegram.messenger.camera.i((Object) l0Var, (Object) new jt(20, l0Var, j7Var), true, false, 2));
                return;
            case 26:
                org.telegram.ui.web.o.Y((org.telegram.ui.web.o) this.f40472b, (HashSet) this.f40473c);
                return;
            case 27:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) this.f40472b;
                TL_bots.allowSendMessage allowsendmessage = new TL_bots.allowSendMessage();
                allowsendmessage.bot = MessagesController.getInstance(b1Var.M).getInputUser(b1Var.U);
                ConnectionsManager.getInstance(b1Var.M).sendRequest(allowsendmessage, new ai.t5(b1Var, (String[]) this.f40473c, a2Var, 15));
                return;
        }
    }

    @Override
    public void g(pa.b bVar) {
        ((pa.a) this.f40472b).g(bVar);
        ((pa.a) this.f40473c).g(bVar);
    }

    @Override
    public void onSuccess(Object obj) {
        Integer num = (Integer) obj;
        FileLog.d("wear-auth: /token delivered to " + ((String) ((ci.u5) this.f40472b).f6065c));
        ((ci.d) this.f40473c).setLoading(false);
        oj1.d = null;
        org.telegram.ui.ActionBar.e3 e3Var = oj1.f40738c;
        if (e3Var != null) {
            e3Var.dismiss();
            oj1.f40738c = null;
        }
    }

    @Override
    public Object provide(Object obj) {
        jx0 jx0Var = (jx0) this.f40473c;
        Void r10 = (Void) obj;
        PremiumPreviewFragment premiumPreviewFragment = ((kx0) this.f40472b).d.f39869n;
        premiumPreviewFragment.f33982n0.d(0, 0.0f, 0, jx0Var.getMeasuredWidth(), -jx0Var.getTier().h, premiumPreviewFragment.O);
        return premiumPreviewFragment.f33982n0.f47401f;
    }

    @Override
    public void run(boolean z10) {
        TLRPC.Chat chat = (TLRPC.Chat) this.f40473c;
        hg1 hg1Var = ((rf1) this.f40472b).f41630b;
        NotificationCenter notificationCenter = hg1Var.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(hg1Var, i10);
        hg1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        hg1Var.finishFragment();
        hg1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-chat.f19803id), null, chat, Boolean.valueOf(z10));
    }

    @Override
    public void v(wk0 wk0Var) {
        ng1 ng1Var = ((kg1) this.f40472b).f39485a;
        ng1Var.f40415e.add(Integer.valueOf(((TLRPC.TL_forumTopic) this.f40473c).f19855id));
        ng1Var.V();
    }

    public ns0(uv0 uv0Var, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, ArrayList arrayList) {
        this.f40471a = 2;
        this.f40472b = uv0Var;
        this.f40473c = tL_messageMediaPoll;
    }

    public ns0(boolean[] zArr, JsPromptResult jsPromptResult) {
        this.f40471a = 28;
        this.f40473c = zArr;
        this.f40472b = jsPromptResult;
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.f40472b;
        Runnable runnable = (Runnable) this.f40473c;
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
    public void b0() {
    }

    @Override
    public void n0(View view, float f7, float f10) {
    }
}
