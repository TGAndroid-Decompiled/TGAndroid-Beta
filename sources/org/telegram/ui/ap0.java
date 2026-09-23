package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public class ap0 extends View {
    public boolean E;
    public boolean F;
    public int f31848a;
    public final org.telegram.ui.ActionBar.d6 f31849b;
    public float f31850c;
    public boolean d;
    public int e;
    public int f31851f;
    public final org.telegram.ui.Components.h5 h;
    public final org.telegram.ui.Components.h5 f31852n;
    public int f31853r;
    public int f31854s;
    public int v;
    public int f31855w;
    public RadialGradient f31856x;
    public final Paint f31857y;

    public ap0(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f31850c = 0.0f;
        org.telegram.ui.Components.rr rrVar = org.telegram.ui.Components.rr.h;
        this.h = new org.telegram.ui.Components.h5(this, 350L, rrVar);
        this.f31852n = new org.telegram.ui.Components.h5(this, 350L, rrVar);
        this.f31857y = new Paint(1);
        this.f31849b = d6Var;
        this.f31848a = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19065s8, d6Var);
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
        org.telegram.ui.ActionBar.d6 d6Var = this.f31849b;
        if (peerColor == null) {
            this.d = true;
            int v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19065s8, d6Var);
            this.f31851f = v02;
            this.e = v02;
        } else {
            if (d6Var != null) {
                q6 = d6Var.a();
            } else {
                q6 = org.telegram.ui.ActionBar.h6.I.q();
            }
            this.e = peerColor.getBgColor1(q6);
            this.f31851f = peerColor.getBgColor2(q6);
        }
        if (!z10) {
            this.h.a(this.e, true);
            this.f31852n.a(this.f31851f, true);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i10;
        int a2 = this.h.a(this.e, false);
        int a10 = this.f31852n.a(this.f31851f, false);
        RadialGradient radialGradient = this.f31856x;
        Paint paint = this.f31857y;
        if (radialGradient == null || this.f31853r != a2 || this.f31854s != a10 || this.v != getWidth() || this.f31855w != getHeight()) {
            this.v = getWidth();
            this.f31855w = getHeight();
            float f7 = this.v;
            float f10 = this.f31855w;
            this.f31854s = a10;
            this.f31853r = a2;
            RadialGradient radialGradient2 = new RadialGradient(f7 / 2.0f, f10 * 0.4f, AndroidUtilities.distance(0.0f, 0.0f, f7, f10) * 0.75f, new int[]{a10, a2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            this.f31856x = radialGradient2;
            paint.setShader(radialGradient2);
            a();
        }
        if (this.f31850c < 1.0f && !this.E) {
            canvas2 = canvas;
            canvas2.drawColor(this.f31848a);
        } else {
            canvas2 = canvas;
        }
        if (this.E) {
            i10 = 255;
        } else {
            i10 = (int) (this.f31850c * 255.0f);
        }
        paint.setAlpha(i10);
        canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
    }

    public int getActionBarButtonColor() {
        int i10;
        int i11 = org.telegram.ui.ActionBar.h6.f19120v8;
        org.telegram.ui.ActionBar.d6 d6Var = this.f31849b;
        int v02 = org.telegram.ui.ActionBar.h6.v0(i11, d6Var);
        if (this.d) {
            i10 = org.telegram.ui.ActionBar.h6.v0(i11, d6Var);
        } else {
            i10 = -1;
        }
        return i0.a.d(this.f31850c, v02, i10);
    }

    public int getColor() {
        return i0.a.d(this.f31850c, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19065s8, this.f31849b), i0.a.d(0.75f, this.h.f24496c, this.f31852n.f24496c));
    }

    public int getTabsViewBackgroundColor() {
        int b10;
        int b11;
        int i10 = org.telegram.ui.ActionBar.h6.f19065s8;
        org.telegram.ui.ActionBar.d6 d6Var = this.f31849b;
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.v0(i10, d6Var)) > 0.721f) {
            b10 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19120v8, d6Var);
        } else {
            b10 = org.telegram.ui.ActionBar.h6.b(0.08f, -0.08f, org.telegram.ui.ActionBar.h6.v0(i10, d6Var));
        }
        org.telegram.ui.Components.h5 h5Var = this.h;
        int i11 = h5Var.f24496c;
        org.telegram.ui.Components.h5 h5Var2 = this.f31852n;
        if (AndroidUtilities.computePerceivedBrightness(i0.a.d(0.75f, i11, h5Var2.f24496c)) > 0.721f) {
            b11 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19118v6, d6Var);
        } else {
            b11 = org.telegram.ui.ActionBar.h6.b(0.08f, -0.08f, i0.a.d(0.75f, h5Var.f24496c, h5Var2.f24496c));
        }
        return i0.a.d(this.f31850c, b10, b11);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (!this.F) {
            i11 = org.telegram.messenger.ul.C(230.0f, AndroidUtilities.statusBarHeight, 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    public void setProgressToGradient(float f7) {
        if (Math.abs(this.f31850c - f7) > 0.001f) {
            this.f31850c = f7;
            a();
            invalidate();
        }
    }

    public void a() {
    }
}
