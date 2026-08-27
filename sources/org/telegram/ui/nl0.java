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

public final class nl0 implements org.telegram.ui.ActionBar.a2, st, FileLoader.FileResolver, org.telegram.ui.Components.x4, GenericProvider, MediaDataController.KeywordResultCallback, org.telegram.ui.Components.qk0, org.telegram.ui.Components.rk0, xu0, MessagesStorage.BooleanCallback, s01, OnSuccessListener {

    public final int f40884a;

    public final Object f40885b;

    public final Object f40886c;

    public nl0(int i10, Object obj, Object obj2) {
        this.f40884a = i10;
        this.f40885b = obj;
        this.f40886c = obj2;
    }

    @Override
    public void I(int i10, int i11, boolean z10) {
        switch (this.f40884a) {
            case 9:
                qu0 qu0Var = (qu0) this.f40885b;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) this.f40886c;
                yu0 yu0Var = qu0Var.f41747a;
                yu0Var.f44917a0.b(tL_messageMediaToDo);
                yu0Var.finishFragment();
                break;
            default:
                qu0 qu0Var2 = (qu0) this.f40885b;
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) this.f40886c;
                yu0 yu0Var2 = qu0Var2.f41747a;
                yu0Var2.f44917a0.b(tL_messageMediaPoll);
                yu0Var2.finishFragment();
                break;
        }
    }

    @Override
    public void Z0(nt ntVar) {
        xm0 xm0Var = (xm0) this.f40885b;
        int iIntValue = ((Integer) ((View) this.f40886c).getTag()).intValue();
        EditTextBoldCursor editTextBoldCursor = xm0Var.U[iIntValue];
        if (iIntValue == 5) {
            xm0Var.f44520s = ntVar.d;
        } else {
            xm0Var.v = ntVar.d;
        }
        editTextBoldCursor.setText(ntVar.f40915a);
    }

    @Override
    public boolean a(int i10, View view) {
        final va1 va1Var = (va1) this.f40885b;
        final xa1 xa1Var = (xa1) this.f40886c;
        ThemeActivity themeActivity = va1Var.f43398e;
        if (i10 >= 0 && i10 < xa1Var.f44366e.size()) {
            final org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) xa1Var.f44366e.get(i10);
            if (e6Var.f22883a >= 100 && !e6Var.f22905z) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                String string = LocaleController.getString("OpenInEditor", R.string.OpenInEditor);
                String string2 = LocaleController.getString("ShareTheme", R.string.ShareTheme);
                TLRPC.TL_theme tL_theme = e6Var.f22898r;
                CharSequence[] charSequenceArr = {string, string2, (tL_theme == null || !tL_theme.creator) ? null : LocaleController.getString("ThemeSetUrl", R.string.ThemeSetUrl), LocaleController.getString("DeleteTheme", R.string.DeleteTheme)};
                int[] iArr = {R.drawable.msg_edit, R.drawable.msg_share, R.drawable.msg_link, R.drawable.msg_delete};
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i11) throws Throwable {
                        va1 va1Var2 = va1Var;
                        ThemeActivity themeActivity2 = va1Var2.f43398e;
                        if (themeActivity2.getParentActivity() == null) {
                            return;
                        }
                        org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                        if (i11 == 0) {
                            org.telegram.ui.Components.y4.W(themeActivity2, i11 != 1 ? 1 : 2, e6Var2.f22884b, e6Var2);
                            return;
                        }
                        if (i11 == 1) {
                            if (e6Var2.f22898r == null) {
                                themeActivity2.getMessagesController().saveThemeToServer(e6Var2.f22884b, e6Var2);
                                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, e6Var2.f22884b, e6Var2);
                                return;
                            }
                            String str = "https://" + themeActivity2.getMessagesController().linkPrefix + "/addtheme/" + e6Var2.f22898r.slug;
                            themeActivity2.showDialog(new org.telegram.ui.Components.sp0(themeActivity2.getParentActivity(), null, str, false, str, false, null));
                            return;
                        }
                        if (i11 == 2) {
                            themeActivity2.presentFragment(new tc1(e6Var2.f22884b, e6Var2, false));
                            return;
                        }
                        if (i11 != 3 || themeActivity2.getParentActivity() == null) {
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(themeActivity2.getParentActivity());
                        String string3 = LocaleController.getString("DeleteThemeTitle", R.string.DeleteThemeTitle);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder2.f22702a;
                        b2Var.N = string3;
                        b2Var.P = LocaleController.getString("DeleteThemeAlert", R.string.DeleteThemeAlert);
                        alertDialog$Builder2.k(LocaleController.getString("Delete", R.string.Delete), new b7(va1Var2, xa1Var, e6Var2, 22));
                        alertDialog$Builder2.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                        themeActivity2.showDialog(b2Var);
                        TextView textView = (TextView) b2Var.d(-1);
                        if (textView != null) {
                            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
                        }
                    }
                };
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                b2Var.L = charSequenceArr;
                b2Var.M = iArr;
                b2Var.I = onClickListener;
                themeActivity.showDialog(b2Var);
                b2Var.l(b2Var.J0.size() - 1, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23269p7, false));
                return true;
            }
        }
        return false;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia) {
        dd1 dd1Var = (dd1) this.f40885b;
        rn rnVar = (rn) this.f40886c;
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.MessageMedia messageMedia2 = dd1Var.C.messageOwner.media;
            if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                ((TLRPC.TL_messageMediaToDo) messageMedia).completions = ((TLRPC.TL_messageMediaToDo) messageMedia2).completions;
            }
        }
        dd1Var.C.messageOwner.media = messageMedia;
        rnVar.getSendMessagesHelper().editMessage(dd1Var.C, null, null, null, null, null, null, false, false, null);
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        ThemeActivity.W((ThemeActivity) this.f40885b, (Context) this.f40886c, view, i10, f10);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) throws Throwable {
        ArrayList<Long> arrayList;
        TLRPC.EncryptedChat encryptedChat;
        boolean z10;
        switch (this.f40884a) {
            case 0:
                xm0 xm0Var = (xm0) this.f40885b;
                boolean[] zArr = (boolean[]) this.f40886c;
                if (!xm0Var.f44518r0) {
                    xm0Var.f44512o1.clear();
                }
                xm0Var.f44514p1.clear();
                bm0 bm0Var = (bm0) xm0Var.f44534x1;
                bm0Var.d.j1(xm0Var.A, xm0Var.B, xm0Var.C, zArr[0], null, null, bm0Var.f36853b);
                xm0Var.finishFragment();
                break;
            case 1:
                xm0 xm0Var2 = (xm0) this.f40885b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f40886c;
                int[] iArr = xm0Var2.f44532x;
                iArr[2] = 0;
                iArr[1] = 0;
                iArr[0] = 0;
                editTextBoldCursor.setText(LocaleController.getString(R.string.PassportNoExpireDate));
                break;
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
                lh1 lh1Var = (lh1) this.f40885b;
                boolean[] zArr2 = (boolean[]) this.f40886c;
                lh1Var.getClass();
                zArr2[0] = true;
                lh1Var.f40114l0 = 17;
                Intent intent = new Intent(lh1Var.f40092b, (Class<?>) VoIPService.class);
                intent.putExtra("user_id", lh1Var.d.f22527id);
                intent.putExtra("is_outgoing", true);
                intent.putExtra("start_incall_activity", false);
                intent.putExtra("video_call", false);
                intent.putExtra("can_video_call", false);
                intent.putExtra("account", lh1Var.f40089a);
                try {
                    lh1Var.f40092b.startService(intent);
                } catch (Throwable th) {
                    FileLog.e(th);
                }
                break;
            case 3:
                xm0.U((xm0) this.f40885b, (TLRPC.TL_auth_passwordRecovery) this.f40886c);
                break;
            case 4:
                do0 do0Var = (do0) this.f40885b;
                String str = (String) this.f40886c;
                do0Var.X = true;
                do0Var.W.email_unconfirmed_pattern = str;
                do0Var.J0();
                break;
            case 7:
                PhotoViewer.D(((qr0) this.f40885b).f41739b, (ArrayList) this.f40886c);
                break;
            case 8:
                qr0 qr0Var = (qr0) this.f40885b;
                boolean[] zArr3 = (boolean[]) this.f40886c;
                PhotoViewer photoViewer = qr0Var.f41739b;
                au0 au0Var = photoViewer.d;
                ArrayList arrayList2 = photoViewer.W6;
                ArrayList arrayList3 = photoViewer.Z6;
                ArrayList arrayList4 = photoViewer.U6;
                ArrayList arrayList5 = photoViewer.f35588a7;
                ArrayList arrayList6 = photoViewer.f35598b7;
                if (!au0Var.M()) {
                    photoViewer.G0(false, false);
                    break;
                } else if (!arrayList4.isEmpty()) {
                    int i11 = photoViewer.L4;
                    if (i11 >= 0 && i11 < arrayList4.size()) {
                        MessageObject messageObject = (MessageObject) arrayList4.get(photoViewer.L4);
                        if (messageObject.isSent()) {
                            photoViewer.G0(false, false);
                            ArrayList<Integer> arrayList7 = new ArrayList<>();
                            int i12 = photoViewer.v;
                            if (i12 != 0) {
                                arrayList7.add(Integer.valueOf(i12));
                            } else {
                                arrayList7.add(Integer.valueOf(messageObject.getId()));
                            }
                            if (!DialogObject.isEncryptedDialog(messageObject.getDialogId()) || messageObject.messageOwner.random_id == 0) {
                                arrayList = null;
                                encryptedChat = null;
                            } else {
                                ArrayList<Long> arrayList8 = new ArrayList<>();
                                arrayList8.add(Long.valueOf(messageObject.messageOwner.random_id));
                                encryptedChat = MessagesController.getInstance(photoViewer.P).getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(messageObject.getDialogId())));
                                arrayList = arrayList8;
                            }
                            MessagesController.getInstance(photoViewer.P).deleteMessages(arrayList7, arrayList, encryptedChat, messageObject.getDialogId(), messageObject.getQuickReplyId(), zArr3[0], messageObject.getChatMode());
                        }
                        break;
                    }
                } else if (!arrayList6.isEmpty()) {
                    int i13 = photoViewer.L4;
                    if (i13 >= 0 && i13 < arrayList6.size()) {
                        TLRPC.Message message = (TLRPC.Message) arrayList3.get(photoViewer.L4);
                        if (message != null) {
                            ArrayList<Integer> arrayList9 = new ArrayList<>();
                            arrayList9.add(Integer.valueOf(message.f22401id));
                            MessagesController.getInstance(photoViewer.P).deleteMessages(arrayList9, null, null, MessageObject.getDialogId(message), message.quick_reply_shortcut_id, true, 0);
                            NotificationCenter.getInstance(photoViewer.P).lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
                        }
                        if (photoViewer.I1()) {
                            if (photoViewer.f35777v5 > 0) {
                                MessagesController.getInstance(photoViewer.P).deleteUserPhoto(null);
                            } else {
                                MessagesController.getInstance(photoViewer.P).changeChatAvatar(-photoViewer.f35777v5, null, null, null, null, 0.0d, null, null, null, null);
                            }
                            photoViewer.G0(false, false);
                            break;
                        } else {
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
                                if (photoViewer.f35777v5 > 0) {
                                    MessagesController.getInstance(photoViewer.P).deleteUserPhoto(tL_inputPhoto);
                                }
                                MessagesStorage.getInstance(photoViewer.P).clearUserPhoto(photoViewer.f35777v5, photo.f22404id);
                                arrayList2.remove(photoViewer.L4);
                                photoViewer.Y6.remove(photoViewer.L4);
                                photoViewer.X6.remove(photoViewer.L4);
                                arrayList3.remove(photoViewer.L4);
                                arrayList6.remove(photoViewer.L4);
                                if (arrayList2.isEmpty()) {
                                    photoViewer.G0(false, false);
                                } else {
                                    int size = photoViewer.L4;
                                    if (size >= arrayList6.size()) {
                                        size = arrayList6.size() - 1;
                                    }
                                    photoViewer.L4 = -1;
                                    photoViewer.B2(size);
                                }
                                if (message == null) {
                                    NotificationCenter.getInstance(photoViewer.P).lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
                                }
                                break;
                            }
                        }
                    }
                } else if (!arrayList5.isEmpty() && photoViewer.d != null) {
                    arrayList5.remove(photoViewer.L4);
                    photoViewer.d.B(photoViewer.L4);
                    if (!arrayList5.isEmpty()) {
                        int size2 = photoViewer.L4;
                        if (size2 >= arrayList5.size()) {
                            size2 = arrayList5.size() - 1;
                        }
                        photoViewer.L4 = -1;
                        photoViewer.B2(size2);
                    } else {
                        photoViewer.G0(false, false);
                    }
                    break;
                }
                break;
            case 12:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) this.f40885b;
                SharedPreferences sharedPreferences = (SharedPreferences) this.f40886c;
                privacyControlActivity.t0();
                sharedPreferences.edit().putBoolean("privacyAlertShowed", true).commit();
                break;
            case 13:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f40885b;
                org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) this.f40886c;
                TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
                boolean[] zArr4 = privacySettingsActivity.V;
                tL_payments_clearSavedInfo.credentials = zArr4[1];
                tL_payments_clearSavedInfo.info = zArr4[0];
                privacySettingsActivity.getUserConfig().tmpPassword = null;
                privacySettingsActivity.getUserConfig().saveConfig(false);
                privacySettingsActivity.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new v80(18, privacySettingsActivity, p8Var));
                break;
            case 14:
                ProfileActivity.c0((ProfileActivity) this.f40885b, (org.telegram.ui.Cells.y1[]) this.f40886c);
                break;
            case 15:
                dz0 dz0Var = (dz0) this.f40885b;
                TLRPC.User user = (TLRPC.User) this.f40886c;
                dz0Var.getClass();
                ArrayList<TLRPC.User> arrayList10 = new ArrayList<>();
                arrayList10.add(user);
                ProfileActivity profileActivity = dz0Var.f37574b;
                profileActivity.getContactsController().deleteContact(arrayList10, true);
                if (user != null) {
                    user.contact = false;
                    profileActivity.e5(false, false);
                }
                break;
            case 18:
                k61 k61Var = (k61) this.f40885b;
                TLRPC.User user2 = (TLRPC.User) this.f40886c;
                org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
                if (n2VarU != null) {
                    k61Var.dismiss();
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    b7 b7Var = new b7(k61Var, user2, twoStepVerificationActivity, 20);
                    twoStepVerificationActivity.V = 0;
                    twoStepVerificationActivity.X = b7Var;
                    n2VarU.presentFragment(twoStepVerificationActivity);
                    break;
                }
                break;
            case 19:
                y91.m((y91) this.f40885b, (gy) this.f40886c);
                break;
            case 20:
                ThemeActivity.X((ThemeActivity) this.f40885b, (m21) this.f40886c);
                break;
            case 23:
                va1 va1Var = (va1) this.f40885b;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.f40886c;
                va1Var.getClass();
                MessagesController.getInstance(f6Var.A).saveTheme(f6Var, null, f6Var == org.telegram.ui.ActionBar.g6.J, true);
                HashMap map = org.telegram.ui.ActionBar.g6.H;
                if (f6Var.f22943b == null) {
                    z10 = false;
                } else {
                    if (org.telegram.ui.ActionBar.g6.I == f6Var) {
                        org.telegram.ui.ActionBar.g6.t(org.telegram.ui.ActionBar.g6.L, true, false);
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (f6Var == org.telegram.ui.ActionBar.g6.J) {
                        org.telegram.ui.ActionBar.g6.J = (org.telegram.ui.ActionBar.f6) map.get("Dark Blue");
                    }
                    f6Var.t();
                    org.telegram.ui.ActionBar.g6.G.remove(f6Var);
                    map.remove(f6Var.f22941a);
                    org.telegram.ui.ActionBar.z5 z5Var = f6Var.f22949e0;
                    if (z5Var != null) {
                        org.telegram.ui.ActionBar.z5.a(z5Var);
                    }
                    org.telegram.ui.ActionBar.g6.F.remove(f6Var);
                    new File(f6Var.f22943b).delete();
                    org.telegram.ui.ActionBar.g6.s1(true, false);
                }
                if (z10) {
                    ((ActionBarLayout) ((org.telegram.ui.ActionBar.n2) va1Var.f43398e).parentLayout).U(true, true);
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeListUpdated, new Object[0]);
                break;
            case 27:
                zf1.W((zf1) this.f40885b, (byte[]) this.f40886c);
                break;
        }
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public File getFile() {
        switch (this.f40884a) {
            case 5:
                PhotoViewer photoViewer = (PhotoViewer) this.f40885b;
                return FileLoader.getInstance(photoViewer.P).getPathToAttach((TLObject) this.f40886c, true);
            default:
                PhotoViewer photoViewer2 = (PhotoViewer) this.f40885b;
                return FileLoader.getInstance(photoViewer2.P).getPathToMessage((TLRPC.Message) this.f40886c);
        }
    }

    @Override
    public void l(fk0 fk0Var) {
        ze1 ze1Var = (ze1) this.f40885b;
        TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.f40886c;
        cf1 cf1Var = ze1Var.f45155a;
        cf1Var.f37080e.add(Integer.valueOf(tL_forumTopic.f22432id));
        cf1Var.V();
    }

    @Override
    public void onSuccess(Object obj) {
        af.h hVar = (af.h) this.f40885b;
        lh.d dVar = (lh.d) this.f40886c;
        FileLog.d("wear-auth: /token delivered to " + ((String) hVar.f276c));
        dVar.setLoading(false);
        ci1.d = null;
        org.telegram.ui.ActionBar.e3 e3Var = ci1.f37101c;
        if (e3Var != null) {
            e3Var.dismiss();
            ci1.f37101c = null;
        }
    }

    @Override
    public Object provide(Object obj) {
        ew0 ew0Var = (ew0) this.f40885b;
        dw0 dw0Var = (dw0) this.f40886c;
        PremiumPreviewFragment premiumPreviewFragment = ew0Var.d.f38219n;
        premiumPreviewFragment.f35856j0.d(0, 0.0f, 0, dw0Var.getMeasuredWidth(), -dw0Var.getTier().h, premiumPreviewFragment.K);
        return premiumPreviewFragment.f35856j0.f458f;
    }

    @Override
    public void run(boolean z10) {
        ge1 ge1Var = (ge1) this.f40885b;
        TLRPC.Chat chat = (TLRPC.Chat) this.f40886c;
        we1 we1Var = ge1Var.f38398b;
        NotificationCenter notificationCenter = we1Var.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(we1Var, i10);
        we1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        we1Var.finishFragment();
        we1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-chat.f22380id), null, chat, Boolean.valueOf(z10));
    }

    public nl0(qu0 qu0Var, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, ArrayList arrayList) {
        this.f40884a = 10;
        this.f40885b = qu0Var;
        this.f40886c = tL_messageMediaPoll;
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.f40885b;
        Runnable runnable = (Runnable) this.f40886c;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            try {
                if (!((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.startsWith("animated_")) {
                    String strFixEmoji = Emoji.fixEmoji(((MediaDataController.KeywordResult) arrayList.get(i10)).emoji);
                    if (Emoji.getEmojiDrawable(strFixEmoji) != null) {
                        linkedHashSet.add(strFixEmoji);
                    }
                }
            } catch (Exception unused) {
            }
        }
        runnable.run();
    }

    @Override
    public void G() {
    }

    @Override
    public void c0(View view, float f10, float f11) {
    }
}
