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
import java.util.Iterator;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;

public final class pt extends org.telegram.ui.Components.vk0 {

    public final Context f41426r;

    public final HashMap f41427s = new HashMap();
    public final ArrayList v = new ArrayList();

    public final tt f41428w;

    public pt(tt ttVar, Context context, ArrayList arrayList, boolean z10) {
        Comparator fVar;
        this.f41428w = ttVar;
        this.f41426r = context;
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                nt ntVar = (nt) arrayList.get(i10);
                String upperCase = ntVar.f40915a.substring(0, 1).toUpperCase();
                ArrayList arrayList2 = (ArrayList) this.f41427s.get(upperCase);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    this.f41427s.put(upperCase, arrayList2);
                    this.v.add(upperCase);
                }
                arrayList2.add(ntVar);
            }
        } else {
            try {
                InputStream inputStreamOpen = ApplicationLoader.applicationContext.getResources().getAssets().open("countries.txt");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen));
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    String[] strArrSplit = line.split(";");
                    nt ntVar2 = new nt();
                    ntVar2.f40915a = strArrSplit[2];
                    ntVar2.f40917c = strArrSplit[0];
                    String str = strArrSplit[1];
                    ntVar2.d = str;
                    if (!str.equals("FT") || !z10) {
                        String upperCase2 = ntVar2.f40915a.substring(0, 1).toUpperCase();
                        ArrayList arrayList3 = (ArrayList) this.f41427s.get(upperCase2);
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                            this.f41427s.put(upperCase2, arrayList3);
                            this.v.add(upperCase2);
                        }
                        arrayList3.add(ntVar2);
                    }
                }
                bufferedReader.close();
                inputStreamOpen.close();
            } catch (Exception e9) {
                FileLog.e(e9);
            }
        }
        if (Build.VERSION.SDK_INT >= 24) {
            Collator collator = Collator.getInstance(LocaleController.getInstance().getCurrentLocale() != null ? LocaleController.getInstance().getCurrentLocale() : Locale.getDefault());
            Objects.requireNonNull(collator);
            fVar = new ag.h(collator, 1);
        } else {
            fVar = new a5.f(11);
        }
        Collections.sort(this.v, fVar);
        Iterator it = this.f41427s.values().iterator();
        while (it.hasNext()) {
            Collections.sort((ArrayList) it.next(), new ot(fVar, 0));
        }
    }

    @Override
    public final String F(int i10) {
        int iS = S(i10);
        ArrayList arrayList = this.v;
        if (iS == -1) {
            iS = arrayList.size() - 1;
        }
        return (String) arrayList.get(iS);
    }

    @Override
    public final void G(org.telegram.ui.Components.zk0 zk0Var, float f10, int[] iArr) {
        iArr[0] = (int) (h() * f10);
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        ArrayList arrayList = this.v;
        int size = ((ArrayList) this.f41427s.get(arrayList.get(i10))).size();
        return i10 != arrayList.size() + (-1) ? size + 1 : size;
    }

    @Override
    public final int P(int i10, int i11) {
        return i11 < ((ArrayList) this.f41427s.get(this.v.get(i10))).size() ? 0 : 1;
    }

    @Override
    public final int R() {
        return this.v.size();
    }

    @Override
    public final View T(int i10, View view) {
        return null;
    }

    @Override
    public final boolean V(int i10, int i11, f2.o1 o1Var) {
        return i11 < ((ArrayList) this.f41427s.get(this.v.get(i10))).size();
    }

    @Override
    public final void W(int i10, int i11, f2.o1 o1Var) {
        String str;
        if (o1Var.f5793f == 0) {
            nt ntVar = (nt) ((ArrayList) this.f41427s.get(this.v.get(i10))).get(i11);
            org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) o1Var.f5789a;
            CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(tt.V(ntVar), x9Var.getTextView().getPaint().getFontMetricsInt(), false);
            if (this.f41428w.h) {
                str = "+" + ntVar.f40917c;
            } else {
                str = null;
            }
            x9Var.c(charSequenceReplaceEmoji, str, false, false);
        }
    }

    @Override
    public final nt O(int i10, int i11) {
        if (i10 >= 0) {
            ArrayList arrayList = this.v;
            if (i10 < arrayList.size()) {
                ArrayList arrayList2 = (ArrayList) this.f41427s.get(arrayList.get(i10));
                if (i11 >= 0 && i11 < arrayList2.size()) {
                    return (nt) arrayList2.get(i11);
                }
            }
        }
        return null;
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View viewU;
        Context context = this.f41426r;
        if (i10 != 0) {
            viewU = new org.telegram.ui.Cells.a3(context, null);
            viewU.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(8.0f));
        } else {
            viewU = tt.U(context);
        }
        return new org.telegram.ui.Components.lk0(viewU);
    }
}
