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
    public final zg0 F;
    public final w9 f21175a;
    public final org.telegram.ui.ActionBar.l5 f21176b;
    public final TextView f21177c;
    public final TextView d;
    public final g9 e;
    public final vw0 f21178f;
    public TLRPC.User h;
    public TLRPC.Chat f21179n;
    public CharSequence f21180r;
    public final int f21181s;
    public boolean v;
    public int f21182w;
    public boolean f21183x;
    public float f21184y;

    public PollVotesAlert$UserCell(zg0 zg0Var, Context context) {
        super(context);
        this.F = zg0Var;
        this.f21181s = UserConfig.selectedAccount;
        this.f21184y = 1.0f;
        setOrientation(0);
        setLayoutDirection(3);
        setWillNotDraw(false);
        setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        this.e = new g9((org.telegram.ui.ActionBar.f6) null);
        w9 w9Var = new w9(context);
        this.f21175a = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(18.0f));
        addView(w9Var, w7.a6.t(34, 34, 16, 0, 0, 11, 0));
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.f21176b = l5Var;
        int i10 = org.telegram.ui.ActionBar.j6.f18034j5;
        l5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        l5Var.setTypeface(AndroidUtilities.bold());
        l5Var.setTextSize(16);
        l5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        addView(l5Var, w7.a6.p(0, 24, 1.0f, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f21177c = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18179r5, false));
        textView.setTextSize(1, 13.0f);
        addView(textView, w7.a6.p(-2, -2, 0.0f, 21, 4, 0, 2, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        textView2.setTextSize(1, 13.0f);
        addView(textView2, w7.a6.p(-2, -2, 0.0f, 21, 2, 0, 4, 0));
        this.f21178f = new vw0(20, l5Var);
    }

    public float getPlaceholderAlpha() {
        return this.f21184y;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f21178f.f28604a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f21178f.f28604a.b();
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
        if (this.f21183x || this.f21184y != 0.0f) {
            zg0 zg0Var = this.F;
            zg0Var.G.setAlpha((int) (this.f21184y * 255.0f));
            w9 w9Var = this.f21175a;
            canvas.drawCircle((w9Var.getMeasuredWidth() / 2) + w9Var.getLeft(), (w9Var.getMeasuredHeight() / 2) + w9Var.getTop(), w9Var.getMeasuredWidth() / 2, zg0Var.G);
            if (this.f21182w % 2 == 0) {
                dp = AndroidUtilities.dp(65.0f);
                dp2 = AndroidUtilities.dp(48.0f);
            } else {
                dp = AndroidUtilities.dp(65.0f);
                dp2 = AndroidUtilities.dp(60.0f);
            }
            if (LocaleController.isRTL) {
                dp = (getMeasuredWidth() - dp) - dp2;
            }
            zg0Var.M.set(dp, measuredHeight - AndroidUtilities.dp(4.0f), dp + dp2, AndroidUtilities.dp(4.0f) + measuredHeight);
            canvas.drawRoundRect(zg0Var.M, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), zg0Var.G);
            if (this.f21182w % 2 == 0) {
                dp3 = AndroidUtilities.dp(119.0f);
                dp4 = AndroidUtilities.dp(60.0f);
            } else {
                dp3 = AndroidUtilities.dp(131.0f);
                dp4 = AndroidUtilities.dp(80.0f);
            }
            if (LocaleController.isRTL) {
                dp3 = (getMeasuredWidth() - dp3) - dp4;
            }
            zg0Var.M.set(dp3, measuredHeight - AndroidUtilities.dp(4.0f), dp3 + dp4, AndroidUtilities.dp(4.0f) + measuredHeight);
            canvas.drawRoundRect(zg0Var.M, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), zg0Var.G);
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
            canvas.drawLine(dp5, measuredHeight2, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f18049k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f) + (this.v ? 1 : 0), 1073741824));
    }

    public void setPlaceholderAlpha(float f7) {
        this.f21184y = f7;
        invalidate();
    }
}
