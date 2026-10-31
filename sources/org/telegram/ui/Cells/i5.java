package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.cd;
import org.telegram.tgnet.TLRPC;
public final class i5 extends FrameLayout {
    public final org.telegram.ui.Components.r8 f22033a;
    public final org.telegram.ui.Components.g9 f22034b;
    public final org.telegram.ui.ActionBar.u5 f22035c;
    public final org.telegram.ui.ActionBar.u5 d;
    public TLRPC.TL_chatInviteImporter e;
    public boolean f22036f;

    public i5(Context context, final h5 h5Var, boolean z10) {
        super(context);
        int i10;
        int i11;
        float f7;
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
        int L;
        this.f22033a = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(getContext());
        this.f22034b = g9Var;
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(getContext());
        this.f22035c = u5Var;
        org.telegram.ui.ActionBar.u5 u5Var2 = new org.telegram.ui.ActionBar.u5(getContext());
        this.d = u5Var2;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(23.0f));
        if (cd.X) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(g9Var, w7.b6.d(46, 46.0f, i10, 12.0f, 8.0f, 12.0f, 0.0f));
        if (cd.X) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        u5Var.setGravity(i11);
        u5Var.setMaxLines(1);
        org.telegram.ui.ActionBar.a7.Y(u5Var, org.telegram.ui.ActionBar.t6.G6, null);
        u5Var.setTextSize(17);
        u5Var.setTypeface(org.telegram.messenger.i0.o());
        boolean z11 = cd.X;
        if (z11) {
            f7 = 12.0f;
        } else {
            f7 = 74.0f;
        }
        if (z11) {
            f10 = 74.0f;
        } else {
            f10 = 12.0f;
        }
        addView(u5Var, w7.b6.d(-1, -2.0f, 48, f7, 12.0f, f10, 0.0f));
        if (cd.X) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        u5Var2.setGravity(i12);
        u5Var2.setMaxLines(1);
        org.telegram.ui.ActionBar.a7.Y(u5Var2, org.telegram.ui.ActionBar.t6.f21311y6, null);
        u5Var2.setTextSize(14);
        boolean z12 = cd.X;
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
        addView(u5Var2, w7.b6.d(-1, -2.0f, 48, f11, 36.0f, f12, 0.0f));
        int L2 = org.telegram.messenger.i0.L(17.0f);
        TextView textView = new TextView(getContext());
        textView.setBackground(org.telegram.ui.ActionBar.j6.f(org.telegram.ui.ActionBar.t6.Ci, 16.0f));
        if (cd.X) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        textView.setGravity(i13 | 16);
        textView.setMaxLines(1);
        textView.setPadding(L2, 0, L2, 0);
        if (z10) {
            i14 = 2131754378;
        } else {
            i14 = 2131754373;
        }
        textView.setText(cd.L0(i14, null));
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.Gi, null);
        textView.setTextSize(14.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final i5 f21921b;

            {
                this.f21921b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        i5 i5Var = this.f21921b;
                        h5 h5Var2 = h5Var;
                        if (h5Var2 != null) {
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = i5Var.e;
                            if (tL_chatInviteImporter != null) {
                                ((oh.q) h5Var2).d(tL_chatInviteImporter, true);
                                return;
                            }
                            return;
                        }
                        i5Var.getClass();
                        return;
                    default:
                        i5 i5Var2 = this.f21921b;
                        h5 h5Var3 = h5Var;
                        if (h5Var3 != null) {
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = i5Var2.e;
                            if (tL_chatInviteImporter2 != null) {
                                ((oh.q) h5Var3).d(tL_chatInviteImporter2, false);
                                return;
                            }
                            return;
                        }
                        i5Var2.getClass();
                        return;
                }
            }
        });
        boolean z13 = cd.X;
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
        addView(textView, w7.b6.d(-2, 32.0f, i15, f13, 62.0f, f14, 0.0f));
        float measureText = textView.getPaint().measureText(textView.getText().toString()) + (L2 * 2);
        TextView textView2 = new TextView(getContext());
        int L3 = org.telegram.messenger.i0.L(16.0f);
        textView2.setBackground(org.telegram.ui.ActionBar.t6.k0(L3, L3, L3, L3, 0, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21020i6, false), -16777216));
        if (cd.X) {
            i16 = 5;
        } else {
            i16 = 3;
        }
        textView2.setGravity(i16 | 16);
        textView2.setMaxLines(1);
        textView2.setPadding(L2, 0, L2, 0);
        textView2.setText(cd.L0(2131751370, null));
        org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.f21115n6, null);
        textView2.setTextSize(14.0f);
        textView2.setTypeface(org.telegram.messenger.i0.o());
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final i5 f21921b;

            {
                this.f21921b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        i5 i5Var = this.f21921b;
                        h5 h5Var2 = h5Var;
                        if (h5Var2 != null) {
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = i5Var.e;
                            if (tL_chatInviteImporter != null) {
                                ((oh.q) h5Var2).d(tL_chatInviteImporter, true);
                                return;
                            }
                            return;
                        }
                        i5Var.getClass();
                        return;
                    default:
                        i5 i5Var2 = this.f21921b;
                        h5 h5Var3 = h5Var;
                        if (h5Var3 != null) {
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = i5Var2.e;
                            if (tL_chatInviteImporter2 != null) {
                                ((oh.q) h5Var3).d(tL_chatInviteImporter2, false);
                                return;
                            }
                            return;
                        }
                        i5Var2.getClass();
                        return;
                }
            }
        });
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, org.telegram.messenger.i0.L(32.0f), cd.X ? 5 : 3);
        layoutParams.topMargin = org.telegram.messenger.i0.L(62.0f);
        if (cd.X) {
            L = 0;
        } else {
            L = (int) (org.telegram.messenger.i0.L(79.0f) + measureText);
        }
        layoutParams.leftMargin = L;
        layoutParams.rightMargin = cd.X ? (int) (measureText + org.telegram.messenger.i0.L(79.0f)) : 0;
        addView(textView2, layoutParams);
    }

    public org.telegram.ui.Components.g9 getAvatarImageView() {
        return this.f22034b;
    }

    public TLRPC.TL_chatInviteImporter getImporter() {
        return this.e;
    }

    public String getStatus() {
        return this.d.getText().toString();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i10;
        super.onDraw(canvas);
        if (this.f22036f) {
            if (cd.X) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.i0.L(72.0f);
            }
            float f7 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (cd.X) {
                i10 = org.telegram.messenger.i0.L(72.0f);
            } else {
                i10 = 0;
            }
            canvas.drawLine(f7, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.f21052k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(107.0f), 1073741824));
    }
}
