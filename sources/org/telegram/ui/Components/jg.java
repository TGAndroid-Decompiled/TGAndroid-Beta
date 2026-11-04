package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
public final class jg extends w5 {
    public gh.g f35065s;
    public final Path f35066w;
    public final RectF f35067x;
    public FragmentContextView f35068y;

    public jg(Context context) {
        super(context);
        this.f35066w = new Path();
        this.f35067x = new RectF();
        setOrientation(1);
        gh.g gVar = this.f35065s;
        if (gVar != null) {
            gVar.updateColors();
        }
        Color.alpha(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27878d6, false));
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        FragmentContextView fragmentContextView;
        int currentStyle;
        FragmentContextView fragmentContextView2;
        Canvas canvas2 = canvas;
        if (getMetadata().f53856c.f53866a == 0.0f) {
            return;
        }
        gh.g gVar = this.f35065s;
        if (gVar != null) {
            gVar.draw(canvas2);
        }
        FragmentContextView fragmentContextView3 = this.f35068y;
        qe.h hVar = this.f39888c;
        if (fragmentContextView3 != null && ((currentStyle = fragmentContextView3.getCurrentStyle()) == 3 || currentStyle == 1)) {
            int entriesCount = getEntriesCount();
            boolean z11 = false;
            for (int i3 = 0; i3 < entriesCount; i3++) {
                qe.e i10 = hVar.i(i3);
                float paddingTop = getPaddingTop() + i10.b().top;
                View view = ((v5) i10.f53849a).f39008a;
                float c2 = i10.c();
                if (c2 > 0.0f && ((fragmentContextView2 = this.f35068y) == view || fragmentContextView2.getParent() == view)) {
                    qc capsuleBlobDrawable = this.f35068y.getCapsuleBlobDrawable();
                    int L = org.telegram.messenger.g0.L(1.0f) + ((int) capsuleBlobDrawable.d());
                    int i11 = -L;
                    capsuleBlobDrawable.setBounds(getPaddingLeft() - L, i11, (getMeasuredWidth() - getPaddingRight()) + L, (L * 2) + org.telegram.messenger.g0.L(36.0f) + i11);
                    capsuleBlobDrawable.setAlpha((int) (c2 * 255.0f));
                    canvas2.save();
                    canvas2.translate(0.0f, paddingTop);
                    capsuleBlobDrawable.draw(canvas2);
                    canvas2.restore();
                    z11 = true;
                }
            }
            z10 = z11;
        } else {
            z10 = false;
        }
        canvas2.save();
        canvas2.clipPath(this.f35066w);
        int entriesCount2 = getEntriesCount();
        int i12 = 0;
        while (i12 < entriesCount2) {
            qe.e i13 = hVar.i(i12);
            float paddingTop2 = getPaddingTop() + i13.b().top;
            View view2 = ((v5) i13.f53849a).f39008a;
            float min = Math.min(1.0f, i13.f53851c.f53866a) * i13.c();
            if (min > 0.0f && (!z10 || (fragmentContextView = this.f35068y) == null || (fragmentContextView != view2 && fragmentContextView.getParent() != view2))) {
                int alpha = org.telegram.ui.ActionBar.k6.f28002k0.getAlpha();
                org.telegram.ui.ActionBar.k6.f28002k0.setAlpha((int) (alpha * min));
                float f10 = 1.0f - min;
                canvas2.drawLine(getPaddingLeft() + (org.telegram.messenger.g0.L(16.0f) * f10), paddingTop2, getWidth() - ((org.telegram.messenger.g0.L(16.0f) * f10) + getPaddingRight()), paddingTop2, org.telegram.ui.ActionBar.k6.f28002k0);
                org.telegram.ui.ActionBar.k6.f28002k0.setAlpha(alpha);
            }
            i12++;
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        gh.g gVar;
        if (!super.dispatchTouchEvent(motionEvent)) {
            if (motionEvent.getAction() != 0 || (gVar = this.f35065s) == null || !gVar.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
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
        float f10 = getMetadata().f53859g.f53866a;
        float f11 = getMetadata().f53856c.f53866a;
        RectF rectF = this.f35067x;
        rectF.set(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getPaddingTop() + f10);
        float min = Math.min(org.telegram.messenger.g0.L(18.0f), Math.min(rectF.width(), rectF.height()) / 2.0f);
        Path path = this.f35066w;
        path.rewind();
        path.addRoundRect(rectF, min, min, Path.Direction.CW);
        gh.g gVar = this.f35065s;
        if (gVar != null) {
            gVar.setAlpha((int) (f11 * 255.0f));
            this.f35065s.setBounds(getPaddingLeft() - org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f) + (getMeasuredWidth() - getPaddingRight()), getPaddingBottom() + getPaddingTop() + ((int) f10));
            this.f35065s.r(Math.min(org.telegram.messenger.g0.L(18.0f), f10 / 2.0f));
        }
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        j();
    }

    public void setBlurredBackground(gh.g gVar) {
        this.f35065s = gVar;
    }

    public void setCallFragmentContextView(FragmentContextView fragmentContextView) {
        this.f35068y = fragmentContextView;
        fragmentContextView.getCapsuleBlobDrawable().setCallback(this);
    }

    @Override
    public final void setPadding(int i3, int i10, int i11, int i12) {
        super.setPadding(i3, i10, i11, i12);
        j();
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable)) {
            FragmentContextView fragmentContextView = this.f35068y;
            if (fragmentContextView == null || fragmentContextView.getCapsuleBlobDrawable() != drawable) {
                return false;
            }
            return true;
        }
        return true;
    }
}
