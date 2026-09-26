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
public final class ov extends FrameLayout {
    public final n90 f27197a;
    public final TextView f27198b;
    public final TextView f27199c;
    public final TextView d;
    public final rg.p0 e;
    public final org.telegram.ui.ActionBar.u0 f27200f;
    public final boolean h;
    public final ai.y3 f27201n;
    public TLRPC.TL_messages_stickerSet f27202r;
    public boolean f27203s;
    public float v;
    public ValueAnimator f27204w;
    public final tv f27205x;

    public ov(tv tvVar, Context context, boolean z10) {
        super(context);
        float f7;
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        org.telegram.ui.ActionBar.d6 d6Var3;
        int i10;
        int i11;
        float f10;
        float f11;
        org.telegram.ui.ActionBar.d6 d6Var4;
        this.f27205x = tvVar;
        this.f27201n = new ai.y3(this, 5);
        this.f27203s = false;
        this.v = 0.0f;
        this.h = z10;
        if (!z10) {
            i11 = ((org.telegram.ui.ActionBar.e3) tvVar).currentAccount;
            float f12 = 8.0f;
            if (!UserConfig.getInstance(i11).isPremium()) {
                f11 = 16.0f;
                int dp = AndroidUtilities.dp(4.0f);
                f10 = 28.0f;
                d6Var4 = ((org.telegram.ui.ActionBar.e3) tvVar).resourcesProvider;
                rg.p0 p0Var = new rg.p0(dp, context, d6Var4, false);
                this.e = p0Var;
                p0Var.a(LocaleController.getString(R.string.Unlock), new View.OnClickListener(this) {
                    public final ov f26200b;

                    {
                        this.f26200b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        int i12 = r2;
                        ov ovVar = this.f26200b;
                        switch (i12) {
                            case 0:
                                tv tvVar2 = ovVar.f27205x;
                                tvVar2.Q = SystemClock.elapsedRealtime();
                                tvVar2.Z();
                                return;
                            case 1:
                                tv.W(ovVar.f27201n, ovVar.f27202r, true, null, null);
                                ovVar.a(true, true);
                                return;
                            case 2:
                                ai.y3 y3Var = ovVar.f27201n;
                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = ovVar.f27202r;
                                yp ypVar = new yp(ovVar, 12);
                                Pattern pattern = tv.V;
                                if (y3Var != null && tL_messages_stickerSet != null && y3Var.getFragmentView() != null) {
                                    MediaDataController.getInstance(y3Var.getCurrentAccount()).toggleStickerSet(y3Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, y3Var, true, true, ypVar, true);
                                }
                                ovVar.a(false, true);
                                return;
                            default:
                                ovVar.f27200f.M(null, null);
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
                addView(p0Var, w7.y5.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
                p0Var.measure(View.MeasureSpec.makeMeasureSpec(99999, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(28.0f), 1073741824));
                f12 = (AndroidUtilities.dp(16.0f) + p0Var.getMeasuredWidth()) / AndroidUtilities.density;
            } else {
                f10 = 28.0f;
                f11 = 16.0f;
            }
            TextView textView = new TextView(context);
            this.f27199c = textView;
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextColor(tvVar.getThemedColor(org.telegram.ui.ActionBar.h6.Sh));
            int i12 = org.telegram.ui.ActionBar.h6.Oh;
            textView.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{14.0f}, tvVar.getThemedColor(i12)));
            textView.setPadding(org.telegram.ui.Cells.c1.c(18.0f, R.string.Add, textView), 0, AndroidUtilities.dp(18.0f), 0);
            textView.setGravity(17);
            textView.setOnClickListener(new View.OnClickListener(this) {
                public final ov f26200b;

                {
                    this.f26200b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i122 = r2;
                    ov ovVar = this.f26200b;
                    switch (i122) {
                        case 0:
                            tv tvVar2 = ovVar.f27205x;
                            tvVar2.Q = SystemClock.elapsedRealtime();
                            tvVar2.Z();
                            return;
                        case 1:
                            tv.W(ovVar.f27201n, ovVar.f27202r, true, null, null);
                            ovVar.a(true, true);
                            return;
                        case 2:
                            ai.y3 y3Var = ovVar.f27201n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = ovVar.f27202r;
                            yp ypVar = new yp(ovVar, 12);
                            Pattern pattern = tv.V;
                            if (y3Var != null && tL_messages_stickerSet != null && y3Var.getFragmentView() != null) {
                                MediaDataController.getInstance(y3Var.getCurrentAccount()).toggleStickerSet(y3Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, y3Var, true, true, ypVar, true);
                            }
                            ovVar.a(false, true);
                            return;
                        default:
                            ovVar.f27200f.M(null, null);
                            return;
                    }
                }
            });
            addView(textView, w7.y5.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
            textView.measure(View.MeasureSpec.makeMeasureSpec(99999, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f10), 1073741824));
            float max = Math.max(f12, (AndroidUtilities.dp(f11) + textView.getMeasuredWidth()) / AndroidUtilities.density);
            TextView textView2 = new TextView(context);
            this.d = textView2;
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setTextColor(tvVar.getThemedColor(i12));
            textView2.setBackground(org.telegram.ui.ActionBar.h6.Y(tvVar.getThemedColor(i12) & 268435455, 4, 4));
            textView2.setPadding(org.telegram.ui.Cells.c1.c(12.0f, R.string.StickersRemove, textView2), 0, AndroidUtilities.dp(12.0f), 0);
            textView2.setGravity(17);
            textView2.setOnClickListener(new View.OnClickListener(this) {
                public final ov f26200b;

                {
                    this.f26200b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i122 = r2;
                    ov ovVar = this.f26200b;
                    switch (i122) {
                        case 0:
                            tv tvVar2 = ovVar.f27205x;
                            tvVar2.Q = SystemClock.elapsedRealtime();
                            tvVar2.Z();
                            return;
                        case 1:
                            tv.W(ovVar.f27201n, ovVar.f27202r, true, null, null);
                            ovVar.a(true, true);
                            return;
                        case 2:
                            ai.y3 y3Var = ovVar.f27201n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = ovVar.f27202r;
                            yp ypVar = new yp(ovVar, 12);
                            Pattern pattern = tv.V;
                            if (y3Var != null && tL_messages_stickerSet != null && y3Var.getFragmentView() != null) {
                                MediaDataController.getInstance(y3Var.getCurrentAccount()).toggleStickerSet(y3Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, y3Var, true, true, ypVar, true);
                            }
                            ovVar.a(false, true);
                            return;
                        default:
                            ovVar.f27200f.M(null, null);
                            return;
                    }
                }
            });
            textView2.setClickable(false);
            addView(textView2, w7.y5.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
            textView2.setScaleX(0.0f);
            textView2.setScaleY(0.0f);
            textView2.setAlpha(0.0f);
            textView2.measure(View.MeasureSpec.makeMeasureSpec(99999, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f10), 1073741824));
            f7 = Math.max(max, (AndroidUtilities.dp(f11) + textView2.getMeasuredWidth()) / AndroidUtilities.density);
        } else {
            f7 = 32.0f;
        }
        d6Var = ((org.telegram.ui.ActionBar.e3) tvVar).resourcesProvider;
        n90 n90Var = new n90(context, d6Var);
        this.f27197a = n90Var;
        n90Var.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        n90Var.setTypeface(AndroidUtilities.bold());
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        n90Var.setEllipsize(truncateAt);
        n90Var.setSingleLine(true);
        n90Var.setLines(1);
        int i13 = org.telegram.ui.ActionBar.h6.J6;
        d6Var2 = ((org.telegram.ui.ActionBar.e3) tvVar).resourcesProvider;
        n90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.v0(i13, d6Var2));
        n90Var.setTextColor(tvVar.getThemedColor(org.telegram.ui.ActionBar.h6.f19165j5));
        if (z10) {
            n90Var.setTextSize(1, 20.0f);
            addView(n90Var, w7.y5.i(-1.0f, -2.0f, 8388659, 12.0f, 11.0f, f7, 0.0f));
        } else {
            n90Var.setTextSize(1, 17.0f);
            addView(n90Var, w7.y5.i(-1.0f, -2.0f, 8388659, 6.0f, 10.0f, f7, 0.0f));
        }
        if (!z10) {
            TextView textView3 = new TextView(context);
            this.f27198b = textView3;
            textView3.setTextSize(1, 13.0f);
            textView3.setTextColor(tvVar.getThemedColor(org.telegram.ui.ActionBar.h6.f19297q5));
            textView3.setEllipsize(truncateAt);
            textView3.setSingleLine(true);
            textView3.setLines(1);
            addView(textView3, w7.y5.i(-1.0f, -2.0f, 8388659, 8.0f, 31.66f, f7, 0.0f));
        }
        if (z10) {
            int themedColor = tvVar.getThemedColor(org.telegram.ui.ActionBar.h6.Ji);
            d6Var3 = ((org.telegram.ui.ActionBar.e3) tvVar).resourcesProvider;
            org.telegram.ui.ActionBar.u0 u0Var = new org.telegram.ui.ActionBar.u0(context, null, 0, themedColor, false, d6Var3);
            this.f27200f = u0Var;
            u0Var.setLongClickEnabled(false);
            u0Var.setSubMenuOpenSide(2);
            u0Var.setIcon(R.drawable.ic_ab_other);
            u0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.f0(tvVar.getThemedColor(org.telegram.ui.ActionBar.h6.Ni), 1, -1));
            i10 = ((org.telegram.ui.ActionBar.e3) tvVar).backgroundPaddingLeft;
            addView(u0Var, w7.y5.d(40, 40.0f, 53, 0.0f, 5.0f, 5.0f - (i10 / AndroidUtilities.density), 0.0f));
            u0Var.e(1, R.drawable.msg_share, LocaleController.getString(R.string.StickersShare));
            u0Var.e(2, R.drawable.msg_link, LocaleController.getString(R.string.CopyLink));
            u0Var.setOnClickListener(new View.OnClickListener(this) {
                public final ov f26200b;

                {
                    this.f26200b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i122 = r2;
                    ov ovVar = this.f26200b;
                    switch (i122) {
                        case 0:
                            tv tvVar2 = ovVar.f27205x;
                            tvVar2.Q = SystemClock.elapsedRealtime();
                            tvVar2.Z();
                            return;
                        case 1:
                            tv.W(ovVar.f27201n, ovVar.f27202r, true, null, null);
                            ovVar.a(true, true);
                            return;
                        case 2:
                            ai.y3 y3Var = ovVar.f27201n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = ovVar.f27202r;
                            yp ypVar = new yp(ovVar, 12);
                            Pattern pattern = tv.V;
                            if (y3Var != null && tL_messages_stickerSet != null && y3Var.getFragmentView() != null) {
                                MediaDataController.getInstance(y3Var.getCurrentAccount()).toggleStickerSet(y3Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, y3Var, true, true, ypVar, true);
                            }
                            ovVar.a(false, true);
                            return;
                        default:
                            ovVar.f27200f.M(null, null);
                            return;
                    }
                }
            });
            u0Var.setDelegate(new mv(tvVar, 0));
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
        if (this.f27203s != z10) {
            this.f27203s = z10;
            ValueAnimator valueAnimator = this.f27204w;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f27204w = null;
            }
            TextView textView2 = this.f27199c;
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
                    this.f27204w = ofFloat;
                    ofFloat.addUpdateListener(new k6(this, 18));
                    this.f27204w.setInterpolator(rr.h);
                    this.f27204w.setDuration(250L);
                    this.f27204w.start();
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
