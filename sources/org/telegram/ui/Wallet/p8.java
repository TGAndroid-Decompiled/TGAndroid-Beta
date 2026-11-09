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
public final class p8 extends FrameLayout {
    public final org.telegram.ui.ActionBar.g6 f42990a;
    public final FrameLayout f42991b;
    public final org.telegram.ui.Components.w8 f42992c;
    public final org.telegram.ui.Components.l9 d;
    public ShapeDrawable f42993e;
    public final TextView f42994f;
    public final o8 h;
    public final ImageView f42995n;
    public TLRPC.User f42996r;
    public String f42997s;

    public p8(Context context, Runnable runnable, Runnable runnable2, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f42992c = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.g6) null);
        this.f42990a = g6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f42991b = frameLayout;
        frameLayout.setDuplicateParentStateEnabled(true);
        frameLayout.setPivotX(0.0f);
        frameLayout.setPivotY(0.0f);
        addView(frameLayout, c8.ha.c(-1.0f, -1));
        int i7 = org.telegram.ui.ActionBar.l6.f27809a7;
        int w02 = org.telegram.ui.ActionBar.l6.w0(i7, g6Var);
        int w03 = org.telegram.ui.ActionBar.l6.w0(i7, g6Var);
        int i10 = org.telegram.ui.ActionBar.l6.f27957i6;
        org.telegram.ui.Cells.y b02 = org.telegram.ui.ActionBar.l6.b0(w02, org.telegram.ui.ActionBar.l6.w(w03, org.telegram.ui.ActionBar.l6.w0(i10, g6Var)), org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(32.0f));
        org.telegram.ui.ActionBar.o6 M = org.telegram.ui.ActionBar.s6.M(i7);
        org.telegram.ui.ActionBar.o6 p10 = org.telegram.ui.ActionBar.s6.p(i7, i10);
        frameLayout.setBackground(b02);
        org.telegram.ui.ActionBar.s6.j(frameLayout, b02, M, p10, g6Var);
        c8.ka.b(this, 0.02f, 1.2f);
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.d = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(18.0f));
        frameLayout.addView(l9Var, c8.ha.d(34, 34.0f, 19, 15.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f42994f = textView;
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.G6, g6Var);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(org.telegram.messenger.g0.o());
        frameLayout.addView(textView, c8.ha.d(-1, -2.0f, 51, 60.0f, 7.0f, 52.0f, 0.0f));
        o8 o8Var = new o8(this, context);
        this.h = o8Var;
        frameLayout.addView(o8Var, c8.ha.d(-1, -2.0f, 51, 60.0f, 26.0f, 52.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f42995n = imageView;
        imageView.setImageResource(2131232029);
        org.telegram.ui.ActionBar.s6.s(imageView, org.telegram.ui.ActionBar.l6.D6, g6Var, PorterDuff.Mode.SRC_IN);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleX(0.9f);
        imageView.setScaleY(0.9f);
        frameLayout.addView(imageView, c8.ha.d(24, 24.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        setOnClickListener(new g8(this, g6Var, runnable, runnable2, 2));
    }

    public final void a(String str, TLRPC.User user) {
        long j3;
        boolean z9;
        TLRPC.User user2 = this.f42996r;
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
        this.f42996r = user;
        this.f42997s = str;
        setClickable(!TextUtils.isEmpty(str));
        TLRPC.User user3 = this.f42996r;
        TextView textView = this.f42994f;
        ImageView imageView = this.f42995n;
        org.telegram.ui.Components.l9 l9Var = this.d;
        o8 o8Var = this.h;
        if (user3 != null) {
            setClickable(true);
            setVisibility(0);
            TLRPC.User user4 = this.f42996r;
            org.telegram.ui.Components.w8 w8Var = this.f42992c;
            w8Var.r(user4);
            l9Var.e(this.f42996r, w8Var);
            textView.setText(t10.p(this.f42996r));
            if (!TextUtils.isEmpty(str)) {
                o8Var.c(str, z9);
                imageView.setVisibility(0);
                return;
            }
            o8Var.c(null, z9);
            imageView.setVisibility(8);
        } else if (!TextUtils.isEmpty(str)) {
            setClickable(false);
            setVisibility(0);
            if (this.f42993e == null) {
                ShapeDrawable L = org.telegram.ui.ActionBar.l6.L(org.telegram.messenger.g0.L(34.0f), -1);
                this.f42993e = L;
                org.telegram.ui.ActionBar.s6.x(l9Var, L, org.telegram.ui.ActionBar.l6.Ci, this.f42990a, PorterDuff.Mode.SRC_IN);
            }
            l9Var.setImageDrawable(new xp(this.f42993e, getContext().getResources().getDrawable(2131231829).mutate()));
            textView.setText(id.M0(2131743099, null));
            o8Var.c(str, z9);
            imageView.setVisibility(8);
        } else {
            setClickable(false);
            setVisibility(8);
            o8Var.c(null, true);
        }
    }

    public float getContentBottom() {
        FrameLayout frameLayout = this.f42991b;
        return (frameLayout.getScaleY() * (frameLayout.getHeight() - frameLayout.getPivotY())) + frameLayout.getPivotY() + frameLayout.getY();
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        FrameLayout frameLayout = this.f42991b;
        int round = Math.round((getMeasuredHeight() - (frameLayout.getScaleY() * frameLayout.getMeasuredHeight())) / 2.0f);
        frameLayout.layout(0, round, frameLayout.getMeasuredWidth(), frameLayout.getMeasuredHeight() + round);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        o8 o8Var = this.h;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) o8Var.getLayoutParams();
        int ceil = ((int) Math.ceil(o8Var.a())) + 1 + layoutParams.leftMargin + layoutParams.rightMargin;
        setMeasuredDimension(View.resolveSize(Math.max(getMeasuredWidth(), ceil), i7), getMeasuredHeight());
        int max = Math.max(getMeasuredWidth(), ceil);
        float measuredWidth = getMeasuredWidth() / max;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        FrameLayout frameLayout = this.f42991b;
        frameLayout.measure(makeMeasureSpec, makeMeasureSpec2);
        frameLayout.setScaleX(measuredWidth);
        frameLayout.setScaleY(measuredWidth);
    }
}
