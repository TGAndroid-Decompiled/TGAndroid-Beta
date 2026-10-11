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
import org.telegram.messenger.ai;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fr;
import org.telegram.ui.ta1;
import org.telegram.ui.xa1;
public abstract class c8 extends FrameLayout {
    public final a8 f21913a;
    public final b8 f21914b;
    public final TextView f21915c;
    public final TextView d;
    public final TextView f21916e;
    public final TextView f21917f;
    public final Paint h;
    public final org.telegram.ui.Components.j9 f21918n;
    public final ai.da f21919r;
    public final org.telegram.ui.ActionBar.d6 f21920s;
    public xa1 v;
    public final TLRPC.ChatFull f21921w;
    public boolean f21922x;

    public c8(Context context, TLRPC.ChatFull chatFull, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        int i10;
        float f7;
        float f10;
        int i11;
        float f11;
        float f12;
        this.h = new Paint(1);
        this.f21918n = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.d6) null);
        this.f21919r = new ai.da(null, false);
        this.f21921w = chatFull;
        this.f21920s = d6Var;
        a8 a8Var = new a8(this, context, d6Var);
        this.f21913a = a8Var;
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
        LinearLayout e7 = ai.e(context, 0);
        ?? h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f21914b = h5Var;
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
        this.f21915c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-16777216);
        if (!LocaleController.isRTL) {
            e7.addView((View) h5Var, w7.x5.p(0, -2, 1.0f, 0, 0, 0, 16, 0));
            e7.addView(textView, w7.x5.q(-2, -2, 80));
        } else {
            e7.addView(textView, w7.x5.q(-2, -2, 80));
            e7.addView((View) h5Var, w7.x5.p(0, -2, 1.0f, 0, 16, 0, 0, 0));
        }
        linearLayout.addView(e7, w7.x5.a(-2.0f, 0.0f, 7.0f, 0.0f, 0.0f, -1, 8388659));
        TextView textView2 = new TextView(context);
        this.f21916e = textView2;
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
        this.f21917f = textView4;
        textView4.setTextSize(1, 13.0f);
        textView4.setTextColor(-16777216);
        textView4.setGravity(16);
        LinearLayout e10 = ai.e(context, 0);
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
        int i13 = org.telegram.ui.ActionBar.h6.f20894j5;
        h5Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i13, false));
        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i13, false));
        int i14 = org.telegram.ui.ActionBar.h6.A6;
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i14, false));
        textView3.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i14, false));
        textView4.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i14, false));
        Drawable mutate = context.getDrawable(R.drawable.mini_stats_likes).mutate();
        mutate.setTint(org.telegram.ui.ActionBar.h6.x0(null, i14, false));
        Drawable mutate2 = context.getDrawable(R.drawable.mini_stats_shares).mutate();
        mutate2.setTint(org.telegram.ui.ActionBar.h6.x0(null, i14, false));
        fr frVar = new fr(null, mutate, 0, AndroidUtilities.dp(1.0f));
        int intrinsicWidth = mutate2.getIntrinsicWidth();
        int intrinsicHeight = mutate2.getIntrinsicHeight();
        frVar.h = intrinsicWidth;
        frVar.f26472n = intrinsicHeight;
        textView4.setCompoundDrawablesWithIntrinsicBounds(frVar, (Drawable) null, (Drawable) null, (Drawable) null);
        textView4.setCompoundDrawablePadding(AndroidUtilities.dp(2.0f));
        fr frVar2 = new fr(null, mutate2, 0, AndroidUtilities.dp(1.0f));
        int intrinsicWidth2 = mutate2.getIntrinsicWidth();
        int intrinsicHeight2 = mutate2.getIntrinsicHeight();
        frVar2.h = intrinsicWidth2;
        frVar2.f26472n = intrinsicHeight2;
        textView3.setCompoundDrawablesWithIntrinsicBounds(frVar2, (Drawable) null, (Drawable) null, (Drawable) null);
        textView3.setCompoundDrawablePadding(AndroidUtilities.dp(2.0f));
        setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f21922x) {
            int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20787d7, this.f21920s);
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
        return this.f21913a;
    }

    public xa1 getPostInfo() {
        return this.v;
    }

    public ai.da getStoryAvatarParams() {
        return this.f21919r;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f21919r.g();
    }

    public void setData(ta1 ta1Var) {
        TLRPC.User user = ta1Var.f42142a;
        org.telegram.ui.Components.j9 j9Var = this.f21918n;
        j9Var.r(user);
        TLRPC.User user2 = ta1Var.f42142a;
        a8 a8Var = this.f21913a;
        a8Var.e(user2, j9Var);
        a8Var.setRoundRadius(AndroidUtilities.dp(46.0f) >> 1);
        this.f21914b.k(ta1Var.f42142a.first_name);
        this.f21916e.setText(ta1Var.f42143b);
        this.f21915c.setVisibility(8);
        this.d.setVisibility(8);
        this.f21917f.setVisibility(8);
    }

    public void setImageViewAction(View.OnClickListener onClickListener) {
        this.f21913a.setOnClickListener(onClickListener);
    }
}
