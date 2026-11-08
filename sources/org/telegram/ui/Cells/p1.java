package org.telegram.ui.Cells;

import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.my0;
public final class p1 {
    public StaticLayout A;
    public org.telegram.ui.Components.n5 B;
    public int C;
    public int D;
    public final q1 E;
    public int f29711a;
    public int f29712b;
    public int f29713c;
    public int d;
    public float f29714e;
    public int f29715f;
    public float f29716g;
    public float h;
    public boolean f29717i;
    public int f29718j;
    public boolean f29719k;
    public boolean f29720l;
    public float f29721m;
    public float f29722n;
    public boolean f29723o;
    public StaticLayout f29724p;
    public my0 f29725q;
    public org.telegram.ui.Components.n5 f29726r;
    public TLRPC.PollAnswer f29727s;
    public TLRPC.TodoItem f29728t;
    public boolean f29729u;
    public int v;
    public Drawable f29730w;
    public uh.b f29731x;
    public org.telegram.ui.Components.w8 f29732y;
    public ImageReceiver f29733z;

    public p1(q1 q1Var) {
        this.E = q1Var;
    }

    public final void a() {
        ImageReceiver imageReceiver = this.f29733z;
        if (imageReceiver != null) {
            imageReceiver.P();
        }
        uh.b bVar = this.f29731x;
        if (bVar != null) {
            bVar.f56899b.a();
            bVar.f56900c.P();
            bVar.E.e();
        }
    }

    public final void b() {
        ImageReceiver imageReceiver = this.f29733z;
        if (imageReceiver != null) {
            imageReceiver.R();
        }
        uh.b bVar = this.f29731x;
        if (bVar != null) {
            bVar.f56899b.b();
            bVar.f56900c.R();
            bVar.E.f();
        }
    }
}
