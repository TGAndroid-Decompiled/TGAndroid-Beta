package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
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
import org.telegram.messenger.vh;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ar;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.p91;
import org.telegram.ui.t91;
public abstract class f8 extends FrameLayout {
    public final d8 f24076a;
    public final e8 f24077b;
    public final TextView f24078c;
    public final TextView d;
    public final TextView e;
    public final TextView f24079f;
    public final Paint h;
    public final org.telegram.ui.Components.j9 f24080n;
    public final di.w7 f24081r;
    public final org.telegram.ui.ActionBar.u6 f24082s;
    public t91 v;
    public final TLRPC.ChatFull f24083w;
    public boolean f24084x;

    public f8(Context context, TLRPC.ChatFull chatFull, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        int i10;
        float f7;
        float f10;
        int i11;
        float f11;
        float f12;
        this.h = new Paint(1);
        this.f24080n = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
        this.f24081r = new di.w7(null, false);
        this.f24083w = chatFull;
        this.f24082s = u6Var;
        d8 d8Var = new d8(this, context, u6Var);
        this.f24076a = d8Var;
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
        addView(d8Var, gb1.h(46, 46.0f, i12, f7, 0.0f, f10, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout d = vh.d(context, 0);
        ?? b6Var = new org.telegram.ui.ActionBar.b6(context);
        this.f24077b = b6Var;
        NotificationCenter.listenEmojiLoading(b6Var);
        b6Var.setTypeface(AndroidUtilities.bold());
        b6Var.setTextSize(16);
        b6Var.setMaxLines(1);
        b6Var.setTextColor(-16777216);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        b6Var.setGravity(i11);
        TextView textView = new TextView(context);
        this.f24078c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-16777216);
        if (!LocaleController.isRTL) {
            d.addView((View) b6Var, gb1.t(0, -2, 1.0f, 0, 0, 0, 16, 0));
            d.addView(textView, gb1.u(-2, -2, 80));
        } else {
            d.addView(textView, gb1.u(-2, -2, 80));
            d.addView((View) b6Var, gb1.t(0, -2, 1.0f, 0, 16, 0, 0, 0));
        }
        linearLayout.addView(d, gb1.h(-1, -2.0f, 8388659, 0.0f, 7.0f, 0.0f, 0.0f));
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
        this.f24079f = textView4;
        textView4.setTextSize(1, 13.0f);
        textView4.setTextColor(-16777216);
        textView4.setGravity(16);
        LinearLayout d10 = vh.d(context, 0);
        if (!LocaleController.isRTL) {
            d10.addView(textView2, gb1.t(0, -2, 1.0f, 0, 0, 0, 8, 0));
            d10.addView(textView4, gb1.u(-2, -2, 16));
            d10.addView(textView3, gb1.x(-2, -2, 16, 10, 0, 0, 0));
        } else {
            d10.addView(textView3, gb1.x(-2, -2, 16, 0, 0, 10, 0));
            d10.addView(textView4, gb1.u(-2, -2, 16));
            d10.addView(textView2, gb1.t(0, -2, 1.0f, 0, 8, 0, 0, 0));
        }
        linearLayout.addView(d10, gb1.h(-1, -2.0f, 8388659, 0.0f, 3.0f, 0.0f, 9.0f));
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
        addView(linearLayout, gb1.h(-1, -2.0f, 0, f11, 0.0f, f12, 0.0f));
        int i13 = org.telegram.ui.ActionBar.y6.f23462j5;
        org.telegram.ui.ActionBar.f7.Y(b6Var, i13, null);
        org.telegram.ui.ActionBar.f7.V(textView, i13, null);
        int i14 = org.telegram.ui.ActionBar.y6.A6;
        org.telegram.ui.ActionBar.f7.V(textView2, i14, null);
        org.telegram.ui.ActionBar.f7.V(textView3, i14, null);
        org.telegram.ui.ActionBar.f7.V(textView4, i14, null);
        Drawable mutate = context.getDrawable(R.drawable.mini_stats_likes).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.f7.y(textView4, mutate, i14, null, mode);
        Drawable mutate2 = context.getDrawable(R.drawable.mini_stats_shares).mutate();
        org.telegram.ui.ActionBar.f7.y(textView3, mutate2, i14, null, mode);
        ar arVar = new ar(null, mutate, 0, AndroidUtilities.dp(1.0f));
        int intrinsicWidth = mutate2.getIntrinsicWidth();
        int intrinsicHeight = mutate2.getIntrinsicHeight();
        arVar.h = intrinsicWidth;
        arVar.f26594n = intrinsicHeight;
        textView4.setCompoundDrawablesWithIntrinsicBounds(arVar, (Drawable) null, (Drawable) null, (Drawable) null);
        textView4.setCompoundDrawablePadding(AndroidUtilities.dp(2.0f));
        ar arVar2 = new ar(null, mutate2, 0, AndroidUtilities.dp(1.0f));
        int intrinsicWidth2 = mutate2.getIntrinsicWidth();
        int intrinsicHeight2 = mutate2.getIntrinsicHeight();
        arVar2.h = intrinsicWidth2;
        arVar2.f26594n = intrinsicHeight2;
        textView3.setCompoundDrawablesWithIntrinsicBounds(arVar2, (Drawable) null, (Drawable) null, (Drawable) null);
        textView3.setCompoundDrawablePadding(AndroidUtilities.dp(2.0f));
        setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f24084x) {
            int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23355d7, this.f24082s);
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
        return this.f24076a;
    }

    public t91 getPostInfo() {
        return this.v;
    }

    public di.w7 getStoryAvatarParams() {
        return this.f24081r;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f24081r.g();
    }

    public void setData(p91 p91Var) {
        TLRPC.User user = p91Var.f42408a;
        org.telegram.ui.Components.j9 j9Var = this.f24080n;
        j9Var.r(user);
        TLRPC.User user2 = p91Var.f42408a;
        d8 d8Var = this.f24076a;
        d8Var.f(user2, j9Var);
        d8Var.setRoundRadius(AndroidUtilities.dp(46.0f) >> 1);
        this.f24077b.k(p91Var.f42408a.first_name);
        this.e.setText(p91Var.f42409b);
        this.f24078c.setVisibility(8);
        this.d.setVisibility(8);
        this.f24079f.setVisibility(8);
    }

    public void setImageViewAction(View.OnClickListener onClickListener) {
        this.f24076a.setOnClickListener(onClickListener);
    }
}
