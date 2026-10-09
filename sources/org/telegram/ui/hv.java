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
public final class hv extends org.telegram.ui.Components.ez0 {
    public final n6.t I;

    public hv(Context context, long j3, n6.t tVar) {
        super(context);
        this.I = tVar;
        this.f26189a = new RectF();
        this.f26193f = 0.0f;
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(false, true, true);
        this.f26195r = q6Var;
        org.telegram.ui.Components.q6 q6Var2 = new org.telegram.ui.Components.q6(false, true, false);
        this.f26196s = q6Var2;
        q6Var.setCallback(this);
        q6Var2.setCallback(this);
        this.f26194n = Long.valueOf(j3);
        org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.e6) null);
        j9Var.f27652p = 1.5f;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.h = imageReceiver;
        imageReceiver.setParentView(this);
        if (j3 == Long.MAX_VALUE) {
            this.v = LocaleController.getString(R.string.CacheOtherChats);
            j9Var.g(14);
            imageReceiver.setForUserOrChat(null, j9Var);
            return;
        }
        String dialogPhotoTitle = DialogObject.setDialogPhotoTitle(imageReceiver, j9Var, MessagesController.getInstance(UserConfig.selectedAccount).getUserOrChat(j3));
        this.v = dialogPhotoTitle;
        this.v = Emoji.replaceEmoji(dialogPhotoTitle, null, false);
    }

    @Override
    public final void b() {
        n6.t tVar = this.I;
        y6 y6Var = (y6) tVar.f16718c;
        y6Var.T.dismiss();
        Bundle bundle = new Bundle();
        long j3 = ((r6) tVar.f16717b).f41279a;
        if (j3 > 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        y6Var.presentFragment(new ProfileActivity(bundle, null));
    }
}
