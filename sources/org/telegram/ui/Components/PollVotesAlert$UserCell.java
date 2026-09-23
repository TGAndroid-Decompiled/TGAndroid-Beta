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
    public final qg0 F;
    public final w9 f22061a;
    public final org.telegram.ui.ActionBar.i5 f22062b;
    public final TextView f22063c;
    public final TextView d;
    public final h9 e;
    public final kw0 f22064f;
    public TLRPC.User h;
    public TLRPC.Chat f22065n;
    public CharSequence f22066r;
    public final int f22067s;
    public boolean v;
    public int f22068w;
    public boolean f22069x;
    public float f22070y;

    public PollVotesAlert$UserCell(qg0 qg0Var, Context context) {
        super(context);
        this.F = qg0Var;
        this.f22067s = UserConfig.selectedAccount;
        this.f22070y = 1.0f;
        setOrientation(0);
        setLayoutDirection(3);
        setWillNotDraw(false);
        setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        this.e = new h9((org.telegram.ui.ActionBar.d6) null);
        w9 w9Var = new w9(context);
        this.f22061a = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(18.0f));
        addView(w9Var, w7.x5.t(34, 34, 16, 0, 0, 11, 0));
        org.telegram.ui.ActionBar.i5 i5Var = new org.telegram.ui.ActionBar.i5(context);
        this.f22062b = i5Var;
        int i10 = org.telegram.ui.ActionBar.h6.f18895j5;
        i5Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
        i5Var.setTypeface(AndroidUtilities.bold());
        i5Var.setTextSize(16);
        i5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        addView(i5Var, w7.x5.p(0, 24, 1.0f, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f22063c = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19043r5, false));
        textView.setTextSize(1, 13.0f);
        addView(textView, w7.x5.p(-2, -2, 0.0f, 21, 4, 0, 2, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
        textView2.setTextSize(1, 13.0f);
        addView(textView2, w7.x5.p(-2, -2, 0.0f, 21, 2, 0, 4, 0));
        this.f22064f = new kw0(20, i5Var);
    }

    public float getPlaceholderAlpha() {
        return this.f22070y;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f22064f.f25712a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f22064f.f25712a.b();
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
        if (this.f22069x || this.f22070y != 0.0f) {
            qg0 qg0Var = this.F;
            qg0Var.G.setAlpha((int) (this.f22070y * 255.0f));
            w9 w9Var = this.f22061a;
            canvas.drawCircle((w9Var.getMeasuredWidth() / 2) + w9Var.getLeft(), (w9Var.getMeasuredHeight() / 2) + w9Var.getTop(), w9Var.getMeasuredWidth() / 2, qg0Var.G);
            if (this.f22068w % 2 == 0) {
                dp = AndroidUtilities.dp(65.0f);
                dp2 = AndroidUtilities.dp(48.0f);
            } else {
                dp = AndroidUtilities.dp(65.0f);
                dp2 = AndroidUtilities.dp(60.0f);
            }
            if (LocaleController.isRTL) {
                dp = (getMeasuredWidth() - dp) - dp2;
            }
            qg0Var.M.set(dp, measuredHeight - AndroidUtilities.dp(4.0f), dp + dp2, AndroidUtilities.dp(4.0f) + measuredHeight);
            canvas.drawRoundRect(qg0Var.M, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), qg0Var.G);
            if (this.f22068w % 2 == 0) {
                dp3 = AndroidUtilities.dp(119.0f);
                dp4 = AndroidUtilities.dp(60.0f);
            } else {
                dp3 = AndroidUtilities.dp(131.0f);
                dp4 = AndroidUtilities.dp(80.0f);
            }
            if (LocaleController.isRTL) {
                dp3 = (getMeasuredWidth() - dp3) - dp4;
            }
            qg0Var.M.set(dp3, measuredHeight - AndroidUtilities.dp(4.0f), dp3 + dp4, AndroidUtilities.dp(4.0f) + measuredHeight);
            canvas.drawRoundRect(qg0Var.M, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), qg0Var.G);
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
            canvas.drawLine(dp5, measuredHeight2, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.h6.f18910k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f) + (this.v ? 1 : 0), 1073741824));
    }

    public void setPlaceholderAlpha(float f7) {
        this.f22070y = f7;
        invalidate();
    }
}
