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
public final class ms extends org.telegram.ui.Components.oj0 {
    public final Context f47772r;
    public final HashMap f47773s = new HashMap();
    public final ArrayList f47774w = new ArrayList();
    public final os f47775x;

    public ms(os osVar, Context context, ArrayList arrayList, boolean z10) {
        Comparator i1Var;
        Locale locale;
        this.f47775x = osVar;
        this.f47772r = context;
        if (arrayList != null) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                ks ksVar = (ks) arrayList.get(i3);
                String upperCase = ksVar.f47004a.substring(0, 1).toUpperCase();
                ArrayList arrayList2 = (ArrayList) this.f47773s.get(upperCase);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    this.f47773s.put(upperCase, arrayList2);
                    this.f47774w.add(upperCase);
                }
                arrayList2.add(ksVar);
            }
        } else {
            try {
                InputStream open = org.telegram.messenger.t0.f25457b.getResources().getAssets().open("countries.txt");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    String[] split = readLine.split(";");
                    ?? obj = new Object();
                    obj.f47004a = split[2];
                    obj.f47006c = split[0];
                    String str = split[1];
                    obj.d = str;
                    if (!str.equals("FT") || !z10) {
                        String upperCase2 = obj.f47004a.substring(0, 1).toUpperCase();
                        ArrayList arrayList3 = (ArrayList) this.f47773s.get(upperCase2);
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                            this.f47773s.put(upperCase2, arrayList3);
                            this.f47774w.add(upperCase2);
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
            if (org.telegram.messenger.bd.E0().f21812y != null) {
                locale = org.telegram.messenger.bd.E0().f21812y;
            } else {
                locale = Locale.getDefault();
            }
            Collator collator = Collator.getInstance(locale);
            Objects.requireNonNull(collator);
            i1Var = new ci.y4(collator, 6);
        } else {
            i1Var = new vg.i1(1);
        }
        Collections.sort(this.f47774w, i1Var);
        for (ArrayList arrayList4 : this.f47773s.values()) {
            Collections.sort(arrayList4, new ls(i1Var, 0));
        }
    }

    @Override
    public final String F(int i3) {
        int S = S(i3);
        ArrayList arrayList = this.f47774w;
        if (S == -1) {
            S = arrayList.size() - 1;
        }
        return (String) arrayList.get(S);
    }

    @Override
    public final void G(org.telegram.ui.Components.tj0 tj0Var, float f10, int[] iArr) {
        iArr[0] = (int) (b() * f10);
        iArr[1] = 0;
    }

    @Override
    public final int M(int i3) {
        ArrayList arrayList = this.f47774w;
        int size = ((ArrayList) this.f47773s.get(arrayList.get(i3))).size();
        if (i3 != arrayList.size() - 1) {
            return size + 1;
        }
        return size;
    }

    @Override
    public final int P(int i3, int i10) {
        if (i10 < ((ArrayList) this.f47773s.get(this.f47774w.get(i3))).size()) {
            return 0;
        }
        return 1;
    }

    @Override
    public final int R() {
        return this.f47774w.size();
    }

    @Override
    public final View T(int i3, View view) {
        return null;
    }

    @Override
    public final boolean V(int i3, int i10, u4.d1 d1Var) {
        if (i10 < ((ArrayList) this.f47773s.get(this.f47774w.get(i3))).size()) {
            return true;
        }
        return false;
    }

    @Override
    public final void W(int i3, int i10, u4.d1 d1Var) {
        if (d1Var.f55544f == 0) {
            ks ksVar = (ks) ((ArrayList) this.f47773s.get(this.f47774w.get(i3))).get(i10);
            org.telegram.ui.Cells.v9 v9Var = (org.telegram.ui.Cells.v9) d1Var.f55540a;
            String str = null;
            CharSequence m10 = org.telegram.messenger.i6.m(os.a0(ksVar), v9Var.getTextView().getPaint().getFontMetricsInt(), false, null, 0);
            if (this.f47775x.h) {
                str = "+" + ksVar.f47006c;
            }
            v9Var.c(m10, str, false, false);
        }
    }

    @Override
    public final ks O(int i3, int i10) {
        if (i3 >= 0) {
            ArrayList arrayList = this.f47774w;
            if (i3 < arrayList.size()) {
                ArrayList arrayList2 = (ArrayList) this.f47773s.get(arrayList.get(i3));
                if (i10 >= 0 && i10 < arrayList2.size()) {
                    return (ks) arrayList2.get(i10);
                }
            }
        }
        return null;
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View Z;
        Context context = this.f47772r;
        if (i3 != 0) {
            Z = new org.telegram.ui.Cells.e3(context, null);
            Z.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(8.0f));
        } else {
            Z = os.Z(context);
        }
        return new u4.d1(Z);
    }
}
