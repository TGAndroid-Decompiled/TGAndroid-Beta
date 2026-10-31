package org.telegram.ui;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Locale;
public final class pt extends org.telegram.ui.Components.ok0 {
    public final Context f40782r;
    public final HashMap f40783s = new HashMap();
    public final ArrayList f40784w = new ArrayList();
    public final rt f40785x;

    public pt(rt rtVar, Context context, ArrayList arrayList, boolean z10) {
        Comparator dVar;
        Locale locale;
        this.f40785x = rtVar;
        this.f40782r = context;
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                nt ntVar = (nt) arrayList.get(i10);
                String upperCase = ntVar.f40047a.substring(0, 1).toUpperCase();
                ArrayList arrayList2 = (ArrayList) this.f40783s.get(upperCase);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    this.f40783s.put(upperCase, arrayList2);
                    this.f40784w.add(upperCase);
                }
                arrayList2.add(ntVar);
            }
        } else {
            try {
                InputStream open = org.telegram.messenger.w0.f19025b.getResources().getAssets().open("countries.txt");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    String[] split = readLine.split(";");
                    ?? obj = new Object();
                    obj.f40047a = split[2];
                    obj.f40049c = split[0];
                    String str = split[1];
                    obj.d = str;
                    if (!str.equals("FT") || !z10) {
                        String upperCase2 = obj.f40047a.substring(0, 1).toUpperCase();
                        ArrayList arrayList3 = (ArrayList) this.f40783s.get(upperCase2);
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                            this.f40783s.put(upperCase2, arrayList3);
                            this.f40784w.add(upperCase2);
                        }
                        arrayList3.add(obj);
                    }
                }
                bufferedReader.close();
                open.close();
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
        if (Build.VERSION.SDK_INT >= 24) {
            if (org.telegram.messenger.cd.D0().f15003y != null) {
                locale = org.telegram.messenger.cd.D0().f15003y;
            } else {
                locale = Locale.getDefault();
            }
            Collator collator = Collator.getInstance(locale);
            Objects.requireNonNull(collator);
            dVar = new bi.v6(collator, 2);
        } else {
            dVar = new a4.d(11);
        }
        Collections.sort(this.f40784w, dVar);
        for (ArrayList arrayList4 : this.f40783s.values()) {
            Collections.sort(arrayList4, new ot(dVar, 0));
        }
    }

    @Override
    public final String F(int i10) {
        int S = S(i10);
        ArrayList arrayList = this.f40784w;
        if (S == -1) {
            S = arrayList.size() - 1;
        }
        return (String) arrayList.get(S);
    }

    @Override
    public final void G(org.telegram.ui.Components.tk0 tk0Var, float f7, int[] iArr) {
        iArr[0] = (int) (b() * f7);
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        ArrayList arrayList = this.f40784w;
        int size = ((ArrayList) this.f40783s.get(arrayList.get(i10))).size();
        if (i10 != arrayList.size() - 1) {
            return size + 1;
        }
        return size;
    }

    @Override
    public final int P(int i10, int i11) {
        if (i11 < ((ArrayList) this.f40783s.get(this.f40784w.get(i10))).size()) {
            return 0;
        }
        return 1;
    }

    @Override
    public final int R() {
        return this.f40784w.size();
    }

    @Override
    public final View T(int i10, View view) {
        return null;
    }

    @Override
    public final boolean V(int i10, int i11, s4.c1 c1Var) {
        if (i11 < ((ArrayList) this.f40783s.get(this.f40784w.get(i10))).size()) {
            return true;
        }
        return false;
    }

    @Override
    public final void W(int i10, int i11, s4.c1 c1Var) {
        if (c1Var.f47901f == 0) {
            nt ntVar = (nt) ((ArrayList) this.f40783s.get(this.f40784w.get(i10))).get(i11);
            org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) c1Var.f47898a;
            String str = null;
            CharSequence m10 = org.telegram.messenger.k6.m(rt.Z(ntVar), x9Var.getTextView().getPaint().getFontMetricsInt(), false, null, 0);
            if (this.f40785x.h) {
                str = "+" + ntVar.f40049c;
            }
            x9Var.c(m10, str, false, false);
        }
    }

    @Override
    public final nt O(int i10, int i11) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f40784w;
            if (i10 < arrayList.size()) {
                ArrayList arrayList2 = (ArrayList) this.f40783s.get(arrayList.get(i10));
                if (i11 >= 0 && i11 < arrayList2.size()) {
                    return (nt) arrayList2.get(i11);
                }
            }
        }
        return null;
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View Y;
        Context context = this.f40782r;
        if (i10 != 0) {
            Y = new org.telegram.ui.Cells.g3(context, null);
            Y.setPadding(org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(8.0f));
        } else {
            Y = rt.Y(context);
        }
        return new s4.c1(Y);
    }
}
