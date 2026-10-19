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
    public final int f37198a;
    public final c7 f37199b;

    public g6(c7 c7Var, int i10) {
        this.f37198a = i10;
        this.f37199b = c7Var;
    }

    @Override
    public final void run() {
        switch (this.f37198a) {
            case 0:
                c7 c7Var = this.f37199b;
                c7Var.resumeDelayedFragmentAnimation();
                c7Var.L = false;
                c7Var.w0(true);
                c7Var.v0();
                return;
            case 1:
                c7 c7Var2 = this.f37199b;
                c7Var2.getFileLoader().getFileDatabase().ensureDatabaseCreated();
                bi.c cVar = new bi.c(false);
                LongSparseArray longSparseArray = new LongSparseArray();
                c7Var2.o0(FileLoader.checkDirectory(4), 6, longSparseArray, cVar);
                c7Var2.o0(FileLoader.checkDirectory(0), 0, longSparseArray, cVar);
                c7Var2.o0(FileLoader.checkDirectory(100), 0, longSparseArray, cVar);
                c7Var2.o0(FileLoader.checkDirectory(2), 1, longSparseArray, cVar);
                c7Var2.o0(FileLoader.checkDirectory(101), 1, longSparseArray, cVar);
                c7Var2.o0(FileLoader.checkDirectory(1), 4, longSparseArray, cVar);
                c7Var2.o0(FileLoader.checkDirectory(6), 6, longSparseArray, cVar);
                c7Var2.o0(FileLoader.checkDirectory(3), 2, longSparseArray, cVar);
                c7Var2.o0(FileLoader.checkDirectory(5), 2, longSparseArray, cVar);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                for (int i10 = 0; i10 < longSparseArray.size(); i10++) {
                    v6 v6Var = (v6) longSparseArray.valueAt(i10);
                    arrayList.add(v6Var);
                    if (c7Var2.getMessagesController().getUserOrChat(((v6) arrayList.get(i10)).f42109a) == null) {
                        long j10 = v6Var.f42109a;
                        if (j10 > 0) {
                            arrayList2.add(Long.valueOf(j10));
                        } else {
                            arrayList3.add(Long.valueOf(j10));
                        }
                    }
                }
                Collections.sort(cVar.d, new a4.d(6));
                Collections.sort(cVar.e, new a4.d(6));
                Collections.sort(cVar.f4434f, new a4.d(6));
                Collections.sort(cVar.f4435g, new a4.d(6));
                Collections.sort(cVar.h, new a4.d(6));
                c7Var2.getMessagesStorage().getStorageQueue().postRunnable(new h6(c7Var2, arrayList2, arrayList3, arrayList, cVar, 0));
                return;
            default:
                c7 c7Var3 = this.f37199b;
                c7Var3.h = c7.q0(5, FileLoader.checkDirectory(4));
                if (!c7.f35828k0) {
                    c7Var3.f35847r = c7.q0(4, FileLoader.checkDirectory(4));
                    if (!c7.f35828k0) {
                        long q02 = c7.q0(0, FileLoader.checkDirectory(0));
                        c7Var3.f35851y = q02;
                        c7Var3.f35851y = c7.q0(0, FileLoader.checkDirectory(100)) + q02;
                        if (!c7.f35828k0) {
                            long q03 = c7.q0(0, FileLoader.checkDirectory(2));
                            c7Var3.E = q03;
                            c7Var3.E = c7.q0(0, FileLoader.checkDirectory(101)) + q03;
                            if (!c7.f35828k0) {
                                long q04 = c7.q0(1, AndroidUtilities.getLogsDir());
                                c7Var3.F = q04;
                                if (!BuildVars.DEBUG_VERSION && q04 < 268435456) {
                                    c7Var3.F = 0L;
                                }
                                if (!c7.f35828k0) {
                                    long q05 = c7.q0(1, FileLoader.checkDirectory(3));
                                    c7Var3.f35848s = q05;
                                    c7Var3.f35848s = c7.q0(1, FileLoader.checkDirectory(5)) + q05;
                                    if (!c7.f35828k0) {
                                        long q06 = c7.q0(2, FileLoader.checkDirectory(3));
                                        c7Var3.f35850x = q06;
                                        c7Var3.f35850x = c7.q0(2, FileLoader.checkDirectory(5)) + q06;
                                        if (!c7.f35828k0) {
                                            c7Var3.G = c7.q0(0, new File(FileLoader.checkDirectory(4), "acache"));
                                            if (!c7.f35828k0) {
                                                c7Var3.f35846n = c7.q0(3, FileLoader.checkDirectory(4));
                                                if (!c7.f35828k0) {
                                                    c7Var3.G += c7Var3.f35846n;
                                                    c7Var3.v = c7.q0(0, FileLoader.checkDirectory(1));
                                                    c7Var3.f35849w = c7.q0(0, FileLoader.checkDirectory(6));
                                                    if (!c7.f35828k0) {
                                                        long j11 = c7Var3.h + c7Var3.f35847r + c7Var3.E + c7Var3.F + c7Var3.v + c7Var3.f35851y + c7Var3.f35848s + c7Var3.f35850x + c7Var3.f35849w + c7Var3.G;
                                                        c7.m0 = Long.valueOf(j11);
                                                        c7Var3.H = j11;
                                                        c7.f35829l0 = System.currentTimeMillis();
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
                                                            c7Var3.I = statFs.getBlockCountLong() * blockSizeLong;
                                                            c7Var3.J = availableBlocksLong * blockSizeLong;
                                                        } catch (Exception e) {
                                                            FileLog.e(e);
                                                        }
                                                        AndroidUtilities.runOnUIThread(new g6(c7Var3, 0));
                                                        c7Var3.getFileLoader().getFileDatabase().getQueue().postRunnable(new g6(c7Var3, 1));
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
