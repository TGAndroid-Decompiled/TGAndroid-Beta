package org.telegram.ui.Cells;

import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ly0;
public final class p1 {
    public StaticLayout A;
    public org.telegram.ui.Components.l5 B;
    public int C;
    public int D;
    public final q1 E;
    public int f29777a;
    public int f29778b;
    public int f29779c;
    public int d;
    public float f29780e;
    public int f29781f;
    public float f29782g;
    public float h;
    public boolean f29783i;
    public int f29784j;
    public boolean f29785k;
    public boolean f29786l;
    public float f29787m;
    public float f29788n;
    public boolean f29789o;
    public StaticLayout f29790p;
    public ly0 f29791q;
    public org.telegram.ui.Components.l5 f29792r;
    public TLRPC.PollAnswer f29793s;
    public TLRPC.TodoItem f29794t;
    public boolean f29795u;
    public int v;
    public Drawable f29796w;
    public vh.b f29797x;
    public org.telegram.ui.Components.u8 f29798y;
    public ImageReceiver f29799z;

    public p1(q1 q1Var) {
        this.E = q1Var;
    }

    public final void a() {
        ImageReceiver imageReceiver = this.f29799z;
        if (imageReceiver != null) {
            imageReceiver.P();
        }
        vh.b bVar = this.f29797x;
        if (bVar != null) {
            bVar.f56943b.a();
            bVar.f56944c.P();
            bVar.F.e();
        }
    }

    public final void b() {
        ImageReceiver imageReceiver = this.f29799z;
        if (imageReceiver != null) {
            imageReceiver.R();
        }
        vh.b bVar = this.f29797x;
        if (bVar != null) {
            bVar.f56943b.b();
            bVar.f56944c.R();
            bVar.F.f();
        }
    }
}
