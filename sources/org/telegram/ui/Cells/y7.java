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
import org.telegram.ui.Components.jq;
import org.telegram.ui.m91;
import org.telegram.ui.q91;
public abstract class y7 extends FrameLayout {
    public final w7 f26001a;
    public final x7 f26002b;
    public final TextView f26003c;
    public final TextView d;
    public final TextView f26004e;
    public final TextView f26005f;
    public final Paint h;
    public final org.telegram.ui.Components.e9 f26006n;
    public final lh.h7 f26007r;
    public final org.telegram.ui.ActionBar.c6 f26008s;
    public q91 v;
    public final TLRPC.ChatFull f26009w;
    public boolean f26010x;

    public y7(Context context, TLRPC.ChatFull chatFull, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        int i10;
        float f9;
        float f10;
        int i11;
        float f11;
        float f12;
        this.h = new Paint(1);
        this.f26006n = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
        this.f26007r = new lh.h7(null, false);
        this.f26009w = chatFull;
        this.f26008s = c6Var;
        w7 w7Var = new w7(this, context, c6Var);
        this.f26001a = w7Var;
        setClipChildren(false);
        boolean z10 = LocaleController.isRTL;
        if (!z10) {
            i10 = 8388611;
        } else {
            i10 = 8388613;
        }
        int i12 = i10 | 16;
        if (!z10) {
            f9 = 12.0f;
        } else {
            f9 = 16.0f;
        }
        if (!z10) {
            f10 = 16.0f;
        } else {
            f10 = 12.0f;
        }
        addView(w7Var, i7.f6.d(46, 46.0f, i12, f9, 0.0f, f10, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout g10 = org.telegram.messenger.x3.g(context, 0);
        ?? h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f26002b = h5Var;
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
        this.f26003c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-16777216);
        if (!LocaleController.isRTL) {
            g10.addView((View) h5Var, i7.f6.p(0, -2, 1.0f, 0, 0, 0, 16, 0));
            g10.addView(textView, i7.f6.q(-2, -2, 80));
        } else {
            g10.addView(textView, i7.f6.q(-2, -2, 80));
            g10.addView((View) h5Var, i7.f6.p(0, -2, 1.0f, 0, 16, 0, 0, 0));
        }
        linearLayout.addView(g10, i7.f6.d(-1, -2.0f, 8388659, 0.0f, 7.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f26004e = textView2;
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
        this.f26005f = textView4;
        textView4.setTextSize(1, 13.0f);
        textView4.setTextColor(-16777216);
        textView4.setGravity(16);
        LinearLayout g11 = org.telegram.messenger.x3.g(context, 0);
        if (!LocaleController.isRTL) {
            g11.addView(textView2, i7.f6.p(0, -2, 1.0f, 0, 0, 0, 8, 0));
            g11.addView(textView4, i7.f6.q(-2, -2, 16));
            g11.addView(textView3, i7.f6.t(-2, -2, 16, 10, 0, 0, 0));
        } else {
            g11.addView(textView3, i7.f6.t(-2, -2, 16, 0, 0, 10, 0));
            g11.addView(textView4, i7.f6.q(-2, -2, 16));
            g11.addView(textView2, i7.f6.p(0, -2, 1.0f, 0, 8, 0, 0, 0));
        }
        linearLayout.addView(g11, i7.f6.d(-1, -2.0f, 8388659, 0.0f, 3.0f, 0.0f, 9.0f));
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
        addView(linearLayout, i7.f6.d(-1, -2.0f, 0, f11, 0.0f, f12, 0.0f));
        int i13 = org.telegram.ui.ActionBar.g6.f23169j5;
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
        int i14 = org.telegram.ui.ActionBar.g6.A6;
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i14, false));
        textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i14, false));
        textView4.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i14, false));
        Drawable mutate = context.getDrawable(R.drawable.mini_stats_likes).mutate();
        mutate.setTint(org.telegram.ui.ActionBar.g6.w0(null, i14, false));
        Drawable mutate2 = context.getDrawable(R.drawable.mini_stats_shares).mutate();
        mutate2.setTint(org.telegram.ui.ActionBar.g6.w0(null, i14, false));
        jq jqVar = new jq(null, mutate, 0, AndroidUtilities.dp(1.0f));
        int intrinsicWidth = mutate2.getIntrinsicWidth();
        int intrinsicHeight = mutate2.getIntrinsicHeight();
        jqVar.h = intrinsicWidth;
        jqVar.f29789n = intrinsicHeight;
        textView4.setCompoundDrawablesWithIntrinsicBounds(jqVar, (Drawable) null, (Drawable) null, (Drawable) null);
        textView4.setCompoundDrawablePadding(AndroidUtilities.dp(2.0f));
        jq jqVar2 = new jq(null, mutate2, 0, AndroidUtilities.dp(1.0f));
        int intrinsicWidth2 = mutate2.getIntrinsicWidth();
        int intrinsicHeight2 = mutate2.getIntrinsicHeight();
        jqVar2.h = intrinsicWidth2;
        jqVar2.f29789n = intrinsicHeight2;
        textView3.setCompoundDrawablesWithIntrinsicBounds(jqVar2, (Drawable) null, (Drawable) null, (Drawable) null);
        textView3.setCompoundDrawablePadding(AndroidUtilities.dp(2.0f));
        setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f26010x) {
            int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23063d7, this.f26008s);
            Paint paint = this.h;
            paint.setColor(v02);
            if (LocaleController.isRTL) {
                canvas.drawRect(0.0f, getHeight() - 1, getWidth() - AndroidUtilities.dp(72), getHeight(), paint);
            } else {
                canvas.drawRect(AndroidUtilities.dp(72), getHeight() - 1, getWidth(), getHeight(), paint);
            }
        }
    }

    public org.telegram.ui.Components.t9 getImageView() {
        return this.f26001a;
    }

    public q91 getPostInfo() {
        return this.v;
    }

    public lh.h7 getStoryAvatarParams() {
        return this.f26007r;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f26007r.g();
    }

    public void setData(m91 m91Var) {
        TLRPC.User user = m91Var.f40500a;
        org.telegram.ui.Components.e9 e9Var = this.f26006n;
        e9Var.r(user);
        TLRPC.User user2 = m91Var.f40500a;
        w7 w7Var = this.f26001a;
        w7Var.e(user2, e9Var);
        w7Var.setRoundRadius(AndroidUtilities.dp(46.0f) >> 1);
        this.f26002b.k(m91Var.f40500a.first_name);
        this.f26004e.setText(m91Var.f40501b);
        this.f26003c.setVisibility(8);
        this.d.setVisibility(8);
        this.f26005f.setVisibility(8);
    }

    public void setImageViewAction(View.OnClickListener onClickListener) {
        this.f26001a.setOnClickListener(onClickListener);
    }
}
