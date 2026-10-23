package org.telegram.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.TextView;
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
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ql0 implements qt, org.telegram.ui.ActionBar.z1, FileLoader.FileResolver, org.telegram.ui.Components.d5, GenericProvider, MediaDataController.KeywordResultCallback, org.telegram.ui.Components.bm0, org.telegram.ui.Components.cm0, hv0, MessagesStorage.BooleanCallback, c11 {
    public final int f40862a;
    public final Object f40863b;
    public final Object f40864c;

    public ql0(int i10, Object obj, Object obj2) {
        this.f40862a = i10;
        this.f40863b = obj;
        this.f40864c = obj2;
    }

    @Override
    public void C(int i10, int i11, boolean z10) {
        switch (this.f40862a) {
            case 7:
                iv0 iv0Var = ((av0) this.f40863b).f35788a;
                iv0Var.f38380e0.a((TLRPC.TL_messageMediaToDo) this.f40864c);
                iv0Var.finishFragment();
                return;
            default:
                iv0 iv0Var2 = ((av0) this.f40863b).f35788a;
                iv0Var2.f38380e0.a((TLRPC.TL_messageMediaPoll) this.f40864c);
                iv0Var2.finishFragment();
                return;
        }
    }

    @Override
    public void L0(lt ltVar) {
        an0 an0Var = (an0) this.f40863b;
        int intValue = ((Integer) ((View) this.f40864c).getTag()).intValue();
        EditTextBoldCursor editTextBoldCursor = an0Var.Y[intValue];
        if (intValue == 5) {
            an0Var.f35741s = ltVar.d;
        } else {
            an0Var.v = ltVar.d;
        }
        editTextBoldCursor.setText(ltVar.f39322a);
    }

    @Override
    public boolean P0(View view) {
        return false;
    }

    @Override
    public void a(TLRPC.MessageMedia messageMedia) {
        ed1 ed1Var = (ed1) this.f40863b;
        sn snVar = (sn) this.f40864c;
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.MessageMedia messageMedia2 = ed1Var.G.messageOwner.media;
            if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                ((TLRPC.TL_messageMediaToDo) messageMedia).completions = ((TLRPC.TL_messageMediaToDo) messageMedia2).completions;
            }
        }
        ed1Var.G.messageOwner.media = messageMedia;
        snVar.getSendMessagesHelper().editMessage(ed1Var.G, null, null, null, null, null, null, false, false, null);
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        ThemeActivity.W((ThemeActivity) this.f40863b, (Context) this.f40864c, view, i10, f7);
    }

    @Override
    public boolean d(int i10, View view) {
        String str;
        final za1 za1Var = (za1) this.f40863b;
        final bb1 bb1Var = (bb1) this.f40864c;
        ThemeActivity themeActivity = za1Var.e;
        if (i10 >= 0 && i10 < bb1Var.e.size()) {
            final org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) bb1Var.e.get(i10);
            if (i6Var.f20964a >= 100 && !i6Var.f20985z) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                String string = LocaleController.getString("OpenInEditor", R.string.OpenInEditor);
                String string2 = LocaleController.getString("ShareTheme", R.string.ShareTheme);
                TLRPC.TL_theme tL_theme = i6Var.f20978r;
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
                        za1 za1Var2 = za1.this;
                        ThemeActivity themeActivity2 = za1Var2.e;
                        if (themeActivity2.getParentActivity() != null) {
                            org.telegram.ui.ActionBar.i6 i6Var2 = i6Var;
                            int i12 = 2;
                            if (i11 == 0) {
                                if (i11 != 1) {
                                    i12 = 1;
                                }
                                org.telegram.ui.Components.f5.W(themeActivity2, i12, i6Var2.f20965b, i6Var2);
                            } else if (i11 == 1) {
                                if (i6Var2.f20978r == null) {
                                    themeActivity2.getMessagesController().saveThemeToServer(i6Var2.f20965b, i6Var2);
                                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, i6Var2.f20965b, i6Var2);
                                    return;
                                }
                                String str2 = "https://" + themeActivity2.getMessagesController().linkPrefix + "/addtheme/" + i6Var2.f20978r.slug;
                                themeActivity2.showDialog(new org.telegram.ui.Components.ir0(themeActivity2.getParentActivity(), null, str2, false, str2, false, null));
                            } else if (i11 == 2) {
                                themeActivity2.presentFragment(new uc1(i6Var2.f20965b, i6Var2, false));
                            } else if (i11 == 3 && themeActivity2.getParentActivity() != null) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(themeActivity2.getParentActivity());
                                String string3 = LocaleController.getString("DeleteThemeTitle", R.string.DeleteThemeTitle);
                                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder2.f20678a;
                                c2Var.R = string3;
                                c2Var.T = LocaleController.getString("DeleteThemeAlert", R.string.DeleteThemeAlert);
                                alertDialog$Builder2.k(LocaleController.getString("Delete", R.string.Delete), new e7(za1Var2, bb1Var, i6Var2, 22));
                                alertDialog$Builder2.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                                themeActivity2.showDialog(c2Var);
                                TextView textView = (TextView) c2Var.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21421q7, null);
                                }
                            }
                        }
                    }
                };
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
                c2Var.P = charSequenceArr;
                c2Var.Q = iArr;
                c2Var.M = onClickListener;
                themeActivity.showDialog(c2Var);
                c2Var.m(c2Var.P0.size() - 1, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21421q7, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21404p7, false));
                return true;
            }
        }
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        ArrayList arrayList;
        TLRPC.EncryptedChat encryptedChat;
        boolean z10;
        boolean z11;
        org.telegram.ui.ActionBar.h5 h5Var;
        switch (this.f40862a) {
            case 1:
                an0.U((an0) this.f40863b, (TLRPC.TL_auth_passwordRecovery) this.f40864c);
                return;
            case 2:
                io0 io0Var = (io0) this.f40863b;
                io0Var.f38291b0 = true;
                io0Var.f38288a0.email_unconfirmed_pattern = (String) this.f40864c;
                io0Var.J0();
                return;
            case 3:
            case 4:
            case 7:
            case 8:
            case 9:
            case 14:
            case 15:
            case 19:
            case 20:
            case 22:
            case 23:
            case 24:
            case 27:
            default:
                ((Runnable) this.f40863b).run();
                ((org.telegram.ui.ActionBar.h3) this.f40864c).dismiss();
                return;
            case 5:
                PhotoViewer.D(((bs0) this.f40863b).f36162b, (ArrayList) this.f40864c);
                return;
            case 6:
                boolean[] zArr = (boolean[]) this.f40864c;
                PhotoViewer photoViewer = ((bs0) this.f40863b).f36162b;
                ku0 ku0Var = photoViewer.d;
                ArrayList arrayList2 = photoViewer.f33549a7;
                ArrayList arrayList3 = photoViewer.f33578d7;
                ArrayList arrayList4 = photoViewer.Y6;
                ArrayList arrayList5 = photoViewer.e7;
                ArrayList arrayList6 = photoViewer.f7;
                if (!ku0Var.N()) {
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
                            arrayList9.add(Integer.valueOf(message.f20364id));
                            MessagesController.getInstance(photoViewer.T).deleteMessages(arrayList9, null, null, MessageObject.getDialogId(message), message.quick_reply_shortcut_id, true, 0);
                            NotificationCenter.getInstance(photoViewer.T).lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
                        }
                        if (photoViewer.K1()) {
                            if (photoViewer.f33773z5 > 0) {
                                MessagesController.getInstance(photoViewer.T).deleteUserPhoto(null);
                            } else {
                                MessagesController.getInstance(photoViewer.T).changeChatAvatar(-photoViewer.f33773z5, null, null, null, null, 0.0d, null, null, null, null);
                            }
                            photoViewer.H0(false, false);
                            return;
                        }
                        TLRPC.Photo photo = (TLRPC.Photo) arrayList6.get(photoViewer.P4);
                        if (photo != null) {
                            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                            tL_inputPhoto.f20362id = photo.f20367id;
                            tL_inputPhoto.access_hash = photo.access_hash;
                            byte[] bArr = photo.file_reference;
                            tL_inputPhoto.file_reference = bArr;
                            if (bArr == null) {
                                tL_inputPhoto.file_reference = new byte[0];
                            }
                            if (photoViewer.f33773z5 > 0) {
                                MessagesController.getInstance(photoViewer.T).deleteUserPhoto(tL_inputPhoto);
                            }
                            MessagesStorage.getInstance(photoViewer.T).clearUserPhoto(photoViewer.f33773z5, photo.f20367id);
                            arrayList2.remove(photoViewer.P4);
                            photoViewer.f33569c7.remove(photoViewer.P4);
                            photoViewer.f33559b7.remove(photoViewer.P4);
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
            case 10:
                ((PrivacyControlActivity) this.f40863b).t0();
                ((SharedPreferences) this.f40864c).edit().putBoolean("privacyAlertShowed", true).commit();
                return;
            case 11:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f40863b;
                TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
                boolean[] zArr2 = privacySettingsActivity.Z;
                tL_payments_clearSavedInfo.credentials = zArr2[1];
                tL_payments_clearSavedInfo.info = zArr2[0];
                privacySettingsActivity.getUserConfig().tmpPassword = null;
                privacySettingsActivity.getUserConfig().saveConfig(false);
                privacySettingsActivity.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new a50(21, privacySettingsActivity, (org.telegram.ui.Cells.w8) this.f40864c));
                return;
            case 12:
                ProfileActivity.l0((ProfileActivity) this.f40863b, (org.telegram.ui.Cells.z1[]) this.f40864c);
                return;
            case 13:
                nz0 nz0Var = (nz0) this.f40863b;
                TLRPC.User user = (TLRPC.User) this.f40864c;
                nz0Var.getClass();
                ArrayList<TLRPC.User> arrayList10 = new ArrayList<>();
                arrayList10.add(user);
                ProfileActivity profileActivity = nz0Var.f40016b;
                profileActivity.getContactsController().deleteContact(arrayList10, true);
                if (user != null) {
                    user.contact = false;
                    profileActivity.i5(false, false);
                    return;
                }
                return;
            case 16:
                l61 l61Var = (l61) this.f40863b;
                TLRPC.User user2 = (TLRPC.User) this.f40864c;
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    l61Var.dismiss();
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    e7 e7Var = new e7(l61Var, user2, twoStepVerificationActivity, 20);
                    twoStepVerificationActivity.Z = 0;
                    twoStepVerificationActivity.f34240b0 = e7Var;
                    U.presentFragment(twoStepVerificationActivity);
                    return;
                }
                return;
            case 17:
                ca1.m((ca1) this.f40863b, (ey) this.f40864c);
                return;
            case 18:
                ThemeActivity.X((ThemeActivity) this.f40863b, (o71) this.f40864c);
                return;
            case 21:
                za1 za1Var = (za1) this.f40863b;
                org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) this.f40864c;
                za1Var.getClass();
                MessagesController messagesController = MessagesController.getInstance(j6Var.E);
                if (j6Var == org.telegram.ui.ActionBar.k6.J) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                messagesController.saveTheme(j6Var, null, z10, true);
                HashMap hashMap = org.telegram.ui.ActionBar.k6.H;
                if (j6Var.f21021b == null) {
                    z11 = false;
                } else {
                    if (org.telegram.ui.ActionBar.k6.I == j6Var) {
                        org.telegram.ui.ActionBar.k6.t(org.telegram.ui.ActionBar.k6.L, true, false);
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (j6Var == org.telegram.ui.ActionBar.k6.J) {
                        org.telegram.ui.ActionBar.k6.J = (org.telegram.ui.ActionBar.j6) hashMap.get("Dark Blue");
                    }
                    j6Var.t();
                    org.telegram.ui.ActionBar.k6.G.remove(j6Var);
                    hashMap.remove(j6Var.f21019a);
                    org.telegram.ui.ActionBar.d6 d6Var = j6Var.f21031i0;
                    if (d6Var != null) {
                        org.telegram.ui.ActionBar.d6.a(d6Var);
                    }
                    org.telegram.ui.ActionBar.k6.F.remove(j6Var);
                    new File(j6Var.f21021b).delete();
                    org.telegram.ui.ActionBar.k6.v1(true, false);
                }
                if (z11) {
                    h5Var = ((org.telegram.ui.ActionBar.o2) za1Var.e).parentLayout;
                    ((ActionBarLayout) h5Var).V(true, true);
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeListUpdated, new Object[0]);
                return;
            case 25:
                bg1.W((bg1) this.f40863b, (byte[]) this.f40864c);
                return;
            case 26:
                oh1 oh1Var = (oh1) this.f40863b;
                oh1Var.getClass();
                ((boolean[]) this.f40864c)[0] = true;
                oh1Var.f40194p0 = 17;
                Intent intent = new Intent(oh1Var.f40166b, VoIPService.class);
                intent.putExtra("user_id", oh1Var.d.f20490id);
                intent.putExtra("is_outgoing", true);
                intent.putExtra("start_incall_activity", false);
                intent.putExtra("video_call", false);
                intent.putExtra("can_video_call", false);
                intent.putExtra("account", oh1Var.f40163a);
                try {
                    oh1Var.f40166b.startService(intent);
                    return;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    return;
                }
            case 28:
                org.telegram.ui.Wallet.i8 i8Var = (org.telegram.ui.Wallet.i8) this.f40863b;
                i8Var.getClass();
                c2Var.dismiss();
                org.telegram.ui.Wallet.w7 w7Var = new org.telegram.ui.Wallet.w7();
                w7Var.f35355r = !((Boolean) this.f40864c).booleanValue();
                i8Var.presentFragment(w7Var);
                return;
        }
    }

    @Override
    public File getFile() {
        switch (this.f40862a) {
            case 3:
                return FileLoader.getInstance(((PhotoViewer) this.f40863b).T).getPathToAttach((TLObject) this.f40864c, true);
            default:
                return FileLoader.getInstance(((PhotoViewer) this.f40863b).T).getPathToMessage((TLRPC.Message) this.f40864c);
        }
    }

    @Override
    public Object provide(Object obj) {
        pw0 pw0Var = (pw0) this.f40864c;
        Void r10 = (Void) obj;
        PremiumPreviewFragment premiumPreviewFragment = ((qw0) this.f40863b).d.f41263n;
        premiumPreviewFragment.f33816n0.d(0, 0.0f, 0, pw0Var.getMeasuredWidth(), -pw0Var.getTier().h, premiumPreviewFragment.O);
        return premiumPreviewFragment.f33816n0.f46619f;
    }

    @Override
    public void r(ik0 ik0Var) {
        ef1 ef1Var = ((bf1) this.f40863b).f36074a;
        ef1Var.e.add(Integer.valueOf(((TLRPC.TL_forumTopic) this.f40864c).f20395id));
        ef1Var.V();
    }

    @Override
    public void run(boolean z10) {
        TLRPC.Chat chat = (TLRPC.Chat) this.f40864c;
        ye1 ye1Var = ((he1) this.f40863b).f37836b;
        NotificationCenter notificationCenter = ye1Var.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(ye1Var, i10);
        ye1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        ye1Var.finishFragment();
        ye1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-chat.f20343id), null, chat, Boolean.valueOf(z10));
    }

    public ql0(av0 av0Var, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, ArrayList arrayList) {
        this.f40862a = 8;
        this.f40863b = av0Var;
        this.f40864c = tL_messageMediaPoll;
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.f40863b;
        Runnable runnable = (Runnable) this.f40864c;
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
