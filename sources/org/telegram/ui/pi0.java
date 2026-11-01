package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class pi0 implements Runnable {
    public final int f40490a;
    public final qi0 f40491b;
    public final String f40492c;

    public pi0(qi0 qi0Var, String str, int i10) {
        this.f40490a = i10;
        this.f40491b = qi0Var;
        this.f40492c = str;
    }

    @Override
    public final void run() {
        switch (this.f40490a) {
            case 0:
                qi0 qi0Var = this.f40491b;
                String str = this.f40492c;
                qi0Var.getClass();
                org.telegram.messenger.i0.g3(new pi0(qi0Var, str, 1));
                return;
            default:
                qi0 qi0Var2 = this.f40491b;
                String str2 = this.f40492c;
                zf.m1 m1Var = qi0Var2.h;
                int i10 = qi0Var2.f40800n.f33410s;
                boolean z10 = true;
                m1Var.g(str2, true, (i10 == 1 || i10 == 3) ? false : false, true, false, 0L, false, 0, 0);
                Utilities.f14523g.c(new pd0(qi0Var2, str2, new ArrayList(qi0Var2.f40800n.f33412x), 11));
                return;
        }
    }
}
