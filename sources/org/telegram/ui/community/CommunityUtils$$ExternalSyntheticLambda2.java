package org.telegram.ui.community;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.Paint.Views.StickerMakerView;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda15;
import org.telegram.ui.Gifts.ProfileGiftsContainer;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda65;
import org.telegram.ui.bots.BotBiometry$$ExternalSyntheticLambda8;
import org.telegram.ui.community.sheet.CommunityAddOptionsSheet;
import org.telegram.ui.iv.RichTextCell$$ExternalSyntheticLambda9;
import org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda22;

public final class CommunityUtils$$ExternalSyntheticLambda2 implements Utilities.Callback {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final int f$2;

    public CommunityUtils$$ExternalSyntheticLambda2(Object obj, int i, Object obj2, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$2 = i;
        this.f$1 = obj2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                BaseFragment baseFragment = (BaseFragment) this.f$0;
                Context context = baseFragment.getContext();
                long j = -chat.id;
                int i = this.f$2;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.f$1;
                baseFragment.showDialog(new CommunityAddOptionsSheet(context, chat2, j, new RichTextCell$$ExternalSyntheticLambda9(baseFragment, i, chat, chat2, 2)));
                break;
            case 1:
                StickerMakerView stickerMakerView = (StickerMakerView) this.f$0;
                int i2 = this.f$2;
                PhotoViewer$$ExternalSyntheticLambda65 photoViewer$$ExternalSyntheticLambda65 = (PhotoViewer$$ExternalSyntheticLambda65) this.f$1;
                stickerMakerView.getClass();
                Utilities.themeQueue.postRunnable(new GiftSheet$$ExternalSyntheticLambda15(stickerMakerView, i2, (List) obj, new ArrayList(), photoViewer$$ExternalSyntheticLambda65, 15));
                break;
            case 2:
                ((ProfileGiftsContainer) this.f$0).lambda$addGifts$21(this.f$2, (ProfileGiftsContainer.Page) this.f$1, (ArrayList) obj);
                break;
            default:
                AndroidUtilities.runOnUIThread(new BotBiometry$$ExternalSyntheticLambda8((TLRPC.UserFull) obj, (BotWebViewContainer$$ExternalSyntheticLambda22) this.f$0, this.f$2, (TLRPC.User) this.f$1, 12));
                break;
        }
    }

    public CommunityUtils$$ExternalSyntheticLambda2(BaseFragment baseFragment, TLRPC.Chat chat, int i) {
        this.$r8$classId = 0;
        this.f$0 = baseFragment;
        this.f$1 = chat;
        this.f$2 = i;
    }
}
