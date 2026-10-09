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
import org.telegram.messenger.bi;
import org.telegram.tgnet.TLRPC;
public final class h5 extends LinearLayout {
    public final org.telegram.ui.Components.y9 f22198a;
    public final ai.q4 f22199b;
    public final TextView f22200c;
    public final org.telegram.ui.Components.j9 d;
    public final org.telegram.ui.ActionBar.e6 f22201e;
    public Drawable f22202f;
    public boolean h;
    public boolean f22203n;

    public h5(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.h = false;
        this.f22201e = e6Var;
        setOrientation(0);
        org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.e6) null);
        this.d = j9Var;
        j9Var.u(AndroidUtilities.dp(18.0f));
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.f22198a = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        addView(y9Var, w7.x5.k(8.0f, 4.0f, 0.0f, 0.0f, 28, 28));
        ai.q4 q4Var = new ai.q4(context, 6);
        this.f22199b = q4Var;
        q4Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, e6Var));
        q4Var.setTextSize(1, 15.0f);
        q4Var.setSingleLine(true);
        q4Var.setGravity(3);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        q4Var.setEllipsize(truncateAt);
        addView(q4Var, w7.x5.t(-2, -2, 16, 12, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f22200c = textView;
        bi.o(org.telegram.ui.ActionBar.i6.A6, e6Var, textView, 1, 15.0f);
        textView.setSingleLine(true);
        textView.setGravity(3);
        textView.setEllipsize(truncateAt);
        addView(textView, w7.x5.t(-2, -2, 16, 12, 0, 8, 0));
    }

    public final void a() {
        this.f22199b.setPadding(0, 0, 0, 0);
        Drawable drawable = this.f22202f;
        if (drawable != null) {
            if (drawable instanceof org.telegram.ui.Components.s5) {
                ((org.telegram.ui.Components.s5) drawable).o(this);
            }
            this.f22202f = null;
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        float f10;
        super.dispatchDraw(canvas);
        Drawable drawable = this.f22202f;
        if (drawable != null) {
            if (drawable instanceof org.telegram.ui.Components.s5) {
                f7 = 24.0f;
            } else {
                f7 = 20.0f;
            }
            int dp = AndroidUtilities.dp(f7);
            if (this.f22202f instanceof org.telegram.ui.Components.s5) {
                f10 = -2.0f;
            } else {
                f10 = 0.0f;
            }
            int dp2 = AndroidUtilities.dp(f10);
            Drawable drawable2 = this.f22202f;
            ai.q4 q4Var = this.f22199b;
            drawable2.setBounds(q4Var.getLeft() + dp2, ((q4Var.getBottom() + q4Var.getTop()) - dp) / 2, q4Var.getLeft() + dp2 + dp, ((q4Var.getBottom() + q4Var.getTop()) + dp) / 2);
            Drawable drawable3 = this.f22202f;
            if (drawable3 instanceof org.telegram.ui.Components.s5) {
                ((org.telegram.ui.Components.s5) drawable3).q(System.currentTimeMillis());
            }
            this.f22202f.draw(canvas);
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f22199b.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f22203n = true;
        Drawable drawable = this.f22202f;
        if (drawable instanceof org.telegram.ui.Components.s5) {
            ((org.telegram.ui.Components.s5) drawable).a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f22203n = false;
        Drawable drawable = this.f22202f;
        if (drawable instanceof org.telegram.ui.Components.s5) {
            ((org.telegram.ui.Components.s5) drawable).o(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.h) {
            canvas.drawLine(AndroidUtilities.dp(52.0f), getHeight() - 1, getWidth() - AndroidUtilities.dp(8.0f), getHeight() - 1, org.telegram.ui.ActionBar.i6.f20919k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(36.0f), 1073741824));
    }

    public void setChat(TLRPC.Chat chat) {
        a();
        ai.q4 q4Var = this.f22199b;
        org.telegram.ui.Components.y9 y9Var = this.f22198a;
        TextView textView = this.f22200c;
        if (chat == null) {
            q4Var.setText("");
            textView.setText("");
            y9Var.setImageDrawable(null);
            return;
        }
        org.telegram.ui.Components.j9 j9Var = this.d;
        j9Var.q(chat);
        TLRPC.ChatPhoto chatPhoto = chat.photo;
        if (chatPhoto != null && chatPhoto.photo_small != null) {
            y9Var.e(chat, j9Var);
        } else {
            y9Var.setImageDrawable(j9Var);
        }
        q4Var.setText(chat.title);
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
        this.f22198a.setVisibility(4);
        this.f22200c.setVisibility(4);
        String str = keywordResult.emoji;
        if (str != null && str.startsWith("animated_")) {
            try {
                Drawable drawable = this.f22202f;
                if (drawable instanceof org.telegram.ui.Components.s5) {
                    ((org.telegram.ui.Components.s5) drawable).o(this);
                    this.f22202f = null;
                }
                org.telegram.ui.Components.s5 n10 = org.telegram.ui.Components.s5.n(UserConfig.selectedAccount, Long.parseLong(keywordResult.emoji.substring(9)), null, 0);
                this.f22202f = n10;
                if (this.f22203n) {
                    n10.a(this);
                }
            } catch (Exception unused) {
                this.f22202f = Emoji.getEmojiDrawable(keywordResult.emoji);
            }
        } else {
            this.f22202f = Emoji.getEmojiDrawable(keywordResult.emoji);
        }
        Drawable drawable2 = this.f22202f;
        ai.q4 q4Var = this.f22199b;
        if (drawable2 == null) {
            q4Var.setPadding(0, 0, 0, 0);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(keywordResult.emoji);
            sb2.append(":  ");
            sb2.append(keywordResult.keyword);
            q4Var.setText(sb2);
            return;
        }
        q4Var.setPadding(AndroidUtilities.dp(22.0f), 0, 0, 0);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(":  ");
        sb3.append(keywordResult.keyword);
        q4Var.setText(sb3);
    }

    public void setIsDarkTheme(boolean z10) {
        TextView textView = this.f22200c;
        ai.q4 q4Var = this.f22199b;
        if (z10) {
            q4Var.setTextColor(-1);
            textView.setTextColor(-4473925);
            return;
        }
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        org.telegram.ui.ActionBar.e6 e6Var = this.f22201e;
        q4Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(i10, e6Var));
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.A6, e6Var));
    }

    public void setText(String str) {
        a();
        this.f22198a.setVisibility(4);
        this.f22200c.setVisibility(4);
        this.f22199b.setText(str);
    }

    public void setUser(TLRPC.User user) {
        a();
        ai.q4 q4Var = this.f22199b;
        org.telegram.ui.Components.y9 y9Var = this.f22198a;
        TextView textView = this.f22200c;
        if (user == null) {
            q4Var.setText("");
            textView.setText("");
            y9Var.setImageDrawable(null);
            return;
        }
        org.telegram.ui.Components.j9 j9Var = this.d;
        j9Var.r(user);
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        if (userProfilePhoto != null && userProfilePhoto.photo_small != null) {
            y9Var.e(user, j9Var);
        } else {
            y9Var.setImageDrawable(j9Var);
        }
        q4Var.setText(UserObject.getUserName(user));
        if (UserObject.getPublicUsername(user) != null) {
            textView.setText("@" + UserObject.getPublicUsername(user));
        } else {
            textView.setText("");
        }
        y9Var.setVisibility(0);
        textView.setVisibility(0);
    }
}
