package org.telegram.ui;

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class e00 extends org.telegram.ui.Cells.j4 {

    public final TextView f37580r;

    public final hh.ca f37581s;
    public int v;

    public final org.telegram.ui.Components.b5 f37582w;

    public boolean f37583x;

    public final q00 f37584y;

    public e00(q00 q00Var, Context context) {
        super(context, org.telegram.ui.ActionBar.g6.L6, 22, 15, false, ((org.telegram.ui.ActionBar.n2) q00Var).resourceProvider);
        this.f37584y = q00Var;
        TextView textView = new TextView(getContext());
        this.f37580r = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(q00Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23441z6));
        org.telegram.messenger.rl.i(q00Var.getUserConfig().isPremium() ? R.string.FolderTagNoColor : R.string.FolderTagNoColorPremium, textView, 5);
        int i10 = (LocaleController.isRTL ? 3 : 5) | 48;
        float f10 = this.f24526b;
        addView(textView, h7.z5.d(-1, -1.0f, i10, f10, 16.66f, f10, this.f24527c));
        textView.setAlpha(0.0f);
        hh.ca caVar = new hh.ca(this, getContext());
        this.f37581s = caVar;
        this.f37582w = new org.telegram.ui.Components.b5(caVar, 320L, org.telegram.ui.Components.er.h, 0);
        caVar.setTextSize(AndroidUtilities.dp(10.0f));
        caVar.setTypeface(AndroidUtilities.bold());
        caVar.setGravity(5);
        caVar.setPadding(AndroidUtilities.dp(4.66f), 0, AndroidUtilities.dp(4.66f), 0);
        int i11 = LocaleController.isRTL ? 3 : 5;
        float f11 = this.f24526b;
        addView(caVar, h7.z5.d(-1, -1.0f, i11 | 48, f11, 16.66f, f11, this.f24527c));
    }

    public final void d(int i10, boolean z10) {
        q00 q00Var = this.f37584y;
        String string = LocaleController.getString(q00Var.getUserConfig().isPremium() ? R.string.FolderTagNoColor : R.string.FolderTagNoColorPremium);
        TextView textView = this.f37580r;
        textView.setText(string);
        int themedColor = 0;
        boolean z11 = i10 < 0;
        if (!z11) {
            int[] iArr = org.telegram.ui.ActionBar.g6.f23303r8;
            themedColor = q00Var.getThemedColor(iArr[i10 % iArr.length]);
        }
        this.v = themedColor;
        hh.ca caVar = this.f37581s;
        if (!z11) {
            caVar.setEmojiColor(themedColor);
        }
        if (!z10) {
            this.f37582w.a(this.v, true);
        }
        if (z11 != this.f37583x) {
            this.f37583x = z11;
            ViewPropertyAnimator duration = textView.animate().alpha(z11 ? 1.0f : 0.0f).setDuration(320L);
            org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.h;
            duration.setInterpolator(erVar).start();
            caVar.animate().alpha(z11 ? 0.0f : 1.0f).setDuration(320L).setInterpolator(erVar).start();
        }
    }

    public final void e(CharSequence charSequence, boolean z10) {
        if (charSequence == null) {
            charSequence = "";
        }
        boolean z11 = false;
        if (charSequence.length() > 12) {
            charSequence = charSequence.subSequence(0, 12);
        }
        hh.ca caVar = this.f37581s;
        CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(charSequence, caVar.getPaint().getFontMetricsInt(), false);
        if (z10 && !LocaleController.isRTL) {
            z11 = true;
        }
        caVar.c(charSequenceReplaceEmoji, z11, true);
    }
}
