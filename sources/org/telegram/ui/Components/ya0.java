package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class ya0 implements View.OnClickListener {
    public final int f35007a;
    public final Object f35008b;
    public final Object f35009c;
    public final Object d;

    public ya0(Object obj, Object obj2, Object obj3, int i10) {
        this.f35007a = i10;
        this.f35008b = obj;
        this.f35009c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        View view2;
        String string;
        boolean z10;
        switch (this.f35007a) {
            case 0:
                lb0 lb0Var = (lb0) this.f35008b;
                qb0 qb0Var = (qb0) this.f35009c;
                qb0 qb0Var2 = (qb0) this.d;
                rb0 rb0Var = lb0Var.V;
                MessagePreviewParams messagePreviewParams = rb0Var.d;
                boolean z11 = messagePreviewParams.hideCaption;
                boolean z12 = !z11;
                messagePreviewParams.hideCaption = z12;
                if (!z11) {
                    if (!messagePreviewParams.hideForwardSendersName) {
                        messagePreviewParams.hideForwardSendersName = true;
                        rb0Var.f32258x = true;
                    }
                } else {
                    if (rb0Var.f32258x) {
                        messagePreviewParams.hideForwardSendersName = false;
                    }
                    rb0Var.f32258x = false;
                }
                qb0Var.a(z12, true);
                qb0Var2.a(messagePreviewParams.hideForwardSendersName, true);
                lb0Var.h();
                lb0Var.k(true);
                return;
            case 1:
                vd0.n((vd0) this.f35008b, (TLRPC.ChatFull) this.f35009c, (org.telegram.ui.m60) this.d);
                return;
            case 2:
                ff0 ff0Var = (ff0) this.f35008b;
                Context context = (Context) this.f35009c;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.d;
                if (ff0Var.h == null) {
                    nh.r3 r3Var = new nh.r3(context, c6Var, LocaleController.getString(R.string.VideoChooseCover), ff0Var.f28394f);
                    ff0Var.h = r3Var;
                    r3Var.setOnDismissListener(new xb0(ff0Var, 8));
                    ff0Var.h.f18511f = ff0Var.f28395n;
                }
                ff0Var.h.show();
                return;
            case 3:
                i31 i31Var = (i31) this.f35008b;
                LocaleController.LocaleInfo localeInfo = (LocaleController.LocaleInfo) this.d;
                k31 k31Var = i31Var.h;
                Runnable runnable = ((Runnable[]) this.f35009c)[0];
                if (runnable != null) {
                    runnable.run();
                }
                String str = k31Var.v;
                j31 j31Var = k31Var.E;
                if (!TextUtils.equals(str, localeInfo.pluralLangCode)) {
                    View view3 = j31Var.d;
                    if (view3 == k31Var.A || view3 == k31Var.f29911r) {
                        k31Var.f29913w = k31Var.v;
                    }
                    g31 g31Var = i31Var.f29313e;
                    String str2 = localeInfo.pluralLangCode;
                    k31Var.v = str2;
                    g31Var.setText(k31.y(k31.D(str2, null, null)));
                    if (k31Var.h != null) {
                        view2 = k31Var.f29910n;
                    } else {
                        view2 = k31Var.f29915y;
                    }
                    j31Var.D(view2);
                    k31.H(k31Var.v);
                    k31Var.L();
                    return;
                }
                return;
            case 4:
                org.telegram.ui.qk qkVar = (org.telegram.ui.qk) this.f35008b;
                TranslateController translateController = (TranslateController) this.f35009c;
                org.telegram.ui.ActionBar.o1 o1Var = (org.telegram.ui.ActionBar.o1) this.d;
                long j10 = qkVar.f26659b;
                translateController.setHideTranslateDialog(j10, true);
                TLRPC.Chat chat = MessagesController.getInstance(qkVar.f26658a).getChat(Long.valueOf(-j10));
                if (chat != null && ChatObject.isChannelAndNotMegaGroup(chat)) {
                    string = LocaleController.getString(R.string.TranslationBarHiddenForChannel);
                } else if (chat != null) {
                    string = LocaleController.getString(R.string.TranslationBarHiddenForGroup);
                } else {
                    string = LocaleController.getString(R.string.TranslationBarHiddenForChat);
                }
                tc.a0(qkVar.f26660c).J(R.raw.msg_translate, AndroidUtilities.replaceTags(string), LocaleController.getString(R.string.UndoNoCaps), new ii0(22, qkVar, translateController)).j();
                o1Var.d(true);
                return;
            case 5:
                sf.f fVar = (sf.f) this.f35008b;
                j70 F = j70.F(((org.telegram.ui.tn) this.f35009c).getLayoutContainer(), (org.telegram.ui.ActionBar.c6) this.d, fVar.f47793n);
                F.c(R.drawable.msg_cancel, LocaleController.getString(R.string.BizBotRemove), new sf.e(fVar, 1), true);
                F.E();
                if (fVar.f47797x != null) {
                    F.c(R.drawable.msg_settings, LocaleController.getString(R.string.BizBotManage), new sf.e(fVar, 2), false);
                }
                F.a0(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(7.0f));
                F.f29600s = 0;
                F.Z();
                return;
            case 6:
                sf.f0.S((sf.f0) this.f35008b, (TL_account.TL_connectedBot) this.f35009c, (i8) this.d);
                return;
            case 7:
                sh.a aVar = (sh.a) this.f35008b;
                Utilities.Callback callback = (Utilities.Callback) this.f35009c;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                boolean z13 = aVar.U;
                if (chat2 != null && !ChatObject.canAddChatToCommunity(chat2)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                aVar.P(callback, z13, z10);
                return;
            default:
                ((m.s3) this.f35008b).c();
                ((th.t5) this.f35009c).D((th.k0) this.d);
                return;
        }
    }
}
