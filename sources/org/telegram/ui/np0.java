package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.MessagesController;
public final class np0 {
    public boolean f41974f;
    public boolean f41975g;
    public boolean h;
    public Path f41976i;
    public Paint f41977j;
    public Drawable f41978k;
    public final org.telegram.ui.Components.xc f41979l;
    public boolean f41980m;
    public final org.telegram.ui.Components.h6 f41981n;
    public int f41982o;
    public final op0 f41985r;
    public final Paint f41971a = new Paint(1);
    public final Paint f41972b = new Paint(1);
    public final Paint f41973c = new Paint(1);
    public final Path d = new Path();
    public final Path e = new Path();
    public final RectF f41983p = new RectF();
    public final RectF f41984q = new RectF();

    public np0(op0 op0Var) {
        this.f41985r = op0Var;
        this.f41979l = new org.telegram.ui.Components.xc(op0Var);
        this.f41981n = new org.telegram.ui.Components.h6(op0Var, 0L, 320L, org.telegram.ui.Components.ds.h);
    }

    public final void a(MessagesController.PeerColor peerColor) {
        boolean a2;
        int color;
        op0 op0Var = this.f41985r;
        org.telegram.ui.ActionBar.u6 u6Var = op0Var.f42260a;
        if (peerColor == null) {
            return;
        }
        if (u6Var == null) {
            a2 = org.telegram.ui.ActionBar.y6.I.q();
        } else {
            a2 = u6Var.a();
        }
        int i10 = op0Var.f42262c;
        Paint paint = this.f41972b;
        Paint paint2 = this.f41971a;
        if (i10 == 1) {
            if (a2 && peerColor.hasColor2() && !peerColor.hasColor3()) {
                paint2.setColor(peerColor.getColor(1, u6Var));
                paint.setColor(peerColor.getColor(0, u6Var));
            } else {
                paint2.setColor(peerColor.getColor(0, u6Var));
                paint.setColor(peerColor.getColor(1, u6Var));
            }
            this.f41973c.setColor(peerColor.getColor(2, u6Var));
            this.f41974f = peerColor.hasColor2(a2);
            this.f41975g = peerColor.hasColor3(a2);
            return;
        }
        paint2.setColor(peerColor.getColor(0, u6Var));
        if (peerColor.hasColor6(a2)) {
            color = peerColor.getColor(1, u6Var);
        } else {
            color = peerColor.getColor(0, u6Var);
        }
        paint.setColor(color);
        this.f41974f = peerColor.hasColor6(a2);
        this.f41975g = false;
    }
}
