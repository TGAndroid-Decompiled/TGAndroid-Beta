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

public abstract class z20 extends org.telegram.ui.ActionBar.e3 {

    public final m2.g f35135b;

    public final w20 f35136c;
    public final LinearLayout d;

    public final TextView[] f35137e;

    public float f35138f;
    public int h;

    public z20(Context context, TLRPC.Chat chat, boolean z10) {
        super(context, false);
        int iW0 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23099fg, false);
        this.shadowDrawable.setColorFilter(new PorterDuffColorFilter(iW0, PorterDuff.Mode.MULTIPLY));
        u20 u20Var = new u20(this, context);
        this.containerView = u20Var;
        u20Var.setWillNotDraw(false);
        this.containerView.setClipChildren(false);
        this.containerView.setBackgroundDrawable(this.shadowDrawable);
        ViewGroup viewGroup = this.containerView;
        int i10 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i10, 0, i10, 0);
        TextView textView = new TextView(getContext());
        if (ChatObject.isChannelOrGiga(chat)) {
            textView.setText(LocaleController.getString(R.string.VoipChannelRecordVoiceChat));
        } else {
            textView.setText(LocaleController.getString(R.string.VoipRecordVoiceChat));
        }
        org.telegram.messenger.y1.s(textView, -1, 1, 20.0f);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        this.containerView.addView(textView, h7.z5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 29.0f, 24.0f, 0.0f));
        TextView textView2 = new TextView(getContext());
        textView2.setText(LocaleController.getString(R.string.VoipRecordVoiceChatInfo));
        textView2.setTextColor(-1);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        this.containerView.addView(textView2, h7.z5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 62.0f, 24.0f, 0.0f));
        this.f35137e = new TextView[3];
        m2.g gVar = new m2.g(context);
        this.f35135b = gVar;
        gVar.setClipChildren(false);
        gVar.setOffscreenPageLimit(4);
        gVar.setClipToPadding(false);
        AndroidUtilities.setViewPagerEdgeEffectColor(gVar, 2130706432);
        gVar.setAdapter(new y20(this));
        gVar.setPageMargin(0);
        this.containerView.addView(gVar, h7.z5.d(-1, -1.0f, 1, 0.0f, 100.0f, 0.0f, 130.0f));
        gVar.b(new v20(this));
        View view = new View(getContext());
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.LEFT_RIGHT;
        view.setBackground(new GradientDrawable(orientation, new int[]{iW0, 0}));
        this.containerView.addView(view, h7.z5.d(120, -1.0f, 51, 0.0f, 100.0f, 0.0f, 130.0f));
        View view2 = new View(getContext());
        view2.setBackground(new GradientDrawable(orientation, new int[]{0, iW0}));
        this.containerView.addView(view2, h7.z5.d(120, -1.0f, 53, 0.0f, 100.0f, 0.0f, 130.0f));
        w20 w20Var = new w20(this, getContext());
        this.f35136c = w20Var;
        w20Var.setMinWidth(AndroidUtilities.dp(64.0f));
        w20Var.setTag(-1);
        w20Var.setTextSize(1, 14.0f);
        int i11 = org.telegram.ui.ActionBar.g6.f23242ng;
        w20Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        w20Var.setGravity(17);
        w20Var.setTypeface(AndroidUtilities.bold());
        w20Var.setText(LocaleController.getString(R.string.VoipRecordStart));
        if (Build.VERSION.SDK_INT >= 23) {
            int iDp = AndroidUtilities.dp(6.0f);
            int iK = i0.b.k(org.telegram.ui.ActionBar.g6.w0(null, i11, false), 76);
            w20Var.setForeground(org.telegram.ui.ActionBar.g6.i0(iDp, iDp, iDp, iDp, 0, iK, iK));
        }
        w20Var.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
        w20Var.setOnClickListener(new f0(this, 23));
        this.containerView.addView(w20Var, h7.z5.d(-1, 48.0f, 80, 0.0f, 0.0f, 0.0f, 64.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        this.containerView.addView(linearLayout, h7.z5.e(-2, 64, 80));
        int i12 = 0;
        while (true) {
            TextView[] textViewArr = this.f35137e;
            if (i12 >= textViewArr.length) {
                break;
            }
            textViewArr[i12] = new TextView(context);
            this.f35137e[i12].setTextSize(1, 12.0f);
            this.f35137e[i12].setTextColor(-1);
            this.f35137e[i12].setTypeface(AndroidUtilities.bold());
            this.f35137e[i12].setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            this.f35137e[i12].setGravity(16);
            this.f35137e[i12].setSingleLine(true);
            this.d.addView(this.f35137e[i12], h7.z5.n(-2, -1));
            if (i12 == 0) {
                this.f35137e[i12].setText(LocaleController.getString(R.string.VoipRecordAudio));
            } else if (i12 == 1) {
                this.f35137e[i12].setText(LocaleController.getString(R.string.VoipRecordPortrait));
            } else {
                this.f35137e[i12].setText(LocaleController.getString(R.string.VoipRecordLandscape));
            }
            this.f35137e[i12].setOnClickListener(new hh.z0(this, i12, 8));
            i12++;
        }
        if (z10) {
            this.f35135b.setCurrentItem(1);
        }
    }

    public static void m(z20 z20Var) {
        TextView[] textViewArr = z20Var.f35137e;
        int i10 = z20Var.h;
        TextView textView = textViewArr[i10];
        TextView textView2 = i10 < textViewArr.length + (-1) ? textViewArr[i10 + 1] : null;
        z20Var.containerView.getMeasuredWidth();
        float measuredWidth = (textView.getMeasuredWidth() / 2) + textView.getLeft();
        float measuredWidth2 = (z20Var.containerView.getMeasuredWidth() / 2) - measuredWidth;
        if (textView2 != null) {
            measuredWidth2 -= (((textView2.getMeasuredWidth() / 2) + textView2.getLeft()) - measuredWidth) * z20Var.f35138f;
        }
        for (int i11 = 0; i11 < textViewArr.length; i11++) {
            int i12 = z20Var.h;
            float f10 = 0.9f;
            float f11 = 0.7f;
            if (i11 >= i12 && i11 <= i12 + 1) {
                if (i11 == i12) {
                    float f12 = z20Var.f35138f;
                    f11 = 1.0f - (0.3f * f12);
                    f10 = 1.0f - (f12 * 0.1f);
                } else {
                    float f13 = z20Var.f35138f;
                    f11 = 0.7f + (0.3f * f13);
                    f10 = 0.9f + (f13 * 0.1f);
                }
            }
            textViewArr[i11].setAlpha(f11);
            textViewArr[i11].setScaleX(f10);
            textViewArr[i11].setScaleY(f10);
        }
        z20Var.d.setTranslationX(measuredWidth2);
        z20Var.f35136c.invalidate();
    }

    public abstract void n(int i10);
}
