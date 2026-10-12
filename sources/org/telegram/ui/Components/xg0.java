package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
public final class xg0 extends org.telegram.ui.n4 {
    public final int h;
    public final Object f31257n;

    public xg0(Object obj, Context context, int i10) {
        super(context);
        this.h = i10;
        this.f31257n = obj;
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        MessageObject playingMessageObject;
        switch (this.h) {
            case 0:
                boolean drawChild = super.drawChild(canvas, view, j10);
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f31257n;
                if (view == pipRoundVideoView.f23202c && (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) != null) {
                    pipRoundVideoView.E.set(AndroidUtilities.dpf2(1.5f), AndroidUtilities.dpf2(1.5f), getMeasuredWidth() - AndroidUtilities.dpf2(1.5f), getMeasuredHeight() - AndroidUtilities.dpf2(1.5f));
                    canvas.drawArc(pipRoundVideoView.E, -90.0f, playingMessageObject.audioProgress * 360.0f, false, org.telegram.ui.ActionBar.g6.f20024k2);
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.h) {
            case 1:
                super.onMeasure(i10, i11);
                ca1 ca1Var = (ca1) this.f31257n;
                if (ca1Var.f23998f != null) {
                    ViewGroup.LayoutParams layoutParams = ca1Var.d.getLayoutParams();
                    layoutParams.width = getMeasuredWidth();
                    layoutParams.height = getMeasuredHeight();
                    ImageView imageView = ca1Var.e;
                    if (imageView != null) {
                        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
                        layoutParams2.width = getMeasuredWidth();
                        layoutParams2.height = getMeasuredHeight();
                        return;
                    }
                    return;
                }
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }
}
