package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.js;
import org.telegram.ui.Components.r11;
public class f7 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.Components.g6 E;
    public boolean F;
    public final org.telegram.ui.Components.g6 G;
    public long H;
    public rg.a1 I;
    public Drawable J;
    public final Paint K;
    public long L;
    public r11 M;
    public final org.telegram.ui.Components.y9 f21850a;
    public final ai.q4 f21851b;
    public final org.telegram.ui.ActionBar.h5 f21852c;
    public final fq d;
    public final d7 f21853e;
    public e7 f21854f;
    public TLRPC.User h;
    public final int f21855n;
    public float f21856r;
    public long f21857s;
    public long v;
    public boolean f21858w;
    public final int f21859x;
    public final org.telegram.ui.ActionBar.c6 f21860y;

    public f7(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        int i11;
        float f7;
        float f10;
        float f11;
        this.f21859x = UserConfig.selectedAccount;
        js jsVar = js.h;
        this.E = new org.telegram.ui.Components.g6(this, 0L, 350L, jsVar);
        this.G = new org.telegram.ui.Components.g6(this, 0L, 350L, jsVar);
        this.K = new Paint();
        this.f21860y = c6Var;
        this.f21853e = new d7(this, c6Var, 0);
        setWillNotDraw(false);
        this.f21855n = i10;
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.f21850a = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        if (i10 == 2) {
            addView(y9Var, w7.w5.a(48.0f, 0.0f, 7.0f, 0.0f, 0.0f, 48, 49));
        } else {
            addView(y9Var, w7.w5.a(56.0f, 0.0f, 7.0f, 0.0f, 0.0f, 56, 49));
        }
        ai.q4 q4Var = new ai.q4(context, 7);
        this.f21851b = q4Var;
        NotificationCenter.listenEmojiLoading(q4Var);
        if (this.F) {
            i11 = org.telegram.ui.ActionBar.h6.C6;
        } else {
            i11 = org.telegram.ui.ActionBar.h6.f20668j5;
        }
        q4Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, c6Var));
        q4Var.setTextSize(1, 12.0f);
        q4Var.setMaxLines(2);
        q4Var.setGravity(49);
        q4Var.setLines(2);
        q4Var.setEllipsize(TextUtils.TruncateAt.END);
        if (i10 == 2) {
            f7 = 58.0f;
        } else {
            f7 = 66.0f;
        }
        addView(q4Var, w7.w5.a(-2.0f, 6.0f, f7, 6.0f, 0.0f, -1, 51));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f21852c = h5Var;
        h5Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20668j5, c6Var));
        h5Var.setTextSize(12);
        h5Var.setMaxLines(2);
        h5Var.setGravity(49);
        h5Var.setAlignment(Layout.Alignment.ALIGN_CENTER);
        if (i10 == 2) {
            f10 = 58.0f;
        } else {
            f10 = 66.0f;
        }
        addView(h5Var, w7.w5.a(-2.0f, 6.0f, f10, 6.0f, 0.0f, -1, 51));
        fq fqVar = new fq(context, 21, c6Var);
        this.d = fqVar;
        fqVar.b(org.telegram.ui.ActionBar.h6.B5, org.telegram.ui.ActionBar.h6.f20631h5, org.telegram.ui.ActionBar.h6.C5);
        fqVar.setDrawUnchecked(false);
        fqVar.setDrawBackgroundAsArc(4);
        fqVar.setProgressDelegate(new ja(this, 5));
        if (i10 == 2) {
            f11 = -40.0f;
        } else {
            f11 = 42.0f;
        }
        addView(fqVar, w7.w5.a(24.0f, 19.0f, f11, 0.0f, 0.0f, 24, 49));
        setBackground(org.telegram.ui.ActionBar.h6.Z(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20651i6, c6Var), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f)));
    }

    public String a() {
        return LocaleController.getString(R.string.FwdMyStory);
    }

    public final void b(boolean z10, boolean z11) {
        this.d.a(z10, z11);
        if (!z10) {
            d(null, false, true);
        }
    }

    public final void c(long j3, boolean z10, CharSequence charSequence) {
        int dp;
        int i10;
        boolean z11;
        d7 d7Var = this.f21853e;
        d7Var.f27403p = 1.0f;
        int i11 = (j3 > Long.MAX_VALUE ? 1 : (j3 == Long.MAX_VALUE ? 0 : -1));
        org.telegram.ui.ActionBar.c6 c6Var = this.f21860y;
        org.telegram.ui.Components.y9 y9Var = this.f21850a;
        ai.q4 q4Var = this.f21851b;
        if (i11 == 0) {
            q4Var.setText(a());
            if (this.f21854f == null) {
                this.f21854f = new e7(getContext(), y9Var, true, c6Var);
            }
            y9Var.h(null, null, this.f21854f, null);
        } else {
            boolean isUserDialog = DialogObject.isUserDialog(j3);
            org.telegram.ui.Components.g6 g6Var = this.G;
            org.telegram.ui.Components.g6 g6Var2 = this.E;
            int i12 = this.f21859x;
            if (isUserDialog) {
                this.h = MessagesController.getInstance(i12).getUser(Long.valueOf(j3));
                TL_account.RequirementToContact isUserContactBlocked = MessagesController.getInstance(i12).isUserContactBlocked(j3);
                this.F = DialogObject.isPremiumBlocked(isUserContactBlocked);
                this.H = DialogObject.getMessagesStarsPrice(isUserContactBlocked);
                if (this.F) {
                    i10 = org.telegram.ui.ActionBar.h6.C6;
                } else {
                    i10 = org.telegram.ui.ActionBar.h6.f20668j5;
                }
                q4Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i10, c6Var));
                g6Var2.a(this.F);
                if (this.H > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                g6Var.a(z11);
                invalidate();
                d7Var.m(i12, this.h);
                int i13 = this.f21855n;
                if (i13 != 2 && UserObject.isReplyUser(this.h)) {
                    q4Var.setText(LocaleController.getString(R.string.RepliesTitle));
                    d7Var.g(12);
                    y9Var.h(null, null, d7Var, this.h);
                } else if (i13 != 2 && UserObject.isUserSelf(this.h)) {
                    q4Var.setText(LocaleController.getString(R.string.SavedMessages));
                    d7Var.g(1);
                    y9Var.h(null, null, d7Var, this.h);
                } else {
                    if (charSequence != null) {
                        q4Var.setText(charSequence);
                    } else {
                        TLRPC.User user = this.h;
                        if (user != null) {
                            q4Var.setText(ContactsController.formatName(user.first_name, user.last_name));
                        } else {
                            q4Var.setText("");
                        }
                    }
                    y9Var.e(this.h, d7Var);
                }
                y9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
            } else {
                this.h = null;
                this.F = false;
                g6Var2.d(0.0f, true);
                this.H = MessagesController.getInstance(i12).getSendPaidMessagesStars(j3);
                g6Var.getClass();
                g6Var.d(0.0f, true);
                TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-j3));
                if (charSequence != null) {
                    q4Var.setText(charSequence);
                } else if (chat != null) {
                    if (chat.monoforum) {
                        q4Var.setText(ng.d.i(chat, i12, false));
                    } else {
                        q4Var.setText(chat.title);
                    }
                } else {
                    q4Var.setText("");
                }
                if (ChatObject.isMonoForum(chat)) {
                    ng.d.o(i12, chat, d7Var, y9Var);
                } else {
                    d7Var.k(i12, chat);
                    y9Var.e(chat, d7Var);
                }
                if (chat != null && (chat.forum || chat.monoforum)) {
                    dp = AndroidUtilities.dp(16.0f);
                } else {
                    dp = AndroidUtilities.dp(28.0f);
                }
                y9Var.setRoundRadius(dp);
            }
        }
        this.v = j3;
        this.d.a(z10, false);
    }

    public final void d(TLRPC.TL_forumTopic tL_forumTopic, boolean z10, boolean z11) {
        boolean z12;
        float f7;
        boolean z13 = this.f21858w;
        if (tL_forumTopic != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z13 == z12 && z11) {
            return;
        }
        int i10 = R.id.spring_tag;
        org.telegram.ui.ActionBar.h5 h5Var = this.f21852c;
        o1.k kVar = (o1.k) h5Var.getTag(i10);
        if (kVar != null) {
            kVar.c();
        }
        if (z12) {
            if (z10) {
                h5Var.l(MessagesController.getInstance(this.f21859x).getPeerName(DialogObject.getPeerDialogId(tL_forumTopic.from_id)), false);
            } else {
                h5Var.l(ng.d.j(tL_forumTopic, h5Var.getTextPaint(), null), false);
            }
            h5Var.requestLayout();
        }
        float f10 = 0.0f;
        if (z11) {
            if (z12) {
                f7 = 0.0f;
            } else {
                f7 = 1000.0f;
            }
            o1.k kVar2 = new o1.k(new o1.j(f7));
            if (z12) {
                f10 = 1000.0f;
            }
            o1.l lVar = new o1.l(f10);
            lVar.b(1500.0f);
            lVar.a(1.0f);
            kVar2.f16691u = lVar;
            kVar2.b(new o1.g() {
                @Override
                public final void a(o1.h hVar, float f11, float f12) {
                    float f13 = f11 / 1000.0f;
                    f7 f7Var = f7.this;
                    org.telegram.ui.ActionBar.h5 h5Var2 = f7Var.f21852c;
                    h5Var2.setAlpha(f13);
                    ai.q4 q4Var = f7Var.f21851b;
                    float f14 = 1.0f - f13;
                    q4Var.setAlpha(f14);
                    h5Var2.setTranslationX(f14 * (-AndroidUtilities.dp(10.0f)));
                    q4Var.setTranslationX(f13 * AndroidUtilities.dp(10.0f));
                }
            });
            kVar2.a(new o1.f() {
                @Override
                public final void a(o1.h hVar, boolean z14, float f11, float f12) {
                    f7.this.f21852c.setTag(R.id.spring_tag, null);
                }
            });
            h5Var.setTag(R.id.spring_tag, kVar2);
            kVar2.h();
        } else {
            ai.q4 q4Var = this.f21851b;
            if (z12) {
                h5Var.setAlpha(1.0f);
                q4Var.setAlpha(0.0f);
                h5Var.setTranslationX(0.0f);
                q4Var.setTranslationX(AndroidUtilities.dp(10.0f));
            } else {
                h5Var.setAlpha(0.0f);
                q4Var.setAlpha(1.0f);
                h5Var.setTranslationX(-AndroidUtilities.dp(10.0f));
                q4Var.setTranslationX(0.0f);
            }
        }
        this.f21858w = z12;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TL_account.RequirementToContact requirementToContact;
        long messagesStarsPrice;
        int i12;
        if (i10 == NotificationCenter.userIsPremiumBlockedUpadted) {
            TLRPC.User user = this.h;
            int i13 = this.f21859x;
            if (user != null) {
                requirementToContact = MessagesController.getInstance(i13).isUserContactBlocked(this.h.f19950id);
            } else {
                requirementToContact = null;
            }
            if (this.v < 0) {
                messagesStarsPrice = MessagesController.getInstance(i13).getSendPaidMessagesStars(this.v);
            } else {
                messagesStarsPrice = DialogObject.getMessagesStarsPrice(requirementToContact);
            }
            if (this.F != DialogObject.isPremiumBlocked(requirementToContact) || this.H != messagesStarsPrice) {
                boolean isPremiumBlocked = DialogObject.isPremiumBlocked(requirementToContact);
                this.F = isPremiumBlocked;
                this.H = messagesStarsPrice;
                if (isPremiumBlocked) {
                    i12 = org.telegram.ui.ActionBar.h6.C6;
                } else {
                    i12 = org.telegram.ui.ActionBar.h6.f20668j5;
                }
                this.f21851b.setTextColor(org.telegram.ui.ActionBar.h6.w0(i12, this.f21860y));
                invalidate();
            }
        }
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r27, android.view.View r28, long r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.f7.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public long getCurrentDialog() {
        return this.v;
    }

    public org.telegram.ui.Components.y9 getImageView() {
        return this.f21850a;
    }

    public long getStarsPrice() {
        return this.H;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f21859x).addObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f21859x).removeObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        org.telegram.ui.Components.y9 y9Var = this.f21850a;
        int measuredWidth = (y9Var.getMeasuredWidth() / 2) + y9Var.getLeft();
        int measuredHeight = (y9Var.getMeasuredHeight() / 2) + y9Var.getTop();
        org.telegram.ui.ActionBar.h6.f20757o0.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.B5, this.f21860y));
        org.telegram.ui.ActionBar.h6.f20757o0.setAlpha((int) (this.d.getProgress() * 255.0f));
        if (this.f21855n == 2) {
            f7 = 24.0f;
        } else {
            f7 = 28.0f;
        }
        int dp = AndroidUtilities.dp(f7);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(measuredWidth - dp, measuredHeight - dp, measuredWidth + dp, measuredHeight + dp);
        canvas.drawRoundRect(rectF, y9Var.getRoundRadius()[0], y9Var.getRoundRadius()[0], org.telegram.ui.ActionBar.h6.f20757o0);
        super.onDraw(canvas);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.d.f26152a.f23875q) {
            accessibilityNodeInfo.setSelected(true);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        if (this.f21855n == 2) {
            f7 = 95.0f;
        } else {
            f7 = 103.0f;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7), 1073741824));
    }
}
