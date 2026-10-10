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
    public int f38111a;
    public final org.telegram.ui.ActionBar.e6 f38112b;
    public float f38113c;
    public boolean d;
    public int f38114e;
    public int f38115f;
    public final org.telegram.ui.Components.j5 h;
    public final org.telegram.ui.Components.j5 f38116n;
    public int f38117r;
    public int f38118s;
    public int v;
    public int f38119w;
    public RadialGradient f38120x;
    public final Paint f38121y;

    public gp0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f38113c = 0.0f;
        org.telegram.ui.Components.is isVar = org.telegram.ui.Components.is.h;
        this.h = new org.telegram.ui.Components.j5(this, 350L, isVar);
        this.f38116n = new org.telegram.ui.Components.j5(this, 350L, isVar);
        this.f38121y = new Paint(1);
        this.f38112b = e6Var;
        this.f38111a = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21079s8, e6Var);
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
        org.telegram.ui.ActionBar.e6 e6Var = this.f38112b;
        if (peerColor == null) {
            this.d = true;
            int w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21079s8, e6Var);
            this.f38115f = w02;
            this.f38114e = w02;
        } else {
            if (e6Var != null) {
                q6 = e6Var.a();
            } else {
                q6 = org.telegram.ui.ActionBar.i6.I.q();
            }
            this.f38114e = peerColor.getBgColor1(q6);
            this.f38115f = peerColor.getBgColor2(q6);
        }
        if (!z10) {
            this.h.a(this.f38114e, true);
            this.f38116n.a(this.f38115f, true);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i10;
        int a2 = this.h.a(this.f38114e, false);
        int a10 = this.f38116n.a(this.f38115f, false);
        RadialGradient radialGradient = this.f38120x;
        Paint paint = this.f38121y;
        if (radialGradient == null || this.f38117r != a2 || this.f38118s != a10 || this.v != getWidth() || this.f38119w != getHeight()) {
            this.v = getWidth();
            this.f38119w = getHeight();
            float f7 = this.v;
            float f10 = this.f38119w;
            this.f38118s = a10;
            this.f38117r = a2;
            RadialGradient radialGradient2 = new RadialGradient(f7 / 2.0f, f10 * 0.4f, AndroidUtilities.distance(0.0f, 0.0f, f7, f10) * 0.75f, new int[]{a10, a2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            this.f38120x = radialGradient2;
            paint.setShader(radialGradient2);
            a();
        }
        if (this.f38113c < 1.0f && !this.E) {
            canvas2 = canvas;
            canvas2.drawColor(this.f38111a);
        } else {
            canvas2 = canvas;
        }
        if (this.E) {
            i10 = 255;
        } else {
            i10 = (int) (this.f38113c * 255.0f);
        }
        paint.setAlpha(i10);
        canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
    }

    public int getActionBarButtonColor() {
        int i10;
        int i11 = org.telegram.ui.ActionBar.i6.f21134v8;
        org.telegram.ui.ActionBar.e6 e6Var = this.f38112b;
        int w02 = org.telegram.ui.ActionBar.i6.w0(i11, e6Var);
        if (this.d) {
            i10 = org.telegram.ui.ActionBar.i6.w0(i11, e6Var);
        } else {
            i10 = -1;
        }
        return i0.a.d(this.f38113c, w02, i10);
    }

    public int getColor() {
        return i0.a.d(this.f38113c, org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21079s8, this.f38112b), i0.a.d(0.75f, this.h.f27552c, this.f38116n.f27552c));
    }

    public int getTabsViewBackgroundColor() {
        int b10;
        int b11;
        int i10 = org.telegram.ui.ActionBar.i6.f21079s8;
        org.telegram.ui.ActionBar.e6 e6Var = this.f38112b;
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.i6.w0(i10, e6Var)) > 0.721f) {
            b10 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21134v8, e6Var);
        } else {
            b10 = org.telegram.ui.ActionBar.i6.b(0.08f, -0.08f, org.telegram.ui.ActionBar.i6.w0(i10, e6Var));
        }
        org.telegram.ui.Components.j5 j5Var = this.h;
        int i11 = j5Var.f27552c;
        org.telegram.ui.Components.j5 j5Var2 = this.f38116n;
        if (AndroidUtilities.computePerceivedBrightness(i0.a.d(0.75f, i11, j5Var2.f27552c)) > 0.721f) {
            b11 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21132v6, e6Var);
        } else {
            b11 = org.telegram.ui.ActionBar.i6.b(0.08f, -0.08f, i0.a.d(0.75f, j5Var.f27552c, j5Var2.f27552c));
        }
        return i0.a.d(this.f38113c, b10, b11);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (!this.F) {
            i11 = org.telegram.messenger.bi.C(230.0f, AndroidUtilities.statusBarHeight, 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    public void setProgressToGradient(float f7) {
        if (Math.abs(this.f38113c - f7) > 0.001f) {
            this.f38113c = f7;
            a();
            invalidate();
        }
    }

    public void a() {
    }
}
