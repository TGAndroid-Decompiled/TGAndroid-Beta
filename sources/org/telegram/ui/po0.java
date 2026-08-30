package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public class po0 extends View {
    public boolean B;
    public int f37415a;
    public final org.telegram.ui.ActionBar.f6 f37416b;
    public float f37417c;
    public boolean d;
    public int e;
    public int f37418f;
    public final org.telegram.ui.Components.c5 h;
    public final org.telegram.ui.Components.c5 f37419n;
    public int f37420r;
    public int f37421s;
    public int v;
    public int f37422w;
    public RadialGradient f37423x;
    public final Paint f37424y;

    public po0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f37417c = 0.0f;
        org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.h;
        this.h = new org.telegram.ui.Components.c5(this, 350L, nrVar);
        this.f37419n = new org.telegram.ui.Components.c5(this, 350L, nrVar);
        this.f37424y = new Paint(1);
        this.f37416b = f6Var;
        this.f37415a = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20176s8, f6Var);
        b(-1, -1, false);
    }

    public final void b(int i10, int i11, boolean z4) {
        MessagesController.PeerColors peerColors;
        MessagesController.PeerColor peerColor = null;
        if (i11 >= 0 && i10 >= 0 && (peerColors = MessagesController.getInstance(i10).profilePeerColors) != null) {
            peerColor = peerColors.getColor(i11);
        }
        c(peerColor, z4);
    }

    public final void c(MessagesController.PeerColor peerColor, boolean z4) {
        boolean q10;
        this.d = false;
        org.telegram.ui.ActionBar.f6 f6Var = this.f37416b;
        if (peerColor == null) {
            this.d = true;
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20176s8, f6Var);
            this.f37418f = v02;
            this.e = v02;
        } else {
            if (f6Var != null) {
                q10 = f6Var.a();
            } else {
                q10 = org.telegram.ui.ActionBar.j6.I.q();
            }
            this.e = peerColor.getBgColor1(q10);
            this.f37418f = peerColor.getBgColor2(q10);
        }
        if (!z4) {
            this.h.a(this.e, true);
            this.f37419n.a(this.f37418f, true);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int a2 = this.h.a(this.e, false);
        int a10 = this.f37419n.a(this.f37418f, false);
        RadialGradient radialGradient = this.f37423x;
        Paint paint = this.f37424y;
        if (radialGradient == null || this.f37420r != a2 || this.f37421s != a10 || this.v != getWidth() || this.f37422w != getHeight()) {
            this.v = getWidth();
            this.f37422w = getHeight();
            int i10 = this.v;
            int i11 = this.f37422w;
            this.f37421s = a10;
            this.f37420r = a2;
            RadialGradient radialGradient2 = new RadialGradient(i10 / 2.0f, i11 * 0.4f, AndroidUtilities.distance(0.0f, 0.0f, i10, i11) * 0.75f, new int[]{a10, a2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            this.f37423x = radialGradient2;
            paint.setShader(radialGradient2);
            a();
        }
        if (this.f37417c < 1.0f) {
            canvas2 = canvas;
            canvas2.drawColor(this.f37415a);
        } else {
            canvas2 = canvas;
        }
        float f10 = this.f37417c;
        if (f10 > 0.0f) {
            paint.setAlpha((int) (f10 * 255.0f));
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        }
    }

    public int getActionBarButtonColor() {
        int i10;
        int i11 = org.telegram.ui.ActionBar.j6.f20227v8;
        org.telegram.ui.ActionBar.f6 f6Var = this.f37416b;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i11, f6Var);
        if (this.d) {
            i10 = org.telegram.ui.ActionBar.j6.v0(i11, f6Var);
        } else {
            i10 = -1;
        }
        return i0.a.d(this.f37417c, v02, i10);
    }

    public int getColor() {
        return i0.a.d(this.f37417c, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20176s8, this.f37416b), i0.a.d(0.75f, this.h.f23838c, this.f37419n.f23838c));
    }

    public int getTabsViewBackgroundColor() {
        int b10;
        int b11;
        int i10 = org.telegram.ui.ActionBar.j6.f20176s8;
        org.telegram.ui.ActionBar.f6 f6Var = this.f37416b;
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v0(i10, f6Var)) > 0.721f) {
            b10 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20227v8, f6Var);
        } else {
            b10 = org.telegram.ui.ActionBar.j6.b(0.08f, -0.08f, org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        }
        org.telegram.ui.Components.c5 c5Var = this.h;
        int i11 = c5Var.f23838c;
        org.telegram.ui.Components.c5 c5Var2 = this.f37419n;
        if (AndroidUtilities.computePerceivedBrightness(i0.a.d(0.75f, i11, c5Var2.f23838c)) > 0.721f) {
            b11 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20225v6, f6Var);
        } else {
            b11 = org.telegram.ui.ActionBar.j6.b(0.08f, -0.08f, i0.a.d(0.75f, c5Var.f23838c, c5Var2.f23838c));
        }
        return i0.a.d(this.f37417c, b10, b11);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (!this.B) {
            i11 = b.B(230.0f, AndroidUtilities.statusBarHeight, 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    public void setProgressToGradient(float f10) {
        if (Math.abs(this.f37417c - f10) > 0.001f) {
            this.f37417c = f10;
            a();
            invalidate();
        }
    }

    public void a() {
    }
}
