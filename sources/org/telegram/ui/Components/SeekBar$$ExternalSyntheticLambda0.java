package org.telegram.ui.Components;

import android.util.Pair;
import io.noties.markwon.html.HtmlTag;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;

public final class SeekBar$$ExternalSyntheticLambda0 implements Comparator {
    public final int $r8$classId;

    public SeekBar$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return SeekBar.lambda$updateTimestamps$0((Pair) obj, (Pair) obj2);
            case 1:
                return PollVotesAlert.lambda$updateButtons$5((PollVotesAlert.Button) obj, (PollVotesAlert.Button) obj2);
            case 2:
                return AlertsCreator.lambda$createTimezonePickerDialog$101((TLRPC.TL_timezone) obj, (TLRPC.TL_timezone) obj2);
            case 3:
                return BackButtonMenu.lambda$getStackedHistoryDialogs$2((BackButtonMenu.PulledDialog) obj, (BackButtonMenu.PulledDialog) obj2);
            case 4:
                return BackButtonMenu.lambda$getStackedHistoryForTopic$1((BackButtonMenu.PulledDialog) obj, (BackButtonMenu.PulledDialog) obj2);
            case 5:
                return CacheChart.lambda$setSegments$0((CacheChart.SegmentSize) obj, (CacheChart.SegmentSize) obj2);
            case 6:
                return InstantCameraView.lambda$chooseOptimalSize$4((org.telegram.messenger.camera.Size) obj, (org.telegram.messenger.camera.Size) obj2);
            case 7:
                return MarkdownParser.BlockVisitor.lambda$finish$0((HtmlTag.Block) obj, (HtmlTag.Block) obj2);
            case 8:
                return PasscodeView.lambda$new$5((Integer) obj, (Integer) obj2);
            case 9:
                return RecyclerListView.SectionsDrawer.lambda$draw$0((RecyclerListView.SectionsDrawer.Section) obj, (RecyclerListView.SectionsDrawer.Section) obj2);
            case 10:
                return SeekBarView.lambda$updateTimestamps$1((Pair) obj, (Pair) obj2);
            case 11:
                return ShareAlert.ShareSearchAdapter.lambda$searchDialogsInternal$0(obj, obj2);
            case 12:
                return SharedMediaLayout.lambda$loadFastScrollData$36((SharedMediaLayout.Period) obj, (SharedMediaLayout.Period) obj2);
            default:
                return VideoPlayerSeekBar.lambda$updateTimestamps$1((Pair) obj, (Pair) obj2);
        }
    }
}
