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
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLRPC;
public final class h5 extends LinearLayout {
    public final org.telegram.ui.Components.o9 f24433a;
    public final bg.t f24434b;
    public final TextView f24435c;
    public final org.telegram.ui.Components.z8 d;
    public final org.telegram.ui.ActionBar.b6 f24436e;
    public Drawable f24437f;
    public boolean h;
    public boolean f24438n;

    public h5(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.h = false;
        this.f24436e = b6Var;
        setOrientation(0);
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
        this.d = z8Var;
        z8Var.u(AndroidUtilities.dp(18.0f));
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
        this.f24433a = o9Var;
        o9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        addView(o9Var, g7.e6.k(8.0f, 4.0f, 0.0f, 0.0f, 28, 28));
        bg.t tVar = new bg.t(context, 7);
        this.f24434b = tVar;
        tVar.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, b6Var));
        tVar.setTextSize(1, 15.0f);
        tVar.setSingleLine(true);
        tVar.setGravity(3);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        tVar.setEllipsize(truncateAt);
        addView(tVar, g7.e6.t(-2, -2, 16, 12, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f24435c = textView;
        ll.n(org.telegram.ui.ActionBar.f6.A6, b6Var, textView, 1, 15.0f);
        textView.setSingleLine(true);
        textView.setGravity(3);
        textView.setEllipsize(truncateAt);
        addView(textView, g7.e6.t(-2, -2, 16, 12, 0, 8, 0));
    }

    public final void a() {
        this.f24434b.setPadding(0, 0, 0, 0);
        Drawable drawable = this.f24437f;
        if (drawable != null) {
            if (drawable instanceof org.telegram.ui.Components.k5) {
                ((org.telegram.ui.Components.k5) drawable).o(this);
            }
            this.f24437f = null;
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        super.dispatchDraw(canvas);
        Drawable drawable = this.f24437f;
        if (drawable != null) {
            if (drawable instanceof org.telegram.ui.Components.k5) {
                f10 = 24.0f;
            } else {
                f10 = 20.0f;
            }
            int dp = AndroidUtilities.dp(f10);
            if (this.f24437f instanceof org.telegram.ui.Components.k5) {
                f11 = -2.0f;
            } else {
                f11 = 0.0f;
            }
            int dp2 = AndroidUtilities.dp(f11);
            Drawable drawable2 = this.f24437f;
            bg.t tVar = this.f24434b;
            drawable2.setBounds(tVar.getLeft() + dp2, ((tVar.getBottom() + tVar.getTop()) - dp) / 2, tVar.getLeft() + dp2 + dp, ((tVar.getBottom() + tVar.getTop()) + dp) / 2);
            Drawable drawable3 = this.f24437f;
            if (drawable3 instanceof org.telegram.ui.Components.k5) {
                ((org.telegram.ui.Components.k5) drawable3).q(System.currentTimeMillis());
            }
            this.f24437f.draw(canvas);
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f24434b.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f24438n = true;
        Drawable drawable = this.f24437f;
        if (drawable instanceof org.telegram.ui.Components.k5) {
            ((org.telegram.ui.Components.k5) drawable).a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f24438n = false;
        Drawable drawable = this.f24437f;
        if (drawable instanceof org.telegram.ui.Components.k5) {
            ((org.telegram.ui.Components.k5) drawable).o(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.h) {
            canvas.drawLine(AndroidUtilities.dp(52.0f), getHeight() - 1, getWidth() - AndroidUtilities.dp(8.0f), getHeight() - 1, org.telegram.ui.ActionBar.f6.f23121k0);
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(36.0f), 1073741824));
    }

    public void setChat(TLRPC.Chat chat) {
        a();
        bg.t tVar = this.f24434b;
        org.telegram.ui.Components.o9 o9Var = this.f24433a;
        TextView textView = this.f24435c;
        if (chat == null) {
            tVar.setText("");
            textView.setText("");
            o9Var.setImageDrawable(null);
            return;
        }
        org.telegram.ui.Components.z8 z8Var = this.d;
        z8Var.q(chat);
        TLRPC.ChatPhoto chatPhoto = chat.photo;
        if (chatPhoto != null && chatPhoto.photo_small != null) {
            o9Var.e(chat, z8Var);
        } else {
            o9Var.setImageDrawable(z8Var);
        }
        tVar.setText(chat.title);
        String publicUsername = ChatObject.getPublicUsername(chat);
        if (publicUsername != null) {
            textView.setText("@".concat(publicUsername));
        } else {
            textView.setText("");
        }
        o9Var.setVisibility(0);
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
        this.f24433a.setVisibility(4);
        this.f24435c.setVisibility(4);
        String str = keywordResult.emoji;
        if (str != null && str.startsWith("animated_")) {
            try {
                Drawable drawable = this.f24437f;
                if (drawable instanceof org.telegram.ui.Components.k5) {
                    ((org.telegram.ui.Components.k5) drawable).o(this);
                    this.f24437f = null;
                }
                org.telegram.ui.Components.k5 n10 = org.telegram.ui.Components.k5.n(UserConfig.selectedAccount, Long.parseLong(keywordResult.emoji.substring(9)), null, 0);
                this.f24437f = n10;
                if (this.f24438n) {
                    n10.a(this);
                }
            } catch (Exception unused) {
                this.f24437f = Emoji.getEmojiDrawable(keywordResult.emoji);
            }
        } else {
            this.f24437f = Emoji.getEmojiDrawable(keywordResult.emoji);
        }
        Drawable drawable2 = this.f24437f;
        bg.t tVar = this.f24434b;
        if (drawable2 == null) {
            tVar.setPadding(0, 0, 0, 0);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(keywordResult.emoji);
            sb2.append(":  ");
            sb2.append(keywordResult.keyword);
            tVar.setText(sb2);
            return;
        }
        tVar.setPadding(AndroidUtilities.dp(22.0f), 0, 0, 0);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(":  ");
        sb3.append(keywordResult.keyword);
        tVar.setText(sb3);
    }

    public void setIsDarkTheme(boolean z10) {
        TextView textView = this.f24435c;
        bg.t tVar = this.f24434b;
        if (z10) {
            tVar.setTextColor(-1);
            textView.setTextColor(-4473925);
            return;
        }
        int i9 = org.telegram.ui.ActionBar.f6.G6;
        org.telegram.ui.ActionBar.b6 b6Var = this.f24436e;
        tVar.setTextColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.A6, b6Var));
    }

    public void setText(String str) {
        a();
        this.f24433a.setVisibility(4);
        this.f24435c.setVisibility(4);
        this.f24434b.setText(str);
    }

    public void setUser(TLRPC.User user) {
        a();
        bg.t tVar = this.f24434b;
        org.telegram.ui.Components.o9 o9Var = this.f24433a;
        TextView textView = this.f24435c;
        if (user == null) {
            tVar.setText("");
            textView.setText("");
            o9Var.setImageDrawable(null);
            return;
        }
        org.telegram.ui.Components.z8 z8Var = this.d;
        z8Var.r(user);
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        if (userProfilePhoto != null && userProfilePhoto.photo_small != null) {
            o9Var.e(user, z8Var);
        } else {
            o9Var.setImageDrawable(z8Var);
        }
        tVar.setText(UserObject.getUserName(user));
        if (UserObject.getPublicUsername(user) != null) {
            textView.setText("@" + UserObject.getPublicUsername(user));
        } else {
            textView.setText("");
        }
        o9Var.setVisibility(0);
        textView.setVisibility(0);
    }
}
