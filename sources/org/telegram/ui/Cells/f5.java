package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import di.tb;
import org.telegram.messenger.m10;
import org.telegram.messenger.oi;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLRPC;
public final class f5 extends LinearLayout {
    public final org.telegram.ui.Components.i9 f30233a;
    public final tb f30234b;
    public final TextView f30235c;
    public final org.telegram.ui.Components.t8 d;
    public final org.telegram.ui.ActionBar.e6 f30236e;
    public Drawable f30237f;
    public boolean h;
    public boolean f30238n;

    public f5(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.h = false;
        this.f30236e = e6Var;
        setOrientation(0);
        org.telegram.ui.Components.t8 t8Var = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
        this.d = t8Var;
        t8Var.u(org.telegram.messenger.g0.L(18.0f));
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
        this.f30233a = i9Var;
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(14.0f));
        addView(i9Var, c8.ja.k(8.0f, 4.0f, 0.0f, 0.0f, 28, 28));
        tb tbVar = new tb(context, 7);
        this.f30234b = tbVar;
        org.telegram.ui.ActionBar.q6.U(tbVar, org.telegram.ui.ActionBar.j6.G6, e6Var);
        tbVar.setTextSize(1, 15.0f);
        tbVar.setSingleLine(true);
        tbVar.setGravity(3);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        tbVar.setEllipsize(truncateAt);
        addView(tbVar, c8.ja.t(-2, -2, 16, 12, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f30235c = textView;
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.A6, e6Var);
        textView.setTextSize(1, 15.0f);
        textView.setSingleLine(true);
        textView.setGravity(3);
        textView.setEllipsize(truncateAt);
        addView(textView, c8.ja.t(-2, -2, 16, 12, 0, 8, 0));
    }

    public final void a() {
        this.f30234b.setPadding(0, 0, 0, 0);
        Drawable drawable = this.f30237f;
        if (drawable != null) {
            if (drawable instanceof org.telegram.ui.Components.g5) {
                ((org.telegram.ui.Components.g5) drawable).n(this);
            }
            this.f30237f = null;
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        super.dispatchDraw(canvas);
        Drawable drawable = this.f30237f;
        if (drawable != null) {
            if (drawable instanceof org.telegram.ui.Components.g5) {
                f10 = 24.0f;
            } else {
                f10 = 20.0f;
            }
            int L = org.telegram.messenger.g0.L(f10);
            if (this.f30237f instanceof org.telegram.ui.Components.g5) {
                f11 = -2.0f;
            } else {
                f11 = 0.0f;
            }
            int L2 = org.telegram.messenger.g0.L(f11);
            Drawable drawable2 = this.f30237f;
            tb tbVar = this.f30234b;
            drawable2.setBounds(tbVar.getLeft() + L2, ((tbVar.getBottom() + tbVar.getTop()) - L) / 2, tbVar.getLeft() + L2 + L, ((tbVar.getBottom() + tbVar.getTop()) + L) / 2);
            Drawable drawable3 = this.f30237f;
            if (drawable3 instanceof org.telegram.ui.Components.g5) {
                ((org.telegram.ui.Components.g5) drawable3).p(System.currentTimeMillis());
            }
            this.f30237f.draw(canvas);
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f30234b.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f30238n = true;
        Drawable drawable = this.f30237f;
        if (drawable instanceof org.telegram.ui.Components.g5) {
            ((org.telegram.ui.Components.g5) drawable).a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f30238n = false;
        Drawable drawable = this.f30237f;
        if (drawable instanceof org.telegram.ui.Components.g5) {
            ((org.telegram.ui.Components.g5) drawable).n(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.h) {
            canvas.drawLine(org.telegram.messenger.g0.L(52.0f), getHeight() - 1, getWidth() - org.telegram.messenger.g0.L(8.0f), getHeight() - 1, org.telegram.ui.ActionBar.j6.f28972k0);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(36.0f), 1073741824));
    }

    public void setChat(TLRPC.Chat chat) {
        a();
        tb tbVar = this.f30234b;
        org.telegram.ui.Components.i9 i9Var = this.f30233a;
        TextView textView = this.f30235c;
        if (chat == null) {
            tbVar.setText("");
            textView.setText("");
            i9Var.setImageDrawable(null);
            return;
        }
        org.telegram.ui.Components.t8 t8Var = this.d;
        t8Var.q(chat);
        TLRPC.ChatPhoto chatPhoto = chat.photo;
        if (chatPhoto != null && chatPhoto.photo_small != null) {
            i9Var.f(chat, t8Var);
        } else {
            i9Var.setImageDrawable(t8Var);
        }
        tbVar.setText(chat.title);
        String K = org.telegram.messenger.t3.K(chat, false);
        if (K != null) {
            textView.setText("@".concat(K));
        } else {
            textView.setText("");
        }
        i9Var.setVisibility(0);
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
        this.f30233a.setVisibility(4);
        this.f30235c.setVisibility(4);
        String str = oiVar.f25765a;
        if (str != null && str.startsWith("animated_")) {
            try {
                Drawable drawable = this.f30237f;
                if (drawable instanceof org.telegram.ui.Components.g5) {
                    ((org.telegram.ui.Components.g5) drawable).n(this);
                    this.f30237f = null;
                }
                org.telegram.ui.Components.g5 m10 = org.telegram.ui.Components.g5.m(m10.f24940t0, Long.parseLong(oiVar.f25765a.substring(9)), null, 0);
                this.f30237f = m10;
                if (this.f30238n) {
                    m10.a(this);
                }
            } catch (Exception unused) {
                this.f30237f = org.telegram.messenger.j6.g(oiVar.f25765a);
            }
        } else {
            this.f30237f = org.telegram.messenger.j6.g(oiVar.f25765a);
        }
        Drawable drawable2 = this.f30237f;
        tb tbVar = this.f30234b;
        if (drawable2 == null) {
            tbVar.setPadding(0, 0, 0, 0);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(oiVar.f25765a);
            sb2.append(":  ");
            sb2.append(oiVar.f25766b);
            tbVar.setText(sb2);
            return;
        }
        tbVar.setPadding(org.telegram.messenger.g0.L(22.0f), 0, 0, 0);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(":  ");
        sb3.append(oiVar.f25766b);
        tbVar.setText(sb3);
    }

    public void setIsDarkTheme(boolean z10) {
        TextView textView = this.f30235c;
        tb tbVar = this.f30234b;
        if (z10) {
            org.telegram.ui.ActionBar.q6.q(tbVar);
            org.telegram.ui.ActionBar.q6.q(textView);
            tbVar.setTextColor(-1);
            textView.setTextColor(-4473925);
            return;
        }
        int i7 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.e6 e6Var = this.f30236e;
        org.telegram.ui.ActionBar.q6.U(tbVar, i7, e6Var);
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.A6, e6Var);
    }

    public void setText(String str) {
        a();
        this.f30233a.setVisibility(4);
        this.f30235c.setVisibility(4);
        this.f30234b.setText(str);
    }

    public void setUser(TLRPC.User user) {
        a();
        tb tbVar = this.f30234b;
        org.telegram.ui.Components.i9 i9Var = this.f30233a;
        TextView textView = this.f30235c;
        if (user == null) {
            tbVar.setText("");
            textView.setText("");
            i9Var.setImageDrawable(null);
            return;
        }
        org.telegram.ui.Components.t8 t8Var = this.d;
        t8Var.r(user);
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        if (userProfilePhoto != null && userProfilePhoto.photo_small != null) {
            i9Var.f(user, t8Var);
        } else {
            i9Var.setImageDrawable(t8Var);
        }
        tbVar.setText(q10.p(user));
        if (q10.n(user) != null) {
            textView.setText("@" + q10.n(user));
        } else {
            textView.setText("");
        }
        i9Var.setVisibility(0);
        textView.setVisibility(0);
    }
}
