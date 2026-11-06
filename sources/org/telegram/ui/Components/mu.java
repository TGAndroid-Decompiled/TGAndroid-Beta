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
    public final w70 f36135a;
    public final TextView f36136b;
    public final TextView f36137c;
    public final TextView d;
    public final ug.p0 f36138e;
    public final org.telegram.ui.ActionBar.r0 f36139f;
    public final boolean h;
    public final bi.w4 f36140n;
    public TLRPC.TL_messages_stickerSet f36141r;
    public boolean f36142s;
    public float f36143w;
    public ValueAnimator f36144x;
    public final qu f36145y;

    public mu(qu quVar, Context context, boolean z9) {
        super(context);
        float f10;
        float f11;
        float f12;
        this.f36145y = quVar;
        this.f36140n = new bi.w4(this, 6);
        this.f36142s = false;
        this.f36143w = 0.0f;
        this.h = z9;
        if (!z9) {
            Pattern pattern = qu.M1;
            float f13 = 8.0f;
            if (!org.telegram.messenger.p10.i(quVar.f28612a).q()) {
                f12 = 16.0f;
                f11 = 28.0f;
                ug.p0 p0Var = new ug.p0(org.telegram.messenger.g0.L(4.0f), context, quVar.I0, false);
                this.f36138e = p0Var;
                p0Var.b(org.telegram.messenger.hd.M0(2131743877, null), new View.OnClickListener(this) {
                    public final mu f35425b;

                    {
                        this.f35425b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        int i7 = r2;
                        mu muVar = this.f35425b;
                        switch (i7) {
                            case 0:
                                qu quVar2 = muVar.f36145y;
                                quVar2.H1 = SystemClock.elapsedRealtime();
                                quVar2.M0();
                                return;
                            case 1:
                                qu.J0(muVar.f36140n, muVar.f36141r, true, null, null);
                                muVar.a(true, true);
                                return;
                            case 2:
                                bi.w4 w4Var = muVar.f36140n;
                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = muVar.f36141r;
                                gp gpVar = new gp(muVar, 11);
                                Pattern pattern2 = qu.M1;
                                if (w4Var != null && tL_messages_stickerSet != null && w4Var.getFragmentView() != null) {
                                    org.telegram.messenger.ui.b0(w4Var.getCurrentAccount()).g2(w4Var.getFragmentView().getContext(), tL_messages_stickerSet, null, 0, w4Var, null, true, true, gpVar, true);
                                }
                                muVar.a(false, true);
                                return;
                            default:
                                muVar.f36139f.U(null, null);
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
                f13 = (org.telegram.messenger.g0.L(16.0f) + p0Var.getMeasuredWidth()) / org.telegram.messenger.g0.f22536p;
            } else {
                f11 = 28.0f;
                f12 = 16.0f;
            }
            float f14 = f13;
            TextView textView = new TextView(context);
            this.f36137c = textView;
            textView.setTypeface(org.telegram.messenger.g0.o());
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.Gi, quVar.I0);
            int i7 = org.telegram.ui.ActionBar.k6.Ci;
            org.telegram.ui.Cells.y e10 = org.telegram.ui.ActionBar.z5.e(org.telegram.ui.ActionBar.k6.w0(i7, quVar.I0), 14.0f);
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i7);
            org.telegram.ui.ActionBar.n6 f15 = org.telegram.ui.ActionBar.r6.f(i7);
            org.telegram.ui.ActionBar.f6 f6Var = quVar.I0;
            textView.setBackground(e10);
            org.telegram.ui.ActionBar.r6.k(textView, e10, N, f15, f6Var);
            textView.setText(org.telegram.messenger.hd.M0(2131754486, null));
            textView.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
            textView.setGravity(17);
            textView.setOnClickListener(new View.OnClickListener(this) {
                public final mu f35425b;

                {
                    this.f35425b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i72 = r2;
                    mu muVar = this.f35425b;
                    switch (i72) {
                        case 0:
                            qu quVar2 = muVar.f36145y;
                            quVar2.H1 = SystemClock.elapsedRealtime();
                            quVar2.M0();
                            return;
                        case 1:
                            qu.J0(muVar.f36140n, muVar.f36141r, true, null, null);
                            muVar.a(true, true);
                            return;
                        case 2:
                            bi.w4 w4Var = muVar.f36140n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = muVar.f36141r;
                            gp gpVar = new gp(muVar, 11);
                            Pattern pattern2 = qu.M1;
                            if (w4Var != null && tL_messages_stickerSet != null && w4Var.getFragmentView() != null) {
                                org.telegram.messenger.ui.b0(w4Var.getCurrentAccount()).g2(w4Var.getFragmentView().getContext(), tL_messages_stickerSet, null, 0, w4Var, null, true, true, gpVar, true);
                            }
                            muVar.a(false, true);
                            return;
                        default:
                            muVar.f36139f.U(null, null);
                            return;
                    }
                }
            });
            addView(textView, c8.ha.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
            textView.measure(View.MeasureSpec.makeMeasureSpec(99999, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f11), 1073741824));
            float max = Math.max(f14, (org.telegram.messenger.g0.L(f12) + textView.getMeasuredWidth()) / org.telegram.messenger.g0.f22536p);
            TextView textView2 = new TextView(context);
            this.d = textView2;
            textView2.setTypeface(org.telegram.messenger.g0.o());
            org.telegram.ui.ActionBar.r6.V(textView2, i7, quVar.I0);
            org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.w0(i7, quVar.I0) & 268435455, 4, 4);
            org.telegram.ui.ActionBar.n6 h = org.telegram.ui.ActionBar.r6.h(i7, 15);
            org.telegram.ui.ActionBar.f6 f6Var2 = quVar.I0;
            textView2.setBackground(a02);
            org.telegram.ui.ActionBar.r6.k(textView2, a02, null, h, f6Var2);
            textView2.setText(org.telegram.messenger.hd.M0(2131744856, null));
            textView2.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
            textView2.setGravity(17);
            textView2.setOnClickListener(new View.OnClickListener(this) {
                public final mu f35425b;

                {
                    this.f35425b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i72 = r2;
                    mu muVar = this.f35425b;
                    switch (i72) {
                        case 0:
                            qu quVar2 = muVar.f36145y;
                            quVar2.H1 = SystemClock.elapsedRealtime();
                            quVar2.M0();
                            return;
                        case 1:
                            qu.J0(muVar.f36140n, muVar.f36141r, true, null, null);
                            muVar.a(true, true);
                            return;
                        case 2:
                            bi.w4 w4Var = muVar.f36140n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = muVar.f36141r;
                            gp gpVar = new gp(muVar, 11);
                            Pattern pattern2 = qu.M1;
                            if (w4Var != null && tL_messages_stickerSet != null && w4Var.getFragmentView() != null) {
                                org.telegram.messenger.ui.b0(w4Var.getCurrentAccount()).g2(w4Var.getFragmentView().getContext(), tL_messages_stickerSet, null, 0, w4Var, null, true, true, gpVar, true);
                            }
                            muVar.a(false, true);
                            return;
                        default:
                            muVar.f36139f.U(null, null);
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
            f10 = Math.max(max, (org.telegram.messenger.g0.L(f12) + textView2.getMeasuredWidth()) / org.telegram.messenger.g0.f22536p);
        } else {
            f10 = 32.0f;
        }
        float f16 = f10;
        Pattern pattern2 = qu.M1;
        w70 w70Var = new w70(context, quVar.I0);
        this.f36135a = w70Var;
        w70Var.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        w70Var.setTypeface(org.telegram.messenger.g0.o());
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        w70Var.setEllipsize(truncateAt);
        w70Var.setSingleLine(true);
        w70Var.setLines(1);
        org.telegram.ui.ActionBar.r6.H(w70Var, org.telegram.ui.ActionBar.k6.J6, quVar.I0);
        org.telegram.ui.ActionBar.r6.V(w70Var, org.telegram.ui.ActionBar.k6.f27956j5, quVar.I0);
        if (z9) {
            w70Var.setTextSize(1, 20.0f);
            addView(w70Var, c8.ha.i(-1.0f, -2.0f, 8388659, 12.0f, 11.0f, f16, 0.0f));
        } else {
            w70Var.setTextSize(1, 17.0f);
            addView(w70Var, c8.ha.i(-1.0f, -2.0f, 8388659, 6.0f, 10.0f, f16, 0.0f));
        }
        if (!z9) {
            TextView textView3 = new TextView(context);
            this.f36136b = textView3;
            textView3.setTextSize(1, 13.0f);
            org.telegram.ui.ActionBar.r6.V(textView3, org.telegram.ui.ActionBar.k6.f28087q5, quVar.I0);
            textView3.setEllipsize(truncateAt);
            textView3.setSingleLine(true);
            textView3.setLines(1);
            addView(textView3, c8.ha.i(-1.0f, -2.0f, 8388659, 8.0f, 31.66f, f16, 0.0f));
        }
        if (z9) {
            org.telegram.ui.ActionBar.r0 r0Var = new org.telegram.ui.ActionBar.r0(context, null, 0, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.xj, quVar.I0), false, quVar.I0);
            this.f36139f = r0Var;
            r0Var.setLongClickEnabled(false);
            r0Var.setSubMenuOpenSide(2);
            r0Var.setIcon(2131231244);
            int i10 = org.telegram.ui.ActionBar.k6.Bj;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i10, quVar.I0), 1, -1);
            org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i10);
            org.telegram.ui.ActionBar.f6 f6Var3 = quVar.I0;
            r0Var.setBackground(h02);
            org.telegram.ui.ActionBar.r6.k(r0Var, h02, null, N2, f6Var3);
            addView(r0Var, c8.ha.d(40, 40.0f, 53, 0.0f, 5.0f, 5.0f - (quVar.f28645t0 / org.telegram.messenger.g0.f22536p), 0.0f));
            r0Var.e(1, 2131232363, org.telegram.messenger.hd.M0(2131744847, null));
            r0Var.e(2, 2131232203, org.telegram.messenger.hd.M0(2131751762, null));
            r0Var.setOnClickListener(new View.OnClickListener(this) {
                public final mu f35425b;

                {
                    this.f35425b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i72 = r2;
                    mu muVar = this.f35425b;
                    switch (i72) {
                        case 0:
                            qu quVar2 = muVar.f36145y;
                            quVar2.H1 = SystemClock.elapsedRealtime();
                            quVar2.M0();
                            return;
                        case 1:
                            qu.J0(muVar.f36140n, muVar.f36141r, true, null, null);
                            muVar.a(true, true);
                            return;
                        case 2:
                            bi.w4 w4Var = muVar.f36140n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = muVar.f36141r;
                            gp gpVar = new gp(muVar, 11);
                            Pattern pattern22 = qu.M1;
                            if (w4Var != null && tL_messages_stickerSet != null && w4Var.getFragmentView() != null) {
                                org.telegram.messenger.ui.b0(w4Var.getCurrentAccount()).g2(w4Var.getFragmentView().getContext(), tL_messages_stickerSet, null, 0, w4Var, null, true, true, gpVar, true);
                            }
                            muVar.a(false, true);
                            return;
                        default:
                            muVar.f36139f.U(null, null);
                            return;
                    }
                }
            });
            r0Var.setDelegate(new u(quVar, 29));
            r0Var.setContentDescription(org.telegram.messenger.hd.M0(2131754839, null));
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
        if (this.f36142s != z9) {
            this.f36142s = z9;
            ValueAnimator valueAnimator = this.f36144x;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f36144x = null;
            }
            TextView textView2 = this.f36137c;
            if (textView2 != null && (textView = this.d) != null) {
                textView2.setClickable(!z9);
                textView.setClickable(z9);
                float f16 = 0.0f;
                if (z10) {
                    float f17 = this.f36143w;
                    if (z9) {
                        f16 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f17, f16);
                    this.f36144x = ofFloat;
                    ofFloat.addUpdateListener(new e6(this, 18));
                    this.f36144x.setInterpolator(xq.h);
                    this.f36144x.setDuration(250L);
                    this.f36144x.start();
                    return;
                }
                if (z9) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                this.f36143w = f10;
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
