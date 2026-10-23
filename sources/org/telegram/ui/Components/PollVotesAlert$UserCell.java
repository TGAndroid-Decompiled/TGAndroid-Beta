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
    public final oh0 F;
    public final w9 f24413a;
    public final org.telegram.ui.ActionBar.n5 f24414b;
    public final TextView f24415c;
    public final TextView d;
    public final h9 e;
    public final jx0 f24416f;
    public TLRPC.User h;
    public TLRPC.Chat f24417n;
    public CharSequence f24418r;
    public final int f24419s;
    public boolean v;
    public int f24420w;
    public boolean f24421x;
    public float f24422y;

    public PollVotesAlert$UserCell(oh0 oh0Var, Context context) {
        super(context);
        this.F = oh0Var;
        this.f24419s = UserConfig.selectedAccount;
        this.f24422y = 1.0f;
        setOrientation(0);
        setLayoutDirection(3);
        setWillNotDraw(false);
        setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        this.e = new h9((org.telegram.ui.ActionBar.g6) null);
        w9 w9Var = new w9(context);
        this.f24413a = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(18.0f));
        addView(w9Var, w7.z5.t(34, 34, 16, 0, 0, 11, 0));
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.f24414b = n5Var;
        int i10 = org.telegram.ui.ActionBar.k6.f21289j5;
        org.telegram.ui.ActionBar.r6.Z(n5Var, i10, null);
        n5Var.setTypeface(AndroidUtilities.bold());
        n5Var.setTextSize(16);
        n5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        addView(n5Var, w7.z5.p(0, 24, 1.0f, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f24415c = textView;
        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21439r5, null);
        textView.setTextSize(1, 13.0f);
        addView(textView, w7.z5.p(-2, -2, 0.0f, 21, 4, 0, 2, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        org.telegram.ui.ActionBar.r6.W(textView2, i10, null);
        textView2.setTextSize(1, 13.0f);
        addView(textView2, w7.z5.p(-2, -2, 0.0f, 21, 2, 0, 4, 0));
        this.f24416f = new jx0(20, n5Var);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21591z9));
    }

    public float getPlaceholderAlpha() {
        return this.f24422y;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f24416f.f27775a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f24416f.f27775a.b();
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
        if (this.f24421x || this.f24422y != 0.0f) {
            oh0 oh0Var = this.F;
            oh0Var.G.setAlpha((int) (this.f24422y * 255.0f));
            w9 w9Var = this.f24413a;
            canvas.drawCircle((w9Var.getMeasuredWidth() / 2) + w9Var.getLeft(), (w9Var.getMeasuredHeight() / 2) + w9Var.getTop(), w9Var.getMeasuredWidth() / 2, oh0Var.G);
            if (this.f24420w % 2 == 0) {
                dp = AndroidUtilities.dp(65.0f);
                dp2 = AndroidUtilities.dp(48.0f);
            } else {
                dp = AndroidUtilities.dp(65.0f);
                dp2 = AndroidUtilities.dp(60.0f);
            }
            if (LocaleController.isRTL) {
                dp = (getMeasuredWidth() - dp) - dp2;
            }
            oh0Var.M.set(dp, measuredHeight - AndroidUtilities.dp(4.0f), dp + dp2, AndroidUtilities.dp(4.0f) + measuredHeight);
            canvas.drawRoundRect(oh0Var.M, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), oh0Var.G);
            if (this.f24420w % 2 == 0) {
                dp3 = AndroidUtilities.dp(119.0f);
                dp4 = AndroidUtilities.dp(60.0f);
            } else {
                dp3 = AndroidUtilities.dp(131.0f);
                dp4 = AndroidUtilities.dp(80.0f);
            }
            if (LocaleController.isRTL) {
                dp3 = (getMeasuredWidth() - dp3) - dp4;
            }
            oh0Var.M.set(dp3, measuredHeight - AndroidUtilities.dp(4.0f), dp3 + dp4, AndroidUtilities.dp(4.0f) + measuredHeight);
            canvas.drawRoundRect(oh0Var.M, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), oh0Var.G);
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
            canvas.drawLine(f10, measuredHeight2, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f21304k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f) + (this.v ? 1 : 0), 1073741824));
    }

    public void setPlaceholderAlpha(float f7) {
        this.f24422y = f7;
        invalidate();
    }

    @Override
    public final void updateColors() {
        boolean z10;
        jx0 jx0Var = this.f24416f;
        if (jx0Var != null) {
            try {
                p5 p5Var = jx0Var.f27775a;
                if (p5Var != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && p5Var.F != null) {
                    p5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21591z9, oh0.L(this.F))));
                    org.telegram.ui.ActionBar.n5 n5Var = this.f24414b;
                    if (n5Var != null) {
                        n5Var.invalidate();
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }
}
