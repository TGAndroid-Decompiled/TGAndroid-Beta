package org.telegram.ui.Components;

import android.content.Context;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
public abstract class fb1 {
    public static boolean f28148i;
    public static boolean f28149j;
    public static final ConcurrentHashMap f28143a = new ConcurrentHashMap();
    public static final ConcurrentHashMap f28144b = new ConcurrentHashMap();
    public static final HashMap f28145c = new HashMap();
    public static final HashMap d = new HashMap();
    public static final k5 e = new k5(22);
    public static final ArrayList f28146f = new ArrayList();
    public static final ArrayList f28147g = new ArrayList();
    public static final ArrayList h = new ArrayList();
    public static final u7.s f28150k = new u7.s(15);

    public static void a(db1 db1Var) {
        AndroidUtilities.cancelRunOnUIThread(db1Var.v);
        if (!f28147g.remove(db1Var)) {
            return;
        }
        q();
        j();
    }

    public static void b() {
        ArrayList arrayList = h;
        if (!arrayList.isEmpty() && o()) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                AndroidUtilities.runOnUIThread((Runnable) obj);
            }
        }
    }

    public static int c(int i10) {
        return Math.round(i10 / AndroidUtilities.density);
    }

    public static db1 d(jb1 jb1Var) {
        if (jb1Var == null) {
            return null;
        }
        return (db1) f28143a.get(jb1Var.f29582a);
    }

    public static jb1 e(String str) {
        db1 db1Var;
        String str2;
        if (i(str)) {
            db1Var = (db1) f28143a.get(str);
        } else {
            db1Var = null;
        }
        if (db1Var == null) {
            return null;
        }
        synchronized (db1Var) {
            try {
                if (db1Var.f27490i == null) {
                    if (db1Var.h == null) {
                        db1Var.h = h(db1Var.f27489g);
                    }
                    if (db1Var.h == null) {
                        return null;
                    }
                    jb1 jb1Var = new jb1(ApplicationLoader.applicationContext, db1Var.f27485a, db1Var.h);
                    try {
                        str2 = LocaleController.getInstance().getCurrentLocale().toLanguageTag();
                    } catch (Exception unused) {
                        str2 = null;
                    }
                    jb1Var.f29598t = str2;
                    jb1Var.f29599u = null;
                    jb1Var.e = f28150k;
                    db1Var.f27490i = jb1Var;
                }
                return db1Var.f27490i;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void f() {
        JSONObject jSONObject;
        String str;
        AndroidUtilities.cancelRunOnUIThread(e);
        HashMap hashMap = d;
        if (hashMap.isEmpty()) {
            return;
        }
        for (db1 db1Var : hashMap.values()) {
            JSONObject jSONObject2 = (JSONObject) f28145c.get(db1Var.a());
            if (jSONObject2 != null) {
                jSONObject = jSONObject2.optJSONObject("local");
            } else {
                jSONObject = null;
            }
            if (jSONObject != null && jSONObject.length() != 0) {
                str = jSONObject.toString();
            } else {
                str = "";
            }
            MessagesStorage.getInstance(db1Var.f27486b).putWidgetStorage(db1Var.f27487c, db1Var.d, str);
        }
        hashMap.clear();
    }

    public static String g(String str, jb1 jb1Var, int i10) {
        db1 db1Var;
        int[] iArr = null;
        if (i(str)) {
            db1Var = (db1) f28143a.get(str);
        } else {
            db1Var = null;
        }
        if (db1Var == null) {
            return "none";
        }
        if (db1Var.f27488f > 0) {
            return "anchor " + db1Var.f27488f;
        } else if (jb1Var != null && Math.abs(jb1Var.f29589k - i10) <= 1 && jb1Var.f29587i > 0) {
            return "frame";
        } else {
            eb1 eb1Var = (eb1) f28144b.get(db1Var.a());
            if (eb1Var != null) {
                int c10 = c(i10);
                synchronized (eb1Var) {
                    ArrayList arrayList = eb1Var.f27798a;
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        int[] iArr2 = (int[]) obj;
                        if (iArr == null || Math.abs(iArr2[0] - c10) < Math.abs(iArr[0] - c10)) {
                            iArr = iArr2;
                        }
                    }
                }
            }
            if (iArr != null && iArr[1] > 0) {
                if (iArr[0] == c(i10)) {
                    return "cache";
                }
                return "cache of width " + iArr[0];
            }
            return "placeholder";
        }
    }

    public static java.lang.String h(byte[] r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fb1.h(byte[]):java.lang.String");
    }

    public static boolean i(String str) {
        if (str != null && str.startsWith("tg-widget:")) {
            return true;
        }
        return false;
    }

    public static void j() {
        String a2;
        while (true) {
            ArrayList arrayList = f28147g;
            if (arrayList.size() < 3 && !f28149j) {
                ArrayList arrayList2 = f28146f;
                long j10 = Long.MAX_VALUE;
                db1 db1Var = null;
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    db1 db1Var2 = (db1) arrayList2.get(size);
                    if (db1Var2.f27496o) {
                        long j11 = 9223372036854775806L;
                        for (db1 db1Var3 : f28143a.values()) {
                            if (db1Var3.f27494m != 0 && db1Var3.f27486b == db1Var2.f27486b && db1Var3.f27487c == db1Var2.f27487c) {
                                j11 = Math.min(j11, Math.abs(db1Var3.d - db1Var2.d));
                            }
                        }
                        if (j11 < j10) {
                            db1Var = db1Var2;
                            j10 = j11;
                        }
                    }
                }
                if (db1Var != null) {
                    arrayList2.remove(db1Var);
                    jb1 jb1Var = db1Var.f27490i;
                    if (jb1Var != null && !db1Var.f27500s && db1Var.f27494m <= 0) {
                        String g7 = g(db1Var.f27485a, jb1Var, db1Var.f27501t);
                        if (g7.equals("placeholder") || g7.startsWith("cache of width")) {
                            jb1Var.l(db1Var.f27501t);
                            if (jb1Var.f29597s == null && (a2 = zb1.a(null, db1Var.f27502u)) != null && !a2.equals(jb1Var.f29597s)) {
                                jb1Var.f29597s = a2;
                                jb1Var.f29591m = a2.contains("\"dark\"");
                                yb1 yb1Var = jb1Var.f29585f;
                                if (yb1Var != null) {
                                    yb1Var.d(a2);
                                }
                            }
                            if (!jb1Var.f29593o) {
                                arrayList.add(db1Var);
                                p(db1Var);
                                AndroidUtilities.runOnUIThread(db1Var.v, 4000L);
                            }
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public static an0 k(ArrayList arrayList) {
        int size = arrayList.size();
        an0 an0Var = null;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            an0 an0Var2 = (an0) obj;
            if (an0Var == null || an0Var2.h > an0Var.h) {
                an0Var = an0Var2;
            }
        }
        return an0Var;
    }

    public static void l(boolean z10) {
        boolean z11;
        if (f28149j == z10) {
            return;
        }
        f28149j = z10;
        for (db1 db1Var : f28143a.values()) {
            jb1 jb1Var = db1Var.f27490i;
            if (jb1Var != null && jb1Var.f29594p != z10) {
                jb1Var.f29594p = z10;
                yb1 yb1Var = jb1Var.f29585f;
                if (yb1Var != null) {
                    if (jb1Var.f29592n && !z10) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    yb1Var.e(z11);
                }
            }
        }
        if (z10) {
            f();
        } else {
            j();
        }
    }

    public static void m(int i10) {
        AndroidUtilities.runOnUIThread(new hi.t2(i10, 13));
    }

    public static void n(String str, Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).startsWith(str)) {
                it.remove();
            }
        }
    }

    public static boolean o() {
        yb1 yb1Var;
        vb1 vb1Var;
        for (db1 db1Var : f28143a.values()) {
            jb1 jb1Var = db1Var.f27490i;
            an0 an0Var = db1Var.f27493l;
            if (db1Var.f27494m != 0 && jb1Var != null && an0Var != null && !db1Var.f27500s && ((yb1Var = jb1Var.f29585f) == null || (vb1Var = yb1Var.D) == null || (!vb1Var.f33624g && !yb1Var.v))) {
                String g7 = g(db1Var.f27485a, jb1Var, an0Var.q());
                if (g7.equals("placeholder") || g7.startsWith("cache of width")) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void p(db1 db1Var) {
        yb1 yb1Var;
        jb1 jb1Var = db1Var.f27490i;
        boolean z10 = false;
        if (db1Var.f27500s) {
            if (db1Var.f27498q < 2) {
                db1Var.f27500s = false;
                jb1Var.m();
            } else {
                return;
            }
        }
        if (jb1Var.f29593o) {
            return;
        }
        jb1Var.f29593o = true;
        yb1 yb1Var2 = jb1Var.f29585f;
        if (yb1Var2 != null) {
            yb1Var2.f35020y = true;
            return;
        }
        String str = jb1Var.f29597s;
        if (str == null && jb1Var.f29598t == null && jb1Var.f29599u == null) {
            yb1Var = new yb1(jb1Var.f29584c, jb1Var.f29583b, zb1.d(jb1Var.f29591m), jb1Var.d, null, null);
        } else {
            Context context = jb1Var.f29584c;
            String str2 = jb1Var.f29583b;
            if (str == null) {
                str = zb1.d(jb1Var.f29591m);
            }
            yb1Var = new yb1(context, str2, str, jb1Var.d, jb1Var.f29598t, jb1Var.f29599u);
        }
        yb1Var.H = jb1Var;
        yb1Var.K = jb1Var;
        if (jb1Var.f29592n && !jb1Var.f29594p) {
            z10 = true;
        }
        yb1Var.e(z10);
        jb1Var.f29585f = yb1Var;
        jb1Var.f29595q++;
        qb1.f31878a.execute(new h2(yb1Var, jb1Var.f29588j, 14));
    }

    public static void q() {
        ArrayList arrayList = new ArrayList();
        for (db1 db1Var : f28143a.values()) {
            if (db1Var.f27490i != null && db1Var.f27494m == 0 && !f28147g.contains(db1Var)) {
                arrayList.add(db1Var);
            }
        }
        Collections.sort(arrayList, new org.telegram.ui.ActionBar.n4(27));
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            jb1 jb1Var = ((db1) arrayList.get(i10)).f27490i;
            if (i10 >= 4) {
                jb1Var.m();
            }
            if (i10 >= 12 && jb1Var.f29585f == null) {
                jb1Var.f29586g = null;
            }
        }
    }
}
