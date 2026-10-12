package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.MessagesController;
public final class cq0 {
    public boolean f35041f;
    public boolean f35042g;
    public boolean h;
    public Path f35043i;
    public Paint f35044j;
    public Drawable f35045k;
    public final org.telegram.ui.Components.ad f35046l;
    public boolean f35047m;
    public final org.telegram.ui.Components.g6 f35048n;
    public int f35049o;
    public final dq0 f35052r;
    public final Paint f35038a = new Paint(1);
    public final Paint f35039b = new Paint(1);
    public final Paint f35040c = new Paint(1);
    public final Path d = new Path();
    public final Path e = new Path();
    public final RectF f35050p = new RectF();
    public final RectF f35051q = new RectF();

    public cq0(dq0 dq0Var) {
        this.f35052r = dq0Var;
        this.f35046l = new org.telegram.ui.Components.ad(dq0Var);
        this.f35048n = new org.telegram.ui.Components.g6(dq0Var, 0L, 320L, org.telegram.ui.Components.es.h);
    }

    public final void a(MessagesController.PeerColor peerColor) {
        boolean a2;
        int color;
        dq0 dq0Var = this.f35052r;
        org.telegram.ui.ActionBar.c6 c6Var = dq0Var.f35366a;
        if (peerColor == null) {
            return;
        }
        if (c6Var == null) {
            a2 = org.telegram.ui.ActionBar.g6.I.q();
        } else {
            a2 = c6Var.a();
        }
        int i10 = dq0Var.f35368c;
        Paint paint = this.f35039b;
        Paint paint2 = this.f35038a;
        if (i10 == 1) {
            if (a2 && peerColor.hasColor2() && !peerColor.hasColor3()) {
                paint2.setColor(peerColor.getColor(1, c6Var));
                paint.setColor(peerColor.getColor(0, c6Var));
            } else {
                paint2.setColor(peerColor.getColor(0, c6Var));
                paint.setColor(peerColor.getColor(1, c6Var));
            }
            this.f35040c.setColor(peerColor.getColor(2, c6Var));
            this.f35041f = peerColor.hasColor2(a2);
            this.f35042g = peerColor.hasColor3(a2);
            return;
        }
        paint2.setColor(peerColor.getColor(0, c6Var));
        if (peerColor.hasColor6(a2)) {
            color = peerColor.getColor(1, c6Var);
        } else {
            color = peerColor.getColor(0, c6Var);
        }
        paint.setColor(color);
        this.f35041f = peerColor.hasColor6(a2);
        this.f35042g = false;
    }
}
