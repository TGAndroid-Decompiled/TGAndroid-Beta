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
public final class zu extends FrameLayout {
    public final m80 f42949a;
    public final TextView f42950b;
    public final TextView f42951c;
    public final TextView d;
    public final ug.r0 f42952e;
    public final org.telegram.ui.ActionBar.q0 f42953f;
    public final boolean h;
    public final bi.e9 f42954n;
    public TLRPC.TL_messages_stickerSet f42955r;
    public boolean f42956s;
    public float f42957w;
    public ValueAnimator f42958x;
    public final dv f42959y;

    public zu(dv dvVar, Context context, boolean z10) {
        super(context);
        float f10;
        float f11;
        float f12;
        this.f42959y = dvVar;
        this.f42954n = new bi.e9(this, 7);
        this.f42956s = false;
        this.f42957w = 0.0f;
        this.h = z10;
        if (!z10) {
            Pattern pattern = dv.Q1;
            float f13 = 8.0f;
            if (!org.telegram.messenger.k10.i(dvVar.f30139a).q()) {
                f12 = 16.0f;
                f11 = 28.0f;
                ug.r0 r0Var = new ug.r0(org.telegram.messenger.g0.L(4.0f), context, dvVar.J0, false);
                this.f42952e = r0Var;
                r0Var.b(org.telegram.messenger.hd.N0(2131743633, null), new View.OnClickListener(this) {
                    public final zu f42197b;

                    {
                        this.f42197b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        int i7 = r2;
                        zu zuVar = this.f42197b;
                        switch (i7) {
                            case 0:
                                dv dvVar2 = zuVar.f42959y;
                                dvVar2.L1 = SystemClock.elapsedRealtime();
                                dvVar2.N0();
                                return;
                            case 1:
                                dv.K0(zuVar.f42954n, zuVar.f42955r, true, null, null);
                                zuVar.a(true, true);
                                return;
                            case 2:
                                bi.e9 e9Var = zuVar.f42954n;
                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = zuVar.f42955r;
                                oo ooVar = new oo(zuVar, 13);
                                Pattern pattern2 = dv.Q1;
                                if (e9Var != null && tL_messages_stickerSet != null && e9Var.getFragmentView() != null) {
                                    org.telegram.messenger.si.d0(e9Var.getCurrentAccount()).l2(e9Var.getFragmentView().getContext(), tL_messages_stickerSet, null, 0, e9Var, null, true, true, ooVar, true);
                                }
                                zuVar.a(false, true);
                                return;
                            default:
                                zuVar.f42953f.V(null, null);
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
                f13 = (org.telegram.messenger.g0.L(16.0f) + r0Var.getMeasuredWidth()) / org.telegram.messenger.g0.f24009p;
            } else {
                f11 = 28.0f;
                f12 = 16.0f;
            }
            float f14 = f13;
            TextView textView = new TextView(context);
            this.f42951c = textView;
            textView.setTypeface(org.telegram.messenger.g0.o());
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.Ji, dvVar.J0);
            int i7 = org.telegram.ui.ActionBar.m6.Fi;
            org.telegram.ui.Cells.y e10 = org.telegram.ui.ActionBar.a6.e(org.telegram.ui.ActionBar.m6.w0(i7, dvVar.J0), 14.0f);
            org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i7);
            org.telegram.ui.ActionBar.p6 e11 = org.telegram.ui.ActionBar.t6.e(i7);
            org.telegram.ui.ActionBar.h6 h6Var = dvVar.J0;
            textView.setBackground(e10);
            org.telegram.ui.ActionBar.t6.j(textView, e10, M, e11, h6Var);
            textView.setText(org.telegram.messenger.hd.N0(2131754483, null));
            textView.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
            textView.setGravity(17);
            textView.setOnClickListener(new View.OnClickListener(this) {
                public final zu f42197b;

                {
                    this.f42197b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i72 = r2;
                    zu zuVar = this.f42197b;
                    switch (i72) {
                        case 0:
                            dv dvVar2 = zuVar.f42959y;
                            dvVar2.L1 = SystemClock.elapsedRealtime();
                            dvVar2.N0();
                            return;
                        case 1:
                            dv.K0(zuVar.f42954n, zuVar.f42955r, true, null, null);
                            zuVar.a(true, true);
                            return;
                        case 2:
                            bi.e9 e9Var = zuVar.f42954n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = zuVar.f42955r;
                            oo ooVar = new oo(zuVar, 13);
                            Pattern pattern2 = dv.Q1;
                            if (e9Var != null && tL_messages_stickerSet != null && e9Var.getFragmentView() != null) {
                                org.telegram.messenger.si.d0(e9Var.getCurrentAccount()).l2(e9Var.getFragmentView().getContext(), tL_messages_stickerSet, null, 0, e9Var, null, true, true, ooVar, true);
                            }
                            zuVar.a(false, true);
                            return;
                        default:
                            zuVar.f42953f.V(null, null);
                            return;
                    }
                }
            });
            addView(textView, c8.na.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
            textView.measure(View.MeasureSpec.makeMeasureSpec(99999, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f11), 1073741824));
            float max = Math.max(f14, (org.telegram.messenger.g0.L(f12) + textView.getMeasuredWidth()) / org.telegram.messenger.g0.f24009p);
            TextView textView2 = new TextView(context);
            this.d = textView2;
            textView2.setTypeface(org.telegram.messenger.g0.o());
            org.telegram.ui.ActionBar.t6.U(textView2, i7, dvVar.J0);
            org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.m6.a0(org.telegram.ui.ActionBar.m6.w0(i7, dvVar.J0) & 268435455, 4, 4);
            org.telegram.ui.ActionBar.p6 g10 = org.telegram.ui.ActionBar.t6.g(i7, 15);
            org.telegram.ui.ActionBar.h6 h6Var2 = dvVar.J0;
            textView2.setBackground(a02);
            org.telegram.ui.ActionBar.t6.j(textView2, a02, null, g10, h6Var2);
            textView2.setText(org.telegram.messenger.hd.N0(2131744614, null));
            textView2.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
            textView2.setGravity(17);
            textView2.setOnClickListener(new View.OnClickListener(this) {
                public final zu f42197b;

                {
                    this.f42197b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i72 = r2;
                    zu zuVar = this.f42197b;
                    switch (i72) {
                        case 0:
                            dv dvVar2 = zuVar.f42959y;
                            dvVar2.L1 = SystemClock.elapsedRealtime();
                            dvVar2.N0();
                            return;
                        case 1:
                            dv.K0(zuVar.f42954n, zuVar.f42955r, true, null, null);
                            zuVar.a(true, true);
                            return;
                        case 2:
                            bi.e9 e9Var = zuVar.f42954n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = zuVar.f42955r;
                            oo ooVar = new oo(zuVar, 13);
                            Pattern pattern2 = dv.Q1;
                            if (e9Var != null && tL_messages_stickerSet != null && e9Var.getFragmentView() != null) {
                                org.telegram.messenger.si.d0(e9Var.getCurrentAccount()).l2(e9Var.getFragmentView().getContext(), tL_messages_stickerSet, null, 0, e9Var, null, true, true, ooVar, true);
                            }
                            zuVar.a(false, true);
                            return;
                        default:
                            zuVar.f42953f.V(null, null);
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
            f10 = Math.max(max, (org.telegram.messenger.g0.L(f12) + textView2.getMeasuredWidth()) / org.telegram.messenger.g0.f24009p);
        } else {
            f10 = 32.0f;
        }
        float f15 = f10;
        Pattern pattern2 = dv.Q1;
        m80 m80Var = new m80(context, dvVar.J0);
        this.f42949a = m80Var;
        m80Var.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        m80Var.setTypeface(org.telegram.messenger.g0.o());
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        m80Var.setEllipsize(truncateAt);
        m80Var.setSingleLine(true);
        m80Var.setLines(1);
        org.telegram.ui.ActionBar.t6.G(m80Var, org.telegram.ui.ActionBar.m6.J6, dvVar.J0);
        org.telegram.ui.ActionBar.t6.U(m80Var, org.telegram.ui.ActionBar.m6.f29455j5, dvVar.J0);
        if (z10) {
            m80Var.setTextSize(1, 20.0f);
            addView(m80Var, c8.na.i(-1.0f, -2.0f, 8388659, 12.0f, 11.0f, f15, 0.0f));
        } else {
            m80Var.setTextSize(1, 17.0f);
            addView(m80Var, c8.na.i(-1.0f, -2.0f, 8388659, 6.0f, 10.0f, f15, 0.0f));
        }
        if (!z10) {
            TextView textView3 = new TextView(context);
            this.f42950b = textView3;
            textView3.setTextSize(1, 13.0f);
            org.telegram.ui.ActionBar.t6.U(textView3, org.telegram.ui.ActionBar.m6.f29586q5, dvVar.J0);
            textView3.setEllipsize(truncateAt);
            textView3.setSingleLine(true);
            textView3.setLines(1);
            addView(textView3, c8.na.i(-1.0f, -2.0f, 8388659, 8.0f, 31.66f, f15, 0.0f));
        }
        if (z10) {
            org.telegram.ui.ActionBar.q0 q0Var = new org.telegram.ui.ActionBar.q0(context, null, 0, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Aj, dvVar.J0), false, dvVar.J0);
            this.f42953f = q0Var;
            q0Var.setLongClickEnabled(false);
            q0Var.setSubMenuOpenSide(2);
            q0Var.setIcon(2131231244);
            int i10 = org.telegram.ui.ActionBar.m6.Ej;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i10, dvVar.J0), 1, -1);
            org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i10);
            org.telegram.ui.ActionBar.h6 h6Var3 = dvVar.J0;
            q0Var.setBackground(h02);
            org.telegram.ui.ActionBar.t6.j(q0Var, h02, null, M2, h6Var3);
            addView(q0Var, c8.na.d(40, 40.0f, 53, 0.0f, 5.0f, 5.0f - (dvVar.f30177u0 / org.telegram.messenger.g0.f24009p), 0.0f));
            q0Var.e(1, 2131232365, org.telegram.messenger.hd.N0(2131744605, null));
            q0Var.e(2, 2131232205, org.telegram.messenger.hd.N0(2131751750, null));
            q0Var.setOnClickListener(new View.OnClickListener(this) {
                public final zu f42197b;

                {
                    this.f42197b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i72 = r2;
                    zu zuVar = this.f42197b;
                    switch (i72) {
                        case 0:
                            dv dvVar2 = zuVar.f42959y;
                            dvVar2.L1 = SystemClock.elapsedRealtime();
                            dvVar2.N0();
                            return;
                        case 1:
                            dv.K0(zuVar.f42954n, zuVar.f42955r, true, null, null);
                            zuVar.a(true, true);
                            return;
                        case 2:
                            bi.e9 e9Var = zuVar.f42954n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = zuVar.f42955r;
                            oo ooVar = new oo(zuVar, 13);
                            Pattern pattern22 = dv.Q1;
                            if (e9Var != null && tL_messages_stickerSet != null && e9Var.getFragmentView() != null) {
                                org.telegram.messenger.si.d0(e9Var.getCurrentAccount()).l2(e9Var.getFragmentView().getContext(), tL_messages_stickerSet, null, 0, e9Var, null, true, true, ooVar, true);
                            }
                            zuVar.a(false, true);
                            return;
                        default:
                            zuVar.f42953f.V(null, null);
                            return;
                    }
                }
            });
            q0Var.setDelegate(new c0(dvVar, 28));
            q0Var.setContentDescription(org.telegram.messenger.hd.N0(2131754838, null));
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
        if (this.f42956s != z10) {
            this.f42956s = z10;
            ValueAnimator valueAnimator = this.f42958x;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f42958x = null;
            }
            TextView textView2 = this.f42951c;
            if (textView2 != null && (textView = this.d) != null) {
                textView2.setClickable(!z10);
                textView.setClickable(z10);
                float f16 = 0.0f;
                if (z11) {
                    float f17 = this.f42957w;
                    if (z10) {
                        f16 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f17, f16);
                    this.f42958x = ofFloat;
                    ofFloat.addUpdateListener(new x(this, 19));
                    this.f42958x.setInterpolator(nr.h);
                    this.f42958x.setDuration(250L);
                    this.f42958x.start();
                    return;
                }
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                this.f42957w = f10;
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
