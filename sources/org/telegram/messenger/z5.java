package org.telegram.messenger;

import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.Pair;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
public final class z5 extends c1 implements ls {
    public static volatile z5[] T = new z5[4];
    public int D;
    public boolean E;
    public final a0.h F;
    public final ArrayList G;
    public final ArrayList H;
    public final SparseArray I;
    public final y5 J;
    public final y5 K;
    public final y5 L;
    public final y5 M;
    public final y5 N;
    public final y5 O;
    public int P;
    public int Q;
    public int R;
    public final m.f3 S;
    public int f26793a;
    public final ArrayList f26794b;
    public final ArrayList f26795c;
    public final ArrayList d;
    public final ArrayList f26796e;
    public final HashMap f26797f;
    public final HashMap h;
    public final HashMap f26798n;
    public final HashMap f26799r;
    public final SparseArray f26800s;
    public boolean f26801w;
    public final HashMap f26802x;
    public final ArrayList f26803y;

    public z5(int i7) {
        super(i7);
        Integer num;
        Integer valueOf;
        Integer valueOf2;
        this.f26793a = 0;
        this.f26794b = new ArrayList();
        this.f26795c = new ArrayList();
        this.d = new ArrayList();
        this.f26796e = new ArrayList();
        this.f26797f = new HashMap();
        this.h = new HashMap();
        this.f26798n = new HashMap();
        this.f26799r = new HashMap();
        this.f26800s = new SparseArray();
        this.f26801w = false;
        this.f26802x = new HashMap();
        this.f26803y = new ArrayList();
        this.D = 0;
        this.F = new a0.h();
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.I = new SparseArray();
        this.S = new m.f3(this, 5);
        SharedPreferences sharedPreferences = qp.s1(this.currentAccount).f24759e7;
        y5 y5Var = new y5(sharedPreferences.getString("preset0", "1_1_1_1_1048576_512000_512000_524288_0_0_1_1_50_0"), "1_1_1_1_1048576_512000_512000_524288_0_0_1_1_50_0");
        this.J = y5Var;
        y5Var.f26575e = false;
        this.K = new y5(sharedPreferences.getString("preset1", "13_13_13_13_1048576_10485760_1048576_524288_1_1_1_0_100_1"), "13_13_13_13_1048576_10485760_1048576_524288_1_1_1_0_100_1");
        this.L = new y5(sharedPreferences.getString("preset2", "13_13_13_13_1048576_15728640_3145728_524288_1_1_1_0_100_1"), "13_13_13_13_1048576_15728640_3145728_524288_1_1_1_0_100_1");
        boolean contains = sharedPreferences.contains("newConfig");
        if (!contains && getUserConfig().p()) {
            int[] iArr = new int[4];
            int[] iArr2 = new int[4];
            int[] iArr3 = new int[4];
            long[] jArr = new long[7];
            long[] jArr2 = new long[7];
            long[] jArr3 = new long[7];
            int i10 = 0;
            for (int i11 = 4; i10 < i11; i11 = 4) {
                int i12 = i10;
                StringBuilder sb2 = new StringBuilder("mobileDataDownloadMask");
                Object obj = "";
                if (i12 == 0) {
                    num = "";
                } else {
                    num = "";
                    obj = Integer.valueOf(i12);
                }
                sb2.append(obj);
                String sb3 = sb2.toString();
                if (i12 != 0 && !sharedPreferences.contains(sb3)) {
                    iArr[i12] = iArr[0];
                    iArr2[i12] = iArr2[0];
                    iArr3[i12] = iArr3[0];
                } else {
                    iArr[i12] = sharedPreferences.getInt(sb3, 13);
                    StringBuilder sb4 = new StringBuilder("wifiDownloadMask");
                    if (i12 == 0) {
                        valueOf = num;
                    } else {
                        valueOf = Integer.valueOf(i12);
                    }
                    sb4.append(valueOf);
                    iArr2[i12] = sharedPreferences.getInt(sb4.toString(), 13);
                    StringBuilder sb5 = new StringBuilder("roamingDownloadMask");
                    if (i12 == 0) {
                        valueOf2 = num;
                    } else {
                        valueOf2 = Integer.valueOf(i12);
                    }
                    sb5.append(valueOf2);
                    iArr3[i12] = sharedPreferences.getInt(sb5.toString(), 1);
                }
                i10 = i12 + 1;
            }
            jArr[2] = sharedPreferences.getLong("mobileMaxDownloadSize2", this.K.f26573b[1]);
            jArr[3] = sharedPreferences.getLong("mobileMaxDownloadSize3", this.K.f26573b[2]);
            jArr2[2] = sharedPreferences.getLong("wifiMaxDownloadSize2", this.L.f26573b[1]);
            jArr2[3] = sharedPreferences.getLong("wifiMaxDownloadSize3", this.L.f26573b[2]);
            jArr3[2] = sharedPreferences.getLong("roamingMaxDownloadSize2", this.J.f26573b[1]);
            jArr3[3] = sharedPreferences.getLong("roamingMaxDownloadSize3", this.J.f26573b[2]);
            boolean z9 = sharedPreferences.getBoolean("globalAutodownloadEnabled", true);
            y5 y5Var2 = new y5(iArr, this.K.f26573b[0], jArr[2], jArr[3], true, true, z9, false, 100, false);
            this.M = y5Var2;
            y5 y5Var3 = new y5(iArr2, this.L.f26573b[0], jArr2[2], jArr2[3], true, true, z9, false, 100, true);
            this.N = y5Var3;
            y5 y5Var4 = new y5(iArr3, this.J.f26573b[0], jArr3[2], jArr3[3], false, false, z9, true, 50, true);
            this.O = y5Var4;
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putBoolean("newConfig", true);
            edit.putString("mobilePreset", y5Var2.toString());
            edit.putString("wifiPreset", y5Var3.toString());
            edit.putString("roamingPreset", y5Var4.toString());
            this.P = 3;
            edit.putInt("currentMobilePreset", 3);
            this.Q = 3;
            edit.putInt("currentWifiPreset", 3);
            this.R = 3;
            edit.putInt("currentRoamingPreset", 3);
            edit.commit();
        } else {
            this.M = new y5(sharedPreferences.getString("mobilePreset", "13_13_13_13_1048576_10485760_1048576_524288_1_1_1_0_100_1"), "13_13_13_13_1048576_10485760_1048576_524288_1_1_1_0_100_1");
            this.N = new y5(sharedPreferences.getString("wifiPreset", "13_13_13_13_1048576_15728640_3145728_524288_1_1_1_0_100_1"), "13_13_13_13_1048576_15728640_3145728_524288_1_1_1_0_100_1");
            this.O = new y5(sharedPreferences.getString("roamingPreset", "1_1_1_1_1048576_512000_512000_524288_0_0_1_1_50_0"), "1_1_1_1_1048576_512000_512000_524288_0_0_1_1_50_0");
            this.P = sharedPreferences.getInt("currentMobilePreset", 3);
            this.Q = sharedPreferences.getInt("currentWifiPreset", 3);
            this.R = sharedPreferences.getInt("currentRoamingPreset", 3);
            if (!contains) {
                sharedPreferences.edit().putBoolean("newConfig", true).commit();
            }
        }
        g0.h3(new w5(this, 1));
        androidx.mediarouter.app.f fVar = new androidx.mediarouter.app.f(this, 5);
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        if (Build.VERSION.SDK_INT >= 33) {
            t0.f25555b.registerReceiver(fVar, intentFilter, 4);
        } else {
            t0.f25555b.registerReceiver(fVar, intentFilter);
        }
        if (getUserConfig().p()) {
            g();
        }
    }

    public static z5 q(int i7) {
        z5 z5Var;
        z5 z5Var2 = T[i7];
        if (z5Var2 == null) {
            synchronized (z5.class) {
                try {
                    z5Var = T[i7];
                    if (z5Var == null) {
                        z5[] z5VarArr = T;
                        z5 z5Var3 = new z5(i7);
                        z5VarArr[i7] = z5Var3;
                        z5Var = z5Var3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return z5Var;
        }
        return z5Var2;
    }

    public static float r(long[] jArr) {
        if (jArr.length >= 2) {
            long j3 = jArr[1];
            if (j3 != 0) {
                return Math.min(1.0f, ((float) jArr[0]) / ((float) j3));
            }
            return 0.0f;
        }
        return 0.0f;
    }

    public static int x(int i7) {
        if (i7 == 1) {
            return 0;
        }
        if (i7 == 2) {
            return 2;
        }
        if (i7 == 4) {
            return 1;
        }
        if (i7 != 8) {
            return 0;
        }
        return 2;
    }

    public final void a(String str, ij ijVar, x5 x5Var) {
        if (this.f26801w) {
            this.f26802x.put(str, x5Var);
            return;
        }
        v(x5Var);
        HashMap hashMap = this.f26798n;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashMap.put(str, arrayList);
        }
        arrayList.add(new WeakReference(x5Var));
        if (ijVar != null) {
            HashMap hashMap2 = this.f26799r;
            ArrayList arrayList2 = (ArrayList) hashMap2.get(str);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                hashMap2.put(str, arrayList2);
            }
            arrayList2.add(ijVar);
        }
        this.f26800s.put(x5Var.getObserverTag(), str);
    }

    public final int b(org.telegram.tgnet.TLRPC.Message r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.z5.b(org.telegram.tgnet.TLRPC$Message):int");
    }

    public final boolean c(int i7, long j3) {
        y5 n10;
        int e10 = t0.e();
        if (e10 == 1) {
            if (this.N.f26577g) {
                n10 = p();
            } else {
                return false;
            }
        } else if (e10 == 2) {
            if (this.O.f26577g) {
                n10 = o();
            } else {
                return false;
            }
        } else if (this.M.f26577g) {
            n10 = n();
        } else {
            return false;
        }
        int i10 = n10.f26572a[1];
        long j10 = n10.f26573b[x(i7)];
        if (i7 == 1 || (j3 != 0 && j3 <= j10)) {
            if (i7 == 2 || (i7 & i10) != 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean d(ij ijVar) {
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        if (ijVar.D == 23) {
            int i7 = iz.f23357a;
            if (rc.e(1024) && (storyItem = ((TLRPC.TL_messageMediaStory) ij.n1(ijVar)).storyItem) != null && (messageMedia = storyItem.media) != null && messageMedia.document != null && storyItem.isPublic) {
                return true;
            }
            return false;
        } else if (ijVar.Y0 != null) {
            return true;
        } else {
            if (!ijVar.y3() && e(ijVar) == 1) {
                return true;
            }
            return false;
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        boolean z9;
        a0.h hVar = this.F;
        int i11 = qs.Z1;
        SparseArray sparseArray = this.f26800s;
        HashMap hashMap = this.f26798n;
        if (i7 != i11 && i7 != qs.S1) {
            if (i7 != qs.Y1 && i7 != qs.R1) {
                if (i7 == qs.X1) {
                    this.f26801w = true;
                    ArrayList arrayList = (ArrayList) hashMap.get((String) objArr[0]);
                    if (arrayList != null) {
                        Long l10 = (Long) objArr[1];
                        Long l11 = (Long) objArr[2];
                        int size = arrayList.size();
                        for (int i12 = 0; i12 < size; i12++) {
                            WeakReference weakReference = (WeakReference) arrayList.get(i12);
                            if (weakReference.get() != null) {
                                ((x5) weakReference.get()).i(l10.longValue(), l11.longValue());
                            }
                        }
                    }
                    this.f26801w = false;
                    u();
                    return;
                } else if (i7 == qs.W1) {
                    this.f26801w = true;
                    String str = (String) objArr[0];
                    ArrayList arrayList2 = (ArrayList) hashMap.get(str);
                    if (arrayList2 != null) {
                        Long l12 = (Long) objArr[1];
                        Long l13 = (Long) objArr[2];
                        Boolean bool = (Boolean) objArr[3];
                        int size2 = arrayList2.size();
                        for (int i13 = 0; i13 < size2; i13++) {
                            WeakReference weakReference2 = (WeakReference) arrayList2.get(i13);
                            if (weakReference2.get() != null) {
                                long longValue = l12.longValue();
                                long longValue2 = l13.longValue();
                                bool.getClass();
                                ((x5) weakReference2.get()).o(longValue, longValue2);
                            }
                        }
                    }
                    this.f26801w = false;
                    u();
                    try {
                        ArrayList arrayList3 = (ArrayList) getSendMessagesHelper().f22751a.get(str);
                        if (arrayList3 != null) {
                            for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                                sy syVar = (sy) arrayList3.get(i14);
                                if (syVar.f25538n == null) {
                                    long j3 = syVar.f25527a;
                                    Long l14 = (Long) hVar.f(j3);
                                    if (syVar.f25530e == 4) {
                                        if (l14 != null && l14.longValue() + 4000 >= System.currentTimeMillis()) {
                                        }
                                        ij ijVar = (ij) syVar.E.get(str + "_i");
                                        if (ijVar != null && ij.M4(ijVar.f23237k)) {
                                            getMessagesController().C4(5, 0, j3, 0, null);
                                        } else if (ijVar != null && ijVar.F0() != null) {
                                            getMessagesController().C4(3, 0, j3, 0, null);
                                        } else {
                                            getMessagesController().C4(4, 0, j3, 0, null);
                                        }
                                        hVar.k(Long.valueOf(System.currentTimeMillis()), j3);
                                    } else {
                                        syVar.f25537m.F0();
                                        if (l14 == null || l14.longValue() + 4000 < System.currentTimeMillis()) {
                                            if (syVar.f25537m.i4()) {
                                                getMessagesController().C4(8, 0, j3, 0, null);
                                            } else if (ij.M4(syVar.f25537m.f23237k)) {
                                                getMessagesController().C4(5, 0, j3, 0, null);
                                            } else if (ij.S4(syVar.f25537m.f23237k)) {
                                                getMessagesController().C4(9, 0, j3, 0, null);
                                            } else if (syVar.f25537m.F0() != null) {
                                                getMessagesController().C4(3, 0, j3, 0, null);
                                            } else if (syVar.f25532g != null) {
                                                getMessagesController().C4(4, 0, j3, 0, null);
                                            }
                                            hVar.k(Long.valueOf(System.currentTimeMillis()), j3);
                                        }
                                    }
                                }
                            }
                            return;
                        }
                        return;
                    } catch (Exception e10) {
                        a8.g(e10, true);
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f26801w = true;
            String str2 = (String) objArr[0];
            HashMap hashMap2 = this.f26799r;
            ArrayList arrayList4 = (ArrayList) hashMap2.get(str2);
            if (arrayList4 != null) {
                int size3 = arrayList4.size();
                for (int i15 = 0; i15 < size3; i15++) {
                    ((ij) arrayList4.get(i15)).f23286x0 = true;
                }
                hashMap2.remove(str2);
            }
            ArrayList arrayList5 = (ArrayList) hashMap.get(str2);
            if (arrayList5 != null) {
                int size4 = arrayList5.size();
                for (int i16 = 0; i16 < size4; i16++) {
                    WeakReference weakReference3 = (WeakReference) arrayList5.get(i16);
                    if (weakReference3.get() != null) {
                        ((x5) weakReference3.get()).M(str2);
                        sparseArray.remove(((x5) weakReference3.get()).getObserverTag());
                    }
                }
                hashMap.remove(str2);
            }
            this.f26801w = false;
            u();
            h(0, str2);
            return;
        }
        String str3 = (String) objArr[0];
        Integer num = (Integer) objArr[1];
        this.f26801w = true;
        ArrayList arrayList6 = (ArrayList) hashMap.get(str3);
        if (arrayList6 != null) {
            int size5 = arrayList6.size();
            for (int i17 = 0; i17 < size5; i17++) {
                WeakReference weakReference4 = (WeakReference) arrayList6.get(i17);
                if (weakReference4.get() != null) {
                    x5 x5Var = (x5) weakReference4.get();
                    if (num.intValue() == 1) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    x5Var.C(z9);
                    if (num.intValue() != 1) {
                        sparseArray.remove(((x5) weakReference4.get()).getObserverTag());
                    }
                }
            }
            if (num.intValue() != 1) {
                hashMap.remove(str3);
            }
        }
        this.f26801w = false;
        u();
        h(num.intValue(), str3);
    }

    public final int e(org.telegram.messenger.ij r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.z5.e(org.telegram.messenger.ij):int");
    }

    public final boolean f() {
        y5 n10;
        int e10 = t0.e();
        if (e10 == 1) {
            if (!this.N.f26577g) {
                return false;
            }
            n10 = p();
        } else if (e10 == 2) {
            if (!this.O.f26577g) {
                return false;
            }
            n10 = o();
        } else if (!this.M.f26577g) {
            return false;
        } else {
            n10 = n();
        }
        return n10.f26575e;
    }

    public final void g() {
        boolean z9;
        int m10 = m();
        if (m10 != this.f26793a) {
            this.f26793a = m10;
            int i7 = m10 & 1;
            ArrayList arrayList = this.f26794b;
            if (i7 != 0) {
                if (arrayList.isEmpty()) {
                    t(1);
                }
            } else {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    a6 a6Var = (a6) arrayList.get(i10);
                    TLObject tLObject = a6Var.f21389a;
                    if (tLObject instanceof TLRPC.Photo) {
                        TLRPC.PhotoSize w10 = w7.w(((TLRPC.Photo) tLObject).sizes, g0.Z0(false), false, null, false);
                        w7 fileLoader = getFileLoader();
                        fileLoader.getClass();
                        fileLoader.e(null, null, null, w10.location, null, null);
                    } else if (tLObject instanceof TLRPC.Document) {
                        getFileLoader().f((TLRPC.Document) a6Var.f21389a);
                    }
                }
                arrayList.clear();
            }
            int i11 = m10 & 2;
            ArrayList arrayList2 = this.f26795c;
            if (i11 != 0) {
                if (arrayList2.isEmpty()) {
                    t(2);
                }
            } else {
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    getFileLoader().f((TLRPC.Document) ((a6) arrayList2.get(i12)).f21389a);
                }
                arrayList2.clear();
            }
            int i13 = m10 & 8;
            ArrayList arrayList3 = this.d;
            if (i13 != 0) {
                if (arrayList3.isEmpty()) {
                    t(8);
                }
            } else {
                for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                    getFileLoader().f((TLRPC.Document) ((a6) arrayList3.get(i14)).f21389a);
                }
                arrayList3.clear();
            }
            int i15 = m10 & 4;
            ArrayList arrayList4 = this.f26796e;
            if (i15 != 0) {
                if (arrayList4.isEmpty()) {
                    t(4);
                }
            } else {
                for (int i16 = 0; i16 < arrayList4.size(); i16++) {
                    getFileLoader().f((TLRPC.Document) ((a6) arrayList4.get(i16)).f21389a);
                }
                arrayList4.clear();
            }
            if (!this.M.f26577g && !this.O.f26577g && !this.N.f26577g) {
                z9 = false;
            } else {
                z9 = false;
                for (int i17 = 0; i17 < 4; i17++) {
                    if ((n().f26572a[i17] & 1) != 0 || (p().f26572a[i17] & 1) != 0 || (o().f26572a[i17] & 1) != 0) {
                        z9 |= true;
                    }
                    if ((n().f26572a[i17] & 2) != 0 || (p().f26572a[i17] & 2) != 0 || (o().f26572a[i17] & 2) != 0) {
                        z9 |= true;
                    }
                    if ((n().f26572a[i17] & 4) != 0 || (p().f26572a[i17] & 4) != 0 || (o().f26572a[i17] & 4) != 0) {
                        z9 |= true;
                    }
                    if ((n().f26572a[i17] & 8) != 0 || (p().f26572a[i17] & 8) != 0 || (o().f26572a[i17] & 8) != 0) {
                        z9 |= true;
                    }
                }
            }
            if (!z9) {
                getMessagesStorage().r(0);
                return;
            }
            if (!(z9 & true)) {
                getMessagesStorage().r(1);
            }
            if (!(z9 & true)) {
                getMessagesStorage().r(2);
            }
            if (!(z9 & true)) {
                getMessagesStorage().r(4);
            }
            if (!(z9 & true)) {
                getMessagesStorage().r(8);
            }
        }
    }

    public final void h(int i7, String str) {
        HashMap hashMap = this.f26797f;
        a6 a6Var = (a6) hashMap.get(str);
        if (a6Var != null) {
            hashMap.remove(str);
            this.h.remove(new Pair(Long.valueOf(a6Var.f21391c), Integer.valueOf(a6Var.f21390b)));
            if (i7 == 0 || i7 == 2) {
                yr messagesStorage = getMessagesStorage();
                long j3 = a6Var.f21391c;
                messagesStorage.f26688a.c(new aq(messagesStorage, a6Var.f21390b, j3, 6));
            }
            int i10 = a6Var.f21390b;
            if (i10 == 1) {
                ArrayList arrayList = this.f26794b;
                arrayList.remove(a6Var);
                if (arrayList.isEmpty()) {
                    t(1);
                }
            } else if (i10 == 2) {
                ArrayList arrayList2 = this.f26795c;
                arrayList2.remove(a6Var);
                if (arrayList2.isEmpty()) {
                    t(2);
                }
            } else if (i10 == 4) {
                ArrayList arrayList3 = this.f26796e;
                arrayList3.remove(a6Var);
                if (arrayList3.isEmpty()) {
                    t(4);
                }
            } else if (i10 == 8) {
                ArrayList arrayList4 = this.d;
                arrayList4.remove(a6Var);
                if (arrayList4.isEmpty()) {
                    t(8);
                }
            }
        }
    }

    public final void i(int i7, long j3) {
        SparseArray sparseArray = this.I;
        ij ijVar = (ij) sparseArray.get(i7);
        if (ijVar != null && ij.B0(ijVar.f23237k) == j3) {
            sparseArray.remove(i7);
            if (sparseArray.size() == 0) {
                getNotificationCenter().k(qs.f24961b5, new Object[0]);
            }
        }
    }

    public final void j(ArrayList arrayList) {
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            int i10 = 0;
            while (true) {
                ArrayList arrayList2 = this.H;
                if (i10 < arrayList2.size()) {
                    if (((ij) arrayList.get(i7)).f1() == ((ij) arrayList2.get(i10)).f1() && ij.B0(((ij) arrayList2.get(i10)).f23237k) == ij.B0(((ij) arrayList.get(i7)).f23237k)) {
                        arrayList2.remove(i10);
                        break;
                    }
                    i10++;
                } else {
                    int i11 = 0;
                    while (true) {
                        ArrayList arrayList3 = this.G;
                        if (i11 >= arrayList3.size()) {
                            break;
                        }
                        if (((ij) arrayList.get(i7)).f1() == ((ij) arrayList3.get(i11)).f1() && ij.B0(((ij) arrayList3.get(i11)).f23237k) == ij.B0(((ij) arrayList.get(i7)).f23237k)) {
                            arrayList3.remove(i11);
                            break;
                        }
                        i11++;
                    }
                }
            }
            ((ij) arrayList.get(i7)).P = false;
            w7.G(this.currentAccount).X(((ij) arrayList.get(i7)).F0(), arrayList.get(i7), 0, 0);
            w7.G(this.currentAccount).f(((ij) arrayList.get(i7)).F0());
        }
        getNotificationCenter().k(qs.f24961b5, new Object[0]);
        getMessagesStorage().f26688a.c(new b4(3, this, arrayList));
    }

    public final int k() {
        int i7 = this.D;
        this.D = i7 + 1;
        return i7;
    }

    public final int l() {
        int[] iArr;
        int i7;
        int e10 = t0.e();
        if (e10 == 1) {
            if (!this.N.f26577g) {
                return 0;
            }
            iArr = p().f26572a;
        } else if (e10 == 2) {
            if (!this.O.f26577g) {
                return 0;
            }
            iArr = o().f26572a;
        } else if (!this.M.f26577g) {
            return 0;
        } else {
            iArr = n().f26572a;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            int i12 = iArr[i11];
            if ((i12 & 1) != 0) {
                i7 = 1;
            } else {
                i7 = 0;
            }
            if ((i12 & 2) != 0) {
                i7 |= 2;
            }
            if ((i12 & 4) != 0) {
                i7 |= 4;
            }
            if ((i12 & 8) != 0) {
                i7 |= 8;
            }
            i10 |= i7 << (i11 * 8);
        }
        return i10;
    }

    public final int m() {
        int e10 = t0.e();
        int i7 = 0;
        if (e10 == 1) {
            if (!this.N.f26577g) {
                return 0;
            }
            int i10 = 0;
            while (i7 < 4) {
                i10 |= p().f26572a[i7];
                i7++;
            }
            return i10;
        } else if (e10 == 2) {
            if (!this.O.f26577g) {
                return 0;
            }
            int i11 = 0;
            while (i7 < 4) {
                i11 |= o().f26572a[i7];
                i7++;
            }
            return i11;
        } else if (!this.M.f26577g) {
            return 0;
        } else {
            int i12 = 0;
            while (i7 < 4) {
                i12 |= n().f26572a[i7];
                i7++;
            }
            return i12;
        }
    }

    public final y5 n() {
        int i7 = this.P;
        if (i7 == 0) {
            return this.J;
        }
        if (i7 == 1) {
            return this.K;
        }
        if (i7 == 2) {
            return this.L;
        }
        return this.M;
    }

    public final y5 o() {
        int i7 = this.R;
        if (i7 == 0) {
            return this.J;
        }
        if (i7 == 1) {
            return this.K;
        }
        if (i7 == 2) {
            return this.L;
        }
        return this.O;
    }

    public final y5 p() {
        int i7 = this.Q;
        if (i7 == 0) {
            return this.J;
        }
        if (i7 == 1) {
            return this.K;
        }
        if (i7 == 2) {
            return this.L;
        }
        return this.N;
    }

    public final void s(boolean z9) {
        if (!this.E) {
            if (z9 || Math.abs(System.currentTimeMillis() - getUserConfig().f24462a0) >= 86400000) {
                this.E = true;
                getConnectionsManager().sendRequest(new TL_account.getAutoDownloadSettings(), new s1(this, 1));
            }
        }
    }

    public final void t(int i7) {
        int m10 = m();
        if ((m10 & 1) != 0 && (i7 & 1) != 0 && this.f26794b.isEmpty()) {
            yr messagesStorage = getMessagesStorage();
            messagesStorage.f26688a.c(new tp(messagesStorage, 1, 6));
        }
        if ((m10 & 2) != 0 && (i7 & 2) != 0 && this.f26795c.isEmpty()) {
            yr messagesStorage2 = getMessagesStorage();
            messagesStorage2.f26688a.c(new tp(messagesStorage2, 2, 6));
        }
        if ((m10 & 4) != 0 && (i7 & 4) != 0 && this.f26796e.isEmpty()) {
            yr messagesStorage3 = getMessagesStorage();
            messagesStorage3.f26688a.c(new tp(messagesStorage3, 4, 6));
        }
        if ((m10 & 8) != 0 && (i7 & 8) != 0 && this.d.isEmpty()) {
            yr messagesStorage4 = getMessagesStorage();
            messagesStorage4.f26688a.c(new tp(messagesStorage4, 8, 6));
        }
    }

    public final void u() {
        HashMap hashMap = this.f26802x;
        for (Map.Entry entry : hashMap.entrySet()) {
            a((String) entry.getKey(), null, (x5) entry.getValue());
        }
        hashMap.clear();
        ArrayList arrayList = this.f26803y;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            v((x5) obj);
        }
        arrayList.clear();
    }

    public final void v(x5 x5Var) {
        if (this.f26801w) {
            this.f26803y.add(x5Var);
            return;
        }
        int observerTag = x5Var.getObserverTag();
        SparseArray sparseArray = this.f26800s;
        String str = (String) sparseArray.get(observerTag);
        if (str != null) {
            HashMap hashMap = this.f26798n;
            ArrayList arrayList = (ArrayList) hashMap.get(str);
            if (arrayList != null) {
                int i7 = 0;
                while (i7 < arrayList.size()) {
                    WeakReference weakReference = (WeakReference) arrayList.get(i7);
                    if (weakReference.get() == null || weakReference.get() == x5Var) {
                        arrayList.remove(i7);
                        i7--;
                    }
                    i7++;
                }
                if (arrayList.isEmpty()) {
                    hashMap.remove(str);
                }
            }
            sparseArray.remove(x5Var.getObserverTag());
        }
    }

    public final void w(int i7) {
        y5 o4;
        boolean z9;
        long j3;
        TL_account.saveAutoDownloadSettings saveautodownloadsettings = new TL_account.saveAutoDownloadSettings();
        if (i7 == 0) {
            o4 = n();
            z9 = this.M.f26577g;
        } else if (i7 == 1) {
            o4 = p();
            z9 = this.N.f26577g;
        } else {
            o4 = o();
            z9 = this.O.f26577g;
        }
        TLRPC.TL_autoDownloadSettings tL_autoDownloadSettings = new TLRPC.TL_autoDownloadSettings();
        saveautodownloadsettings.settings = tL_autoDownloadSettings;
        boolean z10 = o4.d;
        long[] jArr = o4.f26573b;
        tL_autoDownloadSettings.audio_preload_next = z10;
        tL_autoDownloadSettings.video_preload_large = o4.f26574c;
        tL_autoDownloadSettings.phonecalls_less_data = o4.f26576f;
        tL_autoDownloadSettings.video_upload_maxbitrate = o4.h;
        tL_autoDownloadSettings.disabled = !z9;
        int i10 = 0;
        int i11 = 0;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        while (true) {
            int[] iArr = o4.f26572a;
            if (i11 >= iArr.length) {
                break;
            }
            int i12 = iArr[i11];
            if ((i12 & 1) != 0) {
                z11 = true;
            }
            if ((i12 & 4) != 0) {
                z12 = true;
            }
            if ((i12 & 8) != 0) {
                z13 = true;
            }
            if (z11 && z12 && z13) {
                break;
            }
            i11++;
        }
        TLRPC.TL_autoDownloadSettings tL_autoDownloadSettings2 = saveautodownloadsettings.settings;
        if (z11) {
            i10 = (int) jArr[0];
        }
        tL_autoDownloadSettings2.photo_size_max = i10;
        long j10 = 0;
        if (z12) {
            j3 = jArr[1];
        } else {
            j3 = 0;
        }
        tL_autoDownloadSettings2.video_size_max = j3;
        if (z13) {
            j10 = jArr[2];
        }
        tL_autoDownloadSettings2.file_size_max = j10;
        getConnectionsManager().sendRequest(saveautodownloadsettings, new di.u5(9));
    }

    public final void y() {
        ArrayList arrayList = this.G;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (getFileLoader().T(((ij) arrayList.get(size)).S0())) {
                getFileLoader().X(((ij) arrayList.get(size)).F0(), arrayList.get(size), 2, 0);
            }
        }
    }
}
