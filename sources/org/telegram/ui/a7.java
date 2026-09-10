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
public final class a7 implements org.telegram.ui.Components.ml0, org.telegram.ui.Components.xj0, org.telegram.ui.Components.c5, LanguageDetector.StringCallback, v4, org.telegram.ui.ActionBar.c2, MessagesStorage.LongCallback, org.telegram.ui.Components.kl0, MessagesController.NewMessageCallback, qy, zg1, org.telegram.ui.Components.voip.i3, OnSuccessListener {
    public final int f30809a;
    public final Object f30810b;
    public final Object f30811c;
    public final Object d;

    public a7(Object obj, Object obj2, Object obj3, int i10) {
        this.f30809a = i10;
        this.f30810b = obj;
        this.f30811c = obj2;
        this.d = obj3;
    }

    @Override
    public boolean A() {
        switch (this.f30809a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void I(int i10, int i11, boolean z10) {
        TL_stars.StarsAmount starsAmount;
        switch (this.f30809a) {
            case 2:
                eo eoVar = (eo) this.f30810b;
                eoVar.getClass();
                eoVar.cb((TLRPC.BotInlineResult) this.f30811c, z10, i10, ((Long) this.d).longValue());
                return;
            case 3:
            default:
                eo eoVar2 = (eo) this.f30810b;
                TLRPC.SuggestedPost suggestedPost = (TLRPC.SuggestedPost) this.f30811c;
                MessageObject messageObject = (MessageObject) this.d;
                eoVar2.getClass();
                if (z10) {
                    if (suggestedPost != null) {
                        starsAmount = suggestedPost.price;
                    } else {
                        starsAmount = null;
                    }
                    TLRPC.SuggestedPost tl = MessageSuggestionParams.of(yf.a.l(starsAmount), i10).toTl();
                    if (messageObject != null && messageObject.messageOwner != null && tl != null) {
                        eoVar2.getMessagesController().addOfferToSuggestedMessage(messageObject, tl);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                eo.a0((eo) this.f30810b, (MessageObject.GroupedMessages) this.f30811c, (MessageObject) this.d, i10, i11);
                return;
        }
    }

    @Override
    public boolean J(wy wyVar) {
        switch (this.f30809a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void a(org.telegram.ui.Components.zj0 zj0Var, int i10) {
        int i11;
        View view = (View) this.f30810b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f30811c;
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
        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f(iArr[0], org.telegram.messenger.a2.C(52.0f, i11, i10), true);
    }

    @Override
    public void b(org.telegram.ui.Components.voip.j3 j3Var) {
        String string;
        zi1 zi1Var = (zi1) this.f30810b;
        VoIPService voIPService = (VoIPService) this.f30811c;
        org.telegram.ui.Components.voip.k3 k3Var = (org.telegram.ui.Components.voip.k3) this.d;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            AndroidUtilities.cancelRunOnUIThread(zi1Var.S0);
            zi1Var.R0 = false;
            if (zi1Var.f39397w0.isTouchExplorationEnabled()) {
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
    public void c(float f7, float f10, int i10, View view) {
        j60.n((j60) this.f30810b, (Activity) this.f30811c, (ChatObject.Call) this.d, view, i10);
    }

    @Override
    public void d(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((v71) this.f30810b).T((TLRPC.User) this.f30811c, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.d);
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void e(d5 d5Var) {
        switch (this.f30809a) {
            case 6:
                pn pnVar = (pn) this.f30810b;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f30811c;
                TLRPC.User user = (TLRPC.User) this.d;
                int ordinal = d5Var.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal == 5) {
                                pnVar.f35881a.ma(user);
                                return;
                            }
                            return;
                        }
                        pnVar.c(user);
                        return;
                    }
                    pnVar.u(t1Var, user);
                    return;
                }
                pnVar.x(user, false);
                return;
            default:
                pn pnVar2 = (pn) this.f30810b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f30811c;
                org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) this.d;
                int ordinal2 = d5Var.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1 && ordinal2 != 2) {
                        if (ordinal2 != 4) {
                            if (ordinal2 == 5) {
                                pnVar2.f35881a.ka(chat);
                                return;
                            }
                            return;
                        }
                        pnVar2.b(chat);
                        return;
                    }
                    pnVar2.p(t1Var2, chat, 0, false);
                    return;
                }
                pnVar2.w(chat);
                return;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        String str;
        int i11;
        boolean z10;
        int i12 = this.f30809a;
        Object obj = this.d;
        Object obj2 = this.f30811c;
        Object obj3 = this.f30810b;
        switch (i12) {
            case 8:
                jp jpVar = (jp) obj3;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) obj2;
                View view = (View) obj;
                mp mpVar = jpVar.f34145a.f34749a3;
                if (tL_username.editable) {
                    if (mpVar.f35039s0 == null) {
                        mpVar.f35039s0 = Boolean.valueOf(tL_username.active);
                    }
                    tL_username.active = !tL_username.active;
                } else {
                    TLRPC.TL_channels_toggleUsername tL_channels_toggleUsername = new TLRPC.TL_channels_toggleUsername();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    TLRPC.Chat chat = mpVar.X;
                    tL_inputChannel.channel_id = chat.f17195id;
                    tL_inputChannel.access_hash = chat.access_hash;
                    tL_channels_toggleUsername.channel = tL_inputChannel;
                    tL_channels_toggleUsername.username = tL_username.username;
                    boolean z11 = tL_username.active;
                    tL_channels_toggleUsername.active = !z11;
                    mpVar.getConnectionsManager().sendRequest(tL_channels_toggleUsername, new bi.d2(jpVar, tL_channels_toggleUsername, tL_username, z11, 3));
                    mpVar.P.add(tL_username.username);
                    ((oa) view).setLoading(true);
                }
                mpVar.V();
                return;
            case 9:
                yp ypVar = (yp) obj3;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                ypVar.getClass();
                if (((TLRPC.ChatFull) obj2).hidden_prehistory) {
                    ypVar.getMessagesController().toggleChannelInvitesHistory(chat2.f17195id, false);
                }
                ypVar.Y(chat2, null);
                return;
            case 10:
            case 14:
            case 17:
            case 18:
            case 19:
            case 20:
            default:
                kc1 kc1Var = (kc1) obj3;
                if (org.telegram.ui.ActionBar.j6.j0(((mc1) obj2).d, (org.telegram.ui.ActionBar.h6) obj, true)) {
                    org.telegram.ui.ActionBar.j6.n1(false, false);
                    NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                    int i13 = NotificationCenter.needSetDayNightTheme;
                    if (kc1Var.e.f30669f == 1) {
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
                dataSettingsActivity.n0(dataSettingsActivity.f29896n);
                ImageLoader.getInstance().checkMediaPaths(new ku(dataSettingsActivity, 2));
                ((AlertDialog$Builder) obj).f17528a.L0.run();
                return;
            case 13:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj2;
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                ((AlertDialog$Builder) obj).f17528a.L0.run();
                e00 e00Var = ((c00) obj3).E.f31799c;
                e00Var.d.title = editTextBoldCursor.getText().toString();
                e00Var.d0(true);
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = e00Var.d;
                if (e00Var.F != 0) {
                    e00Var.getConnectionsManager().cancelRequest(e00Var.F, true);
                    e00Var.F = 0;
                }
                TL_chatlists.TL_chatlists_editExportedInvite tL_chatlists_editExportedInvite = new TL_chatlists.TL_chatlists_editExportedInvite();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_editExportedInvite.chatlist = tL_inputChatlistDialogFilter;
                tL_inputChatlistDialogFilter.filter_id = e00Var.f32004c.f14645id;
                tL_chatlists_editExportedInvite.slug = e00Var.b0();
                tL_chatlists_editExportedInvite.revoked = tL_exportedChatlistInvite.revoked;
                tL_chatlists_editExportedInvite.flags = 2 | tL_chatlists_editExportedInvite.flags;
                tL_chatlists_editExportedInvite.title = tL_exportedChatlistInvite.title;
                e00Var.F = e00Var.getConnectionsManager().sendRequest(tL_chatlists_editExportedInvite, new tz(e00Var, 0));
                Utilities.Callback callback = e00Var.f32011y;
                if (callback != null) {
                    callback.run(tL_exportedChatlistInvite);
                    return;
                }
                return;
            case 15:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) obj2;
                AndroidUtilities.hideKeyboard(editTextBoldCursor2);
                ((m50) obj3).f34847b.f33936a1.setTitle(editTextBoldCursor2.getText().toString());
                ((AlertDialog$Builder) obj).f17528a.L0.run();
                return;
            case 16:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj3;
                notificationsSettingsActivity.getClass();
                notificationsSettingsActivity.presentFragment(new NotificationsCustomSettingsActivity(-1, (ArrayList) obj2, (ArrayList) obj, false));
                return;
            case 21:
                s81 s81Var = (s81) obj2;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) obj;
                TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
                resetauthorization.hash = tL_authorization.hash;
                i11 = ((org.telegram.ui.ActionBar.p2) s81Var.f36580a).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(resetauthorization, new rg0(15, s81Var, tL_authorization));
                ((h81) obj3).d.dismiss();
                return;
        }
    }

    @Override
    public boolean onMessageReceived(TLRPC.Message message) {
        wo0 wo0Var = (wo0) this.f30810b;
        org.telegram.ui.ActionBar.f5 f5Var = (org.telegram.ui.ActionBar.f5) this.f30811c;
        Activity activity = (Activity) this.d;
        if (MessageObject.getPeerId(message.peer_id) == wo0Var.f38275l0.f17342id && (message.action instanceof TLRPC.TL_messageActionPaymentSent)) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.q01(wo0Var, f5Var, activity, message, 22));
            return true;
        }
        return false;
    }

    @Override
    public void onSuccess(Object obj) {
        org.telegram.ui.ActionBar.f6 f6Var;
        float f7;
        bi.u6 u6Var = (bi.u6) this.f30810b;
        Integer num = (Integer) obj;
        FileLog.d("wear-auth: /answer delivered to " + ((String) u6Var.f3721c));
        ((bi.d) this.f30811c).setLoading(false);
        int i10 = ((int[]) this.d)[0];
        ArrayList arrayList = (ArrayList) u6Var.e;
        if (arrayList != null && !arrayList.isEmpty()) {
            Context context = LaunchActivity.G1;
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
                org.telegram.ui.ActionBar.h3 h3Var = pj1.f35854c;
                if (h3Var != null) {
                    h3Var.dismiss();
                    pj1.f35854c = null;
                }
                org.telegram.ui.ActionBar.h3 i11 = org.telegram.messenger.em.i(1, context, f6Var, false);
                FrameLayout frameLayout = new FrameLayout(context);
                i11.customView = frameLayout;
                LinearLayout f10 = org.telegram.messenger.em.f(context, 1);
                frameLayout.addView(f10, w7.a6.e(-1, -1, 119));
                TextView b10 = w7.e6.b(context, 20.0f, org.telegram.ui.ActionBar.j6.f18034j5, true, f6Var);
                b10.setGravity(17);
                b10.setText(LocaleController.getString(R.string.WearAuthEmojis));
                f10.addView(b10, w7.a6.r(-1, -2, 49, 32.0f, 24.0f, 32.0f, 9.66f));
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
                    linearLayout.addView(imageView, w7.a6.k(f7, 0.0f, 0.0f, 0.0f, 80, 80));
                }
                f10.addView(linearLayout, w7.a6.t(-2, -2, 49, 32, 12, 32, 12));
                bi.d g10 = org.telegram.messenger.em.g(24, context, f6Var, true);
                g10.setText(LocaleController.getString(R.string.WearAuthEmojisLogIn));
                f10.addView(g10, w7.a6.t(-1, 48, 7, 12, 12, 12, 8));
                int i13 = org.telegram.ui.ActionBar.j6.f17872a7;
                i11.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
                i11.fixNavigationBar(org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
                pj1.f35854c = i11;
                i11.show();
                g10.setOnClickListener(new org.telegram.ui.Cells.wa(g10, i10, i11, 16));
            }
        }
    }

    @Override
    public void run(long j3) {
        rq.a0((rq) this.f30810b, (TLRPC.InputCheckPasswordSRP) this.f30811c, (TwoStepVerificationActivity) this.d, j3);
    }

    @Override
    public boolean v(wy wyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, ig1 ig1Var) {
        long j3;
        int i12;
        String str;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i13 = this.f30809a;
        Object obj = this.d;
        Object obj2 = this.f30811c;
        Object obj3 = this.f30810b;
        switch (i13) {
            case 18:
                ArrayList<MessageObject> arrayList2 = (ArrayList) obj2;
                eo eoVar = (eo) obj;
                PhotoViewer photoViewer = ((rs0) obj3).f36451b;
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
                    eo eoVar2 = new eo(i14);
                    if (topicKey.topicId != 0) {
                        mg.d.a(eoVar2, topicKey);
                    }
                    if (((LaunchActivity) photoViewer.f30227y).q0(eoVar2, true, false)) {
                        eoVar2.Ab(arrayList2);
                    } else {
                        wyVar.finishFragment();
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
                    wyVar.finishFragment();
                    if (eoVar != null) {
                        eoVar.Q7();
                        UndoView undoView = eoVar.y3;
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
                n01 n01Var = (n01) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                wy wyVar2 = (wy) obj;
                long j12 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                ProfileActivity profileActivity = n01Var.f35089b;
                i12 = ((org.telegram.ui.ActionBar.p2) profileActivity).currentAccount;
                TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-j12));
                if (chat != null && (chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.add_admins))) {
                    profileActivity.getMessagesController().checkIsInChat(false, chat, user, new bi.bb(n01Var, j12, wyVar2, 6));
                } else {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.f30524z0);
                    String string = LocaleController.getString(R.string.AddBot);
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
                    d2Var.R = string;
                    if (chat == null) {
                        str = "";
                    } else {
                        str = chat.title;
                    }
                    d2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AddMembersAlertNamesText", R.string.AddMembersAlertNamesText, UserObject.getUserName(user), str));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder.k(LocaleController.getString(R.string.AddBot), new bi.a8(n01Var, j12, wyVar, user));
                    profileActivity.showDialog(d2Var);
                }
                return true;
        }
    }

    @Override
    public boolean mo18c(float f7, float f10, int i10, final View view) {
        final d7 d7Var = (d7) this.f30810b;
        org.telegram.ui.Components.vl0 vl0Var = (org.telegram.ui.Components.vl0) this.f30811c;
        org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.d;
        r7 r7Var = d7Var.d;
        e7 e7Var = (e7) vl0Var.getAdapter();
        final l7 l7Var = (l7) e7Var.e.get(i10);
        if (!(view instanceof j7) && !(view instanceof org.telegram.ui.Cells.u7)) {
            h7 h7Var = r7Var.v;
            if (h7Var != null) {
                h7Var.a0(l7Var.f34548c, l7Var.d, true);
            }
            return true;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(r7Var.getContext(), null);
        if (view instanceof org.telegram.ui.Cells.u7) {
            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_view_file, LocaleController.getString(R.string.CacheOpenFile), false, null).setOnClickListener(new hi.c(d7Var, l7Var, e7Var, vl0Var, view, 1));
        } else if (((j7) view).f34044b.getChildAt(0) instanceof org.telegram.ui.Cells.k7) {
            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_played, LocaleController.getString(R.string.PlayFile), false, null).setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    switch (r4) {
                        case 0:
                            d7 d7Var2 = d7Var;
                            r7.b(d7Var2.d, l7Var.d, (j7) view);
                            org.telegram.ui.ActionBar.p1 p1Var = d7Var2.f31848a;
                            if (p1Var != null) {
                                p1Var.d(true);
                                return;
                            }
                            return;
                        default:
                            d7 d7Var3 = d7Var;
                            r7.b(d7Var3.d, l7Var.d, (j7) view);
                            org.telegram.ui.ActionBar.p1 p1Var2 = d7Var3.f31848a;
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
                            d7 d7Var2 = d7Var;
                            r7.b(d7Var2.d, l7Var.d, (j7) view);
                            org.telegram.ui.ActionBar.p1 p1Var = d7Var2.f31848a;
                            if (p1Var != null) {
                                p1Var.d(true);
                                return;
                            }
                            return;
                        default:
                            d7 d7Var3 = d7Var;
                            r7.b(d7Var3.d, l7Var.d, (j7) view);
                            org.telegram.ui.ActionBar.p1 p1Var2 = d7Var3.f31848a;
                            if (p1Var2 != null) {
                                p1Var2.d(true);
                                return;
                            }
                            return;
                    }
                }
            });
        }
        yh.a aVar = l7Var.d;
        if (aVar.f47168b != 0 && aVar.f47171g != 0) {
            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_viewintopic, LocaleController.getString(R.string.ViewInChat), false, null).setOnClickListener(new a0(d7Var, l7Var, p2Var, 1));
        }
        org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_select, LocaleController.getString(!r7Var.f36246f.f47178j.contains(l7Var.d) ? R.string.Select : R.string.Deselect), false, null).setOnClickListener(new bi.n3(23, d7Var, l7Var));
        d7Var.f31848a = org.telegram.ui.Components.d5.Q(p2Var, actionBarPopupWindow$ActionBarPopupWindowLayout, view, (int) f7, (int) f10);
        r7Var.getRootView().dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
        return true;
    }

    @Override
    public void run(String str) {
        eo eoVar = (eo) this.f30810b;
        org.telegram.ui.Cells.h0 h0Var = (org.telegram.ui.Cells.h0) this.f30811c;
        CharSequence charSequence = (CharSequence) this.d;
        String language = LocaleController.getInstance().getCurrentLocale().getLanguage();
        if (str != null && ((!str.equals(language) || str.equals("und")) && !k41.Y().contains(str))) {
            h0Var.setOnClickListener(new hi.c(eoVar, str, language, charSequence, h0Var, 3));
        } else {
            h0Var.setClickable(false);
        }
    }

    @Override
    public void h() {
    }

    @Override
    public void p(float f7) {
    }

    @Override
    public void p0(View view, float f7, float f10) {
    }
}
