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
public final class yu extends FrameLayout {
    public final l80 f35069a;
    public final TextView f35070b;
    public final TextView f35071c;
    public final TextView d;
    public final zf.p0 f35072e;
    public final org.telegram.ui.ActionBar.w0 f35073f;
    public final boolean h;
    public final bg.i1 f35074n;
    public TLRPC.TL_messages_stickerSet f35075r;
    public boolean f35076s;
    public float v;
    public ValueAnimator f35077w;
    public final dv f35078x;

    public yu(dv dvVar, Context context, boolean z10) {
        super(context);
        float f10;
        org.telegram.ui.ActionBar.b6 b6Var;
        org.telegram.ui.ActionBar.b6 b6Var2;
        org.telegram.ui.ActionBar.b6 b6Var3;
        int i9;
        int i10;
        float f11;
        float f12;
        org.telegram.ui.ActionBar.b6 b6Var4;
        this.f35078x = dvVar;
        this.f35074n = new bg.i1(this, 8);
        this.f35076s = false;
        this.v = 0.0f;
        this.h = z10;
        if (!z10) {
            i10 = ((org.telegram.ui.ActionBar.f3) dvVar).currentAccount;
            float f13 = 8.0f;
            if (!UserConfig.getInstance(i10).isPremium()) {
                f12 = 16.0f;
                int dp = AndroidUtilities.dp(4.0f);
                f11 = 28.0f;
                b6Var4 = ((org.telegram.ui.ActionBar.f3) dvVar).resourcesProvider;
                zf.p0 p0Var = new zf.p0(dp, context, b6Var4, false);
                this.f35072e = p0Var;
                p0Var.a(LocaleController.getString(R.string.Unlock), new View.OnClickListener(this) {
                    public final yu f34006b;

                    {
                        this.f34006b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        int i11 = r2;
                        yu yuVar = this.f34006b;
                        switch (i11) {
                            case 0:
                                dv dvVar2 = yuVar.f35078x;
                                dvVar2.M = SystemClock.elapsedRealtime();
                                dvVar2.Y();
                                return;
                            case 1:
                                dv.V(yuVar.f35074n, yuVar.f35075r, true, null, null);
                                yuVar.a(true, true);
                                return;
                            case 2:
                                bg.i1 i1Var = yuVar.f35074n;
                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = yuVar.f35075r;
                                np npVar = new np(yuVar, 12);
                                Pattern pattern = dv.R;
                                if (i1Var != null && tL_messages_stickerSet != null && i1Var.getFragmentView() != null) {
                                    MediaDataController.getInstance(i1Var.getCurrentAccount()).toggleStickerSet(i1Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, i1Var, true, true, npVar, true);
                                }
                                yuVar.a(false, true);
                                return;
                            default:
                                yuVar.f35073f.M(null, null);
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
                addView(p0Var, g7.e6.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
                p0Var.measure(View.MeasureSpec.makeMeasureSpec(99999, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(28.0f), 1073741824));
                f13 = (AndroidUtilities.dp(16.0f) + p0Var.getMeasuredWidth()) / AndroidUtilities.density;
            } else {
                f11 = 28.0f;
                f12 = 16.0f;
            }
            TextView textView = new TextView(context);
            this.f35071c = textView;
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextColor(dvVar.getThemedColor(org.telegram.ui.ActionBar.f6.Sh));
            int i11 = org.telegram.ui.ActionBar.f6.Oh;
            textView.setBackground(org.telegram.ui.ActionBar.v5.e(new float[]{14.0f}, dvVar.getThemedColor(i11)));
            textView.setPadding(org.telegram.ui.Cells.j2.c(18.0f, R.string.Add, textView), 0, AndroidUtilities.dp(18.0f), 0);
            textView.setGravity(17);
            textView.setOnClickListener(new View.OnClickListener(this) {
                public final yu f34006b;

                {
                    this.f34006b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i112 = r2;
                    yu yuVar = this.f34006b;
                    switch (i112) {
                        case 0:
                            dv dvVar2 = yuVar.f35078x;
                            dvVar2.M = SystemClock.elapsedRealtime();
                            dvVar2.Y();
                            return;
                        case 1:
                            dv.V(yuVar.f35074n, yuVar.f35075r, true, null, null);
                            yuVar.a(true, true);
                            return;
                        case 2:
                            bg.i1 i1Var = yuVar.f35074n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = yuVar.f35075r;
                            np npVar = new np(yuVar, 12);
                            Pattern pattern = dv.R;
                            if (i1Var != null && tL_messages_stickerSet != null && i1Var.getFragmentView() != null) {
                                MediaDataController.getInstance(i1Var.getCurrentAccount()).toggleStickerSet(i1Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, i1Var, true, true, npVar, true);
                            }
                            yuVar.a(false, true);
                            return;
                        default:
                            yuVar.f35073f.M(null, null);
                            return;
                    }
                }
            });
            addView(textView, g7.e6.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
            textView.measure(View.MeasureSpec.makeMeasureSpec(99999, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f11), 1073741824));
            float max = Math.max(f13, (AndroidUtilities.dp(f12) + textView.getMeasuredWidth()) / AndroidUtilities.density);
            TextView textView2 = new TextView(context);
            this.d = textView2;
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setTextColor(dvVar.getThemedColor(i11));
            textView2.setBackground(org.telegram.ui.ActionBar.f6.Y(dvVar.getThemedColor(i11) & 268435455, 4, 4));
            textView2.setPadding(org.telegram.ui.Cells.j2.c(12.0f, R.string.StickersRemove, textView2), 0, AndroidUtilities.dp(12.0f), 0);
            textView2.setGravity(17);
            textView2.setOnClickListener(new View.OnClickListener(this) {
                public final yu f34006b;

                {
                    this.f34006b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i112 = r2;
                    yu yuVar = this.f34006b;
                    switch (i112) {
                        case 0:
                            dv dvVar2 = yuVar.f35078x;
                            dvVar2.M = SystemClock.elapsedRealtime();
                            dvVar2.Y();
                            return;
                        case 1:
                            dv.V(yuVar.f35074n, yuVar.f35075r, true, null, null);
                            yuVar.a(true, true);
                            return;
                        case 2:
                            bg.i1 i1Var = yuVar.f35074n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = yuVar.f35075r;
                            np npVar = new np(yuVar, 12);
                            Pattern pattern = dv.R;
                            if (i1Var != null && tL_messages_stickerSet != null && i1Var.getFragmentView() != null) {
                                MediaDataController.getInstance(i1Var.getCurrentAccount()).toggleStickerSet(i1Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, i1Var, true, true, npVar, true);
                            }
                            yuVar.a(false, true);
                            return;
                        default:
                            yuVar.f35073f.M(null, null);
                            return;
                    }
                }
            });
            textView2.setClickable(false);
            addView(textView2, g7.e6.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
            textView2.setScaleX(0.0f);
            textView2.setScaleY(0.0f);
            textView2.setAlpha(0.0f);
            textView2.measure(View.MeasureSpec.makeMeasureSpec(99999, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f11), 1073741824));
            f10 = Math.max(max, (AndroidUtilities.dp(f12) + textView2.getMeasuredWidth()) / AndroidUtilities.density);
        } else {
            f10 = 32.0f;
        }
        b6Var = ((org.telegram.ui.ActionBar.f3) dvVar).resourcesProvider;
        l80 l80Var = new l80(context, b6Var);
        this.f35069a = l80Var;
        l80Var.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        l80Var.setTypeface(AndroidUtilities.bold());
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        l80Var.setEllipsize(truncateAt);
        l80Var.setSingleLine(true);
        l80Var.setLines(1);
        int i12 = org.telegram.ui.ActionBar.f6.J6;
        b6Var2 = ((org.telegram.ui.ActionBar.f3) dvVar).resourcesProvider;
        l80Var.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(i12, b6Var2));
        l80Var.setTextColor(dvVar.getThemedColor(org.telegram.ui.ActionBar.f6.f23108j5));
        if (z10) {
            l80Var.setTextSize(1, 20.0f);
            addView(l80Var, g7.e6.i(-1.0f, -2.0f, 8388659, 12.0f, 11.0f, f10, 0.0f));
        } else {
            l80Var.setTextSize(1, 17.0f);
            addView(l80Var, g7.e6.i(-1.0f, -2.0f, 8388659, 6.0f, 10.0f, f10, 0.0f));
        }
        if (!z10) {
            TextView textView3 = new TextView(context);
            this.f35070b = textView3;
            textView3.setTextSize(1, 13.0f);
            textView3.setTextColor(dvVar.getThemedColor(org.telegram.ui.ActionBar.f6.f23228q5));
            textView3.setEllipsize(truncateAt);
            textView3.setSingleLine(true);
            textView3.setLines(1);
            addView(textView3, g7.e6.i(-1.0f, -2.0f, 8388659, 8.0f, 31.66f, f10, 0.0f));
        }
        if (z10) {
            int themedColor = dvVar.getThemedColor(org.telegram.ui.ActionBar.f6.Ji);
            b6Var3 = ((org.telegram.ui.ActionBar.f3) dvVar).resourcesProvider;
            org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(context, null, 0, themedColor, false, b6Var3);
            this.f35073f = w0Var;
            w0Var.setLongClickEnabled(false);
            w0Var.setSubMenuOpenSide(2);
            w0Var.setIcon(R.drawable.ic_ab_other);
            w0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.f0(dvVar.getThemedColor(org.telegram.ui.ActionBar.f6.Ni), 1, -1));
            i9 = ((org.telegram.ui.ActionBar.f3) dvVar).backgroundPaddingLeft;
            addView(w0Var, g7.e6.d(40, 40.0f, 53, 0.0f, 5.0f, 5.0f - (i9 / AndroidUtilities.density), 0.0f));
            w0Var.e(1, R.drawable.msg_share, LocaleController.getString(R.string.StickersShare));
            w0Var.e(2, R.drawable.msg_link, LocaleController.getString(R.string.CopyLink));
            w0Var.setOnClickListener(new View.OnClickListener(this) {
                public final yu f34006b;

                {
                    this.f34006b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i112 = r2;
                    yu yuVar = this.f34006b;
                    switch (i112) {
                        case 0:
                            dv dvVar2 = yuVar.f35078x;
                            dvVar2.M = SystemClock.elapsedRealtime();
                            dvVar2.Y();
                            return;
                        case 1:
                            dv.V(yuVar.f35074n, yuVar.f35075r, true, null, null);
                            yuVar.a(true, true);
                            return;
                        case 2:
                            bg.i1 i1Var = yuVar.f35074n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = yuVar.f35075r;
                            np npVar = new np(yuVar, 12);
                            Pattern pattern = dv.R;
                            if (i1Var != null && tL_messages_stickerSet != null && i1Var.getFragmentView() != null) {
                                MediaDataController.getInstance(i1Var.getCurrentAccount()).toggleStickerSet(i1Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, i1Var, true, true, npVar, true);
                            }
                            yuVar.a(false, true);
                            return;
                        default:
                            yuVar.f35073f.M(null, null);
                            return;
                    }
                }
            });
            w0Var.setDelegate(new wu(dvVar, 0));
            w0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
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
        if (this.f35076s != z10) {
            this.f35076s = z10;
            ValueAnimator valueAnimator = this.f35077w;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f35077w = null;
            }
            TextView textView2 = this.f35071c;
            if (textView2 != null && (textView = this.d) != null) {
                textView2.setClickable(!z10);
                textView.setClickable(z10);
                float f16 = 0.0f;
                if (z11) {
                    float f17 = this.v;
                    if (z10) {
                        f16 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f17, f16);
                    this.f35077w = ofFloat;
                    ofFloat.addUpdateListener(new e6(this, 18));
                    this.f35077w.setInterpolator(gr.h);
                    this.f35077w.setDuration(250L);
                    this.f35077w.start();
                    return;
                }
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                this.v = f10;
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
    public final void onMeasure(int i9, int i10) {
        float f10;
        if (this.h) {
            f10 = 42.0f;
        } else {
            f10 = 56.0f;
        }
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f10), 1073741824));
    }
}
