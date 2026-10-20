package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.MessagesController;
public final class ep0 {
    public boolean f36744f;
    public boolean f36745g;
    public boolean h;
    public Path f36746i;
    public Paint f36747j;
    public Drawable f36748k;
    public final org.telegram.ui.Components.yc f36749l;
    public boolean f36750m;
    public final org.telegram.ui.Components.f6 f36751n;
    public int f36752o;
    public final fp0 f36755r;
    public final Paint f36741a = new Paint(1);
    public final Paint f36742b = new Paint(1);
    public final Paint f36743c = new Paint(1);
    public final Path d = new Path();
    public final Path e = new Path();
    public final RectF f36753p = new RectF();
    public final RectF f36754q = new RectF();

    public ep0(fp0 fp0Var) {
        this.f36755r = fp0Var;
        this.f36749l = new org.telegram.ui.Components.yc(fp0Var);
        this.f36751n = new org.telegram.ui.Components.f6(fp0Var, 0L, 320L, org.telegram.ui.Components.bs.h);
    }

    public final void a(MessagesController.PeerColor peerColor) {
        boolean a2;
        int color;
        fp0 fp0Var = this.f36755r;
        org.telegram.ui.ActionBar.d6 d6Var = fp0Var.f37051a;
        if (peerColor == null) {
            return;
        }
        if (d6Var == null) {
            a2 = org.telegram.ui.ActionBar.h6.I.q();
        } else {
            a2 = d6Var.a();
        }
        int i10 = fp0Var.f37053c;
        Paint paint = this.f36742b;
        Paint paint2 = this.f36741a;
        if (i10 == 1) {
            if (a2 && peerColor.hasColor2() && !peerColor.hasColor3()) {
                paint2.setColor(peerColor.getColor(1, d6Var));
                paint.setColor(peerColor.getColor(0, d6Var));
            } else {
                paint2.setColor(peerColor.getColor(0, d6Var));
                paint.setColor(peerColor.getColor(1, d6Var));
            }
            this.f36743c.setColor(peerColor.getColor(2, d6Var));
            this.f36744f = peerColor.hasColor2(a2);
            this.f36745g = peerColor.hasColor3(a2);
            return;
        }
        paint2.setColor(peerColor.getColor(0, d6Var));
        if (peerColor.hasColor6(a2)) {
            color = peerColor.getColor(1, d6Var);
        } else {
            color = peerColor.getColor(0, d6Var);
        }
        paint.setColor(color);
        this.f36744f = peerColor.hasColor6(a2);
        this.f36745g = false;
    }
}
