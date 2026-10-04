package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public class cp0 extends View {
    public boolean E;
    public boolean F;
    public int f35519a;
    public final org.telegram.ui.ActionBar.d6 f35520b;
    public float f35521c;
    public boolean d;
    public int f35522e;
    public int f35523f;
    public final org.telegram.ui.Components.h5 h;
    public final org.telegram.ui.Components.h5 f35524n;
    public int f35525r;
    public int f35526s;
    public int v;
    public int f35527w;
    public RadialGradient f35528x;
    public final Paint f35529y;

    public cp0(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f35521c = 0.0f;
        org.telegram.ui.Components.tr trVar = org.telegram.ui.Components.tr.h;
        this.h = new org.telegram.ui.Components.h5(this, 350L, trVar);
        this.f35524n = new org.telegram.ui.Components.h5(this, 350L, trVar);
        this.f35529y = new Paint(1);
        this.f35520b = d6Var;
        this.f35519a = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21100s8, d6Var);
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
        org.telegram.ui.ActionBar.d6 d6Var = this.f35520b;
        if (peerColor == null) {
            this.d = true;
            int v02 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21100s8, d6Var);
            this.f35523f = v02;
            this.f35522e = v02;
        } else {
            if (d6Var != null) {
                q6 = d6Var.a();
            } else {
                q6 = org.telegram.ui.ActionBar.i6.I.q();
            }
            this.f35522e = peerColor.getBgColor1(q6);
            this.f35523f = peerColor.getBgColor2(q6);
        }
        if (!z10) {
            this.h.a(this.f35522e, true);
            this.f35524n.a(this.f35523f, true);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i10;
        int a2 = this.h.a(this.f35522e, false);
        int a10 = this.f35524n.a(this.f35523f, false);
        RadialGradient radialGradient = this.f35528x;
        Paint paint = this.f35529y;
        if (radialGradient == null || this.f35525r != a2 || this.f35526s != a10 || this.v != getWidth() || this.f35527w != getHeight()) {
            this.v = getWidth();
            this.f35527w = getHeight();
            float f7 = this.v;
            float f10 = this.f35527w;
            this.f35526s = a10;
            this.f35525r = a2;
            RadialGradient radialGradient2 = new RadialGradient(f7 / 2.0f, f10 * 0.4f, AndroidUtilities.distance(0.0f, 0.0f, f7, f10) * 0.75f, new int[]{a10, a2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            this.f35528x = radialGradient2;
            paint.setShader(radialGradient2);
            a();
        }
        if (this.f35521c < 1.0f && !this.E) {
            canvas2 = canvas;
            canvas2.drawColor(this.f35519a);
        } else {
            canvas2 = canvas;
        }
        if (this.E) {
            i10 = 255;
        } else {
            i10 = (int) (this.f35521c * 255.0f);
        }
        paint.setAlpha(i10);
        canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
    }

    public int getActionBarButtonColor() {
        int i10;
        int i11 = org.telegram.ui.ActionBar.i6.f21155v8;
        org.telegram.ui.ActionBar.d6 d6Var = this.f35520b;
        int v02 = org.telegram.ui.ActionBar.i6.v0(i11, d6Var);
        if (this.d) {
            i10 = org.telegram.ui.ActionBar.i6.v0(i11, d6Var);
        } else {
            i10 = -1;
        }
        return i0.a.d(this.f35521c, v02, i10);
    }

    public int getColor() {
        return i0.a.d(this.f35521c, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21100s8, this.f35520b), i0.a.d(0.75f, this.h.f27012c, this.f35524n.f27012c));
    }

    public int getTabsViewBackgroundColor() {
        int b10;
        int b11;
        int i10 = org.telegram.ui.ActionBar.i6.f21100s8;
        org.telegram.ui.ActionBar.d6 d6Var = this.f35520b;
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.i6.v0(i10, d6Var)) > 0.721f) {
            b10 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21155v8, d6Var);
        } else {
            b10 = org.telegram.ui.ActionBar.i6.b(0.08f, -0.08f, org.telegram.ui.ActionBar.i6.v0(i10, d6Var));
        }
        org.telegram.ui.Components.h5 h5Var = this.h;
        int i11 = h5Var.f27012c;
        org.telegram.ui.Components.h5 h5Var2 = this.f35524n;
        if (AndroidUtilities.computePerceivedBrightness(i0.a.d(0.75f, i11, h5Var2.f27012c)) > 0.721f) {
            b11 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21153v6, d6Var);
        } else {
            b11 = org.telegram.ui.ActionBar.i6.b(0.08f, -0.08f, i0.a.d(0.75f, h5Var.f27012c, h5Var2.f27012c));
        }
        return i0.a.d(this.f35521c, b10, b11);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (!this.F) {
            i11 = org.telegram.messenger.ok.B(230.0f, AndroidUtilities.statusBarHeight, 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    public void setProgressToGradient(float f7) {
        if (Math.abs(this.f35521c - f7) > 0.001f) {
            this.f35521c = f7;
            a();
            invalidate();
        }
    }

    public void a() {
    }
}
