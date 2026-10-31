package org.telegram.ui.Cells;

import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.qz0;
public final class p1 {
    public StaticLayout A;
    public org.telegram.ui.Components.k5 B;
    public int C;
    public int D;
    public final q1 E;
    public int f22421a;
    public int f22422b;
    public int f22423c;
    public int d;
    public float e;
    public int f22424f;
    public float f22425g;
    public float h;
    public boolean f22426i;
    public int f22427j;
    public boolean f22428k;
    public boolean f22429l;
    public float f22430m;
    public float f22431n;
    public boolean f22432o;
    public StaticLayout f22433p;
    public qz0 f22434q;
    public org.telegram.ui.Components.k5 f22435r;
    public TLRPC.PollAnswer f22436s;
    public TLRPC.TodoItem f22437t;
    public boolean f22438u;
    public int v;
    public Drawable f22439w;
    public kh.b f22440x;
    public org.telegram.ui.Components.r8 f22441y;
    public ImageReceiver f22442z;

    public p1(q1 q1Var) {
        this.E = q1Var;
    }

    public final void a() {
        ImageReceiver imageReceiver = this.f22442z;
        if (imageReceiver != null) {
            imageReceiver.P();
        }
        kh.b bVar = this.f22440x;
        if (bVar != null) {
            bVar.f11374b.a();
            bVar.f11375c.P();
            bVar.E.e();
        }
    }

    public final void b() {
        ImageReceiver imageReceiver = this.f22442z;
        if (imageReceiver != null) {
            imageReceiver.R();
        }
        kh.b bVar = this.f22440x;
        if (bVar != null) {
            bVar.f11374b.b();
            bVar.f11375c.R();
            bVar.E.f();
        }
    }
}
