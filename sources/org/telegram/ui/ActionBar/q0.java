package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import c8.ma;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.q9;
public class q0 extends FrameLayout implements te.b, c6 {
    public int E;
    public int F;
    public mq G;
    public int H;
    public int I;
    public ColorFilter J;
    public int K;
    public final te.a f29879a;
    public mq f29880b;
    public final q9 f29881c;
    public final ImageView d;
    public final TextView f29882e;
    public jg.o0 f29883f;
    public final oi.a2 h;
    public final i6 f29884n;
    public boolean f29885r;
    public boolean f29886s;
    public int f29887w;
    public int f29888x;
    public mq f29889y;

    public q0(Context context, i6 i6Var) {
        super(context);
        this.f29879a = new te.a(0, this, lr.h, 380L, false);
        this.h = new oi.a2(this, 3);
        this.f29884n = i6Var;
        q9 q9Var = new q9(context);
        this.f29881c = q9Var;
        addView(q9Var, ma.c(32.0f, 32));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImageResource(2131231269);
        addView(imageView, ma.d(24, 24.0f, 16, 8.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f29882e = textView;
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(1, 14.0f);
        addView(textView, ma.d(-2, -2.0f, 16, 38.0f, 0.0f, 12.0f, 0.0f));
        this.f29888x = org.telegram.messenger.g0.L(28.0f);
        updateColors();
    }

    @Override
    public final void H(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            updateColors();
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        int i7 = this.f29888x;
        canvas.drawRoundRect(0.0f, 0.0f, width, height, i7, i7, n6.n0(this.f29887w));
        super.dispatchDraw(canvas);
    }

    public jg.o0 getFilter() {
        return this.f29883f;
    }

    @Override
    public void onMeasure(int i7, int i10) {
        if (this.f29886s) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(135.0f), Integer.MIN_VALUE), i10);
        } else {
            super.onMeasure(i7, i10);
        }
    }

    public void setData(jg.o0 o0Var) {
        this.f29883f = o0Var;
        this.f29886s = false;
        String str = o0Var.f17604c;
        if (str == null) {
            str = gd.M0(o0Var.f17603b, null);
        }
        this.f29882e.setText(str);
        mq N = n6.N(org.telegram.messenger.g0.L(32.0f), o0Var.f17602a);
        this.f29880b = N;
        int i7 = n6.Fi;
        i6 i6Var = this.f29884n;
        n6.B1(N, n6.w0(i7, i6Var), false);
        mq mqVar = this.f29880b;
        int i10 = n6.Ji;
        n6.B1(mqVar, n6.w0(i10, i6Var), true);
        int i11 = o0Var.d;
        float f10 = 16.0f;
        q9 q9Var = this.f29881c;
        if (i11 == 4) {
            TLObject tLObject = o0Var.f17606f;
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                if (j10.i(j10.f24770t0).f().f28552id == user.f28552id) {
                    mq N2 = n6.N(org.telegram.messenger.g0.L(32.0f), 2131231000);
                    int L = org.telegram.messenger.g0.L(16.0f);
                    int L2 = org.telegram.messenger.g0.L(16.0f);
                    N2.f37610e = L;
                    N2.f37611f = L2;
                    n6.B1(N2, n6.w0(i7, i6Var), false);
                    n6.B1(N2, n6.w0(i10, i6Var), true);
                    q9Var.setImageDrawable(N2);
                    return;
                }
                q9Var.getImageReceiver().J0(org.telegram.messenger.g0.L(16.0f));
                q9Var.getImageReceiver().i0(user, this.f29880b, null);
            } else if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                this.f29886s = org.telegram.messenger.v3.Y(chat);
                ImageReceiver imageReceiver = q9Var.getImageReceiver();
                if (this.f29886s) {
                    f10 = 10.0f;
                }
                int L3 = org.telegram.messenger.g0.L(f10);
                this.f29888x = L3;
                imageReceiver.J0(L3);
                q9Var.getImageReceiver().i0(chat, this.f29880b, null);
            }
        } else if (i11 == 7) {
            mq N3 = n6.N(org.telegram.messenger.g0.L(32.0f), 2131230993);
            int L4 = org.telegram.messenger.g0.L(16.0f);
            int L5 = org.telegram.messenger.g0.L(16.0f);
            N3.f37610e = L4;
            N3.f37611f = L5;
            n6.B1(N3, n6.w0(i7, i6Var), false);
            n6.B1(N3, n6.w0(i10, i6Var), true);
            q9Var.setImageDrawable(N3);
            this.f29889y = N3;
            this.E = n6.w0(i7, i6Var);
            this.F = n6.w0(i10, i6Var);
        } else {
            q9Var.setImageDrawable(this.f29880b);
        }
    }

    public void setExpanded(boolean z10) {
        TextView textView = this.f29882e;
        if (z10) {
            textView.setVisibility(0);
            return;
        }
        textView.setVisibility(8);
        setSelectedForDelete(false);
    }

    public void setSelectedForDelete(boolean z10) {
        te.a aVar = this.f29879a;
        if (aVar.f57658f != z10) {
            oi.a2 a2Var = this.h;
            org.telegram.messenger.g0.r(a2Var);
            aVar.a(z10, true);
            if (z10) {
                org.telegram.messenger.g0.h3(a2Var, 2000L);
            }
        }
    }

    @Override
    public final void updateColors() {
        int w02;
        float f10 = this.f29879a.f57657e;
        boolean z10 = this.f29885r;
        i6 i6Var = this.f29884n;
        if (z10) {
            w02 = n6.r1(0.075f, n6.w0(n6.G6, i6Var));
        } else {
            w02 = n6.w0(n6.Ti, i6Var);
        }
        int i7 = n6.Fi;
        int w03 = n6.w0(i7, i6Var);
        int w04 = n6.w0(n6.G6, i6Var);
        int i10 = n6.Ji;
        int w05 = n6.w0(i10, i6Var);
        this.f29887w = i0.a.f(f10, w02, w03);
        this.f29882e.setTextColor(i0.a.f(f10, w04, w05));
        ImageView imageView = this.d;
        if (imageView.getColorFilter() != this.J || this.K != w05) {
            imageView.setColorFilter(w05);
            this.J = imageView.getColorFilter();
            this.K = w05;
        }
        imageView.setAlpha(f10);
        float f11 = 0.82f * f10;
        imageView.setScaleX(f11);
        imageView.setScaleY(f11);
        int w06 = n6.w0(i7, i6Var);
        int w07 = n6.w0(i10, i6Var);
        mq mqVar = this.f29880b;
        if (mqVar != null && (mqVar != this.G || w06 != this.H || w07 != this.I)) {
            n6.B1(mqVar, w06, false);
            n6.B1(this.f29880b, w07, true);
            this.G = this.f29880b;
            this.H = w06;
            this.I = w07;
        }
        float f12 = 1.0f - f10;
        q9 q9Var = this.f29881c;
        q9Var.setAlpha(f12);
        jg.o0 o0Var = this.f29883f;
        if (o0Var != null && o0Var.d == 7) {
            mq mqVar2 = this.f29889y;
            if (mqVar2 != null) {
                if (w06 != this.E || w07 != this.F) {
                    n6.B1(mqVar2, w06, false);
                    n6.B1(this.f29889y, w07, true);
                    this.E = w06;
                    this.F = w07;
                    q9Var.invalidate();
                }
            } else {
                setData(o0Var);
            }
        }
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void D(float f10, int i7) {
    }
}
