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
public final class vg extends f6 {
    public ng.d f33554s;
    public final Path v;
    public final RectF f33555w;
    public FragmentContextView f33556x;

    public vg(Context context) {
        super(context);
        this.v = new Path();
        this.f33555w = new RectF();
        setOrientation(1);
        ng.d dVar = this.f33554s;
        if (dVar != null) {
            dVar.u();
        }
        Color.alpha(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        FragmentContextView fragmentContextView;
        int currentStyle;
        FragmentContextView fragmentContextView2;
        Canvas canvas2 = canvas;
        if (getMetadata().f49521c.f49531a == 0.0f) {
            return;
        }
        ng.d dVar = this.f33554s;
        if (dVar != null) {
            dVar.draw(canvas2);
        }
        FragmentContextView fragmentContextView3 = this.f33556x;
        vd.i iVar = this.f28322c;
        if (fragmentContextView3 != null && ((currentStyle = fragmentContextView3.getCurrentStyle()) == 3 || currentStyle == 1)) {
            int entriesCount = getEntriesCount();
            boolean z11 = false;
            for (int i10 = 0; i10 < entriesCount; i10++) {
                vd.f n10 = iVar.n(i10);
                float paddingTop = getPaddingTop() + n10.b().top;
                View view = ((e6) n10.f49514a).f27932a;
                float c3 = n10.c();
                if (c3 > 0.0f && ((fragmentContextView2 = this.f33556x) == view || fragmentContextView2.getParent() == view)) {
                    cd capsuleBlobDrawable = this.f33556x.getCapsuleBlobDrawable();
                    int dp = AndroidUtilities.dp(1.0f) + ((int) capsuleBlobDrawable.c());
                    int i11 = -dp;
                    capsuleBlobDrawable.setBounds(getPaddingLeft() - dp, i11, (getMeasuredWidth() - getPaddingRight()) + dp, (dp * 2) + AndroidUtilities.dp(36.0f) + i11);
                    capsuleBlobDrawable.setAlpha((int) (c3 * 255.0f));
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
        int i12 = 0;
        while (i12 < entriesCount2) {
            vd.f n11 = iVar.n(i12);
            float paddingTop2 = getPaddingTop() + n11.b().top;
            View view2 = ((e6) n11.f49514a).f27932a;
            float min = Math.min(1.0f, n11.f49516c.f49531a) * n11.c();
            if (min > 0.0f && (!z10 || (fragmentContextView = this.f33556x) == null || (fragmentContextView != view2 && fragmentContextView.getParent() != view2))) {
                int alpha = org.telegram.ui.ActionBar.g6.f23183k0.getAlpha();
                org.telegram.ui.ActionBar.g6.f23183k0.setAlpha((int) (alpha * min));
                float f9 = 1.0f - min;
                canvas2.drawLine(getPaddingLeft() + (AndroidUtilities.dp(16.0f) * f9), paddingTop2, getWidth() - ((AndroidUtilities.dp(16.0f) * f9) + getPaddingRight()), paddingTop2, org.telegram.ui.ActionBar.g6.f23183k0);
                org.telegram.ui.ActionBar.g6.f23183k0.setAlpha(alpha);
            }
            i12++;
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ng.d dVar;
        if (!super.dispatchTouchEvent(motionEvent)) {
            if (motionEvent.getAction() != 0 || (dVar = this.f33554s) == null || !dVar.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
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
        float f9 = getMetadata().f49524g.f49531a;
        float f10 = getMetadata().f49521c.f49531a;
        RectF rectF = this.f33555w;
        rectF.set(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getPaddingTop() + f9);
        float min = Math.min(AndroidUtilities.dp(18.0f), Math.min(rectF.width(), rectF.height()) / 2.0f);
        Path path = this.v;
        path.rewind();
        path.addRoundRect(rectF, min, min, Path.Direction.CW);
        ng.d dVar = this.f33554s;
        if (dVar != null) {
            dVar.setAlpha((int) (f10 * 255.0f));
            this.f33554s.setBounds(getPaddingLeft() - AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f) + (getMeasuredWidth() - getPaddingRight()), getPaddingBottom() + getPaddingTop() + ((int) f9));
            this.f33554s.p(Math.min(AndroidUtilities.dp(18.0f), f9 / 2.0f));
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        j();
    }

    public void setBlurredBackground(ng.d dVar) {
        this.f33554s = dVar;
    }

    public void setCallFragmentContextView(FragmentContextView fragmentContextView) {
        this.f33556x = fragmentContextView;
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
            FragmentContextView fragmentContextView = this.f33556x;
            if (fragmentContextView == null || fragmentContextView.getCapsuleBlobDrawable() != drawable) {
                return false;
            }
            return true;
        }
        return true;
    }
}
