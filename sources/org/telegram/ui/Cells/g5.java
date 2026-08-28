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
public final class g5 extends FrameLayout {
    public final org.telegram.ui.Components.z8 f24392a;
    public final org.telegram.ui.Components.o9 f24393b;
    public final org.telegram.ui.ActionBar.h5 f24394c;
    public final org.telegram.ui.ActionBar.h5 d;
    public TLRPC.TL_chatInviteImporter f24395e;
    public boolean f24396f;

    public g5(Context context, final f5 f5Var, boolean z10) {
        super(context);
        int i9;
        int i10;
        float f10;
        float f11;
        int i11;
        float f12;
        float f13;
        int i12;
        int i13;
        int i14;
        float f14;
        float f15;
        int i15;
        int dp;
        this.f24392a = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(getContext());
        this.f24393b = o9Var;
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(getContext());
        this.f24394c = h5Var;
        org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(getContext());
        this.d = h5Var2;
        o9Var.setRoundRadius(AndroidUtilities.dp(23.0f));
        if (LocaleController.isRTL) {
            i9 = 5;
        } else {
            i9 = 3;
        }
        addView(o9Var, g7.e6.d(46, 46.0f, i9, 12.0f, 8.0f, 12.0f, 0.0f));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        h5Var.setGravity(i10);
        h5Var.setMaxLines(1);
        h5Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false));
        h5Var.setTextSize(17);
        h5Var.setTypeface(AndroidUtilities.bold());
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            f10 = 12.0f;
        } else {
            f10 = 74.0f;
        }
        if (z11) {
            f11 = 74.0f;
        } else {
            f11 = 12.0f;
        }
        addView(h5Var, g7.e6.d(-1, -2.0f, 48, f10, 12.0f, f11, 0.0f));
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        h5Var2.setGravity(i11);
        h5Var2.setMaxLines(1);
        h5Var2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23369y6, false));
        h5Var2.setTextSize(14);
        boolean z12 = LocaleController.isRTL;
        if (z12) {
            f12 = 12.0f;
        } else {
            f12 = 74.0f;
        }
        if (z12) {
            f13 = 74.0f;
        } else {
            f13 = 12.0f;
        }
        addView(h5Var2, g7.e6.d(-1, -2.0f, 48, f12, 36.0f, f13, 0.0f));
        int dp2 = AndroidUtilities.dp(17.0f);
        TextView textView = new TextView(getContext());
        textView.setBackground(org.telegram.ui.ActionBar.v5.f(new float[]{16.0f}, org.telegram.ui.ActionBar.f6.Oh));
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        textView.setGravity(i12 | 16);
        textView.setMaxLines(1);
        textView.setPadding(dp2, 0, dp2, 0);
        if (z10) {
            i13 = R.string.AddToChannel;
        } else {
            i13 = R.string.AddToGroup;
        }
        textView.setText(LocaleController.getString(i13));
        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Sh, false));
        textView.setTextSize(14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final g5 f24301b;

            {
                this.f24301b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        g5 g5Var = this.f24301b;
                        f5 f5Var2 = f5Var;
                        if (f5Var2 != null) {
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = g5Var.f24395e;
                            if (tL_chatInviteImporter != null) {
                                ((eh.x) f5Var2).d(tL_chatInviteImporter, true);
                                return;
                            }
                            return;
                        }
                        g5Var.getClass();
                        return;
                    default:
                        g5 g5Var2 = this.f24301b;
                        f5 f5Var3 = f5Var;
                        if (f5Var3 != null) {
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = g5Var2.f24395e;
                            if (tL_chatInviteImporter2 != null) {
                                ((eh.x) f5Var3).d(tL_chatInviteImporter2, false);
                                return;
                            }
                            return;
                        }
                        g5Var2.getClass();
                        return;
                }
            }
        });
        boolean z13 = LocaleController.isRTL;
        if (z13) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        if (z13) {
            f14 = 0.0f;
        } else {
            f14 = 73.0f;
        }
        if (z13) {
            f15 = 73.0f;
        } else {
            f15 = 0.0f;
        }
        addView(textView, g7.e6.d(-2, 32.0f, i14, f14, 62.0f, f15, 0.0f));
        float measureText = textView.getPaint().measureText(textView.getText().toString()) + (dp2 * 2);
        TextView textView2 = new TextView(getContext());
        int dp3 = AndroidUtilities.dp(16.0f);
        textView2.setBackground(org.telegram.ui.ActionBar.f6.i0(dp3, dp3, dp3, dp3, 0, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23092i6, false), -16777216));
        if (LocaleController.isRTL) {
            i15 = 5;
        } else {
            i15 = 3;
        }
        textView2.setGravity(i15 | 16);
        textView2.setMaxLines(1);
        textView2.setPadding(dp2, 0, dp2, 0);
        textView2.setText(LocaleController.getString(R.string.Dismiss));
        textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23179n6, false));
        textView2.setTextSize(14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final g5 f24301b;

            {
                this.f24301b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        g5 g5Var = this.f24301b;
                        f5 f5Var2 = f5Var;
                        if (f5Var2 != null) {
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = g5Var.f24395e;
                            if (tL_chatInviteImporter != null) {
                                ((eh.x) f5Var2).d(tL_chatInviteImporter, true);
                                return;
                            }
                            return;
                        }
                        g5Var.getClass();
                        return;
                    default:
                        g5 g5Var2 = this.f24301b;
                        f5 f5Var3 = f5Var;
                        if (f5Var3 != null) {
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = g5Var2.f24395e;
                            if (tL_chatInviteImporter2 != null) {
                                ((eh.x) f5Var3).d(tL_chatInviteImporter2, false);
                                return;
                            }
                            return;
                        }
                        g5Var2.getClass();
                        return;
                }
            }
        });
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, AndroidUtilities.dp(32.0f), LocaleController.isRTL ? 5 : 3);
        layoutParams.topMargin = AndroidUtilities.dp(62.0f);
        if (LocaleController.isRTL) {
            dp = 0;
        } else {
            dp = (int) (AndroidUtilities.dp(79.0f) + measureText);
        }
        layoutParams.leftMargin = dp;
        layoutParams.rightMargin = LocaleController.isRTL ? (int) (measureText + AndroidUtilities.dp(79.0f)) : 0;
        addView(textView2, layoutParams);
    }

    public org.telegram.ui.Components.o9 getAvatarImageView() {
        return this.f24393b;
    }

    public TLRPC.TL_chatInviteImporter getImporter() {
        return this.f24395e;
    }

    public String getStatus() {
        return this.d.getText().toString();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i9;
        super.onDraw(canvas);
        if (this.f24396f) {
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(72.0f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i9 = AndroidUtilities.dp(72.0f);
            } else {
                i9 = 0;
            }
            canvas.drawLine(dp, measuredHeight, measuredWidth - i9, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.f6.f23121k0);
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(107.0f), 1073741824));
    }
}
