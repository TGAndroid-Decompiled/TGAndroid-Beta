package org.telegram.ui.Cells;

import ai.wd;
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
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.i11;
import org.telegram.ui.Components.xp;
public class g7 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.Components.f6 E;
    public boolean F;
    public final org.telegram.ui.Components.f6 G;
    public long H;
    public sg.a1 I;
    public Drawable J;
    public final Paint K;
    public long L;
    public i11 M;
    public final org.telegram.ui.Components.w9 f22415a;
    public final wd f22416b;
    public final org.telegram.ui.ActionBar.n5 f22417c;
    public final xp d;
    public final e7 e;
    public f7 f22418f;
    public TLRPC.User h;
    public final int f22419n;
    public float f22420r;
    public long f22421s;
    public long v;
    public boolean f22422w;
    public final int f22423x;
    public final org.telegram.ui.ActionBar.g6 f22424y;

    public g7(Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        int i11;
        float f7;
        float f10;
        float f11;
        this.f22423x = UserConfig.selectedAccount;
        bs bsVar = bs.h;
        this.E = new org.telegram.ui.Components.f6(this, 0L, 350L, bsVar);
        this.G = new org.telegram.ui.Components.f6(this, 0L, 350L, bsVar);
        this.K = new Paint();
        this.f22424y = g6Var;
        this.e = new e7(this, g6Var, 0);
        setWillNotDraw(false);
        this.f22419n = i10;
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.f22415a = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        if (i10 == 2) {
            addView(w9Var, w7.z5.d(48, 48.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        } else {
            addView(w9Var, w7.z5.d(56, 56.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        }
        wd wdVar = new wd(context, 8);
        this.f22416b = wdVar;
        NotificationCenter.listenEmojiLoading(wdVar);
        if (this.F) {
            i11 = org.telegram.ui.ActionBar.k6.C6;
        } else {
            i11 = org.telegram.ui.ActionBar.k6.f21289j5;
        }
        org.telegram.ui.ActionBar.r6.W(wdVar, i11, g6Var);
        wdVar.setTextSize(1, 12.0f);
        wdVar.setMaxLines(2);
        wdVar.setGravity(49);
        wdVar.setLines(2);
        wdVar.setEllipsize(TextUtils.TruncateAt.END);
        if (i10 == 2) {
            f7 = 58.0f;
        } else {
            f7 = 66.0f;
        }
        addView(wdVar, w7.z5.d(-1, -2.0f, 51, 6.0f, f7, 6.0f, 0.0f));
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.f22417c = n5Var;
        org.telegram.ui.ActionBar.r6.Z(n5Var, org.telegram.ui.ActionBar.k6.f21289j5, g6Var);
        n5Var.setTextSize(12);
        n5Var.setMaxLines(2);
        n5Var.setGravity(49);
        n5Var.setAlignment(Layout.Alignment.ALIGN_CENTER);
        if (i10 == 2) {
            f10 = 58.0f;
        } else {
            f10 = 66.0f;
        }
        addView(n5Var, w7.z5.d(-1, -2.0f, 51, 6.0f, f10, 6.0f, 0.0f));
        xp xpVar = new xp(context, 21, g6Var);
        this.d = xpVar;
        xpVar.b(org.telegram.ui.ActionBar.k6.B5, org.telegram.ui.ActionBar.k6.f21254h5, org.telegram.ui.ActionBar.k6.C5);
        xpVar.setDrawUnchecked(false);
        xpVar.setDrawBackgroundAsArc(4);
        xpVar.setProgressDelegate(new ja(this, 5));
        if (i10 == 2) {
            f11 = -40.0f;
        } else {
            f11 = 42.0f;
        }
        addView(xpVar, w7.z5.d(24, 24.0f, 49, 19.0f, f11, 0.0f, 0.0f));
        int i12 = org.telegram.ui.ActionBar.k6.f21272i6;
        Drawable Z = org.telegram.ui.ActionBar.k6.Z(org.telegram.ui.ActionBar.k6.w0(i12, g6Var), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i12);
        setBackground(Z);
        org.telegram.ui.ActionBar.r6.k(this, Z, null, O, g6Var);
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
        e7 e7Var = this.e;
        e7Var.f26849p = 1.0f;
        int i11 = (j10 > Long.MAX_VALUE ? 1 : (j10 == Long.MAX_VALUE ? 0 : -1));
        org.telegram.ui.ActionBar.g6 g6Var = this.f22424y;
        org.telegram.ui.Components.w9 w9Var = this.f22415a;
        wd wdVar = this.f22416b;
        if (i11 == 0) {
            wdVar.setText(a());
            if (this.f22418f == null) {
                this.f22418f = new f7(getContext(), w9Var, true, g6Var);
            }
            w9Var.h(null, null, this.f22418f, null);
        } else {
            boolean isUserDialog = DialogObject.isUserDialog(j10);
            org.telegram.ui.Components.f6 f6Var = this.G;
            org.telegram.ui.Components.f6 f6Var2 = this.E;
            int i12 = this.f22423x;
            if (isUserDialog) {
                this.h = MessagesController.getInstance(i12).getUser(Long.valueOf(j10));
                TL_account.RequirementToContact isUserContactBlocked = MessagesController.getInstance(i12).isUserContactBlocked(j10);
                this.F = DialogObject.isPremiumBlocked(isUserContactBlocked);
                this.H = DialogObject.getMessagesStarsPrice(isUserContactBlocked);
                if (this.F) {
                    i10 = org.telegram.ui.ActionBar.k6.C6;
                } else {
                    i10 = org.telegram.ui.ActionBar.k6.f21289j5;
                }
                org.telegram.ui.ActionBar.r6.W(wdVar, i10, g6Var);
                f6Var2.a(this.F);
                if (this.H > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                f6Var.a(z11);
                invalidate();
                e7Var.m(i12, this.h);
                int i13 = this.f22419n;
                if (i13 != 2 && UserObject.isReplyUser(this.h)) {
                    wdVar.setText(LocaleController.getString(R.string.RepliesTitle));
                    e7Var.g(12);
                    w9Var.h(null, null, e7Var, this.h);
                } else if (i13 != 2 && UserObject.isUserSelf(this.h)) {
                    wdVar.setText(LocaleController.getString(R.string.SavedMessages));
                    e7Var.g(1);
                    w9Var.h(null, null, e7Var, this.h);
                } else {
                    if (charSequence != null) {
                        wdVar.setText(charSequence);
                    } else {
                        TLRPC.User user = this.h;
                        if (user != null) {
                            wdVar.setText(ContactsController.formatName(user.first_name, user.last_name));
                        } else {
                            wdVar.setText("");
                        }
                    }
                    w9Var.e(this.h, e7Var);
                }
                w9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
            } else {
                this.h = null;
                this.F = false;
                f6Var2.d(0.0f, true);
                this.H = MessagesController.getInstance(i12).getSendPaidMessagesStars(j10);
                f6Var.getClass();
                f6Var.d(0.0f, true);
                TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-j10));
                if (charSequence != null) {
                    wdVar.setText(charSequence);
                } else if (chat != null) {
                    if (chat.monoforum) {
                        wdVar.setText(og.d.i(chat, i12, false));
                    } else {
                        wdVar.setText(chat.title);
                    }
                } else {
                    wdVar.setText("");
                }
                if (ChatObject.isMonoForum(chat)) {
                    og.d.o(i12, chat, e7Var, w9Var);
                } else {
                    e7Var.k(i12, chat);
                    w9Var.e(chat, e7Var);
                }
                if (chat != null && (chat.forum || chat.monoforum)) {
                    dp = AndroidUtilities.dp(16.0f);
                } else {
                    dp = AndroidUtilities.dp(28.0f);
                }
                w9Var.setRoundRadius(dp);
            }
        }
        this.v = j10;
        this.d.a(z10, false);
    }

    public final void d(TLRPC.TL_forumTopic tL_forumTopic, boolean z10, boolean z11) {
        boolean z12;
        float f7;
        boolean z13 = this.f22422w;
        if (tL_forumTopic != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z13 == z12 && z11) {
            return;
        }
        int i10 = R.id.spring_tag;
        org.telegram.ui.ActionBar.n5 n5Var = this.f22417c;
        o1.k kVar = (o1.k) n5Var.getTag(i10);
        if (kVar != null) {
            kVar.c();
        }
        if (z12) {
            if (z10) {
                n5Var.l(MessagesController.getInstance(this.f22423x).getPeerName(DialogObject.getPeerDialogId(tL_forumTopic.from_id)), false);
            } else {
                n5Var.l(og.d.j(tL_forumTopic, n5Var.getTextPaint(), null), false);
            }
            n5Var.requestLayout();
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
            kVar2.f17622u = lVar;
            kVar2.b(new o1.g() {
                @Override
                public final void a(o1.h hVar, float f11, float f12) {
                    float f13 = f11 / 1000.0f;
                    g7 g7Var = g7.this;
                    org.telegram.ui.ActionBar.n5 n5Var2 = g7Var.f22417c;
                    n5Var2.setAlpha(f13);
                    wd wdVar = g7Var.f22416b;
                    float f14 = 1.0f - f13;
                    wdVar.setAlpha(f14);
                    n5Var2.setTranslationX(f14 * (-AndroidUtilities.dp(10.0f)));
                    wdVar.setTranslationX(f13 * AndroidUtilities.dp(10.0f));
                }
            });
            kVar2.a(new o1.f() {
                @Override
                public final void a(o1.h hVar, boolean z14, float f11, float f12) {
                    g7.this.f22417c.setTag(R.id.spring_tag, null);
                }
            });
            n5Var.setTag(R.id.spring_tag, kVar2);
            kVar2.h();
        } else {
            wd wdVar = this.f22416b;
            if (z12) {
                n5Var.setAlpha(1.0f);
                wdVar.setAlpha(0.0f);
                n5Var.setTranslationX(0.0f);
                wdVar.setTranslationX(AndroidUtilities.dp(10.0f));
            } else {
                n5Var.setAlpha(0.0f);
                wdVar.setAlpha(1.0f);
                n5Var.setTranslationX(-AndroidUtilities.dp(10.0f));
                wdVar.setTranslationX(0.0f);
            }
        }
        this.f22422w = z12;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TL_account.RequirementToContact requirementToContact;
        long messagesStarsPrice;
        int i12;
        if (i10 == NotificationCenter.userIsPremiumBlockedUpadted) {
            TLRPC.User user = this.h;
            int i13 = this.f22423x;
            if (user != null) {
                requirementToContact = MessagesController.getInstance(i13).isUserContactBlocked(this.h.f20490id);
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
                    i12 = org.telegram.ui.ActionBar.k6.C6;
                } else {
                    i12 = org.telegram.ui.ActionBar.k6.f21289j5;
                }
                org.telegram.ui.ActionBar.r6.W(this.f22416b, i12, this.f22424y);
                invalidate();
            }
        }
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r27, android.view.View r28, long r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.g7.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public long getCurrentDialog() {
        return this.v;
    }

    public org.telegram.ui.Components.w9 getImageView() {
        return this.f22415a;
    }

    public long getStarsPrice() {
        return this.H;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f22423x).addObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f22423x).removeObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        org.telegram.ui.Components.w9 w9Var = this.f22415a;
        int measuredWidth = (w9Var.getMeasuredWidth() / 2) + w9Var.getLeft();
        int measuredHeight = (w9Var.getMeasuredHeight() / 2) + w9Var.getTop();
        org.telegram.ui.ActionBar.k6.f21380o0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.B5, this.f22424y));
        org.telegram.ui.ActionBar.k6.f21380o0.setAlpha((int) (this.d.getProgress() * 255.0f));
        if (this.f22419n == 2) {
            f7 = 24.0f;
        } else {
            f7 = 28.0f;
        }
        int dp = AndroidUtilities.dp(f7);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(measuredWidth - dp, measuredHeight - dp, measuredWidth + dp, measuredHeight + dp);
        canvas.drawRoundRect(rectF, w9Var.getRoundRadius()[0], w9Var.getRoundRadius()[0], org.telegram.ui.ActionBar.k6.f21380o0);
        super.onDraw(canvas);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.d.f32618a.f24296q) {
            accessibilityNodeInfo.setSelected(true);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        if (this.f22419n == 2) {
            f7 = 95.0f;
        } else {
            f7 = 103.0f;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7), 1073741824));
    }
}
