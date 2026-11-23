package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ez0;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.r41;
public final class n extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.Components.p9 f31188a;
    public final org.telegram.ui.ActionBar.n5 f31189b;
    public final org.telegram.ui.ActionBar.n5 f31190c;
    public final org.telegram.ui.Components.a9 d;
    public final ImageView f31191e;
    public TLRPC.Chat f31192f;
    public boolean h;
    public final int f31193n;
    public final lp f31194r;
    public int f31195s;

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
        this.f31193n = i10.f24637t0;
        this.d = new org.telegram.ui.Components.a9((org.telegram.ui.ActionBar.i6) null);
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.f31188a = p9Var;
        p9Var.setRoundRadius(org.telegram.messenger.g0.L(24.0f));
        boolean z11 = gd.f24314a0;
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
        addView(p9Var, c8.na.d(48, 48.0f, i16, f10, 6.0f, f11, 6.0f));
        if (z10) {
            lp lpVar = new lp(21, context, null);
            this.f31194r = lpVar;
            lpVar.b(-1, org.telegram.ui.ActionBar.n6.f29451d6, org.telegram.ui.ActionBar.n6.f29581k7);
            lpVar.setDrawUnchecked(false);
            lpVar.setDrawBackgroundAsArc(3);
            boolean z12 = gd.f24314a0;
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
            addView(lpVar, c8.na.d(24, 24.0f, i17, f17, 32.0f, f18, 0.0f));
        }
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.f31189b = n5Var;
        org.telegram.ui.ActionBar.u6.X(n5Var, org.telegram.ui.ActionBar.n6.G6, null);
        n5Var.setTextSize(17);
        if (gd.f24314a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        n5Var.setGravity(i11 | 48);
        boolean z13 = gd.f24314a0;
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
        addView(n5Var, c8.na.d(-1, 20.0f, i18, f19, 9.5f, f13, 0.0f));
        org.telegram.ui.ActionBar.n5 n5Var2 = new org.telegram.ui.ActionBar.n5(context);
        this.f31190c = n5Var2;
        n5Var2.setTextSize(14);
        int i19 = org.telegram.ui.ActionBar.n6.f29843y6;
        org.telegram.ui.ActionBar.u6.X(n5Var2, i19, null);
        n5Var2.setLinkTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.J6, false));
        if (gd.f24314a0) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        n5Var2.setGravity(i13 | 48);
        boolean z14 = gd.f24314a0;
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
        addView(n5Var2, c8.na.d(-1, 20.0f, i20, f14, 32.5f, z14 ? i7 + 73 : 62, 6.0f));
        ImageView imageView = new ImageView(context);
        this.f31191e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232276);
        imageView.setOnClickListener(onClickListener);
        int i21 = org.telegram.ui.ActionBar.n6.f29543i6;
        y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.x0(null, i21, false), 1, -1);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i21);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.u6.j(imageView, h02, null, M, null);
        org.telegram.ui.ActionBar.u6.s(imageView, i19, null, PorterDuff.Mode.MULTIPLY);
        boolean z15 = gd.f24314a0;
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
        addView(imageView, c8.na.d(48, 48.0f, i22, f15, 6.0f, f16, 0.0f));
    }

    public final void a(TLRPC.Chat chat, boolean z10) {
        String s5 = a8.p0.s(new StringBuilder(), mp.u1(this.f31193n).X2, "/");
        this.f31192f = chat;
        org.telegram.ui.Components.a9 a9Var = this.d;
        a9Var.q(chat);
        this.f31189b.l(chat.title, false);
        StringBuilder m10 = com.google.android.gms.internal.vision.e2.m(s5);
        m10.append(org.telegram.messenger.v3.K(chat, false));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(m10.toString());
        spannableStringBuilder.setSpan(new r41("", (ez0) null), s5.length(), spannableStringBuilder.length(), 33);
        this.f31190c.l(spannableStringBuilder, false);
        this.f31188a.f(chat, a9Var);
        this.h = z10;
    }

    public TLRPC.Chat getCurrentChannel() {
        return this.f31192f;
    }

    public ImageView getDeleteButton() {
        return this.f31191e;
    }

    public org.telegram.ui.ActionBar.n5 getNameTextView() {
        return this.f31189b;
    }

    public org.telegram.ui.ActionBar.n5 getStatusTextView() {
        return this.f31190c;
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
                int[] iArr = org.telegram.ui.ActionBar.n6.f29673p8;
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
        if (i10 != this.f31195s) {
            this.f31195s = i10;
            TLRPC.Chat chat = this.f31192f;
            if (chat != null) {
                this.d.q(chat);
                this.f31188a.invalidate();
            }
        }
        org.telegram.ui.ActionBar.n5 n5Var = this.f31190c;
        if (n5Var != null) {
            n5Var.setLinkTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.J6, false));
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
