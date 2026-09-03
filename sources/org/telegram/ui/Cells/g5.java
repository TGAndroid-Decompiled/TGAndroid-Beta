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
    public final org.telegram.ui.Components.z8 f22849a;
    public final org.telegram.ui.Components.p9 f22850b;
    public final org.telegram.ui.ActionBar.l5 f22851c;
    public final org.telegram.ui.ActionBar.l5 d;
    public TLRPC.TL_chatInviteImporter f22852e;
    public boolean f22853f;

    public g5(Context context, final f5 f5Var, boolean z4) {
        super(context);
        int i10;
        int i11;
        float f10;
        float f11;
        int i12;
        float f12;
        float f13;
        int i13;
        int i14;
        int i15;
        float f14;
        float f15;
        int i16;
        int dp;
        this.f22849a = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.g6) null);
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(getContext());
        this.f22850b = p9Var;
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(getContext());
        this.f22851c = l5Var;
        org.telegram.ui.ActionBar.l5 l5Var2 = new org.telegram.ui.ActionBar.l5(getContext());
        this.d = l5Var2;
        p9Var.setRoundRadius(AndroidUtilities.dp(23.0f));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(p9Var, k7.c6.d(46, 46.0f, i10, 12.0f, 8.0f, 12.0f, 0.0f));
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        l5Var.setGravity(i11);
        l5Var.setMaxLines(1);
        l5Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.G6, false));
        l5Var.setTextSize(17);
        l5Var.setTypeface(AndroidUtilities.bold());
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            f10 = 12.0f;
        } else {
            f10 = 74.0f;
        }
        if (z10) {
            f11 = 74.0f;
        } else {
            f11 = 12.0f;
        }
        addView(l5Var, k7.c6.d(-1, -2.0f, 48, f10, 12.0f, f11, 0.0f));
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        l5Var2.setGravity(i12);
        l5Var2.setMaxLines(1);
        l5Var2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f22038y6, false));
        l5Var2.setTextSize(14);
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            f12 = 12.0f;
        } else {
            f12 = 74.0f;
        }
        if (z11) {
            f13 = 74.0f;
        } else {
            f13 = 12.0f;
        }
        addView(l5Var2, k7.c6.d(-1, -2.0f, 48, f12, 36.0f, f13, 0.0f));
        int dp2 = AndroidUtilities.dp(17.0f);
        TextView textView = new TextView(getContext());
        textView.setBackground(org.telegram.ui.ActionBar.a6.f(new float[]{16.0f}, org.telegram.ui.ActionBar.k6.Oh));
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        textView.setGravity(i13 | 16);
        textView.setMaxLines(1);
        textView.setPadding(dp2, 0, dp2, 0);
        if (z4) {
            i14 = R.string.AddToChannel;
        } else {
            i14 = R.string.AddToGroup;
        }
        textView.setText(LocaleController.getString(i14));
        textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Sh, false));
        textView.setTextSize(14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final g5 f22756b;

            {
                this.f22756b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        g5 g5Var = this.f22756b;
                        f5 f5Var2 = f5Var;
                        if (f5Var2 != null) {
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = g5Var.f22852e;
                            if (tL_chatInviteImporter != null) {
                                ((kh.v) f5Var2).d(tL_chatInviteImporter, true);
                                return;
                            }
                            return;
                        }
                        g5Var.getClass();
                        return;
                    default:
                        g5 g5Var2 = this.f22756b;
                        f5 f5Var3 = f5Var;
                        if (f5Var3 != null) {
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = g5Var2.f22852e;
                            if (tL_chatInviteImporter2 != null) {
                                ((kh.v) f5Var3).d(tL_chatInviteImporter2, false);
                                return;
                            }
                            return;
                        }
                        g5Var2.getClass();
                        return;
                }
            }
        });
        boolean z12 = LocaleController.isRTL;
        if (z12) {
            i15 = 5;
        } else {
            i15 = 3;
        }
        if (z12) {
            f14 = 0.0f;
        } else {
            f14 = 73.0f;
        }
        if (z12) {
            f15 = 73.0f;
        } else {
            f15 = 0.0f;
        }
        addView(textView, k7.c6.d(-2, 32.0f, i15, f14, 62.0f, f15, 0.0f));
        float measureText = textView.getPaint().measureText(textView.getText().toString()) + (dp2 * 2);
        TextView textView2 = new TextView(getContext());
        int dp3 = AndroidUtilities.dp(16.0f);
        textView2.setBackground(org.telegram.ui.ActionBar.k6.i0(dp3, dp3, dp3, dp3, 0, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21752i6, false), -16777216));
        if (LocaleController.isRTL) {
            i16 = 5;
        } else {
            i16 = 3;
        }
        textView2.setGravity(i16 | 16);
        textView2.setMaxLines(1);
        textView2.setPadding(dp2, 0, dp2, 0);
        textView2.setText(LocaleController.getString(R.string.Dismiss));
        textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21841n6, false));
        textView2.setTextSize(14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final g5 f22756b;

            {
                this.f22756b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        g5 g5Var = this.f22756b;
                        f5 f5Var2 = f5Var;
                        if (f5Var2 != null) {
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = g5Var.f22852e;
                            if (tL_chatInviteImporter != null) {
                                ((kh.v) f5Var2).d(tL_chatInviteImporter, true);
                                return;
                            }
                            return;
                        }
                        g5Var.getClass();
                        return;
                    default:
                        g5 g5Var2 = this.f22756b;
                        f5 f5Var3 = f5Var;
                        if (f5Var3 != null) {
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = g5Var2.f22852e;
                            if (tL_chatInviteImporter2 != null) {
                                ((kh.v) f5Var3).d(tL_chatInviteImporter2, false);
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

    public org.telegram.ui.Components.p9 getAvatarImageView() {
        return this.f22850b;
    }

    public TLRPC.TL_chatInviteImporter getImporter() {
        return this.f22852e;
    }

    public String getStatus() {
        return this.d.getText().toString();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i10;
        super.onDraw(canvas);
        if (this.f22853f) {
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(72.0f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i10 = AndroidUtilities.dp(72.0f);
            } else {
                i10 = 0;
            }
            canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f21781k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(107.0f), 1073741824));
    }
}
