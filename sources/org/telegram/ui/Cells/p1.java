package org.telegram.ui.Cells;

import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.oy0;
public final class p1 {
    public StaticLayout A;
    public org.telegram.ui.Components.l5 B;
    public int C;
    public int D;
    public final q1 E;
    public int f30838a;
    public int f30839b;
    public int f30840c;
    public int d;
    public float f30841e;
    public int f30842f;
    public float f30843g;
    public float h;
    public boolean f30844i;
    public int f30845j;
    public boolean f30846k;
    public boolean f30847l;
    public float f30848m;
    public float f30849n;
    public boolean f30850o;
    public StaticLayout f30851p;
    public oy0 f30852q;
    public org.telegram.ui.Components.l5 f30853r;
    public TLRPC.PollAnswer f30854s;
    public TLRPC.TodoItem f30855t;
    public boolean f30856u;
    public int v;
    public Drawable f30857w;
    public uh.b f30858x;
    public org.telegram.ui.Components.t8 f30859y;
    public ImageReceiver f30860z;

    public p1(q1 q1Var) {
        this.E = q1Var;
    }

    public final void a() {
        ImageReceiver imageReceiver = this.f30860z;
        if (imageReceiver != null) {
            imageReceiver.P();
        }
        uh.b bVar = this.f30858x;
        if (bVar != null) {
            bVar.f58409b.a();
            bVar.f58410c.P();
            bVar.F.e();
        }
    }

    public final void b() {
        ImageReceiver imageReceiver = this.f30860z;
        if (imageReceiver != null) {
            imageReceiver.R();
        }
        uh.b bVar = this.f30858x;
        if (bVar != null) {
            bVar.f58409b.b();
            bVar.f58410c.R();
            bVar.F.f();
        }
    }
}
