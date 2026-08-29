package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public class q extends ImageView {
    public Drawable f25023a;
    public final Path f25024b;
    public int f25025c;
    public int d;

    public q(Context context) {
        super(context);
        this.f25024b = new Path();
        this.f25025c = AndroidUtilities.dp(5.0f);
        this.d = AndroidUtilities.dp(42.0f);
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f25024b);
        canvas.scale((this.d / getWidth()) + 1.0f, (this.d / getHeight()) + 1.0f, getWidth() / 2.0f, getHeight() / 2.0f);
        super.draw(canvas);
        canvas.restore();
        Drawable drawable = this.f25023a;
        if (drawable != null) {
            int i10 = this.f25025c;
            drawable.setBounds(-i10, -i10, getWidth() + this.f25025c, getHeight() + this.f25025c);
            this.f25023a.draw(canvas);
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        Path path = this.f25024b;
        path.rewind();
        path.addCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f, Path.Direction.CW);
    }

    public void setBackgroundOuterPadding(int i10) {
        this.d = i10;
    }

    public void setForeground(int i10) {
        this.f25023a = getContext().getDrawable(i10);
        invalidate();
    }

    public void setOuterPadding(int i10) {
        this.f25025c = i10;
    }

    public void setPadding(int i10) {
        setPadding(i10, i10, i10, i10);
    }
}
