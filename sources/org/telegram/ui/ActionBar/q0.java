package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import c8.ha;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.xq;
public class q0 extends FrameLayout implements te.b, b6 {
    public int D;
    public int E;
    public xp F;
    public int G;
    public int H;
    public ColorFilter I;
    public int J;
    public final te.a f28392a;
    public xp f28393b;
    public final l9 f28394c;
    public final ImageView d;
    public final TextView f28395e;
    public jg.o0 f28396f;
    public final l2.a0 h;
    public final g6 f28397n;
    public boolean f28398r;
    public boolean f28399s;
    public int f28400w;
    public int f28401x;
    public xp f28402y;

    public q0(Context context, g6 g6Var) {
        super(context);
        this.f28392a = new te.a(0, this, xq.h, 380L, false);
        this.h = new l2.a0(this, 16);
        this.f28397n = g6Var;
        l9 l9Var = new l9(context);
        this.f28394c = l9Var;
        addView(l9Var, ha.c(32.0f, 32));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImageResource(2131231269);
        addView(imageView, ha.d(24, 24.0f, 16, 8.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f28395e = textView;
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(1, 14.0f);
        addView(textView, ha.d(-2, -2.0f, 16, 38.0f, 0.0f, 12.0f, 0.0f));
        this.f28401x = org.telegram.messenger.g0.L(28.0f);
        updateColors();
    }

    @Override
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            updateColors();
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        int i7 = this.f28401x;
        canvas.drawRoundRect(0.0f, 0.0f, width, height, i7, i7, l6.n0(this.f28400w));
        super.dispatchDraw(canvas);
    }

    public jg.o0 getFilter() {
        return this.f28396f;
    }

    @Override
    public void onMeasure(int i7, int i10) {
        if (this.f28399s) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(135.0f), Integer.MIN_VALUE), i10);
        } else {
            super.onMeasure(i7, i10);
        }
    }

    public void setData(jg.o0 o0Var) {
        this.f28396f = o0Var;
        this.f28399s = false;
        String str = o0Var.f16872c;
        if (str == null) {
            str = id.M0(o0Var.f16871b, null);
        }
        this.f28395e.setText(str);
        xp N = l6.N(org.telegram.messenger.g0.L(32.0f), o0Var.f16870a);
        this.f28393b = N;
        int i7 = l6.Ci;
        g6 g6Var = this.f28397n;
        l6.B1(N, l6.w0(i7, g6Var), false);
        xp xpVar = this.f28393b;
        int i10 = l6.Gi;
        l6.B1(xpVar, l6.w0(i10, g6Var), true);
        int i11 = o0Var.d;
        float f10 = 16.0f;
        l9 l9Var = this.f28394c;
        if (i11 == 4) {
            TLObject tLObject = o0Var.f16874f;
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                if (p10.i(p10.f24470s0).f().f27105id == user.f27105id) {
                    xp N2 = l6.N(org.telegram.messenger.g0.L(32.0f), 2131231000);
                    int L = org.telegram.messenger.g0.L(16.0f);
                    int L2 = org.telegram.messenger.g0.L(16.0f);
                    N2.f40447e = L;
                    N2.f40448f = L2;
                    l6.B1(N2, l6.w0(i7, g6Var), false);
                    l6.B1(N2, l6.w0(i10, g6Var), true);
                    l9Var.setImageDrawable(N2);
                    return;
                }
                l9Var.getImageReceiver().J0(org.telegram.messenger.g0.L(16.0f));
                l9Var.getImageReceiver().i0(user, this.f28393b, null);
            } else if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                this.f28399s = org.telegram.messenger.t3.Y(chat);
                ImageReceiver imageReceiver = l9Var.getImageReceiver();
                if (this.f28399s) {
                    f10 = 10.0f;
                }
                int L3 = org.telegram.messenger.g0.L(f10);
                this.f28401x = L3;
                imageReceiver.J0(L3);
                l9Var.getImageReceiver().i0(chat, this.f28393b, null);
            }
        } else if (i11 == 7) {
            xp N3 = l6.N(org.telegram.messenger.g0.L(32.0f), 2131230993);
            int L4 = org.telegram.messenger.g0.L(16.0f);
            int L5 = org.telegram.messenger.g0.L(16.0f);
            N3.f40447e = L4;
            N3.f40448f = L5;
            l6.B1(N3, l6.w0(i7, g6Var), false);
            l6.B1(N3, l6.w0(i10, g6Var), true);
            l9Var.setImageDrawable(N3);
            this.f28402y = N3;
            this.D = l6.w0(i7, g6Var);
            this.E = l6.w0(i10, g6Var);
        } else {
            l9Var.setImageDrawable(this.f28393b);
        }
    }

    public void setExpanded(boolean z9) {
        TextView textView = this.f28395e;
        if (z9) {
            textView.setVisibility(0);
            return;
        }
        textView.setVisibility(8);
        setSelectedForDelete(false);
    }

    public void setSelectedForDelete(boolean z9) {
        te.a aVar = this.f28392a;
        if (aVar.f55500f != z9) {
            l2.a0 a0Var = this.h;
            org.telegram.messenger.g0.r(a0Var);
            aVar.a(z9, true);
            if (z9) {
                org.telegram.messenger.g0.i3(a0Var, 2000L);
            }
        }
    }

    @Override
    public final void updateColors() {
        int w02;
        float f10 = this.f28392a.f55499e;
        boolean z9 = this.f28398r;
        g6 g6Var = this.f28397n;
        if (z9) {
            w02 = l6.r1(0.075f, l6.w0(l6.G6, g6Var));
        } else {
            w02 = l6.w0(l6.Qi, g6Var);
        }
        int i7 = l6.Ci;
        int w03 = l6.w0(i7, g6Var);
        int w04 = l6.w0(l6.G6, g6Var);
        int i10 = l6.Gi;
        int w05 = l6.w0(i10, g6Var);
        this.f28400w = i0.a.f(f10, w02, w03);
        this.f28395e.setTextColor(i0.a.f(f10, w04, w05));
        ImageView imageView = this.d;
        if (imageView.getColorFilter() != this.I || this.J != w05) {
            imageView.setColorFilter(w05);
            this.I = imageView.getColorFilter();
            this.J = w05;
        }
        imageView.setAlpha(f10);
        float f11 = 0.82f * f10;
        imageView.setScaleX(f11);
        imageView.setScaleY(f11);
        int w06 = l6.w0(i7, g6Var);
        int w07 = l6.w0(i10, g6Var);
        xp xpVar = this.f28393b;
        if (xpVar != null && (xpVar != this.F || w06 != this.G || w07 != this.H)) {
            l6.B1(xpVar, w06, false);
            l6.B1(this.f28393b, w07, true);
            this.F = this.f28393b;
            this.G = w06;
            this.H = w07;
        }
        float f12 = 1.0f - f10;
        l9 l9Var = this.f28394c;
        l9Var.setAlpha(f12);
        jg.o0 o0Var = this.f28396f;
        if (o0Var != null && o0Var.d == 7) {
            xp xpVar2 = this.f28402y;
            if (xpVar2 != null) {
                if (w06 != this.D || w07 != this.E) {
                    l6.B1(xpVar2, w06, false);
                    l6.B1(this.f28402y, w07, true);
                    this.D = w06;
                    this.E = w07;
                    l9Var.invalidate();
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
    public final void F(float f10, int i7) {
    }
}
