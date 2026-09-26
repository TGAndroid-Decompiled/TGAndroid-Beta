package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.MessagesController;
public final class pp0 {
    public boolean f36594f;
    public boolean f36595g;
    public boolean h;
    public Path f36596i;
    public Paint f36597j;
    public Drawable f36598k;
    public final org.telegram.ui.Components.yc f36599l;
    public boolean f36600m;
    public final org.telegram.ui.Components.e6 f36601n;
    public int f36602o;
    public final qp0 f36605r;
    public final Paint f36591a = new Paint(1);
    public final Paint f36592b = new Paint(1);
    public final Paint f36593c = new Paint(1);
    public final Path d = new Path();
    public final Path e = new Path();
    public final RectF f36603p = new RectF();
    public final RectF f36604q = new RectF();

    public pp0(qp0 qp0Var) {
        this.f36605r = qp0Var;
        this.f36599l = new org.telegram.ui.Components.yc(qp0Var);
        this.f36601n = new org.telegram.ui.Components.e6(qp0Var, 0L, 320L, org.telegram.ui.Components.rr.h);
    }

    public final void a(MessagesController.PeerColor peerColor) {
        boolean a2;
        int color;
        qp0 qp0Var = this.f36605r;
        org.telegram.ui.ActionBar.d6 d6Var = qp0Var.f36959a;
        if (peerColor == null) {
            return;
        }
        if (d6Var == null) {
            a2 = org.telegram.ui.ActionBar.h6.I.q();
        } else {
            a2 = d6Var.a();
        }
        int i10 = qp0Var.f36961c;
        Paint paint = this.f36592b;
        Paint paint2 = this.f36591a;
        if (i10 == 1) {
            if (a2 && peerColor.hasColor2() && !peerColor.hasColor3()) {
                paint2.setColor(peerColor.getColor(1, d6Var));
                paint.setColor(peerColor.getColor(0, d6Var));
            } else {
                paint2.setColor(peerColor.getColor(0, d6Var));
                paint.setColor(peerColor.getColor(1, d6Var));
            }
            this.f36593c.setColor(peerColor.getColor(2, d6Var));
            this.f36594f = peerColor.hasColor2(a2);
            this.f36595g = peerColor.hasColor3(a2);
            return;
        }
        paint2.setColor(peerColor.getColor(0, d6Var));
        if (peerColor.hasColor6(a2)) {
            color = peerColor.getColor(1, d6Var);
        } else {
            color = peerColor.getColor(0, d6Var);
        }
        paint.setColor(color);
        this.f36594f = peerColor.hasColor6(a2);
        this.f36595g = false;
    }
}
