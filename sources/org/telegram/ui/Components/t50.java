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
public final class t50 implements d5, org.telegram.ui.ActionBar.z1, ImageReceiver.ImageReceiverDelegate, MessagesStorage.BooleanCallback, t5.b, s5.f, e2.h, x2.m, org.telegram.ui.ky {
    public final int f28465a;
    public final Object f28466b;
    public final Object f28467c;
    public final Object d;

    public t50(Object obj, Object obj2, Object obj3, int i10) {
        this.f28465a = i10;
        this.f28466b = obj;
        this.f28467c = obj2;
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
        w50 w50Var = (w50) this.f28466b;
        r50 r50Var = (r50) this.f28467c;
        VideoEditedInfo videoEditedInfo = (VideoEditedInfo) this.d;
        d60 d60Var = w50Var.H0;
        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, w50Var.f29854a.getAbsolutePath(), 0, true, 0, 0, 0L);
        if (r50Var != null) {
            photoEntry.ttl = r50Var.f27832c;
            photoEntry.effectId = r50Var.d;
        }
        p50 p50Var = d60Var.f23569n;
        if (!z10 && r50Var != null && !r50Var.f27830a) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (i10 != 0) {
            i12 = i10;
        } else if (r50Var != null) {
            i12 = r50Var.f27831b;
        } else {
            i12 = 0;
        }
        if (i11 != 0) {
            i13 = i11;
        } else {
            i13 = 0;
        }
        if (r50Var != null) {
            j3 = r50Var.e;
        } else {
            j3 = 0;
        }
        p50Var.q(photoEntry, videoEditedInfo, z11, i12, i13, false, j3);
        d60Var.q(false, false);
    }

    @Override
    public boolean K(org.telegram.ui.qy qyVar) {
        return false;
    }

    @Override
    public void accept(Object obj) {
        ((u2.j0) obj).c(((a5.a) this.f28466b).f277b, (u2.f0) this.f28467c, (u2.b0) this.d);
    }

    @Override
    public java.lang.Object apply(java.lang.Object r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t50.apply(java.lang.Object):java.lang.Object");
    }

    @Override
    public e9.a1 b(int i10, b2.l1 l1Var, int[] iArr) {
        x2.i iVar = (x2.i) this.f28466b;
        String str = (String) this.f28467c;
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
        i21 i21Var = (i21) this.f28466b;
        np npVar = (np) this.f28467c;
        TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) this.d;
        ImageReceiver.BitmapHolder bitmapSafe = imageReceiver.getBitmapSafe();
        if (z10 && bitmapSafe != null && (bitmap = bitmapSafe.bitmap) != null) {
            Drawable drawable = npVar.f26861b;
            if (drawable instanceof nc0) {
                nc0 nc0Var = (nc0) drawable;
                TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
                if (wallPaperSettings != null && wallPaperSettings.intensity < 0) {
                    i10 = -100;
                } else {
                    i10 = 100;
                }
                nc0Var.t(i21.e(bitmap), i10);
                nc0Var.u(i21Var.L);
                i21Var.invalidate();
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f28465a) {
            case 1:
                kv0 kv0Var = (kv0) this.f28466b;
                ArrayList arrayList = (ArrayList) this.d;
                ((ai.u8) this.f28467c).F(arrayList);
                xc.a0(kv0Var.f25866v1).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("BotPreviewsDeleted", arrayList.size(), new Object[0])).j();
                kv0Var.L(false);
                return;
            case 4:
                boolean[] zArr = (boolean[]) this.f28466b;
                JsPromptResult jsPromptResult = (JsPromptResult) this.f28467c;
                du duVar = (du) this.d;
                if (!zArr[0]) {
                    zArr[0] = true;
                    jsPromptResult.confirm(duVar.getText().toString());
                    return;
                }
                return;
            default:
                rg.j0.P((rg.j0) this.f28466b, (ArrayList) this.f28467c, (TLRPC.User) this.d);
                return;
        }
    }

    @Override
    public Object i() {
        q5.a aVar = (q5.a) this.f28466b;
        l5.i iVar = (l5.i) this.f28467c;
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
        ((Long) hVar2.c(new t50(hVar2, hVar, iVar, 7))).getClass();
        aVar.f41452a.V(iVar, 1, false);
        return null;
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override
    public void run(boolean z10) {
        TLRPC.Chat chat = (TLRPC.Chat) this.f28466b;
        org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.f28467c;
        org.telegram.ui.Components.voip.g2.l(chat, null, true, null, m2Var.getParentActivity(), m2Var, (AccountInstance) this.d);
    }

    @Override
    public boolean u(org.telegram.ui.qy qyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, wf1 wf1Var) {
        return yh.x3.X((yh.x3) this.f28466b, (TL_stars.TL_starGiftUnique) this.f28467c, (org.telegram.ui.qy) this.d, arrayList);
    }
}
