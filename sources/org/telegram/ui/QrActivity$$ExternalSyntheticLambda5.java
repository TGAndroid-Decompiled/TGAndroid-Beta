package org.telegram.ui;

import android.graphics.Bitmap;
import android.view.View;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.StickerSetCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Components.AnimatedFileDrawable;
import org.telegram.ui.Components.ShareAlert;

public final class QrActivity$$ExternalSyntheticLambda5 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public QrActivity$$ExternalSyntheticLambda5(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((QrActivity) this.f$0).lambda$onItemSelected$10((Bitmap) this.f$1);
                break;
            case 1:
                PhotoViewer.lambda$switchToPip$93((AnimatedFileDrawable) this.f$0, (Bitmap) this.f$1);
                break;
            case 2:
                ((PhotoViewer) this.f$0).lambda$showShareAlert$90((ShareAlert) this.f$1);
                break;
            case 3:
                ((PollItemMenu) this.f$0).lambda$setCell$6((String) this.f$1);
                break;
            case 4:
                ((PollItemMenu) this.f$0).lambda$setCell$7((TLRPC.PollAnswer) this.f$1);
                break;
            case 5:
                ((PollItemMenu) this.f$0).lambda$setCell$8((byte[]) this.f$1);
                break;
            case 6:
                ((PrivacyControlActivity) this.f$0).lambda$didUploadPhoto$0((TLObject) this.f$1);
                break;
            case 7:
                ((PrivacyControlActivity) this.f$0).lambda$applyCurrentPrivacySettings$13((boolean[]) this.f$1);
                break;
            case 8:
                ((PrivacySettingsActivity) this.f$0).lambda$loadPasswordSettings$21((TL_account.Password) this.f$1);
                break;
            case 9:
                ((PrivacySettingsActivity) this.f$0).lambda$createView$11((TextCheckCell) this.f$1);
                break;
            case 10:
                ((ProfileActivity) this.f$0).lambda$editRow$150((TLRPC.Chat) this.f$1);
                break;
            case 11:
                ((ProfileActivity) this.f$0).lambda$onFragmentCreate$0((CountDownLatch) this.f$1);
                break;
            case 12:
                ((ProfileActivity) this.f$0).lambda$createView$10((boolean[]) this.f$1);
                break;
            case 13:
                ((ProfileActivity) this.f$0).lambda$didReceivedNotification$94((Object[]) this.f$1);
                break;
            case 14:
                ((ProfileActivity) this.f$0).lambda$createView$33((TLObject) this.f$1);
                break;
            case 15:
                ((ProfileActivity) this.f$0).lambda$processOnClickOrPress$65((TL_fragment.TL_collectibleInfo) this.f$1);
                break;
            case 16:
                ((ProfileActivity) this.f$0).lambda$onMemberClick$64((TLRPC.ChatParticipant) this.f$1);
                break;
            case 17:
                ((ProfileActivity) this.f$0).lambda$createView$26((View) this.f$1);
                break;
            case 18:
                ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$1((BaseFragment) this.f$0, (Theme.ResourcesProvider) this.f$1);
                break;
            case 19:
                ((ProfileActivity.SearchAdapter) this.f$0).lambda$loadFaqWebPage$141((ArrayList) this.f$1);
                break;
            case 20:
                ((ProfileActivity.SearchAdapter) this.f$0).lambda$search$144((String) this.f$1);
                break;
            case 21:
                ReportBottomSheet.lambda$setReportChooseOption$2((View[]) this.f$0, (TLRPC.TL_reportResultAddComment) this.f$1);
                break;
            case 22:
                ReportBottomSheet.lambda$setReportChooseOption$0((View[]) this.f$0, (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) this.f$1);
                break;
            case 23:
                ReportBottomSheet.lambda$setReportChooseOption$1((View[]) this.f$0, (TLRPC.TL_reportResultChooseOption) this.f$1);
                break;
            case 24:
                ((SelectAnimatedEmojiDialog) this.f$0).lambda$new$1((BaseFragment) this.f$1);
                break;
            case 25:
                ((SettingsActivity) this.f$0).lambda$onClick$13((TLRPC.TL_attachMenuBot) this.f$1);
                break;
            case 26:
                ((SettingsActivity) this.f$0).lambda$onLongClick$17((String) this.f$1);
                break;
            case 27:
                StakedDiceSheet.lambda$showStakeToast$7((BaseFragment) this.f$0, (Utilities.Callback) this.f$1);
                break;
            case 28:
                ((StickersActivity) this.f$0).lambda$openStickerSetOptions$10((StickerSetCell) this.f$1);
                break;
            default:
                ((ThemeActivity) this.f$0).lambda$updateSunTime$22((String) this.f$1);
                break;
        }
    }
}
