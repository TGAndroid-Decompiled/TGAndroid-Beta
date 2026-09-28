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
public final class u50 implements d5, org.telegram.ui.ActionBar.z1, ImageReceiver.ImageReceiverDelegate, MessagesStorage.BooleanCallback, t5.b, s5.f, e2.h, x2.m, org.telegram.ui.ky {
    public final int f28746a;
    public final Object f28747b;
    public final Object f28748c;
    public final Object d;

    public u50(Object obj, Object obj2, Object obj3, int i10) {
        this.f28746a = i10;
        this.f28747b = obj;
        this.f28748c = obj2;
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
        x50 x50Var = (x50) this.f28747b;
        s50 s50Var = (s50) this.f28748c;
        VideoEditedInfo videoEditedInfo = (VideoEditedInfo) this.d;
        e60 e60Var = x50Var.H0;
        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, x50Var.f30252a.getAbsolutePath(), 0, true, 0, 0, 0L);
        if (s50Var != null) {
            photoEntry.ttl = s50Var.f28129c;
            photoEntry.effectId = s50Var.d;
        }
        q50 q50Var = e60Var.f23903n;
        if (!z10 && s50Var != null && !s50Var.f28127a) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (i10 != 0) {
            i12 = i10;
        } else if (s50Var != null) {
            i12 = s50Var.f28128b;
        } else {
            i12 = 0;
        }
        if (i11 != 0) {
            i13 = i11;
        } else {
            i13 = 0;
        }
        if (s50Var != null) {
            j3 = s50Var.e;
        } else {
            j3 = 0;
        }
        q50Var.q(photoEntry, videoEditedInfo, z11, i12, i13, false, j3);
        e60Var.q(false, false);
    }

    @Override
    public boolean K(org.telegram.ui.qy qyVar) {
        return false;
    }

    @Override
    public void accept(Object obj) {
        ((u2.j0) obj).c(((a5.a) this.f28747b).f277b, (u2.f0) this.f28748c, (u2.b0) this.d);
    }

    @Override
    public java.lang.Object apply(java.lang.Object r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.u50.apply(java.lang.Object):java.lang.Object");
    }

    @Override
    public e9.a1 b(int i10, b2.l1 l1Var, int[] iArr) {
        x2.i iVar = (x2.i) this.f28747b;
        String str = (String) this.f28748c;
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
        j21 j21Var = (j21) this.f28747b;
        np npVar = (np) this.f28748c;
        TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) this.d;
        ImageReceiver.BitmapHolder bitmapSafe = imageReceiver.getBitmapSafe();
        if (z10 && bitmapSafe != null && (bitmap = bitmapSafe.bitmap) != null) {
            Drawable drawable = npVar.f26845b;
            if (drawable instanceof oc0) {
                oc0 oc0Var = (oc0) drawable;
                TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
                if (wallPaperSettings != null && wallPaperSettings.intensity < 0) {
                    i10 = -100;
                } else {
                    i10 = 100;
                }
                oc0Var.t(j21.e(bitmap), i10);
                oc0Var.u(j21Var.L);
                j21Var.invalidate();
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f28746a) {
            case 1:
                lv0 lv0Var = (lv0) this.f28747b;
                ArrayList arrayList = (ArrayList) this.d;
                ((ai.u8) this.f28748c).F(arrayList);
                xc.a0(lv0Var.f26160v1).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("BotPreviewsDeleted", arrayList.size(), new Object[0])).j();
                lv0Var.L(false);
                return;
            case 4:
                boolean[] zArr = (boolean[]) this.f28747b;
                JsPromptResult jsPromptResult = (JsPromptResult) this.f28748c;
                du duVar = (du) this.d;
                if (!zArr[0]) {
                    zArr[0] = true;
                    jsPromptResult.confirm(duVar.getText().toString());
                    return;
                }
                return;
            default:
                rg.j0.P((rg.j0) this.f28747b, (ArrayList) this.f28748c, (TLRPC.User) this.d);
                return;
        }
    }

    @Override
    public Object i() {
        q5.a aVar = (q5.a) this.f28747b;
        l5.i iVar = (l5.i) this.f28748c;
        l5.h hVar = (l5.h) this.d;
        s5.h hVar2 = (s5.h) aVar.d;
        hVar2.getClass();
        i5.d dVar = iVar.f14122c;
        String str = hVar.f14116a;
        String str2 = iVar.f14120a;
        String c10 = w7.g6.c("SQLiteEventStore");
        if (Log.isLoggable(c10, 3)) {
            Log.d(c10, "Storing event with priority=" + dVar + ", name=" + str + " for destination " + str2);
        }
        ((Long) hVar2.c(new u50(hVar2, hVar, iVar, 7))).getClass();
        aVar.f41454a.V(iVar, 1, false);
        return null;
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override
    public void run(boolean z10) {
        TLRPC.Chat chat = (TLRPC.Chat) this.f28747b;
        org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.f28748c;
        org.telegram.ui.Components.voip.g2.l(chat, null, true, null, m2Var.getParentActivity(), m2Var, (AccountInstance) this.d);
    }

    @Override
    public boolean u(org.telegram.ui.qy qyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, wf1 wf1Var) {
        return yh.x3.X((yh.x3) this.f28747b, (TL_stars.TL_starGiftUnique) this.f28748c, (org.telegram.ui.qy) this.d, arrayList);
    }
}
