package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class i30 implements org.telegram.ui.Components.wi0 {
    public final Path f48699a = new Path();
    public final Paint f48700b;
    public final e40 f48701c;

    public i30(e40 e40Var) {
        this.f48701c = e40Var;
        Paint paint = new Paint(1);
        this.f48700b = paint;
        paint.setColor(-14603467);
    }

    @Override
    public final void h(View view, ch.p0 p0Var, boolean z10, boolean z11) {
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
        String str = p0Var.f5470f;
        if (str == null) {
            str = "👍";
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        tL_textWithEntities.text = str;
        long j3 = p0Var.f5471g;
        if (j3 != 0) {
            tL_messageEntityCustomEmoji.document_id = j3;
            tL_messageEntityCustomEmoji.offset = 0;
            tL_messageEntityCustomEmoji.length = str.length();
            tL_textWithEntities.entities.add(tL_messageEntityCustomEmoji);
        }
        e40 e40Var = this.f48701c;
        e40Var.G1(tL_textWithEntities);
        j20 j20Var = e40Var.C1;
        if (j20Var.m()) {
            j20Var.j();
        } else {
            j20Var.d();
        }
        ch.b0 reactionsWindow = e40Var.F1.getReactionsWindow();
        if (reactionsWindow != null && !reactionsWindow.f5303q) {
            e40Var.F1.getReactionsWindow().e();
            e40Var.F1.n();
        }
    }

    @Override
    public final boolean l() {
        return false;
    }

    @Override
    public final boolean n() {
        return false;
    }

    @Override
    public final void q(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z10) {
        int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        Paint paint = this.f48700b;
        if (i10 > 0) {
            canvas.drawRoundRect(rectF, f10, f10, paint);
        } else {
            canvas.drawRect(rectF, paint);
        }
        if (Build.VERSION.SDK_INT >= 29 && canvas.isHardwareAccelerated()) {
            e40 e40Var = this.f48701c;
            if (e40Var.P4 != null) {
                canvas.save();
                if (i10 > 0) {
                    Path path = this.f48699a;
                    path.rewind();
                    path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
                    path.close();
                    canvas.clipPath(path);
                } else {
                    canvas.clipRect(rectF);
                }
                canvas.translate(-e40Var.F1.getX(), -e40Var.F1.getY());
                float f13 = e40Var.Q4;
                canvas.scale(f13, f13);
                canvas.drawRenderNode(e40Var.P4);
                canvas.restore();
            }
        }
    }

    @Override
    public final boolean t() {
        return true;
    }

    @Override
    public final void r() {
    }
}
