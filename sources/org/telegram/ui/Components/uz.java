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
import org.telegram.ui.hg1;
public final class uz implements MediaDataController.KeywordResultCallback, f5, org.telegram.ui.ActionBar.z1, ImageReceiver.ImageReceiverDelegate, MessagesStorage.BooleanCallback, t5.b, s5.e, e2.h, x2.m, org.telegram.ui.py {
    public final int f31290a;
    public final Object f31291b;
    public final Object f31292c;
    public final Object d;

    public uz(Object obj, Object obj2, Object obj3, int i10) {
        this.f31290a = i10;
        this.f31291b = obj;
        this.f31292c = obj2;
        this.d = obj3;
    }

    @Override
    public boolean B() {
        return false;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        boolean z11;
        int i12;
        int i13;
        long j3;
        p60 p60Var = (p60) this.f31291b;
        l60 l60Var = (l60) this.f31292c;
        VideoEditedInfo videoEditedInfo = (VideoEditedInfo) this.d;
        w60 w60Var = p60Var.H0;
        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, p60Var.f29394a.getAbsolutePath(), 0, true, 0, 0, 0L);
        if (l60Var != null) {
            photoEntry.ttl = l60Var.f28043c;
            photoEntry.effectId = l60Var.d;
        }
        j60 j60Var = w60Var.f32297n;
        if (!z10 && l60Var != null && !l60Var.f28041a) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (i10 != 0) {
            i12 = i10;
        } else if (l60Var != null) {
            i12 = l60Var.f28042b;
        } else {
            i12 = 0;
        }
        if (i11 != 0) {
            i13 = i11;
        } else {
            i13 = 0;
        }
        if (l60Var != null) {
            j3 = l60Var.f28044e;
        } else {
            j3 = 0;
        }
        j60Var.r(photoEntry, videoEditedInfo, z11, i12, i13, false, j3);
        w60Var.r(false, false);
    }

    @Override
    public boolean K(org.telegram.ui.vy vyVar) {
        return false;
    }

    @Override
    public void accept(Object obj) {
        ((u2.j0) obj).c(((a5.a) this.f31291b).f299b, (u2.f0) this.f31292c, (u2.b0) this.d);
    }

    @Override
    public java.lang.Object apply(java.lang.Object r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.uz.apply(java.lang.Object):java.lang.Object");
    }

    @Override
    public e9.a1 b(int i10, b2.l1 l1Var, int[] iArr) {
        x2.i iVar = (x2.i) this.f31291b;
        String str = (String) this.f31292c;
        String str2 = (String) this.d;
        e9.f0 u10 = e9.i0.u();
        for (int i11 = 0; i11 < l1Var.f3413a; i11++) {
            u10.b(new x2.l(i10, l1Var, i11, iVar, iArr[i11], str, str2));
        }
        return u10.i();
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        Bitmap bitmap;
        int i10;
        f31 f31Var = (f31) this.f31291b;
        dq dqVar = (dq) this.f31292c;
        TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) this.d;
        ImageReceiver.BitmapHolder bitmapSafe = imageReceiver.getBitmapSafe();
        if (z10 && bitmapSafe != null && (bitmap = bitmapSafe.bitmap) != null) {
            Drawable drawable = dqVar.f25450b;
            if (drawable instanceof gd0) {
                gd0 gd0Var = (gd0) drawable;
                TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
                if (wallPaperSettings != null && wallPaperSettings.intensity < 0) {
                    i10 = -100;
                } else {
                    i10 = 100;
                }
                gd0Var.t(f31.e(bitmap), i10);
                gd0Var.u(f31Var.L);
                f31Var.invalidate();
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.l5.a(this, i10, str, drawable);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f31290a) {
            case 2:
                hw0 hw0Var = (hw0) this.f31291b;
                ArrayList arrayList = (ArrayList) this.d;
                ((ai.v8) this.f31292c).F(arrayList);
                zc.a0(hw0Var.f26957v1).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("BotPreviewsDeleted", arrayList.size(), new Object[0])).j();
                hw0Var.L(false);
                return;
            case 5:
                boolean[] zArr = (boolean[]) this.f31291b;
                JsPromptResult jsPromptResult = (JsPromptResult) this.f31292c;
                uu uuVar = (uu) this.d;
                if (!zArr[0]) {
                    zArr[0] = true;
                    jsPromptResult.confirm(uuVar.getText().toString());
                    return;
                }
                return;
            default:
                rg.j0.Q((rg.j0) this.f31291b, (ArrayList) this.f31292c, (TLRPC.User) this.d);
                return;
        }
    }

    @Override
    public Object i() {
        q5.a aVar = (q5.a) this.f31291b;
        l5.i iVar = (l5.i) this.f31292c;
        l5.h hVar = (l5.h) this.d;
        s5.g gVar = (s5.g) aVar.d;
        gVar.getClass();
        i5.d dVar = iVar.f15162c;
        String str = hVar.f15155a;
        String str2 = iVar.f15160a;
        String c10 = w7.h6.c("SQLiteEventStore");
        if (Log.isLoggable(c10, 3)) {
            Log.d(c10, "Storing event with priority=" + dVar + ", name=" + str + " for destination " + str2);
        }
        ((Long) gVar.c(new uz(gVar, hVar, iVar, 8))).getClass();
        aVar.f45941a.V(iVar, 1, false);
        return null;
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.l5.b(this, imageReceiver);
    }

    @Override
    public void run(boolean z10) {
        TLRPC.Chat chat = (TLRPC.Chat) this.f31291b;
        org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.f31292c;
        org.telegram.ui.Components.voip.g2.l(chat, null, true, null, m2Var.getParentActivity(), m2Var, (AccountInstance) this.d);
    }

    @Override
    public boolean w(org.telegram.ui.vy vyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, hg1 hg1Var) {
        return yh.s3.Y((yh.s3) this.f31291b, (TL_stars.TL_starGiftUnique) this.f31292c, (org.telegram.ui.vy) this.d, arrayList);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        wz wzVar = (wz) this.f31291b;
        HashMap hashMap = (HashMap) this.f31292c;
        Runnable runnable = (Runnable) this.d;
        HashMap hashMap2 = wzVar.f32585f;
        if (wzVar.f32589w.M != wzVar.f32582b) {
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            String str2 = ((MediaDataController.KeywordResult) arrayList.get(i10)).emoji;
            ArrayList arrayList2 = (ArrayList) hashMap.get(str2);
            if (arrayList2 != null && !arrayList2.isEmpty() && !hashMap2.containsKey(arrayList2)) {
                hashMap2.put(arrayList2, str2);
                wzVar.h.add(arrayList2);
            }
        }
        runnable.run();
    }
}
