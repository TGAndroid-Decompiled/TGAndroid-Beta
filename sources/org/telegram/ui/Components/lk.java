package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class lk extends qm0 {
    public final ArrayList f28441c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final ArrayList f28442e = new ArrayList();
    public final Context f28443f;
    public final sk h;

    public lk(sk skVar, Context context) {
        this.h = skVar;
        this.f28443f = context;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        if (d1Var.f47786f == 1) {
            return true;
        }
        return false;
    }

    public final mk E(int i10) {
        int f7;
        ArrayList arrayList = this.f28441c;
        int size = arrayList.size();
        if (i10 < size) {
            return (mk) arrayList.get(i10);
        }
        if (this.d.isEmpty()) {
            ArrayList arrayList2 = this.f28442e;
            if (!arrayList2.isEmpty() && i10 != size && i10 != size + 1 && (f7 = com.google.android.gms.internal.vision.e2.f(2, i10, arrayList)) < arrayList2.size()) {
                return (mk) arrayList2.get(f7);
            }
            return null;
        }
        return null;
    }

    @Override
    public final int h() {
        int size = this.f28441c.size();
        if (this.d.isEmpty()) {
            ArrayList arrayList = this.f28442e;
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
        int size = this.f28441c.size();
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
        int i11 = d1Var.f47786f;
        View view = d1Var.f47782a;
        sk skVar = this.h;
        if (i11 != 0) {
            if (i11 != 1) {
                return;
            }
            mk E = E(i10);
            org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
            int i12 = E.f28865a;
            if (i12 != 0) {
                String str = E.f28866b;
                String str2 = E.f28867c;
                if (i10 != this.f28441c.size() - 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                k7Var.d(str, str2, null, null, i12, z10);
            } else {
                k7Var.d(E.f28866b, E.f28867c, E.d.toUpperCase().substring(0, Math.min(E.d.length(), 4)), E.f28868e, 0, false);
            }
            File file = E.f28869f;
            if (file != null) {
                k7Var.b(skVar.R.containsKey(file.toString()), !skVar.U);
                return;
            } else {
                k7Var.b(false, !skVar.U);
                return;
            }
        }
        org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
        if (skVar.f30885c0) {
            m4Var.setText(LocaleController.getString(R.string.RecentFilesAZ));
        } else {
            m4Var.setText(LocaleController.getString(R.string.RecentFiles));
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        View m4Var;
        View view;
        org.telegram.ui.ActionBar.d6 d6Var = this.h.f30244a;
        Context context = this.f28443f;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    view = new View(context);
                    view.setTag(-33024);
                } else {
                    view = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
                }
                return new s4.d1(view);
            }
            m4Var = new org.telegram.ui.Cells.k7(context, 1, d6Var);
        } else {
            m4Var = new org.telegram.ui.Cells.m4(context, d6Var);
        }
        view = m4Var;
        return new s4.d1(view);
    }
}
