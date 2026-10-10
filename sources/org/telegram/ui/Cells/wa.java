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
    public final org.telegram.ui.Components.y9 f23700a;
    public final ai.a6 f23701b;
    public final org.telegram.ui.ActionBar.j5 f23702c;
    public final ImageView d;
    public final org.telegram.ui.Components.j9 f23703e;
    public TLObject f23704f;
    public CharSequence h;
    public int f23705n;
    public String f23706r;
    public final int f23707s;
    public final int v;
    public final int f23708w;

    public wa(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
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
        this.f23707s = UserConfig.selectedAccount;
        this.v = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21185y6, e6Var);
        this.f23708w = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20986n6, e6Var);
        this.f23703e = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.e6) null);
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.f23700a = y9Var;
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
        this.f23701b = a6Var;
        NotificationCenter.listenEmojiLoading(a6Var);
        a6Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, e6Var));
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
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.f23702c = j5Var;
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
        addView(j5Var, w7.x5.a(20.0f, f13, 37.5f, z12 ? 72 : 28.0f, 0.0f, -1, i17));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20966m6, e6Var), PorterDuff.Mode.MULTIPLY));
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
            this.f23704f = null;
            this.f23701b.k("");
            this.f23702c.l("", false);
            this.f23700a.setImageDrawable(null);
            return;
        }
        this.h = str;
        this.f23704f = tLObject;
        b();
    }

    public final void b() {
        TLRPC.User user;
        TLRPC.Chat chat;
        TLRPC.UserStatus userStatus;
        float f7;
        TLObject tLObject = this.f23704f;
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
        int i10 = this.f23707s;
        org.telegram.ui.Components.j9 j9Var = this.f23703e;
        if (user != null) {
            j9Var.m(i10, user);
        } else if (chat != null) {
            j9Var.k(i10, chat);
        } else {
            j9Var.n(this.f23705n, "#", null);
        }
        if (user != null) {
            this.f23706r = UserObject.getUserName(user);
        } else {
            this.f23706r = chat.title;
        }
        this.f23701b.k(this.f23706r);
        CharSequence charSequence = this.h;
        int i11 = this.v;
        org.telegram.ui.Components.y9 y9Var = this.f23700a;
        org.telegram.ui.ActionBar.j5 j5Var = this.f23702c;
        if (charSequence != null) {
            j5Var.setTextColor(i11);
            j5Var.l(this.h, false);
            if (y9Var != null) {
                y9Var.e(user, j9Var);
            }
        } else if (user != null) {
            if (user.bot) {
                j5Var.setTextColor(i11);
                if (user.bot_chat_history) {
                    j5Var.l(LocaleController.getString(R.string.BotStatusRead), false);
                } else {
                    j5Var.l(LocaleController.getString(R.string.BotStatusCantRead), false);
                }
            } else if (user.f20189id != UserConfig.getInstance(i10).getClientUserId() && (((userStatus = user.status) == null || userStatus.expires <= ConnectionsManager.getInstance(i10).getCurrentTime()) && !MessagesController.getInstance(i10).onlinePrivacy.containsKey(Long.valueOf(user.f20189id)))) {
                j5Var.setTextColor(i11);
                j5Var.l(LocaleController.formatUserStatus(i10, user), false);
            } else {
                j5Var.setTextColor(this.f23708w);
                j5Var.l(LocaleController.getString(R.string.Online), false);
            }
            y9Var.e(user, j9Var);
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
        this.f23705n = i10;
    }

    public void setNameTypeface(Typeface typeface) {
        this.f23701b.setTypeface(typeface);
    }

    public void setCheckDisabled(boolean z10) {
    }
}
