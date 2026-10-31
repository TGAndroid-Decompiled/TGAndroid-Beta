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
public final class yu extends FrameLayout {
    public final p80 f32791a;
    public final TextView f32792b;
    public final TextView f32793c;
    public final TextView d;
    public final kg.x0 e;
    public final org.telegram.ui.ActionBar.t0 f32794f;
    public final boolean h;
    public final kg.q1 f32795n;
    public TLRPC.TL_messages_stickerSet f32796r;
    public boolean f32797s;
    public float f32798w;
    public ValueAnimator f32799x;
    public final cv f32800y;

    public yu(cv cvVar, Context context, boolean z10) {
        super(context);
        float f7;
        float f10;
        this.f32800y = cvVar;
        this.f32795n = new kg.q1(this, 3);
        this.f32797s = false;
        this.f32798w = 0.0f;
        this.h = z10;
        if (!z10) {
            Pattern pattern = cv.M1;
            float f11 = 8.0f;
            if (!org.telegram.messenger.d20.i(cvVar.f21583a).q()) {
                f10 = 28.0f;
                kg.x0 x0Var = new kg.x0(org.telegram.messenger.i0.L(4.0f), context, cvVar.I0, false);
                this.e = x0Var;
                x0Var.b(org.telegram.messenger.cd.L0(2131743901, null), new View.OnClickListener(this) {
                    public final yu f32256b;

                    {
                        this.f32256b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        int i10 = r2;
                        yu yuVar = this.f32256b;
                        switch (i10) {
                            case 0:
                                cv cvVar2 = yuVar.f32800y;
                                cvVar2.H1 = SystemClock.elapsedRealtime();
                                cvVar2.M0();
                                return;
                            case 1:
                                cv.J0(yuVar.f32795n, yuVar.f32796r, true, null, null);
                                yuVar.a(true, true);
                                return;
                            case 2:
                                kg.q1 q1Var = yuVar.f32795n;
                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = yuVar.f32796r;
                                ho hoVar = new ho(yuVar, 13);
                                Pattern pattern2 = cv.M1;
                                if (q1Var != null && tL_messages_stickerSet != null && q1Var.getFragmentView() != null) {
                                    org.telegram.messenger.ui.b0(q1Var.getCurrentAccount()).g2(q1Var.getFragmentView().getContext(), tL_messages_stickerSet, null, 0, q1Var, null, true, true, hoVar, true);
                                }
                                yuVar.a(false, true);
                                return;
                            default:
                                yuVar.f32794f.U(null, null);
                                return;
                        }
                    }
                }, false);
                x0Var.setIcon(2131624312);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) x0Var.getIconView().getLayoutParams();
                marginLayoutParams.leftMargin = org.telegram.messenger.i0.L(1.0f);
                marginLayoutParams.topMargin = org.telegram.messenger.i0.L(1.0f);
                int L = org.telegram.messenger.i0.L(20.0f);
                marginLayoutParams.height = L;
                marginLayoutParams.width = L;
                ((ViewGroup.MarginLayoutParams) x0Var.getTextView().getLayoutParams()).leftMargin = org.telegram.messenger.i0.L(3.0f);
                x0Var.getChildAt(0).setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
                addView(x0Var, w7.b6.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
                x0Var.measure(View.MeasureSpec.makeMeasureSpec(99999, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(28.0f), 1073741824));
                f11 = (org.telegram.messenger.i0.L(16.0f) + x0Var.getMeasuredWidth()) / org.telegram.messenger.i0.f16025p;
            } else {
                f10 = 28.0f;
            }
            float f12 = f11;
            TextView textView = new TextView(context);
            this.f32793c = textView;
            textView.setTypeface(org.telegram.messenger.i0.o());
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.Gi, cvVar.I0);
            int i10 = org.telegram.ui.ActionBar.t6.Ci;
            org.telegram.ui.Cells.y e = org.telegram.ui.ActionBar.j6.e(org.telegram.ui.ActionBar.t6.w0(i10, cvVar.I0), 14.0f);
            org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i10);
            org.telegram.ui.ActionBar.w6 f13 = org.telegram.ui.ActionBar.a7.f(i10);
            org.telegram.ui.ActionBar.p6 p6Var = cvVar.I0;
            textView.setBackground(e);
            org.telegram.ui.ActionBar.a7.k(textView, e, N, f13, p6Var);
            textView.setText(org.telegram.messenger.cd.L0(2131754486, null));
            textView.setPadding(org.telegram.messenger.i0.L(18.0f), 0, org.telegram.messenger.i0.L(18.0f), 0);
            textView.setGravity(17);
            textView.setOnClickListener(new View.OnClickListener(this) {
                public final yu f32256b;

                {
                    this.f32256b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i102 = r2;
                    yu yuVar = this.f32256b;
                    switch (i102) {
                        case 0:
                            cv cvVar2 = yuVar.f32800y;
                            cvVar2.H1 = SystemClock.elapsedRealtime();
                            cvVar2.M0();
                            return;
                        case 1:
                            cv.J0(yuVar.f32795n, yuVar.f32796r, true, null, null);
                            yuVar.a(true, true);
                            return;
                        case 2:
                            kg.q1 q1Var = yuVar.f32795n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = yuVar.f32796r;
                            ho hoVar = new ho(yuVar, 13);
                            Pattern pattern2 = cv.M1;
                            if (q1Var != null && tL_messages_stickerSet != null && q1Var.getFragmentView() != null) {
                                org.telegram.messenger.ui.b0(q1Var.getCurrentAccount()).g2(q1Var.getFragmentView().getContext(), tL_messages_stickerSet, null, 0, q1Var, null, true, true, hoVar, true);
                            }
                            yuVar.a(false, true);
                            return;
                        default:
                            yuVar.f32794f.U(null, null);
                            return;
                    }
                }
            });
            addView(textView, w7.b6.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
            textView.measure(View.MeasureSpec.makeMeasureSpec(99999, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(f10), 1073741824));
            float max = Math.max(f12, (org.telegram.messenger.i0.L(16.0f) + textView.getMeasuredWidth()) / org.telegram.messenger.i0.f16025p);
            TextView textView2 = new TextView(context);
            this.d = textView2;
            textView2.setTypeface(org.telegram.messenger.i0.o());
            org.telegram.ui.ActionBar.a7.V(textView2, i10, cvVar.I0);
            org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.t6.a0(org.telegram.ui.ActionBar.t6.w0(i10, cvVar.I0) & 268435455, 4, 4);
            org.telegram.ui.ActionBar.w6 h = org.telegram.ui.ActionBar.a7.h(i10, 15);
            org.telegram.ui.ActionBar.p6 p6Var2 = cvVar.I0;
            textView2.setBackground(a02);
            org.telegram.ui.ActionBar.a7.k(textView2, a02, null, h, p6Var2);
            textView2.setText(org.telegram.messenger.cd.L0(2131744873, null));
            textView2.setPadding(org.telegram.messenger.i0.L(12.0f), 0, org.telegram.messenger.i0.L(12.0f), 0);
            textView2.setGravity(17);
            textView2.setOnClickListener(new View.OnClickListener(this) {
                public final yu f32256b;

                {
                    this.f32256b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i102 = r2;
                    yu yuVar = this.f32256b;
                    switch (i102) {
                        case 0:
                            cv cvVar2 = yuVar.f32800y;
                            cvVar2.H1 = SystemClock.elapsedRealtime();
                            cvVar2.M0();
                            return;
                        case 1:
                            cv.J0(yuVar.f32795n, yuVar.f32796r, true, null, null);
                            yuVar.a(true, true);
                            return;
                        case 2:
                            kg.q1 q1Var = yuVar.f32795n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = yuVar.f32796r;
                            ho hoVar = new ho(yuVar, 13);
                            Pattern pattern2 = cv.M1;
                            if (q1Var != null && tL_messages_stickerSet != null && q1Var.getFragmentView() != null) {
                                org.telegram.messenger.ui.b0(q1Var.getCurrentAccount()).g2(q1Var.getFragmentView().getContext(), tL_messages_stickerSet, null, 0, q1Var, null, true, true, hoVar, true);
                            }
                            yuVar.a(false, true);
                            return;
                        default:
                            yuVar.f32794f.U(null, null);
                            return;
                    }
                }
            });
            textView2.setClickable(false);
            addView(textView2, w7.b6.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
            textView2.setScaleX(0.0f);
            textView2.setScaleY(0.0f);
            textView2.setAlpha(0.0f);
            textView2.measure(View.MeasureSpec.makeMeasureSpec(99999, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(f10), 1073741824));
            f7 = Math.max(max, (org.telegram.messenger.i0.L(16.0f) + textView2.getMeasuredWidth()) / org.telegram.messenger.i0.f16025p);
        } else {
            f7 = 32.0f;
        }
        float f14 = f7;
        Pattern pattern2 = cv.M1;
        p80 p80Var = new p80(context, cvVar.I0);
        this.f32791a = p80Var;
        p80Var.setPadding(org.telegram.messenger.i0.L(2.0f), 0, org.telegram.messenger.i0.L(2.0f), 0);
        p80Var.setTypeface(org.telegram.messenger.i0.o());
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        p80Var.setEllipsize(truncateAt);
        p80Var.setSingleLine(true);
        p80Var.setLines(1);
        org.telegram.ui.ActionBar.a7.H(p80Var, org.telegram.ui.ActionBar.t6.J6, cvVar.I0);
        org.telegram.ui.ActionBar.a7.V(p80Var, org.telegram.ui.ActionBar.t6.f21037j5, cvVar.I0);
        if (z10) {
            p80Var.setTextSize(1, 20.0f);
            addView(p80Var, w7.b6.i(-1.0f, -2.0f, 8388659, 12.0f, 11.0f, f14, 0.0f));
        } else {
            p80Var.setTextSize(1, 17.0f);
            addView(p80Var, w7.b6.i(-1.0f, -2.0f, 8388659, 6.0f, 10.0f, f14, 0.0f));
        }
        if (!z10) {
            TextView textView3 = new TextView(context);
            this.f32792b = textView3;
            textView3.setTextSize(1, 13.0f);
            org.telegram.ui.ActionBar.a7.V(textView3, org.telegram.ui.ActionBar.t6.f21169q5, cvVar.I0);
            textView3.setEllipsize(truncateAt);
            textView3.setSingleLine(true);
            textView3.setLines(1);
            addView(textView3, w7.b6.i(-1.0f, -2.0f, 8388659, 8.0f, 31.66f, f14, 0.0f));
        }
        if (z10) {
            org.telegram.ui.ActionBar.t0 t0Var = new org.telegram.ui.ActionBar.t0(context, null, 0, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.xj, cvVar.I0), false, cvVar.I0);
            this.f32794f = t0Var;
            t0Var.setLongClickEnabled(false);
            t0Var.setSubMenuOpenSide(2);
            t0Var.setIcon(2131231245);
            int i11 = org.telegram.ui.ActionBar.t6.Bj;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i11, cvVar.I0), 1, -1);
            org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i11);
            org.telegram.ui.ActionBar.p6 p6Var3 = cvVar.I0;
            t0Var.setBackground(h02);
            org.telegram.ui.ActionBar.a7.k(t0Var, h02, null, N2, p6Var3);
            addView(t0Var, w7.b6.d(40, 40.0f, 53, 0.0f, 5.0f, 5.0f - (cvVar.f21615t0 / org.telegram.messenger.i0.f16025p), 0.0f));
            t0Var.e(1, 2131232362, org.telegram.messenger.cd.L0(2131744864, null));
            t0Var.e(2, 2131232202, org.telegram.messenger.cd.L0(2131751762, null));
            t0Var.setOnClickListener(new View.OnClickListener(this) {
                public final yu f32256b;

                {
                    this.f32256b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i102 = r2;
                    yu yuVar = this.f32256b;
                    switch (i102) {
                        case 0:
                            cv cvVar2 = yuVar.f32800y;
                            cvVar2.H1 = SystemClock.elapsedRealtime();
                            cvVar2.M0();
                            return;
                        case 1:
                            cv.J0(yuVar.f32795n, yuVar.f32796r, true, null, null);
                            yuVar.a(true, true);
                            return;
                        case 2:
                            kg.q1 q1Var = yuVar.f32795n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = yuVar.f32796r;
                            ho hoVar = new ho(yuVar, 13);
                            Pattern pattern22 = cv.M1;
                            if (q1Var != null && tL_messages_stickerSet != null && q1Var.getFragmentView() != null) {
                                org.telegram.messenger.ui.b0(q1Var.getCurrentAccount()).g2(q1Var.getFragmentView().getContext(), tL_messages_stickerSet, null, 0, q1Var, null, true, true, hoVar, true);
                            }
                            yuVar.a(false, true);
                            return;
                        default:
                            yuVar.f32794f.U(null, null);
                            return;
                    }
                }
            });
            t0Var.setDelegate(new t(cvVar, 29));
            t0Var.setContentDescription(org.telegram.messenger.cd.L0(2131754839, null));
        }
    }

    public final void a(boolean z10, boolean z11) {
        TextView textView;
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        if (this.f32797s != z10) {
            this.f32797s = z10;
            ValueAnimator valueAnimator = this.f32799x;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f32799x = null;
            }
            TextView textView2 = this.f32793c;
            if (textView2 != null && (textView = this.d) != null) {
                textView2.setClickable(!z10);
                textView.setClickable(z10);
                float f15 = 0.0f;
                if (z11) {
                    float f16 = this.f32798w;
                    if (z10) {
                        f15 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f16, f15);
                    this.f32799x = ofFloat;
                    ofFloat.addUpdateListener(new a6(this, 18));
                    this.f32799x.setInterpolator(gr.h);
                    this.f32799x.setDuration(250L);
                    this.f32799x.start();
                    return;
                }
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                this.f32798w = f7;
                if (z10) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                textView2.setScaleX(f10);
                if (z10) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                textView2.setScaleY(f11);
                if (z10) {
                    f12 = 0.0f;
                } else {
                    f12 = 1.0f;
                }
                textView2.setAlpha(f12);
                if (z10) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                textView.setScaleX(f13);
                if (z10) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                textView.setScaleY(f14);
                if (z10) {
                    f15 = 1.0f;
                }
                textView.setAlpha(f15);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        if (this.h) {
            f7 = 42.0f;
        } else {
            f7 = 56.0f;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(f7), 1073741824));
    }
}
