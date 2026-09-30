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
    public final Paint f36952a;
    public final Paint f36953b;
    public final Paint f36954c;
    public final Paint d;
    public final Path e;
    public final Path f36955f;
    public boolean h;
    public boolean f36956n;
    public final org.telegram.ui.Components.zc f36957r;
    public boolean f36958s;
    public final org.telegram.ui.Components.e6 v;
    public final rc f36959w;

    public qc(rc rcVar, Context context) {
        super(context);
        this.f36959w = rcVar;
        Paint paint = new Paint(1);
        this.f36952a = paint;
        this.f36953b = new Paint(1);
        this.f36954c = new Paint(1);
        this.d = new Paint(1);
        this.e = new Path();
        this.f36955f = new Path();
        this.f36957r = new org.telegram.ui.Components.zc(this);
        this.v = new org.telegram.ui.Components.e6(this, 0L, 320L, org.telegram.ui.Components.tr.h);
        paint.setStyle(Paint.Style.STROKE);
    }

    public final void a(MessagesController.PeerColor peerColor) {
        boolean q6;
        org.telegram.ui.ActionBar.d6 d6Var = this.f36959w.f37396a;
        if (d6Var != null) {
            q6 = d6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.h6.I.q();
        }
        Paint paint = this.f36954c;
        Paint paint2 = this.f36953b;
        if (q6 && peerColor.hasColor2() && !peerColor.hasColor3()) {
            paint2.setColor(peerColor.getColor(1, d6Var));
            paint.setColor(peerColor.getColor(0, d6Var));
        } else {
            paint2.setColor(peerColor.getColor(0, d6Var));
            paint.setColor(peerColor.getColor(1, d6Var));
        }
        this.d.setColor(peerColor.getColor(2, d6Var));
        this.h = peerColor.hasColor2();
        this.f36956n = peerColor.hasColor3();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        float a2 = this.f36957r.a(0.05f);
        canvas.scale(a2, a2, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        canvas.save();
        canvas.clipPath(this.e);
        canvas.drawPaint(this.f36953b);
        if (this.h) {
            canvas.drawPath(this.f36955f, this.f36954c);
        }
        canvas.restore();
        if (this.f36956n) {
            canvas.save();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((getMeasuredWidth() - AndroidUtilities.dp(12.4f)) / 2.0f, (getMeasuredHeight() - AndroidUtilities.dp(12.4f)) / 2.0f, (AndroidUtilities.dp(12.4f) + getMeasuredWidth()) / 2.0f, (AndroidUtilities.dp(12.4f) + getMeasuredHeight()) / 2.0f);
            canvas.rotate(45.0f, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.33f), AndroidUtilities.dp(2.33f), this.d);
            canvas.restore();
        }
        float e = this.v.e(this.f36958s);
        if (e > 0.0f) {
            float dpf2 = AndroidUtilities.dpf2(2.0f);
            Paint paint = this.f36952a;
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
        Path path2 = this.f36955f;
        path2.rewind();
        path2.moveTo(getMeasuredWidth(), 0.0f);
        path2.lineTo(getMeasuredWidth(), getMeasuredHeight());
        path2.lineTo(0.0f, getMeasuredHeight());
        path2.close();
    }

    @Override
    public final void setBackgroundColor(int i10) {
        this.f36952a.setColor(i10);
    }

    @Override
    public final void setPressed(boolean z10) {
        super.setPressed(z10);
        this.f36957r.c(z10);
    }
}
