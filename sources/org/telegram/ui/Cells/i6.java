package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.cf0;
import org.telegram.ui.Components.e11;
import org.telegram.ui.Components.gd;
import org.telegram.ui.Components.qp;
import org.telegram.ui.Components.rq;
import org.telegram.ui.Components.sq;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.zc;
import org.telegram.ui.e10;
public final class i6 extends a0 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.y5 {
    public final qp A0;
    public boolean B0;
    public Utilities.Callback C0;
    public Utilities.Callback2 D0;
    public TLRPC.Chat E;
    public boolean E0;
    public TLRPC.EncryptedChat F;
    public TextPaint F0;
    public ContactsController.Contact G;
    public TextPaint G0;
    public long H;
    public boolean H0;
    public String I;
    public final zc I0;
    public int J;
    public final Paint J0;
    public TLRPC.FileLocation K;
    public final RectF K0;
    public boolean L;
    public e11 L0;
    public boolean M;
    public boolean M0;
    public final int N;
    public boolean N0;
    public int O;
    public rg.a1 O0;
    public int P;
    public Drawable P0;
    public StaticLayout Q;
    public boolean R;
    public int S;
    public int T;
    public int U;
    public gd V;
    public StaticLayout W;
    public int f22248a0;
    public int f22249b0;
    public int f22250c0;
    public boolean f22251d0;
    public int f22252e0;
    public boolean f22253f;
    public final int f22254f0;
    public int f22255g0;
    public cf0 h;
    public int f22256h0;
    public StaticLayout f22257i0;
    public boolean[] f22258j0;
    public boolean f22259k0;
    public boolean f22260l0;
    public final org.telegram.ui.Components.e6 m0;
    public CharSequence f22261n;
    public boolean f22262n0;
    public long f22263o0;
    public boolean f22264p0;
    public int f22265q0;
    public final ImageReceiver f22266r;
    public StaticLayout f22267r0;
    public final org.telegram.ui.Components.h9 f22268s;
    public final org.telegram.ui.Components.o5 f22269s0;
    public final org.telegram.ui.Components.o5 f22270t0;
    public final ai.ca f22271u0;
    public CharSequence v;
    public final RectF f22272v0;
    public final org.telegram.ui.ActionBar.d6 f22273w;
    public e11 f22274w0;
    public TLRPC.TL_sponsoredPeer f22275x;
    public Paint f22276x0;
    public TLRPC.User f22277y;
    public final zc f22278y0;
    public final RectF f22279z0;

    public i6(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.N = UserConfig.selectedAccount;
        this.f22254f0 = AndroidUtilities.dp(19.0f);
        this.m0 = new org.telegram.ui.Components.e6(this, 0L, 350L, tr.h);
        tr trVar = tr.f31147f;
        this.f22271u0 = new ai.ca(null, false);
        this.f22272v0 = new RectF();
        this.f22278y0 = new zc(this);
        this.f22279z0 = new RectF();
        this.H0 = true;
        this.I0 = new zc(this);
        this.J0 = new Paint(1);
        this.K0 = new RectF();
        this.f22273w = d6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f22266r = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(23.0f));
        this.f22268s = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        qp qpVar = new qp(context, 21, d6Var);
        this.A0 = qpVar;
        qpVar.b(-1, org.telegram.ui.ActionBar.i6.f20822d6, org.telegram.ui.ActionBar.i6.f20952k7);
        qpVar.setDrawUnchecked(false);
        qpVar.setDrawBackgroundAsArc(3);
        addView(qpVar);
        org.telegram.ui.Components.o5 o5Var = new org.telegram.ui.Components.o5(AndroidUtilities.dp(20.0f), this);
        this.f22269s0 = o5Var;
        o5Var.setCallback(this);
        org.telegram.ui.Components.o5 o5Var2 = new org.telegram.ui.Components.o5(AndroidUtilities.dp(20.0f), this);
        this.f22270t0 = o5Var2;
        o5Var2.setCallback(this);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            invalidate();
        } else if (i10 == NotificationCenter.userIsPremiumBlockedUpadted) {
            TLRPC.User user = this.f22277y;
            TL_account.RequirementToContact requirementToContact = null;
            int i12 = this.N;
            if (user != null) {
                if (this.f22260l0) {
                    requirementToContact = MessagesController.getInstance(i12).isUserContactBlocked(this.f22277y.f20189id);
                }
            } else {
                TLRPC.Chat chat = this.E;
                if (chat != null) {
                    requirementToContact = ChatObject.getRequirementToContact(chat);
                } else {
                    ContactsController.Contact contact = this.G;
                    if (contact != null) {
                        if (this.f22260l0 && contact.user != null) {
                            requirementToContact = MessagesController.getInstance(i12).isUserContactBlocked(this.G.user.f20189id);
                        }
                    } else {
                        return;
                    }
                }
            }
            if (this.f22262n0 != DialogObject.isPremiumBlocked(requirementToContact) || this.f22263o0 != DialogObject.getMessagesStarsPrice(requirementToContact)) {
                this.f22262n0 = DialogObject.isPremiumBlocked(requirementToContact);
                this.f22263o0 = DialogObject.getMessagesStarsPrice(requirementToContact);
                invalidate();
            }
        }
    }

    @Override
    public final void e() {
        if (this.Q != null && getMeasuredWidth() > 0) {
            r();
        }
    }

    public TLRPC.Chat getChat() {
        return this.E;
    }

    public int[] getColorKeys() {
        return null;
    }

    public long getDialogId() {
        return this.H;
    }

    public TLRPC.User getUser() {
        return this.f22277y;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f22266r.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        if (this.f22260l0) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
        }
        this.f22270t0.a();
        this.f22269s0.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f22266r.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        if (this.f22260l0) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
        }
        this.f22270t0.b();
        this.f22269s0.b();
    }

    @Override
    public final void onDraw(android.graphics.Canvas r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.i6.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        StaticLayout staticLayout = this.Q;
        if (staticLayout != null) {
            sb2.append(staticLayout.getText());
        }
        if (this.f22259k0) {
            sb2.append(", ");
            c1.n(R.string.AccDescrVerified, "\n", sb2);
        }
        if (this.f22267r0 != null) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(this.f22267r0.getText());
        }
        accessibilityNodeInfo.setText(sb2.toString());
        qp qpVar = this.A0;
        if (qpVar.f30147a.f24098q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(qpVar.f30147a.f24098q);
            accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int dp;
        if (this.f22277y != null || this.E != null || this.F != null || this.G != null) {
            qp qpVar = this.A0;
            if (qpVar != null) {
                if (LocaleController.isRTL) {
                    dp = (i12 - i10) - AndroidUtilities.dp(42.0f);
                } else {
                    dp = AndroidUtilities.dp(42.0f);
                }
                int dp2 = AndroidUtilities.dp(36.0f);
                qpVar.layout(dp, dp2, qpVar.getMeasuredWidth() + dp, qpVar.getMeasuredHeight() + dp2);
            }
            if (z10) {
                r();
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int dp;
        qp qpVar = this.A0;
        if (qpVar != null) {
            qpVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824));
        }
        int size = View.MeasureSpec.getSize(i10);
        if (this.M0) {
            dp = AndroidUtilities.dp(56.0f);
        } else {
            dp = AndroidUtilities.dp(60.0f) + (this.M ? 1 : 0);
        }
        setMeasuredDimension(size, dp);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.i6.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void r() {
        TLRPC.Chat chat;
        TextPaint textPaint;
        int measuredWidth;
        float f7;
        float f10;
        CharSequence charSequence;
        TLRPC.UserStatus userStatus;
        int i10;
        int i11;
        int dp;
        float f11;
        float f12;
        float f13;
        float f14;
        this.R = false;
        this.f22259k0 = false;
        TLRPC.EncryptedChat encryptedChat = this.F;
        float f15 = 11.0f;
        int i12 = this.N;
        if (encryptedChat != null) {
            this.R = true;
            this.H = DialogObject.makeEncryptedDialogId(encryptedChat.f20050id);
            if (!LocaleController.isRTL) {
                this.S = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                this.O = org.telegram.ui.ActionBar.i6.f20761a1.getIntrinsicWidth() + AndroidUtilities.dp(AndroidUtilities.leftBaseline + 4);
            } else {
                this.S = (getMeasuredWidth() - AndroidUtilities.dp(AndroidUtilities.leftBaseline + 2)) - org.telegram.ui.ActionBar.i6.f20761a1.getIntrinsicWidth();
                this.O = AndroidUtilities.dp(11.0f);
            }
            this.T = AndroidUtilities.dp(22.0f);
            v(false, null, null, false);
        } else {
            TLRPC.Chat chat2 = this.E;
            if (chat2 != null) {
                this.H = -chat2.f20042id;
                this.f22259k0 = chat2.verified;
                if (chat2.monoforum && (chat = MessagesController.getInstance(i12).getChat(Long.valueOf(this.E.linked_monoforum_id))) != null) {
                    this.f22259k0 = chat.verified;
                }
                if (!LocaleController.isRTL) {
                    this.O = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                } else {
                    this.O = AndroidUtilities.dp(11.0f);
                }
                v(this.f22259k0, null, this.E, false);
            } else {
                TLRPC.User user = this.f22277y;
                if (user != null) {
                    this.H = user.f20189id;
                    if (!LocaleController.isRTL) {
                        this.O = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                    } else {
                        this.O = AndroidUtilities.dp(11.0f);
                    }
                    this.T = AndroidUtilities.dp(21.0f);
                    this.f22259k0 = this.f22277y.verified;
                    if (!this.L) {
                        MessagesController.getInstance(i12).isPremiumUser(this.f22277y);
                    }
                    v(this.f22259k0, this.f22277y, null, false);
                } else if (this.G != null) {
                    this.H = 0L;
                    if (!LocaleController.isRTL) {
                        this.O = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                    } else {
                        this.O = AndroidUtilities.dp(11.0f);
                    }
                    if (this.V == null) {
                        gd gdVar = new gd(this);
                        this.V = gdVar;
                        gdVar.h = new g(this, 5);
                    }
                }
            }
        }
        if (!LocaleController.isRTL) {
            this.f22265q0 = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
        } else {
            this.f22265q0 = AndroidUtilities.dp(11.0f);
        }
        if (this.f22275x != null) {
            if (this.f22274w0 == null) {
                SpannableStringBuilder append = new SpannableStringBuilder(LocaleController.getString(R.string.SearchAd)).append((CharSequence) " i");
                rq rqVar = new rq(R.drawable.ic_ab_other, 0);
                rqVar.setScale(0.55f, 0.55f);
                rqVar.spaceScaleX = 0.7f;
                rqVar.translate(-AndroidUtilities.dp(2.0f), 0.0f);
                append.setSpan(rqVar, append.length() - 1, append.length(), 33);
                this.f22274w0 = new e11(append, 12.0f, null);
            }
            if (this.f22276x0 == null) {
                this.f22276x0 = new Paint(1);
            }
        }
        CharSequence charSequence2 = this.f22261n;
        CharSequence charSequence3 = charSequence2;
        if (charSequence2 == null) {
            charSequence3 = null;
        }
        TLRPC.Chat chat3 = this.E;
        org.telegram.ui.ActionBar.d6 d6Var = this.f22273w;
        SpannableStringBuilder spannableStringBuilder = charSequence3;
        if (chat3 != null) {
            spannableStringBuilder = charSequence3;
            if (chat3.monoforum) {
                TLRPC.Chat chat4 = MessagesController.getInstance(i12).getChat(Long.valueOf(this.E.linked_monoforum_id));
                spannableStringBuilder = charSequence3;
                if (chat4 != null) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(AndroidUtilities.escape(chat4.title));
                    spannableStringBuilder2.append((CharSequence) " ");
                    int length = spannableStringBuilder2.length();
                    spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.MonoforumSpan));
                    spannableStringBuilder2.setSpan(new e10(LocaleController.getString(R.string.MonoforumSpan), org.telegram.ui.ActionBar.i6.f21209y6, d6Var), length, spannableStringBuilder2.length(), 33);
                    spannableStringBuilder = spannableStringBuilder2;
                } else if (charSequence3 == null) {
                    spannableStringBuilder = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(this.E.title));
                }
            } else if (charSequence3 == null) {
                spannableStringBuilder = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(chat3.title));
            }
        } else if (charSequence3 == null) {
            TLRPC.User user2 = this.f22277y;
            spannableStringBuilder = charSequence3;
            if (user2 != null) {
                spannableStringBuilder = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(UserObject.getUserName(user2)));
            }
        }
        CharSequence replaceNewLines = AndroidUtilities.replaceNewLines(spannableStringBuilder);
        if (TextUtils.isEmpty(replaceNewLines)) {
            TLRPC.User user3 = this.f22277y;
            if (user3 != null && !TextUtils.isEmpty(user3.phone)) {
                replaceNewLines = bi.g(new StringBuilder("+"), this.f22277y.phone, gf.b.c());
            } else {
                replaceNewLines = LocaleController.getString(R.string.HiddenName);
            }
        }
        if (this.E0) {
            if (this.F0 == null) {
                TextPaint textPaint2 = new TextPaint(1);
                this.F0 = textPaint2;
                textPaint2.setTypeface(AndroidUtilities.bold());
            }
            TextPaint textPaint3 = this.F0;
            if (this.M0) {
                f14 = 15.0f;
            } else {
                f14 = 16.0f;
            }
            textPaint3.setTextSize(AndroidUtilities.dp(f14));
            if (this.F != null) {
                this.F0.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Z8, d6Var));
            } else {
                this.F0.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.X8, d6Var));
            }
            textPaint = this.F0;
        } else if (this.F != null) {
            textPaint = org.telegram.ui.ActionBar.i6.E0;
        } else {
            textPaint = org.telegram.ui.ActionBar.i6.D0;
        }
        TextPaint textPaint4 = textPaint;
        if (!LocaleController.isRTL) {
            measuredWidth = (getMeasuredWidth() - this.O) - AndroidUtilities.dp(14.0f);
            this.U = measuredWidth;
        } else {
            measuredWidth = (getMeasuredWidth() - this.O) - AndroidUtilities.dp(AndroidUtilities.leftBaseline);
            this.U = measuredWidth;
        }
        float f16 = 6.0f;
        if (this.R) {
            this.U -= org.telegram.ui.ActionBar.i6.f20761a1.getIntrinsicWidth() + AndroidUtilities.dp(6.0f);
        }
        if (this.f22275x != null) {
            int dp2 = AndroidUtilities.dp(20.66f) + ((int) this.f22274w0.f25884c);
            this.U -= dp2;
            if (LocaleController.isRTL) {
                this.O += dp2;
            }
        }
        if (this.G != null) {
            int measureText = (int) (org.telegram.ui.ActionBar.i6.L0.measureText(LocaleController.getString(R.string.Invite)) + 1.0f);
            this.W = new StaticLayout(LocaleController.getString(R.string.Invite), org.telegram.ui.ActionBar.i6.L0, measureText, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            if (!LocaleController.isRTL) {
                this.f22248a0 = ((getMeasuredWidth() - measureText) - AndroidUtilities.dp(19.0f)) - AndroidUtilities.dp(16.0f);
            } else {
                this.f22248a0 = AndroidUtilities.dp(16.0f) + AndroidUtilities.dp(19.0f);
                this.O += measureText;
                this.f22265q0 += measureText;
            }
            this.U = bi.y(32.0f, measureText, this.U);
        }
        this.U -= getPaddingRight() + getPaddingLeft();
        int paddingRight = measuredWidth - (getPaddingRight() + getPaddingLeft());
        if (this.f22251d0) {
            int dialogUnreadCount = MessagesController.getInstance(i12).getDialogUnreadCount((TLRPC.Dialog) MessagesController.getInstance(i12).dialogs_dict.f(this.H));
            if (dialogUnreadCount != 0) {
                this.f22252e0 = dialogUnreadCount;
                Locale locale = Locale.US;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(dialogUnreadCount);
                String sb3 = sb2.toString();
                f7 = 0.0f;
                f10 = 12.0f;
                this.f22256h0 = Math.max(AndroidUtilities.dp(12.0f), (int) Math.ceil(org.telegram.ui.ActionBar.i6.L0.measureText(sb3)));
                this.f22257i0 = new StaticLayout(sb3, org.telegram.ui.ActionBar.i6.L0, this.f22256h0, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                int dp3 = AndroidUtilities.dp(18.0f) + this.f22256h0;
                this.U -= dp3;
                paddingRight -= dp3;
                if (!LocaleController.isRTL) {
                    this.f22255g0 = (getMeasuredWidth() - this.f22256h0) - AndroidUtilities.dp(19.0f);
                } else {
                    this.f22255g0 = AndroidUtilities.dp(19.0f);
                    this.O += dp3;
                    this.f22265q0 += dp3;
                }
            } else {
                f7 = 0.0f;
                f10 = 12.0f;
                this.f22252e0 = 0;
                this.f22257i0 = null;
            }
        } else {
            f7 = 0.0f;
            f10 = 12.0f;
            this.f22252e0 = 0;
            this.f22257i0 = null;
        }
        int i13 = paddingRight;
        org.telegram.ui.Components.o5 o5Var = this.f22269s0;
        boolean d = o5Var.d();
        int i14 = o5Var.f29234s;
        if (!d) {
            if (LocaleController.isRTL) {
                this.U -= i14;
            } else {
                this.O += i14;
            }
        }
        org.telegram.ui.Components.o5 o5Var2 = this.f22270t0;
        if (!o5Var2.d() && !LocaleController.isRTL) {
            this.U -= o5Var2.f29234s;
        }
        if (this.U < 0) {
            this.U = 0;
        }
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        CharSequence ellipsize = TextUtils.ellipsize(replaceNewLines, textPaint4, this.U - AndroidUtilities.dp(f10), truncateAt);
        if (ellipsize != null) {
            ellipsize = Emoji.replaceEmoji(ellipsize, textPaint4.getFontMetricsInt(), false);
        }
        CharSequence charSequence4 = ellipsize;
        int i15 = this.U;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.Q = new StaticLayout(charSequence4, textPaint4, i15, alignment, 1.0f, 0.0f, false);
        TextPaint textPaint5 = org.telegram.ui.ActionBar.i6.Q0;
        TLRPC.Chat chat5 = this.E;
        if (chat5 != null && this.v == null) {
            if (ChatObject.isCommunity(chat5)) {
                charSequence = LocaleController.getString(R.string.Community).toLowerCase();
            } else if (ChatObject.isChannelAndNotMegaGroup(this.E)) {
                TLRPC.Chat chat6 = this.E;
                int i16 = chat6.participants_count;
                if (i16 != 0) {
                    charSequence = LocaleController.formatPluralStringComma("Subscribers", i16);
                } else if (!ChatObject.isPublic(chat6)) {
                    charSequence = LocaleController.getString(R.string.ChannelPrivate).toLowerCase();
                } else {
                    charSequence = LocaleController.getString(R.string.ChannelPublic).toLowerCase();
                }
            } else {
                TLRPC.Chat chat7 = this.E;
                int i17 = chat7.participants_count;
                if (i17 != 0) {
                    charSequence = LocaleController.formatPluralStringComma("Members", i17);
                } else if (chat7.has_geo) {
                    charSequence = LocaleController.getString(R.string.MegaLocation);
                } else if (ChatObject.isMonoForum(chat7)) {
                    charSequence = LocaleController.getString(R.string.MonoforumMessages);
                } else if (!ChatObject.isPublic(this.E)) {
                    charSequence = LocaleController.getString(R.string.MegaPrivate).toLowerCase();
                } else {
                    charSequence = LocaleController.getString(R.string.MegaPublic).toLowerCase();
                }
            }
            this.P = AndroidUtilities.dp(19.0f);
        } else {
            CharSequence charSequence5 = this.v;
            if (charSequence5 == null) {
                TLRPC.User user4 = this.f22277y;
                if (user4 != null) {
                    if (MessagesController.isSupportUser(user4)) {
                        charSequence = LocaleController.getString(R.string.SupportStatus);
                    } else {
                        TLRPC.User user5 = this.f22277y;
                        boolean z10 = user5.bot;
                        if (z10 && (i10 = user5.bot_active_users) != 0) {
                            charSequence = LocaleController.formatPluralStringSpaced("BotUsersShort", i10);
                        } else if (z10) {
                            charSequence = LocaleController.getString(R.string.Bot);
                        } else {
                            long j3 = user5.f20189id;
                            if (j3 == 489000) {
                                charSequence = LocaleController.getString(R.string.VerifyCodesNotifications);
                            } else if (UserObject.isService(j3)) {
                                charSequence = LocaleController.getString(R.string.ServiceNotifications);
                            } else {
                                if (this.f22258j0 == null) {
                                    this.f22258j0 = new boolean[1];
                                }
                                boolean[] zArr = this.f22258j0;
                                zArr[0] = false;
                                charSequence5 = LocaleController.formatUserStatus(i12, this.f22277y, zArr);
                                if (this.f22258j0[0]) {
                                    textPaint5 = org.telegram.ui.ActionBar.i6.P0;
                                }
                                TLRPC.User user6 = this.f22277y;
                                if (user6 != null && (user6.f20189id == UserConfig.getInstance(i12).getClientUserId() || ((userStatus = this.f22277y.status) != null && userStatus.expires > ConnectionsManager.getInstance(i12).getCurrentTime()))) {
                                    textPaint5 = org.telegram.ui.ActionBar.i6.P0;
                                    charSequence = LocaleController.getString(R.string.Online);
                                }
                            }
                        }
                    }
                } else {
                    charSequence = null;
                }
                if (!this.L || UserObject.isReplyUser(this.f22277y)) {
                    this.P = AndroidUtilities.dp(20.0f);
                    charSequence = null;
                }
            }
            charSequence = charSequence5;
            if (!this.L) {
            }
            this.P = AndroidUtilities.dp(20.0f);
            charSequence = null;
        }
        if (this.E0) {
            if (this.G0 == null) {
                this.G0 = new TextPaint(1);
            }
            TextPaint textPaint6 = this.G0;
            if (this.M0) {
                f13 = 13.0f;
            } else {
                f13 = 15.0f;
            }
            textPaint6.setTextSize(AndroidUtilities.dp(f13));
            if (textPaint5 == org.telegram.ui.ActionBar.i6.Q0) {
                this.G0.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.A6, d6Var));
            } else if (textPaint5 == org.telegram.ui.ActionBar.i6.P0) {
                this.G0.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21043p6, d6Var));
            }
            textPaint5 = this.G0;
        }
        if (!TextUtils.isEmpty(charSequence)) {
            i11 = i13;
            this.f22267r0 = new StaticLayout(TextUtils.ellipsize(charSequence, textPaint5, i13 - AndroidUtilities.dp(f10), truncateAt), textPaint5, i13, alignment, 1.0f, 0.0f, false);
            this.P = AndroidUtilities.dp(9.0f);
            this.T -= AndroidUtilities.dp(10.0f);
        } else {
            i11 = i13;
            this.P = AndroidUtilities.dp(20.0f);
            this.f22267r0 = null;
        }
        if (LocaleController.isRTL) {
            dp = (getMeasuredWidth() - AndroidUtilities.dp(57.0f)) - getPaddingRight();
        } else {
            if (this.M0) {
                f15 = 14.0f;
            } else if (this.N0) {
                f15 = 15.0f;
            }
            dp = AndroidUtilities.dp(f15) + getPaddingLeft();
        }
        RectF rectF = this.f22271u0.F;
        float f17 = dp;
        if (this.M0) {
            f11 = 6.0f;
        } else {
            f11 = 7.0f;
        }
        float dp4 = AndroidUtilities.dp(f11);
        float f18 = 46.0f;
        if (this.M0) {
            f12 = 44.0f;
        } else if (this.N0) {
            f12 = 42.0f;
        } else {
            f12 = 46.0f;
        }
        float dp5 = AndroidUtilities.dp(f12) + dp;
        if (!this.M0) {
            f16 = 7.0f;
        }
        int dp6 = AndroidUtilities.dp(f16);
        if (this.M0) {
            f18 = 44.0f;
        }
        rectF.set(f17, dp4, dp5, AndroidUtilities.dp(f18) + dp6);
        if (LocaleController.isRTL) {
            if (this.Q.getLineCount() > 0 && this.Q.getLineLeft(0) == f7) {
                double ceil = Math.ceil(this.Q.getLineWidth(0));
                double d10 = this.U;
                if (ceil < d10) {
                    this.O = (int) ((d10 - ceil) + this.O);
                }
            }
            StaticLayout staticLayout = this.f22267r0;
            if (staticLayout != null && staticLayout.getLineCount() > 0 && this.f22267r0.getLineLeft(0) == f7) {
                double ceil2 = Math.ceil(this.f22267r0.getLineWidth(0));
                double d11 = i11;
                if (ceil2 < d11) {
                    this.f22265q0 = (int) ((d11 - ceil2) + this.f22265q0);
                }
            }
        } else {
            if (this.Q.getLineCount() > 0 && this.Q.getLineRight(0) == this.U) {
                double ceil3 = Math.ceil(this.Q.getLineWidth(0));
                double d12 = this.U;
                if (ceil3 < d12) {
                    this.O = (int) (this.O - (d12 - ceil3));
                }
            }
            StaticLayout staticLayout2 = this.f22267r0;
            if (staticLayout2 != null && staticLayout2.getLineCount() > 0 && this.f22267r0.getLineRight(0) == i11) {
                double ceil4 = Math.ceil(this.f22267r0.getLineWidth(0));
                double d13 = i11;
                if (ceil4 < d13) {
                    this.f22265q0 = (int) (this.f22265q0 - (d13 - ceil4));
                }
            }
        }
        this.O = getPaddingLeft() + this.O;
        this.f22265q0 = getPaddingLeft() + this.f22265q0;
        this.S = getPaddingLeft() + this.S;
        if (this.M0) {
            this.O = AndroidUtilities.dp(1.0f) + this.O;
            this.P = AndroidUtilities.dp(1.0f) + this.P;
        }
    }

    public final void s(boolean z10, boolean z11) {
        qp qpVar = this.A0;
        if (qpVar == null) {
            return;
        }
        qpVar.a(z10, z11);
    }

    public void setAd(TLRPC.TL_sponsoredPeer tL_sponsoredPeer) {
        this.f22275x = tL_sponsoredPeer;
    }

    public void setAllowEmojiStatus(boolean z10) {
        this.H0 = z10;
    }

    public void setOnSponsoredOptionsClick(Utilities.Callback2<i6, TLRPC.TL_sponsoredPeer> callback2) {
        this.D0 = callback2;
    }

    public void setOpenBotButton(boolean z10) {
        int i10;
        int i11;
        if (this.f22264p0 == z10) {
            return;
        }
        if (this.L0 == null) {
            this.L0 = new e11(LocaleController.getString(R.string.BotOpen), 14.0f, AndroidUtilities.bold());
        }
        if (z10) {
            i10 = AndroidUtilities.dp(30.0f) + ((int) this.L0.f25884c);
        } else {
            i10 = 0;
        }
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i11 = i10;
        } else {
            i11 = 0;
        }
        if (z11) {
            i10 = 0;
        }
        setPadding(i11, 0, i10, 0);
        this.f22264p0 = z10;
        this.I0.c(false);
    }

    public void setRectangularAvatar(boolean z10) {
        this.N0 = z10;
    }

    public void setSubLabel(CharSequence charSequence) {
        this.v = charSequence;
        u(0);
    }

    public final void t(Object obj, TLRPC.EncryptedChat encryptedChat, CharSequence charSequence, CharSequence charSequence2, boolean z10, boolean z11) {
        boolean z12;
        this.f22261n = charSequence;
        boolean z13 = obj instanceof TLRPC.User;
        int i10 = this.N;
        TL_account.RequirementToContact requirementToContact = null;
        if (z13) {
            this.f22277y = (TLRPC.User) obj;
            this.E = null;
            this.G = null;
            if (this.f22260l0) {
                requirementToContact = MessagesController.getInstance(i10).isUserContactBlocked(this.f22277y.f20189id);
            }
            this.f22262n0 = DialogObject.isPremiumBlocked(requirementToContact);
            this.f22263o0 = DialogObject.getMessagesStarsPrice(requirementToContact);
            if (this.B0 && this.f22277y.bot_has_main_app) {
                z12 = true;
            } else {
                z12 = false;
            }
            setOpenBotButton(z12);
        } else if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            this.E = chat;
            this.f22277y = null;
            this.G = null;
            TL_account.RequirementToContact requirementToContact2 = ChatObject.getRequirementToContact(chat);
            this.f22262n0 = DialogObject.isPremiumBlocked(requirementToContact2);
            this.f22263o0 = DialogObject.getMessagesStarsPrice(requirementToContact2);
            setOpenBotButton(false);
        } else if (obj instanceof ContactsController.Contact) {
            ContactsController.Contact contact = (ContactsController.Contact) obj;
            this.G = contact;
            this.E = null;
            this.f22277y = null;
            if (this.f22260l0 && contact.user != null) {
                requirementToContact = MessagesController.getInstance(i10).isUserContactBlocked(this.G.user.f20189id);
            }
            this.f22262n0 = DialogObject.isPremiumBlocked(requirementToContact);
            this.f22263o0 = DialogObject.getMessagesStarsPrice(requirementToContact);
            setOpenBotButton(false);
        } else {
            setOpenBotButton(false);
        }
        this.F = encryptedChat;
        this.v = charSequence2;
        this.f22251d0 = z10;
        this.L = z11;
        u(0);
    }

    public final void u(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.i6.u(int):void");
    }

    public final void v(boolean z10, TLRPC.User user, TLRPC.Chat chat, boolean z11) {
        long j3;
        boolean z12 = LocaleController.isRTL;
        org.telegram.ui.Components.o5 o5Var = this.f22270t0;
        o5Var.f29227a = z12;
        boolean z13 = this.H0;
        org.telegram.ui.ActionBar.d6 d6Var = this.f22273w;
        if (z13 && z10) {
            o5Var.g(new sq(org.telegram.ui.ActionBar.i6.f20854f1, org.telegram.ui.ActionBar.i6.f20908i1, 0, 0), z11);
            o5Var.k(null);
        } else if (z13 && user != null && !this.L && DialogObject.getEmojiStatusDocumentId(user.emoji_status) != 0) {
            o5Var.j(DialogObject.getEmojiStatusDocumentId(user.emoji_status), z11);
            o5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21231z9, d6Var)));
        } else if (this.H0 && chat != null && !this.L && DialogObject.getEmojiStatusDocumentId(chat.emoji_status) != 0) {
            o5Var.j(DialogObject.getEmojiStatusDocumentId(chat.emoji_status), z11);
            o5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21231z9, d6Var)));
        } else if (this.H0 && user != null && !this.L && MessagesController.getInstance(this.N).isPremiumUser(user)) {
            o5Var.g(rg.b1.d().f46066e, z11);
            o5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21231z9, d6Var)));
        } else {
            o5Var.g(null, z11);
            o5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21231z9, d6Var)));
        }
        if (user != null) {
            j3 = DialogObject.getBotVerificationIcon(user);
        } else if (chat != null) {
            j3 = DialogObject.getBotVerificationIcon(chat);
        } else {
            j3 = 0;
        }
        org.telegram.ui.Components.o5 o5Var2 = this.f22269s0;
        if (j3 != 0 && !this.L) {
            o5Var2.j(j3, z11);
        } else {
            o5Var2.g(null, z11);
        }
        o5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21231z9, d6Var)));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f22270t0 != drawable && this.f22269s0 != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
