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
public final class zv extends FrameLayout {
    public final da0 f31689a;
    public final TextView f31690b;
    public final TextView f31691c;
    public final TextView d;
    public final sg.q0 e;
    public final org.telegram.ui.ActionBar.u0 f31692f;
    public final boolean h;
    public final bi.o3 f31693n;
    public TLRPC.TL_messages_stickerSet f31694r;
    public boolean f31695s;
    public float v;
    public ValueAnimator f31696w;
    public final ew f31697x;

    public zv(ew ewVar, Context context, boolean z10) {
        super(context);
        float f7;
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        org.telegram.ui.ActionBar.c6 c6Var3;
        int i10;
        int i11;
        float f10;
        float f11;
        org.telegram.ui.ActionBar.c6 c6Var4;
        this.f31697x = ewVar;
        this.f31693n = new bi.o3(this, 5);
        this.f31695s = false;
        this.v = 0.0f;
        this.h = z10;
        if (!z10) {
            i11 = ((org.telegram.ui.ActionBar.e3) ewVar).currentAccount;
            float f12 = 8.0f;
            if (!UserConfig.getInstance(i11).isPremium()) {
                f11 = 16.0f;
                int dp = AndroidUtilities.dp(4.0f);
                f10 = 28.0f;
                c6Var4 = ((org.telegram.ui.ActionBar.e3) ewVar).resourcesProvider;
                sg.q0 q0Var = new sg.q0(dp, context, c6Var4, false);
                this.e = q0Var;
                q0Var.a(LocaleController.getString(R.string.Unlock), new View.OnClickListener(this) {
                    public final zv f30671b;

                    {
                        this.f30671b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        int i12 = r2;
                        zv zvVar = this.f30671b;
                        switch (i12) {
                            case 0:
                                ew ewVar2 = zvVar.f31697x;
                                ewVar2.Q = SystemClock.elapsedRealtime();
                                ewVar2.a0();
                                return;
                            case 1:
                                ew.X(zvVar.f31693n, zvVar.f31694r, true, null, null);
                                zvVar.a(true, true);
                                return;
                            case 2:
                                bi.o3 o3Var = zvVar.f31693n;
                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = zvVar.f31694r;
                                kq kqVar = new kq(zvVar, 12);
                                Pattern pattern = ew.V;
                                if (o3Var != null && tL_messages_stickerSet != null && o3Var.getFragmentView() != null) {
                                    MediaDataController.getInstance(o3Var.getCurrentAccount()).toggleStickerSet(o3Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, o3Var, true, true, kqVar, true);
                                }
                                zvVar.a(false, true);
                                return;
                            default:
                                zvVar.f31692f.M(null, null);
                                return;
                        }
                    }
                }, false);
                q0Var.setIcon(R.raw.unlock_icon);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) q0Var.getIconView().getLayoutParams();
                marginLayoutParams.leftMargin = AndroidUtilities.dp(1.0f);
                marginLayoutParams.topMargin = AndroidUtilities.dp(1.0f);
                int dp2 = AndroidUtilities.dp(20.0f);
                marginLayoutParams.height = dp2;
                marginLayoutParams.width = dp2;
                ((ViewGroup.MarginLayoutParams) q0Var.getTextView().getLayoutParams()).leftMargin = AndroidUtilities.dp(3.0f);
                q0Var.getChildAt(0).setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                addView(q0Var, w7.z5.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
                q0Var.measure(View.MeasureSpec.makeMeasureSpec(99999, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(28.0f), 1073741824));
                f12 = (AndroidUtilities.dp(16.0f) + q0Var.getMeasuredWidth()) / AndroidUtilities.density;
            } else {
                f10 = 28.0f;
                f11 = 16.0f;
            }
            TextView textView = new TextView(context);
            this.f31691c = textView;
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextColor(ewVar.getThemedColor(org.telegram.ui.ActionBar.g6.Sh));
            int i12 = org.telegram.ui.ActionBar.g6.Oh;
            textView.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{14.0f}, ewVar.getThemedColor(i12)));
            textView.setPadding(org.telegram.ui.Cells.c1.b(18.0f, R.string.Add, textView), 0, AndroidUtilities.dp(18.0f), 0);
            textView.setGravity(17);
            textView.setOnClickListener(new View.OnClickListener(this) {
                public final zv f30671b;

                {
                    this.f30671b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i122 = r2;
                    zv zvVar = this.f30671b;
                    switch (i122) {
                        case 0:
                            ew ewVar2 = zvVar.f31697x;
                            ewVar2.Q = SystemClock.elapsedRealtime();
                            ewVar2.a0();
                            return;
                        case 1:
                            ew.X(zvVar.f31693n, zvVar.f31694r, true, null, null);
                            zvVar.a(true, true);
                            return;
                        case 2:
                            bi.o3 o3Var = zvVar.f31693n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = zvVar.f31694r;
                            kq kqVar = new kq(zvVar, 12);
                            Pattern pattern = ew.V;
                            if (o3Var != null && tL_messages_stickerSet != null && o3Var.getFragmentView() != null) {
                                MediaDataController.getInstance(o3Var.getCurrentAccount()).toggleStickerSet(o3Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, o3Var, true, true, kqVar, true);
                            }
                            zvVar.a(false, true);
                            return;
                        default:
                            zvVar.f31692f.M(null, null);
                            return;
                    }
                }
            });
            addView(textView, w7.z5.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
            textView.measure(View.MeasureSpec.makeMeasureSpec(99999, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f10), 1073741824));
            float max = Math.max(f12, (AndroidUtilities.dp(f11) + textView.getMeasuredWidth()) / AndroidUtilities.density);
            TextView textView2 = new TextView(context);
            this.d = textView2;
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setTextColor(ewVar.getThemedColor(i12));
            textView2.setBackground(org.telegram.ui.ActionBar.g6.Z(ewVar.getThemedColor(i12) & 268435455, 4, 4));
            textView2.setPadding(org.telegram.ui.Cells.c1.b(12.0f, R.string.StickersRemove, textView2), 0, AndroidUtilities.dp(12.0f), 0);
            textView2.setGravity(17);
            textView2.setOnClickListener(new View.OnClickListener(this) {
                public final zv f30671b;

                {
                    this.f30671b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i122 = r2;
                    zv zvVar = this.f30671b;
                    switch (i122) {
                        case 0:
                            ew ewVar2 = zvVar.f31697x;
                            ewVar2.Q = SystemClock.elapsedRealtime();
                            ewVar2.a0();
                            return;
                        case 1:
                            ew.X(zvVar.f31693n, zvVar.f31694r, true, null, null);
                            zvVar.a(true, true);
                            return;
                        case 2:
                            bi.o3 o3Var = zvVar.f31693n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = zvVar.f31694r;
                            kq kqVar = new kq(zvVar, 12);
                            Pattern pattern = ew.V;
                            if (o3Var != null && tL_messages_stickerSet != null && o3Var.getFragmentView() != null) {
                                MediaDataController.getInstance(o3Var.getCurrentAccount()).toggleStickerSet(o3Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, o3Var, true, true, kqVar, true);
                            }
                            zvVar.a(false, true);
                            return;
                        default:
                            zvVar.f31692f.M(null, null);
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
        float f13 = f7;
        c6Var = ((org.telegram.ui.ActionBar.e3) ewVar).resourcesProvider;
        da0 da0Var = new da0(context, c6Var);
        this.f31689a = da0Var;
        da0Var.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        da0Var.setTypeface(AndroidUtilities.bold());
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        da0Var.setEllipsize(truncateAt);
        da0Var.setSingleLine(true);
        da0Var.setLines(1);
        int i13 = org.telegram.ui.ActionBar.g6.J6;
        c6Var2 = ((org.telegram.ui.ActionBar.e3) ewVar).resourcesProvider;
        da0Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(i13, c6Var2));
        da0Var.setTextColor(ewVar.getThemedColor(org.telegram.ui.ActionBar.g6.f19707j5));
        if (z10) {
            da0Var.setTextSize(1, 20.0f);
            addView(da0Var, w7.z5.i(-1.0f, -2.0f, 8388659, 12.0f, 11.0f, f13, 0.0f));
        } else {
            da0Var.setTextSize(1, 17.0f);
            addView(da0Var, w7.z5.i(-1.0f, -2.0f, 8388659, 6.0f, 10.0f, f13, 0.0f));
        }
        if (!z10) {
            TextView textView3 = new TextView(context);
            this.f31690b = textView3;
            textView3.setTextSize(1, 13.0f);
            textView3.setTextColor(ewVar.getThemedColor(org.telegram.ui.ActionBar.g6.f19838q5));
            textView3.setEllipsize(truncateAt);
            textView3.setSingleLine(true);
            textView3.setLines(1);
            addView(textView3, w7.z5.i(-1.0f, -2.0f, 8388659, 8.0f, 31.66f, f13, 0.0f));
        }
        if (z10) {
            int themedColor = ewVar.getThemedColor(org.telegram.ui.ActionBar.g6.Ji);
            c6Var3 = ((org.telegram.ui.ActionBar.e3) ewVar).resourcesProvider;
            org.telegram.ui.ActionBar.u0 u0Var = new org.telegram.ui.ActionBar.u0(context, null, 0, themedColor, false, c6Var3);
            this.f31692f = u0Var;
            u0Var.setLongClickEnabled(false);
            u0Var.setSubMenuOpenSide(2);
            u0Var.setIcon(R.drawable.ic_ab_other);
            u0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.g0(ewVar.getThemedColor(org.telegram.ui.ActionBar.g6.Ni), 1, -1));
            i10 = ((org.telegram.ui.ActionBar.e3) ewVar).backgroundPaddingLeft;
            addView(u0Var, w7.z5.a(40.0f, 0.0f, 5.0f, 5.0f - (i10 / AndroidUtilities.density), 0.0f, 40, 53));
            u0Var.e(1, R.drawable.msg_share, LocaleController.getString(R.string.StickersShare));
            u0Var.e(2, R.drawable.msg_link, LocaleController.getString(R.string.CopyLink));
            u0Var.setOnClickListener(new View.OnClickListener(this) {
                public final zv f30671b;

                {
                    this.f30671b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i122 = r2;
                    zv zvVar = this.f30671b;
                    switch (i122) {
                        case 0:
                            ew ewVar2 = zvVar.f31697x;
                            ewVar2.Q = SystemClock.elapsedRealtime();
                            ewVar2.a0();
                            return;
                        case 1:
                            ew.X(zvVar.f31693n, zvVar.f31694r, true, null, null);
                            zvVar.a(true, true);
                            return;
                        case 2:
                            bi.o3 o3Var = zvVar.f31693n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = zvVar.f31694r;
                            kq kqVar = new kq(zvVar, 12);
                            Pattern pattern = ew.V;
                            if (o3Var != null && tL_messages_stickerSet != null && o3Var.getFragmentView() != null) {
                                MediaDataController.getInstance(o3Var.getCurrentAccount()).toggleStickerSet(o3Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, o3Var, true, true, kqVar, true);
                            }
                            zvVar.a(false, true);
                            return;
                        default:
                            zvVar.f31692f.M(null, null);
                            return;
                    }
                }
            });
            u0Var.setDelegate(new xv(ewVar, 0));
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
        if (this.f31695s != z10) {
            this.f31695s = z10;
            ValueAnimator valueAnimator = this.f31696w;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f31696w = null;
            }
            TextView textView2 = this.f31691c;
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
                    this.f31696w = ofFloat;
                    ofFloat.addUpdateListener(new n6(this, 19));
                    this.f31696w.setInterpolator(es.h);
                    this.f31696w.setDuration(250L);
                    this.f31696w.start();
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
