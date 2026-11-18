package org.telegram.ui.ActionBar;

import android.graphics.Bitmap;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.fs;
import org.telegram.messenger.j10;
import org.telegram.messenger.w7;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class f6 implements RequestDelegate {
    public final int f28953a;
    public final fs f28954b;
    public final Object f28955c;

    public f6(fs fsVar, Object obj, int i7) {
        this.f28953a = i7;
        this.f28954b = fsVar;
        this.f28955c = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f28953a) {
            case 0:
                h6 h6Var = (h6) this.f28954b;
                ArrayList arrayList = (ArrayList) this.f28955c;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    String str = null;
                    ArrayList arrayList2 = null;
                    int i7 = 0;
                    while (i7 < size) {
                        TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) vector.objects.get(i7);
                        if (wallPaper instanceof TLRPC.TL_wallPaper) {
                            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) wallPaper;
                            if (tL_wallPaper.pattern) {
                                w7.G(j10.f24770t0);
                                File J = w7.J(tL_wallPaper.document, str, true, true);
                                int size2 = arrayList.size();
                                String str2 = str;
                                Boolean bool = str2;
                                int i10 = 0;
                                Bitmap bitmap = str2;
                                while (i10 < size2) {
                                    k6 k6Var = (k6) arrayList.get(i10);
                                    if (k6Var.f29180o.equals(tL_wallPaper.slug)) {
                                        if (bool == null) {
                                            bool = Boolean.valueOf(J.exists());
                                        }
                                        if (bitmap == 0 && !bool.booleanValue()) {
                                            String r10 = w7.r(null, tL_wallPaper.document);
                                            if (h6Var.f29002b == null) {
                                                h6Var.f29002b = new HashMap();
                                            }
                                            g6 g6Var = (g6) h6Var.f29002b.get(r10);
                                            g6 g6Var2 = g6Var;
                                            if (g6Var == null) {
                                                ?? obj = new Object();
                                                obj.f28979b = new ArrayList();
                                                obj.f28978a = tL_wallPaper;
                                                h6Var.f29002b.put(r10, obj);
                                                g6Var2 = obj;
                                            }
                                            g6Var2.f28979b.add(k6Var);
                                        } else {
                                            bitmap = h6.b(bitmap, "application/x-tgwallpattern".equals(tL_wallPaper.document.mime_type), J, k6Var);
                                            if (arrayList2 == null) {
                                                arrayList2 = new ArrayList();
                                            }
                                            arrayList2.add(k6Var);
                                        }
                                    }
                                    i10++;
                                    bitmap = bitmap;
                                }
                                if (bitmap != 0) {
                                    bitmap.recycle();
                                }
                            }
                        }
                        i7++;
                        str = null;
                    }
                    org.telegram.messenger.g0.g3(new di.p6((Object) h6Var, (Object) arrayList2, true, 13));
                    return;
                }
                return;
            default:
                org.telegram.messenger.g0.g3(new kg.i0((m6) this.f28954b, tLObject, (m6) this.f28955c, 25));
                return;
        }
    }
}
