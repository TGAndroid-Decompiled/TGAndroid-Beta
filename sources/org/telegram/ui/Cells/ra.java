package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class ra extends FrameLayout {

    public final org.telegram.ui.Components.n9 f25237a;

    public final eg.c f25238b;

    public final org.telegram.ui.ActionBar.h5 f25239c;
    public final ImageView d;

    public final org.telegram.ui.Components.y8 f25240e;

    public TLObject f25241f;
    public CharSequence h;

    public int f25242n;

    public String f25243r;

    public final int f25244s;
    public final int v;

    public final int f25245w;

    public ra(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f25244s = UserConfig.selectedAccount;
        this.v = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23423y6, c6Var);
        this.f25245w = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23234n6, c6Var);
        this.f25240e = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
        org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context);
        this.f25237a = n9Var;
        n9Var.setRoundRadius(AndroidUtilities.dp(24.0f));
        boolean z10 = LocaleController.isRTL;
        addView(n9Var, h7.z5.d(48, 48.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 11, 11.0f, z10 ? 11 : 0.0f, 0.0f));
        eg.c cVar = new eg.c(context, 4);
        this.f25238b = cVar;
        NotificationCenter.listenEmojiLoading(cVar);
        cVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        cVar.setTextSize(17);
        cVar.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z11 = LocaleController.isRTL;
        addView(cVar, h7.z5.d(-1, 20.0f, (z11 ? 5 : 3) | 48, z11 ? 28 : 72, 14.5f, z11 ? 72 : 28, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f25239c = h5Var;
        h5Var.setTextSize(14);
        h5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z12 = LocaleController.isRTL;
        addView(h5Var, h7.z5.d(-1, 20.0f, (z12 ? 5 : 3) | 48, z12 ? 28.0f : 72, 37.5f, z12 ? 72 : 28.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23215m6, c6Var), PorterDuff.Mode.MULTIPLY));
        imageView.setVisibility(8);
        boolean z13 = LocaleController.isRTL;
        addView(imageView, h7.z5.d(-2, -2.0f, (z13 ? 5 : 3) | 16, z13 ? 0.0f : 16.0f, 0.0f, z13 ? 16.0f : 0.0f, 0.0f));
    }

    public final void a(TLObject tLObject, String str) {
        if (tLObject != null || str != null) {
            this.h = str;
            this.f25241f = tLObject;
            b();
        } else {
            this.h = null;
            this.f25241f = null;
            this.f25238b.k("");
            this.f25239c.l("", false);
            this.f25237a.setImageDrawable(null);
        }
    }

    public final void b() {
        TLRPC.User user;
        TLRPC.Chat chat;
        TLRPC.UserStatus userStatus;
        TLObject tLObject = this.f25241f;
        if (tLObject instanceof TLRPC.User) {
            user = (TLRPC.User) tLObject;
            chat = null;
        } else if (tLObject instanceof TLRPC.Chat) {
            chat = (TLRPC.Chat) tLObject;
            user = null;
        } else {
            user = null;
            chat = null;
        }
        int i10 = this.f25244s;
        org.telegram.ui.Components.y8 y8Var = this.f25240e;
        if (user != null) {
            y8Var.m(i10, user);
        } else if (chat != null) {
            y8Var.k(i10, chat);
        } else {
            y8Var.n(this.f25242n, "#", null);
        }
        if (user != null) {
            this.f25243r = UserObject.getUserName(user);
        } else {
            this.f25243r = chat.title;
        }
        this.f25238b.k(this.f25243r);
        CharSequence charSequence = this.h;
        int i11 = this.v;
        org.telegram.ui.Components.n9 n9Var = this.f25237a;
        org.telegram.ui.ActionBar.h5 h5Var = this.f25239c;
        if (charSequence != null) {
            h5Var.setTextColor(i11);
            h5Var.l(this.h, false);
            if (n9Var != null) {
                n9Var.e(user, y8Var);
            }
        } else if (user != null) {
            if (user.bot) {
                h5Var.setTextColor(i11);
                if (user.bot_chat_history) {
                    h5Var.l(LocaleController.getString(R.string.BotStatusRead), false);
                } else {
                    h5Var.l(LocaleController.getString(R.string.BotStatusCantRead), false);
                }
            } else if (user.f22527id == UserConfig.getInstance(i10).getClientUserId() || (((userStatus = user.status) != null && userStatus.expires > ConnectionsManager.getInstance(i10).getCurrentTime()) || MessagesController.getInstance(i10).onlinePrivacy.containsKey(Long.valueOf(user.f22527id)))) {
                h5Var.setTextColor(this.f25245w);
                h5Var.l(LocaleController.getString(R.string.Online), false);
            } else {
                h5Var.setTextColor(i11);
                h5Var.l(LocaleController.formatUserStatus(i10, user), false);
            }
            n9Var.e(user, y8Var);
        } else if (chat != null) {
            h5Var.setTextColor(i11);
            if (!ChatObject.isChannel(chat) || chat.megagroup) {
                int i12 = chat.participants_count;
                if (i12 != 0) {
                    h5Var.l(LocaleController.formatPluralString("Members", i12, new Object[0]), false);
                } else if (chat.has_geo) {
                    h5Var.l(LocaleController.getString(R.string.MegaLocation), false);
                } else if (ChatObject.isPublic(chat)) {
                    h5Var.l(LocaleController.getString(R.string.MegaPublic), false);
                } else {
                    h5Var.l(LocaleController.getString(R.string.MegaPrivate), false);
                }
            } else {
                int i13 = chat.participants_count;
                if (i13 != 0) {
                    h5Var.l(LocaleController.formatPluralString("Subscribers", i13, new Object[0]), false);
                } else if (ChatObject.isPublic(chat)) {
                    h5Var.l(LocaleController.getString(R.string.ChannelPublic), false);
                } else {
                    h5Var.l(LocaleController.getString(R.string.ChannelPrivate), false);
                }
            }
            n9Var.e(chat, y8Var);
        } else {
            n9Var.setImageDrawable(y8Var);
        }
        n9Var.setRoundRadius(AndroidUtilities.dp((chat == null || !chat.forum) ? 24.0f : 14.0f));
        ImageView imageView = this.d;
        if (imageView.getVisibility() != 0) {
            imageView.getVisibility();
        } else {
            imageView.setVisibility(8);
            imageView.setImageResource(0);
        }
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(70.0f), 1073741824));
    }

    public void setCurrentId(int i10) {
        this.f25242n = i10;
    }

    public void setNameTypeface(Typeface typeface) {
        this.f25238b.setTypeface(typeface);
    }

    public void setCheckDisabled(boolean z10) {
    }
}
