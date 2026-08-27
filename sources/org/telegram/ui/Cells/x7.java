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
import org.telegram.ui.Components.dq;
import org.telegram.ui.j91;
import org.telegram.ui.n91;

public abstract class x7 extends FrameLayout {

    public final v7 f25938a;

    public final w7 f25939b;

    public final TextView f25940c;
    public final TextView d;

    public final TextView f25941e;

    public final TextView f25942f;
    public final Paint h;

    public final org.telegram.ui.Components.y8 f25943n;

    public final jh.h7 f25944r;

    public final org.telegram.ui.ActionBar.c6 f25945s;
    public n91 v;

    public final TLRPC.ChatFull f25946w;

    public boolean f25947x;

    public x7(Context context, TLRPC.ChatFull chatFull, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.h = new Paint(1);
        this.f25943n = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
        this.f25944r = new jh.h7(null, false);
        this.f25946w = chatFull;
        this.f25945s = c6Var;
        v7 v7Var = new v7(this, context, c6Var);
        this.f25938a = v7Var;
        setClipChildren(false);
        boolean z10 = LocaleController.isRTL;
        addView(v7Var, h7.z5.d(46, 46.0f, (!z10 ? 8388611 : 8388613) | 16, !z10 ? 12.0f : 16.0f, 0.0f, !z10 ? 16.0f : 12.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout linearLayoutG = org.telegram.messenger.y1.g(context, 0);
        w7 w7Var = new w7(context);
        this.f25939b = w7Var;
        NotificationCenter.listenEmojiLoading(w7Var);
        w7Var.setTypeface(AndroidUtilities.bold());
        w7Var.setTextSize(16);
        w7Var.setMaxLines(1);
        w7Var.setTextColor(-16777216);
        w7Var.setGravity(LocaleController.isRTL ? 5 : 3);
        TextView textView = new TextView(context);
        this.f25940c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-16777216);
        if (LocaleController.isRTL) {
            linearLayoutG.addView(textView, h7.z5.q(-2, -2, 80));
            linearLayoutG.addView(w7Var, h7.z5.p(0, -2, 1.0f, 0, 16, 0, 0, 0));
        } else {
            linearLayoutG.addView(w7Var, h7.z5.p(0, -2, 1.0f, 0, 0, 0, 16, 0));
            linearLayoutG.addView(textView, h7.z5.q(-2, -2, 80));
        }
        linearLayout.addView(linearLayoutG, h7.z5.d(-1, -2.0f, 8388659, 0.0f, 7.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f25941e = textView2;
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
        this.f25942f = textView4;
        textView4.setTextSize(1, 13.0f);
        textView4.setTextColor(-16777216);
        textView4.setGravity(16);
        LinearLayout linearLayoutG2 = org.telegram.messenger.y1.g(context, 0);
        if (LocaleController.isRTL) {
            linearLayoutG2.addView(textView3, h7.z5.t(-2, -2, 16, 0, 0, 10, 0));
            linearLayoutG2.addView(textView4, h7.z5.q(-2, -2, 16));
            linearLayoutG2.addView(textView2, h7.z5.p(0, -2, 1.0f, 0, 8, 0, 0, 0));
        } else {
            linearLayoutG2.addView(textView2, h7.z5.p(0, -2, 1.0f, 0, 0, 0, 8, 0));
            linearLayoutG2.addView(textView4, h7.z5.q(-2, -2, 16));
            linearLayoutG2.addView(textView3, h7.z5.t(-2, -2, 16, 10, 0, 0, 0));
        }
        linearLayout.addView(linearLayoutG2, h7.z5.d(-1, -2.0f, 8388659, 0.0f, 3.0f, 0.0f, 9.0f));
        boolean z11 = LocaleController.isRTL;
        addView(linearLayout, h7.z5.d(-1, -2.0f, 0, !z11 ? 72.0f : 18.0f, 0.0f, !z11 ? 18.0f : 72.0f, 0.0f));
        int i10 = org.telegram.ui.ActionBar.g6.f23161j5;
        w7Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        int i11 = org.telegram.ui.ActionBar.g6.A6;
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        textView4.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        Drawable drawableMutate = context.getDrawable(R.drawable.mini_stats_likes).mutate();
        drawableMutate.setTint(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        Drawable drawableMutate2 = context.getDrawable(R.drawable.mini_stats_shares).mutate();
        drawableMutate2.setTint(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        dq dqVar = new dq(null, drawableMutate, 0, AndroidUtilities.dp(1.0f));
        int intrinsicWidth = drawableMutate2.getIntrinsicWidth();
        int intrinsicHeight = drawableMutate2.getIntrinsicHeight();
        dqVar.h = intrinsicWidth;
        dqVar.f27825n = intrinsicHeight;
        textView4.setCompoundDrawablesWithIntrinsicBounds(dqVar, (Drawable) null, (Drawable) null, (Drawable) null);
        textView4.setCompoundDrawablePadding(AndroidUtilities.dp(2.0f));
        dq dqVar2 = new dq(null, drawableMutate2, 0, AndroidUtilities.dp(1.0f));
        int intrinsicWidth2 = drawableMutate2.getIntrinsicWidth();
        int intrinsicHeight2 = drawableMutate2.getIntrinsicHeight();
        dqVar2.h = intrinsicWidth2;
        dqVar2.f27825n = intrinsicHeight2;
        textView3.setCompoundDrawablesWithIntrinsicBounds(dqVar2, (Drawable) null, (Drawable) null, (Drawable) null);
        textView3.setCompoundDrawablePadding(AndroidUtilities.dp(2.0f));
        setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f25947x) {
            int iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23054d7, this.f25945s);
            Paint paint = this.h;
            paint.setColor(iV0);
            if (LocaleController.isRTL) {
                canvas.drawRect(0.0f, getHeight() - 1, getWidth() - AndroidUtilities.dp(72), getHeight(), paint);
            } else {
                canvas.drawRect(AndroidUtilities.dp(72), getHeight() - 1, getWidth(), getHeight(), paint);
            }
        }
    }

    public org.telegram.ui.Components.n9 getImageView() {
        return this.f25938a;
    }

    public n91 getPostInfo() {
        return this.v;
    }

    public jh.h7 getStoryAvatarParams() {
        return this.f25944r;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f25944r.g();
    }

    public void setData(j91 j91Var) {
        TLRPC.User user = j91Var.f39311a;
        org.telegram.ui.Components.y8 y8Var = this.f25943n;
        y8Var.r(user);
        TLRPC.User user2 = j91Var.f39311a;
        v7 v7Var = this.f25938a;
        v7Var.e(user2, y8Var);
        v7Var.setRoundRadius(AndroidUtilities.dp(46.0f) >> 1);
        this.f25939b.k(j91Var.f39311a.first_name);
        this.f25941e.setText(j91Var.f39312b);
        this.f25940c.setVisibility(8);
        this.d.setVisibility(8);
        this.f25942f.setVisibility(8);
    }

    public void setImageViewAction(View.OnClickListener onClickListener) {
        this.f25938a.setOnClickListener(onClickListener);
    }
}
