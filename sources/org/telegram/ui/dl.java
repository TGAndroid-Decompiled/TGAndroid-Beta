package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
public final class dl extends org.telegram.ui.Components.t9 {
    public final int C = 0;
    public Object D;
    public Object E;
    public Object F;

    public dl(Context context) {
        super(context);
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.C) {
            case 1:
                gh.k kVar = (gh.k) this.E;
                Path path = (Path) this.D;
                super.draw(canvas);
                if (((org.telegram.ui.Components.ko) this.F).h) {
                    path.rewind();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(this.f32903a.getImageX(), this.f32903a.getImageY(), this.f32903a.getImageX2(), this.f32903a.getImageY2());
                    path.addRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    kVar.h(i0.a.k(-1, (int) (Color.alpha(-1) * 0.325f)));
                    kVar.setBounds((int) this.f32903a.getImageX(), (int) this.f32903a.getImageY(), (int) this.f32903a.getImageX2(), (int) this.f32903a.getImageY2());
                    kVar.draw(canvas);
                    invalidate();
                    canvas.restore();
                    return;
                }
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.C) {
            case 0:
                float[] fArr = (float[]) this.F;
                gh.k kVar = (gh.k) this.E;
                Path path = (Path) this.D;
                super.onDraw(canvas);
                if (this.f32909r) {
                    canvas.save();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    int[] roundRadius = this.f32903a.getRoundRadius();
                    float f9 = roundRadius[0];
                    fArr[1] = f9;
                    fArr[0] = f9;
                    float f10 = roundRadius[1];
                    fArr[3] = f10;
                    fArr[2] = f10;
                    float f11 = roundRadius[2];
                    fArr[5] = f11;
                    fArr[4] = f11;
                    float f12 = roundRadius[3];
                    fArr[7] = f12;
                    fArr[6] = f12;
                    path.rewind();
                    path.addRoundRect(rectF, fArr, Path.Direction.CW);
                    canvas.clipPath(path);
                    kVar.h(i0.a.k(-1, (int) (Color.alpha(-1) * 0.325f)));
                    kVar.setBounds(0, 0, getWidth(), getHeight());
                    kVar.draw(canvas);
                    canvas.restore();
                    invalidate();
                    return;
                }
                return;
            case 1:
            default:
                super.onDraw(canvas);
                return;
            case 2:
                org.telegram.ui.Components.voip.h hVar = (org.telegram.ui.Components.voip.h) this.E;
                super.onDraw(canvas);
                org.telegram.ui.Components.s50 s50Var = (org.telegram.ui.Components.s50) this.F;
                if (s50Var.f32512o0) {
                    int i10 = s50Var.J0;
                    hVar.f33720f = i10;
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    float f13 = i10;
                    rectF2.set(0.0f, 0.0f, f13, f13);
                    float width = rectF2.width() / 2.0f;
                    canvas.drawRoundRect(rectF2, width, width, (Paint) this.D);
                    rectF2.inset(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
                    hVar.a(width, canvas, rectF2, null);
                    invalidate();
                    return;
                }
                return;
        }
    }

    public dl(org.telegram.ui.Components.ko koVar, Context context, gh.k kVar) {
        super(context);
        this.F = koVar;
        this.E = kVar;
        this.D = new Path();
    }

    public dl(org.telegram.ui.Components.s50 s50Var, Context context, Paint paint) {
        super(context);
        this.F = s50Var;
        this.D = paint;
        this.E = new org.telegram.ui.Components.voip.h();
    }
}
