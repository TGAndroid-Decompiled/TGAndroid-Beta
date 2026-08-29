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
public final class c6 implements Runnable {
    public final int f37005a;
    public final x6 f37006b;

    public c6(x6 x6Var, int i10) {
        this.f37005a = i10;
        this.f37006b = x6Var;
    }

    @Override
    public final void run() {
        switch (this.f37005a) {
            case 0:
                x6 x6Var = this.f37006b;
                x6Var.resumeDelayedFragmentAnimation();
                x6Var.H = false;
                x6Var.w0(true);
                x6Var.v0();
                return;
            case 1:
                x6 x6Var2 = this.f37006b;
                x6Var2.getFileLoader().getFileDatabase().ensureDatabaseCreated();
                kh.b bVar = new kh.b(false);
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
                    if (x6Var2.getMessagesController().getUserOrChat(((q6) arrayList.get(i10)).f41543a) == null) {
                        long j10 = q6Var.f41543a;
                        if (j10 > 0) {
                            arrayList2.add(Long.valueOf(j10));
                        } else {
                            arrayList3.add(Long.valueOf(j10));
                        }
                    }
                }
                Collections.sort(bVar.d, new c5.e(22));
                Collections.sort(bVar.f13898e, new c5.e(22));
                Collections.sort(bVar.f13899f, new c5.e(22));
                Collections.sort(bVar.f13900g, new c5.e(22));
                Collections.sort(bVar.h, new c5.e(22));
                x6Var2.getMessagesStorage().getStorageQueue().postRunnable(new d6(x6Var2, arrayList2, arrayList3, arrayList, bVar, 0));
                return;
            default:
                x6 x6Var3 = this.f37006b;
                x6Var3.h = x6.q0(5, FileLoader.checkDirectory(4));
                if (!x6.f44478g0) {
                    x6Var3.f44495r = x6.q0(4, FileLoader.checkDirectory(4));
                    if (!x6.f44478g0) {
                        long q02 = x6.q0(0, FileLoader.checkDirectory(0));
                        x6Var3.f44499y = q02;
                        x6Var3.f44499y = x6.q0(0, FileLoader.checkDirectory(100)) + q02;
                        if (!x6.f44478g0) {
                            long q03 = x6.q0(0, FileLoader.checkDirectory(2));
                            x6Var3.A = q03;
                            x6Var3.A = x6.q0(0, FileLoader.checkDirectory(101)) + q03;
                            if (!x6.f44478g0) {
                                long q04 = x6.q0(1, AndroidUtilities.getLogsDir());
                                x6Var3.B = q04;
                                if (!BuildVars.DEBUG_VERSION && q04 < 268435456) {
                                    x6Var3.B = 0L;
                                }
                                if (!x6.f44478g0) {
                                    long q05 = x6.q0(1, FileLoader.checkDirectory(3));
                                    x6Var3.f44496s = q05;
                                    x6Var3.f44496s = x6.q0(1, FileLoader.checkDirectory(5)) + q05;
                                    if (!x6.f44478g0) {
                                        long q06 = x6.q0(2, FileLoader.checkDirectory(3));
                                        x6Var3.f44498x = q06;
                                        x6Var3.f44498x = x6.q0(2, FileLoader.checkDirectory(5)) + q06;
                                        if (!x6.f44478g0) {
                                            x6Var3.C = x6.q0(0, new File(FileLoader.checkDirectory(4), "acache"));
                                            if (!x6.f44478g0) {
                                                x6Var3.f44494n = x6.q0(3, FileLoader.checkDirectory(4));
                                                if (!x6.f44478g0) {
                                                    x6Var3.C += x6Var3.f44494n;
                                                    x6Var3.v = x6.q0(0, FileLoader.checkDirectory(1));
                                                    x6Var3.f44497w = x6.q0(0, FileLoader.checkDirectory(6));
                                                    if (!x6.f44478g0) {
                                                        long j11 = x6Var3.h + x6Var3.f44495r + x6Var3.A + x6Var3.B + x6Var3.v + x6Var3.f44499y + x6Var3.f44496s + x6Var3.f44498x + x6Var3.f44497w + x6Var3.C;
                                                        x6.f44480i0 = Long.valueOf(j11);
                                                        x6Var3.D = j11;
                                                        x6.f44479h0 = System.currentTimeMillis();
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
                                                            x6Var3.E = statFs.getBlockCountLong() * blockSizeLong;
                                                            x6Var3.F = availableBlocksLong * blockSizeLong;
                                                        } catch (Exception e10) {
                                                            FileLog.e(e10);
                                                        }
                                                        AndroidUtilities.runOnUIThread(new c6(x6Var3, 0));
                                                        x6Var3.getFileLoader().getFileDatabase().getQueue().postRunnable(new c6(x6Var3, 1));
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
