package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class i20 extends LinearLayout {
    public final ph.d f25561a;
    public final ph.d f25562b;
    public final ph.d f25563c;
    public final long d;

    public i20(Context context, int i10) {
        super(context);
        int i11;
        TLRPC.TL_emojiList a2 = y8.a(i10);
        setOrientation(1);
        p9 p9Var = new p9(context);
        p9Var.setImageDrawable(new gj0(R.raw.utyan_gallery, AndroidUtilities.dp(110.0f), AndroidUtilities.dp(110.0f)));
        if (!AndroidUtilities.isTablet()) {
            addView(p9Var, k7.b6.q(110, 110, 49));
        }
        TextView g10 = org.telegram.messenger.y3.g(context, 1, 20.0f);
        org.telegram.ui.ai.s(org.telegram.ui.ActionBar.j6.G6, null, false, g10, 1);
        g10.setText(LocaleController.getString(R.string.GalleryAccessAllowAccess));
        g10.setTypeface(AndroidUtilities.bold());
        addView(g10, k7.b6.t(-2, -2, 49, 0, 15, 0, 7));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ai.s(org.telegram.ui.ActionBar.j6.f19864c7, null, false, textView, 1);
        if (UserConfig.getInstance(i10).isPremium()) {
            i11 = R.string.GalleryAccessAllowAccessTextPremium;
        } else {
            i11 = R.string.GalleryAccessAllowAccessTextNonPremium;
        }
        textView.setText(LocaleController.getString(i11));
        textView.setMaxWidth(AndroidUtilities.dp(260.0f));
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView, k7.b6.t(-2, -2, 49, 0, 0, 0, 14));
        ph.d dVar = new ph.d(context, null, true);
        this.f25561a = dVar;
        dVar.e();
        dVar.g(LocaleController.getString(R.string.GalleryAccessAllowAccessButton), false, true);
        addView(dVar, k7.b6.q(-2, 44, 49));
        ph.d dVar2 = new ph.d(context, null, false);
        this.f25562b = dVar2;
        dVar2.e();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c");
        spannableStringBuilder.setSpan(new lq(R.drawable.outline_attach_camera_24, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) LocaleController.getString(R.string.GalleryAccessAllowAccessOpenCamera));
        dVar2.g(spannableStringBuilder, false, true);
        addView(dVar2, k7.b6.t(-2, 44, 49, 0, 8, 0, 0));
        ph.d dVar3 = new ph.d(context, null, false);
        this.f25563c = dVar3;
        dVar3.e();
        dVar3.setVisibility(8);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("c");
        ArrayList<Long> arrayList = a2.document_id;
        if (arrayList != null && !arrayList.isEmpty()) {
            long longValue = a2.document_id.get(0).longValue();
            this.d = longValue;
            spannableStringBuilder2.setSpan(new u5(longValue, (Paint.FontMetricsInt) null), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) "  ");
        } else {
            this.d = 0L;
        }
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.UseEmoji));
        dVar3.g(spannableStringBuilder2, false, true);
        addView(dVar3, k7.b6.t(-2, 44, 49, 0, 1, 0, 0));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824);
        ph.d dVar = this.f25561a;
        dVar.setUseWrapContent(true);
        ph.d dVar2 = this.f25562b;
        dVar2.setUseWrapContent(true);
        ph.d dVar3 = this.f25563c;
        dVar3.setUseWrapContent(true);
        dVar.measure(makeMeasureSpec, makeMeasureSpec2);
        dVar2.measure(makeMeasureSpec, makeMeasureSpec2);
        dVar3.measure(makeMeasureSpec, makeMeasureSpec2);
        dVar.setUseWrapContent(false);
        dVar2.setUseWrapContent(false);
        dVar3.setUseWrapContent(false);
        int max = Math.max(Math.max(dVar.getMeasuredWidth(), dVar2.getMeasuredWidth()), dVar3.getMeasuredWidth());
        dVar.getLayoutParams().width = AndroidUtilities.dp(80.0f) + max;
        dVar2.getLayoutParams().width = AndroidUtilities.dp(80.0f) + max;
        dVar3.getLayoutParams().width = AndroidUtilities.dp(80.0f) + max;
        super.onMeasure(i10, i11);
    }

    public void setUseAnEmojiVisible(boolean z4) {
        int i10;
        if (z4) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f25563c.setVisibility(i10);
    }
}
