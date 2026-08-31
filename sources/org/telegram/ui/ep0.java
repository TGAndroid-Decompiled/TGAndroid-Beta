package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class ep0 extends Drawable {
    public static final int f36656j = 0;
    public float f36657a = AndroidUtilities.dpf2(10.6665f);
    public final boolean f36658b;
    public Paint f36659c;
    public final Paint d;
    public final Paint f36660e;
    public final Paint f36661f;
    public final Path f36662g;
    public final Path h;
    public final org.telegram.ui.Components.j5 f36663i;

    public ep0(int i10, int i11, int i12) {
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.f36660e = paint2;
        Paint paint3 = new Paint(1);
        this.f36661f = paint3;
        this.f36662g = new Path();
        this.h = new Path();
        this.f36658b = i12 != i10;
        paint.setColor(i10);
        paint2.setColor(i11);
        paint3.setColor(i12);
        this.f36663i = null;
        d();
    }

    public static ep0 a(int i10, int i11) {
        MessagesController.PeerColor peerColor = null;
        if (i11 < 7) {
            int[] iArr = org.telegram.ui.ActionBar.k6.f21914r8;
            return new ep0(org.telegram.ui.ActionBar.k6.w0(null, iArr[i11], false), org.telegram.ui.ActionBar.k6.w0(null, iArr[i11], false), org.telegram.ui.ActionBar.k6.w0(null, iArr[i11], false));
        }
        MessagesController.PeerColors peerColors = MessagesController.getInstance(i10).peerColors;
        if (peerColors != null) {
            peerColor = peerColors.getColor(i11);
        }
        return b(peerColor, false);
    }

    public static ep0 b(MessagesController.PeerColor peerColor, boolean z4) {
        int color2;
        int color3;
        if (peerColor == null) {
            return new ep0(0, 0, 0);
        }
        int color1 = peerColor.getColor1();
        if (z4 && !peerColor.hasColor6(org.telegram.ui.ActionBar.k6.I.q())) {
            color2 = peerColor.getColor1();
        } else {
            color2 = peerColor.getColor2();
        }
        if (z4) {
            color3 = peerColor.getColor1();
        } else {
            color3 = peerColor.getColor3();
        }
        return new ep0(color1, color2, color3);
    }

    public static ep0 c(int i10, int i11) {
        MessagesController.PeerColor color;
        MessagesController.PeerColors peerColors = MessagesController.getInstance(i10).profilePeerColors;
        if (peerColors == null) {
            color = null;
        } else {
            color = peerColors.getColor(i11);
        }
        return b(color, true);
    }

    public final void d() {
        Path path = this.h;
        path.rewind();
        float f10 = this.f36657a;
        path.addCircle(f10, f10, f10, Path.Direction.CW);
        Path path2 = this.f36662g;
        path2.rewind();
        path2.moveTo(this.f36657a * 2.0f, 0.0f);
        float f11 = this.f36657a;
        path2.lineTo(f11 * 2.0f, f11 * 2.0f);
        path2.lineTo(0.0f, this.f36657a * 2.0f);
        path2.close();
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(getBounds().centerX() - this.f36657a, getBounds().centerY() - this.f36657a);
        Paint paint = this.f36659c;
        if (paint != null) {
            float f10 = this.f36657a;
            canvas.drawCircle(f10, f10, f10, paint);
        }
        canvas.clipPath(this.h);
        canvas.drawPaint(this.d);
        canvas.drawPath(this.f36662g, this.f36660e);
        if (this.f36658b) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(this.f36657a - AndroidUtilities.dp(3.66f), this.f36657a - AndroidUtilities.dp(3.66f), this.f36657a + AndroidUtilities.dp(3.66f), this.f36657a + AndroidUtilities.dp(3.66f));
            float f11 = this.f36657a;
            canvas.rotate(45.0f, f11, f11);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.33f), AndroidUtilities.dp(2.33f), this.f36661f);
        }
        canvas.restore();
        org.telegram.ui.Components.j5 j5Var = this.f36663i;
        if (j5Var != null) {
            int dp = AndroidUtilities.dp(14.0f) / 2;
            j5Var.setBounds(getBounds().centerX() - dp, getBounds().centerY() - dp, getBounds().centerX() + dp, getBounds().centerY() + dp);
            j5Var.draw(canvas);
        }
    }

    public final void e(View view) {
        org.telegram.ui.Components.j5 j5Var = this.f36663i;
        if (view == null) {
            if (j5Var != null) {
                j5Var.b();
                j5Var.l(null);
                return;
            }
            return;
        }
        if (j5Var != null) {
            j5Var.l(view);
        }
        view.addOnAttachStateChangeListener(new h5(this, 3));
    }

    public final void f(float f10, int i10) {
        if (this.f36659c == null) {
            Paint paint = new Paint(1);
            this.f36659c = paint;
            paint.setStyle(Paint.Style.STROKE);
        }
        this.f36659c.setStrokeWidth(f10);
        this.f36659c.setColor(i10);
    }

    @Override
    public final int getIntrinsicHeight() {
        return (int) (this.f36657a * 2.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return (int) (this.f36657a * 2.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public ep0(long j10, int i10, int i11, int i12) {
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.f36660e = paint2;
        Paint paint3 = new Paint(1);
        this.f36661f = paint3;
        this.f36662g = new Path();
        this.h = new Path();
        this.f36658b = i12 != i10;
        paint.setColor(i10);
        paint2.setColor(i11);
        paint3.setColor(i12);
        d();
        org.telegram.ui.Components.j5 j5Var = new org.telegram.ui.Components.j5(AndroidUtilities.dp(14.0f), null);
        this.f36663i = j5Var;
        j5Var.j(j10, false);
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
