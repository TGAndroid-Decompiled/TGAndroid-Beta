package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class n00 extends FrameLayout {
    public final o00 f36422a;

    public n00(o00 o00Var, Context context) {
        super(context);
        int i10;
        String string;
        this.f36422a = o00Var;
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.msg_limit_links);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false)));
        addView(imageView, k7.b6.d(54, 44.0f, 49, 0.0f, 22.0f, 0.0f, 0.0f));
        ih.s sVar = new ih.s(context);
        sVar.setTypeface(AndroidUtilities.bold());
        sVar.setTextSize(1, 20.0f);
        int i11 = org.telegram.ui.ActionBar.j6.f20012j5;
        sVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        sVar.setGravity(1);
        sVar.setText(o00Var.R(sVar));
        MessagesController.DialogFilter dialogFilter = o00Var.U;
        if (dialogFilter != null && dialogFilter.title_noanimate) {
            i10 = 26;
        } else {
            i10 = 0;
        }
        sVar.h = i10;
        addView(sVar, k7.b6.d(-2, -2.0f, 49, 20.0f, 84.0f, 20.0f, 0.0f));
        TextView textView = new TextView(context);
        if (o00Var.V.isEmpty()) {
            string = LocaleController.getString(R.string.FolderLinkShareSubtitleEmpty);
        } else {
            string = LocaleController.getString(R.string.FolderLinkShareSubtitle);
        }
        textView.setText(string);
        textView.setLines(2);
        textView.setGravity(1);
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        addView(textView, k7.b6.d(-2, -2.0f, 49, 30.0f, 117.0f, 30.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.msg_close);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.C6, false), PorterDuff.Mode.MULTIPLY));
        imageView2.setOnClickListener(new a(this, 23));
        addView(imageView2, k7.b6.d(48, 48.0f, 53, 0.0f, -4.0f, 2.0f, 0.0f));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(171.0f), 1073741824));
    }
}
