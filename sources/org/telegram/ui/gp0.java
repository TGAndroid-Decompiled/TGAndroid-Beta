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
    public int f38067a;
    public final org.telegram.ui.ActionBar.e6 f38068b;
    public float f38069c;
    public boolean d;
    public int f38070e;
    public int f38071f;
    public final org.telegram.ui.Components.j5 h;
    public final org.telegram.ui.Components.j5 f38072n;
    public int f38073r;
    public int f38074s;
    public int v;
    public int f38075w;
    public RadialGradient f38076x;
    public final Paint f38077y;

    public gp0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f38069c = 0.0f;
        org.telegram.ui.Components.hs hsVar = org.telegram.ui.Components.hs.h;
        this.h = new org.telegram.ui.Components.j5(this, 350L, hsVar);
        this.f38072n = new org.telegram.ui.Components.j5(this, 350L, hsVar);
        this.f38077y = new Paint(1);
        this.f38068b = e6Var;
        this.f38067a = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21075s8, e6Var);
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
        org.telegram.ui.ActionBar.e6 e6Var = this.f38068b;
        if (peerColor == null) {
            this.d = true;
            int w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21075s8, e6Var);
            this.f38071f = w02;
            this.f38070e = w02;
        } else {
            if (e6Var != null) {
                q6 = e6Var.a();
            } else {
                q6 = org.telegram.ui.ActionBar.i6.I.q();
            }
            this.f38070e = peerColor.getBgColor1(q6);
            this.f38071f = peerColor.getBgColor2(q6);
        }
        if (!z10) {
            this.h.a(this.f38070e, true);
            this.f38072n.a(this.f38071f, true);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i10;
        int a2 = this.h.a(this.f38070e, false);
        int a10 = this.f38072n.a(this.f38071f, false);
        RadialGradient radialGradient = this.f38076x;
        Paint paint = this.f38077y;
        if (radialGradient == null || this.f38073r != a2 || this.f38074s != a10 || this.v != getWidth() || this.f38075w != getHeight()) {
            this.v = getWidth();
            this.f38075w = getHeight();
            float f7 = this.v;
            float f10 = this.f38075w;
            this.f38074s = a10;
            this.f38073r = a2;
            RadialGradient radialGradient2 = new RadialGradient(f7 / 2.0f, f10 * 0.4f, AndroidUtilities.distance(0.0f, 0.0f, f7, f10) * 0.75f, new int[]{a10, a2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            this.f38076x = radialGradient2;
            paint.setShader(radialGradient2);
            a();
        }
        if (this.f38069c < 1.0f && !this.E) {
            canvas2 = canvas;
            canvas2.drawColor(this.f38067a);
        } else {
            canvas2 = canvas;
        }
        if (this.E) {
            i10 = 255;
        } else {
            i10 = (int) (this.f38069c * 255.0f);
        }
        paint.setAlpha(i10);
        canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
    }

    public int getActionBarButtonColor() {
        int i10;
        int i11 = org.telegram.ui.ActionBar.i6.f21130v8;
        org.telegram.ui.ActionBar.e6 e6Var = this.f38068b;
        int w02 = org.telegram.ui.ActionBar.i6.w0(i11, e6Var);
        if (this.d) {
            i10 = org.telegram.ui.ActionBar.i6.w0(i11, e6Var);
        } else {
            i10 = -1;
        }
        return i0.a.d(this.f38069c, w02, i10);
    }

    public int getColor() {
        return i0.a.d(this.f38069c, org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21075s8, this.f38068b), i0.a.d(0.75f, this.h.f27600c, this.f38072n.f27600c));
    }

    public int getTabsViewBackgroundColor() {
        int b10;
        int b11;
        int i10 = org.telegram.ui.ActionBar.i6.f21075s8;
        org.telegram.ui.ActionBar.e6 e6Var = this.f38068b;
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.i6.w0(i10, e6Var)) > 0.721f) {
            b10 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21130v8, e6Var);
        } else {
            b10 = org.telegram.ui.ActionBar.i6.b(0.08f, -0.08f, org.telegram.ui.ActionBar.i6.w0(i10, e6Var));
        }
        org.telegram.ui.Components.j5 j5Var = this.h;
        int i11 = j5Var.f27600c;
        org.telegram.ui.Components.j5 j5Var2 = this.f38072n;
        if (AndroidUtilities.computePerceivedBrightness(i0.a.d(0.75f, i11, j5Var2.f27600c)) > 0.721f) {
            b11 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21128v6, e6Var);
        } else {
            b11 = org.telegram.ui.ActionBar.i6.b(0.08f, -0.08f, i0.a.d(0.75f, j5Var.f27600c, j5Var2.f27600c));
        }
        return i0.a.d(this.f38069c, b10, b11);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (!this.F) {
            i11 = org.telegram.messenger.bi.C(230.0f, AndroidUtilities.statusBarHeight, 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    public void setProgressToGradient(float f7) {
        if (Math.abs(this.f38069c - f7) > 0.001f) {
            this.f38069c = f7;
            a();
            invalidate();
        }
    }

    public void a() {
    }
}
