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
public final class s50 implements b5, org.telegram.ui.ActionBar.a2, ImageReceiver.ImageReceiverDelegate, MessagesStorage.BooleanCallback, t5.b, s5.e, x2.m, org.telegram.ui.oy {
    public final int f27775a;
    public final Object f27776b;
    public final Object f27777c;
    public final Object d;

    public s50(Object obj, Object obj2, Object obj3, int i10) {
        this.f27775a = i10;
        this.f27776b = obj;
        this.f27777c = obj2;
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
        v50 v50Var = (v50) this.f27776b;
        q50 q50Var = (q50) this.f27777c;
        VideoEditedInfo videoEditedInfo = (VideoEditedInfo) this.d;
        w50 w50Var = v50Var.H0;
        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, v50Var.f28600a.getAbsolutePath(), 0, true, 0, 0, 0L);
        if (q50Var != null) {
            photoEntry.ttl = q50Var.f27253c;
            photoEntry.effectId = q50Var.d;
        }
        o50 o50Var = w50Var.f29577c;
        if (!z10 && q50Var != null && !q50Var.f27251a) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (i10 != 0) {
            i12 = i10;
        } else if (q50Var != null) {
            i12 = q50Var.f27252b;
        } else {
            i12 = 0;
        }
        if (i11 != 0) {
            i13 = i11;
        } else {
            i13 = 0;
        }
        if (q50Var != null) {
            j3 = q50Var.e;
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
        x2.i iVar = (x2.i) this.f27776b;
        String str = (String) this.f27777c;
        String str2 = (String) this.d;
        e9.f0 u10 = e9.i0.u();
        for (int i11 = 0; i11 < l1Var.f3088a; i11++) {
            u10.b(new x2.l(i10, l1Var, i11, iVar, iArr[i11], str, str2));
        }
        return u10.i();
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        Bitmap bitmap;
        int i10;
        u11 u11Var = (u11) this.f27776b;
        lp lpVar = (lp) this.f27777c;
        TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) this.d;
        ImageReceiver.BitmapHolder bitmapSafe = imageReceiver.getBitmapSafe();
        if (z10 && bitmapSafe != null && (bitmap = bitmapSafe.bitmap) != null) {
            Drawable drawable = lpVar.f25998b;
            if (drawable instanceof cc0) {
                cc0 cc0Var = (cc0) drawable;
                TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
                if (wallPaperSettings != null && wallPaperSettings.intensity < 0) {
                    i10 = -100;
                } else {
                    i10 = 100;
                }
                cc0Var.t(u11.e(bitmap), i10);
                cc0Var.u(u11Var.L);
                u11Var.invalidate();
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f27775a) {
            case 1:
                yu0 yu0Var = (yu0) this.f27776b;
                ArrayList arrayList = (ArrayList) this.d;
                ((ai.t8) this.f27777c).F(arrayList);
                vc.a0(yu0Var.f30389v1).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("BotPreviewsDeleted", arrayList.size(), new Object[0])).j();
                yu0Var.L(false);
                return;
            case 4:
                boolean[] zArr = (boolean[]) this.f27776b;
                JsPromptResult jsPromptResult = (JsPromptResult) this.f27777c;
                bu buVar = (bu) this.d;
                if (!zArr[0]) {
                    zArr[0] = true;
                    jsPromptResult.confirm(buVar.getText().toString());
                    return;
                }
                return;
            default:
                rg.j0.P((rg.j0) this.f27776b, (ArrayList) this.f27777c, (TLRPC.User) this.d);
                return;
        }
    }

    @Override
    public Object i() {
        q5.a aVar = (q5.a) this.f27776b;
        l5.i iVar = (l5.i) this.f27777c;
        l5.h hVar = (l5.h) this.d;
        s5.g gVar = (s5.g) aVar.d;
        gVar.getClass();
        i5.d dVar = iVar.f13897c;
        String str = hVar.f13891a;
        String str2 = iVar.f13895a;
        String c10 = w7.f6.c("SQLiteEventStore");
        if (Log.isLoggable(c10, 3)) {
            Log.d(c10, "Storing event with priority=" + dVar + ", name=" + str + " for destination " + str2);
        }
        ((Long) gVar.c(new s50(gVar, hVar, iVar, 7))).getClass();
        aVar.f41160a.V(iVar, 1, false);
        return null;
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override
    public void run(boolean z10) {
        TLRPC.Chat chat = (TLRPC.Chat) this.f27776b;
        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f27777c;
        org.telegram.ui.Components.voip.f2.l(chat, null, true, null, n2Var.getParentActivity(), n2Var, (AccountInstance) this.d);
    }

    @Override
    public boolean u(org.telegram.ui.uy uyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, eg1 eg1Var) {
        return yh.z3.X((yh.z3) this.f27776b, (TL_stars.TL_starGiftUnique) this.f27777c, (org.telegram.ui.uy) this.d, arrayList);
    }
}
