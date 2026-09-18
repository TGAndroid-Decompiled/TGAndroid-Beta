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
    public int f34599a;
    public final org.telegram.ui.ActionBar.e6 f34600b;
    public float f34601c;
    public boolean d;
    public int e;
    public int f34602f;
    public final org.telegram.ui.Components.h5 h;
    public final org.telegram.ui.Components.h5 f34603n;
    public int f34604r;
    public int f34605s;
    public int v;
    public int f34606w;
    public RadialGradient f34607x;
    public final Paint f34608y;

    public ip0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f34601c = 0.0f;
        org.telegram.ui.Components.qr qrVar = org.telegram.ui.Components.qr.h;
        this.h = new org.telegram.ui.Components.h5(this, 350L, qrVar);
        this.f34603n = new org.telegram.ui.Components.h5(this, 350L, qrVar);
        this.f34608y = new Paint(1);
        this.f34600b = e6Var;
        this.f34599a = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19340s8, e6Var);
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
        org.telegram.ui.ActionBar.e6 e6Var = this.f34600b;
        if (peerColor == null) {
            this.d = true;
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19340s8, e6Var);
            this.f34602f = v02;
            this.e = v02;
        } else {
            if (e6Var != null) {
                q6 = e6Var.a();
            } else {
                q6 = org.telegram.ui.ActionBar.j6.I.q();
            }
            this.e = peerColor.getBgColor1(q6);
            this.f34602f = peerColor.getBgColor2(q6);
        }
        if (!z10) {
            this.h.a(this.e, true);
            this.f34603n.a(this.f34602f, true);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i10;
        int a2 = this.h.a(this.e, false);
        int a10 = this.f34603n.a(this.f34602f, false);
        RadialGradient radialGradient = this.f34607x;
        Paint paint = this.f34608y;
        if (radialGradient == null || this.f34604r != a2 || this.f34605s != a10 || this.v != getWidth() || this.f34606w != getHeight()) {
            this.v = getWidth();
            this.f34606w = getHeight();
            float f7 = this.v;
            float f10 = this.f34606w;
            this.f34605s = a10;
            this.f34604r = a2;
            RadialGradient radialGradient2 = new RadialGradient(f7 / 2.0f, f10 * 0.4f, AndroidUtilities.distance(0.0f, 0.0f, f7, f10) * 0.75f, new int[]{a10, a2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            this.f34607x = radialGradient2;
            paint.setShader(radialGradient2);
            a();
        }
        if (this.f34601c < 1.0f && !this.E) {
            canvas2 = canvas;
            canvas2.drawColor(this.f34599a);
        } else {
            canvas2 = canvas;
        }
        if (this.E) {
            i10 = 255;
        } else {
            i10 = (int) (this.f34601c * 255.0f);
        }
        paint.setAlpha(i10);
        canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
    }

    public int getActionBarButtonColor() {
        int i10;
        int i11 = org.telegram.ui.ActionBar.j6.f19395v8;
        org.telegram.ui.ActionBar.e6 e6Var = this.f34600b;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i11, e6Var);
        if (this.d) {
            i10 = org.telegram.ui.ActionBar.j6.v0(i11, e6Var);
        } else {
            i10 = -1;
        }
        return i0.a.d(this.f34601c, v02, i10);
    }

    public int getColor() {
        return i0.a.d(this.f34601c, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19340s8, this.f34600b), i0.a.d(0.75f, this.h.f24550c, this.f34603n.f24550c));
    }

    public int getTabsViewBackgroundColor() {
        int b10;
        int b11;
        int i10 = org.telegram.ui.ActionBar.j6.f19340s8;
        org.telegram.ui.ActionBar.e6 e6Var = this.f34600b;
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v0(i10, e6Var)) > 0.721f) {
            b10 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19395v8, e6Var);
        } else {
            b10 = org.telegram.ui.ActionBar.j6.b(0.08f, -0.08f, org.telegram.ui.ActionBar.j6.v0(i10, e6Var));
        }
        org.telegram.ui.Components.h5 h5Var = this.h;
        int i11 = h5Var.f24550c;
        org.telegram.ui.Components.h5 h5Var2 = this.f34603n;
        if (AndroidUtilities.computePerceivedBrightness(i0.a.d(0.75f, i11, h5Var2.f24550c)) > 0.721f) {
            b11 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19393v6, e6Var);
        } else {
            b11 = org.telegram.ui.ActionBar.j6.b(0.08f, -0.08f, i0.a.d(0.75f, h5Var.f24550c, h5Var2.f24550c));
        }
        return i0.a.d(this.f34601c, b10, b11);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (!this.F) {
            i11 = org.telegram.messenger.wh.C(230.0f, AndroidUtilities.statusBarHeight, 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    public void setProgressToGradient(float f7) {
        if (Math.abs(this.f34601c - f7) > 0.001f) {
            this.f34601c = f7;
            a();
            invalidate();
        }
    }

    public void a() {
    }
}
