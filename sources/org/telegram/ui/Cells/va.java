package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.dp;
import org.telegram.ui.Components.l41;
import org.telegram.ui.ek0;
public class va extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.w5 {
    public final org.telegram.ui.Components.z8 A;
    public boolean B;
    public Object C;
    public CharSequence D;
    public CharSequence E;
    public int F;
    public boolean G;
    public String H;
    public String I;
    public int J;
    public TLRPC.FileLocation K;
    public final int L;
    public final int M;
    public final int N;
    public boolean O;
    public final l6 P;
    public long Q;
    public boolean R;
    public boolean S;
    public final ih.d4 f25804a;
    public final org.telegram.ui.ActionBar.h5 f25805b;
    public final org.telegram.ui.ActionBar.h5 f25806c;
    public final ImageView d;
    public final dp f25807e;
    public final CheckBoxSquare f25808f;
    public final ImageView h;
    public final TextView f25809n;
    public final TextView f25810r;
    public Drawable f25811s;
    public final org.telegram.ui.Components.i5 v;
    public final org.telegram.ui.Components.i5 f25812w;
    public ImageView f25813x;
    public final org.telegram.ui.ActionBar.b6 f25814y;

    public va(Context context, int i9, int i10, boolean z10) {
        this(i9, i10, context, null, z10, false);
    }

    public final void a(String str, boolean z10, boolean z11, boolean z12, View.OnClickListener onClickListener) {
        int v02;
        int i9;
        TextView textView = this.f25809n;
        if (textView == null) {
            return;
        }
        org.telegram.ui.ActionBar.b6 b6Var = this.f25814y;
        if (z11) {
            v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Dh, b6Var);
        } else if (z10) {
            v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Ch, b6Var);
        } else if (z12 && TextUtils.isEmpty(str)) {
            v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, b6Var);
        } else {
            v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23151ld, b6Var);
        }
        textView.setTextColor(v02);
        if (!z10 && !z11) {
            if (z12 && TextUtils.isEmpty(str)) {
                textView.setPadding(j2.c(6.0f, R.string.AddTag, textView), AndroidUtilities.dp(0.66f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f));
                textView.setTranslationX(AndroidUtilities.dp(6.0f));
                textView.setBackground(org.telegram.ui.ActionBar.f6.Y(org.telegram.ui.ActionBar.f6.l1(0.12f, v02), AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f)));
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
            textView.setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(32.0f), org.telegram.ui.ActionBar.f6.l1(0.12f, v02)));
            textView.setOnClickListener(onClickListener);
        }
        if (str == null && !z12) {
            i9 = 8;
        } else {
            i9 = 0;
        }
        textView.setVisibility(i9);
        if (str == null && !z12) {
            i(0, false);
            return;
        }
        CharSequence text = textView.getText();
        i((int) Math.ceil(textView.getPaint().measureText(text, 0, text.length())), false);
    }

    public final void b(int i9, int i10) {
        float f10;
        float f11;
        int i11;
        float f12;
        float f13;
        float f14;
        int i12;
        ih.d4 d4Var = this.f25804a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) d4Var.getLayoutParams();
        float f15 = 0.0f;
        if (LocaleController.isRTL) {
            f10 = 0.0f;
        } else {
            f10 = i9 + 7;
        }
        layoutParams.leftMargin = AndroidUtilities.dp(f10);
        if (LocaleController.isRTL) {
            f11 = i9 + 7;
        } else {
            f11 = 0.0f;
        }
        layoutParams.rightMargin = AndroidUtilities.dp(f11);
        d4Var.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f25805b.getLayoutParams();
        boolean z10 = LocaleController.isRTL;
        int i13 = 0;
        CheckBoxSquare checkBoxSquare = this.f25808f;
        if (z10) {
            if (checkBoxSquare != null) {
                i12 = 18;
            } else {
                i12 = 0;
            }
            i11 = i12 + 28;
        } else {
            i11 = i9 + 64 + i10;
        }
        layoutParams2.leftMargin = AndroidUtilities.dp(i11);
        if (LocaleController.isRTL) {
            f12 = i9 + 64 + i10;
        } else {
            if (checkBoxSquare != null) {
                i13 = 18;
            }
            f12 = i13 + 28;
        }
        layoutParams2.rightMargin = AndroidUtilities.dp(f12);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f25806c.getLayoutParams();
        float f16 = 28.0f;
        if (LocaleController.isRTL) {
            f13 = 28.0f;
        } else {
            f13 = i9 + 64 + i10;
        }
        layoutParams3.leftMargin = AndroidUtilities.dp(f13);
        if (LocaleController.isRTL) {
            f16 = i9 + 64 + i10;
        }
        layoutParams3.rightMargin = AndroidUtilities.dp(f16);
        dp dpVar = this.f25807e;
        if (dpVar != null) {
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) dpVar.getLayoutParams();
            if (LocaleController.isRTL) {
                f14 = 0.0f;
            } else {
                f14 = i9 + 32 + i10;
            }
            layoutParams4.leftMargin = AndroidUtilities.dp(f14);
            if (LocaleController.isRTL) {
                f15 = i9 + 32 + i10;
            }
            layoutParams4.rightMargin = AndroidUtilities.dp(f15);
        }
    }

    public final void c(boolean z10, boolean z11) {
        int i9 = 0;
        dp dpVar = this.f25807e;
        if (dpVar != null) {
            if (dpVar.getVisibility() != 0) {
                dpVar.setVisibility(0);
            }
            dpVar.a(z10, z11);
            return;
        }
        CheckBoxSquare checkBoxSquare = this.f25808f;
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
                i9 = 8;
            }
            imageView.setVisibility(i9);
        }
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.emojiLoaded) {
            this.f25805b.invalidate();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (this.R && view == this.f25804a) {
            ff.s.a(canvas, org.telegram.ui.ActionBar.f6.S0, (view.getWidth() / 2.0f) + view.getX(), (view.getHeight() / 2.0f) + view.getY(), view.getHeight());
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e(Object obj, CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        org.telegram.ui.ActionBar.h5 h5Var = this.f25805b;
        if (obj == null && charSequence == null && charSequence2 == null) {
            this.E = null;
            this.D = null;
            this.B = false;
            this.C = null;
            h5Var.l("", false);
            this.f25806c.l("", false);
            this.f25804a.setImageDrawable(null);
            return;
        }
        this.E = charSequence2;
        if (charSequence != null && h5Var != null) {
            try {
                charSequence = Emoji.replaceEmoji(charSequence, h5Var.getPaint().getFontMetricsInt(), false);
            } catch (Exception unused) {
            }
        }
        this.D = charSequence;
        this.B = !(obj instanceof String);
        this.C = obj;
        this.O = z10;
        setWillNotDraw(!z10);
        j(0);
    }

    public final void f(TLRPC.User user, boolean z10) {
        e(user, null, null, z10);
    }

    public final void g(ek0 ek0Var, CharSequence charSequence, boolean z10) {
        int i9;
        String string;
        Object user;
        boolean z11 = ek0Var.f37984e;
        int i10 = this.L;
        if (z11) {
            int i11 = ek0Var.f37983c;
            if (i11 <= 0 && ek0Var.f37985f) {
                string = LocaleController.getString(R.string.NotificationEnabledAutomatically);
            } else if (i11 <= 0) {
                string = LocaleController.getString(R.string.NotificationEnabled);
            } else {
                string = LocaleController.getString(R.string.NotificationDisabled);
            }
        } else {
            boolean z12 = ek0Var.f37982b;
            int i12 = ek0Var.f37983c;
            int i13 = ek0Var.f37981a;
            boolean z13 = true;
            if (i12 == 3 && i13 != Integer.MAX_VALUE) {
                int currentTime = i13 - ConnectionsManager.getInstance(i10).getCurrentTime();
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
                if (i12 != 0 && i12 != 1) {
                    z13 = false;
                }
                if (z13 && z12) {
                    string = LocaleController.getString(R.string.NotificationsCustom);
                } else {
                    if (z13) {
                        i9 = R.string.NotificationsUnmuted;
                    } else {
                        i9 = R.string.NotificationsMuted;
                    }
                    string = LocaleController.getString(i9);
                }
            }
            if (string == null) {
                string = LocaleController.getString(R.string.NotificationsOff);
            }
            if (ek0Var.f37985f) {
                string = ta.b.j(string, ", Auto");
            }
        }
        if (DialogObject.isEncryptedDialog(ek0Var.d)) {
            TLRPC.EncryptedChat l10 = org.telegram.messenger.l0.l(MessagesController.getInstance(i10), ek0Var.d);
            if (l10 != null && (user = MessagesController.getInstance(i10).getUser(Long.valueOf(l10.user_id))) != null) {
                e(user, charSequence, string, false);
            }
        } else if (DialogObject.isUserDialog(ek0Var.d)) {
            Object user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(ek0Var.d));
            if (user2 != null) {
                e(user2, charSequence, string, z10);
            }
        } else {
            Object chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-ek0Var.d));
            if (chat != null) {
                e(chat, charSequence, string, z10);
            }
        }
    }

    public int[] getColorKeys() {
        return null;
    }

    public Object getCurrentObject() {
        return this.C;
    }

    public long getDialogId() {
        return this.Q;
    }

    public CharSequence getName() {
        return this.f25805b.getText();
    }

    public final void h(int i9, l41 l41Var, boolean z10) {
        CharSequence string;
        CharSequence string2;
        long j10 = l41Var.f30350x;
        if (j10 > 0) {
            TLRPC.User user = MessagesController.getInstance(i9).getUser(Long.valueOf(j10));
            String publicUsername = UserObject.getPublicUsername(user);
            if (user != null) {
                if (!TextUtils.isEmpty(publicUsername)) {
                    string2 = ta.b.d("@", publicUsername);
                } else if (user.bot) {
                    string2 = LocaleController.getString(R.string.Bot);
                } else if (user.contact) {
                    string2 = LocaleController.getString(R.string.FilterContact);
                } else {
                    string2 = LocaleController.getString(R.string.FilterNonContact);
                }
                e(user, null, string2, z10);
                return;
            }
            return;
        }
        TLRPC.Chat chat = MessagesController.getInstance(i9).getChat(Long.valueOf(-j10));
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
            e(chat, null, string, z10);
        }
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final void i(int i9, boolean z10) {
        int i10;
        int i11;
        int i12;
        if (i9 > 0) {
            i9 += AndroidUtilities.dp(6.0f);
        }
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i10 = i9;
        } else {
            i10 = 0;
        }
        if (!z11) {
            i11 = i9;
        } else {
            i11 = 0;
        }
        this.f25805b.setPadding(i10, 0, i11, 0);
        if (z10) {
            boolean z12 = LocaleController.isRTL;
            if (z12) {
                i12 = i9;
            } else {
                i12 = 0;
            }
            if (z12) {
                i9 = 0;
            }
            this.f25806c.setPadding(i12, 0, i9, 0);
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        CheckBoxSquare checkBoxSquare = this.f25808f;
        if (checkBoxSquare != null) {
            checkBoxSquare.invalidate();
        }
    }

    public final void j(int r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.va.j(int):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        this.f25812w.a();
        this.v.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        this.f25812w.b();
        this.v.b();
        this.P.g();
    }

    @Override
    public void onDraw(Canvas canvas) {
        float dp;
        int i9;
        if (this.O) {
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(68.0f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i9 = AndroidUtilities.dp(68.0f);
            } else {
                i9 = 0;
            }
            canvas.drawLine(dp, measuredHeight, measuredWidth - i9, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.f6.f23121k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        CheckBoxSquare checkBoxSquare = this.f25808f;
        if (checkBoxSquare != null && checkBoxSquare.getVisibility() == 0) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(checkBoxSquare.h);
            accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        } else {
            dp dpVar = this.f25807e;
            if (dpVar != null && dpVar.getVisibility() == 0) {
                accessibilityNodeInfo.setCheckable(true);
                accessibilityNodeInfo.setChecked(dpVar.f27781a.f26313q);
                accessibilityNodeInfo.setClassName("android.widget.CheckBox");
            }
        }
        StringBuilder sb2 = new StringBuilder();
        org.telegram.ui.ActionBar.h5 h5Var = this.f25805b;
        if (h5Var != null) {
            CharSequence text = h5Var.getText();
            if (!TextUtils.isEmpty(text)) {
                sb2.append(text);
            }
        }
        TextView textView = this.f25809n;
        if (textView != null && textView.getVisibility() == 0) {
            CharSequence text2 = textView.getText();
            if (!TextUtils.isEmpty(text2)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(text2);
            }
        }
        org.telegram.ui.ActionBar.h5 h5Var2 = this.f25806c;
        if (h5Var2 != null) {
            CharSequence text3 = h5Var2.getText();
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
    public final void onMeasure(int i9, int i10) {
        float f10;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824);
        if (this.S) {
            f10 = 56.0f;
        } else {
            f10 = 58.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f10) + (this.O ? 1 : 0), 1073741824));
    }

    public void setAddButtonVisible(boolean z10) {
        int i9;
        TextView textView = this.f25810r;
        if (textView == null) {
            return;
        }
        if (z10) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        textView.setVisibility(i9);
    }

    public void setAvatarPadding(int i9) {
        b(i9, 0);
    }

    public void setCallCellStyle(int i9) {
        int i10;
        float f10;
        float f11;
        int i11;
        float f12;
        float f13;
        int i12;
        float f14;
        float f15;
        float f16;
        float f17;
        this.S = true;
        org.telegram.ui.ActionBar.h5 h5Var = this.f25805b;
        h5Var.setTextSize(15);
        boolean z10 = LocaleController.isRTL;
        int i13 = 3;
        if (z10) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        int i14 = i10 | 48;
        if (z10) {
            f10 = 30.0f;
        } else {
            f10 = i9 + 66;
        }
        if (z10) {
            f11 = i9 + 66;
        } else {
            f11 = 30.0f;
        }
        h5Var.setLayoutParams(g7.e6.d(-1, 20.0f, i14, f10, 10.0f, f11, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var2 = this.f25806c;
        h5Var2.setTextSize(13);
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i15 = i11 | 48;
        if (z11) {
            f12 = 30.0f;
        } else {
            f12 = i9 + 66;
        }
        if (z11) {
            f13 = i9 + 66;
        } else {
            f13 = 30.0f;
        }
        h5Var2.setLayoutParams(g7.e6.d(-1, 20.0f, i15, f12, 32.0f, f13, 0.0f));
        int dp = AndroidUtilities.dp(22.0f);
        ih.d4 d4Var = this.f25804a;
        d4Var.setRoundRadius(dp);
        boolean z12 = LocaleController.isRTL;
        if (z12) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        int i16 = i12 | 48;
        if (z12) {
            f14 = 0.0f;
        } else {
            f14 = i9 + 8;
        }
        if (z12) {
            f15 = i9 + 8;
        } else {
            f15 = 0.0f;
        }
        d4Var.setLayoutParams(g7.e6.d(44, 44.0f, i16, f14, 6.0f, f15, 0.0f));
        dp dpVar = this.f25807e;
        if (dpVar != null) {
            boolean z13 = LocaleController.isRTL;
            if (z13) {
                i13 = 5;
            }
            int i17 = i13 | 48;
            if (z13) {
                f16 = 0.0f;
            } else {
                f16 = i9 + 37;
            }
            if (z13) {
                f17 = i9 + 37;
            } else {
                f17 = 0.0f;
            }
            dpVar.setLayoutParams(g7.e6.d(24, 24.0f, i17, f16, 32.0f, f17, 0.0f));
        }
    }

    public void setCheckDisabled(boolean z10) {
        CheckBoxSquare checkBoxSquare = this.f25808f;
        if (checkBoxSquare != null) {
            checkBoxSquare.setDisabled(z10);
        }
    }

    public void setCloseIcon(View.OnClickListener onClickListener) {
        float f10;
        float f11;
        if (onClickListener == null) {
            ImageView imageView = this.f25813x;
            if (imageView != null) {
                removeView(imageView);
                this.f25813x = null;
                return;
            }
            return;
        }
        if (this.f25813x == null) {
            ImageView imageView2 = new ImageView(getContext());
            this.f25813x = imageView2;
            imageView2.setScaleType(ImageView.ScaleType.CENTER);
            g7.g6.a(this.f25813x);
            this.f25813x.setImageResource(R.drawable.ic_close_white);
            ImageView imageView3 = this.f25813x;
            int i9 = org.telegram.ui.ActionBar.f6.A6;
            org.telegram.ui.ActionBar.b6 b6Var = this.f25814y;
            imageView3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(i9, b6Var), PorterDuff.Mode.SRC_IN));
            ImageView imageView4 = this.f25813x;
            int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23092i6, b6Var);
            int i10 = 5;
            imageView4.setBackground(org.telegram.ui.ActionBar.f6.f0(v02, 5, -1));
            ImageView imageView5 = this.f25813x;
            boolean z10 = LocaleController.isRTL;
            if (z10) {
                i10 = 3;
            }
            int i11 = i10 | 16;
            if (z10) {
                f10 = 14.0f;
            } else {
                f10 = 0.0f;
            }
            if (z10) {
                f11 = 0.0f;
            } else {
                f11 = 14.0f;
            }
            addView(imageView5, g7.e6.d(30, 30.0f, i11, f10, 0.0f, f11, 0.0f));
        }
        this.f25813x.setOnClickListener(onClickListener);
    }

    public void setCurrentId(int i9) {
        this.F = i9;
    }

    public void setNameTypeface(Typeface typeface) {
        this.f25805b.setTypeface(typeface);
    }

    public void setQuery(String str) {
        this.H = str;
        j(0);
    }

    public void setSelfAsSavedMessages(boolean z10) {
        this.G = z10;
    }

    public va(int i9, int i10, Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10, boolean z11) {
        super(context);
        int i11;
        int i12;
        int i13;
        this.L = UserConfig.selectedAccount;
        this.P = new l6(this);
        this.f25814y = b6Var;
        if (z11) {
            TextView textView = new TextView(context);
            this.f25810r = textView;
            textView.setGravity(17);
            j2.o(org.telegram.ui.ActionBar.f6.Sh, b6Var, textView, 1, 14.0f);
            textView.setBackground(org.telegram.ui.ActionBar.v5.f(new float[]{14.0f}, org.telegram.ui.ActionBar.f6.Oh));
            textView.setPadding(j2.c(17.0f, R.string.Add, textView), 0, AndroidUtilities.dp(17.0f), 0);
            boolean z12 = LocaleController.isRTL;
            addView(textView, g7.e6.d(-2, 28.0f, (z12 ? 3 : 5) | 48, z12 ? 14.0f : 0.0f, 15.0f, z12 ? 0.0f : 14.0f, 0.0f));
            i11 = (int) Math.ceil((textView.getPaint().measureText(textView.getText().toString()) + AndroidUtilities.dp(48.0f)) / AndroidUtilities.density);
        } else {
            i11 = 0;
        }
        this.M = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23369y6, b6Var);
        this.N = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.il, b6Var);
        this.A = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
        ih.d4 d4Var = new ih.d4(this, context, 2);
        this.f25804a = d4Var;
        d4Var.setRoundRadius(AndroidUtilities.dp(24.0f));
        boolean z13 = LocaleController.isRTL;
        addView(d4Var, g7.e6.d(46, 46.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : i9 + 7, 6.0f, z13 ? i9 + 7 : 0.0f, 0.0f));
        setClipChildren(false);
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f25805b = h5Var;
        h5Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, b6Var));
        h5Var.setTypeface(AndroidUtilities.bold());
        h5Var.setTextSize(16);
        h5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z14 = LocaleController.isRTL;
        int i14 = (z14 ? 5 : 3) | 48;
        if (z14) {
            i12 = (i10 == 2 ? 18 : 0) + 28 + i11;
        } else {
            i12 = i9 + 64;
        }
        float f10 = i12;
        if (z14) {
            i13 = i9 + 64;
        } else {
            i13 = (i10 != 2 ? 0 : 18) + 28 + i11;
        }
        addView(h5Var, g7.e6.d(-1, 20.0f, i14, f10, 10.0f, i13, 0.0f));
        this.v = new org.telegram.ui.Components.i5(AndroidUtilities.dp(20.0f), h5Var);
        this.f25812w = new org.telegram.ui.Components.i5(AndroidUtilities.dp(20.0f), h5Var);
        org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(context);
        this.f25806c = h5Var2;
        h5Var2.setTextSize(15);
        h5Var2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z15 = LocaleController.isRTL;
        addView(h5Var2, g7.e6.d(-1, 20.0f, (z15 ? 5 : 3) | 48, z15 ? i11 + 28 : i9 + 64, 32.0f, z15 ? i9 + 64 : i11 + 28, 0.0f));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23162m6, b6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(v02, mode));
        imageView.setVisibility(8);
        boolean z16 = LocaleController.isRTL;
        addView(imageView, g7.e6.d(-2, -2.0f, (z16 ? 5 : 3) | 16, z16 ? 0.0f : 16.0f, 0.0f, z16 ? 16.0f : 0.0f, 0.0f));
        if (i10 == 2) {
            CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, null, false);
            this.f25808f = checkBoxSquare;
            boolean z17 = LocaleController.isRTL;
            addView(checkBoxSquare, g7.e6.d(18, 18.0f, (z17 ? 3 : 5) | 16, z17 ? 19.0f : 0.0f, 0.0f, z17 ? 0.0f : 19.0f, 0.0f));
        } else if (i10 == 1) {
            dp dpVar = new dp(context, 21, b6Var);
            this.f25807e = dpVar;
            dpVar.setDrawUnchecked(false);
            dpVar.setDrawBackgroundAsArc(3);
            dpVar.b(-1, org.telegram.ui.ActionBar.f6.f23001d6, org.telegram.ui.ActionBar.f6.f23128k7);
            boolean z18 = LocaleController.isRTL;
            addView(dpVar, g7.e6.d(24, 24.0f, (z18 ? 5 : 3) | 48, z18 ? 0.0f : i9 + 24, 36.0f, z18 ? i9 + 24 : 0.0f, 0.0f));
        } else if (i10 == 3) {
            ImageView imageView2 = new ImageView(context);
            this.h = imageView2;
            imageView2.setScaleType(scaleType);
            imageView2.setImageResource(R.drawable.account_check);
            imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, b6Var), mode));
            imageView2.setVisibility(8);
            boolean z19 = LocaleController.isRTL;
            addView(imageView2, g7.e6.d(24, 24.0f, (z19 ? 3 : 5) | 16, z19 ? i9 + 10 : 0.0f, 0.0f, z19 ? 0.0f : i9 + 10, 0.0f));
        }
        if (z10) {
            TextView textView2 = new TextView(context);
            this.f25809n = textView2;
            g7.g6.b(textView2, 0.05f, 1.2f);
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.uh, b6Var));
            textView2.setImportantForAccessibility(2);
            boolean z20 = LocaleController.isRTL;
            addView(textView2, g7.e6.d(-2, -2.0f, (z20 ? 3 : 5) | 48, z20 ? 23.0f : 0.0f, 10.0f, z20 ? 0.0f : 23.0f, 0.0f));
        }
        setFocusable(true);
    }

    @Override
    public final void d() {
    }
}
