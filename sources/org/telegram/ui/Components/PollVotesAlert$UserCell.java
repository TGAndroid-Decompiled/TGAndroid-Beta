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
    public ArrayList E;
    public final sh0 F;
    public final y9 f24223a;
    public final org.telegram.ui.ActionBar.j5 f24224b;
    public final TextView f24225c;
    public final TextView d;
    public final j9 f24226e;
    public final nx0 f24227f;
    public TLRPC.User h;
    public TLRPC.Chat f24228n;
    public CharSequence f24229r;
    public final int f24230s;
    public boolean v;
    public int f24231w;
    public boolean f24232x;
    public float f24233y;

    public PollVotesAlert$UserCell(sh0 sh0Var, Context context) {
        super(context);
        this.F = sh0Var;
        this.f24230s = UserConfig.selectedAccount;
        this.f24233y = 1.0f;
        setOrientation(0);
        setLayoutDirection(3);
        setWillNotDraw(false);
        setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        this.f24226e = new j9((org.telegram.ui.ActionBar.e6) null);
        y9 y9Var = new y9(context);
        this.f24223a = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(18.0f));
        addView(y9Var, w7.x5.t(34, 34, 16, 0, 0, 11, 0));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.f24224b = j5Var;
        int i10 = org.telegram.ui.ActionBar.i6.f20905j5;
        j5Var.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i10, false));
        j5Var.setTypeface(AndroidUtilities.bold());
        j5Var.setTextSize(16);
        j5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        addView(j5Var, w7.x5.p(0, 24, 1.0f, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f24225c = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21054r5, false));
        textView.setTextSize(1, 13.0f);
        addView(textView, w7.x5.p(-2, -2, 0.0f, 21, 4, 0, 2, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i10, false));
        textView2.setTextSize(1, 13.0f);
        addView(textView2, w7.x5.p(-2, -2, 0.0f, 21, 2, 0, 4, 0));
        this.f24227f = new nx0(20, j5Var);
    }

    public float getPlaceholderAlpha() {
        return this.f24233y;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f24227f.f29298a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f24227f.f29298a.b();
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int measuredHeight;
        int dp;
        int dp2;
        int dp3;
        int dp4;
        int i10;
        float f7 = 0.0f;
        if (this.f24232x || this.f24233y != 0.0f) {
            sh0 sh0Var = this.F;
            sh0Var.G.setAlpha((int) (this.f24233y * 255.0f));
            y9 y9Var = this.f24223a;
            canvas.drawCircle((y9Var.getMeasuredWidth() / 2) + y9Var.getLeft(), (y9Var.getMeasuredHeight() / 2) + y9Var.getTop(), y9Var.getMeasuredWidth() / 2, sh0Var.G);
            if (this.f24231w % 2 == 0) {
                dp = AndroidUtilities.dp(65.0f);
                dp2 = AndroidUtilities.dp(48.0f);
            } else {
                dp = AndroidUtilities.dp(65.0f);
                dp2 = AndroidUtilities.dp(60.0f);
            }
            if (LocaleController.isRTL) {
                dp = (getMeasuredWidth() - dp) - dp2;
            }
            sh0Var.M.set(dp, measuredHeight - AndroidUtilities.dp(4.0f), dp + dp2, AndroidUtilities.dp(4.0f) + measuredHeight);
            canvas.drawRoundRect(sh0Var.M, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), sh0Var.G);
            if (this.f24231w % 2 == 0) {
                dp3 = AndroidUtilities.dp(119.0f);
                dp4 = AndroidUtilities.dp(60.0f);
            } else {
                dp3 = AndroidUtilities.dp(131.0f);
                dp4 = AndroidUtilities.dp(80.0f);
            }
            if (LocaleController.isRTL) {
                dp3 = (getMeasuredWidth() - dp3) - dp4;
            }
            sh0Var.M.set(dp3, measuredHeight - AndroidUtilities.dp(4.0f), dp3 + dp4, AndroidUtilities.dp(4.0f) + measuredHeight);
            canvas.drawRoundRect(sh0Var.M, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), sh0Var.G);
        }
        if (this.v) {
            if (!LocaleController.isRTL) {
                f7 = AndroidUtilities.dp(64.0f);
            }
            float f10 = f7;
            float measuredHeight2 = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i10 = AndroidUtilities.dp(64.0f);
            } else {
                i10 = 0;
            }
            canvas.drawLine(f10, measuredHeight2, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.i6.f20919k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f) + (this.v ? 1 : 0), 1073741824));
    }

    public void setPlaceholderAlpha(float f7) {
        this.f24233y = f7;
        invalidate();
    }
}
