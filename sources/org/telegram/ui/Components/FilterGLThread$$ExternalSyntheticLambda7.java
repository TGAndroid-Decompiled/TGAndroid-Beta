package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.Pair;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.Stories.recorder.StoryEntry;

public final class FilterGLThread$$ExternalSyntheticLambda7 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public FilterGLThread$$ExternalSyntheticLambda7(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((FilterGLThread) this.f$0).lambda$setFilterGLThreadDelegate$1((FilterShaders.FilterShadersDelegate) this.f$1);
                break;
            case 1:
                ((CaptionPhotoViewer) this.f$0).lambda$showAiButton$9((HintView2) this.f$1);
                break;
            case 2:
                ((ChatActivityEnterView) this.f$0).lambda$showAiButton$54((HintView2) this.f$1);
                break;
            case 3:
                ((ChatActivityEnterView) this.f$0).lambda$setEditingMessageObject$76((CharSequence) this.f$1);
                break;
            case 4:
                ((ChatActivityEnterView) this.f$0).lambda$openWebViewMenu$36((ChatActivityEnterView$$ExternalSyntheticLambda3) this.f$1);
                break;
            case 5:
                ((ChatActivityEnterView.ControlsView) this.f$0).lambda$onTouchEvent$5((ShareAlert$23$$ExternalSyntheticLambda0) this.f$1);
                break;
            case 6:
                ((ChatAttachAlert) this.f$0).lambda$onLongClickBotButton$44((TLRPC.TL_attachMenuBot) this.f$1);
                break;
            case 7:
                ((ChatAttachAlert) this.f$0).lambda$showMotionHint$64((HintView2) this.f$1);
                break;
            case 8:
                ((ChatAttachAlert) this.f$0).lambda$showCaptionLimitBulletin$43((ChatActivity) this.f$1);
                break;
            case 9:
                ((ChatAttachAlertAudioLayout) this.f$0).lambda$loadAudio$3((ArrayList) this.f$1);
                break;
            case 10:
                ((ChatAttachAlertAudioLayout) this.f$0).lambda$new$0((ChatAttachAlert) this.f$1);
                break;
            case 11:
                ((ChatAttachAlertContactsLayout.UserCell) this.f$0).lambda$setData$1((ChatAttachAlertContactsLayout.UserCell.CharSequenceCallback) this.f$1);
                break;
            case 12:
                ((ChatAttachAlertContactsLayout.UserCell) this.f$0).lambda$setData$0((CharSequence) this.f$1);
                break;
            case 13:
                ((ChatAttachAlertDocumentLayout.SearchAdapter) this.f$0).lambda$updateSearchResults$5((ArrayList) this.f$1);
                break;
            case 14:
                ((ChatAttachAlertDocumentLayout.SearchAdapter) this.f$0).lambda$search$1((String) this.f$1);
                break;
            case 15:
                ((ChatAttachAlertLocationLayout) this.f$0).lambda$positionMarker$31((float[]) this.f$1);
                break;
            case 16:
                ((ChatAttachAlertPhotoLayout) this.f$0).lambda$applyCameraViewPosition$17((FrameLayout.LayoutParams) this.f$1);
                break;
            case 17:
                CreateBotAlert.lambda$show$4((BottomSheet) this.f$0, (Context) this.f$1);
                break;
            case 18:
                ((CreateRtmpStreamBottomSheet) this.f$0).lambda$new$12((TLObject) this.f$1);
                break;
            case 19:
                ((CreateRtmpStreamBottomSheet) this.f$0).lambda$new$1((ButtonWithCounterView) this.f$1);
                break;
            case 20:
                ((DialogsBotsAdapter.PopularBots) this.f$0).lambda$load$5((TLObject) this.f$1);
                break;
            case 21:
                ((EditCoverButton) this.f$0).lambda$setImage$1((String) this.f$1);
                break;
            case 22:
                ((EditCoverButton) this.f$0).lambda$setImage$0((Bitmap) this.f$1);
                break;
            case 23:
                ((EditTextBoldCursor) this.f$0).lambda$drawHint$1((Canvas) this.f$1);
                break;
            case 24:
                ((FilterGLThread) this.f$0).lambda$updateHDRInfo$0((StoryEntry.HDRInfo) this.f$1);
                break;
            case 25:
                ((Utilities.Callback) this.f$0).run((BaseFragment) this.f$1);
                break;
            case 26:
                ((FolderBottomSheet) this.f$0).lambda$onJoinButtonClicked$8((Pair) this.f$1);
                break;
            case 27:
                ((InviteLinkBottomSheet) this.f$0).lambda$loadCreator$4((TLObject) this.f$1);
                break;
            case 28:
                ((InviteMembersBottomSheet) this.f$0).lambda$onSearchViewTouched$5((EditTextBoldCursor) this.f$1);
                break;
            default:
                JoinToSendSettingsView.lambda$setFullInfo$6((TLRPC.ChatFull) this.f$0, (BaseFragment) this.f$1);
                break;
        }
    }
}
