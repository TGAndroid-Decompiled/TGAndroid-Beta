package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.MessagesController;
public final class pp0 {
    public boolean f42477f;
    public boolean f42478g;
    public boolean h;
    public Path f42479i;
    public Paint f42480j;
    public Drawable f42481k;
    public final org.telegram.ui.Components.xc f42482l;
    public boolean f42483m;
    public final org.telegram.ui.Components.h6 f42484n;
    public int f42485o;
    public final qp0 f42488r;
    public final Paint f42474a = new Paint(1);
    public final Paint f42475b = new Paint(1);
    public final Paint f42476c = new Paint(1);
    public final Path d = new Path();
    public final Path e = new Path();
    public final RectF f42486p = new RectF();
    public final RectF f42487q = new RectF();

    public pp0(qp0 qp0Var) {
        this.f42488r = qp0Var;
        this.f42482l = new org.telegram.ui.Components.xc(qp0Var);
        this.f42484n = new org.telegram.ui.Components.h6(qp0Var, 0L, 320L, org.telegram.ui.Components.ds.h);
    }

    public final void a(MessagesController.PeerColor peerColor) {
        boolean a2;
        int color;
        qp0 qp0Var = this.f42488r;
        org.telegram.ui.ActionBar.u6 u6Var = qp0Var.f42761a;
        if (peerColor == null) {
            return;
        }
        if (u6Var == null) {
            a2 = org.telegram.ui.ActionBar.y6.I.q();
        } else {
            a2 = u6Var.a();
        }
        int i10 = qp0Var.f42763c;
        Paint paint = this.f42475b;
        Paint paint2 = this.f42474a;
        if (i10 == 1) {
            if (a2 && peerColor.hasColor2() && !peerColor.hasColor3()) {
                paint2.setColor(peerColor.getColor(1, u6Var));
                paint.setColor(peerColor.getColor(0, u6Var));
            } else {
                paint2.setColor(peerColor.getColor(0, u6Var));
                paint.setColor(peerColor.getColor(1, u6Var));
            }
            this.f42476c.setColor(peerColor.getColor(2, u6Var));
            this.f42477f = peerColor.hasColor2(a2);
            this.f42478g = peerColor.hasColor3(a2);
            return;
        }
        paint2.setColor(peerColor.getColor(0, u6Var));
        if (peerColor.hasColor6(a2)) {
            color = peerColor.getColor(1, u6Var);
        } else {
            color = peerColor.getColor(0, u6Var);
        }
        paint.setColor(color);
        this.f42477f = peerColor.hasColor6(a2);
        this.f42478g = false;
    }
}
