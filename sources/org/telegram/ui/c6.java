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

    public final int f36970a;

    public final z6 f36971b;

    public c6(z6 z6Var, int i10) {
        this.f36970a = i10;
        this.f36971b = z6Var;
    }

    @Override
    public final void run() {
        switch (this.f36970a) {
            case 0:
                z6 z6Var = this.f36971b;
                z6Var.resumeDelayedFragmentAnimation();
                z6Var.H = false;
                z6Var.w0(true);
                z6Var.v0();
                break;
            case 1:
                z6 z6Var2 = this.f36971b;
                z6Var2.getFileLoader().getFileDatabase().ensureDatabaseCreated();
                ih.b bVar = new ih.b(false);
                LongSparseArray longSparseArray = new LongSparseArray();
                z6Var2.o0(FileLoader.checkDirectory(4), 6, longSparseArray, bVar);
                z6Var2.o0(FileLoader.checkDirectory(0), 0, longSparseArray, bVar);
                z6Var2.o0(FileLoader.checkDirectory(100), 0, longSparseArray, bVar);
                z6Var2.o0(FileLoader.checkDirectory(2), 1, longSparseArray, bVar);
                z6Var2.o0(FileLoader.checkDirectory(101), 1, longSparseArray, bVar);
                z6Var2.o0(FileLoader.checkDirectory(1), 4, longSparseArray, bVar);
                z6Var2.o0(FileLoader.checkDirectory(6), 6, longSparseArray, bVar);
                z6Var2.o0(FileLoader.checkDirectory(3), 2, longSparseArray, bVar);
                z6Var2.o0(FileLoader.checkDirectory(5), 2, longSparseArray, bVar);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                for (int i10 = 0; i10 < longSparseArray.size(); i10++) {
                    s6 s6Var = (s6) longSparseArray.valueAt(i10);
                    arrayList.add(s6Var);
                    if (z6Var2.getMessagesController().getUserOrChat(((s6) arrayList.get(i10)).f42522a) == null) {
                        long j10 = s6Var.f42522a;
                        if (j10 > 0) {
                            arrayList2.add(Long.valueOf(j10));
                        } else {
                            arrayList3.add(Long.valueOf(j10));
                        }
                    }
                }
                Collections.sort(bVar.d, new a5.f(22));
                Collections.sort(bVar.f11485e, new a5.f(22));
                Collections.sort(bVar.f11486f, new a5.f(22));
                Collections.sort(bVar.f11487g, new a5.f(22));
                Collections.sort(bVar.h, new a5.f(22));
                z6Var2.getMessagesStorage().getStorageQueue().postRunnable(new d6(z6Var2, arrayList2, arrayList3, arrayList, bVar, 0));
                break;
            default:
                z6 z6Var3 = this.f36971b;
                z6Var3.h = z6.q0(5, FileLoader.checkDirectory(4));
                if (!z6.f45032g0) {
                    z6Var3.f45049r = z6.q0(4, FileLoader.checkDirectory(4));
                    if (!z6.f45032g0) {
                        long jQ0 = z6.q0(0, FileLoader.checkDirectory(0));
                        z6Var3.f45053y = jQ0;
                        z6Var3.f45053y = z6.q0(0, FileLoader.checkDirectory(100)) + jQ0;
                        if (!z6.f45032g0) {
                            long jQ1 = z6.q0(0, FileLoader.checkDirectory(2));
                            z6Var3.A = jQ1;
                            z6Var3.A = z6.q0(0, FileLoader.checkDirectory(101)) + jQ1;
                            if (!z6.f45032g0) {
                                long jQ2 = z6.q0(1, AndroidUtilities.getLogsDir());
                                z6Var3.B = jQ2;
                                if (!BuildVars.DEBUG_VERSION && jQ2 < 268435456) {
                                    z6Var3.B = 0L;
                                }
                                if (!z6.f45032g0) {
                                    long jQ3 = z6.q0(1, FileLoader.checkDirectory(3));
                                    z6Var3.f45050s = jQ3;
                                    z6Var3.f45050s = z6.q0(1, FileLoader.checkDirectory(5)) + jQ3;
                                    if (!z6.f45032g0) {
                                        long jQ4 = z6.q0(2, FileLoader.checkDirectory(3));
                                        z6Var3.f45052x = jQ4;
                                        z6Var3.f45052x = z6.q0(2, FileLoader.checkDirectory(5)) + jQ4;
                                        if (!z6.f45032g0) {
                                            z6Var3.C = z6.q0(0, new File(FileLoader.checkDirectory(4), "acache"));
                                            if (!z6.f45032g0) {
                                                z6Var3.f45048n = z6.q0(3, FileLoader.checkDirectory(4));
                                                if (!z6.f45032g0) {
                                                    z6Var3.C += z6Var3.f45048n;
                                                    z6Var3.v = z6.q0(0, FileLoader.checkDirectory(1));
                                                    z6Var3.f45051w = z6.q0(0, FileLoader.checkDirectory(6));
                                                    if (!z6.f45032g0) {
                                                        long j11 = z6Var3.h + z6Var3.f45049r + z6Var3.A + z6Var3.B + z6Var3.v + z6Var3.f45053y + z6Var3.f45050s + z6Var3.f45052x + z6Var3.f45051w + z6Var3.C;
                                                        z6.f45034i0 = Long.valueOf(j11);
                                                        z6Var3.D = j11;
                                                        z6.f45033h0 = System.currentTimeMillis();
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
                                                            z6Var3.E = statFs.getBlockCountLong() * blockSizeLong;
                                                            z6Var3.F = availableBlocksLong * blockSizeLong;
                                                        } catch (Exception e9) {
                                                            FileLog.e(e9);
                                                        }
                                                        AndroidUtilities.runOnUIThread(new c6(z6Var3, 0));
                                                        z6Var3.getFileLoader().getFileDatabase().getQueue().postRunnable(new c6(z6Var3, 1));
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                break;
        }
    }
}
