package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public final class dk extends dk0 {
    public final int f34375c;
    public final Context d;
    public ArrayList f34376e;
    public final ArrayList f34377f;
    public Object h;
    public final Object f34378n;

    public dk(org.telegram.ui.ts tsVar, Context context, HashMap hashMap) {
        this.f34375c = 1;
        this.f34378n = tsVar;
        this.f34377f = new ArrayList();
        this.d = context;
        for (List<org.telegram.ui.ps> list : hashMap.values()) {
            for (org.telegram.ui.ps psVar : list) {
                this.f34377f.add(psVar);
            }
        }
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        switch (this.f34375c) {
            case 0:
                if (f1Var.f59249f == 1) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    public ek E(int i7) {
        int f10;
        ArrayList arrayList = (ArrayList) this.h;
        ArrayList arrayList2 = this.f34376e;
        int size = arrayList2.size();
        if (i7 < size) {
            return (ek) arrayList2.get(i7);
        }
        if (this.f34377f.isEmpty() && !arrayList.isEmpty() && i7 != size && i7 != size + 1 && (f10 = i5.c.f(2, i7, arrayList2)) < arrayList.size()) {
            return (ek) arrayList.get(f10);
        }
        return null;
    }

    @Override
    public final int b() {
        switch (this.f34375c) {
            case 0:
                ArrayList arrayList = (ArrayList) this.h;
                int size = this.f34376e.size();
                if (this.f34377f.isEmpty() && !arrayList.isEmpty()) {
                    size += arrayList.size() + 2;
                }
                return size + 1;
            default:
                ArrayList arrayList2 = this.f34376e;
                if (arrayList2 == null) {
                    return 0;
                }
                return arrayList2.size();
        }
    }

    @Override
    public final int d(int i7) {
        switch (this.f34375c) {
            case 0:
                if (i7 == b() - 1) {
                    return 3;
                }
                int size = this.f34376e.size();
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
        switch (this.f34375c) {
            case 0:
                super.f();
                ((kk) this.f34378n).Y();
                return;
            default:
                super.f();
                return;
        }
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        boolean z10;
        int i10 = this.f34375c;
        Object obj = this.f34378n;
        String str = null;
        switch (i10) {
            case 0:
                kk kkVar = (kk) obj;
                int i11 = f1Var.f59249f;
                View view = f1Var.f59245a;
                if (i11 != 0) {
                    if (i11 == 1) {
                        ek E = E(i7);
                        org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
                        int i12 = E.f34731a;
                        if (i12 != 0) {
                            String str2 = E.f34732b;
                            String str3 = E.f34733c;
                            if (i7 != this.f34376e.size() - 1) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            h7Var.d(str2, str3, null, null, i12, z10);
                        } else {
                            h7Var.d(E.f34732b, E.f34733c, E.d.toUpperCase().substring(0, Math.min(E.d.length(), 4)), E.f34734e, 0, false);
                        }
                        File file = E.f34735f;
                        if (file != null) {
                            h7Var.b(kkVar.S.containsKey(file.toString()), !kkVar.V);
                            return;
                        } else {
                            h7Var.b(false, !kkVar.V);
                            return;
                        }
                    }
                    return;
                }
                org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) view;
                if (kkVar.f36761d0) {
                    o4Var.setText(org.telegram.messenger.gd.N0(2131746171, null));
                    return;
                } else {
                    o4Var.setText(org.telegram.messenger.gd.N0(2131746172, null));
                    return;
                }
            default:
                org.telegram.ui.ps psVar = (org.telegram.ui.ps) this.f34376e.get(i7);
                org.telegram.ui.Cells.w9 w9Var = (org.telegram.ui.Cells.w9) f1Var.f59245a;
                CharSequence m10 = org.telegram.messenger.j6.m(org.telegram.ui.ts.a0(psVar), w9Var.getTextView().getPaint().getFontMetricsInt(), false, null, 0);
                if (((org.telegram.ui.ts) obj).h) {
                    str = "+" + psVar.f51137c;
                }
                w9Var.c(m10, str, false, false);
                return;
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View o4Var;
        View view;
        switch (this.f34375c) {
            case 0:
                org.telegram.ui.ActionBar.i6 i6Var = ((kk) this.f34378n).f37134a;
                Context context = this.d;
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            view = new View(context);
                            view.setTag(-33024);
                        } else {
                            view = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.c0) null);
                        }
                        return new v4.f1(view);
                    }
                    o4Var = new org.telegram.ui.Cells.h7(1, context, i6Var);
                } else {
                    o4Var = new org.telegram.ui.Cells.o4(context, i6Var);
                }
                view = o4Var;
                return new v4.f1(view);
            default:
                return new v4.f1(org.telegram.ui.ts.Z(this.d));
        }
    }

    public dk(kk kkVar, Context context) {
        this.f34375c = 0;
        this.f34378n = kkVar;
        this.f34376e = new ArrayList();
        this.f34377f = new ArrayList();
        this.h = new ArrayList();
        this.d = context;
    }
}
