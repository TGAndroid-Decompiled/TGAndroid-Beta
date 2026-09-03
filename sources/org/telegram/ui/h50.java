package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class h50 implements org.telegram.ui.Components.ok0 {
    public final Path f34580a = new Path();
    public final Paint f34581b;
    public final e60 f34582c;

    public h50(e60 e60Var) {
        this.f34582c = e60Var;
        Paint paint = new Paint(1);
        this.f34581b = paint;
        paint.setColor(-14603467);
    }

    @Override
    public final boolean i() {
        return false;
    }

    @Override
    public final void j(View view, mg.q0 q0Var, boolean z4, boolean z10) {
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
        String str = q0Var.f14095f;
        if (str == null) {
            str = "👍";
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        tL_textWithEntities.text = str;
        long j10 = q0Var.f14096g;
        if (j10 != 0) {
            tL_messageEntityCustomEmoji.document_id = j10;
            tL_messageEntityCustomEmoji.offset = 0;
            tL_messageEntityCustomEmoji.length = str.length();
            tL_textWithEntities.entities.add(tL_messageEntityCustomEmoji);
        }
        e60 e60Var = this.f34582c;
        e60Var.A1(tL_textWithEntities);
        f40 f40Var = e60Var.E;
        if (f40Var.m()) {
            f40Var.j();
        } else {
            f40Var.d();
        }
        mg.d0 reactionsWindow = e60Var.H.getReactionsWindow();
        if (reactionsWindow != null && !reactionsWindow.f13973q) {
            e60Var.H.getReactionsWindow().e();
            e60Var.H.n();
        }
    }

    @Override
    public final boolean k() {
        return false;
    }

    @Override
    public final void l(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i10, boolean z4) {
        Paint paint = this.f34581b;
        int i11 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        if (i11 > 0) {
            canvas.drawRoundRect(rectF, f10, f10, paint);
        } else {
            canvas.drawRect(rectF, paint);
        }
        if (Build.VERSION.SDK_INT >= 29 && canvas.isHardwareAccelerated()) {
            e60 e60Var = this.f34582c;
            if (e60Var.N2 != null) {
                canvas.save();
                if (i11 > 0) {
                    Path path = this.f34580a;
                    path.rewind();
                    path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
                    path.close();
                    canvas.clipPath(path);
                } else {
                    canvas.clipRect(rectF);
                }
                canvas.translate(-e60Var.H.getX(), -e60Var.H.getY());
                float f13 = e60Var.O2;
                canvas.scale(f13, f13);
                canvas.drawRenderNode(e60Var.N2);
                canvas.restore();
            }
        }
    }

    @Override
    public final boolean o() {
        return true;
    }

    @Override
    public final void m() {
    }
}
