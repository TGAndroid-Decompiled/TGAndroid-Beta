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
public final class wa extends FrameLayout {
    public final org.telegram.ui.Components.y9 f23724a;
    public final ai.a6 f23725b;
    public final org.telegram.ui.ActionBar.h5 f23726c;
    public final ImageView d;
    public final org.telegram.ui.Components.j9 f23727e;
    public TLObject f23728f;
    public CharSequence h;
    public int f23729n;
    public String f23730r;
    public final int f23731s;
    public final int v;
    public final int f23732w;

    public wa(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        int i10;
        float f7;
        float f10;
        int i11;
        int i12;
        float f11;
        float f12;
        int i13;
        int i14;
        float f13;
        float f14;
        float f15;
        this.f23731s = UserConfig.selectedAccount;
        this.v = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21207y6, d6Var);
        this.f23732w = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21007n6, d6Var);
        this.f23727e = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.d6) null);
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.f23724a = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(24.0f));
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        int i15 = i10 | 48;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = 11;
        }
        if (z10) {
            f10 = 11;
        } else {
            f10 = 0.0f;
        }
        addView(y9Var, w7.x5.a(48.0f, f7, 11.0f, f10, 0.0f, 48, i15));
        ai.a6 a6Var = new ai.a6(context, 3);
        this.f23725b = a6Var;
        NotificationCenter.listenEmojiLoading(a6Var);
        a6Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var));
        a6Var.setTextSize(17);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        a6Var.setGravity(i11 | 48);
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        int i16 = i12 | 48;
        if (z11) {
            f11 = 28;
        } else {
            f11 = 72;
        }
        if (z11) {
            f12 = 72;
        } else {
            f12 = 28;
        }
        addView(a6Var, w7.x5.a(20.0f, f11, 14.5f, f12, 0.0f, -1, i16));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f23726c = h5Var;
        h5Var.setTextSize(14);
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        h5Var.setGravity(i13 | 48);
        boolean z12 = LocaleController.isRTL;
        if (z12) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        int i17 = i14 | 48;
        if (z12) {
            f13 = 28.0f;
        } else {
            f13 = 72;
        }
        addView(h5Var, w7.x5.a(20.0f, f13, 37.5f, z12 ? 72 : 28.0f, 0.0f, -1, i17));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20987m6, d6Var), PorterDuff.Mode.MULTIPLY));
        imageView.setVisibility(8);
        boolean z13 = LocaleController.isRTL;
        int i18 = (z13 ? 5 : 3) | 16;
        if (z13) {
            f14 = 0.0f;
        } else {
            f14 = 16.0f;
        }
        if (z13) {
            f15 = 16.0f;
        } else {
            f15 = 0.0f;
        }
        addView(imageView, w7.x5.a(-2.0f, f14, 0.0f, f15, 0.0f, -2, i18));
    }

    public final void a(TLObject tLObject, String str) {
        if (tLObject == null && str == null) {
            this.h = null;
            this.f23728f = null;
            this.f23725b.k("");
            this.f23726c.l("", false);
            this.f23724a.setImageDrawable(null);
            return;
        }
        this.h = str;
        this.f23728f = tLObject;
        b();
    }

    public final void b() {
        TLRPC.User user;
        TLRPC.Chat chat;
        TLRPC.UserStatus userStatus;
        float f7;
        TLObject tLObject = this.f23728f;
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
        int i10 = this.f23731s;
        org.telegram.ui.Components.j9 j9Var = this.f23727e;
        if (user != null) {
            j9Var.m(i10, user);
        } else if (chat != null) {
            j9Var.k(i10, chat);
        } else {
            j9Var.n(this.f23729n, "#", null);
        }
        if (user != null) {
            this.f23730r = UserObject.getUserName(user);
        } else {
            this.f23730r = chat.title;
        }
        this.f23725b.k(this.f23730r);
        CharSequence charSequence = this.h;
        int i11 = this.v;
        org.telegram.ui.Components.y9 y9Var = this.f23724a;
        org.telegram.ui.ActionBar.h5 h5Var = this.f23726c;
        if (charSequence != null) {
            h5Var.setTextColor(i11);
            h5Var.l(this.h, false);
            if (y9Var != null) {
                y9Var.e(user, j9Var);
            }
        } else if (user != null) {
            if (user.bot) {
                h5Var.setTextColor(i11);
                if (user.bot_chat_history) {
                    h5Var.l(LocaleController.getString(R.string.BotStatusRead), false);
                } else {
                    h5Var.l(LocaleController.getString(R.string.BotStatusCantRead), false);
                }
            } else if (user.f20215id != UserConfig.getInstance(i10).getClientUserId() && (((userStatus = user.status) == null || userStatus.expires <= ConnectionsManager.getInstance(i10).getCurrentTime()) && !MessagesController.getInstance(i10).onlinePrivacy.containsKey(Long.valueOf(user.f20215id)))) {
                h5Var.setTextColor(i11);
                h5Var.l(LocaleController.formatUserStatus(i10, user), false);
            } else {
                h5Var.setTextColor(this.f23732w);
                h5Var.l(LocaleController.getString(R.string.Online), false);
            }
            y9Var.e(user, j9Var);
        } else if (chat != null) {
            h5Var.setTextColor(i11);
            if (ChatObject.isChannel(chat) && !chat.megagroup) {
                int i12 = chat.participants_count;
                if (i12 != 0) {
                    h5Var.l(LocaleController.formatPluralString("Subscribers", i12, new Object[0]), false);
                } else if (!ChatObject.isPublic(chat)) {
                    h5Var.l(LocaleController.getString(R.string.ChannelPrivate), false);
                } else {
                    h5Var.l(LocaleController.getString(R.string.ChannelPublic), false);
                }
            } else {
                int i13 = chat.participants_count;
                if (i13 != 0) {
                    h5Var.l(LocaleController.formatPluralString("Members", i13, new Object[0]), false);
                } else if (chat.has_geo) {
                    h5Var.l(LocaleController.getString(R.string.MegaLocation), false);
                } else if (!ChatObject.isPublic(chat)) {
                    h5Var.l(LocaleController.getString(R.string.MegaPrivate), false);
                } else {
                    h5Var.l(LocaleController.getString(R.string.MegaPublic), false);
                }
            }
            y9Var.e(chat, j9Var);
        } else {
            y9Var.setImageDrawable(j9Var);
        }
        if (chat != null && chat.forum) {
            f7 = 14.0f;
        } else {
            f7 = 24.0f;
        }
        y9Var.setRoundRadius(AndroidUtilities.dp(f7));
        ImageView imageView = this.d;
        if (imageView.getVisibility() == 0) {
            imageView.setVisibility(8);
            imageView.setImageResource(0);
            return;
        }
        imageView.getVisibility();
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
        this.f23729n = i10;
    }

    public void setNameTypeface(Typeface typeface) {
        this.f23725b.setTypeface(typeface);
    }

    public void setCheckDisabled(boolean z10) {
    }
}
