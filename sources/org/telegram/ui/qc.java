package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class qc extends View {
    public final Paint f36842a;
    public final Paint f36843b;
    public final Paint f36844c;
    public final Paint d;
    public final Path e;
    public final Path f36845f;
    public boolean h;
    public boolean f36846n;
    public final org.telegram.ui.Components.wc f36847r;
    public boolean f36848s;
    public final org.telegram.ui.Components.c6 v;
    public final rc f36849w;

    public qc(rc rcVar, Context context) {
        super(context);
        this.f36849w = rcVar;
        Paint paint = new Paint(1);
        this.f36842a = paint;
        this.f36843b = new Paint(1);
        this.f36844c = new Paint(1);
        this.d = new Paint(1);
        this.e = new Path();
        this.f36845f = new Path();
        this.f36847r = new org.telegram.ui.Components.wc(this);
        this.v = new org.telegram.ui.Components.c6(this, 0L, 320L, org.telegram.ui.Components.qr.h);
        paint.setStyle(Paint.Style.STROKE);
    }

    public final void a(MessagesController.PeerColor peerColor) {
        boolean q6;
        org.telegram.ui.ActionBar.e6 e6Var = this.f36849w.f37072a;
        if (e6Var != null) {
            q6 = e6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.i6.I.q();
        }
        Paint paint = this.f36844c;
        Paint paint2 = this.f36843b;
        if (q6 && peerColor.hasColor2() && !peerColor.hasColor3()) {
            paint2.setColor(peerColor.getColor(1, e6Var));
            paint.setColor(peerColor.getColor(0, e6Var));
        } else {
            paint2.setColor(peerColor.getColor(0, e6Var));
            paint.setColor(peerColor.getColor(1, e6Var));
        }
        this.d.setColor(peerColor.getColor(2, e6Var));
        this.h = peerColor.hasColor2();
        this.f36846n = peerColor.hasColor3();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        float a2 = this.f36847r.a(0.05f);
        canvas.scale(a2, a2, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        canvas.save();
        canvas.clipPath(this.e);
        canvas.drawPaint(this.f36843b);
        if (this.h) {
            canvas.drawPath(this.f36845f, this.f36844c);
        }
        canvas.restore();
        if (this.f36846n) {
            canvas.save();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((getMeasuredWidth() - AndroidUtilities.dp(12.4f)) / 2.0f, (getMeasuredHeight() - AndroidUtilities.dp(12.4f)) / 2.0f, (AndroidUtilities.dp(12.4f) + getMeasuredWidth()) / 2.0f, (AndroidUtilities.dp(12.4f) + getMeasuredHeight()) / 2.0f);
            canvas.rotate(45.0f, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.33f), AndroidUtilities.dp(2.33f), this.d);
            canvas.restore();
        }
        float e = this.v.e(this.f36848s);
        if (e > 0.0f) {
            float dpf2 = AndroidUtilities.dpf2(2.0f);
            Paint paint = this.f36842a;
            paint.setStrokeWidth(dpf2);
            canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, AndroidUtilities.lerp((paint.getStrokeWidth() * 0.5f) + AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f) - (paint.getStrokeWidth() * 2.0f), e), paint);
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
        Path path = this.e;
        path.rewind();
        path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, AndroidUtilities.dp(20.0f), Path.Direction.CW);
        Path path2 = this.f36845f;
        path2.rewind();
        path2.moveTo(getMeasuredWidth(), 0.0f);
        path2.lineTo(getMeasuredWidth(), getMeasuredHeight());
        path2.lineTo(0.0f, getMeasuredHeight());
        path2.close();
    }

    @Override
    public final void setBackgroundColor(int i10) {
        this.f36842a.setColor(i10);
    }

    @Override
    public final void setPressed(boolean z10) {
        super.setPressed(z10);
        this.f36847r.c(z10);
    }
}
