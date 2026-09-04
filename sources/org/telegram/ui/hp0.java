package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public class hp0 extends View {
    public boolean E;
    public boolean F;
    public int f37079a;
    public final org.telegram.ui.ActionBar.f6 f37080b;
    public float f37081c;
    public boolean d;
    public int f37082e;
    public int f37083f;
    public final org.telegram.ui.Components.h5 h;
    public final org.telegram.ui.Components.h5 f37084n;
    public int f37085r;
    public int f37086s;
    public int v;
    public int f37087w;
    public RadialGradient f37088x;
    public final Paint f37089y;

    public hp0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f37081c = 0.0f;
        org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.h;
        this.h = new org.telegram.ui.Components.h5(this, 350L, prVar);
        this.f37084n = new org.telegram.ui.Components.h5(this, 350L, prVar);
        this.f37089y = new Paint(1);
        this.f37080b = f6Var;
        this.f37079a = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20937s8, f6Var);
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
        org.telegram.ui.ActionBar.f6 f6Var = this.f37080b;
        if (peerColor == null) {
            this.d = true;
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20937s8, f6Var);
            this.f37083f = v02;
            this.f37082e = v02;
        } else {
            if (f6Var != null) {
                q6 = f6Var.a();
            } else {
                q6 = org.telegram.ui.ActionBar.j6.I.q();
            }
            this.f37082e = peerColor.getBgColor1(q6);
            this.f37083f = peerColor.getBgColor2(q6);
        }
        if (!z10) {
            this.h.a(this.f37082e, true);
            this.f37084n.a(this.f37083f, true);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i10;
        int a2 = this.h.a(this.f37082e, false);
        int a10 = this.f37084n.a(this.f37083f, false);
        RadialGradient radialGradient = this.f37088x;
        Paint paint = this.f37089y;
        if (radialGradient == null || this.f37085r != a2 || this.f37086s != a10 || this.v != getWidth() || this.f37087w != getHeight()) {
            this.v = getWidth();
            this.f37087w = getHeight();
            float f7 = this.v;
            float f10 = this.f37087w;
            this.f37086s = a10;
            this.f37085r = a2;
            RadialGradient radialGradient2 = new RadialGradient(f7 / 2.0f, f10 * 0.4f, AndroidUtilities.distance(0.0f, 0.0f, f7, f10) * 0.75f, new int[]{a10, a2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            this.f37088x = radialGradient2;
            paint.setShader(radialGradient2);
            a();
        }
        if (this.f37081c < 1.0f && !this.E) {
            canvas2 = canvas;
            canvas2.drawColor(this.f37079a);
        } else {
            canvas2 = canvas;
        }
        if (this.E) {
            i10 = 255;
        } else {
            i10 = (int) (this.f37081c * 255.0f);
        }
        paint.setAlpha(i10);
        canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
    }

    public int getActionBarButtonColor() {
        int i10;
        int i11 = org.telegram.ui.ActionBar.j6.f20992v8;
        org.telegram.ui.ActionBar.f6 f6Var = this.f37080b;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i11, f6Var);
        if (this.d) {
            i10 = org.telegram.ui.ActionBar.j6.v0(i11, f6Var);
        } else {
            i10 = -1;
        }
        return i0.a.d(this.f37081c, v02, i10);
    }

    public int getColor() {
        return i0.a.d(this.f37081c, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20937s8, this.f37080b), i0.a.d(0.75f, this.h.f26578c, this.f37084n.f26578c));
    }

    public int getTabsViewBackgroundColor() {
        int b10;
        int b11;
        int i10 = org.telegram.ui.ActionBar.j6.f20937s8;
        org.telegram.ui.ActionBar.f6 f6Var = this.f37080b;
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v0(i10, f6Var)) > 0.721f) {
            b10 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20992v8, f6Var);
        } else {
            b10 = org.telegram.ui.ActionBar.j6.b(0.08f, -0.08f, org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        }
        org.telegram.ui.Components.h5 h5Var = this.h;
        int i11 = h5Var.f26578c;
        org.telegram.ui.Components.h5 h5Var2 = this.f37084n;
        if (AndroidUtilities.computePerceivedBrightness(i0.a.d(0.75f, i11, h5Var2.f26578c)) > 0.721f) {
            b11 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20990v6, f6Var);
        } else {
            b11 = org.telegram.ui.ActionBar.j6.b(0.08f, -0.08f, i0.a.d(0.75f, h5Var.f26578c, h5Var2.f26578c));
        }
        return i0.a.d(this.f37081c, b10, b11);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (!this.F) {
            i11 = org.telegram.messenger.wl.C(230.0f, AndroidUtilities.statusBarHeight, 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    public void setProgressToGradient(float f7) {
        if (Math.abs(this.f37081c - f7) > 0.001f) {
            this.f37081c = f7;
            a();
            invalidate();
        }
    }

    public void a() {
    }
}
