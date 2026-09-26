package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class jk extends wl0 {
    public final ArrayList f25456c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final Context f25457f;
    public final qk h;

    public jk(qk qkVar, Context context) {
        this.h = qkVar;
        this.f25457f = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42962f == 1) {
            return true;
        }
        return false;
    }

    public final kk E(int i10) {
        int f7;
        ArrayList arrayList = this.f25456c;
        int size = arrayList.size();
        if (i10 < size) {
            return (kk) arrayList.get(i10);
        }
        if (this.d.isEmpty()) {
            ArrayList arrayList2 = this.e;
            if (!arrayList2.isEmpty() && i10 != size && i10 != size + 1 && (f7 = com.google.android.gms.internal.vision.e2.f(2, i10, arrayList)) < arrayList2.size()) {
                return (kk) arrayList2.get(f7);
            }
            return null;
        }
        return null;
    }

    @Override
    public final int h() {
        int size = this.f25456c.size();
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
        int size = this.f25456c.size();
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
        int i11 = c1Var.f42962f;
        View view = c1Var.f42959a;
        qk qkVar = this.h;
        if (i11 != 0) {
            if (i11 != 1) {
                return;
            }
            kk E = E(i10);
            org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
            int i12 = E.f25745a;
            if (i12 != 0) {
                String str = E.f25746b;
                String str2 = E.f25747c;
                if (i10 != this.f25456c.size() - 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                k7Var.d(str, str2, null, null, i12, z10);
            } else {
                k7Var.d(E.f25746b, E.f25747c, E.d.toUpperCase().substring(0, Math.min(E.d.length(), 4)), E.e, 0, false);
            }
            File file = E.f25748f;
            if (file != null) {
                k7Var.b(qkVar.R.containsKey(file.toString()), !qkVar.U);
                return;
            } else {
                k7Var.b(false, !qkVar.U);
                return;
            }
        }
        org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
        if (qkVar.f27700c0) {
            m4Var.setText(LocaleController.getString(R.string.RecentFilesAZ));
        } else {
            m4Var.setText(LocaleController.getString(R.string.RecentFiles));
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View m4Var;
        View view;
        org.telegram.ui.ActionBar.d6 d6Var = this.h.f27042a;
        Context context = this.f25457f;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    view = new View(context);
                    view.setTag(-33024);
                } else {
                    view = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
                }
                return new s4.c1(view);
            }
            m4Var = new org.telegram.ui.Cells.k7(context, 1, d6Var);
        } else {
            m4Var = new org.telegram.ui.Cells.m4(context, d6Var);
        }
        view = m4Var;
        return new s4.c1(view);
    }
}
