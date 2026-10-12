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
public final class g6 implements Runnable {
    public final int f36319a;
    public final d7 f36320b;

    public g6(d7 d7Var, int i10) {
        this.f36319a = i10;
        this.f36320b = d7Var;
    }

    @Override
    public final void run() {
        switch (this.f36319a) {
            case 0:
                d7 d7Var = this.f36320b;
                d7Var.resumeDelayedFragmentAnimation();
                d7Var.L = false;
                d7Var.w0(true);
                d7Var.v0();
                return;
            case 1:
                d7 d7Var2 = this.f36320b;
                d7Var2.getFileLoader().getFileDatabase().ensureDatabaseCreated();
                ai.c cVar = new ai.c(false);
                LongSparseArray longSparseArray = new LongSparseArray();
                d7Var2.o0(FileLoader.checkDirectory(4), 6, longSparseArray, cVar);
                d7Var2.o0(FileLoader.checkDirectory(0), 0, longSparseArray, cVar);
                d7Var2.o0(FileLoader.checkDirectory(100), 0, longSparseArray, cVar);
                d7Var2.o0(FileLoader.checkDirectory(2), 1, longSparseArray, cVar);
                d7Var2.o0(FileLoader.checkDirectory(101), 1, longSparseArray, cVar);
                d7Var2.o0(FileLoader.checkDirectory(1), 4, longSparseArray, cVar);
                d7Var2.o0(FileLoader.checkDirectory(6), 6, longSparseArray, cVar);
                d7Var2.o0(FileLoader.checkDirectory(3), 2, longSparseArray, cVar);
                d7Var2.o0(FileLoader.checkDirectory(5), 2, longSparseArray, cVar);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                for (int i10 = 0; i10 < longSparseArray.size(); i10++) {
                    w6 w6Var = (w6) longSparseArray.valueAt(i10);
                    arrayList.add(w6Var);
                    if (d7Var2.getMessagesController().getUserOrChat(((w6) arrayList.get(i10)).f41163a) == null) {
                        long j10 = w6Var.f41163a;
                        if (j10 > 0) {
                            arrayList2.add(Long.valueOf(j10));
                        } else {
                            arrayList3.add(Long.valueOf(j10));
                        }
                    }
                }
                Collections.sort(cVar.d, new a4.d(3));
                Collections.sort(cVar.e, new a4.d(3));
                Collections.sort(cVar.f923f, new a4.d(3));
                Collections.sort(cVar.f924g, new a4.d(3));
                Collections.sort(cVar.h, new a4.d(3));
                d7Var2.getMessagesStorage().getStorageQueue().postRunnable(new h6(d7Var2, arrayList2, arrayList3, arrayList, cVar, 0));
                return;
            default:
                d7 d7Var3 = this.f36320b;
                d7Var3.h = d7.q0(5, FileLoader.checkDirectory(4));
                if (!d7.f35157k0) {
                    d7Var3.f35176r = d7.q0(4, FileLoader.checkDirectory(4));
                    if (!d7.f35157k0) {
                        long q02 = d7.q0(0, FileLoader.checkDirectory(0));
                        d7Var3.f35180y = q02;
                        d7Var3.f35180y = d7.q0(0, FileLoader.checkDirectory(100)) + q02;
                        if (!d7.f35157k0) {
                            long q03 = d7.q0(0, FileLoader.checkDirectory(2));
                            d7Var3.E = q03;
                            d7Var3.E = d7.q0(0, FileLoader.checkDirectory(101)) + q03;
                            if (!d7.f35157k0) {
                                long q04 = d7.q0(1, AndroidUtilities.getLogsDir());
                                d7Var3.F = q04;
                                if (!BuildVars.DEBUG_VERSION && q04 < 268435456) {
                                    d7Var3.F = 0L;
                                }
                                if (!d7.f35157k0) {
                                    long q05 = d7.q0(1, FileLoader.checkDirectory(3));
                                    d7Var3.f35177s = q05;
                                    d7Var3.f35177s = d7.q0(1, FileLoader.checkDirectory(5)) + q05;
                                    if (!d7.f35157k0) {
                                        long q06 = d7.q0(2, FileLoader.checkDirectory(3));
                                        d7Var3.f35179x = q06;
                                        d7Var3.f35179x = d7.q0(2, FileLoader.checkDirectory(5)) + q06;
                                        if (!d7.f35157k0) {
                                            d7Var3.G = d7.q0(0, new File(FileLoader.checkDirectory(4), "acache"));
                                            if (!d7.f35157k0) {
                                                d7Var3.f35175n = d7.q0(3, FileLoader.checkDirectory(4));
                                                if (!d7.f35157k0) {
                                                    d7Var3.G += d7Var3.f35175n;
                                                    d7Var3.v = d7.q0(0, FileLoader.checkDirectory(1));
                                                    d7Var3.f35178w = d7.q0(0, FileLoader.checkDirectory(6));
                                                    if (!d7.f35157k0) {
                                                        long j11 = d7Var3.h + d7Var3.f35176r + d7Var3.E + d7Var3.F + d7Var3.v + d7Var3.f35180y + d7Var3.f35177s + d7Var3.f35179x + d7Var3.f35178w + d7Var3.G;
                                                        d7.m0 = Long.valueOf(j11);
                                                        d7Var3.H = j11;
                                                        d7.f35158l0 = System.currentTimeMillis();
                                                        ArrayList<File> rootDirs = AndroidUtilities.getRootDirs();
                                                        File file = rootDirs.get(0);
                                                        file.getAbsolutePath();
                                                        if (!TextUtils.isEmpty(SharedConfig.storageCacheDir)) {
                                                            int size = rootDirs.size();
                                                            for (int i11 = 0; i11 < size; i11++) {
                                                                File file2 = rootDirs.get(i11);
                                                                if (file2.getAbsolutePath().startsWith(SharedConfig.storageCacheDir)) {
                                                                    file = file2;
                                                                }
                                                            }
                                                        }
                                                        try {
                                                            StatFs statFs = new StatFs(file.getPath());
                                                            long blockSizeLong = statFs.getBlockSizeLong();
                                                            long availableBlocksLong = statFs.getAvailableBlocksLong();
                                                            d7Var3.I = statFs.getBlockCountLong() * blockSizeLong;
                                                            d7Var3.J = availableBlocksLong * blockSizeLong;
                                                        } catch (Exception e) {
                                                            FileLog.e(e);
                                                        }
                                                        AndroidUtilities.runOnUIThread(new g6(d7Var3, 0));
                                                        d7Var3.getFileLoader().getFileDatabase().getQueue().postRunnable(new g6(d7Var3, 1));
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
