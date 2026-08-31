package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public class PollVotesAlert$UserCell extends LinearLayout {
    public ArrayList B;
    public final xg0 C;
    public final p9 f24932a;
    public final org.telegram.ui.ActionBar.l5 f24933b;
    public final TextView f24934c;
    public final TextView d;
    public final z8 f24935e;
    public final mw0 f24936f;
    public TLRPC.User h;
    public TLRPC.Chat f24937n;
    public CharSequence f24938r;
    public final int f24939s;
    public boolean v;
    public int f24940w;
    public boolean f24941x;
    public float f24942y;

    public PollVotesAlert$UserCell(xg0 xg0Var, Context context) {
        super(context);
        this.C = xg0Var;
        this.f24939s = UserConfig.selectedAccount;
        this.f24942y = 1.0f;
        setOrientation(0);
        setLayoutDirection(3);
        setWillNotDraw(false);
        setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        this.f24935e = new z8((org.telegram.ui.ActionBar.g6) null);
        p9 p9Var = new p9(context);
        this.f24932a = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(18.0f));
        addView(p9Var, k7.c6.t(34, 34, 16, 0, 0, 11, 0));
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.f24933b = l5Var;
        int i10 = org.telegram.ui.ActionBar.k6.f21766j5;
        l5Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i10, false));
        l5Var.setTypeface(AndroidUtilities.bold());
        l5Var.setTextSize(16);
        l5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        addView(l5Var, k7.c6.p(0, 24, 1.0f, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f24934c = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21911r5, false));
        textView.setTextSize(1, 13.0f);
        addView(textView, k7.c6.p(-2, -2, 0.0f, 21, 4, 0, 2, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i10, false));
        textView2.setTextSize(1, 13.0f);
        addView(textView2, k7.c6.p(-2, -2, 0.0f, 21, 2, 0, 4, 0));
        this.f24936f = new mw0(20, l5Var);
    }

    public float getPlaceholderAlpha() {
        return this.f24942y;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f24936f.f29258a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f24936f.f29258a.b();
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int measuredHeight;
        int dp;
        int dp2;
        int dp3;
        int dp4;
        float dp5;
        int i10;
        if (this.f24941x || this.f24942y != 0.0f) {
            xg0 xg0Var = this.C;
            xg0Var.D.setAlpha((int) (this.f24942y * 255.0f));
            p9 p9Var = this.f24932a;
            canvas.drawCircle((p9Var.getMeasuredWidth() / 2) + p9Var.getLeft(), (p9Var.getMeasuredHeight() / 2) + p9Var.getTop(), p9Var.getMeasuredWidth() / 2, xg0Var.D);
            if (this.f24940w % 2 == 0) {
                dp = AndroidUtilities.dp(65.0f);
                dp2 = AndroidUtilities.dp(48.0f);
            } else {
                dp = AndroidUtilities.dp(65.0f);
                dp2 = AndroidUtilities.dp(60.0f);
            }
            if (LocaleController.isRTL) {
                dp = (getMeasuredWidth() - dp) - dp2;
            }
            xg0Var.J.set(dp, measuredHeight - AndroidUtilities.dp(4.0f), dp + dp2, AndroidUtilities.dp(4.0f) + measuredHeight);
            canvas.drawRoundRect(xg0Var.J, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), xg0Var.D);
            if (this.f24940w % 2 == 0) {
                dp3 = AndroidUtilities.dp(119.0f);
                dp4 = AndroidUtilities.dp(60.0f);
            } else {
                dp3 = AndroidUtilities.dp(131.0f);
                dp4 = AndroidUtilities.dp(80.0f);
            }
            if (LocaleController.isRTL) {
                dp3 = (getMeasuredWidth() - dp3) - dp4;
            }
            xg0Var.J.set(dp3, measuredHeight - AndroidUtilities.dp(4.0f), dp3 + dp4, AndroidUtilities.dp(4.0f) + measuredHeight);
            canvas.drawRoundRect(xg0Var.J, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), xg0Var.D);
        }
        if (this.v) {
            if (LocaleController.isRTL) {
                dp5 = 0.0f;
            } else {
                dp5 = AndroidUtilities.dp(64.0f);
            }
            float measuredHeight2 = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i10 = AndroidUtilities.dp(64.0f);
            } else {
                i10 = 0;
            }
            canvas.drawLine(dp5, measuredHeight2, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f21779k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f) + (this.v ? 1 : 0), 1073741824));
    }

    public void setPlaceholderAlpha(float f10) {
        this.f24942y = f10;
        invalidate();
    }
}
