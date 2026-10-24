package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
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
public final class e7 implements org.telegram.ui.Components.cm0, org.telegram.ui.Components.nk0, org.telegram.ui.Components.b5, LanguageDetector.StringCallback, z4, org.telegram.ui.ActionBar.z1, MessagesStorage.LongCallback, org.telegram.ui.Components.am0, MessagesController.NewMessageCallback, xx, nf1, org.telegram.ui.Components.voip.g3, OnSuccessListener {
    public final int f36814a;
    public final Object f36815b;
    public final Object f36816c;
    public final Object d;

    public e7(Object obj, Object obj2, Object obj3, int i10) {
        this.f36814a = i10;
        this.f36815b = obj;
        this.f36816c = obj2;
        this.d = obj3;
    }

    @Override
    public void C(int i10, int i11, boolean z10) {
        TL_stars.StarsAmount starsAmount;
        switch (this.f36814a) {
            case 2:
                sn snVar = (sn) this.f36815b;
                snVar.getClass();
                snVar.hb((TLRPC.BotInlineResult) this.f36816c, z10, i10, ((Long) this.d).longValue());
                return;
            case 3:
            default:
                sn snVar2 = (sn) this.f36815b;
                TLRPC.SuggestedPost suggestedPost = (TLRPC.SuggestedPost) this.f36816c;
                MessageObject messageObject = (MessageObject) this.d;
                snVar2.getClass();
                if (z10) {
                    if (suggestedPost != null) {
                        starsAmount = suggestedPost.price;
                    } else {
                        starsAmount = null;
                    }
                    TLRPC.SuggestedPost tl = MessageSuggestionParams.of(ag.a.l(starsAmount), i10).toTl();
                    if (messageObject != null && messageObject.messageOwner != null && tl != null) {
                        snVar2.getMessagesController().addOfferToSuggestedMessage(messageObject, tl);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                sn.Q0((sn) this.f36815b, (MessageObject.GroupedMessages) this.f36816c, (MessageObject) this.d, i10, i11);
                return;
        }
    }

    @Override
    public boolean D() {
        switch (this.f36814a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean J(ey eyVar) {
        switch (this.f36814a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean P0(View view) {
        return false;
    }

    @Override
    public void a(org.telegram.ui.Components.pk0 pk0Var, int i10) {
        int i11;
        View view = (View) this.f36815b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f36816c;
        int[] iArr = (int[]) this.d;
        if (view != null) {
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            view.measure(View.MeasureSpec.makeMeasureSpec(pk0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            i11 = view.getMeasuredHeight() + AndroidUtilities.dp(8.0f);
            view.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        } else {
            i11 = 0;
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f(iArr[0], org.telegram.messenger.v0.C(52.0f, i11, i10), true);
    }

    @Override
    public void b(h5 h5Var) {
        switch (this.f36814a) {
            case 6:
                dn dnVar = (dn) this.f36815b;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f36816c;
                TLRPC.User user = (TLRPC.User) this.d;
                int ordinal = h5Var.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal == 5) {
                                dnVar.f36651a.ra(user);
                                return;
                            }
                            return;
                        }
                        dnVar.b(user);
                        return;
                    }
                    dnVar.r(t1Var, user);
                    return;
                }
                dnVar.v(user, false);
                return;
            default:
                dn dnVar2 = (dn) this.f36815b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f36816c;
                org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) this.d;
                int ordinal2 = h5Var.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1 && ordinal2 != 2) {
                        if (ordinal2 != 4) {
                            if (ordinal2 == 5) {
                                dnVar2.f36651a.pa(chat);
                                return;
                            }
                            return;
                        }
                        dnVar2.a(chat);
                        return;
                    }
                    dnVar2.o(t1Var2, chat, 0, false);
                    return;
                }
                dnVar2.u(chat);
                return;
        }
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        u50.n((u50) this.f36815b, (Activity) this.f36816c, (ChatObject.Call) this.d, view, i10);
    }

    @Override
    public void f(org.telegram.ui.Components.voip.h3 h3Var) {
        String string;
        nh1 nh1Var = (nh1) this.f36815b;
        VoIPService voIPService = (VoIPService) this.f36816c;
        org.telegram.ui.Components.voip.i3 i3Var = (org.telegram.ui.Components.voip.i3) this.d;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            AndroidUtilities.cancelRunOnUIThread(nh1Var.S0);
            nh1Var.R0 = false;
            if (nh1Var.f39867w0.isTouchExplorationEnabled()) {
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
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        String str;
        int i11;
        switch (this.f36814a) {
            case 8:
                vo voVar = (vo) this.f36815b;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.f36816c;
                View view = (View) this.d;
                yo yoVar = voVar.f42781a.f43653b3;
                if (tL_username.editable) {
                    if (yoVar.f43924t0 == null) {
                        yoVar.f43924t0 = Boolean.valueOf(tL_username.active);
                    }
                    tL_username.active = !tL_username.active;
                } else {
                    TLRPC.TL_channels_toggleUsername tL_channels_toggleUsername = new TLRPC.TL_channels_toggleUsername();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    TLRPC.Chat chat = yoVar.Y;
                    tL_inputChannel.channel_id = chat.f20344id;
                    tL_inputChannel.access_hash = chat.access_hash;
                    tL_channels_toggleUsername.channel = tL_inputChannel;
                    tL_channels_toggleUsername.username = tL_username.username;
                    boolean z10 = tL_username.active;
                    tL_channels_toggleUsername.active = !z10;
                    yoVar.getConnectionsManager().sendRequest(tL_channels_toggleUsername, new ai.i4(voVar, tL_channels_toggleUsername, tL_username, z10, 4));
                    yoVar.Q.add(tL_username.username);
                    ((pa) view).setLoading(true);
                }
                yoVar.W();
                return;
            case 9:
                kp kpVar = (kp) this.f36815b;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                kpVar.getClass();
                if (((TLRPC.ChatFull) this.f36816c).hidden_prehistory) {
                    kpVar.getMessagesController().toggleChannelInvitesHistory(chat2.f20344id, false);
                }
                kpVar.Y(chat2, null);
                return;
            case 10:
            case 14:
            case 17:
            case 18:
            case 19:
            case 20:
            default:
                ya1 ya1Var = (ya1) this.f36815b;
                boolean z11 = true;
                if (org.telegram.ui.ActionBar.k6.k0(((ab1) this.f36816c).d, (org.telegram.ui.ActionBar.i6) this.d, true)) {
                    org.telegram.ui.ActionBar.k6.q1(false, false);
                    org.telegram.ui.ActionBar.j6 j6Var = org.telegram.ui.ActionBar.k6.I;
                    if (ya1Var.e.f34208f != 1) {
                        z11 = false;
                    }
                    org.telegram.ui.ActionBar.k6.H1(j6Var, z11, -1, null);
                    return;
                }
                return;
            case 11:
                ContactsActivity contactsActivity = (ContactsActivity) this.f36815b;
                TLRPC.User user = (TLRPC.User) this.f36816c;
                EditText editText = (EditText) this.d;
                if (editText != null) {
                    contactsActivity.getClass();
                    str = editText.getText().toString();
                } else {
                    str = "0";
                }
                contactsActivity.n0(user, false, str);
                return;
            case 12:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) this.f36815b;
                SharedConfig.storageCacheDir = (String) this.f36816c;
                SharedConfig.saveConfig();
                SharedConfig.readOnlyStorageDirAlertShowed = false;
                dataSettingsActivity.n0(dataSettingsActivity.f33428n);
                ImageLoader.getInstance().checkMediaPaths(new zt(dataSettingsActivity, 2));
                ((AlertDialog$Builder) this.d).f20679a.N0.run();
                return;
            case 13:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f36816c;
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                ((AlertDialog$Builder) this.d).f20679a.N0.run();
                oz ozVar = ((mz) this.f36815b).E.f40027c;
                ozVar.d.title = editTextBoldCursor.getText().toString();
                ozVar.d0(true);
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = ozVar.d;
                if (ozVar.G != 0) {
                    ozVar.getConnectionsManager().cancelRequest(ozVar.G, true);
                    ozVar.G = 0;
                }
                TL_chatlists.TL_chatlists_editExportedInvite tL_chatlists_editExportedInvite = new TL_chatlists.TL_chatlists_editExportedInvite();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_editExportedInvite.chatlist = tL_inputChatlistDialogFilter;
                tL_inputChatlistDialogFilter.filter_id = ozVar.f40282c.f17862id;
                tL_chatlists_editExportedInvite.slug = ozVar.b0();
                tL_chatlists_editExportedInvite.revoked = tL_exportedChatlistInvite.revoked;
                tL_chatlists_editExportedInvite.flags |= 2;
                tL_chatlists_editExportedInvite.title = tL_exportedChatlistInvite.title;
                ozVar.G = ozVar.getConnectionsManager().sendRequest(tL_chatlists_editExportedInvite, new bz(ozVar, 0));
                Utilities.Callback callback = ozVar.E;
                if (callback != null) {
                    callback.run(tL_exportedChatlistInvite);
                    return;
                }
                return;
            case 15:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) this.f36816c;
                AndroidUtilities.hideKeyboard(editTextBoldCursor2);
                ((w40) this.f36815b).f42898b.f42217a1.setTitle(editTextBoldCursor2.getText().toString());
                ((AlertDialog$Builder) this.d).f20679a.N0.run();
                return;
            case 16:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.f36815b;
                notificationsSettingsActivity.getClass();
                notificationsSettingsActivity.presentFragment(new NotificationsCustomSettingsActivity(-1, (ArrayList) this.f36816c, (ArrayList) this.d, false));
                return;
            case 21:
                h71 h71Var = (h71) this.f36816c;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) this.d;
                TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
                resetauthorization.hash = tL_authorization.hash;
                i11 = ((org.telegram.ui.ActionBar.o2) h71Var.f37774a).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(resetauthorization, new a50(27, h71Var, tL_authorization));
                ((v61) this.f36815b).d.dismiss();
                return;
        }
    }

    @Override
    public void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((k61) this.f36815b).T((TLRPC.User) this.f36816c, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.d);
    }

    @Override
    public boolean onMessageReceived(TLRPC.Message message) {
        ho0 ho0Var = (ho0) this.f36815b;
        org.telegram.ui.ActionBar.h5 h5Var = (org.telegram.ui.ActionBar.h5) this.f36816c;
        Activity activity = (Activity) this.d;
        if (MessageObject.getPeerId(message.peer_id) == ho0Var.f37935l0.f20491id && (message.action instanceof TLRPC.TL_messageActionPaymentSent)) {
            AndroidUtilities.runOnUIThread(new in0(ho0Var, h5Var, activity, message, 0));
            return true;
        }
        return false;
    }

    @Override
    public void onSuccess(Object obj) {
        org.telegram.ui.ActionBar.g6 g6Var;
        float f7;
        com.google.android.gms.internal.cast.z5 z5Var = (com.google.android.gms.internal.cast.z5) this.f36815b;
        Integer num = (Integer) obj;
        FileLog.d("wear-auth: /answer delivered to " + ((String) z5Var.f6892a));
        ((ei.d) this.f36816c).setLoading(false);
        int i10 = ((int[]) this.d)[0];
        ArrayList arrayList = (ArrayList) z5Var.e;
        if (arrayList != null && !arrayList.isEmpty()) {
            Context context = LaunchActivity.I1;
            if (context == null) {
                context = ApplicationLoader.applicationContext;
            }
            if (context != null) {
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    g6Var = U.getResourceProvider();
                } else {
                    g6Var = null;
                }
                org.telegram.ui.ActionBar.h3 h3Var = fi1.f37345c;
                if (h3Var != null) {
                    h3Var.dismiss();
                    fi1.f37345c = null;
                }
                org.telegram.ui.ActionBar.h3 j10 = org.telegram.messenger.tl.j(1, context, g6Var, false);
                FrameLayout frameLayout = new FrameLayout(context);
                j10.customView = frameLayout;
                LinearLayout e = org.telegram.messenger.tl.e(context, 1);
                frameLayout.addView(e, w7.z5.e(-1, -1, 119));
                TextView b10 = w7.d6.b(context, 20.0f, org.telegram.ui.ActionBar.k6.f21290j5, true, g6Var);
                b10.setGravity(17);
                b10.setText(LocaleController.getString(R.string.WearAuthEmojis));
                e.addView(b10, w7.z5.r(-1, -2, 49, 32.0f, 24.0f, 32.0f, 9.66f));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    Drawable emojiBigDrawable = Emoji.getEmojiBigDrawable((String) arrayList.get(i11));
                    ImageView imageView = new ImageView(context);
                    imageView.setImageDrawable(emojiBigDrawable);
                    NotificationCenter.listenEmojiLoading(imageView);
                    int dp = AndroidUtilities.dp(80.0f);
                    int i12 = org.telegram.ui.ActionBar.k6.Oh;
                    ShapeDrawable K = org.telegram.ui.ActionBar.k6.K(dp, org.telegram.ui.ActionBar.k6.o1(0.15f, org.telegram.ui.ActionBar.k6.w0(i12, g6Var)));
                    org.telegram.ui.ActionBar.n6 M = org.telegram.ui.ActionBar.r6.M(0.15f, i12);
                    imageView.setBackground(K);
                    org.telegram.ui.ActionBar.r6.k(imageView, K, M, null, g6Var);
                    if (i11 == 0) {
                        f7 = 0.0f;
                    } else {
                        f7 = 5.0f;
                    }
                    linearLayout.addView(imageView, w7.z5.k(f7, 0.0f, 0.0f, 0.0f, 80, 80));
                }
                e.addView(linearLayout, w7.z5.t(-2, -2, 49, 32, 12, 32, 12));
                ei.d g10 = org.telegram.messenger.tl.g(24, context, g6Var, true);
                g10.setText(LocaleController.getString(R.string.WearAuthEmojisLogIn));
                e.addView(g10, w7.z5.t(-1, 48, 7, 12, 12, 12, 8));
                int i13 = org.telegram.ui.ActionBar.k6.f21126a7;
                j10.setBackgroundColorKey(i13);
                j10.fixNavigationBarKey(i13);
                fi1.f37345c = j10;
                j10.show();
                g10.setOnClickListener(new ai.ia(g10, i10, j10, 19));
            }
        }
    }

    @Override
    public void run(long j10) {
        dq.a0((dq) this.f36815b, (TLRPC.InputCheckPasswordSRP) this.f36816c, (TwoStepVerificationActivity) this.d, j10);
    }

    @Override
    public boolean w(ey eyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, xe1 xe1Var) {
        long j10;
        int i12;
        String str;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i13 = this.f36814a;
        Object obj = this.d;
        Object obj2 = this.f36816c;
        Object obj3 = this.f36815b;
        switch (i13) {
            case 18:
                ArrayList<MessageObject> arrayList2 = (ArrayList) obj2;
                sn snVar = (sn) obj;
                PhotoViewer photoViewer = ((as0) obj3).f35833b;
                if (arrayList.size() <= 1 && ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId != UserConfig.getInstance(photoViewer.T).getClientUserId() && charSequence == null) {
                    MessagesStorage.TopicKey topicKey = (MessagesStorage.TopicKey) arrayList.get(0);
                    long j11 = topicKey.dialogId;
                    Bundle h = a1.g.h("scrollToTopOnResume", true);
                    if (DialogObject.isEncryptedDialog(j11)) {
                        h.putInt("enc_id", DialogObject.getEncryptedChatId(j11));
                    } else if (DialogObject.isUserDialog(j11)) {
                        h.putLong("user_id", j11);
                    } else {
                        h.putLong("chat_id", -j11);
                    }
                    sn snVar2 = new sn(h);
                    if (topicKey.topicId != 0) {
                        og.d.a(snVar2, topicKey);
                    }
                    if (((LaunchActivity) photoViewer.f33761y).v0(snVar2, true, false)) {
                        snVar2.Gb(arrayList2);
                    } else {
                        eyVar.finishFragment();
                    }
                } else {
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        long j12 = ((MessagesStorage.TopicKey) arrayList.get(i14)).dialogId;
                        if (charSequence != null) {
                            j10 = j12;
                            SendMessagesHelper.getInstance(photoViewer.T).sendMessage(SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
                        } else {
                            j10 = j12;
                        }
                        SendMessagesHelper.getInstance(photoViewer.T).sendMessage(arrayList2, j10, false, false, true, 0, 0L);
                    }
                    eyVar.finishFragment();
                    if (snVar != null) {
                        snVar.T7();
                        UndoView undoView = snVar.K3;
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
                mz0 mz0Var = (mz0) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                ey eyVar2 = (ey) obj;
                long j13 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                ProfileActivity profileActivity = mz0Var.f39679b;
                i12 = ((org.telegram.ui.ActionBar.o2) profileActivity).currentAccount;
                TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-j13));
                if (chat != null && (chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.add_admins))) {
                    profileActivity.getMessagesController().checkIsInChat(false, chat, user, new ai.f(mz0Var, j13, eyVar2, 8));
                } else {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.A0);
                    String string = LocaleController.getString(R.string.AddBot);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
                    c2Var.R = string;
                    if (chat == null) {
                        str = "";
                    } else {
                        str = chat.title;
                    }
                    c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AddMembersAlertNamesText", R.string.AddMembersAlertNamesText, UserObject.getUserName(user), str));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder.k(LocaleController.getString(R.string.AddBot), new ai.y3(mz0Var, j13, eyVar, user, 4));
                    profileActivity.showDialog(c2Var);
                }
                return true;
        }
    }

    @Override
    public boolean mo17c(float f7, float f10, int i10, final View view) {
        final h7 h7Var = (h7) this.f36815b;
        org.telegram.ui.Components.lm0 lm0Var = (org.telegram.ui.Components.lm0) this.f36816c;
        org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.d;
        v7 v7Var = h7Var.d;
        i7 i7Var = (i7) lm0Var.getAdapter();
        final p7 p7Var = (p7) i7Var.e.get(i10);
        if (!(view instanceof n7) && !(view instanceof org.telegram.ui.Cells.s7)) {
            l7 l7Var = v7Var.f42597w;
            if (l7Var != null) {
                l7Var.s0(p7Var.f40380c, p7Var.d, true);
            }
            return true;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(v7Var.getContext(), null);
        if (view instanceof org.telegram.ui.Cells.s7) {
            org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_view_file, LocaleController.getString(R.string.CacheOpenFile), false, null).setOnClickListener(new ci.e0(h7Var, p7Var, i7Var, lm0Var, view, 5));
        } else if (((n7) view).f39750b.getChildAt(0) instanceof org.telegram.ui.Cells.j7) {
            org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_played, LocaleController.getString(R.string.PlayFile), false, null).setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    switch (r4) {
                        case 0:
                            h7 h7Var2 = h7Var;
                            v7.b(h7Var2.d, p7Var.d, (n7) view);
                            org.telegram.ui.ActionBar.m1 m1Var = h7Var2.f37766a;
                            if (m1Var != null) {
                                m1Var.d(true);
                                return;
                            }
                            return;
                        default:
                            h7 h7Var3 = h7Var;
                            v7.b(h7Var3.d, p7Var.d, (n7) view);
                            org.telegram.ui.ActionBar.m1 m1Var2 = h7Var3.f37766a;
                            if (m1Var2 != null) {
                                m1Var2.d(true);
                                return;
                            }
                            return;
                    }
                }
            });
        } else {
            org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_view_file, LocaleController.getString(R.string.CacheOpenFile), false, null).setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    switch (r4) {
                        case 0:
                            h7 h7Var2 = h7Var;
                            v7.b(h7Var2.d, p7Var.d, (n7) view);
                            org.telegram.ui.ActionBar.m1 m1Var = h7Var2.f37766a;
                            if (m1Var != null) {
                                m1Var.d(true);
                                return;
                            }
                            return;
                        default:
                            h7 h7Var3 = h7Var;
                            v7.b(h7Var3.d, p7Var.d, (n7) view);
                            org.telegram.ui.ActionBar.m1 m1Var2 = h7Var3.f37766a;
                            if (m1Var2 != null) {
                                m1Var2.d(true);
                                return;
                            }
                            return;
                    }
                }
            });
        }
        bi.b bVar = p7Var.d;
        if (bVar.f4429b != 0 && bVar.f4432g != 0) {
            org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_viewintopic, LocaleController.getString(R.string.ViewInChat), false, null).setOnClickListener(new z(h7Var, p7Var, o2Var, 1));
        }
        org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_select, LocaleController.getString(!v7Var.h.f4439j.contains(p7Var.d) ? R.string.Select : R.string.Deselect), false, null).setOnClickListener(new org.telegram.ui.ActionBar.s1(6, h7Var, p7Var));
        h7Var.f37766a = org.telegram.ui.Components.d5.P(o2Var, actionBarPopupWindow$ActionBarPopupWindowLayout, view, (int) f7, (int) f10);
        v7Var.getRootView().dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
        return true;
    }

    @Override
    public void run(String str) {
        sn snVar = (sn) this.f36815b;
        org.telegram.ui.Cells.g0 g0Var = (org.telegram.ui.Cells.g0) this.f36816c;
        CharSequence charSequence = (CharSequence) this.d;
        String language = LocaleController.getInstance().getCurrentLocale().getLanguage();
        if (str != null && ((!str.equals(language) || str.equals("und")) && !u21.Y().contains(str))) {
            g0Var.setOnClickListener(new ci.e0(snVar, str, language, charSequence, g0Var, 7));
        } else {
            g0Var.setClickable(false);
        }
    }

    @Override
    public void h() {
    }

    @Override
    public void o(float f7) {
    }

    @Override
    public void a0(View view, float f7, float f10) {
    }
}
