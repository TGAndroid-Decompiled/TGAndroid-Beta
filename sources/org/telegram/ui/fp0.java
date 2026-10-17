package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.MessagesController;
public final class fp0 {
    public boolean f37016f;
    public boolean f37017g;
    public boolean h;
    public Path f37018i;
    public Paint f37019j;
    public Drawable f37020k;
    public final org.telegram.ui.Components.yc f37021l;
    public boolean f37022m;
    public final org.telegram.ui.Components.f6 f37023n;
    public int f37024o;
    public final gp0 f37027r;
    public final Paint f37013a = new Paint(1);
    public final Paint f37014b = new Paint(1);
    public final Paint f37015c = new Paint(1);
    public final Path d = new Path();
    public final Path e = new Path();
    public final RectF f37025p = new RectF();
    public final RectF f37026q = new RectF();

    public fp0(gp0 gp0Var) {
        this.f37027r = gp0Var;
        this.f37021l = new org.telegram.ui.Components.yc(gp0Var);
        this.f37023n = new org.telegram.ui.Components.f6(gp0Var, 0L, 320L, org.telegram.ui.Components.bs.h);
    }

    public final void a(MessagesController.PeerColor peerColor) {
        boolean a2;
        int color;
        gp0 gp0Var = this.f37027r;
        org.telegram.ui.ActionBar.d6 d6Var = gp0Var.f37285a;
        if (peerColor == null) {
            return;
        }
        if (d6Var == null) {
            a2 = org.telegram.ui.ActionBar.h6.I.q();
        } else {
            a2 = d6Var.a();
        }
        int i10 = gp0Var.f37287c;
        Paint paint = this.f37014b;
        Paint paint2 = this.f37013a;
        if (i10 == 1) {
            if (a2 && peerColor.hasColor2() && !peerColor.hasColor3()) {
                paint2.setColor(peerColor.getColor(1, d6Var));
                paint.setColor(peerColor.getColor(0, d6Var));
            } else {
                paint2.setColor(peerColor.getColor(0, d6Var));
                paint.setColor(peerColor.getColor(1, d6Var));
            }
            this.f37015c.setColor(peerColor.getColor(2, d6Var));
            this.f37016f = peerColor.hasColor2(a2);
            this.f37017g = peerColor.hasColor3(a2);
            return;
        }
        paint2.setColor(peerColor.getColor(0, d6Var));
        if (peerColor.hasColor6(a2)) {
            color = peerColor.getColor(1, d6Var);
        } else {
            color = peerColor.getColor(0, d6Var);
        }
        paint.setColor(color);
        this.f37016f = peerColor.hasColor6(a2);
        this.f37017g = false;
    }
}
