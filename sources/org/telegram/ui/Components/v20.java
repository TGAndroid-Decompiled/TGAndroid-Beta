package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public abstract class v20 extends org.telegram.ui.ActionBar.f3 {
    public final m2.g f33239b;
    public final s20 f33240c;
    public final LinearLayout d;
    public final TextView[] f33241e;
    public float f33242f;
    public int h;

    public v20(Context context, TLRPC.Chat chat, boolean z10) {
        super(context, false);
        int i9;
        int i10;
        int i11;
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23046fg, false);
        this.shadowDrawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
        q20 q20Var = new q20(this, context);
        this.containerView = q20Var;
        q20Var.setWillNotDraw(false);
        this.containerView.setClipChildren(false);
        this.containerView.setBackgroundDrawable(this.shadowDrawable);
        ViewGroup viewGroup = this.containerView;
        int i12 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i12, 0, i12, 0);
        TextView textView = new TextView(getContext());
        if (ChatObject.isChannelOrGiga(chat)) {
            textView.setText(LocaleController.getString(R.string.VoipChannelRecordVoiceChat));
        } else {
            textView.setText(LocaleController.getString(R.string.VoipRecordVoiceChat));
        }
        org.telegram.messenger.l0.q(textView, -1, 1, 20.0f);
        if (LocaleController.isRTL) {
            i9 = 5;
        } else {
            i9 = 3;
        }
        textView.setGravity(i9 | 48);
        ViewGroup viewGroup2 = this.containerView;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        viewGroup2.addView(textView, g7.e6.d(-2, -2.0f, i10 | 48, 24.0f, 29.0f, 24.0f, 0.0f));
        TextView textView2 = new TextView(getContext());
        textView2.setText(LocaleController.getString(R.string.VoipRecordVoiceChatInfo));
        textView2.setTextColor(-1);
        textView2.setTextSize(1, 14.0f);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        textView2.setGravity(i11 | 48);
        this.containerView.addView(textView2, g7.e6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 62.0f, 24.0f, 0.0f));
        this.f33241e = new TextView[3];
        m2.g gVar = new m2.g(context);
        this.f33239b = gVar;
        gVar.setClipChildren(false);
        gVar.setOffscreenPageLimit(4);
        gVar.setClipToPadding(false);
        AndroidUtilities.setViewPagerEdgeEffectColor(gVar, 2130706432);
        gVar.setAdapter(new u20(this));
        gVar.setPageMargin(0);
        this.containerView.addView(gVar, g7.e6.d(-1, -1.0f, 1, 0.0f, 100.0f, 0.0f, 130.0f));
        gVar.b(new r20(this));
        View view = new View(getContext());
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.LEFT_RIGHT;
        view.setBackground(new GradientDrawable(orientation, new int[]{w02, 0}));
        this.containerView.addView(view, g7.e6.d(120, -1.0f, 51, 0.0f, 100.0f, 0.0f, 130.0f));
        View view2 = new View(getContext());
        view2.setBackground(new GradientDrawable(orientation, new int[]{0, w02}));
        this.containerView.addView(view2, g7.e6.d(120, -1.0f, 53, 0.0f, 100.0f, 0.0f, 130.0f));
        s20 s20Var = new s20(this, getContext());
        this.f33240c = s20Var;
        s20Var.setMinWidth(AndroidUtilities.dp(64.0f));
        s20Var.setTag(-1);
        s20Var.setTextSize(1, 14.0f);
        int i13 = org.telegram.ui.ActionBar.f6.f23188ng;
        s20Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i13, false));
        s20Var.setGravity(17);
        s20Var.setTypeface(AndroidUtilities.bold());
        s20Var.setText(LocaleController.getString(R.string.VoipRecordStart));
        if (Build.VERSION.SDK_INT >= 23) {
            int dp = AndroidUtilities.dp(6.0f);
            int k10 = i0.a.k(org.telegram.ui.ActionBar.f6.w0(null, i13, false), 76);
            s20Var.setForeground(org.telegram.ui.ActionBar.f6.i0(dp, dp, dp, dp, 0, k10, k10));
        }
        s20Var.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
        s20Var.setOnClickListener(new f0(this, 23));
        this.containerView.addView(s20Var, g7.e6.d(-1, 48.0f, 80, 0.0f, 0.0f, 0.0f, 64.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        this.containerView.addView(linearLayout, g7.e6.e(-2, 64, 80));
        int i14 = 0;
        while (true) {
            TextView[] textViewArr = this.f33241e;
            if (i14 >= textViewArr.length) {
                break;
            }
            textViewArr[i14] = new TextView(context);
            this.f33241e[i14].setTextSize(1, 12.0f);
            this.f33241e[i14].setTextColor(-1);
            this.f33241e[i14].setTypeface(AndroidUtilities.bold());
            this.f33241e[i14].setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            this.f33241e[i14].setGravity(16);
            this.f33241e[i14].setSingleLine(true);
            this.d.addView(this.f33241e[i14], g7.e6.n(-2, -1));
            if (i14 == 0) {
                this.f33241e[i14].setText(LocaleController.getString(R.string.VoipRecordAudio));
            } else if (i14 == 1) {
                this.f33241e[i14].setText(LocaleController.getString(R.string.VoipRecordPortrait));
            } else {
                this.f33241e[i14].setText(LocaleController.getString(R.string.VoipRecordLandscape));
            }
            this.f33241e[i14].setOnClickListener(new gh.z0(this, i14, 8));
            i14++;
        }
        if (z10) {
            this.f33239b.setCurrentItem(1);
        }
    }

    public static void m(v20 v20Var) {
        TextView textView;
        TextView[] textViewArr = v20Var.f33241e;
        int i9 = v20Var.h;
        TextView textView2 = textViewArr[i9];
        if (i9 < textViewArr.length - 1) {
            textView = textViewArr[i9 + 1];
        } else {
            textView = null;
        }
        v20Var.containerView.getMeasuredWidth();
        float measuredWidth = (textView2.getMeasuredWidth() / 2) + textView2.getLeft();
        float measuredWidth2 = (v20Var.containerView.getMeasuredWidth() / 2) - measuredWidth;
        if (textView != null) {
            measuredWidth2 -= (((textView.getMeasuredWidth() / 2) + textView.getLeft()) - measuredWidth) * v20Var.f33242f;
        }
        for (int i10 = 0; i10 < textViewArr.length; i10++) {
            int i11 = v20Var.h;
            float f10 = 0.9f;
            float f11 = 0.7f;
            if (i10 >= i11 && i10 <= i11 + 1) {
                if (i10 == i11) {
                    float f12 = v20Var.f33242f;
                    f11 = 1.0f - (0.3f * f12);
                    f10 = 1.0f - (f12 * 0.1f);
                } else {
                    float f13 = v20Var.f33242f;
                    f11 = 0.7f + (0.3f * f13);
                    f10 = 0.9f + (f13 * 0.1f);
                }
            }
            textViewArr[i10].setAlpha(f11);
            textViewArr[i10].setScaleX(f10);
            textViewArr[i10].setScaleY(f10);
        }
        v20Var.d.setTranslationX(measuredWidth2);
        v20Var.f33240c.invalidate();
    }

    public abstract void n(int i9);
}
