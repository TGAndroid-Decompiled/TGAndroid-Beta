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
import org.telegram.ui.Components.fm;
import org.telegram.ui.Components.pr;
public final class p5 extends org.telegram.ui.Components.p9 {
    public final Paint D;
    public long E;
    public Drawable F;
    public Drawable G;
    public final t5 H;

    public p5(t5 t5Var, Context context) {
        super(context);
        this.H = t5Var;
        this.D = new Paint(1);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ImageReceiver imageReceiver;
        Bitmap bitmap;
        MediaController.PhotoEntry photoEntry;
        Drawable drawable;
        float floatValue;
        org.telegram.ui.Components.l5 l5Var = this.f30014e;
        if (l5Var != null) {
            imageReceiver = l5Var.f28637k;
        } else {
            imageReceiver = this.f30011a;
        }
        if (imageReceiver != null) {
            if (this.f30013c != -1 && this.d != -1) {
                int height = getHeight();
                int i10 = this.d;
                imageReceiver.setImageCoords((getWidth() - this.f30013c) / 2, (height - i10) / 2, this.f30013c, i10);
                int height2 = getHeight();
                int i11 = this.d;
                this.f30012b.setImageCoords((getWidth() - this.f30013c) / 2, (height2 - i11) / 2, this.f30013c, i11);
            } else {
                imageReceiver.setImageCoords(0.0f, 0.0f, getWidth(), getHeight());
                this.f30012b.setImageCoords(0.0f, 0.0f, getWidth(), getHeight());
            }
            imageReceiver.draw(canvas);
            t5 t5Var = this.H;
            if (t5Var.K) {
                Rect rect = t5.U;
                MediaController.PhotoEntry photoEntry2 = t5Var.D;
                if (photoEntry2 == null || !photoEntry2.isAttachSpoilerRevealed) {
                    this.f30012b.draw(canvas);
                    if (t5Var.J == null) {
                        if (t5Var.I == null) {
                            jh.k kVar = new jh.k();
                            t5Var.I = kVar;
                            kVar.h(i0.a.k(-1, (int) (Color.alpha(-1) * 0.325f)));
                        }
                        t5Var.I.setBounds(0, 0, getWidth(), getHeight());
                        t5Var.I.draw(canvas);
                    }
                    invalidate();
                }
            }
            float f10 = t5Var.Q;
            int i12 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
            if (i12 != 0 && t5Var.O != null) {
                Paint paint = this.D;
                paint.setAlpha((int) (pr.f30168f.getInterpolation(1.0f - f10) * 255.0f));
                canvas.drawBitmap(t5Var.O, 0.0f, 0.0f, paint);
                long min = Math.min(16L, System.currentTimeMillis() - this.E);
                Float f11 = t5Var.P;
                if (f11 == null) {
                    floatValue = 250.0f;
                } else {
                    floatValue = f11.floatValue();
                }
                t5Var.Q = Math.min(1.0f, (((float) min) / floatValue) + t5Var.Q);
                this.E = System.currentTimeMillis();
                invalidate();
                if (t5Var.J != null) {
                    t5Var.f24152b.invalidate();
                }
            } else if (i12 == 0 && (bitmap = t5Var.O) != null) {
                bitmap.recycle();
                t5Var.O = null;
                t5Var.P = null;
                invalidate();
            }
            if (t5Var.f24158s) {
                r5 r5Var = t5Var.R;
                if ((r5Var == null || !((fm) ((org.telegram.ui.Components.t) r5Var).f31223b).f26946s) && (photoEntry = t5Var.D) != null && photoEntry.isLivePhoto()) {
                    if (t5Var.D.isUnalivePhoto()) {
                        if (this.G == null) {
                            this.G = getContext().getResources().getDrawable(R.drawable.media_live_off).mutate();
                        }
                        drawable = this.G;
                    } else {
                        if (this.F == null) {
                            this.F = getContext().getResources().getDrawable(R.drawable.media_live_on).mutate();
                        }
                        drawable = this.F;
                    }
                    drawable.setBounds((int) (imageReceiver.getImageX() + AndroidUtilities.dp(8.0f)), (int) (imageReceiver.getImageY() + AndroidUtilities.dp(8.0f)), (int) (imageReceiver.getImageX() + AndroidUtilities.dp(30.0f)), (int) (imageReceiver.getImageY() + AndroidUtilities.dp(26.0f)));
                    drawable.draw(canvas);
                }
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z4;
        super.onMeasure(i10, i11);
        t5 t5Var = this.H;
        MediaController.PhotoEntry photoEntry = t5Var.D;
        if (photoEntry != null && photoEntry.hasSpoiler) {
            z4 = true;
        } else {
            z4 = false;
        }
        t5Var.h(z4);
    }
}
