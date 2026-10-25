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
public final class mp0 extends Drawable {
    public static final int f41632j = 0;
    public float f41633a = AndroidUtilities.dpf2(10.6665f);
    public final boolean f41634b;
    public Paint f41635c;
    public final Paint d;
    public final Paint e;
    public final Paint f41636f;
    public final Path f41637g;
    public final Path h;
    public final org.telegram.ui.Components.r5 f41638i;

    public mp0(int i10, int i11, int i12) {
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.e = paint2;
        Paint paint3 = new Paint(1);
        this.f41636f = paint3;
        this.f41637g = new Path();
        this.h = new Path();
        this.f41634b = i12 != i10;
        paint.setColor(i10);
        paint2.setColor(i11);
        paint3.setColor(i12);
        this.f41638i = null;
        d();
    }

    public static mp0 a(int i10, int i11) {
        MessagesController.PeerColor peerColor = null;
        if (i11 < 7) {
            int[] iArr = org.telegram.ui.ActionBar.y6.f23614r8;
            return new mp0(org.telegram.ui.ActionBar.y6.x0(null, iArr[i11], false), org.telegram.ui.ActionBar.y6.x0(null, iArr[i11], false), org.telegram.ui.ActionBar.y6.x0(null, iArr[i11], false));
        }
        MessagesController.PeerColors peerColors = MessagesController.getInstance(i10).peerColors;
        if (peerColors != null) {
            peerColor = peerColors.getColor(i11);
        }
        return b(peerColor, false);
    }

    public static mp0 b(MessagesController.PeerColor peerColor, boolean z10) {
        int color2;
        int color3;
        if (peerColor == null) {
            return new mp0(0, 0, 0);
        }
        int color1 = peerColor.getColor1();
        if (z10 && !peerColor.hasColor6(org.telegram.ui.ActionBar.y6.I.q())) {
            color2 = peerColor.getColor1();
        } else {
            color2 = peerColor.getColor2();
        }
        if (z10) {
            color3 = peerColor.getColor1();
        } else {
            color3 = peerColor.getColor3();
        }
        return new mp0(color1, color2, color3);
    }

    public static mp0 c(int i10, int i11) {
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
        float f7 = this.f41633a;
        path.addCircle(f7, f7, f7, Path.Direction.CW);
        Path path2 = this.f41637g;
        path2.rewind();
        path2.moveTo(this.f41633a * 2.0f, 0.0f);
        float f10 = this.f41633a;
        path2.lineTo(f10 * 2.0f, f10 * 2.0f);
        path2.lineTo(0.0f, this.f41633a * 2.0f);
        path2.close();
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(getBounds().centerX() - this.f41633a, getBounds().centerY() - this.f41633a);
        Paint paint = this.f41635c;
        if (paint != null) {
            float f7 = this.f41633a;
            canvas.drawCircle(f7, f7, f7, paint);
        }
        canvas.clipPath(this.h);
        canvas.drawPaint(this.d);
        canvas.drawPath(this.f41637g, this.e);
        if (this.f41634b) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(this.f41633a - AndroidUtilities.dp(3.66f), this.f41633a - AndroidUtilities.dp(3.66f), this.f41633a + AndroidUtilities.dp(3.66f), this.f41633a + AndroidUtilities.dp(3.66f));
            float f10 = this.f41633a;
            canvas.rotate(45.0f, f10, f10);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.33f), AndroidUtilities.dp(2.33f), this.f41636f);
        }
        canvas.restore();
        org.telegram.ui.Components.r5 r5Var = this.f41638i;
        if (r5Var != null) {
            int dp = AndroidUtilities.dp(14.0f) / 2;
            r5Var.setBounds(getBounds().centerX() - dp, getBounds().centerY() - dp, getBounds().centerX() + dp, getBounds().centerY() + dp);
            r5Var.draw(canvas);
        }
    }

    public final void e(View view) {
        org.telegram.ui.Components.r5 r5Var = this.f41638i;
        if (view == null) {
            if (r5Var != null) {
                r5Var.b();
                r5Var.l(null);
                return;
            }
            return;
        }
        if (r5Var != null) {
            r5Var.l(view);
        }
        view.addOnAttachStateChangeListener(new i5(this, 3));
    }

    public final void f(float f7, int i10) {
        if (this.f41635c == null) {
            Paint paint = new Paint(1);
            this.f41635c = paint;
            paint.setStyle(Paint.Style.STROKE);
        }
        this.f41635c.setStrokeWidth(f7);
        this.f41635c.setColor(i10);
    }

    @Override
    public final int getIntrinsicHeight() {
        return (int) (this.f41633a * 2.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return (int) (this.f41633a * 2.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public mp0(long j10, int i10, int i11, int i12) {
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.e = paint2;
        Paint paint3 = new Paint(1);
        this.f41636f = paint3;
        this.f41637g = new Path();
        this.h = new Path();
        this.f41634b = i12 != i10;
        paint.setColor(i10);
        paint2.setColor(i11);
        paint3.setColor(i12);
        d();
        org.telegram.ui.Components.r5 r5Var = new org.telegram.ui.Components.r5(AndroidUtilities.dp(14.0f), null);
        this.f41638i = r5Var;
        r5Var.j(j10, false);
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
