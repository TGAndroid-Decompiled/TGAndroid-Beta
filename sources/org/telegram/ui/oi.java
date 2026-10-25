package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class oi implements Runnable {
    public final boolean f42192a;
    public final boolean f42193b;
    public final int f42194c;
    public final boolean d;
    public final org.telegram.ui.Components.fl0 e;
    public final float f42195f;
    public final float h;
    public final bh.x0 f42196n;
    public final MessageObject f42197r;
    public final un f42198s;

    public oi(un unVar, boolean z10, boolean z11, int i10, boolean z12, org.telegram.ui.Components.fl0 fl0Var, float f7, float f10, bh.x0 x0Var, MessageObject messageObject) {
        this.f42198s = unVar;
        this.f42192a = z10;
        this.f42193b = z11;
        this.f42194c = i10;
        this.d = z12;
        this.e = fl0Var;
        this.f42195f = f7;
        this.h = f10;
        this.f42196n = x0Var;
        this.f42197r = messageObject;
    }

    @Override
    public final void run() {
        if (!this.f42192a) {
            un unVar = this.f42198s;
            if (unVar.f44492yc != null) {
                unVar.f44492yc = null;
                if (this.f42193b) {
                    unVar.o8(new ni(this, this.f42194c, this.d, this.e, this.f42195f, this.h, this.f42196n, 0));
                } else {
                    unVar.o8(new ed(18, this, this.f42197r));
                }
                unVar.H7(true);
            }
        }
    }
}
