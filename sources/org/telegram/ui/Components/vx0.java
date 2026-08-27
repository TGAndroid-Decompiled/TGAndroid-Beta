package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import org.telegram.messenger.AndroidUtilities;

public final class vx0 extends View {

    public String f34063a;

    public Drawable f34064b;

    public boolean f34065c;
    public int d;

    public final y5 f34066e;

    public final wx0 f34067f;

    public vx0(wx0 wx0Var, Context context) {
        super(context);
        this.f34067f = wx0Var;
        this.d = 0;
        this.f34066e = new y5(this, 350L, new OvershootInterpolator(5.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float fD = ((1.0f - this.f34066e.d(isPressed() ? 1.0f : 0.0f, false)) * 0.2f) + 0.8f;
        if (this.f34064b != null) {
            int width = getWidth() / 2;
            int paddingTop = (getPaddingTop() + (getHeight() - getPaddingBottom())) / 2;
            this.f34064b.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            canvas.scale(fD, fD, width, paddingTop);
            Drawable drawable = this.f34064b;
            if (drawable instanceof k5) {
                ((k5) drawable).q(System.currentTimeMillis());
            }
            this.f34064b.draw(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f34064b;
        if (drawable instanceof k5) {
            ((k5) drawable).a(this);
        }
        this.f34065c = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f34064b;
        if (drawable instanceof k5) {
            ((k5) drawable).o(this);
        }
        this.f34065c = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp((this.d == 0 ? 0.0f : 6.66f) + 3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp((this.d != 0 ? 0.0f : 6.66f) + 3.0f));
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), 1073741824));
    }

    public void setDirection(int i10) {
        this.d = i10;
        invalidate();
    }

    public void setImageDrawable(Drawable drawable) {
        Drawable drawable2 = this.f34064b;
        if (drawable2 instanceof k5) {
            ((k5) drawable2).o(this);
        }
        this.f34064b = drawable;
        if ((drawable instanceof k5) && this.f34065c) {
            ((k5) drawable).a(this);
        }
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        invalidate();
    }
}
