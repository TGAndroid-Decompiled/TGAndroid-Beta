package org.telegram.ui;

import android.view.View;
import com.google.android.exoplayer2.util.Consumer;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;

public final class ChatActivity$$ExternalSyntheticLambda240 implements Consumer {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public ChatActivity$$ExternalSyntheticLambda240(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ((ChatActivity) this.f$0).lambda$processInlineBotWebView$123((ChatActivity$$ExternalSyntheticLambda80) this.f$1, (Boolean) obj);
                break;
            case 1:
                ((ChannelColorActivity.PeerColorPicker) this.f$0).lambda$updateColors$1((MessagesController.PeerColors) this.f$1, (View) obj);
                break;
            case 2:
                ((ChannelColorActivity) this.f$0).lambda$new$0((TLRPC.Chat) this.f$1, (TL_stories.TL_premium_boostsStatus) obj);
                break;
            case 3:
                ((ChannelMonetizationLayout) this.f$0).lambda$onClick$34((LimitReachedBottomSheet) this.f$1, (ChannelBoostsController.CanApplyBoost) obj);
                break;
            case 4:
                ((ProfileActivity) this.f$0).lambda$createView$13((AlertDialog) this.f$1, (Boolean) obj);
                break;
            default:
                ((SettingsActivity) this.f$0).lambda$onClick$15((TLRPC.TL_attachMenuBot) this.f$1, (Boolean) obj);
                break;
        }
    }
}
