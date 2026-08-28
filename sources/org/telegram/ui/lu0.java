package org.telegram.ui;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
public final class lu0 extends ViewOutlineProvider {
    @Override
    public final void getOutline(View view, Outline outline) {
        ImageReceiver imageReceiver = (ImageReceiver) view.getTag(R.id.parent_tag);
        if (imageReceiver != null) {
            int[] roundRadius = imageReceiver.getRoundRadius(true);
            int i9 = 0;
            for (int i10 = 0; i10 < 4; i10++) {
                i9 = Math.max(i9, roundRadius[i10]);
            }
            outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), i9);
            return;
        }
        int i11 = AndroidUtilities.roundMessageSize;
        outline.setOval(0, 0, i11, i11);
    }
}
