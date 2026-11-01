package org.telegram.ui.Cells;

import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.rz0;
public final class p1 {
    public StaticLayout A;
    public org.telegram.ui.Components.k5 B;
    public int C;
    public int D;
    public final q1 E;
    public int f22422a;
    public int f22423b;
    public int f22424c;
    public int d;
    public float e;
    public int f22425f;
    public float f22426g;
    public float h;
    public boolean f22427i;
    public int f22428j;
    public boolean f22429k;
    public boolean f22430l;
    public float f22431m;
    public float f22432n;
    public boolean f22433o;
    public StaticLayout f22434p;
    public rz0 f22435q;
    public org.telegram.ui.Components.k5 f22436r;
    public TLRPC.PollAnswer f22437s;
    public TLRPC.TodoItem f22438t;
    public boolean f22439u;
    public int v;
    public Drawable f22440w;
    public kh.b f22441x;
    public org.telegram.ui.Components.r8 f22442y;
    public ImageReceiver f22443z;

    public p1(q1 q1Var) {
        this.E = q1Var;
    }

    public final void a() {
        ImageReceiver imageReceiver = this.f22443z;
        if (imageReceiver != null) {
            imageReceiver.P();
        }
        kh.b bVar = this.f22441x;
        if (bVar != null) {
            bVar.f11375b.a();
            bVar.f11376c.P();
            bVar.E.e();
        }
    }

    public final void b() {
        ImageReceiver imageReceiver = this.f22443z;
        if (imageReceiver != null) {
            imageReceiver.R();
        }
        kh.b bVar = this.f22441x;
        if (bVar != null) {
            bVar.f11375b.b();
            bVar.f11376c.R();
            bVar.E.f();
        }
    }
}
