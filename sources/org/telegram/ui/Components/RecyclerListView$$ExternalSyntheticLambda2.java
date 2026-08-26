package org.telegram.ui.Components;

import android.util.SparseIntArray;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.WebFile;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.poll.attached.PollAttachedMediaLocation;
import org.telegram.ui.Gifts.ProfileGiftsContainer;
import org.telegram.ui.Stars.StarGiftSheet;

public final class RecyclerListView$$ExternalSyntheticLambda2 implements Utilities.CallbackReturn {
    public final int $r8$classId;
    public final Object f$0;

    public RecyclerListView$$ExternalSyntheticLambda2(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final Object run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                return RecyclerListView.lambda$cachedIsViewTypeShadow$4((SparseIntArray) this.f$0, (Integer) obj);
            case 1:
                return Boolean.valueOf(((ChatAttachAlertAudioLayout) this.f$0).needPlayMessage((MessageObject) obj));
            case 2:
                View view = (View) obj;
                PollAttachedMediaLocation pollAttachedMediaLocation = (PollAttachedMediaLocation) this.f$0;
                ImageReceiver imageReceiver = new ImageReceiver(view);
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(R.raw.map_placeholder, Theme.key_chat_outLocationIcon, (Theme.currentTheme.isDark() ? 3 : 6) * 0.12f);
                svgThumb.setAspectCenter(true);
                svgThumb.setColorKey(Theme.key_chat_inLocationIcon);
                imageReceiver.setImage(ImageLocation.getForWebFile(WebFile.createWithGeoPoint(pollAttachedMediaLocation.media.geo, 300, 168, 15, Math.min(2, (int) Math.ceil(AndroidUtilities.density)))), (String) null, (ImageLocation) null, (String) null, new ClipRoundedDrawable(svgThumb), (Object) null, 0);
                view.addOnAttachStateChangeListener(new StarGiftSheet.Roller.AnonymousClass1(imageReceiver, 4));
                imageReceiver.setRoundRadius(AndroidUtilities.dp(14.0f));
                return new ProfileGiftsContainer.AnonymousClass3(imageReceiver, view.getContext().getResources().getDrawable(R.drawable.map_pin).mutate());
            default:
                return ((UniversalRecyclerView) this.f$0).lambda$setSections$3((View) obj);
        }
    }
}
