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
import org.telegram.ui.Components.dm;
import org.telegram.ui.Components.mr;
public final class o5 extends org.telegram.ui.Components.p9 {
    public final Paint D;
    public long E;
    public Drawable F;
    public Drawable G;
    public final s5 H;

    public o5(s5 s5Var, Context context) {
        super(context);
        this.H = s5Var;
        this.D = new Paint(1);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ImageReceiver imageReceiver;
        Bitmap bitmap;
        MediaController.PhotoEntry photoEntry;
        Drawable drawable;
        float floatValue;
        org.telegram.ui.Components.l5 l5Var = this.e;
        if (l5Var != null) {
            imageReceiver = l5Var.f26587k;
        } else {
            imageReceiver = this.f27801a;
        }
        if (imageReceiver != null) {
            if (this.f27803c != -1 && this.d != -1) {
                int height = getHeight();
                int i10 = this.d;
                imageReceiver.setImageCoords((getWidth() - this.f27803c) / 2, (height - i10) / 2, this.f27803c, i10);
                int height2 = getHeight();
                int i11 = this.d;
                this.f27802b.setImageCoords((getWidth() - this.f27803c) / 2, (height2 - i11) / 2, this.f27803c, i11);
            } else {
                imageReceiver.setImageCoords(0.0f, 0.0f, getWidth(), getHeight());
                this.f27802b.setImageCoords(0.0f, 0.0f, getWidth(), getHeight());
            }
            imageReceiver.draw(canvas);
            s5 s5Var = this.H;
            if (s5Var.K) {
                Rect rect = s5.U;
                MediaController.PhotoEntry photoEntry2 = s5Var.D;
                if (photoEntry2 == null || !photoEntry2.isAttachSpoilerRevealed) {
                    this.f27802b.draw(canvas);
                    if (s5Var.J == null) {
                        if (s5Var.I == null) {
                            ih.k kVar = new ih.k();
                            s5Var.I = kVar;
                            kVar.h(i0.a.k(-1, (int) (Color.alpha(-1) * 0.325f)));
                        }
                        s5Var.I.setBounds(0, 0, getWidth(), getHeight());
                        s5Var.I.draw(canvas);
                    }
                    invalidate();
                }
            }
            float f10 = s5Var.Q;
            int i12 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
            if (i12 != 0 && s5Var.O != null) {
                Paint paint = this.D;
                paint.setAlpha((int) (mr.f27122f.getInterpolation(1.0f - f10) * 255.0f));
                canvas.drawBitmap(s5Var.O, 0.0f, 0.0f, paint);
                long min = Math.min(16L, System.currentTimeMillis() - this.E);
                Float f11 = s5Var.P;
                if (f11 == null) {
                    floatValue = 250.0f;
                } else {
                    floatValue = f11.floatValue();
                }
                s5Var.Q = Math.min(1.0f, (((float) min) / floatValue) + s5Var.Q);
                this.E = System.currentTimeMillis();
                invalidate();
                if (s5Var.J != null) {
                    s5Var.f22285b.invalidate();
                }
            } else if (i12 == 0 && (bitmap = s5Var.O) != null) {
                bitmap.recycle();
                s5Var.O = null;
                s5Var.P = null;
                invalidate();
            }
            if (s5Var.f22290s) {
                q5 q5Var = s5Var.R;
                if ((q5Var == null || !((dm) ((org.telegram.ui.Components.t) q5Var).f28848b).f24313s) && (photoEntry = s5Var.D) != null && photoEntry.isLivePhoto()) {
                    if (s5Var.D.isUnalivePhoto()) {
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
        s5 s5Var = this.H;
        MediaController.PhotoEntry photoEntry = s5Var.D;
        if (photoEntry != null && photoEntry.hasSpoiler) {
            z4 = true;
        } else {
            z4 = false;
        }
        s5Var.h(z4);
    }
}
