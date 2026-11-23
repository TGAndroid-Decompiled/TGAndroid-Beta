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
    public int f31262a;
    public int f31263b;
    public int f31264c;
    public int d;
    public float f31265e;
    public int f31266f;
    public float f31267g;
    public float h;
    public boolean f31268i;
    public int f31269j;
    public boolean f31270k;
    public boolean f31271l;
    public float f31272m;
    public float f31273n;
    public boolean f31274o;
    public StaticLayout f31275p;
    public xy0 f31276q;
    public org.telegram.ui.Components.u5 f31277r;
    public TLRPC.PollAnswer f31278s;
    public TLRPC.TodoItem f31279t;
    public boolean f31280u;
    public int v;
    public Drawable f31281w;
    public uh.b f31282x;
    public org.telegram.ui.Components.b9 f31283y;
    public ImageReceiver f31284z;

    public q1(r1 r1Var) {
        this.E = r1Var;
    }

    public final void a() {
        ImageReceiver imageReceiver = this.f31284z;
        if (imageReceiver != null) {
            imageReceiver.P();
        }
        uh.b bVar = this.f31282x;
        if (bVar != null) {
            bVar.f58984b.a();
            bVar.f58985c.P();
            bVar.F.e();
        }
    }

    public final void b() {
        ImageReceiver imageReceiver = this.f31284z;
        if (imageReceiver != null) {
            imageReceiver.R();
        }
        uh.b bVar = this.f31282x;
        if (bVar != null) {
            bVar.f58984b.b();
            bVar.f58985c.R();
            bVar.F.f();
        }
    }
}
