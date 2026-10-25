package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import org.telegram.messenger.AndroidUtilities;
public final class sz0 extends View {
    public String f32792a;
    public Drawable f32793b;
    public boolean f32794c;
    public int d;
    public final h6 e;
    public final tz0 f32795f;

    public sz0(tz0 tz0Var, Context context) {
        super(context);
        this.f32795f = tz0Var;
        this.d = 0;
        this.e = new h6(this, 350L, new OvershootInterpolator(5.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        if (isPressed()) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float d = ((1.0f - this.e.d(f7, false)) * 0.2f) + 0.8f;
        if (this.f32793b != null) {
            int height = getHeight() - getPaddingBottom();
            this.f32793b.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            canvas.scale(d, d, getWidth() / 2, (getPaddingTop() + height) / 2);
            Drawable drawable = this.f32793b;
            if (drawable instanceof t5) {
                ((t5) drawable).q(System.currentTimeMillis());
            }
            this.f32793b.draw(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f32793b;
        if (drawable instanceof t5) {
            ((t5) drawable).a(this);
        }
        this.f32794c = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f32793b;
        if (drawable instanceof t5) {
            ((t5) drawable).o(this);
        }
        this.f32794c = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int dp = AndroidUtilities.dp(3.0f);
        float f10 = 6.66f;
        if (this.d == 0) {
            f7 = 0.0f;
        } else {
            f7 = 6.66f;
        }
        int dp2 = AndroidUtilities.dp(f7 + 3.0f);
        int dp3 = AndroidUtilities.dp(3.0f);
        if (this.d != 0) {
            f10 = 0.0f;
        }
        setPadding(dp, dp2, dp3, AndroidUtilities.dp(f10 + 3.0f));
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), 1073741824));
    }

    public void setDirection(int i10) {
        this.d = i10;
        invalidate();
    }

    public void setImageDrawable(Drawable drawable) {
        Drawable drawable2 = this.f32793b;
        if (drawable2 instanceof t5) {
            ((t5) drawable2).o(this);
        }
        this.f32793b = drawable;
        if ((drawable instanceof t5) && this.f32794c) {
            ((t5) drawable).a(this);
        }
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        invalidate();
    }
}
