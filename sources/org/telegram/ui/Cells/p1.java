package org.telegram.ui.Cells;

import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ly0;
public final class p1 {
    public StaticLayout A;
    public org.telegram.ui.Components.n5 B;
    public int C;
    public int D;
    public final q1 E;
    public int f29707a;
    public int f29708b;
    public int f29709c;
    public int d;
    public float f29710e;
    public int f29711f;
    public float f29712g;
    public float h;
    public boolean f29713i;
    public int f29714j;
    public boolean f29715k;
    public boolean f29716l;
    public float f29717m;
    public float f29718n;
    public boolean f29719o;
    public StaticLayout f29720p;
    public ly0 f29721q;
    public org.telegram.ui.Components.n5 f29722r;
    public TLRPC.PollAnswer f29723s;
    public TLRPC.TodoItem f29724t;
    public boolean f29725u;
    public int v;
    public Drawable f29726w;
    public uh.b f29727x;
    public org.telegram.ui.Components.w8 f29728y;
    public ImageReceiver f29729z;

    public p1(q1 q1Var) {
        this.E = q1Var;
    }

    public final void a() {
        ImageReceiver imageReceiver = this.f29729z;
        if (imageReceiver != null) {
            imageReceiver.P();
        }
        uh.b bVar = this.f29727x;
        if (bVar != null) {
            bVar.f56782b.a();
            bVar.f56783c.P();
            bVar.E.e();
        }
    }

    public final void b() {
        ImageReceiver imageReceiver = this.f29729z;
        if (imageReceiver != null) {
            imageReceiver.R();
        }
        uh.b bVar = this.f29727x;
        if (bVar != null) {
            bVar.f56782b.b();
            bVar.f56783c.R();
            bVar.E.f();
        }
    }
}
