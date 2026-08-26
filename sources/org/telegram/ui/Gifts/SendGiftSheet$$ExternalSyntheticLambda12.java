package org.telegram.ui.Gifts;

import android.animation.ValueAnimator;
import androidx.core.util.Consumer;
import com.android.billingclient.api.BillingResult;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Adapters.DialogsAdapter;
import org.telegram.ui.Charts.BaseChartView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.Paint.ColorPickerBottomSheet;
import org.telegram.ui.bots.BotWebViewSheet;
import org.telegram.ui.bots.BotWebViewSheet$$ExternalSyntheticLambda13;
import org.telegram.ui.bots.ChatAttachAlertBotWebViewLayout;
import org.telegram.ui.bots.ChatAttachAlertBotWebViewLayout$$ExternalSyntheticLambda1;
import org.telegram.ui.web.BotWebViewContainer;
import org.webrtc.EglRenderer$$ExternalSyntheticLambda8;

public final class SendGiftSheet$$ExternalSyntheticLambda12 implements Consumer {
    public final int $r8$classId;
    public final Object f$0;

    public SendGiftSheet$$ExternalSyntheticLambda12(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void accept(Object obj) {
        char c = 1;
        char c2 = 1;
        Object obj2 = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                SendGiftSheet sendGiftSheet = (SendGiftSheet) obj2;
                sendGiftSheet.getClass();
                if (((BillingResult) obj).zza == 0) {
                    AndroidUtilities.runOnUIThread(new SendGiftSheet$$ExternalSyntheticLambda3(sendGiftSheet, 2));
                }
                break;
            case 1:
                ((DialogsAdapter) obj2).lambda$onBindViewHolder$5((Float) obj);
                break;
            case 2:
                ((ColorPickerBottomSheet.PipetteDelegate) obj2).onColorSelected(((Integer) obj).intValue());
                break;
            case 3:
                int i = ((BillingResult) obj).zza;
                boolean z = i == 0;
                String responseCodeString = z ? null : BillingController.getResponseCodeString(i);
                FileLog.d("StarsController.buy onResult " + z + " " + responseCodeString);
                AndroidUtilities.runOnUIThread(new EglRenderer$$ExternalSyntheticLambda8((Utilities.Callback2) obj2, z, responseCodeString, 8));
                break;
            case 4:
                Float f = (Float) obj;
                BotWebViewSheet botWebViewSheet = (BotWebViewSheet) obj2;
                botWebViewSheet.getClass();
                botWebViewSheet.progressView.setLoadProgressAnimated(f.floatValue());
                if (f.floatValue() == 1.0f) {
                    ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
                    duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
                    duration.addUpdateListener(new BotWebViewSheet$$ExternalSyntheticLambda13(botWebViewSheet, 1));
                    duration.addListener(new BaseChartView.AnonymousClass4(botWebViewSheet, 28));
                    duration.start();
                }
                break;
            default:
                Float f2 = (Float) obj;
                ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout = (ChatAttachAlertBotWebViewLayout) obj2;
                chatAttachAlertBotWebViewLayout.progressView.setLoadProgressAnimated(f2.floatValue());
                if (f2.floatValue() == 1.0f) {
                    ValueAnimator duration2 = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
                    duration2.setInterpolator(CubicBezierInterpolator.DEFAULT);
                    duration2.addUpdateListener(new ChatAttachAlertBotWebViewLayout$$ExternalSyntheticLambda1(chatAttachAlertBotWebViewLayout, c2 == true ? 1 : 0));
                    duration2.addListener(new BotWebViewContainer.AnonymousClass2(chatAttachAlertBotWebViewLayout, c == true ? 1 : 0));
                    duration2.start();
                    chatAttachAlertBotWebViewLayout.requestEnableKeyboard();
                }
                break;
        }
    }
}
