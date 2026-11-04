package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
public class q extends ImageView {
    public Drawable f29835a;
    public final Path f29836b;
    public int f29837c;
    public int d;

    public q(Context context) {
        super(context);
        this.f29836b = new Path();
        this.f29837c = org.telegram.messenger.g0.L(5.0f);
        this.d = org.telegram.messenger.g0.L(42.0f);
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f29836b);
        canvas.scale((this.d / getWidth()) + 1.0f, (this.d / getHeight()) + 1.0f, getWidth() / 2.0f, getHeight() / 2.0f);
        super.draw(canvas);
        canvas.restore();
        Drawable drawable = this.f29835a;
        if (drawable != null) {
            int i3 = this.f29837c;
            drawable.setBounds(-i3, -i3, getWidth() + this.f29837c, getHeight() + this.f29837c);
            this.f29835a.draw(canvas);
        }
    }

    @Override
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        super.onSizeChanged(i3, i10, i11, i12);
        Path path = this.f29836b;
        path.rewind();
        path.addCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f, Path.Direction.CW);
    }

    public void setBackgroundOuterPadding(int i3) {
        this.d = i3;
    }

    public void setForeground(int i3) {
        this.f29835a = getContext().getDrawable(i3);
        invalidate();
    }

    public void setOuterPadding(int i3) {
        this.f29837c = i3;
    }

    public void setPadding(int i3) {
        setPadding(i3, i3, i3, i3);
    }
}
