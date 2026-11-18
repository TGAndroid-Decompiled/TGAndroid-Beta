package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public final class ck extends bk0 {
    public final int f34039c;
    public final Context d;
    public ArrayList f34040e;
    public final ArrayList f34041f;
    public Object h;
    public final Object f34042n;

    public ck(org.telegram.ui.ts tsVar, Context context, HashMap hashMap) {
        this.f34039c = 1;
        this.f34042n = tsVar;
        this.f34041f = new ArrayList();
        this.d = context;
        for (List<org.telegram.ui.ps> list : hashMap.values()) {
            for (org.telegram.ui.ps psVar : list) {
                this.f34041f.add(psVar);
            }
        }
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        switch (this.f34039c) {
            case 0:
                if (f1Var.f59127f == 1) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    public dk E(int i7) {
        int f10;
        ArrayList arrayList = (ArrayList) this.h;
        ArrayList arrayList2 = this.f34040e;
        int size = arrayList2.size();
        if (i7 < size) {
            return (dk) arrayList2.get(i7);
        }
        if (this.f34041f.isEmpty() && !arrayList.isEmpty() && i7 != size && i7 != size + 1 && (f10 = i5.c.f(2, i7, arrayList2)) < arrayList.size()) {
            return (dk) arrayList.get(f10);
        }
        return null;
    }

    @Override
    public final int b() {
        switch (this.f34039c) {
            case 0:
                ArrayList arrayList = (ArrayList) this.h;
                int size = this.f34040e.size();
                if (this.f34041f.isEmpty() && !arrayList.isEmpty()) {
                    size += arrayList.size() + 2;
                }
                return size + 1;
            default:
                ArrayList arrayList2 = this.f34040e;
                if (arrayList2 == null) {
                    return 0;
                }
                return arrayList2.size();
        }
    }

    @Override
    public final int d(int i7) {
        switch (this.f34039c) {
            case 0:
                if (i7 == b() - 1) {
                    return 3;
                }
                int size = this.f34040e.size();
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
        switch (this.f34039c) {
            case 0:
                super.f();
                ((kk) this.f34042n).Y();
                return;
            default:
                super.f();
                return;
        }
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        boolean z10;
        int i10 = this.f34039c;
        Object obj = this.f34042n;
        String str = null;
        switch (i10) {
            case 0:
                kk kkVar = (kk) obj;
                int i11 = f1Var.f59127f;
                View view = f1Var.f59123a;
                if (i11 != 0) {
                    if (i11 == 1) {
                        dk E = E(i7);
                        org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
                        int i12 = E.f34452a;
                        if (i12 != 0) {
                            String str2 = E.f34453b;
                            String str3 = E.f34454c;
                            if (i7 != this.f34040e.size() - 1) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            i7Var.d(str2, str3, null, null, i12, z10);
                        } else {
                            i7Var.d(E.f34453b, E.f34454c, E.d.toUpperCase().substring(0, Math.min(E.d.length(), 4)), E.f34455e, 0, false);
                        }
                        File file = E.f34456f;
                        if (file != null) {
                            i7Var.b(kkVar.S.containsKey(file.toString()), !kkVar.V);
                            return;
                        } else {
                            i7Var.b(false, !kkVar.V);
                            return;
                        }
                    }
                    return;
                }
                org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) view;
                if (kkVar.f36776d0) {
                    o4Var.setText(org.telegram.messenger.gd.M0(2131746172, null));
                    return;
                } else {
                    o4Var.setText(org.telegram.messenger.gd.M0(2131746173, null));
                    return;
                }
            default:
                org.telegram.ui.ps psVar = (org.telegram.ui.ps) this.f34040e.get(i7);
                org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) f1Var.f59123a;
                CharSequence m10 = org.telegram.messenger.j6.m(org.telegram.ui.ts.a0(psVar), x9Var.getTextView().getPaint().getFontMetricsInt(), false, null, 0);
                if (((org.telegram.ui.ts) obj).h) {
                    str = "+" + psVar.f50922c;
                }
                x9Var.c(m10, str, false, false);
                return;
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View o4Var;
        View view;
        switch (this.f34039c) {
            case 0:
                org.telegram.ui.ActionBar.i6 i6Var = ((kk) this.f34042n).f36765a;
                Context context = this.d;
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            view = new View(context);
                            view.setTag(-33024);
                        } else {
                            view = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c0) null);
                        }
                        return new v4.f1(view);
                    }
                    o4Var = new org.telegram.ui.Cells.i7(1, context, i6Var);
                } else {
                    o4Var = new org.telegram.ui.Cells.o4(context, i6Var);
                }
                view = o4Var;
                return new v4.f1(view);
            default:
                return new v4.f1(org.telegram.ui.ts.Z(this.d));
        }
    }

    public ck(kk kkVar, Context context) {
        this.f34039c = 0;
        this.f34042n = kkVar;
        this.f34040e = new ArrayList();
        this.f34041f = new ArrayList();
        this.h = new ArrayList();
        this.d = context;
    }
}
