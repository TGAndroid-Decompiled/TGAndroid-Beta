package org.telegram.ui.bots;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Cells.AudioPlayerCell;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Components.ButtonSpan;
import org.telegram.ui.Components.Reactions.BackSpaceButtonView;
import org.telegram.ui.Components.chat.layouts.ChatActivityActionsButtonsLayout;
import org.telegram.ui.Components.voip.RTMPStreamPipOverlay;
import org.telegram.ui.Gifts.AuctionBidSheet;
import org.telegram.ui.Gifts.AuctionJoinSheet;
import org.telegram.ui.Gifts.AuctionWearingSheet;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stars.StarGiftPreviewSheet;
import org.telegram.ui.Stories.LiveStoryPipOverlay;
import org.telegram.ui.Stories.recorder.LivePlayerView;
import org.telegram.ui.iv.ChatAttachAlertRichLayout;

public final class BotAdView$$ExternalSyntheticLambda0 implements View.OnClickListener {
    public final int $r8$classId;

    public BotAdView$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    private final void onClick$org$telegram$ui$Stars$StarGiftSheet$ResaleBuyTransferAlert$$ExternalSyntheticLambda3(View view) {
    }

    private final void onClick$org$telegram$ui$iv$RichEditorToolbar$$ExternalSyntheticLambda0(View view) {
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                int i = BotAdView.$r8$clinit;
                break;
            case 1:
                int i2 = AudioPlayerCell.$r8$clinit;
                break;
            case 2:
                PhotoViewer.getInstance().zoomOut();
                break;
            case 3:
                try {
                    view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")));
                } catch (ActivityNotFoundException e) {
                    FileLog.e(e);
                    return;
                }
                break;
            case 4:
                int i3 = BackSpaceButtonView.$r8$clinit;
                break;
            case 5:
                int i4 = ChatActivityActionsButtonsLayout.$r8$clinit;
                break;
            case 6:
                RTMPStreamPipOverlay.instance.dismissInternal$1();
                break;
            case 7:
                CheckBoxCell checkBoxCell = (CheckBoxCell) view;
                checkBoxCell.setChecked(!checkBoxCell.isChecked(), true);
                break;
            case 8:
                int i5 = AuctionBidSheet.$r8$clinit;
                break;
            case 9:
                ButtonSpan.TextViewButtons[] textViewButtonsArr = AuctionJoinSheet.ref;
                break;
            case 10:
                int i6 = AuctionWearingSheet.$r8$clinit;
                break;
            case 11:
                int i7 = StarGiftPreviewSheet.$r8$clinit;
                break;
            case 13:
                LiveStoryPipOverlay.instance.dismissInternal(true);
                break;
            case 14:
                int i8 = LivePlayerView.EmptyView.$r8$clinit;
                break;
            case 15:
                PhotoViewer.getInstance().zoomOut();
                break;
        }
    }

    public BotAdView$$ExternalSyntheticLambda0(ChatAttachAlertRichLayout.AnonymousClass2 anonymousClass2) {
        this.$r8$classId = 16;
    }
}
