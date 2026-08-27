package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;

public final class s5 extends Drawable {

    public final int f23764a = 1;

    public final int f23765b;

    public final int f23766c;
    public Object d;

    public s5(int i10, int i11, Drawable drawable) {
        this.f23765b = i10;
        this.f23766c = i11;
        this.d = drawable;
    }

    @Override
    public final void draw(Canvas canvas) {
        int iCeil;
        switch (this.f23764a) {
            case 0:
                Rect bounds = getBounds();
                canvas.drawCircle(bounds.centerX(), bounds.centerY(), this.f23766c / 2.0f, (Paint) this.d);
                break;
            case 1:
                Rect bounds2 = getBounds();
                int iDp = this.f23766c;
                int i10 = this.f23765b;
                if (i10 != 7) {
                    if (i10 == 1 || i10 == 6) {
                        if (iDp <= 0) {
                            iDp = AndroidUtilities.dp(20.0f);
                        }
                        iCeil = iDp;
                    } else if (i10 == 3) {
                        iCeil = Math.max(bounds2.width(), bounds2.height()) / 2;
                    } else {
                        iCeil = (int) Math.ceil(Math.sqrt(((bounds2.top - bounds2.centerY()) * (bounds2.top - bounds2.centerY())) + ((bounds2.left - bounds2.centerX()) * (bounds2.left - bounds2.centerX()))));
                    }
                    canvas.drawCircle(bounds2.centerX(), bounds2.centerY(), iCeil, g6.f23434z);
                } else {
                    if (((RectF) this.d) == null) {
                        this.d = new RectF();
                    }
                    ((RectF) this.d).set(bounds2);
                    float fDp = iDp <= 0 ? AndroidUtilities.dp(6.0f) : iDp;
                    canvas.drawRoundRect((RectF) this.d, fDp, fDp, g6.f23434z);
                }
                break;
            default:
                ((Drawable) this.d).draw(canvas);
                break;
        }
    }

    @Override
    public int getAlpha() {
        switch (this.f23764a) {
            case 2:
                return ((Drawable) this.d).getAlpha();
            default:
                return super.getAlpha();
        }
    }

    @Override
    public int getIntrinsicHeight() {
        switch (this.f23764a) {
            case 0:
                return this.f23766c + this.f23765b;
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        switch (this.f23764a) {
            case 0:
                return this.f23766c + this.f23765b;
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f23764a) {
            case 0:
                return -2;
            case 1:
                return 0;
            default:
                return ((Drawable) this.d).getOpacity();
        }
    }

    @Override
    public void onBoundsChange(Rect rect) {
        switch (this.f23764a) {
            case 2:
                super.onBoundsChange(rect);
                int iWidth = rect.width();
                int i10 = this.f23765b;
                int i11 = (iWidth - i10) / 2;
                int iHeight = rect.height();
                int i12 = this.f23766c;
                int i13 = (iHeight - i12) / 2;
                ((Drawable) this.d).setBounds(i11, i13, i10 + i11, i12 + i13);
                break;
            default:
                super.onBoundsChange(rect);
                break;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f23764a) {
            case 0:
                ((Paint) this.d).setAlpha(i10);
                break;
            case 1:
                break;
            default:
                ((Drawable) this.d).setAlpha(i10);
                break;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.f23764a) {
            case 0:
                ((Paint) this.d).setColorFilter(colorFilter);
                break;
        }
    }

    public s5(int i10, int i11, int i12) {
        this.f23765b = i10;
        this.f23766c = i12;
        Paint paint = new Paint(1);
        this.d = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(i10);
        paint.setColor(i11);
    }

    public s5(int i10, int i11) {
        this.f23765b = i10;
        this.f23766c = i11;
    }

    private final void a(int i10) {
    }

    private final void b(ColorFilter colorFilter) {
    }

    private final void c(ColorFilter colorFilter) {
    }
}
