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
    public final int f34173a;
    public final b7 f34174b;

    public f6(b7 b7Var, int i10) {
        this.f34173a = i10;
        this.f34174b = b7Var;
    }

    @Override
    public final void run() {
        switch (this.f34173a) {
            case 0:
                b7 b7Var = this.f34174b;
                b7Var.resumeDelayedFragmentAnimation();
                b7Var.I = false;
                b7Var.w0(true);
                b7Var.v0();
                return;
            case 1:
                b7 b7Var2 = this.f34174b;
                b7Var2.getFileLoader().getFileDatabase().ensureDatabaseCreated();
                mh.b bVar = new mh.b(false);
                LongSparseArray longSparseArray = new LongSparseArray();
                b7Var2.o0(FileLoader.checkDirectory(4), 6, longSparseArray, bVar);
                b7Var2.o0(FileLoader.checkDirectory(0), 0, longSparseArray, bVar);
                b7Var2.o0(FileLoader.checkDirectory(100), 0, longSparseArray, bVar);
                b7Var2.o0(FileLoader.checkDirectory(2), 1, longSparseArray, bVar);
                b7Var2.o0(FileLoader.checkDirectory(101), 1, longSparseArray, bVar);
                b7Var2.o0(FileLoader.checkDirectory(1), 4, longSparseArray, bVar);
                b7Var2.o0(FileLoader.checkDirectory(6), 6, longSparseArray, bVar);
                b7Var2.o0(FileLoader.checkDirectory(3), 2, longSparseArray, bVar);
                b7Var2.o0(FileLoader.checkDirectory(5), 2, longSparseArray, bVar);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                for (int i10 = 0; i10 < longSparseArray.size(); i10++) {
                    u6 u6Var = (u6) longSparseArray.valueAt(i10);
                    arrayList.add(u6Var);
                    if (b7Var2.getMessagesController().getUserOrChat(((u6) arrayList.get(i10)).f38849a) == null) {
                        long j10 = u6Var.f38849a;
                        if (j10 > 0) {
                            arrayList2.add(Long.valueOf(j10));
                        } else {
                            arrayList3.add(Long.valueOf(j10));
                        }
                    }
                }
                Collections.sort(bVar.d, new e5.f(22));
                Collections.sort(bVar.e, new e5.f(22));
                Collections.sort(bVar.f14177f, new e5.f(22));
                Collections.sort(bVar.f14178g, new e5.f(22));
                Collections.sort(bVar.h, new e5.f(22));
                b7Var2.getMessagesStorage().getStorageQueue().postRunnable(new g6(b7Var2, arrayList2, arrayList3, arrayList, bVar, 0));
                return;
            default:
                b7 b7Var3 = this.f34174b;
                b7Var3.h = b7.q0(5, FileLoader.checkDirectory(4));
                if (!b7.f32806h0) {
                    b7Var3.f32823r = b7.q0(4, FileLoader.checkDirectory(4));
                    if (!b7.f32806h0) {
                        long q02 = b7.q0(0, FileLoader.checkDirectory(0));
                        b7Var3.f32827y = q02;
                        b7Var3.f32827y = b7.q0(0, FileLoader.checkDirectory(100)) + q02;
                        if (!b7.f32806h0) {
                            long q03 = b7.q0(0, FileLoader.checkDirectory(2));
                            b7Var3.B = q03;
                            b7Var3.B = b7.q0(0, FileLoader.checkDirectory(101)) + q03;
                            if (!b7.f32806h0) {
                                long q04 = b7.q0(1, AndroidUtilities.getLogsDir());
                                b7Var3.C = q04;
                                if (!BuildVars.DEBUG_VERSION && q04 < 268435456) {
                                    b7Var3.C = 0L;
                                }
                                if (!b7.f32806h0) {
                                    long q05 = b7.q0(1, FileLoader.checkDirectory(3));
                                    b7Var3.f32824s = q05;
                                    b7Var3.f32824s = b7.q0(1, FileLoader.checkDirectory(5)) + q05;
                                    if (!b7.f32806h0) {
                                        long q06 = b7.q0(2, FileLoader.checkDirectory(3));
                                        b7Var3.f32826x = q06;
                                        b7Var3.f32826x = b7.q0(2, FileLoader.checkDirectory(5)) + q06;
                                        if (!b7.f32806h0) {
                                            b7Var3.D = b7.q0(0, new File(FileLoader.checkDirectory(4), "acache"));
                                            if (!b7.f32806h0) {
                                                b7Var3.f32822n = b7.q0(3, FileLoader.checkDirectory(4));
                                                if (!b7.f32806h0) {
                                                    b7Var3.D += b7Var3.f32822n;
                                                    b7Var3.v = b7.q0(0, FileLoader.checkDirectory(1));
                                                    b7Var3.f32825w = b7.q0(0, FileLoader.checkDirectory(6));
                                                    if (!b7.f32806h0) {
                                                        long j11 = b7Var3.h + b7Var3.f32823r + b7Var3.B + b7Var3.C + b7Var3.v + b7Var3.f32827y + b7Var3.f32824s + b7Var3.f32826x + b7Var3.f32825w + b7Var3.D;
                                                        b7.f32808j0 = Long.valueOf(j11);
                                                        b7Var3.E = j11;
                                                        b7.f32807i0 = System.currentTimeMillis();
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
                                                            b7Var3.F = statFs.getBlockCountLong() * blockSizeLong;
                                                            b7Var3.G = availableBlocksLong * blockSizeLong;
                                                        } catch (Exception e) {
                                                            FileLog.e(e);
                                                        }
                                                        AndroidUtilities.runOnUIThread(new f6(b7Var3, 0));
                                                        b7Var3.getFileLoader().getFileDatabase().getQueue().postRunnable(new f6(b7Var3, 1));
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
