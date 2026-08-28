package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public class io0 extends View {
    public boolean A;
    public int f39225a;
    public final org.telegram.ui.ActionBar.b6 f39226b;
    public float f39227c;
    public boolean d;
    public int f39228e;
    public int f39229f;
    public final org.telegram.ui.Components.b5 h;
    public final org.telegram.ui.Components.b5 f39230n;
    public int f39231r;
    public int f39232s;
    public int v;
    public int f39233w;
    public RadialGradient f39234x;
    public final Paint f39235y;

    public io0(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.f39227c = 0.0f;
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
        this.h = new org.telegram.ui.Components.b5(this, 350L, grVar);
        this.f39230n = new org.telegram.ui.Components.b5(this, 350L, grVar);
        this.f39235y = new Paint(1);
        this.f39226b = b6Var;
        this.f39225a = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23269s8, b6Var);
        b(-1, -1, false);
    }

    public final void b(int i9, int i10, boolean z10) {
        MessagesController.PeerColors peerColors;
        MessagesController.PeerColor peerColor = null;
        if (i10 >= 0 && i9 >= 0 && (peerColors = MessagesController.getInstance(i9).profilePeerColors) != null) {
            peerColor = peerColors.getColor(i10);
        }
        c(peerColor, z10);
    }

    public final void c(MessagesController.PeerColor peerColor, boolean z10) {
        boolean q10;
        this.d = false;
        org.telegram.ui.ActionBar.b6 b6Var = this.f39226b;
        if (peerColor == null) {
            this.d = true;
            int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23269s8, b6Var);
            this.f39229f = v02;
            this.f39228e = v02;
        } else {
            if (b6Var != null) {
                q10 = b6Var.a();
            } else {
                q10 = org.telegram.ui.ActionBar.f6.I.q();
            }
            this.f39228e = peerColor.getBgColor1(q10);
            this.f39229f = peerColor.getBgColor2(q10);
        }
        if (!z10) {
            this.h.a(this.f39228e, true);
            this.f39230n.a(this.f39229f, true);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int a2 = this.h.a(this.f39228e, false);
        int a3 = this.f39230n.a(this.f39229f, false);
        RadialGradient radialGradient = this.f39234x;
        Paint paint = this.f39235y;
        if (radialGradient == null || this.f39231r != a2 || this.f39232s != a3 || this.v != getWidth() || this.f39233w != getHeight()) {
            this.v = getWidth();
            this.f39233w = getHeight();
            int i9 = this.v;
            int i10 = this.f39233w;
            this.f39232s = a3;
            this.f39231r = a2;
            RadialGradient radialGradient2 = new RadialGradient(i9 / 2.0f, i10 * 0.4f, AndroidUtilities.distance(0.0f, 0.0f, i9, i10) * 0.75f, new int[]{a3, a2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            this.f39234x = radialGradient2;
            paint.setShader(radialGradient2);
            a();
        }
        if (this.f39227c < 1.0f) {
            canvas2 = canvas;
            canvas2.drawColor(this.f39225a);
        } else {
            canvas2 = canvas;
        }
        float f10 = this.f39227c;
        if (f10 > 0.0f) {
            paint.setAlpha((int) (f10 * 255.0f));
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        }
    }

    public int getActionBarButtonColor() {
        int i9;
        int i10 = org.telegram.ui.ActionBar.f6.f23321v8;
        org.telegram.ui.ActionBar.b6 b6Var = this.f39226b;
        int v02 = org.telegram.ui.ActionBar.f6.v0(i10, b6Var);
        if (this.d) {
            i9 = org.telegram.ui.ActionBar.f6.v0(i10, b6Var);
        } else {
            i9 = -1;
        }
        return i0.a.d(this.f39227c, v02, i9);
    }

    public int getColor() {
        return i0.a.d(this.f39227c, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23269s8, this.f39226b), i0.a.d(0.75f, this.h.f27037c, this.f39230n.f27037c));
    }

    public int getTabsViewBackgroundColor() {
        int b10;
        int b11;
        int i9 = org.telegram.ui.ActionBar.f6.f23269s8;
        org.telegram.ui.ActionBar.b6 b6Var = this.f39226b;
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.f6.v0(i9, b6Var)) > 0.721f) {
            b10 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23321v8, b6Var);
        } else {
            b10 = org.telegram.ui.ActionBar.f6.b(0.08f, -0.08f, org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        }
        org.telegram.ui.Components.b5 b5Var = this.h;
        int i10 = b5Var.f27037c;
        org.telegram.ui.Components.b5 b5Var2 = this.f39230n;
        if (AndroidUtilities.computePerceivedBrightness(i0.a.d(0.75f, i10, b5Var2.f27037c)) > 0.721f) {
            b11 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23319v6, b6Var);
        } else {
            b11 = org.telegram.ui.ActionBar.f6.b(0.08f, -0.08f, i0.a.d(0.75f, b5Var.f27037c, b5Var2.f27037c));
        }
        return i0.a.d(this.f39227c, b10, b11);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        if (!this.A) {
            i10 = org.telegram.messenger.ll.C(230.0f, AndroidUtilities.statusBarHeight, 1073741824);
        }
        super.onMeasure(i9, i10);
    }

    public void setProgressToGradient(float f10) {
        if (Math.abs(this.f39227c - f10) > 0.001f) {
            this.f39227c = f10;
            a();
            invalidate();
        }
    }

    public void a() {
    }
}
