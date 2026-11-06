package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
public final class lg extends y5 {
    public fh.g f35671s;
    public final Path f35672w;
    public final RectF f35673x;
    public FragmentContextView f35674y;

    public lg(Context context) {
        super(context);
        this.f35672w = new Path();
        this.f35673x = new RectF();
        setOrientation(1);
        fh.g gVar = this.f35671s;
        if (gVar != null) {
            gVar.updateColors();
        }
        Color.alpha(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27849d6, false));
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z9;
        FragmentContextView fragmentContextView;
        int currentStyle;
        FragmentContextView fragmentContextView2;
        Canvas canvas2 = canvas;
        if (getMetadata().f55410c.f55420a == 0.0f) {
            return;
        }
        fh.g gVar = this.f35671s;
        if (gVar != null) {
            gVar.draw(canvas2);
        }
        FragmentContextView fragmentContextView3 = this.f35674y;
        te.h hVar = this.f40549c;
        if (fragmentContextView3 != null && ((currentStyle = fragmentContextView3.getCurrentStyle()) == 3 || currentStyle == 1)) {
            int entriesCount = getEntriesCount();
            boolean z10 = false;
            for (int i7 = 0; i7 < entriesCount; i7++) {
                te.e i10 = hVar.i(i7);
                float paddingTop = getPaddingTop() + i10.b().top;
                View view = ((x5) i10.f55403a).f40187a;
                float c10 = i10.c();
                if (c10 > 0.0f && ((fragmentContextView2 = this.f35674y) == view || fragmentContextView2.getParent() == view)) {
                    sc capsuleBlobDrawable = this.f35674y.getCapsuleBlobDrawable();
                    int L = org.telegram.messenger.g0.L(1.0f) + ((int) capsuleBlobDrawable.d());
                    int i11 = -L;
                    capsuleBlobDrawable.setBounds(getPaddingLeft() - L, i11, (getMeasuredWidth() - getPaddingRight()) + L, (L * 2) + org.telegram.messenger.g0.L(36.0f) + i11);
                    capsuleBlobDrawable.setAlpha((int) (c10 * 255.0f));
                    canvas2.save();
                    canvas2.translate(0.0f, paddingTop);
                    capsuleBlobDrawable.draw(canvas2);
                    canvas2.restore();
                    z10 = true;
                }
            }
            z9 = z10;
        } else {
            z9 = false;
        }
        canvas2.save();
        canvas2.clipPath(this.f35672w);
        int entriesCount2 = getEntriesCount();
        int i12 = 0;
        while (i12 < entriesCount2) {
            te.e i13 = hVar.i(i12);
            float paddingTop2 = getPaddingTop() + i13.b().top;
            View view2 = ((x5) i13.f55403a).f40187a;
            float min = Math.min(1.0f, i13.f55405c.f55420a) * i13.c();
            if (min > 0.0f && (!z9 || (fragmentContextView = this.f35674y) == null || (fragmentContextView != view2 && fragmentContextView.getParent() != view2))) {
                int alpha = org.telegram.ui.ActionBar.k6.f27972k0.getAlpha();
                org.telegram.ui.ActionBar.k6.f27972k0.setAlpha((int) (alpha * min));
                float f10 = 1.0f - min;
                canvas2.drawLine(getPaddingLeft() + (org.telegram.messenger.g0.L(16.0f) * f10), paddingTop2, getWidth() - ((org.telegram.messenger.g0.L(16.0f) * f10) + getPaddingRight()), paddingTop2, org.telegram.ui.ActionBar.k6.f27972k0);
                org.telegram.ui.ActionBar.k6.f27972k0.setAlpha(alpha);
            }
            i12++;
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        fh.g gVar;
        if (!super.dispatchTouchEvent(motionEvent)) {
            if (motionEvent.getAction() != 0 || (gVar = this.f35671s) == null || !gVar.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void e() {
        j();
        invalidate();
    }

    public final void j() {
        float f10 = getMetadata().f55413g.f55420a;
        float f11 = getMetadata().f55410c.f55420a;
        RectF rectF = this.f35673x;
        rectF.set(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getPaddingTop() + f10);
        float min = Math.min(org.telegram.messenger.g0.L(18.0f), Math.min(rectF.width(), rectF.height()) / 2.0f);
        Path path = this.f35672w;
        path.rewind();
        path.addRoundRect(rectF, min, min, Path.Direction.CW);
        fh.g gVar = this.f35671s;
        if (gVar != null) {
            gVar.setAlpha((int) (f11 * 255.0f));
            this.f35671s.setBounds(getPaddingLeft() - org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f) + (getMeasuredWidth() - getPaddingRight()), getPaddingBottom() + getPaddingTop() + ((int) f10));
            this.f35671s.r(Math.min(org.telegram.messenger.g0.L(18.0f), f10 / 2.0f));
        }
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        j();
    }

    public void setBlurredBackground(fh.g gVar) {
        this.f35671s = gVar;
    }

    public void setCallFragmentContextView(FragmentContextView fragmentContextView) {
        this.f35674y = fragmentContextView;
        fragmentContextView.getCapsuleBlobDrawable().setCallback(this);
    }

    @Override
    public final void setPadding(int i7, int i10, int i11, int i12) {
        super.setPadding(i7, i10, i11, i12);
        j();
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable)) {
            FragmentContextView fragmentContextView = this.f35674y;
            if (fragmentContextView == null || fragmentContextView.getCapsuleBlobDrawable() != drawable) {
                return false;
            }
            return true;
        }
        return true;
    }
}
