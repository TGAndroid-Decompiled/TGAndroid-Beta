package org.telegram.ui.ActionBar;

import android.util.Pair;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.wallpaper.WallpaperBitmapHolder;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.StickerCategoriesListView;
import org.telegram.ui.PollItemMenu$$ExternalSyntheticLambda12;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet;

public final class EmojiThemes$$ExternalSyntheticLambda0 implements Utilities.Callback {
    public final int $r8$classId;
    public final Object f$0;
    public final long f$1;

    public EmojiThemes$$ExternalSyntheticLambda0(Object obj, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = j;
    }

    @Override
    public final void run(Object obj) {
        long peerDialogId;
        switch (this.$r8$classId) {
            case 0:
                WallpaperBitmapHolder wallpaperBitmapHolder = (WallpaperBitmapHolder) obj;
                ResultCallback resultCallback = (ResultCallback) this.f$0;
                if (resultCallback != null) {
                    resultCallback.onComplete(new Pair(Long.valueOf(this.f$1), wallpaperBitmapHolder));
                }
                break;
            case 1:
                TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups = (TLRPC.TL_messages_emojiGroups) obj;
                StickerCategoriesListView stickerCategoriesListView = (StickerCategoriesListView) this.f$0;
                if (tL_messages_emojiGroups != null) {
                    NotificationCenter.getInstance(UserConfig.selectedAccount).doOnIdle(new PollItemMenu$$ExternalSyntheticLambda12(stickerCategoriesListView, tL_messages_emojiGroups, this.f$1, 15));
                }
                break;
            default:
                TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) obj;
                StoryPrivacyBottomSheet.Page page = (StoryPrivacyBottomSheet.Page) this.f$0;
                AlertDialog alertDialog = page.progressDialog;
                if (alertDialog != null) {
                    alertDialog.dismissUnless(350L);
                    page.progressDialog = null;
                }
                if (tL_channels_channelParticipants != null && !tL_channels_channelParticipants.participants.isEmpty()) {
                    TLRPC.TL_chatParticipants tL_chatParticipants = new TLRPC.TL_chatParticipants();
                    for (int i = 0; i < tL_channels_channelParticipants.participants.size(); i++) {
                        TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i);
                        TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                        TLRPC.Peer peer = channelParticipant.peer;
                        if (peer != null) {
                            peerDialogId = DialogObject.getPeerDialogId(peer);
                            if (peerDialogId < 0) {
                            }
                        } else {
                            peerDialogId = channelParticipant.user_id;
                        }
                        tL_chatParticipant.user_id = peerDialogId;
                        tL_chatParticipants.participants.add(tL_chatParticipant);
                    }
                    page.selectChat(this.f$1, tL_chatParticipants);
                    break;
                }
                break;
        }
    }
}
