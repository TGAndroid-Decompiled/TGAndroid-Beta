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
public final class ds0 implements org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.d5, GenericProvider, MediaDataController.KeywordResultCallback, org.telegram.ui.Components.ll0, org.telegram.ui.Components.ml0, qv0, MessagesStorage.BooleanCallback, m11, OnSuccessListener, pa.a, OnFailureListener, t5.b {
    public final int f33161a;
    public final Object f33162b;
    public final Object f33163c;

    public ds0(int i10, Object obj, Object obj2) {
        this.f33161a = i10;
        this.f33162b = obj;
        this.f33163c = obj2;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        switch (this.f33161a) {
            case 1:
                rv0 rv0Var = ((jv0) this.f33162b).f34869a;
                rv0Var.f37488e0.a((TLRPC.TL_messageMediaToDo) this.f33163c);
                rv0Var.finishFragment();
                return;
            default:
                rv0 rv0Var2 = ((jv0) this.f33162b).f34869a;
                rv0Var2.f37488e0.a((TLRPC.TL_messageMediaPoll) this.f33163c);
                rv0Var2.finishFragment();
                return;
        }
    }

    @Override
    public void a(TLRPC.MessageMedia messageMedia) {
        de1 de1Var = (de1) this.f33162b;
        wn wnVar = (wn) this.f33163c;
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.MessageMedia messageMedia2 = de1Var.G.messageOwner.media;
            if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                ((TLRPC.TL_messageMediaToDo) messageMedia).completions = ((TLRPC.TL_messageMediaToDo) messageMedia2).completions;
            }
        }
        de1Var.G.messageOwner.media = messageMedia;
        wnVar.getSendMessagesHelper().editMessage(de1Var.G, null, null, null, null, null, null, false, false, null);
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        ThemeActivity.W((ThemeActivity) this.f33162b, (Context) this.f33163c, view, i10, f7);
    }

    @Override
    public boolean d(int i10, View view) {
        String str;
        final yb1 yb1Var = (yb1) this.f33162b;
        final ac1 ac1Var = (ac1) this.f33163c;
        ThemeActivity themeActivity = yb1Var.e;
        if (i10 >= 0 && i10 < ac1Var.e.size()) {
            final org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) ac1Var.e.get(i10);
            if (f6Var.f18871a >= 100 && !f6Var.f18892z) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                String string = LocaleController.getString("OpenInEditor", R.string.OpenInEditor);
                String string2 = LocaleController.getString("ShareTheme", R.string.ShareTheme);
                TLRPC.TL_theme tL_theme = f6Var.f18885r;
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
                        yb1 yb1Var2 = yb1.this;
                        ThemeActivity themeActivity2 = yb1Var2.e;
                        if (themeActivity2.getParentActivity() != null) {
                            org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                            int i12 = 2;
                            if (i11 == 0) {
                                if (i11 != 1) {
                                    i12 = 1;
                                }
                                org.telegram.ui.Components.e5.W(themeActivity2, i12, f6Var2.f18872b, f6Var2);
                            } else if (i11 == 1) {
                                if (f6Var2.f18885r == null) {
                                    themeActivity2.getMessagesController().saveThemeToServer(f6Var2.f18872b, f6Var2);
                                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, f6Var2.f18872b, f6Var2);
                                    return;
                                }
                                String str2 = "https://" + themeActivity2.getMessagesController().linkPrefix + "/addtheme/" + f6Var2.f18885r.slug;
                                themeActivity2.showDialog(new org.telegram.ui.Components.uq0(themeActivity2.getParentActivity(), null, str2, false, str2, false, null));
                            } else if (i11 == 2) {
                                themeActivity2.presentFragment(new td1(f6Var2.f18872b, f6Var2, false));
                            } else if (i11 == 3 && themeActivity2.getParentActivity() != null) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(themeActivity2.getParentActivity());
                                String string3 = LocaleController.getString("DeleteThemeTitle", R.string.DeleteThemeTitle);
                                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder2.f18647a;
                                a2Var.R = string3;
                                a2Var.T = LocaleController.getString("DeleteThemeAlert", R.string.DeleteThemeAlert);
                                alertDialog$Builder2.k(LocaleController.getString("Delete", R.string.Delete), new b7(yb1Var2, ac1Var, f6Var2, 22));
                                alertDialog$Builder2.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                                themeActivity2.showDialog(a2Var);
                                TextView textView = (TextView) a2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19284q7, false));
                                }
                            }
                        }
                    }
                };
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18647a;
                a2Var.P = charSequenceArr;
                a2Var.Q = iArr;
                a2Var.M = onClickListener;
                themeActivity.showDialog(a2Var);
                a2Var.l(a2Var.N0.size() - 1, org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19284q7, false), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19265p7, false));
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        ArrayList arrayList;
        TLRPC.EncryptedChat encryptedChat;
        boolean z10;
        boolean z11;
        switch (this.f33161a) {
            case 0:
                boolean[] zArr = (boolean[]) this.f33163c;
                PhotoViewer photoViewer = ((ks0) this.f33162b).f35135b;
                tu0 tu0Var = photoViewer.d;
                ArrayList arrayList2 = photoViewer.f31178a7;
                ArrayList arrayList3 = photoViewer.f31207d7;
                ArrayList arrayList4 = photoViewer.Y6;
                ArrayList arrayList5 = photoViewer.e7;
                ArrayList arrayList6 = photoViewer.f7;
                if (!tu0Var.M()) {
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
                            arrayList9.add(Integer.valueOf(message.f18342id));
                            MessagesController.getInstance(photoViewer.T).deleteMessages(arrayList9, null, null, MessageObject.getDialogId(message), message.quick_reply_shortcut_id, true, 0);
                            NotificationCenter.getInstance(photoViewer.T).lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
                        }
                        if (photoViewer.I1()) {
                            if (photoViewer.f31401z5 > 0) {
                                MessagesController.getInstance(photoViewer.T).deleteUserPhoto(null);
                            } else {
                                MessagesController.getInstance(photoViewer.T).changeChatAvatar(-photoViewer.f31401z5, null, null, null, null, 0.0d, null, null, null, null);
                            }
                            photoViewer.G0(false, false);
                            return;
                        }
                        TLRPC.Photo photo = (TLRPC.Photo) arrayList6.get(photoViewer.P4);
                        if (photo != null) {
                            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                            tL_inputPhoto.f18340id = photo.f18345id;
                            tL_inputPhoto.access_hash = photo.access_hash;
                            byte[] bArr = photo.file_reference;
                            tL_inputPhoto.file_reference = bArr;
                            if (bArr == null) {
                                tL_inputPhoto.file_reference = new byte[0];
                            }
                            if (photoViewer.f31401z5 > 0) {
                                MessagesController.getInstance(photoViewer.T).deleteUserPhoto(tL_inputPhoto);
                            }
                            MessagesStorage.getInstance(photoViewer.T).clearUserPhoto(photoViewer.f31401z5, photo.f18345id);
                            arrayList2.remove(photoViewer.P4);
                            photoViewer.f31198c7.remove(photoViewer.P4);
                            photoViewer.f31188b7.remove(photoViewer.P4);
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
                                photoViewer.A2(i14);
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
                    photoViewer.A2(i15);
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
            default:
                rg.j0.Q((rg.j0) this.f33162b, (ArrayList) this.f33163c);
                return;
            case 4:
                ((PrivacyControlActivity) this.f33162b).t0();
                ((SharedPreferences) this.f33163c).edit().putBoolean("privacyAlertShowed", true).commit();
                return;
            case 5:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f33162b;
                TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
                boolean[] zArr2 = privacySettingsActivity.Z;
                tL_payments_clearSavedInfo.credentials = zArr2[1];
                tL_payments_clearSavedInfo.info = zArr2[0];
                privacySettingsActivity.getUserConfig().tmpPassword = null;
                privacySettingsActivity.getUserConfig().saveConfig(false);
                privacySettingsActivity.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new vb0(14, privacySettingsActivity, (org.telegram.ui.Cells.w8) this.f33163c));
                return;
            case 6:
                ProfileActivity.c0((ProfileActivity) this.f33162b, (org.telegram.ui.Cells.a2[]) this.f33163c);
                return;
            case 7:
                yz0 yz0Var = (yz0) this.f33162b;
                TLRPC.User user = (TLRPC.User) this.f33163c;
                yz0Var.getClass();
                ArrayList<TLRPC.User> arrayList10 = new ArrayList<>();
                arrayList10.add(user);
                ProfileActivity profileActivity = yz0Var.f40279b;
                profileActivity.getContactsController().deleteContact(arrayList10, true);
                if (user != null) {
                    user.contact = false;
                    profileActivity.e5(false, false);
                    return;
                }
                return;
            case 10:
                k71 k71Var = (k71) this.f33162b;
                TLRPC.User user2 = (TLRPC.User) this.f33163c;
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    k71Var.dismiss();
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    b7 b7Var = new b7(k71Var, user2, twoStepVerificationActivity, 20);
                    twoStepVerificationActivity.Z = 0;
                    twoStepVerificationActivity.f31863b0 = b7Var;
                    U.presentFragment(twoStepVerificationActivity);
                    return;
                }
                return;
            case 11:
                ab1.m((ab1) this.f33162b, (qy) this.f33163c);
                return;
            case 12:
                ThemeActivity.X((ThemeActivity) this.f33162b, (n81) this.f33163c);
                return;
            case 15:
                yb1 yb1Var = (yb1) this.f33162b;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.f33163c;
                yb1Var.getClass();
                MessagesController messagesController = MessagesController.getInstance(g6Var.E);
                if (g6Var == org.telegram.ui.ActionBar.h6.J) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                messagesController.saveTheme(g6Var, null, z10, true);
                HashMap hashMap = org.telegram.ui.ActionBar.h6.H;
                if (g6Var.f18920b == null) {
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
                    hashMap.remove(g6Var.f18918a);
                    org.telegram.ui.ActionBar.z5 z5Var = g6Var.f18930i0;
                    if (z5Var != null) {
                        org.telegram.ui.ActionBar.z5.a(z5Var);
                    }
                    org.telegram.ui.ActionBar.h6.F.remove(g6Var);
                    new File(g6Var.f18920b).delete();
                    org.telegram.ui.ActionBar.h6.s1(true, false);
                }
                if (z11) {
                    ((ActionBarLayout) ThemeActivity.c0(yb1Var.e)).U(true, true);
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeListUpdated, new Object[0]);
                return;
            case 19:
                zg1.W((zg1) this.f33162b, (byte[]) this.f33163c);
                return;
            case 20:
                mi1 mi1Var = (mi1) this.f33162b;
                mi1Var.getClass();
                ((boolean[]) this.f33163c)[0] = true;
                mi1Var.f35586p0 = 17;
                Intent intent = new Intent(mi1Var.f35558b, VoIPService.class);
                intent.putExtra("user_id", mi1Var.d.f18468id);
                intent.putExtra("is_outgoing", true);
                intent.putExtra("start_incall_activity", false);
                intent.putExtra("video_call", false);
                intent.putExtra("can_video_call", false);
                intent.putExtra("account", mi1Var.f35555a);
                try {
                    mi1Var.f35558b.startService(intent);
                    return;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    return;
                }
            case 22:
                org.telegram.ui.web.o.Y((org.telegram.ui.web.o) this.f33162b, (HashSet) this.f33163c);
                return;
            case 23:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) this.f33162b;
                TL_bots.allowSendMessage allowsendmessage = new TL_bots.allowSendMessage();
                allowsendmessage.bot = MessagesController.getInstance(b1Var.M).getInputUser(b1Var.U);
                ConnectionsManager.getInstance(b1Var.M).sendRequest(allowsendmessage, new ai.s5(b1Var, (String[]) this.f33163c, a2Var, 15));
                return;
            case 24:
                boolean[] zArr3 = (boolean[]) this.f33163c;
                JsPromptResult jsPromptResult = (JsPromptResult) this.f33162b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    jsPromptResult.cancel();
                    return;
                }
                return;
        }
    }

    @Override
    public void g(pa.b bVar) {
        ((pa.a) this.f33162b).g(bVar);
        ((pa.a) this.f33163c).g(bVar);
    }

    @Override
    public Object i() {
        switch (this.f33161a) {
            case 27:
                Iterable iterable = (Iterable) this.f33163c;
                s5.h hVar = (s5.h) ((s5.d) ((da.b) this.f33162b).f7565c);
                hVar.getClass();
                if (iterable.iterator().hasNext()) {
                    hVar.a().compileStatement("DELETE FROM events WHERE _id in " + s5.h.g(iterable)).execute();
                    return null;
                }
                return null;
            default:
                da.b bVar = (da.b) this.f33162b;
                for (Map.Entry entry : ((HashMap) this.f33163c).entrySet()) {
                    ((s5.h) ((s5.c) bVar.f7568i)).e(((Integer) entry.getValue()).intValue(), o5.c.INVALID_PAYLOD, (String) entry.getKey());
                }
                return null;
        }
    }

    @Override
    public void onFailure(Exception exc) {
        qg.y1 y1Var = (qg.y1) this.f33162b;
        Bitmap bitmap = (Bitmap) this.f33163c;
        y1Var.B0 = false;
        FileLog.e(exc);
        if (Build.VERSION.SDK_INT >= 24 && (exc instanceof mb.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && y1Var.isAttachedToWindow()) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.f1(12, y1Var, bitmap), 2000L);
        } else {
            y1Var.C0 = true;
        }
    }

    @Override
    public void onSuccess(Object obj) {
        Integer num = (Integer) obj;
        FileLog.d("wear-auth: /token delivered to " + ((String) ((cf.c) this.f33162b).d));
        ((ci.d) this.f33163c).setLoading(false);
        dj1.d = null;
        org.telegram.ui.ActionBar.e3 e3Var = dj1.f33122c;
        if (e3Var != null) {
            e3Var.dismiss();
            dj1.f33122c = null;
        }
    }

    @Override
    public Object provide(Object obj) {
        yw0 yw0Var = (yw0) this.f33163c;
        Void r10 = (Void) obj;
        PremiumPreviewFragment premiumPreviewFragment = ((zw0) this.f33162b).d.f32240n;
        premiumPreviewFragment.f31444n0.d(0, 0.0f, 0, yw0Var.getMeasuredWidth(), -yw0Var.getTier().h, premiumPreviewFragment.O);
        return premiumPreviewFragment.f31444n0.f42826f;
    }

    @Override
    public void run(boolean z10) {
        TLRPC.Chat chat = (TLRPC.Chat) this.f33163c;
        wf1 wf1Var = ((gf1) this.f33162b).f33917b;
        NotificationCenter notificationCenter = wf1Var.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(wf1Var, i10);
        wf1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        wf1Var.finishFragment();
        wf1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-chat.f18321id), null, chat, Boolean.valueOf(z10));
    }

    @Override
    public void v(nk0 nk0Var) {
        cg1 cg1Var = ((zf1) this.f33162b).f40451a;
        cg1Var.e.add(Integer.valueOf(((TLRPC.TL_forumTopic) this.f33163c).f18373id));
        cg1Var.V();
    }

    public ds0(jv0 jv0Var, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, ArrayList arrayList) {
        this.f33161a = 2;
        this.f33162b = jv0Var;
        this.f33163c = tL_messageMediaPoll;
    }

    public ds0(boolean[] zArr, JsPromptResult jsPromptResult) {
        this.f33161a = 24;
        this.f33163c = zArr;
        this.f33162b = jsPromptResult;
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.f33162b;
        Runnable runnable = (Runnable) this.f33163c;
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
    public void c0() {
    }

    @Override
    public void r0(View view, float f7, float f10) {
    }
}
