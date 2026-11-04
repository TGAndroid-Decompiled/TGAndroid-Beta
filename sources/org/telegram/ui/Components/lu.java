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
public final class lu extends FrameLayout {
    public final s70 f35880a;
    public final TextView f35881b;
    public final TextView f35882c;
    public final TextView d;
    public final vg.o0 f35883e;
    public final org.telegram.ui.ActionBar.q0 f35884f;
    public final boolean h;
    public final ai.c7 f35885n;
    public TLRPC.TL_messages_stickerSet f35886r;
    public boolean f35887s;
    public float f35888w;
    public ValueAnimator f35889x;
    public final pu f35890y;

    public lu(pu puVar, Context context, boolean z10) {
        super(context);
        float f10;
        float f11;
        float f12;
        this.f35890y = puVar;
        this.f35885n = new ai.c7(this, 7);
        this.f35887s = false;
        this.f35888w = 0.0f;
        this.h = z10;
        if (!z10) {
            Pattern pattern = pu.N1;
            float f13 = 8.0f;
            if (!org.telegram.messenger.h10.i(puVar.f28583a).q()) {
                f12 = 16.0f;
                f11 = 28.0f;
                vg.o0 o0Var = new vg.o0(org.telegram.messenger.g0.L(4.0f), context, puVar.J0, false);
                this.f35883e = o0Var;
                o0Var.b(org.telegram.messenger.bd.M0(2131743886, null), new View.OnClickListener(this) {
                    public final lu f35200b;

                    {
                        this.f35200b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        int i3 = r2;
                        lu luVar = this.f35200b;
                        switch (i3) {
                            case 0:
                                pu puVar2 = luVar.f35890y;
                                puVar2.I1 = SystemClock.elapsedRealtime();
                                puVar2.M0();
                                return;
                            case 1:
                                pu.J0(luVar.f35885n, luVar.f35886r, true, null, null);
                                luVar.a(true, true);
                                return;
                            case 2:
                                ai.c7 c7Var = luVar.f35885n;
                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = luVar.f35886r;
                                gp gpVar = new gp(luVar, 11);
                                Pattern pattern2 = pu.N1;
                                if (c7Var != null && tL_messages_stickerSet != null && c7Var.getFragmentView() != null) {
                                    org.telegram.messenger.li.b0(c7Var.getCurrentAccount()).g2(c7Var.getFragmentView().getContext(), tL_messages_stickerSet, null, 0, c7Var, null, true, true, gpVar, true);
                                }
                                luVar.a(false, true);
                                return;
                            default:
                                luVar.f35884f.U(null, null);
                                return;
                        }
                    }
                }, false);
                o0Var.setIcon(2131624314);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) o0Var.getIconView().getLayoutParams();
                marginLayoutParams.leftMargin = org.telegram.messenger.g0.L(1.0f);
                marginLayoutParams.topMargin = org.telegram.messenger.g0.L(1.0f);
                int L = org.telegram.messenger.g0.L(20.0f);
                marginLayoutParams.height = L;
                marginLayoutParams.width = L;
                ((ViewGroup.MarginLayoutParams) o0Var.getTextView().getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(3.0f);
                o0Var.getChildAt(0).setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                addView(o0Var, b8.mf.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
                o0Var.measure(View.MeasureSpec.makeMeasureSpec(99999, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(28.0f), 1073741824));
                f13 = (org.telegram.messenger.g0.L(16.0f) + o0Var.getMeasuredWidth()) / org.telegram.messenger.g0.f22607p;
            } else {
                f11 = 28.0f;
                f12 = 16.0f;
            }
            float f14 = f13;
            TextView textView = new TextView(context);
            this.f35882c = textView;
            textView.setTypeface(org.telegram.messenger.g0.o());
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.Gi, puVar.J0);
            int i3 = org.telegram.ui.ActionBar.k6.Ci;
            org.telegram.ui.Cells.y e10 = org.telegram.ui.ActionBar.y5.e(org.telegram.ui.ActionBar.k6.w0(i3, puVar.J0), 14.0f);
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i3);
            org.telegram.ui.ActionBar.n6 f15 = org.telegram.ui.ActionBar.r6.f(i3);
            org.telegram.ui.ActionBar.e6 e6Var = puVar.J0;
            textView.setBackground(e10);
            org.telegram.ui.ActionBar.r6.k(textView, e10, N, f15, e6Var);
            textView.setText(org.telegram.messenger.bd.M0(2131754486, null));
            textView.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
            textView.setGravity(17);
            textView.setOnClickListener(new View.OnClickListener(this) {
                public final lu f35200b;

                {
                    this.f35200b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i32 = r2;
                    lu luVar = this.f35200b;
                    switch (i32) {
                        case 0:
                            pu puVar2 = luVar.f35890y;
                            puVar2.I1 = SystemClock.elapsedRealtime();
                            puVar2.M0();
                            return;
                        case 1:
                            pu.J0(luVar.f35885n, luVar.f35886r, true, null, null);
                            luVar.a(true, true);
                            return;
                        case 2:
                            ai.c7 c7Var = luVar.f35885n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = luVar.f35886r;
                            gp gpVar = new gp(luVar, 11);
                            Pattern pattern2 = pu.N1;
                            if (c7Var != null && tL_messages_stickerSet != null && c7Var.getFragmentView() != null) {
                                org.telegram.messenger.li.b0(c7Var.getCurrentAccount()).g2(c7Var.getFragmentView().getContext(), tL_messages_stickerSet, null, 0, c7Var, null, true, true, gpVar, true);
                            }
                            luVar.a(false, true);
                            return;
                        default:
                            luVar.f35884f.U(null, null);
                            return;
                    }
                }
            });
            addView(textView, b8.mf.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
            textView.measure(View.MeasureSpec.makeMeasureSpec(99999, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f11), 1073741824));
            float max = Math.max(f14, (org.telegram.messenger.g0.L(f12) + textView.getMeasuredWidth()) / org.telegram.messenger.g0.f22607p);
            TextView textView2 = new TextView(context);
            this.d = textView2;
            textView2.setTypeface(org.telegram.messenger.g0.o());
            org.telegram.ui.ActionBar.r6.V(textView2, i3, puVar.J0);
            org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.w0(i3, puVar.J0) & 268435455, 4, 4);
            org.telegram.ui.ActionBar.n6 h = org.telegram.ui.ActionBar.r6.h(i3, 15);
            org.telegram.ui.ActionBar.e6 e6Var2 = puVar.J0;
            textView2.setBackground(a02);
            org.telegram.ui.ActionBar.r6.k(textView2, a02, null, h, e6Var2);
            textView2.setText(org.telegram.messenger.bd.M0(2131744865, null));
            textView2.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
            textView2.setGravity(17);
            textView2.setOnClickListener(new View.OnClickListener(this) {
                public final lu f35200b;

                {
                    this.f35200b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i32 = r2;
                    lu luVar = this.f35200b;
                    switch (i32) {
                        case 0:
                            pu puVar2 = luVar.f35890y;
                            puVar2.I1 = SystemClock.elapsedRealtime();
                            puVar2.M0();
                            return;
                        case 1:
                            pu.J0(luVar.f35885n, luVar.f35886r, true, null, null);
                            luVar.a(true, true);
                            return;
                        case 2:
                            ai.c7 c7Var = luVar.f35885n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = luVar.f35886r;
                            gp gpVar = new gp(luVar, 11);
                            Pattern pattern2 = pu.N1;
                            if (c7Var != null && tL_messages_stickerSet != null && c7Var.getFragmentView() != null) {
                                org.telegram.messenger.li.b0(c7Var.getCurrentAccount()).g2(c7Var.getFragmentView().getContext(), tL_messages_stickerSet, null, 0, c7Var, null, true, true, gpVar, true);
                            }
                            luVar.a(false, true);
                            return;
                        default:
                            luVar.f35884f.U(null, null);
                            return;
                    }
                }
            });
            textView2.setClickable(false);
            addView(textView2, b8.mf.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
            textView2.setScaleX(0.0f);
            textView2.setScaleY(0.0f);
            textView2.setAlpha(0.0f);
            textView2.measure(View.MeasureSpec.makeMeasureSpec(99999, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f11), 1073741824));
            f10 = Math.max(max, (org.telegram.messenger.g0.L(f12) + textView2.getMeasuredWidth()) / org.telegram.messenger.g0.f22607p);
        } else {
            f10 = 32.0f;
        }
        float f16 = f10;
        Pattern pattern2 = pu.N1;
        s70 s70Var = new s70(context, puVar.J0);
        this.f35880a = s70Var;
        s70Var.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        s70Var.setTypeface(org.telegram.messenger.g0.o());
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        s70Var.setEllipsize(truncateAt);
        s70Var.setSingleLine(true);
        s70Var.setLines(1);
        org.telegram.ui.ActionBar.r6.H(s70Var, org.telegram.ui.ActionBar.k6.J6, puVar.J0);
        org.telegram.ui.ActionBar.r6.V(s70Var, org.telegram.ui.ActionBar.k6.f27988j5, puVar.J0);
        if (z10) {
            s70Var.setTextSize(1, 20.0f);
            addView(s70Var, b8.mf.i(-1.0f, -2.0f, 8388659, 12.0f, 11.0f, f16, 0.0f));
        } else {
            s70Var.setTextSize(1, 17.0f);
            addView(s70Var, b8.mf.i(-1.0f, -2.0f, 8388659, 6.0f, 10.0f, f16, 0.0f));
        }
        if (!z10) {
            TextView textView3 = new TextView(context);
            this.f35881b = textView3;
            textView3.setTextSize(1, 13.0f);
            org.telegram.ui.ActionBar.r6.V(textView3, org.telegram.ui.ActionBar.k6.f28120q5, puVar.J0);
            textView3.setEllipsize(truncateAt);
            textView3.setSingleLine(true);
            textView3.setLines(1);
            addView(textView3, b8.mf.i(-1.0f, -2.0f, 8388659, 8.0f, 31.66f, f16, 0.0f));
        }
        if (z10) {
            org.telegram.ui.ActionBar.q0 q0Var = new org.telegram.ui.ActionBar.q0(context, null, 0, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.xj, puVar.J0), false, puVar.J0);
            this.f35884f = q0Var;
            q0Var.setLongClickEnabled(false);
            q0Var.setSubMenuOpenSide(2);
            q0Var.setIcon(2131231244);
            int i10 = org.telegram.ui.ActionBar.k6.Bj;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i10, puVar.J0), 1, -1);
            org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i10);
            org.telegram.ui.ActionBar.e6 e6Var3 = puVar.J0;
            q0Var.setBackground(h02);
            org.telegram.ui.ActionBar.r6.k(q0Var, h02, null, N2, e6Var3);
            addView(q0Var, b8.mf.d(40, 40.0f, 53, 0.0f, 5.0f, 5.0f - (puVar.f28618u0 / org.telegram.messenger.g0.f22607p), 0.0f));
            q0Var.e(1, 2131232363, org.telegram.messenger.bd.M0(2131744856, null));
            q0Var.e(2, 2131232203, org.telegram.messenger.bd.M0(2131751762, null));
            q0Var.setOnClickListener(new View.OnClickListener(this) {
                public final lu f35200b;

                {
                    this.f35200b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i32 = r2;
                    lu luVar = this.f35200b;
                    switch (i32) {
                        case 0:
                            pu puVar2 = luVar.f35890y;
                            puVar2.I1 = SystemClock.elapsedRealtime();
                            puVar2.M0();
                            return;
                        case 1:
                            pu.J0(luVar.f35885n, luVar.f35886r, true, null, null);
                            luVar.a(true, true);
                            return;
                        case 2:
                            ai.c7 c7Var = luVar.f35885n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = luVar.f35886r;
                            gp gpVar = new gp(luVar, 11);
                            Pattern pattern22 = pu.N1;
                            if (c7Var != null && tL_messages_stickerSet != null && c7Var.getFragmentView() != null) {
                                org.telegram.messenger.li.b0(c7Var.getCurrentAccount()).g2(c7Var.getFragmentView().getContext(), tL_messages_stickerSet, null, 0, c7Var, null, true, true, gpVar, true);
                            }
                            luVar.a(false, true);
                            return;
                        default:
                            luVar.f35884f.U(null, null);
                            return;
                    }
                }
            });
            q0Var.setDelegate(new t(puVar, 29));
            q0Var.setContentDescription(org.telegram.messenger.bd.M0(2131754839, null));
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
        if (this.f35887s != z10) {
            this.f35887s = z10;
            ValueAnimator valueAnimator = this.f35889x;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f35889x = null;
            }
            TextView textView2 = this.f35882c;
            if (textView2 != null && (textView = this.d) != null) {
                textView2.setClickable(!z10);
                textView.setClickable(z10);
                float f16 = 0.0f;
                if (z11) {
                    float f17 = this.f35888w;
                    if (z10) {
                        f16 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f17, f16);
                    this.f35889x = ofFloat;
                    ofFloat.addUpdateListener(new c6(this, 18));
                    this.f35889x.setInterpolator(xq.h);
                    this.f35889x.setDuration(250L);
                    this.f35889x.start();
                    return;
                }
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                this.f35888w = f10;
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
    public final void onMeasure(int i3, int i10) {
        float f10;
        if (this.h) {
            f10 = 42.0f;
        } else {
            f10 = 56.0f;
        }
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f10), 1073741824));
    }
}
