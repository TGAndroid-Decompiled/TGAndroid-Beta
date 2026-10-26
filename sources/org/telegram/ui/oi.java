package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class oi implements Runnable {
    public final boolean f42195a;
    public final boolean f42196b;
    public final int f42197c;
    public final boolean d;
    public final org.telegram.ui.Components.fl0 e;
    public final float f42198f;
    public final float h;
    public final bh.x0 f42199n;
    public final MessageObject f42200r;
    public final un f42201s;

    public oi(un unVar, boolean z10, boolean z11, int i10, boolean z12, org.telegram.ui.Components.fl0 fl0Var, float f7, float f10, bh.x0 x0Var, MessageObject messageObject) {
        this.f42201s = unVar;
        this.f42195a = z10;
        this.f42196b = z11;
        this.f42197c = i10;
        this.d = z12;
        this.e = fl0Var;
        this.f42198f = f7;
        this.h = f10;
        this.f42199n = x0Var;
        this.f42200r = messageObject;
    }

    @Override
    public final void run() {
        if (!this.f42195a) {
            un unVar = this.f42201s;
            if (unVar.f44495yc != null) {
                unVar.f44495yc = null;
                if (this.f42196b) {
                    unVar.o8(new ni(this, this.f42197c, this.d, this.e, this.f42198f, this.h, this.f42199n, 0));
                } else {
                    unVar.o8(new ed(18, this, this.f42200r));
                }
                unVar.H7(true);
            }
        }
    }
}
