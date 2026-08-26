package org.telegram.ui.Components;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.UserConfig;

public final class EmojiView$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final EmojiView f$0;

    public EmojiView$$ExternalSyntheticLambda1(EmojiView emojiView, int i) {
        this.$r8$classId = i;
        this.f$0 = emojiView;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                EmojiView emojiView = this.f$0;
                emojiView.updateStickerTabs(false);
                emojiView.reloadStickersAdapter();
                break;
            case 1:
                EmojiView emojiView2 = this.f$0;
                emojiView2.emojiGridView.postOnAnimation(new EmojiView$$ExternalSyntheticLambda1(emojiView2, 6));
                break;
            case 2:
                EmojiView.EmojiGridAdapter emojiGridAdapter = this.f$0.emojiAdapter;
                if (emojiGridAdapter != null) {
                    emojiGridAdapter.notifyDataSetChanged(true);
                }
                break;
            case 3:
                EmojiView emojiView3 = this.f$0;
                emojiView3.gifGridView.postOnAnimation(new EmojiView$$ExternalSyntheticLambda1(emojiView3, 6));
                break;
            case 4:
                EmojiView emojiView4 = this.f$0;
                emojiView4.stickersGridView.postOnAnimation(new EmojiView$$ExternalSyntheticLambda1(emojiView4, 6));
                break;
            case 5:
                EmojiView emojiView5 = this.f$0;
                EmojiView.EmojiViewDelegate emojiViewDelegate = emojiView5.delegate;
                if (emojiViewDelegate != null) {
                    emojiViewDelegate.onEmojiSettingsClick(emojiView5.emojiAdapter.frozenEmojiPacks);
                }
                break;
            case 6:
                this.f$0.invalidateBlurCaptures();
                break;
            case 7:
                EmojiView emojiView6 = this.f$0;
                emojiView6.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(emojiView6.currentAccount).getClientUserId());
                emojiView6.fragment.presentFragment(new EmojiView.AnonymousClass3(bundle));
                break;
            case 8:
                EmojiView.EmojiViewDelegate emojiViewDelegate2 = this.f$0.delegate;
                if (emojiViewDelegate2 != null) {
                    emojiViewDelegate2.onAnimatedEmojiUnlockClick();
                }
                break;
            default:
                EmojiView emojiView7 = this.f$0;
                ArrayList<EmojiView.EmojiPack> emojipacks = emojiView7.getEmojipacks();
                for (int i = 0; i < emojipacks.size(); i++) {
                    if (emojipacks.get(i).forGroup) {
                        int i2 = emojiView7.emojiAdapter.sectionToPosition.get(EmojiData.dataColored.length + i);
                        emojiView7.emojiGridView.stopScroll();
                        emojiView7.updateEmojiTabsPosition(i2);
                        emojiView7.scrollEmojisToPosition(i2, AndroidUtilities.dp(-9.0f));
                        emojiView7.checkEmojiTabY(null, 0);
                    }
                }
                break;
        }
    }
}
