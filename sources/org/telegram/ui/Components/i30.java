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
public abstract class i30 extends org.telegram.ui.ActionBar.f3 {
    public final m2.g f29306b;
    public final f30 f29307c;
    public final LinearLayout d;
    public final TextView[] f29308e;
    public float f29309f;
    public int h;

    public i30(Context context, TLRPC.Chat chat, boolean z10) {
        super(context, false);
        int i10;
        int i11;
        int i12;
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23108fg, false);
        this.shadowDrawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
        d30 d30Var = new d30(this, context);
        this.containerView = d30Var;
        d30Var.setWillNotDraw(false);
        this.containerView.setClipChildren(false);
        this.containerView.setBackgroundDrawable(this.shadowDrawable);
        ViewGroup viewGroup = this.containerView;
        int i13 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i13, 0, i13, 0);
        TextView textView = new TextView(getContext());
        if (ChatObject.isChannelOrGiga(chat)) {
            textView.setText(LocaleController.getString(R.string.VoipChannelRecordVoiceChat));
        } else {
            textView.setText(LocaleController.getString(R.string.VoipRecordVoiceChat));
        }
        org.telegram.messenger.x3.t(textView, -1, 1, 20.0f);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 48);
        ViewGroup viewGroup2 = this.containerView;
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        viewGroup2.addView(textView, i7.f6.d(-2, -2.0f, i11 | 48, 24.0f, 29.0f, 24.0f, 0.0f));
        TextView textView2 = new TextView(getContext());
        textView2.setText(LocaleController.getString(R.string.VoipRecordVoiceChatInfo));
        textView2.setTextColor(-1);
        textView2.setTextSize(1, 14.0f);
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        textView2.setGravity(i12 | 48);
        this.containerView.addView(textView2, i7.f6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 62.0f, 24.0f, 0.0f));
        this.f29308e = new TextView[3];
        m2.g gVar = new m2.g(context);
        this.f29306b = gVar;
        gVar.setClipChildren(false);
        gVar.setOffscreenPageLimit(4);
        gVar.setClipToPadding(false);
        AndroidUtilities.setViewPagerEdgeEffectColor(gVar, 2130706432);
        gVar.setAdapter(new h30(this));
        gVar.setPageMargin(0);
        this.containerView.addView(gVar, i7.f6.d(-1, -1.0f, 1, 0.0f, 100.0f, 0.0f, 130.0f));
        gVar.b(new e30(this));
        View view = new View(getContext());
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.LEFT_RIGHT;
        view.setBackground(new GradientDrawable(orientation, new int[]{w02, 0}));
        this.containerView.addView(view, i7.f6.d(120, -1.0f, 51, 0.0f, 100.0f, 0.0f, 130.0f));
        View view2 = new View(getContext());
        view2.setBackground(new GradientDrawable(orientation, new int[]{0, w02}));
        this.containerView.addView(view2, i7.f6.d(120, -1.0f, 53, 0.0f, 100.0f, 0.0f, 130.0f));
        f30 f30Var = new f30(this, getContext());
        this.f29307c = f30Var;
        f30Var.setMinWidth(AndroidUtilities.dp(64.0f));
        f30Var.setTag(-1);
        f30Var.setTextSize(1, 14.0f);
        int i14 = org.telegram.ui.ActionBar.g6.f23251ng;
        f30Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i14, false));
        f30Var.setGravity(17);
        f30Var.setTypeface(AndroidUtilities.bold());
        f30Var.setText(LocaleController.getString(R.string.VoipRecordStart));
        if (Build.VERSION.SDK_INT >= 23) {
            int dp = AndroidUtilities.dp(6.0f);
            int k9 = i0.a.k(org.telegram.ui.ActionBar.g6.w0(null, i14, false), 76);
            f30Var.setForeground(org.telegram.ui.ActionBar.g6.i0(dp, dp, dp, dp, 0, k9, k9));
        }
        f30Var.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
        f30Var.setOnClickListener(new h0(this, 23));
        this.containerView.addView(f30Var, i7.f6.d(-1, 48.0f, 80, 0.0f, 0.0f, 0.0f, 64.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        this.containerView.addView(linearLayout, i7.f6.e(-2, 64, 80));
        int i15 = 0;
        while (true) {
            TextView[] textViewArr = this.f29308e;
            if (i15 >= textViewArr.length) {
                break;
            }
            textViewArr[i15] = new TextView(context);
            this.f29308e[i15].setTextSize(1, 12.0f);
            this.f29308e[i15].setTextColor(-1);
            this.f29308e[i15].setTypeface(AndroidUtilities.bold());
            this.f29308e[i15].setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            this.f29308e[i15].setGravity(16);
            this.f29308e[i15].setSingleLine(true);
            this.d.addView(this.f29308e[i15], i7.f6.n(-2, -1));
            if (i15 == 0) {
                this.f29308e[i15].setText(LocaleController.getString(R.string.VoipRecordAudio));
            } else if (i15 == 1) {
                this.f29308e[i15].setText(LocaleController.getString(R.string.VoipRecordPortrait));
            } else {
                this.f29308e[i15].setText(LocaleController.getString(R.string.VoipRecordLandscape));
            }
            this.f29308e[i15].setOnClickListener(new jh.y0(this, i15, 8));
            i15++;
        }
        if (z10) {
            this.f29306b.setCurrentItem(1);
        }
    }

    public static void m(i30 i30Var) {
        TextView textView;
        TextView[] textViewArr = i30Var.f29308e;
        int i10 = i30Var.h;
        TextView textView2 = textViewArr[i10];
        if (i10 < textViewArr.length - 1) {
            textView = textViewArr[i10 + 1];
        } else {
            textView = null;
        }
        i30Var.containerView.getMeasuredWidth();
        float measuredWidth = (textView2.getMeasuredWidth() / 2) + textView2.getLeft();
        float measuredWidth2 = (i30Var.containerView.getMeasuredWidth() / 2) - measuredWidth;
        if (textView != null) {
            measuredWidth2 -= (((textView.getMeasuredWidth() / 2) + textView.getLeft()) - measuredWidth) * i30Var.f29309f;
        }
        for (int i11 = 0; i11 < textViewArr.length; i11++) {
            int i12 = i30Var.h;
            float f9 = 0.9f;
            float f10 = 0.7f;
            if (i11 >= i12 && i11 <= i12 + 1) {
                if (i11 == i12) {
                    float f11 = i30Var.f29309f;
                    f10 = 1.0f - (0.3f * f11);
                    f9 = 1.0f - (f11 * 0.1f);
                } else {
                    float f12 = i30Var.f29309f;
                    f10 = 0.7f + (0.3f * f12);
                    f9 = 0.9f + (f12 * 0.1f);
                }
            }
            textViewArr[i11].setAlpha(f10);
            textViewArr[i11].setScaleX(f9);
            textViewArr[i11].setScaleY(f9);
        }
        i30Var.d.setTranslationX(measuredWidth2);
        i30Var.f29307c.invalidate();
    }

    public abstract void n(int i10);
}
