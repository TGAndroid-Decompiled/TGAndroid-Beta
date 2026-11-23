package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLRPC;
public final class g5 extends FrameLayout {
    public final org.telegram.ui.Components.b9 f30699a;
    public final org.telegram.ui.Components.q9 f30700b;
    public final org.telegram.ui.ActionBar.m5 f30701c;
    public final org.telegram.ui.ActionBar.m5 d;
    public TLRPC.TL_chatInviteImporter f30702e;
    public boolean f30703f;

    public g5(Context context, final f5 f5Var, boolean z10) {
        super(context);
        int i7;
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
        this.f30699a = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(getContext());
        this.f30700b = q9Var;
        org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(getContext());
        this.f30701c = m5Var;
        org.telegram.ui.ActionBar.m5 m5Var2 = new org.telegram.ui.ActionBar.m5(getContext());
        this.d = m5Var2;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(23.0f));
        if (hd.f24444a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        addView(q9Var, c8.ma.d(46, 46.0f, i7, 12.0f, 8.0f, 12.0f, 0.0f));
        if (hd.f24444a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        m5Var.setGravity(i10);
        m5Var.setMaxLines(1);
        org.telegram.ui.ActionBar.t6.X(m5Var, org.telegram.ui.ActionBar.m6.G6, null);
        m5Var.setTextSize(17);
        m5Var.setTypeface(org.telegram.messenger.g0.o());
        boolean z11 = hd.f24444a0;
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
        addView(m5Var, c8.ma.d(-1, -2.0f, 48, f10, 12.0f, f11, 0.0f));
        if (hd.f24444a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        m5Var2.setGravity(i11);
        m5Var2.setMaxLines(1);
        org.telegram.ui.ActionBar.t6.X(m5Var2, org.telegram.ui.ActionBar.m6.f29773y6, null);
        m5Var2.setTextSize(14);
        boolean z12 = hd.f24444a0;
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
        addView(m5Var2, c8.ma.d(-1, -2.0f, 48, f12, 36.0f, f13, 0.0f));
        int L2 = org.telegram.messenger.g0.L(17.0f);
        TextView textView = new TextView(getContext());
        textView.setBackground(org.telegram.ui.ActionBar.a6.f(org.telegram.ui.ActionBar.m6.Fi, 16.0f));
        if (hd.f24444a0) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        textView.setGravity(i12 | 16);
        textView.setMaxLines(1);
        textView.setPadding(L2, 0, L2, 0);
        if (z10) {
            i13 = 2131754375;
        } else {
            i13 = 2131754370;
        }
        textView.setText(hd.N0(i13, null));
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.Ji, null);
        textView.setTextSize(14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final g5 f30599b;

            {
                this.f30599b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        g5 g5Var = this.f30599b;
                        f5 f5Var2 = f5Var;
                        if (f5Var2 != null) {
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = g5Var.f30702e;
                            if (tL_chatInviteImporter != null) {
                                ((zh.l) f5Var2).d(tL_chatInviteImporter, true);
                                return;
                            }
                            return;
                        }
                        g5Var.getClass();
                        return;
                    default:
                        g5 g5Var2 = this.f30599b;
                        f5 f5Var3 = f5Var;
                        if (f5Var3 != null) {
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = g5Var2.f30702e;
                            if (tL_chatInviteImporter2 != null) {
                                ((zh.l) f5Var3).d(tL_chatInviteImporter2, false);
                                return;
                            }
                            return;
                        }
                        g5Var2.getClass();
                        return;
                }
            }
        });
        boolean z13 = hd.f24444a0;
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
        addView(textView, c8.ma.d(-2, 32.0f, i14, f14, 62.0f, f15, 0.0f));
        float measureText = textView.getPaint().measureText(textView.getText().toString()) + (L2 * 2);
        TextView textView2 = new TextView(getContext());
        int L3 = org.telegram.messenger.g0.L(16.0f);
        textView2.setBackground(org.telegram.ui.ActionBar.m6.k0(L3, L3, L3, L3, 0, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29473i6, false), -16777216));
        if (hd.f24444a0) {
            i15 = 5;
        } else {
            i15 = 3;
        }
        textView2.setGravity(i15 | 16);
        textView2.setMaxLines(1);
        textView2.setPadding(L2, 0, L2, 0);
        textView2.setText(hd.N0(2131751357, null));
        org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.f29563n6, null);
        textView2.setTextSize(14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final g5 f30599b;

            {
                this.f30599b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        g5 g5Var = this.f30599b;
                        f5 f5Var2 = f5Var;
                        if (f5Var2 != null) {
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = g5Var.f30702e;
                            if (tL_chatInviteImporter != null) {
                                ((zh.l) f5Var2).d(tL_chatInviteImporter, true);
                                return;
                            }
                            return;
                        }
                        g5Var.getClass();
                        return;
                    default:
                        g5 g5Var2 = this.f30599b;
                        f5 f5Var3 = f5Var;
                        if (f5Var3 != null) {
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = g5Var2.f30702e;
                            if (tL_chatInviteImporter2 != null) {
                                ((zh.l) f5Var3).d(tL_chatInviteImporter2, false);
                                return;
                            }
                            return;
                        }
                        g5Var2.getClass();
                        return;
                }
            }
        });
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, org.telegram.messenger.g0.L(32.0f), hd.f24444a0 ? 5 : 3);
        layoutParams.topMargin = org.telegram.messenger.g0.L(62.0f);
        if (hd.f24444a0) {
            L = 0;
        } else {
            L = (int) (org.telegram.messenger.g0.L(79.0f) + measureText);
        }
        layoutParams.leftMargin = L;
        layoutParams.rightMargin = hd.f24444a0 ? (int) (measureText + org.telegram.messenger.g0.L(79.0f)) : 0;
        addView(textView2, layoutParams);
    }

    public org.telegram.ui.Components.q9 getAvatarImageView() {
        return this.f30700b;
    }

    public TLRPC.TL_chatInviteImporter getImporter() {
        return this.f30702e;
    }

    public String getStatus() {
        return this.d.getText().toString();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i7;
        super.onDraw(canvas);
        if (this.f30703f) {
            if (hd.f24444a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(72.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (hd.f24444a0) {
                i7 = org.telegram.messenger.g0.L(72.0f);
            } else {
                i7 = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.m6.f29504k0);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(107.0f), 1073741824));
    }
}
