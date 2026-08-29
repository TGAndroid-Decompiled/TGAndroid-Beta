package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class bk extends il0 {
    public final ArrayList f27148c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final ArrayList f27149e = new ArrayList();
    public final Context f27150f;
    public final jk h;

    public bk(jk jkVar, Context context) {
        this.h = jkVar;
        this.f27150f = context;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        if (n1Var.f6436f == 1) {
            return true;
        }
        return false;
    }

    public final ck E(int i10) {
        int e10;
        ArrayList arrayList = this.f27148c;
        int size = arrayList.size();
        if (i10 < size) {
            return (ck) arrayList.get(i10);
        }
        if (this.d.isEmpty()) {
            ArrayList arrayList2 = this.f27149e;
            if (!arrayList2.isEmpty() && i10 != size && i10 != size + 1 && (e10 = org.telegram.ui.th.e(2, i10, arrayList)) < arrayList2.size()) {
                return (ck) arrayList2.get(e10);
            }
            return null;
        }
        return null;
    }

    @Override
    public final int h() {
        int size = this.f27148c.size();
        if (this.d.isEmpty()) {
            ArrayList arrayList = this.f27149e;
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
        int size = this.f27148c.size();
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
    public final void v(f2.n1 n1Var, int i10) {
        boolean z10;
        int i11 = n1Var.f6436f;
        View view = n1Var.f6432a;
        jk jkVar = this.h;
        if (i11 != 0) {
            if (i11 != 1) {
                return;
            }
            ck E = E(i10);
            org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
            int i12 = E.f27496a;
            if (i12 != 0) {
                String str = E.f27497b;
                String str2 = E.f27498c;
                if (i10 != this.f27148c.size() - 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                g7Var.d(z10, str, i12, str2, null, null);
            } else {
                g7Var.d(false, E.f27497b, 0, E.f27498c, E.d.toUpperCase().substring(0, Math.min(E.d.length(), 4)), E.f27499e);
            }
            File file = E.f27500f;
            if (file != null) {
                g7Var.b(jkVar.N.containsKey(file.toString()), !jkVar.Q);
                return;
            } else {
                g7Var.b(false, !jkVar.Q);
                return;
            }
        }
        org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) view;
        if (jkVar.V) {
            k4Var.setText(LocaleController.getString(R.string.RecentFilesAZ));
        } else {
            k4Var.setText(LocaleController.getString(R.string.RecentFiles));
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View k4Var;
        View view;
        org.telegram.ui.ActionBar.c6 c6Var = this.h.f28402a;
        Context context = this.f27150f;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    view = new View(context);
                    view.setTag(-33024);
                } else {
                    view = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.b) null);
                }
                return new f2.n1(view);
            }
            k4Var = new org.telegram.ui.Cells.g7(context, 1, c6Var);
        } else {
            k4Var = new org.telegram.ui.Cells.k4(context, c6Var);
        }
        view = k4Var;
        return new f2.n1(view);
    }
}
