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
public final class d7 implements org.telegram.ui.Components.pl0, org.telegram.ui.Components.ak0, org.telegram.ui.Components.d5, LanguageDetector.StringCallback, x4, org.telegram.ui.ActionBar.b2, MessagesStorage.LongCallback, org.telegram.ui.Components.nl0, MessagesController.NewMessageCallback, ny, mg1, org.telegram.ui.Components.voip.j3, OnSuccessListener {
    public final int f32880a;
    public final Object f32881b;
    public final Object f32882c;
    public final Object d;

    public d7(Object obj, Object obj2, Object obj3, int i10) {
        this.f32880a = i10;
        this.f32881b = obj;
        this.f32882c = obj2;
        this.d = obj3;
    }

    @Override
    public boolean A() {
        switch (this.f32880a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        TL_stars.StarsAmount starsAmount;
        switch (this.f32880a) {
            case 2:
                xn xnVar = (xn) this.f32881b;
                xnVar.getClass();
                xnVar.cb((TLRPC.BotInlineResult) this.f32882c, z10, i10, ((Long) this.d).longValue());
                return;
            case 3:
            default:
                xn xnVar2 = (xn) this.f32881b;
                TLRPC.SuggestedPost suggestedPost = (TLRPC.SuggestedPost) this.f32882c;
                MessageObject messageObject = (MessageObject) this.d;
                xnVar2.getClass();
                if (z10) {
                    if (suggestedPost != null) {
                        starsAmount = suggestedPost.price;
                    } else {
                        starsAmount = null;
                    }
                    TLRPC.SuggestedPost tl = MessageSuggestionParams.of(zf.a.l(starsAmount), i10).toTl();
                    if (messageObject != null && messageObject.messageOwner != null && tl != null) {
                        xnVar2.getMessagesController().addOfferToSuggestedMessage(messageObject, tl);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                xn.d1((xn) this.f32881b, (MessageObject.GroupedMessages) this.f32882c, (MessageObject) this.d, i10, i11);
                return;
        }
    }

    @Override
    public boolean K(ty tyVar) {
        switch (this.f32880a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void a(org.telegram.ui.Components.ck0 ck0Var, int i10) {
        int i11;
        View view = (View) this.f32881b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f32882c;
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
        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f(iArr[0], org.telegram.messenger.l0.C(52.0f, i11, i10), true);
    }

    @Override
    public void b(f5 f5Var) {
        switch (this.f32880a) {
            case 6:
                jn jnVar = (jn) this.f32881b;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f32882c;
                TLRPC.User user = (TLRPC.User) this.d;
                int ordinal = f5Var.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal == 5) {
                                jnVar.f34766a.ma(user);
                                return;
                            }
                            return;
                        }
                        jnVar.c(user);
                        return;
                    }
                    jnVar.v(u1Var, user);
                    return;
                }
                jnVar.y(user, false);
                return;
            default:
                jn jnVar2 = (jn) this.f32881b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f32882c;
                org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) this.d;
                int ordinal2 = f5Var.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1 && ordinal2 != 2) {
                        if (ordinal2 != 4) {
                            if (ordinal2 == 5) {
                                jnVar2.f34766a.ka(chat);
                                return;
                            }
                            return;
                        }
                        jnVar2.b(chat);
                        return;
                    }
                    jnVar2.q(u1Var2, chat, 0, false);
                    return;
                }
                jnVar2.x(chat);
                return;
        }
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        g60.n((g60) this.f32881b, (Activity) this.f32882c, (ChatObject.Call) this.d, view, i10);
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void e(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((m71) this.f32881b).T((TLRPC.User) this.f32882c, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.d);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        String str;
        int i11;
        boolean z10;
        int i12 = this.f32880a;
        Object obj = this.d;
        Object obj2 = this.f32882c;
        Object obj3 = this.f32881b;
        switch (i12) {
            case 8:
                dp dpVar = (dp) obj3;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) obj2;
                View view = (View) obj;
                gp gpVar = dpVar.f33012a.f33603a3;
                if (tL_username.editable) {
                    if (gpVar.f34009s0 == null) {
                        gpVar.f34009s0 = Boolean.valueOf(tL_username.active);
                    }
                    tL_username.active = !tL_username.active;
                } else {
                    TLRPC.TL_channels_toggleUsername tL_channels_toggleUsername = new TLRPC.TL_channels_toggleUsername();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    TLRPC.Chat chat = gpVar.X;
                    tL_inputChannel.channel_id = chat.f18329id;
                    tL_inputChannel.access_hash = chat.access_hash;
                    tL_channels_toggleUsername.channel = tL_inputChannel;
                    tL_channels_toggleUsername.username = tL_username.username;
                    boolean z11 = tL_username.active;
                    tL_channels_toggleUsername.active = !z11;
                    gpVar.getConnectionsManager().sendRequest(tL_channels_toggleUsername, new ci.t1(dpVar, tL_channels_toggleUsername, tL_username, z11, 3));
                    gpVar.P.add(tL_username.username);
                    ((qa) view).setLoading(true);
                }
                gpVar.V();
                return;
            case 9:
                sp spVar = (sp) obj3;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                spVar.getClass();
                if (((TLRPC.ChatFull) obj2).hidden_prehistory) {
                    spVar.getMessagesController().toggleChannelInvitesHistory(chat2.f18329id, false);
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
                yb1 yb1Var = (yb1) obj3;
                if (org.telegram.ui.ActionBar.i6.j0(((ac1) obj2).d, (org.telegram.ui.ActionBar.g6) obj, true)) {
                    org.telegram.ui.ActionBar.i6.n1(false, false);
                    NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                    int i13 = NotificationCenter.needSetDayNightTheme;
                    if (yb1Var.e.f31845f == 1) {
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
                dataSettingsActivity.n0(dataSettingsActivity.f31071n);
                ImageLoader.getInstance().checkMediaPaths(new hu(dataSettingsActivity, 2));
                ((AlertDialog$Builder) obj).f18655a.L0.run();
                return;
            case 13:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj2;
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                ((AlertDialog$Builder) obj).f18655a.L0.run();
                b00 b00Var = ((zz) obj3).E.f31933c;
                b00Var.d.title = editTextBoldCursor.getText().toString();
                b00Var.d0(true);
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = b00Var.d;
                if (b00Var.F != 0) {
                    b00Var.getConnectionsManager().cancelRequest(b00Var.F, true);
                    b00Var.F = 0;
                }
                TL_chatlists.TL_chatlists_editExportedInvite tL_chatlists_editExportedInvite = new TL_chatlists.TL_chatlists_editExportedInvite();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_editExportedInvite.chatlist = tL_inputChatlistDialogFilter;
                tL_inputChatlistDialogFilter.filter_id = b00Var.f32190c.f15826id;
                tL_chatlists_editExportedInvite.slug = b00Var.b0();
                tL_chatlists_editExportedInvite.revoked = tL_exportedChatlistInvite.revoked;
                tL_chatlists_editExportedInvite.flags = 2 | tL_chatlists_editExportedInvite.flags;
                tL_chatlists_editExportedInvite.title = tL_exportedChatlistInvite.title;
                b00Var.F = b00Var.getConnectionsManager().sendRequest(tL_chatlists_editExportedInvite, new qz(b00Var, 0));
                Utilities.Callback callback = b00Var.f32197y;
                if (callback != null) {
                    callback.run(tL_exportedChatlistInvite);
                    return;
                }
                return;
            case 15:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) obj2;
                AndroidUtilities.hideKeyboard(editTextBoldCursor2);
                ((j50) obj3).f34637b.f33726a1.setTitle(editTextBoldCursor2.getText().toString());
                ((AlertDialog$Builder) obj).f18655a.L0.run();
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
                i11 = ((org.telegram.ui.ActionBar.o2) j81Var.f34668a).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(resetauthorization, new yb0(20, j81Var, tL_authorization));
                ((x71) obj3).d.dismiss();
                return;
        }
    }

    @Override
    public void h(org.telegram.ui.Components.voip.k3 k3Var) {
        String string;
        ki1 ki1Var = (ki1) this.f32881b;
        VoIPService voIPService = (VoIPService) this.f32882c;
        org.telegram.ui.Components.voip.l3 l3Var = (org.telegram.ui.Components.voip.l3) this.d;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            AndroidUtilities.cancelRunOnUIThread(ki1Var.S0);
            ki1Var.R0 = false;
            if (ki1Var.f35085w0.isTouchExplorationEnabled()) {
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
    public boolean onMessageReceived(TLRPC.Message message) {
        ro0 ro0Var = (ro0) this.f32881b;
        org.telegram.ui.ActionBar.d5 d5Var = (org.telegram.ui.ActionBar.d5) this.f32882c;
        Activity activity = (Activity) this.d;
        if (MessageObject.getPeerId(message.peer_id) == ro0Var.f37188l0.f18476id && (message.action instanceof TLRPC.TL_messageActionPaymentSent)) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.xn0(ro0Var, d5Var, activity, message, 26));
            return true;
        }
        return false;
    }

    @Override
    public void onSuccess(Object obj) {
        org.telegram.ui.ActionBar.e6 e6Var;
        float f7;
        cf.c cVar = (cf.c) this.f32881b;
        Integer num = (Integer) obj;
        FileLog.d("wear-auth: /answer delivered to " + ((String) cVar.d));
        ((ci.d) this.f32882c).setLoading(false);
        int i10 = ((int[]) this.d)[0];
        ArrayList arrayList = (ArrayList) cVar.f4254a;
        if (arrayList != null && !arrayList.isEmpty()) {
            Context context = LaunchActivity.G1;
            if (context == null) {
                context = ApplicationLoader.applicationContext;
            }
            if (context != null) {
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    e6Var = U.getResourceProvider();
                } else {
                    e6Var = null;
                }
                org.telegram.ui.ActionBar.g3 g3Var = bj1.f32381c;
                if (g3Var != null) {
                    g3Var.dismiss();
                    bj1.f32381c = null;
                }
                org.telegram.ui.ActionBar.g3 j3 = org.telegram.messenger.qk.j(1, context, e6Var, false);
                FrameLayout frameLayout = new FrameLayout(context);
                j3.customView = frameLayout;
                LinearLayout f10 = org.telegram.messenger.qk.f(context, 1);
                frameLayout.addView(f10, w7.y5.e(-1, -1, 119));
                TextView b10 = w7.c6.b(context, 20.0f, org.telegram.ui.ActionBar.i6.f19164j5, true, e6Var);
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
                    imageView.setBackground(org.telegram.ui.ActionBar.i6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.i6.l1(0.15f, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Oh, e6Var))));
                    if (i11 == 0) {
                        f7 = 0.0f;
                    } else {
                        f7 = 5.0f;
                    }
                    linearLayout.addView(imageView, w7.y5.k(f7, 0.0f, 0.0f, 0.0f, 80, 80));
                }
                f10.addView(linearLayout, w7.y5.t(-2, -2, 49, 32, 12, 32, 12));
                ci.d g10 = org.telegram.messenger.qk.g(24, context, e6Var, true);
                g10.setText(LocaleController.getString(R.string.WearAuthEmojisLogIn));
                f10.addView(g10, w7.y5.t(-1, 48, 7, 12, 12, 12, 8));
                int i12 = org.telegram.ui.ActionBar.i6.f19001a7;
                j3.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(i12, e6Var));
                j3.fixNavigationBar(org.telegram.ui.ActionBar.i6.v0(i12, e6Var));
                bj1.f32381c = j3;
                j3.show();
                g10.setOnClickListener(new org.telegram.ui.Cells.ua(g10, i10, j3, 16));
            }
        }
    }

    @Override
    public void run(long j3) {
        lq.a0((lq) this.f32881b, (TLRPC.InputCheckPasswordSRP) this.f32882c, (TwoStepVerificationActivity) this.d, j3);
    }

    @Override
    public boolean u(ty tyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, wf1 wf1Var) {
        long j3;
        int i12;
        String str;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i13 = this.f32880a;
        Object obj = this.d;
        Object obj2 = this.f32882c;
        Object obj3 = this.f32881b;
        switch (i13) {
            case 18:
                ArrayList<MessageObject> arrayList2 = (ArrayList) obj2;
                xn xnVar = (xn) obj;
                PhotoViewer photoViewer = ((ns0) obj3).f36082b;
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
                    xn xnVar2 = new xn(i14);
                    if (topicKey.topicId != 0) {
                        ng.d.a(xnVar2, topicKey);
                    }
                    if (((LaunchActivity) photoViewer.f31403y).q0(xnVar2, true, false)) {
                        xnVar2.Ab(arrayList2);
                    } else {
                        tyVar.finishFragment();
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
                    tyVar.finishFragment();
                    if (xnVar != null) {
                        xnVar.Q7();
                        UndoView undoView = xnVar.y3;
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
                ty tyVar2 = (ty) obj;
                long j12 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                ProfileActivity profileActivity = a01Var.f31935b;
                i12 = ((org.telegram.ui.ActionBar.o2) profileActivity).currentAccount;
                TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-j12));
                if (chat != null && (chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.add_admins))) {
                    profileActivity.getMessagesController().checkIsInChat(false, chat, user, new ci.p9(a01Var, j12, tyVar2, 6));
                } else {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.f31700z0);
                    String string = LocaleController.getString(R.string.AddBot);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18655a;
                    c2Var.R = string;
                    if (chat == null) {
                        str = "";
                    } else {
                        str = chat.title;
                    }
                    c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AddMembersAlertNamesText", R.string.AddMembersAlertNamesText, UserObject.getUserName(user), str));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder.k(LocaleController.getString(R.string.AddBot), new ci.y6(a01Var, j12, tyVar, user));
                    profileActivity.showDialog(c2Var);
                }
                return true;
        }
    }

    @Override
    public boolean mo18c(float f7, float f10, int i10, final View view) {
        final g7 g7Var = (g7) this.f32881b;
        org.telegram.ui.Components.yl0 yl0Var = (org.telegram.ui.Components.yl0) this.f32882c;
        org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.d;
        v7 v7Var = g7Var.e;
        i7 i7Var = (i7) yl0Var.getAdapter();
        final p7 p7Var = (p7) i7Var.e.get(i10);
        if (!(view instanceof n7) && !(view instanceof org.telegram.ui.Cells.t7)) {
            l7 l7Var = v7Var.E;
            if (l7Var != null) {
                l7Var.H0(p7Var.f36340c, p7Var.d, true);
            }
            return true;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(v7Var.getContext(), null);
        if (view instanceof org.telegram.ui.Cells.t7) {
            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_view_file, LocaleController.getString(R.string.CacheOpenFile), false, null).setOnClickListener(new ai.s0(g7Var, p7Var, i7Var, yl0Var, view, 5));
        } else if (((n7) view).f35834b.getChildAt(0) instanceof org.telegram.ui.Cells.j7) {
            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_played, LocaleController.getString(R.string.PlayFile), false, null).setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    switch (r4) {
                        case 0:
                            g7 g7Var2 = g7Var;
                            v7.b(g7Var2.e, p7Var.d, (n7) view);
                            org.telegram.ui.ActionBar.o1 o1Var = g7Var2.f33834a;
                            if (o1Var != null) {
                                o1Var.d(true);
                                return;
                            }
                            return;
                        default:
                            g7 g7Var3 = g7Var;
                            v7.b(g7Var3.e, p7Var.d, (n7) view);
                            org.telegram.ui.ActionBar.o1 o1Var2 = g7Var3.f33834a;
                            if (o1Var2 != null) {
                                o1Var2.d(true);
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
                            g7 g7Var2 = g7Var;
                            v7.b(g7Var2.e, p7Var.d, (n7) view);
                            org.telegram.ui.ActionBar.o1 o1Var = g7Var2.f33834a;
                            if (o1Var != null) {
                                o1Var.d(true);
                                return;
                            }
                            return;
                        default:
                            g7 g7Var3 = g7Var;
                            v7.b(g7Var3.e, p7Var.d, (n7) view);
                            org.telegram.ui.ActionBar.o1 o1Var2 = g7Var3.f33834a;
                            if (o1Var2 != null) {
                                o1Var2.d(true);
                                return;
                            }
                            return;
                    }
                }
            });
        }
        zh.a aVar = p7Var.d;
        if (aVar.f49511b != 0 && aVar.f49514g != 0) {
            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_viewintopic, LocaleController.getString(R.string.ViewInChat), false, null).setOnClickListener(new b0(g7Var, p7Var, o2Var, 1));
        }
        org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_select, LocaleController.getString(!v7Var.f38466f.f49521j.contains(p7Var.d) ? R.string.Select : R.string.Deselect), false, null).setOnClickListener(new ai.f2(26, g7Var, p7Var));
        g7Var.f33834a = org.telegram.ui.Components.e5.Q(o2Var, actionBarPopupWindow$ActionBarPopupWindowLayout, view, (int) f7, (int) f10);
        v7Var.getRootView().dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
        return true;
    }

    @Override
    public void run(String str) {
        xn xnVar = (xn) this.f32881b;
        org.telegram.ui.Cells.h0 h0Var = (org.telegram.ui.Cells.h0) this.f32882c;
        CharSequence charSequence = (CharSequence) this.d;
        String language = LocaleController.getInstance().getCurrentLocale().getLanguage();
        if (str != null && ((!str.equals(language) || str.equals("und")) && !y31.Y().contains(str))) {
            h0Var.setOnClickListener(new ai.s0(xnVar, str, language, charSequence, h0Var, 7));
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
    public void r0(View view, float f7, float f10) {
    }
}
