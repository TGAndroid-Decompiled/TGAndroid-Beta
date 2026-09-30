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
public final class v50 implements d5, org.telegram.ui.ActionBar.z1, ImageReceiver.ImageReceiverDelegate, MessagesStorage.BooleanCallback, t5.b, s5.f, e2.h, x2.m, org.telegram.ui.ky {
    public final int f29040a;
    public final Object f29041b;
    public final Object f29042c;
    public final Object d;

    public v50(Object obj, Object obj2, Object obj3, int i10) {
        this.f29040a = i10;
        this.f29041b = obj;
        this.f29042c = obj2;
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
        y50 y50Var = (y50) this.f29041b;
        t50 t50Var = (t50) this.f29042c;
        VideoEditedInfo videoEditedInfo = (VideoEditedInfo) this.d;
        f60 f60Var = y50Var.H0;
        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, y50Var.f30596a.getAbsolutePath(), 0, true, 0, 0, 0L);
        if (t50Var != null) {
            photoEntry.ttl = t50Var.f28426c;
            photoEntry.effectId = t50Var.d;
        }
        r50 r50Var = f60Var.f24201n;
        if (!z10 && t50Var != null && !t50Var.f28424a) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (i10 != 0) {
            i12 = i10;
        } else if (t50Var != null) {
            i12 = t50Var.f28425b;
        } else {
            i12 = 0;
        }
        if (i11 != 0) {
            i13 = i11;
        } else {
            i13 = 0;
        }
        if (t50Var != null) {
            j3 = t50Var.e;
        } else {
            j3 = 0;
        }
        r50Var.q(photoEntry, videoEditedInfo, z11, i12, i13, false, j3);
        f60Var.q(false, false);
    }

    @Override
    public boolean K(org.telegram.ui.qy qyVar) {
        return false;
    }

    @Override
    public void accept(Object obj) {
        ((u2.j0) obj).c(((a5.a) this.f29041b).f277b, (u2.f0) this.f29042c, (u2.b0) this.d);
    }

    @Override
    public java.lang.Object apply(java.lang.Object r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.v50.apply(java.lang.Object):java.lang.Object");
    }

    @Override
    public e9.a1 b(int i10, b2.l1 l1Var, int[] iArr) {
        x2.i iVar = (x2.i) this.f29041b;
        String str = (String) this.f29042c;
        String str2 = (String) this.d;
        e9.f0 u10 = e9.i0.u();
        for (int i11 = 0; i11 < l1Var.f3090a; i11++) {
            u10.b(new x2.l(i10, l1Var, i11, iVar, iArr[i11], str, str2));
        }
        return u10.i();
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        Bitmap bitmap;
        int i10;
        k21 k21Var = (k21) this.f29041b;
        op opVar = (op) this.f29042c;
        TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) this.d;
        ImageReceiver.BitmapHolder bitmapSafe = imageReceiver.getBitmapSafe();
        if (z10 && bitmapSafe != null && (bitmap = bitmapSafe.bitmap) != null) {
            Drawable drawable = opVar.f27161b;
            if (drawable instanceof pc0) {
                pc0 pc0Var = (pc0) drawable;
                TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
                if (wallPaperSettings != null && wallPaperSettings.intensity < 0) {
                    i10 = -100;
                } else {
                    i10 = 100;
                }
                pc0Var.t(k21.e(bitmap), i10);
                pc0Var.u(k21Var.L);
                k21Var.invalidate();
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f29040a) {
            case 1:
                mv0 mv0Var = (mv0) this.f29041b;
                ArrayList arrayList = (ArrayList) this.d;
                ((ai.u8) this.f29042c).F(arrayList);
                yc.a0(mv0Var.f26449v1).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("BotPreviewsDeleted", arrayList.size(), new Object[0])).j();
                mv0Var.L(false);
                return;
            case 4:
                boolean[] zArr = (boolean[]) this.f29041b;
                JsPromptResult jsPromptResult = (JsPromptResult) this.f29042c;
                eu euVar = (eu) this.d;
                if (!zArr[0]) {
                    zArr[0] = true;
                    jsPromptResult.confirm(euVar.getText().toString());
                    return;
                }
                return;
            default:
                rg.j0.P((rg.j0) this.f29041b, (ArrayList) this.f29042c, (TLRPC.User) this.d);
                return;
        }
    }

    @Override
    public Object i() {
        q5.a aVar = (q5.a) this.f29041b;
        l5.i iVar = (l5.i) this.f29042c;
        l5.h hVar = (l5.h) this.d;
        s5.h hVar2 = (s5.h) aVar.d;
        hVar2.getClass();
        i5.d dVar = iVar.f14137c;
        String str = hVar.f14131a;
        String str2 = iVar.f14135a;
        String c10 = w7.g6.c("SQLiteEventStore");
        if (Log.isLoggable(c10, 3)) {
            Log.d(c10, "Storing event with priority=" + dVar + ", name=" + str + " for destination " + str2);
        }
        ((Long) hVar2.c(new v50(hVar2, hVar, iVar, 7))).getClass();
        aVar.f41552a.V(iVar, 1, false);
        return null;
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override
    public void run(boolean z10) {
        TLRPC.Chat chat = (TLRPC.Chat) this.f29041b;
        org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.f29042c;
        org.telegram.ui.Components.voip.g2.l(chat, null, true, null, m2Var.getParentActivity(), m2Var, (AccountInstance) this.d);
    }

    @Override
    public boolean u(org.telegram.ui.qy qyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, wf1 wf1Var) {
        return yh.x3.X((yh.x3) this.f29041b, (TL_stars.TL_starGiftUnique) this.f29042c, (org.telegram.ui.qy) this.d, arrayList);
    }
}
