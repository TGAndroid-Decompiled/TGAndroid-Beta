package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public class kp0 extends View {
    public boolean E;
    public boolean F;
    public int f37473a;
    public final org.telegram.ui.ActionBar.c6 f37474b;
    public float f37475c;
    public boolean d;
    public int e;
    public int f37476f;
    public final org.telegram.ui.Components.j5 h;
    public final org.telegram.ui.Components.j5 f37477n;
    public int f37478r;
    public int f37479s;
    public int v;
    public int f37480w;
    public RadialGradient f37481x;
    public final Paint f37482y;

    public kp0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f37475c = 0.0f;
        org.telegram.ui.Components.es esVar = org.telegram.ui.Components.es.h;
        this.h = new org.telegram.ui.Components.j5(this, 350L, esVar);
        this.f37477n = new org.telegram.ui.Components.j5(this, 350L, esVar);
        this.f37482y = new Paint(1);
        this.f37474b = c6Var;
        this.f37473a = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19880s8, c6Var);
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
        org.telegram.ui.ActionBar.c6 c6Var = this.f37474b;
        if (peerColor == null) {
            this.d = true;
            int w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19880s8, c6Var);
            this.f37476f = w02;
            this.e = w02;
        } else {
            if (c6Var != null) {
                q6 = c6Var.a();
            } else {
                q6 = org.telegram.ui.ActionBar.g6.I.q();
            }
            this.e = peerColor.getBgColor1(q6);
            this.f37476f = peerColor.getBgColor2(q6);
        }
        if (!z10) {
            this.h.a(this.e, true);
            this.f37477n.a(this.f37476f, true);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i10;
        int a2 = this.h.a(this.e, false);
        int a10 = this.f37477n.a(this.f37476f, false);
        RadialGradient radialGradient = this.f37481x;
        Paint paint = this.f37482y;
        if (radialGradient == null || this.f37478r != a2 || this.f37479s != a10 || this.v != getWidth() || this.f37480w != getHeight()) {
            this.v = getWidth();
            this.f37480w = getHeight();
            float f7 = this.v;
            float f10 = this.f37480w;
            this.f37479s = a10;
            this.f37478r = a2;
            RadialGradient radialGradient2 = new RadialGradient(f7 / 2.0f, f10 * 0.4f, AndroidUtilities.distance(0.0f, 0.0f, f7, f10) * 0.75f, new int[]{a10, a2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            this.f37481x = radialGradient2;
            paint.setShader(radialGradient2);
            a();
        }
        if (this.f37475c < 1.0f && !this.E) {
            canvas2 = canvas;
            canvas2.drawColor(this.f37473a);
        } else {
            canvas2 = canvas;
        }
        if (this.E) {
            i10 = 255;
        } else {
            i10 = (int) (this.f37475c * 255.0f);
        }
        paint.setAlpha(i10);
        canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
    }

    public int getActionBarButtonColor() {
        int i10;
        int i11 = org.telegram.ui.ActionBar.g6.f19935v8;
        org.telegram.ui.ActionBar.c6 c6Var = this.f37474b;
        int w02 = org.telegram.ui.ActionBar.g6.w0(i11, c6Var);
        if (this.d) {
            i10 = org.telegram.ui.ActionBar.g6.w0(i11, c6Var);
        } else {
            i10 = -1;
        }
        return i0.a.d(this.f37475c, w02, i10);
    }

    public int getColor() {
        return i0.a.d(this.f37475c, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19880s8, this.f37474b), i0.a.d(0.75f, this.h.f25881c, this.f37477n.f25881c));
    }

    public int getTabsViewBackgroundColor() {
        int b10;
        int b11;
        int i10 = org.telegram.ui.ActionBar.g6.f19880s8;
        org.telegram.ui.ActionBar.c6 c6Var = this.f37474b;
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.w0(i10, c6Var)) > 0.721f) {
            b10 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19935v8, c6Var);
        } else {
            b10 = org.telegram.ui.ActionBar.g6.b(0.08f, -0.08f, org.telegram.ui.ActionBar.g6.w0(i10, c6Var));
        }
        org.telegram.ui.Components.j5 j5Var = this.h;
        int i11 = j5Var.f25881c;
        org.telegram.ui.Components.j5 j5Var2 = this.f37477n;
        if (AndroidUtilities.computePerceivedBrightness(i0.a.d(0.75f, i11, j5Var2.f25881c)) > 0.721f) {
            b11 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19933v6, c6Var);
        } else {
            b11 = org.telegram.ui.ActionBar.g6.b(0.08f, -0.08f, i0.a.d(0.75f, j5Var.f25881c, j5Var2.f25881c));
        }
        return i0.a.d(this.f37475c, b10, b11);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (!this.F) {
            i11 = org.telegram.messenger.sk.C(230.0f, AndroidUtilities.statusBarHeight, 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    public void setProgressToGradient(float f7) {
        if (Math.abs(this.f37475c - f7) > 0.001f) {
            this.f37475c = f7;
            a();
            invalidate();
        }
    }

    public void a() {
    }
}
