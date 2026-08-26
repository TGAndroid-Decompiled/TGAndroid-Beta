package org.telegram.ui.Stars;

import android.widget.Toast;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.Charts.data.ChartData;
import org.telegram.ui.LinkManager$$ExternalSyntheticLambda20;
import org.telegram.ui.ProfileActivity$$ExternalSyntheticLambda149;
import org.telegram.ui.StatisticActivity;
import org.telegram.ui.Stories.PeerStoriesView;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet;
import org.telegram.ui.TodoItemMenu$$ExternalSyntheticLambda9;
import org.telegram.ui.TopicCreateFragment;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bots.BotVerifySheet$$ExternalSyntheticLambda1;
import org.telegram.ui.web.BotWebViewContainer;
import org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda12;
import org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda35;
import org.telegram.ui.web.WebInstantView$4$$ExternalSyntheticLambda0;

public final class StarGiftSheet$$ExternalSyntheticLambda7 implements RequestDelegate {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;

    public StarGiftSheet$$ExternalSyntheticLambda7(Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        ChartData chartDataCreateChartData;
        switch (this.$r8$classId) {
            case 0:
                ((StarGiftSheet) this.f$0).lambda$show$114((TLRPC.TL_messageActionStarGift) this.f$1, (AlertDialog) this.f$2, tLObject);
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda20(this.f$0, tL_error, this.f$1, tLObject, (TLObject) this.f$2, 25));
                break;
            case 2:
                StarsController starsController = (StarsController) this.f$0;
                starsController.getClass();
                AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda20((Object) starsController, tL_error, this.f$1, tLObject, (TLObject) this.f$2, 29));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda20(this.f$0, tL_error, this.f$1, tLObject, (TLObject) this.f$2, 24));
                break;
            case 4:
                StatisticActivity.ChartCell chartCell = (StatisticActivity.ChartCell) this.f$0;
                chartCell.getClass();
                boolean z = true;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        JSONObject jSONObject = new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data);
                        StatisticActivity.ChartViewData chartViewData = chartCell.data;
                        int i = chartViewData.graphType;
                        if (chartViewData != StatisticActivity.this.languagesData) {
                            z = false;
                        }
                        chartDataCreateChartData = StatisticActivity.createChartData(jSONObject, i, z);
                    } catch (JSONException e) {
                        e.printStackTrace();
                        chartDataCreateChartData = null;
                    }
                    AndroidUtilities.runOnUIThread(new ProfileActivity$$ExternalSyntheticLambda149(chartCell, chartDataCreateChartData, (String) this.f$1, (StatisticActivity.ZoomCancelable) this.f$2, 16));
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(chartCell.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                chartDataCreateChartData = null;
                AndroidUtilities.runOnUIThread(new ProfileActivity$$ExternalSyntheticLambda149(chartCell, chartDataCreateChartData, (String) this.f$1, (StatisticActivity.ZoomCancelable) this.f$2, 16));
                break;
            case 5:
                PeerStoriesView.AnonymousClass8 anonymousClass8 = (PeerStoriesView.AnonymousClass8) this.f$0;
                anonymousClass8.getClass();
                AndroidUtilities.runOnUIThread(new ProfileActivity$$ExternalSyntheticLambda149(anonymousClass8, tLObject, (TL_stories.StoryItem) this.f$1, (Utilities.Callback) this.f$2, 18));
                break;
            case 6:
                StoryPrivacyBottomSheet.Page page = (StoryPrivacyBottomSheet.Page) this.f$0;
                page.getClass();
                AndroidUtilities.runOnUIThread(new WebInstantView$4$$ExternalSyntheticLambda0(page, (AlertDialog) this.f$2, tLObject, (TL_phone.getGroupCallStreamRtmpUrl) this.f$1, tL_error, 6));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new ProfileActivity$$ExternalSyntheticLambda149((TopicCreateFragment.AnonymousClass1) this.f$0, tLObject, (String) this.f$1, (AlertDialog) this.f$2, 24));
                break;
            case 8:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f$0;
                byte[] bArr = (byte[]) this.f$1;
                byte[] bArr2 = (byte[]) this.f$2;
                twoStepVerificationActivity.getClass();
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new TodoItemMenu$$ExternalSyntheticLambda9(19, twoStepVerificationActivity, tL_error));
                } else {
                    Utilities.globalQueue.postRunnable(new ProfileActivity$$ExternalSyntheticLambda149(twoStepVerificationActivity, bArr, tLObject, bArr2, 25));
                }
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new ProfileActivity$$ExternalSyntheticLambda149((ButtonWithCounterView) this.f$0, tLObject, (BottomSheet) this.f$1, (BotVerifySheet$$ExternalSyntheticLambda1) this.f$2, 27));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new BotWebViewContainer$$ExternalSyntheticLambda35(tLObject, (boolean[]) this.f$0, (BotWebViewContainer$$ExternalSyntheticLambda12) this.f$1, (TLRPC.UserFull) this.f$2));
                break;
            case 11:
                BotWebViewContainer botWebViewContainer = (BotWebViewContainer) this.f$0;
                botWebViewContainer.getClass();
                AndroidUtilities.runOnUIThread(new WebInstantView$4$$ExternalSyntheticLambda0((Object) botWebViewContainer, (TLObject) tL_error, (String) this.f$1, this.f$2, tLObject, 8));
                break;
            case 12:
                BotWebViewContainer botWebViewContainer2 = (BotWebViewContainer) this.f$0;
                botWebViewContainer2.getClass();
                AndroidUtilities.runOnUIThread(new BotWebViewContainer$$ExternalSyntheticLambda35(botWebViewContainer2, tLObject, (String) this.f$1, (String) this.f$2, 0));
                break;
            default:
                BotWebViewContainer botWebViewContainer3 = (BotWebViewContainer) this.f$0;
                botWebViewContainer3.getClass();
                AndroidUtilities.runOnUIThread(new WebInstantView$4$$ExternalSyntheticLambda0(botWebViewContainer3, tLObject, (String[]) this.f$1, tL_error, (AlertDialog) this.f$2, 9));
                break;
        }
    }

    public StarGiftSheet$$ExternalSyntheticLambda7(StoryPrivacyBottomSheet.Page page, AlertDialog alertDialog, TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl) {
        this.$r8$classId = 6;
        this.f$0 = page;
        this.f$2 = alertDialog;
        this.f$1 = getgroupcallstreamrtmpurl;
    }
}
