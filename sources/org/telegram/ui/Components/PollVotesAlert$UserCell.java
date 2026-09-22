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
    public final ch0 F;
    public final v9 f22327a;
    public final org.telegram.ui.ActionBar.j5 f22328b;
    public final TextView f22329c;
    public final TextView d;
    public final g9 e;
    public final xw0 f22330f;
    public TLRPC.User h;
    public TLRPC.Chat f22331n;
    public CharSequence f22332r;
    public final int f22333s;
    public boolean v;
    public int f22334w;
    public boolean f22335x;
    public float f22336y;

    public PollVotesAlert$UserCell(ch0 ch0Var, Context context) {
        super(context);
        this.F = ch0Var;
        this.f22333s = UserConfig.selectedAccount;
        this.f22336y = 1.0f;
        setOrientation(0);
        setLayoutDirection(3);
        setWillNotDraw(false);
        setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        this.e = new g9((org.telegram.ui.ActionBar.f6) null);
        v9 v9Var = new v9(context);
        this.f22327a = v9Var;
        v9Var.setRoundRadius(AndroidUtilities.dp(18.0f));
        addView(v9Var, w7.y5.t(34, 34, 16, 0, 0, 11, 0));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.f22328b = j5Var;
        int i10 = org.telegram.ui.ActionBar.j6.f19216j5;
        j5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        j5Var.setTypeface(AndroidUtilities.bold());
        j5Var.setTextSize(16);
        j5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        addView(j5Var, w7.y5.p(0, 24, 1.0f, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f22329c = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19365r5, false));
        textView.setTextSize(1, 13.0f);
        addView(textView, w7.y5.p(-2, -2, 0.0f, 21, 4, 0, 2, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        textView2.setTextSize(1, 13.0f);
        addView(textView2, w7.y5.p(-2, -2, 0.0f, 21, 2, 0, 4, 0));
        this.f22330f = new xw0(20, j5Var);
    }

    public float getPlaceholderAlpha() {
        return this.f22336y;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f22330f.f30419a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f22330f.f30419a.b();
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
        if (this.f22335x || this.f22336y != 0.0f) {
            ch0 ch0Var = this.F;
            ch0Var.G.setAlpha((int) (this.f22336y * 255.0f));
            v9 v9Var = this.f22327a;
            canvas.drawCircle((v9Var.getMeasuredWidth() / 2) + v9Var.getLeft(), (v9Var.getMeasuredHeight() / 2) + v9Var.getTop(), v9Var.getMeasuredWidth() / 2, ch0Var.G);
            if (this.f22334w % 2 == 0) {
                dp = AndroidUtilities.dp(65.0f);
                dp2 = AndroidUtilities.dp(48.0f);
            } else {
                dp = AndroidUtilities.dp(65.0f);
                dp2 = AndroidUtilities.dp(60.0f);
            }
            if (LocaleController.isRTL) {
                dp = (getMeasuredWidth() - dp) - dp2;
            }
            ch0Var.M.set(dp, measuredHeight - AndroidUtilities.dp(4.0f), dp + dp2, AndroidUtilities.dp(4.0f) + measuredHeight);
            canvas.drawRoundRect(ch0Var.M, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), ch0Var.G);
            if (this.f22334w % 2 == 0) {
                dp3 = AndroidUtilities.dp(119.0f);
                dp4 = AndroidUtilities.dp(60.0f);
            } else {
                dp3 = AndroidUtilities.dp(131.0f);
                dp4 = AndroidUtilities.dp(80.0f);
            }
            if (LocaleController.isRTL) {
                dp3 = (getMeasuredWidth() - dp3) - dp4;
            }
            ch0Var.M.set(dp3, measuredHeight - AndroidUtilities.dp(4.0f), dp3 + dp4, AndroidUtilities.dp(4.0f) + measuredHeight);
            canvas.drawRoundRect(ch0Var.M, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), ch0Var.G);
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
            canvas.drawLine(dp5, measuredHeight2, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f19231k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f) + (this.v ? 1 : 0), 1073741824));
    }

    public void setPlaceholderAlpha(float f7) {
        this.f22336y = f7;
        invalidate();
    }
}
