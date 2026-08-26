package org.telegram.ui;

import android.content.Context;
import androidx.core.math.MathUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.FolderBottomSheet;
import org.telegram.ui.Components.Paint.Views.StickerMakerView;
import org.telegram.ui.Gifts.ProfileGiftsContainer;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.community.sheet.CommunityAddOptionsSheet;
import org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda12;

public final class CacheControlActivity$$ExternalSyntheticLambda23 implements Utilities.Callback {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final int f$2;

    public CacheControlActivity$$ExternalSyntheticLambda23(Object obj, int i, Object obj2, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$2 = i;
        this.f$1 = obj2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                float f = ((int[]) this.f$1)[0];
                float f2 = this.f$2;
                ((ChatActivity$$ExternalSyntheticLambda464) this.f$0).run(Float.valueOf((MathUtils.clamp(((Float) obj).floatValue(), 0.0f, 1.0f) * (1.0f / f2)) + (f / f2)), Boolean.FALSE);
                break;
            case 1:
                FolderBottomSheet folderBottomSheet = (FolderBottomSheet) this.f$0;
                folderBottomSheet.getClass();
                folderBottomSheet.success = ((Boolean) obj).booleanValue();
                folderBottomSheet.lambda$showGiftOfferSheet$15();
                ((Utilities.Callback) this.f$1).run(Integer.valueOf(this.f$2));
                break;
            case 2:
                StickerMakerView stickerMakerView = (StickerMakerView) this.f$0;
                int i = this.f$2;
                PhotoViewer$$ExternalSyntheticLambda26 photoViewer$$ExternalSyntheticLambda26 = (PhotoViewer$$ExternalSyntheticLambda26) this.f$1;
                stickerMakerView.getClass();
                Utilities.themeQueue.postRunnable(new WearAuthSheet$$ExternalSyntheticLambda3(stickerMakerView, i, (List) obj, new ArrayList(), photoViewer$$ExternalSyntheticLambda26, 19));
                break;
            case 3:
                ArrayList arrayList = (ArrayList) obj;
                ProfileGiftsContainer profileGiftsContainer = (ProfileGiftsContainer) this.f$0;
                StarsController.GiftsCollections giftsCollections = profileGiftsContainer.collections;
                int i2 = this.f$2;
                giftsCollections.addGifts(i2, arrayList);
                ((ProfileGiftsContainer.Page) this.f$1).update(true);
                profileGiftsContainer.fillTabs(true);
                profileGiftsContainer.updateTabsShown();
                TL_stars.TL_starGiftCollection tL_starGiftCollectionFindById = giftsCollections.findById(i2);
                if (tL_starGiftCollectionFindById != null) {
                    int size = arrayList.size();
                    BaseFragment baseFragment = profileGiftsContainer.fragment;
                    if (size > 1) {
                        Bulletin bulletinCreateSimpleMultiBulletin = BulletinFactory.of(baseFragment).createSimpleMultiBulletin(((TL_stars.SavedStarGift) arrayList.get(0)).gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2AddedToCollectionMany", arrayList.size(), tL_starGiftCollectionFindById.title)));
                        bulletinCreateSimpleMultiBulletin.hideAfterBottomSheet = false;
                        bulletinCreateSimpleMultiBulletin.show();
                    } else if (arrayList.size() == 1) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) arrayList.get(0);
                        Bulletin bulletinCreateSimpleMultiBulletin2 = BulletinFactory.of(baseFragment).createSimpleMultiBulletin(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, StarGiftSheet.getGiftName(savedStarGift.gift), tL_starGiftCollectionFindById.title)));
                        bulletinCreateSimpleMultiBulletin2.hideAfterBottomSheet = false;
                        bulletinCreateSimpleMultiBulletin2.show();
                    }
                }
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new OAuthSheet$$ExternalSyntheticLambda2((TLRPC.UserFull) obj, (BotWebViewContainer$$ExternalSyntheticLambda12) this.f$0, this.f$2, (TLRPC.User) this.f$1, 16));
                break;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                BaseFragment baseFragment2 = (BaseFragment) this.f$0;
                Context context = baseFragment2.getContext();
                long j = -chat.id;
                int i3 = this.f$2;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.f$1;
                baseFragment2.showDialog(new CommunityAddOptionsSheet(context, chat2, j, new PhotoViewer$$ExternalSyntheticLambda68(baseFragment2, i3, chat, chat2, 3)));
                break;
        }
    }

    public CacheControlActivity$$ExternalSyntheticLambda23(Object obj, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = i;
    }
}
