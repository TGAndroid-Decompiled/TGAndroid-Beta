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
import org.telegram.messenger.o10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.oq;
public final class g9 extends FrameLayout {
    public final org.telegram.ui.ActionBar.h6 f44311a;
    public final FrameLayout f44312b;
    public final org.telegram.ui.Components.b9 f44313c;
    public final org.telegram.ui.Components.q9 d;
    public ShapeDrawable f44314e;
    public final TextView f44315f;
    public final f9 h;
    public final ImageView f44316n;
    public TLRPC.User f44317r;
    public String f44318s;

    public g9(Context context, Runnable runnable, Runnable runnable2, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f44313c = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
        this.f44311a = h6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f44312b = frameLayout;
        frameLayout.setDuplicateParentStateEnabled(true);
        frameLayout.setPivotX(0.0f);
        frameLayout.setPivotY(0.0f);
        addView(frameLayout, c8.ma.c(-1.0f, -1));
        int i7 = org.telegram.ui.ActionBar.m6.f29321a7;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
        int w03 = org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
        int i10 = org.telegram.ui.ActionBar.m6.f29470i6;
        org.telegram.ui.Cells.y b02 = org.telegram.ui.ActionBar.m6.b0(w02, org.telegram.ui.ActionBar.m6.w(w03, org.telegram.ui.ActionBar.m6.w0(i10, h6Var)), org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(32.0f));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i7);
        org.telegram.ui.ActionBar.p6 p10 = org.telegram.ui.ActionBar.t6.p(i7, i10);
        frameLayout.setBackground(b02);
        org.telegram.ui.ActionBar.t6.j(frameLayout, b02, M, p10, h6Var);
        c8.ra.b(this, 0.02f, 1.2f);
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.d = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(18.0f));
        frameLayout.addView(q9Var, c8.ma.d(34, 34.0f, 19, 15.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f44315f = textView;
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.G6, h6Var);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(org.telegram.messenger.g0.o());
        frameLayout.addView(textView, c8.ma.d(-1, -2.0f, 51, 60.0f, 7.0f, 52.0f, 0.0f));
        f9 f9Var = new f9(this, context);
        this.h = f9Var;
        frameLayout.addView(f9Var, c8.ma.d(-1, -2.0f, 51, 60.0f, 26.0f, 52.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f44316n = imageView;
        imageView.setImageResource(2131232030);
        org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.D6, h6Var, PorterDuff.Mode.SRC_IN);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleX(0.9f);
        imageView.setScaleY(0.9f);
        frameLayout.addView(imageView, c8.ma.d(24, 24.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        setOnClickListener(new w8(this, h6Var, runnable, runnable2, 2));
    }

    public final void a(String str, TLRPC.User user) {
        long j3;
        boolean z10;
        TLRPC.User user2 = this.f44317r;
        long j10 = 0;
        if (user2 == null) {
            j3 = 0;
        } else {
            j3 = user2.f28580id;
        }
        if (user != null) {
            j10 = user.f28580id;
        }
        if (j3 != j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f44317r = user;
        this.f44318s = str;
        setClickable(!TextUtils.isEmpty(str));
        TLRPC.User user3 = this.f44317r;
        TextView textView = this.f44315f;
        ImageView imageView = this.f44316n;
        org.telegram.ui.Components.q9 q9Var = this.d;
        f9 f9Var = this.h;
        if (user3 != null) {
            setClickable(true);
            setVisibility(0);
            TLRPC.User user4 = this.f44317r;
            org.telegram.ui.Components.b9 b9Var = this.f44313c;
            b9Var.r(user4);
            q9Var.f(this.f44317r, b9Var);
            textView.setText(o10.q(this.f44317r));
            if (!TextUtils.isEmpty(str)) {
                f9Var.c(str, z10);
                imageView.setVisibility(0);
                return;
            }
            f9Var.c(null, z10);
            imageView.setVisibility(8);
        } else if (!TextUtils.isEmpty(str)) {
            setClickable(false);
            setVisibility(0);
            if (this.f44314e == null) {
                ShapeDrawable L = org.telegram.ui.ActionBar.m6.L(org.telegram.messenger.g0.L(34.0f), -1);
                this.f44314e = L;
                org.telegram.ui.ActionBar.t6.x(q9Var, L, org.telegram.ui.ActionBar.m6.Fi, this.f44311a, PorterDuff.Mode.SRC_IN);
            }
            q9Var.setImageDrawable(new oq(this.f44314e, getContext().getResources().getDrawable(2131231830).mutate()));
            textView.setText(gd.N0(2131742854, null));
            f9Var.c(str, z10);
            imageView.setVisibility(8);
        } else {
            setClickable(false);
            setVisibility(8);
            f9Var.c(null, true);
        }
    }

    public float getContentBottom() {
        FrameLayout frameLayout = this.f44312b;
        return (frameLayout.getScaleY() * (frameLayout.getHeight() - frameLayout.getPivotY())) + frameLayout.getPivotY() + frameLayout.getY();
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        FrameLayout frameLayout = this.f44312b;
        int round = Math.round((getMeasuredHeight() - (frameLayout.getScaleY() * frameLayout.getMeasuredHeight())) / 2.0f);
        frameLayout.layout(0, round, frameLayout.getMeasuredWidth(), frameLayout.getMeasuredHeight() + round);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        f9 f9Var = this.h;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) f9Var.getLayoutParams();
        int ceil = ((int) Math.ceil(f9Var.a())) + 1 + layoutParams.leftMargin + layoutParams.rightMargin;
        setMeasuredDimension(View.resolveSize(Math.max(getMeasuredWidth(), ceil), i7), getMeasuredHeight());
        int max = Math.max(getMeasuredWidth(), ceil);
        float measuredWidth = getMeasuredWidth() / max;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        FrameLayout frameLayout = this.f44312b;
        frameLayout.measure(makeMeasureSpec, makeMeasureSpec2);
        frameLayout.setScaleX(measuredWidth);
        frameLayout.setScaleY(measuredWidth);
    }
}
