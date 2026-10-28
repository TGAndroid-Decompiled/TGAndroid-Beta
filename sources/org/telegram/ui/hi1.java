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
public final class hi1 implements Runnable {
    public final int f39907a;
    public final int f39908b;
    public final Object f39909c;
    public final Object d;
    public final Object e;
    public final Object f39910f;

    public hi1(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.f39907a = i11;
        this.f39909c = obj;
        this.f39908b = i10;
        this.d = obj2;
        this.e = obj3;
        this.f39910f = obj4;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        boolean z10;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2;
        switch (this.f39907a) {
            case 0:
                int i12 = this.f39908b;
                org.telegram.ui.Components.j9 j9Var = (org.telegram.ui.Components.j9) this.d;
                TLRPC.User user = (TLRPC.User) this.e;
                ((int[]) this.f39909c)[0] = i12;
                j9Var.r(user);
                ((org.telegram.ui.Components.y9) this.f39910f).f(user, j9Var);
                return;
            case 1:
                sg.o2 o2Var = (sg.o2) this.f39909c;
                int i13 = this.f39908b;
                List list = (List) this.d;
                ArrayList arrayList = (ArrayList) this.e;
                fr0 fr0Var = (fr0) this.f39910f;
                if (o2Var.I != null && !o2Var.f48486y) {
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
                        sg.l2 l2Var = new sg.l2(o2Var);
                        l2Var.h.set(0.0f, 0.0f, o2Var.I.getWidth(), o2Var.I.getHeight());
                        l2Var.f48344i.set(l2Var.h);
                        matrix.mapRect(l2Var.f48344i);
                        l2Var.f48341c = i13;
                        Bitmap d = o2Var.d(0, 0, o2Var.I, false);
                        l2Var.d = d;
                        if (d == null) {
                            FileLog.e(new RuntimeException("createSmoothEdgesSegmentedImage failed on empty image"));
                            return;
                        }
                        l2Var.f48342f = l2Var.c();
                        sg.o2.c(l2Var, o2Var.T, o2Var.U);
                        o2Var.O = l2Var.f48345j;
                        o2Var.P = l2Var.f48346k;
                        arrayList.add(l2Var);
                        AndroidUtilities.runOnUIThread(new sg.g2(o2Var, arrayList, fr0Var, l2Var, 0));
                        o2Var.E = l2Var;
                        o2Var.f48486y = true;
                        o2Var.f48485x = false;
                        return;
                    }
                    for (int i14 = 0; i14 < list.size(); i14++) {
                        sg.n2 n2Var = (sg.n2) list.get(i14);
                        sg.l2 l2Var2 = new sg.l2(o2Var);
                        l2Var2.h.set(n2Var.f48426b, n2Var.f48427c, i10 + n2Var.d, i11 + n2Var.e);
                        l2Var2.f48344i.set(l2Var2.h);
                        matrix.mapRect(l2Var2.f48344i);
                        l2Var2.f48341c = i13;
                        Bitmap d10 = o2Var.d(n2Var.f48426b, n2Var.f48427c, n2Var.f48425a, false);
                        l2Var2.d = d10;
                        if (d10 != null) {
                            l2Var2.f48342f = l2Var2.c();
                            sg.o2.c(l2Var2, o2Var.T, o2Var.U);
                            o2Var.O = l2Var2.f48345j;
                            o2Var.P = l2Var2.f48346k;
                            arrayList.add(l2Var2);
                        }
                    }
                    o2Var.E = null;
                    o2Var.f48486y = true;
                    o2Var.f48485x = false;
                    AndroidUtilities.runOnUIThread(new s9.g(3, o2Var, arrayList));
                    return;
                }
                return;
            default:
                zh.p1 p1Var = (zh.p1) this.f39909c;
                Context context = (Context) this.d;
                int i15 = this.f39908b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.e;
                long j10 = p1Var.f53249c0;
                zh.l0 l0Var = new zh.l0(p1Var, (Utilities.Callback) this.f39910f, 2);
                boolean z11 = starGift.limited;
                boolean z12 = false;
                boolean z13 = true;
                if (z11 && (disallowedGiftsSettings2 = p1Var.f53248b0) != null && disallowedGiftsSettings2.disallow_limited_stargifts) {
                    z10 = false;
                    z12 = true;
                } else {
                    z10 = false;
                }
                if (!z11 || (disallowedGiftsSettings = p1Var.f53248b0) == null || !disallowedGiftsSettings.disallow_unique_stargifts) {
                    z13 = z10;
                }
                new zh.r0(p1Var, context, i15, starGift, j10, l0Var, z12, z13).show();
                return;
        }
    }

    public hi1(zh.p1 p1Var, Context context, int i10, TL_stars.StarGift starGift, Utilities.Callback callback) {
        this.f39907a = 2;
        this.f39909c = p1Var;
        this.d = context;
        this.f39908b = i10;
        this.e = starGift;
        this.f39910f = callback;
    }
}
