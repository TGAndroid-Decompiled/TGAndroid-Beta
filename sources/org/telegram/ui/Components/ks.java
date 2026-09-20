package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ks extends f6 {
    public boolean E;
    public boolean F;
    public ch.d f25858s;
    public final Path v;
    public final RectF f25859w;
    public int f25860x;
    public FragmentContextView f25861y;

    public ks(Context context) {
        super(context);
        this.v = new Path();
        this.f25859w = new RectF();
        this.f25860x = 24;
        setOrientation(1);
        ch.d dVar = this.f25858s;
        if (dVar != null) {
            dVar.v();
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        int currentStyle;
        FragmentContextView fragmentContextView;
        Canvas canvas2 = canvas;
        if (getMetadata().f14185c.f14193a != 0.0f) {
            ch.d dVar = this.f25858s;
            if (dVar != null) {
                dVar.draw(canvas2);
            }
            FragmentContextView fragmentContextView2 = this.f25861y;
            le.j jVar = this.f24011c;
            View view = null;
            if (fragmentContextView2 != null && ((currentStyle = fragmentContextView2.getCurrentStyle()) == 3 || currentStyle == 1)) {
                int entriesCount = getEntriesCount();
                for (int i10 = 0; i10 < entriesCount; i10++) {
                    le.g n10 = jVar.n(i10);
                    float paddingTop = getPaddingTop() + n10.b().top;
                    View view2 = ((e6) n10.f14179a).f23744a;
                    float c10 = n10.c();
                    if (c10 > 0.0f && (fragmentContextView = this.f25861y) != null && (fragmentContextView == view2 || fragmentContextView.getParent() == view2)) {
                        id capsuleBlobDrawable = this.f25861y.getCapsuleBlobDrawable();
                        int dp = AndroidUtilities.dp(1.0f) + ((int) capsuleBlobDrawable.c());
                        int i11 = -dp;
                        capsuleBlobDrawable.setBounds(getPaddingLeft() - dp, i11, (getMeasuredWidth() - getPaddingRight()) + dp, (dp * 2) + AndroidUtilities.dp(36.0f) + i11);
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
            canvas2.clipPath(this.v);
            int entriesCount2 = getEntriesCount();
            int i12 = 0;
            while (i12 < entriesCount2) {
                le.g n11 = jVar.n(i12);
                float paddingTop2 = getPaddingTop() + n11.b().top;
                View view4 = ((e6) n11.f14179a).f23744a;
                float min = Math.min(1.0f, n11.f14181c.f14193a) * n11.c();
                if (min > 0.0f && view3 != view4) {
                    int alpha = org.telegram.ui.ActionBar.j6.f19216k0.getAlpha();
                    org.telegram.ui.ActionBar.j6.f19216k0.setAlpha((int) (alpha * min));
                    float f7 = 1.0f - min;
                    canvas2.drawLine(getPaddingLeft() + (AndroidUtilities.dp(16.0f) * f7), paddingTop2, getWidth() - ((AndroidUtilities.dp(16.0f) * f7) + getPaddingRight()), paddingTop2, org.telegram.ui.ActionBar.j6.f19216k0);
                    org.telegram.ui.ActionBar.j6.f19216k0.setAlpha(alpha);
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
        ch.d dVar;
        if (!super.dispatchTouchEvent(motionEvent)) {
            if (motionEvent.getAction() != 0 || (dVar = this.f25858s) == null || !dVar.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z10;
        FragmentContextView fragmentContextView = this.f25861y;
        if (fragmentContextView != null && (fragmentContextView == view || fragmentContextView.getParent() == view)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((z10 && this.E) || (!z10 && this.F)) {
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
        float f7 = getMetadata().f14187g.f14193a;
        float f10 = getMetadata().f14185c.f14193a;
        RectF rectF = this.f25859w;
        rectF.set(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getPaddingTop() + f7);
        float min = Math.min(AndroidUtilities.dp(this.f25860x), Math.min(rectF.width(), rectF.height()) / 2.0f);
        Path path = this.v;
        path.rewind();
        path.addRoundRect(rectF, min, min, Path.Direction.CW);
        ch.d dVar = this.f25858s;
        if (dVar != null) {
            dVar.setAlpha((int) (f10 * 255.0f));
            this.f25858s.setBounds(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(14.0f), getMeasuredWidth() - AndroidUtilities.dp(4.0f), ((getPaddingBottom() + getPaddingTop()) + ((int) f7)) - AndroidUtilities.dp(14.0f));
            this.f25858s.q(Math.min(AndroidUtilities.dp(this.f25860x), f7 / 2.0f));
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        j();
    }

    public void setBlurredBackground(ch.d dVar) {
        this.f25858s = dVar;
    }

    public void setCallFragmentContextView(FragmentContextView fragmentContextView) {
        this.f25861y = fragmentContextView;
        fragmentContextView.getCapsuleBlobDrawable().setCallback(this);
    }

    public void setDefaultRadiusDp(int i10) {
        this.f25860x = i10;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable)) {
            FragmentContextView fragmentContextView = this.f25861y;
            if (fragmentContextView == null || fragmentContextView.getCapsuleBlobDrawable() != drawable) {
                return false;
            }
            return true;
        }
        return true;
    }
}
