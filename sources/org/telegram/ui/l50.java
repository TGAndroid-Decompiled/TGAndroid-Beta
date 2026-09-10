package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class l50 implements org.telegram.ui.Components.ok0 {
    public final Path f34540a = new Path();
    public final Paint f34541b;
    public final j60 f34542c;

    public l50(j60 j60Var) {
        this.f34542c = j60Var;
        Paint paint = new Paint(1);
        this.f34541b = paint;
        paint.setColor(-14603467);
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
    public final void l(View view, yg.p0 p0Var, boolean z10, boolean z11) {
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
        String str = p0Var.f47101f;
        if (str == null) {
            str = "👍";
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        tL_textWithEntities.text = str;
        long j3 = p0Var.f47102g;
        if (j3 != 0) {
            tL_messageEntityCustomEmoji.document_id = j3;
            tL_messageEntityCustomEmoji.offset = 0;
            tL_messageEntityCustomEmoji.length = str.length();
            tL_textWithEntities.entities.add(tL_messageEntityCustomEmoji);
        }
        j60 j60Var = this.f34542c;
        j60Var.A1(tL_textWithEntities);
        j40 j40Var = j60Var.H;
        if (j40Var.m()) {
            j40Var.j();
        } else {
            j40Var.d();
        }
        yg.c0 reactionsWindow = j60Var.K.getReactionsWindow();
        if (reactionsWindow != null && !reactionsWindow.f46963q) {
            j60Var.K.getReactionsWindow().e();
            j60Var.K.n();
        }
    }

    @Override
    public final void r(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
        Paint paint = this.f34541b;
        int i11 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
        if (i11 > 0) {
            canvas.drawRoundRect(rectF, f7, f7, paint);
        } else {
            canvas.drawRect(rectF, paint);
        }
        if (Build.VERSION.SDK_INT >= 29 && canvas.isHardwareAccelerated()) {
            j60 j60Var = this.f34542c;
            if (j60Var.Q2 != null) {
                canvas.save();
                if (i11 > 0) {
                    Path path = this.f34540a;
                    path.rewind();
                    path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
                    path.close();
                    canvas.clipPath(path);
                } else {
                    canvas.clipRect(rectF);
                }
                canvas.translate(-j60Var.K.getX(), -j60Var.K.getY());
                float f12 = j60Var.R2;
                canvas.scale(f12, f12);
                canvas.drawRenderNode(j60Var.Q2);
                canvas.restore();
            }
        }
    }

    @Override
    public final boolean t() {
        return true;
    }

    @Override
    public final void s() {
    }
}
