package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.hd;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.a41;
import org.telegram.ui.Components.ty0;
import org.telegram.ui.Components.wo;
public final class n extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.Components.l9 f29581a;
    public final org.telegram.ui.ActionBar.k5 f29582b;
    public final org.telegram.ui.ActionBar.k5 f29583c;
    public final org.telegram.ui.Components.w8 d;
    public final ImageView f29584e;
    public TLRPC.Chat f29585f;
    public boolean h;
    public final int f29586n;
    public final wo f29587r;
    public int f29588s;

    public n(Context context, View.OnClickListener onClickListener, boolean z9, int i7) {
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
        this.f29586n = p10.f24459s0;
        this.d = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.f29581a = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(24.0f));
        boolean z10 = hd.f22871a0;
        if (z10) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        int i16 = i10 | 48;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = i7 + 12;
        }
        if (z10) {
            f11 = i7 + 12;
        } else {
            f11 = 0.0f;
        }
        addView(l9Var, c8.ha.d(48, 48.0f, i16, f10, 6.0f, f11, 6.0f));
        if (z9) {
            wo woVar = new wo(21, context, null);
            this.f29587r = woVar;
            woVar.b(-1, org.telegram.ui.ActionBar.k6.f27848d6, org.telegram.ui.ActionBar.k6.f27978k7);
            woVar.setDrawUnchecked(false);
            woVar.setDrawBackgroundAsArc(3);
            boolean z11 = hd.f22871a0;
            if (z11) {
                i15 = 5;
            } else {
                i15 = 3;
            }
            int i17 = i15 | 48;
            if (z11) {
                f17 = 0.0f;
            } else {
                f17 = i7 + 42;
            }
            if (z11) {
                f18 = i7 + 42;
            } else {
                f18 = 0.0f;
            }
            addView(woVar, c8.ha.d(24, 24.0f, i17, f17, 32.0f, f18, 0.0f));
        }
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.f29582b = k5Var;
        org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.G6, null);
        k5Var.setTextSize(17);
        if (hd.f22871a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        k5Var.setGravity(i11 | 48);
        boolean z12 = hd.f22871a0;
        if (z12) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        int i18 = i12 | 48;
        if (z12) {
            f12 = 62;
        } else {
            f12 = i7 + 73;
        }
        float f19 = f12;
        if (z12) {
            f13 = i7 + 73;
        } else {
            f13 = 62;
        }
        addView(k5Var, c8.ha.d(-1, 20.0f, i18, f19, 9.5f, f13, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var2 = new org.telegram.ui.ActionBar.k5(context);
        this.f29583c = k5Var2;
        k5Var2.setTextSize(14);
        int i19 = org.telegram.ui.ActionBar.k6.f28240y6;
        org.telegram.ui.ActionBar.r6.Y(k5Var2, i19, null);
        k5Var2.setLinkTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.J6, false));
        if (hd.f22871a0) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        k5Var2.setGravity(i13 | 48);
        boolean z13 = hd.f22871a0;
        if (z13) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        int i20 = i14 | 48;
        if (z13) {
            f14 = 62;
        } else {
            f14 = i7 + 73;
        }
        addView(k5Var2, c8.ha.d(-1, 20.0f, i20, f14, 32.5f, z13 ? i7 + 73 : 62, 6.0f));
        ImageView imageView = new ImageView(context);
        this.f29584e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232271);
        imageView.setOnClickListener(onClickListener);
        int i21 = org.telegram.ui.ActionBar.k6.f27940i6;
        y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i21, false), 1, -1);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i21);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(imageView, h02, null, N, null);
        org.telegram.ui.ActionBar.r6.t(imageView, i19, null, PorterDuff.Mode.MULTIPLY);
        boolean z14 = hd.f22871a0;
        int i22 = (z14 ? 3 : 5) | 48;
        if (z14) {
            f15 = 7.0f;
        } else {
            f15 = 0.0f;
        }
        if (z14) {
            f16 = 0.0f;
        } else {
            f16 = 7.0f;
        }
        addView(imageView, c8.ha.d(48, 48.0f, i22, f15, 6.0f, f16, 0.0f));
    }

    public final void a(TLRPC.Chat chat, boolean z9) {
        String s5 = a8.p0.s(new StringBuilder(), qp.s1(this.f29586n).U2, "/");
        this.f29585f = chat;
        org.telegram.ui.Components.w8 w8Var = this.d;
        w8Var.q(chat);
        this.f29582b.l(chat.title, false);
        StringBuilder m10 = com.google.android.recaptcha.internal.a.m(s5);
        m10.append(org.telegram.messenger.t3.K(chat, false));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(m10.toString());
        spannableStringBuilder.setSpan(new a41("", (ty0) null), s5.length(), spannableStringBuilder.length(), 33);
        this.f29583c.l(spannableStringBuilder, false);
        this.f29581a.e(chat, w8Var);
        this.h = z9;
    }

    public TLRPC.Chat getCurrentChannel() {
        return this.f29585f;
    }

    public ImageView getDeleteButton() {
        return this.f29584e;
    }

    public org.telegram.ui.ActionBar.k5 getNameTextView() {
        return this.f29582b;
    }

    public org.telegram.ui.ActionBar.k5 getStatusTextView() {
        return this.f29583c;
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
                int[] iArr = org.telegram.ui.ActionBar.k6.f28070p8;
                if (i7 >= iArr.length) {
                    break;
                }
                i10 = (i10 * 31) + org.telegram.ui.ActionBar.k6.x0(null, iArr[i7], false);
                i7++;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        if (i10 != this.f29588s) {
            this.f29588s = i10;
            TLRPC.Chat chat = this.f29585f;
            if (chat != null) {
                this.d.q(chat);
                this.f29581a.invalidate();
            }
        }
        org.telegram.ui.ActionBar.k5 k5Var = this.f29583c;
        if (k5Var != null) {
            k5Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.J6, false));
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
