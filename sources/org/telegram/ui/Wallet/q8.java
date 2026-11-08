package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.id;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.xp;
public final class q8 extends FrameLayout {
    public final org.telegram.ui.ActionBar.f6 f43072a;
    public final FrameLayout f43073b;
    public final org.telegram.ui.Components.w8 f43074c;
    public final org.telegram.ui.Components.l9 d;
    public ShapeDrawable f43075e;
    public final TextView f43076f;
    public final p8 h;
    public final ImageView f43077n;
    public TLRPC.User f43078r;
    public String f43079s;

    public q8(Context context, Runnable runnable, Runnable runnable2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f43074c = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
        this.f43072a = f6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f43073b = frameLayout;
        frameLayout.setDuplicateParentStateEnabled(true);
        frameLayout.setPivotX(0.0f);
        frameLayout.setPivotY(0.0f);
        addView(frameLayout, c8.ha.c(-1.0f, -1));
        int i7 = org.telegram.ui.ActionBar.k6.f27796a7;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i7, f6Var);
        int w03 = org.telegram.ui.ActionBar.k6.w0(i7, f6Var);
        int i10 = org.telegram.ui.ActionBar.k6.f27944i6;
        org.telegram.ui.Cells.y b02 = org.telegram.ui.ActionBar.k6.b0(w02, org.telegram.ui.ActionBar.k6.w(w03, org.telegram.ui.ActionBar.k6.w0(i10, f6Var)), org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(32.0f));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i7);
        org.telegram.ui.ActionBar.n6 q10 = org.telegram.ui.ActionBar.r6.q(i7, i10);
        frameLayout.setBackground(b02);
        org.telegram.ui.ActionBar.r6.k(frameLayout, b02, N, q10, f6Var);
        c8.ka.b(this, 0.02f, 1.2f);
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.d = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(18.0f));
        frameLayout.addView(l9Var, c8.ha.d(34, 34.0f, 19, 15.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f43076f = textView;
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, f6Var);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(org.telegram.messenger.g0.o());
        frameLayout.addView(textView, c8.ha.d(-1, -2.0f, 51, 60.0f, 7.0f, 52.0f, 0.0f));
        p8 p8Var = new p8(this, context);
        this.h = p8Var;
        frameLayout.addView(p8Var, c8.ha.d(-1, -2.0f, 51, 60.0f, 26.0f, 52.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f43077n = imageView;
        imageView.setImageResource(2131232029);
        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.D6, f6Var, PorterDuff.Mode.SRC_IN);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleX(0.9f);
        imageView.setScaleY(0.9f);
        frameLayout.addView(imageView, c8.ha.d(24, 24.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        setOnClickListener(new h8(this, f6Var, runnable, runnable2, 2));
    }

    public final void a(String str, TLRPC.User user) {
        long j3;
        boolean z9;
        TLRPC.User user2 = this.f43078r;
        long j10 = 0;
        if (user2 == null) {
            j3 = 0;
        } else {
            j3 = user2.f27105id;
        }
        if (user != null) {
            j10 = user.f27105id;
        }
        if (j3 != j10) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f43078r = user;
        this.f43079s = str;
        setClickable(!TextUtils.isEmpty(str));
        TLRPC.User user3 = this.f43078r;
        TextView textView = this.f43076f;
        ImageView imageView = this.f43077n;
        org.telegram.ui.Components.l9 l9Var = this.d;
        p8 p8Var = this.h;
        if (user3 != null) {
            setClickable(true);
            setVisibility(0);
            TLRPC.User user4 = this.f43078r;
            org.telegram.ui.Components.w8 w8Var = this.f43074c;
            w8Var.r(user4);
            l9Var.e(this.f43078r, w8Var);
            textView.setText(t10.p(this.f43078r));
            if (!TextUtils.isEmpty(str)) {
                p8Var.c(str, z9);
                imageView.setVisibility(0);
                return;
            }
            p8Var.c(null, z9);
            imageView.setVisibility(8);
        } else if (!TextUtils.isEmpty(str)) {
            setClickable(false);
            setVisibility(0);
            if (this.f43075e == null) {
                ShapeDrawable L = org.telegram.ui.ActionBar.k6.L(org.telegram.messenger.g0.L(34.0f), -1);
                this.f43075e = L;
                org.telegram.ui.ActionBar.r6.y(l9Var, L, org.telegram.ui.ActionBar.k6.Ci, this.f43072a, PorterDuff.Mode.SRC_IN);
            }
            l9Var.setImageDrawable(new xp(this.f43075e, getContext().getResources().getDrawable(2131231829).mutate()));
            textView.setText(id.M0(2131743102, null));
            p8Var.c(str, z9);
            imageView.setVisibility(8);
        } else {
            setClickable(false);
            setVisibility(8);
            p8Var.c(null, true);
        }
    }

    public float getContentBottom() {
        FrameLayout frameLayout = this.f43073b;
        return (frameLayout.getScaleY() * (frameLayout.getHeight() - frameLayout.getPivotY())) + frameLayout.getPivotY() + frameLayout.getY();
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        FrameLayout frameLayout = this.f43073b;
        int round = Math.round((getMeasuredHeight() - (frameLayout.getScaleY() * frameLayout.getMeasuredHeight())) / 2.0f);
        frameLayout.layout(0, round, frameLayout.getMeasuredWidth(), frameLayout.getMeasuredHeight() + round);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        p8 p8Var = this.h;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) p8Var.getLayoutParams();
        int ceil = ((int) Math.ceil(p8Var.a())) + 1 + layoutParams.leftMargin + layoutParams.rightMargin;
        setMeasuredDimension(View.resolveSize(Math.max(getMeasuredWidth(), ceil), i7), getMeasuredHeight());
        int max = Math.max(getMeasuredWidth(), ceil);
        float measuredWidth = getMeasuredWidth() / max;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        FrameLayout frameLayout = this.f43073b;
        frameLayout.measure(makeMeasureSpec, makeMeasureSpec2);
        frameLayout.setScaleX(measuredWidth);
        frameLayout.setScaleY(measuredWidth);
    }
}
