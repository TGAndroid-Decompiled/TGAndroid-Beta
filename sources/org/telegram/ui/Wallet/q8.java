package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import b8.mf;
import b8.pf;
import org.telegram.messenger.bd;
import org.telegram.messenger.l10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.xp;
public final class q8 extends FrameLayout {
    public final org.telegram.ui.ActionBar.e6 f43092a;
    public final FrameLayout f43093b;
    public final org.telegram.ui.Components.u8 f43094c;
    public final org.telegram.ui.Components.k9 d;
    public ShapeDrawable f43095e;
    public final TextView f43096f;
    public final p8 h;
    public final ImageView f43097n;
    public TLRPC.User f43098r;
    public String f43099s;

    public q8(Context context, Runnable runnable, Runnable runnable2, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f43094c = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        this.f43092a = e6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f43093b = frameLayout;
        frameLayout.setDuplicateParentStateEnabled(true);
        frameLayout.setPivotX(0.0f);
        frameLayout.setPivotY(0.0f);
        addView(frameLayout, mf.c(-1.0f, -1));
        int i3 = org.telegram.ui.ActionBar.k6.f27824a7;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i3, e6Var);
        int w03 = org.telegram.ui.ActionBar.k6.w0(i3, e6Var);
        int i10 = org.telegram.ui.ActionBar.k6.f27972i6;
        org.telegram.ui.Cells.y b02 = org.telegram.ui.ActionBar.k6.b0(w02, org.telegram.ui.ActionBar.k6.w(w03, org.telegram.ui.ActionBar.k6.w0(i10, e6Var)), org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(32.0f));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i3);
        org.telegram.ui.ActionBar.n6 q10 = org.telegram.ui.ActionBar.r6.q(i3, i10);
        frameLayout.setBackground(b02);
        org.telegram.ui.ActionBar.r6.k(frameLayout, b02, N, q10, e6Var);
        pf.b(this, 0.02f, 1.2f);
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.d = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(18.0f));
        frameLayout.addView(k9Var, mf.d(34, 34.0f, 19, 15.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f43096f = textView;
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, e6Var);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(org.telegram.messenger.g0.o());
        frameLayout.addView(textView, mf.d(-1, -2.0f, 51, 60.0f, 7.0f, 52.0f, 0.0f));
        p8 p8Var = new p8(this, context);
        this.h = p8Var;
        frameLayout.addView(p8Var, mf.d(-1, -2.0f, 51, 60.0f, 26.0f, 52.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f43097n = imageView;
        imageView.setImageResource(2131232029);
        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.D6, e6Var, PorterDuff.Mode.SRC_IN);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleX(0.9f);
        imageView.setScaleY(0.9f);
        frameLayout.addView(imageView, mf.d(24, 24.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        setOnClickListener(new h8(this, e6Var, runnable, runnable2, 2));
    }

    public final void a(String str, TLRPC.User user) {
        long j10;
        boolean z10;
        TLRPC.User user2 = this.f43098r;
        long j11 = 0;
        if (user2 == null) {
            j10 = 0;
        } else {
            j10 = user2.f27150id;
        }
        if (user != null) {
            j11 = user.f27150id;
        }
        if (j10 != j11) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f43098r = user;
        this.f43099s = str;
        setClickable(!TextUtils.isEmpty(str));
        TLRPC.User user3 = this.f43098r;
        TextView textView = this.f43096f;
        ImageView imageView = this.f43097n;
        org.telegram.ui.Components.k9 k9Var = this.d;
        p8 p8Var = this.h;
        if (user3 != null) {
            setClickable(true);
            setVisibility(0);
            TLRPC.User user4 = this.f43098r;
            org.telegram.ui.Components.u8 u8Var = this.f43094c;
            u8Var.r(user4);
            k9Var.e(this.f43098r, u8Var);
            textView.setText(l10.p(this.f43098r));
            if (!TextUtils.isEmpty(str)) {
                p8Var.c(str, z10);
                imageView.setVisibility(0);
                return;
            }
            p8Var.c(null, z10);
            imageView.setVisibility(8);
        } else if (!TextUtils.isEmpty(str)) {
            setClickable(false);
            setVisibility(0);
            if (this.f43095e == null) {
                ShapeDrawable L = org.telegram.ui.ActionBar.k6.L(org.telegram.messenger.g0.L(34.0f), -1);
                this.f43095e = L;
                org.telegram.ui.ActionBar.r6.y(k9Var, L, org.telegram.ui.ActionBar.k6.Ci, this.f43092a, PorterDuff.Mode.SRC_IN);
            }
            k9Var.setImageDrawable(new xp(this.f43095e, getContext().getResources().getDrawable(2131231829).mutate()));
            textView.setText(bd.M0(2131743109, null));
            p8Var.c(str, z10);
            imageView.setVisibility(8);
        } else {
            setClickable(false);
            setVisibility(8);
            p8Var.c(null, true);
        }
    }

    public float getContentBottom() {
        FrameLayout frameLayout = this.f43093b;
        return (frameLayout.getScaleY() * (frameLayout.getHeight() - frameLayout.getPivotY())) + frameLayout.getPivotY() + frameLayout.getY();
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        FrameLayout frameLayout = this.f43093b;
        int round = Math.round((getMeasuredHeight() - (frameLayout.getScaleY() * frameLayout.getMeasuredHeight())) / 2.0f);
        frameLayout.layout(0, round, frameLayout.getMeasuredWidth(), frameLayout.getMeasuredHeight() + round);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        p8 p8Var = this.h;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) p8Var.getLayoutParams();
        int ceil = ((int) Math.ceil(p8Var.a())) + 1 + layoutParams.leftMargin + layoutParams.rightMargin;
        setMeasuredDimension(View.resolveSize(Math.max(getMeasuredWidth(), ceil), i3), getMeasuredHeight());
        int max = Math.max(getMeasuredWidth(), ceil);
        float measuredWidth = getMeasuredWidth() / max;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        FrameLayout frameLayout = this.f43093b;
        frameLayout.measure(makeMeasureSpec, makeMeasureSpec2);
        frameLayout.setScaleX(measuredWidth);
        frameLayout.setScaleY(measuredWidth);
    }
}
