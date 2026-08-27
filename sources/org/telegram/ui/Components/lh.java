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

public final class lh extends FrameLayout {

    public final int f30378a = 0;

    public int f30379b;

    public final Object f30380c;
    public final Object d;

    public final NotificationCenter.NotificationCenterDelegate f30381e;

    public lh(qf.m mVar, Context context) {
        super(context);
        this.f30381e = mVar;
        this.f30379b = -1;
        this.f30380c = new Rect();
        this.d = new y5(this, 220L, er.h);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f30378a) {
            case 0:
                org.telegram.ui.v10 v10Var = (org.telegram.ui.v10) this.d;
                Path path = (Path) this.f30380c;
                gi giVar = (gi) this.f30381e;
                lg.d dVar = giVar.f28707x0;
                if (dVar != null) {
                    dVar.setBounds(0, (int) giVar.R1, getMeasuredWidth(), getMeasuredHeight());
                    giVar.f28707x0.draw(canvas);
                }
                float fDp = AndroidUtilities.dp(20.0f);
                int iDp = AndroidUtilities.dp(7.0f);
                int iDp2 = AndroidUtilities.dp(7.0f);
                RectF rectF = AndroidUtilities.rectTmp;
                float f10 = iDp;
                rectF.set(getPaddingLeft(), f10, getWidth() - getPaddingRight(), getHeight() - iDp2);
                path.rewind();
                path.addRoundRect(rectF, fDp, fDp, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                canvas.saveLayerAlpha(rectF, 255, 31);
                super.dispatchDraw(canvas);
                rectF.set(getPaddingLeft(), f10, getWidth() - getPaddingRight(), AndroidUtilities.dp(6.0f) + iDp);
                v10Var.b(canvas, rectF, 1, 1.0f);
                rectF.set(getPaddingLeft(), (getHeight() - iDp2) - AndroidUtilities.dp(6.0f), getWidth() - getPaddingRight(), getHeight() - iDp2);
                v10Var.b(canvas, rectF, 3, 1.0f);
                canvas.restore();
                canvas.restore();
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f30378a) {
            case 1:
                float width = getWidth() / 2.0f;
                y5 y5Var = (y5) this.d;
                qf.m mVar = (qf.m) this.f30381e;
                float fD = y5Var.d(mVar.f46353n.getWidth(), false);
                Rect rect = (Rect) this.f30380c;
                float f10 = fD / 2.0f;
                rect.set((int) (width - (mVar.f46353n.getScaleX() * f10)), (int) (((1.0f - mVar.f46353n.getScaleY()) * mVar.f46353n.getHeight()) + mVar.f46353n.getY()), (int) ((mVar.f46353n.getScaleX() * f10) + width), (int) (mVar.f46353n.getY() + mVar.f46353n.getHeight()));
                mVar.f46354r.setBounds(rect);
                mVar.f46354r.draw(canvas);
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f30378a) {
            case 0:
                int i14 = this.f30379b;
                gi giVar = (gi) this.f30381e;
                int top = i14 - giVar.f28702w.getTop();
                super.onLayout(z10, i10, i11, i12, i13);
                this.f30379b = getHeight();
                if (giVar.f28702w.getVisibility() == 0 && getHeight() - giVar.f28702w.getTop() != top) {
                    giVar.f28702w.setTranslationY(giVar.f28702w.getTranslationY() + ((getHeight() - giVar.f28702w.getTop()) - top));
                    giVar.f28702w.animate().translationY(0.0f).setDuration(320L).setInterpolator(er.h).start();
                    break;
                }
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f30378a) {
            case 1:
                qf.m mVar = (qf.m) this.f30381e;
                mVar.f46353n.measure(i10, i11);
                invalidate();
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(this.f30379b, AndroidUtilities.dp(36.0f) + mVar.f46353n.getMeasuredHeight()), 1073741824));
                if (this.f30379b < 0) {
                    this.f30379b = getMeasuredHeight();
                }
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    public lh(gi giVar, Context context) {
        super(context);
        this.f30381e = giVar;
        this.f30380c = new Path();
        this.d = new org.telegram.ui.v10();
    }
}
