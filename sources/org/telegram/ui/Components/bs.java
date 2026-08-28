package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class bs extends a6 {
    public boolean A;
    public boolean B;
    public kg.d f27267s;
    public final Path v;
    public final RectF f27268w;
    public int f27269x;
    public FragmentContextView f27270y;

    public bs(Context context) {
        super(context);
        this.v = new Path();
        this.f27268w = new RectF();
        this.f27269x = 24;
        setOrientation(1);
        kg.d dVar = this.f27267s;
        if (dVar != null) {
            dVar.u();
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        int currentStyle;
        FragmentContextView fragmentContextView;
        Canvas canvas2 = canvas;
        if (getMetadata().f47790c.f47800a != 0.0f) {
            kg.d dVar = this.f27267s;
            if (dVar != null) {
                dVar.draw(canvas2);
            }
            FragmentContextView fragmentContextView2 = this.f27270y;
            td.h hVar = this.f26672c;
            View view = null;
            if (fragmentContextView2 != null && ((currentStyle = fragmentContextView2.getCurrentStyle()) == 3 || currentStyle == 1)) {
                int entriesCount = getEntriesCount();
                for (int i9 = 0; i9 < entriesCount; i9++) {
                    td.e n10 = hVar.n(i9);
                    float paddingTop = getPaddingTop() + n10.b().top;
                    View view2 = ((z5) n10.f47783a).f35193a;
                    float c10 = n10.c();
                    if (c10 > 0.0f && (fragmentContextView = this.f27270y) != null && (fragmentContextView == view2 || fragmentContextView.getParent() == view2)) {
                        yc capsuleBlobDrawable = this.f27270y.getCapsuleBlobDrawable();
                        int dp = AndroidUtilities.dp(1.0f) + ((int) capsuleBlobDrawable.c());
                        int i10 = -dp;
                        capsuleBlobDrawable.setBounds(getPaddingLeft() - dp, i10, (getMeasuredWidth() - getPaddingRight()) + dp, (dp * 2) + AndroidUtilities.dp(36.0f) + i10);
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
            int i11 = 0;
            while (i11 < entriesCount2) {
                td.e n11 = hVar.n(i11);
                float paddingTop2 = getPaddingTop() + n11.b().top;
                View view4 = ((z5) n11.f47783a).f35193a;
                float min = Math.min(1.0f, n11.f47785c.f47800a) * n11.c();
                if (min > 0.0f && view3 != view4) {
                    int alpha = org.telegram.ui.ActionBar.f6.f23121k0.getAlpha();
                    org.telegram.ui.ActionBar.f6.f23121k0.setAlpha((int) (alpha * min));
                    float f10 = 1.0f - min;
                    canvas2.drawLine(getPaddingLeft() + (AndroidUtilities.dp(16.0f) * f10), paddingTop2, getWidth() - ((AndroidUtilities.dp(16.0f) * f10) + getPaddingRight()), paddingTop2, org.telegram.ui.ActionBar.f6.f23121k0);
                    org.telegram.ui.ActionBar.f6.f23121k0.setAlpha(alpha);
                }
                i11++;
                canvas2 = canvas;
            }
            if (view3 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.A = z10;
            this.B = false;
            super.dispatchDraw(canvas);
            canvas.restore();
            if (view3 != null) {
                this.B = true;
                this.A = false;
                super.dispatchDraw(canvas);
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        kg.d dVar;
        if (!super.dispatchTouchEvent(motionEvent)) {
            if (motionEvent.getAction() != 0 || (dVar = this.f27267s) == null || !dVar.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        FragmentContextView fragmentContextView = this.f27270y;
        if (fragmentContextView != null && (fragmentContextView == view || fragmentContextView.getParent() == view)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((z10 && this.A) || (!z10 && this.B)) {
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
        float f10 = getMetadata().f47793g.f47800a;
        float f11 = getMetadata().f47790c.f47800a;
        RectF rectF = this.f27268w;
        rectF.set(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getPaddingTop() + f10);
        float min = Math.min(AndroidUtilities.dp(this.f27269x), Math.min(rectF.width(), rectF.height()) / 2.0f);
        Path path = this.v;
        path.rewind();
        path.addRoundRect(rectF, min, min, Path.Direction.CW);
        kg.d dVar = this.f27267s;
        if (dVar != null) {
            dVar.setAlpha((int) (f11 * 255.0f));
            this.f27267s.setBounds(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(14.0f), getMeasuredWidth() - AndroidUtilities.dp(4.0f), ((getPaddingBottom() + getPaddingTop()) + ((int) f10)) - AndroidUtilities.dp(14.0f));
            this.f27267s.p(Math.min(AndroidUtilities.dp(this.f27269x), f10 / 2.0f));
        }
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        j();
    }

    public void setBlurredBackground(kg.d dVar) {
        this.f27267s = dVar;
    }

    public void setCallFragmentContextView(FragmentContextView fragmentContextView) {
        this.f27270y = fragmentContextView;
        fragmentContextView.getCapsuleBlobDrawable().setCallback(this);
    }

    public void setDefaultRadiusDp(int i9) {
        this.f27269x = i9;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable)) {
            FragmentContextView fragmentContextView = this.f27270y;
            if (fragmentContextView == null || fragmentContextView.getCapsuleBlobDrawable() != drawable) {
                return false;
            }
            return true;
        }
        return true;
    }
}
