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
public final class cu extends org.telegram.ui.Components.im0 {
    public final Context f34791r;
    public final HashMap f34792s = new HashMap();
    public final ArrayList v = new ArrayList();
    public final fu f34793w;

    public cu(fu fuVar, Context context, ArrayList arrayList, boolean z10) {
        Comparator ds0Var;
        Locale locale;
        this.f34793w = fuVar;
        this.f34791r = context;
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                au auVar = (au) arrayList.get(i10);
                String upperCase = auVar.f34084a.substring(0, 1).toUpperCase();
                ArrayList arrayList2 = (ArrayList) this.f34792s.get(upperCase);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    this.f34792s.put(upperCase, arrayList2);
                    this.v.add(upperCase);
                }
                arrayList2.add(auVar);
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
                    obj.f34084a = split[2];
                    obj.f34086c = split[0];
                    String str = split[1];
                    obj.d = str;
                    if (!str.equals("FT") || !z10) {
                        String upperCase2 = obj.f34084a.substring(0, 1).toUpperCase();
                        ArrayList arrayList3 = (ArrayList) this.f34792s.get(upperCase2);
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                            this.f34792s.put(upperCase2, arrayList3);
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
            ds0Var = new bi.q7(collator, 5);
        } else {
            ds0Var = new ds0(13);
        }
        Collections.sort(this.v, ds0Var);
        for (ArrayList arrayList4 : this.f34792s.values()) {
            Collections.sort(arrayList4, new bu(ds0Var, 0));
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
    public final void G(org.telegram.ui.Components.mm0 mm0Var, float f7, int[] iArr) {
        iArr[0] = (int) (h() * f7);
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        ArrayList arrayList = this.v;
        int size = ((ArrayList) this.f34792s.get(arrayList.get(i10))).size();
        if (i10 != arrayList.size() - 1) {
            return size + 1;
        }
        return size;
    }

    @Override
    public final int P(int i10, int i11) {
        if (i11 < ((ArrayList) this.f34792s.get(this.v.get(i10))).size()) {
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
    public final boolean V(int i10, int i11, s4.b1 b1Var) {
        if (i11 < ((ArrayList) this.f34792s.get(this.v.get(i10))).size()) {
            return true;
        }
        return false;
    }

    @Override
    public final void W(int i10, int i11, s4.b1 b1Var) {
        String str;
        if (b1Var.f44841f == 0) {
            au auVar = (au) ((ArrayList) this.f34792s.get(this.v.get(i10))).get(i11);
            org.telegram.ui.Cells.ca caVar = (org.telegram.ui.Cells.ca) b1Var.f44838a;
            CharSequence replaceEmoji = Emoji.replaceEmoji(fu.V(auVar), caVar.getTextView().getPaint().getFontMetricsInt(), false);
            if (this.f34793w.h) {
                str = "+" + auVar.f34086c;
            } else {
                str = null;
            }
            caVar.c(replaceEmoji, str, false, false);
        }
    }

    @Override
    public final au O(int i10, int i11) {
        if (i10 >= 0) {
            ArrayList arrayList = this.v;
            if (i10 < arrayList.size()) {
                ArrayList arrayList2 = (ArrayList) this.f34792s.get(arrayList.get(i10));
                if (i11 >= 0 && i11 < arrayList2.size()) {
                    return (au) arrayList2.get(i11);
                }
            }
        }
        return null;
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View U;
        Context context = this.f34791r;
        if (i10 != 0) {
            U = new org.telegram.ui.Cells.d3(context, null);
            U.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(8.0f));
        } else {
            U = fu.U(context);
        }
        return new s4.b1(U);
    }
}
