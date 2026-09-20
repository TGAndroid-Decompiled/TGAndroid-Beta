package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
public final class b7 implements org.telegram.ui.Components.ml0, org.telegram.ui.Components.xj0, org.telegram.ui.Components.c5, LanguageDetector.StringCallback, v4, org.telegram.ui.ActionBar.a2, MessagesStorage.LongCallback, org.telegram.ui.Components.kl0, MessagesController.NewMessageCallback, oy, vg1, org.telegram.ui.Components.voip.i3, OnSuccessListener {
    public final int f32267a;
    public final Object f32268b;
    public final Object f32269c;
    public final Object d;

    public b7(Object obj, Object obj2, Object obj3, int i10) {
        this.f32267a = i10;
        this.f32268b = obj;
        this.f32269c = obj2;
        this.d = obj3;
    }

    @Override
    public boolean A() {
        switch (this.f32267a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        TL_stars.StarsAmount starsAmount;
        switch (this.f32267a) {
            case 2:
                zn znVar = (zn) this.f32268b;
                znVar.getClass();
                znVar.cb((TLRPC.BotInlineResult) this.f32269c, z10, i10, ((Long) this.d).longValue());
                return;
            case 3:
            default:
                zn znVar2 = (zn) this.f32268b;
                TLRPC.SuggestedPost suggestedPost = (TLRPC.SuggestedPost) this.f32269c;
                MessageObject messageObject = (MessageObject) this.d;
                znVar2.getClass();
                if (z10) {
                    if (suggestedPost != null) {
                        starsAmount = suggestedPost.price;
                    } else {
                        starsAmount = null;
                    }
                    TLRPC.SuggestedPost tl = MessageSuggestionParams.of(zf.a.l(starsAmount), i10).toTl();
                    if (messageObject != null && messageObject.messageOwner != null && tl != null) {
                        znVar2.getMessagesController().addOfferToSuggestedMessage(messageObject, tl);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                zn.d1((zn) this.f32268b, (MessageObject.GroupedMessages) this.f32269c, (MessageObject) this.d, i10, i11);
                return;
        }
    }

    @Override
    public boolean K(uy uyVar) {
        switch (this.f32267a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void a(org.telegram.ui.Components.zj0 zj0Var, int i10) {
        int i11;
        View view = (View) this.f32268b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f32269c;
        int[] iArr = (int[]) this.d;
        if (view != null) {
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            view.measure(View.MeasureSpec.makeMeasureSpec(zj0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            i11 = view.getMeasuredHeight() + AndroidUtilities.dp(8.0f);
            view.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        } else {
            i11 = 0;
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f(iArr[0], org.telegram.messenger.l0.C(52.0f, i11, i10), true);
    }

    @Override
    public void b(d5 d5Var) {
        switch (this.f32267a) {
            case 6:
                ln lnVar = (ln) this.f32268b;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f32269c;
                TLRPC.User user = (TLRPC.User) this.d;
                int ordinal = d5Var.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal == 5) {
                                lnVar.f35482a.ma(user);
                                return;
                            }
                            return;
                        }
                        lnVar.c(user);
                        return;
                    }
                    lnVar.v(u1Var, user);
                    return;
                }
                lnVar.y(user, false);
                return;
            default:
                ln lnVar2 = (ln) this.f32268b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f32269c;
                org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) this.d;
                int ordinal2 = d5Var.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1 && ordinal2 != 2) {
                        if (ordinal2 != 4) {
                            if (ordinal2 == 5) {
                                lnVar2.f35482a.ka(chat);
                                return;
                            }
                            return;
                        }
                        lnVar2.b(chat);
                        return;
                    }
                    lnVar2.q(u1Var2, chat, 0, false);
                    return;
                }
                lnVar2.x(chat);
                return;
        }
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        i60.n((i60) this.f32268b, (Activity) this.f32269c, (ChatObject.Call) this.d, view, i10);
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public void e(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((t71) this.f32268b).T((TLRPC.User) this.f32269c, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.d);
    }

    @Override
    public void f(org.telegram.ui.Components.voip.j3 j3Var) {
        String string;
        ti1 ti1Var = (ti1) this.f32268b;
        VoIPService voIPService = (VoIPService) this.f32269c;
        org.telegram.ui.Components.voip.k3 k3Var = (org.telegram.ui.Components.voip.k3) this.d;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            AndroidUtilities.cancelRunOnUIThread(ti1Var.S0);
            ti1Var.R0 = false;
            if (ti1Var.f37810w0.isTouchExplorationEnabled()) {
                if (voIPService.isFrontFaceCamera()) {
                    string = LocaleController.getString(R.string.AccDescrVoipCamSwitchedToBack);
                } else {
                    string = LocaleController.getString(R.string.AccDescrVoipCamSwitchedToFront);
                }
                j3Var.announceForAccessibility(string);
            }
            k3Var.d(2, !voIPService.isFrontFaceCamera(), false);
            sharedInstance.switchCamera();
        }
    }

    @Override
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        String str;
        int i11;
        boolean z10;
        int i12 = this.f32267a;
        Object obj = this.d;
        Object obj2 = this.f32269c;
        Object obj3 = this.f32268b;
        switch (i12) {
            case 8:
                fp fpVar = (fp) obj3;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) obj2;
                View view = (View) obj;
                ip ipVar = fpVar.f33702a.f34250a3;
                if (tL_username.editable) {
                    if (ipVar.f34653s0 == null) {
                        ipVar.f34653s0 = Boolean.valueOf(tL_username.active);
                    }
                    tL_username.active = !tL_username.active;
                } else {
                    TLRPC.TL_channels_toggleUsername tL_channels_toggleUsername = new TLRPC.TL_channels_toggleUsername();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    TLRPC.Chat chat = ipVar.X;
                    tL_inputChannel.channel_id = chat.f18328id;
                    tL_inputChannel.access_hash = chat.access_hash;
                    tL_channels_toggleUsername.channel = tL_inputChannel;
                    tL_channels_toggleUsername.username = tL_username.username;
                    boolean z11 = tL_username.active;
                    tL_channels_toggleUsername.active = !z11;
                    ipVar.getConnectionsManager().sendRequest(tL_channels_toggleUsername, new ci.t1(fpVar, tL_channels_toggleUsername, tL_username, z11, 3));
                    ipVar.P.add(tL_username.username);
                    ((oa) view).setLoading(true);
                }
                ipVar.V();
                return;
            case 9:
                up upVar = (up) obj3;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                upVar.getClass();
                if (((TLRPC.ChatFull) obj2).hidden_prehistory) {
                    upVar.getMessagesController().toggleChannelInvitesHistory(chat2.f18328id, false);
                }
                upVar.Y(chat2, null);
                return;
            case 10:
            case 14:
            case 17:
            case 18:
            case 19:
            case 20:
            default:
                hc1 hc1Var = (hc1) obj3;
                if (org.telegram.ui.ActionBar.j6.j0(((jc1) obj2).d, (org.telegram.ui.ActionBar.h6) obj, true)) {
                    org.telegram.ui.ActionBar.j6.n1(false, false);
                    NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                    int i13 = NotificationCenter.needSetDayNightTheme;
                    if (hc1Var.e.f31841f == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    globalInstance.lambda$postNotificationNameOnUIThread$1(i13, org.telegram.ui.ActionBar.j6.I, Boolean.valueOf(z10), null, -1);
                    return;
                }
                return;
            case 11:
                ContactsActivity contactsActivity = (ContactsActivity) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                EditText editText = (EditText) obj;
                if (editText != null) {
                    contactsActivity.getClass();
                    str = editText.getText().toString();
                } else {
                    str = "0";
                }
                contactsActivity.n0(user, false, str);
                return;
            case 12:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) obj3;
                SharedConfig.storageCacheDir = (String) obj2;
                SharedConfig.saveConfig();
                SharedConfig.readOnlyStorageDirAlertShowed = false;
                dataSettingsActivity.n0(dataSettingsActivity.f31067n);
                ImageLoader.getInstance().checkMediaPaths(new ku(dataSettingsActivity, 2));
                ((AlertDialog$Builder) obj).f18654a.L0.run();
                return;
            case 13:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj2;
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                ((AlertDialog$Builder) obj).f18654a.L0.run();
                c00 c00Var = ((a00) obj3).E.f32228c;
                c00Var.d.title = editTextBoldCursor.getText().toString();
                c00Var.d0(true);
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = c00Var.d;
                if (c00Var.F != 0) {
                    c00Var.getConnectionsManager().cancelRequest(c00Var.F, true);
                    c00Var.F = 0;
                }
                TL_chatlists.TL_chatlists_editExportedInvite tL_chatlists_editExportedInvite = new TL_chatlists.TL_chatlists_editExportedInvite();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_editExportedInvite.chatlist = tL_inputChatlistDialogFilter;
                tL_inputChatlistDialogFilter.filter_id = c00Var.f32567c.f15822id;
                tL_chatlists_editExportedInvite.slug = c00Var.b0();
                tL_chatlists_editExportedInvite.revoked = tL_exportedChatlistInvite.revoked;
                tL_chatlists_editExportedInvite.flags = 2 | tL_chatlists_editExportedInvite.flags;
                tL_chatlists_editExportedInvite.title = tL_exportedChatlistInvite.title;
                c00Var.F = c00Var.getConnectionsManager().sendRequest(tL_chatlists_editExportedInvite, new rz(c00Var, 0));
                Utilities.Callback callback = c00Var.f32574y;
                if (callback != null) {
                    callback.run(tL_exportedChatlistInvite);
                    return;
                }
                return;
            case 15:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) obj2;
                AndroidUtilities.hideKeyboard(editTextBoldCursor2);
                ((l50) obj3).f35306b.f34360a1.setTitle(editTextBoldCursor2.getText().toString());
                ((AlertDialog$Builder) obj).f18654a.L0.run();
                return;
            case 16:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj3;
                notificationsSettingsActivity.getClass();
                notificationsSettingsActivity.presentFragment(new NotificationsCustomSettingsActivity(-1, (ArrayList) obj2, (ArrayList) obj, false));
                return;
            case 21:
                q81 q81Var = (q81) obj2;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) obj;
                TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
                resetauthorization.hash = tL_authorization.hash;
                i11 = ((org.telegram.ui.ActionBar.n2) q81Var.f36794a).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(resetauthorization, new dc0(20, q81Var, tL_authorization));
                ((e81) obj3).d.dismiss();
                return;
        }
    }

    @Override
    public boolean onMessageReceived(TLRPC.Message message) {
        xo0 xo0Var = (xo0) this.f32268b;
        org.telegram.ui.ActionBar.d5 d5Var = (org.telegram.ui.ActionBar.d5) this.f32269c;
        Activity activity = (Activity) this.d;
        if (MessageObject.getPeerId(message.peer_id) == xo0Var.f39664l0.f18475id && (message.action instanceof TLRPC.TL_messageActionPaymentSent)) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.vn0(xo0Var, d5Var, activity, message, 26));
            return true;
        }
        return false;
    }

    @Override
    public void onSuccess(Object obj) {
        org.telegram.ui.ActionBar.f6 f6Var;
        float f7;
        cf.c cVar = (cf.c) this.f32268b;
        Integer num = (Integer) obj;
        FileLog.d("wear-auth: /answer delivered to " + ((String) cVar.d));
        ((ci.d) this.f32269c).setLoading(false);
        int i10 = ((int[]) this.d)[0];
        ArrayList arrayList = (ArrayList) cVar.f4261a;
        if (arrayList != null && !arrayList.isEmpty()) {
            Context context = LaunchActivity.G1;
            if (context == null) {
                context = ApplicationLoader.applicationContext;
            }
            if (context != null) {
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    f6Var = U.getResourceProvider();
                } else {
                    f6Var = null;
                }
                org.telegram.ui.ActionBar.f3 f3Var = kj1.f35201c;
                if (f3Var != null) {
                    f3Var.dismiss();
                    kj1.f35201c = null;
                }
                org.telegram.ui.ActionBar.f3 j3 = org.telegram.messenger.rk.j(1, context, f6Var, false);
                FrameLayout frameLayout = new FrameLayout(context);
                j3.customView = frameLayout;
                LinearLayout f10 = org.telegram.messenger.rk.f(context, 1);
                frameLayout.addView(f10, w7.y5.e(-1, -1, 119));
                TextView b10 = w7.d6.b(context, 20.0f, org.telegram.ui.ActionBar.j6.f19201j5, true, f6Var);
                b10.setGravity(17);
                b10.setText(LocaleController.getString(R.string.WearAuthEmojis));
                f10.addView(b10, w7.y5.r(-1, -2, 49, 32.0f, 24.0f, 32.0f, 9.66f));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    Drawable emojiBigDrawable = Emoji.getEmojiBigDrawable((String) arrayList.get(i11));
                    ImageView imageView = new ImageView(context);
                    imageView.setImageDrawable(emojiBigDrawable);
                    NotificationCenter.listenEmojiLoading(imageView);
                    imageView.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.j6.l1(0.15f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var))));
                    if (i11 == 0) {
                        f7 = 0.0f;
                    } else {
                        f7 = 5.0f;
                    }
                    linearLayout.addView(imageView, w7.y5.k(f7, 0.0f, 0.0f, 0.0f, 80, 80));
                }
                f10.addView(linearLayout, w7.y5.t(-2, -2, 49, 32, 12, 32, 12));
                ci.d g10 = org.telegram.messenger.rk.g(24, context, f6Var, true);
                g10.setText(LocaleController.getString(R.string.WearAuthEmojisLogIn));
                f10.addView(g10, w7.y5.t(-1, 48, 7, 12, 12, 12, 8));
                int i12 = org.telegram.ui.ActionBar.j6.f19038a7;
                j3.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
                j3.fixNavigationBar(org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
                kj1.f35201c = j3;
                j3.show();
                g10.setOnClickListener(new org.telegram.ui.Cells.va(g10, i10, j3, 16));
            }
        }
    }

    @Override
    public void run(long j3) {
        nq.a0((nq) this.f32268b, (TLRPC.InputCheckPasswordSRP) this.f32269c, (TwoStepVerificationActivity) this.d, j3);
    }

    @Override
    public boolean u(uy uyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, fg1 fg1Var) {
        long j3;
        int i12;
        String str;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i13 = this.f32267a;
        Object obj = this.d;
        Object obj2 = this.f32269c;
        Object obj3 = this.f32268b;
        switch (i13) {
            case 18:
                ArrayList<MessageObject> arrayList2 = (ArrayList) obj2;
                zn znVar = (zn) obj;
                PhotoViewer photoViewer = ((ss0) obj3).f37521b;
                if (arrayList.size() <= 1 && ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId != UserConfig.getInstance(photoViewer.T).getClientUserId() && charSequence == null) {
                    MessagesStorage.TopicKey topicKey = (MessagesStorage.TopicKey) arrayList.get(0);
                    long j10 = topicKey.dialogId;
                    Bundle i14 = a4.a.i("scrollToTopOnResume", true);
                    if (DialogObject.isEncryptedDialog(j10)) {
                        i14.putInt("enc_id", DialogObject.getEncryptedChatId(j10));
                    } else if (DialogObject.isUserDialog(j10)) {
                        i14.putLong("user_id", j10);
                    } else {
                        i14.putLong("chat_id", -j10);
                    }
                    zn znVar2 = new zn(i14);
                    if (topicKey.topicId != 0) {
                        ng.d.a(znVar2, topicKey);
                    }
                    if (((LaunchActivity) photoViewer.f31399y).q0(znVar2, true, false)) {
                        znVar2.Ab(arrayList2);
                    } else {
                        uyVar.finishFragment();
                    }
                } else {
                    for (int i15 = 0; i15 < arrayList.size(); i15++) {
                        long j11 = ((MessagesStorage.TopicKey) arrayList.get(i15)).dialogId;
                        if (charSequence != null) {
                            j3 = j11;
                            SendMessagesHelper.getInstance(photoViewer.T).sendMessage(SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j3, null, null, null, true, null, null, null, true, 0, 0, null, false));
                        } else {
                            j3 = j11;
                        }
                        SendMessagesHelper.getInstance(photoViewer.T).sendMessage(arrayList2, j3, false, false, true, 0, 0L);
                    }
                    uyVar.finishFragment();
                    if (znVar != null) {
                        znVar.Q7();
                        UndoView undoView = znVar.y3;
                        if (undoView != null) {
                            if (arrayList.size() == 1) {
                                undoView.m(((MessagesStorage.TopicKey) arrayList.get(0)).dialogId, Integer.valueOf(arrayList2.size()), 53);
                            } else {
                                undoView.k(0L, 53, Integer.valueOf(arrayList2.size()), Integer.valueOf(arrayList.size()), null, null);
                            }
                        }
                    }
                }
                return true;
            default:
                h01 h01Var = (h01) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                uy uyVar2 = (uy) obj;
                long j12 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                ProfileActivity profileActivity = h01Var.f34039b;
                i12 = ((org.telegram.ui.ActionBar.n2) profileActivity).currentAccount;
                TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-j12));
                if (chat != null && (chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.add_admins))) {
                    profileActivity.getMessagesController().checkIsInChat(false, chat, user, new ci.t9(h01Var, j12, uyVar2, 6));
                } else {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.f31696z0);
                    String string = LocaleController.getString(R.string.AddBot);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18654a;
                    b2Var.R = string;
                    if (chat == null) {
                        str = "";
                    } else {
                        str = chat.title;
                    }
                    b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AddMembersAlertNamesText", R.string.AddMembersAlertNamesText, UserObject.getUserName(user), str));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder.k(LocaleController.getString(R.string.AddBot), new ci.z6(h01Var, j12, uyVar, user));
                    profileActivity.showDialog(b2Var);
                }
                return true;
        }
    }

    @Override
    public boolean mo18c(float f7, float f10, int i10, final View view) {
        final e7 e7Var = (e7) this.f32268b;
        org.telegram.ui.Components.vl0 vl0Var = (org.telegram.ui.Components.vl0) this.f32269c;
        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.d;
        t7 t7Var = e7Var.e;
        g7 g7Var = (g7) vl0Var.getAdapter();
        final n7 n7Var = (n7) g7Var.e.get(i10);
        if (!(view instanceof l7) && !(view instanceof org.telegram.ui.Cells.u7)) {
            j7 j7Var = t7Var.E;
            if (j7Var != null) {
                j7Var.H0(n7Var.f35900c, n7Var.d, true);
            }
            return true;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(t7Var.getContext(), null);
        if (view instanceof org.telegram.ui.Cells.u7) {
            org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_view_file, LocaleController.getString(R.string.CacheOpenFile), false, null).setOnClickListener(new ai.s0(e7Var, n7Var, g7Var, vl0Var, view, 5));
        } else if (((l7) view).f35331b.getChildAt(0) instanceof org.telegram.ui.Cells.k7) {
            org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_played, LocaleController.getString(R.string.PlayFile), false, null).setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    switch (r4) {
                        case 0:
                            e7 e7Var2 = e7Var;
                            t7.b(e7Var2.e, n7Var.d, (l7) view);
                            org.telegram.ui.ActionBar.n1 n1Var = e7Var2.f33242a;
                            if (n1Var != null) {
                                n1Var.d(true);
                                return;
                            }
                            return;
                        default:
                            e7 e7Var3 = e7Var;
                            t7.b(e7Var3.e, n7Var.d, (l7) view);
                            org.telegram.ui.ActionBar.n1 n1Var2 = e7Var3.f33242a;
                            if (n1Var2 != null) {
                                n1Var2.d(true);
                                return;
                            }
                            return;
                    }
                }
            });
        } else {
            org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_view_file, LocaleController.getString(R.string.CacheOpenFile), false, null).setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    switch (r4) {
                        case 0:
                            e7 e7Var2 = e7Var;
                            t7.b(e7Var2.e, n7Var.d, (l7) view);
                            org.telegram.ui.ActionBar.n1 n1Var = e7Var2.f33242a;
                            if (n1Var != null) {
                                n1Var.d(true);
                                return;
                            }
                            return;
                        default:
                            e7 e7Var3 = e7Var;
                            t7.b(e7Var3.e, n7Var.d, (l7) view);
                            org.telegram.ui.ActionBar.n1 n1Var2 = e7Var3.f33242a;
                            if (n1Var2 != null) {
                                n1Var2.d(true);
                                return;
                            }
                            return;
                    }
                }
            });
        }
        zh.a aVar = n7Var.d;
        if (aVar.f49492b != 0 && aVar.f49495g != 0) {
            org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_viewintopic, LocaleController.getString(R.string.ViewInChat), false, null).setOnClickListener(new z(e7Var, n7Var, n2Var, 1));
        }
        org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_select, LocaleController.getString(!t7Var.f37648f.f49502j.contains(n7Var.d) ? R.string.Select : R.string.Deselect), false, null).setOnClickListener(new ai.f2(26, e7Var, n7Var));
        e7Var.f33242a = org.telegram.ui.Components.d5.Q(n2Var, actionBarPopupWindow$ActionBarPopupWindowLayout, view, (int) f7, (int) f10);
        t7Var.getRootView().dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
        return true;
    }

    @Override
    public void run(String str) {
        zn znVar = (zn) this.f32268b;
        org.telegram.ui.Cells.h0 h0Var = (org.telegram.ui.Cells.h0) this.f32269c;
        CharSequence charSequence = (CharSequence) this.d;
        String language = LocaleController.getInstance().getCurrentLocale().getLanguage();
        if (str != null && ((!str.equals(language) || str.equals("und")) && !f41.Y().contains(str))) {
            h0Var.setOnClickListener(new ai.s0(znVar, str, language, charSequence, h0Var, 7));
        } else {
            h0Var.setClickable(false);
        }
    }

    @Override
    public void g() {
    }

    @Override
    public void q(float f7) {
    }

    @Override
    public void q0(View view, float f7, float f10) {
    }
}
