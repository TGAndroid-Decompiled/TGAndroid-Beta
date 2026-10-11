package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public class fp0 extends View {
    public boolean E;
    public boolean F;
    public int f37729a;
    public final org.telegram.ui.ActionBar.d6 f37730b;
    public float f37731c;
    public boolean d;
    public int f37732e;
    public int f37733f;
    public final org.telegram.ui.Components.j5 h;
    public final org.telegram.ui.Components.j5 f37734n;
    public int f37735r;
    public int f37736s;
    public int v;
    public int f37737w;
    public RadialGradient f37738x;
    public final Paint f37739y;

    public fp0(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f37731c = 0.0f;
        org.telegram.ui.Components.is isVar = org.telegram.ui.Components.is.h;
        this.h = new org.telegram.ui.Components.j5(this, 350L, isVar);
        this.f37734n = new org.telegram.ui.Components.j5(this, 350L, isVar);
        this.f37739y = new Paint(1);
        this.f37730b = d6Var;
        this.f37729a = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21065s8, d6Var);
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
        org.telegram.ui.ActionBar.d6 d6Var = this.f37730b;
        if (peerColor == null) {
            this.d = true;
            int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21065s8, d6Var);
            this.f37733f = w02;
            this.f37732e = w02;
        } else {
            if (d6Var != null) {
                q6 = d6Var.a();
            } else {
                q6 = org.telegram.ui.ActionBar.h6.I.q();
            }
            this.f37732e = peerColor.getBgColor1(q6);
            this.f37733f = peerColor.getBgColor2(q6);
        }
        if (!z10) {
            this.h.a(this.f37732e, true);
            this.f37734n.a(this.f37733f, true);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i10;
        int a2 = this.h.a(this.f37732e, false);
        int a10 = this.f37734n.a(this.f37733f, false);
        RadialGradient radialGradient = this.f37738x;
        Paint paint = this.f37739y;
        if (radialGradient == null || this.f37735r != a2 || this.f37736s != a10 || this.v != getWidth() || this.f37737w != getHeight()) {
            this.v = getWidth();
            this.f37737w = getHeight();
            float f7 = this.v;
            float f10 = this.f37737w;
            this.f37736s = a10;
            this.f37735r = a2;
            RadialGradient radialGradient2 = new RadialGradient(f7 / 2.0f, f10 * 0.4f, AndroidUtilities.distance(0.0f, 0.0f, f7, f10) * 0.75f, new int[]{a10, a2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            this.f37738x = radialGradient2;
            paint.setShader(radialGradient2);
            a();
        }
        if (this.f37731c < 1.0f && !this.E) {
            canvas2 = canvas;
            canvas2.drawColor(this.f37729a);
        } else {
            canvas2 = canvas;
        }
        if (this.E) {
            i10 = 255;
        } else {
            i10 = (int) (this.f37731c * 255.0f);
        }
        paint.setAlpha(i10);
        canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
    }

    public int getActionBarButtonColor() {
        int i10;
        int i11 = org.telegram.ui.ActionBar.h6.f21120v8;
        org.telegram.ui.ActionBar.d6 d6Var = this.f37730b;
        int w02 = org.telegram.ui.ActionBar.h6.w0(i11, d6Var);
        if (this.d) {
            i10 = org.telegram.ui.ActionBar.h6.w0(i11, d6Var);
        } else {
            i10 = -1;
        }
        return i0.a.d(this.f37731c, w02, i10);
    }

    public int getColor() {
        return i0.a.d(this.f37731c, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21065s8, this.f37730b), i0.a.d(0.75f, this.h.f27563c, this.f37734n.f27563c));
    }

    public int getTabsViewBackgroundColor() {
        int b10;
        int b11;
        int i10 = org.telegram.ui.ActionBar.h6.f21065s8;
        org.telegram.ui.ActionBar.d6 d6Var = this.f37730b;
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.w0(i10, d6Var)) > 0.721f) {
            b10 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21120v8, d6Var);
        } else {
            b10 = org.telegram.ui.ActionBar.h6.b(0.08f, -0.08f, org.telegram.ui.ActionBar.h6.w0(i10, d6Var));
        }
        org.telegram.ui.Components.j5 j5Var = this.h;
        int i11 = j5Var.f27563c;
        org.telegram.ui.Components.j5 j5Var2 = this.f37734n;
        if (AndroidUtilities.computePerceivedBrightness(i0.a.d(0.75f, i11, j5Var2.f27563c)) > 0.721f) {
            b11 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21118v6, d6Var);
        } else {
            b11 = org.telegram.ui.ActionBar.h6.b(0.08f, -0.08f, i0.a.d(0.75f, j5Var.f27563c, j5Var2.f27563c));
        }
        return i0.a.d(this.f37731c, b10, b11);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (!this.F) {
            i11 = org.telegram.messenger.ai.C(230.0f, AndroidUtilities.statusBarHeight, 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    public void setProgressToGradient(float f7) {
        if (Math.abs(this.f37731c - f7) > 0.001f) {
            this.f37731c = f7;
            a();
            invalidate();
        }
    }

    public void a() {
    }
}
