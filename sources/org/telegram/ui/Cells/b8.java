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
import org.telegram.messenger.kk;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.zq;
import org.telegram.ui.i91;
import org.telegram.ui.m91;
public abstract class b8 extends FrameLayout {
    public final z7 f22047a;
    public final a8 f22048b;
    public final TextView f22049c;
    public final TextView d;
    public final TextView e;
    public final TextView f22050f;
    public final Paint h;
    public final org.telegram.ui.Components.h9 f22051n;
    public final ci.y7 f22052r;
    public final org.telegram.ui.ActionBar.d6 f22053s;
    public m91 v;
    public final TLRPC.ChatFull f22054w;
    public boolean f22055x;

    public b8(Context context, TLRPC.ChatFull chatFull, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        int i10;
        float f7;
        float f10;
        int i11;
        float f11;
        float f12;
        this.h = new Paint(1);
        this.f22051n = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        this.f22052r = new ci.y7(null, false);
        this.f22054w = chatFull;
        this.f22053s = d6Var;
        z7 z7Var = new z7(this, context, d6Var);
        this.f22047a = z7Var;
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
        addView(z7Var, w7.z5.d(46, 46.0f, i12, f7, 0.0f, f10, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout e = kk.e(context, 0);
        ?? j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.f22048b = j5Var;
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
        this.f22049c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-16777216);
        if (!LocaleController.isRTL) {
            e.addView((View) j5Var, w7.z5.p(0, -2, 1.0f, 0, 0, 0, 16, 0));
            e.addView(textView, w7.z5.q(-2, -2, 80));
        } else {
            e.addView(textView, w7.z5.q(-2, -2, 80));
            e.addView((View) j5Var, w7.z5.p(0, -2, 1.0f, 0, 16, 0, 0, 0));
        }
        linearLayout.addView(e, w7.z5.d(-1, -2.0f, 8388659, 0.0f, 7.0f, 0.0f, 0.0f));
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
        this.f22050f = textView4;
        textView4.setTextSize(1, 13.0f);
        textView4.setTextColor(-16777216);
        textView4.setGravity(16);
        LinearLayout e7 = kk.e(context, 0);
        if (!LocaleController.isRTL) {
            e7.addView(textView2, w7.z5.p(0, -2, 1.0f, 0, 0, 0, 8, 0));
            e7.addView(textView4, w7.z5.q(-2, -2, 16));
            e7.addView(textView3, w7.z5.t(-2, -2, 16, 10, 0, 0, 0));
        } else {
            e7.addView(textView3, w7.z5.t(-2, -2, 16, 0, 0, 10, 0));
            e7.addView(textView4, w7.z5.q(-2, -2, 16));
            e7.addView(textView2, w7.z5.p(0, -2, 1.0f, 0, 8, 0, 0, 0));
        }
        linearLayout.addView(e7, w7.z5.d(-1, -2.0f, 8388659, 0.0f, 3.0f, 0.0f, 9.0f));
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
        int i13 = org.telegram.ui.ActionBar.h6.f21093j5;
        j5Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i13, false));
        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i13, false));
        int i14 = org.telegram.ui.ActionBar.h6.A6;
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i14, false));
        textView3.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i14, false));
        textView4.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i14, false));
        Drawable mutate = context.getDrawable(R.drawable.mini_stats_likes).mutate();
        mutate.setTint(org.telegram.ui.ActionBar.h6.x0(null, i14, false));
        Drawable mutate2 = context.getDrawable(R.drawable.mini_stats_shares).mutate();
        mutate2.setTint(org.telegram.ui.ActionBar.h6.x0(null, i14, false));
        zq zqVar = new zq(null, mutate, 0, AndroidUtilities.dp(1.0f));
        int intrinsicWidth = mutate2.getIntrinsicWidth();
        int intrinsicHeight = mutate2.getIntrinsicHeight();
        zqVar.h = intrinsicWidth;
        zqVar.f33020n = intrinsicHeight;
        textView4.setCompoundDrawablesWithIntrinsicBounds(zqVar, (Drawable) null, (Drawable) null, (Drawable) null);
        textView4.setCompoundDrawablePadding(AndroidUtilities.dp(2.0f));
        zq zqVar2 = new zq(null, mutate2, 0, AndroidUtilities.dp(1.0f));
        int intrinsicWidth2 = mutate2.getIntrinsicWidth();
        int intrinsicHeight2 = mutate2.getIntrinsicHeight();
        zqVar2.h = intrinsicWidth2;
        zqVar2.f33020n = intrinsicHeight2;
        textView3.setCompoundDrawablesWithIntrinsicBounds(zqVar2, (Drawable) null, (Drawable) null, (Drawable) null);
        textView3.setCompoundDrawablePadding(AndroidUtilities.dp(2.0f));
        setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f22055x) {
            int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20988d7, this.f22053s);
            Paint paint = this.h;
            paint.setColor(w02);
            if (LocaleController.isRTL) {
                canvas.drawRect(0.0f, getHeight() - 1, getWidth() - AndroidUtilities.dp(72), getHeight(), paint);
            } else {
                canvas.drawRect(AndroidUtilities.dp(72), getHeight() - 1, getWidth(), getHeight(), paint);
            }
        }
    }

    public org.telegram.ui.Components.w9 getImageView() {
        return this.f22047a;
    }

    public m91 getPostInfo() {
        return this.v;
    }

    public ci.y7 getStoryAvatarParams() {
        return this.f22052r;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f22052r.g();
    }

    public void setData(i91 i91Var) {
        TLRPC.User user = i91Var.f37894a;
        org.telegram.ui.Components.h9 h9Var = this.f22051n;
        h9Var.r(user);
        TLRPC.User user2 = i91Var.f37894a;
        z7 z7Var = this.f22047a;
        z7Var.e(user2, h9Var);
        z7Var.setRoundRadius(AndroidUtilities.dp(46.0f) >> 1);
        this.f22048b.k(i91Var.f37894a.first_name);
        this.e.setText(i91Var.f37895b);
        this.f22049c.setVisibility(8);
        this.d.setVisibility(8);
        this.f22050f.setVisibility(8);
    }

    public void setImageViewAction(View.OnClickListener onClickListener) {
        this.f22047a.setOnClickListener(onClickListener);
    }
}
