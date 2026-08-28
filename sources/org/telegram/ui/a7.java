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
public final class a7 implements org.telegram.ui.Components.pk0, org.telegram.ui.Components.cj0, org.telegram.ui.Components.x4, LanguageDetector.StringCallback, u4, org.telegram.ui.ActionBar.b2, MessagesStorage.LongCallback, org.telegram.ui.Components.nk0, MessagesController.NewMessageCallback, wx, nf1, org.telegram.ui.Components.voip.h3, OnSuccessListener {
    public final int f36370a;
    public final Object f36371b;
    public final Object f36372c;
    public final Object d;

    public a7(Object obj, Object obj2, Object obj3, int i9) {
        this.f36370a = i9;
        this.f36371b = obj;
        this.f36372c = obj2;
        this.d = obj3;
    }

    @Override
    public void B(int i9, int i10, boolean z10) {
        TL_stars.StarsAmount starsAmount;
        switch (this.f36370a) {
            case 2:
                qn qnVar = (qn) this.f36371b;
                qnVar.getClass();
                qnVar.cb((TLRPC.BotInlineResult) this.f36372c, z10, i9, ((Long) this.d).longValue());
                return;
            case 3:
            default:
                qn qnVar2 = (qn) this.f36371b;
                TLRPC.SuggestedPost suggestedPost = (TLRPC.SuggestedPost) this.f36372c;
                MessageObject messageObject = (MessageObject) this.d;
                qnVar2.getClass();
                if (z10) {
                    if (suggestedPost != null) {
                        starsAmount = suggestedPost.price;
                    } else {
                        starsAmount = null;
                    }
                    TLRPC.SuggestedPost tl = MessageSuggestionParams.of(gf.a.l(starsAmount), i9).toTl();
                    if (messageObject != null && messageObject.messageOwner != null && tl != null) {
                        qnVar2.getMessagesController().addOfferToSuggestedMessage(messageObject, tl);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                qn.Z((qn) this.f36371b, (MessageObject.GroupedMessages) this.f36372c, (MessageObject) this.d, i9, i10);
                return;
        }
    }

    @Override
    public boolean C() {
        switch (this.f36370a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean I(dy dyVar) {
        switch (this.f36370a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void a(org.telegram.ui.Components.ej0 ej0Var, int i9) {
        int i10;
        View view = (View) this.f36371b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f36372c;
        int[] iArr = (int[]) this.d;
        if (view != null) {
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            view.measure(View.MeasureSpec.makeMeasureSpec(ej0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            i10 = view.getMeasuredHeight() + AndroidUtilities.dp(8.0f);
            view.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        } else {
            i10 = 0;
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f(iArr[0], org.telegram.messenger.l0.C(52.0f, i10, i9), true);
    }

    @Override
    public void b(c5 c5Var) {
        switch (this.f36370a) {
            case 6:
                cn cnVar = (cn) this.f36371b;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f36372c;
                TLRPC.User user = (TLRPC.User) this.d;
                int ordinal = c5Var.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal == 5) {
                                cnVar.f37236a.ma(user);
                                return;
                            }
                            return;
                        }
                        cnVar.c(user);
                        return;
                    }
                    cnVar.n(t1Var, user);
                    return;
                }
                cnVar.p(user, false);
                return;
            default:
                cn cnVar2 = (cn) this.f36371b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f36372c;
                org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) this.d;
                int ordinal2 = c5Var.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1 && ordinal2 != 2) {
                        if (ordinal2 != 4) {
                            if (ordinal2 == 5) {
                                cnVar2.f37236a.ka(chat);
                                return;
                            }
                            return;
                        }
                        cnVar2.b(chat);
                        return;
                    }
                    cnVar2.k(t1Var2, chat, 0, false);
                    return;
                }
                cnVar2.o(chat);
                return;
        }
    }

    @Override
    public void c(float f10, float f11, int i9, View view) {
        o50.n((o50) this.f36371b, (Activity) this.f36372c, (ChatObject.Call) this.d, view, i9);
    }

    @Override
    public void d(org.telegram.ui.Components.voip.i3 i3Var) {
        String string;
        mh1 mh1Var = (mh1) this.f36371b;
        VoIPService voIPService = (VoIPService) this.f36372c;
        org.telegram.ui.Components.voip.j3 j3Var = (org.telegram.ui.Components.voip.j3) this.d;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            AndroidUtilities.cancelRunOnUIThread(mh1Var.O0);
            mh1Var.N0 = false;
            if (mh1Var.f40462s0.isTouchExplorationEnabled()) {
                if (voIPService.isFrontFaceCamera()) {
                    string = LocaleController.getString(R.string.AccDescrVoipCamSwitchedToBack);
                } else {
                    string = LocaleController.getString(R.string.AccDescrVoipCamSwitchedToFront);
                }
                i3Var.announceForAccessibility(string);
            }
            j3Var.d(2, !voIPService.isFrontFaceCamera(), false);
            sharedInstance.switchCamera();
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        String str;
        int i10;
        boolean z10;
        int i11 = this.f36370a;
        Object obj = this.d;
        Object obj2 = this.f36372c;
        Object obj3 = this.f36371b;
        switch (i11) {
            case 8:
                so soVar = (so) obj3;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) obj2;
                View view = (View) obj;
                vo voVar = soVar.f42737a.W2;
                if (tL_username.editable) {
                    if (voVar.f43543o0 == null) {
                        voVar.f43543o0 = Boolean.valueOf(tL_username.active);
                    }
                    tL_username.active = !tL_username.active;
                } else {
                    TLRPC.TL_channels_toggleUsername tL_channels_toggleUsername = new TLRPC.TL_channels_toggleUsername();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    TLRPC.Chat chat = voVar.T;
                    tL_inputChannel.channel_id = chat.f22380id;
                    tL_inputChannel.access_hash = chat.access_hash;
                    tL_channels_toggleUsername.channel = tL_inputChannel;
                    tL_channels_toggleUsername.username = tL_username.username;
                    boolean z11 = tL_username.active;
                    tL_channels_toggleUsername.active = !z11;
                    voVar.getConnectionsManager().sendRequest(tL_channels_toggleUsername, new kh.t1(soVar, tL_channels_toggleUsername, tL_username, z11, 3));
                    voVar.L.add(tL_username.username);
                    ((ja) view).setLoading(true);
                }
                voVar.U();
                return;
            case 9:
                hp hpVar = (hp) obj3;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                hpVar.getClass();
                if (((TLRPC.ChatFull) obj2).hidden_prehistory) {
                    hpVar.getMessagesController().toggleChannelInvitesHistory(chat2.f22380id, false);
                }
                hpVar.X(chat2, null);
                return;
            case 10:
            case 14:
            case 17:
            case 18:
            case 19:
            case 20:
            default:
                xa1 xa1Var = (xa1) obj3;
                if (org.telegram.ui.ActionBar.f6.j0(((za1) obj2).d, (org.telegram.ui.ActionBar.d6) obj, true)) {
                    org.telegram.ui.ActionBar.f6.n1(false, false);
                    NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                    int i12 = NotificationCenter.needSetDayNightTheme;
                    if (xa1Var.f44444e.f36234f == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    globalInstance.lambda$postNotificationNameOnUIThread$1(i12, org.telegram.ui.ActionBar.f6.I, Boolean.valueOf(z10), null, -1);
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
                contactsActivity.m0(user, false, str);
                return;
            case 12:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) obj3;
                SharedConfig.storageCacheDir = (String) obj2;
                SharedConfig.saveConfig();
                SharedConfig.readOnlyStorageDirAlertShowed = false;
                dataSettingsActivity.m0(dataSettingsActivity.f35459n);
                ImageLoader.getInstance().checkMediaPaths(new yt(dataSettingsActivity, 2));
                ((AlertDialog$Builder) obj).f22702a.H0.run();
                return;
            case 13:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj2;
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                ((AlertDialog$Builder) obj).f22702a.H0.run();
                lz lzVar = ((jz) obj3).A.f39948c;
                lzVar.d.title = editTextBoldCursor.getText().toString();
                lzVar.c0(true);
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = lzVar.d;
                if (lzVar.B != 0) {
                    lzVar.getConnectionsManager().cancelRequest(lzVar.B, true);
                    lzVar.B = 0;
                }
                TL_chatlists.TL_chatlists_editExportedInvite tL_chatlists_editExportedInvite = new TL_chatlists.TL_chatlists_editExportedInvite();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_editExportedInvite.chatlist = tL_inputChatlistDialogFilter;
                tL_inputChatlistDialogFilter.filter_id = lzVar.f40255c.f19649id;
                tL_chatlists_editExportedInvite.slug = lzVar.a0();
                tL_chatlists_editExportedInvite.revoked = tL_exportedChatlistInvite.revoked;
                tL_chatlists_editExportedInvite.flags = 2 | tL_chatlists_editExportedInvite.flags;
                tL_chatlists_editExportedInvite.title = tL_exportedChatlistInvite.title;
                lzVar.B = lzVar.getConnectionsManager().sendRequest(tL_chatlists_editExportedInvite, new az(lzVar, 0));
                Utilities.Callback callback = lzVar.f40263y;
                if (callback != null) {
                    callback.run(tL_exportedChatlistInvite);
                    return;
                }
                return;
            case 15:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) obj2;
                AndroidUtilities.hideKeyboard(editTextBoldCursor2);
                ((r40) obj3).f42265b.W0.setTitle(editTextBoldCursor2.getText().toString());
                ((AlertDialog$Builder) obj).f22702a.H0.run();
                return;
            case 16:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj3;
                notificationsSettingsActivity.getClass();
                notificationsSettingsActivity.presentFragment(new NotificationsCustomSettingsActivity(-1, (ArrayList) obj2, (ArrayList) obj, false));
                return;
            case 21:
                h71 h71Var = (h71) obj2;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) obj;
                TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
                resetauthorization.hash = tL_authorization.hash;
                i10 = ((org.telegram.ui.ActionBar.o2) h71Var.f38695a).currentAccount;
                ConnectionsManager.getInstance(i10).sendRequest(resetauthorization, new v40(27, h71Var, tL_authorization));
                ((w61) obj3).d.dismiss();
                return;
        }
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public void h(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((l61) this.f36371b).S((TLRPC.User) this.f36372c, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.d);
    }

    @Override
    public boolean onMessageReceived(TLRPC.Message message) {
        co0 co0Var = (co0) this.f36371b;
        org.telegram.ui.ActionBar.b5 b5Var = (org.telegram.ui.ActionBar.b5) this.f36372c;
        Activity activity = (Activity) this.d;
        if (MessageObject.getPeerId(message.peer_id) == co0Var.f37259h0.f22527id && (message.action instanceof TLRPC.TL_messageActionPaymentSent)) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.no0(co0Var, b5Var, activity, message, 25));
            return true;
        }
        return false;
    }

    @Override
    public void onSuccess(Object obj) {
        org.telegram.ui.ActionBar.b6 b6Var;
        float f10;
        b3.b bVar = (b3.b) this.f36371b;
        Integer num = (Integer) obj;
        FileLog.d("wear-auth: /answer delivered to " + ((String) bVar.f1415c));
        ((kh.d) this.f36372c).setLoading(false);
        int i9 = ((int[]) this.d)[0];
        ArrayList arrayList = (ArrayList) bVar.f1416e;
        if (arrayList != null && !arrayList.isEmpty()) {
            Context context = LaunchActivity.C1;
            if (context == null) {
                context = ApplicationLoader.applicationContext;
            }
            if (context != null) {
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    b6Var = U.getResourceProvider();
                } else {
                    b6Var = null;
                }
                org.telegram.ui.ActionBar.f3 f3Var = di1.f37553c;
                if (f3Var != null) {
                    f3Var.dismiss();
                    di1.f37553c = null;
                }
                org.telegram.ui.ActionBar.f3 j10 = org.telegram.messenger.ll.j(context, b6Var, false, false);
                FrameLayout frameLayout = new FrameLayout(context);
                j10.customView = frameLayout;
                LinearLayout f11 = org.telegram.messenger.ll.f(context, 1);
                frameLayout.addView(f11, g7.e6.e(-1, -1, 119));
                TextView b10 = g7.i6.b(context, 20.0f, org.telegram.ui.ActionBar.f6.f23108j5, true, b6Var);
                b10.setGravity(17);
                b10.setText(LocaleController.getString(R.string.WearAuthEmojis));
                f11.addView(b10, g7.e6.r(-1, -2, 49, 32.0f, 24.0f, 32.0f, 9.66f));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    Drawable emojiBigDrawable = Emoji.getEmojiBigDrawable((String) arrayList.get(i10));
                    ImageView imageView = new ImageView(context);
                    imageView.setImageDrawable(emojiBigDrawable);
                    NotificationCenter.listenEmojiLoading(imageView);
                    imageView.setBackground(org.telegram.ui.ActionBar.f6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.f6.l1(0.15f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, b6Var))));
                    if (i10 == 0) {
                        f10 = 0.0f;
                    } else {
                        f10 = 5.0f;
                    }
                    linearLayout.addView(imageView, g7.e6.k(f10, 0.0f, 0.0f, 0.0f, 80, 80));
                }
                f11.addView(linearLayout, g7.e6.t(-2, -2, 49, 32, 12, 32, 12));
                kh.d i11 = org.telegram.messenger.ll.i(24, context, b6Var, true);
                i11.setText(LocaleController.getString(R.string.WearAuthEmojisLogIn));
                f11.addView(i11, g7.e6.t(-1, 48, 7, 12, 12, 12, 8));
                int i12 = org.telegram.ui.ActionBar.f6.f22947a7;
                j10.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(i12, b6Var));
                j10.fixNavigationBar(org.telegram.ui.ActionBar.f6.v0(i12, b6Var));
                di1.f37553c = j10;
                j10.show();
                i11.setOnClickListener(new fh.a3(i11, i9, j10, 19));
            }
        }
    }

    @Override
    public void run(long j10) {
        bq.Z((bq) this.f36371b, (TLRPC.InputCheckPasswordSRP) this.f36372c, (TwoStepVerificationActivity) this.d, j10);
    }

    @Override
    public boolean v(dy dyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i9, int i10, we1 we1Var) {
        long j10;
        int i11;
        String str;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i12 = this.f36370a;
        Object obj = this.d;
        Object obj2 = this.f36372c;
        Object obj3 = this.f36371b;
        switch (i12) {
            case 18:
                ArrayList<MessageObject> arrayList2 = (ArrayList) obj2;
                qn qnVar = (qn) obj;
                PhotoViewer photoViewer = ((pr0) obj3).f41587b;
                if (arrayList.size() <= 1 && ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId != UserConfig.getInstance(photoViewer.P).getClientUserId() && charSequence == null) {
                    MessagesStorage.TopicKey topicKey = (MessagesStorage.TopicKey) arrayList.get(0);
                    long j11 = topicKey.dialogId;
                    Bundle i13 = aa.d.i("scrollToTopOnResume", true);
                    if (DialogObject.isEncryptedDialog(j11)) {
                        i13.putInt("enc_id", DialogObject.getEncryptedChatId(j11));
                    } else if (DialogObject.isUserDialog(j11)) {
                        i13.putLong("user_id", j11);
                    } else {
                        i13.putLong("chat_id", -j11);
                    }
                    qn qnVar2 = new qn(i13);
                    if (topicKey.topicId != 0) {
                        vf.c.a(qnVar2, topicKey);
                    }
                    if (((LaunchActivity) photoViewer.f35797y).q0(qnVar2, true, false)) {
                        qnVar2.Ab(arrayList2);
                    } else {
                        dyVar.finishFragment();
                    }
                } else {
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        long j12 = ((MessagesStorage.TopicKey) arrayList.get(i14)).dialogId;
                        if (charSequence != null) {
                            j10 = j12;
                            SendMessagesHelper.getInstance(photoViewer.P).sendMessage(SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
                        } else {
                            j10 = j12;
                        }
                        SendMessagesHelper.getInstance(photoViewer.P).sendMessage(arrayList2, j10, false, false, true, 0, 0L);
                    }
                    dyVar.finishFragment();
                    if (qnVar != null) {
                        qnVar.Q7();
                        UndoView undoView = qnVar.f42093u3;
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
                dz0 dz0Var = (dz0) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                dy dyVar2 = (dy) obj;
                long j13 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                ProfileActivity profileActivity = dz0Var.f37761b;
                i11 = ((org.telegram.ui.ActionBar.o2) profileActivity).currentAccount;
                TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-j13));
                if (chat != null && (chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.add_admins))) {
                    profileActivity.getMessagesController().checkIsInChat(false, chat, user, new b9.a(dz0Var, j13, dyVar2, 10));
                } else {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.f36064v0);
                    String string = LocaleController.getString(R.string.AddBot);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                    c2Var.N = string;
                    if (chat == null) {
                        str = "";
                    } else {
                        str = chat.title;
                    }
                    c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("AddMembersAlertNamesText", R.string.AddMembersAlertNamesText, UserObject.getUserName(user), str));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder.k(LocaleController.getString(R.string.AddBot), new c3.g(dz0Var, j13, dyVar, user));
                    profileActivity.showDialog(c2Var);
                }
                return true;
        }
    }

    @Override
    public boolean mo5c(float f10, float f11, int i9, final View view) {
        final d7 d7Var = (d7) this.f36371b;
        org.telegram.ui.Components.wk0 wk0Var = (org.telegram.ui.Components.wk0) this.f36372c;
        org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.d;
        r7 r7Var = d7Var.d;
        e7 e7Var = (e7) wk0Var.getAdapter();
        final l7 l7Var = (l7) e7Var.f37834e.get(i9);
        if (!(view instanceof j7) && !(view instanceof org.telegram.ui.Cells.r7)) {
            h7 h7Var = r7Var.v;
            if (h7Var != null) {
                h7Var.o1(l7Var.f40070c, l7Var.d, true);
            }
            return true;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(r7Var.getContext(), null);
        if (view instanceof org.telegram.ui.Cells.r7) {
            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_view_file, LocaleController.getString(R.string.CacheOpenFile), false, null).setOnClickListener(new ih.d0(d7Var, l7Var, e7Var, wk0Var, view, 4));
        } else if (((j7) view).f39387b.getChildAt(0) instanceof org.telegram.ui.Cells.h7) {
            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_played, LocaleController.getString(R.string.PlayFile), false, null).setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    switch (r4) {
                        case 0:
                            d7 d7Var2 = d7Var;
                            r7.b(d7Var2.d, l7Var.d, (j7) view);
                            org.telegram.ui.ActionBar.o1 o1Var = d7Var2.f37425a;
                            if (o1Var != null) {
                                o1Var.d(true);
                                return;
                            }
                            return;
                        default:
                            d7 d7Var3 = d7Var;
                            r7.b(d7Var3.d, l7Var.d, (j7) view);
                            org.telegram.ui.ActionBar.o1 o1Var2 = d7Var3.f37425a;
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
                            d7 d7Var2 = d7Var;
                            r7.b(d7Var2.d, l7Var.d, (j7) view);
                            org.telegram.ui.ActionBar.o1 o1Var = d7Var2.f37425a;
                            if (o1Var != null) {
                                o1Var.d(true);
                                return;
                            }
                            return;
                        default:
                            d7 d7Var3 = d7Var;
                            r7.b(d7Var3.d, l7Var.d, (j7) view);
                            org.telegram.ui.ActionBar.o1 o1Var2 = d7Var3.f37425a;
                            if (o1Var2 != null) {
                                o1Var2.d(true);
                                return;
                            }
                            return;
                    }
                }
            });
        }
        hh.a aVar = l7Var.d;
        if (aVar.f10781b != 0 && aVar.f10785g != 0) {
            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_viewintopic, LocaleController.getString(R.string.ViewInChat), false, null).setOnClickListener(new b0(d7Var, l7Var, o2Var, 1));
        }
        org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_select, LocaleController.getString(!r7Var.f42294f.f10793j.contains(l7Var.d) ? R.string.Select : R.string.Deselect), false, null).setOnClickListener(new mh.k3(13, d7Var, l7Var));
        d7Var.f37425a = org.telegram.ui.Components.y4.Q(o2Var, actionBarPopupWindow$ActionBarPopupWindowLayout, view, (int) f10, (int) f11);
        r7Var.getRootView().dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
        return true;
    }

    @Override
    public void run(String str) {
        qn qnVar = (qn) this.f36371b;
        org.telegram.ui.Cells.h0 h0Var = (org.telegram.ui.Cells.h0) this.f36372c;
        CharSequence charSequence = (CharSequence) this.d;
        String language = LocaleController.getInstance().getCurrentLocale().getLanguage();
        if (str != null && ((!str.equals(language) || str.equals("und")) && !b31.X().contains(str))) {
            h0Var.setOnClickListener(new ih.d0(qnVar, str, language, charSequence, h0Var, 6));
        } else {
            h0Var.setClickable(false);
        }
    }

    @Override
    public void j() {
    }

    @Override
    public void u(float f10) {
    }

    @Override
    public void g0(View view, float f10, float f11) {
    }
}
