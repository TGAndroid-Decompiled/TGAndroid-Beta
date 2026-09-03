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
public final class f7 implements org.telegram.ui.Components.kl0, org.telegram.ui.Components.wj0, org.telegram.ui.Components.y4, LanguageDetector.StringCallback, z4, org.telegram.ui.ActionBar.c2, MessagesStorage.LongCallback, org.telegram.ui.Components.il0, MessagesController.NewMessageCallback, ky, ig1, org.telegram.ui.Components.voip.i3, OnSuccessListener {
    public final int f33973a;
    public final Object f33974b;
    public final Object f33975c;
    public final Object d;

    public f7(Object obj, Object obj2, Object obj3, int i10) {
        this.f33973a = i10;
        this.f33974b = obj;
        this.f33975c = obj2;
        this.d = obj3;
    }

    @Override
    public boolean C() {
        switch (this.f33973a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean I(qy qyVar) {
        switch (this.f33973a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void J(int i10, int i11, boolean z4) {
        TL_stars.StarsAmount starsAmount;
        switch (this.f33973a) {
            case 2:
                zn znVar = (zn) this.f33974b;
                znVar.getClass();
                znVar.cb((TLRPC.BotInlineResult) this.f33975c, z4, i10, ((Long) this.d).longValue());
                return;
            case 3:
            default:
                zn znVar2 = (zn) this.f33974b;
                TLRPC.SuggestedPost suggestedPost = (TLRPC.SuggestedPost) this.f33975c;
                MessageObject messageObject = (MessageObject) this.d;
                znVar2.getClass();
                if (z4) {
                    if (suggestedPost != null) {
                        starsAmount = suggestedPost.price;
                    } else {
                        starsAmount = null;
                    }
                    TLRPC.SuggestedPost tl = MessageSuggestionParams.of(lf.a.l(starsAmount), i10).toTl();
                    if (messageObject != null && messageObject.messageOwner != null && tl != null) {
                        znVar2.getMessagesController().addOfferToSuggestedMessage(messageObject, tl);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                zn.a0((zn) this.f33974b, (MessageObject.GroupedMessages) this.f33975c, (MessageObject) this.d, i10, i11);
                return;
        }
    }

    @Override
    public boolean Z0(View view) {
        return false;
    }

    @Override
    public void a(org.telegram.ui.Components.yj0 yj0Var, int i10) {
        int i11;
        View view = (View) this.f33974b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f33975c;
        int[] iArr = (int[]) this.d;
        if (view != null) {
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            view.measure(View.MeasureSpec.makeMeasureSpec(yj0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            i11 = view.getMeasuredHeight() + AndroidUtilities.dp(8.0f);
            view.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        } else {
            i11 = 0;
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f(iArr[0], org.telegram.messenger.y3.C(52.0f, i11, i10), true);
    }

    @Override
    public void b(h5 h5Var) {
        switch (this.f33973a) {
            case 6:
                ln lnVar = (ln) this.f33974b;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.f33975c;
                TLRPC.User user = (TLRPC.User) this.d;
                int ordinal = h5Var.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal == 5) {
                                lnVar.f35808a.ma(user);
                                return;
                            }
                            return;
                        }
                        lnVar.c(user);
                        return;
                    }
                    lnVar.r(s1Var, user);
                    return;
                }
                lnVar.x(user, false);
                return;
            default:
                ln lnVar2 = (ln) this.f33974b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f33975c;
                org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) this.d;
                int ordinal2 = h5Var.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1 && ordinal2 != 2) {
                        if (ordinal2 != 4) {
                            if (ordinal2 == 5) {
                                lnVar2.f35808a.ka(chat);
                                return;
                            }
                            return;
                        }
                        lnVar2.b(chat);
                        return;
                    }
                    lnVar2.p(s1Var2, chat, 0, false);
                    return;
                }
                lnVar2.v(chat);
                return;
        }
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        e60.n((e60) this.f33974b, (Activity) this.f33975c, (ChatObject.Call) this.d, view, i10);
    }

    @Override
    public void f(org.telegram.ui.Components.voip.j3 j3Var) {
        String string;
        ii1 ii1Var = (ii1) this.f33974b;
        VoIPService voIPService = (VoIPService) this.f33975c;
        org.telegram.ui.Components.voip.k3 k3Var = (org.telegram.ui.Components.voip.k3) this.d;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            AndroidUtilities.cancelRunOnUIThread(ii1Var.P0);
            ii1Var.O0 = false;
            if (ii1Var.f34979t0.isTouchExplorationEnabled()) {
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
    public void g(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((i71) this.f33974b).T((TLRPC.User) this.f33975c, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.d);
    }

    @Override
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        String str;
        int i11;
        boolean z4;
        int i12 = this.f33973a;
        Object obj = this.d;
        Object obj2 = this.f33975c;
        Object obj3 = this.f33974b;
        switch (i12) {
            case 8:
                cp cpVar = (cp) obj3;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) obj2;
                View view = (View) obj;
                fp fpVar = cpVar.f33206a.X2;
                if (tL_username.editable) {
                    if (fpVar.f34196p0 == null) {
                        fpVar.f34196p0 = Boolean.valueOf(tL_username.active);
                    }
                    tL_username.active = !tL_username.active;
                } else {
                    TLRPC.TL_channels_toggleUsername tL_channels_toggleUsername = new TLRPC.TL_channels_toggleUsername();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    TLRPC.Chat chat = fpVar.U;
                    tL_inputChannel.channel_id = chat.f19159id;
                    tL_inputChannel.access_hash = chat.access_hash;
                    tL_channels_toggleUsername.channel = tL_inputChannel;
                    tL_channels_toggleUsername.username = tL_username.username;
                    boolean z10 = tL_username.active;
                    tL_channels_toggleUsername.active = !z10;
                    fpVar.getConnectionsManager().sendRequest(tL_channels_toggleUsername, new yd(cpVar, tL_channels_toggleUsername, tL_username, z10, 2));
                    fpVar.M.add(tL_username.username);
                    ((oa) view).setLoading(true);
                }
                fpVar.V();
                return;
            case 9:
                sp spVar = (sp) obj3;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                spVar.getClass();
                if (((TLRPC.ChatFull) obj2).hidden_prehistory) {
                    spVar.getMessagesController().toggleChannelInvitesHistory(chat2.f19159id, false);
                }
                spVar.Y(chat2, null);
                return;
            case 10:
            case 14:
            case 17:
            case 18:
            case 19:
            case 20:
            default:
                tb1 tb1Var = (tb1) obj3;
                if (org.telegram.ui.ActionBar.j6.j0(((vb1) obj2).d, (org.telegram.ui.ActionBar.h6) obj, true)) {
                    org.telegram.ui.ActionBar.j6.n1(false, false);
                    NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                    int i13 = NotificationCenter.needSetDayNightTheme;
                    if (tb1Var.e.f32313f == 1) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    globalInstance.lambda$postNotificationNameOnUIThread$1(i13, org.telegram.ui.ActionBar.j6.I, Boolean.valueOf(z4), null, -1);
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
                dataSettingsActivity.n0(dataSettingsActivity.f31555n);
                ImageLoader.getInstance().checkMediaPaths(new ju(dataSettingsActivity, 2));
                ((AlertDialog$Builder) obj).f19478a.I0.run();
                return;
            case 13:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj2;
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                ((AlertDialog$Builder) obj).f19478a.I0.run();
                a00 a00Var = ((yz) obj3).B.f40905c;
                a00Var.d.title = editTextBoldCursor.getText().toString();
                a00Var.d0(true);
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = a00Var.d;
                if (a00Var.C != 0) {
                    a00Var.getConnectionsManager().cancelRequest(a00Var.C, true);
                    a00Var.C = 0;
                }
                TL_chatlists.TL_chatlists_editExportedInvite tL_chatlists_editExportedInvite = new TL_chatlists.TL_chatlists_editExportedInvite();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_editExportedInvite.chatlist = tL_inputChatlistDialogFilter;
                tL_inputChatlistDialogFilter.filter_id = a00Var.f32400c.f16649id;
                tL_chatlists_editExportedInvite.slug = a00Var.b0();
                tL_chatlists_editExportedInvite.revoked = tL_exportedChatlistInvite.revoked;
                tL_chatlists_editExportedInvite.flags = 2 | tL_chatlists_editExportedInvite.flags;
                tL_chatlists_editExportedInvite.title = tL_exportedChatlistInvite.title;
                a00Var.C = a00Var.getConnectionsManager().sendRequest(tL_chatlists_editExportedInvite, new oz(a00Var, 0));
                Utilities.Callback callback = a00Var.f32407y;
                if (callback != null) {
                    callback.run(tL_exportedChatlistInvite);
                    return;
                }
                return;
            case 15:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) obj2;
                AndroidUtilities.hideKeyboard(editTextBoldCursor2);
                ((i50) obj3).f34803b.X0.setTitle(editTextBoldCursor2.getText().toString());
                ((AlertDialog$Builder) obj).f19478a.I0.run();
                return;
            case 16:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj3;
                notificationsSettingsActivity.getClass();
                notificationsSettingsActivity.presentFragment(new NotificationsCustomSettingsActivity(-1, (ArrayList) obj2, (ArrayList) obj, false));
                return;
            case 21:
                f81 f81Var = (f81) obj2;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) obj;
                TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
                resetauthorization.hash = tL_authorization.hash;
                i11 = ((org.telegram.ui.ActionBar.p2) f81Var.f33980a).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(resetauthorization, new ub0(20, f81Var, tL_authorization));
                ((t71) obj3).d.dismiss();
                return;
        }
    }

    @Override
    public boolean onMessageReceived(TLRPC.Message message) {
        lo0 lo0Var = (lo0) this.f33974b;
        org.telegram.ui.ActionBar.e5 e5Var = (org.telegram.ui.ActionBar.e5) this.f33975c;
        Activity activity = (Activity) this.d;
        if (MessageObject.getPeerId(message.peer_id) == lo0Var.f35830i0.f19306id && (message.action instanceof TLRPC.TL_messageActionPaymentSent)) {
            AndroidUtilities.runOnUIThread(new c30(lo0Var, e5Var, activity, message, 17));
            return true;
        }
        return false;
    }

    @Override
    public void onSuccess(Object obj) {
        org.telegram.ui.ActionBar.f6 f6Var;
        float f10;
        c5.j jVar = (c5.j) this.f33974b;
        Integer num = (Integer) obj;
        FileLog.d("wear-auth: /answer delivered to " + ((String) jVar.f2154c));
        ((ph.d) this.f33975c).setLoading(false);
        int i10 = ((int[]) this.d)[0];
        ArrayList arrayList = (ArrayList) jVar.e;
        if (arrayList != null && !arrayList.isEmpty()) {
            Context context = LaunchActivity.D1;
            if (context == null) {
                context = ApplicationLoader.applicationContext;
            }
            if (context != null) {
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    f6Var = U.getResourceProvider();
                } else {
                    f6Var = null;
                }
                org.telegram.ui.ActionBar.g3 g3Var = zi1.f40491c;
                if (g3Var != null) {
                    g3Var.dismiss();
                    zi1.f40491c = null;
                }
                org.telegram.ui.ActionBar.g3 o10 = org.telegram.messenger.y3.o(context, f6Var, false, false);
                FrameLayout frameLayout = new FrameLayout(context);
                o10.customView = frameLayout;
                LinearLayout f11 = org.telegram.messenger.y3.f(context, 1);
                frameLayout.addView(f11, k7.b6.e(-1, -1, 119));
                TextView b10 = k7.f6.b(context, 20.0f, org.telegram.ui.ActionBar.j6.f19987j5, true, f6Var);
                b10.setGravity(17);
                b10.setText(LocaleController.getString(R.string.WearAuthEmojis));
                f11.addView(b10, k7.b6.r(-1, -2, 49, 32.0f, 24.0f, 32.0f, 9.66f));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    Drawable emojiBigDrawable = Emoji.getEmojiBigDrawable((String) arrayList.get(i11));
                    ImageView imageView = new ImageView(context);
                    imageView.setImageDrawable(emojiBigDrawable);
                    NotificationCenter.listenEmojiLoading(imageView);
                    imageView.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.j6.l1(0.15f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var))));
                    if (i11 == 0) {
                        f10 = 0.0f;
                    } else {
                        f10 = 5.0f;
                    }
                    linearLayout.addView(imageView, k7.b6.k(f10, 0.0f, 0.0f, 0.0f, 80, 80));
                }
                f11.addView(linearLayout, k7.b6.t(-2, -2, 49, 32, 12, 32, 12));
                ph.d p10 = org.telegram.messenger.y3.p(24, context, f6Var, true);
                p10.setText(LocaleController.getString(R.string.WearAuthEmojisLogIn));
                f11.addView(p10, k7.b6.t(-1, 48, 7, 12, 12, 12, 8));
                int i12 = org.telegram.ui.ActionBar.j6.f19827a7;
                o10.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
                o10.fixNavigationBar(org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
                zi1.f40491c = o10;
                o10.show();
                p10.setOnClickListener(new dg.m2(p10, i10, o10, 20));
            }
        }
    }

    @Override
    public void run(long j10) {
        lq.a0((lq) this.f33974b, (TLRPC.InputCheckPasswordSRP) this.f33975c, (TwoStepVerificationActivity) this.d, j10);
    }

    @Override
    public boolean w(qy qyVar, ArrayList arrayList, CharSequence charSequence, boolean z4, boolean z10, int i10, int i11, sf1 sf1Var) {
        long j10;
        int i12;
        String str;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i13 = this.f33973a;
        Object obj = this.d;
        Object obj2 = this.f33975c;
        Object obj3 = this.f33974b;
        switch (i13) {
            case 18:
                ArrayList<MessageObject> arrayList2 = (ArrayList) obj2;
                zn znVar = (zn) obj;
                PhotoViewer photoViewer = ((ds0) obj3).f33528b;
                if (arrayList.size() <= 1 && ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId != UserConfig.getInstance(photoViewer.Q).getClientUserId() && charSequence == null) {
                    MessagesStorage.TopicKey topicKey = (MessagesStorage.TopicKey) arrayList.get(0);
                    long j11 = topicKey.dialogId;
                    Bundle i14 = android.support.v4.media.a.i("scrollToTopOnResume", true);
                    if (DialogObject.isEncryptedDialog(j11)) {
                        i14.putInt("enc_id", DialogObject.getEncryptedChatId(j11));
                    } else if (DialogObject.isUserDialog(j11)) {
                        i14.putLong("user_id", j11);
                    } else {
                        i14.putLong("chat_id", -j11);
                    }
                    zn znVar2 = new zn(i14);
                    if (topicKey.topicId != 0) {
                        ag.f.a(znVar2, topicKey);
                    }
                    if (((LaunchActivity) photoViewer.f31887y).q0(znVar2, true, false)) {
                        znVar2.Ab(arrayList2);
                    } else {
                        qyVar.finishFragment();
                    }
                } else {
                    for (int i15 = 0; i15 < arrayList.size(); i15++) {
                        long j12 = ((MessagesStorage.TopicKey) arrayList.get(i15)).dialogId;
                        if (charSequence != null) {
                            j10 = j12;
                            SendMessagesHelper.getInstance(photoViewer.Q).sendMessage(SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
                        } else {
                            j10 = j12;
                        }
                        SendMessagesHelper.getInstance(photoViewer.Q).sendMessage(arrayList2, j10, false, false, true, 0, 0L);
                    }
                    qyVar.finishFragment();
                    if (znVar != null) {
                        znVar.Q7();
                        UndoView undoView = znVar.f40775v3;
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
                vz0 vz0Var = (vz0) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                qy qyVar2 = (qy) obj;
                long j13 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                ProfileActivity profileActivity = vz0Var.f39224b;
                i12 = ((org.telegram.ui.ActionBar.p2) profileActivity).currentAccount;
                TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-j13));
                if (chat != null && (chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.add_admins))) {
                    profileActivity.getMessagesController().checkIsInChat(false, chat, user, new e3.f(vz0Var, j13, qyVar2, 9));
                } else {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.f32155w0);
                    String string = LocaleController.getString(R.string.AddBot);
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
                    d2Var.O = string;
                    if (chat == null) {
                        str = "";
                    } else {
                        str = chat.title;
                    }
                    d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("AddMembersAlertNamesText", R.string.AddMembersAlertNamesText, UserObject.getUserName(user), str));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder.k(LocaleController.getString(R.string.AddBot), new d9.c(vz0Var, j13, qyVar, user));
                    profileActivity.showDialog(d2Var);
                }
                return true;
        }
    }

    @Override
    public boolean mo17c(float f10, float f11, int i10, final View view) {
        final i7 i7Var = (i7) this.f33974b;
        org.telegram.ui.Components.rl0 rl0Var = (org.telegram.ui.Components.rl0) this.f33975c;
        org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.d;
        w7 w7Var = i7Var.d;
        j7 j7Var = (j7) rl0Var.getAdapter();
        final q7 q7Var = (q7) j7Var.e.get(i10);
        if (!(view instanceof o7) && !(view instanceof org.telegram.ui.Cells.q7)) {
            m7 m7Var = w7Var.v;
            if (m7Var != null) {
                m7Var.r(q7Var.f37321c, q7Var.d, true);
            }
            return true;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(w7Var.getContext(), null);
        if (view instanceof org.telegram.ui.Cells.q7) {
            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_view_file, LocaleController.getString(R.string.CacheOpenFile), false, null).setOnClickListener(new nh.c0(i7Var, q7Var, j7Var, rl0Var, view, 4));
        } else if (((o7) view).f36667b.getChildAt(0) instanceof org.telegram.ui.Cells.g7) {
            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_played, LocaleController.getString(R.string.PlayFile), false, null).setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    switch (r4) {
                        case 0:
                            i7 i7Var2 = i7Var;
                            w7.b(i7Var2.d, q7Var.d, (o7) view);
                            org.telegram.ui.ActionBar.p1 p1Var = i7Var2.f34810a;
                            if (p1Var != null) {
                                p1Var.d(true);
                                return;
                            }
                            return;
                        default:
                            i7 i7Var3 = i7Var;
                            w7.b(i7Var3.d, q7Var.d, (o7) view);
                            org.telegram.ui.ActionBar.p1 p1Var2 = i7Var3.f34810a;
                            if (p1Var2 != null) {
                                p1Var2.d(true);
                                return;
                            }
                            return;
                    }
                }
            });
        } else {
            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_view_file, LocaleController.getString(R.string.CacheOpenFile), false, null).setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    switch (r4) {
                        case 0:
                            i7 i7Var2 = i7Var;
                            w7.b(i7Var2.d, q7Var.d, (o7) view);
                            org.telegram.ui.ActionBar.p1 p1Var = i7Var2.f34810a;
                            if (p1Var != null) {
                                p1Var.d(true);
                                return;
                            }
                            return;
                        default:
                            i7 i7Var3 = i7Var;
                            w7.b(i7Var3.d, q7Var.d, (o7) view);
                            org.telegram.ui.ActionBar.p1 p1Var2 = i7Var3.f34810a;
                            if (p1Var2 != null) {
                                p1Var2.d(true);
                                return;
                            }
                            return;
                    }
                }
            });
        }
        mh.a aVar = q7Var.d;
        if (aVar.f14158b != 0 && aVar.f14161g != 0) {
            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_viewintopic, LocaleController.getString(R.string.ViewInChat), false, null).setOnClickListener(new c0(i7Var, q7Var, p2Var, 1));
        }
        org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_select, LocaleController.getString(!w7Var.f39283f.f14168j.contains(q7Var.d) ? R.string.Select : R.string.Deselect), false, null).setOnClickListener(new org.telegram.messenger.video.g(11, i7Var, q7Var));
        i7Var.f34810a = org.telegram.ui.Components.z4.Q(p2Var, actionBarPopupWindow$ActionBarPopupWindowLayout, view, (int) f10, (int) f11);
        w7Var.getRootView().dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
        return true;
    }

    @Override
    public void run(String str) {
        zn znVar = (zn) this.f33974b;
        org.telegram.ui.Cells.h0 h0Var = (org.telegram.ui.Cells.h0) this.f33975c;
        CharSequence charSequence = (CharSequence) this.d;
        String language = LocaleController.getInstance().getCurrentLocale().getLanguage();
        if (str != null && ((!str.equals(language) || str.equals("und")) && !t31.Y().contains(str))) {
            h0Var.setOnClickListener(new nh.c0(znVar, str, language, charSequence, h0Var, 6));
        } else {
            h0Var.setClickable(false);
        }
    }

    @Override
    public void h() {
    }

    @Override
    public void p(float f10) {
    }

    @Override
    public void n0(View view, float f10, float f11) {
    }
}
