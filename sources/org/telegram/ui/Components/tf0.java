package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
public final class tf0 extends e5.c {
    public final int h;
    public final Object f32946n;

    public tf0(Object obj, Context context, int i10) {
        super(context);
        this.h = i10;
        this.f32946n = obj;
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        MessageObject playingMessageObject;
        switch (this.h) {
            case 0:
                boolean drawChild = super.drawChild(canvas, view, j10);
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f32946n;
                if (view == pipRoundVideoView.f26437c && (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) != null) {
                    pipRoundVideoView.A.set(AndroidUtilities.dpf2(1.5f), AndroidUtilities.dpf2(1.5f), getMeasuredWidth() - AndroidUtilities.dpf2(1.5f), getMeasuredHeight() - AndroidUtilities.dpf2(1.5f));
                    canvas.drawArc(pipRoundVideoView.A, -90.0f, playingMessageObject.audioProgress * 360.0f, false, org.telegram.ui.ActionBar.g6.f23185k2);
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
                s81 s81Var = (s81) this.f32946n;
                if (s81Var.f32578f != null) {
                    ViewGroup.LayoutParams layoutParams = s81Var.d.getLayoutParams();
                    layoutParams.width = getMeasuredWidth();
                    layoutParams.height = getMeasuredHeight();
                    ImageView imageView = s81Var.f32576e;
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
