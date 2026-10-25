package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public class q extends ImageView {
    public Drawable f24783a;
    public final Path f24784b;
    public int f24785c;
    public int d;

    public q(Context context) {
        super(context);
        this.f24784b = new Path();
        this.f24785c = AndroidUtilities.dp(5.0f);
        this.d = AndroidUtilities.dp(42.0f);
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f24784b);
        canvas.scale((this.d / getWidth()) + 1.0f, (this.d / getHeight()) + 1.0f, getWidth() / 2.0f, getHeight() / 2.0f);
        super.draw(canvas);
        canvas.restore();
        Drawable drawable = this.f24783a;
        if (drawable != null) {
            int i10 = this.f24785c;
            drawable.setBounds(-i10, -i10, getWidth() + this.f24785c, getHeight() + this.f24785c);
            this.f24783a.draw(canvas);
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        Path path = this.f24784b;
        path.rewind();
        path.addCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f, Path.Direction.CW);
    }

    public void setBackgroundOuterPadding(int i10) {
        this.d = i10;
    }

    public void setForeground(int i10) {
        this.f24783a = getContext().getDrawable(i10);
        invalidate();
    }

    public void setOuterPadding(int i10) {
        this.f24785c = i10;
    }

    public void setPadding(int i10) {
        setPadding(i10, i10, i10, i10);
    }
}
