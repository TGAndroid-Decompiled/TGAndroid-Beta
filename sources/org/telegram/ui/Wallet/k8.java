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
import org.telegram.ui.Components.ar;
import org.telegram.ui.Components.gb1;
public final class k8 extends FrameLayout {
    public final org.telegram.ui.ActionBar.u6 f36790a;
    public final FrameLayout f36791b;
    public final org.telegram.ui.Components.j9 f36792c;
    public final org.telegram.ui.Components.y9 d;
    public ShapeDrawable e;
    public final TextView f36793f;
    public final j8 h;
    public final ImageView f36794n;
    public TLRPC.User f36795r;
    public String f36796s;

    public k8(Context context, Runnable runnable, Runnable runnable2, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.f36792c = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
        this.f36790a = u6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f36791b = frameLayout;
        frameLayout.setDuplicateParentStateEnabled(true);
        frameLayout.setPivotX(0.0f);
        frameLayout.setPivotY(0.0f);
        addView(frameLayout, gb1.g(-1.0f, -1));
        int i10 = org.telegram.ui.ActionBar.y6.f23297a7;
        int w02 = org.telegram.ui.ActionBar.y6.w0(i10, u6Var);
        int w03 = org.telegram.ui.ActionBar.y6.w0(i10, u6Var);
        int i11 = org.telegram.ui.ActionBar.y6.f23446i6;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.y6.a0(w02, org.telegram.ui.ActionBar.y6.v(w03, org.telegram.ui.ActionBar.y6.w0(i11, u6Var)), AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f));
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i10);
        org.telegram.ui.ActionBar.b7 q5 = org.telegram.ui.ActionBar.f7.q(i10, i11);
        frameLayout.setBackground(a02);
        org.telegram.ui.ActionBar.f7.k(frameLayout, a02, N, q5, u6Var);
        gb1.c(this, 0.02f, 1.2f);
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.d = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(18.0f));
        frameLayout.addView(y9Var, gb1.h(34, 34.0f, 19, 15.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f36793f = textView;
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.G6, u6Var);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, gb1.h(-1, -2.0f, 51, 60.0f, 7.0f, 52.0f, 0.0f));
        j8 j8Var = new j8(this, context);
        this.h = j8Var;
        frameLayout.addView(j8Var, gb1.h(-1, -2.0f, 51, 60.0f, 26.0f, 52.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f36794n = imageView;
        imageView.setImageResource(R.drawable.msg2_help);
        org.telegram.ui.ActionBar.f7.t(imageView, org.telegram.ui.ActionBar.y6.D6, u6Var, PorterDuff.Mode.SRC_IN);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleX(0.9f);
        imageView.setScaleY(0.9f);
        frameLayout.addView(imageView, gb1.h(24, 24.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        setOnClickListener(new a8(this, u6Var, runnable, runnable2, 1));
    }

    public final void a(String str, TLRPC.User user) {
        long j10;
        boolean z10;
        TLRPC.User user2 = this.f36795r;
        long j11 = 0;
        if (user2 == null) {
            j10 = 0;
        } else {
            j10 = user2.f22174id;
        }
        if (user != null) {
            j11 = user.f22174id;
        }
        if (j10 != j11) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f36795r = user;
        this.f36796s = str;
        setClickable(!TextUtils.isEmpty(str));
        TLRPC.User user3 = this.f36795r;
        TextView textView = this.f36793f;
        ImageView imageView = this.f36794n;
        org.telegram.ui.Components.y9 y9Var = this.d;
        j8 j8Var = this.h;
        if (user3 != null) {
            setClickable(true);
            setVisibility(0);
            TLRPC.User user4 = this.f36795r;
            org.telegram.ui.Components.j9 j9Var = this.f36792c;
            j9Var.r(user4);
            y9Var.f(this.f36795r, j9Var);
            textView.setText(UserObject.getUserName(this.f36795r));
            if (!TextUtils.isEmpty(str)) {
                j8Var.c(str, z10);
                imageView.setVisibility(0);
                return;
            }
            j8Var.c(null, z10);
            imageView.setVisibility(8);
        } else if (!TextUtils.isEmpty(str)) {
            setClickable(false);
            setVisibility(0);
            if (this.e == null) {
                ShapeDrawable K = org.telegram.ui.ActionBar.y6.K(AndroidUtilities.dp(34.0f), -1);
                this.e = K;
                org.telegram.ui.ActionBar.f7.y(y9Var, K, org.telegram.ui.ActionBar.y6.Oh, this.f36790a, PorterDuff.Mode.SRC_IN);
            }
            y9Var.setImageDrawable(new ar(this.e, getContext().getResources().getDrawable(R.drawable.menu_gram_24).mutate()));
            textView.setText(LocaleController.getString(R.string.WalletGramWalletAddress));
            j8Var.c(str, z10);
            imageView.setVisibility(8);
        } else {
            setClickable(false);
            setVisibility(8);
            j8Var.c(null, true);
        }
    }

    public float getContentBottom() {
        FrameLayout frameLayout = this.f36791b;
        return (frameLayout.getScaleY() * (frameLayout.getHeight() - frameLayout.getPivotY())) + frameLayout.getPivotY() + frameLayout.getY();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        FrameLayout frameLayout = this.f36791b;
        int round = Math.round((getMeasuredHeight() - (frameLayout.getScaleY() * frameLayout.getMeasuredHeight())) / 2.0f);
        frameLayout.layout(0, round, frameLayout.getMeasuredWidth(), frameLayout.getMeasuredHeight() + round);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        j8 j8Var = this.h;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) j8Var.getLayoutParams();
        int ceil = ((int) Math.ceil(j8Var.a())) + 1 + layoutParams.leftMargin + layoutParams.rightMargin;
        setMeasuredDimension(View.resolveSize(Math.max(getMeasuredWidth(), ceil), i10), getMeasuredHeight());
        int max = Math.max(getMeasuredWidth(), ceil);
        float measuredWidth = getMeasuredWidth() / max;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        FrameLayout frameLayout = this.f36791b;
        frameLayout.measure(makeMeasureSpec, makeMeasureSpec2);
        frameLayout.setScaleX(measuredWidth);
        frameLayout.setScaleY(measuredWidth);
    }
}
