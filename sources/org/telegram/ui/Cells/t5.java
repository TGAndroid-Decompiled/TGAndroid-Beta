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
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.tm;
public final class t5 extends org.telegram.ui.Components.y9 {
    public final Paint G;
    public long H;
    public Drawable I;
    public Drawable J;
    public final x5 K;

    public t5(x5 x5Var, Context context) {
        super(context);
        this.K = x5Var;
        this.G = new Paint(1);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ImageReceiver imageReceiver;
        Bitmap bitmap;
        MediaController.PhotoEntry photoEntry;
        Drawable drawable;
        float floatValue;
        org.telegram.ui.Components.t5 t5Var = this.e;
        if (t5Var != null) {
            imageReceiver = t5Var.f32852k;
        } else {
            imageReceiver = this.f34984a;
        }
        if (imageReceiver != null) {
            if (this.f34986c != -1 && this.d != -1) {
                int height = getHeight();
                int i10 = this.d;
                imageReceiver.setImageCoords((getWidth() - this.f34986c) / 2, (height - i10) / 2, this.f34986c, i10);
                int height2 = getHeight();
                int i11 = this.d;
                this.f34985b.setImageCoords((getWidth() - this.f34986c) / 2, (height2 - i11) / 2, this.f34986c, i11);
            } else {
                imageReceiver.setImageCoords(0.0f, 0.0f, getWidth(), getHeight());
                this.f34985b.setImageCoords(0.0f, 0.0f, getWidth(), getHeight());
            }
            imageReceiver.draw(canvas);
            x5 x5Var = this.K;
            if (x5Var.N) {
                Rect rect = x5.f25698a0;
                MediaController.PhotoEntry photoEntry2 = x5Var.G;
                if (photoEntry2 == null || !photoEntry2.isAttachSpoilerRevealed) {
                    this.f34985b.draw(canvas);
                    if (x5Var.M == null) {
                        if (x5Var.L == null) {
                            xh.g gVar = new xh.g();
                            x5Var.L = gVar;
                            gVar.h(i0.a.o(-1, (int) (Color.alpha(-1) * 0.325f)));
                        }
                        x5Var.L.setBounds(0, 0, getWidth(), getHeight());
                        x5Var.L.draw(canvas);
                    }
                    invalidate();
                }
            }
            float f7 = x5Var.T;
            int i12 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
            if (i12 != 0 && x5Var.R != null) {
                Paint paint = this.G;
                paint.setAlpha((int) (ds.f27586f.getInterpolation(1.0f - f7) * 255.0f));
                canvas.drawBitmap(x5Var.R, 0.0f, 0.0f, paint);
                long min = Math.min(16L, System.currentTimeMillis() - this.H);
                Float f10 = x5Var.S;
                if (f10 == null) {
                    floatValue = 250.0f;
                } else {
                    floatValue = f10.floatValue();
                }
                x5Var.T = org.telegram.ui.d3.d((float) min, floatValue, x5Var.T, 1.0f);
                this.H = System.currentTimeMillis();
                invalidate();
                if (x5Var.M != null) {
                    x5Var.f25700b.invalidate();
                }
            } else if (i12 == 0 && (bitmap = x5Var.R) != null) {
                bitmap.recycle();
                x5Var.R = null;
                x5Var.S = null;
                invalidate();
            }
            if (x5Var.f25705s) {
                v5 v5Var = x5Var.U;
                if ((v5Var == null || !((tm) ((org.telegram.ui.Components.s) v5Var).f32352b).f33105s) && (photoEntry = x5Var.G) != null && photoEntry.isLivePhoto()) {
                    if (x5Var.G.isUnalivePhoto()) {
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
        x5 x5Var = this.K;
        MediaController.PhotoEntry photoEntry = x5Var.G;
        if (photoEntry != null && photoEntry.hasSpoiler) {
            z10 = true;
        } else {
            z10 = false;
        }
        x5Var.h(z10);
    }
}
