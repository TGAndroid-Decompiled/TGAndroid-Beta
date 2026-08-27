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

public final class u10 extends LinearLayout {

    public final lh.d f32944a;

    public final lh.d f32945b;

    public final lh.d f32946c;
    public final long d;

    public u10(Context context, int i10) {
        super(context);
        TLRPC.TL_emojiList tL_emojiListA = x8.a(i10);
        setOrientation(1);
        n9 n9Var = new n9(context);
        n9Var.setImageDrawable(new oi0(R.raw.utyan_gallery, AndroidUtilities.dp(110.0f), "utyan_gallery", AndroidUtilities.dp(110.0f)));
        if (!AndroidUtilities.isTablet()) {
            addView(n9Var, h7.z5.q(110, 110, 49));
        }
        TextView textViewH = org.telegram.messenger.y1.h(context, 1, 20.0f);
        org.telegram.ui.Cells.pa.s(org.telegram.ui.ActionBar.g6.G6, null, false, textViewH, 1);
        textViewH.setText(LocaleController.getString(R.string.GalleryAccessAllowAccess));
        textViewH.setTypeface(AndroidUtilities.bold());
        addView(textViewH, h7.z5.t(-2, -2, 49, 0, 15, 0, 7));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.Cells.pa.s(org.telegram.ui.ActionBar.g6.f23037c7, null, false, textView, 1);
        textView.setText(LocaleController.getString(UserConfig.getInstance(i10).isPremium() ? R.string.GalleryAccessAllowAccessTextPremium : R.string.GalleryAccessAllowAccessTextNonPremium));
        textView.setMaxWidth(AndroidUtilities.dp(260.0f));
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView, h7.z5.t(-2, -2, 49, 0, 0, 0, 14));
        lh.d dVar = new lh.d(context, null, true);
        this.f32944a = dVar;
        dVar.e();
        dVar.g(LocaleController.getString(R.string.GalleryAccessAllowAccessButton), false, true);
        addView(dVar, h7.z5.q(-2, 44, 49));
        lh.d dVar2 = new lh.d(context, null, false);
        this.f32945b = dVar2;
        dVar2.e();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c");
        spannableStringBuilder.setSpan(new cq(R.drawable.outline_attach_camera_24, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) LocaleController.getString(R.string.GalleryAccessAllowAccessOpenCamera));
        dVar2.g(spannableStringBuilder, false, true);
        addView(dVar2, h7.z5.t(-2, 44, 49, 0, 8, 0, 0));
        lh.d dVar3 = new lh.d(context, null, false);
        this.f32946c = dVar3;
        dVar3.e();
        dVar3.setVisibility(8);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("c");
        ArrayList<Long> arrayList = tL_emojiListA.document_id;
        if (arrayList == null || arrayList.isEmpty()) {
            this.d = 0L;
        } else {
            long jLongValue = tL_emojiListA.document_id.get(0).longValue();
            this.d = jLongValue;
            spannableStringBuilder2.setSpan(new t5(jLongValue, (Paint.FontMetricsInt) null), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) "  ");
        }
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.UseEmoji));
        dVar3.g(spannableStringBuilder2, false, true);
        addView(dVar3, h7.z5.t(-2, 44, 49, 0, 1, 0, 0));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), Integer.MIN_VALUE);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824);
        lh.d dVar = this.f32944a;
        dVar.setUseWrapContent(true);
        lh.d dVar2 = this.f32945b;
        dVar2.setUseWrapContent(true);
        lh.d dVar3 = this.f32946c;
        dVar3.setUseWrapContent(true);
        dVar.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        dVar2.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        dVar3.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        dVar.setUseWrapContent(false);
        dVar2.setUseWrapContent(false);
        dVar3.setUseWrapContent(false);
        int iMax = Math.max(Math.max(dVar.getMeasuredWidth(), dVar2.getMeasuredWidth()), dVar3.getMeasuredWidth());
        dVar.getLayoutParams().width = AndroidUtilities.dp(80.0f) + iMax;
        dVar2.getLayoutParams().width = AndroidUtilities.dp(80.0f) + iMax;
        dVar3.getLayoutParams().width = AndroidUtilities.dp(80.0f) + iMax;
        super.onMeasure(i10, i11);
    }

    public void setUseAnEmojiVisible(boolean z10) {
        this.f32946c.setVisibility(z10 ? 0 : 8);
    }
}
