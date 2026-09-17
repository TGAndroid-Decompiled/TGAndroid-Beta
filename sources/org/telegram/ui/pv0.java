package org.telegram.ui;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
public final class pv0 extends ViewOutlineProvider {
    @Override
    public final void getOutline(View view, Outline outline) {
        ImageReceiver imageReceiver = (ImageReceiver) view.getTag(R.id.parent_tag);
        if (imageReceiver != null) {
            int[] roundRadius = imageReceiver.getRoundRadius(true);
            int i10 = 0;
            for (int i11 = 0; i11 < 4; i11++) {
                i10 = Math.max(i10, roundRadius[i11]);
            }
            outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), i10);
            return;
        }
        int i12 = AndroidUtilities.roundMessageSize;
        outline.setOval(0, 0, i12, i12);
    }
}
