package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;

public class jo0 extends View {
    public boolean A;

    public int f39439a;

    public final org.telegram.ui.ActionBar.c6 f39440b;

    public float f39441c;
    public boolean d;

    public int f39442e;

    public int f39443f;
    public final org.telegram.ui.Components.b5 h;

    public final org.telegram.ui.Components.b5 f39444n;

    public int f39445r;

    public int f39446s;
    public int v;

    public int f39447w;

    public RadialGradient f39448x;

    public final Paint f39449y;

    public jo0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f39441c = 0.0f;
        org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.h;
        this.h = new org.telegram.ui.Components.b5(this, 350L, erVar);
        this.f39444n = new org.telegram.ui.Components.b5(this, 350L, erVar);
        this.f39449y = new Paint(1);
        this.f39440b = c6Var;
        this.f39439a = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23322s8, c6Var);
        b(-1, -1, false);
    }

    public final void b(int i10, int i11, boolean z10) {
        MessagesController.PeerColors peerColors;
        MessagesController.PeerColor color = null;
        if (i11 >= 0 && i10 >= 0 && (peerColors = MessagesController.getInstance(i10).profilePeerColors) != null) {
            color = peerColors.getColor(i11);
        }
        c(color, z10);
    }

    public final void c(MessagesController.PeerColor peerColor, boolean z10) {
        this.d = false;
        org.telegram.ui.ActionBar.c6 c6Var = this.f39440b;
        if (peerColor == null) {
            this.d = true;
            int iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23322s8, c6Var);
            this.f39443f = iV0;
            this.f39442e = iV0;
        } else {
            boolean zA = c6Var != null ? c6Var.a() : org.telegram.ui.ActionBar.g6.I.q();
            this.f39442e = peerColor.getBgColor1(zA);
            this.f39443f = peerColor.getBgColor2(zA);
        }
        if (!z10) {
            this.h.a(this.f39442e, true);
            this.f39444n.a(this.f39443f, true);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int iA = this.h.a(this.f39442e, false);
        int iA2 = this.f39444n.a(this.f39443f, false);
        RadialGradient radialGradient = this.f39448x;
        Paint paint = this.f39449y;
        if (radialGradient == null || this.f39445r != iA || this.f39446s != iA2 || this.v != getWidth() || this.f39447w != getHeight()) {
            this.v = getWidth();
            this.f39447w = getHeight();
            int i10 = this.v;
            int i11 = this.f39447w;
            float fDistance = AndroidUtilities.distance(0.0f, 0.0f, i10, i11) * 0.75f;
            this.f39446s = iA2;
            this.f39445r = iA;
            RadialGradient radialGradient2 = new RadialGradient(i10 / 2.0f, i11 * 0.4f, fDistance, new int[]{iA2, iA}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            this.f39448x = radialGradient2;
            paint.setShader(radialGradient2);
            a();
        }
        if (this.f39441c < 1.0f) {
            canvas2 = canvas;
            canvas2.drawColor(this.f39439a);
        } else {
            canvas2 = canvas;
        }
        float f10 = this.f39441c;
        if (f10 > 0.0f) {
            paint.setAlpha((int) (f10 * 255.0f));
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        }
    }

    public int getActionBarButtonColor() {
        int i10 = org.telegram.ui.ActionBar.g6.f23375v8;
        org.telegram.ui.ActionBar.c6 c6Var = this.f39440b;
        return i0.b.d(this.f39441c, org.telegram.ui.ActionBar.g6.v0(i10, c6Var), this.d ? org.telegram.ui.ActionBar.g6.v0(i10, c6Var) : -1);
    }

    public int getColor() {
        return i0.b.d(this.f39441c, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23322s8, this.f39440b), i0.b.d(0.75f, this.h.f26922c, this.f39444n.f26922c));
    }

    public int getTabsViewBackgroundColor() {
        int i10 = org.telegram.ui.ActionBar.g6.f23322s8;
        org.telegram.ui.ActionBar.c6 c6Var = this.f39440b;
        int iV0 = AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.v0(i10, c6Var)) > 0.721f ? org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23375v8, c6Var) : org.telegram.ui.ActionBar.g6.b(0.08f, -0.08f, org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        org.telegram.ui.Components.b5 b5Var = this.h;
        int i11 = b5Var.f26922c;
        org.telegram.ui.Components.b5 b5Var2 = this.f39444n;
        return i0.b.d(this.f39441c, iV0, AndroidUtilities.computePerceivedBrightness(i0.b.d(0.75f, i11, b5Var2.f26922c)) > 0.721f ? org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23373v6, c6Var) : org.telegram.ui.ActionBar.g6.b(0.08f, -0.08f, i0.b.d(0.75f, b5Var.f26922c, b5Var2.f26922c)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (!this.A) {
            i11 = org.telegram.messenger.rl.B(230.0f, AndroidUtilities.statusBarHeight, 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    public void setProgressToGradient(float f10) {
        if (Math.abs(this.f39441c - f10) > 0.001f) {
            this.f39441c = f10;
            a();
            invalidate();
        }
    }

    public void a() {
    }
}
