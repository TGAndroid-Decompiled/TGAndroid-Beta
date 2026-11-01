package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.e20;
import org.telegram.messenger.i20;
import org.telegram.messenger.ri;
import org.telegram.tgnet.TLRPC;
public final class j5 extends LinearLayout {
    public final org.telegram.ui.Components.g9 f22085a;
    public final ag.j3 f22086b;
    public final TextView f22087c;
    public final org.telegram.ui.Components.r8 d;
    public final org.telegram.ui.ActionBar.p6 e;
    public Drawable f22088f;
    public boolean h;
    public boolean f22089n;

    public j5(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.h = false;
        this.e = p6Var;
        setOrientation(0);
        org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        this.d = r8Var;
        r8Var.u(org.telegram.messenger.i0.L(18.0f));
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        this.f22085a = g9Var;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(14.0f));
        addView(g9Var, w7.b6.k(8.0f, 4.0f, 0.0f, 0.0f, 28, 28));
        ag.j3 j3Var = new ag.j3(context, 4);
        this.f22086b = j3Var;
        org.telegram.ui.ActionBar.a7.V(j3Var, org.telegram.ui.ActionBar.t6.G6, p6Var);
        j3Var.setTextSize(1, 15.0f);
        j3Var.setSingleLine(true);
        j3Var.setGravity(3);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        j3Var.setEllipsize(truncateAt);
        addView(j3Var, w7.b6.t(-2, -2, 16, 12, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f22087c = textView;
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.A6, p6Var);
        textView.setTextSize(1, 15.0f);
        textView.setSingleLine(true);
        textView.setGravity(3);
        textView.setEllipsize(truncateAt);
        addView(textView, w7.b6.t(-2, -2, 16, 12, 0, 8, 0));
    }

    public final void a() {
        this.f22086b.setPadding(0, 0, 0, 0);
        Drawable drawable = this.f22088f;
        if (drawable != null) {
            if (drawable instanceof org.telegram.ui.Components.f5) {
                ((org.telegram.ui.Components.f5) drawable).n(this);
            }
            this.f22088f = null;
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        float f10;
        super.dispatchDraw(canvas);
        Drawable drawable = this.f22088f;
        if (drawable != null) {
            if (drawable instanceof org.telegram.ui.Components.f5) {
                f7 = 24.0f;
            } else {
                f7 = 20.0f;
            }
            int L = org.telegram.messenger.i0.L(f7);
            if (this.f22088f instanceof org.telegram.ui.Components.f5) {
                f10 = -2.0f;
            } else {
                f10 = 0.0f;
            }
            int L2 = org.telegram.messenger.i0.L(f10);
            Drawable drawable2 = this.f22088f;
            ag.j3 j3Var = this.f22086b;
            drawable2.setBounds(j3Var.getLeft() + L2, ((j3Var.getBottom() + j3Var.getTop()) - L) / 2, j3Var.getLeft() + L2 + L, ((j3Var.getBottom() + j3Var.getTop()) + L) / 2);
            Drawable drawable3 = this.f22088f;
            if (drawable3 instanceof org.telegram.ui.Components.f5) {
                ((org.telegram.ui.Components.f5) drawable3).p(System.currentTimeMillis());
            }
            this.f22088f.draw(canvas);
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f22086b.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f22089n = true;
        Drawable drawable = this.f22088f;
        if (drawable instanceof org.telegram.ui.Components.f5) {
            ((org.telegram.ui.Components.f5) drawable).a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f22089n = false;
        Drawable drawable = this.f22088f;
        if (drawable instanceof org.telegram.ui.Components.f5) {
            ((org.telegram.ui.Components.f5) drawable).n(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.h) {
            canvas.drawLine(org.telegram.messenger.i0.L(52.0f), getHeight() - 1, getWidth() - org.telegram.messenger.i0.L(8.0f), getHeight() - 1, org.telegram.ui.ActionBar.t6.f21053k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(36.0f), 1073741824));
    }

    public void setChat(TLRPC.Chat chat) {
        a();
        ag.j3 j3Var = this.f22086b;
        org.telegram.ui.Components.g9 g9Var = this.f22085a;
        TextView textView = this.f22087c;
        if (chat == null) {
            j3Var.setText("");
            textView.setText("");
            g9Var.setImageDrawable(null);
            return;
        }
        org.telegram.ui.Components.r8 r8Var = this.d;
        r8Var.q(chat);
        TLRPC.ChatPhoto chatPhoto = chat.photo;
        if (chatPhoto != null && chatPhoto.photo_small != null) {
            g9Var.e(chat, r8Var);
        } else {
            g9Var.setImageDrawable(r8Var);
        }
        j3Var.setText(chat.title);
        String K = org.telegram.messenger.w3.K(chat, false);
        if (K != null) {
            textView.setText("@".concat(K));
        } else {
            textView.setText("");
        }
        g9Var.setVisibility(0);
        textView.setVisibility(0);
    }

    public void setDivider(boolean z10) {
        if (z10 != this.h) {
            this.h = z10;
            setWillNotDraw(!z10);
            invalidate();
        }
    }

    public void setEmojiSuggestion(ri riVar) {
        this.f22085a.setVisibility(4);
        this.f22087c.setVisibility(4);
        String str = riVar.f17936a;
        if (str != null && str.startsWith("animated_")) {
            try {
                Drawable drawable = this.f22088f;
                if (drawable instanceof org.telegram.ui.Components.f5) {
                    ((org.telegram.ui.Components.f5) drawable).n(this);
                    this.f22088f = null;
                }
                org.telegram.ui.Components.f5 m10 = org.telegram.ui.Components.f5.m(e20.f15506s0, Long.parseLong(riVar.f17936a.substring(9)), null, 0);
                this.f22088f = m10;
                if (this.f22089n) {
                    m10.a(this);
                }
            } catch (Exception unused) {
                this.f22088f = org.telegram.messenger.k6.g(riVar.f17936a);
            }
        } else {
            this.f22088f = org.telegram.messenger.k6.g(riVar.f17936a);
        }
        Drawable drawable2 = this.f22088f;
        ag.j3 j3Var = this.f22086b;
        if (drawable2 == null) {
            j3Var.setPadding(0, 0, 0, 0);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(riVar.f17936a);
            sb2.append(":  ");
            sb2.append(riVar.f17937b);
            j3Var.setText(sb2);
            return;
        }
        j3Var.setPadding(org.telegram.messenger.i0.L(22.0f), 0, 0, 0);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(":  ");
        sb3.append(riVar.f17937b);
        j3Var.setText(sb3);
    }

    public void setIsDarkTheme(boolean z10) {
        TextView textView = this.f22087c;
        ag.j3 j3Var = this.f22086b;
        if (z10) {
            org.telegram.ui.ActionBar.a7.r(j3Var);
            org.telegram.ui.ActionBar.a7.r(textView);
            j3Var.setTextColor(-1);
            textView.setTextColor(-4473925);
            return;
        }
        int i10 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.p6 p6Var = this.e;
        org.telegram.ui.ActionBar.a7.V(j3Var, i10, p6Var);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.A6, p6Var);
    }

    public void setText(String str) {
        a();
        this.f22085a.setVisibility(4);
        this.f22087c.setVisibility(4);
        this.f22086b.setText(str);
    }

    public void setUser(TLRPC.User user) {
        a();
        ag.j3 j3Var = this.f22086b;
        org.telegram.ui.Components.g9 g9Var = this.f22085a;
        TextView textView = this.f22087c;
        if (user == null) {
            j3Var.setText("");
            textView.setText("");
            g9Var.setImageDrawable(null);
            return;
        }
        org.telegram.ui.Components.r8 r8Var = this.d;
        r8Var.r(user);
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        if (userProfilePhoto != null && userProfilePhoto.photo_small != null) {
            g9Var.e(user, r8Var);
        } else {
            g9Var.setImageDrawable(r8Var);
        }
        j3Var.setText(i20.p(user));
        if (i20.n(user) != null) {
            textView.setText("@" + i20.n(user));
        } else {
            textView.setText("");
        }
        g9Var.setVisibility(0);
        textView.setVisibility(0);
    }
}
