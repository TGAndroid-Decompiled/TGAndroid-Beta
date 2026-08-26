package org.telegram.ui.Stories.recorder;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Stories.StoryViewer$5$$ExternalSyntheticLambda0;
import org.telegram.ui.iv.RichTableCell$$ExternalSyntheticLambda3;

public final class StoryEntry$$ExternalSyntheticLambda12 implements RequestDelegate {
    public final int $r8$classId;
    public final Object f$0;

    public StoryEntry$$ExternalSyntheticLambda12(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                StoryEntry storyEntry = (StoryEntry) this.f$0;
                storyEntry.getClass();
                AndroidUtilities.runOnUIThread(new RichTableCell$$ExternalSyntheticLambda3(2, storyEntry, tLObject));
                break;
            case 1:
                EmojiBottomSheet.GifPage.GifAdapter gifAdapter = (EmojiBottomSheet.GifPage.GifAdapter) this.f$0;
                gifAdapter.getClass();
                AndroidUtilities.runOnUIThread(new StoryViewer$5$$ExternalSyntheticLambda0(19, gifAdapter, tLObject));
                break;
            case 2:
                SelectAudioAlert selectAudioAlert = (SelectAudioAlert) this.f$0;
                selectAudioAlert.getClass();
                AndroidUtilities.runOnUIThread(new RichTableCell$$ExternalSyntheticLambda3(1, selectAudioAlert, tLObject));
                break;
            default:
                StoryLinkSheet storyLinkSheet = (StoryLinkSheet) this.f$0;
                storyLinkSheet.getClass();
                AndroidUtilities.runOnUIThread(new RichTableCell$$ExternalSyntheticLambda3(3, storyLinkSheet, tLObject));
                break;
        }
    }
}
