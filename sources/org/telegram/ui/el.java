package org.telegram.ui;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;

public final class el extends ViewOutlineProvider {

    public final rn f37784a;

    public el(rn rnVar) {
        this.f37784a = rnVar;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        ImageReceiver imageReceiver = (ImageReceiver) view.getTag(R.id.parent_tag);
        if (imageReceiver == null) {
            rn rnVar = this.f37784a;
            outline.setOval(0, 0, AndroidUtilities.roundPlayingMessageSize(rnVar.C9()), AndroidUtilities.roundPlayingMessageSize(rnVar.C9()));
            return;
        }
        int[] roundRadius = imageReceiver.getRoundRadius();
        int iMax = 0;
        for (int i10 = 0; i10 < 4; i10++) {
            iMax = Math.max(iMax, roundRadius[i10]);
        }
        outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), iMax);
    }
}
