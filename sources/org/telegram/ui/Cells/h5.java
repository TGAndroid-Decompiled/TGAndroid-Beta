package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import di.xb;
import org.telegram.messenger.k10;
import org.telegram.messenger.oi;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLRPC;
public final class h5 extends LinearLayout {
    public final org.telegram.ui.Components.q9 f30728a;
    public final xb f30729b;
    public final TextView f30730c;
    public final org.telegram.ui.Components.b9 d;
    public final org.telegram.ui.ActionBar.h6 f30731e;
    public Drawable f30732f;
    public boolean h;
    public boolean f30733n;

    public h5(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.h = false;
        this.f30731e = h6Var;
        setOrientation(0);
        org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
        this.d = b9Var;
        b9Var.u(org.telegram.messenger.g0.L(18.0f));
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.f30728a = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(14.0f));
        addView(q9Var, c8.ma.k(8.0f, 4.0f, 0.0f, 0.0f, 28, 28));
        xb xbVar = new xb(context, 7);
        this.f30729b = xbVar;
        org.telegram.ui.ActionBar.t6.U(xbVar, org.telegram.ui.ActionBar.m6.G6, h6Var);
        xbVar.setTextSize(1, 15.0f);
        xbVar.setSingleLine(true);
        xbVar.setGravity(3);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        xbVar.setEllipsize(truncateAt);
        addView(xbVar, c8.ma.t(-2, -2, 16, 12, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f30730c = textView;
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.A6, h6Var);
        textView.setTextSize(1, 15.0f);
        textView.setSingleLine(true);
        textView.setGravity(3);
        textView.setEllipsize(truncateAt);
        addView(textView, c8.ma.t(-2, -2, 16, 12, 0, 8, 0));
    }

    public final void a() {
        this.f30729b.setPadding(0, 0, 0, 0);
        Drawable drawable = this.f30732f;
        if (drawable != null) {
            if (drawable instanceof org.telegram.ui.Components.p5) {
                ((org.telegram.ui.Components.p5) drawable).n(this);
            }
            this.f30732f = null;
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        super.dispatchDraw(canvas);
        Drawable drawable = this.f30732f;
        if (drawable != null) {
            if (drawable instanceof org.telegram.ui.Components.p5) {
                f10 = 24.0f;
            } else {
                f10 = 20.0f;
            }
            int L = org.telegram.messenger.g0.L(f10);
            if (this.f30732f instanceof org.telegram.ui.Components.p5) {
                f11 = -2.0f;
            } else {
                f11 = 0.0f;
            }
            int L2 = org.telegram.messenger.g0.L(f11);
            Drawable drawable2 = this.f30732f;
            xb xbVar = this.f30729b;
            drawable2.setBounds(xbVar.getLeft() + L2, ((xbVar.getBottom() + xbVar.getTop()) - L) / 2, xbVar.getLeft() + L2 + L, ((xbVar.getBottom() + xbVar.getTop()) + L) / 2);
            Drawable drawable3 = this.f30732f;
            if (drawable3 instanceof org.telegram.ui.Components.p5) {
                ((org.telegram.ui.Components.p5) drawable3).p(System.currentTimeMillis());
            }
            this.f30732f.draw(canvas);
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f30729b.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f30733n = true;
        Drawable drawable = this.f30732f;
        if (drawable instanceof org.telegram.ui.Components.p5) {
            ((org.telegram.ui.Components.p5) drawable).a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f30733n = false;
        Drawable drawable = this.f30732f;
        if (drawable instanceof org.telegram.ui.Components.p5) {
            ((org.telegram.ui.Components.p5) drawable).n(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.h) {
            canvas.drawLine(org.telegram.messenger.g0.L(52.0f), getHeight() - 1, getWidth() - org.telegram.messenger.g0.L(8.0f), getHeight() - 1, org.telegram.ui.ActionBar.m6.f29504k0);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(36.0f), 1073741824));
    }

    public void setChat(TLRPC.Chat chat) {
        a();
        xb xbVar = this.f30729b;
        org.telegram.ui.Components.q9 q9Var = this.f30728a;
        TextView textView = this.f30730c;
        if (chat == null) {
            xbVar.setText("");
            textView.setText("");
            q9Var.setImageDrawable(null);
            return;
        }
        org.telegram.ui.Components.b9 b9Var = this.d;
        b9Var.q(chat);
        TLRPC.ChatPhoto chatPhoto = chat.photo;
        if (chatPhoto != null && chatPhoto.photo_small != null) {
            q9Var.f(chat, b9Var);
        } else {
            q9Var.setImageDrawable(b9Var);
        }
        xbVar.setText(chat.title);
        String K = org.telegram.messenger.v3.K(chat, false);
        if (K != null) {
            textView.setText("@".concat(K));
        } else {
            textView.setText("");
        }
        q9Var.setVisibility(0);
        textView.setVisibility(0);
    }

    public void setDivider(boolean z10) {
        if (z10 != this.h) {
            this.h = z10;
            setWillNotDraw(!z10);
            invalidate();
        }
    }

    public void setEmojiSuggestion(oi oiVar) {
        this.f30728a.setVisibility(4);
        this.f30730c.setVisibility(4);
        String str = oiVar.f26126a;
        if (str != null && str.startsWith("animated_")) {
            try {
                Drawable drawable = this.f30732f;
                if (drawable instanceof org.telegram.ui.Components.p5) {
                    ((org.telegram.ui.Components.p5) drawable).n(this);
                    this.f30732f = null;
                }
                org.telegram.ui.Components.p5 m10 = org.telegram.ui.Components.p5.m(k10.f24968t0, Long.parseLong(oiVar.f26126a.substring(9)), null, 0);
                this.f30732f = m10;
                if (this.f30733n) {
                    m10.a(this);
                }
            } catch (Exception unused) {
                this.f30732f = org.telegram.messenger.j6.g(oiVar.f26126a);
            }
        } else {
            this.f30732f = org.telegram.messenger.j6.g(oiVar.f26126a);
        }
        Drawable drawable2 = this.f30732f;
        xb xbVar = this.f30729b;
        if (drawable2 == null) {
            xbVar.setPadding(0, 0, 0, 0);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(oiVar.f26126a);
            sb2.append(":  ");
            sb2.append(oiVar.f26127b);
            xbVar.setText(sb2);
            return;
        }
        xbVar.setPadding(org.telegram.messenger.g0.L(22.0f), 0, 0, 0);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(":  ");
        sb3.append(oiVar.f26127b);
        xbVar.setText(sb3);
    }

    public void setIsDarkTheme(boolean z10) {
        TextView textView = this.f30730c;
        xb xbVar = this.f30729b;
        if (z10) {
            org.telegram.ui.ActionBar.t6.q(xbVar);
            org.telegram.ui.ActionBar.t6.q(textView);
            xbVar.setTextColor(-1);
            textView.setTextColor(-4473925);
            return;
        }
        int i7 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.h6 h6Var = this.f30731e;
        org.telegram.ui.ActionBar.t6.U(xbVar, i7, h6Var);
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.A6, h6Var);
    }

    public void setText(String str) {
        a();
        this.f30728a.setVisibility(4);
        this.f30730c.setVisibility(4);
        this.f30729b.setText(str);
    }

    public void setUser(TLRPC.User user) {
        a();
        xb xbVar = this.f30729b;
        org.telegram.ui.Components.q9 q9Var = this.f30728a;
        TextView textView = this.f30730c;
        if (user == null) {
            xbVar.setText("");
            textView.setText("");
            q9Var.setImageDrawable(null);
            return;
        }
        org.telegram.ui.Components.b9 b9Var = this.d;
        b9Var.r(user);
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        if (userProfilePhoto != null && userProfilePhoto.photo_small != null) {
            q9Var.f(user, b9Var);
        } else {
            q9Var.setImageDrawable(b9Var);
        }
        xbVar.setText(p10.q(user));
        if (p10.o(user) != null) {
            textView.setText("@" + p10.o(user));
        } else {
            textView.setText("");
        }
        q9Var.setVisibility(0);
        textView.setVisibility(0);
    }
}
