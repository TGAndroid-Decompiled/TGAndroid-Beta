package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public final class nj extends oj0 {
    public final int f36317c;
    public final Context d;
    public ArrayList f36318e;
    public final ArrayList f36319f;
    public Object h;
    public final Object f36320n;

    public nj(org.telegram.ui.ts tsVar, Context context, HashMap hashMap) {
        this.f36317c = 1;
        this.f36320n = tsVar;
        this.f36319f = new ArrayList();
        this.d = context;
        for (List<org.telegram.ui.ps> list : hashMap.values()) {
            for (org.telegram.ui.ps psVar : list) {
                this.f36319f.add(psVar);
            }
        }
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        switch (this.f36317c) {
            case 0:
                if (d1Var.f57056f == 1) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    public oj E(int i7) {
        int g10;
        ArrayList arrayList = (ArrayList) this.h;
        ArrayList arrayList2 = this.f36318e;
        int size = arrayList2.size();
        if (i7 < size) {
            return (oj) arrayList2.get(i7);
        }
        if (this.f36319f.isEmpty() && !arrayList.isEmpty() && i7 != size && i7 != size + 1 && (g10 = jg.g.g(2, i7, arrayList2)) < arrayList.size()) {
            return (oj) arrayList.get(g10);
        }
        return null;
    }

    @Override
    public final int b() {
        switch (this.f36317c) {
            case 0:
                ArrayList arrayList = (ArrayList) this.h;
                int size = this.f36318e.size();
                if (this.f36319f.isEmpty() && !arrayList.isEmpty()) {
                    size += arrayList.size() + 2;
                }
                return size + 1;
            default:
                ArrayList arrayList2 = this.f36318e;
                if (arrayList2 == null) {
                    return 0;
                }
                return arrayList2.size();
        }
    }

    @Override
    public final int d(int i7) {
        switch (this.f36317c) {
            case 0:
                if (i7 == b() - 1) {
                    return 3;
                }
                int size = this.f36318e.size();
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
        switch (this.f36317c) {
            case 0:
                super.f();
                ((uj) this.f36320n).X();
                return;
            default:
                super.f();
                return;
        }
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        boolean z9;
        int i10 = this.f36317c;
        Object obj = this.f36320n;
        String str = null;
        switch (i10) {
            case 0:
                uj ujVar = (uj) obj;
                int i11 = d1Var.f57056f;
                View view = d1Var.f57052a;
                if (i11 != 0) {
                    if (i11 == 1) {
                        oj E = E(i7);
                        org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
                        int i12 = E.f36620a;
                        if (i12 != 0) {
                            String str2 = E.f36621b;
                            String str3 = E.f36622c;
                            if (i7 != this.f36318e.size() - 1) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            h7Var.d(str2, str3, null, null, i12, z9);
                        } else {
                            h7Var.d(E.f36621b, E.f36622c, E.d.toUpperCase().substring(0, Math.min(E.d.length(), 4)), E.f36623e, 0, false);
                        }
                        File file = E.f36624f;
                        if (file != null) {
                            h7Var.b(ujVar.R.containsKey(file.toString()), !ujVar.U);
                            return;
                        } else {
                            h7Var.b(false, !ujVar.U);
                            return;
                        }
                    }
                    return;
                }
                org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                if (ujVar.f38693c0) {
                    n4Var.setText(org.telegram.messenger.id.M0(2131746367, null));
                    return;
                } else {
                    n4Var.setText(org.telegram.messenger.id.M0(2131746368, null));
                    return;
                }
            default:
                org.telegram.ui.ps psVar = (org.telegram.ui.ps) this.f36318e.get(i7);
                org.telegram.ui.Cells.w9 w9Var = (org.telegram.ui.Cells.w9) d1Var.f57052a;
                CharSequence m10 = org.telegram.messenger.i6.m(org.telegram.ui.ts.a0(psVar), w9Var.getTextView().getPaint().getFontMetricsInt(), false, null, 0);
                if (((org.telegram.ui.ts) obj).h) {
                    str = "+" + psVar.f48828c;
                }
                w9Var.c(m10, str, false, false);
                return;
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View n4Var;
        View view;
        switch (this.f36317c) {
            case 0:
                org.telegram.ui.ActionBar.h6 h6Var = ((uj) this.f36320n).f38655a;
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
                    n4Var = new org.telegram.ui.Cells.h7(1, context, h6Var);
                } else {
                    n4Var = new org.telegram.ui.Cells.n4(context, h6Var);
                }
                view = n4Var;
                return new v4.d1(view);
            default:
                return new v4.d1(org.telegram.ui.ts.Z(this.d));
        }
    }

    public nj(uj ujVar, Context context) {
        this.f36317c = 0;
        this.f36320n = ujVar;
        this.f36318e = new ArrayList();
        this.f36319f = new ArrayList();
        this.h = new ArrayList();
        this.d = context;
    }
}
