package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class ml implements Runnable {
    public final int f39723a = 1;
    public final int f39724b;
    public final int f39725c;
    public final boolean d;
    public final Object e;
    public final Object f39726f;
    public final Serializable h;

    public ml(e2.c cVar, Bitmap bitmap, int i10, int i11, String str, boolean z10) {
        this.e = cVar;
        this.f39726f = bitmap;
        this.f39724b = i10;
        this.f39725c = i11;
        this.h = str;
        this.d = z10;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.wb wbVar;
        int i10;
        int i11;
        int i12;
        Rect rect;
        int i13 = this.f39723a;
        Serializable serializable = this.h;
        int i14 = this.f39725c;
        int i15 = this.f39724b;
        Object obj = this.f39726f;
        Object obj2 = this.e;
        switch (i13) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = (ArrayList) serializable;
                un unVar = ((nl) obj2).f39970b;
                if (this.d) {
                    i10 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
                    org.telegram.messenger.vp.r1(i10).e7.edit().remove("pin_" + unVar.f42297j6).commit();
                    unVar.Sc(0, true);
                    wbVar = null;
                } else {
                    wbVar = null;
                    unVar.getNotificationCenter().k(56, Long.valueOf(unVar.f42297j6), arrayList, Boolean.TRUE, arrayList2, null, 0, Integer.valueOf(i15), Boolean.valueOf(unVar.f42237e5));
                }
                if (i14 == unVar.Q3) {
                    unVar.O3 = wbVar;
                    return;
                }
                return;
            default:
                e2.c cVar = (e2.c) obj2;
                Bitmap bitmap = (Bitmap) obj;
                String str = (String) serializable;
                Paint paint = (Paint) cVar.d;
                int i16 = cVar.f6116a;
                if (bitmap != null && !bitmap.isRecycled()) {
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    int round = (int) Math.round(Math.sqrt(width * 324.0f));
                    int round2 = (int) Math.round(Math.sqrt(324.0f / width));
                    if (i15 != 90 && i15 != 270) {
                        i12 = round2;
                        i11 = round;
                    } else {
                        i11 = round2;
                        i12 = round;
                    }
                    int i17 = i16 * 2;
                    Bitmap createBitmap = Bitmap.createBitmap(i17 + i11, i17 + i12, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    Rect rect2 = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
                    int i18 = i16 + round;
                    int i19 = i16 + round2;
                    Rect rect3 = new Rect(i16, i16, i18, i19);
                    float f7 = i16;
                    canvas.translate((i11 / 2.0f) + f7, (i12 / 2.0f) + f7);
                    if (i14 == 1) {
                        canvas.scale(-1.0f, 1.0f);
                        rect = rect2;
                    } else {
                        rect = rect2;
                        if (i14 == 2) {
                            canvas.scale(1.0f, -1.0f);
                        }
                    }
                    canvas.rotate(i15);
                    float f10 = -i16;
                    canvas.translate(f10 - (round / 2.0f), f10 - (round2 / 2.0f));
                    try {
                        canvas.drawBitmap(bitmap, rect, rect3, (Paint) null);
                    } catch (Exception unused) {
                    }
                    Utilities.stackBlurBitmap(createBitmap, 6);
                    if (i16 > 0) {
                        float f11 = i18;
                        canvas.drawRect(0.0f, 0.0f, f11, f7, paint);
                        float f12 = i19;
                        canvas.drawRect(0.0f, f7, f7, f12, paint);
                        float f13 = i18 + i16;
                        canvas.drawRect(f11, f7, f13, f12, paint);
                        canvas.drawRect(0.0f, f12, f13, i19 + i16, paint);
                    }
                    org.telegram.messenger.i0.g3(new ag.n0(cVar, str, createBitmap, this.d, bitmap, 7));
                    return;
                }
                return;
        }
    }

    public ml(nl nlVar, boolean z10, ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        this.e = nlVar;
        this.d = z10;
        this.f39726f = arrayList;
        this.h = arrayList2;
        this.f39724b = i10;
        this.f39725c = i11;
    }
}
