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
public final class rv extends FrameLayout {
    public final m90 f26762a;
    public final TextView f26763b;
    public final TextView f26764c;
    public final TextView d;
    public final qg.s0 e;
    public final org.telegram.ui.ActionBar.w0 f26765f;
    public final boolean h;
    public final bi.o1 f26766n;
    public TLRPC.TL_messages_stickerSet f26767r;
    public boolean f26768s;
    public float v;
    public ValueAnimator f26769w;
    public final wv f26770x;

    public rv(wv wvVar, Context context, boolean z10) {
        super(context);
        float f7;
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        org.telegram.ui.ActionBar.f6 f6Var3;
        int i10;
        int i11;
        float f10;
        float f11;
        float f12;
        org.telegram.ui.ActionBar.f6 f6Var4;
        this.f26770x = wvVar;
        this.f26766n = new bi.o1(this, 3);
        this.f26768s = false;
        this.v = 0.0f;
        this.h = z10;
        if (!z10) {
            i11 = ((org.telegram.ui.ActionBar.h3) wvVar).currentAccount;
            if (!UserConfig.getInstance(i11).isPremium()) {
                f11 = 16.0f;
                int dp = AndroidUtilities.dp(4.0f);
                f10 = 28.0f;
                f6Var4 = ((org.telegram.ui.ActionBar.h3) wvVar).resourcesProvider;
                qg.s0 s0Var = new qg.s0(dp, context, f6Var4, false);
                this.e = s0Var;
                s0Var.a(LocaleController.getString(R.string.Unlock), new View.OnClickListener(this) {
                    public final rv f25920b;

                    {
                        this.f25920b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        int i12 = r2;
                        rv rvVar = this.f25920b;
                        switch (i12) {
                            case 0:
                                wv wvVar2 = rvVar.f26770x;
                                wvVar2.Q = SystemClock.elapsedRealtime();
                                wvVar2.Z();
                                return;
                            case 1:
                                wv.W(rvVar.f26766n, rvVar.f26767r, true, null, null);
                                rvVar.a(true, true);
                                return;
                            case 2:
                                bi.o1 o1Var = rvVar.f26766n;
                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = rvVar.f26767r;
                                dq dqVar = new dq(rvVar, 12);
                                Pattern pattern = wv.V;
                                if (o1Var != null && tL_messages_stickerSet != null && o1Var.getFragmentView() != null) {
                                    MediaDataController.getInstance(o1Var.getCurrentAccount()).toggleStickerSet(o1Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, o1Var, true, true, dqVar, true);
                                }
                                rvVar.a(false, true);
                                return;
                            default:
                                rvVar.f26765f.M(null, null);
                                return;
                        }
                    }
                }, false);
                s0Var.setIcon(R.raw.unlock_icon);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) s0Var.getIconView().getLayoutParams();
                marginLayoutParams.leftMargin = AndroidUtilities.dp(1.0f);
                marginLayoutParams.topMargin = AndroidUtilities.dp(1.0f);
                int dp2 = AndroidUtilities.dp(20.0f);
                marginLayoutParams.height = dp2;
                marginLayoutParams.width = dp2;
                ((ViewGroup.MarginLayoutParams) s0Var.getTextView().getLayoutParams()).leftMargin = AndroidUtilities.dp(3.0f);
                s0Var.getChildAt(0).setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                addView(s0Var, w7.a6.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
                s0Var.measure(View.MeasureSpec.makeMeasureSpec(99999, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(28.0f), 1073741824));
                f12 = (AndroidUtilities.dp(16.0f) + s0Var.getMeasuredWidth()) / AndroidUtilities.density;
            } else {
                f10 = 28.0f;
                f11 = 16.0f;
                f12 = 8.0f;
            }
            TextView textView = new TextView(context);
            this.f26764c = textView;
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextColor(wvVar.getThemedColor(org.telegram.ui.ActionBar.j6.Sh));
            int i12 = org.telegram.ui.ActionBar.j6.Oh;
            textView.setBackground(org.telegram.ui.ActionBar.z5.e(new float[]{14.0f}, wvVar.getThemedColor(i12)));
            textView.setPadding(org.telegram.ui.Cells.r6.b(18.0f, R.string.Add, textView), 0, AndroidUtilities.dp(18.0f), 0);
            textView.setGravity(17);
            textView.setOnClickListener(new View.OnClickListener(this) {
                public final rv f25920b;

                {
                    this.f25920b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i122 = r2;
                    rv rvVar = this.f25920b;
                    switch (i122) {
                        case 0:
                            wv wvVar2 = rvVar.f26770x;
                            wvVar2.Q = SystemClock.elapsedRealtime();
                            wvVar2.Z();
                            return;
                        case 1:
                            wv.W(rvVar.f26766n, rvVar.f26767r, true, null, null);
                            rvVar.a(true, true);
                            return;
                        case 2:
                            bi.o1 o1Var = rvVar.f26766n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = rvVar.f26767r;
                            dq dqVar = new dq(rvVar, 12);
                            Pattern pattern = wv.V;
                            if (o1Var != null && tL_messages_stickerSet != null && o1Var.getFragmentView() != null) {
                                MediaDataController.getInstance(o1Var.getCurrentAccount()).toggleStickerSet(o1Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, o1Var, true, true, dqVar, true);
                            }
                            rvVar.a(false, true);
                            return;
                        default:
                            rvVar.f26765f.M(null, null);
                            return;
                    }
                }
            });
            addView(textView, w7.a6.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
            textView.measure(View.MeasureSpec.makeMeasureSpec(99999, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f10), 1073741824));
            float max = Math.max(f12, (AndroidUtilities.dp(f11) + textView.getMeasuredWidth()) / AndroidUtilities.density);
            TextView textView2 = new TextView(context);
            this.d = textView2;
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setTextColor(wvVar.getThemedColor(i12));
            textView2.setBackground(org.telegram.ui.ActionBar.j6.Y(wvVar.getThemedColor(i12) & 268435455, 4, 4));
            textView2.setPadding(org.telegram.ui.Cells.r6.b(12.0f, R.string.StickersRemove, textView2), 0, AndroidUtilities.dp(12.0f), 0);
            textView2.setGravity(17);
            textView2.setOnClickListener(new View.OnClickListener(this) {
                public final rv f25920b;

                {
                    this.f25920b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i122 = r2;
                    rv rvVar = this.f25920b;
                    switch (i122) {
                        case 0:
                            wv wvVar2 = rvVar.f26770x;
                            wvVar2.Q = SystemClock.elapsedRealtime();
                            wvVar2.Z();
                            return;
                        case 1:
                            wv.W(rvVar.f26766n, rvVar.f26767r, true, null, null);
                            rvVar.a(true, true);
                            return;
                        case 2:
                            bi.o1 o1Var = rvVar.f26766n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = rvVar.f26767r;
                            dq dqVar = new dq(rvVar, 12);
                            Pattern pattern = wv.V;
                            if (o1Var != null && tL_messages_stickerSet != null && o1Var.getFragmentView() != null) {
                                MediaDataController.getInstance(o1Var.getCurrentAccount()).toggleStickerSet(o1Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, o1Var, true, true, dqVar, true);
                            }
                            rvVar.a(false, true);
                            return;
                        default:
                            rvVar.f26765f.M(null, null);
                            return;
                    }
                }
            });
            textView2.setClickable(false);
            addView(textView2, w7.a6.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
            textView2.setScaleX(0.0f);
            textView2.setScaleY(0.0f);
            textView2.setAlpha(0.0f);
            textView2.measure(View.MeasureSpec.makeMeasureSpec(99999, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f10), 1073741824));
            f7 = Math.max(max, (AndroidUtilities.dp(f11) + textView2.getMeasuredWidth()) / AndroidUtilities.density);
        } else {
            f7 = 32.0f;
        }
        f6Var = ((org.telegram.ui.ActionBar.h3) wvVar).resourcesProvider;
        m90 m90Var = new m90(context, f6Var);
        this.f26762a = m90Var;
        m90Var.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        m90Var.setTypeface(AndroidUtilities.bold());
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        m90Var.setEllipsize(truncateAt);
        m90Var.setSingleLine(true);
        m90Var.setLines(1);
        int i13 = org.telegram.ui.ActionBar.j6.J6;
        f6Var2 = ((org.telegram.ui.ActionBar.h3) wvVar).resourcesProvider;
        m90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i13, f6Var2));
        m90Var.setTextColor(wvVar.getThemedColor(org.telegram.ui.ActionBar.j6.f18034j5));
        if (z10) {
            m90Var.setTextSize(1, 20.0f);
            addView(m90Var, w7.a6.i(-1.0f, -2.0f, 8388659, 12.0f, 11.0f, f7, 0.0f));
        } else {
            m90Var.setTextSize(1, 17.0f);
            addView(m90Var, w7.a6.i(-1.0f, -2.0f, 8388659, 6.0f, 10.0f, f7, 0.0f));
        }
        if (!z10) {
            TextView textView3 = new TextView(context);
            this.f26763b = textView3;
            textView3.setTextSize(1, 13.0f);
            textView3.setTextColor(wvVar.getThemedColor(org.telegram.ui.ActionBar.j6.f18161q5));
            textView3.setEllipsize(truncateAt);
            textView3.setSingleLine(true);
            textView3.setLines(1);
            addView(textView3, w7.a6.i(-1.0f, -2.0f, 8388659, 8.0f, 31.66f, f7, 0.0f));
        }
        if (z10) {
            int themedColor = wvVar.getThemedColor(org.telegram.ui.ActionBar.j6.Ji);
            f6Var3 = ((org.telegram.ui.ActionBar.h3) wvVar).resourcesProvider;
            org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(context, null, 0, themedColor, false, f6Var3);
            this.f26765f = w0Var;
            w0Var.setLongClickEnabled(false);
            w0Var.setSubMenuOpenSide(2);
            w0Var.setIcon(R.drawable.ic_ab_other);
            w0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(wvVar.getThemedColor(org.telegram.ui.ActionBar.j6.Ni), 1, -1));
            i10 = ((org.telegram.ui.ActionBar.h3) wvVar).backgroundPaddingLeft;
            addView(w0Var, w7.a6.d(40, 40.0f, 53, 0.0f, 5.0f, 5.0f - (i10 / AndroidUtilities.density), 0.0f));
            w0Var.e(1, R.drawable.msg_share, LocaleController.getString(R.string.StickersShare));
            w0Var.e(2, R.drawable.msg_link, LocaleController.getString(R.string.CopyLink));
            w0Var.setOnClickListener(new View.OnClickListener(this) {
                public final rv f25920b;

                {
                    this.f25920b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i122 = r2;
                    rv rvVar = this.f25920b;
                    switch (i122) {
                        case 0:
                            wv wvVar2 = rvVar.f26770x;
                            wvVar2.Q = SystemClock.elapsedRealtime();
                            wvVar2.Z();
                            return;
                        case 1:
                            wv.W(rvVar.f26766n, rvVar.f26767r, true, null, null);
                            rvVar.a(true, true);
                            return;
                        case 2:
                            bi.o1 o1Var = rvVar.f26766n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = rvVar.f26767r;
                            dq dqVar = new dq(rvVar, 12);
                            Pattern pattern = wv.V;
                            if (o1Var != null && tL_messages_stickerSet != null && o1Var.getFragmentView() != null) {
                                MediaDataController.getInstance(o1Var.getCurrentAccount()).toggleStickerSet(o1Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, o1Var, true, true, dqVar, true);
                            }
                            rvVar.a(false, true);
                            return;
                        default:
                            rvVar.f26765f.M(null, null);
                            return;
                    }
                }
            });
            w0Var.setDelegate(new pv(wvVar, 0));
            w0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
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
        if (this.f26768s != z10) {
            this.f26768s = z10;
            ValueAnimator valueAnimator = this.f26769w;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f26769w = null;
            }
            TextView textView2 = this.f26764c;
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
                    this.f26769w = ofFloat;
                    ofFloat.addUpdateListener(new j6(this, 18));
                    this.f26769w.setInterpolator(wr.h);
                    this.f26769w.setDuration(250L);
                    this.f26769w.start();
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
