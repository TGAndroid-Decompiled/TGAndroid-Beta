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
import org.telegram.tgnet.TLRPC;
public final class f5 extends LinearLayout {
    public final org.telegram.ui.Components.t9 f24313a;
    public final eg.r f24314b;
    public final TextView f24315c;
    public final org.telegram.ui.Components.e9 d;
    public final org.telegram.ui.ActionBar.c6 f24316e;
    public Drawable f24317f;
    public boolean h;
    public boolean f24318n;

    public f5(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.h = false;
        this.f24316e = c6Var;
        setOrientation(0);
        org.telegram.ui.Components.e9 e9Var = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
        this.d = e9Var;
        e9Var.u(AndroidUtilities.dp(18.0f));
        org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(context);
        this.f24313a = t9Var;
        t9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        addView(t9Var, i7.f6.k(8.0f, 4.0f, 0.0f, 0.0f, 28, 28));
        eg.r rVar = new eg.r(context, 5);
        this.f24314b = rVar;
        rVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        rVar.setTextSize(1, 15.0f);
        rVar.setSingleLine(true);
        rVar.setGravity(3);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        rVar.setEllipsize(truncateAt);
        addView(rVar, i7.f6.t(-2, -2, 16, 12, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f24315c = textView;
        org.telegram.ui.b.m(org.telegram.ui.ActionBar.g6.A6, c6Var, textView, 1, 15.0f);
        textView.setSingleLine(true);
        textView.setGravity(3);
        textView.setEllipsize(truncateAt);
        addView(textView, i7.f6.t(-2, -2, 16, 12, 0, 8, 0));
    }

    public final void a() {
        this.f24314b.setPadding(0, 0, 0, 0);
        Drawable drawable = this.f24317f;
        if (drawable != null) {
            if (drawable instanceof org.telegram.ui.Components.p5) {
                ((org.telegram.ui.Components.p5) drawable).o(this);
            }
            this.f24317f = null;
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f9;
        float f10;
        super.dispatchDraw(canvas);
        Drawable drawable = this.f24317f;
        if (drawable != null) {
            if (drawable instanceof org.telegram.ui.Components.p5) {
                f9 = 24.0f;
            } else {
                f9 = 20.0f;
            }
            int dp = AndroidUtilities.dp(f9);
            if (this.f24317f instanceof org.telegram.ui.Components.p5) {
                f10 = -2.0f;
            } else {
                f10 = 0.0f;
            }
            int dp2 = AndroidUtilities.dp(f10);
            Drawable drawable2 = this.f24317f;
            eg.r rVar = this.f24314b;
            drawable2.setBounds(rVar.getLeft() + dp2, ((rVar.getBottom() + rVar.getTop()) - dp) / 2, rVar.getLeft() + dp2 + dp, ((rVar.getBottom() + rVar.getTop()) + dp) / 2);
            Drawable drawable3 = this.f24317f;
            if (drawable3 instanceof org.telegram.ui.Components.p5) {
                ((org.telegram.ui.Components.p5) drawable3).q(System.currentTimeMillis());
            }
            this.f24317f.draw(canvas);
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f24314b.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f24318n = true;
        Drawable drawable = this.f24317f;
        if (drawable instanceof org.telegram.ui.Components.p5) {
            ((org.telegram.ui.Components.p5) drawable).a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f24318n = false;
        Drawable drawable = this.f24317f;
        if (drawable instanceof org.telegram.ui.Components.p5) {
            ((org.telegram.ui.Components.p5) drawable).o(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.h) {
            canvas.drawLine(AndroidUtilities.dp(52.0f), getHeight() - 1, getWidth() - AndroidUtilities.dp(8.0f), getHeight() - 1, org.telegram.ui.ActionBar.g6.f23183k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(36.0f), 1073741824));
    }

    public void setChat(TLRPC.Chat chat) {
        a();
        eg.r rVar = this.f24314b;
        org.telegram.ui.Components.t9 t9Var = this.f24313a;
        TextView textView = this.f24315c;
        if (chat == null) {
            rVar.setText("");
            textView.setText("");
            t9Var.setImageDrawable(null);
            return;
        }
        org.telegram.ui.Components.e9 e9Var = this.d;
        e9Var.q(chat);
        TLRPC.ChatPhoto chatPhoto = chat.photo;
        if (chatPhoto != null && chatPhoto.photo_small != null) {
            t9Var.e(chat, e9Var);
        } else {
            t9Var.setImageDrawable(e9Var);
        }
        rVar.setText(chat.title);
        String publicUsername = ChatObject.getPublicUsername(chat);
        if (publicUsername != null) {
            textView.setText("@".concat(publicUsername));
        } else {
            textView.setText("");
        }
        t9Var.setVisibility(0);
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
        this.f24313a.setVisibility(4);
        this.f24315c.setVisibility(4);
        String str = keywordResult.emoji;
        if (str != null && str.startsWith("animated_")) {
            try {
                Drawable drawable = this.f24317f;
                if (drawable instanceof org.telegram.ui.Components.p5) {
                    ((org.telegram.ui.Components.p5) drawable).o(this);
                    this.f24317f = null;
                }
                org.telegram.ui.Components.p5 n10 = org.telegram.ui.Components.p5.n(UserConfig.selectedAccount, Long.parseLong(keywordResult.emoji.substring(9)), null, 0);
                this.f24317f = n10;
                if (this.f24318n) {
                    n10.a(this);
                }
            } catch (Exception unused) {
                this.f24317f = Emoji.getEmojiDrawable(keywordResult.emoji);
            }
        } else {
            this.f24317f = Emoji.getEmojiDrawable(keywordResult.emoji);
        }
        Drawable drawable2 = this.f24317f;
        eg.r rVar = this.f24314b;
        if (drawable2 == null) {
            rVar.setPadding(0, 0, 0, 0);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(keywordResult.emoji);
            sb2.append(":  ");
            sb2.append(keywordResult.keyword);
            rVar.setText(sb2);
            return;
        }
        rVar.setPadding(AndroidUtilities.dp(22.0f), 0, 0, 0);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(":  ");
        sb3.append(keywordResult.keyword);
        rVar.setText(sb3);
    }

    public void setIsDarkTheme(boolean z10) {
        TextView textView = this.f24315c;
        eg.r rVar = this.f24314b;
        if (z10) {
            rVar.setTextColor(-1);
            textView.setTextColor(-4473925);
            return;
        }
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        org.telegram.ui.ActionBar.c6 c6Var = this.f24316e;
        rVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A6, c6Var));
    }

    public void setText(String str) {
        a();
        this.f24313a.setVisibility(4);
        this.f24315c.setVisibility(4);
        this.f24314b.setText(str);
    }

    public void setUser(TLRPC.User user) {
        a();
        eg.r rVar = this.f24314b;
        org.telegram.ui.Components.t9 t9Var = this.f24313a;
        TextView textView = this.f24315c;
        if (user == null) {
            rVar.setText("");
            textView.setText("");
            t9Var.setImageDrawable(null);
            return;
        }
        org.telegram.ui.Components.e9 e9Var = this.d;
        e9Var.r(user);
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        if (userProfilePhoto != null && userProfilePhoto.photo_small != null) {
            t9Var.e(user, e9Var);
        } else {
            t9Var.setImageDrawable(e9Var);
        }
        rVar.setText(UserObject.getUserName(user));
        if (UserObject.getPublicUsername(user) != null) {
            textView.setText("@" + UserObject.getPublicUsername(user));
        } else {
            textView.setText("");
        }
        t9Var.setVisibility(0);
        textView.setVisibility(0);
    }
}
