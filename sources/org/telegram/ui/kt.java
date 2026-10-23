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
public final class kt extends org.telegram.ui.Components.fm0 {
    public final Context f38668r;
    public final HashMap f38669s = new HashMap();
    public final ArrayList v = new ArrayList();
    public final ot f38670w;

    public kt(ot otVar, Context context, ArrayList arrayList, boolean z10) {
        Comparator jg0Var;
        Locale locale;
        this.f38670w = otVar;
        this.f38668r = context;
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ht htVar = (ht) arrayList.get(i10);
                String upperCase = htVar.f37788a.substring(0, 1).toUpperCase();
                ArrayList arrayList2 = (ArrayList) this.f38669s.get(upperCase);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    this.f38669s.put(upperCase, arrayList2);
                    this.v.add(upperCase);
                }
                arrayList2.add(htVar);
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
                    obj.f37788a = split[2];
                    obj.f37790c = split[0];
                    String str = split[1];
                    obj.d = str;
                    if (!str.equals("FT") || !z10) {
                        String upperCase2 = obj.f37788a.substring(0, 1).toUpperCase();
                        ArrayList arrayList3 = (ArrayList) this.f38669s.get(upperCase2);
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                            this.f38669s.put(upperCase2, arrayList3);
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
            jg0Var = new ai.u5(collator, 6);
        } else {
            jg0Var = new jg0(16);
        }
        Collections.sort(this.v, jg0Var);
        for (ArrayList arrayList4 : this.f38669s.values()) {
            Collections.sort(arrayList4, new jt(jg0Var, 0));
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
    public final void G(org.telegram.ui.Components.jm0 jm0Var, float f7, int[] iArr) {
        iArr[0] = (int) (h() * f7);
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        ArrayList arrayList = this.v;
        int size = ((ArrayList) this.f38669s.get(arrayList.get(i10))).size();
        if (i10 != arrayList.size() - 1) {
            return size + 1;
        }
        return size;
    }

    @Override
    public final int P(int i10, int i11) {
        if (i11 < ((ArrayList) this.f38669s.get(this.v.get(i10))).size()) {
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
        if (i11 < ((ArrayList) this.f38669s.get(this.v.get(i10))).size()) {
            return true;
        }
        return false;
    }

    @Override
    public final void W(int i10, int i11, s4.b1 b1Var) {
        String str;
        if (b1Var.f45924f == 0) {
            ht htVar = (ht) ((ArrayList) this.f38669s.get(this.v.get(i10))).get(i11);
            org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) b1Var.f45921a;
            CharSequence replaceEmoji = Emoji.replaceEmoji(ot.V(htVar), baVar.getTextView().getPaint().getFontMetricsInt(), false);
            if (this.f38670w.h) {
                str = "+" + htVar.f37790c;
            } else {
                str = null;
            }
            baVar.c(replaceEmoji, str, false, false);
        }
    }

    @Override
    public final ht O(int i10, int i11) {
        if (i10 >= 0) {
            ArrayList arrayList = this.v;
            if (i10 < arrayList.size()) {
                ArrayList arrayList2 = (ArrayList) this.f38669s.get(arrayList.get(i10));
                if (i11 >= 0 && i11 < arrayList2.size()) {
                    return (ht) arrayList2.get(i11);
                }
            }
        }
        return null;
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View U;
        Context context = this.f38668r;
        if (i10 != 0) {
            U = new org.telegram.ui.Cells.c3(context, null);
            U.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(8.0f));
        } else {
            U = ot.U(context);
        }
        return new s4.b1(U);
    }
}
