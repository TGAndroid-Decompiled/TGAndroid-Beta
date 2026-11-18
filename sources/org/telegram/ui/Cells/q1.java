package org.telegram.ui.Cells;

import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.vy0;
public final class q1 {
    public StaticLayout A;
    public org.telegram.ui.Components.t5 B;
    public int C;
    public int D;
    public final r1 E;
    public int f31265a;
    public int f31266b;
    public int f31267c;
    public int d;
    public float f31268e;
    public int f31269f;
    public float f31270g;
    public float h;
    public boolean f31271i;
    public int f31272j;
    public boolean f31273k;
    public boolean f31274l;
    public float f31275m;
    public float f31276n;
    public boolean f31277o;
    public StaticLayout f31278p;
    public vy0 f31279q;
    public org.telegram.ui.Components.t5 f31280r;
    public TLRPC.PollAnswer f31281s;
    public TLRPC.TodoItem f31282t;
    public boolean f31283u;
    public int v;
    public Drawable f31284w;
    public uh.b f31285x;
    public org.telegram.ui.Components.b9 f31286y;
    public ImageReceiver f31287z;

    public q1(r1 r1Var) {
        this.E = r1Var;
    }

    public final void a() {
        ImageReceiver imageReceiver = this.f31287z;
        if (imageReceiver != null) {
            imageReceiver.P();
        }
        uh.b bVar = this.f31285x;
        if (bVar != null) {
            bVar.f58977b.a();
            bVar.f58978c.P();
            bVar.F.e();
        }
    }

    public final void b() {
        ImageReceiver imageReceiver = this.f31287z;
        if (imageReceiver != null) {
            imageReceiver.R();
        }
        uh.b bVar = this.f31285x;
        if (bVar != null) {
            bVar.f58977b.b();
            bVar.f58978c.R();
            bVar.F.f();
        }
    }
}
