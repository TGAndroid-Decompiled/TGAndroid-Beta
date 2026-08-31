package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.pq;
import org.telegram.ui.aa1;
import org.telegram.ui.ea1;
public abstract class a8 extends FrameLayout {
    public final y7 f22548a;
    public final z7 f22549b;
    public final TextView f22550c;
    public final TextView d;
    public final TextView f22551e;
    public final TextView f22552f;
    public final Paint h;
    public final org.telegram.ui.Components.z8 f22553n;
    public final oh.i7 f22554r;
    public final org.telegram.ui.ActionBar.g6 f22555s;
    public ea1 v;
    public final TLRPC.ChatFull f22556w;
    public boolean f22557x;

    public a8(Context context, TLRPC.ChatFull chatFull, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        int i10;
        float f10;
        float f11;
        int i11;
        float f12;
        float f13;
        this.h = new Paint(1);
        this.f22553n = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.g6) null);
        this.f22554r = new oh.i7(null, false);
        this.f22556w = chatFull;
        this.f22555s = g6Var;
        y7 y7Var = new y7(this, context, g6Var);
        this.f22548a = y7Var;
        setClipChildren(false);
        boolean z4 = LocaleController.isRTL;
        if (!z4) {
            i10 = 8388611;
        } else {
            i10 = 8388613;
        }
        int i12 = i10 | 16;
        if (!z4) {
            f10 = 12.0f;
        } else {
            f10 = 16.0f;
        }
        if (!z4) {
            f11 = 16.0f;
        } else {
            f11 = 12.0f;
        }
        addView(y7Var, k7.c6.d(46, 46.0f, i12, f10, 0.0f, f11, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout f14 = org.telegram.messenger.y3.f(context, 0);
        ?? l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.f22549b = l5Var;
        NotificationCenter.listenEmojiLoading(l5Var);
        l5Var.setTypeface(AndroidUtilities.bold());
        l5Var.setTextSize(16);
        l5Var.setMaxLines(1);
        l5Var.setTextColor(-16777216);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        l5Var.setGravity(i11);
        TextView textView = new TextView(context);
        this.f22550c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-16777216);
        if (!LocaleController.isRTL) {
            f14.addView((View) l5Var, k7.c6.p(0, -2, 1.0f, 0, 0, 0, 16, 0));
            f14.addView(textView, k7.c6.q(-2, -2, 80));
        } else {
            f14.addView(textView, k7.c6.q(-2, -2, 80));
            f14.addView((View) l5Var, k7.c6.p(0, -2, 1.0f, 0, 16, 0, 0, 0));
        }
        linearLayout.addView(f14, k7.c6.d(-1, -2.0f, 8388659, 0.0f, 7.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f22551e = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setTextColor(-16777216);
        textView2.setLines(1);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        TextView textView3 = new TextView(context);
        this.d = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(-16777216);
        textView3.setGravity(16);
        TextView textView4 = new TextView(context);
        this.f22552f = textView4;
        textView4.setTextSize(1, 13.0f);
        textView4.setTextColor(-16777216);
        textView4.setGravity(16);
        LinearLayout f15 = org.telegram.messenger.y3.f(context, 0);
        if (!LocaleController.isRTL) {
            f15.addView(textView2, k7.c6.p(0, -2, 1.0f, 0, 0, 0, 8, 0));
            f15.addView(textView4, k7.c6.q(-2, -2, 16));
            f15.addView(textView3, k7.c6.t(-2, -2, 16, 10, 0, 0, 0));
        } else {
            f15.addView(textView3, k7.c6.t(-2, -2, 16, 0, 0, 10, 0));
            f15.addView(textView4, k7.c6.q(-2, -2, 16));
            f15.addView(textView2, k7.c6.p(0, -2, 1.0f, 0, 8, 0, 0, 0));
        }
        linearLayout.addView(f15, k7.c6.d(-1, -2.0f, 8388659, 0.0f, 3.0f, 0.0f, 9.0f));
        boolean z10 = LocaleController.isRTL;
        if (!z10) {
            f12 = 72.0f;
        } else {
            f12 = 18.0f;
        }
        if (!z10) {
            f13 = 18.0f;
        } else {
            f13 = 72.0f;
        }
        addView(linearLayout, k7.c6.d(-1, -2.0f, 0, f12, 0.0f, f13, 0.0f));
        int i13 = org.telegram.ui.ActionBar.k6.f21766j5;
        l5Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i13, false));
        textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i13, false));
        int i14 = org.telegram.ui.ActionBar.k6.A6;
        textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i14, false));
        textView3.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i14, false));
        textView4.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i14, false));
        Drawable mutate = context.getDrawable(R.drawable.mini_stats_likes).mutate();
        mutate.setTint(org.telegram.ui.ActionBar.k6.w0(null, i14, false));
        Drawable mutate2 = context.getDrawable(R.drawable.mini_stats_shares).mutate();
        mutate2.setTint(org.telegram.ui.ActionBar.k6.w0(null, i14, false));
        pq pqVar = new pq(null, mutate, 0, AndroidUtilities.dp(1.0f));
        int intrinsicWidth = mutate2.getIntrinsicWidth();
        int intrinsicHeight = mutate2.getIntrinsicHeight();
        pqVar.h = intrinsicWidth;
        pqVar.f30170n = intrinsicHeight;
        textView4.setCompoundDrawablesWithIntrinsicBounds(pqVar, (Drawable) null, (Drawable) null, (Drawable) null);
        textView4.setCompoundDrawablePadding(AndroidUtilities.dp(2.0f));
        pq pqVar2 = new pq(null, mutate2, 0, AndroidUtilities.dp(1.0f));
        int intrinsicWidth2 = mutate2.getIntrinsicWidth();
        int intrinsicHeight2 = mutate2.getIntrinsicHeight();
        pqVar2.h = intrinsicWidth2;
        pqVar2.f30170n = intrinsicHeight2;
        textView3.setCompoundDrawablesWithIntrinsicBounds(pqVar2, (Drawable) null, (Drawable) null, (Drawable) null);
        textView3.setCompoundDrawablePadding(AndroidUtilities.dp(2.0f));
        setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f22557x) {
            int v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21660d7, this.f22555s);
            Paint paint = this.h;
            paint.setColor(v02);
            if (LocaleController.isRTL) {
                canvas.drawRect(0.0f, getHeight() - 1, getWidth() - AndroidUtilities.dp(72), getHeight(), paint);
            } else {
                canvas.drawRect(AndroidUtilities.dp(72), getHeight() - 1, getWidth(), getHeight(), paint);
            }
        }
    }

    public org.telegram.ui.Components.p9 getImageView() {
        return this.f22548a;
    }

    public ea1 getPostInfo() {
        return this.v;
    }

    public oh.i7 getStoryAvatarParams() {
        return this.f22554r;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f22554r.g();
    }

    public void setData(aa1 aa1Var) {
        TLRPC.User user = aa1Var.f35107a;
        org.telegram.ui.Components.z8 z8Var = this.f22553n;
        z8Var.r(user);
        TLRPC.User user2 = aa1Var.f35107a;
        y7 y7Var = this.f22548a;
        y7Var.e(user2, z8Var);
        y7Var.setRoundRadius(AndroidUtilities.dp(46.0f) >> 1);
        this.f22549b.k(aa1Var.f35107a.first_name);
        this.f22551e.setText(aa1Var.f35108b);
        this.f22550c.setVisibility(8);
        this.d.setVisibility(8);
        this.f22552f.setVisibility(8);
    }

    public void setImageViewAction(View.OnClickListener onClickListener) {
        this.f22548a.setOnClickListener(onClickListener);
    }
}
