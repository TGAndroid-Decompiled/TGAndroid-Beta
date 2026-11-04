package org.telegram.ui;

import android.os.StatFs;
import android.text.TextUtils;
import android.util.LongSparseArray;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
public final class d6 implements Runnable {
    public final int f44569a;
    public final z6 f44570b;

    public d6(z6 z6Var, int i3) {
        this.f44569a = i3;
        this.f44570b = z6Var;
    }

    @Override
    public final void run() {
        switch (this.f44569a) {
            case 0:
                z6 z6Var = this.f44570b;
                z6Var.resumeDelayedFragmentAnimation();
                z6Var.L = false;
                z6Var.A0(true);
                z6Var.y0();
                return;
            case 1:
                z6 z6Var2 = this.f44570b;
                z6Var2.getFileLoader().d.c();
                di.c cVar = new di.c(false);
                LongSparseArray longSparseArray = new LongSparseArray();
                z6Var2.q0(org.telegram.messenger.w7.j(4), 6, longSparseArray, cVar);
                z6Var2.q0(org.telegram.messenger.w7.j(0), 0, longSparseArray, cVar);
                z6Var2.q0(org.telegram.messenger.w7.j(100), 0, longSparseArray, cVar);
                z6Var2.q0(org.telegram.messenger.w7.j(2), 1, longSparseArray, cVar);
                z6Var2.q0(org.telegram.messenger.w7.j(101), 1, longSparseArray, cVar);
                z6Var2.q0(org.telegram.messenger.w7.j(1), 4, longSparseArray, cVar);
                z6Var2.q0(org.telegram.messenger.w7.j(6), 6, longSparseArray, cVar);
                z6Var2.q0(org.telegram.messenger.w7.j(3), 2, longSparseArray, cVar);
                z6Var2.q0(org.telegram.messenger.w7.j(5), 2, longSparseArray, cVar);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                for (int i3 = 0; i3 < longSparseArray.size(); i3++) {
                    t6 t6Var = (t6) longSparseArray.valueAt(i3);
                    arrayList.add(t6Var);
                    if (z6Var2.getMessagesController().e2(((t6) arrayList.get(i3)).f49713a) == null) {
                        long j10 = t6Var.f49713a;
                        if (j10 > 0) {
                            arrayList2.add(Long.valueOf(j10));
                        } else {
                            arrayList3.add(Long.valueOf(j10));
                        }
                    }
                }
                Collections.sort(cVar.d, new a3.u(8));
                Collections.sort(cVar.f9189e, new a3.u(8));
                Collections.sort(cVar.f9190f, new a3.u(8));
                Collections.sort(cVar.f9191g, new a3.u(8));
                Collections.sort(cVar.h, new a3.u(8));
                z6Var2.getMessagesStorage().f24934a.c(new f6(z6Var2, arrayList2, arrayList3, arrayList, cVar, 0));
                return;
            default:
                z6 z6Var3 = this.f44570b;
                z6Var3.f52554f = z6.s0(org.telegram.messenger.w7.j(4), 5);
                if (!z6.f52541i0) {
                    z6Var3.f52558n = z6.s0(org.telegram.messenger.w7.j(4), 4);
                    if (!z6.f52541i0) {
                        long s02 = z6.s0(org.telegram.messenger.w7.j(0), 0);
                        z6Var3.f52563y = s02;
                        z6Var3.f52563y = z6.s0(org.telegram.messenger.w7.j(100), 0) + s02;
                        if (!z6.f52541i0) {
                            long s03 = z6.s0(org.telegram.messenger.w7.j(2), 0);
                            z6Var3.E = s03;
                            z6Var3.E = z6.s0(org.telegram.messenger.w7.j(101), 0) + s03;
                            if (!z6.f52541i0) {
                                z6Var3.F = z6.s0(org.telegram.messenger.g0.P0(), 1);
                                boolean z10 = org.telegram.messenger.r2.f25040a;
                                if (!z6.f52541i0) {
                                    long s04 = z6.s0(org.telegram.messenger.w7.j(3), 1);
                                    z6Var3.f52559r = s04;
                                    z6Var3.f52559r = z6.s0(org.telegram.messenger.w7.j(5), 1) + s04;
                                    if (!z6.f52541i0) {
                                        long s05 = z6.s0(org.telegram.messenger.w7.j(3), 2);
                                        z6Var3.f52562x = s05;
                                        z6Var3.f52562x = z6.s0(org.telegram.messenger.w7.j(5), 2) + s05;
                                        if (!z6.f52541i0) {
                                            z6Var3.G = z6.s0(new File(org.telegram.messenger.w7.j(4), "acache"), 0);
                                            if (!z6.f52541i0) {
                                                z6Var3.h = z6.s0(org.telegram.messenger.w7.j(4), 3);
                                                if (!z6.f52541i0) {
                                                    z6Var3.G += z6Var3.h;
                                                    z6Var3.f52560s = z6.s0(org.telegram.messenger.w7.j(1), 0);
                                                    z6Var3.f52561w = z6.s0(org.telegram.messenger.w7.j(6), 0);
                                                    if (!z6.f52541i0) {
                                                        long j11 = z6Var3.f52554f + z6Var3.f52558n + z6Var3.E + z6Var3.F + z6Var3.f52560s + z6Var3.f52563y + z6Var3.f52559r + z6Var3.f52562x + z6Var3.f52561w + z6Var3.G;
                                                        z6.f52543k0 = Long.valueOf(j11);
                                                        z6Var3.H = j11;
                                                        z6.f52542j0 = System.currentTimeMillis();
                                                        ArrayList d12 = org.telegram.messenger.g0.d1();
                                                        File file = (File) d12.get(0);
                                                        file.getAbsolutePath();
                                                        if (!TextUtils.isEmpty(org.telegram.messenger.az.f21632h0)) {
                                                            int size = d12.size();
                                                            for (int i10 = 0; i10 < size; i10++) {
                                                                File file2 = (File) d12.get(i10);
                                                                if (file2.getAbsolutePath().startsWith(org.telegram.messenger.az.f21632h0)) {
                                                                    file = file2;
                                                                }
                                                            }
                                                        }
                                                        try {
                                                            StatFs statFs = new StatFs(file.getPath());
                                                            long blockSizeLong = statFs.getBlockSizeLong();
                                                            long availableBlocksLong = statFs.getAvailableBlocksLong();
                                                            z6Var3.I = statFs.getBlockCountLong() * blockSizeLong;
                                                            z6Var3.J = availableBlocksLong * blockSizeLong;
                                                        } catch (Exception e10) {
                                                            org.telegram.messenger.a8.g(e10, true);
                                                        }
                                                        org.telegram.messenger.g0.h3(new d6(z6Var3, 0));
                                                        org.telegram.messenger.f8 f8Var = z6Var3.getFileLoader().d;
                                                        f8Var.d();
                                                        f8Var.f22461a.c(new d6(z6Var3, 1));
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
