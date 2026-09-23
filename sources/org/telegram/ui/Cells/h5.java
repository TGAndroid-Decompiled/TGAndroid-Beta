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
import org.telegram.messenger.ul;
import org.telegram.tgnet.TLRPC;
public final class h5 extends LinearLayout {
    public final org.telegram.ui.Components.w9 f20150a;
    public final ai.p4 f20151b;
    public final TextView f20152c;
    public final org.telegram.ui.Components.h9 d;
    public final org.telegram.ui.ActionBar.d6 e;
    public Drawable f20153f;
    public boolean h;
    public boolean f20154n;

    public h5(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.h = false;
        this.e = d6Var;
        setOrientation(0);
        org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        this.d = h9Var;
        h9Var.u(AndroidUtilities.dp(18.0f));
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.f20150a = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        addView(w9Var, w7.x5.k(8.0f, 4.0f, 0.0f, 0.0f, 28, 28));
        ai.p4 p4Var = new ai.p4(context, 6);
        this.f20151b = p4Var;
        p4Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G6, d6Var));
        p4Var.setTextSize(1, 15.0f);
        p4Var.setSingleLine(true);
        p4Var.setGravity(3);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        p4Var.setEllipsize(truncateAt);
        addView(p4Var, w7.x5.t(-2, -2, 16, 12, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f20152c = textView;
        ul.o(org.telegram.ui.ActionBar.h6.A6, d6Var, textView, 1, 15.0f);
        textView.setSingleLine(true);
        textView.setGravity(3);
        textView.setEllipsize(truncateAt);
        addView(textView, w7.x5.t(-2, -2, 16, 12, 0, 8, 0));
    }

    public final void a() {
        this.f20151b.setPadding(0, 0, 0, 0);
        Drawable drawable = this.f20153f;
        if (drawable != null) {
            if (drawable instanceof org.telegram.ui.Components.q5) {
                ((org.telegram.ui.Components.q5) drawable).o(this);
            }
            this.f20153f = null;
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        float f10;
        super.dispatchDraw(canvas);
        Drawable drawable = this.f20153f;
        if (drawable != null) {
            if (drawable instanceof org.telegram.ui.Components.q5) {
                f7 = 24.0f;
            } else {
                f7 = 20.0f;
            }
            int dp = AndroidUtilities.dp(f7);
            if (this.f20153f instanceof org.telegram.ui.Components.q5) {
                f10 = -2.0f;
            } else {
                f10 = 0.0f;
            }
            int dp2 = AndroidUtilities.dp(f10);
            Drawable drawable2 = this.f20153f;
            ai.p4 p4Var = this.f20151b;
            drawable2.setBounds(p4Var.getLeft() + dp2, ((p4Var.getBottom() + p4Var.getTop()) - dp) / 2, p4Var.getLeft() + dp2 + dp, ((p4Var.getBottom() + p4Var.getTop()) + dp) / 2);
            Drawable drawable3 = this.f20153f;
            if (drawable3 instanceof org.telegram.ui.Components.q5) {
                ((org.telegram.ui.Components.q5) drawable3).q(System.currentTimeMillis());
            }
            this.f20153f.draw(canvas);
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f20151b.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f20154n = true;
        Drawable drawable = this.f20153f;
        if (drawable instanceof org.telegram.ui.Components.q5) {
            ((org.telegram.ui.Components.q5) drawable).a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f20154n = false;
        Drawable drawable = this.f20153f;
        if (drawable instanceof org.telegram.ui.Components.q5) {
            ((org.telegram.ui.Components.q5) drawable).o(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.h) {
            canvas.drawLine(AndroidUtilities.dp(52.0f), getHeight() - 1, getWidth() - AndroidUtilities.dp(8.0f), getHeight() - 1, org.telegram.ui.ActionBar.h6.f18910k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(36.0f), 1073741824));
    }

    public void setChat(TLRPC.Chat chat) {
        a();
        ai.p4 p4Var = this.f20151b;
        org.telegram.ui.Components.w9 w9Var = this.f20150a;
        TextView textView = this.f20152c;
        if (chat == null) {
            p4Var.setText("");
            textView.setText("");
            w9Var.setImageDrawable(null);
            return;
        }
        org.telegram.ui.Components.h9 h9Var = this.d;
        h9Var.q(chat);
        TLRPC.ChatPhoto chatPhoto = chat.photo;
        if (chatPhoto != null && chatPhoto.photo_small != null) {
            w9Var.e(chat, h9Var);
        } else {
            w9Var.setImageDrawable(h9Var);
        }
        p4Var.setText(chat.title);
        String publicUsername = ChatObject.getPublicUsername(chat);
        if (publicUsername != null) {
            textView.setText("@".concat(publicUsername));
        } else {
            textView.setText("");
        }
        w9Var.setVisibility(0);
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
        this.f20150a.setVisibility(4);
        this.f20152c.setVisibility(4);
        String str = keywordResult.emoji;
        if (str != null && str.startsWith("animated_")) {
            try {
                Drawable drawable = this.f20153f;
                if (drawable instanceof org.telegram.ui.Components.q5) {
                    ((org.telegram.ui.Components.q5) drawable).o(this);
                    this.f20153f = null;
                }
                org.telegram.ui.Components.q5 n10 = org.telegram.ui.Components.q5.n(UserConfig.selectedAccount, Long.parseLong(keywordResult.emoji.substring(9)), null, 0);
                this.f20153f = n10;
                if (this.f20154n) {
                    n10.a(this);
                }
            } catch (Exception unused) {
                this.f20153f = Emoji.getEmojiDrawable(keywordResult.emoji);
            }
        } else {
            this.f20153f = Emoji.getEmojiDrawable(keywordResult.emoji);
        }
        Drawable drawable2 = this.f20153f;
        ai.p4 p4Var = this.f20151b;
        if (drawable2 == null) {
            p4Var.setPadding(0, 0, 0, 0);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(keywordResult.emoji);
            sb2.append(":  ");
            sb2.append(keywordResult.keyword);
            p4Var.setText(sb2);
            return;
        }
        p4Var.setPadding(AndroidUtilities.dp(22.0f), 0, 0, 0);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(":  ");
        sb3.append(keywordResult.keyword);
        p4Var.setText(sb3);
    }

    public void setIsDarkTheme(boolean z10) {
        TextView textView = this.f20152c;
        ai.p4 p4Var = this.f20151b;
        if (z10) {
            p4Var.setTextColor(-1);
            textView.setTextColor(-4473925);
            return;
        }
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        org.telegram.ui.ActionBar.d6 d6Var = this.e;
        p4Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(i10, d6Var));
        textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.A6, d6Var));
    }

    public void setText(String str) {
        a();
        this.f20150a.setVisibility(4);
        this.f20152c.setVisibility(4);
        this.f20151b.setText(str);
    }

    public void setUser(TLRPC.User user) {
        a();
        ai.p4 p4Var = this.f20151b;
        org.telegram.ui.Components.w9 w9Var = this.f20150a;
        TextView textView = this.f20152c;
        if (user == null) {
            p4Var.setText("");
            textView.setText("");
            w9Var.setImageDrawable(null);
            return;
        }
        org.telegram.ui.Components.h9 h9Var = this.d;
        h9Var.r(user);
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        if (userProfilePhoto != null && userProfilePhoto.photo_small != null) {
            w9Var.e(user, h9Var);
        } else {
            w9Var.setImageDrawable(h9Var);
        }
        p4Var.setText(UserObject.getUserName(user));
        if (UserObject.getPublicUsername(user) != null) {
            textView.setText("@" + UserObject.getPublicUsername(user));
        } else {
            textView.setText("");
        }
        w9Var.setVisibility(0);
        textView.setVisibility(0);
    }
}
