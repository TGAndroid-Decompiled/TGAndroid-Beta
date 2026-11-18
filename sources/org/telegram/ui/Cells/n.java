package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dz0;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.p41;
public final class n extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.Components.q9 f31088a;
    public final org.telegram.ui.ActionBar.n5 f31089b;
    public final org.telegram.ui.ActionBar.n5 f31090c;
    public final org.telegram.ui.Components.b9 d;
    public final ImageView f31091e;
    public TLRPC.Chat f31092f;
    public boolean h;
    public final int f31093n;
    public final mp f31094r;
    public int f31095s;

    public n(Context context, View.OnClickListener onClickListener, boolean z10, int i7) {
        super(context);
        int i10;
        float f10;
        float f11;
        int i11;
        int i12;
        float f12;
        float f13;
        int i13;
        int i14;
        float f14;
        float f15;
        float f16;
        int i15;
        float f17;
        float f18;
        this.f31093n = j10.f24770t0;
        this.d = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.i6) null);
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.f31088a = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(24.0f));
        boolean z11 = gd.f24213a0;
        if (z11) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        int i16 = i10 | 48;
        if (z11) {
            f10 = 0.0f;
        } else {
            f10 = i7 + 12;
        }
        if (z11) {
            f11 = i7 + 12;
        } else {
            f11 = 0.0f;
        }
        addView(q9Var, c8.ma.d(48, 48.0f, i16, f10, 6.0f, f11, 6.0f));
        if (z10) {
            mp mpVar = new mp(21, context, null);
            this.f31094r = mpVar;
            mpVar.b(-1, org.telegram.ui.ActionBar.n6.f29394d6, org.telegram.ui.ActionBar.n6.f29524k7);
            mpVar.setDrawUnchecked(false);
            mpVar.setDrawBackgroundAsArc(3);
            boolean z12 = gd.f24213a0;
            if (z12) {
                i15 = 5;
            } else {
                i15 = 3;
            }
            int i17 = i15 | 48;
            if (z12) {
                f17 = 0.0f;
            } else {
                f17 = i7 + 42;
            }
            if (z12) {
                f18 = i7 + 42;
            } else {
                f18 = 0.0f;
            }
            addView(mpVar, c8.ma.d(24, 24.0f, i17, f17, 32.0f, f18, 0.0f));
        }
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.f31089b = n5Var;
        org.telegram.ui.ActionBar.u6.X(n5Var, org.telegram.ui.ActionBar.n6.G6, null);
        n5Var.setTextSize(17);
        if (gd.f24213a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        n5Var.setGravity(i11 | 48);
        boolean z13 = gd.f24213a0;
        if (z13) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        int i18 = i12 | 48;
        if (z13) {
            f12 = 62;
        } else {
            f12 = i7 + 73;
        }
        float f19 = f12;
        if (z13) {
            f13 = i7 + 73;
        } else {
            f13 = 62;
        }
        addView(n5Var, c8.ma.d(-1, 20.0f, i18, f19, 9.5f, f13, 0.0f));
        org.telegram.ui.ActionBar.n5 n5Var2 = new org.telegram.ui.ActionBar.n5(context);
        this.f31090c = n5Var2;
        n5Var2.setTextSize(14);
        int i19 = org.telegram.ui.ActionBar.n6.f29786y6;
        org.telegram.ui.ActionBar.u6.X(n5Var2, i19, null);
        n5Var2.setLinkTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.J6, false));
        if (gd.f24213a0) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        n5Var2.setGravity(i13 | 48);
        boolean z14 = gd.f24213a0;
        if (z14) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        int i20 = i14 | 48;
        if (z14) {
            f14 = 62;
        } else {
            f14 = i7 + 73;
        }
        addView(n5Var2, c8.ma.d(-1, 20.0f, i20, f14, 32.5f, z14 ? i7 + 73 : 62, 6.0f));
        ImageView imageView = new ImageView(context);
        this.f31091e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232273);
        imageView.setOnClickListener(onClickListener);
        int i21 = org.telegram.ui.ActionBar.n6.f29486i6;
        y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.x0(null, i21, false), 1, -1);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i21);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.u6.j(imageView, h02, null, M, null);
        org.telegram.ui.ActionBar.u6.s(imageView, i19, null, PorterDuff.Mode.MULTIPLY);
        boolean z15 = gd.f24213a0;
        int i22 = (z15 ? 3 : 5) | 48;
        if (z15) {
            f15 = 7.0f;
        } else {
            f15 = 0.0f;
        }
        if (z15) {
            f16 = 0.0f;
        } else {
            f16 = 7.0f;
        }
        addView(imageView, c8.ma.d(48, 48.0f, i22, f15, 6.0f, f16, 0.0f));
    }

    public final void a(TLRPC.Chat chat, boolean z10) {
        String s5 = a8.p0.s(new StringBuilder(), org.telegram.messenger.mp.u1(this.f31093n).X2, "/");
        this.f31092f = chat;
        org.telegram.ui.Components.b9 b9Var = this.d;
        b9Var.q(chat);
        this.f31089b.l(chat.title, false);
        StringBuilder m10 = com.google.android.gms.internal.vision.e2.m(s5);
        m10.append(org.telegram.messenger.v3.K(chat, false));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(m10.toString());
        spannableStringBuilder.setSpan(new p41("", (dz0) null), s5.length(), spannableStringBuilder.length(), 33);
        this.f31090c.l(spannableStringBuilder, false);
        this.f31088a.f(chat, b9Var);
        this.h = z10;
    }

    public TLRPC.Chat getCurrentChannel() {
        return this.f31092f;
    }

    public ImageView getDeleteButton() {
        return this.f31091e;
    }

    public org.telegram.ui.ActionBar.n5 getNameTextView() {
        return this.f31089b;
    }

    public org.telegram.ui.ActionBar.n5 getStatusTextView() {
        return this.f31090c;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824);
        if (this.h) {
            i11 = 12;
        } else {
            i11 = 0;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(i11 + 60), 1073741824));
    }

    @Override
    public final void updateColors() {
        int i7 = 0;
        int i10 = 0;
        while (true) {
            try {
                int[] iArr = org.telegram.ui.ActionBar.n6.f29616p8;
                if (i7 >= iArr.length) {
                    break;
                }
                i10 = (i10 * 31) + org.telegram.ui.ActionBar.n6.x0(null, iArr[i7], false);
                i7++;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        if (i10 != this.f31095s) {
            this.f31095s = i10;
            TLRPC.Chat chat = this.f31092f;
            if (chat != null) {
                this.d.q(chat);
                this.f31088a.invalidate();
            }
        }
        org.telegram.ui.ActionBar.n5 n5Var = this.f31090c;
        if (n5Var != null) {
            n5Var.setLinkTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.J6, false));
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
