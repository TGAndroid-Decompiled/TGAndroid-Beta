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
import org.telegram.messenger.ok;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.sq;
import org.telegram.ui.oa1;
import org.telegram.ui.sa1;
public abstract class c8 extends FrameLayout {
    public final a8 f21878a;
    public final b8 f21879b;
    public final TextView f21880c;
    public final TextView d;
    public final TextView f21881e;
    public final TextView f21882f;
    public final Paint h;
    public final org.telegram.ui.Components.h9 f21883n;
    public final ai.ca f21884r;
    public final org.telegram.ui.ActionBar.d6 f21885s;
    public sa1 v;
    public final TLRPC.ChatFull f21886w;
    public boolean f21887x;

    public c8(Context context, TLRPC.ChatFull chatFull, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        int i10;
        float f7;
        float f10;
        int i11;
        float f11;
        float f12;
        this.h = new Paint(1);
        this.f21883n = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        this.f21884r = new ai.ca(null, false);
        this.f21886w = chatFull;
        this.f21885s = d6Var;
        a8 a8Var = new a8(this, context, d6Var);
        this.f21878a = a8Var;
        setClipChildren(false);
        boolean z10 = LocaleController.isRTL;
        if (!z10) {
            i10 = 8388611;
        } else {
            i10 = 8388613;
        }
        int i12 = i10 | 16;
        if (!z10) {
            f7 = 12.0f;
        } else {
            f7 = 16.0f;
        }
        if (!z10) {
            f10 = 16.0f;
        } else {
            f10 = 12.0f;
        }
        addView(a8Var, w7.z5.d(46, 46.0f, i12, f7, 0.0f, f10, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout f13 = ok.f(context, 0);
        ?? i5Var = new org.telegram.ui.ActionBar.i5(context);
        this.f21879b = i5Var;
        NotificationCenter.listenEmojiLoading(i5Var);
        i5Var.setTypeface(AndroidUtilities.bold());
        i5Var.setTextSize(16);
        i5Var.setMaxLines(1);
        i5Var.setTextColor(-16777216);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        i5Var.setGravity(i11);
        TextView textView = new TextView(context);
        this.f21880c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-16777216);
        if (!LocaleController.isRTL) {
            f13.addView((View) i5Var, w7.z5.p(0, -2, 1.0f, 0, 0, 0, 16, 0));
            f13.addView(textView, w7.z5.q(-2, -2, 80));
        } else {
            f13.addView(textView, w7.z5.q(-2, -2, 80));
            f13.addView((View) i5Var, w7.z5.p(0, -2, 1.0f, 0, 16, 0, 0, 0));
        }
        linearLayout.addView(f13, w7.z5.d(-1, -2.0f, 8388659, 0.0f, 7.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f21881e = textView2;
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
        this.f21882f = textView4;
        textView4.setTextSize(1, 13.0f);
        textView4.setTextColor(-16777216);
        textView4.setGravity(16);
        LinearLayout f14 = ok.f(context, 0);
        if (!LocaleController.isRTL) {
            f14.addView(textView2, w7.z5.p(0, -2, 1.0f, 0, 0, 0, 8, 0));
            f14.addView(textView4, w7.z5.q(-2, -2, 16));
            f14.addView(textView3, w7.z5.t(-2, -2, 16, 10, 0, 0, 0));
        } else {
            f14.addView(textView3, w7.z5.t(-2, -2, 16, 0, 0, 10, 0));
            f14.addView(textView4, w7.z5.q(-2, -2, 16));
            f14.addView(textView2, w7.z5.p(0, -2, 1.0f, 0, 8, 0, 0, 0));
        }
        linearLayout.addView(f14, w7.z5.d(-1, -2.0f, 8388659, 0.0f, 3.0f, 0.0f, 9.0f));
        boolean z11 = LocaleController.isRTL;
        if (!z11) {
            f11 = 72.0f;
        } else {
            f11 = 18.0f;
        }
        if (!z11) {
            f12 = 18.0f;
        } else {
            f12 = 72.0f;
        }
        addView(linearLayout, w7.z5.d(-1, -2.0f, 0, f11, 0.0f, f12, 0.0f));
        int i13 = org.telegram.ui.ActionBar.i6.f20926j5;
        i5Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i13, false));
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i13, false));
        int i14 = org.telegram.ui.ActionBar.i6.A6;
        textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i14, false));
        textView3.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i14, false));
        textView4.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i14, false));
        Drawable mutate = context.getDrawable(R.drawable.mini_stats_likes).mutate();
        mutate.setTint(org.telegram.ui.ActionBar.i6.w0(null, i14, false));
        Drawable mutate2 = context.getDrawable(R.drawable.mini_stats_shares).mutate();
        mutate2.setTint(org.telegram.ui.ActionBar.i6.w0(null, i14, false));
        sq sqVar = new sq(null, mutate, 0, AndroidUtilities.dp(1.0f));
        int intrinsicWidth = mutate2.getIntrinsicWidth();
        int intrinsicHeight = mutate2.getIntrinsicHeight();
        sqVar.h = intrinsicWidth;
        sqVar.f30854n = intrinsicHeight;
        textView4.setCompoundDrawablesWithIntrinsicBounds(sqVar, (Drawable) null, (Drawable) null, (Drawable) null);
        textView4.setCompoundDrawablePadding(AndroidUtilities.dp(2.0f));
        sq sqVar2 = new sq(null, mutate2, 0, AndroidUtilities.dp(1.0f));
        int intrinsicWidth2 = mutate2.getIntrinsicWidth();
        int intrinsicHeight2 = mutate2.getIntrinsicHeight();
        sqVar2.h = intrinsicWidth2;
        sqVar2.f30854n = intrinsicHeight2;
        textView3.setCompoundDrawablesWithIntrinsicBounds(sqVar2, (Drawable) null, (Drawable) null, (Drawable) null);
        textView3.setCompoundDrawablePadding(AndroidUtilities.dp(2.0f));
        setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f21887x) {
            int v02 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20819d7, this.f21885s);
            Paint paint = this.h;
            paint.setColor(v02);
            if (LocaleController.isRTL) {
                canvas.drawRect(0.0f, getHeight() - 1, getWidth() - AndroidUtilities.dp(72), getHeight(), paint);
            } else {
                canvas.drawRect(AndroidUtilities.dp(72), getHeight() - 1, getWidth(), getHeight(), paint);
            }
        }
    }

    public org.telegram.ui.Components.w9 getImageView() {
        return this.f21878a;
    }

    public sa1 getPostInfo() {
        return this.v;
    }

    public ai.ca getStoryAvatarParams() {
        return this.f21884r;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f21884r.g();
    }

    public void setData(oa1 oa1Var) {
        TLRPC.User user = oa1Var.f39151a;
        org.telegram.ui.Components.h9 h9Var = this.f21883n;
        h9Var.r(user);
        TLRPC.User user2 = oa1Var.f39151a;
        a8 a8Var = this.f21878a;
        a8Var.e(user2, h9Var);
        a8Var.setRoundRadius(AndroidUtilities.dp(46.0f) >> 1);
        this.f21879b.k(oa1Var.f39151a.first_name);
        this.f21881e.setText(oa1Var.f39152b);
        this.f21880c.setVisibility(8);
        this.d.setVisibility(8);
        this.f21882f.setVisibility(8);
    }

    public void setImageViewAction(View.OnClickListener onClickListener) {
        this.f21878a.setOnClickListener(onClickListener);
    }
}
