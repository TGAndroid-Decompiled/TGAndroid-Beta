package org.telegram.ui.Components;

import android.widget.FrameLayout;
import org.telegram.messenger.MessageObject;

public final class Tooltip$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;

    public Tooltip$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((Tooltip) this.f$0).lambda$new$0();
                break;
            case 1:
                ((FrameLayout) this.f$0).invalidate();
                break;
            case 2:
                ((PlayingGameDrawable) this.f$0).checkUpdate();
                break;
            case 3:
                ((RLottieNative) this.f$0).recycle();
                break;
            case 4:
                ((ReactionsContainerLayout) this.f$0).lambda$showCustomEmojiReactionDialog$3();
                break;
            case 5:
                ((RecordedAudioPlayerView) this.f$0).lambda$new$0();
                break;
            case 6:
                ((RecyclerListView) this.f$0).lambda$highlightRowInternal$0();
                break;
            case 7:
                ((SearchDownloadsContainer) this.f$0).lambda$checkFilesExist$3();
                break;
            case 8:
                ((SearchStateDrawable) this.f$0).invalidateSelf();
                break;
            case 9:
                ((SearchTagsList) this.f$0).lambda$updateTags$12();
                break;
            case 10:
                ((SearchViewPager) this.f$0).invalidateBlur();
                break;
            case 11:
                ((SeekBarView) this.f$0).lambda$onTouch$0();
                break;
            case 12:
                ((SeekBarWaveform) this.f$0).invalidate();
                break;
            case 13:
                ((SeekSpeedDrawable) this.f$0).lambda$new$0();
                break;
            case 14:
                ((ShareTopView) this.f$0).lambda$startHintRotation$3();
                break;
            case 15:
                ((ShareTopView.Layout) this.f$0).setVisibility(8);
                break;
            case 16:
                ((SizeNotifierFrameLayout) this.f$0).updateBlurContent();
                break;
            case 17:
                ((SmoothScroller) this.f$0).onEnd();
                break;
            case 18:
                ((StorageDiagramView) this.f$0).onAvatarClick();
                break;
            case 19:
                ((SuggestEmojiView) this.f$0).update();
                break;
            case 20:
                ((SwipeGestureSettingsView) this.f$0).lambda$swapIcons$2();
                break;
            case 21:
                TagEditCell.lambda$showInfoSheet$8((boolean[]) this.f$0);
                break;
            case 22:
                ((TextSelectionHint) this.f$0).hideInternal();
                break;
            case 23:
                ((ThemeSmallPreviewView) this.f$0).lambda$playEmojiAnimation$5();
                break;
            case 24:
                ((TopicSeparator.Cell) this.f$0).lambda$new$0();
                break;
            case 25:
                TranscribeButton.lambda$showOffTranscribe$9((MessageObject) this.f$0);
                break;
            case 26:
                ((TranslateAlert3.Text) this.f$0).lambda$set$0();
                break;
            case 27:
                ((TranslateButton) this.f$0).lambda$onMenuClick$7();
                break;
            case 28:
                ((TypingDotsDrawable) this.f$0).checkUpdate();
                break;
            default:
                ((UndoView) this.f$0).lambda$showWithAction$7();
                break;
        }
    }
}
