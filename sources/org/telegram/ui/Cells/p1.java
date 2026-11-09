package org.telegram.ui.Cells;

import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ny0;
public final class p1 {
    public StaticLayout A;
    public org.telegram.ui.Components.n5 B;
    public int C;
    public int D;
    public final q1 E;
    public int f29715a;
    public int f29716b;
    public int f29717c;
    public int d;
    public float f29718e;
    public int f29719f;
    public float f29720g;
    public float h;
    public boolean f29721i;
    public int f29722j;
    public boolean f29723k;
    public boolean f29724l;
    public float f29725m;
    public float f29726n;
    public boolean f29727o;
    public StaticLayout f29728p;
    public ny0 f29729q;
    public org.telegram.ui.Components.n5 f29730r;
    public TLRPC.PollAnswer f29731s;
    public TLRPC.TodoItem f29732t;
    public boolean f29733u;
    public int v;
    public Drawable f29734w;
    public uh.b f29735x;
    public org.telegram.ui.Components.w8 f29736y;
    public ImageReceiver f29737z;

    public p1(q1 q1Var) {
        this.E = q1Var;
    }

    public final void a() {
        ImageReceiver imageReceiver = this.f29737z;
        if (imageReceiver != null) {
            imageReceiver.P();
        }
        uh.b bVar = this.f29735x;
        if (bVar != null) {
            bVar.f56911b.a();
            bVar.f56912c.P();
            bVar.E.e();
        }
    }

    public final void b() {
        ImageReceiver imageReceiver = this.f29737z;
        if (imageReceiver != null) {
            imageReceiver.R();
        }
        uh.b bVar = this.f29735x;
        if (bVar != null) {
            bVar.f56911b.b();
            bVar.f56912c.R();
            bVar.E.f();
        }
    }
}
