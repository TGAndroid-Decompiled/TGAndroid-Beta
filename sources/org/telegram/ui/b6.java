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
    public final int f36311a;
    public final x6 f36312b;

    public b6(x6 x6Var, int i10) {
        this.f36311a = i10;
        this.f36312b = x6Var;
    }

    @Override
    public final void run() {
        switch (this.f36311a) {
            case 0:
                x6 x6Var = this.f36312b;
                x6Var.resumeDelayedFragmentAnimation();
                x6Var.L = false;
                x6Var.w0(true);
                x6Var.v0();
                return;
            case 1:
                x6 x6Var2 = this.f36312b;
                x6Var2.getFileLoader().getFileDatabase().ensureDatabaseCreated();
                zh.b bVar = new zh.b(false);
                LongSparseArray longSparseArray = new LongSparseArray();
                x6Var2.o0(FileLoader.checkDirectory(4), 6, longSparseArray, bVar);
                x6Var2.o0(FileLoader.checkDirectory(0), 0, longSparseArray, bVar);
                x6Var2.o0(FileLoader.checkDirectory(100), 0, longSparseArray, bVar);
                x6Var2.o0(FileLoader.checkDirectory(2), 1, longSparseArray, bVar);
                x6Var2.o0(FileLoader.checkDirectory(101), 1, longSparseArray, bVar);
                x6Var2.o0(FileLoader.checkDirectory(1), 4, longSparseArray, bVar);
                x6Var2.o0(FileLoader.checkDirectory(6), 6, longSparseArray, bVar);
                x6Var2.o0(FileLoader.checkDirectory(3), 2, longSparseArray, bVar);
                x6Var2.o0(FileLoader.checkDirectory(5), 2, longSparseArray, bVar);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                for (int i10 = 0; i10 < longSparseArray.size(); i10++) {
                    q6 q6Var = (q6) longSparseArray.valueAt(i10);
                    arrayList.add(q6Var);
                    if (x6Var2.getMessagesController().getUserOrChat(((q6) arrayList.get(i10)).f41080a) == null) {
                        long j3 = q6Var.f41080a;
                        if (j3 > 0) {
                            arrayList2.add(Long.valueOf(j3));
                        } else {
                            arrayList3.add(Long.valueOf(j3));
                        }
                    }
                }
                Collections.sort(bVar.d, new lb1(28));
                Collections.sort(bVar.f54824e, new lb1(28));
                Collections.sort(bVar.f54825f, new lb1(28));
                Collections.sort(bVar.f54826g, new lb1(28));
                Collections.sort(bVar.h, new lb1(28));
                x6Var2.getMessagesStorage().getStorageQueue().postRunnable(new c6(x6Var2, arrayList2, arrayList3, arrayList, bVar, 0));
                return;
            default:
                x6 x6Var3 = this.f36312b;
                x6Var3.h = x6.q0(5, FileLoader.checkDirectory(4));
                if (!x6.f44003k0) {
                    x6Var3.f44023r = x6.q0(4, FileLoader.checkDirectory(4));
                    if (!x6.f44003k0) {
                        long q02 = x6.q0(0, FileLoader.checkDirectory(0));
                        x6Var3.f44027y = q02;
                        x6Var3.f44027y = x6.q0(0, FileLoader.checkDirectory(100)) + q02;
                        if (!x6.f44003k0) {
                            long q03 = x6.q0(0, FileLoader.checkDirectory(2));
                            x6Var3.E = q03;
                            x6Var3.E = x6.q0(0, FileLoader.checkDirectory(101)) + q03;
                            if (!x6.f44003k0) {
                                long q04 = x6.q0(1, AndroidUtilities.getLogsDir());
                                x6Var3.F = q04;
                                if (!BuildVars.DEBUG_VERSION && q04 < 268435456) {
                                    x6Var3.F = 0L;
                                }
                                if (!x6.f44003k0) {
                                    long q05 = x6.q0(1, FileLoader.checkDirectory(3));
                                    x6Var3.f44024s = q05;
                                    x6Var3.f44024s = x6.q0(1, FileLoader.checkDirectory(5)) + q05;
                                    if (!x6.f44003k0) {
                                        long q06 = x6.q0(2, FileLoader.checkDirectory(3));
                                        x6Var3.f44026x = q06;
                                        x6Var3.f44026x = x6.q0(2, FileLoader.checkDirectory(5)) + q06;
                                        if (!x6.f44003k0) {
                                            x6Var3.G = x6.q0(0, new File(FileLoader.checkDirectory(4), "acache"));
                                            if (!x6.f44003k0) {
                                                x6Var3.f44022n = x6.q0(3, FileLoader.checkDirectory(4));
                                                if (!x6.f44003k0) {
                                                    x6Var3.G += x6Var3.f44022n;
                                                    x6Var3.v = x6.q0(0, FileLoader.checkDirectory(1));
                                                    x6Var3.f44025w = x6.q0(0, FileLoader.checkDirectory(6));
                                                    if (!x6.f44003k0) {
                                                        long j10 = x6Var3.h + x6Var3.f44023r + x6Var3.E + x6Var3.F + x6Var3.v + x6Var3.f44027y + x6Var3.f44024s + x6Var3.f44026x + x6Var3.f44025w + x6Var3.G;
                                                        x6.m0 = Long.valueOf(j10);
                                                        x6Var3.H = j10;
                                                        x6.f44004l0 = System.currentTimeMillis();
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
                                                            x6Var3.I = statFs.getBlockCountLong() * blockSizeLong;
                                                            x6Var3.J = availableBlocksLong * blockSizeLong;
                                                        } catch (Exception e7) {
                                                            FileLog.e(e7);
                                                        }
                                                        AndroidUtilities.runOnUIThread(new b6(x6Var3, 0));
                                                        x6Var3.getFileLoader().getFileDatabase().getQueue().postRunnable(new b6(x6Var3, 1));
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
