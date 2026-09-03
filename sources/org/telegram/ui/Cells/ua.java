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
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.kp;
import org.telegram.ui.lk0;
public class ua extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.Components.z8 B;
    public boolean C;
    public Object D;
    public CharSequence E;
    public CharSequence F;
    public int G;
    public boolean H;
    public String I;
    public String J;
    public int K;
    public TLRPC.FileLocation L;
    public final int M;
    public final int N;
    public final int O;
    public boolean P;
    public final k6 Q;
    public long R;
    public boolean S;
    public boolean T;
    public final nh.y3 f22383a;
    public final org.telegram.ui.ActionBar.k5 f22384b;
    public final org.telegram.ui.ActionBar.k5 f22385c;
    public final ImageView d;
    public final kp e;
    public final CheckBoxSquare f22386f;
    public final ImageView h;
    public final TextView f22387n;
    public final TextView f22388r;
    public Drawable f22389s;
    public final org.telegram.ui.Components.j5 v;
    public final org.telegram.ui.Components.j5 f22390w;
    public ImageView f22391x;
    public final org.telegram.ui.ActionBar.f6 f22392y;

    public ua(Context context, int i10, int i11, boolean z4) {
        this(i10, i11, context, null, z4, false);
    }

    public final void a(String str, boolean z4, boolean z10, boolean z11, View.OnClickListener onClickListener) {
        int v02;
        int i10;
        TextView textView = this.f22387n;
        if (textView == null) {
            return;
        }
        org.telegram.ui.ActionBar.f6 f6Var = this.f22392y;
        if (z10) {
            v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Dh, f6Var);
        } else if (z4) {
            v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ch, f6Var);
        } else if (z11 && TextUtils.isEmpty(str)) {
            v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var);
        } else {
            v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20031ld, f6Var);
        }
        textView.setTextColor(v02);
        if (!z4 && !z10) {
            if (z11 && TextUtils.isEmpty(str)) {
                textView.setPadding(org.telegram.ui.b.e(6.0f, R.string.AddTag, textView), AndroidUtilities.dp(0.66f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f));
                textView.setTranslationX(AndroidUtilities.dp(6.0f));
                textView.setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.l1(0.12f, v02), AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f)));
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
            textView.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(32.0f), org.telegram.ui.ActionBar.j6.l1(0.12f, v02)));
            textView.setOnClickListener(onClickListener);
        }
        if (str == null && !z11) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        textView.setVisibility(i10);
        if (str == null && !z11) {
            i(0, false);
            return;
        }
        CharSequence text = textView.getText();
        i((int) Math.ceil(textView.getPaint().measureText(text, 0, text.length())), false);
    }

    public final void b(int i10, int i11) {
        float f10;
        float f11;
        int i12;
        float f12;
        float f13;
        float f14;
        int i13;
        nh.y3 y3Var = this.f22383a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) y3Var.getLayoutParams();
        float f15 = 0.0f;
        if (LocaleController.isRTL) {
            f10 = 0.0f;
        } else {
            f10 = i10 + 7;
        }
        layoutParams.leftMargin = AndroidUtilities.dp(f10);
        if (LocaleController.isRTL) {
            f11 = i10 + 7;
        } else {
            f11 = 0.0f;
        }
        layoutParams.rightMargin = AndroidUtilities.dp(f11);
        y3Var.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f22384b.getLayoutParams();
        boolean z4 = LocaleController.isRTL;
        int i14 = 0;
        CheckBoxSquare checkBoxSquare = this.f22386f;
        if (z4) {
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
            f12 = i10 + 64 + i11;
        } else {
            if (checkBoxSquare != null) {
                i14 = 18;
            }
            f12 = i14 + 28;
        }
        layoutParams2.rightMargin = AndroidUtilities.dp(f12);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f22385c.getLayoutParams();
        float f16 = 28.0f;
        if (LocaleController.isRTL) {
            f13 = 28.0f;
        } else {
            f13 = i10 + 64 + i11;
        }
        layoutParams3.leftMargin = AndroidUtilities.dp(f13);
        if (LocaleController.isRTL) {
            f16 = i10 + 64 + i11;
        }
        layoutParams3.rightMargin = AndroidUtilities.dp(f16);
        kp kpVar = this.e;
        if (kpVar != null) {
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) kpVar.getLayoutParams();
            if (LocaleController.isRTL) {
                f14 = 0.0f;
            } else {
                f14 = i10 + 32 + i11;
            }
            layoutParams4.leftMargin = AndroidUtilities.dp(f14);
            if (LocaleController.isRTL) {
                f15 = i10 + 32 + i11;
            }
            layoutParams4.rightMargin = AndroidUtilities.dp(f15);
        }
    }

    public final void c(boolean z4, boolean z10) {
        int i10 = 0;
        kp kpVar = this.e;
        if (kpVar != null) {
            if (kpVar.getVisibility() != 0) {
                kpVar.setVisibility(0);
            }
            kpVar.a(z4, z10);
            return;
        }
        CheckBoxSquare checkBoxSquare = this.f22386f;
        if (checkBoxSquare != null) {
            if (checkBoxSquare.getVisibility() != 0) {
                checkBoxSquare.setVisibility(0);
            }
            checkBoxSquare.a(z4, z10);
            return;
        }
        ImageView imageView = this.h;
        if (imageView != null) {
            if (!z4) {
                i10 = 8;
            }
            imageView.setVisibility(i10);
        }
    }

    public final void d(Object obj, CharSequence charSequence, CharSequence charSequence2, boolean z4) {
        org.telegram.ui.ActionBar.k5 k5Var = this.f22384b;
        if (obj == null && charSequence == null && charSequence2 == null) {
            this.F = null;
            this.E = null;
            this.C = false;
            this.D = null;
            k5Var.l("", false);
            this.f22385c.l("", false);
            this.f22383a.setImageDrawable(null);
            return;
        }
        this.F = charSequence2;
        if (charSequence != null && k5Var != null) {
            try {
                charSequence = Emoji.replaceEmoji(charSequence, k5Var.getPaint().getFontMetricsInt(), false);
            } catch (Exception unused) {
            }
        }
        this.E = charSequence;
        this.C = !(obj instanceof String);
        this.D = obj;
        this.P = z4;
        setWillNotDraw(!z4);
        j(0);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            this.f22384b.invalidate();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (this.S && view == this.f22383a) {
            kf.r.a(canvas, org.telegram.ui.ActionBar.j6.S0, (view.getWidth() / 2.0f) + view.getX(), (view.getHeight() / 2.0f) + view.getY(), view.getHeight());
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void f(TLRPC.User user, boolean z4) {
        d(user, null, null, z4);
    }

    public final void g(lk0 lk0Var, CharSequence charSequence, boolean z4) {
        int i10;
        String string;
        Object user;
        boolean z10 = lk0Var.e;
        int i11 = this.M;
        if (z10) {
            int i12 = lk0Var.f35797c;
            if (i12 <= 0 && lk0Var.f35798f) {
                string = LocaleController.getString(R.string.NotificationEnabledAutomatically);
            } else if (i12 <= 0) {
                string = LocaleController.getString(R.string.NotificationEnabled);
            } else {
                string = LocaleController.getString(R.string.NotificationDisabled);
            }
        } else {
            boolean z11 = lk0Var.f35796b;
            int i13 = lk0Var.f35797c;
            int i14 = lk0Var.f35795a;
            boolean z12 = true;
            if (i13 == 3 && i14 != Integer.MAX_VALUE) {
                int currentTime = i14 - ConnectionsManager.getInstance(i11).getCurrentTime();
                if (currentTime <= 0) {
                    if (z11) {
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
                    z12 = false;
                }
                if (z12 && z11) {
                    string = LocaleController.getString(R.string.NotificationsCustom);
                } else {
                    if (z12) {
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
            if (lk0Var.f35798f) {
                string = vh.w2.k(string, ", Auto");
            }
        }
        if (DialogObject.isEncryptedDialog(lk0Var.d)) {
            TLRPC.EncryptedChat n10 = org.telegram.messenger.y3.n(MessagesController.getInstance(i11), lk0Var.d);
            if (n10 != null && (user = MessagesController.getInstance(i11).getUser(Long.valueOf(n10.user_id))) != null) {
                d(user, charSequence, string, false);
            }
        } else if (DialogObject.isUserDialog(lk0Var.d)) {
            Object user2 = MessagesController.getInstance(i11).getUser(Long.valueOf(lk0Var.d));
            if (user2 != null) {
                d(user2, charSequence, string, z4);
            }
        } else {
            Object chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-lk0Var.d));
            if (chat != null) {
                d(chat, charSequence, string, z4);
            }
        }
    }

    public int[] getColorKeys() {
        return null;
    }

    public Object getCurrentObject() {
        return this.D;
    }

    public long getDialogId() {
        return this.R;
    }

    public CharSequence getName() {
        return this.f22384b.getText();
    }

    public final void h(int i10, i51 i51Var, boolean z4) {
        CharSequence string;
        CharSequence string2;
        long j10 = i51Var.f25596x;
        if (j10 > 0) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
            String publicUsername = UserObject.getPublicUsername(user);
            if (user != null) {
                if (!TextUtils.isEmpty(publicUsername)) {
                    string2 = vh.w2.e("@", publicUsername);
                } else if (user.bot) {
                    string2 = LocaleController.getString(R.string.Bot);
                } else if (user.contact) {
                    string2 = LocaleController.getString(R.string.FilterContact);
                } else {
                    string2 = LocaleController.getString(R.string.FilterNonContact);
                }
                d(user, null, string2, z4);
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
            d(chat, null, string, z4);
        }
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final void i(int i10, boolean z4) {
        int i11;
        int i12;
        int i13;
        if (i10 > 0) {
            i10 += AndroidUtilities.dp(6.0f);
        }
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i11 = i10;
        } else {
            i11 = 0;
        }
        if (!z10) {
            i12 = i10;
        } else {
            i12 = 0;
        }
        this.f22384b.setPadding(i11, 0, i12, 0);
        if (z4) {
            boolean z11 = LocaleController.isRTL;
            if (z11) {
                i13 = i10;
            } else {
                i13 = 0;
            }
            if (z11) {
                i10 = 0;
            }
            this.f22385c.setPadding(i13, 0, i10, 0);
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        CheckBoxSquare checkBoxSquare = this.f22386f;
        if (checkBoxSquare != null) {
            checkBoxSquare.invalidate();
        }
    }

    public final void j(int r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ua.j(int):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        this.f22390w.a();
        this.v.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        this.f22390w.b();
        this.v.b();
        this.Q.g();
    }

    @Override
    public void onDraw(Canvas canvas) {
        float dp;
        int i10;
        if (this.P) {
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
            canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f20000k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        CheckBoxSquare checkBoxSquare = this.f22386f;
        if (checkBoxSquare != null && checkBoxSquare.getVisibility() == 0) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(checkBoxSquare.h);
            accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        } else {
            kp kpVar = this.e;
            if (kpVar != null && kpVar.getVisibility() == 0) {
                accessibilityNodeInfo.setCheckable(true);
                accessibilityNodeInfo.setChecked(kpVar.f26377a.f22938q);
                accessibilityNodeInfo.setClassName("android.widget.CheckBox");
            }
        }
        StringBuilder sb = new StringBuilder();
        org.telegram.ui.ActionBar.k5 k5Var = this.f22384b;
        if (k5Var != null) {
            CharSequence text = k5Var.getText();
            if (!TextUtils.isEmpty(text)) {
                sb.append(text);
            }
        }
        TextView textView = this.f22387n;
        if (textView != null && textView.getVisibility() == 0) {
            CharSequence text2 = textView.getText();
            if (!TextUtils.isEmpty(text2)) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(text2);
            }
        }
        org.telegram.ui.ActionBar.k5 k5Var2 = this.f22385c;
        if (k5Var2 != null) {
            CharSequence text3 = k5Var2.getText();
            if (!TextUtils.isEmpty(text3)) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(text3);
            }
        }
        if (sb.length() > 0) {
            accessibilityNodeInfo.setContentDescription(sb);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f10;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (this.T) {
            f10 = 56.0f;
        } else {
            f10 = 58.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f10) + (this.P ? 1 : 0), 1073741824));
    }

    public void setAddButtonVisible(boolean z4) {
        int i10;
        TextView textView = this.f22388r;
        if (textView == null) {
            return;
        }
        if (z4) {
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
        float f10;
        float f11;
        int i12;
        float f12;
        float f13;
        int i13;
        float f14;
        float f15;
        float f16;
        float f17;
        this.T = true;
        org.telegram.ui.ActionBar.k5 k5Var = this.f22384b;
        k5Var.setTextSize(15);
        boolean z4 = LocaleController.isRTL;
        int i14 = 3;
        if (z4) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i15 = i11 | 48;
        if (z4) {
            f10 = 30.0f;
        } else {
            f10 = i10 + 66;
        }
        if (z4) {
            f11 = i10 + 66;
        } else {
            f11 = 30.0f;
        }
        k5Var.setLayoutParams(k7.b6.d(-1, 20.0f, i15, f10, 10.0f, f11, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var2 = this.f22385c;
        k5Var2.setTextSize(13);
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        int i16 = i12 | 48;
        if (z10) {
            f12 = 30.0f;
        } else {
            f12 = i10 + 66;
        }
        if (z10) {
            f13 = i10 + 66;
        } else {
            f13 = 30.0f;
        }
        k5Var2.setLayoutParams(k7.b6.d(-1, 20.0f, i16, f12, 32.0f, f13, 0.0f));
        int dp = AndroidUtilities.dp(22.0f);
        nh.y3 y3Var = this.f22383a;
        y3Var.setRoundRadius(dp);
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        int i17 = i13 | 48;
        if (z11) {
            f14 = 0.0f;
        } else {
            f14 = i10 + 8;
        }
        if (z11) {
            f15 = i10 + 8;
        } else {
            f15 = 0.0f;
        }
        y3Var.setLayoutParams(k7.b6.d(44, 44.0f, i17, f14, 6.0f, f15, 0.0f));
        kp kpVar = this.e;
        if (kpVar != null) {
            boolean z12 = LocaleController.isRTL;
            if (z12) {
                i14 = 5;
            }
            int i18 = i14 | 48;
            if (z12) {
                f16 = 0.0f;
            } else {
                f16 = i10 + 37;
            }
            if (z12) {
                f17 = i10 + 37;
            } else {
                f17 = 0.0f;
            }
            kpVar.setLayoutParams(k7.b6.d(24, 24.0f, i18, f16, 32.0f, f17, 0.0f));
        }
    }

    public void setCheckDisabled(boolean z4) {
        CheckBoxSquare checkBoxSquare = this.f22386f;
        if (checkBoxSquare != null) {
            checkBoxSquare.setDisabled(z4);
        }
    }

    public void setCloseIcon(View.OnClickListener onClickListener) {
        float f10;
        float f11;
        if (onClickListener == null) {
            ImageView imageView = this.f22391x;
            if (imageView != null) {
                removeView(imageView);
                this.f22391x = null;
                return;
            }
            return;
        }
        if (this.f22391x == null) {
            ImageView imageView2 = new ImageView(getContext());
            this.f22391x = imageView2;
            imageView2.setScaleType(ImageView.ScaleType.CENTER);
            k7.d6.a(this.f22391x);
            this.f22391x.setImageResource(R.drawable.ic_close_white);
            ImageView imageView3 = this.f22391x;
            int i10 = org.telegram.ui.ActionBar.j6.A6;
            org.telegram.ui.ActionBar.f6 f6Var = this.f22392y;
            imageView3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), PorterDuff.Mode.SRC_IN));
            ImageView imageView4 = this.f22391x;
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19971i6, f6Var);
            int i11 = 5;
            imageView4.setBackground(org.telegram.ui.ActionBar.j6.f0(v02, 5, -1));
            ImageView imageView5 = this.f22391x;
            boolean z4 = LocaleController.isRTL;
            if (z4) {
                i11 = 3;
            }
            int i12 = i11 | 16;
            if (z4) {
                f10 = 14.0f;
            } else {
                f10 = 0.0f;
            }
            if (z4) {
                f11 = 0.0f;
            } else {
                f11 = 14.0f;
            }
            addView(imageView5, k7.b6.d(30, 30.0f, i12, f10, 0.0f, f11, 0.0f));
        }
        this.f22391x.setOnClickListener(onClickListener);
    }

    public void setCurrentId(int i10) {
        this.G = i10;
    }

    public void setNameTypeface(Typeface typeface) {
        this.f22384b.setTypeface(typeface);
    }

    public void setQuery(String str) {
        this.I = str;
        j(0);
    }

    public void setSelfAsSavedMessages(boolean z4) {
        this.H = z4;
    }

    public ua(int i10, int i11, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z4, boolean z10) {
        super(context);
        int i12;
        int i13;
        int i14;
        this.M = UserConfig.selectedAccount;
        this.Q = new k6(this);
        this.f22392y = f6Var;
        if (z10) {
            TextView textView = new TextView(context);
            this.f22388r = textView;
            textView.setGravity(17);
            org.telegram.ui.b.w(org.telegram.ui.ActionBar.j6.Sh, f6Var, textView, 1, 14.0f);
            textView.setBackground(org.telegram.ui.ActionBar.z5.f(new float[]{14.0f}, org.telegram.ui.ActionBar.j6.Oh));
            textView.setPadding(org.telegram.ui.b.e(17.0f, R.string.Add, textView), 0, AndroidUtilities.dp(17.0f), 0);
            boolean z11 = LocaleController.isRTL;
            addView(textView, k7.b6.d(-2, 28.0f, (z11 ? 3 : 5) | 48, z11 ? 14.0f : 0.0f, 15.0f, z11 ? 0.0f : 14.0f, 0.0f));
            i12 = (int) Math.ceil((textView.getPaint().measureText(textView.getText().toString()) + AndroidUtilities.dp(48.0f)) / AndroidUtilities.density);
        } else {
            i12 = 0;
        }
        this.N = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20256y6, f6Var);
        this.O = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.il, f6Var);
        this.B = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
        nh.y3 y3Var = new nh.y3(this, context, 2);
        this.f22383a = y3Var;
        y3Var.setRoundRadius(AndroidUtilities.dp(24.0f));
        boolean z12 = LocaleController.isRTL;
        addView(y3Var, k7.b6.d(46, 46.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : i10 + 7, 6.0f, z12 ? i10 + 7 : 0.0f, 0.0f));
        setClipChildren(false);
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.f22384b = k5Var;
        k5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        k5Var.setTypeface(AndroidUtilities.bold());
        k5Var.setTextSize(16);
        k5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z13 = LocaleController.isRTL;
        int i15 = (z13 ? 5 : 3) | 48;
        if (z13) {
            i13 = (i11 == 2 ? 18 : 0) + 28 + i12;
        } else {
            i13 = i10 + 64;
        }
        float f10 = i13;
        if (z13) {
            i14 = i10 + 64;
        } else {
            i14 = (i11 != 2 ? 0 : 18) + 28 + i12;
        }
        addView(k5Var, k7.b6.d(-1, 20.0f, i15, f10, 10.0f, i14, 0.0f));
        this.v = new org.telegram.ui.Components.j5(AndroidUtilities.dp(20.0f), k5Var);
        this.f22390w = new org.telegram.ui.Components.j5(AndroidUtilities.dp(20.0f), k5Var);
        org.telegram.ui.ActionBar.k5 k5Var2 = new org.telegram.ui.ActionBar.k5(context);
        this.f22385c = k5Var2;
        k5Var2.setTextSize(15);
        k5Var2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z14 = LocaleController.isRTL;
        addView(k5Var2, k7.b6.d(-1, 20.0f, (z14 ? 5 : 3) | 48, z14 ? i12 + 28 : i10 + 64, 32.0f, z14 ? i10 + 64 : i12 + 28, 0.0f));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20042m6, f6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(v02, mode));
        imageView.setVisibility(8);
        boolean z15 = LocaleController.isRTL;
        addView(imageView, k7.b6.d(-2, -2.0f, (z15 ? 5 : 3) | 16, z15 ? 0.0f : 16.0f, 0.0f, z15 ? 16.0f : 0.0f, 0.0f));
        if (i11 == 2) {
            CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, null, false);
            this.f22386f = checkBoxSquare;
            boolean z16 = LocaleController.isRTL;
            addView(checkBoxSquare, k7.b6.d(18, 18.0f, (z16 ? 3 : 5) | 16, z16 ? 19.0f : 0.0f, 0.0f, z16 ? 0.0f : 19.0f, 0.0f));
        } else if (i11 == 1) {
            kp kpVar = new kp(context, 21, f6Var);
            this.e = kpVar;
            kpVar.setDrawUnchecked(false);
            kpVar.setDrawBackgroundAsArc(3);
            kpVar.b(-1, org.telegram.ui.ActionBar.j6.f19881d6, org.telegram.ui.ActionBar.j6.f20007k7);
            boolean z17 = LocaleController.isRTL;
            addView(kpVar, k7.b6.d(24, 24.0f, (z17 ? 5 : 3) | 48, z17 ? 0.0f : i10 + 24, 36.0f, z17 ? i10 + 24 : 0.0f, 0.0f));
        } else if (i11 == 3) {
            ImageView imageView2 = new ImageView(context);
            this.h = imageView2;
            imageView2.setScaleType(scaleType);
            imageView2.setImageResource(R.drawable.account_check);
            imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var), mode));
            imageView2.setVisibility(8);
            boolean z18 = LocaleController.isRTL;
            addView(imageView2, k7.b6.d(24, 24.0f, (z18 ? 3 : 5) | 16, z18 ? i10 + 10 : 0.0f, 0.0f, z18 ? 0.0f : i10 + 10, 0.0f));
        }
        if (z4) {
            TextView textView2 = new TextView(context);
            this.f22387n = textView2;
            k7.d6.b(textView2, 0.05f, 1.2f);
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20193uh, f6Var));
            textView2.setImportantForAccessibility(2);
            boolean z19 = LocaleController.isRTL;
            addView(textView2, k7.b6.d(-2, -2.0f, (z19 ? 3 : 5) | 48, z19 ? 23.0f : 0.0f, 10.0f, z19 ? 0.0f : 23.0f, 0.0f));
        }
        setFocusable(true);
    }

    @Override
    public final void e() {
    }
}
