package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public class gp0 extends View {
    public boolean E;
    public boolean F;
    public int f33972a;
    public final org.telegram.ui.ActionBar.e6 f33973b;
    public float f33974c;
    public boolean d;
    public int e;
    public int f33975f;
    public final org.telegram.ui.Components.f5 h;
    public final org.telegram.ui.Components.f5 f33976n;
    public int f33977r;
    public int f33978s;
    public int v;
    public int f33979w;
    public RadialGradient f33980x;
    public final Paint f33981y;

    public gp0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f33974c = 0.0f;
        org.telegram.ui.Components.qr qrVar = org.telegram.ui.Components.qr.h;
        this.h = new org.telegram.ui.Components.f5(this, 350L, qrVar);
        this.f33976n = new org.telegram.ui.Components.f5(this, 350L, qrVar);
        this.f33981y = new Paint(1);
        this.f33973b = e6Var;
        this.f33972a = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19113s8, e6Var);
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
        org.telegram.ui.ActionBar.e6 e6Var = this.f33973b;
        if (peerColor == null) {
            this.d = true;
            int v02 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19113s8, e6Var);
            this.f33975f = v02;
            this.e = v02;
        } else {
            if (e6Var != null) {
                q6 = e6Var.a();
            } else {
                q6 = org.telegram.ui.ActionBar.i6.I.q();
            }
            this.e = peerColor.getBgColor1(q6);
            this.f33975f = peerColor.getBgColor2(q6);
        }
        if (!z10) {
            this.h.a(this.e, true);
            this.f33976n.a(this.f33975f, true);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i10;
        int a2 = this.h.a(this.e, false);
        int a10 = this.f33976n.a(this.f33975f, false);
        RadialGradient radialGradient = this.f33980x;
        Paint paint = this.f33981y;
        if (radialGradient == null || this.f33977r != a2 || this.f33978s != a10 || this.v != getWidth() || this.f33979w != getHeight()) {
            this.v = getWidth();
            this.f33979w = getHeight();
            float f7 = this.v;
            float f10 = this.f33979w;
            this.f33978s = a10;
            this.f33977r = a2;
            RadialGradient radialGradient2 = new RadialGradient(f7 / 2.0f, f10 * 0.4f, AndroidUtilities.distance(0.0f, 0.0f, f7, f10) * 0.75f, new int[]{a10, a2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            this.f33980x = radialGradient2;
            paint.setShader(radialGradient2);
            a();
        }
        if (this.f33974c < 1.0f && !this.E) {
            canvas2 = canvas;
            canvas2.drawColor(this.f33972a);
        } else {
            canvas2 = canvas;
        }
        if (this.E) {
            i10 = 255;
        } else {
            i10 = (int) (this.f33974c * 255.0f);
        }
        paint.setAlpha(i10);
        canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
    }

    public int getActionBarButtonColor() {
        int i10;
        int i11 = org.telegram.ui.ActionBar.i6.f19168v8;
        org.telegram.ui.ActionBar.e6 e6Var = this.f33973b;
        int v02 = org.telegram.ui.ActionBar.i6.v0(i11, e6Var);
        if (this.d) {
            i10 = org.telegram.ui.ActionBar.i6.v0(i11, e6Var);
        } else {
            i10 = -1;
        }
        return i0.a.d(this.f33974c, v02, i10);
    }

    public int getColor() {
        return i0.a.d(this.f33974c, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19113s8, this.f33973b), i0.a.d(0.75f, this.h.f23815c, this.f33976n.f23815c));
    }

    public int getTabsViewBackgroundColor() {
        int b10;
        int b11;
        int i10 = org.telegram.ui.ActionBar.i6.f19113s8;
        org.telegram.ui.ActionBar.e6 e6Var = this.f33973b;
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.i6.v0(i10, e6Var)) > 0.721f) {
            b10 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19168v8, e6Var);
        } else {
            b10 = org.telegram.ui.ActionBar.i6.b(0.08f, -0.08f, org.telegram.ui.ActionBar.i6.v0(i10, e6Var));
        }
        org.telegram.ui.Components.f5 f5Var = this.h;
        int i11 = f5Var.f23815c;
        org.telegram.ui.Components.f5 f5Var2 = this.f33976n;
        if (AndroidUtilities.computePerceivedBrightness(i0.a.d(0.75f, i11, f5Var2.f23815c)) > 0.721f) {
            b11 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19166v6, e6Var);
        } else {
            b11 = org.telegram.ui.ActionBar.i6.b(0.08f, -0.08f, i0.a.d(0.75f, f5Var.f23815c, f5Var2.f23815c));
        }
        return i0.a.d(this.f33974c, b10, b11);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (!this.F) {
            i11 = org.telegram.messenger.wl.C(230.0f, AndroidUtilities.statusBarHeight, 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    public void setProgressToGradient(float f7) {
        if (Math.abs(this.f33974c - f7) > 0.001f) {
            this.f33974c = f7;
            a();
            invalidate();
        }
    }

    public void a() {
    }
}
