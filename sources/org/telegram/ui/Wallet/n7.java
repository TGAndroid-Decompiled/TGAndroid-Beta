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
import org.telegram.ui.Components.cr;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.z9;
public final class n7 extends FrameLayout {
    public final org.telegram.ui.ActionBar.c6 f33255a;
    public final FrameLayout f33256b;
    public final k9 f33257c;
    public final z9 d;
    public final TextView e;
    public final m7 f33258f;
    public final ImageView h;
    public TLRPC.User f33259n;
    public String f33260r;

    public n7(Context context, Runnable runnable, Runnable runnable2, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f33257c = new k9((org.telegram.ui.ActionBar.c6) null);
        this.f33255a = c6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f33256b = frameLayout;
        frameLayout.setDuplicateParentStateEnabled(true);
        frameLayout.setPivotX(0.0f);
        frameLayout.setPivotY(0.0f);
        addView(frameLayout, w7.z5.d(-1.0f, -1));
        int i10 = org.telegram.ui.ActionBar.g6.f19543a7;
        frameLayout.setBackground(org.telegram.ui.ActionBar.g6.a0(org.telegram.ui.ActionBar.g6.w0(i10, c6Var), org.telegram.ui.ActionBar.g6.v(org.telegram.ui.ActionBar.g6.w0(i10, c6Var), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19690i6, c6Var)), AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f)));
        w7.b6.b(this, 0.02f, 1.2f);
        z9 z9Var = new z9(context);
        this.d = z9Var;
        z9Var.setRoundRadius(AndroidUtilities.dp(18.0f));
        frameLayout.addView(z9Var, w7.z5.a(34.0f, 15.0f, 0.0f, 0.0f, 0.0f, 34, 19));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, w7.z5.a(-2.0f, 60.0f, 7.0f, 52.0f, 0.0f, -1, 51));
        m7 m7Var = new m7(this, context);
        this.f33258f = m7Var;
        frameLayout.addView(m7Var, w7.z5.a(-2.0f, 60.0f, 26.0f, 52.0f, 0.0f, -1, 51));
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        imageView.setImageResource(R.drawable.msg2_help);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.D6, c6Var), PorterDuff.Mode.SRC_IN));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleX(0.9f);
        imageView.setScaleY(0.9f);
        frameLayout.addView(imageView, w7.z5.a(24.0f, 0.0f, 0.0f, 14.0f, 0.0f, 24, 21));
        setOnClickListener(new e7(this, runnable, c6Var, runnable2));
    }

    public final void a(String str, TLRPC.User user) {
        long j10;
        boolean z10;
        TLRPC.User user2 = this.f33259n;
        long j11 = 0;
        if (user2 == null) {
            j10 = 0;
        } else {
            j10 = user2.f19063id;
        }
        if (user != null) {
            j11 = user.f19063id;
        }
        if (j10 != j11) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f33259n = user;
        this.f33260r = str;
        setClickable(!TextUtils.isEmpty(str));
        TLRPC.User user3 = this.f33259n;
        TextView textView = this.e;
        z9 z9Var = this.d;
        ImageView imageView = this.h;
        m7 m7Var = this.f33258f;
        if (user3 != null) {
            setClickable(true);
            setVisibility(0);
            TLRPC.User user4 = this.f33259n;
            k9 k9Var = this.f33257c;
            k9Var.r(user4);
            z9Var.e(this.f33259n, k9Var);
            textView.setText(UserObject.getUserName(this.f33259n));
            if (!TextUtils.isEmpty(str)) {
                m7Var.c(str, z10);
                imageView.setVisibility(0);
                return;
            }
            m7Var.c(null, z10);
            imageView.setVisibility(8);
        } else if (!TextUtils.isEmpty(str)) {
            setClickable(false);
            setVisibility(0);
            z9Var.setImageDrawable(new cr(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(34.0f), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Oh, this.f33255a)), getContext().getResources().getDrawable(R.drawable.menu_gram_24).mutate()));
            textView.setText(LocaleController.getString(R.string.WalletGramWalletAddress));
            m7Var.c(str, z10);
            imageView.setVisibility(8);
        } else {
            setClickable(false);
            setVisibility(8);
            m7Var.c(null, true);
        }
    }

    public float getContentBottom() {
        FrameLayout frameLayout = this.f33256b;
        return (frameLayout.getScaleY() * (frameLayout.getHeight() - frameLayout.getPivotY())) + frameLayout.getPivotY() + frameLayout.getY();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        FrameLayout frameLayout = this.f33256b;
        int round = Math.round((getMeasuredHeight() - (frameLayout.getScaleY() * frameLayout.getMeasuredHeight())) / 2.0f);
        frameLayout.layout(0, round, frameLayout.getMeasuredWidth(), frameLayout.getMeasuredHeight() + round);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        m7 m7Var = this.f33258f;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) m7Var.getLayoutParams();
        int ceil = ((int) Math.ceil(m7Var.a())) + 1 + layoutParams.leftMargin + layoutParams.rightMargin;
        setMeasuredDimension(View.resolveSize(Math.max(getMeasuredWidth(), ceil), i10), getMeasuredHeight());
        int max = Math.max(getMeasuredWidth(), ceil);
        float measuredWidth = getMeasuredWidth() / max;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        FrameLayout frameLayout = this.f33256b;
        frameLayout.measure(makeMeasureSpec, makeMeasureSpec2);
        frameLayout.setScaleX(measuredWidth);
        frameLayout.setScaleY(measuredWidth);
    }
}
