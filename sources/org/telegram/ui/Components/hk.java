package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class hk extends ul0 {
    public final ArrayList f24712c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final Context f24713f;
    public final ok h;

    public hk(ok okVar, Context context) {
        this.h = okVar;
        this.f24713f = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42977f == 1) {
            return true;
        }
        return false;
    }

    public final ik E(int i10) {
        int f7;
        ArrayList arrayList = this.f24712c;
        int size = arrayList.size();
        if (i10 < size) {
            return (ik) arrayList.get(i10);
        }
        if (this.d.isEmpty()) {
            ArrayList arrayList2 = this.e;
            if (!arrayList2.isEmpty() && i10 != size && i10 != size + 1 && (f7 = com.google.android.gms.internal.vision.e2.f(2, i10, arrayList)) < arrayList2.size()) {
                return (ik) arrayList2.get(f7);
            }
            return null;
        }
        return null;
    }

    @Override
    public final int h() {
        int size = this.f24712c.size();
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
        int size = this.f24712c.size();
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
        this.h.T();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        int i11 = c1Var.f42977f;
        View view = c1Var.f42974a;
        ok okVar = this.h;
        if (i11 != 0) {
            if (i11 != 1) {
                return;
            }
            ik E = E(i10);
            org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) view;
            int i12 = E.f25065a;
            if (i12 != 0) {
                String str = E.f25066b;
                String str2 = E.f25067c;
                if (i10 != this.f24712c.size() - 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                l7Var.d(str, str2, null, null, i12, z10);
            } else {
                l7Var.d(E.f25066b, E.f25067c, E.d.toUpperCase().substring(0, Math.min(E.d.length(), 4)), E.e, 0, false);
            }
            File file = E.f25068f;
            if (file != null) {
                l7Var.b(okVar.R.containsKey(file.toString()), !okVar.U);
                return;
            } else {
                l7Var.b(false, !okVar.U);
                return;
            }
        }
        org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
        if (okVar.f26960c0) {
            n4Var.setText(LocaleController.getString(R.string.RecentFilesAZ));
        } else {
            n4Var.setText(LocaleController.getString(R.string.RecentFiles));
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View n4Var;
        View view;
        org.telegram.ui.ActionBar.f6 f6Var = this.h.f26654a;
        Context context = this.f24713f;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    view = new View(context);
                    view.setTag(-33024);
                } else {
                    view = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.c1) null);
                }
                return new s4.c1(view);
            }
            n4Var = new org.telegram.ui.Cells.l7(context, 1, f6Var);
        } else {
            n4Var = new org.telegram.ui.Cells.n4(context, f6Var);
        }
        view = n4Var;
        return new s4.c1(view);
    }
}
