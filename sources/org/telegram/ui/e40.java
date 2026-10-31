package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class e40 implements org.telegram.ui.Components.lj0 {
    public final Path f36913a = new Path();
    public final Paint f36914b;
    public final b50 f36915c;

    public e40(b50 b50Var) {
        this.f36915c = b50Var;
        Paint paint = new Paint(1);
        this.f36914b = paint;
        paint.setColor(-14603467);
    }

    @Override
    public final boolean A() {
        return true;
    }

    @Override
    public final boolean f() {
        return false;
    }

    @Override
    public final boolean h() {
        return false;
    }

    @Override
    public final void r(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
        int i11 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
        Paint paint = this.f36914b;
        if (i11 > 0) {
            canvas.drawRoundRect(rectF, f7, f7, paint);
        } else {
            canvas.drawRect(rectF, paint);
        }
        if (Build.VERSION.SDK_INT >= 29 && canvas.isHardwareAccelerated()) {
            b50 b50Var = this.f36915c;
            if (b50Var.H4 != null) {
                canvas.save();
                if (i11 > 0) {
                    Path path = this.f36913a;
                    path.rewind();
                    path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
                    path.close();
                    canvas.clipPath(path);
                } else {
                    canvas.clipRect(rectF);
                }
                canvas.translate(-b50Var.B1.getX(), -b50Var.B1.getY());
                float f12 = b50Var.I4;
                canvas.scale(f12, f12);
                canvas.drawRenderNode(b50Var.H4);
                canvas.restore();
            }
        }
    }

    @Override
    public final void x(View view, sg.o0 o0Var, boolean z10, boolean z11) {
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
        String str = o0Var.f48434f;
        if (str == null) {
            str = "👍";
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        tL_textWithEntities.text = str;
        long j10 = o0Var.f48435g;
        if (j10 != 0) {
            tL_messageEntityCustomEmoji.document_id = j10;
            tL_messageEntityCustomEmoji.offset = 0;
            tL_messageEntityCustomEmoji.length = str.length();
            tL_textWithEntities.entities.add(tL_messageEntityCustomEmoji);
        }
        b50 b50Var = this.f36915c;
        b50Var.C1(tL_textWithEntities);
        g30 g30Var = b50Var.f36099y1;
        if (g30Var.m()) {
            g30Var.j();
        } else {
            g30Var.d();
        }
        sg.b0 reactionsWindow = b50Var.B1.getReactionsWindow();
        if (reactionsWindow != null && !reactionsWindow.f48288q) {
            b50Var.B1.getReactionsWindow().e();
            b50Var.B1.n();
        }
    }

    @Override
    public final void t() {
    }
}
