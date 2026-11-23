package org.telegram.ui.Cells;

import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.wy0;
public final class q1 {
    public StaticLayout A;
    public org.telegram.ui.Components.t5 B;
    public int C;
    public int D;
    public final r1 E;
    public int f31352a;
    public int f31353b;
    public int f31354c;
    public int d;
    public float f31355e;
    public int f31356f;
    public float f31357g;
    public float h;
    public boolean f31358i;
    public int f31359j;
    public boolean f31360k;
    public boolean f31361l;
    public float f31362m;
    public float f31363n;
    public boolean f31364o;
    public StaticLayout f31365p;
    public wy0 f31366q;
    public org.telegram.ui.Components.t5 f31367r;
    public TLRPC.PollAnswer f31368s;
    public TLRPC.TodoItem f31369t;
    public boolean f31370u;
    public int v;
    public Drawable f31371w;
    public uh.b f31372x;
    public org.telegram.ui.Components.a9 f31373y;
    public ImageReceiver f31374z;

    public q1(r1 r1Var) {
        this.E = r1Var;
    }

    public final void a() {
        ImageReceiver imageReceiver = this.f31374z;
        if (imageReceiver != null) {
            imageReceiver.Q();
        }
        uh.b bVar = this.f31372x;
        if (bVar != null) {
            bVar.f59101b.a();
            bVar.f59102c.Q();
            bVar.F.e();
        }
    }

    public final void b() {
        ImageReceiver imageReceiver = this.f31374z;
        if (imageReceiver != null) {
            imageReceiver.S();
        }
        uh.b bVar = this.f31372x;
        if (bVar != null) {
            bVar.f59101b.b();
            bVar.f59102c.S();
            bVar.F.f();
        }
    }
}
