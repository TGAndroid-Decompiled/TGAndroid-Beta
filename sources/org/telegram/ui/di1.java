package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class di1 implements Runnable {
    public final int f36641a;
    public final int f36642b;
    public final Object f36643c;
    public final Object d;
    public final Object e;
    public final Object f36644f;

    public di1(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.f36641a = i11;
        this.f36643c = obj;
        this.f36642b = i10;
        this.d = obj2;
        this.e = obj3;
        this.f36644f = obj4;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        boolean z10;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2;
        switch (this.f36641a) {
            case 0:
                int i12 = this.f36642b;
                org.telegram.ui.Components.h9 h9Var = (org.telegram.ui.Components.h9) this.d;
                TLRPC.User user = (TLRPC.User) this.e;
                ((int[]) this.f36643c)[0] = i12;
                h9Var.r(user);
                ((org.telegram.ui.Components.w9) this.f36644f).e(user, h9Var);
                return;
            case 1:
                rg.o2 o2Var = (rg.o2) this.f36643c;
                int i13 = this.f36642b;
                List list = (List) this.d;
                ArrayList arrayList = (ArrayList) this.e;
                zq0 zq0Var = (zq0) this.f36644f;
                if (o2Var.I != null && !o2Var.f46011y) {
                    Matrix matrix = new Matrix();
                    matrix.postScale(1.0f / o2Var.I.getWidth(), 1.0f / o2Var.I.getHeight());
                    matrix.postTranslate(-0.5f, -0.5f);
                    matrix.postRotate(i13);
                    matrix.postTranslate(0.5f, 0.5f);
                    if ((i13 / 90) % 2 != 0) {
                        matrix.postScale(o2Var.I.getHeight(), o2Var.I.getWidth());
                    } else {
                        matrix.postScale(o2Var.I.getWidth(), o2Var.I.getHeight());
                    }
                    if (list.isEmpty()) {
                        rg.l2 l2Var = new rg.l2(o2Var);
                        l2Var.h.set(0.0f, 0.0f, o2Var.I.getWidth(), o2Var.I.getHeight());
                        l2Var.f45869i.set(l2Var.h);
                        matrix.mapRect(l2Var.f45869i);
                        l2Var.f45866c = i13;
                        Bitmap d = o2Var.d(0, 0, o2Var.I, false);
                        l2Var.d = d;
                        if (d == null) {
                            FileLog.e(new RuntimeException("createSmoothEdgesSegmentedImage failed on empty image"));
                            return;
                        }
                        l2Var.f45867f = l2Var.c();
                        rg.o2.c(l2Var, o2Var.T, o2Var.U);
                        o2Var.O = l2Var.f45870j;
                        o2Var.P = l2Var.f45871k;
                        arrayList.add(l2Var);
                        AndroidUtilities.runOnUIThread(new jn0(o2Var, arrayList, zq0Var, l2Var, 28));
                        o2Var.E = l2Var;
                        o2Var.f46011y = true;
                        o2Var.f46010x = false;
                        return;
                    }
                    for (int i14 = 0; i14 < list.size(); i14++) {
                        rg.n2 n2Var = (rg.n2) list.get(i14);
                        rg.l2 l2Var2 = new rg.l2(o2Var);
                        l2Var2.h.set(n2Var.f45951b, n2Var.f45952c, i10 + n2Var.d, i11 + n2Var.e);
                        l2Var2.f45869i.set(l2Var2.h);
                        matrix.mapRect(l2Var2.f45869i);
                        l2Var2.f45866c = i13;
                        Bitmap d10 = o2Var.d(n2Var.f45951b, n2Var.f45952c, n2Var.f45950a, false);
                        l2Var2.d = d10;
                        if (d10 != null) {
                            l2Var2.f45867f = l2Var2.c();
                            rg.o2.c(l2Var2, o2Var.T, o2Var.U);
                            o2Var.O = l2Var2.f45870j;
                            o2Var.P = l2Var2.f45871k;
                            arrayList.add(l2Var2);
                        }
                    }
                    o2Var.E = null;
                    o2Var.f46011y = true;
                    o2Var.f46010x = false;
                    AndroidUtilities.runOnUIThread(new p2.b(14, o2Var, arrayList));
                    return;
                }
                return;
            default:
                yh.o1 o1Var = (yh.o1) this.f36643c;
                Context context = (Context) this.d;
                int i15 = this.f36642b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.e;
                long j10 = o1Var.f50891c0;
                yh.l0 l0Var = new yh.l0(o1Var, (Utilities.Callback) this.f36644f, 2);
                boolean z11 = starGift.limited;
                boolean z12 = false;
                boolean z13 = true;
                if (z11 && (disallowedGiftsSettings2 = o1Var.f50890b0) != null && disallowedGiftsSettings2.disallow_limited_stargifts) {
                    z10 = false;
                    z12 = true;
                } else {
                    z10 = false;
                }
                if (!z11 || (disallowedGiftsSettings = o1Var.f50890b0) == null || !disallowedGiftsSettings.disallow_unique_stargifts) {
                    z13 = z10;
                }
                new yh.r0(o1Var, context, i15, starGift, j10, l0Var, z12, z13).show();
                return;
        }
    }

    public di1(yh.o1 o1Var, Context context, int i10, TL_stars.StarGift starGift, Utilities.Callback callback) {
        this.f36641a = 2;
        this.f36643c = o1Var;
        this.d = context;
        this.f36642b = i10;
        this.e = starGift;
        this.f36644f = callback;
    }
}
