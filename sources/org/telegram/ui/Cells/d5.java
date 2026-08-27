package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

public final class d5 extends FrameLayout {

    public final org.telegram.ui.Components.y8 f24215a;

    public final org.telegram.ui.Components.n9 f24216b;

    public final org.telegram.ui.ActionBar.h5 f24217c;
    public final org.telegram.ui.ActionBar.h5 d;

    public TLRPC.TL_chatInviteImporter f24218e;

    public boolean f24219f;

    public d5(Context context, final c5 c5Var, boolean z10) {
        super(context);
        this.f24215a = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
        org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(getContext());
        this.f24216b = n9Var;
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(getContext());
        this.f24217c = h5Var;
        org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(getContext());
        this.d = h5Var2;
        n9Var.setRoundRadius(AndroidUtilities.dp(23.0f));
        addView(n9Var, h7.z5.d(46, 46.0f, LocaleController.isRTL ? 5 : 3, 12.0f, 8.0f, 12.0f, 0.0f));
        h5Var.setGravity(LocaleController.isRTL ? 5 : 3);
        final int i10 = 1;
        h5Var.setMaxLines(1);
        final int i11 = 0;
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
        h5Var.setTextSize(17);
        h5Var.setTypeface(AndroidUtilities.bold());
        boolean z11 = LocaleController.isRTL;
        addView(h5Var, h7.z5.d(-1, -2.0f, 48, z11 ? 12.0f : 74.0f, 12.0f, z11 ? 74.0f : 12.0f, 0.0f));
        h5Var2.setGravity(LocaleController.isRTL ? 5 : 3);
        h5Var2.setMaxLines(1);
        h5Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23423y6, false));
        h5Var2.setTextSize(14);
        boolean z12 = LocaleController.isRTL;
        addView(h5Var2, h7.z5.d(-1, -2.0f, 48, z12 ? 12.0f : 74.0f, 36.0f, z12 ? 74.0f : 12.0f, 0.0f));
        int iDp = AndroidUtilities.dp(17.0f);
        TextView textView = new TextView(getContext());
        textView.setBackground(org.telegram.ui.ActionBar.w5.f(new float[]{16.0f}, org.telegram.ui.ActionBar.g6.Oh));
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView.setMaxLines(1);
        textView.setPadding(iDp, 0, iDp, 0);
        textView.setText(LocaleController.getString(z10 ? R.string.AddToChannel : R.string.AddToGroup));
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
        textView.setTextSize(14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setOnClickListener(new View.OnClickListener(this) {

            public final d5 f24108b;

            {
                this.f24108b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        d5 d5Var = this.f24108b;
                        c5 c5Var2 = c5Var;
                        if (c5Var2 == null) {
                            d5Var.getClass();
                        } else {
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = d5Var.f24218e;
                            if (tL_chatInviteImporter != null) {
                                ((fh.v) c5Var2).d(tL_chatInviteImporter, true);
                            }
                        }
                        break;
                    default:
                        d5 d5Var2 = this.f24108b;
                        c5 c5Var3 = c5Var;
                        if (c5Var3 == null) {
                            d5Var2.getClass();
                        } else {
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = d5Var2.f24218e;
                            if (tL_chatInviteImporter2 != null) {
                                ((fh.v) c5Var3).d(tL_chatInviteImporter2, false);
                            }
                        }
                        break;
                }
            }
        });
        boolean z13 = LocaleController.isRTL;
        addView(textView, h7.z5.d(-2, 32.0f, z13 ? 5 : 3, z13 ? 0.0f : 73.0f, 62.0f, z13 ? 73.0f : 0.0f, 0.0f));
        float fMeasureText = textView.getPaint().measureText(textView.getText().toString()) + (iDp * 2);
        TextView textView2 = new TextView(getContext());
        int iDp2 = AndroidUtilities.dp(16.0f);
        textView2.setBackground(org.telegram.ui.ActionBar.g6.i0(iDp2, iDp2, iDp2, iDp2, 0, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23144i6, false), -16777216));
        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView2.setMaxLines(1);
        textView2.setPadding(iDp, 0, iDp, 0);
        textView2.setText(LocaleController.getString(R.string.Dismiss));
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23234n6, false));
        textView2.setTextSize(14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setOnClickListener(new View.OnClickListener(this) {

            public final d5 f24108b;

            {
                this.f24108b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        d5 d5Var = this.f24108b;
                        c5 c5Var2 = c5Var;
                        if (c5Var2 == null) {
                            d5Var.getClass();
                        } else {
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = d5Var.f24218e;
                            if (tL_chatInviteImporter != null) {
                                ((fh.v) c5Var2).d(tL_chatInviteImporter, true);
                            }
                        }
                        break;
                    default:
                        d5 d5Var2 = this.f24108b;
                        c5 c5Var3 = c5Var;
                        if (c5Var3 == null) {
                            d5Var2.getClass();
                        } else {
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = d5Var2.f24218e;
                            if (tL_chatInviteImporter2 != null) {
                                ((fh.v) c5Var3).d(tL_chatInviteImporter2, false);
                            }
                        }
                        break;
                }
            }
        });
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, AndroidUtilities.dp(32.0f), LocaleController.isRTL ? 5 : 3);
        layoutParams.topMargin = AndroidUtilities.dp(62.0f);
        layoutParams.leftMargin = LocaleController.isRTL ? 0 : (int) (AndroidUtilities.dp(79.0f) + fMeasureText);
        layoutParams.rightMargin = LocaleController.isRTL ? (int) (fMeasureText + AndroidUtilities.dp(79.0f)) : 0;
        addView(textView2, layoutParams);
    }

    public org.telegram.ui.Components.n9 getAvatarImageView() {
        return this.f24216b;
    }

    public TLRPC.TL_chatInviteImporter getImporter() {
        return this.f24218e;
    }

    public String getStatus() {
        return this.d.getText().toString();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f24219f) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(72.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(72.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.g6.f23175k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(107.0f), 1073741824));
    }
}
