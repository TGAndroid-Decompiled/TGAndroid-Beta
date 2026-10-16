package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.sk;
import org.telegram.tgnet.TLRPC;
public final class h5 extends LinearLayout {
    public final org.telegram.ui.Components.z9 f20973a;
    public final bi.f4 f20974b;
    public final TextView f20975c;
    public final org.telegram.ui.Components.k9 d;
    public final org.telegram.ui.ActionBar.c6 e;
    public Drawable f20976f;
    public boolean h;
    public boolean f20977n;

    public h5(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.h = false;
        this.e = c6Var;
        setOrientation(0);
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9((org.telegram.ui.ActionBar.c6) null);
        this.d = k9Var;
        k9Var.u(AndroidUtilities.dp(18.0f));
        org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9(context);
        this.f20973a = z9Var;
        z9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        addView(z9Var, w7.z5.k(8.0f, 4.0f, 0.0f, 0.0f, 28, 28));
        bi.f4 f4Var = new bi.f4(context, 6);
        this.f20974b = f4Var;
        f4Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        f4Var.setTextSize(1, 15.0f);
        f4Var.setSingleLine(true);
        f4Var.setGravity(3);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        f4Var.setEllipsize(truncateAt);
        addView(f4Var, w7.z5.t(-2, -2, 16, 12, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f20975c = textView;
        sk.o(org.telegram.ui.ActionBar.g6.A6, c6Var, textView, 1, 15.0f);
        textView.setSingleLine(true);
        textView.setGravity(3);
        textView.setEllipsize(truncateAt);
        addView(textView, w7.z5.t(-2, -2, 16, 12, 0, 8, 0));
    }

    public final void a() {
        this.f20974b.setPadding(0, 0, 0, 0);
        Drawable drawable = this.f20976f;
        if (drawable != null) {
            if (drawable instanceof org.telegram.ui.Components.s5) {
                ((org.telegram.ui.Components.s5) drawable).o(this);
            }
            this.f20976f = null;
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        float f10;
        super.dispatchDraw(canvas);
        Drawable drawable = this.f20976f;
        if (drawable != null) {
            if (drawable instanceof org.telegram.ui.Components.s5) {
                f7 = 24.0f;
            } else {
                f7 = 20.0f;
            }
            int dp = AndroidUtilities.dp(f7);
            if (this.f20976f instanceof org.telegram.ui.Components.s5) {
                f10 = -2.0f;
            } else {
                f10 = 0.0f;
            }
            int dp2 = AndroidUtilities.dp(f10);
            Drawable drawable2 = this.f20976f;
            bi.f4 f4Var = this.f20974b;
            drawable2.setBounds(f4Var.getLeft() + dp2, ((f4Var.getBottom() + f4Var.getTop()) - dp) / 2, f4Var.getLeft() + dp2 + dp, ((f4Var.getBottom() + f4Var.getTop()) + dp) / 2);
            Drawable drawable3 = this.f20976f;
            if (drawable3 instanceof org.telegram.ui.Components.s5) {
                ((org.telegram.ui.Components.s5) drawable3).q(System.currentTimeMillis());
            }
            this.f20976f.draw(canvas);
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f20974b.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f20977n = true;
        Drawable drawable = this.f20976f;
        if (drawable instanceof org.telegram.ui.Components.s5) {
            ((org.telegram.ui.Components.s5) drawable).a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f20977n = false;
        Drawable drawable = this.f20976f;
        if (drawable instanceof org.telegram.ui.Components.s5) {
            ((org.telegram.ui.Components.s5) drawable).o(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.h) {
            canvas.drawLine(AndroidUtilities.dp(52.0f), getHeight() - 1, getWidth() - AndroidUtilities.dp(8.0f), getHeight() - 1, org.telegram.ui.ActionBar.g6.f19722k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(36.0f), 1073741824));
    }

    public void setChat(TLRPC.Chat chat) {
        a();
        bi.f4 f4Var = this.f20974b;
        org.telegram.ui.Components.z9 z9Var = this.f20973a;
        TextView textView = this.f20975c;
        if (chat == null) {
            f4Var.setText("");
            textView.setText("");
            z9Var.setImageDrawable(null);
            return;
        }
        org.telegram.ui.Components.k9 k9Var = this.d;
        k9Var.q(chat);
        TLRPC.ChatPhoto chatPhoto = chat.photo;
        if (chatPhoto != null && chatPhoto.photo_small != null) {
            z9Var.e(chat, k9Var);
        } else {
            z9Var.setImageDrawable(k9Var);
        }
        f4Var.setText(chat.title);
        String publicUsername = ChatObject.getPublicUsername(chat);
        if (publicUsername != null) {
            textView.setText("@".concat(publicUsername));
        } else {
            textView.setText("");
        }
        z9Var.setVisibility(0);
        textView.setVisibility(0);
    }

    public void setDivider(boolean z10) {
        if (z10 != this.h) {
            this.h = z10;
            setWillNotDraw(!z10);
            invalidate();
        }
    }

    public void setEmojiSuggestion(MediaDataController.KeywordResult keywordResult) {
        this.f20973a.setVisibility(4);
        this.f20975c.setVisibility(4);
        String str = keywordResult.emoji;
        if (str != null && str.startsWith("animated_")) {
            try {
                Drawable drawable = this.f20976f;
                if (drawable instanceof org.telegram.ui.Components.s5) {
                    ((org.telegram.ui.Components.s5) drawable).o(this);
                    this.f20976f = null;
                }
                org.telegram.ui.Components.s5 n10 = org.telegram.ui.Components.s5.n(UserConfig.selectedAccount, Long.parseLong(keywordResult.emoji.substring(9)), null, 0);
                this.f20976f = n10;
                if (this.f20977n) {
                    n10.a(this);
                }
            } catch (Exception unused) {
                this.f20976f = Emoji.getEmojiDrawable(keywordResult.emoji);
            }
        } else {
            this.f20976f = Emoji.getEmojiDrawable(keywordResult.emoji);
        }
        Drawable drawable2 = this.f20976f;
        bi.f4 f4Var = this.f20974b;
        if (drawable2 == null) {
            f4Var.setPadding(0, 0, 0, 0);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(keywordResult.emoji);
            sb2.append(":  ");
            sb2.append(keywordResult.keyword);
            f4Var.setText(sb2);
            return;
        }
        f4Var.setPadding(AndroidUtilities.dp(22.0f), 0, 0, 0);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(":  ");
        sb3.append(keywordResult.keyword);
        f4Var.setText(sb3);
    }

    public void setIsDarkTheme(boolean z10) {
        TextView textView = this.f20975c;
        bi.f4 f4Var = this.f20974b;
        if (z10) {
            f4Var.setTextColor(-1);
            textView.setTextColor(-4473925);
            return;
        }
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        org.telegram.ui.ActionBar.c6 c6Var = this.e;
        f4Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(i10, c6Var));
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.A6, c6Var));
    }

    public void setText(String str) {
        a();
        this.f20973a.setVisibility(4);
        this.f20975c.setVisibility(4);
        this.f20974b.setText(str);
    }

    public void setUser(TLRPC.User user) {
        a();
        bi.f4 f4Var = this.f20974b;
        org.telegram.ui.Components.z9 z9Var = this.f20973a;
        TextView textView = this.f20975c;
        if (user == null) {
            f4Var.setText("");
            textView.setText("");
            z9Var.setImageDrawable(null);
            return;
        }
        org.telegram.ui.Components.k9 k9Var = this.d;
        k9Var.r(user);
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        if (userProfilePhoto != null && userProfilePhoto.photo_small != null) {
            z9Var.e(user, k9Var);
        } else {
            z9Var.setImageDrawable(k9Var);
        }
        f4Var.setText(UserObject.getUserName(user));
        if (UserObject.getPublicUsername(user) != null) {
            textView.setText("@" + UserObject.getPublicUsername(user));
        } else {
            textView.setText("");
        }
        z9Var.setVisibility(0);
        textView.setVisibility(0);
    }
}
