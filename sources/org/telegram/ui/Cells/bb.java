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
import org.telegram.messenger.em;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.tp;
import org.telegram.ui.Components.v51;
import org.telegram.ui.vk0;
public class bb extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.Components.g9 E;
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
    public final int Q;
    public final int R;
    public boolean S;
    public final n6 T;
    public long U;
    public boolean V;
    public boolean W;
    public final gg.i1 f18940a;
    public final org.telegram.ui.ActionBar.l5 f18941b;
    public final org.telegram.ui.ActionBar.l5 f18942c;
    public final ImageView d;
    public final tp e;
    public final CheckBoxSquare f18943f;
    public final ImageView h;
    public final TextView f18944n;
    public final TextView f18945r;
    public Drawable f18946s;
    public final org.telegram.ui.Components.n5 v;
    public final org.telegram.ui.Components.n5 f18947w;
    public ImageView f18948x;
    public final org.telegram.ui.ActionBar.f6 f18949y;

    public bb(Context context, int i10, int i11, boolean z10) {
        this(i10, i11, context, null, z10, false);
    }

    public final void a(String str, boolean z10, boolean z11, boolean z12, View.OnClickListener onClickListener) {
        int v02;
        int i10;
        TextView textView = this.f18944n;
        if (textView == null) {
            return;
        }
        org.telegram.ui.ActionBar.f6 f6Var = this.f18949y;
        if (z11) {
            v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Dh, f6Var);
        } else if (z10) {
            v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ch, f6Var);
        } else if (z12 && TextUtils.isEmpty(str)) {
            v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var);
        } else {
            v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18080ld, f6Var);
        }
        textView.setTextColor(v02);
        if (!z10 && !z11) {
            if (z12 && TextUtils.isEmpty(str)) {
                textView.setPadding(r6.b(6.0f, R.string.AddTag, textView), AndroidUtilities.dp(0.66f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f));
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
        float f7;
        float f10;
        int i12;
        float f11;
        float f12;
        float f13;
        int i13;
        gg.i1 i1Var = this.f18940a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) i1Var.getLayoutParams();
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
        i1Var.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f18941b.getLayoutParams();
        boolean z10 = LocaleController.isRTL;
        int i14 = 0;
        CheckBoxSquare checkBoxSquare = this.f18943f;
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
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f18942c.getLayoutParams();
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
        tp tpVar = this.e;
        if (tpVar != null) {
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) tpVar.getLayoutParams();
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
        tp tpVar = this.e;
        if (tpVar != null) {
            if (tpVar.getVisibility() != 0) {
                tpVar.setVisibility(0);
            }
            tpVar.a(z10, z11);
            return;
        }
        CheckBoxSquare checkBoxSquare = this.f18943f;
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
        org.telegram.ui.ActionBar.l5 l5Var = this.f18941b;
        if (obj == null && charSequence == null && charSequence2 == null) {
            this.I = null;
            this.H = null;
            this.F = false;
            this.G = null;
            l5Var.l("", false);
            this.f18942c.l("", false);
            this.f18940a.setImageDrawable(null);
            return;
        }
        this.I = charSequence2;
        if (charSequence != null && l5Var != null) {
            try {
                charSequence = Emoji.replaceEmoji(charSequence, l5Var.getPaint().getFontMetricsInt(), false);
            } catch (Exception unused) {
            }
        }
        this.H = charSequence;
        this.F = !(obj instanceof String);
        this.G = obj;
        this.S = z10;
        setWillNotDraw(!z10);
        j(0);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            this.f18941b.invalidate();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (this.V && view == this.f18940a) {
            xf.p.a(canvas, org.telegram.ui.ActionBar.j6.S0, (view.getWidth() / 2.0f) + view.getX(), (view.getHeight() / 2.0f) + view.getY(), view.getHeight());
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void f(TLRPC.User user, boolean z10) {
        d(user, null, null, z10);
    }

    public final void g(vk0 vk0Var, CharSequence charSequence, boolean z10) {
        int i10;
        String string;
        Object user;
        boolean z11 = vk0Var.e;
        int i11 = this.P;
        if (z11) {
            int i12 = vk0Var.f37581c;
            if (i12 <= 0 && vk0Var.f37582f) {
                string = LocaleController.getString(R.string.NotificationEnabledAutomatically);
            } else if (i12 <= 0) {
                string = LocaleController.getString(R.string.NotificationEnabled);
            } else {
                string = LocaleController.getString(R.string.NotificationDisabled);
            }
        } else {
            boolean z12 = vk0Var.f37580b;
            int i13 = vk0Var.f37581c;
            int i14 = vk0Var.f37579a;
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
            if (vk0Var.f37582f) {
                string = r6.t(string, ", Auto");
            }
        }
        if (DialogObject.isEncryptedDialog(vk0Var.d)) {
            TLRPC.EncryptedChat m10 = org.telegram.messenger.a2.m(MessagesController.getInstance(i11), vk0Var.d);
            if (m10 != null && (user = MessagesController.getInstance(i11).getUser(Long.valueOf(m10.user_id))) != null) {
                d(user, charSequence, string, false);
            }
        } else if (DialogObject.isUserDialog(vk0Var.d)) {
            Object user2 = MessagesController.getInstance(i11).getUser(Long.valueOf(vk0Var.d));
            if (user2 != null) {
                d(user2, charSequence, string, z10);
            }
        } else {
            Object chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-vk0Var.d));
            if (chat != null) {
                d(chat, charSequence, string, z10);
            }
        }
    }

    public int[] getColorKeys() {
        return null;
    }

    public Object getCurrentObject() {
        return this.G;
    }

    public long getDialogId() {
        return this.U;
    }

    public CharSequence getName() {
        return this.f18941b.getText();
    }

    public final void h(int i10, v51 v51Var, boolean z10) {
        CharSequence string;
        CharSequence string2;
        long j3 = v51Var.f27840x;
        if (j3 > 0) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j3));
            String publicUsername = UserObject.getPublicUsername(user);
            if (user != null) {
                if (!TextUtils.isEmpty(publicUsername)) {
                    string2 = r6.i("@", publicUsername);
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
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
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
        this.f18941b.setPadding(i11, 0, i12, 0);
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
            this.f18942c.setPadding(i13, 0, i10, 0);
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        CheckBoxSquare checkBoxSquare = this.f18943f;
        if (checkBoxSquare != null) {
            checkBoxSquare.invalidate();
        }
    }

    public final void j(int r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.bb.j(int):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        this.f18947w.a();
        this.v.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        this.f18947w.b();
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
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i10 = AndroidUtilities.dp(68.0f);
            } else {
                i10 = 0;
            }
            canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f18049k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        CheckBoxSquare checkBoxSquare = this.f18943f;
        if (checkBoxSquare != null && checkBoxSquare.getVisibility() == 0) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(checkBoxSquare.h);
            accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        } else {
            tp tpVar = this.e;
            if (tpVar != null && tpVar.getVisibility() == 0) {
                accessibilityNodeInfo.setCheckable(true);
                accessibilityNodeInfo.setChecked(tpVar.f27462a.f21057q);
                accessibilityNodeInfo.setClassName("android.widget.CheckBox");
            }
        }
        StringBuilder sb2 = new StringBuilder();
        org.telegram.ui.ActionBar.l5 l5Var = this.f18941b;
        if (l5Var != null) {
            CharSequence text = l5Var.getText();
            if (!TextUtils.isEmpty(text)) {
                sb2.append(text);
            }
        }
        TextView textView = this.f18944n;
        if (textView != null && textView.getVisibility() == 0) {
            CharSequence text2 = textView.getText();
            if (!TextUtils.isEmpty(text2)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(text2);
            }
        }
        org.telegram.ui.ActionBar.l5 l5Var2 = this.f18942c;
        if (l5Var2 != null) {
            CharSequence text3 = l5Var2.getText();
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
        TextView textView = this.f18945r;
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
        float f12;
        int i13;
        float f13;
        float f14;
        float f15;
        float f16;
        this.W = true;
        org.telegram.ui.ActionBar.l5 l5Var = this.f18941b;
        l5Var.setTextSize(15);
        boolean z10 = LocaleController.isRTL;
        int i14 = 3;
        if (z10) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i15 = i11 | 48;
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
        l5Var.setLayoutParams(w7.a6.d(-1, 20.0f, i15, f7, 10.0f, f10, 0.0f));
        org.telegram.ui.ActionBar.l5 l5Var2 = this.f18942c;
        l5Var2.setTextSize(13);
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
        l5Var2.setLayoutParams(w7.a6.d(-1, 20.0f, i16, f11, 32.0f, f12, 0.0f));
        int dp = AndroidUtilities.dp(22.0f);
        gg.i1 i1Var = this.f18940a;
        i1Var.setRoundRadius(dp);
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
        i1Var.setLayoutParams(w7.a6.d(44, 44.0f, i17, f13, 6.0f, f14, 0.0f));
        tp tpVar = this.e;
        if (tpVar != null) {
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
            tpVar.setLayoutParams(w7.a6.d(24, 24.0f, i18, f15, 32.0f, f16, 0.0f));
        }
    }

    public void setCheckDisabled(boolean z10) {
        CheckBoxSquare checkBoxSquare = this.f18943f;
        if (checkBoxSquare != null) {
            checkBoxSquare.setDisabled(z10);
        }
    }

    public void setCloseIcon(View.OnClickListener onClickListener) {
        float f7;
        float f10;
        if (onClickListener == null) {
            ImageView imageView = this.f18948x;
            if (imageView != null) {
                removeView(imageView);
                this.f18948x = null;
                return;
            }
            return;
        }
        if (this.f18948x == null) {
            ImageView imageView2 = new ImageView(getContext());
            this.f18948x = imageView2;
            imageView2.setScaleType(ImageView.ScaleType.CENTER);
            w7.c6.a(this.f18948x);
            this.f18948x.setImageResource(R.drawable.ic_close_white);
            ImageView imageView3 = this.f18948x;
            int i10 = org.telegram.ui.ActionBar.j6.A6;
            org.telegram.ui.ActionBar.f6 f6Var = this.f18949y;
            imageView3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), PorterDuff.Mode.SRC_IN));
            ImageView imageView4 = this.f18948x;
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18017i6, f6Var);
            int i11 = 5;
            imageView4.setBackground(org.telegram.ui.ActionBar.j6.f0(v02, 5, -1));
            ImageView imageView5 = this.f18948x;
            boolean z10 = LocaleController.isRTL;
            if (z10) {
                i11 = 3;
            }
            int i12 = i11 | 16;
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
            addView(imageView5, w7.a6.d(30, 30.0f, i12, f7, 0.0f, f10, 0.0f));
        }
        this.f18948x.setOnClickListener(onClickListener);
    }

    public void setCurrentId(int i10) {
        this.J = i10;
    }

    public void setNameTypeface(Typeface typeface) {
        this.f18941b.setTypeface(typeface);
    }

    public void setQuery(String str) {
        this.L = str;
        j(0);
    }

    public void setSelfAsSavedMessages(boolean z10) {
        this.K = z10;
    }

    public bb(int i10, int i11, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10, boolean z11) {
        super(context);
        int i12;
        int i13;
        int i14;
        this.P = UserConfig.selectedAccount;
        this.T = new n6(this);
        this.f18949y = f6Var;
        if (z11) {
            TextView textView = new TextView(context);
            this.f18945r = textView;
            textView.setGravity(17);
            em.x(org.telegram.ui.ActionBar.j6.Sh, f6Var, textView, 1, 14.0f);
            textView.setBackground(org.telegram.ui.ActionBar.z5.f(new float[]{14.0f}, org.telegram.ui.ActionBar.j6.Oh));
            textView.setPadding(r6.b(17.0f, R.string.Add, textView), 0, AndroidUtilities.dp(17.0f), 0);
            boolean z12 = LocaleController.isRTL;
            addView(textView, w7.a6.d(-2, 28.0f, (z12 ? 3 : 5) | 48, z12 ? 14.0f : 0.0f, 15.0f, z12 ? 0.0f : 14.0f, 0.0f));
            i12 = (int) Math.ceil((textView.getPaint().measureText(textView.getText().toString()) + AndroidUtilities.dp(48.0f)) / AndroidUtilities.density);
        } else {
            i12 = 0;
        }
        this.Q = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18306y6, f6Var);
        this.R = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.il, f6Var);
        this.E = new org.telegram.ui.Components.g9((org.telegram.ui.ActionBar.f6) null);
        gg.i1 i1Var = new gg.i1(this, context, 2);
        this.f18940a = i1Var;
        i1Var.setRoundRadius(AndroidUtilities.dp(24.0f));
        boolean z13 = LocaleController.isRTL;
        addView(i1Var, w7.a6.d(46, 46.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : i10 + 7, 6.0f, z13 ? i10 + 7 : 0.0f, 0.0f));
        setClipChildren(false);
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.f18941b = l5Var;
        l5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        l5Var.setTypeface(AndroidUtilities.bold());
        l5Var.setTextSize(16);
        l5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z14 = LocaleController.isRTL;
        int i15 = (z14 ? 5 : 3) | 48;
        if (z14) {
            i13 = (i11 == 2 ? 18 : 0) + 28 + i12;
        } else {
            i13 = i10 + 64;
        }
        float f7 = i13;
        if (z14) {
            i14 = i10 + 64;
        } else {
            i14 = (i11 != 2 ? 0 : 18) + 28 + i12;
        }
        addView(l5Var, w7.a6.d(-1, 20.0f, i15, f7, 10.0f, i14, 0.0f));
        this.v = new org.telegram.ui.Components.n5(AndroidUtilities.dp(20.0f), l5Var);
        this.f18947w = new org.telegram.ui.Components.n5(AndroidUtilities.dp(20.0f), l5Var);
        org.telegram.ui.ActionBar.l5 l5Var2 = new org.telegram.ui.ActionBar.l5(context);
        this.f18942c = l5Var2;
        l5Var2.setTextSize(15);
        l5Var2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z15 = LocaleController.isRTL;
        addView(l5Var2, w7.a6.d(-1, 20.0f, (z15 ? 5 : 3) | 48, z15 ? i12 + 28 : i10 + 64, 32.0f, z15 ? i10 + 64 : i12 + 28, 0.0f));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18091m6, f6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(v02, mode));
        imageView.setVisibility(8);
        boolean z16 = LocaleController.isRTL;
        addView(imageView, w7.a6.d(-2, -2.0f, (z16 ? 5 : 3) | 16, z16 ? 0.0f : 16.0f, 0.0f, z16 ? 16.0f : 0.0f, 0.0f));
        if (i11 == 2) {
            CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, null, false);
            this.f18943f = checkBoxSquare;
            boolean z17 = LocaleController.isRTL;
            addView(checkBoxSquare, w7.a6.d(18, 18.0f, (z17 ? 3 : 5) | 16, z17 ? 19.0f : 0.0f, 0.0f, z17 ? 0.0f : 19.0f, 0.0f));
        } else if (i11 == 1) {
            tp tpVar = new tp(context, 21, f6Var);
            this.e = tpVar;
            tpVar.setDrawUnchecked(false);
            tpVar.setDrawBackgroundAsArc(3);
            tpVar.b(-1, org.telegram.ui.ActionBar.j6.f17928d6, org.telegram.ui.ActionBar.j6.f18056k7);
            boolean z18 = LocaleController.isRTL;
            addView(tpVar, w7.a6.d(24, 24.0f, (z18 ? 5 : 3) | 48, z18 ? 0.0f : i10 + 24, 36.0f, z18 ? i10 + 24 : 0.0f, 0.0f));
        } else if (i11 == 3) {
            ImageView imageView2 = new ImageView(context);
            this.h = imageView2;
            imageView2.setScaleType(scaleType);
            imageView2.setImageResource(R.drawable.account_check);
            imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var), mode));
            imageView2.setVisibility(8);
            boolean z19 = LocaleController.isRTL;
            addView(imageView2, w7.a6.d(24, 24.0f, (z19 ? 3 : 5) | 16, z19 ? i10 + 10 : 0.0f, 0.0f, z19 ? 0.0f : i10 + 10, 0.0f));
        }
        if (z10) {
            TextView textView2 = new TextView(context);
            this.f18944n = textView2;
            w7.c6.b(textView2, 0.05f, 1.2f);
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18247uh, f6Var));
            textView2.setImportantForAccessibility(2);
            boolean z20 = LocaleController.isRTL;
            addView(textView2, w7.a6.d(-2, -2.0f, (z20 ? 3 : 5) | 48, z20 ? 23.0f : 0.0f, 10.0f, z20 ? 0.0f : 23.0f, 0.0f));
        }
        setFocusable(true);
    }

    @Override
    public final void e() {
    }
}
