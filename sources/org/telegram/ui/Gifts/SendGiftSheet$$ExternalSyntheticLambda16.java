package org.telegram.ui.Gifts;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.core.content.FileProvider;
import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.zzcl;
import com.google.android.gms.internal.mlkit_vision_common.zzkh;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FactCheckController$$ExternalSyntheticOutline0;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FileRefController$$ExternalSyntheticLambda21;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesController$$ExternalSyntheticOutline2;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda17;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.StickersSearchAdapter;
import org.telegram.ui.Business.QuickRepliesController;
import org.telegram.ui.Cells.ReactedUserHolderView;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.BlurringShader;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CreateRtmpStreamBottomSheet;
import org.telegram.ui.Components.Premium.boosts.BoostDialogs$$ExternalSyntheticLambda6;
import org.telegram.ui.Components.Premium.boosts.UserSelectorBottomSheet;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PaymentFormActivity;
import org.telegram.ui.Stars.GiftOfferSheet;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda140;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda4;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsController$$ExternalSyntheticLambda65;
import org.telegram.ui.Stars.StarsController$$ExternalSyntheticLambda99;
import org.telegram.ui.Stars.StarsIntroActivity$GiftStarsSheet$$ExternalSyntheticLambda4;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.Stories.DialogStoriesCell;
import org.telegram.ui.Stories.PeerStoriesView;
import org.telegram.ui.Stories.PeerStoriesView$$ExternalSyntheticLambda56;
import org.telegram.ui.Stories.PeerStoriesView$8$$ExternalSyntheticLambda28;
import org.telegram.ui.Stories.SelfStoryViewsPage;
import org.telegram.ui.Stories.SelfStoryViewsView;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoriesViewPager;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView$$ExternalSyntheticLambda1;
import org.telegram.ui.Stories.recorder.StoryEntry;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.Stories.recorder.TimelineView;
import org.telegram.ui.bots.BotBiometry$$ExternalSyntheticLambda10;
import org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda53;
import org.telegram.ui.web.BotWebViewContainer;
import org.telegram.ui.web.WebInstantView$$ExternalSyntheticLambda0;

public final class SendGiftSheet$$ExternalSyntheticLambda16 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;
    public final Object f$4;

    public SendGiftSheet$$ExternalSyntheticLambda16(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
        this.f$4 = obj5;
    }

    private final void run$org$telegram$ui$web$BotWebViewContainer$WebViewProxy$$ExternalSyntheticLambda0() {
        String strOptString;
        String strOptString2;
        String strOptString3;
        String str;
        LaunchActivity launchActivity;
        String str2 = (String) this.f$1;
        BotWebViewContainer.WebViewProxy webViewProxy = (BotWebViewContainer.WebViewProxy) this.f$0;
        long jCurrentTimeMillis = System.currentTimeMillis() - webViewProxy.container.lastClickMs;
        BotWebViewContainer.MyWebView myWebView = webViewProxy.webView;
        if (jCurrentTimeMillis > 10000) {
            myWebView.evaluateJS("window.navigator.__share__receive(\"security\")");
            return;
        }
        webViewProxy.container.lastClickMs = 0L;
        Context context = myWebView.getContext();
        Activity activityFindActivity = AndroidUtilities.findActivity(context);
        if (activityFindActivity == null && (launchActivity = LaunchActivity.instance) != null) {
            activityFindActivity = launchActivity;
        }
        if (context == null || activityFindActivity == null || !(activityFindActivity instanceof LaunchActivity) || activityFindActivity.isFinishing() || !myWebView.isAttachedToWindow()) {
            myWebView.evaluateJS("window.navigator.__share__receive(\"security\")");
            return;
        }
        LaunchActivity launchActivity2 = (LaunchActivity) activityFindActivity;
        File file = null;
        try {
            JSONObject jSONObject = new JSONObject(str2);
            strOptString = jSONObject.optString("url", null);
            try {
                strOptString2 = jSONObject.optString("text", null);
                try {
                    strOptString3 = jSONObject.optString("title", null);
                } catch (Exception e) {
                    e = e;
                    FileLog.e(e);
                    strOptString3 = null;
                }
            } catch (Exception e2) {
                e = e2;
                strOptString2 = null;
            }
        } catch (Exception e3) {
            e = e3;
            strOptString = null;
            strOptString2 = null;
        }
        StringBuilder sb = new StringBuilder();
        if (strOptString3 != null) {
            sb.append(strOptString3);
        }
        if (strOptString2 != null) {
            if (sb.length() > 0) {
                sb.append("\n");
            }
            sb.append(strOptString2);
        }
        if (strOptString != null) {
            if (sb.length() > 0) {
                sb.append("\n");
            }
            sb.append(strOptString);
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", sb.toString());
        byte[] bArr = (byte[]) this.f$2;
        if (bArr != null) {
            int i = 0;
            while (true) {
                str = (String) this.f$3;
                if (file == null || file.exists()) {
                    File directory = FileLoader.getDirectory(4);
                    StringBuilder sb2 = new StringBuilder();
                    if (str == null) {
                        str = "file";
                    }
                    sb2.append(FileLoader.fixFileName(str));
                    sb2.append(i > 0 ? Fragment$$ExternalSyntheticOutline0.m(i, " (", ")") : "");
                    file = new File(directory, sb2.toString());
                    i++;
                } else {
                    try {
                        break;
                    } catch (Exception e4) {
                        FileLog.e(e4);
                    }
                }
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(bArr);
            fileOutputStream.close();
            String str3 = (String) this.f$4;
            try {
                if (str3 == null) {
                    intent.setType("text/plain");
                } else {
                    intent.setType(str3);
                }
                if (str != null) {
                    intent.putExtra("android.intent.extra.TITLE", str);
                }
                if (Build.VERSION.SDK_INT >= 24) {
                    try {
                        intent.putExtra("android.intent.extra.STREAM", FileProvider.getUriForFile(launchActivity2, ApplicationLoader.getApplicationId() + ".provider", file));
                        intent.setFlags(1);
                    } catch (Exception unused) {
                        intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
                    }
                } else {
                    intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
                }
            } catch (Exception e5) {
                FileLog.e(e5);
            }
        } else {
            intent.setType("text/plain");
        }
        launchActivity2.whenWebviewShareAPIDone(new RichEditor$$ExternalSyntheticLambda53(webViewProxy, 14));
        launchActivity2.startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.ShareFile)), 521);
    }

    @Override
    public final void run() {
        int i;
        long jLongValue;
        int i2;
        int i3;
        int iLongValue;
        boolean z;
        DarkThemeResourceProvider darkThemeResourceProvider;
        long j;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        StoryViewer.VideoPlayerHolder videoPlayerHolder;
        int i4 = 11;
        int i5 = 21;
        int i6 = 2;
        PaymentFormActivity paymentFormActivity = null;
        sQLiteCursorQueryFinalized = null;
        Object jSONObject = null;
        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = null;
        PaymentFormActivity paymentFormActivity2 = null;
        PaymentFormActivity paymentFormActivity3 = null;
        savedStarGift = null;
        TL_stars.SavedStarGift savedStarGift = null;
        SQLiteCursor sQLiteCursorQueryFinalized = null;
        int i7 = 1;
        switch (this.$r8$classId) {
            case 0:
                SendGiftSheet sendGiftSheet = (SendGiftSheet) this.f$0;
                sendGiftSheet.getClass();
                boolean z2 = ((TLObject) this.f$1) instanceof TLRPC.TL_boolTrue;
                int i8 = sendGiftSheet.currentAccount;
                if (!z2) {
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f$3;
                    if (tL_error != null) {
                        AlertsCreator.processError(i8, tL_error, sendGiftSheet.getBaseFragment(), (TLRPC.TL_payments_canPurchaseStore) this.f$4, new Object[0]);
                        return;
                    }
                    return;
                }
                BillingController billingController = BillingController.getInstance();
                Activity parentActivity = sendGiftSheet.getBaseFragment().getParentActivity();
                AccountInstance accountInstance = AccountInstance.getInstance(i8);
                zzcl zzclVar = new zzcl(i4, false);
                zzclVar.setProductDetails(sendGiftSheet.premiumTier.googlePlayProductDetails);
                billingController.launchBillingFlow(parentActivity, accountInstance, (TLRPC.TL_inputStorePaymentGiftPremium) this.f$2, Collections.singletonList(zzclVar.build()));
                return;
            case 1:
                ((CameraController) this.f$0).lambda$open$10((CameraSession) this.f$1, (Runnable) this.f$2, (SurfaceTexture) this.f$3, (Runnable) this.f$4);
                return;
            case 2:
                StickersSearchAdapter.AnonymousClass1 anonymousClass1 = (StickersSearchAdapter.AnonymousClass1) this.f$0;
                anonymousClass1.getClass();
                String str = ((TLRPC.TL_messages_getStickers) this.f$2).emoticon;
                StickersSearchAdapter stickersSearchAdapter = StickersSearchAdapter.this;
                if (str.equals(stickersSearchAdapter.searchQuery)) {
                    stickersSearchAdapter.reqId2 = 0;
                    TLObject tLObject = (TLObject) this.f$1;
                    if (tLObject instanceof TLRPC.TL_messages_stickers) {
                        TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject;
                        ArrayList arrayList = (ArrayList) this.f$3;
                        int size = arrayList.size();
                        int size2 = tL_messages_stickers.stickers.size();
                        for (int i9 = 0; i9 < size2; i9++) {
                            TLRPC.Document document2 = tL_messages_stickers.stickers.get(i9);
                            if (((LongSparseArray) this.f$4).indexOfKey(document2.id) < 0) {
                                arrayList.add(document2);
                            }
                        }
                        if (size != arrayList.size()) {
                            stickersSearchAdapter.emojiStickers.put(arrayList, stickersSearchAdapter.searchQuery);
                            if (size == 0) {
                                stickersSearchAdapter.emojiArrays.add(arrayList);
                            }
                            stickersSearchAdapter.notifyDataSetChanged();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 3:
                QuickRepliesController quickRepliesController = (QuickRepliesController) this.f$0;
                quickRepliesController.loading = false;
                int i10 = quickRepliesController.currentAccount;
                MessagesController.getInstance(i10).putUsers((ArrayList) this.f$1, true);
                MessagesController.getInstance(i10).putChats((ArrayList) this.f$2, true);
                ArrayList arrayList2 = quickRepliesController.replies;
                arrayList2.clear();
                arrayList2.addAll((ArrayList) this.f$3);
                Runnable runnable = (Runnable) this.f$4;
                if (runnable != null) {
                    runnable.run();
                    i = 0;
                } else {
                    i = 0;
                    quickRepliesController.load(false, null);
                }
                NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[i]);
                return;
            case 4:
                QuickRepliesController quickRepliesController2 = (QuickRepliesController) this.f$0;
                int i11 = quickRepliesController2.currentAccount;
                MessagesController.getInstance(i11).putUsers((ArrayList) this.f$1, true);
                MessagesController.getInstance(i11).putChats((ArrayList) this.f$2, true);
                QuickRepliesController.QuickReply quickReply = (QuickRepliesController.QuickReply) this.f$3;
                MessageObject messageObject = (MessageObject) this.f$4;
                quickReply.topMessage = messageObject;
                if (messageObject != null) {
                    messageObject.applyQuickReply(quickReply.name, quickReply.id);
                }
                quickRepliesController2.saveToCache();
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                return;
            case 5:
                QuickRepliesController quickRepliesController3 = (QuickRepliesController) this.f$0;
                quickRepliesController3.getClass();
                TLObject tLObject2 = (TLObject) this.f$1;
                if (!(tLObject2 instanceof TLRPC.TL_messages_messages)) {
                    FileLog.e("received " + tLObject2 + " " + ((TLRPC.TL_error) this.f$3) + " on getQuickReplyMessages when trying to send quick reply");
                    return;
                }
                ArrayList<TLRPC.Message> arrayList3 = ((TLRPC.TL_messages_messages) tLObject2).messages;
                ArrayList<Integer> arrayList4 = (ArrayList) this.f$2;
                arrayList4.clear();
                int size3 = arrayList3.size();
                int i12 = 0;
                while (i12 < size3) {
                    TLRPC.Message message = arrayList3.get(i12);
                    i12++;
                    arrayList4.add(Integer.valueOf(message.id));
                }
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = (TLRPC.TL_messages_sendQuickReplyMessages) this.f$4;
                tL_messages_sendQuickReplyMessages.id = arrayList4;
                for (int i13 = 0; i13 < arrayList4.size(); i13++) {
                    tL_messages_sendQuickReplyMessages.random_id.add(Long.valueOf(Utilities.random.nextLong()));
                }
                ConnectionsManager.getInstance(quickRepliesController3.currentAccount).sendRequest(tL_messages_sendQuickReplyMessages, null);
                return;
            case 6:
                TLObject tLObject3 = (TLObject) this.f$1;
                if (tLObject3 instanceof TLRPC.TL_payments_checkedGiftCode) {
                    TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = (TLRPC.TL_payments_checkedGiftCode) tLObject3;
                    ArrayList<TLRPC.Chat> arrayList5 = tL_payments_checkedGiftCode.chats;
                    MessagesController messagesController = (MessagesController) this.f$0;
                    messagesController.putChats(arrayList5, false);
                    messagesController.putUsers(tL_payments_checkedGiftCode.users, false);
                    ((GiftSheet$$ExternalSyntheticLambda23) this.f$2).run(tL_payments_checkedGiftCode);
                }
                ((BoostDialogs$$ExternalSyntheticLambda6) this.f$4).run((TLRPC.TL_error) this.f$3);
                return;
            case 7:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f$3;
                if (tL_error2 != null) {
                    ((Utilities.Callback) this.f$0).run(tL_error2);
                    return;
                }
                TLObject tLObject4 = (TLObject) this.f$1;
                if (tLObject4 instanceof TL_stories.TL_premium_myBoosts) {
                    TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) tLObject4;
                    ArrayList<TLRPC.User> arrayList6 = tL_premium_myBoosts.users;
                    MessagesController messagesController2 = (MessagesController) this.f$2;
                    messagesController2.putUsers(arrayList6, false);
                    messagesController2.putChats(tL_premium_myBoosts.chats, false);
                    ((Utilities.Callback) this.f$4).run(tL_premium_myBoosts);
                    return;
                }
                return;
            case 8:
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f$3;
                if (tL_error3 != null) {
                    ((SendMessagesHelper$$ExternalSyntheticLambda17) this.f$0).run(tL_error3);
                    return;
                }
                TLObject tLObject5 = (TLObject) this.f$1;
                if (tLObject5 instanceof TL_stories.TL_premium_myBoosts) {
                    TL_stories.TL_premium_myBoosts tL_premium_myBoosts2 = (TL_stories.TL_premium_myBoosts) tLObject5;
                    ArrayList<TLRPC.User> arrayList7 = tL_premium_myBoosts2.users;
                    MessagesController messagesController3 = (MessagesController) this.f$2;
                    messagesController3.putUsers(arrayList7, false);
                    messagesController3.putChats(tL_premium_myBoosts2.chats, false);
                    ((FileRefController$$ExternalSyntheticLambda21) this.f$4).run(tL_premium_myBoosts2);
                    return;
                }
                return;
            case 9:
                ((UserSelectorBottomSheet) this.f$0).lambda$openBirthdaySetup$26((TLObject) this.f$1, (TLRPC.UserFull) this.f$2, (TL_account.TL_birthday) this.f$4, (TLRPC.TL_error) this.f$3);
                return;
            case 10:
                GiftOfferSheet giftOfferSheet = (GiftOfferSheet) this.f$0;
                StarGiftSheet$$ExternalSyntheticLambda4 starGiftSheet$$ExternalSyntheticLambda4 = giftOfferSheet.closeParentSheet;
                if (starGiftSheet$$ExternalSyntheticLambda4 != null) {
                    starGiftSheet$$ExternalSyntheticLambda4.run();
                }
                ((Browser.Progress) this.f$1).end();
                ((AlertDialog) this.f$2).dismiss();
                giftOfferSheet.lambda$showGiftOfferSheet$15();
                BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment != null) {
                    if (((TLRPC.Updates) this.f$4) != null) {
                        BulletinFactory.of(safeLastFragment).createSimpleBulletin(R.raw.forward, LocaleController.getString(R.string.GiftOfferSentTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferSentText, giftOfferSheet.giftName, DialogObject.getShortName(giftOfferSheet.dialogId)))).ignoreDetach().show();
                        return;
                    } else {
                        BulletinFactory.of(safeLastFragment).showForError((TLRPC.TL_error) this.f$3);
                        return;
                    }
                }
                return;
            case 11:
                StarsController starsController = (StarsController) this.f$0;
                starsController.getClass();
                ((boolean[]) this.f$1)[0] = true;
                starsController.payAfterConfirmed((String) this.f$2, (TLRPC.ChatInvite) this.f$3, new GiftSheet$$ExternalSyntheticLambda8((Utilities.Callback2) this.f$4, 28));
                return;
            case 12:
                StarsController starsController2 = (StarsController) this.f$0;
                StarsIntroActivity$GiftStarsSheet$$ExternalSyntheticLambda4 starsIntroActivity$GiftStarsSheet$$ExternalSyntheticLambda4 = (StarsIntroActivity$GiftStarsSheet$$ExternalSyntheticLambda4) this.f$2;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.f$3;
                if (tL_error4 != null) {
                    starsIntroActivity$GiftStarsSheet$$ExternalSyntheticLambda4.run(Boolean.FALSE, tL_error4.text);
                    return;
                }
                TLObject tLObject6 = (TLObject) this.f$1;
                if (tLObject6 instanceof TLRPC.PaymentForm) {
                    TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject6;
                    paymentForm.invoice.recurring = true;
                    MessagesController.getInstance(starsController2.currentAccount).putUsers(paymentForm.users, false);
                    paymentFormActivity = new PaymentFormActivity(paymentForm, (TLRPC.TL_inputInvoiceStars) this.f$4, (BaseFragment) null);
                } else if (tLObject6 instanceof TLRPC.PaymentReceipt) {
                    paymentFormActivity = new PaymentFormActivity((TLRPC.PaymentReceipt) tLObject6);
                }
                if (paymentFormActivity == null) {
                    starsIntroActivity$GiftStarsSheet$$ExternalSyntheticLambda4.run(Boolean.FALSE, "UNKNOWN_RESPONSE");
                    return;
                }
                paymentFormActivity.setPaymentFormCallback(new GiftSheet$$ExternalSyntheticLambda6(starsIntroActivity$GiftStarsSheet$$ExternalSyntheticLambda4, 22));
                BaseFragment lastFragment = LaunchActivity.getLastFragment();
                if (lastFragment == null) {
                    return;
                }
                if (!AndroidUtilities.hasDialogOnTop(lastFragment)) {
                    lastFragment.presentFragment(paymentFormActivity);
                    return;
                }
                BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
                bottomSheetParams.transitionFromLeft = true;
                lastFragment.showAsSheet(paymentFormActivity, bottomSheetParams);
                return;
            case 13:
                ArrayList arrayList8 = (ArrayList) this.f$1;
                ArrayList<TLRPC.Chat> arrayList9 = (ArrayList) this.f$2;
                ArrayList<TLRPC.User> arrayList10 = (ArrayList) this.f$3;
                MessagesStorage messagesStorage = (MessagesStorage) this.f$0;
                try {
                    try {
                        boolean z3 = false;
                        sQLiteCursorQueryFinalized = messagesStorage.getDatabase().queryFinalized("SELECT data, hash, time FROM star_gifts2 ORDER BY pos ASC", new Object[0]);
                        jLongValue = 0;
                        iLongValue = 0;
                        while (sQLiteCursorQueryFinalized.next()) {
                            try {
                                NativeByteBuffer nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(z3 ? 1 : 0);
                                if (nativeByteBufferByteBufferValue != null) {
                                    TL_stars.StarGift starGiftTLdeserialize = TL_stars.StarGift.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(z3), z3);
                                    if (starGiftTLdeserialize != null) {
                                        arrayList8.add(starGiftTLdeserialize);
                                    }
                                    nativeByteBufferByteBufferValue.reuse();
                                    iLongValue = (int) sQLiteCursorQueryFinalized.longValue(1);
                                    jLongValue = sQLiteCursorQueryFinalized.longValue(2);
                                    z3 = false;
                                }
                            } catch (Exception e) {
                                e = e;
                                i2 = iLongValue;
                                FileLog.e(e);
                                if (sQLiteCursorQueryFinalized != null) {
                                    iLongValue = i2;
                                } else {
                                    i3 = i2;
                                }
                                AndroidUtilities.runOnUIThread(new StarsController$$ExternalSyntheticLambda65((GiftSheet$$ExternalSyntheticLambda6) this.f$4, arrayList8, i3, jLongValue, arrayList10, arrayList9));
                                return;
                            }
                        }
                        ArrayList<Long> arrayList11 = new ArrayList<>();
                        ArrayList arrayList12 = new ArrayList();
                        int size4 = arrayList8.size();
                        int i14 = 0;
                        while (i14 < size4) {
                            Object obj = arrayList8.get(i14);
                            i14++;
                            TLRPC.Peer peer = ((TL_stars.StarGift) obj).released_by;
                            if (peer != null) {
                                long peerDialogId = DialogObject.getPeerDialogId(peer);
                                if (peerDialogId > 0) {
                                    arrayList11.add(Long.valueOf(peerDialogId));
                                } else if (peerDialogId < 0) {
                                    arrayList12.add(Long.valueOf(-peerDialogId));
                                }
                            }
                        }
                        if (!arrayList12.isEmpty()) {
                            messagesStorage.getChatsInternal(TextUtils.join(",", arrayList12), arrayList9);
                        }
                        if (!arrayList11.isEmpty()) {
                            messagesStorage.getUsersInternal(arrayList11, arrayList10);
                        }
                    } catch (Throwable th) {
                        if (sQLiteCursorQueryFinalized != null) {
                            sQLiteCursorQueryFinalized.dispose();
                        }
                        throw th;
                    }
                    break;
                } catch (Exception e2) {
                    e = e2;
                    jLongValue = 0;
                    i2 = 0;
                }
                sQLiteCursorQueryFinalized.dispose();
                i3 = iLongValue;
                AndroidUtilities.runOnUIThread(new StarsController$$ExternalSyntheticLambda65((GiftSheet$$ExternalSyntheticLambda6) this.f$4, arrayList8, i3, jLongValue, arrayList10, arrayList9));
                return;
            case 14:
                StarsController starsController3 = (StarsController) this.f$0;
                starsController3.getClass();
                ((AlertDialog) this.f$2).dismiss();
                TLObject tLObject7 = (TLObject) this.f$1;
                if (tLObject7 instanceof TL_stars.TL_payments_savedStarGifts) {
                    TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject7;
                    int i15 = starsController3.currentAccount;
                    MessagesController.getInstance(i15).putUsers(tL_payments_savedStarGifts.users, false);
                    MessagesController.getInstance(i15).putChats(tL_payments_savedStarGifts.chats, false);
                    for (int i16 = 0; i16 < tL_payments_savedStarGifts.gifts.size(); i16++) {
                        TL_stars.SavedStarGift savedStarGift2 = tL_payments_savedStarGifts.gifts.get(i16);
                        TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) this.f$3;
                        if (((inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftUser) && ((TL_stars.TL_inputSavedStarGiftUser) inputSavedStarGift).msg_id == savedStarGift2.msg_id) || ((inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftChat) && ((TL_stars.TL_inputSavedStarGiftChat) inputSavedStarGift).saved_id == savedStarGift2.saved_id)) {
                            savedStarGift = savedStarGift2;
                        }
                    }
                }
                ((Utilities.Callback) this.f$4).run(savedStarGift);
                return;
            case 15:
                StarsController starsController4 = (StarsController) this.f$0;
                starsController4.getClass();
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f$2;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.f$3;
                if (tL_error5 != null) {
                    callback2.run(Boolean.FALSE, tL_error5.text);
                    return;
                }
                TLObject tLObject8 = (TLObject) this.f$1;
                if (tLObject8 instanceof TLRPC.PaymentForm) {
                    TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject8;
                    paymentForm2.invoice.recurring = true;
                    MessagesController.getInstance(starsController4.currentAccount).putUsers(paymentForm2.users, false);
                    paymentFormActivity3 = new PaymentFormActivity(paymentForm2, (TLRPC.TL_inputInvoiceStars) this.f$4, (BaseFragment) null);
                } else if (tLObject8 instanceof TLRPC.PaymentReceipt) {
                    paymentFormActivity3 = new PaymentFormActivity((TLRPC.PaymentReceipt) tLObject8);
                }
                if (paymentFormActivity3 == null) {
                    callback2.run(Boolean.FALSE, "UNKNOWN_RESPONSE");
                    return;
                }
                paymentFormActivity3.setPaymentFormCallback(new GiftSheet$$ExternalSyntheticLambda6(callback2, i5));
                BaseFragment lastFragment2 = LaunchActivity.getLastFragment();
                if (lastFragment2 == null) {
                    return;
                }
                if (!AndroidUtilities.hasDialogOnTop(lastFragment2)) {
                    lastFragment2.presentFragment(paymentFormActivity3);
                    return;
                }
                BaseFragment.BottomSheetParams bottomSheetParams2 = new BaseFragment.BottomSheetParams();
                bottomSheetParams2.transitionFromLeft = true;
                lastFragment2.showAsSheet(paymentFormActivity3, bottomSheetParams2);
                return;
            case 16:
                List list = (List) this.f$0;
                boolean zIsEmpty = list.isEmpty();
                Utilities.Callback2 callback3 = (Utilities.Callback2) this.f$1;
                if (zIsEmpty) {
                    FileLog.d("StarsController.buy queryProductDetails done: no products");
                    AndroidUtilities.runOnUIThread(new StarsController$$ExternalSyntheticLambda99(0, callback3));
                    return;
                }
                ProductDetails productDetails = (ProductDetails) list.get(0);
                ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails();
                if (oneTimePurchaseOfferDetails == null) {
                    FileLog.d("StarsController.buy queryProductDetails done: no details");
                    AndroidUtilities.runOnUIThread(new StarsController$$ExternalSyntheticLambda99(i7, callback3));
                    return;
                }
                TLRPC.TL_inputStorePaymentStarsTopup tL_inputStorePaymentStarsTopup = (TLRPC.TL_inputStorePaymentStarsTopup) this.f$2;
                tL_inputStorePaymentStarsTopup.currency = oneTimePurchaseOfferDetails.zzc;
                tL_inputStorePaymentStarsTopup.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(((TL_stars.TL_starsTopupOption) this.f$3).currency)) * (oneTimePurchaseOfferDetails.zzb / Math.pow(10.0d, 6.0d)));
                BillingController.getInstance().addResultListener(productDetails.zzc, new SendGiftSheet$$ExternalSyntheticLambda12(callback3, 3));
                BillingController.getInstance().setOnCanceled(new StarsController$$ExternalSyntheticLambda99(i6, callback3));
                FileLog.d("StarsController.buy launchBillingFlow");
                BillingController billingController2 = BillingController.getInstance();
                AccountInstance accountInstance2 = AccountInstance.getInstance(UserConfig.selectedAccount);
                zzcl zzclVar2 = new zzcl(i4, false);
                zzclVar2.setProductDetails((ProductDetails) list.get(0));
                billingController2.launchBillingFlow((Activity) this.f$4, accountInstance2, tL_inputStorePaymentStarsTopup, Collections.singletonList(zzclVar2.build()));
                return;
            case 17:
                StarsController starsController5 = (StarsController) this.f$0;
                BotBiometry$$ExternalSyntheticLambda10 botBiometry$$ExternalSyntheticLambda10 = (BotBiometry$$ExternalSyntheticLambda10) this.f$2;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.f$3;
                if (tL_error6 != null) {
                    botBiometry$$ExternalSyntheticLambda10.run(Boolean.FALSE, tL_error6.text);
                    return;
                }
                TLObject tLObject9 = (TLObject) this.f$1;
                if (tLObject9 instanceof TLRPC.PaymentForm) {
                    TLRPC.PaymentForm paymentForm3 = (TLRPC.PaymentForm) tLObject9;
                    paymentForm3.invoice.recurring = true;
                    MessagesController.getInstance(starsController5.currentAccount).putUsers(paymentForm3.users, false);
                    paymentFormActivity2 = new PaymentFormActivity(paymentForm3, (TLRPC.TL_inputInvoiceStars) this.f$4, (BaseFragment) null);
                } else if (tLObject9 instanceof TLRPC.PaymentReceipt) {
                    paymentFormActivity2 = new PaymentFormActivity((TLRPC.PaymentReceipt) tLObject9);
                }
                if (paymentFormActivity2 == null) {
                    botBiometry$$ExternalSyntheticLambda10.run(Boolean.FALSE, "UNKNOWN_RESPONSE");
                    return;
                }
                paymentFormActivity2.setPaymentFormCallback(new GiftSheet$$ExternalSyntheticLambda6(botBiometry$$ExternalSyntheticLambda10, 20));
                BaseFragment lastFragment3 = LaunchActivity.getLastFragment();
                if (lastFragment3 == null) {
                    return;
                }
                if (!AndroidUtilities.hasDialogOnTop(lastFragment3)) {
                    lastFragment3.presentFragment(paymentFormActivity2);
                    return;
                }
                BaseFragment.BottomSheetParams bottomSheetParams3 = new BaseFragment.BottomSheetParams();
                bottomSheetParams3.transitionFromLeft = true;
                lastFragment3.showAsSheet(paymentFormActivity2, bottomSheetParams3);
                return;
            case 18:
                DialogStoriesCell.StoryCell storyCellFindStoryCell = (DialogStoriesCell.StoryCell) this.f$0;
                if (storyCellFindStoryCell == null) {
                    storyCellFindStoryCell = ((DialogStoriesCell) this.f$1).findStoryCell(((Long) this.f$2).longValue());
                }
                ((StoryRecorder) this.f$3).replaceSourceView(StoryRecorder.SourceView.fromStoryCell(storyCellFindStoryCell));
                ((Runnable) this.f$4).run();
                return;
            case 19:
                PeerStoriesView peerStoriesView = (PeerStoriesView) this.f$0;
                ButtonWithCounterView$$ExternalSyntheticLambda1 buttonWithCounterView$$ExternalSyntheticLambda1 = (ButtonWithCounterView$$ExternalSyntheticLambda1) this.f$1;
                if (buttonWithCounterView$$ExternalSyntheticLambda1 != null) {
                    peerStoriesView.getClass();
                    buttonWithCounterView$$ExternalSyntheticLambda1.run();
                }
                DarkThemeResourceProvider darkThemeResourceProvider2 = peerStoriesView.resourcesProvider;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) this.f$3;
                PeerStoriesView.AnonymousClass4 anonymousClass4 = peerStoriesView.storyContainer;
                if (tL_error7 == null || "STORY_NOT_MODIFIED".equals(tL_error7.text)) {
                    StoryPrivacyBottomSheet.StoryPrivacy storyPrivacy = (StoryPrivacyBottomSheet.StoryPrivacy) this.f$4;
                    TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.f$2;
                    storyItem.parsedPrivacy = storyPrivacy;
                    ArrayList<TLRPC.PrivacyRule> arrayList13 = new ArrayList<>();
                    int i17 = 0;
                    while (true) {
                        ArrayList arrayList14 = storyPrivacy.rules;
                        if (i17 < arrayList14.size()) {
                            TLRPC.InputPrivacyRule inputPrivacyRule = (TLRPC.InputPrivacyRule) arrayList14.get(i17);
                            if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowAll) {
                                arrayList13.add(new TLRPC.TL_privacyValueAllowAll());
                            } else if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowCloseFriends) {
                                arrayList13.add(new TLRPC.TL_privacyValueAllowCloseFriends());
                            } else {
                                if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowContacts) {
                                    arrayList13.add(new TLRPC.TL_privacyValueAllowContacts());
                                } else if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueDisallowUsers) {
                                    TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers = (TLRPC.TL_inputPrivacyValueDisallowUsers) inputPrivacyRule;
                                    TLRPC.TL_privacyValueDisallowUsers tL_privacyValueDisallowUsers = new TLRPC.TL_privacyValueDisallowUsers();
                                    int iM = 0;
                                    while (iM < tL_inputPrivacyValueDisallowUsers.users.size()) {
                                        iM = MessagesController$$ExternalSyntheticOutline2.m(tL_inputPrivacyValueDisallowUsers.users.get(iM).user_id, tL_privacyValueDisallowUsers.users, iM, 1);
                                        darkThemeResourceProvider2 = darkThemeResourceProvider2;
                                    }
                                    darkThemeResourceProvider = darkThemeResourceProvider2;
                                    arrayList13.add(tL_privacyValueDisallowUsers);
                                } else {
                                    darkThemeResourceProvider = darkThemeResourceProvider2;
                                    if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowUsers) {
                                        TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = (TLRPC.TL_inputPrivacyValueAllowUsers) inputPrivacyRule;
                                        TLRPC.TL_privacyValueAllowUsers tL_privacyValueAllowUsers = new TLRPC.TL_privacyValueAllowUsers();
                                        for (int iM2 = 0; iM2 < tL_inputPrivacyValueAllowUsers.users.size(); iM2 = MessagesController$$ExternalSyntheticOutline2.m(tL_inputPrivacyValueAllowUsers.users.get(iM2).user_id, tL_privacyValueAllowUsers.users, iM2, 1)) {
                                        }
                                        arrayList13.add(tL_privacyValueAllowUsers);
                                    }
                                }
                                i17++;
                                darkThemeResourceProvider2 = darkThemeResourceProvider;
                            }
                            darkThemeResourceProvider = darkThemeResourceProvider2;
                            i17++;
                            darkThemeResourceProvider2 = darkThemeResourceProvider;
                        } else {
                            DarkThemeResourceProvider darkThemeResourceProvider3 = darkThemeResourceProvider2;
                            storyItem.privacy = arrayList13;
                            int i18 = storyPrivacy.type;
                            storyItem.close_friends = i18 == 1;
                            storyItem.contacts = i18 == 2;
                            storyItem.selected_contacts = i18 == 3;
                            MessagesController.getInstance(peerStoriesView.currentAccount).getStoriesController().updateStoryItem(storyItem.dialogId, storyItem, true);
                            peerStoriesView.editedPrivacy = true;
                            if (i18 == 4) {
                                BulletinFactory.of(anonymousClass4, darkThemeResourceProvider3).createSimpleBulletin(R.raw.contact_check, LocaleController.getString("StorySharedToEveryone")).show();
                            } else if (i18 == 1) {
                                BulletinFactory.of(anonymousClass4, darkThemeResourceProvider3).createSimpleBulletin(R.raw.contact_check, LocaleController.getString("StorySharedToCloseFriends")).show();
                            } else {
                                ArrayList arrayList15 = storyPrivacy.selectedUserIds;
                                if (i18 != 2) {
                                    if (i18 == 3) {
                                        HashSet hashSet = new HashSet();
                                        hashSet.addAll(arrayList15);
                                        Iterator it = storyPrivacy.selectedUserIdsByGroup.values().iterator();
                                        while (it.hasNext()) {
                                            hashSet.addAll((ArrayList) it.next());
                                        }
                                        z = false;
                                        BulletinFactory.of(anonymousClass4, darkThemeResourceProvider3).createSimpleBulletin(R.raw.contact_check, LocaleController.formatPluralString("StorySharedToContacts", hashSet.size(), new Object[0])).show();
                                    }
                                    peerStoriesView.updatePosition(z);
                                    return;
                                }
                                if (arrayList15.isEmpty()) {
                                    BulletinFactory.of(anonymousClass4, darkThemeResourceProvider3).createSimpleBulletin(R.raw.contact_check, LocaleController.getString("StorySharedToAllContacts")).show();
                                } else {
                                    BulletinFactory.of(anonymousClass4, darkThemeResourceProvider3).createSimpleBulletin(R.raw.contact_check, LocaleController.formatPluralString("StorySharedToAllContactsExcluded", arrayList15.size(), new Object[0])).show();
                                }
                            }
                        }
                    }
                } else {
                    FactCheckController$$ExternalSyntheticOutline0.m(R.string.UnknownError, BulletinFactory.of(anonymousClass4, darkThemeResourceProvider2), R.raw.error);
                }
                z = false;
                peerStoriesView.updatePosition(z);
                return;
            case 20:
                PeerStoriesView.AnonymousClass8 anonymousClass8 = (PeerStoriesView.AnonymousClass8) this.f$0;
                Activity activity = (Activity) this.f$1;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) this.f$2;
                StoryViewer storyViewer = (StoryViewer) this.f$3;
                PeerStoriesView.SharedResources sharedResources = (PeerStoriesView.SharedResources) this.f$4;
                StoryRecorder storyRecorder = StoryRecorder.getInstance(activity, anonymousClass8.this$0.currentAccount);
                PeerStoriesView.VideoPlayerSharedScope videoPlayerSharedScope = anonymousClass8.this$0.playerSharedScope;
                long j2 = (videoPlayerSharedScope == null || (videoPlayerHolder = videoPlayerSharedScope.player) == null) ? 0L : videoPlayerHolder.currentPosition;
                StoryEntry storyEntryFromStoryItem = StoryEntry.fromStoryItem(anonymousClass8.this$0.currentStory.getPath(), anonymousClass8.this$0.currentStory.storyItem);
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass2 = anonymousClass8.this$0;
                storyEntryFromStoryItem.editStoryPeerId = anonymousClass2.dialogId;
                TL_stories.StoryItem storyItem3 = anonymousClass2.currentStory.storyItem;
                if (storyItem3 == null || (messageMedia = storyItem3.media) == null || (document = messageMedia.document) == null) {
                    j = 0;
                } else {
                    for (int i19 = 0; i19 < document.attributes.size(); i19++) {
                        if (document.attributes.get(i19) instanceof TLRPC.TL_documentAttributeVideo) {
                            tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) document.attributes.get(i19);
                            if (tL_documentAttributeVideo == null) {
                                j = 0;
                            } else {
                                j = (long) (tL_documentAttributeVideo.video_start_ts * 1000.0d);
                            }
                        }
                    }
                    if (tL_documentAttributeVideo == null) {
                        j = 0;
                    } else {
                        j = (long) (tL_documentAttributeVideo.video_start_ts * 1000.0d);
                    }
                }
                storyEntryFromStoryItem.cover = j;
                StoryEntry storyEntryCopy$1 = storyEntryFromStoryItem.copy$1();
                storyEntryCopy$1.isEditingCover = true;
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass3 = anonymousClass8.this$0;
                TL_stories.StoryItem storyItem4 = anonymousClass3.currentStory.storyItem;
                storyEntryCopy$1.editingCoverDocument = storyItem4.media.document;
                storyEntryCopy$1.updateDocumentRef = new StarGiftSheet$$ExternalSyntheticLambda140(anonymousClass8, storyItem4, storyItem2, 5);
                if (anonymousClass3.isBotsPreview()) {
                    StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass5 = anonymousClass8.this$0;
                    storyEntryCopy$1.botId = anonymousClass5.dialogId;
                    storyEntryCopy$1.editingBotPreview = MessagesController.toInputMedia(anonymousClass5.currentStory.storyItem.media);
                    StoriesController.StoriesList storiesList = storyViewer.storiesList;
                    if (storiesList instanceof StoriesController.BotPreviewsList) {
                        storyEntryCopy$1.botLang = ((StoriesController.BotPreviewsList) storiesList).lang_code;
                    }
                }
                storyRecorder.openEdit(StoryRecorder.SourceView.fromStoryViewer(storyViewer), storyEntryCopy$1, j2);
                storyRecorder.onFullyOpenListener = new PeerStoriesView$8$$ExternalSyntheticLambda28(anonymousClass8, i6);
                storyRecorder.onClosePrepareListener = new PeerStoriesView$$ExternalSyntheticLambda56(i7, anonymousClass8, sharedResources);
                return;
            case 21:
                SelfStoryViewsPage.AnonymousClass4 anonymousClass6 = (SelfStoryViewsPage.AnonymousClass4) this.f$0;
                anonymousClass6.getClass();
                ArrayList<TLRPC.User> arrayList16 = new ArrayList<>();
                arrayList16.add((TLRPC.User) this.f$1);
                SelfStoryViewsView.AnonymousClass4.AnonymousClass1 anonymousClass7 = anonymousClass6.this$0;
                ContactsController.getInstance(anonymousClass7.currentAccount).deleteContact(arrayList16, false);
                zzkh.m(R.string.DeletedFromYourContacts, new Object[]{(String) this.f$2}, BulletinFactory.of(anonymousClass7, anonymousClass7.resourcesProvider), R.raw.ic_ban);
                ((ReactedUserHolderView) this.f$3).animateAlpha(anonymousClass7.isStoryShownToUser((TL_stories.StoryView) this.f$4) ? 1.0f : 0.5f, true);
                return;
            case 22:
                StoryPrivacyBottomSheet.Page page = (StoryPrivacyBottomSheet.Page) this.f$0;
                page.getClass();
                ((AlertDialog) this.f$2).dismiss();
                TLObject tLObject10 = (TLObject) this.f$1;
                boolean z4 = tLObject10 instanceof TL_phone.groupCallStreamRtmpUrl;
                StoryPrivacyBottomSheet storyPrivacyBottomSheet = StoryPrivacyBottomSheet.this;
                if (z4) {
                    CreateRtmpStreamBottomSheet[] createRtmpStreamBottomSheetArr = new CreateRtmpStreamBottomSheet[1];
                    CreateRtmpStreamBottomSheet createRtmpStreamBottomSheet = new CreateRtmpStreamBottomSheet(page.getContext(), ((BottomSheet) storyPrivacyBottomSheet).currentAccount, (TL_phone.getGroupCallStreamRtmpUrl) this.f$4, (TL_phone.groupCallStreamRtmpUrl) tLObject10, storyPrivacyBottomSheet.liveSettings ? null : new GiftSheet$$ExternalSyntheticLambda4(i5, page, createRtmpStreamBottomSheetArr), new DarkThemeResourceProvider());
                    createRtmpStreamBottomSheetArr[0] = createRtmpStreamBottomSheet;
                    createRtmpStreamBottomSheet.show();
                    return;
                }
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) this.f$3;
                if (tL_error8 != null) {
                    BulletinFactory.of(storyPrivacyBottomSheet.container, ((BottomSheet) storyPrivacyBottomSheet).resourcesProvider).showForError(tL_error8, true);
                    return;
                }
                return;
            case 23:
                ((TimelineView) this.f$0).lambda$new$6((ViewGroup) this.f$1, (Theme.ResourcesProvider) this.f$2, (BlurringShader.BlurManager) this.f$3, (StoryRecorder.AnonymousClass3) this.f$4);
                return;
            case 24:
                ((BotWebViewContainer) this.f$0).lambda$onEventReceived$11((TLRPC.TL_error) this.f$3, (String) this.f$2, (TLRPC.TL_inputInvoiceSlug) this.f$4, (TLObject) this.f$1);
                return;
            case 25:
                ((BotWebViewContainer) this.f$0).lambda$onEventReceived$13((TLObject) this.f$1, (String[]) this.f$2, (TLRPC.TL_error) this.f$3, (AlertDialog) this.f$4);
                return;
            case 26:
                String str2 = (String) this.f$1;
                String str3 = (String) this.f$2;
                String str4 = (String) this.f$3;
                String str5 = (String) this.f$4;
                BotWebViewContainer.MyWebView myWebView = BotWebViewContainer.MyWebView.this;
                try {
                    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str2));
                    request.setMimeType(str3);
                    request.addRequestHeader("User-Agent", str4);
                    request.setDescription(LocaleController.getString(R.string.WebDownloading));
                    request.setTitle(str5);
                    request.setNotificationVisibility(1);
                    request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str5);
                    DownloadManager downloadManager = (DownloadManager) myWebView.getContext().getSystemService("download");
                    if (downloadManager != null) {
                        downloadManager.enqueue(request);
                    }
                    BotWebViewContainer botWebViewContainer = myWebView.botWebViewContainer;
                    if (botWebViewContainer != null) {
                        BulletinFactory.of(botWebViewContainer, botWebViewContainer.resourcesProvider).createSimpleBulletin(R.raw.ic_download, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.WebDownloadingFile, str5))).show(true);
                        return;
                    }
                    return;
                } catch (Exception e3) {
                    FileLog.e(e3);
                    return;
                }
            case 27:
                run$org$telegram$ui$web$BotWebViewContainer$WebViewProxy$$ExternalSyntheticLambda0();
                return;
            default:
                String str6 = (String) this.f$3;
                boolean[] zArr = (boolean[]) this.f$0;
                if (zArr[0]) {
                    return;
                }
                zArr[0] = true;
                if (!BuildVars.DEBUG_PRIVATE_VERSION) {
                    WebView webView = (WebView) this.f$1;
                    webView.onPause();
                    webView.destroy();
                    AndroidUtilities.removeFromParent(webView);
                    AndroidUtilities.removeFromParent((FrameLayout) this.f$2);
                }
                try {
                    jSONObject = new JSONObject(str6);
                } catch (Exception e4) {
                    FileLog.e(e4);
                }
                ((WebInstantView$$ExternalSyntheticLambda0) this.f$4).run(jSONObject);
                return;
        }
    }

    public SendGiftSheet$$ExternalSyntheticLambda16(Object obj, Object obj2, Object obj3, TLObject tLObject, TLRPC.TL_error tL_error, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$4 = tLObject;
        this.f$3 = tL_error;
    }

    public SendGiftSheet$$ExternalSyntheticLambda16(Object obj, Object obj2, TLObject tLObject, Object obj3, Object obj4, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$1 = tLObject;
        this.f$3 = obj3;
        this.f$4 = obj4;
    }

    public SendGiftSheet$$ExternalSyntheticLambda16(TLObject tLObject, MessagesController messagesController, GiftSheet$$ExternalSyntheticLambda23 giftSheet$$ExternalSyntheticLambda23, BoostDialogs$$ExternalSyntheticLambda6 boostDialogs$$ExternalSyntheticLambda6, TLRPC.TL_error tL_error) {
        this.$r8$classId = 6;
        this.f$1 = tLObject;
        this.f$0 = messagesController;
        this.f$2 = giftSheet$$ExternalSyntheticLambda23;
        this.f$4 = boostDialogs$$ExternalSyntheticLambda6;
        this.f$3 = tL_error;
    }

    public SendGiftSheet$$ExternalSyntheticLambda16(TLRPC.TL_error tL_error, Utilities.Callback callback, TLObject tLObject, MessagesController messagesController, Utilities.Callback callback2, int i) {
        this.$r8$classId = i;
        this.f$3 = tL_error;
        this.f$0 = callback;
        this.f$1 = tLObject;
        this.f$2 = messagesController;
        this.f$4 = callback2;
    }

    public SendGiftSheet$$ExternalSyntheticLambda16(StarsController starsController, TLRPC.TL_error tL_error, Utilities.Callback2 callback2, TLObject tLObject, TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars, int i) {
        this.$r8$classId = i;
        this.f$0 = starsController;
        this.f$3 = tL_error;
        this.f$2 = callback2;
        this.f$1 = tLObject;
        this.f$4 = tL_inputInvoiceStars;
    }

    public SendGiftSheet$$ExternalSyntheticLambda16(PeerStoriesView peerStoriesView, ButtonWithCounterView$$ExternalSyntheticLambda1 buttonWithCounterView$$ExternalSyntheticLambda1, TLRPC.TL_error tL_error, TL_stories.StoryItem storyItem, StoryPrivacyBottomSheet.StoryPrivacy storyPrivacy) {
        this.$r8$classId = 19;
        this.f$0 = peerStoriesView;
        this.f$1 = buttonWithCounterView$$ExternalSyntheticLambda1;
        this.f$3 = tL_error;
        this.f$2 = storyItem;
        this.f$4 = storyPrivacy;
    }

    public SendGiftSheet$$ExternalSyntheticLambda16(StoryPrivacyBottomSheet.Page page, AlertDialog alertDialog, TLObject tLObject, TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl, TLRPC.TL_error tL_error) {
        this.$r8$classId = 22;
        this.f$0 = page;
        this.f$2 = alertDialog;
        this.f$1 = tLObject;
        this.f$4 = getgroupcallstreamrtmpurl;
        this.f$3 = tL_error;
    }

    public SendGiftSheet$$ExternalSyntheticLambda16(BotWebViewContainer botWebViewContainer, TLRPC.TL_error tL_error, String str, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, TLObject tLObject) {
        this.$r8$classId = 24;
        this.f$0 = botWebViewContainer;
        this.f$3 = tL_error;
        this.f$2 = str;
        this.f$4 = tL_inputInvoiceSlug;
        this.f$1 = tLObject;
    }
}
