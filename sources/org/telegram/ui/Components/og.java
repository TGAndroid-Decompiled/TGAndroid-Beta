package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public final class og extends a6 {

    public lg.d f31277s;
    public final Path v;

    public final RectF f31278w;

    public FragmentContextView f31279x;

    public og(Context context) {
        super(context);
        this.v = new Path();
        this.f31278w = new RectF();
        setOrientation(1);
        lg.d dVar = this.f31277s;
        if (dVar != null) {
            dVar.u();
        }
        Color.alpha(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        FragmentContextView fragmentContextView;
        int currentStyle;
        FragmentContextView fragmentContextView2;
        Canvas canvas2 = canvas;
        if (getMetadata().f48512c.f48522a == 0.0f) {
            return;
        }
        lg.d dVar = this.f31277s;
        if (dVar != null) {
            dVar.draw(canvas2);
        }
        FragmentContextView fragmentContextView3 = this.f31279x;
        ud.h hVar = this.f26638c;
        if (fragmentContextView3 == null || !((currentStyle = fragmentContextView3.getCurrentStyle()) == 3 || currentStyle == 1)) {
            z10 = false;
        } else {
            int entriesCount = getEntriesCount();
            boolean z11 = false;
            for (int i10 = 0; i10 < entriesCount; i10++) {
                ud.e eVarN = hVar.n(i10);
                float paddingTop = getPaddingTop() + eVarN.b().top;
                View view = ((z5) eVarN.f48505a).f35151a;
                float fC = eVarN.c();
                if (fC > 0.0f && ((fragmentContextView2 = this.f31279x) == view || fragmentContextView2.getParent() == view)) {
                    vc capsuleBlobDrawable = this.f31279x.getCapsuleBlobDrawable();
                    int iDp = AndroidUtilities.dp(1.0f) + ((int) capsuleBlobDrawable.c());
                    int i11 = -iDp;
                    capsuleBlobDrawable.setBounds(getPaddingLeft() - iDp, i11, (getMeasuredWidth() - getPaddingRight()) + iDp, (iDp * 2) + AndroidUtilities.dp(36.0f) + i11);
                    capsuleBlobDrawable.setAlpha((int) (fC * 255.0f));
                    canvas2.save();
                    canvas2.translate(0.0f, paddingTop);
                    capsuleBlobDrawable.draw(canvas2);
                    canvas2.restore();
                    z11 = true;
                }
            }
            z10 = z11;
        }
        canvas2.save();
        canvas2.clipPath(this.v);
        int entriesCount2 = getEntriesCount();
        int i12 = 0;
        while (i12 < entriesCount2) {
            ud.e eVarN2 = hVar.n(i12);
            float paddingTop2 = getPaddingTop() + eVarN2.b().top;
            View view2 = ((z5) eVarN2.f48505a).f35151a;
            float fMin = Math.min(1.0f, eVarN2.f48507c.f48522a) * eVarN2.c();
            if (fMin > 0.0f && (!z10 || (fragmentContextView = this.f31279x) == null || (fragmentContextView != view2 && fragmentContextView.getParent() != view2))) {
                int alpha = org.telegram.ui.ActionBar.g6.f23175k0.getAlpha();
                org.telegram.ui.ActionBar.g6.f23175k0.setAlpha((int) (alpha * fMin));
                float f10 = 1.0f - fMin;
                canvas2.drawLine(getPaddingLeft() + (AndroidUtilities.dp(16.0f) * f10), paddingTop2, getWidth() - ((AndroidUtilities.dp(16.0f) * f10) + getPaddingRight()), paddingTop2, org.telegram.ui.ActionBar.g6.f23175k0);
                org.telegram.ui.ActionBar.g6.f23175k0.setAlpha(alpha);
            }
            i12++;
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        lg.d dVar;
        if (super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return motionEvent.getAction() == 0 && (dVar = this.f31277s) != null && dVar.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY());
    }

    @Override
    public final void e() {
        j();
        invalidate();
    }

    public final void j() {
        float f10 = getMetadata().f48515g.f48522a;
        float f11 = getMetadata().f48512c.f48522a;
        float paddingLeft = getPaddingLeft();
        float paddingTop = getPaddingTop();
        float measuredWidth = getMeasuredWidth() - getPaddingRight();
        float paddingTop2 = getPaddingTop() + f10;
        RectF rectF = this.f31278w;
        rectF.set(paddingLeft, paddingTop, measuredWidth, paddingTop2);
        float fMin = Math.min(AndroidUtilities.dp(18.0f), Math.min(rectF.width(), rectF.height()) / 2.0f);
        Path path = this.v;
        path.rewind();
        path.addRoundRect(rectF, fMin, fMin, Path.Direction.CW);
        lg.d dVar = this.f31277s;
        if (dVar != null) {
            dVar.setAlpha((int) (f11 * 255.0f));
            this.f31277s.setBounds(getPaddingLeft() - AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f) + (getMeasuredWidth() - getPaddingRight()), getPaddingBottom() + getPaddingTop() + ((int) f10));
            this.f31277s.p(Math.min(AndroidUtilities.dp(18.0f), f10 / 2.0f));
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        j();
    }

    public void setBlurredBackground(lg.d dVar) {
        this.f31277s = dVar;
    }

    public void setCallFragmentContextView(FragmentContextView fragmentContextView) {
        this.f31279x = fragmentContextView;
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
        if (super.verifyDrawable(drawable)) {
            return true;
        }
        FragmentContextView fragmentContextView = this.f31279x;
        return fragmentContextView != null && fragmentContextView.getCapsuleBlobDrawable() == drawable;
    }
}
