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
public final class py implements MediaDataController.KeywordResultCallback, b5, org.telegram.ui.ActionBar.z1, ImageReceiver.ImageReceiverDelegate, MessagesStorage.BooleanCallback, t5.b, s5.e, e2.j, x2.k {
    public final int f29688a;
    public final Object f29689b;
    public final Object f29690c;
    public final Object d;

    public py(Object obj, Object obj2, Object obj3, int i10) {
        this.f29688a = i10;
        this.f29690c = obj;
        this.d = obj2;
        this.f29689b = obj3;
    }

    @Override
    public void C(int i10, int i11, boolean z10) {
        boolean z11;
        int i12;
        int i13;
        long j10;
        d60 d60Var = (d60) this.f29690c;
        y50 y50Var = (y50) this.d;
        VideoEditedInfo videoEditedInfo = (VideoEditedInfo) this.f29689b;
        l60 l60Var = d60Var.H0;
        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, d60Var.f25574a.getAbsolutePath(), 0, true, 0, 0, 0L);
        if (y50Var != null) {
            photoEntry.ttl = y50Var.f32824c;
            photoEntry.effectId = y50Var.d;
        }
        w50 w50Var = l60Var.f28202n;
        if (!z10 && y50Var != null && !y50Var.f32822a) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (i10 != 0) {
            i12 = i10;
        } else if (y50Var != null) {
            i12 = y50Var.f32823b;
        } else {
            i12 = 0;
        }
        if (i11 != 0) {
            i13 = i11;
        } else {
            i13 = 0;
        }
        if (y50Var != null) {
            j10 = y50Var.e;
        } else {
            j10 = 0;
        }
        w50Var.s(photoEntry, videoEditedInfo, z11, i12, i13, false, j10);
        l60Var.r(false, false);
    }

    @Override
    public void accept(Object obj) {
        ((u2.m0) obj).d(((a5.a) this.f29690c).f281b, (u2.h0) this.d, (u2.d0) this.f29689b);
    }

    @Override
    public java.lang.Object apply(java.lang.Object r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.py.apply(java.lang.Object):java.lang.Object");
    }

    @Override
    public e9.x1 b(int i10, b2.p1 p1Var, int[] iArr) {
        x2.i iVar = (x2.i) this.f29690c;
        String str = (String) this.d;
        String str2 = (String) this.f29689b;
        e9.k0 t10 = e9.n0.t();
        for (int i11 = 0; i11 < p1Var.f3907a; i11++) {
            t10.c(new x2.j(i10, p1Var, i11, iVar, iArr[i11], str, str2));
        }
        return t10.f();
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        Bitmap bitmap;
        int i10;
        u21 u21Var = (u21) this.f29690c;
        tp tpVar = (tp) this.d;
        TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) this.f29689b;
        ImageReceiver.BitmapHolder bitmapSafe = imageReceiver.getBitmapSafe();
        if (z10 && bitmapSafe != null && (bitmap = bitmapSafe.bitmap) != null) {
            Drawable drawable = tpVar.f30872b;
            if (drawable instanceof wc0) {
                wc0 wc0Var = (wc0) drawable;
                TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
                if (wallPaperSettings != null && wallPaperSettings.intensity < 0) {
                    i10 = -100;
                } else {
                    i10 = 100;
                }
                wc0Var.s(u21.e(bitmap), i10);
                wc0Var.t(u21Var.L);
                u21Var.invalidate();
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.n5.a(this, i10, str, drawable);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f29688a) {
            case 3:
                wv0 wv0Var = (wv0) this.f29690c;
                ArrayList arrayList = (ArrayList) this.f29689b;
                ((ci.s6) this.d).F(arrayList);
                vc.a0(wv0Var.f32410v1).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("BotPreviewsDeleted", arrayList.size(), new Object[0])).j();
                wv0Var.M(false);
                return;
            case 6:
                boolean[] zArr = (boolean[]) this.f29690c;
                JsPromptResult jsPromptResult = (JsPromptResult) this.d;
                gu guVar = (gu) this.f29689b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    jsPromptResult.confirm(guVar.getText().toString());
                    return;
                }
                return;
            default:
                sg.j0.P((sg.j0) this.f29690c, (ArrayList) this.d, (TLRPC.User) this.f29689b);
                return;
        }
    }

    @Override
    public Object j() {
        q5.a aVar = (q5.a) this.f29690c;
        l5.i iVar = (l5.i) this.d;
        l5.h hVar = (l5.h) this.f29689b;
        s5.g gVar = (s5.g) aVar.d;
        gVar.getClass();
        i5.d dVar = iVar.f15985c;
        String str = hVar.f15979a;
        String str2 = iVar.f15983a;
        String c10 = w7.i6.c("SQLiteEventStore");
        if (Log.isLoggable(c10, 3)) {
            Log.d(c10, "Storing event with priority=" + dVar + ", name=" + str + " for destination " + str2);
        }
        ((Long) gVar.c(new py(gVar, hVar, iVar, 8))).getClass();
        aVar.f44829a.U(iVar, 1, false);
        return null;
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.n5.b(this, imageReceiver);
    }

    @Override
    public void run(boolean z10) {
        TLRPC.Chat chat = (TLRPC.Chat) this.f29690c;
        org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.d;
        org.telegram.ui.Components.voip.d2.l(chat, null, true, null, o2Var.getParentActivity(), o2Var, (AccountInstance) this.f29689b);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        switch (this.f29688a) {
            case 0:
                Runnable runnable = (Runnable) this.f29689b;
                ry ryVar = ((qy) this.f29690c).f30009a;
                if (((String) this.d).equals(ryVar.v)) {
                    ryVar.f30295w = str;
                    ryVar.f30292n.addAll(arrayList);
                    runnable.run();
                    return;
                }
                return;
            default:
                kz kzVar = (kz) this.f29690c;
                HashMap hashMap = (HashMap) this.d;
                Runnable runnable2 = (Runnable) this.f29689b;
                HashMap hashMap2 = kzVar.f28100f;
                if (kzVar.f28104w.M != kzVar.f28098b) {
                    return;
                }
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    String str2 = ((MediaDataController.KeywordResult) arrayList.get(i10)).emoji;
                    ArrayList arrayList2 = (ArrayList) hashMap.get(str2);
                    if (arrayList2 != null && !arrayList2.isEmpty() && !hashMap2.containsKey(arrayList2)) {
                        hashMap2.put(arrayList2, str2);
                        kzVar.h.add(arrayList2);
                    }
                }
                runnable2.run();
                return;
        }
    }
}
