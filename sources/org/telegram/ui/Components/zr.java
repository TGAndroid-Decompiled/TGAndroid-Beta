package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
public class zr extends v5 implements org.telegram.ui.ActionBar.k6 {
    public FragmentContextView D;
    public boolean E;
    public boolean F;
    public vg.f f33212s;
    public final Path f33213w;
    public final RectF f33214x;
    public int f33215y;

    public zr(Context context) {
        super(context);
        this.f33213w = new Path();
        this.f33214x = new RectF();
        this.f33215y = 24;
        setOrientation(1);
        updateColors();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        boolean z10;
        int currentStyle;
        FragmentContextView fragmentContextView;
        Canvas canvas2 = canvas;
        if (getMetadata().f7041c.f7049a != 0.0f) {
            vg.f fVar = this.f33212s;
            if (fVar != null) {
                fVar.draw(canvas2);
            }
            FragmentContextView fragmentContextView2 = this.D;
            fe.k kVar = this.f31178c;
            View view = null;
            if (fragmentContextView2 != null && ((currentStyle = fragmentContextView2.getCurrentStyle()) == 3 || currentStyle == 1)) {
                int entriesCount = getEntriesCount();
                for (int i10 = 0; i10 < entriesCount; i10++) {
                    fe.h m10 = kVar.m(i10);
                    float paddingTop = getPaddingTop() + m10.b().top;
                    View view2 = ((u5) m10.f7035a).f30861a;
                    float c10 = m10.c();
                    if (c10 > 0.0f && (fragmentContextView = this.D) != null && (fragmentContextView == view2 || fragmentContextView.getParent() == view2)) {
                        lc capsuleBlobDrawable = this.D.getCapsuleBlobDrawable();
                        int L = org.telegram.messenger.i0.L(1.0f) + ((int) capsuleBlobDrawable.d());
                        int i11 = -L;
                        capsuleBlobDrawable.setBounds(getPaddingLeft() - L, i11, (getMeasuredWidth() - getPaddingRight()) + L, (L * 2) + org.telegram.messenger.i0.L(36.0f) + i11);
                        capsuleBlobDrawable.setAlpha((int) (c10 * 255.0f));
                        canvas2.save();
                        canvas2.translate(0.0f, paddingTop);
                        capsuleBlobDrawable.draw(canvas2);
                        canvas2.restore();
                        view = view2;
                    }
                }
            }
            View view3 = view;
            canvas2.save();
            canvas2.clipPath(this.f33213w);
            int entriesCount2 = getEntriesCount();
            int i12 = 0;
            while (i12 < entriesCount2) {
                fe.h m11 = kVar.m(i12);
                float paddingTop2 = getPaddingTop() + m11.b().top;
                View view4 = ((u5) m11.f7035a).f30861a;
                float min = Math.min(1.0f, m11.f7037c.f7049a) * m11.c();
                if (min > 0.0f && view3 != view4) {
                    int alpha = org.telegram.ui.ActionBar.t6.f21053k0.getAlpha();
                    org.telegram.ui.ActionBar.t6.f21053k0.setAlpha((int) (alpha * min));
                    float f7 = 1.0f - min;
                    canvas2.drawLine(getPaddingLeft() + (org.telegram.messenger.i0.L(16.0f) * f7), paddingTop2, getWidth() - ((org.telegram.messenger.i0.L(16.0f) * f7) + getPaddingRight()), paddingTop2, org.telegram.ui.ActionBar.t6.f21053k0);
                    org.telegram.ui.ActionBar.t6.f21053k0.setAlpha(alpha);
                }
                i12++;
                canvas2 = canvas;
            }
            if (view3 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.E = z10;
            this.F = false;
            super.dispatchDraw(canvas);
            canvas.restore();
            if (view3 != null) {
                this.F = true;
                this.E = false;
                super.dispatchDraw(canvas);
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        vg.f fVar;
        if (!super.dispatchTouchEvent(motionEvent)) {
            if (motionEvent.getAction() != 0 || (fVar = this.f33212s) == null || !fVar.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        FragmentContextView fragmentContextView = this.D;
        if (fragmentContextView != null && (fragmentContextView == view || fragmentContextView.getParent() == view)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((z10 && this.E) || (!z10 && this.F)) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void e() {
        j();
        invalidate();
    }

    public final void j() {
        float f7 = getMetadata().f7043g.f7049a;
        float f10 = getMetadata().f7041c.f7049a;
        RectF rectF = this.f33214x;
        rectF.set(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getPaddingTop() + f7);
        float min = Math.min(org.telegram.messenger.i0.L(this.f33215y), Math.min(rectF.width(), rectF.height()) / 2.0f);
        Path path = this.f33213w;
        path.rewind();
        path.addRoundRect(rectF, min, min, Path.Direction.CW);
        vg.f fVar = this.f33212s;
        if (fVar != null) {
            fVar.setAlpha((int) (f10 * 255.0f));
            this.f33212s.setBounds(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(14.0f), getMeasuredWidth() - org.telegram.messenger.i0.L(4.0f), ((getPaddingBottom() + getPaddingTop()) + ((int) f7)) - org.telegram.messenger.i0.L(14.0f));
            this.f33212s.q(Math.min(org.telegram.messenger.i0.L(this.f33215y), f7 / 2.0f));
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        j();
    }

    public void setBlurredBackground(vg.f fVar) {
        this.f33212s = fVar;
    }

    public void setCallFragmentContextView(FragmentContextView fragmentContextView) {
        this.D = fragmentContextView;
        fragmentContextView.getCapsuleBlobDrawable().setCallback(this);
    }

    public void setDefaultRadiusDp(int i10) {
        this.f33215y = i10;
    }

    @Override
    public final void updateColors() {
        vg.f fVar = this.f33212s;
        if (fVar != null) {
            fVar.updateColors();
        }
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable)) {
            FragmentContextView fragmentContextView = this.D;
            if (fragmentContextView == null || fragmentContextView.getCapsuleBlobDrawable() != drawable) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
