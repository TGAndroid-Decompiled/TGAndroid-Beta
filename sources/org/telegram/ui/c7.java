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
public final class c7 implements org.telegram.ui.Components.pl0, org.telegram.ui.Components.ak0, org.telegram.ui.Components.d5, LanguageDetector.StringCallback, w4, org.telegram.ui.ActionBar.a2, MessagesStorage.LongCallback, org.telegram.ui.Components.nl0, MessagesController.NewMessageCallback, oy, og1, org.telegram.ui.Components.voip.j3, OnSuccessListener {
    public final int f35289a;
    public final Object f35290b;
    public final Object f35291c;
    public final Object d;

    public c7(Object obj, Object obj2, Object obj3, int i10) {
        this.f35289a = i10;
        this.f35290b = obj;
        this.f35291c = obj2;
        this.d = obj3;
    }

    @Override
    public boolean A() {
        switch (this.f35289a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean H(uy uyVar) {
        switch (this.f35289a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void K(int i10, int i11, boolean z10) {
        TL_stars.StarsAmount starsAmount;
        switch (this.f35289a) {
            case 2:
                yn ynVar = (yn) this.f35290b;
                ynVar.getClass();
                ynVar.bb((TLRPC.BotInlineResult) this.f35291c, z10, i10, ((Long) this.d).longValue());
                return;
            case 3:
            default:
                yn ynVar2 = (yn) this.f35290b;
                TLRPC.SuggestedPost suggestedPost = (TLRPC.SuggestedPost) this.f35291c;
                MessageObject messageObject = (MessageObject) this.d;
                ynVar2.getClass();
                if (z10) {
                    if (suggestedPost != null) {
                        starsAmount = suggestedPost.price;
                    } else {
                        starsAmount = null;
                    }
                    TLRPC.SuggestedPost tl = MessageSuggestionParams.of(zf.a.l(starsAmount), i10).toTl();
                    if (messageObject != null && messageObject.messageOwner != null && tl != null) {
                        ynVar2.getMessagesController().addOfferToSuggestedMessage(messageObject, tl);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                yn.c0((yn) this.f35290b, (MessageObject.GroupedMessages) this.f35291c, (MessageObject) this.d, i10, i11);
                return;
        }
    }

    @Override
    public void a(org.telegram.ui.Components.ck0 ck0Var, int i10) {
        int i11;
        View view = (View) this.f35290b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f35291c;
        int[] iArr = (int[]) this.d;
        if (view != null) {
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            view.measure(View.MeasureSpec.makeMeasureSpec(ck0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            i11 = view.getMeasuredHeight() + AndroidUtilities.dp(8.0f);
            view.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        } else {
            i11 = 0;
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f(iArr[0], org.telegram.messenger.f0.C(52.0f, i11, i10), true);
    }

    @Override
    public void b(e5 e5Var) {
        switch (this.f35289a) {
            case 6:
                kn knVar = (kn) this.f35290b;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f35291c;
                TLRPC.User user = (TLRPC.User) this.d;
                int ordinal = e5Var.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal == 5) {
                                knVar.f38002a.la(user);
                                return;
                            }
                            return;
                        }
                        knVar.c(user);
                        return;
                    }
                    knVar.v(u1Var, user);
                    return;
                }
                knVar.y(user, false);
                return;
            default:
                kn knVar2 = (kn) this.f35290b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f35291c;
                org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) this.d;
                int ordinal2 = e5Var.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1 && ordinal2 != 2) {
                        if (ordinal2 != 4) {
                            if (ordinal2 == 5) {
                                knVar2.f38002a.ja(chat);
                                return;
                            }
                            return;
                        }
                        knVar2.b(chat);
                        return;
                    }
                    knVar2.q(u1Var2, chat, 0, false);
                    return;
                }
                knVar2.x(chat);
                return;
        }
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        h60.n((h60) this.f35290b, (Activity) this.f35291c, (ChatObject.Call) this.d, view, i10);
    }

    @Override
    public void f(org.telegram.ui.Components.voip.k3 k3Var) {
        String string;
        mi1 mi1Var = (mi1) this.f35290b;
        VoIPService voIPService = (VoIPService) this.f35291c;
        org.telegram.ui.Components.voip.l3 l3Var = (org.telegram.ui.Components.voip.l3) this.d;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            AndroidUtilities.cancelRunOnUIThread(mi1Var.S0);
            mi1Var.R0 = false;
            if (mi1Var.f38645w0.isTouchExplorationEnabled()) {
                if (voIPService.isFrontFaceCamera()) {
                    string = LocaleController.getString(R.string.AccDescrVoipCamSwitchedToBack);
                } else {
                    string = LocaleController.getString(R.string.AccDescrVoipCamSwitchedToFront);
                }
                k3Var.announceForAccessibility(string);
            }
            l3Var.d(2, !voIPService.isFrontFaceCamera(), false);
            sharedInstance.switchCamera();
        }
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        String str;
        int i11;
        boolean z10;
        int i12 = this.f35289a;
        Object obj = this.d;
        Object obj2 = this.f35291c;
        Object obj3 = this.f35290b;
        switch (i12) {
            case 8:
                ep epVar = (ep) obj3;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) obj2;
                View view = (View) obj;
                hp hpVar = epVar.f36062a.f36695h3;
                if (tL_username.editable) {
                    if (hpVar.f37149s0 == null) {
                        hpVar.f37149s0 = Boolean.valueOf(tL_username.active);
                    }
                    tL_username.active = !tL_username.active;
                } else {
                    TLRPC.TL_channels_toggleUsername tL_channels_toggleUsername = new TLRPC.TL_channels_toggleUsername();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    TLRPC.Chat chat = hpVar.X;
                    tL_inputChannel.channel_id = chat.f20037id;
                    tL_inputChannel.access_hash = chat.access_hash;
                    tL_channels_toggleUsername.channel = tL_inputChannel;
                    tL_channels_toggleUsername.username = tL_username.username;
                    boolean z11 = tL_username.active;
                    tL_channels_toggleUsername.active = !z11;
                    hpVar.getConnectionsManager().sendRequest(tL_channels_toggleUsername, new ci.t1(epVar, tL_channels_toggleUsername, tL_username, z11, 3));
                    hpVar.P.add(tL_username.username);
                    ((pa) view).setLoading(true);
                }
                hpVar.T();
                return;
            case 9:
                tp tpVar = (tp) obj3;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                tpVar.getClass();
                if (((TLRPC.ChatFull) obj2).hidden_prehistory) {
                    tpVar.getMessagesController().toggleChannelInvitesHistory(chat2.f20037id, false);
                }
                tpVar.X(chat2, null);
                return;
            case 10:
            case 14:
            case 17:
            case 18:
            case 19:
            case 20:
            default:
                bc1 bc1Var = (bc1) obj3;
                if (org.telegram.ui.ActionBar.i6.j0(((dc1) obj2).d, (org.telegram.ui.ActionBar.f6) obj, true)) {
                    org.telegram.ui.ActionBar.i6.n1(false, false);
                    NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                    int i13 = NotificationCenter.needSetDayNightTheme;
                    if (bc1Var.f35058e.f34528f == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    globalInstance.lambda$postNotificationNameOnUIThread$1(i13, org.telegram.ui.ActionBar.i6.I, Boolean.valueOf(z10), null, -1);
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
                dataSettingsActivity.n0(dataSettingsActivity.f33733n);
                ImageLoader.getInstance().checkMediaPaths(new ju(dataSettingsActivity, 2));
                ((AlertDialog$Builder) obj).f20367a.L0.run();
                return;
            case 13:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj2;
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                ((AlertDialog$Builder) obj).f20367a.L0.run();
                c00 c00Var = ((a00) obj3).E.f34943c;
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
                tL_inputChatlistDialogFilter.filter_id = c00Var.f35225c.f17256id;
                tL_chatlists_editExportedInvite.slug = c00Var.b0();
                tL_chatlists_editExportedInvite.revoked = tL_exportedChatlistInvite.revoked;
                tL_chatlists_editExportedInvite.flags = 2 | tL_chatlists_editExportedInvite.flags;
                tL_chatlists_editExportedInvite.title = tL_exportedChatlistInvite.title;
                c00Var.F = c00Var.getConnectionsManager().sendRequest(tL_chatlists_editExportedInvite, new rz(c00Var, 0));
                Utilities.Callback callback = c00Var.f35233y;
                if (callback != null) {
                    callback.run(tL_exportedChatlistInvite);
                    return;
                }
                return;
            case 15:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) obj2;
                AndroidUtilities.hideKeyboard(editTextBoldCursor2);
                ((l50) obj3).f38163b.f36873a1.setTitle(editTextBoldCursor2.getText().toString());
                ((AlertDialog$Builder) obj).f20367a.L0.run();
                return;
            case 16:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj3;
                notificationsSettingsActivity.getClass();
                notificationsSettingsActivity.presentFragment(new NotificationsCustomSettingsActivity(-1, (ArrayList) obj2, (ArrayList) obj, false));
                return;
            case 21:
                j81 j81Var = (j81) obj2;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) obj;
                TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
                resetauthorization.hash = tL_authorization.hash;
                i11 = ((org.telegram.ui.ActionBar.n2) j81Var.f37600a).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(resetauthorization, new zb0(20, j81Var, tL_authorization));
                ((x71) obj3).d.dismiss();
                return;
        }
    }

    @Override
    public void j(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((m71) this.f35290b).R((TLRPC.User) this.f35291c, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.d);
    }

    @Override
    public boolean onMessageReceived(TLRPC.Message message) {
        so0 so0Var = (so0) this.f35290b;
        org.telegram.ui.ActionBar.c5 c5Var = (org.telegram.ui.ActionBar.c5) this.f35291c;
        Activity activity = (Activity) this.d;
        if (MessageObject.getPeerId(message.peer_id) == so0Var.f40561l0.f20184id && (message.action instanceof TLRPC.TL_messageActionPaymentSent)) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.bo0(so0Var, c5Var, activity, message, 26));
            return true;
        }
        return false;
    }

    @Override
    public void onSuccess(Object obj) {
        org.telegram.ui.ActionBar.d6 d6Var;
        float f7;
        cf.c cVar = (cf.c) this.f35290b;
        Integer num = (Integer) obj;
        FileLog.d("wear-auth: /answer delivered to " + ((String) cVar.d));
        ((ci.d) this.f35291c).setLoading(false);
        int i10 = ((int[]) this.d)[0];
        ArrayList arrayList = (ArrayList) cVar.f4602a;
        if (arrayList != null && !arrayList.isEmpty()) {
            Context context = LaunchActivity.G1;
            if (context == null) {
                context = ApplicationLoader.applicationContext;
            }
            if (context != null) {
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    d6Var = U.getResourceProvider();
                } else {
                    d6Var = null;
                }
                org.telegram.ui.ActionBar.f3 f3Var = dj1.f35789c;
                if (f3Var != null) {
                    f3Var.dismiss();
                    dj1.f35789c = null;
                }
                org.telegram.ui.ActionBar.f3 j3 = org.telegram.messenger.ok.j(1, context, d6Var, false);
                FrameLayout frameLayout = new FrameLayout(context);
                j3.customView = frameLayout;
                LinearLayout f10 = org.telegram.messenger.ok.f(context, 1);
                frameLayout.addView(f10, w7.z5.e(-1, -1, 119));
                TextView b10 = w7.d6.b(context, 20.0f, org.telegram.ui.ActionBar.i6.f20925j5, true, d6Var);
                b10.setGravity(17);
                b10.setText(LocaleController.getString(R.string.WearAuthEmojis));
                f10.addView(b10, w7.z5.r(-1, -2, 49, 32.0f, 24.0f, 32.0f, 9.66f));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    Drawable emojiBigDrawable = Emoji.getEmojiBigDrawable((String) arrayList.get(i11));
                    ImageView imageView = new ImageView(context);
                    imageView.setImageDrawable(emojiBigDrawable);
                    NotificationCenter.listenEmojiLoading(imageView);
                    imageView.setBackground(org.telegram.ui.ActionBar.i6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.i6.l1(0.15f, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Oh, d6Var))));
                    if (i11 == 0) {
                        f7 = 0.0f;
                    } else {
                        f7 = 5.0f;
                    }
                    linearLayout.addView(imageView, w7.z5.k(f7, 0.0f, 0.0f, 0.0f, 80, 80));
                }
                f10.addView(linearLayout, w7.z5.t(-2, -2, 49, 32, 12, 32, 12));
                ci.d g10 = org.telegram.messenger.ok.g(24, context, d6Var, true);
                g10.setText(LocaleController.getString(R.string.WearAuthEmojisLogIn));
                f10.addView(g10, w7.z5.t(-1, 48, 7, 12, 12, 12, 8));
                int i12 = org.telegram.ui.ActionBar.i6.f20761a7;
                j3.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(i12, d6Var));
                j3.fixNavigationBar(org.telegram.ui.ActionBar.i6.v0(i12, d6Var));
                dj1.f35789c = j3;
                j3.show();
                g10.setOnClickListener(new org.telegram.ui.Cells.ua(g10, i10, j3, 16));
            }
        }
    }

    @Override
    public void run(long j3) {
        mq.Z((mq) this.f35290b, (TLRPC.InputCheckPasswordSRP) this.f35291c, (TwoStepVerificationActivity) this.d, j3);
    }

    @Override
    public boolean u(uy uyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, yf1 yf1Var) {
        long j3;
        int i12;
        String str;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i13 = this.f35289a;
        Object obj = this.d;
        Object obj2 = this.f35291c;
        Object obj3 = this.f35290b;
        switch (i13) {
            case 18:
                ArrayList<MessageObject> arrayList2 = (ArrayList) obj2;
                yn ynVar = (yn) obj;
                PhotoViewer photoViewer = ((ns0) obj3).f39035b;
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
                    yn ynVar2 = new yn(i14);
                    if (topicKey.topicId != 0) {
                        ng.d.a(ynVar2, topicKey);
                    }
                    if (((LaunchActivity) photoViewer.f34072y).q0(ynVar2, true, false)) {
                        ynVar2.zb(arrayList2);
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
                    if (ynVar != null) {
                        ynVar.Q7();
                        UndoView undoView = ynVar.f43541w3;
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
                a01 a01Var = (a01) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                uy uyVar2 = (uy) obj;
                long j12 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                ProfileActivity profileActivity = a01Var.f34622b;
                i12 = ((org.telegram.ui.ActionBar.n2) profileActivity).currentAccount;
                TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-j12));
                if (chat != null && (chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.add_admins))) {
                    profileActivity.getMessagesController().checkIsInChat(false, chat, user, new ci.p9(a01Var, j12, uyVar2, 6));
                } else {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.f34376z0);
                    String string = LocaleController.getString(R.string.AddBot);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20367a;
                    b2Var.R = string;
                    if (chat == null) {
                        str = "";
                    } else {
                        str = chat.title;
                    }
                    b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AddMembersAlertNamesText", R.string.AddMembersAlertNamesText, UserObject.getUserName(user), str));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder.k(LocaleController.getString(R.string.AddBot), new ci.y6(a01Var, j12, uyVar, user));
                    profileActivity.showDialog(b2Var);
                }
                return true;
        }
    }

    @Override
    public boolean mo18c(float f7, float f10, int i10, final View view) {
        final f7 f7Var = (f7) this.f35290b;
        org.telegram.ui.Components.zl0 zl0Var = (org.telegram.ui.Components.zl0) this.f35291c;
        a7 a7Var = (a7) this.d;
        v7 v7Var = f7Var.f36206f;
        h7 h7Var = (h7) zl0Var.getAdapter();
        final o7 o7Var = (o7) h7Var.f36986e.get(i10);
        if (!(view instanceof m7) && !(view instanceof org.telegram.ui.Cells.t7)) {
            k7 k7Var = v7Var.E;
            if (k7Var != null) {
                k7Var.i(o7Var.f39114c, o7Var.d, true);
            }
            return true;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(v7Var.getContext(), null);
        if (view instanceof org.telegram.ui.Cells.t7) {
            org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_view_file, LocaleController.getString(R.string.CacheOpenFile), false, null).setOnClickListener(new ai.s0(f7Var, o7Var, h7Var, zl0Var, view, 5));
        } else if (((m7) view).f38440b.getChildAt(0) instanceof org.telegram.ui.Cells.j7) {
            org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_played, LocaleController.getString(R.string.PlayFile), false, null).setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    switch (r4) {
                        case 0:
                            f7 f7Var2 = f7Var;
                            v7.b(f7Var2.f36206f, o7Var.d, (m7) view);
                            org.telegram.ui.ActionBar.n1 n1Var = f7Var2.f36202a;
                            if (n1Var != null) {
                                n1Var.d(true);
                                return;
                            }
                            return;
                        default:
                            f7 f7Var3 = f7Var;
                            v7.b(f7Var3.f36206f, o7Var.d, (m7) view);
                            org.telegram.ui.ActionBar.n1 n1Var2 = f7Var3.f36202a;
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
                            f7 f7Var2 = f7Var;
                            v7.b(f7Var2.f36206f, o7Var.d, (m7) view);
                            org.telegram.ui.ActionBar.n1 n1Var = f7Var2.f36202a;
                            if (n1Var != null) {
                                n1Var.d(true);
                                return;
                            }
                            return;
                        default:
                            f7 f7Var3 = f7Var;
                            v7.b(f7Var3.f36206f, o7Var.d, (m7) view);
                            org.telegram.ui.ActionBar.n1 n1Var2 = f7Var3.f36202a;
                            if (n1Var2 != null) {
                                n1Var2.d(true);
                                return;
                            }
                            return;
                    }
                }
            });
        }
        zh.a aVar = o7Var.d;
        if (aVar.f53551b != 0 && aVar.f53555g != 0) {
            org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_viewintopic, LocaleController.getString(R.string.ViewInChat), false, null).setOnClickListener(new a0(f7Var, o7Var, a7Var, 1));
        }
        org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_select, LocaleController.getString(!v7Var.f41573f.f53563j.contains(o7Var.d) ? R.string.Select : R.string.Deselect), false, null).setOnClickListener(new ai.f2(26, f7Var, o7Var));
        f7Var.f36202a = org.telegram.ui.Components.e5.Q(a7Var, actionBarPopupWindow$ActionBarPopupWindowLayout, view, (int) f7, (int) f10);
        v7Var.getRootView().dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
        return true;
    }

    @Override
    public void run(String str) {
        yn ynVar = (yn) this.f35290b;
        org.telegram.ui.Cells.h0 h0Var = (org.telegram.ui.Cells.h0) this.f35291c;
        CharSequence charSequence = (CharSequence) this.d;
        String language = LocaleController.getInstance().getCurrentLocale().getLanguage();
        if (str != null && ((!str.equals(language) || str.equals("und")) && !y31.X().contains(str))) {
            h0Var.setOnClickListener(new ai.s0(ynVar, str, language, charSequence, h0Var, 7));
        } else {
            h0Var.setClickable(false);
        }
    }

    @Override
    public void i() {
    }

    @Override
    public void q(float f7) {
    }

    @Override
    public void s0(View view, float f7, float f10) {
    }
}
