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
import org.telegram.messenger.sk;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cr;
import org.telegram.ui.ab1;
import org.telegram.ui.eb1;
public abstract class c8 extends FrameLayout {
    public final a8 f20719a;
    public final b8 f20720b;
    public final TextView f20721c;
    public final TextView d;
    public final TextView e;
    public final TextView f20722f;
    public final Paint h;
    public final org.telegram.ui.Components.k9 f20723n;
    public final bi.m9 f20724r;
    public final org.telegram.ui.ActionBar.c6 f20725s;
    public eb1 v;
    public final TLRPC.ChatFull f20726w;
    public boolean f20727x;

    public c8(Context context, TLRPC.ChatFull chatFull, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        int i10;
        float f7;
        float f10;
        int i11;
        float f11;
        float f12;
        this.h = new Paint(1);
        this.f20723n = new org.telegram.ui.Components.k9((org.telegram.ui.ActionBar.c6) null);
        this.f20724r = new bi.m9(null, false);
        this.f20726w = chatFull;
        this.f20725s = c6Var;
        a8 a8Var = new a8(this, context, c6Var);
        this.f20719a = a8Var;
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
        addView(a8Var, w7.z5.a(46.0f, f7, 0.0f, f10, 0.0f, 46, i12));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout e = sk.e(context, 0);
        ?? h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f20720b = h5Var;
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
        this.f20721c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-16777216);
        if (!LocaleController.isRTL) {
            e.addView((View) h5Var, w7.z5.p(0, -2, 1.0f, 0, 0, 0, 16, 0));
            e.addView(textView, w7.z5.q(-2, -2, 80));
        } else {
            e.addView(textView, w7.z5.q(-2, -2, 80));
            e.addView((View) h5Var, w7.z5.p(0, -2, 1.0f, 0, 16, 0, 0, 0));
        }
        linearLayout.addView(e, w7.z5.a(-2.0f, 0.0f, 7.0f, 0.0f, 0.0f, -1, 8388659));
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
        this.f20722f = textView4;
        textView4.setTextSize(1, 13.0f);
        textView4.setTextColor(-16777216);
        textView4.setGravity(16);
        LinearLayout e7 = sk.e(context, 0);
        if (!LocaleController.isRTL) {
            e7.addView(textView2, w7.z5.p(0, -2, 1.0f, 0, 0, 0, 8, 0));
            e7.addView(textView4, w7.z5.q(-2, -2, 16));
            e7.addView(textView3, w7.z5.t(-2, -2, 16, 10, 0, 0, 0));
        } else {
            e7.addView(textView3, w7.z5.t(-2, -2, 16, 0, 0, 10, 0));
            e7.addView(textView4, w7.z5.q(-2, -2, 16));
            e7.addView(textView2, w7.z5.p(0, -2, 1.0f, 0, 8, 0, 0, 0));
        }
        linearLayout.addView(e7, w7.z5.a(-2.0f, 0.0f, 3.0f, 0.0f, 9.0f, -1, 8388659));
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
        addView(linearLayout, w7.z5.a(-2.0f, f11, 0.0f, f12, 0.0f, -1, 0));
        int i13 = org.telegram.ui.ActionBar.g6.f19707j5;
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i13, false));
        textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i13, false));
        int i14 = org.telegram.ui.ActionBar.g6.A6;
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i14, false));
        textView3.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i14, false));
        textView4.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i14, false));
        Drawable mutate = context.getDrawable(R.drawable.mini_stats_likes).mutate();
        mutate.setTint(org.telegram.ui.ActionBar.g6.x0(null, i14, false));
        Drawable mutate2 = context.getDrawable(R.drawable.mini_stats_shares).mutate();
        mutate2.setTint(org.telegram.ui.ActionBar.g6.x0(null, i14, false));
        cr crVar = new cr(null, mutate, 0, AndroidUtilities.dp(1.0f));
        int intrinsicWidth = mutate2.getIntrinsicWidth();
        int intrinsicHeight = mutate2.getIntrinsicHeight();
        crVar.h = intrinsicWidth;
        crVar.f23880n = intrinsicHeight;
        textView4.setCompoundDrawablesWithIntrinsicBounds(crVar, (Drawable) null, (Drawable) null, (Drawable) null);
        textView4.setCompoundDrawablePadding(AndroidUtilities.dp(2.0f));
        cr crVar2 = new cr(null, mutate2, 0, AndroidUtilities.dp(1.0f));
        int intrinsicWidth2 = mutate2.getIntrinsicWidth();
        int intrinsicHeight2 = mutate2.getIntrinsicHeight();
        crVar2.h = intrinsicWidth2;
        crVar2.f23880n = intrinsicHeight2;
        textView3.setCompoundDrawablesWithIntrinsicBounds(crVar2, (Drawable) null, (Drawable) null, (Drawable) null);
        textView3.setCompoundDrawablePadding(AndroidUtilities.dp(2.0f));
        setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f20727x) {
            int w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19602d7, this.f20725s);
            Paint paint = this.h;
            paint.setColor(w02);
            if (LocaleController.isRTL) {
                canvas.drawRect(0.0f, getHeight() - 1, getWidth() - AndroidUtilities.dp(72), getHeight(), paint);
            } else {
                canvas.drawRect(AndroidUtilities.dp(72), getHeight() - 1, getWidth(), getHeight(), paint);
            }
        }
    }

    public org.telegram.ui.Components.z9 getImageView() {
        return this.f20719a;
    }

    public eb1 getPostInfo() {
        return this.v;
    }

    public bi.m9 getStoryAvatarParams() {
        return this.f20724r;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f20724r.g();
    }

    public void setData(ab1 ab1Var) {
        TLRPC.User user = ab1Var.f33832a;
        org.telegram.ui.Components.k9 k9Var = this.f20723n;
        k9Var.r(user);
        TLRPC.User user2 = ab1Var.f33832a;
        a8 a8Var = this.f20719a;
        a8Var.e(user2, k9Var);
        a8Var.setRoundRadius(AndroidUtilities.dp(46.0f) >> 1);
        this.f20720b.k(ab1Var.f33832a.first_name);
        this.e.setText(ab1Var.f33833b);
        this.f20721c.setVisibility(8);
        this.d.setVisibility(8);
        this.f20722f.setVisibility(8);
    }

    public void setImageViewAction(View.OnClickListener onClickListener) {
        this.f20719a.setOnClickListener(onClickListener);
    }
}
