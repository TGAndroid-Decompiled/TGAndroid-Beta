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
public final class z5 extends c1 implements is {
    public static volatile z5[] U = new z5[4];
    public int E;
    public boolean F;
    public final a0.h G;
    public final ArrayList H;
    public final ArrayList I;
    public final SparseArray J;
    public final y5 K;
    public final y5 L;
    public final y5 M;
    public final y5 N;
    public final y5 O;
    public final y5 P;
    public int Q;
    public int R;
    public int S;
    public final j6.o T;
    public int f27882a;
    public final ArrayList f27883b;
    public final ArrayList f27884c;
    public final ArrayList d;
    public final ArrayList f27885e;
    public final HashMap f27886f;
    public final HashMap h;
    public final HashMap f27887n;
    public final HashMap f27888r;
    public final SparseArray f27889s;
    public boolean f27890w;
    public final HashMap f27891x;
    public final ArrayList f27892y;

    public z5(int i7) {
        super(i7);
        Integer num;
        Integer valueOf;
        Integer valueOf2;
        this.f27882a = 0;
        this.f27883b = new ArrayList();
        this.f27884c = new ArrayList();
        this.d = new ArrayList();
        this.f27885e = new ArrayList();
        this.f27886f = new HashMap();
        this.h = new HashMap();
        this.f27887n = new HashMap();
        this.f27888r = new HashMap();
        this.f27889s = new SparseArray();
        this.f27890w = false;
        this.f27891x = new HashMap();
        this.f27892y = new ArrayList();
        this.E = 0;
        this.G = new a0.h();
        this.H = new ArrayList();
        this.I = new ArrayList();
        this.J = new SparseArray();
        this.T = new j6.o(this, 8);
        SharedPreferences sharedPreferences = np.s1(this.currentAccount).f25280f7;
        y5 y5Var = new y5(sharedPreferences.getString("preset0", "1_1_1_1_1048576_512000_512000_524288_0_0_1_1_50_0"), "1_1_1_1_1048576_512000_512000_524288_0_0_1_1_50_0");
        this.K = y5Var;
        y5Var.f27661e = false;
        this.L = new y5(sharedPreferences.getString("preset1", "13_13_13_13_1048576_10485760_1048576_524288_1_1_1_0_100_1"), "13_13_13_13_1048576_10485760_1048576_524288_1_1_1_0_100_1");
        this.M = new y5(sharedPreferences.getString("preset2", "13_13_13_13_1048576_15728640_3145728_524288_1_1_1_0_100_1"), "13_13_13_13_1048576_15728640_3145728_524288_1_1_1_0_100_1");
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
            jArr[2] = sharedPreferences.getLong("mobileMaxDownloadSize2", this.L.f27659b[1]);
            jArr[3] = sharedPreferences.getLong("mobileMaxDownloadSize3", this.L.f27659b[2]);
            jArr2[2] = sharedPreferences.getLong("wifiMaxDownloadSize2", this.M.f27659b[1]);
            jArr2[3] = sharedPreferences.getLong("wifiMaxDownloadSize3", this.M.f27659b[2]);
            jArr3[2] = sharedPreferences.getLong("roamingMaxDownloadSize2", this.K.f27659b[1]);
            jArr3[3] = sharedPreferences.getLong("roamingMaxDownloadSize3", this.K.f27659b[2]);
            boolean z10 = sharedPreferences.getBoolean("globalAutodownloadEnabled", true);
            y5 y5Var2 = new y5(iArr, this.L.f27659b[0], jArr[2], jArr[3], true, true, z10, false, 100, false);
            this.N = y5Var2;
            y5 y5Var3 = new y5(iArr2, this.M.f27659b[0], jArr2[2], jArr2[3], true, true, z10, false, 100, true);
            this.O = y5Var3;
            y5 y5Var4 = new y5(iArr3, this.K.f27659b[0], jArr3[2], jArr3[3], false, false, z10, true, 50, true);
            this.P = y5Var4;
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putBoolean("newConfig", true);
            edit.putString("mobilePreset", y5Var2.toString());
            edit.putString("wifiPreset", y5Var3.toString());
            edit.putString("roamingPreset", y5Var4.toString());
            this.Q = 3;
            edit.putInt("currentMobilePreset", 3);
            this.R = 3;
            edit.putInt("currentWifiPreset", 3);
            this.S = 3;
            edit.putInt("currentRoamingPreset", 3);
            edit.commit();
        } else {
            this.N = new y5(sharedPreferences.getString("mobilePreset", "13_13_13_13_1048576_10485760_1048576_524288_1_1_1_0_100_1"), "13_13_13_13_1048576_10485760_1048576_524288_1_1_1_0_100_1");
            this.O = new y5(sharedPreferences.getString("wifiPreset", "13_13_13_13_1048576_15728640_3145728_524288_1_1_1_0_100_1"), "13_13_13_13_1048576_15728640_3145728_524288_1_1_1_0_100_1");
            this.P = new y5(sharedPreferences.getString("roamingPreset", "1_1_1_1_1048576_512000_512000_524288_0_0_1_1_50_0"), "1_1_1_1_1048576_512000_512000_524288_0_0_1_1_50_0");
            this.Q = sharedPreferences.getInt("currentMobilePreset", 3);
            this.R = sharedPreferences.getInt("currentWifiPreset", 3);
            this.S = sharedPreferences.getInt("currentRoamingPreset", 3);
            if (!contains) {
                sharedPreferences.edit().putBoolean("newConfig", true).commit();
            }
        }
        g0.h3(new w5(this, 1));
        androidx.mediarouter.app.f fVar = new androidx.mediarouter.app.f(this, 5);
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        if (Build.VERSION.SDK_INT >= 33) {
            t0.f26600b.registerReceiver(fVar, intentFilter, 4);
        } else {
            t0.f26600b.registerReceiver(fVar, intentFilter);
        }
        if (getUserConfig().p()) {
            g();
        }
    }

    public static z5 q(int i7) {
        z5 z5Var;
        z5 z5Var2 = U[i7];
        if (z5Var2 == null) {
            synchronized (z5.class) {
                try {
                    z5Var = U[i7];
                    if (z5Var == null) {
                        z5[] z5VarArr = U;
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

    public final void a(String str, gj gjVar, x5 x5Var) {
        if (this.f27890w) {
            this.f27891x.put(str, x5Var);
            return;
        }
        v(x5Var);
        HashMap hashMap = this.f27887n;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashMap.put(str, arrayList);
        }
        arrayList.add(new WeakReference(x5Var));
        if (gjVar != null) {
            HashMap hashMap2 = this.f27888r;
            ArrayList arrayList2 = (ArrayList) hashMap2.get(str);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                hashMap2.put(str, arrayList2);
            }
            arrayList2.add(gjVar);
        }
        this.f27889s.put(x5Var.getObserverTag(), str);
    }

    public final int b(org.telegram.tgnet.TLRPC.Message r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.z5.b(org.telegram.tgnet.TLRPC$Message):int");
    }

    public final boolean c(int i7, long j3) {
        y5 n10;
        int e10 = t0.e();
        if (e10 == 1) {
            if (this.O.f27663g) {
                n10 = p();
            } else {
                return false;
            }
        } else if (e10 == 2) {
            if (this.P.f27663g) {
                n10 = o();
            } else {
                return false;
            }
        } else if (this.N.f27663g) {
            n10 = n();
        } else {
            return false;
        }
        int i10 = n10.f27658a[1];
        long j10 = n10.f27659b[x(i7)];
        if (i7 == 1 || (j3 != 0 && j3 <= j10)) {
            if (i7 == 2 || (i7 & i10) != 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean d(gj gjVar) {
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        if (gjVar.D == 23) {
            int i7 = gz.f23929a;
            if (qc.e(1024) && (storyItem = ((TLRPC.TL_messageMediaStory) gj.m1(gjVar)).storyItem) != null && (messageMedia = storyItem.media) != null && messageMedia.document != null && storyItem.isPublic) {
                return true;
            }
            return false;
        } else if (gjVar.f23773a1 != null) {
            return true;
        } else {
            if (!gjVar.x3() && e(gjVar) == 1) {
                return true;
            }
            return false;
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        boolean z10;
        a0.h hVar = this.G;
        int i11 = ns.Z1;
        SparseArray sparseArray = this.f27889s;
        HashMap hashMap = this.f27887n;
        if (i7 != i11 && i7 != ns.S1) {
            if (i7 != ns.Y1 && i7 != ns.R1) {
                if (i7 == ns.X1) {
                    this.f27890w = true;
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
                    this.f27890w = false;
                    u();
                    return;
                } else if (i7 == ns.W1) {
                    this.f27890w = true;
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
                    this.f27890w = false;
                    u();
                    try {
                        ArrayList arrayList3 = (ArrayList) getSendMessagesHelper().f23386a.get(str);
                        if (arrayList3 != null) {
                            for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                                qy qyVar = (qy) arrayList3.get(i14);
                                if (qyVar.f26158n == null) {
                                    long j3 = qyVar.f26147a;
                                    Long l14 = (Long) hVar.f(j3);
                                    if (qyVar.f26150e == 4) {
                                        if (l14 != null && l14.longValue() + 4000 >= System.currentTimeMillis()) {
                                        }
                                        gj gjVar = (gj) qyVar.E.get(str + "_i");
                                        if (gjVar != null && gj.L4(gjVar.f23817k)) {
                                            getMessagesController().D4(5, 0, j3, 0, null);
                                        } else if (gjVar != null && gjVar.F0() != null) {
                                            getMessagesController().D4(3, 0, j3, 0, null);
                                        } else {
                                            getMessagesController().D4(4, 0, j3, 0, null);
                                        }
                                        hVar.k(Long.valueOf(System.currentTimeMillis()), j3);
                                    } else {
                                        qyVar.f26157m.F0();
                                        if (l14 == null || l14.longValue() + 4000 < System.currentTimeMillis()) {
                                            if (qyVar.f26157m.h4()) {
                                                getMessagesController().D4(8, 0, j3, 0, null);
                                            } else if (gj.L4(qyVar.f26157m.f23817k)) {
                                                getMessagesController().D4(5, 0, j3, 0, null);
                                            } else if (gj.R4(qyVar.f26157m.f23817k)) {
                                                getMessagesController().D4(9, 0, j3, 0, null);
                                            } else if (qyVar.f26157m.F0() != null) {
                                                getMessagesController().D4(3, 0, j3, 0, null);
                                            } else if (qyVar.f26152g != null) {
                                                getMessagesController().D4(4, 0, j3, 0, null);
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
            this.f27890w = true;
            String str2 = (String) objArr[0];
            HashMap hashMap2 = this.f27888r;
            ArrayList arrayList4 = (ArrayList) hashMap2.get(str2);
            if (arrayList4 != null) {
                int size3 = arrayList4.size();
                for (int i15 = 0; i15 < size3; i15++) {
                    ((gj) arrayList4.get(i15)).f23876z0 = true;
                }
                hashMap2.remove(str2);
            }
            ArrayList arrayList5 = (ArrayList) hashMap.get(str2);
            if (arrayList5 != null) {
                int size4 = arrayList5.size();
                for (int i16 = 0; i16 < size4; i16++) {
                    WeakReference weakReference3 = (WeakReference) arrayList5.get(i16);
                    if (weakReference3.get() != null) {
                        ((x5) weakReference3.get()).N(str2);
                        sparseArray.remove(((x5) weakReference3.get()).getObserverTag());
                    }
                }
                hashMap.remove(str2);
            }
            this.f27890w = false;
            u();
            h(0, str2);
            return;
        }
        String str3 = (String) objArr[0];
        Integer num = (Integer) objArr[1];
        this.f27890w = true;
        ArrayList arrayList6 = (ArrayList) hashMap.get(str3);
        if (arrayList6 != null) {
            int size5 = arrayList6.size();
            for (int i17 = 0; i17 < size5; i17++) {
                WeakReference weakReference4 = (WeakReference) arrayList6.get(i17);
                if (weakReference4.get() != null) {
                    x5 x5Var = (x5) weakReference4.get();
                    if (num.intValue() == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    x5Var.C(z10);
                    if (num.intValue() != 1) {
                        sparseArray.remove(((x5) weakReference4.get()).getObserverTag());
                    }
                }
            }
            if (num.intValue() != 1) {
                hashMap.remove(str3);
            }
        }
        this.f27890w = false;
        u();
        h(num.intValue(), str3);
    }

    public final int e(org.telegram.messenger.gj r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.z5.e(org.telegram.messenger.gj):int");
    }

    public final boolean f() {
        y5 n10;
        int e10 = t0.e();
        if (e10 == 1) {
            if (!this.O.f27663g) {
                return false;
            }
            n10 = p();
        } else if (e10 == 2) {
            if (!this.P.f27663g) {
                return false;
            }
            n10 = o();
        } else if (!this.N.f27663g) {
            return false;
        } else {
            n10 = n();
        }
        return n10.f27661e;
    }

    public final void g() {
        boolean z10;
        int m10 = m();
        if (m10 != this.f27882a) {
            this.f27882a = m10;
            int i7 = m10 & 1;
            ArrayList arrayList = this.f27883b;
            if (i7 != 0) {
                if (arrayList.isEmpty()) {
                    t(1);
                }
            } else {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    a6 a6Var = (a6) arrayList.get(i10);
                    TLObject tLObject = a6Var.f22464a;
                    if (tLObject instanceof TLRPC.Photo) {
                        TLRPC.PhotoSize w10 = w7.w(((TLRPC.Photo) tLObject).sizes, g0.Z0(false), false, null, false);
                        w7 fileLoader = getFileLoader();
                        fileLoader.getClass();
                        fileLoader.e(null, null, null, w10.location, null, null);
                    } else if (tLObject instanceof TLRPC.Document) {
                        getFileLoader().f((TLRPC.Document) a6Var.f22464a);
                    }
                }
                arrayList.clear();
            }
            int i11 = m10 & 2;
            ArrayList arrayList2 = this.f27884c;
            if (i11 != 0) {
                if (arrayList2.isEmpty()) {
                    t(2);
                }
            } else {
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    getFileLoader().f((TLRPC.Document) ((a6) arrayList2.get(i12)).f22464a);
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
                    getFileLoader().f((TLRPC.Document) ((a6) arrayList3.get(i14)).f22464a);
                }
                arrayList3.clear();
            }
            int i15 = m10 & 4;
            ArrayList arrayList4 = this.f27885e;
            if (i15 != 0) {
                if (arrayList4.isEmpty()) {
                    t(4);
                }
            } else {
                for (int i16 = 0; i16 < arrayList4.size(); i16++) {
                    getFileLoader().f((TLRPC.Document) ((a6) arrayList4.get(i16)).f22464a);
                }
                arrayList4.clear();
            }
            if (!this.N.f27663g && !this.P.f27663g && !this.O.f27663g) {
                z10 = false;
            } else {
                z10 = false;
                for (int i17 = 0; i17 < 4; i17++) {
                    if ((n().f27658a[i17] & 1) != 0 || (p().f27658a[i17] & 1) != 0 || (o().f27658a[i17] & 1) != 0) {
                        z10 |= true;
                    }
                    if ((n().f27658a[i17] & 2) != 0 || (p().f27658a[i17] & 2) != 0 || (o().f27658a[i17] & 2) != 0) {
                        z10 |= true;
                    }
                    if ((n().f27658a[i17] & 4) != 0 || (p().f27658a[i17] & 4) != 0 || (o().f27658a[i17] & 4) != 0) {
                        z10 |= true;
                    }
                    if ((n().f27658a[i17] & 8) != 0 || (p().f27658a[i17] & 8) != 0 || (o().f27658a[i17] & 8) != 0) {
                        z10 |= true;
                    }
                }
            }
            if (!z10) {
                getMessagesStorage().r(0);
                return;
            }
            if (!(z10 & true)) {
                getMessagesStorage().r(1);
            }
            if (!(z10 & true)) {
                getMessagesStorage().r(2);
            }
            if (!(z10 & true)) {
                getMessagesStorage().r(4);
            }
            if (!(z10 & true)) {
                getMessagesStorage().r(8);
            }
        }
    }

    public final void h(int i7, String str) {
        HashMap hashMap = this.f27886f;
        a6 a6Var = (a6) hashMap.get(str);
        if (a6Var != null) {
            hashMap.remove(str);
            this.h.remove(new Pair(Long.valueOf(a6Var.f22466c), Integer.valueOf(a6Var.f22465b)));
            if (i7 == 0 || i7 == 2) {
                vr messagesStorage = getMessagesStorage();
                long j3 = a6Var.f22466c;
                messagesStorage.f27220a.c(new xp(messagesStorage, a6Var.f22465b, j3, 6));
            }
            int i10 = a6Var.f22465b;
            if (i10 == 1) {
                ArrayList arrayList = this.f27883b;
                arrayList.remove(a6Var);
                if (arrayList.isEmpty()) {
                    t(1);
                }
            } else if (i10 == 2) {
                ArrayList arrayList2 = this.f27884c;
                arrayList2.remove(a6Var);
                if (arrayList2.isEmpty()) {
                    t(2);
                }
            } else if (i10 == 4) {
                ArrayList arrayList3 = this.f27885e;
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
        SparseArray sparseArray = this.J;
        gj gjVar = (gj) sparseArray.get(i7);
        if (gjVar != null && gj.B0(gjVar.f23817k) == j3) {
            sparseArray.remove(i7);
            if (sparseArray.size() == 0) {
                getNotificationCenter().k(ns.f25474b5, new Object[0]);
            }
        }
    }

    public final void j(ArrayList arrayList) {
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            int i10 = 0;
            while (true) {
                ArrayList arrayList2 = this.I;
                if (i10 < arrayList2.size()) {
                    if (((gj) arrayList.get(i7)).e1() == ((gj) arrayList2.get(i10)).e1() && gj.B0(((gj) arrayList2.get(i10)).f23817k) == gj.B0(((gj) arrayList.get(i7)).f23817k)) {
                        arrayList2.remove(i10);
                        break;
                    }
                    i10++;
                } else {
                    int i11 = 0;
                    while (true) {
                        ArrayList arrayList3 = this.H;
                        if (i11 >= arrayList3.size()) {
                            break;
                        }
                        if (((gj) arrayList.get(i7)).e1() == ((gj) arrayList3.get(i11)).e1() && gj.B0(((gj) arrayList3.get(i11)).f23817k) == gj.B0(((gj) arrayList.get(i7)).f23817k)) {
                            arrayList3.remove(i11);
                            break;
                        }
                        i11++;
                    }
                }
            }
            ((gj) arrayList.get(i7)).P = false;
            w7.G(this.currentAccount).W(((gj) arrayList.get(i7)).F0(), arrayList.get(i7), 0, 0);
            w7.G(this.currentAccount).f(((gj) arrayList.get(i7)).F0());
        }
        getNotificationCenter().k(ns.f25474b5, new Object[0]);
        getMessagesStorage().f27220a.c(new b4(3, this, arrayList));
    }

    public final int k() {
        int i7 = this.E;
        this.E = i7 + 1;
        return i7;
    }

    public final int l() {
        int[] iArr;
        int i7;
        int e10 = t0.e();
        if (e10 == 1) {
            if (!this.O.f27663g) {
                return 0;
            }
            iArr = p().f27658a;
        } else if (e10 == 2) {
            if (!this.P.f27663g) {
                return 0;
            }
            iArr = o().f27658a;
        } else if (!this.N.f27663g) {
            return 0;
        } else {
            iArr = n().f27658a;
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
            if (!this.O.f27663g) {
                return 0;
            }
            int i10 = 0;
            while (i7 < 4) {
                i10 |= p().f27658a[i7];
                i7++;
            }
            return i10;
        } else if (e10 == 2) {
            if (!this.P.f27663g) {
                return 0;
            }
            int i11 = 0;
            while (i7 < 4) {
                i11 |= o().f27658a[i7];
                i7++;
            }
            return i11;
        } else if (!this.N.f27663g) {
            return 0;
        } else {
            int i12 = 0;
            while (i7 < 4) {
                i12 |= n().f27658a[i7];
                i7++;
            }
            return i12;
        }
    }

    public final y5 n() {
        int i7 = this.Q;
        if (i7 == 0) {
            return this.K;
        }
        if (i7 == 1) {
            return this.L;
        }
        if (i7 == 2) {
            return this.M;
        }
        return this.N;
    }

    public final y5 o() {
        int i7 = this.S;
        if (i7 == 0) {
            return this.K;
        }
        if (i7 == 1) {
            return this.L;
        }
        if (i7 == 2) {
            return this.M;
        }
        return this.P;
    }

    public final y5 p() {
        int i7 = this.R;
        if (i7 == 0) {
            return this.K;
        }
        if (i7 == 1) {
            return this.L;
        }
        if (i7 == 2) {
            return this.M;
        }
        return this.O;
    }

    public final void s(boolean z10) {
        if (!this.F) {
            if (z10 || Math.abs(System.currentTimeMillis() - getUserConfig().f24939b0) >= 86400000) {
                this.F = true;
                getConnectionsManager().sendRequest(new TL_account.getAutoDownloadSettings(), new s1(this, 1));
            }
        }
    }

    public final void t(int i7) {
        int m10 = m();
        if ((m10 & 1) != 0 && (i7 & 1) != 0 && this.f27883b.isEmpty()) {
            vr messagesStorage = getMessagesStorage();
            messagesStorage.f27220a.c(new qp(messagesStorage, 1, 6));
        }
        if ((m10 & 2) != 0 && (i7 & 2) != 0 && this.f27884c.isEmpty()) {
            vr messagesStorage2 = getMessagesStorage();
            messagesStorage2.f27220a.c(new qp(messagesStorage2, 2, 6));
        }
        if ((m10 & 4) != 0 && (i7 & 4) != 0 && this.f27885e.isEmpty()) {
            vr messagesStorage3 = getMessagesStorage();
            messagesStorage3.f27220a.c(new qp(messagesStorage3, 4, 6));
        }
        if ((m10 & 8) != 0 && (i7 & 8) != 0 && this.d.isEmpty()) {
            vr messagesStorage4 = getMessagesStorage();
            messagesStorage4.f27220a.c(new qp(messagesStorage4, 8, 6));
        }
    }

    public final void u() {
        HashMap hashMap = this.f27891x;
        for (Map.Entry entry : hashMap.entrySet()) {
            a((String) entry.getKey(), null, (x5) entry.getValue());
        }
        hashMap.clear();
        ArrayList arrayList = this.f27892y;
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
        if (this.f27890w) {
            this.f27892y.add(x5Var);
            return;
        }
        int observerTag = x5Var.getObserverTag();
        SparseArray sparseArray = this.f27889s;
        String str = (String) sparseArray.get(observerTag);
        if (str != null) {
            HashMap hashMap = this.f27887n;
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
        boolean z10;
        long j3;
        TL_account.saveAutoDownloadSettings saveautodownloadsettings = new TL_account.saveAutoDownloadSettings();
        if (i7 == 0) {
            o4 = n();
            z10 = this.N.f27663g;
        } else if (i7 == 1) {
            o4 = p();
            z10 = this.O.f27663g;
        } else {
            o4 = o();
            z10 = this.P.f27663g;
        }
        TLRPC.TL_autoDownloadSettings tL_autoDownloadSettings = new TLRPC.TL_autoDownloadSettings();
        saveautodownloadsettings.settings = tL_autoDownloadSettings;
        boolean z11 = o4.d;
        long[] jArr = o4.f27659b;
        tL_autoDownloadSettings.audio_preload_next = z11;
        tL_autoDownloadSettings.video_preload_large = o4.f27660c;
        tL_autoDownloadSettings.phonecalls_less_data = o4.f27662f;
        tL_autoDownloadSettings.video_upload_maxbitrate = o4.h;
        tL_autoDownloadSettings.disabled = !z10;
        int i10 = 0;
        int i11 = 0;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        while (true) {
            int[] iArr = o4.f27658a;
            if (i11 >= iArr.length) {
                break;
            }
            int i12 = iArr[i11];
            if ((i12 & 1) != 0) {
                z12 = true;
            }
            if ((i12 & 4) != 0) {
                z13 = true;
            }
            if ((i12 & 8) != 0) {
                z14 = true;
            }
            if (z12 && z13 && z14) {
                break;
            }
            i11++;
        }
        TLRPC.TL_autoDownloadSettings tL_autoDownloadSettings2 = saveautodownloadsettings.settings;
        if (z12) {
            i10 = (int) jArr[0];
        }
        tL_autoDownloadSettings2.photo_size_max = i10;
        long j10 = 0;
        if (z13) {
            j3 = jArr[1];
        } else {
            j3 = 0;
        }
        tL_autoDownloadSettings2.video_size_max = j3;
        if (z14) {
            j10 = jArr[2];
        }
        tL_autoDownloadSettings2.file_size_max = j10;
        getConnectionsManager().sendRequest(saveautodownloadsettings, new fi.m5(9));
    }

    public final void y() {
        ArrayList arrayList = this.H;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (getFileLoader().S(((gj) arrayList.get(size)).S0())) {
                getFileLoader().W(((gj) arrayList.get(size)).F0(), arrayList.get(size), 2, 0);
            }
        }
    }
}
