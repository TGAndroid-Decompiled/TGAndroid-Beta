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
public final class h5 extends LinearLayout {
    public final org.telegram.ui.Components.p9 f22887a;
    public final hg.q f22888b;
    public final TextView f22889c;
    public final org.telegram.ui.Components.z8 d;
    public final org.telegram.ui.ActionBar.g6 f22890e;
    public Drawable f22891f;
    public boolean h;
    public boolean f22892n;

    public h5(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.h = false;
        this.f22890e = g6Var;
        setOrientation(0);
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.g6) null);
        this.d = z8Var;
        z8Var.u(AndroidUtilities.dp(18.0f));
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.f22887a = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        addView(p9Var, k7.c6.k(8.0f, 4.0f, 0.0f, 0.0f, 28, 28));
        hg.q qVar = new hg.q(context, 5);
        this.f22888b = qVar;
        qVar.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6, g6Var));
        qVar.setTextSize(1, 15.0f);
        qVar.setSingleLine(true);
        qVar.setGravity(3);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        qVar.setEllipsize(truncateAt);
        addView(qVar, k7.c6.t(-2, -2, 16, 12, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f22889c = textView;
        org.telegram.ui.b.l(org.telegram.ui.ActionBar.k6.A6, g6Var, textView, 1, 15.0f);
        textView.setSingleLine(true);
        textView.setGravity(3);
        textView.setEllipsize(truncateAt);
        addView(textView, k7.c6.t(-2, -2, 16, 12, 0, 8, 0));
    }

    public final void a() {
        this.f22888b.setPadding(0, 0, 0, 0);
        Drawable drawable = this.f22891f;
        if (drawable != null) {
            if (drawable instanceof org.telegram.ui.Components.l5) {
                ((org.telegram.ui.Components.l5) drawable).o(this);
            }
            this.f22891f = null;
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        super.dispatchDraw(canvas);
        Drawable drawable = this.f22891f;
        if (drawable != null) {
            if (drawable instanceof org.telegram.ui.Components.l5) {
                f10 = 24.0f;
            } else {
                f10 = 20.0f;
            }
            int dp = AndroidUtilities.dp(f10);
            if (this.f22891f instanceof org.telegram.ui.Components.l5) {
                f11 = -2.0f;
            } else {
                f11 = 0.0f;
            }
            int dp2 = AndroidUtilities.dp(f11);
            Drawable drawable2 = this.f22891f;
            hg.q qVar = this.f22888b;
            drawable2.setBounds(qVar.getLeft() + dp2, ((qVar.getBottom() + qVar.getTop()) - dp) / 2, qVar.getLeft() + dp2 + dp, ((qVar.getBottom() + qVar.getTop()) + dp) / 2);
            Drawable drawable3 = this.f22891f;
            if (drawable3 instanceof org.telegram.ui.Components.l5) {
                ((org.telegram.ui.Components.l5) drawable3).q(System.currentTimeMillis());
            }
            this.f22891f.draw(canvas);
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f22888b.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f22892n = true;
        Drawable drawable = this.f22891f;
        if (drawable instanceof org.telegram.ui.Components.l5) {
            ((org.telegram.ui.Components.l5) drawable).a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f22892n = false;
        Drawable drawable = this.f22891f;
        if (drawable instanceof org.telegram.ui.Components.l5) {
            ((org.telegram.ui.Components.l5) drawable).o(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.h) {
            canvas.drawLine(AndroidUtilities.dp(52.0f), getHeight() - 1, getWidth() - AndroidUtilities.dp(8.0f), getHeight() - 1, org.telegram.ui.ActionBar.k6.f21781k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(36.0f), 1073741824));
    }

    public void setChat(TLRPC.Chat chat) {
        a();
        hg.q qVar = this.f22888b;
        org.telegram.ui.Components.p9 p9Var = this.f22887a;
        TextView textView = this.f22889c;
        if (chat == null) {
            qVar.setText("");
            textView.setText("");
            p9Var.setImageDrawable(null);
            return;
        }
        org.telegram.ui.Components.z8 z8Var = this.d;
        z8Var.q(chat);
        TLRPC.ChatPhoto chatPhoto = chat.photo;
        if (chatPhoto != null && chatPhoto.photo_small != null) {
            p9Var.e(chat, z8Var);
        } else {
            p9Var.setImageDrawable(z8Var);
        }
        qVar.setText(chat.title);
        String publicUsername = ChatObject.getPublicUsername(chat);
        if (publicUsername != null) {
            textView.setText("@".concat(publicUsername));
        } else {
            textView.setText("");
        }
        p9Var.setVisibility(0);
        textView.setVisibility(0);
    }

    public void setDivider(boolean z4) {
        if (z4 != this.h) {
            this.h = z4;
            setWillNotDraw(!z4);
            invalidate();
        }
    }

    public void setEmojiSuggestion(MediaDataController.KeywordResult keywordResult) {
        this.f22887a.setVisibility(4);
        this.f22889c.setVisibility(4);
        String str = keywordResult.emoji;
        if (str != null && str.startsWith("animated_")) {
            try {
                Drawable drawable = this.f22891f;
                if (drawable instanceof org.telegram.ui.Components.l5) {
                    ((org.telegram.ui.Components.l5) drawable).o(this);
                    this.f22891f = null;
                }
                org.telegram.ui.Components.l5 n10 = org.telegram.ui.Components.l5.n(UserConfig.selectedAccount, Long.parseLong(keywordResult.emoji.substring(9)), null, 0);
                this.f22891f = n10;
                if (this.f22892n) {
                    n10.a(this);
                }
            } catch (Exception unused) {
                this.f22891f = Emoji.getEmojiDrawable(keywordResult.emoji);
            }
        } else {
            this.f22891f = Emoji.getEmojiDrawable(keywordResult.emoji);
        }
        Drawable drawable2 = this.f22891f;
        hg.q qVar = this.f22888b;
        if (drawable2 == null) {
            qVar.setPadding(0, 0, 0, 0);
            StringBuilder sb = new StringBuilder();
            sb.append(keywordResult.emoji);
            sb.append(":  ");
            sb.append(keywordResult.keyword);
            qVar.setText(sb);
            return;
        }
        qVar.setPadding(AndroidUtilities.dp(22.0f), 0, 0, 0);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(":  ");
        sb2.append(keywordResult.keyword);
        qVar.setText(sb2);
    }

    public void setIsDarkTheme(boolean z4) {
        TextView textView = this.f22889c;
        hg.q qVar = this.f22888b;
        if (z4) {
            qVar.setTextColor(-1);
            textView.setTextColor(-4473925);
            return;
        }
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.g6 g6Var = this.f22890e;
        qVar.setTextColor(org.telegram.ui.ActionBar.k6.v0(i10, g6Var));
        textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.A6, g6Var));
    }

    public void setText(String str) {
        a();
        this.f22887a.setVisibility(4);
        this.f22889c.setVisibility(4);
        this.f22888b.setText(str);
    }

    public void setUser(TLRPC.User user) {
        a();
        hg.q qVar = this.f22888b;
        org.telegram.ui.Components.p9 p9Var = this.f22887a;
        TextView textView = this.f22889c;
        if (user == null) {
            qVar.setText("");
            textView.setText("");
            p9Var.setImageDrawable(null);
            return;
        }
        org.telegram.ui.Components.z8 z8Var = this.d;
        z8Var.r(user);
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        if (userProfilePhoto != null && userProfilePhoto.photo_small != null) {
            p9Var.e(user, z8Var);
        } else {
            p9Var.setImageDrawable(z8Var);
        }
        qVar.setText(UserObject.getUserName(user));
        if (UserObject.getPublicUsername(user) != null) {
            textView.setText("@" + UserObject.getPublicUsername(user));
        } else {
            textView.setText("");
        }
        p9Var.setVisibility(0);
        textView.setVisibility(0);
    }
}
