package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.Toast;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Charts.data.ChartData;
import org.telegram.ui.Stars.StarGiftSheet;

public final class LinkManager$$ExternalSyntheticLambda0 implements RequestDelegate {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;

    public LinkManager$$ExternalSyntheticLambda0(Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        ChartData chartDataCreateChartData;
        ChartData chartDataCreateChartData2;
        switch (this.$r8$classId) {
            case 0:
                LinkManager linkManager = (LinkManager) this.f$0;
                linkManager.getClass();
                AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda20(linkManager, tL_error, tLObject, (TLRPC.TL_inputInvoiceSlug) this.f$1, (String) this.f$2, 0));
                break;
            case 1:
                GroupCallActivity groupCallActivity = (GroupCallActivity) this.f$0;
                groupCallActivity.getClass();
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    for (int i = 0; i < updates.updates.size(); i++) {
                        TLRPC.Update update = updates.updates.get(i);
                        if (update instanceof TL_update.TL_updateGroupCall) {
                            AndroidUtilities.runOnUIThread(new ChatUsersActivity$$ExternalSyntheticLambda13((Object) groupCallActivity, this.f$1, this.f$2, update, 29));
                            groupCallActivity.accountInstance.getMessagesController().processUpdates(updates, false);
                        }
                        break;
                    }
                    groupCallActivity.accountInstance.getMessagesController().processUpdates(updates, false);
                } else {
                    AndroidUtilities.runOnUIThread(new LaunchActivity$$ExternalSyntheticLambda13(12, groupCallActivity, tL_error));
                }
                break;
            case 2:
                GroupCallActivity groupCallActivity2 = (GroupCallActivity) this.f$0;
                groupCallActivity2.getClass();
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda218(groupCallActivity2, (AlertDialog) this.f$1, tLObject, (TL_phone.exportGroupCallInvite) this.f$2, tL_error, 26));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda12(tLObject, (ArrayList) this.f$0, (ArrayList) this.f$1, (ChatActivity$$ExternalSyntheticLambda218) this.f$2, 2));
                break;
            case 4:
                GroupStickersActivity.SearchAdapter searchAdapter = (GroupStickersActivity.SearchAdapter) this.f$0;
                if (Objects.equals(searchAdapter.lastQuery, (String) this.f$2) && (tLObject instanceof TLRPC.TL_messages_foundStickerSets)) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList<TLRPC.StickerSetCovered> arrayList2 = ((TLRPC.TL_messages_foundStickerSets) tLObject).sets;
                    int size = arrayList2.size();
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        GroupStickersActivity groupStickersActivity = GroupStickersActivity.this;
                        if (i3 >= size) {
                            Locale locale = Locale.ROOT;
                            String str = (String) this.f$1;
                            String strTrim = str.toLowerCase(locale).trim();
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(((BaseFragment) groupStickersActivity).currentAccount).getStickerSets(groupStickersActivity.getStickerSetType());
                            int size2 = stickerSets.size();
                            while (i2 < size2) {
                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSets.get(i2);
                                i2++;
                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = tL_messages_stickerSet;
                                String str2 = tL_messages_stickerSet2.set.short_name;
                                Locale locale2 = Locale.ROOT;
                                if (str2.toLowerCase(locale2).contains(strTrim) || tL_messages_stickerSet2.set.title.toLowerCase(locale2).contains(strTrim)) {
                                    arrayList3.add(tL_messages_stickerSet2);
                                }
                            }
                            AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda12(searchAdapter, arrayList, arrayList3, str, 5));
                            break;
                        } else {
                            TLRPC.StickerSetCovered stickerSetCovered = arrayList2.get(i3);
                            i3++;
                            TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = new TLRPC.TL_messages_stickerSet();
                            TLRPC.StickerSet stickerSet = stickerSetCovered2.set;
                            tL_messages_stickerSet3.set = stickerSet;
                            tL_messages_stickerSet3.documents = stickerSetCovered2.covers;
                            if (!groupStickersActivity.isEmoji || stickerSet.emojis) {
                                arrayList.add(tL_messages_stickerSet3);
                            }
                        }
                    }
                }
                break;
            case 5:
                LaunchActivity launchActivity = (LaunchActivity) this.f$0;
                launchActivity.getClass();
                AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda20((Object) launchActivity, (Object) tLObject, this.f$1, this.f$2, tL_error, 2));
                break;
            case 6:
                LaunchActivity launchActivity2 = (LaunchActivity) this.f$0;
                launchActivity2.getClass();
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda218(launchActivity2, (LaunchActivity$$ExternalSyntheticLambda13) this.f$1, tLObject, (TLRPC.TL_wallPaper) this.f$2, tL_error, 29));
                break;
            case 7:
                LaunchActivity launchActivity3 = (LaunchActivity) this.f$0;
                launchActivity3.getClass();
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda218(launchActivity3, tLObject, (AlertDialog) this.f$1, (LaunchActivity$$ExternalSyntheticLambda13) this.f$2, tL_error, 28));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda21((LocationActivity) this.f$0, (AlertDialog[]) this.f$1, (TLRPC.TL_messageMediaVenue) this.f$2, 9));
                break;
            case 9:
                LoginActivity.LoginActivityEmailCodeView loginActivityEmailCodeView = (LoginActivity.LoginActivityEmailCodeView) this.f$0;
                loginActivityEmailCodeView.getClass();
                AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda20((KeyEvent.Callback) loginActivityEmailCodeView, tLObject, this.f$1, tL_error, (TLObject) this.f$2, 4));
                break;
            case 10:
                LoginActivity.LoginActivitySetupEmail loginActivitySetupEmail = (LoginActivity.LoginActivitySetupEmail) this.f$0;
                loginActivitySetupEmail.getClass();
                AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda20((KeyEvent.Callback) loginActivitySetupEmail, tLObject, this.f$1, tL_error, (TLObject) this.f$2, 6));
                break;
            case 11:
                LoginActivity.LoginActivitySetupEmail loginActivitySetupEmail2 = (LoginActivity.LoginActivitySetupEmail) this.f$0;
                loginActivitySetupEmail2.getClass();
                AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda20((KeyEvent.Callback) loginActivitySetupEmail2, tLObject, this.f$1, tL_error, (TLObject) this.f$2, 5));
                break;
            case 12:
                LoginActivity.LoginPayView loginPayView = (LoginActivity.LoginPayView) this.f$0;
                loginPayView.getClass();
                AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda20((Object) loginPayView, (Object) tLObject, this.f$1, this.f$2, tL_error, 7));
                break;
            case 13:
                MessageStatisticActivity messageStatisticActivity = (MessageStatisticActivity) this.f$0;
                messageStatisticActivity.getClass();
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        chartDataCreateChartData = StatisticActivity.createChartData(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), 1, false);
                    } catch (JSONException e) {
                        e.printStackTrace();
                        chartDataCreateChartData = null;
                    }
                    AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda20((BaseFragment) messageStatisticActivity, tL_error, (Object) chartDataCreateChartData, (String) this.f$2, (TLObject) this.f$1, 8));
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda2(20, messageStatisticActivity, (TL_stats.TL_statsGraphError) tLObject));
                }
                chartDataCreateChartData = null;
                AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda20((BaseFragment) messageStatisticActivity, tL_error, (Object) chartDataCreateChartData, (String) this.f$2, (TLObject) this.f$1, 8));
                break;
            case 14:
                MessageStatisticActivity.ListAdapter.AnonymousClass1 anonymousClass1 = (MessageStatisticActivity.ListAdapter.AnonymousClass1) this.f$0;
                anonymousClass1.getClass();
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        chartDataCreateChartData2 = StatisticActivity.createChartData(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), anonymousClass1.data.graphType, false);
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                        chartDataCreateChartData2 = null;
                    }
                    AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda12(anonymousClass1, chartDataCreateChartData2, (String) this.f$2, (StatisticActivity.ZoomCancelable) this.f$1, 16));
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(anonymousClass1.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                chartDataCreateChartData2 = null;
                AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda12(anonymousClass1, chartDataCreateChartData2, (String) this.f$2, (StatisticActivity.ZoomCancelable) this.f$1, 16));
                break;
            case 15:
                NewContactBottomSheet newContactBottomSheet = (NewContactBottomSheet) this.f$0;
                newContactBottomSheet.getClass();
                AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda20((KeyEvent.Callback) newContactBottomSheet, tLObject, this.f$1, tL_error, (TLObject) this.f$2, 9));
                break;
            case 16:
                PassportActivity.PhoneConfirmationView phoneConfirmationView = (PassportActivity.PhoneConfirmationView) this.f$0;
                phoneConfirmationView.getClass();
                AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda20((Object) phoneConfirmationView, tL_error, this.f$1, tLObject, (TLObject) this.f$2, 11));
                break;
            case 17:
                PaymentFormActivity paymentFormActivity = (PaymentFormActivity) this.f$0;
                paymentFormActivity.getClass();
                AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda20((BaseFragment) paymentFormActivity, tL_error, (Object) tLObject, (String) this.f$2, (TLObject) this.f$1, 12));
                break;
            case 18:
                PaymentFormActivity paymentFormActivity2 = (PaymentFormActivity) this.f$0;
                paymentFormActivity2.getClass();
                if (tLObject instanceof TLRPC.TL_payments_validatedRequestedInfo) {
                    AndroidUtilities.runOnUIThread(new PollItemMenu$$ExternalSyntheticLambda8(paymentFormActivity2, (TLRPC.TL_payments_validatedRequestedInfo) tLObject, (PhotoViewer$$ExternalSyntheticLambda7) this.f$1, 3));
                } else {
                    AndroidUtilities.runOnUIThread(new PaymentFormActivity$$ExternalSyntheticLambda36(paymentFormActivity2, tL_error, (TLObject) this.f$2, 2));
                }
                break;
            case 19:
                AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda12((PhotoViewer.AnonymousClass16) this.f$0, tLObject, (UserConfig) this.f$1, (TLRPC.Photo) this.f$2, 23));
                break;
            case 20:
                AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda20(this.f$0, (Object) tLObject, this.f$1, this.f$2, tL_error, 15));
                break;
            case 21:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f$0;
                privacySettingsActivity.getClass();
                AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda12(privacySettingsActivity, (AlertDialog) this.f$1, tLObject, (TL_account.setAccountTTL) this.f$2, 26));
                break;
            case 22:
                ProfileActivity profileActivity = (ProfileActivity) this.f$0;
                profileActivity.getClass();
                AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda20((Object) profileActivity, (Object) tLObject, this.f$1, this.f$2, tL_error, 17));
                break;
            case 23:
                ProfileActivity profileActivity2 = (ProfileActivity) this.f$0;
                profileActivity2.getClass();
                AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda20(profileActivity2, tLObject, (String) this.f$2, (TLRPC.User) this.f$1, tL_error));
                break;
            case 24:
                ProfileActivity profileActivity3 = (ProfileActivity) this.f$0;
                profileActivity3.getClass();
                AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda20((Object) profileActivity3, (Object) tLObject, this.f$1, this.f$2, tL_error, 19));
                break;
            case 25:
                AndroidUtilities.runOnUIThread(new ProfileActivity$$ExternalSyntheticLambda149((ProfileActivity.AnonymousClass6) this.f$0, tLObject, (UserConfig) this.f$1, (TLRPC.Photo) this.f$2, 2));
                break;
            case 26:
                SelectChatUserSheet selectChatUserSheet = (SelectChatUserSheet) this.f$0;
                selectChatUserSheet.getClass();
                AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda20(selectChatUserSheet, tL_error, tLObject, (TwoStepVerificationActivity) this.f$1, (TLRPC.User) this.f$2, 22));
                break;
            case 27:
                SessionsActivity sessionsActivity = (SessionsActivity) this.f$0;
                sessionsActivity.getClass();
                AndroidUtilities.runOnUIThread(new ProfileActivity$$ExternalSyntheticLambda149(sessionsActivity, (AlertDialog) this.f$1, tL_error, (TLRPC.TL_authorization) this.f$2, 5));
                break;
            case 28:
                SessionsActivity sessionsActivity2 = (SessionsActivity) this.f$0;
                sessionsActivity2.getClass();
                AndroidUtilities.runOnUIThread(new ProfileActivity$$ExternalSyntheticLambda149(sessionsActivity2, (AlertDialog) this.f$1, tL_error, (TLRPC.TL_webAuthorization) this.f$2, 4));
                break;
            default:
                ((StarGiftSheet) this.f$0).lambda$onResellPressed$33((Browser.Progress) this.f$1, (TL_stars.TL_starGiftUnique) this.f$2, tLObject, tL_error);
                break;
        }
    }

    public LinkManager$$ExternalSyntheticLambda0(Object obj, String str, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$2 = str;
        this.f$1 = obj2;
    }
}
