package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ik extends lm0 {
    public final ArrayList f25648c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final Context f25649f;
    public final pk h;

    public ik(pk pkVar, Context context) {
        this.h = pkVar;
        this.f25649f = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f44841f == 1) {
            return true;
        }
        return false;
    }

    public final jk E(int i10) {
        int g10;
        ArrayList arrayList = this.f25648c;
        int size = arrayList.size();
        if (i10 < size) {
            return (jk) arrayList.get(i10);
        }
        if (this.d.isEmpty()) {
            ArrayList arrayList2 = this.e;
            if (!arrayList2.isEmpty() && i10 != size && i10 != size + 1 && (g10 = com.google.android.gms.internal.play_billing.k3.g(2, i10, arrayList)) < arrayList2.size()) {
                return (jk) arrayList2.get(g10);
            }
            return null;
        }
        return null;
    }

    @Override
    public final int h() {
        int size = this.f25648c.size();
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
        int size = this.f25648c.size();
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
        int i11 = b1Var.f44841f;
        View view = b1Var.f44838a;
        pk pkVar = this.h;
        if (i11 != 0) {
            if (i11 != 1) {
                return;
            }
            jk E = E(i10);
            org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) view;
            int i12 = E.f26066a;
            if (i12 != 0) {
                String str = E.f26067b;
                String str2 = E.f26068c;
                if (i10 != this.f25648c.size() - 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                j7Var.d(str, str2, null, null, i12, z10);
            } else {
                j7Var.d(E.f26067b, E.f26068c, E.d.toUpperCase().substring(0, Math.min(E.d.length(), 4)), E.e, 0, false);
            }
            File file = E.f26069f;
            if (file != null) {
                j7Var.b(pkVar.R.containsKey(file.toString()), !pkVar.U);
                return;
            } else {
                j7Var.b(false, !pkVar.U);
                return;
            }
        }
        org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
        if (pkVar.f28037c0) {
            m4Var.setText(LocaleController.getString(R.string.RecentFilesAZ));
        } else {
            m4Var.setText(LocaleController.getString(R.string.RecentFiles));
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View m4Var;
        View view;
        org.telegram.ui.ActionBar.c6 c6Var = this.h.f27359a;
        Context context = this.f25649f;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    view = new View(context);
                    view.setTag(-33024);
                } else {
                    view = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.c1) null);
                }
                return new s4.b1(view);
            }
            m4Var = new org.telegram.ui.Cells.j7(context, 1, c6Var);
        } else {
            m4Var = new org.telegram.ui.Cells.m4(context, c6Var);
        }
        view = m4Var;
        return new s4.b1(view);
    }
}
