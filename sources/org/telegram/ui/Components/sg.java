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
public final class sg extends a6 {
    public kg.d f32458s;
    public final Path v;
    public final RectF f32459w;
    public FragmentContextView f32460x;

    public sg(Context context) {
        super(context);
        this.v = new Path();
        this.f32459w = new RectF();
        setOrientation(1);
        kg.d dVar = this.f32458s;
        if (dVar != null) {
            dVar.u();
        }
        Color.alpha(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        FragmentContextView fragmentContextView;
        int currentStyle;
        FragmentContextView fragmentContextView2;
        Canvas canvas2 = canvas;
        if (getMetadata().f47790c.f47800a == 0.0f) {
            return;
        }
        kg.d dVar = this.f32458s;
        if (dVar != null) {
            dVar.draw(canvas2);
        }
        FragmentContextView fragmentContextView3 = this.f32460x;
        td.h hVar = this.f26672c;
        if (fragmentContextView3 != null && ((currentStyle = fragmentContextView3.getCurrentStyle()) == 3 || currentStyle == 1)) {
            int entriesCount = getEntriesCount();
            boolean z11 = false;
            for (int i9 = 0; i9 < entriesCount; i9++) {
                td.e n10 = hVar.n(i9);
                float paddingTop = getPaddingTop() + n10.b().top;
                View view = ((z5) n10.f47783a).f35193a;
                float c10 = n10.c();
                if (c10 > 0.0f && ((fragmentContextView2 = this.f32460x) == view || fragmentContextView2.getParent() == view)) {
                    yc capsuleBlobDrawable = this.f32460x.getCapsuleBlobDrawable();
                    int dp = AndroidUtilities.dp(1.0f) + ((int) capsuleBlobDrawable.c());
                    int i10 = -dp;
                    capsuleBlobDrawable.setBounds(getPaddingLeft() - dp, i10, (getMeasuredWidth() - getPaddingRight()) + dp, (dp * 2) + AndroidUtilities.dp(36.0f) + i10);
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
        canvas2.clipPath(this.v);
        int entriesCount2 = getEntriesCount();
        int i11 = 0;
        while (i11 < entriesCount2) {
            td.e n11 = hVar.n(i11);
            float paddingTop2 = getPaddingTop() + n11.b().top;
            View view2 = ((z5) n11.f47783a).f35193a;
            float min = Math.min(1.0f, n11.f47785c.f47800a) * n11.c();
            if (min > 0.0f && (!z10 || (fragmentContextView = this.f32460x) == null || (fragmentContextView != view2 && fragmentContextView.getParent() != view2))) {
                int alpha = org.telegram.ui.ActionBar.f6.f23121k0.getAlpha();
                org.telegram.ui.ActionBar.f6.f23121k0.setAlpha((int) (alpha * min));
                float f10 = 1.0f - min;
                canvas2.drawLine(getPaddingLeft() + (AndroidUtilities.dp(16.0f) * f10), paddingTop2, getWidth() - ((AndroidUtilities.dp(16.0f) * f10) + getPaddingRight()), paddingTop2, org.telegram.ui.ActionBar.f6.f23121k0);
                org.telegram.ui.ActionBar.f6.f23121k0.setAlpha(alpha);
            }
            i11++;
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        kg.d dVar;
        if (!super.dispatchTouchEvent(motionEvent)) {
            if (motionEvent.getAction() != 0 || (dVar = this.f32458s) == null || !dVar.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
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
        float f10 = getMetadata().f47793g.f47800a;
        float f11 = getMetadata().f47790c.f47800a;
        RectF rectF = this.f32459w;
        rectF.set(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getPaddingTop() + f10);
        float min = Math.min(AndroidUtilities.dp(18.0f), Math.min(rectF.width(), rectF.height()) / 2.0f);
        Path path = this.v;
        path.rewind();
        path.addRoundRect(rectF, min, min, Path.Direction.CW);
        kg.d dVar = this.f32458s;
        if (dVar != null) {
            dVar.setAlpha((int) (f11 * 255.0f));
            this.f32458s.setBounds(getPaddingLeft() - AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f) + (getMeasuredWidth() - getPaddingRight()), getPaddingBottom() + getPaddingTop() + ((int) f10));
            this.f32458s.p(Math.min(AndroidUtilities.dp(18.0f), f10 / 2.0f));
        }
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        j();
    }

    public void setBlurredBackground(kg.d dVar) {
        this.f32458s = dVar;
    }

    public void setCallFragmentContextView(FragmentContextView fragmentContextView) {
        this.f32460x = fragmentContextView;
        fragmentContextView.getCapsuleBlobDrawable().setCallback(this);
    }

    @Override
    public final void setPadding(int i9, int i10, int i11, int i12) {
        super.setPadding(i9, i10, i11, i12);
        j();
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable)) {
            FragmentContextView fragmentContextView = this.f32460x;
            if (fragmentContextView == null || fragmentContextView.getCapsuleBlobDrawable() != drawable) {
                return false;
            }
            return true;
        }
        return true;
    }
}
