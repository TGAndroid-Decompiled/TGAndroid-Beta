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
    public final int f27837a = 0;
    public int f27838b;
    public final Object f27839c;
    public final Object d;
    public final NotificationCenter.NotificationCenterDelegate e;

    public ph(uf.k kVar, Context context) {
        super(context);
        this.e = kVar;
        this.f27838b = -1;
        this.f27839c = new Rect();
        this.d = new z5(this, 220L, nr.h);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f27837a) {
            case 0:
                org.telegram.ui.g20 g20Var = (org.telegram.ui.g20) this.d;
                Path path = (Path) this.f27839c;
                li liVar = (li) this.e;
                pg.b bVar = liVar.f26760y0;
                if (bVar != null) {
                    bVar.setBounds(0, (int) liVar.S1, getMeasuredWidth(), getMeasuredHeight());
                    liVar.f26760y0.draw(canvas);
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
                g20Var.b(canvas, rectF, 1, 1.0f);
                rectF.set(getPaddingLeft(), (getHeight() - dp3) - AndroidUtilities.dp(6.0f), getWidth() - getPaddingRight(), getHeight() - dp3);
                g20Var.b(canvas, rectF, 3, 1.0f);
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
        switch (this.f27837a) {
            case 1:
                float width = getWidth() / 2.0f;
                uf.k kVar = (uf.k) this.e;
                float d = ((z5) this.d).d(kVar.f45332n.getWidth(), false);
                Rect rect = (Rect) this.f27839c;
                float f10 = d / 2.0f;
                rect.set((int) (width - (kVar.f45332n.getScaleX() * f10)), (int) (((1.0f - kVar.f45332n.getScaleY()) * kVar.f45332n.getHeight()) + kVar.f45332n.getY()), (int) ((kVar.f45332n.getScaleX() * f10) + width), (int) (kVar.f45332n.getY() + kVar.f45332n.getHeight()));
                kVar.f45333r.setBounds(rect);
                kVar.f45333r.draw(canvas);
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        switch (this.f27837a) {
            case 0:
                int i14 = this.f27838b;
                li liVar = (li) this.e;
                int top = i14 - liVar.f26751w.getTop();
                super.onLayout(z4, i10, i11, i12, i13);
                this.f27838b = getHeight();
                if (liVar.f26751w.getVisibility() == 0 && getHeight() - liVar.f26751w.getTop() != top) {
                    liVar.f26751w.setTranslationY(liVar.f26751w.getTranslationY() + ((getHeight() - liVar.f26751w.getTop()) - top));
                    liVar.f26751w.animate().translationY(0.0f).setDuration(320L).setInterpolator(nr.h).start();
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
        switch (this.f27837a) {
            case 1:
                uf.k kVar = (uf.k) this.e;
                kVar.f45332n.measure(i10, i11);
                invalidate();
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(this.f27838b, AndroidUtilities.dp(36.0f) + kVar.f45332n.getMeasuredHeight()), 1073741824));
                if (this.f27838b < 0) {
                    this.f27838b = getMeasuredHeight();
                    return;
                }
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    public ph(li liVar, Context context) {
        super(context);
        this.e = liVar;
        this.f27839c = new Path();
        this.d = new org.telegram.ui.g20();
    }
}
