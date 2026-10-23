package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.MessagesController;
public final class ep0 {
    public boolean f36749f;
    public boolean f36750g;
    public boolean h;
    public Path f36751i;
    public Paint f36752j;
    public Drawable f36753k;
    public final org.telegram.ui.Components.yc f36754l;
    public boolean f36755m;
    public final org.telegram.ui.Components.f6 f36756n;
    public int f36757o;
    public final fp0 f36760r;
    public final Paint f36746a = new Paint(1);
    public final Paint f36747b = new Paint(1);
    public final Paint f36748c = new Paint(1);
    public final Path d = new Path();
    public final Path e = new Path();
    public final RectF f36758p = new RectF();
    public final RectF f36759q = new RectF();

    public ep0(fp0 fp0Var) {
        this.f36760r = fp0Var;
        this.f36754l = new org.telegram.ui.Components.yc(fp0Var);
        this.f36756n = new org.telegram.ui.Components.f6(fp0Var, 0L, 320L, org.telegram.ui.Components.bs.h);
    }

    public final void a(MessagesController.PeerColor peerColor) {
        boolean a2;
        int color;
        fp0 fp0Var = this.f36760r;
        org.telegram.ui.ActionBar.d6 d6Var = fp0Var.f37056a;
        if (peerColor == null) {
            return;
        }
        if (d6Var == null) {
            a2 = org.telegram.ui.ActionBar.h6.I.q();
        } else {
            a2 = d6Var.a();
        }
        int i10 = fp0Var.f37058c;
        Paint paint = this.f36747b;
        Paint paint2 = this.f36746a;
        if (i10 == 1) {
            if (a2 && peerColor.hasColor2() && !peerColor.hasColor3()) {
                paint2.setColor(peerColor.getColor(1, d6Var));
                paint.setColor(peerColor.getColor(0, d6Var));
            } else {
                paint2.setColor(peerColor.getColor(0, d6Var));
                paint.setColor(peerColor.getColor(1, d6Var));
            }
            this.f36748c.setColor(peerColor.getColor(2, d6Var));
            this.f36749f = peerColor.hasColor2(a2);
            this.f36750g = peerColor.hasColor3(a2);
            return;
        }
        paint2.setColor(peerColor.getColor(0, d6Var));
        if (peerColor.hasColor6(a2)) {
            color = peerColor.getColor(1, d6Var);
        } else {
            color = peerColor.getColor(0, d6Var);
        }
        paint.setColor(color);
        this.f36749f = peerColor.hasColor6(a2);
        this.f36750g = false;
    }
}
