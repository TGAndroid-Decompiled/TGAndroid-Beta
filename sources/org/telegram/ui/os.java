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
public final class os extends org.telegram.ui.Components.kj0 {
    public final Context f48543r;
    public final HashMap f48544s = new HashMap();
    public final ArrayList f48545w = new ArrayList();
    public final qs f48546x;

    public os(qs qsVar, Context context, ArrayList arrayList, boolean z9) {
        Comparator rv0Var;
        Locale locale;
        this.f48546x = qsVar;
        this.f48543r = context;
        if (arrayList != null) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                ms msVar = (ms) arrayList.get(i7);
                String upperCase = msVar.f47842a.substring(0, 1).toUpperCase();
                ArrayList arrayList2 = (ArrayList) this.f48544s.get(upperCase);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    this.f48544s.put(upperCase, arrayList2);
                    this.f48545w.add(upperCase);
                }
                arrayList2.add(msVar);
            }
        } else {
            try {
                InputStream open = org.telegram.messenger.t0.f25555b.getResources().getAssets().open("countries.txt");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    String[] split = readLine.split(";");
                    ?? obj = new Object();
                    obj.f47842a = split[2];
                    obj.f47844c = split[0];
                    String str = split[1];
                    obj.d = str;
                    if (!str.equals("FT") || !z9) {
                        String upperCase2 = obj.f47842a.substring(0, 1).toUpperCase();
                        ArrayList arrayList3 = (ArrayList) this.f48544s.get(upperCase2);
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                            this.f48544s.put(upperCase2, arrayList3);
                            this.f48545w.add(upperCase2);
                        }
                        arrayList3.add(obj);
                    }
                }
                bufferedReader.close();
                open.close();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        if (Build.VERSION.SDK_INT >= 24) {
            if (org.telegram.messenger.hd.E0().f22899y != null) {
                locale = org.telegram.messenger.hd.E0().f22899y;
            } else {
                locale = Locale.getDefault();
            }
            Collator collator = Collator.getInstance(locale);
            Objects.requireNonNull(collator);
            rv0Var = new bi.s5(collator, 8);
        } else {
            rv0Var = new rv0(13);
        }
        Collections.sort(this.f48545w, rv0Var);
        for (ArrayList arrayList4 : this.f48544s.values()) {
            Collections.sort(arrayList4, new ns(rv0Var, 0));
        }
    }

    @Override
    public final String F(int i7) {
        int S = S(i7);
        ArrayList arrayList = this.f48545w;
        if (S == -1) {
            S = arrayList.size() - 1;
        }
        return (String) arrayList.get(S);
    }

    @Override
    public final void G(org.telegram.ui.Components.pj0 pj0Var, float f10, int[] iArr) {
        iArr[0] = (int) (b() * f10);
        iArr[1] = 0;
    }

    @Override
    public final int M(int i7) {
        ArrayList arrayList = this.f48545w;
        int size = ((ArrayList) this.f48544s.get(arrayList.get(i7))).size();
        if (i7 != arrayList.size() - 1) {
            return size + 1;
        }
        return size;
    }

    @Override
    public final int P(int i7, int i10) {
        if (i10 < ((ArrayList) this.f48544s.get(this.f48545w.get(i7))).size()) {
            return 0;
        }
        return 1;
    }

    @Override
    public final int R() {
        return this.f48545w.size();
    }

    @Override
    public final View T(int i7, View view) {
        return null;
    }

    @Override
    public final boolean V(int i7, int i10, v4.d1 d1Var) {
        if (i10 < ((ArrayList) this.f48544s.get(this.f48545w.get(i7))).size()) {
            return true;
        }
        return false;
    }

    @Override
    public final void W(int i7, int i10, v4.d1 d1Var) {
        if (d1Var.f56931f == 0) {
            ms msVar = (ms) ((ArrayList) this.f48544s.get(this.f48545w.get(i7))).get(i10);
            org.telegram.ui.Cells.w9 w9Var = (org.telegram.ui.Cells.w9) d1Var.f56927a;
            String str = null;
            CharSequence m10 = org.telegram.messenger.i6.m(qs.a0(msVar), w9Var.getTextView().getPaint().getFontMetricsInt(), false, null, 0);
            if (this.f48546x.h) {
                str = "+" + msVar.f47844c;
            }
            w9Var.c(m10, str, false, false);
        }
    }

    @Override
    public final ms O(int i7, int i10) {
        if (i7 >= 0) {
            ArrayList arrayList = this.f48545w;
            if (i7 < arrayList.size()) {
                ArrayList arrayList2 = (ArrayList) this.f48544s.get(arrayList.get(i7));
                if (i10 >= 0 && i10 < arrayList2.size()) {
                    return (ms) arrayList2.get(i10);
                }
            }
        }
        return null;
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View Z;
        Context context = this.f48543r;
        if (i7 != 0) {
            Z = new org.telegram.ui.Cells.e3(context, null);
            Z.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(8.0f));
        } else {
            Z = qs.Z(context);
        }
        return new v4.d1(Z);
    }
}
