package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.yl;
public final class p5 extends org.telegram.ui.Components.o9 {
    public final Paint C;
    public long D;
    public Drawable E;
    public Drawable F;
    public final t5 G;

    public p5(t5 t5Var, Context context) {
        super(context);
        this.G = t5Var;
        this.C = new Paint(1);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ImageReceiver imageReceiver;
        Bitmap bitmap;
        MediaController.PhotoEntry photoEntry;
        Drawable drawable;
        float floatValue;
        org.telegram.ui.Components.k5 k5Var = this.f31331e;
        if (k5Var != null) {
            imageReceiver = k5Var.f29951k;
        } else {
            imageReceiver = this.f31328a;
        }
        if (imageReceiver != null) {
            if (this.f31330c != -1 && this.d != -1) {
                int height = getHeight();
                int i9 = this.d;
                imageReceiver.setImageCoords((getWidth() - this.f31330c) / 2, (height - i9) / 2, this.f31330c, i9);
                int height2 = getHeight();
                int i10 = this.d;
                this.f31329b.setImageCoords((getWidth() - this.f31330c) / 2, (height2 - i10) / 2, this.f31330c, i10);
            } else {
                imageReceiver.setImageCoords(0.0f, 0.0f, getWidth(), getHeight());
                this.f31329b.setImageCoords(0.0f, 0.0f, getWidth(), getHeight());
            }
            imageReceiver.draw(canvas);
            t5 t5Var = this.G;
            if (t5Var.J) {
                Rect rect = t5.T;
                MediaController.PhotoEntry photoEntry2 = t5Var.C;
                if (photoEntry2 == null || !photoEntry2.isAttachSpoilerRevealed) {
                    this.f31329b.draw(canvas);
                    if (t5Var.I == null) {
                        if (t5Var.H == null) {
                            dh.l lVar = new dh.l();
                            t5Var.H = lVar;
                            lVar.h(i0.a.k(-1, (int) (Color.alpha(-1) * 0.325f)));
                        }
                        t5Var.H.setBounds(0, 0, getWidth(), getHeight());
                        t5Var.H.draw(canvas);
                    }
                    invalidate();
                }
            }
            float f10 = t5Var.P;
            int i11 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
            if (i11 != 0 && t5Var.N != null) {
                Paint paint = this.C;
                paint.setAlpha((int) (gr.f28844f.getInterpolation(1.0f - f10) * 255.0f));
                canvas.drawBitmap(t5Var.N, 0.0f, 0.0f, paint);
                long min = Math.min(16L, System.currentTimeMillis() - this.D);
                Float f11 = t5Var.O;
                if (f11 == null) {
                    floatValue = 250.0f;
                } else {
                    floatValue = f11.floatValue();
                }
                t5Var.P = Math.min(1.0f, (((float) min) / floatValue) + t5Var.P);
                this.D = System.currentTimeMillis();
                invalidate();
                if (t5Var.I != null) {
                    t5Var.f25684b.invalidate();
                }
            } else if (i11 == 0 && (bitmap = t5Var.N) != null) {
                bitmap.recycle();
                t5Var.N = null;
                t5Var.O = null;
                invalidate();
            }
            if (t5Var.f25690s) {
                r5 r5Var = t5Var.Q;
                if ((r5Var == null || !((yl) ((org.telegram.ui.Components.s) r5Var).f32325b).f35003s) && (photoEntry = t5Var.C) != null && photoEntry.isLivePhoto()) {
                    if (t5Var.C.isUnalivePhoto()) {
                        if (this.F == null) {
                            this.F = getContext().getResources().getDrawable(R.drawable.media_live_off).mutate();
                        }
                        drawable = this.F;
                    } else {
                        if (this.E == null) {
                            this.E = getContext().getResources().getDrawable(R.drawable.media_live_on).mutate();
                        }
                        drawable = this.E;
                    }
                    drawable.setBounds((int) (imageReceiver.getImageX() + AndroidUtilities.dp(8.0f)), (int) (imageReceiver.getImageY() + AndroidUtilities.dp(8.0f)), (int) (imageReceiver.getImageX() + AndroidUtilities.dp(30.0f)), (int) (imageReceiver.getImageY() + AndroidUtilities.dp(26.0f)));
                    drawable.draw(canvas);
                }
            }
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        boolean z10;
        super.onMeasure(i9, i10);
        t5 t5Var = this.G;
        MediaController.PhotoEntry photoEntry = t5Var.C;
        if (photoEntry != null && photoEntry.hasSpoiler) {
            z10 = true;
        } else {
            z10 = false;
        }
        t5Var.h(z10);
    }
}
