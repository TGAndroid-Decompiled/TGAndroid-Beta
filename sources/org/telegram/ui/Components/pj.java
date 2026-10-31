package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public final class pj extends sk0 {
    public final int f29369c;
    public final Context d;
    public ArrayList e;
    public final ArrayList f29370f;
    public Object h;
    public final Object f29371n;

    public pj(org.telegram.ui.rt rtVar, Context context, HashMap hashMap) {
        this.f29369c = 1;
        this.f29371n = rtVar;
        this.f29370f = new ArrayList();
        this.d = context;
        for (List<org.telegram.ui.nt> list : hashMap.values()) {
            for (org.telegram.ui.nt ntVar : list) {
                this.f29370f.add(ntVar);
            }
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        switch (this.f29369c) {
            case 0:
                if (c1Var.f47901f == 1) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    public qj E(int i10) {
        int e;
        ArrayList arrayList = (ArrayList) this.h;
        ArrayList arrayList2 = this.e;
        int size = arrayList2.size();
        if (i10 < size) {
            return (qj) arrayList2.get(i10);
        }
        if (this.f29370f.isEmpty() && !arrayList.isEmpty() && i10 != size && i10 != size + 1 && (e = sc.e.e(2, i10, arrayList2)) < arrayList.size()) {
            return (qj) arrayList.get(e);
        }
        return null;
    }

    @Override
    public final int b() {
        switch (this.f29369c) {
            case 0:
                ArrayList arrayList = (ArrayList) this.h;
                int size = this.e.size();
                if (this.f29370f.isEmpty() && !arrayList.isEmpty()) {
                    size += arrayList.size() + 2;
                }
                return size + 1;
            default:
                ArrayList arrayList2 = this.e;
                if (arrayList2 == null) {
                    return 0;
                }
                return arrayList2.size();
        }
    }

    @Override
    public final int d(int i10) {
        switch (this.f29369c) {
            case 0:
                if (i10 == b() - 1) {
                    return 3;
                }
                int size = this.e.size();
                if (i10 == size) {
                    return 2;
                }
                if (i10 != size + 1) {
                    return 1;
                }
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public void f() {
        switch (this.f29369c) {
            case 0:
                super.f();
                ((xj) this.f29371n).W();
                return;
            default:
                super.f();
                return;
        }
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        boolean z10;
        int i11 = this.f29369c;
        Object obj = this.f29371n;
        String str = null;
        switch (i11) {
            case 0:
                xj xjVar = (xj) obj;
                int i12 = c1Var.f47901f;
                View view = c1Var.f47898a;
                if (i12 != 0) {
                    if (i12 == 1) {
                        qj E = E(i10);
                        org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) view;
                        int i13 = E.f29665a;
                        if (i13 != 0) {
                            String str2 = E.f29666b;
                            String str3 = E.f29667c;
                            if (i10 != this.e.size() - 1) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            l7Var.d(str2, str3, null, null, i13, z10);
                        } else {
                            l7Var.d(E.f29666b, E.f29667c, E.d.toUpperCase().substring(0, Math.min(E.d.length(), 4)), E.e, 0, false);
                        }
                        File file = E.f29668f;
                        if (file != null) {
                            l7Var.b(xjVar.R.containsKey(file.toString()), !xjVar.U);
                            return;
                        } else {
                            l7Var.b(false, !xjVar.U);
                            return;
                        }
                    }
                    return;
                }
                org.telegram.ui.Cells.p4 p4Var = (org.telegram.ui.Cells.p4) view;
                if (xjVar.f32482c0) {
                    p4Var.setText(org.telegram.messenger.cd.L0(2131746382, null));
                    return;
                } else {
                    p4Var.setText(org.telegram.messenger.cd.L0(2131746383, null));
                    return;
                }
            default:
                org.telegram.ui.nt ntVar = (org.telegram.ui.nt) this.e.get(i10);
                org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) c1Var.f47898a;
                CharSequence m10 = org.telegram.messenger.k6.m(org.telegram.ui.rt.Z(ntVar), x9Var.getTextView().getPaint().getFontMetricsInt(), false, null, 0);
                if (((org.telegram.ui.rt) obj).h) {
                    str = "+" + ntVar.f40049c;
                }
                x9Var.c(m10, str, false, false);
                return;
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View p4Var;
        View view;
        switch (this.f29369c) {
            case 0:
                org.telegram.ui.ActionBar.p6 p6Var = ((xj) this.f29371n).f30946a;
                Context context = this.d;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            view = new View(context);
                            view.setTag(-33024);
                        } else {
                            view = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.f1) null);
                        }
                        return new s4.c1(view);
                    }
                    p4Var = new org.telegram.ui.Cells.l7(1, context, p6Var);
                } else {
                    p4Var = new org.telegram.ui.Cells.p4(context, p6Var);
                }
                view = p4Var;
                return new s4.c1(view);
            default:
                return new s4.c1(org.telegram.ui.rt.Y(this.d));
        }
    }

    public pj(xj xjVar, Context context) {
        this.f29369c = 0;
        this.f29371n = xjVar;
        this.e = new ArrayList();
        this.f29370f = new ArrayList();
        this.h = new ArrayList();
        this.d = context;
    }
}
