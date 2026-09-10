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
import org.telegram.messenger.em;
import org.telegram.tgnet.TLRPC;
public final class h5 extends LinearLayout {
    public final org.telegram.ui.Components.w9 f19256a;
    public final di.h f19257b;
    public final TextView f19258c;
    public final org.telegram.ui.Components.g9 d;
    public final org.telegram.ui.ActionBar.f6 e;
    public Drawable f19259f;
    public boolean h;
    public boolean f19260n;

    public h5(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.h = false;
        this.e = f6Var;
        setOrientation(0);
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9((org.telegram.ui.ActionBar.f6) null);
        this.d = g9Var;
        g9Var.u(AndroidUtilities.dp(18.0f));
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.f19256a = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        addView(w9Var, w7.a6.k(8.0f, 4.0f, 0.0f, 0.0f, 28, 28));
        di.h hVar = new di.h(context, 5);
        this.f19257b = hVar;
        hVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        hVar.setTextSize(1, 15.0f);
        hVar.setSingleLine(true);
        hVar.setGravity(3);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        hVar.setEllipsize(truncateAt);
        addView(hVar, w7.a6.t(-2, -2, 16, 12, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f19258c = textView;
        em.n(org.telegram.ui.ActionBar.j6.A6, f6Var, textView, 1, 15.0f);
        textView.setSingleLine(true);
        textView.setGravity(3);
        textView.setEllipsize(truncateAt);
        addView(textView, w7.a6.t(-2, -2, 16, 12, 0, 8, 0));
    }

    public final void a() {
        this.f19257b.setPadding(0, 0, 0, 0);
        Drawable drawable = this.f19259f;
        if (drawable != null) {
            if (drawable instanceof org.telegram.ui.Components.p5) {
                ((org.telegram.ui.Components.p5) drawable).o(this);
            }
            this.f19259f = null;
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        float f10;
        super.dispatchDraw(canvas);
        Drawable drawable = this.f19259f;
        if (drawable != null) {
            if (drawable instanceof org.telegram.ui.Components.p5) {
                f7 = 24.0f;
            } else {
                f7 = 20.0f;
            }
            int dp = AndroidUtilities.dp(f7);
            if (this.f19259f instanceof org.telegram.ui.Components.p5) {
                f10 = -2.0f;
            } else {
                f10 = 0.0f;
            }
            int dp2 = AndroidUtilities.dp(f10);
            Drawable drawable2 = this.f19259f;
            di.h hVar = this.f19257b;
            drawable2.setBounds(hVar.getLeft() + dp2, ((hVar.getBottom() + hVar.getTop()) - dp) / 2, hVar.getLeft() + dp2 + dp, ((hVar.getBottom() + hVar.getTop()) + dp) / 2);
            Drawable drawable3 = this.f19259f;
            if (drawable3 instanceof org.telegram.ui.Components.p5) {
                ((org.telegram.ui.Components.p5) drawable3).q(System.currentTimeMillis());
            }
            this.f19259f.draw(canvas);
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f19257b.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f19260n = true;
        Drawable drawable = this.f19259f;
        if (drawable instanceof org.telegram.ui.Components.p5) {
            ((org.telegram.ui.Components.p5) drawable).a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f19260n = false;
        Drawable drawable = this.f19259f;
        if (drawable instanceof org.telegram.ui.Components.p5) {
            ((org.telegram.ui.Components.p5) drawable).o(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.h) {
            canvas.drawLine(AndroidUtilities.dp(52.0f), getHeight() - 1, getWidth() - AndroidUtilities.dp(8.0f), getHeight() - 1, org.telegram.ui.ActionBar.j6.f18049k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(36.0f), 1073741824));
    }

    public void setChat(TLRPC.Chat chat) {
        a();
        di.h hVar = this.f19257b;
        org.telegram.ui.Components.w9 w9Var = this.f19256a;
        TextView textView = this.f19258c;
        if (chat == null) {
            hVar.setText("");
            textView.setText("");
            w9Var.setImageDrawable(null);
            return;
        }
        org.telegram.ui.Components.g9 g9Var = this.d;
        g9Var.q(chat);
        TLRPC.ChatPhoto chatPhoto = chat.photo;
        if (chatPhoto != null && chatPhoto.photo_small != null) {
            w9Var.e(chat, g9Var);
        } else {
            w9Var.setImageDrawable(g9Var);
        }
        hVar.setText(chat.title);
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
        this.f19256a.setVisibility(4);
        this.f19258c.setVisibility(4);
        String str = keywordResult.emoji;
        if (str != null && str.startsWith("animated_")) {
            try {
                Drawable drawable = this.f19259f;
                if (drawable instanceof org.telegram.ui.Components.p5) {
                    ((org.telegram.ui.Components.p5) drawable).o(this);
                    this.f19259f = null;
                }
                org.telegram.ui.Components.p5 n10 = org.telegram.ui.Components.p5.n(UserConfig.selectedAccount, Long.parseLong(keywordResult.emoji.substring(9)), null, 0);
                this.f19259f = n10;
                if (this.f19260n) {
                    n10.a(this);
                }
            } catch (Exception unused) {
                this.f19259f = Emoji.getEmojiDrawable(keywordResult.emoji);
            }
        } else {
            this.f19259f = Emoji.getEmojiDrawable(keywordResult.emoji);
        }
        Drawable drawable2 = this.f19259f;
        di.h hVar = this.f19257b;
        if (drawable2 == null) {
            hVar.setPadding(0, 0, 0, 0);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(keywordResult.emoji);
            sb2.append(":  ");
            sb2.append(keywordResult.keyword);
            hVar.setText(sb2);
            return;
        }
        hVar.setPadding(AndroidUtilities.dp(22.0f), 0, 0, 0);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(":  ");
        sb3.append(keywordResult.keyword);
        hVar.setText(sb3);
    }

    public void setIsDarkTheme(boolean z10) {
        TextView textView = this.f19258c;
        di.h hVar = this.f19257b;
        if (z10) {
            hVar.setTextColor(-1);
            textView.setTextColor(-4473925);
            return;
        }
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = this.e;
        hVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A6, f6Var));
    }

    public void setText(String str) {
        a();
        this.f19256a.setVisibility(4);
        this.f19258c.setVisibility(4);
        this.f19257b.setText(str);
    }

    public void setUser(TLRPC.User user) {
        a();
        di.h hVar = this.f19257b;
        org.telegram.ui.Components.w9 w9Var = this.f19256a;
        TextView textView = this.f19258c;
        if (user == null) {
            hVar.setText("");
            textView.setText("");
            w9Var.setImageDrawable(null);
            return;
        }
        org.telegram.ui.Components.g9 g9Var = this.d;
        g9Var.r(user);
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        if (userProfilePhoto != null && userProfilePhoto.photo_small != null) {
            w9Var.e(user, g9Var);
        } else {
            w9Var.setImageDrawable(g9Var);
        }
        hVar.setText(UserObject.getUserName(user));
        if (UserObject.getPublicUsername(user) != null) {
            textView.setText("@" + UserObject.getPublicUsername(user));
        } else {
            textView.setText("");
        }
        w9Var.setVisibility(0);
        textView.setVisibility(0);
    }
}
