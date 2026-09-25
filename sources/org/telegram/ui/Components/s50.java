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
import org.telegram.ui.wf1;
public final class s50 implements d5, org.telegram.ui.ActionBar.z1, ImageReceiver.ImageReceiverDelegate, MessagesStorage.BooleanCallback, t5.b, s5.f, e2.h, x2.m, org.telegram.ui.ky {
    public final int f28155a;
    public final Object f28156b;
    public final Object f28157c;
    public final Object d;

    public s50(Object obj, Object obj2, Object obj3, int i10) {
        this.f28155a = i10;
        this.f28156b = obj;
        this.f28157c = obj2;
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
        v50 v50Var = (v50) this.f28156b;
        q50 q50Var = (q50) this.f28157c;
        VideoEditedInfo videoEditedInfo = (VideoEditedInfo) this.d;
        c60 c60Var = v50Var.H0;
        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, v50Var.f29008a.getAbsolutePath(), 0, true, 0, 0, 0L);
        if (q50Var != null) {
            photoEntry.ttl = q50Var.f27513c;
            photoEntry.effectId = q50Var.d;
        }
        o50 o50Var = c60Var.f23232n;
        if (!z10 && q50Var != null && !q50Var.f27511a) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (i10 != 0) {
            i12 = i10;
        } else if (q50Var != null) {
            i12 = q50Var.f27512b;
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
        c60Var.q(false, false);
    }

    @Override
    public boolean K(org.telegram.ui.qy qyVar) {
        return false;
    }

    @Override
    public void accept(Object obj) {
        ((u2.j0) obj).c(((a5.a) this.f28156b).f277b, (u2.f0) this.f28157c, (u2.b0) this.d);
    }

    @Override
    public java.lang.Object apply(java.lang.Object r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s50.apply(java.lang.Object):java.lang.Object");
    }

    @Override
    public e9.a1 b(int i10, b2.l1 l1Var, int[] iArr) {
        x2.i iVar = (x2.i) this.f28156b;
        String str = (String) this.f28157c;
        String str2 = (String) this.d;
        e9.f0 u10 = e9.i0.u();
        for (int i11 = 0; i11 < l1Var.f3083a; i11++) {
            u10.b(new x2.l(i10, l1Var, i11, iVar, iArr[i11], str, str2));
        }
        return u10.i();
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        Bitmap bitmap;
        int i10;
        h21 h21Var = (h21) this.f28156b;
        mp mpVar = (mp) this.f28157c;
        TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) this.d;
        ImageReceiver.BitmapHolder bitmapSafe = imageReceiver.getBitmapSafe();
        if (z10 && bitmapSafe != null && (bitmap = bitmapSafe.bitmap) != null) {
            Drawable drawable = mpVar.f26566b;
            if (drawable instanceof mc0) {
                mc0 mc0Var = (mc0) drawable;
                TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
                if (wallPaperSettings != null && wallPaperSettings.intensity < 0) {
                    i10 = -100;
                } else {
                    i10 = 100;
                }
                mc0Var.t(h21.e(bitmap), i10);
                mc0Var.u(h21Var.L);
                h21Var.invalidate();
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f28155a) {
            case 1:
                jv0 jv0Var = (jv0) this.f28156b;
                ArrayList arrayList = (ArrayList) this.d;
                ((ai.u8) this.f28157c).F(arrayList);
                xc.a0(jv0Var.f25560v1).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("BotPreviewsDeleted", arrayList.size(), new Object[0])).j();
                jv0Var.L(false);
                return;
            case 4:
                boolean[] zArr = (boolean[]) this.f28156b;
                JsPromptResult jsPromptResult = (JsPromptResult) this.f28157c;
                cu cuVar = (cu) this.d;
                if (!zArr[0]) {
                    zArr[0] = true;
                    jsPromptResult.confirm(cuVar.getText().toString());
                    return;
                }
                return;
            default:
                rg.j0.P((rg.j0) this.f28156b, (ArrayList) this.f28157c, (TLRPC.User) this.d);
                return;
        }
    }

    @Override
    public Object i() {
        q5.a aVar = (q5.a) this.f28156b;
        l5.i iVar = (l5.i) this.f28157c;
        l5.h hVar = (l5.h) this.d;
        s5.h hVar2 = (s5.h) aVar.d;
        hVar2.getClass();
        i5.d dVar = iVar.f14121c;
        String str = hVar.f14115a;
        String str2 = iVar.f14119a;
        String c10 = w7.g6.c("SQLiteEventStore");
        if (Log.isLoggable(c10, 3)) {
            Log.d(c10, "Storing event with priority=" + dVar + ", name=" + str + " for destination " + str2);
        }
        ((Long) hVar2.c(new s50(hVar2, hVar, iVar, 7))).getClass();
        aVar.f41454a.V(iVar, 1, false);
        return null;
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override
    public void run(boolean z10) {
        TLRPC.Chat chat = (TLRPC.Chat) this.f28156b;
        org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.f28157c;
        org.telegram.ui.Components.voip.g2.l(chat, null, true, null, m2Var.getParentActivity(), m2Var, (AccountInstance) this.d);
    }

    @Override
    public boolean u(org.telegram.ui.qy qyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, wf1 wf1Var) {
        return yh.x3.X((yh.x3) this.f28156b, (TL_stars.TL_starGiftUnique) this.f28157c, (org.telegram.ui.qy) this.d, arrayList);
    }
}
