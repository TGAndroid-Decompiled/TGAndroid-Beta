package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public abstract class jb1 {
    public static boolean f29629i;
    public static boolean f29630j;
    public static final ConcurrentHashMap f29624a = new ConcurrentHashMap();
    public static final ConcurrentHashMap f29625b = new ConcurrentHashMap();
    public static final HashMap f29626c = new HashMap();
    public static final HashMap d = new HashMap();
    public static final k5 e = new k5(22);
    public static final ArrayList f29627f = new ArrayList();
    public static final ArrayList f29628g = new ArrayList();
    public static final ArrayList h = new ArrayList();
    public static final HashMap f29631k = new HashMap();
    public static final u7.s f29632l = new u7.s(15);

    public static void a(gb1 gb1Var) {
        AndroidUtilities.cancelRunOnUIThread(gb1Var.F);
        if (!f29628g.remove(gb1Var)) {
            return;
        }
        x();
        n();
    }

    public static void b() {
        ArrayList arrayList = h;
        if (!arrayList.isEmpty() && u()) {
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

    public static void c(gb1 gb1Var, String str, String str2) {
        if (!TextUtils.equals(gb1Var.f28521n, str) || !TextUtils.equals(gb1Var.f28522o, str2)) {
            gb1Var.f28521n = str;
            gb1Var.f28522o = str2;
            TLRPC.TL_messageMediaWidget tL_messageMediaWidget = gb1Var.f28524q;
            if (tL_messageMediaWidget != null) {
                tL_messageMediaWidget.chat_data = str;
                tL_messageMediaWidget.public_data = str2;
                tL_messageMediaWidget.public_data_hash = gb1Var.f28523p;
            }
            nb1 nb1Var = gb1Var.f28526s;
            if (nb1Var != null) {
                nb1Var.n(g(str, str2));
            }
        }
    }

    public static int d(String str, nb1 nb1Var, int i10) {
        gb1 gb1Var;
        int i11;
        int i12;
        int i13;
        if (m(str)) {
            gb1Var = (gb1) f29624a.get(str);
        } else {
            gb1Var = null;
        }
        int i14 = 0;
        if (gb1Var == null) {
            return 0;
        }
        if (gb1Var.f28514f > 0) {
            return AndroidUtilities.dp(Math.max(50, Math.min(600, i11)));
        }
        if (nb1Var != null && Math.abs(nb1Var.f30845k - i10) <= 1) {
            i12 = nb1Var.f30843i;
        } else {
            i12 = 0;
        }
        if (i12 > 0) {
            return Math.min(AndroidUtilities.dp(600.0f), Math.max(AndroidUtilities.dp(50.0f), i12));
        }
        hb1 hb1Var = (hb1) f29625b.get(gb1Var.a());
        if (hb1Var != null) {
            int f7 = f(i10);
            synchronized (hb1Var) {
                ArrayList arrayList = hb1Var.f28950a;
                int size = arrayList.size();
                int i15 = Integer.MAX_VALUE;
                i13 = 0;
                int i16 = 0;
                while (i16 < size) {
                    Object obj = arrayList.get(i16);
                    i16++;
                    int[] iArr = (int[]) obj;
                    int abs = Math.abs(iArr[0] - f7);
                    if (abs < i15) {
                        i13 = iArr[1];
                        i15 = abs;
                    }
                }
            }
            i14 = i13;
        }
        if (i14 <= 0) {
            i14 = 160;
        }
        return AndroidUtilities.dp(Math.max(50, Math.min(600, i14)));
    }

    public static String e(gb1 gb1Var) {
        TLRPC.User user;
        try {
            JSONObject jSONObject = new JSONObject();
            boolean z10 = gb1Var.h;
            boolean z11 = gb1Var.f28516i;
            jSONObject.put("isCopy", z10);
            jSONObject.put("canQuery", z11);
            jSONObject.put("backgroundQuery", gb1Var.f28517j);
            jSONObject.put("preview", gb1Var.f28518k);
            Object obj = gb1Var.f28520m;
            if (obj != null) {
                jSONObject.put("chatType", obj);
            }
            if (z11) {
                user = UserConfig.getInstance(gb1Var.f28512b).getCurrentUser();
            } else {
                user = null;
            }
            if (user != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("id", user.f22177id);
                if (!TextUtils.isEmpty(user.first_name)) {
                    jSONObject2.put("firstName", user.first_name);
                }
                if (!TextUtils.isEmpty(user.last_name)) {
                    jSONObject2.put("lastName", user.last_name);
                }
                String publicUsername = UserObject.getPublicUsername(user);
                if (!TextUtils.isEmpty(publicUsername)) {
                    jSONObject2.put("username", publicUsername);
                }
                jSONObject2.put("isPremium", user.premium);
                jSONObject.put("viewer", jSONObject2);
            }
            return jSONObject.toString();
        } catch (Exception unused) {
            return "{}";
        }
    }

    public static int f(int i10) {
        return Math.round(i10 / AndroidUtilities.density);
    }

    public static String g(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            Object obj = str;
            if (str == null) {
                obj = JSONObject.NULL;
            }
            jSONObject.put("chatData", obj);
            Object obj2 = str2;
            if (str2 == null) {
                obj2 = JSONObject.NULL;
            }
            jSONObject.put("publicData", obj2);
            return jSONObject.toString();
        } catch (Exception unused) {
            return "{}";
        }
    }

    public static gb1 h(nb1 nb1Var) {
        if (nb1Var == null) {
            return null;
        }
        return (gb1) f29624a.get(nb1Var.f30838a);
    }

    public static nb1 i(String str) {
        gb1 gb1Var;
        String str2;
        if (m(str)) {
            gb1Var = (gb1) f29624a.get(str);
        } else {
            gb1Var = null;
        }
        if (gb1Var == null) {
            return null;
        }
        synchronized (gb1Var) {
            try {
                if (gb1Var.f28526s == null) {
                    if (gb1Var.f28525r == null) {
                        gb1Var.f28525r = l(gb1Var.f28515g);
                    }
                    if (gb1Var.f28525r == null) {
                        return null;
                    }
                    nb1 nb1Var = new nb1(ApplicationLoader.applicationContext, gb1Var.f28511a, gb1Var.f28525r);
                    try {
                        str2 = LocaleController.getInstance().getCurrentLocale().toLanguageTag();
                    } catch (Exception unused) {
                        str2 = null;
                    }
                    nb1Var.f30854t = str2;
                    nb1Var.f30855u = null;
                    String e10 = e(gb1Var);
                    if (e10 != null) {
                        nb1Var.f30856w = e10;
                    }
                    nb1Var.n(g(gb1Var.f28521n, gb1Var.f28522o));
                    nb1Var.e = f29632l;
                    gb1Var.f28526s = nb1Var;
                }
                return gb1Var.f28526s;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void j() {
        JSONObject jSONObject;
        String str;
        AndroidUtilities.cancelRunOnUIThread(e);
        HashMap hashMap = d;
        if (hashMap.isEmpty()) {
            return;
        }
        for (gb1 gb1Var : hashMap.values()) {
            JSONObject jSONObject2 = (JSONObject) f29626c.get(gb1Var.a());
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
            MessagesStorage.getInstance(gb1Var.f28512b).putWidgetStorage(gb1Var.f28513c, gb1Var.d, str);
        }
        hashMap.clear();
    }

    public static String k(String str, nb1 nb1Var, int i10) {
        gb1 gb1Var;
        int[] iArr = null;
        if (m(str)) {
            gb1Var = (gb1) f29624a.get(str);
        } else {
            gb1Var = null;
        }
        if (gb1Var == null) {
            return "none";
        }
        if (gb1Var.f28514f > 0) {
            return "anchor " + gb1Var.f28514f;
        } else if (nb1Var != null && Math.abs(nb1Var.f30845k - i10) <= 1 && nb1Var.f30843i > 0) {
            return "frame";
        } else {
            hb1 hb1Var = (hb1) f29625b.get(gb1Var.a());
            if (hb1Var != null) {
                int f7 = f(i10);
                synchronized (hb1Var) {
                    ArrayList arrayList = hb1Var.f28950a;
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        int[] iArr2 = (int[]) obj;
                        if (iArr == null || Math.abs(iArr2[0] - f7) < Math.abs(iArr[0] - f7)) {
                            iArr = iArr2;
                        }
                    }
                }
            }
            if (iArr != null && iArr[1] > 0) {
                if (iArr[0] == f(i10)) {
                    return "cache";
                }
                return "cache of width " + iArr[0];
            }
            return "placeholder";
        }
    }

    public static java.lang.String l(byte[] r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jb1.l(byte[]):java.lang.String");
    }

    public static boolean m(String str) {
        if (str != null && str.startsWith("tg-widget:")) {
            return true;
        }
        return false;
    }

    public static void n() {
        while (true) {
            ArrayList arrayList = f29628g;
            if (arrayList.size() < 3 && !f29630j) {
                ArrayList arrayList2 = f29627f;
                long j10 = Long.MAX_VALUE;
                gb1 gb1Var = null;
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    gb1 gb1Var2 = (gb1) arrayList2.get(size);
                    if (gb1Var2.f28531y) {
                        long j11 = 9223372036854775806L;
                        for (gb1 gb1Var3 : f29624a.values()) {
                            if (gb1Var3.f28529w != 0 && gb1Var3.f28512b == gb1Var2.f28512b && gb1Var3.f28513c == gb1Var2.f28513c) {
                                j11 = Math.min(j11, Math.abs(gb1Var3.d - gb1Var2.d));
                            }
                        }
                        if (j11 < j10) {
                            gb1Var = gb1Var2;
                            j10 = j11;
                        }
                    }
                }
                if (gb1Var != null) {
                    arrayList2.remove(gb1Var);
                    nb1 nb1Var = gb1Var.f28526s;
                    if (nb1Var != null && !gb1Var.C && gb1Var.f28529w <= 0) {
                        String k10 = k(gb1Var.f28511a, nb1Var, gb1Var.D);
                        if (k10.equals("placeholder") || k10.startsWith("cache of width")) {
                            nb1Var.q(gb1Var.D);
                            if (nb1Var.f30853s == null) {
                                nb1Var.o(ec1.a(null, gb1Var.E));
                            }
                            if (!nb1Var.f30849o) {
                                arrayList.add(gb1Var);
                                v(gb1Var);
                                AndroidUtilities.runOnUIThread(gb1Var.F, 4000L);
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

    public static bn0 o(ArrayList arrayList) {
        int size = arrayList.size();
        bn0 bn0Var = null;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            bn0 bn0Var2 = (bn0) obj;
            if (bn0Var == null || bn0Var2.h > bn0Var.h) {
                bn0Var = bn0Var2;
            }
        }
        return bn0Var;
    }

    public static void p(boolean z10) {
        boolean z11;
        if (f29630j == z10) {
            return;
        }
        f29630j = z10;
        for (gb1 gb1Var : f29624a.values()) {
            nb1 nb1Var = gb1Var.f28526s;
            if (nb1Var != null && nb1Var.f30850p != z10) {
                nb1Var.f30850p = z10;
                dc1 dc1Var = nb1Var.f30841f;
                if (dc1Var != null) {
                    if (nb1Var.f30848n && !z10) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    dc1Var.f(z11);
                }
            }
        }
        if (z10) {
            j();
        } else {
            n();
        }
        y();
    }

    public static void q(nb1 nb1Var) {
        gb1 h10 = h(nb1Var);
        if (h10 == null) {
            return;
        }
        h10.f28529w = Math.max(0, h10.f28529w - 1);
        h10.f28530x = System.currentTimeMillis();
        x();
        j();
        y();
    }

    public static void r(nb1 nb1Var) {
        boolean z10;
        gb1 h10 = h(nb1Var);
        if (h10 == null) {
            return;
        }
        h10.f28529w++;
        h10.f28530x = System.currentTimeMillis();
        boolean z11 = f29630j;
        if (nb1Var.f30850p != z11) {
            nb1Var.f30850p = z11;
            dc1 dc1Var = nb1Var.f30841f;
            if (dc1Var != null) {
                if (nb1Var.f30848n && !z11) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                dc1Var.f(z10);
            }
        }
        if (h10.f28531y) {
            v(h10);
        } else {
            h10.f28532z = true;
        }
        x();
        y();
    }

    public static void s(int i10) {
        AndroidUtilities.runOnUIThread(new hi.t2(i10, 13));
    }

    public static void t(String str, Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).startsWith(str)) {
                it.remove();
            }
        }
    }

    public static boolean u() {
        dc1 dc1Var;
        ac1 ac1Var;
        for (gb1 gb1Var : f29624a.values()) {
            nb1 nb1Var = gb1Var.f28526s;
            bn0 bn0Var = gb1Var.v;
            if (gb1Var.f28529w != 0 && nb1Var != null && bn0Var != null && !gb1Var.C && ((dc1Var = nb1Var.f30841f) == null || (ac1Var = dc1Var.E) == null || (!ac1Var.f26509g && !dc1Var.f27414w))) {
                String k10 = k(gb1Var.f28511a, nb1Var, bn0Var.u());
                if (k10.equals("placeholder") || k10.startsWith("cache of width")) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void v(gb1 gb1Var) {
        dc1 dc1Var;
        nb1 nb1Var = gb1Var.f28526s;
        boolean z10 = false;
        if (gb1Var.C) {
            if (gb1Var.A < 2) {
                gb1Var.C = false;
                nb1Var.r();
            } else {
                return;
            }
        }
        if (nb1Var.f30849o) {
            return;
        }
        nb1Var.f30849o = true;
        dc1 dc1Var2 = nb1Var.f30841f;
        if (dc1Var2 != null) {
            dc1Var2.f27417z = true;
            return;
        }
        String str = nb1Var.f30853s;
        if (str == null && nb1Var.f30854t == null && nb1Var.f30855u == null) {
            dc1Var = new dc1(nb1Var.f30840c, nb1Var.f30839b, ec1.d(nb1Var.f30847m), nb1Var.d, null, null);
        } else {
            Context context = nb1Var.f30840c;
            String str2 = nb1Var.f30839b;
            if (str == null) {
                str = ec1.d(nb1Var.f30847m);
            }
            dc1Var = new dc1(context, str2, str, nb1Var.d, nb1Var.f30854t, nb1Var.f30855u);
        }
        StringBuilder sb2 = new StringBuilder("{\"data\":");
        sb2.append(nb1Var.v);
        sb2.append(",\"context\":");
        String s10 = a1.g.s(sb2, nb1Var.f30856w, "}");
        if (s10 != null) {
            dc1Var.h = s10;
        }
        dc1Var.I = nb1Var;
        dc1Var.L = nb1Var;
        if (nb1Var.f30848n && !nb1Var.f30850p) {
            z10 = true;
        }
        dc1Var.f(z10);
        nb1Var.f30841f = dc1Var;
        nb1Var.f30851q++;
        vb1.f33663a.execute(new h2(dc1Var, nb1Var.f30844j, 14));
    }

    public static String w(String str) {
        if (str != null && !str.isEmpty()) {
            return str;
        }
        return null;
    }

    public static void x() {
        ArrayList arrayList = new ArrayList();
        for (gb1 gb1Var : f29624a.values()) {
            if (gb1Var.f28526s != null && gb1Var.f28529w == 0 && !f29628g.contains(gb1Var)) {
                arrayList.add(gb1Var);
            }
        }
        Collections.sort(arrayList, new org.telegram.ui.ActionBar.n4(27));
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            nb1 nb1Var = ((gb1) arrayList.get(i10)).f28526s;
            if (i10 >= 4) {
                nb1Var.r();
            }
            if (i10 >= 12 && nb1Var.f30841f == null) {
                nb1Var.f30842g = null;
            }
        }
    }

    public static void y() {
        nb1 nb1Var;
        HashMap hashMap = new HashMap();
        for (gb1 gb1Var : f29624a.values()) {
            if (gb1Var.f28519l != 0 && !gb1Var.f28518k && gb1Var.f28529w != 0 && !f29630j && (nb1Var = gb1Var.f28526s) != null && nb1Var.f30841f != null && nb1Var.f30857x) {
                hashMap.put(gb1Var.f28512b + "/" + gb1Var.f28519l, gb1Var);
            }
        }
        HashMap hashMap2 = f29631k;
        Iterator it = hashMap2.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!hashMap.containsKey(entry.getKey())) {
                ib1 ib1Var = (ib1) entry.getValue();
                AndroidUtilities.cancelRunOnUIThread(ib1Var.f29298f);
                if (ib1Var.e != 0) {
                    ConnectionsManager.getInstance(ib1Var.f29295a).cancelRequest(ib1Var.e, true);
                }
                it.remove();
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (!hashMap2.containsKey(entry2.getKey())) {
                gb1 gb1Var2 = (gb1) entry2.getValue();
                ib1 ib1Var2 = new ib1(gb1Var2.f28512b, gb1Var2.f28519l);
                ib1Var2.f29297c = gb1Var2.f28523p;
                hashMap2.put((String) entry2.getKey(), ib1Var2);
                AndroidUtilities.runOnUIThread(ib1Var2.f29298f, ib1Var2.d * 1000);
            }
        }
    }
}
