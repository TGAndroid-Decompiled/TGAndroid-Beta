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
public final class e5 extends FrameLayout {
    public final org.telegram.ui.Components.e9 f24288a;
    public final org.telegram.ui.Components.t9 f24289b;
    public final org.telegram.ui.ActionBar.h5 f24290c;
    public final org.telegram.ui.ActionBar.h5 d;
    public TLRPC.TL_chatInviteImporter f24291e;
    public boolean f24292f;

    public e5(Context context, final d5 d5Var, boolean z10) {
        super(context);
        int i10;
        int i11;
        float f9;
        float f10;
        int i12;
        float f11;
        float f12;
        int i13;
        int i14;
        int i15;
        float f13;
        float f14;
        int i16;
        int dp;
        this.f24288a = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
        org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(getContext());
        this.f24289b = t9Var;
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(getContext());
        this.f24290c = h5Var;
        org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(getContext());
        this.d = h5Var2;
        t9Var.setRoundRadius(AndroidUtilities.dp(23.0f));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(t9Var, i7.f6.d(46, 46.0f, i10, 12.0f, 8.0f, 12.0f, 0.0f));
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        h5Var.setGravity(i11);
        h5Var.setMaxLines(1);
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
        h5Var.setTextSize(17);
        h5Var.setTypeface(AndroidUtilities.bold());
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            f9 = 12.0f;
        } else {
            f9 = 74.0f;
        }
        if (z11) {
            f10 = 74.0f;
        } else {
            f10 = 12.0f;
        }
        addView(h5Var, i7.f6.d(-1, -2.0f, 48, f9, 12.0f, f10, 0.0f));
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        h5Var2.setGravity(i12);
        h5Var2.setMaxLines(1);
        h5Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23433y6, false));
        h5Var2.setTextSize(14);
        boolean z12 = LocaleController.isRTL;
        if (z12) {
            f11 = 12.0f;
        } else {
            f11 = 74.0f;
        }
        if (z12) {
            f12 = 74.0f;
        } else {
            f12 = 12.0f;
        }
        addView(h5Var2, i7.f6.d(-1, -2.0f, 48, f11, 36.0f, f12, 0.0f));
        int dp2 = AndroidUtilities.dp(17.0f);
        TextView textView = new TextView(getContext());
        textView.setBackground(org.telegram.ui.ActionBar.w5.f(new float[]{16.0f}, org.telegram.ui.ActionBar.g6.Oh));
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        textView.setGravity(i13 | 16);
        textView.setMaxLines(1);
        textView.setPadding(dp2, 0, dp2, 0);
        if (z10) {
            i14 = R.string.AddToChannel;
        } else {
            i14 = R.string.AddToGroup;
        }
        textView.setText(LocaleController.getString(i14));
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
        textView.setTextSize(14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final e5 f24165b;

            {
                this.f24165b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        e5 e5Var = this.f24165b;
                        d5 d5Var2 = d5Var;
                        if (d5Var2 != null) {
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = e5Var.f24291e;
                            if (tL_chatInviteImporter != null) {
                                ((hh.v) d5Var2).d(tL_chatInviteImporter, true);
                                return;
                            }
                            return;
                        }
                        e5Var.getClass();
                        return;
                    default:
                        e5 e5Var2 = this.f24165b;
                        d5 d5Var3 = d5Var;
                        if (d5Var3 != null) {
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = e5Var2.f24291e;
                            if (tL_chatInviteImporter2 != null) {
                                ((hh.v) d5Var3).d(tL_chatInviteImporter2, false);
                                return;
                            }
                            return;
                        }
                        e5Var2.getClass();
                        return;
                }
            }
        });
        boolean z13 = LocaleController.isRTL;
        if (z13) {
            i15 = 5;
        } else {
            i15 = 3;
        }
        if (z13) {
            f13 = 0.0f;
        } else {
            f13 = 73.0f;
        }
        if (z13) {
            f14 = 73.0f;
        } else {
            f14 = 0.0f;
        }
        addView(textView, i7.f6.d(-2, 32.0f, i15, f13, 62.0f, f14, 0.0f));
        float measureText = textView.getPaint().measureText(textView.getText().toString()) + (dp2 * 2);
        TextView textView2 = new TextView(getContext());
        int dp3 = AndroidUtilities.dp(16.0f);
        textView2.setBackground(org.telegram.ui.ActionBar.g6.i0(dp3, dp3, dp3, dp3, 0, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23152i6, false), -16777216));
        if (LocaleController.isRTL) {
            i16 = 5;
        } else {
            i16 = 3;
        }
        textView2.setGravity(i16 | 16);
        textView2.setMaxLines(1);
        textView2.setPadding(dp2, 0, dp2, 0);
        textView2.setText(LocaleController.getString(R.string.Dismiss));
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23241n6, false));
        textView2.setTextSize(14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final e5 f24165b;

            {
                this.f24165b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        e5 e5Var = this.f24165b;
                        d5 d5Var2 = d5Var;
                        if (d5Var2 != null) {
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = e5Var.f24291e;
                            if (tL_chatInviteImporter != null) {
                                ((hh.v) d5Var2).d(tL_chatInviteImporter, true);
                                return;
                            }
                            return;
                        }
                        e5Var.getClass();
                        return;
                    default:
                        e5 e5Var2 = this.f24165b;
                        d5 d5Var3 = d5Var;
                        if (d5Var3 != null) {
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = e5Var2.f24291e;
                            if (tL_chatInviteImporter2 != null) {
                                ((hh.v) d5Var3).d(tL_chatInviteImporter2, false);
                                return;
                            }
                            return;
                        }
                        e5Var2.getClass();
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

    public org.telegram.ui.Components.t9 getAvatarImageView() {
        return this.f24289b;
    }

    public TLRPC.TL_chatInviteImporter getImporter() {
        return this.f24291e;
    }

    public String getStatus() {
        return this.d.getText().toString();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i10;
        super.onDraw(canvas);
        if (this.f24292f) {
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
            canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.g6.f23183k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(107.0f), 1073741824));
    }
}
