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
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.w01;
public class h7 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.Components.d6 E;
    public boolean F;
    public final org.telegram.ui.Components.d6 G;
    public long H;
    public rg.z0 I;
    public Drawable J;
    public final Paint K;
    public long L;
    public w01 M;
    public final org.telegram.ui.Components.v9 f20412a;
    public final ai.p4 f20413b;
    public final org.telegram.ui.ActionBar.j5 f20414c;
    public final np d;
    public final f7 e;
    public g7 f20415f;
    public TLRPC.User h;
    public final int f20416n;
    public float f20417r;
    public long f20418s;
    public long v;
    public boolean f20419w;
    public final int f20420x;
    public final org.telegram.ui.ActionBar.f6 f20421y;

    public h7(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        int i11;
        float f7;
        float f10;
        float f11;
        this.f20420x = UserConfig.selectedAccount;
        qr qrVar = qr.h;
        this.E = new org.telegram.ui.Components.d6(this, 0L, 350L, qrVar);
        this.G = new org.telegram.ui.Components.d6(this, 0L, 350L, qrVar);
        this.K = new Paint();
        this.f20421y = f6Var;
        this.e = new f7(this, f6Var, 0);
        setWillNotDraw(false);
        this.f20416n = i10;
        org.telegram.ui.Components.v9 v9Var = new org.telegram.ui.Components.v9(context);
        this.f20412a = v9Var;
        v9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        if (i10 == 2) {
            addView(v9Var, w7.y5.d(48, 48.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        } else {
            addView(v9Var, w7.y5.d(56, 56.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        }
        ai.p4 p4Var = new ai.p4(context, 7);
        this.f20413b = p4Var;
        NotificationCenter.listenEmojiLoading(p4Var);
        if (this.F) {
            i11 = org.telegram.ui.ActionBar.j6.C6;
        } else {
            i11 = org.telegram.ui.ActionBar.j6.f19216j5;
        }
        p4Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        p4Var.setTextSize(1, 12.0f);
        p4Var.setMaxLines(2);
        p4Var.setGravity(49);
        p4Var.setLines(2);
        p4Var.setEllipsize(TextUtils.TruncateAt.END);
        if (i10 == 2) {
            f7 = 58.0f;
        } else {
            f7 = 66.0f;
        }
        addView(p4Var, w7.y5.d(-1, -2.0f, 51, 6.0f, f7, 6.0f, 0.0f));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.f20414c = j5Var;
        j5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19216j5, f6Var));
        j5Var.setTextSize(12);
        j5Var.setMaxLines(2);
        j5Var.setGravity(49);
        j5Var.setAlignment(Layout.Alignment.ALIGN_CENTER);
        if (i10 == 2) {
            f10 = 58.0f;
        } else {
            f10 = 66.0f;
        }
        addView(j5Var, w7.y5.d(-1, -2.0f, 51, 6.0f, f10, 6.0f, 0.0f));
        np npVar = new np(context, 21, f6Var);
        this.d = npVar;
        npVar.b(org.telegram.ui.ActionBar.j6.B5, org.telegram.ui.ActionBar.j6.f19180h5, org.telegram.ui.ActionBar.j6.C5);
        npVar.setDrawUnchecked(false);
        npVar.setDrawBackgroundAsArc(4);
        npVar.setProgressDelegate(new ma(this, 5));
        if (i10 == 2) {
            f11 = -40.0f;
        } else {
            f11 = 42.0f;
        }
        addView(npVar, w7.y5.d(24, 24.0f, 49, 19.0f, f11, 0.0f, 0.0f));
        setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19199i6, f6Var), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f)));
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
        f7 f7Var = this.e;
        f7Var.f24459p = 1.0f;
        org.telegram.ui.ActionBar.f6 f6Var = this.f20421y;
        org.telegram.ui.Components.v9 v9Var = this.f20412a;
        ai.p4 p4Var = this.f20413b;
        if (j3 == Long.MAX_VALUE) {
            p4Var.setText(a());
            if (this.f20415f == null) {
                this.f20415f = new g7(getContext(), v9Var, true, f6Var);
            }
            v9Var.h(null, null, this.f20415f, null);
        } else {
            boolean isUserDialog = DialogObject.isUserDialog(j3);
            org.telegram.ui.Components.d6 d6Var = this.G;
            org.telegram.ui.Components.d6 d6Var2 = this.E;
            int i11 = this.f20420x;
            if (isUserDialog) {
                this.h = MessagesController.getInstance(i11).getUser(Long.valueOf(j3));
                TL_account.RequirementToContact isUserContactBlocked = MessagesController.getInstance(i11).isUserContactBlocked(j3);
                this.F = DialogObject.isPremiumBlocked(isUserContactBlocked);
                this.H = DialogObject.getMessagesStarsPrice(isUserContactBlocked);
                if (this.F) {
                    i10 = org.telegram.ui.ActionBar.j6.C6;
                } else {
                    i10 = org.telegram.ui.ActionBar.j6.f19216j5;
                }
                p4Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
                d6Var2.a(this.F);
                if (this.H > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                d6Var.a(z11);
                invalidate();
                f7Var.m(i11, this.h);
                int i12 = this.f20416n;
                if (i12 != 2 && UserObject.isReplyUser(this.h)) {
                    p4Var.setText(LocaleController.getString(R.string.RepliesTitle));
                    f7Var.g(12);
                    v9Var.h(null, null, f7Var, this.h);
                } else if (i12 != 2 && UserObject.isUserSelf(this.h)) {
                    p4Var.setText(LocaleController.getString(R.string.SavedMessages));
                    f7Var.g(1);
                    v9Var.h(null, null, f7Var, this.h);
                } else {
                    if (charSequence != null) {
                        p4Var.setText(charSequence);
                    } else {
                        TLRPC.User user = this.h;
                        if (user != null) {
                            p4Var.setText(ContactsController.formatName(user.first_name, user.last_name));
                        } else {
                            p4Var.setText("");
                        }
                    }
                    v9Var.e(this.h, f7Var);
                }
                v9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
            } else {
                this.h = null;
                this.F = false;
                d6Var2.d(0.0f, true);
                this.H = MessagesController.getInstance(i11).getSendPaidMessagesStars(j3);
                d6Var.getClass();
                d6Var.d(0.0f, true);
                TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-j3));
                if (charSequence != null) {
                    p4Var.setText(charSequence);
                } else if (chat != null) {
                    if (chat.monoforum) {
                        p4Var.setText(ng.d.i(chat, i11, false));
                    } else {
                        p4Var.setText(chat.title);
                    }
                } else {
                    p4Var.setText("");
                }
                if (ChatObject.isMonoForum(chat)) {
                    ng.d.o(i11, chat, f7Var, v9Var);
                } else {
                    f7Var.k(i11, chat);
                    v9Var.e(chat, f7Var);
                }
                if (chat != null && (chat.forum || chat.monoforum)) {
                    dp = AndroidUtilities.dp(16.0f);
                } else {
                    dp = AndroidUtilities.dp(28.0f);
                }
                v9Var.setRoundRadius(dp);
            }
        }
        this.v = j3;
        this.d.a(z10, false);
    }

    public final void d(TLRPC.TL_forumTopic tL_forumTopic, boolean z10, boolean z11) {
        boolean z12;
        float f7;
        boolean z13 = this.f20419w;
        if (tL_forumTopic != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z13 == z12 && z11) {
            return;
        }
        int i10 = R.id.spring_tag;
        org.telegram.ui.ActionBar.j5 j5Var = this.f20414c;
        o1.k kVar = (o1.k) j5Var.getTag(i10);
        if (kVar != null) {
            kVar.c();
        }
        if (z12) {
            if (z10) {
                j5Var.l(MessagesController.getInstance(this.f20420x).getPeerName(DialogObject.getPeerDialogId(tL_forumTopic.from_id)), false);
            } else {
                j5Var.l(ng.d.j(tL_forumTopic, j5Var.getTextPaint(), null), false);
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
            kVar2.f15537u = lVar;
            kVar2.b(new o1.g() {
                @Override
                public final void a(o1.h hVar, float f11, float f12) {
                    float f13 = f11 / 1000.0f;
                    h7 h7Var = h7.this;
                    org.telegram.ui.ActionBar.j5 j5Var2 = h7Var.f20414c;
                    j5Var2.setAlpha(f13);
                    ai.p4 p4Var = h7Var.f20413b;
                    float f14 = 1.0f - f13;
                    p4Var.setAlpha(f14);
                    j5Var2.setTranslationX(f14 * (-AndroidUtilities.dp(10.0f)));
                    p4Var.setTranslationX(f13 * AndroidUtilities.dp(10.0f));
                }
            });
            kVar2.a(new o1.f() {
                @Override
                public final void a(o1.h hVar, boolean z14, float f11, float f12) {
                    h7.this.f20414c.setTag(R.id.spring_tag, null);
                }
            });
            j5Var.setTag(R.id.spring_tag, kVar2);
            kVar2.f();
        } else {
            ai.p4 p4Var = this.f20413b;
            if (z12) {
                j5Var.setAlpha(1.0f);
                p4Var.setAlpha(0.0f);
                j5Var.setTranslationX(0.0f);
                p4Var.setTranslationX(AndroidUtilities.dp(10.0f));
            } else {
                j5Var.setAlpha(0.0f);
                p4Var.setAlpha(1.0f);
                j5Var.setTranslationX(-AndroidUtilities.dp(10.0f));
                p4Var.setTranslationX(0.0f);
            }
        }
        this.f20419w = z12;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TL_account.RequirementToContact requirementToContact;
        long messagesStarsPrice;
        int i12;
        if (i10 == NotificationCenter.userIsPremiumBlockedUpadted) {
            TLRPC.User user = this.h;
            int i13 = this.f20420x;
            if (user != null) {
                requirementToContact = MessagesController.getInstance(i13).isUserContactBlocked(this.h.f18490id);
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
                    i12 = org.telegram.ui.ActionBar.j6.f19216j5;
                }
                this.f20413b.setTextColor(org.telegram.ui.ActionBar.j6.v0(i12, this.f20421y));
                invalidate();
            }
        }
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r27, android.view.View r28, long r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.h7.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public long getCurrentDialog() {
        return this.v;
    }

    public org.telegram.ui.Components.v9 getImageView() {
        return this.f20412a;
    }

    public long getStarsPrice() {
        return this.H;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f20420x).addObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f20420x).removeObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        org.telegram.ui.Components.v9 v9Var = this.f20412a;
        int measuredWidth = (v9Var.getMeasuredWidth() / 2) + v9Var.getLeft();
        int measuredHeight = (v9Var.getMeasuredHeight() / 2) + v9Var.getTop();
        org.telegram.ui.ActionBar.j6.f19305o0.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.B5, this.f20421y));
        org.telegram.ui.ActionBar.j6.f19305o0.setAlpha((int) (this.d.getProgress() * 255.0f));
        if (this.f20416n == 2) {
            f7 = 24.0f;
        } else {
            f7 = 28.0f;
        }
        int dp = AndroidUtilities.dp(f7);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(measuredWidth - dp, measuredHeight - dp, measuredWidth + dp, measuredHeight + dp);
        canvas.drawRoundRect(rectF, v9Var.getRoundRadius()[0], v9Var.getRoundRadius()[0], org.telegram.ui.ActionBar.j6.f19305o0);
        super.onDraw(canvas);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.d.f26861a.f22209q) {
            accessibilityNodeInfo.setSelected(true);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        if (this.f20416n == 2) {
            f7 = 95.0f;
        } else {
            f7 = 103.0f;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7), 1073741824));
    }
}
