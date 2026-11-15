package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class qk implements Runnable {
    public final int f50634a = 1;
    public final int f50635b;
    public final int f50636c;
    public final boolean d;
    public final Object f50637e;
    public final Object f50638f;
    public final Serializable h;

    public qk(h2.c cVar, Bitmap bitmap, int i7, int i10, String str, boolean z10) {
        this.f50637e = cVar;
        this.f50638f = bitmap;
        this.f50635b = i7;
        this.f50636c = i10;
        this.h = str;
        this.d = z10;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.xb xbVar;
        int i7;
        int i10;
        int i11;
        Rect rect;
        int i12 = this.f50634a;
        Serializable serializable = this.h;
        int i13 = this.f50636c;
        int i14 = this.f50635b;
        Object obj = this.f50638f;
        Object obj2 = this.f50637e;
        switch (i12) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = (ArrayList) serializable;
                an anVar = ((rk) obj2).f50965b;
                if (this.d) {
                    i7 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
                    org.telegram.messenger.np.s1(i7).f25270e7.edit().remove("pin_" + anVar.f45259k6).commit();
                    anVar.gd(0, true);
                    xbVar = null;
                } else {
                    xbVar = null;
                    anVar.getNotificationCenter().k(56, Long.valueOf(anVar.f45259k6), arrayList, Boolean.TRUE, arrayList2, null, 0, Integer.valueOf(i14), Boolean.valueOf(anVar.f45193f5));
                }
                if (i13 == anVar.R3) {
                    anVar.P3 = xbVar;
                    return;
                }
                return;
            default:
                h2.c cVar = (h2.c) obj2;
                Bitmap bitmap = (Bitmap) obj;
                String str = (String) serializable;
                Paint paint = (Paint) cVar.d;
                int i15 = cVar.f13417a;
                if (bitmap != null && !bitmap.isRecycled()) {
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    int round = (int) Math.round(Math.sqrt(width * 324.0f));
                    int round2 = (int) Math.round(Math.sqrt(324.0f / width));
                    if (i14 != 90 && i14 != 270) {
                        i11 = round2;
                        i10 = round;
                    } else {
                        i10 = round2;
                        i11 = round;
                    }
                    int i16 = i15 * 2;
                    Bitmap createBitmap = Bitmap.createBitmap(i16 + i10, i16 + i11, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    Rect rect2 = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
                    int i17 = i15 + round;
                    int i18 = i15 + round2;
                    Rect rect3 = new Rect(i15, i15, i17, i18);
                    float f10 = i15;
                    canvas.translate((i10 / 2.0f) + f10, (i11 / 2.0f) + f10);
                    if (i13 == 1) {
                        canvas.scale(-1.0f, 1.0f);
                        rect = rect2;
                    } else {
                        rect = rect2;
                        if (i13 == 2) {
                            canvas.scale(1.0f, -1.0f);
                        }
                    }
                    canvas.rotate(i14);
                    float f11 = -i15;
                    org.telegram.messenger.i20.j(round2, 2.0f, f11, f11 - (round / 2.0f), canvas);
                    try {
                        canvas.drawBitmap(bitmap, rect, rect3, (Paint) null);
                    } catch (Exception unused) {
                    }
                    Utilities.stackBlurBitmap(createBitmap, 6);
                    if (i15 > 0) {
                        float f12 = i17;
                        canvas.drawRect(0.0f, 0.0f, f12, f10, paint);
                        float f13 = i18;
                        canvas.drawRect(0.0f, f10, f10, f13, paint);
                        float f14 = i17 + i15;
                        canvas.drawRect(f12, f10, f14, f13, paint);
                        canvas.drawRect(0.0f, f13, f14, i18 + i15, paint);
                    }
                    org.telegram.messenger.g0.h3(new ai.j(cVar, str, createBitmap, this.d, bitmap));
                    return;
                }
                return;
        }
    }

    public qk(rk rkVar, boolean z10, ArrayList arrayList, ArrayList arrayList2, int i7, int i10) {
        this.f50637e = rkVar;
        this.d = z10;
        this.f50638f = arrayList;
        this.h = arrayList2;
        this.f50635b = i7;
        this.f50636c = i10;
    }
}
