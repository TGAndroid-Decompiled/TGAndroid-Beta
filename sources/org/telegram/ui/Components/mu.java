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
public final class mu extends FrameLayout {
    public final w70 f36093a;
    public final TextView f36094b;
    public final TextView f36095c;
    public final TextView d;
    public final ug.p0 f36096e;
    public final org.telegram.ui.ActionBar.r0 f36097f;
    public final boolean h;
    public final bi.w4 f36098n;
    public TLRPC.TL_messages_stickerSet f36099r;
    public boolean f36100s;
    public float f36101w;
    public ValueAnimator f36102x;
    public final qu f36103y;

    public mu(qu quVar, Context context, boolean z9) {
        super(context);
        float f10;
        float f11;
        float f12;
        this.f36103y = quVar;
        this.f36098n = new bi.w4(this, 6);
        this.f36100s = false;
        this.f36101w = 0.0f;
        this.h = z9;
        if (!z9) {
            Pattern pattern = qu.P1;
            float f13 = 8.0f;
            if (!org.telegram.messenger.p10.i(quVar.f28669a).q()) {
                f12 = 16.0f;
                f11 = 28.0f;
                ug.p0 p0Var = new ug.p0(org.telegram.messenger.g0.L(4.0f), context, quVar.I0, false);
                this.f36096e = p0Var;
                p0Var.b(org.telegram.messenger.id.M0(2131743876, null), new View.OnClickListener(this) {
                    public final mu f35445b;

                    {
                        this.f35445b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        int i7 = r2;
                        mu muVar = this.f35445b;
                        switch (i7) {
                            case 0:
                                qu quVar2 = muVar.f36103y;
                                quVar2.K1 = SystemClock.elapsedRealtime();
                                quVar2.M0();
                                return;
                            case 1:
                                qu.J0(muVar.f36098n, muVar.f36099r, true, null, null);
                                muVar.a(true, true);
                                return;
                            case 2:
                                bi.w4 w4Var = muVar.f36098n;
                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = muVar.f36099r;
                                gp gpVar = new gp(muVar, 11);
                                Pattern pattern2 = qu.P1;
                                if (w4Var != null && tL_messages_stickerSet != null && w4Var.getFragmentView() != null) {
                                    org.telegram.messenger.ui.b0(w4Var.getCurrentAccount()).g2(w4Var.getFragmentView().getContext(), tL_messages_stickerSet, null, 0, w4Var, null, true, true, gpVar, true);
                                }
                                muVar.a(false, true);
                                return;
                            default:
                                muVar.f36097f.U(null, null);
                                return;
                        }
                    }
                }, false);
                p0Var.setIcon(2131624314);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) p0Var.getIconView().getLayoutParams();
                marginLayoutParams.leftMargin = org.telegram.messenger.g0.L(1.0f);
                marginLayoutParams.topMargin = org.telegram.messenger.g0.L(1.0f);
                int L = org.telegram.messenger.g0.L(20.0f);
                marginLayoutParams.height = L;
                marginLayoutParams.width = L;
                ((ViewGroup.MarginLayoutParams) p0Var.getTextView().getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(3.0f);
                p0Var.getChildAt(0).setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                addView(p0Var, c8.ha.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
                p0Var.measure(View.MeasureSpec.makeMeasureSpec(99999, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(28.0f), 1073741824));
                f13 = (org.telegram.messenger.g0.L(16.0f) + p0Var.getMeasuredWidth()) / org.telegram.messenger.g0.f22566p;
            } else {
                f11 = 28.0f;
                f12 = 16.0f;
            }
            float f14 = f13;
            TextView textView = new TextView(context);
            this.f36095c = textView;
            textView.setTypeface(org.telegram.messenger.g0.o());
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.Gi, quVar.I0);
            int i7 = org.telegram.ui.ActionBar.m6.Ci;
            org.telegram.ui.Cells.y e10 = org.telegram.ui.ActionBar.b6.e(org.telegram.ui.ActionBar.m6.w0(i7, quVar.I0), 14.0f);
            org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i7);
            org.telegram.ui.ActionBar.p6 e11 = org.telegram.ui.ActionBar.t6.e(i7);
            org.telegram.ui.ActionBar.h6 h6Var = quVar.I0;
            textView.setBackground(e10);
            org.telegram.ui.ActionBar.t6.j(textView, e10, M, e11, h6Var);
            textView.setText(org.telegram.messenger.id.M0(2131754486, null));
            textView.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
            textView.setGravity(17);
            textView.setOnClickListener(new View.OnClickListener(this) {
                public final mu f35445b;

                {
                    this.f35445b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i72 = r2;
                    mu muVar = this.f35445b;
                    switch (i72) {
                        case 0:
                            qu quVar2 = muVar.f36103y;
                            quVar2.K1 = SystemClock.elapsedRealtime();
                            quVar2.M0();
                            return;
                        case 1:
                            qu.J0(muVar.f36098n, muVar.f36099r, true, null, null);
                            muVar.a(true, true);
                            return;
                        case 2:
                            bi.w4 w4Var = muVar.f36098n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = muVar.f36099r;
                            gp gpVar = new gp(muVar, 11);
                            Pattern pattern2 = qu.P1;
                            if (w4Var != null && tL_messages_stickerSet != null && w4Var.getFragmentView() != null) {
                                org.telegram.messenger.ui.b0(w4Var.getCurrentAccount()).g2(w4Var.getFragmentView().getContext(), tL_messages_stickerSet, null, 0, w4Var, null, true, true, gpVar, true);
                            }
                            muVar.a(false, true);
                            return;
                        default:
                            muVar.f36097f.U(null, null);
                            return;
                    }
                }
            });
            addView(textView, c8.ha.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
            textView.measure(View.MeasureSpec.makeMeasureSpec(99999, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f11), 1073741824));
            float max = Math.max(f14, (org.telegram.messenger.g0.L(f12) + textView.getMeasuredWidth()) / org.telegram.messenger.g0.f22566p);
            TextView textView2 = new TextView(context);
            this.d = textView2;
            textView2.setTypeface(org.telegram.messenger.g0.o());
            org.telegram.ui.ActionBar.t6.U(textView2, i7, quVar.I0);
            org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.m6.a0(org.telegram.ui.ActionBar.m6.w0(i7, quVar.I0) & 268435455, 4, 4);
            org.telegram.ui.ActionBar.p6 g10 = org.telegram.ui.ActionBar.t6.g(i7, 15);
            org.telegram.ui.ActionBar.h6 h6Var2 = quVar.I0;
            textView2.setBackground(a02);
            org.telegram.ui.ActionBar.t6.j(textView2, a02, null, g10, h6Var2);
            textView2.setText(org.telegram.messenger.id.M0(2131744855, null));
            textView2.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
            textView2.setGravity(17);
            textView2.setOnClickListener(new View.OnClickListener(this) {
                public final mu f35445b;

                {
                    this.f35445b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i72 = r2;
                    mu muVar = this.f35445b;
                    switch (i72) {
                        case 0:
                            qu quVar2 = muVar.f36103y;
                            quVar2.K1 = SystemClock.elapsedRealtime();
                            quVar2.M0();
                            return;
                        case 1:
                            qu.J0(muVar.f36098n, muVar.f36099r, true, null, null);
                            muVar.a(true, true);
                            return;
                        case 2:
                            bi.w4 w4Var = muVar.f36098n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = muVar.f36099r;
                            gp gpVar = new gp(muVar, 11);
                            Pattern pattern2 = qu.P1;
                            if (w4Var != null && tL_messages_stickerSet != null && w4Var.getFragmentView() != null) {
                                org.telegram.messenger.ui.b0(w4Var.getCurrentAccount()).g2(w4Var.getFragmentView().getContext(), tL_messages_stickerSet, null, 0, w4Var, null, true, true, gpVar, true);
                            }
                            muVar.a(false, true);
                            return;
                        default:
                            muVar.f36097f.U(null, null);
                            return;
                    }
                }
            });
            textView2.setClickable(false);
            addView(textView2, c8.ha.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
            textView2.setScaleX(0.0f);
            textView2.setScaleY(0.0f);
            textView2.setAlpha(0.0f);
            textView2.measure(View.MeasureSpec.makeMeasureSpec(99999, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f11), 1073741824));
            f10 = Math.max(max, (org.telegram.messenger.g0.L(f12) + textView2.getMeasuredWidth()) / org.telegram.messenger.g0.f22566p);
        } else {
            f10 = 32.0f;
        }
        float f15 = f10;
        Pattern pattern2 = qu.P1;
        w70 w70Var = new w70(context, quVar.I0);
        this.f36093a = w70Var;
        w70Var.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        w70Var.setTypeface(org.telegram.messenger.g0.o());
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        w70Var.setEllipsize(truncateAt);
        w70Var.setSingleLine(true);
        w70Var.setLines(1);
        org.telegram.ui.ActionBar.t6.G(w70Var, org.telegram.ui.ActionBar.m6.J6, quVar.I0);
        org.telegram.ui.ActionBar.t6.U(w70Var, org.telegram.ui.ActionBar.m6.f27998j5, quVar.I0);
        if (z9) {
            w70Var.setTextSize(1, 20.0f);
            addView(w70Var, c8.ha.i(-1.0f, -2.0f, 8388659, 12.0f, 11.0f, f15, 0.0f));
        } else {
            w70Var.setTextSize(1, 17.0f);
            addView(w70Var, c8.ha.i(-1.0f, -2.0f, 8388659, 6.0f, 10.0f, f15, 0.0f));
        }
        if (!z9) {
            TextView textView3 = new TextView(context);
            this.f36094b = textView3;
            textView3.setTextSize(1, 13.0f);
            org.telegram.ui.ActionBar.t6.U(textView3, org.telegram.ui.ActionBar.m6.f28129q5, quVar.I0);
            textView3.setEllipsize(truncateAt);
            textView3.setSingleLine(true);
            textView3.setLines(1);
            addView(textView3, c8.ha.i(-1.0f, -2.0f, 8388659, 8.0f, 31.66f, f15, 0.0f));
        }
        if (z9) {
            org.telegram.ui.ActionBar.r0 r0Var = new org.telegram.ui.ActionBar.r0(context, null, 0, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.xj, quVar.I0), false, quVar.I0);
            this.f36097f = r0Var;
            r0Var.setLongClickEnabled(false);
            r0Var.setSubMenuOpenSide(2);
            r0Var.setIcon(2131231244);
            int i10 = org.telegram.ui.ActionBar.m6.Bj;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i10, quVar.I0), 1, -1);
            org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i10);
            org.telegram.ui.ActionBar.h6 h6Var3 = quVar.I0;
            r0Var.setBackground(h02);
            org.telegram.ui.ActionBar.t6.j(r0Var, h02, null, M2, h6Var3);
            addView(r0Var, c8.ha.d(40, 40.0f, 53, 0.0f, 5.0f, 5.0f - (quVar.f28705t0 / org.telegram.messenger.g0.f22566p), 0.0f));
            r0Var.e(1, 2131232363, org.telegram.messenger.id.M0(2131744846, null));
            r0Var.e(2, 2131232203, org.telegram.messenger.id.M0(2131751762, null));
            r0Var.setOnClickListener(new View.OnClickListener(this) {
                public final mu f35445b;

                {
                    this.f35445b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i72 = r2;
                    mu muVar = this.f35445b;
                    switch (i72) {
                        case 0:
                            qu quVar2 = muVar.f36103y;
                            quVar2.K1 = SystemClock.elapsedRealtime();
                            quVar2.M0();
                            return;
                        case 1:
                            qu.J0(muVar.f36098n, muVar.f36099r, true, null, null);
                            muVar.a(true, true);
                            return;
                        case 2:
                            bi.w4 w4Var = muVar.f36098n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = muVar.f36099r;
                            gp gpVar = new gp(muVar, 11);
                            Pattern pattern22 = qu.P1;
                            if (w4Var != null && tL_messages_stickerSet != null && w4Var.getFragmentView() != null) {
                                org.telegram.messenger.ui.b0(w4Var.getCurrentAccount()).g2(w4Var.getFragmentView().getContext(), tL_messages_stickerSet, null, 0, w4Var, null, true, true, gpVar, true);
                            }
                            muVar.a(false, true);
                            return;
                        default:
                            muVar.f36097f.U(null, null);
                            return;
                    }
                }
            });
            r0Var.setDelegate(new t(quVar, 29));
            r0Var.setContentDescription(org.telegram.messenger.id.M0(2131754839, null));
        }
    }

    public final void a(boolean z9, boolean z10) {
        TextView textView;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        if (this.f36100s != z9) {
            this.f36100s = z9;
            ValueAnimator valueAnimator = this.f36102x;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f36102x = null;
            }
            TextView textView2 = this.f36095c;
            if (textView2 != null && (textView = this.d) != null) {
                textView2.setClickable(!z9);
                textView.setClickable(z9);
                float f16 = 0.0f;
                if (z10) {
                    float f17 = this.f36101w;
                    if (z9) {
                        f16 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f17, f16);
                    this.f36102x = ofFloat;
                    ofFloat.addUpdateListener(new d6(this, 18));
                    this.f36102x.setInterpolator(wq.h);
                    this.f36102x.setDuration(250L);
                    this.f36102x.start();
                    return;
                }
                if (z9) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                this.f36101w = f10;
                if (z9) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                textView2.setScaleX(f11);
                if (z9) {
                    f12 = 0.0f;
                } else {
                    f12 = 1.0f;
                }
                textView2.setScaleY(f12);
                if (z9) {
                    f13 = 0.0f;
                } else {
                    f13 = 1.0f;
                }
                textView2.setAlpha(f13);
                if (z9) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                textView.setScaleX(f14);
                if (z9) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                textView.setScaleY(f15);
                if (z9) {
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
