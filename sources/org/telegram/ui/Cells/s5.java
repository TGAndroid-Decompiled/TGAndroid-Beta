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
public final class s5 extends FrameLayout {
    public final x5 f25389a;

    public s5(x5 x5Var, Context context) {
        super(context);
        this.f25389a = x5Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        float measuredWidth;
        float measuredHeight;
        int i10;
        x5 x5Var = this.f25389a;
        t5 t5Var = x5Var.f25697a;
        if (x5Var.M != null && view == t5Var) {
            boolean drawChild = super.drawChild(canvas, view, j10);
            if (x5Var.N) {
                Rect rect = x5.f25696a0;
                MediaController.PhotoEntry photoEntry = x5Var.G;
                if (photoEntry == null || !photoEntry.isAttachSpoilerRevealed) {
                    x5Var.M.c(canvas, x5Var.f25698b, t5Var.getMeasuredWidth(), t5Var.getMeasuredHeight(), 1.0f, false);
                    MediaController.PhotoEntry photoEntry2 = x5Var.G;
                    if (photoEntry2 != null && photoEntry2.starsAmount > 0 && t5Var.f34990y != null) {
                        Path path = t5Var.E;
                        if (path == null) {
                            t5Var.E = new Path();
                        } else {
                            path.rewind();
                        }
                        int i11 = t5Var.f34983c;
                        if (i11 != -1 && (i10 = t5Var.d) != -1) {
                            measuredWidth = i11;
                            measuredHeight = i10;
                        } else {
                            measuredWidth = t5Var.getMeasuredWidth();
                            measuredHeight = t5Var.getMeasuredHeight();
                        }
                        float dp = t5Var.f34990y.f31788c + AndroidUtilities.dp(18.0f);
                        float f7 = (measuredWidth - dp) / 2.0f;
                        float f10 = measuredHeight / 2.0f;
                        RectF rectF = AndroidUtilities.rectTmp;
                        float dp2 = AndroidUtilities.dp(28.0f) / 2.0f;
                        rectF.set(f7, f10 - dp2, dp + f7, f10 + dp2);
                        t5Var.E.addRoundRect(rectF, dp2, dp2, Path.Direction.CW);
                        canvas.save();
                        canvas.clipPath(t5Var.E);
                        ImageReceiver imageReceiver = t5Var.f34982b;
                        if (imageReceiver != null && t5Var.f34987s) {
                            imageReceiver.setColorFilter(t5Var.F);
                            float alpha = t5Var.f34982b.getAlpha();
                            t5Var.f34982b.setAlpha(1.0f);
                            t5Var.f34982b.draw(canvas);
                            t5Var.f34982b.setAlpha(alpha);
                            t5Var.f34982b.setColorFilter(null);
                        }
                        t5Var.f34990y.c(f7 + AndroidUtilities.dp(9.0f), f10, 1.0f, -1, canvas);
                        canvas.restore();
                    }
                }
            }
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }
}
