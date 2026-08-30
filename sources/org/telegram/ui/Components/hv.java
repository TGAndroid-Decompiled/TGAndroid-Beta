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
public final class hv extends FrameLayout {
    public final e90 f25498a;
    public final TextView f25499b;
    public final TextView f25500c;
    public final TextView d;
    public final eg.c1 e;
    public final org.telegram.ui.ActionBar.w0 f25501f;
    public final boolean h;
    public final eg.y1 f25502n;
    public TLRPC.TL_messages_stickerSet f25503r;
    public boolean f25504s;
    public float v;
    public ValueAnimator f25505w;
    public final mv f25506x;

    public hv(mv mvVar, Context context, boolean z4) {
        super(context);
        float f10;
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        org.telegram.ui.ActionBar.f6 f6Var3;
        int i10;
        int i11;
        float f11;
        float f12;
        org.telegram.ui.ActionBar.f6 f6Var4;
        this.f25506x = mvVar;
        this.f25502n = new eg.y1(this, 7);
        this.f25504s = false;
        this.v = 0.0f;
        this.h = z4;
        if (!z4) {
            i11 = ((org.telegram.ui.ActionBar.g3) mvVar).currentAccount;
            float f13 = 8.0f;
            if (!UserConfig.getInstance(i11).isPremium()) {
                f12 = 16.0f;
                int dp = AndroidUtilities.dp(4.0f);
                f11 = 28.0f;
                f6Var4 = ((org.telegram.ui.ActionBar.g3) mvVar).resourcesProvider;
                eg.c1 c1Var = new eg.c1(dp, context, f6Var4, false);
                this.e = c1Var;
                c1Var.a(LocaleController.getString(R.string.Unlock), new View.OnClickListener(this) {
                    public final hv f24681b;

                    {
                        this.f24681b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        int i12 = r2;
                        hv hvVar = this.f24681b;
                        switch (i12) {
                            case 0:
                                mv mvVar2 = hvVar.f25506x;
                                mvVar2.N = SystemClock.elapsedRealtime();
                                mvVar2.Z();
                                return;
                            case 1:
                                mv.W(hvVar.f25502n, hvVar.f25503r, true, null, null);
                                hvVar.a(true, true);
                                return;
                            case 2:
                                eg.y1 y1Var = hvVar.f25502n;
                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = hvVar.f25503r;
                                vp vpVar = new vp(hvVar, 12);
                                Pattern pattern = mv.S;
                                if (y1Var != null && tL_messages_stickerSet != null && y1Var.getFragmentView() != null) {
                                    MediaDataController.getInstance(y1Var.getCurrentAccount()).toggleStickerSet(y1Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, y1Var, true, true, vpVar, true);
                                }
                                hvVar.a(false, true);
                                return;
                            default:
                                hvVar.f25501f.M(null, null);
                                return;
                        }
                    }
                }, false);
                c1Var.setIcon(R.raw.unlock_icon);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c1Var.getIconView().getLayoutParams();
                marginLayoutParams.leftMargin = AndroidUtilities.dp(1.0f);
                marginLayoutParams.topMargin = AndroidUtilities.dp(1.0f);
                int dp2 = AndroidUtilities.dp(20.0f);
                marginLayoutParams.height = dp2;
                marginLayoutParams.width = dp2;
                ((ViewGroup.MarginLayoutParams) c1Var.getTextView().getLayoutParams()).leftMargin = AndroidUtilities.dp(3.0f);
                c1Var.getChildAt(0).setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                addView(c1Var, k7.b6.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
                c1Var.measure(View.MeasureSpec.makeMeasureSpec(99999, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(28.0f), 1073741824));
                f13 = (AndroidUtilities.dp(16.0f) + c1Var.getMeasuredWidth()) / AndroidUtilities.density;
            } else {
                f11 = 28.0f;
                f12 = 16.0f;
            }
            TextView textView = new TextView(context);
            this.f25500c = textView;
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextColor(mvVar.getThemedColor(org.telegram.ui.ActionBar.j6.Sh));
            int i12 = org.telegram.ui.ActionBar.j6.Oh;
            textView.setBackground(org.telegram.ui.ActionBar.z5.e(new float[]{14.0f}, mvVar.getThemedColor(i12)));
            textView.setPadding(org.telegram.ui.b.e(18.0f, R.string.Add, textView), 0, AndroidUtilities.dp(18.0f), 0);
            textView.setGravity(17);
            textView.setOnClickListener(new View.OnClickListener(this) {
                public final hv f24681b;

                {
                    this.f24681b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i122 = r2;
                    hv hvVar = this.f24681b;
                    switch (i122) {
                        case 0:
                            mv mvVar2 = hvVar.f25506x;
                            mvVar2.N = SystemClock.elapsedRealtime();
                            mvVar2.Z();
                            return;
                        case 1:
                            mv.W(hvVar.f25502n, hvVar.f25503r, true, null, null);
                            hvVar.a(true, true);
                            return;
                        case 2:
                            eg.y1 y1Var = hvVar.f25502n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = hvVar.f25503r;
                            vp vpVar = new vp(hvVar, 12);
                            Pattern pattern = mv.S;
                            if (y1Var != null && tL_messages_stickerSet != null && y1Var.getFragmentView() != null) {
                                MediaDataController.getInstance(y1Var.getCurrentAccount()).toggleStickerSet(y1Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, y1Var, true, true, vpVar, true);
                            }
                            hvVar.a(false, true);
                            return;
                        default:
                            hvVar.f25501f.M(null, null);
                            return;
                    }
                }
            });
            addView(textView, k7.b6.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
            textView.measure(View.MeasureSpec.makeMeasureSpec(99999, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f11), 1073741824));
            float max = Math.max(f13, (AndroidUtilities.dp(f12) + textView.getMeasuredWidth()) / AndroidUtilities.density);
            TextView textView2 = new TextView(context);
            this.d = textView2;
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setTextColor(mvVar.getThemedColor(i12));
            textView2.setBackground(org.telegram.ui.ActionBar.j6.Y(mvVar.getThemedColor(i12) & 268435455, 4, 4));
            textView2.setPadding(org.telegram.ui.b.e(12.0f, R.string.StickersRemove, textView2), 0, AndroidUtilities.dp(12.0f), 0);
            textView2.setGravity(17);
            textView2.setOnClickListener(new View.OnClickListener(this) {
                public final hv f24681b;

                {
                    this.f24681b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i122 = r2;
                    hv hvVar = this.f24681b;
                    switch (i122) {
                        case 0:
                            mv mvVar2 = hvVar.f25506x;
                            mvVar2.N = SystemClock.elapsedRealtime();
                            mvVar2.Z();
                            return;
                        case 1:
                            mv.W(hvVar.f25502n, hvVar.f25503r, true, null, null);
                            hvVar.a(true, true);
                            return;
                        case 2:
                            eg.y1 y1Var = hvVar.f25502n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = hvVar.f25503r;
                            vp vpVar = new vp(hvVar, 12);
                            Pattern pattern = mv.S;
                            if (y1Var != null && tL_messages_stickerSet != null && y1Var.getFragmentView() != null) {
                                MediaDataController.getInstance(y1Var.getCurrentAccount()).toggleStickerSet(y1Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, y1Var, true, true, vpVar, true);
                            }
                            hvVar.a(false, true);
                            return;
                        default:
                            hvVar.f25501f.M(null, null);
                            return;
                    }
                }
            });
            textView2.setClickable(false);
            addView(textView2, k7.b6.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
            textView2.setScaleX(0.0f);
            textView2.setScaleY(0.0f);
            textView2.setAlpha(0.0f);
            textView2.measure(View.MeasureSpec.makeMeasureSpec(99999, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f11), 1073741824));
            f10 = Math.max(max, (AndroidUtilities.dp(f12) + textView2.getMeasuredWidth()) / AndroidUtilities.density);
        } else {
            f10 = 32.0f;
        }
        f6Var = ((org.telegram.ui.ActionBar.g3) mvVar).resourcesProvider;
        e90 e90Var = new e90(context, f6Var);
        this.f25498a = e90Var;
        e90Var.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        e90Var.setTypeface(AndroidUtilities.bold());
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        e90Var.setEllipsize(truncateAt);
        e90Var.setSingleLine(true);
        e90Var.setLines(1);
        int i13 = org.telegram.ui.ActionBar.j6.J6;
        f6Var2 = ((org.telegram.ui.ActionBar.g3) mvVar).resourcesProvider;
        e90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i13, f6Var2));
        e90Var.setTextColor(mvVar.getThemedColor(org.telegram.ui.ActionBar.j6.f20012j5));
        if (z4) {
            e90Var.setTextSize(1, 20.0f);
            addView(e90Var, k7.b6.i(-1.0f, -2.0f, 8388659, 12.0f, 11.0f, f10, 0.0f));
        } else {
            e90Var.setTextSize(1, 17.0f);
            addView(e90Var, k7.b6.i(-1.0f, -2.0f, 8388659, 6.0f, 10.0f, f10, 0.0f));
        }
        if (!z4) {
            TextView textView3 = new TextView(context);
            this.f25499b = textView3;
            textView3.setTextSize(1, 13.0f);
            textView3.setTextColor(mvVar.getThemedColor(org.telegram.ui.ActionBar.j6.f20139q5));
            textView3.setEllipsize(truncateAt);
            textView3.setSingleLine(true);
            textView3.setLines(1);
            addView(textView3, k7.b6.i(-1.0f, -2.0f, 8388659, 8.0f, 31.66f, f10, 0.0f));
        }
        if (z4) {
            int themedColor = mvVar.getThemedColor(org.telegram.ui.ActionBar.j6.Ji);
            f6Var3 = ((org.telegram.ui.ActionBar.g3) mvVar).resourcesProvider;
            org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(context, null, 0, themedColor, false, f6Var3);
            this.f25501f = w0Var;
            w0Var.setLongClickEnabled(false);
            w0Var.setSubMenuOpenSide(2);
            w0Var.setIcon(R.drawable.ic_ab_other);
            w0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(mvVar.getThemedColor(org.telegram.ui.ActionBar.j6.Ni), 1, -1));
            i10 = ((org.telegram.ui.ActionBar.g3) mvVar).backgroundPaddingLeft;
            addView(w0Var, k7.b6.d(40, 40.0f, 53, 0.0f, 5.0f, 5.0f - (i10 / AndroidUtilities.density), 0.0f));
            w0Var.e(1, R.drawable.msg_share, LocaleController.getString(R.string.StickersShare));
            w0Var.e(2, R.drawable.msg_link, LocaleController.getString(R.string.CopyLink));
            w0Var.setOnClickListener(new View.OnClickListener(this) {
                public final hv f24681b;

                {
                    this.f24681b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i122 = r2;
                    hv hvVar = this.f24681b;
                    switch (i122) {
                        case 0:
                            mv mvVar2 = hvVar.f25506x;
                            mvVar2.N = SystemClock.elapsedRealtime();
                            mvVar2.Z();
                            return;
                        case 1:
                            mv.W(hvVar.f25502n, hvVar.f25503r, true, null, null);
                            hvVar.a(true, true);
                            return;
                        case 2:
                            eg.y1 y1Var = hvVar.f25502n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = hvVar.f25503r;
                            vp vpVar = new vp(hvVar, 12);
                            Pattern pattern = mv.S;
                            if (y1Var != null && tL_messages_stickerSet != null && y1Var.getFragmentView() != null) {
                                MediaDataController.getInstance(y1Var.getCurrentAccount()).toggleStickerSet(y1Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, y1Var, true, true, vpVar, true);
                            }
                            hvVar.a(false, true);
                            return;
                        default:
                            hvVar.f25501f.M(null, null);
                            return;
                    }
                }
            });
            w0Var.setDelegate(new fv(mvVar, 0));
            w0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        }
    }

    public final void a(boolean z4, boolean z10) {
        TextView textView;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        if (this.f25504s != z4) {
            this.f25504s = z4;
            ValueAnimator valueAnimator = this.f25505w;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f25505w = null;
            }
            TextView textView2 = this.f25500c;
            if (textView2 != null && (textView = this.d) != null) {
                textView2.setClickable(!z4);
                textView.setClickable(z4);
                float f16 = 0.0f;
                if (z10) {
                    float f17 = this.v;
                    if (z4) {
                        f16 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f17, f16);
                    this.f25505w = ofFloat;
                    ofFloat.addUpdateListener(new f6(this, 18));
                    this.f25505w.setInterpolator(nr.h);
                    this.f25505w.setDuration(250L);
                    this.f25505w.start();
                    return;
                }
                if (z4) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                this.v = f10;
                if (z4) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                textView2.setScaleX(f11);
                if (z4) {
                    f12 = 0.0f;
                } else {
                    f12 = 1.0f;
                }
                textView2.setScaleY(f12);
                if (z4) {
                    f13 = 0.0f;
                } else {
                    f13 = 1.0f;
                }
                textView2.setAlpha(f13);
                if (z4) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                textView.setScaleX(f14);
                if (z4) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                textView.setScaleY(f15);
                if (z4) {
                    f16 = 1.0f;
                }
                textView.setAlpha(f16);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f10;
        if (this.h) {
            f10 = 42.0f;
        } else {
            f10 = 56.0f;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f10), 1073741824));
    }
}
