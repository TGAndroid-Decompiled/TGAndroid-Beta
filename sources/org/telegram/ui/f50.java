package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class f50 implements org.telegram.ui.Components.ok0 {
    public final Path f34167a = new Path();
    public final Paint f34168b;
    public final c60 f34169c;

    public f50(c60 c60Var) {
        this.f34169c = c60Var;
        Paint paint = new Paint(1);
        this.f34168b = paint;
        paint.setColor(-14603467);
    }

    @Override
    public final boolean h() {
        return false;
    }

    @Override
    public final void i(View view, mg.q0 q0Var, boolean z4, boolean z10) {
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
        String str = q0Var.f14107f;
        if (str == null) {
            str = "👍";
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        tL_textWithEntities.text = str;
        long j10 = q0Var.f14108g;
        if (j10 != 0) {
            tL_messageEntityCustomEmoji.document_id = j10;
            tL_messageEntityCustomEmoji.offset = 0;
            tL_messageEntityCustomEmoji.length = str.length();
            tL_textWithEntities.entities.add(tL_messageEntityCustomEmoji);
        }
        c60 c60Var = this.f34169c;
        c60Var.A1(tL_textWithEntities);
        d40 d40Var = c60Var.E;
        if (d40Var.m()) {
            d40Var.j();
        } else {
            d40Var.d();
        }
        mg.d0 reactionsWindow = c60Var.H.getReactionsWindow();
        if (reactionsWindow != null && !reactionsWindow.f13985q) {
            c60Var.H.getReactionsWindow().e();
            c60Var.H.n();
        }
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final void n(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i10, boolean z4) {
        Paint paint = this.f34168b;
        int i11 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        if (i11 > 0) {
            canvas.drawRoundRect(rectF, f10, f10, paint);
        } else {
            canvas.drawRect(rectF, paint);
        }
        if (Build.VERSION.SDK_INT >= 29 && canvas.isHardwareAccelerated()) {
            c60 c60Var = this.f34169c;
            if (c60Var.N2 != null) {
                canvas.save();
                if (i11 > 0) {
                    Path path = this.f34167a;
                    path.rewind();
                    path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
                    path.close();
                    canvas.clipPath(path);
                } else {
                    canvas.clipRect(rectF);
                }
                canvas.translate(-c60Var.H.getX(), -c60Var.H.getY());
                float f13 = c60Var.O2;
                canvas.scale(f13, f13);
                canvas.drawRenderNode(c60Var.N2);
                canvas.restore();
            }
        }
    }

    @Override
    public final boolean s() {
        return true;
    }

    @Override
    public final void o() {
    }
}
