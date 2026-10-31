package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.ep;
import org.telegram.ui.Components.yz0;
public final class m extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final org.telegram.ui.Components.g9 f22269a;
    public final org.telegram.ui.ActionBar.u5 f22270b;
    public final org.telegram.ui.ActionBar.u5 f22271c;
    public final org.telegram.ui.Components.r8 d;
    public final ImageView e;
    public TLRPC.Chat f22272f;
    public boolean h;
    public final int f22273n;
    public final ep f22274r;
    public int f22275s;

    public m(Context context, View.OnClickListener onClickListener, boolean z10, int i10) {
        super(context);
        int i11;
        float f7;
        float f10;
        int i12;
        int i13;
        float f11;
        float f12;
        int i14;
        int i15;
        float f13;
        float f14;
        float f15;
        int i16;
        float f16;
        float f17;
        this.f22273n = d20.f15147s0;
        this.d = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        this.f22269a = g9Var;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(24.0f));
        boolean z11 = cd.X;
        if (z11) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i17 = i11 | 48;
        if (z11) {
            f7 = 0.0f;
        } else {
            f7 = i10 + 12;
        }
        if (z11) {
            f10 = i10 + 12;
        } else {
            f10 = 0.0f;
        }
        addView(g9Var, w7.b6.d(48, 48.0f, i17, f7, 6.0f, f10, 6.0f));
        if (z10) {
            ep epVar = new ep(21, context, null);
            this.f22274r = epVar;
            epVar.b(-1, org.telegram.ui.ActionBar.t6.f20929d6, org.telegram.ui.ActionBar.t6.f21059k7);
            epVar.setDrawUnchecked(false);
            epVar.setDrawBackgroundAsArc(3);
            boolean z12 = cd.X;
            if (z12) {
                i16 = 5;
            } else {
                i16 = 3;
            }
            int i18 = i16 | 48;
            if (z12) {
                f16 = 0.0f;
            } else {
                f16 = i10 + 42;
            }
            if (z12) {
                f17 = i10 + 42;
            } else {
                f17 = 0.0f;
            }
            addView(epVar, w7.b6.d(24, 24.0f, i18, f16, 32.0f, f17, 0.0f));
        }
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
        this.f22270b = u5Var;
        org.telegram.ui.ActionBar.a7.Y(u5Var, org.telegram.ui.ActionBar.t6.G6, null);
        u5Var.setTextSize(17);
        if (cd.X) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        u5Var.setGravity(i12 | 48);
        boolean z13 = cd.X;
        if (z13) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        int i19 = i13 | 48;
        if (z13) {
            f11 = 62;
        } else {
            f11 = i10 + 73;
        }
        float f18 = f11;
        if (z13) {
            f12 = i10 + 73;
        } else {
            f12 = 62;
        }
        addView(u5Var, w7.b6.d(-1, 20.0f, i19, f18, 9.5f, f12, 0.0f));
        org.telegram.ui.ActionBar.u5 u5Var2 = new org.telegram.ui.ActionBar.u5(context);
        this.f22271c = u5Var2;
        u5Var2.setTextSize(14);
        int i20 = org.telegram.ui.ActionBar.t6.f21311y6;
        org.telegram.ui.ActionBar.a7.Y(u5Var2, i20, null);
        u5Var2.setLinkTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.J6, false));
        if (cd.X) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        u5Var2.setGravity(i14 | 48);
        boolean z14 = cd.X;
        if (z14) {
            i15 = 5;
        } else {
            i15 = 3;
        }
        int i21 = i15 | 48;
        if (z14) {
            f13 = 62;
        } else {
            f13 = i10 + 73;
        }
        addView(u5Var2, w7.b6.d(-1, 20.0f, i21, f13, 32.5f, z14 ? i10 + 73 : 62, 6.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232270);
        imageView.setOnClickListener(onClickListener);
        int i22 = org.telegram.ui.ActionBar.t6.f21020i6;
        y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, i22, false), 1, -1);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i22);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.a7.k(imageView, h02, null, N, null);
        org.telegram.ui.ActionBar.a7.t(imageView, i20, null, PorterDuff.Mode.MULTIPLY);
        boolean z15 = cd.X;
        int i23 = (z15 ? 3 : 5) | 48;
        if (z15) {
            f14 = 7.0f;
        } else {
            f14 = 0.0f;
        }
        if (z15) {
            f15 = 0.0f;
        } else {
            f15 = 7.0f;
        }
        addView(imageView, w7.b6.d(48, 48.0f, i23, f14, 6.0f, f15, 0.0f));
    }

    public final void a(TLRPC.Chat chat, boolean z10) {
        String r10 = a1.g.r(new StringBuilder(), vp.r1(this.f22273n).U2, "/");
        this.f22272f = chat;
        org.telegram.ui.Components.r8 r8Var = this.d;
        r8Var.q(chat);
        this.f22270b.l(chat.title, false);
        StringBuilder t10 = a1.g.t(r10);
        t10.append(org.telegram.messenger.w3.K(chat, false));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(t10.toString());
        spannableStringBuilder.setSpan(new e51("", (yz0) null), r10.length(), spannableStringBuilder.length(), 33);
        this.f22271c.l(spannableStringBuilder, false);
        this.f22269a.e(chat, r8Var);
        this.h = z10;
    }

    public TLRPC.Chat getCurrentChannel() {
        return this.f22272f;
    }

    public ImageView getDeleteButton() {
        return this.e;
    }

    public org.telegram.ui.ActionBar.u5 getNameTextView() {
        return this.f22270b;
    }

    public org.telegram.ui.ActionBar.u5 getStatusTextView() {
        return this.f22271c;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (this.h) {
            i12 = 12;
        } else {
            i12 = 0;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(i12 + 60), 1073741824));
    }

    @Override
    public final void updateColors() {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            try {
                int[] iArr = org.telegram.ui.ActionBar.t6.f21154p8;
                if (i10 >= iArr.length) {
                    break;
                }
                i11 = (i11 * 31) + org.telegram.ui.ActionBar.t6.x0(null, iArr[i10], false);
                i10++;
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
                return;
            }
        }
        if (i11 != this.f22275s) {
            this.f22275s = i11;
            TLRPC.Chat chat = this.f22272f;
            if (chat != null) {
                this.d.q(chat);
                this.f22269a.invalidate();
            }
        }
        org.telegram.ui.ActionBar.u5 u5Var = this.f22271c;
        if (u5Var != null) {
            u5Var.setLinkTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.J6, false));
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
