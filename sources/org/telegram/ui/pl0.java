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
public final class pl0 implements qt, org.telegram.ui.ActionBar.z1, FileLoader.FileResolver, org.telegram.ui.Components.b5, GenericProvider, MediaDataController.KeywordResultCallback, org.telegram.ui.Components.am0, org.telegram.ui.Components.bm0, gv0, MessagesStorage.BooleanCallback, b11 {
    public final int f40594a;
    public final Object f40595b;
    public final Object f40596c;

    public pl0(int i10, Object obj, Object obj2) {
        this.f40594a = i10;
        this.f40595b = obj;
        this.f40596c = obj2;
    }

    @Override
    public void C(int i10, int i11, boolean z10) {
        switch (this.f40594a) {
            case 7:
                hv0 hv0Var = ((zu0) this.f40595b).f44210a;
                hv0Var.f38037e0.a((TLRPC.TL_messageMediaToDo) this.f40596c);
                hv0Var.finishFragment();
                return;
            default:
                hv0 hv0Var2 = ((zu0) this.f40595b).f44210a;
                hv0Var2.f38037e0.a((TLRPC.TL_messageMediaPoll) this.f40596c);
                hv0Var2.finishFragment();
                return;
        }
    }

    @Override
    public void L0(lt ltVar) {
        zm0 zm0Var = (zm0) this.f40595b;
        int intValue = ((Integer) ((View) this.f40596c).getTag()).intValue();
        EditTextBoldCursor editTextBoldCursor = zm0Var.Y[intValue];
        if (intValue == 5) {
            zm0Var.f44164s = ltVar.d;
        } else {
            zm0Var.v = ltVar.d;
        }
        editTextBoldCursor.setText(ltVar.f39375a);
    }

    @Override
    public boolean P0(View view) {
        return false;
    }

    @Override
    public void a(TLRPC.MessageMedia messageMedia) {
        dd1 dd1Var = (dd1) this.f40595b;
        sn snVar = (sn) this.f40596c;
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.MessageMedia messageMedia2 = dd1Var.G.messageOwner.media;
            if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                ((TLRPC.TL_messageMediaToDo) messageMedia).completions = ((TLRPC.TL_messageMediaToDo) messageMedia2).completions;
            }
        }
        dd1Var.G.messageOwner.media = messageMedia;
        snVar.getSendMessagesHelper().editMessage(dd1Var.G, null, null, null, null, null, null, false, false, null);
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        ThemeActivity.W((ThemeActivity) this.f40595b, (Context) this.f40596c, view, i10, f7);
    }

    @Override
    public boolean d(int i10, View view) {
        String str;
        final ya1 ya1Var = (ya1) this.f40595b;
        final ab1 ab1Var = (ab1) this.f40596c;
        ThemeActivity themeActivity = ya1Var.e;
        if (i10 >= 0 && i10 < ab1Var.e.size()) {
            final org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) ab1Var.e.get(i10);
            if (i6Var.f20965a >= 100 && !i6Var.f20986z) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                String string = LocaleController.getString("OpenInEditor", R.string.OpenInEditor);
                String string2 = LocaleController.getString("ShareTheme", R.string.ShareTheme);
                TLRPC.TL_theme tL_theme = i6Var.f20979r;
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
                        ya1 ya1Var2 = ya1.this;
                        ThemeActivity themeActivity2 = ya1Var2.e;
                        if (themeActivity2.getParentActivity() != null) {
                            org.telegram.ui.ActionBar.i6 i6Var2 = i6Var;
                            int i12 = 2;
                            if (i11 == 0) {
                                if (i11 != 1) {
                                    i12 = 1;
                                }
                                org.telegram.ui.Components.d5.V(themeActivity2, i12, i6Var2.f20966b, i6Var2);
                            } else if (i11 == 1) {
                                if (i6Var2.f20979r == null) {
                                    themeActivity2.getMessagesController().saveThemeToServer(i6Var2.f20966b, i6Var2);
                                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, i6Var2.f20966b, i6Var2);
                                    return;
                                }
                                String str2 = "https://" + themeActivity2.getMessagesController().linkPrefix + "/addtheme/" + i6Var2.f20979r.slug;
                                themeActivity2.showDialog(new org.telegram.ui.Components.hr0(themeActivity2.getParentActivity(), null, str2, false, str2, false, null));
                            } else if (i11 == 2) {
                                themeActivity2.presentFragment(new tc1(i6Var2.f20966b, i6Var2, false));
                            } else if (i11 == 3 && themeActivity2.getParentActivity() != null) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(themeActivity2.getParentActivity());
                                String string3 = LocaleController.getString("DeleteThemeTitle", R.string.DeleteThemeTitle);
                                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder2.f20679a;
                                c2Var.R = string3;
                                c2Var.T = LocaleController.getString("DeleteThemeAlert", R.string.DeleteThemeAlert);
                                alertDialog$Builder2.k(LocaleController.getString("Delete", R.string.Delete), new e7(ya1Var2, ab1Var, i6Var2, 22));
                                alertDialog$Builder2.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                                themeActivity2.showDialog(c2Var);
                                TextView textView = (TextView) c2Var.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21422q7, null);
                                }
                            }
                        }
                    }
                };
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
                c2Var.P = charSequenceArr;
                c2Var.Q = iArr;
                c2Var.M = onClickListener;
                themeActivity.showDialog(c2Var);
                c2Var.m(c2Var.P0.size() - 1, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21422q7, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21405p7, false));
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
        switch (this.f40594a) {
            case 1:
                zm0.U((zm0) this.f40595b, (TLRPC.TL_auth_passwordRecovery) this.f40596c);
                return;
            case 2:
                ho0 ho0Var = (ho0) this.f40595b;
                ho0Var.f37918b0 = true;
                ho0Var.f37915a0.email_unconfirmed_pattern = (String) this.f40596c;
                ho0Var.J0();
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
                ((Runnable) this.f40595b).run();
                ((org.telegram.ui.ActionBar.h3) this.f40596c).dismiss();
                return;
            case 5:
                PhotoViewer.D(((as0) this.f40595b).f35833b, (ArrayList) this.f40596c);
                return;
            case 6:
                boolean[] zArr = (boolean[]) this.f40596c;
                PhotoViewer photoViewer = ((as0) this.f40595b).f35833b;
                ju0 ju0Var = photoViewer.d;
                ArrayList arrayList2 = photoViewer.f33551a7;
                ArrayList arrayList3 = photoViewer.f33580d7;
                ArrayList arrayList4 = photoViewer.Y6;
                ArrayList arrayList5 = photoViewer.e7;
                ArrayList arrayList6 = photoViewer.f7;
                if (!ju0Var.N()) {
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
                            arrayList9.add(Integer.valueOf(message.f20365id));
                            MessagesController.getInstance(photoViewer.T).deleteMessages(arrayList9, null, null, MessageObject.getDialogId(message), message.quick_reply_shortcut_id, true, 0);
                            NotificationCenter.getInstance(photoViewer.T).lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
                        }
                        if (photoViewer.K1()) {
                            if (photoViewer.f33775z5 > 0) {
                                MessagesController.getInstance(photoViewer.T).deleteUserPhoto(null);
                            } else {
                                MessagesController.getInstance(photoViewer.T).changeChatAvatar(-photoViewer.f33775z5, null, null, null, null, 0.0d, null, null, null, null);
                            }
                            photoViewer.H0(false, false);
                            return;
                        }
                        TLRPC.Photo photo = (TLRPC.Photo) arrayList6.get(photoViewer.P4);
                        if (photo != null) {
                            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                            tL_inputPhoto.f20363id = photo.f20368id;
                            tL_inputPhoto.access_hash = photo.access_hash;
                            byte[] bArr = photo.file_reference;
                            tL_inputPhoto.file_reference = bArr;
                            if (bArr == null) {
                                tL_inputPhoto.file_reference = new byte[0];
                            }
                            if (photoViewer.f33775z5 > 0) {
                                MessagesController.getInstance(photoViewer.T).deleteUserPhoto(tL_inputPhoto);
                            }
                            MessagesStorage.getInstance(photoViewer.T).clearUserPhoto(photoViewer.f33775z5, photo.f20368id);
                            arrayList2.remove(photoViewer.P4);
                            photoViewer.f33571c7.remove(photoViewer.P4);
                            photoViewer.f33561b7.remove(photoViewer.P4);
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
                ((PrivacyControlActivity) this.f40595b).t0();
                ((SharedPreferences) this.f40596c).edit().putBoolean("privacyAlertShowed", true).commit();
                return;
            case 11:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f40595b;
                TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
                boolean[] zArr2 = privacySettingsActivity.Z;
                tL_payments_clearSavedInfo.credentials = zArr2[1];
                tL_payments_clearSavedInfo.info = zArr2[0];
                privacySettingsActivity.getUserConfig().tmpPassword = null;
                privacySettingsActivity.getUserConfig().saveConfig(false);
                privacySettingsActivity.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new a50(21, privacySettingsActivity, (org.telegram.ui.Cells.w8) this.f40596c));
                return;
            case 12:
                ProfileActivity.l0((ProfileActivity) this.f40595b, (org.telegram.ui.Cells.z1[]) this.f40596c);
                return;
            case 13:
                mz0 mz0Var = (mz0) this.f40595b;
                TLRPC.User user = (TLRPC.User) this.f40596c;
                mz0Var.getClass();
                ArrayList<TLRPC.User> arrayList10 = new ArrayList<>();
                arrayList10.add(user);
                ProfileActivity profileActivity = mz0Var.f39679b;
                profileActivity.getContactsController().deleteContact(arrayList10, true);
                if (user != null) {
                    user.contact = false;
                    profileActivity.i5(false, false);
                    return;
                }
                return;
            case 16:
                k61 k61Var = (k61) this.f40595b;
                TLRPC.User user2 = (TLRPC.User) this.f40596c;
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    k61Var.dismiss();
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    e7 e7Var = new e7(k61Var, user2, twoStepVerificationActivity, 20);
                    twoStepVerificationActivity.Z = 0;
                    twoStepVerificationActivity.f34242b0 = e7Var;
                    U.presentFragment(twoStepVerificationActivity);
                    return;
                }
                return;
            case 17:
                ba1.m((ba1) this.f40595b, (ey) this.f40596c);
                return;
            case 18:
                ThemeActivity.X((ThemeActivity) this.f40595b, (n71) this.f40596c);
                return;
            case 21:
                ya1 ya1Var = (ya1) this.f40595b;
                org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) this.f40596c;
                ya1Var.getClass();
                MessagesController messagesController = MessagesController.getInstance(j6Var.E);
                if (j6Var == org.telegram.ui.ActionBar.k6.J) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                messagesController.saveTheme(j6Var, null, z10, true);
                HashMap hashMap = org.telegram.ui.ActionBar.k6.H;
                if (j6Var.f21022b == null) {
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
                    hashMap.remove(j6Var.f21020a);
                    org.telegram.ui.ActionBar.d6 d6Var = j6Var.f21032i0;
                    if (d6Var != null) {
                        org.telegram.ui.ActionBar.d6.a(d6Var);
                    }
                    org.telegram.ui.ActionBar.k6.F.remove(j6Var);
                    new File(j6Var.f21022b).delete();
                    org.telegram.ui.ActionBar.k6.v1(true, false);
                }
                if (z11) {
                    h5Var = ((org.telegram.ui.ActionBar.o2) ya1Var.e).parentLayout;
                    ((ActionBarLayout) h5Var).V(true, true);
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeListUpdated, new Object[0]);
                return;
            case 25:
                ag1.W((ag1) this.f40595b, (byte[]) this.f40596c);
                return;
            case 26:
                nh1 nh1Var = (nh1) this.f40595b;
                nh1Var.getClass();
                ((boolean[]) this.f40596c)[0] = true;
                nh1Var.f39857p0 = 17;
                Intent intent = new Intent(nh1Var.f39829b, VoIPService.class);
                intent.putExtra("user_id", nh1Var.d.f20491id);
                intent.putExtra("is_outgoing", true);
                intent.putExtra("start_incall_activity", false);
                intent.putExtra("video_call", false);
                intent.putExtra("can_video_call", false);
                intent.putExtra("account", nh1Var.f39826a);
                try {
                    nh1Var.f39829b.startService(intent);
                    return;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    return;
                }
            case 28:
                org.telegram.ui.Wallet.i8 i8Var = (org.telegram.ui.Wallet.i8) this.f40595b;
                i8Var.getClass();
                c2Var.dismiss();
                org.telegram.ui.Wallet.w7 w7Var = new org.telegram.ui.Wallet.w7();
                w7Var.f35357r = !((Boolean) this.f40596c).booleanValue();
                i8Var.presentFragment(w7Var);
                return;
        }
    }

    @Override
    public File getFile() {
        switch (this.f40594a) {
            case 3:
                return FileLoader.getInstance(((PhotoViewer) this.f40595b).T).getPathToAttach((TLObject) this.f40596c, true);
            default:
                return FileLoader.getInstance(((PhotoViewer) this.f40595b).T).getPathToMessage((TLRPC.Message) this.f40596c);
        }
    }

    @Override
    public Object provide(Object obj) {
        ow0 ow0Var = (ow0) this.f40596c;
        Void r10 = (Void) obj;
        PremiumPreviewFragment premiumPreviewFragment = ((pw0) this.f40595b).d.f40941n;
        premiumPreviewFragment.f33818n0.d(0, 0.0f, 0, ow0Var.getMeasuredWidth(), -ow0Var.getTier().h, premiumPreviewFragment.O);
        return premiumPreviewFragment.f33818n0.f46618f;
    }

    @Override
    public void r(hk0 hk0Var) {
        df1 df1Var = ((af1) this.f40595b).f35752a;
        df1Var.e.add(Integer.valueOf(((TLRPC.TL_forumTopic) this.f40596c).f20396id));
        df1Var.V();
    }

    @Override
    public void run(boolean z10) {
        TLRPC.Chat chat = (TLRPC.Chat) this.f40596c;
        xe1 xe1Var = ((ge1) this.f40595b).f37552b;
        NotificationCenter notificationCenter = xe1Var.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(xe1Var, i10);
        xe1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        xe1Var.finishFragment();
        xe1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-chat.f20344id), null, chat, Boolean.valueOf(z10));
    }

    public pl0(zu0 zu0Var, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, ArrayList arrayList) {
        this.f40594a = 8;
        this.f40595b = zu0Var;
        this.f40596c = tL_messageMediaPoll;
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.f40595b;
        Runnable runnable = (Runnable) this.f40596c;
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
