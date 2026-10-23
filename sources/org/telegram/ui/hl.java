package org.telegram.ui;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
public final class hl extends ViewOutlineProvider {
    public final sn f37874a;

    public hl(sn snVar) {
        this.f37874a = snVar;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        ImageReceiver imageReceiver = (ImageReceiver) view.getTag(R.id.parent_tag);
        if (imageReceiver != null) {
            int[] roundRadius = imageReceiver.getRoundRadius();
            int i10 = 0;
            for (int i11 = 0; i11 < 4; i11++) {
                i10 = Math.max(i10, roundRadius[i11]);
            }
            outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), i10);
            return;
        }
        sn snVar = this.f37874a;
        outline.setOval(0, 0, AndroidUtilities.roundPlayingMessageSize(snVar.H9()), AndroidUtilities.roundPlayingMessageSize(snVar.H9()));
    }
}
