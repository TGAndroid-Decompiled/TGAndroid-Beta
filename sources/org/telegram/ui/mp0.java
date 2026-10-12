package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public class mp0 extends View {
    public boolean E;
    public boolean F;
    public int f38302a;
    public final org.telegram.ui.ActionBar.c6 f38303b;
    public float f38304c;
    public boolean d;
    public int e;
    public int f38305f;
    public final org.telegram.ui.Components.j5 h;
    public final org.telegram.ui.Components.j5 f38306n;
    public int f38307r;
    public int f38308s;
    public int v;
    public int f38309w;
    public RadialGradient f38310x;
    public final Paint f38311y;

    public mp0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f38304c = 0.0f;
        org.telegram.ui.Components.es esVar = org.telegram.ui.Components.es.h;
        this.h = new org.telegram.ui.Components.j5(this, 350L, esVar);
        this.f38306n = new org.telegram.ui.Components.j5(this, 350L, esVar);
        this.f38311y = new Paint(1);
        this.f38303b = c6Var;
        this.f38302a = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20180s8, c6Var);
        b(-1, -1, false);
    }

    public final void b(int i10, int i11, boolean z10) {
        MessagesController.PeerColors peerColors;
        MessagesController.PeerColor peerColor = null;
        if (i11 >= 0 && i10 >= 0 && (peerColors = MessagesController.getInstance(i10).profilePeerColors) != null) {
            peerColor = peerColors.getColor(i11);
        }
        c(peerColor, z10);
    }

    public final void c(MessagesController.PeerColor peerColor, boolean z10) {
        boolean q6;
        this.d = false;
        org.telegram.ui.ActionBar.c6 c6Var = this.f38303b;
        if (peerColor == null) {
            this.d = true;
            int w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20180s8, c6Var);
            this.f38305f = w02;
            this.e = w02;
        } else {
            if (c6Var != null) {
                q6 = c6Var.a();
            } else {
                q6 = org.telegram.ui.ActionBar.g6.I.q();
            }
            this.e = peerColor.getBgColor1(q6);
            this.f38305f = peerColor.getBgColor2(q6);
        }
        if (!z10) {
            this.h.a(this.e, true);
            this.f38306n.a(this.f38305f, true);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i10;
        int a2 = this.h.a(this.e, false);
        int a10 = this.f38306n.a(this.f38305f, false);
        RadialGradient radialGradient = this.f38310x;
        Paint paint = this.f38311y;
        if (radialGradient == null || this.f38307r != a2 || this.f38308s != a10 || this.v != getWidth() || this.f38309w != getHeight()) {
            this.v = getWidth();
            this.f38309w = getHeight();
            float f7 = this.v;
            float f10 = this.f38309w;
            this.f38308s = a10;
            this.f38307r = a2;
            RadialGradient radialGradient2 = new RadialGradient(f7 / 2.0f, f10 * 0.4f, AndroidUtilities.distance(0.0f, 0.0f, f7, f10) * 0.75f, new int[]{a10, a2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            this.f38310x = radialGradient2;
            paint.setShader(radialGradient2);
            a();
        }
        if (this.f38304c < 1.0f && !this.E) {
            canvas2 = canvas;
            canvas2.drawColor(this.f38302a);
        } else {
            canvas2 = canvas;
        }
        if (this.E) {
            i10 = 255;
        } else {
            i10 = (int) (this.f38304c * 255.0f);
        }
        paint.setAlpha(i10);
        canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
    }

    public int getActionBarButtonColor() {
        int i10;
        int i11 = org.telegram.ui.ActionBar.g6.f20235v8;
        org.telegram.ui.ActionBar.c6 c6Var = this.f38303b;
        int w02 = org.telegram.ui.ActionBar.g6.w0(i11, c6Var);
        if (this.d) {
            i10 = org.telegram.ui.ActionBar.g6.w0(i11, c6Var);
        } else {
            i10 = -1;
        }
        return i0.a.d(this.f38304c, w02, i10);
    }

    public int getColor() {
        return i0.a.d(this.f38304c, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20180s8, this.f38303b), i0.a.d(0.75f, this.h.f26184c, this.f38306n.f26184c));
    }

    public int getTabsViewBackgroundColor() {
        int b10;
        int b11;
        int i10 = org.telegram.ui.ActionBar.g6.f20180s8;
        org.telegram.ui.ActionBar.c6 c6Var = this.f38303b;
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.w0(i10, c6Var)) > 0.721f) {
            b10 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20235v8, c6Var);
        } else {
            b10 = org.telegram.ui.ActionBar.g6.b(0.08f, -0.08f, org.telegram.ui.ActionBar.g6.w0(i10, c6Var));
        }
        org.telegram.ui.Components.j5 j5Var = this.h;
        int i11 = j5Var.f26184c;
        org.telegram.ui.Components.j5 j5Var2 = this.f38306n;
        if (AndroidUtilities.computePerceivedBrightness(i0.a.d(0.75f, i11, j5Var2.f26184c)) > 0.721f) {
            b11 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20233v6, c6Var);
        } else {
            b11 = org.telegram.ui.ActionBar.g6.b(0.08f, -0.08f, i0.a.d(0.75f, j5Var.f26184c, j5Var2.f26184c));
        }
        return i0.a.d(this.f38304c, b10, b11);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (!this.F) {
            i11 = org.telegram.messenger.yh.D(230.0f, AndroidUtilities.statusBarHeight, 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    public void setProgressToGradient(float f7) {
        if (Math.abs(this.f38304c - f7) > 0.001f) {
            this.f38304c = f7;
            a();
            invalidate();
        }
    }

    public void a() {
    }
}
