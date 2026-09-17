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
    public int f37107a;
    public final org.telegram.ui.ActionBar.f6 f37108b;
    public float f37109c;
    public boolean d;
    public int f37110e;
    public int f37111f;
    public final org.telegram.ui.Components.h5 h;
    public final org.telegram.ui.Components.h5 f37112n;
    public int f37113r;
    public int f37114s;
    public int v;
    public int f37115w;
    public RadialGradient f37116x;
    public final Paint f37117y;

    public hp0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f37109c = 0.0f;
        org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.h;
        this.h = new org.telegram.ui.Components.h5(this, 350L, prVar);
        this.f37112n = new org.telegram.ui.Components.h5(this, 350L, prVar);
        this.f37117y = new Paint(1);
        this.f37108b = f6Var;
        this.f37107a = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20965s8, f6Var);
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
        org.telegram.ui.ActionBar.f6 f6Var = this.f37108b;
        if (peerColor == null) {
            this.d = true;
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20965s8, f6Var);
            this.f37111f = v02;
            this.f37110e = v02;
        } else {
            if (f6Var != null) {
                q6 = f6Var.a();
            } else {
                q6 = org.telegram.ui.ActionBar.j6.I.q();
            }
            this.f37110e = peerColor.getBgColor1(q6);
            this.f37111f = peerColor.getBgColor2(q6);
        }
        if (!z10) {
            this.h.a(this.f37110e, true);
            this.f37112n.a(this.f37111f, true);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i10;
        int a2 = this.h.a(this.f37110e, false);
        int a10 = this.f37112n.a(this.f37111f, false);
        RadialGradient radialGradient = this.f37116x;
        Paint paint = this.f37117y;
        if (radialGradient == null || this.f37113r != a2 || this.f37114s != a10 || this.v != getWidth() || this.f37115w != getHeight()) {
            this.v = getWidth();
            this.f37115w = getHeight();
            float f7 = this.v;
            float f10 = this.f37115w;
            this.f37114s = a10;
            this.f37113r = a2;
            RadialGradient radialGradient2 = new RadialGradient(f7 / 2.0f, f10 * 0.4f, AndroidUtilities.distance(0.0f, 0.0f, f7, f10) * 0.75f, new int[]{a10, a2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            this.f37116x = radialGradient2;
            paint.setShader(radialGradient2);
            a();
        }
        if (this.f37109c < 1.0f && !this.E) {
            canvas2 = canvas;
            canvas2.drawColor(this.f37107a);
        } else {
            canvas2 = canvas;
        }
        if (this.E) {
            i10 = 255;
        } else {
            i10 = (int) (this.f37109c * 255.0f);
        }
        paint.setAlpha(i10);
        canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
    }

    public int getActionBarButtonColor() {
        int i10;
        int i11 = org.telegram.ui.ActionBar.j6.f21020v8;
        org.telegram.ui.ActionBar.f6 f6Var = this.f37108b;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i11, f6Var);
        if (this.d) {
            i10 = org.telegram.ui.ActionBar.j6.v0(i11, f6Var);
        } else {
            i10 = -1;
        }
        return i0.a.d(this.f37109c, v02, i10);
    }

    public int getColor() {
        return i0.a.d(this.f37109c, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20965s8, this.f37108b), i0.a.d(0.75f, this.h.f26606c, this.f37112n.f26606c));
    }

    public int getTabsViewBackgroundColor() {
        int b10;
        int b11;
        int i10 = org.telegram.ui.ActionBar.j6.f20965s8;
        org.telegram.ui.ActionBar.f6 f6Var = this.f37108b;
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v0(i10, f6Var)) > 0.721f) {
            b10 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f21020v8, f6Var);
        } else {
            b10 = org.telegram.ui.ActionBar.j6.b(0.08f, -0.08f, org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        }
        org.telegram.ui.Components.h5 h5Var = this.h;
        int i11 = h5Var.f26606c;
        org.telegram.ui.Components.h5 h5Var2 = this.f37112n;
        if (AndroidUtilities.computePerceivedBrightness(i0.a.d(0.75f, i11, h5Var2.f26606c)) > 0.721f) {
            b11 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f21018v6, f6Var);
        } else {
            b11 = org.telegram.ui.ActionBar.j6.b(0.08f, -0.08f, i0.a.d(0.75f, h5Var.f26606c, h5Var2.f26606c));
        }
        return i0.a.d(this.f37109c, b10, b11);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (!this.F) {
            i11 = org.telegram.messenger.vl.C(230.0f, AndroidUtilities.statusBarHeight, 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    public void setProgressToGradient(float f7) {
        if (Math.abs(this.f37109c - f7) > 0.001f) {
            this.f37109c = f7;
            a();
            invalidate();
        }
    }

    public void a() {
    }
}
