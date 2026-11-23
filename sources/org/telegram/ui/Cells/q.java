package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
public class q extends ImageView {
    public Drawable f31257a;
    public final Path f31258b;
    public int f31259c;
    public int d;

    public q(Context context) {
        super(context);
        this.f31258b = new Path();
        this.f31259c = org.telegram.messenger.g0.L(5.0f);
        this.d = org.telegram.messenger.g0.L(42.0f);
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f31258b);
        canvas.scale((this.d / getWidth()) + 1.0f, (this.d / getHeight()) + 1.0f, getWidth() / 2.0f, getHeight() / 2.0f);
        super.draw(canvas);
        canvas.restore();
        Drawable drawable = this.f31257a;
        if (drawable != null) {
            int i7 = this.f31259c;
            drawable.setBounds(-i7, -i7, getWidth() + this.f31259c, getHeight() + this.f31259c);
            this.f31257a.draw(canvas);
        }
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        Path path = this.f31258b;
        path.rewind();
        path.addCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f, Path.Direction.CW);
    }

    public void setBackgroundOuterPadding(int i7) {
        this.d = i7;
    }

    public void setForeground(int i7) {
        this.f31257a = getContext().getDrawable(i7);
        invalidate();
    }

    public void setOuterPadding(int i7) {
        this.f31259c = i7;
    }

    public void setPadding(int i7) {
        setPadding(i7, i7, i7, i7);
    }
}
