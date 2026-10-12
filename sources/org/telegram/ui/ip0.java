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
    public int f38959a;
    public final org.telegram.ui.ActionBar.c6 f38960b;
    public float f38961c;
    public boolean d;
    public int f38962e;
    public int f38963f;
    public final org.telegram.ui.Components.j5 h;
    public final org.telegram.ui.Components.j5 f38964n;
    public int f38965r;
    public int f38966s;
    public int v;
    public int f38967w;
    public RadialGradient f38968x;
    public final Paint f38969y;

    public ip0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f38961c = 0.0f;
        org.telegram.ui.Components.js jsVar = org.telegram.ui.Components.js.h;
        this.h = new org.telegram.ui.Components.j5(this, 350L, jsVar);
        this.f38964n = new org.telegram.ui.Components.j5(this, 350L, jsVar);
        this.f38969y = new Paint(1);
        this.f38960b = c6Var;
        this.f38959a = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20840s8, c6Var);
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
        org.telegram.ui.ActionBar.c6 c6Var = this.f38960b;
        if (peerColor == null) {
            this.d = true;
            int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20840s8, c6Var);
            this.f38963f = w02;
            this.f38962e = w02;
        } else {
            if (c6Var != null) {
                q6 = c6Var.a();
            } else {
                q6 = org.telegram.ui.ActionBar.h6.I.q();
            }
            this.f38962e = peerColor.getBgColor1(q6);
            this.f38963f = peerColor.getBgColor2(q6);
        }
        if (!z10) {
            this.h.a(this.f38962e, true);
            this.f38964n.a(this.f38963f, true);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i10;
        int a2 = this.h.a(this.f38962e, false);
        int a10 = this.f38964n.a(this.f38963f, false);
        RadialGradient radialGradient = this.f38968x;
        Paint paint = this.f38969y;
        if (radialGradient == null || this.f38965r != a2 || this.f38966s != a10 || this.v != getWidth() || this.f38967w != getHeight()) {
            this.v = getWidth();
            this.f38967w = getHeight();
            float f7 = this.v;
            float f10 = this.f38967w;
            this.f38966s = a10;
            this.f38965r = a2;
            RadialGradient radialGradient2 = new RadialGradient(f7 / 2.0f, f10 * 0.4f, AndroidUtilities.distance(0.0f, 0.0f, f7, f10) * 0.75f, new int[]{a10, a2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            this.f38968x = radialGradient2;
            paint.setShader(radialGradient2);
            a();
        }
        if (this.f38961c < 1.0f && !this.E) {
            canvas2 = canvas;
            canvas2.drawColor(this.f38959a);
        } else {
            canvas2 = canvas;
        }
        if (this.E) {
            i10 = 255;
        } else {
            i10 = (int) (this.f38961c * 255.0f);
        }
        paint.setAlpha(i10);
        canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
    }

    public int getActionBarButtonColor() {
        int i10;
        int i11 = org.telegram.ui.ActionBar.h6.f20895v8;
        org.telegram.ui.ActionBar.c6 c6Var = this.f38960b;
        int w02 = org.telegram.ui.ActionBar.h6.w0(i11, c6Var);
        if (this.d) {
            i10 = org.telegram.ui.ActionBar.h6.w0(i11, c6Var);
        } else {
            i10 = -1;
        }
        return i0.a.d(this.f38961c, w02, i10);
    }

    public int getColor() {
        return i0.a.d(this.f38961c, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20840s8, this.f38960b), i0.a.d(0.75f, this.h.f27360c, this.f38964n.f27360c));
    }

    public int getTabsViewBackgroundColor() {
        int b10;
        int b11;
        int i10 = org.telegram.ui.ActionBar.h6.f20840s8;
        org.telegram.ui.ActionBar.c6 c6Var = this.f38960b;
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.w0(i10, c6Var)) > 0.721f) {
            b10 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20895v8, c6Var);
        } else {
            b10 = org.telegram.ui.ActionBar.h6.b(0.08f, -0.08f, org.telegram.ui.ActionBar.h6.w0(i10, c6Var));
        }
        org.telegram.ui.Components.j5 j5Var = this.h;
        int i11 = j5Var.f27360c;
        org.telegram.ui.Components.j5 j5Var2 = this.f38964n;
        if (AndroidUtilities.computePerceivedBrightness(i0.a.d(0.75f, i11, j5Var2.f27360c)) > 0.721f) {
            b11 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20893v6, c6Var);
        } else {
            b11 = org.telegram.ui.ActionBar.h6.b(0.08f, -0.08f, i0.a.d(0.75f, j5Var.f27360c, j5Var2.f27360c));
        }
        return i0.a.d(this.f38961c, b10, b11);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (!this.F) {
            i11 = org.telegram.messenger.am.C(230.0f, AndroidUtilities.statusBarHeight, 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    public void setProgressToGradient(float f7) {
        if (Math.abs(this.f38961c - f7) > 0.001f) {
            this.f38961c = f7;
            a();
            invalidate();
        }
    }

    public void a() {
    }
}
