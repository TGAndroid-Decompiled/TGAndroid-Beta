package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
public final class jw implements Runnable {
    public final int f37161a = 0;
    public final yy f37162b;
    public final ArrayList f37163c;
    public final int d;
    public final boolean e;
    public final HashSet f37164f;

    public jw(yy yyVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
        this.f37162b = yyVar;
        this.d = i10;
        this.f37163c = arrayList;
        this.e = z10;
        this.f37164f = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f37161a) {
            case 0:
                yy.n0(this.f37162b, this.d, this.f37163c, this.e, this.f37164f);
                return;
            default:
                this.f37162b.p4(this.f37163c, this.d, false, this.e, this.f37164f);
                return;
        }
    }

    public jw(yy yyVar, ArrayList arrayList, int i10, boolean z10, HashSet hashSet) {
        this.f37162b = yyVar;
        this.f37163c = arrayList;
        this.d = i10;
        this.e = z10;
        this.f37164f = hashSet;
    }
}
