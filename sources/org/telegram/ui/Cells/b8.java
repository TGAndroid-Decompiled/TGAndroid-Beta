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
import org.telegram.messenger.sl;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.yq;
import org.telegram.ui.n91;
import org.telegram.ui.r91;
public abstract class b8 extends FrameLayout {
    public final z7 f22144a;
    public final a8 f22145b;
    public final TextView f22146c;
    public final TextView d;
    public final TextView e;
    public final TextView f22147f;
    public final Paint h;
    public final org.telegram.ui.Components.h9 f22148n;
    public final ci.x7 f22149r;
    public final org.telegram.ui.ActionBar.g6 f22150s;
    public r91 v;
    public final TLRPC.ChatFull f22151w;
    public boolean f22152x;

    public b8(Context context, TLRPC.ChatFull chatFull, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        int i10;
        float f7;
        float f10;
        int i11;
        float f11;
        float f12;
        this.h = new Paint(1);
        this.f22148n = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.g6) null);
        this.f22149r = new ci.x7(null, false);
        this.f22151w = chatFull;
        this.f22150s = g6Var;
        z7 z7Var = new z7(this, context, g6Var);
        this.f22144a = z7Var;
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
        LinearLayout e = sl.e(context, 0);
        ?? n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.f22145b = n5Var;
        NotificationCenter.listenEmojiLoading(n5Var);
        n5Var.setTypeface(AndroidUtilities.bold());
        n5Var.setTextSize(16);
        n5Var.setMaxLines(1);
        n5Var.setTextColor(-16777216);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        n5Var.setGravity(i11);
        TextView textView = new TextView(context);
        this.f22146c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-16777216);
        if (!LocaleController.isRTL) {
            e.addView((View) n5Var, w7.z5.p(0, -2, 1.0f, 0, 0, 0, 16, 0));
            e.addView(textView, w7.z5.q(-2, -2, 80));
        } else {
            e.addView(textView, w7.z5.q(-2, -2, 80));
            e.addView((View) n5Var, w7.z5.p(0, -2, 1.0f, 0, 16, 0, 0, 0));
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
        this.f22147f = textView4;
        textView4.setTextSize(1, 13.0f);
        textView4.setTextColor(-16777216);
        textView4.setGravity(16);
        LinearLayout e7 = sl.e(context, 0);
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
        int i13 = org.telegram.ui.ActionBar.k6.f21289j5;
        org.telegram.ui.ActionBar.r6.Z(n5Var, i13, null);
        org.telegram.ui.ActionBar.r6.W(textView, i13, null);
        int i14 = org.telegram.ui.ActionBar.k6.A6;
        org.telegram.ui.ActionBar.r6.W(textView2, i14, null);
        org.telegram.ui.ActionBar.r6.W(textView3, i14, null);
        org.telegram.ui.ActionBar.r6.W(textView4, i14, null);
        Drawable mutate = context.getDrawable(R.drawable.mini_stats_likes).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.r6.z(textView4, mutate, i14, null, mode);
        Drawable mutate2 = context.getDrawable(R.drawable.mini_stats_shares).mutate();
        org.telegram.ui.ActionBar.r6.z(textView3, mutate2, i14, null, mode);
        yq yqVar = new yq(null, mutate, 0, AndroidUtilities.dp(1.0f));
        int intrinsicWidth = mutate2.getIntrinsicWidth();
        int intrinsicHeight = mutate2.getIntrinsicHeight();
        yqVar.h = intrinsicWidth;
        yqVar.f33016n = intrinsicHeight;
        textView4.setCompoundDrawablesWithIntrinsicBounds(yqVar, (Drawable) null, (Drawable) null, (Drawable) null);
        textView4.setCompoundDrawablePadding(AndroidUtilities.dp(2.0f));
        yq yqVar2 = new yq(null, mutate2, 0, AndroidUtilities.dp(1.0f));
        int intrinsicWidth2 = mutate2.getIntrinsicWidth();
        int intrinsicHeight2 = mutate2.getIntrinsicHeight();
        yqVar2.h = intrinsicWidth2;
        yqVar2.f33016n = intrinsicHeight2;
        textView3.setCompoundDrawablesWithIntrinsicBounds(yqVar2, (Drawable) null, (Drawable) null, (Drawable) null);
        textView3.setCompoundDrawablePadding(AndroidUtilities.dp(2.0f));
        setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f22152x) {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21184d7, this.f22150s);
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
        return this.f22144a;
    }

    public r91 getPostInfo() {
        return this.v;
    }

    public ci.x7 getStoryAvatarParams() {
        return this.f22149r;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f22149r.g();
    }

    public void setData(n91 n91Var) {
        TLRPC.User user = n91Var.f39831a;
        org.telegram.ui.Components.h9 h9Var = this.f22148n;
        h9Var.r(user);
        TLRPC.User user2 = n91Var.f39831a;
        z7 z7Var = this.f22144a;
        z7Var.e(user2, h9Var);
        z7Var.setRoundRadius(AndroidUtilities.dp(46.0f) >> 1);
        this.f22145b.k(n91Var.f39831a.first_name);
        this.e.setText(n91Var.f39832b);
        this.f22146c.setVisibility(8);
        this.d.setVisibility(8);
        this.f22147f.setVisibility(8);
    }

    public void setImageViewAction(View.OnClickListener onClickListener) {
        this.f22144a.setOnClickListener(onClickListener);
    }
}
