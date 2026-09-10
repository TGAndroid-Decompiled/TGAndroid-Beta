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
public final class kv extends org.telegram.ui.Components.py0 {
    public final n7.a1 I;

    public kv(Context context, long j3, n7.a1 a1Var) {
        super(context);
        this.I = a1Var;
        this.f26263a = new RectF();
        this.f26266f = 0.0f;
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(false, true, true, false);
        this.f26268r = n6Var;
        org.telegram.ui.Components.n6 n6Var2 = new org.telegram.ui.Components.n6(false, true, false, false);
        this.f26269s = n6Var2;
        n6Var.setCallback(this);
        n6Var2.setCallback(this);
        this.f26267n = Long.valueOf(j3);
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9((org.telegram.ui.ActionBar.f6) null);
        g9Var.f23286p = 1.5f;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.h = imageReceiver;
        imageReceiver.setParentView(this);
        if (j3 == Long.MAX_VALUE) {
            this.v = LocaleController.getString(R.string.CacheOtherChats);
            g9Var.g(14);
            imageReceiver.setForUserOrChat(null, g9Var);
            return;
        }
        String dialogPhotoTitle = DialogObject.setDialogPhotoTitle(imageReceiver, g9Var, MessagesController.getInstance(UserConfig.selectedAccount).getUserOrChat(j3));
        this.v = dialogPhotoTitle;
        this.v = Emoji.replaceEmoji(dialogPhotoTitle, null, false);
    }

    @Override
    public final void b() {
        n7.a1 a1Var = this.I;
        y6 y6Var = (y6) a1Var.f13939c;
        y6Var.T.dismiss();
        Bundle bundle = new Bundle();
        long j3 = ((r6) a1Var.f13938b).f36238a;
        if (j3 > 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        y6Var.presentFragment(new ProfileActivity(bundle, null));
    }
}
