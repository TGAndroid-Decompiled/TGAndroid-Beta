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
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.q9;
public class p0 extends FrameLayout implements te.b, b6 {
    public int E;
    public int F;
    public oq G;
    public int H;
    public int I;
    public ColorFilter J;
    public int K;
    public final te.a f29865a;
    public oq f29866b;
    public final q9 f29867c;
    public final ImageView d;
    public final TextView f29868e;
    public jg.o0 f29869f;
    public final oi.c2 h;
    public final h6 f29870n;
    public boolean f29871r;
    public boolean f29872s;
    public int f29873w;
    public int f29874x;
    public oq f29875y;

    public p0(Context context, h6 h6Var) {
        super(context);
        this.f29865a = new te.a(0, this, nr.h, 380L, false);
        this.h = new oi.c2(this, 3);
        this.f29870n = h6Var;
        q9 q9Var = new q9(context);
        this.f29867c = q9Var;
        addView(q9Var, ma.c(32.0f, 32));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImageResource(2131231269);
        addView(imageView, ma.d(24, 24.0f, 16, 8.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f29868e = textView;
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(1, 14.0f);
        addView(textView, ma.d(-2, -2.0f, 16, 38.0f, 0.0f, 12.0f, 0.0f));
        this.f29874x = org.telegram.messenger.g0.L(28.0f);
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
        int i7 = this.f29874x;
        canvas.drawRoundRect(0.0f, 0.0f, width, height, i7, i7, m6.n0(this.f29873w));
        super.dispatchDraw(canvas);
    }

    public jg.o0 getFilter() {
        return this.f29869f;
    }

    @Override
    public void onMeasure(int i7, int i10) {
        if (this.f29872s) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(135.0f), Integer.MIN_VALUE), i10);
        } else {
            super.onMeasure(i7, i10);
        }
    }

    public void setData(jg.o0 o0Var) {
        this.f29869f = o0Var;
        this.f29872s = false;
        String str = o0Var.f17632c;
        if (str == null) {
            str = hd.N0(o0Var.f17631b, null);
        }
        this.f29868e.setText(str);
        oq N = m6.N(org.telegram.messenger.g0.L(32.0f), o0Var.f17630a);
        this.f29866b = N;
        int i7 = m6.Fi;
        h6 h6Var = this.f29870n;
        m6.B1(N, m6.w0(i7, h6Var), false);
        oq oqVar = this.f29866b;
        int i10 = m6.Ji;
        m6.B1(oqVar, m6.w0(i10, h6Var), true);
        int i11 = o0Var.d;
        float f10 = 16.0f;
        q9 q9Var = this.f29867c;
        if (i11 == 4) {
            TLObject tLObject = o0Var.f17634f;
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                if (k10.i(k10.f24968t0).f().f28583id == user.f28583id) {
                    oq N2 = m6.N(org.telegram.messenger.g0.L(32.0f), 2131231000);
                    int L = org.telegram.messenger.g0.L(16.0f);
                    int L2 = org.telegram.messenger.g0.L(16.0f);
                    N2.f38333e = L;
                    N2.f38334f = L2;
                    m6.B1(N2, m6.w0(i7, h6Var), false);
                    m6.B1(N2, m6.w0(i10, h6Var), true);
                    q9Var.setImageDrawable(N2);
                    return;
                }
                q9Var.getImageReceiver().J0(org.telegram.messenger.g0.L(16.0f));
                q9Var.getImageReceiver().i0(user, this.f29866b, null);
            } else if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                this.f29872s = org.telegram.messenger.v3.Y(chat);
                ImageReceiver imageReceiver = q9Var.getImageReceiver();
                if (this.f29872s) {
                    f10 = 10.0f;
                }
                int L3 = org.telegram.messenger.g0.L(f10);
                this.f29874x = L3;
                imageReceiver.J0(L3);
                q9Var.getImageReceiver().i0(chat, this.f29866b, null);
            }
        } else if (i11 == 7) {
            oq N3 = m6.N(org.telegram.messenger.g0.L(32.0f), 2131230993);
            int L4 = org.telegram.messenger.g0.L(16.0f);
            int L5 = org.telegram.messenger.g0.L(16.0f);
            N3.f38333e = L4;
            N3.f38334f = L5;
            m6.B1(N3, m6.w0(i7, h6Var), false);
            m6.B1(N3, m6.w0(i10, h6Var), true);
            q9Var.setImageDrawable(N3);
            this.f29875y = N3;
            this.E = m6.w0(i7, h6Var);
            this.F = m6.w0(i10, h6Var);
        } else {
            q9Var.setImageDrawable(this.f29866b);
        }
    }

    public void setExpanded(boolean z10) {
        TextView textView = this.f29868e;
        if (z10) {
            textView.setVisibility(0);
            return;
        }
        textView.setVisibility(8);
        setSelectedForDelete(false);
    }

    public void setSelectedForDelete(boolean z10) {
        te.a aVar = this.f29865a;
        if (aVar.f57701f != z10) {
            oi.c2 c2Var = this.h;
            org.telegram.messenger.g0.r(c2Var);
            aVar.a(z10, true);
            if (z10) {
                org.telegram.messenger.g0.h3(c2Var, 2000L);
            }
        }
    }

    @Override
    public final void updateColors() {
        int w02;
        float f10 = this.f29865a.f57700e;
        boolean z10 = this.f29871r;
        h6 h6Var = this.f29870n;
        if (z10) {
            w02 = m6.r1(0.075f, m6.w0(m6.G6, h6Var));
        } else {
            w02 = m6.w0(m6.Ti, h6Var);
        }
        int i7 = m6.Fi;
        int w03 = m6.w0(i7, h6Var);
        int w04 = m6.w0(m6.G6, h6Var);
        int i10 = m6.Ji;
        int w05 = m6.w0(i10, h6Var);
        this.f29873w = i0.a.f(f10, w02, w03);
        this.f29868e.setTextColor(i0.a.f(f10, w04, w05));
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
        int w06 = m6.w0(i7, h6Var);
        int w07 = m6.w0(i10, h6Var);
        oq oqVar = this.f29866b;
        if (oqVar != null && (oqVar != this.G || w06 != this.H || w07 != this.I)) {
            m6.B1(oqVar, w06, false);
            m6.B1(this.f29866b, w07, true);
            this.G = this.f29866b;
            this.H = w06;
            this.I = w07;
        }
        float f12 = 1.0f - f10;
        q9 q9Var = this.f29867c;
        q9Var.setAlpha(f12);
        jg.o0 o0Var = this.f29869f;
        if (o0Var != null && o0Var.d == 7) {
            oq oqVar2 = this.f29875y;
            if (oqVar2 != null) {
                if (w06 != this.E || w07 != this.F) {
                    m6.B1(oqVar2, w06, false);
                    m6.B1(this.f29875y, w07, true);
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
