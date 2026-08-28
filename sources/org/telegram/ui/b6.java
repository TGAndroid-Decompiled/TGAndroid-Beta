package org.telegram.ui;

import android.os.StatFs;
import android.text.TextUtils;
import android.util.LongSparseArray;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;
public final class b6 implements Runnable {
    public final int f36656a;
    public final y6 f36657b;

    public b6(y6 y6Var, int i9) {
        this.f36656a = i9;
        this.f36657b = y6Var;
    }

    @Override
    public final void run() {
        switch (this.f36656a) {
            case 0:
                y6 y6Var = this.f36657b;
                y6Var.resumeDelayedFragmentAnimation();
                y6Var.H = false;
                y6Var.v0(true);
                y6Var.u0();
                return;
            case 1:
                y6 y6Var2 = this.f36657b;
                y6Var2.getFileLoader().getFileDatabase().ensureDatabaseCreated();
                hh.b bVar = new hh.b(false);
                LongSparseArray longSparseArray = new LongSparseArray();
                y6Var2.n0(FileLoader.checkDirectory(4), 6, longSparseArray, bVar);
                y6Var2.n0(FileLoader.checkDirectory(0), 0, longSparseArray, bVar);
                y6Var2.n0(FileLoader.checkDirectory(100), 0, longSparseArray, bVar);
                y6Var2.n0(FileLoader.checkDirectory(2), 1, longSparseArray, bVar);
                y6Var2.n0(FileLoader.checkDirectory(101), 1, longSparseArray, bVar);
                y6Var2.n0(FileLoader.checkDirectory(1), 4, longSparseArray, bVar);
                y6Var2.n0(FileLoader.checkDirectory(6), 6, longSparseArray, bVar);
                y6Var2.n0(FileLoader.checkDirectory(3), 2, longSparseArray, bVar);
                y6Var2.n0(FileLoader.checkDirectory(5), 2, longSparseArray, bVar);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                for (int i9 = 0; i9 < longSparseArray.size(); i9++) {
                    r6 r6Var = (r6) longSparseArray.valueAt(i9);
                    arrayList.add(r6Var);
                    if (y6Var2.getMessagesController().getUserOrChat(((r6) arrayList.get(i9)).f42274a) == null) {
                        long j10 = r6Var.f42274a;
                        if (j10 > 0) {
                            arrayList2.add(Long.valueOf(j10));
                        } else {
                            arrayList3.add(Long.valueOf(j10));
                        }
                    }
                }
                Collections.sort(bVar.d, new a5.e(21));
                Collections.sort(bVar.f10789e, new a5.e(21));
                Collections.sort(bVar.f10790f, new a5.e(21));
                Collections.sort(bVar.f10791g, new a5.e(21));
                Collections.sort(bVar.h, new a5.e(21));
                y6Var2.getMessagesStorage().getStorageQueue().postRunnable(new c6(y6Var2, arrayList2, arrayList3, arrayList, bVar, 0));
                return;
            default:
                y6 y6Var3 = this.f36657b;
                y6Var3.h = y6.p0(5, FileLoader.checkDirectory(4));
                if (!y6.f44731g0) {
                    y6Var3.f44748r = y6.p0(4, FileLoader.checkDirectory(4));
                    if (!y6.f44731g0) {
                        long p02 = y6.p0(0, FileLoader.checkDirectory(0));
                        y6Var3.f44752y = p02;
                        y6Var3.f44752y = y6.p0(0, FileLoader.checkDirectory(100)) + p02;
                        if (!y6.f44731g0) {
                            long p03 = y6.p0(0, FileLoader.checkDirectory(2));
                            y6Var3.A = p03;
                            y6Var3.A = y6.p0(0, FileLoader.checkDirectory(101)) + p03;
                            if (!y6.f44731g0) {
                                long p04 = y6.p0(1, AndroidUtilities.getLogsDir());
                                y6Var3.B = p04;
                                if (!BuildVars.DEBUG_VERSION && p04 < 268435456) {
                                    y6Var3.B = 0L;
                                }
                                if (!y6.f44731g0) {
                                    long p05 = y6.p0(1, FileLoader.checkDirectory(3));
                                    y6Var3.f44749s = p05;
                                    y6Var3.f44749s = y6.p0(1, FileLoader.checkDirectory(5)) + p05;
                                    if (!y6.f44731g0) {
                                        long p06 = y6.p0(2, FileLoader.checkDirectory(3));
                                        y6Var3.f44751x = p06;
                                        y6Var3.f44751x = y6.p0(2, FileLoader.checkDirectory(5)) + p06;
                                        if (!y6.f44731g0) {
                                            y6Var3.C = y6.p0(0, new File(FileLoader.checkDirectory(4), "acache"));
                                            if (!y6.f44731g0) {
                                                y6Var3.f44747n = y6.p0(3, FileLoader.checkDirectory(4));
                                                if (!y6.f44731g0) {
                                                    y6Var3.C += y6Var3.f44747n;
                                                    y6Var3.v = y6.p0(0, FileLoader.checkDirectory(1));
                                                    y6Var3.f44750w = y6.p0(0, FileLoader.checkDirectory(6));
                                                    if (!y6.f44731g0) {
                                                        long j11 = y6Var3.h + y6Var3.f44748r + y6Var3.A + y6Var3.B + y6Var3.v + y6Var3.f44752y + y6Var3.f44749s + y6Var3.f44751x + y6Var3.f44750w + y6Var3.C;
                                                        y6.f44733i0 = Long.valueOf(j11);
                                                        y6Var3.D = j11;
                                                        y6.f44732h0 = System.currentTimeMillis();
                                                        ArrayList<File> rootDirs = AndroidUtilities.getRootDirs();
                                                        File file = rootDirs.get(0);
                                                        file.getAbsolutePath();
                                                        if (!TextUtils.isEmpty(SharedConfig.storageCacheDir)) {
                                                            int size = rootDirs.size();
                                                            for (int i10 = 0; i10 < size; i10++) {
                                                                File file2 = rootDirs.get(i10);
                                                                if (file2.getAbsolutePath().startsWith(SharedConfig.storageCacheDir)) {
                                                                    file = file2;
                                                                }
                                                            }
                                                        }
                                                        try {
                                                            StatFs statFs = new StatFs(file.getPath());
                                                            long blockSizeLong = statFs.getBlockSizeLong();
                                                            long availableBlocksLong = statFs.getAvailableBlocksLong();
                                                            y6Var3.E = statFs.getBlockCountLong() * blockSizeLong;
                                                            y6Var3.F = availableBlocksLong * blockSizeLong;
                                                        } catch (Exception e10) {
                                                            FileLog.e(e10);
                                                        }
                                                        AndroidUtilities.runOnUIThread(new b6(y6Var3, 0));
                                                        y6Var3.getFileLoader().getFileDatabase().getQueue().postRunnable(new b6(y6Var3, 1));
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
