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
public final class t50 implements d5, org.telegram.ui.ActionBar.a2, ImageReceiver.ImageReceiverDelegate, MessagesStorage.BooleanCallback, t5.b, s5.e, e2.h, x2.m, org.telegram.ui.ly {
    public final int f28092a;
    public final Object f28093b;
    public final Object f28094c;
    public final Object d;

    public t50(Object obj, Object obj2, Object obj3, int i10) {
        this.f28092a = i10;
        this.f28093b = obj;
        this.f28094c = obj2;
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
        w50 w50Var = (w50) this.f28093b;
        r50 r50Var = (r50) this.f28094c;
        VideoEditedInfo videoEditedInfo = (VideoEditedInfo) this.d;
        x50 x50Var = w50Var.H0;
        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, w50Var.f29516a.getAbsolutePath(), 0, true, 0, 0, 0L);
        if (r50Var != null) {
            photoEntry.ttl = r50Var.f27558c;
            photoEntry.effectId = r50Var.d;
        }
        p50 p50Var = x50Var.f29894c;
        if (!z10 && r50Var != null && !r50Var.f27556a) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (i10 != 0) {
            i12 = i10;
        } else if (r50Var != null) {
            i12 = r50Var.f27557b;
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
        x50Var.m(false, false);
    }

    @Override
    public boolean K(org.telegram.ui.ry ryVar) {
        return false;
    }

    @Override
    public void accept(Object obj) {
        ((u2.j0) obj).c(((a5.a) this.f28093b).f277b, (u2.f0) this.f28094c, (u2.b0) this.d);
    }

    @Override
    public java.lang.Object apply(java.lang.Object r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t50.apply(java.lang.Object):java.lang.Object");
    }

    @Override
    public e9.a1 b(int i10, b2.l1 l1Var, int[] iArr) {
        x2.i iVar = (x2.i) this.f28093b;
        String str = (String) this.f28094c;
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
        t11 t11Var = (t11) this.f28093b;
        mp mpVar = (mp) this.f28094c;
        TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) this.d;
        ImageReceiver.BitmapHolder bitmapSafe = imageReceiver.getBitmapSafe();
        if (z10 && bitmapSafe != null && (bitmap = bitmapSafe.bitmap) != null) {
            Drawable drawable = mpVar.f26254b;
            if (drawable instanceof bc0) {
                bc0 bc0Var = (bc0) drawable;
                TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
                if (wallPaperSettings != null && wallPaperSettings.intensity < 0) {
                    i10 = -100;
                } else {
                    i10 = 100;
                }
                bc0Var.t(t11.e(bitmap), i10);
                bc0Var.u(t11Var.L);
                t11Var.invalidate();
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f28092a) {
            case 1:
                yu0 yu0Var = (yu0) this.f28093b;
                ArrayList arrayList = (ArrayList) this.d;
                ((ai.u8) this.f28094c).F(arrayList);
                xc.a0(yu0Var.f30450v1).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("BotPreviewsDeleted", arrayList.size(), new Object[0])).j();
                yu0Var.L(false);
                return;
            case 4:
                boolean[] zArr = (boolean[]) this.f28093b;
                JsPromptResult jsPromptResult = (JsPromptResult) this.f28094c;
                cu cuVar = (cu) this.d;
                if (!zArr[0]) {
                    zArr[0] = true;
                    jsPromptResult.confirm(cuVar.getText().toString());
                    return;
                }
                return;
            default:
                rg.j0.P((rg.j0) this.f28093b, (ArrayList) this.f28094c, (TLRPC.User) this.d);
                return;
        }
    }

    @Override
    public Object i() {
        q5.a aVar = (q5.a) this.f28093b;
        l5.i iVar = (l5.i) this.f28094c;
        l5.h hVar = (l5.h) this.d;
        s5.g gVar = (s5.g) aVar.d;
        gVar.getClass();
        i5.d dVar = iVar.f13885c;
        String str = hVar.f13879a;
        String str2 = iVar.f13883a;
        String c10 = w7.f6.c("SQLiteEventStore");
        if (Log.isLoggable(c10, 3)) {
            Log.d(c10, "Storing event with priority=" + dVar + ", name=" + str + " for destination " + str2);
        }
        ((Long) gVar.c(new t50(gVar, hVar, iVar, 7))).getClass();
        aVar.f41116a.V(iVar, 1, false);
        return null;
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override
    public void run(boolean z10) {
        TLRPC.Chat chat = (TLRPC.Chat) this.f28093b;
        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f28094c;
        org.telegram.ui.Components.voip.f2.l(chat, null, true, null, n2Var.getParentActivity(), n2Var, (AccountInstance) this.d);
    }

    @Override
    public boolean u(org.telegram.ui.ry ryVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, wf1 wf1Var) {
        return yh.y3.X((yh.y3) this.f28093b, (TL_stars.TL_starGiftUnique) this.f28094c, (org.telegram.ui.ry) this.d, arrayList);
    }
}
