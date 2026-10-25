package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gb1;
public final class za extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final org.telegram.ui.ActionBar.u6 f25816a;
    public final org.telegram.ui.Components.y9 f25817b;
    public final di.l4 f25818c;
    public final org.telegram.ui.ActionBar.b6 d;
    public final ImageView e;
    public final org.telegram.ui.Components.j9 f25819f;
    public CharSequence h;
    public int f25820n;
    public String f25821r;
    public final int f25822s;
    public int v;
    public int f25823w;
    public final boolean f25824x;

    public za(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
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
        this.f25822s = UserConfig.selectedAccount;
        this.f25824x = true;
        this.f25816a = u6Var;
        this.v = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23746y6, u6Var);
        this.f25823w = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23538n6, u6Var);
        this.f25819f = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.f25817b = y9Var;
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
        addView(y9Var, gb1.h(48, 48.0f, i15, f7, 11.0f, f10, 0.0f));
        di.l4 l4Var = new di.l4(context, 3);
        this.f25818c = l4Var;
        NotificationCenter.listenEmojiLoading(l4Var);
        org.telegram.ui.ActionBar.f7.Y(l4Var, org.telegram.ui.ActionBar.y6.G6, u6Var);
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
        addView(l4Var, gb1.h(-1, 20.0f, i16, f16, 14.5f, f12, 0.0f));
        org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(context);
        this.d = b6Var;
        b6Var.setTextSize(14);
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        b6Var.setGravity(i13 | 48);
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
        addView(b6Var, gb1.h(-1, 20.0f, i17, f13, 37.5f, z12 ? 72 : 28.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.f7.t(imageView, org.telegram.ui.ActionBar.y6.f23518m6, u6Var, PorterDuff.Mode.MULTIPLY);
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
        addView(imageView, gb1.h(-2, -2.0f, i18, f14, 0.0f, f15, 0.0f));
    }

    public final void a(TLObject tLObject, String str) {
        TLRPC.User user;
        TLRPC.Chat chat;
        TLRPC.UserStatus userStatus;
        float f7;
        org.telegram.ui.Components.y9 y9Var = this.f25817b;
        org.telegram.ui.ActionBar.b6 b6Var = this.d;
        di.l4 l4Var = this.f25818c;
        if (tLObject == null && str == null) {
            this.h = null;
            l4Var.k("");
            b6Var.l("", false);
            y9Var.setImageDrawable(null);
            return;
        }
        this.h = str;
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
        int i10 = this.f25822s;
        org.telegram.ui.Components.j9 j9Var = this.f25819f;
        if (user != null) {
            j9Var.m(i10, user);
        } else if (chat != null) {
            j9Var.k(i10, chat);
        } else {
            j9Var.n(this.f25820n, "#", null);
        }
        if (user != null) {
            this.f25821r = UserObject.getUserName(user);
        } else {
            this.f25821r = chat.title;
        }
        l4Var.k(this.f25821r);
        if (this.h != null) {
            b6Var.setTextColor(this.v);
            b6Var.l(this.h, false);
            if (y9Var != null) {
                y9Var.f(user, j9Var);
            }
        } else if (user != null) {
            if (user.bot) {
                b6Var.setTextColor(this.v);
                if (user.bot_chat_history) {
                    b6Var.l(LocaleController.getString(R.string.BotStatusRead), false);
                } else {
                    b6Var.l(LocaleController.getString(R.string.BotStatusCantRead), false);
                }
            } else if (user.f22174id != UserConfig.getInstance(i10).getClientUserId() && (((userStatus = user.status) == null || userStatus.expires <= ConnectionsManager.getInstance(i10).getCurrentTime()) && !MessagesController.getInstance(i10).onlinePrivacy.containsKey(Long.valueOf(user.f22174id)))) {
                b6Var.setTextColor(this.v);
                b6Var.l(LocaleController.formatUserStatus(i10, user), false);
            } else {
                b6Var.setTextColor(this.f25823w);
                b6Var.l(LocaleController.getString(R.string.Online), false);
            }
            y9Var.f(user, j9Var);
        } else if (chat != null) {
            b6Var.setTextColor(this.v);
            if (ChatObject.isChannel(chat) && !chat.megagroup) {
                int i11 = chat.participants_count;
                if (i11 != 0) {
                    b6Var.l(LocaleController.formatPluralString("Subscribers", i11, new Object[0]), false);
                } else if (!ChatObject.isPublic(chat)) {
                    b6Var.l(LocaleController.getString(R.string.ChannelPrivate), false);
                } else {
                    b6Var.l(LocaleController.getString(R.string.ChannelPublic), false);
                }
            } else {
                int i12 = chat.participants_count;
                if (i12 != 0) {
                    b6Var.l(LocaleController.formatPluralString("Members", i12, new Object[0]), false);
                } else if (chat.has_geo) {
                    b6Var.l(LocaleController.getString(R.string.MegaLocation), false);
                } else if (!ChatObject.isPublic(chat)) {
                    b6Var.l(LocaleController.getString(R.string.MegaPrivate), false);
                } else {
                    b6Var.l(LocaleController.getString(R.string.MegaPublic), false);
                }
            }
            y9Var.f(chat, j9Var);
        } else {
            y9Var.setImageDrawable(j9Var);
        }
        if (chat != null && chat.forum) {
            f7 = 14.0f;
        } else {
            f7 = 24.0f;
        }
        y9Var.setRoundRadius(AndroidUtilities.dp(f7));
        ImageView imageView = this.e;
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
        this.f25820n = i10;
    }

    public void setNameTypeface(Typeface typeface) {
        this.f25818c.setTypeface(typeface);
    }

    @Override
    public final void updateColors() {
        int i10;
        int i11;
        try {
            int i12 = this.v;
            int i13 = this.f25823w;
            org.telegram.ui.ActionBar.u6 u6Var = this.f25816a;
            if (this.f25824x) {
                this.v = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23746y6, u6Var);
                this.f25823w = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23538n6, u6Var);
            }
            org.telegram.ui.ActionBar.b6 b6Var = this.d;
            if (b6Var != null) {
                int textColor = b6Var.getTextColor();
                if (textColor == i13 && i13 != (i11 = this.f25823w)) {
                    b6Var.setTextColor(i11);
                } else if (textColor == i12 && i12 != (i10 = this.v)) {
                    b6Var.setTextColor(i10);
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void setCheckDisabled(boolean z10) {
    }
}
