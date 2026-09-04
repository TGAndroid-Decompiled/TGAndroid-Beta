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
public final class b7 implements org.telegram.ui.Components.cl0, org.telegram.ui.Components.nj0, org.telegram.ui.Components.d5, LanguageDetector.StringCallback, v4, org.telegram.ui.ActionBar.a2, MessagesStorage.LongCallback, org.telegram.ui.Components.al0, MessagesController.NewMessageCallback, oy, ug1, org.telegram.ui.Components.voip.g3, OnSuccessListener {
    public final int f34640a;
    public final Object f34641b;
    public final Object f34642c;
    public final Object d;

    public b7(Object obj, Object obj2, Object obj3, int i10) {
        this.f34640a = i10;
        this.f34641b = obj;
        this.f34642c = obj2;
        this.d = obj3;
    }

    @Override
    public boolean B() {
        switch (this.f34640a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        TL_stars.StarsAmount starsAmount;
        switch (this.f34640a) {
            case 2:
                co coVar = (co) this.f34641b;
                coVar.getClass();
                coVar.cb((TLRPC.BotInlineResult) this.f34642c, z10, i10, ((Long) this.d).longValue());
                return;
            case 3:
            default:
                co coVar2 = (co) this.f34641b;
                TLRPC.SuggestedPost suggestedPost = (TLRPC.SuggestedPost) this.f34642c;
                MessageObject messageObject = (MessageObject) this.d;
                coVar2.getClass();
                if (z10) {
                    if (suggestedPost != null) {
                        starsAmount = suggestedPost.price;
                    } else {
                        starsAmount = null;
                    }
                    TLRPC.SuggestedPost tl = MessageSuggestionParams.of(zf.a.l(starsAmount), i10).toTl();
                    if (messageObject != null && messageObject.messageOwner != null && tl != null) {
                        coVar2.getMessagesController().addOfferToSuggestedMessage(messageObject, tl);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                co.a0((co) this.f34641b, (MessageObject.GroupedMessages) this.f34642c, (MessageObject) this.d, i10, i11);
                return;
        }
    }

    @Override
    public boolean K(uy uyVar) {
        switch (this.f34640a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void a(org.telegram.ui.Components.pj0 pj0Var, int i10) {
        int i11;
        View view = (View) this.f34641b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f34642c;
        int[] iArr = (int[]) this.d;
        if (view != null) {
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            view.measure(View.MeasureSpec.makeMeasureSpec(pj0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            i11 = view.getMeasuredHeight() + AndroidUtilities.dp(8.0f);
            view.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        } else {
            i11 = 0;
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f(iArr[0], org.telegram.messenger.w1.C(52.0f, i11, i10), true);
    }

    @Override
    public void b(d5 d5Var) {
        switch (this.f34640a) {
            case 6:
                on onVar = (on) this.f34641b;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f34642c;
                TLRPC.User user = (TLRPC.User) this.d;
                int ordinal = d5Var.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal == 5) {
                                onVar.f39283a.ma(user);
                                return;
                            }
                            return;
                        }
                        onVar.d(user);
                        return;
                    }
                    onVar.q(t1Var, user);
                    return;
                }
                onVar.x(user, false);
                return;
            default:
                on onVar2 = (on) this.f34641b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f34642c;
                org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) this.d;
                int ordinal2 = d5Var.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1 && ordinal2 != 2) {
                        if (ordinal2 != 4) {
                            if (ordinal2 == 5) {
                                onVar2.f39283a.ka(chat);
                                return;
                            }
                            return;
                        }
                        onVar2.b(chat);
                        return;
                    }
                    onVar2.p(t1Var2, chat, 0, false);
                    return;
                }
                onVar2.v(chat);
                return;
        }
    }

    @Override
    public void c(org.telegram.ui.Components.voip.h3 h3Var) {
        String string;
        ui1 ui1Var = (ui1) this.f34641b;
        VoIPService voIPService = (VoIPService) this.f34642c;
        org.telegram.ui.Components.voip.i3 i3Var = (org.telegram.ui.Components.voip.i3) this.d;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            AndroidUtilities.cancelRunOnUIThread(ui1Var.S0);
            ui1Var.R0 = false;
            if (ui1Var.f41149w0.isTouchExplorationEnabled()) {
                if (voIPService.isFrontFaceCamera()) {
                    string = LocaleController.getString(R.string.AccDescrVoipCamSwitchedToBack);
                } else {
                    string = LocaleController.getString(R.string.AccDescrVoipCamSwitchedToFront);
                }
                h3Var.announceForAccessibility(string);
            }
            i3Var.d(2, !voIPService.isFrontFaceCamera(), false);
            sharedInstance.switchCamera();
        }
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        j60.n((j60) this.f34641b, (Activity) this.f34642c, (ChatObject.Call) this.d, view, i10);
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void e(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((t71) this.f34641b).T((TLRPC.User) this.f34642c, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.d);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        String str;
        int i11;
        boolean z10;
        int i12 = this.f34640a;
        Object obj = this.d;
        Object obj2 = this.f34642c;
        Object obj3 = this.f34641b;
        switch (i12) {
            case 8:
                ip ipVar = (ip) obj3;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) obj2;
                View view = (View) obj;
                lp lpVar = ipVar.f37419a.f38100a3;
                if (tL_username.editable) {
                    if (lpVar.f38448s0 == null) {
                        lpVar.f38448s0 = Boolean.valueOf(tL_username.active);
                    }
                    tL_username.active = !tL_username.active;
                } else {
                    TLRPC.TL_channels_toggleUsername tL_channels_toggleUsername = new TLRPC.TL_channels_toggleUsername();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    TLRPC.Chat chat = lpVar.X;
                    tL_inputChannel.channel_id = chat.f19869id;
                    tL_inputChannel.access_hash = chat.access_hash;
                    tL_channels_toggleUsername.channel = tL_inputChannel;
                    tL_channels_toggleUsername.username = tL_username.username;
                    boolean z11 = tL_username.active;
                    tL_channels_toggleUsername.active = !z11;
                    lpVar.getConnectionsManager().sendRequest(tL_channels_toggleUsername, new di.t1(ipVar, tL_channels_toggleUsername, tL_username, z11, 3));
                    lpVar.P.add(tL_username.username);
                    ((na) view).setLoading(true);
                }
                lpVar.V();
                return;
            case 9:
                xp xpVar = (xp) obj3;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                xpVar.getClass();
                if (((TLRPC.ChatFull) obj2).hidden_prehistory) {
                    xpVar.getMessagesController().toggleChannelInvitesHistory(chat2.f19869id, false);
                }
                xpVar.Y(chat2, null);
                return;
            case 10:
            case 14:
            case 17:
            case 18:
            case 19:
            case 20:
            default:
                gc1 gc1Var = (gc1) obj3;
                if (org.telegram.ui.ActionBar.j6.j0(((ic1) obj2).d, (org.telegram.ui.ActionBar.h6) obj, true)) {
                    org.telegram.ui.ActionBar.j6.n1(false, false);
                    NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                    int i13 = NotificationCenter.needSetDayNightTheme;
                    if (gc1Var.f36626e.f34183f == 1) {
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
                dataSettingsActivity.n0(dataSettingsActivity.f33389n);
                ImageLoader.getInstance().checkMediaPaths(new ku(dataSettingsActivity, 2));
                ((AlertDialog$Builder) obj).f20198a.L0.run();
                return;
            case 13:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj2;
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                ((AlertDialog$Builder) obj).f20198a.L0.run();
                c00 c00Var = ((a00) obj3).E.f34579c;
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
                tL_inputChatlistDialogFilter.filter_id = c00Var.f34955c.f17080id;
                tL_chatlists_editExportedInvite.slug = c00Var.b0();
                tL_chatlists_editExportedInvite.revoked = tL_exportedChatlistInvite.revoked;
                tL_chatlists_editExportedInvite.flags = 2 | tL_chatlists_editExportedInvite.flags;
                tL_chatlists_editExportedInvite.title = tL_exportedChatlistInvite.title;
                c00Var.F = c00Var.getConnectionsManager().sendRequest(tL_chatlists_editExportedInvite, new rz(c00Var, 0));
                Utilities.Callback callback = c00Var.f34963y;
                if (callback != null) {
                    callback.run(tL_exportedChatlistInvite);
                    return;
                }
                return;
            case 15:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) obj2;
                AndroidUtilities.hideKeyboard(editTextBoldCursor2);
                ((m50) obj3).f38574b.f37513a1.setTitle(editTextBoldCursor2.getText().toString());
                ((AlertDialog$Builder) obj).f20198a.L0.run();
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
                i11 = ((org.telegram.ui.ActionBar.n2) q81Var.f39754a).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(resetauthorization, new bc0(20, q81Var, tL_authorization));
                ((e81) obj3).d.dismiss();
                return;
        }
    }

    @Override
    public boolean onMessageReceived(TLRPC.Message message) {
        xo0 xo0Var = (xo0) this.f34641b;
        org.telegram.ui.ActionBar.d5 d5Var = (org.telegram.ui.ActionBar.d5) this.f34642c;
        Activity activity = (Activity) this.d;
        if (MessageObject.getPeerId(message.peer_id) == xo0Var.f42827l0.f20016id && (message.action instanceof TLRPC.TL_messageActionPaymentSent)) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.in0(xo0Var, d5Var, activity, message, 26));
            return true;
        }
        return false;
    }

    @Override
    public void onSuccess(Object obj) {
        org.telegram.ui.ActionBar.f6 f6Var;
        float f7;
        cf.c cVar = (cf.c) this.f34641b;
        Integer num = (Integer) obj;
        FileLog.d("wear-auth: /answer delivered to " + ((String) cVar.d));
        ((di.d) this.f34642c).setLoading(false);
        int i10 = ((int[]) this.d)[0];
        ArrayList arrayList = (ArrayList) cVar.f4796a;
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
                org.telegram.ui.ActionBar.f3 f3Var = lj1.f38397c;
                if (f3Var != null) {
                    f3Var.dismiss();
                    lj1.f38397c = null;
                }
                org.telegram.ui.ActionBar.f3 i11 = org.telegram.messenger.wl.i(1, context, f6Var, false);
                FrameLayout frameLayout = new FrameLayout(context);
                i11.customView = frameLayout;
                LinearLayout f10 = org.telegram.messenger.wl.f(context, 1);
                frameLayout.addView(f10, w7.x5.e(-1, -1, 119));
                TextView b10 = w7.b6.b(context, 20.0f, org.telegram.ui.ActionBar.j6.f20770j5, true, f6Var);
                b10.setGravity(17);
                b10.setText(LocaleController.getString(R.string.WearAuthEmojis));
                f10.addView(b10, w7.x5.r(-1, -2, 49, 32.0f, 24.0f, 32.0f, 9.66f));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    Drawable emojiBigDrawable = Emoji.getEmojiBigDrawable((String) arrayList.get(i12));
                    ImageView imageView = new ImageView(context);
                    imageView.setImageDrawable(emojiBigDrawable);
                    NotificationCenter.listenEmojiLoading(imageView);
                    imageView.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.j6.l1(0.15f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var))));
                    if (i12 == 0) {
                        f7 = 0.0f;
                    } else {
                        f7 = 5.0f;
                    }
                    linearLayout.addView(imageView, w7.x5.k(f7, 0.0f, 0.0f, 0.0f, 80, 80));
                }
                f10.addView(linearLayout, w7.x5.t(-2, -2, 49, 32, 12, 32, 12));
                di.d g10 = org.telegram.messenger.wl.g(24, context, f6Var, true);
                g10.setText(LocaleController.getString(R.string.WearAuthEmojisLogIn));
                f10.addView(g10, w7.x5.t(-1, 48, 7, 12, 12, 12, 8));
                int i13 = org.telegram.ui.ActionBar.j6.f20607a7;
                i11.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
                i11.fixNavigationBar(org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
                lj1.f38397c = i11;
                i11.show();
                g10.setOnClickListener(new org.telegram.ui.Cells.ua(g10, i10, i11, 16));
            }
        }
    }

    @Override
    public void run(long j3) {
        qq.a0((qq) this.f34641b, (TLRPC.InputCheckPasswordSRP) this.f34642c, (TwoStepVerificationActivity) this.d, j3);
    }

    @Override
    public boolean u(uy uyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, eg1 eg1Var) {
        long j3;
        int i12;
        String str;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i13 = this.f34640a;
        Object obj = this.d;
        Object obj2 = this.f34642c;
        Object obj3 = this.f34641b;
        switch (i13) {
            case 18:
                ArrayList<MessageObject> arrayList2 = (ArrayList) obj2;
                co coVar = (co) obj;
                PhotoViewer photoViewer = ((rs0) obj3).f40230b;
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
                    co coVar2 = new co(i14);
                    if (topicKey.topicId != 0) {
                        og.d.a(coVar2, topicKey);
                    }
                    if (((LaunchActivity) photoViewer.f33727y).q0(coVar2, true, false)) {
                        coVar2.Ab(arrayList2);
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
                    if (coVar != null) {
                        coVar.Q7();
                        UndoView undoView = coVar.y3;
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
                i01 i01Var = (i01) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                uy uyVar2 = (uy) obj;
                long j12 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                ProfileActivity profileActivity = i01Var.f37149b;
                i12 = ((org.telegram.ui.ActionBar.n2) profileActivity).currentAccount;
                TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-j12));
                if (chat != null && (chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.add_admins))) {
                    profileActivity.getMessagesController().checkIsInChat(false, chat, user, new di.s9(i01Var, j12, uyVar2, 6));
                } else {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.f34031z0);
                    String string = LocaleController.getString(R.string.AddBot);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20198a;
                    b2Var.R = string;
                    if (chat == null) {
                        str = "";
                    } else {
                        str = chat.title;
                    }
                    b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AddMembersAlertNamesText", R.string.AddMembersAlertNamesText, UserObject.getUserName(user), str));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder.k(LocaleController.getString(R.string.AddBot), new di.y6(i01Var, j12, uyVar, user));
                    profileActivity.showDialog(b2Var);
                }
                return true;
        }
    }

    @Override
    public boolean mo18d(float f7, float f10, int i10, final View view) {
        final e7 e7Var = (e7) this.f34641b;
        org.telegram.ui.Components.ll0 ll0Var = (org.telegram.ui.Components.ll0) this.f34642c;
        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.d;
        s7 s7Var = e7Var.d;
        f7 f7Var = (f7) ll0Var.getAdapter();
        final m7 m7Var = (m7) f7Var.f36277e.get(i10);
        if (!(view instanceof k7) && !(view instanceof org.telegram.ui.Cells.t7)) {
            i7 i7Var = s7Var.v;
            if (i7Var != null) {
                i7Var.k1(m7Var.f38586c, m7Var.d, true);
            }
            return true;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(s7Var.getContext(), null);
        if (view instanceof org.telegram.ui.Cells.t7) {
            org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_view_file, LocaleController.getString(R.string.CacheOpenFile), false, null).setOnClickListener(new bi.l0(e7Var, m7Var, f7Var, ll0Var, view, 5));
        } else if (((k7) view).f37946b.getChildAt(0) instanceof org.telegram.ui.Cells.i7) {
            org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_played, LocaleController.getString(R.string.PlayFile), false, null).setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    switch (r4) {
                        case 0:
                            e7 e7Var2 = e7Var;
                            s7.b(e7Var2.d, m7Var.d, (k7) view);
                            org.telegram.ui.ActionBar.n1 n1Var = e7Var2.f35953a;
                            if (n1Var != null) {
                                n1Var.d(true);
                                return;
                            }
                            return;
                        default:
                            e7 e7Var3 = e7Var;
                            s7.b(e7Var3.d, m7Var.d, (k7) view);
                            org.telegram.ui.ActionBar.n1 n1Var2 = e7Var3.f35953a;
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
                            s7.b(e7Var2.d, m7Var.d, (k7) view);
                            org.telegram.ui.ActionBar.n1 n1Var = e7Var2.f35953a;
                            if (n1Var != null) {
                                n1Var.d(true);
                                return;
                            }
                            return;
                        default:
                            e7 e7Var3 = e7Var;
                            s7.b(e7Var3.d, m7Var.d, (k7) view);
                            org.telegram.ui.ActionBar.n1 n1Var2 = e7Var3.f35953a;
                            if (n1Var2 != null) {
                                n1Var2.d(true);
                                return;
                            }
                            return;
                    }
                }
            });
        }
        ai.b bVar = m7Var.d;
        if (bVar.f739b != 0 && bVar.f743g != 0) {
            org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_viewintopic, LocaleController.getString(R.string.ViewInChat), false, null).setOnClickListener(new z(e7Var, m7Var, n2Var, 1));
        }
        org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_select, LocaleController.getString(!s7Var.f40330f.f751j.contains(m7Var.d) ? R.string.Select : R.string.Deselect), false, null).setOnClickListener(new bi.u1(26, e7Var, m7Var));
        e7Var.f35953a = org.telegram.ui.Components.e5.Q(n2Var, actionBarPopupWindow$ActionBarPopupWindowLayout, view, (int) f7, (int) f10);
        s7Var.getRootView().dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
        return true;
    }

    @Override
    public void run(String str) {
        co coVar = (co) this.f34641b;
        org.telegram.ui.Cells.h0 h0Var = (org.telegram.ui.Cells.h0) this.f34642c;
        CharSequence charSequence = (CharSequence) this.d;
        String language = LocaleController.getInstance().getCurrentLocale().getLanguage();
        if (str != null && ((!str.equals(language) || str.equals("und")) && !h41.Y().contains(str))) {
            h0Var.setOnClickListener(new bi.l0(coVar, str, language, charSequence, h0Var, 7));
        } else {
            h0Var.setClickable(false);
        }
    }

    @Override
    public void h() {
    }

    @Override
    public void q(float f7) {
    }

    @Override
    public void q0(View view, float f7, float f10) {
    }
}
