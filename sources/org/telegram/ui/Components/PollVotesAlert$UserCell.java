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
    public final wg0 C;
    public final p9 f23053a;
    public final org.telegram.ui.ActionBar.k5 f23054b;
    public final TextView f23055c;
    public final TextView d;
    public final z8 e;
    public final lw0 f23056f;
    public TLRPC.User h;
    public TLRPC.Chat f23057n;
    public CharSequence f23058r;
    public final int f23059s;
    public boolean v;
    public int f23060w;
    public boolean f23061x;
    public float f23062y;

    public PollVotesAlert$UserCell(wg0 wg0Var, Context context) {
        super(context);
        this.C = wg0Var;
        this.f23059s = UserConfig.selectedAccount;
        this.f23062y = 1.0f;
        setOrientation(0);
        setLayoutDirection(3);
        setWillNotDraw(false);
        setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        this.e = new z8((org.telegram.ui.ActionBar.f6) null);
        p9 p9Var = new p9(context);
        this.f23053a = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(18.0f));
        addView(p9Var, k7.b6.t(34, 34, 16, 0, 0, 11, 0));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.f23054b = k5Var;
        int i10 = org.telegram.ui.ActionBar.j6.f19987j5;
        k5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        k5Var.setTypeface(AndroidUtilities.bold());
        k5Var.setTextSize(16);
        k5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        addView(k5Var, k7.b6.p(0, 24, 1.0f, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f23055c = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20131r5, false));
        textView.setTextSize(1, 13.0f);
        addView(textView, k7.b6.p(-2, -2, 0.0f, 21, 4, 0, 2, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        textView2.setTextSize(1, 13.0f);
        addView(textView2, k7.b6.p(-2, -2, 0.0f, 21, 2, 0, 4, 0));
        this.f23056f = new lw0(20, k5Var);
    }

    public float getPlaceholderAlpha() {
        return this.f23062y;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f23056f.f26889a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f23056f.f26889a.b();
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
        if (this.f23061x || this.f23062y != 0.0f) {
            wg0 wg0Var = this.C;
            wg0Var.D.setAlpha((int) (this.f23062y * 255.0f));
            p9 p9Var = this.f23053a;
            canvas.drawCircle((p9Var.getMeasuredWidth() / 2) + p9Var.getLeft(), (p9Var.getMeasuredHeight() / 2) + p9Var.getTop(), p9Var.getMeasuredWidth() / 2, wg0Var.D);
            if (this.f23060w % 2 == 0) {
                dp = AndroidUtilities.dp(65.0f);
                dp2 = AndroidUtilities.dp(48.0f);
            } else {
                dp = AndroidUtilities.dp(65.0f);
                dp2 = AndroidUtilities.dp(60.0f);
            }
            if (LocaleController.isRTL) {
                dp = (getMeasuredWidth() - dp) - dp2;
            }
            wg0Var.J.set(dp, measuredHeight - AndroidUtilities.dp(4.0f), dp + dp2, AndroidUtilities.dp(4.0f) + measuredHeight);
            canvas.drawRoundRect(wg0Var.J, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), wg0Var.D);
            if (this.f23060w % 2 == 0) {
                dp3 = AndroidUtilities.dp(119.0f);
                dp4 = AndroidUtilities.dp(60.0f);
            } else {
                dp3 = AndroidUtilities.dp(131.0f);
                dp4 = AndroidUtilities.dp(80.0f);
            }
            if (LocaleController.isRTL) {
                dp3 = (getMeasuredWidth() - dp3) - dp4;
            }
            wg0Var.J.set(dp3, measuredHeight - AndroidUtilities.dp(4.0f), dp3 + dp4, AndroidUtilities.dp(4.0f) + measuredHeight);
            canvas.drawRoundRect(wg0Var.J, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), wg0Var.D);
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
            canvas.drawLine(dp5, measuredHeight2, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f20000k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f) + (this.v ? 1 : 0), 1073741824));
    }

    public void setPlaceholderAlpha(float f10) {
        this.f23062y = f10;
        invalidate();
    }
}
