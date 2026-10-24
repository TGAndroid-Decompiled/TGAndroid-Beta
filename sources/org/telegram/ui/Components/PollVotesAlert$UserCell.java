package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public class PollVotesAlert$UserCell extends LinearLayout implements org.telegram.ui.ActionBar.b6 {
    public ArrayList E;
    public final nh0 F;
    public final u9 f24414a;
    public final org.telegram.ui.ActionBar.n5 f24415b;
    public final TextView f24416c;
    public final TextView d;
    public final f9 e;
    public final ix0 f24417f;
    public TLRPC.User h;
    public TLRPC.Chat f24418n;
    public CharSequence f24419r;
    public final int f24420s;
    public boolean v;
    public int f24421w;
    public boolean f24422x;
    public float f24423y;

    public PollVotesAlert$UserCell(nh0 nh0Var, Context context) {
        super(context);
        this.F = nh0Var;
        this.f24420s = UserConfig.selectedAccount;
        this.f24423y = 1.0f;
        setOrientation(0);
        setLayoutDirection(3);
        setWillNotDraw(false);
        setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        this.e = new f9((org.telegram.ui.ActionBar.g6) null);
        u9 u9Var = new u9(context);
        this.f24414a = u9Var;
        u9Var.setRoundRadius(AndroidUtilities.dp(18.0f));
        addView(u9Var, w7.z5.t(34, 34, 16, 0, 0, 11, 0));
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.f24415b = n5Var;
        int i10 = org.telegram.ui.ActionBar.k6.f21290j5;
        org.telegram.ui.ActionBar.r6.Z(n5Var, i10, null);
        n5Var.setTypeface(AndroidUtilities.bold());
        n5Var.setTextSize(16);
        n5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        addView(n5Var, w7.z5.p(0, 24, 1.0f, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f24416c = textView;
        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21440r5, null);
        textView.setTextSize(1, 13.0f);
        addView(textView, w7.z5.p(-2, -2, 0.0f, 21, 4, 0, 2, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        org.telegram.ui.ActionBar.r6.W(textView2, i10, null);
        textView2.setTextSize(1, 13.0f);
        addView(textView2, w7.z5.p(-2, -2, 0.0f, 21, 2, 0, 4, 0));
        this.f24417f = new ix0(20, n5Var);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21592z9));
    }

    public float getPlaceholderAlpha() {
        return this.f24423y;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f24417f.f27510a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f24417f.f27510a.b();
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
        if (this.f24422x || this.f24423y != 0.0f) {
            nh0 nh0Var = this.F;
            nh0Var.G.setAlpha((int) (this.f24423y * 255.0f));
            u9 u9Var = this.f24414a;
            canvas.drawCircle((u9Var.getMeasuredWidth() / 2) + u9Var.getLeft(), (u9Var.getMeasuredHeight() / 2) + u9Var.getTop(), u9Var.getMeasuredWidth() / 2, nh0Var.G);
            if (this.f24421w % 2 == 0) {
                dp = AndroidUtilities.dp(65.0f);
                dp2 = AndroidUtilities.dp(48.0f);
            } else {
                dp = AndroidUtilities.dp(65.0f);
                dp2 = AndroidUtilities.dp(60.0f);
            }
            if (LocaleController.isRTL) {
                dp = (getMeasuredWidth() - dp) - dp2;
            }
            nh0Var.M.set(dp, measuredHeight - AndroidUtilities.dp(4.0f), dp + dp2, AndroidUtilities.dp(4.0f) + measuredHeight);
            canvas.drawRoundRect(nh0Var.M, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), nh0Var.G);
            if (this.f24421w % 2 == 0) {
                dp3 = AndroidUtilities.dp(119.0f);
                dp4 = AndroidUtilities.dp(60.0f);
            } else {
                dp3 = AndroidUtilities.dp(131.0f);
                dp4 = AndroidUtilities.dp(80.0f);
            }
            if (LocaleController.isRTL) {
                dp3 = (getMeasuredWidth() - dp3) - dp4;
            }
            nh0Var.M.set(dp3, measuredHeight - AndroidUtilities.dp(4.0f), dp3 + dp4, AndroidUtilities.dp(4.0f) + measuredHeight);
            canvas.drawRoundRect(nh0Var.M, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), nh0Var.G);
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
            canvas.drawLine(f10, measuredHeight2, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f21305k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f) + (this.v ? 1 : 0), 1073741824));
    }

    public void setPlaceholderAlpha(float f7) {
        this.f24423y = f7;
        invalidate();
    }

    @Override
    public final void updateColors() {
        boolean z10;
        ix0 ix0Var = this.f24417f;
        if (ix0Var != null) {
            try {
                n5 n5Var = ix0Var.f27510a;
                if (n5Var != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && n5Var.F != null) {
                    n5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21592z9, nh0.L(this.F))));
                    org.telegram.ui.ActionBar.n5 n5Var2 = this.f24415b;
                    if (n5Var2 != null) {
                        n5Var2.invalidate();
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }
}
