package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class ld extends FrameLayout {
    public final LinearLayout f30170a;
    public final RectF f30171b;
    public final RectF f30172c;
    public final RectF d;
    public final Path e;
    public final Paint f30173f;
    public final eh.d h;
    public float f30174n;
    public final md f30175r;

    public ld(md mdVar, ch.b bVar) {
        super(mdVar.f30526b.getContext());
        this.f30175r = mdVar;
        this.f30171b = new RectF();
        this.f30172c = new RectF();
        this.d = new RectF();
        this.e = new Path();
        this.f30173f = new Paint(3);
        setClipChildren(false);
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f30170a = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, gb1.g(-2.0f, 232));
        eh.d c10 = bVar.c(this, null, true);
        c10.v(gh.c.k(mdVar.d));
        this.h = c10;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF = this.f30171b;
        float f7 = rectF.left;
        RectF rectF2 = this.f30172c;
        float f10 = this.f30174n;
        float f11 = ((rectF2.left - f7) * f10) + f7;
        float f12 = rectF.top;
        float z10 = c3.h0.z(rectF2.top, f12, f10, f12);
        float f13 = rectF.right;
        float z11 = c3.h0.z(rectF2.right, f13, f10, f13);
        float f14 = rectF.bottom;
        float z12 = c3.h0.z(rectF2.bottom, f14, f10, f14);
        RectF rectF3 = this.d;
        rectF3.set(f11, z10, z11, z12);
        float dp = ((AndroidUtilities.dp(16.0f) - AndroidUtilities.dp(22.0f)) * this.f30174n) + AndroidUtilities.dp(22.0f);
        eh.d dVar = this.h;
        dVar.x(dp);
        dVar.setBounds(Math.round(rectF3.left), Math.round(rectF3.top), Math.round(rectF3.right), Math.round(rectF3.bottom));
        dVar.draw(canvas);
        canvas.save();
        Path path = this.e;
        path.rewind();
        path.addRoundRect(rectF3, dp, dp, Path.Direction.CW);
        canvas.clipPath(path);
        md mdVar = this.f30175r;
        if (mdVar.f30528f != null) {
            float f15 = this.f30174n;
            if (f15 < 0.5f) {
                int round = Math.round((1.0f - (f15 / 0.5f)) * 255.0f);
                Paint paint = this.f30173f;
                paint.setAlpha(round);
                canvas.drawBitmap(mdVar.f30528f, rectF.left, rectF.top, paint);
            }
        }
        int saveLayerAlpha = canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), Math.round(Math.max(0.0f, Math.min(1.0f, (this.f30174n - 0.15f) / 0.85f)) * 255.0f));
        canvas.translate(0.0f, (1.0f - this.f30174n) * AndroidUtilities.dp(8.0f));
        super.dispatchDraw(canvas);
        canvas.restoreToCount(saveLayerAlpha);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f30175r.f30529g && !super.dispatchTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }
}
