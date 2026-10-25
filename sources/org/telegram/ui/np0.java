package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.MessagesController;
public final class np0 {
    public boolean f41971f;
    public boolean f41972g;
    public boolean h;
    public Path f41973i;
    public Paint f41974j;
    public Drawable f41975k;
    public final org.telegram.ui.Components.xc f41976l;
    public boolean f41977m;
    public final org.telegram.ui.Components.h6 f41978n;
    public int f41979o;
    public final op0 f41982r;
    public final Paint f41968a = new Paint(1);
    public final Paint f41969b = new Paint(1);
    public final Paint f41970c = new Paint(1);
    public final Path d = new Path();
    public final Path e = new Path();
    public final RectF f41980p = new RectF();
    public final RectF f41981q = new RectF();

    public np0(op0 op0Var) {
        this.f41982r = op0Var;
        this.f41976l = new org.telegram.ui.Components.xc(op0Var);
        this.f41978n = new org.telegram.ui.Components.h6(op0Var, 0L, 320L, org.telegram.ui.Components.ds.h);
    }

    public final void a(MessagesController.PeerColor peerColor) {
        boolean a2;
        int color;
        op0 op0Var = this.f41982r;
        org.telegram.ui.ActionBar.u6 u6Var = op0Var.f42257a;
        if (peerColor == null) {
            return;
        }
        if (u6Var == null) {
            a2 = org.telegram.ui.ActionBar.y6.I.q();
        } else {
            a2 = u6Var.a();
        }
        int i10 = op0Var.f42259c;
        Paint paint = this.f41969b;
        Paint paint2 = this.f41968a;
        if (i10 == 1) {
            if (a2 && peerColor.hasColor2() && !peerColor.hasColor3()) {
                paint2.setColor(peerColor.getColor(1, u6Var));
                paint.setColor(peerColor.getColor(0, u6Var));
            } else {
                paint2.setColor(peerColor.getColor(0, u6Var));
                paint.setColor(peerColor.getColor(1, u6Var));
            }
            this.f41970c.setColor(peerColor.getColor(2, u6Var));
            this.f41971f = peerColor.hasColor2(a2);
            this.f41972g = peerColor.hasColor3(a2);
            return;
        }
        paint2.setColor(peerColor.getColor(0, u6Var));
        if (peerColor.hasColor6(a2)) {
            color = peerColor.getColor(1, u6Var);
        } else {
            color = peerColor.getColor(0, u6Var);
        }
        paint.setColor(color);
        this.f41971f = peerColor.hasColor6(a2);
        this.f41972g = false;
    }
}
