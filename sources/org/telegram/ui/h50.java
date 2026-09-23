package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class h50 implements org.telegram.ui.Components.fk0 {
    public final Path f33738a = new Path();
    public final Paint f33739b;
    public final f60 f33740c;

    public h50(f60 f60Var) {
        this.f33740c = f60Var;
        Paint paint = new Paint(1);
        this.f33739b = paint;
        paint.setColor(-14603467);
    }

    @Override
    public final void h(View view, zg.p0 p0Var, boolean z10, boolean z11) {
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
        String str = p0Var.f49071f;
        if (str == null) {
            str = "👍";
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        tL_textWithEntities.text = str;
        long j3 = p0Var.f49072g;
        if (j3 != 0) {
            tL_messageEntityCustomEmoji.document_id = j3;
            tL_messageEntityCustomEmoji.offset = 0;
            tL_messageEntityCustomEmoji.length = str.length();
            tL_textWithEntities.entities.add(tL_messageEntityCustomEmoji);
        }
        f60 f60Var = this.f33740c;
        f60Var.A1(tL_textWithEntities);
        f40 f40Var = f60Var.H;
        if (f40Var.m()) {
            f40Var.j();
        } else {
            f40Var.d();
        }
        zg.c0 reactionsWindow = f60Var.K.getReactionsWindow();
        if (reactionsWindow != null && !reactionsWindow.f48940q) {
            f60Var.K.getReactionsWindow().e();
            f60Var.K.n();
        }
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k() {
        return false;
    }

    @Override
    public final void n(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
        Paint paint = this.f33739b;
        int i11 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
        if (i11 > 0) {
            canvas.drawRoundRect(rectF, f7, f7, paint);
        } else {
            canvas.drawRect(rectF, paint);
        }
        if (Build.VERSION.SDK_INT >= 29 && canvas.isHardwareAccelerated()) {
            f60 f60Var = this.f33740c;
            if (f60Var.Q2 != null) {
                canvas.save();
                if (i11 > 0) {
                    Path path = this.f33738a;
                    path.rewind();
                    path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
                    path.close();
                    canvas.clipPath(path);
                } else {
                    canvas.clipRect(rectF);
                }
                canvas.translate(-f60Var.K.getX(), -f60Var.K.getY());
                float f12 = f60Var.R2;
                canvas.scale(f12, f12);
                canvas.drawRenderNode(f60Var.Q2);
                canvas.restore();
            }
        }
    }

    @Override
    public final boolean q() {
        return true;
    }

    @Override
    public final void o() {
    }
}
