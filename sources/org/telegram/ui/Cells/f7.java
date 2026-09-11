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
import org.telegram.ui.Components.f01;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.pr;
public class f7 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.Components.e6 E;
    public boolean F;
    public final org.telegram.ui.Components.e6 G;
    public long H;
    public sg.c1 I;
    public Drawable J;
    public final Paint K;
    public long L;
    public f01 M;
    public final org.telegram.ui.Components.x9 f21930a;
    public final bi.c4 f21931b;
    public final org.telegram.ui.ActionBar.j5 f21932c;
    public final mp d;
    public final d7 f21933e;
    public e7 f21934f;
    public TLRPC.User h;
    public final int f21935n;
    public float f21936r;
    public long f21937s;
    public long v;
    public boolean f21938w;
    public final int f21939x;
    public final org.telegram.ui.ActionBar.f6 f21940y;

    public f7(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        int i11;
        float f7;
        float f10;
        float f11;
        this.f21939x = UserConfig.selectedAccount;
        pr prVar = pr.h;
        this.E = new org.telegram.ui.Components.e6(this, 0L, 350L, prVar);
        this.G = new org.telegram.ui.Components.e6(this, 0L, 350L, prVar);
        this.K = new Paint();
        this.f21940y = f6Var;
        this.f21933e = new d7(this, f6Var, 0);
        setWillNotDraw(false);
        this.f21935n = i10;
        org.telegram.ui.Components.x9 x9Var = new org.telegram.ui.Components.x9(context);
        this.f21930a = x9Var;
        x9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        if (i10 == 2) {
            addView(x9Var, w7.x5.d(48, 48.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        } else {
            addView(x9Var, w7.x5.d(56, 56.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        }
        bi.c4 c4Var = new bi.c4(context, 7);
        this.f21931b = c4Var;
        NotificationCenter.listenEmojiLoading(c4Var);
        if (this.F) {
            i11 = org.telegram.ui.ActionBar.j6.C6;
        } else {
            i11 = org.telegram.ui.ActionBar.j6.f20770j5;
        }
        c4Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        c4Var.setTextSize(1, 12.0f);
        c4Var.setMaxLines(2);
        c4Var.setGravity(49);
        c4Var.setLines(2);
        c4Var.setEllipsize(TextUtils.TruncateAt.END);
        if (i10 == 2) {
            f7 = 58.0f;
        } else {
            f7 = 66.0f;
        }
        addView(c4Var, w7.x5.d(-1, -2.0f, 51, 6.0f, f7, 6.0f, 0.0f));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.f21932c = j5Var;
        j5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20770j5, f6Var));
        j5Var.setTextSize(12);
        j5Var.setMaxLines(2);
        j5Var.setGravity(49);
        j5Var.setAlignment(Layout.Alignment.ALIGN_CENTER);
        if (i10 == 2) {
            f10 = 58.0f;
        } else {
            f10 = 66.0f;
        }
        addView(j5Var, w7.x5.d(-1, -2.0f, 51, 6.0f, f10, 6.0f, 0.0f));
        mp mpVar = new mp(context, 21, f6Var);
        this.d = mpVar;
        mpVar.b(org.telegram.ui.ActionBar.j6.B5, org.telegram.ui.ActionBar.j6.f20734h5, org.telegram.ui.ActionBar.j6.C5);
        mpVar.setDrawUnchecked(false);
        mpVar.setDrawBackgroundAsArc(4);
        mpVar.setProgressDelegate(new la(this, 5));
        if (i10 == 2) {
            f11 = -40.0f;
        } else {
            f11 = 42.0f;
        }
        addView(mpVar, w7.x5.d(24, 24.0f, 49, 19.0f, f11, 0.0f, 0.0f));
        setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20753i6, f6Var), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f)));
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
        d7 d7Var = this.f21933e;
        d7Var.f27038p = 1.0f;
        org.telegram.ui.ActionBar.f6 f6Var = this.f21940y;
        org.telegram.ui.Components.x9 x9Var = this.f21930a;
        bi.c4 c4Var = this.f21931b;
        if (j3 == Long.MAX_VALUE) {
            c4Var.setText(a());
            if (this.f21934f == null) {
                this.f21934f = new e7(getContext(), x9Var, true, f6Var);
            }
            x9Var.h(null, null, this.f21934f, null);
        } else {
            boolean isUserDialog = DialogObject.isUserDialog(j3);
            org.telegram.ui.Components.e6 e6Var = this.G;
            org.telegram.ui.Components.e6 e6Var2 = this.E;
            int i11 = this.f21939x;
            if (isUserDialog) {
                this.h = MessagesController.getInstance(i11).getUser(Long.valueOf(j3));
                TL_account.RequirementToContact isUserContactBlocked = MessagesController.getInstance(i11).isUserContactBlocked(j3);
                this.F = DialogObject.isPremiumBlocked(isUserContactBlocked);
                this.H = DialogObject.getMessagesStarsPrice(isUserContactBlocked);
                if (this.F) {
                    i10 = org.telegram.ui.ActionBar.j6.C6;
                } else {
                    i10 = org.telegram.ui.ActionBar.j6.f20770j5;
                }
                c4Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
                e6Var2.a(this.F);
                if (this.H > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                e6Var.a(z11);
                invalidate();
                d7Var.m(i11, this.h);
                int i12 = this.f21935n;
                if (i12 != 2 && UserObject.isReplyUser(this.h)) {
                    c4Var.setText(LocaleController.getString(R.string.RepliesTitle));
                    d7Var.g(12);
                    x9Var.h(null, null, d7Var, this.h);
                } else if (i12 != 2 && UserObject.isUserSelf(this.h)) {
                    c4Var.setText(LocaleController.getString(R.string.SavedMessages));
                    d7Var.g(1);
                    x9Var.h(null, null, d7Var, this.h);
                } else {
                    if (charSequence != null) {
                        c4Var.setText(charSequence);
                    } else {
                        TLRPC.User user = this.h;
                        if (user != null) {
                            c4Var.setText(ContactsController.formatName(user.first_name, user.last_name));
                        } else {
                            c4Var.setText("");
                        }
                    }
                    x9Var.e(this.h, d7Var);
                }
                x9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
            } else {
                this.h = null;
                this.F = false;
                e6Var2.d(0.0f, true);
                this.H = MessagesController.getInstance(i11).getSendPaidMessagesStars(j3);
                e6Var.getClass();
                e6Var.d(0.0f, true);
                TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-j3));
                if (charSequence != null) {
                    c4Var.setText(charSequence);
                } else if (chat != null) {
                    if (chat.monoforum) {
                        c4Var.setText(og.d.i(chat, i11, false));
                    } else {
                        c4Var.setText(chat.title);
                    }
                } else {
                    c4Var.setText("");
                }
                if (ChatObject.isMonoForum(chat)) {
                    og.d.o(i11, chat, d7Var, x9Var);
                } else {
                    d7Var.k(i11, chat);
                    x9Var.e(chat, d7Var);
                }
                if (chat != null && (chat.forum || chat.monoforum)) {
                    dp = AndroidUtilities.dp(16.0f);
                } else {
                    dp = AndroidUtilities.dp(28.0f);
                }
                x9Var.setRoundRadius(dp);
            }
        }
        this.v = j3;
        this.d.a(z10, false);
    }

    public final void d(TLRPC.TL_forumTopic tL_forumTopic, boolean z10, boolean z11) {
        boolean z12;
        float f7;
        boolean z13 = this.f21938w;
        if (tL_forumTopic != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z13 == z12 && z11) {
            return;
        }
        int i10 = R.id.spring_tag;
        org.telegram.ui.ActionBar.j5 j5Var = this.f21932c;
        o1.k kVar = (o1.k) j5Var.getTag(i10);
        if (kVar != null) {
            kVar.c();
        }
        if (z12) {
            if (z10) {
                j5Var.l(MessagesController.getInstance(this.f21939x).getPeerName(DialogObject.getPeerDialogId(tL_forumTopic.from_id)), false);
            } else {
                j5Var.l(og.d.j(tL_forumTopic, j5Var.getTextPaint(), null), false);
            }
            j5Var.requestLayout();
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
            kVar2.f16825u = lVar;
            kVar2.b(new o1.g() {
                @Override
                public final void a(o1.h hVar, float f11, float f12) {
                    float f13 = f11 / 1000.0f;
                    f7 f7Var = f7.this;
                    org.telegram.ui.ActionBar.j5 j5Var2 = f7Var.f21932c;
                    j5Var2.setAlpha(f13);
                    bi.c4 c4Var = f7Var.f21931b;
                    float f14 = 1.0f - f13;
                    c4Var.setAlpha(f14);
                    j5Var2.setTranslationX(f14 * (-AndroidUtilities.dp(10.0f)));
                    c4Var.setTranslationX(f13 * AndroidUtilities.dp(10.0f));
                }
            });
            kVar2.a(new o1.f() {
                @Override
                public final void a(o1.h hVar, boolean z14, float f11, float f12) {
                    f7.this.f21932c.setTag(R.id.spring_tag, null);
                }
            });
            j5Var.setTag(R.id.spring_tag, kVar2);
            kVar2.f();
        } else {
            bi.c4 c4Var = this.f21931b;
            if (z12) {
                j5Var.setAlpha(1.0f);
                c4Var.setAlpha(0.0f);
                j5Var.setTranslationX(0.0f);
                c4Var.setTranslationX(AndroidUtilities.dp(10.0f));
            } else {
                j5Var.setAlpha(0.0f);
                c4Var.setAlpha(1.0f);
                j5Var.setTranslationX(-AndroidUtilities.dp(10.0f));
                c4Var.setTranslationX(0.0f);
            }
        }
        this.f21938w = z12;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TL_account.RequirementToContact requirementToContact;
        long messagesStarsPrice;
        int i12;
        if (i10 == NotificationCenter.userIsPremiumBlockedUpadted) {
            TLRPC.User user = this.h;
            int i13 = this.f21939x;
            if (user != null) {
                requirementToContact = MessagesController.getInstance(i13).isUserContactBlocked(this.h.f20016id);
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
                    i12 = org.telegram.ui.ActionBar.j6.C6;
                } else {
                    i12 = org.telegram.ui.ActionBar.j6.f20770j5;
                }
                this.f21931b.setTextColor(org.telegram.ui.ActionBar.j6.v0(i12, this.f21940y));
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

    public org.telegram.ui.Components.x9 getImageView() {
        return this.f21930a;
    }

    public long getStarsPrice() {
        return this.H;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f21939x).addObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f21939x).removeObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        org.telegram.ui.Components.x9 x9Var = this.f21930a;
        int measuredWidth = (x9Var.getMeasuredWidth() / 2) + x9Var.getLeft();
        int measuredHeight = (x9Var.getMeasuredHeight() / 2) + x9Var.getTop();
        org.telegram.ui.ActionBar.j6.f20856o0.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.B5, this.f21940y));
        org.telegram.ui.ActionBar.j6.f20856o0.setAlpha((int) (this.d.getProgress() * 255.0f));
        if (this.f21935n == 2) {
            f7 = 24.0f;
        } else {
            f7 = 28.0f;
        }
        int dp = AndroidUtilities.dp(f7);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(measuredWidth - dp, measuredHeight - dp, measuredWidth + dp, measuredHeight + dp);
        canvas.drawRoundRect(rectF, x9Var.getRoundRadius()[0], x9Var.getRoundRadius()[0], org.telegram.ui.ActionBar.j6.f20856o0);
        super.onDraw(canvas);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.d.f28477a.f23907q) {
            accessibilityNodeInfo.setSelected(true);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        if (this.f21935n == 2) {
            f7 = 95.0f;
        } else {
            f7 = 103.0f;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7), 1073741824));
    }
}
