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
public final class n5 extends FrameLayout {
    public final s5 f21427a;

    public n5(s5 s5Var, Context context) {
        super(context);
        this.f21427a = s5Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        float measuredWidth;
        float measuredHeight;
        int i10;
        s5 s5Var = this.f21427a;
        o5 o5Var = s5Var.f22284a;
        if (s5Var.J != null && view == o5Var) {
            boolean drawChild = super.drawChild(canvas, view, j10);
            if (s5Var.K) {
                Rect rect = s5.U;
                MediaController.PhotoEntry photoEntry = s5Var.D;
                if (photoEntry == null || !photoEntry.isAttachSpoilerRevealed) {
                    s5Var.J.c(canvas, s5Var.f22285b, o5Var.getMeasuredWidth(), o5Var.getMeasuredHeight(), 1.0f, false);
                    MediaController.PhotoEntry photoEntry2 = s5Var.D;
                    if (photoEntry2 != null && photoEntry2.starsAmount > 0 && o5Var.f27810y != null) {
                        Path path = o5Var.B;
                        if (path == null) {
                            o5Var.B = new Path();
                        } else {
                            path.rewind();
                        }
                        int i11 = o5Var.f27803c;
                        if (i11 != -1 && (i10 = o5Var.d) != -1) {
                            measuredWidth = i11;
                            measuredHeight = i10;
                        } else {
                            measuredWidth = o5Var.getMeasuredWidth();
                            measuredHeight = o5Var.getMeasuredHeight();
                        }
                        float dp = o5Var.f27810y.f26124c + AndroidUtilities.dp(18.0f);
                        float f10 = (measuredWidth - dp) / 2.0f;
                        float f11 = measuredHeight / 2.0f;
                        RectF rectF = AndroidUtilities.rectTmp;
                        float dp2 = AndroidUtilities.dp(28.0f) / 2.0f;
                        rectF.set(f10, f11 - dp2, dp + f10, f11 + dp2);
                        o5Var.B.addRoundRect(rectF, dp2, dp2, Path.Direction.CW);
                        canvas.save();
                        canvas.clipPath(o5Var.B);
                        ImageReceiver imageReceiver = o5Var.f27802b;
                        if (imageReceiver != null && o5Var.f27807s) {
                            imageReceiver.setColorFilter(o5Var.C);
                            float alpha = o5Var.f27802b.getAlpha();
                            o5Var.f27802b.setAlpha(1.0f);
                            o5Var.f27802b.draw(canvas);
                            o5Var.f27802b.setAlpha(alpha);
                            o5Var.f27802b.setColorFilter(null);
                        }
                        o5Var.f27810y.c(f10 + AndroidUtilities.dp(9.0f), f11, 1.0f, -1, canvas);
                        canvas.restore();
                    }
                }
            }
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }
}
