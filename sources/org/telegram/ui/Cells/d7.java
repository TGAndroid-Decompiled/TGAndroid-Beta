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
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.kp;
import org.telegram.ui.Components.mr;
public class d7 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.Components.z5 B;
    public boolean C;
    public final org.telegram.ui.Components.z5 D;
    public long E;
    public eg.q1 F;
    public Drawable G;
    public final Paint H;
    public long I;
    public k01 J;
    public final org.telegram.ui.Components.p9 f20937a;
    public final gg.q f20938b;
    public final org.telegram.ui.ActionBar.k5 f20939c;
    public final kp d;
    public final b7 e;
    public c7 f20940f;
    public TLRPC.User h;
    public final int f20941n;
    public float f20942r;
    public long f20943s;
    public long v;
    public boolean f20944w;
    public final int f20945x;
    public final org.telegram.ui.ActionBar.f6 f20946y;

    public d7(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        int i11;
        float f10;
        float f11;
        float f12;
        this.f20945x = UserConfig.selectedAccount;
        mr mrVar = mr.h;
        this.B = new org.telegram.ui.Components.z5(this, 0L, 350L, mrVar);
        this.D = new org.telegram.ui.Components.z5(this, 0L, 350L, mrVar);
        this.H = new Paint();
        this.f20946y = f6Var;
        this.e = new b7(this, f6Var, 0);
        setWillNotDraw(false);
        this.f20941n = i10;
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.f20937a = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        if (i10 == 2) {
            addView(p9Var, k7.b6.d(48, 48.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        } else {
            addView(p9Var, k7.b6.d(56, 56.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        }
        gg.q qVar = new gg.q(context, 6);
        this.f20938b = qVar;
        NotificationCenter.listenEmojiLoading(qVar);
        if (this.C) {
            i11 = org.telegram.ui.ActionBar.j6.C6;
        } else {
            i11 = org.telegram.ui.ActionBar.j6.f19987j5;
        }
        qVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        qVar.setTextSize(1, 12.0f);
        qVar.setMaxLines(2);
        qVar.setGravity(49);
        qVar.setLines(2);
        qVar.setEllipsize(TextUtils.TruncateAt.END);
        if (i10 == 2) {
            f10 = 58.0f;
        } else {
            f10 = 66.0f;
        }
        addView(qVar, k7.b6.d(-1, -2.0f, 51, 6.0f, f10, 6.0f, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.f20939c = k5Var;
        k5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19987j5, f6Var));
        k5Var.setTextSize(12);
        k5Var.setMaxLines(2);
        k5Var.setGravity(49);
        k5Var.setAlignment(Layout.Alignment.ALIGN_CENTER);
        if (i10 == 2) {
            f11 = 58.0f;
        } else {
            f11 = 66.0f;
        }
        addView(k5Var, k7.b6.d(-1, -2.0f, 51, 6.0f, f11, 6.0f, 0.0f));
        kp kpVar = new kp(context, 21, f6Var);
        this.d = kpVar;
        kpVar.b(org.telegram.ui.ActionBar.j6.B5, org.telegram.ui.ActionBar.j6.f19952h5, org.telegram.ui.ActionBar.j6.C5);
        kpVar.setDrawUnchecked(false);
        kpVar.setDrawBackgroundAsArc(4);
        kpVar.setProgressDelegate(new ga(this, 5));
        if (i10 == 2) {
            f12 = -40.0f;
        } else {
            f12 = 42.0f;
        }
        addView(kpVar, k7.b6.d(24, 24.0f, 49, 19.0f, f12, 0.0f, 0.0f));
        setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19971i6, f6Var), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f)));
    }

    public String a() {
        return LocaleController.getString(R.string.FwdMyStory);
    }

    public final void b(boolean z4, boolean z10) {
        this.d.a(z4, z10);
        if (!z4) {
            d(null, false, true);
        }
    }

    public final void c(long j10, boolean z4, CharSequence charSequence) {
        int dp;
        int i10;
        boolean z10;
        b7 b7Var = this.e;
        b7Var.f31293p = 1.0f;
        org.telegram.ui.ActionBar.f6 f6Var = this.f20946y;
        org.telegram.ui.Components.p9 p9Var = this.f20937a;
        gg.q qVar = this.f20938b;
        if (j10 == Long.MAX_VALUE) {
            qVar.setText(a());
            if (this.f20940f == null) {
                this.f20940f = new c7(getContext(), p9Var, true, f6Var);
            }
            p9Var.h(null, null, this.f20940f, null);
        } else {
            boolean isUserDialog = DialogObject.isUserDialog(j10);
            org.telegram.ui.Components.z5 z5Var = this.D;
            org.telegram.ui.Components.z5 z5Var2 = this.B;
            int i11 = this.f20945x;
            if (isUserDialog) {
                this.h = MessagesController.getInstance(i11).getUser(Long.valueOf(j10));
                TL_account.RequirementToContact isUserContactBlocked = MessagesController.getInstance(i11).isUserContactBlocked(j10);
                this.C = DialogObject.isPremiumBlocked(isUserContactBlocked);
                this.E = DialogObject.getMessagesStarsPrice(isUserContactBlocked);
                if (this.C) {
                    i10 = org.telegram.ui.ActionBar.j6.C6;
                } else {
                    i10 = org.telegram.ui.ActionBar.j6.f19987j5;
                }
                qVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
                z5Var2.a(this.C);
                if (this.E > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z5Var.a(z10);
                invalidate();
                b7Var.m(i11, this.h);
                int i12 = this.f20941n;
                if (i12 != 2 && UserObject.isReplyUser(this.h)) {
                    qVar.setText(LocaleController.getString(R.string.RepliesTitle));
                    b7Var.g(12);
                    p9Var.h(null, null, b7Var, this.h);
                } else if (i12 != 2 && UserObject.isUserSelf(this.h)) {
                    qVar.setText(LocaleController.getString(R.string.SavedMessages));
                    b7Var.g(1);
                    p9Var.h(null, null, b7Var, this.h);
                } else {
                    if (charSequence != null) {
                        qVar.setText(charSequence);
                    } else {
                        TLRPC.User user = this.h;
                        if (user != null) {
                            qVar.setText(ContactsController.formatName(user.first_name, user.last_name));
                        } else {
                            qVar.setText("");
                        }
                    }
                    p9Var.e(this.h, b7Var);
                }
                p9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
            } else {
                this.h = null;
                this.C = false;
                z5Var2.d(0.0f, true);
                this.E = MessagesController.getInstance(i11).getSendPaidMessagesStars(j10);
                z5Var.getClass();
                z5Var.d(0.0f, true);
                TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-j10));
                if (charSequence != null) {
                    qVar.setText(charSequence);
                } else if (chat != null) {
                    if (chat.monoforum) {
                        qVar.setText(ag.f.i(chat, i11, false));
                    } else {
                        qVar.setText(chat.title);
                    }
                } else {
                    qVar.setText("");
                }
                if (ChatObject.isMonoForum(chat)) {
                    ag.f.o(i11, chat, b7Var, p9Var);
                } else {
                    b7Var.k(i11, chat);
                    p9Var.e(chat, b7Var);
                }
                if (chat != null && (chat.forum || chat.monoforum)) {
                    dp = AndroidUtilities.dp(16.0f);
                } else {
                    dp = AndroidUtilities.dp(28.0f);
                }
                p9Var.setRoundRadius(dp);
            }
        }
        this.v = j10;
        this.d.a(z4, false);
    }

    public final void d(TLRPC.TL_forumTopic tL_forumTopic, boolean z4, boolean z10) {
        boolean z11;
        float f10;
        boolean z12 = this.f20944w;
        if (tL_forumTopic != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z12 == z11 && z10) {
            return;
        }
        int i10 = R.id.spring_tag;
        org.telegram.ui.ActionBar.k5 k5Var = this.f20939c;
        o1.j jVar = (o1.j) k5Var.getTag(i10);
        if (jVar != null) {
            jVar.c();
        }
        if (z11) {
            if (z4) {
                k5Var.l(MessagesController.getInstance(this.f20945x).getPeerName(DialogObject.getPeerDialogId(tL_forumTopic.from_id)), false);
            } else {
                k5Var.l(ag.f.j(tL_forumTopic, k5Var.getTextPaint(), null), false);
            }
            k5Var.requestLayout();
        }
        float f11 = 0.0f;
        if (z10) {
            if (z11) {
                f10 = 0.0f;
            } else {
                f10 = 1000.0f;
            }
            o1.j jVar2 = new o1.j(new kb.a(f10));
            if (z11) {
                f11 = 1000.0f;
            }
            o1.k kVar = new o1.k(f11);
            kVar.b(1500.0f);
            kVar.a(1.0f);
            jVar2.f16178u = kVar;
            jVar2.b(new o1.g() {
                @Override
                public final void a(o1.h hVar, float f12, float f13) {
                    float f14 = f12 / 1000.0f;
                    d7 d7Var = d7.this;
                    org.telegram.ui.ActionBar.k5 k5Var2 = d7Var.f20939c;
                    k5Var2.setAlpha(f14);
                    gg.q qVar = d7Var.f20938b;
                    float f15 = 1.0f - f14;
                    qVar.setAlpha(f15);
                    k5Var2.setTranslationX(f15 * (-AndroidUtilities.dp(10.0f)));
                    qVar.setTranslationX(f14 * AndroidUtilities.dp(10.0f));
                }
            });
            jVar2.a(new o1.f() {
                @Override
                public final void a(o1.h hVar, boolean z13, float f12, float f13) {
                    d7.this.f20939c.setTag(R.id.spring_tag, null);
                }
            });
            k5Var.setTag(R.id.spring_tag, jVar2);
            jVar2.f();
        } else {
            gg.q qVar = this.f20938b;
            if (z11) {
                k5Var.setAlpha(1.0f);
                qVar.setAlpha(0.0f);
                k5Var.setTranslationX(0.0f);
                qVar.setTranslationX(AndroidUtilities.dp(10.0f));
            } else {
                k5Var.setAlpha(0.0f);
                qVar.setAlpha(1.0f);
                k5Var.setTranslationX(-AndroidUtilities.dp(10.0f));
                qVar.setTranslationX(0.0f);
            }
        }
        this.f20944w = z11;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TL_account.RequirementToContact requirementToContact;
        long messagesStarsPrice;
        int i12;
        if (i10 == NotificationCenter.userIsPremiumBlockedUpadted) {
            TLRPC.User user = this.h;
            int i13 = this.f20945x;
            if (user != null) {
                requirementToContact = MessagesController.getInstance(i13).isUserContactBlocked(this.h.f19306id);
            } else {
                requirementToContact = null;
            }
            if (this.v < 0) {
                messagesStarsPrice = MessagesController.getInstance(i13).getSendPaidMessagesStars(this.v);
            } else {
                messagesStarsPrice = DialogObject.getMessagesStarsPrice(requirementToContact);
            }
            if (this.C != DialogObject.isPremiumBlocked(requirementToContact) || this.E != messagesStarsPrice) {
                boolean isPremiumBlocked = DialogObject.isPremiumBlocked(requirementToContact);
                this.C = isPremiumBlocked;
                this.E = messagesStarsPrice;
                if (isPremiumBlocked) {
                    i12 = org.telegram.ui.ActionBar.j6.C6;
                } else {
                    i12 = org.telegram.ui.ActionBar.j6.f19987j5;
                }
                this.f20938b.setTextColor(org.telegram.ui.ActionBar.j6.v0(i12, this.f20946y));
                invalidate();
            }
        }
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r27, android.view.View r28, long r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.d7.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public long getCurrentDialog() {
        return this.v;
    }

    public org.telegram.ui.Components.p9 getImageView() {
        return this.f20937a;
    }

    public long getStarsPrice() {
        return this.E;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f20945x).addObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f20945x).removeObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        org.telegram.ui.Components.p9 p9Var = this.f20937a;
        int measuredWidth = (p9Var.getMeasuredWidth() / 2) + p9Var.getLeft();
        int measuredHeight = (p9Var.getMeasuredHeight() / 2) + p9Var.getTop();
        org.telegram.ui.ActionBar.j6.f20072o0.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.B5, this.f20946y));
        org.telegram.ui.ActionBar.j6.f20072o0.setAlpha((int) (this.d.getProgress() * 255.0f));
        if (this.f20941n == 2) {
            f10 = 24.0f;
        } else {
            f10 = 28.0f;
        }
        int dp = AndroidUtilities.dp(f10);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(measuredWidth - dp, measuredHeight - dp, measuredWidth + dp, measuredHeight + dp);
        canvas.drawRoundRect(rectF, p9Var.getRoundRadius()[0], p9Var.getRoundRadius()[0], org.telegram.ui.ActionBar.j6.f20072o0);
        super.onDraw(canvas);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.d.f26377a.f22938q) {
            accessibilityNodeInfo.setSelected(true);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f10;
        if (this.f20941n == 2) {
            f10 = 95.0f;
        } else {
            f10 = 103.0f;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f10), 1073741824));
    }
}
