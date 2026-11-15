package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.hd;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fq;
public final class s8 extends FrameLayout {
    public final org.telegram.ui.ActionBar.e6 f44490a;
    public final FrameLayout f44491b;
    public final org.telegram.ui.Components.t8 f44492c;
    public final org.telegram.ui.Components.i9 d;
    public ShapeDrawable f44493e;
    public final TextView f44494f;
    public final r8 h;
    public final ImageView f44495n;
    public TLRPC.User f44496r;
    public String f44497s;

    public s8(Context context, Runnable runnable, Runnable runnable2, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f44492c = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
        this.f44490a = e6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f44491b = frameLayout;
        frameLayout.setDuplicateParentStateEnabled(true);
        frameLayout.setPivotX(0.0f);
        frameLayout.setPivotY(0.0f);
        addView(frameLayout, c8.ja.c(-1.0f, -1));
        int i7 = org.telegram.ui.ActionBar.j6.f28792a7;
        int w02 = org.telegram.ui.ActionBar.j6.w0(i7, e6Var);
        int w03 = org.telegram.ui.ActionBar.j6.w0(i7, e6Var);
        int i10 = org.telegram.ui.ActionBar.j6.f28941i6;
        org.telegram.ui.Cells.y b02 = org.telegram.ui.ActionBar.j6.b0(w02, org.telegram.ui.ActionBar.j6.w(w03, org.telegram.ui.ActionBar.j6.w0(i10, e6Var)), org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(32.0f));
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i7);
        org.telegram.ui.ActionBar.m6 p10 = org.telegram.ui.ActionBar.q6.p(i7, i10);
        frameLayout.setBackground(b02);
        org.telegram.ui.ActionBar.q6.j(frameLayout, b02, M, p10, e6Var);
        c8.na.b(this, 0.02f, 1.2f);
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
        this.d = i9Var;
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(18.0f));
        frameLayout.addView(i9Var, c8.ja.d(34, 34.0f, 19, 15.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f44494f = textView;
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.G6, e6Var);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(org.telegram.messenger.g0.o());
        frameLayout.addView(textView, c8.ja.d(-1, -2.0f, 51, 60.0f, 7.0f, 52.0f, 0.0f));
        r8 r8Var = new r8(this, context);
        this.h = r8Var;
        frameLayout.addView(r8Var, c8.ja.d(-1, -2.0f, 51, 60.0f, 26.0f, 52.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f44495n = imageView;
        imageView.setImageResource(2131232029);
        org.telegram.ui.ActionBar.q6.s(imageView, org.telegram.ui.ActionBar.j6.D6, e6Var, PorterDuff.Mode.SRC_IN);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleX(0.9f);
        imageView.setScaleY(0.9f);
        frameLayout.addView(imageView, c8.ja.d(24, 24.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        setOnClickListener(new i8(this, e6Var, runnable, runnable2, 2));
    }

    public final void a(String str, TLRPC.User user) {
        long j3;
        boolean z10;
        TLRPC.User user2 = this.f44496r;
        long j10 = 0;
        if (user2 == null) {
            j3 = 0;
        } else {
            j3 = user2.f28200id;
        }
        if (user != null) {
            j10 = user.f28200id;
        }
        if (j3 != j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f44496r = user;
        this.f44497s = str;
        setClickable(!TextUtils.isEmpty(str));
        TLRPC.User user3 = this.f44496r;
        TextView textView = this.f44494f;
        ImageView imageView = this.f44495n;
        org.telegram.ui.Components.i9 i9Var = this.d;
        r8 r8Var = this.h;
        if (user3 != null) {
            setClickable(true);
            setVisibility(0);
            TLRPC.User user4 = this.f44496r;
            org.telegram.ui.Components.t8 t8Var = this.f44492c;
            t8Var.r(user4);
            i9Var.f(this.f44496r, t8Var);
            textView.setText(q10.p(this.f44496r));
            if (!TextUtils.isEmpty(str)) {
                r8Var.c(str, z10);
                imageView.setVisibility(0);
                return;
            }
            r8Var.c(null, z10);
            imageView.setVisibility(8);
        } else if (!TextUtils.isEmpty(str)) {
            setClickable(false);
            setVisibility(0);
            if (this.f44493e == null) {
                ShapeDrawable L = org.telegram.ui.ActionBar.j6.L(org.telegram.messenger.g0.L(34.0f), -1);
                this.f44493e = L;
                org.telegram.ui.ActionBar.q6.x(i9Var, L, org.telegram.ui.ActionBar.j6.Fi, this.f44490a, PorterDuff.Mode.SRC_IN);
            }
            i9Var.setImageDrawable(new fq(this.f44493e, getContext().getResources().getDrawable(2131231829).mutate()));
            textView.setText(hd.M0(2131743099, null));
            r8Var.c(str, z10);
            imageView.setVisibility(8);
        } else {
            setClickable(false);
            setVisibility(8);
            r8Var.c(null, true);
        }
    }

    public float getContentBottom() {
        FrameLayout frameLayout = this.f44491b;
        return (frameLayout.getScaleY() * (frameLayout.getHeight() - frameLayout.getPivotY())) + frameLayout.getPivotY() + frameLayout.getY();
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        FrameLayout frameLayout = this.f44491b;
        int round = Math.round((getMeasuredHeight() - (frameLayout.getScaleY() * frameLayout.getMeasuredHeight())) / 2.0f);
        frameLayout.layout(0, round, frameLayout.getMeasuredWidth(), frameLayout.getMeasuredHeight() + round);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        r8 r8Var = this.h;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) r8Var.getLayoutParams();
        int ceil = ((int) Math.ceil(r8Var.a())) + 1 + layoutParams.leftMargin + layoutParams.rightMargin;
        setMeasuredDimension(View.resolveSize(Math.max(getMeasuredWidth(), ceil), i7), getMeasuredHeight());
        int max = Math.max(getMeasuredWidth(), ceil);
        float measuredWidth = getMeasuredWidth() / max;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        FrameLayout frameLayout = this.f44491b;
        frameLayout.measure(makeMeasureSpec, makeMeasureSpec2);
        frameLayout.setScaleX(measuredWidth);
        frameLayout.setScaleY(measuredWidth);
    }
}
