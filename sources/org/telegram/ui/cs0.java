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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class cs0 implements FileLoader.FileResolver, org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.f5, GenericProvider, MediaDataController.KeywordResultCallback, org.telegram.ui.Components.bm0, org.telegram.ui.Components.cm0, fw0, MessagesStorage.BooleanCallback, b21, OnSuccessListener {
    public final int f35067a;
    public final Object f35068b;
    public final Object f35069c;

    public cs0(int i10, Object obj, Object obj2) {
        this.f35067a = i10;
        this.f35068b = obj;
        this.f35069c = obj2;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        switch (this.f35067a) {
            case 4:
                gw0 gw0Var = ((yv0) this.f35068b).f42288a;
                gw0Var.f36510e0.b((TLRPC.TL_messageMediaToDo) this.f35069c);
                gw0Var.finishFragment();
                return;
            default:
                gw0 gw0Var2 = ((yv0) this.f35068b).f42288a;
                gw0Var2.f36510e0.b((TLRPC.TL_messageMediaPoll) this.f35069c);
                gw0Var2.finishFragment();
                return;
        }
    }

    @Override
    public boolean a(int i10, View view) {
        String str;
        final mc1 mc1Var = (mc1) this.f35068b;
        final oc1 oc1Var = (oc1) this.f35069c;
        ThemeActivity themeActivity = mc1Var.e;
        if (i10 >= 0 && i10 < oc1Var.e.size()) {
            final org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) oc1Var.e.get(i10);
            if (e6Var.f19745a >= 100 && !e6Var.f19766z) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                String string = LocaleController.getString("OpenInEditor", R.string.OpenInEditor);
                String string2 = LocaleController.getString("ShareTheme", R.string.ShareTheme);
                TLRPC.TL_theme tL_theme = e6Var.f19759r;
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
                                org.telegram.ui.Components.g5.V(themeActivity2, i12, e6Var2.f19746b, e6Var2);
                            } else if (i11 == 1) {
                                if (e6Var2.f19759r == null) {
                                    themeActivity2.getMessagesController().saveThemeToServer(e6Var2.f19746b, e6Var2);
                                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, e6Var2.f19746b, e6Var2);
                                    return;
                                }
                                String str2 = "https://" + themeActivity2.getMessagesController().linkPrefix + "/addtheme/" + e6Var2.f19759r.slug;
                                themeActivity2.showDialog(new org.telegram.ui.Components.jr0(themeActivity2.getParentActivity(), null, str2, false, str2, false, null));
                            } else if (i11 == 2) {
                                themeActivity2.presentFragment(new he1(e6Var2.f19746b, e6Var2, false));
                            } else if (i11 == 3 && themeActivity2.getParentActivity() != null) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(themeActivity2.getParentActivity());
                                String string3 = LocaleController.getString("DeleteThemeTitle", R.string.DeleteThemeTitle);
                                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder2.f19548a;
                                a2Var.R = string3;
                                a2Var.T = LocaleController.getString("DeleteThemeAlert", R.string.DeleteThemeAlert);
                                alertDialog$Builder2.k(LocaleController.getString("Delete", R.string.Delete), new f7(mc1Var2, oc1Var, e6Var2, 22));
                                alertDialog$Builder2.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                                themeActivity2.showDialog(a2Var);
                                TextView textView = (TextView) a2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20139q7, false));
                                }
                            }
                        }
                    }
                };
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
                a2Var.P = charSequenceArr;
                a2Var.Q = iArr;
                a2Var.M = onClickListener;
                themeActivity.showDialog(a2Var);
                a2Var.l(a2Var.N0.size() - 1, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20139q7, false), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20122p7, false));
                return true;
            }
        }
        return false;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia) {
        se1 se1Var = (se1) this.f35068b;
        fo foVar = (fo) this.f35069c;
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.MessageMedia messageMedia2 = se1Var.G.messageOwner.media;
            if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                ((TLRPC.TL_messageMediaToDo) messageMedia).completions = ((TLRPC.TL_messageMediaToDo) messageMedia2).completions;
            }
        }
        se1Var.G.messageOwner.media = messageMedia;
        foVar.getSendMessagesHelper().editMessage(se1Var.G, null, null, null, null, null, null, false, false, null);
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        ThemeActivity.W((ThemeActivity) this.f35068b, (Context) this.f35069c, view, i10, f7);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        ArrayList arrayList;
        TLRPC.EncryptedChat encryptedChat;
        boolean z10;
        boolean z11;
        org.telegram.ui.ActionBar.b5 b5Var;
        switch (this.f35067a) {
            case 2:
                PhotoViewer.D(((zs0) this.f35068b).f42710b, (ArrayList) this.f35069c);
                return;
            case 3:
                boolean[] zArr = (boolean[]) this.f35069c;
                PhotoViewer photoViewer = ((zs0) this.f35068b).f42710b;
                iv0 iv0Var = photoViewer.d;
                ArrayList arrayList2 = photoViewer.f32195a7;
                ArrayList arrayList3 = photoViewer.f32224d7;
                ArrayList arrayList4 = photoViewer.Y6;
                ArrayList arrayList5 = photoViewer.e7;
                ArrayList arrayList6 = photoViewer.f7;
                if (!iv0Var.M()) {
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
                            arrayList9.add(Integer.valueOf(message.f19237id));
                            MessagesController.getInstance(photoViewer.T).deleteMessages(arrayList9, null, null, MessageObject.getDialogId(message), message.quick_reply_shortcut_id, true, 0);
                            NotificationCenter.getInstance(photoViewer.T).lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
                        }
                        if (photoViewer.J1()) {
                            if (photoViewer.f32419z5 > 0) {
                                MessagesController.getInstance(photoViewer.T).deleteUserPhoto(null);
                            } else {
                                MessagesController.getInstance(photoViewer.T).changeChatAvatar(-photoViewer.f32419z5, null, null, null, null, 0.0d, null, null, null, null);
                            }
                            photoViewer.G0(false, false);
                            return;
                        }
                        TLRPC.Photo photo = (TLRPC.Photo) arrayList6.get(photoViewer.P4);
                        if (photo != null) {
                            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                            tL_inputPhoto.f19235id = photo.f19240id;
                            tL_inputPhoto.access_hash = photo.access_hash;
                            byte[] bArr = photo.file_reference;
                            tL_inputPhoto.file_reference = bArr;
                            if (bArr == null) {
                                tL_inputPhoto.file_reference = new byte[0];
                            }
                            if (photoViewer.f32419z5 > 0) {
                                MessagesController.getInstance(photoViewer.T).deleteUserPhoto(tL_inputPhoto);
                            }
                            MessagesStorage.getInstance(photoViewer.T).clearUserPhoto(photoViewer.f32419z5, photo.f19240id);
                            arrayList2.remove(photoViewer.P4);
                            photoViewer.f32215c7.remove(photoViewer.P4);
                            photoViewer.f32205b7.remove(photoViewer.P4);
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
            case 4:
            case 5:
            case 6:
            case 11:
            case 12:
            case 16:
            case 17:
            case 19:
            case 20:
            case 21:
            case 24:
            default:
                org.telegram.ui.web.o.Y((org.telegram.ui.web.o) this.f35068b, (HashSet) this.f35069c);
                return;
            case 7:
                ((PrivacyControlActivity) this.f35068b).t0();
                ((SharedPreferences) this.f35069c).edit().putBoolean("privacyAlertShowed", true).commit();
                return;
            case 8:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f35068b;
                TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
                boolean[] zArr2 = privacySettingsActivity.Z;
                tL_payments_clearSavedInfo.credentials = zArr2[1];
                tL_payments_clearSavedInfo.info = zArr2[0];
                privacySettingsActivity.getUserConfig().tmpPassword = null;
                privacySettingsActivity.getUserConfig().saveConfig(false);
                privacySettingsActivity.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new fc0(14, privacySettingsActivity, (org.telegram.ui.Cells.w8) this.f35069c));
                return;
            case 9:
                ProfileActivity.c0((ProfileActivity) this.f35068b, (org.telegram.ui.Cells.a2[]) this.f35069c);
                return;
            case 10:
                n01 n01Var = (n01) this.f35068b;
                TLRPC.User user = (TLRPC.User) this.f35069c;
                n01Var.getClass();
                ArrayList<TLRPC.User> arrayList10 = new ArrayList<>();
                arrayList10.add(user);
                ProfileActivity profileActivity = n01Var.f38393b;
                profileActivity.getContactsController().deleteContact(arrayList10, true);
                if (user != null) {
                    user.contact = false;
                    profileActivity.e5(false, false);
                    return;
                }
                return;
            case 13:
                b81 b81Var = (b81) this.f35068b;
                TLRPC.User user2 = (TLRPC.User) this.f35069c;
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    b81Var.dismiss();
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    f7 f7Var = new f7(b81Var, user2, twoStepVerificationActivity, 20);
                    twoStepVerificationActivity.Z = 0;
                    twoStepVerificationActivity.f32882b0 = f7Var;
                    U.presentFragment(twoStepVerificationActivity);
                    return;
                }
                return;
            case 14:
                pb1.n((pb1) this.f35068b, (yy) this.f35069c);
                return;
            case 15:
                ThemeActivity.X((ThemeActivity) this.f35068b, (hz0) this.f35069c);
                return;
            case 18:
                mc1 mc1Var = (mc1) this.f35068b;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.f35069c;
                mc1Var.getClass();
                MessagesController messagesController = MessagesController.getInstance(f6Var.E);
                if (f6Var == org.telegram.ui.ActionBar.g6.J) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                messagesController.saveTheme(f6Var, null, z10, true);
                HashMap hashMap = org.telegram.ui.ActionBar.g6.H;
                if (f6Var.f19793b == null) {
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
                    hashMap.remove(f6Var.f19791a);
                    org.telegram.ui.ActionBar.z5 z5Var = f6Var.f19803i0;
                    if (z5Var != null) {
                        org.telegram.ui.ActionBar.z5.a(z5Var);
                    }
                    org.telegram.ui.ActionBar.g6.F.remove(f6Var);
                    new File(f6Var.f19793b).delete();
                    org.telegram.ui.ActionBar.g6.t1(true, false);
                }
                if (z11) {
                    b5Var = ((org.telegram.ui.ActionBar.m2) mc1Var.e).parentLayout;
                    ((ActionBarLayout) b5Var).U(true, true);
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeListUpdated, new Object[0]);
                return;
            case 22:
                oh1.W((oh1) this.f35068b, (byte[]) this.f35069c);
                return;
            case 23:
                dj1 dj1Var = (dj1) this.f35068b;
                dj1Var.getClass();
                ((boolean[]) this.f35069c)[0] = true;
                dj1Var.f35305p0 = 17;
                Intent intent = new Intent(dj1Var.f35277b, VoIPService.class);
                intent.putExtra("user_id", dj1Var.d.f19363id);
                intent.putExtra("is_outgoing", true);
                intent.putExtra("start_incall_activity", false);
                intent.putExtra("video_call", false);
                intent.putExtra("can_video_call", false);
                intent.putExtra("account", dj1Var.f35274a);
                try {
                    dj1Var.f35277b.startService(intent);
                    return;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    return;
                }
            case 25:
                org.telegram.ui.Wallet.k7 k7Var = (org.telegram.ui.Wallet.k7) this.f35068b;
                k7Var.getClass();
                a2Var.dismiss();
                org.telegram.ui.Wallet.z6 z6Var = new org.telegram.ui.Wallet.z6();
                z6Var.f33957r = !((Boolean) this.f35069c).booleanValue();
                k7Var.presentFragment(z6Var);
                return;
            case 26:
                ((Runnable) this.f35068b).run();
                ((org.telegram.ui.ActionBar.e3) this.f35069c).dismiss();
                return;
            case 27:
                org.telegram.ui.Wallet.j0 j0Var = (org.telegram.ui.Wallet.j0) this.f35069c;
                pf.c g10 = a2Var.g(i10, true, true);
                g10.d();
                org.telegram.ui.Wallet.g7 g7Var = new org.telegram.ui.Wallet.g7((org.telegram.ui.Wallet.k7) this.f35068b, g10, 1);
                org.telegram.ui.Wallet.j0.E("disableBackupWithoutUpdatingPhrase");
                j0Var.h0(new e2.o0((Object) j0Var, (Object) new mt(20, j0Var, g7Var), true, false, 3));
                return;
        }
    }

    @Override
    public File getFile() {
        switch (this.f35067a) {
            case 0:
                return FileLoader.getInstance(((PhotoViewer) this.f35068b).T).getPathToAttach((TLObject) this.f35069c, true);
            default:
                return FileLoader.getInstance(((PhotoViewer) this.f35068b).T).getPathToMessage((TLRPC.Message) this.f35069c);
        }
    }

    @Override
    public void onSuccess(Object obj) {
        Integer num = (Integer) obj;
        FileLog.d("wear-auth: /token delivered to " + ((String) ((com.google.android.gms.internal.cast.z5) this.f35068b).f5425a));
        ((di.d) this.f35069c).setLoading(false);
        uj1.d = null;
        org.telegram.ui.ActionBar.e3 e3Var = uj1.f40693c;
        if (e3Var != null) {
            e3Var.dismiss();
            uj1.f40693c = null;
        }
    }

    @Override
    public Object provide(Object obj) {
        nx0 nx0Var = (nx0) this.f35069c;
        Void r10 = (Void) obj;
        PremiumPreviewFragment premiumPreviewFragment = ((ox0) this.f35068b).d.f39304n;
        premiumPreviewFragment.f32462n0.d(0, 0.0f, 0, nx0Var.getMeasuredWidth(), -nx0Var.getTier().h, premiumPreviewFragment.O);
        return premiumPreviewFragment.f32462n0.f45117f;
    }

    @Override
    public void run(boolean z10) {
        TLRPC.Chat chat = (TLRPC.Chat) this.f35069c;
        lg1 lg1Var = ((vf1) this.f35068b).f40985b;
        NotificationCenter notificationCenter = lg1Var.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(lg1Var, i10);
        lg1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        lg1Var.finishFragment();
        lg1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-chat.f19216id), null, chat, Boolean.valueOf(z10));
    }

    @Override
    public void v(al0 al0Var) {
        rg1 rg1Var = ((og1) this.f35068b).f38954a;
        rg1Var.e.add(Integer.valueOf(((TLRPC.TL_forumTopic) this.f35069c).f19268id));
        rg1Var.V();
    }

    public cs0(yv0 yv0Var, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, ArrayList arrayList) {
        this.f35067a = 5;
        this.f35068b = yv0Var;
        this.f35069c = tL_messageMediaPoll;
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.f35068b;
        Runnable runnable = (Runnable) this.f35069c;
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
