package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ik extends ll0 {
    public final ArrayList f24986c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final Context f24987f;
    public final pk h;

    public ik(pk pkVar, Context context) {
        this.h = pkVar;
        this.f24987f = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42630f == 1) {
            return true;
        }
        return false;
    }

    public final jk E(int i10) {
        int f7;
        ArrayList arrayList = this.f24986c;
        int size = arrayList.size();
        if (i10 < size) {
            return (jk) arrayList.get(i10);
        }
        if (this.d.isEmpty()) {
            ArrayList arrayList2 = this.e;
            if (!arrayList2.isEmpty() && i10 != size && i10 != size + 1 && (f7 = com.google.android.gms.internal.vision.e2.f(2, i10, arrayList)) < arrayList2.size()) {
                return (jk) arrayList2.get(f7);
            }
            return null;
        }
        return null;
    }

    @Override
    public final int h() {
        int size = this.f24986c.size();
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
        int size = this.f24986c.size();
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
        int i11 = c1Var.f42630f;
        View view = c1Var.f42627a;
        pk pkVar = this.h;
        if (i11 != 0) {
            if (i11 != 1) {
                return;
            }
            jk E = E(i10);
            org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) view;
            int i12 = E.f25338a;
            if (i12 != 0) {
                String str = E.f25339b;
                String str2 = E.f25340c;
                if (i10 != this.f24986c.size() - 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                j7Var.d(str, str2, null, null, i12, z10);
            } else {
                j7Var.d(E.f25339b, E.f25340c, E.d.toUpperCase().substring(0, Math.min(E.d.length(), 4)), E.e, 0, false);
            }
            File file = E.f25341f;
            if (file != null) {
                j7Var.b(pkVar.R.containsKey(file.toString()), !pkVar.U);
                return;
            } else {
                j7Var.b(false, !pkVar.U);
                return;
            }
        }
        org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
        if (pkVar.f27063c0) {
            m4Var.setText(LocaleController.getString(R.string.RecentFilesAZ));
        } else {
            m4Var.setText(LocaleController.getString(R.string.RecentFiles));
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View m4Var;
        View view;
        org.telegram.ui.ActionBar.d6 d6Var = this.h.f26743a;
        Context context = this.f24987f;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    view = new View(context);
                    view.setTag(-33024);
                } else {
                    view = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.q3) null);
                }
                return new s4.c1(view);
            }
            m4Var = new org.telegram.ui.Cells.j7(context, 1, d6Var);
        } else {
            m4Var = new org.telegram.ui.Cells.m4(context, d6Var);
        }
        view = m4Var;
        return new s4.c1(view);
    }
}
