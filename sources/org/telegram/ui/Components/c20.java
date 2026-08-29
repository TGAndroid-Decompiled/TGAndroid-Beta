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
public final class c20 extends LinearLayout {
    public final nh.d f27284a;
    public final nh.d f27285b;
    public final nh.d f27286c;
    public final long d;

    public c20(Context context, int i10) {
        super(context);
        int i11;
        TLRPC.TL_emojiList a2 = d9.a(i10);
        setOrientation(1);
        t9 t9Var = new t9(context);
        t9Var.setImageDrawable(new xi0(R.raw.utyan_gallery, AndroidUtilities.dp(110.0f), "utyan_gallery", AndroidUtilities.dp(110.0f)));
        if (!AndroidUtilities.isTablet()) {
            addView(t9Var, i7.f6.q(110, 110, 49));
        }
        TextView h = org.telegram.messenger.x3.h(context, 1, 20.0f);
        org.telegram.ui.th.s(org.telegram.ui.ActionBar.g6.G6, null, false, h, 1);
        h.setText(LocaleController.getString(R.string.GalleryAccessAllowAccess));
        h.setTypeface(AndroidUtilities.bold());
        addView(h, i7.f6.t(-2, -2, 49, 0, 15, 0, 7));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.th.s(org.telegram.ui.ActionBar.g6.f23045c7, null, false, textView, 1);
        if (UserConfig.getInstance(i10).isPremium()) {
            i11 = R.string.GalleryAccessAllowAccessTextPremium;
        } else {
            i11 = R.string.GalleryAccessAllowAccessTextNonPremium;
        }
        textView.setText(LocaleController.getString(i11));
        textView.setMaxWidth(AndroidUtilities.dp(260.0f));
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView, i7.f6.t(-2, -2, 49, 0, 0, 0, 14));
        nh.d dVar = new nh.d(context, null, true);
        this.f27284a = dVar;
        dVar.e();
        dVar.g(LocaleController.getString(R.string.GalleryAccessAllowAccessButton), false, true);
        addView(dVar, i7.f6.q(-2, 44, 49));
        nh.d dVar2 = new nh.d(context, null, false);
        this.f27285b = dVar2;
        dVar2.e();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c");
        spannableStringBuilder.setSpan(new iq(R.drawable.outline_attach_camera_24, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) LocaleController.getString(R.string.GalleryAccessAllowAccessOpenCamera));
        dVar2.g(spannableStringBuilder, false, true);
        addView(dVar2, i7.f6.t(-2, 44, 49, 0, 8, 0, 0));
        nh.d dVar3 = new nh.d(context, null, false);
        this.f27286c = dVar3;
        dVar3.e();
        dVar3.setVisibility(8);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("c");
        ArrayList<Long> arrayList = a2.document_id;
        if (arrayList != null && !arrayList.isEmpty()) {
            long longValue = a2.document_id.get(0).longValue();
            this.d = longValue;
            spannableStringBuilder2.setSpan(new y5(longValue, (Paint.FontMetricsInt) null), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) "  ");
        } else {
            this.d = 0L;
        }
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.UseEmoji));
        dVar3.g(spannableStringBuilder2, false, true);
        addView(dVar3, i7.f6.t(-2, 44, 49, 0, 1, 0, 0));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824);
        nh.d dVar = this.f27284a;
        dVar.setUseWrapContent(true);
        nh.d dVar2 = this.f27285b;
        dVar2.setUseWrapContent(true);
        nh.d dVar3 = this.f27286c;
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

    public void setUseAnEmojiVisible(boolean z10) {
        int i10;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f27286c.setVisibility(i10);
    }
}
