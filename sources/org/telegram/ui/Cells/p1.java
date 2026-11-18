package org.telegram.ui.Cells;

import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.vy0;
public final class p1 {
    public StaticLayout A;
    public org.telegram.ui.Components.t5 B;
    public int C;
    public int D;
    public final q1 E;
    public int f31215a;
    public int f31216b;
    public int f31217c;
    public int d;
    public float f31218e;
    public int f31219f;
    public float f31220g;
    public float h;
    public boolean f31221i;
    public int f31222j;
    public boolean f31223k;
    public boolean f31224l;
    public float f31225m;
    public float f31226n;
    public boolean f31227o;
    public StaticLayout f31228p;
    public vy0 f31229q;
    public org.telegram.ui.Components.t5 f31230r;
    public TLRPC.PollAnswer f31231s;
    public TLRPC.TodoItem f31232t;
    public boolean f31233u;
    public int v;
    public Drawable f31234w;
    public uh.b f31235x;
    public org.telegram.ui.Components.b9 f31236y;
    public ImageReceiver f31237z;

    public p1(q1 q1Var) {
        this.E = q1Var;
    }

    public final void a() {
        ImageReceiver imageReceiver = this.f31237z;
        if (imageReceiver != null) {
            imageReceiver.P();
        }
        uh.b bVar = this.f31235x;
        if (bVar != null) {
            bVar.f58976b.a();
            bVar.f58977c.P();
            bVar.F.e();
        }
    }

    public final void b() {
        ImageReceiver imageReceiver = this.f31237z;
        if (imageReceiver != null) {
            imageReceiver.R();
        }
        uh.b bVar = this.f31235x;
        if (bVar != null) {
            bVar.f58976b.b();
            bVar.f58977c.R();
            bVar.F.f();
        }
    }
}
