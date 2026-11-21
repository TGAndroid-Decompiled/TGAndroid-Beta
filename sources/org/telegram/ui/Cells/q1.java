package org.telegram.ui.Cells;

import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.xy0;
public final class q1 {
    public StaticLayout A;
    public org.telegram.ui.Components.u5 B;
    public int C;
    public int D;
    public final r1 E;
    public int f31293a;
    public int f31294b;
    public int f31295c;
    public int d;
    public float f31296e;
    public int f31297f;
    public float f31298g;
    public float h;
    public boolean f31299i;
    public int f31300j;
    public boolean f31301k;
    public boolean f31302l;
    public float f31303m;
    public float f31304n;
    public boolean f31305o;
    public StaticLayout f31306p;
    public xy0 f31307q;
    public org.telegram.ui.Components.u5 f31308r;
    public TLRPC.PollAnswer f31309s;
    public TLRPC.TodoItem f31310t;
    public boolean f31311u;
    public int v;
    public Drawable f31312w;
    public uh.b f31313x;
    public org.telegram.ui.Components.b9 f31314y;
    public ImageReceiver f31315z;

    public q1(r1 r1Var) {
        this.E = r1Var;
    }

    public final void a() {
        ImageReceiver imageReceiver = this.f31315z;
        if (imageReceiver != null) {
            imageReceiver.P();
        }
        uh.b bVar = this.f31313x;
        if (bVar != null) {
            bVar.f59015b.a();
            bVar.f59016c.P();
            bVar.F.e();
        }
    }

    public final void b() {
        ImageReceiver imageReceiver = this.f31315z;
        if (imageReceiver != null) {
            imageReceiver.R();
        }
        uh.b bVar = this.f31313x;
        if (bVar != null) {
            bVar.f59015b.b();
            bVar.f59016c.R();
            bVar.F.f();
        }
    }
}
