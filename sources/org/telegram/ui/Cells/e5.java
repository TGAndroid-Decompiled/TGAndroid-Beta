package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.id;
import org.telegram.tgnet.TLRPC;
public final class e5 extends FrameLayout {
    public final org.telegram.ui.Components.w8 f29066a;
    public final org.telegram.ui.Components.l9 f29067b;
    public final org.telegram.ui.ActionBar.l5 f29068c;
    public final org.telegram.ui.ActionBar.l5 d;
    public TLRPC.TL_chatInviteImporter f29069e;
    public boolean f29070f;

    public e5(Context context, final d5 d5Var, boolean z9) {
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
        this.f29066a = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.g6) null);
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(getContext());
        this.f29067b = l9Var;
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(getContext());
        this.f29068c = l5Var;
        org.telegram.ui.ActionBar.l5 l5Var2 = new org.telegram.ui.ActionBar.l5(getContext());
        this.d = l5Var2;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(23.0f));
        if (id.f23157a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        addView(l9Var, c8.ha.d(46, 46.0f, i7, 12.0f, 8.0f, 12.0f, 0.0f));
        if (id.f23157a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        l5Var.setGravity(i10);
        l5Var.setMaxLines(1);
        org.telegram.ui.ActionBar.s6.X(l5Var, org.telegram.ui.ActionBar.l6.G6, null);
        l5Var.setTextSize(17);
        l5Var.setTypeface(org.telegram.messenger.g0.o());
        boolean z10 = id.f23157a0;
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
        addView(l5Var, c8.ha.d(-1, -2.0f, 48, f10, 12.0f, f11, 0.0f));
        if (id.f23157a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        l5Var2.setGravity(i11);
        l5Var2.setMaxLines(1);
        org.telegram.ui.ActionBar.s6.X(l5Var2, org.telegram.ui.ActionBar.l6.f28257y6, null);
        l5Var2.setTextSize(14);
        boolean z11 = id.f23157a0;
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
        addView(l5Var2, c8.ha.d(-1, -2.0f, 48, f12, 36.0f, f13, 0.0f));
        int L2 = org.telegram.messenger.g0.L(17.0f);
        TextView textView = new TextView(getContext());
        textView.setBackground(org.telegram.ui.ActionBar.a6.f(org.telegram.ui.ActionBar.l6.Ci, 16.0f));
        if (id.f23157a0) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        textView.setGravity(i12 | 16);
        textView.setMaxLines(1);
        textView.setPadding(L2, 0, L2, 0);
        if (z9) {
            i13 = 2131754378;
        } else {
            i13 = 2131754373;
        }
        textView.setText(id.M0(i13, null));
        org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.Gi, null);
        textView.setTextSize(14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final e5 f28992b;

            {
                this.f28992b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        e5 e5Var = this.f28992b;
                        d5 d5Var2 = d5Var;
                        if (d5Var2 != null) {
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = e5Var.f29069e;
                            if (tL_chatInviteImporter != null) {
                                ((yh.m) d5Var2).d(tL_chatInviteImporter, true);
                                return;
                            }
                            return;
                        }
                        e5Var.getClass();
                        return;
                    default:
                        e5 e5Var2 = this.f28992b;
                        d5 d5Var3 = d5Var;
                        if (d5Var3 != null) {
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = e5Var2.f29069e;
                            if (tL_chatInviteImporter2 != null) {
                                ((yh.m) d5Var3).d(tL_chatInviteImporter2, false);
                                return;
                            }
                            return;
                        }
                        e5Var2.getClass();
                        return;
                }
            }
        });
        boolean z12 = id.f23157a0;
        if (z12) {
            i14 = 5;
        } else {
            i14 = 3;
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
        addView(textView, c8.ha.d(-2, 32.0f, i14, f14, 62.0f, f15, 0.0f));
        float measureText = textView.getPaint().measureText(textView.getText().toString()) + (L2 * 2);
        TextView textView2 = new TextView(getContext());
        int L3 = org.telegram.messenger.g0.L(16.0f);
        textView2.setBackground(org.telegram.ui.ActionBar.l6.k0(L3, L3, L3, L3, 0, org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27957i6, false), -16777216));
        if (id.f23157a0) {
            i15 = 5;
        } else {
            i15 = 3;
        }
        textView2.setGravity(i15 | 16);
        textView2.setMaxLines(1);
        textView2.setPadding(L2, 0, L2, 0);
        textView2.setText(id.M0(2131751369, null));
        org.telegram.ui.ActionBar.s6.U(textView2, org.telegram.ui.ActionBar.l6.f28047n6, null);
        textView2.setTextSize(14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final e5 f28992b;

            {
                this.f28992b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        e5 e5Var = this.f28992b;
                        d5 d5Var2 = d5Var;
                        if (d5Var2 != null) {
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = e5Var.f29069e;
                            if (tL_chatInviteImporter != null) {
                                ((yh.m) d5Var2).d(tL_chatInviteImporter, true);
                                return;
                            }
                            return;
                        }
                        e5Var.getClass();
                        return;
                    default:
                        e5 e5Var2 = this.f28992b;
                        d5 d5Var3 = d5Var;
                        if (d5Var3 != null) {
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = e5Var2.f29069e;
                            if (tL_chatInviteImporter2 != null) {
                                ((yh.m) d5Var3).d(tL_chatInviteImporter2, false);
                                return;
                            }
                            return;
                        }
                        e5Var2.getClass();
                        return;
                }
            }
        });
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, org.telegram.messenger.g0.L(32.0f), id.f23157a0 ? 5 : 3);
        layoutParams.topMargin = org.telegram.messenger.g0.L(62.0f);
        if (id.f23157a0) {
            L = 0;
        } else {
            L = (int) (org.telegram.messenger.g0.L(79.0f) + measureText);
        }
        layoutParams.leftMargin = L;
        layoutParams.rightMargin = id.f23157a0 ? (int) (measureText + org.telegram.messenger.g0.L(79.0f)) : 0;
        addView(textView2, layoutParams);
    }

    public org.telegram.ui.Components.l9 getAvatarImageView() {
        return this.f29067b;
    }

    public TLRPC.TL_chatInviteImporter getImporter() {
        return this.f29069e;
    }

    public String getStatus() {
        return this.d.getText().toString();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i7;
        super.onDraw(canvas);
        if (this.f29070f) {
            if (id.f23157a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(72.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (id.f23157a0) {
                i7 = org.telegram.messenger.g0.L(72.0f);
            } else {
                i7 = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.l6.f27988k0);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(107.0f), 1073741824));
    }
}
