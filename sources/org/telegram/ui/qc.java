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
    public final Paint f40701a;
    public final Paint f40702b;
    public final Paint f40703c;
    public final Paint d;
    public final Path e;
    public final Path f40704f;
    public boolean h;
    public boolean f40705n;
    public final org.telegram.ui.Components.yc f40706r;
    public boolean f40707s;
    public final org.telegram.ui.Components.f6 v;
    public final rc f40708w;

    public qc(rc rcVar, Context context) {
        super(context);
        this.f40708w = rcVar;
        Paint paint = new Paint(1);
        this.f40701a = paint;
        this.f40702b = new Paint(1);
        this.f40703c = new Paint(1);
        this.d = new Paint(1);
        this.e = new Path();
        this.f40704f = new Path();
        this.f40706r = new org.telegram.ui.Components.yc(this);
        this.v = new org.telegram.ui.Components.f6(this, 0L, 320L, org.telegram.ui.Components.bs.h);
        paint.setStyle(Paint.Style.STROKE);
    }

    public final void a(MessagesController.PeerColor peerColor) {
        boolean q6;
        org.telegram.ui.ActionBar.g6 g6Var = this.f40708w.f41084a;
        if (g6Var != null) {
            q6 = g6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.k6.I.q();
        }
        Paint paint = this.f40703c;
        Paint paint2 = this.f40702b;
        if (q6 && peerColor.hasColor2() && !peerColor.hasColor3()) {
            paint2.setColor(peerColor.getColor(1, g6Var));
            paint.setColor(peerColor.getColor(0, g6Var));
        } else {
            paint2.setColor(peerColor.getColor(0, g6Var));
            paint.setColor(peerColor.getColor(1, g6Var));
        }
        this.d.setColor(peerColor.getColor(2, g6Var));
        this.h = peerColor.hasColor2();
        this.f40705n = peerColor.hasColor3();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        float a2 = this.f40706r.a(0.05f);
        canvas.scale(a2, a2, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        canvas.save();
        canvas.clipPath(this.e);
        canvas.drawPaint(this.f40702b);
        if (this.h) {
            canvas.drawPath(this.f40704f, this.f40703c);
        }
        canvas.restore();
        if (this.f40705n) {
            canvas.save();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((getMeasuredWidth() - AndroidUtilities.dp(12.4f)) / 2.0f, (getMeasuredHeight() - AndroidUtilities.dp(12.4f)) / 2.0f, (AndroidUtilities.dp(12.4f) + getMeasuredWidth()) / 2.0f, (AndroidUtilities.dp(12.4f) + getMeasuredHeight()) / 2.0f);
            canvas.rotate(45.0f, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.33f), AndroidUtilities.dp(2.33f), this.d);
            canvas.restore();
        }
        float e = this.v.e(this.f40707s);
        if (e > 0.0f) {
            float dpf2 = AndroidUtilities.dpf2(2.0f);
            Paint paint = this.f40701a;
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
        Path path2 = this.f40704f;
        path2.rewind();
        path2.moveTo(getMeasuredWidth(), 0.0f);
        path2.lineTo(getMeasuredWidth(), getMeasuredHeight());
        path2.lineTo(0.0f, getMeasuredHeight());
        path2.close();
    }

    @Override
    public final void setBackgroundColor(int i10) {
        this.f40701a.setColor(i10);
    }

    @Override
    public final void setPressed(boolean z10) {
        super.setPressed(z10);
        this.f40706r.c(z10);
    }
}
