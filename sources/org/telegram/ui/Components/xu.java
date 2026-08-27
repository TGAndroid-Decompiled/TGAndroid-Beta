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

public final class xu extends FrameLayout {

    public final p80 f34711a;

    public final TextView f34712b;

    public final TextView f34713c;
    public final TextView d;

    public final ag.s1 f34714e;

    public final org.telegram.ui.ActionBar.v0 f34715f;
    public final boolean h;

    public final ag.r2 f34716n;

    public TLRPC.TL_messages_stickerSet f34717r;

    public boolean f34718s;
    public float v;

    public ValueAnimator f34719w;

    public final cv f34720x;

    public xu(cv cvVar, Context context, boolean z10) {
        float fMax;
        float f10;
        float f11;
        super(context);
        this.f34720x = cvVar;
        this.f34716n = new ag.r2(this, 9);
        final int i10 = 0;
        this.f34718s = false;
        this.v = 0.0f;
        this.h = z10;
        final int i11 = 2;
        final int i12 = 1;
        if (z10) {
            fMax = 32.0f;
        } else {
            float fDp = 8.0f;
            if (UserConfig.getInstance(((org.telegram.ui.ActionBar.e3) cvVar).currentAccount).isPremium()) {
                f10 = 28.0f;
                f11 = 16.0f;
            } else {
                f11 = 16.0f;
                f10 = 28.0f;
                ag.s1 s1Var = new ag.s1(AndroidUtilities.dp(4.0f), context, ((org.telegram.ui.ActionBar.e3) cvVar).resourcesProvider, false);
                this.f34714e = s1Var;
                s1Var.a(LocaleController.getString(R.string.Unlock), new View.OnClickListener(this) {

                    public final xu f33213b;

                    {
                        this.f33213b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        int i13 = i10;
                        xu xuVar = this.f33213b;
                        switch (i13) {
                            case 0:
                                cv cvVar2 = xuVar.f34720x;
                                cvVar2.M = SystemClock.elapsedRealtime();
                                cvVar2.Z();
                                break;
                            case 1:
                                cv.W(xuVar.f34716n, xuVar.f34717r, true, null, null);
                                xuVar.a(true, true);
                                break;
                            case 2:
                                ag.r2 r2Var = xuVar.f34716n;
                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = xuVar.f34717r;
                                lp lpVar = new lp(xuVar, 12);
                                Pattern pattern = cv.R;
                                if (r2Var != null && tL_messages_stickerSet != null && r2Var.getFragmentView() != null) {
                                    MediaDataController.getInstance(r2Var.getCurrentAccount()).toggleStickerSet(r2Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, r2Var, true, true, lpVar, true);
                                }
                                xuVar.a(false, true);
                                break;
                            default:
                                xuVar.f34715f.M(null, null);
                                break;
                        }
                    }
                }, false);
                s1Var.setIcon(R.raw.unlock_icon);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) s1Var.getIconView().getLayoutParams();
                marginLayoutParams.leftMargin = AndroidUtilities.dp(1.0f);
                marginLayoutParams.topMargin = AndroidUtilities.dp(1.0f);
                int iDp = AndroidUtilities.dp(20.0f);
                marginLayoutParams.height = iDp;
                marginLayoutParams.width = iDp;
                ((ViewGroup.MarginLayoutParams) s1Var.getTextView().getLayoutParams()).leftMargin = AndroidUtilities.dp(3.0f);
                s1Var.getChildAt(0).setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                addView(s1Var, h7.z5.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
                s1Var.measure(View.MeasureSpec.makeMeasureSpec(99999, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(28.0f), 1073741824));
                fDp = (AndroidUtilities.dp(16.0f) + s1Var.getMeasuredWidth()) / AndroidUtilities.density;
            }
            TextView textView = new TextView(context);
            this.f34713c = textView;
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextColor(cvVar.getThemedColor(org.telegram.ui.ActionBar.g6.Sh));
            int i13 = org.telegram.ui.ActionBar.g6.Oh;
            textView.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{14.0f}, cvVar.getThemedColor(i13)));
            textView.setPadding(org.telegram.ui.Cells.pa.c(18.0f, R.string.Add, textView), 0, AndroidUtilities.dp(18.0f), 0);
            textView.setGravity(17);
            textView.setOnClickListener(new View.OnClickListener(this) {

                public final xu f33213b;

                {
                    this.f33213b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i14 = i12;
                    xu xuVar = this.f33213b;
                    switch (i14) {
                        case 0:
                            cv cvVar2 = xuVar.f34720x;
                            cvVar2.M = SystemClock.elapsedRealtime();
                            cvVar2.Z();
                            break;
                        case 1:
                            cv.W(xuVar.f34716n, xuVar.f34717r, true, null, null);
                            xuVar.a(true, true);
                            break;
                        case 2:
                            ag.r2 r2Var = xuVar.f34716n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = xuVar.f34717r;
                            lp lpVar = new lp(xuVar, 12);
                            Pattern pattern = cv.R;
                            if (r2Var != null && tL_messages_stickerSet != null && r2Var.getFragmentView() != null) {
                                MediaDataController.getInstance(r2Var.getCurrentAccount()).toggleStickerSet(r2Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, r2Var, true, true, lpVar, true);
                            }
                            xuVar.a(false, true);
                            break;
                        default:
                            xuVar.f34715f.M(null, null);
                            break;
                    }
                }
            });
            addView(textView, h7.z5.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
            textView.measure(View.MeasureSpec.makeMeasureSpec(99999, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f10), 1073741824));
            float fMax2 = Math.max(fDp, (AndroidUtilities.dp(f11) + textView.getMeasuredWidth()) / AndroidUtilities.density);
            TextView textView2 = new TextView(context);
            this.d = textView2;
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setTextColor(cvVar.getThemedColor(i13));
            textView2.setBackground(org.telegram.ui.ActionBar.g6.Y(cvVar.getThemedColor(i13) & 268435455, 4, 4));
            textView2.setPadding(org.telegram.ui.Cells.pa.c(12.0f, R.string.StickersRemove, textView2), 0, AndroidUtilities.dp(12.0f), 0);
            textView2.setGravity(17);
            textView2.setOnClickListener(new View.OnClickListener(this) {

                public final xu f33213b;

                {
                    this.f33213b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i14 = i11;
                    xu xuVar = this.f33213b;
                    switch (i14) {
                        case 0:
                            cv cvVar2 = xuVar.f34720x;
                            cvVar2.M = SystemClock.elapsedRealtime();
                            cvVar2.Z();
                            break;
                        case 1:
                            cv.W(xuVar.f34716n, xuVar.f34717r, true, null, null);
                            xuVar.a(true, true);
                            break;
                        case 2:
                            ag.r2 r2Var = xuVar.f34716n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = xuVar.f34717r;
                            lp lpVar = new lp(xuVar, 12);
                            Pattern pattern = cv.R;
                            if (r2Var != null && tL_messages_stickerSet != null && r2Var.getFragmentView() != null) {
                                MediaDataController.getInstance(r2Var.getCurrentAccount()).toggleStickerSet(r2Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, r2Var, true, true, lpVar, true);
                            }
                            xuVar.a(false, true);
                            break;
                        default:
                            xuVar.f34715f.M(null, null);
                            break;
                    }
                }
            });
            textView2.setClickable(false);
            addView(textView2, h7.z5.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
            textView2.setScaleX(0.0f);
            textView2.setScaleY(0.0f);
            textView2.setAlpha(0.0f);
            textView2.measure(View.MeasureSpec.makeMeasureSpec(99999, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f10), 1073741824));
            fMax = Math.max(fMax2, (AndroidUtilities.dp(f11) + textView2.getMeasuredWidth()) / AndroidUtilities.density);
        }
        p80 p80Var = new p80(context, ((org.telegram.ui.ActionBar.e3) cvVar).resourcesProvider);
        this.f34711a = p80Var;
        p80Var.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        p80Var.setTypeface(AndroidUtilities.bold());
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        p80Var.setEllipsize(truncateAt);
        p80Var.setSingleLine(true);
        p80Var.setLines(1);
        p80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.J6, ((org.telegram.ui.ActionBar.e3) cvVar).resourcesProvider));
        p80Var.setTextColor(cvVar.getThemedColor(org.telegram.ui.ActionBar.g6.f23161j5));
        if (z10) {
            p80Var.setTextSize(1, 20.0f);
            addView(p80Var, h7.z5.i(-1.0f, -2.0f, 8388659, 12.0f, 11.0f, fMax, 0.0f));
        } else {
            p80Var.setTextSize(1, 17.0f);
            addView(p80Var, h7.z5.i(-1.0f, -2.0f, 8388659, 6.0f, 10.0f, fMax, 0.0f));
        }
        if (!z10) {
            TextView textView3 = new TextView(context);
            this.f34712b = textView3;
            textView3.setTextSize(1, 13.0f);
            textView3.setTextColor(cvVar.getThemedColor(org.telegram.ui.ActionBar.g6.f23283q5));
            textView3.setEllipsize(truncateAt);
            textView3.setSingleLine(true);
            textView3.setLines(1);
            addView(textView3, h7.z5.i(-1.0f, -2.0f, 8388659, 8.0f, 31.66f, fMax, 0.0f));
        }
        if (z10) {
            org.telegram.ui.ActionBar.v0 v0Var = new org.telegram.ui.ActionBar.v0(context, null, 0, cvVar.getThemedColor(org.telegram.ui.ActionBar.g6.Ji), false, ((org.telegram.ui.ActionBar.e3) cvVar).resourcesProvider);
            this.f34715f = v0Var;
            v0Var.setLongClickEnabled(false);
            v0Var.setSubMenuOpenSide(2);
            v0Var.setIcon(R.drawable.ic_ab_other);
            v0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(cvVar.getThemedColor(org.telegram.ui.ActionBar.g6.Ni), 1, -1));
            addView(v0Var, h7.z5.d(40, 40.0f, 53, 0.0f, 5.0f, 5.0f - (((org.telegram.ui.ActionBar.e3) cvVar).backgroundPaddingLeft / AndroidUtilities.density), 0.0f));
            v0Var.e(1, R.drawable.msg_share, LocaleController.getString(R.string.StickersShare));
            v0Var.e(2, R.drawable.msg_link, LocaleController.getString(R.string.CopyLink));
            final int i14 = 3;
            v0Var.setOnClickListener(new View.OnClickListener(this) {

                public final xu f33213b;

                {
                    this.f33213b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i15 = i14;
                    xu xuVar = this.f33213b;
                    switch (i15) {
                        case 0:
                            cv cvVar2 = xuVar.f34720x;
                            cvVar2.M = SystemClock.elapsedRealtime();
                            cvVar2.Z();
                            break;
                        case 1:
                            cv.W(xuVar.f34716n, xuVar.f34717r, true, null, null);
                            xuVar.a(true, true);
                            break;
                        case 2:
                            ag.r2 r2Var = xuVar.f34716n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = xuVar.f34717r;
                            lp lpVar = new lp(xuVar, 12);
                            Pattern pattern = cv.R;
                            if (r2Var != null && tL_messages_stickerSet != null && r2Var.getFragmentView() != null) {
                                MediaDataController.getInstance(r2Var.getCurrentAccount()).toggleStickerSet(r2Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, r2Var, true, true, lpVar, true);
                            }
                            xuVar.a(false, true);
                            break;
                        default:
                            xuVar.f34715f.M(null, null);
                            break;
                    }
                }
            });
            v0Var.setDelegate(new vu(cvVar, 0));
            v0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        }
    }

    public final void a(boolean z10, boolean z11) {
        TextView textView;
        if (this.f34718s == z10) {
            return;
        }
        this.f34718s = z10;
        ValueAnimator valueAnimator = this.f34719w;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f34719w = null;
        }
        TextView textView2 = this.f34713c;
        if (textView2 == null || (textView = this.d) == null) {
            return;
        }
        textView2.setClickable(!z10);
        textView.setClickable(z10);
        if (z11) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.v, z10 ? 1.0f : 0.0f);
            this.f34719w = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new e6(this, 18));
            this.f34719w.setInterpolator(er.h);
            this.f34719w.setDuration(250L);
            this.f34719w.start();
            return;
        }
        this.v = z10 ? 1.0f : 0.0f;
        textView2.setScaleX(z10 ? 0.0f : 1.0f);
        textView2.setScaleY(z10 ? 0.0f : 1.0f);
        textView2.setAlpha(z10 ? 0.0f : 1.0f);
        textView.setScaleX(z10 ? 1.0f : 0.0f);
        textView.setScaleY(z10 ? 1.0f : 0.0f);
        textView.setAlpha(z10 ? 1.0f : 0.0f);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.h ? 42.0f : 56.0f), 1073741824));
    }
}
