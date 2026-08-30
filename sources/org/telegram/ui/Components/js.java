package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class js extends b6 {
    public boolean B;
    public boolean C;
    public pg.b f26030s;
    public final Path v;
    public final RectF f26031w;
    public int f26032x;
    public FragmentContextView f26033y;

    public js(Context context) {
        super(context);
        this.v = new Path();
        this.f26031w = new RectF();
        this.f26032x = 24;
        setOrientation(1);
        pg.b bVar = this.f26030s;
        if (bVar != null) {
            bVar.u();
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z4;
        int currentStyle;
        FragmentContextView fragmentContextView;
        Canvas canvas2 = canvas;
        if (getMetadata().f46905c.f46913a != 0.0f) {
            pg.b bVar = this.f26030s;
            if (bVar != null) {
                bVar.draw(canvas2);
            }
            FragmentContextView fragmentContextView2 = this.f26033y;
            xd.h hVar = this.f23573c;
            View view = null;
            if (fragmentContextView2 != null && ((currentStyle = fragmentContextView2.getCurrentStyle()) == 3 || currentStyle == 1)) {
                int entriesCount = getEntriesCount();
                for (int i10 = 0; i10 < entriesCount; i10++) {
                    xd.e n10 = hVar.n(i10);
                    float paddingTop = getPaddingTop() + n10.b().top;
                    View view2 = ((a6) n10.f46899a).f23299a;
                    float c3 = n10.c();
                    if (c3 > 0.0f && (fragmentContextView = this.f26033y) != null && (fragmentContextView == view2 || fragmentContextView.getParent() == view2)) {
                        zc capsuleBlobDrawable = this.f26033y.getCapsuleBlobDrawable();
                        int dp = AndroidUtilities.dp(1.0f) + ((int) capsuleBlobDrawable.c());
                        int i11 = -dp;
                        capsuleBlobDrawable.setBounds(getPaddingLeft() - dp, i11, (getMeasuredWidth() - getPaddingRight()) + dp, (dp * 2) + AndroidUtilities.dp(36.0f) + i11);
                        capsuleBlobDrawable.setAlpha((int) (c3 * 255.0f));
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
                xd.e n11 = hVar.n(i12);
                float paddingTop2 = getPaddingTop() + n11.b().top;
                View view4 = ((a6) n11.f46899a).f23299a;
                float min = Math.min(1.0f, n11.f46901c.f46913a) * n11.c();
                if (min > 0.0f && view3 != view4) {
                    int alpha = org.telegram.ui.ActionBar.j6.f20025k0.getAlpha();
                    org.telegram.ui.ActionBar.j6.f20025k0.setAlpha((int) (alpha * min));
                    float f10 = 1.0f - min;
                    canvas2.drawLine(getPaddingLeft() + (AndroidUtilities.dp(16.0f) * f10), paddingTop2, getWidth() - ((AndroidUtilities.dp(16.0f) * f10) + getPaddingRight()), paddingTop2, org.telegram.ui.ActionBar.j6.f20025k0);
                    org.telegram.ui.ActionBar.j6.f20025k0.setAlpha(alpha);
                }
                i12++;
                canvas2 = canvas;
            }
            if (view3 != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.B = z4;
            this.C = false;
            super.dispatchDraw(canvas);
            canvas.restore();
            if (view3 != null) {
                this.C = true;
                this.B = false;
                super.dispatchDraw(canvas);
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        pg.b bVar;
        if (!super.dispatchTouchEvent(motionEvent)) {
            if (motionEvent.getAction() != 0 || (bVar = this.f26030s) == null || !bVar.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z4;
        FragmentContextView fragmentContextView = this.f26033y;
        if (fragmentContextView != null && (fragmentContextView == view || fragmentContextView.getParent() == view)) {
            z4 = true;
        } else {
            z4 = false;
        }
        if ((z4 && this.B) || (!z4 && this.C)) {
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
        float f10 = getMetadata().f46907g.f46913a;
        float f11 = getMetadata().f46905c.f46913a;
        RectF rectF = this.f26031w;
        rectF.set(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getPaddingTop() + f10);
        float min = Math.min(AndroidUtilities.dp(this.f26032x), Math.min(rectF.width(), rectF.height()) / 2.0f);
        Path path = this.v;
        path.rewind();
        path.addRoundRect(rectF, min, min, Path.Direction.CW);
        pg.b bVar = this.f26030s;
        if (bVar != null) {
            bVar.setAlpha((int) (f11 * 255.0f));
            this.f26030s.setBounds(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(14.0f), getMeasuredWidth() - AndroidUtilities.dp(4.0f), ((getPaddingBottom() + getPaddingTop()) + ((int) f10)) - AndroidUtilities.dp(14.0f));
            this.f26030s.p(Math.min(AndroidUtilities.dp(this.f26032x), f10 / 2.0f));
        }
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        j();
    }

    public void setBlurredBackground(pg.b bVar) {
        this.f26030s = bVar;
    }

    public void setCallFragmentContextView(FragmentContextView fragmentContextView) {
        this.f26033y = fragmentContextView;
        fragmentContextView.getCapsuleBlobDrawable().setCallback(this);
    }

    public void setDefaultRadiusDp(int i10) {
        this.f26032x = i10;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable)) {
            FragmentContextView fragmentContextView = this.f26033y;
            if (fragmentContextView == null || fragmentContextView.getCapsuleBlobDrawable() != drawable) {
                return false;
            }
            return true;
        }
        return true;
    }
}
