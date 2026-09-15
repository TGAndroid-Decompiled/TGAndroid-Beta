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
public final class za extends FrameLayout {
    public final org.telegram.ui.Components.u9 f21707a;
    public final ai.a6 f21708b;
    public final org.telegram.ui.ActionBar.j5 f21709c;
    public final ImageView d;
    public final org.telegram.ui.Components.f9 e;
    public TLObject f21710f;
    public CharSequence h;
    public int f21711n;
    public String f21712r;
    public final int f21713s;
    public final int v;
    public final int f21714w;

    public za(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
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
        this.f21713s = UserConfig.selectedAccount;
        this.v = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19218y6, e6Var);
        this.f21714w = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19021n6, e6Var);
        this.e = new org.telegram.ui.Components.f9((org.telegram.ui.ActionBar.e6) null);
        org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(context);
        this.f21707a = u9Var;
        u9Var.setRoundRadius(AndroidUtilities.dp(24.0f));
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
        addView(u9Var, w7.x5.d(48, 48.0f, i15, f7, 11.0f, f10, 0.0f));
        ai.a6 a6Var = new ai.a6(context, 3);
        this.f21708b = a6Var;
        NotificationCenter.listenEmojiLoading(a6Var);
        a6Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G6, e6Var));
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
        float f17 = f11;
        if (z11) {
            f12 = 72;
        } else {
            f12 = 28;
        }
        addView(a6Var, w7.x5.d(-1, 20.0f, i16, f17, 14.5f, f12, 0.0f));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.f21709c = j5Var;
        j5Var.setTextSize(14);
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        j5Var.setGravity(i13 | 48);
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
        addView(j5Var, w7.x5.d(-1, 20.0f, i17, f13, 37.5f, f14, 0.0f));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19001m6, e6Var), PorterDuff.Mode.MULTIPLY));
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
        addView(imageView, w7.x5.d(-2, -2.0f, i18, f15, 0.0f, f16, 0.0f));
    }

    public final void a(TLObject tLObject, String str) {
        if (tLObject == null && str == null) {
            this.h = null;
            this.f21710f = null;
            this.f21708b.k("");
            this.f21709c.l("", false);
            this.f21707a.setImageDrawable(null);
            return;
        }
        this.h = str;
        this.f21710f = tLObject;
        b();
    }

    public final void b() {
        TLRPC.User user;
        TLRPC.Chat chat;
        TLRPC.UserStatus userStatus;
        float f7;
        TLObject tLObject = this.f21710f;
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
        int i10 = this.f21713s;
        org.telegram.ui.Components.f9 f9Var = this.e;
        if (user != null) {
            f9Var.m(i10, user);
        } else if (chat != null) {
            f9Var.k(i10, chat);
        } else {
            f9Var.n(this.f21711n, "#", null);
        }
        if (user != null) {
            this.f21712r = UserObject.getUserName(user);
        } else {
            this.f21712r = chat.title;
        }
        this.f21708b.k(this.f21712r);
        CharSequence charSequence = this.h;
        int i11 = this.v;
        org.telegram.ui.Components.u9 u9Var = this.f21707a;
        org.telegram.ui.ActionBar.j5 j5Var = this.f21709c;
        if (charSequence != null) {
            j5Var.setTextColor(i11);
            j5Var.l(this.h, false);
            if (u9Var != null) {
                u9Var.e(user, f9Var);
            }
        } else if (user != null) {
            if (user.bot) {
                j5Var.setTextColor(i11);
                if (user.bot_chat_history) {
                    j5Var.l(LocaleController.getString(R.string.BotStatusRead), false);
                } else {
                    j5Var.l(LocaleController.getString(R.string.BotStatusCantRead), false);
                }
            } else if (user.f18259id != UserConfig.getInstance(i10).getClientUserId() && (((userStatus = user.status) == null || userStatus.expires <= ConnectionsManager.getInstance(i10).getCurrentTime()) && !MessagesController.getInstance(i10).onlinePrivacy.containsKey(Long.valueOf(user.f18259id)))) {
                j5Var.setTextColor(i11);
                j5Var.l(LocaleController.formatUserStatus(i10, user), false);
            } else {
                j5Var.setTextColor(this.f21714w);
                j5Var.l(LocaleController.getString(R.string.Online), false);
            }
            u9Var.e(user, f9Var);
        } else if (chat != null) {
            j5Var.setTextColor(i11);
            if (ChatObject.isChannel(chat) && !chat.megagroup) {
                int i12 = chat.participants_count;
                if (i12 != 0) {
                    j5Var.l(LocaleController.formatPluralString("Subscribers", i12, new Object[0]), false);
                } else if (!ChatObject.isPublic(chat)) {
                    j5Var.l(LocaleController.getString(R.string.ChannelPrivate), false);
                } else {
                    j5Var.l(LocaleController.getString(R.string.ChannelPublic), false);
                }
            } else {
                int i13 = chat.participants_count;
                if (i13 != 0) {
                    j5Var.l(LocaleController.formatPluralString("Members", i13, new Object[0]), false);
                } else if (chat.has_geo) {
                    j5Var.l(LocaleController.getString(R.string.MegaLocation), false);
                } else if (!ChatObject.isPublic(chat)) {
                    j5Var.l(LocaleController.getString(R.string.MegaPrivate), false);
                } else {
                    j5Var.l(LocaleController.getString(R.string.MegaPublic), false);
                }
            }
            u9Var.e(chat, f9Var);
        } else {
            u9Var.setImageDrawable(f9Var);
        }
        if (chat != null && chat.forum) {
            f7 = 14.0f;
        } else {
            f7 = 24.0f;
        }
        u9Var.setRoundRadius(AndroidUtilities.dp(f7));
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
        this.f21711n = i10;
    }

    public void setNameTypeface(Typeface typeface) {
        this.f21708b.setTypeface(typeface);
    }

    public void setCheckDisabled(boolean z10) {
    }
}
