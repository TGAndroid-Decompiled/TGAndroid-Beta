package org.telegram.ui;

import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
public final class nv extends org.telegram.ui.Components.az0 {
    public final n6.o I;

    public nv(Context context, long j10, n6.o oVar) {
        super(context);
        this.I = oVar;
        this.f23647a = new RectF();
        this.f23650f = 0.0f;
        org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(false, true, true);
        this.f23652r = r6Var;
        org.telegram.ui.Components.r6 r6Var2 = new org.telegram.ui.Components.r6(false, true, false);
        this.f23653s = r6Var2;
        r6Var.setCallback(this);
        r6Var2.setCallback(this);
        this.f23651n = Long.valueOf(j10);
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9((org.telegram.ui.ActionBar.c6) null);
        k9Var.f26627p = 1.5f;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.h = imageReceiver;
        imageReceiver.setParentView(this);
        if (j10 == Long.MAX_VALUE) {
            this.v = LocaleController.getString(R.string.CacheOtherChats);
            k9Var.g(14);
            imageReceiver.setForUserOrChat(null, k9Var);
            return;
        }
        String dialogPhotoTitle = DialogObject.setDialogPhotoTitle(imageReceiver, k9Var, MessagesController.getInstance(UserConfig.selectedAccount).getUserOrChat(j10));
        this.v = dialogPhotoTitle;
        this.v = Emoji.replaceEmoji(dialogPhotoTitle, null, false);
    }

    @Override
    public final void b() {
        n6.o oVar = this.I;
        d7 d7Var = (d7) oVar.f16132c;
        d7Var.T.dismiss();
        Bundle bundle = new Bundle();
        long j10 = ((w6) oVar.f16131b).f41163a;
        if (j10 > 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        d7Var.presentFragment(new ProfileActivity(bundle, null));
    }
}
