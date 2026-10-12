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
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.vm;
public final class p5 extends org.telegram.ui.Components.z9 {
    public final Paint G;
    public long H;
    public Drawable I;
    public Drawable J;
    public final t5 K;

    public p5(t5 t5Var, Context context) {
        super(context);
        this.K = t5Var;
        this.G = new Paint(1);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ImageReceiver imageReceiver;
        Bitmap bitmap;
        MediaController.PhotoEntry photoEntry;
        Drawable drawable;
        float floatValue;
        org.telegram.ui.Components.s5 s5Var = this.e;
        if (s5Var != null) {
            imageReceiver = s5Var.f29031k;
        } else {
            imageReceiver = this.f31813a;
        }
        if (imageReceiver != null) {
            if (this.f31815c != -1 && this.d != -1) {
                int height = getHeight();
                int i10 = this.d;
                imageReceiver.setImageCoords((getWidth() - this.f31815c) / 2, (height - i10) / 2, this.f31815c, i10);
                int height2 = getHeight();
                int i11 = this.d;
                this.f31814b.setImageCoords((getWidth() - this.f31815c) / 2, (height2 - i11) / 2, this.f31815c, i11);
            } else {
                imageReceiver.setImageCoords(0.0f, 0.0f, getWidth(), getHeight());
                this.f31814b.setImageCoords(0.0f, 0.0f, getWidth(), getHeight());
            }
            imageReceiver.draw(canvas);
            t5 t5Var = this.K;
            if (t5Var.N) {
                Rect rect = t5.f22084a0;
                MediaController.PhotoEntry photoEntry2 = t5Var.G;
                if (photoEntry2 == null || !photoEntry2.isAttachSpoilerRevealed) {
                    this.f31814b.draw(canvas);
                    if (t5Var.M == null) {
                        if (t5Var.L == null) {
                            wh.g gVar = new wh.g();
                            t5Var.L = gVar;
                            gVar.h(i0.a.k(-1, (int) (Color.alpha(-1) * 0.325f)));
                        }
                        t5Var.L.setBounds(0, 0, getWidth(), getHeight());
                        t5Var.L.draw(canvas);
                    }
                    invalidate();
                }
            }
            float f7 = t5Var.T;
            int i12 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
            if (i12 != 0 && t5Var.R != null) {
                Paint paint = this.G;
                paint.setAlpha((int) (es.f24771f.getInterpolation(1.0f - f7) * 255.0f));
                canvas.drawBitmap(t5Var.R, 0.0f, 0.0f, paint);
                long min = Math.min(16L, System.currentTimeMillis() - this.H);
                Float f10 = t5Var.S;
                if (f10 == null) {
                    floatValue = 250.0f;
                } else {
                    floatValue = f10.floatValue();
                }
                t5Var.T = Math.min(1.0f, (((float) min) / floatValue) + t5Var.T);
                this.H = System.currentTimeMillis();
                invalidate();
                if (t5Var.M != null) {
                    t5Var.f22086b.invalidate();
                }
            } else if (i12 == 0 && (bitmap = t5Var.R) != null) {
                bitmap.recycle();
                t5Var.R = null;
                t5Var.S = null;
                invalidate();
            }
            if (t5Var.f22091s) {
                r5 r5Var = t5Var.U;
                if ((r5Var == null || !((vm) ((org.telegram.ui.Components.s) r5Var).f28975b).f30088s) && (photoEntry = t5Var.G) != null && photoEntry.isLivePhoto()) {
                    if (t5Var.G.isUnalivePhoto()) {
                        if (this.J == null) {
                            this.J = getContext().getResources().getDrawable(R.drawable.media_live_off).mutate();
                        }
                        drawable = this.J;
                    } else {
                        if (this.I == null) {
                            this.I = getContext().getResources().getDrawable(R.drawable.media_live_on).mutate();
                        }
                        drawable = this.I;
                    }
                    drawable.setBounds((int) (imageReceiver.getImageX() + AndroidUtilities.dp(8.0f)), (int) (imageReceiver.getImageY() + AndroidUtilities.dp(8.0f)), (int) (imageReceiver.getImageX() + AndroidUtilities.dp(30.0f)), (int) (imageReceiver.getImageY() + AndroidUtilities.dp(26.0f)));
                    drawable.draw(canvas);
                }
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        super.onMeasure(i10, i11);
        t5 t5Var = this.K;
        MediaController.PhotoEntry photoEntry = t5Var.G;
        if (photoEntry != null && photoEntry.hasSpoiler) {
            z10 = true;
        } else {
            z10 = false;
        }
        t5Var.h(z10);
    }
}
