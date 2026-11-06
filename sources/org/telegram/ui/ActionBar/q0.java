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
import org.telegram.messenger.hd;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.xq;
public class q0 extends FrameLayout implements te.b, a6 {
    public int D;
    public int E;
    public xp F;
    public int G;
    public int H;
    public ColorFilter I;
    public int J;
    public final te.a f28383a;
    public xp f28384b;
    public final l9 f28385c;
    public final ImageView d;
    public final TextView f28386e;
    public jg.o0 f28387f;
    public final l2.w h;
    public final f6 f28388n;
    public boolean f28389r;
    public boolean f28390s;
    public int f28391w;
    public int f28392x;
    public xp f28393y;

    public q0(Context context, f6 f6Var) {
        super(context);
        this.f28383a = new te.a(0, this, xq.h, 380L, false);
        this.h = new l2.w(this, 17);
        this.f28388n = f6Var;
        l9 l9Var = new l9(context);
        this.f28385c = l9Var;
        addView(l9Var, ha.c(32.0f, 32));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImageResource(2131231269);
        addView(imageView, ha.d(24, 24.0f, 16, 8.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f28386e = textView;
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(1, 14.0f);
        addView(textView, ha.d(-2, -2.0f, 16, 38.0f, 0.0f, 12.0f, 0.0f));
        this.f28392x = org.telegram.messenger.g0.L(28.0f);
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
        int i7 = this.f28392x;
        canvas.drawRoundRect(0.0f, 0.0f, width, height, i7, i7, k6.n0(this.f28391w));
        super.dispatchDraw(canvas);
    }

    public jg.o0 getFilter() {
        return this.f28387f;
    }

    @Override
    public void onMeasure(int i7, int i10) {
        if (this.f28390s) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(135.0f), Integer.MIN_VALUE), i10);
        } else {
            super.onMeasure(i7, i10);
        }
    }

    public void setData(jg.o0 o0Var) {
        this.f28387f = o0Var;
        this.f28390s = false;
        String str = o0Var.f16869c;
        if (str == null) {
            str = hd.M0(o0Var.f16868b, null);
        }
        this.f28386e.setText(str);
        xp N = k6.N(org.telegram.messenger.g0.L(32.0f), o0Var.f16867a);
        this.f28384b = N;
        int i7 = k6.Ci;
        f6 f6Var = this.f28388n;
        k6.B1(N, k6.w0(i7, f6Var), false);
        xp xpVar = this.f28384b;
        int i10 = k6.Gi;
        k6.B1(xpVar, k6.w0(i10, f6Var), true);
        int i11 = o0Var.d;
        float f10 = 16.0f;
        l9 l9Var = this.f28385c;
        if (i11 == 4) {
            TLObject tLObject = o0Var.f16871f;
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                if (p10.i(p10.f24459s0).f().f27101id == user.f27101id) {
                    xp N2 = k6.N(org.telegram.messenger.g0.L(32.0f), 2131231000);
                    int L = org.telegram.messenger.g0.L(16.0f);
                    int L2 = org.telegram.messenger.g0.L(16.0f);
                    N2.f40299e = L;
                    N2.f40300f = L2;
                    k6.B1(N2, k6.w0(i7, f6Var), false);
                    k6.B1(N2, k6.w0(i10, f6Var), true);
                    l9Var.setImageDrawable(N2);
                    return;
                }
                l9Var.getImageReceiver().J0(org.telegram.messenger.g0.L(16.0f));
                l9Var.getImageReceiver().i0(user, this.f28384b, null);
            } else if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                this.f28390s = org.telegram.messenger.t3.Y(chat);
                ImageReceiver imageReceiver = l9Var.getImageReceiver();
                if (this.f28390s) {
                    f10 = 10.0f;
                }
                int L3 = org.telegram.messenger.g0.L(f10);
                this.f28392x = L3;
                imageReceiver.J0(L3);
                l9Var.getImageReceiver().i0(chat, this.f28384b, null);
            }
        } else if (i11 == 7) {
            xp N3 = k6.N(org.telegram.messenger.g0.L(32.0f), 2131230993);
            int L4 = org.telegram.messenger.g0.L(16.0f);
            int L5 = org.telegram.messenger.g0.L(16.0f);
            N3.f40299e = L4;
            N3.f40300f = L5;
            k6.B1(N3, k6.w0(i7, f6Var), false);
            k6.B1(N3, k6.w0(i10, f6Var), true);
            l9Var.setImageDrawable(N3);
            this.f28393y = N3;
            this.D = k6.w0(i7, f6Var);
            this.E = k6.w0(i10, f6Var);
        } else {
            l9Var.setImageDrawable(this.f28384b);
        }
    }

    public void setExpanded(boolean z9) {
        TextView textView = this.f28386e;
        if (z9) {
            textView.setVisibility(0);
            return;
        }
        textView.setVisibility(8);
        setSelectedForDelete(false);
    }

    public void setSelectedForDelete(boolean z9) {
        te.a aVar = this.f28383a;
        if (aVar.f55371f != z9) {
            l2.w wVar = this.h;
            org.telegram.messenger.g0.r(wVar);
            aVar.a(z9, true);
            if (z9) {
                org.telegram.messenger.g0.i3(wVar, 2000L);
            }
        }
    }

    @Override
    public final void updateColors() {
        int w02;
        float f10 = this.f28383a.f55370e;
        boolean z9 = this.f28389r;
        f6 f6Var = this.f28388n;
        if (z9) {
            w02 = k6.r1(0.075f, k6.w0(k6.G6, f6Var));
        } else {
            w02 = k6.w0(k6.Qi, f6Var);
        }
        int i7 = k6.Ci;
        int w03 = k6.w0(i7, f6Var);
        int w04 = k6.w0(k6.G6, f6Var);
        int i10 = k6.Gi;
        int w05 = k6.w0(i10, f6Var);
        this.f28391w = i0.a.f(f10, w02, w03);
        this.f28386e.setTextColor(i0.a.f(f10, w04, w05));
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
        int w06 = k6.w0(i7, f6Var);
        int w07 = k6.w0(i10, f6Var);
        xp xpVar = this.f28384b;
        if (xpVar != null && (xpVar != this.F || w06 != this.G || w07 != this.H)) {
            k6.B1(xpVar, w06, false);
            k6.B1(this.f28384b, w07, true);
            this.F = this.f28384b;
            this.G = w06;
            this.H = w07;
        }
        float f12 = 1.0f - f10;
        l9 l9Var = this.f28385c;
        l9Var.setAlpha(f12);
        jg.o0 o0Var = this.f28387f;
        if (o0Var != null && o0Var.d == 7) {
            xp xpVar2 = this.f28393y;
            if (xpVar2 != null) {
                if (w06 != this.D || w07 != this.E) {
                    k6.B1(xpVar2, w06, false);
                    k6.B1(this.f28393y, w07, true);
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
