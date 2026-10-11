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
import org.telegram.ui.eg1;
public final class sz implements MediaDataController.KeywordResultCallback, f5, org.telegram.ui.ActionBar.z1, ImageReceiver.ImageReceiverDelegate, MessagesStorage.BooleanCallback, t5.b, s5.e, e2.h, x2.m, org.telegram.ui.my {
    public final int f30977a;
    public final Object f30978b;
    public final Object f30979c;
    public final Object d;

    public sz(Object obj, Object obj2, Object obj3, int i10) {
        this.f30977a = i10;
        this.f30978b = obj;
        this.f30979c = obj2;
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
        m60 m60Var = (m60) this.f30978b;
        i60 i60Var = (i60) this.f30979c;
        VideoEditedInfo videoEditedInfo = (VideoEditedInfo) this.d;
        t60 t60Var = m60Var.H0;
        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, m60Var.f28720a.getAbsolutePath(), 0, true, 0, 0, 0L);
        if (i60Var != null) {
            photoEntry.ttl = i60Var.f27344c;
            photoEntry.effectId = i60Var.d;
        }
        g60 g60Var = t60Var.f31106n;
        if (!z10 && i60Var != null && !i60Var.f27342a) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (i10 != 0) {
            i12 = i10;
        } else if (i60Var != null) {
            i12 = i60Var.f27343b;
        } else {
            i12 = 0;
        }
        if (i11 != 0) {
            i13 = i11;
        } else {
            i13 = 0;
        }
        if (i60Var != null) {
            j3 = i60Var.f27345e;
        } else {
            j3 = 0;
        }
        g60Var.r(photoEntry, videoEditedInfo, z11, i12, i13, false, j3);
        t60Var.r(false, false);
    }

    @Override
    public boolean K(org.telegram.ui.sy syVar) {
        return false;
    }

    @Override
    public void accept(Object obj) {
        ((u2.j0) obj).c(((a5.a) this.f30978b).f299b, (u2.f0) this.f30979c, (u2.b0) this.d);
    }

    @Override
    public java.lang.Object apply(java.lang.Object r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sz.apply(java.lang.Object):java.lang.Object");
    }

    @Override
    public e9.a1 b(int i10, b2.l1 l1Var, int[] iArr) {
        x2.i iVar = (x2.i) this.f30978b;
        String str = (String) this.f30979c;
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
        a31 a31Var = (a31) this.f30978b;
        bq bqVar = (bq) this.f30979c;
        TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) this.d;
        ImageReceiver.BitmapHolder bitmapSafe = imageReceiver.getBitmapSafe();
        if (z10 && bitmapSafe != null && (bitmap = bitmapSafe.bitmap) != null) {
            Drawable drawable = bqVar.f25059b;
            if (drawable instanceof cd0) {
                cd0 cd0Var = (cd0) drawable;
                TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
                if (wallPaperSettings != null && wallPaperSettings.intensity < 0) {
                    i10 = -100;
                } else {
                    i10 = 100;
                }
                cd0Var.t(a31.e(bitmap), i10);
                cd0Var.u(a31Var.L);
                a31Var.invalidate();
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.i5.a(this, i10, str, drawable);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f30977a) {
            case 2:
                cw0 cw0Var = (cw0) this.f30978b;
                ArrayList arrayList = (ArrayList) this.d;
                ((ai.v8) this.f30979c).F(arrayList);
                ad.a0(cw0Var.f25536v1).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("BotPreviewsDeleted", arrayList.size(), new Object[0])).j();
                cw0Var.L(false);
                return;
            case 5:
                boolean[] zArr = (boolean[]) this.f30978b;
                JsPromptResult jsPromptResult = (JsPromptResult) this.f30979c;
                su suVar = (su) this.d;
                if (!zArr[0]) {
                    zArr[0] = true;
                    jsPromptResult.confirm(suVar.getText().toString());
                    return;
                }
                return;
            default:
                rg.j0.Q((rg.j0) this.f30978b, (ArrayList) this.f30979c, (TLRPC.User) this.d);
                return;
        }
    }

    @Override
    public Object i() {
        q5.a aVar = (q5.a) this.f30978b;
        l5.i iVar = (l5.i) this.f30979c;
        l5.h hVar = (l5.h) this.d;
        s5.g gVar = (s5.g) aVar.d;
        gVar.getClass();
        i5.d dVar = iVar.f15452c;
        String str = hVar.f15445a;
        String str2 = iVar.f15450a;
        String c10 = w7.i6.c("SQLiteEventStore");
        if (Log.isLoggable(c10, 3)) {
            Log.d(c10, "Storing event with priority=" + dVar + ", name=" + str + " for destination " + str2);
        }
        ((Long) gVar.c(new sz(gVar, hVar, iVar, 8))).getClass();
        aVar.f46105a.W(iVar, 1, false);
        return null;
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.i5.b(this, imageReceiver);
    }

    @Override
    public void run(boolean z10) {
        TLRPC.Chat chat = (TLRPC.Chat) this.f30978b;
        org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.f30979c;
        org.telegram.ui.Components.voip.g2.l(chat, null, true, null, m2Var.getParentActivity(), m2Var, (AccountInstance) this.d);
    }

    @Override
    public boolean w(org.telegram.ui.sy syVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, eg1 eg1Var) {
        return yh.s3.Y((yh.s3) this.f30978b, (TL_stars.TL_starGiftUnique) this.f30979c, (org.telegram.ui.sy) this.d, arrayList);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        uz uzVar = (uz) this.f30978b;
        HashMap hashMap = (HashMap) this.f30979c;
        Runnable runnable = (Runnable) this.d;
        HashMap hashMap2 = uzVar.f31755f;
        if (uzVar.f31759w.M != uzVar.f31752b) {
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            String str2 = ((MediaDataController.KeywordResult) arrayList.get(i10)).emoji;
            ArrayList arrayList2 = (ArrayList) hashMap.get(str2);
            if (arrayList2 != null && !arrayList2.isEmpty() && !hashMap2.containsKey(arrayList2)) {
                hashMap2.put(arrayList2, str2);
                uzVar.h.add(arrayList2);
            }
        }
        runnable.run();
    }
}
