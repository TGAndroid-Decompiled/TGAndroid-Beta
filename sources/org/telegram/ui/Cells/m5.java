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
public final class m5 extends FrameLayout {
    public final r5 f24697a;

    public m5(r5 r5Var, Context context) {
        super(context);
        this.f24697a = r5Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        float measuredWidth;
        float measuredHeight;
        int i10;
        r5 r5Var = this.f24697a;
        n5 n5Var = r5Var.f25215a;
        if (r5Var.I != null && view == n5Var) {
            boolean drawChild = super.drawChild(canvas, view, j10);
            if (r5Var.J) {
                Rect rect = r5.T;
                MediaController.PhotoEntry photoEntry = r5Var.C;
                if (photoEntry == null || !photoEntry.isAttachSpoilerRevealed) {
                    r5Var.I.c(canvas, r5Var.f25216b, n5Var.getMeasuredWidth(), n5Var.getMeasuredHeight(), 1.0f, false);
                    MediaController.PhotoEntry photoEntry2 = r5Var.C;
                    if (photoEntry2 != null && photoEntry2.starsAmount > 0 && n5Var.f32913y != null) {
                        Path path = n5Var.A;
                        if (path == null) {
                            n5Var.A = new Path();
                        } else {
                            path.rewind();
                        }
                        int i11 = n5Var.f32905c;
                        if (i11 != -1 && (i10 = n5Var.d) != -1) {
                            measuredWidth = i11;
                            measuredHeight = i10;
                        } else {
                            measuredWidth = n5Var.getMeasuredWidth();
                            measuredHeight = n5Var.getMeasuredHeight();
                        }
                        float dp = n5Var.f32913y.f35462c + AndroidUtilities.dp(18.0f);
                        float f9 = (measuredWidth - dp) / 2.0f;
                        float f10 = measuredHeight / 2.0f;
                        RectF rectF = AndroidUtilities.rectTmp;
                        float dp2 = AndroidUtilities.dp(28.0f) / 2.0f;
                        rectF.set(f9, f10 - dp2, dp + f9, f10 + dp2);
                        n5Var.A.addRoundRect(rectF, dp2, dp2, Path.Direction.CW);
                        canvas.save();
                        canvas.clipPath(n5Var.A);
                        ImageReceiver imageReceiver = n5Var.f32904b;
                        if (imageReceiver != null && n5Var.f32910s) {
                            imageReceiver.setColorFilter(n5Var.B);
                            float alpha = n5Var.f32904b.getAlpha();
                            n5Var.f32904b.setAlpha(1.0f);
                            n5Var.f32904b.draw(canvas);
                            n5Var.f32904b.setAlpha(alpha);
                            n5Var.f32904b.setColorFilter(null);
                        }
                        n5Var.f32913y.c(f9 + AndroidUtilities.dp(9.0f), f10, 1.0f, -1, canvas);
                        canvas.restore();
                    }
                }
            }
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }
}
