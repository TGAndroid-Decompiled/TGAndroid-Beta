package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.StickerSetCell;
import org.telegram.ui.Components.UItem;

public final class StickersActivity$$ExternalSyntheticLambda2 implements Utilities.Callback5, Utilities.Callback5Return {
    public final StickersActivity f$0;

    public StickersActivity$$ExternalSyntheticLambda2(StickersActivity stickersActivity) {
        this.f$0 = stickersActivity;
    }

    @Override
    public void mo1067run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        this.f$0.onClick$10((UItem) obj, (View) obj2);
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        UItem uItem = (UItem) obj;
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        StickersActivity stickersActivity = this.f$0;
        boolean z = false;
        if (stickersActivity.selectedSets.isEmpty() && (uItem.object instanceof TLRPC.TL_messages_stickerSet)) {
            stickersActivity.toggleSelected((StickerSetCell) view);
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
