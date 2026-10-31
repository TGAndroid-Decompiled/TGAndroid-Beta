package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.gr;
public class s0 extends FrameLayout implements fe.e, k6 {
    public int D;
    public int E;
    public eq F;
    public int G;
    public int H;
    public ColorFilter I;
    public int J;
    public final fe.b f20753a;
    public eq f20754b;
    public final g9 f20755c;
    public final ImageView d;
    public final TextView e;
    public zf.e0 f20756f;
    public final lg.s h;
    public final p6 f20757n;
    public boolean f20758r;
    public boolean f20759s;
    public int f20760w;
    public int f20761x;
    public eq f20762y;

    public s0(Context context, p6 p6Var) {
        super(context);
        this.f20753a = new fe.b(0, this, gr.h, 380L, false);
        this.h = new lg.s(this, 16);
        this.f20757n = p6Var;
        g9 g9Var = new g9(context);
        this.f20755c = g9Var;
        addView(g9Var, w7.b6.c(32.0f, 32));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImageResource(2131231270);
        addView(imageView, w7.b6.d(24, 24.0f, 16, 8.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(1, 14.0f);
        addView(textView, w7.b6.d(-2, -2.0f, 16, 38.0f, 0.0f, 12.0f, 0.0f));
        this.f20761x = org.telegram.messenger.i0.L(28.0f);
        updateColors();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        int i10 = this.f20761x;
        canvas.drawRoundRect(0.0f, 0.0f, width, height, i10, i10, t6.n0(this.f20760w));
        super.dispatchDraw(canvas);
    }

    public zf.e0 getFilter() {
        return this.f20756f;
    }

    @Override
    public void onMeasure(int i10, int i11) {
        if (this.f20759s) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(135.0f), Integer.MIN_VALUE), i11);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    public void setData(zf.e0 e0Var) {
        this.f20756f = e0Var;
        this.f20759s = false;
        String str = e0Var.f55477c;
        if (str == null) {
            str = cd.L0(e0Var.f55476b, null);
        }
        this.e.setText(str);
        eq N = t6.N(org.telegram.messenger.i0.L(32.0f), e0Var.f55475a);
        this.f20754b = N;
        int i10 = t6.Ci;
        p6 p6Var = this.f20757n;
        t6.B1(N, t6.w0(i10, p6Var), false);
        eq eqVar = this.f20754b;
        int i11 = t6.Gi;
        t6.B1(eqVar, t6.w0(i11, p6Var), true);
        int i12 = e0Var.d;
        float f7 = 16.0f;
        g9 g9Var = this.f20755c;
        if (i12 == 4) {
            TLObject tLObject = e0Var.f55478f;
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                if (d20.i(d20.f15147s0).f().f19942id == user.f19942id) {
                    eq N2 = t6.N(org.telegram.messenger.i0.L(32.0f), 2131231000);
                    int L = org.telegram.messenger.i0.L(16.0f);
                    int L2 = org.telegram.messenger.i0.L(16.0f);
                    N2.e = L;
                    N2.f25842f = L2;
                    t6.B1(N2, t6.w0(i10, p6Var), false);
                    t6.B1(N2, t6.w0(i11, p6Var), true);
                    g9Var.setImageDrawable(N2);
                    return;
                }
                g9Var.getImageReceiver().J0(org.telegram.messenger.i0.L(16.0f));
                g9Var.getImageReceiver().i0(user, this.f20754b, null);
            } else if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                this.f20759s = org.telegram.messenger.w3.Y(chat);
                ImageReceiver imageReceiver = g9Var.getImageReceiver();
                if (this.f20759s) {
                    f7 = 10.0f;
                }
                int L3 = org.telegram.messenger.i0.L(f7);
                this.f20761x = L3;
                imageReceiver.J0(L3);
                g9Var.getImageReceiver().i0(chat, this.f20754b, null);
            }
        } else if (i12 == 7) {
            eq N3 = t6.N(org.telegram.messenger.i0.L(32.0f), 2131230993);
            int L4 = org.telegram.messenger.i0.L(16.0f);
            int L5 = org.telegram.messenger.i0.L(16.0f);
            N3.e = L4;
            N3.f25842f = L5;
            t6.B1(N3, t6.w0(i10, p6Var), false);
            t6.B1(N3, t6.w0(i11, p6Var), true);
            g9Var.setImageDrawable(N3);
            this.f20762y = N3;
            this.D = t6.w0(i10, p6Var);
            this.E = t6.w0(i11, p6Var);
        } else {
            g9Var.setImageDrawable(this.f20754b);
        }
    }

    public void setExpanded(boolean z10) {
        TextView textView = this.e;
        if (z10) {
            textView.setVisibility(0);
            return;
        }
        textView.setVisibility(8);
        setSelectedForDelete(false);
    }

    public void setSelectedForDelete(boolean z10) {
        fe.b bVar = this.f20753a;
        if (bVar.f7021f != z10) {
            lg.s sVar = this.h;
            org.telegram.messenger.i0.r(sVar);
            bVar.a(z10, true);
            if (z10) {
                org.telegram.messenger.i0.h3(sVar, 2000L);
            }
        }
    }

    @Override
    public final void updateColors() {
        int w02;
        float f7 = this.f20753a.e;
        boolean z10 = this.f20758r;
        p6 p6Var = this.f20757n;
        if (z10) {
            w02 = t6.r1(0.075f, t6.w0(t6.G6, p6Var));
        } else {
            w02 = t6.w0(t6.Qi, p6Var);
        }
        int i10 = t6.Ci;
        int w03 = t6.w0(i10, p6Var);
        int w04 = t6.w0(t6.G6, p6Var);
        int i11 = t6.Gi;
        int w05 = t6.w0(i11, p6Var);
        this.f20760w = i0.b.f(f7, w02, w03);
        this.e.setTextColor(i0.b.f(f7, w04, w05));
        ImageView imageView = this.d;
        if (imageView.getColorFilter() != this.I || this.J != w05) {
            imageView.setColorFilter(w05);
            this.I = imageView.getColorFilter();
            this.J = w05;
        }
        imageView.setAlpha(f7);
        float f10 = 0.82f * f7;
        imageView.setScaleX(f10);
        imageView.setScaleY(f10);
        int w06 = t6.w0(i10, p6Var);
        int w07 = t6.w0(i11, p6Var);
        eq eqVar = this.f20754b;
        if (eqVar != null && (eqVar != this.F || w06 != this.G || w07 != this.H)) {
            t6.B1(eqVar, w06, false);
            t6.B1(this.f20754b, w07, true);
            this.F = this.f20754b;
            this.G = w06;
            this.H = w07;
        }
        float f11 = 1.0f - f7;
        g9 g9Var = this.f20755c;
        g9Var.setAlpha(f11);
        zf.e0 e0Var = this.f20756f;
        if (e0Var != null && e0Var.d == 7) {
            eq eqVar2 = this.f20762y;
            if (eqVar2 != null) {
                if (w06 != this.D || w07 != this.E) {
                    t6.B1(eqVar2, w06, false);
                    t6.B1(this.f20762y, w07, true);
                    this.D = w06;
                    this.E = w07;
                    g9Var.invalidate();
                }
            } else {
                setData(e0Var);
            }
        }
        invalidate();
    }

    @Override
    public final void v(int i10, float f7, float f10, fe.f fVar) {
        if (i10 == 0) {
            updateColors();
            invalidate();
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void E(float f7, int i10) {
    }
}
