package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.MessagesController;
public final class hp0 {
    public boolean f37894f;
    public boolean f37895g;
    public boolean h;
    public Path f37896i;
    public Paint f37897j;
    public Drawable f37898k;
    public final org.telegram.ui.Components.yc f37899l;
    public boolean f37900m;
    public final org.telegram.ui.Components.f6 f37901n;
    public int f37902o;
    public final ip0 f37905r;
    public final Paint f37891a = new Paint(1);
    public final Paint f37892b = new Paint(1);
    public final Paint f37893c = new Paint(1);
    public final Path d = new Path();
    public final Path e = new Path();
    public final RectF f37903p = new RectF();
    public final RectF f37904q = new RectF();

    public hp0(ip0 ip0Var) {
        this.f37905r = ip0Var;
        this.f37899l = new org.telegram.ui.Components.yc(ip0Var);
        this.f37901n = new org.telegram.ui.Components.f6(ip0Var, 0L, 320L, org.telegram.ui.Components.bs.h);
    }

    public final void a(MessagesController.PeerColor peerColor) {
        boolean a2;
        int color;
        ip0 ip0Var = this.f37905r;
        org.telegram.ui.ActionBar.g6 g6Var = ip0Var.f38331a;
        if (peerColor == null) {
            return;
        }
        if (g6Var == null) {
            a2 = org.telegram.ui.ActionBar.k6.I.q();
        } else {
            a2 = g6Var.a();
        }
        int i10 = ip0Var.f38333c;
        Paint paint = this.f37892b;
        Paint paint2 = this.f37891a;
        if (i10 == 1) {
            if (a2 && peerColor.hasColor2() && !peerColor.hasColor3()) {
                paint2.setColor(peerColor.getColor(1, g6Var));
                paint.setColor(peerColor.getColor(0, g6Var));
            } else {
                paint2.setColor(peerColor.getColor(0, g6Var));
                paint.setColor(peerColor.getColor(1, g6Var));
            }
            this.f37893c.setColor(peerColor.getColor(2, g6Var));
            this.f37894f = peerColor.hasColor2(a2);
            this.f37895g = peerColor.hasColor3(a2);
            return;
        }
        paint2.setColor(peerColor.getColor(0, g6Var));
        if (peerColor.hasColor6(a2)) {
            color = peerColor.getColor(1, g6Var);
        } else {
            color = peerColor.getColor(0, g6Var);
        }
        paint.setColor(color);
        this.f37894f = peerColor.hasColor6(a2);
        this.f37895g = false;
    }
}
