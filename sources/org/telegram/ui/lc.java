package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class lc extends View {
    public final Paint f40155a;
    public final Paint f40156b;
    public final Paint f40157c;
    public final Paint d;
    public final Path f40158e;
    public final Path f40159f;
    public boolean h;
    public boolean f40160n;
    public final org.telegram.ui.Components.uc f40161r;
    public boolean f40162s;
    public final org.telegram.ui.Components.d6 v;
    public final mc f40163w;

    public lc(mc mcVar, Context context) {
        super(context);
        this.f40163w = mcVar;
        Paint paint = new Paint(1);
        this.f40155a = paint;
        this.f40156b = new Paint(1);
        this.f40157c = new Paint(1);
        this.d = new Paint(1);
        this.f40158e = new Path();
        this.f40159f = new Path();
        this.f40161r = new org.telegram.ui.Components.uc(this);
        this.v = new org.telegram.ui.Components.d6(this, 0L, 320L, org.telegram.ui.Components.jr.h);
        paint.setStyle(Paint.Style.STROKE);
    }

    public final void a(MessagesController.PeerColor peerColor) {
        boolean q6;
        org.telegram.ui.ActionBar.c6 c6Var = this.f40163w.f40519a;
        if (c6Var != null) {
            q6 = c6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.g6.I.q();
        }
        Paint paint = this.f40157c;
        Paint paint2 = this.f40156b;
        if (q6 && peerColor.hasColor2() && !peerColor.hasColor3()) {
            paint2.setColor(peerColor.getColor(1, c6Var));
            paint.setColor(peerColor.getColor(0, c6Var));
        } else {
            paint2.setColor(peerColor.getColor(0, c6Var));
            paint.setColor(peerColor.getColor(1, c6Var));
        }
        this.d.setColor(peerColor.getColor(2, c6Var));
        this.h = peerColor.hasColor2();
        this.f40160n = peerColor.hasColor3();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        float a2 = this.f40161r.a(0.05f);
        canvas.scale(a2, a2, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        canvas.save();
        canvas.clipPath(this.f40158e);
        canvas.drawPaint(this.f40156b);
        if (this.h) {
            canvas.drawPath(this.f40159f, this.f40157c);
        }
        canvas.restore();
        if (this.f40160n) {
            canvas.save();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((getMeasuredWidth() - AndroidUtilities.dp(12.4f)) / 2.0f, (getMeasuredHeight() - AndroidUtilities.dp(12.4f)) / 2.0f, (AndroidUtilities.dp(12.4f) + getMeasuredWidth()) / 2.0f, (AndroidUtilities.dp(12.4f) + getMeasuredHeight()) / 2.0f);
            canvas.rotate(45.0f, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.33f), AndroidUtilities.dp(2.33f), this.d);
            canvas.restore();
        }
        float e10 = this.v.e(this.f40162s);
        if (e10 > 0.0f) {
            float dpf2 = AndroidUtilities.dpf2(2.0f);
            Paint paint = this.f40155a;
            paint.setStrokeWidth(dpf2);
            canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, AndroidUtilities.lerp((paint.getStrokeWidth() * 0.5f) + AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f) - (paint.getStrokeWidth() * 2.0f), e10), paint);
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
        Path path = this.f40158e;
        path.rewind();
        path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, AndroidUtilities.dp(20.0f), Path.Direction.CW);
        Path path2 = this.f40159f;
        path2.rewind();
        path2.moveTo(getMeasuredWidth(), 0.0f);
        path2.lineTo(getMeasuredWidth(), getMeasuredHeight());
        path2.lineTo(0.0f, getMeasuredHeight());
        path2.close();
    }

    @Override
    public final void setBackgroundColor(int i10) {
        this.f40155a.setColor(i10);
    }

    @Override
    public final void setPressed(boolean z10) {
        super.setPressed(z10);
        this.f40161r.c(z10);
    }
}
