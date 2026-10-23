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
public final class ry implements MediaDataController.KeywordResultCallback, e5, org.telegram.ui.ActionBar.a2, ImageReceiver.ImageReceiverDelegate, MessagesStorage.BooleanCallback, t5.b, s5.e, e2.j, x2.k {
    public final int f30059a;
    public final Object f30060b;
    public final Object f30061c;
    public final Object d;

    public ry(Object obj, Object obj2, Object obj3, int i10) {
        this.f30059a = i10;
        this.f30061c = obj;
        this.d = obj2;
        this.f30060b = obj3;
    }

    @Override
    public void C(int i10, int i11, boolean z10) {
        boolean z11;
        int i12;
        int i13;
        long j10;
        f60 f60Var = (f60) this.f30061c;
        a60 a60Var = (a60) this.d;
        VideoEditedInfo videoEditedInfo = (VideoEditedInfo) this.f30060b;
        m60 m60Var = f60Var.H0;
        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, f60Var.f26096a.getAbsolutePath(), 0, true, 0, 0, 0L);
        if (a60Var != null) {
            photoEntry.ttl = a60Var.f24530c;
            photoEntry.effectId = a60Var.d;
        }
        y50 y50Var = m60Var.f28425n;
        if (!z10 && a60Var != null && !a60Var.f24528a) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (i10 != 0) {
            i12 = i10;
        } else if (a60Var != null) {
            i12 = a60Var.f24529b;
        } else {
            i12 = 0;
        }
        if (i11 != 0) {
            i13 = i11;
        } else {
            i13 = 0;
        }
        if (a60Var != null) {
            j10 = a60Var.e;
        } else {
            j10 = 0;
        }
        y50Var.s(photoEntry, videoEditedInfo, z11, i12, i13, false, j10);
        m60Var.r(false, false);
    }

    @Override
    public void accept(Object obj) {
        ((u2.l0) obj).d(((a5.a) this.f30061c).f281b, (u2.g0) this.d, (u2.c0) this.f30060b);
    }

    @Override
    public java.lang.Object apply(java.lang.Object r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ry.apply(java.lang.Object):java.lang.Object");
    }

    @Override
    public e9.x1 b(int i10, b2.p1 p1Var, int[] iArr) {
        x2.i iVar = (x2.i) this.f30061c;
        String str = (String) this.d;
        String str2 = (String) this.f30060b;
        e9.k0 t10 = e9.n0.t();
        for (int i11 = 0; i11 < p1Var.f3900a; i11++) {
            t10.c(new x2.j(i10, p1Var, i11, iVar, iArr[i11], str, str2));
        }
        return t10.f();
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        Bitmap bitmap;
        int i10;
        r21 r21Var = (r21) this.f30061c;
        vp vpVar = (vp) this.d;
        TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) this.f30060b;
        ImageReceiver.BitmapHolder bitmapSafe = imageReceiver.getBitmapSafe();
        if (z10 && bitmapSafe != null && (bitmap = bitmapSafe.bitmap) != null) {
            Drawable drawable = vpVar.f31855b;
            if (drawable instanceof wc0) {
                wc0 wc0Var = (wc0) drawable;
                TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
                if (wallPaperSettings != null && wallPaperSettings.intensity < 0) {
                    i10 = -100;
                } else {
                    i10 = 100;
                }
                wc0Var.s(r21.e(bitmap), i10);
                wc0Var.t(r21Var.L);
                r21Var.invalidate();
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.m5.a(this, i10, str, drawable);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f30059a) {
            case 3:
                uv0 uv0Var = (uv0) this.f30061c;
                ArrayList arrayList = (ArrayList) this.f30060b;
                ((ci.t6) this.d).F(arrayList);
                xc.a0(uv0Var.f31075v1).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("BotPreviewsDeleted", arrayList.size(), new Object[0])).j();
                uv0Var.L(false);
                return;
            case 6:
                boolean[] zArr = (boolean[]) this.f30061c;
                JsPromptResult jsPromptResult = (JsPromptResult) this.d;
                iu iuVar = (iu) this.f30060b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    jsPromptResult.confirm(iuVar.getText().toString());
                    return;
                }
                return;
            default:
                sg.k0.Q((sg.k0) this.f30061c, (ArrayList) this.d, (TLRPC.User) this.f30060b);
                return;
        }
    }

    @Override
    public Object j() {
        q5.a aVar = (q5.a) this.f30061c;
        l5.i iVar = (l5.i) this.d;
        l5.h hVar = (l5.h) this.f30060b;
        s5.g gVar = (s5.g) aVar.d;
        gVar.getClass();
        i5.d dVar = iVar.f15922c;
        String str = hVar.f15916a;
        String str2 = iVar.f15920a;
        String c10 = w7.i6.c("SQLiteEventStore");
        if (Log.isLoggable(c10, 3)) {
            Log.d(c10, "Storing event with priority=" + dVar + ", name=" + str + " for destination " + str2);
        }
        ((Long) gVar.c(new ry(gVar, hVar, iVar, 8))).getClass();
        aVar.f44417a.U(iVar, 1, false);
        return null;
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.m5.b(this, imageReceiver);
    }

    @Override
    public void run(boolean z10) {
        TLRPC.Chat chat = (TLRPC.Chat) this.f30061c;
        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.d;
        org.telegram.ui.Components.voip.d2.l(chat, null, true, null, n2Var.getParentActivity(), n2Var, (AccountInstance) this.f30060b);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        switch (this.f30059a) {
            case 0:
                Runnable runnable = (Runnable) this.f30060b;
                ty tyVar = ((sy) this.f30061c).f30377a;
                if (((String) this.d).equals(tyVar.v)) {
                    tyVar.f30715w = str;
                    tyVar.f30712n.addAll(arrayList);
                    runnable.run();
                    return;
                }
                return;
            default:
                mz mzVar = (mz) this.f30061c;
                HashMap hashMap = (HashMap) this.d;
                Runnable runnable2 = (Runnable) this.f30060b;
                HashMap hashMap2 = mzVar.f28636f;
                if (mzVar.f28640w.M != mzVar.f28634b) {
                    return;
                }
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    String str2 = ((MediaDataController.KeywordResult) arrayList.get(i10)).emoji;
                    ArrayList arrayList2 = (ArrayList) hashMap.get(str2);
                    if (arrayList2 != null && !arrayList2.isEmpty() && !hashMap2.containsKey(arrayList2)) {
                        hashMap2.put(arrayList2, str2);
                        mzVar.h.add(arrayList2);
                    }
                }
                runnable2.run();
                return;
        }
    }
}
