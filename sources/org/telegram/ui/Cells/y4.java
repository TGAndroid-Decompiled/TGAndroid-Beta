package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

public final class y4 extends FrameLayout {
    public boolean A;
    public boolean B;
    public boolean C;
    public int D;
    public int E;
    public final int F;
    public int G;
    public x4 H;
    public final int I;
    public final jh.h7 J;

    public final w4 f25988a;

    public final org.telegram.ui.ActionBar.h5 f25989b;

    public final org.telegram.ui.ActionBar.h5 f25990c;
    public final org.telegram.ui.ActionBar.c6 d;

    public final org.telegram.ui.Components.y8 f25991e;

    public final ImageView f25992f;
    public ImageView h;

    public Object f25993n;

    public TL_stories.StoryItem f25994r;

    public CharSequence f25995s;
    public CharSequence v;

    public String f25996w;

    public int f25997x;

    public TLRPC.FileLocation f25998y;

    public y4(int i10, int i11, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context);
        this.G = -1;
        this.I = UserConfig.selectedAccount;
        this.J = new jh.h7(null, false);
        this.d = c6Var;
        this.D = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23423y6, c6Var);
        this.E = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23234n6, c6Var);
        this.F = i11;
        this.f25991e = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
        w4 w4Var = new w4(this, context, c6Var);
        this.f25988a = w4Var;
        w4Var.setRoundRadius(AndroidUtilities.dp(23.0f));
        boolean z11 = LocaleController.isRTL;
        addView(w4Var, h7.z5.d(46, 46.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : i10 + 7, 8.0f, z11 ? i10 + 7 : 0.0f, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f25989b = h5Var;
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        h5Var.setTextSize(17);
        h5Var.setTypeface(AndroidUtilities.bold());
        h5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z12 = LocaleController.isRTL;
        addView(h5Var, h7.z5.d(-1, 20.0f, (z12 ? 5 : 3) | 48, z12 ? 46.0f : i11 + 68, 11.5f, z12 ? i11 + 68 : 46.0f, 0.0f));
        NotificationCenter.listenEmojiLoading(h5Var);
        org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(context);
        this.f25990c = h5Var2;
        h5Var2.setTextSize(14);
        h5Var2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z13 = LocaleController.isRTL;
        addView(h5Var2, h7.z5.d(-1, 20.0f, (z13 ? 5 : 3) | 48, z13 ? 28.0f : i11 + 68, 34.5f, z13 ? i11 + 68 : 28.0f, 0.0f));
        if (z10) {
            ImageView imageView = new ImageView(context);
            this.f25992f = imageView;
            imageView.setFocusable(false);
            imageView.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Vh, c6Var), 1, -1));
            imageView.setImageResource(R.drawable.ic_ab_other);
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Uh, c6Var), PorterDuff.Mode.MULTIPLY));
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(imageView, h7.z5.e(60, 64, (LocaleController.isRTL ? 3 : 5) | 48));
            imageView.setOnClickListener(new a(this, 7));
            imageView.setContentDescription(LocaleController.getString(R.string.AccDescrUserOptions));
        }
    }

    public final void a() {
        this.f25988a.getImageReceiver().cancelLoadImage();
    }

    public final void b(TLObject tLObject, CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        int i10;
        int i11;
        int i12;
        float f10;
        int i13;
        int i14;
        int i15;
        float f11;
        org.telegram.ui.ActionBar.h5 h5Var = this.f25990c;
        org.telegram.ui.ActionBar.h5 h5Var2 = this.f25989b;
        if (tLObject == null) {
            this.v = null;
            this.f25995s = null;
            this.f25993n = null;
            h5Var2.l("", false);
            h5Var.l("", false);
            this.f25988a.setImageDrawable(null);
            return;
        }
        this.v = charSequence2;
        this.f25995s = charSequence;
        this.f25993n = tLObject;
        ImageView imageView = this.f25992f;
        int i16 = this.F;
        if (imageView != null) {
            boolean zD = this.H.d(this, false);
            imageView.setVisibility(zD ? 0 : 4);
            boolean z11 = LocaleController.isRTL;
            int i17 = (z11 ? 5 : 3) | 48;
            if (z11) {
                i13 = zD ? 46 : 28;
            } else {
                i13 = i16 + 68;
            }
            float f12 = i13;
            float f13 = (charSequence2 == null || charSequence2.length() > 0) ? 11.5f : 20.5f;
            if (LocaleController.isRTL) {
                i14 = i16 + 68;
            } else {
                i14 = zD ? 46 : 28;
            }
            h5Var2.setLayoutParams(h7.z5.d(-1, 20.0f, i17, f12, f13, i14, 0.0f));
            boolean z12 = LocaleController.isRTL;
            int i18 = (z12 ? 5 : 3) | 48;
            if (z12) {
                i15 = zD ? 46 : 28;
            } else {
                i15 = i16 + 68;
            }
            float f14 = i15;
            if (z12) {
                f11 = i16 + 68;
            } else {
                f11 = zD ? 46 : 28;
            }
            h5Var.setLayoutParams(h7.z5.d(-1, 20.0f, i18, f14, 34.5f, f11, 0.0f));
        } else {
            ImageView imageView2 = this.h;
            if (imageView2 != null) {
                boolean z13 = imageView2.getVisibility() == 0;
                boolean z14 = LocaleController.isRTL;
                int i19 = (z14 ? 5 : 3) | 48;
                if (z14) {
                    i10 = z13 ? 54 : 28;
                } else {
                    i10 = i16 + 68;
                }
                float f15 = i10;
                float f16 = (charSequence2 == null || charSequence2.length() > 0) ? 11.5f : 20.5f;
                if (LocaleController.isRTL) {
                    i11 = i16 + 68;
                } else {
                    i11 = z13 ? 54 : 28;
                }
                h5Var2.setLayoutParams(h7.z5.d(-1, 20.0f, i19, f15, f16, i11, 0.0f));
                boolean z15 = LocaleController.isRTL;
                int i20 = (z15 ? 5 : 3) | 48;
                if (z15) {
                    i12 = z13 ? 54 : 28;
                } else {
                    i12 = i16 + 68;
                }
                float f17 = i12;
                if (z15) {
                    f10 = i16 + 68;
                } else {
                    f10 = z13 ? 54 : 28;
                }
                h5Var.setLayoutParams(h7.z5.d(-1, 20.0f, i20, f17, 34.5f, f10, 0.0f));
            }
        }
        this.B = z10;
        setWillNotDraw(true ^ z10);
        c(0);
    }

    public final void c(int i10) {
        String str;
        String str2;
        TLRPC.FileLocation fileLocation;
        String userName;
        TLRPC.UserStatus userStatus;
        TLRPC.FileLocation fileLocation2;
        Object obj = this.f25993n;
        if (obj == null) {
            return;
        }
        boolean z10 = obj instanceof TLRPC.User;
        w4 w4Var = this.f25988a;
        org.telegram.ui.ActionBar.h5 h5Var = this.f25989b;
        boolean z11 = true;
        int i11 = this.I;
        org.telegram.ui.Components.y8 y8Var = this.f25991e;
        org.telegram.ui.ActionBar.h5 h5Var2 = this.f25990c;
        if (!z10) {
            if (!(obj instanceof TLRPC.Chat)) {
                if (obj instanceof Integer) {
                    h5Var.l(this.f25995s, false);
                    h5Var2.setTextColor(this.D);
                    h5Var2.l(this.v, false);
                    y8Var.g(3);
                    w4Var.f(null, "50_50", y8Var);
                    return;
                }
                return;
            }
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            TLRPC.ChatPhoto chatPhoto = chat.photo;
            TLRPC.FileLocation fileLocation3 = chatPhoto != null ? chatPhoto.photo_small : null;
            if (i10 != 0) {
                boolean z12 = (i10 & MessagesController.UPDATE_MASK_AVATAR) != 0 && (((fileLocation = this.f25998y) != null && fileLocation3 == null) || ((fileLocation == null && fileLocation3 != null) || !(fileLocation == null || (fileLocation.volume_id == fileLocation3.volume_id && fileLocation.local_id == fileLocation3.local_id))));
                if (z12 || this.f25995s != null || (str2 = this.f25996w) == null || (i10 & MessagesController.UPDATE_MASK_NAME) == 0) {
                    str = null;
                } else {
                    str = chat.title;
                    if (str.equals(str2)) {
                    }
                    if (!z11) {
                        return;
                    }
                }
                z11 = z12;
                if (!z11) {
                    return;
                }
            } else {
                str = null;
            }
            y8Var.k(i11, chat);
            CharSequence charSequence = this.f25995s;
            if (charSequence != null) {
                this.f25996w = null;
                h5Var.l(charSequence, false);
            } else {
                if (str == null) {
                    str = chat.title;
                }
                this.f25996w = str;
                h5Var.l(str, false);
            }
            if (this.v != null) {
                h5Var2.setTextColor(this.D);
                h5Var2.l(this.v, false);
            } else {
                h5Var2.setTextColor(this.D);
                if (chat.participants_count != 0) {
                    if (!ChatObject.isChannel(chat) || chat.megagroup) {
                        h5Var2.l(LocaleController.formatPluralString("Members", chat.participants_count, new Object[0]), false);
                    } else {
                        h5Var2.l(LocaleController.formatPluralString("Subscribers", chat.participants_count, new Object[0]), false);
                    }
                } else if (chat.has_geo) {
                    h5Var2.l(LocaleController.getString(R.string.MegaLocation), false);
                } else if (ChatObject.isPublic(chat)) {
                    h5Var2.l(LocaleController.getString(R.string.MegaPublic), false);
                } else {
                    h5Var2.l(LocaleController.getString(R.string.MegaPrivate), false);
                }
            }
            this.f25998y = fileLocation3;
            w4Var.e(chat, y8Var);
            return;
        }
        TLRPC.User user = (TLRPC.User) obj;
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        TLRPC.FileLocation fileLocation4 = userProfilePhoto != null ? userProfilePhoto.photo_small : null;
        if (i10 != 0) {
            boolean z13 = (i10 & MessagesController.UPDATE_MASK_AVATAR) != 0 && (((fileLocation2 = this.f25998y) != null && fileLocation4 == null) || ((fileLocation2 == null && fileLocation4 != null) || !(fileLocation2 == null || (fileLocation2.volume_id == fileLocation4.volume_id && fileLocation2.local_id == fileLocation4.local_id))));
            if (!z13 && (i10 & MessagesController.UPDATE_MASK_STATUS) != 0) {
                TLRPC.UserStatus userStatus2 = user.status;
                if ((userStatus2 != null ? userStatus2.expires : 0) != this.f25997x) {
                    z13 = true;
                }
            }
            if (z13 || this.f25995s != null || this.f25996w == null || (i10 & MessagesController.UPDATE_MASK_NAME) == 0) {
                userName = null;
            } else {
                userName = UserObject.getUserName(user);
                if (userName.equals(this.f25996w)) {
                }
                if (!z11) {
                    return;
                }
            }
            z11 = z13;
            if (!z11) {
                return;
            }
        } else {
            userName = null;
        }
        y8Var.m(i11, user);
        TLRPC.UserStatus userStatus3 = user.status;
        if (userStatus3 != null) {
            this.f25997x = userStatus3.expires;
        } else {
            this.f25997x = 0;
        }
        CharSequence charSequence2 = this.f25995s;
        if (charSequence2 != null) {
            this.f25996w = null;
            h5Var.l(charSequence2, false);
        } else {
            if (userName == null) {
                userName = UserObject.getUserName(user);
            }
            this.f25996w = userName;
            h5Var.l(Emoji.replaceEmoji(userName, h5Var.getPaint().getFontMetricsInt(), false), false);
        }
        if (this.v != null) {
            h5Var2.setTextColor(this.D);
            h5Var2.l(this.v, false);
        } else {
            String publicUsername = DialogObject.getPublicUsername(user);
            if (user.bot) {
                h5Var2.setTextColor(this.D);
                if (this.C && !TextUtils.isEmpty(publicUsername)) {
                    h5Var2.l(publicUsername, false);
                } else if (user.bot_chat_history || this.A) {
                    h5Var2.l(LocaleController.getString(R.string.BotStatusRead), false);
                } else {
                    h5Var2.l(LocaleController.getString(R.string.BotStatusCantRead), false);
                }
            } else if (this.C && !TextUtils.isEmpty(publicUsername)) {
                h5Var2.l(publicUsername, false);
                h5Var2.setTextColor(this.D);
            } else if (user.f22527id == UserConfig.getInstance(i11).getClientUserId() || (((userStatus = user.status) != null && userStatus.expires > ConnectionsManager.getInstance(i11).getCurrentTime()) || MessagesController.getInstance(i11).onlinePrivacy.containsKey(Long.valueOf(user.f22527id)))) {
                h5Var2.setTextColor(this.E);
                h5Var2.l(LocaleController.getString(R.string.Online), false);
            } else {
                h5Var2.setTextColor(this.D);
                h5Var2.l(LocaleController.formatUserStatus(i11, user), false);
            }
        }
        this.f25998y = fileLocation4;
        w4Var.e(user, y8Var);
    }

    public org.telegram.ui.Components.n9 getAvatarImageView() {
        return this.f25988a;
    }

    public Object getCurrentObject() {
        return this.f25993n;
    }

    public jh.h7 getStoryAvatarParams() {
        return this.J;
    }

    public TL_stories.StoryItem getStoryItem() {
        return this.f25994r;
    }

    public long getUserId() {
        Object obj = this.f25993n;
        if (obj instanceof TLRPC.User) {
            return ((TLRPC.User) obj).f22527id;
        }
        return 0L;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.B) {
            int i10 = this.G;
            if (i10 >= 0) {
                org.telegram.ui.ActionBar.g6.f23193l0.setColor(org.telegram.ui.ActionBar.g6.v0(i10, this.d));
            }
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(68.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(68.0f) : 0), getMeasuredHeight() - 1, this.G >= 0 ? org.telegram.ui.ActionBar.g6.f23193l0 : org.telegram.ui.ActionBar.g6.f23175k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f) + (this.B ? 1 : 0), 1073741824));
    }

    public void setCustomImageVisible(boolean z10) {
        ImageView imageView = this.h;
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(z10 ? 0 : 8);
    }

    public void setCustomRightImage(int i10) {
        ImageView imageView = new ImageView(getContext());
        this.h = imageView;
        imageView.setImageResource(i10);
        this.h.setScaleType(ImageView.ScaleType.CENTER);
        this.h.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23225mg, this.d), PorterDuff.Mode.MULTIPLY));
        addView(this.h, h7.z5.e(52, 64, (LocaleController.isRTL ? 3 : 5) | 48));
    }

    public void setDelegate(x4 x4Var) {
        this.H = x4Var;
    }

    public void setDividerColor(int i10) {
        this.G = i10;
    }

    public void setIsAdmin(boolean z10) {
        this.A = z10;
    }

    public void setNameColor(int i10) {
        this.f25989b.setTextColor(i10);
    }
}
