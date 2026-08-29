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
import org.telegram.ui.Components.hp;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.zz0;
public class c7 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.Components.d6 A;
    public boolean B;
    public final org.telegram.ui.Components.d6 C;
    public long D;
    public cg.r1 E;
    public Drawable F;
    public final Paint G;
    public long H;
    public zz0 I;
    public final org.telegram.ui.Components.t9 f24172a;
    public final eg.r f24173b;
    public final org.telegram.ui.ActionBar.h5 f24174c;
    public final hp d;
    public final a7 f24175e;
    public b7 f24176f;
    public TLRPC.User h;
    public final int f24177n;
    public float f24178r;
    public long f24179s;
    public long v;
    public boolean f24180w;
    public final int f24181x;
    public final org.telegram.ui.ActionBar.c6 f24182y;

    public c7(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        int i11;
        float f9;
        float f10;
        float f11;
        this.f24181x = UserConfig.selectedAccount;
        jr jrVar = jr.h;
        this.A = new org.telegram.ui.Components.d6(this, 0L, 350L, jrVar);
        this.C = new org.telegram.ui.Components.d6(this, 0L, 350L, jrVar);
        this.G = new Paint();
        this.f24182y = c6Var;
        this.f24175e = new a7(this, c6Var, 0);
        setWillNotDraw(false);
        this.f24177n = i10;
        org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(context);
        this.f24172a = t9Var;
        t9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        if (i10 == 2) {
            addView(t9Var, i7.f6.d(48, 48.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        } else {
            addView(t9Var, i7.f6.d(56, 56.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        }
        eg.r rVar = new eg.r(context, 6);
        this.f24173b = rVar;
        NotificationCenter.listenEmojiLoading(rVar);
        if (this.B) {
            i11 = org.telegram.ui.ActionBar.g6.C6;
        } else {
            i11 = org.telegram.ui.ActionBar.g6.f23169j5;
        }
        rVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        rVar.setTextSize(1, 12.0f);
        rVar.setMaxLines(2);
        rVar.setGravity(49);
        rVar.setLines(2);
        rVar.setEllipsize(TextUtils.TruncateAt.END);
        if (i10 == 2) {
            f9 = 58.0f;
        } else {
            f9 = 66.0f;
        }
        addView(rVar, i7.f6.d(-1, -2.0f, 51, 6.0f, f9, 6.0f, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f24174c = h5Var;
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23169j5, c6Var));
        h5Var.setTextSize(12);
        h5Var.setMaxLines(2);
        h5Var.setGravity(49);
        h5Var.setAlignment(Layout.Alignment.ALIGN_CENTER);
        if (i10 == 2) {
            f10 = 58.0f;
        } else {
            f10 = 66.0f;
        }
        addView(h5Var, i7.f6.d(-1, -2.0f, 51, 6.0f, f10, 6.0f, 0.0f));
        hp hpVar = new hp(context, 21, c6Var);
        this.d = hpVar;
        hpVar.b(org.telegram.ui.ActionBar.g6.B5, org.telegram.ui.ActionBar.g6.f23133h5, org.telegram.ui.ActionBar.g6.C5);
        hpVar.setDrawUnchecked(false);
        hpVar.setDrawBackgroundAsArc(4);
        hpVar.setProgressDelegate(new fa(this, 5));
        if (i10 == 2) {
            f11 = -40.0f;
        } else {
            f11 = 42.0f;
        }
        addView(hpVar, i7.f6.d(24, 24.0f, 49, 19.0f, f11, 0.0f, 0.0f));
        setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23152i6, c6Var), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f)));
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

    public final void c(long j10, boolean z10, CharSequence charSequence) {
        int dp;
        int i10;
        boolean z11;
        a7 a7Var = this.f24175e;
        a7Var.f27964p = 1.0f;
        org.telegram.ui.ActionBar.c6 c6Var = this.f24182y;
        org.telegram.ui.Components.t9 t9Var = this.f24172a;
        eg.r rVar = this.f24173b;
        if (j10 == Long.MAX_VALUE) {
            rVar.setText(a());
            if (this.f24176f == null) {
                this.f24176f = new b7(getContext(), t9Var, true, c6Var);
            }
            t9Var.h(null, null, this.f24176f, null);
        } else {
            boolean isUserDialog = DialogObject.isUserDialog(j10);
            org.telegram.ui.Components.d6 d6Var = this.C;
            org.telegram.ui.Components.d6 d6Var2 = this.A;
            int i11 = this.f24181x;
            if (isUserDialog) {
                this.h = MessagesController.getInstance(i11).getUser(Long.valueOf(j10));
                TL_account.RequirementToContact isUserContactBlocked = MessagesController.getInstance(i11).isUserContactBlocked(j10);
                this.B = DialogObject.isPremiumBlocked(isUserContactBlocked);
                this.D = DialogObject.getMessagesStarsPrice(isUserContactBlocked);
                if (this.B) {
                    i10 = org.telegram.ui.ActionBar.g6.C6;
                } else {
                    i10 = org.telegram.ui.ActionBar.g6.f23169j5;
                }
                rVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
                d6Var2.a(this.B);
                if (this.D > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                d6Var.a(z11);
                invalidate();
                a7Var.m(i11, this.h);
                int i12 = this.f24177n;
                if (i12 != 2 && UserObject.isReplyUser(this.h)) {
                    rVar.setText(LocaleController.getString(R.string.RepliesTitle));
                    a7Var.g(12);
                    t9Var.h(null, null, a7Var, this.h);
                } else if (i12 != 2 && UserObject.isUserSelf(this.h)) {
                    rVar.setText(LocaleController.getString(R.string.SavedMessages));
                    a7Var.g(1);
                    t9Var.h(null, null, a7Var, this.h);
                } else {
                    if (charSequence != null) {
                        rVar.setText(charSequence);
                    } else {
                        TLRPC.User user = this.h;
                        if (user != null) {
                            rVar.setText(ContactsController.formatName(user.first_name, user.last_name));
                        } else {
                            rVar.setText("");
                        }
                    }
                    t9Var.e(this.h, a7Var);
                }
                t9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
            } else {
                this.h = null;
                this.B = false;
                d6Var2.d(0.0f, true);
                this.D = MessagesController.getInstance(i11).getSendPaidMessagesStars(j10);
                d6Var.getClass();
                d6Var.d(0.0f, true);
                TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-j10));
                if (charSequence != null) {
                    rVar.setText(charSequence);
                } else if (chat != null) {
                    if (chat.monoforum) {
                        rVar.setText(yf.d.i(chat, i11, false));
                    } else {
                        rVar.setText(chat.title);
                    }
                } else {
                    rVar.setText("");
                }
                if (ChatObject.isMonoForum(chat)) {
                    yf.d.o(i11, chat, a7Var, t9Var);
                } else {
                    a7Var.k(i11, chat);
                    t9Var.e(chat, a7Var);
                }
                if (chat != null && (chat.forum || chat.monoforum)) {
                    dp = AndroidUtilities.dp(16.0f);
                } else {
                    dp = AndroidUtilities.dp(28.0f);
                }
                t9Var.setRoundRadius(dp);
            }
        }
        this.v = j10;
        this.d.a(z10, false);
    }

    public final void d(TLRPC.TL_forumTopic tL_forumTopic, boolean z10, boolean z11) {
        boolean z12;
        float f9;
        boolean z13 = this.f24180w;
        if (tL_forumTopic != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z13 == z12 && z11) {
            return;
        }
        int i10 = R.id.spring_tag;
        org.telegram.ui.ActionBar.h5 h5Var = this.f24174c;
        o1.k kVar = (o1.k) h5Var.getTag(i10);
        if (kVar != null) {
            kVar.c();
        }
        if (z12) {
            if (z10) {
                h5Var.l(MessagesController.getInstance(this.f24181x).getPeerName(DialogObject.getPeerDialogId(tL_forumTopic.from_id)), false);
            } else {
                h5Var.l(yf.d.j(tL_forumTopic, h5Var.getTextPaint(), null), false);
            }
            h5Var.requestLayout();
        }
        float f10 = 0.0f;
        if (z11) {
            if (z12) {
                f9 = 0.0f;
            } else {
                f9 = 1000.0f;
            }
            o1.k kVar2 = new o1.k(new ib.a(f9));
            if (z12) {
                f10 = 1000.0f;
            }
            o1.l lVar = new o1.l(f10);
            lVar.b(1500.0f);
            lVar.a(1.0f);
            kVar2.f19045u = lVar;
            kVar2.b(new o1.h() {
                @Override
                public final void a(o1.i iVar, float f11, float f12) {
                    float f13 = f11 / 1000.0f;
                    c7 c7Var = c7.this;
                    org.telegram.ui.ActionBar.h5 h5Var2 = c7Var.f24174c;
                    h5Var2.setAlpha(f13);
                    eg.r rVar = c7Var.f24173b;
                    float f14 = 1.0f - f13;
                    rVar.setAlpha(f14);
                    h5Var2.setTranslationX(f14 * (-AndroidUtilities.dp(10.0f)));
                    rVar.setTranslationX(f13 * AndroidUtilities.dp(10.0f));
                }
            });
            kVar2.a(new o1.g() {
                @Override
                public final void a(o1.i iVar, boolean z14, float f11, float f12) {
                    c7.this.f24174c.setTag(R.id.spring_tag, null);
                }
            });
            h5Var.setTag(R.id.spring_tag, kVar2);
            kVar2.f();
        } else {
            eg.r rVar = this.f24173b;
            if (z12) {
                h5Var.setAlpha(1.0f);
                rVar.setAlpha(0.0f);
                h5Var.setTranslationX(0.0f);
                rVar.setTranslationX(AndroidUtilities.dp(10.0f));
            } else {
                h5Var.setAlpha(0.0f);
                rVar.setAlpha(1.0f);
                h5Var.setTranslationX(-AndroidUtilities.dp(10.0f));
                rVar.setTranslationX(0.0f);
            }
        }
        this.f24180w = z12;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TL_account.RequirementToContact requirementToContact;
        long messagesStarsPrice;
        int i12;
        if (i10 == NotificationCenter.userIsPremiumBlockedUpadted) {
            TLRPC.User user = this.h;
            int i13 = this.f24181x;
            if (user != null) {
                requirementToContact = MessagesController.getInstance(i13).isUserContactBlocked(this.h.f22539id);
            } else {
                requirementToContact = null;
            }
            if (this.v < 0) {
                messagesStarsPrice = MessagesController.getInstance(i13).getSendPaidMessagesStars(this.v);
            } else {
                messagesStarsPrice = DialogObject.getMessagesStarsPrice(requirementToContact);
            }
            if (this.B != DialogObject.isPremiumBlocked(requirementToContact) || this.D != messagesStarsPrice) {
                boolean isPremiumBlocked = DialogObject.isPremiumBlocked(requirementToContact);
                this.B = isPremiumBlocked;
                this.D = messagesStarsPrice;
                if (isPremiumBlocked) {
                    i12 = org.telegram.ui.ActionBar.g6.C6;
                } else {
                    i12 = org.telegram.ui.ActionBar.g6.f23169j5;
                }
                this.f24173b.setTextColor(org.telegram.ui.ActionBar.g6.v0(i12, this.f24182y));
                invalidate();
            }
        }
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r27, android.view.View r28, long r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.c7.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public long getCurrentDialog() {
        return this.v;
    }

    public org.telegram.ui.Components.t9 getImageView() {
        return this.f24172a;
    }

    public long getStarsPrice() {
        return this.D;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f24181x).addObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f24181x).removeObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f9;
        org.telegram.ui.Components.t9 t9Var = this.f24172a;
        int measuredWidth = (t9Var.getMeasuredWidth() / 2) + t9Var.getLeft();
        int measuredHeight = (t9Var.getMeasuredHeight() / 2) + t9Var.getTop();
        org.telegram.ui.ActionBar.g6.f23254o0.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.B5, this.f24182y));
        org.telegram.ui.ActionBar.g6.f23254o0.setAlpha((int) (this.d.getProgress() * 255.0f));
        if (this.f24177n == 2) {
            f9 = 24.0f;
        } else {
            f9 = 28.0f;
        }
        int dp = AndroidUtilities.dp(f9);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(measuredWidth - dp, measuredHeight - dp, measuredWidth + dp, measuredHeight + dp);
        canvas.drawRoundRect(rectF, t9Var.getRoundRadius()[0], t9Var.getRoundRadius()[0], org.telegram.ui.ActionBar.g6.f23254o0);
        super.onDraw(canvas);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.d.f29211a.f26324q) {
            accessibilityNodeInfo.setSelected(true);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f9;
        if (this.f24177n == 2) {
            f9 = 95.0f;
        } else {
            f9 = 103.0f;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f9), 1073741824));
    }
}
