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
    public final int f30095a = 0;
    public int f30096b;
    public final Object f30097c;
    public final Object d;
    public final NotificationCenter.NotificationCenterDelegate f30098e;

    public ph(vf.k kVar, Context context) {
        super(context);
        this.f30098e = kVar;
        this.f30096b = -1;
        this.f30097c = new Rect();
        this.d = new z5(this, 220L, pr.h);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f30095a) {
            case 0:
                org.telegram.ui.h20 h20Var = (org.telegram.ui.h20) this.d;
                Path path = (Path) this.f30097c;
                mi miVar = (mi) this.f30098e;
                qg.b bVar = miVar.f29130y0;
                if (bVar != null) {
                    bVar.setBounds(0, (int) miVar.S1, getMeasuredWidth(), getMeasuredHeight());
                    miVar.f29130y0.draw(canvas);
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
                h20Var.b(canvas, rectF, 1, 1.0f);
                rectF.set(getPaddingLeft(), (getHeight() - dp3) - AndroidUtilities.dp(6.0f), getWidth() - getPaddingRight(), getHeight() - dp3);
                h20Var.b(canvas, rectF, 3, 1.0f);
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
        switch (this.f30095a) {
            case 1:
                float width = getWidth() / 2.0f;
                vf.k kVar = (vf.k) this.f30098e;
                float d = ((z5) this.d).d(kVar.f49114n.getWidth(), false);
                Rect rect = (Rect) this.f30097c;
                float f10 = d / 2.0f;
                rect.set((int) (width - (kVar.f49114n.getScaleX() * f10)), (int) (((1.0f - kVar.f49114n.getScaleY()) * kVar.f49114n.getHeight()) + kVar.f49114n.getY()), (int) ((kVar.f49114n.getScaleX() * f10) + width), (int) (kVar.f49114n.getY() + kVar.f49114n.getHeight()));
                kVar.f49115r.setBounds(rect);
                kVar.f49115r.draw(canvas);
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        switch (this.f30095a) {
            case 0:
                int i14 = this.f30096b;
                mi miVar = (mi) this.f30098e;
                int top = i14 - miVar.f29121w.getTop();
                super.onLayout(z4, i10, i11, i12, i13);
                this.f30096b = getHeight();
                if (miVar.f29121w.getVisibility() == 0 && getHeight() - miVar.f29121w.getTop() != top) {
                    miVar.f29121w.setTranslationY(miVar.f29121w.getTranslationY() + ((getHeight() - miVar.f29121w.getTop()) - top));
                    miVar.f29121w.animate().translationY(0.0f).setDuration(320L).setInterpolator(pr.h).start();
                    return;
                }
                return;
            default:
                super.onLayout(z4, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f30095a) {
            case 1:
                vf.k kVar = (vf.k) this.f30098e;
                kVar.f49114n.measure(i10, i11);
                invalidate();
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(this.f30096b, AndroidUtilities.dp(36.0f) + kVar.f49114n.getMeasuredHeight()), 1073741824));
                if (this.f30096b < 0) {
                    this.f30096b = getMeasuredHeight();
                    return;
                }
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    public ph(mi miVar, Context context) {
        super(context);
        this.f30098e = miVar;
        this.f30097c = new Path();
        this.d = new org.telegram.ui.h20();
    }
}
