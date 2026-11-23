package org.telegram.ui;

import android.os.StatFs;
import android.text.TextUtils;
import android.util.LongSparseArray;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
public final class b6 implements Runnable {
    public final int f45744a;
    public final x6 f45745b;

    public b6(x6 x6Var, int i7) {
        this.f45744a = i7;
        this.f45745b = x6Var;
    }

    @Override
    public final void run() {
        switch (this.f45744a) {
            case 0:
                x6 x6Var = this.f45745b;
                x6Var.resumeDelayedFragmentAnimation();
                x6Var.L = false;
                x6Var.A0(true);
                x6Var.y0();
                return;
            case 1:
                x6 x6Var2 = this.f45745b;
                x6Var2.getFileLoader().d.c();
                ei.c cVar = new ei.c(false);
                LongSparseArray longSparseArray = new LongSparseArray();
                x6Var2.q0(org.telegram.messenger.w7.j(4), 6, longSparseArray, cVar);
                x6Var2.q0(org.telegram.messenger.w7.j(0), 0, longSparseArray, cVar);
                x6Var2.q0(org.telegram.messenger.w7.j(100), 0, longSparseArray, cVar);
                x6Var2.q0(org.telegram.messenger.w7.j(2), 1, longSparseArray, cVar);
                x6Var2.q0(org.telegram.messenger.w7.j(101), 1, longSparseArray, cVar);
                x6Var2.q0(org.telegram.messenger.w7.j(1), 4, longSparseArray, cVar);
                x6Var2.q0(org.telegram.messenger.w7.j(6), 6, longSparseArray, cVar);
                x6Var2.q0(org.telegram.messenger.w7.j(3), 2, longSparseArray, cVar);
                x6Var2.q0(org.telegram.messenger.w7.j(5), 2, longSparseArray, cVar);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                for (int i7 = 0; i7 < longSparseArray.size(); i7++) {
                    r6 r6Var = (r6) longSparseArray.valueAt(i7);
                    arrayList.add(r6Var);
                    if (x6Var2.getMessagesController().g2(((r6) arrayList.get(i7)).f51495a) == null) {
                        long j3 = r6Var.f51495a;
                        if (j3 > 0) {
                            arrayList2.add(Long.valueOf(j3));
                        } else {
                            arrayList3.add(Long.valueOf(j3));
                        }
                    }
                }
                Collections.sort(cVar.d, new a3.c(18));
                Collections.sort(cVar.f10967e, new a3.c(18));
                Collections.sort(cVar.f10968f, new a3.c(18));
                Collections.sort(cVar.f10969g, new a3.c(18));
                Collections.sort(cVar.h, new a3.c(18));
                x6Var2.getMessagesStorage().f27214a.c(new d6(x6Var2, arrayList2, arrayList3, arrayList, cVar, 0));
                return;
            default:
                x6 x6Var3 = this.f45745b;
                x6Var3.f53579f = x6.s0(org.telegram.messenger.w7.j(4), 5);
                if (!x6.f53566i0) {
                    x6Var3.f53583n = x6.s0(org.telegram.messenger.w7.j(4), 4);
                    if (!x6.f53566i0) {
                        long s02 = x6.s0(org.telegram.messenger.w7.j(0), 0);
                        x6Var3.f53588y = s02;
                        x6Var3.f53588y = x6.s0(org.telegram.messenger.w7.j(100), 0) + s02;
                        if (!x6.f53566i0) {
                            long s03 = x6.s0(org.telegram.messenger.w7.j(2), 0);
                            x6Var3.E = s03;
                            x6Var3.E = x6.s0(org.telegram.messenger.w7.j(101), 0) + s03;
                            if (!x6.f53566i0) {
                                x6Var3.F = x6.s0(org.telegram.messenger.g0.P0(), 1);
                                boolean z10 = org.telegram.messenger.s2.f26694a;
                                if (!x6.f53566i0) {
                                    long s04 = x6.s0(org.telegram.messenger.w7.j(3), 1);
                                    x6Var3.f53584r = s04;
                                    x6Var3.f53584r = x6.s0(org.telegram.messenger.w7.j(5), 1) + s04;
                                    if (!x6.f53566i0) {
                                        long s05 = x6.s0(org.telegram.messenger.w7.j(3), 2);
                                        x6Var3.f53587x = s05;
                                        x6Var3.f53587x = x6.s0(org.telegram.messenger.w7.j(5), 2) + s05;
                                        if (!x6.f53566i0) {
                                            x6Var3.G = x6.s0(new File(org.telegram.messenger.w7.j(4), "acache"), 0);
                                            if (!x6.f53566i0) {
                                                x6Var3.h = x6.s0(org.telegram.messenger.w7.j(4), 3);
                                                if (!x6.f53566i0) {
                                                    x6Var3.G += x6Var3.h;
                                                    x6Var3.f53585s = x6.s0(org.telegram.messenger.w7.j(1), 0);
                                                    x6Var3.f53586w = x6.s0(org.telegram.messenger.w7.j(6), 0);
                                                    if (!x6.f53566i0) {
                                                        long j10 = x6Var3.f53579f + x6Var3.f53583n + x6Var3.E + x6Var3.F + x6Var3.f53585s + x6Var3.f53588y + x6Var3.f53584r + x6Var3.f53587x + x6Var3.f53586w + x6Var3.G;
                                                        x6.f53568k0 = Long.valueOf(j10);
                                                        x6Var3.H = j10;
                                                        x6.f53567j0 = System.currentTimeMillis();
                                                        ArrayList d12 = org.telegram.messenger.g0.d1();
                                                        File file = (File) d12.get(0);
                                                        file.getAbsolutePath();
                                                        if (!TextUtils.isEmpty(org.telegram.messenger.cz.f23374h0)) {
                                                            int size = d12.size();
                                                            for (int i10 = 0; i10 < size; i10++) {
                                                                File file2 = (File) d12.get(i10);
                                                                if (file2.getAbsolutePath().startsWith(org.telegram.messenger.cz.f23374h0)) {
                                                                    file = file2;
                                                                }
                                                            }
                                                        }
                                                        try {
                                                            StatFs statFs = new StatFs(file.getPath());
                                                            long blockSizeLong = statFs.getBlockSizeLong();
                                                            long availableBlocksLong = statFs.getAvailableBlocksLong();
                                                            x6Var3.I = statFs.getBlockCountLong() * blockSizeLong;
                                                            x6Var3.J = availableBlocksLong * blockSizeLong;
                                                        } catch (Exception e10) {
                                                            org.telegram.messenger.a8.g(e10, true);
                                                        }
                                                        org.telegram.messenger.g0.g3(new b6(x6Var3, 0));
                                                        org.telegram.messenger.f8 f8Var = x6Var3.getFileLoader().d;
                                                        f8Var.d();
                                                        f8Var.f23839a.c(new b6(x6Var3, 1));
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
