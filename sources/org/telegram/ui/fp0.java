package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.MessagesController;
public final class fp0 {
    public boolean f36992f;
    public boolean f36993g;
    public boolean h;
    public Path f36994i;
    public Paint f36995j;
    public Drawable f36996k;
    public final org.telegram.ui.Components.rc f36997l;
    public boolean f36998m;
    public final org.telegram.ui.Components.z5 f36999n;
    public int f37000o;
    public final gp0 f37003r;
    public final Paint f36988a = new Paint(1);
    public final Paint f36989b = new Paint(1);
    public final Paint f36990c = new Paint(1);
    public final Path d = new Path();
    public final Path f36991e = new Path();
    public final RectF f37001p = new RectF();
    public final RectF f37002q = new RectF();

    public fp0(gp0 gp0Var) {
        this.f37003r = gp0Var;
        this.f36997l = new org.telegram.ui.Components.rc(gp0Var);
        this.f36999n = new org.telegram.ui.Components.z5(gp0Var, 0L, 320L, org.telegram.ui.Components.pr.h);
    }

    public final void a(MessagesController.PeerColor peerColor) {
        boolean a2;
        int color;
        gp0 gp0Var = this.f37003r;
        org.telegram.ui.ActionBar.g6 g6Var = gp0Var.f37241a;
        if (peerColor == null) {
            return;
        }
        if (g6Var == null) {
            a2 = org.telegram.ui.ActionBar.k6.I.q();
        } else {
            a2 = g6Var.a();
        }
        int i10 = gp0Var.f37243c;
        Paint paint = this.f36989b;
        Paint paint2 = this.f36988a;
        if (i10 == 1) {
            if (a2 && peerColor.hasColor2() && !peerColor.hasColor3()) {
                paint2.setColor(peerColor.getColor(1, g6Var));
                paint.setColor(peerColor.getColor(0, g6Var));
            } else {
                paint2.setColor(peerColor.getColor(0, g6Var));
                paint.setColor(peerColor.getColor(1, g6Var));
            }
            this.f36990c.setColor(peerColor.getColor(2, g6Var));
            this.f36992f = peerColor.hasColor2(a2);
            this.f36993g = peerColor.hasColor3(a2);
            return;
        }
        paint2.setColor(peerColor.getColor(0, g6Var));
        if (peerColor.hasColor6(a2)) {
            color = peerColor.getColor(1, g6Var);
        } else {
            color = peerColor.getColor(0, g6Var);
        }
        paint.setColor(color);
        this.f36992f = peerColor.hasColor6(a2);
        this.f36993g = false;
    }
}
