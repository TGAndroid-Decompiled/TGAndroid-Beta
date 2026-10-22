package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class o81 extends s4.r0 {
    public final int f39800a;
    public final p91 f39801b;

    public o81(p91 p91Var, int i10) {
        this.f39800a = i10;
        this.f39801b = p91Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        bh.f fVar;
        p91 p91Var;
        bh.f fVar2;
        p91 p91Var2;
        bh.f fVar3;
        switch (this.f39800a) {
            case 0:
                p91 p91Var3 = this.f39801b;
                if (p91Var3.f40152r0.size() != p91Var3.f40154s0.size() && !p91Var3.f40159w0 && p91Var3.U.N0() > p91Var3.X.f41875c0 - 20) {
                    p91Var3.h0();
                }
                if (Build.VERSION.SDK_INT >= 31 && (fVar = p91Var3.C0) != null) {
                    fVar.f(i10, i11);
                    p91.W(p91Var3);
                    return;
                }
                return;
            case 1:
                if (Build.VERSION.SDK_INT >= 31 && (fVar2 = (p91Var = this.f39801b).C0) != null) {
                    fVar2.f(i10, i11);
                    p91.W(p91Var);
                    return;
                }
                return;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (fVar3 = (p91Var2 = this.f39801b).C0) != null) {
                    fVar3.f(i10, i11);
                    p91.W(p91Var2);
                    return;
                }
                return;
        }
    }
}
