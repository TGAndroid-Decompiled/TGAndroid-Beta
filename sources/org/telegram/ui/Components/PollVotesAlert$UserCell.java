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
public class PollVotesAlert$UserCell extends LinearLayout implements org.telegram.ui.ActionBar.p6 {
    public ArrayList E;
    public final nh0 F;
    public final y9 f26204a;
    public final org.telegram.ui.ActionBar.b6 f26205b;
    public final TextView f26206c;
    public final TextView d;
    public final j9 e;
    public final qx0 f26207f;
    public TLRPC.User h;
    public TLRPC.Chat f26208n;
    public CharSequence f26209r;
    public final int f26210s;
    public boolean v;
    public int f26211w;
    public boolean f26212x;
    public float f26213y;

    public PollVotesAlert$UserCell(nh0 nh0Var, Context context) {
        super(context);
        this.F = nh0Var;
        this.f26210s = UserConfig.selectedAccount;
        this.f26213y = 1.0f;
        setOrientation(0);
        setLayoutDirection(3);
        setWillNotDraw(false);
        setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        this.e = new j9((org.telegram.ui.ActionBar.u6) null);
        y9 y9Var = new y9(context);
        this.f26204a = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(18.0f));
        addView(y9Var, gb1.x(34, 34, 16, 0, 0, 11, 0));
        org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(context);
        this.f26205b = b6Var;
        int i10 = org.telegram.ui.ActionBar.y6.f23462j5;
        org.telegram.ui.ActionBar.f7.Y(b6Var, i10, null);
        b6Var.setTypeface(AndroidUtilities.bold());
        b6Var.setTextSize(16);
        b6Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        addView(b6Var, gb1.t(0, 24, 1.0f, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f26206c = textView;
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23612r5, null);
        textView.setTextSize(1, 13.0f);
        addView(textView, gb1.t(-2, -2, 0.0f, 21, 4, 0, 2, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        org.telegram.ui.ActionBar.f7.V(textView2, i10, null);
        textView2.setTextSize(1, 13.0f);
        addView(textView2, gb1.t(-2, -2, 0.0f, 21, 2, 0, 4, 0));
        this.f26207f = new qx0(20, b6Var);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23768z9));
    }

    public float getPlaceholderAlpha() {
        return this.f26213y;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f26207f.f32055a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f26207f.f32055a.b();
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
        if (this.f26212x || this.f26213y != 0.0f) {
            nh0 nh0Var = this.F;
            nh0Var.G.setAlpha((int) (this.f26213y * 255.0f));
            y9 y9Var = this.f26204a;
            canvas.drawCircle((y9Var.getMeasuredWidth() / 2) + y9Var.getLeft(), (y9Var.getMeasuredHeight() / 2) + y9Var.getTop(), y9Var.getMeasuredWidth() / 2, nh0Var.G);
            if (this.f26211w % 2 == 0) {
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
            if (this.f26211w % 2 == 0) {
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
            canvas.drawLine(f10, measuredHeight2, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.y6.f23476k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f) + (this.v ? 1 : 0), 1073741824));
    }

    public void setPlaceholderAlpha(float f7) {
        this.f26213y = f7;
        invalidate();
    }

    @Override
    public final void updateColors() {
        boolean z10;
        qx0 qx0Var = this.f26207f;
        if (qx0Var != null) {
            try {
                r5 r5Var = qx0Var.f32055a;
                if (r5Var != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && r5Var.F != null) {
                    r5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23768z9, nh0.L(this.F))));
                    org.telegram.ui.ActionBar.b6 b6Var = this.f26205b;
                    if (b6Var != null) {
                        b6Var.invalidate();
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }
}
