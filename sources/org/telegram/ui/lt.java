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
public final class lt extends org.telegram.ui.Components.hm0 {
    public final Context f41357r;
    public final HashMap f41358s = new HashMap();
    public final ArrayList v = new ArrayList();
    public final ot f41359w;

    public lt(ot otVar, Context context, ArrayList arrayList, boolean z10) {
        Comparator bvVar;
        Locale locale;
        this.f41359w = otVar;
        this.f41357r = context;
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                jt jtVar = (jt) arrayList.get(i10);
                String upperCase = jtVar.f40743a.substring(0, 1).toUpperCase();
                ArrayList arrayList2 = (ArrayList) this.f41358s.get(upperCase);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    this.f41358s.put(upperCase, arrayList2);
                    this.v.add(upperCase);
                }
                arrayList2.add(jtVar);
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
                    obj.f40743a = split[2];
                    obj.f40745c = split[0];
                    String str = split[1];
                    obj.d = str;
                    if (!str.equals("FT") || !z10) {
                        String upperCase2 = obj.f40743a.substring(0, 1).toUpperCase();
                        ArrayList arrayList3 = (ArrayList) this.f41358s.get(upperCase2);
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                            this.f41358s.put(upperCase2, arrayList3);
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
            bvVar = new bi.p5(collator, 6);
        } else {
            bvVar = new bv(20);
        }
        Collections.sort(this.v, bvVar);
        for (ArrayList arrayList4 : this.f41358s.values()) {
            Collections.sort(arrayList4, new kt(bvVar, 0));
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
        int size = ((ArrayList) this.f41358s.get(arrayList.get(i10))).size();
        if (i10 != arrayList.size() - 1) {
            return size + 1;
        }
        return size;
    }

    @Override
    public final int P(int i10, int i11) {
        if (i11 < ((ArrayList) this.f41358s.get(this.v.get(i10))).size()) {
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
        if (i11 < ((ArrayList) this.f41358s.get(this.v.get(i10))).size()) {
            return true;
        }
        return false;
    }

    @Override
    public final void W(int i10, int i11, s4.e1 e1Var) {
        String str;
        if (e1Var.f47741f == 0) {
            jt jtVar = (jt) ((ArrayList) this.f41358s.get(this.v.get(i10))).get(i11);
            org.telegram.ui.Cells.ga gaVar = (org.telegram.ui.Cells.ga) e1Var.f47738a;
            CharSequence replaceEmoji = Emoji.replaceEmoji(ot.W(jtVar), gaVar.getTextView().getPaint().getFontMetricsInt(), false);
            if (this.f41359w.h) {
                str = "+" + jtVar.f40745c;
            } else {
                str = null;
            }
            gaVar.c(replaceEmoji, str, false, false);
        }
    }

    @Override
    public final jt O(int i10, int i11) {
        if (i10 >= 0) {
            ArrayList arrayList = this.v;
            if (i10 < arrayList.size()) {
                ArrayList arrayList2 = (ArrayList) this.f41358s.get(arrayList.get(i10));
                if (i11 >= 0 && i11 < arrayList2.size()) {
                    return (jt) arrayList2.get(i11);
                }
            }
        }
        return null;
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View V;
        Context context = this.f41357r;
        if (i10 != 0) {
            V = new org.telegram.ui.Cells.a3(context, null);
            V.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(8.0f));
        } else {
            V = ot.V(context);
        }
        return new s4.e1(V);
    }
}
