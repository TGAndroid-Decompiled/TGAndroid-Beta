package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public final class ek extends dk0 {
    public final int f34824c;
    public final Context d;
    public ArrayList f34825e;
    public final ArrayList f34826f;
    public Object h;
    public final Object f34827n;

    public ek(org.telegram.ui.ts tsVar, Context context, HashMap hashMap) {
        this.f34824c = 1;
        this.f34827n = tsVar;
        this.f34826f = new ArrayList();
        this.d = context;
        for (List<org.telegram.ui.ps> list : hashMap.values()) {
            for (org.telegram.ui.ps psVar : list) {
                this.f34826f.add(psVar);
            }
        }
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        switch (this.f34824c) {
            case 0:
                if (e1Var.f59115f == 1) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    public fk E(int i7) {
        int f10;
        ArrayList arrayList = (ArrayList) this.h;
        ArrayList arrayList2 = this.f34825e;
        int size = arrayList2.size();
        if (i7 < size) {
            return (fk) arrayList2.get(i7);
        }
        if (this.f34826f.isEmpty() && !arrayList.isEmpty() && i7 != size && i7 != size + 1 && (f10 = i5.c.f(2, i7, arrayList2)) < arrayList.size()) {
            return (fk) arrayList.get(f10);
        }
        return null;
    }

    @Override
    public final int b() {
        switch (this.f34824c) {
            case 0:
                ArrayList arrayList = (ArrayList) this.h;
                int size = this.f34825e.size();
                if (this.f34826f.isEmpty() && !arrayList.isEmpty()) {
                    size += arrayList.size() + 2;
                }
                return size + 1;
            default:
                ArrayList arrayList2 = this.f34825e;
                if (arrayList2 == null) {
                    return 0;
                }
                return arrayList2.size();
        }
    }

    @Override
    public final int d(int i7) {
        switch (this.f34824c) {
            case 0:
                if (i7 == b() - 1) {
                    return 3;
                }
                int size = this.f34825e.size();
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
        switch (this.f34824c) {
            case 0:
                super.f();
                ((mk) this.f34827n).Y();
                return;
            default:
                super.f();
                return;
        }
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        boolean z10;
        int i10 = this.f34824c;
        Object obj = this.f34827n;
        String str = null;
        switch (i10) {
            case 0:
                mk mkVar = (mk) obj;
                int i11 = e1Var.f59115f;
                View view = e1Var.f59111a;
                if (i11 != 0) {
                    if (i11 == 1) {
                        fk E = E(i7);
                        org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
                        int i12 = E.f35225a;
                        if (i12 != 0) {
                            String str2 = E.f35226b;
                            String str3 = E.f35227c;
                            if (i7 != this.f34825e.size() - 1) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            i7Var.d(str2, str3, null, null, i12, z10);
                        } else {
                            i7Var.d(E.f35226b, E.f35227c, E.d.toUpperCase().substring(0, Math.min(E.d.length(), 4)), E.f35228e, 0, false);
                        }
                        File file = E.f35229f;
                        if (file != null) {
                            i7Var.b(mkVar.S.containsKey(file.toString()), !mkVar.V);
                            return;
                        } else {
                            i7Var.b(false, !mkVar.V);
                            return;
                        }
                    }
                    return;
                }
                org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) view;
                if (mkVar.f37487d0) {
                    o4Var.setText(org.telegram.messenger.hd.N0(2131746171, null));
                    return;
                } else {
                    o4Var.setText(org.telegram.messenger.hd.N0(2131746172, null));
                    return;
                }
            default:
                org.telegram.ui.ps psVar = (org.telegram.ui.ps) this.f34825e.get(i7);
                org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) e1Var.f59111a;
                CharSequence m10 = org.telegram.messenger.j6.m(org.telegram.ui.ts.a0(psVar), x9Var.getTextView().getPaint().getFontMetricsInt(), false, null, 0);
                if (((org.telegram.ui.ts) obj).h) {
                    str = "+" + psVar.f50904c;
                }
                x9Var.c(m10, str, false, false);
                return;
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View o4Var;
        View view;
        switch (this.f34824c) {
            case 0:
                org.telegram.ui.ActionBar.h6 h6Var = ((mk) this.f34827n).f37476a;
                Context context = this.d;
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            view = new View(context);
                            view.setTag(-33024);
                        } else {
                            view = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c0) null);
                        }
                        return new v4.e1(view);
                    }
                    o4Var = new org.telegram.ui.Cells.i7(1, context, h6Var);
                } else {
                    o4Var = new org.telegram.ui.Cells.o4(context, h6Var);
                }
                view = o4Var;
                return new v4.e1(view);
            default:
                return new v4.e1(org.telegram.ui.ts.Z(this.d));
        }
    }

    public ek(mk mkVar, Context context) {
        this.f34824c = 0;
        this.f34827n = mkVar;
        this.f34825e = new ArrayList();
        this.f34826f = new ArrayList();
        this.h = new ArrayList();
        this.d = context;
    }
}
