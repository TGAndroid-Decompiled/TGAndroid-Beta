package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.Cells.RadioColorCell;
import org.telegram.ui.Components.EmojiView;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public final class WearAuthSheet$$ExternalSyntheticLambda1 implements View.OnClickListener {
    public final int $r8$classId;
    public final Object f$0;
    public final int f$1;
    public final Object f$2;

    public WearAuthSheet$$ExternalSyntheticLambda1(Object obj, int i, Object obj2, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = i;
        this.f$2 = obj2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                WearAuthSheet.lambda$showEmojis$9((ButtonWithCounterView) this.f$0, this.f$1, (BottomSheet) this.f$2, view);
                break;
            case 1:
                ((SelectAnimatedEmojiDialog.Adapter) this.f$0).lambda$onBindViewHolder$0((EmojiView.EmojiPack) this.f$2, this.f$1, view);
                break;
            case 2:
                ((ChannelMonetizationLayout) this.f$0).lambda$new$11(this.f$1, (BaseFragment) this.f$2, view);
                break;
            case 3:
                ((ChatActivity) this.f$0).lambda$createMenu$283((ActionBarPopupWindow.ActionBarPopupWindowLayout) this.f$2, this.f$1, view);
                break;
            case 4:
                ((ChatActivity) this.f$0).lambda$createMenu$285(this.f$1, (ArrayList) this.f$2, view);
                break;
            case 5:
                ((DialogsActivity) this.f$0).lambda$openAccountSelector$176(this.f$1, (ItemOptions) this.f$2, view);
                break;
            case 6:
                ((MainTabsActivity) this.f$0).lambda$openAccountSelector$12(this.f$1, (ItemOptions) this.f$2, view);
                break;
            case 7:
                NotificationsCustomSettingsActivity.lambda$createView$15((boolean[]) this.f$0, this.f$1, (RadioColorCell[]) this.f$2, view);
                break;
            default:
                ((SaveToGallerySettingsActivity) this.f$0).lambda$createView$3((ActionBarPopupWindow) this.f$2, this.f$1, view);
                break;
        }
    }

    public WearAuthSheet$$ExternalSyntheticLambda1(Object obj, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$1 = i;
    }
}
