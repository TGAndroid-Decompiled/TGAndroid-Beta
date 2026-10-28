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
    public final oh0 F;
    public final y9 f26208a;
    public final org.telegram.ui.ActionBar.b6 f26209b;
    public final TextView f26210c;
    public final TextView d;
    public final j9 e;
    public final rx0 f26211f;
    public TLRPC.User h;
    public TLRPC.Chat f26212n;
    public CharSequence f26213r;
    public final int f26214s;
    public boolean v;
    public int f26215w;
    public boolean f26216x;
    public float f26217y;

    public PollVotesAlert$UserCell(oh0 oh0Var, Context context) {
        super(context);
        this.F = oh0Var;
        this.f26214s = UserConfig.selectedAccount;
        this.f26217y = 1.0f;
        setOrientation(0);
        setLayoutDirection(3);
        setWillNotDraw(false);
        setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        this.e = new j9((org.telegram.ui.ActionBar.u6) null);
        y9 y9Var = new y9(context);
        this.f26208a = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(18.0f));
        addView(y9Var, kb1.x(34, 34, 16, 0, 0, 11, 0));
        org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(context);
        this.f26209b = b6Var;
        int i10 = org.telegram.ui.ActionBar.y6.f23465j5;
        org.telegram.ui.ActionBar.f7.Y(b6Var, i10, null);
        b6Var.setTypeface(AndroidUtilities.bold());
        b6Var.setTextSize(16);
        b6Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        addView(b6Var, kb1.t(0, 24, 1.0f, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f26210c = textView;
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23615r5, null);
        textView.setTextSize(1, 13.0f);
        addView(textView, kb1.t(-2, -2, 0.0f, 21, 4, 0, 2, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        org.telegram.ui.ActionBar.f7.V(textView2, i10, null);
        textView2.setTextSize(1, 13.0f);
        addView(textView2, kb1.t(-2, -2, 0.0f, 21, 2, 0, 4, 0));
        this.f26211f = new rx0(20, b6Var);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23771z9));
    }

    public float getPlaceholderAlpha() {
        return this.f26217y;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f26211f.f32396a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f26211f.f32396a.b();
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
        if (this.f26216x || this.f26217y != 0.0f) {
            oh0 oh0Var = this.F;
            oh0Var.G.setAlpha((int) (this.f26217y * 255.0f));
            y9 y9Var = this.f26208a;
            canvas.drawCircle((y9Var.getMeasuredWidth() / 2) + y9Var.getLeft(), (y9Var.getMeasuredHeight() / 2) + y9Var.getTop(), y9Var.getMeasuredWidth() / 2, oh0Var.G);
            if (this.f26215w % 2 == 0) {
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
            if (this.f26215w % 2 == 0) {
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
            canvas.drawLine(f10, measuredHeight2, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.y6.f23479k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f) + (this.v ? 1 : 0), 1073741824));
    }

    public void setPlaceholderAlpha(float f7) {
        this.f26217y = f7;
        invalidate();
    }

    @Override
    public final void updateColors() {
        boolean z10;
        rx0 rx0Var = this.f26211f;
        if (rx0Var != null) {
            try {
                r5 r5Var = rx0Var.f32396a;
                if (r5Var != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && r5Var.F != null) {
                    r5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23771z9, oh0.L(this.F))));
                    org.telegram.ui.ActionBar.b6 b6Var = this.f26209b;
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
