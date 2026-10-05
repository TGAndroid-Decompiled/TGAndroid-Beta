package org.telegram.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.View;
import android.webkit.JsPromptResult;
import android.widget.TextView;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
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
public final class fs0 implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.d5, GenericProvider, MediaDataController.KeywordResultCallback, org.telegram.ui.Components.nl0, org.telegram.ui.Components.ol0, tv0, MessagesStorage.BooleanCallback, o11, OnSuccessListener, pa.a, OnFailureListener, t5.b {
    public final int f36395a;
    public final Object f36396b;
    public final Object f36397c;

    public fs0(int i10, Object obj, Object obj2) {
        this.f36395a = i10;
        this.f36396b = obj;
        this.f36397c = obj2;
    }

    @Override
    public void K(int i10, int i11, boolean z10) {
        switch (this.f36395a) {
            case 2:
                uv0 uv0Var = ((mv0) this.f36396b).f38757a;
                uv0Var.f41374e0.a((TLRPC.TL_messageMediaToDo) this.f36397c);
                uv0Var.finishFragment();
                return;
            default:
                uv0 uv0Var2 = ((mv0) this.f36396b).f38757a;
                uv0Var2.f41374e0.a((TLRPC.TL_messageMediaPoll) this.f36397c);
                uv0Var2.finishFragment();
                return;
        }
    }

    @Override
    public void a(TLRPC.MessageMedia messageMedia) {
        ee1 ee1Var = (ee1) this.f36396b;
        yn ynVar = (yn) this.f36397c;
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.MessageMedia messageMedia2 = ee1Var.G.messageOwner.media;
            if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                ((TLRPC.TL_messageMediaToDo) messageMedia).completions = ((TLRPC.TL_messageMediaToDo) messageMedia2).completions;
            }
        }
        ee1Var.G.messageOwner.media = messageMedia;
        ynVar.getSendMessagesHelper().editMessage(ee1Var.G, null, null, null, null, null, null, false, false, null);
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        ThemeActivity.U((ThemeActivity) this.f36396b, (Context) this.f36397c, view, i10, f7);
    }

    @Override
    public boolean d(int i10, View view) {
        String str;
        final zb1 zb1Var = (zb1) this.f36396b;
        final bc1 bc1Var = (bc1) this.f36397c;
        ThemeActivity themeActivity = zb1Var.f43742e;
        if (i10 >= 0 && i10 < bc1Var.f35117e.size()) {
            final org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) bc1Var.f35117e.get(i10);
            if (f6Var.f20620a >= 100 && !f6Var.f20642z) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                String string = LocaleController.getString("OpenInEditor", R.string.OpenInEditor);
                String string2 = LocaleController.getString("ShareTheme", R.string.ShareTheme);
                TLRPC.TL_theme tL_theme = f6Var.f20635r;
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
                        zb1 zb1Var2 = zb1.this;
                        ThemeActivity themeActivity2 = zb1Var2.f43742e;
                        if (themeActivity2.getParentActivity() != null) {
                            org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                            int i12 = 2;
                            if (i11 == 0) {
                                if (i11 != 1) {
                                    i12 = 1;
                                }
                                org.telegram.ui.Components.e5.W(themeActivity2, i12, f6Var2.f20621b, f6Var2);
                            } else if (i11 == 1) {
                                if (f6Var2.f20635r == null) {
                                    themeActivity2.getMessagesController().saveThemeToServer(f6Var2.f20621b, f6Var2);
                                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, f6Var2.f20621b, f6Var2);
                                    return;
                                }
                                String str2 = "https://" + themeActivity2.getMessagesController().linkPrefix + "/addtheme/" + f6Var2.f20635r.slug;
                                themeActivity2.showDialog(new org.telegram.ui.Components.br0(themeActivity2.getParentActivity(), null, str2, false, str2, false, null));
                            } else if (i11 == 2) {
                                themeActivity2.presentFragment(new ud1(f6Var2.f20621b, f6Var2, false));
                            } else if (i11 == 3 && themeActivity2.getParentActivity() != null) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(themeActivity2.getParentActivity());
                                String string3 = LocaleController.getString("DeleteThemeTitle", R.string.DeleteThemeTitle);
                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder2.f20377a;
                                b2Var.R = string3;
                                b2Var.T = LocaleController.getString("DeleteThemeAlert", R.string.DeleteThemeAlert);
                                alertDialog$Builder2.k(LocaleController.getString("Delete", R.string.Delete), new c7(zb1Var2, bc1Var, f6Var2, 22));
                                alertDialog$Builder2.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                                themeActivity2.showDialog(b2Var);
                                TextView textView = (TextView) b2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21068q7, false));
                                }
                            }
                        }
                    }
                };
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20377a;
                b2Var.P = charSequenceArr;
                b2Var.Q = iArr;
                b2Var.M = onClickListener;
                themeActivity.showDialog(b2Var);
                b2Var.l(b2Var.N0.size() - 1, org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21068q7, false), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21049p7, false));
                return true;
            }
        }
        return false;
    }

    @Override
    public void f(pa.b bVar) {
        ((pa.a) this.f36396b).f(bVar);
        ((pa.a) this.f36397c).f(bVar);
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        ArrayList arrayList;
        TLRPC.EncryptedChat encryptedChat;
        boolean z10;
        boolean z11;
        switch (this.f36395a) {
            case 0:
                PhotoViewer.B(((ns0) this.f36396b).f39030b, (ArrayList) this.f36397c);
                return;
            case 1:
                boolean[] zArr = (boolean[]) this.f36397c;
                PhotoViewer photoViewer = ((ns0) this.f36396b).f39030b;
                wu0 wu0Var = photoViewer.d;
                ArrayList arrayList2 = photoViewer.f33882a7;
                ArrayList arrayList3 = photoViewer.f33911d7;
                ArrayList arrayList4 = photoViewer.Y6;
                ArrayList arrayList5 = photoViewer.e7;
                ArrayList arrayList6 = photoViewer.f7;
                if (!wu0Var.M()) {
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
                            arrayList9.add(Integer.valueOf(message.f20068id));
                            MessagesController.getInstance(photoViewer.T).deleteMessages(arrayList9, null, null, MessageObject.getDialogId(message), message.quick_reply_shortcut_id, true, 0);
                            NotificationCenter.getInstance(photoViewer.T).lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
                        }
                        if (photoViewer.J1()) {
                            if (photoViewer.f34106z5 > 0) {
                                MessagesController.getInstance(photoViewer.T).deleteUserPhoto(null);
                            } else {
                                MessagesController.getInstance(photoViewer.T).changeChatAvatar(-photoViewer.f34106z5, null, null, null, null, 0.0d, null, null, null, null);
                            }
                            photoViewer.G0(false, false);
                            return;
                        }
                        TLRPC.Photo photo = (TLRPC.Photo) arrayList6.get(photoViewer.P4);
                        if (photo != null) {
                            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                            tL_inputPhoto.f20066id = photo.f20071id;
                            tL_inputPhoto.access_hash = photo.access_hash;
                            byte[] bArr = photo.file_reference;
                            tL_inputPhoto.file_reference = bArr;
                            if (bArr == null) {
                                tL_inputPhoto.file_reference = new byte[0];
                            }
                            if (photoViewer.f34106z5 > 0) {
                                MessagesController.getInstance(photoViewer.T).deleteUserPhoto(tL_inputPhoto);
                            }
                            MessagesStorage.getInstance(photoViewer.T).clearUserPhoto(photoViewer.f34106z5, photo.f20071id);
                            arrayList2.remove(photoViewer.P4);
                            photoViewer.f33902c7.remove(photoViewer.P4);
                            photoViewer.f33892b7.remove(photoViewer.P4);
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
            default:
                boolean[] zArr2 = (boolean[]) this.f36396b;
                JsPromptResult jsPromptResult = (JsPromptResult) this.f36397c;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    jsPromptResult.cancel();
                    return;
                }
                return;
            case 5:
                ((PrivacyControlActivity) this.f36396b).t0();
                ((SharedPreferences) this.f36397c).edit().putBoolean("privacyAlertShowed", true).commit();
                return;
            case 6:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f36396b;
                TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
                boolean[] zArr3 = privacySettingsActivity.Z;
                tL_payments_clearSavedInfo.credentials = zArr3[1];
                tL_payments_clearSavedInfo.info = zArr3[0];
                privacySettingsActivity.getUserConfig().tmpPassword = null;
                privacySettingsActivity.getUserConfig().saveConfig(false);
                privacySettingsActivity.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new zb0(14, privacySettingsActivity, (org.telegram.ui.Cells.w8) this.f36397c));
                return;
            case 7:
                ProfileActivity.c0((ProfileActivity) this.f36396b, (org.telegram.ui.Cells.a2[]) this.f36397c);
                return;
            case 8:
                a01 a01Var = (a01) this.f36396b;
                TLRPC.User user = (TLRPC.User) this.f36397c;
                a01Var.getClass();
                ArrayList<TLRPC.User> arrayList10 = new ArrayList<>();
                arrayList10.add(user);
                ProfileActivity profileActivity = a01Var.f34642b;
                profileActivity.getContactsController().deleteContact(arrayList10, true);
                if (user != null) {
                    user.contact = false;
                    profileActivity.e5(false, false);
                    return;
                }
                return;
            case 11:
                k71 k71Var = (k71) this.f36396b;
                TLRPC.User user2 = (TLRPC.User) this.f36397c;
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    k71Var.dismiss();
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    c7 c7Var = new c7(k71Var, user2, twoStepVerificationActivity, 20);
                    twoStepVerificationActivity.Z = 0;
                    twoStepVerificationActivity.f34583b0 = c7Var;
                    U.presentFragment(twoStepVerificationActivity);
                    return;
                }
                return;
            case 12:
                bb1.m((bb1) this.f36396b, (uy) this.f36397c);
                return;
            case 13:
                ThemeActivity.W((ThemeActivity) this.f36396b, (e91) this.f36397c);
                return;
            case 16:
                zb1 zb1Var = (zb1) this.f36396b;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) this.f36397c;
                zb1Var.getClass();
                MessagesController messagesController = MessagesController.getInstance(h6Var.E);
                if (h6Var == org.telegram.ui.ActionBar.i6.J) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                messagesController.saveTheme(h6Var, null, z10, true);
                HashMap hashMap = org.telegram.ui.ActionBar.i6.H;
                if (h6Var.f20699b == null) {
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
                    hashMap.remove(h6Var.f20697a);
                    org.telegram.ui.ActionBar.a6 a6Var = h6Var.f20710i0;
                    if (a6Var != null) {
                        org.telegram.ui.ActionBar.a6.a(a6Var);
                    }
                    org.telegram.ui.ActionBar.i6.F.remove(h6Var);
                    new File(h6Var.f20699b).delete();
                    org.telegram.ui.ActionBar.i6.s1(true, false);
                }
                if (z11) {
                    ((ActionBarLayout) ThemeActivity.c0(zb1Var.f43742e)).U(true, true);
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeListUpdated, new Object[0]);
                return;
            case 20:
                zg1.U((zg1) this.f36396b, (byte[]) this.f36397c);
                return;
            case 21:
                ki1 ki1Var = (ki1) this.f36396b;
                ki1Var.getClass();
                ((boolean[]) this.f36397c)[0] = true;
                ki1Var.f38050p0 = 17;
                Intent intent = new Intent(ki1Var.f38021b, VoIPService.class);
                intent.putExtra("user_id", ki1Var.d.f20194id);
                intent.putExtra("is_outgoing", true);
                intent.putExtra("start_incall_activity", false);
                intent.putExtra("video_call", false);
                intent.putExtra("can_video_call", false);
                intent.putExtra("account", ki1Var.f38018a);
                try {
                    ki1Var.f38021b.startService(intent);
                    return;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    return;
                }
            case 23:
                org.telegram.ui.web.o.X((org.telegram.ui.web.o) this.f36396b, (HashSet) this.f36397c);
                return;
            case 24:
                org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) this.f36396b;
                TL_bots.allowSendMessage allowsendmessage = new TL_bots.allowSendMessage();
                allowsendmessage.bot = MessagesController.getInstance(c1Var.M).getInputUser(c1Var.U);
                ConnectionsManager.getInstance(c1Var.M).sendRequest(allowsendmessage, new ai.s5(c1Var, (String[]) this.f36397c, b2Var, 15));
                return;
        }
    }

    @Override
    public Object h() {
        switch (this.f36395a) {
            case 28:
                Iterable iterable = (Iterable) this.f36397c;
                s5.g gVar = (s5.g) ((s5.d) ((da.b) this.f36396b).f8182c);
                gVar.getClass();
                if (iterable.iterator().hasNext()) {
                    gVar.a().compileStatement("DELETE FROM events WHERE _id in " + s5.g.g(iterable)).execute();
                    return null;
                }
                return null;
            default:
                da.b bVar = (da.b) this.f36396b;
                for (Map.Entry entry : ((HashMap) this.f36397c).entrySet()) {
                    ((s5.g) ((s5.c) bVar.f8186i)).e(((Integer) entry.getValue()).intValue(), o5.c.INVALID_PAYLOD, (String) entry.getKey());
                }
                return null;
        }
    }

    @Override
    public void onFailure(Exception exc) {
        qg.x1 x1Var = (qg.x1) this.f36396b;
        Bitmap bitmap = (Bitmap) this.f36397c;
        x1Var.B0 = false;
        FileLog.e(exc);
        if (Build.VERSION.SDK_INT >= 24 && (exc instanceof mb.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && x1Var.isAttachedToWindow()) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.x1(9, x1Var, bitmap), 2000L);
        } else {
            x1Var.C0 = true;
        }
    }

    @Override
    public void onSuccess(Object obj) {
        Integer num = (Integer) obj;
        FileLog.d("wear-auth: /token delivered to " + ((String) ((cf.c) this.f36396b).d));
        ((ci.d) this.f36397c).setLoading(false);
        bj1.d = null;
        org.telegram.ui.ActionBar.f3 f3Var = bj1.f35161c;
        if (f3Var != null) {
            f3Var.dismiss();
            bj1.f35161c = null;
        }
    }

    @Override
    public Object provide(Object obj) {
        bx0 bx0Var = (bx0) this.f36397c;
        Void r10 = (Void) obj;
        PremiumPreviewFragment premiumPreviewFragment = ((cx0) this.f36396b).d.f35900n;
        premiumPreviewFragment.f34153n0.d(0, 0.0f, 0, bx0Var.getMeasuredWidth(), -bx0Var.getTier().h, premiumPreviewFragment.O);
        return premiumPreviewFragment.f34153n0.f46052f;
    }

    @Override
    public void run(boolean z10) {
        TLRPC.Chat chat = (TLRPC.Chat) this.f36397c;
        wf1 wf1Var = ((gf1) this.f36396b).f36660b;
        NotificationCenter notificationCenter = wf1Var.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(wf1Var, i10);
        wf1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        wf1Var.finishFragment();
        wf1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-chat.f20047id), null, chat, Boolean.valueOf(z10));
    }

    @Override
    public void v(rk0 rk0Var) {
        cg1 cg1Var = ((zf1) this.f36396b).f43771a;
        cg1Var.f35455e.add(Integer.valueOf(((TLRPC.TL_forumTopic) this.f36397c).f20099id));
        cg1Var.T();
    }

    public fs0(mv0 mv0Var, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, ArrayList arrayList) {
        this.f36395a = 3;
        this.f36396b = mv0Var;
        this.f36397c = tL_messageMediaPoll;
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.f36396b;
        Runnable runnable = (Runnable) this.f36397c;
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
    public void d0() {
    }

    @Override
    public void s0(View view, float f7, float f10) {
    }
}
