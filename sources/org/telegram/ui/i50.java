package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class i50 implements org.telegram.ui.Components.jl0 {
    public final Path f38528a = new Path();
    public final Paint f38529b;
    public final g60 f38530c;

    public i50(g60 g60Var) {
        this.f38530c = g60Var;
        Paint paint = new Paint(1);
        this.f38529b = paint;
        paint.setColor(-14603467);
    }

    @Override
    public final void m(View view, zg.n0 n0Var, boolean z10, boolean z11) {
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
        String str = n0Var.f54615f;
        if (str == null) {
            str = "👍";
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        tL_textWithEntities.text = str;
        long j3 = n0Var.f54616g;
        if (j3 != 0) {
            tL_messageEntityCustomEmoji.document_id = j3;
            tL_messageEntityCustomEmoji.offset = 0;
            tL_messageEntityCustomEmoji.length = str.length();
            tL_textWithEntities.entities.add(tL_messageEntityCustomEmoji);
        }
        g60 g60Var = this.f38530c;
        g60Var.B1(tL_textWithEntities);
        g40 g40Var = g60Var.H;
        if (g40Var.m()) {
            g40Var.j();
        } else {
            g40Var.d();
        }
        zg.a0 reactionsWindow = g60Var.K.getReactionsWindow();
        if (reactionsWindow != null && !reactionsWindow.f54461q) {
            g60Var.K.getReactionsWindow().e();
            g60Var.K.n();
        }
    }

    @Override
    public final boolean o() {
        return false;
    }

    @Override
    public final boolean q() {
        return false;
    }

    @Override
    public final void r(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
        int i11 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
        Paint paint = this.f38529b;
        if (i11 > 0) {
            canvas.drawRoundRect(rectF, f7, f7, paint);
        } else {
            canvas.drawRect(rectF, paint);
        }
        if (Build.VERSION.SDK_INT >= 29 && canvas.isHardwareAccelerated()) {
            g60 g60Var = this.f38530c;
            if (g60Var.Q2 != null) {
                canvas.save();
                if (i11 > 0) {
                    Path path = this.f38528a;
                    path.rewind();
                    path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
                    path.close();
                    canvas.clipPath(path);
                } else {
                    canvas.clipRect(rectF);
                }
                canvas.translate(-g60Var.K.getX(), -g60Var.K.getY());
                float f12 = g60Var.R2;
                canvas.scale(f12, f12);
                canvas.drawRenderNode(g60Var.Q2);
                canvas.restore();
            }
        }
    }

    @Override
    public final boolean v() {
        return true;
    }

    @Override
    public final void s() {
    }
}
