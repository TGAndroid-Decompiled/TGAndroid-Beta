package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import org.telegram.messenger.AndroidUtilities;
public final class py0 extends View {
    public String f28013a;
    public Drawable f28014b;
    public boolean f28015c;
    public int d;
    public final z5 e;
    public final qy0 f28016f;

    public py0(qy0 qy0Var, Context context) {
        super(context);
        this.f28016f = qy0Var;
        this.d = 0;
        this.e = new z5(this, 350L, new OvershootInterpolator(5.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        if (isPressed()) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float d = ((1.0f - this.e.d(f10, false)) * 0.2f) + 0.8f;
        if (this.f28014b != null) {
            int height = getHeight() - getPaddingBottom();
            this.f28014b.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            canvas.scale(d, d, getWidth() / 2, (getPaddingTop() + height) / 2);
            Drawable drawable = this.f28014b;
            if (drawable instanceof l5) {
                ((l5) drawable).q(System.currentTimeMillis());
            }
            this.f28014b.draw(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f28014b;
        if (drawable instanceof l5) {
            ((l5) drawable).a(this);
        }
        this.f28015c = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f28014b;
        if (drawable instanceof l5) {
            ((l5) drawable).o(this);
        }
        this.f28015c = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f10;
        int dp = AndroidUtilities.dp(3.0f);
        float f11 = 6.66f;
        if (this.d == 0) {
            f10 = 0.0f;
        } else {
            f10 = 6.66f;
        }
        int dp2 = AndroidUtilities.dp(f10 + 3.0f);
        int dp3 = AndroidUtilities.dp(3.0f);
        if (this.d != 0) {
            f11 = 0.0f;
        }
        setPadding(dp, dp2, dp3, AndroidUtilities.dp(f11 + 3.0f));
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), 1073741824));
    }

    public void setDirection(int i10) {
        this.d = i10;
        invalidate();
    }

    public void setImageDrawable(Drawable drawable) {
        Drawable drawable2 = this.f28014b;
        if (drawable2 instanceof l5) {
            ((l5) drawable2).o(this);
        }
        this.f28014b = drawable;
        if ((drawable instanceof l5) && this.f28015c) {
            ((l5) drawable).a(this);
        }
    }

    @Override
    public void setPressed(boolean z4) {
        super.setPressed(z4);
        invalidate();
    }
}
