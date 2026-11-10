package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.uy0;
import org.telegram.ui.Components.wo;
public final class n extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.Components.k9 f29600a;
    public final org.telegram.ui.ActionBar.m5 f29601b;
    public final org.telegram.ui.ActionBar.m5 f29602c;
    public final org.telegram.ui.Components.v8 d;
    public final ImageView f29603e;
    public TLRPC.Chat f29604f;
    public boolean h;
    public final int f29605n;
    public final wo f29606r;
    public int f29607s;

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
        this.f29605n = p10.f24474s0;
        this.d = new org.telegram.ui.Components.v8((org.telegram.ui.ActionBar.h6) null);
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.f29600a = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(24.0f));
        boolean z10 = id.f23161a0;
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
        addView(k9Var, c8.ha.d(48, 48.0f, i16, f10, 6.0f, f11, 6.0f));
        if (z9) {
            wo woVar = new wo(21, context, null);
            this.f29606r = woVar;
            woVar.b(-1, org.telegram.ui.ActionBar.m6.f27890d6, org.telegram.ui.ActionBar.m6.f28020k7);
            woVar.setDrawUnchecked(false);
            woVar.setDrawBackgroundAsArc(3);
            boolean z11 = id.f23161a0;
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
        org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(context);
        this.f29601b = m5Var;
        org.telegram.ui.ActionBar.t6.X(m5Var, org.telegram.ui.ActionBar.m6.G6, null);
        m5Var.setTextSize(17);
        if (id.f23161a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        m5Var.setGravity(i11 | 48);
        boolean z12 = id.f23161a0;
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
        addView(m5Var, c8.ha.d(-1, 20.0f, i18, f19, 9.5f, f13, 0.0f));
        org.telegram.ui.ActionBar.m5 m5Var2 = new org.telegram.ui.ActionBar.m5(context);
        this.f29602c = m5Var2;
        m5Var2.setTextSize(14);
        int i19 = org.telegram.ui.ActionBar.m6.f28282y6;
        org.telegram.ui.ActionBar.t6.X(m5Var2, i19, null);
        m5Var2.setLinkTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.J6, false));
        if (id.f23161a0) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        m5Var2.setGravity(i13 | 48);
        boolean z13 = id.f23161a0;
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
        addView(m5Var2, c8.ha.d(-1, 20.0f, i20, f14, 32.5f, z13 ? i7 + 73 : 62, 6.0f));
        ImageView imageView = new ImageView(context);
        this.f29603e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232271);
        imageView.setOnClickListener(onClickListener);
        int i21 = org.telegram.ui.ActionBar.m6.f27982i6;
        y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.x0(null, i21, false), 1, -1);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i21);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.t6.j(imageView, h02, null, M, null);
        org.telegram.ui.ActionBar.t6.s(imageView, i19, null, PorterDuff.Mode.MULTIPLY);
        boolean z14 = id.f23161a0;
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
        String s5 = a8.p0.s(new StringBuilder(), qp.s1(this.f29605n).U2, "/");
        this.f29604f = chat;
        org.telegram.ui.Components.v8 v8Var = this.d;
        v8Var.q(chat);
        this.f29601b.l(chat.title, false);
        StringBuilder m10 = com.google.android.recaptcha.internal.a.m(s5);
        m10.append(org.telegram.messenger.t3.K(chat, false));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(m10.toString());
        spannableStringBuilder.setSpan(new b41("", (uy0) null), s5.length(), spannableStringBuilder.length(), 33);
        this.f29602c.l(spannableStringBuilder, false);
        this.f29600a.e(chat, v8Var);
        this.h = z9;
    }

    public TLRPC.Chat getCurrentChannel() {
        return this.f29604f;
    }

    public ImageView getDeleteButton() {
        return this.f29603e;
    }

    public org.telegram.ui.ActionBar.m5 getNameTextView() {
        return this.f29601b;
    }

    public org.telegram.ui.ActionBar.m5 getStatusTextView() {
        return this.f29602c;
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
                int[] iArr = org.telegram.ui.ActionBar.m6.f28112p8;
                if (i7 >= iArr.length) {
                    break;
                }
                i10 = (i10 * 31) + org.telegram.ui.ActionBar.m6.x0(null, iArr[i7], false);
                i7++;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        if (i10 != this.f29607s) {
            this.f29607s = i10;
            TLRPC.Chat chat = this.f29604f;
            if (chat != null) {
                this.d.q(chat);
                this.f29600a.invalidate();
            }
        }
        org.telegram.ui.ActionBar.m5 m5Var = this.f29602c;
        if (m5Var != null) {
            m5Var.setLinkTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.J6, false));
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
