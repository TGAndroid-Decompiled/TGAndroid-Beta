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
    public final wh0 F;
    public final y9 f24001a;
    public final org.telegram.ui.ActionBar.h5 f24002b;
    public final TextView f24003c;
    public final TextView d;
    public final j9 f24004e;
    public final tx0 f24005f;
    public TLRPC.User h;
    public TLRPC.Chat f24006n;
    public CharSequence f24007r;
    public final int f24008s;
    public boolean v;
    public int f24009w;
    public boolean f24010x;
    public float f24011y;

    public PollVotesAlert$UserCell(wh0 wh0Var, Context context) {
        super(context);
        this.F = wh0Var;
        this.f24008s = UserConfig.selectedAccount;
        this.f24011y = 1.0f;
        setOrientation(0);
        setLayoutDirection(3);
        setWillNotDraw(false);
        setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        this.f24004e = new j9((org.telegram.ui.ActionBar.c6) null);
        y9 y9Var = new y9(context);
        this.f24001a = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(18.0f));
        addView(y9Var, w7.w5.t(34, 34, 16, 0, 0, 11, 0));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f24002b = h5Var;
        int i10 = org.telegram.ui.ActionBar.h6.f20668j5;
        h5Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        h5Var.setTypeface(AndroidUtilities.bold());
        h5Var.setTextSize(16);
        h5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        addView(h5Var, w7.w5.p(0, 24, 1.0f, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f24003c = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20818r5, false));
        textView.setTextSize(1, 13.0f);
        addView(textView, w7.w5.p(-2, -2, 0.0f, 21, 4, 0, 2, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        textView2.setTextSize(1, 13.0f);
        addView(textView2, w7.w5.p(-2, -2, 0.0f, 21, 2, 0, 4, 0));
        this.f24005f = new tx0(20, h5Var);
    }

    public float getPlaceholderAlpha() {
        return this.f24011y;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f24005f.f30988a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f24005f.f30988a.b();
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
        if (this.f24010x || this.f24011y != 0.0f) {
            wh0 wh0Var = this.F;
            wh0Var.G.setAlpha((int) (this.f24011y * 255.0f));
            y9 y9Var = this.f24001a;
            canvas.drawCircle((y9Var.getMeasuredWidth() / 2) + y9Var.getLeft(), (y9Var.getMeasuredHeight() / 2) + y9Var.getTop(), y9Var.getMeasuredWidth() / 2, wh0Var.G);
            if (this.f24009w % 2 == 0) {
                dp = AndroidUtilities.dp(65.0f);
                dp2 = AndroidUtilities.dp(48.0f);
            } else {
                dp = AndroidUtilities.dp(65.0f);
                dp2 = AndroidUtilities.dp(60.0f);
            }
            if (LocaleController.isRTL) {
                dp = (getMeasuredWidth() - dp) - dp2;
            }
            wh0Var.M.set(dp, measuredHeight - AndroidUtilities.dp(4.0f), dp + dp2, AndroidUtilities.dp(4.0f) + measuredHeight);
            canvas.drawRoundRect(wh0Var.M, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), wh0Var.G);
            if (this.f24009w % 2 == 0) {
                dp3 = AndroidUtilities.dp(119.0f);
                dp4 = AndroidUtilities.dp(60.0f);
            } else {
                dp3 = AndroidUtilities.dp(131.0f);
                dp4 = AndroidUtilities.dp(80.0f);
            }
            if (LocaleController.isRTL) {
                dp3 = (getMeasuredWidth() - dp3) - dp4;
            }
            wh0Var.M.set(dp3, measuredHeight - AndroidUtilities.dp(4.0f), dp3 + dp4, AndroidUtilities.dp(4.0f) + measuredHeight);
            canvas.drawRoundRect(wh0Var.M, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), wh0Var.G);
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
            canvas.drawLine(f10, measuredHeight2, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.h6.f20682k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f) + (this.v ? 1 : 0), 1073741824));
    }

    public void setPlaceholderAlpha(float f7) {
        this.f24011y = f7;
        invalidate();
    }
}
