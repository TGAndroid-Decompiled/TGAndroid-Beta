package org.telegram.ui;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.Pair;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.collection.LongSparseArray;
import com.android.billingclient.api.zzcl;
import com.google.android.exoplayer2.MediaSourceList;
import com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.MediaSource$MediaPeriodId;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLoadOperation;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline0;
import org.telegram.messenger.FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline1;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.EmojiView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.emojiview.FoundStickerPackButton;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public final class ChatActivity$$ExternalSyntheticLambda482 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final boolean f$3;
    public final Object f$4;
    public final Object f$5;

    public ChatActivity$$ExternalSyntheticLambda482(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$4 = obj4;
        this.f$5 = obj5;
        this.f$3 = z;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                AlertDialog alertDialog = (AlertDialog) this.f$1;
                ChatActivity chatActivity = (ChatActivity) this.f$0;
                try {
                    alertDialog.dismiss();
                    break;
                } catch (Throwable unused) {
                }
                if (!((boolean[]) this.f$2)[0]) {
                    MessageObject messageObject = (MessageObject) this.f$4;
                    if (this.f$3) {
                        chatActivity.createArticleViewer(false).open(messageObject, (TLRPC.TL_webPage) this.f$5, null, null);
                    } else {
                        try {
                            AndroidUtilities.openForView(messageObject, chatActivity.getParentActivity(), chatActivity.themeDelegate, false);
                        } catch (Exception e) {
                            FileLog.e(e);
                            chatActivity.alertUserOpenError$1(messageObject);
                            return;
                        }
                    }
                    break;
                }
                break;
            case 1:
                DefaultAnalyticsCollector defaultAnalyticsCollector = ((MediaSourceList) ((zzcl) this.f$0).zzc).eventListener;
                Pair pair = (Pair) this.f$1;
                defaultAnalyticsCollector.onLoadError(((Integer) pair.first).intValue(), (MediaSource$MediaPeriodId) pair.second, (LoadEventInfo) this.f$2, (MediaLoadData) this.f$4, (IOException) this.f$5, this.f$3);
                break;
            case 2:
                MediaSourceEventListener.EventDispatcher eventDispatcher = (MediaSourceEventListener.EventDispatcher) this.f$0;
                ((MediaSourceEventListener) this.f$1).onLoadError(eventDispatcher.windowIndex, eventDispatcher.mediaPeriodId, (LoadEventInfo) this.f$2, (MediaLoadData) this.f$4, (IOException) this.f$5, this.f$3);
                break;
            case 3:
                ((ContactsController) this.f$0).lambda$mergePhonebookAndTelegramContacts$41(this.f$3, (ArrayList) this.f$1, (HashMap) this.f$2, (HashMap) this.f$4, (ArrayList) this.f$5);
                break;
            case 4:
                ((FileLoadOperation) this.f$0).lambda$onFinishLoadingFile$20((File) this.f$1, (File) this.f$2, (File) this.f$4, (File) this.f$5, this.f$3);
                break;
            case 5:
                ((MessagesController) this.f$0).lambda$processDialogsUpdate$228((TLRPC.messages_Dialogs) this.f$1, (LongSparseArray) this.f$2, (LongSparseArray) this.f$4, this.f$3, (LongSparseIntArray) this.f$5);
                break;
            case 6:
                ((SendMessagesHelper) this.f$1).lambda$requestUrlAuth$36((TLObject) this.f$2, (TLRPC.TL_messages_requestUrlAuth) this.f$4, (ChatActivity) this.f$0, (String) this.f$5, this.f$3);
                break;
            case 7:
                ((CameraController) this.f$0).lambda$recordVideo$13(this.f$1, (CameraController.ICameraView) this.f$2, (File) this.f$4, this.f$3, (Runnable) this.f$5);
                break;
            case 8:
                ChannelMonetizationLayout channelMonetizationLayout = (ChannelMonetizationLayout) this.f$0;
                channelMonetizationLayout.getClass();
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f$2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f$1;
                boolean z = this.f$3;
                if (tL_error == null) {
                    twoStepVerificationActivity.needHideProgress();
                    twoStepVerificationActivity.finishFragment();
                    TLObject tLObject = (TLObject) this.f$5;
                    if (tLObject instanceof TLRPC.TL_payments_starsRevenueWithdrawalUrl) {
                        Browser.openUrl(channelMonetizationLayout.getContext(), ((TLRPC.TL_payments_starsRevenueWithdrawalUrl) tLObject).url);
                        if (z) {
                            channelMonetizationLayout.loadStarsStats(true);
                        }
                    }
                    channelMonetizationLayout.reloadTransactions();
                } else if ("PASSWORD_MISSING".equals(tL_error.text) || tL_error.text.startsWith("PASSWORD_TOO_FRESH_") || tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
                    twoStepVerificationActivity.needHideProgress();
                    Activity activity = (Activity) this.f$4;
                    AlertDialog.Builder builder = new AlertDialog.Builder(activity, 0, null);
                    String string = LocaleController.getString(R.string.EditAdminTransferAlertTitle);
                    AlertDialog alertDialog2 = builder.alertDialog;
                    alertDialog2.title = string;
                    LinearLayout linearLayout = new LinearLayout(activity);
                    linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
                    linearLayout.setOrientation(1);
                    builder.setView(linearLayout);
                    TextView textView = new TextView(activity);
                    int i = Theme.key_dialogTextBlack;
                    textView.setTextColor(Theme.getColor(null, i, false));
                    textView.setTextSize(1, 16.0f);
                    textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
                    textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.WithdrawChannelAlertText)));
                    linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2));
                    LinearLayout linearLayout2 = new LinearLayout(activity);
                    linearLayout2.setOrientation(0);
                    linearLayout.addView(linearLayout2, LayoutHelper.createLinear(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                    ImageView imageView = new ImageView(activity);
                    int i2 = R.drawable.list_circle;
                    imageView.setImageResource(i2);
                    imageView.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
                    int color = Theme.getColor(null, i, false);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    imageView.setColorFilter(new PorterDuffColorFilter(color, mode));
                    TextView textView2 = new TextView(activity);
                    textView2.setTextColor(Theme.getColor(null, i, false));
                    textView2.setTextSize(1, 16.0f);
                    textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
                    FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline1.m(R.string.EditAdminTransferAlertText1, textView2);
                    if (LocaleController.isRTL) {
                        linearLayout2.addView(textView2, LayoutHelper.createLinear(-1, -2));
                        linearLayout2.addView(imageView, LayoutHelper.createLinear(-2, -2, 5));
                    } else {
                        linearLayout2.addView(imageView, LayoutHelper.createLinear(-2, -2));
                        linearLayout2.addView(textView2, LayoutHelper.createLinear(-1, -2));
                    }
                    LinearLayout linearLayoutM = FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline0.m(activity, 0);
                    linearLayout.addView(linearLayoutM, LayoutHelper.createLinear(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                    ImageView imageView2 = new ImageView(activity);
                    imageView2.setImageResource(i2);
                    imageView2.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
                    imageView2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, i, false), mode));
                    TextView textView3 = new TextView(activity);
                    textView3.setTextColor(Theme.getColor(null, i, false));
                    textView3.setTextSize(1, 16.0f);
                    textView3.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
                    FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline1.m(R.string.EditAdminTransferAlertText2, textView3);
                    if (LocaleController.isRTL) {
                        linearLayoutM.addView(textView3, LayoutHelper.createLinear(-1, -2));
                        linearLayoutM.addView(imageView2, LayoutHelper.createLinear(-2, -2, 5));
                    } else {
                        linearLayoutM.addView(imageView2, LayoutHelper.createLinear(-2, -2));
                        linearLayoutM.addView(textView3, LayoutHelper.createLinear(-1, -2));
                    }
                    if ("PASSWORD_MISSING".equals(tL_error.text)) {
                        builder.setPositiveButton(LocaleController.getString(R.string.EditAdminTransferSetPassword), new ChannelMonetizationLayout$$ExternalSyntheticLambda10(channelMonetizationLayout));
                        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                    } else {
                        TextView textView4 = new TextView(activity);
                        textView4.setTextColor(Theme.getColor(null, i, false));
                        textView4.setTextSize(1, 16.0f);
                        textView4.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
                        textView4.setText(LocaleController.getString(R.string.EditAdminTransferAlertText3));
                        linearLayout.addView(textView4, LayoutHelper.createLinear(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                        builder.setNegativeButton(LocaleController.getString(R.string.OK), null);
                    }
                    twoStepVerificationActivity.showDialog(alertDialog2);
                } else if (!"SRP_ID_INVALID".equals(tL_error.text)) {
                    twoStepVerificationActivity.needHideProgress();
                    twoStepVerificationActivity.finishFragment();
                    BulletinFactory.showError(tL_error);
                } else {
                    ConnectionsManager.getInstance(channelMonetizationLayout.currentAccount).sendRequest(new TL_account.getPassword(), new DialogsActivity$50$$ExternalSyntheticLambda2(channelMonetizationLayout, twoStepVerificationActivity, z, 2), 8);
                }
                break;
            case 9:
                ChatEditTypeActivity.UsernamesListView.AnonymousClass1 anonymousClass1 = (ChatEditTypeActivity.UsernamesListView.AnonymousClass1) this.f$0;
                ChatEditTypeActivity.UsernamesListView usernamesListView = ChatEditTypeActivity.UsernamesListView.this;
                ChatEditTypeActivity.this.loadingUsernames.remove(((TLRPC.TL_channels_toggleUsername) this.f$1).username);
                boolean z2 = ((TLObject) this.f$2) instanceof TLRPC.TL_boolTrue;
                ChatEditTypeActivity chatEditTypeActivity = ChatEditTypeActivity.this;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.f$4;
                boolean z3 = this.f$3;
                if (z2) {
                    usernamesListView.toggleUsername(tL_username, !z3, false);
                } else {
                    TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f$5;
                    if (tL_error2 == null || !"USERNAMES_ACTIVE_TOO_MUCH".equals(tL_error2.text)) {
                        usernamesListView.toggleUsername(tL_username, z3, true);
                        chatEditTypeActivity.checkDoneButton();
                    } else {
                        AndroidUtilities.runOnUIThread(new PhotoViewer$$ExternalSyntheticLambda89(anonymousClass1, tL_username, z3, 10));
                    }
                }
                chatEditTypeActivity.getMessagesController().updateUsernameActiveness(chatEditTypeActivity.currentChat, tL_username.username, tL_username.active);
                break;
            case 10:
                ((EmojiView) this.f$0).setFoundPackButtonText((FoundStickerPackButton) this.f$1, (TLObject) this.f$2, (TLRPC.StickerSet) this.f$4, (TLRPC.Document) this.f$5, this.f$3, true);
                break;
            default:
                ((CreateGroupCallSheet) this.f$0).lambda$createCall$5((TLObject) this.f$1, (ButtonWithCounterView) this.f$2, this.f$3, (HashSet) this.f$4, (TLRPC.TL_error) this.f$5);
                break;
        }
    }

    public ChatActivity$$ExternalSyntheticLambda482(Object obj, Object obj2, Object obj3, Object obj4, boolean z, Object obj5, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$4 = obj4;
        this.f$3 = z;
        this.f$5 = obj5;
    }

    public ChatActivity$$ExternalSyntheticLambda482(Object obj, Object obj2, Object obj3, boolean z, Object obj4, TLObject tLObject, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = z;
        this.f$4 = obj4;
        this.f$5 = tLObject;
    }

    public ChatActivity$$ExternalSyntheticLambda482(ContactsController contactsController, boolean z, ArrayList arrayList, HashMap map, HashMap map2, ArrayList arrayList2) {
        this.$r8$classId = 3;
        this.f$0 = contactsController;
        this.f$3 = z;
        this.f$1 = arrayList;
        this.f$2 = map;
        this.f$4 = map2;
        this.f$5 = arrayList2;
    }

    public ChatActivity$$ExternalSyntheticLambda482(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, ChatActivity chatActivity, String str, boolean z) {
        this.$r8$classId = 6;
        this.f$1 = sendMessagesHelper;
        this.f$2 = tLObject;
        this.f$4 = tL_messages_requestUrlAuth;
        this.f$0 = chatActivity;
        this.f$5 = str;
        this.f$3 = z;
    }
}
