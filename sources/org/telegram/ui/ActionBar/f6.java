package org.telegram.ui.ActionBar;

import android.graphics.Bitmap;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.fs;
import org.telegram.messenger.i10;
import org.telegram.messenger.w7;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class f6 implements RequestDelegate {
    public final int f29021a;
    public final fs f29022b;
    public final Object f29023c;

    public f6(fs fsVar, Object obj, int i7) {
        this.f29021a = i7;
        this.f29022b = fsVar;
        this.f29023c = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f29021a) {
            case 0:
                h6 h6Var = (h6) this.f29022b;
                ArrayList arrayList = (ArrayList) this.f29023c;
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
                                w7.G(i10.f24637t0);
                                File J = w7.J(tL_wallPaper.document, str, true, true);
                                int size2 = arrayList.size();
                                String str2 = str;
                                Boolean bool = str2;
                                int i10 = 0;
                                Bitmap bitmap = str2;
                                while (i10 < size2) {
                                    k6 k6Var = (k6) arrayList.get(i10);
                                    if (k6Var.f29236o.equals(tL_wallPaper.slug)) {
                                        if (bool == null) {
                                            bool = Boolean.valueOf(J.exists());
                                        }
                                        if (bitmap == 0 && !bool.booleanValue()) {
                                            String r10 = w7.r(null, tL_wallPaper.document);
                                            if (h6Var.f29063b == null) {
                                                h6Var.f29063b = new HashMap();
                                            }
                                            g6 g6Var = (g6) h6Var.f29063b.get(r10);
                                            g6 g6Var2 = g6Var;
                                            if (g6Var == null) {
                                                ?? obj = new Object();
                                                obj.f29046b = new ArrayList();
                                                obj.f29045a = tL_wallPaper;
                                                h6Var.f29063b.put(r10, obj);
                                                g6Var2 = obj;
                                            }
                                            g6Var2.f29046b.add(k6Var);
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
                org.telegram.messenger.g0.g3(new kg.x((m6) this.f29022b, tLObject, (m6) this.f29023c, 27));
                return;
        }
    }
}
