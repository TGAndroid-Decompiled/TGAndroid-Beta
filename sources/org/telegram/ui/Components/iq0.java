package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.webkit.JsPromptResult;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

public final class iq0 implements org.telegram.ui.ActionBar.a2, ImageReceiver.ImageReceiverDelegate, MessagesStorage.BooleanCallback, ok {

    public final int f29465a;

    public final Object f29466b;

    public final Object f29467c;
    public final Object d;

    public iq0(Object obj, Object obj2, Object obj3, int i10) {
        this.f29465a = i10;
        this.f29466b = obj;
        this.f29467c = obj2;
        this.d = obj3;
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        switch (this.f29465a) {
            case 5:
                rh.p pVar = (rh.p) this.f29466b;
                rh.a aVar = (rh.a) this.f29467c;
                gi giVar = (gi) this.d;
                rh.p3 p3Var = pVar.f47324r;
                if (messageMedia != null && messageMedia.geo != null) {
                    rh.b2 b2Var = p3Var.F3;
                    if (b2Var != null) {
                        b2Var.d();
                    }
                    TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) aVar.f47028b;
                    pageblockmap.geo = messageMedia.geo;
                    pageblockmap.zoom = 15;
                    if (pageblockmap.f22603w <= 0 || pageblockmap.h <= 0) {
                        pageblockmap.f22603w = 600;
                        pageblockmap.h = 400;
                    }
                    rh.b2 b2Var2 = p3Var.F3;
                    if (b2Var2 != null) {
                        b2Var2.h();
                    }
                    pVar.V(true);
                    giVar.dismiss(true);
                    p3Var.post(new rh.f(pVar, aVar, 0));
                    break;
                }
                break;
            default:
                rh.x1 x1Var = (rh.x1) this.f29466b;
                rh.a aVar2 = (rh.a) this.f29467c;
                gi giVar2 = (gi) this.d;
                if (messageMedia != null && messageMedia.geo != null) {
                    rh.b2 b2Var3 = x1Var.L.F3;
                    if (b2Var3 != null) {
                        b2Var3.d();
                    }
                    TL_iv.pageBlockMap pageblockmap2 = (TL_iv.pageBlockMap) aVar2.f47028b;
                    pageblockmap2.geo = messageMedia.geo;
                    pageblockmap2.zoom = 15;
                    if (pageblockmap2.f22603w <= 0 || pageblockmap2.h <= 0) {
                        pageblockmap2.f22603w = 600;
                        pageblockmap2.h = 400;
                    }
                    rh.b2 b2Var4 = x1Var.L.F3;
                    if (b2Var4 != null) {
                        b2Var4.h();
                    }
                    giVar2.dismiss(true);
                    x1Var.L.post(new rh.i1(x1Var, aVar2, 9));
                    break;
                }
                break;
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        Bitmap bitmap;
        b11 b11Var = (b11) this.f29466b;
        zo zoVar = (zo) this.f29467c;
        TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) this.d;
        ImageReceiver.BitmapHolder bitmapSafe = imageReceiver.getBitmapSafe();
        if (!z10 || bitmapSafe == null || (bitmap = bitmapSafe.bitmap) == null) {
            return;
        }
        Drawable drawable = zoVar.f35317b;
        if (drawable instanceof nb0) {
            nb0 nb0Var = (nb0) drawable;
            TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
            nb0Var.t(b11.e(bitmap), (wallPaperSettings == null || wallPaperSettings.intensity >= 0) ? 100 : -100);
            nb0Var.u(b11Var.H);
            b11Var.invalidate();
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.i5.a(this, i10, str, drawable);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f29465a) {
            case 0:
                hu0 hu0Var = (hu0) this.f29466b;
                jh.b6 b6Var = (jh.b6) this.f29467c;
                ArrayList arrayList = (ArrayList) this.d;
                b6Var.F(arrayList);
                mc.a0(hu0Var.f29145r1).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("BotPreviewsDeleted", arrayList.size(), new Object[0])).j();
                hu0Var.L(false);
                break;
            case 1:
            case 2:
            default:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f29466b;
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) this.f29467c;
                rh.w3 w3Var = (rh.w3) this.d;
                String strTrim = editTextBoldCursor.getText().toString().trim();
                String strTrim2 = editTextBoldCursor2.getText().toString().trim();
                if (!TextUtils.isEmpty(strTrim) && !TextUtils.isEmpty(strTrim2)) {
                    int i11 = w3Var.f47537a;
                    rh.m3 m3Var = w3Var.f47538b;
                    switch (i11) {
                        case 1:
                            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = new TL_keyboard.TL_inlineButtonTypeUrl();
                            tL_inlineButtonTypeUrl.url = strTrim2;
                            m3Var.a(strTrim, tL_inlineButtonTypeUrl);
                            break;
                        default:
                            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = new TL_keyboard.TL_inlineButtonTypeCopy();
                            tL_inlineButtonTypeCopy.copy_text = strTrim2;
                            m3Var.a(strTrim, tL_inlineButtonTypeCopy);
                            break;
                    }
                }
                break;
            case 3:
                boolean[] zArr = (boolean[]) this.f29466b;
                JsPromptResult jsPromptResult = (JsPromptResult) this.f29467c;
                lt ltVar = (lt) this.d;
                if (!zArr[0]) {
                    zArr[0] = true;
                    jsPromptResult.confirm(ltVar.getText().toString());
                }
                break;
            case 4:
                pf.u0 u0Var = (pf.u0) this.f29466b;
                boolean[] zArr2 = (boolean[]) this.f29467c;
                TLRPC.User user = (TLRPC.User) this.d;
                u0Var.getClass();
                zArr2[0] = true;
                if (user != null) {
                    MessagesController.getNotificationsSettings(u0Var.f45928f).edit().putBoolean("inlinegeo_" + user.f22527id, true).commit();
                    u0Var.G();
                }
                break;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.i5.b(this, imageReceiver);
    }

    @Override
    public void run(boolean z10) {
        TLRPC.Chat chat = (TLRPC.Chat) this.f29466b;
        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f29467c;
        org.telegram.ui.Components.voip.e2.m(chat, null, true, null, n2Var.getParentActivity(), n2Var, (AccountInstance) this.d);
    }
}
