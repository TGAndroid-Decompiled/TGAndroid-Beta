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
    public final t5 f24828a;

    public o5(t5 t5Var, Context context) {
        super(context);
        this.f24828a = t5Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        float measuredWidth;
        float measuredHeight;
        int i9;
        t5 t5Var = this.f24828a;
        p5 p5Var = t5Var.f25683a;
        if (t5Var.I != null && view == p5Var) {
            boolean drawChild = super.drawChild(canvas, view, j10);
            if (t5Var.J) {
                Rect rect = t5.T;
                MediaController.PhotoEntry photoEntry = t5Var.C;
                if (photoEntry == null || !photoEntry.isAttachSpoilerRevealed) {
                    t5Var.I.c(canvas, t5Var.f25684b, p5Var.getMeasuredWidth(), p5Var.getMeasuredHeight(), 1.0f, false);
                    MediaController.PhotoEntry photoEntry2 = t5Var.C;
                    if (photoEntry2 != null && photoEntry2.starsAmount > 0 && p5Var.f31338y != null) {
                        Path path = p5Var.A;
                        if (path == null) {
                            p5Var.A = new Path();
                        } else {
                            path.rewind();
                        }
                        int i10 = p5Var.f31330c;
                        if (i10 != -1 && (i9 = p5Var.d) != -1) {
                            measuredWidth = i10;
                            measuredHeight = i9;
                        } else {
                            measuredWidth = p5Var.getMeasuredWidth();
                            measuredHeight = p5Var.getMeasuredHeight();
                        }
                        float dp = p5Var.f31338y.f31223c + AndroidUtilities.dp(18.0f);
                        float f10 = (measuredWidth - dp) / 2.0f;
                        float f11 = measuredHeight / 2.0f;
                        RectF rectF = AndroidUtilities.rectTmp;
                        float dp2 = AndroidUtilities.dp(28.0f) / 2.0f;
                        rectF.set(f10, f11 - dp2, dp + f10, f11 + dp2);
                        p5Var.A.addRoundRect(rectF, dp2, dp2, Path.Direction.CW);
                        canvas.save();
                        canvas.clipPath(p5Var.A);
                        ImageReceiver imageReceiver = p5Var.f31329b;
                        if (imageReceiver != null && p5Var.f31335s) {
                            imageReceiver.setColorFilter(p5Var.B);
                            float alpha = p5Var.f31329b.getAlpha();
                            p5Var.f31329b.setAlpha(1.0f);
                            p5Var.f31329b.draw(canvas);
                            p5Var.f31329b.setAlpha(alpha);
                            p5Var.f31329b.setColorFilter(null);
                        }
                        p5Var.f31338y.c(f10 + AndroidUtilities.dp(9.0f), f11, 1.0f, -1, canvas);
                        canvas.restore();
                    }
                }
            }
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }
}
