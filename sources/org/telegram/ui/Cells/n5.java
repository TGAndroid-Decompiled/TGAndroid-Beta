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
import org.telegram.ui.Components.cm;
import org.telegram.ui.Components.jr;
public final class n5 extends org.telegram.ui.Components.t9 {
    public final Paint C;
    public long D;
    public Drawable E;
    public Drawable F;
    public final r5 G;

    public n5(r5 r5Var, Context context) {
        super(context);
        this.G = r5Var;
        this.C = new Paint(1);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ImageReceiver imageReceiver;
        Bitmap bitmap;
        MediaController.PhotoEntry photoEntry;
        Drawable drawable;
        float floatValue;
        org.telegram.ui.Components.p5 p5Var = this.f32906e;
        if (p5Var != null) {
            imageReceiver = p5Var.f31593k;
        } else {
            imageReceiver = this.f32903a;
        }
        if (imageReceiver != null) {
            if (this.f32905c != -1 && this.d != -1) {
                int height = getHeight();
                int i10 = this.d;
                imageReceiver.setImageCoords((getWidth() - this.f32905c) / 2, (height - i10) / 2, this.f32905c, i10);
                int height2 = getHeight();
                int i11 = this.d;
                this.f32904b.setImageCoords((getWidth() - this.f32905c) / 2, (height2 - i11) / 2, this.f32905c, i11);
            } else {
                imageReceiver.setImageCoords(0.0f, 0.0f, getWidth(), getHeight());
                this.f32904b.setImageCoords(0.0f, 0.0f, getWidth(), getHeight());
            }
            imageReceiver.draw(canvas);
            r5 r5Var = this.G;
            if (r5Var.J) {
                Rect rect = r5.T;
                MediaController.PhotoEntry photoEntry2 = r5Var.C;
                if (photoEntry2 == null || !photoEntry2.isAttachSpoilerRevealed) {
                    this.f32904b.draw(canvas);
                    if (r5Var.I == null) {
                        if (r5Var.H == null) {
                            gh.k kVar = new gh.k();
                            r5Var.H = kVar;
                            kVar.h(i0.a.k(-1, (int) (Color.alpha(-1) * 0.325f)));
                        }
                        r5Var.H.setBounds(0, 0, getWidth(), getHeight());
                        r5Var.H.draw(canvas);
                    }
                    invalidate();
                }
            }
            float f9 = r5Var.P;
            int i12 = (f9 > 1.0f ? 1 : (f9 == 1.0f ? 0 : -1));
            if (i12 != 0 && r5Var.N != null) {
                Paint paint = this.C;
                paint.setAlpha((int) (jr.f29800f.getInterpolation(1.0f - f9) * 255.0f));
                canvas.drawBitmap(r5Var.N, 0.0f, 0.0f, paint);
                long min = Math.min(16L, System.currentTimeMillis() - this.D);
                Float f10 = r5Var.O;
                if (f10 == null) {
                    floatValue = 250.0f;
                } else {
                    floatValue = f10.floatValue();
                }
                r5Var.P = Math.min(1.0f, (((float) min) / floatValue) + r5Var.P);
                this.D = System.currentTimeMillis();
                invalidate();
                if (r5Var.I != null) {
                    r5Var.f25216b.invalidate();
                }
            } else if (i12 == 0 && (bitmap = r5Var.N) != null) {
                bitmap.recycle();
                r5Var.N = null;
                r5Var.O = null;
                invalidate();
            }
            if (r5Var.f25222s) {
                p5 p5Var2 = r5Var.Q;
                if ((p5Var2 == null || !((cm) ((org.telegram.ui.Components.u) p5Var2).f33067b).f27508s) && (photoEntry = r5Var.C) != null && photoEntry.isLivePhoto()) {
                    if (r5Var.C.isUnalivePhoto()) {
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
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        super.onMeasure(i10, i11);
        r5 r5Var = this.G;
        MediaController.PhotoEntry photoEntry = r5Var.C;
        if (photoEntry != null && photoEntry.hasSpoiler) {
            z10 = true;
        } else {
            z10 = false;
        }
        r5Var.h(z10);
    }
}
