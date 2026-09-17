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
public final class nv extends FrameLayout {
    public final c90 f26544a;
    public final TextView f26545b;
    public final TextView f26546c;
    public final TextView d;
    public final rg.p0 e;
    public final org.telegram.ui.ActionBar.w0 f26547f;
    public final boolean h;
    public final ai.y3 f26548n;
    public TLRPC.TL_messages_stickerSet f26549r;
    public boolean f26550s;
    public float v;
    public ValueAnimator f26551w;
    public final sv f26552x;

    public nv(sv svVar, Context context, boolean z10) {
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
        this.f26552x = svVar;
        this.f26548n = new ai.y3(this, 5);
        this.f26550s = false;
        this.v = 0.0f;
        this.h = z10;
        if (!z10) {
            i11 = ((org.telegram.ui.ActionBar.g3) svVar).currentAccount;
            float f12 = 8.0f;
            if (!UserConfig.getInstance(i11).isPremium()) {
                f11 = 16.0f;
                int dp = AndroidUtilities.dp(4.0f);
                f10 = 28.0f;
                f6Var4 = ((org.telegram.ui.ActionBar.g3) svVar).resourcesProvider;
                rg.p0 p0Var = new rg.p0(dp, context, f6Var4, false);
                this.e = p0Var;
                p0Var.a(LocaleController.getString(R.string.Unlock), new View.OnClickListener(this) {
                    public final nv f25694b;

                    {
                        this.f25694b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        int i12 = r2;
                        nv nvVar = this.f25694b;
                        switch (i12) {
                            case 0:
                                sv svVar2 = nvVar.f26552x;
                                svVar2.Q = SystemClock.elapsedRealtime();
                                svVar2.Z();
                                return;
                            case 1:
                                sv.W(nvVar.f26548n, nvVar.f26549r, true, null, null);
                                nvVar.a(true, true);
                                return;
                            case 2:
                                ai.y3 y3Var = nvVar.f26548n;
                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = nvVar.f26549r;
                                xp xpVar = new xp(nvVar, 12);
                                Pattern pattern = sv.V;
                                if (y3Var != null && tL_messages_stickerSet != null && y3Var.getFragmentView() != null) {
                                    MediaDataController.getInstance(y3Var.getCurrentAccount()).toggleStickerSet(y3Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, y3Var, true, true, xpVar, true);
                                }
                                nvVar.a(false, true);
                                return;
                            default:
                                nvVar.f26547f.M(null, null);
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
            this.f26546c = textView;
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextColor(svVar.getThemedColor(org.telegram.ui.ActionBar.j6.Sh));
            int i12 = org.telegram.ui.ActionBar.j6.Oh;
            textView.setBackground(org.telegram.ui.ActionBar.z5.e(new float[]{14.0f}, svVar.getThemedColor(i12)));
            textView.setPadding(org.telegram.ui.Cells.p6.b(18.0f, R.string.Add, textView), 0, AndroidUtilities.dp(18.0f), 0);
            textView.setGravity(17);
            textView.setOnClickListener(new View.OnClickListener(this) {
                public final nv f25694b;

                {
                    this.f25694b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i122 = r2;
                    nv nvVar = this.f25694b;
                    switch (i122) {
                        case 0:
                            sv svVar2 = nvVar.f26552x;
                            svVar2.Q = SystemClock.elapsedRealtime();
                            svVar2.Z();
                            return;
                        case 1:
                            sv.W(nvVar.f26548n, nvVar.f26549r, true, null, null);
                            nvVar.a(true, true);
                            return;
                        case 2:
                            ai.y3 y3Var = nvVar.f26548n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = nvVar.f26549r;
                            xp xpVar = new xp(nvVar, 12);
                            Pattern pattern = sv.V;
                            if (y3Var != null && tL_messages_stickerSet != null && y3Var.getFragmentView() != null) {
                                MediaDataController.getInstance(y3Var.getCurrentAccount()).toggleStickerSet(y3Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, y3Var, true, true, xpVar, true);
                            }
                            nvVar.a(false, true);
                            return;
                        default:
                            nvVar.f26547f.M(null, null);
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
            textView2.setTextColor(svVar.getThemedColor(i12));
            textView2.setBackground(org.telegram.ui.ActionBar.j6.Y(svVar.getThemedColor(i12) & 268435455, 4, 4));
            textView2.setPadding(org.telegram.ui.Cells.p6.b(12.0f, R.string.StickersRemove, textView2), 0, AndroidUtilities.dp(12.0f), 0);
            textView2.setGravity(17);
            textView2.setOnClickListener(new View.OnClickListener(this) {
                public final nv f25694b;

                {
                    this.f25694b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i122 = r2;
                    nv nvVar = this.f25694b;
                    switch (i122) {
                        case 0:
                            sv svVar2 = nvVar.f26552x;
                            svVar2.Q = SystemClock.elapsedRealtime();
                            svVar2.Z();
                            return;
                        case 1:
                            sv.W(nvVar.f26548n, nvVar.f26549r, true, null, null);
                            nvVar.a(true, true);
                            return;
                        case 2:
                            ai.y3 y3Var = nvVar.f26548n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = nvVar.f26549r;
                            xp xpVar = new xp(nvVar, 12);
                            Pattern pattern = sv.V;
                            if (y3Var != null && tL_messages_stickerSet != null && y3Var.getFragmentView() != null) {
                                MediaDataController.getInstance(y3Var.getCurrentAccount()).toggleStickerSet(y3Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, y3Var, true, true, xpVar, true);
                            }
                            nvVar.a(false, true);
                            return;
                        default:
                            nvVar.f26547f.M(null, null);
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
        f6Var = ((org.telegram.ui.ActionBar.g3) svVar).resourcesProvider;
        c90 c90Var = new c90(context, f6Var);
        this.f26544a = c90Var;
        c90Var.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        c90Var.setTypeface(AndroidUtilities.bold());
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        c90Var.setEllipsize(truncateAt);
        c90Var.setSingleLine(true);
        c90Var.setLines(1);
        int i13 = org.telegram.ui.ActionBar.j6.J6;
        f6Var2 = ((org.telegram.ui.ActionBar.g3) svVar).resourcesProvider;
        c90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i13, f6Var2));
        c90Var.setTextColor(svVar.getThemedColor(org.telegram.ui.ActionBar.j6.f18969j5));
        if (z10) {
            c90Var.setTextSize(1, 20.0f);
            addView(c90Var, w7.x5.i(-1.0f, -2.0f, 8388659, 12.0f, 11.0f, f7, 0.0f));
        } else {
            c90Var.setTextSize(1, 17.0f);
            addView(c90Var, w7.x5.i(-1.0f, -2.0f, 8388659, 6.0f, 10.0f, f7, 0.0f));
        }
        if (!z10) {
            TextView textView3 = new TextView(context);
            this.f26545b = textView3;
            textView3.setTextSize(1, 13.0f);
            textView3.setTextColor(svVar.getThemedColor(org.telegram.ui.ActionBar.j6.f19099q5));
            textView3.setEllipsize(truncateAt);
            textView3.setSingleLine(true);
            textView3.setLines(1);
            addView(textView3, w7.x5.i(-1.0f, -2.0f, 8388659, 8.0f, 31.66f, f7, 0.0f));
        }
        if (z10) {
            int themedColor = svVar.getThemedColor(org.telegram.ui.ActionBar.j6.Ji);
            f6Var3 = ((org.telegram.ui.ActionBar.g3) svVar).resourcesProvider;
            org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(context, null, 0, themedColor, false, f6Var3);
            this.f26547f = w0Var;
            w0Var.setLongClickEnabled(false);
            w0Var.setSubMenuOpenSide(2);
            w0Var.setIcon(R.drawable.ic_ab_other);
            w0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(svVar.getThemedColor(org.telegram.ui.ActionBar.j6.Ni), 1, -1));
            i10 = ((org.telegram.ui.ActionBar.g3) svVar).backgroundPaddingLeft;
            addView(w0Var, w7.x5.d(40, 40.0f, 53, 0.0f, 5.0f, 5.0f - (i10 / AndroidUtilities.density), 0.0f));
            w0Var.e(1, R.drawable.msg_share, LocaleController.getString(R.string.StickersShare));
            w0Var.e(2, R.drawable.msg_link, LocaleController.getString(R.string.CopyLink));
            w0Var.setOnClickListener(new View.OnClickListener(this) {
                public final nv f25694b;

                {
                    this.f25694b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i122 = r2;
                    nv nvVar = this.f25694b;
                    switch (i122) {
                        case 0:
                            sv svVar2 = nvVar.f26552x;
                            svVar2.Q = SystemClock.elapsedRealtime();
                            svVar2.Z();
                            return;
                        case 1:
                            sv.W(nvVar.f26548n, nvVar.f26549r, true, null, null);
                            nvVar.a(true, true);
                            return;
                        case 2:
                            ai.y3 y3Var = nvVar.f26548n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = nvVar.f26549r;
                            xp xpVar = new xp(nvVar, 12);
                            Pattern pattern = sv.V;
                            if (y3Var != null && tL_messages_stickerSet != null && y3Var.getFragmentView() != null) {
                                MediaDataController.getInstance(y3Var.getCurrentAccount()).toggleStickerSet(y3Var.getFragmentView().getContext(), tL_messages_stickerSet, 0, y3Var, true, true, xpVar, true);
                            }
                            nvVar.a(false, true);
                            return;
                        default:
                            nvVar.f26547f.M(null, null);
                            return;
                    }
                }
            });
            w0Var.setDelegate(new lv(svVar, 0));
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
        if (this.f26550s != z10) {
            this.f26550s = z10;
            ValueAnimator valueAnimator = this.f26551w;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f26551w = null;
            }
            TextView textView2 = this.f26546c;
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
                    this.f26551w = ofFloat;
                    ofFloat.addUpdateListener(new i6(this, 18));
                    this.f26551w.setInterpolator(qr.h);
                    this.f26551w.setDuration(250L);
                    this.f26551w.start();
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
