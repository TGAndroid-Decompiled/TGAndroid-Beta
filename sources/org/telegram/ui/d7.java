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
public final class d7 implements org.telegram.ui.Components.ll0, org.telegram.ui.Components.xj0, org.telegram.ui.Components.y4, LanguageDetector.StringCallback, x4, org.telegram.ui.ActionBar.c2, MessagesStorage.LongCallback, org.telegram.ui.Components.jl0, MessagesController.NewMessageCallback, jy, ig1, org.telegram.ui.Components.voip.j3, OnSuccessListener {
    public final int f36102a;
    public final Object f36103b;
    public final Object f36104c;
    public final Object d;

    public d7(Object obj, Object obj2, Object obj3, int i10) {
        this.f36102a = i10;
        this.f36103b = obj;
        this.f36104c = obj2;
        this.d = obj3;
    }

    @Override
    public boolean C() {
        switch (this.f36102a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void I(int i10, int i11, boolean z4) {
        TL_stars.StarsAmount starsAmount;
        switch (this.f36102a) {
            case 2:
                xn xnVar = (xn) this.f36103b;
                xnVar.getClass();
                xnVar.cb((TLRPC.BotInlineResult) this.f36104c, z4, i10, ((Long) this.d).longValue());
                return;
            case 3:
            default:
                xn xnVar2 = (xn) this.f36103b;
                TLRPC.SuggestedPost suggestedPost = (TLRPC.SuggestedPost) this.f36104c;
                MessageObject messageObject = (MessageObject) this.d;
                xnVar2.getClass();
                if (z4) {
                    if (suggestedPost != null) {
                        starsAmount = suggestedPost.price;
                    } else {
                        starsAmount = null;
                    }
                    TLRPC.SuggestedPost tl = MessageSuggestionParams.of(mf.a.l(starsAmount), i10).toTl();
                    if (messageObject != null && messageObject.messageOwner != null && tl != null) {
                        xnVar2.getMessagesController().addOfferToSuggestedMessage(messageObject, tl);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                xn.a0((xn) this.f36103b, (MessageObject.GroupedMessages) this.f36104c, (MessageObject) this.d, i10, i11);
                return;
        }
    }

    @Override
    public boolean J(py pyVar) {
        switch (this.f36102a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean Y0(View view) {
        return false;
    }

    @Override
    public void a(org.telegram.ui.Components.zj0 zj0Var, int i10) {
        int i11;
        View view = (View) this.f36103b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f36104c;
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
        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f(iArr[0], org.telegram.messenger.y3.C(52.0f, i11, i10), true);
    }

    @Override
    public void b(f5 f5Var) {
        switch (this.f36102a) {
            case 6:
                jn jnVar = (jn) this.f36103b;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f36104c;
                TLRPC.User user = (TLRPC.User) this.d;
                int ordinal = f5Var.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal == 5) {
                                jnVar.f38085a.ma(user);
                                return;
                            }
                            return;
                        }
                        jnVar.c(user);
                        return;
                    }
                    jnVar.u(t1Var, user);
                    return;
                }
                jnVar.x(user, false);
                return;
            default:
                jn jnVar2 = (jn) this.f36103b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f36104c;
                org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) this.d;
                int ordinal2 = f5Var.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1 && ordinal2 != 2) {
                        if (ordinal2 != 4) {
                            if (ordinal2 == 5) {
                                jnVar2.f38085a.ka(chat);
                                return;
                            }
                            return;
                        }
                        jnVar2.b(chat);
                        return;
                    }
                    jnVar2.p(t1Var2, chat, 0, false);
                    return;
                }
                jnVar2.w(chat);
                return;
        }
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        d60.n((d60) this.f36103b, (Activity) this.f36104c, (ChatObject.Call) this.d, view, i10);
    }

    @Override
    public void d(org.telegram.ui.Components.voip.k3 k3Var) {
        String string;
        ii1 ii1Var = (ii1) this.f36103b;
        VoIPService voIPService = (VoIPService) this.f36104c;
        org.telegram.ui.Components.voip.l3 l3Var = (org.telegram.ui.Components.voip.l3) this.d;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            AndroidUtilities.cancelRunOnUIThread(ii1Var.P0);
            ii1Var.O0 = false;
            if (ii1Var.f37706t0.isTouchExplorationEnabled()) {
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
    public void i(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((h71) this.f36103b).T((TLRPC.User) this.f36104c, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.d);
    }

    @Override
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        String str;
        int i11;
        boolean z4;
        int i12 = this.f36102a;
        Object obj = this.d;
        Object obj2 = this.f36104c;
        Object obj3 = this.f36103b;
        switch (i12) {
            case 8:
                ap apVar = (ap) obj3;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) obj2;
                View view = (View) obj;
                ep epVar = apVar.f35232a.X2;
                if (tL_username.editable) {
                    if (epVar.f36556p0 == null) {
                        epVar.f36556p0 = Boolean.valueOf(tL_username.active);
                    }
                    tL_username.active = !tL_username.active;
                } else {
                    TLRPC.TL_channels_toggleUsername tL_channels_toggleUsername = new TLRPC.TL_channels_toggleUsername();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    TLRPC.Chat chat = epVar.U;
                    tL_inputChannel.channel_id = chat.f20845id;
                    tL_inputChannel.access_hash = chat.access_hash;
                    tL_channels_toggleUsername.channel = tL_inputChannel;
                    tL_channels_toggleUsername.username = tL_username.username;
                    boolean z10 = tL_username.active;
                    tL_channels_toggleUsername.active = !z10;
                    epVar.getConnectionsManager().sendRequest(tL_channels_toggleUsername, new wd(apVar, tL_channels_toggleUsername, tL_username, z10, 2));
                    epVar.M.add(tL_username.username);
                    ((ma) view).setLoading(true);
                }
                epVar.V();
                return;
            case 9:
                rp rpVar = (rp) obj3;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                rpVar.getClass();
                if (((TLRPC.ChatFull) obj2).hidden_prehistory) {
                    rpVar.getMessagesController().toggleChannelInvitesHistory(chat2.f20845id, false);
                }
                rpVar.Y(chat2, null);
                return;
            case 10:
            case 14:
            case 17:
            case 18:
            case 19:
            case 20:
            default:
                sb1 sb1Var = (sb1) obj3;
                if (org.telegram.ui.ActionBar.k6.j0(((ub1) obj2).d, (org.telegram.ui.ActionBar.i6) obj, true)) {
                    org.telegram.ui.ActionBar.k6.n1(false, false);
                    NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                    int i13 = NotificationCenter.needSetDayNightTheme;
                    if (sb1Var.f41126e.f34879f == 1) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    globalInstance.lambda$postNotificationNameOnUIThread$1(i13, org.telegram.ui.ActionBar.k6.I, Boolean.valueOf(z4), null, -1);
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
                dataSettingsActivity.n0(dataSettingsActivity.f34100n);
                ImageLoader.getInstance().checkMediaPaths(new iu(dataSettingsActivity, 2));
                ((AlertDialog$Builder) obj).f21168a.I0.run();
                return;
            case 13:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj2;
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                ((AlertDialog$Builder) obj).f21168a.I0.run();
                zz zzVar = ((xz) obj3).B.f43740c;
                zzVar.d.title = editTextBoldCursor.getText().toString();
                zzVar.d0(true);
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = zzVar.d;
                if (zzVar.C != 0) {
                    zzVar.getConnectionsManager().cancelRequest(zzVar.C, true);
                    zzVar.C = 0;
                }
                TL_chatlists.TL_chatlists_editExportedInvite tL_chatlists_editExportedInvite = new TL_chatlists.TL_chatlists_editExportedInvite();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_editExportedInvite.chatlist = tL_inputChatlistDialogFilter;
                tL_inputChatlistDialogFilter.filter_id = zzVar.f44050c.f18057id;
                tL_chatlists_editExportedInvite.slug = zzVar.b0();
                tL_chatlists_editExportedInvite.revoked = tL_exportedChatlistInvite.revoked;
                tL_chatlists_editExportedInvite.flags = 2 | tL_chatlists_editExportedInvite.flags;
                tL_chatlists_editExportedInvite.title = tL_exportedChatlistInvite.title;
                zzVar.C = zzVar.getConnectionsManager().sendRequest(tL_chatlists_editExportedInvite, new nz(zzVar, 0));
                Utilities.Callback callback = zzVar.f44058y;
                if (callback != null) {
                    callback.run(tL_exportedChatlistInvite);
                    return;
                }
                return;
            case 15:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) obj2;
                AndroidUtilities.hideKeyboard(editTextBoldCursor2);
                ((h50) obj3).f37225b.X0.setTitle(editTextBoldCursor2.getText().toString());
                ((AlertDialog$Builder) obj).f21168a.I0.run();
                return;
            case 16:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj3;
                notificationsSettingsActivity.getClass();
                notificationsSettingsActivity.presentFragment(new NotificationsCustomSettingsActivity(-1, (ArrayList) obj2, (ArrayList) obj, false));
                return;
            case 21:
                e81 e81Var = (e81) obj2;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) obj;
                TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
                resetauthorization.hash = tL_authorization.hash;
                i11 = ((org.telegram.ui.ActionBar.p2) e81Var.f36384a).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(resetauthorization, new tb0(20, e81Var, tL_authorization));
                ((s71) obj3).d.dismiss();
                return;
        }
    }

    @Override
    public boolean onMessageReceived(TLRPC.Message message) {
        lo0 lo0Var = (lo0) this.f36103b;
        org.telegram.ui.ActionBar.f5 f5Var = (org.telegram.ui.ActionBar.f5) this.f36104c;
        Activity activity = (Activity) this.d;
        if (MessageObject.getPeerId(message.peer_id) == lo0Var.f38723i0.f20992id && (message.action instanceof TLRPC.TL_messageActionPaymentSent)) {
            AndroidUtilities.runOnUIThread(new b30(lo0Var, f5Var, activity, message, 17));
            return true;
        }
        return false;
    }

    @Override
    public void onSuccess(Object obj) {
        org.telegram.ui.ActionBar.g6 g6Var;
        float f10;
        c5.j jVar = (c5.j) this.f36103b;
        Integer num = (Integer) obj;
        FileLog.d("wear-auth: /answer delivered to " + ((String) jVar.f2317c));
        ((qh.d) this.f36104c).setLoading(false);
        int i10 = ((int[]) this.d)[0];
        ArrayList arrayList = (ArrayList) jVar.f2318e;
        if (arrayList != null && !arrayList.isEmpty()) {
            Context context = LaunchActivity.D1;
            if (context == null) {
                context = ApplicationLoader.applicationContext;
            }
            if (context != null) {
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    g6Var = U.getResourceProvider();
                } else {
                    g6Var = null;
                }
                org.telegram.ui.ActionBar.h3 h3Var = aj1.f35206c;
                if (h3Var != null) {
                    h3Var.dismiss();
                    aj1.f35206c = null;
                }
                org.telegram.ui.ActionBar.h3 o10 = org.telegram.messenger.y3.o(context, g6Var, false, false);
                FrameLayout frameLayout = new FrameLayout(context);
                o10.customView = frameLayout;
                LinearLayout f11 = org.telegram.messenger.y3.f(context, 1);
                frameLayout.addView(f11, k7.c6.e(-1, -1, 119));
                TextView b10 = k7.g6.b(context, 20.0f, org.telegram.ui.ActionBar.k6.f21768j5, true, g6Var);
                b10.setGravity(17);
                b10.setText(LocaleController.getString(R.string.WearAuthEmojis));
                f11.addView(b10, k7.c6.r(-1, -2, 49, 32.0f, 24.0f, 32.0f, 9.66f));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    Drawable emojiBigDrawable = Emoji.getEmojiBigDrawable((String) arrayList.get(i11));
                    ImageView imageView = new ImageView(context);
                    imageView.setImageDrawable(emojiBigDrawable);
                    NotificationCenter.listenEmojiLoading(imageView);
                    imageView.setBackground(org.telegram.ui.ActionBar.k6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.k6.l1(0.15f, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Oh, g6Var))));
                    if (i11 == 0) {
                        f10 = 0.0f;
                    } else {
                        f10 = 5.0f;
                    }
                    linearLayout.addView(imageView, k7.c6.k(f10, 0.0f, 0.0f, 0.0f, 80, 80));
                }
                f11.addView(linearLayout, k7.c6.t(-2, -2, 49, 32, 12, 32, 12));
                qh.d p10 = org.telegram.messenger.y3.p(24, context, g6Var, true);
                p10.setText(LocaleController.getString(R.string.WearAuthEmojisLogIn));
                f11.addView(p10, k7.c6.t(-1, 48, 7, 12, 12, 12, 8));
                int i12 = org.telegram.ui.ActionBar.k6.f21607a7;
                o10.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(i12, g6Var));
                o10.fixNavigationBar(org.telegram.ui.ActionBar.k6.v0(i12, g6Var));
                aj1.f35206c = o10;
                o10.show();
                p10.setOnClickListener(new eg.k2(p10, i10, o10, 20));
            }
        }
    }

    @Override
    public void run(long j10) {
        kq.a0((kq) this.f36103b, (TLRPC.InputCheckPasswordSRP) this.f36104c, (TwoStepVerificationActivity) this.d, j10);
    }

    @Override
    public boolean v(py pyVar, ArrayList arrayList, CharSequence charSequence, boolean z4, boolean z10, int i10, int i11, sf1 sf1Var) {
        long j10;
        int i12;
        String str;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i13 = this.f36102a;
        Object obj = this.d;
        Object obj2 = this.f36104c;
        Object obj3 = this.f36103b;
        switch (i13) {
            case 18:
                ArrayList<MessageObject> arrayList2 = (ArrayList) obj2;
                xn xnVar = (xn) obj;
                PhotoViewer photoViewer = ((ds0) obj3).f36251b;
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
                    xn xnVar2 = new xn(i14);
                    if (topicKey.topicId != 0) {
                        bg.e.a(xnVar2, topicKey);
                    }
                    if (((LaunchActivity) photoViewer.f34439y).q0(xnVar2, true, false)) {
                        xnVar2.Ab(arrayList2);
                    } else {
                        pyVar.finishFragment();
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
                    pyVar.finishFragment();
                    if (xnVar != null) {
                        xnVar.Q7();
                        UndoView undoView = xnVar.f43356v3;
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
                py pyVar2 = (py) obj;
                long j13 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                ProfileActivity profileActivity = vz0Var.f42235b;
                i12 = ((org.telegram.ui.ActionBar.p2) profileActivity).currentAccount;
                TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-j13));
                if (chat != null && (chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.add_admins))) {
                    profileActivity.getMessagesController().checkIsInChat(false, chat, user, new e3.f(vz0Var, j13, pyVar2, 9));
                } else {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.f34714w0);
                    String string = LocaleController.getString(R.string.AddBot);
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
                    d2Var.O = string;
                    if (chat == null) {
                        str = "";
                    } else {
                        str = chat.title;
                    }
                    d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("AddMembersAlertNamesText", R.string.AddMembersAlertNamesText, UserObject.getUserName(user), str));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder.k(LocaleController.getString(R.string.AddBot), new d9.c(vz0Var, j13, pyVar, user));
                    profileActivity.showDialog(d2Var);
                }
                return true;
        }
    }

    @Override
    public boolean mo17c(float f10, float f11, int i10, final View view) {
        final g7 g7Var = (g7) this.f36103b;
        org.telegram.ui.Components.sl0 sl0Var = (org.telegram.ui.Components.sl0) this.f36104c;
        org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.d;
        u7 u7Var = g7Var.d;
        h7 h7Var = (h7) sl0Var.getAdapter();
        final o7 o7Var = (o7) h7Var.f37232e.get(i10);
        if (!(view instanceof m7) && !(view instanceof org.telegram.ui.Cells.r7)) {
            k7 k7Var = u7Var.v;
            if (k7Var != null) {
                k7Var.Y(o7Var.f39552c, o7Var.d, true);
            }
            return true;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(u7Var.getContext(), null);
        if (view instanceof org.telegram.ui.Cells.r7) {
            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_view_file, LocaleController.getString(R.string.CacheOpenFile), false, null).setOnClickListener(new oh.b0(g7Var, o7Var, h7Var, sl0Var, view, 4));
        } else if (((m7) view).f38866b.getChildAt(0) instanceof org.telegram.ui.Cells.h7) {
            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_played, LocaleController.getString(R.string.PlayFile), false, null).setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    switch (r4) {
                        case 0:
                            g7 g7Var2 = g7Var;
                            u7.b(g7Var2.d, o7Var.d, (m7) view);
                            org.telegram.ui.ActionBar.p1 p1Var = g7Var2.f37000a;
                            if (p1Var != null) {
                                p1Var.d(true);
                                return;
                            }
                            return;
                        default:
                            g7 g7Var3 = g7Var;
                            u7.b(g7Var3.d, o7Var.d, (m7) view);
                            org.telegram.ui.ActionBar.p1 p1Var2 = g7Var3.f37000a;
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
                            g7 g7Var2 = g7Var;
                            u7.b(g7Var2.d, o7Var.d, (m7) view);
                            org.telegram.ui.ActionBar.p1 p1Var = g7Var2.f37000a;
                            if (p1Var != null) {
                                p1Var.d(true);
                                return;
                            }
                            return;
                        default:
                            g7 g7Var3 = g7Var;
                            u7.b(g7Var3.d, o7Var.d, (m7) view);
                            org.telegram.ui.ActionBar.p1 p1Var2 = g7Var3.f37000a;
                            if (p1Var2 != null) {
                                p1Var2.d(true);
                                return;
                            }
                            return;
                    }
                }
            });
        }
        nh.a aVar = o7Var.d;
        if (aVar.f16246b != 0 && aVar.f16250g != 0) {
            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_viewintopic, LocaleController.getString(R.string.ViewInChat), false, null).setOnClickListener(new b0(g7Var, o7Var, p2Var, 1));
        }
        org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_select, LocaleController.getString(!u7Var.f41734f.f16258j.contains(o7Var.d) ? R.string.Select : R.string.Deselect), false, null).setOnClickListener(new org.telegram.messenger.video.g(11, g7Var, o7Var));
        g7Var.f37000a = org.telegram.ui.Components.z4.Q(p2Var, actionBarPopupWindow$ActionBarPopupWindowLayout, view, (int) f10, (int) f11);
        u7Var.getRootView().dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
        return true;
    }

    @Override
    public void run(String str) {
        xn xnVar = (xn) this.f36103b;
        org.telegram.ui.Cells.h0 h0Var = (org.telegram.ui.Cells.h0) this.f36104c;
        CharSequence charSequence = (CharSequence) this.d;
        String language = LocaleController.getInstance().getCurrentLocale().getLanguage();
        if (str != null && ((!str.equals(language) || str.equals("und")) && !t31.Y().contains(str))) {
            h0Var.setOnClickListener(new oh.b0(xnVar, str, language, charSequence, h0Var, 6));
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
    public void r0(View view, float f10, float f11) {
    }
}
