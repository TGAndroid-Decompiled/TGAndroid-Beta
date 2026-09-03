package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.MessagesController;
public final class jp0 {
    public boolean f38097f;
    public boolean f38098g;
    public boolean h;
    public Path f38099i;
    public Paint f38100j;
    public Drawable f38101k;
    public final org.telegram.ui.Components.rc f38102l;
    public boolean f38103m;
    public final org.telegram.ui.Components.z5 f38104n;
    public int f38105o;
    public final kp0 f38108r;
    public final Paint f38093a = new Paint(1);
    public final Paint f38094b = new Paint(1);
    public final Paint f38095c = new Paint(1);
    public final Path d = new Path();
    public final Path f38096e = new Path();
    public final RectF f38106p = new RectF();
    public final RectF f38107q = new RectF();

    public jp0(kp0 kp0Var) {
        this.f38108r = kp0Var;
        this.f38102l = new org.telegram.ui.Components.rc(kp0Var);
        this.f38104n = new org.telegram.ui.Components.z5(kp0Var, 0L, 320L, org.telegram.ui.Components.pr.h);
    }

    public final void a(MessagesController.PeerColor peerColor) {
        boolean a2;
        int color;
        kp0 kp0Var = this.f38108r;
        org.telegram.ui.ActionBar.g6 g6Var = kp0Var.f38356a;
        if (peerColor == null) {
            return;
        }
        if (g6Var == null) {
            a2 = org.telegram.ui.ActionBar.k6.I.q();
        } else {
            a2 = g6Var.a();
        }
        int i10 = kp0Var.f38358c;
        Paint paint = this.f38094b;
        Paint paint2 = this.f38093a;
        if (i10 == 1) {
            if (a2 && peerColor.hasColor2() && !peerColor.hasColor3()) {
                paint2.setColor(peerColor.getColor(1, g6Var));
                paint.setColor(peerColor.getColor(0, g6Var));
            } else {
                paint2.setColor(peerColor.getColor(0, g6Var));
                paint.setColor(peerColor.getColor(1, g6Var));
            }
            this.f38095c.setColor(peerColor.getColor(2, g6Var));
            this.f38097f = peerColor.hasColor2(a2);
            this.f38098g = peerColor.hasColor3(a2);
            return;
        }
        paint2.setColor(peerColor.getColor(0, g6Var));
        if (peerColor.hasColor6(a2)) {
            color = peerColor.getColor(1, g6Var);
        } else {
            color = peerColor.getColor(0, g6Var);
        }
        paint.setColor(color);
        this.f38097f = peerColor.hasColor6(a2);
        this.f38098g = false;
    }
}
