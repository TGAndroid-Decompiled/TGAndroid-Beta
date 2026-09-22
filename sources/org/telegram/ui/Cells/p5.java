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
public final class p5 extends FrameLayout {
    public final u5 f20820a;

    public p5(u5 u5Var, Context context) {
        super(context);
        this.f20820a = u5Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        float measuredWidth;
        float measuredHeight;
        int i10;
        u5 u5Var = this.f20820a;
        q5 q5Var = u5Var.f21622a;
        if (u5Var.M != null && view == q5Var) {
            boolean drawChild = super.drawChild(canvas, view, j3);
            if (u5Var.N) {
                Rect rect = u5.f21621a0;
                MediaController.PhotoEntry photoEntry = u5Var.G;
                if (photoEntry == null || !photoEntry.isAttachSpoilerRevealed) {
                    u5Var.M.c(canvas, u5Var.f21623b, q5Var.getMeasuredWidth(), q5Var.getMeasuredHeight(), 1.0f, false);
                    MediaController.PhotoEntry photoEntry2 = u5Var.G;
                    if (photoEntry2 != null && photoEntry2.starsAmount > 0 && q5Var.f29043y != null) {
                        Path path = q5Var.E;
                        if (path == null) {
                            q5Var.E = new Path();
                        } else {
                            path.rewind();
                        }
                        int i11 = q5Var.f29036c;
                        if (i11 != -1 && (i10 = q5Var.d) != -1) {
                            measuredWidth = i11;
                            measuredHeight = i10;
                        } else {
                            measuredWidth = q5Var.getMeasuredWidth();
                            measuredHeight = q5Var.getMeasuredHeight();
                        }
                        float dp = q5Var.f29043y.f29862c + AndroidUtilities.dp(18.0f);
                        float f7 = (measuredWidth - dp) / 2.0f;
                        float f10 = measuredHeight / 2.0f;
                        RectF rectF = AndroidUtilities.rectTmp;
                        float dp2 = AndroidUtilities.dp(28.0f) / 2.0f;
                        rectF.set(f7, f10 - dp2, dp + f7, f10 + dp2);
                        q5Var.E.addRoundRect(rectF, dp2, dp2, Path.Direction.CW);
                        canvas.save();
                        canvas.clipPath(q5Var.E);
                        ImageReceiver imageReceiver = q5Var.f29035b;
                        if (imageReceiver != null && q5Var.f29040s) {
                            imageReceiver.setColorFilter(q5Var.F);
                            float alpha = q5Var.f29035b.getAlpha();
                            q5Var.f29035b.setAlpha(1.0f);
                            q5Var.f29035b.draw(canvas);
                            q5Var.f29035b.setAlpha(alpha);
                            q5Var.f29035b.setColorFilter(null);
                        }
                        q5Var.f29043y.c(f7 + AndroidUtilities.dp(9.0f), f10, 1.0f, -1, canvas);
                        canvas.restore();
                    }
                }
            }
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }
}
