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
public final class kl0 implements org.telegram.ui.ActionBar.b2, qt, FileLoader.FileResolver, org.telegram.ui.Components.b5, GenericProvider, MediaDataController.KeywordResultCallback, org.telegram.ui.Components.al0, org.telegram.ui.Components.bl0, uu0, MessagesStorage.BooleanCallback, s01, OnSuccessListener {
    public final int f39923a;
    public final Object f39924b;
    public final Object f39925c;

    public kl0(int i10, Object obj, Object obj2) {
        this.f39923a = i10;
        this.f39924b = obj;
        this.f39925c = obj2;
    }

    @Override
    public void I(int i10, int i11, boolean z10) {
        switch (this.f39923a) {
            case 9:
                vu0 vu0Var = ((nu0) this.f39924b).f40906a;
                vu0Var.f43753a0.a((TLRPC.TL_messageMediaToDo) this.f39925c);
                vu0Var.finishFragment();
                return;
            default:
                vu0 vu0Var2 = ((nu0) this.f39924b).f40906a;
                vu0Var2.f43753a0.a((TLRPC.TL_messageMediaPoll) this.f39925c);
                vu0Var2.finishFragment();
                return;
        }
    }

    @Override
    public void Z0(lt ltVar) {
        vm0 vm0Var = (vm0) this.f39924b;
        int intValue = ((Integer) ((View) this.f39925c).getTag()).intValue();
        EditTextBoldCursor editTextBoldCursor = vm0Var.U[intValue];
        if (intValue == 5) {
            vm0Var.f43663s = ltVar.d;
        } else {
            vm0Var.v = ltVar.d;
        }
        editTextBoldCursor.setText(ltVar.f40272a);
    }

    @Override
    public void a(TLRPC.MessageMedia messageMedia) {
        fd1 fd1Var = (fd1) this.f39924b;
        tn tnVar = (tn) this.f39925c;
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.MessageMedia messageMedia2 = fd1Var.C.messageOwner.media;
            if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                ((TLRPC.TL_messageMediaToDo) messageMedia).completions = ((TLRPC.TL_messageMediaToDo) messageMedia2).completions;
            }
        }
        fd1Var.C.messageOwner.media = messageMedia;
        tnVar.getSendMessagesHelper().editMessage(fd1Var.C, null, null, null, null, null, null, false, false, null);
    }

    @Override
    public void b(float f9, float f10, int i10, View view) {
        ThemeActivity.W((ThemeActivity) this.f39924b, (Context) this.f39925c, view, i10, f9);
    }

    @Override
    public boolean b1(View view) {
        return false;
    }

    @Override
    public boolean c(int i10, View view) {
        String str;
        final ya1 ya1Var = (ya1) this.f39924b;
        final ab1 ab1Var = (ab1) this.f39925c;
        ThemeActivity themeActivity = ya1Var.f44825e;
        if (i10 >= 0 && i10 < ab1Var.f36503e.size()) {
            final org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) ab1Var.f36503e.get(i10);
            if (e6Var.f22902a >= 100 && !e6Var.f22924z) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                String string = LocaleController.getString("OpenInEditor", R.string.OpenInEditor);
                String string2 = LocaleController.getString("ShareTheme", R.string.ShareTheme);
                TLRPC.TL_theme tL_theme = e6Var.f22917r;
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
                        ThemeActivity themeActivity2 = ya1Var2.f44825e;
                        if (themeActivity2.getParentActivity() != null) {
                            org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                            int i12 = 2;
                            if (i11 == 0) {
                                if (i11 != 1) {
                                    i12 = 1;
                                }
                                org.telegram.ui.Components.c5.W(themeActivity2, i12, e6Var2.f22903b, e6Var2);
                            } else if (i11 == 1) {
                                if (e6Var2.f22917r == null) {
                                    themeActivity2.getMessagesController().saveThemeToServer(e6Var2.f22903b, e6Var2);
                                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, e6Var2.f22903b, e6Var2);
                                    return;
                                }
                                String str2 = "https://" + themeActivity2.getMessagesController().linkPrefix + "/addtheme/" + e6Var2.f22917r.slug;
                                themeActivity2.showDialog(new org.telegram.ui.Components.dq0(themeActivity2.getParentActivity(), null, str2, false, str2, false, null));
                            } else if (i11 == 2) {
                                themeActivity2.presentFragment(new vc1(e6Var2.f22903b, e6Var2, false));
                            } else if (i11 == 3 && themeActivity2.getParentActivity() != null) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(themeActivity2.getParentActivity());
                                String string3 = LocaleController.getString("DeleteThemeTitle", R.string.DeleteThemeTitle);
                                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder2.f22714a;
                                c2Var.N = string3;
                                c2Var.P = LocaleController.getString("DeleteThemeAlert", R.string.DeleteThemeAlert);
                                alertDialog$Builder2.k(LocaleController.getString("Delete", R.string.Delete), new z6(ya1Var2, ab1Var, e6Var2, 22));
                                alertDialog$Builder2.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                                themeActivity2.showDialog(c2Var);
                                TextView textView = (TextView) c2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23295q7, false));
                                }
                            }
                        }
                    }
                };
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                c2Var.L = charSequenceArr;
                c2Var.M = iArr;
                c2Var.I = onClickListener;
                themeActivity.showDialog(c2Var);
                c2Var.l(c2Var.J0.size() - 1, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23295q7, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23279p7, false));
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
        org.telegram.ui.ActionBar.b5 b5Var;
        switch (this.f39923a) {
            case 0:
                vm0 vm0Var = (vm0) this.f39924b;
                boolean[] zArr = (boolean[]) this.f39925c;
                if (!vm0Var.f43661r0) {
                    vm0Var.f43655o1.clear();
                }
                vm0Var.f43657p1.clear();
                yl0 yl0Var = (yl0) vm0Var.f43677x1;
                yl0Var.d.j1(vm0Var.A, vm0Var.B, vm0Var.C, zArr[0], null, null, yl0Var.f44905b);
                vm0Var.finishFragment();
                return;
            case 1:
                int[] iArr = ((vm0) this.f39924b).f43675x;
                iArr[2] = 0;
                iArr[1] = 0;
                iArr[0] = 0;
                ((EditTextBoldCursor) this.f39925c).setText(LocaleController.getString(R.string.PassportNoExpireDate));
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
                oh1 oh1Var = (oh1) this.f39924b;
                oh1Var.getClass();
                ((boolean[]) this.f39925c)[0] = true;
                oh1Var.f41161l0 = 17;
                Intent intent = new Intent(oh1Var.f41139b, VoIPService.class);
                intent.putExtra("user_id", oh1Var.d.f22539id);
                intent.putExtra("is_outgoing", true);
                intent.putExtra("start_incall_activity", false);
                intent.putExtra("video_call", false);
                intent.putExtra("can_video_call", false);
                intent.putExtra("account", oh1Var.f41136a);
                try {
                    oh1Var.f41139b.startService(intent);
                    return;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    return;
                }
            case 3:
                vm0.U((vm0) this.f39924b, (TLRPC.TL_auth_passwordRecovery) this.f39925c);
                return;
            case 4:
                bo0 bo0Var = (bo0) this.f39924b;
                bo0Var.X = true;
                bo0Var.W.email_unconfirmed_pattern = (String) this.f39925c;
                bo0Var.J0();
                return;
            case 7:
                PhotoViewer.C(((or0) this.f39924b).f41216b, (ArrayList) this.f39925c);
                return;
            case 8:
                boolean[] zArr2 = (boolean[]) this.f39925c;
                PhotoViewer photoViewer = ((or0) this.f39924b).f41216b;
                xt0 xt0Var = photoViewer.d;
                ArrayList arrayList2 = photoViewer.W6;
                ArrayList arrayList3 = photoViewer.Z6;
                ArrayList arrayList4 = photoViewer.U6;
                ArrayList arrayList5 = photoViewer.f35653a7;
                ArrayList arrayList6 = photoViewer.f35663b7;
                if (!xt0Var.M()) {
                    photoViewer.G0(false, false);
                    return;
                } else if (!arrayList4.isEmpty()) {
                    int i11 = photoViewer.L4;
                    if (i11 >= 0 && i11 < arrayList4.size()) {
                        MessageObject messageObject = (MessageObject) arrayList4.get(photoViewer.L4);
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
                    int i13 = photoViewer.L4;
                    if (i13 >= 0 && i13 < arrayList6.size()) {
                        TLRPC.Message message = (TLRPC.Message) arrayList3.get(photoViewer.L4);
                        if (message != null) {
                            ArrayList<Integer> arrayList9 = new ArrayList<>();
                            arrayList9.add(Integer.valueOf(message.f22413id));
                            MessagesController.getInstance(photoViewer.P).deleteMessages(arrayList9, null, null, MessageObject.getDialogId(message), message.quick_reply_shortcut_id, true, 0);
                            NotificationCenter.getInstance(photoViewer.P).lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
                        }
                        if (photoViewer.I1()) {
                            if (photoViewer.f35841v5 > 0) {
                                MessagesController.getInstance(photoViewer.P).deleteUserPhoto(null);
                            } else {
                                MessagesController.getInstance(photoViewer.P).changeChatAvatar(-photoViewer.f35841v5, null, null, null, null, 0.0d, null, null, null, null);
                            }
                            photoViewer.G0(false, false);
                            return;
                        }
                        TLRPC.Photo photo = (TLRPC.Photo) arrayList6.get(photoViewer.L4);
                        if (photo != null) {
                            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                            tL_inputPhoto.f22411id = photo.f22416id;
                            tL_inputPhoto.access_hash = photo.access_hash;
                            byte[] bArr = photo.file_reference;
                            tL_inputPhoto.file_reference = bArr;
                            if (bArr == null) {
                                tL_inputPhoto.file_reference = new byte[0];
                            }
                            if (photoViewer.f35841v5 > 0) {
                                MessagesController.getInstance(photoViewer.P).deleteUserPhoto(tL_inputPhoto);
                            }
                            MessagesStorage.getInstance(photoViewer.P).clearUserPhoto(photoViewer.f35841v5, photo.f22416id);
                            arrayList2.remove(photoViewer.L4);
                            photoViewer.Y6.remove(photoViewer.L4);
                            photoViewer.X6.remove(photoViewer.L4);
                            arrayList3.remove(photoViewer.L4);
                            arrayList6.remove(photoViewer.L4);
                            if (arrayList2.isEmpty()) {
                                photoViewer.G0(false, false);
                            } else {
                                int i14 = photoViewer.L4;
                                if (i14 >= arrayList6.size()) {
                                    i14 = arrayList6.size() - 1;
                                }
                                photoViewer.L4 = -1;
                                photoViewer.B2(i14);
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
                        photoViewer.G0(false, false);
                        return;
                    }
                    int i15 = photoViewer.L4;
                    if (i15 >= arrayList5.size()) {
                        i15 = arrayList5.size() - 1;
                    }
                    photoViewer.L4 = -1;
                    photoViewer.B2(i15);
                    return;
                } else {
                    return;
                }
            case 12:
                ((PrivacyControlActivity) this.f39924b).t0();
                ((SharedPreferences) this.f39925c).edit().putBoolean("privacyAlertShowed", true).commit();
                return;
            case 13:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f39924b;
                TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
                boolean[] zArr3 = privacySettingsActivity.V;
                tL_payments_clearSavedInfo.credentials = zArr3[1];
                tL_payments_clearSavedInfo.info = zArr3[0];
                privacySettingsActivity.getUserConfig().tmpPassword = null;
                privacySettingsActivity.getUserConfig().saveConfig(false);
                privacySettingsActivity.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new u80(17, privacySettingsActivity, (org.telegram.ui.Cells.q8) this.f39925c));
                return;
            case 14:
                ProfileActivity.c0((ProfileActivity) this.f39924b, (org.telegram.ui.Cells.y1[]) this.f39925c);
                return;
            case 15:
                dz0 dz0Var = (dz0) this.f39924b;
                TLRPC.User user = (TLRPC.User) this.f39925c;
                dz0Var.getClass();
                ArrayList<TLRPC.User> arrayList10 = new ArrayList<>();
                arrayList10.add(user);
                ProfileActivity profileActivity = dz0Var.f37655b;
                profileActivity.getContactsController().deleteContact(arrayList10, true);
                if (user != null) {
                    user.contact = false;
                    profileActivity.e5(false, false);
                    return;
                }
                return;
            case 18:
                n61 n61Var = (n61) this.f39924b;
                TLRPC.User user2 = (TLRPC.User) this.f39925c;
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    n61Var.dismiss();
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    z6 z6Var = new z6(n61Var, user2, twoStepVerificationActivity, 20);
                    twoStepVerificationActivity.V = 0;
                    twoStepVerificationActivity.X = z6Var;
                    U.presentFragment(twoStepVerificationActivity);
                    return;
                }
                return;
            case 19:
                ba1.m((ba1) this.f39924b, (fy) this.f39925c);
                return;
            case 20:
                ThemeActivity.X((ThemeActivity) this.f39924b, (t31) this.f39925c);
                return;
            case 23:
                ya1 ya1Var = (ya1) this.f39924b;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.f39925c;
                ya1Var.getClass();
                MessagesController messagesController = MessagesController.getInstance(f6Var.A);
                if (f6Var == org.telegram.ui.ActionBar.g6.J) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                messagesController.saveTheme(f6Var, null, z10, true);
                HashMap hashMap = org.telegram.ui.ActionBar.g6.H;
                if (f6Var.f22943b == null) {
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
                    hashMap.remove(f6Var.f22941a);
                    org.telegram.ui.ActionBar.z5 z5Var = f6Var.f22949e0;
                    if (z5Var != null) {
                        org.telegram.ui.ActionBar.z5.a(z5Var);
                    }
                    org.telegram.ui.ActionBar.g6.F.remove(f6Var);
                    new File(f6Var.f22943b).delete();
                    org.telegram.ui.ActionBar.g6.s1(true, false);
                }
                if (z11) {
                    b5Var = ((org.telegram.ui.ActionBar.o2) ya1Var.f44825e).parentLayout;
                    ((ActionBarLayout) b5Var).U(true, true);
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeListUpdated, new Object[0]);
                return;
            case 27:
                cg1.W((cg1) this.f39924b, (byte[]) this.f39925c);
                return;
        }
    }

    @Override
    public File getFile() {
        switch (this.f39923a) {
            case 5:
                return FileLoader.getInstance(((PhotoViewer) this.f39924b).P).getPathToAttach((TLObject) this.f39925c, true);
            default:
                return FileLoader.getInstance(((PhotoViewer) this.f39924b).P).getPathToMessage((TLRPC.Message) this.f39925c);
        }
    }

    @Override
    public void m(bk0 bk0Var) {
        ff1 ff1Var = ((cf1) this.f39924b).f37098a;
        ff1Var.f38146e.add(Integer.valueOf(((TLRPC.TL_forumTopic) this.f39925c).f22444id));
        ff1Var.V();
    }

    @Override
    public void onSuccess(Object obj) {
        Integer num = (Integer) obj;
        FileLog.d("wear-auth: /token delivered to " + ((String) ((a5.j) this.f39924b).f213c));
        ((nh.d) this.f39925c).setLoading(false);
        ei1.d = null;
        org.telegram.ui.ActionBar.f3 f3Var = ei1.f37846c;
        if (f3Var != null) {
            f3Var.dismiss();
            ei1.f37846c = null;
        }
    }

    @Override
    public Object provide(Object obj) {
        cw0 cw0Var = (cw0) this.f39925c;
        Void r10 = (Void) obj;
        PremiumPreviewFragment premiumPreviewFragment = ((dw0) this.f39924b).d.f37915n;
        premiumPreviewFragment.f35919j0.d(0, 0.0f, 0, cw0Var.getMeasuredWidth(), -cw0Var.getTier().h, premiumPreviewFragment.K);
        return premiumPreviewFragment.f35919j0.f3319f;
    }

    @Override
    public void run(boolean z10) {
        TLRPC.Chat chat = (TLRPC.Chat) this.f39925c;
        ze1 ze1Var = ((ie1) this.f39924b).f39228b;
        NotificationCenter notificationCenter = ze1Var.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(ze1Var, i10);
        ze1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        ze1Var.finishFragment();
        ze1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-chat.f22392id), null, chat, Boolean.valueOf(z10));
    }

    public kl0(nu0 nu0Var, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, ArrayList arrayList) {
        this.f39923a = 10;
        this.f39924b = nu0Var;
        this.f39925c = tL_messageMediaPoll;
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.f39924b;
        Runnable runnable = (Runnable) this.f39925c;
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
    public void o0(View view, float f9, float f10) {
    }
}
