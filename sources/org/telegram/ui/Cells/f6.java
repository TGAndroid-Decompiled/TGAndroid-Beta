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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.hp;
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.jq;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.le0;
import org.telegram.ui.Components.uc;
import org.telegram.ui.Components.zz0;
import org.telegram.ui.o00;
public final class f6 extends a0 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.x5 {
    public TLRPC.Chat A;
    public boolean A0;
    public TLRPC.EncryptedChat B;
    public TextPaint B0;
    public ContactsController.Contact C;
    public TextPaint C0;
    public long D;
    public boolean D0;
    public String E;
    public final uc E0;
    public int F;
    public final Paint F0;
    public TLRPC.FileLocation G;
    public final RectF G0;
    public boolean H;
    public zz0 H0;
    public boolean I;
    public boolean I0;
    public final int J;
    public boolean J0;
    public int K;
    public cg.r1 K0;
    public int L;
    public Drawable L0;
    public StaticLayout M;
    public boolean N;
    public int O;
    public int P;
    public int Q;
    public ad R;
    public StaticLayout S;
    public int T;
    public int U;
    public int V;
    public boolean W;
    public int f24319a0;
    public final int f24320b0;
    public int f24321c0;
    public int f24322d0;
    public StaticLayout f24323e0;
    public boolean f24324f;
    public boolean[] f24325f0;
    public boolean f24326g0;
    public le0 h;
    public boolean f24327h0;
    public final org.telegram.ui.Components.d6 f24328i0;
    public boolean f24329j0;
    public long f24330k0;
    public boolean f24331l0;
    public int m0;
    public CharSequence f24332n;
    public StaticLayout f24333n0;
    public final org.telegram.ui.Components.n5 f24334o0;
    public final org.telegram.ui.Components.n5 f24335p0;
    public final lh.h7 f24336q0;
    public final ImageReceiver f24337r;
    public final RectF f24338r0;
    public final org.telegram.ui.Components.e9 f24339s;
    public zz0 f24340s0;
    public Paint f24341t0;
    public final uc f24342u0;
    public CharSequence v;
    public final RectF f24343v0;
    public final org.telegram.ui.ActionBar.c6 f24344w;
    public final hp f24345w0;
    public TLRPC.TL_sponsoredPeer f24346x;
    public boolean f24347x0;
    public TLRPC.User f24348y;
    public Utilities.Callback f24349y0;
    public Utilities.Callback2 f24350z0;

    public f6(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.J = UserConfig.selectedAccount;
        this.f24320b0 = AndroidUtilities.dp(19.0f);
        this.f24328i0 = new org.telegram.ui.Components.d6(this, 0L, 350L, jr.h);
        jr jrVar = jr.f29800f;
        this.f24336q0 = new lh.h7(null, false);
        this.f24338r0 = new RectF();
        this.f24342u0 = new uc(this);
        this.f24343v0 = new RectF();
        this.D0 = true;
        this.E0 = new uc(this);
        this.F0 = new Paint(1);
        this.G0 = new RectF();
        this.f24344w = c6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f24337r = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(23.0f));
        this.f24339s = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
        hp hpVar = new hp(context, 21, c6Var);
        this.f24345w0 = hpVar;
        hpVar.b(-1, org.telegram.ui.ActionBar.g6.f23062d6, org.telegram.ui.ActionBar.g6.f23190k7);
        hpVar.setDrawUnchecked(false);
        hpVar.setDrawBackgroundAsArc(3);
        addView(hpVar);
        org.telegram.ui.Components.n5 n5Var = new org.telegram.ui.Components.n5(AndroidUtilities.dp(20.0f), this);
        this.f24334o0 = n5Var;
        n5Var.setCallback(this);
        org.telegram.ui.Components.n5 n5Var2 = new org.telegram.ui.Components.n5(AndroidUtilities.dp(20.0f), this);
        this.f24335p0 = n5Var2;
        n5Var2.setCallback(this);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            invalidate();
        } else if (i10 == NotificationCenter.userIsPremiumBlockedUpadted) {
            TLRPC.User user = this.f24348y;
            TL_account.RequirementToContact requirementToContact = null;
            int i12 = this.J;
            if (user != null) {
                if (this.f24327h0) {
                    requirementToContact = MessagesController.getInstance(i12).isUserContactBlocked(this.f24348y.f22539id);
                }
            } else {
                TLRPC.Chat chat = this.A;
                if (chat != null) {
                    requirementToContact = ChatObject.getRequirementToContact(chat);
                } else {
                    ContactsController.Contact contact = this.C;
                    if (contact != null) {
                        if (this.f24327h0 && contact.user != null) {
                            requirementToContact = MessagesController.getInstance(i12).isUserContactBlocked(this.C.user.f22539id);
                        }
                    } else {
                        return;
                    }
                }
            }
            if (this.f24329j0 != DialogObject.isPremiumBlocked(requirementToContact) || this.f24330k0 != DialogObject.getMessagesStarsPrice(requirementToContact)) {
                this.f24329j0 = DialogObject.isPremiumBlocked(requirementToContact);
                this.f24330k0 = DialogObject.getMessagesStarsPrice(requirementToContact);
                invalidate();
            }
        }
    }

    @Override
    public final void e() {
        if (this.M != null && getMeasuredWidth() > 0) {
            r();
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
        return this.f24348y;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f24337r.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        if (this.f24327h0) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
        }
        this.f24335p0.a();
        this.f24334o0.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f24337r.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        if (this.f24327h0) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
        }
        this.f24335p0.b();
        this.f24334o0.b();
    }

    @Override
    public final void onDraw(android.graphics.Canvas r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.f6.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        StaticLayout staticLayout = this.M;
        if (staticLayout != null) {
            sb2.append(staticLayout.getText());
        }
        if (this.f24326g0) {
            sb2.append(", ");
            org.telegram.ui.b.j(R.string.AccDescrVerified, "\n", sb2);
        }
        if (this.f24333n0 != null) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(this.f24333n0.getText());
        }
        accessibilityNodeInfo.setText(sb2.toString());
        hp hpVar = this.f24345w0;
        if (hpVar.f29211a.f26324q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(hpVar.f29211a.f26324q);
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
        if (this.f24348y != null || this.A != null || this.B != null || this.C != null) {
            hp hpVar = this.f24345w0;
            if (hpVar != null) {
                if (LocaleController.isRTL) {
                    dp = (i12 - i10) - AndroidUtilities.dp(42.0f);
                } else {
                    dp = AndroidUtilities.dp(42.0f);
                }
                int dp2 = AndroidUtilities.dp(36.0f);
                hpVar.layout(dp, dp2, hpVar.getMeasuredWidth() + dp, hpVar.getMeasuredHeight() + dp2);
            }
            if (z10) {
                r();
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int dp;
        hp hpVar = this.f24345w0;
        if (hpVar != null) {
            hpVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824));
        }
        int size = View.MeasureSpec.getSize(i10);
        if (this.I0) {
            dp = AndroidUtilities.dp(56.0f);
        } else {
            dp = AndroidUtilities.dp(60.0f) + (this.I ? 1 : 0);
        }
        setMeasuredDimension(size, dp);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.f6.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void r() {
        TLRPC.Chat chat;
        TextPaint textPaint;
        int measuredWidth;
        float f9;
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
        this.N = false;
        this.f24326g0 = false;
        TLRPC.EncryptedChat encryptedChat = this.B;
        float f15 = 11.0f;
        int i12 = this.J;
        if (encryptedChat != null) {
            this.N = true;
            this.D = DialogObject.makeEncryptedDialogId(encryptedChat.f22400id);
            if (!LocaleController.isRTL) {
                this.O = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                this.K = org.telegram.ui.ActionBar.g6.f23004a1.getIntrinsicWidth() + AndroidUtilities.dp(AndroidUtilities.leftBaseline + 4);
            } else {
                this.O = (getMeasuredWidth() - AndroidUtilities.dp(AndroidUtilities.leftBaseline + 2)) - org.telegram.ui.ActionBar.g6.f23004a1.getIntrinsicWidth();
                this.K = AndroidUtilities.dp(11.0f);
            }
            this.P = AndroidUtilities.dp(22.0f);
            v(false, null, null, false);
        } else {
            TLRPC.Chat chat2 = this.A;
            if (chat2 != null) {
                this.D = -chat2.f22392id;
                this.f24326g0 = chat2.verified;
                if (chat2.monoforum && (chat = MessagesController.getInstance(i12).getChat(Long.valueOf(this.A.linked_monoforum_id))) != null) {
                    this.f24326g0 = chat.verified;
                }
                if (!LocaleController.isRTL) {
                    this.K = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                } else {
                    this.K = AndroidUtilities.dp(11.0f);
                }
                v(this.f24326g0, null, this.A, false);
            } else {
                TLRPC.User user = this.f24348y;
                if (user != null) {
                    this.D = user.f22539id;
                    if (!LocaleController.isRTL) {
                        this.K = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                    } else {
                        this.K = AndroidUtilities.dp(11.0f);
                    }
                    this.P = AndroidUtilities.dp(21.0f);
                    this.f24326g0 = this.f24348y.verified;
                    if (!this.H) {
                        MessagesController.getInstance(i12).isPremiumUser(this.f24348y);
                    }
                    v(this.f24326g0, this.f24348y, null, false);
                } else if (this.C != null) {
                    this.D = 0L;
                    if (!LocaleController.isRTL) {
                        this.K = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                    } else {
                        this.K = AndroidUtilities.dp(11.0f);
                    }
                    if (this.R == null) {
                        ad adVar = new ad(this);
                        this.R = adVar;
                        adVar.h = new g(this, 5);
                    }
                }
            }
        }
        if (!LocaleController.isRTL) {
            this.m0 = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
        } else {
            this.m0 = AndroidUtilities.dp(11.0f);
        }
        if (this.f24346x != null) {
            if (this.f24340s0 == null) {
                SpannableStringBuilder append = new SpannableStringBuilder(LocaleController.getString(R.string.SearchAd)).append((CharSequence) " i");
                iq iqVar = new iq(R.drawable.ic_ab_other, 0);
                iqVar.setScale(0.55f, 0.55f);
                iqVar.spaceScaleX = 0.7f;
                iqVar.translate(-AndroidUtilities.dp(2.0f), 0.0f);
                append.setSpan(iqVar, append.length() - 1, append.length(), 33);
                this.f24340s0 = new zz0(append, 12.0f, null);
            }
            if (this.f24341t0 == null) {
                this.f24341t0 = new Paint(1);
            }
        }
        CharSequence charSequence2 = this.f24332n;
        CharSequence charSequence3 = charSequence2;
        if (charSequence2 == null) {
            charSequence3 = null;
        }
        TLRPC.Chat chat3 = this.A;
        org.telegram.ui.ActionBar.c6 c6Var = this.f24344w;
        SpannableStringBuilder spannableStringBuilder = charSequence3;
        if (chat3 != null) {
            spannableStringBuilder = charSequence3;
            if (chat3.monoforum) {
                TLRPC.Chat chat4 = MessagesController.getInstance(i12).getChat(Long.valueOf(this.A.linked_monoforum_id));
                spannableStringBuilder = charSequence3;
                if (chat4 != null) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(AndroidUtilities.escape(chat4.title));
                    spannableStringBuilder2.append((CharSequence) " ");
                    int length = spannableStringBuilder2.length();
                    spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.MonoforumSpan));
                    spannableStringBuilder2.setSpan(new o00(LocaleController.getString(R.string.MonoforumSpan), org.telegram.ui.ActionBar.g6.f23433y6, c6Var), length, spannableStringBuilder2.length(), 33);
                    spannableStringBuilder = spannableStringBuilder2;
                } else if (charSequence3 == null) {
                    spannableStringBuilder = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(this.A.title));
                }
            } else if (charSequence3 == null) {
                spannableStringBuilder = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(chat3.title));
            }
        } else if (charSequence3 == null) {
            TLRPC.User user2 = this.f24348y;
            spannableStringBuilder = charSequence3;
            if (user2 != null) {
                spannableStringBuilder = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(UserObject.getUserName(user2)));
            }
        }
        CharSequence replaceNewLines = AndroidUtilities.replaceNewLines(spannableStringBuilder);
        if (TextUtils.isEmpty(replaceNewLines)) {
            TLRPC.User user3 = this.f24348y;
            if (user3 != null && !TextUtils.isEmpty(user3.phone)) {
                replaceNewLines = org.telegram.messenger.x3.k(new StringBuilder("+"), this.f24348y.phone, qe.b.c());
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
                f14 = 15.0f;
            } else {
                f14 = 16.0f;
            }
            textPaint3.setTextSize(AndroidUtilities.dp(f14));
            if (this.B != null) {
                this.B0.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Z8, c6Var));
            } else {
                this.B0.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.X8, c6Var));
            }
            textPaint = this.B0;
        } else if (this.B != null) {
            textPaint = org.telegram.ui.ActionBar.g6.E0;
        } else {
            textPaint = org.telegram.ui.ActionBar.g6.D0;
        }
        TextPaint textPaint4 = textPaint;
        if (!LocaleController.isRTL) {
            measuredWidth = (getMeasuredWidth() - this.K) - AndroidUtilities.dp(14.0f);
            this.Q = measuredWidth;
        } else {
            measuredWidth = (getMeasuredWidth() - this.K) - AndroidUtilities.dp(AndroidUtilities.leftBaseline);
            this.Q = measuredWidth;
        }
        float f16 = 6.0f;
        if (this.N) {
            this.Q -= org.telegram.ui.ActionBar.g6.f23004a1.getIntrinsicWidth() + AndroidUtilities.dp(6.0f);
        }
        if (this.f24346x != null) {
            int dp2 = AndroidUtilities.dp(20.66f) + ((int) this.f24340s0.f35462c);
            this.Q -= dp2;
            if (LocaleController.isRTL) {
                this.K += dp2;
            }
        }
        if (this.C != null) {
            int measureText = (int) (org.telegram.ui.ActionBar.g6.L0.measureText(LocaleController.getString(R.string.Invite)) + 1.0f);
            this.S = new StaticLayout(LocaleController.getString(R.string.Invite), org.telegram.ui.ActionBar.g6.L0, measureText, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            if (!LocaleController.isRTL) {
                this.T = ((getMeasuredWidth() - measureText) - AndroidUtilities.dp(19.0f)) - AndroidUtilities.dp(16.0f);
            } else {
                this.T = AndroidUtilities.dp(16.0f) + AndroidUtilities.dp(19.0f);
                this.K += measureText;
                this.m0 += measureText;
            }
            this.Q = org.telegram.ui.b.u(32.0f, measureText, this.Q);
        }
        this.Q -= getPaddingRight() + getPaddingLeft();
        int paddingRight = measuredWidth - (getPaddingRight() + getPaddingLeft());
        if (this.W) {
            int dialogUnreadCount = MessagesController.getInstance(i12).getDialogUnreadCount((TLRPC.Dialog) MessagesController.getInstance(i12).dialogs_dict.f(this.D));
            if (dialogUnreadCount != 0) {
                this.f24319a0 = dialogUnreadCount;
                Locale locale = Locale.US;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(dialogUnreadCount);
                String sb3 = sb2.toString();
                f9 = 0.0f;
                f10 = 12.0f;
                this.f24322d0 = Math.max(AndroidUtilities.dp(12.0f), (int) Math.ceil(org.telegram.ui.ActionBar.g6.L0.measureText(sb3)));
                this.f24323e0 = new StaticLayout(sb3, org.telegram.ui.ActionBar.g6.L0, this.f24322d0, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                int dp3 = AndroidUtilities.dp(18.0f) + this.f24322d0;
                this.Q -= dp3;
                paddingRight -= dp3;
                if (!LocaleController.isRTL) {
                    this.f24321c0 = (getMeasuredWidth() - this.f24322d0) - AndroidUtilities.dp(19.0f);
                } else {
                    this.f24321c0 = AndroidUtilities.dp(19.0f);
                    this.K += dp3;
                    this.m0 += dp3;
                }
            } else {
                f9 = 0.0f;
                f10 = 12.0f;
                this.f24319a0 = 0;
                this.f24323e0 = null;
            }
        } else {
            f9 = 0.0f;
            f10 = 12.0f;
            this.f24319a0 = 0;
            this.f24323e0 = null;
        }
        int i13 = paddingRight;
        org.telegram.ui.Components.n5 n5Var = this.f24334o0;
        boolean d = n5Var.d();
        int i14 = n5Var.f30852s;
        if (!d) {
            if (LocaleController.isRTL) {
                this.Q -= i14;
            } else {
                this.K += i14;
            }
        }
        org.telegram.ui.Components.n5 n5Var2 = this.f24335p0;
        if (!n5Var2.d() && !LocaleController.isRTL) {
            this.Q -= n5Var2.f30852s;
        }
        if (this.Q < 0) {
            this.Q = 0;
        }
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        CharSequence ellipsize = TextUtils.ellipsize(replaceNewLines, textPaint4, this.Q - AndroidUtilities.dp(f10), truncateAt);
        if (ellipsize != null) {
            ellipsize = Emoji.replaceEmoji(ellipsize, textPaint4.getFontMetricsInt(), false);
        }
        CharSequence charSequence4 = ellipsize;
        int i15 = this.Q;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.M = new StaticLayout(charSequence4, textPaint4, i15, alignment, 1.0f, 0.0f, false);
        TextPaint textPaint5 = org.telegram.ui.ActionBar.g6.Q0;
        TLRPC.Chat chat5 = this.A;
        if (chat5 != null && this.v == null) {
            if (ChatObject.isCommunity(chat5)) {
                charSequence = LocaleController.getString(R.string.Community).toLowerCase();
            } else if (ChatObject.isChannelAndNotMegaGroup(this.A)) {
                TLRPC.Chat chat6 = this.A;
                int i16 = chat6.participants_count;
                if (i16 != 0) {
                    charSequence = LocaleController.formatPluralStringComma("Subscribers", i16);
                } else if (!ChatObject.isPublic(chat6)) {
                    charSequence = LocaleController.getString(R.string.ChannelPrivate).toLowerCase();
                } else {
                    charSequence = LocaleController.getString(R.string.ChannelPublic).toLowerCase();
                }
            } else {
                TLRPC.Chat chat7 = this.A;
                int i17 = chat7.participants_count;
                if (i17 != 0) {
                    charSequence = LocaleController.formatPluralStringComma("Members", i17);
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
                TLRPC.User user4 = this.f24348y;
                if (user4 != null) {
                    if (MessagesController.isSupportUser(user4)) {
                        charSequence = LocaleController.getString(R.string.SupportStatus);
                    } else {
                        TLRPC.User user5 = this.f24348y;
                        boolean z10 = user5.bot;
                        if (z10 && (i10 = user5.bot_active_users) != 0) {
                            charSequence = LocaleController.formatPluralStringSpaced("BotUsersShort", i10);
                        } else if (z10) {
                            charSequence = LocaleController.getString(R.string.Bot);
                        } else {
                            long j10 = user5.f22539id;
                            if (j10 == 489000) {
                                charSequence = LocaleController.getString(R.string.VerifyCodesNotifications);
                            } else if (UserObject.isService(j10)) {
                                charSequence = LocaleController.getString(R.string.ServiceNotifications);
                            } else {
                                if (this.f24325f0 == null) {
                                    this.f24325f0 = new boolean[1];
                                }
                                boolean[] zArr = this.f24325f0;
                                zArr[0] = false;
                                charSequence5 = LocaleController.formatUserStatus(i12, this.f24348y, zArr);
                                if (this.f24325f0[0]) {
                                    textPaint5 = org.telegram.ui.ActionBar.g6.P0;
                                }
                                TLRPC.User user6 = this.f24348y;
                                if (user6 != null && (user6.f22539id == UserConfig.getInstance(i12).getClientUserId() || ((userStatus = this.f24348y.status) != null && userStatus.expires > ConnectionsManager.getInstance(i12).getCurrentTime()))) {
                                    textPaint5 = org.telegram.ui.ActionBar.g6.P0;
                                    charSequence = LocaleController.getString(R.string.Online);
                                }
                            }
                        }
                    }
                } else {
                    charSequence = null;
                }
                if (!this.H || UserObject.isReplyUser(this.f24348y)) {
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
                f13 = 13.0f;
            } else {
                f13 = 15.0f;
            }
            textPaint6.setTextSize(AndroidUtilities.dp(f13));
            if (textPaint5 == org.telegram.ui.ActionBar.g6.Q0) {
                this.C0.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A6, c6Var));
            } else if (textPaint5 == org.telegram.ui.ActionBar.g6.P0) {
                this.C0.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23278p6, c6Var));
            }
            textPaint5 = this.C0;
        }
        if (!TextUtils.isEmpty(charSequence)) {
            i11 = i13;
            this.f24333n0 = new StaticLayout(TextUtils.ellipsize(charSequence, textPaint5, i13 - AndroidUtilities.dp(f10), truncateAt), textPaint5, i13, alignment, 1.0f, 0.0f, false);
            this.L = AndroidUtilities.dp(9.0f);
            this.P -= AndroidUtilities.dp(10.0f);
        } else {
            i11 = i13;
            this.L = AndroidUtilities.dp(20.0f);
            this.f24333n0 = null;
        }
        if (LocaleController.isRTL) {
            dp = (getMeasuredWidth() - AndroidUtilities.dp(57.0f)) - getPaddingRight();
        } else {
            if (this.I0) {
                f15 = 14.0f;
            } else if (this.J0) {
                f15 = 15.0f;
            }
            dp = AndroidUtilities.dp(f15) + getPaddingLeft();
        }
        RectF rectF = this.f24336q0.F;
        float f17 = dp;
        if (this.I0) {
            f11 = 6.0f;
        } else {
            f11 = 7.0f;
        }
        float dp4 = AndroidUtilities.dp(f11);
        float f18 = 46.0f;
        if (this.I0) {
            f12 = 44.0f;
        } else if (this.J0) {
            f12 = 42.0f;
        } else {
            f12 = 46.0f;
        }
        float dp5 = AndroidUtilities.dp(f12) + dp;
        if (!this.I0) {
            f16 = 7.0f;
        }
        int dp6 = AndroidUtilities.dp(f16);
        if (this.I0) {
            f18 = 44.0f;
        }
        rectF.set(f17, dp4, dp5, AndroidUtilities.dp(f18) + dp6);
        if (LocaleController.isRTL) {
            if (this.M.getLineCount() > 0 && this.M.getLineLeft(0) == f9) {
                double ceil = Math.ceil(this.M.getLineWidth(0));
                double d10 = this.Q;
                if (ceil < d10) {
                    this.K = (int) ((d10 - ceil) + this.K);
                }
            }
            StaticLayout staticLayout = this.f24333n0;
            if (staticLayout != null && staticLayout.getLineCount() > 0 && this.f24333n0.getLineLeft(0) == f9) {
                double ceil2 = Math.ceil(this.f24333n0.getLineWidth(0));
                double d11 = i11;
                if (ceil2 < d11) {
                    this.m0 = (int) ((d11 - ceil2) + this.m0);
                }
            }
        } else {
            if (this.M.getLineCount() > 0 && this.M.getLineRight(0) == this.Q) {
                double ceil3 = Math.ceil(this.M.getLineWidth(0));
                double d12 = this.Q;
                if (ceil3 < d12) {
                    this.K = (int) (this.K - (d12 - ceil3));
                }
            }
            StaticLayout staticLayout2 = this.f24333n0;
            if (staticLayout2 != null && staticLayout2.getLineCount() > 0 && this.f24333n0.getLineRight(0) == i11) {
                double ceil4 = Math.ceil(this.f24333n0.getLineWidth(0));
                double d13 = i11;
                if (ceil4 < d13) {
                    this.m0 = (int) (this.m0 - (d13 - ceil4));
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
        hp hpVar = this.f24345w0;
        if (hpVar == null) {
            return;
        }
        hpVar.a(z10, z11);
    }

    public void setAd(TLRPC.TL_sponsoredPeer tL_sponsoredPeer) {
        this.f24346x = tL_sponsoredPeer;
    }

    public void setAllowEmojiStatus(boolean z10) {
        this.D0 = z10;
    }

    public void setOnSponsoredOptionsClick(Utilities.Callback2<f6, TLRPC.TL_sponsoredPeer> callback2) {
        this.f24350z0 = callback2;
    }

    public void setOpenBotButton(boolean z10) {
        int i10;
        int i11;
        if (this.f24331l0 == z10) {
            return;
        }
        if (this.H0 == null) {
            this.H0 = new zz0(LocaleController.getString(R.string.BotOpen), 14.0f, AndroidUtilities.bold());
        }
        if (z10) {
            i10 = AndroidUtilities.dp(30.0f) + ((int) this.H0.f35462c);
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
        this.f24331l0 = z10;
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
        this.f24332n = charSequence;
        boolean z13 = obj instanceof TLRPC.User;
        int i10 = this.J;
        TL_account.RequirementToContact requirementToContact = null;
        if (z13) {
            this.f24348y = (TLRPC.User) obj;
            this.A = null;
            this.C = null;
            if (this.f24327h0) {
                requirementToContact = MessagesController.getInstance(i10).isUserContactBlocked(this.f24348y.f22539id);
            }
            this.f24329j0 = DialogObject.isPremiumBlocked(requirementToContact);
            this.f24330k0 = DialogObject.getMessagesStarsPrice(requirementToContact);
            if (this.f24347x0 && this.f24348y.bot_has_main_app) {
                z12 = true;
            } else {
                z12 = false;
            }
            setOpenBotButton(z12);
        } else if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            this.A = chat;
            this.f24348y = null;
            this.C = null;
            TL_account.RequirementToContact requirementToContact2 = ChatObject.getRequirementToContact(chat);
            this.f24329j0 = DialogObject.isPremiumBlocked(requirementToContact2);
            this.f24330k0 = DialogObject.getMessagesStarsPrice(requirementToContact2);
            setOpenBotButton(false);
        } else if (obj instanceof ContactsController.Contact) {
            ContactsController.Contact contact = (ContactsController.Contact) obj;
            this.C = contact;
            this.A = null;
            this.f24348y = null;
            if (this.f24327h0 && contact.user != null) {
                requirementToContact = MessagesController.getInstance(i10).isUserContactBlocked(this.C.user.f22539id);
            }
            this.f24329j0 = DialogObject.isPremiumBlocked(requirementToContact);
            this.f24330k0 = DialogObject.getMessagesStarsPrice(requirementToContact);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.f6.u(int):void");
    }

    public final void v(boolean z10, TLRPC.User user, TLRPC.Chat chat, boolean z11) {
        long j10;
        boolean z12 = LocaleController.isRTL;
        org.telegram.ui.Components.n5 n5Var = this.f24335p0;
        n5Var.f30845a = z12;
        boolean z13 = this.D0;
        org.telegram.ui.ActionBar.c6 c6Var = this.f24344w;
        if (z13 && z10) {
            n5Var.g(new jq(org.telegram.ui.ActionBar.g6.f23094f1, org.telegram.ui.ActionBar.g6.f23147i1, 0, 0), z11);
            n5Var.k(null);
        } else if (z13 && user != null && !this.H && DialogObject.getEmojiStatusDocumentId(user.emoji_status) != 0) {
            n5Var.j(DialogObject.getEmojiStatusDocumentId(user.emoji_status), z11);
            n5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23453z9, c6Var)));
        } else if (this.D0 && chat != null && !this.H && DialogObject.getEmojiStatusDocumentId(chat.emoji_status) != 0) {
            n5Var.j(DialogObject.getEmojiStatusDocumentId(chat.emoji_status), z11);
            n5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23453z9, c6Var)));
        } else if (this.D0 && user != null && !this.H && MessagesController.getInstance(this.J).isPremiumUser(user)) {
            n5Var.g(cg.s1.d().f3363e, z11);
            n5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23453z9, c6Var)));
        } else {
            n5Var.g(null, z11);
            n5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23453z9, c6Var)));
        }
        if (user != null) {
            j10 = DialogObject.getBotVerificationIcon(user);
        } else if (chat != null) {
            j10 = DialogObject.getBotVerificationIcon(chat);
        } else {
            j10 = 0;
        }
        org.telegram.ui.Components.n5 n5Var2 = this.f24334o0;
        if (j10 != 0 && !this.H) {
            n5Var2.j(j10, z11);
        } else {
            n5Var2.g(null, z11);
        }
        n5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23453z9, c6Var)));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f24335p0 != drawable && this.f24334o0 != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
