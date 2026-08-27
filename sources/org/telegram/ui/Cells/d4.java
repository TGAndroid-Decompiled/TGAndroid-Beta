package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.bp;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.er;

public final class d4 extends FrameLayout {
    public boolean A;
    public final int B;
    public ValueAnimator C;
    public boolean D;
    public float E;
    public final Paint F;
    public final boolean G;
    public final boolean H;
    public final org.telegram.ui.ActionBar.c6 I;
    public final org.telegram.ui.Components.y5 J;
    public boolean K;
    public long L;
    public TL_account.requirementToContactPremium M;
    public boolean N;
    public ag.i2 O;
    public Drawable P;
    public Paint Q;

    public final org.telegram.ui.Components.n9 f24204a;

    public final eg.c f24205b;

    public final org.telegram.ui.ActionBar.h5 f24206c;
    public final bp d;

    public final org.telegram.ui.Components.y8 f24207e;

    public Object f24208f;
    public CharSequence h;

    public CharSequence f24209n;

    public boolean f24210r;

    public boolean f24211s;
    public final int v;

    public final int f24212w;

    public String f24213x;

    public int f24214y;

    public d4(Context context, int i10, int i11, boolean z10) {
        this(i10, i11, context, null, z10, false);
    }

    public static org.telegram.ui.Components.y8 a(boolean z10) {
        org.telegram.ui.Components.y8 y8Var = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
        y8Var.g(8);
        y8Var.f34858p = z10 ? 0.8f : 1.1f;
        y8Var.i(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.T7, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23000a8, false));
        return y8Var;
    }

    public static dq b(Context context, boolean z10) {
        dq dqVar = new dq(new lh.v3(new ag.i2(org.telegram.ui.ActionBar.g6.Mj, org.telegram.ui.ActionBar.g6.Lj, -1, -1, null), 3), context.getResources().getDrawable(R.drawable.msg_settings_premium), 0, 0);
        if (z10) {
            int iDp = AndroidUtilities.dp(18.0f);
            int iDp2 = AndroidUtilities.dp(18.0f);
            dqVar.f27823e = iDp;
            dqVar.f27824f = iDp2;
        }
        return dqVar;
    }

    public final void c(boolean z10, boolean z11) {
        bp bpVar = this.d;
        if (bpVar != null) {
            bpVar.a(z10, z11);
            return;
        }
        if (this.v != 2 || this.D == z10) {
            return;
        }
        this.D = z10;
        ValueAnimator valueAnimator = this.C;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z11) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.C = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new r(this, 3));
            this.C.addListener(new lh.h9(this, 15));
            this.C.setDuration(180L);
            this.C.setInterpolator(er.f28123g);
            this.C.start();
        } else {
            float f10 = this.D ? 0.82f : 1.0f;
            org.telegram.ui.Components.n9 n9Var = this.f24204a;
            n9Var.setScaleX(f10);
            n9Var.setScaleY(this.D ? 0.82f : 1.0f);
            this.E = this.D ? 1.0f : 0.0f;
        }
        invalidate();
    }

    public final void d(Object obj, CharSequence charSequence, CharSequence charSequence2) {
        this.f24208f = obj;
        this.f24209n = charSequence2;
        this.h = charSequence;
        this.A = false;
        this.f24210r = false;
        this.f24211s = false;
        f(0);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        super.dispatchDraw(canvas);
        float fE = this.J.e(this.K);
        if (fE > 0.0f) {
            org.telegram.ui.Components.n9 n9Var = this.f24204a;
            float height = (n9Var.getHeight() / 2.0f) + n9Var.getY() + AndroidUtilities.dp(18.0f);
            float width = (n9Var.getWidth() / 2.0f) + n9Var.getX() + AndroidUtilities.dp(18.0f);
            canvas.save();
            Paint paint2 = org.telegram.ui.ActionBar.g6.f23333t0;
            int i10 = org.telegram.ui.ActionBar.g6.f23053d6;
            org.telegram.ui.ActionBar.c6 c6Var = this.I;
            paint2.setColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
            canvas.drawCircle(width, height, AndroidUtilities.dp(11.33f) * fE, org.telegram.ui.ActionBar.g6.f23333t0);
            if (this.M == null) {
                if (this.O == null) {
                    this.O = new ag.i2(org.telegram.ui.ActionBar.g6.Lj, org.telegram.ui.ActionBar.g6.Mj, -1, -1, this.I);
                }
                this.O.d((int) (width - AndroidUtilities.dp(10.0f)), 0.0f, (int) (height - AndroidUtilities.dp(10.0f)), (int) (AndroidUtilities.dp(10.0f) + width), 0.0f, (int) (AndroidUtilities.dp(10.0f) + height));
                paint = this.O.f458f;
            } else {
                if (this.Q == null) {
                    this.Q = new Paint();
                }
                this.Q.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23038c8, c6Var));
                paint = this.Q;
            }
            canvas.drawCircle(width, height, AndroidUtilities.dp(10.0f) * fE, paint);
            if (this.P == null) {
                Drawable drawableMutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock2).mutate();
                this.P = drawableMutate;
                drawableMutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            }
            Drawable drawable = this.P;
            drawable.setBounds((int) (width - (((drawable.getIntrinsicWidth() / 2.0f) * 0.875f) * fE)), (int) (height - (((this.P.getIntrinsicHeight() / 2.0f) * 0.875f) * fE)), (int) (((this.P.getIntrinsicWidth() / 2.0f) * 0.875f * fE) + width), (int) (((this.P.getIntrinsicHeight() / 2.0f) * 0.875f * fE) + height));
            this.P.setAlpha((int) (fE * 255.0f));
            this.P.draw(canvas);
            canvas.restore();
        }
    }

    public final void e(TLObject tLObject, String str, String str2, boolean z10) {
        d(tLObject, str, str2);
        this.A = z10;
    }

    public final void f(int i10) {
        String str;
        int i11;
        TLRPC.Chat chat;
        String str2;
        String userName;
        TLRPC.UserStatus userStatus;
        float f10;
        CharSequence charSequence;
        int i12;
        Object obj = this.f24208f;
        if (obj == null || this.f24210r || this.f24211s) {
            return;
        }
        boolean z10 = obj instanceof String;
        org.telegram.ui.ActionBar.c6 c6Var = this.I;
        boolean z11 = this.G;
        bp bpVar = this.d;
        org.telegram.ui.Components.n9 n9Var = this.f24204a;
        eg.c cVar = this.f24205b;
        org.telegram.ui.Components.y8 y8Var = this.f24207e;
        org.telegram.ui.ActionBar.h5 h5Var = this.f24206c;
        if (!z10) {
            CharSequence charSequence2 = this.f24209n;
            if (charSequence2 == null || !TextUtils.isEmpty(charSequence2)) {
                ((FrameLayout.LayoutParams) cVar.getLayoutParams()).topMargin = AndroidUtilities.dp(10.0f);
            } else {
                ((FrameLayout.LayoutParams) cVar.getLayoutParams()).topMargin = AndroidUtilities.dp(19.0f);
            }
            ViewGroup.LayoutParams layoutParams = n9Var.getLayoutParams();
            ViewGroup.LayoutParams layoutParams2 = n9Var.getLayoutParams();
            int iDp = AndroidUtilities.dp(46.0f);
            layoutParams2.height = iDp;
            layoutParams.width = iDp;
            if (bpVar != null) {
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) bpVar.getLayoutParams();
                int iDp2 = AndroidUtilities.dp(29.0f);
                int i13 = this.B;
                layoutParams3.topMargin = iDp2 + i13;
                if (LocaleController.isRTL) {
                    ((FrameLayout.LayoutParams) bpVar.getLayoutParams()).rightMargin = AndroidUtilities.dp(40.0f) + i13;
                } else {
                    ((FrameLayout.LayoutParams) bpVar.getLayoutParams()).leftMargin = AndroidUtilities.dp(40.0f) + i13;
                }
            }
            Object obj2 = this.f24208f;
            boolean z12 = obj2 instanceof TLRPC.User;
            int i14 = this.f24212w;
            if (z12) {
                TLRPC.User user = (TLRPC.User) obj2;
                if (this.H && UserObject.isUserSelf(user)) {
                    cVar.l(LocaleController.getString(R.string.SavedMessages), true);
                    h5Var.l(null, false);
                    y8Var.g(1);
                    n9Var.h(null, "50_50", y8Var, user);
                    ((FrameLayout.LayoutParams) cVar.getLayoutParams()).topMargin = AndroidUtilities.dp(19.0f);
                    return;
                }
                TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                TLRPC.FileLocation fileLocation = userProfilePhoto != null ? userProfilePhoto.photo_small : null;
                if (i10 != 0) {
                    boolean z13 = ((i10 & MessagesController.UPDATE_MASK_AVATAR) == 0 || fileLocation == null) ? false : true;
                    if (this.f24209n == null && !z13 && (i10 & MessagesController.UPDATE_MASK_STATUS) != 0) {
                        TLRPC.UserStatus userStatus2 = user.status;
                        if ((userStatus2 != null ? userStatus2.expires : 0) != this.f24214y) {
                            z13 = true;
                        }
                    }
                    if (z13 || this.h != null || this.f24213x == null || (i10 & MessagesController.UPDATE_MASK_NAME) == 0) {
                        userName = null;
                    } else {
                        userName = UserObject.getUserName(user);
                        if (!userName.equals(this.f24213x)) {
                            z13 = true;
                        }
                    }
                    if (!z13) {
                        return;
                    }
                } else {
                    userName = null;
                }
                y8Var.m(i14, user);
                TLRPC.UserStatus userStatus3 = user.status;
                this.f24214y = userStatus3 != null ? userStatus3.expires : 0;
                CharSequence charSequence3 = this.h;
                if (charSequence3 != null) {
                    this.f24213x = null;
                    cVar.l(charSequence3, true);
                } else {
                    if (userName == null) {
                        userName = UserObject.getUserName(user);
                    }
                    this.f24213x = userName;
                    cVar.l(userName, false);
                }
                if (this.f24209n == null) {
                    if (user.bot) {
                        int i15 = org.telegram.ui.ActionBar.g6.f23423y6;
                        h5Var.setTag(Integer.valueOf(i15));
                        if (z11) {
                            i15 = org.telegram.ui.ActionBar.g6.f23260og;
                        }
                        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i15, c6Var));
                        h5Var.l(LocaleController.getString(R.string.Bot), false);
                    } else if (user.f22527id == UserConfig.getInstance(i14).getClientUserId() || (((userStatus = user.status) != null && userStatus.expires > ConnectionsManager.getInstance(i14).getCurrentTime()) || MessagesController.getInstance(i14).onlinePrivacy.containsKey(Long.valueOf(user.f22527id)))) {
                        int i16 = org.telegram.ui.ActionBar.g6.f23234n6;
                        h5Var.setTag(Integer.valueOf(i16));
                        if (z11) {
                            i16 = org.telegram.ui.ActionBar.g6.f23275pg;
                        }
                        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i16, c6Var));
                        h5Var.l(LocaleController.getString(R.string.Online), false);
                    } else {
                        int i17 = org.telegram.ui.ActionBar.g6.f23423y6;
                        h5Var.setTag(Integer.valueOf(i17));
                        if (z11) {
                            i17 = org.telegram.ui.ActionBar.g6.f23260og;
                        }
                        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i17, c6Var));
                        h5Var.l(LocaleController.formatUserStatus(i14, user), false);
                    }
                    h5Var.setEmojiColor(h5Var.getTextColor());
                }
                n9Var.e(user, y8Var);
            } else {
                TLRPC.Chat chat2 = (TLRPC.Chat) obj2;
                TLRPC.ChatPhoto chatPhoto = chat2.photo;
                TLRPC.FileLocation fileLocation2 = chatPhoto != null ? chatPhoto.photo_small : null;
                if (i10 != 0) {
                    boolean z14 = ((i10 & MessagesController.UPDATE_MASK_AVATAR) == 0 || fileLocation2 == null) ? false : true;
                    if (z14 || this.h != null || (str2 = this.f24213x) == null || (i10 & MessagesController.UPDATE_MASK_NAME) == 0) {
                        str = null;
                    } else {
                        str = chat2.title;
                        if (!str.equals(str2)) {
                            z14 = true;
                        }
                    }
                    if (!z14) {
                        return;
                    }
                } else {
                    str = null;
                }
                y8Var.k(i14, chat2);
                CharSequence charSequence4 = this.h;
                if (charSequence4 != null) {
                    this.f24213x = null;
                    cVar.l(charSequence4, true);
                    i11 = 0;
                } else {
                    if (str == null) {
                        str = chat2.title;
                    }
                    this.f24213x = str;
                    i11 = 0;
                    cVar.l(str, false);
                }
                if (this.f24209n == null) {
                    int i18 = org.telegram.ui.ActionBar.g6.f23423y6;
                    h5Var.setTag(Integer.valueOf(i18));
                    if (z11) {
                        i18 = org.telegram.ui.ActionBar.g6.f23260og;
                    }
                    h5Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i18, i11));
                    h5Var.setEmojiColor(h5Var.getTextColor());
                    if (chat2.participants_count != 0) {
                        if (!ChatObject.isChannel(chat2) || chat2.megagroup) {
                            h5Var.l(LocaleController.formatPluralString("Members", chat2.participants_count, new Object[i11]), i11);
                        } else {
                            h5Var.l(LocaleController.formatPluralString("Subscribers", chat2.participants_count, new Object[i11]), i11);
                        }
                    } else if (chat2.has_geo) {
                        h5Var.l(LocaleController.getString(R.string.MegaLocation), i11);
                    } else if (ChatObject.isPublic(chat2)) {
                        if (!ChatObject.isChannel(chat2) || chat2.megagroup) {
                            h5Var.l(LocaleController.getString(R.string.MegaPublic), i11);
                        } else {
                            h5Var.l(LocaleController.getString(R.string.ChannelPublic), i11);
                        }
                    } else if (!ChatObject.isChannel(chat2) || chat2.megagroup) {
                        h5Var.l(LocaleController.getString(R.string.MegaPrivate), i11);
                    } else {
                        h5Var.l(LocaleController.getString(R.string.ChannelPrivate), i11);
                    }
                }
                n9Var.e(chat2, y8Var);
                chat = chat2;
            }
            if (chat == null && chat.forum) {
                f10 = 14.0f;
            } else {
                f10 = 24.0f;
            }
            n9Var.setRoundRadius(AndroidUtilities.dp(f10));
            charSequence = this.f24209n;
            if (charSequence != null) {
                h5Var.l(charSequence, true);
                i12 = org.telegram.ui.ActionBar.g6.f23423y6;
                h5Var.setTag(Integer.valueOf(i12));
                if (z11) {
                    i12 = org.telegram.ui.ActionBar.g6.f23260og;
                }
                h5Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i12, c6Var));
                h5Var.setEmojiColor(h5Var.getTextColor());
            }
            g();
        }
        ((FrameLayout.LayoutParams) cVar.getLayoutParams()).topMargin = AndroidUtilities.dp(15.0f);
        ViewGroup.LayoutParams layoutParams4 = n9Var.getLayoutParams();
        ViewGroup.LayoutParams layoutParams5 = n9Var.getLayoutParams();
        int iDp3 = AndroidUtilities.dp(38.0f);
        layoutParams5.height = iDp3;
        layoutParams4.width = iDp3;
        if (bpVar != null) {
            ((FrameLayout.LayoutParams) bpVar.getLayoutParams()).topMargin = AndroidUtilities.dp(25.0f);
            if (LocaleController.isRTL) {
                ((FrameLayout.LayoutParams) bpVar.getLayoutParams()).rightMargin = AndroidUtilities.dp(31.0f);
            } else {
                ((FrameLayout.LayoutParams) bpVar.getLayoutParams()).leftMargin = AndroidUtilities.dp(32.0f);
            }
        }
        String str3 = (String) this.f24208f;
        str3.getClass();
        switch (str3) {
            case "archived":
                y8Var.g(11);
                break;
            case "groups":
                y8Var.g(6);
                break;
            case "non_contacts":
                y8Var.g(5);
                break;
            case "contacts":
                y8Var.g(4);
                break;
            case "new_chats":
                y8Var.g(24);
                break;
            case "bots":
                y8Var.g(8);
                break;
            case "read":
                y8Var.g(10);
                break;
            case "muted":
                y8Var.g(9);
                break;
            case "existing_chats":
                y8Var.g(23);
                break;
            case "channels":
                y8Var.g(7);
                break;
        }
        this.f24213x = null;
        cVar.l(this.h, true);
        h5Var.l(null, false);
        n9Var.f(null, "50_50", y8Var);
        chat = null;
        if (chat == null) {
            f10 = 24.0f;
        } else {
            f10 = 24.0f;
        }
        n9Var.setRoundRadius(AndroidUtilities.dp(f10));
        charSequence = this.f24209n;
        if (charSequence != null) {
            h5Var.l(charSequence, true);
            i12 = org.telegram.ui.ActionBar.g6.f23423y6;
            h5Var.setTag(Integer.valueOf(i12));
            if (z11) {
                i12 = org.telegram.ui.ActionBar.g6.f23260og;
            }
            h5Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i12, c6Var));
            h5Var.setEmojiColor(h5Var.getTextColor());
        }
        g();
    }

    public final void g() {
        TL_account.RequirementToContact requirementToContactIsUserContactBlocked = null;
        if (this.N) {
            TL_account.requirementToContactPremium requirementtocontactpremium = this.M;
            if (requirementtocontactpremium != null) {
                requirementToContactIsUserContactBlocked = requirementtocontactpremium;
            } else if (this.f24208f instanceof TLRPC.User) {
                requirementToContactIsUserContactBlocked = MessagesController.getInstance(this.f24212w).isUserContactBlocked(((TLRPC.User) this.f24208f).f22527id);
            }
        }
        if (this.K == DialogObject.isPremiumBlocked(requirementToContactIsUserContactBlocked) && this.L == DialogObject.getMessagesStarsPrice(requirementToContactIsUserContactBlocked)) {
            return;
        }
        this.K = DialogObject.isPremiumBlocked(requirementToContactIsUserContactBlocked);
        this.L = DialogObject.getMessagesStarsPrice(requirementToContactIsUserContactBlocked);
        this.J.f(this.K, true);
        invalidate();
    }

    public bp getCheckBox() {
        return this.d;
    }

    public Object getObject() {
        return this.f24208f;
    }

    public org.telegram.ui.ActionBar.h5 getStatusTextView() {
        return this.f24206c;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float fE = this.J.e(this.K);
        org.telegram.ui.ActionBar.c6 c6Var = this.I;
        if (fE <= 0.0f && this.v == 2 && (this.D || this.E > 0.0f)) {
            int iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.W6, c6Var);
            Paint paint = this.F;
            paint.setColor(iV0);
            org.telegram.ui.Components.n9 n9Var = this.f24204a;
            canvas.drawCircle((n9Var.getMeasuredWidth() / 2) + n9Var.getLeft(), (n9Var.getMeasuredHeight() / 2) + n9Var.getTop(), (AndroidUtilities.dp(4.0f) * this.E) + AndroidUtilities.dp(18.0f), paint);
        }
        if (this.A) {
            boolean z10 = LocaleController.isRTL;
            int i10 = this.B;
            int iDp = AndroidUtilities.dp(z10 ? 0.0f : i10 + 72);
            int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(LocaleController.isRTL ? i10 + 72 : 0.0f);
            if (!this.G) {
                canvas.drawRect(iDp, getMeasuredHeight() - 1, measuredWidth, getMeasuredHeight(), org.telegram.ui.ActionBar.g6.T0("paintDivider", c6Var));
            } else {
                org.telegram.ui.ActionBar.g6.f23193l0.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23117gg, c6Var));
                canvas.drawRect(iDp, getMeasuredHeight() - 1, measuredWidth, getMeasuredHeight(), org.telegram.ui.ActionBar.g6.f23193l0);
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        bp bpVar = this.d;
        if (bpVar != null ? bpVar.f27188a.f26309q : this.D) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        Object obj = this.f24208f;
        super.onMeasure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp((!(obj instanceof String) || "premium".equalsIgnoreCase((String) obj) || "miniapps".equalsIgnoreCase((String) this.f24208f)) ? 58.0f : 50.0f), 1073741824));
    }

    public void setCheckBoxEnabled(boolean z10) {
        bp bpVar = this.d;
        if (bpVar != null) {
            bpVar.setEnabled(z10);
        }
    }

    public void setDrawDivider(boolean z10) {
        this.A = z10;
        invalidate();
    }

    public void setForbiddenCheck(boolean z10) {
        this.d.setForbidden(z10);
    }

    public d4(int i10, int i11, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, boolean z11) {
        super(context);
        this.f24212w = UserConfig.selectedAccount;
        this.J = new org.telegram.ui.Components.y5(this, 0L, 350L, er.h);
        this.I = c6Var;
        this.v = i10;
        this.G = z11;
        this.A = false;
        this.B = i11;
        this.H = z10;
        this.f24207e = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
        org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context);
        this.f24204a = n9Var;
        n9Var.setRoundRadius(AndroidUtilities.dp(24.0f));
        boolean z12 = LocaleController.isRTL;
        addView(n9Var, h7.z5.d(46, 46.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : i11 + 13, 6.0f, z12 ? i11 + 13 : 0.0f, 0.0f));
        eg.c cVar = new eg.c(context, 2);
        this.f24205b = cVar;
        NotificationCenter.listenEmojiLoading(cVar);
        cVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(z11 ? org.telegram.ui.ActionBar.g6.f23242ng : org.telegram.ui.ActionBar.g6.G6, c6Var));
        cVar.setTypeface(AndroidUtilities.bold());
        cVar.setTextSize(16);
        cVar.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z13 = LocaleController.isRTL;
        addView(cVar, h7.z5.d(-1, 20.0f, (z13 ? 5 : 3) | 48, (z13 ? 28 : 72) + i11, 10.0f, (z13 ? 72 : 28) + i11, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f24206c = h5Var;
        h5Var.setTextSize(14);
        h5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z14 = LocaleController.isRTL;
        addView(h5Var, h7.z5.d(-1, 20.0f, (z14 ? 5 : 3) | 48, (z14 ? 28 : 72) + i11, 32.0f, (z14 ? 72 : 28) + i11, 0.0f));
        if (i10 == 1) {
            bp bpVar = new bp(context, 21, c6Var);
            this.d = bpVar;
            bpVar.b(-1, org.telegram.ui.ActionBar.g6.f23053d6, org.telegram.ui.ActionBar.g6.f23182k7);
            bpVar.setDrawUnchecked(false);
            bpVar.setDrawBackgroundAsArc(3);
            boolean z15 = LocaleController.isRTL;
            addView(bpVar, h7.z5.d(24, 24.0f, (z15 ? 5 : 3) | 48, z15 ? 0.0f : i11 + 40, 33.0f, z15 ? i11 + 39 : 0.0f, 0.0f));
        } else if (i10 == 2) {
            Paint paint = new Paint(1);
            this.F = paint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
        setWillNotDraw(false);
    }
}
