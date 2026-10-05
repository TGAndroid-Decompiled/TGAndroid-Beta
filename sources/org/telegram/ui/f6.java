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
public final class f6 implements Runnable {
    public final int f36207a;
    public final a7 f36208b;

    public f6(a7 a7Var, int i10) {
        this.f36207a = i10;
        this.f36208b = a7Var;
    }

    @Override
    public final void run() {
        switch (this.f36207a) {
            case 0:
                a7 a7Var = this.f36208b;
                a7Var.resumeDelayedFragmentAnimation();
                a7Var.K = false;
                a7Var.v0(true);
                a7Var.t0();
                return;
            case 1:
                a7 a7Var2 = this.f36208b;
                a7Var2.getFileLoader().getFileDatabase().ensureDatabaseCreated();
                zh.b bVar = new zh.b(false);
                LongSparseArray longSparseArray = new LongSparseArray();
                a7Var2.l0(FileLoader.checkDirectory(4), 6, longSparseArray, bVar);
                a7Var2.l0(FileLoader.checkDirectory(0), 0, longSparseArray, bVar);
                a7Var2.l0(FileLoader.checkDirectory(100), 0, longSparseArray, bVar);
                a7Var2.l0(FileLoader.checkDirectory(2), 1, longSparseArray, bVar);
                a7Var2.l0(FileLoader.checkDirectory(101), 1, longSparseArray, bVar);
                a7Var2.l0(FileLoader.checkDirectory(1), 4, longSparseArray, bVar);
                a7Var2.l0(FileLoader.checkDirectory(6), 6, longSparseArray, bVar);
                a7Var2.l0(FileLoader.checkDirectory(3), 2, longSparseArray, bVar);
                a7Var2.l0(FileLoader.checkDirectory(5), 2, longSparseArray, bVar);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                for (int i10 = 0; i10 < longSparseArray.size(); i10++) {
                    u6 u6Var = (u6) longSparseArray.valueAt(i10);
                    arrayList.add(u6Var);
                    if (a7Var2.getMessagesController().getUserOrChat(((u6) arrayList.get(i10)).f41123a) == null) {
                        long j3 = u6Var.f41123a;
                        if (j3 > 0) {
                            arrayList2.add(Long.valueOf(j3));
                        } else {
                            arrayList3.add(Long.valueOf(j3));
                        }
                    }
                }
                Collections.sort(bVar.d, new eb1(25));
                Collections.sort(bVar.f53582e, new eb1(25));
                Collections.sort(bVar.f53583f, new eb1(25));
                Collections.sort(bVar.f53584g, new eb1(25));
                Collections.sort(bVar.h, new eb1(25));
                a7Var2.getMessagesStorage().getStorageQueue().postRunnable(new g6(a7Var2, arrayList2, arrayList3, arrayList, bVar, 0));
                return;
            default:
                a7 a7Var3 = this.f36208b;
                a7Var3.f34701f = a7.n0(5, FileLoader.checkDirectory(4));
                if (!a7.m0) {
                    a7Var3.f34709n = a7.n0(4, FileLoader.checkDirectory(4));
                    if (!a7.m0) {
                        long n02 = a7.n0(0, FileLoader.checkDirectory(0));
                        a7Var3.f34713x = n02;
                        a7Var3.f34713x = a7.n0(0, FileLoader.checkDirectory(100)) + n02;
                        if (!a7.m0) {
                            long n03 = a7.n0(0, FileLoader.checkDirectory(2));
                            a7Var3.f34714y = n03;
                            a7Var3.f34714y = a7.n0(0, FileLoader.checkDirectory(101)) + n03;
                            if (!a7.m0) {
                                long n04 = a7.n0(1, AndroidUtilities.getLogsDir());
                                a7Var3.E = n04;
                                if (!BuildVars.DEBUG_VERSION && n04 < 268435456) {
                                    a7Var3.E = 0L;
                                }
                                if (!a7.m0) {
                                    long n05 = a7.n0(1, FileLoader.checkDirectory(3));
                                    a7Var3.f34710r = n05;
                                    a7Var3.f34710r = a7.n0(1, FileLoader.checkDirectory(5)) + n05;
                                    if (!a7.m0) {
                                        long n06 = a7.n0(2, FileLoader.checkDirectory(3));
                                        a7Var3.f34712w = n06;
                                        a7Var3.f34712w = a7.n0(2, FileLoader.checkDirectory(5)) + n06;
                                        if (!a7.m0) {
                                            a7Var3.F = a7.n0(0, new File(FileLoader.checkDirectory(4), "acache"));
                                            if (!a7.m0) {
                                                a7Var3.h = a7.n0(3, FileLoader.checkDirectory(4));
                                                if (!a7.m0) {
                                                    a7Var3.F += a7Var3.h;
                                                    a7Var3.f34711s = a7.n0(0, FileLoader.checkDirectory(1));
                                                    a7Var3.v = a7.n0(0, FileLoader.checkDirectory(6));
                                                    if (!a7.m0) {
                                                        long j10 = a7Var3.f34701f + a7Var3.f34709n + a7Var3.f34714y + a7Var3.E + a7Var3.f34711s + a7Var3.f34713x + a7Var3.f34710r + a7Var3.f34712w + a7Var3.v + a7Var3.F;
                                                        a7.f34689o0 = Long.valueOf(j10);
                                                        a7Var3.G = j10;
                                                        a7.f34688n0 = System.currentTimeMillis();
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
                                                            a7Var3.H = statFs.getBlockCountLong() * blockSizeLong;
                                                            a7Var3.I = availableBlocksLong * blockSizeLong;
                                                        } catch (Exception e7) {
                                                            FileLog.e(e7);
                                                        }
                                                        AndroidUtilities.runOnUIThread(new f6(a7Var3, 0));
                                                        a7Var3.getFileLoader().getFileDatabase().getQueue().postRunnable(new f6(a7Var3, 1));
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
