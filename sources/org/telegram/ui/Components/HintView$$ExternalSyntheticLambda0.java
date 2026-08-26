package org.telegram.ui.Components;

import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.ui.Cells.CheckBoxCell;

public final class HintView$$ExternalSyntheticLambda0 implements View.OnClickListener {
    public final int $r8$classId;
    public final Object f$0;

    public HintView$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                ((HintView) this.f$0).lambda$createCloseButton$0(view);
                break;
            case 1:
                ((Bulletin.LottieLayoutWithReactions.AnonymousClass1) this.f$0).lambda$onShownCustomEmojiReactionDialog$0(view);
                break;
            case 2:
                ((EmojiView.EmojiGridAdapter) this.f$0).lambda$onCreateViewHolder$0(view);
                break;
            case 3:
                ((EmojiView.StickersSearchGridAdapter) this.f$0).lambda$onCreateViewHolder$0(view);
                break;
            case 4:
                ((PhotoViewerWebView.YoutubeProxy) this.f$0).lambda$onPlayerError$1(view);
                break;
            case 5:
                ((SearchDownloadsContainer.DownloadsAdapter) this.f$0).lambda$onBindViewHolder$0(view);
                break;
            case 6:
                ((SharedMediaLayout.ChannelRecommendationsAdapter) this.f$0).lambda$openPreview$1(view);
                break;
            case 7:
                ((StickerMasksAlert.SearchField) this.f$0).lambda$new$0(view);
                break;
            case 8:
                ((ThemeEditorView.EditorAlert.SearchField) this.f$0).lambda$new$0(view);
                break;
            case 9:
                ((AdminLogFilterAlert2) this.f$0).lambda$new$1(view);
                break;
            case 10:
                AlertsCreator.lambda$createBotLaunchAlert$57((AtomicBoolean) this.f$0, view);
                break;
            case 11:
                AlertsCreator.lambda$showOpenExternalBrowserAlert$44((CheckBoxCell) this.f$0, view);
                break;
            case 12:
                ((AvatarConstructorFragment) this.f$0).lambda$createView$0(view);
                break;
            case 13:
                ((BlockingUpdateView) this.f$0).lambda$new$0(view);
                break;
            case 14:
                ((Bulletin.UndoButton) this.f$0).lambda$new$0(view);
                break;
            case 15:
                ((CaptionPhotoViewer) this.f$0).lambda$new$2(view);
                break;
            case 16:
                ((ChatGreetingsView) this.f$0).lambda$setPremiumLock$0(view);
                break;
            case 17:
                ((CreateBotAlert$$ExternalSyntheticLambda4) this.f$0).run();
                break;
            case 18:
                ((DeleteMessagesBottomSheet) this.f$0).lambda$new$1(view);
                break;
            case 19:
                ((EmojiPacksAlert) this.f$0).lambda$new$4(view);
                break;
            case 20:
                ((EmojiTabsStrip) this.f$0).lambda$updateClickListeners$3(view);
                break;
            case 21:
                ((FolderBottomSheet) this.f$0).lambda$init$5(view);
                break;
            case 22:
                ((FragmentSearchField) this.f$0).lambda$new$0(view);
                break;
            case 23:
                ((GigagroupConvertAlert) this.f$0).lambda$new$2(view);
                break;
            case 24:
                ((GroupCallPip) this.f$0).lambda$new$1(view);
                break;
            case 25:
                ((GroupCallPipAlertView) this.f$0).lambda$new$0(view);
                break;
            case 26:
                ((GroupCallRecordAlert) this.f$0).lambda$new$0(view);
                break;
            case 27:
                ((GuardBotReplaceSheet) this.f$0).lambda$new$1(view);
                break;
            case 28:
                ((HashtagActivity) this.f$0).lambda$createView$0(view);
                break;
            default:
                ((ImportingAlert) this.f$0).lambda$new$1(view);
                break;
        }
    }
}
