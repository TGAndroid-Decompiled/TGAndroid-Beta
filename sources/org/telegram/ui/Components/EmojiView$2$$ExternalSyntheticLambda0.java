package org.telegram.ui.Components;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.PhotoViewer;

public final class EmojiView$2$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public EmojiView$2$$ExternalSyntheticLambda0(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((EmojiView.AnonymousClass2) this.f$0).lambda$deleteSticker$1((TLObject) this.f$1);
                break;
            case 1:
                ((ChatAttachAlert) this.f$0).lambda$new$11((ChatAttachAlert.AttachBotButton) this.f$1);
                break;
            case 2:
                ((ChatGreetingsView.AnonymousClass2) this.f$0).lambda$didSetImageBitmap$0((Runnable) this.f$1);
                break;
            case 3:
                ((ChatThemeBottomSheet.AnonymousClass7) this.f$0).lambda$onComplete$0((List) this.f$1);
                break;
            case 4:
                ((ChatThemeBottomSheet.AnonymousClass8) this.f$0).lambda$onComplete$0((List) this.f$1);
                break;
            case 5:
                ((EmojiPacksAlert.AnonymousClass1) this.f$0).lambda$setAsEmojiStatus$0((TLRPC.EmojiStatus) this.f$1);
                break;
            case 6:
                ((EmojiView.AnonymousClass2) this.f$0).lambda$setAsEmojiStatus$0((TLRPC.EmojiStatus) this.f$1);
                break;
            case 7:
                ((EmojiView.EmojiPackHeader) this.f$0).lambda$uninstall$8((TLRPC.TL_messages_stickerSet) this.f$1);
                break;
            case 8:
                ((EmojiView.EmojiSearchAdapter.AnonymousClass5) this.f$0).lambda$loadNext$0((ArrayList) this.f$1);
                break;
            case 9:
                ((EmojiView.EmojiSearchAdapter.AnonymousClass5) this.f$0).lambda$run$8((String) this.f$1);
                break;
            case 10:
                ((EmojiView.GifAdapter) this.f$0).lambda$searchBotUser$0((TLObject) this.f$1);
                break;
            case 11:
                ((EmojiView.GifAdapter) this.f$0).lambda$search$2((String) this.f$1);
                break;
            case 12:
                ((InstantCameraView.VideoRecorder) this.f$0).lambda$handleStopRecording$6((InstantCameraView.SendOptions) this.f$1);
                break;
            case 13:
                ((InstantCameraView.VideoRecorder.GenerateKeyframeThumbTask) this.f$0).lambda$run$0((Bitmap) this.f$1);
                break;
            case 14:
                ((InviteLinkBottomSheet.Adapter.AnonymousClass2) this.f$0).lambda$removeLink$2((TLRPC.TL_error) this.f$1);
                break;
            case 15:
                ((PhotoViewer) this.f$0).showCaptionLimitBulletin((SizeNotifierFrameLayoutPhoto) this.f$1);
                break;
            case 16:
                ((ProfileActionsView) this.f$0).lambda$onTouchEvent$0((ProfileActionsView.Action) this.f$1);
                break;
            case 17:
                ((SearchViewPager.AnonymousClass1) this.f$0).lambda$openSponsoredOptions$4((TLRPC.TL_sponsoredPeer) this.f$1);
                break;
            case 18:
                ((SearchViewPager.AnonymousClass1) this.f$0).lambda$openSponsoredOptions$2((DialogsActivity) this.f$1);
                break;
            case 19:
                ((SharedMediaLayout.ChannelRecommendationsAdapter) this.f$0).lambda$openPreview$2((TLRPC.Chat) this.f$1);
                break;
            case 20:
                ((SuggestEmojiView.AnonymousClass1) this.f$0).lambda$setAsEmojiStatus$0((TLRPC.EmojiStatus) this.f$1);
                break;
            case 21:
                ThanosEffect.DrawingThread.lambda$animate$4((Runnable) this.f$0, (Runnable) this.f$1);
                break;
            case 22:
                TranslateAlert2.AnonymousClass5.lambda$run$0((Utilities.Callback2) this.f$0, (String) this.f$1);
                break;
            case 23:
                ((VideoPlayer.VisualizerBufferSink) this.f$0).lambda$handleBuffer$1((float[]) this.f$1);
                break;
            case 24:
                ((WebPlayerView.YoutubeVideoTask) this.f$0).lambda$doInBackground$1((String) this.f$1);
                break;
            case 25:
                ((AIEditorAlert) this.f$0).lambda$new$4((TL_aicompose.TL_aiComposeTone) this.f$1);
                break;
            case 26:
                ((AIEditorAlert.AiStyleAlert) this.f$0).lambda$fillItems$5((TL_aicompose.TL_aiComposeTone) this.f$1);
                break;
            case 27:
                ((Utilities.Callback) this.f$0).run((HashMap) this.f$1);
                break;
            case 28:
                ((BlockingUpdateView) this.f$0).lambda$show$2((TLObject) this.f$1);
                break;
            default:
                ((Bulletin) this.f$0).onLoaded((CharSequence) this.f$1);
                break;
        }
    }
}
