package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.webkit.JsPromptResult;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class hq0 implements org.telegram.ui.ActionBar.b2, ImageReceiver.ImageReceiverDelegate, MessagesStorage.BooleanCallback, sk {
    public final int f29172a;
    public final Object f29173b;
    public final Object f29174c;
    public final Object d;

    public hq0(Object obj, Object obj2, Object obj3, int i9) {
        this.f29172a = i9;
        this.f29173b = obj;
        this.f29174c = obj2;
        this.d = obj3;
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i9, boolean z10, int i10, long j10) {
        switch (this.f29172a) {
            case 4:
                qh.p pVar = (qh.p) this.f29173b;
                qh.a aVar = (qh.a) this.f29174c;
                ki kiVar = (ki) this.d;
                qh.o3 o3Var = pVar.f46606r;
                if (messageMedia != null && messageMedia.geo != null) {
                    qh.b2 b2Var = o3Var.F3;
                    if (b2Var != null) {
                        b2Var.d();
                    }
                    TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) aVar.f46269b;
                    pageblockmap.geo = messageMedia.geo;
                    pageblockmap.zoom = 15;
                    if (pageblockmap.f22603w <= 0 || pageblockmap.h <= 0) {
                        pageblockmap.f22603w = 600;
                        pageblockmap.h = 400;
                    }
                    qh.b2 b2Var2 = o3Var.F3;
                    if (b2Var2 != null) {
                        b2Var2.h();
                    }
                    pVar.U(true);
                    kiVar.dismiss(true);
                    o3Var.post(new qh.f(pVar, aVar, 0));
                    return;
                }
                return;
            default:
                qh.x1 x1Var = (qh.x1) this.f29173b;
                qh.a aVar2 = (qh.a) this.f29174c;
                ki kiVar2 = (ki) this.d;
                if (messageMedia != null && messageMedia.geo != null) {
                    qh.b2 b2Var3 = x1Var.L.F3;
                    if (b2Var3 != null) {
                        b2Var3.d();
                    }
                    TL_iv.pageBlockMap pageblockmap2 = (TL_iv.pageBlockMap) aVar2.f46269b;
                    pageblockmap2.geo = messageMedia.geo;
                    pageblockmap2.zoom = 15;
                    if (pageblockmap2.f22603w <= 0 || pageblockmap2.h <= 0) {
                        pageblockmap2.f22603w = 600;
                        pageblockmap2.h = 400;
                    }
                    qh.b2 b2Var4 = x1Var.L.F3;
                    if (b2Var4 != null) {
                        b2Var4.h();
                    }
                    kiVar2.dismiss(true);
                    x1Var.L.post(new qh.i1(x1Var, aVar2, 9));
                    return;
                }
                return;
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        Bitmap bitmap;
        int i9;
        a11 a11Var = (a11) this.f29173b;
        bp bpVar = (bp) this.f29174c;
        TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) this.d;
        ImageReceiver.BitmapHolder bitmapSafe = imageReceiver.getBitmapSafe();
        if (z10 && bitmapSafe != null && (bitmap = bitmapSafe.bitmap) != null) {
            Drawable drawable = bpVar.f27262b;
            if (drawable instanceof jb0) {
                jb0 jb0Var = (jb0) drawable;
                TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
                if (wallPaperSettings != null && wallPaperSettings.intensity < 0) {
                    i9 = -100;
                } else {
                    i9 = 100;
                }
                jb0Var.t(a11.e(bitmap), i9);
                jb0Var.u(a11Var.H);
                a11Var.invalidate();
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i9, String str, Drawable drawable) {
        org.telegram.messenger.g5.a(this, i9, str, drawable);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.f29172a) {
            case 0:
                eu0 eu0Var = (eu0) this.f29173b;
                ArrayList arrayList = (ArrayList) this.d;
                ((ih.f6) this.f29174c).F(arrayList);
                oc.a0(eu0Var.f28160r1).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("BotPreviewsDeleted", arrayList.size(), new Object[0])).j();
                eu0Var.L(false);
                return;
            case 3:
                boolean[] zArr = (boolean[]) this.f29173b;
                JsPromptResult jsPromptResult = (JsPromptResult) this.f29174c;
                mt mtVar = (mt) this.d;
                if (!zArr[0]) {
                    zArr[0] = true;
                    jsPromptResult.confirm(mtVar.getText().toString());
                    return;
                }
                return;
            case 6:
                qh.v3 v3Var = (qh.v3) this.d;
                String trim = ((EditTextBoldCursor) this.f29173b).getText().toString().trim();
                String trim2 = ((EditTextBoldCursor) this.f29174c).getText().toString().trim();
                if (!TextUtils.isEmpty(trim) && !TextUtils.isEmpty(trim2)) {
                    int i10 = v3Var.f46758a;
                    qh.l3 l3Var = v3Var.f46759b;
                    switch (i10) {
                        case 1:
                            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = new TL_keyboard.TL_inlineButtonTypeUrl();
                            tL_inlineButtonTypeUrl.url = trim2;
                            l3Var.a(trim, tL_inlineButtonTypeUrl);
                            return;
                        default:
                            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = new TL_keyboard.TL_inlineButtonTypeCopy();
                            tL_inlineButtonTypeCopy.copy_text = trim2;
                            l3Var.a(trim, tL_inlineButtonTypeCopy);
                            return;
                    }
                }
                return;
            default:
                zf.j0.O((zf.j0) this.f29173b, (ArrayList) this.d, (TLRPC.User) this.f29174c);
                return;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.g5.b(this, imageReceiver);
    }

    @Override
    public void run(boolean z10) {
        TLRPC.Chat chat = (TLRPC.Chat) this.f29173b;
        org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.f29174c;
        org.telegram.ui.Components.voip.e2.m(chat, null, true, null, o2Var.getParentActivity(), o2Var, (AccountInstance) this.d);
    }

    public hq0(zf.j0 j0Var, ArrayList arrayList, TLRPC.User user) {
        this.f29172a = 7;
        this.f29173b = j0Var;
        this.d = arrayList;
        this.f29174c = user;
    }
}
