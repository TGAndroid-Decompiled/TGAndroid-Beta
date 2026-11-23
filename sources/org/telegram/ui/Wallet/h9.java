package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.gd;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lq;
public final class h9 extends FrameLayout {
    public final org.telegram.ui.ActionBar.i6 f44443a;
    public final FrameLayout f44444b;
    public final org.telegram.ui.Components.a9 f44445c;
    public final org.telegram.ui.Components.p9 d;
    public ShapeDrawable f44446e;
    public final TextView f44447f;
    public final g9 h;
    public final ImageView f44448n;
    public TLRPC.User f44449r;
    public String f44450s;

    public h9(Context context, Runnable runnable, Runnable runnable2, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f44445c = new org.telegram.ui.Components.a9((org.telegram.ui.ActionBar.i6) null);
        this.f44443a = i6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f44444b = frameLayout;
        frameLayout.setDuplicateParentStateEnabled(true);
        frameLayout.setPivotX(0.0f);
        frameLayout.setPivotY(0.0f);
        addView(frameLayout, c8.na.c(-1.0f, -1));
        int i7 = org.telegram.ui.ActionBar.n6.f29394a7;
        int w02 = org.telegram.ui.ActionBar.n6.w0(i7, i6Var);
        int w03 = org.telegram.ui.ActionBar.n6.w0(i7, i6Var);
        int i10 = org.telegram.ui.ActionBar.n6.f29543i6;
        org.telegram.ui.Cells.y b02 = org.telegram.ui.ActionBar.n6.b0(w02, org.telegram.ui.ActionBar.n6.w(w03, org.telegram.ui.ActionBar.n6.w0(i10, i6Var)), org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(32.0f));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i7);
        org.telegram.ui.ActionBar.q6 p10 = org.telegram.ui.ActionBar.u6.p(i7, i10);
        frameLayout.setBackground(b02);
        org.telegram.ui.ActionBar.u6.j(frameLayout, b02, M, p10, i6Var);
        c8.sa.b(this, 0.02f, 1.2f);
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.d = p9Var;
        p9Var.setRoundRadius(org.telegram.messenger.g0.L(18.0f));
        frameLayout.addView(p9Var, c8.na.d(34, 34.0f, 19, 15.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f44447f = textView;
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.G6, i6Var);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(org.telegram.messenger.g0.o());
        frameLayout.addView(textView, c8.na.d(-1, -2.0f, 51, 60.0f, 7.0f, 52.0f, 0.0f));
        g9 g9Var = new g9(this, context);
        this.h = g9Var;
        frameLayout.addView(g9Var, c8.na.d(-1, -2.0f, 51, 60.0f, 26.0f, 52.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f44448n = imageView;
        imageView.setImageResource(2131232033);
        org.telegram.ui.ActionBar.u6.s(imageView, org.telegram.ui.ActionBar.n6.D6, i6Var, PorterDuff.Mode.SRC_IN);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleX(0.9f);
        imageView.setScaleY(0.9f);
        frameLayout.addView(imageView, c8.na.d(24, 24.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        setOnClickListener(new x8(this, i6Var, runnable, runnable2, 2));
    }

    public final void a(String str, TLRPC.User user) {
        long j3;
        boolean z10;
        TLRPC.User user2 = this.f44449r;
        long j10 = 0;
        if (user2 == null) {
            j3 = 0;
        } else {
            j3 = user2.f28641id;
        }
        if (user != null) {
            j10 = user.f28641id;
        }
        if (j3 != j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f44449r = user;
        this.f44450s = str;
        setClickable(!TextUtils.isEmpty(str));
        TLRPC.User user3 = this.f44449r;
        TextView textView = this.f44447f;
        ImageView imageView = this.f44448n;
        org.telegram.ui.Components.p9 p9Var = this.d;
        g9 g9Var = this.h;
        if (user3 != null) {
            setClickable(true);
            setVisibility(0);
            TLRPC.User user4 = this.f44449r;
            org.telegram.ui.Components.a9 a9Var = this.f44445c;
            a9Var.r(user4);
            p9Var.f(this.f44449r, a9Var);
            textView.setText(n10.q(this.f44449r));
            if (!TextUtils.isEmpty(str)) {
                g9Var.c(str, z10);
                imageView.setVisibility(0);
                return;
            }
            g9Var.c(null, z10);
            imageView.setVisibility(8);
        } else if (!TextUtils.isEmpty(str)) {
            setClickable(false);
            setVisibility(0);
            if (this.f44446e == null) {
                ShapeDrawable L = org.telegram.ui.ActionBar.n6.L(org.telegram.messenger.g0.L(34.0f), -1);
                this.f44446e = L;
                org.telegram.ui.ActionBar.u6.x(p9Var, L, org.telegram.ui.ActionBar.n6.Fi, this.f44443a, PorterDuff.Mode.SRC_IN);
            }
            p9Var.setImageDrawable(new lq(this.f44446e, getContext().getResources().getDrawable(2131231833).mutate()));
            textView.setText(gd.N0(2131742847, null));
            g9Var.c(str, z10);
            imageView.setVisibility(8);
        } else {
            setClickable(false);
            setVisibility(8);
            g9Var.c(null, true);
        }
    }

    public float getContentBottom() {
        FrameLayout frameLayout = this.f44444b;
        return (frameLayout.getScaleY() * (frameLayout.getHeight() - frameLayout.getPivotY())) + frameLayout.getPivotY() + frameLayout.getY();
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        FrameLayout frameLayout = this.f44444b;
        int round = Math.round((getMeasuredHeight() - (frameLayout.getScaleY() * frameLayout.getMeasuredHeight())) / 2.0f);
        frameLayout.layout(0, round, frameLayout.getMeasuredWidth(), frameLayout.getMeasuredHeight() + round);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        g9 g9Var = this.h;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) g9Var.getLayoutParams();
        int ceil = ((int) Math.ceil(g9Var.a())) + 1 + layoutParams.leftMargin + layoutParams.rightMargin;
        setMeasuredDimension(View.resolveSize(Math.max(getMeasuredWidth(), ceil), i7), getMeasuredHeight());
        int max = Math.max(getMeasuredWidth(), ceil);
        float measuredWidth = getMeasuredWidth() / max;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        FrameLayout frameLayout = this.f44444b;
        frameLayout.measure(makeMeasureSpec, makeMeasureSpec2);
        frameLayout.setScaleX(measuredWidth);
        frameLayout.setScaleY(measuredWidth);
    }
}
