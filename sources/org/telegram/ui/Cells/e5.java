package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import b8.mf;
import org.telegram.messenger.bd;
import org.telegram.tgnet.TLRPC;
public final class e5 extends FrameLayout {
    public final org.telegram.ui.Components.u8 f29120a;
    public final org.telegram.ui.Components.k9 f29121b;
    public final org.telegram.ui.ActionBar.k5 f29122c;
    public final org.telegram.ui.ActionBar.k5 d;
    public TLRPC.TL_chatInviteImporter f29123e;
    public boolean f29124f;

    public e5(Context context, final d5 d5Var, boolean z10) {
        super(context);
        int i3;
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
        int L;
        this.f29120a = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(getContext());
        this.f29121b = k9Var;
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(getContext());
        this.f29122c = k5Var;
        org.telegram.ui.ActionBar.k5 k5Var2 = new org.telegram.ui.ActionBar.k5(getContext());
        this.d = k5Var2;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(23.0f));
        if (bd.f21784a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        addView(k9Var, mf.d(46, 46.0f, i3, 12.0f, 8.0f, 12.0f, 0.0f));
        if (bd.f21784a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        k5Var.setGravity(i10);
        k5Var.setMaxLines(1);
        org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.G6, null);
        k5Var.setTextSize(17);
        k5Var.setTypeface(org.telegram.messenger.g0.o());
        boolean z11 = bd.f21784a0;
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
        addView(k5Var, mf.d(-1, -2.0f, 48, f10, 12.0f, f11, 0.0f));
        if (bd.f21784a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        k5Var2.setGravity(i11);
        k5Var2.setMaxLines(1);
        org.telegram.ui.ActionBar.r6.Y(k5Var2, org.telegram.ui.ActionBar.k6.f28273y6, null);
        k5Var2.setTextSize(14);
        boolean z12 = bd.f21784a0;
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
        addView(k5Var2, mf.d(-1, -2.0f, 48, f12, 36.0f, f13, 0.0f));
        int L2 = org.telegram.messenger.g0.L(17.0f);
        TextView textView = new TextView(getContext());
        textView.setBackground(org.telegram.ui.ActionBar.y5.f(org.telegram.ui.ActionBar.k6.Ci, 16.0f));
        if (bd.f21784a0) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        textView.setGravity(i12 | 16);
        textView.setMaxLines(1);
        textView.setPadding(L2, 0, L2, 0);
        if (z10) {
            i13 = 2131754378;
        } else {
            i13 = 2131754373;
        }
        textView.setText(bd.M0(i13, null));
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.Gi, null);
        textView.setTextSize(14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final e5 f29046b;

            {
                this.f29046b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        e5 e5Var = this.f29046b;
                        d5 d5Var2 = d5Var;
                        if (d5Var2 != null) {
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = e5Var.f29123e;
                            if (tL_chatInviteImporter != null) {
                                ((zh.k) d5Var2).d(tL_chatInviteImporter, true);
                                return;
                            }
                            return;
                        }
                        e5Var.getClass();
                        return;
                    default:
                        e5 e5Var2 = this.f29046b;
                        d5 d5Var3 = d5Var;
                        if (d5Var3 != null) {
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = e5Var2.f29123e;
                            if (tL_chatInviteImporter2 != null) {
                                ((zh.k) d5Var3).d(tL_chatInviteImporter2, false);
                                return;
                            }
                            return;
                        }
                        e5Var2.getClass();
                        return;
                }
            }
        });
        boolean z13 = bd.f21784a0;
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
        addView(textView, mf.d(-2, 32.0f, i14, f14, 62.0f, f15, 0.0f));
        float measureText = textView.getPaint().measureText(textView.getText().toString()) + (L2 * 2);
        TextView textView2 = new TextView(getContext());
        int L3 = org.telegram.messenger.g0.L(16.0f);
        textView2.setBackground(org.telegram.ui.ActionBar.k6.k0(L3, L3, L3, L3, 0, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27972i6, false), -16777216));
        if (bd.f21784a0) {
            i15 = 5;
        } else {
            i15 = 3;
        }
        textView2.setGravity(i15 | 16);
        textView2.setMaxLines(1);
        textView2.setPadding(L2, 0, L2, 0);
        textView2.setText(bd.M0(2131751370, null));
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.f28062n6, null);
        textView2.setTextSize(14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final e5 f29046b;

            {
                this.f29046b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        e5 e5Var = this.f29046b;
                        d5 d5Var2 = d5Var;
                        if (d5Var2 != null) {
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = e5Var.f29123e;
                            if (tL_chatInviteImporter != null) {
                                ((zh.k) d5Var2).d(tL_chatInviteImporter, true);
                                return;
                            }
                            return;
                        }
                        e5Var.getClass();
                        return;
                    default:
                        e5 e5Var2 = this.f29046b;
                        d5 d5Var3 = d5Var;
                        if (d5Var3 != null) {
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = e5Var2.f29123e;
                            if (tL_chatInviteImporter2 != null) {
                                ((zh.k) d5Var3).d(tL_chatInviteImporter2, false);
                                return;
                            }
                            return;
                        }
                        e5Var2.getClass();
                        return;
                }
            }
        });
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, org.telegram.messenger.g0.L(32.0f), bd.f21784a0 ? 5 : 3);
        layoutParams.topMargin = org.telegram.messenger.g0.L(62.0f);
        if (bd.f21784a0) {
            L = 0;
        } else {
            L = (int) (org.telegram.messenger.g0.L(79.0f) + measureText);
        }
        layoutParams.leftMargin = L;
        layoutParams.rightMargin = bd.f21784a0 ? (int) (measureText + org.telegram.messenger.g0.L(79.0f)) : 0;
        addView(textView2, layoutParams);
    }

    public org.telegram.ui.Components.k9 getAvatarImageView() {
        return this.f29121b;
    }

    public TLRPC.TL_chatInviteImporter getImporter() {
        return this.f29123e;
    }

    public String getStatus() {
        return this.d.getText().toString();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i3;
        super.onDraw(canvas);
        if (this.f29124f) {
            if (bd.f21784a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(72.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (bd.f21784a0) {
                i3 = org.telegram.messenger.g0.L(72.0f);
            } else {
                i3 = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - i3, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f28002k0);
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(107.0f), 1073741824));
    }
}
