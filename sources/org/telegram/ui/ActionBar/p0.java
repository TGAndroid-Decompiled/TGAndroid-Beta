package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import c8.na;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.p9;
public class p0 extends FrameLayout implements te.b, c6 {
    public int E;
    public int F;
    public lq G;
    public int H;
    public int I;
    public ColorFilter J;
    public int K;
    public final te.a f29919a;
    public lq f29920b;
    public final p9 f29921c;
    public final ImageView d;
    public final TextView f29922e;
    public jg.o0 f29923f;
    public final oi.c2 h;
    public final i6 f29924n;
    public boolean f29925r;
    public boolean f29926s;
    public int f29927w;
    public int f29928x;
    public lq f29929y;

    public p0(Context context, i6 i6Var) {
        super(context);
        this.f29919a = new te.a(0, this, kr.h, 380L, false);
        this.h = new oi.c2(this, 3);
        this.f29924n = i6Var;
        p9 p9Var = new p9(context);
        this.f29921c = p9Var;
        addView(p9Var, na.c(32.0f, 32));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImageResource(2131231272);
        addView(imageView, na.d(24, 24.0f, 16, 8.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f29922e = textView;
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(1, 14.0f);
        addView(textView, na.d(-2, -2.0f, 16, 38.0f, 0.0f, 12.0f, 0.0f));
        this.f29928x = org.telegram.messenger.g0.L(28.0f);
        updateColors();
    }

    @Override
    public final void K(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            updateColors();
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        int i7 = this.f29928x;
        canvas.drawRoundRect(0.0f, 0.0f, width, height, i7, i7, n6.n0(this.f29927w));
        super.dispatchDraw(canvas);
    }

    public jg.o0 getFilter() {
        return this.f29923f;
    }

    @Override
    public void onMeasure(int i7, int i10) {
        if (this.f29926s) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(135.0f), Integer.MIN_VALUE), i10);
        } else {
            super.onMeasure(i7, i10);
        }
    }

    public void setData(jg.o0 o0Var) {
        this.f29923f = o0Var;
        this.f29926s = false;
        String str = o0Var.f17700c;
        if (str == null) {
            str = gd.N0(o0Var.f17699b, null);
        }
        this.f29922e.setText(str);
        lq N = n6.N(org.telegram.messenger.g0.L(32.0f), o0Var.f17698a);
        this.f29920b = N;
        int i7 = n6.Fi;
        i6 i6Var = this.f29924n;
        n6.B1(N, n6.w0(i7, i6Var), false);
        lq lqVar = this.f29920b;
        int i10 = n6.Ji;
        n6.B1(lqVar, n6.w0(i10, i6Var), true);
        int i11 = o0Var.d;
        float f10 = 16.0f;
        p9 p9Var = this.f29921c;
        if (i11 == 4) {
            TLObject tLObject = o0Var.f17702f;
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                if (i10.i(i10.f24637t0).f().f28641id == user.f28641id) {
                    lq N2 = n6.N(org.telegram.messenger.g0.L(32.0f), 2131231002);
                    int L = org.telegram.messenger.g0.L(16.0f);
                    int L2 = org.telegram.messenger.g0.L(16.0f);
                    N2.f37198e = L;
                    N2.f37199f = L2;
                    n6.B1(N2, n6.w0(i7, i6Var), false);
                    n6.B1(N2, n6.w0(i10, i6Var), true);
                    p9Var.setImageDrawable(N2);
                    return;
                }
                p9Var.getImageReceiver().K0(org.telegram.messenger.g0.L(16.0f));
                p9Var.getImageReceiver().j0(user, this.f29920b, null);
            } else if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                this.f29926s = org.telegram.messenger.v3.Y(chat);
                ImageReceiver imageReceiver = p9Var.getImageReceiver();
                if (this.f29926s) {
                    f10 = 10.0f;
                }
                int L3 = org.telegram.messenger.g0.L(f10);
                this.f29928x = L3;
                imageReceiver.K0(L3);
                p9Var.getImageReceiver().j0(chat, this.f29920b, null);
            }
        } else if (i11 == 7) {
            lq N3 = n6.N(org.telegram.messenger.g0.L(32.0f), 2131230995);
            int L4 = org.telegram.messenger.g0.L(16.0f);
            int L5 = org.telegram.messenger.g0.L(16.0f);
            N3.f37198e = L4;
            N3.f37199f = L5;
            n6.B1(N3, n6.w0(i7, i6Var), false);
            n6.B1(N3, n6.w0(i10, i6Var), true);
            p9Var.setImageDrawable(N3);
            this.f29929y = N3;
            this.E = n6.w0(i7, i6Var);
            this.F = n6.w0(i10, i6Var);
        } else {
            p9Var.setImageDrawable(this.f29920b);
        }
    }

    public void setExpanded(boolean z10) {
        TextView textView = this.f29922e;
        if (z10) {
            textView.setVisibility(0);
            return;
        }
        textView.setVisibility(8);
        setSelectedForDelete(false);
    }

    public void setSelectedForDelete(boolean z10) {
        te.a aVar = this.f29919a;
        if (aVar.f57780f != z10) {
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
        float f10 = this.f29919a.f57779e;
        boolean z10 = this.f29925r;
        i6 i6Var = this.f29924n;
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
        this.f29927w = i0.a.f(f10, w02, w03);
        this.f29922e.setTextColor(i0.a.f(f10, w04, w05));
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
        lq lqVar = this.f29920b;
        if (lqVar != null && (lqVar != this.G || w06 != this.H || w07 != this.I)) {
            n6.B1(lqVar, w06, false);
            n6.B1(this.f29920b, w07, true);
            this.G = this.f29920b;
            this.H = w06;
            this.I = w07;
        }
        float f12 = 1.0f - f10;
        p9 p9Var = this.f29921c;
        p9Var.setAlpha(f12);
        jg.o0 o0Var = this.f29923f;
        if (o0Var != null && o0Var.d == 7) {
            lq lqVar2 = this.f29929y;
            if (lqVar2 != null) {
                if (w06 != this.E || w07 != this.F) {
                    n6.B1(lqVar2, w06, false);
                    n6.B1(this.f29929y, w07, true);
                    this.E = w06;
                    this.F = w07;
                    p9Var.invalidate();
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
    public final void G(float f10, int i7) {
    }
}
