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
import java.util.HashSet;
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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class bs0 implements FileLoader.FileResolver, org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.f5, GenericProvider, MediaDataController.KeywordResultCallback, org.telegram.ui.Components.bm0, org.telegram.ui.Components.cm0, ew0, MessagesStorage.BooleanCallback, b21, OnSuccessListener {
    public final int f34380a;
    public final Object f34381b;
    public final Object f34382c;

    public bs0(int i10, Object obj, Object obj2) {
        this.f34380a = i10;
        this.f34381b = obj;
        this.f34382c = obj2;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        switch (this.f34380a) {
            case 3:
                fw0 fw0Var = ((xv0) this.f34381b).f41669a;
                fw0Var.f35986e0.b((TLRPC.TL_messageMediaToDo) this.f34382c);
                fw0Var.finishFragment();
                return;
            default:
                fw0 fw0Var2 = ((xv0) this.f34381b).f41669a;
                fw0Var2.f35986e0.b((TLRPC.TL_messageMediaPoll) this.f34382c);
                fw0Var2.finishFragment();
                return;
        }
    }

    @Override
    public boolean a(int i10, View view) {
        String str;
        final mc1 mc1Var = (mc1) this.f34381b;
        final oc1 oc1Var = (oc1) this.f34382c;
        ThemeActivity themeActivity = mc1Var.e;
        if (i10 >= 0 && i10 < oc1Var.e.size()) {
            final org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) oc1Var.e.get(i10);
            if (e6Var.f19445a >= 100 && !e6Var.f19466z) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                String string = LocaleController.getString("OpenInEditor", R.string.OpenInEditor);
                String string2 = LocaleController.getString("ShareTheme", R.string.ShareTheme);
                TLRPC.TL_theme tL_theme = e6Var.f19459r;
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
                        mc1 mc1Var2 = mc1.this;
                        ThemeActivity themeActivity2 = mc1Var2.e;
                        if (themeActivity2.getParentActivity() != null) {
                            org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                            int i12 = 2;
                            if (i11 == 0) {
                                if (i11 != 1) {
                                    i12 = 1;
                                }
                                org.telegram.ui.Components.g5.V(themeActivity2, i12, e6Var2.f19446b, e6Var2);
                            } else if (i11 == 1) {
                                if (e6Var2.f19459r == null) {
                                    themeActivity2.getMessagesController().saveThemeToServer(e6Var2.f19446b, e6Var2);
                                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, e6Var2.f19446b, e6Var2);
                                    return;
                                }
                                String str2 = "https://" + themeActivity2.getMessagesController().linkPrefix + "/addtheme/" + e6Var2.f19459r.slug;
                                themeActivity2.showDialog(new org.telegram.ui.Components.ir0(themeActivity2.getParentActivity(), null, str2, false, str2, false, null));
                            } else if (i11 == 2) {
                                themeActivity2.presentFragment(new he1(e6Var2.f19446b, e6Var2, false));
                            } else if (i11 == 3 && themeActivity2.getParentActivity() != null) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(themeActivity2.getParentActivity());
                                String string3 = LocaleController.getString("DeleteThemeTitle", R.string.DeleteThemeTitle);
                                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder2.f19248a;
                                a2Var.R = string3;
                                a2Var.T = LocaleController.getString("DeleteThemeAlert", R.string.DeleteThemeAlert);
                                alertDialog$Builder2.k(LocaleController.getString("Delete", R.string.Delete), new f7(mc1Var2, oc1Var, e6Var2, 22));
                                alertDialog$Builder2.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                                themeActivity2.showDialog(a2Var);
                                TextView textView = (TextView) a2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19839q7, false));
                                }
                            }
                        }
                    }
                };
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
                a2Var.P = charSequenceArr;
                a2Var.Q = iArr;
                a2Var.M = onClickListener;
                themeActivity.showDialog(a2Var);
                a2Var.l(a2Var.N0.size() - 1, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19839q7, false), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19822p7, false));
                return true;
            }
        }
        return false;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia) {
        re1 re1Var = (re1) this.f34381b;
        fo foVar = (fo) this.f34382c;
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.MessageMedia messageMedia2 = re1Var.G.messageOwner.media;
            if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                ((TLRPC.TL_messageMediaToDo) messageMedia).completions = ((TLRPC.TL_messageMediaToDo) messageMedia2).completions;
            }
        }
        re1Var.G.messageOwner.media = messageMedia;
        foVar.getSendMessagesHelper().editMessage(re1Var.G, null, null, null, null, null, null, false, false, null);
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        ThemeActivity.W((ThemeActivity) this.f34381b, (Context) this.f34382c, view, i10, f7);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        ArrayList arrayList;
        TLRPC.EncryptedChat encryptedChat;
        boolean z10;
        boolean z11;
        org.telegram.ui.ActionBar.b5 b5Var;
        switch (this.f34380a) {
            case 1:
                PhotoViewer.D(((ys0) this.f34381b).f41955b, (ArrayList) this.f34382c);
                return;
            case 2:
                boolean[] zArr = (boolean[]) this.f34382c;
                PhotoViewer photoViewer = ((ys0) this.f34381b).f41955b;
                hv0 hv0Var = photoViewer.d;
                ArrayList arrayList2 = photoViewer.f31897a7;
                ArrayList arrayList3 = photoViewer.f31926d7;
                ArrayList arrayList4 = photoViewer.Y6;
                ArrayList arrayList5 = photoViewer.e7;
                ArrayList arrayList6 = photoViewer.f7;
                if (!hv0Var.N()) {
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
                            arrayList9.add(Integer.valueOf(message.f18937id));
                            MessagesController.getInstance(photoViewer.T).deleteMessages(arrayList9, null, null, MessageObject.getDialogId(message), message.quick_reply_shortcut_id, true, 0);
                            NotificationCenter.getInstance(photoViewer.T).lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
                        }
                        if (photoViewer.J1()) {
                            if (photoViewer.f32121z5 > 0) {
                                MessagesController.getInstance(photoViewer.T).deleteUserPhoto(null);
                            } else {
                                MessagesController.getInstance(photoViewer.T).changeChatAvatar(-photoViewer.f32121z5, null, null, null, null, 0.0d, null, null, null, null);
                            }
                            photoViewer.G0(false, false);
                            return;
                        }
                        TLRPC.Photo photo = (TLRPC.Photo) arrayList6.get(photoViewer.P4);
                        if (photo != null) {
                            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                            tL_inputPhoto.f18935id = photo.f18940id;
                            tL_inputPhoto.access_hash = photo.access_hash;
                            byte[] bArr = photo.file_reference;
                            tL_inputPhoto.file_reference = bArr;
                            if (bArr == null) {
                                tL_inputPhoto.file_reference = new byte[0];
                            }
                            if (photoViewer.f32121z5 > 0) {
                                MessagesController.getInstance(photoViewer.T).deleteUserPhoto(tL_inputPhoto);
                            }
                            MessagesStorage.getInstance(photoViewer.T).clearUserPhoto(photoViewer.f32121z5, photo.f18940id);
                            arrayList2.remove(photoViewer.P4);
                            photoViewer.f31917c7.remove(photoViewer.P4);
                            photoViewer.f31907b7.remove(photoViewer.P4);
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
            case 3:
            case 4:
            case 5:
            case 10:
            case 11:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 23:
            case 27:
            default:
                org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) this.f34381b;
                TL_bots.allowSendMessage allowsendmessage = new TL_bots.allowSendMessage();
                allowsendmessage.bot = MessagesController.getInstance(c1Var.M).getInputUser(c1Var.U);
                ConnectionsManager.getInstance(c1Var.M).sendRequest(allowsendmessage, new bi.e5(c1Var, (String[]) this.f34382c, a2Var, 15));
                return;
            case 6:
                ((PrivacyControlActivity) this.f34381b).t0();
                ((SharedPreferences) this.f34382c).edit().putBoolean("privacyAlertShowed", true).commit();
                return;
            case 7:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f34381b;
                TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
                boolean[] zArr2 = privacySettingsActivity.Z;
                tL_payments_clearSavedInfo.credentials = zArr2[1];
                tL_payments_clearSavedInfo.info = zArr2[0];
                privacySettingsActivity.getUserConfig().tmpPassword = null;
                privacySettingsActivity.getUserConfig().saveConfig(false);
                privacySettingsActivity.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new ec0(14, privacySettingsActivity, (org.telegram.ui.Cells.w8) this.f34382c));
                return;
            case 8:
                ProfileActivity.c0((ProfileActivity) this.f34381b, (org.telegram.ui.Cells.a2[]) this.f34382c);
                return;
            case 9:
                m01 m01Var = (m01) this.f34381b;
                TLRPC.User user = (TLRPC.User) this.f34382c;
                m01Var.getClass();
                ArrayList<TLRPC.User> arrayList10 = new ArrayList<>();
                arrayList10.add(user);
                ProfileActivity profileActivity = m01Var.f37880b;
                profileActivity.getContactsController().deleteContact(arrayList10, true);
                if (user != null) {
                    user.contact = false;
                    profileActivity.e5(false, false);
                    return;
                }
                return;
            case 12:
                b81 b81Var = (b81) this.f34381b;
                TLRPC.User user2 = (TLRPC.User) this.f34382c;
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    b81Var.dismiss();
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    f7 f7Var = new f7(b81Var, user2, twoStepVerificationActivity, 20);
                    twoStepVerificationActivity.Z = 0;
                    twoStepVerificationActivity.f32584b0 = f7Var;
                    U.presentFragment(twoStepVerificationActivity);
                    return;
                }
                return;
            case 13:
                pb1.n((pb1) this.f34381b, (yy) this.f34382c);
                return;
            case 14:
                ThemeActivity.X((ThemeActivity) this.f34381b, (i11) this.f34382c);
                return;
            case 17:
                mc1 mc1Var = (mc1) this.f34381b;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.f34382c;
                mc1Var.getClass();
                MessagesController messagesController = MessagesController.getInstance(f6Var.E);
                if (f6Var == org.telegram.ui.ActionBar.g6.J) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                messagesController.saveTheme(f6Var, null, z10, true);
                HashMap hashMap = org.telegram.ui.ActionBar.g6.H;
                if (f6Var.f19493b == null) {
                    z11 = false;
                } else {
                    if (org.telegram.ui.ActionBar.g6.I == f6Var) {
                        org.telegram.ui.ActionBar.g6.t(org.telegram.ui.ActionBar.g6.L, true, false);
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (f6Var == org.telegram.ui.ActionBar.g6.J) {
                        org.telegram.ui.ActionBar.g6.J = (org.telegram.ui.ActionBar.f6) hashMap.get("Dark Blue");
                    }
                    f6Var.t();
                    org.telegram.ui.ActionBar.g6.G.remove(f6Var);
                    hashMap.remove(f6Var.f19491a);
                    org.telegram.ui.ActionBar.z5 z5Var = f6Var.f19503i0;
                    if (z5Var != null) {
                        org.telegram.ui.ActionBar.z5.a(z5Var);
                    }
                    org.telegram.ui.ActionBar.g6.F.remove(f6Var);
                    new File(f6Var.f19493b).delete();
                    org.telegram.ui.ActionBar.g6.t1(true, false);
                }
                if (z11) {
                    b5Var = ((org.telegram.ui.ActionBar.m2) mc1Var.e).parentLayout;
                    ((ActionBarLayout) b5Var).U(true, true);
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeListUpdated, new Object[0]);
                return;
            case 21:
                oh1.W((oh1) this.f34381b, (byte[]) this.f34382c);
                return;
            case 22:
                cj1 cj1Var = (cj1) this.f34381b;
                cj1Var.getClass();
                ((boolean[]) this.f34382c)[0] = true;
                cj1Var.f34707p0 = 17;
                Intent intent = new Intent(cj1Var.f34679b, VoIPService.class);
                intent.putExtra("user_id", cj1Var.d.f19063id);
                intent.putExtra("is_outgoing", true);
                intent.putExtra("start_incall_activity", false);
                intent.putExtra("video_call", false);
                intent.putExtra("can_video_call", false);
                intent.putExtra("account", cj1Var.f34676a);
                try {
                    cj1Var.f34679b.startService(intent);
                    return;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    return;
                }
            case 24:
                org.telegram.ui.Wallet.l7 l7Var = (org.telegram.ui.Wallet.l7) this.f34381b;
                l7Var.getClass();
                a2Var.dismiss();
                org.telegram.ui.Wallet.a7 a7Var = new org.telegram.ui.Wallet.a7();
                a7Var.f32674r = !((Boolean) this.f34382c).booleanValue();
                l7Var.presentFragment(a7Var);
                return;
            case 25:
                ((Runnable) this.f34381b).run();
                ((org.telegram.ui.ActionBar.e3) this.f34382c).dismiss();
                return;
            case 26:
                org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) this.f34382c;
                pf.c g10 = a2Var.g(i10, true, true);
                g10.d();
                org.telegram.ui.Wallet.h7 h7Var = new org.telegram.ui.Wallet.h7((org.telegram.ui.Wallet.l7) this.f34381b, g10, 1);
                org.telegram.ui.Wallet.k0.E("disableBackupWithoutUpdatingPhrase");
                k0Var.h0(new e2.o0((Object) k0Var, (Object) new mt(20, k0Var, h7Var), true, false, 3));
                return;
            case 28:
                org.telegram.ui.web.o.Y((org.telegram.ui.web.o) this.f34381b, (HashSet) this.f34382c);
                return;
        }
    }

    @Override
    public File getFile() {
        return FileLoader.getInstance(((PhotoViewer) this.f34381b).T).getPathToMessage((TLRPC.Message) this.f34382c);
    }

    @Override
    public void onSuccess(Object obj) {
        Integer num = (Integer) obj;
        FileLog.d("wear-auth: /token delivered to " + ((String) ((com.google.android.gms.internal.cast.z5) this.f34381b).f5428a));
        ((di.d) this.f34382c).setLoading(false);
        tj1.d = null;
        org.telegram.ui.ActionBar.e3 e3Var = tj1.f40134c;
        if (e3Var != null) {
            e3Var.dismiss();
            tj1.f40134c = null;
        }
    }

    @Override
    public Object provide(Object obj) {
        nx0 nx0Var = (nx0) this.f34382c;
        Void r10 = (Void) obj;
        PremiumPreviewFragment premiumPreviewFragment = ((ox0) this.f34381b).d.f39026n;
        premiumPreviewFragment.f32164n0.d(0, 0.0f, 0, nx0Var.getMeasuredWidth(), -nx0Var.getTier().h, premiumPreviewFragment.O);
        return premiumPreviewFragment.f32164n0.f45117f;
    }

    @Override
    public void run(boolean z10) {
        TLRPC.Chat chat = (TLRPC.Chat) this.f34382c;
        kg1 kg1Var = ((uf1) this.f34381b).f40392b;
        NotificationCenter notificationCenter = kg1Var.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(kg1Var, i10);
        kg1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        kg1Var.finishFragment();
        kg1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-chat.f18916id), null, chat, Boolean.valueOf(z10));
    }

    @Override
    public void v(zk0 zk0Var) {
        qg1 qg1Var = ((ng1) this.f34381b).f38393a;
        qg1Var.e.add(Integer.valueOf(((TLRPC.TL_forumTopic) this.f34382c).f18968id));
        qg1Var.V();
    }

    public bs0(xv0 xv0Var, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, ArrayList arrayList) {
        this.f34380a = 4;
        this.f34381b = xv0Var;
        this.f34382c = tL_messageMediaPoll;
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.f34381b;
        Runnable runnable = (Runnable) this.f34382c;
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
    public void p0(View view, float f7, float f10) {
    }
}
