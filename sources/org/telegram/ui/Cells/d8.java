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
import org.telegram.messenger.em;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.vq;
import org.telegram.ui.cb1;
import org.telegram.ui.ya1;
public abstract class d8 extends FrameLayout {
    public final b8 f19002a;
    public final c8 f19003b;
    public final TextView f19004c;
    public final TextView d;
    public final TextView e;
    public final TextView f19005f;
    public final Paint h;
    public final org.telegram.ui.Components.g9 f19006n;
    public final zh.x5 f19007r;
    public final org.telegram.ui.ActionBar.f6 f19008s;
    public cb1 v;
    public final TLRPC.ChatFull f19009w;
    public boolean f19010x;

    public d8(Context context, TLRPC.ChatFull chatFull, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        int i10;
        float f7;
        float f10;
        int i11;
        float f11;
        float f12;
        this.h = new Paint(1);
        this.f19006n = new org.telegram.ui.Components.g9((org.telegram.ui.ActionBar.f6) null);
        this.f19007r = new zh.x5(null, false);
        this.f19009w = chatFull;
        this.f19008s = f6Var;
        b8 b8Var = new b8(this, context, f6Var);
        this.f19002a = b8Var;
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
        addView(b8Var, w7.a6.d(46, 46.0f, i12, f7, 0.0f, f10, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout f13 = em.f(context, 0);
        ?? l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.f19003b = l5Var;
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
        this.f19004c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-16777216);
        if (!LocaleController.isRTL) {
            f13.addView((View) l5Var, w7.a6.p(0, -2, 1.0f, 0, 0, 0, 16, 0));
            f13.addView(textView, w7.a6.q(-2, -2, 80));
        } else {
            f13.addView(textView, w7.a6.q(-2, -2, 80));
            f13.addView((View) l5Var, w7.a6.p(0, -2, 1.0f, 0, 16, 0, 0, 0));
        }
        linearLayout.addView(f13, w7.a6.d(-1, -2.0f, 8388659, 0.0f, 7.0f, 0.0f, 0.0f));
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
        this.f19005f = textView4;
        textView4.setTextSize(1, 13.0f);
        textView4.setTextColor(-16777216);
        textView4.setGravity(16);
        LinearLayout f14 = em.f(context, 0);
        if (!LocaleController.isRTL) {
            f14.addView(textView2, w7.a6.p(0, -2, 1.0f, 0, 0, 0, 8, 0));
            f14.addView(textView4, w7.a6.q(-2, -2, 16));
            f14.addView(textView3, w7.a6.t(-2, -2, 16, 10, 0, 0, 0));
        } else {
            f14.addView(textView3, w7.a6.t(-2, -2, 16, 0, 0, 10, 0));
            f14.addView(textView4, w7.a6.q(-2, -2, 16));
            f14.addView(textView2, w7.a6.p(0, -2, 1.0f, 0, 8, 0, 0, 0));
        }
        linearLayout.addView(f14, w7.a6.d(-1, -2.0f, 8388659, 0.0f, 3.0f, 0.0f, 9.0f));
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
        addView(linearLayout, w7.a6.d(-1, -2.0f, 0, f11, 0.0f, f12, 0.0f));
        int i13 = org.telegram.ui.ActionBar.j6.f18034j5;
        l5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        int i14 = org.telegram.ui.ActionBar.j6.A6;
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
        textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
        textView4.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
        Drawable mutate = context.getDrawable(R.drawable.mini_stats_likes).mutate();
        mutate.setTint(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
        Drawable mutate2 = context.getDrawable(R.drawable.mini_stats_shares).mutate();
        mutate2.setTint(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
        vq vqVar = new vq(null, mutate, 0, AndroidUtilities.dp(1.0f));
        int intrinsicWidth = mutate2.getIntrinsicWidth();
        int intrinsicHeight = mutate2.getIntrinsicHeight();
        vqVar.h = intrinsicWidth;
        vqVar.f28577n = intrinsicHeight;
        textView4.setCompoundDrawablesWithIntrinsicBounds(vqVar, (Drawable) null, (Drawable) null, (Drawable) null);
        textView4.setCompoundDrawablePadding(AndroidUtilities.dp(2.0f));
        vq vqVar2 = new vq(null, mutate2, 0, AndroidUtilities.dp(1.0f));
        int intrinsicWidth2 = mutate2.getIntrinsicWidth();
        int intrinsicHeight2 = mutate2.getIntrinsicHeight();
        vqVar2.h = intrinsicWidth2;
        vqVar2.f28577n = intrinsicHeight2;
        textView3.setCompoundDrawablesWithIntrinsicBounds(vqVar2, (Drawable) null, (Drawable) null, (Drawable) null);
        textView3.setCompoundDrawablePadding(AndroidUtilities.dp(2.0f));
        setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f19010x) {
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17929d7, this.f19008s);
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
        return this.f19002a;
    }

    public cb1 getPostInfo() {
        return this.v;
    }

    public zh.x5 getStoryAvatarParams() {
        return this.f19007r;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f19007r.g();
    }

    public void setData(ya1 ya1Var) {
        TLRPC.User user = ya1Var.f38957a;
        org.telegram.ui.Components.g9 g9Var = this.f19006n;
        g9Var.r(user);
        TLRPC.User user2 = ya1Var.f38957a;
        b8 b8Var = this.f19002a;
        b8Var.e(user2, g9Var);
        b8Var.setRoundRadius(AndroidUtilities.dp(46.0f) >> 1);
        this.f19003b.k(ya1Var.f38957a.first_name);
        this.e.setText(ya1Var.f38958b);
        this.f19004c.setVisibility(8);
        this.d.setVisibility(8);
        this.f19005f.setVisibility(8);
    }

    public void setImageViewAction(View.OnClickListener onClickListener) {
        this.f19002a.setOnClickListener(onClickListener);
    }
}
