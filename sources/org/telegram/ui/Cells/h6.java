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
import org.telegram.messenger.ll;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.dp;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.nz0;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.xd0;
import org.telegram.ui.m00;
public final class h6 extends a0 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.w5 {
    public TLRPC.Chat A;
    public boolean A0;
    public TLRPC.EncryptedChat B;
    public TextPaint B0;
    public ContactsController.Contact C;
    public TextPaint C0;
    public long D;
    public boolean D0;
    public String E;
    public final pc E0;
    public int F;
    public final Paint F0;
    public TLRPC.FileLocation G;
    public final RectF G0;
    public boolean H;
    public nz0 H0;
    public boolean I;
    public boolean I0;
    public final int J;
    public boolean J0;
    public int K;
    public zf.z0 K0;
    public int L;
    public Drawable L0;
    public StaticLayout M;
    public boolean N;
    public int O;
    public int P;
    public int Q;
    public wc R;
    public StaticLayout S;
    public int T;
    public int U;
    public int V;
    public boolean W;
    public int f24439a0;
    public final int f24440b0;
    public int f24441c0;
    public int f24442d0;
    public StaticLayout f24443e0;
    public boolean f24444f;
    public boolean[] f24445f0;
    public boolean f24446g0;
    public xd0 h;
    public boolean f24447h0;
    public final org.telegram.ui.Components.y5 f24448i0;
    public boolean f24449j0;
    public long f24450k0;
    public boolean f24451l0;
    public int m0;
    public CharSequence f24452n;
    public StaticLayout f24453n0;
    public final org.telegram.ui.Components.i5 f24454o0;
    public final org.telegram.ui.Components.i5 f24455p0;
    public final ih.l7 f24456q0;
    public final ImageReceiver f24457r;
    public final RectF f24458r0;
    public final org.telegram.ui.Components.z8 f24459s;
    public nz0 f24460s0;
    public Paint f24461t0;
    public final pc f24462u0;
    public CharSequence v;
    public final RectF f24463v0;
    public final org.telegram.ui.ActionBar.b6 f24464w;
    public final dp f24465w0;
    public TLRPC.TL_sponsoredPeer f24466x;
    public boolean f24467x0;
    public TLRPC.User f24468y;
    public Utilities.Callback f24469y0;
    public Utilities.Callback2 f24470z0;

    public h6(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.J = UserConfig.selectedAccount;
        this.f24440b0 = AndroidUtilities.dp(19.0f);
        this.f24448i0 = new org.telegram.ui.Components.y5(this, 0L, 350L, gr.h);
        gr grVar = gr.f28844f;
        this.f24456q0 = new ih.l7(null, false);
        this.f24458r0 = new RectF();
        this.f24462u0 = new pc(this);
        this.f24463v0 = new RectF();
        this.D0 = true;
        this.E0 = new pc(this);
        this.F0 = new Paint(1);
        this.G0 = new RectF();
        this.f24464w = b6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f24457r = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(23.0f));
        this.f24459s = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
        dp dpVar = new dp(context, 21, b6Var);
        this.f24465w0 = dpVar;
        dpVar.b(-1, org.telegram.ui.ActionBar.f6.f23001d6, org.telegram.ui.ActionBar.f6.f23128k7);
        dpVar.setDrawUnchecked(false);
        dpVar.setDrawBackgroundAsArc(3);
        addView(dpVar);
        org.telegram.ui.Components.i5 i5Var = new org.telegram.ui.Components.i5(AndroidUtilities.dp(20.0f), this);
        this.f24454o0 = i5Var;
        i5Var.setCallback(this);
        org.telegram.ui.Components.i5 i5Var2 = new org.telegram.ui.Components.i5(AndroidUtilities.dp(20.0f), this);
        this.f24455p0 = i5Var2;
        i5Var2.setCallback(this);
    }

    @Override
    public final void d() {
        if (this.M != null && getMeasuredWidth() > 0) {
            r();
        }
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.emojiLoaded) {
            invalidate();
        } else if (i9 == NotificationCenter.userIsPremiumBlockedUpadted) {
            TLRPC.User user = this.f24468y;
            TL_account.RequirementToContact requirementToContact = null;
            int i11 = this.J;
            if (user != null) {
                if (this.f24447h0) {
                    requirementToContact = MessagesController.getInstance(i11).isUserContactBlocked(this.f24468y.f22527id);
                }
            } else {
                TLRPC.Chat chat = this.A;
                if (chat != null) {
                    requirementToContact = ChatObject.getRequirementToContact(chat);
                } else {
                    ContactsController.Contact contact = this.C;
                    if (contact != null) {
                        if (this.f24447h0 && contact.user != null) {
                            requirementToContact = MessagesController.getInstance(i11).isUserContactBlocked(this.C.user.f22527id);
                        }
                    } else {
                        return;
                    }
                }
            }
            if (this.f24449j0 != DialogObject.isPremiumBlocked(requirementToContact) || this.f24450k0 != DialogObject.getMessagesStarsPrice(requirementToContact)) {
                this.f24449j0 = DialogObject.isPremiumBlocked(requirementToContact);
                this.f24450k0 = DialogObject.getMessagesStarsPrice(requirementToContact);
                invalidate();
            }
        }
    }

    public TLRPC.Chat getChat() {
        return this.A;
    }

    public int[] getColorKeys() {
        return null;
    }

    public long getDialogId() {
        return this.D;
    }

    public TLRPC.User getUser() {
        return this.f24468y;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f24457r.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        if (this.f24447h0) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
        }
        this.f24455p0.a();
        this.f24454o0.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f24457r.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        if (this.f24447h0) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
        }
        this.f24455p0.b();
        this.f24454o0.b();
    }

    @Override
    public final void onDraw(android.graphics.Canvas r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.h6.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        StaticLayout staticLayout = this.M;
        if (staticLayout != null) {
            sb2.append(staticLayout.getText());
        }
        if (this.f24446g0) {
            sb2.append(", ");
            j2.k(R.string.AccDescrVerified, "\n", sb2);
        }
        if (this.f24453n0 != null) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(this.f24453n0.getText());
        }
        accessibilityNodeInfo.setText(sb2.toString());
        dp dpVar = this.f24465w0;
        if (dpVar.f27781a.f26313q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(dpVar.f27781a.f26313q);
            accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int dp;
        if (this.f24468y != null || this.A != null || this.B != null || this.C != null) {
            dp dpVar = this.f24465w0;
            if (dpVar != null) {
                if (LocaleController.isRTL) {
                    dp = (i11 - i9) - AndroidUtilities.dp(42.0f);
                } else {
                    dp = AndroidUtilities.dp(42.0f);
                }
                int dp2 = AndroidUtilities.dp(36.0f);
                dpVar.layout(dp, dp2, dpVar.getMeasuredWidth() + dp, dpVar.getMeasuredHeight() + dp2);
            }
            if (z10) {
                r();
            }
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int dp;
        dp dpVar = this.f24465w0;
        if (dpVar != null) {
            dpVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824));
        }
        int size = View.MeasureSpec.getSize(i9);
        if (this.I0) {
            dp = AndroidUtilities.dp(56.0f);
        } else {
            dp = AndroidUtilities.dp(60.0f) + (this.I ? 1 : 0);
        }
        setMeasuredDimension(size, dp);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.h6.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void r() {
        TLRPC.Chat chat;
        TextPaint textPaint;
        int measuredWidth;
        float f10;
        float f11;
        CharSequence charSequence;
        TLRPC.UserStatus userStatus;
        int i9;
        int i10;
        int dp;
        float f12;
        float f13;
        float f14;
        float f15;
        this.N = false;
        this.f24446g0 = false;
        TLRPC.EncryptedChat encryptedChat = this.B;
        float f16 = 11.0f;
        int i11 = this.J;
        if (encryptedChat != null) {
            this.N = true;
            this.D = DialogObject.makeEncryptedDialogId(encryptedChat.f22388id);
            if (!LocaleController.isRTL) {
                this.O = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                this.K = org.telegram.ui.ActionBar.f6.f22943a1.getIntrinsicWidth() + AndroidUtilities.dp(AndroidUtilities.leftBaseline + 4);
            } else {
                this.O = (getMeasuredWidth() - AndroidUtilities.dp(AndroidUtilities.leftBaseline + 2)) - org.telegram.ui.ActionBar.f6.f22943a1.getIntrinsicWidth();
                this.K = AndroidUtilities.dp(11.0f);
            }
            this.P = AndroidUtilities.dp(22.0f);
            v(false, null, null, false);
        } else {
            TLRPC.Chat chat2 = this.A;
            if (chat2 != null) {
                this.D = -chat2.f22380id;
                this.f24446g0 = chat2.verified;
                if (chat2.monoforum && (chat = MessagesController.getInstance(i11).getChat(Long.valueOf(this.A.linked_monoforum_id))) != null) {
                    this.f24446g0 = chat.verified;
                }
                if (!LocaleController.isRTL) {
                    this.K = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                } else {
                    this.K = AndroidUtilities.dp(11.0f);
                }
                v(this.f24446g0, null, this.A, false);
            } else {
                TLRPC.User user = this.f24468y;
                if (user != null) {
                    this.D = user.f22527id;
                    if (!LocaleController.isRTL) {
                        this.K = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                    } else {
                        this.K = AndroidUtilities.dp(11.0f);
                    }
                    this.P = AndroidUtilities.dp(21.0f);
                    this.f24446g0 = this.f24468y.verified;
                    if (!this.H) {
                        MessagesController.getInstance(i11).isPremiumUser(this.f24468y);
                    }
                    v(this.f24446g0, this.f24468y, null, false);
                } else if (this.C != null) {
                    this.D = 0L;
                    if (!LocaleController.isRTL) {
                        this.K = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                    } else {
                        this.K = AndroidUtilities.dp(11.0f);
                    }
                    if (this.R == null) {
                        wc wcVar = new wc(this);
                        this.R = wcVar;
                        wcVar.h = new g(this, 5);
                    }
                }
            }
        }
        if (!LocaleController.isRTL) {
            this.m0 = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
        } else {
            this.m0 = AndroidUtilities.dp(11.0f);
        }
        if (this.f24466x != null) {
            if (this.f24460s0 == null) {
                SpannableStringBuilder append = new SpannableStringBuilder(LocaleController.getString(R.string.SearchAd)).append((CharSequence) " i");
                eq eqVar = new eq(R.drawable.ic_ab_other, 0);
                eqVar.setScale(0.55f, 0.55f);
                eqVar.spaceScaleX = 0.7f;
                eqVar.translate(-AndroidUtilities.dp(2.0f), 0.0f);
                append.setSpan(eqVar, append.length() - 1, append.length(), 33);
                this.f24460s0 = new nz0(append, 12.0f, null);
            }
            if (this.f24461t0 == null) {
                this.f24461t0 = new Paint(1);
            }
        }
        CharSequence charSequence2 = this.f24452n;
        CharSequence charSequence3 = charSequence2;
        if (charSequence2 == null) {
            charSequence3 = null;
        }
        TLRPC.Chat chat3 = this.A;
        org.telegram.ui.ActionBar.b6 b6Var = this.f24464w;
        SpannableStringBuilder spannableStringBuilder = charSequence3;
        if (chat3 != null) {
            spannableStringBuilder = charSequence3;
            if (chat3.monoforum) {
                TLRPC.Chat chat4 = MessagesController.getInstance(i11).getChat(Long.valueOf(this.A.linked_monoforum_id));
                spannableStringBuilder = charSequence3;
                if (chat4 != null) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(AndroidUtilities.escape(chat4.title));
                    spannableStringBuilder2.append((CharSequence) " ");
                    int length = spannableStringBuilder2.length();
                    spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.MonoforumSpan));
                    spannableStringBuilder2.setSpan(new m00(LocaleController.getString(R.string.MonoforumSpan), org.telegram.ui.ActionBar.f6.f23369y6, b6Var), length, spannableStringBuilder2.length(), 33);
                    spannableStringBuilder = spannableStringBuilder2;
                } else if (charSequence3 == null) {
                    spannableStringBuilder = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(this.A.title));
                }
            } else if (charSequence3 == null) {
                spannableStringBuilder = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(chat3.title));
            }
        } else if (charSequence3 == null) {
            TLRPC.User user2 = this.f24468y;
            spannableStringBuilder = charSequence3;
            if (user2 != null) {
                spannableStringBuilder = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(UserObject.getUserName(user2)));
            }
        }
        CharSequence replaceNewLines = AndroidUtilities.replaceNewLines(spannableStringBuilder);
        if (TextUtils.isEmpty(replaceNewLines)) {
            TLRPC.User user3 = this.f24468y;
            if (user3 != null && !TextUtils.isEmpty(user3.phone)) {
                replaceNewLines = ll.g(new StringBuilder("+"), this.f24468y.phone, ne.b.c());
            } else {
                replaceNewLines = LocaleController.getString(R.string.HiddenName);
            }
        }
        if (this.A0) {
            if (this.B0 == null) {
                TextPaint textPaint2 = new TextPaint(1);
                this.B0 = textPaint2;
                textPaint2.setTypeface(AndroidUtilities.bold());
            }
            TextPaint textPaint3 = this.B0;
            if (this.I0) {
                f15 = 15.0f;
            } else {
                f15 = 16.0f;
            }
            textPaint3.setTextSize(AndroidUtilities.dp(f15));
            if (this.B != null) {
                this.B0.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Z8, b6Var));
            } else {
                this.B0.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.X8, b6Var));
            }
            textPaint = this.B0;
        } else if (this.B != null) {
            textPaint = org.telegram.ui.ActionBar.f6.E0;
        } else {
            textPaint = org.telegram.ui.ActionBar.f6.D0;
        }
        TextPaint textPaint4 = textPaint;
        if (!LocaleController.isRTL) {
            measuredWidth = (getMeasuredWidth() - this.K) - AndroidUtilities.dp(14.0f);
            this.Q = measuredWidth;
        } else {
            measuredWidth = (getMeasuredWidth() - this.K) - AndroidUtilities.dp(AndroidUtilities.leftBaseline);
            this.Q = measuredWidth;
        }
        float f17 = 6.0f;
        if (this.N) {
            this.Q -= org.telegram.ui.ActionBar.f6.f22943a1.getIntrinsicWidth() + AndroidUtilities.dp(6.0f);
        }
        if (this.f24466x != null) {
            int dp2 = AndroidUtilities.dp(20.66f) + ((int) this.f24460s0.f31223c);
            this.Q -= dp2;
            if (LocaleController.isRTL) {
                this.K += dp2;
            }
        }
        if (this.C != null) {
            int measureText = (int) (org.telegram.ui.ActionBar.f6.L0.measureText(LocaleController.getString(R.string.Invite)) + 1.0f);
            this.S = new StaticLayout(LocaleController.getString(R.string.Invite), org.telegram.ui.ActionBar.f6.L0, measureText, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            if (!LocaleController.isRTL) {
                this.T = ((getMeasuredWidth() - measureText) - AndroidUtilities.dp(19.0f)) - AndroidUtilities.dp(16.0f);
            } else {
                this.T = AndroidUtilities.dp(16.0f) + AndroidUtilities.dp(19.0f);
                this.K += measureText;
                this.m0 += measureText;
            }
            this.Q = ll.w(32.0f, measureText, this.Q);
        }
        this.Q -= getPaddingRight() + getPaddingLeft();
        int paddingRight = measuredWidth - (getPaddingRight() + getPaddingLeft());
        if (this.W) {
            int dialogUnreadCount = MessagesController.getInstance(i11).getDialogUnreadCount((TLRPC.Dialog) MessagesController.getInstance(i11).dialogs_dict.f(this.D));
            if (dialogUnreadCount != 0) {
                this.f24439a0 = dialogUnreadCount;
                Locale locale = Locale.US;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(dialogUnreadCount);
                String sb3 = sb2.toString();
                f10 = 0.0f;
                f11 = 12.0f;
                this.f24442d0 = Math.max(AndroidUtilities.dp(12.0f), (int) Math.ceil(org.telegram.ui.ActionBar.f6.L0.measureText(sb3)));
                this.f24443e0 = new StaticLayout(sb3, org.telegram.ui.ActionBar.f6.L0, this.f24442d0, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                int dp3 = AndroidUtilities.dp(18.0f) + this.f24442d0;
                this.Q -= dp3;
                paddingRight -= dp3;
                if (!LocaleController.isRTL) {
                    this.f24441c0 = (getMeasuredWidth() - this.f24442d0) - AndroidUtilities.dp(19.0f);
                } else {
                    this.f24441c0 = AndroidUtilities.dp(19.0f);
                    this.K += dp3;
                    this.m0 += dp3;
                }
            } else {
                f10 = 0.0f;
                f11 = 12.0f;
                this.f24439a0 = 0;
                this.f24443e0 = null;
            }
        } else {
            f10 = 0.0f;
            f11 = 12.0f;
            this.f24439a0 = 0;
            this.f24443e0 = null;
        }
        int i12 = paddingRight;
        org.telegram.ui.Components.i5 i5Var = this.f24454o0;
        boolean d = i5Var.d();
        int i13 = i5Var.f29322s;
        if (!d) {
            if (LocaleController.isRTL) {
                this.Q -= i13;
            } else {
                this.K += i13;
            }
        }
        org.telegram.ui.Components.i5 i5Var2 = this.f24455p0;
        if (!i5Var2.d() && !LocaleController.isRTL) {
            this.Q -= i5Var2.f29322s;
        }
        if (this.Q < 0) {
            this.Q = 0;
        }
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        CharSequence ellipsize = TextUtils.ellipsize(replaceNewLines, textPaint4, this.Q - AndroidUtilities.dp(f11), truncateAt);
        if (ellipsize != null) {
            ellipsize = Emoji.replaceEmoji(ellipsize, textPaint4.getFontMetricsInt(), false);
        }
        CharSequence charSequence4 = ellipsize;
        int i14 = this.Q;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.M = new StaticLayout(charSequence4, textPaint4, i14, alignment, 1.0f, 0.0f, false);
        TextPaint textPaint5 = org.telegram.ui.ActionBar.f6.Q0;
        TLRPC.Chat chat5 = this.A;
        if (chat5 != null && this.v == null) {
            if (ChatObject.isCommunity(chat5)) {
                charSequence = LocaleController.getString(R.string.Community).toLowerCase();
            } else if (ChatObject.isChannelAndNotMegaGroup(this.A)) {
                TLRPC.Chat chat6 = this.A;
                int i15 = chat6.participants_count;
                if (i15 != 0) {
                    charSequence = LocaleController.formatPluralStringComma("Subscribers", i15);
                } else if (!ChatObject.isPublic(chat6)) {
                    charSequence = LocaleController.getString(R.string.ChannelPrivate).toLowerCase();
                } else {
                    charSequence = LocaleController.getString(R.string.ChannelPublic).toLowerCase();
                }
            } else {
                TLRPC.Chat chat7 = this.A;
                int i16 = chat7.participants_count;
                if (i16 != 0) {
                    charSequence = LocaleController.formatPluralStringComma("Members", i16);
                } else if (chat7.has_geo) {
                    charSequence = LocaleController.getString(R.string.MegaLocation);
                } else if (ChatObject.isMonoForum(chat7)) {
                    charSequence = LocaleController.getString(R.string.MonoforumMessages);
                } else if (!ChatObject.isPublic(this.A)) {
                    charSequence = LocaleController.getString(R.string.MegaPrivate).toLowerCase();
                } else {
                    charSequence = LocaleController.getString(R.string.MegaPublic).toLowerCase();
                }
            }
            this.L = AndroidUtilities.dp(19.0f);
        } else {
            CharSequence charSequence5 = this.v;
            if (charSequence5 == null) {
                TLRPC.User user4 = this.f24468y;
                if (user4 != null) {
                    if (MessagesController.isSupportUser(user4)) {
                        charSequence = LocaleController.getString(R.string.SupportStatus);
                    } else {
                        TLRPC.User user5 = this.f24468y;
                        boolean z10 = user5.bot;
                        if (z10 && (i9 = user5.bot_active_users) != 0) {
                            charSequence = LocaleController.formatPluralStringSpaced("BotUsersShort", i9);
                        } else if (z10) {
                            charSequence = LocaleController.getString(R.string.Bot);
                        } else {
                            long j10 = user5.f22527id;
                            if (j10 == 489000) {
                                charSequence = LocaleController.getString(R.string.VerifyCodesNotifications);
                            } else if (UserObject.isService(j10)) {
                                charSequence = LocaleController.getString(R.string.ServiceNotifications);
                            } else {
                                if (this.f24445f0 == null) {
                                    this.f24445f0 = new boolean[1];
                                }
                                boolean[] zArr = this.f24445f0;
                                zArr[0] = false;
                                charSequence5 = LocaleController.formatUserStatus(i11, this.f24468y, zArr);
                                if (this.f24445f0[0]) {
                                    textPaint5 = org.telegram.ui.ActionBar.f6.P0;
                                }
                                TLRPC.User user6 = this.f24468y;
                                if (user6 != null && (user6.f22527id == UserConfig.getInstance(i11).getClientUserId() || ((userStatus = this.f24468y.status) != null && userStatus.expires > ConnectionsManager.getInstance(i11).getCurrentTime()))) {
                                    textPaint5 = org.telegram.ui.ActionBar.f6.P0;
                                    charSequence = LocaleController.getString(R.string.Online);
                                }
                            }
                        }
                    }
                } else {
                    charSequence = null;
                }
                if (!this.H || UserObject.isReplyUser(this.f24468y)) {
                    this.L = AndroidUtilities.dp(20.0f);
                    charSequence = null;
                }
            }
            charSequence = charSequence5;
            if (!this.H) {
            }
            this.L = AndroidUtilities.dp(20.0f);
            charSequence = null;
        }
        if (this.A0) {
            if (this.C0 == null) {
                this.C0 = new TextPaint(1);
            }
            TextPaint textPaint6 = this.C0;
            if (this.I0) {
                f14 = 13.0f;
            } else {
                f14 = 15.0f;
            }
            textPaint6.setTextSize(AndroidUtilities.dp(f14));
            if (textPaint5 == org.telegram.ui.ActionBar.f6.Q0) {
                this.C0.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.A6, b6Var));
            } else if (textPaint5 == org.telegram.ui.ActionBar.f6.P0) {
                this.C0.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.p6, b6Var));
            }
            textPaint5 = this.C0;
        }
        if (!TextUtils.isEmpty(charSequence)) {
            i10 = i12;
            this.f24453n0 = new StaticLayout(TextUtils.ellipsize(charSequence, textPaint5, i12 - AndroidUtilities.dp(f11), truncateAt), textPaint5, i12, alignment, 1.0f, 0.0f, false);
            this.L = AndroidUtilities.dp(9.0f);
            this.P -= AndroidUtilities.dp(10.0f);
        } else {
            i10 = i12;
            this.L = AndroidUtilities.dp(20.0f);
            this.f24453n0 = null;
        }
        if (LocaleController.isRTL) {
            dp = (getMeasuredWidth() - AndroidUtilities.dp(57.0f)) - getPaddingRight();
        } else {
            if (this.I0) {
                f16 = 14.0f;
            } else if (this.J0) {
                f16 = 15.0f;
            }
            dp = AndroidUtilities.dp(f16) + getPaddingLeft();
        }
        RectF rectF = this.f24456q0.F;
        float f18 = dp;
        if (this.I0) {
            f12 = 6.0f;
        } else {
            f12 = 7.0f;
        }
        float dp4 = AndroidUtilities.dp(f12);
        float f19 = 46.0f;
        if (this.I0) {
            f13 = 44.0f;
        } else if (this.J0) {
            f13 = 42.0f;
        } else {
            f13 = 46.0f;
        }
        float dp5 = AndroidUtilities.dp(f13) + dp;
        if (!this.I0) {
            f17 = 7.0f;
        }
        int dp6 = AndroidUtilities.dp(f17);
        if (this.I0) {
            f19 = 44.0f;
        }
        rectF.set(f18, dp4, dp5, AndroidUtilities.dp(f19) + dp6);
        if (LocaleController.isRTL) {
            if (this.M.getLineCount() > 0 && this.M.getLineLeft(0) == f10) {
                double ceil = Math.ceil(this.M.getLineWidth(0));
                double d9 = this.Q;
                if (ceil < d9) {
                    this.K = (int) ((d9 - ceil) + this.K);
                }
            }
            StaticLayout staticLayout = this.f24453n0;
            if (staticLayout != null && staticLayout.getLineCount() > 0 && this.f24453n0.getLineLeft(0) == f10) {
                double ceil2 = Math.ceil(this.f24453n0.getLineWidth(0));
                double d10 = i10;
                if (ceil2 < d10) {
                    this.m0 = (int) ((d10 - ceil2) + this.m0);
                }
            }
        } else {
            if (this.M.getLineCount() > 0 && this.M.getLineRight(0) == this.Q) {
                double ceil3 = Math.ceil(this.M.getLineWidth(0));
                double d11 = this.Q;
                if (ceil3 < d11) {
                    this.K = (int) (this.K - (d11 - ceil3));
                }
            }
            StaticLayout staticLayout2 = this.f24453n0;
            if (staticLayout2 != null && staticLayout2.getLineCount() > 0 && this.f24453n0.getLineRight(0) == i10) {
                double ceil4 = Math.ceil(this.f24453n0.getLineWidth(0));
                double d12 = i10;
                if (ceil4 < d12) {
                    this.m0 = (int) (this.m0 - (d12 - ceil4));
                }
            }
        }
        this.K = getPaddingLeft() + this.K;
        this.m0 = getPaddingLeft() + this.m0;
        this.O = getPaddingLeft() + this.O;
        if (this.I0) {
            this.K = AndroidUtilities.dp(1.0f) + this.K;
            this.L = AndroidUtilities.dp(1.0f) + this.L;
        }
    }

    public final void s(boolean z10, boolean z11) {
        dp dpVar = this.f24465w0;
        if (dpVar == null) {
            return;
        }
        dpVar.a(z10, z11);
    }

    public void setAd(TLRPC.TL_sponsoredPeer tL_sponsoredPeer) {
        this.f24466x = tL_sponsoredPeer;
    }

    public void setAllowEmojiStatus(boolean z10) {
        this.D0 = z10;
    }

    public void setOnSponsoredOptionsClick(Utilities.Callback2<h6, TLRPC.TL_sponsoredPeer> callback2) {
        this.f24470z0 = callback2;
    }

    public void setOpenBotButton(boolean z10) {
        int i9;
        int i10;
        if (this.f24451l0 == z10) {
            return;
        }
        if (this.H0 == null) {
            this.H0 = new nz0(LocaleController.getString(R.string.BotOpen), 14.0f, AndroidUtilities.bold());
        }
        if (z10) {
            i9 = AndroidUtilities.dp(30.0f) + ((int) this.H0.f31223c);
        } else {
            i9 = 0;
        }
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i10 = i9;
        } else {
            i10 = 0;
        }
        if (z11) {
            i9 = 0;
        }
        setPadding(i10, 0, i9, 0);
        this.f24451l0 = z10;
        this.E0.c(false);
    }

    public void setRectangularAvatar(boolean z10) {
        this.J0 = z10;
    }

    public void setSubLabel(CharSequence charSequence) {
        this.v = charSequence;
        u(0);
    }

    public final void t(Object obj, TLRPC.EncryptedChat encryptedChat, CharSequence charSequence, CharSequence charSequence2, boolean z10, boolean z11) {
        boolean z12;
        this.f24452n = charSequence;
        boolean z13 = obj instanceof TLRPC.User;
        int i9 = this.J;
        TL_account.RequirementToContact requirementToContact = null;
        if (z13) {
            this.f24468y = (TLRPC.User) obj;
            this.A = null;
            this.C = null;
            if (this.f24447h0) {
                requirementToContact = MessagesController.getInstance(i9).isUserContactBlocked(this.f24468y.f22527id);
            }
            this.f24449j0 = DialogObject.isPremiumBlocked(requirementToContact);
            this.f24450k0 = DialogObject.getMessagesStarsPrice(requirementToContact);
            if (this.f24467x0 && this.f24468y.bot_has_main_app) {
                z12 = true;
            } else {
                z12 = false;
            }
            setOpenBotButton(z12);
        } else if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            this.A = chat;
            this.f24468y = null;
            this.C = null;
            TL_account.RequirementToContact requirementToContact2 = ChatObject.getRequirementToContact(chat);
            this.f24449j0 = DialogObject.isPremiumBlocked(requirementToContact2);
            this.f24450k0 = DialogObject.getMessagesStarsPrice(requirementToContact2);
            setOpenBotButton(false);
        } else if (obj instanceof ContactsController.Contact) {
            ContactsController.Contact contact = (ContactsController.Contact) obj;
            this.C = contact;
            this.A = null;
            this.f24468y = null;
            if (this.f24447h0 && contact.user != null) {
                requirementToContact = MessagesController.getInstance(i9).isUserContactBlocked(this.C.user.f22527id);
            }
            this.f24449j0 = DialogObject.isPremiumBlocked(requirementToContact);
            this.f24450k0 = DialogObject.getMessagesStarsPrice(requirementToContact);
            setOpenBotButton(false);
        } else {
            setOpenBotButton(false);
        }
        this.B = encryptedChat;
        this.v = charSequence2;
        this.W = z10;
        this.H = z11;
        u(0);
    }

    public final void u(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.h6.u(int):void");
    }

    public final void v(boolean z10, TLRPC.User user, TLRPC.Chat chat, boolean z11) {
        long j10;
        boolean z12 = LocaleController.isRTL;
        org.telegram.ui.Components.i5 i5Var = this.f24455p0;
        i5Var.f29315a = z12;
        boolean z13 = this.D0;
        org.telegram.ui.ActionBar.b6 b6Var = this.f24464w;
        if (z13 && z10) {
            i5Var.g(new fq(org.telegram.ui.ActionBar.f6.f23032f1, org.telegram.ui.ActionBar.f6.f23087i1, 0, 0), z11);
            i5Var.k(null);
        } else if (z13 && user != null && !this.H && DialogObject.getEmojiStatusDocumentId(user.emoji_status) != 0) {
            i5Var.j(DialogObject.getEmojiStatusDocumentId(user.emoji_status), z11);
            i5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23389z9, b6Var)));
        } else if (this.D0 && chat != null && !this.H && DialogObject.getEmojiStatusDocumentId(chat.emoji_status) != 0) {
            i5Var.j(DialogObject.getEmojiStatusDocumentId(chat.emoji_status), z11);
            i5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23389z9, b6Var)));
        } else if (this.D0 && user != null && !this.H && MessagesController.getInstance(this.J).isPremiumUser(user)) {
            i5Var.g(zf.a1.d().f50459e, z11);
            i5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23389z9, b6Var)));
        } else {
            i5Var.g(null, z11);
            i5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23389z9, b6Var)));
        }
        if (user != null) {
            j10 = DialogObject.getBotVerificationIcon(user);
        } else if (chat != null) {
            j10 = DialogObject.getBotVerificationIcon(chat);
        } else {
            j10 = 0;
        }
        org.telegram.ui.Components.i5 i5Var2 = this.f24454o0;
        if (j10 != 0 && !this.H) {
            i5Var2.j(j10, z11);
        } else {
            i5Var2.g(null, z11);
        }
        i5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23389z9, b6Var)));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f24455p0 != drawable && this.f24454o0 != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
