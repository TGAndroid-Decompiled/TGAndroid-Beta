package org.telegram.ui;

import android.os.StatFs;
import android.text.TextUtils;
import android.util.LongSparseArray;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
public final class b6 implements Runnable {
    public final int f35951a;
    public final y6 f35952b;

    public b6(y6 y6Var, int i10) {
        this.f35951a = i10;
        this.f35952b = y6Var;
    }

    @Override
    public final void run() {
        switch (this.f35951a) {
            case 0:
                y6 y6Var = this.f35952b;
                y6Var.resumeDelayedFragmentAnimation();
                y6Var.K = false;
                y6Var.A0(true);
                y6Var.y0();
                return;
            case 1:
                y6 y6Var2 = this.f35952b;
                y6Var2.getFileLoader().d.c();
                sh.b bVar = new sh.b(false);
                LongSparseArray longSparseArray = new LongSparseArray();
                y6Var2.q0(org.telegram.messenger.b8.j(4), 6, longSparseArray, bVar);
                y6Var2.q0(org.telegram.messenger.b8.j(0), 0, longSparseArray, bVar);
                y6Var2.q0(org.telegram.messenger.b8.j(100), 0, longSparseArray, bVar);
                y6Var2.q0(org.telegram.messenger.b8.j(2), 1, longSparseArray, bVar);
                y6Var2.q0(org.telegram.messenger.b8.j(101), 1, longSparseArray, bVar);
                y6Var2.q0(org.telegram.messenger.b8.j(1), 4, longSparseArray, bVar);
                y6Var2.q0(org.telegram.messenger.b8.j(6), 6, longSparseArray, bVar);
                y6Var2.q0(org.telegram.messenger.b8.j(3), 2, longSparseArray, bVar);
                y6Var2.q0(org.telegram.messenger.b8.j(5), 2, longSparseArray, bVar);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                for (int i10 = 0; i10 < longSparseArray.size(); i10++) {
                    s6 s6Var = (s6) longSparseArray.valueAt(i10);
                    arrayList.add(s6Var);
                    if (y6Var2.getMessagesController().d2(((s6) arrayList.get(i10)).f41231a) == null) {
                        long j10 = s6Var.f41231a;
                        if (j10 > 0) {
                            arrayList2.add(Long.valueOf(j10));
                        } else {
                            arrayList3.add(Long.valueOf(j10));
                        }
                    }
                }
                Collections.sort(bVar.d, new dx0(17));
                Collections.sort(bVar.e, new dx0(17));
                Collections.sort(bVar.f48511f, new dx0(17));
                Collections.sort(bVar.f48512g, new dx0(17));
                Collections.sort(bVar.h, new dx0(17));
                y6Var2.getMessagesStorage().f16331a.c(new d6(y6Var2, arrayList2, arrayList3, arrayList, bVar, 0));
                return;
            default:
                y6 y6Var3 = this.f35952b;
                y6Var3.f43579f = y6.s0(org.telegram.messenger.b8.j(4), 5);
                if (!y6.f43566h0) {
                    y6Var3.f43582n = y6.s0(org.telegram.messenger.b8.j(4), 4);
                    if (!y6.f43566h0) {
                        long s02 = y6.s0(org.telegram.messenger.b8.j(0), 0);
                        y6Var3.f43587y = s02;
                        y6Var3.f43587y = y6.s0(org.telegram.messenger.b8.j(100), 0) + s02;
                        if (!y6.f43566h0) {
                            long s03 = y6.s0(org.telegram.messenger.b8.j(2), 0);
                            y6Var3.D = s03;
                            y6Var3.D = y6.s0(org.telegram.messenger.b8.j(101), 0) + s03;
                            if (!y6.f43566h0) {
                                y6Var3.E = y6.s0(org.telegram.messenger.i0.P0(), 1);
                                boolean z10 = org.telegram.messenger.v2.f18578a;
                                if (!y6.f43566h0) {
                                    long s04 = y6.s0(org.telegram.messenger.b8.j(3), 1);
                                    y6Var3.f43583r = s04;
                                    y6Var3.f43583r = y6.s0(org.telegram.messenger.b8.j(5), 1) + s04;
                                    if (!y6.f43566h0) {
                                        long s05 = y6.s0(org.telegram.messenger.b8.j(3), 2);
                                        y6Var3.f43586x = s05;
                                        y6Var3.f43586x = y6.s0(org.telegram.messenger.b8.j(5), 2) + s05;
                                        if (!y6.f43566h0) {
                                            y6Var3.F = y6.s0(new File(org.telegram.messenger.b8.j(4), "acache"), 0);
                                            if (!y6.f43566h0) {
                                                y6Var3.h = y6.s0(org.telegram.messenger.b8.j(4), 3);
                                                if (!y6.f43566h0) {
                                                    y6Var3.F += y6Var3.h;
                                                    y6Var3.f43584s = y6.s0(org.telegram.messenger.b8.j(1), 0);
                                                    y6Var3.f43585w = y6.s0(org.telegram.messenger.b8.j(6), 0);
                                                    if (!y6.f43566h0) {
                                                        long j11 = y6Var3.f43579f + y6Var3.f43582n + y6Var3.D + y6Var3.E + y6Var3.f43584s + y6Var3.f43587y + y6Var3.f43583r + y6Var3.f43586x + y6Var3.f43585w + y6Var3.F;
                                                        y6.f43568j0 = Long.valueOf(j11);
                                                        y6Var3.G = j11;
                                                        y6.f43567i0 = System.currentTimeMillis();
                                                        ArrayList d12 = org.telegram.messenger.i0.d1();
                                                        File file = (File) d12.get(0);
                                                        file.getAbsolutePath();
                                                        if (!TextUtils.isEmpty(org.telegram.messenger.uz.f18519h0)) {
                                                            int size = d12.size();
                                                            for (int i11 = 0; i11 < size; i11++) {
                                                                File file2 = (File) d12.get(i11);
                                                                if (file2.getAbsolutePath().startsWith(org.telegram.messenger.uz.f18519h0)) {
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
                                                        } catch (Exception e) {
                                                            org.telegram.messenger.f8.g(e, true);
                                                        }
                                                        org.telegram.messenger.i0.g3(new b6(y6Var3, 0));
                                                        org.telegram.messenger.k8 k8Var = y6Var3.getFileLoader().d;
                                                        k8Var.d();
                                                        k8Var.f16578a.c(new b6(y6Var3, 1));
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
