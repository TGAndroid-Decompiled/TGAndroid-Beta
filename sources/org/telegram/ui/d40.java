package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class d40 implements org.telegram.ui.Components.mj0 {
    public final Path f36480a = new Path();
    public final Paint f36481b;
    public final a50 f36482c;

    public d40(a50 a50Var) {
        this.f36482c = a50Var;
        Paint paint = new Paint(1);
        this.f36481b = paint;
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
        Paint paint = this.f36481b;
        if (i11 > 0) {
            canvas.drawRoundRect(rectF, f7, f7, paint);
        } else {
            canvas.drawRect(rectF, paint);
        }
        if (Build.VERSION.SDK_INT >= 29 && canvas.isHardwareAccelerated()) {
            a50 a50Var = this.f36482c;
            if (a50Var.H4 != null) {
                canvas.save();
                if (i11 > 0) {
                    Path path = this.f36480a;
                    path.rewind();
                    path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
                    path.close();
                    canvas.clipPath(path);
                } else {
                    canvas.clipRect(rectF);
                }
                canvas.translate(-a50Var.B1.getX(), -a50Var.B1.getY());
                float f12 = a50Var.I4;
                canvas.scale(f12, f12);
                canvas.drawRenderNode(a50Var.H4);
                canvas.restore();
            }
        }
    }

    @Override
    public final void x(View view, sg.o0 o0Var, boolean z10, boolean z11) {
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
        String str = o0Var.f48445f;
        if (str == null) {
            str = "👍";
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        tL_textWithEntities.text = str;
        long j10 = o0Var.f48446g;
        if (j10 != 0) {
            tL_messageEntityCustomEmoji.document_id = j10;
            tL_messageEntityCustomEmoji.offset = 0;
            tL_messageEntityCustomEmoji.length = str.length();
            tL_textWithEntities.entities.add(tL_messageEntityCustomEmoji);
        }
        a50 a50Var = this.f36482c;
        a50Var.C1(tL_textWithEntities);
        f30 f30Var = a50Var.f35683y1;
        if (f30Var.m()) {
            f30Var.j();
        } else {
            f30Var.d();
        }
        sg.b0 reactionsWindow = a50Var.B1.getReactionsWindow();
        if (reactionsWindow != null && !reactionsWindow.f48299q) {
            a50Var.B1.getReactionsWindow().e();
            a50Var.B1.n();
        }
    }

    @Override
    public final void t() {
    }
}
