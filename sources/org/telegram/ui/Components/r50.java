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
import org.telegram.ui.fg1;
public final class r50 implements c5, org.telegram.ui.ActionBar.a2, ImageReceiver.ImageReceiverDelegate, MessagesStorage.BooleanCallback, t5.b, s5.f, x2.n, org.telegram.ui.oy {
    public final int f27769a;
    public final Object f27770b;
    public final Object f27771c;
    public final Object d;

    public r50(Object obj, Object obj2, Object obj3, int i10) {
        this.f27769a = i10;
        this.f27770b = obj;
        this.f27771c = obj2;
        this.d = obj3;
    }

    @Override
    public boolean A() {
        return false;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        boolean z11;
        int i12;
        int i13;
        long j3;
        u50 u50Var = (u50) this.f27770b;
        p50 p50Var = (p50) this.f27771c;
        VideoEditedInfo videoEditedInfo = (VideoEditedInfo) this.d;
        a60 a60Var = u50Var.H0;
        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, u50Var.f28556a.getAbsolutePath(), 0, true, 0, 0, 0L);
        if (p50Var != null) {
            photoEntry.ttl = p50Var.f27170c;
            photoEntry.effectId = p50Var.d;
        }
        n50 n50Var = a60Var.f22543f;
        if (!z10 && p50Var != null && !p50Var.f27168a) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (i10 != 0) {
            i12 = i10;
        } else if (p50Var != null) {
            i12 = p50Var.f27169b;
        } else {
            i12 = 0;
        }
        if (i11 != 0) {
            i13 = i11;
        } else {
            i13 = 0;
        }
        if (p50Var != null) {
            j3 = p50Var.e;
        } else {
            j3 = 0;
        }
        n50Var.q(photoEntry, videoEditedInfo, z11, i12, i13, false, j3);
        a60Var.q(false, false);
    }

    @Override
    public boolean K(org.telegram.ui.uy uyVar) {
        return false;
    }

    @Override
    public java.lang.Object apply(java.lang.Object r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r50.apply(java.lang.Object):java.lang.Object");
    }

    @Override
    public e9.a1 b(int i10, b2.l1 l1Var, int[] iArr) {
        x2.j jVar = (x2.j) this.f27770b;
        String str = (String) this.f27771c;
        String str2 = (String) this.d;
        e9.f0 u10 = e9.i0.u();
        for (int i11 = 0; i11 < l1Var.f3091a; i11++) {
            u10.b(new x2.m(i10, l1Var, i11, jVar, iArr[i11], str, str2));
        }
        return u10.i();
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        Bitmap bitmap;
        int i10;
        i21 i21Var = (i21) this.f27770b;
        lp lpVar = (lp) this.f27771c;
        TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) this.d;
        ImageReceiver.BitmapHolder bitmapSafe = imageReceiver.getBitmapSafe();
        if (z10 && bitmapSafe != null && (bitmap = bitmapSafe.bitmap) != null) {
            Drawable drawable = lpVar.f26220b;
            if (drawable instanceof kc0) {
                kc0 kc0Var = (kc0) drawable;
                TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
                if (wallPaperSettings != null && wallPaperSettings.intensity < 0) {
                    i10 = -100;
                } else {
                    i10 = 100;
                }
                kc0Var.t(i21.e(bitmap), i10);
                kc0Var.u(i21Var.L);
                i21Var.invalidate();
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override
    public Object i() {
        q5.a aVar = (q5.a) this.f27770b;
        l5.i iVar = (l5.i) this.f27771c;
        l5.h hVar = (l5.h) this.d;
        s5.h hVar2 = (s5.h) aVar.d;
        hVar2.getClass();
        i5.d dVar = iVar.f14095c;
        String str = hVar.f14089a;
        String str2 = iVar.f14093a;
        String c10 = w7.h6.c("SQLiteEventStore");
        if (Log.isLoggable(c10, 3)) {
            Log.d(c10, "Storing event with priority=" + dVar + ", name=" + str + " for destination " + str2);
        }
        ((Long) hVar2.c(new r50(hVar2, hVar, iVar, 7))).getClass();
        aVar.f41466a.V(iVar, 1, false);
        return null;
    }

    @Override
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f27769a) {
            case 1:
                jv0 jv0Var = (jv0) this.f27770b;
                ArrayList arrayList = (ArrayList) this.d;
                ((ai.t8) this.f27771c).F(arrayList);
                xc.a0(jv0Var.f25528v1).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("BotPreviewsDeleted", arrayList.size(), new Object[0])).j();
                jv0Var.L(false);
                return;
            case 4:
                boolean[] zArr = (boolean[]) this.f27770b;
                JsPromptResult jsPromptResult = (JsPromptResult) this.f27771c;
                bu buVar = (bu) this.d;
                if (!zArr[0]) {
                    zArr[0] = true;
                    jsPromptResult.confirm(buVar.getText().toString());
                    return;
                }
                return;
            default:
                rg.j0.P((rg.j0) this.f27770b, (ArrayList) this.f27771c, (TLRPC.User) this.d);
                return;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override
    public void run(boolean z10) {
        TLRPC.Chat chat = (TLRPC.Chat) this.f27770b;
        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f27771c;
        org.telegram.ui.Components.voip.f2.l(chat, null, true, null, n2Var.getParentActivity(), n2Var, (AccountInstance) this.d);
    }

    @Override
    public boolean u(org.telegram.ui.uy uyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, fg1 fg1Var) {
        return yh.y3.X((yh.y3) this.f27770b, (TL_stars.TL_starGiftUnique) this.f27771c, (org.telegram.ui.uy) this.d, arrayList);
    }
}
