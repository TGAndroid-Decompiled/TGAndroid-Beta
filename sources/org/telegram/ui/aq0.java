package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.MessagesController;
public final class aq0 {
    public boolean f34061f;
    public boolean f34062g;
    public boolean h;
    public Path f34063i;
    public Paint f34064j;
    public Drawable f34065k;
    public final org.telegram.ui.Components.ad f34066l;
    public boolean f34067m;
    public final org.telegram.ui.Components.g6 f34068n;
    public int f34069o;
    public final bq0 f34072r;
    public final Paint f34058a = new Paint(1);
    public final Paint f34059b = new Paint(1);
    public final Paint f34060c = new Paint(1);
    public final Path d = new Path();
    public final Path e = new Path();
    public final RectF f34070p = new RectF();
    public final RectF f34071q = new RectF();

    public aq0(bq0 bq0Var) {
        this.f34072r = bq0Var;
        this.f34066l = new org.telegram.ui.Components.ad(bq0Var);
        this.f34068n = new org.telegram.ui.Components.g6(bq0Var, 0L, 320L, org.telegram.ui.Components.es.h);
    }

    public final void a(MessagesController.PeerColor peerColor) {
        boolean a2;
        int color;
        bq0 bq0Var = this.f34072r;
        org.telegram.ui.ActionBar.c6 c6Var = bq0Var.f34367a;
        if (peerColor == null) {
            return;
        }
        if (c6Var == null) {
            a2 = org.telegram.ui.ActionBar.g6.I.q();
        } else {
            a2 = c6Var.a();
        }
        int i10 = bq0Var.f34369c;
        Paint paint = this.f34059b;
        Paint paint2 = this.f34058a;
        if (i10 == 1) {
            if (a2 && peerColor.hasColor2() && !peerColor.hasColor3()) {
                paint2.setColor(peerColor.getColor(1, c6Var));
                paint.setColor(peerColor.getColor(0, c6Var));
            } else {
                paint2.setColor(peerColor.getColor(0, c6Var));
                paint.setColor(peerColor.getColor(1, c6Var));
            }
            this.f34060c.setColor(peerColor.getColor(2, c6Var));
            this.f34061f = peerColor.hasColor2(a2);
            this.f34062g = peerColor.hasColor3(a2);
            return;
        }
        paint2.setColor(peerColor.getColor(0, c6Var));
        if (peerColor.hasColor6(a2)) {
            color = peerColor.getColor(1, c6Var);
        } else {
            color = peerColor.getColor(0, c6Var);
        }
        paint.setColor(color);
        this.f34061f = peerColor.hasColor6(a2);
        this.f34062g = false;
    }
}
