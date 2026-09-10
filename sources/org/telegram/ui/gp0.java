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
    public int f33149a;
    public final org.telegram.ui.ActionBar.f6 f33150b;
    public float f33151c;
    public boolean d;
    public int e;
    public int f33152f;
    public final org.telegram.ui.Components.g5 h;
    public final org.telegram.ui.Components.g5 f33153n;
    public int f33154r;
    public int f33155s;
    public int v;
    public int f33156w;
    public RadialGradient f33157x;
    public final Paint f33158y;

    public gp0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f33151c = 0.0f;
        org.telegram.ui.Components.wr wrVar = org.telegram.ui.Components.wr.h;
        this.h = new org.telegram.ui.Components.g5(this, 350L, wrVar);
        this.f33153n = new org.telegram.ui.Components.g5(this, 350L, wrVar);
        this.f33158y = new Paint(1);
        this.f33150b = f6Var;
        this.f33149a = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18201s8, f6Var);
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
        org.telegram.ui.ActionBar.f6 f6Var = this.f33150b;
        if (peerColor == null) {
            this.d = true;
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18201s8, f6Var);
            this.f33152f = v02;
            this.e = v02;
        } else {
            if (f6Var != null) {
                q6 = f6Var.a();
            } else {
                q6 = org.telegram.ui.ActionBar.j6.I.q();
            }
            this.e = peerColor.getBgColor1(q6);
            this.f33152f = peerColor.getBgColor2(q6);
        }
        if (!z10) {
            this.h.a(this.e, true);
            this.f33153n.a(this.f33152f, true);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i10;
        int a2 = this.h.a(this.e, false);
        int a10 = this.f33153n.a(this.f33152f, false);
        RadialGradient radialGradient = this.f33157x;
        Paint paint = this.f33158y;
        if (radialGradient == null || this.f33154r != a2 || this.f33155s != a10 || this.v != getWidth() || this.f33156w != getHeight()) {
            this.v = getWidth();
            this.f33156w = getHeight();
            float f7 = this.v;
            float f10 = this.f33156w;
            this.f33155s = a10;
            this.f33154r = a2;
            RadialGradient radialGradient2 = new RadialGradient(f7 / 2.0f, f10 * 0.4f, AndroidUtilities.distance(0.0f, 0.0f, f7, f10) * 0.75f, new int[]{a10, a2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            this.f33157x = radialGradient2;
            paint.setShader(radialGradient2);
            a();
        }
        if (this.f33151c < 1.0f && !this.E) {
            canvas2 = canvas;
            canvas2.drawColor(this.f33149a);
        } else {
            canvas2 = canvas;
        }
        if (this.E) {
            i10 = 255;
        } else {
            i10 = (int) (this.f33151c * 255.0f);
        }
        paint.setAlpha(i10);
        canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
    }

    public int getActionBarButtonColor() {
        int i10;
        int i11 = org.telegram.ui.ActionBar.j6.f18256v8;
        org.telegram.ui.ActionBar.f6 f6Var = this.f33150b;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i11, f6Var);
        if (this.d) {
            i10 = org.telegram.ui.ActionBar.j6.v0(i11, f6Var);
        } else {
            i10 = -1;
        }
        return i0.a.d(this.f33151c, v02, i10);
    }

    public int getColor() {
        return i0.a.d(this.f33151c, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18201s8, this.f33150b), i0.a.d(0.75f, this.h.f23238c, this.f33153n.f23238c));
    }

    public int getTabsViewBackgroundColor() {
        int b10;
        int b11;
        int i10 = org.telegram.ui.ActionBar.j6.f18201s8;
        org.telegram.ui.ActionBar.f6 f6Var = this.f33150b;
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v0(i10, f6Var)) > 0.721f) {
            b10 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18256v8, f6Var);
        } else {
            b10 = org.telegram.ui.ActionBar.j6.b(0.08f, -0.08f, org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        }
        org.telegram.ui.Components.g5 g5Var = this.h;
        int i11 = g5Var.f23238c;
        org.telegram.ui.Components.g5 g5Var2 = this.f33153n;
        if (AndroidUtilities.computePerceivedBrightness(i0.a.d(0.75f, i11, g5Var2.f23238c)) > 0.721f) {
            b11 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18254v6, f6Var);
        } else {
            b11 = org.telegram.ui.ActionBar.j6.b(0.08f, -0.08f, i0.a.d(0.75f, g5Var.f23238c, g5Var2.f23238c));
        }
        return i0.a.d(this.f33151c, b10, b11);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (!this.F) {
            i11 = org.telegram.messenger.em.C(230.0f, AndroidUtilities.statusBarHeight, 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    public void setProgressToGradient(float f7) {
        if (Math.abs(this.f33151c - f7) > 0.001f) {
            this.f33151c = f7;
            a();
            invalidate();
        }
    }

    public void a() {
    }
}
