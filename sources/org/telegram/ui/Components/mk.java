package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class mk extends ul0 {
    public final ArrayList f25248c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final Context f25249f;
    public final tk h;

    public mk(tk tkVar, Context context) {
        this.h = tkVar;
        this.f25249f = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f41613f == 1) {
            return true;
        }
        return false;
    }

    public final nk E(int i10) {
        int e;
        ArrayList arrayList = this.f25248c;
        int size = arrayList.size();
        if (i10 < size) {
            return (nk) arrayList.get(i10);
        }
        if (this.d.isEmpty()) {
            ArrayList arrayList2 = this.e;
            if (!arrayList2.isEmpty() && i10 != size && i10 != size + 1 && (e = com.google.android.gms.internal.vision.e2.e(2, i10, arrayList)) < arrayList2.size()) {
                return (nk) arrayList2.get(e);
            }
            return null;
        }
        return null;
    }

    @Override
    public final int h() {
        int size = this.f25248c.size();
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
        int size = this.f25248c.size();
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
        int i11 = c1Var.f41613f;
        View view = c1Var.f41610a;
        tk tkVar = this.h;
        if (i11 != 0) {
            if (i11 != 1) {
                return;
            }
            nk E = E(i10);
            org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) view;
            int i12 = E.f25536a;
            if (i12 != 0) {
                String str = E.f25537b;
                String str2 = E.f25538c;
                if (i10 != this.f25248c.size() - 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                l7Var.d(str, str2, null, null, i12, z10);
            } else {
                l7Var.d(E.f25537b, E.f25538c, E.d.toUpperCase().substring(0, Math.min(E.d.length(), 4)), E.e, 0, false);
            }
            File file = E.f25539f;
            if (file != null) {
                l7Var.b(tkVar.R.containsKey(file.toString()), !tkVar.U);
                return;
            } else {
                l7Var.b(false, !tkVar.U);
                return;
            }
        }
        org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
        if (tkVar.f27423c0) {
            m4Var.setText(LocaleController.getString(R.string.RecentFilesAZ));
        } else {
            m4Var.setText(LocaleController.getString(R.string.RecentFiles));
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View m4Var;
        View view;
        org.telegram.ui.ActionBar.f6 f6Var = this.h.f26421a;
        Context context = this.f25249f;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    view = new View(context);
                    view.setTag(-33024);
                } else {
                    view = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.r6) null);
                }
                return new s4.c1(view);
            }
            m4Var = new org.telegram.ui.Cells.l7(context, 1, f6Var);
        } else {
            m4Var = new org.telegram.ui.Cells.m4(context, f6Var);
        }
        view = m4Var;
        return new s4.c1(view);
    }
}
