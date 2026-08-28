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
import org.telegram.ui.Components.dp;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.nz0;
public class e7 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.Components.y5 A;
    public boolean B;
    public final org.telegram.ui.Components.y5 C;
    public long D;
    public zf.z0 E;
    public Drawable F;
    public final Paint G;
    public long H;
    public nz0 I;
    public final org.telegram.ui.Components.o9 f24308a;
    public final bg.t f24309b;
    public final org.telegram.ui.ActionBar.h5 f24310c;
    public final dp d;
    public final c7 f24311e;
    public d7 f24312f;
    public TLRPC.User h;
    public final int f24313n;
    public float f24314r;
    public long f24315s;
    public long v;
    public boolean f24316w;
    public final int f24317x;
    public final org.telegram.ui.ActionBar.b6 f24318y;

    public e7(Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        int i10;
        float f10;
        float f11;
        float f12;
        this.f24317x = UserConfig.selectedAccount;
        gr grVar = gr.h;
        this.A = new org.telegram.ui.Components.y5(this, 0L, 350L, grVar);
        this.C = new org.telegram.ui.Components.y5(this, 0L, 350L, grVar);
        this.G = new Paint();
        this.f24318y = b6Var;
        this.f24311e = new c7(this, b6Var, 0);
        setWillNotDraw(false);
        this.f24313n = i9;
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
        this.f24308a = o9Var;
        o9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        if (i9 == 2) {
            addView(o9Var, g7.e6.d(48, 48.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        } else {
            addView(o9Var, g7.e6.d(56, 56.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        }
        bg.t tVar = new bg.t(context, 8);
        this.f24309b = tVar;
        NotificationCenter.listenEmojiLoading(tVar);
        if (this.B) {
            i10 = org.telegram.ui.ActionBar.f6.C6;
        } else {
            i10 = org.telegram.ui.ActionBar.f6.f23108j5;
        }
        tVar.setTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        tVar.setTextSize(1, 12.0f);
        tVar.setMaxLines(2);
        tVar.setGravity(49);
        tVar.setLines(2);
        tVar.setEllipsize(TextUtils.TruncateAt.END);
        if (i9 == 2) {
            f10 = 58.0f;
        } else {
            f10 = 66.0f;
        }
        addView(tVar, g7.e6.d(-1, -2.0f, 51, 6.0f, f10, 6.0f, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f24310c = h5Var;
        h5Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23108j5, b6Var));
        h5Var.setTextSize(12);
        h5Var.setMaxLines(2);
        h5Var.setGravity(49);
        h5Var.setAlignment(Layout.Alignment.ALIGN_CENTER);
        if (i9 == 2) {
            f11 = 58.0f;
        } else {
            f11 = 66.0f;
        }
        addView(h5Var, g7.e6.d(-1, -2.0f, 51, 6.0f, f11, 6.0f, 0.0f));
        dp dpVar = new dp(context, 21, b6Var);
        this.d = dpVar;
        dpVar.b(org.telegram.ui.ActionBar.f6.B5, org.telegram.ui.ActionBar.f6.f23072h5, org.telegram.ui.ActionBar.f6.C5);
        dpVar.setDrawUnchecked(false);
        dpVar.setDrawBackgroundAsArc(4);
        dpVar.setProgressDelegate(new ia(this, 5));
        if (i9 == 2) {
            f12 = -40.0f;
        } else {
            f12 = 42.0f;
        }
        addView(dpVar, g7.e6.d(24, 24.0f, 49, 19.0f, f12, 0.0f, 0.0f));
        setBackground(org.telegram.ui.ActionBar.f6.Y(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23092i6, b6Var), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f)));
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
        int i9;
        boolean z11;
        c7 c7Var = this.f24311e;
        c7Var.f35234p = 1.0f;
        org.telegram.ui.ActionBar.b6 b6Var = this.f24318y;
        org.telegram.ui.Components.o9 o9Var = this.f24308a;
        bg.t tVar = this.f24309b;
        if (j10 == Long.MAX_VALUE) {
            tVar.setText(a());
            if (this.f24312f == null) {
                this.f24312f = new d7(getContext(), o9Var, true, b6Var);
            }
            o9Var.h(null, null, this.f24312f, null);
        } else {
            boolean isUserDialog = DialogObject.isUserDialog(j10);
            org.telegram.ui.Components.y5 y5Var = this.C;
            org.telegram.ui.Components.y5 y5Var2 = this.A;
            int i10 = this.f24317x;
            if (isUserDialog) {
                this.h = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
                TL_account.RequirementToContact isUserContactBlocked = MessagesController.getInstance(i10).isUserContactBlocked(j10);
                this.B = DialogObject.isPremiumBlocked(isUserContactBlocked);
                this.D = DialogObject.getMessagesStarsPrice(isUserContactBlocked);
                if (this.B) {
                    i9 = org.telegram.ui.ActionBar.f6.C6;
                } else {
                    i9 = org.telegram.ui.ActionBar.f6.f23108j5;
                }
                tVar.setTextColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
                y5Var2.a(this.B);
                if (this.D > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                y5Var.a(z11);
                invalidate();
                c7Var.m(i10, this.h);
                int i11 = this.f24313n;
                if (i11 != 2 && UserObject.isReplyUser(this.h)) {
                    tVar.setText(LocaleController.getString(R.string.RepliesTitle));
                    c7Var.g(12);
                    o9Var.h(null, null, c7Var, this.h);
                } else if (i11 != 2 && UserObject.isUserSelf(this.h)) {
                    tVar.setText(LocaleController.getString(R.string.SavedMessages));
                    c7Var.g(1);
                    o9Var.h(null, null, c7Var, this.h);
                } else {
                    if (charSequence != null) {
                        tVar.setText(charSequence);
                    } else {
                        TLRPC.User user = this.h;
                        if (user != null) {
                            tVar.setText(ContactsController.formatName(user.first_name, user.last_name));
                        } else {
                            tVar.setText("");
                        }
                    }
                    o9Var.e(this.h, c7Var);
                }
                o9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
            } else {
                this.h = null;
                this.B = false;
                y5Var2.d(0.0f, true);
                this.D = MessagesController.getInstance(i10).getSendPaidMessagesStars(j10);
                y5Var.getClass();
                y5Var.d(0.0f, true);
                TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
                if (charSequence != null) {
                    tVar.setText(charSequence);
                } else if (chat != null) {
                    if (chat.monoforum) {
                        tVar.setText(vf.c.i(chat, i10, false));
                    } else {
                        tVar.setText(chat.title);
                    }
                } else {
                    tVar.setText("");
                }
                if (ChatObject.isMonoForum(chat)) {
                    vf.c.o(i10, chat, c7Var, o9Var);
                } else {
                    c7Var.k(i10, chat);
                    o9Var.e(chat, c7Var);
                }
                if (chat != null && (chat.forum || chat.monoforum)) {
                    dp = AndroidUtilities.dp(16.0f);
                } else {
                    dp = AndroidUtilities.dp(28.0f);
                }
                o9Var.setRoundRadius(dp);
            }
        }
        this.v = j10;
        this.d.a(z10, false);
    }

    public final void d(TLRPC.TL_forumTopic tL_forumTopic, boolean z10, boolean z11) {
        boolean z12;
        float f10;
        boolean z13 = this.f24316w;
        if (tL_forumTopic != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z13 == z12 && z11) {
            return;
        }
        int i9 = R.id.spring_tag;
        org.telegram.ui.ActionBar.h5 h5Var = this.f24310c;
        o1.j jVar = (o1.j) h5Var.getTag(i9);
        if (jVar != null) {
            jVar.c();
        }
        if (z12) {
            if (z10) {
                h5Var.l(MessagesController.getInstance(this.f24317x).getPeerName(DialogObject.getPeerDialogId(tL_forumTopic.from_id)), false);
            } else {
                h5Var.l(vf.c.j(tL_forumTopic, h5Var.getTextPaint(), null), false);
            }
            h5Var.requestLayout();
        }
        float f11 = 0.0f;
        if (z11) {
            if (z12) {
                f10 = 0.0f;
            } else {
                f10 = 1000.0f;
            }
            o1.j jVar2 = new o1.j(new gb.a(f10));
            if (z12) {
                f11 = 1000.0f;
            }
            o1.k kVar = new o1.k(f11);
            kVar.b(1500.0f);
            kVar.a(1.0f);
            jVar2.f18800u = kVar;
            jVar2.b(new o1.g() {
                @Override
                public final void a(o1.h hVar, float f12, float f13) {
                    float f14 = f12 / 1000.0f;
                    e7 e7Var = e7.this;
                    org.telegram.ui.ActionBar.h5 h5Var2 = e7Var.f24310c;
                    h5Var2.setAlpha(f14);
                    bg.t tVar = e7Var.f24309b;
                    float f15 = 1.0f - f14;
                    tVar.setAlpha(f15);
                    h5Var2.setTranslationX(f15 * (-AndroidUtilities.dp(10.0f)));
                    tVar.setTranslationX(f14 * AndroidUtilities.dp(10.0f));
                }
            });
            jVar2.a(new o1.f() {
                @Override
                public final void a(o1.h hVar, boolean z14, float f12, float f13) {
                    e7.this.f24310c.setTag(R.id.spring_tag, null);
                }
            });
            h5Var.setTag(R.id.spring_tag, jVar2);
            jVar2.f();
        } else {
            bg.t tVar = this.f24309b;
            if (z12) {
                h5Var.setAlpha(1.0f);
                tVar.setAlpha(0.0f);
                h5Var.setTranslationX(0.0f);
                tVar.setTranslationX(AndroidUtilities.dp(10.0f));
            } else {
                h5Var.setAlpha(0.0f);
                tVar.setAlpha(1.0f);
                h5Var.setTranslationX(-AndroidUtilities.dp(10.0f));
                tVar.setTranslationX(0.0f);
            }
        }
        this.f24316w = z12;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        TL_account.RequirementToContact requirementToContact;
        long messagesStarsPrice;
        int i11;
        if (i9 == NotificationCenter.userIsPremiumBlockedUpadted) {
            TLRPC.User user = this.h;
            int i12 = this.f24317x;
            if (user != null) {
                requirementToContact = MessagesController.getInstance(i12).isUserContactBlocked(this.h.f22527id);
            } else {
                requirementToContact = null;
            }
            if (this.v < 0) {
                messagesStarsPrice = MessagesController.getInstance(i12).getSendPaidMessagesStars(this.v);
            } else {
                messagesStarsPrice = DialogObject.getMessagesStarsPrice(requirementToContact);
            }
            if (this.B != DialogObject.isPremiumBlocked(requirementToContact) || this.D != messagesStarsPrice) {
                boolean isPremiumBlocked = DialogObject.isPremiumBlocked(requirementToContact);
                this.B = isPremiumBlocked;
                this.D = messagesStarsPrice;
                if (isPremiumBlocked) {
                    i11 = org.telegram.ui.ActionBar.f6.C6;
                } else {
                    i11 = org.telegram.ui.ActionBar.f6.f23108j5;
                }
                this.f24309b.setTextColor(org.telegram.ui.ActionBar.f6.v0(i11, this.f24318y));
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

    public org.telegram.ui.Components.o9 getImageView() {
        return this.f24308a;
    }

    public long getStarsPrice() {
        return this.D;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f24317x).addObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f24317x).removeObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        org.telegram.ui.Components.o9 o9Var = this.f24308a;
        int measuredWidth = (o9Var.getMeasuredWidth() / 2) + o9Var.getLeft();
        int measuredHeight = (o9Var.getMeasuredHeight() / 2) + o9Var.getTop();
        org.telegram.ui.ActionBar.f6.f23191o0.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.B5, this.f24318y));
        org.telegram.ui.ActionBar.f6.f23191o0.setAlpha((int) (this.d.getProgress() * 255.0f));
        if (this.f24313n == 2) {
            f10 = 24.0f;
        } else {
            f10 = 28.0f;
        }
        int dp = AndroidUtilities.dp(f10);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(measuredWidth - dp, measuredHeight - dp, measuredWidth + dp, measuredHeight + dp);
        canvas.drawRoundRect(rectF, o9Var.getRoundRadius()[0], o9Var.getRoundRadius()[0], org.telegram.ui.ActionBar.f6.f23191o0);
        super.onDraw(canvas);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.d.f27781a.f26313q) {
            accessibilityNodeInfo.setSelected(true);
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        float f10;
        if (this.f24313n == 2) {
            f10 = 95.0f;
        } else {
            f10 = 103.0f;
        }
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f10), 1073741824));
    }
}
