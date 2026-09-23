package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
public final class xf0 extends org.telegram.ui.l4 {
    public final int h;
    public final Object f29990n;

    public xf0(Object obj, Context context, int i10) {
        super(context);
        this.h = i10;
        this.f29990n = obj;
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        MessageObject playingMessageObject;
        switch (this.h) {
            case 0:
                boolean drawChild = super.drawChild(canvas, view, j3);
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f29990n;
                if (view == pipRoundVideoView.f22053c && (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) != null) {
                    pipRoundVideoView.E.set(AndroidUtilities.dpf2(1.5f), AndroidUtilities.dpf2(1.5f), getMeasuredWidth() - AndroidUtilities.dpf2(1.5f), getMeasuredHeight() - AndroidUtilities.dpf2(1.5f));
                    canvas.drawArc(pipRoundVideoView.E, -90.0f, playingMessageObject.audioProgress * 360.0f, false, org.telegram.ui.ActionBar.h6.f18912k2);
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.h) {
            case 1:
                super.onMeasure(i10, i11);
                b91 b91Var = (b91) this.f29990n;
                if (b91Var.f22627f != null) {
                    ViewGroup.LayoutParams layoutParams = b91Var.d.getLayoutParams();
                    layoutParams.width = getMeasuredWidth();
                    layoutParams.height = getMeasuredHeight();
                    ImageView imageView = b91Var.e;
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
