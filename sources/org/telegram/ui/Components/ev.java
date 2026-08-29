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
public final class ev extends FrameLayout {
    public final y80 f28183a;
    public final TextView f28184b;
    public final TextView f28185c;
    public final TextView d;
    public final cg.d1 f28186e;
    public final org.telegram.ui.ActionBar.w0 f28187f;
    public final boolean h;
    public final cg.z1 f28188n;
    public TLRPC.TL_messages_stickerSet f28189r;
    public boolean f28190s;
    public float v;
    public ValueAnimator f28191w;
    public final jv f28192x;

    public ev(jv jvVar, Context context, boolean z10) {
        super(context);
        float f9;
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        org.telegram.ui.ActionBar.c6 c6Var3;
        int i10;
        int i11;
        float f10;
        float f11;
        org.telegram.ui.ActionBar.c6 c6Var4;
        this.f28192x = jvVar;
        this.f28188n = new cg.z1(this, 9);
        this.f28190s = false;
        this.v = 0.0f;
        this.h = z10;
        if (!z10) {
            i11 = ((org.telegram.ui.ActionBar.f3) jvVar).currentAccount;
            float f12 = 8.0f;
            if (!UserConfig.getInstance(i11).isPremium()) {
                f11 = 16.0f;
                int dp = AndroidUtilities.dp(4.0f);
                f10 = 28.0f;
                c6Var4 = ((org.telegram.ui.ActionBar.f3) jvVar).resourcesProvider;
                cg.d1 d1Var = new cg.d1(dp, context, c6Var4, false);
                this.f28186e = d1Var;
                d1Var.a(LocaleController.getString(R.string.Unlock), new View.OnClickListener(this) {
                    public final ev f27237b;

                    {
                        this.f27237b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        int i12 = r2;
                        ev evVar = this.f27237b;
                        switch (i12) {
                            case 0:
                                jv jvVar2 = evVar.f28192x;
                                jvVar2.M = SystemClock.elapsedRealtime();
                                jvVar2.Z();
                                return;
                            case 1:
                                jv.W(evVar.f28188n, evVar.f28189r, true, null, null);
                                evVar.a(true, true);
                                return;
                            case 2:
                                cg.z1 z1Var = evVar.f28188n;
                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = evVar.f28189r;
                                rp rpVar = new rp(evVar, 12);
                                Pattern pattern = jv.R;
                                if (z1Var != null && tL_messages_stickerSet != null && z1Var.getFragmentView() != null) {
                                    MediaDataController.getInstance(z1Var.getCurrentAccount()).toggleStickerSet(z1Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, z1Var, true, true, rpVar, true);
                                }
                                evVar.a(false, true);
                                return;
                            default:
                                evVar.f28187f.M(null, null);
                                return;
                        }
                    }
                }, false);
                d1Var.setIcon(R.raw.unlock_icon);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) d1Var.getIconView().getLayoutParams();
                marginLayoutParams.leftMargin = AndroidUtilities.dp(1.0f);
                marginLayoutParams.topMargin = AndroidUtilities.dp(1.0f);
                int dp2 = AndroidUtilities.dp(20.0f);
                marginLayoutParams.height = dp2;
                marginLayoutParams.width = dp2;
                ((ViewGroup.MarginLayoutParams) d1Var.getTextView().getLayoutParams()).leftMargin = AndroidUtilities.dp(3.0f);
                d1Var.getChildAt(0).setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                addView(d1Var, i7.f6.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
                d1Var.measure(View.MeasureSpec.makeMeasureSpec(99999, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(28.0f), 1073741824));
                f12 = (AndroidUtilities.dp(16.0f) + d1Var.getMeasuredWidth()) / AndroidUtilities.density;
            } else {
                f10 = 28.0f;
                f11 = 16.0f;
            }
            TextView textView = new TextView(context);
            this.f28185c = textView;
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextColor(jvVar.getThemedColor(org.telegram.ui.ActionBar.g6.Sh));
            int i12 = org.telegram.ui.ActionBar.g6.Oh;
            textView.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{14.0f}, jvVar.getThemedColor(i12)));
            textView.setPadding(org.telegram.ui.b.e(18.0f, R.string.Add, textView), 0, AndroidUtilities.dp(18.0f), 0);
            textView.setGravity(17);
            textView.setOnClickListener(new View.OnClickListener(this) {
                public final ev f27237b;

                {
                    this.f27237b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i122 = r2;
                    ev evVar = this.f27237b;
                    switch (i122) {
                        case 0:
                            jv jvVar2 = evVar.f28192x;
                            jvVar2.M = SystemClock.elapsedRealtime();
                            jvVar2.Z();
                            return;
                        case 1:
                            jv.W(evVar.f28188n, evVar.f28189r, true, null, null);
                            evVar.a(true, true);
                            return;
                        case 2:
                            cg.z1 z1Var = evVar.f28188n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = evVar.f28189r;
                            rp rpVar = new rp(evVar, 12);
                            Pattern pattern = jv.R;
                            if (z1Var != null && tL_messages_stickerSet != null && z1Var.getFragmentView() != null) {
                                MediaDataController.getInstance(z1Var.getCurrentAccount()).toggleStickerSet(z1Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, z1Var, true, true, rpVar, true);
                            }
                            evVar.a(false, true);
                            return;
                        default:
                            evVar.f28187f.M(null, null);
                            return;
                    }
                }
            });
            addView(textView, i7.f6.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
            textView.measure(View.MeasureSpec.makeMeasureSpec(99999, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f10), 1073741824));
            float max = Math.max(f12, (AndroidUtilities.dp(f11) + textView.getMeasuredWidth()) / AndroidUtilities.density);
            TextView textView2 = new TextView(context);
            this.d = textView2;
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setTextColor(jvVar.getThemedColor(i12));
            textView2.setBackground(org.telegram.ui.ActionBar.g6.Y(jvVar.getThemedColor(i12) & 268435455, 4, 4));
            textView2.setPadding(org.telegram.ui.b.e(12.0f, R.string.StickersRemove, textView2), 0, AndroidUtilities.dp(12.0f), 0);
            textView2.setGravity(17);
            textView2.setOnClickListener(new View.OnClickListener(this) {
                public final ev f27237b;

                {
                    this.f27237b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i122 = r2;
                    ev evVar = this.f27237b;
                    switch (i122) {
                        case 0:
                            jv jvVar2 = evVar.f28192x;
                            jvVar2.M = SystemClock.elapsedRealtime();
                            jvVar2.Z();
                            return;
                        case 1:
                            jv.W(evVar.f28188n, evVar.f28189r, true, null, null);
                            evVar.a(true, true);
                            return;
                        case 2:
                            cg.z1 z1Var = evVar.f28188n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = evVar.f28189r;
                            rp rpVar = new rp(evVar, 12);
                            Pattern pattern = jv.R;
                            if (z1Var != null && tL_messages_stickerSet != null && z1Var.getFragmentView() != null) {
                                MediaDataController.getInstance(z1Var.getCurrentAccount()).toggleStickerSet(z1Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, z1Var, true, true, rpVar, true);
                            }
                            evVar.a(false, true);
                            return;
                        default:
                            evVar.f28187f.M(null, null);
                            return;
                    }
                }
            });
            textView2.setClickable(false);
            addView(textView2, i7.f6.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
            textView2.setScaleX(0.0f);
            textView2.setScaleY(0.0f);
            textView2.setAlpha(0.0f);
            textView2.measure(View.MeasureSpec.makeMeasureSpec(99999, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f10), 1073741824));
            f9 = Math.max(max, (AndroidUtilities.dp(f11) + textView2.getMeasuredWidth()) / AndroidUtilities.density);
        } else {
            f9 = 32.0f;
        }
        c6Var = ((org.telegram.ui.ActionBar.f3) jvVar).resourcesProvider;
        y80 y80Var = new y80(context, c6Var);
        this.f28183a = y80Var;
        y80Var.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        y80Var.setTypeface(AndroidUtilities.bold());
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        y80Var.setEllipsize(truncateAt);
        y80Var.setSingleLine(true);
        y80Var.setLines(1);
        int i13 = org.telegram.ui.ActionBar.g6.J6;
        c6Var2 = ((org.telegram.ui.ActionBar.f3) jvVar).resourcesProvider;
        y80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i13, c6Var2));
        y80Var.setTextColor(jvVar.getThemedColor(org.telegram.ui.ActionBar.g6.f23169j5));
        if (z10) {
            y80Var.setTextSize(1, 20.0f);
            addView(y80Var, i7.f6.i(-1.0f, -2.0f, 8388659, 12.0f, 11.0f, f9, 0.0f));
        } else {
            y80Var.setTextSize(1, 17.0f);
            addView(y80Var, i7.f6.i(-1.0f, -2.0f, 8388659, 6.0f, 10.0f, f9, 0.0f));
        }
        if (!z10) {
            TextView textView3 = new TextView(context);
            this.f28184b = textView3;
            textView3.setTextSize(1, 13.0f);
            textView3.setTextColor(jvVar.getThemedColor(org.telegram.ui.ActionBar.g6.f23294q5));
            textView3.setEllipsize(truncateAt);
            textView3.setSingleLine(true);
            textView3.setLines(1);
            addView(textView3, i7.f6.i(-1.0f, -2.0f, 8388659, 8.0f, 31.66f, f9, 0.0f));
        }
        if (z10) {
            int themedColor = jvVar.getThemedColor(org.telegram.ui.ActionBar.g6.Ji);
            c6Var3 = ((org.telegram.ui.ActionBar.f3) jvVar).resourcesProvider;
            org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(context, null, 0, themedColor, false, c6Var3);
            this.f28187f = w0Var;
            w0Var.setLongClickEnabled(false);
            w0Var.setSubMenuOpenSide(2);
            w0Var.setIcon(R.drawable.ic_ab_other);
            w0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(jvVar.getThemedColor(org.telegram.ui.ActionBar.g6.Ni), 1, -1));
            i10 = ((org.telegram.ui.ActionBar.f3) jvVar).backgroundPaddingLeft;
            addView(w0Var, i7.f6.d(40, 40.0f, 53, 0.0f, 5.0f, 5.0f - (i10 / AndroidUtilities.density), 0.0f));
            w0Var.e(1, R.drawable.msg_share, LocaleController.getString(R.string.StickersShare));
            w0Var.e(2, R.drawable.msg_link, LocaleController.getString(R.string.CopyLink));
            w0Var.setOnClickListener(new View.OnClickListener(this) {
                public final ev f27237b;

                {
                    this.f27237b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i122 = r2;
                    ev evVar = this.f27237b;
                    switch (i122) {
                        case 0:
                            jv jvVar2 = evVar.f28192x;
                            jvVar2.M = SystemClock.elapsedRealtime();
                            jvVar2.Z();
                            return;
                        case 1:
                            jv.W(evVar.f28188n, evVar.f28189r, true, null, null);
                            evVar.a(true, true);
                            return;
                        case 2:
                            cg.z1 z1Var = evVar.f28188n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = evVar.f28189r;
                            rp rpVar = new rp(evVar, 12);
                            Pattern pattern = jv.R;
                            if (z1Var != null && tL_messages_stickerSet != null && z1Var.getFragmentView() != null) {
                                MediaDataController.getInstance(z1Var.getCurrentAccount()).toggleStickerSet(z1Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, z1Var, true, true, rpVar, true);
                            }
                            evVar.a(false, true);
                            return;
                        default:
                            evVar.f28187f.M(null, null);
                            return;
                    }
                }
            });
            w0Var.setDelegate(new cv(jvVar, 0));
            w0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        }
    }

    public final void a(boolean z10, boolean z11) {
        TextView textView;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        if (this.f28190s != z10) {
            this.f28190s = z10;
            ValueAnimator valueAnimator = this.f28191w;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f28191w = null;
            }
            TextView textView2 = this.f28185c;
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
                    this.f28191w = ofFloat;
                    ofFloat.addUpdateListener(new j6(this, 18));
                    this.f28191w.setInterpolator(jr.h);
                    this.f28191w.setDuration(250L);
                    this.f28191w.start();
                    return;
                }
                if (z10) {
                    f9 = 1.0f;
                } else {
                    f9 = 0.0f;
                }
                this.v = f9;
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
        float f9;
        if (this.h) {
            f9 = 42.0f;
        } else {
            f9 = 56.0f;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f9), 1073741824));
    }
}
