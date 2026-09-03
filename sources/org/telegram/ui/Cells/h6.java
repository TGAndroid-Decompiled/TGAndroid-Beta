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
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.ve0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.a10;
public final class h6 extends a0 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.b6 {
    public Utilities.Callback2 A0;
    public TLRPC.Chat B;
    public boolean B0;
    public TLRPC.EncryptedChat C;
    public TextPaint C0;
    public ContactsController.Contact D;
    public TextPaint D0;
    public long E;
    public boolean E0;
    public String F;
    public final rc F0;
    public int G;
    public final Paint G0;
    public TLRPC.FileLocation H;
    public final RectF H0;
    public boolean I;
    public k01 I0;
    public boolean J;
    public boolean J0;
    public final int K;
    public boolean K0;
    public int L;
    public fg.p1 L0;
    public int M;
    public Drawable M0;
    public StaticLayout N;
    public boolean O;
    public int P;
    public int Q;
    public int R;
    public xc S;
    public StaticLayout T;
    public int U;
    public int V;
    public int W;
    public boolean f22893a0;
    public int f22894b0;
    public final int f22895c0;
    public int f22896d0;
    public int f22897e0;
    public boolean f22898f;
    public StaticLayout f22899f0;
    public boolean[] f22900g0;
    public ve0 h;
    public boolean f22901h0;
    public boolean f22902i0;
    public final org.telegram.ui.Components.z5 f22903j0;
    public boolean f22904k0;
    public long f22905l0;
    public boolean m0;
    public CharSequence f22906n;
    public int f22907n0;
    public StaticLayout f22908o0;
    public final org.telegram.ui.Components.j5 f22909p0;
    public final org.telegram.ui.Components.j5 f22910q0;
    public final ImageReceiver f22911r;
    public final oh.i7 f22912r0;
    public final org.telegram.ui.Components.z8 f22913s;
    public final RectF f22914s0;
    public k01 f22915t0;
    public Paint f22916u0;
    public CharSequence v;
    public final rc f22917v0;
    public final org.telegram.ui.ActionBar.g6 f22918w;
    public final RectF f22919w0;
    public TLRPC.TL_sponsoredPeer f22920x;
    public final np f22921x0;
    public TLRPC.User f22922y;
    public boolean f22923y0;
    public Utilities.Callback f22924z0;

    public h6(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.K = UserConfig.selectedAccount;
        this.f22895c0 = AndroidUtilities.dp(19.0f);
        this.f22903j0 = new org.telegram.ui.Components.z5(this, 0L, 350L, pr.h);
        pr prVar = pr.f30168f;
        this.f22912r0 = new oh.i7(null, false);
        this.f22914s0 = new RectF();
        this.f22917v0 = new rc(this);
        this.f22919w0 = new RectF();
        this.E0 = true;
        this.F0 = new rc(this);
        this.G0 = new Paint(1);
        this.H0 = new RectF();
        this.f22918w = g6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f22911r = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(23.0f));
        this.f22913s = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.g6) null);
        np npVar = new np(context, 21, g6Var);
        this.f22921x0 = npVar;
        npVar.b(-1, org.telegram.ui.ActionBar.k6.f21661d6, org.telegram.ui.ActionBar.k6.f21788k7);
        npVar.setDrawUnchecked(false);
        npVar.setDrawBackgroundAsArc(3);
        addView(npVar);
        org.telegram.ui.Components.j5 j5Var = new org.telegram.ui.Components.j5(AndroidUtilities.dp(20.0f), this);
        this.f22909p0 = j5Var;
        j5Var.setCallback(this);
        org.telegram.ui.Components.j5 j5Var2 = new org.telegram.ui.Components.j5(AndroidUtilities.dp(20.0f), this);
        this.f22910q0 = j5Var2;
        j5Var2.setCallback(this);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            invalidate();
        } else if (i10 == NotificationCenter.userIsPremiumBlockedUpadted) {
            TLRPC.User user = this.f22922y;
            TL_account.RequirementToContact requirementToContact = null;
            int i12 = this.K;
            if (user != null) {
                if (this.f22902i0) {
                    requirementToContact = MessagesController.getInstance(i12).isUserContactBlocked(this.f22922y.f20992id);
                }
            } else {
                TLRPC.Chat chat = this.B;
                if (chat != null) {
                    requirementToContact = ChatObject.getRequirementToContact(chat);
                } else {
                    ContactsController.Contact contact = this.D;
                    if (contact != null) {
                        if (this.f22902i0 && contact.user != null) {
                            requirementToContact = MessagesController.getInstance(i12).isUserContactBlocked(this.D.user.f20992id);
                        }
                    } else {
                        return;
                    }
                }
            }
            if (this.f22904k0 != DialogObject.isPremiumBlocked(requirementToContact) || this.f22905l0 != DialogObject.getMessagesStarsPrice(requirementToContact)) {
                this.f22904k0 = DialogObject.isPremiumBlocked(requirementToContact);
                this.f22905l0 = DialogObject.getMessagesStarsPrice(requirementToContact);
                invalidate();
            }
        }
    }

    @Override
    public final void e() {
        if (this.N != null && getMeasuredWidth() > 0) {
            r();
        }
    }

    public TLRPC.Chat getChat() {
        return this.B;
    }

    public int[] getColorKeys() {
        return null;
    }

    public long getDialogId() {
        return this.E;
    }

    public TLRPC.User getUser() {
        return this.f22922y;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f22911r.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        if (this.f22902i0) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
        }
        this.f22910q0.a();
        this.f22909p0.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f22911r.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        if (this.f22902i0) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
        }
        this.f22910q0.b();
        this.f22909p0.b();
    }

    @Override
    public final void onDraw(android.graphics.Canvas r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.h6.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb = new StringBuilder();
        StaticLayout staticLayout = this.N;
        if (staticLayout != null) {
            sb.append(staticLayout.getText());
        }
        if (this.f22901h0) {
            sb.append(", ");
            org.telegram.ui.b.i(R.string.AccDescrVerified, "\n", sb);
        }
        if (this.f22908o0 != null) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(this.f22908o0.getText());
        }
        accessibilityNodeInfo.setText(sb.toString());
        np npVar = this.f22921x0;
        if (npVar.f29560a.f24811q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(npVar.f29560a.f24811q);
            accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int dp;
        if (this.f22922y != null || this.B != null || this.C != null || this.D != null) {
            np npVar = this.f22921x0;
            if (npVar != null) {
                if (LocaleController.isRTL) {
                    dp = (i12 - i10) - AndroidUtilities.dp(42.0f);
                } else {
                    dp = AndroidUtilities.dp(42.0f);
                }
                int dp2 = AndroidUtilities.dp(36.0f);
                npVar.layout(dp, dp2, npVar.getMeasuredWidth() + dp, npVar.getMeasuredHeight() + dp2);
            }
            if (z4) {
                r();
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int dp;
        np npVar = this.f22921x0;
        if (npVar != null) {
            npVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824));
        }
        int size = View.MeasureSpec.getSize(i10);
        if (this.J0) {
            dp = AndroidUtilities.dp(56.0f);
        } else {
            dp = AndroidUtilities.dp(60.0f) + (this.J ? 1 : 0);
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
        int i10;
        int i11;
        int dp;
        float f12;
        float f13;
        float f14;
        float f15;
        this.O = false;
        this.f22901h0 = false;
        TLRPC.EncryptedChat encryptedChat = this.C;
        float f16 = 11.0f;
        int i12 = this.K;
        if (encryptedChat != null) {
            this.O = true;
            this.E = DialogObject.makeEncryptedDialogId(encryptedChat.f20853id);
            if (!LocaleController.isRTL) {
                this.P = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                this.L = org.telegram.ui.ActionBar.k6.f21602a1.getIntrinsicWidth() + AndroidUtilities.dp(AndroidUtilities.leftBaseline + 4);
            } else {
                this.P = (getMeasuredWidth() - AndroidUtilities.dp(AndroidUtilities.leftBaseline + 2)) - org.telegram.ui.ActionBar.k6.f21602a1.getIntrinsicWidth();
                this.L = AndroidUtilities.dp(11.0f);
            }
            this.Q = AndroidUtilities.dp(22.0f);
            v(false, null, null, false);
        } else {
            TLRPC.Chat chat2 = this.B;
            if (chat2 != null) {
                this.E = -chat2.f20845id;
                this.f22901h0 = chat2.verified;
                if (chat2.monoforum && (chat = MessagesController.getInstance(i12).getChat(Long.valueOf(this.B.linked_monoforum_id))) != null) {
                    this.f22901h0 = chat.verified;
                }
                if (!LocaleController.isRTL) {
                    this.L = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                } else {
                    this.L = AndroidUtilities.dp(11.0f);
                }
                v(this.f22901h0, null, this.B, false);
            } else {
                TLRPC.User user = this.f22922y;
                if (user != null) {
                    this.E = user.f20992id;
                    if (!LocaleController.isRTL) {
                        this.L = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                    } else {
                        this.L = AndroidUtilities.dp(11.0f);
                    }
                    this.Q = AndroidUtilities.dp(21.0f);
                    this.f22901h0 = this.f22922y.verified;
                    if (!this.I) {
                        MessagesController.getInstance(i12).isPremiumUser(this.f22922y);
                    }
                    v(this.f22901h0, this.f22922y, null, false);
                } else if (this.D != null) {
                    this.E = 0L;
                    if (!LocaleController.isRTL) {
                        this.L = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                    } else {
                        this.L = AndroidUtilities.dp(11.0f);
                    }
                    if (this.S == null) {
                        xc xcVar = new xc(this);
                        this.S = xcVar;
                        xcVar.h = new g(this, 5);
                    }
                }
            }
        }
        if (!LocaleController.isRTL) {
            this.f22907n0 = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
        } else {
            this.f22907n0 = AndroidUtilities.dp(11.0f);
        }
        if (this.f22920x != null) {
            if (this.f22915t0 == null) {
                SpannableStringBuilder append = new SpannableStringBuilder(LocaleController.getString(R.string.SearchAd)).append((CharSequence) " i");
                oq oqVar = new oq(R.drawable.ic_ab_other, 0);
                oqVar.setScale(0.55f, 0.55f);
                oqVar.spaceScaleX = 0.7f;
                oqVar.translate(-AndroidUtilities.dp(2.0f), 0.0f);
                append.setSpan(oqVar, append.length() - 1, append.length(), 33);
                this.f22915t0 = new k01(append, 12.0f, null);
            }
            if (this.f22916u0 == null) {
                this.f22916u0 = new Paint(1);
            }
        }
        CharSequence charSequence2 = this.f22906n;
        CharSequence charSequence3 = charSequence2;
        if (charSequence2 == null) {
            charSequence3 = null;
        }
        TLRPC.Chat chat3 = this.B;
        org.telegram.ui.ActionBar.g6 g6Var = this.f22918w;
        SpannableStringBuilder spannableStringBuilder = charSequence3;
        if (chat3 != null) {
            spannableStringBuilder = charSequence3;
            if (chat3.monoforum) {
                TLRPC.Chat chat4 = MessagesController.getInstance(i12).getChat(Long.valueOf(this.B.linked_monoforum_id));
                spannableStringBuilder = charSequence3;
                if (chat4 != null) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(AndroidUtilities.escape(chat4.title));
                    spannableStringBuilder2.append((CharSequence) " ");
                    int length = spannableStringBuilder2.length();
                    spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.MonoforumSpan));
                    spannableStringBuilder2.setSpan(new a10(LocaleController.getString(R.string.MonoforumSpan), org.telegram.ui.ActionBar.k6.f22038y6, g6Var), length, spannableStringBuilder2.length(), 33);
                    spannableStringBuilder = spannableStringBuilder2;
                } else if (charSequence3 == null) {
                    spannableStringBuilder = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(this.B.title));
                }
            } else if (charSequence3 == null) {
                spannableStringBuilder = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(chat3.title));
            }
        } else if (charSequence3 == null) {
            TLRPC.User user2 = this.f22922y;
            spannableStringBuilder = charSequence3;
            if (user2 != null) {
                spannableStringBuilder = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(UserObject.getUserName(user2)));
            }
        }
        CharSequence replaceNewLines = AndroidUtilities.replaceNewLines(spannableStringBuilder);
        if (TextUtils.isEmpty(replaceNewLines)) {
            TLRPC.User user3 = this.f22922y;
            if (user3 != null && !TextUtils.isEmpty(user3.phone)) {
                replaceNewLines = org.telegram.messenger.y3.j(new StringBuilder("+"), this.f22922y.phone, se.b.c());
            } else {
                replaceNewLines = LocaleController.getString(R.string.HiddenName);
            }
        }
        if (this.B0) {
            if (this.C0 == null) {
                TextPaint textPaint2 = new TextPaint(1);
                this.C0 = textPaint2;
                textPaint2.setTypeface(AndroidUtilities.bold());
            }
            TextPaint textPaint3 = this.C0;
            if (this.J0) {
                f15 = 15.0f;
            } else {
                f15 = 16.0f;
            }
            textPaint3.setTextSize(AndroidUtilities.dp(f15));
            if (this.C != null) {
                this.C0.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Z8, g6Var));
            } else {
                this.C0.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.X8, g6Var));
            }
            textPaint = this.C0;
        } else if (this.C != null) {
            textPaint = org.telegram.ui.ActionBar.k6.E0;
        } else {
            textPaint = org.telegram.ui.ActionBar.k6.D0;
        }
        TextPaint textPaint4 = textPaint;
        if (!LocaleController.isRTL) {
            measuredWidth = (getMeasuredWidth() - this.L) - AndroidUtilities.dp(14.0f);
            this.R = measuredWidth;
        } else {
            measuredWidth = (getMeasuredWidth() - this.L) - AndroidUtilities.dp(AndroidUtilities.leftBaseline);
            this.R = measuredWidth;
        }
        float f17 = 6.0f;
        if (this.O) {
            this.R -= org.telegram.ui.ActionBar.k6.f21602a1.getIntrinsicWidth() + AndroidUtilities.dp(6.0f);
        }
        if (this.f22920x != null) {
            int dp2 = AndroidUtilities.dp(20.66f) + ((int) this.f22915t0.f28227c);
            this.R -= dp2;
            if (LocaleController.isRTL) {
                this.L += dp2;
            }
        }
        if (this.D != null) {
            int measureText = (int) (org.telegram.ui.ActionBar.k6.L0.measureText(LocaleController.getString(R.string.Invite)) + 1.0f);
            this.T = new StaticLayout(LocaleController.getString(R.string.Invite), org.telegram.ui.ActionBar.k6.L0, measureText, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            if (!LocaleController.isRTL) {
                this.U = ((getMeasuredWidth() - measureText) - AndroidUtilities.dp(19.0f)) - AndroidUtilities.dp(16.0f);
            } else {
                this.U = AndroidUtilities.dp(16.0f) + AndroidUtilities.dp(19.0f);
                this.L += measureText;
                this.f22907n0 += measureText;
            }
            this.R = org.telegram.ui.b.t(32.0f, measureText, this.R);
        }
        this.R -= getPaddingRight() + getPaddingLeft();
        int paddingRight = measuredWidth - (getPaddingRight() + getPaddingLeft());
        if (this.f22893a0) {
            int dialogUnreadCount = MessagesController.getInstance(i12).getDialogUnreadCount((TLRPC.Dialog) MessagesController.getInstance(i12).dialogs_dict.f(this.E));
            if (dialogUnreadCount != 0) {
                this.f22894b0 = dialogUnreadCount;
                Locale locale = Locale.US;
                StringBuilder sb = new StringBuilder();
                sb.append(dialogUnreadCount);
                String sb2 = sb.toString();
                f10 = 0.0f;
                f11 = 12.0f;
                this.f22897e0 = Math.max(AndroidUtilities.dp(12.0f), (int) Math.ceil(org.telegram.ui.ActionBar.k6.L0.measureText(sb2)));
                this.f22899f0 = new StaticLayout(sb2, org.telegram.ui.ActionBar.k6.L0, this.f22897e0, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                int dp3 = AndroidUtilities.dp(18.0f) + this.f22897e0;
                this.R -= dp3;
                paddingRight -= dp3;
                if (!LocaleController.isRTL) {
                    this.f22896d0 = (getMeasuredWidth() - this.f22897e0) - AndroidUtilities.dp(19.0f);
                } else {
                    this.f22896d0 = AndroidUtilities.dp(19.0f);
                    this.L += dp3;
                    this.f22907n0 += dp3;
                }
            } else {
                f10 = 0.0f;
                f11 = 12.0f;
                this.f22894b0 = 0;
                this.f22899f0 = null;
            }
        } else {
            f10 = 0.0f;
            f11 = 12.0f;
            this.f22894b0 = 0;
            this.f22899f0 = null;
        }
        int i13 = paddingRight;
        org.telegram.ui.Components.j5 j5Var = this.f22909p0;
        boolean d = j5Var.d();
        int i14 = j5Var.f27991s;
        if (!d) {
            if (LocaleController.isRTL) {
                this.R -= i14;
            } else {
                this.L += i14;
            }
        }
        org.telegram.ui.Components.j5 j5Var2 = this.f22910q0;
        if (!j5Var2.d() && !LocaleController.isRTL) {
            this.R -= j5Var2.f27991s;
        }
        if (this.R < 0) {
            this.R = 0;
        }
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        CharSequence ellipsize = TextUtils.ellipsize(replaceNewLines, textPaint4, this.R - AndroidUtilities.dp(f11), truncateAt);
        if (ellipsize != null) {
            ellipsize = Emoji.replaceEmoji(ellipsize, textPaint4.getFontMetricsInt(), false);
        }
        CharSequence charSequence4 = ellipsize;
        int i15 = this.R;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.N = new StaticLayout(charSequence4, textPaint4, i15, alignment, 1.0f, 0.0f, false);
        TextPaint textPaint5 = org.telegram.ui.ActionBar.k6.Q0;
        TLRPC.Chat chat5 = this.B;
        if (chat5 != null && this.v == null) {
            if (ChatObject.isCommunity(chat5)) {
                charSequence = LocaleController.getString(R.string.Community).toLowerCase();
            } else if (ChatObject.isChannelAndNotMegaGroup(this.B)) {
                TLRPC.Chat chat6 = this.B;
                int i16 = chat6.participants_count;
                if (i16 != 0) {
                    charSequence = LocaleController.formatPluralStringComma("Subscribers", i16);
                } else if (!ChatObject.isPublic(chat6)) {
                    charSequence = LocaleController.getString(R.string.ChannelPrivate).toLowerCase();
                } else {
                    charSequence = LocaleController.getString(R.string.ChannelPublic).toLowerCase();
                }
            } else {
                TLRPC.Chat chat7 = this.B;
                int i17 = chat7.participants_count;
                if (i17 != 0) {
                    charSequence = LocaleController.formatPluralStringComma("Members", i17);
                } else if (chat7.has_geo) {
                    charSequence = LocaleController.getString(R.string.MegaLocation);
                } else if (ChatObject.isMonoForum(chat7)) {
                    charSequence = LocaleController.getString(R.string.MonoforumMessages);
                } else if (!ChatObject.isPublic(this.B)) {
                    charSequence = LocaleController.getString(R.string.MegaPrivate).toLowerCase();
                } else {
                    charSequence = LocaleController.getString(R.string.MegaPublic).toLowerCase();
                }
            }
            this.M = AndroidUtilities.dp(19.0f);
        } else {
            CharSequence charSequence5 = this.v;
            if (charSequence5 == null) {
                TLRPC.User user4 = this.f22922y;
                if (user4 != null) {
                    if (MessagesController.isSupportUser(user4)) {
                        charSequence = LocaleController.getString(R.string.SupportStatus);
                    } else {
                        TLRPC.User user5 = this.f22922y;
                        boolean z4 = user5.bot;
                        if (z4 && (i10 = user5.bot_active_users) != 0) {
                            charSequence = LocaleController.formatPluralStringSpaced("BotUsersShort", i10);
                        } else if (z4) {
                            charSequence = LocaleController.getString(R.string.Bot);
                        } else {
                            long j10 = user5.f20992id;
                            if (j10 == 489000) {
                                charSequence = LocaleController.getString(R.string.VerifyCodesNotifications);
                            } else if (UserObject.isService(j10)) {
                                charSequence = LocaleController.getString(R.string.ServiceNotifications);
                            } else {
                                if (this.f22900g0 == null) {
                                    this.f22900g0 = new boolean[1];
                                }
                                boolean[] zArr = this.f22900g0;
                                zArr[0] = false;
                                charSequence5 = LocaleController.formatUserStatus(i12, this.f22922y, zArr);
                                if (this.f22900g0[0]) {
                                    textPaint5 = org.telegram.ui.ActionBar.k6.P0;
                                }
                                TLRPC.User user6 = this.f22922y;
                                if (user6 != null && (user6.f20992id == UserConfig.getInstance(i12).getClientUserId() || ((userStatus = this.f22922y.status) != null && userStatus.expires > ConnectionsManager.getInstance(i12).getCurrentTime()))) {
                                    textPaint5 = org.telegram.ui.ActionBar.k6.P0;
                                    charSequence = LocaleController.getString(R.string.Online);
                                }
                            }
                        }
                    }
                } else {
                    charSequence = null;
                }
                if (!this.I || UserObject.isReplyUser(this.f22922y)) {
                    this.M = AndroidUtilities.dp(20.0f);
                    charSequence = null;
                }
            }
            charSequence = charSequence5;
            if (!this.I) {
            }
            this.M = AndroidUtilities.dp(20.0f);
            charSequence = null;
        }
        if (this.B0) {
            if (this.D0 == null) {
                this.D0 = new TextPaint(1);
            }
            TextPaint textPaint6 = this.D0;
            if (this.J0) {
                f14 = 13.0f;
            } else {
                f14 = 15.0f;
            }
            textPaint6.setTextSize(AndroidUtilities.dp(f14));
            if (textPaint5 == org.telegram.ui.ActionBar.k6.Q0) {
                this.D0.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.A6, g6Var));
            } else if (textPaint5 == org.telegram.ui.ActionBar.k6.P0) {
                this.D0.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21877p6, g6Var));
            }
            textPaint5 = this.D0;
        }
        if (!TextUtils.isEmpty(charSequence)) {
            i11 = i13;
            this.f22908o0 = new StaticLayout(TextUtils.ellipsize(charSequence, textPaint5, i13 - AndroidUtilities.dp(f11), truncateAt), textPaint5, i13, alignment, 1.0f, 0.0f, false);
            this.M = AndroidUtilities.dp(9.0f);
            this.Q -= AndroidUtilities.dp(10.0f);
        } else {
            i11 = i13;
            this.M = AndroidUtilities.dp(20.0f);
            this.f22908o0 = null;
        }
        if (LocaleController.isRTL) {
            dp = (getMeasuredWidth() - AndroidUtilities.dp(57.0f)) - getPaddingRight();
        } else {
            if (this.J0) {
                f16 = 14.0f;
            } else if (this.K0) {
                f16 = 15.0f;
            }
            dp = AndroidUtilities.dp(f16) + getPaddingLeft();
        }
        RectF rectF = this.f22912r0.F;
        float f18 = dp;
        if (this.J0) {
            f12 = 6.0f;
        } else {
            f12 = 7.0f;
        }
        float dp4 = AndroidUtilities.dp(f12);
        float f19 = 46.0f;
        if (this.J0) {
            f13 = 44.0f;
        } else if (this.K0) {
            f13 = 42.0f;
        } else {
            f13 = 46.0f;
        }
        float dp5 = AndroidUtilities.dp(f13) + dp;
        if (!this.J0) {
            f17 = 7.0f;
        }
        int dp6 = AndroidUtilities.dp(f17);
        if (this.J0) {
            f19 = 44.0f;
        }
        rectF.set(f18, dp4, dp5, AndroidUtilities.dp(f19) + dp6);
        if (LocaleController.isRTL) {
            if (this.N.getLineCount() > 0 && this.N.getLineLeft(0) == f10) {
                double ceil = Math.ceil(this.N.getLineWidth(0));
                double d10 = this.R;
                if (ceil < d10) {
                    this.L = (int) ((d10 - ceil) + this.L);
                }
            }
            StaticLayout staticLayout = this.f22908o0;
            if (staticLayout != null && staticLayout.getLineCount() > 0 && this.f22908o0.getLineLeft(0) == f10) {
                double ceil2 = Math.ceil(this.f22908o0.getLineWidth(0));
                double d11 = i11;
                if (ceil2 < d11) {
                    this.f22907n0 = (int) ((d11 - ceil2) + this.f22907n0);
                }
            }
        } else {
            if (this.N.getLineCount() > 0 && this.N.getLineRight(0) == this.R) {
                double ceil3 = Math.ceil(this.N.getLineWidth(0));
                double d12 = this.R;
                if (ceil3 < d12) {
                    this.L = (int) (this.L - (d12 - ceil3));
                }
            }
            StaticLayout staticLayout2 = this.f22908o0;
            if (staticLayout2 != null && staticLayout2.getLineCount() > 0 && this.f22908o0.getLineRight(0) == i11) {
                double ceil4 = Math.ceil(this.f22908o0.getLineWidth(0));
                double d13 = i11;
                if (ceil4 < d13) {
                    this.f22907n0 = (int) (this.f22907n0 - (d13 - ceil4));
                }
            }
        }
        this.L = getPaddingLeft() + this.L;
        this.f22907n0 = getPaddingLeft() + this.f22907n0;
        this.P = getPaddingLeft() + this.P;
        if (this.J0) {
            this.L = AndroidUtilities.dp(1.0f) + this.L;
            this.M = AndroidUtilities.dp(1.0f) + this.M;
        }
    }

    public final void s(boolean z4, boolean z10) {
        np npVar = this.f22921x0;
        if (npVar == null) {
            return;
        }
        npVar.a(z4, z10);
    }

    public void setAd(TLRPC.TL_sponsoredPeer tL_sponsoredPeer) {
        this.f22920x = tL_sponsoredPeer;
    }

    public void setAllowEmojiStatus(boolean z4) {
        this.E0 = z4;
    }

    public void setOnSponsoredOptionsClick(Utilities.Callback2<h6, TLRPC.TL_sponsoredPeer> callback2) {
        this.A0 = callback2;
    }

    public void setOpenBotButton(boolean z4) {
        int i10;
        int i11;
        if (this.m0 == z4) {
            return;
        }
        if (this.I0 == null) {
            this.I0 = new k01(LocaleController.getString(R.string.BotOpen), 14.0f, AndroidUtilities.bold());
        }
        if (z4) {
            i10 = AndroidUtilities.dp(30.0f) + ((int) this.I0.f28227c);
        } else {
            i10 = 0;
        }
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i11 = i10;
        } else {
            i11 = 0;
        }
        if (z10) {
            i10 = 0;
        }
        setPadding(i11, 0, i10, 0);
        this.m0 = z4;
        this.F0.c(false);
    }

    public void setRectangularAvatar(boolean z4) {
        this.K0 = z4;
    }

    public void setSubLabel(CharSequence charSequence) {
        this.v = charSequence;
        u(0);
    }

    public final void t(Object obj, TLRPC.EncryptedChat encryptedChat, CharSequence charSequence, CharSequence charSequence2, boolean z4, boolean z10) {
        boolean z11;
        this.f22906n = charSequence;
        boolean z12 = obj instanceof TLRPC.User;
        int i10 = this.K;
        TL_account.RequirementToContact requirementToContact = null;
        if (z12) {
            this.f22922y = (TLRPC.User) obj;
            this.B = null;
            this.D = null;
            if (this.f22902i0) {
                requirementToContact = MessagesController.getInstance(i10).isUserContactBlocked(this.f22922y.f20992id);
            }
            this.f22904k0 = DialogObject.isPremiumBlocked(requirementToContact);
            this.f22905l0 = DialogObject.getMessagesStarsPrice(requirementToContact);
            if (this.f22923y0 && this.f22922y.bot_has_main_app) {
                z11 = true;
            } else {
                z11 = false;
            }
            setOpenBotButton(z11);
        } else if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            this.B = chat;
            this.f22922y = null;
            this.D = null;
            TL_account.RequirementToContact requirementToContact2 = ChatObject.getRequirementToContact(chat);
            this.f22904k0 = DialogObject.isPremiumBlocked(requirementToContact2);
            this.f22905l0 = DialogObject.getMessagesStarsPrice(requirementToContact2);
            setOpenBotButton(false);
        } else if (obj instanceof ContactsController.Contact) {
            ContactsController.Contact contact = (ContactsController.Contact) obj;
            this.D = contact;
            this.B = null;
            this.f22922y = null;
            if (this.f22902i0 && contact.user != null) {
                requirementToContact = MessagesController.getInstance(i10).isUserContactBlocked(this.D.user.f20992id);
            }
            this.f22904k0 = DialogObject.isPremiumBlocked(requirementToContact);
            this.f22905l0 = DialogObject.getMessagesStarsPrice(requirementToContact);
            setOpenBotButton(false);
        } else {
            setOpenBotButton(false);
        }
        this.C = encryptedChat;
        this.v = charSequence2;
        this.f22893a0 = z4;
        this.I = z10;
        u(0);
    }

    public final void u(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.h6.u(int):void");
    }

    public final void v(boolean z4, TLRPC.User user, TLRPC.Chat chat, boolean z10) {
        long j10;
        boolean z11 = LocaleController.isRTL;
        org.telegram.ui.Components.j5 j5Var = this.f22910q0;
        j5Var.f27984a = z11;
        boolean z12 = this.E0;
        org.telegram.ui.ActionBar.g6 g6Var = this.f22918w;
        if (z12 && z4) {
            j5Var.g(new pq(org.telegram.ui.ActionBar.k6.f21693f1, org.telegram.ui.ActionBar.k6.f21747i1, 0, 0), z10);
            j5Var.k(null);
        } else if (z12 && user != null && !this.I && DialogObject.getEmojiStatusDocumentId(user.emoji_status) != 0) {
            j5Var.j(DialogObject.getEmojiStatusDocumentId(user.emoji_status), z10);
            j5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f22058z9, g6Var)));
        } else if (this.E0 && chat != null && !this.I && DialogObject.getEmojiStatusDocumentId(chat.emoji_status) != 0) {
            j5Var.j(DialogObject.getEmojiStatusDocumentId(chat.emoji_status), z10);
            j5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f22058z9, g6Var)));
        } else if (this.E0 && user != null && !this.I && MessagesController.getInstance(this.K).isPremiumUser(user)) {
            j5Var.g(fg.q1.d().f6516e, z10);
            j5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f22058z9, g6Var)));
        } else {
            j5Var.g(null, z10);
            j5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f22058z9, g6Var)));
        }
        if (user != null) {
            j10 = DialogObject.getBotVerificationIcon(user);
        } else if (chat != null) {
            j10 = DialogObject.getBotVerificationIcon(chat);
        } else {
            j10 = 0;
        }
        org.telegram.ui.Components.j5 j5Var2 = this.f22909p0;
        if (j10 != 0 && !this.I) {
            j5Var2.j(j10, z10);
        } else {
            j5Var2.g(null, z10);
        }
        j5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f22058z9, g6Var)));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f22910q0 != drawable && this.f22909p0 != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
