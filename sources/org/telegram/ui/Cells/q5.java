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
import org.telegram.ui.Components.hm;
import org.telegram.ui.Components.qr;
public final class q5 extends org.telegram.ui.Components.v9 {
    public final Paint G;
    public long H;
    public Drawable I;
    public Drawable J;
    public final u5 K;

    public q5(u5 u5Var, Context context) {
        super(context);
        this.K = u5Var;
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
            imageReceiver = p5Var.f27162k;
        } else {
            imageReceiver = this.f29029a;
        }
        if (imageReceiver != null) {
            if (this.f29031c != -1 && this.d != -1) {
                int height = getHeight();
                int i10 = this.d;
                imageReceiver.setImageCoords((getWidth() - this.f29031c) / 2, (height - i10) / 2, this.f29031c, i10);
                int height2 = getHeight();
                int i11 = this.d;
                this.f29030b.setImageCoords((getWidth() - this.f29031c) / 2, (height2 - i11) / 2, this.f29031c, i11);
            } else {
                imageReceiver.setImageCoords(0.0f, 0.0f, getWidth(), getHeight());
                this.f29030b.setImageCoords(0.0f, 0.0f, getWidth(), getHeight());
            }
            imageReceiver.draw(canvas);
            u5 u5Var = this.K;
            if (u5Var.N) {
                Rect rect = u5.f21606a0;
                MediaController.PhotoEntry photoEntry2 = u5Var.G;
                if (photoEntry2 == null || !photoEntry2.isAttachSpoilerRevealed) {
                    this.f29030b.draw(canvas);
                    if (u5Var.M == null) {
                        if (u5Var.L == null) {
                            vh.h hVar = new vh.h();
                            u5Var.L = hVar;
                            hVar.h(i0.a.k(-1, (int) (Color.alpha(-1) * 0.325f)));
                        }
                        u5Var.L.setBounds(0, 0, getWidth(), getHeight());
                        u5Var.L.draw(canvas);
                    }
                    invalidate();
                }
            }
            float f7 = u5Var.T;
            int i12 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
            if (i12 != 0 && u5Var.R != null) {
                Paint paint = this.G;
                paint.setAlpha((int) (qr.f27642f.getInterpolation(1.0f - f7) * 255.0f));
                canvas.drawBitmap(u5Var.R, 0.0f, 0.0f, paint);
                long min = Math.min(16L, System.currentTimeMillis() - this.H);
                Float f10 = u5Var.S;
                if (f10 == null) {
                    floatValue = 250.0f;
                } else {
                    floatValue = f10.floatValue();
                }
                u5Var.T = Math.min(1.0f, (((float) min) / floatValue) + u5Var.T);
                this.H = System.currentTimeMillis();
                invalidate();
                if (u5Var.M != null) {
                    u5Var.f21608b.invalidate();
                }
            } else if (i12 == 0 && (bitmap = u5Var.R) != null) {
                bitmap.recycle();
                u5Var.R = null;
                u5Var.S = null;
                invalidate();
            }
            if (u5Var.f21613s) {
                s5 s5Var = u5Var.U;
                if ((s5Var == null || !((hm) ((org.telegram.ui.Components.s) s5Var).f27987b).f24725s) && (photoEntry = u5Var.G) != null && photoEntry.isLivePhoto()) {
                    if (u5Var.G.isUnalivePhoto()) {
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
        u5 u5Var = this.K;
        MediaController.PhotoEntry photoEntry = u5Var.G;
        if (photoEntry != null && photoEntry.hasSpoiler) {
            z10 = true;
        } else {
            z10 = false;
        }
        u5Var.h(z10);
    }
}
