package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class gk extends hm0 {
    public final ArrayList f26605c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final Context f26606f;
    public final nk h;

    public gk(nk nkVar, Context context) {
        this.h = nkVar;
        this.f26606f = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f45915f == 1) {
            return true;
        }
        return false;
    }

    public final hk E(int i10) {
        int g10;
        ArrayList arrayList = this.f26605c;
        int size = arrayList.size();
        if (i10 < size) {
            return (hk) arrayList.get(i10);
        }
        if (this.d.isEmpty()) {
            ArrayList arrayList2 = this.e;
            if (!arrayList2.isEmpty() && i10 != size && i10 != size + 1 && (g10 = com.google.android.gms.internal.play_billing.k3.g(2, i10, arrayList)) < arrayList2.size()) {
                return (hk) arrayList2.get(g10);
            }
            return null;
        }
        return null;
    }

    @Override
    public final int h() {
        int size = this.f26605c.size();
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
        int size = this.f26605c.size();
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
        int i11 = b1Var.f45915f;
        View view = b1Var.f45912a;
        nk nkVar = this.h;
        if (i11 != 0) {
            if (i11 != 1) {
                return;
            }
            hk E = E(i10);
            org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
            int i12 = E.f26887a;
            if (i12 != 0) {
                String str = E.f26888b;
                String str2 = E.f26889c;
                if (i10 != this.f26605c.size() - 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                i7Var.d(str, str2, null, null, i12, z10);
            } else {
                i7Var.d(E.f26888b, E.f26889c, E.d.toUpperCase().substring(0, Math.min(E.d.length(), 4)), E.e, 0, false);
            }
            File file = E.f26890f;
            if (file != null) {
                i7Var.b(nkVar.R.containsKey(file.toString()), !nkVar.U);
                return;
            } else {
                i7Var.b(false, !nkVar.U);
                return;
            }
        }
        org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
        if (nkVar.f28785c0) {
            l4Var.setText(LocaleController.getString(R.string.RecentFilesAZ));
        } else {
            l4Var.setText(LocaleController.getString(R.string.RecentFiles));
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View l4Var;
        View view;
        org.telegram.ui.ActionBar.d6 d6Var = this.h.f28222a;
        Context context = this.f26606f;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    view = new View(context);
                    view.setTag(-33024);
                } else {
                    view = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c1) null);
                }
                return new s4.b1(view);
            }
            l4Var = new org.telegram.ui.Cells.i7(context, 1, d6Var);
        } else {
            l4Var = new org.telegram.ui.Cells.l4(context, d6Var);
        }
        view = l4Var;
        return new s4.b1(view);
    }
}
