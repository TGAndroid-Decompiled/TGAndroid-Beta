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
import org.telegram.ui.Components.aq;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.h11;
public class g7 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.Components.g6 E;
    public boolean F;
    public final org.telegram.ui.Components.g6 G;
    public long H;
    public sg.a1 I;
    public Drawable J;
    public final Paint K;
    public long L;
    public h11 M;
    public final org.telegram.ui.Components.z9 f21224a;
    public final bi.f4 f21225b;
    public final org.telegram.ui.ActionBar.h5 f21226c;
    public final aq d;
    public final e7 e;
    public f7 f21227f;
    public TLRPC.User h;
    public final int f21228n;
    public float f21229r;
    public long f21230s;
    public long v;
    public boolean f21231w;
    public final int f21232x;
    public final org.telegram.ui.ActionBar.c6 f21233y;

    public g7(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        int i11;
        float f7;
        float f10;
        float f11;
        this.f21232x = UserConfig.selectedAccount;
        es esVar = es.h;
        this.E = new org.telegram.ui.Components.g6(this, 0L, 350L, esVar);
        this.G = new org.telegram.ui.Components.g6(this, 0L, 350L, esVar);
        this.K = new Paint();
        this.f21233y = c6Var;
        this.e = new e7(this, c6Var, 0);
        setWillNotDraw(false);
        this.f21228n = i10;
        org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9(context);
        this.f21224a = z9Var;
        z9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        if (i10 == 2) {
            addView(z9Var, w7.a6.a(48.0f, 0.0f, 7.0f, 0.0f, 0.0f, 48, 49));
        } else {
            addView(z9Var, w7.a6.a(56.0f, 0.0f, 7.0f, 0.0f, 0.0f, 56, 49));
        }
        bi.f4 f4Var = new bi.f4(context, 7);
        this.f21225b = f4Var;
        NotificationCenter.listenEmojiLoading(f4Var);
        if (this.F) {
            i11 = org.telegram.ui.ActionBar.g6.C6;
        } else {
            i11 = org.telegram.ui.ActionBar.g6.f20007j5;
        }
        f4Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
        f4Var.setTextSize(1, 12.0f);
        f4Var.setMaxLines(2);
        f4Var.setGravity(49);
        f4Var.setLines(2);
        f4Var.setEllipsize(TextUtils.TruncateAt.END);
        if (i10 == 2) {
            f7 = 58.0f;
        } else {
            f7 = 66.0f;
        }
        addView(f4Var, w7.a6.a(-2.0f, 6.0f, f7, 6.0f, 0.0f, -1, 51));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f21226c = h5Var;
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20007j5, c6Var));
        h5Var.setTextSize(12);
        h5Var.setMaxLines(2);
        h5Var.setGravity(49);
        h5Var.setAlignment(Layout.Alignment.ALIGN_CENTER);
        if (i10 == 2) {
            f10 = 58.0f;
        } else {
            f10 = 66.0f;
        }
        addView(h5Var, w7.a6.a(-2.0f, 6.0f, f10, 6.0f, 0.0f, -1, 51));
        aq aqVar = new aq(context, 21, c6Var);
        this.d = aqVar;
        aqVar.b(org.telegram.ui.ActionBar.g6.B5, org.telegram.ui.ActionBar.g6.f19972h5, org.telegram.ui.ActionBar.g6.C5);
        aqVar.setDrawUnchecked(false);
        aqVar.setDrawBackgroundAsArc(4);
        aqVar.setProgressDelegate(new ja(this, 5));
        if (i10 == 2) {
            f11 = -40.0f;
        } else {
            f11 = 42.0f;
        }
        addView(aqVar, w7.a6.a(24.0f, 19.0f, f11, 0.0f, 0.0f, 24, 49));
        setBackground(org.telegram.ui.ActionBar.g6.Z(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19990i6, c6Var), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f)));
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
        e7Var.f26627p = 1.0f;
        int i11 = (j10 > Long.MAX_VALUE ? 1 : (j10 == Long.MAX_VALUE ? 0 : -1));
        org.telegram.ui.ActionBar.c6 c6Var = this.f21233y;
        org.telegram.ui.Components.z9 z9Var = this.f21224a;
        bi.f4 f4Var = this.f21225b;
        if (i11 == 0) {
            f4Var.setText(a());
            if (this.f21227f == null) {
                this.f21227f = new f7(getContext(), z9Var, true, c6Var);
            }
            z9Var.h(null, null, this.f21227f, null);
        } else {
            boolean isUserDialog = DialogObject.isUserDialog(j10);
            org.telegram.ui.Components.g6 g6Var = this.G;
            org.telegram.ui.Components.g6 g6Var2 = this.E;
            int i12 = this.f21232x;
            if (isUserDialog) {
                this.h = MessagesController.getInstance(i12).getUser(Long.valueOf(j10));
                TL_account.RequirementToContact isUserContactBlocked = MessagesController.getInstance(i12).isUserContactBlocked(j10);
                this.F = DialogObject.isPremiumBlocked(isUserContactBlocked);
                this.H = DialogObject.getMessagesStarsPrice(isUserContactBlocked);
                if (this.F) {
                    i10 = org.telegram.ui.ActionBar.g6.C6;
                } else {
                    i10 = org.telegram.ui.ActionBar.g6.f20007j5;
                }
                f4Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(i10, c6Var));
                g6Var2.a(this.F);
                if (this.H > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                g6Var.a(z11);
                invalidate();
                e7Var.m(i12, this.h);
                int i13 = this.f21228n;
                if (i13 != 2 && UserObject.isReplyUser(this.h)) {
                    f4Var.setText(LocaleController.getString(R.string.RepliesTitle));
                    e7Var.g(12);
                    z9Var.h(null, null, e7Var, this.h);
                } else if (i13 != 2 && UserObject.isUserSelf(this.h)) {
                    f4Var.setText(LocaleController.getString(R.string.SavedMessages));
                    e7Var.g(1);
                    z9Var.h(null, null, e7Var, this.h);
                } else {
                    if (charSequence != null) {
                        f4Var.setText(charSequence);
                    } else {
                        TLRPC.User user = this.h;
                        if (user != null) {
                            f4Var.setText(ContactsController.formatName(user.first_name, user.last_name));
                        } else {
                            f4Var.setText("");
                        }
                    }
                    z9Var.e(this.h, e7Var);
                }
                z9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
            } else {
                this.h = null;
                this.F = false;
                g6Var2.d(0.0f, true);
                this.H = MessagesController.getInstance(i12).getSendPaidMessagesStars(j10);
                g6Var.getClass();
                g6Var.d(0.0f, true);
                TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-j10));
                if (charSequence != null) {
                    f4Var.setText(charSequence);
                } else if (chat != null) {
                    if (chat.monoforum) {
                        f4Var.setText(og.d.i(chat, i12, false));
                    } else {
                        f4Var.setText(chat.title);
                    }
                } else {
                    f4Var.setText("");
                }
                if (ChatObject.isMonoForum(chat)) {
                    og.d.o(i12, chat, e7Var, z9Var);
                } else {
                    e7Var.k(i12, chat);
                    z9Var.e(chat, e7Var);
                }
                if (chat != null && (chat.forum || chat.monoforum)) {
                    dp = AndroidUtilities.dp(16.0f);
                } else {
                    dp = AndroidUtilities.dp(28.0f);
                }
                z9Var.setRoundRadius(dp);
            }
        }
        this.v = j10;
        this.d.a(z10, false);
    }

    public final void d(TLRPC.TL_forumTopic tL_forumTopic, boolean z10, boolean z11) {
        boolean z12;
        float f7;
        boolean z13 = this.f21231w;
        if (tL_forumTopic != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z13 == z12 && z11) {
            return;
        }
        int i10 = R.id.spring_tag;
        org.telegram.ui.ActionBar.h5 h5Var = this.f21226c;
        o1.k kVar = (o1.k) h5Var.getTag(i10);
        if (kVar != null) {
            kVar.c();
        }
        if (z12) {
            if (z10) {
                h5Var.l(MessagesController.getInstance(this.f21232x).getPeerName(DialogObject.getPeerDialogId(tL_forumTopic.from_id)), false);
            } else {
                h5Var.l(og.d.j(tL_forumTopic, h5Var.getTextPaint(), null), false);
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
            kVar2.f16468u = lVar;
            kVar2.b(new o1.g() {
                @Override
                public final void a(o1.h hVar, float f11, float f12) {
                    float f13 = f11 / 1000.0f;
                    g7 g7Var = g7.this;
                    org.telegram.ui.ActionBar.h5 h5Var2 = g7Var.f21226c;
                    h5Var2.setAlpha(f13);
                    bi.f4 f4Var = g7Var.f21225b;
                    float f14 = 1.0f - f13;
                    f4Var.setAlpha(f14);
                    h5Var2.setTranslationX(f14 * (-AndroidUtilities.dp(10.0f)));
                    f4Var.setTranslationX(f13 * AndroidUtilities.dp(10.0f));
                }
            });
            kVar2.a(new o1.f() {
                @Override
                public final void a(o1.h hVar, boolean z14, float f11, float f12) {
                    g7.this.f21226c.setTag(R.id.spring_tag, null);
                }
            });
            h5Var.setTag(R.id.spring_tag, kVar2);
            kVar2.h();
        } else {
            bi.f4 f4Var = this.f21225b;
            if (z12) {
                h5Var.setAlpha(1.0f);
                f4Var.setAlpha(0.0f);
                h5Var.setTranslationX(0.0f);
                f4Var.setTranslationX(AndroidUtilities.dp(10.0f));
            } else {
                h5Var.setAlpha(0.0f);
                f4Var.setAlpha(1.0f);
                h5Var.setTranslationX(-AndroidUtilities.dp(10.0f));
                f4Var.setTranslationX(0.0f);
            }
        }
        this.f21231w = z12;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TL_account.RequirementToContact requirementToContact;
        long messagesStarsPrice;
        int i12;
        if (i10 == NotificationCenter.userIsPremiumBlockedUpadted) {
            TLRPC.User user = this.h;
            int i13 = this.f21232x;
            if (user != null) {
                requirementToContact = MessagesController.getInstance(i13).isUserContactBlocked(this.h.f19363id);
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
                    i12 = org.telegram.ui.ActionBar.g6.C6;
                } else {
                    i12 = org.telegram.ui.ActionBar.g6.f20007j5;
                }
                this.f21225b.setTextColor(org.telegram.ui.ActionBar.g6.w0(i12, this.f21233y));
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

    public org.telegram.ui.Components.z9 getImageView() {
        return this.f21224a;
    }

    public long getStarsPrice() {
        return this.H;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f21232x).addObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f21232x).removeObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        org.telegram.ui.Components.z9 z9Var = this.f21224a;
        int measuredWidth = (z9Var.getMeasuredWidth() / 2) + z9Var.getLeft();
        int measuredHeight = (z9Var.getMeasuredHeight() / 2) + z9Var.getTop();
        org.telegram.ui.ActionBar.g6.f20098o0.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.B5, this.f21233y));
        org.telegram.ui.ActionBar.g6.f20098o0.setAlpha((int) (this.d.getProgress() * 255.0f));
        if (this.f21228n == 2) {
            f7 = 24.0f;
        } else {
            f7 = 28.0f;
        }
        int dp = AndroidUtilities.dp(f7);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(measuredWidth - dp, measuredHeight - dp, measuredWidth + dp, measuredHeight + dp);
        canvas.drawRoundRect(rectF, z9Var.getRoundRadius()[0], z9Var.getRoundRadius()[0], org.telegram.ui.ActionBar.g6.f20098o0);
        super.onDraw(canvas);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.d.f23604a.f23092q) {
            accessibilityNodeInfo.setSelected(true);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        if (this.f21228n == 2) {
            f7 = 95.0f;
        } else {
            f7 = 103.0f;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7), 1073741824));
    }
}
