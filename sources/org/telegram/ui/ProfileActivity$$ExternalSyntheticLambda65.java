package org.telegram.ui;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Charts.data.ChartData;
import org.telegram.ui.Charts.data.StackLinearChartData;
import org.telegram.ui.Stars.BotStarsActivity;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stories.LivePlayer;
import org.telegram.ui.Stories.PeerStoriesView;
import org.telegram.ui.Stories.PeerStoriesView$8$$ExternalSyntheticLambda54;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet;
import org.telegram.ui.web.WebActionBar$$ExternalSyntheticLambda9;

public final class ProfileActivity$$ExternalSyntheticLambda65 implements RequestDelegate {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public ProfileActivity$$ExternalSyntheticLambda65(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        Object obj;
        Object obj2;
        Object obj3;
        JSONException jSONException;
        long[] jArr;
        switch (this.$r8$classId) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) this.f$0;
                profileActivity.getClass();
                AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda12(profileActivity, tLObject, tL_error, (int[]) this.f$1, 28));
                break;
            case 1:
                LoginActivity.PhoneView phoneView = (LoginActivity.PhoneView) this.f$0;
                phoneView.getClass();
                AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda12(phoneView, tL_error, tLObject, (String) this.f$1, 15));
                break;
            case 2:
                NewContactBottomSheet newContactBottomSheet = (NewContactBottomSheet) this.f$0;
                newContactBottomSheet.getClass();
                AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda21(newContactBottomSheet, tLObject, (OAuthSheet$$ExternalSyntheticLambda13) this.f$1, 23));
                break;
            case 3:
                PassportActivity.AnonymousClass20.AnonymousClass1 anonymousClass1 = (PassportActivity.AnonymousClass20.AnonymousClass1) this.f$0;
                anonymousClass1.getClass();
                anonymousClass1.onResult(tL_error, (TLRPC.TL_secureValue) tLObject, (TLRPC.TL_secureValue) this.f$1);
                break;
            case 4:
                PassportActivity.PhoneConfirmationView phoneConfirmationView = (PassportActivity.PhoneConfirmationView) this.f$0;
                phoneConfirmationView.getClass();
                AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda21(phoneConfirmationView, tL_error, (TL_account.verifyPhone) this.f$1, 29));
                break;
            case 5:
                PaymentFormActivity paymentFormActivity = (PaymentFormActivity) this.f$0;
                paymentFormActivity.getClass();
                if (tLObject instanceof TLRPC.TL_payments_validatedRequestedInfo) {
                    AndroidUtilities.runOnUIThread(new PhotoViewer$$ExternalSyntheticLambda7(5, paymentFormActivity, (TLRPC.TL_payments_validatedRequestedInfo) tLObject));
                } else {
                    AndroidUtilities.runOnUIThread(new PaymentFormActivity$$ExternalSyntheticLambda36(paymentFormActivity, tL_error, (TLObject) this.f$1, 1));
                }
                break;
            case 6:
                PaymentFormActivity paymentFormActivity2 = (PaymentFormActivity) this.f$0;
                if (tLObject != null) {
                    paymentFormActivity2.getClass();
                    if (tLObject instanceof TLRPC.TL_payments_paymentResult) {
                        Utilities.Callback callback = paymentFormActivity2.customResultReceiver;
                        if (callback != null) {
                            callback.run((TLRPC.TL_payments_paymentResult) tLObject);
                        } else {
                            TLRPC.Updates updates = ((TLRPC.TL_payments_paymentResult) tLObject).updates;
                            TLRPC.Message[] messageArr = new TLRPC.Message[1];
                            int size = updates.updates.size();
                            for (int i = 0; i < size; i++) {
                                TLRPC.Update update = updates.updates.get(i);
                                if (update instanceof TL_update.TL_updateNewMessage) {
                                    messageArr[0] = ((TL_update.TL_updateNewMessage) update).message;
                                } else if (update instanceof TL_update.TL_updateNewChannelMessage) {
                                    messageArr[0] = ((TL_update.TL_updateNewChannelMessage) update).message;
                                }
                                paymentFormActivity2.getMessagesController().processUpdates(updates, false);
                                AndroidUtilities.runOnUIThread(new PhotoViewer$$ExternalSyntheticLambda7(6, paymentFormActivity2, messageArr));
                                break;
                            }
                            paymentFormActivity2.getMessagesController().processUpdates(updates, false);
                            AndroidUtilities.runOnUIThread(new PhotoViewer$$ExternalSyntheticLambda7(6, paymentFormActivity2, messageArr));
                        }
                    } else if (tLObject instanceof TLRPC.TL_payments_paymentVerificationNeeded) {
                        AndroidUtilities.runOnUIThread(new PaymentFormActivity$$ExternalSyntheticLambda0(paymentFormActivity2, tLObject, 1));
                    }
                } else {
                    WebActionBar$$ExternalSyntheticLambda9 webActionBar$$ExternalSyntheticLambda9 = paymentFormActivity2.customErrorReceiver;
                    if (webActionBar$$ExternalSyntheticLambda9 == null || !((Boolean) webActionBar$$ExternalSyntheticLambda9.run(tL_error)).booleanValue()) {
                        AndroidUtilities.runOnUIThread(new PollItemMenu$$ExternalSyntheticLambda8(paymentFormActivity2, tL_error, (TLRPC.TL_payments_sendPaymentForm) this.f$1, 2));
                    }
                }
                break;
            case 7:
                PaymentFormActivity paymentFormActivity3 = (PaymentFormActivity) this.f$0;
                paymentFormActivity3.getClass();
                AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda12(paymentFormActivity3, tLObject, tL_error, (TL_account.getTmpPassword) this.f$1, 19));
                break;
            case 8:
                PostSuggestionsEditActivity postSuggestionsEditActivity = (PostSuggestionsEditActivity) this.f$0;
                postSuggestionsEditActivity.getClass();
                AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda12(postSuggestionsEditActivity, tL_error, tLObject, (TL_stars.updatePaidMessagesPrice) this.f$1, 24));
                break;
            case 9:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) this.f$0;
                privacyControlActivity.getClass();
                AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda12(privacyControlActivity, tL_error, tLObject, (boolean[]) this.f$1, 25));
                break;
            case 10:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f$0;
                privacySettingsActivity.getClass();
                AndroidUtilities.runOnUIThread(new PhotoViewer$$ExternalSyntheticLambda7(23, privacySettingsActivity, (TextCheckCell) this.f$1));
                break;
            case 11:
                ProfileActivity profileActivity2 = (ProfileActivity) this.f$0;
                profileActivity2.getClass();
                AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda12(profileActivity2, tLObject, (TLRPC.TL_username) this.f$1, tL_error, 29));
                break;
            case 12:
                ProfileActivity profileActivity3 = (ProfileActivity) this.f$0;
                profileActivity3.getClass();
                AndroidUtilities.runOnUIThread(new ProfileActivity$$ExternalSyntheticLambda149((BaseFragment) profileActivity3, tL_error, tLObject, (String) this.f$1, 1));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new ProfileActivity$$ExternalSyntheticLambda149((ProfileActivity.ListAdapter.AnonymousClass12) this.f$0, tLObject, (TLRPC.TL_username) this.f$1, tL_error, 3));
                break;
            case 14:
                SessionsActivity.AnonymousClass4 anonymousClass4 = (SessionsActivity.AnonymousClass4) this.f$0;
                anonymousClass4.getClass();
                AndroidUtilities.runOnUIThread(new PollItemMenu$$ExternalSyntheticLambda8(anonymousClass4, tL_error, (TLRPC.TL_authorization) this.f$1, 14));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new PollItemMenu$$ExternalSyntheticLambda8((SessionsActivity.AnonymousClass5) this.f$0, tL_error, (TLRPC.TL_authorization) this.f$1, 15));
                break;
            case 16:
                SessionsActivity.AnonymousClass6 anonymousClass6 = (SessionsActivity.AnonymousClass6) this.f$0;
                anonymousClass6.getClass();
                AndroidUtilities.runOnUIThread(new ProfileActivity$$ExternalSyntheticLambda149(anonymousClass6, tLObject, tL_error, (CameraScanActivity$$ExternalSyntheticLambda0) this.f$1, 6));
                break;
            case 17:
                SettingsActivity settingsActivity = (SettingsActivity) this.f$0;
                settingsActivity.getClass();
                AndroidUtilities.runOnUIThread(new ProfileActivity$$ExternalSyntheticLambda149((BaseFragment) settingsActivity, tL_error, tLObject, (String) this.f$1, 7));
                break;
            case 18:
                SettingsActivity settingsActivity2 = (SettingsActivity) this.f$0;
                settingsActivity2.getClass();
                AndroidUtilities.runOnUIThread(new QrActivity$$ExternalSyntheticLambda17(21, settingsActivity2, (TLRPC.TL_attachMenuBot) this.f$1));
                break;
            case 19:
                BotStarsActivity botStarsActivity = (BotStarsActivity) this.f$0;
                botStarsActivity.getClass();
                AndroidUtilities.runOnUIThread(new PollItemMenu$$ExternalSyntheticLambda8(botStarsActivity, tLObject, (Context) this.f$1, 17));
                break;
            case 20:
                StarGiftSheet starGiftSheet = (StarGiftSheet) this.f$0;
                starGiftSheet.getClass();
                AndroidUtilities.runOnUIThread(new ProfileActivity$$ExternalSyntheticLambda149(starGiftSheet, tLObject, (PollItemMenu$$ExternalSyntheticLambda8) this.f$1, tL_error, 10));
                break;
            case 21:
                ((StarGiftSheet) this.f$0).lambda$doUpgrade$126((TL_stars.InputSavedStarGift) this.f$1, tLObject, tL_error);
                break;
            case 22:
                ((StarGiftSheet) this.f$0).lambda$show$111((AlertDialog) this.f$1, tLObject, tL_error);
                break;
            case 23:
                StarsController starsController = (StarsController) this.f$0;
                starsController.getClass();
                AndroidUtilities.runOnUIThread(new ProfileActivity$$ExternalSyntheticLambda149(starsController, tLObject, tL_error, (Utilities.Callback) this.f$1, 15));
                break;
            case 24:
                StarsController starsController2 = (StarsController) this.f$0;
                starsController2.getClass();
                AndroidUtilities.runOnUIThread(new PollItemMenu$$ExternalSyntheticLambda8(starsController2, tLObject, (Runnable) this.f$1, 27));
                break;
            case 25:
                StatisticActivity.ChartViewData chartViewData = (StatisticActivity.ChartViewData) this.f$0;
                int i2 = chartViewData.graphType;
                Object obj4 = null;
                if (tL_error == null) {
                    if (tLObject instanceof TL_stats.TL_statsGraph) {
                        try {
                            ChartData chartDataCreateChartData = StatisticActivity.createChartData(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), i2, chartViewData.isLanguages);
                            try {
                                obj4 = ((TL_stats.TL_statsGraph) tLObject).zoom_token;
                                if (i2 == 4 && (jArr = chartDataCreateChartData.x) != null && jArr.length > 0) {
                                    long j = jArr[jArr.length - 1];
                                    chartViewData.childChartData = new StackLinearChartData(chartDataCreateChartData, j);
                                    chartViewData.activeZoom = j;
                                }
                                obj3 = obj4;
                                obj4 = chartDataCreateChartData;
                            } catch (JSONException e) {
                                jSONException = e;
                                obj3 = obj4;
                                obj4 = chartDataCreateChartData;
                                jSONException.printStackTrace();
                            }
                        } catch (JSONException e2) {
                            jSONException = e2;
                            obj3 = null;
                        }
                    } else {
                        obj3 = null;
                    }
                    if (tLObject instanceof TL_stats.TL_statsGraphError) {
                        chartViewData.isEmpty = false;
                        chartViewData.isError = true;
                        chartViewData.errorMessage = ((TL_stats.TL_statsGraphError) tLObject).error;
                    }
                    obj = obj4;
                    obj2 = obj3;
                } else {
                    obj = null;
                    obj2 = null;
                }
                AndroidUtilities.runOnUIThread(new ProfileActivity$$ExternalSyntheticLambda149(chartViewData, obj, obj2, (Utilities.Callback0Return) this.f$1, 17));
                break;
            case 26:
                LivePlayer livePlayer = (LivePlayer) this.f$0;
                livePlayer.getClass();
                if (tLObject instanceof TLRPC.Updates) {
                    MessagesController.getInstance(livePlayer.currentAccount).processUpdates((TLRPC.Updates) this.f$1, false);
                }
                break;
            case 27:
                PeerStoriesView.AnonymousClass8 anonymousClass8 = (PeerStoriesView.AnonymousClass8) this.f$0;
                anonymousClass8.getClass();
                if (tLObject instanceof TLRPC.Updates) {
                    MessagesController.getInstance(anonymousClass8.this$0.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
                }
                AndroidUtilities.runOnUIThread(new PeerStoriesView$8$$ExternalSyntheticLambda54((StoryPrivacyBottomSheet) this.f$1, 0));
                break;
            case 28:
                StoriesController.BotPreviewsList botPreviewsList = (StoriesController.BotPreviewsList) this.f$0;
                botPreviewsList.getClass();
                AndroidUtilities.runOnUIThread(new TodoItemMenu$$ExternalSyntheticLambda8(botPreviewsList, tLObject, (Runnable) this.f$1, 6));
                break;
            default:
                StoriesController.StoriesCollections storiesCollections = (StoriesController.StoriesCollections) this.f$0;
                storiesCollections.getClass();
                AndroidUtilities.runOnUIThread(new ProfileActivity$$ExternalSyntheticLambda149(storiesCollections, tLObject, (Utilities.Callback) this.f$1, tL_error, 20));
                break;
        }
    }
}
