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
public final class ph extends FrameLayout {
    public final int f31659a = 0;
    public int f31660b;
    public final Object f31661c;
    public final Object d;
    public final NotificationCenter.NotificationCenterDelegate f31662e;

    public ph(pf.l lVar, Context context) {
        super(context);
        this.f31662e = lVar;
        this.f31660b = -1;
        this.f31661c = new Rect();
        this.d = new y5(this, 220L, gr.h);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f31659a) {
            case 0:
                org.telegram.ui.s10 s10Var = (org.telegram.ui.s10) this.d;
                Path path = (Path) this.f31661c;
                ki kiVar = (ki) this.f31662e;
                kg.d dVar = kiVar.f30171x0;
                if (dVar != null) {
                    dVar.setBounds(0, (int) kiVar.R1, getMeasuredWidth(), getMeasuredHeight());
                    kiVar.f30171x0.draw(canvas);
                }
                float dp = AndroidUtilities.dp(20.0f);
                int dp2 = AndroidUtilities.dp(7.0f);
                int dp3 = AndroidUtilities.dp(7.0f);
                RectF rectF = AndroidUtilities.rectTmp;
                float f10 = dp2;
                rectF.set(getPaddingLeft(), f10, getWidth() - getPaddingRight(), getHeight() - dp3);
                path.rewind();
                path.addRoundRect(rectF, dp, dp, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                canvas.saveLayerAlpha(rectF, 255, 31);
                super.dispatchDraw(canvas);
                rectF.set(getPaddingLeft(), f10, getWidth() - getPaddingRight(), AndroidUtilities.dp(6.0f) + dp2);
                s10Var.b(canvas, rectF, 1, 1.0f);
                rectF.set(getPaddingLeft(), (getHeight() - dp3) - AndroidUtilities.dp(6.0f), getWidth() - getPaddingRight(), getHeight() - dp3);
                s10Var.b(canvas, rectF, 3, 1.0f);
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
        switch (this.f31659a) {
            case 1:
                float width = getWidth() / 2.0f;
                pf.l lVar = (pf.l) this.f31662e;
                float d = ((y5) this.d).d(lVar.f45669n.getWidth(), false);
                Rect rect = (Rect) this.f31661c;
                float f10 = d / 2.0f;
                rect.set((int) (width - (lVar.f45669n.getScaleX() * f10)), (int) (((1.0f - lVar.f45669n.getScaleY()) * lVar.f45669n.getHeight()) + lVar.f45669n.getY()), (int) ((lVar.f45669n.getScaleX() * f10) + width), (int) (lVar.f45669n.getY() + lVar.f45669n.getHeight()));
                lVar.f45670r.setBounds(rect);
                lVar.f45670r.draw(canvas);
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        switch (this.f31659a) {
            case 0:
                int i13 = this.f31660b;
                ki kiVar = (ki) this.f31662e;
                int top = i13 - kiVar.f30166w.getTop();
                super.onLayout(z10, i9, i10, i11, i12);
                this.f31660b = getHeight();
                if (kiVar.f30166w.getVisibility() == 0 && getHeight() - kiVar.f30166w.getTop() != top) {
                    kiVar.f30166w.setTranslationY(kiVar.f30166w.getTranslationY() + ((getHeight() - kiVar.f30166w.getTop()) - top));
                    kiVar.f30166w.animate().translationY(0.0f).setDuration(320L).setInterpolator(gr.h).start();
                    return;
                }
                return;
            default:
                super.onLayout(z10, i9, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i9, int i10) {
        switch (this.f31659a) {
            case 1:
                pf.l lVar = (pf.l) this.f31662e;
                lVar.f45669n.measure(i9, i10);
                invalidate();
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(Math.max(this.f31660b, AndroidUtilities.dp(36.0f) + lVar.f45669n.getMeasuredHeight()), 1073741824));
                if (this.f31660b < 0) {
                    this.f31660b = getMeasuredHeight();
                    return;
                }
                return;
            default:
                super.onMeasure(i9, i10);
                return;
        }
    }

    public ph(ki kiVar, Context context) {
        super(context);
        this.f31662e = kiVar;
        this.f31661c = new Path();
        this.d = new org.telegram.ui.s10();
    }
}
