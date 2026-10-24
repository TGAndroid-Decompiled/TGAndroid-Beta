package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.MessagesController;
public final class gp0 {
    public boolean f37625f;
    public boolean f37626g;
    public boolean h;
    public Path f37627i;
    public Paint f37628j;
    public Drawable f37629k;
    public final org.telegram.ui.Components.wc f37630l;
    public boolean f37631m;
    public final org.telegram.ui.Components.d6 f37632n;
    public int f37633o;
    public final hp0 f37636r;
    public final Paint f37622a = new Paint(1);
    public final Paint f37623b = new Paint(1);
    public final Paint f37624c = new Paint(1);
    public final Path d = new Path();
    public final Path e = new Path();
    public final RectF f37634p = new RectF();
    public final RectF f37635q = new RectF();

    public gp0(hp0 hp0Var) {
        this.f37636r = hp0Var;
        this.f37630l = new org.telegram.ui.Components.wc(hp0Var);
        this.f37632n = new org.telegram.ui.Components.d6(hp0Var, 0L, 320L, org.telegram.ui.Components.zr.h);
    }

    public final void a(MessagesController.PeerColor peerColor) {
        boolean a2;
        int color;
        hp0 hp0Var = this.f37636r;
        org.telegram.ui.ActionBar.g6 g6Var = hp0Var.f37956a;
        if (peerColor == null) {
            return;
        }
        if (g6Var == null) {
            a2 = org.telegram.ui.ActionBar.k6.I.q();
        } else {
            a2 = g6Var.a();
        }
        int i10 = hp0Var.f37958c;
        Paint paint = this.f37623b;
        Paint paint2 = this.f37622a;
        if (i10 == 1) {
            if (a2 && peerColor.hasColor2() && !peerColor.hasColor3()) {
                paint2.setColor(peerColor.getColor(1, g6Var));
                paint.setColor(peerColor.getColor(0, g6Var));
            } else {
                paint2.setColor(peerColor.getColor(0, g6Var));
                paint.setColor(peerColor.getColor(1, g6Var));
            }
            this.f37624c.setColor(peerColor.getColor(2, g6Var));
            this.f37625f = peerColor.hasColor2(a2);
            this.f37626g = peerColor.hasColor3(a2);
            return;
        }
        paint2.setColor(peerColor.getColor(0, g6Var));
        if (peerColor.hasColor6(a2)) {
            color = peerColor.getColor(1, g6Var);
        } else {
            color = peerColor.getColor(0, g6Var);
        }
        paint.setColor(color);
        this.f37625f = peerColor.hasColor6(a2);
        this.f37626g = false;
    }
}
