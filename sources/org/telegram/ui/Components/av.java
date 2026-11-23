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
public final class av extends FrameLayout {
    public final m80 f33639a;
    public final TextView f33640b;
    public final TextView f33641c;
    public final TextView d;
    public final ug.r0 f33642e;
    public final org.telegram.ui.ActionBar.q0 f33643f;
    public final boolean h;
    public final bi.b9 f33644n;
    public TLRPC.TL_messages_stickerSet f33645r;
    public boolean f33646s;
    public float f33647w;
    public ValueAnimator f33648x;
    public final ev f33649y;

    public av(ev evVar, Context context, boolean z10) {
        super(context);
        float f10;
        float f11;
        float f12;
        this.f33649y = evVar;
        this.f33644n = new bi.b9(this, 7);
        this.f33646s = false;
        this.f33647w = 0.0f;
        this.h = z10;
        if (!z10) {
            Pattern pattern = ev.Q1;
            float f13 = 8.0f;
            if (!org.telegram.messenger.k10.i(evVar.f30173a).q()) {
                f12 = 16.0f;
                f11 = 28.0f;
                ug.r0 r0Var = new ug.r0(org.telegram.messenger.g0.L(4.0f), context, evVar.J0, false);
                this.f33642e = r0Var;
                r0Var.b(org.telegram.messenger.hd.N0(2131743631, null), new View.OnClickListener(this) {
                    public final av f42550b;

                    {
                        this.f42550b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        int i7 = r2;
                        av avVar = this.f42550b;
                        switch (i7) {
                            case 0:
                                ev evVar2 = avVar.f33649y;
                                evVar2.L1 = SystemClock.elapsedRealtime();
                                evVar2.N0();
                                return;
                            case 1:
                                ev.K0(avVar.f33644n, avVar.f33645r, true, null, null);
                                avVar.a(true, true);
                                return;
                            case 2:
                                bi.b9 b9Var = avVar.f33644n;
                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = avVar.f33645r;
                                oo ooVar = new oo(avVar, 13);
                                Pattern pattern2 = ev.Q1;
                                if (b9Var != null && tL_messages_stickerSet != null && b9Var.getFragmentView() != null) {
                                    org.telegram.messenger.si.d0(b9Var.getCurrentAccount()).l2(b9Var.getFragmentView().getContext(), tL_messages_stickerSet, null, 0, b9Var, null, true, true, ooVar, true);
                                }
                                avVar.a(false, true);
                                return;
                            default:
                                avVar.f33643f.V(null, null);
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
                addView(r0Var, c8.ma.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
                r0Var.measure(View.MeasureSpec.makeMeasureSpec(99999, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(28.0f), 1073741824));
                f13 = (org.telegram.messenger.g0.L(16.0f) + r0Var.getMeasuredWidth()) / org.telegram.messenger.g0.f24045p;
            } else {
                f11 = 28.0f;
                f12 = 16.0f;
            }
            float f14 = f13;
            TextView textView = new TextView(context);
            this.f33641c = textView;
            textView.setTypeface(org.telegram.messenger.g0.o());
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.Ji, evVar.J0);
            int i7 = org.telegram.ui.ActionBar.m6.Fi;
            org.telegram.ui.Cells.y e10 = org.telegram.ui.ActionBar.a6.e(org.telegram.ui.ActionBar.m6.w0(i7, evVar.J0), 14.0f);
            org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i7);
            org.telegram.ui.ActionBar.p6 e11 = org.telegram.ui.ActionBar.t6.e(i7);
            org.telegram.ui.ActionBar.h6 h6Var = evVar.J0;
            textView.setBackground(e10);
            org.telegram.ui.ActionBar.t6.j(textView, e10, M, e11, h6Var);
            textView.setText(org.telegram.messenger.hd.N0(2131754483, null));
            textView.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
            textView.setGravity(17);
            textView.setOnClickListener(new View.OnClickListener(this) {
                public final av f42550b;

                {
                    this.f42550b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i72 = r2;
                    av avVar = this.f42550b;
                    switch (i72) {
                        case 0:
                            ev evVar2 = avVar.f33649y;
                            evVar2.L1 = SystemClock.elapsedRealtime();
                            evVar2.N0();
                            return;
                        case 1:
                            ev.K0(avVar.f33644n, avVar.f33645r, true, null, null);
                            avVar.a(true, true);
                            return;
                        case 2:
                            bi.b9 b9Var = avVar.f33644n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = avVar.f33645r;
                            oo ooVar = new oo(avVar, 13);
                            Pattern pattern2 = ev.Q1;
                            if (b9Var != null && tL_messages_stickerSet != null && b9Var.getFragmentView() != null) {
                                org.telegram.messenger.si.d0(b9Var.getCurrentAccount()).l2(b9Var.getFragmentView().getContext(), tL_messages_stickerSet, null, 0, b9Var, null, true, true, ooVar, true);
                            }
                            avVar.a(false, true);
                            return;
                        default:
                            avVar.f33643f.V(null, null);
                            return;
                    }
                }
            });
            addView(textView, c8.ma.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
            textView.measure(View.MeasureSpec.makeMeasureSpec(99999, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f11), 1073741824));
            float max = Math.max(f14, (org.telegram.messenger.g0.L(f12) + textView.getMeasuredWidth()) / org.telegram.messenger.g0.f24045p);
            TextView textView2 = new TextView(context);
            this.d = textView2;
            textView2.setTypeface(org.telegram.messenger.g0.o());
            org.telegram.ui.ActionBar.t6.U(textView2, i7, evVar.J0);
            org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.m6.a0(org.telegram.ui.ActionBar.m6.w0(i7, evVar.J0) & 268435455, 4, 4);
            org.telegram.ui.ActionBar.p6 g10 = org.telegram.ui.ActionBar.t6.g(i7, 15);
            org.telegram.ui.ActionBar.h6 h6Var2 = evVar.J0;
            textView2.setBackground(a02);
            org.telegram.ui.ActionBar.t6.j(textView2, a02, null, g10, h6Var2);
            textView2.setText(org.telegram.messenger.hd.N0(2131744612, null));
            textView2.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
            textView2.setGravity(17);
            textView2.setOnClickListener(new View.OnClickListener(this) {
                public final av f42550b;

                {
                    this.f42550b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i72 = r2;
                    av avVar = this.f42550b;
                    switch (i72) {
                        case 0:
                            ev evVar2 = avVar.f33649y;
                            evVar2.L1 = SystemClock.elapsedRealtime();
                            evVar2.N0();
                            return;
                        case 1:
                            ev.K0(avVar.f33644n, avVar.f33645r, true, null, null);
                            avVar.a(true, true);
                            return;
                        case 2:
                            bi.b9 b9Var = avVar.f33644n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = avVar.f33645r;
                            oo ooVar = new oo(avVar, 13);
                            Pattern pattern2 = ev.Q1;
                            if (b9Var != null && tL_messages_stickerSet != null && b9Var.getFragmentView() != null) {
                                org.telegram.messenger.si.d0(b9Var.getCurrentAccount()).l2(b9Var.getFragmentView().getContext(), tL_messages_stickerSet, null, 0, b9Var, null, true, true, ooVar, true);
                            }
                            avVar.a(false, true);
                            return;
                        default:
                            avVar.f33643f.V(null, null);
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
            f10 = Math.max(max, (org.telegram.messenger.g0.L(f12) + textView2.getMeasuredWidth()) / org.telegram.messenger.g0.f24045p);
        } else {
            f10 = 32.0f;
        }
        float f15 = f10;
        Pattern pattern2 = ev.Q1;
        m80 m80Var = new m80(context, evVar.J0);
        this.f33639a = m80Var;
        m80Var.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        m80Var.setTypeface(org.telegram.messenger.g0.o());
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        m80Var.setEllipsize(truncateAt);
        m80Var.setSingleLine(true);
        m80Var.setLines(1);
        org.telegram.ui.ActionBar.t6.G(m80Var, org.telegram.ui.ActionBar.m6.J6, evVar.J0);
        org.telegram.ui.ActionBar.t6.U(m80Var, org.telegram.ui.ActionBar.m6.f29489j5, evVar.J0);
        if (z10) {
            m80Var.setTextSize(1, 20.0f);
            addView(m80Var, c8.ma.i(-1.0f, -2.0f, 8388659, 12.0f, 11.0f, f15, 0.0f));
        } else {
            m80Var.setTextSize(1, 17.0f);
            addView(m80Var, c8.ma.i(-1.0f, -2.0f, 8388659, 6.0f, 10.0f, f15, 0.0f));
        }
        if (!z10) {
            TextView textView3 = new TextView(context);
            this.f33640b = textView3;
            textView3.setTextSize(1, 13.0f);
            org.telegram.ui.ActionBar.t6.U(textView3, org.telegram.ui.ActionBar.m6.f29620q5, evVar.J0);
            textView3.setEllipsize(truncateAt);
            textView3.setSingleLine(true);
            textView3.setLines(1);
            addView(textView3, c8.ma.i(-1.0f, -2.0f, 8388659, 8.0f, 31.66f, f15, 0.0f));
        }
        if (z10) {
            org.telegram.ui.ActionBar.q0 q0Var = new org.telegram.ui.ActionBar.q0(context, null, 0, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Aj, evVar.J0), false, evVar.J0);
            this.f33643f = q0Var;
            q0Var.setLongClickEnabled(false);
            q0Var.setSubMenuOpenSide(2);
            q0Var.setIcon(2131231244);
            int i10 = org.telegram.ui.ActionBar.m6.Ej;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i10, evVar.J0), 1, -1);
            org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i10);
            org.telegram.ui.ActionBar.h6 h6Var3 = evVar.J0;
            q0Var.setBackground(h02);
            org.telegram.ui.ActionBar.t6.j(q0Var, h02, null, M2, h6Var3);
            addView(q0Var, c8.ma.d(40, 40.0f, 53, 0.0f, 5.0f, 5.0f - (evVar.f30211u0 / org.telegram.messenger.g0.f24045p), 0.0f));
            q0Var.e(1, 2131232365, org.telegram.messenger.hd.N0(2131744603, null));
            q0Var.e(2, 2131232205, org.telegram.messenger.hd.N0(2131751750, null));
            q0Var.setOnClickListener(new View.OnClickListener(this) {
                public final av f42550b;

                {
                    this.f42550b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i72 = r2;
                    av avVar = this.f42550b;
                    switch (i72) {
                        case 0:
                            ev evVar2 = avVar.f33649y;
                            evVar2.L1 = SystemClock.elapsedRealtime();
                            evVar2.N0();
                            return;
                        case 1:
                            ev.K0(avVar.f33644n, avVar.f33645r, true, null, null);
                            avVar.a(true, true);
                            return;
                        case 2:
                            bi.b9 b9Var = avVar.f33644n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = avVar.f33645r;
                            oo ooVar = new oo(avVar, 13);
                            Pattern pattern22 = ev.Q1;
                            if (b9Var != null && tL_messages_stickerSet != null && b9Var.getFragmentView() != null) {
                                org.telegram.messenger.si.d0(b9Var.getCurrentAccount()).l2(b9Var.getFragmentView().getContext(), tL_messages_stickerSet, null, 0, b9Var, null, true, true, ooVar, true);
                            }
                            avVar.a(false, true);
                            return;
                        default:
                            avVar.f33643f.V(null, null);
                            return;
                    }
                }
            });
            q0Var.setDelegate(new c0(evVar, 28));
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
        if (this.f33646s != z10) {
            this.f33646s = z10;
            ValueAnimator valueAnimator = this.f33648x;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f33648x = null;
            }
            TextView textView2 = this.f33641c;
            if (textView2 != null && (textView = this.d) != null) {
                textView2.setClickable(!z10);
                textView.setClickable(z10);
                float f16 = 0.0f;
                if (z11) {
                    float f17 = this.f33647w;
                    if (z10) {
                        f16 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f17, f16);
                    this.f33648x = ofFloat;
                    ofFloat.addUpdateListener(new x(this, 19));
                    this.f33648x.setInterpolator(nr.h);
                    this.f33648x.setDuration(250L);
                    this.f33648x.start();
                    return;
                }
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                this.f33647w = f10;
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
