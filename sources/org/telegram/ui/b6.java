package org.telegram.ui;

import android.os.StatFs;
import android.text.TextUtils;
import android.util.LongSparseArray;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
public final class b6 implements Runnable {
    public final int f44198a;
    public final y6 f44199b;

    public b6(y6 y6Var, int i7) {
        this.f44198a = i7;
        this.f44199b = y6Var;
    }

    @Override
    public final void run() {
        switch (this.f44198a) {
            case 0:
                y6 y6Var = this.f44199b;
                y6Var.resumeDelayedFragmentAnimation();
                y6Var.K = false;
                y6Var.A0(true);
                y6Var.y0();
                return;
            case 1:
                y6 y6Var2 = this.f44199b;
                y6Var2.getFileLoader().d.c();
                ci.c cVar = new ci.c(false);
                LongSparseArray longSparseArray = new LongSparseArray();
                y6Var2.q0(org.telegram.messenger.w7.j(4), 6, longSparseArray, cVar);
                y6Var2.q0(org.telegram.messenger.w7.j(0), 0, longSparseArray, cVar);
                y6Var2.q0(org.telegram.messenger.w7.j(100), 0, longSparseArray, cVar);
                y6Var2.q0(org.telegram.messenger.w7.j(2), 1, longSparseArray, cVar);
                y6Var2.q0(org.telegram.messenger.w7.j(101), 1, longSparseArray, cVar);
                y6Var2.q0(org.telegram.messenger.w7.j(1), 4, longSparseArray, cVar);
                y6Var2.q0(org.telegram.messenger.w7.j(6), 6, longSparseArray, cVar);
                y6Var2.q0(org.telegram.messenger.w7.j(3), 2, longSparseArray, cVar);
                y6Var2.q0(org.telegram.messenger.w7.j(5), 2, longSparseArray, cVar);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                for (int i7 = 0; i7 < longSparseArray.size(); i7++) {
                    s6 s6Var = (s6) longSparseArray.valueAt(i7);
                    arrayList.add(s6Var);
                    if (y6Var2.getMessagesController().e2(((s6) arrayList.get(i7)).f49660a) == null) {
                        long j3 = s6Var.f49660a;
                        if (j3 > 0) {
                            arrayList2.add(Long.valueOf(j3));
                        } else {
                            arrayList3.add(Long.valueOf(j3));
                        }
                    }
                }
                Collections.sort(cVar.d, new a3.c(17));
                Collections.sort(cVar.f6426e, new a3.c(17));
                Collections.sort(cVar.f6427f, new a3.c(17));
                Collections.sort(cVar.f6428g, new a3.c(17));
                Collections.sort(cVar.h, new a3.c(17));
                y6Var2.getMessagesStorage().f26696a.c(new d6(y6Var2, arrayList2, arrayList3, arrayList, cVar, 0));
                return;
            default:
                y6 y6Var3 = this.f44199b;
                y6Var3.f52113f = y6.s0(org.telegram.messenger.w7.j(4), 5);
                if (!y6.f52099h0) {
                    y6Var3.f52116n = y6.s0(org.telegram.messenger.w7.j(4), 4);
                    if (!y6.f52099h0) {
                        long s02 = y6.s0(org.telegram.messenger.w7.j(0), 0);
                        y6Var3.f52121y = s02;
                        y6Var3.f52121y = y6.s0(org.telegram.messenger.w7.j(100), 0) + s02;
                        if (!y6.f52099h0) {
                            long s03 = y6.s0(org.telegram.messenger.w7.j(2), 0);
                            y6Var3.D = s03;
                            y6Var3.D = y6.s0(org.telegram.messenger.w7.j(101), 0) + s03;
                            if (!y6.f52099h0) {
                                y6Var3.E = y6.s0(org.telegram.messenger.g0.P0(), 1);
                                boolean z9 = org.telegram.messenger.r2.f25199a;
                                if (!y6.f52099h0) {
                                    long s04 = y6.s0(org.telegram.messenger.w7.j(3), 1);
                                    y6Var3.f52117r = s04;
                                    y6Var3.f52117r = y6.s0(org.telegram.messenger.w7.j(5), 1) + s04;
                                    if (!y6.f52099h0) {
                                        long s05 = y6.s0(org.telegram.messenger.w7.j(3), 2);
                                        y6Var3.f52120x = s05;
                                        y6Var3.f52120x = y6.s0(org.telegram.messenger.w7.j(5), 2) + s05;
                                        if (!y6.f52099h0) {
                                            y6Var3.F = y6.s0(new File(org.telegram.messenger.w7.j(4), "acache"), 0);
                                            if (!y6.f52099h0) {
                                                y6Var3.h = y6.s0(org.telegram.messenger.w7.j(4), 3);
                                                if (!y6.f52099h0) {
                                                    y6Var3.F += y6Var3.h;
                                                    y6Var3.f52118s = y6.s0(org.telegram.messenger.w7.j(1), 0);
                                                    y6Var3.f52119w = y6.s0(org.telegram.messenger.w7.j(6), 0);
                                                    if (!y6.f52099h0) {
                                                        long j10 = y6Var3.f52113f + y6Var3.f52116n + y6Var3.D + y6Var3.E + y6Var3.f52118s + y6Var3.f52121y + y6Var3.f52117r + y6Var3.f52120x + y6Var3.f52119w + y6Var3.F;
                                                        y6.f52101j0 = Long.valueOf(j10);
                                                        y6Var3.G = j10;
                                                        y6.f52100i0 = System.currentTimeMillis();
                                                        ArrayList d12 = org.telegram.messenger.g0.d1();
                                                        File file = (File) d12.get(0);
                                                        file.getAbsolutePath();
                                                        if (!TextUtils.isEmpty(org.telegram.messenger.iz.f23384h0)) {
                                                            int size = d12.size();
                                                            for (int i10 = 0; i10 < size; i10++) {
                                                                File file2 = (File) d12.get(i10);
                                                                if (file2.getAbsolutePath().startsWith(org.telegram.messenger.iz.f23384h0)) {
                                                                    file = file2;
                                                                }
                                                            }
                                                        }
                                                        try {
                                                            StatFs statFs = new StatFs(file.getPath());
                                                            long blockSizeLong = statFs.getBlockSizeLong();
                                                            long availableBlocksLong = statFs.getAvailableBlocksLong();
                                                            y6Var3.H = statFs.getBlockCountLong() * blockSizeLong;
                                                            y6Var3.I = availableBlocksLong * blockSizeLong;
                                                        } catch (Exception e10) {
                                                            org.telegram.messenger.a8.g(e10, true);
                                                        }
                                                        org.telegram.messenger.g0.h3(new b6(y6Var3, 0));
                                                        org.telegram.messenger.f8 f8Var = y6Var3.getFileLoader().d;
                                                        f8Var.d();
                                                        f8Var.f22359a.c(new b6(y6Var3, 1));
                                                        return;
                                                    }
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
