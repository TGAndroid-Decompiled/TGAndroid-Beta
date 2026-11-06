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
    public int f29708a;
    public int f29709b;
    public int f29710c;
    public int d;
    public float f29711e;
    public int f29712f;
    public float f29713g;
    public float h;
    public boolean f29714i;
    public int f29715j;
    public boolean f29716k;
    public boolean f29717l;
    public float f29718m;
    public float f29719n;
    public boolean f29720o;
    public StaticLayout f29721p;
    public my0 f29722q;
    public org.telegram.ui.Components.n5 f29723r;
    public TLRPC.PollAnswer f29724s;
    public TLRPC.TodoItem f29725t;
    public boolean f29726u;
    public int v;
    public Drawable f29727w;
    public uh.b f29728x;
    public org.telegram.ui.Components.w8 f29729y;
    public ImageReceiver f29730z;

    public p1(q1 q1Var) {
        this.E = q1Var;
    }

    public final void a() {
        ImageReceiver imageReceiver = this.f29730z;
        if (imageReceiver != null) {
            imageReceiver.P();
        }
        uh.b bVar = this.f29728x;
        if (bVar != null) {
            bVar.f56806b.a();
            bVar.f56807c.P();
            bVar.E.e();
        }
    }

    public final void b() {
        ImageReceiver imageReceiver = this.f29730z;
        if (imageReceiver != null) {
            imageReceiver.R();
        }
        uh.b bVar = this.f29728x;
        if (bVar != null) {
            bVar.f56806b.b();
            bVar.f56807c.R();
            bVar.E.f();
        }
    }
}
