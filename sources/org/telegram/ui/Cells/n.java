package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import b8.mf;
import java.util.HashSet;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ty0;
import org.telegram.ui.Components.v31;
import org.telegram.ui.Components.wo;
public final class n extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.Components.k9 f29642a;
    public final org.telegram.ui.ActionBar.k5 f29643b;
    public final org.telegram.ui.ActionBar.k5 f29644c;
    public final org.telegram.ui.Components.u8 d;
    public final ImageView f29645e;
    public TLRPC.Chat f29646f;
    public boolean h;
    public final int f29647n;
    public final wo f29648r;
    public int f29649s;

    public n(Context context, View.OnClickListener onClickListener, boolean z10, int i3) {
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
        this.f29647n = h10.f22829t0;
        this.d = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.f29642a = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(24.0f));
        boolean z11 = bd.f21784a0;
        if (z11) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        int i16 = i10 | 48;
        if (z11) {
            f10 = 0.0f;
        } else {
            f10 = i3 + 12;
        }
        if (z11) {
            f11 = i3 + 12;
        } else {
            f11 = 0.0f;
        }
        addView(k9Var, mf.d(48, 48.0f, i16, f10, 6.0f, f11, 6.0f));
        if (z10) {
            wo woVar = new wo(21, context, null);
            this.f29648r = woVar;
            woVar.b(-1, org.telegram.ui.ActionBar.k6.f27878d6, org.telegram.ui.ActionBar.k6.f28008k7);
            woVar.setDrawUnchecked(false);
            woVar.setDrawBackgroundAsArc(3);
            boolean z12 = bd.f21784a0;
            if (z12) {
                i15 = 5;
            } else {
                i15 = 3;
            }
            int i17 = i15 | 48;
            if (z12) {
                f17 = 0.0f;
            } else {
                f17 = i3 + 42;
            }
            if (z12) {
                f18 = i3 + 42;
            } else {
                f18 = 0.0f;
            }
            addView(woVar, mf.d(24, 24.0f, i17, f17, 32.0f, f18, 0.0f));
        }
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.f29643b = k5Var;
        org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.G6, null);
        k5Var.setTextSize(17);
        if (bd.f21784a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        k5Var.setGravity(i11 | 48);
        boolean z13 = bd.f21784a0;
        if (z13) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        int i18 = i12 | 48;
        if (z13) {
            f12 = 62;
        } else {
            f12 = i3 + 73;
        }
        float f19 = f12;
        if (z13) {
            f13 = i3 + 73;
        } else {
            f13 = 62;
        }
        addView(k5Var, mf.d(-1, 20.0f, i18, f19, 9.5f, f13, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var2 = new org.telegram.ui.ActionBar.k5(context);
        this.f29644c = k5Var2;
        k5Var2.setTextSize(14);
        int i19 = org.telegram.ui.ActionBar.k6.f28273y6;
        org.telegram.ui.ActionBar.r6.Y(k5Var2, i19, null);
        k5Var2.setLinkTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.J6, false));
        if (bd.f21784a0) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        k5Var2.setGravity(i13 | 48);
        boolean z14 = bd.f21784a0;
        if (z14) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        int i20 = i14 | 48;
        if (z14) {
            f14 = 62;
        } else {
            f14 = i3 + 73;
        }
        addView(k5Var2, mf.d(-1, 20.0f, i20, f14, 32.5f, z14 ? i3 + 73 : 62, 6.0f));
        ImageView imageView = new ImageView(context);
        this.f29645e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232271);
        imageView.setOnClickListener(onClickListener);
        int i21 = org.telegram.ui.ActionBar.k6.f27972i6;
        y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i21, false), 1, -1);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i21);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(imageView, h02, null, N, null);
        org.telegram.ui.ActionBar.r6.t(imageView, i19, null, PorterDuff.Mode.MULTIPLY);
        boolean z15 = bd.f21784a0;
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
        addView(imageView, mf.d(48, 48.0f, i22, f15, 6.0f, f16, 0.0f));
    }

    public final void a(TLRPC.Chat chat, boolean z10) {
        String s6 = a1.g.s(new StringBuilder(), hp.s1(this.f29647n).V2, "/");
        this.f29646f = chat;
        org.telegram.ui.Components.u8 u8Var = this.d;
        u8Var.q(chat);
        this.f29643b.l(chat.title, false);
        StringBuilder l10 = com.google.android.recaptcha.internal.a.l(s6);
        l10.append(org.telegram.messenger.t3.K(chat, false));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(l10.toString());
        spannableStringBuilder.setSpan(new v31("", (ty0) null), s6.length(), spannableStringBuilder.length(), 33);
        this.f29644c.l(spannableStringBuilder, false);
        this.f29642a.e(chat, u8Var);
        this.h = z10;
    }

    public TLRPC.Chat getCurrentChannel() {
        return this.f29646f;
    }

    public ImageView getDeleteButton() {
        return this.f29645e;
    }

    public org.telegram.ui.ActionBar.k5 getNameTextView() {
        return this.f29643b;
    }

    public org.telegram.ui.ActionBar.k5 getStatusTextView() {
        return this.f29644c;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int i11;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824);
        if (this.h) {
            i11 = 12;
        } else {
            i11 = 0;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(i11 + 60), 1073741824));
    }

    @Override
    public final void updateColors() {
        int i3 = 0;
        int i10 = 0;
        while (true) {
            try {
                int[] iArr = org.telegram.ui.ActionBar.k6.f28103p8;
                if (i3 >= iArr.length) {
                    break;
                }
                i10 = (i10 * 31) + org.telegram.ui.ActionBar.k6.x0(null, iArr[i3], false);
                i3++;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        if (i10 != this.f29649s) {
            this.f29649s = i10;
            TLRPC.Chat chat = this.f29646f;
            if (chat != null) {
                this.d.q(chat);
                this.f29642a.invalidate();
            }
        }
        org.telegram.ui.ActionBar.k5 k5Var = this.f29644c;
        if (k5Var != null) {
            k5Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.J6, false));
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
