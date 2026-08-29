package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public class ho0 extends View {
    public boolean A;
    public int f38972a;
    public final org.telegram.ui.ActionBar.c6 f38973b;
    public float f38974c;
    public boolean d;
    public int f38975e;
    public int f38976f;
    public final org.telegram.ui.Components.f5 h;
    public final org.telegram.ui.Components.f5 f38977n;
    public int f38978r;
    public int f38979s;
    public int v;
    public int f38980w;
    public RadialGradient f38981x;
    public final Paint f38982y;

    public ho0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f38974c = 0.0f;
        org.telegram.ui.Components.jr jrVar = org.telegram.ui.Components.jr.h;
        this.h = new org.telegram.ui.Components.f5(this, 350L, jrVar);
        this.f38977n = new org.telegram.ui.Components.f5(this, 350L, jrVar);
        this.f38982y = new Paint(1);
        this.f38973b = c6Var;
        this.f38972a = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23329s8, c6Var);
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
        org.telegram.ui.ActionBar.c6 c6Var = this.f38973b;
        if (peerColor == null) {
            this.d = true;
            int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23329s8, c6Var);
            this.f38976f = v02;
            this.f38975e = v02;
        } else {
            if (c6Var != null) {
                q6 = c6Var.a();
            } else {
                q6 = org.telegram.ui.ActionBar.g6.I.q();
            }
            this.f38975e = peerColor.getBgColor1(q6);
            this.f38976f = peerColor.getBgColor2(q6);
        }
        if (!z10) {
            this.h.a(this.f38975e, true);
            this.f38977n.a(this.f38976f, true);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int a2 = this.h.a(this.f38975e, false);
        int a10 = this.f38977n.a(this.f38976f, false);
        RadialGradient radialGradient = this.f38981x;
        Paint paint = this.f38982y;
        if (radialGradient == null || this.f38978r != a2 || this.f38979s != a10 || this.v != getWidth() || this.f38980w != getHeight()) {
            this.v = getWidth();
            this.f38980w = getHeight();
            int i10 = this.v;
            int i11 = this.f38980w;
            this.f38979s = a10;
            this.f38978r = a2;
            RadialGradient radialGradient2 = new RadialGradient(i10 / 2.0f, i11 * 0.4f, AndroidUtilities.distance(0.0f, 0.0f, i10, i11) * 0.75f, new int[]{a10, a2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            this.f38981x = radialGradient2;
            paint.setShader(radialGradient2);
            a();
        }
        if (this.f38974c < 1.0f) {
            canvas2 = canvas;
            canvas2.drawColor(this.f38972a);
        } else {
            canvas2 = canvas;
        }
        float f9 = this.f38974c;
        if (f9 > 0.0f) {
            paint.setAlpha((int) (f9 * 255.0f));
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        }
    }

    public int getActionBarButtonColor() {
        int i10;
        int i11 = org.telegram.ui.ActionBar.g6.f23385v8;
        org.telegram.ui.ActionBar.c6 c6Var = this.f38973b;
        int v02 = org.telegram.ui.ActionBar.g6.v0(i11, c6Var);
        if (this.d) {
            i10 = org.telegram.ui.ActionBar.g6.v0(i11, c6Var);
        } else {
            i10 = -1;
        }
        return i0.a.d(this.f38974c, v02, i10);
    }

    public int getColor() {
        return i0.a.d(this.f38974c, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23329s8, this.f38973b), i0.a.d(0.75f, this.h.f28309c, this.f38977n.f28309c));
    }

    public int getTabsViewBackgroundColor() {
        int b10;
        int b11;
        int i10 = org.telegram.ui.ActionBar.g6.f23329s8;
        org.telegram.ui.ActionBar.c6 c6Var = this.f38973b;
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.v0(i10, c6Var)) > 0.721f) {
            b10 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23385v8, c6Var);
        } else {
            b10 = org.telegram.ui.ActionBar.g6.b(0.08f, -0.08f, org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        }
        org.telegram.ui.Components.f5 f5Var = this.h;
        int i11 = f5Var.f28309c;
        org.telegram.ui.Components.f5 f5Var2 = this.f38977n;
        if (AndroidUtilities.computePerceivedBrightness(i0.a.d(0.75f, i11, f5Var2.f28309c)) > 0.721f) {
            b11 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23383v6, c6Var);
        } else {
            b11 = org.telegram.ui.ActionBar.g6.b(0.08f, -0.08f, i0.a.d(0.75f, f5Var.f28309c, f5Var2.f28309c));
        }
        return i0.a.d(this.f38974c, b10, b11);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (!this.A) {
            i11 = b.B(230.0f, AndroidUtilities.statusBarHeight, 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    public void setProgressToGradient(float f9) {
        if (Math.abs(this.f38974c - f9) > 0.001f) {
            this.f38974c = f9;
            a();
            invalidate();
        }
    }

    public void a() {
    }
}
