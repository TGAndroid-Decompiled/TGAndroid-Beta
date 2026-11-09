package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class i30 implements org.telegram.ui.Components.ii0 {
    public final Path f46449a = new Path();
    public final Paint f46450b;
    public final e40 f46451c;

    public i30(e40 e40Var) {
        this.f46451c = e40Var;
        Paint paint = new Paint(1);
        this.f46450b = paint;
        paint.setColor(-14603467);
    }

    @Override
    public final boolean E() {
        return false;
    }

    @Override
    public final void L(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z9) {
        int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        Paint paint = this.f46450b;
        if (i10 > 0) {
            canvas.drawRoundRect(rectF, f10, f10, paint);
        } else {
            canvas.drawRect(rectF, paint);
        }
        if (Build.VERSION.SDK_INT >= 29 && canvas.isHardwareAccelerated()) {
            e40 e40Var = this.f46451c;
            if (e40Var.H4 != null) {
                canvas.save();
                if (i10 > 0) {
                    Path path = this.f46449a;
                    path.rewind();
                    path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
                    path.close();
                    canvas.clipPath(path);
                } else {
                    canvas.clipRect(rectF);
                }
                canvas.translate(-e40Var.B1.getX(), -e40Var.B1.getY());
                float f13 = e40Var.I4;
                canvas.scale(f13, f13);
                canvas.drawRenderNode(e40Var.H4);
                canvas.restore();
            }
        }
    }

    @Override
    public final boolean U() {
        return true;
    }

    @Override
    public final void i(View view, ch.o0 o0Var, boolean z9, boolean z10) {
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
        String str = o0Var.f6354f;
        if (str == null) {
            str = "👍";
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        tL_textWithEntities.text = str;
        long j3 = o0Var.f6355g;
        if (j3 != 0) {
            tL_messageEntityCustomEmoji.document_id = j3;
            tL_messageEntityCustomEmoji.offset = 0;
            tL_messageEntityCustomEmoji.length = str.length();
            tL_textWithEntities.entities.add(tL_messageEntityCustomEmoji);
        }
        e40 e40Var = this.f46451c;
        e40Var.F1(tL_textWithEntities);
        j20 j20Var = e40Var.f45290y1;
        if (j20Var.m()) {
            j20Var.j();
        } else {
            j20Var.d();
        }
        ch.b0 reactionsWindow = e40Var.B1.getReactionsWindow();
        if (reactionsWindow != null && !reactionsWindow.f6195q) {
            e40Var.B1.getReactionsWindow().e();
            e40Var.B1.n();
        }
    }

    @Override
    public final boolean v() {
        return false;
    }

    @Override
    public final void M() {
    }
}
