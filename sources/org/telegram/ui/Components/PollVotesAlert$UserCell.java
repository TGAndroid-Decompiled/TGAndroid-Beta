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
    public final pg0 F;
    public final u9 f22090a;
    public final org.telegram.ui.ActionBar.j5 f22091b;
    public final TextView f22092c;
    public final TextView d;
    public final f9 e;
    public final kw0 f22093f;
    public TLRPC.User h;
    public TLRPC.Chat f22094n;
    public CharSequence f22095r;
    public final int f22096s;
    public boolean v;
    public int f22097w;
    public boolean f22098x;
    public float f22099y;

    public PollVotesAlert$UserCell(pg0 pg0Var, Context context) {
        super(context);
        this.F = pg0Var;
        this.f22096s = UserConfig.selectedAccount;
        this.f22099y = 1.0f;
        setOrientation(0);
        setLayoutDirection(3);
        setWillNotDraw(false);
        setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        this.e = new f9((org.telegram.ui.ActionBar.e6) null);
        u9 u9Var = new u9(context);
        this.f22090a = u9Var;
        u9Var.setRoundRadius(AndroidUtilities.dp(18.0f));
        addView(u9Var, w7.x5.t(34, 34, 16, 0, 0, 11, 0));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.f22091b = j5Var;
        int i10 = org.telegram.ui.ActionBar.i6.f18943j5;
        j5Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
        j5Var.setTypeface(AndroidUtilities.bold());
        j5Var.setTextSize(16);
        j5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        addView(j5Var, w7.x5.p(0, 24, 1.0f, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f22092c = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19091r5, false));
        textView.setTextSize(1, 13.0f);
        addView(textView, w7.x5.p(-2, -2, 0.0f, 21, 4, 0, 2, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
        textView2.setTextSize(1, 13.0f);
        addView(textView2, w7.x5.p(-2, -2, 0.0f, 21, 2, 0, 4, 0));
        this.f22093f = new kw0(20, j5Var);
    }

    public float getPlaceholderAlpha() {
        return this.f22099y;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f22093f.f25689a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f22093f.f25689a.b();
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
        if (this.f22098x || this.f22099y != 0.0f) {
            pg0 pg0Var = this.F;
            pg0Var.G.setAlpha((int) (this.f22099y * 255.0f));
            u9 u9Var = this.f22090a;
            canvas.drawCircle((u9Var.getMeasuredWidth() / 2) + u9Var.getLeft(), (u9Var.getMeasuredHeight() / 2) + u9Var.getTop(), u9Var.getMeasuredWidth() / 2, pg0Var.G);
            if (this.f22097w % 2 == 0) {
                dp = AndroidUtilities.dp(65.0f);
                dp2 = AndroidUtilities.dp(48.0f);
            } else {
                dp = AndroidUtilities.dp(65.0f);
                dp2 = AndroidUtilities.dp(60.0f);
            }
            if (LocaleController.isRTL) {
                dp = (getMeasuredWidth() - dp) - dp2;
            }
            pg0Var.M.set(dp, measuredHeight - AndroidUtilities.dp(4.0f), dp + dp2, AndroidUtilities.dp(4.0f) + measuredHeight);
            canvas.drawRoundRect(pg0Var.M, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), pg0Var.G);
            if (this.f22097w % 2 == 0) {
                dp3 = AndroidUtilities.dp(119.0f);
                dp4 = AndroidUtilities.dp(60.0f);
            } else {
                dp3 = AndroidUtilities.dp(131.0f);
                dp4 = AndroidUtilities.dp(80.0f);
            }
            if (LocaleController.isRTL) {
                dp3 = (getMeasuredWidth() - dp3) - dp4;
            }
            pg0Var.M.set(dp3, measuredHeight - AndroidUtilities.dp(4.0f), dp3 + dp4, AndroidUtilities.dp(4.0f) + measuredHeight);
            canvas.drawRoundRect(pg0Var.M, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), pg0Var.G);
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
            canvas.drawLine(dp5, measuredHeight2, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.i6.f18958k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f) + (this.v ? 1 : 0), 1073741824));
    }

    public void setPlaceholderAlpha(float f7) {
        this.f22099y = f7;
        invalidate();
    }
}
