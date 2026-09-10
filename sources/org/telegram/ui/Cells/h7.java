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
import org.telegram.ui.Components.t01;
import org.telegram.ui.Components.tp;
import org.telegram.ui.Components.wr;
public class h7 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.Components.d6 E;
    public boolean F;
    public final org.telegram.ui.Components.d6 G;
    public long H;
    public qg.c1 I;
    public Drawable J;
    public final Paint K;
    public long L;
    public t01 M;
    public final org.telegram.ui.Components.w9 f19266a;
    public final di.h f19267b;
    public final org.telegram.ui.ActionBar.l5 f19268c;
    public final tp d;
    public final f7 e;
    public g7 f19269f;
    public TLRPC.User h;
    public final int f19270n;
    public float f19271r;
    public long f19272s;
    public long v;
    public boolean f19273w;
    public final int f19274x;
    public final org.telegram.ui.ActionBar.f6 f19275y;

    public h7(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        int i11;
        float f7;
        float f10;
        float f11;
        this.f19274x = UserConfig.selectedAccount;
        wr wrVar = wr.h;
        this.E = new org.telegram.ui.Components.d6(this, 0L, 350L, wrVar);
        this.G = new org.telegram.ui.Components.d6(this, 0L, 350L, wrVar);
        this.K = new Paint();
        this.f19275y = f6Var;
        this.e = new f7(this, f6Var, 0);
        setWillNotDraw(false);
        this.f19270n = i10;
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.f19266a = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        if (i10 == 2) {
            addView(w9Var, w7.a6.d(48, 48.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        } else {
            addView(w9Var, w7.a6.d(56, 56.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        }
        di.h hVar = new di.h(context, 6);
        this.f19267b = hVar;
        NotificationCenter.listenEmojiLoading(hVar);
        if (this.F) {
            i11 = org.telegram.ui.ActionBar.j6.C6;
        } else {
            i11 = org.telegram.ui.ActionBar.j6.f18034j5;
        }
        hVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        hVar.setTextSize(1, 12.0f);
        hVar.setMaxLines(2);
        hVar.setGravity(49);
        hVar.setLines(2);
        hVar.setEllipsize(TextUtils.TruncateAt.END);
        if (i10 == 2) {
            f7 = 58.0f;
        } else {
            f7 = 66.0f;
        }
        addView(hVar, w7.a6.d(-1, -2.0f, 51, 6.0f, f7, 6.0f, 0.0f));
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.f19268c = l5Var;
        l5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18034j5, f6Var));
        l5Var.setTextSize(12);
        l5Var.setMaxLines(2);
        l5Var.setGravity(49);
        l5Var.setAlignment(Layout.Alignment.ALIGN_CENTER);
        if (i10 == 2) {
            f10 = 58.0f;
        } else {
            f10 = 66.0f;
        }
        addView(l5Var, w7.a6.d(-1, -2.0f, 51, 6.0f, f10, 6.0f, 0.0f));
        tp tpVar = new tp(context, 21, f6Var);
        this.d = tpVar;
        tpVar.b(org.telegram.ui.ActionBar.j6.B5, org.telegram.ui.ActionBar.j6.f17998h5, org.telegram.ui.ActionBar.j6.C5);
        tpVar.setDrawUnchecked(false);
        tpVar.setDrawBackgroundAsArc(4);
        tpVar.setProgressDelegate(new na(this, 5));
        if (i10 == 2) {
            f11 = -40.0f;
        } else {
            f11 = 42.0f;
        }
        addView(tpVar, w7.a6.d(24, 24.0f, 49, 19.0f, f11, 0.0f, 0.0f));
        setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18017i6, f6Var), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f)));
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
        f7Var.f23286p = 1.0f;
        org.telegram.ui.ActionBar.f6 f6Var = this.f19275y;
        org.telegram.ui.Components.w9 w9Var = this.f19266a;
        di.h hVar = this.f19267b;
        if (j3 == Long.MAX_VALUE) {
            hVar.setText(a());
            if (this.f19269f == null) {
                this.f19269f = new g7(getContext(), w9Var, true, f6Var);
            }
            w9Var.h(null, null, this.f19269f, null);
        } else {
            boolean isUserDialog = DialogObject.isUserDialog(j3);
            org.telegram.ui.Components.d6 d6Var = this.G;
            org.telegram.ui.Components.d6 d6Var2 = this.E;
            int i11 = this.f19274x;
            if (isUserDialog) {
                this.h = MessagesController.getInstance(i11).getUser(Long.valueOf(j3));
                TL_account.RequirementToContact isUserContactBlocked = MessagesController.getInstance(i11).isUserContactBlocked(j3);
                this.F = DialogObject.isPremiumBlocked(isUserContactBlocked);
                this.H = DialogObject.getMessagesStarsPrice(isUserContactBlocked);
                if (this.F) {
                    i10 = org.telegram.ui.ActionBar.j6.C6;
                } else {
                    i10 = org.telegram.ui.ActionBar.j6.f18034j5;
                }
                hVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
                d6Var2.a(this.F);
                if (this.H > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                d6Var.a(z11);
                invalidate();
                f7Var.m(i11, this.h);
                int i12 = this.f19270n;
                if (i12 != 2 && UserObject.isReplyUser(this.h)) {
                    hVar.setText(LocaleController.getString(R.string.RepliesTitle));
                    f7Var.g(12);
                    w9Var.h(null, null, f7Var, this.h);
                } else if (i12 != 2 && UserObject.isUserSelf(this.h)) {
                    hVar.setText(LocaleController.getString(R.string.SavedMessages));
                    f7Var.g(1);
                    w9Var.h(null, null, f7Var, this.h);
                } else {
                    if (charSequence != null) {
                        hVar.setText(charSequence);
                    } else {
                        TLRPC.User user = this.h;
                        if (user != null) {
                            hVar.setText(ContactsController.formatName(user.first_name, user.last_name));
                        } else {
                            hVar.setText("");
                        }
                    }
                    w9Var.e(this.h, f7Var);
                }
                w9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
            } else {
                this.h = null;
                this.F = false;
                d6Var2.d(0.0f, true);
                this.H = MessagesController.getInstance(i11).getSendPaidMessagesStars(j3);
                d6Var.getClass();
                d6Var.d(0.0f, true);
                TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-j3));
                if (charSequence != null) {
                    hVar.setText(charSequence);
                } else if (chat != null) {
                    if (chat.monoforum) {
                        hVar.setText(mg.d.i(chat, i11, false));
                    } else {
                        hVar.setText(chat.title);
                    }
                } else {
                    hVar.setText("");
                }
                if (ChatObject.isMonoForum(chat)) {
                    mg.d.o(i11, chat, f7Var, w9Var);
                } else {
                    f7Var.k(i11, chat);
                    w9Var.e(chat, f7Var);
                }
                if (chat != null && (chat.forum || chat.monoforum)) {
                    dp = AndroidUtilities.dp(16.0f);
                } else {
                    dp = AndroidUtilities.dp(28.0f);
                }
                w9Var.setRoundRadius(dp);
            }
        }
        this.v = j3;
        this.d.a(z10, false);
    }

    public final void d(TLRPC.TL_forumTopic tL_forumTopic, boolean z10, boolean z11) {
        boolean z12;
        float f7;
        boolean z13 = this.f19273w;
        if (tL_forumTopic != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z13 == z12 && z11) {
            return;
        }
        int i10 = R.id.spring_tag;
        org.telegram.ui.ActionBar.l5 l5Var = this.f19268c;
        o1.k kVar = (o1.k) l5Var.getTag(i10);
        if (kVar != null) {
            kVar.c();
        }
        if (z12) {
            if (z10) {
                l5Var.l(MessagesController.getInstance(this.f19274x).getPeerName(DialogObject.getPeerDialogId(tL_forumTopic.from_id)), false);
            } else {
                l5Var.l(mg.d.j(tL_forumTopic, l5Var.getTextPaint(), null), false);
            }
            l5Var.requestLayout();
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
            kVar2.f14134u = lVar;
            kVar2.b(new o1.g() {
                @Override
                public final void a(o1.h hVar, float f11, float f12) {
                    float f13 = f11 / 1000.0f;
                    h7 h7Var = h7.this;
                    org.telegram.ui.ActionBar.l5 l5Var2 = h7Var.f19268c;
                    l5Var2.setAlpha(f13);
                    di.h hVar2 = h7Var.f19267b;
                    float f14 = 1.0f - f13;
                    hVar2.setAlpha(f14);
                    l5Var2.setTranslationX(f14 * (-AndroidUtilities.dp(10.0f)));
                    hVar2.setTranslationX(f13 * AndroidUtilities.dp(10.0f));
                }
            });
            kVar2.a(new o1.f() {
                @Override
                public final void a(o1.h hVar, boolean z14, float f11, float f12) {
                    h7.this.f19268c.setTag(R.id.spring_tag, null);
                }
            });
            l5Var.setTag(R.id.spring_tag, kVar2);
            kVar2.f();
        } else {
            di.h hVar = this.f19267b;
            if (z12) {
                l5Var.setAlpha(1.0f);
                hVar.setAlpha(0.0f);
                l5Var.setTranslationX(0.0f);
                hVar.setTranslationX(AndroidUtilities.dp(10.0f));
            } else {
                l5Var.setAlpha(0.0f);
                hVar.setAlpha(1.0f);
                l5Var.setTranslationX(-AndroidUtilities.dp(10.0f));
                hVar.setTranslationX(0.0f);
            }
        }
        this.f19273w = z12;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TL_account.RequirementToContact requirementToContact;
        long messagesStarsPrice;
        int i12;
        if (i10 == NotificationCenter.userIsPremiumBlockedUpadted) {
            TLRPC.User user = this.h;
            int i13 = this.f19274x;
            if (user != null) {
                requirementToContact = MessagesController.getInstance(i13).isUserContactBlocked(this.h.f17342id);
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
                    i12 = org.telegram.ui.ActionBar.j6.f18034j5;
                }
                this.f19267b.setTextColor(org.telegram.ui.ActionBar.j6.v0(i12, this.f19275y));
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

    public org.telegram.ui.Components.w9 getImageView() {
        return this.f19266a;
    }

    public long getStarsPrice() {
        return this.H;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f19274x).addObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f19274x).removeObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        org.telegram.ui.Components.w9 w9Var = this.f19266a;
        int measuredWidth = (w9Var.getMeasuredWidth() / 2) + w9Var.getLeft();
        int measuredHeight = (w9Var.getMeasuredHeight() / 2) + w9Var.getTop();
        org.telegram.ui.ActionBar.j6.f18120o0.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.B5, this.f19275y));
        org.telegram.ui.ActionBar.j6.f18120o0.setAlpha((int) (this.d.getProgress() * 255.0f));
        if (this.f19270n == 2) {
            f7 = 24.0f;
        } else {
            f7 = 28.0f;
        }
        int dp = AndroidUtilities.dp(f7);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(measuredWidth - dp, measuredHeight - dp, measuredWidth + dp, measuredHeight + dp);
        canvas.drawRoundRect(rectF, w9Var.getRoundRadius()[0], w9Var.getRoundRadius()[0], org.telegram.ui.ActionBar.j6.f18120o0);
        super.onDraw(canvas);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.d.f27462a.f21057q) {
            accessibilityNodeInfo.setSelected(true);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        if (this.f19270n == 2) {
            f7 = 95.0f;
        } else {
            f7 = 103.0f;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7), 1073741824));
    }
}
