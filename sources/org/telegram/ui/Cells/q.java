package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public class q extends ImageView {
    public Drawable f24886a;
    public final Path f24887b;
    public int f24888c;
    public int d;

    public q(Context context) {
        super(context);
        this.f24887b = new Path();
        this.f24888c = AndroidUtilities.dp(5.0f);
        this.d = AndroidUtilities.dp(42.0f);
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f24887b);
        canvas.scale((this.d / getWidth()) + 1.0f, (this.d / getHeight()) + 1.0f, getWidth() / 2.0f, getHeight() / 2.0f);
        super.draw(canvas);
        canvas.restore();
        Drawable drawable = this.f24886a;
        if (drawable != null) {
            int i9 = this.f24888c;
            drawable.setBounds(-i9, -i9, getWidth() + this.f24888c, getHeight() + this.f24888c);
            this.f24886a.draw(canvas);
        }
    }

    @Override
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        Path path = this.f24887b;
        path.rewind();
        path.addCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f, Path.Direction.CW);
    }

    public void setBackgroundOuterPadding(int i9) {
        this.d = i9;
    }

    public void setForeground(int i9) {
        this.f24886a = getContext().getDrawable(i9);
        invalidate();
    }

    public void setOuterPadding(int i9) {
        this.f24888c = i9;
    }

    public void setPadding(int i9) {
        setPadding(i9, i9, i9, i9);
    }
}
