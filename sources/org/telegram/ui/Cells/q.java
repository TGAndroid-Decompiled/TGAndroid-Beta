package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
public class q extends ImageView {
    public Drawable f31291a;
    public final Path f31292b;
    public int f31293c;
    public int d;

    public q(Context context) {
        super(context);
        this.f31292b = new Path();
        this.f31293c = org.telegram.messenger.g0.L(5.0f);
        this.d = org.telegram.messenger.g0.L(42.0f);
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f31292b);
        canvas.scale((this.d / getWidth()) + 1.0f, (this.d / getHeight()) + 1.0f, getWidth() / 2.0f, getHeight() / 2.0f);
        super.draw(canvas);
        canvas.restore();
        Drawable drawable = this.f31291a;
        if (drawable != null) {
            int i7 = this.f31293c;
            drawable.setBounds(-i7, -i7, getWidth() + this.f31293c, getHeight() + this.f31293c);
            this.f31291a.draw(canvas);
        }
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        Path path = this.f31292b;
        path.rewind();
        path.addCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f, Path.Direction.CW);
    }

    public void setBackgroundOuterPadding(int i7) {
        this.d = i7;
    }

    public void setForeground(int i7) {
        this.f31291a = getContext().getDrawable(i7);
        invalidate();
    }

    public void setOuterPadding(int i7) {
        this.f31293c = i7;
    }

    public void setPadding(int i7) {
        setPadding(i7, i7, i7, i7);
    }
}
