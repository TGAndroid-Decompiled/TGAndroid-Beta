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
    public final u9 f22100a;
    public final org.telegram.ui.ActionBar.k5 f22101b;
    public final TextView f22102c;
    public final TextView d;
    public final f9 e;
    public final lw0 f22103f;
    public TLRPC.User h;
    public TLRPC.Chat f22104n;
    public CharSequence f22105r;
    public final int f22106s;
    public boolean v;
    public int f22107w;
    public boolean f22108x;
    public float f22109y;

    public PollVotesAlert$UserCell(qg0 qg0Var, Context context) {
        super(context);
        this.F = qg0Var;
        this.f22106s = UserConfig.selectedAccount;
        this.f22109y = 1.0f;
        setOrientation(0);
        setLayoutDirection(3);
        setWillNotDraw(false);
        setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        this.e = new f9((org.telegram.ui.ActionBar.f6) null);
        u9 u9Var = new u9(context);
        this.f22100a = u9Var;
        u9Var.setRoundRadius(AndroidUtilities.dp(18.0f));
        addView(u9Var, w7.x5.t(34, 34, 16, 0, 0, 11, 0));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.f22101b = k5Var;
        int i10 = org.telegram.ui.ActionBar.j6.f18969j5;
        k5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        k5Var.setTypeface(AndroidUtilities.bold());
        k5Var.setTextSize(16);
        k5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        addView(k5Var, w7.x5.p(0, 24, 1.0f, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f22102c = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19117r5, false));
        textView.setTextSize(1, 13.0f);
        addView(textView, w7.x5.p(-2, -2, 0.0f, 21, 4, 0, 2, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        textView2.setTextSize(1, 13.0f);
        addView(textView2, w7.x5.p(-2, -2, 0.0f, 21, 2, 0, 4, 0));
        this.f22103f = new lw0(20, k5Var);
    }

    public float getPlaceholderAlpha() {
        return this.f22109y;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f22103f.f25980a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f22103f.f25980a.b();
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
        if (this.f22108x || this.f22109y != 0.0f) {
            qg0 qg0Var = this.F;
            qg0Var.G.setAlpha((int) (this.f22109y * 255.0f));
            u9 u9Var = this.f22100a;
            canvas.drawCircle((u9Var.getMeasuredWidth() / 2) + u9Var.getLeft(), (u9Var.getMeasuredHeight() / 2) + u9Var.getTop(), u9Var.getMeasuredWidth() / 2, qg0Var.G);
            if (this.f22107w % 2 == 0) {
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
            if (this.f22107w % 2 == 0) {
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
            canvas.drawLine(dp5, measuredHeight2, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f18984k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f) + (this.v ? 1 : 0), 1073741824));
    }

    public void setPlaceholderAlpha(float f7) {
        this.f22109y = f7;
        invalidate();
    }
}
