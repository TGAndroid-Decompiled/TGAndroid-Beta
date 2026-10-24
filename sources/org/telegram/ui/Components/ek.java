package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ek extends km0 {
    public final ArrayList f26068c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final Context f26069f;
    public final lk h;

    public ek(lk lkVar, Context context) {
        this.h = lkVar;
        this.f26069f = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f46345f == 1) {
            return true;
        }
        return false;
    }

    public final fk E(int i10) {
        int g10;
        ArrayList arrayList = this.f26068c;
        int size = arrayList.size();
        if (i10 < size) {
            return (fk) arrayList.get(i10);
        }
        if (this.d.isEmpty()) {
            ArrayList arrayList2 = this.e;
            if (!arrayList2.isEmpty() && i10 != size && i10 != size + 1 && (g10 = com.google.android.gms.internal.play_billing.k3.g(2, i10, arrayList)) < arrayList2.size()) {
                return (fk) arrayList2.get(g10);
            }
            return null;
        }
        return null;
    }

    @Override
    public final int h() {
        int size = this.f26068c.size();
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
        int size = this.f26068c.size();
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
    public final void v(s4.b1 b1Var, int i10) {
        boolean z10;
        int i11 = b1Var.f46345f;
        View view = b1Var.f46342a;
        lk lkVar = this.h;
        if (i11 != 0) {
            if (i11 != 1) {
                return;
            }
            fk E = E(i10);
            org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
            int i12 = E.f26332a;
            if (i12 != 0) {
                String str = E.f26333b;
                String str2 = E.f26334c;
                if (i10 != this.f26068c.size() - 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                k7Var.d(str, str2, null, null, i12, z10);
            } else {
                k7Var.d(E.f26333b, E.f26334c, E.d.toUpperCase().substring(0, Math.min(E.d.length(), 4)), E.e, 0, false);
            }
            File file = E.f26335f;
            if (file != null) {
                k7Var.b(lkVar.R.containsKey(file.toString()), !lkVar.U);
                return;
            } else {
                k7Var.b(false, !lkVar.U);
                return;
            }
        }
        org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
        if (lkVar.f28353c0) {
            l4Var.setText(LocaleController.getString(R.string.RecentFilesAZ));
        } else {
            l4Var.setText(LocaleController.getString(R.string.RecentFiles));
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View l4Var;
        View view;
        org.telegram.ui.ActionBar.g6 g6Var = this.h.f27703a;
        Context context = this.f26069f;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    view = new View(context);
                    view.setTag(-33024);
                } else {
                    view = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.b1) null);
                }
                return new s4.b1(view);
            }
            l4Var = new org.telegram.ui.Cells.k7(context, 1, g6Var);
        } else {
            l4Var = new org.telegram.ui.Cells.l4(context, g6Var);
        }
        view = l4Var;
        return new s4.b1(view);
    }
}
