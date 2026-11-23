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
    public int f31296a;
    public int f31297b;
    public int f31298c;
    public int d;
    public float f31299e;
    public int f31300f;
    public float f31301g;
    public float h;
    public boolean f31302i;
    public int f31303j;
    public boolean f31304k;
    public boolean f31305l;
    public float f31306m;
    public float f31307n;
    public boolean f31308o;
    public StaticLayout f31309p;
    public xy0 f31310q;
    public org.telegram.ui.Components.u5 f31311r;
    public TLRPC.PollAnswer f31312s;
    public TLRPC.TodoItem f31313t;
    public boolean f31314u;
    public int v;
    public Drawable f31315w;
    public uh.b f31316x;
    public org.telegram.ui.Components.b9 f31317y;
    public ImageReceiver f31318z;

    public q1(r1 r1Var) {
        this.E = r1Var;
    }

    public final void a() {
        ImageReceiver imageReceiver = this.f31318z;
        if (imageReceiver != null) {
            imageReceiver.P();
        }
        uh.b bVar = this.f31316x;
        if (bVar != null) {
            bVar.f59019b.a();
            bVar.f59020c.P();
            bVar.F.e();
        }
    }

    public final void b() {
        ImageReceiver imageReceiver = this.f31318z;
        if (imageReceiver != null) {
            imageReceiver.R();
        }
        uh.b bVar = this.f31316x;
        if (bVar != null) {
            bVar.f59019b.b();
            bVar.f59020c.R();
            bVar.F.f();
        }
    }
}
