package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.View;
import android.widget.EditText;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class s1 implements org.telegram.ui.ActionBar.b2, ResultCallback {
    public final long f32400a;
    public final int f32401b;
    public final View f32402c;
    public final Object d;

    public s1(EditText editText, long j10, int i10, EditText editText2) {
        this.f32402c = editText;
        this.f32400a = j10;
        this.f32401b = i10;
        this.d = editText2;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        EditText editText = (EditText) this.f32402c;
        EditText editText2 = (EditText) this.d;
        if (editText.getText() == null) {
            return;
        }
        long j10 = this.f32400a;
        int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        int i12 = this.f32401b;
        if (i11 > 0) {
            TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(j10));
            String obj = editText.getText().toString();
            String obj2 = editText2.getText().toString();
            String str = user.first_name;
            String str2 = user.last_name;
            if (str == null) {
                str = "";
            }
            if (str2 == null) {
                str2 = "";
            }
            if (str.equals(obj) && str2.equals(obj2)) {
                e2Var.dismiss();
                return;
            }
            TL_account.updateProfile updateprofile = new TL_account.updateProfile();
            updateprofile.flags = 3;
            updateprofile.first_name = obj;
            user.first_name = obj;
            updateprofile.last_name = obj2;
            user.last_name = obj2;
            TLRPC.User user2 = MessagesController.getInstance(i12).getUser(Long.valueOf(UserConfig.getInstance(i12).getClientUserId()));
            if (user2 != null) {
                user2.first_name = updateprofile.first_name;
                user2.last_name = updateprofile.last_name;
            }
            UserConfig.getInstance(i12).saveConfig(true);
            NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
            NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
            ConnectionsManager.getInstance(i12).sendRequest(updateprofile, new di.d6(12));
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 3, Long.valueOf(j10));
        } else {
            long j11 = -j10;
            TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(j11));
            String obj3 = editText.getText().toString();
            String str3 = chat.title;
            if (str3 != null && str3.equals(obj3)) {
                e2Var.dismiss();
                return;
            }
            chat.title = obj3;
            NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_CHAT_NAME));
            MessagesController.getInstance(i12).changeChatTitle(j11, obj3);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 3, Long.valueOf(j10));
        }
        e2Var.dismiss();
    }

    @Override
    public void onComplete(Object obj) {
        int i10;
        d31 d31Var = (d31) this.f32402c;
        xp xpVar = (xp) this.d;
        Pair pair = (Pair) obj;
        if (pair != null && ((Long) pair.first).longValue() == this.f32400a) {
            Drawable drawable = xpVar.f34794b;
            if (drawable instanceof uc0) {
                uc0 uc0Var = (uc0) drawable;
                if (this.f32401b >= 0) {
                    i10 = 100;
                } else {
                    i10 = -100;
                }
                uc0Var.s(d31.e((Bitmap) pair.second), i10);
                uc0Var.t(d31Var.L);
            }
            d31Var.invalidate();
        }
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    public s1(d31 d31Var, long j10, xp xpVar, int i10) {
        this.f32402c = d31Var;
        this.f32400a = j10;
        this.d = xpVar;
        this.f32401b = i10;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }
}
