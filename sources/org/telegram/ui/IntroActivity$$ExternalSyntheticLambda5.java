package org.telegram.ui;

import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.Cells.ActiveGiftAuctionsHintCell;
import org.telegram.ui.Cells.DialogsHintCell;
import org.telegram.ui.Cells.UnconfirmedAuthHintCell;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ItemOptions;

public final class IntroActivity$$ExternalSyntheticLambda5 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;

    public IntroActivity$$ExternalSyntheticLambda5(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((IntroActivity) this.f$0).lambda$updateColors$6();
                break;
            case 1:
                ((ChannelAdminLogActivity.ChatScrollCallback) this.f$0).lambda$onEndAnimation$0();
                break;
            case 2:
                BulletinFactory.showError((TLRPC.TL_error) this.f$0);
                break;
            case 3:
                ((ChannelWallpaperActivity) this.f$0).lambda$toggleTheme$4();
                break;
            case 4:
                ChatActivity.lambda$processSelectedOption$328((Bulletin.Layout) this.f$0);
                break;
            case 5:
                ((ItemOptions) this.f$0).closeSwipeback();
                break;
            case 6:
                ChatActivity.lambda$didPressPhoneNumber$444((ArticleViewer$$ExternalSyntheticLambda27) this.f$0);
                break;
            case 7:
                ((ActionBarPopupWindow) this.f$0).dismiss();
                break;
            case 8:
                ChatActivity.lambda$createMenu$295((AtomicReference) this.f$0);
                break;
            case 9:
                ((ActionBar) this.f$0).invalidate();
                break;
            case 10:
                ((ChatActivity.ChatScrollCallback) this.f$0).lambda$onEndAnimation$0();
                break;
            case 11:
                ChatUsersActivity.lambda$createMenuForParticipant$11((ChatUsersActivity$$ExternalSyntheticLambda6) this.f$0);
                break;
            case 12:
                ((ChooseQualityLayout.QualityIcon) this.f$0).invalidateSelf();
                break;
            case 13:
                ((ComposeDrawable) this.f$0).invalidate();
                break;
            case 14:
                ContentPreviewViewer.lambda$addVoteOptions$0((ActionBarPopupWindow.ActionBarPopupWindowLayout) this.f$0);
                break;
            case 15:
                DialogsActivity.lambda$showArchiveHelp$89((BottomSheet[]) this.f$0);
                break;
            case 16:
                ((DialogsHintCell) this.f$0).updateColors();
                break;
            case 17:
                ((UnconfirmedAuthHintCell) this.f$0).updateColors();
                break;
            case 18:
                ((ActiveGiftAuctionsHintCell) this.f$0).updateColors();
                break;
            case 19:
                DialogsActivity.lambda$loadDialogs$1((AccountInstance) this.f$0);
                break;
            case 20:
                ((EditWidgetActivity) this.f$0).removeSelfFromStack();
                break;
            case 21:
                ((EmojiAnimationsOverlay) this.f$0).lambda$createDrawingObject$2();
                break;
            case 22:
                ((FilterChatlistActivity) this.f$0).lambda$new$7();
                break;
            case 23:
                ((FilterChatlistActivity.InviteLinkCell) this.f$0).lambda$new$1();
                break;
            case 24:
                ((FilteredSearchView) this.f$0).lambda$new$0();
                break;
            case 25:
                ((FiltersSetupActivity.FilterCell) this.f$0).lambda$new$0();
                break;
            case 26:
                ((FiltersSetupActivity.TouchHelperCallback) this.f$0).resetDefaultPosition();
                break;
            case 27:
                ((GroupCallActivity.CallEncryptionCellDrawable) this.f$0).invalidate();
                break;
            case 28:
                ((GroupCreateFinalActivity) this.f$0).lambda$createView$2();
                break;
            default:
                ((IntroActivity.EGLThread) this.f$0).lambda$shutdown$2();
                break;
        }
    }
}
