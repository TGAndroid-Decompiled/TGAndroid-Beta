package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.MessagesController;
public final class gp0 {
    public boolean f37261f;
    public boolean f37262g;
    public boolean h;
    public Path f37263i;
    public Paint f37264j;
    public Drawable f37265k;
    public final org.telegram.ui.Components.yc f37266l;
    public boolean f37267m;
    public final org.telegram.ui.Components.f6 f37268n;
    public int f37269o;
    public final hp0 f37272r;
    public final Paint f37258a = new Paint(1);
    public final Paint f37259b = new Paint(1);
    public final Paint f37260c = new Paint(1);
    public final Path d = new Path();
    public final Path e = new Path();
    public final RectF f37270p = new RectF();
    public final RectF f37271q = new RectF();

    public gp0(hp0 hp0Var) {
        this.f37272r = hp0Var;
        this.f37266l = new org.telegram.ui.Components.yc(hp0Var);
        this.f37268n = new org.telegram.ui.Components.f6(hp0Var, 0L, 320L, org.telegram.ui.Components.bs.h);
    }

    public final void a(MessagesController.PeerColor peerColor) {
        boolean a2;
        int color;
        hp0 hp0Var = this.f37272r;
        org.telegram.ui.ActionBar.d6 d6Var = hp0Var.f37578a;
        if (peerColor == null) {
            return;
        }
        if (d6Var == null) {
            a2 = org.telegram.ui.ActionBar.h6.I.q();
        } else {
            a2 = d6Var.a();
        }
        int i10 = hp0Var.f37580c;
        Paint paint = this.f37259b;
        Paint paint2 = this.f37258a;
        if (i10 == 1) {
            if (a2 && peerColor.hasColor2() && !peerColor.hasColor3()) {
                paint2.setColor(peerColor.getColor(1, d6Var));
                paint.setColor(peerColor.getColor(0, d6Var));
            } else {
                paint2.setColor(peerColor.getColor(0, d6Var));
                paint.setColor(peerColor.getColor(1, d6Var));
            }
            this.f37260c.setColor(peerColor.getColor(2, d6Var));
            this.f37261f = peerColor.hasColor2(a2);
            this.f37262g = peerColor.hasColor3(a2);
            return;
        }
        paint2.setColor(peerColor.getColor(0, d6Var));
        if (peerColor.hasColor6(a2)) {
            color = peerColor.getColor(1, d6Var);
        } else {
            color = peerColor.getColor(0, d6Var);
        }
        paint.setColor(color);
        this.f37261f = peerColor.hasColor6(a2);
        this.f37262g = false;
    }
}
