package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.JsPromptResult;
import java.util.Locale;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.st;
import org.telegram.ui.Components.vc0;
import org.telegram.ui.Components.wk;
import org.telegram.ui.ao0;
import org.telegram.ui.th;
import th.w3;
public final class w1 implements MessagesStorage.BooleanCallback, org.telegram.ui.ActionBar.b2, ao0, wk {
    public final int f34101a;
    public final Object f34102b;
    public final Object f34103c;
    public final Object d;

    public w1(Object obj, Object obj2, Object obj3, int i10) {
        this.f34101a = i10;
        this.f34102b = obj;
        this.f34103c = obj2;
        this.d = obj3;
    }

    @Override
    public void a(int i10) {
        ph.k2 k2Var = (ph.k2) this.f34102b;
        vc0 vc0Var = (vc0) this.f34103c;
        String str = (String) this.d;
        if (i10 != 3) {
            vc0Var.dismiss();
        }
        k2Var.d.f45987x.C(str, th.B(i10).toLowerCase(Locale.ROOT), false);
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        switch (this.f34101a) {
            case 5:
                th.p pVar = (th.p) this.f34102b;
                th.a aVar = (th.a) this.f34103c;
                ni niVar = (ni) this.d;
                th.p3 p3Var = pVar.f48623r;
                if (messageMedia != null && messageMedia.geo != null) {
                    th.b2 b2Var = p3Var.F3;
                    if (b2Var != null) {
                        b2Var.d();
                    }
                    TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) aVar.f48328b;
                    pageblockmap.geo = messageMedia.geo;
                    pageblockmap.zoom = 15;
                    if (pageblockmap.f22615w <= 0 || pageblockmap.h <= 0) {
                        pageblockmap.f22615w = 600;
                        pageblockmap.h = 400;
                    }
                    th.b2 b2Var2 = p3Var.F3;
                    if (b2Var2 != null) {
                        b2Var2.h();
                    }
                    pVar.V(true);
                    niVar.dismiss(true);
                    p3Var.post(new th.f(pVar, aVar, 0));
                    return;
                }
                return;
            default:
                th.x1 x1Var = (th.x1) this.f34102b;
                th.a aVar2 = (th.a) this.f34103c;
                ni niVar2 = (ni) this.d;
                if (messageMedia != null && messageMedia.geo != null) {
                    th.b2 b2Var3 = x1Var.L.F3;
                    if (b2Var3 != null) {
                        b2Var3.d();
                    }
                    TL_iv.pageBlockMap pageblockmap2 = (TL_iv.pageBlockMap) aVar2.f48328b;
                    pageblockmap2.geo = messageMedia.geo;
                    pageblockmap2.zoom = 15;
                    if (pageblockmap2.f22615w <= 0 || pageblockmap2.h <= 0) {
                        pageblockmap2.f22615w = 600;
                        pageblockmap2.h = 400;
                    }
                    th.b2 b2Var4 = x1Var.L.F3;
                    if (b2Var4 != null) {
                        b2Var4.h();
                    }
                    niVar2.dismiss(true);
                    x1Var.L.post(new th.i1(x1Var, aVar2, 9));
                    return;
                }
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f34101a) {
            case 1:
                boolean[] zArr = (boolean[]) this.f34102b;
                JsPromptResult jsPromptResult = (JsPromptResult) this.f34103c;
                st stVar = (st) this.d;
                if (!zArr[0]) {
                    zArr[0] = true;
                    jsPromptResult.confirm(stVar.getText().toString());
                    return;
                }
                return;
            case 2:
                Activity activity = (Activity) this.f34102b;
                boolean[] zArr2 = (boolean[]) this.f34103c;
                org.telegram.ui.web.s sVar = (org.telegram.ui.web.s) this.d;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    activity.startActivity(intent);
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                zArr2[0] = true;
                Boolean bool = Boolean.FALSE;
                sVar.run(bool, bool);
                return;
            case 3:
            default:
                w3 w3Var = (w3) this.d;
                String trim = ((EditTextBoldCursor) this.f34102b).getText().toString().trim();
                String trim2 = ((EditTextBoldCursor) this.f34103c).getText().toString().trim();
                if (!TextUtils.isEmpty(trim) && !TextUtils.isEmpty(trim2)) {
                    int i11 = w3Var.f48835a;
                    th.m3 m3Var = w3Var.f48836b;
                    switch (i11) {
                        case 1:
                            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = new TL_keyboard.TL_inlineButtonTypeUrl();
                            tL_inlineButtonTypeUrl.url = trim2;
                            m3Var.a(trim, tL_inlineButtonTypeUrl);
                            return;
                        default:
                            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = new TL_keyboard.TL_inlineButtonTypeCopy();
                            tL_inlineButtonTypeCopy.copy_text = trim2;
                            m3Var.a(trim, tL_inlineButtonTypeCopy);
                            return;
                    }
                }
                return;
            case 4:
                rf.v0 v0Var = (rf.v0) this.f34102b;
                TLRPC.User user = (TLRPC.User) this.d;
                v0Var.getClass();
                ((boolean[]) this.f34103c)[0] = true;
                if (user != null) {
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(v0Var.f47369f).edit();
                    edit.putBoolean("inlinegeo_" + user.f22539id, true).commit();
                    v0Var.G();
                    return;
                }
                return;
        }
    }

    @Override
    public void run(boolean z10) {
        TLRPC.Chat chat = (TLRPC.Chat) this.f34102b;
        org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.f34103c;
        h2.m(chat, null, true, null, o2Var.getParentActivity(), o2Var, (AccountInstance) this.d);
    }
}
