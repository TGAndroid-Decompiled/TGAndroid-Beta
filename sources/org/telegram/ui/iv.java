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
public final class iv extends org.telegram.ui.Components.zy0 {
    public final o0.a I;

    public iv(Context context, long j3, o0.a aVar) {
        super(context);
        this.I = aVar;
        this.f33672a = new RectF();
        this.f33676f = 0.0f;
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(false, true, true, false);
        this.f33678r = o6Var;
        org.telegram.ui.Components.o6 o6Var2 = new org.telegram.ui.Components.o6(false, true, false, false);
        this.f33679s = o6Var2;
        o6Var.setCallback(this);
        o6Var2.setCallback(this);
        this.f33677n = Long.valueOf(j3);
        org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        h9Var.f27154p = 1.5f;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.h = imageReceiver;
        imageReceiver.setParentView(this);
        if (j3 == Long.MAX_VALUE) {
            this.v = LocaleController.getString(R.string.CacheOtherChats);
            h9Var.g(14);
            imageReceiver.setForUserOrChat(null, h9Var);
            return;
        }
        String dialogPhotoTitle = DialogObject.setDialogPhotoTitle(imageReceiver, h9Var, MessagesController.getInstance(UserConfig.selectedAccount).getUserOrChat(j3));
        this.v = dialogPhotoTitle;
        this.v = Emoji.replaceEmoji(dialogPhotoTitle, null, false);
    }

    @Override
    public final void b() {
        o0.a aVar = this.I;
        a7 a7Var = (a7) aVar.f16938c;
        a7Var.Z.dismiss();
        Bundle bundle = new Bundle();
        long j3 = ((u6) aVar.f16937b).f41123a;
        if (j3 > 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        a7Var.presentFragment(new ProfileActivity(bundle, null));
    }
}
