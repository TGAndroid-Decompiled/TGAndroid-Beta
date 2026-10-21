package org.telegram.ui.Cells;

import ai.vd;
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
import org.telegram.ui.Components.f11;
import org.telegram.ui.Components.xp;
public class e7 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.Components.f6 E;
    public boolean F;
    public final org.telegram.ui.Components.f6 G;
    public long H;
    public sg.a1 I;
    public Drawable J;
    public final Paint K;
    public long L;
    public f11 M;
    public final org.telegram.ui.Components.w9 f22187a;
    public final vd f22188b;
    public final org.telegram.ui.ActionBar.j5 f22189c;
    public final xp d;
    public final c7 e;
    public d7 f22190f;
    public TLRPC.User h;
    public final int f22191n;
    public float f22192r;
    public long f22193s;
    public long v;
    public boolean f22194w;
    public final int f22195x;
    public final org.telegram.ui.ActionBar.d6 f22196y;

    public e7(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        int i11;
        float f7;
        float f10;
        float f11;
        this.f22195x = UserConfig.selectedAccount;
        bs bsVar = bs.h;
        this.E = new org.telegram.ui.Components.f6(this, 0L, 350L, bsVar);
        this.G = new org.telegram.ui.Components.f6(this, 0L, 350L, bsVar);
        this.K = new Paint();
        this.f22196y = d6Var;
        this.e = new c7(this, d6Var, 0);
        setWillNotDraw(false);
        this.f22191n = i10;
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.f22187a = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        if (i10 == 2) {
            addView(w9Var, w7.z5.d(48, 48.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        } else {
            addView(w9Var, w7.z5.d(56, 56.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        }
        vd vdVar = new vd(context, 8);
        this.f22188b = vdVar;
        NotificationCenter.listenEmojiLoading(vdVar);
        if (this.F) {
            i11 = org.telegram.ui.ActionBar.h6.C6;
        } else {
            i11 = org.telegram.ui.ActionBar.h6.f21096j5;
        }
        vdVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        vdVar.setTextSize(1, 12.0f);
        vdVar.setMaxLines(2);
        vdVar.setGravity(49);
        vdVar.setLines(2);
        vdVar.setEllipsize(TextUtils.TruncateAt.END);
        if (i10 == 2) {
            f7 = 58.0f;
        } else {
            f7 = 66.0f;
        }
        addView(vdVar, w7.z5.d(-1, -2.0f, 51, 6.0f, f7, 6.0f, 0.0f));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.f22189c = j5Var;
        j5Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21096j5, d6Var));
        j5Var.setTextSize(12);
        j5Var.setMaxLines(2);
        j5Var.setGravity(49);
        j5Var.setAlignment(Layout.Alignment.ALIGN_CENTER);
        if (i10 == 2) {
            f10 = 58.0f;
        } else {
            f10 = 66.0f;
        }
        addView(j5Var, w7.z5.d(-1, -2.0f, 51, 6.0f, f10, 6.0f, 0.0f));
        xp xpVar = new xp(context, 21, d6Var);
        this.d = xpVar;
        xpVar.b(org.telegram.ui.ActionBar.h6.B5, org.telegram.ui.ActionBar.h6.f21061h5, org.telegram.ui.ActionBar.h6.C5);
        xpVar.setDrawUnchecked(false);
        xpVar.setDrawBackgroundAsArc(4);
        xpVar.setProgressDelegate(new ia(this, 5));
        if (i10 == 2) {
            f11 = -40.0f;
        } else {
            f11 = 42.0f;
        }
        addView(xpVar, w7.z5.d(24, 24.0f, 49, 19.0f, f11, 0.0f, 0.0f));
        setBackground(org.telegram.ui.ActionBar.h6.Z(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21079i6, d6Var), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f)));
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
        c7 c7Var = this.e;
        c7Var.f26822p = 1.0f;
        int i11 = (j10 > Long.MAX_VALUE ? 1 : (j10 == Long.MAX_VALUE ? 0 : -1));
        org.telegram.ui.ActionBar.d6 d6Var = this.f22196y;
        org.telegram.ui.Components.w9 w9Var = this.f22187a;
        vd vdVar = this.f22188b;
        if (i11 == 0) {
            vdVar.setText(a());
            if (this.f22190f == null) {
                this.f22190f = new d7(getContext(), w9Var, true, d6Var);
            }
            w9Var.h(null, null, this.f22190f, null);
        } else {
            boolean isUserDialog = DialogObject.isUserDialog(j10);
            org.telegram.ui.Components.f6 f6Var = this.G;
            org.telegram.ui.Components.f6 f6Var2 = this.E;
            int i12 = this.f22195x;
            if (isUserDialog) {
                this.h = MessagesController.getInstance(i12).getUser(Long.valueOf(j10));
                TL_account.RequirementToContact isUserContactBlocked = MessagesController.getInstance(i12).isUserContactBlocked(j10);
                this.F = DialogObject.isPremiumBlocked(isUserContactBlocked);
                this.H = DialogObject.getMessagesStarsPrice(isUserContactBlocked);
                if (this.F) {
                    i10 = org.telegram.ui.ActionBar.h6.C6;
                } else {
                    i10 = org.telegram.ui.ActionBar.h6.f21096j5;
                }
                vdVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(i10, d6Var));
                f6Var2.a(this.F);
                if (this.H > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                f6Var.a(z11);
                invalidate();
                c7Var.m(i12, this.h);
                int i13 = this.f22191n;
                if (i13 != 2 && UserObject.isReplyUser(this.h)) {
                    vdVar.setText(LocaleController.getString(R.string.RepliesTitle));
                    c7Var.g(12);
                    w9Var.h(null, null, c7Var, this.h);
                } else if (i13 != 2 && UserObject.isUserSelf(this.h)) {
                    vdVar.setText(LocaleController.getString(R.string.SavedMessages));
                    c7Var.g(1);
                    w9Var.h(null, null, c7Var, this.h);
                } else {
                    if (charSequence != null) {
                        vdVar.setText(charSequence);
                    } else {
                        TLRPC.User user = this.h;
                        if (user != null) {
                            vdVar.setText(ContactsController.formatName(user.first_name, user.last_name));
                        } else {
                            vdVar.setText("");
                        }
                    }
                    w9Var.e(this.h, c7Var);
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
                    vdVar.setText(charSequence);
                } else if (chat != null) {
                    if (chat.monoforum) {
                        vdVar.setText(og.d.i(chat, i12, false));
                    } else {
                        vdVar.setText(chat.title);
                    }
                } else {
                    vdVar.setText("");
                }
                if (ChatObject.isMonoForum(chat)) {
                    og.d.o(i12, chat, c7Var, w9Var);
                } else {
                    c7Var.k(i12, chat);
                    w9Var.e(chat, c7Var);
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
        boolean z13 = this.f22194w;
        if (tL_forumTopic != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z13 == z12 && z11) {
            return;
        }
        int i10 = R.id.spring_tag;
        org.telegram.ui.ActionBar.j5 j5Var = this.f22189c;
        o1.k kVar = (o1.k) j5Var.getTag(i10);
        if (kVar != null) {
            kVar.c();
        }
        if (z12) {
            if (z10) {
                j5Var.l(MessagesController.getInstance(this.f22195x).getPeerName(DialogObject.getPeerDialogId(tL_forumTopic.from_id)), false);
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
            kVar2.f17559u = lVar;
            kVar2.b(new o1.g() {
                @Override
                public final void a(o1.h hVar, float f11, float f12) {
                    float f13 = f11 / 1000.0f;
                    e7 e7Var = e7.this;
                    org.telegram.ui.ActionBar.j5 j5Var2 = e7Var.f22189c;
                    j5Var2.setAlpha(f13);
                    vd vdVar = e7Var.f22188b;
                    float f14 = 1.0f - f13;
                    vdVar.setAlpha(f14);
                    j5Var2.setTranslationX(f14 * (-AndroidUtilities.dp(10.0f)));
                    vdVar.setTranslationX(f13 * AndroidUtilities.dp(10.0f));
                }
            });
            kVar2.a(new o1.f() {
                @Override
                public final void a(o1.h hVar, boolean z14, float f11, float f12) {
                    e7.this.f22189c.setTag(R.id.spring_tag, null);
                }
            });
            j5Var.setTag(R.id.spring_tag, kVar2);
            kVar2.h();
        } else {
            vd vdVar = this.f22188b;
            if (z12) {
                j5Var.setAlpha(1.0f);
                vdVar.setAlpha(0.0f);
                j5Var.setTranslationX(0.0f);
                vdVar.setTranslationX(AndroidUtilities.dp(10.0f));
            } else {
                j5Var.setAlpha(0.0f);
                vdVar.setAlpha(1.0f);
                j5Var.setTranslationX(-AndroidUtilities.dp(10.0f));
                vdVar.setTranslationX(0.0f);
            }
        }
        this.f22194w = z12;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TL_account.RequirementToContact requirementToContact;
        long messagesStarsPrice;
        int i12;
        if (i10 == NotificationCenter.userIsPremiumBlockedUpadted) {
            TLRPC.User user = this.h;
            int i13 = this.f22195x;
            if (user != null) {
                requirementToContact = MessagesController.getInstance(i13).isUserContactBlocked(this.h.f20423id);
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
                    i12 = org.telegram.ui.ActionBar.h6.f21096j5;
                }
                this.f22188b.setTextColor(org.telegram.ui.ActionBar.h6.w0(i12, this.f22196y));
                invalidate();
            }
        }
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r27, android.view.View r28, long r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.e7.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public long getCurrentDialog() {
        return this.v;
    }

    public org.telegram.ui.Components.w9 getImageView() {
        return this.f22187a;
    }

    public long getStarsPrice() {
        return this.H;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f22195x).addObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f22195x).removeObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        org.telegram.ui.Components.w9 w9Var = this.f22187a;
        int measuredWidth = (w9Var.getMeasuredWidth() / 2) + w9Var.getLeft();
        int measuredHeight = (w9Var.getMeasuredHeight() / 2) + w9Var.getTop();
        org.telegram.ui.ActionBar.h6.f21187o0.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.B5, this.f22196y));
        org.telegram.ui.ActionBar.h6.f21187o0.setAlpha((int) (this.d.getProgress() * 255.0f));
        if (this.f22191n == 2) {
            f7 = 24.0f;
        } else {
            f7 = 28.0f;
        }
        int dp = AndroidUtilities.dp(f7);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(measuredWidth - dp, measuredHeight - dp, measuredWidth + dp, measuredHeight + dp);
        canvas.drawRoundRect(rectF, w9Var.getRoundRadius()[0], w9Var.getRoundRadius()[0], org.telegram.ui.ActionBar.h6.f21187o0);
        super.onDraw(canvas);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.d.f32459a.f24151q) {
            accessibilityNodeInfo.setSelected(true);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        if (this.f22191n == 2) {
            f7 = 95.0f;
        } else {
            f7 = 103.0f;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7), 1073741824));
    }
}
