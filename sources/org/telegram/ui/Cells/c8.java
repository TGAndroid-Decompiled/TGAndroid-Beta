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
import org.telegram.messenger.bi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fr;
import org.telegram.ui.ua1;
import org.telegram.ui.ya1;
public abstract class c8 extends FrameLayout {
    public final a8 f21925a;
    public final b8 f21926b;
    public final TextView f21927c;
    public final TextView d;
    public final TextView f21928e;
    public final TextView f21929f;
    public final Paint h;
    public final org.telegram.ui.Components.j9 f21930n;
    public final ai.da f21931r;
    public final org.telegram.ui.ActionBar.e6 f21932s;
    public ya1 v;
    public final TLRPC.ChatFull f21933w;
    public boolean f21934x;

    public c8(Context context, TLRPC.ChatFull chatFull, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int i10;
        float f7;
        float f10;
        int i11;
        float f11;
        float f12;
        this.h = new Paint(1);
        this.f21930n = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.e6) null);
        this.f21931r = new ai.da(null, false);
        this.f21933w = chatFull;
        this.f21932s = e6Var;
        a8 a8Var = new a8(this, context, e6Var);
        this.f21925a = a8Var;
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
        addView(a8Var, w7.x5.a(46.0f, f7, 0.0f, f10, 0.0f, 46, i12));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout e7 = bi.e(context, 0);
        ?? j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.f21926b = j5Var;
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
        this.f21927c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-16777216);
        if (!LocaleController.isRTL) {
            e7.addView((View) j5Var, w7.x5.p(0, -2, 1.0f, 0, 0, 0, 16, 0));
            e7.addView(textView, w7.x5.q(-2, -2, 80));
        } else {
            e7.addView(textView, w7.x5.q(-2, -2, 80));
            e7.addView((View) j5Var, w7.x5.p(0, -2, 1.0f, 0, 16, 0, 0, 0));
        }
        linearLayout.addView(e7, w7.x5.a(-2.0f, 0.0f, 7.0f, 0.0f, 0.0f, -1, 8388659));
        TextView textView2 = new TextView(context);
        this.f21928e = textView2;
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
        this.f21929f = textView4;
        textView4.setTextSize(1, 13.0f);
        textView4.setTextColor(-16777216);
        textView4.setGravity(16);
        LinearLayout e10 = bi.e(context, 0);
        if (!LocaleController.isRTL) {
            e10.addView(textView2, w7.x5.p(0, -2, 1.0f, 0, 0, 0, 8, 0));
            e10.addView(textView4, w7.x5.q(-2, -2, 16));
            e10.addView(textView3, w7.x5.t(-2, -2, 16, 10, 0, 0, 0));
        } else {
            e10.addView(textView3, w7.x5.t(-2, -2, 16, 0, 0, 10, 0));
            e10.addView(textView4, w7.x5.q(-2, -2, 16));
            e10.addView(textView2, w7.x5.p(0, -2, 1.0f, 0, 8, 0, 0, 0));
        }
        linearLayout.addView(e10, w7.x5.a(-2.0f, 0.0f, 3.0f, 0.0f, 9.0f, -1, 8388659));
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
        addView(linearLayout, w7.x5.a(-2.0f, f11, 0.0f, f12, 0.0f, -1, 0));
        int i13 = org.telegram.ui.ActionBar.i6.f20909j5;
        j5Var.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i13, false));
        textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i13, false));
        int i14 = org.telegram.ui.ActionBar.i6.A6;
        textView2.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i14, false));
        textView3.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i14, false));
        textView4.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i14, false));
        Drawable mutate = context.getDrawable(R.drawable.mini_stats_likes).mutate();
        mutate.setTint(org.telegram.ui.ActionBar.i6.x0(null, i14, false));
        Drawable mutate2 = context.getDrawable(R.drawable.mini_stats_shares).mutate();
        mutate2.setTint(org.telegram.ui.ActionBar.i6.x0(null, i14, false));
        fr frVar = new fr(null, mutate, 0, AndroidUtilities.dp(1.0f));
        int intrinsicWidth = mutate2.getIntrinsicWidth();
        int intrinsicHeight = mutate2.getIntrinsicHeight();
        frVar.h = intrinsicWidth;
        frVar.f26500n = intrinsicHeight;
        textView4.setCompoundDrawablesWithIntrinsicBounds(frVar, (Drawable) null, (Drawable) null, (Drawable) null);
        textView4.setCompoundDrawablePadding(AndroidUtilities.dp(2.0f));
        fr frVar2 = new fr(null, mutate2, 0, AndroidUtilities.dp(1.0f));
        int intrinsicWidth2 = mutate2.getIntrinsicWidth();
        int intrinsicHeight2 = mutate2.getIntrinsicHeight();
        frVar2.h = intrinsicWidth2;
        frVar2.f26500n = intrinsicHeight2;
        textView3.setCompoundDrawablesWithIntrinsicBounds(frVar2, (Drawable) null, (Drawable) null, (Drawable) null);
        textView3.setCompoundDrawablePadding(AndroidUtilities.dp(2.0f));
        setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f21934x) {
            int w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20802d7, this.f21932s);
            Paint paint = this.h;
            paint.setColor(w02);
            if (LocaleController.isRTL) {
                canvas.drawRect(0.0f, getHeight() - 1, getWidth() - AndroidUtilities.dp(72), getHeight(), paint);
            } else {
                canvas.drawRect(AndroidUtilities.dp(72), getHeight() - 1, getWidth(), getHeight(), paint);
            }
        }
    }

    public org.telegram.ui.Components.y9 getImageView() {
        return this.f21925a;
    }

    public ya1 getPostInfo() {
        return this.v;
    }

    public ai.da getStoryAvatarParams() {
        return this.f21931r;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f21931r.g();
    }

    public void setData(ua1 ua1Var) {
        TLRPC.User user = ua1Var.f42431a;
        org.telegram.ui.Components.j9 j9Var = this.f21930n;
        j9Var.r(user);
        TLRPC.User user2 = ua1Var.f42431a;
        a8 a8Var = this.f21925a;
        a8Var.e(user2, j9Var);
        a8Var.setRoundRadius(AndroidUtilities.dp(46.0f) >> 1);
        this.f21926b.k(ua1Var.f42431a.first_name);
        this.f21928e.setText(ua1Var.f42432b);
        this.f21927c.setVisibility(8);
        this.d.setVisibility(8);
        this.f21929f.setVisibility(8);
    }

    public void setImageViewAction(View.OnClickListener onClickListener) {
        this.f21925a.setOnClickListener(onClickListener);
    }
}
