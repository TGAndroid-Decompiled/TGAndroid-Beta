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
    public ArrayList A;
    public final ag0 B;
    public final o9 f26435a;
    public final org.telegram.ui.ActionBar.h5 f26436b;
    public final TextView f26437c;
    public final TextView d;
    public final z8 f26438e;
    public final sv0 f26439f;
    public TLRPC.User h;
    public TLRPC.Chat f26440n;
    public CharSequence f26441r;
    public final int f26442s;
    public boolean v;
    public int f26443w;
    public boolean f26444x;
    public float f26445y;

    public PollVotesAlert$UserCell(ag0 ag0Var, Context context) {
        super(context);
        this.B = ag0Var;
        this.f26442s = UserConfig.selectedAccount;
        this.f26445y = 1.0f;
        setOrientation(0);
        setLayoutDirection(3);
        setWillNotDraw(false);
        setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        this.f26438e = new z8((org.telegram.ui.ActionBar.b6) null);
        o9 o9Var = new o9(context);
        this.f26435a = o9Var;
        o9Var.setRoundRadius(AndroidUtilities.dp(18.0f));
        addView(o9Var, g7.e6.t(34, 34, 16, 0, 0, 11, 0));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f26436b = h5Var;
        int i9 = org.telegram.ui.ActionBar.f6.f23108j5;
        h5Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        h5Var.setTypeface(AndroidUtilities.bold());
        h5Var.setTextSize(16);
        h5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        addView(h5Var, g7.e6.p(0, 24, 1.0f, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f26437c = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23247r5, false));
        textView.setTextSize(1, 13.0f);
        addView(textView, g7.e6.p(-2, -2, 0.0f, 21, 4, 0, 2, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        textView2.setTextSize(1, 13.0f);
        addView(textView2, g7.e6.p(-2, -2, 0.0f, 21, 2, 0, 4, 0));
        this.f26439f = new sv0(20, h5Var);
    }

    public float getPlaceholderAlpha() {
        return this.f26445y;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f26439f.f32559a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f26439f.f32559a.b();
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
        int i9;
        if (this.f26444x || this.f26445y != 0.0f) {
            ag0 ag0Var = this.B;
            ag0Var.C.setAlpha((int) (this.f26445y * 255.0f));
            o9 o9Var = this.f26435a;
            canvas.drawCircle((o9Var.getMeasuredWidth() / 2) + o9Var.getLeft(), (o9Var.getMeasuredHeight() / 2) + o9Var.getTop(), o9Var.getMeasuredWidth() / 2, ag0Var.C);
            if (this.f26443w % 2 == 0) {
                dp = AndroidUtilities.dp(65.0f);
                dp2 = AndroidUtilities.dp(48.0f);
            } else {
                dp = AndroidUtilities.dp(65.0f);
                dp2 = AndroidUtilities.dp(60.0f);
            }
            if (LocaleController.isRTL) {
                dp = (getMeasuredWidth() - dp) - dp2;
            }
            ag0Var.I.set(dp, measuredHeight - AndroidUtilities.dp(4.0f), dp + dp2, AndroidUtilities.dp(4.0f) + measuredHeight);
            canvas.drawRoundRect(ag0Var.I, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), ag0Var.C);
            if (this.f26443w % 2 == 0) {
                dp3 = AndroidUtilities.dp(119.0f);
                dp4 = AndroidUtilities.dp(60.0f);
            } else {
                dp3 = AndroidUtilities.dp(131.0f);
                dp4 = AndroidUtilities.dp(80.0f);
            }
            if (LocaleController.isRTL) {
                dp3 = (getMeasuredWidth() - dp3) - dp4;
            }
            ag0Var.I.set(dp3, measuredHeight - AndroidUtilities.dp(4.0f), dp3 + dp4, AndroidUtilities.dp(4.0f) + measuredHeight);
            canvas.drawRoundRect(ag0Var.I, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), ag0Var.C);
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
                i9 = AndroidUtilities.dp(64.0f);
            } else {
                i9 = 0;
            }
            canvas.drawLine(dp5, measuredHeight2, measuredWidth - i9, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.f6.f23121k0);
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f) + (this.v ? 1 : 0), 1073741824));
    }

    public void setPlaceholderAlpha(float f10) {
        this.f26445y = f10;
        invalidate();
    }
}
