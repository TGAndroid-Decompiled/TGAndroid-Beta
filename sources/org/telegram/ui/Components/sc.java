package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class sc extends Drawable {
    public final int f39549a;
    public final Object f39550b;
    public final Object f39551c;

    public sc(int i7, Object obj, Object obj2) {
        this.f39549a = i7;
        this.f39550b = obj;
        this.f39551c = obj2;
    }

    @Override
    public final void draw(Canvas canvas) {
        float offsetY;
        switch (this.f39549a) {
            case 0:
                tc tcVar = (tc) this.f39551c;
                if (tcVar.f39852c > 1) {
                    tcVar.c(canvas, tcVar.f39862o);
                    return;
                } else {
                    tcVar.c(canvas, (Paint) this.f39550b);
                    return;
                }
            case 1:
                Paint paint = (Paint) this.f39550b;
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f39551c;
                if (chatActivityEnterView.V0 != null) {
                    paint.setAlpha(Math.round(chatActivityEnterView.f32718s4 * 102.0f));
                    float width = chatActivityEnterView.getWidth();
                    float y10 = (chatActivityEnterView.V0.getY() - chatActivityEnterView.getHeight()) + org.telegram.ui.ActionBar.m6.f29470i3.getIntrinsicHeight();
                    gf gfVar = chatActivityEnterView.F0;
                    if (gfVar == null) {
                        offsetY = 0.0f;
                    } else {
                        offsetY = gfVar.getOffsetY();
                    }
                    canvas.drawRect(0.0f, 0.0f, width, y10 + offsetY, paint);
                    return;
                }
                return;
            case 2:
                Paint paint2 = (Paint) this.f39551c;
                canvas.drawRect(getBounds(), (Paint) this.f39550b);
                int L = org.telegram.messenger.g0.L(9.0f);
                int width2 = getBounds().width() / L;
                int height = getBounds().height() / L;
                int i7 = getBounds().left;
                int i10 = getBounds().top;
                int i11 = 0;
                int i12 = 0;
                while (i12 < width2) {
                    i12++;
                    float f10 = (L * i12) + i7;
                    canvas.drawLine(f10, i10, f10, getBounds().height() + i10, paint2);
                }
                while (i11 < height) {
                    i11++;
                    float f11 = (L * i11) + i10;
                    canvas.drawLine(i7, f11, getBounds().width() + i7, f11, paint2);
                }
                return;
            case 3:
                ((xy0) this.f39550b).c(getBounds().centerX() - (((xy0) this.f39550b).f42247c / 2.0f), getBounds().centerY(), 1.0f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G6, (org.telegram.ui.ActionBar.h6) this.f39551c), canvas);
                return;
            default:
                ImageReceiver imageReceiver = (ImageReceiver) this.f39550b;
                imageReceiver.h(canvas, null);
                Drawable drawable = (Drawable) this.f39551c;
                int intrinsicWidth = (int) (drawable.getIntrinsicWidth() * 0.8f);
                int intrinsicHeight = (int) (drawable.getIntrinsicHeight() * 0.8f);
                int A = (int) com.google.android.gms.internal.vision.e2.A(imageReceiver.N0, intrinsicWidth, 2.0f, imageReceiver.L0);
                int interpolation = (int) ((((imageReceiver.O0 / 2.0f) - intrinsicHeight) + imageReceiver.M0) - ((1.0f - nr.f37965k.getInterpolation(imageReceiver.f22672i1)) * org.telegram.messenger.g0.L(16.0f)));
                drawable.setAlpha((int) (imageReceiver.getAlpha() * Math.min(1.0f, imageReceiver.f22672i1 * 5.0f) * 255.0f));
                drawable.setBounds(A, interpolation, intrinsicWidth + A, intrinsicHeight + interpolation);
                drawable.draw(canvas);
                return;
        }
    }

    @Override
    public int getAlpha() {
        switch (this.f39549a) {
            case 4:
                return (int) (((ImageReceiver) this.f39550b).getAlpha() * 255.0f);
            default:
                return super.getAlpha();
        }
    }

    @Override
    public int getIntrinsicHeight() {
        switch (this.f39549a) {
            case 2:
                return 0;
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        switch (this.f39549a) {
            case 2:
                return 0;
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f39549a) {
            case 0:
                return -2;
            case 1:
                return -2;
            case 2:
                return 0;
            case 3:
                return -2;
            default:
                return 0;
        }
    }

    @Override
    public void onBoundsChange(Rect rect) {
        switch (this.f39549a) {
            case 4:
                ((ImageReceiver) this.f39550b).y0(org.telegram.messenger.g0.L(2.0f) + rect.left, org.telegram.messenger.g0.L(2.0f) + rect.top, org.telegram.messenger.o10.x(2.0f, rect.left, rect.right - org.telegram.messenger.g0.L(2.0f)), org.telegram.messenger.o10.x(2.0f, rect.top, rect.bottom - org.telegram.messenger.g0.L(2.0f)));
                return;
            default:
                super.onBoundsChange(rect);
                return;
        }
    }

    @Override
    public final void setAlpha(int i7) {
        switch (this.f39549a) {
            case 0:
            case 1:
            case 2:
            case 3:
                return;
            default:
                ((ImageReceiver) this.f39550b).setAlpha(i7 / 255.0f);
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i7 = this.f39549a;
    }

    public sc(boolean z10) {
        this.f39549a = 2;
        Paint paint = new Paint();
        this.f39550b = paint;
        Paint paint2 = new Paint();
        this.f39551c = paint2;
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        if (z10) {
            paint.setColor(-14865331);
            paint2.setColor(-15854042);
            return;
        }
        paint.setColor(-2172970);
        paint2.setColor(-3752002);
    }

    public sc(tc tcVar, Paint paint) {
        this.f39549a = 0;
        this.f39551c = tcVar;
        this.f39550b = paint;
    }

    public sc(ChatActivityEnterView chatActivityEnterView) {
        this.f39549a = 1;
        this.f39551c = chatActivityEnterView;
        Paint paint = new Paint();
        this.f39550b = paint;
        paint.setColor(0);
    }

    private final void a(int i7) {
    }

    private final void b(int i7) {
    }

    private final void c(int i7) {
    }

    private final void d(int i7) {
    }

    private final void e(ColorFilter colorFilter) {
    }

    private final void f(ColorFilter colorFilter) {
    }

    private final void g(ColorFilter colorFilter) {
    }

    private final void h(ColorFilter colorFilter) {
    }

    private final void i(ColorFilter colorFilter) {
    }
}
