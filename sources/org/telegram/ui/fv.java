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
public final class fv extends org.telegram.ui.Components.fy0 {
    public final n7.qa F;

    public fv(Context context, long j10, n7.qa qaVar) {
        super(context);
        this.F = qaVar;
        this.f24982a = new RectF();
        this.f24985f = 0.0f;
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(false, true, true, false);
        this.f24987r = j6Var;
        org.telegram.ui.Components.j6 j6Var2 = new org.telegram.ui.Components.j6(false, true, false, false);
        this.f24988s = j6Var2;
        j6Var.setCallback(this);
        j6Var2.setCallback(this);
        this.f24986n = Long.valueOf(j10);
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
        z8Var.f31276p = 1.5f;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.h = imageReceiver;
        imageReceiver.setParentView(this);
        if (j10 == Long.MAX_VALUE) {
            this.v = LocaleController.getString(R.string.CacheOtherChats);
            z8Var.g(14);
            imageReceiver.setForUserOrChat(null, z8Var);
            return;
        }
        String dialogPhotoTitle = DialogObject.setDialogPhotoTitle(imageReceiver, z8Var, MessagesController.getInstance(UserConfig.selectedAccount).getUserOrChat(j10));
        this.v = dialogPhotoTitle;
        this.v = Emoji.replaceEmoji(dialogPhotoTitle, null, false);
    }

    @Override
    public final void b() {
        n7.qa qaVar = this.F;
        b7 b7Var = (b7) qaVar.f14703c;
        b7Var.Q.dismiss();
        Bundle bundle = new Bundle();
        long j10 = ((u6) qaVar.f14702b).f38849a;
        if (j10 > 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        b7Var.presentFragment(new ProfileActivity(bundle, null));
    }
}
