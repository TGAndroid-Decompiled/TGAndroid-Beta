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
public final class d6 implements Runnable {
    public final int f31836a;
    public final y6 f31837b;

    public d6(y6 y6Var, int i10) {
        this.f31836a = i10;
        this.f31837b = y6Var;
    }

    @Override
    public final void run() {
        switch (this.f31836a) {
            case 0:
                y6 y6Var = this.f31837b;
                y6Var.resumeDelayedFragmentAnimation();
                y6Var.L = false;
                y6Var.w0(true);
                y6Var.v0();
                return;
            case 1:
                y6 y6Var2 = this.f31837b;
                y6Var2.getFileLoader().getFileDatabase().ensureDatabaseCreated();
                yh.b bVar = new yh.b(false);
                LongSparseArray longSparseArray = new LongSparseArray();
                y6Var2.o0(FileLoader.checkDirectory(4), 6, longSparseArray, bVar);
                y6Var2.o0(FileLoader.checkDirectory(0), 0, longSparseArray, bVar);
                y6Var2.o0(FileLoader.checkDirectory(100), 0, longSparseArray, bVar);
                y6Var2.o0(FileLoader.checkDirectory(2), 1, longSparseArray, bVar);
                y6Var2.o0(FileLoader.checkDirectory(101), 1, longSparseArray, bVar);
                y6Var2.o0(FileLoader.checkDirectory(1), 4, longSparseArray, bVar);
                y6Var2.o0(FileLoader.checkDirectory(6), 6, longSparseArray, bVar);
                y6Var2.o0(FileLoader.checkDirectory(3), 2, longSparseArray, bVar);
                y6Var2.o0(FileLoader.checkDirectory(5), 2, longSparseArray, bVar);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                for (int i10 = 0; i10 < longSparseArray.size(); i10++) {
                    r6 r6Var = (r6) longSparseArray.valueAt(i10);
                    arrayList.add(r6Var);
                    if (y6Var2.getMessagesController().getUserOrChat(((r6) arrayList.get(i10)).f36238a) == null) {
                        long j3 = r6Var.f36238a;
                        if (j3 > 0) {
                            arrayList2.add(Long.valueOf(j3));
                        } else {
                            arrayList3.add(Long.valueOf(j3));
                        }
                    }
                }
                Collections.sort(bVar.d, new sg.p(19));
                Collections.sort(bVar.e, new sg.p(19));
                Collections.sort(bVar.f47175f, new sg.p(19));
                Collections.sort(bVar.f47176g, new sg.p(19));
                Collections.sort(bVar.h, new sg.p(19));
                y6Var2.getMessagesStorage().getStorageQueue().postRunnable(new e6(y6Var2, arrayList2, arrayList3, arrayList, bVar, 0));
                return;
            default:
                y6 y6Var3 = this.f31837b;
                y6Var3.h = y6.q0(5, FileLoader.checkDirectory(4));
                if (!y6.f38903k0) {
                    y6Var3.f38922r = y6.q0(4, FileLoader.checkDirectory(4));
                    if (!y6.f38903k0) {
                        long q02 = y6.q0(0, FileLoader.checkDirectory(0));
                        y6Var3.f38926y = q02;
                        y6Var3.f38926y = y6.q0(0, FileLoader.checkDirectory(100)) + q02;
                        if (!y6.f38903k0) {
                            long q03 = y6.q0(0, FileLoader.checkDirectory(2));
                            y6Var3.E = q03;
                            y6Var3.E = y6.q0(0, FileLoader.checkDirectory(101)) + q03;
                            if (!y6.f38903k0) {
                                long q04 = y6.q0(1, AndroidUtilities.getLogsDir());
                                y6Var3.F = q04;
                                if (!BuildVars.DEBUG_VERSION && q04 < 268435456) {
                                    y6Var3.F = 0L;
                                }
                                if (!y6.f38903k0) {
                                    long q05 = y6.q0(1, FileLoader.checkDirectory(3));
                                    y6Var3.f38923s = q05;
                                    y6Var3.f38923s = y6.q0(1, FileLoader.checkDirectory(5)) + q05;
                                    if (!y6.f38903k0) {
                                        long q06 = y6.q0(2, FileLoader.checkDirectory(3));
                                        y6Var3.f38925x = q06;
                                        y6Var3.f38925x = y6.q0(2, FileLoader.checkDirectory(5)) + q06;
                                        if (!y6.f38903k0) {
                                            y6Var3.G = y6.q0(0, new File(FileLoader.checkDirectory(4), "acache"));
                                            if (!y6.f38903k0) {
                                                y6Var3.f38921n = y6.q0(3, FileLoader.checkDirectory(4));
                                                if (!y6.f38903k0) {
                                                    y6Var3.G += y6Var3.f38921n;
                                                    y6Var3.v = y6.q0(0, FileLoader.checkDirectory(1));
                                                    y6Var3.f38924w = y6.q0(0, FileLoader.checkDirectory(6));
                                                    if (!y6.f38903k0) {
                                                        long j10 = y6Var3.h + y6Var3.f38922r + y6Var3.E + y6Var3.F + y6Var3.v + y6Var3.f38926y + y6Var3.f38923s + y6Var3.f38925x + y6Var3.f38924w + y6Var3.G;
                                                        y6.m0 = Long.valueOf(j10);
                                                        y6Var3.H = j10;
                                                        y6.f38904l0 = System.currentTimeMillis();
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
                                                            y6Var3.I = statFs.getBlockCountLong() * blockSizeLong;
                                                            y6Var3.J = availableBlocksLong * blockSizeLong;
                                                        } catch (Exception e) {
                                                            FileLog.e(e);
                                                        }
                                                        AndroidUtilities.runOnUIThread(new d6(y6Var3, 0));
                                                        y6Var3.getFileLoader().getFileDatabase().getQueue().postRunnable(new d6(y6Var3, 1));
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
