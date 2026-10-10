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
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.y9;
public final class o7 extends FrameLayout {
    public final org.telegram.ui.ActionBar.e6 f35395a;
    public final FrameLayout f35396b;
    public final j9 f35397c;
    public final y9 d;
    public final TextView f35398e;
    public final n7 f35399f;
    public final ImageView h;
    public TLRPC.User f35400n;
    public String f35401r;

    public o7(Context context, Runnable runnable, Runnable runnable2, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f35397c = new j9((org.telegram.ui.ActionBar.e6) null);
        this.f35395a = e6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f35396b = frameLayout;
        frameLayout.setDuplicateParentStateEnabled(true);
        frameLayout.setPivotX(0.0f);
        frameLayout.setPivotY(0.0f);
        addView(frameLayout, w7.x5.d(-1.0f, -1));
        int i10 = org.telegram.ui.ActionBar.i6.f20745a7;
        frameLayout.setBackground(org.telegram.ui.ActionBar.i6.a0(org.telegram.ui.ActionBar.i6.w0(i10, e6Var), org.telegram.ui.ActionBar.i6.v(org.telegram.ui.ActionBar.i6.w0(i10, e6Var), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20892i6, e6Var)), AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f)));
        w7.z5.b(this, 0.02f, 1.2f);
        y9 y9Var = new y9(context);
        this.d = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(18.0f));
        frameLayout.addView(y9Var, w7.x5.a(34.0f, 15.0f, 0.0f, 0.0f, 0.0f, 34, 19));
        TextView textView = new TextView(context);
        this.f35398e = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, e6Var));
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, w7.x5.a(-2.0f, 60.0f, 7.0f, 52.0f, 0.0f, -1, 51));
        n7 n7Var = new n7(this, context);
        this.f35399f = n7Var;
        frameLayout.addView(n7Var, w7.x5.a(-2.0f, 60.0f, 26.0f, 52.0f, 0.0f, -1, 51));
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        imageView.setImageResource(R.drawable.msg2_help);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.D6, e6Var), PorterDuff.Mode.SRC_IN));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleX(0.9f);
        imageView.setScaleY(0.9f);
        frameLayout.addView(imageView, w7.x5.a(24.0f, 0.0f, 0.0f, 14.0f, 0.0f, 24, 21));
        setOnClickListener(new f7(this, runnable, e6Var, runnable2));
    }

    public final void a(String str, TLRPC.User user) {
        long j3;
        boolean z10;
        TLRPC.User user2 = this.f35400n;
        long j10 = 0;
        if (user2 == null) {
            j3 = 0;
        } else {
            j3 = user2.f20189id;
        }
        if (user != null) {
            j10 = user.f20189id;
        }
        if (j3 != j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f35400n = user;
        this.f35401r = str;
        setClickable(!TextUtils.isEmpty(str));
        TLRPC.User user3 = this.f35400n;
        TextView textView = this.f35398e;
        y9 y9Var = this.d;
        ImageView imageView = this.h;
        n7 n7Var = this.f35399f;
        if (user3 != null) {
            setClickable(true);
            setVisibility(0);
            TLRPC.User user4 = this.f35400n;
            j9 j9Var = this.f35397c;
            j9Var.r(user4);
            y9Var.e(this.f35400n, j9Var);
            textView.setText(UserObject.getUserName(this.f35400n));
            if (!TextUtils.isEmpty(str)) {
                n7Var.c(str, z10);
                imageView.setVisibility(0);
                return;
            }
            n7Var.c(null, z10);
            imageView.setVisibility(8);
        } else if (!TextUtils.isEmpty(str)) {
            setClickable(false);
            setVisibility(0);
            y9Var.setImageDrawable(new fr(org.telegram.ui.ActionBar.i6.K(AndroidUtilities.dp(34.0f), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Oh, this.f35395a)), getContext().getResources().getDrawable(R.drawable.menu_gram_24).mutate()));
            textView.setText(LocaleController.getString(R.string.WalletGramWalletAddress));
            n7Var.c(str, z10);
            imageView.setVisibility(8);
        } else {
            setClickable(false);
            setVisibility(8);
            n7Var.c(null, true);
        }
    }

    public float getContentBottom() {
        FrameLayout frameLayout = this.f35396b;
        return (frameLayout.getScaleY() * (frameLayout.getHeight() - frameLayout.getPivotY())) + frameLayout.getPivotY() + frameLayout.getY();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        FrameLayout frameLayout = this.f35396b;
        int round = Math.round((getMeasuredHeight() - (frameLayout.getScaleY() * frameLayout.getMeasuredHeight())) / 2.0f);
        frameLayout.layout(0, round, frameLayout.getMeasuredWidth(), frameLayout.getMeasuredHeight() + round);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        n7 n7Var = this.f35399f;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) n7Var.getLayoutParams();
        int ceil = ((int) Math.ceil(n7Var.a())) + 1 + layoutParams.leftMargin + layoutParams.rightMargin;
        setMeasuredDimension(View.resolveSize(Math.max(getMeasuredWidth(), ceil), i10), getMeasuredHeight());
        int max = Math.max(getMeasuredWidth(), ceil);
        float measuredWidth = getMeasuredWidth() / max;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        FrameLayout frameLayout = this.f35396b;
        frameLayout.measure(makeMeasureSpec, makeMeasureSpec2);
        frameLayout.setScaleX(measuredWidth);
        frameLayout.setScaleY(measuredWidth);
    }
}
