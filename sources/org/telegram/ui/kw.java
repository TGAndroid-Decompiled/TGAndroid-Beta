package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
public final class kw implements Runnable {
    public final int f37767a = 0;
    public final yy f37768b;
    public final ArrayList f37769c;
    public final int d;
    public final boolean e;
    public final HashSet f37770f;

    public kw(yy yyVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
        this.f37768b = yyVar;
        this.d = i10;
        this.f37769c = arrayList;
        this.e = z10;
        this.f37770f = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f37767a) {
            case 0:
                yy.n0(this.f37768b, this.d, this.f37769c, this.e, this.f37770f);
                return;
            default:
                this.f37768b.o4(this.f37769c, this.d, false, this.e, this.f37770f);
                return;
        }
    }

    public kw(yy yyVar, ArrayList arrayList, int i10, boolean z10, HashSet hashSet) {
        this.f37768b = yyVar;
        this.f37769c = arrayList;
        this.d = i10;
        this.e = z10;
        this.f37770f = hashSet;
    }
}
