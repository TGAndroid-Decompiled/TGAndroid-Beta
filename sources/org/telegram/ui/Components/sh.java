package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class sh extends FrameLayout {
    public final int f32642a = 0;
    public int f32643b;
    public final Object f32644c;
    public final Object d;
    public final NotificationCenter.NotificationCenterDelegate f32645e;

    public sh(sf.l lVar, Context context) {
        super(context);
        this.f32645e = lVar;
        this.f32643b = -1;
        this.f32644c = new Rect();
        this.d = new d6(this, 220L, jr.h);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f32642a) {
            case 0:
                org.telegram.ui.u10 u10Var = (org.telegram.ui.u10) this.d;
                Path path = (Path) this.f32644c;
                ni niVar = (ni) this.f32645e;
                ng.d dVar = niVar.f31062x0;
                if (dVar != null) {
                    dVar.setBounds(0, (int) niVar.R1, getMeasuredWidth(), getMeasuredHeight());
                    niVar.f31062x0.draw(canvas);
                }
                float dp = AndroidUtilities.dp(20.0f);
                int dp2 = AndroidUtilities.dp(7.0f);
                int dp3 = AndroidUtilities.dp(7.0f);
                RectF rectF = AndroidUtilities.rectTmp;
                float f9 = dp2;
                rectF.set(getPaddingLeft(), f9, getWidth() - getPaddingRight(), getHeight() - dp3);
                path.rewind();
                path.addRoundRect(rectF, dp, dp, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                canvas.saveLayerAlpha(rectF, 255, 31);
                super.dispatchDraw(canvas);
                rectF.set(getPaddingLeft(), f9, getWidth() - getPaddingRight(), AndroidUtilities.dp(6.0f) + dp2);
                u10Var.b(canvas, rectF, 1, 1.0f);
                rectF.set(getPaddingLeft(), (getHeight() - dp3) - AndroidUtilities.dp(6.0f), getWidth() - getPaddingRight(), getHeight() - dp3);
                u10Var.b(canvas, rectF, 3, 1.0f);
                canvas.restore();
                canvas.restore();
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f32642a) {
            case 1:
                float width = getWidth() / 2.0f;
                sf.l lVar = (sf.l) this.f32645e;
                float d = ((d6) this.d).d(lVar.f47843n.getWidth(), false);
                Rect rect = (Rect) this.f32644c;
                float f9 = d / 2.0f;
                rect.set((int) (width - (lVar.f47843n.getScaleX() * f9)), (int) (((1.0f - lVar.f47843n.getScaleY()) * lVar.f47843n.getHeight()) + lVar.f47843n.getY()), (int) ((lVar.f47843n.getScaleX() * f9) + width), (int) (lVar.f47843n.getY() + lVar.f47843n.getHeight()));
                lVar.f47844r.setBounds(rect);
                lVar.f47844r.draw(canvas);
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f32642a) {
            case 0:
                int i14 = this.f32643b;
                ni niVar = (ni) this.f32645e;
                int top = i14 - niVar.f31057w.getTop();
                super.onLayout(z10, i10, i11, i12, i13);
                this.f32643b = getHeight();
                if (niVar.f31057w.getVisibility() == 0 && getHeight() - niVar.f31057w.getTop() != top) {
                    niVar.f31057w.setTranslationY(niVar.f31057w.getTranslationY() + ((getHeight() - niVar.f31057w.getTop()) - top));
                    niVar.f31057w.animate().translationY(0.0f).setDuration(320L).setInterpolator(jr.h).start();
                    return;
                }
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f32642a) {
            case 1:
                sf.l lVar = (sf.l) this.f32645e;
                lVar.f47843n.measure(i10, i11);
                invalidate();
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(this.f32643b, AndroidUtilities.dp(36.0f) + lVar.f47843n.getMeasuredHeight()), 1073741824));
                if (this.f32643b < 0) {
                    this.f32643b = getMeasuredHeight();
                    return;
                }
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    public sh(ni niVar, Context context) {
        super(context);
        this.f32645e = niVar;
        this.f32644c = new Path();
        this.d = new org.telegram.ui.u10();
    }
}
