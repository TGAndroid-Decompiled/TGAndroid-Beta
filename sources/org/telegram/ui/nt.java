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
public final class nt extends org.telegram.ui.Components.im0 {
    public final Context f41880r;
    public final HashMap f41881s = new HashMap();
    public final ArrayList v = new ArrayList();
    public final qt f41882w;

    public nt(qt qtVar, Context context, ArrayList arrayList, boolean z10) {
        Comparator dvVar;
        Locale locale;
        this.f41882w = qtVar;
        this.f41880r = context;
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                lt ltVar = (lt) arrayList.get(i10);
                String upperCase = ltVar.f41258a.substring(0, 1).toUpperCase();
                ArrayList arrayList2 = (ArrayList) this.f41881s.get(upperCase);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    this.f41881s.put(upperCase, arrayList2);
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
                    obj.f41258a = split[2];
                    obj.f41260c = split[0];
                    String str = split[1];
                    obj.d = str;
                    if (!str.equals("FT") || !z10) {
                        String upperCase2 = obj.f41258a.substring(0, 1).toUpperCase();
                        ArrayList arrayList3 = (ArrayList) this.f41881s.get(upperCase2);
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                            this.f41881s.put(upperCase2, arrayList3);
                            this.v.add(upperCase2);
                        }
                        arrayList3.add(obj);
                    }
                }
                bufferedReader.close();
                open.close();
            } catch (Exception e) {
                FileLog.e(e);
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
            dvVar = new bi.p5(collator, 6);
        } else {
            dvVar = new dv(20);
        }
        Collections.sort(this.v, dvVar);
        for (ArrayList arrayList4 : this.f41881s.values()) {
            Collections.sort(arrayList4, new mt(dvVar, 0));
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
    public final void G(org.telegram.ui.Components.nm0 nm0Var, float f7, int[] iArr) {
        iArr[0] = (int) (h() * f7);
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        ArrayList arrayList = this.v;
        int size = ((ArrayList) this.f41881s.get(arrayList.get(i10))).size();
        if (i10 != arrayList.size() - 1) {
            return size + 1;
        }
        return size;
    }

    @Override
    public final int P(int i10, int i11) {
        if (i11 < ((ArrayList) this.f41881s.get(this.v.get(i10))).size()) {
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
    public final boolean V(int i10, int i11, s4.e1 e1Var) {
        if (i11 < ((ArrayList) this.f41881s.get(this.v.get(i10))).size()) {
            return true;
        }
        return false;
    }

    @Override
    public final void W(int i10, int i11, s4.e1 e1Var) {
        String str;
        if (e1Var.f47776f == 0) {
            lt ltVar = (lt) ((ArrayList) this.f41881s.get(this.v.get(i10))).get(i11);
            org.telegram.ui.Cells.ga gaVar = (org.telegram.ui.Cells.ga) e1Var.f47773a;
            CharSequence replaceEmoji = Emoji.replaceEmoji(qt.W(ltVar), gaVar.getTextView().getPaint().getFontMetricsInt(), false);
            if (this.f41882w.h) {
                str = "+" + ltVar.f41260c;
            } else {
                str = null;
            }
            gaVar.c(replaceEmoji, str, false, false);
        }
    }

    @Override
    public final lt O(int i10, int i11) {
        if (i10 >= 0) {
            ArrayList arrayList = this.v;
            if (i10 < arrayList.size()) {
                ArrayList arrayList2 = (ArrayList) this.f41881s.get(arrayList.get(i10));
                if (i11 >= 0 && i11 < arrayList2.size()) {
                    return (lt) arrayList2.get(i11);
                }
            }
        }
        return null;
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View V;
        Context context = this.f41880r;
        if (i10 != 0) {
            V = new org.telegram.ui.Cells.a3(context, null);
            V.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(8.0f));
        } else {
            V = qt.V(context);
        }
        return new s4.e1(V);
    }
}
