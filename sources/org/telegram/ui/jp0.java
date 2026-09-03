package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.MessagesController;
public final class jp0 {
    public boolean f35336f;
    public boolean f35337g;
    public boolean h;
    public Path f35338i;
    public Paint f35339j;
    public Drawable f35340k;
    public final org.telegram.ui.Components.rc f35341l;
    public boolean f35342m;
    public final org.telegram.ui.Components.z5 f35343n;
    public int f35344o;
    public final kp0 f35347r;
    public final Paint f35333a = new Paint(1);
    public final Paint f35334b = new Paint(1);
    public final Paint f35335c = new Paint(1);
    public final Path d = new Path();
    public final Path e = new Path();
    public final RectF f35345p = new RectF();
    public final RectF f35346q = new RectF();

    public jp0(kp0 kp0Var) {
        this.f35347r = kp0Var;
        this.f35341l = new org.telegram.ui.Components.rc(kp0Var);
        this.f35343n = new org.telegram.ui.Components.z5(kp0Var, 0L, 320L, org.telegram.ui.Components.mr.h);
    }

    public final void a(MessagesController.PeerColor peerColor) {
        boolean a2;
        int color;
        kp0 kp0Var = this.f35347r;
        org.telegram.ui.ActionBar.f6 f6Var = kp0Var.f35566a;
        if (peerColor == null) {
            return;
        }
        if (f6Var == null) {
            a2 = org.telegram.ui.ActionBar.j6.I.q();
        } else {
            a2 = f6Var.a();
        }
        int i10 = kp0Var.f35568c;
        Paint paint = this.f35334b;
        Paint paint2 = this.f35333a;
        if (i10 == 1) {
            if (a2 && peerColor.hasColor2() && !peerColor.hasColor3()) {
                paint2.setColor(peerColor.getColor(1, f6Var));
                paint.setColor(peerColor.getColor(0, f6Var));
            } else {
                paint2.setColor(peerColor.getColor(0, f6Var));
                paint.setColor(peerColor.getColor(1, f6Var));
            }
            this.f35335c.setColor(peerColor.getColor(2, f6Var));
            this.f35336f = peerColor.hasColor2(a2);
            this.f35337g = peerColor.hasColor3(a2);
            return;
        }
        paint2.setColor(peerColor.getColor(0, f6Var));
        if (peerColor.hasColor6(a2)) {
            color = peerColor.getColor(1, f6Var);
        } else {
            color = peerColor.getColor(0, f6Var);
        }
        paint.setColor(color);
        this.f35336f = peerColor.hasColor6(a2);
        this.f35337g = false;
    }
}
