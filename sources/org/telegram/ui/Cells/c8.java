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
import org.telegram.ui.Components.rq;
import org.telegram.ui.la1;
import org.telegram.ui.pa1;
public abstract class c8 extends FrameLayout {
    public final a8 f20097a;
    public final b8 f20098b;
    public final TextView f20099c;
    public final TextView d;
    public final TextView e;
    public final TextView f20100f;
    public final Paint h;
    public final org.telegram.ui.Components.h9 f20101n;
    public final ai.ca f20102r;
    public final org.telegram.ui.ActionBar.d6 f20103s;
    public pa1 v;
    public final TLRPC.ChatFull f20104w;
    public boolean f20105x;

    public c8(Context context, TLRPC.ChatFull chatFull, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        int i10;
        float f7;
        float f10;
        int i11;
        float f11;
        float f12;
        this.h = new Paint(1);
        this.f20101n = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        this.f20102r = new ai.ca(null, false);
        this.f20104w = chatFull;
        this.f20103s = d6Var;
        a8 a8Var = new a8(this, context, d6Var);
        this.f20097a = a8Var;
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
        addView(a8Var, w7.y5.d(46, 46.0f, i12, f7, 0.0f, f10, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout f13 = ok.f(context, 0);
        ?? h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f20098b = h5Var;
        NotificationCenter.listenEmojiLoading(h5Var);
        h5Var.setTypeface(AndroidUtilities.bold());
        h5Var.setTextSize(16);
        h5Var.setMaxLines(1);
        h5Var.setTextColor(-16777216);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        h5Var.setGravity(i11);
        TextView textView = new TextView(context);
        this.f20099c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-16777216);
        if (!LocaleController.isRTL) {
            f13.addView((View) h5Var, w7.y5.p(0, -2, 1.0f, 0, 0, 0, 16, 0));
            f13.addView(textView, w7.y5.q(-2, -2, 80));
        } else {
            f13.addView(textView, w7.y5.q(-2, -2, 80));
            f13.addView((View) h5Var, w7.y5.p(0, -2, 1.0f, 0, 16, 0, 0, 0));
        }
        linearLayout.addView(f13, w7.y5.d(-1, -2.0f, 8388659, 0.0f, 7.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.e = textView2;
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
        this.f20100f = textView4;
        textView4.setTextSize(1, 13.0f);
        textView4.setTextColor(-16777216);
        textView4.setGravity(16);
        LinearLayout f14 = ok.f(context, 0);
        if (!LocaleController.isRTL) {
            f14.addView(textView2, w7.y5.p(0, -2, 1.0f, 0, 0, 0, 8, 0));
            f14.addView(textView4, w7.y5.q(-2, -2, 16));
            f14.addView(textView3, w7.y5.t(-2, -2, 16, 10, 0, 0, 0));
        } else {
            f14.addView(textView3, w7.y5.t(-2, -2, 16, 0, 0, 10, 0));
            f14.addView(textView4, w7.y5.q(-2, -2, 16));
            f14.addView(textView2, w7.y5.p(0, -2, 1.0f, 0, 8, 0, 0, 0));
        }
        linearLayout.addView(f14, w7.y5.d(-1, -2.0f, 8388659, 0.0f, 3.0f, 0.0f, 9.0f));
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
        addView(linearLayout, w7.y5.d(-1, -2.0f, 0, f11, 0.0f, f12, 0.0f));
        int i13 = org.telegram.ui.ActionBar.h6.f19165j5;
        h5Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i13, false));
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i13, false));
        int i14 = org.telegram.ui.ActionBar.h6.A6;
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i14, false));
        textView3.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i14, false));
        textView4.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i14, false));
        Drawable mutate = context.getDrawable(R.drawable.mini_stats_likes).mutate();
        mutate.setTint(org.telegram.ui.ActionBar.h6.w0(null, i14, false));
        Drawable mutate2 = context.getDrawable(R.drawable.mini_stats_shares).mutate();
        mutate2.setTint(org.telegram.ui.ActionBar.h6.w0(null, i14, false));
        rq rqVar = new rq(null, mutate, 0, AndroidUtilities.dp(1.0f));
        int intrinsicWidth = mutate2.getIntrinsicWidth();
        int intrinsicHeight = mutate2.getIntrinsicHeight();
        rqVar.h = intrinsicWidth;
        rqVar.f28032n = intrinsicHeight;
        textView4.setCompoundDrawablesWithIntrinsicBounds(rqVar, (Drawable) null, (Drawable) null, (Drawable) null);
        textView4.setCompoundDrawablePadding(AndroidUtilities.dp(2.0f));
        rq rqVar2 = new rq(null, mutate2, 0, AndroidUtilities.dp(1.0f));
        int intrinsicWidth2 = mutate2.getIntrinsicWidth();
        int intrinsicHeight2 = mutate2.getIntrinsicHeight();
        rqVar2.h = intrinsicWidth2;
        rqVar2.f28032n = intrinsicHeight2;
        textView3.setCompoundDrawablesWithIntrinsicBounds(rqVar2, (Drawable) null, (Drawable) null, (Drawable) null);
        textView3.setCompoundDrawablePadding(AndroidUtilities.dp(2.0f));
        setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f20105x) {
            int v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19060d7, this.f20103s);
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
        return this.f20097a;
    }

    public pa1 getPostInfo() {
        return this.v;
    }

    public ai.ca getStoryAvatarParams() {
        return this.f20102r;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f20102r.g();
    }

    public void setData(la1 la1Var) {
        TLRPC.User user = la1Var.f35286a;
        org.telegram.ui.Components.h9 h9Var = this.f20101n;
        h9Var.r(user);
        TLRPC.User user2 = la1Var.f35286a;
        a8 a8Var = this.f20097a;
        a8Var.e(user2, h9Var);
        a8Var.setRoundRadius(AndroidUtilities.dp(46.0f) >> 1);
        this.f20098b.k(la1Var.f35286a.first_name);
        this.e.setText(la1Var.f35287b);
        this.f20099c.setVisibility(8);
        this.d.setVisibility(8);
        this.f20100f.setVisibility(8);
    }

    public void setImageViewAction(View.OnClickListener onClickListener) {
        this.f20097a.setOnClickListener(onClickListener);
    }
}
