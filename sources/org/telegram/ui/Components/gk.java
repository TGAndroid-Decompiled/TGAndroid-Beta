package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class gk extends lm0 {
    public final ArrayList f28584c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final Context f28585f;
    public final nk h;

    public gk(nk nkVar, Context context) {
        this.h = nkVar;
        this.f28585f = context;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        if (e1Var.f47741f == 1) {
            return true;
        }
        return false;
    }

    public final hk E(int i10) {
        int f7;
        ArrayList arrayList = this.f28584c;
        int size = arrayList.size();
        if (i10 < size) {
            return (hk) arrayList.get(i10);
        }
        if (this.d.isEmpty()) {
            ArrayList arrayList2 = this.e;
            if (!arrayList2.isEmpty() && i10 != size && i10 != size + 1 && (f7 = ic.a.f(2, i10, arrayList)) < arrayList2.size()) {
                return (hk) arrayList2.get(f7);
            }
            return null;
        }
        return null;
    }

    @Override
    public final int h() {
        int size = this.f28584c.size();
        if (this.d.isEmpty()) {
            ArrayList arrayList = this.e;
            if (!arrayList.isEmpty()) {
                size += arrayList.size() + 2;
            }
        }
        return size + 1;
    }

    @Override
    public final int j(int i10) {
        if (i10 == h() - 1) {
            return 3;
        }
        int size = this.f28584c.size();
        if (i10 == size) {
            return 2;
        }
        if (i10 != size + 1) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void l() {
        super.l();
        this.h.W();
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        boolean z10;
        int i11 = e1Var.f47741f;
        View view = e1Var.f47738a;
        nk nkVar = this.h;
        if (i11 != 0) {
            if (i11 != 1) {
                return;
            }
            hk E = E(i10);
            org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
            int i12 = E.f29002a;
            if (i12 != 0) {
                String str = E.f29003b;
                String str2 = E.f29004c;
                if (i10 != this.f28584c.size() - 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                o7Var.d(str, str2, null, null, i12, z10);
            } else {
                o7Var.d(E.f29003b, E.f29004c, E.d.toUpperCase().substring(0, Math.min(E.d.length(), 4)), E.e, 0, false);
            }
            File file = E.f29005f;
            if (file != null) {
                o7Var.b(nkVar.R.containsKey(file.toString()), !nkVar.U);
                return;
            } else {
                o7Var.b(false, !nkVar.U);
                return;
            }
        }
        org.telegram.ui.Cells.q4 q4Var = (org.telegram.ui.Cells.q4) view;
        if (nkVar.f31029c0) {
            q4Var.setText(LocaleController.getString(R.string.RecentFilesAZ));
        } else {
            q4Var.setText(LocaleController.getString(R.string.RecentFiles));
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View q4Var;
        View view;
        org.telegram.ui.ActionBar.u6 u6Var = this.h.f30214a;
        Context context = this.f28585f;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    view = new View(context);
                    view.setTag(-33024);
                } else {
                    view = new org.telegram.ui.Cells.f7(context, (org.telegram.ui.d3) null);
                }
                return new s4.e1(view);
            }
            q4Var = new org.telegram.ui.Cells.o7(context, 1, u6Var);
        } else {
            q4Var = new org.telegram.ui.Cells.q4(context, u6Var);
        }
        view = q4Var;
        return new s4.e1(view);
    }
}
