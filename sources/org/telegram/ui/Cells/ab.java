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
public final class ab extends FrameLayout {
    public final org.telegram.ui.Components.w9 f18891a;
    public final f4 f18892b;
    public final org.telegram.ui.ActionBar.l5 f18893c;
    public final ImageView d;
    public final org.telegram.ui.Components.g9 e;
    public TLObject f18894f;
    public CharSequence h;
    public int f18895n;
    public String f18896r;
    public final int f18897s;
    public final int v;
    public final int f18898w;

    public ab(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
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
        float f16;
        this.f18897s = UserConfig.selectedAccount;
        this.v = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18306y6, f6Var);
        this.f18898w = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18110n6, f6Var);
        this.e = new org.telegram.ui.Components.g9((org.telegram.ui.ActionBar.f6) null);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.f18891a = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(24.0f));
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
        addView(w9Var, w7.a6.d(48, 48.0f, i15, f7, 11.0f, f10, 0.0f));
        f4 f4Var = new f4(context, 2);
        this.f18892b = f4Var;
        NotificationCenter.listenEmojiLoading(f4Var);
        f4Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        f4Var.setTextSize(17);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        f4Var.setGravity(i11 | 48);
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
        float f17 = f11;
        if (z11) {
            f12 = 72;
        } else {
            f12 = 28;
        }
        addView(f4Var, w7.a6.d(-1, 20.0f, i16, f17, 14.5f, f12, 0.0f));
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.f18893c = l5Var;
        l5Var.setTextSize(14);
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        l5Var.setGravity(i13 | 48);
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
        if (z12) {
            f14 = 72;
        } else {
            f14 = 28.0f;
        }
        addView(l5Var, w7.a6.d(-1, 20.0f, i17, f13, 37.5f, f14, 0.0f));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18091m6, f6Var), PorterDuff.Mode.MULTIPLY));
        imageView.setVisibility(8);
        boolean z13 = LocaleController.isRTL;
        int i18 = (z13 ? 5 : 3) | 16;
        if (z13) {
            f15 = 0.0f;
        } else {
            f15 = 16.0f;
        }
        if (z13) {
            f16 = 16.0f;
        } else {
            f16 = 0.0f;
        }
        addView(imageView, w7.a6.d(-2, -2.0f, i18, f15, 0.0f, f16, 0.0f));
    }

    public final void a(TLObject tLObject, String str) {
        if (tLObject == null && str == null) {
            this.h = null;
            this.f18894f = null;
            this.f18892b.k("");
            this.f18893c.l("", false);
            this.f18891a.setImageDrawable(null);
            return;
        }
        this.h = str;
        this.f18894f = tLObject;
        b();
    }

    public final void b() {
        TLRPC.User user;
        TLRPC.Chat chat;
        TLRPC.UserStatus userStatus;
        float f7;
        TLObject tLObject = this.f18894f;
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
        int i10 = this.f18897s;
        org.telegram.ui.Components.g9 g9Var = this.e;
        if (user != null) {
            g9Var.m(i10, user);
        } else if (chat != null) {
            g9Var.k(i10, chat);
        } else {
            g9Var.n(this.f18895n, "#", null);
        }
        if (user != null) {
            this.f18896r = UserObject.getUserName(user);
        } else {
            this.f18896r = chat.title;
        }
        this.f18892b.k(this.f18896r);
        CharSequence charSequence = this.h;
        int i11 = this.v;
        org.telegram.ui.Components.w9 w9Var = this.f18891a;
        org.telegram.ui.ActionBar.l5 l5Var = this.f18893c;
        if (charSequence != null) {
            l5Var.setTextColor(i11);
            l5Var.l(this.h, false);
            if (w9Var != null) {
                w9Var.e(user, g9Var);
            }
        } else if (user != null) {
            if (user.bot) {
                l5Var.setTextColor(i11);
                if (user.bot_chat_history) {
                    l5Var.l(LocaleController.getString(R.string.BotStatusRead), false);
                } else {
                    l5Var.l(LocaleController.getString(R.string.BotStatusCantRead), false);
                }
            } else if (user.f17342id != UserConfig.getInstance(i10).getClientUserId() && (((userStatus = user.status) == null || userStatus.expires <= ConnectionsManager.getInstance(i10).getCurrentTime()) && !MessagesController.getInstance(i10).onlinePrivacy.containsKey(Long.valueOf(user.f17342id)))) {
                l5Var.setTextColor(i11);
                l5Var.l(LocaleController.formatUserStatus(i10, user), false);
            } else {
                l5Var.setTextColor(this.f18898w);
                l5Var.l(LocaleController.getString(R.string.Online), false);
            }
            w9Var.e(user, g9Var);
        } else if (chat != null) {
            l5Var.setTextColor(i11);
            if (ChatObject.isChannel(chat) && !chat.megagroup) {
                int i12 = chat.participants_count;
                if (i12 != 0) {
                    l5Var.l(LocaleController.formatPluralString("Subscribers", i12, new Object[0]), false);
                } else if (!ChatObject.isPublic(chat)) {
                    l5Var.l(LocaleController.getString(R.string.ChannelPrivate), false);
                } else {
                    l5Var.l(LocaleController.getString(R.string.ChannelPublic), false);
                }
            } else {
                int i13 = chat.participants_count;
                if (i13 != 0) {
                    l5Var.l(LocaleController.formatPluralString("Members", i13, new Object[0]), false);
                } else if (chat.has_geo) {
                    l5Var.l(LocaleController.getString(R.string.MegaLocation), false);
                } else if (!ChatObject.isPublic(chat)) {
                    l5Var.l(LocaleController.getString(R.string.MegaPrivate), false);
                } else {
                    l5Var.l(LocaleController.getString(R.string.MegaPublic), false);
                }
            }
            w9Var.e(chat, g9Var);
        } else {
            w9Var.setImageDrawable(g9Var);
        }
        if (chat != null && chat.forum) {
            f7 = 14.0f;
        } else {
            f7 = 24.0f;
        }
        w9Var.setRoundRadius(AndroidUtilities.dp(f7));
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
        this.f18895n = i10;
    }

    public void setNameTypeface(Typeface typeface) {
        this.f18892b.setTypeface(typeface);
    }

    public void setCheckDisabled(boolean z10) {
    }
}
