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
public final class mv extends FrameLayout {
    public final d90 f28537a;
    public final TextView f28538b;
    public final TextView f28539c;
    public final TextView d;
    public final sg.r0 f28540e;
    public final org.telegram.ui.ActionBar.v0 f28541f;
    public final boolean h;
    public final bi.l3 f28542n;
    public TLRPC.TL_messages_stickerSet f28543r;
    public boolean f28544s;
    public float v;
    public ValueAnimator f28545w;
    public final rv f28546x;

    public mv(rv rvVar, Context context, boolean z10) {
        super(context);
        float f7;
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        org.telegram.ui.ActionBar.f6 f6Var3;
        int i10;
        int i11;
        float f10;
        float f11;
        org.telegram.ui.ActionBar.f6 f6Var4;
        this.f28546x = rvVar;
        this.f28542n = new bi.l3(this, 5);
        this.f28544s = false;
        this.v = 0.0f;
        this.h = z10;
        if (!z10) {
            i11 = ((org.telegram.ui.ActionBar.f3) rvVar).currentAccount;
            float f12 = 8.0f;
            if (!UserConfig.getInstance(i11).isPremium()) {
                f11 = 16.0f;
                int dp = AndroidUtilities.dp(4.0f);
                f10 = 28.0f;
                f6Var4 = ((org.telegram.ui.ActionBar.f3) rvVar).resourcesProvider;
                sg.r0 r0Var = new sg.r0(dp, context, f6Var4, false);
                this.f28540e = r0Var;
                r0Var.a(LocaleController.getString(R.string.Unlock), new View.OnClickListener(this) {
                    public final mv f27576b;

                    {
                        this.f27576b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        int i12 = r2;
                        mv mvVar = this.f27576b;
                        switch (i12) {
                            case 0:
                                rv rvVar2 = mvVar.f28546x;
                                rvVar2.Q = SystemClock.elapsedRealtime();
                                rvVar2.Z();
                                return;
                            case 1:
                                rv.W(mvVar.f28542n, mvVar.f28543r, true, null, null);
                                mvVar.a(true, true);
                                return;
                            case 2:
                                bi.l3 l3Var = mvVar.f28542n;
                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = mvVar.f28543r;
                                wp wpVar = new wp(mvVar, 12);
                                Pattern pattern = rv.V;
                                if (l3Var != null && tL_messages_stickerSet != null && l3Var.getFragmentView() != null) {
                                    MediaDataController.getInstance(l3Var.getCurrentAccount()).toggleStickerSet(l3Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, l3Var, true, true, wpVar, true);
                                }
                                mvVar.a(false, true);
                                return;
                            default:
                                mvVar.f28541f.M(null, null);
                                return;
                        }
                    }
                }, false);
                r0Var.setIcon(R.raw.unlock_icon);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) r0Var.getIconView().getLayoutParams();
                marginLayoutParams.leftMargin = AndroidUtilities.dp(1.0f);
                marginLayoutParams.topMargin = AndroidUtilities.dp(1.0f);
                int dp2 = AndroidUtilities.dp(20.0f);
                marginLayoutParams.height = dp2;
                marginLayoutParams.width = dp2;
                ((ViewGroup.MarginLayoutParams) r0Var.getTextView().getLayoutParams()).leftMargin = AndroidUtilities.dp(3.0f);
                r0Var.getChildAt(0).setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                addView(r0Var, w7.x5.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
                r0Var.measure(View.MeasureSpec.makeMeasureSpec(99999, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(28.0f), 1073741824));
                f12 = (AndroidUtilities.dp(16.0f) + r0Var.getMeasuredWidth()) / AndroidUtilities.density;
            } else {
                f10 = 28.0f;
                f11 = 16.0f;
            }
            TextView textView = new TextView(context);
            this.f28539c = textView;
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextColor(rvVar.getThemedColor(org.telegram.ui.ActionBar.j6.Sh));
            int i12 = org.telegram.ui.ActionBar.j6.Oh;
            textView.setBackground(org.telegram.ui.ActionBar.y5.e(new float[]{14.0f}, rvVar.getThemedColor(i12)));
            textView.setPadding(org.telegram.ui.Cells.p6.b(18.0f, R.string.Add, textView), 0, AndroidUtilities.dp(18.0f), 0);
            textView.setGravity(17);
            textView.setOnClickListener(new View.OnClickListener(this) {
                public final mv f27576b;

                {
                    this.f27576b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i122 = r2;
                    mv mvVar = this.f27576b;
                    switch (i122) {
                        case 0:
                            rv rvVar2 = mvVar.f28546x;
                            rvVar2.Q = SystemClock.elapsedRealtime();
                            rvVar2.Z();
                            return;
                        case 1:
                            rv.W(mvVar.f28542n, mvVar.f28543r, true, null, null);
                            mvVar.a(true, true);
                            return;
                        case 2:
                            bi.l3 l3Var = mvVar.f28542n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = mvVar.f28543r;
                            wp wpVar = new wp(mvVar, 12);
                            Pattern pattern = rv.V;
                            if (l3Var != null && tL_messages_stickerSet != null && l3Var.getFragmentView() != null) {
                                MediaDataController.getInstance(l3Var.getCurrentAccount()).toggleStickerSet(l3Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, l3Var, true, true, wpVar, true);
                            }
                            mvVar.a(false, true);
                            return;
                        default:
                            mvVar.f28541f.M(null, null);
                            return;
                    }
                }
            });
            addView(textView, w7.x5.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
            textView.measure(View.MeasureSpec.makeMeasureSpec(99999, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f10), 1073741824));
            float max = Math.max(f12, (AndroidUtilities.dp(f11) + textView.getMeasuredWidth()) / AndroidUtilities.density);
            TextView textView2 = new TextView(context);
            this.d = textView2;
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setTextColor(rvVar.getThemedColor(i12));
            textView2.setBackground(org.telegram.ui.ActionBar.j6.Y(rvVar.getThemedColor(i12) & 268435455, 4, 4));
            textView2.setPadding(org.telegram.ui.Cells.p6.b(12.0f, R.string.StickersRemove, textView2), 0, AndroidUtilities.dp(12.0f), 0);
            textView2.setGravity(17);
            textView2.setOnClickListener(new View.OnClickListener(this) {
                public final mv f27576b;

                {
                    this.f27576b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i122 = r2;
                    mv mvVar = this.f27576b;
                    switch (i122) {
                        case 0:
                            rv rvVar2 = mvVar.f28546x;
                            rvVar2.Q = SystemClock.elapsedRealtime();
                            rvVar2.Z();
                            return;
                        case 1:
                            rv.W(mvVar.f28542n, mvVar.f28543r, true, null, null);
                            mvVar.a(true, true);
                            return;
                        case 2:
                            bi.l3 l3Var = mvVar.f28542n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = mvVar.f28543r;
                            wp wpVar = new wp(mvVar, 12);
                            Pattern pattern = rv.V;
                            if (l3Var != null && tL_messages_stickerSet != null && l3Var.getFragmentView() != null) {
                                MediaDataController.getInstance(l3Var.getCurrentAccount()).toggleStickerSet(l3Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, l3Var, true, true, wpVar, true);
                            }
                            mvVar.a(false, true);
                            return;
                        default:
                            mvVar.f28541f.M(null, null);
                            return;
                    }
                }
            });
            textView2.setClickable(false);
            addView(textView2, w7.x5.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
            textView2.setScaleX(0.0f);
            textView2.setScaleY(0.0f);
            textView2.setAlpha(0.0f);
            textView2.measure(View.MeasureSpec.makeMeasureSpec(99999, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f10), 1073741824));
            f7 = Math.max(max, (AndroidUtilities.dp(f11) + textView2.getMeasuredWidth()) / AndroidUtilities.density);
        } else {
            f7 = 32.0f;
        }
        f6Var = ((org.telegram.ui.ActionBar.f3) rvVar).resourcesProvider;
        d90 d90Var = new d90(context, f6Var);
        this.f28537a = d90Var;
        d90Var.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        d90Var.setTypeface(AndroidUtilities.bold());
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        d90Var.setEllipsize(truncateAt);
        d90Var.setSingleLine(true);
        d90Var.setLines(1);
        int i13 = org.telegram.ui.ActionBar.j6.J6;
        f6Var2 = ((org.telegram.ui.ActionBar.f3) rvVar).resourcesProvider;
        d90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i13, f6Var2));
        d90Var.setTextColor(rvVar.getThemedColor(org.telegram.ui.ActionBar.j6.f20770j5));
        if (z10) {
            d90Var.setTextSize(1, 20.0f);
            addView(d90Var, w7.x5.i(-1.0f, -2.0f, 8388659, 12.0f, 11.0f, f7, 0.0f));
        } else {
            d90Var.setTextSize(1, 17.0f);
            addView(d90Var, w7.x5.i(-1.0f, -2.0f, 8388659, 6.0f, 10.0f, f7, 0.0f));
        }
        if (!z10) {
            TextView textView3 = new TextView(context);
            this.f28538b = textView3;
            textView3.setTextSize(1, 13.0f);
            textView3.setTextColor(rvVar.getThemedColor(org.telegram.ui.ActionBar.j6.f20897q5));
            textView3.setEllipsize(truncateAt);
            textView3.setSingleLine(true);
            textView3.setLines(1);
            addView(textView3, w7.x5.i(-1.0f, -2.0f, 8388659, 8.0f, 31.66f, f7, 0.0f));
        }
        if (z10) {
            int themedColor = rvVar.getThemedColor(org.telegram.ui.ActionBar.j6.Ji);
            f6Var3 = ((org.telegram.ui.ActionBar.f3) rvVar).resourcesProvider;
            org.telegram.ui.ActionBar.v0 v0Var = new org.telegram.ui.ActionBar.v0(context, null, 0, themedColor, false, f6Var3);
            this.f28541f = v0Var;
            v0Var.setLongClickEnabled(false);
            v0Var.setSubMenuOpenSide(2);
            v0Var.setIcon(R.drawable.ic_ab_other);
            v0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(rvVar.getThemedColor(org.telegram.ui.ActionBar.j6.Ni), 1, -1));
            i10 = ((org.telegram.ui.ActionBar.f3) rvVar).backgroundPaddingLeft;
            addView(v0Var, w7.x5.d(40, 40.0f, 53, 0.0f, 5.0f, 5.0f - (i10 / AndroidUtilities.density), 0.0f));
            v0Var.e(1, R.drawable.msg_share, LocaleController.getString(R.string.StickersShare));
            v0Var.e(2, R.drawable.msg_link, LocaleController.getString(R.string.CopyLink));
            v0Var.setOnClickListener(new View.OnClickListener(this) {
                public final mv f27576b;

                {
                    this.f27576b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i122 = r2;
                    mv mvVar = this.f27576b;
                    switch (i122) {
                        case 0:
                            rv rvVar2 = mvVar.f28546x;
                            rvVar2.Q = SystemClock.elapsedRealtime();
                            rvVar2.Z();
                            return;
                        case 1:
                            rv.W(mvVar.f28542n, mvVar.f28543r, true, null, null);
                            mvVar.a(true, true);
                            return;
                        case 2:
                            bi.l3 l3Var = mvVar.f28542n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = mvVar.f28543r;
                            wp wpVar = new wp(mvVar, 12);
                            Pattern pattern = rv.V;
                            if (l3Var != null && tL_messages_stickerSet != null && l3Var.getFragmentView() != null) {
                                MediaDataController.getInstance(l3Var.getCurrentAccount()).toggleStickerSet(l3Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, l3Var, true, true, wpVar, true);
                            }
                            mvVar.a(false, true);
                            return;
                        default:
                            mvVar.f28541f.M(null, null);
                            return;
                    }
                }
            });
            v0Var.setDelegate(new kv(rvVar, 0));
            v0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
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
        if (this.f28544s != z10) {
            this.f28544s = z10;
            ValueAnimator valueAnimator = this.f28545w;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f28545w = null;
            }
            TextView textView2 = this.f28539c;
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
                    this.f28545w = ofFloat;
                    ofFloat.addUpdateListener(new l6(this, 18));
                    this.f28545w.setInterpolator(pr.h);
                    this.f28545w.setDuration(250L);
                    this.f28545w.start();
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
