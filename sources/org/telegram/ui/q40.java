package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class q40 implements org.telegram.ui.Components.tj0 {
    public final Path f41675a = new Path();
    public final Paint f41676b;
    public final o50 f41677c;

    public q40(o50 o50Var) {
        this.f41677c = o50Var;
        Paint paint = new Paint(1);
        this.f41676b = paint;
        paint.setColor(-14603467);
    }

    @Override
    public final void d(View view, hg.r0 r0Var, boolean z10, boolean z11) {
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
        String str = r0Var.f10717f;
        if (str == null) {
            str = "👍";
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        tL_textWithEntities.text = str;
        long j10 = r0Var.f10718g;
        if (j10 != 0) {
            tL_messageEntityCustomEmoji.document_id = j10;
            tL_messageEntityCustomEmoji.offset = 0;
            tL_messageEntityCustomEmoji.length = str.length();
            tL_textWithEntities.entities.add(tL_messageEntityCustomEmoji);
        }
        o50 o50Var = this.f41677c;
        o50Var.A1(tL_textWithEntities);
        o30 o30Var = o50Var.D;
        if (o30Var.m()) {
            o30Var.j();
        } else {
            o30Var.d();
        }
        hg.e0 reactionsWindow = o50Var.G.getReactionsWindow();
        if (reactionsWindow != null && !reactionsWindow.f10588q) {
            o50Var.G.getReactionsWindow().e();
            o50Var.G.n();
        }
    }

    @Override
    public final boolean n() {
        return false;
    }

    @Override
    public final boolean p() {
        return false;
    }

    @Override
    public final void s(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i9, boolean z10) {
        Paint paint = this.f41676b;
        int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        if (i10 > 0) {
            canvas.drawRoundRect(rectF, f10, f10, paint);
        } else {
            canvas.drawRect(rectF, paint);
        }
        if (Build.VERSION.SDK_INT >= 29 && canvas.isHardwareAccelerated()) {
            o50 o50Var = this.f41677c;
            if (o50Var.M2 != null) {
                canvas.save();
                if (i10 > 0) {
                    Path path = this.f41675a;
                    path.rewind();
                    path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
                    path.close();
                    canvas.clipPath(path);
                } else {
                    canvas.clipRect(rectF);
                }
                canvas.translate(-o50Var.G.getX(), -o50Var.G.getY());
                float f13 = o50Var.N2;
                canvas.scale(f13, f13);
                canvas.drawRenderNode(o50Var.M2);
                canvas.restore();
            }
        }
    }

    @Override
    public final boolean u() {
        return true;
    }

    @Override
    public final void t() {
    }
}
