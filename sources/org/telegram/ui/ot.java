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
public final class ot extends org.telegram.ui.Components.pk0 {
    public final Context f40263r;
    public final HashMap f40264s = new HashMap();
    public final ArrayList f40265w = new ArrayList();
    public final qt f40266x;

    public ot(qt qtVar, Context context, ArrayList arrayList, boolean z10) {
        Comparator dVar;
        Locale locale;
        this.f40266x = qtVar;
        this.f40263r = context;
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                mt mtVar = (mt) arrayList.get(i10);
                String upperCase = mtVar.f39611a.substring(0, 1).toUpperCase();
                ArrayList arrayList2 = (ArrayList) this.f40264s.get(upperCase);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    this.f40264s.put(upperCase, arrayList2);
                    this.f40265w.add(upperCase);
                }
                arrayList2.add(mtVar);
            }
        } else {
            try {
                InputStream open = org.telegram.messenger.w0.f18945b.getResources().getAssets().open("countries.txt");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    String[] split = readLine.split(";");
                    ?? obj = new Object();
                    obj.f39611a = split[2];
                    obj.f39613c = split[0];
                    String str = split[1];
                    obj.d = str;
                    if (!str.equals("FT") || !z10) {
                        String upperCase2 = obj.f39611a.substring(0, 1).toUpperCase();
                        ArrayList arrayList3 = (ArrayList) this.f40264s.get(upperCase2);
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                            this.f40264s.put(upperCase2, arrayList3);
                            this.f40265w.add(upperCase2);
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
            if (org.telegram.messenger.dd.D0().f15365y != null) {
                locale = org.telegram.messenger.dd.D0().f15365y;
            } else {
                locale = Locale.getDefault();
            }
            Collator collator = Collator.getInstance(locale);
            Objects.requireNonNull(collator);
            dVar = new bi.v6(collator, 2);
        } else {
            dVar = new a4.d(11);
        }
        Collections.sort(this.f40265w, dVar);
        for (ArrayList arrayList4 : this.f40264s.values()) {
            Collections.sort(arrayList4, new nt(dVar, 0));
        }
    }

    @Override
    public final String F(int i10) {
        int S = S(i10);
        ArrayList arrayList = this.f40265w;
        if (S == -1) {
            S = arrayList.size() - 1;
        }
        return (String) arrayList.get(S);
    }

    @Override
    public final void G(org.telegram.ui.Components.uk0 uk0Var, float f7, int[] iArr) {
        iArr[0] = (int) (b() * f7);
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        ArrayList arrayList = this.f40265w;
        int size = ((ArrayList) this.f40264s.get(arrayList.get(i10))).size();
        if (i10 != arrayList.size() - 1) {
            return size + 1;
        }
        return size;
    }

    @Override
    public final int P(int i10, int i11) {
        if (i11 < ((ArrayList) this.f40264s.get(this.f40265w.get(i10))).size()) {
            return 0;
        }
        return 1;
    }

    @Override
    public final int R() {
        return this.f40265w.size();
    }

    @Override
    public final View T(int i10, View view) {
        return null;
    }

    @Override
    public final boolean V(int i10, int i11, s4.c1 c1Var) {
        if (i11 < ((ArrayList) this.f40264s.get(this.f40265w.get(i10))).size()) {
            return true;
        }
        return false;
    }

    @Override
    public final void W(int i10, int i11, s4.c1 c1Var) {
        if (c1Var.f47912f == 0) {
            mt mtVar = (mt) ((ArrayList) this.f40264s.get(this.f40265w.get(i10))).get(i11);
            org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) c1Var.f47909a;
            String str = null;
            CharSequence m10 = org.telegram.messenger.k6.m(qt.a0(mtVar), x9Var.getTextView().getPaint().getFontMetricsInt(), false, null, 0);
            if (this.f40266x.h) {
                str = "+" + mtVar.f39613c;
            }
            x9Var.c(m10, str, false, false);
        }
    }

    @Override
    public final mt O(int i10, int i11) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f40265w;
            if (i10 < arrayList.size()) {
                ArrayList arrayList2 = (ArrayList) this.f40264s.get(arrayList.get(i10));
                if (i11 >= 0 && i11 < arrayList2.size()) {
                    return (mt) arrayList2.get(i11);
                }
            }
        }
        return null;
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View Z;
        Context context = this.f40263r;
        if (i10 != 0) {
            Z = new org.telegram.ui.Cells.g3(context, null);
            Z.setPadding(org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(8.0f));
        } else {
            Z = qt.Z(context);
        }
        return new s4.c1(Z);
    }
}
