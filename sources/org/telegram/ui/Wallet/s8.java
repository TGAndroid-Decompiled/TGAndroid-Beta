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
public final class s8 extends FrameLayout {
    public final org.telegram.ui.ActionBar.h6 f43162a;
    public final FrameLayout f43163b;
    public final org.telegram.ui.Components.v8 f43164c;
    public final org.telegram.ui.Components.k9 d;
    public ShapeDrawable f43165e;
    public final TextView f43166f;
    public final r8 h;
    public final ImageView f43167n;
    public TLRPC.User f43168r;
    public String f43169s;

    public s8(Context context, Runnable runnable, Runnable runnable2, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f43164c = new org.telegram.ui.Components.v8((org.telegram.ui.ActionBar.h6) null);
        this.f43162a = h6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f43163b = frameLayout;
        frameLayout.setDuplicateParentStateEnabled(true);
        frameLayout.setPivotX(0.0f);
        frameLayout.setPivotY(0.0f);
        addView(frameLayout, c8.ha.c(-1.0f, -1));
        int i7 = org.telegram.ui.ActionBar.m6.f27834a7;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
        int w03 = org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
        int i10 = org.telegram.ui.ActionBar.m6.f27982i6;
        org.telegram.ui.Cells.y b02 = org.telegram.ui.ActionBar.m6.b0(w02, org.telegram.ui.ActionBar.m6.w(w03, org.telegram.ui.ActionBar.m6.w0(i10, h6Var)), org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(32.0f));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i7);
        org.telegram.ui.ActionBar.p6 p10 = org.telegram.ui.ActionBar.t6.p(i7, i10);
        frameLayout.setBackground(b02);
        org.telegram.ui.ActionBar.t6.j(frameLayout, b02, M, p10, h6Var);
        c8.ka.b(this, 0.02f, 1.2f);
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.d = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(18.0f));
        frameLayout.addView(k9Var, c8.ha.d(34, 34.0f, 19, 15.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f43166f = textView;
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.G6, h6Var);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(org.telegram.messenger.g0.o());
        frameLayout.addView(textView, c8.ha.d(-1, -2.0f, 51, 60.0f, 7.0f, 52.0f, 0.0f));
        r8 r8Var = new r8(this, context);
        this.h = r8Var;
        frameLayout.addView(r8Var, c8.ha.d(-1, -2.0f, 51, 60.0f, 26.0f, 52.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f43167n = imageView;
        imageView.setImageResource(2131232029);
        org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.D6, h6Var, PorterDuff.Mode.SRC_IN);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleX(0.9f);
        imageView.setScaleY(0.9f);
        frameLayout.addView(imageView, c8.ha.d(24, 24.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        setOnClickListener(new j8(this, h6Var, runnable, runnable2, 2));
    }

    public final void a(String str, TLRPC.User user) {
        long j3;
        boolean z9;
        TLRPC.User user2 = this.f43168r;
        long j10 = 0;
        if (user2 == null) {
            j3 = 0;
        } else {
            j3 = user2.f27109id;
        }
        if (user != null) {
            j10 = user.f27109id;
        }
        if (j3 != j10) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f43168r = user;
        this.f43169s = str;
        setClickable(!TextUtils.isEmpty(str));
        TLRPC.User user3 = this.f43168r;
        TextView textView = this.f43166f;
        ImageView imageView = this.f43167n;
        org.telegram.ui.Components.k9 k9Var = this.d;
        r8 r8Var = this.h;
        if (user3 != null) {
            setClickable(true);
            setVisibility(0);
            TLRPC.User user4 = this.f43168r;
            org.telegram.ui.Components.v8 v8Var = this.f43164c;
            v8Var.r(user4);
            k9Var.e(this.f43168r, v8Var);
            textView.setText(t10.p(this.f43168r));
            if (!TextUtils.isEmpty(str)) {
                r8Var.c(str, z9);
                imageView.setVisibility(0);
                return;
            }
            r8Var.c(null, z9);
            imageView.setVisibility(8);
        } else if (!TextUtils.isEmpty(str)) {
            setClickable(false);
            setVisibility(0);
            if (this.f43165e == null) {
                ShapeDrawable L = org.telegram.ui.ActionBar.m6.L(org.telegram.messenger.g0.L(34.0f), -1);
                this.f43165e = L;
                org.telegram.ui.ActionBar.t6.x(k9Var, L, org.telegram.ui.ActionBar.m6.Ci, this.f43162a, PorterDuff.Mode.SRC_IN);
            }
            k9Var.setImageDrawable(new xp(this.f43165e, getContext().getResources().getDrawable(2131231829).mutate()));
            textView.setText(id.M0(2131743099, null));
            r8Var.c(str, z9);
            imageView.setVisibility(8);
        } else {
            setClickable(false);
            setVisibility(8);
            r8Var.c(null, true);
        }
    }

    public float getContentBottom() {
        FrameLayout frameLayout = this.f43163b;
        return (frameLayout.getScaleY() * (frameLayout.getHeight() - frameLayout.getPivotY())) + frameLayout.getPivotY() + frameLayout.getY();
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        FrameLayout frameLayout = this.f43163b;
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
        FrameLayout frameLayout = this.f43163b;
        frameLayout.measure(makeMeasureSpec, makeMeasureSpec2);
        frameLayout.setScaleX(measuredWidth);
        frameLayout.setScaleY(measuredWidth);
    }
}
