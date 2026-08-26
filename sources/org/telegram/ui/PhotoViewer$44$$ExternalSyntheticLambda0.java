package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.AdjustPanLayoutHelper;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.Components.Paint.Views.MaskPaintView;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.VideoPlayer;
import org.telegram.ui.Components.voip.GroupCallMiniTextureView;
import org.telegram.ui.Stories.recorder.HintView2;

public final class PhotoViewer$44$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public PhotoViewer$44$$ExternalSyntheticLambda0(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((PhotoViewer.AnonymousClass44) this.f$0).lambda$onAnimationEnd$0((View) this.f$1);
                break;
            case 1:
                ((AutoDeleteMessagesActivity.AnonymousClass2) this.f$0).lambda$run$0((ArrayList) this.f$1);
                break;
            case 2:
                ((CallLogActivity.AnonymousClass3) this.f$0).lambda$onScrolled$0((CallLogActivity.CallLogRow) this.f$1);
                break;
            case 3:
                ((CameraScanActivity) this.f$0).lambda$processShot$14((CameraScanActivity.QrResult) this.f$1);
                break;
            case 4:
                ((ChannelColorActivity.ThemeChooser.AnonymousClass4) this.f$0).lambda$onComplete$0((List) this.f$1);
                break;
            case 5:
                ((ChatActivity.AnonymousClass124) this.f$0).lambda$run$2((MessageObject) this.f$1);
                break;
            case 6:
                ((ChatActivity.AnonymousClass82) this.f$0).lambda$onAnimationEnd$0((SizeNotifierFrameLayout) this.f$1);
                break;
            case 7:
                ((ChatActivity.ChatActivityAdapter.AnonymousClass2.AnonymousClass1) this.f$0).lambda$end$0((ChatActionCell) this.f$1);
                break;
            case 8:
                ((ChatActivity.ChatMessageCellDelegate) this.f$0).lambda$didPressFactCheckWhat$0((HintView2) this.f$1);
                break;
            case 9:
                ((ChatActivity.ChatMessageCellDelegate.AnonymousClass1) this.f$0).lambda$onShareStory$0((Long) this.f$1);
                break;
            case 10:
                ((ChatLinkActivity.ListAdapter.AnonymousClass1) this.f$0).lambda$onJoinToSendToggle$6((TLRPC.Chat) this.f$1);
                break;
            case 11:
                ((ChatUsersActivity.AnonymousClass7) this.f$0).lambda$didSelectUser$0((TLRPC.User) this.f$1);
                break;
            case 12:
                ((DialogsActivity.AnonymousClass11) this.f$0).lambda$didSelectTab$4((ArrayList) this.f$1);
                break;
            case 13:
                ((DialogsActivity.AnonymousClass11) this.f$0).lambda$didSelectTab$6((MessagesController.DialogFilter) this.f$1);
                break;
            case 14:
                ((DialogsActivity.AnonymousClass23) this.f$0).lambda$onTextChanged$1((CharSequence) this.f$1);
                break;
            case 15:
                ((DialogsActivity.AnonymousClass30) this.f$0).lambda$didFinishChatCreation$2((BaseFragment[]) this.f$1);
                break;
            case 16:
                ((FilterChatlistActivity.ListAdapter.AnonymousClass1) this.f$0).lambda$deleteLink$2((AlertDialog) this.f$1);
                break;
            case 17:
                ((FilterCreateActivity) this.f$0).lambda$createView$7((FilterCreateActivity.ItemInner) this.f$1);
                break;
            case 18:
                ((FiltersSetupActivity.ListAdapter) this.f$0).lambda$onCreateViewHolder$8((TLRPC.TL_dialogFilterSuggested) this.f$1);
                break;
            case 19:
                ((GroupCallActivity.AnonymousClass2) this.f$0).lambda$run$0((int[]) this.f$1);
                break;
            case 20:
                ((GroupCallActivity.AnonymousClass2) this.f$0).lambda$run$1((GroupCallMiniTextureView.AnonymousClass1) this.f$1);
                break;
            case 21:
                ((GroupStickersActivity.AddEmojiCell.AnonymousClass1) this.f$0).lambda$afterTextChanged$0((TLObject) this.f$1);
                break;
            case 22:
                ((GroupStickersActivity.AddEmojiCell.AnonymousClass1) this.f$0).lambda$afterTextChanged$2((String) this.f$1);
                break;
            case 23:
                ((GroupStickersActivity.SearchAdapter) this.f$0).lambda$onSearchStickers$2((String) this.f$1);
                break;
            case 24:
                ((KeyboardHideHelper.AnonymousClass2) this.f$0).lambda$onAnimationEnd$0((AdjustPanLayoutHelper) this.f$1);
                break;
            case 25:
                ((ManageLinksActivity.AnonymousClass6) this.f$0).lambda$onLinkCreated$0((TLRPC.TL_chatInviteExported) this.f$1);
                break;
            case 26:
                ((PasscodeActivity.AnonymousClass4) this.f$0).lambda$onItemClick$0((ActionBarMenuSubItem) this.f$1);
                break;
            case 27:
                ((PassportActivity.PhoneConfirmationView.AnonymousClass5) this.f$0).lambda$run$0((TLRPC.TL_error) this.f$1);
                break;
            case 28:
                ((PhotoViewer.AnonymousClass56) this.f$0).lambda$onVideoFrameAboutToBeRendered$0((VideoPlayer) this.f$1);
                break;
            default:
                ((PhotoViewer.AnonymousClass60) this.f$0).lambda$onAnimationEnd$0((MaskPaintView) this.f$1);
                break;
        }
    }
}
