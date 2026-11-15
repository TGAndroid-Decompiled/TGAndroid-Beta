package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLRPC;
public final class e5 extends FrameLayout {
    public final org.telegram.ui.Components.t8 f30176a;
    public final org.telegram.ui.Components.i9 f30177b;
    public final org.telegram.ui.ActionBar.j5 f30178c;
    public final org.telegram.ui.ActionBar.j5 d;
    public TLRPC.TL_chatInviteImporter f30179e;
    public boolean f30180f;

    public e5(Context context, final d5 d5Var, boolean z10) {
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
        this.f30176a = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(getContext());
        this.f30177b = i9Var;
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(getContext());
        this.f30178c = j5Var;
        org.telegram.ui.ActionBar.j5 j5Var2 = new org.telegram.ui.ActionBar.j5(getContext());
        this.d = j5Var2;
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(23.0f));
        if (hd.f24101a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        addView(i9Var, c8.ja.d(46, 46.0f, i7, 12.0f, 8.0f, 12.0f, 0.0f));
        if (hd.f24101a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        j5Var.setGravity(i10);
        j5Var.setMaxLines(1);
        org.telegram.ui.ActionBar.q6.X(j5Var, org.telegram.ui.ActionBar.j6.G6, null);
        j5Var.setTextSize(17);
        j5Var.setTypeface(org.telegram.messenger.g0.o());
        boolean z11 = hd.f24101a0;
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
        addView(j5Var, c8.ja.d(-1, -2.0f, 48, f10, 12.0f, f11, 0.0f));
        if (hd.f24101a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        j5Var2.setGravity(i11);
        j5Var2.setMaxLines(1);
        org.telegram.ui.ActionBar.q6.X(j5Var2, org.telegram.ui.ActionBar.j6.f29241y6, null);
        j5Var2.setTextSize(14);
        boolean z12 = hd.f24101a0;
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
        addView(j5Var2, c8.ja.d(-1, -2.0f, 48, f12, 36.0f, f13, 0.0f));
        int L2 = org.telegram.messenger.g0.L(17.0f);
        TextView textView = new TextView(getContext());
        textView.setBackground(org.telegram.ui.ActionBar.y5.f(org.telegram.ui.ActionBar.j6.Fi, 16.0f));
        if (hd.f24101a0) {
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
        textView.setText(hd.M0(i13, null));
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.Ji, null);
        textView.setTextSize(14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final e5 f30103b;

            {
                this.f30103b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        e5 e5Var = this.f30103b;
                        d5 d5Var2 = d5Var;
                        if (d5Var2 != null) {
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = e5Var.f30179e;
                            if (tL_chatInviteImporter != null) {
                                ((zh.l) d5Var2).d(tL_chatInviteImporter, true);
                                return;
                            }
                            return;
                        }
                        e5Var.getClass();
                        return;
                    default:
                        e5 e5Var2 = this.f30103b;
                        d5 d5Var3 = d5Var;
                        if (d5Var3 != null) {
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = e5Var2.f30179e;
                            if (tL_chatInviteImporter2 != null) {
                                ((zh.l) d5Var3).d(tL_chatInviteImporter2, false);
                                return;
                            }
                            return;
                        }
                        e5Var2.getClass();
                        return;
                }
            }
        });
        boolean z13 = hd.f24101a0;
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
        addView(textView, c8.ja.d(-2, 32.0f, i14, f14, 62.0f, f15, 0.0f));
        float measureText = textView.getPaint().measureText(textView.getText().toString()) + (L2 * 2);
        TextView textView2 = new TextView(getContext());
        int L3 = org.telegram.messenger.g0.L(16.0f);
        textView2.setBackground(org.telegram.ui.ActionBar.j6.k0(L3, L3, L3, L3, 0, org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28941i6, false), -16777216));
        if (hd.f24101a0) {
            i15 = 5;
        } else {
            i15 = 3;
        }
        textView2.setGravity(i15 | 16);
        textView2.setMaxLines(1);
        textView2.setPadding(L2, 0, L2, 0);
        textView2.setText(hd.M0(2131751369, null));
        org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.f29031n6, null);
        textView2.setTextSize(14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final e5 f30103b;

            {
                this.f30103b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        e5 e5Var = this.f30103b;
                        d5 d5Var2 = d5Var;
                        if (d5Var2 != null) {
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = e5Var.f30179e;
                            if (tL_chatInviteImporter != null) {
                                ((zh.l) d5Var2).d(tL_chatInviteImporter, true);
                                return;
                            }
                            return;
                        }
                        e5Var.getClass();
                        return;
                    default:
                        e5 e5Var2 = this.f30103b;
                        d5 d5Var3 = d5Var;
                        if (d5Var3 != null) {
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = e5Var2.f30179e;
                            if (tL_chatInviteImporter2 != null) {
                                ((zh.l) d5Var3).d(tL_chatInviteImporter2, false);
                                return;
                            }
                            return;
                        }
                        e5Var2.getClass();
                        return;
                }
            }
        });
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, org.telegram.messenger.g0.L(32.0f), hd.f24101a0 ? 5 : 3);
        layoutParams.topMargin = org.telegram.messenger.g0.L(62.0f);
        if (hd.f24101a0) {
            L = 0;
        } else {
            L = (int) (org.telegram.messenger.g0.L(79.0f) + measureText);
        }
        layoutParams.leftMargin = L;
        layoutParams.rightMargin = hd.f24101a0 ? (int) (measureText + org.telegram.messenger.g0.L(79.0f)) : 0;
        addView(textView2, layoutParams);
    }

    public org.telegram.ui.Components.i9 getAvatarImageView() {
        return this.f30177b;
    }

    public TLRPC.TL_chatInviteImporter getImporter() {
        return this.f30179e;
    }

    public String getStatus() {
        return this.d.getText().toString();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i7;
        super.onDraw(canvas);
        if (this.f30180f) {
            if (hd.f24101a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(72.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (hd.f24101a0) {
                i7 = org.telegram.messenger.g0.L(72.0f);
            } else {
                i7 = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f28972k0);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(107.0f), 1073741824));
    }
}
