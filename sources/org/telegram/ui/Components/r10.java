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
public final class r10 extends LinearLayout {
    public final kh.d f32054a;
    public final kh.d f32055b;
    public final kh.d f32056c;
    public final long d;

    public r10(Context context, int i9) {
        super(context);
        int i10;
        TLRPC.TL_emojiList a2 = y8.a(i9);
        setOrientation(1);
        o9 o9Var = new o9(context);
        o9Var.setImageDrawable(new mi0(R.raw.utyan_gallery, AndroidUtilities.dp(110.0f), "utyan_gallery", AndroidUtilities.dp(110.0f)));
        if (!AndroidUtilities.isTablet()) {
            addView(o9Var, g7.e6.q(110, 110, 49));
        }
        TextView g10 = org.telegram.messenger.l0.g(context, 1, 20.0f);
        j3.r0.w(org.telegram.ui.ActionBar.f6.G6, null, false, g10, 1);
        g10.setText(LocaleController.getString(R.string.GalleryAccessAllowAccess));
        g10.setTypeface(AndroidUtilities.bold());
        addView(g10, g7.e6.t(-2, -2, 49, 0, 15, 0, 7));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 14.0f);
        j3.r0.w(org.telegram.ui.ActionBar.f6.f22984c7, null, false, textView, 1);
        if (UserConfig.getInstance(i9).isPremium()) {
            i10 = R.string.GalleryAccessAllowAccessTextPremium;
        } else {
            i10 = R.string.GalleryAccessAllowAccessTextNonPremium;
        }
        textView.setText(LocaleController.getString(i10));
        textView.setMaxWidth(AndroidUtilities.dp(260.0f));
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView, g7.e6.t(-2, -2, 49, 0, 0, 0, 14));
        kh.d dVar = new kh.d(context, null, true);
        this.f32054a = dVar;
        dVar.e();
        dVar.g(LocaleController.getString(R.string.GalleryAccessAllowAccessButton), false, true);
        addView(dVar, g7.e6.q(-2, 44, 49));
        kh.d dVar2 = new kh.d(context, null, false);
        this.f32055b = dVar2;
        dVar2.e();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c");
        spannableStringBuilder.setSpan(new eq(R.drawable.outline_attach_camera_24, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) LocaleController.getString(R.string.GalleryAccessAllowAccessOpenCamera));
        dVar2.g(spannableStringBuilder, false, true);
        addView(dVar2, g7.e6.t(-2, 44, 49, 0, 8, 0, 0));
        kh.d dVar3 = new kh.d(context, null, false);
        this.f32056c = dVar3;
        dVar3.e();
        dVar3.setVisibility(8);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("c");
        ArrayList<Long> arrayList = a2.document_id;
        if (arrayList != null && !arrayList.isEmpty()) {
            long longValue = a2.document_id.get(0).longValue();
            this.d = longValue;
            spannableStringBuilder2.setSpan(new t5(longValue, (Paint.FontMetricsInt) null), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) "  ");
        } else {
            this.d = 0L;
        }
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.UseEmoji));
        dVar3.g(spannableStringBuilder2, false, true);
        addView(dVar3, g7.e6.t(-2, 44, 49, 0, 1, 0, 0));
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824);
        kh.d dVar = this.f32054a;
        dVar.setUseWrapContent(true);
        kh.d dVar2 = this.f32055b;
        dVar2.setUseWrapContent(true);
        kh.d dVar3 = this.f32056c;
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
        super.onMeasure(i9, i10);
    }

    public void setUseAnEmojiVisible(boolean z10) {
        int i9;
        if (z10) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        this.f32056c.setVisibility(i9);
    }
}
