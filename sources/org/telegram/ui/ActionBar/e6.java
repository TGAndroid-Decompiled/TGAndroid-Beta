package org.telegram.ui.ActionBar;

import android.graphics.Bitmap;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.gs;
import org.telegram.messenger.k10;
import org.telegram.messenger.w7;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class e6 implements RequestDelegate {
    public final int f28937a;
    public final gs f28938b;
    public final Object f28939c;

    public e6(gs gsVar, Object obj, int i7) {
        this.f28937a = i7;
        this.f28938b = gsVar;
        this.f28939c = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f28937a) {
            case 0:
                g6 g6Var = (g6) this.f28938b;
                ArrayList arrayList = (ArrayList) this.f28939c;
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
                                w7.G(k10.f24968t0);
                                File J = w7.J(tL_wallPaper.document, str, true, true);
                                int size2 = arrayList.size();
                                String str2 = str;
                                Boolean bool = str2;
                                int i10 = 0;
                                Bitmap bitmap = str2;
                                while (i10 < size2) {
                                    j6 j6Var = (j6) arrayList.get(i10);
                                    if (j6Var.f29108o.equals(tL_wallPaper.slug)) {
                                        if (bool == null) {
                                            bool = Boolean.valueOf(J.exists());
                                        }
                                        if (bitmap == 0 && !bool.booleanValue()) {
                                            String r10 = w7.r(null, tL_wallPaper.document);
                                            if (g6Var.f28988b == null) {
                                                g6Var.f28988b = new HashMap();
                                            }
                                            f6 f6Var = (f6) g6Var.f28988b.get(r10);
                                            f6 f6Var2 = f6Var;
                                            if (f6Var == null) {
                                                ?? obj = new Object();
                                                obj.f28964b = new ArrayList();
                                                obj.f28963a = tL_wallPaper;
                                                g6Var.f28988b.put(r10, obj);
                                                f6Var2 = obj;
                                            }
                                            f6Var2.f28964b.add(j6Var);
                                        } else {
                                            bitmap = g6.b(bitmap, "application/x-tgwallpattern".equals(tL_wallPaper.document.mime_type), J, j6Var);
                                            if (arrayList2 == null) {
                                                arrayList2 = new ArrayList();
                                            }
                                            arrayList2.add(j6Var);
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
                    org.telegram.messenger.g0.g3(new di.p6((Object) g6Var, (Object) arrayList2, true, 13));
                    return;
                }
                return;
            default:
                org.telegram.messenger.g0.g3(new kg.y((l6) this.f28938b, tLObject, (l6) this.f28939c, 26));
                return;
        }
    }
}
