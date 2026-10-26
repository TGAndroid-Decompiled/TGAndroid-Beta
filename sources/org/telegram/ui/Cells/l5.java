package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.md;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gb1;
public final class l5 extends LinearLayout {
    public final org.telegram.ui.Components.y9 f24381a;
    public final md f24382b;
    public final TextView f24383c;
    public final org.telegram.ui.Components.j9 d;
    public final org.telegram.ui.ActionBar.u6 e;
    public Drawable f24384f;
    public boolean h;
    public boolean f24385n;

    public l5(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.h = false;
        this.e = u6Var;
        setOrientation(0);
        org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
        this.d = j9Var;
        j9Var.u(AndroidUtilities.dp(18.0f));
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.f24381a = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        addView(y9Var, gb1.o(8.0f, 4.0f, 0.0f, 0.0f, 28, 28));
        md mdVar = new md(context, 7);
        this.f24382b = mdVar;
        org.telegram.ui.ActionBar.f7.V(mdVar, org.telegram.ui.ActionBar.y6.G6, u6Var);
        mdVar.setTextSize(1, 15.0f);
        mdVar.setSingleLine(true);
        mdVar.setGravity(3);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        mdVar.setEllipsize(truncateAt);
        addView(mdVar, gb1.x(-2, -2, 16, 12, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f24383c = textView;
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.A6, u6Var);
        textView.setTextSize(1, 15.0f);
        textView.setSingleLine(true);
        textView.setGravity(3);
        textView.setEllipsize(truncateAt);
        addView(textView, gb1.x(-2, -2, 16, 12, 0, 8, 0));
    }

    public final void a() {
        this.f24382b.setPadding(0, 0, 0, 0);
        Drawable drawable = this.f24384f;
        if (drawable != null) {
            if (drawable instanceof org.telegram.ui.Components.t5) {
                ((org.telegram.ui.Components.t5) drawable).o(this);
            }
            this.f24384f = null;
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        float f10;
        super.dispatchDraw(canvas);
        Drawable drawable = this.f24384f;
        if (drawable != null) {
            if (drawable instanceof org.telegram.ui.Components.t5) {
                f7 = 24.0f;
            } else {
                f7 = 20.0f;
            }
            int dp = AndroidUtilities.dp(f7);
            if (this.f24384f instanceof org.telegram.ui.Components.t5) {
                f10 = -2.0f;
            } else {
                f10 = 0.0f;
            }
            int dp2 = AndroidUtilities.dp(f10);
            Drawable drawable2 = this.f24384f;
            md mdVar = this.f24382b;
            drawable2.setBounds(mdVar.getLeft() + dp2, ((mdVar.getBottom() + mdVar.getTop()) - dp) / 2, mdVar.getLeft() + dp2 + dp, ((mdVar.getBottom() + mdVar.getTop()) + dp) / 2);
            Drawable drawable3 = this.f24384f;
            if (drawable3 instanceof org.telegram.ui.Components.t5) {
                ((org.telegram.ui.Components.t5) drawable3).q(System.currentTimeMillis());
            }
            this.f24384f.draw(canvas);
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f24382b.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f24385n = true;
        Drawable drawable = this.f24384f;
        if (drawable instanceof org.telegram.ui.Components.t5) {
            ((org.telegram.ui.Components.t5) drawable).a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f24385n = false;
        Drawable drawable = this.f24384f;
        if (drawable instanceof org.telegram.ui.Components.t5) {
            ((org.telegram.ui.Components.t5) drawable).o(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.h) {
            canvas.drawLine(AndroidUtilities.dp(52.0f), getHeight() - 1, getWidth() - AndroidUtilities.dp(8.0f), getHeight() - 1, org.telegram.ui.ActionBar.y6.f23478k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(36.0f), 1073741824));
    }

    public void setChat(TLRPC.Chat chat) {
        a();
        md mdVar = this.f24382b;
        org.telegram.ui.Components.y9 y9Var = this.f24381a;
        TextView textView = this.f24383c;
        if (chat == null) {
            mdVar.setText("");
            textView.setText("");
            y9Var.setImageDrawable(null);
            return;
        }
        org.telegram.ui.Components.j9 j9Var = this.d;
        j9Var.q(chat);
        TLRPC.ChatPhoto chatPhoto = chat.photo;
        if (chatPhoto != null && chatPhoto.photo_small != null) {
            y9Var.f(chat, j9Var);
        } else {
            y9Var.setImageDrawable(j9Var);
        }
        mdVar.setText(chat.title);
        String publicUsername = ChatObject.getPublicUsername(chat);
        if (publicUsername != null) {
            textView.setText("@".concat(publicUsername));
        } else {
            textView.setText("");
        }
        y9Var.setVisibility(0);
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
        this.f24381a.setVisibility(4);
        this.f24383c.setVisibility(4);
        String str = keywordResult.emoji;
        if (str != null && str.startsWith("animated_")) {
            try {
                Drawable drawable = this.f24384f;
                if (drawable instanceof org.telegram.ui.Components.t5) {
                    ((org.telegram.ui.Components.t5) drawable).o(this);
                    this.f24384f = null;
                }
                org.telegram.ui.Components.t5 n10 = org.telegram.ui.Components.t5.n(UserConfig.selectedAccount, Long.parseLong(keywordResult.emoji.substring(9)), null, 0);
                this.f24384f = n10;
                if (this.f24385n) {
                    n10.a(this);
                }
            } catch (Exception unused) {
                this.f24384f = Emoji.getEmojiDrawable(keywordResult.emoji);
            }
        } else {
            this.f24384f = Emoji.getEmojiDrawable(keywordResult.emoji);
        }
        Drawable drawable2 = this.f24384f;
        md mdVar = this.f24382b;
        if (drawable2 == null) {
            mdVar.setPadding(0, 0, 0, 0);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(keywordResult.emoji);
            sb2.append(":  ");
            sb2.append(keywordResult.keyword);
            mdVar.setText(sb2);
            return;
        }
        mdVar.setPadding(AndroidUtilities.dp(22.0f), 0, 0, 0);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(":  ");
        sb3.append(keywordResult.keyword);
        mdVar.setText(sb3);
    }

    public void setIsDarkTheme(boolean z10) {
        TextView textView = this.f24383c;
        md mdVar = this.f24382b;
        if (z10) {
            org.telegram.ui.ActionBar.f7.r(mdVar);
            org.telegram.ui.ActionBar.f7.r(textView);
            mdVar.setTextColor(-1);
            textView.setTextColor(-4473925);
            return;
        }
        int i10 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.u6 u6Var = this.e;
        org.telegram.ui.ActionBar.f7.V(mdVar, i10, u6Var);
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.A6, u6Var);
    }

    public void setText(String str) {
        a();
        this.f24381a.setVisibility(4);
        this.f24383c.setVisibility(4);
        this.f24382b.setText(str);
    }

    public void setUser(TLRPC.User user) {
        a();
        md mdVar = this.f24382b;
        org.telegram.ui.Components.y9 y9Var = this.f24381a;
        TextView textView = this.f24383c;
        if (user == null) {
            mdVar.setText("");
            textView.setText("");
            y9Var.setImageDrawable(null);
            return;
        }
        org.telegram.ui.Components.j9 j9Var = this.d;
        j9Var.r(user);
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        if (userProfilePhoto != null && userProfilePhoto.photo_small != null) {
            y9Var.f(user, j9Var);
        } else {
            y9Var.setImageDrawable(j9Var);
        }
        mdVar.setText(UserObject.getUserName(user));
        if (UserObject.getPublicUsername(user) != null) {
            textView.setText("@" + UserObject.getPublicUsername(user));
        } else {
            textView.setText("");
        }
        y9Var.setVisibility(0);
        textView.setVisibility(0);
    }
}
