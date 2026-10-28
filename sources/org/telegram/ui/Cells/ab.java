package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.aq;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.u61;
import org.telegram.ui.qk0;
public class ab extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.p6 {
    public final org.telegram.ui.Components.j9 E;
    public boolean F;
    public Object G;
    public CharSequence H;
    public CharSequence I;
    public int J;
    public boolean K;
    public String L;
    public String M;
    public int N;
    public TLRPC.FileLocation O;
    public final int P;
    public int Q;
    public int R;
    public boolean S;
    public final q6 T;
    public long U;
    public boolean V;
    public boolean W;
    public final di.k4 f23873a;
    public boolean f23874a0;
    public final org.telegram.ui.ActionBar.b6 f23875b;
    public final org.telegram.ui.ActionBar.b6 f23876c;
    public final ImageView d;
    public final aq e;
    public final CheckBoxSquare f23877f;
    public final ImageView h;
    public final TextView f23878n;
    public final TextView f23879r;
    public Drawable f23880s;
    public final org.telegram.ui.Components.r5 v;
    public final org.telegram.ui.Components.r5 f23881w;
    public ImageView f23882x;
    public final org.telegram.ui.ActionBar.u6 f23883y;

    public ab(Context context, int i10, int i11, boolean z10) {
        this(i10, i11, context, null, z10, false);
    }

    public final void a(String str, boolean z10, boolean z11, boolean z12, View.OnClickListener onClickListener) {
        int i10;
        int i11;
        TextView textView = this.f23878n;
        if (textView == null) {
            return;
        }
        if (z11) {
            i10 = org.telegram.ui.ActionBar.y6.Dh;
        } else if (z10) {
            i10 = org.telegram.ui.ActionBar.y6.Ch;
        } else if (z12 && TextUtils.isEmpty(str)) {
            i10 = org.telegram.ui.ActionBar.y6.Oh;
        } else {
            i10 = org.telegram.ui.ActionBar.y6.f23510ld;
        }
        org.telegram.ui.ActionBar.u6 u6Var = this.f23883y;
        int w02 = org.telegram.ui.ActionBar.y6.w0(i10, u6Var);
        org.telegram.ui.ActionBar.f7.V(textView, i10, u6Var);
        if (!z10 && !z11) {
            if (z12 && TextUtils.isEmpty(str)) {
                textView.setPadding(org.telegram.ui.d3.h(6.0f, R.string.AddTag, textView), AndroidUtilities.dp(0.66f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f));
                textView.setTranslationX(AndroidUtilities.dp(6.0f));
                y Z = org.telegram.ui.ActionBar.y6.Z(org.telegram.ui.ActionBar.y6.o1(0.12f, w02), AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f));
                org.telegram.ui.ActionBar.b7 L = org.telegram.ui.ActionBar.f7.L(0.12f, i10);
                textView.setBackground(Z);
                org.telegram.ui.ActionBar.f7.k(textView, Z, null, L, u6Var);
                textView.setOnClickListener(onClickListener);
            } else {
                textView.setText(str);
                textView.setPadding(0, 0, 0, 0);
                textView.setTranslationX(0.0f);
                textView.setBackground(null);
                textView.setOnClickListener(onClickListener);
            }
        } else {
            textView.setText(str);
            textView.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(0.66f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f));
            textView.setTranslationX(AndroidUtilities.dp(6.0f));
            ShapeDrawable c02 = org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(32.0f), org.telegram.ui.ActionBar.y6.o1(0.12f, w02));
            org.telegram.ui.ActionBar.b7 L2 = org.telegram.ui.ActionBar.f7.L(0.12f, i10);
            textView.setBackground(c02);
            org.telegram.ui.ActionBar.f7.k(textView, c02, L2, null, u6Var);
            textView.setOnClickListener(onClickListener);
        }
        if (str == null && !z12) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        textView.setVisibility(i11);
        if (str == null && !z12) {
            h(0, false);
            return;
        }
        CharSequence text = textView.getText();
        h((int) Math.ceil(textView.getPaint().measureText(text, 0, text.length())), false);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23749y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.il));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23357d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23486k7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Dh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ch));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23510ld));
    }

    public final void b(int i10, int i11) {
        float f7;
        float f10;
        int i12;
        float f11;
        float f12;
        float f13;
        int i13;
        di.k4 k4Var = this.f23873a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) k4Var.getLayoutParams();
        float f14 = 0.0f;
        if (LocaleController.isRTL) {
            f7 = 0.0f;
        } else {
            f7 = i10 + 7;
        }
        layoutParams.leftMargin = AndroidUtilities.dp(f7);
        if (LocaleController.isRTL) {
            f10 = i10 + 7;
        } else {
            f10 = 0.0f;
        }
        layoutParams.rightMargin = AndroidUtilities.dp(f10);
        k4Var.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f23875b.getLayoutParams();
        boolean z10 = LocaleController.isRTL;
        int i14 = 0;
        CheckBoxSquare checkBoxSquare = this.f23877f;
        if (z10) {
            if (checkBoxSquare != null) {
                i13 = 18;
            } else {
                i13 = 0;
            }
            i12 = i13 + 28;
        } else {
            i12 = i10 + 64 + i11;
        }
        layoutParams2.leftMargin = AndroidUtilities.dp(i12);
        if (LocaleController.isRTL) {
            f11 = i10 + 64 + i11;
        } else {
            if (checkBoxSquare != null) {
                i14 = 18;
            }
            f11 = i14 + 28;
        }
        layoutParams2.rightMargin = AndroidUtilities.dp(f11);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f23876c.getLayoutParams();
        float f15 = 28.0f;
        if (LocaleController.isRTL) {
            f12 = 28.0f;
        } else {
            f12 = i10 + 64 + i11;
        }
        layoutParams3.leftMargin = AndroidUtilities.dp(f12);
        if (LocaleController.isRTL) {
            f15 = i10 + 64 + i11;
        }
        layoutParams3.rightMargin = AndroidUtilities.dp(f15);
        aq aqVar = this.e;
        if (aqVar != null) {
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) aqVar.getLayoutParams();
            if (LocaleController.isRTL) {
                f13 = 0.0f;
            } else {
                f13 = i10 + 32 + i11;
            }
            layoutParams4.leftMargin = AndroidUtilities.dp(f13);
            if (LocaleController.isRTL) {
                f14 = i10 + 32 + i11;
            }
            layoutParams4.rightMargin = AndroidUtilities.dp(f14);
        }
    }

    public final void c(boolean z10, boolean z11) {
        int i10 = 0;
        aq aqVar = this.e;
        if (aqVar != null) {
            if (aqVar.getVisibility() != 0) {
                aqVar.setVisibility(0);
            }
            aqVar.a(z10, z11);
            return;
        }
        CheckBoxSquare checkBoxSquare = this.f23877f;
        if (checkBoxSquare != null) {
            if (checkBoxSquare.getVisibility() != 0) {
                checkBoxSquare.setVisibility(0);
            }
            checkBoxSquare.a(z10, z11);
            return;
        }
        ImageView imageView = this.h;
        if (imageView != null) {
            if (!z10) {
                i10 = 8;
            }
            imageView.setVisibility(i10);
        }
    }

    public final void d(Object obj, CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        org.telegram.ui.ActionBar.b6 b6Var = this.f23875b;
        if (obj == null && charSequence == null && charSequence2 == null) {
            this.I = null;
            this.H = null;
            this.F = false;
            this.G = null;
            b6Var.l("", false);
            this.f23876c.l("", false);
            this.f23873a.setImageDrawable(null);
            return;
        }
        this.I = charSequence2;
        if (charSequence != null && b6Var != null) {
            try {
                charSequence = Emoji.replaceEmoji(charSequence, b6Var.getPaint().getFontMetricsInt(), false);
            } catch (Exception unused) {
            }
        }
        this.H = charSequence;
        this.F = !(obj instanceof String);
        this.G = obj;
        this.S = z10;
        setWillNotDraw(!z10);
        i(0);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            this.f23875b.invalidate();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (this.V && view == this.f23873a) {
            ag.v.a(canvas, org.telegram.ui.ActionBar.y6.S0, (view.getWidth() / 2.0f) + view.getX(), (view.getHeight() / 2.0f) + view.getY(), view.getHeight());
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e(TLRPC.User user, boolean z10) {
        d(user, null, null, z10);
    }

    public final void f(qk0 qk0Var, CharSequence charSequence, boolean z10) {
        int i10;
        String string;
        Object user;
        boolean z11 = qk0Var.e;
        int i11 = this.P;
        if (z11) {
            int i12 = qk0Var.f42741c;
            if (i12 <= 0 && qk0Var.f42742f) {
                string = LocaleController.getString(R.string.NotificationEnabledAutomatically);
            } else if (i12 <= 0) {
                string = LocaleController.getString(R.string.NotificationEnabled);
            } else {
                string = LocaleController.getString(R.string.NotificationDisabled);
            }
        } else {
            boolean z12 = qk0Var.f42740b;
            int i13 = qk0Var.f42741c;
            int i14 = qk0Var.f42739a;
            boolean z13 = true;
            if (i13 == 3 && i14 != Integer.MAX_VALUE) {
                int currentTime = i14 - ConnectionsManager.getInstance(i11).getCurrentTime();
                if (currentTime <= 0) {
                    if (z12) {
                        string = LocaleController.getString(R.string.NotificationsCustom);
                    } else {
                        string = LocaleController.getString(R.string.NotificationsUnmuted);
                    }
                } else if (currentTime < 3600) {
                    string = LocaleController.formatString("WillUnmuteIn", R.string.WillUnmuteIn, LocaleController.formatPluralString("Minutes", currentTime / 60, new Object[0]));
                } else if (currentTime < 86400) {
                    string = LocaleController.formatString("WillUnmuteIn", R.string.WillUnmuteIn, LocaleController.formatPluralString("Hours", (int) Math.ceil((currentTime / 60.0f) / 60.0f), new Object[0]));
                } else if (currentTime < 31536000) {
                    string = LocaleController.formatString("WillUnmuteIn", R.string.WillUnmuteIn, LocaleController.formatPluralString("Days", (int) Math.ceil(((currentTime / 60.0f) / 60.0f) / 24.0f), new Object[0]));
                } else {
                    string = null;
                }
            } else {
                if (i13 != 0 && i13 != 1) {
                    z13 = false;
                }
                if (z13 && z12) {
                    string = LocaleController.getString(R.string.NotificationsCustom);
                } else {
                    if (z13) {
                        i10 = R.string.NotificationsUnmuted;
                    } else {
                        i10 = R.string.NotificationsMuted;
                    }
                    string = LocaleController.getString(i10);
                }
            }
            if (string == null) {
                string = LocaleController.getString(R.string.NotificationsOff);
            }
            if (qk0Var.f42742f) {
                string = b10.u(string, ", Auto");
            }
        }
        if (DialogObject.isEncryptedDialog(qk0Var.d)) {
            TLRPC.EncryptedChat m10 = org.telegram.messenger.t.m(MessagesController.getInstance(i11), qk0Var.d);
            if (m10 != null && (user = MessagesController.getInstance(i11).getUser(Long.valueOf(m10.user_id))) != null) {
                d(user, charSequence, string, false);
            }
        } else if (DialogObject.isUserDialog(qk0Var.d)) {
            Object user2 = MessagesController.getInstance(i11).getUser(Long.valueOf(qk0Var.d));
            if (user2 != null) {
                d(user2, charSequence, string, z10);
            }
        } else {
            Object chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-qk0Var.d));
            if (chat != null) {
                d(chat, charSequence, string, z10);
            }
        }
    }

    public final void g(int i10, u61 u61Var, boolean z10) {
        CharSequence string;
        CharSequence string2;
        long j10 = u61Var.f33260x;
        if (j10 > 0) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
            String publicUsername = UserObject.getPublicUsername(user);
            if (user != null) {
                if (!TextUtils.isEmpty(publicUsername)) {
                    string2 = b10.j("@", publicUsername);
                } else if (user.bot) {
                    string2 = LocaleController.getString(R.string.Bot);
                } else if (user.contact) {
                    string2 = LocaleController.getString(R.string.FilterContact);
                } else {
                    string2 = LocaleController.getString(R.string.FilterNonContact);
                }
                d(user, null, string2, z10);
                return;
            }
            return;
        }
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
        if (chat != null) {
            if (chat.participants_count != 0) {
                if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                    string = LocaleController.formatPluralStringComma("Subscribers", chat.participants_count);
                } else {
                    string = LocaleController.formatPluralStringComma("Members", chat.participants_count);
                }
            } else if (!ChatObject.isPublic(chat)) {
                if (ChatObject.isChannel(chat) && !chat.megagroup) {
                    string = LocaleController.getString(R.string.ChannelPrivate);
                } else {
                    string = LocaleController.getString(R.string.MegaPrivate);
                }
            } else if (ChatObject.isChannel(chat) && !chat.megagroup) {
                string = LocaleController.getString(R.string.ChannelPublic);
            } else {
                string = LocaleController.getString(R.string.MegaPublic);
            }
            d(chat, null, string, z10);
        }
    }

    public Object getCurrentObject() {
        return this.G;
    }

    public long getDialogId() {
        return this.U;
    }

    public CharSequence getName() {
        return this.f23875b.getText();
    }

    public final void h(int i10, boolean z10) {
        int i11;
        int i12;
        int i13;
        if (i10 > 0) {
            i10 += AndroidUtilities.dp(6.0f);
        }
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i11 = i10;
        } else {
            i11 = 0;
        }
        if (!z11) {
            i12 = i10;
        } else {
            i12 = 0;
        }
        this.f23875b.setPadding(i11, 0, i12, 0);
        if (z10) {
            boolean z12 = LocaleController.isRTL;
            if (z12) {
                i13 = i10;
            } else {
                i13 = 0;
            }
            if (z12) {
                i10 = 0;
            }
            this.f23876c.setPadding(i13, 0, i10, 0);
        }
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final void i(int r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ab.i(int):void");
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        CheckBoxSquare checkBoxSquare = this.f23877f;
        if (checkBoxSquare != null) {
            checkBoxSquare.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addWeakObserver(this, NotificationCenter.emojiLoaded);
        this.f23881w.a();
        this.v.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        this.f23881w.b();
        this.v.b();
        this.T.g();
    }

    @Override
    public void onDraw(Canvas canvas) {
        float dp;
        int i10;
        if (this.S) {
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(68.0f);
            }
            float f7 = dp;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i10 = AndroidUtilities.dp(68.0f);
            } else {
                i10 = 0;
            }
            canvas.drawLine(f7, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.y6.f23479k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        CheckBoxSquare checkBoxSquare = this.f23877f;
        if (checkBoxSquare != null && checkBoxSquare.getVisibility() == 0) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(checkBoxSquare.h);
            accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        } else {
            aq aqVar = this.e;
            if (aqVar != null && aqVar.getVisibility() == 0) {
                accessibilityNodeInfo.setCheckable(true);
                accessibilityNodeInfo.setChecked(aqVar.f26634a.f26091q);
                accessibilityNodeInfo.setClassName("android.widget.CheckBox");
            }
        }
        StringBuilder sb2 = new StringBuilder();
        org.telegram.ui.ActionBar.b6 b6Var = this.f23875b;
        if (b6Var != null) {
            CharSequence text = b6Var.getText();
            if (!TextUtils.isEmpty(text)) {
                sb2.append(text);
            }
        }
        TextView textView = this.f23878n;
        if (textView != null && textView.getVisibility() == 0) {
            CharSequence text2 = textView.getText();
            if (!TextUtils.isEmpty(text2)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(text2);
            }
        }
        org.telegram.ui.ActionBar.b6 b6Var2 = this.f23876c;
        if (b6Var2 != null) {
            CharSequence text3 = b6Var2.getText();
            if (!TextUtils.isEmpty(text3)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(text3);
            }
        }
        if (sb2.length() > 0) {
            accessibilityNodeInfo.setContentDescription(sb2);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (this.W) {
            f7 = 56.0f;
        } else {
            f7 = 58.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7) + (this.S ? 1 : 0), 1073741824));
    }

    public void setAddButtonVisible(boolean z10) {
        int i10;
        TextView textView = this.f23879r;
        if (textView == null) {
            return;
        }
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        textView.setVisibility(i10);
    }

    public void setAvatarPadding(int i10) {
        b(i10, 0);
    }

    public void setCallCellStyle(int i10) {
        int i11;
        float f7;
        float f10;
        int i12;
        float f11;
        int i13;
        float f12;
        float f13;
        float f14;
        this.W = true;
        org.telegram.ui.ActionBar.b6 b6Var = this.f23875b;
        b6Var.setTextSize(15);
        boolean z10 = LocaleController.isRTL;
        int i14 = 3;
        if (z10) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i15 = i11 | 48;
        float f15 = 30.0f;
        if (z10) {
            f7 = 30.0f;
        } else {
            f7 = i10 + 66;
        }
        if (z10) {
            f10 = i10 + 66;
        } else {
            f10 = 30.0f;
        }
        b6Var.setLayoutParams(kb1.h(-1, 20.0f, i15, f7, 10.0f, f10, 0.0f));
        org.telegram.ui.ActionBar.b6 b6Var2 = this.f23876c;
        b6Var2.setTextSize(13);
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        int i16 = i12 | 48;
        if (z11) {
            f11 = 30.0f;
        } else {
            f11 = i10 + 66;
        }
        if (z11) {
            f15 = i10 + 66;
        }
        b6Var2.setLayoutParams(kb1.h(-1, 20.0f, i16, f11, 32.0f, f15, 0.0f));
        int dp = AndroidUtilities.dp(22.0f);
        di.k4 k4Var = this.f23873a;
        k4Var.setRoundRadius(dp);
        boolean z12 = LocaleController.isRTL;
        if (z12) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        int i17 = i13 | 48;
        float f16 = 0.0f;
        if (z12) {
            f12 = 0.0f;
        } else {
            f12 = i10 + 8;
        }
        if (z12) {
            f13 = i10 + 8;
        } else {
            f13 = 0.0f;
        }
        k4Var.setLayoutParams(kb1.h(44, 44.0f, i17, f12, 6.0f, f13, 0.0f));
        aq aqVar = this.e;
        if (aqVar != null) {
            boolean z13 = LocaleController.isRTL;
            if (z13) {
                i14 = 5;
            }
            int i18 = i14 | 48;
            if (z13) {
                f14 = 0.0f;
            } else {
                f14 = i10 + 37;
            }
            if (z13) {
                f16 = i10 + 37;
            }
            aqVar.setLayoutParams(kb1.h(24, 24.0f, i18, f14, 32.0f, f16, 0.0f));
        }
    }

    public void setCheckDisabled(boolean z10) {
        CheckBoxSquare checkBoxSquare = this.f23877f;
        if (checkBoxSquare != null) {
            checkBoxSquare.setDisabled(z10);
        }
    }

    public void setCloseIcon(View.OnClickListener onClickListener) {
        float f7;
        float f10;
        if (onClickListener == null) {
            ImageView imageView = this.f23882x;
            if (imageView != null) {
                removeView(imageView);
                this.f23882x = null;
                return;
            }
            return;
        }
        if (this.f23882x == null) {
            ImageView imageView2 = new ImageView(getContext());
            this.f23882x = imageView2;
            imageView2.setScaleType(ImageView.ScaleType.CENTER);
            kb1.b(this.f23882x);
            this.f23882x.setImageResource(R.drawable.ic_close_white);
            ImageView imageView3 = this.f23882x;
            int i10 = org.telegram.ui.ActionBar.y6.A6;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            org.telegram.ui.ActionBar.u6 u6Var = this.f23883y;
            org.telegram.ui.ActionBar.f7.t(imageView3, i10, u6Var, mode);
            ImageView imageView4 = this.f23882x;
            int i11 = org.telegram.ui.ActionBar.y6.f23449i6;
            int i12 = 5;
            org.telegram.ui.ActionBar.f7.R(imageView4, org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.w0(i11, u6Var), 5, -1), null, org.telegram.ui.ActionBar.f7.N(i11), u6Var);
            ImageView imageView5 = this.f23882x;
            boolean z10 = LocaleController.isRTL;
            if (z10) {
                i12 = 3;
            }
            int i13 = i12 | 16;
            if (z10) {
                f7 = 14.0f;
            } else {
                f7 = 0.0f;
            }
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = 14.0f;
            }
            addView(imageView5, kb1.h(30, 30.0f, i13, f7, 0.0f, f10, 0.0f));
        }
        this.f23882x.setOnClickListener(onClickListener);
    }

    public void setCurrentId(int i10) {
        this.J = i10;
    }

    public void setNameTypeface(Typeface typeface) {
        this.f23875b.setTypeface(typeface);
    }

    public void setQuery(String str) {
        this.L = str;
        i(0);
    }

    public void setSelfAsSavedMessages(boolean z10) {
        this.K = z10;
    }

    @Override
    public final void updateColors() {
        try {
            int i10 = this.Q;
            int i11 = this.R;
            org.telegram.ui.ActionBar.u6 u6Var = this.f23883y;
            if (!this.f23874a0) {
                this.Q = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23749y6, u6Var);
                this.R = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.il, u6Var);
            }
            org.telegram.ui.ActionBar.b6 b6Var = this.f23876c;
            if (b6Var != null) {
                int textColor = b6Var.getTextColor();
                if (textColor == i11 && i11 != i10) {
                    b6Var.setTextColor(this.R);
                } else if (textColor == i10) {
                    b6Var.setTextColor(this.Q);
                }
            }
            di.k4 k4Var = this.f23873a;
            if (k4Var != null) {
                k4Var.invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public ab(int i10, int i11, Context context, org.telegram.ui.ActionBar.u6 u6Var, boolean z10, boolean z11) {
        super(context);
        int i12;
        int i13;
        float f7;
        this.P = UserConfig.selectedAccount;
        this.T = new q6(this);
        this.f23883y = u6Var;
        if (z11) {
            TextView textView = new TextView(context);
            this.f23879r = textView;
            textView.setGravity(17);
            org.telegram.messenger.t.r(textView, org.telegram.ui.ActionBar.y6.Sh, u6Var, 1, 14.0f);
            textView.setBackground(org.telegram.ui.ActionBar.o6.f(new float[]{14.0f}, org.telegram.ui.ActionBar.y6.Oh));
            textView.setPadding(org.telegram.ui.d3.h(17.0f, R.string.Add, textView), 0, AndroidUtilities.dp(17.0f), 0);
            boolean z12 = LocaleController.isRTL;
            addView(textView, kb1.h(-2, 28.0f, (z12 ? 3 : 5) | 48, z12 ? 14.0f : 0.0f, 15.0f, z12 ? 0.0f : 14.0f, 0.0f));
            i12 = (int) Math.ceil((textView.getPaint().measureText(textView.getText().toString()) + AndroidUtilities.dp(48.0f)) / AndroidUtilities.density);
        } else {
            i12 = 0;
        }
        this.Q = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23749y6, u6Var);
        this.R = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.il, u6Var);
        this.E = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
        di.k4 k4Var = new di.k4(this, context, 3);
        this.f23873a = k4Var;
        k4Var.setRoundRadius(AndroidUtilities.dp(24.0f));
        boolean z13 = LocaleController.isRTL;
        addView(k4Var, kb1.h(46, 46.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : i10 + 7, 6.0f, z13 ? i10 + 7 : 0.0f, 0.0f));
        setClipChildren(false);
        org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(context);
        this.f23875b = b6Var;
        org.telegram.ui.ActionBar.f7.Y(b6Var, org.telegram.ui.ActionBar.y6.G6, u6Var);
        b6Var.setTypeface(AndroidUtilities.bold());
        b6Var.setTextSize(16);
        b6Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z14 = LocaleController.isRTL;
        int i14 = (z14 ? 5 : 3) | 48;
        if (z14) {
            i13 = (i11 == 2 ? 18 : 0) + 28 + i12;
        } else {
            i13 = i10 + 64;
        }
        float f10 = i13;
        if (z14) {
            f7 = i10 + 64;
        } else {
            f7 = (i11 != 2 ? 0 : 18) + 28 + i12;
        }
        addView(b6Var, kb1.h(-1, 20.0f, i14, f10, 10.0f, f7, 0.0f));
        this.v = new org.telegram.ui.Components.r5(AndroidUtilities.dp(20.0f), b6Var);
        this.f23881w = new org.telegram.ui.Components.r5(AndroidUtilities.dp(20.0f), b6Var);
        org.telegram.ui.ActionBar.b6 b6Var2 = new org.telegram.ui.ActionBar.b6(context);
        this.f23876c = b6Var2;
        b6Var2.setTextSize(15);
        b6Var2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z15 = LocaleController.isRTL;
        addView(b6Var2, kb1.h(-1, 20.0f, (z15 ? 5 : 3) | 48, z15 ? i12 + 28 : i10 + 64, 32.0f, z15 ? i10 + 64 : i12 + 28, 0.0f));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int i15 = org.telegram.ui.ActionBar.y6.f23521m6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.f7.t(imageView, i15, u6Var, mode);
        imageView.setVisibility(8);
        boolean z16 = LocaleController.isRTL;
        addView(imageView, kb1.h(-2, -2.0f, (z16 ? 5 : 3) | 16, z16 ? 0.0f : 16.0f, 0.0f, z16 ? 16.0f : 0.0f, 0.0f));
        if (i11 == 2) {
            CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, null, false);
            this.f23877f = checkBoxSquare;
            boolean z17 = LocaleController.isRTL;
            addView(checkBoxSquare, kb1.h(18, 18.0f, (z17 ? 3 : 5) | 16, z17 ? 19.0f : 0.0f, 0.0f, z17 ? 0.0f : 19.0f, 0.0f));
        } else if (i11 == 1) {
            aq aqVar = new aq(context, 21, u6Var);
            this.e = aqVar;
            aqVar.setDrawUnchecked(false);
            aqVar.setDrawBackgroundAsArc(3);
            aqVar.b(-1, org.telegram.ui.ActionBar.y6.f23357d6, org.telegram.ui.ActionBar.y6.f23486k7);
            boolean z18 = LocaleController.isRTL;
            addView(aqVar, kb1.h(24, 24.0f, (z18 ? 5 : 3) | 48, z18 ? 0.0f : i10 + 24, 36.0f, z18 ? i10 + 24 : 0.0f, 0.0f));
        } else if (i11 == 3) {
            ImageView imageView2 = new ImageView(context);
            this.h = imageView2;
            imageView2.setScaleType(scaleType);
            imageView2.setImageResource(R.drawable.account_check);
            org.telegram.ui.ActionBar.f7.t(imageView2, org.telegram.ui.ActionBar.y6.Oh, u6Var, mode);
            imageView2.setVisibility(8);
            boolean z19 = LocaleController.isRTL;
            addView(imageView2, kb1.h(24, 24.0f, (z19 ? 3 : 5) | 16, z19 ? i10 + 10 : 0.0f, 0.0f, z19 ? 0.0f : i10 + 10, 0.0f));
        }
        if (z10) {
            TextView textView2 = new TextView(context);
            this.f23878n = textView2;
            kb1.c(textView2, 0.05f, 1.2f);
            textView2.setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.f23685uh, u6Var);
            textView2.setImportantForAccessibility(2);
            boolean z20 = LocaleController.isRTL;
            addView(textView2, kb1.h(-2, -2.0f, (z20 ? 3 : 5) | 48, z20 ? 23.0f : 0.0f, 10.0f, z20 ? 0.0f : 23.0f, 0.0f));
        }
        setFocusable(true);
    }
}
