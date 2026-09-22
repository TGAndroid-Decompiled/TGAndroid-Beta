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
import org.telegram.messenger.rk;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.pq;
import org.telegram.ui.ua1;
import org.telegram.ui.ya1;
public abstract class d8 extends FrameLayout {
    public final b8 f20146a;
    public final c8 f20147b;
    public final TextView f20148c;
    public final TextView d;
    public final TextView e;
    public final TextView f20149f;
    public final Paint h;
    public final org.telegram.ui.Components.g9 f20150n;
    public final ai.ca f20151r;
    public final org.telegram.ui.ActionBar.f6 f20152s;
    public ya1 v;
    public final TLRPC.ChatFull f20153w;
    public boolean f20154x;

    public d8(Context context, TLRPC.ChatFull chatFull, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        int i10;
        float f7;
        float f10;
        int i11;
        float f11;
        float f12;
        this.h = new Paint(1);
        this.f20150n = new org.telegram.ui.Components.g9((org.telegram.ui.ActionBar.f6) null);
        this.f20151r = new ai.ca(null, false);
        this.f20153w = chatFull;
        this.f20152s = f6Var;
        b8 b8Var = new b8(this, context, f6Var);
        this.f20146a = b8Var;
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
        addView(b8Var, w7.y5.d(46, 46.0f, i12, f7, 0.0f, f10, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout f13 = rk.f(context, 0);
        ?? j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.f20147b = j5Var;
        NotificationCenter.listenEmojiLoading(j5Var);
        j5Var.setTypeface(AndroidUtilities.bold());
        j5Var.setTextSize(16);
        j5Var.setMaxLines(1);
        j5Var.setTextColor(-16777216);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        j5Var.setGravity(i11);
        TextView textView = new TextView(context);
        this.f20148c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-16777216);
        if (!LocaleController.isRTL) {
            f13.addView((View) j5Var, w7.y5.p(0, -2, 1.0f, 0, 0, 0, 16, 0));
            f13.addView(textView, w7.y5.q(-2, -2, 80));
        } else {
            f13.addView(textView, w7.y5.q(-2, -2, 80));
            f13.addView((View) j5Var, w7.y5.p(0, -2, 1.0f, 0, 16, 0, 0, 0));
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
        this.f20149f = textView4;
        textView4.setTextSize(1, 13.0f);
        textView4.setTextColor(-16777216);
        textView4.setGravity(16);
        LinearLayout f14 = rk.f(context, 0);
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
        int i13 = org.telegram.ui.ActionBar.j6.f19216j5;
        j5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        int i14 = org.telegram.ui.ActionBar.j6.A6;
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
        textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
        textView4.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
        Drawable mutate = context.getDrawable(R.drawable.mini_stats_likes).mutate();
        mutate.setTint(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
        Drawable mutate2 = context.getDrawable(R.drawable.mini_stats_shares).mutate();
        mutate2.setTint(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
        pq pqVar = new pq(null, mutate, 0, AndroidUtilities.dp(1.0f));
        int intrinsicWidth = mutate2.getIntrinsicWidth();
        int intrinsicHeight = mutate2.getIntrinsicHeight();
        pqVar.h = intrinsicWidth;
        pqVar.f27401n = intrinsicHeight;
        textView4.setCompoundDrawablesWithIntrinsicBounds(pqVar, (Drawable) null, (Drawable) null, (Drawable) null);
        textView4.setCompoundDrawablePadding(AndroidUtilities.dp(2.0f));
        pq pqVar2 = new pq(null, mutate2, 0, AndroidUtilities.dp(1.0f));
        int intrinsicWidth2 = mutate2.getIntrinsicWidth();
        int intrinsicHeight2 = mutate2.getIntrinsicHeight();
        pqVar2.h = intrinsicWidth2;
        pqVar2.f27401n = intrinsicHeight2;
        textView3.setCompoundDrawablesWithIntrinsicBounds(pqVar2, (Drawable) null, (Drawable) null, (Drawable) null);
        textView3.setCompoundDrawablePadding(AndroidUtilities.dp(2.0f));
        setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f20154x) {
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19110d7, this.f20152s);
            Paint paint = this.h;
            paint.setColor(v02);
            if (LocaleController.isRTL) {
                canvas.drawRect(0.0f, getHeight() - 1, getWidth() - AndroidUtilities.dp(72), getHeight(), paint);
            } else {
                canvas.drawRect(AndroidUtilities.dp(72), getHeight() - 1, getWidth(), getHeight(), paint);
            }
        }
    }

    public org.telegram.ui.Components.v9 getImageView() {
        return this.f20146a;
    }

    public ya1 getPostInfo() {
        return this.v;
    }

    public ai.ca getStoryAvatarParams() {
        return this.f20151r;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f20151r.g();
    }

    public void setData(ua1 ua1Var) {
        TLRPC.User user = ua1Var.f38044a;
        org.telegram.ui.Components.g9 g9Var = this.f20150n;
        g9Var.r(user);
        TLRPC.User user2 = ua1Var.f38044a;
        b8 b8Var = this.f20146a;
        b8Var.e(user2, g9Var);
        b8Var.setRoundRadius(AndroidUtilities.dp(46.0f) >> 1);
        this.f20147b.k(ua1Var.f38044a.first_name);
        this.e.setText(ua1Var.f38045b);
        this.f20148c.setVisibility(8);
        this.d.setVisibility(8);
        this.f20149f.setVisibility(8);
    }

    public void setImageViewAction(View.OnClickListener onClickListener) {
        this.f20146a.setOnClickListener(onClickListener);
    }
}
