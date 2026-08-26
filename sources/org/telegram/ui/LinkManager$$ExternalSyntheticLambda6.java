package org.telegram.ui;

import android.graphics.Bitmap;
import android.text.style.ClickableSpan;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.ui.Components.UniversalAdapter;

public final class LinkManager$$ExternalSyntheticLambda6 implements Utilities.Callback2 {
    public final int $r8$classId;
    public final Object f$0;

    public LinkManager$$ExternalSyntheticLambda6(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ((LinkManager) this.f$0).lambda$handleAiStyle$22((TL_aicompose.Tones) obj, (TLRPC.TL_error) obj2);
                break;
            case 1:
                ((AvatarPreviewer.Layout) this.f$0).lambda$prepareBlurBitmap$1((Bitmap) obj, (Bitmap) obj2);
                break;
            case 2:
                ((ContentPreviewViewer.AnonymousClass1) this.f$0).lambda$run$3((CharSequence) obj, (Utilities.Callback) obj2);
                break;
            case 3:
                ((Runnable) this.f$0).run();
                break;
            case 4:
                ((ReportBottomSheet.Page) this.f$0).fillItems((ArrayList) obj, (UniversalAdapter) obj2);
                break;
            case 5:
                ((SelectChatUserSheet.ParticipantsList) this.f$0).lambda$load$0((TLRPC.channels_ChannelParticipants) obj, (TLRPC.TL_error) obj2);
                break;
            case 6:
                ((CallLogActivity) this.f$0).fillItems((ArrayList) obj, (UniversalAdapter) obj2);
                break;
            case 7:
                ((ChannelMonetizationLayout) this.f$0).fillItems((ArrayList) obj, (UniversalAdapter) obj2);
                break;
            case 8:
                ((ChannelMonetizationLayout.ChannelTransactionsView.Page) this.f$0).fillItems((ArrayList) obj, (UniversalAdapter) obj2);
                break;
            case 9:
                ((ChatEditActivity) this.f$0).lambda$createView$47((TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                break;
            case 10:
                ((ChatUsersActivity) this.f$0).lambda$deletePeer$22((TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                break;
            case 11:
                ChooseSpeedLayout.lambda$new$1((ChooseSpeedLayout.Callback) this.f$0, (Float) obj, (Boolean) obj2);
                break;
            case 12:
                ((ContactAddActivity) this.f$0).fillItems((ArrayList) obj, (UniversalAdapter) obj2);
                break;
            case 13:
                ((ContentPreviewViewer) this.f$0).lambda$prepareBlurBitmap$15((Bitmap) obj, (Bitmap) obj2);
                break;
            case 14:
                ((CreateGroupCallSheet) this.f$0).fillItems((ArrayList) obj, (UniversalAdapter) obj2);
                break;
            case 15:
                ((DialogsActivity) this.f$0).lambda$createView$24((Long) obj, (Long) obj2);
                break;
            case 16:
                ((EnableTopicsActivity) this.f$0).fillItems((ArrayList) obj, (UniversalAdapter) obj2);
                break;
            case 17:
                ((PostSuggestionsEditActivity) this.f$0).fillItems((ArrayList) obj, (UniversalAdapter) obj2);
                break;
            case 18:
                ((PrivacySettingsActivity) this.f$0).lambda$loadPasskeys$23((TL_account.Passkeys) obj, (TLRPC.TL_error) obj2);
                break;
            case 19:
                ((ProfileActivity) this.f$0).lambda$updateScrimSourceBitmap$163((Bitmap) obj, (Bitmap) obj2);
                break;
            case 20:
                ((ProfileActivity2) this.f$0).fillItems((ArrayList) obj, (UniversalAdapter) obj2);
                break;
            case 21:
                ((RevenueSharingAdsInfoBottomSheet) this.f$0).fillItems((ArrayList) obj, (UniversalAdapter) obj2);
                break;
            case 22:
                ((SearchAdsInfoBottomSheet) this.f$0).fillItems((ArrayList) obj, (UniversalAdapter) obj2);
                break;
            case 23:
                ((SecretMediaViewer) this.f$0).onLinkClick((ClickableSpan) obj, (TextView) obj2);
                break;
            case 24:
                ((SelectChatUserSheet) this.f$0).fillItems((ArrayList) obj, (UniversalAdapter) obj2);
                break;
            case 25:
                ((SelectStoriesBottomSheet) this.f$0).fillItems((ArrayList) obj, (UniversalAdapter) obj2);
                break;
            case 26:
                ((SettingsActivity) this.f$0).fillItems((ArrayList) obj, (UniversalAdapter) obj2);
                break;
            default:
                ((StakedDiceSheet) this.f$0).fillItems((ArrayList) obj, (UniversalAdapter) obj2);
                break;
        }
    }
}
