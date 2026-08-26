package org.telegram.ui;

import android.view.View;
import java.util.HashSet;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.bots.BotWebViewSheet;

public final class PhotoViewer$$ExternalSyntheticLambda128 implements View.OnClickListener {
    public final int $r8$classId;
    public final ItemOptions f$0;

    public PhotoViewer$$ExternalSyntheticLambda128(int i, ItemOptions itemOptions) {
        this.$r8$classId = i;
        this.f$0 = itemOptions;
    }

    @Override
    public final void onClick(View view) {
        ItemOptions itemOptions = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                itemOptions.closeSwipeback();
                break;
            case 1:
                itemOptions.closeSwipeback();
                break;
            default:
                HashSet hashSet = BotWebViewSheet.activeSheets;
                if (itemOptions.dismissWithButtons) {
                    itemOptions.dismiss();
                }
                break;
        }
    }

    public PhotoViewer$$ExternalSyntheticLambda128(ItemOptions itemOptions, VoIPFragment$$ExternalSyntheticLambda31 voIPFragment$$ExternalSyntheticLambda31) {
        this.$r8$classId = 2;
        this.f$0 = itemOptions;
    }
}
