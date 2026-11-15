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
public final class su extends FrameLayout {
    public final z70 f39426a;
    public final TextView f39427b;
    public final TextView f39428c;
    public final TextView d;
    public final ug.q0 f39429e;
    public final org.telegram.ui.ActionBar.q0 f39430f;
    public final boolean h;
    public final bi.t6 f39431n;
    public TLRPC.TL_messages_stickerSet f39432r;
    public boolean f39433s;
    public float f39434w;
    public ValueAnimator f39435x;
    public final wu f39436y;

    public su(wu wuVar, Context context, boolean z10) {
        super(context);
        float f10;
        float f11;
        float f12;
        this.f39436y = wuVar;
        this.f39431n = new bi.t6(this, 7);
        this.f39433s = false;
        this.f39434w = 0.0f;
        this.h = z10;
        if (!z10) {
            Pattern pattern = wu.Q1;
            float f13 = 8.0f;
            if (!org.telegram.messenger.m10.i(wuVar.f29679a).q()) {
                f12 = 16.0f;
                f11 = 28.0f;
                ug.q0 q0Var = new ug.q0(org.telegram.messenger.g0.L(4.0f), context, wuVar.J0, false);
                this.f39429e = q0Var;
                q0Var.b(org.telegram.messenger.hd.M0(2131743876, null), new View.OnClickListener(this) {
                    public final su f38772b;

                    {
                        this.f38772b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        int i7 = r2;
                        su suVar = this.f38772b;
                        switch (i7) {
                            case 0:
                                wu wuVar2 = suVar.f39436y;
                                wuVar2.L1 = SystemClock.elapsedRealtime();
                                wuVar2.M0();
                                return;
                            case 1:
                                wu.J0(suVar.f39431n, suVar.f39432r, true, null, null);
                                suVar.a(true, true);
                                return;
                            case 2:
                                bi.t6 t6Var = suVar.f39431n;
                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = suVar.f39432r;
                                fo foVar = new fo(suVar, 13);
                                Pattern pattern2 = wu.Q1;
                                if (t6Var != null && tL_messages_stickerSet != null && t6Var.getFragmentView() != null) {
                                    org.telegram.messenger.si.b0(t6Var.getCurrentAccount()).g2(t6Var.getFragmentView().getContext(), tL_messages_stickerSet, null, 0, t6Var, null, true, true, foVar, true);
                                }
                                suVar.a(false, true);
                                return;
                            default:
                                suVar.f39430f.V(null, null);
                                return;
                        }
                    }
                }, false);
                q0Var.setIcon(2131624315);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) q0Var.getIconView().getLayoutParams();
                marginLayoutParams.leftMargin = org.telegram.messenger.g0.L(1.0f);
                marginLayoutParams.topMargin = org.telegram.messenger.g0.L(1.0f);
                int L = org.telegram.messenger.g0.L(20.0f);
                marginLayoutParams.height = L;
                marginLayoutParams.width = L;
                ((ViewGroup.MarginLayoutParams) q0Var.getTextView().getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(3.0f);
                q0Var.getChildAt(0).setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                addView(q0Var, c8.ja.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
                q0Var.measure(View.MeasureSpec.makeMeasureSpec(99999, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(28.0f), 1073741824));
                f13 = (org.telegram.messenger.g0.L(16.0f) + q0Var.getMeasuredWidth()) / org.telegram.messenger.g0.f23608p;
            } else {
                f11 = 28.0f;
                f12 = 16.0f;
            }
            float f14 = f13;
            TextView textView = new TextView(context);
            this.f39428c = textView;
            textView.setTypeface(org.telegram.messenger.g0.o());
            org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.Ji, wuVar.J0);
            int i7 = org.telegram.ui.ActionBar.j6.Fi;
            org.telegram.ui.Cells.y e10 = org.telegram.ui.ActionBar.y5.e(org.telegram.ui.ActionBar.j6.w0(i7, wuVar.J0), 14.0f);
            org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i7);
            org.telegram.ui.ActionBar.m6 e11 = org.telegram.ui.ActionBar.q6.e(i7);
            org.telegram.ui.ActionBar.e6 e6Var = wuVar.J0;
            textView.setBackground(e10);
            org.telegram.ui.ActionBar.q6.j(textView, e10, M, e11, e6Var);
            textView.setText(org.telegram.messenger.hd.M0(2131754486, null));
            textView.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
            textView.setGravity(17);
            textView.setOnClickListener(new View.OnClickListener(this) {
                public final su f38772b;

                {
                    this.f38772b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i72 = r2;
                    su suVar = this.f38772b;
                    switch (i72) {
                        case 0:
                            wu wuVar2 = suVar.f39436y;
                            wuVar2.L1 = SystemClock.elapsedRealtime();
                            wuVar2.M0();
                            return;
                        case 1:
                            wu.J0(suVar.f39431n, suVar.f39432r, true, null, null);
                            suVar.a(true, true);
                            return;
                        case 2:
                            bi.t6 t6Var = suVar.f39431n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = suVar.f39432r;
                            fo foVar = new fo(suVar, 13);
                            Pattern pattern2 = wu.Q1;
                            if (t6Var != null && tL_messages_stickerSet != null && t6Var.getFragmentView() != null) {
                                org.telegram.messenger.si.b0(t6Var.getCurrentAccount()).g2(t6Var.getFragmentView().getContext(), tL_messages_stickerSet, null, 0, t6Var, null, true, true, foVar, true);
                            }
                            suVar.a(false, true);
                            return;
                        default:
                            suVar.f39430f.V(null, null);
                            return;
                    }
                }
            });
            addView(textView, c8.ja.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
            textView.measure(View.MeasureSpec.makeMeasureSpec(99999, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f11), 1073741824));
            float max = Math.max(f14, (org.telegram.messenger.g0.L(f12) + textView.getMeasuredWidth()) / org.telegram.messenger.g0.f23608p);
            TextView textView2 = new TextView(context);
            this.d = textView2;
            textView2.setTypeface(org.telegram.messenger.g0.o());
            org.telegram.ui.ActionBar.q6.U(textView2, i7, wuVar.J0);
            org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.j6.a0(org.telegram.ui.ActionBar.j6.w0(i7, wuVar.J0) & 268435455, 4, 4);
            org.telegram.ui.ActionBar.m6 g10 = org.telegram.ui.ActionBar.q6.g(i7, 15);
            org.telegram.ui.ActionBar.e6 e6Var2 = wuVar.J0;
            textView2.setBackground(a02);
            org.telegram.ui.ActionBar.q6.j(textView2, a02, null, g10, e6Var2);
            textView2.setText(org.telegram.messenger.hd.M0(2131744855, null));
            textView2.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
            textView2.setGravity(17);
            textView2.setOnClickListener(new View.OnClickListener(this) {
                public final su f38772b;

                {
                    this.f38772b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i72 = r2;
                    su suVar = this.f38772b;
                    switch (i72) {
                        case 0:
                            wu wuVar2 = suVar.f39436y;
                            wuVar2.L1 = SystemClock.elapsedRealtime();
                            wuVar2.M0();
                            return;
                        case 1:
                            wu.J0(suVar.f39431n, suVar.f39432r, true, null, null);
                            suVar.a(true, true);
                            return;
                        case 2:
                            bi.t6 t6Var = suVar.f39431n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = suVar.f39432r;
                            fo foVar = new fo(suVar, 13);
                            Pattern pattern2 = wu.Q1;
                            if (t6Var != null && tL_messages_stickerSet != null && t6Var.getFragmentView() != null) {
                                org.telegram.messenger.si.b0(t6Var.getCurrentAccount()).g2(t6Var.getFragmentView().getContext(), tL_messages_stickerSet, null, 0, t6Var, null, true, true, foVar, true);
                            }
                            suVar.a(false, true);
                            return;
                        default:
                            suVar.f39430f.V(null, null);
                            return;
                    }
                }
            });
            textView2.setClickable(false);
            addView(textView2, c8.ja.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
            textView2.setScaleX(0.0f);
            textView2.setScaleY(0.0f);
            textView2.setAlpha(0.0f);
            textView2.measure(View.MeasureSpec.makeMeasureSpec(99999, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f11), 1073741824));
            f10 = Math.max(max, (org.telegram.messenger.g0.L(f12) + textView2.getMeasuredWidth()) / org.telegram.messenger.g0.f23608p);
        } else {
            f10 = 32.0f;
        }
        float f15 = f10;
        Pattern pattern2 = wu.Q1;
        z70 z70Var = new z70(context, wuVar.J0);
        this.f39426a = z70Var;
        z70Var.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        z70Var.setTypeface(org.telegram.messenger.g0.o());
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        z70Var.setEllipsize(truncateAt);
        z70Var.setSingleLine(true);
        z70Var.setLines(1);
        org.telegram.ui.ActionBar.q6.G(z70Var, org.telegram.ui.ActionBar.j6.J6, wuVar.J0);
        org.telegram.ui.ActionBar.q6.U(z70Var, org.telegram.ui.ActionBar.j6.f28957j5, wuVar.J0);
        if (z10) {
            z70Var.setTextSize(1, 20.0f);
            addView(z70Var, c8.ja.i(-1.0f, -2.0f, 8388659, 12.0f, 11.0f, f15, 0.0f));
        } else {
            z70Var.setTextSize(1, 17.0f);
            addView(z70Var, c8.ja.i(-1.0f, -2.0f, 8388659, 6.0f, 10.0f, f15, 0.0f));
        }
        if (!z10) {
            TextView textView3 = new TextView(context);
            this.f39427b = textView3;
            textView3.setTextSize(1, 13.0f);
            org.telegram.ui.ActionBar.q6.U(textView3, org.telegram.ui.ActionBar.j6.f29088q5, wuVar.J0);
            textView3.setEllipsize(truncateAt);
            textView3.setSingleLine(true);
            textView3.setLines(1);
            addView(textView3, c8.ja.i(-1.0f, -2.0f, 8388659, 8.0f, 31.66f, f15, 0.0f));
        }
        if (z10) {
            org.telegram.ui.ActionBar.q0 q0Var2 = new org.telegram.ui.ActionBar.q0(context, null, 0, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Aj, wuVar.J0), false, wuVar.J0);
            this.f39430f = q0Var2;
            q0Var2.setLongClickEnabled(false);
            q0Var2.setSubMenuOpenSide(2);
            q0Var2.setIcon(2131231244);
            int i10 = org.telegram.ui.ActionBar.j6.Ej;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i10, wuVar.J0), 1, -1);
            org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(i10);
            org.telegram.ui.ActionBar.e6 e6Var3 = wuVar.J0;
            q0Var2.setBackground(h02);
            org.telegram.ui.ActionBar.q6.j(q0Var2, h02, null, M2, e6Var3);
            addView(q0Var2, c8.ja.d(40, 40.0f, 53, 0.0f, 5.0f, 5.0f - (wuVar.f29717u0 / org.telegram.messenger.g0.f23608p), 0.0f));
            q0Var2.e(1, 2131232364, org.telegram.messenger.hd.M0(2131744846, null));
            q0Var2.e(2, 2131232204, org.telegram.messenger.hd.M0(2131751762, null));
            q0Var2.setOnClickListener(new View.OnClickListener(this) {
                public final su f38772b;

                {
                    this.f38772b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i72 = r2;
                    su suVar = this.f38772b;
                    switch (i72) {
                        case 0:
                            wu wuVar2 = suVar.f39436y;
                            wuVar2.L1 = SystemClock.elapsedRealtime();
                            wuVar2.M0();
                            return;
                        case 1:
                            wu.J0(suVar.f39431n, suVar.f39432r, true, null, null);
                            suVar.a(true, true);
                            return;
                        case 2:
                            bi.t6 t6Var = suVar.f39431n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = suVar.f39432r;
                            fo foVar = new fo(suVar, 13);
                            Pattern pattern22 = wu.Q1;
                            if (t6Var != null && tL_messages_stickerSet != null && t6Var.getFragmentView() != null) {
                                org.telegram.messenger.si.b0(t6Var.getCurrentAccount()).g2(t6Var.getFragmentView().getContext(), tL_messages_stickerSet, null, 0, t6Var, null, true, true, foVar, true);
                            }
                            suVar.a(false, true);
                            return;
                        default:
                            suVar.f39430f.V(null, null);
                            return;
                    }
                }
            });
            q0Var2.setDelegate(new s(wuVar, 29));
            q0Var2.setContentDescription(org.telegram.messenger.hd.M0(2131754839, null));
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
        if (this.f39433s != z10) {
            this.f39433s = z10;
            ValueAnimator valueAnimator = this.f39435x;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f39435x = null;
            }
            TextView textView2 = this.f39428c;
            if (textView2 != null && (textView = this.d) != null) {
                textView2.setClickable(!z10);
                textView.setClickable(z10);
                float f16 = 0.0f;
                if (z11) {
                    float f17 = this.f39434w;
                    if (z10) {
                        f16 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f17, f16);
                    this.f39435x = ofFloat;
                    ofFloat.addUpdateListener(new c6(this, 18));
                    this.f39435x.setInterpolator(er.h);
                    this.f39435x.setDuration(250L);
                    this.f39435x.start();
                    return;
                }
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                this.f39434w = f10;
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
