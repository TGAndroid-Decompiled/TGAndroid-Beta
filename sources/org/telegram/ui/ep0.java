package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.MessagesController;
public final class ep0 {
    public boolean f36745f;
    public boolean f36746g;
    public boolean h;
    public Path f36747i;
    public Paint f36748j;
    public Drawable f36749k;
    public final org.telegram.ui.Components.yc f36750l;
    public boolean f36751m;
    public final org.telegram.ui.Components.f6 f36752n;
    public int f36753o;
    public final fp0 f36756r;
    public final Paint f36742a = new Paint(1);
    public final Paint f36743b = new Paint(1);
    public final Paint f36744c = new Paint(1);
    public final Path d = new Path();
    public final Path e = new Path();
    public final RectF f36754p = new RectF();
    public final RectF f36755q = new RectF();

    public ep0(fp0 fp0Var) {
        this.f36756r = fp0Var;
        this.f36750l = new org.telegram.ui.Components.yc(fp0Var);
        this.f36752n = new org.telegram.ui.Components.f6(fp0Var, 0L, 320L, org.telegram.ui.Components.bs.h);
    }

    public final void a(MessagesController.PeerColor peerColor) {
        boolean a2;
        int color;
        fp0 fp0Var = this.f36756r;
        org.telegram.ui.ActionBar.d6 d6Var = fp0Var.f37052a;
        if (peerColor == null) {
            return;
        }
        if (d6Var == null) {
            a2 = org.telegram.ui.ActionBar.h6.I.q();
        } else {
            a2 = d6Var.a();
        }
        int i10 = fp0Var.f37054c;
        Paint paint = this.f36743b;
        Paint paint2 = this.f36742a;
        if (i10 == 1) {
            if (a2 && peerColor.hasColor2() && !peerColor.hasColor3()) {
                paint2.setColor(peerColor.getColor(1, d6Var));
                paint.setColor(peerColor.getColor(0, d6Var));
            } else {
                paint2.setColor(peerColor.getColor(0, d6Var));
                paint.setColor(peerColor.getColor(1, d6Var));
            }
            this.f36744c.setColor(peerColor.getColor(2, d6Var));
            this.f36745f = peerColor.hasColor2(a2);
            this.f36746g = peerColor.hasColor3(a2);
            return;
        }
        paint2.setColor(peerColor.getColor(0, d6Var));
        if (peerColor.hasColor6(a2)) {
            color = peerColor.getColor(1, d6Var);
        } else {
            color = peerColor.getColor(0, d6Var);
        }
        paint.setColor(color);
        this.f36745f = peerColor.hasColor6(a2);
        this.f36746g = false;
    }
}
