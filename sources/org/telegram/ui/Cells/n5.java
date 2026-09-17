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
    public final s5 f20479a;

    public n5(s5 s5Var, Context context) {
        super(context);
        this.f20479a = s5Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        float measuredWidth;
        float measuredHeight;
        int i10;
        s5 s5Var = this.f20479a;
        o5 o5Var = s5Var.f20959a;
        if (s5Var.M != null && view == o5Var) {
            boolean drawChild = super.drawChild(canvas, view, j3);
            if (s5Var.N) {
                Rect rect = s5.f20958a0;
                MediaController.PhotoEntry photoEntry = s5Var.G;
                if (photoEntry == null || !photoEntry.isAttachSpoilerRevealed) {
                    s5Var.M.c(canvas, s5Var.f20960b, o5Var.getMeasuredWidth(), o5Var.getMeasuredHeight(), 1.0f, false);
                    MediaController.PhotoEntry photoEntry2 = s5Var.G;
                    if (photoEntry2 != null && photoEntry2.starsAmount > 0 && o5Var.f28310y != null) {
                        Path path = o5Var.E;
                        if (path == null) {
                            o5Var.E = new Path();
                        } else {
                            path.rewind();
                        }
                        int i11 = o5Var.f28303c;
                        if (i11 != -1 && (i10 = o5Var.d) != -1) {
                            measuredWidth = i11;
                            measuredHeight = i10;
                        } else {
                            measuredWidth = o5Var.getMeasuredWidth();
                            measuredHeight = o5Var.getMeasuredHeight();
                        }
                        float dp = o5Var.f28310y.f24439c + AndroidUtilities.dp(18.0f);
                        float f7 = (measuredWidth - dp) / 2.0f;
                        float f10 = measuredHeight / 2.0f;
                        RectF rectF = AndroidUtilities.rectTmp;
                        float dp2 = AndroidUtilities.dp(28.0f) / 2.0f;
                        rectF.set(f7, f10 - dp2, dp + f7, f10 + dp2);
                        o5Var.E.addRoundRect(rectF, dp2, dp2, Path.Direction.CW);
                        canvas.save();
                        canvas.clipPath(o5Var.E);
                        ImageReceiver imageReceiver = o5Var.f28302b;
                        if (imageReceiver != null && o5Var.f28307s) {
                            imageReceiver.setColorFilter(o5Var.F);
                            float alpha = o5Var.f28302b.getAlpha();
                            o5Var.f28302b.setAlpha(1.0f);
                            o5Var.f28302b.draw(canvas);
                            o5Var.f28302b.setAlpha(alpha);
                            o5Var.f28302b.setColorFilter(null);
                        }
                        o5Var.f28310y.c(f7 + AndroidUtilities.dp(9.0f), f10, 1.0f, -1, canvas);
                        canvas.restore();
                    }
                }
            }
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }
}
