package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class j30 implements org.telegram.ui.Components.ui0 {
    public final Path f48858a = new Path();
    public final Paint f48859b;
    public final f40 f48860c;

    public j30(f40 f40Var) {
        this.f48860c = f40Var;
        Paint paint = new Paint(1);
        this.f48859b = paint;
        paint.setColor(-14603467);
    }

    @Override
    public final boolean E() {
        return true;
    }

    @Override
    public final void g(View view, ch.p0 p0Var, boolean z10, boolean z11) {
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
        String str = p0Var.f5475f;
        if (str == null) {
            str = "👍";
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        tL_textWithEntities.text = str;
        long j3 = p0Var.f5476g;
        if (j3 != 0) {
            tL_messageEntityCustomEmoji.document_id = j3;
            tL_messageEntityCustomEmoji.offset = 0;
            tL_messageEntityCustomEmoji.length = str.length();
            tL_textWithEntities.entities.add(tL_messageEntityCustomEmoji);
        }
        f40 f40Var = this.f48860c;
        f40Var.G1(tL_textWithEntities);
        k20 k20Var = f40Var.C1;
        if (k20Var.m()) {
            k20Var.j();
        } else {
            k20Var.d();
        }
        ch.b0 reactionsWindow = f40Var.F1.getReactionsWindow();
        if (reactionsWindow != null && !reactionsWindow.f5308q) {
            f40Var.F1.getReactionsWindow().e();
            f40Var.F1.n();
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
    public final void x(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z10) {
        int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        Paint paint = this.f48859b;
        if (i10 > 0) {
            canvas.drawRoundRect(rectF, f10, f10, paint);
        } else {
            canvas.drawRect(rectF, paint);
        }
        if (Build.VERSION.SDK_INT >= 29 && canvas.isHardwareAccelerated()) {
            f40 f40Var = this.f48860c;
            if (f40Var.P4 != null) {
                canvas.save();
                if (i10 > 0) {
                    Path path = this.f48858a;
                    path.rewind();
                    path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
                    path.close();
                    canvas.clipPath(path);
                } else {
                    canvas.clipRect(rectF);
                }
                canvas.translate(-f40Var.F1.getX(), -f40Var.F1.getY());
                float f13 = f40Var.Q4;
                canvas.scale(f13, f13);
                canvas.drawRenderNode(f40Var.P4);
                canvas.restore();
            }
        }
    }

    @Override
    public final void z() {
    }
}
