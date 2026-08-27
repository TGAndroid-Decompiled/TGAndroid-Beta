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
    public final cg0 B;

    public final n9 f26431a;

    public final org.telegram.ui.ActionBar.h5 f26432b;

    public final TextView f26433c;
    public final TextView d;

    public final y8 f26434e;

    public final uv0 f26435f;
    public TLRPC.User h;

    public TLRPC.Chat f26436n;

    public CharSequence f26437r;

    public final int f26438s;
    public boolean v;

    public int f26439w;

    public boolean f26440x;

    public float f26441y;

    public PollVotesAlert$UserCell(cg0 cg0Var, Context context) {
        super(context);
        this.B = cg0Var;
        this.f26438s = UserConfig.selectedAccount;
        this.f26441y = 1.0f;
        setOrientation(0);
        setLayoutDirection(3);
        setWillNotDraw(false);
        setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        this.f26434e = new y8((org.telegram.ui.ActionBar.c6) null);
        n9 n9Var = new n9(context);
        this.f26431a = n9Var;
        n9Var.setRoundRadius(AndroidUtilities.dp(18.0f));
        addView(n9Var, h7.z5.t(34, 34, 16, 0, 0, 11, 0));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f26432b = h5Var;
        int i10 = org.telegram.ui.ActionBar.g6.f23161j5;
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        h5Var.setTypeface(AndroidUtilities.bold());
        h5Var.setTextSize(16);
        h5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        addView(h5Var, h7.z5.p(0, 24, 1.0f, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f26433c = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23300r5, false));
        textView.setTextSize(1, 13.0f);
        addView(textView, h7.z5.p(-2, -2, 0.0f, 21, 4, 0, 2, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        textView2.setTextSize(1, 13.0f);
        addView(textView2, h7.z5.p(-2, -2, 0.0f, 21, 2, 0, 4, 0));
        this.f26435f = new uv0(20, h5Var);
    }

    public float getPlaceholderAlpha() {
        return this.f26441y;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f26435f.f33217a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f26435f.f33217a.b();
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int iDp;
        int iDp2;
        int iDp3;
        int iDp4;
        if (this.f26440x || this.f26441y != 0.0f) {
            cg0 cg0Var = this.B;
            cg0Var.C.setAlpha((int) (this.f26441y * 255.0f));
            n9 n9Var = this.f26431a;
            int measuredWidth = (n9Var.getMeasuredWidth() / 2) + n9Var.getLeft();
            int measuredHeight = (n9Var.getMeasuredHeight() / 2) + n9Var.getTop();
            canvas.drawCircle(measuredWidth, measuredHeight, n9Var.getMeasuredWidth() / 2, cg0Var.C);
            if (this.f26439w % 2 == 0) {
                iDp = AndroidUtilities.dp(65.0f);
                iDp2 = AndroidUtilities.dp(48.0f);
            } else {
                iDp = AndroidUtilities.dp(65.0f);
                iDp2 = AndroidUtilities.dp(60.0f);
            }
            if (LocaleController.isRTL) {
                iDp = (getMeasuredWidth() - iDp) - iDp2;
            }
            cg0Var.I.set(iDp, measuredHeight - AndroidUtilities.dp(4.0f), iDp + iDp2, AndroidUtilities.dp(4.0f) + measuredHeight);
            canvas.drawRoundRect(cg0Var.I, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), cg0Var.C);
            if (this.f26439w % 2 == 0) {
                iDp3 = AndroidUtilities.dp(119.0f);
                iDp4 = AndroidUtilities.dp(60.0f);
            } else {
                iDp3 = AndroidUtilities.dp(131.0f);
                iDp4 = AndroidUtilities.dp(80.0f);
            }
            if (LocaleController.isRTL) {
                iDp3 = (getMeasuredWidth() - iDp3) - iDp4;
            }
            cg0Var.I.set(iDp3, measuredHeight - AndroidUtilities.dp(4.0f), iDp3 + iDp4, AndroidUtilities.dp(4.0f) + measuredHeight);
            canvas.drawRoundRect(cg0Var.I, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), cg0Var.C);
        }
        if (this.v) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(64.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(64.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.g6.f23175k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f) + (this.v ? 1 : 0), 1073741824));
    }

    public void setPlaceholderAlpha(float f10) {
        this.f26441y = f10;
        invalidate();
    }
}
