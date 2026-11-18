package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;
public final class xu extends FrameLayout {
    public final k80 f42184a;
    public final TextView f42185b;
    public final TextView f42186c;
    public final TextView d;
    public final ug.s0 f42187e;
    public final org.telegram.ui.ActionBar.r0 f42188f;
    public final boolean h;
    public final bi.y8 f42189n;
    public TLRPC.TL_messages_stickerSet f42190r;
    public boolean f42191s;
    public float f42192w;
    public ValueAnimator f42193x;
    public final bv f42194y;

    public xu(bv bvVar, Context context, boolean z10) {
        super(context);
        float f10;
        float f11;
        float f12;
        this.f42194y = bvVar;
        this.f42189n = new bi.y8(this, 7);
        this.f42191s = false;
        this.f42192w = 0.0f;
        this.h = z10;
        if (!z10) {
            Pattern pattern = bv.Q1;
            float f13 = 8.0f;
            if (!org.telegram.messenger.j10.i(bvVar.f30187a).q()) {
                f12 = 16.0f;
                f11 = 28.0f;
                ug.s0 s0Var = new ug.s0(org.telegram.messenger.g0.L(4.0f), context, bvVar.J0, false);
                this.f42187e = s0Var;
                s0Var.b(org.telegram.messenger.gd.M0(2131743639, null), new View.OnClickListener(this) {
                    public final xu f41437b;

                    {
                        this.f41437b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        int i7 = r2;
                        xu xuVar = this.f41437b;
                        switch (i7) {
                            case 0:
                                bv bvVar2 = xuVar.f42194y;
                                bvVar2.L1 = SystemClock.elapsedRealtime();
                                bvVar2.N0();
                                return;
                            case 1:
                                bv.K0(xuVar.f42189n, xuVar.f42190r, true, null, null);
                                xuVar.a(true, true);
                                return;
                            case 2:
                                bi.y8 y8Var = xuVar.f42189n;
                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = xuVar.f42190r;
                                mo moVar = new mo(xuVar, 13);
                                Pattern pattern2 = bv.Q1;
                                if (y8Var != null && tL_messages_stickerSet != null && y8Var.getFragmentView() != null) {
                                    org.telegram.messenger.ri.d0(y8Var.getCurrentAccount()).l2(y8Var.getFragmentView().getContext(), tL_messages_stickerSet, null, 0, y8Var, null, true, true, moVar, true);
                                }
                                xuVar.a(false, true);
                                return;
                            default:
                                xuVar.f42188f.V(null, null);
                                return;
                        }
                    }
                }, false);
                s0Var.setIcon(2131624315);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) s0Var.getIconView().getLayoutParams();
                marginLayoutParams.leftMargin = org.telegram.messenger.g0.L(1.0f);
                marginLayoutParams.topMargin = org.telegram.messenger.g0.L(1.0f);
                int L = org.telegram.messenger.g0.L(20.0f);
                marginLayoutParams.height = L;
                marginLayoutParams.width = L;
                ((ViewGroup.MarginLayoutParams) s0Var.getTextView().getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(3.0f);
                s0Var.getChildAt(0).setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                addView(s0Var, c8.ma.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
                s0Var.measure(View.MeasureSpec.makeMeasureSpec(99999, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(28.0f), 1073741824));
                f13 = (org.telegram.messenger.g0.L(16.0f) + s0Var.getMeasuredWidth()) / org.telegram.messenger.g0.f24117p;
            } else {
                f11 = 28.0f;
                f12 = 16.0f;
            }
            float f14 = f13;
            TextView textView = new TextView(context);
            this.f42186c = textView;
            textView.setTypeface(org.telegram.messenger.g0.o());
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.Ji, bvVar.J0);
            int i7 = org.telegram.ui.ActionBar.n6.Fi;
            org.telegram.ui.Cells.y e10 = org.telegram.ui.ActionBar.b6.e(org.telegram.ui.ActionBar.n6.w0(i7, bvVar.J0), 14.0f);
            org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i7);
            org.telegram.ui.ActionBar.q6 e11 = org.telegram.ui.ActionBar.u6.e(i7);
            org.telegram.ui.ActionBar.i6 i6Var = bvVar.J0;
            textView.setBackground(e10);
            org.telegram.ui.ActionBar.u6.j(textView, e10, M, e11, i6Var);
            textView.setText(org.telegram.messenger.gd.M0(2131754484, null));
            textView.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
            textView.setGravity(17);
            textView.setOnClickListener(new View.OnClickListener(this) {
                public final xu f41437b;

                {
                    this.f41437b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i72 = r2;
                    xu xuVar = this.f41437b;
                    switch (i72) {
                        case 0:
                            bv bvVar2 = xuVar.f42194y;
                            bvVar2.L1 = SystemClock.elapsedRealtime();
                            bvVar2.N0();
                            return;
                        case 1:
                            bv.K0(xuVar.f42189n, xuVar.f42190r, true, null, null);
                            xuVar.a(true, true);
                            return;
                        case 2:
                            bi.y8 y8Var = xuVar.f42189n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = xuVar.f42190r;
                            mo moVar = new mo(xuVar, 13);
                            Pattern pattern2 = bv.Q1;
                            if (y8Var != null && tL_messages_stickerSet != null && y8Var.getFragmentView() != null) {
                                org.telegram.messenger.ri.d0(y8Var.getCurrentAccount()).l2(y8Var.getFragmentView().getContext(), tL_messages_stickerSet, null, 0, y8Var, null, true, true, moVar, true);
                            }
                            xuVar.a(false, true);
                            return;
                        default:
                            xuVar.f42188f.V(null, null);
                            return;
                    }
                }
            });
            addView(textView, c8.ma.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
            textView.measure(View.MeasureSpec.makeMeasureSpec(99999, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f11), 1073741824));
            float max = Math.max(f14, (org.telegram.messenger.g0.L(f12) + textView.getMeasuredWidth()) / org.telegram.messenger.g0.f24117p);
            TextView textView2 = new TextView(context);
            this.d = textView2;
            textView2.setTypeface(org.telegram.messenger.g0.o());
            org.telegram.ui.ActionBar.u6.U(textView2, i7, bvVar.J0);
            org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.n6.a0(org.telegram.ui.ActionBar.n6.w0(i7, bvVar.J0) & 268435455, 4, 4);
            org.telegram.ui.ActionBar.q6 g10 = org.telegram.ui.ActionBar.u6.g(i7, 15);
            org.telegram.ui.ActionBar.i6 i6Var2 = bvVar.J0;
            textView2.setBackground(a02);
            org.telegram.ui.ActionBar.u6.j(textView2, a02, null, g10, i6Var2);
            textView2.setText(org.telegram.messenger.gd.M0(2131744620, null));
            textView2.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
            textView2.setGravity(17);
            textView2.setOnClickListener(new View.OnClickListener(this) {
                public final xu f41437b;

                {
                    this.f41437b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i72 = r2;
                    xu xuVar = this.f41437b;
                    switch (i72) {
                        case 0:
                            bv bvVar2 = xuVar.f42194y;
                            bvVar2.L1 = SystemClock.elapsedRealtime();
                            bvVar2.N0();
                            return;
                        case 1:
                            bv.K0(xuVar.f42189n, xuVar.f42190r, true, null, null);
                            xuVar.a(true, true);
                            return;
                        case 2:
                            bi.y8 y8Var = xuVar.f42189n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = xuVar.f42190r;
                            mo moVar = new mo(xuVar, 13);
                            Pattern pattern2 = bv.Q1;
                            if (y8Var != null && tL_messages_stickerSet != null && y8Var.getFragmentView() != null) {
                                org.telegram.messenger.ri.d0(y8Var.getCurrentAccount()).l2(y8Var.getFragmentView().getContext(), tL_messages_stickerSet, null, 0, y8Var, null, true, true, moVar, true);
                            }
                            xuVar.a(false, true);
                            return;
                        default:
                            xuVar.f42188f.V(null, null);
                            return;
                    }
                }
            });
            textView2.setClickable(false);
            addView(textView2, c8.ma.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
            textView2.setScaleX(0.0f);
            textView2.setScaleY(0.0f);
            textView2.setAlpha(0.0f);
            textView2.measure(View.MeasureSpec.makeMeasureSpec(99999, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f11), 1073741824));
            f10 = Math.max(max, (org.telegram.messenger.g0.L(f12) + textView2.getMeasuredWidth()) / org.telegram.messenger.g0.f24117p);
        } else {
            f10 = 32.0f;
        }
        float f15 = f10;
        Pattern pattern2 = bv.Q1;
        k80 k80Var = new k80(context, bvVar.J0);
        this.f42184a = k80Var;
        k80Var.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        k80Var.setTypeface(org.telegram.messenger.g0.o());
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        k80Var.setEllipsize(truncateAt);
        k80Var.setSingleLine(true);
        k80Var.setLines(1);
        org.telegram.ui.ActionBar.u6.G(k80Var, org.telegram.ui.ActionBar.n6.J6, bvVar.J0);
        org.telegram.ui.ActionBar.u6.U(k80Var, org.telegram.ui.ActionBar.n6.f29502j5, bvVar.J0);
        if (z10) {
            k80Var.setTextSize(1, 20.0f);
            addView(k80Var, c8.ma.i(-1.0f, -2.0f, 8388659, 12.0f, 11.0f, f15, 0.0f));
        } else {
            k80Var.setTextSize(1, 17.0f);
            addView(k80Var, c8.ma.i(-1.0f, -2.0f, 8388659, 6.0f, 10.0f, f15, 0.0f));
        }
        if (!z10) {
            TextView textView3 = new TextView(context);
            this.f42185b = textView3;
            textView3.setTextSize(1, 13.0f);
            org.telegram.ui.ActionBar.u6.U(textView3, org.telegram.ui.ActionBar.n6.f29633q5, bvVar.J0);
            textView3.setEllipsize(truncateAt);
            textView3.setSingleLine(true);
            textView3.setLines(1);
            addView(textView3, c8.ma.i(-1.0f, -2.0f, 8388659, 8.0f, 31.66f, f15, 0.0f));
        }
        if (z10) {
            org.telegram.ui.ActionBar.r0 r0Var = new org.telegram.ui.ActionBar.r0(context, null, 0, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Aj, bvVar.J0), false, bvVar.J0);
            this.f42188f = r0Var;
            r0Var.setLongClickEnabled(false);
            r0Var.setSubMenuOpenSide(2);
            r0Var.setIcon(2131231244);
            int i10 = org.telegram.ui.ActionBar.n6.Ej;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i10, bvVar.J0), 1, -1);
            org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i10);
            org.telegram.ui.ActionBar.i6 i6Var3 = bvVar.J0;
            r0Var.setBackground(h02);
            org.telegram.ui.ActionBar.u6.j(r0Var, h02, null, M2, i6Var3);
            addView(r0Var, c8.ma.d(40, 40.0f, 53, 0.0f, 5.0f, 5.0f - (bvVar.f30225u0 / org.telegram.messenger.g0.f24117p), 0.0f));
            r0Var.e(1, 2131232365, org.telegram.messenger.gd.M0(2131744611, null));
            r0Var.e(2, 2131232205, org.telegram.messenger.gd.M0(2131751751, null));
            r0Var.setOnClickListener(new View.OnClickListener(this) {
                public final xu f41437b;

                {
                    this.f41437b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i72 = r2;
                    xu xuVar = this.f41437b;
                    switch (i72) {
                        case 0:
                            bv bvVar2 = xuVar.f42194y;
                            bvVar2.L1 = SystemClock.elapsedRealtime();
                            bvVar2.N0();
                            return;
                        case 1:
                            bv.K0(xuVar.f42189n, xuVar.f42190r, true, null, null);
                            xuVar.a(true, true);
                            return;
                        case 2:
                            bi.y8 y8Var = xuVar.f42189n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = xuVar.f42190r;
                            mo moVar = new mo(xuVar, 13);
                            Pattern pattern22 = bv.Q1;
                            if (y8Var != null && tL_messages_stickerSet != null && y8Var.getFragmentView() != null) {
                                org.telegram.messenger.ri.d0(y8Var.getCurrentAccount()).l2(y8Var.getFragmentView().getContext(), tL_messages_stickerSet, null, 0, y8Var, null, true, true, moVar, true);
                            }
                            xuVar.a(false, true);
                            return;
                        default:
                            xuVar.f42188f.V(null, null);
                            return;
                    }
                }
            });
            r0Var.setDelegate(new b0(bvVar, 28));
            r0Var.setContentDescription(org.telegram.messenger.gd.M0(2131754839, null));
        }
    }

    public final void a(boolean z10, boolean z11) {
        TextView textView;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        if (this.f42191s != z10) {
            this.f42191s = z10;
            ValueAnimator valueAnimator = this.f42193x;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f42193x = null;
            }
            TextView textView2 = this.f42186c;
            if (textView2 != null && (textView = this.d) != null) {
                textView2.setClickable(!z10);
                textView.setClickable(z10);
                float f16 = 0.0f;
                if (z11) {
                    float f17 = this.f42192w;
                    if (z10) {
                        f16 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f17, f16);
                    this.f42193x = ofFloat;
                    ofFloat.addUpdateListener(new w(this, 19));
                    this.f42193x.setInterpolator(lr.h);
                    this.f42193x.setDuration(250L);
                    this.f42193x.start();
                    return;
                }
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                this.f42192w = f10;
                if (z10) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                textView2.setScaleX(f11);
                if (z10) {
                    f12 = 0.0f;
                } else {
                    f12 = 1.0f;
                }
                textView2.setScaleY(f12);
                if (z10) {
                    f13 = 0.0f;
                } else {
                    f13 = 1.0f;
                }
                textView2.setAlpha(f13);
                if (z10) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                textView.setScaleX(f14);
                if (z10) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                textView.setScaleY(f15);
                if (z10) {
                    f16 = 1.0f;
                }
                textView.setAlpha(f16);
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        if (this.h) {
            f10 = 42.0f;
        } else {
            f10 = 56.0f;
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f10), 1073741824));
    }
}
