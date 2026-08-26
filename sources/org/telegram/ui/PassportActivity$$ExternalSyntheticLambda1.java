package org.telegram.ui;

import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.EmojiView;
import org.telegram.ui.Components.FilterTabsView;
import org.telegram.ui.Components.TermsOfServiceView;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.recorder.DualCameraView;

public final class PassportActivity$$ExternalSyntheticLambda1 implements RequestDelegate {
    public final int $r8$classId;

    public PassportActivity$$ExternalSyntheticLambda1(int i) {
        this.$r8$classId = i;
    }

    private final void run$org$telegram$ui$ArchiveSettingsActivity$$ExternalSyntheticLambda0(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i = 4;
        int i2 = 5;
        switch (this.$r8$classId) {
            case 0:
                AndroidUtilities.runOnUIThread(new PhotoViewer$$ExternalSyntheticLambda21(tLObject, 1));
                break;
            case 1:
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda470(i));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda470(i));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda470(i));
                break;
            case 5:
                boolean z = tLObject instanceof TLRPC.TL_boolTrue;
                break;
            case 6:
                boolean z2 = tLObject instanceof TLRPC.TL_boolTrue;
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda470(i2));
                break;
            case 8:
                Pattern pattern = AlertsCreator.URL_PATTERN;
                break;
            case 9:
                int i3 = EmojiView.AnonymousClass23.$r8$clinit;
                break;
            case 10:
                int i4 = FilterTabsView.$r8$clinit;
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda470(i2));
                break;
            case 12:
                int i5 = TermsOfServiceView.$r8$clinit;
                break;
            case 13:
                int i6 = LoginActivity.LoginActivitySmsView.$r8$clinit;
                break;
            case 14:
                int i7 = PassportActivity.PhoneConfirmationView.$r8$clinit;
                break;
            case 15:
                List list = PaymentFormActivity.WEBVIEW_PROTOCOLS;
                break;
            case 16:
                int i8 = SessionBottomSheet.$r8$clinit;
                break;
            case 17:
                AndroidUtilities.runOnUIThread(new VoIPFragment$$ExternalSyntheticLambda31(i));
                break;
            case 18:
                Comparator comparator = StoriesController.storiesComparator;
                break;
            case 19:
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda470(i2));
                break;
            case 20:
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda470(i2));
                break;
            default:
                int[] iArr = DualCameraView.dualWhitelistByDevice;
                break;
        }
    }
}
