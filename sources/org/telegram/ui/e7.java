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
public final class e7 implements org.telegram.ui.Components.cm0, org.telegram.ui.Components.nk0, org.telegram.ui.Components.e5, LanguageDetector.StringCallback, y4, org.telegram.ui.ActionBar.b2, MessagesStorage.LongCallback, org.telegram.ui.Components.am0, MessagesController.NewMessageCallback, ux, qf1, org.telegram.ui.Components.voip.j3, OnSuccessListener {
    public final int f39006a;
    public final Object f39007b;
    public final Object f39008c;
    public final Object d;

    public e7(Object obj, Object obj2, Object obj3, int i10) {
        this.f39006a = i10;
        this.f39007b = obj;
        this.f39008c = obj2;
        this.d = obj3;
    }

    @Override
    public boolean C() {
        switch (this.f39006a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void G(int i10, int i11, boolean z10) {
        TL_stars.StarsAmount starsAmount;
        switch (this.f39006a) {
            case 2:
                un unVar = (un) this.f39007b;
                unVar.getClass();
                unVar.mb((TLRPC.BotInlineResult) this.f39008c, z10, i10, ((Long) this.d).longValue());
                return;
            case 3:
            default:
                un unVar2 = (un) this.f39007b;
                TLRPC.SuggestedPost suggestedPost = (TLRPC.SuggestedPost) this.f39008c;
                MessageObject messageObject = (MessageObject) this.d;
                unVar2.getClass();
                if (z10) {
                    if (suggestedPost != null) {
                        starsAmount = suggestedPost.price;
                    } else {
                        starsAmount = null;
                    }
                    TLRPC.SuggestedPost tl = MessageSuggestionParams.of(bg.a.l(starsAmount), i10).toTl();
                    if (messageObject != null && messageObject.messageOwner != null && tl != null) {
                        unVar2.getMessagesController().addOfferToSuggestedMessage(messageObject, tl);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                un.h1((un) this.f39007b, (MessageObject.GroupedMessages) this.f39008c, (MessageObject) this.d, i10, i11);
                return;
        }
    }

    @Override
    public boolean K(cy cyVar) {
        switch (this.f39006a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void a(org.telegram.ui.Components.pk0 pk0Var, int i10) {
        int i11;
        View view = (View) this.f39007b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f39008c;
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
        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f(iArr[0], org.telegram.messenger.t.D(52.0f, i11, i10), true);
    }

    @Override
    public void b(g5 g5Var) {
        switch (this.f39006a) {
            case 6:
                fn fnVar = (fn) this.f39007b;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.f39008c;
                TLRPC.User user = (TLRPC.User) this.d;
                int ordinal = g5Var.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal == 5) {
                                fnVar.f39420a.wa(user);
                                return;
                            }
                            return;
                        }
                        fnVar.b(user);
                        return;
                    }
                    fnVar.t(s1Var, user);
                    return;
                }
                fnVar.y(user, false);
                return;
            default:
                fn fnVar2 = (fn) this.f39007b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f39008c;
                org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) this.d;
                int ordinal2 = g5Var.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1 && ordinal2 != 2) {
                        if (ordinal2 != 4) {
                            if (ordinal2 == 5) {
                                fnVar2.f39420a.ua(chat);
                                return;
                            }
                            return;
                        }
                        fnVar2.a(chat);
                        return;
                    }
                    fnVar2.o(s1Var2, chat, 0, false);
                    return;
                }
                fnVar2.w(chat);
                return;
        }
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public void d(org.telegram.ui.Components.voip.k3 k3Var) {
        String string;
        ph1 ph1Var = (ph1) this.f39007b;
        VoIPService voIPService = (VoIPService) this.f39008c;
        org.telegram.ui.Components.voip.l3 l3Var = (org.telegram.ui.Components.voip.l3) this.d;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            AndroidUtilities.cancelRunOnUIThread(ph1Var.S0);
            ph1Var.R0 = false;
            if (ph1Var.f42548w0.isTouchExplorationEnabled()) {
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
    public void e(float f7, float f10, int i10, View view) {
        v50.n((v50) this.f39007b, (Activity) this.f39008c, (ChatObject.Call) this.d, view, i10);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        String str;
        int i11;
        switch (this.f39006a) {
            case 8:
                xo xoVar = (xo) this.f39007b;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.f39008c;
                View view = (View) this.d;
                ap apVar = xoVar.f45815a.f46338i3;
                if (tL_username.editable) {
                    if (apVar.f37863r0 == null) {
                        apVar.f37863r0 = Boolean.valueOf(tL_username.active);
                    }
                    tL_username.active = !tL_username.active;
                } else {
                    TLRPC.TL_channels_toggleUsername tL_channels_toggleUsername = new TLRPC.TL_channels_toggleUsername();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    TLRPC.Chat chat = apVar.X;
                    tL_inputChannel.channel_id = chat.f22027id;
                    tL_inputChannel.access_hash = chat.access_hash;
                    tL_channels_toggleUsername.channel = tL_inputChannel;
                    tL_channels_toggleUsername.username = tL_username.username;
                    boolean z10 = tL_username.active;
                    tL_channels_toggleUsername.active = !z10;
                    apVar.getConnectionsManager().sendRequest(tL_channels_toggleUsername, new bi.d4(xoVar, tL_channels_toggleUsername, tL_username, z10, 4));
                    apVar.P.add(tL_username.username);
                    ((qa) view).setLoading(true);
                }
                apVar.X();
                return;
            case 9:
                np npVar = (np) this.f39007b;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                npVar.getClass();
                if (((TLRPC.ChatFull) this.f39008c).hidden_prehistory) {
                    npVar.getMessagesController().toggleChannelInvitesHistory(chat2.f22027id, false);
                }
                npVar.Z(chat2, null);
                return;
            case 10:
            case 14:
            case 17:
            case 18:
            case 19:
            case 20:
            default:
                bb1 bb1Var = (bb1) this.f39007b;
                boolean z11 = true;
                if (org.telegram.ui.ActionBar.y6.k0(((db1) this.f39008c).d, (org.telegram.ui.ActionBar.w6) this.d, true)) {
                    org.telegram.ui.ActionBar.y6.q1(false, false);
                    org.telegram.ui.ActionBar.x6 x6Var = org.telegram.ui.ActionBar.y6.I;
                    if (bb1Var.e.f36268f != 1) {
                        z11 = false;
                    }
                    org.telegram.ui.ActionBar.y6.H1(x6Var, z11, -1, null);
                    return;
                }
                return;
            case 11:
                ContactsActivity contactsActivity = (ContactsActivity) this.f39007b;
                TLRPC.User user = (TLRPC.User) this.f39008c;
                EditText editText = (EditText) this.d;
                if (editText != null) {
                    contactsActivity.getClass();
                    str = editText.getText().toString();
                } else {
                    str = "0";
                }
                contactsActivity.h0(user, false, str);
                return;
            case 12:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) this.f39007b;
                SharedConfig.storageCacheDir = (String) this.f39008c;
                SharedConfig.saveConfig();
                SharedConfig.readOnlyStorageDirAlertShowed = false;
                dataSettingsActivity.o0(dataSettingsActivity.f35489n);
                ImageLoader.getInstance().checkMediaPaths(new wt(dataSettingsActivity, 2));
                ((AlertDialog$Builder) this.d).f22366a.N0.run();
                return;
            case 13:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f39008c;
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                ((AlertDialog$Builder) this.d).f22366a.N0.run();
                lz lzVar = ((jz) this.f39007b).E.f41088c;
                lzVar.d.title = editTextBoldCursor.getText().toString();
                lzVar.e0(true);
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = lzVar.d;
                if (lzVar.E != 0) {
                    lzVar.getConnectionsManager().cancelRequest(lzVar.E, true);
                    lzVar.E = 0;
                }
                TL_chatlists.TL_chatlists_editExportedInvite tL_chatlists_editExportedInvite = new TL_chatlists.TL_chatlists_editExportedInvite();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_editExportedInvite.chatlist = tL_inputChatlistDialogFilter;
                tL_inputChatlistDialogFilter.filter_id = lzVar.f41402c.f19549id;
                tL_chatlists_editExportedInvite.slug = lzVar.c0();
                tL_chatlists_editExportedInvite.revoked = tL_exportedChatlistInvite.revoked;
                tL_chatlists_editExportedInvite.flags |= 2;
                tL_chatlists_editExportedInvite.title = tL_exportedChatlistInvite.title;
                lzVar.E = lzVar.getConnectionsManager().sendRequest(tL_chatlists_editExportedInvite, new az(lzVar, 1));
                Utilities.Callback callback = lzVar.f41408x;
                if (callback != null) {
                    callback.run(tL_exportedChatlistInvite);
                    return;
                }
                return;
            case 15:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) this.f39008c;
                AndroidUtilities.hideKeyboard(editTextBoldCursor2);
                ((y40) this.f39007b).f45951b.f44607a1.setTitle(editTextBoldCursor2.getText().toString());
                ((AlertDialog$Builder) this.d).f22366a.N0.run();
                return;
            case 16:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.f39007b;
                notificationsSettingsActivity.getClass();
                notificationsSettingsActivity.presentFragment(new NotificationsCustomSettingsActivity(-1, (ArrayList) this.f39008c, (ArrayList) this.d, false));
                return;
            case 21:
                j71 j71Var = (j71) this.f39008c;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) this.d;
                TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
                resetauthorization.hash = tL_authorization.hash;
                i11 = ((org.telegram.ui.ActionBar.r2) j71Var.f40474a).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(resetauthorization, new j10(29, j71Var, tL_authorization));
                ((x61) this.f39007b).d.dismiss();
                return;
        }
    }

    @Override
    public void j(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((m61) this.f39007b).T((TLRPC.User) this.f39008c, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.d);
    }

    @Override
    public boolean onMessageReceived(TLRPC.Message message) {
        po0 po0Var = (po0) this.f39007b;
        org.telegram.ui.ActionBar.j5 j5Var = (org.telegram.ui.ActionBar.j5) this.f39008c;
        Activity activity = (Activity) this.d;
        if (MessageObject.getPeerId(message.peer_id) == po0Var.f42604l0.f22174id && (message.action instanceof TLRPC.TL_messageActionPaymentSent)) {
            AndroidUtilities.runOnUIThread(new ag0(po0Var, j5Var, activity, message, 3));
            return true;
        }
        return false;
    }

    @Override
    public void onSuccess(Object obj) {
        org.telegram.ui.ActionBar.u6 u6Var;
        float f7;
        a8.me meVar = (a8.me) this.f39007b;
        Integer num = (Integer) obj;
        FileLog.d("wear-auth: /answer delivered to " + ((String) meVar.f616c));
        ((fi.d) this.f39008c).setLoading(false);
        int i10 = ((int[]) this.d)[0];
        ArrayList arrayList = (ArrayList) meVar.e;
        if (arrayList != null && !arrayList.isEmpty()) {
            Context context = LaunchActivity.I1;
            if (context == null) {
                context = ApplicationLoader.applicationContext;
            }
            if (context != null) {
                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                if (U != null) {
                    u6Var = U.getResourceProvider();
                } else {
                    u6Var = null;
                }
                org.telegram.ui.ActionBar.k3 k3Var = ii1.f40249c;
                if (k3Var != null) {
                    k3Var.dismiss();
                    ii1.f40249c = null;
                }
                org.telegram.ui.ActionBar.k3 i11 = org.telegram.messenger.vh.i(1, context, u6Var, false);
                FrameLayout frameLayout = new FrameLayout(context);
                i11.customView = frameLayout;
                LinearLayout d = org.telegram.messenger.vh.d(context, 1);
                frameLayout.addView(d, org.telegram.ui.Components.gb1.i(-1, -1, 119));
                TextView L = org.telegram.ui.Components.gb1.L(context, 20.0f, org.telegram.ui.ActionBar.y6.f23462j5, true, u6Var);
                L.setGravity(17);
                L.setText(LocaleController.getString(R.string.WearAuthEmojis));
                d.addView(L, org.telegram.ui.Components.gb1.v(-1, -2, 49, 32.0f, 24.0f, 32.0f, 9.66f));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    Drawable emojiBigDrawable = Emoji.getEmojiBigDrawable((String) arrayList.get(i12));
                    ImageView imageView = new ImageView(context);
                    imageView.setImageDrawable(emojiBigDrawable);
                    NotificationCenter.listenEmojiLoading(imageView);
                    int dp = AndroidUtilities.dp(80.0f);
                    int i13 = org.telegram.ui.ActionBar.y6.Oh;
                    ShapeDrawable K = org.telegram.ui.ActionBar.y6.K(dp, org.telegram.ui.ActionBar.y6.o1(0.15f, org.telegram.ui.ActionBar.y6.w0(i13, u6Var)));
                    org.telegram.ui.ActionBar.b7 L2 = org.telegram.ui.ActionBar.f7.L(0.15f, i13);
                    imageView.setBackground(K);
                    org.telegram.ui.ActionBar.f7.k(imageView, K, L2, null, u6Var);
                    if (i12 == 0) {
                        f7 = 0.0f;
                    } else {
                        f7 = 5.0f;
                    }
                    linearLayout.addView(imageView, org.telegram.ui.Components.gb1.o(f7, 0.0f, 0.0f, 0.0f, 80, 80));
                }
                d.addView(linearLayout, org.telegram.ui.Components.gb1.x(-2, -2, 49, 32, 12, 32, 12));
                fi.d f10 = org.telegram.messenger.vh.f(24, context, u6Var, true);
                f10.setText(LocaleController.getString(R.string.WearAuthEmojisLogIn));
                d.addView(f10, org.telegram.ui.Components.gb1.x(-1, 48, 7, 12, 12, 12, 8));
                int i14 = org.telegram.ui.ActionBar.y6.f23297a7;
                i11.setBackgroundColorKey(i14);
                i11.fixNavigationBarKey(i14);
                ii1.f40249c = i11;
                i11.show();
                f10.setOnClickListener(new bi.pa(f10, i10, i11, 20));
            }
        }
    }

    @Override
    public void run(long j10) {
        gq.b0((gq) this.f39007b, (TLRPC.InputCheckPasswordSRP) this.f39008c, (TwoStepVerificationActivity) this.d, j10);
    }

    @Override
    public boolean v(cy cyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, af1 af1Var) {
        long j10;
        int i12;
        String str;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i13 = this.f39006a;
        Object obj = this.d;
        Object obj2 = this.f39008c;
        Object obj3 = this.f39007b;
        switch (i13) {
            case 18:
                ArrayList<MessageObject> arrayList2 = (ArrayList) obj2;
                un unVar = (un) obj;
                PhotoViewer photoViewer = ((fs0) obj3).f39440b;
                if (arrayList.size() <= 1 && ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId != UserConfig.getInstance(photoViewer.T).getClientUserId() && charSequence == null) {
                    MessagesStorage.TopicKey topicKey = (MessagesStorage.TopicKey) arrayList.get(0);
                    long j11 = topicKey.dialogId;
                    Bundle i14 = a1.g.i("scrollToTopOnResume", true);
                    if (DialogObject.isEncryptedDialog(j11)) {
                        i14.putInt("enc_id", DialogObject.getEncryptedChatId(j11));
                    } else if (DialogObject.isUserDialog(j11)) {
                        i14.putLong("user_id", j11);
                    } else {
                        i14.putLong("chat_id", -j11);
                    }
                    un unVar2 = new un(i14);
                    if (topicKey.topicId != 0) {
                        pg.d.a(unVar2, topicKey);
                    }
                    if (((LaunchActivity) photoViewer.f35822y).v0(unVar2, true, false)) {
                        unVar2.Mb(arrayList2);
                    } else {
                        cyVar.finishFragment();
                    }
                } else {
                    for (int i15 = 0; i15 < arrayList.size(); i15++) {
                        long j12 = ((MessagesStorage.TopicKey) arrayList.get(i15)).dialogId;
                        if (charSequence != null) {
                            j10 = j12;
                            SendMessagesHelper.getInstance(photoViewer.T).sendMessage(SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
                        } else {
                            j10 = j12;
                        }
                        SendMessagesHelper.getInstance(photoViewer.T).sendMessage(arrayList2, j10, false, false, true, 0, 0L);
                    }
                    cyVar.finishFragment();
                    if (unVar != null) {
                        unVar.X7();
                        UndoView undoView = unVar.K3;
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
                rz0 rz0Var = (rz0) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                cy cyVar2 = (cy) obj;
                long j13 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                ProfileActivity profileActivity = rz0Var.f43312b;
                i12 = ((org.telegram.ui.ActionBar.r2) profileActivity).currentAccount;
                TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-j13));
                if (chat != null && (chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.add_admins))) {
                    profileActivity.getMessagesController().checkIsInChat(false, chat, user, new bi.i(rz0Var, j13, cyVar2, 8));
                } else {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.f36123z0);
                    String string = LocaleController.getString(R.string.AddBot);
                    org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22366a;
                    e2Var.R = string;
                    if (chat == null) {
                        str = "";
                    } else {
                        str = chat.title;
                    }
                    e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AddMembersAlertNamesText", R.string.AddMembersAlertNamesText, UserObject.getUserName(user), str));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder.k(LocaleController.getString(R.string.AddBot), new ag.j0(rz0Var, j13, cyVar, user, 5));
                    profileActivity.showDialog(e2Var);
                }
                return true;
        }
    }

    @Override
    public boolean mo17e(float f7, float f10, int i10, final View view) {
        final h7 h7Var = (h7) this.f39007b;
        org.telegram.ui.Components.mm0 mm0Var = (org.telegram.ui.Components.mm0) this.f39008c;
        c7 c7Var = (c7) this.d;
        x7 x7Var = h7Var.f39915f;
        j7 j7Var = (j7) mm0Var.getAdapter();
        final q7 q7Var = (q7) j7Var.e.get(i10);
        if (!(view instanceof o7) && !(view instanceof org.telegram.ui.Cells.w7)) {
            m7 m7Var = x7Var.F;
            if (m7Var != null) {
                m7Var.q(q7Var.f42752c, q7Var.d, true);
            }
            return true;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(x7Var.getContext(), null);
        if (view instanceof org.telegram.ui.Cells.w7) {
            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_view_file, LocaleController.getString(R.string.CacheOpenFile), false, null).setOnClickListener(new di.e0(h7Var, q7Var, j7Var, mm0Var, view, 5));
        } else if (((o7) view).f42107b.getChildAt(0) instanceof org.telegram.ui.Cells.n7) {
            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_played, LocaleController.getString(R.string.PlayFile), false, null).setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    switch (r4) {
                        case 0:
                            h7 h7Var2 = h7Var;
                            x7.b(h7Var2.f39915f, q7Var.d, (o7) view);
                            org.telegram.ui.ActionBar.o1 o1Var = h7Var2.f39912a;
                            if (o1Var != null) {
                                o1Var.d(true);
                                return;
                            }
                            return;
                        default:
                            h7 h7Var3 = h7Var;
                            x7.b(h7Var3.f39915f, q7Var.d, (o7) view);
                            org.telegram.ui.ActionBar.o1 o1Var2 = h7Var3.f39912a;
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
                            h7 h7Var2 = h7Var;
                            x7.b(h7Var2.f39915f, q7Var.d, (o7) view);
                            org.telegram.ui.ActionBar.o1 o1Var = h7Var2.f39912a;
                            if (o1Var != null) {
                                o1Var.d(true);
                                return;
                            }
                            return;
                        default:
                            h7 h7Var3 = h7Var;
                            x7.b(h7Var3.f39915f, q7Var.d, (o7) view);
                            org.telegram.ui.ActionBar.o1 o1Var2 = h7Var3.f39912a;
                            if (o1Var2 != null) {
                                o1Var2.d(true);
                                return;
                            }
                            return;
                    }
                }
            });
        }
        ci.a aVar = q7Var.d;
        if (aVar.f6365b != 0 && aVar.f6368g != 0) {
            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_viewintopic, LocaleController.getString(R.string.ViewInChat), false, null).setOnClickListener(new z(h7Var, q7Var, c7Var, 1));
        }
        org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_select, LocaleController.getString(!x7Var.h.f6375j.contains(q7Var.d) ? R.string.Select : R.string.Deselect), false, null).setOnClickListener(new org.telegram.ui.ActionBar.u1(6, h7Var, q7Var));
        h7Var.f39912a = org.telegram.ui.Components.g5.P(c7Var, actionBarPopupWindow$ActionBarPopupWindowLayout, view, (int) f7, (int) f10);
        x7Var.getRootView().dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
        return true;
    }

    @Override
    public void run(String str) {
        un unVar = (un) this.f39007b;
        org.telegram.ui.Cells.g0 g0Var = (org.telegram.ui.Cells.g0) this.f39008c;
        CharSequence charSequence = (CharSequence) this.d;
        String language = LocaleController.getInstance().getCurrentLocale().getLanguage();
        if (str != null && ((!str.equals(language) || str.equals("und")) && !y21.Z().contains(str))) {
            g0Var.setOnClickListener(new di.e0(unVar, str, language, charSequence, g0Var, 7));
        } else {
            g0Var.setClickable(false);
        }
    }

    @Override
    public void g() {
    }

    @Override
    public void o(float f7) {
    }

    @Override
    public void l0(View view, float f7, float f10) {
    }
}
