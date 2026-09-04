package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.webkit.JsPromptResult;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.eg1;
public final class s50 implements d5, org.telegram.ui.ActionBar.a2, ImageReceiver.ImageReceiverDelegate, MessagesStorage.BooleanCallback, t5.b, s5.e, x2.m, org.telegram.ui.oy {
    public final int f30195a;
    public final Object f30196b;
    public final Object f30197c;
    public final Object d;

    public s50(Object obj, Object obj2, Object obj3, int i10) {
        this.f30195a = i10;
        this.f30196b = obj;
        this.f30197c = obj2;
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
        v50 v50Var = (v50) this.f30196b;
        q50 q50Var = (q50) this.f30197c;
        VideoEditedInfo videoEditedInfo = (VideoEditedInfo) this.d;
        w50 w50Var = v50Var.H0;
        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, v50Var.f31096a.getAbsolutePath(), 0, true, 0, 0, 0L);
        if (q50Var != null) {
            photoEntry.ttl = q50Var.f29592c;
            photoEntry.effectId = q50Var.d;
        }
        o50 o50Var = w50Var.f32130c;
        if (!z10 && q50Var != null && !q50Var.f29590a) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (i10 != 0) {
            i12 = i10;
        } else if (q50Var != null) {
            i12 = q50Var.f29591b;
        } else {
            i12 = 0;
        }
        if (i11 != 0) {
            i13 = i11;
        } else {
            i13 = 0;
        }
        if (q50Var != null) {
            j3 = q50Var.f29593e;
        } else {
            j3 = 0;
        }
        o50Var.q(photoEntry, videoEditedInfo, z11, i12, i13, false, j3);
        w50Var.m(false, false);
    }

    @Override
    public boolean K(org.telegram.ui.uy uyVar) {
        return false;
    }

    @Override
    public java.lang.Object apply(java.lang.Object r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s50.apply(java.lang.Object):java.lang.Object");
    }

    @Override
    public e9.a1 b(int i10, b2.l1 l1Var, int[] iArr) {
        x2.i iVar = (x2.i) this.f30196b;
        String str = (String) this.f30197c;
        String str2 = (String) this.d;
        e9.f0 u10 = e9.i0.u();
        for (int i11 = 0; i11 < l1Var.f2142a; i11++) {
            u10.b(new x2.l(i10, l1Var, i11, iVar, iArr[i11], str, str2));
        }
        return u10.i();
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        Bitmap bitmap;
        int i10;
        t11 t11Var = (t11) this.f30196b;
        kp kpVar = (kp) this.f30197c;
        TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) this.d;
        ImageReceiver.BitmapHolder bitmapSafe = imageReceiver.getBitmapSafe();
        if (z10 && bitmapSafe != null && (bitmap = bitmapSafe.bitmap) != null) {
            Drawable drawable = kpVar.f27883b;
            if (drawable instanceof dc0) {
                dc0 dc0Var = (dc0) drawable;
                TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
                if (wallPaperSettings != null && wallPaperSettings.intensity < 0) {
                    i10 = -100;
                } else {
                    i10 = 100;
                }
                dc0Var.t(t11.e(bitmap), i10);
                dc0Var.u(t11Var.L);
                t11Var.invalidate();
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f30195a) {
            case 1:
                xu0 xu0Var = (xu0) this.f30196b;
                ArrayList arrayList = (ArrayList) this.d;
                ((bi.b8) this.f30197c).F(arrayList);
                yc.a0(xu0Var.f32726v1).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("BotPreviewsDeleted", arrayList.size(), new Object[0])).j();
                xu0Var.L(false);
                return;
            case 4:
                boolean[] zArr = (boolean[]) this.f30196b;
                JsPromptResult jsPromptResult = (JsPromptResult) this.f30197c;
                zt ztVar = (zt) this.d;
                if (!zArr[0]) {
                    zArr[0] = true;
                    jsPromptResult.confirm(ztVar.getText().toString());
                    return;
                }
                return;
            default:
                sg.k0.P((sg.k0) this.f30196b, (ArrayList) this.f30197c, (TLRPC.User) this.d);
                return;
        }
    }

    @Override
    public Object i() {
        q5.a aVar = (q5.a) this.f30196b;
        l5.i iVar = (l5.i) this.f30197c;
        l5.h hVar = (l5.h) this.d;
        s5.g gVar = (s5.g) aVar.d;
        gVar.getClass();
        i5.d dVar = iVar.f15285c;
        String str = hVar.f15278a;
        String str2 = iVar.f15283a;
        String c10 = w7.f6.c("SQLiteEventStore");
        if (Log.isLoggable(c10, 3)) {
            Log.d(c10, "Storing event with priority=" + dVar + ", name=" + str + " for destination " + str2);
        }
        ((Long) gVar.c(new s50(gVar, hVar, iVar, 6))).getClass();
        aVar.f44198a.O(iVar, 1, false);
        return null;
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override
    public void run(boolean z10) {
        TLRPC.Chat chat = (TLRPC.Chat) this.f30196b;
        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f30197c;
        org.telegram.ui.Components.voip.d2.l(chat, null, true, null, n2Var.getParentActivity(), n2Var, (AccountInstance) this.d);
    }

    @Override
    public boolean u(org.telegram.ui.uy uyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, eg1 eg1Var) {
        return zh.w3.X((zh.w3) this.f30196b, (TL_stars.TL_starGiftUnique) this.f30197c, (org.telegram.ui.uy) this.d, arrayList);
    }
}
