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
    public final org.telegram.ui.Components.t9 f25249a;
    public final gg.c f25250b;
    public final org.telegram.ui.ActionBar.h5 f25251c;
    public final ImageView d;
    public final org.telegram.ui.Components.e9 f25252e;
    public TLObject f25253f;
    public CharSequence h;
    public int f25254n;
    public String f25255r;
    public final int f25256s;
    public final int v;
    public final int f25257w;

    public ra(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        int i10;
        float f9;
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
        this.f25256s = UserConfig.selectedAccount;
        this.v = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23433y6, c6Var);
        this.f25257w = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23241n6, c6Var);
        this.f25252e = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
        org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(context);
        this.f25249a = t9Var;
        t9Var.setRoundRadius(AndroidUtilities.dp(24.0f));
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        int i15 = i10 | 48;
        if (z10) {
            f9 = 0.0f;
        } else {
            f9 = 11;
        }
        if (z10) {
            f10 = 11;
        } else {
            f10 = 0.0f;
        }
        addView(t9Var, i7.f6.d(48, 48.0f, i15, f9, 11.0f, f10, 0.0f));
        gg.c cVar = new gg.c(context, 4);
        this.f25250b = cVar;
        NotificationCenter.listenEmojiLoading(cVar);
        cVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        cVar.setTextSize(17);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        cVar.setGravity(i11 | 48);
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
        addView(cVar, i7.f6.d(-1, 20.0f, i16, f17, 14.5f, f12, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f25251c = h5Var;
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
        if (z12) {
            f14 = 72;
        } else {
            f14 = 28.0f;
        }
        addView(h5Var, i7.f6.d(-1, 20.0f, i17, f13, 37.5f, f14, 0.0f));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23223m6, c6Var), PorterDuff.Mode.MULTIPLY));
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
        addView(imageView, i7.f6.d(-2, -2.0f, i18, f15, 0.0f, f16, 0.0f));
    }

    public final void a(TLObject tLObject, String str) {
        if (tLObject == null && str == null) {
            this.h = null;
            this.f25253f = null;
            this.f25250b.k("");
            this.f25251c.l("", false);
            this.f25249a.setImageDrawable(null);
            return;
        }
        this.h = str;
        this.f25253f = tLObject;
        b();
    }

    public final void b() {
        TLRPC.User user;
        TLRPC.Chat chat;
        TLRPC.UserStatus userStatus;
        float f9;
        TLObject tLObject = this.f25253f;
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
        int i10 = this.f25256s;
        org.telegram.ui.Components.e9 e9Var = this.f25252e;
        if (user != null) {
            e9Var.m(i10, user);
        } else if (chat != null) {
            e9Var.k(i10, chat);
        } else {
            e9Var.n(this.f25254n, "#", null);
        }
        if (user != null) {
            this.f25255r = UserObject.getUserName(user);
        } else {
            this.f25255r = chat.title;
        }
        this.f25250b.k(this.f25255r);
        CharSequence charSequence = this.h;
        int i11 = this.v;
        org.telegram.ui.Components.t9 t9Var = this.f25249a;
        org.telegram.ui.ActionBar.h5 h5Var = this.f25251c;
        if (charSequence != null) {
            h5Var.setTextColor(i11);
            h5Var.l(this.h, false);
            if (t9Var != null) {
                t9Var.e(user, e9Var);
            }
        } else if (user != null) {
            if (user.bot) {
                h5Var.setTextColor(i11);
                if (user.bot_chat_history) {
                    h5Var.l(LocaleController.getString(R.string.BotStatusRead), false);
                } else {
                    h5Var.l(LocaleController.getString(R.string.BotStatusCantRead), false);
                }
            } else if (user.f22539id != UserConfig.getInstance(i10).getClientUserId() && (((userStatus = user.status) == null || userStatus.expires <= ConnectionsManager.getInstance(i10).getCurrentTime()) && !MessagesController.getInstance(i10).onlinePrivacy.containsKey(Long.valueOf(user.f22539id)))) {
                h5Var.setTextColor(i11);
                h5Var.l(LocaleController.formatUserStatus(i10, user), false);
            } else {
                h5Var.setTextColor(this.f25257w);
                h5Var.l(LocaleController.getString(R.string.Online), false);
            }
            t9Var.e(user, e9Var);
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
            t9Var.e(chat, e9Var);
        } else {
            t9Var.setImageDrawable(e9Var);
        }
        if (chat != null && chat.forum) {
            f9 = 14.0f;
        } else {
            f9 = 24.0f;
        }
        t9Var.setRoundRadius(AndroidUtilities.dp(f9));
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
        this.f25254n = i10;
    }

    public void setNameTypeface(Typeface typeface) {
        this.f25250b.setTypeface(typeface);
    }

    public void setCheckDisabled(boolean z10) {
    }
}
