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
    public final int f27855a = 0;
    public int f27856b;
    public final Object f27857c;
    public final Object d;
    public final NotificationCenter.NotificationCenterDelegate e;

    public ph(uf.k kVar, Context context) {
        super(context);
        this.e = kVar;
        this.f27856b = -1;
        this.f27857c = new Rect();
        this.d = new z5(this, 220L, mr.h);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f27855a) {
            case 0:
                org.telegram.ui.i20 i20Var = (org.telegram.ui.i20) this.d;
                Path path = (Path) this.f27857c;
                li liVar = (li) this.e;
                pg.b bVar = liVar.f26756y0;
                if (bVar != null) {
                    bVar.setBounds(0, (int) liVar.S1, getMeasuredWidth(), getMeasuredHeight());
                    liVar.f26756y0.draw(canvas);
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
                i20Var.b(canvas, rectF, 1, 1.0f);
                rectF.set(getPaddingLeft(), (getHeight() - dp3) - AndroidUtilities.dp(6.0f), getWidth() - getPaddingRight(), getHeight() - dp3);
                i20Var.b(canvas, rectF, 3, 1.0f);
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
        switch (this.f27855a) {
            case 1:
                float width = getWidth() / 2.0f;
                uf.k kVar = (uf.k) this.e;
                float d = ((z5) this.d).d(kVar.f45396n.getWidth(), false);
                Rect rect = (Rect) this.f27857c;
                float f10 = d / 2.0f;
                rect.set((int) (width - (kVar.f45396n.getScaleX() * f10)), (int) (((1.0f - kVar.f45396n.getScaleY()) * kVar.f45396n.getHeight()) + kVar.f45396n.getY()), (int) ((kVar.f45396n.getScaleX() * f10) + width), (int) (kVar.f45396n.getY() + kVar.f45396n.getHeight()));
                kVar.f45397r.setBounds(rect);
                kVar.f45397r.draw(canvas);
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        switch (this.f27855a) {
            case 0:
                int i14 = this.f27856b;
                li liVar = (li) this.e;
                int top = i14 - liVar.f26747w.getTop();
                super.onLayout(z4, i10, i11, i12, i13);
                this.f27856b = getHeight();
                if (liVar.f26747w.getVisibility() == 0 && getHeight() - liVar.f26747w.getTop() != top) {
                    liVar.f26747w.setTranslationY(liVar.f26747w.getTranslationY() + ((getHeight() - liVar.f26747w.getTop()) - top));
                    liVar.f26747w.animate().translationY(0.0f).setDuration(320L).setInterpolator(mr.h).start();
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
        switch (this.f27855a) {
            case 1:
                uf.k kVar = (uf.k) this.e;
                kVar.f45396n.measure(i10, i11);
                invalidate();
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(this.f27856b, AndroidUtilities.dp(36.0f) + kVar.f45396n.getMeasuredHeight()), 1073741824));
                if (this.f27856b < 0) {
                    this.f27856b = getMeasuredHeight();
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
        this.f27857c = new Path();
        this.d = new org.telegram.ui.i20();
    }
}
