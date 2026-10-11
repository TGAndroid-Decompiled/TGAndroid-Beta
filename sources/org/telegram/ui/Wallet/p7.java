package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
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
import org.telegram.ui.Components.fr;
import org.telegram.ui.Components.y9;
public final class p7 extends FrameLayout {
    public final org.telegram.ui.ActionBar.d6 f35425a;
    public final FrameLayout f35426b;
    public final org.telegram.ui.Components.j9 f35427c;
    public final y9 d;
    public final TextView f35428e;
    public final o7 f35429f;
    public final ImageView h;
    public TLRPC.User f35430n;
    public String f35431r;

    public p7(Context context, Runnable runnable, Runnable runnable2, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f35427c = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.d6) null);
        this.f35425a = d6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f35426b = frameLayout;
        frameLayout.setDuplicateParentStateEnabled(true);
        frameLayout.setPivotX(0.0f);
        frameLayout.setPivotY(0.0f);
        addView(frameLayout, w7.x5.d(-1.0f, -1));
        int i10 = org.telegram.ui.ActionBar.h6.f20730a7;
        frameLayout.setBackground(org.telegram.ui.ActionBar.h6.a0(org.telegram.ui.ActionBar.h6.w0(i10, d6Var), org.telegram.ui.ActionBar.h6.v(org.telegram.ui.ActionBar.h6.w0(i10, d6Var), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20877i6, d6Var)), AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f)));
        w7.z5.b(this, 0.02f, 1.2f);
        y9 y9Var = new y9(context);
        this.d = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(18.0f));
        frameLayout.addView(y9Var, w7.x5.a(34.0f, 15.0f, 0.0f, 0.0f, 0.0f, 34, 19));
        TextView textView = new TextView(context);
        this.f35428e = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var));
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, w7.x5.a(-2.0f, 60.0f, 7.0f, 52.0f, 0.0f, -1, 51));
        o7 o7Var = new o7(this, context);
        this.f35429f = o7Var;
        frameLayout.addView(o7Var, w7.x5.a(-2.0f, 60.0f, 26.0f, 52.0f, 0.0f, -1, 51));
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        imageView.setImageResource(R.drawable.msg2_help);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.D6, d6Var), PorterDuff.Mode.SRC_IN));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleX(0.9f);
        imageView.setScaleY(0.9f);
        frameLayout.addView(imageView, w7.x5.a(24.0f, 0.0f, 0.0f, 14.0f, 0.0f, 24, 21));
        setOnClickListener(new g7(this, runnable, d6Var, runnable2));
    }

    public final void a(String str, TLRPC.User user) {
        long j3;
        boolean z10;
        TLRPC.User user2 = this.f35430n;
        long j10 = 0;
        if (user2 == null) {
            j3 = 0;
        } else {
            j3 = user2.f20179id;
        }
        if (user != null) {
            j10 = user.f20179id;
        }
        if (j3 != j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f35430n = user;
        this.f35431r = str;
        setClickable(!TextUtils.isEmpty(str));
        TLRPC.User user3 = this.f35430n;
        TextView textView = this.f35428e;
        y9 y9Var = this.d;
        ImageView imageView = this.h;
        o7 o7Var = this.f35429f;
        if (user3 != null) {
            setClickable(true);
            setVisibility(0);
            TLRPC.User user4 = this.f35430n;
            org.telegram.ui.Components.j9 j9Var = this.f35427c;
            j9Var.r(user4);
            y9Var.e(this.f35430n, j9Var);
            textView.setText(UserObject.getUserName(this.f35430n));
            if (!TextUtils.isEmpty(str)) {
                o7Var.c(str, z10);
                imageView.setVisibility(0);
                return;
            }
            o7Var.c(null, z10);
            imageView.setVisibility(8);
        } else if (!TextUtils.isEmpty(str)) {
            setClickable(false);
            setVisibility(0);
            y9Var.setImageDrawable(new fr(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(34.0f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, this.f35425a)), getContext().getResources().getDrawable(R.drawable.menu_gram_24).mutate()));
            textView.setText(LocaleController.getString(R.string.WalletGramWalletAddress));
            o7Var.c(str, z10);
            imageView.setVisibility(8);
        } else {
            setClickable(false);
            setVisibility(8);
            o7Var.c(null, true);
        }
    }

    public float getContentBottom() {
        FrameLayout frameLayout = this.f35426b;
        return (frameLayout.getScaleY() * (frameLayout.getHeight() - frameLayout.getPivotY())) + frameLayout.getPivotY() + frameLayout.getY();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        FrameLayout frameLayout = this.f35426b;
        int round = Math.round((getMeasuredHeight() - (frameLayout.getScaleY() * frameLayout.getMeasuredHeight())) / 2.0f);
        frameLayout.layout(0, round, frameLayout.getMeasuredWidth(), frameLayout.getMeasuredHeight() + round);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        o7 o7Var = this.f35429f;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) o7Var.getLayoutParams();
        int ceil = ((int) Math.ceil(o7Var.a())) + 1 + layoutParams.leftMargin + layoutParams.rightMargin;
        setMeasuredDimension(View.resolveSize(Math.max(getMeasuredWidth(), ceil), i10), getMeasuredHeight());
        int max = Math.max(getMeasuredWidth(), ceil);
        float measuredWidth = getMeasuredWidth() / max;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        FrameLayout frameLayout = this.f35426b;
        frameLayout.measure(makeMeasureSpec, makeMeasureSpec2);
        frameLayout.setScaleX(measuredWidth);
        frameLayout.setScaleY(measuredWidth);
    }
}
