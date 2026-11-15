package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import c8.ja;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.i9;
public class p0 extends FrameLayout implements te.b, z5 {
    public int E;
    public int F;
    public fq G;
    public int H;
    public int I;
    public ColorFilter J;
    public int K;
    public final te.a f29454a;
    public fq f29455b;
    public final i9 f29456c;
    public final ImageView d;
    public final TextView f29457e;
    public jg.o0 f29458f;
    public final kg.j1 h;
    public final e6 f29459n;
    public boolean f29460r;
    public boolean f29461s;
    public int f29462w;
    public int f29463x;
    public fq f29464y;

    public p0(Context context, e6 e6Var) {
        super(context);
        this.f29454a = new te.a(0, this, er.h, 380L, false);
        this.h = new kg.j1(this, 29);
        this.f29459n = e6Var;
        i9 i9Var = new i9(context);
        this.f29456c = i9Var;
        addView(i9Var, ja.c(32.0f, 32));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImageResource(2131231269);
        addView(imageView, ja.d(24, 24.0f, 16, 8.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f29457e = textView;
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(1, 14.0f);
        addView(textView, ja.d(-2, -2.0f, 16, 38.0f, 0.0f, 12.0f, 0.0f));
        this.f29463x = org.telegram.messenger.g0.L(28.0f);
        updateColors();
    }

    @Override
    public final void G(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            updateColors();
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        int i7 = this.f29463x;
        canvas.drawRoundRect(0.0f, 0.0f, width, height, i7, i7, j6.n0(this.f29462w));
        super.dispatchDraw(canvas);
    }

    public jg.o0 getFilter() {
        return this.f29458f;
    }

    @Override
    public void onMeasure(int i7, int i10) {
        if (this.f29461s) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(135.0f), Integer.MIN_VALUE), i10);
        } else {
            super.onMeasure(i7, i10);
        }
    }

    public void setData(jg.o0 o0Var) {
        this.f29458f = o0Var;
        this.f29461s = false;
        String str = o0Var.f17221c;
        if (str == null) {
            str = hd.M0(o0Var.f17220b, null);
        }
        this.f29457e.setText(str);
        fq N = j6.N(org.telegram.messenger.g0.L(32.0f), o0Var.f17219a);
        this.f29455b = N;
        int i7 = j6.Fi;
        e6 e6Var = this.f29459n;
        j6.B1(N, j6.w0(i7, e6Var), false);
        fq fqVar = this.f29455b;
        int i10 = j6.Ji;
        j6.B1(fqVar, j6.w0(i10, e6Var), true);
        int i11 = o0Var.d;
        float f10 = 16.0f;
        i9 i9Var = this.f29456c;
        if (i11 == 4) {
            TLObject tLObject = o0Var.f17223f;
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                if (m10.i(m10.f24940t0).f().f28200id == user.f28200id) {
                    fq N2 = j6.N(org.telegram.messenger.g0.L(32.0f), 2131231000);
                    int L = org.telegram.messenger.g0.L(16.0f);
                    int L2 = org.telegram.messenger.g0.L(16.0f);
                    N2.f34676e = L;
                    N2.f34677f = L2;
                    j6.B1(N2, j6.w0(i7, e6Var), false);
                    j6.B1(N2, j6.w0(i10, e6Var), true);
                    i9Var.setImageDrawable(N2);
                    return;
                }
                i9Var.getImageReceiver().J0(org.telegram.messenger.g0.L(16.0f));
                i9Var.getImageReceiver().i0(user, this.f29455b, null);
            } else if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                this.f29461s = org.telegram.messenger.t3.Y(chat);
                ImageReceiver imageReceiver = i9Var.getImageReceiver();
                if (this.f29461s) {
                    f10 = 10.0f;
                }
                int L3 = org.telegram.messenger.g0.L(f10);
                this.f29463x = L3;
                imageReceiver.J0(L3);
                i9Var.getImageReceiver().i0(chat, this.f29455b, null);
            }
        } else if (i11 == 7) {
            fq N3 = j6.N(org.telegram.messenger.g0.L(32.0f), 2131230993);
            int L4 = org.telegram.messenger.g0.L(16.0f);
            int L5 = org.telegram.messenger.g0.L(16.0f);
            N3.f34676e = L4;
            N3.f34677f = L5;
            j6.B1(N3, j6.w0(i7, e6Var), false);
            j6.B1(N3, j6.w0(i10, e6Var), true);
            i9Var.setImageDrawable(N3);
            this.f29464y = N3;
            this.E = j6.w0(i7, e6Var);
            this.F = j6.w0(i10, e6Var);
        } else {
            i9Var.setImageDrawable(this.f29455b);
        }
    }

    public void setExpanded(boolean z10) {
        TextView textView = this.f29457e;
        if (z10) {
            textView.setVisibility(0);
            return;
        }
        textView.setVisibility(8);
        setSelectedForDelete(false);
    }

    public void setSelectedForDelete(boolean z10) {
        te.a aVar = this.f29454a;
        if (aVar.f57086f != z10) {
            kg.j1 j1Var = this.h;
            org.telegram.messenger.g0.r(j1Var);
            aVar.a(z10, true);
            if (z10) {
                org.telegram.messenger.g0.i3(j1Var, 2000L);
            }
        }
    }

    @Override
    public final void updateColors() {
        int w02;
        float f10 = this.f29454a.f57085e;
        boolean z10 = this.f29460r;
        e6 e6Var = this.f29459n;
        if (z10) {
            w02 = j6.r1(0.075f, j6.w0(j6.G6, e6Var));
        } else {
            w02 = j6.w0(j6.Ti, e6Var);
        }
        int i7 = j6.Fi;
        int w03 = j6.w0(i7, e6Var);
        int w04 = j6.w0(j6.G6, e6Var);
        int i10 = j6.Ji;
        int w05 = j6.w0(i10, e6Var);
        this.f29462w = i0.a.f(f10, w02, w03);
        this.f29457e.setTextColor(i0.a.f(f10, w04, w05));
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
        int w06 = j6.w0(i7, e6Var);
        int w07 = j6.w0(i10, e6Var);
        fq fqVar = this.f29455b;
        if (fqVar != null && (fqVar != this.G || w06 != this.H || w07 != this.I)) {
            j6.B1(fqVar, w06, false);
            j6.B1(this.f29455b, w07, true);
            this.G = this.f29455b;
            this.H = w06;
            this.I = w07;
        }
        float f12 = 1.0f - f10;
        i9 i9Var = this.f29456c;
        i9Var.setAlpha(f12);
        jg.o0 o0Var = this.f29458f;
        if (o0Var != null && o0Var.d == 7) {
            fq fqVar2 = this.f29464y;
            if (fqVar2 != null) {
                if (w06 != this.E || w07 != this.F) {
                    j6.B1(fqVar2, w06, false);
                    j6.B1(this.f29464y, w07, true);
                    this.E = w06;
                    this.F = w07;
                    i9Var.invalidate();
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
    public final void E(float f10, int i7) {
    }
}
