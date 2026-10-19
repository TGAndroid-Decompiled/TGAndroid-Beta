package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public class oo0 extends View {
    public boolean E;
    public boolean F;
    public int f39936a;
    public final org.telegram.ui.ActionBar.d6 f39937b;
    public float f39938c;
    public boolean d;
    public int e;
    public int f39939f;
    public final org.telegram.ui.Components.i5 h;
    public final org.telegram.ui.Components.i5 f39940n;
    public int f39941r;
    public int f39942s;
    public int v;
    public int f39943w;
    public RadialGradient f39944x;
    public final Paint f39945y;

    public oo0(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f39938c = 0.0f;
        org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.h;
        this.h = new org.telegram.ui.Components.i5(this, 350L, bsVar);
        this.f39940n = new org.telegram.ui.Components.i5(this, 350L, bsVar);
        this.f39945y = new Paint(1);
        this.f39937b = d6Var;
        this.f39936a = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21266s8, d6Var);
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
        org.telegram.ui.ActionBar.d6 d6Var = this.f39937b;
        if (peerColor == null) {
            this.d = true;
            int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21266s8, d6Var);
            this.f39939f = w02;
            this.e = w02;
        } else {
            if (d6Var != null) {
                q6 = d6Var.a();
            } else {
                q6 = org.telegram.ui.ActionBar.h6.I.q();
            }
            this.e = peerColor.getBgColor1(q6);
            this.f39939f = peerColor.getBgColor2(q6);
        }
        if (!z10) {
            this.h.a(this.e, true);
            this.f39940n.a(this.f39939f, true);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i10;
        int a2 = this.h.a(this.e, false);
        int a10 = this.f39940n.a(this.f39939f, false);
        RadialGradient radialGradient = this.f39944x;
        Paint paint = this.f39945y;
        if (radialGradient == null || this.f39941r != a2 || this.f39942s != a10 || this.v != getWidth() || this.f39943w != getHeight()) {
            this.v = getWidth();
            this.f39943w = getHeight();
            float f7 = this.v;
            float f10 = this.f39943w;
            this.f39942s = a10;
            this.f39941r = a2;
            RadialGradient radialGradient2 = new RadialGradient(f7 / 2.0f, f10 * 0.4f, AndroidUtilities.distance(0.0f, 0.0f, f7, f10) * 0.75f, new int[]{a10, a2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            this.f39944x = radialGradient2;
            paint.setShader(radialGradient2);
            a();
        }
        if (this.f39938c < 1.0f && !this.E) {
            canvas2 = canvas;
            canvas2.drawColor(this.f39936a);
        } else {
            canvas2 = canvas;
        }
        if (this.E) {
            i10 = 255;
        } else {
            i10 = (int) (this.f39938c * 255.0f);
        }
        paint.setAlpha(i10);
        canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
    }

    public int getActionBarButtonColor() {
        int i10;
        int i11 = org.telegram.ui.ActionBar.h6.f21322v8;
        org.telegram.ui.ActionBar.d6 d6Var = this.f39937b;
        int w02 = org.telegram.ui.ActionBar.h6.w0(i11, d6Var);
        if (this.d) {
            i10 = org.telegram.ui.ActionBar.h6.w0(i11, d6Var);
        } else {
            i10 = -1;
        }
        return i0.a.f(this.f39938c, w02, i10);
    }

    public int getColor() {
        return i0.a.f(this.f39938c, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21266s8, this.f39937b), i0.a.f(0.75f, this.h.f27072c, this.f39940n.f27072c));
    }

    public int getTabsViewBackgroundColor() {
        int b10;
        int b11;
        int i10 = org.telegram.ui.ActionBar.h6.f21266s8;
        org.telegram.ui.ActionBar.d6 d6Var = this.f39937b;
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.w0(i10, d6Var)) > 0.721f) {
            b10 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21322v8, d6Var);
        } else {
            b10 = org.telegram.ui.ActionBar.h6.b(0.08f, -0.08f, org.telegram.ui.ActionBar.h6.w0(i10, d6Var));
        }
        org.telegram.ui.Components.i5 i5Var = this.h;
        int i11 = i5Var.f27072c;
        org.telegram.ui.Components.i5 i5Var2 = this.f39940n;
        if (AndroidUtilities.computePerceivedBrightness(i0.a.f(0.75f, i11, i5Var2.f27072c)) > 0.721f) {
            b11 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21320v6, d6Var);
        } else {
            b11 = org.telegram.ui.ActionBar.h6.b(0.08f, -0.08f, i0.a.f(0.75f, i5Var.f27072c, i5Var2.f27072c));
        }
        return i0.a.f(this.f39938c, b10, b11);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (!this.F) {
            i11 = org.telegram.messenger.kk.C(230.0f, AndroidUtilities.statusBarHeight, 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    public void setProgressToGradient(float f7) {
        if (Math.abs(this.f39938c - f7) > 0.001f) {
            this.f39938c = f7;
            a();
            invalidate();
        }
    }

    public void a() {
    }
}
