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
public final class ua extends FrameLayout {
    public final org.telegram.ui.Components.p9 f24230a;
    public final jg.c f24231b;
    public final org.telegram.ui.ActionBar.l5 f24232c;
    public final ImageView d;
    public final org.telegram.ui.Components.z8 f24233e;
    public TLObject f24234f;
    public CharSequence h;
    public int f24235n;
    public String f24236r;
    public final int f24237s;
    public final int v;
    public final int f24238w;

    public ua(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        int i10;
        float f10;
        float f11;
        int i11;
        int i12;
        float f12;
        float f13;
        int i13;
        int i14;
        float f14;
        float f15;
        float f16;
        float f17;
        this.f24237s = UserConfig.selectedAccount;
        this.v = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f22038y6, g6Var);
        this.f24238w = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21841n6, g6Var);
        this.f24233e = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.g6) null);
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.f24230a = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(24.0f));
        boolean z4 = LocaleController.isRTL;
        if (z4) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        int i15 = i10 | 48;
        if (z4) {
            f10 = 0.0f;
        } else {
            f10 = 11;
        }
        if (z4) {
            f11 = 11;
        } else {
            f11 = 0.0f;
        }
        addView(p9Var, k7.c6.d(48, 48.0f, i15, f10, 11.0f, f11, 0.0f));
        jg.c cVar = new jg.c(context, 4);
        this.f24231b = cVar;
        NotificationCenter.listenEmojiLoading(cVar);
        cVar.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6, g6Var));
        cVar.setTextSize(17);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        cVar.setGravity(i11 | 48);
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        int i16 = i12 | 48;
        if (z10) {
            f12 = 28;
        } else {
            f12 = 72;
        }
        float f18 = f12;
        if (z10) {
            f13 = 72;
        } else {
            f13 = 28;
        }
        addView(cVar, k7.c6.d(-1, 20.0f, i16, f18, 14.5f, f13, 0.0f));
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.f24232c = l5Var;
        l5Var.setTextSize(14);
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        l5Var.setGravity(i13 | 48);
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        int i17 = i14 | 48;
        if (z11) {
            f14 = 28.0f;
        } else {
            f14 = 72;
        }
        if (z11) {
            f15 = 72;
        } else {
            f15 = 28.0f;
        }
        addView(l5Var, k7.c6.d(-1, 20.0f, i17, f14, 37.5f, f15, 0.0f));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21823m6, g6Var), PorterDuff.Mode.MULTIPLY));
        imageView.setVisibility(8);
        boolean z12 = LocaleController.isRTL;
        int i18 = (z12 ? 5 : 3) | 16;
        if (z12) {
            f16 = 0.0f;
        } else {
            f16 = 16.0f;
        }
        if (z12) {
            f17 = 16.0f;
        } else {
            f17 = 0.0f;
        }
        addView(imageView, k7.c6.d(-2, -2.0f, i18, f16, 0.0f, f17, 0.0f));
    }

    public final void a(TLObject tLObject, String str) {
        if (tLObject == null && str == null) {
            this.h = null;
            this.f24234f = null;
            this.f24231b.k("");
            this.f24232c.l("", false);
            this.f24230a.setImageDrawable(null);
            return;
        }
        this.h = str;
        this.f24234f = tLObject;
        b();
    }

    public final void b() {
        TLRPC.User user;
        TLRPC.Chat chat;
        TLRPC.UserStatus userStatus;
        float f10;
        TLObject tLObject = this.f24234f;
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
        int i10 = this.f24237s;
        org.telegram.ui.Components.z8 z8Var = this.f24233e;
        if (user != null) {
            z8Var.m(i10, user);
        } else if (chat != null) {
            z8Var.k(i10, chat);
        } else {
            z8Var.n(this.f24235n, "#", null);
        }
        if (user != null) {
            this.f24236r = UserObject.getUserName(user);
        } else {
            this.f24236r = chat.title;
        }
        this.f24231b.k(this.f24236r);
        CharSequence charSequence = this.h;
        int i11 = this.v;
        org.telegram.ui.Components.p9 p9Var = this.f24230a;
        org.telegram.ui.ActionBar.l5 l5Var = this.f24232c;
        if (charSequence != null) {
            l5Var.setTextColor(i11);
            l5Var.l(this.h, false);
            if (p9Var != null) {
                p9Var.e(user, z8Var);
            }
        } else if (user != null) {
            if (user.bot) {
                l5Var.setTextColor(i11);
                if (user.bot_chat_history) {
                    l5Var.l(LocaleController.getString(R.string.BotStatusRead), false);
                } else {
                    l5Var.l(LocaleController.getString(R.string.BotStatusCantRead), false);
                }
            } else if (user.f20992id != UserConfig.getInstance(i10).getClientUserId() && (((userStatus = user.status) == null || userStatus.expires <= ConnectionsManager.getInstance(i10).getCurrentTime()) && !MessagesController.getInstance(i10).onlinePrivacy.containsKey(Long.valueOf(user.f20992id)))) {
                l5Var.setTextColor(i11);
                l5Var.l(LocaleController.formatUserStatus(i10, user), false);
            } else {
                l5Var.setTextColor(this.f24238w);
                l5Var.l(LocaleController.getString(R.string.Online), false);
            }
            p9Var.e(user, z8Var);
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
            p9Var.e(chat, z8Var);
        } else {
            p9Var.setImageDrawable(z8Var);
        }
        if (chat != null && chat.forum) {
            f10 = 14.0f;
        } else {
            f10 = 24.0f;
        }
        p9Var.setRoundRadius(AndroidUtilities.dp(f10));
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
        this.f24235n = i10;
    }

    public void setNameTypeface(Typeface typeface) {
        this.f24231b.setTypeface(typeface);
    }

    public void setCheckDisabled(boolean z4) {
    }
}
