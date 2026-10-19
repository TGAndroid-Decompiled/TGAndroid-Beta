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
    public final org.telegram.ui.Components.w9 f23608a;
    public final ci.l4 f23609b;
    public final org.telegram.ui.ActionBar.j5 f23610c;
    public final ImageView d;
    public final org.telegram.ui.Components.h9 e;
    public TLObject f23611f;
    public CharSequence h;
    public int f23612n;
    public String f23613r;
    public final int f23614s;
    public final int v;
    public final int f23615w;

    public ua(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
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
        this.f23614s = UserConfig.selectedAccount;
        this.v = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21375y6, d6Var);
        this.f23615w = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21170n6, d6Var);
        this.e = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.f23608a = w9Var;
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
        addView(w9Var, w7.z5.d(48, 48.0f, i15, f7, 11.0f, f10, 0.0f));
        ci.l4 l4Var = new ci.l4(context, 3);
        this.f23609b = l4Var;
        NotificationCenter.listenEmojiLoading(l4Var);
        l4Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var));
        l4Var.setTextSize(17);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        l4Var.setGravity(i11 | 48);
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
        float f16 = f11;
        if (z11) {
            f12 = 72;
        } else {
            f12 = 28;
        }
        addView(l4Var, w7.z5.d(-1, 20.0f, i16, f16, 14.5f, f12, 0.0f));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.f23610c = j5Var;
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
        addView(j5Var, w7.z5.d(-1, 20.0f, i17, f13, 37.5f, z12 ? 72 : 28.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21150m6, d6Var), PorterDuff.Mode.MULTIPLY));
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
        addView(imageView, w7.z5.d(-2, -2.0f, i18, f14, 0.0f, f15, 0.0f));
    }

    public final void a(TLObject tLObject, String str) {
        if (tLObject == null && str == null) {
            this.h = null;
            this.f23611f = null;
            this.f23609b.k("");
            this.f23610c.l("", false);
            this.f23608a.setImageDrawable(null);
            return;
        }
        this.h = str;
        this.f23611f = tLObject;
        b();
    }

    public final void b() {
        TLRPC.User user;
        TLRPC.Chat chat;
        TLRPC.UserStatus userStatus;
        float f7;
        TLObject tLObject = this.f23611f;
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
        int i10 = this.f23614s;
        org.telegram.ui.Components.h9 h9Var = this.e;
        if (user != null) {
            h9Var.m(i10, user);
        } else if (chat != null) {
            h9Var.k(i10, chat);
        } else {
            h9Var.n(this.f23612n, "#", null);
        }
        if (user != null) {
            this.f23613r = UserObject.getUserName(user);
        } else {
            this.f23613r = chat.title;
        }
        this.f23609b.k(this.f23613r);
        CharSequence charSequence = this.h;
        int i11 = this.v;
        org.telegram.ui.Components.w9 w9Var = this.f23608a;
        org.telegram.ui.ActionBar.j5 j5Var = this.f23610c;
        if (charSequence != null) {
            j5Var.setTextColor(i11);
            j5Var.l(this.h, false);
            if (w9Var != null) {
                w9Var.e(user, h9Var);
            }
        } else if (user != null) {
            if (user.bot) {
                j5Var.setTextColor(i11);
                if (user.bot_chat_history) {
                    j5Var.l(LocaleController.getString(R.string.BotStatusRead), false);
                } else {
                    j5Var.l(LocaleController.getString(R.string.BotStatusCantRead), false);
                }
            } else if (user.f20420id != UserConfig.getInstance(i10).getClientUserId() && (((userStatus = user.status) == null || userStatus.expires <= ConnectionsManager.getInstance(i10).getCurrentTime()) && !MessagesController.getInstance(i10).onlinePrivacy.containsKey(Long.valueOf(user.f20420id)))) {
                j5Var.setTextColor(i11);
                j5Var.l(LocaleController.formatUserStatus(i10, user), false);
            } else {
                j5Var.setTextColor(this.f23615w);
                j5Var.l(LocaleController.getString(R.string.Online), false);
            }
            w9Var.e(user, h9Var);
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
            w9Var.e(chat, h9Var);
        } else {
            w9Var.setImageDrawable(h9Var);
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
        this.f23612n = i10;
    }

    public void setNameTypeface(Typeface typeface) {
        this.f23609b.setTypeface(typeface);
    }

    public void setCheckDisabled(boolean z10) {
    }
}
