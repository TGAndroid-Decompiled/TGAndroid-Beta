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
public final class fp0 extends Drawable {
    public static final int f37364j = 0;
    public float f37365a = AndroidUtilities.dpf2(10.6665f);
    public final boolean f37366b;
    public Paint f37367c;
    public final Paint d;
    public final Paint e;
    public final Paint f37368f;
    public final Path f37369g;
    public final Path h;
    public final org.telegram.ui.Components.n5 f37370i;

    public fp0(int i10, int i11, int i12) {
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.e = paint2;
        Paint paint3 = new Paint(1);
        this.f37368f = paint3;
        this.f37369g = new Path();
        this.h = new Path();
        this.f37366b = i12 != i10;
        paint.setColor(i10);
        paint2.setColor(i11);
        paint3.setColor(i12);
        this.f37370i = null;
        d();
    }

    public static fp0 a(int i10, int i11) {
        MessagesController.PeerColor peerColor = null;
        if (i11 < 7) {
            int[] iArr = org.telegram.ui.ActionBar.k6.f21443r8;
            return new fp0(org.telegram.ui.ActionBar.k6.x0(null, iArr[i11], false), org.telegram.ui.ActionBar.k6.x0(null, iArr[i11], false), org.telegram.ui.ActionBar.k6.x0(null, iArr[i11], false));
        }
        MessagesController.PeerColors peerColors = MessagesController.getInstance(i10).peerColors;
        if (peerColors != null) {
            peerColor = peerColors.getColor(i11);
        }
        return b(peerColor, false);
    }

    public static fp0 b(MessagesController.PeerColor peerColor, boolean z10) {
        int color2;
        int color3;
        if (peerColor == null) {
            return new fp0(0, 0, 0);
        }
        int color1 = peerColor.getColor1();
        if (z10 && !peerColor.hasColor6(org.telegram.ui.ActionBar.k6.I.q())) {
            color2 = peerColor.getColor1();
        } else {
            color2 = peerColor.getColor2();
        }
        if (z10) {
            color3 = peerColor.getColor1();
        } else {
            color3 = peerColor.getColor3();
        }
        return new fp0(color1, color2, color3);
    }

    public static fp0 c(int i10, int i11) {
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
        float f7 = this.f37365a;
        path.addCircle(f7, f7, f7, Path.Direction.CW);
        Path path2 = this.f37369g;
        path2.rewind();
        path2.moveTo(this.f37365a * 2.0f, 0.0f);
        float f10 = this.f37365a;
        path2.lineTo(f10 * 2.0f, f10 * 2.0f);
        path2.lineTo(0.0f, this.f37365a * 2.0f);
        path2.close();
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(getBounds().centerX() - this.f37365a, getBounds().centerY() - this.f37365a);
        Paint paint = this.f37367c;
        if (paint != null) {
            float f7 = this.f37365a;
            canvas.drawCircle(f7, f7, f7, paint);
        }
        canvas.clipPath(this.h);
        canvas.drawPaint(this.d);
        canvas.drawPath(this.f37369g, this.e);
        if (this.f37366b) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(this.f37365a - AndroidUtilities.dp(3.66f), this.f37365a - AndroidUtilities.dp(3.66f), this.f37365a + AndroidUtilities.dp(3.66f), this.f37365a + AndroidUtilities.dp(3.66f));
            float f10 = this.f37365a;
            canvas.rotate(45.0f, f10, f10);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.33f), AndroidUtilities.dp(2.33f), this.f37368f);
        }
        canvas.restore();
        org.telegram.ui.Components.n5 n5Var = this.f37370i;
        if (n5Var != null) {
            int dp = AndroidUtilities.dp(14.0f) / 2;
            n5Var.setBounds(getBounds().centerX() - dp, getBounds().centerY() - dp, getBounds().centerX() + dp, getBounds().centerY() + dp);
            n5Var.draw(canvas);
        }
    }

    public final void e(View view) {
        org.telegram.ui.Components.n5 n5Var = this.f37370i;
        if (view == null) {
            if (n5Var != null) {
                n5Var.b();
                n5Var.l(null);
                return;
            }
            return;
        }
        if (n5Var != null) {
            n5Var.l(view);
        }
        view.addOnAttachStateChangeListener(new j5(this, 3));
    }

    public final void f(float f7, int i10) {
        if (this.f37367c == null) {
            Paint paint = new Paint(1);
            this.f37367c = paint;
            paint.setStyle(Paint.Style.STROKE);
        }
        this.f37367c.setStrokeWidth(f7);
        this.f37367c.setColor(i10);
    }

    @Override
    public final int getIntrinsicHeight() {
        return (int) (this.f37365a * 2.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return (int) (this.f37365a * 2.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public fp0(long j10, int i10, int i11, int i12) {
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.e = paint2;
        Paint paint3 = new Paint(1);
        this.f37368f = paint3;
        this.f37369g = new Path();
        this.h = new Path();
        this.f37366b = i12 != i10;
        paint.setColor(i10);
        paint2.setColor(i11);
        paint3.setColor(i12);
        d();
        org.telegram.ui.Components.n5 n5Var = new org.telegram.ui.Components.n5(AndroidUtilities.dp(14.0f), null);
        this.f37370i = n5Var;
        n5Var.j(j10, false);
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
