package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
public class pr extends w5 implements org.telegram.ui.ActionBar.z5 {
    public FragmentContextView E;
    public boolean F;
    public boolean G;
    public gh.g f37222s;
    public final Path f37223w;
    public final RectF f37224x;
    public int f37225y;

    public pr(Context context) {
        super(context);
        this.f37223w = new Path();
        this.f37224x = new RectF();
        this.f37225y = 24;
        setOrientation(1);
        updateColors();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        boolean z10;
        int currentStyle;
        FragmentContextView fragmentContextView;
        Canvas canvas2 = canvas;
        if (getMetadata().f53856c.f53866a != 0.0f) {
            gh.g gVar = this.f37222s;
            if (gVar != null) {
                gVar.draw(canvas2);
            }
            FragmentContextView fragmentContextView2 = this.E;
            qe.h hVar = this.f39888c;
            View view = null;
            if (fragmentContextView2 != null && ((currentStyle = fragmentContextView2.getCurrentStyle()) == 3 || currentStyle == 1)) {
                int entriesCount = getEntriesCount();
                for (int i3 = 0; i3 < entriesCount; i3++) {
                    qe.e i10 = hVar.i(i3);
                    float paddingTop = getPaddingTop() + i10.b().top;
                    View view2 = ((v5) i10.f53849a).f39008a;
                    float c2 = i10.c();
                    if (c2 > 0.0f && (fragmentContextView = this.E) != null && (fragmentContextView == view2 || fragmentContextView.getParent() == view2)) {
                        qc capsuleBlobDrawable = this.E.getCapsuleBlobDrawable();
                        int L = org.telegram.messenger.g0.L(1.0f) + ((int) capsuleBlobDrawable.d());
                        int i11 = -L;
                        capsuleBlobDrawable.setBounds(getPaddingLeft() - L, i11, (getMeasuredWidth() - getPaddingRight()) + L, (L * 2) + org.telegram.messenger.g0.L(36.0f) + i11);
                        capsuleBlobDrawable.setAlpha((int) (c2 * 255.0f));
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
            canvas2.clipPath(this.f37223w);
            int entriesCount2 = getEntriesCount();
            int i12 = 0;
            while (i12 < entriesCount2) {
                qe.e i13 = hVar.i(i12);
                float paddingTop2 = getPaddingTop() + i13.b().top;
                View view4 = ((v5) i13.f53849a).f39008a;
                float min = Math.min(1.0f, i13.f53851c.f53866a) * i13.c();
                if (min > 0.0f && view3 != view4) {
                    int alpha = org.telegram.ui.ActionBar.k6.f28002k0.getAlpha();
                    org.telegram.ui.ActionBar.k6.f28002k0.setAlpha((int) (alpha * min));
                    float f10 = 1.0f - min;
                    canvas2.drawLine(getPaddingLeft() + (org.telegram.messenger.g0.L(16.0f) * f10), paddingTop2, getWidth() - ((org.telegram.messenger.g0.L(16.0f) * f10) + getPaddingRight()), paddingTop2, org.telegram.ui.ActionBar.k6.f28002k0);
                    org.telegram.ui.ActionBar.k6.f28002k0.setAlpha(alpha);
                }
                i12++;
                canvas2 = canvas;
            }
            if (view3 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.F = z10;
            this.G = false;
            super.dispatchDraw(canvas);
            canvas.restore();
            if (view3 != null) {
                this.G = true;
                this.F = false;
                super.dispatchDraw(canvas);
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        gh.g gVar;
        if (!super.dispatchTouchEvent(motionEvent)) {
            if (motionEvent.getAction() != 0 || (gVar = this.f37222s) == null || !gVar.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        FragmentContextView fragmentContextView = this.E;
        if (fragmentContextView != null && (fragmentContextView == view || fragmentContextView.getParent() == view)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((z10 && this.F) || (!z10 && this.G)) {
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
        float f10 = getMetadata().f53859g.f53866a;
        float f11 = getMetadata().f53856c.f53866a;
        RectF rectF = this.f37224x;
        rectF.set(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getPaddingTop() + f10);
        float min = Math.min(org.telegram.messenger.g0.L(this.f37225y), Math.min(rectF.width(), rectF.height()) / 2.0f);
        Path path = this.f37223w;
        path.rewind();
        path.addRoundRect(rectF, min, min, Path.Direction.CW);
        gh.g gVar = this.f37222s;
        if (gVar != null) {
            gVar.setAlpha((int) (f11 * 255.0f));
            this.f37222s.setBounds(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(14.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(4.0f), ((getPaddingBottom() + getPaddingTop()) + ((int) f10)) - org.telegram.messenger.g0.L(14.0f));
            this.f37222s.r(Math.min(org.telegram.messenger.g0.L(this.f37225y), f10 / 2.0f));
        }
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        j();
    }

    public void setBlurredBackground(gh.g gVar) {
        this.f37222s = gVar;
    }

    public void setCallFragmentContextView(FragmentContextView fragmentContextView) {
        this.E = fragmentContextView;
        fragmentContextView.getCapsuleBlobDrawable().setCallback(this);
    }

    public void setDefaultRadiusDp(int i3) {
        this.f37225y = i3;
    }

    @Override
    public final void updateColors() {
        gh.g gVar = this.f37222s;
        if (gVar != null) {
            gVar.updateColors();
        }
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable)) {
            FragmentContextView fragmentContextView = this.E;
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
