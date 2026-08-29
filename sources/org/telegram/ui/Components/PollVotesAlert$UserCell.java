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
    public final lg0 B;
    public final t9 f26446a;
    public final org.telegram.ui.ActionBar.h5 f26447b;
    public final TextView f26448c;
    public final TextView d;
    public final e9 f26449e;
    public final cw0 f26450f;
    public TLRPC.User h;
    public TLRPC.Chat f26451n;
    public CharSequence f26452r;
    public final int f26453s;
    public boolean v;
    public int f26454w;
    public boolean f26455x;
    public float f26456y;

    public PollVotesAlert$UserCell(lg0 lg0Var, Context context) {
        super(context);
        this.B = lg0Var;
        this.f26453s = UserConfig.selectedAccount;
        this.f26456y = 1.0f;
        setOrientation(0);
        setLayoutDirection(3);
        setWillNotDraw(false);
        setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        this.f26449e = new e9((org.telegram.ui.ActionBar.c6) null);
        t9 t9Var = new t9(context);
        this.f26446a = t9Var;
        t9Var.setRoundRadius(AndroidUtilities.dp(18.0f));
        addView(t9Var, i7.f6.t(34, 34, 16, 0, 0, 11, 0));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f26447b = h5Var;
        int i10 = org.telegram.ui.ActionBar.g6.f23169j5;
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        h5Var.setTypeface(AndroidUtilities.bold());
        h5Var.setTextSize(16);
        h5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        addView(h5Var, i7.f6.p(0, 24, 1.0f, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f26448c = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23310r5, false));
        textView.setTextSize(1, 13.0f);
        addView(textView, i7.f6.p(-2, -2, 0.0f, 21, 4, 0, 2, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        textView2.setTextSize(1, 13.0f);
        addView(textView2, i7.f6.p(-2, -2, 0.0f, 21, 2, 0, 4, 0));
        this.f26450f = new cw0(20, h5Var);
    }

    public float getPlaceholderAlpha() {
        return this.f26456y;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f26450f.f27580a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f26450f.f27580a.b();
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
        if (this.f26455x || this.f26456y != 0.0f) {
            lg0 lg0Var = this.B;
            lg0Var.C.setAlpha((int) (this.f26456y * 255.0f));
            t9 t9Var = this.f26446a;
            canvas.drawCircle((t9Var.getMeasuredWidth() / 2) + t9Var.getLeft(), (t9Var.getMeasuredHeight() / 2) + t9Var.getTop(), t9Var.getMeasuredWidth() / 2, lg0Var.C);
            if (this.f26454w % 2 == 0) {
                dp = AndroidUtilities.dp(65.0f);
                dp2 = AndroidUtilities.dp(48.0f);
            } else {
                dp = AndroidUtilities.dp(65.0f);
                dp2 = AndroidUtilities.dp(60.0f);
            }
            if (LocaleController.isRTL) {
                dp = (getMeasuredWidth() - dp) - dp2;
            }
            lg0Var.I.set(dp, measuredHeight - AndroidUtilities.dp(4.0f), dp + dp2, AndroidUtilities.dp(4.0f) + measuredHeight);
            canvas.drawRoundRect(lg0Var.I, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), lg0Var.C);
            if (this.f26454w % 2 == 0) {
                dp3 = AndroidUtilities.dp(119.0f);
                dp4 = AndroidUtilities.dp(60.0f);
            } else {
                dp3 = AndroidUtilities.dp(131.0f);
                dp4 = AndroidUtilities.dp(80.0f);
            }
            if (LocaleController.isRTL) {
                dp3 = (getMeasuredWidth() - dp3) - dp4;
            }
            lg0Var.I.set(dp3, measuredHeight - AndroidUtilities.dp(4.0f), dp3 + dp4, AndroidUtilities.dp(4.0f) + measuredHeight);
            canvas.drawRoundRect(lg0Var.I, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), lg0Var.C);
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
            canvas.drawLine(dp5, measuredHeight2, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.g6.f23183k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f) + (this.v ? 1 : 0), 1073741824));
    }

    public void setPlaceholderAlpha(float f9) {
        this.f26456y = f9;
        invalidate();
    }
}
