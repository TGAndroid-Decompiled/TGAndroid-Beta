package org.telegram.ui.Components;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.PollEditTextCell;
import org.telegram.ui.Cells.StickerEmojiCell;
import org.telegram.ui.Cells.StickerSetNameCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Stars.StarsController;

public final class AIEditorAlert$$ExternalSyntheticLambda16 implements View.OnClickListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public AIEditorAlert$$ExternalSyntheticLambda16(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                ((AIEditorAlert) this.f$0).lambda$new$13((Theme.ResourcesProvider) this.f$1, view);
                break;
            case 1:
                ((AudioPlayerAlert.AnonymousClass8) this.f$0).lambda$createTextView$0((MarqueeTextView) this.f$1, view);
                break;
            case 2:
                ((ChatAttachAlertPollLayout.ListAdapter) this.f$0).lambda$onCreateViewHolder$3((PollEditTextCell) this.f$1, view);
                break;
            case 3:
                ((DeleteMessagesBottomSheet) this.f$0).lambda$fillAction$8((DeleteMessagesBottomSheet.Action) this.f$1, view);
                break;
            case 4:
                ((EmojiView.StickersGridAdapter) this.f$0).lambda$onCreateViewHolder$1((StickerSetNameCell) this.f$1, view);
                break;
            case 5:
                SharedMediaLayout.AnonymousClass5.lambda$onClick$3((StarsController.GiftsList) this.f$0, (SharedMediaLayout$5$$ExternalSyntheticLambda10) this.f$1, view);
                break;
            case 6:
                ((StickersAlert.GridAdapter) this.f$0).lambda$onBindViewHolder$0((StickerEmojiCell) this.f$1, view);
                break;
            case 7:
                ((AIEditorAlert.CreateAiStyleAlert) this.f$0).lambda$new$8((Theme.ResourcesProvider) this.f$1, view);
                break;
            case 8:
                ((Utilities.Callback) this.f$0).run((TL_aicompose.AiComposeTone) this.f$1);
                break;
            case 9:
                AlertsCreator.lambda$createClearOrDeleteDialogAlert$71((boolean[]) this.f$0, (JoinGroupAlert$$ExternalSyntheticLambda3) this.f$1, view);
                break;
            case 10:
                AlertsCreator.lambda$createSingleChoiceDialog$218((AlertDialog.Builder) this.f$0, (DialogInterface.OnClickListener) this.f$1, view);
                break;
            case 11:
                AlertsCreator.lambda$createBirthdayPickerDialog$153((BottomSheet.Builder) this.f$0, (Utilities.Callback) this.f$1, view);
                break;
            case 12:
                AlertsCreator.lambda$showDisableSharingInfo$267((boolean[]) this.f$0, (Runnable) this.f$1, view);
                break;
            case 13:
                AlertsCreator.lambda$createScheduleDatePickerDialog$122((ActionBarMenuItem) this.f$0, (AlertsCreator.ScheduleDatePickerColors) this.f$1, view);
                break;
            case 14:
                ((AudioPlayerAlert) this.f$0).lambda$new$3((float[]) this.f$1, view);
                break;
            case 15:
                ((AudioPlayerAlert) this.f$0).lambda$showMenuOptions$36((ItemOptions) this.f$1, view);
                break;
            case 16:
                ((AvatarConstructorFragment) this.f$0).lambda$showColorPicker$6((boolean[]) this.f$1, view);
                break;
            case 17:
                ((BlockingUpdateView) this.f$0).lambda$new$1((Context) this.f$1, view);
                break;
            case 18:
                ((CaptionPhotoViewer) this.f$0).lambda$new$4((FrameLayout) this.f$1, view);
                break;
            case 19:
                ((ChatAttachAlertLocationLayout.MapOverlayView) this.f$0).lambda$addInfoView$2((ChatAttachAlertLocationLayout.VenueLocation) this.f$1, view);
                break;
            case 20:
                ((ChatAvatarContainer) this.f$0).lambda$new$1((Theme.ResourcesProvider) this.f$1, view);
                break;
            case 21:
                ((ChatThemeBottomSheet) this.f$0).lambda$new$4((ChatActivity) this.f$1, view);
                break;
            case 22:
                ((CreateRtmpStreamBottomSheet) this.f$0).lambda$new$7((TLRPC.Peer) this.f$1, view);
                break;
            case 23:
                ((CustomPhoneKeyboardView) this.f$0).lambda$new$2((String) this.f$1, view);
                break;
            case 24:
                ((DeleteMessagesBottomSheet) this.f$0).lambda$fillItems$10((UniversalAdapter) this.f$1, view);
                break;
            case 25:
                ((DownloadsInfoBottomSheet) this.f$0).lambda$new$1((BaseFragment) this.f$1, view);
                break;
            case 26:
                ((EmojiPacksAlert) this.f$0).lambda$new$1((AnimatedEmojiSpan) this.f$1, view);
                break;
            case 27:
                ((FragmentContextView) this.f$0).lambda$createPlaybackSpeedButton$11((float[]) this.f$1, view);
                break;
            case 28:
                ((FragmentSearchField) this.f$0).lambda$onFiltersChanged$1((ActionBarMenuItem.SearchFilterView) this.f$1, view);
                break;
            default:
                ((GalleryEmptyView) this.f$0).lambda$doOnEmojiButton$2((Utilities.Callback) this.f$1, view);
                break;
        }
    }
}
