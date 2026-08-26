package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.ViewPagerFixed;

public final class PollItemMenu$$ExternalSyntheticLambda15 implements Utilities.Callback {
    public final int $r8$classId;
    public final Object f$0;

    public PollItemMenu$$ExternalSyntheticLambda15(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ((ViewPagerFixed) this.f$0).scrollToPosition(((Integer) obj).intValue());
                break;
            case 1:
                ((ChatRightsEditActivity.ListAdapter) this.f$0).lambda$onBindViewHolder$4((String) obj);
                break;
            case 2:
                ((ChatUsersActivity.ListAdapter) this.f$0).lambda$onBindViewHolder$4((Integer) obj);
                break;
            case 3:
                ((FiltersSetupActivity.ListAdapter) this.f$0).lambda$onCreateViewHolder$2((Boolean) obj);
                break;
            case 4:
                ((QrActivity.QrView) this.f$0).lambda$new$4((TLRPC.TL_exportedContactToken) obj);
                break;
            case 5:
                ((ArticleViewer.Sheet) this.f$0).lambda$new$0((Integer) obj);
                break;
            case 6:
                ((ChannelColorActivity) this.f$0).lambda$createView$3((TLRPC.WallPaper) obj);
                break;
            case 7:
                ((ChannelWallpaperActivity) this.f$0).lambda$createView$1((TLRPC.WallPaper) obj);
                break;
            case 8:
                ((ContactAddActivity) this.f$0).lambda$createView$13((TL_account.TL_birthday) obj);
                break;
            case 9:
                ((GroupCallActivity.EmojiSlot) this.f$0).lambda$updateEmoji$1((TLRPC.TL_messages_stickerSet) obj);
                break;
            case 10:
                ((LiteModeSettingsActivity) this.f$0).lambda$new$1((Boolean) obj);
                break;
            case 11:
                ((LoginActivity.LoginPayView) this.f$0).lambda$setParams$13((String) obj);
                break;
            case 12:
                ((MessageSendPreview) this.f$0).lambda$allowEffectSelector$6((Integer) obj);
                break;
            case 13:
                ((MultiContactsSelectorBottomSheet) this.f$0).onSearch((String) obj);
                break;
            case 14:
                ((NewContactBottomSheet) this.f$0).lambda$doOnDone$21((Boolean) obj);
                break;
            case 15:
                ((PeerColorActivity) this.f$0).lambda$createView$0((Integer) obj);
                break;
            case 16:
                ((PeerColorActivity.Page.EmptyView) this.f$0).lambda$new$0((Boolean) obj);
                break;
            case 17:
                ((PostSuggestionsEditActivity) this.f$0).lambda$fillItems$1((Integer) obj);
                break;
            case 18:
                ((PrivacySettingsActivity) this.f$0).lambda$createView$20((ArrayList) obj);
                break;
            case 19:
                ProfileActivity.lambda$showStarRatingBottomSheet$157((LinkSpanDrawable.LinksTextView[]) this.f$0, (Boolean) obj);
                break;
            case 20:
                ((StickersActivity) this.f$0).setQuickReactionImage((View) obj);
                break;
            case 21:
                ((ThemeActivity) this.f$0).lambda$createView$2((TL_account.contentSettings) obj);
                break;
            case 22:
                ((ThemePreviewActivity) this.f$0).lambda$createView$10((Float) obj);
                break;
            default:
                ((VoIPFragment) this.f$0).lambda$replaceEmojiToLottieFrame$44((TLRPC.TL_messages_stickerSet) obj);
                break;
        }
    }
}
