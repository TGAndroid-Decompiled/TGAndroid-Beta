package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class yj extends vk0 {
    public final ArrayList f34980c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final ArrayList f34981e = new ArrayList();
    public final Context f34982f;
    public final fk h;

    public yj(fk fkVar, Context context) {
        this.h = fkVar;
        this.f34982f = context;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        if (q1Var.f5505f == 1) {
            return true;
        }
        return false;
    }

    public final zj E(int i9) {
        int g10;
        ArrayList arrayList = this.f34980c;
        int size = arrayList.size();
        if (i9 < size) {
            return (zj) arrayList.get(i9);
        }
        if (this.d.isEmpty()) {
            ArrayList arrayList2 = this.f34981e;
            if (!arrayList2.isEmpty() && i9 != size && i9 != size + 1 && (g10 = j3.r0.g(2, i9, arrayList)) < arrayList2.size()) {
                return (zj) arrayList2.get(g10);
            }
            return null;
        }
        return null;
    }

    @Override
    public final int h() {
        int size = this.f34980c.size();
        if (this.d.isEmpty()) {
            ArrayList arrayList = this.f34981e;
            if (!arrayList.isEmpty()) {
                size += arrayList.size() + 2;
            }
        }
        return size + 1;
    }

    @Override
    public final int j(int i9) {
        if (i9 == h() - 1) {
            return 3;
        }
        int size = this.f34980c.size();
        if (i9 == size) {
            return 2;
        }
        if (i9 != size + 1) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void l() {
        super.l();
        this.h.S();
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        boolean z10;
        int i10 = q1Var.f5505f;
        View view = q1Var.f5501a;
        fk fkVar = this.h;
        if (i10 != 0) {
            if (i10 != 1) {
                return;
            }
            zj E = E(i9);
            org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
            int i11 = E.f35317a;
            if (i11 != 0) {
                String str = E.f35318b;
                String str2 = E.f35319c;
                if (i9 != this.f34980c.size() - 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                i7Var.d(z10, str, i11, str2, null, null);
            } else {
                i7Var.d(false, E.f35318b, 0, E.f35319c, E.d.toUpperCase().substring(0, Math.min(E.d.length(), 4)), E.f35320e);
            }
            File file = E.f35321f;
            if (file != null) {
                i7Var.b(fkVar.N.containsKey(file.toString()), !fkVar.Q);
                return;
            } else {
                i7Var.b(false, !fkVar.Q);
                return;
            }
        }
        org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
        if (fkVar.V) {
            m4Var.setText(LocaleController.getString(R.string.RecentFilesAZ));
        } else {
            m4Var.setText(LocaleController.getString(R.string.RecentFiles));
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View m4Var;
        View view;
        org.telegram.ui.ActionBar.b6 b6Var = this.h.f27492a;
        Context context = this.f34982f;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    view = new View(context);
                    view.setTag(-33024);
                } else {
                    view = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.j2) null);
                }
                return new f2.q1(view);
            }
            m4Var = new org.telegram.ui.Cells.i7(context, 1, b6Var);
        } else {
            m4Var = new org.telegram.ui.Cells.m4(context, b6Var);
        }
        view = m4Var;
        return new f2.q1(view);
    }
}
