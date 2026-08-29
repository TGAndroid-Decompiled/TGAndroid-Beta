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
import org.telegram.ui.Components.hp;
import org.telegram.ui.Components.w41;
import org.telegram.ui.bk0;
public class sa extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.x5 {
    public final org.telegram.ui.Components.e9 A;
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
    public final j6 P;
    public long Q;
    public boolean R;
    public boolean S;
    public final lh.y3 f25674a;
    public final org.telegram.ui.ActionBar.h5 f25675b;
    public final org.telegram.ui.ActionBar.h5 f25676c;
    public final ImageView d;
    public final hp f25677e;
    public final CheckBoxSquare f25678f;
    public final ImageView h;
    public final TextView f25679n;
    public final TextView f25680r;
    public Drawable f25681s;
    public final org.telegram.ui.Components.n5 v;
    public final org.telegram.ui.Components.n5 f25682w;
    public ImageView f25683x;
    public final org.telegram.ui.ActionBar.c6 f25684y;

    public sa(Context context, int i10, int i11, boolean z10) {
        this(i10, i11, context, null, z10, false);
    }

    public final void a(String str, boolean z10, boolean z11, boolean z12, View.OnClickListener onClickListener) {
        int v02;
        int i10;
        TextView textView = this.f25679n;
        if (textView == null) {
            return;
        }
        org.telegram.ui.ActionBar.c6 c6Var = this.f25684y;
        if (z11) {
            v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Dh, c6Var);
        } else if (z10) {
            v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Ch, c6Var);
        } else if (z12 && TextUtils.isEmpty(str)) {
            v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var);
        } else {
            v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23212ld, c6Var);
        }
        textView.setTextColor(v02);
        if (!z10 && !z11) {
            if (z12 && TextUtils.isEmpty(str)) {
                textView.setPadding(org.telegram.ui.b.e(6.0f, R.string.AddTag, textView), AndroidUtilities.dp(0.66f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f));
                textView.setTranslationX(AndroidUtilities.dp(6.0f));
                textView.setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.l1(0.12f, v02), AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f)));
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
            textView.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(32.0f), org.telegram.ui.ActionBar.g6.l1(0.12f, v02)));
            textView.setOnClickListener(onClickListener);
        }
        if (str == null && !z12) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        textView.setVisibility(i10);
        if (str == null && !z12) {
            i(0, false);
            return;
        }
        CharSequence text = textView.getText();
        i((int) Math.ceil(textView.getPaint().measureText(text, 0, text.length())), false);
    }

    public final void b(int i10, int i11) {
        float f9;
        float f10;
        int i12;
        float f11;
        float f12;
        float f13;
        int i13;
        lh.y3 y3Var = this.f25674a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) y3Var.getLayoutParams();
        float f14 = 0.0f;
        if (LocaleController.isRTL) {
            f9 = 0.0f;
        } else {
            f9 = i10 + 7;
        }
        layoutParams.leftMargin = AndroidUtilities.dp(f9);
        if (LocaleController.isRTL) {
            f10 = i10 + 7;
        } else {
            f10 = 0.0f;
        }
        layoutParams.rightMargin = AndroidUtilities.dp(f10);
        y3Var.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f25675b.getLayoutParams();
        boolean z10 = LocaleController.isRTL;
        int i14 = 0;
        CheckBoxSquare checkBoxSquare = this.f25678f;
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
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f25676c.getLayoutParams();
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
        hp hpVar = this.f25677e;
        if (hpVar != null) {
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) hpVar.getLayoutParams();
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
        hp hpVar = this.f25677e;
        if (hpVar != null) {
            if (hpVar.getVisibility() != 0) {
                hpVar.setVisibility(0);
            }
            hpVar.a(z10, z11);
            return;
        }
        CheckBoxSquare checkBoxSquare = this.f25678f;
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
        org.telegram.ui.ActionBar.h5 h5Var = this.f25675b;
        if (obj == null && charSequence == null && charSequence2 == null) {
            this.E = null;
            this.D = null;
            this.B = false;
            this.C = null;
            h5Var.l("", false);
            this.f25676c.l("", false);
            this.f25674a.setImageDrawable(null);
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

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            this.f25675b.invalidate();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (this.R && view == this.f25674a) {
            jf.r.a(canvas, org.telegram.ui.ActionBar.g6.S0, (view.getWidth() / 2.0f) + view.getX(), (view.getHeight() / 2.0f) + view.getY(), view.getHeight());
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void f(TLRPC.User user, boolean z10) {
        d(user, null, null, z10);
    }

    public final void g(bk0 bk0Var, CharSequence charSequence, boolean z10) {
        int i10;
        String string;
        Object user;
        boolean z11 = bk0Var.f36822e;
        int i11 = this.L;
        if (z11) {
            int i12 = bk0Var.f36821c;
            if (i12 <= 0 && bk0Var.f36823f) {
                string = LocaleController.getString(R.string.NotificationEnabledAutomatically);
            } else if (i12 <= 0) {
                string = LocaleController.getString(R.string.NotificationEnabled);
            } else {
                string = LocaleController.getString(R.string.NotificationDisabled);
            }
        } else {
            boolean z12 = bk0Var.f36820b;
            int i13 = bk0Var.f36821c;
            int i14 = bk0Var.f36819a;
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
            if (bk0Var.f36823f) {
                string = u3.c.k(string, ", Auto");
            }
        }
        if (DialogObject.isEncryptedDialog(bk0Var.d)) {
            TLRPC.EncryptedChat p10 = org.telegram.messenger.x3.p(MessagesController.getInstance(i11), bk0Var.d);
            if (p10 != null && (user = MessagesController.getInstance(i11).getUser(Long.valueOf(p10.user_id))) != null) {
                d(user, charSequence, string, false);
            }
        } else if (DialogObject.isUserDialog(bk0Var.d)) {
            Object user2 = MessagesController.getInstance(i11).getUser(Long.valueOf(bk0Var.d));
            if (user2 != null) {
                d(user2, charSequence, string, z10);
            }
        } else {
            Object chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-bk0Var.d));
            if (chat != null) {
                d(chat, charSequence, string, z10);
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
        return this.f25675b.getText();
    }

    public final void h(int i10, w41 w41Var, boolean z10) {
        CharSequence string;
        CharSequence string2;
        long j10 = w41Var.f34311x;
        if (j10 > 0) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
            String publicUsername = UserObject.getPublicUsername(user);
            if (user != null) {
                if (!TextUtils.isEmpty(publicUsername)) {
                    string2 = u3.c.e("@", publicUsername);
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

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final void i(int i10, boolean z10) {
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
        this.f25675b.setPadding(i11, 0, i12, 0);
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
            this.f25676c.setPadding(i13, 0, i10, 0);
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        CheckBoxSquare checkBoxSquare = this.f25678f;
        if (checkBoxSquare != null) {
            checkBoxSquare.invalidate();
        }
    }

    public final void j(int r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.sa.j(int):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        this.f25682w.a();
        this.v.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        this.f25682w.b();
        this.v.b();
        this.P.g();
    }

    @Override
    public void onDraw(Canvas canvas) {
        float dp;
        int i10;
        if (this.O) {
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(68.0f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i10 = AndroidUtilities.dp(68.0f);
            } else {
                i10 = 0;
            }
            canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.g6.f23183k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        CheckBoxSquare checkBoxSquare = this.f25678f;
        if (checkBoxSquare != null && checkBoxSquare.getVisibility() == 0) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(checkBoxSquare.h);
            accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        } else {
            hp hpVar = this.f25677e;
            if (hpVar != null && hpVar.getVisibility() == 0) {
                accessibilityNodeInfo.setCheckable(true);
                accessibilityNodeInfo.setChecked(hpVar.f29211a.f26324q);
                accessibilityNodeInfo.setClassName("android.widget.CheckBox");
            }
        }
        StringBuilder sb2 = new StringBuilder();
        org.telegram.ui.ActionBar.h5 h5Var = this.f25675b;
        if (h5Var != null) {
            CharSequence text = h5Var.getText();
            if (!TextUtils.isEmpty(text)) {
                sb2.append(text);
            }
        }
        TextView textView = this.f25679n;
        if (textView != null && textView.getVisibility() == 0) {
            CharSequence text2 = textView.getText();
            if (!TextUtils.isEmpty(text2)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(text2);
            }
        }
        org.telegram.ui.ActionBar.h5 h5Var2 = this.f25676c;
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
    public final void onMeasure(int i10, int i11) {
        float f9;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (this.S) {
            f9 = 56.0f;
        } else {
            f9 = 58.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f9) + (this.O ? 1 : 0), 1073741824));
    }

    public void setAddButtonVisible(boolean z10) {
        int i10;
        TextView textView = this.f25680r;
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
        float f9;
        float f10;
        int i12;
        float f11;
        float f12;
        int i13;
        float f13;
        float f14;
        float f15;
        float f16;
        this.S = true;
        org.telegram.ui.ActionBar.h5 h5Var = this.f25675b;
        h5Var.setTextSize(15);
        boolean z10 = LocaleController.isRTL;
        int i14 = 3;
        if (z10) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i15 = i11 | 48;
        if (z10) {
            f9 = 30.0f;
        } else {
            f9 = i10 + 66;
        }
        if (z10) {
            f10 = i10 + 66;
        } else {
            f10 = 30.0f;
        }
        h5Var.setLayoutParams(i7.f6.d(-1, 20.0f, i15, f9, 10.0f, f10, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var2 = this.f25676c;
        h5Var2.setTextSize(13);
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
            f12 = i10 + 66;
        } else {
            f12 = 30.0f;
        }
        h5Var2.setLayoutParams(i7.f6.d(-1, 20.0f, i16, f11, 32.0f, f12, 0.0f));
        int dp = AndroidUtilities.dp(22.0f);
        lh.y3 y3Var = this.f25674a;
        y3Var.setRoundRadius(dp);
        boolean z12 = LocaleController.isRTL;
        if (z12) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        int i17 = i13 | 48;
        if (z12) {
            f13 = 0.0f;
        } else {
            f13 = i10 + 8;
        }
        if (z12) {
            f14 = i10 + 8;
        } else {
            f14 = 0.0f;
        }
        y3Var.setLayoutParams(i7.f6.d(44, 44.0f, i17, f13, 6.0f, f14, 0.0f));
        hp hpVar = this.f25677e;
        if (hpVar != null) {
            boolean z13 = LocaleController.isRTL;
            if (z13) {
                i14 = 5;
            }
            int i18 = i14 | 48;
            if (z13) {
                f15 = 0.0f;
            } else {
                f15 = i10 + 37;
            }
            if (z13) {
                f16 = i10 + 37;
            } else {
                f16 = 0.0f;
            }
            hpVar.setLayoutParams(i7.f6.d(24, 24.0f, i18, f15, 32.0f, f16, 0.0f));
        }
    }

    public void setCheckDisabled(boolean z10) {
        CheckBoxSquare checkBoxSquare = this.f25678f;
        if (checkBoxSquare != null) {
            checkBoxSquare.setDisabled(z10);
        }
    }

    public void setCloseIcon(View.OnClickListener onClickListener) {
        float f9;
        float f10;
        if (onClickListener == null) {
            ImageView imageView = this.f25683x;
            if (imageView != null) {
                removeView(imageView);
                this.f25683x = null;
                return;
            }
            return;
        }
        if (this.f25683x == null) {
            ImageView imageView2 = new ImageView(getContext());
            this.f25683x = imageView2;
            imageView2.setScaleType(ImageView.ScaleType.CENTER);
            i7.h6.a(this.f25683x);
            this.f25683x.setImageResource(R.drawable.ic_close_white);
            ImageView imageView3 = this.f25683x;
            int i10 = org.telegram.ui.ActionBar.g6.A6;
            org.telegram.ui.ActionBar.c6 c6Var = this.f25684y;
            imageView3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), PorterDuff.Mode.SRC_IN));
            ImageView imageView4 = this.f25683x;
            int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23152i6, c6Var);
            int i11 = 5;
            imageView4.setBackground(org.telegram.ui.ActionBar.g6.f0(v02, 5, -1));
            ImageView imageView5 = this.f25683x;
            boolean z10 = LocaleController.isRTL;
            if (z10) {
                i11 = 3;
            }
            int i12 = i11 | 16;
            if (z10) {
                f9 = 14.0f;
            } else {
                f9 = 0.0f;
            }
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = 14.0f;
            }
            addView(imageView5, i7.f6.d(30, 30.0f, i12, f9, 0.0f, f10, 0.0f));
        }
        this.f25683x.setOnClickListener(onClickListener);
    }

    public void setCurrentId(int i10) {
        this.F = i10;
    }

    public void setNameTypeface(Typeface typeface) {
        this.f25675b.setTypeface(typeface);
    }

    public void setQuery(String str) {
        this.H = str;
        j(0);
    }

    public void setSelfAsSavedMessages(boolean z10) {
        this.G = z10;
    }

    public sa(int i10, int i11, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, boolean z11) {
        super(context);
        int i12;
        int i13;
        int i14;
        this.L = UserConfig.selectedAccount;
        this.P = new j6(this);
        this.f25684y = c6Var;
        if (z11) {
            TextView textView = new TextView(context);
            this.f25680r = textView;
            textView.setGravity(17);
            org.telegram.ui.b.w(org.telegram.ui.ActionBar.g6.Sh, c6Var, textView, 1, 14.0f);
            textView.setBackground(org.telegram.ui.ActionBar.w5.f(new float[]{14.0f}, org.telegram.ui.ActionBar.g6.Oh));
            textView.setPadding(org.telegram.ui.b.e(17.0f, R.string.Add, textView), 0, AndroidUtilities.dp(17.0f), 0);
            boolean z12 = LocaleController.isRTL;
            addView(textView, i7.f6.d(-2, 28.0f, (z12 ? 3 : 5) | 48, z12 ? 14.0f : 0.0f, 15.0f, z12 ? 0.0f : 14.0f, 0.0f));
            i12 = (int) Math.ceil((textView.getPaint().measureText(textView.getText().toString()) + AndroidUtilities.dp(48.0f)) / AndroidUtilities.density);
        } else {
            i12 = 0;
        }
        this.M = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23433y6, c6Var);
        this.N = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.il, c6Var);
        this.A = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
        lh.y3 y3Var = new lh.y3(this, context, 2);
        this.f25674a = y3Var;
        y3Var.setRoundRadius(AndroidUtilities.dp(24.0f));
        boolean z13 = LocaleController.isRTL;
        addView(y3Var, i7.f6.d(46, 46.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : i10 + 7, 6.0f, z13 ? i10 + 7 : 0.0f, 0.0f));
        setClipChildren(false);
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f25675b = h5Var;
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        h5Var.setTypeface(AndroidUtilities.bold());
        h5Var.setTextSize(16);
        h5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z14 = LocaleController.isRTL;
        int i15 = (z14 ? 5 : 3) | 48;
        if (z14) {
            i13 = (i11 == 2 ? 18 : 0) + 28 + i12;
        } else {
            i13 = i10 + 64;
        }
        float f9 = i13;
        if (z14) {
            i14 = i10 + 64;
        } else {
            i14 = (i11 != 2 ? 0 : 18) + 28 + i12;
        }
        addView(h5Var, i7.f6.d(-1, 20.0f, i15, f9, 10.0f, i14, 0.0f));
        this.v = new org.telegram.ui.Components.n5(AndroidUtilities.dp(20.0f), h5Var);
        this.f25682w = new org.telegram.ui.Components.n5(AndroidUtilities.dp(20.0f), h5Var);
        org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(context);
        this.f25676c = h5Var2;
        h5Var2.setTextSize(15);
        h5Var2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z15 = LocaleController.isRTL;
        addView(h5Var2, i7.f6.d(-1, 20.0f, (z15 ? 5 : 3) | 48, z15 ? i12 + 28 : i10 + 64, 32.0f, z15 ? i10 + 64 : i12 + 28, 0.0f));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23223m6, c6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(v02, mode));
        imageView.setVisibility(8);
        boolean z16 = LocaleController.isRTL;
        addView(imageView, i7.f6.d(-2, -2.0f, (z16 ? 5 : 3) | 16, z16 ? 0.0f : 16.0f, 0.0f, z16 ? 16.0f : 0.0f, 0.0f));
        if (i11 == 2) {
            CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, null, false);
            this.f25678f = checkBoxSquare;
            boolean z17 = LocaleController.isRTL;
            addView(checkBoxSquare, i7.f6.d(18, 18.0f, (z17 ? 3 : 5) | 16, z17 ? 19.0f : 0.0f, 0.0f, z17 ? 0.0f : 19.0f, 0.0f));
        } else if (i11 == 1) {
            hp hpVar = new hp(context, 21, c6Var);
            this.f25677e = hpVar;
            hpVar.setDrawUnchecked(false);
            hpVar.setDrawBackgroundAsArc(3);
            hpVar.b(-1, org.telegram.ui.ActionBar.g6.f23062d6, org.telegram.ui.ActionBar.g6.f23190k7);
            boolean z18 = LocaleController.isRTL;
            addView(hpVar, i7.f6.d(24, 24.0f, (z18 ? 5 : 3) | 48, z18 ? 0.0f : i10 + 24, 36.0f, z18 ? i10 + 24 : 0.0f, 0.0f));
        } else if (i11 == 3) {
            ImageView imageView2 = new ImageView(context);
            this.h = imageView2;
            imageView2.setScaleType(scaleType);
            imageView2.setImageResource(R.drawable.account_check);
            imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var), mode));
            imageView2.setVisibility(8);
            boolean z19 = LocaleController.isRTL;
            addView(imageView2, i7.f6.d(24, 24.0f, (z19 ? 3 : 5) | 16, z19 ? i10 + 10 : 0.0f, 0.0f, z19 ? 0.0f : i10 + 10, 0.0f));
        }
        if (z10) {
            TextView textView2 = new TextView(context);
            this.f25679n = textView2;
            i7.h6.b(textView2, 0.05f, 1.2f);
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23376uh, c6Var));
            textView2.setImportantForAccessibility(2);
            boolean z20 = LocaleController.isRTL;
            addView(textView2, i7.f6.d(-2, -2.0f, (z20 ? 3 : 5) | 48, z20 ? 23.0f : 0.0f, 10.0f, z20 ? 0.0f : 23.0f, 0.0f));
        }
        setFocusable(true);
    }

    @Override
    public final void e() {
    }
}
