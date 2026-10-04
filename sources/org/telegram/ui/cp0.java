package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public class cp0 extends View {
    public boolean E;
    public boolean F;
    public int f35518a;
    public final org.telegram.ui.ActionBar.d6 f35519b;
    public float f35520c;
    public boolean d;
    public int f35521e;
    public int f35522f;
    public final org.telegram.ui.Components.h5 h;
    public final org.telegram.ui.Components.h5 f35523n;
    public int f35524r;
    public int f35525s;
    public int v;
    public int f35526w;
    public RadialGradient f35527x;
    public final Paint f35528y;

    public cp0(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f35520c = 0.0f;
        org.telegram.ui.Components.tr trVar = org.telegram.ui.Components.tr.h;
        this.h = new org.telegram.ui.Components.h5(this, 350L, trVar);
        this.f35523n = new org.telegram.ui.Components.h5(this, 350L, trVar);
        this.f35528y = new Paint(1);
        this.f35519b = d6Var;
        this.f35518a = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21099s8, d6Var);
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
        org.telegram.ui.ActionBar.d6 d6Var = this.f35519b;
        if (peerColor == null) {
            this.d = true;
            int v02 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21099s8, d6Var);
            this.f35522f = v02;
            this.f35521e = v02;
        } else {
            if (d6Var != null) {
                q6 = d6Var.a();
            } else {
                q6 = org.telegram.ui.ActionBar.i6.I.q();
            }
            this.f35521e = peerColor.getBgColor1(q6);
            this.f35522f = peerColor.getBgColor2(q6);
        }
        if (!z10) {
            this.h.a(this.f35521e, true);
            this.f35523n.a(this.f35522f, true);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i10;
        int a2 = this.h.a(this.f35521e, false);
        int a10 = this.f35523n.a(this.f35522f, false);
        RadialGradient radialGradient = this.f35527x;
        Paint paint = this.f35528y;
        if (radialGradient == null || this.f35524r != a2 || this.f35525s != a10 || this.v != getWidth() || this.f35526w != getHeight()) {
            this.v = getWidth();
            this.f35526w = getHeight();
            float f7 = this.v;
            float f10 = this.f35526w;
            this.f35525s = a10;
            this.f35524r = a2;
            RadialGradient radialGradient2 = new RadialGradient(f7 / 2.0f, f10 * 0.4f, AndroidUtilities.distance(0.0f, 0.0f, f7, f10) * 0.75f, new int[]{a10, a2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            this.f35527x = radialGradient2;
            paint.setShader(radialGradient2);
            a();
        }
        if (this.f35520c < 1.0f && !this.E) {
            canvas2 = canvas;
            canvas2.drawColor(this.f35518a);
        } else {
            canvas2 = canvas;
        }
        if (this.E) {
            i10 = 255;
        } else {
            i10 = (int) (this.f35520c * 255.0f);
        }
        paint.setAlpha(i10);
        canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
    }

    public int getActionBarButtonColor() {
        int i10;
        int i11 = org.telegram.ui.ActionBar.i6.f21154v8;
        org.telegram.ui.ActionBar.d6 d6Var = this.f35519b;
        int v02 = org.telegram.ui.ActionBar.i6.v0(i11, d6Var);
        if (this.d) {
            i10 = org.telegram.ui.ActionBar.i6.v0(i11, d6Var);
        } else {
            i10 = -1;
        }
        return i0.a.d(this.f35520c, v02, i10);
    }

    public int getColor() {
        return i0.a.d(this.f35520c, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21099s8, this.f35519b), i0.a.d(0.75f, this.h.f27011c, this.f35523n.f27011c));
    }

    public int getTabsViewBackgroundColor() {
        int b10;
        int b11;
        int i10 = org.telegram.ui.ActionBar.i6.f21099s8;
        org.telegram.ui.ActionBar.d6 d6Var = this.f35519b;
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.i6.v0(i10, d6Var)) > 0.721f) {
            b10 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21154v8, d6Var);
        } else {
            b10 = org.telegram.ui.ActionBar.i6.b(0.08f, -0.08f, org.telegram.ui.ActionBar.i6.v0(i10, d6Var));
        }
        org.telegram.ui.Components.h5 h5Var = this.h;
        int i11 = h5Var.f27011c;
        org.telegram.ui.Components.h5 h5Var2 = this.f35523n;
        if (AndroidUtilities.computePerceivedBrightness(i0.a.d(0.75f, i11, h5Var2.f27011c)) > 0.721f) {
            b11 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21152v6, d6Var);
        } else {
            b11 = org.telegram.ui.ActionBar.i6.b(0.08f, -0.08f, i0.a.d(0.75f, h5Var.f27011c, h5Var2.f27011c));
        }
        return i0.a.d(this.f35520c, b10, b11);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (!this.F) {
            i11 = org.telegram.messenger.ok.B(230.0f, AndroidUtilities.statusBarHeight, 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    public void setProgressToGradient(float f7) {
        if (Math.abs(this.f35520c - f7) > 0.001f) {
            this.f35520c = f7;
            a();
            invalidate();
        }
    }

    public void a() {
    }
}
