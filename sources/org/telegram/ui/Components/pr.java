package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
public class pr extends y5 implements org.telegram.ui.ActionBar.a6 {
    public FragmentContextView D;
    public boolean E;
    public boolean F;
    public fh.g f37034s;
    public final Path f37035w;
    public final RectF f37036x;
    public int f37037y;

    public pr(Context context) {
        super(context);
        this.f37035w = new Path();
        this.f37036x = new RectF();
        this.f37037y = 24;
        setOrientation(1);
        updateColors();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        boolean z9;
        int currentStyle;
        FragmentContextView fragmentContextView;
        Canvas canvas2 = canvas;
        if (getMetadata().f55411c.f55421a != 0.0f) {
            fh.g gVar = this.f37034s;
            if (gVar != null) {
                gVar.draw(canvas2);
            }
            FragmentContextView fragmentContextView2 = this.D;
            te.h hVar = this.f40527c;
            View view = null;
            if (fragmentContextView2 != null && ((currentStyle = fragmentContextView2.getCurrentStyle()) == 3 || currentStyle == 1)) {
                int entriesCount = getEntriesCount();
                for (int i7 = 0; i7 < entriesCount; i7++) {
                    te.e i10 = hVar.i(i7);
                    float paddingTop = getPaddingTop() + i10.b().top;
                    View view2 = ((x5) i10.f55404a).f40165a;
                    float c10 = i10.c();
                    if (c10 > 0.0f && (fragmentContextView = this.D) != null && (fragmentContextView == view2 || fragmentContextView.getParent() == view2)) {
                        sc capsuleBlobDrawable = this.D.getCapsuleBlobDrawable();
                        int L = org.telegram.messenger.g0.L(1.0f) + ((int) capsuleBlobDrawable.d());
                        int i11 = -L;
                        capsuleBlobDrawable.setBounds(getPaddingLeft() - L, i11, (getMeasuredWidth() - getPaddingRight()) + L, (L * 2) + org.telegram.messenger.g0.L(36.0f) + i11);
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
            canvas2.clipPath(this.f37035w);
            int entriesCount2 = getEntriesCount();
            int i12 = 0;
            while (i12 < entriesCount2) {
                te.e i13 = hVar.i(i12);
                float paddingTop2 = getPaddingTop() + i13.b().top;
                View view4 = ((x5) i13.f55404a).f40165a;
                float min = Math.min(1.0f, i13.f55406c.f55421a) * i13.c();
                if (min > 0.0f && view3 != view4) {
                    int alpha = org.telegram.ui.ActionBar.k6.f27971k0.getAlpha();
                    org.telegram.ui.ActionBar.k6.f27971k0.setAlpha((int) (alpha * min));
                    float f10 = 1.0f - min;
                    canvas2.drawLine(getPaddingLeft() + (org.telegram.messenger.g0.L(16.0f) * f10), paddingTop2, getWidth() - ((org.telegram.messenger.g0.L(16.0f) * f10) + getPaddingRight()), paddingTop2, org.telegram.ui.ActionBar.k6.f27971k0);
                    org.telegram.ui.ActionBar.k6.f27971k0.setAlpha(alpha);
                }
                i12++;
                canvas2 = canvas;
            }
            if (view3 != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.E = z9;
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
        fh.g gVar;
        if (!super.dispatchTouchEvent(motionEvent)) {
            if (motionEvent.getAction() != 0 || (gVar = this.f37034s) == null || !gVar.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z9;
        FragmentContextView fragmentContextView = this.D;
        if (fragmentContextView != null && (fragmentContextView == view || fragmentContextView.getParent() == view)) {
            z9 = true;
        } else {
            z9 = false;
        }
        if ((z9 && this.E) || (!z9 && this.F)) {
            return false;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void e() {
        j();
        invalidate();
    }

    public final void j() {
        float f10 = getMetadata().f55414g.f55421a;
        float f11 = getMetadata().f55411c.f55421a;
        RectF rectF = this.f37036x;
        rectF.set(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getPaddingTop() + f10);
        float min = Math.min(org.telegram.messenger.g0.L(this.f37037y), Math.min(rectF.width(), rectF.height()) / 2.0f);
        Path path = this.f37035w;
        path.rewind();
        path.addRoundRect(rectF, min, min, Path.Direction.CW);
        fh.g gVar = this.f37034s;
        if (gVar != null) {
            gVar.setAlpha((int) (f11 * 255.0f));
            this.f37034s.setBounds(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(14.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(4.0f), ((getPaddingBottom() + getPaddingTop()) + ((int) f10)) - org.telegram.messenger.g0.L(14.0f));
            this.f37034s.r(Math.min(org.telegram.messenger.g0.L(this.f37037y), f10 / 2.0f));
        }
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        j();
    }

    public void setBlurredBackground(fh.g gVar) {
        this.f37034s = gVar;
    }

    public void setCallFragmentContextView(FragmentContextView fragmentContextView) {
        this.D = fragmentContextView;
        fragmentContextView.getCapsuleBlobDrawable().setCallback(this);
    }

    public void setDefaultRadiusDp(int i7) {
        this.f37037y = i7;
    }

    @Override
    public final void updateColors() {
        fh.g gVar = this.f37034s;
        if (gVar != null) {
            gVar.updateColors();
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
