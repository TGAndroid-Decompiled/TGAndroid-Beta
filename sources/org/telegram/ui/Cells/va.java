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
public final class va extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.g6 f23874a;
    public final org.telegram.ui.Components.w9 f23875b;
    public final ci.k4 f23876c;
    public final org.telegram.ui.ActionBar.n5 d;
    public final ImageView e;
    public final org.telegram.ui.Components.h9 f23877f;
    public CharSequence h;
    public int f23878n;
    public String f23879r;
    public final int f23880s;
    public int v;
    public int f23881w;
    public final boolean f23882x;

    public va(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
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
        this.f23880s = UserConfig.selectedAccount;
        this.f23882x = true;
        this.f23874a = g6Var;
        this.v = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21571y6, g6Var);
        this.f23881w = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21366n6, g6Var);
        this.f23877f = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.g6) null);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.f23875b = w9Var;
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
        ci.k4 k4Var = new ci.k4(context, 3);
        this.f23876c = k4Var;
        NotificationCenter.listenEmojiLoading(k4Var);
        org.telegram.ui.ActionBar.r6.Z(k4Var, org.telegram.ui.ActionBar.k6.G6, g6Var);
        k4Var.setTextSize(17);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        k4Var.setGravity(i11 | 48);
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
        addView(k4Var, w7.z5.d(-1, 20.0f, i16, f16, 14.5f, f12, 0.0f));
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.d = n5Var;
        n5Var.setTextSize(14);
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        n5Var.setGravity(i13 | 48);
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
        addView(n5Var, w7.z5.d(-1, 20.0f, i17, f13, 37.5f, z12 ? 72 : 28.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.f21346m6, g6Var, PorterDuff.Mode.MULTIPLY);
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
        TLRPC.User user;
        TLRPC.Chat chat;
        TLRPC.UserStatus userStatus;
        float f7;
        org.telegram.ui.Components.w9 w9Var = this.f23875b;
        org.telegram.ui.ActionBar.n5 n5Var = this.d;
        ci.k4 k4Var = this.f23876c;
        if (tLObject == null && str == null) {
            this.h = null;
            k4Var.k("");
            n5Var.l("", false);
            w9Var.setImageDrawable(null);
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
        int i10 = this.f23880s;
        org.telegram.ui.Components.h9 h9Var = this.f23877f;
        if (user != null) {
            h9Var.m(i10, user);
        } else if (chat != null) {
            h9Var.k(i10, chat);
        } else {
            h9Var.n(this.f23878n, "#", null);
        }
        if (user != null) {
            this.f23879r = UserObject.getUserName(user);
        } else {
            this.f23879r = chat.title;
        }
        k4Var.k(this.f23879r);
        if (this.h != null) {
            n5Var.setTextColor(this.v);
            n5Var.l(this.h, false);
            if (w9Var != null) {
                w9Var.e(user, h9Var);
            }
        } else if (user != null) {
            if (user.bot) {
                n5Var.setTextColor(this.v);
                if (user.bot_chat_history) {
                    n5Var.l(LocaleController.getString(R.string.BotStatusRead), false);
                } else {
                    n5Var.l(LocaleController.getString(R.string.BotStatusCantRead), false);
                }
            } else if (user.f20490id != UserConfig.getInstance(i10).getClientUserId() && (((userStatus = user.status) == null || userStatus.expires <= ConnectionsManager.getInstance(i10).getCurrentTime()) && !MessagesController.getInstance(i10).onlinePrivacy.containsKey(Long.valueOf(user.f20490id)))) {
                n5Var.setTextColor(this.v);
                n5Var.l(LocaleController.formatUserStatus(i10, user), false);
            } else {
                n5Var.setTextColor(this.f23881w);
                n5Var.l(LocaleController.getString(R.string.Online), false);
            }
            w9Var.e(user, h9Var);
        } else if (chat != null) {
            n5Var.setTextColor(this.v);
            if (ChatObject.isChannel(chat) && !chat.megagroup) {
                int i11 = chat.participants_count;
                if (i11 != 0) {
                    n5Var.l(LocaleController.formatPluralString("Subscribers", i11, new Object[0]), false);
                } else if (!ChatObject.isPublic(chat)) {
                    n5Var.l(LocaleController.getString(R.string.ChannelPrivate), false);
                } else {
                    n5Var.l(LocaleController.getString(R.string.ChannelPublic), false);
                }
            } else {
                int i12 = chat.participants_count;
                if (i12 != 0) {
                    n5Var.l(LocaleController.formatPluralString("Members", i12, new Object[0]), false);
                } else if (chat.has_geo) {
                    n5Var.l(LocaleController.getString(R.string.MegaLocation), false);
                } else if (!ChatObject.isPublic(chat)) {
                    n5Var.l(LocaleController.getString(R.string.MegaPrivate), false);
                } else {
                    n5Var.l(LocaleController.getString(R.string.MegaPublic), false);
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
        this.f23878n = i10;
    }

    public void setNameTypeface(Typeface typeface) {
        this.f23876c.setTypeface(typeface);
    }

    @Override
    public final void updateColors() {
        int i10;
        int i11;
        try {
            int i12 = this.v;
            int i13 = this.f23881w;
            org.telegram.ui.ActionBar.g6 g6Var = this.f23874a;
            if (this.f23882x) {
                this.v = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21571y6, g6Var);
                this.f23881w = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21366n6, g6Var);
            }
            org.telegram.ui.ActionBar.n5 n5Var = this.d;
            if (n5Var != null) {
                int textColor = n5Var.getTextColor();
                if (textColor == i13 && i13 != (i11 = this.f23881w)) {
                    n5Var.setTextColor(i11);
                } else if (textColor == i12 && i12 != (i10 = this.v)) {
                    n5Var.setTextColor(i10);
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
