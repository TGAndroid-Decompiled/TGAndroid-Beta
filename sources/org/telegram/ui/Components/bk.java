package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class bk extends sl0 {
    public final ArrayList f25617c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final ArrayList f25618e = new ArrayList();
    public final Context f25619f;
    public final jk h;

    public bk(jk jkVar, Context context) {
        this.h = jkVar;
        this.f25619f = context;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        if (m1Var.f5879f == 1) {
            return true;
        }
        return false;
    }

    public final ck E(int i10) {
        int e6;
        ArrayList arrayList = this.f25617c;
        int size = arrayList.size();
        if (i10 < size) {
            return (ck) arrayList.get(i10);
        }
        if (this.d.isEmpty()) {
            ArrayList arrayList2 = this.f25618e;
            if (!arrayList2.isEmpty() && i10 != size && i10 != size + 1 && (e6 = org.telegram.ui.yh.e(2, i10, arrayList)) < arrayList2.size()) {
                return (ck) arrayList2.get(e6);
            }
            return null;
        }
        return null;
    }

    @Override
    public final int h() {
        int size = this.f25617c.size();
        if (this.d.isEmpty()) {
            ArrayList arrayList = this.f25618e;
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
        int size = this.f25617c.size();
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
    public final void v(f2.m1 m1Var, int i10) {
        boolean z4;
        int i11 = m1Var.f5879f;
        View view = m1Var.f5875a;
        jk jkVar = this.h;
        if (i11 != 0) {
            if (i11 != 1) {
                return;
            }
            ck E = E(i10);
            org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
            int i12 = E.f25989a;
            if (i12 != 0) {
                String str = E.f25990b;
                String str2 = E.f25991c;
                if (i10 != this.f25617c.size() - 1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                i7Var.d(str, str2, null, null, i12, z4);
            } else {
                i7Var.d(E.f25990b, E.f25991c, E.d.toUpperCase().substring(0, Math.min(E.d.length(), 4)), E.f25992e, 0, false);
            }
            File file = E.f25993f;
            if (file != null) {
                i7Var.b(jkVar.O.containsKey(file.toString()), !jkVar.R);
                return;
            } else {
                i7Var.b(false, !jkVar.R);
                return;
            }
        }
        org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
        if (jkVar.W) {
            m4Var.setText(LocaleController.getString(R.string.RecentFilesAZ));
        } else {
            m4Var.setText(LocaleController.getString(R.string.RecentFiles));
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View m4Var;
        View view;
        org.telegram.ui.ActionBar.g6 g6Var = this.h.f26545a;
        Context context = this.f25619f;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    view = new View(context);
                    view.setTag(-33024);
                } else {
                    view = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.b) null);
                }
                return new f2.m1(view);
            }
            m4Var = new org.telegram.ui.Cells.i7(context, 1, g6Var);
        } else {
            m4Var = new org.telegram.ui.Cells.m4(context, g6Var);
        }
        view = m4Var;
        return new f2.m1(view);
    }
}
