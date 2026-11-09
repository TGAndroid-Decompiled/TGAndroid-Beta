package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
public class q extends ImageView {
    public Drawable f29767a;
    public final Path f29768b;
    public int f29769c;
    public int d;

    public q(Context context) {
        super(context);
        this.f29768b = new Path();
        this.f29769c = org.telegram.messenger.g0.L(5.0f);
        this.d = org.telegram.messenger.g0.L(42.0f);
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f29768b);
        canvas.scale((this.d / getWidth()) + 1.0f, (this.d / getHeight()) + 1.0f, getWidth() / 2.0f, getHeight() / 2.0f);
        super.draw(canvas);
        canvas.restore();
        Drawable drawable = this.f29767a;
        if (drawable != null) {
            int i7 = this.f29769c;
            drawable.setBounds(-i7, -i7, getWidth() + this.f29769c, getHeight() + this.f29769c);
            this.f29767a.draw(canvas);
        }
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        Path path = this.f29768b;
        path.rewind();
        path.addCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f, Path.Direction.CW);
    }

    public void setBackgroundOuterPadding(int i7) {
        this.d = i7;
    }

    public void setForeground(int i7) {
        this.f29767a = getContext().getDrawable(i7);
        invalidate();
    }

    public void setOuterPadding(int i7) {
        this.f29769c = i7;
    }

    public void setPadding(int i7) {
        setPadding(i7, i7, i7, i7);
    }
}
