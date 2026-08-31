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
public abstract class o30 extends org.telegram.ui.ActionBar.h3 {
    public final m2.h f29660b;
    public final l30 f29661c;
    public final LinearLayout d;
    public final TextView[] f29662e;
    public float f29663f;
    public int h;

    public o30(Context context, TLRPC.Chat chat, boolean z4) {
        super(context, false);
        int i10;
        int i11;
        int i12;
        int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21705fg, false);
        this.shadowDrawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
        j30 j30Var = new j30(this, context);
        this.containerView = j30Var;
        j30Var.setWillNotDraw(false);
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
        org.telegram.messenger.y3.t(textView, -1, 1, 20.0f);
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
        viewGroup2.addView(textView, k7.c6.d(-2, -2.0f, i11 | 48, 24.0f, 29.0f, 24.0f, 0.0f));
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
        this.containerView.addView(textView2, k7.c6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 62.0f, 24.0f, 0.0f));
        this.f29662e = new TextView[3];
        m2.h hVar = new m2.h(context);
        this.f29660b = hVar;
        hVar.setClipChildren(false);
        hVar.setOffscreenPageLimit(4);
        hVar.setClipToPadding(false);
        AndroidUtilities.setViewPagerEdgeEffectColor(hVar, 2130706432);
        hVar.setAdapter(new n30(this));
        hVar.setPageMargin(0);
        this.containerView.addView(hVar, k7.c6.d(-1, -1.0f, 1, 0.0f, 100.0f, 0.0f, 130.0f));
        hVar.b(new k30(this));
        View view = new View(getContext());
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.LEFT_RIGHT;
        view.setBackground(new GradientDrawable(orientation, new int[]{w02, 0}));
        this.containerView.addView(view, k7.c6.d(120, -1.0f, 51, 0.0f, 100.0f, 0.0f, 130.0f));
        View view2 = new View(getContext());
        view2.setBackground(new GradientDrawable(orientation, new int[]{0, w02}));
        this.containerView.addView(view2, k7.c6.d(120, -1.0f, 53, 0.0f, 100.0f, 0.0f, 130.0f));
        l30 l30Var = new l30(this, getContext());
        this.f29661c = l30Var;
        l30Var.setMinWidth(AndroidUtilities.dp(64.0f));
        l30Var.setTag(-1);
        l30Var.setTextSize(1, 14.0f);
        int i14 = org.telegram.ui.ActionBar.k6.f21848ng;
        l30Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i14, false));
        l30Var.setGravity(17);
        l30Var.setTypeface(AndroidUtilities.bold());
        l30Var.setText(LocaleController.getString(R.string.VoipRecordStart));
        if (Build.VERSION.SDK_INT >= 23) {
            int dp = AndroidUtilities.dp(6.0f);
            int k10 = i0.a.k(org.telegram.ui.ActionBar.k6.w0(null, i14, false), 76);
            l30Var.setForeground(org.telegram.ui.ActionBar.k6.i0(dp, dp, dp, dp, 0, k10, k10));
        }
        l30Var.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
        l30Var.setOnClickListener(new g0(this, 23));
        this.containerView.addView(l30Var, k7.c6.d(-1, 48.0f, 80, 0.0f, 0.0f, 0.0f, 64.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        this.containerView.addView(linearLayout, k7.c6.e(-2, 64, 80));
        int i15 = 0;
        while (true) {
            TextView[] textViewArr = this.f29662e;
            if (i15 >= textViewArr.length) {
                break;
            }
            textViewArr[i15] = new TextView(context);
            this.f29662e[i15].setTextSize(1, 12.0f);
            this.f29662e[i15].setTextColor(-1);
            this.f29662e[i15].setTypeface(AndroidUtilities.bold());
            this.f29662e[i15].setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            this.f29662e[i15].setGravity(16);
            this.f29662e[i15].setSingleLine(true);
            this.d.addView(this.f29662e[i15], k7.c6.n(-2, -1));
            if (i15 == 0) {
                this.f29662e[i15].setText(LocaleController.getString(R.string.VoipRecordAudio));
            } else if (i15 == 1) {
                this.f29662e[i15].setText(LocaleController.getString(R.string.VoipRecordPortrait));
            } else {
                this.f29662e[i15].setText(LocaleController.getString(R.string.VoipRecordLandscape));
            }
            this.f29662e[i15].setOnClickListener(new mh.x0(this, i15, 6));
            i15++;
        }
        if (z4) {
            this.f29660b.setCurrentItem(1);
        }
    }

    public static void m(o30 o30Var) {
        TextView textView;
        TextView[] textViewArr = o30Var.f29662e;
        int i10 = o30Var.h;
        TextView textView2 = textViewArr[i10];
        if (i10 < textViewArr.length - 1) {
            textView = textViewArr[i10 + 1];
        } else {
            textView = null;
        }
        o30Var.containerView.getMeasuredWidth();
        float measuredWidth = (textView2.getMeasuredWidth() / 2) + textView2.getLeft();
        float measuredWidth2 = (o30Var.containerView.getMeasuredWidth() / 2) - measuredWidth;
        if (textView != null) {
            measuredWidth2 -= (((textView.getMeasuredWidth() / 2) + textView.getLeft()) - measuredWidth) * o30Var.f29663f;
        }
        for (int i11 = 0; i11 < textViewArr.length; i11++) {
            int i12 = o30Var.h;
            float f10 = 0.9f;
            float f11 = 0.7f;
            if (i11 >= i12 && i11 <= i12 + 1) {
                if (i11 == i12) {
                    float f12 = o30Var.f29663f;
                    f11 = 1.0f - (0.3f * f12);
                    f10 = 1.0f - (f12 * 0.1f);
                } else {
                    float f13 = o30Var.f29663f;
                    f11 = 0.7f + (0.3f * f13);
                    f10 = 0.9f + (f13 * 0.1f);
                }
            }
            textViewArr[i11].setAlpha(f11);
            textViewArr[i11].setScaleX(f10);
            textViewArr[i11].setScaleY(f10);
        }
        o30Var.d.setTranslationX(measuredWidth2);
        o30Var.f29661c.invalidate();
    }

    public abstract void n(int i10);
}
