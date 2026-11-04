package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public final class nj extends sj0 {
    public final int f36566c;
    public final Context d;
    public ArrayList f36567e;
    public final ArrayList f36568f;
    public Object h;
    public final Object f36569n;

    public nj(org.telegram.ui.os osVar, Context context, HashMap hashMap) {
        this.f36566c = 1;
        this.f36569n = osVar;
        this.f36568f = new ArrayList();
        this.d = context;
        for (List<org.telegram.ui.ks> list : hashMap.values()) {
            for (org.telegram.ui.ks ksVar : list) {
                this.f36568f.add(ksVar);
            }
        }
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        switch (this.f36566c) {
            case 0:
                if (d1Var.f55544f == 1) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    public oj E(int i3) {
        int f10;
        ArrayList arrayList = (ArrayList) this.h;
        ArrayList arrayList2 = this.f36567e;
        int size = arrayList2.size();
        if (i3 < size) {
            return (oj) arrayList2.get(i3);
        }
        if (this.f36568f.isEmpty() && !arrayList.isEmpty() && i3 != size && i3 != size + 1 && (f10 = k2.p1.f(2, i3, arrayList2)) < arrayList.size()) {
            return (oj) arrayList.get(f10);
        }
        return null;
    }

    @Override
    public final int b() {
        switch (this.f36566c) {
            case 0:
                ArrayList arrayList = (ArrayList) this.h;
                int size = this.f36567e.size();
                if (this.f36568f.isEmpty() && !arrayList.isEmpty()) {
                    size += arrayList.size() + 2;
                }
                return size + 1;
            default:
                ArrayList arrayList2 = this.f36567e;
                if (arrayList2 == null) {
                    return 0;
                }
                return arrayList2.size();
        }
    }

    @Override
    public final int d(int i3) {
        switch (this.f36566c) {
            case 0:
                if (i3 == b() - 1) {
                    return 3;
                }
                int size = this.f36567e.size();
                if (i3 == size) {
                    return 2;
                }
                if (i3 != size + 1) {
                    return 1;
                }
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public void f() {
        switch (this.f36566c) {
            case 0:
                super.f();
                ((uj) this.f36569n).X();
                return;
            default:
                super.f();
                return;
        }
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        boolean z10;
        int i10 = this.f36566c;
        Object obj = this.f36569n;
        String str = null;
        switch (i10) {
            case 0:
                uj ujVar = (uj) obj;
                int i11 = d1Var.f55544f;
                View view = d1Var.f55540a;
                if (i11 != 0) {
                    if (i11 == 1) {
                        oj E = E(i3);
                        org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
                        int i12 = E.f36839a;
                        if (i12 != 0) {
                            String str2 = E.f36840b;
                            String str3 = E.f36841c;
                            if (i3 != this.f36567e.size() - 1) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            g7Var.d(str2, str3, null, null, i12, z10);
                        } else {
                            g7Var.d(E.f36840b, E.f36841c, E.d.toUpperCase().substring(0, Math.min(E.d.length(), 4)), E.f36842e, 0, false);
                        }
                        File file = E.f36843f;
                        if (file != null) {
                            g7Var.b(ujVar.S.containsKey(file.toString()), !ujVar.V);
                            return;
                        } else {
                            g7Var.b(false, !ujVar.V);
                            return;
                        }
                    }
                    return;
                }
                org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                if (ujVar.f38765d0) {
                    n4Var.setText(org.telegram.messenger.bd.M0(2131746375, null));
                    return;
                } else {
                    n4Var.setText(org.telegram.messenger.bd.M0(2131746376, null));
                    return;
                }
            default:
                org.telegram.ui.ks ksVar = (org.telegram.ui.ks) this.f36567e.get(i3);
                org.telegram.ui.Cells.v9 v9Var = (org.telegram.ui.Cells.v9) d1Var.f55540a;
                CharSequence m10 = org.telegram.messenger.i6.m(org.telegram.ui.os.a0(ksVar), v9Var.getTextView().getPaint().getFontMetricsInt(), false, null, 0);
                if (((org.telegram.ui.os) obj).h) {
                    str = "+" + ksVar.f47006c;
                }
                v9Var.c(m10, str, false, false);
                return;
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View n4Var;
        View view;
        switch (this.f36566c) {
            case 0:
                org.telegram.ui.ActionBar.e6 e6Var = ((uj) this.f36569n).f38415a;
                Context context = this.d;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            view = new View(context);
                            view.setTag(-33024);
                        } else {
                            view = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.f1) null);
                        }
                        return new u4.d1(view);
                    }
                    n4Var = new org.telegram.ui.Cells.g7(1, context, e6Var);
                } else {
                    n4Var = new org.telegram.ui.Cells.n4(context, e6Var);
                }
                view = n4Var;
                return new u4.d1(view);
            default:
                return new u4.d1(org.telegram.ui.os.Z(this.d));
        }
    }

    public nj(uj ujVar, Context context) {
        this.f36566c = 0;
        this.f36569n = ujVar;
        this.f36567e = new ArrayList();
        this.f36568f = new ArrayList();
        this.h = new ArrayList();
        this.d = context;
    }
}
