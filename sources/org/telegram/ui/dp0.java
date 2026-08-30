package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.MessagesController;
public final class dp0 {
    public boolean f33775f;
    public boolean f33776g;
    public boolean h;
    public Path f33777i;
    public Paint f33778j;
    public Drawable f33779k;
    public final org.telegram.ui.Components.rc f33780l;
    public boolean f33781m;
    public final org.telegram.ui.Components.z5 f33782n;
    public int f33783o;
    public final ep0 f33786r;
    public final Paint f33772a = new Paint(1);
    public final Paint f33773b = new Paint(1);
    public final Paint f33774c = new Paint(1);
    public final Path d = new Path();
    public final Path e = new Path();
    public final RectF f33784p = new RectF();
    public final RectF f33785q = new RectF();

    public dp0(ep0 ep0Var) {
        this.f33786r = ep0Var;
        this.f33780l = new org.telegram.ui.Components.rc(ep0Var);
        this.f33782n = new org.telegram.ui.Components.z5(ep0Var, 0L, 320L, org.telegram.ui.Components.nr.h);
    }

    public final void a(MessagesController.PeerColor peerColor) {
        boolean a2;
        int color;
        ep0 ep0Var = this.f33786r;
        org.telegram.ui.ActionBar.f6 f6Var = ep0Var.f34061a;
        if (peerColor == null) {
            return;
        }
        if (f6Var == null) {
            a2 = org.telegram.ui.ActionBar.j6.I.q();
        } else {
            a2 = f6Var.a();
        }
        int i10 = ep0Var.f34063c;
        Paint paint = this.f33773b;
        Paint paint2 = this.f33772a;
        if (i10 == 1) {
            if (a2 && peerColor.hasColor2() && !peerColor.hasColor3()) {
                paint2.setColor(peerColor.getColor(1, f6Var));
                paint.setColor(peerColor.getColor(0, f6Var));
            } else {
                paint2.setColor(peerColor.getColor(0, f6Var));
                paint.setColor(peerColor.getColor(1, f6Var));
            }
            this.f33774c.setColor(peerColor.getColor(2, f6Var));
            this.f33775f = peerColor.hasColor2(a2);
            this.f33776g = peerColor.hasColor3(a2);
            return;
        }
        paint2.setColor(peerColor.getColor(0, f6Var));
        if (peerColor.hasColor6(a2)) {
            color = peerColor.getColor(1, f6Var);
        } else {
            color = peerColor.getColor(0, f6Var);
        }
        paint.setColor(color);
        this.f33775f = peerColor.hasColor6(a2);
        this.f33776g = false;
    }
}
