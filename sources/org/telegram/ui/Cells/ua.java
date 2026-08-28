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
    public final org.telegram.ui.Components.o9 f25769a;
    public final dg.c f25770b;
    public final org.telegram.ui.ActionBar.h5 f25771c;
    public final ImageView d;
    public final org.telegram.ui.Components.z8 f25772e;
    public TLObject f25773f;
    public CharSequence h;
    public int f25774n;
    public String f25775r;
    public final int f25776s;
    public final int v;
    public final int f25777w;

    public ua(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        int i9;
        float f10;
        float f11;
        int i10;
        int i11;
        float f12;
        float f13;
        int i12;
        int i13;
        float f14;
        float f15;
        float f16;
        float f17;
        this.f25776s = UserConfig.selectedAccount;
        this.v = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23369y6, b6Var);
        this.f25777w = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23179n6, b6Var);
        this.f25772e = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
        this.f25769a = o9Var;
        o9Var.setRoundRadius(AndroidUtilities.dp(24.0f));
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i9 = 5;
        } else {
            i9 = 3;
        }
        int i14 = i9 | 48;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 11;
        }
        if (z10) {
            f11 = 11;
        } else {
            f11 = 0.0f;
        }
        addView(o9Var, g7.e6.d(48, 48.0f, i14, f10, 11.0f, f11, 0.0f));
        dg.c cVar = new dg.c(context, 4);
        this.f25770b = cVar;
        NotificationCenter.listenEmojiLoading(cVar);
        cVar.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, b6Var));
        cVar.setTextSize(17);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        cVar.setGravity(i10 | 48);
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i15 = i11 | 48;
        if (z11) {
            f12 = 28;
        } else {
            f12 = 72;
        }
        float f18 = f12;
        if (z11) {
            f13 = 72;
        } else {
            f13 = 28;
        }
        addView(cVar, g7.e6.d(-1, 20.0f, i15, f18, 14.5f, f13, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f25771c = h5Var;
        h5Var.setTextSize(14);
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        h5Var.setGravity(i12 | 48);
        boolean z12 = LocaleController.isRTL;
        if (z12) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        int i16 = i13 | 48;
        if (z12) {
            f14 = 28.0f;
        } else {
            f14 = 72;
        }
        if (z12) {
            f15 = 72;
        } else {
            f15 = 28.0f;
        }
        addView(h5Var, g7.e6.d(-1, 20.0f, i16, f14, 37.5f, f15, 0.0f));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23162m6, b6Var), PorterDuff.Mode.MULTIPLY));
        imageView.setVisibility(8);
        boolean z13 = LocaleController.isRTL;
        int i17 = (z13 ? 5 : 3) | 16;
        if (z13) {
            f16 = 0.0f;
        } else {
            f16 = 16.0f;
        }
        if (z13) {
            f17 = 16.0f;
        } else {
            f17 = 0.0f;
        }
        addView(imageView, g7.e6.d(-2, -2.0f, i17, f16, 0.0f, f17, 0.0f));
    }

    public final void a(TLObject tLObject, String str) {
        if (tLObject == null && str == null) {
            this.h = null;
            this.f25773f = null;
            this.f25770b.k("");
            this.f25771c.l("", false);
            this.f25769a.setImageDrawable(null);
            return;
        }
        this.h = str;
        this.f25773f = tLObject;
        b();
    }

    public final void b() {
        TLRPC.User user;
        TLRPC.Chat chat;
        TLRPC.UserStatus userStatus;
        float f10;
        TLObject tLObject = this.f25773f;
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
        int i9 = this.f25776s;
        org.telegram.ui.Components.z8 z8Var = this.f25772e;
        if (user != null) {
            z8Var.m(i9, user);
        } else if (chat != null) {
            z8Var.k(i9, chat);
        } else {
            z8Var.n(this.f25774n, "#", null);
        }
        if (user != null) {
            this.f25775r = UserObject.getUserName(user);
        } else {
            this.f25775r = chat.title;
        }
        this.f25770b.k(this.f25775r);
        CharSequence charSequence = this.h;
        int i10 = this.v;
        org.telegram.ui.Components.o9 o9Var = this.f25769a;
        org.telegram.ui.ActionBar.h5 h5Var = this.f25771c;
        if (charSequence != null) {
            h5Var.setTextColor(i10);
            h5Var.l(this.h, false);
            if (o9Var != null) {
                o9Var.e(user, z8Var);
            }
        } else if (user != null) {
            if (user.bot) {
                h5Var.setTextColor(i10);
                if (user.bot_chat_history) {
                    h5Var.l(LocaleController.getString(R.string.BotStatusRead), false);
                } else {
                    h5Var.l(LocaleController.getString(R.string.BotStatusCantRead), false);
                }
            } else if (user.f22527id != UserConfig.getInstance(i9).getClientUserId() && (((userStatus = user.status) == null || userStatus.expires <= ConnectionsManager.getInstance(i9).getCurrentTime()) && !MessagesController.getInstance(i9).onlinePrivacy.containsKey(Long.valueOf(user.f22527id)))) {
                h5Var.setTextColor(i10);
                h5Var.l(LocaleController.formatUserStatus(i9, user), false);
            } else {
                h5Var.setTextColor(this.f25777w);
                h5Var.l(LocaleController.getString(R.string.Online), false);
            }
            o9Var.e(user, z8Var);
        } else if (chat != null) {
            h5Var.setTextColor(i10);
            if (ChatObject.isChannel(chat) && !chat.megagroup) {
                int i11 = chat.participants_count;
                if (i11 != 0) {
                    h5Var.l(LocaleController.formatPluralString("Subscribers", i11, new Object[0]), false);
                } else if (!ChatObject.isPublic(chat)) {
                    h5Var.l(LocaleController.getString(R.string.ChannelPrivate), false);
                } else {
                    h5Var.l(LocaleController.getString(R.string.ChannelPublic), false);
                }
            } else {
                int i12 = chat.participants_count;
                if (i12 != 0) {
                    h5Var.l(LocaleController.formatPluralString("Members", i12, new Object[0]), false);
                } else if (chat.has_geo) {
                    h5Var.l(LocaleController.getString(R.string.MegaLocation), false);
                } else if (!ChatObject.isPublic(chat)) {
                    h5Var.l(LocaleController.getString(R.string.MegaPrivate), false);
                } else {
                    h5Var.l(LocaleController.getString(R.string.MegaPublic), false);
                }
            }
            o9Var.e(chat, z8Var);
        } else {
            o9Var.setImageDrawable(z8Var);
        }
        if (chat != null && chat.forum) {
            f10 = 14.0f;
        } else {
            f10 = 24.0f;
        }
        o9Var.setRoundRadius(AndroidUtilities.dp(f10));
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
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(70.0f), 1073741824));
    }

    public void setCurrentId(int i9) {
        this.f25774n = i9;
    }

    public void setNameTypeface(Typeface typeface) {
        this.f25770b.setTypeface(typeface);
    }

    public void setCheckDisabled(boolean z10) {
    }
}
