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
    public final t5 f23301a;

    public o5(t5 t5Var, Context context) {
        super(context);
        this.f23301a = t5Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        float measuredWidth;
        float measuredHeight;
        int i10;
        t5 t5Var = this.f23301a;
        p5 p5Var = t5Var.f24151a;
        if (t5Var.J != null && view == p5Var) {
            boolean drawChild = super.drawChild(canvas, view, j10);
            if (t5Var.K) {
                Rect rect = t5.U;
                MediaController.PhotoEntry photoEntry = t5Var.D;
                if (photoEntry == null || !photoEntry.isAttachSpoilerRevealed) {
                    t5Var.J.c(canvas, t5Var.f24152b, p5Var.getMeasuredWidth(), p5Var.getMeasuredHeight(), 1.0f, false);
                    MediaController.PhotoEntry photoEntry2 = t5Var.D;
                    if (photoEntry2 != null && photoEntry2.starsAmount > 0 && p5Var.f30021y != null) {
                        Path path = p5Var.B;
                        if (path == null) {
                            p5Var.B = new Path();
                        } else {
                            path.rewind();
                        }
                        int i11 = p5Var.f30013c;
                        if (i11 != -1 && (i10 = p5Var.d) != -1) {
                            measuredWidth = i11;
                            measuredHeight = i10;
                        } else {
                            measuredWidth = p5Var.getMeasuredWidth();
                            measuredHeight = p5Var.getMeasuredHeight();
                        }
                        float dp = p5Var.f30021y.f28227c + AndroidUtilities.dp(18.0f);
                        float f10 = (measuredWidth - dp) / 2.0f;
                        float f11 = measuredHeight / 2.0f;
                        RectF rectF = AndroidUtilities.rectTmp;
                        float dp2 = AndroidUtilities.dp(28.0f) / 2.0f;
                        rectF.set(f10, f11 - dp2, dp + f10, f11 + dp2);
                        p5Var.B.addRoundRect(rectF, dp2, dp2, Path.Direction.CW);
                        canvas.save();
                        canvas.clipPath(p5Var.B);
                        ImageReceiver imageReceiver = p5Var.f30012b;
                        if (imageReceiver != null && p5Var.f30018s) {
                            imageReceiver.setColorFilter(p5Var.C);
                            float alpha = p5Var.f30012b.getAlpha();
                            p5Var.f30012b.setAlpha(1.0f);
                            p5Var.f30012b.draw(canvas);
                            p5Var.f30012b.setAlpha(alpha);
                            p5Var.f30012b.setColorFilter(null);
                        }
                        p5Var.f30021y.c(f10 + AndroidUtilities.dp(9.0f), f11, 1.0f, -1, canvas);
                        canvas.restore();
                    }
                }
            }
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }
}
