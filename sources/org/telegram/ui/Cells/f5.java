package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.md;
import org.telegram.messenger.p10;
import org.telegram.messenger.qi;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
public final class f5 extends LinearLayout {
    public final org.telegram.ui.Components.l9 f29122a;
    public final md f29123b;
    public final TextView f29124c;
    public final org.telegram.ui.Components.w8 d;
    public final org.telegram.ui.ActionBar.g6 f29125e;
    public Drawable f29126f;
    public boolean h;
    public boolean f29127n;

    public f5(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.h = false;
        this.f29125e = g6Var;
        setOrientation(0);
        org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.g6) null);
        this.d = w8Var;
        w8Var.u(org.telegram.messenger.g0.L(18.0f));
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.f29122a = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(14.0f));
        addView(l9Var, c8.ha.k(8.0f, 4.0f, 0.0f, 0.0f, 28, 28));
        md mdVar = new md(context, 7);
        this.f29123b = mdVar;
        org.telegram.ui.ActionBar.s6.U(mdVar, org.telegram.ui.ActionBar.l6.G6, g6Var);
        mdVar.setTextSize(1, 15.0f);
        mdVar.setSingleLine(true);
        mdVar.setGravity(3);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        mdVar.setEllipsize(truncateAt);
        addView(mdVar, c8.ha.t(-2, -2, 16, 12, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f29124c = textView;
        org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.A6, g6Var);
        textView.setTextSize(1, 15.0f);
        textView.setSingleLine(true);
        textView.setGravity(3);
        textView.setEllipsize(truncateAt);
        addView(textView, c8.ha.t(-2, -2, 16, 12, 0, 8, 0));
    }

    public final void a() {
        this.f29123b.setPadding(0, 0, 0, 0);
        Drawable drawable = this.f29126f;
        if (drawable != null) {
            if (drawable instanceof org.telegram.ui.Components.i5) {
                ((org.telegram.ui.Components.i5) drawable).n(this);
            }
            this.f29126f = null;
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        super.dispatchDraw(canvas);
        Drawable drawable = this.f29126f;
        if (drawable != null) {
            if (drawable instanceof org.telegram.ui.Components.i5) {
                f10 = 24.0f;
            } else {
                f10 = 20.0f;
            }
            int L = org.telegram.messenger.g0.L(f10);
            if (this.f29126f instanceof org.telegram.ui.Components.i5) {
                f11 = -2.0f;
            } else {
                f11 = 0.0f;
            }
            int L2 = org.telegram.messenger.g0.L(f11);
            Drawable drawable2 = this.f29126f;
            md mdVar = this.f29123b;
            drawable2.setBounds(mdVar.getLeft() + L2, ((mdVar.getBottom() + mdVar.getTop()) - L) / 2, mdVar.getLeft() + L2 + L, ((mdVar.getBottom() + mdVar.getTop()) + L) / 2);
            Drawable drawable3 = this.f29126f;
            if (drawable3 instanceof org.telegram.ui.Components.i5) {
                ((org.telegram.ui.Components.i5) drawable3).p(System.currentTimeMillis());
            }
            this.f29126f.draw(canvas);
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f29123b.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f29127n = true;
        Drawable drawable = this.f29126f;
        if (drawable instanceof org.telegram.ui.Components.i5) {
            ((org.telegram.ui.Components.i5) drawable).a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f29127n = false;
        Drawable drawable = this.f29126f;
        if (drawable instanceof org.telegram.ui.Components.i5) {
            ((org.telegram.ui.Components.i5) drawable).n(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.h) {
            canvas.drawLine(org.telegram.messenger.g0.L(52.0f), getHeight() - 1, getWidth() - org.telegram.messenger.g0.L(8.0f), getHeight() - 1, org.telegram.ui.ActionBar.l6.f27988k0);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(36.0f), 1073741824));
    }

    public void setChat(TLRPC.Chat chat) {
        a();
        md mdVar = this.f29123b;
        org.telegram.ui.Components.l9 l9Var = this.f29122a;
        TextView textView = this.f29124c;
        if (chat == null) {
            mdVar.setText("");
            textView.setText("");
            l9Var.setImageDrawable(null);
            return;
        }
        org.telegram.ui.Components.w8 w8Var = this.d;
        w8Var.q(chat);
        TLRPC.ChatPhoto chatPhoto = chat.photo;
        if (chatPhoto != null && chatPhoto.photo_small != null) {
            l9Var.e(chat, w8Var);
        } else {
            l9Var.setImageDrawable(w8Var);
        }
        mdVar.setText(chat.title);
        String K = org.telegram.messenger.t3.K(chat, false);
        if (K != null) {
            textView.setText("@".concat(K));
        } else {
            textView.setText("");
        }
        l9Var.setVisibility(0);
        textView.setVisibility(0);
    }

    public void setDivider(boolean z9) {
        if (z9 != this.h) {
            this.h = z9;
            setWillNotDraw(!z9);
            invalidate();
        }
    }

    public void setEmojiSuggestion(qi qiVar) {
        this.f29122a.setVisibility(4);
        this.f29124c.setVisibility(4);
        String str = qiVar.f24701a;
        if (str != null && str.startsWith("animated_")) {
            try {
                Drawable drawable = this.f29126f;
                if (drawable instanceof org.telegram.ui.Components.i5) {
                    ((org.telegram.ui.Components.i5) drawable).n(this);
                    this.f29126f = null;
                }
                org.telegram.ui.Components.i5 m10 = org.telegram.ui.Components.i5.m(p10.f24470s0, Long.parseLong(qiVar.f24701a.substring(9)), null, 0);
                this.f29126f = m10;
                if (this.f29127n) {
                    m10.a(this);
                }
            } catch (Exception unused) {
                this.f29126f = org.telegram.messenger.i6.g(qiVar.f24701a);
            }
        } else {
            this.f29126f = org.telegram.messenger.i6.g(qiVar.f24701a);
        }
        Drawable drawable2 = this.f29126f;
        md mdVar = this.f29123b;
        if (drawable2 == null) {
            mdVar.setPadding(0, 0, 0, 0);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(qiVar.f24701a);
            sb2.append(":  ");
            sb2.append(qiVar.f24702b);
            mdVar.setText(sb2);
            return;
        }
        mdVar.setPadding(org.telegram.messenger.g0.L(22.0f), 0, 0, 0);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(":  ");
        sb3.append(qiVar.f24702b);
        mdVar.setText(sb3);
    }

    public void setIsDarkTheme(boolean z9) {
        TextView textView = this.f29124c;
        md mdVar = this.f29123b;
        if (z9) {
            org.telegram.ui.ActionBar.s6.q(mdVar);
            org.telegram.ui.ActionBar.s6.q(textView);
            mdVar.setTextColor(-1);
            textView.setTextColor(-4473925);
            return;
        }
        int i7 = org.telegram.ui.ActionBar.l6.G6;
        org.telegram.ui.ActionBar.g6 g6Var = this.f29125e;
        org.telegram.ui.ActionBar.s6.U(mdVar, i7, g6Var);
        org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.A6, g6Var);
    }

    public void setText(String str) {
        a();
        this.f29122a.setVisibility(4);
        this.f29124c.setVisibility(4);
        this.f29123b.setText(str);
    }

    public void setUser(TLRPC.User user) {
        a();
        md mdVar = this.f29123b;
        org.telegram.ui.Components.l9 l9Var = this.f29122a;
        TextView textView = this.f29124c;
        if (user == null) {
            mdVar.setText("");
            textView.setText("");
            l9Var.setImageDrawable(null);
            return;
        }
        org.telegram.ui.Components.w8 w8Var = this.d;
        w8Var.r(user);
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        if (userProfilePhoto != null && userProfilePhoto.photo_small != null) {
            l9Var.e(user, w8Var);
        } else {
            l9Var.setImageDrawable(w8Var);
        }
        mdVar.setText(t10.p(user));
        if (t10.n(user) != null) {
            textView.setText("@" + t10.n(user));
        } else {
            textView.setText("");
        }
        l9Var.setVisibility(0);
        textView.setVisibility(0);
    }
}
