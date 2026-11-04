package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import ci.ec;
import org.telegram.messenger.h10;
import org.telegram.messenger.hi;
import org.telegram.messenger.l10;
import org.telegram.tgnet.TLRPC;
public final class f5 extends LinearLayout {
    public final org.telegram.ui.Components.k9 f29174a;
    public final ec f29175b;
    public final TextView f29176c;
    public final org.telegram.ui.Components.u8 d;
    public final org.telegram.ui.ActionBar.e6 f29177e;
    public Drawable f29178f;
    public boolean h;
    public boolean f29179n;

    public f5(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.h = false;
        this.f29177e = e6Var;
        setOrientation(0);
        org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        this.d = u8Var;
        u8Var.u(org.telegram.messenger.g0.L(18.0f));
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.f29174a = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(14.0f));
        addView(k9Var, mf.k(8.0f, 4.0f, 0.0f, 0.0f, 28, 28));
        ec ecVar = new ec(context, 7);
        this.f29175b = ecVar;
        org.telegram.ui.ActionBar.r6.V(ecVar, org.telegram.ui.ActionBar.k6.G6, e6Var);
        ecVar.setTextSize(1, 15.0f);
        ecVar.setSingleLine(true);
        ecVar.setGravity(3);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        ecVar.setEllipsize(truncateAt);
        addView(ecVar, mf.t(-2, -2, 16, 12, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f29176c = textView;
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.A6, e6Var);
        textView.setTextSize(1, 15.0f);
        textView.setSingleLine(true);
        textView.setGravity(3);
        textView.setEllipsize(truncateAt);
        addView(textView, mf.t(-2, -2, 16, 12, 0, 8, 0));
    }

    public final void a() {
        this.f29175b.setPadding(0, 0, 0, 0);
        Drawable drawable = this.f29178f;
        if (drawable != null) {
            if (drawable instanceof org.telegram.ui.Components.g5) {
                ((org.telegram.ui.Components.g5) drawable).n(this);
            }
            this.f29178f = null;
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        super.dispatchDraw(canvas);
        Drawable drawable = this.f29178f;
        if (drawable != null) {
            if (drawable instanceof org.telegram.ui.Components.g5) {
                f10 = 24.0f;
            } else {
                f10 = 20.0f;
            }
            int L = org.telegram.messenger.g0.L(f10);
            if (this.f29178f instanceof org.telegram.ui.Components.g5) {
                f11 = -2.0f;
            } else {
                f11 = 0.0f;
            }
            int L2 = org.telegram.messenger.g0.L(f11);
            Drawable drawable2 = this.f29178f;
            ec ecVar = this.f29175b;
            drawable2.setBounds(ecVar.getLeft() + L2, ((ecVar.getBottom() + ecVar.getTop()) - L) / 2, ecVar.getLeft() + L2 + L, ((ecVar.getBottom() + ecVar.getTop()) + L) / 2);
            Drawable drawable3 = this.f29178f;
            if (drawable3 instanceof org.telegram.ui.Components.g5) {
                ((org.telegram.ui.Components.g5) drawable3).p(System.currentTimeMillis());
            }
            this.f29178f.draw(canvas);
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f29175b.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f29179n = true;
        Drawable drawable = this.f29178f;
        if (drawable instanceof org.telegram.ui.Components.g5) {
            ((org.telegram.ui.Components.g5) drawable).a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f29179n = false;
        Drawable drawable = this.f29178f;
        if (drawable instanceof org.telegram.ui.Components.g5) {
            ((org.telegram.ui.Components.g5) drawable).n(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.h) {
            canvas.drawLine(org.telegram.messenger.g0.L(52.0f), getHeight() - 1, getWidth() - org.telegram.messenger.g0.L(8.0f), getHeight() - 1, org.telegram.ui.ActionBar.k6.f28002k0);
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(36.0f), 1073741824));
    }

    public void setChat(TLRPC.Chat chat) {
        a();
        ec ecVar = this.f29175b;
        org.telegram.ui.Components.k9 k9Var = this.f29174a;
        TextView textView = this.f29176c;
        if (chat == null) {
            ecVar.setText("");
            textView.setText("");
            k9Var.setImageDrawable(null);
            return;
        }
        org.telegram.ui.Components.u8 u8Var = this.d;
        u8Var.q(chat);
        TLRPC.ChatPhoto chatPhoto = chat.photo;
        if (chatPhoto != null && chatPhoto.photo_small != null) {
            k9Var.e(chat, u8Var);
        } else {
            k9Var.setImageDrawable(u8Var);
        }
        ecVar.setText(chat.title);
        String K = org.telegram.messenger.t3.K(chat, false);
        if (K != null) {
            textView.setText("@".concat(K));
        } else {
            textView.setText("");
        }
        k9Var.setVisibility(0);
        textView.setVisibility(0);
    }

    public void setDivider(boolean z10) {
        if (z10 != this.h) {
            this.h = z10;
            setWillNotDraw(!z10);
            invalidate();
        }
    }

    public void setEmojiSuggestion(hi hiVar) {
        this.f29174a.setVisibility(4);
        this.f29176c.setVisibility(4);
        String str = hiVar.f22931a;
        if (str != null && str.startsWith("animated_")) {
            try {
                Drawable drawable = this.f29178f;
                if (drawable instanceof org.telegram.ui.Components.g5) {
                    ((org.telegram.ui.Components.g5) drawable).n(this);
                    this.f29178f = null;
                }
                org.telegram.ui.Components.g5 m10 = org.telegram.ui.Components.g5.m(h10.f22829t0, Long.parseLong(hiVar.f22931a.substring(9)), null, 0);
                this.f29178f = m10;
                if (this.f29179n) {
                    m10.a(this);
                }
            } catch (Exception unused) {
                this.f29178f = org.telegram.messenger.i6.g(hiVar.f22931a);
            }
        } else {
            this.f29178f = org.telegram.messenger.i6.g(hiVar.f22931a);
        }
        Drawable drawable2 = this.f29178f;
        ec ecVar = this.f29175b;
        if (drawable2 == null) {
            ecVar.setPadding(0, 0, 0, 0);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(hiVar.f22931a);
            sb2.append(":  ");
            sb2.append(hiVar.f22932b);
            ecVar.setText(sb2);
            return;
        }
        ecVar.setPadding(org.telegram.messenger.g0.L(22.0f), 0, 0, 0);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(":  ");
        sb3.append(hiVar.f22932b);
        ecVar.setText(sb3);
    }

    public void setIsDarkTheme(boolean z10) {
        TextView textView = this.f29176c;
        ec ecVar = this.f29175b;
        if (z10) {
            org.telegram.ui.ActionBar.r6.r(ecVar);
            org.telegram.ui.ActionBar.r6.r(textView);
            ecVar.setTextColor(-1);
            textView.setTextColor(-4473925);
            return;
        }
        int i3 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.e6 e6Var = this.f29177e;
        org.telegram.ui.ActionBar.r6.V(ecVar, i3, e6Var);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.A6, e6Var);
    }

    public void setText(String str) {
        a();
        this.f29174a.setVisibility(4);
        this.f29176c.setVisibility(4);
        this.f29175b.setText(str);
    }

    public void setUser(TLRPC.User user) {
        a();
        ec ecVar = this.f29175b;
        org.telegram.ui.Components.k9 k9Var = this.f29174a;
        TextView textView = this.f29176c;
        if (user == null) {
            ecVar.setText("");
            textView.setText("");
            k9Var.setImageDrawable(null);
            return;
        }
        org.telegram.ui.Components.u8 u8Var = this.d;
        u8Var.r(user);
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        if (userProfilePhoto != null && userProfilePhoto.photo_small != null) {
            k9Var.e(user, u8Var);
        } else {
            k9Var.setImageDrawable(u8Var);
        }
        ecVar.setText(l10.p(user));
        if (l10.n(user) != null) {
            textView.setText("@" + l10.n(user));
        } else {
            textView.setText("");
        }
        k9Var.setVisibility(0);
        textView.setVisibility(0);
    }
}
