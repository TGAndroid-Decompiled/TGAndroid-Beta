package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class b30 implements org.telegram.ui.Components.ki0 {
    public final Path f43906a = new Path();
    public final Paint f43907b;
    public final x30 f43908c;

    public b30(x30 x30Var) {
        this.f43908c = x30Var;
        Paint paint = new Paint(1);
        this.f43907b = paint;
        paint.setColor(-14603467);
    }

    @Override
    public final void E(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i3, boolean z10) {
        int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        Paint paint = this.f43907b;
        if (i10 > 0) {
            canvas.drawRoundRect(rectF, f10, f10, paint);
        } else {
            canvas.drawRect(rectF, paint);
        }
        if (Build.VERSION.SDK_INT >= 29 && canvas.isHardwareAccelerated()) {
            x30 x30Var = this.f43908c;
            if (x30Var.I4 != null) {
                canvas.save();
                if (i10 > 0) {
                    Path path = this.f43906a;
                    path.rewind();
                    path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
                    path.close();
                    canvas.clipPath(path);
                } else {
                    canvas.clipRect(rectF);
                }
                canvas.translate(-x30Var.C1.getX(), -x30Var.C1.getY());
                float f13 = x30Var.J4;
                canvas.scale(f13, f13);
                canvas.drawRenderNode(x30Var.I4);
                canvas.restore();
            }
        }
    }

    @Override
    public final boolean O() {
        return true;
    }

    @Override
    public final boolean r() {
        return false;
    }

    @Override
    public final boolean v() {
        return false;
    }

    @Override
    public final void z(View view, dh.n0 n0Var, boolean z10, boolean z11) {
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
        String str = n0Var.f9097f;
        if (str == null) {
            str = "👍";
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        tL_textWithEntities.text = str;
        long j10 = n0Var.f9098g;
        if (j10 != 0) {
            tL_messageEntityCustomEmoji.document_id = j10;
            tL_messageEntityCustomEmoji.offset = 0;
            tL_messageEntityCustomEmoji.length = str.length();
            tL_textWithEntities.entities.add(tL_messageEntityCustomEmoji);
        }
        x30 x30Var = this.f43908c;
        x30Var.C1(tL_textWithEntities);
        c20 c20Var = x30Var.f51822z1;
        if (c20Var.m()) {
            c20Var.j();
        } else {
            c20Var.d();
        }
        dh.a0 reactionsWindow = x30Var.C1.getReactionsWindow();
        if (reactionsWindow != null && !reactionsWindow.f8945q) {
            x30Var.C1.getReactionsWindow().e();
            x30Var.C1.n();
        }
    }

    @Override
    public final void J() {
    }
}
