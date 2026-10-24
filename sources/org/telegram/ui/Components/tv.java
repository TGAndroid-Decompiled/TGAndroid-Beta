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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class tv extends FrameLayout {
    public final w90 f30891a;
    public final TextView f30892b;
    public final TextView f30893c;
    public final TextView d;
    public final sg.p0 e;
    public final org.telegram.ui.ActionBar.u0 f30894f;
    public final boolean h;
    public final ai.a5 f30895n;
    public TLRPC.TL_messages_stickerSet f30896r;
    public boolean f30897s;
    public float v;
    public ValueAnimator f30898w;
    public final yv f30899x;

    public tv(yv yvVar, Context context, boolean z10) {
        super(context);
        float f7;
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        org.telegram.ui.ActionBar.g6 g6Var3;
        org.telegram.ui.ActionBar.g6 g6Var4;
        org.telegram.ui.ActionBar.g6 g6Var5;
        int i10;
        org.telegram.ui.ActionBar.g6 g6Var6;
        int i11;
        float f10;
        float f11;
        org.telegram.ui.ActionBar.g6 g6Var7;
        org.telegram.ui.ActionBar.g6 g6Var8;
        org.telegram.ui.ActionBar.g6 g6Var9;
        org.telegram.ui.ActionBar.g6 g6Var10;
        org.telegram.ui.ActionBar.g6 g6Var11;
        this.f30899x = yvVar;
        this.f30895n = new ai.a5(this, 6);
        this.f30897s = false;
        this.v = 0.0f;
        this.h = z10;
        if (!z10) {
            i11 = ((org.telegram.ui.ActionBar.h3) yvVar).currentAccount;
            float f12 = 8.0f;
            if (!UserConfig.getInstance(i11).isPremium()) {
                f11 = 16.0f;
                int dp = AndroidUtilities.dp(4.0f);
                f10 = 28.0f;
                g6Var11 = ((org.telegram.ui.ActionBar.h3) yvVar).resourcesProvider;
                sg.p0 p0Var = new sg.p0(dp, context, g6Var11, false);
                this.e = p0Var;
                p0Var.a(LocaleController.getString(R.string.Unlock), new View.OnClickListener(this) {
                    public final tv f30002b;

                    {
                        this.f30002b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        int i12 = r2;
                        tv tvVar = this.f30002b;
                        switch (i12) {
                            case 0:
                                yv yvVar2 = tvVar.f30899x;
                                yvVar2.Q = SystemClock.elapsedRealtime();
                                yvVar2.j0();
                                return;
                            case 1:
                                yv.g0(tvVar.f30895n, tvVar.f30896r, true, null, null);
                                tvVar.a(true, true);
                                return;
                            case 2:
                                ai.a5 a5Var = tvVar.f30895n;
                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = tvVar.f30896r;
                                xp xpVar = new xp(tvVar, 13);
                                Pattern pattern = yv.V;
                                if (a5Var != null && tL_messages_stickerSet != null && a5Var.getFragmentView() != null) {
                                    MediaDataController.getInstance(a5Var.getCurrentAccount()).toggleStickerSet(a5Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, a5Var, true, true, xpVar, true);
                                }
                                tvVar.a(false, true);
                                return;
                            default:
                                tvVar.f30894f.M(null, null);
                                return;
                        }
                    }
                }, false);
                p0Var.setIcon(R.raw.unlock_icon);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) p0Var.getIconView().getLayoutParams();
                marginLayoutParams.leftMargin = AndroidUtilities.dp(1.0f);
                marginLayoutParams.topMargin = AndroidUtilities.dp(1.0f);
                int dp2 = AndroidUtilities.dp(20.0f);
                marginLayoutParams.height = dp2;
                marginLayoutParams.width = dp2;
                ((ViewGroup.MarginLayoutParams) p0Var.getTextView().getLayoutParams()).leftMargin = AndroidUtilities.dp(3.0f);
                p0Var.getChildAt(0).setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                addView(p0Var, w7.z5.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
                p0Var.measure(View.MeasureSpec.makeMeasureSpec(99999, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(28.0f), 1073741824));
                f12 = (AndroidUtilities.dp(16.0f) + p0Var.getMeasuredWidth()) / AndroidUtilities.density;
            } else {
                f10 = 28.0f;
                f11 = 16.0f;
            }
            float f13 = f12;
            TextView textView = new TextView(context);
            this.f30893c = textView;
            textView.setTypeface(AndroidUtilities.bold());
            int i12 = org.telegram.ui.ActionBar.k6.Sh;
            g6Var7 = ((org.telegram.ui.ActionBar.h3) yvVar).resourcesProvider;
            org.telegram.ui.ActionBar.r6.W(textView, i12, g6Var7);
            int i13 = org.telegram.ui.ActionBar.k6.Oh;
            org.telegram.ui.Cells.y e = org.telegram.ui.ActionBar.a6.e(new float[]{14.0f}, yvVar.getThemedColor(i13));
            org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i13);
            org.telegram.ui.ActionBar.n6 f14 = org.telegram.ui.ActionBar.r6.f(i13);
            g6Var8 = ((org.telegram.ui.ActionBar.h3) yvVar).resourcesProvider;
            textView.setBackground(e);
            org.telegram.ui.ActionBar.r6.k(textView, e, O, f14, g6Var8);
            textView.setPadding(org.telegram.ui.Cells.b1.e(18.0f, R.string.Add, textView), 0, AndroidUtilities.dp(18.0f), 0);
            textView.setGravity(17);
            textView.setOnClickListener(new View.OnClickListener(this) {
                public final tv f30002b;

                {
                    this.f30002b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i122 = r2;
                    tv tvVar = this.f30002b;
                    switch (i122) {
                        case 0:
                            yv yvVar2 = tvVar.f30899x;
                            yvVar2.Q = SystemClock.elapsedRealtime();
                            yvVar2.j0();
                            return;
                        case 1:
                            yv.g0(tvVar.f30895n, tvVar.f30896r, true, null, null);
                            tvVar.a(true, true);
                            return;
                        case 2:
                            ai.a5 a5Var = tvVar.f30895n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = tvVar.f30896r;
                            xp xpVar = new xp(tvVar, 13);
                            Pattern pattern = yv.V;
                            if (a5Var != null && tL_messages_stickerSet != null && a5Var.getFragmentView() != null) {
                                MediaDataController.getInstance(a5Var.getCurrentAccount()).toggleStickerSet(a5Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, a5Var, true, true, xpVar, true);
                            }
                            tvVar.a(false, true);
                            return;
                        default:
                            tvVar.f30894f.M(null, null);
                            return;
                    }
                }
            });
            addView(textView, w7.z5.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
            textView.measure(View.MeasureSpec.makeMeasureSpec(99999, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f10), 1073741824));
            float max = Math.max(f13, (AndroidUtilities.dp(f11) + textView.getMeasuredWidth()) / AndroidUtilities.density);
            TextView textView2 = new TextView(context);
            this.d = textView2;
            textView2.setTypeface(AndroidUtilities.bold());
            g6Var9 = ((org.telegram.ui.ActionBar.h3) yvVar).resourcesProvider;
            org.telegram.ui.ActionBar.r6.W(textView2, i13, g6Var9);
            org.telegram.ui.Cells.y Z = org.telegram.ui.ActionBar.k6.Z(268435455 & yvVar.getThemedColor(i13), 4, 4);
            org.telegram.ui.ActionBar.n6 h = org.telegram.ui.ActionBar.r6.h(i13, 15);
            g6Var10 = ((org.telegram.ui.ActionBar.h3) yvVar).resourcesProvider;
            textView2.setBackground(Z);
            org.telegram.ui.ActionBar.r6.k(textView2, Z, null, h, g6Var10);
            textView2.setPadding(org.telegram.ui.Cells.b1.e(12.0f, R.string.StickersRemove, textView2), 0, AndroidUtilities.dp(12.0f), 0);
            textView2.setGravity(17);
            textView2.setOnClickListener(new View.OnClickListener(this) {
                public final tv f30002b;

                {
                    this.f30002b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i122 = r2;
                    tv tvVar = this.f30002b;
                    switch (i122) {
                        case 0:
                            yv yvVar2 = tvVar.f30899x;
                            yvVar2.Q = SystemClock.elapsedRealtime();
                            yvVar2.j0();
                            return;
                        case 1:
                            yv.g0(tvVar.f30895n, tvVar.f30896r, true, null, null);
                            tvVar.a(true, true);
                            return;
                        case 2:
                            ai.a5 a5Var = tvVar.f30895n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = tvVar.f30896r;
                            xp xpVar = new xp(tvVar, 13);
                            Pattern pattern = yv.V;
                            if (a5Var != null && tL_messages_stickerSet != null && a5Var.getFragmentView() != null) {
                                MediaDataController.getInstance(a5Var.getCurrentAccount()).toggleStickerSet(a5Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, a5Var, true, true, xpVar, true);
                            }
                            tvVar.a(false, true);
                            return;
                        default:
                            tvVar.f30894f.M(null, null);
                            return;
                    }
                }
            });
            textView2.setClickable(false);
            addView(textView2, w7.z5.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
            textView2.setScaleX(0.0f);
            textView2.setScaleY(0.0f);
            textView2.setAlpha(0.0f);
            textView2.measure(View.MeasureSpec.makeMeasureSpec(99999, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f10), 1073741824));
            f7 = Math.max(max, (AndroidUtilities.dp(f11) + textView2.getMeasuredWidth()) / AndroidUtilities.density);
        } else {
            f7 = 32.0f;
        }
        float f15 = f7;
        g6Var = ((org.telegram.ui.ActionBar.h3) yvVar).resourcesProvider;
        w90 w90Var = new w90(context, g6Var);
        this.f30891a = w90Var;
        w90Var.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        w90Var.setTypeface(AndroidUtilities.bold());
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        w90Var.setEllipsize(truncateAt);
        w90Var.setSingleLine(true);
        w90Var.setLines(1);
        int i14 = org.telegram.ui.ActionBar.k6.J6;
        g6Var2 = ((org.telegram.ui.ActionBar.h3) yvVar).resourcesProvider;
        org.telegram.ui.ActionBar.r6.I(w90Var, i14, g6Var2);
        int i15 = org.telegram.ui.ActionBar.k6.f21290j5;
        g6Var3 = ((org.telegram.ui.ActionBar.h3) yvVar).resourcesProvider;
        org.telegram.ui.ActionBar.r6.W(w90Var, i15, g6Var3);
        if (z10) {
            w90Var.setTextSize(1, 20.0f);
            addView(w90Var, w7.z5.i(-1.0f, -2.0f, 8388659, 12.0f, 11.0f, f15, 0.0f));
        } else {
            w90Var.setTextSize(1, 17.0f);
            addView(w90Var, w7.z5.i(-1.0f, -2.0f, 8388659, 6.0f, 10.0f, f15, 0.0f));
        }
        if (!z10) {
            TextView textView3 = new TextView(context);
            this.f30892b = textView3;
            textView3.setTextSize(1, 13.0f);
            int i16 = org.telegram.ui.ActionBar.k6.f21421q5;
            g6Var6 = ((org.telegram.ui.ActionBar.h3) yvVar).resourcesProvider;
            org.telegram.ui.ActionBar.r6.W(textView3, i16, g6Var6);
            textView3.setEllipsize(truncateAt);
            textView3.setSingleLine(true);
            textView3.setLines(1);
            addView(textView3, w7.z5.i(-1.0f, -2.0f, 8388659, 8.0f, 31.66f, f15, 0.0f));
        }
        if (z10) {
            int themedColor = yvVar.getThemedColor(org.telegram.ui.ActionBar.k6.Ji);
            g6Var4 = ((org.telegram.ui.ActionBar.h3) yvVar).resourcesProvider;
            org.telegram.ui.ActionBar.u0 u0Var = new org.telegram.ui.ActionBar.u0(context, null, 0, themedColor, false, g6Var4);
            this.f30894f = u0Var;
            u0Var.setLongClickEnabled(false);
            u0Var.setSubMenuOpenSide(2);
            u0Var.setIcon(R.drawable.ic_ab_other);
            int i17 = org.telegram.ui.ActionBar.k6.Ni;
            org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.k6.g0(yvVar.getThemedColor(i17), 1, -1);
            org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(i17);
            g6Var5 = ((org.telegram.ui.ActionBar.h3) yvVar).resourcesProvider;
            u0Var.setBackground(g02);
            org.telegram.ui.ActionBar.r6.k(u0Var, g02, null, O2, g6Var5);
            i10 = ((org.telegram.ui.ActionBar.h3) yvVar).backgroundPaddingLeft;
            addView(u0Var, w7.z5.d(40, 40.0f, 53, 0.0f, 5.0f, 5.0f - (i10 / AndroidUtilities.density), 0.0f));
            u0Var.e(1, R.drawable.msg_share, LocaleController.getString(R.string.StickersShare));
            u0Var.e(2, R.drawable.msg_link, LocaleController.getString(R.string.CopyLink));
            u0Var.setOnClickListener(new View.OnClickListener(this) {
                public final tv f30002b;

                {
                    this.f30002b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i122 = r2;
                    tv tvVar = this.f30002b;
                    switch (i122) {
                        case 0:
                            yv yvVar2 = tvVar.f30899x;
                            yvVar2.Q = SystemClock.elapsedRealtime();
                            yvVar2.j0();
                            return;
                        case 1:
                            yv.g0(tvVar.f30895n, tvVar.f30896r, true, null, null);
                            tvVar.a(true, true);
                            return;
                        case 2:
                            ai.a5 a5Var = tvVar.f30895n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = tvVar.f30896r;
                            xp xpVar = new xp(tvVar, 13);
                            Pattern pattern = yv.V;
                            if (a5Var != null && tL_messages_stickerSet != null && a5Var.getFragmentView() != null) {
                                MediaDataController.getInstance(a5Var.getCurrentAccount()).toggleStickerSet(a5Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, a5Var, true, true, xpVar, true);
                            }
                            tvVar.a(false, true);
                            return;
                        default:
                            tvVar.f30894f.M(null, null);
                            return;
                    }
                }
            });
            u0Var.setDelegate(new rv(yvVar, 0));
            u0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
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
        if (this.f30897s != z10) {
            this.f30897s = z10;
            ValueAnimator valueAnimator = this.f30898w;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f30898w = null;
            }
            TextView textView2 = this.f30893c;
            if (textView2 != null && (textView = this.d) != null) {
                textView2.setClickable(!z10);
                textView.setClickable(z10);
                float f15 = 0.0f;
                if (z11) {
                    float f16 = this.v;
                    if (z10) {
                        f15 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f16, f15);
                    this.f30898w = ofFloat;
                    ofFloat.addUpdateListener(new j6(this, 19));
                    this.f30898w.setInterpolator(zr.h);
                    this.f30898w.setDuration(250L);
                    this.f30898w.start();
                    return;
                }
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                this.v = f7;
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
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7), 1073741824));
    }
}
