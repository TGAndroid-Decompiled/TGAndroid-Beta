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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
public final class nt extends org.telegram.ui.Components.fl0 {
    public final Context f40897r;
    public final HashMap f40898s = new HashMap();
    public final ArrayList v = new ArrayList();
    public final rt f40899w;

    public nt(rt rtVar, Context context, ArrayList arrayList, boolean z10) {
        Comparator eVar;
        Locale locale;
        this.f40899w = rtVar;
        this.f40897r = context;
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                lt ltVar = (lt) arrayList.get(i10);
                String upperCase = ltVar.f40272a.substring(0, 1).toUpperCase();
                ArrayList arrayList2 = (ArrayList) this.f40898s.get(upperCase);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    this.f40898s.put(upperCase, arrayList2);
                    this.v.add(upperCase);
                }
                arrayList2.add(ltVar);
            }
        } else {
            try {
                InputStream open = ApplicationLoader.applicationContext.getResources().getAssets().open("countries.txt");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    String[] split = readLine.split(";");
                    ?? obj = new Object();
                    obj.f40272a = split[2];
                    obj.f40274c = split[0];
                    String str = split[1];
                    obj.d = str;
                    if (!str.equals("FT") || !z10) {
                        String upperCase2 = obj.f40272a.substring(0, 1).toUpperCase();
                        ArrayList arrayList3 = (ArrayList) this.f40898s.get(upperCase2);
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                            this.f40898s.put(upperCase2, arrayList3);
                            this.v.add(upperCase2);
                        }
                        arrayList3.add(obj);
                    }
                }
                bufferedReader.close();
                open.close();
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        if (Build.VERSION.SDK_INT >= 24) {
            if (LocaleController.getInstance().getCurrentLocale() != null) {
                locale = LocaleController.getInstance().getCurrentLocale();
            } else {
                locale = Locale.getDefault();
            }
            Collator collator = Collator.getInstance(locale);
            Objects.requireNonNull(collator);
            eVar = new a4.v(collator, 2);
        } else {
            eVar = new c5.e(13);
        }
        Collections.sort(this.v, eVar);
        for (ArrayList arrayList4 : this.f40898s.values()) {
            Collections.sort(arrayList4, new mt(eVar, 0));
        }
    }

    @Override
    public final String F(int i10) {
        int S = S(i10);
        ArrayList arrayList = this.v;
        if (S == -1) {
            S = arrayList.size() - 1;
        }
        return (String) arrayList.get(S);
    }

    @Override
    public final void G(org.telegram.ui.Components.jl0 jl0Var, float f9, int[] iArr) {
        iArr[0] = (int) (h() * f9);
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        ArrayList arrayList = this.v;
        int size = ((ArrayList) this.f40898s.get(arrayList.get(i10))).size();
        if (i10 != arrayList.size() - 1) {
            return size + 1;
        }
        return size;
    }

    @Override
    public final int P(int i10, int i11) {
        if (i11 < ((ArrayList) this.f40898s.get(this.v.get(i10))).size()) {
            return 0;
        }
        return 1;
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
    public final boolean V(int i10, int i11, f2.n1 n1Var) {
        if (i11 < ((ArrayList) this.f40898s.get(this.v.get(i10))).size()) {
            return true;
        }
        return false;
    }

    @Override
    public final void W(int i10, int i11, f2.n1 n1Var) {
        String str;
        if (n1Var.f6436f == 0) {
            lt ltVar = (lt) ((ArrayList) this.f40898s.get(this.v.get(i10))).get(i11);
            org.telegram.ui.Cells.y9 y9Var = (org.telegram.ui.Cells.y9) n1Var.f6432a;
            CharSequence replaceEmoji = Emoji.replaceEmoji(rt.V(ltVar), y9Var.getTextView().getPaint().getFontMetricsInt(), false);
            if (this.f40899w.h) {
                str = "+" + ltVar.f40274c;
            } else {
                str = null;
            }
            y9Var.c(replaceEmoji, str, false, false);
        }
    }

    @Override
    public final lt O(int i10, int i11) {
        if (i10 >= 0) {
            ArrayList arrayList = this.v;
            if (i10 < arrayList.size()) {
                ArrayList arrayList2 = (ArrayList) this.f40898s.get(arrayList.get(i10));
                if (i11 >= 0 && i11 < arrayList2.size()) {
                    return (lt) arrayList2.get(i11);
                }
            }
        }
        return null;
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View U;
        Context context = this.f40897r;
        if (i10 != 0) {
            U = new org.telegram.ui.Cells.a3(context, null);
            U.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(8.0f));
        } else {
            U = rt.U(context);
        }
        return new f2.n1(U);
    }
}
