package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public final class oj extends oj0 {
    public final int f36733c;
    public final Context d;
    public ArrayList f36734e;
    public final ArrayList f36735f;
    public Object h;
    public final Object f36736n;

    public oj(org.telegram.ui.qs qsVar, Context context, HashMap hashMap) {
        this.f36733c = 1;
        this.f36736n = qsVar;
        this.f36735f = new ArrayList();
        this.d = context;
        for (List<org.telegram.ui.ms> list : hashMap.values()) {
            for (org.telegram.ui.ms msVar : list) {
                this.f36735f.add(msVar);
            }
        }
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        switch (this.f36733c) {
            case 0:
                if (d1Var.f56931f == 1) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    public pj E(int i7) {
        int g10;
        ArrayList arrayList = (ArrayList) this.h;
        ArrayList arrayList2 = this.f36734e;
        int size = arrayList2.size();
        if (i7 < size) {
            return (pj) arrayList2.get(i7);
        }
        if (this.f36735f.isEmpty() && !arrayList.isEmpty() && i7 != size && i7 != size + 1 && (g10 = jg.g.g(2, i7, arrayList2)) < arrayList.size()) {
            return (pj) arrayList.get(g10);
        }
        return null;
    }

    @Override
    public final int b() {
        switch (this.f36733c) {
            case 0:
                ArrayList arrayList = (ArrayList) this.h;
                int size = this.f36734e.size();
                if (this.f36735f.isEmpty() && !arrayList.isEmpty()) {
                    size += arrayList.size() + 2;
                }
                return size + 1;
            default:
                ArrayList arrayList2 = this.f36734e;
                if (arrayList2 == null) {
                    return 0;
                }
                return arrayList2.size();
        }
    }

    @Override
    public final int d(int i7) {
        switch (this.f36733c) {
            case 0:
                if (i7 == b() - 1) {
                    return 3;
                }
                int size = this.f36734e.size();
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
        switch (this.f36733c) {
            case 0:
                super.f();
                ((vj) this.f36736n).X();
                return;
            default:
                super.f();
                return;
        }
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        boolean z9;
        int i10 = this.f36733c;
        Object obj = this.f36736n;
        String str = null;
        switch (i10) {
            case 0:
                vj vjVar = (vj) obj;
                int i11 = d1Var.f56931f;
                View view = d1Var.f56927a;
                if (i11 != 0) {
                    if (i11 == 1) {
                        pj E = E(i7);
                        org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
                        int i12 = E.f37027a;
                        if (i12 != 0) {
                            String str2 = E.f37028b;
                            String str3 = E.f37029c;
                            if (i7 != this.f36734e.size() - 1) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            h7Var.d(str2, str3, null, null, i12, z9);
                        } else {
                            h7Var.d(E.f37028b, E.f37029c, E.d.toUpperCase().substring(0, Math.min(E.d.length(), 4)), E.f37030e, 0, false);
                        }
                        File file = E.f37031f;
                        if (file != null) {
                            h7Var.b(vjVar.R.containsKey(file.toString()), !vjVar.U);
                            return;
                        } else {
                            h7Var.b(false, !vjVar.U);
                            return;
                        }
                    }
                    return;
                }
                org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                if (vjVar.f38962c0) {
                    n4Var.setText(org.telegram.messenger.hd.M0(2131746366, null));
                    return;
                } else {
                    n4Var.setText(org.telegram.messenger.hd.M0(2131746367, null));
                    return;
                }
            default:
                org.telegram.ui.ms msVar = (org.telegram.ui.ms) this.f36734e.get(i7);
                org.telegram.ui.Cells.w9 w9Var = (org.telegram.ui.Cells.w9) d1Var.f56927a;
                CharSequence m10 = org.telegram.messenger.i6.m(org.telegram.ui.qs.a0(msVar), w9Var.getTextView().getPaint().getFontMetricsInt(), false, null, 0);
                if (((org.telegram.ui.qs) obj).h) {
                    str = "+" + msVar.f47844c;
                }
                w9Var.c(m10, str, false, false);
                return;
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View n4Var;
        View view;
        switch (this.f36733c) {
            case 0:
                org.telegram.ui.ActionBar.f6 f6Var = ((vj) this.f36736n).f38950a;
                Context context = this.d;
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            view = new View(context);
                            view.setTag(-33024);
                        } else {
                            view = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.f1) null);
                        }
                        return new v4.d1(view);
                    }
                    n4Var = new org.telegram.ui.Cells.h7(1, context, f6Var);
                } else {
                    n4Var = new org.telegram.ui.Cells.n4(context, f6Var);
                }
                view = n4Var;
                return new v4.d1(view);
            default:
                return new v4.d1(org.telegram.ui.qs.Z(this.d));
        }
    }

    public oj(vj vjVar, Context context) {
        this.f36733c = 0;
        this.f36736n = vjVar;
        this.f36734e = new ArrayList();
        this.f36735f = new ArrayList();
        this.h = new ArrayList();
        this.d = context;
    }
}
