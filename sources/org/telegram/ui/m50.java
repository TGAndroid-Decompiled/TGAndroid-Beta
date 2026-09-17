package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class m50 implements org.telegram.ui.Components.fk0 {
    public final Path f35685a = new Path();
    public final Paint f35686b;
    public final k60 f35687c;

    public m50(k60 k60Var) {
        this.f35687c = k60Var;
        Paint paint = new Paint(1);
        this.f35686b = paint;
        paint.setColor(-14603467);
    }

    @Override
    public final void h(View view, zg.p0 p0Var, boolean z10, boolean z11) {
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
        String str = p0Var.f49150f;
        if (str == null) {
            str = "👍";
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        tL_textWithEntities.text = str;
        long j3 = p0Var.f49151g;
        if (j3 != 0) {
            tL_messageEntityCustomEmoji.document_id = j3;
            tL_messageEntityCustomEmoji.offset = 0;
            tL_messageEntityCustomEmoji.length = str.length();
            tL_textWithEntities.entities.add(tL_messageEntityCustomEmoji);
        }
        k60 k60Var = this.f35687c;
        k60Var.A1(tL_textWithEntities);
        k40 k40Var = k60Var.H;
        if (k40Var.m()) {
            k40Var.j();
        } else {
            k40Var.d();
        }
        zg.c0 reactionsWindow = k60Var.K.getReactionsWindow();
        if (reactionsWindow != null && !reactionsWindow.f49019q) {
            k60Var.K.getReactionsWindow().e();
            k60Var.K.n();
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
        Paint paint = this.f35686b;
        int i11 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
        if (i11 > 0) {
            canvas.drawRoundRect(rectF, f7, f7, paint);
        } else {
            canvas.drawRect(rectF, paint);
        }
        if (Build.VERSION.SDK_INT >= 29 && canvas.isHardwareAccelerated()) {
            k60 k60Var = this.f35687c;
            if (k60Var.Q2 != null) {
                canvas.save();
                if (i11 > 0) {
                    Path path = this.f35685a;
                    path.rewind();
                    path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
                    path.close();
                    canvas.clipPath(path);
                } else {
                    canvas.clipRect(rectF);
                }
                canvas.translate(-k60Var.K.getX(), -k60Var.K.getY());
                float f12 = k60Var.R2;
                canvas.scale(f12, f12);
                canvas.drawRenderNode(k60Var.Q2);
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
