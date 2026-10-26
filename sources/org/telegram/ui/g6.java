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
    public final int f39555a;
    public final c7 f39556b;

    public g6(c7 c7Var, int i10) {
        this.f39555a = i10;
        this.f39556b = c7Var;
    }

    @Override
    public final void run() {
        switch (this.f39555a) {
            case 0:
                c7 c7Var = this.f39556b;
                c7Var.resumeDelayedFragmentAnimation();
                c7Var.K = false;
                c7Var.w0(true);
                c7Var.u0();
                return;
            case 1:
                c7 c7Var2 = this.f39556b;
                c7Var2.getFileLoader().getFileDatabase().ensureDatabaseCreated();
                ci.b bVar = new ci.b(false);
                LongSparseArray longSparseArray = new LongSparseArray();
                c7Var2.m0(FileLoader.checkDirectory(4), 6, longSparseArray, bVar);
                c7Var2.m0(FileLoader.checkDirectory(0), 0, longSparseArray, bVar);
                c7Var2.m0(FileLoader.checkDirectory(100), 0, longSparseArray, bVar);
                c7Var2.m0(FileLoader.checkDirectory(2), 1, longSparseArray, bVar);
                c7Var2.m0(FileLoader.checkDirectory(101), 1, longSparseArray, bVar);
                c7Var2.m0(FileLoader.checkDirectory(1), 4, longSparseArray, bVar);
                c7Var2.m0(FileLoader.checkDirectory(6), 6, longSparseArray, bVar);
                c7Var2.m0(FileLoader.checkDirectory(3), 2, longSparseArray, bVar);
                c7Var2.m0(FileLoader.checkDirectory(5), 2, longSparseArray, bVar);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                for (int i10 = 0; i10 < longSparseArray.size(); i10++) {
                    w6 w6Var = (w6) longSparseArray.valueAt(i10);
                    arrayList.add(w6Var);
                    if (c7Var2.getMessagesController().getUserOrChat(((w6) arrayList.get(i10)).f44986a) == null) {
                        long j10 = w6Var.f44986a;
                        if (j10 > 0) {
                            arrayList2.add(Long.valueOf(j10));
                        } else {
                            arrayList3.add(Long.valueOf(j10));
                        }
                    }
                }
                Collections.sort(bVar.d, new a4.d(6));
                Collections.sort(bVar.e, new a4.d(6));
                Collections.sort(bVar.f6372f, new a4.d(6));
                Collections.sort(bVar.f6373g, new a4.d(6));
                Collections.sort(bVar.h, new a4.d(6));
                c7Var2.getMessagesStorage().getStorageQueue().postRunnable(new h6(c7Var2, arrayList2, arrayList3, arrayList, bVar, 0));
                return;
            default:
                c7 c7Var3 = this.f39556b;
                c7Var3.f38353f = c7.o0(5, FileLoader.checkDirectory(4));
                if (!c7.f38341i0) {
                    c7Var3.f38357n = c7.o0(4, FileLoader.checkDirectory(4));
                    if (!c7.f38341i0) {
                        long o02 = c7.o0(0, FileLoader.checkDirectory(0));
                        c7Var3.f38361x = o02;
                        c7Var3.f38361x = c7.o0(0, FileLoader.checkDirectory(100)) + o02;
                        if (!c7.f38341i0) {
                            long o03 = c7.o0(0, FileLoader.checkDirectory(2));
                            c7Var3.f38362y = o03;
                            c7Var3.f38362y = c7.o0(0, FileLoader.checkDirectory(101)) + o03;
                            if (!c7.f38341i0) {
                                long o04 = c7.o0(1, AndroidUtilities.getLogsDir());
                                c7Var3.E = o04;
                                if (!BuildVars.DEBUG_VERSION && o04 < 268435456) {
                                    c7Var3.E = 0L;
                                }
                                if (!c7.f38341i0) {
                                    long o05 = c7.o0(1, FileLoader.checkDirectory(3));
                                    c7Var3.f38358r = o05;
                                    c7Var3.f38358r = c7.o0(1, FileLoader.checkDirectory(5)) + o05;
                                    if (!c7.f38341i0) {
                                        long o06 = c7.o0(2, FileLoader.checkDirectory(3));
                                        c7Var3.f38360w = o06;
                                        c7Var3.f38360w = c7.o0(2, FileLoader.checkDirectory(5)) + o06;
                                        if (!c7.f38341i0) {
                                            c7Var3.F = c7.o0(0, new File(FileLoader.checkDirectory(4), "acache"));
                                            if (!c7.f38341i0) {
                                                c7Var3.h = c7.o0(3, FileLoader.checkDirectory(4));
                                                if (!c7.f38341i0) {
                                                    c7Var3.F += c7Var3.h;
                                                    c7Var3.f38359s = c7.o0(0, FileLoader.checkDirectory(1));
                                                    c7Var3.v = c7.o0(0, FileLoader.checkDirectory(6));
                                                    if (!c7.f38341i0) {
                                                        long j11 = c7Var3.f38353f + c7Var3.f38357n + c7Var3.f38362y + c7Var3.E + c7Var3.f38359s + c7Var3.f38361x + c7Var3.f38358r + c7Var3.f38360w + c7Var3.v + c7Var3.F;
                                                        c7.f38343k0 = Long.valueOf(j11);
                                                        c7Var3.G = j11;
                                                        c7.f38342j0 = System.currentTimeMillis();
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
                                                            c7Var3.H = statFs.getBlockCountLong() * blockSizeLong;
                                                            c7Var3.I = availableBlocksLong * blockSizeLong;
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
