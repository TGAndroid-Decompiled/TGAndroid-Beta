package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class nk extends vm0 {
    public final ArrayList f28810c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final ArrayList f28811e = new ArrayList();
    public final Context f28812f;
    public final uk h;

    public nk(uk ukVar, Context context) {
        this.h = ukVar;
        this.f28812f = context;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        if (d1Var.f47901f == 1) {
            return true;
        }
        return false;
    }

    public final ok E(int i10) {
        int f7;
        ArrayList arrayList = this.f28810c;
        int size = arrayList.size();
        if (i10 < size) {
            return (ok) arrayList.get(i10);
        }
        if (this.d.isEmpty()) {
            ArrayList arrayList2 = this.f28811e;
            if (!arrayList2.isEmpty() && i10 != size && i10 != size + 1 && (f7 = com.google.android.gms.internal.vision.e2.f(2, i10, arrayList)) < arrayList2.size()) {
                return (ok) arrayList2.get(f7);
            }
            return null;
        }
        return null;
    }

    @Override
    public final int h() {
        int size = this.f28810c.size();
        if (this.d.isEmpty()) {
            ArrayList arrayList = this.f28811e;
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
        int size = this.f28810c.size();
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
    public final void v(s4.d1 d1Var, int i10) {
        boolean z10;
        int i11 = d1Var.f47901f;
        View view = d1Var.f47897a;
        uk ukVar = this.h;
        if (i11 != 0) {
            if (i11 != 1) {
                return;
            }
            ok E = E(i10);
            org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) view;
            int i12 = E.f29227a;
            if (i12 != 0) {
                String str = E.f29228b;
                String str2 = E.f29229c;
                if (i10 != this.f28810c.size() - 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                j7Var.d(str, str2, null, null, i12, z10);
            } else {
                j7Var.d(E.f29228b, E.f29229c, E.d.toUpperCase().substring(0, Math.min(E.d.length(), 4)), E.f29230e, 0, false);
            }
            File file = E.f29231f;
            if (file != null) {
                j7Var.b(ukVar.R.containsKey(file.toString()), !ukVar.U);
                return;
            } else {
                j7Var.b(false, !ukVar.U);
                return;
            }
        }
        org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
        if (ukVar.f31181c0) {
            m4Var.setText(LocaleController.getString(R.string.RecentFilesAZ));
        } else {
            m4Var.setText(LocaleController.getString(R.string.RecentFiles));
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        View m4Var;
        View view;
        org.telegram.ui.ActionBar.c6 c6Var = this.h.f30569a;
        Context context = this.f28812f;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    view = new View(context);
                    view.setTag(-33024);
                } else {
                    view = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.c1) null);
                }
                return new s4.d1(view);
            }
            m4Var = new org.telegram.ui.Cells.j7(context, 1, c6Var);
        } else {
            m4Var = new org.telegram.ui.Cells.m4(context, c6Var);
        }
        view = m4Var;
        return new s4.d1(view);
    }
}
