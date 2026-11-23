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
    public final j80 f42192a;
    public final TextView f42193b;
    public final TextView f42194c;
    public final TextView d;
    public final ug.r0 f42195e;
    public final org.telegram.ui.ActionBar.q0 f42196f;
    public final boolean h;
    public final bi.e9 f42197n;
    public TLRPC.TL_messages_stickerSet f42198r;
    public boolean f42199s;
    public float f42200w;
    public ValueAnimator f42201x;
    public final bv f42202y;

    public xu(bv bvVar, Context context, boolean z10) {
        super(context);
        float f10;
        float f11;
        float f12;
        this.f42202y = bvVar;
        this.f42197n = new bi.e9(this, 7);
        this.f42199s = false;
        this.f42200w = 0.0f;
        this.h = z10;
        if (!z10) {
            Pattern pattern = bv.Q1;
            float f13 = 8.0f;
            if (!org.telegram.messenger.i10.i(bvVar.f30223a).q()) {
                f12 = 16.0f;
                f11 = 28.0f;
                ug.r0 r0Var = new ug.r0(org.telegram.messenger.g0.L(4.0f), context, bvVar.J0, false);
                this.f42195e = r0Var;
                r0Var.b(org.telegram.messenger.gd.N0(2131743629, null), new View.OnClickListener(this) {
                    public final xu f41436b;

                    {
                        this.f41436b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        int i7 = r2;
                        xu xuVar = this.f41436b;
                        switch (i7) {
                            case 0:
                                bv bvVar2 = xuVar.f42202y;
                                bvVar2.L1 = SystemClock.elapsedRealtime();
                                bvVar2.N0();
                                return;
                            case 1:
                                bv.K0(xuVar.f42197n, xuVar.f42198r, true, null, null);
                                xuVar.a(true, true);
                                return;
                            case 2:
                                bi.e9 e9Var = xuVar.f42197n;
                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = xuVar.f42198r;
                                lo loVar = new lo(xuVar, 13);
                                Pattern pattern2 = bv.Q1;
                                if (e9Var != null && tL_messages_stickerSet != null && e9Var.getFragmentView() != null) {
                                    org.telegram.messenger.ri.d0(e9Var.getCurrentAccount()).l2(e9Var.getFragmentView().getContext(), tL_messages_stickerSet, null, 0, e9Var, null, true, true, loVar, true);
                                }
                                xuVar.a(false, true);
                                return;
                            default:
                                xuVar.f42196f.V(null, null);
                                return;
                        }
                    }
                }, false);
                r0Var.setIcon(2131624315);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) r0Var.getIconView().getLayoutParams();
                marginLayoutParams.leftMargin = org.telegram.messenger.g0.L(1.0f);
                marginLayoutParams.topMargin = org.telegram.messenger.g0.L(1.0f);
                int L = org.telegram.messenger.g0.L(20.0f);
                marginLayoutParams.height = L;
                marginLayoutParams.width = L;
                ((ViewGroup.MarginLayoutParams) r0Var.getTextView().getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(3.0f);
                r0Var.getChildAt(0).setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                addView(r0Var, c8.na.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
                r0Var.measure(View.MeasureSpec.makeMeasureSpec(99999, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(28.0f), 1073741824));
                f13 = (org.telegram.messenger.g0.L(16.0f) + r0Var.getMeasuredWidth()) / org.telegram.messenger.g0.f24225p;
            } else {
                f11 = 28.0f;
                f12 = 16.0f;
            }
            float f14 = f13;
            TextView textView = new TextView(context);
            this.f42194c = textView;
            textView.setTypeface(org.telegram.messenger.g0.o());
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.Ji, bvVar.J0);
            int i7 = org.telegram.ui.ActionBar.n6.Fi;
            org.telegram.ui.Cells.y e10 = org.telegram.ui.ActionBar.b6.e(org.telegram.ui.ActionBar.n6.w0(i7, bvVar.J0), 14.0f);
            org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i7);
            org.telegram.ui.ActionBar.q6 e11 = org.telegram.ui.ActionBar.u6.e(i7);
            org.telegram.ui.ActionBar.i6 i6Var = bvVar.J0;
            textView.setBackground(e10);
            org.telegram.ui.ActionBar.u6.j(textView, e10, M, e11, i6Var);
            textView.setText(org.telegram.messenger.gd.N0(2131754483, null));
            textView.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
            textView.setGravity(17);
            textView.setOnClickListener(new View.OnClickListener(this) {
                public final xu f41436b;

                {
                    this.f41436b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i72 = r2;
                    xu xuVar = this.f41436b;
                    switch (i72) {
                        case 0:
                            bv bvVar2 = xuVar.f42202y;
                            bvVar2.L1 = SystemClock.elapsedRealtime();
                            bvVar2.N0();
                            return;
                        case 1:
                            bv.K0(xuVar.f42197n, xuVar.f42198r, true, null, null);
                            xuVar.a(true, true);
                            return;
                        case 2:
                            bi.e9 e9Var = xuVar.f42197n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = xuVar.f42198r;
                            lo loVar = new lo(xuVar, 13);
                            Pattern pattern2 = bv.Q1;
                            if (e9Var != null && tL_messages_stickerSet != null && e9Var.getFragmentView() != null) {
                                org.telegram.messenger.ri.d0(e9Var.getCurrentAccount()).l2(e9Var.getFragmentView().getContext(), tL_messages_stickerSet, null, 0, e9Var, null, true, true, loVar, true);
                            }
                            xuVar.a(false, true);
                            return;
                        default:
                            xuVar.f42196f.V(null, null);
                            return;
                    }
                }
            });
            addView(textView, c8.na.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
            textView.measure(View.MeasureSpec.makeMeasureSpec(99999, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f11), 1073741824));
            float max = Math.max(f14, (org.telegram.messenger.g0.L(f12) + textView.getMeasuredWidth()) / org.telegram.messenger.g0.f24225p);
            TextView textView2 = new TextView(context);
            this.d = textView2;
            textView2.setTypeface(org.telegram.messenger.g0.o());
            org.telegram.ui.ActionBar.u6.U(textView2, i7, bvVar.J0);
            org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.n6.a0(org.telegram.ui.ActionBar.n6.w0(i7, bvVar.J0) & 268435455, 4, 4);
            org.telegram.ui.ActionBar.q6 g10 = org.telegram.ui.ActionBar.u6.g(i7, 15);
            org.telegram.ui.ActionBar.i6 i6Var2 = bvVar.J0;
            textView2.setBackground(a02);
            org.telegram.ui.ActionBar.u6.j(textView2, a02, null, g10, i6Var2);
            textView2.setText(org.telegram.messenger.gd.N0(2131744614, null));
            textView2.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
            textView2.setGravity(17);
            textView2.setOnClickListener(new View.OnClickListener(this) {
                public final xu f41436b;

                {
                    this.f41436b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i72 = r2;
                    xu xuVar = this.f41436b;
                    switch (i72) {
                        case 0:
                            bv bvVar2 = xuVar.f42202y;
                            bvVar2.L1 = SystemClock.elapsedRealtime();
                            bvVar2.N0();
                            return;
                        case 1:
                            bv.K0(xuVar.f42197n, xuVar.f42198r, true, null, null);
                            xuVar.a(true, true);
                            return;
                        case 2:
                            bi.e9 e9Var = xuVar.f42197n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = xuVar.f42198r;
                            lo loVar = new lo(xuVar, 13);
                            Pattern pattern2 = bv.Q1;
                            if (e9Var != null && tL_messages_stickerSet != null && e9Var.getFragmentView() != null) {
                                org.telegram.messenger.ri.d0(e9Var.getCurrentAccount()).l2(e9Var.getFragmentView().getContext(), tL_messages_stickerSet, null, 0, e9Var, null, true, true, loVar, true);
                            }
                            xuVar.a(false, true);
                            return;
                        default:
                            xuVar.f42196f.V(null, null);
                            return;
                    }
                }
            });
            textView2.setClickable(false);
            addView(textView2, c8.na.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
            textView2.setScaleX(0.0f);
            textView2.setScaleY(0.0f);
            textView2.setAlpha(0.0f);
            textView2.measure(View.MeasureSpec.makeMeasureSpec(99999, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f11), 1073741824));
            f10 = Math.max(max, (org.telegram.messenger.g0.L(f12) + textView2.getMeasuredWidth()) / org.telegram.messenger.g0.f24225p);
        } else {
            f10 = 32.0f;
        }
        float f15 = f10;
        Pattern pattern2 = bv.Q1;
        j80 j80Var = new j80(context, bvVar.J0);
        this.f42192a = j80Var;
        j80Var.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        j80Var.setTypeface(org.telegram.messenger.g0.o());
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        j80Var.setEllipsize(truncateAt);
        j80Var.setSingleLine(true);
        j80Var.setLines(1);
        org.telegram.ui.ActionBar.u6.G(j80Var, org.telegram.ui.ActionBar.n6.J6, bvVar.J0);
        org.telegram.ui.ActionBar.u6.U(j80Var, org.telegram.ui.ActionBar.n6.f29559j5, bvVar.J0);
        if (z10) {
            j80Var.setTextSize(1, 20.0f);
            addView(j80Var, c8.na.i(-1.0f, -2.0f, 8388659, 12.0f, 11.0f, f15, 0.0f));
        } else {
            j80Var.setTextSize(1, 17.0f);
            addView(j80Var, c8.na.i(-1.0f, -2.0f, 8388659, 6.0f, 10.0f, f15, 0.0f));
        }
        if (!z10) {
            TextView textView3 = new TextView(context);
            this.f42193b = textView3;
            textView3.setTextSize(1, 13.0f);
            org.telegram.ui.ActionBar.u6.U(textView3, org.telegram.ui.ActionBar.n6.f29690q5, bvVar.J0);
            textView3.setEllipsize(truncateAt);
            textView3.setSingleLine(true);
            textView3.setLines(1);
            addView(textView3, c8.na.i(-1.0f, -2.0f, 8388659, 8.0f, 31.66f, f15, 0.0f));
        }
        if (z10) {
            org.telegram.ui.ActionBar.q0 q0Var = new org.telegram.ui.ActionBar.q0(context, null, 0, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Aj, bvVar.J0), false, bvVar.J0);
            this.f42196f = q0Var;
            q0Var.setLongClickEnabled(false);
            q0Var.setSubMenuOpenSide(2);
            q0Var.setIcon(2131231247);
            int i10 = org.telegram.ui.ActionBar.n6.Ej;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i10, bvVar.J0), 1, -1);
            org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i10);
            org.telegram.ui.ActionBar.i6 i6Var3 = bvVar.J0;
            q0Var.setBackground(h02);
            org.telegram.ui.ActionBar.u6.j(q0Var, h02, null, M2, i6Var3);
            addView(q0Var, c8.na.d(40, 40.0f, 53, 0.0f, 5.0f, 5.0f - (bvVar.f30261u0 / org.telegram.messenger.g0.f24225p), 0.0f));
            q0Var.e(1, 2131232368, org.telegram.messenger.gd.N0(2131744605, null));
            q0Var.e(2, 2131232208, org.telegram.messenger.gd.N0(2131751750, null));
            q0Var.setOnClickListener(new View.OnClickListener(this) {
                public final xu f41436b;

                {
                    this.f41436b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i72 = r2;
                    xu xuVar = this.f41436b;
                    switch (i72) {
                        case 0:
                            bv bvVar2 = xuVar.f42202y;
                            bvVar2.L1 = SystemClock.elapsedRealtime();
                            bvVar2.N0();
                            return;
                        case 1:
                            bv.K0(xuVar.f42197n, xuVar.f42198r, true, null, null);
                            xuVar.a(true, true);
                            return;
                        case 2:
                            bi.e9 e9Var = xuVar.f42197n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = xuVar.f42198r;
                            lo loVar = new lo(xuVar, 13);
                            Pattern pattern22 = bv.Q1;
                            if (e9Var != null && tL_messages_stickerSet != null && e9Var.getFragmentView() != null) {
                                org.telegram.messenger.ri.d0(e9Var.getCurrentAccount()).l2(e9Var.getFragmentView().getContext(), tL_messages_stickerSet, null, 0, e9Var, null, true, true, loVar, true);
                            }
                            xuVar.a(false, true);
                            return;
                        default:
                            xuVar.f42196f.V(null, null);
                            return;
                    }
                }
            });
            q0Var.setDelegate(new b0(bvVar, 28));
            q0Var.setContentDescription(org.telegram.messenger.gd.N0(2131754838, null));
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
        if (this.f42199s != z10) {
            this.f42199s = z10;
            ValueAnimator valueAnimator = this.f42201x;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f42201x = null;
            }
            TextView textView2 = this.f42194c;
            if (textView2 != null && (textView = this.d) != null) {
                textView2.setClickable(!z10);
                textView.setClickable(z10);
                float f16 = 0.0f;
                if (z11) {
                    float f17 = this.f42200w;
                    if (z10) {
                        f16 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f17, f16);
                    this.f42201x = ofFloat;
                    ofFloat.addUpdateListener(new w(this, 19));
                    this.f42201x.setInterpolator(kr.h);
                    this.f42201x.setDuration(250L);
                    this.f42201x.start();
                    return;
                }
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                this.f42200w = f10;
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
