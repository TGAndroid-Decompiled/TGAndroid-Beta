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
import java.util.HashSet;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.tl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.dd;
import org.telegram.ui.Components.h11;
import org.telegram.ui.Components.mf0;
import org.telegram.ui.Components.vp;
import org.telegram.ui.Components.vq;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.zr;
import org.telegram.ui.p00;
public final class i6 extends z implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.b6 {
    public final vp A0;
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
    public final wc I0;
    public int J;
    public final Paint J0;
    public TLRPC.FileLocation K;
    public final RectF K0;
    public boolean L;
    public h11 L0;
    public boolean M;
    public boolean M0;
    public final int N;
    public boolean N0;
    public int O;
    public sg.a1 O0;
    public int P;
    public Drawable P0;
    public StaticLayout Q;
    public int Q0;
    public boolean R;
    public int S;
    public int T;
    public int U;
    public dd V;
    public StaticLayout W;
    public int f22508a0;
    public int f22509b0;
    public int f22510c0;
    public boolean f22511d0;
    public int f22512e0;
    public boolean f22513f;
    public final int f22514f0;
    public int f22515g0;
    public mf0 h;
    public int f22516h0;
    public StaticLayout f22517i0;
    public boolean[] f22518j0;
    public boolean f22519k0;
    public boolean f22520l0;
    public final org.telegram.ui.Components.d6 m0;
    public CharSequence f22521n;
    public boolean f22522n0;
    public long f22523o0;
    public boolean f22524p0;
    public int f22525q0;
    public final ImageReceiver f22526r;
    public StaticLayout f22527r0;
    public final org.telegram.ui.Components.f9 f22528s;
    public final org.telegram.ui.Components.n5 f22529s0;
    public final org.telegram.ui.Components.n5 f22530t0;
    public final ci.x7 f22531u0;
    public CharSequence v;
    public final RectF f22532v0;
    public final org.telegram.ui.ActionBar.g6 f22533w;
    public h11 f22534w0;
    public TLRPC.TL_sponsoredPeer f22535x;
    public Paint f22536x0;
    public TLRPC.User f22537y;
    public final wc f22538y0;
    public final RectF f22539z0;

    public i6(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.N = UserConfig.selectedAccount;
        this.f22514f0 = AndroidUtilities.dp(19.0f);
        this.m0 = new org.telegram.ui.Components.d6(this, 0L, 350L, zr.h);
        zr zrVar = zr.f33337f;
        this.f22531u0 = new ci.x7(null, false);
        this.f22532v0 = new RectF();
        this.f22538y0 = new wc(this);
        this.f22539z0 = new RectF();
        this.H0 = true;
        this.I0 = new wc(this);
        this.J0 = new Paint(1);
        this.K0 = new RectF();
        this.Q0 = org.telegram.ui.ActionBar.r6.f21818b;
        this.f22533w = g6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f22526r = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(23.0f));
        this.f22528s = new org.telegram.ui.Components.f9((org.telegram.ui.ActionBar.g6) null);
        vp vpVar = new vp(context, 21, g6Var);
        this.A0 = vpVar;
        vpVar.b(-1, org.telegram.ui.ActionBar.k6.f21184d6, org.telegram.ui.ActionBar.k6.f21312k7);
        vpVar.setDrawUnchecked(false);
        vpVar.setDrawBackgroundAsArc(3);
        addView(vpVar);
        org.telegram.ui.Components.n5 n5Var = new org.telegram.ui.Components.n5(AndroidUtilities.dp(20.0f), this);
        this.f22529s0 = n5Var;
        n5Var.setCallback(this);
        org.telegram.ui.Components.n5 n5Var2 = new org.telegram.ui.Components.n5(AndroidUtilities.dp(20.0f), this);
        this.f22530t0 = n5Var2;
        n5Var2.setCallback(this);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21592z9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21572y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21404p6));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            invalidate();
        } else if (i10 == NotificationCenter.userIsPremiumBlockedUpadted) {
            TLRPC.User user = this.f22537y;
            TL_account.RequirementToContact requirementToContact = null;
            int i12 = this.N;
            if (user != null) {
                if (this.f22520l0) {
                    requirementToContact = MessagesController.getInstance(i12).isUserContactBlocked(this.f22537y.f20491id);
                }
            } else {
                TLRPC.Chat chat = this.E;
                if (chat != null) {
                    requirementToContact = ChatObject.getRequirementToContact(chat);
                } else {
                    ContactsController.Contact contact = this.G;
                    if (contact != null) {
                        if (this.f22520l0 && contact.user != null) {
                            requirementToContact = MessagesController.getInstance(i12).isUserContactBlocked(this.G.user.f20491id);
                        }
                    } else {
                        return;
                    }
                }
            }
            if (this.f22522n0 != DialogObject.isPremiumBlocked(requirementToContact) || this.f22523o0 != DialogObject.getMessagesStarsPrice(requirementToContact)) {
                this.f22522n0 = DialogObject.isPremiumBlocked(requirementToContact);
                this.f22523o0 = DialogObject.getMessagesStarsPrice(requirementToContact);
                invalidate();
            }
        }
    }

    public TLRPC.Chat getChat() {
        return this.E;
    }

    public long getDialogId() {
        return this.H;
    }

    public TLRPC.User getUser() {
        return this.f22537y;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f22526r.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        if (this.f22520l0) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
        }
        this.f22530t0.a();
        this.f22529s0.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f22526r.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        if (this.f22520l0) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
        }
        this.f22530t0.b();
        this.f22529s0.b();
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
        if (this.f22519k0) {
            sb2.append(", ");
            b1.o(R.string.AccDescrVerified, "\n", sb2);
        }
        if (this.f22527r0 != null) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(this.f22527r0.getText());
        }
        accessibilityNodeInfo.setText(sb2.toString());
        vp vpVar = this.A0;
        if (vpVar.f32005a.f24297q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(vpVar.f32005a.f24297q);
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
        if (this.f22537y != null || this.E != null || this.F != null || this.G != null) {
            vp vpVar = this.A0;
            if (vpVar != null) {
                if (LocaleController.isRTL) {
                    dp = (i12 - i10) - AndroidUtilities.dp(42.0f);
                } else {
                    dp = AndroidUtilities.dp(42.0f);
                }
                int dp2 = AndroidUtilities.dp(36.0f);
                vpVar.layout(dp, dp2, vpVar.getMeasuredWidth() + dp, vpVar.getMeasuredHeight() + dp2);
            }
            if (z10) {
                r();
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int dp;
        vp vpVar = this.A0;
        if (vpVar != null) {
            vpVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824));
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
        this.f22519k0 = false;
        TLRPC.EncryptedChat encryptedChat = this.F;
        float f15 = 11.0f;
        int i12 = this.N;
        if (encryptedChat != null) {
            this.R = true;
            this.H = DialogObject.makeEncryptedDialogId(encryptedChat.f20352id);
            if (!LocaleController.isRTL) {
                this.S = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                this.O = org.telegram.ui.ActionBar.k6.f21121a1.getIntrinsicWidth() + AndroidUtilities.dp(AndroidUtilities.leftBaseline + 4);
            } else {
                this.S = (getMeasuredWidth() - AndroidUtilities.dp(AndroidUtilities.leftBaseline + 2)) - org.telegram.ui.ActionBar.k6.f21121a1.getIntrinsicWidth();
                this.O = AndroidUtilities.dp(11.0f);
            }
            this.T = AndroidUtilities.dp(22.0f);
            v(false, null, null, false);
        } else {
            TLRPC.Chat chat2 = this.E;
            if (chat2 != null) {
                this.H = -chat2.f20344id;
                this.f22519k0 = chat2.verified;
                if (chat2.monoforum && (chat = MessagesController.getInstance(i12).getChat(Long.valueOf(this.E.linked_monoforum_id))) != null) {
                    this.f22519k0 = chat.verified;
                }
                if (!LocaleController.isRTL) {
                    this.O = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                } else {
                    this.O = AndroidUtilities.dp(11.0f);
                }
                v(this.f22519k0, null, this.E, false);
            } else {
                TLRPC.User user = this.f22537y;
                if (user != null) {
                    this.H = user.f20491id;
                    if (!LocaleController.isRTL) {
                        this.O = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                    } else {
                        this.O = AndroidUtilities.dp(11.0f);
                    }
                    this.T = AndroidUtilities.dp(21.0f);
                    this.f22519k0 = this.f22537y.verified;
                    if (!this.L) {
                        MessagesController.getInstance(i12).isPremiumUser(this.f22537y);
                    }
                    v(this.f22519k0, this.f22537y, null, false);
                } else if (this.G != null) {
                    this.H = 0L;
                    if (!LocaleController.isRTL) {
                        this.O = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                    } else {
                        this.O = AndroidUtilities.dp(11.0f);
                    }
                    if (this.V == null) {
                        dd ddVar = new dd(this);
                        this.V = ddVar;
                        ddVar.h = new g(this, 5);
                    }
                }
            }
        }
        if (!LocaleController.isRTL) {
            this.f22525q0 = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
        } else {
            this.f22525q0 = AndroidUtilities.dp(11.0f);
        }
        if (this.f22535x != null) {
            if (this.f22534w0 == null) {
                SpannableStringBuilder append = new SpannableStringBuilder(LocaleController.getString(R.string.SearchAd)).append((CharSequence) " i");
                vq vqVar = new vq(R.drawable.ic_ab_other, 0);
                vqVar.setScale(0.55f, 0.55f);
                vqVar.spaceScaleX = 0.7f;
                vqVar.translate(-AndroidUtilities.dp(2.0f), 0.0f);
                append.setSpan(vqVar, append.length() - 1, append.length(), 33);
                this.f22534w0 = new h11(append, 12.0f, null);
            }
            if (this.f22536x0 == null) {
                this.f22536x0 = new Paint(1);
            }
        }
        CharSequence charSequence2 = this.f22521n;
        CharSequence charSequence3 = charSequence2;
        if (charSequence2 == null) {
            charSequence3 = null;
        }
        TLRPC.Chat chat3 = this.E;
        org.telegram.ui.ActionBar.g6 g6Var = this.f22533w;
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
                    spannableStringBuilder2.setSpan(new p00(LocaleController.getString(R.string.MonoforumSpan), org.telegram.ui.ActionBar.k6.f21572y6, g6Var), length, spannableStringBuilder2.length(), 33);
                    spannableStringBuilder = spannableStringBuilder2;
                } else if (charSequence3 == null) {
                    spannableStringBuilder = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(this.E.title));
                }
            } else if (charSequence3 == null) {
                spannableStringBuilder = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(chat3.title));
            }
        } else if (charSequence3 == null) {
            TLRPC.User user2 = this.f22537y;
            spannableStringBuilder = charSequence3;
            if (user2 != null) {
                spannableStringBuilder = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(UserObject.getUserName(user2)));
            }
        }
        CharSequence replaceNewLines = AndroidUtilities.replaceNewLines(spannableStringBuilder);
        if (TextUtils.isEmpty(replaceNewLines)) {
            TLRPC.User user3 = this.f22537y;
            if (user3 != null && !TextUtils.isEmpty(user3.phone)) {
                replaceNewLines = tl.h(new StringBuilder("+"), this.f22537y.phone, jf.b.c());
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
                this.F0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Z8, g6Var));
            } else {
                this.F0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.X8, g6Var));
            }
            textPaint = this.F0;
        } else if (this.F != null) {
            textPaint = org.telegram.ui.ActionBar.k6.E0;
        } else {
            textPaint = org.telegram.ui.ActionBar.k6.D0;
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
            this.U -= org.telegram.ui.ActionBar.k6.f21121a1.getIntrinsicWidth() + AndroidUtilities.dp(6.0f);
        }
        if (this.f22535x != null) {
            int dp2 = AndroidUtilities.dp(20.66f) + ((int) this.f22534w0.f26843c);
            this.U -= dp2;
            if (LocaleController.isRTL) {
                this.O += dp2;
            }
        }
        if (this.G != null) {
            int measureText = (int) (org.telegram.ui.ActionBar.k6.L0.measureText(LocaleController.getString(R.string.Invite)) + 1.0f);
            this.W = new StaticLayout(LocaleController.getString(R.string.Invite), org.telegram.ui.ActionBar.k6.L0, measureText, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            if (!LocaleController.isRTL) {
                this.f22508a0 = ((getMeasuredWidth() - measureText) - AndroidUtilities.dp(19.0f)) - AndroidUtilities.dp(16.0f);
            } else {
                this.f22508a0 = AndroidUtilities.dp(16.0f) + AndroidUtilities.dp(19.0f);
                this.O += measureText;
                this.f22525q0 += measureText;
            }
            this.U = tl.y(32.0f, measureText, this.U);
        }
        this.U -= getPaddingRight() + getPaddingLeft();
        int paddingRight = measuredWidth - (getPaddingRight() + getPaddingLeft());
        if (this.f22511d0) {
            int dialogUnreadCount = MessagesController.getInstance(i12).getDialogUnreadCount((TLRPC.Dialog) MessagesController.getInstance(i12).dialogs_dict.f(this.H));
            if (dialogUnreadCount != 0) {
                this.f22512e0 = dialogUnreadCount;
                Locale locale = Locale.US;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(dialogUnreadCount);
                String sb3 = sb2.toString();
                f7 = 0.0f;
                f10 = 12.0f;
                this.f22516h0 = Math.max(AndroidUtilities.dp(12.0f), (int) Math.ceil(org.telegram.ui.ActionBar.k6.L0.measureText(sb3)));
                this.f22517i0 = new StaticLayout(sb3, org.telegram.ui.ActionBar.k6.L0, this.f22516h0, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                int dp3 = AndroidUtilities.dp(18.0f) + this.f22516h0;
                this.U -= dp3;
                paddingRight -= dp3;
                if (!LocaleController.isRTL) {
                    this.f22515g0 = (getMeasuredWidth() - this.f22516h0) - AndroidUtilities.dp(19.0f);
                } else {
                    this.f22515g0 = AndroidUtilities.dp(19.0f);
                    this.O += dp3;
                    this.f22525q0 += dp3;
                }
            } else {
                f7 = 0.0f;
                f10 = 12.0f;
                this.f22512e0 = 0;
                this.f22517i0 = null;
            }
        } else {
            f7 = 0.0f;
            f10 = 12.0f;
            this.f22512e0 = 0;
            this.f22517i0 = null;
        }
        int i13 = paddingRight;
        org.telegram.ui.Components.n5 n5Var = this.f22529s0;
        boolean d = n5Var.d();
        int i14 = n5Var.f28785s;
        if (!d) {
            if (LocaleController.isRTL) {
                this.U -= i14;
            } else {
                this.O += i14;
            }
        }
        org.telegram.ui.Components.n5 n5Var2 = this.f22530t0;
        if (!n5Var2.d() && !LocaleController.isRTL) {
            this.U -= n5Var2.f28785s;
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
        TextPaint textPaint5 = org.telegram.ui.ActionBar.k6.Q0;
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
                TLRPC.User user4 = this.f22537y;
                if (user4 != null) {
                    if (MessagesController.isSupportUser(user4)) {
                        charSequence = LocaleController.getString(R.string.SupportStatus);
                    } else {
                        TLRPC.User user5 = this.f22537y;
                        boolean z10 = user5.bot;
                        if (z10 && (i10 = user5.bot_active_users) != 0) {
                            charSequence = LocaleController.formatPluralStringSpaced("BotUsersShort", i10);
                        } else if (z10) {
                            charSequence = LocaleController.getString(R.string.Bot);
                        } else {
                            long j10 = user5.f20491id;
                            if (j10 == 489000) {
                                charSequence = LocaleController.getString(R.string.VerifyCodesNotifications);
                            } else if (UserObject.isService(j10)) {
                                charSequence = LocaleController.getString(R.string.ServiceNotifications);
                            } else {
                                if (this.f22518j0 == null) {
                                    this.f22518j0 = new boolean[1];
                                }
                                boolean[] zArr = this.f22518j0;
                                zArr[0] = false;
                                charSequence5 = LocaleController.formatUserStatus(i12, this.f22537y, zArr);
                                if (this.f22518j0[0]) {
                                    textPaint5 = org.telegram.ui.ActionBar.k6.P0;
                                }
                                TLRPC.User user6 = this.f22537y;
                                if (user6 != null && (user6.f20491id == UserConfig.getInstance(i12).getClientUserId() || ((userStatus = this.f22537y.status) != null && userStatus.expires > ConnectionsManager.getInstance(i12).getCurrentTime()))) {
                                    textPaint5 = org.telegram.ui.ActionBar.k6.P0;
                                    charSequence = LocaleController.getString(R.string.Online);
                                }
                            }
                        }
                    }
                } else {
                    charSequence = null;
                }
                if (!this.L || UserObject.isReplyUser(this.f22537y)) {
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
            if (textPaint5 == org.telegram.ui.ActionBar.k6.Q0) {
                this.G0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.A6, g6Var));
            } else if (textPaint5 == org.telegram.ui.ActionBar.k6.P0) {
                this.G0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21404p6, g6Var));
            }
            textPaint5 = this.G0;
        }
        if (!TextUtils.isEmpty(charSequence)) {
            i11 = i13;
            this.f22527r0 = new StaticLayout(TextUtils.ellipsize(charSequence, textPaint5, i13 - AndroidUtilities.dp(f10), truncateAt), textPaint5, i13, alignment, 1.0f, 0.0f, false);
            this.P = AndroidUtilities.dp(9.0f);
            this.T -= AndroidUtilities.dp(10.0f);
        } else {
            i11 = i13;
            this.P = AndroidUtilities.dp(20.0f);
            this.f22527r0 = null;
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
        RectF rectF = this.f22531u0.F;
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
            StaticLayout staticLayout = this.f22527r0;
            if (staticLayout != null && staticLayout.getLineCount() > 0 && this.f22527r0.getLineLeft(0) == f7) {
                double ceil2 = Math.ceil(this.f22527r0.getLineWidth(0));
                double d11 = i11;
                if (ceil2 < d11) {
                    this.f22525q0 = (int) ((d11 - ceil2) + this.f22525q0);
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
            StaticLayout staticLayout2 = this.f22527r0;
            if (staticLayout2 != null && staticLayout2.getLineCount() > 0 && this.f22527r0.getLineRight(0) == i11) {
                double ceil4 = Math.ceil(this.f22527r0.getLineWidth(0));
                double d13 = i11;
                if (ceil4 < d13) {
                    this.f22525q0 = (int) (this.f22525q0 - (d13 - ceil4));
                }
            }
        }
        this.O = getPaddingLeft() + this.O;
        this.f22525q0 = getPaddingLeft() + this.f22525q0;
        this.S = getPaddingLeft() + this.S;
        if (this.M0) {
            this.O = AndroidUtilities.dp(1.0f) + this.O;
            this.P = AndroidUtilities.dp(1.0f) + this.P;
        }
    }

    public final void s(boolean z10, boolean z11) {
        vp vpVar = this.A0;
        if (vpVar == null) {
            return;
        }
        vpVar.a(z10, z11);
    }

    public void setAd(TLRPC.TL_sponsoredPeer tL_sponsoredPeer) {
        this.f22535x = tL_sponsoredPeer;
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
        if (this.f22524p0 == z10) {
            return;
        }
        if (this.L0 == null) {
            this.L0 = new h11(LocaleController.getString(R.string.BotOpen), 14.0f, AndroidUtilities.bold());
        }
        if (z10) {
            i10 = AndroidUtilities.dp(30.0f) + ((int) this.L0.f26843c);
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
        this.f22524p0 = z10;
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
        this.f22521n = charSequence;
        boolean z13 = obj instanceof TLRPC.User;
        int i10 = this.N;
        TL_account.RequirementToContact requirementToContact = null;
        if (z13) {
            this.f22537y = (TLRPC.User) obj;
            this.E = null;
            this.G = null;
            if (this.f22520l0) {
                requirementToContact = MessagesController.getInstance(i10).isUserContactBlocked(this.f22537y.f20491id);
            }
            this.f22522n0 = DialogObject.isPremiumBlocked(requirementToContact);
            this.f22523o0 = DialogObject.getMessagesStarsPrice(requirementToContact);
            if (this.B0 && this.f22537y.bot_has_main_app) {
                z12 = true;
            } else {
                z12 = false;
            }
            setOpenBotButton(z12);
        } else if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            this.E = chat;
            this.f22537y = null;
            this.G = null;
            TL_account.RequirementToContact requirementToContact2 = ChatObject.getRequirementToContact(chat);
            this.f22522n0 = DialogObject.isPremiumBlocked(requirementToContact2);
            this.f22523o0 = DialogObject.getMessagesStarsPrice(requirementToContact2);
            setOpenBotButton(false);
        } else if (obj instanceof ContactsController.Contact) {
            ContactsController.Contact contact = (ContactsController.Contact) obj;
            this.G = contact;
            this.E = null;
            this.f22537y = null;
            if (this.f22520l0 && contact.user != null) {
                requirementToContact = MessagesController.getInstance(i10).isUserContactBlocked(this.G.user.f20491id);
            }
            this.f22522n0 = DialogObject.isPremiumBlocked(requirementToContact);
            this.f22523o0 = DialogObject.getMessagesStarsPrice(requirementToContact);
            setOpenBotButton(false);
        } else {
            setOpenBotButton(false);
        }
        this.F = encryptedChat;
        this.v = charSequence2;
        this.f22511d0 = z10;
        this.L = z11;
        u(0);
    }

    public final void u(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.i6.u(int):void");
    }

    @Override
    public final void updateColors() {
        int i10 = this.Q0;
        int i11 = org.telegram.ui.ActionBar.r6.f21818b;
        if (i10 != i11) {
            this.Q0 = i11;
            try {
                u(0);
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else if (this.Q != null && getMeasuredWidth() > 0) {
            r();
        }
    }

    public final void v(boolean z10, TLRPC.User user, TLRPC.Chat chat, boolean z11) {
        long j10;
        boolean z12 = LocaleController.isRTL;
        org.telegram.ui.Components.n5 n5Var = this.f22530t0;
        n5Var.f28779a = z12;
        boolean z13 = this.H0;
        org.telegram.ui.ActionBar.g6 g6Var = this.f22533w;
        if (z13 && z10) {
            n5Var.g(new wq(org.telegram.ui.ActionBar.k6.f21215f1, org.telegram.ui.ActionBar.k6.f21268i1, 0, 0), z11);
            n5Var.k(null);
        } else if (z13 && user != null && !this.L && DialogObject.getEmojiStatusDocumentId(user.emoji_status) != 0) {
            n5Var.j(DialogObject.getEmojiStatusDocumentId(user.emoji_status), z11);
            n5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21592z9, g6Var)));
        } else if (this.H0 && chat != null && !this.L && DialogObject.getEmojiStatusDocumentId(chat.emoji_status) != 0) {
            n5Var.j(DialogObject.getEmojiStatusDocumentId(chat.emoji_status), z11);
            n5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21592z9, g6Var)));
        } else if (this.H0 && user != null && !this.L && MessagesController.getInstance(this.N).isPremiumUser(user)) {
            n5Var.g(sg.b1.d().e, z11);
            n5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21592z9, g6Var)));
        } else {
            n5Var.g(null, z11);
            n5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21592z9, g6Var)));
        }
        if (user != null) {
            j10 = DialogObject.getBotVerificationIcon(user);
        } else if (chat != null) {
            j10 = DialogObject.getBotVerificationIcon(chat);
        } else {
            j10 = 0;
        }
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        org.telegram.ui.Components.n5 n5Var2 = this.f22529s0;
        if (i10 != 0 && !this.L) {
            n5Var2.j(j10, z11);
        } else {
            n5Var2.g(null, z11);
        }
        n5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21592z9, g6Var)));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f22530t0 != drawable && this.f22529s0 != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
