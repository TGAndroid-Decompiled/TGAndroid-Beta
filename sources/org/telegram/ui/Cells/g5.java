package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import di.xb;
import org.telegram.messenger.i10;
import org.telegram.messenger.n10;
import org.telegram.messenger.ni;
import org.telegram.tgnet.TLRPC;
public final class g5 extends LinearLayout {
    public final org.telegram.ui.Components.p9 f30754a;
    public final xb f30755b;
    public final TextView f30756c;
    public final org.telegram.ui.Components.a9 d;
    public final org.telegram.ui.ActionBar.i6 f30757e;
    public Drawable f30758f;
    public boolean h;
    public boolean f30759n;

    public g5(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.h = false;
        this.f30757e = i6Var;
        setOrientation(0);
        org.telegram.ui.Components.a9 a9Var = new org.telegram.ui.Components.a9((org.telegram.ui.ActionBar.i6) null);
        this.d = a9Var;
        a9Var.u(org.telegram.messenger.g0.L(18.0f));
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.f30754a = p9Var;
        p9Var.setRoundRadius(org.telegram.messenger.g0.L(14.0f));
        addView(p9Var, c8.na.k(8.0f, 4.0f, 0.0f, 0.0f, 28, 28));
        xb xbVar = new xb(context, 7);
        this.f30755b = xbVar;
        org.telegram.ui.ActionBar.u6.U(xbVar, org.telegram.ui.ActionBar.n6.G6, i6Var);
        xbVar.setTextSize(1, 15.0f);
        xbVar.setSingleLine(true);
        xbVar.setGravity(3);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        xbVar.setEllipsize(truncateAt);
        addView(xbVar, c8.na.t(-2, -2, 16, 12, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f30756c = textView;
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.A6, i6Var);
        textView.setTextSize(1, 15.0f);
        textView.setSingleLine(true);
        textView.setGravity(3);
        textView.setEllipsize(truncateAt);
        addView(textView, c8.na.t(-2, -2, 16, 12, 0, 8, 0));
    }

    public final void a() {
        this.f30755b.setPadding(0, 0, 0, 0);
        Drawable drawable = this.f30758f;
        if (drawable != null) {
            if (drawable instanceof org.telegram.ui.Components.o5) {
                ((org.telegram.ui.Components.o5) drawable).n(this);
            }
            this.f30758f = null;
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        super.dispatchDraw(canvas);
        Drawable drawable = this.f30758f;
        if (drawable != null) {
            if (drawable instanceof org.telegram.ui.Components.o5) {
                f10 = 24.0f;
            } else {
                f10 = 20.0f;
            }
            int L = org.telegram.messenger.g0.L(f10);
            if (this.f30758f instanceof org.telegram.ui.Components.o5) {
                f11 = -2.0f;
            } else {
                f11 = 0.0f;
            }
            int L2 = org.telegram.messenger.g0.L(f11);
            Drawable drawable2 = this.f30758f;
            xb xbVar = this.f30755b;
            drawable2.setBounds(xbVar.getLeft() + L2, ((xbVar.getBottom() + xbVar.getTop()) - L) / 2, xbVar.getLeft() + L2 + L, ((xbVar.getBottom() + xbVar.getTop()) + L) / 2);
            Drawable drawable3 = this.f30758f;
            if (drawable3 instanceof org.telegram.ui.Components.o5) {
                ((org.telegram.ui.Components.o5) drawable3).p(System.currentTimeMillis());
            }
            this.f30758f.draw(canvas);
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f30755b.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f30759n = true;
        Drawable drawable = this.f30758f;
        if (drawable instanceof org.telegram.ui.Components.o5) {
            ((org.telegram.ui.Components.o5) drawable).a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f30759n = false;
        Drawable drawable = this.f30758f;
        if (drawable instanceof org.telegram.ui.Components.o5) {
            ((org.telegram.ui.Components.o5) drawable).n(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.h) {
            canvas.drawLine(org.telegram.messenger.g0.L(52.0f), getHeight() - 1, getWidth() - org.telegram.messenger.g0.L(8.0f), getHeight() - 1, org.telegram.ui.ActionBar.n6.f29574k0);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(36.0f), 1073741824));
    }

    public void setChat(TLRPC.Chat chat) {
        a();
        xb xbVar = this.f30755b;
        org.telegram.ui.Components.p9 p9Var = this.f30754a;
        TextView textView = this.f30756c;
        if (chat == null) {
            xbVar.setText("");
            textView.setText("");
            p9Var.setImageDrawable(null);
            return;
        }
        org.telegram.ui.Components.a9 a9Var = this.d;
        a9Var.q(chat);
        TLRPC.ChatPhoto chatPhoto = chat.photo;
        if (chatPhoto != null && chatPhoto.photo_small != null) {
            p9Var.f(chat, a9Var);
        } else {
            p9Var.setImageDrawable(a9Var);
        }
        xbVar.setText(chat.title);
        String K = org.telegram.messenger.v3.K(chat, false);
        if (K != null) {
            textView.setText("@".concat(K));
        } else {
            textView.setText("");
        }
        p9Var.setVisibility(0);
        textView.setVisibility(0);
    }

    public void setDivider(boolean z10) {
        if (z10 != this.h) {
            this.h = z10;
            setWillNotDraw(!z10);
            invalidate();
        }
    }

    public void setEmojiSuggestion(ni niVar) {
        this.f30754a.setVisibility(4);
        this.f30756c.setVisibility(4);
        String str = niVar.f26023a;
        if (str != null && str.startsWith("animated_")) {
            try {
                Drawable drawable = this.f30758f;
                if (drawable instanceof org.telegram.ui.Components.o5) {
                    ((org.telegram.ui.Components.o5) drawable).n(this);
                    this.f30758f = null;
                }
                org.telegram.ui.Components.o5 m10 = org.telegram.ui.Components.o5.m(i10.f24637t0, Long.parseLong(niVar.f26023a.substring(9)), null, 0);
                this.f30758f = m10;
                if (this.f30759n) {
                    m10.a(this);
                }
            } catch (Exception unused) {
                this.f30758f = org.telegram.messenger.j6.g(niVar.f26023a);
            }
        } else {
            this.f30758f = org.telegram.messenger.j6.g(niVar.f26023a);
        }
        Drawable drawable2 = this.f30758f;
        xb xbVar = this.f30755b;
        if (drawable2 == null) {
            xbVar.setPadding(0, 0, 0, 0);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(niVar.f26023a);
            sb2.append(":  ");
            sb2.append(niVar.f26024b);
            xbVar.setText(sb2);
            return;
        }
        xbVar.setPadding(org.telegram.messenger.g0.L(22.0f), 0, 0, 0);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(":  ");
        sb3.append(niVar.f26024b);
        xbVar.setText(sb3);
    }

    public void setIsDarkTheme(boolean z10) {
        TextView textView = this.f30756c;
        xb xbVar = this.f30755b;
        if (z10) {
            org.telegram.ui.ActionBar.u6.q(xbVar);
            org.telegram.ui.ActionBar.u6.q(textView);
            xbVar.setTextColor(-1);
            textView.setTextColor(-4473925);
            return;
        }
        int i7 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.i6 i6Var = this.f30757e;
        org.telegram.ui.ActionBar.u6.U(xbVar, i7, i6Var);
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.A6, i6Var);
    }

    public void setText(String str) {
        a();
        this.f30754a.setVisibility(4);
        this.f30756c.setVisibility(4);
        this.f30755b.setText(str);
    }

    public void setUser(TLRPC.User user) {
        a();
        xb xbVar = this.f30755b;
        org.telegram.ui.Components.p9 p9Var = this.f30754a;
        TextView textView = this.f30756c;
        if (user == null) {
            xbVar.setText("");
            textView.setText("");
            p9Var.setImageDrawable(null);
            return;
        }
        org.telegram.ui.Components.a9 a9Var = this.d;
        a9Var.r(user);
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        if (userProfilePhoto != null && userProfilePhoto.photo_small != null) {
            p9Var.f(user, a9Var);
        } else {
            p9Var.setImageDrawable(a9Var);
        }
        xbVar.setText(n10.q(user));
        if (n10.o(user) != null) {
            textView.setText("@" + n10.o(user));
        } else {
            textView.setText("");
        }
        p9Var.setVisibility(0);
        textView.setVisibility(0);
    }
}
