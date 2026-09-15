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
import org.telegram.messenger.wl;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.pq;
import org.telegram.ui.ra1;
import org.telegram.ui.va1;
public abstract class c8 extends FrameLayout {
    public final a8 f19871a;
    public final b8 f19872b;
    public final TextView f19873c;
    public final TextView d;
    public final TextView e;
    public final TextView f19874f;
    public final Paint h;
    public final org.telegram.ui.Components.f9 f19875n;
    public final ai.ca f19876r;
    public final org.telegram.ui.ActionBar.e6 f19877s;
    public va1 v;
    public final TLRPC.ChatFull f19878w;
    public boolean f19879x;

    public c8(Context context, TLRPC.ChatFull chatFull, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int i10;
        float f7;
        float f10;
        int i11;
        float f11;
        float f12;
        this.h = new Paint(1);
        this.f19875n = new org.telegram.ui.Components.f9((org.telegram.ui.ActionBar.e6) null);
        this.f19876r = new ai.ca(null, false);
        this.f19878w = chatFull;
        this.f19877s = e6Var;
        a8 a8Var = new a8(this, context, e6Var);
        this.f19871a = a8Var;
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
        addView(a8Var, w7.x5.d(46, 46.0f, i12, f7, 0.0f, f10, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout f13 = wl.f(context, 0);
        ?? j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.f19872b = j5Var;
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
        this.f19873c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-16777216);
        if (!LocaleController.isRTL) {
            f13.addView((View) j5Var, w7.x5.p(0, -2, 1.0f, 0, 0, 0, 16, 0));
            f13.addView(textView, w7.x5.q(-2, -2, 80));
        } else {
            f13.addView(textView, w7.x5.q(-2, -2, 80));
            f13.addView((View) j5Var, w7.x5.p(0, -2, 1.0f, 0, 16, 0, 0, 0));
        }
        linearLayout.addView(f13, w7.x5.d(-1, -2.0f, 8388659, 0.0f, 7.0f, 0.0f, 0.0f));
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
        this.f19874f = textView4;
        textView4.setTextSize(1, 13.0f);
        textView4.setTextColor(-16777216);
        textView4.setGravity(16);
        LinearLayout f14 = wl.f(context, 0);
        if (!LocaleController.isRTL) {
            f14.addView(textView2, w7.x5.p(0, -2, 1.0f, 0, 0, 0, 8, 0));
            f14.addView(textView4, w7.x5.q(-2, -2, 16));
            f14.addView(textView3, w7.x5.t(-2, -2, 16, 10, 0, 0, 0));
        } else {
            f14.addView(textView3, w7.x5.t(-2, -2, 16, 0, 0, 10, 0));
            f14.addView(textView4, w7.x5.q(-2, -2, 16));
            f14.addView(textView2, w7.x5.p(0, -2, 1.0f, 0, 8, 0, 0, 0));
        }
        linearLayout.addView(f14, w7.x5.d(-1, -2.0f, 8388659, 0.0f, 3.0f, 0.0f, 9.0f));
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
        addView(linearLayout, w7.x5.d(-1, -2.0f, 0, f11, 0.0f, f12, 0.0f));
        int i13 = org.telegram.ui.ActionBar.i6.f18943j5;
        j5Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i13, false));
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i13, false));
        int i14 = org.telegram.ui.ActionBar.i6.A6;
        textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i14, false));
        textView3.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i14, false));
        textView4.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i14, false));
        Drawable mutate = context.getDrawable(R.drawable.mini_stats_likes).mutate();
        mutate.setTint(org.telegram.ui.ActionBar.i6.w0(null, i14, false));
        Drawable mutate2 = context.getDrawable(R.drawable.mini_stats_shares).mutate();
        mutate2.setTint(org.telegram.ui.ActionBar.i6.w0(null, i14, false));
        pq pqVar = new pq(null, mutate, 0, AndroidUtilities.dp(1.0f));
        int intrinsicWidth = mutate2.getIntrinsicWidth();
        int intrinsicHeight = mutate2.getIntrinsicHeight();
        pqVar.h = intrinsicWidth;
        pqVar.f27122n = intrinsicHeight;
        textView4.setCompoundDrawablesWithIntrinsicBounds(pqVar, (Drawable) null, (Drawable) null, (Drawable) null);
        textView4.setCompoundDrawablePadding(AndroidUtilities.dp(2.0f));
        pq pqVar2 = new pq(null, mutate2, 0, AndroidUtilities.dp(1.0f));
        int intrinsicWidth2 = mutate2.getIntrinsicWidth();
        int intrinsicHeight2 = mutate2.getIntrinsicHeight();
        pqVar2.h = intrinsicWidth2;
        pqVar2.f27122n = intrinsicHeight2;
        textView3.setCompoundDrawablesWithIntrinsicBounds(pqVar2, (Drawable) null, (Drawable) null, (Drawable) null);
        textView3.setCompoundDrawablePadding(AndroidUtilities.dp(2.0f));
        setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f19879x) {
            int v02 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18837d7, this.f19877s);
            Paint paint = this.h;
            paint.setColor(v02);
            if (LocaleController.isRTL) {
                canvas.drawRect(0.0f, getHeight() - 1, getWidth() - AndroidUtilities.dp(72), getHeight(), paint);
            } else {
                canvas.drawRect(AndroidUtilities.dp(72), getHeight() - 1, getWidth(), getHeight(), paint);
            }
        }
    }

    public org.telegram.ui.Components.u9 getImageView() {
        return this.f19871a;
    }

    public va1 getPostInfo() {
        return this.v;
    }

    public ai.ca getStoryAvatarParams() {
        return this.f19876r;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f19876r.g();
    }

    public void setData(ra1 ra1Var) {
        TLRPC.User user = ra1Var.f37064a;
        org.telegram.ui.Components.f9 f9Var = this.f19875n;
        f9Var.r(user);
        TLRPC.User user2 = ra1Var.f37064a;
        a8 a8Var = this.f19871a;
        a8Var.e(user2, f9Var);
        a8Var.setRoundRadius(AndroidUtilities.dp(46.0f) >> 1);
        this.f19872b.k(ra1Var.f37064a.first_name);
        this.e.setText(ra1Var.f37065b);
        this.f19873c.setVisibility(8);
        this.d.setVisibility(8);
        this.f19874f.setVisibility(8);
    }

    public void setImageViewAction(View.OnClickListener onClickListener) {
        this.f19871a.setOnClickListener(onClickListener);
    }
}
