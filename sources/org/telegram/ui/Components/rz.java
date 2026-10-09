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
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.fg1;
public final class rz implements MediaDataController.KeywordResultCallback, f5, org.telegram.ui.ActionBar.a2, ImageReceiver.ImageReceiverDelegate, MessagesStorage.BooleanCallback, t5.b, s5.e, e2.h, x2.m, org.telegram.ui.ny {
    public final int f30545a;
    public final Object f30546b;
    public final Object f30547c;
    public final Object d;

    public rz(Object obj, Object obj2, Object obj3, int i10) {
        this.f30545a = i10;
        this.f30546b = obj;
        this.f30547c = obj2;
        this.d = obj3;
    }

    @Override
    public boolean C() {
        return false;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        boolean z11;
        int i12;
        int i13;
        long j3;
        l60 l60Var = (l60) this.f30546b;
        h60 h60Var = (h60) this.f30547c;
        VideoEditedInfo videoEditedInfo = (VideoEditedInfo) this.d;
        t60 t60Var = l60Var.H0;
        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, l60Var.f28267a.getAbsolutePath(), 0, true, 0, 0, 0L);
        if (h60Var != null) {
            photoEntry.ttl = h60Var.f26978c;
            photoEntry.effectId = h60Var.d;
        }
        f60 f60Var = t60Var.f31026n;
        if (!z10 && h60Var != null && !h60Var.f26976a) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (i10 != 0) {
            i12 = i10;
        } else if (h60Var != null) {
            i12 = h60Var.f26977b;
        } else {
            i12 = 0;
        }
        if (i11 != 0) {
            i13 = i11;
        } else {
            i13 = 0;
        }
        if (h60Var != null) {
            j3 = h60Var.f26979e;
        } else {
            j3 = 0;
        }
        f60Var.r(photoEntry, videoEditedInfo, z11, i12, i13, false, j3);
        t60Var.r(false, false);
    }

    @Override
    public boolean K(org.telegram.ui.ty tyVar) {
        return false;
    }

    @Override
    public void accept(Object obj) {
        ((u2.j0) obj).c(((a5.a) this.f30546b).f299b, (u2.f0) this.f30547c, (u2.b0) this.d);
    }

    @Override
    public java.lang.Object apply(java.lang.Object r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rz.apply(java.lang.Object):java.lang.Object");
    }

    @Override
    public e9.a1 b(int i10, b2.l1 l1Var, int[] iArr) {
        x2.i iVar = (x2.i) this.f30546b;
        String str = (String) this.f30547c;
        String str2 = (String) this.d;
        e9.f0 u10 = e9.i0.u();
        for (int i11 = 0; i11 < l1Var.f3415a; i11++) {
            u10.b(new x2.l(i10, l1Var, i11, iVar, iArr[i11], str, str2));
        }
        return u10.i();
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        Bitmap bitmap;
        int i10;
        z21 z21Var = (z21) this.f30546b;
        bq bqVar = (bq) this.f30547c;
        TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) this.d;
        ImageReceiver.BitmapHolder bitmapSafe = imageReceiver.getBitmapSafe();
        if (z10 && bitmapSafe != null && (bitmap = bitmapSafe.bitmap) != null) {
            Drawable drawable = bqVar.f25083b;
            if (drawable instanceof cd0) {
                cd0 cd0Var = (cd0) drawable;
                TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
                if (wallPaperSettings != null && wallPaperSettings.intensity < 0) {
                    i10 = -100;
                } else {
                    i10 = 100;
                }
                cd0Var.t(z21.e(bitmap), i10);
                cd0Var.u(z21Var.L);
                z21Var.invalidate();
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.i5.a(this, i10, str, drawable);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f30545a) {
            case 2:
                bw0 bw0Var = (bw0) this.f30546b;
                ArrayList arrayList = (ArrayList) this.d;
                ((ai.v8) this.f30547c).F(arrayList);
                ad.a0(bw0Var.f25166v1).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("BotPreviewsDeleted", arrayList.size(), new Object[0])).j();
                bw0Var.L(false);
                return;
            case 5:
                boolean[] zArr = (boolean[]) this.f30546b;
                JsPromptResult jsPromptResult = (JsPromptResult) this.f30547c;
                ru ruVar = (ru) this.d;
                if (!zArr[0]) {
                    zArr[0] = true;
                    jsPromptResult.confirm(ruVar.getText().toString());
                    return;
                }
                return;
            default:
                rg.j0.Q((rg.j0) this.f30546b, (ArrayList) this.f30547c, (TLRPC.User) this.d);
                return;
        }
    }

    @Override
    public Object i() {
        q5.a aVar = (q5.a) this.f30546b;
        l5.i iVar = (l5.i) this.f30547c;
        l5.h hVar = (l5.h) this.d;
        s5.g gVar = (s5.g) aVar.d;
        gVar.getClass();
        i5.d dVar = iVar.f15413c;
        String str = hVar.f15406a;
        String str2 = iVar.f15411a;
        String c10 = w7.i6.c("SQLiteEventStore");
        if (Log.isLoggable(c10, 3)) {
            Log.d(c10, "Storing event with priority=" + dVar + ", name=" + str + " for destination " + str2);
        }
        ((Long) gVar.c(new rz(gVar, hVar, iVar, 8))).getClass();
        aVar.f45994a.W(iVar, 1, false);
        return null;
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.i5.b(this, imageReceiver);
    }

    @Override
    public void run(boolean z10) {
        TLRPC.Chat chat = (TLRPC.Chat) this.f30546b;
        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f30547c;
        org.telegram.ui.Components.voip.f2.l(chat, null, true, null, n2Var.getParentActivity(), n2Var, (AccountInstance) this.d);
    }

    @Override
    public boolean w(org.telegram.ui.ty tyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, fg1 fg1Var) {
        return yh.s3.Y((yh.s3) this.f30546b, (TL_stars.TL_starGiftUnique) this.f30547c, (org.telegram.ui.ty) this.d, arrayList);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        tz tzVar = (tz) this.f30546b;
        HashMap hashMap = (HashMap) this.f30547c;
        Runnable runnable = (Runnable) this.d;
        HashMap hashMap2 = tzVar.f31314f;
        if (tzVar.f31318w.M != tzVar.f31311b) {
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            String str2 = ((MediaDataController.KeywordResult) arrayList.get(i10)).emoji;
            ArrayList arrayList2 = (ArrayList) hashMap.get(str2);
            if (arrayList2 != null && !arrayList2.isEmpty() && !hashMap2.containsKey(arrayList2)) {
                hashMap2.put(arrayList2, str2);
                tzVar.h.add(arrayList2);
            }
        }
        runnable.run();
    }
}
