package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class l50 implements org.telegram.ui.Components.ek0 {
    public final Path f38217a = new Path();
    public final Paint f38218b;
    public final j60 f38219c;

    public l50(j60 j60Var) {
        this.f38219c = j60Var;
        Paint paint = new Paint(1);
        this.f38218b = paint;
        paint.setColor(-14603467);
    }

    @Override
    public final void B(View view, ah.j1 j1Var, boolean z10, boolean z11) {
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
        String str = j1Var.f609f;
        if (str == null) {
            str = "👍";
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        tL_textWithEntities.text = str;
        long j3 = j1Var.f610g;
        if (j3 != 0) {
            tL_messageEntityCustomEmoji.document_id = j3;
            tL_messageEntityCustomEmoji.offset = 0;
            tL_messageEntityCustomEmoji.length = str.length();
            tL_textWithEntities.entities.add(tL_messageEntityCustomEmoji);
        }
        j60 j60Var = this.f38219c;
        j60Var.A1(tL_textWithEntities);
        i40 i40Var = j60Var.H;
        if (i40Var.m()) {
            i40Var.j();
        } else {
            i40Var.d();
        }
        ah.u0 reactionsWindow = j60Var.K.getReactionsWindow();
        if (reactionsWindow != null && !reactionsWindow.f711q) {
            j60Var.K.getReactionsWindow().e();
            j60Var.K.n();
        }
    }

    @Override
    public final void I(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
        Paint paint = this.f38218b;
        int i11 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
        if (i11 > 0) {
            canvas.drawRoundRect(rectF, f7, f7, paint);
        } else {
            canvas.drawRect(rectF, paint);
        }
        if (Build.VERSION.SDK_INT >= 29 && canvas.isHardwareAccelerated()) {
            j60 j60Var = this.f38219c;
            if (j60Var.Q2 != null) {
                canvas.save();
                if (i11 > 0) {
                    Path path = this.f38217a;
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
    public final boolean S() {
        return true;
    }

    @Override
    public final boolean n() {
        return false;
    }

    @Override
    public final boolean t() {
        return false;
    }

    @Override
    public final void J() {
    }
}
