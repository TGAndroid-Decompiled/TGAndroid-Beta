package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class mc extends View {
    public final Paint f40381a;
    public final Paint f40382b;
    public final Paint f40383c;
    public final Paint d;
    public final Path f40384e;
    public final Path f40385f;
    public boolean h;
    public boolean f40386n;
    public final org.telegram.ui.Components.pc f40387r;
    public boolean f40388s;
    public final org.telegram.ui.Components.y5 v;
    public final nc f40389w;

    public mc(nc ncVar, Context context) {
        super(context);
        this.f40389w = ncVar;
        Paint paint = new Paint(1);
        this.f40381a = paint;
        this.f40382b = new Paint(1);
        this.f40383c = new Paint(1);
        this.d = new Paint(1);
        this.f40384e = new Path();
        this.f40385f = new Path();
        this.f40387r = new org.telegram.ui.Components.pc(this);
        this.v = new org.telegram.ui.Components.y5(this, 0L, 320L, org.telegram.ui.Components.gr.h);
        paint.setStyle(Paint.Style.STROKE);
    }

    public final void a(MessagesController.PeerColor peerColor) {
        boolean q10;
        org.telegram.ui.ActionBar.b6 b6Var = this.f40389w.f40692a;
        if (b6Var != null) {
            q10 = b6Var.a();
        } else {
            q10 = org.telegram.ui.ActionBar.f6.I.q();
        }
        Paint paint = this.f40383c;
        Paint paint2 = this.f40382b;
        if (q10 && peerColor.hasColor2() && !peerColor.hasColor3()) {
            paint2.setColor(peerColor.getColor(1, b6Var));
            paint.setColor(peerColor.getColor(0, b6Var));
        } else {
            paint2.setColor(peerColor.getColor(0, b6Var));
            paint.setColor(peerColor.getColor(1, b6Var));
        }
        this.d.setColor(peerColor.getColor(2, b6Var));
        this.h = peerColor.hasColor2();
        this.f40386n = peerColor.hasColor3();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        float a2 = this.f40387r.a(0.05f);
        canvas.scale(a2, a2, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        canvas.save();
        canvas.clipPath(this.f40384e);
        canvas.drawPaint(this.f40382b);
        if (this.h) {
            canvas.drawPath(this.f40385f, this.f40383c);
        }
        canvas.restore();
        if (this.f40386n) {
            canvas.save();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((getMeasuredWidth() - AndroidUtilities.dp(12.4f)) / 2.0f, (getMeasuredHeight() - AndroidUtilities.dp(12.4f)) / 2.0f, (AndroidUtilities.dp(12.4f) + getMeasuredWidth()) / 2.0f, (AndroidUtilities.dp(12.4f) + getMeasuredHeight()) / 2.0f);
            canvas.rotate(45.0f, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.33f), AndroidUtilities.dp(2.33f), this.d);
            canvas.restore();
        }
        float e10 = this.v.e(this.f40388s);
        if (e10 > 0.0f) {
            float dpf2 = AndroidUtilities.dpf2(2.0f);
            Paint paint = this.f40381a;
            paint.setStrokeWidth(dpf2);
            canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, AndroidUtilities.lerp((paint.getStrokeWidth() * 0.5f) + AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f) - (paint.getStrokeWidth() * 2.0f), e10), paint);
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        setMeasuredDimension(AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
        Path path = this.f40384e;
        path.rewind();
        path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, AndroidUtilities.dp(20.0f), Path.Direction.CW);
        Path path2 = this.f40385f;
        path2.rewind();
        path2.moveTo(getMeasuredWidth(), 0.0f);
        path2.lineTo(getMeasuredWidth(), getMeasuredHeight());
        path2.lineTo(0.0f, getMeasuredHeight());
        path2.close();
    }

    @Override
    public final void setBackgroundColor(int i9) {
        this.f40381a.setColor(i9);
    }

    @Override
    public final void setPressed(boolean z10) {
        super.setPressed(z10);
        this.f40387r.c(z10);
    }
}
