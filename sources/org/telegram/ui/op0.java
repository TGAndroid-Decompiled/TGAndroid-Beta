package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.MessagesController;
public final class op0 {
    public boolean f36419f;
    public boolean f36420g;
    public boolean h;
    public Path f36421i;
    public Paint f36422j;
    public Drawable f36423k;
    public final org.telegram.ui.Components.zc f36424l;
    public boolean f36425m;
    public final org.telegram.ui.Components.e6 f36426n;
    public int f36427o;
    public final pp0 f36430r;
    public final Paint f36416a = new Paint(1);
    public final Paint f36417b = new Paint(1);
    public final Paint f36418c = new Paint(1);
    public final Path d = new Path();
    public final Path e = new Path();
    public final RectF f36428p = new RectF();
    public final RectF f36429q = new RectF();

    public op0(pp0 pp0Var) {
        this.f36430r = pp0Var;
        this.f36424l = new org.telegram.ui.Components.zc(pp0Var);
        this.f36426n = new org.telegram.ui.Components.e6(pp0Var, 0L, 320L, org.telegram.ui.Components.tr.h);
    }

    public final void a(MessagesController.PeerColor peerColor) {
        boolean a2;
        int color;
        pp0 pp0Var = this.f36430r;
        org.telegram.ui.ActionBar.d6 d6Var = pp0Var.f36698a;
        if (peerColor == null) {
            return;
        }
        if (d6Var == null) {
            a2 = org.telegram.ui.ActionBar.h6.I.q();
        } else {
            a2 = d6Var.a();
        }
        int i10 = pp0Var.f36700c;
        Paint paint = this.f36417b;
        Paint paint2 = this.f36416a;
        if (i10 == 1) {
            if (a2 && peerColor.hasColor2() && !peerColor.hasColor3()) {
                paint2.setColor(peerColor.getColor(1, d6Var));
                paint.setColor(peerColor.getColor(0, d6Var));
            } else {
                paint2.setColor(peerColor.getColor(0, d6Var));
                paint.setColor(peerColor.getColor(1, d6Var));
            }
            this.f36418c.setColor(peerColor.getColor(2, d6Var));
            this.f36419f = peerColor.hasColor2(a2);
            this.f36420g = peerColor.hasColor3(a2);
            return;
        }
        paint2.setColor(peerColor.getColor(0, d6Var));
        if (peerColor.hasColor6(a2)) {
            color = peerColor.getColor(1, d6Var);
        } else {
            color = peerColor.getColor(0, d6Var);
        }
        paint.setColor(color);
        this.f36419f = peerColor.hasColor6(a2);
        this.f36420g = false;
    }
}
