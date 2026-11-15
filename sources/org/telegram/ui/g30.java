package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class g30 implements org.telegram.ui.Components.li0 {
    public final Path f47279a = new Path();
    public final Paint f47280b;
    public final c40 f47281c;

    public g30(c40 c40Var) {
        this.f47281c = c40Var;
        Paint paint = new Paint(1);
        this.f47280b = paint;
        paint.setColor(-14603467);
    }

    @Override
    public final boolean B() {
        return false;
    }

    @Override
    public final void J(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z10) {
        int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        Paint paint = this.f47280b;
        if (i10 > 0) {
            canvas.drawRoundRect(rectF, f10, f10, paint);
        } else {
            canvas.drawRect(rectF, paint);
        }
        if (Build.VERSION.SDK_INT >= 29 && canvas.isHardwareAccelerated()) {
            c40 c40Var = this.f47281c;
            if (c40Var.P4 != null) {
                canvas.save();
                if (i10 > 0) {
                    Path path = this.f47279a;
                    path.rewind();
                    path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
                    path.close();
                    canvas.clipPath(path);
                } else {
                    canvas.clipRect(rectF);
                }
                canvas.translate(-c40Var.F1.getX(), -c40Var.F1.getY());
                float f13 = c40Var.Q4;
                canvas.scale(f13, f13);
                canvas.drawRenderNode(c40Var.P4);
                canvas.restore();
            }
        }
    }

    @Override
    public final boolean L() {
        return true;
    }

    @Override
    public final void h(View view, ch.p0 p0Var, boolean z10, boolean z11) {
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
        String str = p0Var.f5191f;
        if (str == null) {
            str = "👍";
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        tL_textWithEntities.text = str;
        long j3 = p0Var.f5192g;
        if (j3 != 0) {
            tL_messageEntityCustomEmoji.document_id = j3;
            tL_messageEntityCustomEmoji.offset = 0;
            tL_messageEntityCustomEmoji.length = str.length();
            tL_textWithEntities.entities.add(tL_messageEntityCustomEmoji);
        }
        c40 c40Var = this.f47281c;
        c40Var.F1(tL_textWithEntities);
        h20 h20Var = c40Var.C1;
        if (h20Var.m()) {
            h20Var.j();
        } else {
            h20Var.d();
        }
        ch.b0 reactionsWindow = c40Var.F1.getReactionsWindow();
        if (reactionsWindow != null && !reactionsWindow.f5025q) {
            c40Var.F1.getReactionsWindow().e();
            c40Var.F1.n();
        }
    }

    @Override
    public final boolean r() {
        return false;
    }

    @Override
    public final void K() {
    }
}
