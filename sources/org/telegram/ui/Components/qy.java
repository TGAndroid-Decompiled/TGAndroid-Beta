package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.webkit.JsPromptResult;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class qy implements MediaDataController.KeywordResultCallback, e5, org.telegram.ui.ActionBar.b2, ImageReceiver.ImageReceiverDelegate, MessagesStorage.BooleanCallback, u5.b, t5.e, e2.j, x2.l {
    public final int f32059a;
    public final Object f32060b;
    public final Object f32061c;
    public final Object d;

    public qy(Object obj, Object obj2, Object obj3, int i10) {
        this.f32059a = i10;
        this.f32061c = obj;
        this.d = obj2;
        this.f32060b = obj3;
    }

    @Override
    public void G(int i10, int i11, boolean z10) {
        boolean z11;
        int i12;
        int i13;
        long j10;
        h60 h60Var = (h60) this.f32061c;
        c60 c60Var = (c60) this.d;
        VideoEditedInfo videoEditedInfo = (VideoEditedInfo) this.f32060b;
        o60 o60Var = h60Var.H0;
        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, h60Var.f28817a.getAbsolutePath(), 0, true, 0, 0, 0L);
        if (c60Var != null) {
            photoEntry.ttl = c60Var.f27078c;
            photoEntry.effectId = c60Var.d;
        }
        a60 a60Var = o60Var.f31192n;
        if (!z10 && c60Var != null && !c60Var.f27076a) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (i10 != 0) {
            i12 = i10;
        } else if (c60Var != null) {
            i12 = c60Var.f27077b;
        } else {
            i12 = 0;
        }
        if (i11 != 0) {
            i13 = i11;
        } else {
            i13 = 0;
        }
        if (c60Var != null) {
            j10 = c60Var.e;
        } else {
            j10 = 0;
        }
        a60Var.r(photoEntry, videoEditedInfo, z11, i12, i13, false, j10);
        o60Var.r(false, false);
    }

    @Override
    public f9.s1 a(int i10, b2.q1 q1Var, int[] iArr) {
        x2.j jVar = (x2.j) this.f32061c;
        String str = (String) this.d;
        String str2 = (String) this.f32060b;
        f9.f0 t10 = f9.i0.t();
        for (int i11 = 0; i11 < q1Var.f3358a; i11++) {
            t10.c(new x2.k(i10, q1Var, i11, jVar, iArr[i11], str, str2));
        }
        return t10.f();
    }

    @Override
    public void accept(Object obj) {
        ((u2.k0) obj).c(((a8.ng) this.f32061c).f639b, (u2.g0) this.d, (u2.c0) this.f32060b);
    }

    @Override
    public java.lang.Object apply(java.lang.Object r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qy.apply(java.lang.Object):java.lang.Object");
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        Bitmap bitmap;
        int i10;
        d31 d31Var = (d31) this.f32061c;
        xp xpVar = (xp) this.d;
        TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) this.f32060b;
        ImageReceiver.BitmapHolder bitmapSafe = imageReceiver.getBitmapSafe();
        if (z10 && bitmapSafe != null && (bitmap = bitmapSafe.bitmap) != null) {
            Drawable drawable = xpVar.f34794b;
            if (drawable instanceof uc0) {
                uc0 uc0Var = (uc0) drawable;
                TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
                if (wallPaperSettings != null && wallPaperSettings.intensity < 0) {
                    i10 = -100;
                } else {
                    i10 = 100;
                }
                uc0Var.s(d31.e(bitmap), i10);
                uc0Var.t(d31Var.L);
                d31Var.invalidate();
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.o5.a(this, i10, str, drawable);
    }

    @Override
    public Object f() {
        r5.a aVar = (r5.a) this.f32061c;
        m5.i iVar = (m5.i) this.d;
        m5.h hVar = (m5.h) this.f32060b;
        t5.g gVar = (t5.g) aVar.d;
        gVar.getClass();
        j5.d dVar = iVar.f18335c;
        String str = hVar.f18329a;
        String str2 = iVar.f18333a;
        String c10 = a8.of.c("SQLiteEventStore");
        if (Log.isLoggable(c10, 3)) {
            Log.d(c10, "Storing event with priority=" + dVar + ", name=" + str + " for destination " + str2);
        }
        ((Long) gVar.c(new qy(gVar, hVar, iVar, 8))).getClass();
        aVar.f47301a.s(iVar, 1, false);
        return null;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f32059a) {
            case 3:
                aw0 aw0Var = (aw0) this.f32061c;
                ArrayList arrayList = (ArrayList) this.f32060b;
                ((di.s6) this.d).F(arrayList);
                wc.b0(aw0Var.f26704x1).R(R.raw.ic_delete, 36, LocaleController.formatPluralString("BotPreviewsDeleted", arrayList.size(), new Object[0])).j();
                aw0Var.S(false);
                return;
            case 6:
                boolean[] zArr = (boolean[]) this.f32061c;
                JsPromptResult jsPromptResult = (JsPromptResult) this.d;
                ju juVar = (ju) this.f32060b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    jsPromptResult.confirm(juVar.getText().toString());
                    return;
                }
                return;
            default:
                tg.j0.P((tg.j0) this.f32061c, (ArrayList) this.d, (TLRPC.User) this.f32060b);
                return;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.o5.b(this, imageReceiver);
    }

    @Override
    public void run(boolean z10) {
        TLRPC.Chat chat = (TLRPC.Chat) this.f32061c;
        org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) this.d;
        org.telegram.ui.Components.voip.g2.l(chat, null, true, null, r2Var.getParentActivity(), r2Var, (AccountInstance) this.f32060b);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        switch (this.f32059a) {
            case 0:
                Runnable runnable = (Runnable) this.f32060b;
                sy syVar = ((ry) this.f32061c).f32346a;
                if (((String) this.d).equals(syVar.v)) {
                    syVar.f32707w = str;
                    syVar.f32704n.addAll(arrayList);
                    runnable.run();
                    return;
                }
                return;
            default:
                lz lzVar = (lz) this.f32061c;
                HashMap hashMap = (HashMap) this.d;
                Runnable runnable2 = (Runnable) this.f32060b;
                HashMap hashMap2 = lzVar.f30331f;
                if (lzVar.f30335w.M != lzVar.f30329b) {
                    return;
                }
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    String str2 = ((MediaDataController.KeywordResult) arrayList.get(i10)).emoji;
                    ArrayList arrayList2 = (ArrayList) hashMap.get(str2);
                    if (arrayList2 != null && !arrayList2.isEmpty() && !hashMap2.containsKey(arrayList2)) {
                        hashMap2.put(arrayList2, str2);
                        lzVar.h.add(arrayList2);
                    }
                }
                runnable2.run();
                return;
        }
    }
}
