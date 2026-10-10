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
public final class ew extends FrameLayout {
    public final fa0 f26178a;
    public final TextView f26179b;
    public final TextView f26180c;
    public final TextView d;
    public final rg.p0 f26181e;
    public final org.telegram.ui.ActionBar.v0 f26182f;
    public final boolean h;
    public final ai.z3 f26183n;
    public TLRPC.TL_messages_stickerSet f26184r;
    public boolean f26185s;
    public float v;
    public ValueAnimator f26186w;
    public final jw f26187x;

    public ew(jw jwVar, Context context, boolean z10) {
        super(context);
        float f7;
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        org.telegram.ui.ActionBar.e6 e6Var3;
        int i10;
        int i11;
        float f10;
        float f11;
        org.telegram.ui.ActionBar.e6 e6Var4;
        this.f26187x = jwVar;
        this.f26183n = new ai.z3(this, 5);
        this.f26185s = false;
        this.v = 0.0f;
        this.h = z10;
        if (!z10) {
            i11 = ((org.telegram.ui.ActionBar.f3) jwVar).currentAccount;
            float f12 = 8.0f;
            if (!UserConfig.getInstance(i11).isPremium()) {
                f11 = 16.0f;
                int dp = AndroidUtilities.dp(4.0f);
                f10 = 28.0f;
                e6Var4 = ((org.telegram.ui.ActionBar.f3) jwVar).resourcesProvider;
                rg.p0 p0Var = new rg.p0(dp, context, e6Var4, false);
                this.f26181e = p0Var;
                p0Var.a(LocaleController.getString(R.string.Unlock), new View.OnClickListener(this) {
                    public final ew f25066b;

                    {
                        this.f25066b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        int i12 = r2;
                        ew ewVar = this.f25066b;
                        switch (i12) {
                            case 0:
                                jw jwVar2 = ewVar.f26187x;
                                jwVar2.Q = SystemClock.elapsedRealtime();
                                jwVar2.a0();
                                return;
                            case 1:
                                jw.X(ewVar.f26183n, ewVar.f26184r, true, null, null);
                                ewVar.a(true, true);
                                return;
                            case 2:
                                ai.z3 z3Var = ewVar.f26183n;
                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = ewVar.f26184r;
                                nq nqVar = new nq(ewVar, 12);
                                Pattern pattern = jw.V;
                                if (z3Var != null && tL_messages_stickerSet != null && z3Var.getFragmentView() != null) {
                                    MediaDataController.getInstance(z3Var.getCurrentAccount()).toggleStickerSet(z3Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, z3Var, true, true, nqVar, true);
                                }
                                ewVar.a(false, true);
                                return;
                            default:
                                ewVar.f26182f.M(null, null);
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
                addView(p0Var, w7.x5.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
                p0Var.measure(View.MeasureSpec.makeMeasureSpec(99999, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(28.0f), 1073741824));
                f12 = (AndroidUtilities.dp(16.0f) + p0Var.getMeasuredWidth()) / AndroidUtilities.density;
            } else {
                f10 = 28.0f;
                f11 = 16.0f;
            }
            TextView textView = new TextView(context);
            this.f26180c = textView;
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextColor(jwVar.getThemedColor(org.telegram.ui.ActionBar.i6.Sh));
            int i12 = org.telegram.ui.ActionBar.i6.Oh;
            textView.setBackground(org.telegram.ui.ActionBar.y5.e(new float[]{14.0f}, jwVar.getThemedColor(i12)));
            textView.setPadding(org.telegram.ui.Cells.c1.b(18.0f, R.string.Add, textView), 0, AndroidUtilities.dp(18.0f), 0);
            textView.setGravity(17);
            textView.setOnClickListener(new View.OnClickListener(this) {
                public final ew f25066b;

                {
                    this.f25066b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i122 = r2;
                    ew ewVar = this.f25066b;
                    switch (i122) {
                        case 0:
                            jw jwVar2 = ewVar.f26187x;
                            jwVar2.Q = SystemClock.elapsedRealtime();
                            jwVar2.a0();
                            return;
                        case 1:
                            jw.X(ewVar.f26183n, ewVar.f26184r, true, null, null);
                            ewVar.a(true, true);
                            return;
                        case 2:
                            ai.z3 z3Var = ewVar.f26183n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = ewVar.f26184r;
                            nq nqVar = new nq(ewVar, 12);
                            Pattern pattern = jw.V;
                            if (z3Var != null && tL_messages_stickerSet != null && z3Var.getFragmentView() != null) {
                                MediaDataController.getInstance(z3Var.getCurrentAccount()).toggleStickerSet(z3Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, z3Var, true, true, nqVar, true);
                            }
                            ewVar.a(false, true);
                            return;
                        default:
                            ewVar.f26182f.M(null, null);
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
            textView2.setTextColor(jwVar.getThemedColor(i12));
            textView2.setBackground(org.telegram.ui.ActionBar.i6.Z(jwVar.getThemedColor(i12) & 268435455, 4, 4));
            textView2.setPadding(org.telegram.ui.Cells.c1.b(12.0f, R.string.StickersRemove, textView2), 0, AndroidUtilities.dp(12.0f), 0);
            textView2.setGravity(17);
            textView2.setOnClickListener(new View.OnClickListener(this) {
                public final ew f25066b;

                {
                    this.f25066b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i122 = r2;
                    ew ewVar = this.f25066b;
                    switch (i122) {
                        case 0:
                            jw jwVar2 = ewVar.f26187x;
                            jwVar2.Q = SystemClock.elapsedRealtime();
                            jwVar2.a0();
                            return;
                        case 1:
                            jw.X(ewVar.f26183n, ewVar.f26184r, true, null, null);
                            ewVar.a(true, true);
                            return;
                        case 2:
                            ai.z3 z3Var = ewVar.f26183n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = ewVar.f26184r;
                            nq nqVar = new nq(ewVar, 12);
                            Pattern pattern = jw.V;
                            if (z3Var != null && tL_messages_stickerSet != null && z3Var.getFragmentView() != null) {
                                MediaDataController.getInstance(z3Var.getCurrentAccount()).toggleStickerSet(z3Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, z3Var, true, true, nqVar, true);
                            }
                            ewVar.a(false, true);
                            return;
                        default:
                            ewVar.f26182f.M(null, null);
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
        float f13 = f7;
        e6Var = ((org.telegram.ui.ActionBar.f3) jwVar).resourcesProvider;
        fa0 fa0Var = new fa0(context, e6Var);
        this.f26178a = fa0Var;
        fa0Var.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        fa0Var.setTypeface(AndroidUtilities.bold());
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        fa0Var.setEllipsize(truncateAt);
        fa0Var.setSingleLine(true);
        fa0Var.setLines(1);
        int i13 = org.telegram.ui.ActionBar.i6.J6;
        e6Var2 = ((org.telegram.ui.ActionBar.f3) jwVar).resourcesProvider;
        fa0Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(i13, e6Var2));
        fa0Var.setTextColor(jwVar.getThemedColor(org.telegram.ui.ActionBar.i6.f20909j5));
        if (z10) {
            fa0Var.setTextSize(1, 20.0f);
            addView(fa0Var, w7.x5.i(-1.0f, -2.0f, 8388659, 12.0f, 11.0f, f13, 0.0f));
        } else {
            fa0Var.setTextSize(1, 17.0f);
            addView(fa0Var, w7.x5.i(-1.0f, -2.0f, 8388659, 6.0f, 10.0f, f13, 0.0f));
        }
        if (!z10) {
            TextView textView3 = new TextView(context);
            this.f26179b = textView3;
            textView3.setTextSize(1, 13.0f);
            textView3.setTextColor(jwVar.getThemedColor(org.telegram.ui.ActionBar.i6.f21040q5));
            textView3.setEllipsize(truncateAt);
            textView3.setSingleLine(true);
            textView3.setLines(1);
            addView(textView3, w7.x5.i(-1.0f, -2.0f, 8388659, 8.0f, 31.66f, f13, 0.0f));
        }
        if (z10) {
            int themedColor = jwVar.getThemedColor(org.telegram.ui.ActionBar.i6.Ji);
            e6Var3 = ((org.telegram.ui.ActionBar.f3) jwVar).resourcesProvider;
            org.telegram.ui.ActionBar.v0 v0Var = new org.telegram.ui.ActionBar.v0(context, null, 0, themedColor, false, e6Var3);
            this.f26182f = v0Var;
            v0Var.setLongClickEnabled(false);
            v0Var.setSubMenuOpenSide(2);
            v0Var.setIcon(R.drawable.ic_ab_other);
            v0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.g0(jwVar.getThemedColor(org.telegram.ui.ActionBar.i6.Ni), 1, -1));
            i10 = ((org.telegram.ui.ActionBar.f3) jwVar).backgroundPaddingLeft;
            addView(v0Var, w7.x5.a(40.0f, 0.0f, 5.0f, 5.0f - (i10 / AndroidUtilities.density), 0.0f, 40, 53));
            v0Var.e(1, R.drawable.msg_share, LocaleController.getString(R.string.StickersShare));
            v0Var.e(2, R.drawable.msg_link, LocaleController.getString(R.string.CopyLink));
            v0Var.setOnClickListener(new View.OnClickListener(this) {
                public final ew f25066b;

                {
                    this.f25066b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i122 = r2;
                    ew ewVar = this.f25066b;
                    switch (i122) {
                        case 0:
                            jw jwVar2 = ewVar.f26187x;
                            jwVar2.Q = SystemClock.elapsedRealtime();
                            jwVar2.a0();
                            return;
                        case 1:
                            jw.X(ewVar.f26183n, ewVar.f26184r, true, null, null);
                            ewVar.a(true, true);
                            return;
                        case 2:
                            ai.z3 z3Var = ewVar.f26183n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = ewVar.f26184r;
                            nq nqVar = new nq(ewVar, 12);
                            Pattern pattern = jw.V;
                            if (z3Var != null && tL_messages_stickerSet != null && z3Var.getFragmentView() != null) {
                                MediaDataController.getInstance(z3Var.getCurrentAccount()).toggleStickerSet(z3Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, z3Var, true, true, nqVar, true);
                            }
                            ewVar.a(false, true);
                            return;
                        default:
                            ewVar.f26182f.M(null, null);
                            return;
                    }
                }
            });
            v0Var.setDelegate(new cw(jwVar, 0));
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
        if (this.f26185s != z10) {
            this.f26185s = z10;
            ValueAnimator valueAnimator = this.f26186w;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f26186w = null;
            }
            TextView textView2 = this.f26180c;
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
                    this.f26186w = ofFloat;
                    ofFloat.addUpdateListener(new m6(this, 19));
                    this.f26186w.setInterpolator(is.h);
                    this.f26186w.setDuration(250L);
                    this.f26186w.start();
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
