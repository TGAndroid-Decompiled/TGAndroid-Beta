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
import org.telegram.ui.Components.pr;
public final class o5 extends org.telegram.ui.Components.x9 {
    public final Paint G;
    public long H;
    public Drawable I;
    public Drawable J;
    public final s5 K;

    public o5(s5 s5Var, Context context) {
        super(context);
        this.K = s5Var;
        this.G = new Paint(1);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ImageReceiver imageReceiver;
        Bitmap bitmap;
        MediaController.PhotoEntry photoEntry;
        Drawable drawable;
        float floatValue;
        org.telegram.ui.Components.q5 q5Var = this.f32506e;
        if (q5Var != null) {
            imageReceiver = q5Var.f29611k;
        } else {
            imageReceiver = this.f32503a;
        }
        if (imageReceiver != null) {
            if (this.f32505c != -1 && this.d != -1) {
                int height = getHeight();
                int i10 = this.d;
                imageReceiver.setImageCoords((getWidth() - this.f32505c) / 2, (height - i10) / 2, this.f32505c, i10);
                int height2 = getHeight();
                int i11 = this.d;
                this.f32504b.setImageCoords((getWidth() - this.f32505c) / 2, (height2 - i11) / 2, this.f32505c, i11);
            } else {
                imageReceiver.setImageCoords(0.0f, 0.0f, getWidth(), getHeight());
                this.f32504b.setImageCoords(0.0f, 0.0f, getWidth(), getHeight());
            }
            imageReceiver.draw(canvas);
            s5 s5Var = this.K;
            if (s5Var.N) {
                Rect rect = s5.f22857a0;
                MediaController.PhotoEntry photoEntry2 = s5Var.G;
                if (photoEntry2 == null || !photoEntry2.isAttachSpoilerRevealed) {
                    this.f32504b.draw(canvas);
                    if (s5Var.M == null) {
                        if (s5Var.L == null) {
                            wh.h hVar = new wh.h();
                            s5Var.L = hVar;
                            hVar.h(i0.a.k(-1, (int) (Color.alpha(-1) * 0.325f)));
                        }
                        s5Var.L.setBounds(0, 0, getWidth(), getHeight());
                        s5Var.L.draw(canvas);
                    }
                    invalidate();
                }
            }
            float f7 = s5Var.T;
            int i12 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
            if (i12 != 0 && s5Var.R != null) {
                Paint paint = this.G;
                paint.setAlpha((int) (pr.f29493f.getInterpolation(1.0f - f7) * 255.0f));
                canvas.drawBitmap(s5Var.R, 0.0f, 0.0f, paint);
                long min = Math.min(16L, System.currentTimeMillis() - this.H);
                Float f10 = s5Var.S;
                if (f10 == null) {
                    floatValue = 250.0f;
                } else {
                    floatValue = f10.floatValue();
                }
                s5Var.T = Math.min(1.0f, (((float) min) / floatValue) + s5Var.T);
                this.H = System.currentTimeMillis();
                invalidate();
                if (s5Var.M != null) {
                    s5Var.f22859b.invalidate();
                }
            } else if (i12 == 0 && (bitmap = s5Var.R) != null) {
                bitmap.recycle();
                s5Var.R = null;
                s5Var.S = null;
                invalidate();
            }
            if (s5Var.f22865s) {
                q5 q5Var2 = s5Var.U;
                if ((q5Var2 == null || !((hm) ((org.telegram.ui.Components.t) q5Var2).f30481b).f26784s) && (photoEntry = s5Var.G) != null && photoEntry.isLivePhoto()) {
                    if (s5Var.G.isUnalivePhoto()) {
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
        s5 s5Var = this.K;
        MediaController.PhotoEntry photoEntry = s5Var.G;
        if (photoEntry != null && photoEntry.hasSpoiler) {
            z10 = true;
        } else {
            z10 = false;
        }
        s5Var.h(z10);
    }
}
