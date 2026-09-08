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
import org.telegram.messenger.wl;
import org.telegram.tgnet.TLRPC;
public final class g5 extends LinearLayout {
    public final org.telegram.ui.Components.x9 f21999a;
    public final bi.c4 f22000b;
    public final TextView f22001c;
    public final org.telegram.ui.Components.i9 d;
    public final org.telegram.ui.ActionBar.f6 f22002e;
    public Drawable f22003f;
    public boolean h;
    public boolean f22004n;

    public g5(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.h = false;
        this.f22002e = f6Var;
        setOrientation(0);
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9((org.telegram.ui.ActionBar.f6) null);
        this.d = i9Var;
        i9Var.u(AndroidUtilities.dp(18.0f));
        org.telegram.ui.Components.x9 x9Var = new org.telegram.ui.Components.x9(context);
        this.f21999a = x9Var;
        x9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        addView(x9Var, w7.x5.k(8.0f, 4.0f, 0.0f, 0.0f, 28, 28));
        bi.c4 c4Var = new bi.c4(context, 6);
        this.f22000b = c4Var;
        c4Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        c4Var.setTextSize(1, 15.0f);
        c4Var.setSingleLine(true);
        c4Var.setGravity(3);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        c4Var.setEllipsize(truncateAt);
        addView(c4Var, w7.x5.t(-2, -2, 16, 12, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f22001c = textView;
        wl.n(org.telegram.ui.ActionBar.j6.A6, f6Var, textView, 1, 15.0f);
        textView.setSingleLine(true);
        textView.setGravity(3);
        textView.setEllipsize(truncateAt);
        addView(textView, w7.x5.t(-2, -2, 16, 12, 0, 8, 0));
    }

    public final void a() {
        this.f22000b.setPadding(0, 0, 0, 0);
        Drawable drawable = this.f22003f;
        if (drawable != null) {
            if (drawable instanceof org.telegram.ui.Components.q5) {
                ((org.telegram.ui.Components.q5) drawable).o(this);
            }
            this.f22003f = null;
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        float f10;
        super.dispatchDraw(canvas);
        Drawable drawable = this.f22003f;
        if (drawable != null) {
            if (drawable instanceof org.telegram.ui.Components.q5) {
                f7 = 24.0f;
            } else {
                f7 = 20.0f;
            }
            int dp = AndroidUtilities.dp(f7);
            if (this.f22003f instanceof org.telegram.ui.Components.q5) {
                f10 = -2.0f;
            } else {
                f10 = 0.0f;
            }
            int dp2 = AndroidUtilities.dp(f10);
            Drawable drawable2 = this.f22003f;
            bi.c4 c4Var = this.f22000b;
            drawable2.setBounds(c4Var.getLeft() + dp2, ((c4Var.getBottom() + c4Var.getTop()) - dp) / 2, c4Var.getLeft() + dp2 + dp, ((c4Var.getBottom() + c4Var.getTop()) + dp) / 2);
            Drawable drawable3 = this.f22003f;
            if (drawable3 instanceof org.telegram.ui.Components.q5) {
                ((org.telegram.ui.Components.q5) drawable3).q(System.currentTimeMillis());
            }
            this.f22003f.draw(canvas);
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f22000b.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f22004n = true;
        Drawable drawable = this.f22003f;
        if (drawable instanceof org.telegram.ui.Components.q5) {
            ((org.telegram.ui.Components.q5) drawable).a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f22004n = false;
        Drawable drawable = this.f22003f;
        if (drawable instanceof org.telegram.ui.Components.q5) {
            ((org.telegram.ui.Components.q5) drawable).o(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.h) {
            canvas.drawLine(AndroidUtilities.dp(52.0f), getHeight() - 1, getWidth() - AndroidUtilities.dp(8.0f), getHeight() - 1, org.telegram.ui.ActionBar.j6.f20812k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(36.0f), 1073741824));
    }

    public void setChat(TLRPC.Chat chat) {
        a();
        bi.c4 c4Var = this.f22000b;
        org.telegram.ui.Components.x9 x9Var = this.f21999a;
        TextView textView = this.f22001c;
        if (chat == null) {
            c4Var.setText("");
            textView.setText("");
            x9Var.setImageDrawable(null);
            return;
        }
        org.telegram.ui.Components.i9 i9Var = this.d;
        i9Var.q(chat);
        TLRPC.ChatPhoto chatPhoto = chat.photo;
        if (chatPhoto != null && chatPhoto.photo_small != null) {
            x9Var.e(chat, i9Var);
        } else {
            x9Var.setImageDrawable(i9Var);
        }
        c4Var.setText(chat.title);
        String publicUsername = ChatObject.getPublicUsername(chat);
        if (publicUsername != null) {
            textView.setText("@".concat(publicUsername));
        } else {
            textView.setText("");
        }
        x9Var.setVisibility(0);
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
        this.f21999a.setVisibility(4);
        this.f22001c.setVisibility(4);
        String str = keywordResult.emoji;
        if (str != null && str.startsWith("animated_")) {
            try {
                Drawable drawable = this.f22003f;
                if (drawable instanceof org.telegram.ui.Components.q5) {
                    ((org.telegram.ui.Components.q5) drawable).o(this);
                    this.f22003f = null;
                }
                org.telegram.ui.Components.q5 n10 = org.telegram.ui.Components.q5.n(UserConfig.selectedAccount, Long.parseLong(keywordResult.emoji.substring(9)), null, 0);
                this.f22003f = n10;
                if (this.f22004n) {
                    n10.a(this);
                }
            } catch (Exception unused) {
                this.f22003f = Emoji.getEmojiDrawable(keywordResult.emoji);
            }
        } else {
            this.f22003f = Emoji.getEmojiDrawable(keywordResult.emoji);
        }
        Drawable drawable2 = this.f22003f;
        bi.c4 c4Var = this.f22000b;
        if (drawable2 == null) {
            c4Var.setPadding(0, 0, 0, 0);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(keywordResult.emoji);
            sb2.append(":  ");
            sb2.append(keywordResult.keyword);
            c4Var.setText(sb2);
            return;
        }
        c4Var.setPadding(AndroidUtilities.dp(22.0f), 0, 0, 0);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(":  ");
        sb3.append(keywordResult.keyword);
        c4Var.setText(sb3);
    }

    public void setIsDarkTheme(boolean z10) {
        TextView textView = this.f22001c;
        bi.c4 c4Var = this.f22000b;
        if (z10) {
            c4Var.setTextColor(-1);
            textView.setTextColor(-4473925);
            return;
        }
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = this.f22002e;
        c4Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A6, f6Var));
    }

    public void setText(String str) {
        a();
        this.f21999a.setVisibility(4);
        this.f22001c.setVisibility(4);
        this.f22000b.setText(str);
    }

    public void setUser(TLRPC.User user) {
        a();
        bi.c4 c4Var = this.f22000b;
        org.telegram.ui.Components.x9 x9Var = this.f21999a;
        TextView textView = this.f22001c;
        if (user == null) {
            c4Var.setText("");
            textView.setText("");
            x9Var.setImageDrawable(null);
            return;
        }
        org.telegram.ui.Components.i9 i9Var = this.d;
        i9Var.r(user);
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        if (userProfilePhoto != null && userProfilePhoto.photo_small != null) {
            x9Var.e(user, i9Var);
        } else {
            x9Var.setImageDrawable(i9Var);
        }
        c4Var.setText(UserObject.getUserName(user));
        if (UserObject.getPublicUsername(user) != null) {
            textView.setText("@" + UserObject.getPublicUsername(user));
        } else {
            textView.setText("");
        }
        x9Var.setVisibility(0);
        textView.setVisibility(0);
    }
}
