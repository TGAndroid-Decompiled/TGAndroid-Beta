package org.telegram.ui.Cells;

import ai.wd;
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
public final class g5 extends LinearLayout {
    public final org.telegram.ui.Components.w9 f22405a;
    public final wd f22406b;
    public final TextView f22407c;
    public final org.telegram.ui.Components.h9 d;
    public final org.telegram.ui.ActionBar.g6 e;
    public Drawable f22408f;
    public boolean h;
    public boolean f22409n;

    public g5(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.h = false;
        this.e = g6Var;
        setOrientation(0);
        org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.g6) null);
        this.d = h9Var;
        h9Var.u(AndroidUtilities.dp(18.0f));
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.f22405a = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        addView(w9Var, w7.z5.k(8.0f, 4.0f, 0.0f, 0.0f, 28, 28));
        wd wdVar = new wd(context, 7);
        this.f22406b = wdVar;
        org.telegram.ui.ActionBar.r6.W(wdVar, org.telegram.ui.ActionBar.k6.G6, g6Var);
        wdVar.setTextSize(1, 15.0f);
        wdVar.setSingleLine(true);
        wdVar.setGravity(3);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        wdVar.setEllipsize(truncateAt);
        addView(wdVar, w7.z5.t(-2, -2, 16, 12, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f22407c = textView;
        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.A6, g6Var);
        textView.setTextSize(1, 15.0f);
        textView.setSingleLine(true);
        textView.setGravity(3);
        textView.setEllipsize(truncateAt);
        addView(textView, w7.z5.t(-2, -2, 16, 12, 0, 8, 0));
    }

    public final void a() {
        this.f22406b.setPadding(0, 0, 0, 0);
        Drawable drawable = this.f22408f;
        if (drawable != null) {
            if (drawable instanceof org.telegram.ui.Components.r5) {
                ((org.telegram.ui.Components.r5) drawable).o(this);
            }
            this.f22408f = null;
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        float f10;
        super.dispatchDraw(canvas);
        Drawable drawable = this.f22408f;
        if (drawable != null) {
            if (drawable instanceof org.telegram.ui.Components.r5) {
                f7 = 24.0f;
            } else {
                f7 = 20.0f;
            }
            int dp = AndroidUtilities.dp(f7);
            if (this.f22408f instanceof org.telegram.ui.Components.r5) {
                f10 = -2.0f;
            } else {
                f10 = 0.0f;
            }
            int dp2 = AndroidUtilities.dp(f10);
            Drawable drawable2 = this.f22408f;
            wd wdVar = this.f22406b;
            drawable2.setBounds(wdVar.getLeft() + dp2, ((wdVar.getBottom() + wdVar.getTop()) - dp) / 2, wdVar.getLeft() + dp2 + dp, ((wdVar.getBottom() + wdVar.getTop()) + dp) / 2);
            Drawable drawable3 = this.f22408f;
            if (drawable3 instanceof org.telegram.ui.Components.r5) {
                ((org.telegram.ui.Components.r5) drawable3).q(System.currentTimeMillis());
            }
            this.f22408f.draw(canvas);
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f22406b.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f22409n = true;
        Drawable drawable = this.f22408f;
        if (drawable instanceof org.telegram.ui.Components.r5) {
            ((org.telegram.ui.Components.r5) drawable).a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f22409n = false;
        Drawable drawable = this.f22408f;
        if (drawable instanceof org.telegram.ui.Components.r5) {
            ((org.telegram.ui.Components.r5) drawable).o(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.h) {
            canvas.drawLine(AndroidUtilities.dp(52.0f), getHeight() - 1, getWidth() - AndroidUtilities.dp(8.0f), getHeight() - 1, org.telegram.ui.ActionBar.k6.f21304k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(36.0f), 1073741824));
    }

    public void setChat(TLRPC.Chat chat) {
        a();
        wd wdVar = this.f22406b;
        org.telegram.ui.Components.w9 w9Var = this.f22405a;
        TextView textView = this.f22407c;
        if (chat == null) {
            wdVar.setText("");
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
        wdVar.setText(chat.title);
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
        this.f22405a.setVisibility(4);
        this.f22407c.setVisibility(4);
        String str = keywordResult.emoji;
        if (str != null && str.startsWith("animated_")) {
            try {
                Drawable drawable = this.f22408f;
                if (drawable instanceof org.telegram.ui.Components.r5) {
                    ((org.telegram.ui.Components.r5) drawable).o(this);
                    this.f22408f = null;
                }
                org.telegram.ui.Components.r5 n10 = org.telegram.ui.Components.r5.n(UserConfig.selectedAccount, Long.parseLong(keywordResult.emoji.substring(9)), null, 0);
                this.f22408f = n10;
                if (this.f22409n) {
                    n10.a(this);
                }
            } catch (Exception unused) {
                this.f22408f = Emoji.getEmojiDrawable(keywordResult.emoji);
            }
        } else {
            this.f22408f = Emoji.getEmojiDrawable(keywordResult.emoji);
        }
        Drawable drawable2 = this.f22408f;
        wd wdVar = this.f22406b;
        if (drawable2 == null) {
            wdVar.setPadding(0, 0, 0, 0);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(keywordResult.emoji);
            sb2.append(":  ");
            sb2.append(keywordResult.keyword);
            wdVar.setText(sb2);
            return;
        }
        wdVar.setPadding(AndroidUtilities.dp(22.0f), 0, 0, 0);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(":  ");
        sb3.append(keywordResult.keyword);
        wdVar.setText(sb3);
    }

    public void setIsDarkTheme(boolean z10) {
        TextView textView = this.f22407c;
        wd wdVar = this.f22406b;
        if (z10) {
            org.telegram.ui.ActionBar.r6.r(wdVar);
            org.telegram.ui.ActionBar.r6.r(textView);
            wdVar.setTextColor(-1);
            textView.setTextColor(-4473925);
            return;
        }
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.g6 g6Var = this.e;
        org.telegram.ui.ActionBar.r6.W(wdVar, i10, g6Var);
        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.A6, g6Var);
    }

    public void setText(String str) {
        a();
        this.f22405a.setVisibility(4);
        this.f22407c.setVisibility(4);
        this.f22406b.setText(str);
    }

    public void setUser(TLRPC.User user) {
        a();
        wd wdVar = this.f22406b;
        org.telegram.ui.Components.w9 w9Var = this.f22405a;
        TextView textView = this.f22407c;
        if (user == null) {
            wdVar.setText("");
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
        wdVar.setText(UserObject.getUserName(user));
        if (UserObject.getPublicUsername(user) != null) {
            textView.setText("@" + UserObject.getPublicUsername(user));
        } else {
            textView.setText("");
        }
        w9Var.setVisibility(0);
        textView.setVisibility(0);
    }
}
