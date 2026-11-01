package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
public final class hg extends v5 {
    public vg.f f26784s;
    public final Path f26785w;
    public final RectF f26786x;
    public FragmentContextView f26787y;

    public hg(Context context) {
        super(context);
        this.f26785w = new Path();
        this.f26786x = new RectF();
        setOrientation(1);
        vg.f fVar = this.f26784s;
        if (fVar != null) {
            fVar.updateColors();
        }
        Color.alpha(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20930d6, false));
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        FragmentContextView fragmentContextView;
        int currentStyle;
        FragmentContextView fragmentContextView2;
        Canvas canvas2 = canvas;
        if (getMetadata().f7041c.f7049a == 0.0f) {
            return;
        }
        vg.f fVar = this.f26784s;
        if (fVar != null) {
            fVar.draw(canvas2);
        }
        FragmentContextView fragmentContextView3 = this.f26787y;
        fe.k kVar = this.f31178c;
        if (fragmentContextView3 != null && ((currentStyle = fragmentContextView3.getCurrentStyle()) == 3 || currentStyle == 1)) {
            int entriesCount = getEntriesCount();
            boolean z11 = false;
            for (int i10 = 0; i10 < entriesCount; i10++) {
                fe.h m10 = kVar.m(i10);
                float paddingTop = getPaddingTop() + m10.b().top;
                View view = ((u5) m10.f7035a).f30861a;
                float c10 = m10.c();
                if (c10 > 0.0f && ((fragmentContextView2 = this.f26787y) == view || fragmentContextView2.getParent() == view)) {
                    lc capsuleBlobDrawable = this.f26787y.getCapsuleBlobDrawable();
                    int L = org.telegram.messenger.i0.L(1.0f) + ((int) capsuleBlobDrawable.d());
                    int i11 = -L;
                    capsuleBlobDrawable.setBounds(getPaddingLeft() - L, i11, (getMeasuredWidth() - getPaddingRight()) + L, (L * 2) + org.telegram.messenger.i0.L(36.0f) + i11);
                    capsuleBlobDrawable.setAlpha((int) (c10 * 255.0f));
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
        canvas2.clipPath(this.f26785w);
        int entriesCount2 = getEntriesCount();
        int i12 = 0;
        while (i12 < entriesCount2) {
            fe.h m11 = kVar.m(i12);
            float paddingTop2 = getPaddingTop() + m11.b().top;
            View view2 = ((u5) m11.f7035a).f30861a;
            float min = Math.min(1.0f, m11.f7037c.f7049a) * m11.c();
            if (min > 0.0f && (!z10 || (fragmentContextView = this.f26787y) == null || (fragmentContextView != view2 && fragmentContextView.getParent() != view2))) {
                int alpha = org.telegram.ui.ActionBar.t6.f21053k0.getAlpha();
                org.telegram.ui.ActionBar.t6.f21053k0.setAlpha((int) (alpha * min));
                float f7 = 1.0f - min;
                canvas2.drawLine(getPaddingLeft() + (org.telegram.messenger.i0.L(16.0f) * f7), paddingTop2, getWidth() - ((org.telegram.messenger.i0.L(16.0f) * f7) + getPaddingRight()), paddingTop2, org.telegram.ui.ActionBar.t6.f21053k0);
                org.telegram.ui.ActionBar.t6.f21053k0.setAlpha(alpha);
            }
            i12++;
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        vg.f fVar;
        if (!super.dispatchTouchEvent(motionEvent)) {
            if (motionEvent.getAction() != 0 || (fVar = this.f26784s) == null || !fVar.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
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
        float f7 = getMetadata().f7043g.f7049a;
        float f10 = getMetadata().f7041c.f7049a;
        RectF rectF = this.f26786x;
        rectF.set(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getPaddingTop() + f7);
        float min = Math.min(org.telegram.messenger.i0.L(18.0f), Math.min(rectF.width(), rectF.height()) / 2.0f);
        Path path = this.f26785w;
        path.rewind();
        path.addRoundRect(rectF, min, min, Path.Direction.CW);
        vg.f fVar = this.f26784s;
        if (fVar != null) {
            fVar.setAlpha((int) (f10 * 255.0f));
            this.f26784s.setBounds(getPaddingLeft() - org.telegram.messenger.i0.L(7.0f), 0, org.telegram.messenger.i0.L(7.0f) + (getMeasuredWidth() - getPaddingRight()), getPaddingBottom() + getPaddingTop() + ((int) f7));
            this.f26784s.q(Math.min(org.telegram.messenger.i0.L(18.0f), f7 / 2.0f));
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        j();
    }

    public void setBlurredBackground(vg.f fVar) {
        this.f26784s = fVar;
    }

    public void setCallFragmentContextView(FragmentContextView fragmentContextView) {
        this.f26787y = fragmentContextView;
        fragmentContextView.getCapsuleBlobDrawable().setCallback(this);
    }

    @Override
    public final void setPadding(int i10, int i11, int i12, int i13) {
        super.setPadding(i10, i11, i12, i13);
        j();
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable)) {
            FragmentContextView fragmentContextView = this.f26787y;
            if (fragmentContextView == null || fragmentContextView.getCapsuleBlobDrawable() != drawable) {
                return false;
            }
            return true;
        }
        return true;
    }
}
