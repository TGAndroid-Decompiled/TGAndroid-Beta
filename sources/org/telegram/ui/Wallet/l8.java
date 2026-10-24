package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.wq;
public final class l8 extends FrameLayout {
    public final org.telegram.ui.ActionBar.g6 f34782a;
    public final FrameLayout f34783b;
    public final org.telegram.ui.Components.f9 f34784c;
    public final org.telegram.ui.Components.u9 d;
    public ShapeDrawable e;
    public final TextView f34785f;
    public final k8 h;
    public final ImageView f34786n;
    public TLRPC.User f34787r;
    public String f34788s;

    public l8(Context context, Runnable runnable, Runnable runnable2, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f34784c = new org.telegram.ui.Components.f9((org.telegram.ui.ActionBar.g6) null);
        this.f34782a = g6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f34783b = frameLayout;
        frameLayout.setDuplicateParentStateEnabled(true);
        frameLayout.setPivotX(0.0f);
        frameLayout.setPivotY(0.0f);
        addView(frameLayout, w7.z5.c(-1.0f, -1));
        int i10 = org.telegram.ui.ActionBar.k6.f21126a7;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i10, g6Var);
        int w03 = org.telegram.ui.ActionBar.k6.w0(i10, g6Var);
        int i11 = org.telegram.ui.ActionBar.k6.f21273i6;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.k6.a0(w02, org.telegram.ui.ActionBar.k6.v(w03, org.telegram.ui.ActionBar.k6.w0(i11, g6Var)), AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f));
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i10);
        org.telegram.ui.ActionBar.n6 q6 = org.telegram.ui.ActionBar.r6.q(i10, i11);
        frameLayout.setBackground(a02);
        org.telegram.ui.ActionBar.r6.k(frameLayout, a02, O, q6, g6Var);
        w7.b6.b(this, 0.02f, 1.2f);
        org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(context);
        this.d = u9Var;
        u9Var.setRoundRadius(AndroidUtilities.dp(18.0f));
        frameLayout.addView(u9Var, w7.z5.d(34, 34.0f, 19, 15.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f34785f = textView;
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.G6, g6Var);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, w7.z5.d(-1, -2.0f, 51, 60.0f, 7.0f, 52.0f, 0.0f));
        k8 k8Var = new k8(this, context);
        this.h = k8Var;
        frameLayout.addView(k8Var, w7.z5.d(-1, -2.0f, 51, 60.0f, 26.0f, 52.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f34786n = imageView;
        imageView.setImageResource(R.drawable.msg2_help);
        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.D6, g6Var, PorterDuff.Mode.SRC_IN);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleX(0.9f);
        imageView.setScaleY(0.9f);
        frameLayout.addView(imageView, w7.z5.d(24, 24.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        setOnClickListener(new a8(this, g6Var, runnable, runnable2, 1));
    }

    public final void a(String str, TLRPC.User user) {
        long j10;
        boolean z10;
        TLRPC.User user2 = this.f34787r;
        long j11 = 0;
        if (user2 == null) {
            j10 = 0;
        } else {
            j10 = user2.f20491id;
        }
        if (user != null) {
            j11 = user.f20491id;
        }
        if (j10 != j11) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f34787r = user;
        this.f34788s = str;
        setClickable(!TextUtils.isEmpty(str));
        TLRPC.User user3 = this.f34787r;
        TextView textView = this.f34785f;
        ImageView imageView = this.f34786n;
        org.telegram.ui.Components.u9 u9Var = this.d;
        k8 k8Var = this.h;
        if (user3 != null) {
            setClickable(true);
            setVisibility(0);
            TLRPC.User user4 = this.f34787r;
            org.telegram.ui.Components.f9 f9Var = this.f34784c;
            f9Var.r(user4);
            u9Var.e(this.f34787r, f9Var);
            textView.setText(UserObject.getUserName(this.f34787r));
            if (!TextUtils.isEmpty(str)) {
                k8Var.c(str, z10);
                imageView.setVisibility(0);
                return;
            }
            k8Var.c(null, z10);
            imageView.setVisibility(8);
        } else if (!TextUtils.isEmpty(str)) {
            setClickable(false);
            setVisibility(0);
            if (this.e == null) {
                ShapeDrawable K = org.telegram.ui.ActionBar.k6.K(AndroidUtilities.dp(34.0f), -1);
                this.e = K;
                org.telegram.ui.ActionBar.r6.z(u9Var, K, org.telegram.ui.ActionBar.k6.Oh, this.f34782a, PorterDuff.Mode.SRC_IN);
            }
            u9Var.setImageDrawable(new wq(this.e, getContext().getResources().getDrawable(R.drawable.menu_gram_24).mutate()));
            textView.setText(LocaleController.getString(R.string.WalletGramWalletAddress));
            k8Var.c(str, z10);
            imageView.setVisibility(8);
        } else {
            setClickable(false);
            setVisibility(8);
            k8Var.c(null, true);
        }
    }

    public float getContentBottom() {
        FrameLayout frameLayout = this.f34783b;
        return (frameLayout.getScaleY() * (frameLayout.getHeight() - frameLayout.getPivotY())) + frameLayout.getPivotY() + frameLayout.getY();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        FrameLayout frameLayout = this.f34783b;
        int round = Math.round((getMeasuredHeight() - (frameLayout.getScaleY() * frameLayout.getMeasuredHeight())) / 2.0f);
        frameLayout.layout(0, round, frameLayout.getMeasuredWidth(), frameLayout.getMeasuredHeight() + round);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        k8 k8Var = this.h;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) k8Var.getLayoutParams();
        int ceil = ((int) Math.ceil(k8Var.a())) + 1 + layoutParams.leftMargin + layoutParams.rightMargin;
        setMeasuredDimension(View.resolveSize(Math.max(getMeasuredWidth(), ceil), i10), getMeasuredHeight());
        int max = Math.max(getMeasuredWidth(), ceil);
        float measuredWidth = getMeasuredWidth() / max;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        FrameLayout frameLayout = this.f34783b;
        frameLayout.measure(makeMeasureSpec, makeMeasureSpec2);
        frameLayout.setScaleX(measuredWidth);
        frameLayout.setScaleY(measuredWidth);
    }
}
