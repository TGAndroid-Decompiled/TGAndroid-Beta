package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.webkit.JsPromptResult;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ig1;
public final class f21 implements ImageReceiver.ImageReceiverDelegate, MessagesStorage.BooleanCallback, org.telegram.ui.ActionBar.c2, t5.b, s5.e, x2.m, org.telegram.ui.qy, MessagesStorage.StringCallback, zh.p7 {
    public final int f22825a;
    public final Object f22826b;
    public final Object f22827c;
    public final Object d;

    public f21(Object obj, Object obj2, Object obj3, int i10) {
        this.f22825a = i10;
        this.f22826b = obj;
        this.f22827c = obj2;
        this.d = obj3;
    }

    @Override
    public boolean A() {
        return false;
    }

    @Override
    public boolean J(org.telegram.ui.wy wyVar) {
        return false;
    }

    @Override
    public java.lang.Object apply(java.lang.Object r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.f21.apply(java.lang.Object):java.lang.Object");
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        Bitmap bitmap;
        int i10;
        i21 i21Var = (i21) this.f22826b;
        rp rpVar = (rp) this.f22827c;
        TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) this.d;
        ImageReceiver.BitmapHolder bitmapSafe = imageReceiver.getBitmapSafe();
        if (z10 && bitmapSafe != null && (bitmap = bitmapSafe.bitmap) != null) {
            Drawable drawable = rpVar.f26734b;
            if (drawable instanceof lc0) {
                lc0 lc0Var = (lc0) drawable;
                TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
                if (wallPaperSettings != null && wallPaperSettings.intensity < 0) {
                    i10 = -100;
                } else {
                    i10 = 100;
                }
                lc0Var.t(i21.e(bitmap), i10);
                lc0Var.u(i21Var.L);
                i21Var.invalidate();
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.m5.a(this, i10, str, drawable);
    }

    @Override
    public e9.a1 e(int i10, b2.l1 l1Var, int[] iArr) {
        x2.i iVar = (x2.i) this.f22826b;
        String str = (String) this.f22827c;
        String str2 = (String) this.d;
        e9.f0 u10 = e9.i0.u();
        for (int i11 = 0; i11 < l1Var.f1784a; i11++) {
            u10.b(new x2.l(i10, l1Var, i11, iVar, iArr[i11], str, str2));
        }
        return u10.i();
    }

    @Override
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f22825a) {
            case 2:
                boolean[] zArr = (boolean[]) this.f22826b;
                JsPromptResult jsPromptResult = (JsPromptResult) this.f22827c;
                fu fuVar = (fu) this.d;
                if (!zArr[0]) {
                    zArr[0] = true;
                    jsPromptResult.confirm(fuVar.getText().toString());
                    return;
                }
                return;
            default:
                qg.k0.P((qg.k0) this.f22826b, (ArrayList) this.f22827c, (TLRPC.User) this.d);
                return;
        }
    }

    @Override
    public Object g() {
        q5.a aVar = (q5.a) this.f22826b;
        l5.i iVar = (l5.i) this.f22827c;
        l5.h hVar = (l5.h) this.d;
        s5.g gVar = (s5.g) aVar.d;
        gVar.getClass();
        i5.d dVar = iVar.f12795c;
        String str = hVar.f12789a;
        String str2 = iVar.f12793a;
        String c10 = w7.i6.c("SQLiteEventStore");
        if (Log.isLoggable(c10, 3)) {
            Log.d(c10, "Storing event with priority=" + dVar + ", name=" + str + " for destination " + str2);
        }
        ((Long) gVar.c(new f21(gVar, hVar, iVar, 5))).getClass();
        aVar.f40541a.U(iVar, 1, false);
        return null;
    }

    @Override
    public void i(Canvas canvas, RectF rectF, float f7) {
        org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) this.f22826b;
        cl0 cl0Var = (cl0) this.f22827c;
        int[] iArr = (int[]) this.d;
        u7Var.c(canvas, rectF, f7);
        u7Var.f(canvas, rectF, f7);
        if (u7Var.h) {
            u7Var.b(canvas, rectF, f7);
        } else {
            u7Var.e(canvas, rectF, f7);
        }
        if (cl0Var != null && cl0Var.f22156a0 && cl0Var.getVisibility() == 0) {
            canvas.saveLayerAlpha(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), (int) (f7 * 255.0f), 31);
            canvas.translate(iArr[0], iArr[1]);
            cl0Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.m5.b(this, imageReceiver);
    }

    @Override
    public void run(boolean z10) {
        TLRPC.Chat chat = (TLRPC.Chat) this.f22826b;
        org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.f22827c;
        org.telegram.ui.Components.voip.e2.l(chat, null, true, null, p2Var.getParentActivity(), p2Var, (AccountInstance) this.d);
    }

    @Override
    public boolean v(org.telegram.ui.wy wyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, ig1 ig1Var) {
        return xh.x3.X((xh.x3) this.f22826b, (TL_stars.TL_starGiftUnique) this.f22827c, (org.telegram.ui.wy) this.d, arrayList);
    }

    @Override
    public void run(String str) {
        zh.v2 v2Var = (zh.v2) this.f22826b;
        zh.a3 a3Var = v2Var.f48986l;
        a3Var.getStoriesController().r(a3Var.B1, str, new h7(v2Var, (TL_stories.StoryItem) this.f22827c, (org.telegram.ui.ActionBar.f6) this.d, 11));
    }
}
