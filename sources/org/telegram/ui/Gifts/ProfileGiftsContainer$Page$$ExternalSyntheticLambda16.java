package org.telegram.ui.Gifts;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.MessagePreviewView;
import org.telegram.ui.Components.MessagePreviewView$Page$$ExternalSyntheticLambda20;
import org.telegram.ui.Components.SharedMediaLayout;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarsController;

public final class ProfileGiftsContainer$Page$$ExternalSyntheticLambda16 implements View.OnClickListener {
    public final int $r8$classId;
    public final FrameLayout f$0;
    public final boolean f$1;
    public final Object f$2;
    public final Object f$3;
    public final Object f$4;

    public ProfileGiftsContainer$Page$$ExternalSyntheticLambda16(FrameLayout frameLayout, boolean z, Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = frameLayout;
        this.f$1 = z;
        this.f$2 = obj;
        this.f$3 = obj2;
        this.f$4 = obj3;
    }

    @Override
    public final void onClick(View view) {
        Object obj = this.f$4;
        Object obj2 = this.f$3;
        Object obj3 = this.f$2;
        boolean z = this.f$1;
        FrameLayout frameLayout = this.f$0;
        int i = 0;
        switch (this.$r8$classId) {
            case 0:
                SharedMediaLayout.AnonymousClass13 anonymousClass13 = ((ProfileGiftsContainer.Page) frameLayout).parent;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj3;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj2;
                if (z) {
                    StarsController.GiftsCollections giftsCollections = anonymousClass13.collections;
                    int i2 = tL_starGiftCollection.collection_id;
                    giftsCollections.getClass();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(savedStarGift);
                    giftsCollections.removeGifts(i2, arrayList);
                    BulletinFactory.of(anonymousClass13.fragment).createSimpleMultiBulletin(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2RemovedFromCollection, StarGiftSheet.getGiftName(savedStarGift.gift), tL_starGiftCollection.title))).show();
                } else {
                    StarsController.GiftsCollections giftsCollections2 = anonymousClass13.collections;
                    int i3 = tL_starGiftCollection.collection_id;
                    giftsCollections2.getClass();
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(savedStarGift);
                    giftsCollections2.addGifts(i3, arrayList2);
                    BulletinFactory.of(anonymousClass13.fragment).createSimpleMultiBulletin(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, StarGiftSheet.getGiftName(savedStarGift.gift), tL_starGiftCollection.title))).show();
                }
                ((ItemOptions) obj).dismiss();
                anonymousClass13.updateTabsShown();
                break;
            default:
                MessagePreviewView.Page page = (MessagePreviewView.Page) frameLayout;
                ChatActivity.AnonymousClass64 anonymousClass64 = page.this$0;
                if (!z) {
                    new BulletinFactory(anonymousClass64, anonymousClass64.resourcesProvider).createSimpleBulletinWithIconSize(R.raw.star_premium_2, 36, AndroidUtilities.replaceSingleTag("Subscribe to **Telegram Premium** to forward formatted messages without the sender’s name.", new MessagePreviewView$Page$$ExternalSyntheticLambda20(page, (Context) obj3, i))).show();
                } else {
                    MessagePreviewParams messagePreviewParams = anonymousClass64.messagePreviewParams;
                    boolean z2 = messagePreviewParams.hideForwardSendersName;
                    messagePreviewParams.hideForwardSendersName = !z2;
                    anonymousClass64.returnSendersNames = false;
                    if (z2) {
                        messagePreviewParams.hideCaption = false;
                        MessagePreviewView.ToggleButton toggleButton = (MessagePreviewView.ToggleButton) obj2;
                        if (toggleButton != null) {
                            toggleButton.setState(false, true);
                        }
                    }
                    ((MessagePreviewView.ToggleButton) obj).setState(messagePreviewParams.hideForwardSendersName, true);
                    page.updateMessages();
                    page.updateSubtitle(true);
                }
                break;
        }
    }
}
