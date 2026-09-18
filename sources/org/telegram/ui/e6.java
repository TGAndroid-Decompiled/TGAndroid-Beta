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
public final class e6 implements Runnable {
    public final int f33293a;
    public final a7 f33294b;

    public e6(a7 a7Var, int i10) {
        this.f33293a = i10;
        this.f33294b = a7Var;
    }

    @Override
    public final void run() {
        switch (this.f33293a) {
            case 0:
                a7 a7Var = this.f33294b;
                a7Var.resumeDelayedFragmentAnimation();
                a7Var.K = false;
                a7Var.y0(true);
                a7Var.w0();
                return;
            case 1:
                a7 a7Var2 = this.f33294b;
                a7Var2.getFileLoader().getFileDatabase().ensureDatabaseCreated();
                zh.b bVar = new zh.b(false);
                LongSparseArray longSparseArray = new LongSparseArray();
                a7Var2.o0(FileLoader.checkDirectory(4), 6, longSparseArray, bVar);
                a7Var2.o0(FileLoader.checkDirectory(0), 0, longSparseArray, bVar);
                a7Var2.o0(FileLoader.checkDirectory(100), 0, longSparseArray, bVar);
                a7Var2.o0(FileLoader.checkDirectory(2), 1, longSparseArray, bVar);
                a7Var2.o0(FileLoader.checkDirectory(101), 1, longSparseArray, bVar);
                a7Var2.o0(FileLoader.checkDirectory(1), 4, longSparseArray, bVar);
                a7Var2.o0(FileLoader.checkDirectory(6), 6, longSparseArray, bVar);
                a7Var2.o0(FileLoader.checkDirectory(3), 2, longSparseArray, bVar);
                a7Var2.o0(FileLoader.checkDirectory(5), 2, longSparseArray, bVar);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                for (int i10 = 0; i10 < longSparseArray.size(); i10++) {
                    t6 t6Var = (t6) longSparseArray.valueAt(i10);
                    arrayList.add(t6Var);
                    if (a7Var2.getMessagesController().getUserOrChat(((t6) arrayList.get(i10)).f37672a) == null) {
                        long j3 = t6Var.f37672a;
                        if (j3 > 0) {
                            arrayList2.add(Long.valueOf(j3));
                        } else {
                            arrayList3.add(Long.valueOf(j3));
                        }
                    }
                }
                Collections.sort(bVar.d, new lb1(26));
                Collections.sort(bVar.e, new lb1(26));
                Collections.sort(bVar.f49230f, new lb1(26));
                Collections.sort(bVar.f49231g, new lb1(26));
                Collections.sort(bVar.h, new lb1(26));
                a7Var2.getMessagesStorage().getStorageQueue().postRunnable(new f6(a7Var2, arrayList2, arrayList3, arrayList, bVar, 0));
                return;
            default:
                a7 a7Var3 = this.f33294b;
                a7Var3.f31744f = a7.q0(5, FileLoader.checkDirectory(4));
                if (!a7.f31732l0) {
                    a7Var3.f31751n = a7.q0(4, FileLoader.checkDirectory(4));
                    if (!a7.f31732l0) {
                        long q02 = a7.q0(0, FileLoader.checkDirectory(0));
                        a7Var3.f31755x = q02;
                        a7Var3.f31755x = a7.q0(0, FileLoader.checkDirectory(100)) + q02;
                        if (!a7.f31732l0) {
                            long q03 = a7.q0(0, FileLoader.checkDirectory(2));
                            a7Var3.f31756y = q03;
                            a7Var3.f31756y = a7.q0(0, FileLoader.checkDirectory(101)) + q03;
                            if (!a7.f31732l0) {
                                long q04 = a7.q0(1, AndroidUtilities.getLogsDir());
                                a7Var3.E = q04;
                                if (!BuildVars.DEBUG_VERSION && q04 < 268435456) {
                                    a7Var3.E = 0L;
                                }
                                if (!a7.f31732l0) {
                                    long q05 = a7.q0(1, FileLoader.checkDirectory(3));
                                    a7Var3.f31752r = q05;
                                    a7Var3.f31752r = a7.q0(1, FileLoader.checkDirectory(5)) + q05;
                                    if (!a7.f31732l0) {
                                        long q06 = a7.q0(2, FileLoader.checkDirectory(3));
                                        a7Var3.f31754w = q06;
                                        a7Var3.f31754w = a7.q0(2, FileLoader.checkDirectory(5)) + q06;
                                        if (!a7.f31732l0) {
                                            a7Var3.F = a7.q0(0, new File(FileLoader.checkDirectory(4), "acache"));
                                            if (!a7.f31732l0) {
                                                a7Var3.h = a7.q0(3, FileLoader.checkDirectory(4));
                                                if (!a7.f31732l0) {
                                                    a7Var3.F += a7Var3.h;
                                                    a7Var3.f31753s = a7.q0(0, FileLoader.checkDirectory(1));
                                                    a7Var3.v = a7.q0(0, FileLoader.checkDirectory(6));
                                                    if (!a7.f31732l0) {
                                                        long j10 = a7Var3.f31744f + a7Var3.f31751n + a7Var3.f31756y + a7Var3.E + a7Var3.f31753s + a7Var3.f31755x + a7Var3.f31752r + a7Var3.f31754w + a7Var3.v + a7Var3.F;
                                                        a7.f31733n0 = Long.valueOf(j10);
                                                        a7Var3.G = j10;
                                                        a7.m0 = System.currentTimeMillis();
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
                                                        } catch (Exception e) {
                                                            FileLog.e(e);
                                                        }
                                                        AndroidUtilities.runOnUIThread(new e6(a7Var3, 0));
                                                        a7Var3.getFileLoader().getFileDatabase().getQueue().postRunnable(new e6(a7Var3, 1));
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
