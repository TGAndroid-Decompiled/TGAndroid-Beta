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
import bi.md;
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
import org.telegram.ui.Components.aq;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.r11;
public class k7 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.Components.h6 E;
    public boolean F;
    public final org.telegram.ui.Components.h6 G;
    public long H;
    public tg.a1 I;
    public Drawable J;
    public final Paint K;
    public long L;
    public r11 M;
    public final org.telegram.ui.Components.y9 f24342a;
    public final md f24343b;
    public final org.telegram.ui.ActionBar.b6 f24344c;
    public final aq d;
    public final i7 e;
    public j7 f24345f;
    public TLRPC.User h;
    public final int f24346n;
    public float f24347r;
    public long f24348s;
    public long v;
    public boolean f24349w;
    public final int f24350x;
    public final org.telegram.ui.ActionBar.u6 f24351y;

    public k7(Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        int i11;
        float f7;
        float f10;
        float f11;
        this.f24350x = UserConfig.selectedAccount;
        ds dsVar = ds.h;
        this.E = new org.telegram.ui.Components.h6(this, 0L, 350L, dsVar);
        this.G = new org.telegram.ui.Components.h6(this, 0L, 350L, dsVar);
        this.K = new Paint();
        this.f24351y = u6Var;
        this.e = new i7(this, u6Var, 0);
        setWillNotDraw(false);
        this.f24346n = i10;
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.f24342a = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        if (i10 == 2) {
            addView(y9Var, kb1.h(48, 48.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        } else {
            addView(y9Var, kb1.h(56, 56.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        }
        md mdVar = new md(context, 8);
        this.f24343b = mdVar;
        NotificationCenter.listenEmojiLoading(mdVar);
        if (this.F) {
            i11 = org.telegram.ui.ActionBar.y6.C6;
        } else {
            i11 = org.telegram.ui.ActionBar.y6.f23465j5;
        }
        org.telegram.ui.ActionBar.f7.V(mdVar, i11, u6Var);
        mdVar.setTextSize(1, 12.0f);
        mdVar.setMaxLines(2);
        mdVar.setGravity(49);
        mdVar.setLines(2);
        mdVar.setEllipsize(TextUtils.TruncateAt.END);
        if (i10 == 2) {
            f7 = 58.0f;
        } else {
            f7 = 66.0f;
        }
        addView(mdVar, kb1.h(-1, -2.0f, 51, 6.0f, f7, 6.0f, 0.0f));
        org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(context);
        this.f24344c = b6Var;
        org.telegram.ui.ActionBar.f7.Y(b6Var, org.telegram.ui.ActionBar.y6.f23465j5, u6Var);
        b6Var.setTextSize(12);
        b6Var.setMaxLines(2);
        b6Var.setGravity(49);
        b6Var.setAlignment(Layout.Alignment.ALIGN_CENTER);
        if (i10 == 2) {
            f10 = 58.0f;
        } else {
            f10 = 66.0f;
        }
        addView(b6Var, kb1.h(-1, -2.0f, 51, 6.0f, f10, 6.0f, 0.0f));
        aq aqVar = new aq(context, 21, u6Var);
        this.d = aqVar;
        aqVar.b(org.telegram.ui.ActionBar.y6.B5, org.telegram.ui.ActionBar.y6.f23428h5, org.telegram.ui.ActionBar.y6.C5);
        aqVar.setDrawUnchecked(false);
        aqVar.setDrawBackgroundAsArc(4);
        aqVar.setProgressDelegate(new na(this, 5));
        if (i10 == 2) {
            f11 = -40.0f;
        } else {
            f11 = 42.0f;
        }
        addView(aqVar, kb1.h(24, 24.0f, 49, 19.0f, f11, 0.0f, 0.0f));
        int i12 = org.telegram.ui.ActionBar.y6.f23449i6;
        Drawable Z = org.telegram.ui.ActionBar.y6.Z(org.telegram.ui.ActionBar.y6.w0(i12, u6Var), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i12);
        setBackground(Z);
        org.telegram.ui.ActionBar.f7.k(this, Z, null, N, u6Var);
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
        i7 i7Var = this.e;
        i7Var.f29558p = 1.0f;
        int i11 = (j10 > Long.MAX_VALUE ? 1 : (j10 == Long.MAX_VALUE ? 0 : -1));
        org.telegram.ui.ActionBar.u6 u6Var = this.f24351y;
        org.telegram.ui.Components.y9 y9Var = this.f24342a;
        md mdVar = this.f24343b;
        if (i11 == 0) {
            mdVar.setText(a());
            if (this.f24345f == null) {
                this.f24345f = new j7(getContext(), y9Var, true, u6Var);
            }
            y9Var.h(null, null, this.f24345f, null);
        } else {
            boolean isUserDialog = DialogObject.isUserDialog(j10);
            org.telegram.ui.Components.h6 h6Var = this.G;
            org.telegram.ui.Components.h6 h6Var2 = this.E;
            int i12 = this.f24350x;
            if (isUserDialog) {
                this.h = MessagesController.getInstance(i12).getUser(Long.valueOf(j10));
                TL_account.RequirementToContact isUserContactBlocked = MessagesController.getInstance(i12).isUserContactBlocked(j10);
                this.F = DialogObject.isPremiumBlocked(isUserContactBlocked);
                this.H = DialogObject.getMessagesStarsPrice(isUserContactBlocked);
                if (this.F) {
                    i10 = org.telegram.ui.ActionBar.y6.C6;
                } else {
                    i10 = org.telegram.ui.ActionBar.y6.f23465j5;
                }
                org.telegram.ui.ActionBar.f7.V(mdVar, i10, u6Var);
                h6Var2.a(this.F);
                if (this.H > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                h6Var.a(z11);
                invalidate();
                i7Var.m(i12, this.h);
                int i13 = this.f24346n;
                if (i13 != 2 && UserObject.isReplyUser(this.h)) {
                    mdVar.setText(LocaleController.getString(R.string.RepliesTitle));
                    i7Var.g(12);
                    y9Var.h(null, null, i7Var, this.h);
                } else if (i13 != 2 && UserObject.isUserSelf(this.h)) {
                    mdVar.setText(LocaleController.getString(R.string.SavedMessages));
                    i7Var.g(1);
                    y9Var.h(null, null, i7Var, this.h);
                } else {
                    if (charSequence != null) {
                        mdVar.setText(charSequence);
                    } else {
                        TLRPC.User user = this.h;
                        if (user != null) {
                            mdVar.setText(ContactsController.formatName(user.first_name, user.last_name));
                        } else {
                            mdVar.setText("");
                        }
                    }
                    y9Var.f(this.h, i7Var);
                }
                y9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
            } else {
                this.h = null;
                this.F = false;
                h6Var2.d(0.0f, true);
                this.H = MessagesController.getInstance(i12).getSendPaidMessagesStars(j10);
                h6Var.getClass();
                h6Var.d(0.0f, true);
                TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-j10));
                if (charSequence != null) {
                    mdVar.setText(charSequence);
                } else if (chat != null) {
                    if (chat.monoforum) {
                        mdVar.setText(pg.d.i(chat, i12, false));
                    } else {
                        mdVar.setText(chat.title);
                    }
                } else {
                    mdVar.setText("");
                }
                if (ChatObject.isMonoForum(chat)) {
                    pg.d.o(i12, chat, i7Var, y9Var);
                } else {
                    i7Var.k(i12, chat);
                    y9Var.f(chat, i7Var);
                }
                if (chat != null && (chat.forum || chat.monoforum)) {
                    dp = AndroidUtilities.dp(16.0f);
                } else {
                    dp = AndroidUtilities.dp(28.0f);
                }
                y9Var.setRoundRadius(dp);
            }
        }
        this.v = j10;
        this.d.a(z10, false);
    }

    public final void d(TLRPC.TL_forumTopic tL_forumTopic, boolean z10, boolean z11) {
        boolean z12;
        float f7;
        boolean z13 = this.f24349w;
        if (tL_forumTopic != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z13 == z12 && z11) {
            return;
        }
        int i10 = R.id.spring_tag;
        org.telegram.ui.ActionBar.b6 b6Var = this.f24344c;
        o1.j jVar = (o1.j) b6Var.getTag(i10);
        if (jVar != null) {
            jVar.c();
        }
        if (z12) {
            if (z10) {
                b6Var.l(MessagesController.getInstance(this.f24350x).getPeerName(DialogObject.getPeerDialogId(tL_forumTopic.from_id)), false);
            } else {
                b6Var.l(pg.d.j(tL_forumTopic, b6Var.getTextPaint(), null), false);
            }
            b6Var.requestLayout();
        }
        float f10 = 0.0f;
        if (z11) {
            if (z12) {
                f7 = 0.0f;
            } else {
                f7 = 1000.0f;
            }
            o1.j jVar2 = new o1.j(new ac.a(f7));
            if (z12) {
                f10 = 1000.0f;
            }
            o1.k kVar = new o1.k(f10);
            kVar.b(1500.0f);
            kVar.a(1.0f);
            jVar2.f18968u = kVar;
            jVar2.b(new o1.g() {
                @Override
                public final void a(o1.h hVar, float f11, float f12) {
                    float f13 = f11 / 1000.0f;
                    k7 k7Var = k7.this;
                    org.telegram.ui.ActionBar.b6 b6Var2 = k7Var.f24344c;
                    b6Var2.setAlpha(f13);
                    md mdVar = k7Var.f24343b;
                    float f14 = 1.0f - f13;
                    mdVar.setAlpha(f14);
                    b6Var2.setTranslationX(f14 * (-AndroidUtilities.dp(10.0f)));
                    mdVar.setTranslationX(f13 * AndroidUtilities.dp(10.0f));
                }
            });
            jVar2.a(new o1.f() {
                @Override
                public final void a(o1.h hVar, boolean z14, float f11, float f12) {
                    k7.this.f24344c.setTag(R.id.spring_tag, null);
                }
            });
            b6Var.setTag(R.id.spring_tag, jVar2);
            jVar2.h();
        } else {
            md mdVar = this.f24343b;
            if (z12) {
                b6Var.setAlpha(1.0f);
                mdVar.setAlpha(0.0f);
                b6Var.setTranslationX(0.0f);
                mdVar.setTranslationX(AndroidUtilities.dp(10.0f));
            } else {
                b6Var.setAlpha(0.0f);
                mdVar.setAlpha(1.0f);
                b6Var.setTranslationX(-AndroidUtilities.dp(10.0f));
                mdVar.setTranslationX(0.0f);
            }
        }
        this.f24349w = z12;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TL_account.RequirementToContact requirementToContact;
        long messagesStarsPrice;
        int i12;
        if (i10 == NotificationCenter.userIsPremiumBlockedUpadted) {
            TLRPC.User user = this.h;
            int i13 = this.f24350x;
            if (user != null) {
                requirementToContact = MessagesController.getInstance(i13).isUserContactBlocked(this.h.f22177id);
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
                    i12 = org.telegram.ui.ActionBar.y6.C6;
                } else {
                    i12 = org.telegram.ui.ActionBar.y6.f23465j5;
                }
                org.telegram.ui.ActionBar.f7.V(this.f24343b, i12, this.f24351y);
                invalidate();
            }
        }
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r27, android.view.View r28, long r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.k7.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public long getCurrentDialog() {
        return this.v;
    }

    public org.telegram.ui.Components.y9 getImageView() {
        return this.f24342a;
    }

    public long getStarsPrice() {
        return this.H;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f24350x).addWeakObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f24350x).removeObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        org.telegram.ui.Components.y9 y9Var = this.f24342a;
        int measuredWidth = (y9Var.getMeasuredWidth() / 2) + y9Var.getLeft();
        int measuredHeight = (y9Var.getMeasuredHeight() / 2) + y9Var.getTop();
        org.telegram.ui.ActionBar.y6.f23555o0.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.B5, this.f24351y));
        org.telegram.ui.ActionBar.y6.f23555o0.setAlpha((int) (this.d.getProgress() * 255.0f));
        if (this.f24346n == 2) {
            f7 = 24.0f;
        } else {
            f7 = 28.0f;
        }
        int dp = AndroidUtilities.dp(f7);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(measuredWidth - dp, measuredHeight - dp, measuredWidth + dp, measuredHeight + dp);
        canvas.drawRoundRect(rectF, y9Var.getRoundRadius()[0], y9Var.getRoundRadius()[0], org.telegram.ui.ActionBar.y6.f23555o0);
        super.onDraw(canvas);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.d.f26634a.f26091q) {
            accessibilityNodeInfo.setSelected(true);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        if (this.f24346n == 2) {
            f7 = 95.0f;
        } else {
            f7 = 103.0f;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7), 1073741824));
    }
}
