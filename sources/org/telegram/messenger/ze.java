package org.telegram.messenger;

import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class ze implements Runnable {
    public final int f28290a;
    public final af f28291b;

    public ze(af afVar, int i7) {
        this.f28290a = i7;
        this.f28291b = afVar;
    }

    @Override
    public final void run() {
        boolean z10;
        File externalStoragePublicDirectory;
        File file;
        String str;
        int i7;
        String absolutePath;
        File file2;
        switch (this.f28290a) {
            case 0:
                af afVar = this.f28291b;
                afVar.f22873s.a(afVar.f22871n);
                return;
            case 1:
                af afVar2 = this.f28291b;
                if (!afVar2.h) {
                    afVar2.f22867b.show();
                    return;
                }
                return;
            case 2:
                af afVar3 = this.f28291b;
                boolean z11 = afVar3.f22874w;
                c cVar = afVar3.f22866a;
                ArrayList arrayList = afVar3.f22868c;
                try {
                    try {
                        if (Build.VERSION.SDK_INT >= 29) {
                            int size = arrayList.size();
                            for (int i10 = 0; i10 < size; i10++) {
                                fj fjVar = (fj) arrayList.get(i10);
                                if (!afVar3.b(fjVar)) {
                                    String str2 = fjVar.f23968k.attachPath;
                                    TLRPC.Document F0 = fjVar.F0();
                                    TLRPC.Document document = fjVar.f23949f3;
                                    if (document != null) {
                                        str2 = null;
                                        F0 = document;
                                    }
                                    String B = w7.B(F0);
                                    if (str2 != null && str2.length() > 0 && !new File(str2).exists()) {
                                        str2 = null;
                                    }
                                    if (TextUtils.isEmpty(str2)) {
                                        w7.G(cVar.f23221a);
                                        TLRPC.MessageMedia m12 = fj.m1(fjVar);
                                        TLRPC.Document document2 = fjVar.f23949f3;
                                        if (document2 != null) {
                                            file2 = w7.J(document2, null, false, true);
                                        } else {
                                            File M = w7.M(fjVar.f23968k, false, true);
                                            if (m12 instanceof TLRPC.TL_messageMediaDocument) {
                                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) m12;
                                                if (!tL_messageMediaDocument.alt_documents.isEmpty()) {
                                                    file2 = w7.J(tL_messageMediaDocument.alt_documents.get(0), null, false, true);
                                                }
                                            }
                                            file2 = M;
                                        }
                                        str2 = file2.toString();
                                    }
                                    File file3 = new File(str2);
                                    if (!file3.exists()) {
                                        afVar3.f22872r = new CountDownLatch(1);
                                        g0.g3(new z4(26, afVar3, fjVar));
                                        afVar3.f22872r.await();
                                    }
                                    if (!afVar3.f22870f) {
                                        if (!file3.exists()) {
                                            w7.G(cVar.f23221a);
                                            file3 = w7.J(fjVar.f23968k, null, true, true);
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append("saving file: correcting path from ");
                                            sb2.append(str2);
                                            sb2.append(" to ");
                                            if (file3 == null) {
                                                absolutePath = null;
                                            } else {
                                                absolutePath = file3.getAbsolutePath();
                                            }
                                            sb2.append(absolutePath);
                                            a8.b(sb2.toString());
                                        }
                                        if (file3 != null && file3.exists()) {
                                            if (z11) {
                                                i7 = 3;
                                            } else {
                                                i7 = 2;
                                            }
                                            MediaController.f0(i7, file3, B);
                                            afVar3.f22871n++;
                                        }
                                    }
                                }
                            }
                        } else {
                            if (z11) {
                                externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC);
                            } else {
                                externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
                            }
                            externalStoragePublicDirectory.mkdir();
                            int size2 = arrayList.size();
                            for (int i11 = 0; i11 < size2; i11++) {
                                fj fjVar2 = (fj) arrayList.get(i11);
                                if (!afVar3.b(fjVar2)) {
                                    TLRPC.Document F02 = fjVar2.F0();
                                    TLRPC.Document document3 = fjVar2.f23949f3;
                                    if (document3 != null) {
                                        F02 = document3;
                                    }
                                    String B2 = w7.B(F02);
                                    File file4 = new File(externalStoragePublicDirectory, B2);
                                    if (file4.exists()) {
                                        int lastIndexOf = B2.lastIndexOf(46);
                                        for (int i12 = 0; i12 < 10; i12++) {
                                            if (lastIndexOf != -1) {
                                                str = B2.substring(0, lastIndexOf) + "(" + (i12 + 1) + ")" + B2.substring(lastIndexOf);
                                            } else {
                                                str = B2 + "(" + (i12 + 1) + ")";
                                            }
                                            file4 = new File(externalStoragePublicDirectory, str);
                                            if (file4.exists()) {
                                            }
                                        }
                                    }
                                    if (!file4.exists()) {
                                        file4.createNewFile();
                                    }
                                    String str3 = fjVar2.f23968k.attachPath;
                                    if (fjVar2.f23949f3 != null) {
                                        str3 = null;
                                    }
                                    if (str3 != null && str3.length() > 0 && !new File(str3).exists()) {
                                        str3 = null;
                                    }
                                    if (fjVar2.f23949f3 != null) {
                                        w7.G(cVar.f23221a);
                                        file = w7.J(fjVar2.f23949f3, null, false, true);
                                    } else {
                                        if (str3 == null || str3.length() == 0) {
                                            w7.G(cVar.f23221a);
                                            str3 = w7.M(fjVar2.f23968k, false, true).toString();
                                        }
                                        file = new File(str3);
                                    }
                                    if (!file.exists()) {
                                        afVar3.f22872r = new CountDownLatch(1);
                                        g0.g3(new z4(26, afVar3, fjVar2));
                                        afVar3.f22872r.await();
                                    }
                                    if (file.exists()) {
                                        afVar3.a(file, file4, fjVar2.t1());
                                        afVar3.f22871n++;
                                    }
                                }
                            }
                        }
                        if (afVar3.d.isEmpty()) {
                            g0.g3(new ze(afVar3, 4));
                            return;
                        }
                        return;
                    } catch (Exception e10) {
                        e = e10;
                        z10 = true;
                        a8.g(e, z10);
                        return;
                    }
                } catch (Exception e11) {
                    e = e11;
                    z10 = true;
                }
                break;
            case 3:
                try {
                    this.f28291b.f22867b.dismiss();
                    return;
                } catch (Exception e12) {
                    a8.g(e12, true);
                    return;
                }
            default:
                af afVar4 = this.f28291b;
                org.telegram.ui.ActionBar.u1 u1Var = afVar4.f22867b;
                c cVar2 = afVar4.f22866a;
                try {
                    if (u1Var.isShowing()) {
                        u1Var.dismiss();
                    } else {
                        afVar4.h = true;
                    }
                    if (afVar4.f22873s != null) {
                        g0.g3(new ze(afVar4, 0));
                    }
                } catch (Exception e13) {
                    a8.g(e13, true);
                }
                int i13 = cVar2.f23221a;
                ks.f(i13).n(afVar4, 142);
                ks.f(i13).n(afVar4, 141);
                ks.f(i13).n(afVar4, 143);
                return;
        }
    }
}
