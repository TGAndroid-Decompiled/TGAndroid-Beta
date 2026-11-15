package org.telegram.ui;

import android.os.StatFs;
import android.text.TextUtils;
import android.util.LongSparseArray;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
public final class c6 implements Runnable {
    public final int f46020a;
    public final y6 f46021b;

    public c6(y6 y6Var, int i7) {
        this.f46020a = i7;
        this.f46021b = y6Var;
    }

    @Override
    public final void run() {
        switch (this.f46020a) {
            case 0:
                y6 y6Var = this.f46021b;
                y6Var.resumeDelayedFragmentAnimation();
                y6Var.L = false;
                y6Var.A0(true);
                y6Var.y0();
                return;
            case 1:
                y6 y6Var2 = this.f46021b;
                y6Var2.getFileLoader().d.c();
                ei.c cVar = new ei.c(false);
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
                    if (y6Var2.getMessagesController().e2(((s6) arrayList.get(i7)).f51112a) == null) {
                        long j3 = s6Var.f51112a;
                        if (j3 > 0) {
                            arrayList2.add(Long.valueOf(j3));
                        } else {
                            arrayList3.add(Long.valueOf(j3));
                        }
                    }
                }
                Collections.sort(cVar.d, new a3.c(18));
                Collections.sort(cVar.f10655e, new a3.c(18));
                Collections.sort(cVar.f10656f, new a3.c(18));
                Collections.sort(cVar.f10657g, new a3.c(18));
                Collections.sort(cVar.h, new a3.c(18));
                y6Var2.getMessagesStorage().f27219a.c(new e6(y6Var2, arrayList2, arrayList3, arrayList, cVar, 0));
                return;
            default:
                y6 y6Var3 = this.f46021b;
                y6Var3.f53447f = y6.s0(org.telegram.messenger.w7.j(4), 5);
                if (!y6.f53434i0) {
                    y6Var3.f53451n = y6.s0(org.telegram.messenger.w7.j(4), 4);
                    if (!y6.f53434i0) {
                        long s02 = y6.s0(org.telegram.messenger.w7.j(0), 0);
                        y6Var3.f53456y = s02;
                        y6Var3.f53456y = y6.s0(org.telegram.messenger.w7.j(100), 0) + s02;
                        if (!y6.f53434i0) {
                            long s03 = y6.s0(org.telegram.messenger.w7.j(2), 0);
                            y6Var3.E = s03;
                            y6Var3.E = y6.s0(org.telegram.messenger.w7.j(101), 0) + s03;
                            if (!y6.f53434i0) {
                                y6Var3.F = y6.s0(org.telegram.messenger.g0.P0(), 1);
                                boolean z10 = org.telegram.messenger.r2.f26206a;
                                if (!y6.f53434i0) {
                                    long s04 = y6.s0(org.telegram.messenger.w7.j(3), 1);
                                    y6Var3.f53452r = s04;
                                    y6Var3.f53452r = y6.s0(org.telegram.messenger.w7.j(5), 1) + s04;
                                    if (!y6.f53434i0) {
                                        long s05 = y6.s0(org.telegram.messenger.w7.j(3), 2);
                                        y6Var3.f53455x = s05;
                                        y6Var3.f53455x = y6.s0(org.telegram.messenger.w7.j(5), 2) + s05;
                                        if (!y6.f53434i0) {
                                            y6Var3.G = y6.s0(new File(org.telegram.messenger.w7.j(4), "acache"), 0);
                                            if (!y6.f53434i0) {
                                                y6Var3.h = y6.s0(org.telegram.messenger.w7.j(4), 3);
                                                if (!y6.f53434i0) {
                                                    y6Var3.G += y6Var3.h;
                                                    y6Var3.f53453s = y6.s0(org.telegram.messenger.w7.j(1), 0);
                                                    y6Var3.f53454w = y6.s0(org.telegram.messenger.w7.j(6), 0);
                                                    if (!y6.f53434i0) {
                                                        long j10 = y6Var3.f53447f + y6Var3.f53451n + y6Var3.E + y6Var3.F + y6Var3.f53453s + y6Var3.f53456y + y6Var3.f53452r + y6Var3.f53455x + y6Var3.f53454w + y6Var3.G;
                                                        y6.f53436k0 = Long.valueOf(j10);
                                                        y6Var3.H = j10;
                                                        y6.f53435j0 = System.currentTimeMillis();
                                                        ArrayList d12 = org.telegram.messenger.g0.d1();
                                                        File file = (File) d12.get(0);
                                                        file.getAbsolutePath();
                                                        if (!TextUtils.isEmpty(org.telegram.messenger.gz.f23952h0)) {
                                                            int size = d12.size();
                                                            for (int i10 = 0; i10 < size; i10++) {
                                                                File file2 = (File) d12.get(i10);
                                                                if (file2.getAbsolutePath().startsWith(org.telegram.messenger.gz.f23952h0)) {
                                                                    file = file2;
                                                                }
                                                            }
                                                        }
                                                        try {
                                                            StatFs statFs = new StatFs(file.getPath());
                                                            long blockSizeLong = statFs.getBlockSizeLong();
                                                            long availableBlocksLong = statFs.getAvailableBlocksLong();
                                                            y6Var3.I = statFs.getBlockCountLong() * blockSizeLong;
                                                            y6Var3.J = availableBlocksLong * blockSizeLong;
                                                        } catch (Exception e10) {
                                                            org.telegram.messenger.a8.g(e10, true);
                                                        }
                                                        org.telegram.messenger.g0.h3(new c6(y6Var3, 0));
                                                        org.telegram.messenger.f8 f8Var = y6Var3.getFileLoader().d;
                                                        f8Var.d();
                                                        f8Var.f23453a.c(new c6(y6Var3, 1));
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
