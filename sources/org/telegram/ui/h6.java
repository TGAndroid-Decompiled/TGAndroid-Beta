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
public final class h6 implements Runnable {
    public final int f34584a;
    public final d7 f34585b;

    public h6(d7 d7Var, int i10) {
        this.f34584a = i10;
        this.f34585b = d7Var;
    }

    @Override
    public final void run() {
        switch (this.f34584a) {
            case 0:
                d7 d7Var = this.f34585b;
                d7Var.resumeDelayedFragmentAnimation();
                d7Var.I = false;
                d7Var.w0(true);
                d7Var.v0();
                return;
            case 1:
                d7 d7Var2 = this.f34585b;
                d7Var2.getFileLoader().getFileDatabase().ensureDatabaseCreated();
                mh.b bVar = new mh.b(false);
                LongSparseArray longSparseArray = new LongSparseArray();
                d7Var2.o0(FileLoader.checkDirectory(4), 6, longSparseArray, bVar);
                d7Var2.o0(FileLoader.checkDirectory(0), 0, longSparseArray, bVar);
                d7Var2.o0(FileLoader.checkDirectory(100), 0, longSparseArray, bVar);
                d7Var2.o0(FileLoader.checkDirectory(2), 1, longSparseArray, bVar);
                d7Var2.o0(FileLoader.checkDirectory(101), 1, longSparseArray, bVar);
                d7Var2.o0(FileLoader.checkDirectory(1), 4, longSparseArray, bVar);
                d7Var2.o0(FileLoader.checkDirectory(6), 6, longSparseArray, bVar);
                d7Var2.o0(FileLoader.checkDirectory(3), 2, longSparseArray, bVar);
                d7Var2.o0(FileLoader.checkDirectory(5), 2, longSparseArray, bVar);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                for (int i10 = 0; i10 < longSparseArray.size(); i10++) {
                    w6 w6Var = (w6) longSparseArray.valueAt(i10);
                    arrayList.add(w6Var);
                    if (d7Var2.getMessagesController().getUserOrChat(((w6) arrayList.get(i10)).f39277a) == null) {
                        long j10 = w6Var.f39277a;
                        if (j10 > 0) {
                            arrayList2.add(Long.valueOf(j10));
                        } else {
                            arrayList3.add(Long.valueOf(j10));
                        }
                    }
                }
                Collections.sort(bVar.d, new e5.e(22));
                Collections.sort(bVar.e, new e5.e(22));
                Collections.sort(bVar.f14165f, new e5.e(22));
                Collections.sort(bVar.f14166g, new e5.e(22));
                Collections.sort(bVar.h, new e5.e(22));
                d7Var2.getMessagesStorage().getStorageQueue().postRunnable(new i6(d7Var2, arrayList2, arrayList3, arrayList, bVar, 0));
                return;
            default:
                d7 d7Var3 = this.f34585b;
                d7Var3.h = d7.q0(5, FileLoader.checkDirectory(4));
                if (!d7.f33342h0) {
                    d7Var3.f33359r = d7.q0(4, FileLoader.checkDirectory(4));
                    if (!d7.f33342h0) {
                        long q02 = d7.q0(0, FileLoader.checkDirectory(0));
                        d7Var3.f33363y = q02;
                        d7Var3.f33363y = d7.q0(0, FileLoader.checkDirectory(100)) + q02;
                        if (!d7.f33342h0) {
                            long q03 = d7.q0(0, FileLoader.checkDirectory(2));
                            d7Var3.B = q03;
                            d7Var3.B = d7.q0(0, FileLoader.checkDirectory(101)) + q03;
                            if (!d7.f33342h0) {
                                long q04 = d7.q0(1, AndroidUtilities.getLogsDir());
                                d7Var3.C = q04;
                                if (!BuildVars.DEBUG_VERSION && q04 < 268435456) {
                                    d7Var3.C = 0L;
                                }
                                if (!d7.f33342h0) {
                                    long q05 = d7.q0(1, FileLoader.checkDirectory(3));
                                    d7Var3.f33360s = q05;
                                    d7Var3.f33360s = d7.q0(1, FileLoader.checkDirectory(5)) + q05;
                                    if (!d7.f33342h0) {
                                        long q06 = d7.q0(2, FileLoader.checkDirectory(3));
                                        d7Var3.f33362x = q06;
                                        d7Var3.f33362x = d7.q0(2, FileLoader.checkDirectory(5)) + q06;
                                        if (!d7.f33342h0) {
                                            d7Var3.D = d7.q0(0, new File(FileLoader.checkDirectory(4), "acache"));
                                            if (!d7.f33342h0) {
                                                d7Var3.f33358n = d7.q0(3, FileLoader.checkDirectory(4));
                                                if (!d7.f33342h0) {
                                                    d7Var3.D += d7Var3.f33358n;
                                                    d7Var3.v = d7.q0(0, FileLoader.checkDirectory(1));
                                                    d7Var3.f33361w = d7.q0(0, FileLoader.checkDirectory(6));
                                                    if (!d7.f33342h0) {
                                                        long j11 = d7Var3.h + d7Var3.f33359r + d7Var3.B + d7Var3.C + d7Var3.v + d7Var3.f33363y + d7Var3.f33360s + d7Var3.f33362x + d7Var3.f33361w + d7Var3.D;
                                                        d7.f33344j0 = Long.valueOf(j11);
                                                        d7Var3.E = j11;
                                                        d7.f33343i0 = System.currentTimeMillis();
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
                                                            d7Var3.F = statFs.getBlockCountLong() * blockSizeLong;
                                                            d7Var3.G = availableBlocksLong * blockSizeLong;
                                                        } catch (Exception e) {
                                                            FileLog.e(e);
                                                        }
                                                        AndroidUtilities.runOnUIThread(new h6(d7Var3, 0));
                                                        d7Var3.getFileLoader().getFileDatabase().getQueue().postRunnable(new h6(d7Var3, 1));
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
