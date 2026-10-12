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
import org.telegram.messenger.yh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.aq;
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.cr;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.h11;
import org.telegram.ui.Components.hd;
import org.telegram.ui.Components.pf0;
import org.telegram.ui.k10;
public final class i6 extends a0 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.x5 {
    public final aq A0;
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
    public final ad I0;
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
    public boolean R;
    public int S;
    public int T;
    public int U;
    public hd V;
    public StaticLayout W;
    public int f21315a0;
    public int f21316b0;
    public int f21317c0;
    public boolean f21318d0;
    public int f21319e0;
    public boolean f21320f;
    public final int f21321f0;
    public int f21322g0;
    public pf0 h;
    public int f21323h0;
    public StaticLayout f21324i0;
    public boolean[] f21325j0;
    public boolean f21326k0;
    public boolean f21327l0;
    public final org.telegram.ui.Components.g6 m0;
    public CharSequence f21328n;
    public boolean f21329n0;
    public long f21330o0;
    public boolean f21331p0;
    public int f21332q0;
    public final ImageReceiver f21333r;
    public StaticLayout f21334r0;
    public final org.telegram.ui.Components.k9 f21335s;
    public final org.telegram.ui.Components.q5 f21336s0;
    public final org.telegram.ui.Components.q5 f21337t0;
    public final bi.m9 f21338u0;
    public CharSequence v;
    public final RectF f21339v0;
    public final org.telegram.ui.ActionBar.c6 f21340w;
    public h11 f21341w0;
    public TLRPC.TL_sponsoredPeer f21342x;
    public Paint f21343x0;
    public TLRPC.User f21344y;
    public final ad f21345y0;
    public final RectF f21346z0;

    public i6(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.N = UserConfig.selectedAccount;
        this.f21321f0 = AndroidUtilities.dp(19.0f);
        this.m0 = new org.telegram.ui.Components.g6(this, 0L, 350L, es.h);
        es esVar = es.f24771f;
        this.f21338u0 = new bi.m9(null, false);
        this.f21339v0 = new RectF();
        this.f21345y0 = new ad(this);
        this.f21346z0 = new RectF();
        this.H0 = true;
        this.I0 = new ad(this);
        this.J0 = new Paint(1);
        this.K0 = new RectF();
        this.f21340w = c6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f21333r = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(23.0f));
        this.f21335s = new org.telegram.ui.Components.k9((org.telegram.ui.ActionBar.c6) null);
        aq aqVar = new aq(context, 21, c6Var);
        this.A0 = aqVar;
        aqVar.b(-1, org.telegram.ui.ActionBar.g6.f19901d6, org.telegram.ui.ActionBar.g6.f20029k7);
        aqVar.setDrawUnchecked(false);
        aqVar.setDrawBackgroundAsArc(3);
        addView(aqVar);
        org.telegram.ui.Components.q5 q5Var = new org.telegram.ui.Components.q5(AndroidUtilities.dp(20.0f), this);
        this.f21336s0 = q5Var;
        q5Var.setCallback(this);
        org.telegram.ui.Components.q5 q5Var2 = new org.telegram.ui.Components.q5(AndroidUtilities.dp(20.0f), this);
        this.f21337t0 = q5Var2;
        q5Var2.setCallback(this);
    }

    @Override
    public final void d() {
        if (this.Q != null && getMeasuredWidth() > 0) {
            s();
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            invalidate();
        } else if (i10 == NotificationCenter.userIsPremiumBlockedUpadted) {
            TLRPC.User user = this.f21344y;
            TL_account.RequirementToContact requirementToContact = null;
            int i12 = this.N;
            if (user != null) {
                if (this.f21327l0) {
                    requirementToContact = MessagesController.getInstance(i12).isUserContactBlocked(this.f21344y.f19363id);
                }
            } else {
                TLRPC.Chat chat = this.E;
                if (chat != null) {
                    requirementToContact = ChatObject.getRequirementToContact(chat);
                } else {
                    ContactsController.Contact contact = this.G;
                    if (contact != null) {
                        if (this.f21327l0 && contact.user != null) {
                            requirementToContact = MessagesController.getInstance(i12).isUserContactBlocked(this.G.user.f19363id);
                        }
                    } else {
                        return;
                    }
                }
            }
            if (this.f21329n0 != DialogObject.isPremiumBlocked(requirementToContact) || this.f21330o0 != DialogObject.getMessagesStarsPrice(requirementToContact)) {
                this.f21329n0 = DialogObject.isPremiumBlocked(requirementToContact);
                this.f21330o0 = DialogObject.getMessagesStarsPrice(requirementToContact);
                invalidate();
            }
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
        return this.f21344y;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f21333r.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        if (this.f21327l0) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
        }
        this.f21337t0.a();
        this.f21336s0.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f21333r.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        if (this.f21327l0) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
        }
        this.f21337t0.b();
        this.f21336s0.b();
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
        if (this.f21326k0) {
            sb2.append(", ");
            d0.n(R.string.AccDescrVerified, "\n", sb2);
        }
        if (this.f21334r0 != null) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(this.f21334r0.getText());
        }
        accessibilityNodeInfo.setText(sb2.toString());
        aq aqVar = this.A0;
        if (aqVar.f23604a.f23092q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(aqVar.f23604a.f23092q);
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
        if (this.f21344y != null || this.E != null || this.F != null || this.G != null) {
            aq aqVar = this.A0;
            if (aqVar != null) {
                if (LocaleController.isRTL) {
                    dp = (i12 - i10) - AndroidUtilities.dp(42.0f);
                } else {
                    dp = AndroidUtilities.dp(42.0f);
                }
                int dp2 = AndroidUtilities.dp(36.0f);
                aqVar.layout(dp, dp2, aqVar.getMeasuredWidth() + dp, aqVar.getMeasuredHeight() + dp2);
            }
            if (z10) {
                s();
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int dp;
        aq aqVar = this.A0;
        if (aqVar != null) {
            aqVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824));
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

    public final void s() {
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
        this.f21326k0 = false;
        TLRPC.EncryptedChat encryptedChat = this.F;
        float f15 = 11.0f;
        int i12 = this.N;
        if (encryptedChat != null) {
            this.R = true;
            this.H = DialogObject.makeEncryptedDialogId(encryptedChat.f19224id);
            if (!LocaleController.isRTL) {
                this.S = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                this.O = org.telegram.ui.ActionBar.g6.f19838a1.getIntrinsicWidth() + AndroidUtilities.dp(AndroidUtilities.leftBaseline + 4);
            } else {
                this.S = (getMeasuredWidth() - AndroidUtilities.dp(AndroidUtilities.leftBaseline + 2)) - org.telegram.ui.ActionBar.g6.f19838a1.getIntrinsicWidth();
                this.O = AndroidUtilities.dp(11.0f);
            }
            this.T = AndroidUtilities.dp(22.0f);
            w(false, null, null, false);
        } else {
            TLRPC.Chat chat2 = this.E;
            if (chat2 != null) {
                this.H = -chat2.f19216id;
                this.f21326k0 = chat2.verified;
                if (chat2.monoforum && (chat = MessagesController.getInstance(i12).getChat(Long.valueOf(this.E.linked_monoforum_id))) != null) {
                    this.f21326k0 = chat.verified;
                }
                if (!LocaleController.isRTL) {
                    this.O = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                } else {
                    this.O = AndroidUtilities.dp(11.0f);
                }
                w(this.f21326k0, null, this.E, false);
            } else {
                TLRPC.User user = this.f21344y;
                if (user != null) {
                    this.H = user.f19363id;
                    if (!LocaleController.isRTL) {
                        this.O = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                    } else {
                        this.O = AndroidUtilities.dp(11.0f);
                    }
                    this.T = AndroidUtilities.dp(21.0f);
                    this.f21326k0 = this.f21344y.verified;
                    if (!this.L) {
                        MessagesController.getInstance(i12).isPremiumUser(this.f21344y);
                    }
                    w(this.f21326k0, this.f21344y, null, false);
                } else if (this.G != null) {
                    this.H = 0L;
                    if (!LocaleController.isRTL) {
                        this.O = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                    } else {
                        this.O = AndroidUtilities.dp(11.0f);
                    }
                    if (this.V == null) {
                        hd hdVar = new hd(this);
                        this.V = hdVar;
                        hdVar.h = new g(this, 5);
                    }
                }
            }
        }
        if (!LocaleController.isRTL) {
            this.f21332q0 = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
        } else {
            this.f21332q0 = AndroidUtilities.dp(11.0f);
        }
        if (this.f21342x != null) {
            if (this.f21341w0 == null) {
                SpannableStringBuilder append = new SpannableStringBuilder(LocaleController.getString(R.string.SearchAd)).append((CharSequence) " i");
                br brVar = new br(R.drawable.ic_ab_other, 0);
                brVar.setScale(0.55f, 0.55f);
                brVar.spaceScaleX = 0.7f;
                brVar.translate(-AndroidUtilities.dp(2.0f), 0.0f);
                append.setSpan(brVar, append.length() - 1, append.length(), 33);
                this.f21341w0 = new h11(append, 12.0f, null);
            }
            if (this.f21343x0 == null) {
                this.f21343x0 = new Paint(1);
            }
        }
        CharSequence charSequence2 = this.f21328n;
        CharSequence charSequence3 = charSequence2;
        if (charSequence2 == null) {
            charSequence3 = null;
        }
        TLRPC.Chat chat3 = this.E;
        org.telegram.ui.ActionBar.c6 c6Var = this.f21340w;
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
                    spannableStringBuilder2.setSpan(new k10(LocaleController.getString(R.string.MonoforumSpan), org.telegram.ui.ActionBar.g6.f20288y6, c6Var), length, spannableStringBuilder2.length(), 33);
                    spannableStringBuilder = spannableStringBuilder2;
                } else if (charSequence3 == null) {
                    spannableStringBuilder = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(this.E.title));
                }
            } else if (charSequence3 == null) {
                spannableStringBuilder = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(chat3.title));
            }
        } else if (charSequence3 == null) {
            TLRPC.User user2 = this.f21344y;
            spannableStringBuilder = charSequence3;
            if (user2 != null) {
                spannableStringBuilder = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(UserObject.getUserName(user2)));
            }
        }
        CharSequence replaceNewLines = AndroidUtilities.replaceNewLines(spannableStringBuilder);
        if (TextUtils.isEmpty(replaceNewLines)) {
            TLRPC.User user3 = this.f21344y;
            if (user3 != null && !TextUtils.isEmpty(user3.phone)) {
                replaceNewLines = yh.g(new StringBuilder("+"), this.f21344y.phone, jf.b.c());
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
                this.F0.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Z8, c6Var));
            } else {
                this.F0.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.X8, c6Var));
            }
            textPaint = this.F0;
        } else if (this.F != null) {
            textPaint = org.telegram.ui.ActionBar.g6.E0;
        } else {
            textPaint = org.telegram.ui.ActionBar.g6.D0;
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
            this.U -= org.telegram.ui.ActionBar.g6.f19838a1.getIntrinsicWidth() + AndroidUtilities.dp(6.0f);
        }
        if (this.f21342x != null) {
            int dp2 = AndroidUtilities.dp(20.66f) + ((int) this.f21341w0.f25473c);
            this.U -= dp2;
            if (LocaleController.isRTL) {
                this.O += dp2;
            }
        }
        if (this.G != null) {
            int measureText = (int) (org.telegram.ui.ActionBar.g6.L0.measureText(LocaleController.getString(R.string.Invite)) + 1.0f);
            this.W = new StaticLayout(LocaleController.getString(R.string.Invite), org.telegram.ui.ActionBar.g6.L0, measureText, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            if (!LocaleController.isRTL) {
                this.f21315a0 = ((getMeasuredWidth() - measureText) - AndroidUtilities.dp(19.0f)) - AndroidUtilities.dp(16.0f);
            } else {
                this.f21315a0 = AndroidUtilities.dp(16.0f) + AndroidUtilities.dp(19.0f);
                this.O += measureText;
                this.f21332q0 += measureText;
            }
            this.U = yh.A(32.0f, measureText, this.U);
        }
        this.U -= getPaddingRight() + getPaddingLeft();
        int paddingRight = measuredWidth - (getPaddingRight() + getPaddingLeft());
        if (this.f21318d0) {
            int dialogUnreadCount = MessagesController.getInstance(i12).getDialogUnreadCount((TLRPC.Dialog) MessagesController.getInstance(i12).dialogs_dict.f(this.H));
            if (dialogUnreadCount != 0) {
                this.f21319e0 = dialogUnreadCount;
                Locale locale = Locale.US;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(dialogUnreadCount);
                String sb3 = sb2.toString();
                f7 = 0.0f;
                f10 = 12.0f;
                this.f21323h0 = Math.max(AndroidUtilities.dp(12.0f), (int) Math.ceil(org.telegram.ui.ActionBar.g6.L0.measureText(sb3)));
                this.f21324i0 = new StaticLayout(sb3, org.telegram.ui.ActionBar.g6.L0, this.f21323h0, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                int dp3 = AndroidUtilities.dp(18.0f) + this.f21323h0;
                this.U -= dp3;
                paddingRight -= dp3;
                if (!LocaleController.isRTL) {
                    this.f21322g0 = (getMeasuredWidth() - this.f21323h0) - AndroidUtilities.dp(19.0f);
                } else {
                    this.f21322g0 = AndroidUtilities.dp(19.0f);
                    this.O += dp3;
                    this.f21332q0 += dp3;
                }
            } else {
                f7 = 0.0f;
                f10 = 12.0f;
                this.f21319e0 = 0;
                this.f21324i0 = null;
            }
        } else {
            f7 = 0.0f;
            f10 = 12.0f;
            this.f21319e0 = 0;
            this.f21324i0 = null;
        }
        int i13 = paddingRight;
        org.telegram.ui.Components.q5 q5Var = this.f21336s0;
        boolean d = q5Var.d();
        int i14 = q5Var.f28519s;
        if (!d) {
            if (LocaleController.isRTL) {
                this.U -= i14;
            } else {
                this.O += i14;
            }
        }
        org.telegram.ui.Components.q5 q5Var2 = this.f21337t0;
        if (!q5Var2.d() && !LocaleController.isRTL) {
            this.U -= q5Var2.f28519s;
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
        TextPaint textPaint5 = org.telegram.ui.ActionBar.g6.Q0;
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
                TLRPC.User user4 = this.f21344y;
                if (user4 != null) {
                    if (MessagesController.isSupportUser(user4)) {
                        charSequence = LocaleController.getString(R.string.SupportStatus);
                    } else {
                        TLRPC.User user5 = this.f21344y;
                        boolean z10 = user5.bot;
                        if (z10 && (i10 = user5.bot_active_users) != 0) {
                            charSequence = LocaleController.formatPluralStringSpaced("BotUsersShort", i10);
                        } else if (z10) {
                            charSequence = LocaleController.getString(R.string.Bot);
                        } else {
                            long j10 = user5.f19363id;
                            if (j10 == 489000) {
                                charSequence = LocaleController.getString(R.string.VerifyCodesNotifications);
                            } else if (UserObject.isService(j10)) {
                                charSequence = LocaleController.getString(R.string.ServiceNotifications);
                            } else {
                                if (this.f21325j0 == null) {
                                    this.f21325j0 = new boolean[1];
                                }
                                boolean[] zArr = this.f21325j0;
                                zArr[0] = false;
                                charSequence5 = LocaleController.formatUserStatus(i12, this.f21344y, zArr);
                                if (this.f21325j0[0]) {
                                    textPaint5 = org.telegram.ui.ActionBar.g6.P0;
                                }
                                TLRPC.User user6 = this.f21344y;
                                if (user6 != null && (user6.f19363id == UserConfig.getInstance(i12).getClientUserId() || ((userStatus = this.f21344y.status) != null && userStatus.expires > ConnectionsManager.getInstance(i12).getCurrentTime()))) {
                                    textPaint5 = org.telegram.ui.ActionBar.g6.P0;
                                    charSequence = LocaleController.getString(R.string.Online);
                                }
                            }
                        }
                    }
                } else {
                    charSequence = null;
                }
                if (!this.L || UserObject.isReplyUser(this.f21344y)) {
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
            if (textPaint5 == org.telegram.ui.ActionBar.g6.Q0) {
                this.G0.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.A6, c6Var));
            } else if (textPaint5 == org.telegram.ui.ActionBar.g6.P0) {
                this.G0.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20121p6, c6Var));
            }
            textPaint5 = this.G0;
        }
        if (!TextUtils.isEmpty(charSequence)) {
            i11 = i13;
            this.f21334r0 = new StaticLayout(TextUtils.ellipsize(charSequence, textPaint5, i13 - AndroidUtilities.dp(f10), truncateAt), textPaint5, i13, alignment, 1.0f, 0.0f, false);
            this.P = AndroidUtilities.dp(9.0f);
            this.T -= AndroidUtilities.dp(10.0f);
        } else {
            i11 = i13;
            this.P = AndroidUtilities.dp(20.0f);
            this.f21334r0 = null;
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
        RectF rectF = this.f21338u0.F;
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
            StaticLayout staticLayout = this.f21334r0;
            if (staticLayout != null && staticLayout.getLineCount() > 0 && this.f21334r0.getLineLeft(0) == f7) {
                double ceil2 = Math.ceil(this.f21334r0.getLineWidth(0));
                double d11 = i11;
                if (ceil2 < d11) {
                    this.f21332q0 = (int) ((d11 - ceil2) + this.f21332q0);
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
            StaticLayout staticLayout2 = this.f21334r0;
            if (staticLayout2 != null && staticLayout2.getLineCount() > 0 && this.f21334r0.getLineRight(0) == i11) {
                double ceil4 = Math.ceil(this.f21334r0.getLineWidth(0));
                double d13 = i11;
                if (ceil4 < d13) {
                    this.f21332q0 = (int) (this.f21332q0 - (d13 - ceil4));
                }
            }
        }
        this.O = getPaddingLeft() + this.O;
        this.f21332q0 = getPaddingLeft() + this.f21332q0;
        this.S = getPaddingLeft() + this.S;
        if (this.M0) {
            this.O = AndroidUtilities.dp(1.0f) + this.O;
            this.P = AndroidUtilities.dp(1.0f) + this.P;
        }
    }

    public void setAd(TLRPC.TL_sponsoredPeer tL_sponsoredPeer) {
        this.f21342x = tL_sponsoredPeer;
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
        if (this.f21331p0 == z10) {
            return;
        }
        if (this.L0 == null) {
            this.L0 = new h11(LocaleController.getString(R.string.BotOpen), 14.0f, AndroidUtilities.bold());
        }
        if (z10) {
            i10 = AndroidUtilities.dp(30.0f) + ((int) this.L0.f25473c);
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
        this.f21331p0 = z10;
        this.I0.c(false);
    }

    public void setRectangularAvatar(boolean z10) {
        this.N0 = z10;
    }

    public void setSubLabel(CharSequence charSequence) {
        this.v = charSequence;
        v(0);
    }

    public final void t(boolean z10, boolean z11) {
        aq aqVar = this.A0;
        if (aqVar == null) {
            return;
        }
        aqVar.a(z10, z11);
    }

    public final void u(Object obj, TLRPC.EncryptedChat encryptedChat, CharSequence charSequence, CharSequence charSequence2, boolean z10, boolean z11) {
        boolean z12;
        this.f21328n = charSequence;
        boolean z13 = obj instanceof TLRPC.User;
        int i10 = this.N;
        TL_account.RequirementToContact requirementToContact = null;
        if (z13) {
            this.f21344y = (TLRPC.User) obj;
            this.E = null;
            this.G = null;
            if (this.f21327l0) {
                requirementToContact = MessagesController.getInstance(i10).isUserContactBlocked(this.f21344y.f19363id);
            }
            this.f21329n0 = DialogObject.isPremiumBlocked(requirementToContact);
            this.f21330o0 = DialogObject.getMessagesStarsPrice(requirementToContact);
            if (this.B0 && this.f21344y.bot_has_main_app) {
                z12 = true;
            } else {
                z12 = false;
            }
            setOpenBotButton(z12);
        } else if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            this.E = chat;
            this.f21344y = null;
            this.G = null;
            TL_account.RequirementToContact requirementToContact2 = ChatObject.getRequirementToContact(chat);
            this.f21329n0 = DialogObject.isPremiumBlocked(requirementToContact2);
            this.f21330o0 = DialogObject.getMessagesStarsPrice(requirementToContact2);
            setOpenBotButton(false);
        } else if (obj instanceof ContactsController.Contact) {
            ContactsController.Contact contact = (ContactsController.Contact) obj;
            this.G = contact;
            this.E = null;
            this.f21344y = null;
            if (this.f21327l0 && contact.user != null) {
                requirementToContact = MessagesController.getInstance(i10).isUserContactBlocked(this.G.user.f19363id);
            }
            this.f21329n0 = DialogObject.isPremiumBlocked(requirementToContact);
            this.f21330o0 = DialogObject.getMessagesStarsPrice(requirementToContact);
            setOpenBotButton(false);
        } else {
            setOpenBotButton(false);
        }
        this.F = encryptedChat;
        this.v = charSequence2;
        this.f21318d0 = z10;
        this.L = z11;
        v(0);
    }

    public final void v(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.i6.v(int):void");
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f21337t0 != drawable && this.f21336s0 != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public final void w(boolean z10, TLRPC.User user, TLRPC.Chat chat, boolean z11) {
        long j10;
        boolean z12 = LocaleController.isRTL;
        org.telegram.ui.Components.q5 q5Var = this.f21337t0;
        q5Var.f28513a = z12;
        boolean z13 = this.H0;
        org.telegram.ui.ActionBar.c6 c6Var = this.f21340w;
        if (z13 && z10) {
            q5Var.g(new cr(org.telegram.ui.ActionBar.g6.f19932f1, org.telegram.ui.ActionBar.g6.f19985i1, 0, 0), z11);
            q5Var.k(null);
        } else if (z13 && user != null && !this.L && DialogObject.getEmojiStatusDocumentId(user.emoji_status) != 0) {
            q5Var.j(DialogObject.getEmojiStatusDocumentId(user.emoji_status), z11);
            q5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20308z9, c6Var)));
        } else if (this.H0 && chat != null && !this.L && DialogObject.getEmojiStatusDocumentId(chat.emoji_status) != 0) {
            q5Var.j(DialogObject.getEmojiStatusDocumentId(chat.emoji_status), z11);
            q5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20308z9, c6Var)));
        } else if (this.H0 && user != null && !this.L && MessagesController.getInstance(this.N).isPremiumUser(user)) {
            q5Var.g(sg.b1.d().e, z11);
            q5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20308z9, c6Var)));
        } else {
            q5Var.g(null, z11);
            q5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20308z9, c6Var)));
        }
        if (user != null) {
            j10 = DialogObject.getBotVerificationIcon(user);
        } else if (chat != null) {
            j10 = DialogObject.getBotVerificationIcon(chat);
        } else {
            j10 = 0;
        }
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        org.telegram.ui.Components.q5 q5Var2 = this.f21336s0;
        if (i10 != 0 && !this.L) {
            q5Var2.j(j10, z11);
        } else {
            q5Var2.g(null, z11);
        }
        q5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20308z9, c6Var)));
    }
}
