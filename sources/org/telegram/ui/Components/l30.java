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
public abstract class l30 extends org.telegram.ui.ActionBar.f3 {
    public final z4.g f28036b;
    public final i30 f28037c;
    public final LinearLayout d;
    public final TextView[] f28038e;
    public float f28039f;
    public int h;

    public l30(Context context, TLRPC.Chat chat, boolean z10) {
        super(context, false);
        int i10;
        int i11;
        int i12;
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20708fg, false);
        this.shadowDrawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
        g30 g30Var = new g30(this, context);
        this.containerView = g30Var;
        g30Var.setWillNotDraw(false);
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
        org.telegram.messenger.w1.q(textView, -1, 1, 20.0f);
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
        viewGroup2.addView(textView, w7.x5.d(-2, -2.0f, i11 | 48, 24.0f, 29.0f, 24.0f, 0.0f));
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
        this.containerView.addView(textView2, w7.x5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 62.0f, 24.0f, 0.0f));
        this.f28038e = new TextView[3];
        z4.g gVar = new z4.g(context);
        this.f28036b = gVar;
        gVar.setClipChildren(false);
        gVar.setOffscreenPageLimit(4);
        gVar.setClipToPadding(false);
        AndroidUtilities.setViewPagerEdgeEffectColor(gVar, 2130706432);
        gVar.setAdapter(new k30(this));
        gVar.setPageMargin(0);
        this.containerView.addView(gVar, w7.x5.d(-1, -1.0f, 1, 0.0f, 100.0f, 0.0f, 130.0f));
        gVar.b(new h30(this));
        View view = new View(getContext());
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.LEFT_RIGHT;
        view.setBackground(new GradientDrawable(orientation, new int[]{w02, 0}));
        this.containerView.addView(view, w7.x5.d(120, -1.0f, 51, 0.0f, 100.0f, 0.0f, 130.0f));
        View view2 = new View(getContext());
        view2.setBackground(new GradientDrawable(orientation, new int[]{0, w02}));
        this.containerView.addView(view2, w7.x5.d(120, -1.0f, 53, 0.0f, 100.0f, 0.0f, 130.0f));
        i30 i30Var = new i30(this, getContext());
        this.f28037c = i30Var;
        i30Var.setMinWidth(AndroidUtilities.dp(64.0f));
        i30Var.setTag(-1);
        i30Var.setTextSize(1, 14.0f);
        int i14 = org.telegram.ui.ActionBar.j6.f20853ng;
        i30Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
        i30Var.setGravity(17);
        i30Var.setTypeface(AndroidUtilities.bold());
        i30Var.setText(LocaleController.getString(R.string.VoipRecordStart));
        if (Build.VERSION.SDK_INT >= 23) {
            int dp = AndroidUtilities.dp(6.0f);
            int k10 = i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, i14, false), 76);
            i30Var.setForeground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, 0, k10, k10));
        }
        i30Var.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
        i30Var.setOnClickListener(new g0(this, 23));
        this.containerView.addView(i30Var, w7.x5.d(-1, 48.0f, 80, 0.0f, 0.0f, 0.0f, 64.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        this.containerView.addView(linearLayout, w7.x5.e(-2, 64, 80));
        int i15 = 0;
        while (true) {
            TextView[] textViewArr = this.f28038e;
            if (i15 >= textViewArr.length) {
                break;
            }
            textViewArr[i15] = new TextView(context);
            this.f28038e[i15].setTextSize(1, 12.0f);
            this.f28038e[i15].setTextColor(-1);
            this.f28038e[i15].setTypeface(AndroidUtilities.bold());
            this.f28038e[i15].setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            this.f28038e[i15].setGravity(16);
            this.f28038e[i15].setSingleLine(true);
            this.d.addView(this.f28038e[i15], w7.x5.n(-2, -1));
            if (i15 == 0) {
                this.f28038e[i15].setText(LocaleController.getString(R.string.VoipRecordAudio));
            } else if (i15 == 1) {
                this.f28038e[i15].setText(LocaleController.getString(R.string.VoipRecordPortrait));
            } else {
                this.f28038e[i15].setText(LocaleController.getString(R.string.VoipRecordLandscape));
            }
            this.f28038e[i15].setOnClickListener(new di.o4(this, i15, 9));
            i15++;
        }
        if (z10) {
            this.f28036b.setCurrentItem(1);
        }
    }

    public static void m(l30 l30Var) {
        TextView textView;
        TextView[] textViewArr = l30Var.f28038e;
        int i10 = l30Var.h;
        TextView textView2 = textViewArr[i10];
        if (i10 < textViewArr.length - 1) {
            textView = textViewArr[i10 + 1];
        } else {
            textView = null;
        }
        l30Var.containerView.getMeasuredWidth();
        float measuredWidth = (textView2.getMeasuredWidth() / 2) + textView2.getLeft();
        float measuredWidth2 = (l30Var.containerView.getMeasuredWidth() / 2) - measuredWidth;
        if (textView != null) {
            measuredWidth2 -= (((textView.getMeasuredWidth() / 2) + textView.getLeft()) - measuredWidth) * l30Var.f28039f;
        }
        for (int i11 = 0; i11 < textViewArr.length; i11++) {
            int i12 = l30Var.h;
            float f7 = 0.9f;
            float f10 = 0.7f;
            if (i11 >= i12 && i11 <= i12 + 1) {
                if (i11 == i12) {
                    float f11 = l30Var.f28039f;
                    f10 = 1.0f - (0.3f * f11);
                    f7 = 1.0f - (f11 * 0.1f);
                } else {
                    float f12 = l30Var.f28039f;
                    f10 = 0.7f + (0.3f * f12);
                    f7 = 0.9f + (f12 * 0.1f);
                }
            }
            textViewArr[i11].setAlpha(f10);
            textViewArr[i11].setScaleX(f7);
            textViewArr[i11].setScaleY(f7);
        }
        l30Var.d.setTranslationX(measuredWidth2);
        l30Var.f28037c.invalidate();
    }

    public abstract void n(int i10);
}
