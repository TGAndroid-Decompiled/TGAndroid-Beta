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
public final class e7 implements org.telegram.ui.Components.zl0, org.telegram.ui.Components.kk0, org.telegram.ui.Components.e5, LanguageDetector.StringCallback, a5, org.telegram.ui.ActionBar.a2, MessagesStorage.LongCallback, org.telegram.ui.Components.xl0, MessagesController.NewMessageCallback, vx, hf1, org.telegram.ui.Components.voip.g3, OnSuccessListener {
    public final int f36562a;
    public final Object f36563b;
    public final Object f36564c;
    public final Object d;

    public e7(Object obj, Object obj2, Object obj3, int i10) {
        this.f36562a = i10;
        this.f36563b = obj;
        this.f36564c = obj2;
        this.d = obj3;
    }

    @Override
    public void C(int i10, int i11, boolean z10) {
        TL_stars.StarsAmount starsAmount;
        switch (this.f36562a) {
            case 2:
                qn qnVar = (qn) this.f36563b;
                qnVar.getClass();
                qnVar.gb((TLRPC.BotInlineResult) this.f36564c, z10, i10, ((Long) this.d).longValue());
                return;
            case 3:
            default:
                qn qnVar2 = (qn) this.f36563b;
                TLRPC.SuggestedPost suggestedPost = (TLRPC.SuggestedPost) this.f36564c;
                MessageObject messageObject = (MessageObject) this.d;
                qnVar2.getClass();
                if (z10) {
                    if (suggestedPost != null) {
                        starsAmount = suggestedPost.price;
                    } else {
                        starsAmount = null;
                    }
                    TLRPC.SuggestedPost tl = MessageSuggestionParams.of(ag.a.l(starsAmount), i10).toTl();
                    if (messageObject != null && messageObject.messageOwner != null && tl != null) {
                        qnVar2.getMessagesController().addOfferToSuggestedMessage(messageObject, tl);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                qn.M0((qn) this.f36563b, (MessageObject.GroupedMessages) this.f36564c, (MessageObject) this.d, i10, i11);
                return;
        }
    }

    @Override
    public boolean D() {
        switch (this.f36562a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean J(cy cyVar) {
        switch (this.f36562a) {
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
    public void a(org.telegram.ui.Components.mk0 mk0Var, int i10) {
        int i11;
        View view = (View) this.f36563b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f36564c;
        int[] iArr = (int[]) this.d;
        if (view != null) {
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            view.measure(View.MeasureSpec.makeMeasureSpec(mk0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            i11 = view.getMeasuredHeight() + AndroidUtilities.dp(8.0f);
            view.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        } else {
            i11 = 0;
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f(iArr[0], org.telegram.messenger.g0.C(52.0f, i11, i10), true);
    }

    @Override
    public void b(i5 i5Var) {
        switch (this.f36562a) {
            case 6:
                cn cnVar = (cn) this.f36563b;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f36564c;
                TLRPC.User user = (TLRPC.User) this.d;
                int ordinal = i5Var.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal == 5) {
                                cnVar.f36032a.ra(user);
                                return;
                            }
                            return;
                        }
                        cnVar.b(user);
                        return;
                    }
                    cnVar.r(u1Var, user);
                    return;
                }
                cnVar.v(user, false);
                return;
            default:
                cn cnVar2 = (cn) this.f36563b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f36564c;
                org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) this.d;
                int ordinal2 = i5Var.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1 && ordinal2 != 2) {
                        if (ordinal2 != 4) {
                            if (ordinal2 == 5) {
                                cnVar2.f36032a.pa(chat);
                                return;
                            }
                            return;
                        }
                        cnVar2.a(chat);
                        return;
                    }
                    cnVar2.o(u1Var2, chat, 0, false);
                    return;
                }
                cnVar2.u(chat);
                return;
        }
    }

    @Override
    public void c(org.telegram.ui.Components.voip.h3 h3Var) {
        String string;
        hh1 hh1Var = (hh1) this.f36563b;
        VoIPService voIPService = (VoIPService) this.f36564c;
        org.telegram.ui.Components.voip.i3 i3Var = (org.telegram.ui.Components.voip.i3) this.d;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            AndroidUtilities.cancelRunOnUIThread(hh1Var.S0);
            hh1Var.R0 = false;
            if (hh1Var.f37693w0.isTouchExplorationEnabled()) {
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
        q50.o((q50) this.f36563b, (Activity) this.f36564c, (ChatObject.Call) this.d, view, i10);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        String str;
        int i11;
        boolean z10;
        int i12 = this.f36562a;
        Object obj = this.d;
        Object obj2 = this.f36564c;
        Object obj3 = this.f36563b;
        switch (i12) {
            case 8:
                to toVar = (to) obj3;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) obj2;
                View view = (View) obj;
                wo woVar = toVar.f41722a.Y2;
                if (tL_username.editable) {
                    if (woVar.f42925s0 == null) {
                        woVar.f42925s0 = Boolean.valueOf(tL_username.active);
                    }
                    tL_username.active = !tL_username.active;
                } else {
                    TLRPC.TL_channels_toggleUsername tL_channels_toggleUsername = new TLRPC.TL_channels_toggleUsername();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    TLRPC.Chat chat = woVar.X;
                    tL_inputChannel.channel_id = chat.f20275id;
                    tL_inputChannel.access_hash = chat.access_hash;
                    tL_channels_toggleUsername.channel = tL_inputChannel;
                    tL_channels_toggleUsername.username = tL_username.username;
                    boolean z11 = tL_username.active;
                    tL_channels_toggleUsername.active = !z11;
                    woVar.getConnectionsManager().sendRequest(tL_channels_toggleUsername, new ai.i4(toVar, tL_channels_toggleUsername, tL_username, z11, 4));
                    woVar.P.add(tL_username.username);
                    ((pa) view).setLoading(true);
                }
                woVar.V();
                return;
            case 9:
                ip ipVar = (ip) obj3;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                ipVar.getClass();
                if (((TLRPC.ChatFull) obj2).hidden_prehistory) {
                    ipVar.getMessagesController().toggleChannelInvitesHistory(chat2.f20275id, false);
                }
                ipVar.Y(chat2, null);
                return;
            case 10:
            case 14:
            case 17:
            case 18:
            case 19:
            case 20:
            default:
                ua1 ua1Var = (ua1) obj3;
                if (org.telegram.ui.ActionBar.h6.k0(((wa1) obj2).d, (org.telegram.ui.ActionBar.f6) obj, true)) {
                    org.telegram.ui.ActionBar.h6.o1(false, false);
                    NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                    int i13 = NotificationCenter.needSetDayNightTheme;
                    if (ua1Var.e.f33896f == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    globalInstance.lambda$postNotificationNameOnUIThread$1(i13, org.telegram.ui.ActionBar.h6.I, Boolean.valueOf(z10), null, -1);
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
                dataSettingsActivity.n0(dataSettingsActivity.f33118n);
                ImageLoader.getInstance().checkMediaPaths(new wt(dataSettingsActivity, 2));
                ((AlertDialog$Builder) obj).f20604a.L0.run();
                return;
            case 13:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj2;
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                ((AlertDialog$Builder) obj).f20604a.L0.run();
                lz lzVar = ((jz) obj3).E.f38694c;
                lzVar.d.title = editTextBoldCursor.getText().toString();
                lzVar.d0(true);
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = lzVar.d;
                if (lzVar.F != 0) {
                    lzVar.getConnectionsManager().cancelRequest(lzVar.F, true);
                    lzVar.F = 0;
                }
                TL_chatlists.TL_chatlists_editExportedInvite tL_chatlists_editExportedInvite = new TL_chatlists.TL_chatlists_editExportedInvite();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_editExportedInvite.chatlist = tL_inputChatlistDialogFilter;
                tL_inputChatlistDialogFilter.filter_id = lzVar.f39085c.f17801id;
                tL_chatlists_editExportedInvite.slug = lzVar.b0();
                tL_chatlists_editExportedInvite.revoked = tL_exportedChatlistInvite.revoked;
                tL_chatlists_editExportedInvite.flags = 2 | tL_chatlists_editExportedInvite.flags;
                tL_chatlists_editExportedInvite.title = tL_exportedChatlistInvite.title;
                lzVar.F = lzVar.getConnectionsManager().sendRequest(tL_chatlists_editExportedInvite, new zy(lzVar, 0));
                Utilities.Callback callback = lzVar.f39092y;
                if (callback != null) {
                    callback.run(tL_exportedChatlistInvite);
                    return;
                }
                return;
            case 15:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) obj2;
                AndroidUtilities.hideKeyboard(editTextBoldCursor2);
                ((t40) obj3).f41587b.f40375a1.setTitle(editTextBoldCursor2.getText().toString());
                ((AlertDialog$Builder) obj).f20604a.L0.run();
                return;
            case 16:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj3;
                notificationsSettingsActivity.getClass();
                notificationsSettingsActivity.presentFragment(new NotificationsCustomSettingsActivity(-1, (ArrayList) obj2, (ArrayList) obj, false));
                return;
            case 21:
                d71 d71Var = (d71) obj2;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) obj;
                TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
                resetauthorization.hash = tL_authorization.hash;
                i11 = ((org.telegram.ui.ActionBar.n2) d71Var.f36306a).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(resetauthorization, new x40(27, d71Var, tL_authorization));
                ((s61) obj3).d.dismiss();
                return;
        }
    }

    @Override
    public void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((h61) this.f36563b).U((TLRPC.User) this.f36564c, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.d);
    }

    @Override
    public boolean onMessageReceived(TLRPC.Message message) {
        eo0 eo0Var = (eo0) this.f36563b;
        org.telegram.ui.ActionBar.d5 d5Var = (org.telegram.ui.ActionBar.d5) this.f36564c;
        Activity activity = (Activity) this.d;
        if (MessageObject.getPeerId(message.peer_id) == eo0Var.f36719l0.f20422id && (message.action instanceof TLRPC.TL_messageActionPaymentSent)) {
            AndroidUtilities.runOnUIThread(new fn0(eo0Var, d5Var, activity, message, 0));
            return true;
        }
        return false;
    }

    @Override
    public void onSuccess(Object obj) {
        org.telegram.ui.ActionBar.d6 d6Var;
        float f7;
        com.google.android.gms.internal.cast.z5 z5Var = (com.google.android.gms.internal.cast.z5) this.f36563b;
        Integer num = (Integer) obj;
        FileLog.d("wear-auth: /answer delivered to " + ((String) z5Var.f6882a));
        ((ei.d) this.f36564c).setLoading(false);
        int i10 = ((int[]) this.d)[0];
        ArrayList arrayList = (ArrayList) z5Var.e;
        if (arrayList != null && !arrayList.isEmpty()) {
            Context context = LaunchActivity.H1;
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
                org.telegram.ui.ActionBar.f3 f3Var = yh1.f43501c;
                if (f3Var != null) {
                    f3Var.dismiss();
                    yh1.f43501c = null;
                }
                org.telegram.ui.ActionBar.f3 i11 = org.telegram.messenger.lk.i(1, context, d6Var, false);
                FrameLayout frameLayout = new FrameLayout(context);
                i11.customView = frameLayout;
                LinearLayout e = org.telegram.messenger.lk.e(context, 1);
                frameLayout.addView(e, w7.z5.e(-1, -1, 119));
                TextView b10 = w7.d6.b(context, 20.0f, org.telegram.ui.ActionBar.h6.f21095j5, true, d6Var);
                b10.setGravity(17);
                b10.setText(LocaleController.getString(R.string.WearAuthEmojis));
                e.addView(b10, w7.z5.r(-1, -2, 49, 32.0f, 24.0f, 32.0f, 9.66f));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    Drawable emojiBigDrawable = Emoji.getEmojiBigDrawable((String) arrayList.get(i12));
                    ImageView imageView = new ImageView(context);
                    imageView.setImageDrawable(emojiBigDrawable);
                    NotificationCenter.listenEmojiLoading(imageView);
                    imageView.setBackground(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.h6.m1(0.15f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, d6Var))));
                    if (i12 == 0) {
                        f7 = 0.0f;
                    } else {
                        f7 = 5.0f;
                    }
                    linearLayout.addView(imageView, w7.z5.k(f7, 0.0f, 0.0f, 0.0f, 80, 80));
                }
                e.addView(linearLayout, w7.z5.t(-2, -2, 49, 32, 12, 32, 12));
                ei.d f10 = org.telegram.messenger.lk.f(24, context, d6Var, true);
                f10.setText(LocaleController.getString(R.string.WearAuthEmojisLogIn));
                e.addView(f10, w7.z5.t(-1, 48, 7, 12, 12, 12, 8));
                int i13 = org.telegram.ui.ActionBar.h6.f20931a7;
                i11.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(i13, d6Var));
                i11.fixNavigationBar(org.telegram.ui.ActionBar.h6.w0(i13, d6Var));
                yh1.f43501c = i11;
                i11.show();
                f10.setOnClickListener(new ai.ha(f10, i10, i11, 19));
            }
        }
    }

    @Override
    public void run(long j10) {
        bq.a0((bq) this.f36563b, (TLRPC.InputCheckPasswordSRP) this.f36564c, (TwoStepVerificationActivity) this.d, j10);
    }

    @Override
    public boolean w(cy cyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, re1 re1Var) {
        long j10;
        int i12;
        String str;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i13 = this.f36562a;
        Object obj = this.d;
        Object obj2 = this.f36564c;
        Object obj3 = this.f36563b;
        switch (i13) {
            case 18:
                ArrayList<MessageObject> arrayList2 = (ArrayList) obj2;
                qn qnVar = (qn) obj;
                PhotoViewer photoViewer = ((yr0) obj3).f43543b;
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
                    qn qnVar2 = new qn(h);
                    if (topicKey.topicId != 0) {
                        og.d.a(qnVar2, topicKey);
                    }
                    if (((LaunchActivity) photoViewer.f33451y).u0(qnVar2, true, false)) {
                        qnVar2.Eb(arrayList2);
                    } else {
                        cyVar.finishFragment();
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
                    cyVar.finishFragment();
                    if (qnVar != null) {
                        qnVar.T7();
                        UndoView undoView = qnVar.y3;
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
                jz0 jz0Var = (jz0) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                cy cyVar2 = (cy) obj;
                long j13 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                ProfileActivity profileActivity = jz0Var.f38372b;
                i12 = ((org.telegram.ui.ActionBar.n2) profileActivity).currentAccount;
                TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-j13));
                if (chat != null && (chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.add_admins))) {
                    profileActivity.getMessagesController().checkIsInChat(false, chat, user, new ai.f(jz0Var, j13, cyVar2, 7));
                } else {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.A0);
                    String string = LocaleController.getString(R.string.AddBot);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20604a;
                    b2Var.R = string;
                    if (chat == null) {
                        str = "";
                    } else {
                        str = chat.title;
                    }
                    b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AddMembersAlertNamesText", R.string.AddMembersAlertNamesText, UserObject.getUserName(user), str));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder.k(LocaleController.getString(R.string.AddBot), new ai.w2(jz0Var, j13, cyVar, user, 5));
                    profileActivity.showDialog(b2Var);
                }
                return true;
        }
    }

    @Override
    public boolean mo17d(float f7, float f10, int i10, final View view) {
        final h7 h7Var = (h7) this.f36563b;
        org.telegram.ui.Components.im0 im0Var = (org.telegram.ui.Components.im0) this.f36564c;
        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.d;
        v7 v7Var = h7Var.d;
        i7 i7Var = (i7) im0Var.getAdapter();
        final p7 p7Var = (p7) i7Var.e.get(i10);
        if (!(view instanceof n7) && !(view instanceof org.telegram.ui.Cells.s7)) {
            l7 l7Var = v7Var.v;
            if (l7Var != null) {
                l7Var.s0(p7Var.f40085c, p7Var.d, true);
            }
            return true;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(v7Var.getContext(), null);
        if (view instanceof org.telegram.ui.Cells.s7) {
            org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_view_file, LocaleController.getString(R.string.CacheOpenFile), false, null).setOnClickListener(new ci.e0(h7Var, p7Var, i7Var, im0Var, view, 5));
        } else if (((n7) view).f39438b.getChildAt(0) instanceof org.telegram.ui.Cells.h7) {
            org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_played, LocaleController.getString(R.string.PlayFile), false, null).setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    switch (r4) {
                        case 0:
                            h7 h7Var2 = h7Var;
                            v7.b(h7Var2.d, p7Var.d, (n7) view);
                            org.telegram.ui.ActionBar.m1 m1Var = h7Var2.f37535a;
                            if (m1Var != null) {
                                m1Var.d(true);
                                return;
                            }
                            return;
                        default:
                            h7 h7Var3 = h7Var;
                            v7.b(h7Var3.d, p7Var.d, (n7) view);
                            org.telegram.ui.ActionBar.m1 m1Var2 = h7Var3.f37535a;
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
                            org.telegram.ui.ActionBar.m1 m1Var = h7Var2.f37535a;
                            if (m1Var != null) {
                                m1Var.d(true);
                                return;
                            }
                            return;
                        default:
                            h7 h7Var3 = h7Var;
                            v7.b(h7Var3.d, p7Var.d, (n7) view);
                            org.telegram.ui.ActionBar.m1 m1Var2 = h7Var3.f37535a;
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
        if (bVar.f4427b != 0 && bVar.f4430g != 0) {
            org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_viewintopic, LocaleController.getString(R.string.ViewInChat), false, null).setOnClickListener(new a0(h7Var, p7Var, n2Var, 1));
        }
        org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_select, LocaleController.getString(!v7Var.f42121f.f4437j.contains(p7Var.d) ? R.string.Select : R.string.Deselect), false, null).setOnClickListener(new org.telegram.ui.ActionBar.s1(6, h7Var, p7Var));
        h7Var.f37535a = org.telegram.ui.Components.f5.P(n2Var, actionBarPopupWindow$ActionBarPopupWindowLayout, view, (int) f7, (int) f10);
        v7Var.getRootView().dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
        return true;
    }

    @Override
    public void run(String str) {
        qn qnVar = (qn) this.f36563b;
        org.telegram.ui.Cells.h0 h0Var = (org.telegram.ui.Cells.h0) this.f36564c;
        CharSequence charSequence = (CharSequence) this.d;
        String language = LocaleController.getInstance().getCurrentLocale().getLanguage();
        if (str != null && ((!str.equals(language) || str.equals("und")) && !r21.Y().contains(str))) {
            h0Var.setOnClickListener(new ci.e0(qnVar, str, language, charSequence, h0Var, 7));
        } else {
            h0Var.setClickable(false);
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
