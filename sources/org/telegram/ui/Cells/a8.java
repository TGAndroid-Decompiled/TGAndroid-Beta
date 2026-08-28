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
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fq;
import org.telegram.ui.l91;
import org.telegram.ui.p91;
public abstract class a8 extends FrameLayout {
    public final y7 f24057a;
    public final z7 f24058b;
    public final TextView f24059c;
    public final TextView d;
    public final TextView f24060e;
    public final TextView f24061f;
    public final Paint h;
    public final org.telegram.ui.Components.z8 f24062n;
    public final ih.l7 f24063r;
    public final org.telegram.ui.ActionBar.b6 f24064s;
    public p91 v;
    public final TLRPC.ChatFull f24065w;
    public boolean f24066x;

    public a8(Context context, TLRPC.ChatFull chatFull, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        int i9;
        float f10;
        float f11;
        int i10;
        float f12;
        float f13;
        this.h = new Paint(1);
        this.f24062n = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
        this.f24063r = new ih.l7(null, false);
        this.f24065w = chatFull;
        this.f24064s = b6Var;
        y7 y7Var = new y7(this, context, b6Var);
        this.f24057a = y7Var;
        setClipChildren(false);
        boolean z10 = LocaleController.isRTL;
        if (!z10) {
            i9 = 8388611;
        } else {
            i9 = 8388613;
        }
        int i11 = i9 | 16;
        if (!z10) {
            f10 = 12.0f;
        } else {
            f10 = 16.0f;
        }
        if (!z10) {
            f11 = 16.0f;
        } else {
            f11 = 12.0f;
        }
        addView(y7Var, g7.e6.d(46, 46.0f, i11, f10, 0.0f, f11, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout f14 = ll.f(context, 0);
        ?? h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f24058b = h5Var;
        NotificationCenter.listenEmojiLoading(h5Var);
        h5Var.setTypeface(AndroidUtilities.bold());
        h5Var.setTextSize(16);
        h5Var.setMaxLines(1);
        h5Var.setTextColor(-16777216);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        h5Var.setGravity(i10);
        TextView textView = new TextView(context);
        this.f24059c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-16777216);
        if (!LocaleController.isRTL) {
            f14.addView((View) h5Var, g7.e6.p(0, -2, 1.0f, 0, 0, 0, 16, 0));
            f14.addView(textView, g7.e6.q(-2, -2, 80));
        } else {
            f14.addView(textView, g7.e6.q(-2, -2, 80));
            f14.addView((View) h5Var, g7.e6.p(0, -2, 1.0f, 0, 16, 0, 0, 0));
        }
        linearLayout.addView(f14, g7.e6.d(-1, -2.0f, 8388659, 0.0f, 7.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f24060e = textView2;
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
        this.f24061f = textView4;
        textView4.setTextSize(1, 13.0f);
        textView4.setTextColor(-16777216);
        textView4.setGravity(16);
        LinearLayout f15 = ll.f(context, 0);
        if (!LocaleController.isRTL) {
            f15.addView(textView2, g7.e6.p(0, -2, 1.0f, 0, 0, 0, 8, 0));
            f15.addView(textView4, g7.e6.q(-2, -2, 16));
            f15.addView(textView3, g7.e6.t(-2, -2, 16, 10, 0, 0, 0));
        } else {
            f15.addView(textView3, g7.e6.t(-2, -2, 16, 0, 0, 10, 0));
            f15.addView(textView4, g7.e6.q(-2, -2, 16));
            f15.addView(textView2, g7.e6.p(0, -2, 1.0f, 0, 8, 0, 0, 0));
        }
        linearLayout.addView(f15, g7.e6.d(-1, -2.0f, 8388659, 0.0f, 3.0f, 0.0f, 9.0f));
        boolean z11 = LocaleController.isRTL;
        if (!z11) {
            f12 = 72.0f;
        } else {
            f12 = 18.0f;
        }
        if (!z11) {
            f13 = 18.0f;
        } else {
            f13 = 72.0f;
        }
        addView(linearLayout, g7.e6.d(-1, -2.0f, 0, f12, 0.0f, f13, 0.0f));
        int i12 = org.telegram.ui.ActionBar.f6.f23108j5;
        h5Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
        int i13 = org.telegram.ui.ActionBar.f6.A6;
        textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i13, false));
        textView3.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i13, false));
        textView4.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i13, false));
        Drawable mutate = context.getDrawable(R.drawable.mini_stats_likes).mutate();
        mutate.setTint(org.telegram.ui.ActionBar.f6.w0(null, i13, false));
        Drawable mutate2 = context.getDrawable(R.drawable.mini_stats_shares).mutate();
        mutate2.setTint(org.telegram.ui.ActionBar.f6.w0(null, i13, false));
        fq fqVar = new fq(null, mutate, 0, AndroidUtilities.dp(1.0f));
        int intrinsicWidth = mutate2.getIntrinsicWidth();
        int intrinsicHeight = mutate2.getIntrinsicHeight();
        fqVar.h = intrinsicWidth;
        fqVar.f28547n = intrinsicHeight;
        textView4.setCompoundDrawablesWithIntrinsicBounds(fqVar, (Drawable) null, (Drawable) null, (Drawable) null);
        textView4.setCompoundDrawablePadding(AndroidUtilities.dp(2.0f));
        fq fqVar2 = new fq(null, mutate2, 0, AndroidUtilities.dp(1.0f));
        int intrinsicWidth2 = mutate2.getIntrinsicWidth();
        int intrinsicHeight2 = mutate2.getIntrinsicHeight();
        fqVar2.h = intrinsicWidth2;
        fqVar2.f28547n = intrinsicHeight2;
        textView3.setCompoundDrawablesWithIntrinsicBounds(fqVar2, (Drawable) null, (Drawable) null, (Drawable) null);
        textView3.setCompoundDrawablePadding(AndroidUtilities.dp(2.0f));
        setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f24066x) {
            int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23002d7, this.f24064s);
            Paint paint = this.h;
            paint.setColor(v02);
            if (LocaleController.isRTL) {
                canvas.drawRect(0.0f, getHeight() - 1, getWidth() - AndroidUtilities.dp(72), getHeight(), paint);
            } else {
                canvas.drawRect(AndroidUtilities.dp(72), getHeight() - 1, getWidth(), getHeight(), paint);
            }
        }
    }

    public org.telegram.ui.Components.o9 getImageView() {
        return this.f24057a;
    }

    public p91 getPostInfo() {
        return this.v;
    }

    public ih.l7 getStoryAvatarParams() {
        return this.f24063r;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f24063r.g();
    }

    public void setData(l91 l91Var) {
        TLRPC.User user = l91Var.f40087a;
        org.telegram.ui.Components.z8 z8Var = this.f24062n;
        z8Var.r(user);
        TLRPC.User user2 = l91Var.f40087a;
        y7 y7Var = this.f24057a;
        y7Var.e(user2, z8Var);
        y7Var.setRoundRadius(AndroidUtilities.dp(46.0f) >> 1);
        this.f24058b.k(l91Var.f40087a.first_name);
        this.f24060e.setText(l91Var.f40088b);
        this.f24059c.setVisibility(8);
        this.d.setVisibility(8);
        this.f24061f.setVisibility(8);
    }

    public void setImageViewAction(View.OnClickListener onClickListener) {
        this.f24057a.setOnClickListener(onClickListener);
    }
}
