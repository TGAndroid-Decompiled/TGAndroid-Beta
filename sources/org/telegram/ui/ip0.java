package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public class ip0 extends View {
    public boolean E;
    public boolean F;
    public int f38957a;
    public final org.telegram.ui.ActionBar.c6 f38958b;
    public float f38959c;
    public boolean d;
    public int f38960e;
    public int f38961f;
    public final org.telegram.ui.Components.j5 h;
    public final org.telegram.ui.Components.j5 f38962n;
    public int f38963r;
    public int f38964s;
    public int v;
    public int f38965w;
    public RadialGradient f38966x;
    public final Paint f38967y;

    public ip0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f38959c = 0.0f;
        org.telegram.ui.Components.js jsVar = org.telegram.ui.Components.js.h;
        this.h = new org.telegram.ui.Components.j5(this, 350L, jsVar);
        this.f38962n = new org.telegram.ui.Components.j5(this, 350L, jsVar);
        this.f38967y = new Paint(1);
        this.f38958b = c6Var;
        this.f38957a = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20839s8, c6Var);
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
        org.telegram.ui.ActionBar.c6 c6Var = this.f38958b;
        if (peerColor == null) {
            this.d = true;
            int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20839s8, c6Var);
            this.f38961f = w02;
            this.f38960e = w02;
        } else {
            if (c6Var != null) {
                q6 = c6Var.a();
            } else {
                q6 = org.telegram.ui.ActionBar.h6.I.q();
            }
            this.f38960e = peerColor.getBgColor1(q6);
            this.f38961f = peerColor.getBgColor2(q6);
        }
        if (!z10) {
            this.h.a(this.f38960e, true);
            this.f38962n.a(this.f38961f, true);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i10;
        int a2 = this.h.a(this.f38960e, false);
        int a10 = this.f38962n.a(this.f38961f, false);
        RadialGradient radialGradient = this.f38966x;
        Paint paint = this.f38967y;
        if (radialGradient == null || this.f38963r != a2 || this.f38964s != a10 || this.v != getWidth() || this.f38965w != getHeight()) {
            this.v = getWidth();
            this.f38965w = getHeight();
            float f7 = this.v;
            float f10 = this.f38965w;
            this.f38964s = a10;
            this.f38963r = a2;
            RadialGradient radialGradient2 = new RadialGradient(f7 / 2.0f, f10 * 0.4f, AndroidUtilities.distance(0.0f, 0.0f, f7, f10) * 0.75f, new int[]{a10, a2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            this.f38966x = radialGradient2;
            paint.setShader(radialGradient2);
            a();
        }
        if (this.f38959c < 1.0f && !this.E) {
            canvas2 = canvas;
            canvas2.drawColor(this.f38957a);
        } else {
            canvas2 = canvas;
        }
        if (this.E) {
            i10 = 255;
        } else {
            i10 = (int) (this.f38959c * 255.0f);
        }
        paint.setAlpha(i10);
        canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
    }

    public int getActionBarButtonColor() {
        int i10;
        int i11 = org.telegram.ui.ActionBar.h6.f20894v8;
        org.telegram.ui.ActionBar.c6 c6Var = this.f38958b;
        int w02 = org.telegram.ui.ActionBar.h6.w0(i11, c6Var);
        if (this.d) {
            i10 = org.telegram.ui.ActionBar.h6.w0(i11, c6Var);
        } else {
            i10 = -1;
        }
        return i0.a.d(this.f38959c, w02, i10);
    }

    public int getColor() {
        return i0.a.d(this.f38959c, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20839s8, this.f38958b), i0.a.d(0.75f, this.h.f27366c, this.f38962n.f27366c));
    }

    public int getTabsViewBackgroundColor() {
        int b10;
        int b11;
        int i10 = org.telegram.ui.ActionBar.h6.f20839s8;
        org.telegram.ui.ActionBar.c6 c6Var = this.f38958b;
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.w0(i10, c6Var)) > 0.721f) {
            b10 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20894v8, c6Var);
        } else {
            b10 = org.telegram.ui.ActionBar.h6.b(0.08f, -0.08f, org.telegram.ui.ActionBar.h6.w0(i10, c6Var));
        }
        org.telegram.ui.Components.j5 j5Var = this.h;
        int i11 = j5Var.f27366c;
        org.telegram.ui.Components.j5 j5Var2 = this.f38962n;
        if (AndroidUtilities.computePerceivedBrightness(i0.a.d(0.75f, i11, j5Var2.f27366c)) > 0.721f) {
            b11 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20892v6, c6Var);
        } else {
            b11 = org.telegram.ui.ActionBar.h6.b(0.08f, -0.08f, i0.a.d(0.75f, j5Var.f27366c, j5Var2.f27366c));
        }
        return i0.a.d(this.f38959c, b10, b11);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (!this.F) {
            i11 = org.telegram.messenger.am.C(230.0f, AndroidUtilities.statusBarHeight, 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    public void setProgressToGradient(float f7) {
        if (Math.abs(this.f38959c - f7) > 0.001f) {
            this.f38959c = f7;
            a();
            invalidate();
        }
    }

    public void a() {
    }
}
