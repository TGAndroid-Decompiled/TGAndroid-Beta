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
    public final int f35007a;
    public final z6 f35008b;

    public c6(z6 z6Var, int i10) {
        this.f35007a = i10;
        this.f35008b = z6Var;
    }

    @Override
    public final void run() {
        switch (this.f35007a) {
            case 0:
                z6 z6Var = this.f35008b;
                z6Var.resumeDelayedFragmentAnimation();
                z6Var.L = false;
                z6Var.w0(true);
                z6Var.v0();
                return;
            case 1:
                z6 z6Var2 = this.f35008b;
                z6Var2.getFileLoader().getFileDatabase().ensureDatabaseCreated();
                ai.c cVar = new ai.c(false);
                LongSparseArray longSparseArray = new LongSparseArray();
                z6Var2.o0(FileLoader.checkDirectory(4), 6, longSparseArray, cVar);
                z6Var2.o0(FileLoader.checkDirectory(0), 0, longSparseArray, cVar);
                z6Var2.o0(FileLoader.checkDirectory(100), 0, longSparseArray, cVar);
                z6Var2.o0(FileLoader.checkDirectory(2), 1, longSparseArray, cVar);
                z6Var2.o0(FileLoader.checkDirectory(101), 1, longSparseArray, cVar);
                z6Var2.o0(FileLoader.checkDirectory(1), 4, longSparseArray, cVar);
                z6Var2.o0(FileLoader.checkDirectory(6), 6, longSparseArray, cVar);
                z6Var2.o0(FileLoader.checkDirectory(3), 2, longSparseArray, cVar);
                z6Var2.o0(FileLoader.checkDirectory(5), 2, longSparseArray, cVar);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                for (int i10 = 0; i10 < longSparseArray.size(); i10++) {
                    s6 s6Var = (s6) longSparseArray.valueAt(i10);
                    arrayList.add(s6Var);
                    if (z6Var2.getMessagesController().getUserOrChat(((s6) arrayList.get(i10)).f40312a) == null) {
                        long j3 = s6Var.f40312a;
                        if (j3 > 0) {
                            arrayList2.add(Long.valueOf(j3));
                        } else {
                            arrayList3.add(Long.valueOf(j3));
                        }
                    }
                }
                Collections.sort(cVar.d, new a4.e(2));
                Collections.sort(cVar.f747e, new a4.e(2));
                Collections.sort(cVar.f748f, new a4.e(2));
                Collections.sort(cVar.f749g, new a4.e(2));
                Collections.sort(cVar.h, new a4.e(2));
                z6Var2.getMessagesStorage().getStorageQueue().postRunnable(new d6(z6Var2, arrayList2, arrayList3, arrayList, cVar, 0));
                return;
            default:
                z6 z6Var3 = this.f35008b;
                z6Var3.h = z6.q0(5, FileLoader.checkDirectory(4));
                if (!z6.f43299k0) {
                    z6Var3.f43319r = z6.q0(4, FileLoader.checkDirectory(4));
                    if (!z6.f43299k0) {
                        long q02 = z6.q0(0, FileLoader.checkDirectory(0));
                        z6Var3.f43323y = q02;
                        z6Var3.f43323y = z6.q0(0, FileLoader.checkDirectory(100)) + q02;
                        if (!z6.f43299k0) {
                            long q03 = z6.q0(0, FileLoader.checkDirectory(2));
                            z6Var3.E = q03;
                            z6Var3.E = z6.q0(0, FileLoader.checkDirectory(101)) + q03;
                            if (!z6.f43299k0) {
                                long q04 = z6.q0(1, AndroidUtilities.getLogsDir());
                                z6Var3.F = q04;
                                if (!BuildVars.DEBUG_VERSION && q04 < 268435456) {
                                    z6Var3.F = 0L;
                                }
                                if (!z6.f43299k0) {
                                    long q05 = z6.q0(1, FileLoader.checkDirectory(3));
                                    z6Var3.f43320s = q05;
                                    z6Var3.f43320s = z6.q0(1, FileLoader.checkDirectory(5)) + q05;
                                    if (!z6.f43299k0) {
                                        long q06 = z6.q0(2, FileLoader.checkDirectory(3));
                                        z6Var3.f43322x = q06;
                                        z6Var3.f43322x = z6.q0(2, FileLoader.checkDirectory(5)) + q06;
                                        if (!z6.f43299k0) {
                                            z6Var3.G = z6.q0(0, new File(FileLoader.checkDirectory(4), "acache"));
                                            if (!z6.f43299k0) {
                                                z6Var3.f43318n = z6.q0(3, FileLoader.checkDirectory(4));
                                                if (!z6.f43299k0) {
                                                    z6Var3.G += z6Var3.f43318n;
                                                    z6Var3.v = z6.q0(0, FileLoader.checkDirectory(1));
                                                    z6Var3.f43321w = z6.q0(0, FileLoader.checkDirectory(6));
                                                    if (!z6.f43299k0) {
                                                        long j10 = z6Var3.h + z6Var3.f43319r + z6Var3.E + z6Var3.F + z6Var3.v + z6Var3.f43323y + z6Var3.f43320s + z6Var3.f43322x + z6Var3.f43321w + z6Var3.G;
                                                        z6.m0 = Long.valueOf(j10);
                                                        z6Var3.H = j10;
                                                        z6.f43300l0 = System.currentTimeMillis();
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
                                                            z6Var3.I = statFs.getBlockCountLong() * blockSizeLong;
                                                            z6Var3.J = availableBlocksLong * blockSizeLong;
                                                        } catch (Exception e7) {
                                                            FileLog.e(e7);
                                                        }
                                                        AndroidUtilities.runOnUIThread(new c6(z6Var3, 0));
                                                        z6Var3.getFileLoader().getFileDatabase().getQueue().postRunnable(new c6(z6Var3, 1));
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
