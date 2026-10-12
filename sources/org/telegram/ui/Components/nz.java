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
import org.telegram.ui.lg1;
public final class nz implements MediaDataController.KeywordResultCallback, f5, org.telegram.ui.ActionBar.z1, ImageReceiver.ImageReceiverDelegate, MessagesStorage.BooleanCallback, t5.b, s5.e, e2.j, x2.k, org.telegram.ui.sy {
    public final int f27748a;
    public final Object f27749b;
    public final Object f27750c;
    public final Object d;

    public nz(Object obj, Object obj2, Object obj3, int i10) {
        this.f27748a = i10;
        this.f27749b = obj;
        this.f27750c = obj2;
        this.d = obj3;
    }

    @Override
    public boolean D() {
        return false;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        boolean z11;
        int i12;
        int i13;
        long j10;
        i60 i60Var = (i60) this.f27749b;
        d60 d60Var = (d60) this.f27750c;
        VideoEditedInfo videoEditedInfo = (VideoEditedInfo) this.d;
        p60 p60Var = i60Var.H0;
        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, i60Var.f25857a.getAbsolutePath(), 0, true, 0, 0, 0L);
        if (d60Var != null) {
            photoEntry.ttl = d60Var.f24306c;
            photoEntry.effectId = d60Var.d;
        }
        b60 b60Var = p60Var.f28182n;
        if (!z10 && d60Var != null && !d60Var.f24304a) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (i10 != 0) {
            i12 = i10;
        } else if (d60Var != null) {
            i12 = d60Var.f24305b;
        } else {
            i12 = 0;
        }
        if (i11 != 0) {
            i13 = i11;
        } else {
            i13 = 0;
        }
        if (d60Var != null) {
            j10 = d60Var.e;
        } else {
            j10 = 0;
        }
        b60Var.s(photoEntry, videoEditedInfo, z11, i12, i13, false, j10);
        p60Var.r(false, false);
    }

    @Override
    public boolean L(org.telegram.ui.yy yyVar) {
        return false;
    }

    @Override
    public e9.x1 a(int i10, b2.q1 q1Var, int[] iArr) {
        x2.i iVar = (x2.i) this.f27749b;
        String str = (String) this.f27750c;
        String str2 = (String) this.d;
        e9.k0 t10 = e9.n0.t();
        for (int i11 = 0; i11 < q1Var.f2291a; i11++) {
            t10.c(new x2.j(i10, q1Var, i11, iVar, iArr[i11], str, str2));
        }
        return t10.f();
    }

    @Override
    public void accept(Object obj) {
        ((u2.k0) obj).d(((a5.a) this.f27749b).f279b, (u2.g0) this.f27750c, (u2.c0) this.d);
    }

    @Override
    public java.lang.Object apply(java.lang.Object r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.nz.apply(java.lang.Object):java.lang.Object");
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        Bitmap bitmap;
        int i10;
        v21 v21Var = (v21) this.f27749b;
        yp ypVar = (yp) this.f27750c;
        TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) this.d;
        ImageReceiver.BitmapHolder bitmapSafe = imageReceiver.getBitmapSafe();
        if (z10 && bitmapSafe != null && (bitmap = bitmapSafe.bitmap) != null) {
            Drawable drawable = ypVar.f31669b;
            if (drawable instanceof cd0) {
                cd0 cd0Var = (cd0) drawable;
                TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
                if (wallPaperSettings != null && wallPaperSettings.intensity < 0) {
                    i10 = -100;
                } else {
                    i10 = 100;
                }
                cd0Var.t(v21.e(bitmap), i10);
                cd0Var.u(v21Var.L);
                v21Var.invalidate();
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.l5.a(this, i10, str, drawable);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f27748a) {
            case 2:
                xv0 xv0Var = (xv0) this.f27749b;
                ArrayList arrayList = (ArrayList) this.d;
                ((bi.f8) this.f27750c).F(arrayList);
                zc.a0(xv0Var.f31388v1).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("BotPreviewsDeleted", arrayList.size(), new Object[0])).j();
                xv0Var.L(false);
                return;
            case 5:
                boolean[] zArr = (boolean[]) this.f27749b;
                JsPromptResult jsPromptResult = (JsPromptResult) this.f27750c;
                nu nuVar = (nu) this.d;
                if (!zArr[0]) {
                    zArr[0] = true;
                    jsPromptResult.confirm(nuVar.getText().toString());
                    return;
                }
                return;
            default:
                sg.j0.Q((sg.j0) this.f27749b, (ArrayList) this.f27750c, (TLRPC.User) this.d);
                return;
        }
    }

    @Override
    public Object h() {
        q5.a aVar = (q5.a) this.f27749b;
        l5.i iVar = (l5.i) this.f27750c;
        l5.h hVar = (l5.h) this.d;
        s5.g gVar = (s5.g) aVar.d;
        gVar.getClass();
        i5.d dVar = iVar.f14582c;
        String str = hVar.f14576a;
        String str2 = iVar.f14580a;
        String c10 = w7.l6.c("SQLiteEventStore");
        if (Log.isLoggable(c10, 3)) {
            Log.d(c10, "Storing event with priority=" + dVar + ", name=" + str + " for destination " + str2);
        }
        ((Long) gVar.c(new nz(gVar, hVar, iVar, 7))).getClass();
        aVar.f43321a.U(iVar, 1, false);
        return null;
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.l5.b(this, imageReceiver);
    }

    @Override
    public void run(boolean z10) {
        TLRPC.Chat chat = (TLRPC.Chat) this.f27749b;
        org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.f27750c;
        org.telegram.ui.Components.voip.d2.l(chat, null, true, null, m2Var.getParentActivity(), m2Var, (AccountInstance) this.d);
    }

    @Override
    public boolean w(org.telegram.ui.yy yyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, lg1 lg1Var) {
        return zh.r3.Y((zh.r3) this.f27749b, (TL_stars.TL_starGiftUnique) this.f27750c, (org.telegram.ui.yy) this.d, arrayList);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        pz pzVar = (pz) this.f27749b;
        HashMap hashMap = (HashMap) this.f27750c;
        Runnable runnable = (Runnable) this.d;
        HashMap hashMap2 = pzVar.f28454f;
        if (pzVar.f28458w.M != pzVar.f28452b) {
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            String str2 = ((MediaDataController.KeywordResult) arrayList.get(i10)).emoji;
            ArrayList arrayList2 = (ArrayList) hashMap.get(str2);
            if (arrayList2 != null && !arrayList2.isEmpty() && !hashMap2.containsKey(arrayList2)) {
                hashMap2.put(arrayList2, str2);
                pzVar.h.add(arrayList2);
            }
        }
        runnable.run();
    }
}
