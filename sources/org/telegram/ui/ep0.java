package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.MessagesController;
public final class ep0 {
    public boolean f36748f;
    public boolean f36749g;
    public boolean h;
    public Path f36750i;
    public Paint f36751j;
    public Drawable f36752k;
    public final org.telegram.ui.Components.yc f36753l;
    public boolean f36754m;
    public final org.telegram.ui.Components.f6 f36755n;
    public int f36756o;
    public final fp0 f36759r;
    public final Paint f36745a = new Paint(1);
    public final Paint f36746b = new Paint(1);
    public final Paint f36747c = new Paint(1);
    public final Path d = new Path();
    public final Path e = new Path();
    public final RectF f36757p = new RectF();
    public final RectF f36758q = new RectF();

    public ep0(fp0 fp0Var) {
        this.f36759r = fp0Var;
        this.f36753l = new org.telegram.ui.Components.yc(fp0Var);
        this.f36755n = new org.telegram.ui.Components.f6(fp0Var, 0L, 320L, org.telegram.ui.Components.bs.h);
    }

    public final void a(MessagesController.PeerColor peerColor) {
        boolean a2;
        int color;
        fp0 fp0Var = this.f36759r;
        org.telegram.ui.ActionBar.d6 d6Var = fp0Var.f37055a;
        if (peerColor == null) {
            return;
        }
        if (d6Var == null) {
            a2 = org.telegram.ui.ActionBar.h6.I.q();
        } else {
            a2 = d6Var.a();
        }
        int i10 = fp0Var.f37057c;
        Paint paint = this.f36746b;
        Paint paint2 = this.f36745a;
        if (i10 == 1) {
            if (a2 && peerColor.hasColor2() && !peerColor.hasColor3()) {
                paint2.setColor(peerColor.getColor(1, d6Var));
                paint.setColor(peerColor.getColor(0, d6Var));
            } else {
                paint2.setColor(peerColor.getColor(0, d6Var));
                paint.setColor(peerColor.getColor(1, d6Var));
            }
            this.f36747c.setColor(peerColor.getColor(2, d6Var));
            this.f36748f = peerColor.hasColor2(a2);
            this.f36749g = peerColor.hasColor3(a2);
            return;
        }
        paint2.setColor(peerColor.getColor(0, d6Var));
        if (peerColor.hasColor6(a2)) {
            color = peerColor.getColor(1, d6Var);
        } else {
            color = peerColor.getColor(0, d6Var);
        }
        paint.setColor(color);
        this.f36748f = peerColor.hasColor6(a2);
        this.f36749g = false;
    }
}
