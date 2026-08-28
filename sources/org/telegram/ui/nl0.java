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
import org.telegram.ui.Components.EditTextBoldCursor;
public final class nl0 implements org.telegram.ui.ActionBar.b2, pt, FileLoader.FileResolver, org.telegram.ui.Components.x4, GenericProvider, MediaDataController.KeywordResultCallback, org.telegram.ui.Components.nk0, org.telegram.ui.Components.ok0, wu0, MessagesStorage.BooleanCallback, r01, OnSuccessListener {
    public final int f40771a;
    public final Object f40772b;
    public final Object f40773c;

    public nl0(int i9, Object obj, Object obj2) {
        this.f40771a = i9;
        this.f40772b = obj;
        this.f40773c = obj2;
    }

    @Override
    public void B(int i9, int i10, boolean z10) {
        switch (this.f40771a) {
            case 9:
                xu0 xu0Var = ((pu0) this.f40772b).f41591a;
                xu0Var.f44608a0.b((TLRPC.TL_messageMediaToDo) this.f40773c);
                xu0Var.finishFragment();
                return;
            default:
                xu0 xu0Var2 = ((pu0) this.f40772b).f41591a;
                xu0Var2.f44608a0.b((TLRPC.TL_messageMediaPoll) this.f40773c);
                xu0Var2.finishFragment();
                return;
        }
    }

    @Override
    public boolean a(int i9, View view) {
        String str;
        final xa1 xa1Var = (xa1) this.f40772b;
        final za1 za1Var = (za1) this.f40773c;
        ThemeActivity themeActivity = xa1Var.f44444e;
        if (i9 >= 0 && i9 < za1Var.f45098e.size()) {
            final org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) za1Var.f45098e.get(i9);
            if (d6Var.f22866a >= 100 && !d6Var.f22888z) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                String string = LocaleController.getString("OpenInEditor", R.string.OpenInEditor);
                String string2 = LocaleController.getString("ShareTheme", R.string.ShareTheme);
                TLRPC.TL_theme tL_theme = d6Var.f22881r;
                if (tL_theme != null && tL_theme.creator) {
                    str = LocaleController.getString("ThemeSetUrl", R.string.ThemeSetUrl);
                } else {
                    str = null;
                }
                CharSequence[] charSequenceArr = {string, string2, str, LocaleController.getString("DeleteTheme", R.string.DeleteTheme)};
                int[] iArr = {R.drawable.msg_edit, R.drawable.msg_share, R.drawable.msg_link, R.drawable.msg_delete};
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        xa1 xa1Var2 = xa1.this;
                        ThemeActivity themeActivity2 = xa1Var2.f44444e;
                        if (themeActivity2.getParentActivity() != null) {
                            org.telegram.ui.ActionBar.d6 d6Var2 = d6Var;
                            int i11 = 2;
                            if (i10 == 0) {
                                if (i10 != 1) {
                                    i11 = 1;
                                }
                                org.telegram.ui.Components.y4.W(themeActivity2, i11, d6Var2.f22867b, d6Var2);
                            } else if (i10 == 1) {
                                if (d6Var2.f22881r == null) {
                                    themeActivity2.getMessagesController().saveThemeToServer(d6Var2.f22867b, d6Var2);
                                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, d6Var2.f22867b, d6Var2);
                                    return;
                                }
                                String str2 = "https://" + themeActivity2.getMessagesController().linkPrefix + "/addtheme/" + d6Var2.f22881r.slug;
                                themeActivity2.showDialog(new org.telegram.ui.Components.rp0(themeActivity2.getParentActivity(), null, str2, false, str2, false, null));
                            } else if (i10 == 2) {
                                themeActivity2.presentFragment(new tc1(d6Var2.f22867b, d6Var2, false));
                            } else if (i10 == 3 && themeActivity2.getParentActivity() != null) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(themeActivity2.getParentActivity());
                                String string3 = LocaleController.getString("DeleteThemeTitle", R.string.DeleteThemeTitle);
                                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder2.f22702a;
                                c2Var.N = string3;
                                c2Var.P = LocaleController.getString("DeleteThemeAlert", R.string.DeleteThemeAlert);
                                alertDialog$Builder2.k(LocaleController.getString("Delete", R.string.Delete), new a7(xa1Var2, za1Var, d6Var2, 22));
                                alertDialog$Builder2.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                                themeActivity2.showDialog(c2Var);
                                TextView textView = (TextView) c2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23230q7, false));
                                }
                            }
                        }
                    }
                };
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                c2Var.L = charSequenceArr;
                c2Var.M = iArr;
                c2Var.I = onClickListener;
                themeActivity.showDialog(c2Var);
                c2Var.l(c2Var.J0.size() - 1, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23230q7, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23212p7, false));
                return true;
            }
        }
        return false;
    }

    @Override
    public void a1(lt ltVar) {
        wm0 wm0Var = (wm0) this.f40772b;
        int intValue = ((Integer) ((View) this.f40773c).getTag()).intValue();
        EditTextBoldCursor editTextBoldCursor = wm0Var.U[intValue];
        if (intValue == 5) {
            wm0Var.f44189s = ltVar.d;
        } else {
            wm0Var.v = ltVar.d;
        }
        editTextBoldCursor.setText(ltVar.f40225a);
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia) {
        dd1 dd1Var = (dd1) this.f40772b;
        qn qnVar = (qn) this.f40773c;
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.MessageMedia messageMedia2 = dd1Var.C.messageOwner.media;
            if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                ((TLRPC.TL_messageMediaToDo) messageMedia).completions = ((TLRPC.TL_messageMediaToDo) messageMedia2).completions;
            }
        }
        dd1Var.C.messageOwner.media = messageMedia;
        qnVar.getSendMessagesHelper().editMessage(dd1Var.C, null, null, null, null, null, null, false, false, null);
    }

    @Override
    public void c(float f10, float f11, int i9, View view) {
        ThemeActivity.V((ThemeActivity) this.f40772b, (Context) this.f40773c, view, i9, f10);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        ArrayList arrayList;
        TLRPC.EncryptedChat encryptedChat;
        boolean z10;
        boolean z11;
        org.telegram.ui.ActionBar.b5 b5Var;
        switch (this.f40771a) {
            case 0:
                wm0 wm0Var = (wm0) this.f40772b;
                boolean[] zArr = (boolean[]) this.f40773c;
                if (!wm0Var.f44187r0) {
                    wm0Var.f44181o1.clear();
                }
                wm0Var.f44183p1.clear();
                am0 am0Var = (am0) wm0Var.f44203x1;
                am0Var.d.j1(wm0Var.A, wm0Var.B, wm0Var.C, zArr[0], null, null, am0Var.f36521b);
                wm0Var.finishFragment();
                return;
            case 1:
                int[] iArr = ((wm0) this.f40772b).f44201x;
                iArr[2] = 0;
                iArr[1] = 0;
                iArr[0] = 0;
                ((EditTextBoldCursor) this.f40773c).setText(LocaleController.getString(R.string.PassportNoExpireDate));
                return;
            case 2:
            case 5:
            case 6:
            case 9:
            case 10:
            case 11:
            case 16:
            case 17:
            case 21:
            case 22:
            case 24:
            case 25:
            case 26:
            default:
                mh1 mh1Var = (mh1) this.f40772b;
                mh1Var.getClass();
                ((boolean[]) this.f40773c)[0] = true;
                mh1Var.f40453l0 = 17;
                Intent intent = new Intent(mh1Var.f40431b, VoIPService.class);
                intent.putExtra("user_id", mh1Var.d.f22527id);
                intent.putExtra("is_outgoing", true);
                intent.putExtra("start_incall_activity", false);
                intent.putExtra("video_call", false);
                intent.putExtra("can_video_call", false);
                intent.putExtra("account", mh1Var.f40428a);
                try {
                    mh1Var.f40431b.startService(intent);
                    return;
                } catch (Throwable th) {
                    FileLog.e(th);
                    return;
                }
            case 3:
                wm0.T((wm0) this.f40772b, (TLRPC.TL_auth_passwordRecovery) this.f40773c);
                return;
            case 4:
                co0 co0Var = (co0) this.f40772b;
                co0Var.X = true;
                co0Var.W.email_unconfirmed_pattern = (String) this.f40773c;
                co0Var.I0();
                return;
            case 7:
                PhotoViewer.C(((pr0) this.f40772b).f41587b, (ArrayList) this.f40773c);
                return;
            case 8:
                boolean[] zArr2 = (boolean[]) this.f40773c;
                PhotoViewer photoViewer = ((pr0) this.f40772b).f41587b;
                zt0 zt0Var = photoViewer.d;
                ArrayList arrayList2 = photoViewer.W6;
                ArrayList arrayList3 = photoViewer.Z6;
                ArrayList arrayList4 = photoViewer.U6;
                ArrayList arrayList5 = photoViewer.f35585a7;
                ArrayList arrayList6 = photoViewer.f35595b7;
                if (!zt0Var.M()) {
                    photoViewer.F0(false, false);
                    return;
                } else if (!arrayList4.isEmpty()) {
                    int i10 = photoViewer.L4;
                    if (i10 >= 0 && i10 < arrayList4.size()) {
                        MessageObject messageObject = (MessageObject) arrayList4.get(photoViewer.L4);
                        if (messageObject.isSent()) {
                            photoViewer.F0(false, false);
                            ArrayList arrayList7 = new ArrayList();
                            int i11 = photoViewer.v;
                            if (i11 != 0) {
                                arrayList7.add(Integer.valueOf(i11));
                            } else {
                                arrayList7.add(Integer.valueOf(messageObject.getId()));
                            }
                            if (DialogObject.isEncryptedDialog(messageObject.getDialogId()) && messageObject.messageOwner.random_id != 0) {
                                ArrayList arrayList8 = new ArrayList();
                                arrayList8.add(Long.valueOf(messageObject.messageOwner.random_id));
                                encryptedChat = MessagesController.getInstance(photoViewer.P).getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(messageObject.getDialogId())));
                                arrayList = arrayList8;
                            } else {
                                arrayList = null;
                                encryptedChat = null;
                            }
                            MessagesController.getInstance(photoViewer.P).deleteMessages(arrayList7, arrayList, encryptedChat, messageObject.getDialogId(), messageObject.getQuickReplyId(), zArr2[0], messageObject.getChatMode());
                            return;
                        }
                        return;
                    }
                    return;
                } else if (!arrayList6.isEmpty()) {
                    int i12 = photoViewer.L4;
                    if (i12 >= 0 && i12 < arrayList6.size()) {
                        TLRPC.Message message = (TLRPC.Message) arrayList3.get(photoViewer.L4);
                        if (message != null) {
                            ArrayList<Integer> arrayList9 = new ArrayList<>();
                            arrayList9.add(Integer.valueOf(message.f22401id));
                            MessagesController.getInstance(photoViewer.P).deleteMessages(arrayList9, null, null, MessageObject.getDialogId(message), message.quick_reply_shortcut_id, true, 0);
                            NotificationCenter.getInstance(photoViewer.P).lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
                        }
                        if (photoViewer.I1()) {
                            if (photoViewer.f35774v5 > 0) {
                                MessagesController.getInstance(photoViewer.P).deleteUserPhoto(null);
                            } else {
                                MessagesController.getInstance(photoViewer.P).changeChatAvatar(-photoViewer.f35774v5, null, null, null, null, 0.0d, null, null, null, null);
                            }
                            photoViewer.F0(false, false);
                            return;
                        }
                        TLRPC.Photo photo = (TLRPC.Photo) arrayList6.get(photoViewer.L4);
                        if (photo != null) {
                            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                            tL_inputPhoto.f22399id = photo.f22404id;
                            tL_inputPhoto.access_hash = photo.access_hash;
                            byte[] bArr = photo.file_reference;
                            tL_inputPhoto.file_reference = bArr;
                            if (bArr == null) {
                                tL_inputPhoto.file_reference = new byte[0];
                            }
                            if (photoViewer.f35774v5 > 0) {
                                MessagesController.getInstance(photoViewer.P).deleteUserPhoto(tL_inputPhoto);
                            }
                            MessagesStorage.getInstance(photoViewer.P).clearUserPhoto(photoViewer.f35774v5, photo.f22404id);
                            arrayList2.remove(photoViewer.L4);
                            photoViewer.Y6.remove(photoViewer.L4);
                            photoViewer.X6.remove(photoViewer.L4);
                            arrayList3.remove(photoViewer.L4);
                            arrayList6.remove(photoViewer.L4);
                            if (arrayList2.isEmpty()) {
                                photoViewer.F0(false, false);
                            } else {
                                int i13 = photoViewer.L4;
                                if (i13 >= arrayList6.size()) {
                                    i13 = arrayList6.size() - 1;
                                }
                                photoViewer.L4 = -1;
                                photoViewer.B2(i13);
                            }
                            if (message == null) {
                                NotificationCenter.getInstance(photoViewer.P).lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                } else if (!arrayList5.isEmpty() && photoViewer.d != null) {
                    arrayList5.remove(photoViewer.L4);
                    photoViewer.d.B(photoViewer.L4);
                    if (arrayList5.isEmpty()) {
                        photoViewer.F0(false, false);
                        return;
                    }
                    int i14 = photoViewer.L4;
                    if (i14 >= arrayList5.size()) {
                        i14 = arrayList5.size() - 1;
                    }
                    photoViewer.L4 = -1;
                    photoViewer.B2(i14);
                    return;
                } else {
                    return;
                }
            case 12:
                ((PrivacyControlActivity) this.f40772b).s0();
                ((SharedPreferences) this.f40773c).edit().putBoolean("privacyAlertShowed", true).commit();
                return;
            case 13:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f40772b;
                TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
                boolean[] zArr3 = privacySettingsActivity.V;
                tL_payments_clearSavedInfo.credentials = zArr3[1];
                tL_payments_clearSavedInfo.info = zArr3[0];
                privacySettingsActivity.getUserConfig().tmpPassword = null;
                privacySettingsActivity.getUserConfig().saveConfig(false);
                privacySettingsActivity.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new v40(21, privacySettingsActivity, (org.telegram.ui.Cells.t8) this.f40773c));
                return;
            case 14:
                ProfileActivity.b0((ProfileActivity) this.f40772b, (org.telegram.ui.Cells.z1[]) this.f40773c);
                return;
            case 15:
                dz0 dz0Var = (dz0) this.f40772b;
                TLRPC.User user = (TLRPC.User) this.f40773c;
                dz0Var.getClass();
                ArrayList<TLRPC.User> arrayList10 = new ArrayList<>();
                arrayList10.add(user);
                ProfileActivity profileActivity = dz0Var.f37761b;
                profileActivity.getContactsController().deleteContact(arrayList10, true);
                if (user != null) {
                    user.contact = false;
                    profileActivity.e5(false, false);
                    return;
                }
                return;
            case 18:
                l61 l61Var = (l61) this.f40772b;
                TLRPC.User user2 = (TLRPC.User) this.f40773c;
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    l61Var.dismiss();
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    a7 a7Var = new a7(l61Var, user2, twoStepVerificationActivity, 20);
                    twoStepVerificationActivity.V = 0;
                    twoStepVerificationActivity.X = a7Var;
                    U.presentFragment(twoStepVerificationActivity);
                    return;
                }
                return;
            case 19:
                aa1.m((aa1) this.f40772b, (dy) this.f40773c);
                return;
            case 20:
                ThemeActivity.W((ThemeActivity) this.f40772b, (n21) this.f40773c);
                return;
            case 23:
                xa1 xa1Var = (xa1) this.f40772b;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.f40773c;
                xa1Var.getClass();
                MessagesController messagesController = MessagesController.getInstance(e6Var.A);
                if (e6Var == org.telegram.ui.ActionBar.f6.J) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                messagesController.saveTheme(e6Var, null, z10, true);
                HashMap hashMap = org.telegram.ui.ActionBar.f6.H;
                if (e6Var.f22908b == null) {
                    z11 = false;
                } else {
                    if (org.telegram.ui.ActionBar.f6.I == e6Var) {
                        org.telegram.ui.ActionBar.f6.t(org.telegram.ui.ActionBar.f6.L, true, false);
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (e6Var == org.telegram.ui.ActionBar.f6.J) {
                        org.telegram.ui.ActionBar.f6.J = (org.telegram.ui.ActionBar.e6) hashMap.get("Dark Blue");
                    }
                    e6Var.t();
                    org.telegram.ui.ActionBar.f6.G.remove(e6Var);
                    hashMap.remove(e6Var.f22906a);
                    org.telegram.ui.ActionBar.y5 y5Var = e6Var.f22914e0;
                    if (y5Var != null) {
                        org.telegram.ui.ActionBar.y5.a(y5Var);
                    }
                    org.telegram.ui.ActionBar.f6.F.remove(e6Var);
                    new File(e6Var.f22908b).delete();
                    org.telegram.ui.ActionBar.f6.s1(true, false);
                }
                if (z11) {
                    b5Var = ((org.telegram.ui.ActionBar.o2) xa1Var.f44444e).parentLayout;
                    ((ActionBarLayout) b5Var).U(true, true);
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeListUpdated, new Object[0]);
                return;
            case 27:
                ag1.V((ag1) this.f40772b, (byte[]) this.f40773c);
                return;
        }
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public void g(ek0 ek0Var) {
        df1 df1Var = ((af1) this.f40772b).f36475a;
        df1Var.f37533e.add(Integer.valueOf(((TLRPC.TL_forumTopic) this.f40773c).f22432id));
        df1Var.U();
    }

    @Override
    public File getFile() {
        switch (this.f40771a) {
            case 5:
                return FileLoader.getInstance(((PhotoViewer) this.f40772b).P).getPathToAttach((TLObject) this.f40773c, true);
            default:
                return FileLoader.getInstance(((PhotoViewer) this.f40772b).P).getPathToMessage((TLRPC.Message) this.f40773c);
        }
    }

    @Override
    public void onSuccess(Object obj) {
        Integer num = (Integer) obj;
        FileLog.d("wear-auth: /token delivered to " + ((String) ((b3.b) this.f40772b).f1415c));
        ((kh.d) this.f40773c).setLoading(false);
        di1.d = null;
        org.telegram.ui.ActionBar.f3 f3Var = di1.f37553c;
        if (f3Var != null) {
            f3Var.dismiss();
            di1.f37553c = null;
        }
    }

    @Override
    public Object provide(Object obj) {
        dw0 dw0Var = (dw0) this.f40773c;
        Void r10 = (Void) obj;
        PremiumPreviewFragment premiumPreviewFragment = ((ew0) this.f40772b).d.f38361n;
        premiumPreviewFragment.f35853j0.d(0, 0.0f, 0, dw0Var.getMeasuredWidth(), -dw0Var.getTier().h, premiumPreviewFragment.K);
        return premiumPreviewFragment.f35853j0.f50792f;
    }

    @Override
    public void run(boolean z10) {
        TLRPC.Chat chat = (TLRPC.Chat) this.f40773c;
        we1 we1Var = ((fe1) this.f40772b).f38246b;
        NotificationCenter notificationCenter = we1Var.getNotificationCenter();
        int i9 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(we1Var, i9);
        we1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i9, new Object[0]);
        we1Var.finishFragment();
        we1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-chat.f22380id), null, chat, Boolean.valueOf(z10));
    }

    public nl0(pu0 pu0Var, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, ArrayList arrayList) {
        this.f40771a = 10;
        this.f40772b = pu0Var;
        this.f40773c = tL_messageMediaPoll;
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.f40772b;
        Runnable runnable = (Runnable) this.f40773c;
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            try {
                if (!((MediaDataController.KeywordResult) arrayList.get(i9)).emoji.startsWith("animated_")) {
                    String fixEmoji = Emoji.fixEmoji(((MediaDataController.KeywordResult) arrayList.get(i9)).emoji);
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
    public void E() {
    }

    @Override
    public void g0(View view, float f10, float f11) {
    }
}
