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
import org.telegram.ui.Components.nm;
import org.telegram.ui.Components.wr;
public final class p5 extends org.telegram.ui.Components.w9 {
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
        org.telegram.ui.Components.p5 p5Var = this.e;
        if (p5Var != null) {
            imageReceiver = p5Var.f26033k;
        } else {
            imageReceiver = this.f28728a;
        }
        if (imageReceiver != null) {
            if (this.f28730c != -1 && this.d != -1) {
                int height = getHeight();
                int i10 = this.d;
                imageReceiver.setImageCoords((getWidth() - this.f28730c) / 2, (height - i10) / 2, this.f28730c, i10);
                int height2 = getHeight();
                int i11 = this.d;
                this.f28729b.setImageCoords((getWidth() - this.f28730c) / 2, (height2 - i11) / 2, this.f28730c, i11);
            } else {
                imageReceiver.setImageCoords(0.0f, 0.0f, getWidth(), getHeight());
                this.f28729b.setImageCoords(0.0f, 0.0f, getWidth(), getHeight());
            }
            imageReceiver.draw(canvas);
            t5 t5Var = this.K;
            if (t5Var.N) {
                Rect rect = t5.f20433a0;
                MediaController.PhotoEntry photoEntry2 = t5Var.G;
                if (photoEntry2 == null || !photoEntry2.isAttachSpoilerRevealed) {
                    this.f28729b.draw(canvas);
                    if (t5Var.M == null) {
                        if (t5Var.L == null) {
                            uh.h hVar = new uh.h();
                            t5Var.L = hVar;
                            hVar.h(i0.a.k(-1, (int) (Color.alpha(-1) * 0.325f)));
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
                paint.setAlpha((int) (wr.f28819f.getInterpolation(1.0f - f7) * 255.0f));
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
                    t5Var.f20435b.invalidate();
                }
            } else if (i12 == 0 && (bitmap = t5Var.R) != null) {
                bitmap.recycle();
                t5Var.R = null;
                t5Var.S = null;
                invalidate();
            }
            if (t5Var.f20440s) {
                r5 r5Var = t5Var.U;
                if ((r5Var == null || !((nm) ((org.telegram.ui.Components.t) r5Var).f27239b).f25559s) && (photoEntry = t5Var.G) != null && photoEntry.isLivePhoto()) {
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
