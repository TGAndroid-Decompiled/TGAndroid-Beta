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
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;

public final class b7 implements org.telegram.ui.Components.sk0, org.telegram.ui.Components.ej0, org.telegram.ui.Components.x4, LanguageDetector.StringCallback, v4, org.telegram.ui.ActionBar.a2, MessagesStorage.LongCallback, org.telegram.ui.Components.qk0, MessagesController.NewMessageCallback, zx, mf1, org.telegram.ui.Components.voip.h3, OnSuccessListener {

    public final int f36709a;

    public final Object f36710b;

    public final Object f36711c;
    public final Object d;

    public b7(Object obj, Object obj2, Object obj3, int i10) {
        this.f36709a = i10;
        this.f36710b = obj;
        this.f36711c = obj2;
        this.d = obj3;
    }

    @Override
    public boolean D() {
        switch (this.f36709a) {
        }
        return false;
    }

    @Override
    public void I(int i10, int i11, boolean z10) {
        switch (this.f36709a) {
            case 2:
                rn rnVar = (rn) this.f36710b;
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.f36711c;
                Long l10 = (Long) this.d;
                rnVar.getClass();
                rnVar.cb(botInlineResult, z10, i10, l10.longValue());
                break;
            case 3:
            default:
                rn rnVar2 = (rn) this.f36710b;
                TLRPC.SuggestedPost suggestedPost = (TLRPC.SuggestedPost) this.f36711c;
                MessageObject messageObject = (MessageObject) this.d;
                rnVar2.getClass();
                if (z10) {
                    TLRPC.SuggestedPost tl = MessageSuggestionParams.of(hf.a.l(suggestedPost != null ? suggestedPost.price : null), i10).toTl();
                    if (messageObject != null && messageObject.messageOwner != null && tl != null) {
                        rnVar2.getMessagesController().addOfferToSuggestedMessage(messageObject, tl);
                        break;
                    }
                }
                break;
            case 4:
                rn.a0((rn) this.f36710b, (MessageObject.GroupedMessages) this.f36711c, (MessageObject) this.d, i10, i11);
                break;
        }
    }

    @Override
    public boolean K(gy gyVar) {
        switch (this.f36709a) {
        }
        return false;
    }

    @Override
    public void a(org.telegram.ui.Components.gj0 gj0Var, int i10) {
        int measuredHeight;
        View view = (View) this.f36710b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f36711c;
        int[] iArr = (int[]) this.d;
        if (view != null) {
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight2 = view.getMeasuredHeight();
            view.measure(View.MeasureSpec.makeMeasureSpec(gj0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            measuredHeight = view.getMeasuredHeight() + AndroidUtilities.dp(8.0f);
            view.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
        } else {
            measuredHeight = 0;
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f(iArr[0], org.telegram.messenger.y1.C(52.0f, measuredHeight, i10), true);
    }

    @Override
    public void b(d5 d5Var) {
        switch (this.f36709a) {
            case 6:
                dn dnVar = (dn) this.f36710b;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.f36711c;
                TLRPC.User user = (TLRPC.User) this.d;
                int iOrdinal = d5Var.ordinal();
                if (iOrdinal == 0) {
                    dnVar.s(user, false);
                    break;
                } else if (iOrdinal == 3) {
                    dnVar.n(s1Var, user);
                    break;
                } else if (iOrdinal == 4) {
                    dnVar.c(user);
                    break;
                } else if (iOrdinal == 5) {
                    dnVar.f37446a.ma(user);
                    break;
                }
                break;
            default:
                dn dnVar2 = (dn) this.f36710b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f36711c;
                org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) this.d;
                int iOrdinal2 = d5Var.ordinal();
                if (iOrdinal2 == 0) {
                    dnVar2.r(chat);
                    break;
                } else if (iOrdinal2 != 1 && iOrdinal2 != 2) {
                    if (iOrdinal2 == 4) {
                        dnVar2.b(chat);
                        break;
                    } else if (iOrdinal2 == 5) {
                        dnVar2.f37446a.ka(chat);
                        break;
                    }
                } else {
                    dnVar2.m(s1Var2, chat, 0, false);
                    break;
                }
                break;
        }
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        s50.n((s50) this.f36710b, (Activity) this.f36711c, (ChatObject.Call) this.d, view, i10);
    }

    @Override
    public void d(org.telegram.ui.Components.voip.i3 i3Var) {
        lh1 lh1Var = (lh1) this.f36710b;
        VoIPService voIPService = (VoIPService) this.f36711c;
        org.telegram.ui.Components.voip.j3 j3Var = (org.telegram.ui.Components.voip.j3) this.d;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            AndroidUtilities.cancelRunOnUIThread(lh1Var.O0);
            lh1Var.N0 = false;
            if (lh1Var.f40123s0.isTouchExplorationEnabled()) {
                i3Var.announceForAccessibility(voIPService.isFrontFaceCamera() ? LocaleController.getString(R.string.AccDescrVoipCamSwitchedToBack) : LocaleController.getString(R.string.AccDescrVoipCamSwitchedToFront));
            }
            j3Var.d(2, !voIPService.isFrontFaceCamera(), false);
            sharedInstance.switchCamera();
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        String string;
        int i11 = this.f36709a;
        int i12 = 2;
        int i13 = 0;
        Object obj = this.d;
        Object obj2 = this.f36711c;
        Object obj3 = this.f36710b;
        switch (i11) {
            case 8:
                uo uoVar = (uo) obj3;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) obj2;
                View view = (View) obj;
                xo xoVar = uoVar.f43265a.W2;
                if (tL_username.editable) {
                    if (xoVar.f44567o0 == null) {
                        xoVar.f44567o0 = Boolean.valueOf(tL_username.active);
                    }
                    tL_username.active = !tL_username.active;
                } else {
                    TLRPC.TL_channels_toggleUsername tL_channels_toggleUsername = new TLRPC.TL_channels_toggleUsername();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    TLRPC.Chat chat = xoVar.T;
                    tL_inputChannel.channel_id = chat.f22380id;
                    tL_inputChannel.access_hash = chat.access_hash;
                    tL_channels_toggleUsername.channel = tL_inputChannel;
                    tL_channels_toggleUsername.username = tL_username.username;
                    boolean z10 = tL_username.active;
                    tL_channels_toggleUsername.active = !z10;
                    xoVar.getConnectionsManager().sendRequest(tL_channels_toggleUsername, new lh.r1(uoVar, tL_channels_toggleUsername, tL_username, z10, 3));
                    xoVar.L.add(tL_username.username);
                    ((ka) view).setLoading(true);
                }
                xoVar.V();
                break;
            case 9:
                jp jpVar = (jp) obj3;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                jpVar.getClass();
                if (((TLRPC.ChatFull) obj2).hidden_prehistory) {
                    jpVar.getMessagesController().toggleChannelInvitesHistory(chat2.f22380id, false);
                }
                jpVar.Y(chat2, null);
                break;
            case 10:
            case 14:
            case 17:
            case 18:
            case 19:
            case 20:
            default:
                va1 va1Var = (va1) obj3;
                if (org.telegram.ui.ActionBar.g6.j0(((xa1) obj2).d, (org.telegram.ui.ActionBar.e6) obj, true)) {
                    org.telegram.ui.ActionBar.g6.n1(false, false);
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, org.telegram.ui.ActionBar.g6.I, Boolean.valueOf(va1Var.f43398e.f36237f == 1), null, -1);
                }
                break;
            case 11:
                ContactsActivity contactsActivity = (ContactsActivity) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                EditText editText = (EditText) obj;
                if (editText != null) {
                    contactsActivity.getClass();
                    string = editText.getText().toString();
                } else {
                    string = "0";
                }
                contactsActivity.n0(user, false, string);
                break;
            case 12:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) obj3;
                SharedConfig.storageCacheDir = (String) obj2;
                SharedConfig.saveConfig();
                SharedConfig.readOnlyStorageDirAlertShowed = false;
                dataSettingsActivity.n0(dataSettingsActivity.f35462n);
                ImageLoader.getInstance().checkMediaPaths(new bu(dataSettingsActivity, i12));
                ((AlertDialog$Builder) obj).f22702a.H0.run();
                break;
            case 13:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj2;
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                ((AlertDialog$Builder) obj).f22702a.H0.run();
                oz ozVar = ((mz) obj3).A.f40959c;
                ozVar.d.title = editTextBoldCursor.getText().toString();
                ozVar.d0(true);
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = ozVar.d;
                if (ozVar.B != 0) {
                    ozVar.getConnectionsManager().cancelRequest(ozVar.B, true);
                    ozVar.B = 0;
                }
                TL_chatlists.TL_chatlists_editExportedInvite tL_chatlists_editExportedInvite = new TL_chatlists.TL_chatlists_editExportedInvite();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_editExportedInvite.chatlist = tL_inputChatlistDialogFilter;
                tL_inputChatlistDialogFilter.filter_id = ozVar.f41218c.f19622id;
                tL_chatlists_editExportedInvite.slug = ozVar.b0();
                tL_chatlists_editExportedInvite.revoked = tL_exportedChatlistInvite.revoked;
                tL_chatlists_editExportedInvite.flags = 2 | tL_chatlists_editExportedInvite.flags;
                tL_chatlists_editExportedInvite.title = tL_exportedChatlistInvite.title;
                ozVar.B = ozVar.getConnectionsManager().sendRequest(tL_chatlists_editExportedInvite, new dz(ozVar, i13));
                Utilities.Callback callback = ozVar.f41226y;
                if (callback != null) {
                    callback.run(tL_exportedChatlistInvite);
                }
                break;
            case 15:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) obj2;
                AndroidUtilities.hideKeyboard(editTextBoldCursor2);
                ((v40) obj3).f43351b.W0.setTitle(editTextBoldCursor2.getText().toString());
                ((AlertDialog$Builder) obj).f22702a.H0.run();
                break;
            case 16:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj3;
                notificationsSettingsActivity.getClass();
                notificationsSettingsActivity.presentFragment(new NotificationsCustomSettingsActivity(-1, (ArrayList) obj2, (ArrayList) obj, false));
                break;
            case 21:
                g71 g71Var = (g71) obj2;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) obj;
                TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
                resetauthorization.hash = tL_authorization.hash;
                ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) g71Var.f38331a).currentAccount).sendRequest(resetauthorization, new v80(24, g71Var, tL_authorization));
                ((v61) obj3).d.dismiss();
                break;
        }
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public void h(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((k61) this.f36710b).T((TLRPC.User) this.f36711c, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.d);
    }

    @Override
    public boolean onMessageReceived(TLRPC.Message message) {
        do0 do0Var = (do0) this.f36710b;
        org.telegram.ui.ActionBar.b5 b5Var = (org.telegram.ui.ActionBar.b5) this.f36711c;
        Activity activity = (Activity) this.d;
        if (MessageObject.getPeerId(message.peer_id) != do0Var.f37465h0.f22527id || !(message.action instanceof TLRPC.TL_messageActionPaymentSent)) {
            return false;
        }
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.l11(do0Var, b5Var, activity, message, 21));
        return true;
    }

    @Override
    public void onSuccess(Object obj) {
        af.h hVar = (af.h) this.f36710b;
        lh.d dVar = (lh.d) this.f36711c;
        int[] iArr = (int[]) this.d;
        FileLog.d("wear-auth: /answer delivered to " + ((String) hVar.f276c));
        int i10 = 0;
        dVar.setLoading(false);
        int i11 = iArr[0];
        ArrayList arrayList = (ArrayList) hVar.f277e;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Context context = LaunchActivity.C1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        if (context == null) {
            return;
        }
        org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
        org.telegram.ui.ActionBar.c6 resourceProvider = n2VarU != null ? n2VarU.getResourceProvider() : null;
        org.telegram.ui.ActionBar.e3 e3Var = ci1.f37101c;
        if (e3Var != null) {
            e3Var.dismiss();
            ci1.f37101c = null;
        }
        org.telegram.ui.ActionBar.e3 e3VarO = org.telegram.messenger.y1.o(context, resourceProvider, false, false);
        FrameLayout frameLayout = new FrameLayout(context);
        e3VarO.customView = frameLayout;
        LinearLayout linearLayoutG = org.telegram.messenger.y1.g(context, 1);
        frameLayout.addView(linearLayoutG, h7.z5.e(-1, -1, 119));
        TextView textViewB = h7.d6.b(context, 20.0f, org.telegram.ui.ActionBar.g6.f23161j5, true, resourceProvider);
        textViewB.setGravity(17);
        textViewB.setText(LocaleController.getString(R.string.WearAuthEmojis));
        linearLayoutG.addView(textViewB, h7.z5.r(-1, -2, 49, 32.0f, 24.0f, 32.0f, 9.66f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        while (i10 < arrayList.size()) {
            Drawable emojiBigDrawable = Emoji.getEmojiBigDrawable((String) arrayList.get(i10));
            ImageView imageView = new ImageView(context);
            imageView.setImageDrawable(emojiBigDrawable);
            NotificationCenter.listenEmojiLoading(imageView);
            imageView.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.g6.l1(0.15f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, resourceProvider))));
            linearLayout.addView(imageView, h7.z5.k(i10 == 0 ? 0.0f : 5.0f, 0.0f, 0.0f, 0.0f, 80, 80));
            i10++;
        }
        linearLayoutG.addView(linearLayout, h7.z5.t(-2, -2, 49, 32, 12, 32, 12));
        lh.d dVarG = org.telegram.messenger.rl.g(24, context, resourceProvider, true);
        dVarG.setText(LocaleController.getString(R.string.WearAuthEmojisLogIn));
        linearLayoutG.addView(dVarG, h7.z5.t(-1, 48, 7, 12, 12, 12, 8));
        int i12 = org.telegram.ui.ActionBar.g6.f22999a7;
        e3VarO.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(i12, resourceProvider));
        e3VarO.fixNavigationBar(org.telegram.ui.ActionBar.g6.v0(i12, resourceProvider));
        ci1.f37101c = e3VarO;
        e3VarO.show();
        dVarG.setOnClickListener(new gh.v2(dVarG, i11, e3VarO, 19));
    }

    @Override
    public void run(long j10) {
        dq.a0((dq) this.f36710b, (TLRPC.InputCheckPasswordSRP) this.f36711c, (TwoStepVerificationActivity) this.d, j10);
    }

    @Override
    public boolean w(gy gyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, we1 we1Var) {
        long j10;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i12 = this.f36709a;
        Object obj = this.d;
        Object obj2 = this.f36711c;
        Object obj3 = this.f36710b;
        switch (i12) {
            case 18:
                ArrayList<MessageObject> arrayList2 = (ArrayList) obj2;
                rn rnVar = (rn) obj;
                PhotoViewer photoViewer = ((qr0) obj3).f41739b;
                if (arrayList.size() > 1 || ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId == UserConfig.getInstance(photoViewer.P).getClientUserId() || charSequence != null) {
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        long j11 = ((MessagesStorage.TopicKey) arrayList.get(i13)).dialogId;
                        if (charSequence != null) {
                            j10 = j11;
                            SendMessagesHelper.getInstance(photoViewer.P).sendMessage(SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
                        } else {
                            j10 = j11;
                        }
                        SendMessagesHelper.getInstance(photoViewer.P).sendMessage(arrayList2, j10, false, false, true, 0, 0L);
                    }
                    gyVar.finishFragment();
                    if (rnVar != null) {
                        rnVar.Q7();
                        UndoView undoView = rnVar.f42229u3;
                        if (undoView != null) {
                            if (arrayList.size() == 1) {
                                undoView.m(((MessagesStorage.TopicKey) arrayList.get(0)).dialogId, Integer.valueOf(arrayList2.size()), 53);
                            } else {
                                undoView.k(0L, 53, Integer.valueOf(arrayList2.size()), Integer.valueOf(arrayList.size()), null, null);
                            }
                        }
                    }
                } else {
                    MessagesStorage.TopicKey topicKey = (MessagesStorage.TopicKey) arrayList.get(0);
                    long j12 = topicKey.dialogId;
                    Bundle bundleH = a9.p.h("scrollToTopOnResume", true);
                    if (DialogObject.isEncryptedDialog(j12)) {
                        bundleH.putInt("enc_id", DialogObject.getEncryptedChatId(j12));
                    } else if (DialogObject.isUserDialog(j12)) {
                        bundleH.putLong("user_id", j12);
                    } else {
                        bundleH.putLong("chat_id", -j12);
                    }
                    rn rnVar2 = new rn(bundleH);
                    if (topicKey.topicId != 0) {
                        wf.c.a(rnVar2, topicKey);
                    }
                    if (((LaunchActivity) photoViewer.f35800y).q0(rnVar2, true, false)) {
                        rnVar2.Ab(arrayList2);
                    } else {
                        gyVar.finishFragment();
                    }
                }
                break;
            default:
                dz0 dz0Var = (dz0) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                gy gyVar2 = (gy) obj;
                long j13 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                ProfileActivity profileActivity = dz0Var.f37574b;
                TLRPC.Chat chat = MessagesController.getInstance(((org.telegram.ui.ActionBar.n2) profileActivity).currentAccount).getChat(Long.valueOf(-j13));
                if (chat == null || (!chat.creator && ((tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.add_admins))) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.f36067v0);
                    String string = LocaleController.getString(R.string.AddBot);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                    b2Var.N = string;
                    b2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("AddMembersAlertNamesText", R.string.AddMembersAlertNamesText, UserObject.getUserName(user), chat == null ? "" : chat.title));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder.k(LocaleController.getString(R.string.AddBot), new a9.d(dz0Var, j13, gyVar, user));
                    profileActivity.showDialog(b2Var);
                } else {
                    profileActivity.getMessagesController().checkIsInChat(false, chat, user, new c3.f(dz0Var, j13, gyVar2, 10));
                }
                break;
        }
        return true;
    }

    @Override
    public boolean mo5c(float f10, float f11, int i10, final View view) {
        final e7 e7Var = (e7) this.f36710b;
        org.telegram.ui.Components.zk0 zk0Var = (org.telegram.ui.Components.zk0) this.f36711c;
        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.d;
        s7 s7Var = e7Var.d;
        f7 f7Var = (f7) zk0Var.getAdapter();
        final m7 m7Var = (m7) f7Var.f37950e.get(i10);
        if (!(view instanceof k7) && !(view instanceof org.telegram.ui.Cells.o7)) {
            i7 i7Var = s7Var.v;
            if (i7Var != null) {
                i7Var.J(m7Var.f40384c, m7Var.d, true);
            }
            return true;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(s7Var.getContext(), null);
        if (view instanceof org.telegram.ui.Cells.o7) {
            org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_view_file, LocaleController.getString(R.string.CacheOpenFile), false, null).setOnClickListener(new jh.b0(e7Var, m7Var, f7Var, zk0Var, view, 4));
        } else if (((k7) view).f39629b.getChildAt(0) instanceof org.telegram.ui.Cells.e7) {
            final int i11 = 0;
            org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_played, LocaleController.getString(R.string.PlayFile), false, null).setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    switch (i11) {
                        case 0:
                            e7 e7Var2 = e7Var;
                            s7.b(e7Var2.d, m7Var.d, (k7) view);
                            org.telegram.ui.ActionBar.n1 n1Var = e7Var2.f37641a;
                            if (n1Var != null) {
                                n1Var.d(true);
                            }
                            break;
                        default:
                            e7 e7Var3 = e7Var;
                            s7.b(e7Var3.d, m7Var.d, (k7) view);
                            org.telegram.ui.ActionBar.n1 n1Var2 = e7Var3.f37641a;
                            if (n1Var2 != null) {
                                n1Var2.d(true);
                            }
                            break;
                    }
                }
            });
        } else {
            final int i12 = 1;
            org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_view_file, LocaleController.getString(R.string.CacheOpenFile), false, null).setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    switch (i12) {
                        case 0:
                            e7 e7Var2 = e7Var;
                            s7.b(e7Var2.d, m7Var.d, (k7) view);
                            org.telegram.ui.ActionBar.n1 n1Var = e7Var2.f37641a;
                            if (n1Var != null) {
                                n1Var.d(true);
                            }
                            break;
                        default:
                            e7 e7Var3 = e7Var;
                            s7.b(e7Var3.d, m7Var.d, (k7) view);
                            org.telegram.ui.ActionBar.n1 n1Var2 = e7Var3.f37641a;
                            if (n1Var2 != null) {
                                n1Var2.d(true);
                            }
                            break;
                    }
                }
            });
        }
        ih.a aVar = m7Var.d;
        if (aVar.f11477b != 0 && aVar.f11481g != 0) {
            org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_viewintopic, LocaleController.getString(R.string.ViewInChat), false, null).setOnClickListener(new c0(e7Var, m7Var, n2Var, 1));
        }
        org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_select, LocaleController.getString(!s7Var.f42534f.f11489j.contains(m7Var.d) ? R.string.Select : R.string.Deselect), false, null).setOnClickListener(new nh.x1(14, e7Var, m7Var));
        e7Var.f37641a = org.telegram.ui.Components.y4.Q(n2Var, actionBarPopupWindow$ActionBarPopupWindowLayout, view, (int) f10, (int) f11);
        s7Var.getRootView().dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
        return true;
    }

    @Override
    public void run(String str) {
        rn rnVar = (rn) this.f36710b;
        org.telegram.ui.Cells.h0 h0Var = (org.telegram.ui.Cells.h0) this.f36711c;
        CharSequence charSequence = (CharSequence) this.d;
        String language = LocaleController.getInstance().getCurrentLocale().getLanguage();
        if (str == null || ((str.equals(language) && !str.equals("und")) || a31.Y().contains(str))) {
            h0Var.setClickable(false);
        } else {
            h0Var.setOnClickListener(new jh.b0(rnVar, str, language, charSequence, h0Var, 6));
        }
    }

    @Override
    public void i() {
    }

    @Override
    public void s(float f10) {
    }

    @Override
    public void c0(View view, float f10, float f11) {
    }
}
