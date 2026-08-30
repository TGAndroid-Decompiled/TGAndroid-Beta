package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
public final class cg0 extends org.telegram.ui.o4 {
    public final int h;
    public final Object f23995n;

    public cg0(Object obj, Context context, int i10) {
        super(context);
        this.h = i10;
        this.f23995n = obj;
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        MessageObject playingMessageObject;
        switch (this.h) {
            case 0:
                boolean drawChild = super.drawChild(canvas, view, j10);
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f23995n;
                if (view == pipRoundVideoView.f23072c && (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) != null) {
                    pipRoundVideoView.B.set(AndroidUtilities.dpf2(1.5f), AndroidUtilities.dpf2(1.5f), getMeasuredWidth() - AndroidUtilities.dpf2(1.5f), getMeasuredHeight() - AndroidUtilities.dpf2(1.5f));
                    canvas.drawArc(pipRoundVideoView.B, -90.0f, playingMessageObject.audioProgress * 360.0f, false, org.telegram.ui.ActionBar.j6.f20027k2);
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
                e91 e91Var = (e91) this.f23995n;
                if (e91Var.f24532f != null) {
                    ViewGroup.LayoutParams layoutParams = e91Var.d.getLayoutParams();
                    layoutParams.width = getMeasuredWidth();
                    layoutParams.height = getMeasuredHeight();
                    ImageView imageView = e91Var.e;
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
