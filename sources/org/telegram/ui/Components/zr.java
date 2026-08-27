package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public final class zr extends a6 {
    public boolean A;
    public boolean B;

    public lg.d f35326s;
    public final Path v;

    public final RectF f35327w;

    public int f35328x;

    public FragmentContextView f35329y;

    public zr(Context context) {
        super(context);
        this.v = new Path();
        this.f35327w = new RectF();
        this.f35328x = 24;
        setOrientation(1);
        lg.d dVar = this.f35326s;
        if (dVar != null) {
            dVar.u();
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int currentStyle;
        FragmentContextView fragmentContextView;
        Canvas canvas2 = canvas;
        if (getMetadata().f48512c.f48522a == 0.0f) {
            return;
        }
        lg.d dVar = this.f35326s;
        if (dVar != null) {
            dVar.draw(canvas2);
        }
        FragmentContextView fragmentContextView2 = this.f35329y;
        ud.h hVar = this.f26638c;
        View view = null;
        if (fragmentContextView2 != null && ((currentStyle = fragmentContextView2.getCurrentStyle()) == 3 || currentStyle == 1)) {
            int entriesCount = getEntriesCount();
            for (int i10 = 0; i10 < entriesCount; i10++) {
                ud.e eVarN = hVar.n(i10);
                float paddingTop = getPaddingTop() + eVarN.b().top;
                View view2 = ((z5) eVarN.f48505a).f35151a;
                float fC = eVarN.c();
                if (fC > 0.0f && (fragmentContextView = this.f35329y) != null && (fragmentContextView == view2 || fragmentContextView.getParent() == view2)) {
                    vc capsuleBlobDrawable = this.f35329y.getCapsuleBlobDrawable();
                    int iDp = AndroidUtilities.dp(1.0f) + ((int) capsuleBlobDrawable.c());
                    int i11 = -iDp;
                    capsuleBlobDrawable.setBounds(getPaddingLeft() - iDp, i11, (getMeasuredWidth() - getPaddingRight()) + iDp, (iDp * 2) + AndroidUtilities.dp(36.0f) + i11);
                    capsuleBlobDrawable.setAlpha((int) (fC * 255.0f));
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
            ud.e eVarN2 = hVar.n(i12);
            float paddingTop2 = getPaddingTop() + eVarN2.b().top;
            View view4 = ((z5) eVarN2.f48505a).f35151a;
            float fMin = Math.min(1.0f, eVarN2.f48507c.f48522a) * eVarN2.c();
            if (fMin > 0.0f && view3 != view4) {
                int alpha = org.telegram.ui.ActionBar.g6.f23175k0.getAlpha();
                org.telegram.ui.ActionBar.g6.f23175k0.setAlpha((int) (alpha * fMin));
                float f10 = 1.0f - fMin;
                canvas2.drawLine(getPaddingLeft() + (AndroidUtilities.dp(16.0f) * f10), paddingTop2, getWidth() - ((AndroidUtilities.dp(16.0f) * f10) + getPaddingRight()), paddingTop2, org.telegram.ui.ActionBar.g6.f23175k0);
                org.telegram.ui.ActionBar.g6.f23175k0.setAlpha(alpha);
            }
            i12++;
            canvas2 = canvas;
        }
        this.A = view3 != null;
        this.B = false;
        super.dispatchDraw(canvas);
        canvas.restore();
        if (view3 != null) {
            this.B = true;
            this.A = false;
            super.dispatchDraw(canvas);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        lg.d dVar;
        if (super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return motionEvent.getAction() == 0 && (dVar = this.f35326s) != null && dVar.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY());
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        FragmentContextView fragmentContextView = this.f35329y;
        boolean z10 = fragmentContextView != null && (fragmentContextView == view || fragmentContextView.getParent() == view);
        if (!(z10 && this.A) && (z10 || !this.B)) {
            return super.drawChild(canvas, view, j10);
        }
        return false;
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
        RectF rectF = this.f35327w;
        rectF.set(paddingLeft, paddingTop, measuredWidth, paddingTop2);
        float fMin = Math.min(AndroidUtilities.dp(this.f35328x), Math.min(rectF.width(), rectF.height()) / 2.0f);
        Path path = this.v;
        path.rewind();
        path.addRoundRect(rectF, fMin, fMin, Path.Direction.CW);
        lg.d dVar = this.f35326s;
        if (dVar != null) {
            dVar.setAlpha((int) (f11 * 255.0f));
            this.f35326s.setBounds(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(14.0f), getMeasuredWidth() - AndroidUtilities.dp(4.0f), ((getPaddingBottom() + getPaddingTop()) + ((int) f10)) - AndroidUtilities.dp(14.0f));
            this.f35326s.p(Math.min(AndroidUtilities.dp(this.f35328x), f10 / 2.0f));
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        j();
    }

    public void setBlurredBackground(lg.d dVar) {
        this.f35326s = dVar;
    }

    public void setCallFragmentContextView(FragmentContextView fragmentContextView) {
        this.f35329y = fragmentContextView;
        fragmentContextView.getCapsuleBlobDrawable().setCallback(this);
    }

    public void setDefaultRadiusDp(int i10) {
        this.f35328x = i10;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable)) {
            return true;
        }
        FragmentContextView fragmentContextView = this.f35329y;
        return fragmentContextView != null && fragmentContextView.getCapsuleBlobDrawable() == drawable;
    }
}
