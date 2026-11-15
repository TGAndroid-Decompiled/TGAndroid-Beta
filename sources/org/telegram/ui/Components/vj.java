package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public final class vj extends tj0 {
    public final int f40446c;
    public final Context d;
    public ArrayList f40447e;
    public final ArrayList f40448f;
    public Object h;
    public final Object f40449n;

    public vj(org.telegram.ui.ts tsVar, Context context, HashMap hashMap) {
        this.f40446c = 1;
        this.f40449n = tsVar;
        this.f40448f = new ArrayList();
        this.d = context;
        for (List<org.telegram.ui.ps> list : hashMap.values()) {
            for (org.telegram.ui.ps psVar : list) {
                this.f40448f.add(psVar);
            }
        }
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        switch (this.f40446c) {
            case 0:
                if (e1Var.f58539f == 1) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    public wj E(int i7) {
        int f10;
        ArrayList arrayList = (ArrayList) this.h;
        ArrayList arrayList2 = this.f40447e;
        int size = arrayList2.size();
        if (i7 < size) {
            return (wj) arrayList2.get(i7);
        }
        if (this.f40448f.isEmpty() && !arrayList.isEmpty() && i7 != size && i7 != size + 1 && (f10 = i5.c.f(2, i7, arrayList2)) < arrayList.size()) {
            return (wj) arrayList.get(f10);
        }
        return null;
    }

    @Override
    public final int b() {
        switch (this.f40446c) {
            case 0:
                ArrayList arrayList = (ArrayList) this.h;
                int size = this.f40447e.size();
                if (this.f40448f.isEmpty() && !arrayList.isEmpty()) {
                    size += arrayList.size() + 2;
                }
                return size + 1;
            default:
                ArrayList arrayList2 = this.f40447e;
                if (arrayList2 == null) {
                    return 0;
                }
                return arrayList2.size();
        }
    }

    @Override
    public final int d(int i7) {
        switch (this.f40446c) {
            case 0:
                if (i7 == b() - 1) {
                    return 3;
                }
                int size = this.f40447e.size();
                if (i7 == size) {
                    return 2;
                }
                if (i7 != size + 1) {
                    return 1;
                }
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public void f() {
        switch (this.f40446c) {
            case 0:
                super.f();
                ((dk) this.f40449n).Y();
                return;
            default:
                super.f();
                return;
        }
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        boolean z10;
        int i10 = this.f40446c;
        Object obj = this.f40449n;
        String str = null;
        switch (i10) {
            case 0:
                dk dkVar = (dk) obj;
                int i11 = e1Var.f58539f;
                View view = e1Var.f58535a;
                if (i11 != 0) {
                    if (i11 == 1) {
                        wj E = E(i7);
                        org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
                        int i12 = E.f41365a;
                        if (i12 != 0) {
                            String str2 = E.f41366b;
                            String str3 = E.f41367c;
                            if (i7 != this.f40447e.size() - 1) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            g7Var.d(str2, str3, null, null, i12, z10);
                        } else {
                            g7Var.d(E.f41366b, E.f41367c, E.d.toUpperCase().substring(0, Math.min(E.d.length(), 4)), E.f41368e, 0, false);
                        }
                        File file = E.f41369f;
                        if (file != null) {
                            g7Var.b(dkVar.S.containsKey(file.toString()), !dkVar.V);
                            return;
                        } else {
                            g7Var.b(false, !dkVar.V);
                            return;
                        }
                    }
                    return;
                }
                org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                if (dkVar.f33947d0) {
                    n4Var.setText(org.telegram.messenger.hd.M0(2131746367, null));
                    return;
                } else {
                    n4Var.setText(org.telegram.messenger.hd.M0(2131746368, null));
                    return;
                }
            default:
                org.telegram.ui.ps psVar = (org.telegram.ui.ps) this.f40447e.get(i7);
                org.telegram.ui.Cells.v9 v9Var = (org.telegram.ui.Cells.v9) e1Var.f58535a;
                CharSequence m10 = org.telegram.messenger.j6.m(org.telegram.ui.ts.a0(psVar), v9Var.getTextView().getPaint().getFontMetricsInt(), false, null, 0);
                if (((org.telegram.ui.ts) obj).h) {
                    str = "+" + psVar.f50351c;
                }
                v9Var.c(m10, str, false, false);
                return;
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View n4Var;
        View view;
        switch (this.f40446c) {
            case 0:
                org.telegram.ui.ActionBar.e6 e6Var = ((dk) this.f40449n).f33608a;
                Context context = this.d;
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            view = new View(context);
                            view.setTag(-33024);
                        } else {
                            view = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.y0) null);
                        }
                        return new v4.e1(view);
                    }
                    n4Var = new org.telegram.ui.Cells.g7(1, context, e6Var);
                } else {
                    n4Var = new org.telegram.ui.Cells.n4(context, e6Var);
                }
                view = n4Var;
                return new v4.e1(view);
            default:
                return new v4.e1(org.telegram.ui.ts.Z(this.d));
        }
    }

    public vj(dk dkVar, Context context) {
        this.f40446c = 0;
        this.f40449n = dkVar;
        this.f40447e = new ArrayList();
        this.f40448f = new ArrayList();
        this.h = new ArrayList();
        this.d = context;
    }
}
