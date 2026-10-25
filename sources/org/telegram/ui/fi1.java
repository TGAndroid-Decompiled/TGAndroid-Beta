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
public final class fi1 implements Runnable {
    public final int f39390a;
    public final int f39391b;
    public final Object f39392c;
    public final Object d;
    public final Object e;
    public final Object f39393f;

    public fi1(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.f39390a = i11;
        this.f39392c = obj;
        this.f39391b = i10;
        this.d = obj2;
        this.e = obj3;
        this.f39393f = obj4;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        boolean z10;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2;
        switch (this.f39390a) {
            case 0:
                int i12 = this.f39391b;
                org.telegram.ui.Components.j9 j9Var = (org.telegram.ui.Components.j9) this.d;
                TLRPC.User user = (TLRPC.User) this.e;
                ((int[]) this.f39392c)[0] = i12;
                j9Var.r(user);
                ((org.telegram.ui.Components.y9) this.f39393f).f(user, j9Var);
                return;
            case 1:
                sg.p2 p2Var = (sg.p2) this.f39392c;
                int i13 = this.f39391b;
                List list = (List) this.d;
                ArrayList arrayList = (ArrayList) this.e;
                dr0 dr0Var = (dr0) this.f39393f;
                if (p2Var.I != null && !p2Var.f48458y) {
                    Matrix matrix = new Matrix();
                    matrix.postScale(1.0f / p2Var.I.getWidth(), 1.0f / p2Var.I.getHeight());
                    matrix.postTranslate(-0.5f, -0.5f);
                    matrix.postRotate(i13);
                    matrix.postTranslate(0.5f, 0.5f);
                    if ((i13 / 90) % 2 != 0) {
                        matrix.postScale(p2Var.I.getHeight(), p2Var.I.getWidth());
                    } else {
                        matrix.postScale(p2Var.I.getWidth(), p2Var.I.getHeight());
                    }
                    if (list.isEmpty()) {
                        sg.m2 m2Var = new sg.m2(p2Var);
                        m2Var.h.set(0.0f, 0.0f, p2Var.I.getWidth(), p2Var.I.getHeight());
                        m2Var.f48315i.set(m2Var.h);
                        matrix.mapRect(m2Var.f48315i);
                        m2Var.f48312c = i13;
                        Bitmap d = p2Var.d(0, 0, p2Var.I, false);
                        m2Var.d = d;
                        if (d == null) {
                            FileLog.e(new RuntimeException("createSmoothEdgesSegmentedImage failed on empty image"));
                            return;
                        }
                        m2Var.f48313f = m2Var.c();
                        sg.p2.c(m2Var, p2Var.T, p2Var.U);
                        p2Var.O = m2Var.f48316j;
                        p2Var.P = m2Var.f48317k;
                        arrayList.add(m2Var);
                        AndroidUtilities.runOnUIThread(new sg.h2(p2Var, arrayList, dr0Var, m2Var, 0));
                        p2Var.E = m2Var;
                        p2Var.f48458y = true;
                        p2Var.f48457x = false;
                        return;
                    }
                    for (int i14 = 0; i14 < list.size(); i14++) {
                        sg.o2 o2Var = (sg.o2) list.get(i14);
                        sg.m2 m2Var2 = new sg.m2(p2Var);
                        m2Var2.h.set(o2Var.f48397b, o2Var.f48398c, i10 + o2Var.d, i11 + o2Var.e);
                        m2Var2.f48315i.set(m2Var2.h);
                        matrix.mapRect(m2Var2.f48315i);
                        m2Var2.f48312c = i13;
                        Bitmap d10 = p2Var.d(o2Var.f48397b, o2Var.f48398c, o2Var.f48396a, false);
                        m2Var2.d = d10;
                        if (d10 != null) {
                            m2Var2.f48313f = m2Var2.c();
                            sg.p2.c(m2Var2, p2Var.T, p2Var.U);
                            p2Var.O = m2Var2.f48316j;
                            p2Var.P = m2Var2.f48317k;
                            arrayList.add(m2Var2);
                        }
                    }
                    p2Var.E = null;
                    p2Var.f48458y = true;
                    p2Var.f48457x = false;
                    AndroidUtilities.runOnUIThread(new sg.u(2, p2Var, arrayList));
                    return;
                }
                return;
            default:
                zh.p1 p1Var = (zh.p1) this.f39392c;
                Context context = (Context) this.d;
                int i15 = this.f39391b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.e;
                long j10 = p1Var.f53188c0;
                zh.l0 l0Var = new zh.l0(p1Var, (Utilities.Callback) this.f39393f, 2);
                boolean z11 = starGift.limited;
                boolean z12 = false;
                boolean z13 = true;
                if (z11 && (disallowedGiftsSettings2 = p1Var.f53187b0) != null && disallowedGiftsSettings2.disallow_limited_stargifts) {
                    z10 = false;
                    z12 = true;
                } else {
                    z10 = false;
                }
                if (!z11 || (disallowedGiftsSettings = p1Var.f53187b0) == null || !disallowedGiftsSettings.disallow_unique_stargifts) {
                    z13 = z10;
                }
                new zh.r0(p1Var, context, i15, starGift, j10, l0Var, z12, z13).show();
                return;
        }
    }

    public fi1(zh.p1 p1Var, Context context, int i10, TL_stars.StarGift starGift, Utilities.Callback callback) {
        this.f39390a = 2;
        this.f39392c = p1Var;
        this.d = context;
        this.f39391b = i10;
        this.e = starGift;
        this.f39393f = callback;
    }
}
