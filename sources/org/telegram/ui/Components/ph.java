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
    public final int f30082a = 0;
    public int f30083b;
    public final Object f30084c;
    public final Object d;
    public final NotificationCenter.NotificationCenterDelegate f30085e;

    public ph(vf.k kVar, Context context) {
        super(context);
        this.f30085e = kVar;
        this.f30083b = -1;
        this.f30084c = new Rect();
        this.d = new z5(this, 220L, pr.h);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f30082a) {
            case 0:
                org.telegram.ui.h20 h20Var = (org.telegram.ui.h20) this.d;
                Path path = (Path) this.f30084c;
                mi miVar = (mi) this.f30085e;
                qg.b bVar = miVar.f29112y0;
                if (bVar != null) {
                    bVar.setBounds(0, (int) miVar.S1, getMeasuredWidth(), getMeasuredHeight());
                    miVar.f29112y0.draw(canvas);
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
        switch (this.f30082a) {
            case 1:
                float width = getWidth() / 2.0f;
                vf.k kVar = (vf.k) this.f30085e;
                float d = ((z5) this.d).d(kVar.f49077n.getWidth(), false);
                Rect rect = (Rect) this.f30084c;
                float f10 = d / 2.0f;
                rect.set((int) (width - (kVar.f49077n.getScaleX() * f10)), (int) (((1.0f - kVar.f49077n.getScaleY()) * kVar.f49077n.getHeight()) + kVar.f49077n.getY()), (int) ((kVar.f49077n.getScaleX() * f10) + width), (int) (kVar.f49077n.getY() + kVar.f49077n.getHeight()));
                kVar.f49078r.setBounds(rect);
                kVar.f49078r.draw(canvas);
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        switch (this.f30082a) {
            case 0:
                int i14 = this.f30083b;
                mi miVar = (mi) this.f30085e;
                int top = i14 - miVar.f29103w.getTop();
                super.onLayout(z4, i10, i11, i12, i13);
                this.f30083b = getHeight();
                if (miVar.f29103w.getVisibility() == 0 && getHeight() - miVar.f29103w.getTop() != top) {
                    miVar.f29103w.setTranslationY(miVar.f29103w.getTranslationY() + ((getHeight() - miVar.f29103w.getTop()) - top));
                    miVar.f29103w.animate().translationY(0.0f).setDuration(320L).setInterpolator(pr.h).start();
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
        switch (this.f30082a) {
            case 1:
                vf.k kVar = (vf.k) this.f30085e;
                kVar.f49077n.measure(i10, i11);
                invalidate();
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(this.f30083b, AndroidUtilities.dp(36.0f) + kVar.f49077n.getMeasuredHeight()), 1073741824));
                if (this.f30083b < 0) {
                    this.f30083b = getMeasuredHeight();
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
        this.f30085e = miVar;
        this.f30084c = new Path();
        this.d = new org.telegram.ui.h20();
    }
}
