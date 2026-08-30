package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class zj extends rl0 {
    public final ArrayList f31362c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final Context f31363f;
    public final hk h;

    public zj(hk hkVar, Context context) {
        this.h = hkVar;
        this.f31363f = context;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        if (l1Var.f5788f == 1) {
            return true;
        }
        return false;
    }

    public final ak E(int i10) {
        int f10;
        ArrayList arrayList = this.f31362c;
        int size = arrayList.size();
        if (i10 < size) {
            return (ak) arrayList.get(i10);
        }
        if (this.d.isEmpty()) {
            ArrayList arrayList2 = this.e;
            if (!arrayList2.isEmpty() && i10 != size && i10 != size + 1 && (f10 = org.telegram.ui.yh.f(2, i10, arrayList)) < arrayList2.size()) {
                return (ak) arrayList2.get(f10);
            }
            return null;
        }
        return null;
    }

    @Override
    public final int h() {
        int size = this.f31362c.size();
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
        int size = this.f31362c.size();
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
    public final void v(f2.l1 l1Var, int i10) {
        boolean z4;
        int i11 = l1Var.f5788f;
        View view = l1Var.f5785a;
        hk hkVar = this.h;
        if (i11 != 0) {
            if (i11 != 1) {
                return;
            }
            ak E = E(i10);
            org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
            int i12 = E.f23412a;
            if (i12 != 0) {
                String str = E.f23413b;
                String str2 = E.f23414c;
                if (i10 != this.f31362c.size() - 1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                i7Var.d(z4, str, i12, str2, null, null);
            } else {
                i7Var.d(false, E.f23413b, 0, E.f23414c, E.d.toUpperCase().substring(0, Math.min(E.d.length(), 4)), E.e);
            }
            File file = E.f23415f;
            if (file != null) {
                i7Var.b(hkVar.O.containsKey(file.toString()), !hkVar.R);
                return;
            } else {
                i7Var.b(false, !hkVar.R);
                return;
            }
        }
        org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
        if (hkVar.W) {
            m4Var.setText(LocaleController.getString(R.string.RecentFilesAZ));
        } else {
            m4Var.setText(LocaleController.getString(R.string.RecentFiles));
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View m4Var;
        View view;
        org.telegram.ui.ActionBar.f6 f6Var = this.h.f24277a;
        Context context = this.f31363f;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    view = new View(context);
                    view.setTag(-33024);
                } else {
                    view = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.b) null);
                }
                return new f2.l1(view);
            }
            m4Var = new org.telegram.ui.Cells.i7(context, 1, f6Var);
        } else {
            m4Var = new org.telegram.ui.Cells.m4(context, f6Var);
        }
        view = m4Var;
        return new f2.l1(view);
    }
}
