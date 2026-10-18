package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.MessagesController;
public final class gp0 {
    public boolean f37299f;
    public boolean f37300g;
    public boolean h;
    public Path f37301i;
    public Paint f37302j;
    public Drawable f37303k;
    public final org.telegram.ui.Components.yc f37304l;
    public boolean f37305m;
    public final org.telegram.ui.Components.f6 f37306n;
    public int f37307o;
    public final hp0 f37310r;
    public final Paint f37296a = new Paint(1);
    public final Paint f37297b = new Paint(1);
    public final Paint f37298c = new Paint(1);
    public final Path d = new Path();
    public final Path e = new Path();
    public final RectF f37308p = new RectF();
    public final RectF f37309q = new RectF();

    public gp0(hp0 hp0Var) {
        this.f37310r = hp0Var;
        this.f37304l = new org.telegram.ui.Components.yc(hp0Var);
        this.f37306n = new org.telegram.ui.Components.f6(hp0Var, 0L, 320L, org.telegram.ui.Components.bs.h);
    }

    public final void a(MessagesController.PeerColor peerColor) {
        boolean a2;
        int color;
        hp0 hp0Var = this.f37310r;
        org.telegram.ui.ActionBar.d6 d6Var = hp0Var.f37616a;
        if (peerColor == null) {
            return;
        }
        if (d6Var == null) {
            a2 = org.telegram.ui.ActionBar.h6.I.q();
        } else {
            a2 = d6Var.a();
        }
        int i10 = hp0Var.f37618c;
        Paint paint = this.f37297b;
        Paint paint2 = this.f37296a;
        if (i10 == 1) {
            if (a2 && peerColor.hasColor2() && !peerColor.hasColor3()) {
                paint2.setColor(peerColor.getColor(1, d6Var));
                paint.setColor(peerColor.getColor(0, d6Var));
            } else {
                paint2.setColor(peerColor.getColor(0, d6Var));
                paint.setColor(peerColor.getColor(1, d6Var));
            }
            this.f37298c.setColor(peerColor.getColor(2, d6Var));
            this.f37299f = peerColor.hasColor2(a2);
            this.f37300g = peerColor.hasColor3(a2);
            return;
        }
        paint2.setColor(peerColor.getColor(0, d6Var));
        if (peerColor.hasColor6(a2)) {
            color = peerColor.getColor(1, d6Var);
        } else {
            color = peerColor.getColor(0, d6Var);
        }
        paint.setColor(color);
        this.f37299f = peerColor.hasColor6(a2);
        this.f37300g = false;
    }
}
