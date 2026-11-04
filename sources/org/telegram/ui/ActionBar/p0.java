package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import b8.mf;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.xq;
public class p0 extends FrameLayout implements qe.b, z5 {
    public int E;
    public int F;
    public xp G;
    public int H;
    public int I;
    public ColorFilter J;
    public int K;
    public final qe.a f28406a;
    public xp f28407b;
    public final k9 f28408c;
    public final ImageView d;
    public final TextView f28409e;
    public kg.l0 f28410f;
    public final lg.n h;
    public final e6 f28411n;
    public boolean f28412r;
    public boolean f28413s;
    public int f28414w;
    public int f28415x;
    public xp f28416y;

    public p0(Context context, e6 e6Var) {
        super(context);
        this.f28406a = new qe.a(0, this, xq.h, 380L, false);
        this.h = new lg.n(this, 20);
        this.f28411n = e6Var;
        k9 k9Var = new k9(context);
        this.f28408c = k9Var;
        addView(k9Var, mf.c(32.0f, 32));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImageResource(2131231269);
        addView(imageView, mf.d(24, 24.0f, 16, 8.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f28409e = textView;
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(1, 14.0f);
        addView(textView, mf.d(-2, -2.0f, 16, 38.0f, 0.0f, 12.0f, 0.0f));
        this.f28415x = org.telegram.messenger.g0.L(28.0f);
        updateColors();
    }

    @Override
    public final void Y(int i3, float f10, float f11, qe.c cVar) {
        if (i3 == 0) {
            updateColors();
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        int i3 = this.f28415x;
        canvas.drawRoundRect(0.0f, 0.0f, width, height, i3, i3, k6.n0(this.f28414w));
        super.dispatchDraw(canvas);
    }

    public kg.l0 getFilter() {
        return this.f28410f;
    }

    @Override
    public void onMeasure(int i3, int i10) {
        if (this.f28413s) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(135.0f), Integer.MIN_VALUE), i10);
        } else {
            super.onMeasure(i3, i10);
        }
    }

    public void setData(kg.l0 l0Var) {
        this.f28410f = l0Var;
        this.f28413s = false;
        String str = l0Var.f17082c;
        if (str == null) {
            str = bd.M0(l0Var.f17081b, null);
        }
        this.f28409e.setText(str);
        xp N = k6.N(org.telegram.messenger.g0.L(32.0f), l0Var.f17080a);
        this.f28407b = N;
        int i3 = k6.Ci;
        e6 e6Var = this.f28411n;
        k6.B1(N, k6.w0(i3, e6Var), false);
        xp xpVar = this.f28407b;
        int i10 = k6.Gi;
        k6.B1(xpVar, k6.w0(i10, e6Var), true);
        int i11 = l0Var.d;
        float f10 = 16.0f;
        k9 k9Var = this.f28408c;
        if (i11 == 4) {
            TLObject tLObject = l0Var.f17084f;
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                if (h10.i(h10.f22829t0).f().f27150id == user.f27150id) {
                    xp N2 = k6.N(org.telegram.messenger.g0.L(32.0f), 2131231000);
                    int L = org.telegram.messenger.g0.L(16.0f);
                    int L2 = org.telegram.messenger.g0.L(16.0f);
                    N2.f40441e = L;
                    N2.f40442f = L2;
                    k6.B1(N2, k6.w0(i3, e6Var), false);
                    k6.B1(N2, k6.w0(i10, e6Var), true);
                    k9Var.setImageDrawable(N2);
                    return;
                }
                k9Var.getImageReceiver().J0(org.telegram.messenger.g0.L(16.0f));
                k9Var.getImageReceiver().i0(user, this.f28407b, null);
            } else if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                this.f28413s = org.telegram.messenger.t3.Y(chat);
                ImageReceiver imageReceiver = k9Var.getImageReceiver();
                if (this.f28413s) {
                    f10 = 10.0f;
                }
                int L3 = org.telegram.messenger.g0.L(f10);
                this.f28415x = L3;
                imageReceiver.J0(L3);
                k9Var.getImageReceiver().i0(chat, this.f28407b, null);
            }
        } else if (i11 == 7) {
            xp N3 = k6.N(org.telegram.messenger.g0.L(32.0f), 2131230993);
            int L4 = org.telegram.messenger.g0.L(16.0f);
            int L5 = org.telegram.messenger.g0.L(16.0f);
            N3.f40441e = L4;
            N3.f40442f = L5;
            k6.B1(N3, k6.w0(i3, e6Var), false);
            k6.B1(N3, k6.w0(i10, e6Var), true);
            k9Var.setImageDrawable(N3);
            this.f28416y = N3;
            this.E = k6.w0(i3, e6Var);
            this.F = k6.w0(i10, e6Var);
        } else {
            k9Var.setImageDrawable(this.f28407b);
        }
    }

    public void setExpanded(boolean z10) {
        TextView textView = this.f28409e;
        if (z10) {
            textView.setVisibility(0);
            return;
        }
        textView.setVisibility(8);
        setSelectedForDelete(false);
    }

    public void setSelectedForDelete(boolean z10) {
        qe.a aVar = this.f28406a;
        if (aVar.f53841f != z10) {
            lg.n nVar = this.h;
            org.telegram.messenger.g0.r(nVar);
            aVar.a(z10, true);
            if (z10) {
                org.telegram.messenger.g0.i3(nVar, 2000L);
            }
        }
    }

    @Override
    public final void updateColors() {
        int w02;
        float f10 = this.f28406a.f53840e;
        boolean z10 = this.f28412r;
        e6 e6Var = this.f28411n;
        if (z10) {
            w02 = k6.r1(0.075f, k6.w0(k6.G6, e6Var));
        } else {
            w02 = k6.w0(k6.Qi, e6Var);
        }
        int i3 = k6.Ci;
        int w03 = k6.w0(i3, e6Var);
        int w04 = k6.w0(k6.G6, e6Var);
        int i10 = k6.Gi;
        int w05 = k6.w0(i10, e6Var);
        this.f28414w = i0.a.f(f10, w02, w03);
        this.f28409e.setTextColor(i0.a.f(f10, w04, w05));
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
        int w06 = k6.w0(i3, e6Var);
        int w07 = k6.w0(i10, e6Var);
        xp xpVar = this.f28407b;
        if (xpVar != null && (xpVar != this.G || w06 != this.H || w07 != this.I)) {
            k6.B1(xpVar, w06, false);
            k6.B1(this.f28407b, w07, true);
            this.G = this.f28407b;
            this.H = w06;
            this.I = w07;
        }
        float f12 = 1.0f - f10;
        k9 k9Var = this.f28408c;
        k9Var.setAlpha(f12);
        kg.l0 l0Var = this.f28410f;
        if (l0Var != null && l0Var.d == 7) {
            xp xpVar2 = this.f28416y;
            if (xpVar2 != null) {
                if (w06 != this.E || w07 != this.F) {
                    k6.B1(xpVar2, w06, false);
                    k6.B1(this.f28416y, w07, true);
                    this.E = w06;
                    this.F = w07;
                    k9Var.invalidate();
                }
            } else {
                setData(l0Var);
            }
        }
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void F(float f10, int i3) {
    }
}
