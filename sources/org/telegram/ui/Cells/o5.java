package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
public final class o5 extends FrameLayout {
    public final t5 f20745a;

    public o5(t5 t5Var, Context context) {
        super(context);
        this.f20745a = t5Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        float measuredWidth;
        float measuredHeight;
        int i10;
        t5 t5Var = this.f20745a;
        p5 p5Var = t5Var.f21184a;
        if (t5Var.M != null && view == p5Var) {
            boolean drawChild = super.drawChild(canvas, view, j3);
            if (t5Var.N) {
                Rect rect = t5.f21183a0;
                MediaController.PhotoEntry photoEntry = t5Var.G;
                if (photoEntry == null || !photoEntry.isAttachSpoilerRevealed) {
                    t5Var.M.c(canvas, t5Var.f21185b, p5Var.getMeasuredWidth(), p5Var.getMeasuredHeight(), 1.0f, false);
                    MediaController.PhotoEntry photoEntry2 = t5Var.G;
                    if (photoEntry2 != null && photoEntry2.starsAmount > 0 && p5Var.f29936y != null) {
                        Path path = p5Var.E;
                        if (path == null) {
                            p5Var.E = new Path();
                        } else {
                            path.rewind();
                        }
                        int i11 = p5Var.f29929c;
                        if (i11 != -1 && (i10 = p5Var.d) != -1) {
                            measuredWidth = i11;
                            measuredHeight = i10;
                        } else {
                            measuredWidth = p5Var.getMeasuredWidth();
                            measuredHeight = p5Var.getMeasuredHeight();
                        }
                        float dp = p5Var.f29936y.f28357c + AndroidUtilities.dp(18.0f);
                        float f7 = (measuredWidth - dp) / 2.0f;
                        float f10 = measuredHeight / 2.0f;
                        RectF rectF = AndroidUtilities.rectTmp;
                        float dp2 = AndroidUtilities.dp(28.0f) / 2.0f;
                        rectF.set(f7, f10 - dp2, dp + f7, f10 + dp2);
                        p5Var.E.addRoundRect(rectF, dp2, dp2, Path.Direction.CW);
                        canvas.save();
                        canvas.clipPath(p5Var.E);
                        ImageReceiver imageReceiver = p5Var.f29928b;
                        if (imageReceiver != null && p5Var.f29933s) {
                            imageReceiver.setColorFilter(p5Var.F);
                            float alpha = p5Var.f29928b.getAlpha();
                            p5Var.f29928b.setAlpha(1.0f);
                            p5Var.f29928b.draw(canvas);
                            p5Var.f29928b.setAlpha(alpha);
                            p5Var.f29928b.setColorFilter(null);
                        }
                        p5Var.f29936y.c(f7 + AndroidUtilities.dp(9.0f), f10, 1.0f, -1, canvas);
                        canvas.restore();
                    }
                }
            }
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }
}
